package o;

import com.squareup.moshi.Json;

/* JADX INFO: renamed from: o.zvM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C60090zvM {
    private C60090zvM() {
    }

    public static java.lang.String AEQbTJ(int i) {
        return copydefault('0', i);
    }

    public static java.lang.String copydefault(char c, int i) {
        return new java.lang.String(new char[i]).replace(Json.UNSET_NAME, java.lang.String.valueOf(c));
    }

    public static boolean AEQbTJ(java.lang.String str) {
        return str == null || str.isEmpty();
    }
}
