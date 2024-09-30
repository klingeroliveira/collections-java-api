package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> agendaEventosMap;

    public AgendaEventos() {
        this.agendaEventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nomeEvento, Set<String> atracoes) {
        Evento evento = new Evento(nomeEvento, atracoes);
        this.agendaEventosMap.put(data, evento);
    }

    public Map<LocalDate, Evento> obterAgendaOrdenada() {
        Map<LocalDate, Evento> mapOrdenado = new TreeMap<>(this.agendaEventosMap);
        return mapOrdenado;
    }

    public void exibirAgenda() {
        System.out.println(obterAgendaOrdenada());
    }

    public Map<LocalDate, Evento> obterProximoEvento() {
        Map<LocalDate, Evento> agenda = obterAgendaOrdenada();
        LocalDate data = LocalDate.now();
        LocalDate dataEvento = null;
        Evento evento = null;

        for(Map.Entry<LocalDate, Evento> eventoEntry : agenda.entrySet()) {
            if (eventoEntry.getKey().equals(data) || eventoEntry.getKey().isAfter(data)) {
                dataEvento = eventoEntry.getKey();
                evento = eventoEntry.getValue();
                break;
            }
        }

        Map<LocalDate, Evento> proximoEvento = new HashMap<>();
        proximoEvento.put(dataEvento, evento);

        return proximoEvento;
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        Set<String> atracoes = new HashSet<>();

        atracoes.add("Atracao 1");
        atracoes.add("Atracao 2");
        atracoes.add("Atracao 3");

        Set<String> atracoesOrdenadas = new TreeSet<>(atracoes);

        agendaEventos.adicionarEvento(LocalDate.of(2022, 3, 23), "Evento 1", atracoesOrdenadas);
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 29), "Evento 2", atracoesOrdenadas);
        agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 20), "Evento 3", atracoesOrdenadas);
        agendaEventos.adicionarEvento(LocalDate.of(2023, 3, 30), "Evento 4", atracoesOrdenadas);

        agendaEventos.exibirAgenda();

        System.out.println(agendaEventos.obterProximoEvento());

    }
}
