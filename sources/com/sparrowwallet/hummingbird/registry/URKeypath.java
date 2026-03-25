package com.sparrowwallet.hummingbird.registry;

import com.sparrowwallet.hummingbird.registry.pathcomponent.PathComponent;
import java.util.ArrayList;
import java.util.List;
import o.C5211Iz;
import o.IE;
import o.IL;

/* JADX INFO: loaded from: classes17.dex */
public class URKeypath extends CryptoKeypath {
    public URKeypath(List<PathComponent> list, byte[] bArr) {
        super(list, bArr);
    }

    public URKeypath(List<PathComponent> list, byte[] bArr, Integer num) {
        super(list, bArr, num);
    }

    @Override // com.sparrowwallet.hummingbird.registry.CryptoKeypath, com.sparrowwallet.hummingbird.registry.RegistryItem
    public RegistryType getRegistryType() {
        return RegistryType.KEYPATH;
    }

    public static URKeypath fromCbor(C5211Iz c5211Iz) {
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
        return new URKeypath(arrayList, bArrBigIntegerToBytes, numValueOf);
    }
}
