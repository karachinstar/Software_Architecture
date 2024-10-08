package org.example.Core;

import org.example.Interfaces.ICarrierRepo;
import org.example.Interfaces.ICashRepo;
import org.example.Models.Carrier;
import org.example.Models.Ticket;
import org.example.Models.User;
import org.example.Services.CarrierRepository;
import org.example.Services.CashRepository;

/**
 * Класс - провайдер для взаимодействия с банком и базой перевозчиков
 */
public class CashProvider {

    private long cardNumber;
    private boolean isAuthorized = false;
    private ICarrierRepo carrierRepository;
    private ICashRepo cashRepository;

    /**
     * Конструктор класса
     */
    public CashProvider() {
        // Класс репозитория находится в единственном экземпляре для того, чтобы не
        // создавать несколько подключений
        // к базе данных. Реализация паттерна Синглтон.
        this.carrierRepository = CarrierRepository.getCarrierRepository();
        this.cashRepository = CashRepository.getCashRepository();
    }

    /**
     * Метод покупки билета
     *
     * @param ticket билет
     * @return результат выполнения операции
     * @throws RuntimeException
     */
    // подсказка Carrier carrier = carrierRepository.read(1);
    // подсказка return cashRepository.transaction(ticket.getPrice(), cardNumber,
    // carrier.getCardNumber());
    public boolean buy(Ticket ticket) {
        if (isAuthorized) {
            Carrier carrier = carrierRepository.read(1);
            return cashRepository.transaction(ticket.getPrice(), cardNumber, carrier.getCardNumber());
        }
        return false;
    }

    /**
     * Метод авторизации клиента. Здесь должно быть реализовано обращение к банку
     * для подтверждения личности клиента.
     *
     * @param client
     */
    public void authorization(User client) {
        cardNumber = client.getCardNumber();
        isAuthorized = true;
    }

}
