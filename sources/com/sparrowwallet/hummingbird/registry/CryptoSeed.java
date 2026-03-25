package com.sparrowwallet.hummingbird.registry;

import androidx.compose.material3.CalendarModelKt;
import java.util.Date;
import o.C5210Iy;
import o.C5211Iz;
import o.IE;
import o.IJ;
import o.IL;

/* JADX INFO: loaded from: classes17.dex */
public class CryptoSeed extends RegistryItem {
    public static final long BIRTHDATE_KEY = 2;
    public static final long NAME_KEY = 3;
    public static final long NOTE_KEY = 4;
    public static final long PAYLOAD_KEY = 1;
    private final Date birthdate;
    private final String name;
    private final String note;
    private final byte[] seed;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Date getBirthdate() {
        return this.birthdate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getNote() {
        return this.note;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] getSeed() {
        return this.seed;
    }

    public CryptoSeed(byte[] bArr, Date date) {
        this(bArr, date, null, null);
    }

    public CryptoSeed(byte[] bArr, Date date, String str, String str2) {
        this.seed = bArr;
        this.birthdate = date;
        this.name = str;
        this.note = str2;
    }

    @Override // com.sparrowwallet.hummingbird.registry.CborSerializable
    public C5211Iz toCbor() {
        IE ie = new IE();
        ie.EZpvd(new IL(1L), new C5210Iy(this.seed));
        Date date = this.birthdate;
        if (date != null) {
            IL il = new IL(date.getTime() / CalendarModelKt.MillisecondsIn24Hours);
            il.EZpvd(100L);
            ie.EZpvd(new IL(2L), il);
        }
        if (this.name != null) {
            ie.EZpvd(new IL(3L), new IJ(this.name));
        }
        if (this.note != null) {
            ie.EZpvd(new IL(4L), new IJ(this.note));
        }
        return ie;
    }

    @Override // com.sparrowwallet.hummingbird.registry.RegistryItem
    public RegistryType getRegistryType() {
        return RegistryType.CRYPTO_SEED;
    }

    public static CryptoSeed fromCbor(C5211Iz c5211Iz) {
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
        return new CryptoSeed(bArrKWHzl, date, strAEQbTJ, strAEQbTJ2);
    }
}
