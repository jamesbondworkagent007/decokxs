package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fNp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C17661fNp {
    public static final C17661fNp OLrzqt = new C17661fNp();

    private C17661fNp() {
    }

    public static /* synthetic */ java.lang.String handleNetworkCommonErrorMessage$default(C17661fNp c17661fNp, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c17661fNp.EZpvd(str);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.OLrzqt((java.lang.CharSequence) str) ? str : C33070mpX.AYXKKw(C13754dXa.FragmentManager.isTimeProfileEmpty);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            return null;
        }
        if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) str, (java.lang.CharSequence) "Resident credentials", true) && StringsKt__StringsKt.AhwBna((java.lang.CharSequence) str, (java.lang.CharSequence) "not supported", true)) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.Ohcwxs);
        }
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.isTimeProfileEmpty);
    }
}
