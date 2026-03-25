package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aWU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6813aWU {
    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (android.text.TextUtils.isEmpty(str) || C59449zhJ.startsWith$default(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString(), "http", false, 2, null)) {
            return str;
        }
        if (!C59449zhJ.startsWith$default(str, "/", false, 2, null)) {
            str = "/" + str;
        }
        return C43292rmY.OLrzqt.fJNWhG() + str;
    }
}
