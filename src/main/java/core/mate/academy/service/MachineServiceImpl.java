package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.Workable;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            List<Bulldozer> bulldozers = new BulldozerProducer().get();
            return new ArrayList<>(bulldozers);
        }
        if (type == Truck.class) {
            List<Truck> trucks = new TruckProducer().get();
            return new ArrayList<>(trucks);
        }
        if (type == Excavator.class) {
            List<Excavator> excavators = new ExcavatorProducer().get();
            return new ArrayList<>(excavators);
        }
        return List.of();
    }

    @Override
    public void fill(List<? super Workable> machines, Workable value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Workable> machines) {
        for (Workable m : machines) {
            m.doWork();
        }
    }
}
