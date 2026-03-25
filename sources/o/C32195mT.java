package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C32060mO;
import o.InterfaceC31925mJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C32195mT {
    public static final java.util.Map<java.lang.String, Function2<C32060mO.ActionBar, BX, Unit>> copydefault = C56424yEw.KWHzl();

    public static final C32060mO EZpvd(@NotNull InterfaceC31925mJ.StateListAnimator stateListAnimator, @NotNull BX bx) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(bx, "");
        C32060mO.TaskDescription taskDescription = C32060mO.copydefault;
        C32060mO.ActionBar actionBar = new C32060mO.ActionBar();
        actionBar.AEQbTJ(stateListAnimator.AkhnZx());
        EZpvd(actionBar, stateListAnimator, bx);
        DL dlValueOf = stateListAnimator.valueOf();
        actionBar.EZpvd(dlValueOf != null ? dlValueOf.toString() : null);
        Function2<C32060mO.ActionBar, BX, Unit> function2 = copydefault.get((java.lang.String) C58108yv.OLrzqt(bx.OLrzqt(), C57578yl.EZpvd.copydefault()));
        if (function2 != null) {
            function2.invoke(actionBar, bx);
        }
        return actionBar.OLrzqt();
    }

    public static final void EZpvd(C32060mO.ActionBar actionBar, InterfaceC31925mJ.StateListAnimator stateListAnimator, BX bx) {
        actionBar.KWHzl(java.lang.Boolean.valueOf(stateListAnimator.fARcdN()));
        actionBar.EZpvd(java.lang.Boolean.valueOf(stateListAnimator.fJNWhG()));
    }
}
