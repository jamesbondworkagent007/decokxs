package o;

import com.google.common.primitives.UnsignedBytes;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zut, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C60070zut {
    public static final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0<int[]>() { // from class: org.komputing.kbase58.Base58Kt$alphabetIndices$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        public final int[] invoke() {
            int[] iArr = new int[128];
            for (int i = 0; i < 128; i++) {
                iArr[i] = StringsKt__StringsKt.indexOf$default((CharSequence) "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz", (char) i, 0, false, 6, (Object) null);
            }
            return iArr;
        }
    });

    public static final java.lang.String EZpvd(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
        if (bArrCopyOf.length == 0) {
            return "";
        }
        int i = 0;
        while (i < bArrCopyOf.length && bArrCopyOf[i] == 0) {
            i++;
        }
        int length = bArrCopyOf.length * 2;
        char[] cArr = new char[length];
        int i2 = i;
        int i3 = length;
        while (i2 < bArrCopyOf.length) {
            i3--;
            cArr[i3] = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz".charAt(OLrzqt(bArrCopyOf, C56395yDu.EZpvd(i2), C56395yDu.EZpvd(256), C56395yDu.EZpvd(58)));
            if (bArrCopyOf[i2] == 0) {
                i2++;
            }
        }
        while (i3 < length && cArr[i3] == '1') {
            i3++;
        }
        while (true) {
            i--;
            if (i >= 0) {
                i3--;
                cArr[i3] = '1';
            } else {
                return new java.lang.String(cArr, i3, length - i3);
            }
        }
    }

    public static final int OLrzqt(byte[] bArr, int i, int i2, int i3) {
        int iEZpvd = C56395yDu.EZpvd(0);
        int iEZpvd2 = C56395yDu.EZpvd(bArr.length);
        if (C56399yDy.KWHzl(i, iEZpvd2) < 0) {
            while (true) {
                int i4 = i + 1;
                int iEZpvd3 = C56395yDu.EZpvd(C56395yDu.EZpvd(iEZpvd * i2) + C56395yDu.EZpvd(C56393yDs.copydefault(bArr[i]) & UnsignedBytes.MAX_VALUE));
                bArr[i] = (byte) C7988auH.EZpvd(iEZpvd3, i3);
                iEZpvd = C7995auO.OLrzqt(iEZpvd3, i3);
                if (C56399yDy.KWHzl(i4, iEZpvd2) >= 0) {
                    break;
                }
                i = i4;
            }
        }
        return iEZpvd;
    }

    public static final java.lang.String OLrzqt(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        byte[] bArr2 = new byte[bArr.length + 4];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        java.lang.System.arraycopy(C60028zuD.AEQbTJ(C60028zuD.AEQbTJ(bArr)), 0, bArr2, bArr.length, 4);
        return EZpvd(bArr2);
    }
}
