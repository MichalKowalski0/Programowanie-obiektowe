public class Saw extends WorkTool {
    public Saw(String name, int productionYear) {
        super(name, productionYear);
    }

    @Override
    public void use() {
        System.out.println("użycie piły do ciecia se");
    }
}
