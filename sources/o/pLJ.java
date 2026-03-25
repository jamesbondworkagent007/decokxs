package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pLJ implements pLH {
    public final Function1<java.lang.String, java.lang.String> EZpvd;
    public final pLC copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    public pLJ(@NotNull pLC plc, @NotNull Function1<? super java.lang.String, java.lang.String> function1) {
        Intrinsics.checkNotNullParameter(plc, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = plc;
        this.EZpvd = function1;
    }

    @Override // o.pLH
    public boolean copydefault(@NotNull java.lang.String str) {
        java.lang.Object obj;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = this.copydefault.EZpvd().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (C59449zhJ.startsWith$default(this.EZpvd.invoke(str), (java.lang.String) next, false, 2, null)) {
                obj = next;
                break;
            }
        }
        return obj != null;
    }

    @Override // o.pLH
    public boolean AEQbTJ(@NotNull java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<java.lang.String> listOLrzqt = this.copydefault.OLrzqt();
        android.net.Uri uri = android.net.Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(uri, "");
        java.lang.String path = uri.getPath();
        java.lang.String str2 = path != null ? path : "";
        java.util.Iterator<T> it = listOLrzqt.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) str2, (java.lang.CharSequence) next, true)) {
                break;
            }
        }
        return next == null;
    }
}
