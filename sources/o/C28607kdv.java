package o;

import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.features.meme.domain.model.MemeUiModel;
import com.okinc.business.market.features.meme.ui.MemeActivityViewModelV2;
import com.okinc.business.market.features.meme.ui.views.ToolButton;
import com.okinc.business.market.features.meme.ui.views.ToolDialogParams;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C28893kjP;
import o.C52761wXj;
import o.C52812wZg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kdv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28607kdv {
    public final WeakReference<androidx.fragment.app.Fragment> EZpvd;
    public boolean KWHzl;
    public C52812wZg OLrzqt;
    public OneShotPreDrawListener copydefault;

    /* JADX INFO: renamed from: o.kdv$Activity */
    public static final class Activity implements java.lang.Runnable {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ C28607kdv AYXKKw;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C28893kjP KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C28848kiX copydefault;
        public final /* synthetic */ MemeActivityViewModelV2 djBIcL;
        public final /* synthetic */ android.view.View valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, C28607kdv c28607kdv, android.view.View view2, android.view.View view3, C28848kiX c28848kiX, C28893kjP c28893kjP, MemeActivityViewModelV2 memeActivityViewModelV2, int i) {
            this.valueOf = view;
            this.AYXKKw = c28607kdv;
            this.EZpvd = view2;
            this.OLrzqt = view3;
            this.copydefault = c28848kiX;
            this.KWHzl = c28893kjP;
            this.djBIcL = memeActivityViewModelV2;
            this.AEQbTJ = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.AYXKKw.copydefault = null;
            androidx.fragment.app.Fragment fragmentKWHzl = this.AYXKKw.KWHzl();
            if (fragmentKWHzl == null) {
                return;
            }
            if (!this.AYXKKw.EZpvd(fragmentKWHzl) || fragmentKWHzl.isHidden()) {
                this.AYXKKw.KWHzl = false;
            } else {
                this.AYXKKw.EZpvd(fragmentKWHzl, this.EZpvd, this.OLrzqt, this.copydefault, this.KWHzl, this.djBIcL, this.AEQbTJ);
            }
        }
    }

    public C28607kdv(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.EZpvd = new WeakReference<>(fragment);
    }

    public final androidx.fragment.app.Fragment KWHzl() {
        return this.EZpvd.get();
    }

    public final boolean EZpvd(androidx.fragment.app.Fragment fragment) {
        return fragment != null && fragment.isAdded() && fragment.getView() != null && fragment.getViewLifecycleOwner().getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED);
    }

    public final void AEQbTJ() {
        OneShotPreDrawListener oneShotPreDrawListener = this.copydefault;
        if (oneShotPreDrawListener != null) {
            oneShotPreDrawListener.removeListener();
        }
        this.copydefault = null;
        C52812wZg c52812wZg = this.OLrzqt;
        if (c52812wZg != null) {
            c52812wZg.KWHzl((Function0<Unit>) null);
            c52812wZg.AEQbTJ((Function0<Unit>) null);
            c52812wZg.EZpvd((Function0<Unit>) null);
            c52812wZg.KWHzl();
        }
        this.OLrzqt = null;
        this.KWHzl = false;
    }

    public final void EZpvd(@NotNull java.util.List<MemeUiModel> list, boolean z, @NotNull final RecyclerView recyclerView, final int i, @NotNull final MemeActivityViewModelV2 memeActivityViewModelV2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(memeActivityViewModelV2, "");
        final MemeUiModel memeUiModel = (MemeUiModel) CollectionsKt___CollectionsKt.AkhnZx(list, 1);
        if (memeUiModel == null || !z || this.KWHzl || KWHzl() == null) {
            return;
        }
        memeActivityViewModelV2.EZpvd(i, true);
        this.KWHzl = true;
        recyclerView.post(new java.lang.Runnable() { // from class: o.kdC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C28607kdv.copydefault(this.KWHzl, recyclerView, memeActivityViewModelV2, memeUiModel, i);
            }
        });
    }

    public static final void copydefault(C28607kdv c28607kdv, RecyclerView recyclerView, MemeActivityViewModelV2 memeActivityViewModelV2, MemeUiModel memeUiModel, int i) {
        android.view.View view;
        android.view.View view2;
        android.view.View viewFindViewById;
        android.view.View view3;
        android.view.View view4;
        androidx.fragment.app.Fragment fragmentKWHzl = c28607kdv.KWHzl();
        if (fragmentKWHzl == null) {
            return;
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(1);
        C28848kiX c28848kiX = (viewHolderFindViewHolderForAdapterPosition == null || (view4 = viewHolderFindViewHolderForAdapterPosition.itemView) == null) ? null : (C28848kiX) view4.findViewById(C23274hvD.Application.ReportDrawnKtReportDrawnWhenfullyDrawnReporter1);
        android.view.View viewFindViewById2 = (viewHolderFindViewHolderForAdapterPosition == null || (view3 = viewHolderFindViewHolderForAdapterPosition.itemView) == null) ? null : view3.findViewById(C23274hvD.Application.sEcTXd);
        if (viewHolderFindViewHolderForAdapterPosition == null || (view2 = viewHolderFindViewHolderForAdapterPosition.itemView) == null || (viewFindViewById = view2.findViewById(C23274hvD.Application.DPHOMC)) == null) {
            view = viewHolderFindViewHolderForAdapterPosition != null ? viewHolderFindViewHolderForAdapterPosition.itemView : null;
        } else {
            view = viewFindViewById;
        }
        if (!fragmentKWHzl.isAdded() || c28607kdv.OLrzqt != null || viewHolderFindViewHolderForAdapterPosition == null || c28848kiX == null || viewFindViewById2 == null || view == null) {
            c28607kdv.KWHzl = false;
            return;
        }
        c28848kiX.KWHzl(false);
        memeActivityViewModelV2.djBIcL();
        OneShotPreDrawListener oneShotPreDrawListenerAdd = OneShotPreDrawListener.add(view, new Activity(view, c28607kdv, viewFindViewById2, view, c28848kiX, c28607kdv.AEQbTJ(view, memeUiModel), memeActivityViewModelV2, i));
        Intrinsics.checkNotNullExpressionValue(oneShotPreDrawListenerAdd, "");
        c28607kdv.copydefault = oneShotPreDrawListenerAdd;
    }

    public final C28893kjP AEQbTJ(android.view.View view, MemeUiModel memeUiModel) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        C28893kjP.ActionBar actionBar = C28893kjP.Companion;
        kotlin.Pair<java.lang.Integer, java.lang.Integer> pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(iArr[0] + (view.getWidth() / 2) + C55298xhM.dpInt$default(72, (android.content.Context) null, 1, (java.lang.Object) null)), java.lang.Integer.valueOf(iArr[1]));
        int i = C52761wXj.TaskDescription.invokespecialgBtXYZ;
        int i2 = C52761wXj.Activity.fdOvFl;
        android.content.Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C25382ivf.copydefault(i2, context);
        java.lang.String string = view.getContext().getString(C23274hvD.Fragment.getActiveNotifications);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return actionBar.KWHzl(pairOLrzqt, new ToolDialogParams(C56402yEa.EZpvd(new ToolButton(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(iCopydefault), string, null, memeUiModel, 8, null))));
    }

    public final void EZpvd(final androidx.fragment.app.Fragment fragment, android.view.View view, android.view.View view2, final C28848kiX c28848kiX, final C28893kjP c28893kjP, final MemeActivityViewModelV2 memeActivityViewModelV2, final int i) {
        if (!fragment.isAdded() || fragment.getView() == null || fragment.getActivity() == null) {
            this.KWHzl = false;
            return;
        }
        FragmentActivity activity = fragment.getActivity();
        if (activity == null) {
            return;
        }
        C52812wZg c52812wZg = new C52812wZg(activity);
        final C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(view);
        stateListAnimator.EZpvd(2);
        stateListAnimator.OLrzqt(view.getContext().getString(C23274hvD.Fragment.profile));
        stateListAnimator.copydefault(new Function0() { // from class: o.kdy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C28607kdv.KWHzl(c28848kiX, c28893kjP, fragment, stateListAnimator));
            }
        });
        Unit unit = Unit.INSTANCE;
        C52812wZg.StateListAnimator stateListAnimator2 = new C52812wZg.StateListAnimator(view2);
        stateListAnimator2.EZpvd(1);
        stateListAnimator2.OLrzqt(view2.getContext().getString(C23274hvD.Fragment.siEkQe));
        stateListAnimator2.KWHzl(new Function0() { // from class: o.kdz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C28607kdv.OLrzqt(c28848kiX));
            }
        });
        c52812wZg.EZpvd(yDY.AhwBna(stateListAnimator, stateListAnimator2));
        c52812wZg.OLrzqt(3);
        c52812wZg.KWHzl(false);
        c52812wZg.KWHzl(new Function0() { // from class: o.kdB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28607kdv.copydefault(this.copydefault, c28893kjP, memeActivityViewModelV2, i);
            }
        });
        c52812wZg.AEQbTJ(new Function0() { // from class: o.kdA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28607kdv.AEQbTJ(this.OLrzqt, c28893kjP, memeActivityViewModelV2, i);
            }
        });
        if (!fragment.isAdded() || fragment.getView() == null) {
            this.KWHzl = false;
            return;
        }
        try {
            this.OLrzqt = c52812wZg;
            c52812wZg.fARcdN();
        } catch (java.lang.Exception unused) {
        }
    }

    public static final boolean KWHzl(C28848kiX c28848kiX, C28893kjP c28893kjP, androidx.fragment.app.Fragment fragment, C52812wZg.StateListAnimator stateListAnimator) {
        c28848kiX.EZpvd(true);
        androidx.fragment.app.FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c28893kjP.show(childFragmentManager, stateListAnimator.getClass().getName() + "_coachmark");
        return false;
    }

    public static final boolean OLrzqt(C28848kiX c28848kiX) {
        c28848kiX.KWHzl(false);
        return false;
    }

    public static final Unit copydefault(C28607kdv c28607kdv, C28893kjP c28893kjP, MemeActivityViewModelV2 memeActivityViewModelV2, int i) {
        c28607kdv.AEQbTJ(c28893kjP, memeActivityViewModelV2, i);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C28607kdv c28607kdv, C28893kjP c28893kjP, MemeActivityViewModelV2 memeActivityViewModelV2, int i) {
        c28607kdv.AEQbTJ(c28893kjP, memeActivityViewModelV2, i);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(C28893kjP c28893kjP, MemeActivityViewModelV2 memeActivityViewModelV2, int i) {
        this.OLrzqt = null;
        try {
            androidx.fragment.app.Fragment fragmentKWHzl = KWHzl();
            if (fragmentKWHzl != null && fragmentKWHzl.isAdded() && fragmentKWHzl.getView() != null) {
                if (c28893kjP != null) {
                    c28893kjP.dismissAllowingStateLoss();
                }
                memeActivityViewModelV2.AYXKKw();
                memeActivityViewModelV2.copydefault(i, true);
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
