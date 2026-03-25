package o;

import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: renamed from: o.rpo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43467rpo {
    public static final C43467rpo EZpvd = new C43467rpo();

    private C43467rpo() {
    }

    public final boolean copydefault() {
        try {
            java.lang.String property = java.lang.System.getProperty("java.runtime.name");
            if (property == null || StringsKt__StringsKt.contains$default((java.lang.CharSequence) property, (java.lang.CharSequence) "Android Runtime", false, 2, (java.lang.Object) null)) {
                return false;
            }
            java.lang.Class.forName("org.junit.Test");
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
