/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chortitzer.industria.zebra.util;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Industria
 */
public class Utils {

    public static void rawPrint(String zplCommand) {
        try {
            PrintService[] services = PrintServiceLookup.lookupPrintServices(null, null);
            PrintService printService = null;

            for (int i = 0; i < services.length; i++) {
                if (services[i].getName().equals("ZDesigner ZM400 200 dpi (ZPL)")) {
                    printService = services[i];
                }
            }
            if (printService != null) {

// convertimos el comando a bytes  
                byte[] by = zplCommand.getBytes();
                DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
                Doc doc = new SimpleDoc(by, flavor, null);

// creamos el printjob  
                DocPrintJob job = printService.createPrintJob();

// imprimimos  
                job.print(doc, null);

            } else {
                System.out.println("Printer not found!");
            }

        } catch (PrintException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void messageBox(String s) {
        JOptionPane.showMessageDialog(new JFrame(), s, "Dialog",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
