package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC55274xgp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class nSJ extends AbstractC52786wYh {
    public final java.util.List<C55276xgr> AEQbTJ;
    public Function1<? super C55276xgr, Unit> copydefault;

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.AbstractC52786wYh, o.AbstractC52792wYn, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        copydefault(new Function2() { // from class: o.nSG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return nSJ.EZpvd(this.KWHzl, ((java.lang.Integer) obj).intValue(), (C55276xgr) obj2);
            }
        });
    }

    public static final Unit EZpvd(nSJ nsj, int i, C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        Function1<? super C55276xgr, Unit> function1 = nsj.copydefault;
        if (function1 != null) {
            function1.invoke(c55276xgr);
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        java.util.List listAxsJAYsNCnLh;
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        java.util.List<C55276xgr> list = this.AEQbTJ;
        if (list == null || (listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list)) == null) {
            return;
        }
        InterfaceC55274xgp.StateListAnimator.setSingleOneColumnData$default(c55198xfS, listAxsJAYsNCnLh, null, 2, null);
    }
}
