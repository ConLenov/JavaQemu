package net.sourceforge.javaqemu.view;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.sourceforge.javaqemu.control.FileControl;

public class NetworkTapWorkerView extends JFileChooserView {

    private static final long serialVersionUID = 1L;

    private JPanel windowContent;

    private GridLayout gridLayout;

    private JCheckBox isEnabled;

    private JLabel temp;

    private JLabel vlanDescription;

    private JComboBox<String> vlan;

    private JLabel nameDescription;

    private JTextField name;

    private JLabel fdDescription;

    private JTextField fd;

    private JButton scriptChooser;

    private JTextField script;

    private JButton downscriptChooser;

    private JTextField downscript;

    private JButton helperChooser;

    private JTextField helper;

    private JButton eraseButton;

    private JButton okButton;

    public NetworkTapWorkerView(FileControl myfile, int position) {
        super(null);

        windowContent = new JPanel();

        this.setJpanel(windowContent);

        gridLayout = new GridLayout(8, 2);

        windowContent.setLayout(gridLayout);

        isEnabled = new JCheckBox("Enable this option!");

        windowContent.add(this.isEnabled);

        temp = new JLabel();

        windowContent.add(temp);

        vlanDescription = new JLabel("Choose the VLAN:");

        windowContent.add(vlanDescription);

        String[] numberOptions = {"", "0", "1", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18",
            "19", "20", "21", "22", "23", "24", "25", "26", "27", "28",
            "29", "30", "31", "32", "33", "34", "35", "36", "37", "38",
            "39", "40", "41", "42", "43", "44", "45", "46", "47", "48",
            "49", "50", "51", "52", "53", "54", "55", "56", "57", "58",
            "59", "60", "61", "62", "63", "64", "65", "66", "67", "68",
            "69", "70", "71", "72", "73", "74", "75", "76", "77", "78",
            "79", "80", "81", "82", "83", "84", "85", "86", "87", "88",
            "89", "90", "91", "92", "93", "94", "95", "96", "97", "98",
            "99", "100"};

        this.vlan = new JComboBox<String>(numberOptions);

        windowContent.add(vlan);

        nameDescription = new JLabel("Choose the name or id:");

        windowContent.add(this.nameDescription);

        name = new JTextField();

        windowContent.add(this.name);

        fdDescription = new JLabel("Choose the fd:");

        windowContent.add(fdDescription);

        fd = new JTextField();

        windowContent.add(fd);

        scriptChooser = new JDoubledLineButton("Choose the network configure script file:",
                " (or write 'no' to disable it!)");

        windowContent.add(scriptChooser);

        script = new JTextField();

        windowContent.add(script);

        downscriptChooser = new JDoubledLineButton("Choose the network deconfigure script file:",
                " (or write 'no' to disable it!)");

        windowContent.add(downscriptChooser);

        downscript = new JTextField();

        windowContent.add(downscript);

        helperChooser = new JButton("Choose the network helper to configure the TAP interface:");

        windowContent.add(helperChooser);

        helper = new JTextField();

        windowContent.add(helper);

        okButton = new JButton("OK");

        eraseButton = new JButton("Erase");

        windowContent.add(okButton);

        windowContent.add(eraseButton);

        this.setContentPane(windowContent);

        this.setTitle("JavaQemu - Network Tap Choice");

        switch (position) {
            case 1:
                if (myfile.getMymodel().getFirstNetworkExtraOption() != null) {
                    if (this.contains(myfile.getMymodel()
                            .getFirstNetworkExtraOption())) {
                        this.buildMe(myfile.getMymodel()
                                .getFirstNetworkExtraOption());
                        this.isEnabled.setSelected(true);
                    }
                }
                break;
            case 2:
                if (myfile.getMymodel().getSecondNetworkExtraOption() != null) {
                    if (this.contains(myfile.getMymodel()
                            .getSecondNetworkExtraOption())) {
                        this.buildMe(myfile.getMymodel()
                                .getSecondNetworkExtraOption());
                        this.isEnabled.setSelected(true);
                    }
                }
                break;
            case 3:
                if (myfile.getMymodel().getThirdNetworkExtraOption() != null) {
                    if (this.contains(myfile.getMymodel().getThirdNetworkExtraOption())) {
                        this.buildMe(myfile.getMymodel().getThirdNetworkExtraOption());
                        this.isEnabled.setSelected(true);
                    }
                }
                break;
            case 4:
                if (myfile.getMymodel().getFourthNetworkExtraOption() != null) {
                    if (this.contains(myfile.getMymodel().getFourthNetworkExtraOption())) {
                        this.buildMe(myfile.getMymodel().getFourthNetworkExtraOption());
                        this.isEnabled.setSelected(true);
                    }
                }
                break;
            case 5:
                if (myfile.getMymodel().getFifthNetworkExtraOption() != null) {
                    if (this.contains(myfile.getMymodel().getFifthNetworkExtraOption())) {
                        this.buildMe(myfile.getMymodel().getFifthNetworkExtraOption());
                        this.isEnabled.setSelected(true);
                    }
                }
                break;
            case 6:
                if (myfile.getMymodel().getSixthNetworkExtraOption() != null) {
                    if (this.contains(myfile.getMymodel().getSixthNetworkExtraOption())) {
                        this.buildMe(myfile.getMymodel().getSixthNetworkExtraOption());
                        this.isEnabled.setSelected(true);
                    }
                }
                break;
            case 7:
                if (myfile.getMymodel().getSeventhNetworkExtraOption() != null) {
                    if (this.contains(myfile.getMymodel().getSeventhNetworkExtraOption())) {
                        this.buildMe(myfile.getMymodel().getSeventhNetworkExtraOption());
                        this.isEnabled.setSelected(true);
                    }
                }
                break;
            case 8:
                if (myfile.getMymodel().getEighthNetworkExtraOption() != null) {
                    if (this.contains(myfile.getMymodel().getEighthNetworkExtraOption())) {
                        this.buildMe(myfile.getMymodel().getEighthNetworkExtraOption());
                        this.isEnabled.setSelected(true);
                    }
                }
                break;
            case 9:
                if (myfile.getMymodel().getNinthNetworkExtraOption() != null) {
                    if (this.contains(myfile.getMymodel().getNinthNetworkExtraOption())) {
                        this.buildMe(myfile.getMymodel().getNinthNetworkExtraOption());
                        this.isEnabled.setSelected(true);
                    }
                }
                break;
            case 10:
                if (myfile.getMymodel().getTenthNetworkExtraOption() != null) {
                    if (this.contains(myfile.getMymodel().getTenthNetworkExtraOption())) {
                        this.buildMe(myfile.getMymodel().getTenthNetworkExtraOption());
                        this.isEnabled.setSelected(true);
                    }
                }
                break;
            default:
                break;
        }

        this.rechecks();
    }

