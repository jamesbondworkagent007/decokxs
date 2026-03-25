package o;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.okinc.biz.TacticsType;
import com.okinc.tradingbot.impl.strategy.guide.presenter.BotGuideContractGridPresenter;
import com.okinc.tradingbot.impl.strategy.guide.view.BotGuideLossInsuranceView$countDownCoroutines$1;
import com.okinc.tradingbot.impl.strategy.guide.view.BotGuideLossInsuranceView$countDownCoroutines$2;
import com.okinc.tradingbot.impl.strategy.guide.view.BotGuideLossInsuranceView$countDownTimer$1$1;
import com.okinc.unify_trade.biz.LossInsuranceDisplayData;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.biz.TacticsVoucherType;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wMn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52468wMn extends ConstraintLayout {
    public boolean EZpvd;
    public Job KWHzl;
    public LossInsuranceDisplayData OLrzqt;
    public uXL copydefault;
    public final InterfaceC56387yDm gEmmrt;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.wMn$Application */
    /* JADX INFO: loaded from: classes17.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TacticsVoucherType.values().length];
            try {
                iArr[TacticsVoucherType.STRATEGY_COMPENSATION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TacticsVoucherType.AIRDROP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52468wMn(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52468wMn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNegativeContract(boolean z) {
        this.EZpvd = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:55) call: o.wMn.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C52468wMn(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52468wMn(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.wMm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52468wMn.AEQbTJ(context);
            }
        });
        uXL uxlEZpvd = uXL.EZpvd(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(uxlEZpvd, "");
        this.copydefault = uxlEZpvd;
        EZpvd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BotGuideContractGridPresenter OLrzqt() {
        return (BotGuideContractGridPresenter) this.gEmmrt.getValue();
    }

    public static final BotGuideContractGridPresenter AEQbTJ(android.content.Context context) {
        AppCompatActivity appCompatActivityCopydefault = C49955uyM.copydefault(context);
        if (appCompatActivityCopydefault != null) {
            return (BotGuideContractGridPresenter) new ViewModelProvider(appCompatActivityCopydefault).get(BotGuideContractGridPresenter.class);
        }
        return null;
    }

    /* JADX INFO: renamed from: o.wMn$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wMn.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    private final void EZpvd() {
        C55258xgZ c55258xgZ = this.copydefault.OLrzqt;
        c55258xgZ.setOnClickListener(new ActionBar(c55258xgZ, 1000L, this));
    }

    private final void EZpvd(LossInsuranceDisplayData lossInsuranceDisplayData) {
        java.lang.String strAYXKKw;
        C55258xgZ c55258xgZ = this.copydefault.OLrzqt;
        if ((lossInsuranceDisplayData != null ? lossInsuranceDisplayData.getVoucherType() : null) == null) {
            c55258xgZ.setHelperLabelType(2);
        }
        TacticsVoucherType voucherType = lossInsuranceDisplayData != null ? lossInsuranceDisplayData.getVoucherType() : null;
        int i = voucherType == null ? -1 : Application.EZpvd[voucherType.ordinal()];
        if (i == 1) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.fTEjYi);
        } else if (i == 2) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.onAvailable);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.getMediaType);
        }
        c55258xgZ.setTextValue(strAYXKKw);
    }

    public final void copydefault() {
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        if (lifecycleOwner != null) {
            Job job = this.KWHzl;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
            this.KWHzl = AEQbTJ(lifecycleOwner, new BotGuideLossInsuranceView$countDownTimer$1$1(this, null));
        }
    }

    /* JADX INFO: renamed from: o.wMn$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C52468wMn KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C52468wMn c52468wMn) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = c52468wMn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String voucherId;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                LossInsuranceDisplayData lossInsuranceDisplayData = this.KWHzl.OLrzqt;
                if (lossInsuranceDisplayData != null) {
                    android.content.Context context = this.KWHzl.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    AppCompatActivity appCompatActivityCopydefault = C49955uyM.copydefault(context);
                    if (appCompatActivityCopydefault != null) {
                        C52659wTp c52659wTp = C52659wTp.copydefault;
                        java.lang.String str = (!Intrinsics.EZpvd(lossInsuranceDisplayData.getEligible(), java.lang.Boolean.TRUE) || (voucherId = lossInsuranceDisplayData.getVoucherId()) == null) ? "" : voucherId;
                        TacticsVoucherType voucherType = lossInsuranceDisplayData.getVoucherType();
                        if (voucherType == null) {
                            voucherType = TacticsVoucherType.STRATEGY_COMPENSATION;
                        }
                        TacticsVoucherInfo tacticsVoucherInfo = new TacticsVoucherInfo((java.lang.String) null, str, voucherType, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 2041, (DefaultConstructorMarker) null);
                        TacticsType.TaskDescription taskDescription = TacticsType.Companion;
                        java.lang.String botType = lossInsuranceDisplayData.getBotType();
                        c52659wTp.AEQbTJ(appCompatActivityCopydefault, tacticsVoucherInfo, false, taskDescription.AEQbTJ(botType != null ? botType : ""), this.KWHzl.KWHzl());
                    }
                }
            }
        }
    }

    public final void copydefault(LossInsuranceDisplayData lossInsuranceDisplayData) {
        java.lang.String strAYXKKw;
        Job job = this.KWHzl;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        android.widget.LinearLayout linearLayout = this.copydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
        AppCompatTextView appCompatTextView = this.copydefault.AhwBna;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(0);
        AppCompatTextView appCompatTextView2 = this.copydefault.AhwBna;
        Intrinsics.copydefault(appCompatTextView2);
        appCompatTextView2.setVisibility(0);
        TacticsVoucherType voucherType = lossInsuranceDisplayData != null ? lossInsuranceDisplayData.getVoucherType() : null;
        int i = voucherType == null ? -1 : Application.EZpvd[voucherType.ordinal()];
        if (i != 1 && i == 2) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.SQPLEi);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.OpenForTesting);
        }
        appCompatTextView2.setText(strAYXKKw);
    }

    public final Job AEQbTJ(LifecycleOwner lifecycleOwner, Function2<? super Unit, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        return FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle(FlowKt.flowOn(FlowKt.conflate(FlowKt.flow(new BotGuideLossInsuranceView$countDownCoroutines$1(booleanRef, null))), Dispatchers.getDefault()), lifecycleOwner.getLifecycle(), Lifecycle.State.RESUMED), new BotGuideLossInsuranceView$countDownCoroutines$2(function2, null)), LifecycleOwnerKt.getLifecycleScope(lifecycleOwner));
    }

    public final kotlin.Pair<java.lang.Boolean, C55980xuF> copydefault(long j) {
        java.lang.String strGEmmrt;
        java.lang.String strGEmmrt2;
        java.lang.String strGEmmrt3;
        java.lang.String strGEmmrt4;
        if (C33129mqd.valueOf(java.lang.Long.valueOf(j), 0)) {
            return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, null);
        }
        long j2 = 86400000;
        long j3 = j / j2;
        long j4 = 3600000;
        long j5 = (j % j2) / j4;
        long j6 = 60000;
        long j7 = (j % j4) / j6;
        long j8 = (j % j6) / ((long) 1000);
        if (j3 >= 10) {
            strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(j3));
        } else {
            strGEmmrt = "0" + j3;
        }
        if (j5 >= 10) {
            strGEmmrt2 = C33129mqd.gEmmrt(java.lang.Long.valueOf(j5));
        } else {
            strGEmmrt2 = "0" + j5;
        }
        if (j7 >= 10) {
            strGEmmrt3 = C33129mqd.gEmmrt(java.lang.Long.valueOf(j7));
        } else {
            strGEmmrt3 = "0" + j7;
        }
        if (j8 >= 10) {
            strGEmmrt4 = C33129mqd.gEmmrt(java.lang.Long.valueOf(j8));
        } else {
            strGEmmrt4 = "0" + j8;
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, new C55980xuF(strGEmmrt, strGEmmrt2, strGEmmrt3, strGEmmrt4));
    }

    public final void setData(LossInsuranceDisplayData lossInsuranceDisplayData) {
        setVisibility(0);
        this.OLrzqt = lossInsuranceDisplayData;
        EZpvd(lossInsuranceDisplayData);
        LossInsuranceDisplayData lossInsuranceDisplayData2 = this.OLrzqt;
        if (lossInsuranceDisplayData2 != null && lossInsuranceDisplayData2.getCanShowVoucherInfo()) {
            copydefault();
        } else {
            copydefault(lossInsuranceDisplayData);
        }
    }
}
