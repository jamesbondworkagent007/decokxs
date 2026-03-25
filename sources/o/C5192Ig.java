package o;

import co.nstant.in.cbor.CborException;
import co.nstant.in.cbor.model.SimpleValueType;
import co.nstant.in.cbor.model.SpecialType;

/* JADX INFO: renamed from: o.Ig, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5192Ig extends HV<II> {
    public final HX EZpvd;
    public final C5186Ia copydefault;
    public final C5188Ic gEmmrt;

    public C5192Ig(HU hu, java.io.InputStream inputStream) {
        super(hu, inputStream);
        this.copydefault = new C5186Ia(hu, inputStream);
        this.gEmmrt = new C5188Ic(hu, inputStream);
        this.EZpvd = new HX(hu, inputStream);
    }

    /* JADX INFO: renamed from: o.Ig$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] OLrzqt;

        static {
            int[] iArr = new int[SpecialType.values().length];
            EZpvd = iArr;
            try {
                iArr[SpecialType.BREAK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                EZpvd[SpecialType.SIMPLE_VALUE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                EZpvd[SpecialType.IEEE_754_HALF_PRECISION_FLOAT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                EZpvd[SpecialType.IEEE_754_SINGLE_PRECISION_FLOAT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                EZpvd[SpecialType.IEEE_754_DOUBLE_PRECISION_FLOAT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                EZpvd[SpecialType.SIMPLE_VALUE_NEXT_BYTE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                EZpvd[SpecialType.UNALLOCATED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[SimpleValueType.values().length];
            OLrzqt = iArr2;
            try {
                iArr2[SimpleValueType.FALSE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                OLrzqt[SimpleValueType.TRUE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                OLrzqt[SimpleValueType.NULL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                OLrzqt[SimpleValueType.UNDEFINED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                OLrzqt[SimpleValueType.UNALLOCATED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                OLrzqt[SimpleValueType.RESERVED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
        }
    }

    public II KWHzl(int i) throws CborException {
        switch (AnonymousClass1.EZpvd[SpecialType.ofByte(i).ordinal()]) {
            case 1:
                return II.AYXKKw;
            case 2:
                int i2 = AnonymousClass1.OLrzqt[SimpleValueType.ofByte(i).ordinal()];
                if (i2 == 1) {
                    return IG.AEQbTJ;
                }
                if (i2 == 2) {
                    return IG.EZpvd;
                }
                if (i2 == 3) {
                    return IG.KWHzl;
                }
                if (i2 == 4) {
                    return IG.OLrzqt;
                }
                if (i2 == 5) {
                    return new IG(i & 31);
                }
                throw new CborException("Not implemented");
            case 3:
                return this.copydefault.KWHzl(i);
            case 4:
                return this.gEmmrt.KWHzl(i);
            case 5:
                return this.EZpvd.OLrzqt(i);
            case 6:
                return new IG(OLrzqt());
            default:
                throw new CborException("Not implemented");
        }
    }
}
