package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fpt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18836fpt {
    public static /* synthetic */ void showBackupDialogWithManualCallback$default(android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, AbstractC12782ctV abstractC12782ctV, Function1 function1, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function1 = null;
        }
        EZpvd(context, fragmentManager, abstractC12782ctV, function1, function0);
    }

    public static final void EZpvd(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull AbstractC12782ctV abstractC12782ctV, Function1<? super java.lang.Integer, Unit> function1, @NotNull Function0<Unit> function0) {
        java.lang.String strEZpvd;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (!abstractC12782ctV.zLjUOn()) {
            AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
            if (abstractC12784ctXGwTjWJ == null || (strEZpvd = abstractC12784ctXGwTjWJ.EZpvd()) == null) {
                return;
            }
            fragmentManager.beginTransaction().add(C18822fpf.Companion.copydefault(strEZpvd, function0, function1), (java.lang.String) null).commitAllowingStateLoss();
            return;
        }
        function0.invoke();
    }
}
