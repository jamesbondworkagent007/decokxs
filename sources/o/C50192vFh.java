package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.ViewKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.okinc.biz.TacticsType;
import com.okinc.core.util.SPUtils;
import com.okinc.tradingbot.impl.order.strategy.contractdca.model.ContractDcaAdvancedParams;
import com.okinc.tradingbot.impl.order.strategy.contractdca.presenter.ContractDcaManualPresenter;
import com.okinc.tradingbot.impl.order.strategy.spotdca.binder.ExplainItemModel;
import com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.BotExplainGatherData;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.bot.config.ContractDcaStopConditionType;
import com.okinc.unify_trade.bot.config.ContractDcaStopLossType;
import com.okinc.unify_trade.bot.config.ContractDcaTriggerType;
import com.okinc.unify_trade.bot.config.TimeFrame;
import com.okinc.unify_trade.bot.config.TriggerCond;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vFh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50192vFh extends ConstraintLayout {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public boolean AEQbTJ;
    public uTS EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm copydefault;
    public ActivityResultLauncher<android.content.Intent> gEmmrt;
    public ActivityResultLauncher<android.content.Intent> valueOf;

    /* JADX INFO: renamed from: o.vFh$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C50192vFh(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C50192vFh(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAppendEnable(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:47) call: o.vFh.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C50192vFh(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50192vFh(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.vFk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50192vFh.AEQbTJ(this.EZpvd);
            }
        });
        this.AEQbTJ = true;
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.vFj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50192vFh.KWHzl(this.KWHzl);
            }
        });
    }

    /* JADX INFO: renamed from: o.vFh$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vFh.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static final androidx.fragment.app.FragmentManager AEQbTJ(C50192vFh c50192vFh) {
        return ((C50170vEm) ViewKt.findFragment(c50192vFh)).getChildFragmentManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.fragment.app.FragmentManager OLrzqt() {
        return (androidx.fragment.app.FragmentManager) this.copydefault.getValue();
    }

    private final ContractDcaManualPresenter AEQbTJ() {
        return (ContractDcaManualPresenter) this.KWHzl.getValue();
    }

    public static final ContractDcaManualPresenter KWHzl(C50192vFh c50192vFh) {
        ViewModelStoreOwner viewModelStoreOwner = ViewTreeViewModelStoreOwner.get(c50192vFh);
        if (viewModelStoreOwner != null) {
            return (ContractDcaManualPresenter) new ViewModelProvider(viewModelStoreOwner).get(ContractDcaManualPresenter.class);
        }
        return null;
    }

    public final void KWHzl() {
        AhwBna();
        EZpvd();
        copydefault();
        this.gEmmrt = ((C50170vEm) ViewKt.findFragment(this)).registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.vFt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C50192vFh.EZpvd(this.AEQbTJ, (ActivityResult) obj);
            }
        });
        this.valueOf = ((C50170vEm) ViewKt.findFragment(this)).registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.vFz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C50192vFh.OLrzqt(this.EZpvd, (ActivityResult) obj);
            }
        });
    }

    public static final void EZpvd(C50192vFh c50192vFh, ActivityResult activityResult) {
        ContractDcaManualPresenter contractDcaManualPresenterAEQbTJ;
        TradeLiveData<ContractDcaAdvancedParams> tradeLiveDataCopydefault;
        ContractDcaAdvancedParams value;
        if (activityResult.getResultCode() == -1) {
            ContractDcaManualPresenter contractDcaManualPresenterAEQbTJ2 = c50192vFh.AEQbTJ();
            ContractDcaAdvancedParams contractDcaAdvancedParams = null;
            contractDcaAdvancedParams = null;
            contractDcaAdvancedParams = null;
            if (contractDcaManualPresenterAEQbTJ2 != null && (tradeLiveDataCopydefault = contractDcaManualPresenterAEQbTJ2.copydefault()) != null && (value = tradeLiveDataCopydefault.getValue()) != null) {
                android.content.Intent data = activityResult.getData();
                DcaTriggerParam dcaTriggerParam = data != null ? (DcaTriggerParam) data.getParcelableExtra("data") : null;
                value.copydefault(dcaTriggerParam instanceof DcaTriggerParam ? dcaTriggerParam : null);
                contractDcaAdvancedParams = value;
            }
            if (contractDcaAdvancedParams == null || (contractDcaManualPresenterAEQbTJ = c50192vFh.AEQbTJ()) == null) {
                return;
            }
            contractDcaManualPresenterAEQbTJ.EZpvd(contractDcaAdvancedParams);
        }
    }

    public static final void OLrzqt(C50192vFh c50192vFh, ActivityResult activityResult) {
        ContractDcaManualPresenter contractDcaManualPresenterAEQbTJ;
        TradeLiveData<ContractDcaAdvancedParams> tradeLiveDataCopydefault;
        ContractDcaAdvancedParams value;
        if (activityResult.getResultCode() == -1) {
            ContractDcaManualPresenter contractDcaManualPresenterAEQbTJ2 = c50192vFh.AEQbTJ();
            ContractDcaAdvancedParams contractDcaAdvancedParams = null;
            contractDcaAdvancedParams = null;
            contractDcaAdvancedParams = null;
            if (contractDcaManualPresenterAEQbTJ2 != null && (tradeLiveDataCopydefault = contractDcaManualPresenterAEQbTJ2.copydefault()) != null && (value = tradeLiveDataCopydefault.getValue()) != null) {
                android.content.Intent data = activityResult.getData();
                DcaTriggerParam dcaTriggerParam = data != null ? (DcaTriggerParam) data.getParcelableExtra("data") : null;
                value.KWHzl(dcaTriggerParam instanceof DcaTriggerParam ? dcaTriggerParam : null);
                contractDcaAdvancedParams = value;
            }
            if (contractDcaAdvancedParams == null || (contractDcaManualPresenterAEQbTJ = c50192vFh.AEQbTJ()) == null) {
                return;
            }
            contractDcaManualPresenterAEQbTJ.EZpvd(contractDcaAdvancedParams);
        }
    }

    private final void AhwBna() {
        this.EZpvd = (uTS) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.cancel, this, true);
        refreshVisibleState$default(this, null, 1, null);
    }

    private final void EZpvd() {
        uTS uts = this.EZpvd;
        uTS uts2 = null;
        if (uts == null) {
            Intrinsics.gEmmrt("");
            uts = null;
        }
        uts.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.vFq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50192vFh.AYXKKw(this.AEQbTJ, view);
            }
        });
        uTS uts3 = this.EZpvd;
        if (uts3 == null) {
            Intrinsics.gEmmrt("");
            uts3 = null;
        }
        C55258xgZ c55258xgZ = uts3.OLrzqt;
        c55258xgZ.setOnClickListener(new Activity(c55258xgZ, 1000L, this));
        uTS uts4 = this.EZpvd;
        if (uts4 == null) {
            Intrinsics.gEmmrt("");
            uts4 = null;
        }
        uts4.djBIcL.KWHzl(new View.OnClickListener() { // from class: o.vFr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50192vFh.djBIcL(this.EZpvd, view);
            }
        });
        uTS uts5 = this.EZpvd;
        if (uts5 == null) {
            Intrinsics.gEmmrt("");
            uts5 = null;
        }
        uts5.gEmmrt.KWHzl(new View.OnClickListener() { // from class: o.vFv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50192vFh.gEmmrt(this.KWHzl, view);
            }
        });
        uTS uts6 = this.EZpvd;
        if (uts6 == null) {
            Intrinsics.gEmmrt("");
            uts6 = null;
        }
        uts6.AhwBna.KWHzl(new View.OnClickListener() { // from class: o.vFu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50192vFh.AhwBna(this.EZpvd, view);
            }
        });
        uTS uts7 = this.EZpvd;
        if (uts7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            uts2 = uts7;
        }
        uts2.EZpvd.KWHzl(new View.OnClickListener() { // from class: o.vFs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50192vFh.valueOf(this.OLrzqt, view);
            }
        });
    }

    public static final void AYXKKw(C50192vFh c50192vFh, android.view.View view) {
        uTS uts = c50192vFh.EZpvd;
        if (uts == null) {
            Intrinsics.gEmmrt("");
            uts = null;
        }
        Group group = uts.KWHzl;
        Intrinsics.checkNotNullExpressionValue(group, "");
        boolean z = !(group.getVisibility() == 0);
        c50192vFh.AEQbTJ(java.lang.Boolean.valueOf(z));
        SPUtils.put("sp_tag_visible_state_contract_dca", java.lang.Boolean.valueOf(z));
    }

    public static final void djBIcL(C50192vFh c50192vFh, android.view.View view) {
        ActivityResultLauncher<android.content.Intent> activityResultLauncher;
        TradeLiveData<java.lang.String> tradeLiveDataOLrzqt;
        java.lang.String value;
        C55887xsS c55887xsSFvQaOB;
        java.lang.String strGEmmrt;
        C55887xsS c55887xsSFvQaOB2;
        java.lang.String strDjBIcL;
        DcaTriggerParam dcaTriggerParamFARcdN;
        TradeLiveData<ContractDcaAdvancedParams> tradeLiveDataCopydefault;
        ContractDcaAdvancedParams value2;
        ContractDcaManualPresenter contractDcaManualPresenterAEQbTJ = c50192vFh.AEQbTJ();
        DcaTriggerParam dcaTriggerParamEZpvd = (contractDcaManualPresenterAEQbTJ == null || (tradeLiveDataCopydefault = contractDcaManualPresenterAEQbTJ.copydefault()) == null || (value2 = tradeLiveDataCopydefault.getValue()) == null) ? null : value2.EZpvd();
        if (!Intrinsics.EZpvd((java.lang.Object) (dcaTriggerParamEZpvd != null ? dcaTriggerParamEZpvd.getTriggerStrategy() : null), (java.lang.Object) ContractDcaTriggerType.RSI.getMode())) {
            ContractDcaManualPresenter contractDcaManualPresenterAEQbTJ2 = c50192vFh.AEQbTJ();
            if (contractDcaManualPresenterAEQbTJ2 == null || (dcaTriggerParamFARcdN = contractDcaManualPresenterAEQbTJ2.fARcdN()) == null) {
                dcaTriggerParamEZpvd = null;
            } else {
                dcaTriggerParamFARcdN.setTriggerStrategy(dcaTriggerParamEZpvd != null ? dcaTriggerParamEZpvd.getTriggerStrategy() : null);
                if (Intrinsics.EZpvd((java.lang.Object) (dcaTriggerParamEZpvd != null ? dcaTriggerParamEZpvd.getTriggerStrategy() : null), (java.lang.Object) ContractDcaTriggerType.PRICE.getMode())) {
                    dcaTriggerParamFARcdN.setTriggerPx(dcaTriggerParamEZpvd != null ? dcaTriggerParamEZpvd.getTriggerPx() : null);
                }
                dcaTriggerParamEZpvd = dcaTriggerParamFARcdN;
            }
        }
        android.content.Context context = c50192vFh.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        AppCompatActivity appCompatActivityCopydefault = C49955uyM.copydefault(context);
        if (appCompatActivityCopydefault != null && (activityResultLauncher = c50192vFh.gEmmrt) != null) {
            android.content.Intent intent = new android.content.Intent(appCompatActivityCopydefault, (java.lang.Class<?>) ActivityC50114vCk.class);
            java.util.List listEZpvd = C56402yEa.EZpvd(dcaTriggerParamEZpvd);
            ContractDcaManualPresenter contractDcaManualPresenterAEQbTJ3 = c50192vFh.AEQbTJ();
            java.lang.String str = (contractDcaManualPresenterAEQbTJ3 == null || (c55887xsSFvQaOB2 = contractDcaManualPresenterAEQbTJ3.fvQaOB()) == null || (strDjBIcL = c55887xsSFvQaOB2.djBIcL()) == null) ? "" : strDjBIcL;
            ContractDcaManualPresenter contractDcaManualPresenterAEQbTJ4 = c50192vFh.AEQbTJ();
            java.lang.String str2 = (contractDcaManualPresenterAEQbTJ4 == null || (c55887xsSFvQaOB = contractDcaManualPresenterAEQbTJ4.fvQaOB()) == null || (strGEmmrt = c55887xsSFvQaOB.gEmmrt()) == null) ? "" : strGEmmrt;
            ContractDcaManualPresenter contractDcaManualPresenterAEQbTJ5 = c50192vFh.AEQbTJ();
            intent.putExtra("data", new TacticsData(null, null, str, str2, null, null, false, null, TacticsType.TACTICS_CONTRACT_DCA, 0, null, null, 0L, null, null, null, null, null, null, null, null, null, (contractDcaManualPresenterAEQbTJ5 == null || (tradeLiveDataOLrzqt = contractDcaManualPresenterAEQbTJ5.OLrzqt()) == null || (value = tradeLiveDataOLrzqt.getValue()) == null) ? "" : value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, listEZpvd, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, -4194573, -33, -1, -1, -1, 3, null));
            activityResultLauncher.launch(intent);
        }
        C56028xvA.botClickTrack$default("startCondition", null, 2, null);
    }

    /* JADX INFO: renamed from: o.vFh$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C50192vFh copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C50192vFh c50192vFh) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = c50192vFh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C53266wiJ.Companion.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.RVsVBY), yDY.copydefault(new BotExplainGatherData(C33070mpX.AYXKKw(C55688xof.Application.GFUIi), yDY.copydefault(new ExplainItemModel(C33070mpX.AYXKKw(C55688xof.Application.QXDzTk), C33070mpX.AYXKKw(C55688xof.Application.ODXsMY)), new ExplainItemModel(C33070mpX.AYXKKw(C55688xof.Application.setShuffleModeEnabledRemoved), C33070mpX.AYXKKw(C55688xof.Application.DlmWDR)))), new BotExplainGatherData(C33070mpX.AYXKKw(C55688xof.Application.gVEiQJ), yDY.copydefault(new ExplainItemModel(C33070mpX.AYXKKw(C55688xof.Application.hdpuIA), C33070mpX.AYXKKw(C55688xof.Application.FQMcgEfQMcgE)), new ExplainItemModel(C33070mpX.AYXKKw(C55688xof.Application.dPkBzA), C33070mpX.AYXKKw(C55688xof.Application.FQNKFG)))), new BotExplainGatherData(C33070mpX.AYXKKw(C55688xof.Application.DwQSDd), yDY.copydefault(new ExplainItemModel(C33070mpX.AYXKKw(C55688xof.Application.zEHIKV), C33070mpX.AYXKKw(C55688xof.Application.fMBJsc)), new ExplainItemModel(C33070mpX.AYXKKw(C55688xof.Application.Rstring), C33070mpX.AYXKKw(C55688xof.Application.finishInit)), new ExplainItemModel(C33070mpX.AYXKKw(C55688xof.Application.addOnMenuVisibilityListener), C33070mpX.AYXKKw(C55688xof.Application.setPageName))))), this.copydefault.OLrzqt());
                C56028xvA.botClickTrack$default("advancedTv", null, 2, null);
            }
        }
    }

    public static final void gEmmrt(C50192vFh c50192vFh, android.view.View view) {
        ActivityResultLauncher<android.content.Intent> activityResultLauncher;
        C55887xsS c55887xsSFvQaOB;
        java.lang.String strGEmmrt;
        C55887xsS c55887xsSFvQaOB2;
        java.lang.String strDjBIcL;
        TradeLiveData<ContractDcaAdvancedParams> tradeLiveDataCopydefault;
        ContractDcaAdvancedParams value;
        android.content.Context context = c50192vFh.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        AppCompatActivity appCompatActivityCopydefault = C49955uyM.copydefault(context);
        if (appCompatActivityCopydefault != null && (activityResultLauncher = c50192vFh.valueOf) != null) {
            android.content.Intent intent = new android.content.Intent(appCompatActivityCopydefault, (java.lang.Class<?>) ActivityC50125vCv.class);
            ContractDcaManualPresenter contractDcaManualPresenterAEQbTJ = c50192vFh.AEQbTJ();
            java.util.List listEZpvd = C56402yEa.EZpvd((contractDcaManualPresenterAEQbTJ == null || (tradeLiveDataCopydefault = contractDcaManualPresenterAEQbTJ.copydefault()) == null || (value = tradeLiveDataCopydefault.getValue()) == null) ? null : value.AYXKKw());
            ContractDcaManualPresenter contractDcaManualPresenterAEQbTJ2 = c50192vFh.AEQbTJ();
            java.lang.String str = (contractDcaManualPresenterAEQbTJ2 == null || (c55887xsSFvQaOB2 = contractDcaManualPresenterAEQbTJ2.fvQaOB()) == null || (strDjBIcL = c55887xsSFvQaOB2.djBIcL()) == null) ? "" : strDjBIcL;
            ContractDcaManualPresenter contractDcaManualPresenterAEQbTJ3 = c50192vFh.AEQbTJ();
            intent.putExtra("data", new TacticsData(null, null, str, (contractDcaManualPresenterAEQbTJ3 == null || (c55887xsSFvQaOB = contractDcaManualPresenterAEQbTJ3.fvQaOB()) == null || (strGEmmrt = c55887xsSFvQaOB.gEmmrt()) == null) ? "" : strGEmmrt, null, null, false, null, TacticsType.TACTICS_CONTRACT_DCA, 0, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, listEZpvd, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, -269, -33, -1, -1, -1, 3, null));
            activityResultLauncher.launch(intent);
        }
        C56028xvA.botClickTrack$default("stopCondition", null, 2, null);
    }

    public static final void AhwBna(C50192vFh c50192vFh, android.view.View view) {
        C50165vEh.Companion.OLrzqt(c50192vFh.OLrzqt());
        C56028xvA.botClickTrack$default("slCondition", null, 2, null);
    }

    public static final void valueOf(C50192vFh c50192vFh, android.view.View view) {
        vDJ.Companion.KWHzl(c50192vFh.OLrzqt(), c50192vFh.AEQbTJ);
        C56028xvA.botClickTrack$default("addCondition", null, 2, null);
    }

    public static /* synthetic */ void refreshVisibleState$default(C50192vFh c50192vFh, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        c50192vFh.AEQbTJ(bool);
    }

    public final void AEQbTJ(java.lang.Boolean bool) {
        boolean zBooleanValue = bool != null ? bool.booleanValue() : SPUtils.getBoolean("sp_tag_visible_state_contract_dca", false);
        uTS uts = this.EZpvd;
        uTS uts2 = null;
        if (uts == null) {
            Intrinsics.gEmmrt("");
            uts = null;
        }
        Group group = uts.KWHzl;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(zBooleanValue ? 0 : 8);
        int i = zBooleanValue ? C52761wXj.TaskDescription.DNMMPQ : C52761wXj.TaskDescription.DCUTEIddSDPG;
        uTS uts3 = this.EZpvd;
        if (uts3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            uts2 = uts3;
        }
        uts2.copydefault.setImageResource(i);
    }

    public final void copydefault() {
        C56111xwe<java.lang.Boolean> c56111xweValues;
        TradeLiveData<java.lang.String> tradeLiveDataAubY;
        TradeLiveData<java.lang.Boolean> tradeLiveDataZsXlph;
        TradeLiveData<java.lang.String> tradeLiveDataZLjUOn;
        TradeLiveData<ContractDcaAdvancedParams> tradeLiveDataCopydefault;
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        if (lifecycleOwner != null) {
            ContractDcaManualPresenter contractDcaManualPresenterAEQbTJ = AEQbTJ();
            if (contractDcaManualPresenterAEQbTJ != null && (tradeLiveDataCopydefault = contractDcaManualPresenterAEQbTJ.copydefault()) != null) {
                tradeLiveDataCopydefault.observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.vFx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C50192vFh.AEQbTJ(this.copydefault, (ContractDcaAdvancedParams) obj);
                    }
                }));
            }
            ContractDcaManualPresenter contractDcaManualPresenterAEQbTJ2 = AEQbTJ();
            if (contractDcaManualPresenterAEQbTJ2 != null && (tradeLiveDataZLjUOn = contractDcaManualPresenterAEQbTJ2.zLjUOn()) != null) {
                tradeLiveDataZLjUOn.observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.vFo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C50192vFh.KWHzl(this.EZpvd, (java.lang.String) obj);
                    }
                }));
            }
            ContractDcaManualPresenter contractDcaManualPresenterAEQbTJ3 = AEQbTJ();
            if (contractDcaManualPresenterAEQbTJ3 != null && (tradeLiveDataZsXlph = contractDcaManualPresenterAEQbTJ3.zsXlph()) != null) {
                tradeLiveDataZsXlph.observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.vFm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C50192vFh.KWHzl(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
                    }
                }));
            }
            ContractDcaManualPresenter contractDcaManualPresenterAEQbTJ4 = AEQbTJ();
            if (contractDcaManualPresenterAEQbTJ4 != null && (tradeLiveDataAubY = contractDcaManualPresenterAEQbTJ4.AubY()) != null) {
                tradeLiveDataAubY.observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.vFn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C50192vFh.OLrzqt(this.OLrzqt, (java.lang.String) obj);
                    }
                }));
            }
            ContractDcaManualPresenter contractDcaManualPresenterAEQbTJ5 = AEQbTJ();
            if (contractDcaManualPresenterAEQbTJ5 == null || (c56111xweValues = contractDcaManualPresenterAEQbTJ5.values()) == null) {
                return;
            }
            c56111xweValues.observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.vFp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C50192vFh.copydefault(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
                }
            }));
        }
    }

    public static final Unit AEQbTJ(C50192vFh c50192vFh, ContractDcaAdvancedParams contractDcaAdvancedParams) {
        java.lang.String strEZpvd;
        C55887xsS c55887xsSFvQaOB;
        java.lang.String strAYXKKw;
        C55887xsS c55887xsSFvQaOB2;
        java.lang.String timePeriod;
        java.lang.String timeframe;
        Intrinsics.checkNotNullParameter(contractDcaAdvancedParams, "");
        uTS uts = c50192vFh.EZpvd;
        if (uts == null) {
            Intrinsics.gEmmrt("");
            uts = null;
        }
        C53573wnz c53573wnz = uts.djBIcL;
        DcaTriggerParam dcaTriggerParamEZpvd = contractDcaAdvancedParams.EZpvd();
        if (Intrinsics.EZpvd((java.lang.Object) (dcaTriggerParamEZpvd != null ? dcaTriggerParamEZpvd.getTriggerStrategy() : null), (java.lang.Object) ContractDcaTriggerType.RSI.getMode())) {
            TriggerCond.Activity activity = TriggerCond.Companion;
            DcaTriggerParam dcaTriggerParamEZpvd2 = contractDcaAdvancedParams.EZpvd();
            java.lang.String strKWHzl = activity.KWHzl(dcaTriggerParamEZpvd2 != null ? dcaTriggerParamEZpvd2.getTriggerCond() : null);
            DcaTriggerParam dcaTriggerParamEZpvd3 = contractDcaAdvancedParams.EZpvd();
            java.lang.String str = strKWHzl + (dcaTriggerParamEZpvd3 != null ? dcaTriggerParamEZpvd3.getThold() : null);
            int i = C55688xof.Application.UiContext;
            kotlin.Pair[] pairArr = new kotlin.Pair[3];
            DcaTriggerParam dcaTriggerParamEZpvd4 = contractDcaAdvancedParams.EZpvd();
            if (dcaTriggerParamEZpvd4 == null || (timePeriod = dcaTriggerParamEZpvd4.getTimePeriod()) == null) {
                timePeriod = "";
            }
            pairArr[0] = C56390yDp.OLrzqt("RSIFactor1", timePeriod);
            TimeFrame.Application application = TimeFrame.Companion;
            DcaTriggerParam dcaTriggerParamEZpvd5 = contractDcaAdvancedParams.EZpvd();
            if (dcaTriggerParamEZpvd5 == null || (timeframe = dcaTriggerParamEZpvd5.getTimeframe()) == null) {
                timeframe = "";
            }
            pairArr[1] = C56390yDp.OLrzqt("RSIFactor2", application.copydefault(timeframe));
            pairArr[2] = C56390yDp.OLrzqt("RSIFactor3", str);
            strEZpvd = C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr));
        } else {
            ContractDcaTriggerType.ActionBar actionBar = ContractDcaTriggerType.Companion;
            java.util.List<DcaTriggerParam> listEZpvd = C56402yEa.EZpvd(contractDcaAdvancedParams.EZpvd());
            ContractDcaManualPresenter contractDcaManualPresenterAEQbTJ = c50192vFh.AEQbTJ();
            strEZpvd = actionBar.EZpvd(listEZpvd, (contractDcaManualPresenterAEQbTJ == null || (c55887xsSFvQaOB = contractDcaManualPresenterAEQbTJ.fvQaOB()) == null) ? null : c55887xsSFvQaOB.DbNXlk());
        }
        c53573wnz.setActiveContent(strEZpvd);
        uTS uts2 = c50192vFh.EZpvd;
        if (uts2 == null) {
            Intrinsics.gEmmrt("");
            uts2 = null;
        }
        C53573wnz c53573wnz2 = uts2.gEmmrt;
        DcaTriggerParam dcaTriggerParamAYXKKw = contractDcaAdvancedParams.AYXKKw();
        java.lang.String triggerStrategy = dcaTriggerParamAYXKKw != null ? dcaTriggerParamAYXKKw.getTriggerStrategy() : null;
        if (triggerStrategy == null || triggerStrategy.length() == 0) {
            strAYXKKw = C33070mpX.AYXKKw(ContractDcaStopConditionType.DEFAULT.getShowMode());
        } else {
            ContractDcaStopConditionType.Activity activity2 = ContractDcaStopConditionType.Companion;
            java.util.List<DcaTriggerParam> listEZpvd2 = C56402yEa.EZpvd(contractDcaAdvancedParams.AYXKKw());
            ContractDcaManualPresenter contractDcaManualPresenterAEQbTJ2 = c50192vFh.AEQbTJ();
            strAYXKKw = activity2.copydefault(listEZpvd2, (contractDcaManualPresenterAEQbTJ2 == null || (c55887xsSFvQaOB2 = contractDcaManualPresenterAEQbTJ2.fvQaOB()) == null) ? null : c55887xsSFvQaOB2.fetchVPNInfo());
        }
        c53573wnz2.setActiveContent(strAYXKKw);
        if (C33129mqd.AEQbTJ(contractDcaAdvancedParams.OLrzqt(), 0)) {
            uTS uts3 = c50192vFh.EZpvd;
            if (uts3 == null) {
                Intrinsics.gEmmrt("");
                uts3 = null;
            }
            C53573wnz c53573wnz3 = uts3.AhwBna;
            java.lang.String strAEQbTJ = ContractDcaStopLossType.Companion.AEQbTJ(contractDcaAdvancedParams.AEQbTJ());
            xMR xmr = xMR.copydefault;
            java.lang.String strOLrzqt = contractDcaAdvancedParams.OLrzqt();
            if (strOLrzqt == null) {
                strOLrzqt = "";
            }
            c53573wnz3.setActiveContent(strAEQbTJ + xMR.formatPercent$default(xmr, strOLrzqt, 0, null, 6, null));
        } else {
            uTS uts4 = c50192vFh.EZpvd;
            if (uts4 == null) {
                Intrinsics.gEmmrt("");
                uts4 = null;
            }
            uts4.AhwBna.setActiveContent(C33070mpX.AYXKKw(C55688xof.Application.StyleableRes));
        }
        uTS uts5 = c50192vFh.EZpvd;
        if (uts5 == null) {
            Intrinsics.gEmmrt("");
            uts5 = null;
        }
        C53573wnz c53573wnz4 = uts5.EZpvd;
        xMR xmr2 = xMR.copydefault;
        java.lang.String strValueOf = contractDcaAdvancedParams.valueOf();
        if (strValueOf == null) {
            strValueOf = "";
        }
        java.lang.String localizedWithMinPrecision$default = xMR.formatLocalizedWithMinPrecision$default(xmr2, strValueOf, 0, 2, null);
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult);
        java.lang.String strKWHzl2 = contractDcaAdvancedParams.KWHzl();
        c53573wnz4.setActiveContent(localizedWithMinPrecision$default + strAYXKKw2 + " | " + xMR.formatLocalizedWithMinPrecision$default(xmr2, strKWHzl2 != null ? strKWHzl2 : "", 0, 2, null) + C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult));
        java.lang.Boolean boolCopydefault = contractDcaAdvancedParams.copydefault();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (Intrinsics.EZpvd(boolCopydefault, bool)) {
            c50192vFh.AEQbTJ(bool);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C50192vFh c50192vFh, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        uTS uts = c50192vFh.EZpvd;
        if (uts == null) {
            Intrinsics.gEmmrt("");
            uts = null;
        }
        uts.EZpvd.setActiveContentState(true);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C50192vFh c50192vFh, boolean z) {
        uTS uts = c50192vFh.EZpvd;
        if (uts == null) {
            Intrinsics.gEmmrt("");
            uts = null;
        }
        uts.djBIcL.setActiveContentState(z);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C50192vFh c50192vFh, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        uTS uts = c50192vFh.EZpvd;
        uTS uts2 = null;
        if (uts == null) {
            Intrinsics.gEmmrt("");
            uts = null;
        }
        uts.EZpvd.setActiveContentState(true);
        uTS uts3 = c50192vFh.EZpvd;
        if (uts3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            uts2 = uts3;
        }
        uts2.AhwBna.setActiveContentState(true);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C50192vFh c50192vFh, boolean z) {
        if (!z) {
            return Unit.INSTANCE;
        }
        uTS uts = c50192vFh.EZpvd;
        uTS uts2 = null;
        if (uts == null) {
            Intrinsics.gEmmrt("");
            uts = null;
        }
        uts.EZpvd.setActiveContentState(false);
        uTS uts3 = c50192vFh.EZpvd;
        if (uts3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            uts2 = uts3;
        }
        uts2.AhwBna.setActiveContentState(false);
        return Unit.INSTANCE;
    }
}
