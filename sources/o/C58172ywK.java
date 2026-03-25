package o;

import com.bytedance.applog.encryptor.IEncryptorType;
import com.google.common.primitives.UnsignedBytes;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;

/* JADX INFO: renamed from: o.ywK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C58172ywK {
    public static java.lang.String[] KWHzl = {"0", "1", "2", "3", "4", "5", OrderDetailListItem.SLIP_OUT, "7", "8", "9", IEncryptorType.DEFAULT_ENCRYPTOR, "b", "c", com.ibm.icu.text.DateFormat.DAY, "e", "f"};
    public static java.lang.String[] OLrzqt = new java.lang.String[256];

    public static byte[] OLrzqt(java.lang.String str) {
        if (str.length() % 2 == 1) {
            throw new java.lang.IllegalStateException("Must have an even number of hex digits to convert to bytes!");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) java.lang.Integer.parseInt(str.substring(i2, i2 + 2), 16);
        }
        return bArr;
    }

    public static java.lang.String AEQbTJ(byte[] bArr) {
        return EZpvd(bArr);
    }

    static {
        for (int i = 0; i < 256; i++) {
            java.lang.String[] strArr = OLrzqt;
            java.lang.String[] strArr2 = KWHzl;
            strArr[i] = strArr2[(i >> 4) & 15] + strArr2[i & 15];
        }
    }

    public static java.lang.String KWHzl(byte b) {
        return OLrzqt[b & UnsignedBytes.MAX_VALUE];
    }

    public static java.lang.String EZpvd(byte[] bArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (byte b : bArr) {
            sb.append(KWHzl(b));
        }
        return sb.toString();
    }
}
