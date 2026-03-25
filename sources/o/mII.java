package o;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.cruilib.view.infinitescroll.InfiniteScrollViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.mDC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public abstract class mII extends mIL {
    public AbstractC31883mHl AhwBna;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int valueOf = 8;
    public static final java.lang.String AYXKKw = mII.class.getSimpleName();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull AbstractC31883mHl abstractC31883mHl) {
        Intrinsics.checkNotNullParameter(abstractC31883mHl, "");
        this.AhwBna = abstractC31883mHl;
    }

    public abstract InfiniteScrollViewModel valueOf();

    /* JADX DEBUG: Possible override for method o.mIL.AEQbTJ()V */
    public final AbstractC31883mHl AEQbTJ() {
        AbstractC31883mHl abstractC31883mHl = this.AhwBna;
        if (abstractC31883mHl != null) {
            return abstractC31883mHl;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final RecyclerView gEmmrt() {
        RecyclerView recyclerView = AEQbTJ().copydefault;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        return recyclerView;
    }

    public final C55173xeu AYXKKw() {
        C55173xeu c55173xeu = AEQbTJ().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        return c55173xeu;
    }

    public final android.widget.FrameLayout djBIcL() {
        android.widget.FrameLayout frameLayout = AEQbTJ().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        return frameLayout;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        copydefault(AbstractC31883mHl.AEQbTJ(layoutInflater, viewGroup, false));
        android.view.View root = AEQbTJ().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (valueOf().copydefault()) {
            valueOf().AEQbTJ(InfiniteScrollViewModel.RefreshAction.ON_VISIBLE);
            valueOf().AEQbTJ(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        RecyclerView recyclerViewGEmmrt = gEmmrt();
        recyclerViewGEmmrt.clearOnScrollListeners();
        recyclerViewGEmmrt.setAdapter(null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mII */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void toggleFullLoading$default(mII mii, boolean z, Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toggleFullLoading");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        mii.KWHzl(z, (Function0<Unit>) function0);
    }

    public void KWHzl(boolean z, final Function0<Unit> function0) {
        android.widget.FrameLayout frameLayoutDjBIcL = djBIcL();
        if (z) {
            if (frameLayoutDjBIcL.getVisibility() == 0) {
                return;
            }
            C31889mHr.fadeIn$default(frameLayoutDjBIcL, 250L, null, new Function0() { // from class: o.mIK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return mII.EZpvd(function0);
                }
            }, 2, null);
        } else if (frameLayoutDjBIcL.getVisibility() == 0) {
            C31889mHr.fadeOut$default(frameLayoutDjBIcL, 250L, null, null, new Function0() { // from class: o.mIR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return mII.AEQbTJ(function0);
                }
            }, 6, null);
        }
    }

    public static final Unit EZpvd(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void showEmptyView$default(mII mii, boolean z, mIE mie, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showEmptyView");
        }
        if ((i & 2) != 0) {
            mie = null;
        }
        mii.AEQbTJ(z, mie);
    }

    public void AEQbTJ(boolean z, final mIE mie) {
        C55173xeu c55173xeuAYXKKw = AYXKKw();
        if (!z) {
            c55173xeuAYXKKw.setVisibility(8);
            return;
        }
        if (mie == null) {
            mie = new mIE(10, c55173xeuAYXKKw.getContext().getString(mDC.PendingIntent.AhwBna), c55173xeuAYXKKw.getContext().getString(mDC.PendingIntent.valueOf), c55173xeuAYXKKw.getContext().getString(mDC.PendingIntent.OLrzqt), new Function0() { // from class: o.mIM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return mII.AEQbTJ(this.AEQbTJ);
                }
            });
        }
        c55173xeuAYXKKw.setVisibility(0);
        java.lang.Integer numEZpvd = mie.EZpvd();
        c55173xeuAYXKKw.setEmptyTypeImage(numEZpvd != null ? numEZpvd.intValue() : 10);
        java.lang.String strKWHzl = mie.KWHzl();
        if (strKWHzl != null) {
            c55173xeuAYXKKw.setTitle(strKWHzl);
        }
        java.lang.String strCopydefault = mie.copydefault();
        if (strCopydefault != null) {
            c55173xeuAYXKKw.setSubTitle((java.lang.CharSequence) strCopydefault);
        }
        java.lang.String strOLrzqt = mie.OLrzqt();
        if (strOLrzqt != null) {
            c55173xeuAYXKKw.setRetry(strOLrzqt);
        }
        if (mie.AEQbTJ() != null) {
            c55173xeuAYXKKw.setRetryClickListener(new View.OnClickListener() { // from class: o.mIJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    mII.KWHzl(mie, view);
                }
            });
        }
    }

    public static final Unit AEQbTJ(mII mii) {
        InfiniteScrollViewModel.refreshItemList$default(mii.valueOf(), null, 1, null);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(mIE mie, android.view.View view) {
        mie.AEQbTJ().invoke();
    }

    public final void OLrzqt(RecyclerView recyclerView, int i) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        Application application = new Application(recyclerView.getContext());
        application.setTargetPosition(i);
        linearLayoutManager.startSmoothScroll(application);
    }

    public static final class Application extends LinearSmoothScroller {
        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int getVerticalSnapPreference() {
            return -1;
        }

        public Application(android.content.Context context) {
            super(context);
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mII.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
