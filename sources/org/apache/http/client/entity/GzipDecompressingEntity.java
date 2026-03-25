package org.apache.http.client.entity;

import o.InterfaceC59576zje;

/* JADX INFO: loaded from: classes24.dex */
public class GzipDecompressingEntity extends DecompressingEntity {
    public GzipDecompressingEntity(InterfaceC59576zje interfaceC59576zje) {
        super(interfaceC59576zje, GZIPInputStreamFactory.getInstance());
    }
}
