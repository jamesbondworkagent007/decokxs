package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.ViewKt;
import com.okinc.market.search.features.main.result.ui.SubPage;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.qHM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qEG extends AbstractC39964qEh<C40005qFv, C42883ren> {
    public final SubPage copydefault;

    public qEG(@NotNull SubPage subPage) {
        Intrinsics.checkNotNullParameter(subPage, "");
        this.copydefault = subPage;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C42883ren AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42883ren c42883renCopydefault = C42883ren.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42883renCopydefault, "");
        return c42883renCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    public void AEQbTJ(@NotNull final C42883ren c42883ren, final int i, @NotNull final C40005qFv c40005qFv) {
        Intrinsics.checkNotNullParameter(c42883ren, "");
        Intrinsics.checkNotNullParameter(c40005qFv, "");
        c42883ren.OLrzqt.setText(c40005qFv.valueOf());
        c42883ren.gEmmrt.setText(c40005qFv.AEQbTJ());
        c42883ren.KWHzl.setText(c40005qFv.copydefault());
        android.widget.TextView textView = c42883ren.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C41426qqb.setText$default(textView, c40005qFv.OLrzqt(), (java.lang.CharSequence) c40005qFv.gEmmrt(), 0, 0, 0, false, 60, (java.lang.Object) null);
        C41431qqg.AEQbTJ(c42883ren.copydefault, c40005qFv.AYXKKw(), (Function1<? super AppCompatImageView, Unit>) new Function1() { // from class: o.qEH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qEG.KWHzl(c42883ren, c40005qFv, i, (AppCompatImageView) obj);
            }
        });
        C40499qYc root = c42883ren.getRoot();
        root.setOnClickListener(new ActionBar(root, 1000L, c42883ren, c40005qFv, this, i));
    }

    public static final Unit KWHzl(C42883ren c42883ren, C40005qFv c40005qFv, int i, AppCompatImageView appCompatImageView) {
        Intrinsics.checkNotNullParameter(appCompatImageView, "");
        c42883ren.copydefault.setSelected(c40005qFv.AkhnZx());
        AppCompatImageView appCompatImageView2 = c42883ren.copydefault;
        appCompatImageView2.setOnClickListener(new Application(appCompatImageView2, 1000L, c42883ren, i, c40005qFv));
        AppCompatImageView appCompatImageView3 = c42883ren.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "");
        C55296xhK.EZpvd((android.view.View) appCompatImageView3, C39968qEl.Companion.EZpvd());
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ qEG AhwBna;
        public final /* synthetic */ C42883ren EZpvd;
        public final /* synthetic */ C40005qFv KWHzl;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C42883ren c42883ren, C40005qFv c40005qFv, qEG qeg, int i) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = c42883ren;
            this.KWHzl = c40005qFv;
            this.AhwBna = qeg;
            this.OLrzqt = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.Object objM7377constructorimpl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C40499qYc root = this.EZpvd.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                qHN qhnOLrzqt = qHO.OLrzqt(root);
                if (qhnOLrzqt != null) {
                    qhnOLrzqt.OLrzqt(this.KWHzl.KWHzl(), this.AhwBna.copydefault, this.OLrzqt);
                }
                C40499qYc root2 = this.EZpvd.getRoot();
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
                        qHM.StateListAnimator.navigateInstrumentDetailPage$default(qhm, this.KWHzl.KWHzl(), this.OLrzqt, this.AhwBna.copydefault, this.AhwBna.AEQbTJ(), true, false, 32, null);
                    }
                }
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C40005qFv AEQbTJ;
        public final /* synthetic */ int EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C42883ren OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C42883ren c42883ren, int i, C40005qFv c40005qFv) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = c42883ren;
            this.EZpvd = i;
            this.AEQbTJ = c40005qFv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.Object objM7377constructorimpl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C40499qYc root = this.OLrzqt.getRoot();
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
                    boolean z = fragment instanceof qHR;
                    java.lang.Object obj = fragment;
                    if (!z) {
                        androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
                        while (parentFragment != null && !(parentFragment instanceof qHR)) {
                            parentFragment = parentFragment.getParentFragment();
                        }
                        obj = (qHR) (parentFragment instanceof qHR ? parentFragment : null);
                    }
                    qHR qhr = (qHR) obj;
                    if (qhr != null) {
                        qhr.EZpvd(this.EZpvd, this.AEQbTJ.KWHzl(), !this.AEQbTJ.AkhnZx());
                    }
                }
            }
        }
    }
}
