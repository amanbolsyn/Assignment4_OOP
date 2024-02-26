import java.util.Scanner;

interface ManufactureStrategy {
    void manufacture();
}

class MetalFormingStrategy implements ManufactureStrategy {
    @Override
    public void manufacture() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You choose Metal Forming manufacturing method");
        System.out.print("Input quantities: ");
        double quantities = scanner.nextDouble();
        double cost = quantities * 657.00;
        System.out.println("Total amount: $" + cost + " ");
        System.out.println("");
    }
}

class MaterialRemovalStrategy implements ManufactureStrategy {
    @Override
    public void manufacture() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You choose Material Removal manufacturing method.");
        System.out.print("Input quantities: ");
        double quantities = scanner.nextDouble();
        double cost = quantities * 345.00;
        System.out.println("Total amount: $" + cost + " ");
        System.out.println("");
    }
}

class SolidificationStrategy implements ManufactureStrategy {
    @Override
    public void manufacture() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You choose Solidification manufacturing method");
        System.out.print("Input quantities: ");
        double quantities = scanner.nextDouble();
        double cost = quantities * 567.00;
        System.out.println("Total amount: $" + cost + " ");
        System.out.println("");
    }
}

class PowderMetalStrategy implements ManufactureStrategy {
    @Override
    public void manufacture() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You choose Powder Metallurgy manufacturing method");
        System.out.print("Input quantities: ");
        double quantities = scanner.nextDouble();
        double cost = quantities * 1035.00;
        System.out.println("Total amount: $" + cost + " ");
        System.out.println("");
    }
}

class ManufactureContext {
    private ManufactureStrategy manufactureStrategy;

    public void setManufactureStrategy(ManufactureStrategy  manufactureStrategy) {
        this.manufactureStrategy = manufactureStrategy;
    }

    public void executeManufacture() {
        manufactureStrategy.manufacture();
    }
}

public class Main {
    public static void main(String[] args) {
        ManufactureContext context = new ManufactureContext();
        while(true){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Choose manufacturing method of metal shaping. ");
            System.out.println("1. Metal Forming Process");
            System.out.println("2. Material removal & Machining ");
            System.out.println("3. На Solidification Process");
            System.out.println("4. Powder Metallurgy");
            System.out.println("5. Finish calculations");
            System.out.print("Enter number between(1-4): ");

            int choice = scanner.nextInt();

            if(choice == 1) {
                context.setManufactureStrategy(new MetalFormingStrategy());
            } else if(choice == 2) {
                context.setManufactureStrategy(new MaterialRemovalStrategy());
            } else if(choice == 3) {
                context.setManufactureStrategy(new SolidificationStrategy());
            } else if(choice ==4){
                context.setManufactureStrategy(new PowderMetalStrategy());
            } else if(choice == 5){
                System.out.println("Finish calculations");
                break;
            } else {
                System.out.println("Unknown command");
            }
            context.executeManufacture();
        }
    }
}