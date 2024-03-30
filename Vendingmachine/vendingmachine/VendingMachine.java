package vendingmachine;

import coins.Coins;
import inventory.Inventory;
import java.util.*;

public class VendingMachine {
    private VendingMachineState vendingMachineState;
    private Inventory inventory;
    private List<Coins> coinList;

    public VendingMachine() {
        vendingMachineState = new VendingMachineState();
        inventory = new Inventory(10);
        coinList = new ArrayList<>();
    }

    public VendingMachineState getVendingMachineState() {
        return this.vendingMachineState;
    }

    public void setVendingMachinState(VendingMachineState vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public Inventory getInventory() {
        return this.inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coins> getCoinList() {
        return this.coinList;
    }

    public void setCoinList(List<Coins> coinList) {
        this.coinList = coinList;
    }
   
}
