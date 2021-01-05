public class Pro extends Robot{
    private static final Integer MAX_LEVEL_CAPACITY = 12;
    private static final Integer MAX_TRANSPORT_CAPACITY = 8;

    public Pro(String name, Integer charge){
        super(name, charge, MAX_LEVEL_CAPACITY, MAX_TRANSPORT_CAPACITY);
    }

    @Override
    public Integer chargeAndLoad(Integer chargeUnit, Integer boxToLoad){
        Integer load = super.chargeAndLoad(chargeUnit, boxToLoad);

        int counter = 0;
        Integer remain = load;
        while (this.charge > 0 && remain > 0){
            if (counter < 5){
                this.charge--;
            }else{
                if (this.charge > 1) this.charge -= 2;
                else{
                    System.out.println(this.name + " loaded: " + (load - remain) + " box(es), charge after work: " + this.charge);
                    return boxToLoad - load + remain;
                }
            }
            remain--;
            counter++;
        }

        System.out.println(this.name + " loaded: " + (load - remain) + " box(es), charge after work: " + this.charge);

        return boxToLoad - load + remain;
    }
}
