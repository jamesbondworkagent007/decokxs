package o;

import android.view.View;
import androidx.fragment.app.ViewKt;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qEf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39962qEf extends AbstractC39964qEh<C39993qFj, C42947rfy> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C42947rfy AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42947rfy c42947rfyCopydefault = C42947rfy.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42947rfyCopydefault, "");
        return c42947rfyCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C42947rfy c42947rfy, int i, @NotNull C39993qFj c39993qFj) {
        Intrinsics.checkNotNullParameter(c42947rfy, "");
        Intrinsics.checkNotNullParameter(c39993qFj, "");
        c42947rfy.AEQbTJ.setText(c39993qFj.AEQbTJ().getTitle());
        android.widget.TextView textView = c42947rfy.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        AEQbTJ(textView, java.lang.String.valueOf(c39993qFj.AEQbTJ().getTitle()));
        c42947rfy.copydefault.setText(c39993qFj.OLrzqt());
        android.widget.LinearLayout root = c42947rfy.getRoot();
        root.setOnClickListener(new TaskDescription(root, 1000L, c42947rfy, c39993qFj, i));
    }

    /* JADX INFO: renamed from: o.qEf$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ int EZpvd;
        public final /* synthetic */ C42947rfy KWHzl;
        public final /* synthetic */ C39993qFj OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C42947rfy c42947rfy, C39993qFj c39993qFj, int i) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = c42947rfy;
            this.OLrzqt = c39993qFj;
            this.EZpvd = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.Object objM7377constructorimpl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                android.widget.LinearLayout root = this.KWHzl.getRoot();
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
                        qhm.EZpvd(this.OLrzqt, this.EZpvd);
                    }
                }
            }
        }
    }
}
