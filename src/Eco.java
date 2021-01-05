public class Eco extends Robot{
    private static final Integer MAX_LEVEL_CAPACITY = 4;
    private static final Integer MAX_TRANSPORT_CAPACITY = 6;

    public Eco(String name, Integer charge){
        super(name, charge, MAX_LEVEL_CAPACITY, MAX_TRANSPORT_CAPACITY);
    }

    @Override
    public Integer chargeAndLoad(Integer chargeUnit, Integer boxToLoad){
        Integer load = super.chargeAndLoad(chargeUnit, boxToLoad);

        if (load > this.charge * 2) load = this.charge * 2;
        this.charge -= (int) Math.ceil((double)load / 2);

        System.out.println(this.name + " loaded: " + load + " box(es), charge after work: " + this.charge);

        return boxToLoad - load;
    }
}
