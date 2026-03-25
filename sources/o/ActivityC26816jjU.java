package o;

import android.view.View;
import androidx.lifecycle.Observer;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfoUIBean;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribePromptInformation;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.business.invest_biz.data.logic.ResponseState;
import com.okinc.business.invest_biz.data.logic.ResponseStateType;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestInputData;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestTransactionModel;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3FarmSubscribeViewModel;
import com.okinc.business.invest_biz.ui.widget.InvestUniv3CurrentPriceViewMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C25493ixk;
import o.iXD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jjU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class ActivityC26816jjU extends AbstractActivityC26829jjh<InvestUniv3FarmSubscribeViewModel> {
    public iKL AkhnZx;
    public long DbNXlk;
    public boolean ejfBZ;
    public TransactionConfig fARcdN;
    public long fIwbmz;
    public iKE fetchVPNInfo;
    public iKK isConnected;
    public java.util.ArrayList<InvestInputData> values;
    public java.lang.String getNewProxyInstance = "";
    public java.lang.String fJNWhG = "";
    public java.lang.String AuCTel = "";

    /* JADX INFO: renamed from: o.jjU$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC24051iTb
    public java.lang.Class<InvestUniv3FarmSubscribeViewModel> AkhnZx() {
        return InvestUniv3FarmSubscribeViewModel.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC23612iCv
    public long EZpvd() {
        return this.fIwbmz;
    }

    @Override // o.AbstractActivityC24051iTb
    public boolean djBIcL() {
        return true;
    }

    @Override // o.AbstractActivityC24051iTb
    public int values() {
        return 4;
    }

    @Override // o.AbstractActivityC24051iTb
    public void OLrzqt(android.os.Bundle bundle) {
        android.content.Intent intent = getIntent();
        if (intent != null) {
            TransactionConfig transactionConfig = (TransactionConfig) intent.getParcelableExtra("key.trx_config");
            this.fARcdN = transactionConfig;
            if (transactionConfig != null) {
                this.fIwbmz = transactionConfig.isConnected();
                this.values = transactionConfig.valueOf();
                this.DbNXlk = transactionConfig.copydefault();
                this.ejfBZ = transactionConfig.AwvSrB();
                this.AuCTel = transactionConfig.ejfBZ();
            }
        }
        this.AkhnZx = iKL.OLrzqt(android.view.LayoutInflater.from(this), AYXKKw().fetchVPNInfo);
        AYXKKw().fetchVPNInfo.setVisibility(8);
        this.isConnected = iKK.AEQbTJ(android.view.LayoutInflater.from(this), AYXKKw().gEmmrt);
        this.fetchVPNInfo = iKE.EZpvd(android.view.LayoutInflater.from(this), AYXKKw().AhwBna);
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = ((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).gEmmrt().KWHzl();
        final Function1 function1 = new Function1() { // from class: o.jkh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26816jjU.OLrzqt(this.EZpvd, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.jke
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC26816jjU.KWHzl(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.jkf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26816jjU.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.jkk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC26816jjU.EZpvd(function12, obj);
            }
        });
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(ActivityC26816jjU activityC26816jjU, InterfaceC9738bbJ interfaceC9738bbJ) {
        if (interfaceC9738bbJ.zsXlph() || !interfaceC9738bbJ.UeEOUB()) {
            activityC26816jjU.OLrzqt(interfaceC9738bbJ.DbNXlk(), interfaceC9738bbJ.EZpvd(activityC26816jjU.DbNXlk));
        } else {
            activityC26816jjU.OLrzqt(interfaceC9738bbJ.DbNXlk(), interfaceC9738bbJ.EZpvd(activityC26816jjU.DbNXlk));
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.String tokenAddress = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.getNewProxyInstance = str;
        this.fJNWhG = str2;
        AYXKKw().copydefault.setVisibility(8);
        AYXKKw().OLrzqt.setVisibility(0);
        C27207jqo c27207jqo = AYXKKw().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c27207jqo, "");
        C27301jsc.copydefault(c27207jqo);
        AYXKKw().valueOf.setVisibility(8);
        if (C33129mqd.KWHzl((java.util.Collection) this.values)) {
            java.util.ArrayList<InvestInputData> arrayList = this.values;
            Intrinsics.copydefault(arrayList);
            tokenAddress = arrayList.get(0).getTokenAddress();
            Intrinsics.copydefault((java.lang.Object) tokenAddress);
        }
        java.lang.String str3 = tokenAddress;
        InvestUniv3FarmSubscribeViewModel investUniv3FarmSubscribeViewModel = (InvestUniv3FarmSubscribeViewModel) DbNXlk();
        java.lang.String str4 = this.fJNWhG;
        long j = this.fIwbmz;
        long j2 = this.DbNXlk;
        java.lang.String str5 = this.AuCTel;
        boolean z = this.ejfBZ;
        java.util.ArrayList<InvestInputData> arrayList2 = this.values;
        investUniv3FarmSubscribeViewModel.copydefault(str, str4, j, j2, str5, z, arrayList2 != null ? (InvestInputData) CollectionsKt___CollectionsKt.AkhnZx(arrayList2, 0) : null);
        ((InvestUniv3FarmSubscribeViewModel) DbNXlk()).EZpvd(str, this.fIwbmz, str2, str3, this.AuCTel, this.ejfBZ);
    }

    @Override // o.AbstractActivityC24051iTb
    public void isConnected() {
        AYXKKw().AEQbTJ.getTitle().setText(getString(C25493ixk.FragmentManager.DUUtXg));
        iKK ikk = this.isConnected;
        iKK ikk2 = null;
        if (ikk == null) {
            Intrinsics.gEmmrt("");
            ikk = null;
        }
        ikk.AhwBna.EZpvd(false, true);
        iKK ikk3 = this.isConnected;
        if (ikk3 == null) {
            Intrinsics.gEmmrt("");
            ikk3 = null;
        }
        ikk3.AhwBna.setProcessClickListener(new View.OnClickListener() { // from class: o.jkl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC26816jjU.KWHzl(this.EZpvd, view);
            }
        });
        iKK ikk4 = this.isConnected;
        if (ikk4 == null) {
            Intrinsics.gEmmrt("");
            ikk4 = null;
        }
        C27265jrt c27265jrt = ikk4.gEmmrt;
        java.lang.String string = getString(C25493ixk.FragmentManager.invokespecialatDTRm);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c27265jrt.setTitle(string);
        iKK ikk5 = this.isConnected;
        if (ikk5 == null) {
            Intrinsics.gEmmrt("");
            ikk5 = null;
        }
        ikk5.gEmmrt.setAssetClickListener(new View.OnClickListener() { // from class: o.jkj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC26816jjU.EZpvd(this.copydefault, view);
            }
        });
        AYXKKw().values.djBIcL(true);
        iKE ike = this.fetchVPNInfo;
        if (ike == null) {
            Intrinsics.gEmmrt("");
            ike = null;
        }
        ike.copydefault.setOnCTAButtonClick(new Function0() { // from class: o.jkm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC26816jjU.EZpvd(this.EZpvd);
            }
        });
        iKK ikk6 = this.isConnected;
        if (ikk6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikk2 = ikk6;
        }
        ikk2.djBIcL.AEQbTJ(true);
    }

    public static final void KWHzl(ActivityC26816jjU activityC26816jjU, android.view.View view) {
        iUI.Companion.OLrzqt(4).show(activityC26816jjU.getSupportFragmentManager(), "javaClass");
    }

    public static final void EZpvd(ActivityC26816jjU activityC26816jjU, android.view.View view) {
        C24105iVb.Companion.KWHzl(4).show(activityC26816jjU.getSupportFragmentManager(), "javaClass");
    }

    public static final Unit EZpvd(ActivityC26816jjU activityC26816jjU) {
        activityC26816jjU.uzCIH();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v21, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v24, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v27, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v30, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v32, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC24051iTb
    public void AhwBna() {
        ((InvestUniv3FarmSubscribeViewModel) DbNXlk()).fIwbmz().observe(this, new Activity(new Function1() { // from class: o.jkp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26816jjU.AEQbTJ(this.EZpvd, (C23955iPn) obj);
            }
        }));
        ((InvestUniv3FarmSubscribeViewModel) DbNXlk()).QOLQEE().observe(this, new Observer() { // from class: o.jks
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                ActivityC26816jjU.EZpvd((ResponseState) obj);
            }
        });
        ((InvestUniv3FarmSubscribeViewModel) DbNXlk()).gHZMYf().observe(this, new Activity(new Function1() { // from class: o.jkr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26816jjU.OLrzqt(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        ((InvestUniv3FarmSubscribeViewModel) DbNXlk()).QfsBiF().observe(this, new Activity(new Function1() { // from class: o.jkq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26816jjU.EZpvd(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        ((InvestUniv3FarmSubscribeViewModel) DbNXlk()).gEmmrt().observe(this, new Activity(new Function1() { // from class: o.jkc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26816jjU.AEQbTJ(this.AEQbTJ, (C23958iPq) obj);
            }
        }));
        ((InvestUniv3FarmSubscribeViewModel) DbNXlk()).fJNWhG().observe(this, new Activity(new Function1() { // from class: o.jkb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26816jjU.KWHzl(this.OLrzqt, (C23959iPr) obj);
            }
        }));
        ((InvestUniv3FarmSubscribeViewModel) DbNXlk()).ejfBZ().observe(this, new Activity(new Function1() { // from class: o.jkd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26816jjU.gEmmrt(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        ((InvestUniv3FarmSubscribeViewModel) DbNXlk()).DbNXlk().observe(this, new Activity(new Function1() { // from class: o.jka
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26816jjU.copydefault(this.KWHzl, (InvestUniv3SubscribePromptInformation) obj);
            }
        }));
        ((InvestUniv3FarmSubscribeViewModel) DbNXlk()).getNewProxyInstance().observe(this, new Activity(new Function1() { // from class: o.jki
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26816jjU.KWHzl(this.AEQbTJ, (C23960iPs) obj);
            }
        }));
        ((InvestUniv3FarmSubscribeViewModel) DbNXlk()).AkhnZx().observe(this, new Activity(new Function1() { // from class: o.jkg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26816jjU.AEQbTJ(this.KWHzl, (InvestSubscriptionReceiveInfoUIBean) obj);
            }
        }));
        C27589jxz.collectOnLifecycle$default(this, ((InvestUniv3FarmSubscribeViewModel) DbNXlk()).AEQbTJ(), null, new TaskDescription(), 2, null);
        C27589jxz.collectOnLifecycle$default(this, ((InvestUniv3FarmSubscribeViewModel) DbNXlk()).values(), null, new StateListAnimator(), 2, null);
    }

    public static final Unit AEQbTJ(ActivityC26816jjU activityC26816jjU, C23955iPn c23955iPn) {
        iKK ikk = activityC26816jjU.isConnected;
        iKK ikk2 = null;
        if (ikk == null) {
            Intrinsics.gEmmrt("");
            ikk = null;
        }
        ikk.valueOf.KWHzl(InvestUniv3CurrentPriceViewMode.V2);
        iKK ikk3 = activityC26816jjU.isConnected;
        if (ikk3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikk2 = ikk3;
        }
        C27271jrz c27271jrz = ikk2.valueOf;
        Intrinsics.copydefault(c23955iPn);
        c27271jrz.setData(c23955iPn);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(ResponseState responseState) {
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

    public static final Unit OLrzqt(ActivityC26816jjU activityC26816jjU, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            activityC26816jjU.showLoading();
        } else {
            activityC26816jjU.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ActivityC26816jjU activityC26816jjU, java.lang.Boolean bool) {
        if (!bool.booleanValue()) {
            activityC26816jjU.AYXKKw().values.AEQbTJ();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ActivityC26816jjU activityC26816jjU, C23958iPq c23958iPq) {
        if (c23958iPq.KWHzl()) {
            activityC26816jjU.AYXKKw().copydefault.setVisibility(8);
            C27207jqo c27207jqo = activityC26816jjU.AYXKKw().OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c27207jqo, "");
            C57600ylV.AEQbTJ(c27207jqo);
            activityC26816jjU.AYXKKw().valueOf.setVisibility(0);
        } else {
            activityC26816jjU.AYXKKw().valueOf.setVisibility(8);
            activityC26816jjU.AYXKKw().copydefault.setVisibility(0);
            C27207jqo c27207jqo2 = activityC26816jjU.AYXKKw().OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c27207jqo2, "");
            C57600ylV.AEQbTJ(c27207jqo2);
            if (c23958iPq.AEQbTJ()) {
                activityC26816jjU.AYXKKw().copydefault.setSubTitleShow(true);
            } else {
                activityC26816jjU.AYXKKw().copydefault.setSubTitleShow(false);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(ActivityC26816jjU activityC26816jjU, C23959iPr c23959iPr) {
        java.lang.Boolean value = ((InvestUniv3FarmSubscribeViewModel) activityC26816jjU.DbNXlk()).ejfBZ().getValue();
        if (value != null) {
            activityC26816jjU.KWHzl(value.booleanValue());
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(ActivityC26816jjU activityC26816jjU, java.lang.Boolean bool) {
        Intrinsics.copydefault(bool);
        activityC26816jjU.KWHzl(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC26816jjU activityC26816jjU, InvestUniv3SubscribePromptInformation investUniv3SubscribePromptInformation) {
        InvestTipInfoVo positionNotInRangeTip;
        iKK ikk = activityC26816jjU.isConnected;
        iKK ikk2 = null;
        if (ikk == null) {
            Intrinsics.gEmmrt("");
            ikk = null;
        }
        android.widget.LinearLayout linearLayout = ikk.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility((investUniv3SubscribePromptInformation != null ? investUniv3SubscribePromptInformation.getPositionNotInRangeTip() : null) != null ? 0 : 8);
        if (investUniv3SubscribePromptInformation != null && (positionNotInRangeTip = investUniv3SubscribePromptInformation.getPositionNotInRangeTip()) != null) {
            C27569jxf c27569jxf = C27569jxf.OLrzqt;
            iKK ikk3 = activityC26816jjU.isConnected;
            if (ikk3 == null) {
                Intrinsics.gEmmrt("");
                ikk3 = null;
            }
            android.content.Context context = ikk3.OLrzqt.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iKK ikk4 = activityC26816jjU.isConnected;
            if (ikk4 == null) {
                Intrinsics.gEmmrt("");
                ikk4 = null;
            }
            android.widget.TextView textView = ikk4.EZpvd;
            iKK ikk5 = activityC26816jjU.isConnected;
            if (ikk5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                ikk2 = ikk5;
            }
            android.widget.LinearLayout linearLayout2 = ikk2.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            c27569jxf.AEQbTJ(context, textView, linearLayout2, positionNotInRangeTip, (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC26816jjU activityC26816jjU, C23960iPs c23960iPs) {
        kotlin.Pair pair;
        iKK ikk = activityC26816jjU.isConnected;
        iKK ikk2 = null;
        if (ikk == null) {
            Intrinsics.gEmmrt("");
            ikk = null;
        }
        ikk.gEmmrt.setData(c23960iPs.valueOf(), c23960iPs.djBIcL(), c23960iPs.AYXKKw(), c23960iPs.gEmmrt());
        java.util.List<InvestTokenWithAmount> listAEQbTJ = c23960iPs.AEQbTJ();
        if (listAEQbTJ != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            for (InvestTokenWithAmount investTokenWithAmount : listAEQbTJ) {
                if (investTokenWithAmount.getTokenSymbol().length() == 0 && investTokenWithAmount.getCoinAmount().length() == 0 && investTokenWithAmount.getTokenId().length() > 0) {
                    pair = new kotlin.Pair("NFT ID", investTokenWithAmount.getTokenId());
                } else {
                    pair = new kotlin.Pair(C27492jwH.limitFmtNoZeroWithKMB$default(C27492jwH.OLrzqt, investTokenWithAmount.getCoinAmount(), 6, 2, false, false, 24, null), investTokenWithAmount.getTokenSymbol());
                }
                arrayList.add(new C27522jwl((java.lang.String) pair.getSecond(), (java.lang.String) pair.getFirst(), C27492jwH.OLrzqt.KWHzl(investTokenWithAmount.getCurrencyAmount()), investTokenWithAmount.getTokenLogo()));
            }
            if (!arrayList.isEmpty()) {
                iKK ikk3 = activityC26816jjU.isConnected;
                if (ikk3 == null) {
                    Intrinsics.gEmmrt("");
                    ikk3 = null;
                }
                ikk3.DbNXlk.setTokens(arrayList);
                if (arrayList.size() == 1) {
                    iKK ikk4 = activityC26816jjU.isConnected;
                    if (ikk4 == null) {
                        Intrinsics.gEmmrt("");
                        ikk4 = null;
                    }
                    ikk4.DbNXlk.OLrzqt();
                }
            }
        }
        java.util.List<InvestTokenWithAmount> listEZpvd = c23960iPs.EZpvd();
        if (listEZpvd != null) {
            iKK ikk5 = activityC26816jjU.isConnected;
            if (ikk5 == null) {
                Intrinsics.gEmmrt("");
                ikk5 = null;
            }
            ikk5.AYXKKw.AEQbTJ(true);
            if (listEZpvd.isEmpty()) {
                iKK ikk6 = activityC26816jjU.isConnected;
                if (ikk6 == null) {
                    Intrinsics.gEmmrt("");
                    ikk6 = null;
                }
                C27138jpY.showNoData$default(ikk6.AYXKKw, false, 1, null);
            } else {
                iKK ikk7 = activityC26816jjU.isConnected;
                if (ikk7 == null) {
                    Intrinsics.gEmmrt("");
                    ikk7 = null;
                }
                C27138jpY.setData$default(ikk7.AYXKKw, listEZpvd, 3, false, false, null, 28, null);
                iKK ikk8 = activityC26816jjU.isConnected;
                if (ikk8 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    ikk2 = ikk8;
                }
                ikk2.AYXKKw.copydefault(listEZpvd, 3, c23960iPs.gEmmrt());
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ActivityC26816jjU activityC26816jjU, InvestSubscriptionReceiveInfoUIBean investSubscriptionReceiveInfoUIBean) {
        iKK ikk = activityC26816jjU.isConnected;
        if (ikk == null) {
            Intrinsics.gEmmrt("");
            ikk = null;
        }
        C27187jqU c27187jqU = ikk.AhwBna;
        Intrinsics.copydefault(investSubscriptionReceiveInfoUIBean);
        c27187jqU.setData(investSubscriptionReceiveInfoUIBean);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.jjU$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC24173iXp interfaceC24173iXp, Continuation<? super Unit> continuation) {
            iKE ike = ActivityC26816jjU.this.fetchVPNInfo;
            if (ike == null) {
                Intrinsics.gEmmrt("");
                ike = null;
            }
            ike.copydefault.setButtonState(interfaceC24173iXp);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.jjU$StateListAnimator */
    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(iXD ixd, Continuation<? super Unit> continuation) {
            ActivityC26816jjU.this.OLrzqt(ixd);
            return Unit.INSTANCE;
        }
    }

    private final void AEQbTJ(android.os.Bundle bundle, InvestTradeManager.TransactionResultExtraData transactionResultExtraData) {
        C27508jwX.toTransactionResultPage$default(C27508jwX.AEQbTJ, this, bundle, transactionResultExtraData, 0, null, null, 28, null);
        finish();
    }

    @Override // o.AbstractActivityC24051iTb
    public C27206jqn valueOf() {
        iKK ikk = this.isConnected;
        if (ikk == null) {
            Intrinsics.gEmmrt("");
            ikk = null;
        }
        C27206jqn c27206jqn = ikk.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c27206jqn, "");
        return c27206jqn;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void uzCIH() {
        ((InvestUniv3FarmSubscribeViewModel) DbNXlk()).EZpvd(new yHO() { // from class: o.jkn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return ActivityC26816jjU.copydefault(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue(), ((java.lang.Boolean) obj2).booleanValue(), ((java.lang.Boolean) obj3).booleanValue());
            }
        });
    }

    public static final Unit copydefault(ActivityC26816jjU activityC26816jjU, boolean z, boolean z2, boolean z3) {
        if (z) {
            activityC26816jjU.iwGUEr();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void iwGUEr() {
        iKE ike = this.fetchVPNInfo;
        if (ike == null) {
            Intrinsics.gEmmrt("");
            ike = null;
        }
        ike.copydefault.AEQbTJ();
        ((InvestUniv3FarmSubscribeViewModel) DbNXlk()).iwGUEr();
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3FarmSubscribeViewModel.getReceiveInfoAndCheckState$default(com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3FarmSubscribeViewModel, o.yHO, int, java.lang.Object):void */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC24051iTb
    public void copydefault(@NotNull InvestTransactionModel investTransactionModel) {
        java.lang.Integer pushToastCode;
        java.lang.Integer pushToastCode2;
        java.lang.Integer pushToastCode3;
        Intrinsics.checkNotNullParameter(investTransactionModel, "");
        android.os.Bundle bundleKWHzl = ((InvestUniv3FarmSubscribeViewModel) DbNXlk()).KWHzl();
        if (bundleKWHzl != null) {
            if ((C33129mqd.OLrzqt((java.lang.CharSequence) investTransactionModel.getTxHash()) && Intrinsics.EZpvd((java.lang.Object) investTransactionModel.getTxHash(), (java.lang.Object) bundleKWHzl.getString("tx_hash"))) || (C33129mqd.OLrzqt((java.lang.CharSequence) investTransactionModel.getUopHash()) && Intrinsics.EZpvd((java.lang.Object) investTransactionModel.getUopHash(), (java.lang.Object) bundleKWHzl.getString("tx_uop_hash")))) {
                java.lang.Integer pushToastCode4 = investTransactionModel.getPushToastCode();
                if ((pushToastCode4 != null && pushToastCode4.intValue() == 1) || (((pushToastCode = investTransactionModel.getPushToastCode()) != null && pushToastCode.intValue() == 5) || (((pushToastCode2 = investTransactionModel.getPushToastCode()) != null && pushToastCode2.intValue() == 23) || ((pushToastCode3 = investTransactionModel.getPushToastCode()) != null && pushToastCode3.intValue() == 24)))) {
                    InvestUniv3FarmSubscribeViewModel.getReceiveInfoAndCheckState$default((InvestUniv3FarmSubscribeViewModel) DbNXlk(), null, 1, null);
                }
            }
        }
    }

    @Override // o.AbstractActivityC24051iTb
    public void fetchVPNInfo() {
        super.fetchVPNInfo();
        OLrzqt(this.getNewProxyInstance, this.fJNWhG);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC24051iTb
    public void ejfBZ() {
        super.ejfBZ();
        ((InvestUniv3FarmSubscribeViewModel) DbNXlk()).QfsBiF().setValue(java.lang.Boolean.TRUE);
        if (Intrinsics.EZpvd(((InvestUniv3FarmSubscribeViewModel) DbNXlk()).AhwBna().getValue(), java.lang.Boolean.FALSE)) {
            InvestUniv3FarmSubscribeViewModel.getReceiveInfoAndCheckState$default((InvestUniv3FarmSubscribeViewModel) DbNXlk(), null, 1, null);
        } else {
            OLrzqt(this.getNewProxyInstance, this.fJNWhG);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void KWHzl(boolean z) {
        iKK ikk = this.isConnected;
        if (ikk == null) {
            Intrinsics.gEmmrt("");
            ikk = null;
        }
        ikk.copydefault.removeAllViews();
        C23959iPr value = ((InvestUniv3FarmSubscribeViewModel) DbNXlk()).fJNWhG().getValue();
        if (value == null) {
            return;
        }
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(this);
        iKK ikk2 = this.isConnected;
        if (ikk2 == null) {
            Intrinsics.gEmmrt("");
            ikk2 = null;
        }
        C23910iNw c23910iNwOLrzqt = C23910iNw.OLrzqt(layoutInflaterFrom, ikk2.copydefault, true);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(final iXD ixd) {
        java.lang.Throwable thOLrzqt;
        if (ixd instanceof iXD.ActionBar) {
            C27508jwX.startContractInteraction$default(C27508jwX.AEQbTJ, this, ((iXD.ActionBar) ixd).EZpvd(), new Function1() { // from class: o.jjX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC26816jjU.OLrzqt(this.copydefault, ixd, (android.os.Bundle) obj);
                }
            }, new Function1() { // from class: o.jjZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC26816jjU.EZpvd(ixd, (NewCallbackBean) obj);
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

    public static final Unit OLrzqt(ActivityC26816jjU activityC26816jjU, iXD ixd, android.os.Bundle bundle) {
        activityC26816jjU.AEQbTJ(bundle, ((iXD.ActionBar) ixd).copydefault().getOrderType());
        return Unit.INSTANCE;
    }

    public static final AbstractC58185ywX EZpvd(iXD ixd, NewCallbackBean newCallbackBean) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        iXD.ActionBar actionBar = (iXD.ActionBar) ixd;
        return actionBar.OLrzqt().invoke(newCallbackBean, actionBar.copydefault());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v9, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AEQbTJ(android.os.Bundle bundle, int i) {
        iKE ike = null;
        if (bundle == null || bundle.getInt("result") != -1) {
            iKE ike2 = this.fetchVPNInfo;
            if (ike2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                ike = ike2;
            }
            ike.copydefault.copydefault();
            return;
        }
        if (InvestTradeManager.OLrzqt.AEQbTJ(i)) {
            iKE ike3 = this.fetchVPNInfo;
            if (ike3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                ike = ike3;
            }
            ike.copydefault.AEQbTJ();
            ((InvestUniv3FarmSubscribeViewModel) DbNXlk()).AEQbTJ(bundle);
            return;
        }
        iKE ike4 = this.fetchVPNInfo;
        if (ike4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ike = ike4;
        }
        ike.copydefault.copydefault();
        AEQbTJ(bundle, ((InvestUniv3FarmSubscribeViewModel) DbNXlk()).fetchVPNInfo());
    }

    @Override // o.AbstractActivityC26829jjh, o.AbstractActivityC24051iTb, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC26829jjh, o.AbstractActivityC24051iTb, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC26829jjh, o.AbstractActivityC24051iTb, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC26829jjh, o.AbstractActivityC24051iTb, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // o.AbstractActivityC26829jjh, o.AbstractActivityC24051iTb, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
