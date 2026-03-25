package o;

import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.impl.number.DecimalFormatProperties;
import com.ibm.icu.number.NumberFormatter;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;
import o.C7173aeo;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: renamed from: o.aeh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7166aeh {
    public final short AhwBna;
    public final short gEmmrt;
    public final short isConnected;
    public static final C7166aeh KWHzl = new C7166aeh(-1, -1, -2);
    public static final C7166aeh AEQbTJ = new C7166aeh(-2, -2, -3);
    public static final C7166aeh copydefault = new C7166aeh(-2, -2, -2);
    public static final C7166aeh valueOf = new C7166aeh(-4, -4, 1);
    public static final C7166aeh djBIcL = new C7166aeh(3, 3, 1);
    public static final C7166aeh OLrzqt = new C7166aeh(3, 2, 1);
    public static final C7166aeh AYXKKw = new C7166aeh(3, 3, 2);
    public static final C7166aeh EZpvd = new C7166aeh(3, 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public short AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public short EZpvd() {
        return this.gEmmrt;
    }

    /* JADX INFO: renamed from: o.aeh$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] AEQbTJ;

        static {
            int[] iArr = new int[NumberFormatter.GroupingStrategy.values().length];
            AEQbTJ = iArr;
            try {
                iArr[NumberFormatter.GroupingStrategy.OFF.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                AEQbTJ[NumberFormatter.GroupingStrategy.MIN2.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                AEQbTJ[NumberFormatter.GroupingStrategy.AUTO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                AEQbTJ[NumberFormatter.GroupingStrategy.ON_ALIGNED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                AEQbTJ[NumberFormatter.GroupingStrategy.THOUSANDS.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    public static C7166aeh copydefault(NumberFormatter.GroupingStrategy groupingStrategy) {
        int i = AnonymousClass1.AEQbTJ[groupingStrategy.ordinal()];
        if (i == 1) {
            return KWHzl;
        }
        if (i == 2) {
            return AEQbTJ;
        }
        if (i == 3) {
            return copydefault;
        }
        if (i == 4) {
            return valueOf;
        }
        if (i == 5) {
            return djBIcL;
        }
        throw new java.lang.AssertionError();
    }

    public static C7166aeh AEQbTJ(DecimalFormatProperties decimalFormatProperties) {
        if (!decimalFormatProperties.getGroupingUsed()) {
            return KWHzl;
        }
        short groupingSize = (short) decimalFormatProperties.getGroupingSize();
        short secondaryGroupingSize = (short) decimalFormatProperties.getSecondaryGroupingSize();
        short minimumGroupingDigits = (short) decimalFormatProperties.getMinimumGroupingDigits();
        if (groupingSize <= 0 && secondaryGroupingSize > 0) {
            groupingSize = secondaryGroupingSize;
        }
        if (secondaryGroupingSize <= 0) {
            secondaryGroupingSize = groupingSize;
        }
        return EZpvd(groupingSize, secondaryGroupingSize, minimumGroupingDigits);
    }

    public static C7166aeh EZpvd(short s, short s2, short s3) {
        return s == -1 ? KWHzl : (s == 3 && s2 == 3 && s3 == 1) ? djBIcL : (s == 3 && s2 == 2 && s3 == 1) ? OLrzqt : (s == 3 && s2 == 3 && s3 == 2) ? AYXKKw : (s == 3 && s2 == 2 && s3 == 2) ? EZpvd : new C7166aeh(s, s2, s3);
    }

    public static short copydefault(ULocale uLocale) {
        return java.lang.Short.valueOf(((ICUResourceBundle) UResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b", uLocale)).djBIcL("NumberElements/minimumGroupingDigits")).shortValue();
    }

    public C7166aeh(short s, short s2, short s3) {
        this.AhwBna = s;
        this.gEmmrt = s2;
        this.isConnected = s3;
    }

    public C7166aeh KWHzl(ULocale uLocale, C7173aeo.StateListAnimator stateListAnimator) {
        short s;
        short sMax = this.isConnected;
        if (sMax == -2) {
            sMax = copydefault(uLocale);
        } else if (sMax == -3) {
            sMax = (short) java.lang.Math.max(2, (int) copydefault(uLocale));
        }
        short s2 = this.AhwBna;
        if (s2 != -2 && (s = this.gEmmrt) != -4) {
            return sMax == this.isConnected ? this : EZpvd(s2, s, sMax);
        }
        long j = stateListAnimator.EZpvd.valueOf;
        short s3 = (short) (j & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        short s4 = (short) ((j >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        short s5 = (short) ((j >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        if (s4 == -1) {
            s3 = s2 == -4 ? (short) 3 : (short) -1;
        }
        if (s5 == -1) {
            s4 = s3;
        }
        return EZpvd(s3, s4, sMax);
    }

    public boolean EZpvd(int i, InterfaceC7163aee interfaceC7163aee) {
        int i2;
        short s = this.AhwBna;
        return s != -1 && s != 0 && (i2 = i - s) >= 0 && i2 % this.gEmmrt == 0 && (interfaceC7163aee.EZpvd() - this.AhwBna) + 1 >= this.isConnected;
    }
}
