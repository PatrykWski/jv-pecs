package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

public class BulldozerProducer implements MachineProducer {

    @Override
    public List<? extends Machine> get() {
        return List.of(new Bulldozer(), new Truck(), new Excavator());
    }
}
