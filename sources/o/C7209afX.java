package o;

import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.util.UResourceBundle;
import o.C7024abY;

/* JADX INFO: renamed from: o.afX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7209afX {
    private C7209afX() {
    }

    public static AbstractC7211afZ EZpvd(java.lang.String str) throws java.io.IOException {
        java.nio.ByteBuffer byteBufferCopydefault = C7024abY.copydefault("brkitr/" + ((ICUResourceBundle) UResourceBundle.values("com/ibm/icu/impl/data/icudt68b/brkitr")).djBIcL("dictionaries/" + str));
        C7024abY.OLrzqt(byteBufferCopydefault, 1147757428, (C7024abY.ActionBar) null);
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = byteBufferCopydefault.getInt();
        }
        int i2 = iArr[0];
        C7006abE.copydefault(i2 >= 32);
        if (i2 > 32) {
            C7024abY.EZpvd(byteBufferCopydefault, i2 - 32);
        }
        int i3 = iArr[4] & 7;
        int i4 = iArr[3] - i2;
        if (i3 == 0) {
            int i5 = iArr[5];
            byte[] bArr = new byte[i4];
            byteBufferCopydefault.get(bArr);
            return new C7197afL(bArr, i5);
        }
        if (i3 != 1) {
            return null;
        }
        C7006abE.copydefault(i4 % 2 == 0);
        return new C7201afP(C7024abY.AEQbTJ(byteBufferCopydefault, i4 / 2, i4 & 1));
    }
}
