package o;

import android.os.Build;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.okinc.unify_trade.biz.HomeStrategyFilterCoin;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vpD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51550vpD extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public AbstractC48390uPs EZpvd;
    public final Function1<HomeStrategyFilterCoin, Unit> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.biz.HomeStrategyFilterCoin, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C51550vpD(@NotNull Function1<? super HomeStrategyFilterCoin, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.vpE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51550vpD.AEQbTJ(this.EZpvd);
            }
        });
    }

    /* JADX INFO: renamed from: o.vpD$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vpD.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C51550vpD OLrzqt(@NotNull java.util.List<HomeStrategyFilterCoin> list, @NotNull Function1<? super HomeStrategyFilterCoin, Unit> function1) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(function1, "");
            C51550vpD c51550vpD = new C51550vpD(function1);
            c51550vpD.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("COINS_KEY", list)));
            return c51550vpD;
        }
    }

    public final java.util.List<HomeStrategyFilterCoin> KWHzl() {
        return (java.util.List) this.AEQbTJ.getValue();
    }

    public static final java.util.List AEQbTJ(C51550vpD c51550vpD) {
        java.util.ArrayList parcelableArrayList;
        java.util.ArrayList parcelableArrayList2;
        if (Build.VERSION.SDK_INT >= 33) {
            android.os.Bundle arguments = c51550vpD.getArguments();
            return (arguments == null || (parcelableArrayList2 = arguments.getParcelableArrayList("COINS_KEY", HomeStrategyFilterCoin.class)) == null) ? yDY.AhwBna() : parcelableArrayList2;
        }
        android.os.Bundle arguments2 = c51550vpD.getArguments();
        return (arguments2 == null || (parcelableArrayList = arguments2.getParcelableArrayList("COINS_KEY")) == null) ? yDY.AhwBna() : parcelableArrayList;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        wxq.setStyle(4);
        wxq.AEQbTJ().setVisibility(0);
        wxq.valueOf().setVisibility(8);
        wxq.setCloseVisibility(false);
        wxq.setDividerVisibility(false);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        OLrzqt();
        this.EZpvd = AbstractC48390uPs.copydefault(android.view.LayoutInflater.from(getContext()), constraintLayout, true);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        C51609vqJ c51609vqJ;
        C51609vqJ c51609vqJ2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AbstractC48390uPs abstractC48390uPs = this.EZpvd;
        if (abstractC48390uPs != null && (c51609vqJ2 = abstractC48390uPs.OLrzqt) != null) {
            c51609vqJ2.AEQbTJ(KWHzl());
        }
        AbstractC48390uPs abstractC48390uPs2 = this.EZpvd;
        if (abstractC48390uPs2 != null && (c51609vqJ = abstractC48390uPs2.OLrzqt) != null) {
            c51609vqJ.setOnCoinSelected(new Function0() { // from class: o.vpG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C51550vpD.OLrzqt(this.EZpvd);
                }
            });
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(C51550vpD c51550vpD) {
        C51609vqJ c51609vqJ;
        HomeStrategyFilterCoin homeStrategyFilterCoinCopydefault;
        AbstractC48390uPs abstractC48390uPs = c51550vpD.EZpvd;
        if (abstractC48390uPs != null && (c51609vqJ = abstractC48390uPs.OLrzqt) != null && (homeStrategyFilterCoinCopydefault = c51609vqJ.copydefault()) != null) {
            c51550vpD.OLrzqt.invoke(homeStrategyFilterCoinCopydefault);
            c51550vpD.dismissAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        setHeightRatio(0.93f);
    }
}
