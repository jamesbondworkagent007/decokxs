package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.tradingbot.impl.botList.domain.model.BacktestFilter;
import com.okinc.tradingbot.impl.botList.domain.model.SignalSelectionConfig;
import com.okinc.tradingbot.impl.botList.domain.model.SignalSelectionItem;
import com.okinc.tradingbot.impl.botList.domain.model.SignalType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC55274xgp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class uLK extends AbstractC52792wYn {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final boolean AEQbTJ;
    public Function1<? super BacktestFilter, Unit> EZpvd;
    public Function1<? super SignalType, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.AEQbTJ;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uLK.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final uLK copydefault(SignalSelectionConfig signalSelectionConfig) {
            uLK ulk = new uLK();
            ulk.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("config", signalSelectionConfig)));
            return ulk;
        }

        public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull SignalSelectionConfig.SignalTypeSelection signalTypeSelection, @NotNull Function1<? super SignalType, Unit> function1) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(signalTypeSelection, "");
            Intrinsics.checkNotNullParameter(function1, "");
            uLK ulkCopydefault = copydefault(signalTypeSelection);
            ulkCopydefault.OLrzqt = function1;
            C49662usl.EZpvd(ulkCopydefault, fragmentManager, "UnifiedSignalSelectionBottomSheet");
        }

        public final void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull SignalSelectionConfig.BacktestFilterSelection backtestFilterSelection, @NotNull Function1<? super BacktestFilter, Unit> function1) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(backtestFilterSelection, "");
            Intrinsics.checkNotNullParameter(function1, "");
            uLK ulkCopydefault = copydefault(backtestFilterSelection);
            ulkCopydefault.EZpvd = function1;
            C49662usl.EZpvd(ulkCopydefault, fragmentManager, "UnifiedSignalSelectionBottomSheet");
        }
    }

    public final SignalSelectionConfig AEQbTJ() {
        SignalSelectionConfig signalSelectionConfig;
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (signalSelectionConfig = (SignalSelectionConfig) arguments.getParcelable("config")) == null) {
            throw new java.lang.IllegalStateException("SignalSelectionConfig is required".toString());
        }
        return signalSelectionConfig;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.AbstractC52792wYn, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        c55198xfS.setType(0);
        SignalSelectionConfig signalSelectionConfigAEQbTJ = AEQbTJ();
        if (signalSelectionConfigAEQbTJ instanceof SignalSelectionConfig.SignalTypeSelection) {
            copydefault(c55198xfS, (SignalSelectionConfig.SignalTypeSelection) signalSelectionConfigAEQbTJ);
        } else {
            if (!(signalSelectionConfigAEQbTJ instanceof SignalSelectionConfig.BacktestFilterSelection)) {
                throw new NoWhenBranchMatchedException();
            }
            AEQbTJ(c55198xfS, (SignalSelectionConfig.BacktestFilterSelection) signalSelectionConfigAEQbTJ);
        }
    }

    public final void copydefault(C55198xfS c55198xfS, SignalSelectionConfig.SignalTypeSelection signalTypeSelection) {
        java.util.List<SignalSelectionItem<SignalType>> listOLrzqt = signalTypeSelection.AEQbTJ().OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        java.util.Iterator<T> it = listOLrzqt.iterator();
        while (it.hasNext()) {
            SignalSelectionItem signalSelectionItem = (SignalSelectionItem) it.next();
            arrayList.add(new C55276xgr(signalSelectionItem.copydefault(), signalSelectionItem.OLrzqt(), null, signalSelectionItem.OLrzqt() == signalTypeSelection.AEQbTJ().copydefault(), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        }
        InterfaceC55274xgp.StateListAnimator.setSingleOneColumnData$default(c55198xfS, arrayList, null, 2, null);
        c55198xfS.copydefault(new yHO() { // from class: o.uLL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return uLK.copydefault(this.OLrzqt, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        });
    }

    public static final Unit copydefault(uLK ulk, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        Function1<? super SignalType, Unit> function1;
        java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
        SignalType signalType = objOLrzqt instanceof SignalType ? (SignalType) objOLrzqt : null;
        if (signalType != null && (function1 = ulk.OLrzqt) != null) {
            function1.invoke(signalType);
        }
        ulk.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(C55198xfS c55198xfS, SignalSelectionConfig.BacktestFilterSelection backtestFilterSelection) {
        java.util.List<SignalSelectionItem<BacktestFilter>> listKWHzl = backtestFilterSelection.OLrzqt().KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        java.util.Iterator<T> it = listKWHzl.iterator();
        while (it.hasNext()) {
            SignalSelectionItem signalSelectionItem = (SignalSelectionItem) it.next();
            arrayList.add(new C55276xgr(signalSelectionItem.copydefault(), signalSelectionItem.OLrzqt(), null, signalSelectionItem.OLrzqt() == backtestFilterSelection.OLrzqt().OLrzqt(), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        }
        InterfaceC55274xgp.StateListAnimator.setSingleOneColumnData$default(c55198xfS, arrayList, null, 2, null);
        c55198xfS.copydefault(new yHO() { // from class: o.uLR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return uLK.KWHzl(this.KWHzl, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        });
    }

    public static final Unit KWHzl(uLK ulk, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        Function1<? super BacktestFilter, Unit> function1;
        java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
        BacktestFilter backtestFilter = objOLrzqt instanceof BacktestFilter ? (BacktestFilter) objOLrzqt : null;
        if (backtestFilter != null && (function1 = ulk.EZpvd) != null) {
            function1.invoke(backtestFilter);
        }
        ulk.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.OLrzqt = null;
        this.EZpvd = null;
    }
}
