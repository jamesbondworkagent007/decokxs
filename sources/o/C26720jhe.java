package o;

import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jhe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26720jhe {
    public static final java.lang.String copydefault(@NotNull android.content.Context context, java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            return C27492jwH.OLrzqt.djBIcL(str);
        }
        java.lang.String string = context.getString(C25493ixk.FragmentManager.onComplete);
        Intrinsics.copydefault((java.lang.Object) string);
        return string;
    }
}
