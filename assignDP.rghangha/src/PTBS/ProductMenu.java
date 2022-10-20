package PTBS;

import javax.swing.*;

abstract public class ProductMenu extends JDialog {

    Product theProduct;
    boolean bLogout = true;

    JComboBox<Object> tradingCombox = new JComboBox<Object>();

    abstract void showMenu();

    abstract void showAddButton();

    abstract void showViewButton();

    abstract void showRadioButton();

    abstract void showLabels();

    abstract void showComboxes();

    boolean ifLogout() {
        return bLogout;
    }

}
