public abstract class WorkTool {
    private String name;
    private int productionYear;

    public WorkTool(String name, int productionYear) {
        this.name = name;
        this.productionYear = productionYear;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getProductionYear() {
        return productionYear;
    }
    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public abstract void use();

    @Override
    public String toString() {
        return "WorkTool{" +
                "name=" + name + ", productionYear: " + productionYear +
                '}';
    }
}
