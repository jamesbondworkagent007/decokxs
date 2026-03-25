package o;

import java.util.MissingResourceException;

/* JADX INFO: renamed from: o.add, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7109add {
    public static final C7108adc EZpvd;
    public static final java.lang.RuntimeException OLrzqt;

    public static final C7108adc OLrzqt() {
        java.lang.RuntimeException runtimeException = OLrzqt;
        if (runtimeException == null) {
            return EZpvd;
        }
        throw runtimeException;
    }

    static {
        C7108adc c7108adc = null;
        try {
            java.nio.ByteBuffer byteBufferCopydefault = C7024abY.copydefault("coll/ucadata.icu");
            C7108adc c7108adc2 = new C7108adc(null);
            C7050acX.EZpvd(null, byteBufferCopydefault, c7108adc2);
            e = null;
            c7108adc = c7108adc2;
        } catch (java.io.IOException unused) {
            e = new MissingResourceException("IOException while reading CLDR root data", "CollationRoot", "data/icudt68b/coll/ucadata.icu");
        } catch (java.lang.RuntimeException e) {
            e = e;
        }
        EZpvd = c7108adc;
        OLrzqt = e;
    }
}
