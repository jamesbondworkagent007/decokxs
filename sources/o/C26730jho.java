package o;

import com.okinc.business.invest_biz.ui.screens.transaction.itembinder.ReceiveTokenItemBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C27176jqJ;
import o.InterfaceC24178iXu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jho, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26730jho extends AbstractC27119jpF<InterfaceC24178iXu.LoaderManager, C23844iLk> {
    public final Function1<java.lang.String, Unit> KWHzl;
    public final boolean copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C26730jho(Function1<? super java.lang.String, Unit> function1, boolean z) {
        super(ReceiveTokenItemBinder$1.INSTANCE);
        this.KWHzl = function1;
        this.copydefault = z;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C23844iLk c23844iLk, @NotNull InterfaceC24178iXu.LoaderManager loaderManager) {
        Intrinsics.checkNotNullParameter(c23844iLk, "");
        Intrinsics.checkNotNullParameter(loaderManager, "");
        c23844iLk.copydefault.KWHzl(this.copydefault);
        C27176jqJ.setData$default(c23844iLk.copydefault, loaderManager.copydefault(), loaderManager.AhwBna(), true, loaderManager.AEQbTJ(), this.copydefault, false, 32, null);
        c23844iLk.copydefault.setTitle(C33070mpX.OLrzqt(loaderManager.KWHzl(), c23844iLk.copydefault.getContext()));
        c23844iLk.copydefault.setOnTipClickCallback(new StateListAnimator(c23844iLk, loaderManager));
        c23844iLk.copydefault.setOnCoinClickCallback(new Application());
        if (loaderManager.djBIcL()) {
            return;
        }
        c23844iLk.copydefault.OLrzqt(loaderManager.copydefault(), loaderManager.AhwBna(), true, false, loaderManager.AEQbTJ(), this.copydefault, (64 & 64) != 0 ? false : false);
    }

    /* JADX INFO: renamed from: o.jho$StateListAnimator */
    public static final class StateListAnimator implements C27176jqJ.Activity {
        public final /* synthetic */ C23844iLk OLrzqt;
        public final /* synthetic */ InterfaceC24178iXu.LoaderManager copydefault;

        public StateListAnimator(C23844iLk c23844iLk, InterfaceC24178iXu.LoaderManager loaderManager) {
            this.OLrzqt = c23844iLk;
            this.copydefault = loaderManager;
        }

        @Override // o.C27176jqJ.Activity
        public void EZpvd() {
            C27569jxf c27569jxf = C27569jxf.OLrzqt;
            android.content.Context context = this.OLrzqt.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c27569jxf.OLrzqt(context, this.copydefault);
        }
    }

    /* JADX INFO: renamed from: o.jho$Application */
    public static final class Application implements C27176jqJ.Application {
        public Application() {
        }

        @Override // o.C27176jqJ.Application
        public void KWHzl(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            Function1 function1 = C26730jho.this.KWHzl;
            if (function1 != null) {
                function1.invoke(str);
            }
        }
    }
}
