package o;

import co.nstant.in.cbor.CborException;
import co.nstant.in.cbor.model.MajorType;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public class HS {
    public static /* synthetic */ int[] copydefault;
    public boolean AEQbTJ = true;
    public final C5204Is AYXKKw;
    public final C5206Iu AhwBna;
    public final C5199In EZpvd;
    public final C5195Ij KWHzl;
    public final C5193Ih OLrzqt;
    public final C5207Iv djBIcL;
    public final C5198Im gEmmrt;
    public final C5202Iq valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AEQbTJ() {
        return this.AEQbTJ;
    }

    public static /* synthetic */ int[] OLrzqt() {
        int[] iArr = copydefault;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[MajorType.values().length];
        try {
            iArr2[MajorType.ARRAY.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr2[MajorType.BYTE_STRING.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr2[MajorType.INVALID.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            iArr2[MajorType.MAP.ordinal()] = 7;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            iArr2[MajorType.NEGATIVE_INTEGER.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            iArr2[MajorType.SPECIAL.ordinal()] = 9;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            iArr2[MajorType.TAG.ordinal()] = 8;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        try {
            iArr2[MajorType.UNICODE_STRING.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused8) {
        }
        try {
            iArr2[MajorType.UNSIGNED_INTEGER.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused9) {
        }
        copydefault = iArr2;
        return iArr2;
    }

    public HS(java.io.OutputStream outputStream) {
        Objects.requireNonNull(outputStream);
        this.AhwBna = new C5206Iu(this, outputStream);
        this.valueOf = new C5202Iq(this, outputStream);
        this.KWHzl = new C5195Ij(this, outputStream);
        this.djBIcL = new C5207Iv(this, outputStream);
        this.OLrzqt = new C5193Ih(this, outputStream);
        this.EZpvd = new C5199In(this, outputStream);
        this.AYXKKw = new C5204Is(this, outputStream);
        this.gEmmrt = new C5198Im(this, outputStream);
    }

    public void OLrzqt(java.util.List<C5211Iz> list) throws CborException {
        java.util.Iterator<C5211Iz> it = list.iterator();
        while (it.hasNext()) {
            EZpvd(it.next());
        }
    }

    public void EZpvd(C5211Iz c5211Iz) throws CborException {
        if (c5211Iz == null) {
            c5211Iz = IG.KWHzl;
        }
        if (c5211Iz.gEmmrt()) {
            EZpvd(c5211Iz.djBIcL());
        }
        switch (OLrzqt()[c5211Iz.copydefault().ordinal()]) {
            case 2:
                this.AhwBna.AEQbTJ((IL) c5211Iz);
                return;
            case 3:
                this.valueOf.OLrzqt((ID) c5211Iz);
                return;
            case 4:
                this.KWHzl.KWHzl((C5210Iy) c5211Iz);
                return;
            case 5:
                this.djBIcL.EZpvd((IJ) c5211Iz);
                return;
            case 6:
                this.OLrzqt.KWHzl((C5205It) c5211Iz);
                return;
            case 7:
                this.EZpvd.AEQbTJ((IE) c5211Iz);
                return;
            case 8:
                this.AYXKKw.OLrzqt((IK) c5211Iz);
                return;
            case 9:
                this.gEmmrt.OLrzqt((II) c5211Iz);
                return;
            default:
                throw new CborException("Unknown major type");
        }
    }
}
