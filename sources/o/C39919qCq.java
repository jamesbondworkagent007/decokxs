package o;

import android.view.View;
import androidx.fragment.app.ViewKt;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import o.qHM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qCq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C39919qCq extends AbstractC40510qYn<C39994qFk, C42885rep> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C42885rep AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42885rep c42885repOLrzqt = C42885rep.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42885repOLrzqt, "");
        return c42885repOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C42885rep c42885rep, int i, @NotNull C39994qFk c39994qFk) {
        Intrinsics.checkNotNullParameter(c42885rep, "");
        Intrinsics.checkNotNullParameter(c39994qFk, "");
        c42885rep.EZpvd.setText(c39994qFk.EZpvd());
        c42885rep.AEQbTJ.setText(c39994qFk.AhwBna());
        c42885rep.KWHzl.setText(c39994qFk.AYXKKw());
        android.widget.TextView textView = c42885rep.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C41426qqb.setText$default(textView, c39994qFk.djBIcL(), (java.lang.CharSequence) c39994qFk.gEmmrt(), 0, 0, 0, false, 60, (java.lang.Object) null);
        C40499qYc root = c42885rep.getRoot();
        root.setOnClickListener(new TaskDescription(root, 1000L, c42885rep, c39994qFk, i));
    }

    /* JADX INFO: renamed from: o.qCq$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C42885rep AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ C39994qFk copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C42885rep c42885rep, C39994qFk c39994qFk, int i) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c42885rep;
            this.copydefault = c39994qFk;
            this.OLrzqt = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.Object objM7377constructorimpl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C40499qYc root = this.AEQbTJ.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                qHN qhnOLrzqt = qHO.OLrzqt(root);
                if (qhnOLrzqt != null) {
                    qhnOLrzqt.copydefault(this.copydefault.KWHzl(), this.OLrzqt);
                }
                C40499qYc root2 = this.AEQbTJ.getRoot();
                Intrinsics.checkNotNullExpressionValue(root2, "");
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(ViewKt.findFragment(root2));
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
                        qHM.StateListAnimator.navigateInstrumentDetailPage$default(qhm, this.copydefault.KWHzl(), this.OLrzqt, null, null, false, false, 32, null);
                    }
                }
            }
        }
    }
}
