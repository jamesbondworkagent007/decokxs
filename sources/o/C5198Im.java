package o;

import co.nstant.in.cbor.CborException;
import co.nstant.in.cbor.model.SimpleValueType;
import co.nstant.in.cbor.model.SpecialType;

/* JADX INFO: renamed from: o.Im, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C5198Im extends AbstractC5197Il<II> {
    public final C5201Ip EZpvd;
    public final C5196Ik KWHzl;
    public final C5200Io OLrzqt;

    public C5198Im(HS hs, java.io.OutputStream outputStream) {
        super(hs, outputStream);
        this.EZpvd = new C5201Ip(hs, outputStream);
        this.OLrzqt = new C5200Io(hs, outputStream);
        this.KWHzl = new C5196Ik(hs, outputStream);
    }

    /* JADX INFO: renamed from: o.Im$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;

        static {
            int[] iArr = new int[SpecialType.values().length];
            KWHzl = iArr;
            try {
                iArr[SpecialType.BREAK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                KWHzl[SpecialType.SIMPLE_VALUE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                KWHzl[SpecialType.UNALLOCATED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                KWHzl[SpecialType.IEEE_754_HALF_PRECISION_FLOAT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                KWHzl[SpecialType.IEEE_754_SINGLE_PRECISION_FLOAT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                KWHzl[SpecialType.IEEE_754_DOUBLE_PRECISION_FLOAT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                KWHzl[SpecialType.SIMPLE_VALUE_NEXT_BYTE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[SimpleValueType.values().length];
            EZpvd = iArr2;
            try {
                iArr2[SimpleValueType.FALSE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                EZpvd[SimpleValueType.NULL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                EZpvd[SimpleValueType.TRUE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                EZpvd[SimpleValueType.UNDEFINED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                EZpvd[SimpleValueType.UNALLOCATED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                EZpvd[SimpleValueType.RESERVED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
        }
    }

    public void OLrzqt(II ii) throws CborException {
        switch (AnonymousClass4.KWHzl[ii.OLrzqt().ordinal()]) {
            case 1:
                AEQbTJ(255);
                return;
            case 2:
                IG ig = (IG) ii;
                int i = AnonymousClass4.EZpvd[ig.KWHzl().ordinal()];
                if (i == 1 || i == 2 || i == 3 || i == 4) {
                    AEQbTJ(ig.KWHzl().getValue() | 224);
                    return;
                } else {
                    if (i != 5) {
                        return;
                    }
                    AEQbTJ(ig.AEQbTJ() | 224);
                    return;
                }
            case 3:
                throw new CborException("Unallocated special type");
            case 4:
                if (!(ii instanceof IA)) {
                    throw new CborException("Wrong data item type");
                }
                this.EZpvd.OLrzqt((IA) ii);
                return;
            case 5:
                if (!(ii instanceof IH)) {
                    throw new CborException("Wrong data item type");
                }
                this.OLrzqt.copydefault((IH) ii);
                return;
            case 6:
                if (!(ii instanceof C5209Ix)) {
                    throw new CborException("Wrong data item type");
                }
                this.KWHzl.copydefault((C5209Ix) ii);
                return;
            case 7:
                if (!(ii instanceof IG)) {
                    throw new CborException("Wrong data item type");
                }
                AEQbTJ(-8, (byte) ((IG) ii).AEQbTJ());
                return;
            default:
                return;
        }
    }
}
