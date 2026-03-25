package o;

import android.view.View;
import androidx.fragment.app.ViewKt;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qEE extends AbstractC40510qYn<C40003qFt, C42884reo> {
    public final Function1<java.lang.Long, Unit> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public qEE(@NotNull Function1<? super java.lang.Long, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C42884reo AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42884reo c42884reoAEQbTJ = C42884reo.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42884reoAEQbTJ, "");
        return c42884reoAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C42884reo c42884reo, int i, @NotNull C40003qFt c40003qFt) {
        Intrinsics.checkNotNullParameter(c42884reo, "");
        Intrinsics.checkNotNullParameter(c40003qFt, "");
        c42884reo.OLrzqt.setPeriods(c40003qFt.KWHzl(), 0, this.KWHzl);
        qIH root = c42884reo.getRoot();
        root.setOnClickListener(new TaskDescription(root, 1000L, c42884reo, c40003qFt));
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C42884reo EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C40003qFt copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C42884reo c42884reo, C40003qFt c40003qFt) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = c42884reo;
            this.copydefault = c40003qFt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.Object objM7377constructorimpl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                qIH root = this.EZpvd.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(ViewKt.findFragment(root));
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = null;
                }
                androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) objM7377constructorimpl;
                if (fragment != null) {
                    boolean z = fragment instanceof qHM;
                    java.lang.Object obj = fragment;
                    if (!z) {
                        androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
                        while (parentFragment != null && !(parentFragment instanceof qHM)) {
                            parentFragment = parentFragment.getParentFragment();
                        }
                        obj = (qHM) (parentFragment instanceof qHM ? parentFragment : null);
                    }
                    qHM qhm = (qHM) obj;
                    if (qhm != null) {
                        qhm.copydefault(this.copydefault.copydefault());
                    }
                }
            }
        }
    }
}
