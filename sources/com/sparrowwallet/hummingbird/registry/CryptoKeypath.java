package com.sparrowwallet.hummingbird.registry;

import com.sparrowwallet.hummingbird.registry.pathcomponent.PathComponent;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.StringJoiner;
import o.C5211Iz;
import o.IE;
import o.IL;

/* JADX INFO: loaded from: classes17.dex */
public class CryptoKeypath extends RegistryItem {
    public static final int COMPONENTS_KEY = 1;
    public static final int DEPTH_KEY = 3;
    public static final int SOURCE_FINGERPRINT_KEY = 2;
    private final List<PathComponent> components;
    private final Integer depth;
    private final byte[] sourceFingerprint;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<PathComponent> getComponents() {
        return this.components;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Integer getDepth() {
        return this.depth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] getSourceFingerprint() {
        return this.sourceFingerprint;
    }

    public CryptoKeypath(List<PathComponent> list, byte[] bArr) {
        this(list, bArr, null);
    }

    public CryptoKeypath(List<PathComponent> list, byte[] bArr, Integer num) {
        this.components = list;
        this.sourceFingerprint = bArr == null ? null : Arrays.copyOfRange(bArr, bArr.length - 4, bArr.length);
        this.depth = num;
    }

    public String getPath() {
        if (this.components.isEmpty()) {
            return null;
        }
        StringJoiner stringJoiner = new StringJoiner("/");
        Iterator<PathComponent> it = this.components.iterator();
        while (it.hasNext()) {
            stringJoiner.add(it.next().toString());
        }
        return stringJoiner.toString();
    }

    @Override // com.sparrowwallet.hummingbird.registry.CborSerializable
    public C5211Iz toCbor() {
        IE ie = new IE();
        ie.EZpvd(new IL(1L), PathComponent.toCbor(this.components));
        if (this.sourceFingerprint != null) {
            ie.EZpvd(new IL(2L), new IL(new BigInteger(1, this.sourceFingerprint)));
        }
        if (this.depth != null) {
            ie.EZpvd(new IL(3L), new IL(this.depth.intValue()));
        }
        return ie;
    }

    @Override // com.sparrowwallet.hummingbird.registry.RegistryItem
    public RegistryType getRegistryType() {
        return RegistryType.CRYPTO_KEYPATH;
    }

    public static CryptoKeypath fromCbor(C5211Iz c5211Iz) {
        List<PathComponent> arrayList = new ArrayList<>();
        IE ie = (IE) c5211Iz;
        byte[] bArrBigIntegerToBytes = null;
        Integer numValueOf = null;
        for (C5211Iz c5211Iz2 : ie.KWHzl()) {
            int iIntValue = ((IL) c5211Iz2).KWHzl().intValue();
            if (iIntValue == 1) {
                arrayList = PathComponent.fromCbor(ie.copydefault(c5211Iz2));
            } else if (iIntValue == 2) {
                bArrBigIntegerToBytes = RegistryItem.bigIntegerToBytes(((IL) ie.copydefault(c5211Iz2)).KWHzl(), 4);
            } else if (iIntValue == 3) {
                numValueOf = Integer.valueOf(((IL) ie.copydefault(c5211Iz2)).KWHzl().intValue());
            }
        }
        return new CryptoKeypath(arrayList, bArrBigIntegerToBytes, numValueOf);
    }
}
