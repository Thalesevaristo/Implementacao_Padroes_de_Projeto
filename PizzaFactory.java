public abstract class PizzaFactory {
  
  protect Pizza pizza;
  
  public abstract void criarPizza( String tipo );
  
  public Pizza delivery(){
    
    return pizza;
  }
}
