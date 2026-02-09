package org.example;

import net.sf.jasperreports.engine.JRVirtualizable;
import net.sf.jasperreports.engine.fill.
        JRVirtualizationContext;

import net.sf.jasperreports.engine.fill.StoreVirtualizer;

import net.sf.jasperreports.engine.util.JRConcurrentSwapFile;

import net.sf.jasperreports.engine.util.SwapFileVirtualizerStore;

import net.sf.jasperreports.engine.virtualization.VirtualizationInput;

import java.io.IOException;

import java.io.InputStream;

public class AVirtual extends VirtualizationInput {
    public AVirtual(InputStream in, JRVirtualizationContext virtualizationContext) throws IOException {
        super(in, virtualizationContext);

        virtualizationContext.setVirtualizer(new StoreVirtualizer(4,new SwapFileVirtualizerStore(new JRConcurrentSwapFile(in.toString(),0,6),true)));

        virtualizationContext.getVirtualizer().virtualizeData(aVoid());

    }

    JRVirtualizable   aVoid(){

       return new JRVirtualizable() {
           @Override
           public String getUID() {
               return null;
           }

           @Override
           public void ensureVirtualData() {

           }

           @Override
           public void setVirtualData(Object o) {

           }

           @Override
           public Object getVirtualData() {
               return new Object();
           }

           @Override
           public void removeVirtualData() {

           }

           @Override
           public void beforeExternalization() {

           }

           @Override
           public void afterExternalization() {

           }

           @Override
           public void afterInternalization() {

           }

           @Override
           public JRVirtualizationContext getContext() {
               return null;
           }
       } ;
    }
}
