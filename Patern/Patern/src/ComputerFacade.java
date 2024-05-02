public class ComputerFacade implements Detail {
    private final Map<Type, Details> implementations;
    
    public ComputerFacade() {
        implementations = new EnumeratedMap<Type>();
        implementations.add(Type.CPU, new CPU())
    }
    
    public void start(Type type) {
        implementations.get(type).start();
    }
}