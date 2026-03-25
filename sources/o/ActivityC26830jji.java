package o;

import android.view.View;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.InvestRedeemReceiveInfoUIBean;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfoUIBean;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.bean.InvestUniv3RedeemInitialInfo;
import com.okinc.business.invest_biz.data.bean.InvestUniv3RedeemReceiveInfo;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.business.invest_biz.data.logic.ResponseState;
import com.okinc.business.invest_biz.data.logic.ResponseStateType;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestInputData;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestTransactionModel;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.bean.InvestConsumeData;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3FarmRedeemViewModel;
import com.okinc.business.invest_biz.ui.widget.InvestUniv3CurrentPriceViewMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.DeserializationStrategy;
import o.C25493ixk;
import o.iXD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jji, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class ActivityC26830jji extends AbstractActivityC26832jjk implements InterfaceC23612iCv {
    public C23730iHe AEQbTJ;
    public boolean AYXKKw;
    public java.util.ArrayList<InvestInputData> AhwBna;
    public final InterfaceC56387yDm DbNXlk;
    public long djBIcL;
    public long valueOf;
    public TransactionConfig values;
    public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.jjD
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC26830jji.AkhnZx(this.EZpvd);
        }
    });
    public final Observer<InvestTransactionModel> gEmmrt = new Observer() { // from class: o.jjG
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            ActivityC26830jji.EZpvd(this.KWHzl, (InvestTransactionModel) obj);
        }
    };
    public java.lang.String fJNWhG = "";
    public java.lang.String AkhnZx = "";
    public java.lang.String isConnected = "";

    /* JADX INFO: renamed from: o.jji$ActionBar */
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
    /* JADX DEBUG: Possible override for method o.jjk.EZpvd()V */
    @Override // o.InterfaceC23612iCv
    public long EZpvd() {
        return this.djBIcL;
    }

    /* JADX INFO: renamed from: o.jji$TaskDescription */
    public static final class TaskDescription implements Function1<java.lang.String, InvestTransactionModel> {
        public static final TaskDescription EZpvd = new TaskDescription();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        /* JADX WARN: Type inference failed for: r3v1, types: [com.okinc.business.invest_biz.data.logic.ws.bean.InvestTransactionModel, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final InvestTransactionModel invoke(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) InvestTransactionModel.Companion.serializer(), str);
        }
    }

    /* JADX INFO: renamed from: o.jji$Application */
    public static final class Application implements Function0<java.lang.Object> {
        public final /* synthetic */ Function1 EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(java.lang.String str, Function1 function1) {
            this.KWHzl = str;
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Type inference failed for: r0v0, types: [o.jji$Application$5] */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final AnonymousClass5 invoke() {
            final java.lang.String str = this.KWHzl;
            final Function1 function1 = this.EZpvd;
            return new ViewModelProvider.Factory() { // from class: o.jji.Application.5
                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public <T extends ViewModel> T create(java.lang.Class<T> cls) {
                    Intrinsics.checkNotNullParameter(cls, "");
                    return new C23611iCu(str, function1);
                }
            };
        }
    }

    public ActivityC26830jji() {
        final Function0 function0 = null;
        this.DbNXlk = new ViewModelLazy(C56524yIo.AEQbTJ(C23611iCu.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3FarmRedeemActivity$special$$inlined$viewModels$default$2
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
        }, new Application("invest-tx-status-toast", TaskDescription.EZpvd), new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3FarmRedeemActivity$special$$inlined$viewModels$default$3
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

    public final InvestUniv3FarmRedeemViewModel AhwBna() {
        return (InvestUniv3FarmRedeemViewModel) this.fetchVPNInfo.getValue();
    }

    public static final InvestUniv3FarmRedeemViewModel AkhnZx(ActivityC26830jji activityC26830jji) {
        return (InvestUniv3FarmRedeemViewModel) new ViewModelProvider(activityC26830jji).get(InvestUniv3FarmRedeemViewModel.class);
    }

    private final C23611iCu<InvestTransactionModel> AYXKKw() {
        return (C23611iCu) this.DbNXlk.getValue();
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3FarmRedeemViewModel.getReceiveInfoAndCheckState$default(com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3FarmRedeemViewModel, o.yHO, int, java.lang.Object):void */
    public static final void EZpvd(ActivityC26830jji activityC26830jji, InvestTransactionModel investTransactionModel) {
        java.lang.Integer pushToastCode;
        java.lang.Integer pushToastCode2;
        java.lang.Integer pushToastCode3;
        Intrinsics.checkNotNullParameter(investTransactionModel, "");
        android.os.Bundle bundleKWHzl = activityC26830jji.AhwBna().KWHzl();
        if (bundleKWHzl != null) {
            if ((C33129mqd.OLrzqt((java.lang.CharSequence) investTransactionModel.getTxHash()) && Intrinsics.EZpvd((java.lang.Object) investTransactionModel.getTxHash(), (java.lang.Object) bundleKWHzl.getString("tx_hash"))) || (C33129mqd.OLrzqt((java.lang.CharSequence) investTransactionModel.getUopHash()) && Intrinsics.EZpvd((java.lang.Object) investTransactionModel.getUopHash(), (java.lang.Object) bundleKWHzl.getString("tx_uop_hash")))) {
                java.lang.Integer pushToastCode4 = investTransactionModel.getPushToastCode();
                if ((pushToastCode4 != null && pushToastCode4.intValue() == 2) || (((pushToastCode = investTransactionModel.getPushToastCode()) != null && pushToastCode.intValue() == 5) || (((pushToastCode2 = investTransactionModel.getPushToastCode()) != null && pushToastCode2.intValue() == 25) || ((pushToastCode3 = investTransactionModel.getPushToastCode()) != null && pushToastCode3.intValue() == 26)))) {
                    InvestUniv3FarmRedeemViewModel.getReceiveInfoAndCheckState$default(activityC26830jji.AhwBna(), null, 1, null);
                }
            }
        }
    }

    @Override // o.AbstractActivityC26832jjk, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.AEQbTJ = C23730iHe.KWHzl(getLayoutInflater());
        android.content.Intent intent = getIntent();
        if (intent != null) {
            TransactionConfig transactionConfig = (TransactionConfig) intent.getParcelableExtra("key.trx_config");
            this.values = transactionConfig;
            if (transactionConfig != null) {
                this.djBIcL = transactionConfig.isConnected();
                this.AhwBna = transactionConfig.valueOf();
                this.valueOf = transactionConfig.copydefault();
                this.AYXKKw = transactionConfig.AwvSrB();
                this.isConnected = transactionConfig.ejfBZ();
            }
        }
        C23730iHe c23730iHe = this.AEQbTJ;
        C23730iHe c23730iHe2 = null;
        if (c23730iHe == null) {
            Intrinsics.gEmmrt("");
            c23730iHe = null;
        }
        setContentView(c23730iHe.getRoot());
        values();
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = ((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).gEmmrt().KWHzl();
        final Function1 function1 = new Function1() { // from class: o.jjz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26830jji.copydefault(this.EZpvd, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.jjC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC26830jji.OLrzqt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.jjB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26830jji.OLrzqt((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.jjA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC26830jji.KWHzl(function12, obj);
            }
        });
        valueOf();
        isConnected();
        C23730iHe c23730iHe3 = this.AEQbTJ;
        if (c23730iHe3 == null) {
            Intrinsics.gEmmrt("");
            c23730iHe3 = null;
        }
        c23730iHe3.copydefault.setVisibility(8);
        C23730iHe c23730iHe4 = this.AEQbTJ;
        if (c23730iHe4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23730iHe2 = c23730iHe4;
        }
        C27137jpX c27137jpX = c23730iHe2.gEmmrt;
        c27137jpX.setTitle(C33070mpX.AYXKKw(C25493ixk.FragmentManager.iRxXKY));
        c27137jpX.setSubTitle(C33070mpX.AYXKKw(C25493ixk.FragmentManager.AxsJAYsNCnLh));
        c27137jpX.setButtonText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.AwvSrB));
        AYXKKw().KWHzl().observeForever(this.gEmmrt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(ActivityC26830jji activityC26830jji, InterfaceC9738bbJ interfaceC9738bbJ) {
        if (interfaceC9738bbJ.zsXlph() || !interfaceC9738bbJ.UeEOUB()) {
            activityC26830jji.OLrzqt(interfaceC9738bbJ.DbNXlk(), interfaceC9738bbJ.EZpvd(activityC26830jji.valueOf));
        } else {
            activityC26830jji.OLrzqt(interfaceC9738bbJ.DbNXlk(), interfaceC9738bbJ.EZpvd(activityC26830jji.valueOf));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC26832jjk, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AYXKKw().KWHzl().removeObserver(this.gEmmrt);
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.String tokenAddress = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.fJNWhG = str;
        this.AkhnZx = str2;
        C23730iHe c23730iHe = this.AEQbTJ;
        if (c23730iHe == null) {
            Intrinsics.gEmmrt("");
            c23730iHe = null;
        }
        c23730iHe.gEmmrt.setVisibility(8);
        C23730iHe c23730iHe2 = this.AEQbTJ;
        if (c23730iHe2 == null) {
            Intrinsics.gEmmrt("");
            c23730iHe2 = null;
        }
        c23730iHe2.AYXKKw.setVisibility(0);
        C23730iHe c23730iHe3 = this.AEQbTJ;
        if (c23730iHe3 == null) {
            Intrinsics.gEmmrt("");
            c23730iHe3 = null;
        }
        C27207jqo c27207jqo = c23730iHe3.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c27207jqo, "");
        C27301jsc.copydefault(c27207jqo);
        C23730iHe c23730iHe4 = this.AEQbTJ;
        if (c23730iHe4 == null) {
            Intrinsics.gEmmrt("");
            c23730iHe4 = null;
        }
        c23730iHe4.copydefault.setVisibility(8);
        if (C33129mqd.KWHzl((java.util.Collection) this.AhwBna)) {
            java.util.ArrayList<InvestInputData> arrayList = this.AhwBna;
            Intrinsics.copydefault(arrayList);
            tokenAddress = arrayList.get(0).getTokenAddress();
            Intrinsics.copydefault((java.lang.Object) tokenAddress);
        }
        java.lang.String str3 = tokenAddress;
        InvestUniv3FarmRedeemViewModel investUniv3FarmRedeemViewModelAhwBna = AhwBna();
        java.lang.String str4 = this.AkhnZx;
        long j = this.djBIcL;
        long j2 = this.valueOf;
        java.lang.String str5 = this.isConnected;
        boolean z = this.AYXKKw;
        java.util.ArrayList<InvestInputData> arrayList2 = this.AhwBna;
        investUniv3FarmRedeemViewModelAhwBna.KWHzl(str, str4, j, j2, str5, z, arrayList2 != null ? (InvestInputData) CollectionsKt___CollectionsKt.AkhnZx(arrayList2, 0) : null);
        AhwBna().copydefault(str, this.djBIcL, str2, str3, this.isConnected, this.AYXKKw);
    }

    private final void values() {
        C23730iHe c23730iHe = this.AEQbTJ;
        C23730iHe c23730iHe2 = null;
        if (c23730iHe == null) {
            Intrinsics.gEmmrt("");
            c23730iHe = null;
        }
        c23730iHe.KWHzl.getTitle().setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.FhERFw));
        C23730iHe c23730iHe3 = this.AEQbTJ;
        if (c23730iHe3 == null) {
            Intrinsics.gEmmrt("");
            c23730iHe3 = null;
        }
        c23730iHe3.gEmmrt.setRetryClick(new Function0() { // from class: o.jjH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC26830jji.AYXKKw(this.AEQbTJ);
            }
        });
        C23730iHe c23730iHe4 = this.AEQbTJ;
        if (c23730iHe4 == null) {
            Intrinsics.gEmmrt("");
            c23730iHe4 = null;
        }
        c23730iHe4.fJNWhG.EZpvd(true, true);
        C23730iHe c23730iHe5 = this.AEQbTJ;
        if (c23730iHe5 == null) {
            Intrinsics.gEmmrt("");
            c23730iHe5 = null;
        }
        c23730iHe5.fJNWhG.setProcessClickListener(new View.OnClickListener() { // from class: o.jjJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC26830jji.AEQbTJ(this.EZpvd, view);
            }
        });
        C23730iHe c23730iHe6 = this.AEQbTJ;
        if (c23730iHe6 == null) {
            Intrinsics.gEmmrt("");
            c23730iHe6 = null;
        }
        c23730iHe6.AuCTel.AEQbTJ(true);
        C23730iHe c23730iHe7 = this.AEQbTJ;
        if (c23730iHe7 == null) {
            Intrinsics.gEmmrt("");
            c23730iHe7 = null;
        }
        c23730iHe7.AuCTel.setSlippageClickListener(new Function0() { // from class: o.jjF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC26830jji.valueOf(this.EZpvd);
            }
        });
        C23730iHe c23730iHe8 = this.AEQbTJ;
        if (c23730iHe8 == null) {
            Intrinsics.gEmmrt("");
            c23730iHe8 = null;
        }
        C27265jrt c27265jrt = c23730iHe8.fetchVPNInfo;
        java.lang.String string = getString(C25493ixk.FragmentManager.invokespecialatDTRm);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c27265jrt.setTitle(string);
        C23730iHe c23730iHe9 = this.AEQbTJ;
        if (c23730iHe9 == null) {
            Intrinsics.gEmmrt("");
            c23730iHe9 = null;
        }
        c23730iHe9.fetchVPNInfo.setAssetClickListener(new View.OnClickListener() { // from class: o.jjI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC26830jji.OLrzqt(this.AEQbTJ, view);
            }
        });
        C23730iHe c23730iHe10 = this.AEQbTJ;
        if (c23730iHe10 == null) {
            Intrinsics.gEmmrt("");
            c23730iHe10 = null;
        }
        C27220jrA c27220jrA = c23730iHe10.ejfBZ;
        java.lang.String string2 = getString(C25493ixk.FragmentManager.sRzUNh);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c27220jrA.setTitle(string2);
        C23730iHe c23730iHe11 = this.AEQbTJ;
        if (c23730iHe11 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23730iHe2 = c23730iHe11;
        }
        c23730iHe2.djBIcL.setOnCTAButtonClick(new Function0() { // from class: o.jjp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC26830jji.djBIcL(this.copydefault);
            }
        });
        djBIcL();
    }

    public static final Unit AYXKKw(ActivityC26830jji activityC26830jji) {
        activityC26830jji.OLrzqt(activityC26830jji.fJNWhG, activityC26830jji.AkhnZx);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(ActivityC26830jji activityC26830jji, android.view.View view) {
        C24085iUi.Companion.KWHzl(5).show(activityC26830jji.getSupportFragmentManager(), "javaClass");
    }

    public static final Unit valueOf(ActivityC26830jji activityC26830jji) {
        C23978iQj.Companion.AEQbTJ(5).show(activityC26830jji.getSupportFragmentManager(), "javaClass");
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(ActivityC26830jji activityC26830jji, android.view.View view) {
        C24105iVb.Companion.KWHzl(5).show(activityC26830jji.getSupportFragmentManager(), "javaClass");
    }

    public static final Unit djBIcL(ActivityC26830jji activityC26830jji) {
        activityC26830jji.DbNXlk();
        return Unit.INSTANCE;
    }

    private final void valueOf() {
        AhwBna().AuCTel().observe(this, new ActionBar(new Function1() { // from class: o.jjm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26830jji.OLrzqt(this.KWHzl, (C23955iPn) obj);
            }
        }));
        AhwBna().values().observe(this, new Observer() { // from class: o.jjo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                ActivityC26830jji.OLrzqt((ResponseState) obj);
            }
        });
        AhwBna().AhwBna().observe(this, new ActionBar(new Function1() { // from class: o.jju
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26830jji.OLrzqt(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        AhwBna().valueOf().observe(this, new ActionBar(new Function1() { // from class: o.jjq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26830jji.KWHzl(this.OLrzqt, (C23958iPq) obj);
            }
        }));
        AhwBna().uzCIH().observe(this, new ActionBar(new Function1() { // from class: o.jjr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26830jji.AEQbTJ(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        AhwBna().fJNWhG().observe(this, new ActionBar(new Function1() { // from class: o.jjt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26830jji.copydefault(this.copydefault, (C23959iPr) obj);
            }
        }));
        AhwBna().getNewProxyInstance().observe(this, new ActionBar(new Function1() { // from class: o.jjs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26830jji.AEQbTJ(this.OLrzqt, (C23960iPs) obj);
            }
        }));
        AhwBna().DbNXlk().observe(this, new ActionBar(new Function1() { // from class: o.jjw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26830jji.OLrzqt(this.OLrzqt, (InvestRedeemReceiveInfoUIBean) obj);
            }
        }));
        AhwBna().copydefault().observe(this, new ActionBar(new Function1() { // from class: o.jjx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26830jji.KWHzl(this.copydefault, (InvestConsumeData) obj);
            }
        }));
        AhwBna().iwGUEr().observe(this, new ActionBar(new Function1() { // from class: o.jjv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26830jji.OLrzqt(this.KWHzl, (C23953iPl) obj);
            }
        }));
        C27589jxz.collectOnLifecycle$default(this, AhwBna().AEQbTJ(), null, new StateListAnimator(), 2, null);
        C27589jxz.collectOnLifecycle$default(this, AhwBna().ejfBZ(), null, new Activity(), 2, null);
    }

    public static final Unit OLrzqt(ActivityC26830jji activityC26830jji, C23955iPn c23955iPn) {
        C23730iHe c23730iHe = activityC26830jji.AEQbTJ;
        C23730iHe c23730iHe2 = null;
        if (c23730iHe == null) {
            Intrinsics.gEmmrt("");
            c23730iHe = null;
        }
        c23730iHe.DbNXlk.KWHzl(InvestUniv3CurrentPriceViewMode.V2);
        C23730iHe c23730iHe3 = activityC26830jji.AEQbTJ;
        if (c23730iHe3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23730iHe2 = c23730iHe3;
        }
        c23730iHe2.DbNXlk.setData(C23955iPn.copy$default(c23955iPn, null, null, null, false, false, 0, 31, null));
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(ResponseState responseState) {
        if (responseState.getErrorType() == ResponseStateType.NET_ERRO) {
            C57604ylZ.show$default(C57604ylZ.OLrzqt, C33070mpX.AYXKKw(C25493ixk.FragmentManager.zSsVtY), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            return;
        }
        if (responseState.getErrorType() == ResponseStateType.SERVER_ERRRO) {
            java.lang.String errorMsg = responseState.getErrorMsg();
            if (errorMsg == null || errorMsg.length() == 0) {
                C57604ylZ.show$default(C57604ylZ.OLrzqt, C33070mpX.AYXKKw(C25493ixk.FragmentManager.DIIpTV), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            } else {
                C57604ylZ.show$default(C57604ylZ.OLrzqt, responseState.getErrorMsg(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            }
        }
    }

    public static final Unit OLrzqt(ActivityC26830jji activityC26830jji, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            activityC26830jji.showLoading();
        } else {
            activityC26830jji.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC26830jji activityC26830jji, C23958iPq c23958iPq) {
        C23730iHe c23730iHe = null;
        if (c23958iPq.KWHzl()) {
            C23730iHe c23730iHe2 = activityC26830jji.AEQbTJ;
            if (c23730iHe2 == null) {
                Intrinsics.gEmmrt("");
                c23730iHe2 = null;
            }
            c23730iHe2.gEmmrt.setVisibility(8);
            C23730iHe c23730iHe3 = activityC26830jji.AEQbTJ;
            if (c23730iHe3 == null) {
                Intrinsics.gEmmrt("");
                c23730iHe3 = null;
            }
            C27207jqo c27207jqo = c23730iHe3.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c27207jqo, "");
            C57600ylV.AEQbTJ(c27207jqo);
            C23730iHe c23730iHe4 = activityC26830jji.AEQbTJ;
            if (c23730iHe4 == null) {
                Intrinsics.gEmmrt("");
                c23730iHe4 = null;
            }
            c23730iHe4.copydefault.setVisibility(0);
            activityC26830jji.gEmmrt();
            rVN.reportFullyDrawn$default((android.app.Activity) activityC26830jji, true, (java.lang.String) null, 2, (java.lang.Object) null);
        } else {
            C23730iHe c23730iHe5 = activityC26830jji.AEQbTJ;
            if (c23730iHe5 == null) {
                Intrinsics.gEmmrt("");
                c23730iHe5 = null;
            }
            c23730iHe5.copydefault.setVisibility(8);
            C23730iHe c23730iHe6 = activityC26830jji.AEQbTJ;
            if (c23730iHe6 == null) {
                Intrinsics.gEmmrt("");
                c23730iHe6 = null;
            }
            c23730iHe6.gEmmrt.setVisibility(0);
            C23730iHe c23730iHe7 = activityC26830jji.AEQbTJ;
            if (c23730iHe7 == null) {
                Intrinsics.gEmmrt("");
                c23730iHe7 = null;
            }
            C27207jqo c27207jqo2 = c23730iHe7.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c27207jqo2, "");
            C57600ylV.AEQbTJ(c27207jqo2);
            rVN.reportFullyDrawn$default((android.app.Activity) activityC26830jji, false, (java.lang.String) null, 2, (java.lang.Object) null);
            if (c23958iPq.AEQbTJ()) {
                C23730iHe c23730iHe8 = activityC26830jji.AEQbTJ;
                if (c23730iHe8 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c23730iHe = c23730iHe8;
                }
                c23730iHe.gEmmrt.setSubTitleShow(true);
            } else {
                C23730iHe c23730iHe9 = activityC26830jji.AEQbTJ;
                if (c23730iHe9 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c23730iHe = c23730iHe9;
                }
                c23730iHe.gEmmrt.setSubTitleShow(false);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ActivityC26830jji activityC26830jji, java.lang.Boolean bool) {
        Intrinsics.copydefault(bool);
        activityC26830jji.AEQbTJ(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC26830jji activityC26830jji, C23959iPr c23959iPr) {
        java.lang.Boolean value = activityC26830jji.AhwBna().uzCIH().getValue();
        if (value != null) {
            activityC26830jji.AEQbTJ(value.booleanValue());
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ActivityC26830jji activityC26830jji, C23960iPs c23960iPs) {
        kotlin.Pair pair;
        java.util.List<InvestTokenWithAmount> listAhwBna = c23960iPs.AhwBna();
        C23730iHe c23730iHe = null;
        if (listAhwBna != null) {
            C23730iHe c23730iHe2 = activityC26830jji.AEQbTJ;
            if (c23730iHe2 == null) {
                Intrinsics.gEmmrt("");
                c23730iHe2 = null;
            }
            c23730iHe2.ejfBZ.setData(listAhwBna.isEmpty() ^ true ? listAhwBna.get(0) : new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null), listAhwBna.size() > 1 ? listAhwBna.get(1) : new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null), c23960iPs.AYXKKw(), c23960iPs.gEmmrt());
        }
        C23730iHe c23730iHe3 = activityC26830jji.AEQbTJ;
        if (c23730iHe3 == null) {
            Intrinsics.gEmmrt("");
            c23730iHe3 = null;
        }
        c23730iHe3.fetchVPNInfo.setData(c23960iPs.valueOf(), c23960iPs.djBIcL(), c23960iPs.AYXKKw(), c23960iPs.gEmmrt());
        java.util.List<InvestTokenWithAmount> listKWHzl = c23960iPs.KWHzl();
        if (listKWHzl != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
            for (InvestTokenWithAmount investTokenWithAmount : listKWHzl) {
                if (investTokenWithAmount.getTokenSymbol().length() == 0 && investTokenWithAmount.getCoinAmount().length() == 0 && investTokenWithAmount.getTokenId().length() > 0) {
                    pair = new kotlin.Pair(investTokenWithAmount.getTokenId(), C33070mpX.AYXKKw(C25493ixk.FragmentManager.dUDNAs));
                } else {
                    investTokenWithAmount.getTokenSymbol();
                    pair = new kotlin.Pair(C27492jwH.limitFmtNoZeroWithKMB$default(C27492jwH.OLrzqt, investTokenWithAmount.getCoinAmount(), 6, 2, false, false, 24, null), investTokenWithAmount.getTokenSymbol());
                }
                arrayList.add(new C27522jwl((java.lang.String) pair.getSecond(), (java.lang.String) pair.getFirst(), C27492jwH.OLrzqt.KWHzl(investTokenWithAmount.getCurrencyAmount()), investTokenWithAmount.getTokenLogo()));
            }
            if (!arrayList.isEmpty()) {
                C23730iHe c23730iHe4 = activityC26830jji.AEQbTJ;
                if (c23730iHe4 == null) {
                    Intrinsics.gEmmrt("");
                    c23730iHe4 = null;
                }
                c23730iHe4.EZpvd.setTokens(arrayList);
                if (arrayList.size() == 1) {
                    C23730iHe c23730iHe5 = activityC26830jji.AEQbTJ;
                    if (c23730iHe5 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        c23730iHe = c23730iHe5;
                    }
                    c23730iHe.EZpvd.OLrzqt();
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC26830jji activityC26830jji, InvestRedeemReceiveInfoUIBean investRedeemReceiveInfoUIBean) {
        java.util.List<InvestTokenWithAmount> receiveTokenList;
        boolean zIsInit = investRedeemReceiveInfoUIBean.isInit();
        java.lang.String platformLogo = investRedeemReceiveInfoUIBean.getPlatformLogo();
        java.lang.String platformName = investRedeemReceiveInfoUIBean.getPlatformName();
        InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfoGEmmrt = activityC26830jji.AhwBna().gEmmrt();
        java.util.List<InvestTokenWithAmount> receiveTokenList2 = investUniv3RedeemReceiveInfoGEmmrt != null ? investUniv3RedeemReceiveInfoGEmmrt.getReceiveTokenList() : null;
        InvestUniv3RedeemInitialInfo investUniv3RedeemInitialInfoAYXKKw = activityC26830jji.AhwBna().AYXKKw();
        InvestSubscriptionReceiveInfoUIBean investSubscriptionReceiveInfoUIBean = new InvestSubscriptionReceiveInfoUIBean(zIsInit, platformLogo, platformName, receiveTokenList2, (java.util.List) null, (investUniv3RedeemInitialInfoAYXKKw == null || (receiveTokenList = investUniv3RedeemInitialInfoAYXKKw.getReceiveTokenList()) == null) ? null : (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(receiveTokenList), investRedeemReceiveInfoUIBean.isDataErro(), investRedeemReceiveInfoUIBean.getRedeemTips(), investRedeemReceiveInfoUIBean.getExchangeBean(), (java.lang.String) null, (java.lang.String) null, investRedeemReceiveInfoUIBean.getInvestmentCategory(), 1536, (DefaultConstructorMarker) null);
        C23730iHe c23730iHe = activityC26830jji.AEQbTJ;
        if (c23730iHe == null) {
            Intrinsics.gEmmrt("");
            c23730iHe = null;
        }
        c23730iHe.fJNWhG.setData(investSubscriptionReceiveInfoUIBean);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC26830jji activityC26830jji, InvestConsumeData investConsumeData) {
        if (!((java.lang.Boolean) investConsumeData.getData()).booleanValue()) {
            C23730iHe c23730iHe = activityC26830jji.AEQbTJ;
            if (c23730iHe == null) {
                Intrinsics.gEmmrt("");
                c23730iHe = null;
            }
            c23730iHe.AuCTel.setSlippageText(activityC26830jji.AhwBna().isConnected());
            InvestUniv3FarmRedeemViewModel.getReceiveInfoAndCheckState$default(activityC26830jji.AhwBna(), null, 1, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC26830jji activityC26830jji, C23953iPl c23953iPl) {
        C23730iHe c23730iHe = activityC26830jji.AEQbTJ;
        if (c23730iHe == null) {
            Intrinsics.gEmmrt("");
            c23730iHe = null;
        }
        c23730iHe.AuCTel.AEQbTJ(c23953iPl.AYXKKw(), c23953iPl.AhwBna(), c23953iPl.AEQbTJ(), c23953iPl.OLrzqt(), c23953iPl.EZpvd(), java.lang.Boolean.TRUE, (512 & 64) != 0 ? 0 : c23953iPl.copydefault(), (512 & 128) != 0 ? "" : c23953iPl.KWHzl(), (512 & 256) != 0 ? false : c23953iPl.valueOf(), (512 & 512) != 0 ? null : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.jji$StateListAnimator */
    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC24173iXp interfaceC24173iXp, Continuation<? super Unit> continuation) {
            C23730iHe c23730iHe = ActivityC26830jji.this.AEQbTJ;
            if (c23730iHe == null) {
                Intrinsics.gEmmrt("");
                c23730iHe = null;
            }
            c23730iHe.djBIcL.setButtonState(interfaceC24173iXp);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.jji$Activity */
    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(iXD ixd, Continuation<? super Unit> continuation) {
            ActivityC26830jji.this.copydefault(ixd);
            return Unit.INSTANCE;
        }
    }

    private final void isConnected() {
        AhwBna().getFieldNames();
    }

    private final void DbNXlk() {
        C23730iHe c23730iHe = this.AEQbTJ;
        if (c23730iHe == null) {
            Intrinsics.gEmmrt("");
            c23730iHe = null;
        }
        c23730iHe.djBIcL.AEQbTJ();
        AhwBna().OLrzqt(new Function0() { // from class: o.jjl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC26830jji.AhwBna(this.AEQbTJ);
            }
        });
    }

    public static final Unit AhwBna(ActivityC26830jji activityC26830jji) {
        activityC26830jji.AhwBna().zsXlph();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(final iXD ixd) {
        java.lang.Throwable thOLrzqt;
        if (ixd instanceof iXD.ActionBar) {
            C27508jwX.startContractInteraction$default(C27508jwX.AEQbTJ, this, ((iXD.ActionBar) ixd).EZpvd(), new Function1() { // from class: o.jjy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC26830jji.copydefault(this.AEQbTJ, ixd, (android.os.Bundle) obj);
                }
            }, new Function1() { // from class: o.jjE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC26830jji.AEQbTJ(ixd, (NewCallbackBean) obj);
                }
            }, null, 8, null);
            return;
        }
        if (!(ixd instanceof iXD.TaskDescription) || (thOLrzqt = ((iXD.TaskDescription) ixd).OLrzqt()) == null) {
            return;
        }
        java.lang.String message = thOLrzqt.getMessage();
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) message)) {
            message = null;
        }
        if (message == null) {
            message = C43422row.OLrzqt();
        }
        C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
    }

    public static final Unit copydefault(ActivityC26830jji activityC26830jji, iXD ixd, android.os.Bundle bundle) {
        activityC26830jji.EZpvd(bundle, ((iXD.ActionBar) ixd).copydefault().getOrderType());
        return Unit.INSTANCE;
    }

    public static final AbstractC58185ywX AEQbTJ(iXD ixd, NewCallbackBean newCallbackBean) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        iXD.ActionBar actionBar = (iXD.ActionBar) ixd;
        return actionBar.OLrzqt().invoke(newCallbackBean, actionBar.copydefault());
    }

    private final void EZpvd(android.os.Bundle bundle, int i) {
        C23730iHe c23730iHe = null;
        if (bundle == null || bundle.getInt("result") != -1) {
            C23730iHe c23730iHe2 = this.AEQbTJ;
            if (c23730iHe2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23730iHe = c23730iHe2;
            }
            c23730iHe.djBIcL.copydefault();
            return;
        }
        if (!InvestTradeManager.OLrzqt.AEQbTJ(i)) {
            C23730iHe c23730iHe3 = this.AEQbTJ;
            if (c23730iHe3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23730iHe = c23730iHe3;
            }
            c23730iHe.djBIcL.copydefault();
            copydefault(bundle, AhwBna().fIwbmz());
            return;
        }
        C23730iHe c23730iHe4 = this.AEQbTJ;
        if (c23730iHe4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23730iHe = c23730iHe4;
        }
        c23730iHe.djBIcL.AEQbTJ();
        AhwBna().EZpvd(bundle);
    }

    private final void copydefault(android.os.Bundle bundle, InvestTradeManager.TransactionResultExtraData transactionResultExtraData) {
        C27508jwX.toTransactionResultPage$default(C27508jwX.AEQbTJ, this, bundle, transactionResultExtraData, 0, null, null, 28, null);
        finish();
    }

    @Override // o.AbstractActivityC26832jjk, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        AhwBna().AuCTelauCTel();
    }

    @Override // o.AbstractActivityC26832jjk, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        AhwBna().hDKMBd();
    }

    public final void djBIcL() {
        C23730iHe c23730iHe = this.AEQbTJ;
        if (c23730iHe == null) {
            Intrinsics.gEmmrt("");
            c23730iHe = null;
        }
        c23730iHe.OLrzqt.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: o.jjn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(android.view.View view, int i, int i2, int i3, int i4) {
                ActivityC26830jji.copydefault(this.EZpvd, view, i, i2, i3, i4);
            }
        });
    }

    public static final void copydefault(ActivityC26830jji activityC26830jji, android.view.View view, int i, int i2, int i3, int i4) {
        C23730iHe c23730iHe = activityC26830jji.AEQbTJ;
        if (c23730iHe == null) {
            Intrinsics.gEmmrt("");
            c23730iHe = null;
        }
        android.view.View viewFindViewById = c23730iHe.getRoot().findViewById(C25493ixk.ActionBar.QSusPL);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(i2 > 0 ? 0 : 8);
        }
    }

    public final void gEmmrt() {
        C23730iHe c23730iHe = this.AEQbTJ;
        if (c23730iHe == null) {
            Intrinsics.gEmmrt("");
            c23730iHe = null;
        }
        c23730iHe.values.setText(getString(C25493ixk.FragmentManager.fERRXa));
    }

    public final void AEQbTJ(boolean z) {
        C23730iHe c23730iHe = this.AEQbTJ;
        if (c23730iHe == null) {
            Intrinsics.gEmmrt("");
            c23730iHe = null;
        }
        c23730iHe.AhwBna.removeAllViews();
        C23959iPr value = AhwBna().fJNWhG().getValue();
        if (value == null) {
            return;
        }
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(this);
        C23730iHe c23730iHe2 = this.AEQbTJ;
        if (c23730iHe2 == null) {
            Intrinsics.gEmmrt("");
            c23730iHe2 = null;
        }
        C23910iNw c23910iNwOLrzqt = C23910iNw.OLrzqt(layoutInflaterFrom, c23730iHe2.AhwBna, true);
        c23910iNwOLrzqt.getRoot().setPadding(C33052mpF.dp2px$default(24.0f, null, 1, null), 0, C33052mpF.dp2px$default(24.0f, null, 1, null), 0);
        android.widget.TextView textView = c23910iNwOLrzqt.EZpvd;
        java.lang.String strEZpvd = value.EZpvd();
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        textView.setText(strEZpvd);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) value.AEQbTJ()) && C33129mqd.OLrzqt((java.lang.CharSequence) value.djBIcL())) {
            android.widget.TextView textView2 = c23910iNwOLrzqt.OLrzqt;
            int i = C25493ixk.FragmentManager.invokespecialhOMIpD;
            C27492jwH c27492jwH = C27492jwH.OLrzqt;
            textView2.setText(C33069mpW.KWHzl(this, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("num1", c27492jwH.valueOf(value.AEQbTJ())), C56390yDp.OLrzqt("num2", c27492jwH.valueOf(value.djBIcL())), C56390yDp.OLrzqt("token1", value.copydefault()), C56390yDp.OLrzqt("token2", value.KWHzl()))));
        } else {
            c23910iNwOLrzqt.OLrzqt.setText("");
        }
        if (z) {
            c23910iNwOLrzqt.copydefault.setText(getString(C25493ixk.FragmentManager.RihMUf));
            c23910iNwOLrzqt.copydefault.setOKDSStyle(7);
        } else {
            c23910iNwOLrzqt.copydefault.setText(getString(C25493ixk.FragmentManager.resume));
            c23910iNwOLrzqt.copydefault.setOKDSStyle(11);
        }
        c23910iNwOLrzqt.copydefault.setOKDSPill(-2);
        c23910iNwOLrzqt.copydefault.setTagPaint(1);
    }

    @Override // o.AbstractActivityC26832jjk, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC26832jjk, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
