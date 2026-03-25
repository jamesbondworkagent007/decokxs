package org.apache.http.client.entity;

import o.InterfaceC59576zje;

/* JADX INFO: loaded from: classes24.dex */
public class DeflateDecompressingEntity extends DecompressingEntity {
    public DeflateDecompressingEntity(InterfaceC59576zje interfaceC59576zje) {
        super(interfaceC59576zje, DeflateInputStreamFactory.getInstance());
    }
}
