public abstract class Robot{
    private final Integer maxLevelCapacity;
    private final Integer maxTransportCapacity;
    protected Integer charge;
    protected String name;

    public Robot(String name, Integer charge, Integer maxLevelCapacity, Integer maxTransportCapacity){
        this.maxLevelCapacity = maxLevelCapacity;
        this.maxTransportCapacity = maxTransportCapacity;
        this.name = name;
        this.charge = charge;
    }

    public Integer chargeAndLoad(Integer chargeUnit, Integer boxToLoad){
        this.charge += chargeUnit;
        if (this.charge > this.maxLevelCapacity) this.charge = this.maxLevelCapacity;

        return (boxToLoad > this.maxTransportCapacity) ? this.maxTransportCapacity : boxToLoad;
    }
}
