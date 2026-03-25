package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.tradingbot.impl.market_place.bot_copy.bean.CopyBotReqParam;
import com.okinc.tradingbot.impl.market_place.bot_copy.presenter.StgyCopyPresenter;
import com.okinc.tradingbot.impl.order.strategy.spotdca.binder.ExplainItemModel;
import com.okinc.unify_trade.biz.BotLeverConfig;
import com.okinc.unify_trade.biz.LiquidatePriceResponse;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vkV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51303vkV extends AbstractC51292vkK {
    public final InterfaceC56387yDm AEQbTJ;
    public Function1<? super java.lang.String, Unit> EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public AbstractC48641uYy OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final Function2<C47988uAv, java.lang.String, Unit> djBIcL;
    public Function1<? super java.lang.String, Unit> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51303vkV(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51303vkV(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51292vkK
    public void setAmtChangeListener(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51292vkK
    public void setQuotePercentListener(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.gEmmrt = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:35) call: o.vkV.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C51303vkV(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51303vkV(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.vkW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51303vkV.copydefault(context);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.vkZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51303vkV.OLrzqt(context);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.vkY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51303vkV.gEmmrt();
            }
        });
        this.djBIcL = new Function2() { // from class: o.vlb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C51303vkV.OLrzqt(this.copydefault, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        AuCTel();
        values();
        fJNWhG();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: VM */
    /* JADX WARN: Multi-variable type inference failed */
    public static final StgyCopyPresenter copydefault(android.content.Context context) {
        final AppCompatActivity appCompatActivityCopydefault = C49955uyM.copydefault(context);
        final Function0 function0 = null;
        if (appCompatActivityCopydefault == null) {
            return null;
        }
        return (StgyCopyPresenter) new ViewModelLazy(C56524yIo.AEQbTJ(StgyCopyPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.market_place.bot_copy.view.MpStgyCopyContractDcaAmtView$getP_delegate$lambda$0$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = appCompatActivityCopydefault.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.market_place.bot_copy.view.MpStgyCopyContractDcaAmtView$getP_delegate$lambda$0$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = appCompatActivityCopydefault.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.market_place.bot_copy.view.MpStgyCopyContractDcaAmtView$getP_delegate$lambda$0$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = appCompatActivityCopydefault.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }).getValue();
    }

    private final StgyCopyPresenter isConnected() {
        return (StgyCopyPresenter) this.copydefault.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.fragment.app.FragmentManager OLrzqt(android.content.Context context) {
        AppCompatActivity appCompatActivityCopydefault = C49955uyM.copydefault(context);
        if (appCompatActivityCopydefault != null) {
            return appCompatActivityCopydefault.getSupportFragmentManager();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.fragment.app.FragmentManager fetchVPNInfo() {
        return (androidx.fragment.app.FragmentManager) this.KWHzl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.ArrayList<ExplainItemModel> AkhnZx() {
        return (java.util.ArrayList) this.AEQbTJ.getValue();
    }

    public static final java.util.ArrayList gEmmrt() {
        return yDY.copydefault(new ExplainItemModel(C33070mpX.AYXKKw(C55688xof.Application.DzkRMH), C33070mpX.AYXKKw(C55688xof.Application.iUnTnt)), new ExplainItemModel(C33070mpX.AYXKKw(C55688xof.Application.FHvxmb), C33070mpX.AYXKKw(C55688xof.Application.DDjfYY)));
    }

    public static final Unit OLrzqt(C51303vkV c51303vkV, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (c47988uAv.zLjUOn()) {
            C47988uAv.clearSeekBarData$default(c47988uAv, false, 1, null);
        }
        Function1<? super java.lang.String, Unit> function1 = c51303vkV.EZpvd;
        if (function1 != null) {
            function1.invoke(c47988uAv.AkhnZx());
        }
        return Unit.INSTANCE;
    }

    private final void AuCTel() {
        setOrientation(1);
        AbstractC48641uYy abstractC48641uYy = (AbstractC48641uYy) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.getValue, this, true);
        this.OLrzqt = abstractC48641uYy;
        AbstractC48641uYy abstractC48641uYy2 = null;
        if (abstractC48641uYy == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy = null;
        }
        abstractC48641uYy.OLrzqt.setChecked(false);
        AbstractC48641uYy abstractC48641uYy3 = this.OLrzqt;
        if (abstractC48641uYy3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48641uYy2 = abstractC48641uYy3;
        }
        C47988uAv c47988uAv = abstractC48641uYy2.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        c47988uAv.setVisibility(8);
    }

    private final void values() {
        AbstractC48641uYy abstractC48641uYy = this.OLrzqt;
        if (abstractC48641uYy == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy = null;
        }
        abstractC48641uYy.AhwBna.setOnTextChangeCallback(this.djBIcL);
        setBalance("--");
    }

    private final void fJNWhG() {
        AbstractC48641uYy abstractC48641uYy = this.OLrzqt;
        AbstractC48641uYy abstractC48641uYy2 = null;
        if (abstractC48641uYy == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy = null;
        }
        C55258xgZ c55258xgZ = abstractC48641uYy.DbNXlk;
        c55258xgZ.setOnClickListener(new TaskDescription(c55258xgZ, 1000L, this));
        AbstractC48641uYy abstractC48641uYy3 = this.OLrzqt;
        if (abstractC48641uYy3 == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy3 = null;
        }
        C55258xgZ c55258xgZ2 = abstractC48641uYy3.AEQbTJ;
        c55258xgZ2.setOnClickListener(new ActionBar(c55258xgZ2, 1000L, this));
        AbstractC48641uYy abstractC48641uYy4 = this.OLrzqt;
        if (abstractC48641uYy4 == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy4 = null;
        }
        abstractC48641uYy4.OLrzqt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.vla
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C51303vkV.copydefault(this.copydefault, compoundButton, z);
            }
        });
        AbstractC48641uYy abstractC48641uYy5 = this.OLrzqt;
        if (abstractC48641uYy5 == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy5 = null;
        }
        abstractC48641uYy5.AhwBna.setPercentSeekBarListener(new Function1() { // from class: o.vkX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51303vkV.OLrzqt(this.OLrzqt, ((java.lang.Float) obj).floatValue());
            }
        });
        AbstractC48641uYy abstractC48641uYy6 = this.OLrzqt;
        if (abstractC48641uYy6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48641uYy2 = abstractC48641uYy6;
        }
        abstractC48641uYy2.KWHzl.setOnTextChangeCallback(new Function2() { // from class: o.vlc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C51303vkV.copydefault(this.EZpvd, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: o.vkV$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.EZpvd = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.EZpvd.dismiss();
        }
    }

    public static final void copydefault(C51303vkV c51303vkV, android.widget.CompoundButton compoundButton, boolean z) {
        AbstractC48641uYy abstractC48641uYy = c51303vkV.OLrzqt;
        AbstractC48641uYy abstractC48641uYy2 = null;
        if (abstractC48641uYy == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy = null;
        }
        C47988uAv c47988uAv = abstractC48641uYy.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        c47988uAv.setVisibility(z ? 0 : 8);
        if (z) {
            AbstractC48641uYy abstractC48641uYy3 = c51303vkV.OLrzqt;
            if (abstractC48641uYy3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC48641uYy2 = abstractC48641uYy3;
            }
            abstractC48641uYy2.KWHzl.zsXlph();
            return;
        }
        android.content.Context context = c51303vkV.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        AbstractC48641uYy abstractC48641uYy4 = c51303vkV.OLrzqt;
        if (abstractC48641uYy4 == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy4 = null;
        }
        C33054mpH.OLrzqt(context, abstractC48641uYy4.KWHzl);
        AbstractC48641uYy abstractC48641uYy5 = c51303vkV.OLrzqt;
        if (abstractC48641uYy5 == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy5 = null;
        }
        abstractC48641uYy5.KWHzl.copydefault();
        AbstractC48641uYy abstractC48641uYy6 = c51303vkV.OLrzqt;
        if (abstractC48641uYy6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48641uYy2 = abstractC48641uYy6;
        }
        AppCompatTextView appCompatTextView = abstractC48641uYy2.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(8);
    }

    public static final Unit OLrzqt(C51303vkV c51303vkV, float f) {
        AbstractC51292vkK.refreshValidView$default(c51303vkV, true, null, 2, null);
        Function1<? super java.lang.String, Unit> function1 = c51303vkV.gEmmrt;
        if (function1 != null) {
            function1.invoke(C33129mqd.gEmmrt(java.lang.Float.valueOf(f)));
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C51303vkV c51303vkV, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        c51303vkV.DbNXlk();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC51292vkK
    public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        AbstractC48641uYy abstractC48641uYy = this.OLrzqt;
        AbstractC48641uYy abstractC48641uYy2 = null;
        if (abstractC48641uYy == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy = null;
        }
        abstractC48641uYy.copydefault.setTransferCoin(str3);
        AbstractC48641uYy abstractC48641uYy3 = this.OLrzqt;
        if (abstractC48641uYy3 == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy3 = null;
        }
        C47988uAv.setInputLabel$default(abstractC48641uYy3.AhwBna, str, null, 2, null);
        AbstractC48641uYy abstractC48641uYy4 = this.OLrzqt;
        if (abstractC48641uYy4 == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy4 = null;
        }
        abstractC48641uYy4.AhwBna.setInputUnit(str2);
        AbstractC48641uYy abstractC48641uYy5 = this.OLrzqt;
        if (abstractC48641uYy5 == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy5 = null;
        }
        abstractC48641uYy5.AhwBna.setMaxDecimal(i);
        AbstractC48641uYy abstractC48641uYy6 = this.OLrzqt;
        if (abstractC48641uYy6 == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy6 = null;
        }
        abstractC48641uYy6.KWHzl.setInputUnit(str2);
        AbstractC48641uYy abstractC48641uYy7 = this.OLrzqt;
        if (abstractC48641uYy7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48641uYy2 = abstractC48641uYy7;
        }
        abstractC48641uYy2.KWHzl.setMaxDecimal(i);
    }

    @Override // o.AbstractC51292vkK
    public void setMinInvest(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC48641uYy abstractC48641uYy = this.OLrzqt;
        if (abstractC48641uYy == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy = null;
        }
        abstractC48641uYy.AhwBna.setInputHint(str);
    }

    @Override // o.AbstractC51292vkK
    public void setBalance(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC48641uYy abstractC48641uYy = this.OLrzqt;
        if (abstractC48641uYy == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy = null;
        }
        abstractC48641uYy.copydefault.setFooterAvaValue(str);
    }

    @Override // o.AbstractC51292vkK
    public void setQuoteContent(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC48641uYy abstractC48641uYy = this.OLrzqt;
        AbstractC48641uYy abstractC48641uYy2 = null;
        if (abstractC48641uYy == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy = null;
        }
        if (!abstractC48641uYy.AhwBna.zLjUOn()) {
            AbstractC48641uYy abstractC48641uYy3 = this.OLrzqt;
            if (abstractC48641uYy3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC48641uYy2 = abstractC48641uYy3;
            }
            C47988uAv.setInputContent$default(abstractC48641uYy2.AhwBna, "", false, false, 6, null);
            return;
        }
        AbstractC48641uYy abstractC48641uYy4 = this.OLrzqt;
        if (abstractC48641uYy4 == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy4 = null;
        }
        abstractC48641uYy4.AhwBna.setOnTextChangeCallback(null);
        AbstractC48641uYy abstractC48641uYy5 = this.OLrzqt;
        if (abstractC48641uYy5 == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy5 = null;
        }
        C47988uAv.setInputContent$default(abstractC48641uYy5.AhwBna, str, false, false, 6, null);
        AbstractC48641uYy abstractC48641uYy6 = this.OLrzqt;
        if (abstractC48641uYy6 == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy6 = null;
        }
        abstractC48641uYy6.AhwBna.setOnTextChangeCallback(this.djBIcL);
        Function1<? super java.lang.String, Unit> function1 = this.EZpvd;
        if (function1 != null) {
            AbstractC48641uYy abstractC48641uYy7 = this.OLrzqt;
            if (abstractC48641uYy7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC48641uYy2 = abstractC48641uYy7;
            }
            function1.invoke(abstractC48641uYy2.AhwBna.AkhnZx());
        }
    }

    @Override // o.AbstractC51292vkK
    public void EZpvd(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC48641uYy abstractC48641uYy = null;
        if (z) {
            AbstractC48641uYy abstractC48641uYy2 = this.OLrzqt;
            if (abstractC48641uYy2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC48641uYy = abstractC48641uYy2;
            }
            abstractC48641uYy.AhwBna.copydefault();
            return;
        }
        AbstractC48641uYy abstractC48641uYy3 = this.OLrzqt;
        if (abstractC48641uYy3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48641uYy = abstractC48641uYy3;
        }
        abstractC48641uYy.AhwBna.setInputErrorMsg(str);
    }

    /* JADX INFO: renamed from: o.vkV$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C51303vkV OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C51303vkV c51303vkV) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = c51303vkV;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C53274wiR c53274wiRAEQbTJ = C53274wiR.Companion.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.DuXjdv), this.OLrzqt.AkhnZx());
                androidx.fragment.app.FragmentManager fragmentManagerFetchVPNInfo = this.OLrzqt.fetchVPNInfo();
                if (fragmentManagerFetchVPNInfo == null) {
                    return;
                }
                c53274wiRAEQbTJ.show(fragmentManagerFetchVPNInfo);
            }
        }
    }

    /* JADX INFO: renamed from: o.vkV$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ long AYXKKw;
        public final /* synthetic */ BotLeverConfig EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;
        public final /* synthetic */ C50191vFg djBIcL;
        public final /* synthetic */ android.view.View gEmmrt;
        public final /* synthetic */ C51303vkV valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C50191vFg c50191vFg, java.lang.String str, java.lang.String str2, BotLeverConfig botLeverConfig, java.lang.String str3, C51303vkV c51303vkV, java.lang.String str4) {
            this.gEmmrt = view;
            this.AYXKKw = j;
            this.djBIcL = c50191vFg;
            this.KWHzl = str;
            this.AEQbTJ = str2;
            this.EZpvd = botLeverConfig;
            this.copydefault = str3;
            this.valueOf = c51303vkV;
            this.OLrzqt = str4;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.gEmmrt) > this.AYXKKw || (this.gEmmrt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.gEmmrt, jCurrentTimeMillis);
                C50191vFg c50191vFg = this.djBIcL;
                java.lang.String str = this.KWHzl;
                java.lang.String str2 = this.AEQbTJ;
                java.lang.String leveragePercents = this.EZpvd.getLeveragePercents();
                java.lang.String minLever = this.EZpvd.getMinLever();
                java.lang.String maxLever = this.EZpvd.getMaxLever();
                java.lang.String str3 = this.copydefault;
                androidx.fragment.app.FragmentManager fragmentManagerFetchVPNInfo = this.valueOf.fetchVPNInfo();
                if (fragmentManagerFetchVPNInfo == null) {
                    return;
                }
                c50191vFg.AEQbTJ(str, str2, leveragePercents, minLever, maxLever, str3, "cross", fragmentManagerFetchVPNInfo, this.OLrzqt);
            }
        }
    }

    /* JADX INFO: renamed from: o.vkV$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C51303vkV KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C51303vkV c51303vkV) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = c51303vkV;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.content.Context context = this.KWHzl.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.setTitle(C33070mpX.OLrzqt(C48033uCm.Fragment.fsSxsn, viewOnClickListenerC54939xaY.getContext()));
                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.OLrzqt(C48033uCm.Fragment.gUEfcq, viewOnClickListenerC54939xaY.getContext()));
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C48033uCm.Fragment.fjfviF), (View.OnClickListener) new Activity(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    @Override // o.AbstractC51292vkK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OLrzqt(java.lang.String str, java.lang.String str2) {
        int i;
        AbstractC48641uYy abstractC48641uYy = this.OLrzqt;
        AbstractC48641uYy abstractC48641uYy2 = null;
        if (abstractC48641uYy == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy = null;
        }
        android.widget.TextView textView = abstractC48641uYy.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        if (str2 == null) {
            i = 8;
        } else {
            AbstractC48641uYy abstractC48641uYy3 = this.OLrzqt;
            if (abstractC48641uYy3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC48641uYy2 = abstractC48641uYy3;
            }
            if (C33129mqd.AEQbTJ(abstractC48641uYy2.AhwBna.AkhnZx(), str2)) {
                i = 0;
            }
        }
        textView.setVisibility(i);
    }

    @Override // o.AbstractC51292vkK
    public CopyBotReqParam EZpvd() {
        AbstractC48641uYy abstractC48641uYy = this.OLrzqt;
        AbstractC48641uYy abstractC48641uYy2 = null;
        if (abstractC48641uYy == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy = null;
        }
        java.lang.String strAkhnZx = abstractC48641uYy.AhwBna.AkhnZx();
        AbstractC48641uYy abstractC48641uYy3 = this.OLrzqt;
        if (abstractC48641uYy3 == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy3 = null;
        }
        boolean zIsChecked = abstractC48641uYy3.OLrzqt.isChecked();
        AbstractC48641uYy abstractC48641uYy4 = this.OLrzqt;
        if (abstractC48641uYy4 == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy4 = null;
        }
        boolean zIsChecked2 = abstractC48641uYy4.values.isChecked();
        AbstractC48641uYy abstractC48641uYy5 = this.OLrzqt;
        if (abstractC48641uYy5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48641uYy2 = abstractC48641uYy5;
        }
        return new CopyBotReqParam(null, strAkhnZx, null, zIsChecked, abstractC48641uYy2.KWHzl.AkhnZx(), null, null, null, zIsChecked2, null, 741, null);
    }

    @Override // o.AbstractC51292vkK
    public void copydefault(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull BotLeverConfig botLeverConfig, @NotNull java.lang.String str4, @NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(botLeverConfig, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AbstractC48641uYy abstractC48641uYy = this.OLrzqt;
        if (abstractC48641uYy == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy = null;
        }
        C50191vFg c50191vFg = abstractC48641uYy.djBIcL;
        c50191vFg.setOnLeverChangeCallback(function1);
        c50191vFg.OLrzqt(botLeverConfig.getCurrentLever());
        c50191vFg.setOnClickListener(new StateListAnimator(c50191vFg, 1000L, c50191vFg, str2, str3, botLeverConfig, str4, this, str));
    }

    @Override // o.AbstractC51292vkK
    public void EZpvd(@NotNull final LiquidatePriceResponse liquidatePriceResponse) {
        Intrinsics.checkNotNullParameter(liquidatePriceResponse, "");
        AbstractC48641uYy abstractC48641uYy = this.OLrzqt;
        AbstractC48641uYy abstractC48641uYy2 = null;
        if (abstractC48641uYy == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy = null;
        }
        vKO vko = abstractC48641uYy.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(vko, "");
        vko.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) liquidatePriceResponse.getLongLiqTitle()) ? 0 : 8);
        AbstractC48641uYy abstractC48641uYy3 = this.OLrzqt;
        if (abstractC48641uYy3 == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy3 = null;
        }
        abstractC48641uYy3.AYXKKw.setTitle(liquidatePriceResponse.getLongLiqTitle());
        AbstractC48641uYy abstractC48641uYy4 = this.OLrzqt;
        if (abstractC48641uYy4 == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy4 = null;
        }
        abstractC48641uYy4.AYXKKw.setValue(liquidatePriceResponse.getLongLiqPx());
        AbstractC48641uYy abstractC48641uYy5 = this.OLrzqt;
        if (abstractC48641uYy5 == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy5 = null;
        }
        abstractC48641uYy5.AYXKKw.EZpvd(C33129mqd.OLrzqt((java.lang.CharSequence) liquidatePriceResponse.getLongLiqDoubt()), new View.OnClickListener() { // from class: o.vkU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51303vkV.OLrzqt(this.EZpvd, liquidatePriceResponse, view);
            }
        });
        AbstractC48641uYy abstractC48641uYy6 = this.OLrzqt;
        if (abstractC48641uYy6 == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy6 = null;
        }
        vKO vko2 = abstractC48641uYy6.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(vko2, "");
        vko2.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) liquidatePriceResponse.getShortLiqTitle()) ? 0 : 8);
        AbstractC48641uYy abstractC48641uYy7 = this.OLrzqt;
        if (abstractC48641uYy7 == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy7 = null;
        }
        abstractC48641uYy7.AkhnZx.setTitle(liquidatePriceResponse.getShortLiqTitle());
        AbstractC48641uYy abstractC48641uYy8 = this.OLrzqt;
        if (abstractC48641uYy8 == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy8 = null;
        }
        abstractC48641uYy8.AkhnZx.setValue(liquidatePriceResponse.getShortLiqPx());
        AbstractC48641uYy abstractC48641uYy9 = this.OLrzqt;
        if (abstractC48641uYy9 == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy9 = null;
        }
        abstractC48641uYy9.AkhnZx.EZpvd(C33129mqd.OLrzqt((java.lang.CharSequence) liquidatePriceResponse.getShortLiqDoubt()), new View.OnClickListener() { // from class: o.vkS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51303vkV.KWHzl(this.EZpvd, liquidatePriceResponse, view);
            }
        });
        AbstractC48641uYy abstractC48641uYy10 = this.OLrzqt;
        if (abstractC48641uYy10 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48641uYy2 = abstractC48641uYy10;
        }
        android.widget.TextView textView = abstractC48641uYy2.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(liquidatePriceResponse.getLiqPriceCheck() ^ true ? 0 : 8);
    }

    public static final void OLrzqt(C51303vkV c51303vkV, LiquidatePriceResponse liquidatePriceResponse, android.view.View view) {
        java.lang.String longLiqDoubt = liquidatePriceResponse.getLongLiqDoubt();
        if (longLiqDoubt == null) {
            longLiqDoubt = "";
        }
        c51303vkV.copydefault(longLiqDoubt);
    }

    public static final void KWHzl(C51303vkV c51303vkV, LiquidatePriceResponse liquidatePriceResponse, android.view.View view) {
        java.lang.String shortLiqDoubt = liquidatePriceResponse.getShortLiqDoubt();
        if (shortLiqDoubt == null) {
            shortLiqDoubt = "";
        }
        c51303vkV.copydefault(shortLiqDoubt);
    }

    @Override // o.AbstractC51292vkK
    public void OLrzqt(StrategyConfigInfo strategyConfigInfo) {
        C54149wys c54149wys = C54149wys.AEQbTJ;
        AbstractC48641uYy abstractC48641uYy = this.OLrzqt;
        if (abstractC48641uYy == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy = null;
        }
        C54154wyx c54154wyx = abstractC48641uYy.isConnected;
        Intrinsics.checkNotNullExpressionValue(c54154wyx, "");
        c54149wys.EZpvd(c54154wyx, strategyConfigInfo);
    }

    private final void copydefault(java.lang.String str) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.EZpvd(str);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C48033uCm.Fragment.fjfviF), new View.OnClickListener() { // from class: o.vle
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51303vkV.copydefault(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // o.AbstractC51292vkK
    public boolean AEQbTJ() {
        return AhwBna() && DbNXlk();
    }

    public final ConstraintLayout valueOf() {
        AbstractC48641uYy abstractC48641uYy = this.OLrzqt;
        if (abstractC48641uYy == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy = null;
        }
        ConstraintLayout constraintLayout = abstractC48641uYy.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        return constraintLayout;
    }

    public final boolean AhwBna() {
        AbstractC48641uYy abstractC48641uYy = this.OLrzqt;
        AbstractC48641uYy abstractC48641uYy2 = null;
        if (abstractC48641uYy == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy = null;
        }
        if (abstractC48641uYy.AhwBna.AkhnZx().length() == 0) {
            AbstractC48641uYy abstractC48641uYy3 = this.OLrzqt;
            if (abstractC48641uYy3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC48641uYy2 = abstractC48641uYy3;
            }
            abstractC48641uYy2.AhwBna.zsXlph();
            return false;
        }
        AbstractC48641uYy abstractC48641uYy4 = this.OLrzqt;
        if (abstractC48641uYy4 == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy4 = null;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) abstractC48641uYy4.AhwBna.fetchVPNInfo())) {
            AbstractC48641uYy abstractC48641uYy5 = this.OLrzqt;
            if (abstractC48641uYy5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC48641uYy2 = abstractC48641uYy5;
            }
            abstractC48641uYy2.AhwBna.zsXlph();
            return false;
        }
        AbstractC48641uYy abstractC48641uYy6 = this.OLrzqt;
        if (abstractC48641uYy6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48641uYy2 = abstractC48641uYy6;
        }
        android.widget.TextView textView = abstractC48641uYy2.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        if (textView.getVisibility() != 0) {
            return true;
        }
        C56002xub.KWHzl.OLrzqt();
        return false;
    }

    private final boolean DbNXlk() {
        C56111xwe<java.lang.String> c56111xweCopydefault;
        AbstractC48641uYy abstractC48641uYy = this.OLrzqt;
        AbstractC48641uYy abstractC48641uYy2 = null;
        if (abstractC48641uYy == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy = null;
        }
        if (!abstractC48641uYy.OLrzqt.isChecked()) {
            return true;
        }
        AbstractC48641uYy abstractC48641uYy3 = this.OLrzqt;
        if (abstractC48641uYy3 == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy3 = null;
        }
        java.lang.String strAkhnZx = abstractC48641uYy3.KWHzl.AkhnZx();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx) || C33129mqd.valueOf(strAkhnZx, "0")) {
            AbstractC48641uYy abstractC48641uYy4 = this.OLrzqt;
            if (abstractC48641uYy4 == null) {
                Intrinsics.gEmmrt("");
                abstractC48641uYy4 = null;
            }
            abstractC48641uYy4.KWHzl.setInputErrorMsg(C33070mpX.AYXKKw(C55688xof.Application.gkZNMa));
            AbstractC48641uYy abstractC48641uYy5 = this.OLrzqt;
            if (abstractC48641uYy5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC48641uYy2 = abstractC48641uYy5;
            }
            AppCompatTextView appCompatTextView = abstractC48641uYy2.EZpvd;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(8);
            return false;
        }
        StgyCopyPresenter stgyCopyPresenterIsConnected = isConnected();
        if (C33129mqd.AEQbTJ(strAkhnZx, (stgyCopyPresenterIsConnected == null || (c56111xweCopydefault = stgyCopyPresenterIsConnected.copydefault()) == null) ? null : c56111xweCopydefault.getValue())) {
            AbstractC48641uYy abstractC48641uYy6 = this.OLrzqt;
            if (abstractC48641uYy6 == null) {
                Intrinsics.gEmmrt("");
                abstractC48641uYy6 = null;
            }
            AppCompatTextView appCompatTextView2 = abstractC48641uYy6.EZpvd;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
            appCompatTextView2.setVisibility(0);
            AbstractC48641uYy abstractC48641uYy7 = this.OLrzqt;
            if (abstractC48641uYy7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC48641uYy2 = abstractC48641uYy7;
            }
            abstractC48641uYy2.KWHzl.copydefault();
            return true;
        }
        AbstractC48641uYy abstractC48641uYy8 = this.OLrzqt;
        if (abstractC48641uYy8 == null) {
            Intrinsics.gEmmrt("");
            abstractC48641uYy8 = null;
        }
        abstractC48641uYy8.KWHzl.copydefault();
        AbstractC48641uYy abstractC48641uYy9 = this.OLrzqt;
        if (abstractC48641uYy9 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48641uYy2 = abstractC48641uYy9;
        }
        AppCompatTextView appCompatTextView3 = abstractC48641uYy2.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
        appCompatTextView3.setVisibility(8);
        return true;
    }
}
