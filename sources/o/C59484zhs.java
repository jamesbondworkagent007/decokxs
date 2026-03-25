package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.zhs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59484zhs {
    public static final boolean copydefault(java.lang.String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Intrinsics.copydefault((int) cCharAt, 128) >= 0 || java.lang.Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }
}
