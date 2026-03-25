package o;

/* JADX INFO: renamed from: o.zuX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C60048zuX {
    public static java.lang.String OLrzqt(@androidx.annotation.NonNull java.lang.String str, char c, char c2) {
        int length = str.length();
        char[] cArr = new char[length];
        str.getChars(0, length, cArr, 0);
        for (int i = 0; i < length; i++) {
            if (cArr[i] == c) {
                cArr[i] = c2;
            }
        }
        return new java.lang.String(cArr);
    }
}