    private void rechecks() {
        this.pack();
        this.repaint();
    }

    public void configureListener(ActionListener listener) {
        eraseButton.addActionListener(listener);
        okButton.addActionListener(listener);
        scriptChooser.addActionListener(listener);
        downscriptChooser.addActionListener(listener);
        helperChooser.addActionListener(listener);
    }

    public void configureStandardMode() {
        eraseButton.setActionCommand("eraseButton");
        okButton.setActionCommand("okButton");
        scriptChooser.setActionCommand("scriptChooser");
        downscriptChooser.setActionCommand("downscriptChooser");
        helperChooser.setActionCommand("helperChooser");
    }

    private void buildMe(String optionString) {
        String options[] = optionString.split(",");
        for (String option : options) {
            if (option.startsWith("vlan=")) {
                this.vlan
                        .setSelectedItem(option.substring(option.indexOf("=") + 1));
            } else if (option.startsWith("name=")) {
                this.name.setText(option.substring(option.indexOf("=") + 1));
            } else if (option.startsWith("fd=")) {
                this.fd.setText(option.substring(option.indexOf("=") + 1));
            } else if (option.startsWith("script=")) {
                this.script.setText(option.substring(option.indexOf("=") + 1));
            } else if (option.startsWith("downscript=")) {
                this.downscript
                        .setText(option.substring(option.indexOf("=") + 1));
            } else if (option.startsWith("helper=")) {
                this.helper
                        .setText(option.substring(option.indexOf("=") + 1));
            }
        }
    }

    public JCheckBox getIsEnabled() {
        return isEnabled;
    }

    public JComboBox<String> getVlan() {
        return vlan;
    }

    public JTextField getNameContents() {
        return name;
    }

    private boolean contains(String option) {
        if (option.contains("tap")) {
            return true;
        }
        return false;
    }

    public JTextField getFd() {
        return fd;
    }

    public JTextField getScript() {
        return script;
    }

    public JTextField getDownscript() {
        return downscript;
    }

    public JTextField getHelper() {
        return helper;
    }
}
