package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.biz.TacticsType;
import com.okinc.tradingbot.impl.order.strategy.contractdca.presenter.ContractDcaAutoMarginPresenter;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.bot.data.TacticsData;
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

/* JADX INFO: renamed from: o.vCe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class ActivityC50108vCe extends AbstractActivityC48163uHh<uTE, ContractDcaAutoMarginPresenter> {
    public final boolean KWHzl = true;
    public final InterfaceC56387yDm OLrzqt;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.vCe$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC54499xKr
    public int AYXKKw() {
        return C48033uCm.Activity.zpGcln;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC33041mov
    public boolean getApplyNavigationBarInsets() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ ContractDcaAutoMarginPresenter EZpvd(ActivityC50108vCe activityC50108vCe) {
        return (ContractDcaAutoMarginPresenter) activityC50108vCe.gHZMYf();
    }

    public ActivityC50108vCe() {
        final Function0 function0 = null;
        this.OLrzqt = new ViewModelLazy(C56524yIo.AEQbTJ(C55915xsu.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractdca.ui.activity.ContractDcaAutoMarginActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractdca.ui.activity.ContractDcaAutoMarginActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractdca.ui.activity.ContractDcaAutoMarginActivity$special$$inlined$viewModels$default$3
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
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    private final C55915xsu copydefault() {
        return (C55915xsu) this.OLrzqt.getValue();
    }

    /* JADX INFO: renamed from: o.vCe$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vCe.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void KWHzl(@NotNull android.content.Context context, TacticsData tacticsData) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC50108vCe.class);
            intent.putExtra("data", tacticsData);
            context.startActivity(intent);
        }
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        KWHzl();
        OLrzqt();
        EZpvd();
        gEmmrt();
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        super.onResume();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        copydefault().EZpvd("contract_dca", (64 & 2) != 0 ? "cash" : "cross", (64 & 4) != 0 ? "" : "net_mode", (64 & 8) != 0 ? java.lang.Boolean.TRUE : null, (64 & 16) != 0, (64 & 32) != 0 ? null : (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(((ContractDcaAutoMarginPresenter) gHZMYf()).KWHzl().getInstType())) == null) ? null : abstractC54531xLwOLrzqt.valueOf(((ContractDcaAutoMarginPresenter) gHZMYf()).KWHzl().getInstId()), (64 & 64) != 0 ? null : null, (64 & 128) == 0 ? null : null);
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        copydefault().AYXKKw();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void KWHzl() {
        TacticsData tacticsData;
        ContractDcaAutoMarginPresenter contractDcaAutoMarginPresenter = (ContractDcaAutoMarginPresenter) gHZMYf();
        android.content.Intent intent = getIntent();
        if (intent == null || (tacticsData = (TacticsData) intent.getParcelableExtra("data")) == null) {
            tacticsData = new TacticsData(null, null, null, null, null, null, false, null, TacticsType.TACTICS_CONTRACT_DCA, 0, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, -1, -1, -1, -1, 3, null);
        }
        contractDcaAutoMarginPresenter.EZpvd(tacticsData);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v23, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v29, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v17, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v22, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v29, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v9, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void OLrzqt() {
        BizInstrument bizInstrumentCopydefault;
        java.lang.String quoteSymbol;
        java.lang.String instType;
        java.lang.String instFamily;
        Group group = ((uTE) sSMYrx()).AkhnZx;
        java.lang.String str = "";
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(((ContractDcaAutoMarginPresenter) gHZMYf()).AhwBna() ? 0 : 8);
        Group group2 = ((uTE) sSMYrx()).AhwBna;
        Intrinsics.checkNotNullExpressionValue(group2, "");
        group2.setVisibility(((ContractDcaAutoMarginPresenter) gHZMYf()).AhwBna() ^ true ? 0 : 8);
        Group group3 = ((uTE) sSMYrx()).AkhnZx;
        Intrinsics.checkNotNullExpressionValue(group3, "");
        if (group3.getVisibility() == 0) {
            ((uTE) sSMYrx()).AEQbTJ.setText(((ContractDcaAutoMarginPresenter) gHZMYf()).EZpvd());
        }
        Group group4 = ((uTE) sSMYrx()).AhwBna;
        Intrinsics.checkNotNullExpressionValue(group4, "");
        if (group4.getVisibility() == 0) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null) {
                java.lang.Object marginDig = 2;
                int iAhwBna = C33129mqd.AhwBna(marginDig);
                C47988uAv c47988uAv = ((uTE) sSMYrx()).OLrzqt;
                C47988uAv.setInputContent$default(c47988uAv, ((ContractDcaAutoMarginPresenter) gHZMYf()).EZpvd(), false, false, 6, null);
                BizInstrument bizInstrumentCopydefault2 = ((ContractDcaAutoMarginPresenter) gHZMYf()).copydefault();
                c47988uAv.setInputUnit(bizInstrumentCopydefault2 == null ? bizInstrumentCopydefault2.getQuoteSymbol() : null);
                c47988uAv.setMaxDecimal(iAhwBna);
                C53539wnR c53539wnR = ((uTE) sSMYrx()).EZpvd;
                c53539wnR.setFooterAvaValue("--");
                bizInstrumentCopydefault = ((ContractDcaAutoMarginPresenter) gHZMYf()).copydefault();
                if (bizInstrumentCopydefault != null && (quoteSymbol = bizInstrumentCopydefault.getQuoteSymbol()) != null) {
                    str = quoteSymbol;
                }
                c53539wnR.setTransferCoin(str);
            } else {
                BizInstrument bizInstrumentCopydefault3 = ((ContractDcaAutoMarginPresenter) gHZMYf()).copydefault();
                if (bizInstrumentCopydefault3 == null || (instType = bizInstrumentCopydefault3.getInstType()) == null) {
                    instType = "";
                }
                AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
                if (abstractC54531xLwOLrzqt != null) {
                    BizInstrument bizInstrumentCopydefault4 = ((ContractDcaAutoMarginPresenter) gHZMYf()).copydefault();
                    if (bizInstrumentCopydefault4 == null || (instFamily = bizInstrumentCopydefault4.getInstFamily()) == null) {
                        instFamily = "";
                    }
                    IdxConfig idxConfigAkhnZx = abstractC54531xLwOLrzqt.AkhnZx(instFamily);
                    if (idxConfigAkhnZx == null || (marginDig = idxConfigAkhnZx.getMarginDig()) == null) {
                    }
                    int iAhwBna2 = C33129mqd.AhwBna(marginDig);
                    C47988uAv c47988uAv2 = ((uTE) sSMYrx()).OLrzqt;
                    C47988uAv.setInputContent$default(c47988uAv2, ((ContractDcaAutoMarginPresenter) gHZMYf()).EZpvd(), false, false, 6, null);
                    BizInstrument bizInstrumentCopydefault22 = ((ContractDcaAutoMarginPresenter) gHZMYf()).copydefault();
                    c47988uAv2.setInputUnit(bizInstrumentCopydefault22 == null ? bizInstrumentCopydefault22.getQuoteSymbol() : null);
                    c47988uAv2.setMaxDecimal(iAhwBna2);
                    C53539wnR c53539wnR2 = ((uTE) sSMYrx()).EZpvd;
                    c53539wnR2.setFooterAvaValue("--");
                    bizInstrumentCopydefault = ((ContractDcaAutoMarginPresenter) gHZMYf()).copydefault();
                    if (bizInstrumentCopydefault != null) {
                        str = quoteSymbol;
                    }
                    c53539wnR2.setTransferCoin(str);
                }
            }
        }
        C52794wYp c52794wYp = ((uTE) sSMYrx()).AYXKKw;
        c52794wYp.setText(((ContractDcaAutoMarginPresenter) gHZMYf()).AhwBna() ? C33070mpX.AYXKKw(C55688xof.Application.onSaveInstanceState) : C33070mpX.AYXKKw(C55688xof.Application.peekAvailableContext));
        c52794wYp.setEnabled(((ContractDcaAutoMarginPresenter) gHZMYf()).AhwBna());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void EZpvd() {
        ((uTE) sSMYrx()).OLrzqt.setOnTextChangeCallback(new Function2() { // from class: o.vCg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC50108vCe.AEQbTJ(this.OLrzqt, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        C52794wYp c52794wYp = ((uTE) sSMYrx()).AYXKKw;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(ActivityC50108vCe activityC50108vCe, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        ((ContractDcaAutoMarginPresenter) activityC50108vCe.gHZMYf()).EZpvd(str);
        ((uTE) activityC50108vCe.sSMYrx()).AYXKKw.setEnabled(activityC50108vCe.AEQbTJ());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void gEmmrt() {
        copydefault().AhwBna().observe(this, new ActionBar(new Function1() { // from class: o.vCl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC50108vCe.AEQbTJ(this.EZpvd, (java.lang.String) obj);
            }
        }));
        ((ContractDcaAutoMarginPresenter) gHZMYf()).OLrzqt().observe(this, new ActionBar(new Function1() { // from class: o.vCm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC50108vCe.OLrzqt(this.OLrzqt, (java.util.List) obj);
            }
        }));
        ((ContractDcaAutoMarginPresenter) gHZMYf()).AEQbTJ().AkhnZx().observe(this, new ActionBar(new Function1() { // from class: o.vCj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC50108vCe.OLrzqt(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        ((ContractDcaAutoMarginPresenter) gHZMYf()).AEQbTJ().AhwBna().observe(this, new Observer() { // from class: o.vCi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                ActivityC50108vCe.EZpvd((java.lang.Exception) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(ActivityC50108vCe activityC50108vCe, java.lang.String str) {
        java.lang.String instType;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLCopydefault2;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLDjBIcL;
        java.lang.String instFamily;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        java.lang.String safeString$default = null;
        if (interfaceC54581xNrCopydefault != null) {
            BizInstrument bizInstrumentCopydefault = ((ContractDcaAutoMarginPresenter) activityC50108vCe.gHZMYf()).copydefault();
            if (bizInstrumentCopydefault == null || (instType = bizInstrumentCopydefault.getInstType()) == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt != null) {
                BizInstrument bizInstrumentCopydefault2 = ((ContractDcaAutoMarginPresenter) activityC50108vCe.gHZMYf()).copydefault();
                if (bizInstrumentCopydefault2 != null && (instFamily = bizInstrumentCopydefault2.getInstFamily()) != null) {
                    str2 = instFamily;
                }
                xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, str2, null, 2, null);
                if (xmvCreateSizeConverterWithIndex$default != null && (c54536xMLCopydefault = xmvCreateSizeConverterWithIndex$default.copydefault(str)) != null && (c54536xMLCopydefault2 = c54536xMLCopydefault.copydefault()) != null && (c54536xMLFetchVPNInfo = c54536xMLCopydefault2.fetchVPNInfo()) != null && (c54536xMLDjBIcL = c54536xMLFetchVPNInfo.djBIcL()) != null) {
                    safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null);
                }
            }
        }
        ((uTE) activityC50108vCe.sSMYrx()).EZpvd.setFooterAvaValue(safeString$default);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(ActivityC50108vCe activityC50108vCe, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (((ContractDcaAutoMarginPresenter) activityC50108vCe.gHZMYf()).AhwBna()) {
            C55326xho.toastWithSuccessfulIcon$default(C55688xof.Application.Dfm, 0, 1, (java.lang.Object) null);
        } else {
            C55326xho.toastWithSuccessfulIcon$default(C55688xof.Application.DRGLNw, 0, 1, (java.lang.Object) null);
        }
        activityC50108vCe.finish();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC50108vCe activityC50108vCe, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            activityC50108vCe.showLoading();
        } else {
            activityC50108vCe.releaseLoading();
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        java.lang.String message = exc.getMessage();
        if (message != null) {
            C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final boolean AEQbTJ() {
        java.lang.String strAkhnZx = ((uTE) sSMYrx()).OLrzqt.AkhnZx();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx) || C33129mqd.valueOf(strAkhnZx, "0")) {
            AppCompatTextView appCompatTextView = ((uTE) sSMYrx()).KWHzl;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(8);
            return false;
        }
        MaxAvailableResp maxAvailableResp = copydefault().AEQbTJ().get();
        if (C33129mqd.AEQbTJ(strAkhnZx, maxAvailableResp != null ? maxAvailableResp.getQuoteMax() : null)) {
            AppCompatTextView appCompatTextView2 = ((uTE) sSMYrx()).KWHzl;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
            appCompatTextView2.setVisibility(0);
            ((uTE) sSMYrx()).OLrzqt.copydefault();
        } else {
            ((uTE) sSMYrx()).OLrzqt.copydefault();
            AppCompatTextView appCompatTextView3 = ((uTE) sSMYrx()).KWHzl;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
            appCompatTextView3.setVisibility(8);
        }
        return true;
    }

    /* JADX INFO: renamed from: o.vCe$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ ActivityC50108vCe copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC50108vCe activityC50108vCe) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = activityC50108vCe;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ActivityC50108vCe.EZpvd(this.copydefault).valueOf();
            }
        }
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
