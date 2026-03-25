package com.sparrowwallet.hummingbird.registry;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C5205It;
import o.C5211Iz;
import o.IE;
import o.IL;

/* JADX INFO: loaded from: classes24.dex */
public class MultiKey implements CborSerializable {
    public static final int KEYS_KEY = 2;
    public static final int THRESHOLD_KEY = 1;
    private final List<CryptoECKey> ecKeys;
    private final List<CryptoHDKey> hdKeys;
    private final int threshold;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<CryptoECKey> getEcKeys() {
        return this.ecKeys;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<CryptoHDKey> getHdKeys() {
        return this.hdKeys;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getThreshold() {
        return this.threshold;
    }

    public MultiKey(int i, List<CryptoECKey> list, List<CryptoHDKey> list2) {
        this.threshold = i;
        this.ecKeys = list;
        this.hdKeys = list2;
    }

    @Override // com.sparrowwallet.hummingbird.registry.CborSerializable
    public C5211Iz toCbor() {
        IE ie = new IE();
        ie.EZpvd(new IL(1L), new IL(this.threshold));
        C5205It c5205It = new C5205It();
        List<CryptoECKey> list = this.ecKeys;
        if (list == null || list.isEmpty()) {
            List<CryptoHDKey> list2 = this.hdKeys;
            if (list2 != null) {
                Iterator<CryptoHDKey> it = list2.iterator();
                while (it.hasNext()) {
                    C5211Iz cbor = it.next().toCbor();
                    cbor.EZpvd(RegistryType.CRYPTO_HDKEY.getTag().intValue());
                    c5205It.EZpvd(cbor);
                }
            }
        } else {
            Iterator<CryptoECKey> it2 = this.ecKeys.iterator();
            while (it2.hasNext()) {
                C5211Iz cbor2 = it2.next().toCbor();
                cbor2.EZpvd(RegistryType.CRYPTO_ECKEY.getTag().intValue());
                c5205It.EZpvd(cbor2);
            }
        }
        ie.EZpvd(new IL(2L), c5205It);
        return ie;
    }

    public static MultiKey fromCbor(C5211Iz c5211Iz) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        IE ie = (IE) c5211Iz;
        int iIntValue = 0;
        for (C5211Iz c5211Iz2 : ie.KWHzl()) {
            IL il = (IL) c5211Iz2;
            if (il.KWHzl().intValue() == 1) {
                iIntValue = ((IL) ie.copydefault(c5211Iz2)).KWHzl().intValue();
            }
            if (il.KWHzl().intValue() == 2) {
                for (C5211Iz c5211Iz3 : ((C5205It) ie.copydefault(c5211Iz2)).AEQbTJ()) {
                    if (c5211Iz3.djBIcL().KWHzl() == RegistryType.CRYPTO_ECKEY.getTag().intValue()) {
                        arrayList.add(CryptoECKey.fromCbor(c5211Iz3));
                    } else if (c5211Iz3.djBIcL().KWHzl() == RegistryType.CRYPTO_HDKEY.getTag().intValue()) {
                        arrayList2.add(CryptoHDKey.fromCbor(c5211Iz3));
                    }
                }
            }
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            throw new IllegalStateException("One or more of eckey or hdkey must be specified");
        }
        return new MultiKey(iIntValue, arrayList, arrayList2);
    }
}
