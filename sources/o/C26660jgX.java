package o;

import com.okinc.business.invest_biz.ui.screens.transaction.itembinder.BorrowReceiveTokenItemBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C27176jqJ;
import o.InterfaceC24178iXu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jgX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26660jgX extends AbstractC27119jpF<InterfaceC24178iXu.Activity, C23844iLk> {
    public final Function1<java.lang.String, Unit> AEQbTJ;
    public final boolean KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C26660jgX(Function1<? super java.lang.String, Unit> function1, boolean z) {
        super(BorrowReceiveTokenItemBinder$1.INSTANCE);
        this.AEQbTJ = function1;
        this.KWHzl = z;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C23844iLk c23844iLk, @NotNull InterfaceC24178iXu.Activity activity) {
        Intrinsics.checkNotNullParameter(c23844iLk, "");
        Intrinsics.checkNotNullParameter(activity, "");
        c23844iLk.copydefault.KWHzl(this.KWHzl);
        c23844iLk.copydefault.setData(activity.KWHzl(), activity.djBIcL(), false, activity.copydefault(), this.KWHzl, true);
        c23844iLk.copydefault.setTitle(C33070mpX.OLrzqt(activity.AEQbTJ(), c23844iLk.copydefault.getContext()));
        c23844iLk.copydefault.setOnCoinClickCallback(new Application());
        if (activity.OLrzqt()) {
            return;
        }
        c23844iLk.copydefault.OLrzqt(activity.KWHzl(), activity.djBIcL(), false, false, activity.copydefault(), this.KWHzl, true);
    }

    /* JADX INFO: renamed from: o.jgX$Application */
    public static final class Application implements C27176jqJ.Application {
        public Application() {
        }

        @Override // o.C27176jqJ.Application
        public void KWHzl(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            Function1 function1 = C26660jgX.this.AEQbTJ;
            if (function1 != null) {
                function1.invoke(str);
            }
        }
    }
}
