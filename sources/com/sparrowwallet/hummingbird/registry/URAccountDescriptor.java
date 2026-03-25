package com.sparrowwallet.hummingbird.registry;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o.C5205It;
import o.C5211Iz;
import o.IE;
import o.IL;

/* JADX INFO: loaded from: classes17.dex */
public class URAccountDescriptor extends RegistryItem {
    public static final long MASTER_FINGERPRINT_KEY = 1;
    public static final long OUTPUT_DESCRIPTORS_KEY = 2;
    private final byte[] masterFingerprint;
    private final List<UROutputDescriptor> outputDescriptors;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] getMasterFingerprint() {
        return this.masterFingerprint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<UROutputDescriptor> getOutputDescriptors() {
        return this.outputDescriptors;
    }

    public URAccountDescriptor(byte[] bArr, List<UROutputDescriptor> list) {
        this.masterFingerprint = Arrays.copyOfRange(bArr, bArr.length - 4, bArr.length);
        this.outputDescriptors = list;
    }

    @Override // com.sparrowwallet.hummingbird.registry.CborSerializable
    public C5211Iz toCbor() {
        IE ie = new IE();
        ie.EZpvd(new IL(1L), new IL(new BigInteger(1, this.masterFingerprint)));
        C5205It c5205It = new C5205It();
        Iterator<UROutputDescriptor> it = this.outputDescriptors.iterator();
        while (it.hasNext()) {
            C5211Iz cbor = it.next().toCbor();
            C5211Iz c5211IzDjBIcL = cbor.djBIcL() == null ? cbor : cbor.djBIcL();
            while (c5211IzDjBIcL.djBIcL() != null) {
                c5211IzDjBIcL = c5211IzDjBIcL.djBIcL();
            }
            c5211IzDjBIcL.EZpvd(RegistryType.OUTPUT_DESCRIPTOR.getTag().intValue());
            c5205It.EZpvd(cbor);
        }
        ie.EZpvd(new IL(2L), c5205It);
        return ie;
    }

    @Override // com.sparrowwallet.hummingbird.registry.RegistryItem
    public RegistryType getRegistryType() {
        return RegistryType.ACCOUNT_DESCRIPTOR;
    }

    public static URAccountDescriptor fromCbor(C5211Iz c5211Iz) {
        IE ie = (IE) c5211Iz;
        byte[] bArrBigIntegerToBytes = RegistryItem.bigIntegerToBytes(((IL) ie.copydefault(new IL(1L))).KWHzl(), 4);
        C5205It c5205It = (C5205It) ie.copydefault(new IL(2L));
        ArrayList arrayList = new ArrayList(c5205It.AEQbTJ().size());
        Iterator<C5211Iz> it = c5205It.AEQbTJ().iterator();
        while (it.hasNext()) {
            arrayList.add(UROutputDescriptor.fromCbor(it.next()));
        }
        return new URAccountDescriptor(bArrBigIntegerToBytes, arrayList);
    }
}
