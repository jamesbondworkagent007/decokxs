package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.daQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13851daQ implements InterfaceC13844daJ {
    /* JADX DEBUG: Class process forced to load method for inline: o.gCa.Application.newInstance$default(o.gCa$Application, long, long, java.lang.String, java.lang.String, boolean, int, java.lang.Object):o.gCa */
    @Override // o.InterfaceC13844daJ
    public void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, long j, long j2, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.Integer, Unit> yho, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(function0, "");
        C19429gCa.Companion.OLrzqt(j, j2, str, str2, (16 & 16) != 0 ? false : false).EZpvd(fragmentManager, "AggregationAddressSwitchFragment", yho, function0);
    }
}
