package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.yjL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57484yjL {
    public static final C57484yjL AEQbTJ = new C57484yjL();

    private C57484yjL() {
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        if (str == null) {
            return "";
        }
        if (str.length() <= 10) {
            return str;
        }
        java.lang.CharSequence charSequenceSubSequence = str.subSequence(0, 6);
        Intrinsics.copydefault(charSequenceSubSequence, "");
        java.lang.CharSequence charSequenceSubSequence2 = str.subSequence(str.length() - 4, str.length());
        Intrinsics.copydefault(charSequenceSubSequence2, "");
        return ((java.lang.String) charSequenceSubSequence) + "..." + ((java.lang.String) charSequenceSubSequence2);
    }
}
