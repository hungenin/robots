public class Mac extends Robot{
    private static final Integer MAX_LEVEL_CAPACITY = 10;
    private static final Integer MAX_TRANSPORT_CAPACITY = 10;

    public Mac(String name, Integer charge){
        super(name, charge, MAX_LEVEL_CAPACITY, MAX_TRANSPORT_CAPACITY);
    }

    @Override
    public Integer chargeAndLoad(Integer chargeUnit, Integer boxToLoad){
        Integer load = super.chargeAndLoad(chargeUnit, boxToLoad);

        if (load > this.charge) load = this.charge;
        this.charge -= load;

        System.out.println(this.name + " loaded: " + load + " box(es), charge after work: " + this.charge);

        return boxToLoad - load;
    }
}
