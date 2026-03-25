package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xVs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54798xVs {
    public static /* synthetic */ java.lang.String replaceWrapRtl$default(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return EZpvd(str, str2, str3, z);
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.lang.String strCopydefault = C59449zhJ.copydefault(str, str2, str3, z);
        if (C32979mnm.EZpvd.OLrzqt().getResources().getConfiguration().getLayoutDirection() != 1) {
            return strCopydefault;
        }
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) strCopydefault, new java.lang.String[]{str3}, false, 2, 2, (java.lang.Object) null);
        if (listSplit$default.size() != 2) {
            return strCopydefault;
        }
        return listSplit$default.get(1) + str3 + listSplit$default.get(0);
    }
}
