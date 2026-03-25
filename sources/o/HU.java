package o;

import co.nstant.in.cbor.CborException;
import co.nstant.in.cbor.model.MajorType;
import java.util.LinkedList;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class HU {
    public static /* synthetic */ int[] OLrzqt;
    public final java.io.InputStream AYXKKw;
    public final C5190Ie AkhnZx;
    public final C5187Ib KWHzl;
    public final HZ djBIcL;
    public final C5194Ii ejfBZ;
    public final C5191If fARcdN;
    public final C5189Id fetchVPNInfo;
    public final C5192Ig isConnected;
    public final HY values;
    public boolean AEQbTJ = true;
    public boolean copydefault = true;
    public boolean EZpvd = true;
    public boolean AhwBna = true;
    public boolean gEmmrt = true;
    public boolean valueOf = true;
    public boolean DbNXlk = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AhwBna() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean djBIcL() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean valueOf() {
        return this.AhwBna;
    }

    public static /* synthetic */ int[] OLrzqt() {
        int[] iArr = OLrzqt;
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
        OLrzqt = iArr2;
        return iArr2;
    }

    public HU(java.io.InputStream inputStream) {
        Objects.requireNonNull(inputStream);
        this.AYXKKw = inputStream;
        this.ejfBZ = new C5194Ii(this, inputStream);
        this.AkhnZx = new C5190Ie(this, inputStream);
        this.djBIcL = new HZ(this, inputStream);
        this.fARcdN = new C5191If(this, inputStream);
        this.KWHzl = new C5187Ib(this, inputStream);
        this.values = new HY(this, inputStream);
        this.fetchVPNInfo = new C5189Id(this, inputStream);
        this.isConnected = new C5192Ig(this, inputStream);
    }

    public static java.util.List<C5211Iz> copydefault(byte[] bArr) throws CborException {
        return new HU(new java.io.ByteArrayInputStream(bArr)).EZpvd();
    }

    public java.util.List<C5211Iz> EZpvd() throws CborException {
        LinkedList linkedList = new LinkedList();
        while (true) {
            C5211Iz c5211IzAEQbTJ = AEQbTJ();
            if (c5211IzAEQbTJ == null) {
                return linkedList;
            }
            linkedList.add(c5211IzAEQbTJ);
        }
    }

    public C5211Iz AEQbTJ() throws CborException {
        try {
            int i = this.AYXKKw.read();
            if (i == -1) {
                return null;
            }
            switch (OLrzqt()[MajorType.ofByte(i).ordinal()]) {
                case 2:
                    return this.ejfBZ.OLrzqt(i);
                case 3:
                    return this.AkhnZx.OLrzqt(i);
                case 4:
                    return this.djBIcL.KWHzl(i);
                case 5:
                    return this.fARcdN.OLrzqt(i);
                case 6:
                    return this.KWHzl.KWHzl(i);
                case 7:
                    return this.values.OLrzqt(i);
                case 8:
                    IK ikOLrzqt = this.fetchVPNInfo.OLrzqt(i);
                    C5211Iz c5211IzAEQbTJ = AEQbTJ();
                    if (c5211IzAEQbTJ == null) {
                        throw new CborException("Unexpected end of stream: tag without following data item.");
                    }
                    if (this.gEmmrt && ikOLrzqt.KWHzl() == 30) {
                        return copydefault(c5211IzAEQbTJ);
                    }
                    if (this.valueOf && ikOLrzqt.KWHzl() == 38) {
                        return OLrzqt(c5211IzAEQbTJ);
                    }
                    C5211Iz c5211IzDjBIcL = c5211IzAEQbTJ;
                    while (c5211IzDjBIcL.gEmmrt()) {
                        c5211IzDjBIcL = c5211IzDjBIcL.djBIcL();
                    }
                    c5211IzDjBIcL.EZpvd(ikOLrzqt);
                    return c5211IzAEQbTJ;
                case 9:
                    return this.isConnected.KWHzl(i);
                default:
                    throw new CborException("Not implemented major type " + i);
            }
        } catch (java.io.IOException e) {
            throw new CborException(e);
        }
    }

    public final C5211Iz OLrzqt(C5211Iz c5211Iz) throws CborException {
        if (!(c5211Iz instanceof C5205It)) {
            throw new CborException("Error decoding LanguageTaggedString: not an array");
        }
        C5205It c5205It = (C5205It) c5211Iz;
        if (c5205It.AEQbTJ().size() != 2) {
            throw new CborException("Error decoding LanguageTaggedString: array size is not 2");
        }
        C5211Iz c5211Iz2 = c5205It.AEQbTJ().get(0);
        if (!(c5211Iz2 instanceof IJ)) {
            throw new CborException("Error decoding LanguageTaggedString: first data item is not an UnicodeString");
        }
        C5211Iz c5211Iz3 = c5205It.AEQbTJ().get(1);
        if (!(c5211Iz3 instanceof IJ)) {
            throw new CborException("Error decoding LanguageTaggedString: second data item is not an UnicodeString");
        }
        return new IC((IJ) c5211Iz2, (IJ) c5211Iz3);
    }

    public final C5211Iz copydefault(C5211Iz c5211Iz) throws CborException {
        if (!(c5211Iz instanceof C5205It)) {
            throw new CborException("Error decoding RationalNumber: not an array");
        }
        C5205It c5205It = (C5205It) c5211Iz;
        if (c5205It.AEQbTJ().size() != 2) {
            throw new CborException("Error decoding RationalNumber: array size is not 2");
        }
        C5211Iz c5211Iz2 = c5205It.AEQbTJ().get(0);
        if (!(c5211Iz2 instanceof IF)) {
            throw new CborException("Error decoding RationalNumber: first data item is not a number");
        }
        C5211Iz c5211Iz3 = c5205It.AEQbTJ().get(1);
        if (!(c5211Iz3 instanceof IF)) {
            throw new CborException("Error decoding RationalNumber: second data item is not a number");
        }
        return new IB((IF) c5211Iz2, (IF) c5211Iz3);
    }
}
