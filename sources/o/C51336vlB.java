package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.PointerIconCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.okinc.biz.TradeType;
import com.okinc.tradingbot.impl.market_place.bot_copy.bean.CopyBotReqParam;
import com.okinc.tradingbot.impl.market_place.bot_copy.presenter.StgyCopyPresenter;
import com.okinc.unify_trade.biz.AdditionalInvest;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.LossInsuranceDisplayData;
import com.okinc.unify_trade.biz.MpStgyParam;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vlB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51336vlB extends AbstractC51292vkK implements InterfaceC53558wnk {
    public Function2<? super C47988uAv, ? super java.lang.String, Unit> AEQbTJ;
    public Function1<? super java.lang.String, Unit> EZpvd;
    public AbstractC48579uWq KWHzl;
    public Function1<? super java.lang.String, Unit> OLrzqt;
    public C51330vkw copydefault;

    /* JADX INFO: renamed from: o.vlB$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51336vlB(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51336vlB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51292vkK
    public void setAmtChangeListener(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51292vkK
    public void setQuotePercentListener(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:39) call: o.vlB.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C51336vlB(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51336vlB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AkhnZx();
        gEmmrt();
        valueOf();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        DbNXlk();
    }

    private final void DbNXlk() {
        C56155xxV c56155xxVCopydefault;
        C56109xwc<java.lang.Exception> c56109xwcAhwBna;
        C56111xwe<AdditionalInvest> c56111xweOLrzqt;
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        if (lifecycleOwner != null) {
            C51330vkw c51330vkw = this.copydefault;
            if (c51330vkw != null && (c56111xweOLrzqt = c51330vkw.OLrzqt()) != null) {
                c56111xweOLrzqt.observe(lifecycleOwner, new TaskDescription(new Function1() { // from class: o.vlC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C51336vlB.KWHzl(this.AEQbTJ, (AdditionalInvest) obj);
                    }
                }));
            }
            C51330vkw c51330vkw2 = this.copydefault;
            if (c51330vkw2 == null || (c56155xxVCopydefault = c51330vkw2.copydefault()) == null || (c56109xwcAhwBna = c56155xxVCopydefault.AhwBna()) == null) {
                return;
            }
            c56109xwcAhwBna.observe(lifecycleOwner, new TaskDescription(new Function1() { // from class: o.vlK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51336vlB.OLrzqt(this.OLrzqt, (java.lang.Exception) obj);
                }
            }));
        }
    }

    public static final Unit KWHzl(C51336vlB c51336vlB, AdditionalInvest additionalInvest) {
        Intrinsics.checkNotNullParameter(additionalInvest, "");
        c51336vlB.values();
        c51336vlB.KWHzl(additionalInvest);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C51336vlB c51336vlB, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        c51336vlB.values();
        c51336vlB.KWHzl((AdditionalInvest) null);
        return Unit.INSTANCE;
    }

    private final void AkhnZx() {
        this.KWHzl = (AbstractC48579uWq) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.zEHIKV, this, true);
        setOrientation(1);
        values();
    }

    @Override // o.AbstractC51292vkK
    public void OLrzqt(StrategyConfigInfo strategyConfigInfo) {
        C54149wys c54149wys = C54149wys.AEQbTJ;
        AbstractC48579uWq abstractC48579uWq = this.KWHzl;
        if (abstractC48579uWq == null) {
            Intrinsics.gEmmrt("");
            abstractC48579uWq = null;
        }
        C54154wyx c54154wyx = abstractC48579uWq.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(c54154wyx, "");
        c54149wys.EZpvd(c54154wyx, strategyConfigInfo);
    }

    @Override // o.InterfaceC53558wnk
    public void AEQbTJ(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        AbstractC48579uWq abstractC48579uWq = this.KWHzl;
        if (abstractC48579uWq == null) {
            Intrinsics.gEmmrt("");
            abstractC48579uWq = null;
        }
        abstractC48579uWq.isConnected.setOnSelectedCallback(function1);
        AbstractC48579uWq abstractC48579uWq2 = this.KWHzl;
        if (abstractC48579uWq2 == null) {
            Intrinsics.gEmmrt("");
            abstractC48579uWq2 = null;
        }
        uBL ubl = abstractC48579uWq2.isConnected;
        android.app.Activity activityOLrzqt = C33569myt.OLrzqt(getContext());
        AppCompatActivity appCompatActivity = activityOLrzqt instanceof AppCompatActivity ? (AppCompatActivity) activityOLrzqt : null;
        ubl.setFm(appCompatActivity != null ? appCompatActivity.getSupportFragmentManager() : null);
    }

    @Override // o.InterfaceC53558wnk
    public java.lang.String EZpvd(ViewModelStoreOwner viewModelStoreOwner, BizInstrument bizInstrument, @NotNull TradeType tradeType) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        AbstractC48579uWq abstractC48579uWq = this.KWHzl;
        AbstractC48579uWq abstractC48579uWq2 = null;
        if (abstractC48579uWq == null) {
            Intrinsics.gEmmrt("");
            abstractC48579uWq = null;
        }
        abstractC48579uWq.isConnected.copydefault(viewModelStoreOwner, bizInstrument, tradeType, false);
        AbstractC48579uWq abstractC48579uWq3 = this.KWHzl;
        if (abstractC48579uWq3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48579uWq2 = abstractC48579uWq3;
        }
        uBL ubl = abstractC48579uWq2.isConnected;
        Intrinsics.checkNotNullExpressionValue(ubl, "");
        ubl.setVisibility((bizInstrument == null || !bizInstrument.isDisplayTradeReceive()) ? 8 : 0);
        return AhwBna();
    }

    @Override // o.InterfaceC53558wnk
    public java.lang.String AhwBna() {
        AbstractC48579uWq abstractC48579uWq = this.KWHzl;
        if (abstractC48579uWq == null) {
            Intrinsics.gEmmrt("");
            abstractC48579uWq = null;
        }
        return abstractC48579uWq.isConnected.OLrzqt();
    }

    private final void valueOf() {
        android.app.Activity activityOLrzqt = C33569myt.OLrzqt(getContext());
        AbstractC48579uWq abstractC48579uWq = null;
        AppCompatActivity appCompatActivity = activityOLrzqt instanceof AppCompatActivity ? (AppCompatActivity) activityOLrzqt : null;
        if (appCompatActivity != null) {
            ViewModelProvider.Factory defaultViewModelProviderFactory = appCompatActivity.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
            AbstractC51317vkj abstractC51317vkjDjBIcL = ((StgyCopyPresenter) new ViewModelProvider(appCompatActivity, defaultViewModelProviderFactory).get(StgyCopyPresenter.class)).djBIcL();
            this.copydefault = abstractC51317vkjDjBIcL instanceof C51330vkw ? (C51330vkw) abstractC51317vkjDjBIcL : null;
        }
        setBalance("--");
        djBIcL();
        AbstractC48579uWq abstractC48579uWq2 = this.KWHzl;
        if (abstractC48579uWq2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48579uWq = abstractC48579uWq2;
        }
        C49774uur c49774uur = abstractC48579uWq.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c49774uur, "");
        C51330vkw c51330vkw = this.copydefault;
        c49774uur.setVisibility((c51330vkw == null || !c51330vkw.fJNWhG()) ? 8 : 0);
    }

    private final void gEmmrt() {
        this.AEQbTJ = new Function2() { // from class: o.vlG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C51336vlB.AEQbTJ(this.copydefault, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        AbstractC48579uWq abstractC48579uWq = this.KWHzl;
        AbstractC48579uWq abstractC48579uWq2 = null;
        if (abstractC48579uWq == null) {
            Intrinsics.gEmmrt("");
            abstractC48579uWq = null;
        }
        abstractC48579uWq.copydefault.setOnTextChangeCallback(this.AEQbTJ);
        AbstractC48579uWq abstractC48579uWq3 = this.KWHzl;
        if (abstractC48579uWq3 == null) {
            Intrinsics.gEmmrt("");
            abstractC48579uWq3 = null;
        }
        abstractC48579uWq3.copydefault.setPercentSeekBarListener(new Function1() { // from class: o.vlH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51336vlB.OLrzqt(this.KWHzl, ((java.lang.Float) obj).floatValue());
            }
        });
        AbstractC48579uWq abstractC48579uWq4 = this.KWHzl;
        if (abstractC48579uWq4 == null) {
            Intrinsics.gEmmrt("");
            abstractC48579uWq4 = null;
        }
        abstractC48579uWq4.valueOf.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.vlI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C51336vlB.AEQbTJ(this.copydefault, compoundButton, z);
            }
        });
        AbstractC48579uWq abstractC48579uWq5 = this.KWHzl;
        if (abstractC48579uWq5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48579uWq2 = abstractC48579uWq5;
        }
        C55258xgZ c55258xgZ = abstractC48579uWq2.fetchVPNInfo;
        c55258xgZ.setOnClickListener(new Activity(c55258xgZ, 1000L, this));
    }

    public static final Unit AEQbTJ(C51336vlB c51336vlB, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        AbstractC48579uWq abstractC48579uWq = null;
        AbstractC51292vkK.refreshValidView$default(c51336vlB, true, null, 2, null);
        if (c47988uAv.zLjUOn()) {
            C47988uAv.clearSeekBarData$default(c47988uAv, false, 1, null);
        }
        Function1<? super java.lang.String, Unit> function1 = c51336vlB.OLrzqt;
        if (function1 != null) {
            AbstractC48579uWq abstractC48579uWq2 = c51336vlB.KWHzl;
            if (abstractC48579uWq2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC48579uWq = abstractC48579uWq2;
            }
            function1.invoke(abstractC48579uWq.copydefault.AkhnZx());
        }
        C51330vkw c51330vkw = c51336vlB.copydefault;
        if (c51330vkw != null) {
            c51330vkw.OLrzqt(c51336vlB.EZpvd());
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C51336vlB c51336vlB, float f) {
        AbstractC51292vkK.refreshValidView$default(c51336vlB, true, null, 2, null);
        Function1<? super java.lang.String, Unit> function1 = c51336vlB.EZpvd;
        if (function1 != null) {
            function1.invoke(C33129mqd.gEmmrt(java.lang.Float.valueOf(f)));
        }
        C51330vkw c51330vkw = c51336vlB.copydefault;
        if (c51330vkw != null) {
            c51330vkw.OLrzqt(c51336vlB.EZpvd());
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C51336vlB c51336vlB, android.widget.CompoundButton compoundButton, boolean z) {
        MpStgyParam mpStgyParamGEmmrt;
        C51330vkw c51330vkw = c51336vlB.copydefault;
        if (c51330vkw != null && (mpStgyParamGEmmrt = c51330vkw.gEmmrt()) != null) {
            mpStgyParamGEmmrt.setReserveFunds(java.lang.Boolean.valueOf(z));
        }
        AbstractC48579uWq abstractC48579uWq = c51336vlB.KWHzl;
        AbstractC48579uWq abstractC48579uWq2 = null;
        if (abstractC48579uWq == null) {
            Intrinsics.gEmmrt("");
            abstractC48579uWq = null;
        }
        LinearLayoutCompat linearLayoutCompat = abstractC48579uWq.AhwBna;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        boolean z2 = !z;
        linearLayoutCompat.setVisibility(z2 ? 0 : 8);
        AbstractC48579uWq abstractC48579uWq3 = c51336vlB.KWHzl;
        if (abstractC48579uWq3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48579uWq2 = abstractC48579uWq3;
        }
        android.widget.TextView textView = abstractC48579uWq2.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z2 ? 0 : 8);
        C51330vkw c51330vkw2 = c51336vlB.copydefault;
        if (c51330vkw2 != null) {
            c51330vkw2.OLrzqt(c51336vlB.EZpvd());
        }
    }

    private final void values() {
        java.lang.String strEZpvd;
        AbstractC48579uWq abstractC48579uWq = this.KWHzl;
        if (abstractC48579uWq == null) {
            Intrinsics.gEmmrt("");
            abstractC48579uWq = null;
        }
        android.widget.TextView textView = abstractC48579uWq.AEQbTJ;
        C51330vkw c51330vkw = this.copydefault;
        if (c51330vkw == null || (strEZpvd = c51330vkw.EZpvd(EZpvd())) == null) {
            strEZpvd = "--";
        }
        textView.setText(strEZpvd);
    }

    @Override // o.AbstractC51292vkK
    public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        AbstractC48579uWq abstractC48579uWq = this.KWHzl;
        AbstractC48579uWq abstractC48579uWq2 = null;
        if (abstractC48579uWq == null) {
            Intrinsics.gEmmrt("");
            abstractC48579uWq = null;
        }
        abstractC48579uWq.OLrzqt.setTransferCoin(str3);
        AbstractC48579uWq abstractC48579uWq3 = this.KWHzl;
        if (abstractC48579uWq3 == null) {
            Intrinsics.gEmmrt("");
            abstractC48579uWq3 = null;
        }
        C47988uAv.setInputLabel$default(abstractC48579uWq3.copydefault, str, null, 2, null);
        AbstractC48579uWq abstractC48579uWq4 = this.KWHzl;
        if (abstractC48579uWq4 == null) {
            Intrinsics.gEmmrt("");
            abstractC48579uWq4 = null;
        }
        abstractC48579uWq4.copydefault.setInputUnit(str2);
        AbstractC48579uWq abstractC48579uWq5 = this.KWHzl;
        if (abstractC48579uWq5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48579uWq2 = abstractC48579uWq5;
        }
        abstractC48579uWq2.copydefault.setMaxDecimal(i);
    }

    @Override // o.AbstractC51292vkK
    public void setMinInvest(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC48579uWq abstractC48579uWq = this.KWHzl;
        if (abstractC48579uWq == null) {
            Intrinsics.gEmmrt("");
            abstractC48579uWq = null;
        }
        abstractC48579uWq.copydefault.setInputHint(str);
    }

    @Override // o.AbstractC51292vkK
    public void setBalance(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC48579uWq abstractC48579uWq = this.KWHzl;
        if (abstractC48579uWq == null) {
            Intrinsics.gEmmrt("");
            abstractC48579uWq = null;
        }
        abstractC48579uWq.OLrzqt.setFooterAvaValue(str);
    }

    /* JADX INFO: renamed from: o.vlB$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C51336vlB OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C51336vlB c51336vlB) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = c51336vlB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            androidx.fragment.app.FragmentManager supportFragmentManager;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                android.app.Activity activityOLrzqt = C33569myt.OLrzqt(this.OLrzqt.getContext());
                AppCompatActivity appCompatActivity = activityOLrzqt instanceof AppCompatActivity ? (AppCompatActivity) activityOLrzqt : null;
                if (appCompatActivity == null || (supportFragmentManager = appCompatActivity.getSupportFragmentManager()) == null) {
                    return;
                }
                new vOZ().show(supportFragmentManager, "SpotGridReserveFundsTipsDialog");
            }
        }
    }

    @Override // o.AbstractC51292vkK
    public void setQuoteContent(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC48579uWq abstractC48579uWq = this.KWHzl;
        AbstractC48579uWq abstractC48579uWq2 = null;
        if (abstractC48579uWq == null) {
            Intrinsics.gEmmrt("");
            abstractC48579uWq = null;
        }
        if (!abstractC48579uWq.copydefault.zLjUOn()) {
            AbstractC48579uWq abstractC48579uWq3 = this.KWHzl;
            if (abstractC48579uWq3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC48579uWq2 = abstractC48579uWq3;
            }
            C47988uAv.setInputContent$default(abstractC48579uWq2.copydefault, "", false, false, 6, null);
            return;
        }
        AbstractC48579uWq abstractC48579uWq4 = this.KWHzl;
        if (abstractC48579uWq4 == null) {
            Intrinsics.gEmmrt("");
            abstractC48579uWq4 = null;
        }
        abstractC48579uWq4.copydefault.setOnTextChangeCallback(null);
        AbstractC48579uWq abstractC48579uWq5 = this.KWHzl;
        if (abstractC48579uWq5 == null) {
            Intrinsics.gEmmrt("");
            abstractC48579uWq5 = null;
        }
        C47988uAv.setInputContent$default(abstractC48579uWq5.copydefault, str, false, false, 6, null);
        AbstractC48579uWq abstractC48579uWq6 = this.KWHzl;
        if (abstractC48579uWq6 == null) {
            Intrinsics.gEmmrt("");
            abstractC48579uWq6 = null;
        }
        abstractC48579uWq6.copydefault.setOnTextChangeCallback(this.AEQbTJ);
        Function1<? super java.lang.String, Unit> function1 = this.OLrzqt;
        if (function1 != null) {
            AbstractC48579uWq abstractC48579uWq7 = this.KWHzl;
            if (abstractC48579uWq7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC48579uWq2 = abstractC48579uWq7;
            }
            function1.invoke(abstractC48579uWq2.copydefault.AkhnZx());
        }
    }

    @Override // o.AbstractC51292vkK
    public void EZpvd(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC48579uWq abstractC48579uWq = null;
        if (z) {
            AbstractC48579uWq abstractC48579uWq2 = this.KWHzl;
            if (abstractC48579uWq2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC48579uWq = abstractC48579uWq2;
            }
            abstractC48579uWq.copydefault.copydefault();
            return;
        }
        AbstractC48579uWq abstractC48579uWq3 = this.KWHzl;
        if (abstractC48579uWq3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48579uWq = abstractC48579uWq3;
        }
        abstractC48579uWq.copydefault.setInputErrorMsg(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    @Override // o.AbstractC51292vkK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OLrzqt(java.lang.String str, java.lang.String str2) {
        int i;
        AbstractC48579uWq abstractC48579uWq = this.KWHzl;
        AbstractC48579uWq abstractC48579uWq2 = null;
        if (abstractC48579uWq == null) {
            Intrinsics.gEmmrt("");
            abstractC48579uWq = null;
        }
        android.widget.TextView textView = abstractC48579uWq.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        if (str2 == null) {
            i = 8;
        } else {
            AbstractC48579uWq abstractC48579uWq3 = this.KWHzl;
            if (abstractC48579uWq3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC48579uWq2 = abstractC48579uWq3;
            }
            if (C33129mqd.AEQbTJ(abstractC48579uWq2.copydefault.AkhnZx(), str2)) {
                i = 0;
            }
        }
        textView.setVisibility(i);
    }

    @Override // o.AbstractC51292vkK
    public CopyBotReqParam EZpvd() {
        AbstractC48579uWq abstractC48579uWq = this.KWHzl;
        if (abstractC48579uWq == null) {
            Intrinsics.gEmmrt("");
            abstractC48579uWq = null;
        }
        return new CopyBotReqParam(null, abstractC48579uWq.copydefault.AkhnZx(), null, false, null, null, null, null, false, null, PointerIconCompat.TYPE_GRABBING, null);
    }

    @Override // o.AbstractC51292vkK
    public boolean AEQbTJ() {
        AbstractC48579uWq abstractC48579uWq = this.KWHzl;
        AbstractC48579uWq abstractC48579uWq2 = null;
        if (abstractC48579uWq == null) {
            Intrinsics.gEmmrt("");
            abstractC48579uWq = null;
        }
        if (abstractC48579uWq.copydefault.AkhnZx().length() == 0) {
            AbstractC48579uWq abstractC48579uWq3 = this.KWHzl;
            if (abstractC48579uWq3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC48579uWq2 = abstractC48579uWq3;
            }
            abstractC48579uWq2.copydefault.zsXlph();
            return false;
        }
        AbstractC48579uWq abstractC48579uWq4 = this.KWHzl;
        if (abstractC48579uWq4 == null) {
            Intrinsics.gEmmrt("");
            abstractC48579uWq4 = null;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) abstractC48579uWq4.copydefault.fetchVPNInfo())) {
            AbstractC48579uWq abstractC48579uWq5 = this.KWHzl;
            if (abstractC48579uWq5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC48579uWq2 = abstractC48579uWq5;
            }
            abstractC48579uWq2.copydefault.zsXlph();
            return false;
        }
        AbstractC48579uWq abstractC48579uWq6 = this.KWHzl;
        if (abstractC48579uWq6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48579uWq2 = abstractC48579uWq6;
        }
        android.widget.TextView textView = abstractC48579uWq2.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        if (textView.getVisibility() != 0) {
            return true;
        }
        C56002xub.KWHzl.OLrzqt();
        return false;
    }

    public final void djBIcL() {
        MpStgyParam mpStgyParamGEmmrt;
        C55320xhi c55320xhiKWHzl;
        C51330vkw c51330vkw = this.copydefault;
        if (c51330vkw == null || !c51330vkw.valueOf()) {
            return;
        }
        AbstractC48579uWq abstractC48579uWq = this.KWHzl;
        AbstractC48579uWq abstractC48579uWq2 = null;
        if (abstractC48579uWq == null) {
            Intrinsics.gEmmrt("");
            abstractC48579uWq = null;
        }
        LinearLayoutCompat linearLayoutCompat = abstractC48579uWq.values;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        boolean zEZpvd = false;
        linearLayoutCompat.setVisibility(0);
        C51330vkw c51330vkw2 = this.copydefault;
        if (c51330vkw2 == null || !c51330vkw2.AEQbTJ()) {
            AbstractC48579uWq abstractC48579uWq3 = this.KWHzl;
            if (abstractC48579uWq3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC48579uWq2 = abstractC48579uWq3;
            }
            wYK wyk = abstractC48579uWq2.valueOf;
            C51330vkw c51330vkw3 = this.copydefault;
            if (c51330vkw3 != null && (mpStgyParamGEmmrt = c51330vkw3.gEmmrt()) != null) {
                zEZpvd = Intrinsics.EZpvd(mpStgyParamGEmmrt.getReserveFunds(), java.lang.Boolean.TRUE);
            }
            wyk.setChecked(zEZpvd);
            return;
        }
        AbstractC48579uWq abstractC48579uWq4 = this.KWHzl;
        if (abstractC48579uWq4 == null) {
            Intrinsics.gEmmrt("");
            abstractC48579uWq4 = null;
        }
        abstractC48579uWq4.valueOf.setChecked(false);
        AbstractC48579uWq abstractC48579uWq5 = this.KWHzl;
        if (abstractC48579uWq5 == null) {
            Intrinsics.gEmmrt("");
            abstractC48579uWq5 = null;
        }
        abstractC48579uWq5.valueOf.setEnabled(false);
        AbstractC48579uWq abstractC48579uWq6 = this.KWHzl;
        if (abstractC48579uWq6 == null) {
            Intrinsics.gEmmrt("");
            abstractC48579uWq6 = null;
        }
        C55312xha c55312xhaValueOf = abstractC48579uWq6.fetchVPNInfo.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
        }
        AbstractC48579uWq abstractC48579uWq7 = this.KWHzl;
        if (abstractC48579uWq7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48579uWq2 = abstractC48579uWq7;
        }
        android.widget.TextView textView = abstractC48579uWq2.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
    }

    public static /* synthetic */ void refreshMaxInvestAmt$default(C51336vlB c51336vlB, AdditionalInvest additionalInvest, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            additionalInvest = null;
        }
        c51336vlB.KWHzl(additionalInvest);
    }

    private final void KWHzl(AdditionalInvest additionalInvest) {
        AbstractC48579uWq abstractC48579uWq = this.KWHzl;
        if (abstractC48579uWq == null) {
            Intrinsics.gEmmrt("");
            abstractC48579uWq = null;
        }
        android.widget.TextView textView = abstractC48579uWq.gEmmrt;
        C51330vkw c51330vkw = this.copydefault;
        textView.setText(c51330vkw != null ? c51330vkw.EZpvd(EZpvd(), additionalInvest) : null);
    }

    @Override // o.AbstractC51292vkK
    public void setBotLossInsuranceTag(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        AbstractC48579uWq abstractC48579uWq = this.KWHzl;
        if (abstractC48579uWq == null) {
            Intrinsics.gEmmrt("");
            abstractC48579uWq = null;
        }
        abstractC48579uWq.djBIcL.setData(new LossInsuranceDisplayData(str, str2, bool, "grid", null, false, null, null, null, null, null, false, null, 8128, null));
    }
}
