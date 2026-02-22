package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.Workable;
import java.util.List;

public class MachineServiceImpl implements MachineService {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            return List.of(new Bulldozer());
        } else if (type == Truck.class) {
            return List.of(new Truck());
        } else if (type == Excavator.class) {
            return List.of(new Excavator());
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
