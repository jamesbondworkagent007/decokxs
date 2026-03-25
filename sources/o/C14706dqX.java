package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingUtil;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.business.defi.biz.net.bean.WalletPnlAnalysisResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dqX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14706dqX extends ConstraintLayout {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public java.lang.String AEQbTJ;
    public boolean AYXKKw;
    public AbstractC16924etB KWHzl;
    public int OLrzqt;
    public WalletPnlAnalysisResponse copydefault;
    public Function0<Unit> gEmmrt;
    public Function0<Unit> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14706dqX(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14706dqX(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletPnlAnalysisResponse EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnPeriodTypeClick(Function0<Unit> function0) {
        this.valueOf = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnRetryCallBack(Function0<Unit> function0) {
        this.gEmmrt = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:21) call: o.dqX.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C14706dqX(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14706dqX(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        android.widget.LinearLayout linearLayout;
        AppCompatTextView appCompatTextView;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = 1;
        this.AYXKKw = true;
        this.AEQbTJ = "3";
        try {
            this.KWHzl = (AbstractC16924etB) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C13754dXa.TaskDescription.itxZVF, this, true);
        } catch (java.lang.Exception e) {
            C10856bwO.copydefault("DefiProfilePnlAnalysisView", 0, "inflate layout failed: " + e.getMessage(), e);
        }
        this.AEQbTJ = "3";
        AbstractC16924etB abstractC16924etB = this.KWHzl;
        if (abstractC16924etB != null && (appCompatTextView = abstractC16924etB.gEmmrt) != null) {
            appCompatTextView.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.zUtmHU));
        }
        AbstractC16924etB abstractC16924etB2 = this.KWHzl;
        if (abstractC16924etB2 == null || (linearLayout = abstractC16924etB2.AhwBna) == null) {
            return;
        }
        linearLayout.setOnClickListener(new StateListAnimator(linearLayout, 1000L, this));
    }

    /* JADX INFO: renamed from: o.dqX$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dqX.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void setPeriodType(@NotNull java.lang.String str) {
        AppCompatTextView appCompatTextView;
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        AbstractC16924etB abstractC16924etB = this.KWHzl;
        if (abstractC16924etB == null || (appCompatTextView = abstractC16924etB.gEmmrt) == null) {
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "4")) {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.validateSHA256);
        } else {
            strAYXKKw = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "5") ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.validateAndPutInMap) : C33070mpX.AYXKKw(C13754dXa.FragmentManager.zUtmHU);
        }
        appCompatTextView.setText(strAYXKKw);
    }

    public final void AEQbTJ() {
        int i;
        if (this.AYXKKw && (i = this.OLrzqt) == 3) {
            setData$default(this, this.copydefault, i, false, 4, null);
        }
    }

    public static /* synthetic */ void setData$default(C14706dqX c14706dqX, WalletPnlAnalysisResponse walletPnlAnalysisResponse, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        c14706dqX.setData(walletPnlAnalysisResponse, i, z);
    }

    public static final void setData$lambda$2$lambda$1(C14706dqX c14706dqX, android.view.View view) {
        Function0<Unit> function0 = c14706dqX.gEmmrt;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setData(WalletPnlAnalysisResponse walletPnlAnalysisResponse, int i, boolean z) {
        Group group;
        C55173xeu c55173xeu;
        C55173xeu c55173xeu2;
        Group group2;
        C14771drj c14771drj;
        C14771drj c14771drj2;
        C14766dre c14766dre;
        C14772drk c14772drk;
        C14764drc c14764drc;
        Group group3;
        C55173xeu c55173xeu3;
        this.copydefault = walletPnlAnalysisResponse;
        this.OLrzqt = i;
        this.AYXKKw = z;
        if (i == 1) {
            KWHzl();
            AbstractC16924etB abstractC16924etB = this.KWHzl;
            if (abstractC16924etB != null && (c55173xeu = abstractC16924etB.EZpvd) != null) {
                c55173xeu.setVisibility(8);
            }
            AbstractC16924etB abstractC16924etB2 = this.KWHzl;
            if (abstractC16924etB2 == null || (group = abstractC16924etB2.AEQbTJ) == null) {
                return;
            }
            group.setVisibility(4);
            return;
        }
        if (i == 2) {
            OLrzqt();
            AbstractC16924etB abstractC16924etB3 = this.KWHzl;
            if (abstractC16924etB3 != null && (group2 = abstractC16924etB3.AEQbTJ) != null) {
                group2.setVisibility(4);
            }
            AbstractC16924etB abstractC16924etB4 = this.KWHzl;
            if (abstractC16924etB4 == null || (c55173xeu2 = abstractC16924etB4.EZpvd) == null) {
                return;
            }
            c55173xeu2.setVisibility(0);
            c55173xeu2.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
            c55173xeu2.setEmptyTypeImage(8);
            c55173xeu2.setRetry(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNUfqk));
            c55173xeu2.setRetryClickListener(new View.OnClickListener() { // from class: o.drd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C14706dqX.setData$lambda$2$lambda$1(this.KWHzl, view);
                }
            });
            return;
        }
        if (i != 3) {
            return;
        }
        OLrzqt();
        AbstractC16924etB abstractC16924etB5 = this.KWHzl;
        if (abstractC16924etB5 != null && (c55173xeu3 = abstractC16924etB5.EZpvd) != null) {
            c55173xeu3.setVisibility(8);
        }
        AbstractC16924etB abstractC16924etB6 = this.KWHzl;
        if (abstractC16924etB6 != null && (group3 = abstractC16924etB6.AEQbTJ) != null) {
            group3.setVisibility(0);
        }
        AbstractC16924etB abstractC16924etB7 = this.KWHzl;
        if (abstractC16924etB7 != null && (c14764drc = abstractC16924etB7.copydefault) != null) {
            c14764drc.setData(walletPnlAnalysisResponse != null ? walletPnlAnalysisResponse.getTotalPnl() : null, walletPnlAnalysisResponse != null ? walletPnlAnalysisResponse.getTotalPnlRoi() : null, walletPnlAnalysisResponse != null ? walletPnlAnalysisResponse.getDatePnlList() : null, z);
        }
        AbstractC16924etB abstractC16924etB8 = this.KWHzl;
        if (abstractC16924etB8 != null && (c14772drk = abstractC16924etB8.fetchVPNInfo) != null) {
            c14772drk.setData(walletPnlAnalysisResponse != null ? walletPnlAnalysisResponse.getTotalWinRate() : null, z);
        }
        AbstractC16924etB abstractC16924etB9 = this.KWHzl;
        if (abstractC16924etB9 != null && (c14766dre = abstractC16924etB9.isConnected) != null) {
            c14766dre.setData(walletPnlAnalysisResponse != null ? walletPnlAnalysisResponse.getTotalTxsBuy() : null, walletPnlAnalysisResponse != null ? walletPnlAnalysisResponse.getTotalTxsSell() : null, z);
        }
        AbstractC16924etB abstractC16924etB10 = this.KWHzl;
        if (abstractC16924etB10 != null && (c14771drj2 = abstractC16924etB10.KWHzl) != null) {
            c14771drj2.setBuyData(walletPnlAnalysisResponse != null ? walletPnlAnalysisResponse.getTotalVolumeBuy() : null, z);
        }
        AbstractC16924etB abstractC16924etB11 = this.KWHzl;
        if (abstractC16924etB11 == null || (c14771drj = abstractC16924etB11.AYXKKw) == null) {
            return;
        }
        c14771drj.setSellData(walletPnlAnalysisResponse != null ? walletPnlAnalysisResponse.getTotalVolumeSell() : null, z);
    }

    public final void KWHzl() {
        LottieAnimationView lottieAnimationView;
        AbstractC16924etB abstractC16924etB = this.KWHzl;
        if (abstractC16924etB == null || (lottieAnimationView = abstractC16924etB.djBIcL) == null) {
            return;
        }
        lottieAnimationView.setAnimation(C13754dXa.Fragment.fetchVPNInfo);
        lottieAnimationView.playAnimation();
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.setVisibility(0);
    }

    public final void OLrzqt() {
        LottieAnimationView lottieAnimationView;
        AbstractC16924etB abstractC16924etB = this.KWHzl;
        if (abstractC16924etB == null || (lottieAnimationView = abstractC16924etB.djBIcL) == null) {
            return;
        }
        lottieAnimationView.setVisibility(8);
        lottieAnimationView.pauseAnimation();
        lottieAnimationView.cancelAnimation();
    }

    public final void setOnChartShareClickListener(Function0<Unit> function0) {
        C14764drc c14764drc;
        AbstractC16924etB abstractC16924etB = this.KWHzl;
        if (abstractC16924etB == null || (c14764drc = abstractC16924etB.copydefault) == null) {
            return;
        }
        c14764drc.setOnShareClickListener(function0);
    }

    /* JADX INFO: renamed from: o.dqX$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C14706dqX EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C14706dqX c14706dqX) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c14706dqX;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function0 function0 = this.EZpvd.valueOf;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }
}
