package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kdn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28599kdn {
    @yCM
    public C28599kdn() {
    }

    public final byte[] copydefault(@NotNull java.lang.String str) {
        java.lang.String strSubstring;
        Intrinsics.checkNotNullParameter(str, "");
        for (int i = 0; i < str.length(); i++) {
            if (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz", str.charAt(i), false, 2, (java.lang.Object) null)) {
                return null;
            }
        }
        int length = str.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                strSubstring = str;
                break;
            }
            if (str.charAt(i2) != '1') {
                strSubstring = str.substring(0, i2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                break;
            }
            i2++;
        }
        int length2 = strSubstring.length();
        java.lang.String strFetchVPNInfo = C59454zhO.fetchVPNInfo(str, length2);
        if (strFetchVPNInfo.length() == 0) {
            return new byte[length2];
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length3 = strFetchVPNInfo.length();
        for (int i3 = 0; i3 < length3; i3++) {
            java.lang.Integer num = (java.lang.Integer) C28596kdk.copydefault.get(java.lang.Character.valueOf(strFetchVPNInfo.charAt(i3)));
            if (num == null) {
                return null;
            }
            int iIntValue = num.intValue();
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                int iIntValue2 = (((java.lang.Number) arrayList.get(i4)).intValue() * 58) + iIntValue;
                arrayList.set(i4, java.lang.Integer.valueOf(iIntValue2 & 255));
                iIntValue = iIntValue2 >> 8;
            }
            if (iIntValue > 0) {
                arrayList.add(java.lang.Integer.valueOf(iIntValue));
            }
        }
        byte[] bArr = new byte[length2 + arrayList.size()];
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            bArr[(r0 - i5) - 1] = (byte) ((java.lang.Number) arrayList.get(i5)).intValue();
        }
        return bArr;
    }
}
