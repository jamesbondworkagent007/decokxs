package com.sparrowwallet.hummingbird.registry;

import androidx.compose.material3.CalendarModelKt;
import java.util.Date;
import o.C5210Iy;
import o.C5211Iz;
import o.IE;
import o.IJ;
import o.IL;

/* JADX INFO: loaded from: classes17.dex */
public class URSeed extends CryptoSeed {
    public URSeed(byte[] bArr, Date date) {
        super(bArr, date);
    }

    public URSeed(byte[] bArr, Date date, String str, String str2) {
        super(bArr, date, str, str2);
    }

    @Override // com.sparrowwallet.hummingbird.registry.CryptoSeed, com.sparrowwallet.hummingbird.registry.RegistryItem
    public RegistryType getRegistryType() {
        return RegistryType.SEED;
    }

    public static URSeed fromCbor(C5211Iz c5211Iz) {
        IE ie = (IE) c5211Iz;
        byte[] bArrKWHzl = null;
        Date date = null;
        String strAEQbTJ = null;
        String strAEQbTJ2 = null;
        for (C5211Iz c5211Iz2 : ie.KWHzl()) {
            long jIntValue = ((IL) c5211Iz2).KWHzl().intValue();
            if (jIntValue == 1) {
                bArrKWHzl = ((C5210Iy) ie.copydefault(c5211Iz2)).KWHzl();
            } else if (jIntValue == 2) {
                date = new Date(((IL) ie.copydefault(c5211Iz2)).KWHzl().longValue() * CalendarModelKt.MillisecondsIn24Hours);
            } else if (jIntValue == 3) {
                strAEQbTJ = ((IJ) ie.copydefault(c5211Iz2)).AEQbTJ();
            } else if (jIntValue == 4) {
                strAEQbTJ2 = ((IJ) ie.copydefault(c5211Iz2)).AEQbTJ();
            }
        }
        if (bArrKWHzl == null) {
            throw new IllegalStateException("Seed is null");
        }
        return new URSeed(bArrKWHzl, date, strAEQbTJ, strAEQbTJ2);
    }
}
