package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionInfo;
import com.okinc.business.invest_biz.data.bean.InvestValidatorListItems;
import com.okinc.business.invest_biz.data.bean.TransactionMethod;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestInputData;
import com.okinc.business.invest_biz.data.models.InvestType;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.core.widget.tipswindow.AnchorPopupWindow;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.Bitmap;
import o.C24111iVh;
import o.C25493ixk;
import o.C52761wXj;
import o.iQS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iQx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class ActivityC23992iQx extends iPU implements InterfaceC23612iCv {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public long AYXKKw;
    public java.lang.String AhwBna;
    public long AkhnZx;
    public int djBIcL;
    public InvestSubscriptionInfo fARcdN;
    public java.util.ArrayList<InvestInputData> gEmmrt;
    public iGZ isConnected;
    public long valueOf;
    public java.lang.String DbNXlk = "";
    public java.lang.String AuCTel = "";
    public java.lang.String values = "";
    public boolean fetchVPNInfo = true;
    public final InterfaceC56387yDm fJNWhG = C56392yDr.copydefault(new Function0() { // from class: o.iQE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC23992iQx.copydefault(this.KWHzl);
        }
    });

    /* JADX INFO: renamed from: o.iQx$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Possible override for method o.iPU.EZpvd()V */
    @Override // o.InterfaceC23612iCv
    public long EZpvd() {
        return this.AYXKKw;
    }

    /* JADX INFO: renamed from: o.iQx$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iQx.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.iQx$StateListAnimator */
    public static final class StateListAnimator implements ViewModelProvider.Factory {
        public StateListAnimator() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(java.lang.Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            return new C27073joM(ActivityC23992iQx.this.fetchVPNInfo);
        }
    }

    /* JADX DEBUG: Possible override for method o.iPU.djBIcL()V */
    public final C27073joM djBIcL() {
        return (C27073joM) this.fJNWhG.getValue();
    }

    public static final C27073joM copydefault(ActivityC23992iQx activityC23992iQx) {
        return (C27073joM) new ViewModelProvider(activityC23992iQx, activityC23992iQx.new StateListAnimator()).get(C27073joM.class);
    }

    @Override // o.iPU, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        C27137jpX c27137jpX;
        C27137jpX c27137jpX2;
        FragmentContainerView fragmentContainerView;
        C33537myN c33537myN;
        android.widget.TextView title;
        C33537myN c33537myN2;
        super.onCreate(bundle);
        iGZ igz = (iGZ) DataBindingUtil.setContentView(this, C25493ixk.Activity.djBIcL);
        this.isConnected = igz;
        if (igz != null && (c33537myN2 = igz.OLrzqt) != null) {
            C27569jxf.setTitleStyle$OKDeFi_invest_biz$default(C27569jxf.OLrzqt, c33537myN2, 0, 0, 3, null);
        }
        android.content.Intent intent = getIntent();
        if (intent != null) {
            this.AYXKKw = intent.getLongExtra("investment_id", 0L);
            this.fetchVPNInfo = intent.getBooleanExtra("is_single", true);
            this.gEmmrt = intent.getParcelableArrayListExtra("input_list");
            this.valueOf = intent.getLongExtra("chainId", 0L);
            this.AkhnZx = intent.getLongExtra("relatedInvestmentId", 0L);
            this.djBIcL = intent.getIntExtra("investmentCategory", 0);
            java.lang.String stringExtra = intent.getStringExtra("poolID");
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.values = stringExtra;
            java.lang.String stringExtra2 = intent.getStringExtra("source");
            this.DbNXlk = stringExtra2 != null ? stringExtra2 : "";
        }
        iGZ igz2 = this.isConnected;
        if (igz2 != null && (c33537myN = igz2.OLrzqt) != null && (title = c33537myN.getTitle()) != null) {
            title.setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.DUUtXg));
        }
        iGZ igz3 = this.isConnected;
        if (igz3 != null && (fragmentContainerView = igz3.KWHzl) != null) {
            fragmentContainerView.setVisibility(8);
        }
        iGZ igz4 = this.isConnected;
        if (igz4 != null && (c27137jpX2 = igz4.AEQbTJ) != null) {
            c27137jpX2.setTitle(C33070mpX.AYXKKw(C25493ixk.FragmentManager.iRxXKY));
            c27137jpX2.setSubTitle(C33070mpX.AYXKKw(C25493ixk.FragmentManager.AxsJAYsNCnLh));
            c27137jpX2.setButtonText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.AwvSrB));
        }
        iGZ igz5 = this.isConnected;
        if (igz5 != null && (c27137jpX = igz5.AEQbTJ) != null) {
            c27137jpX.setRetryClick(new Function0() { // from class: o.iQV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC23992iQx.KWHzl(this.OLrzqt);
                }
            });
        }
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = ((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).gEmmrt().KWHzl();
        final Function1 function1 = new Function1() { // from class: o.iQy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC23992iQx.copydefault(this.copydefault, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.iQA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC23992iQx.gEmmrt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.iQz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC23992iQx.AEQbTJ(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.iQG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC23992iQx.valueOf(function12, obj);
            }
        });
        fetchVPNInfo();
        DbNXlk();
    }

    public static final Unit KWHzl(ActivityC23992iQx activityC23992iQx) {
        java.lang.String str = activityC23992iQx.AuCTel;
        java.lang.String str2 = activityC23992iQx.AhwBna;
        if (str2 == null) {
            Intrinsics.gEmmrt("");
            str2 = null;
        }
        activityC23992iQx.KWHzl(str, str2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(ActivityC23992iQx activityC23992iQx, InterfaceC9738bbJ interfaceC9738bbJ) {
        java.lang.String strEZpvd;
        if (!interfaceC9738bbJ.zsXlph() && !interfaceC9738bbJ.UeEOUB()) {
            activityC23992iQx.AuCTel = interfaceC9738bbJ.DbNXlk();
            java.lang.String stringExtra = activityC23992iQx.getIntent().getStringExtra("walletAddress");
            InterfaceC9738bbJ interfaceC9738bbJOLrzqt = ((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).gEmmrt().OLrzqt(activityC23992iQx.AuCTel);
            if (interfaceC9738bbJOLrzqt == null || (strEZpvd = interfaceC9738bbJOLrzqt.EZpvd(activityC23992iQx.valueOf)) == null) {
                strEZpvd = "";
            }
            if (stringExtra == null || stringExtra.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) stringExtra)) {
                stringExtra = strEZpvd;
            }
            activityC23992iQx.AhwBna = stringExtra;
            java.lang.String strDbNXlk = interfaceC9738bbJ.DbNXlk();
            java.lang.String str = activityC23992iQx.AhwBna;
            if (str == null) {
                Intrinsics.gEmmrt("");
                str = null;
            }
            activityC23992iQx.KWHzl(strDbNXlk, str);
        } else {
            activityC23992iQx.KWHzl("", "");
        }
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(ActivityC23992iQx activityC23992iQx, java.lang.Throwable th) {
        activityC23992iQx.KWHzl("", "");
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(ActivityC23992iQx activityC23992iQx, InterfaceC9738bbJ interfaceC9738bbJ) {
        if (!interfaceC9738bbJ.zsXlph() && !interfaceC9738bbJ.UeEOUB()) {
            java.lang.String strDbNXlk = interfaceC9738bbJ.DbNXlk();
            java.lang.String str = activityC23992iQx.AhwBna;
            if (str == null) {
                Intrinsics.gEmmrt("");
                str = null;
            }
            activityC23992iQx.KWHzl(strDbNXlk, str);
        } else {
            activityC23992iQx.KWHzl("", "");
        }
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(ActivityC23992iQx activityC23992iQx, java.lang.Throwable th) {
        activityC23992iQx.KWHzl("", "");
        return Unit.INSTANCE;
    }

    private final void fetchVPNInfo() {
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C25516iyG.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, this);
        final Function1 function1 = new Function1() { // from class: o.iQD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC23992iQx.EZpvd(this.OLrzqt, (C25516iyG) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.iQH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC23992iQx.AYXKKw(function1, obj);
            }
        });
        djBIcL().AEQbTJ().observe(this, new Observer() { // from class: o.iQF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                ActivityC23992iQx.AEQbTJ(this.OLrzqt, obj);
            }
        });
        djBIcL().copydefault().observe(this, new Observer() { // from class: o.iQJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                ActivityC23992iQx.EZpvd(this.EZpvd, obj);
            }
        });
        djBIcL().EZpvd().observe(this, new ActionBar(new Function1() { // from class: o.iQI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC23992iQx.EZpvd(this.OLrzqt, (Bitmap) obj);
            }
        }));
        djBIcL().KWHzl().observe(this, new ActionBar(new Function1() { // from class: o.iQM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC23992iQx.AEQbTJ(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        djBIcL().djBIcL().observe(this, new ActionBar(new Function1() { // from class: o.iQL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC23992iQx.OLrzqt(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(ActivityC23992iQx activityC23992iQx, C25516iyG c25516iyG) {
        if (activityC23992iQx.EZpvd() == c25516iyG.copydefault()) {
            activityC23992iQx.finish();
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(ActivityC23992iQx activityC23992iQx, java.lang.Object obj) {
        InvestSubscriptionInfo investSubscriptionInfo = activityC23992iQx.fARcdN;
        if (investSubscriptionInfo != null && C27577jxn.copydefault.EZpvd(java.lang.Integer.valueOf(investSubscriptionInfo.getInvestType().getValue())) && investSubscriptionInfo.getSubscriptionMethod() == TransactionMethod.BOTH) {
            activityC23992iQx.AhwBna();
        }
    }

    public static final void EZpvd(ActivityC23992iQx activityC23992iQx, java.lang.Object obj) {
        activityC23992iQx.copydefault(true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(ActivityC23992iQx activityC23992iQx, Bitmap bitmap) {
        android.widget.LinearLayout linearLayout;
        android.widget.TextView textView;
        FragmentContainerView fragmentContainerView;
        C55113xdn c55113xdn;
        C27137jpX c27137jpX;
        if (bitmap instanceof Bitmap.StateListAnimator) {
            rVN.reportFullyDrawn$default((android.app.Activity) activityC23992iQx, true, (java.lang.String) null, 2, (java.lang.Object) null);
            T tOLrzqt = ((Bitmap.StateListAnimator) bitmap).OLrzqt();
            Intrinsics.copydefault(tOLrzqt);
            InvestSubscriptionInfo investSubscriptionInfo = (InvestSubscriptionInfo) tOLrzqt;
            activityC23992iQx.fARcdN = investSubscriptionInfo;
            Intrinsics.copydefault(investSubscriptionInfo);
            activityC23992iQx.AEQbTJ(investSubscriptionInfo);
            InvestSubscriptionInfo investSubscriptionInfo2 = activityC23992iQx.fARcdN;
            Intrinsics.copydefault(investSubscriptionInfo2);
            activityC23992iQx.OLrzqt(investSubscriptionInfo2);
            iGZ igz = activityC23992iQx.isConnected;
            if (igz != null && (c27137jpX = igz.AEQbTJ) != null) {
                c27137jpX.setVisibility(8);
            }
            iGZ igz2 = activityC23992iQx.isConnected;
            if (igz2 != null && (c55113xdn = igz2.copydefault) != null) {
                c55113xdn.copydefault();
            }
            iGZ igz3 = activityC23992iQx.isConnected;
            if (igz3 != null && (fragmentContainerView = igz3.KWHzl) != null) {
                fragmentContainerView.setVisibility(0);
            }
            InvestSubscriptionInfo investSubscriptionInfo3 = activityC23992iQx.fARcdN;
            if (investSubscriptionInfo3 != null) {
                iGZ igz4 = activityC23992iQx.isConnected;
                if (igz4 != null && (textView = igz4.AkhnZx) != null) {
                    textView.setText(investSubscriptionInfo3.getValidatorName());
                }
                activityC23992iQx.valueOf();
                iGZ igz5 = activityC23992iQx.isConnected;
                if (igz5 != null && (linearLayout = igz5.djBIcL) != null) {
                    linearLayout.setVisibility(investSubscriptionInfo3.getInvestType() != InvestType.Pos ? 8 : 0);
                }
            }
        } else {
            rVN.reportFullyDrawn$default((android.app.Activity) activityC23992iQx, false, (java.lang.String) null, 2, (java.lang.Object) null);
            activityC23992iQx.copydefault(Intrinsics.EZpvd((java.lang.Object) bitmap.AEQbTJ(), (java.lang.Object) "false"));
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ActivityC23992iQx activityC23992iQx, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            updateSwitchAnimator$default(activityC23992iQx, activityC23992iQx.djBIcL().AhwBna(), 0L, 2, null);
            SPUtils.put("sp_invest_pool_subscribe_select", java.lang.Integer.valueOf(activityC23992iQx.djBIcL().AhwBna() ? 2 : 1));
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC23992iQx activityC23992iQx, java.lang.Boolean bool) {
        android.widget.LinearLayout linearLayout;
        iGZ igz = activityC23992iQx.isConnected;
        if (igz != null && (linearLayout = igz.djBIcL) != null) {
            linearLayout.setVisibility(bool.booleanValue() ? 0 : 8);
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.String str3;
        java.lang.String str4;
        FragmentContainerView fragmentContainerView;
        C55113xdn c55113xdn;
        C55113xdn c55113xdn2;
        C55113xdn c55113xdn3;
        C27137jpX c27137jpX;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AuCTel = str;
        this.AhwBna = str2;
        iGZ igz = this.isConnected;
        if (igz != null && (c27137jpX = igz.AEQbTJ) != null) {
            c27137jpX.setVisibility(8);
        }
        iGZ igz2 = this.isConnected;
        if (igz2 != null && (c55113xdn3 = igz2.copydefault) != null) {
            c55113xdn3.setVisibility(0);
        }
        iGZ igz3 = this.isConnected;
        if (igz3 != null && (c55113xdn2 = igz3.copydefault) != null) {
            c55113xdn2.setAnimation(C33492mxV.OLrzqt() ? "invest_subscription_loading_new_night.lottie" : "invest_subscription_loading_new.lottie");
        }
        iGZ igz4 = this.isConnected;
        if (igz4 != null && (c55113xdn = igz4.copydefault) != null) {
            c55113xdn.KWHzl(0L);
        }
        iGZ igz5 = this.isConnected;
        if (igz5 != null && (fragmentContainerView = igz5.KWHzl) != null) {
            fragmentContainerView.setVisibility(8);
        }
        if (C33129mqd.KWHzl((java.util.Collection) this.gEmmrt)) {
            java.util.ArrayList<InvestInputData> arrayList = this.gEmmrt;
            Intrinsics.copydefault(arrayList);
            java.lang.String tokenAddress = arrayList.get(0).getTokenAddress();
            Intrinsics.copydefault((java.lang.Object) tokenAddress);
            str3 = tokenAddress;
        } else {
            str3 = "";
        }
        java.lang.Integer num = this.djBIcL == 2 ? 0 : null;
        C27073joM c27073joMDjBIcL = djBIcL();
        long j = this.AYXKKw;
        java.lang.String str5 = this.AhwBna;
        if (str5 == null) {
            Intrinsics.gEmmrt("");
            str4 = null;
        } else {
            str4 = str5;
        }
        c27073joMDjBIcL.copydefault(str, j, str4, str3, this.djBIcL, num);
    }

    private final void copydefault(boolean z) {
        iGZ igz = this.isConnected;
        if (igz != null) {
            igz.gEmmrt.setVisibility(8);
            igz.KWHzl.setVisibility(8);
            igz.AEQbTJ.setVisibility(0);
            igz.copydefault.copydefault();
            if (z) {
                igz.AEQbTJ.setSubTitleShow(false);
            } else {
                igz.AEQbTJ.setSubTitleShow(true);
            }
        }
    }

    public final void AEQbTJ(InvestSubscriptionInfo investSubscriptionInfo) {
        final android.widget.LinearLayout linearLayout;
        java.lang.Float fValueOf;
        C33537myN c33537myN;
        android.widget.TextView title;
        android.text.TextPaint paint;
        C33537myN c33537myN2;
        android.widget.TextView title2;
        java.lang.CharSequence text;
        iGZ igz = this.isConnected;
        if (igz == null || (linearLayout = igz.gEmmrt) == null) {
            return;
        }
        if (C27577jxn.copydefault.EZpvd(java.lang.Integer.valueOf(investSubscriptionInfo.getInvestType().getValue())) && investSubscriptionInfo.getSubscriptionMethod() == TransactionMethod.BOTH) {
            djBIcL().OLrzqt().observe(this, new ActionBar(new Function1() { // from class: o.iQQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC23992iQx.EZpvd(linearLayout, (java.lang.Boolean) obj);
                }
            }));
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            int iEZpvd = C33566myq.EZpvd.EZpvd(this);
            iGZ igz2 = this.isConnected;
            if (igz2 == null || (c33537myN = igz2.OLrzqt) == null || (title = c33537myN.getTitle()) == null || (paint = title.getPaint()) == null) {
                fValueOf = null;
            } else {
                iGZ igz3 = this.isConnected;
                fValueOf = java.lang.Float.valueOf(paint.measureText((igz3 == null || (c33537myN2 = igz3.OLrzqt) == null || (title2 = c33537myN2.getTitle()) == null || (text = title2.getText()) == null) ? null : C33129mqd.gEmmrt(text)));
            }
            layoutParams.width = ((iEZpvd - C33129mqd.AhwBna(fValueOf)) / 2) - C33052mpF.dp2px$default(24.0f, null, 1, null);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.post(new java.lang.Runnable() { // from class: o.iQP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC23992iQx.OLrzqt(linearLayout, this);
                }
            });
            C8003auW.copydefault(linearLayout).throttleFirst(500L, java.util.concurrent.TimeUnit.MILLISECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.iQW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ActivityC23992iQx.AYXKKw(this.OLrzqt, obj);
                }
            });
            return;
        }
        linearLayout.setVisibility(8);
    }

    public static final Unit EZpvd(android.widget.LinearLayout linearLayout, java.lang.Boolean bool) {
        linearLayout.setClickable(!bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(android.widget.LinearLayout linearLayout, ActivityC23992iQx activityC23992iQx) {
        linearLayout.setVisibility(0);
        activityC23992iQx.OLrzqt(!activityC23992iQx.fetchVPNInfo, 0L);
    }

    public static final void AYXKKw(ActivityC23992iQx activityC23992iQx, java.lang.Object obj) {
        activityC23992iQx.AYXKKw();
    }

    public final void AYXKKw() {
        djBIcL().gEmmrt();
    }

    public static /* synthetic */ void updateSwitchAnimator$default(ActivityC23992iQx activityC23992iQx, boolean z, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 300;
        }
        activityC23992iQx.OLrzqt(z, j);
    }

    public final void OLrzqt(boolean z, long j) {
        java.lang.String strSubS$default;
        android.animation.ObjectAnimator objectAnimatorOfFloat;
        android.animation.ObjectAnimator objectAnimatorOfFloat2;
        android.animation.ObjectAnimator objectAnimatorOfFloat3;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.animation.AnimatorSet duration = new android.animation.AnimatorSet().setDuration(j);
        iGZ igz = this.isConnected;
        if (igz == null || (textView = igz.valueOf) == null) {
            strSubS$default = null;
        } else {
            int width = textView.getWidth();
            iGZ igz2 = this.isConnected;
            strSubS$default = C33129mqd.subS$default(java.lang.Integer.valueOf(width), (igz2 == null || (textView2 = igz2.isConnected) == null) ? null : java.lang.Integer.valueOf(textView2.getWidth()), null, null, null, 14, null);
        }
        float fDjBIcL = C33129mqd.djBIcL(strSubS$default);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (z) {
            iGZ igz3 = this.isConnected;
            objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(igz3 != null ? igz3.isConnected : null, "alpha", 0.0f, 1.0f);
        } else {
            iGZ igz4 = this.isConnected;
            objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(igz4 != null ? igz4.isConnected : null, "alpha", 1.0f, 0.0f);
        }
        arrayList.add(objectAnimatorOfFloat);
        if (z) {
            iGZ igz5 = this.isConnected;
            objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(igz5 != null ? igz5.valueOf : null, "alpha", 1.0f, 0.0f);
        } else {
            iGZ igz6 = this.isConnected;
            objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(igz6 != null ? igz6.valueOf : null, "alpha", 0.0f, 1.0f);
        }
        arrayList.add(objectAnimatorOfFloat2);
        if (z) {
            iGZ igz7 = this.isConnected;
            objectAnimatorOfFloat3 = android.animation.ObjectAnimator.ofFloat(igz7 != null ? igz7.EZpvd : null, androidx.constraintlayout.motion.widget.Key.ROTATION, 0.0f, -180.0f);
        } else {
            iGZ igz8 = this.isConnected;
            objectAnimatorOfFloat3 = android.animation.ObjectAnimator.ofFloat(igz8 != null ? igz8.EZpvd : null, androidx.constraintlayout.motion.widget.Key.ROTATION, -180.0f, 0.0f);
        }
        arrayList.add(objectAnimatorOfFloat3);
        if ((z && C33129mqd.gEmmrt(java.lang.Float.valueOf(fDjBIcL), 0)) || (!z && C33129mqd.AEQbTJ(java.lang.Float.valueOf(fDjBIcL), 0))) {
            iGZ igz9 = this.isConnected;
            arrayList.add(android.animation.ObjectAnimator.ofFloat(igz9 != null ? igz9.EZpvd : null, "translationX", java.lang.Math.abs(fDjBIcL), 0.0f));
        } else if ((z && C33129mqd.AEQbTJ(java.lang.Float.valueOf(fDjBIcL), 0)) || (!z && C33129mqd.gEmmrt(java.lang.Float.valueOf(fDjBIcL), 0))) {
            iGZ igz10 = this.isConnected;
            arrayList.add(android.animation.ObjectAnimator.ofFloat(igz10 != null ? igz10.EZpvd : null, "translationX", 0.0f, java.lang.Math.abs(fDjBIcL)));
        }
        duration.playTogether(arrayList);
        duration.start();
    }

    public final void AhwBna() {
        if (SPUtils.getBoolean("sp_show_switch_tips", true)) {
            SPUtils.put("sp_show_switch_tips", java.lang.Boolean.FALSE);
            iGZ igz = this.isConnected;
            mAE.OLrzqt(this, igz != null ? igz.AhwBna : null, AnchorPopupWindow.Style.Gray, C33070mpX.AYXKKw(C25493ixk.FragmentManager.RcvFxC), AnchorPopupWindow.VerticalPosition.BELOW, true, C33052mpF.dpInt$default(-10.0f, (android.content.Context) null, 1, (java.lang.Object) null), 0, 8388613, 8388613, new android.graphics.Rect(C33052mpF.dpInt$default(16.0f, (android.content.Context) null, 1, (java.lang.Object) null), 0, C33052mpF.dpInt$default(16.0f, (android.content.Context) null, 1, (java.lang.Object) null), 0), new android.graphics.Rect(), new int[]{0, 0});
        }
    }

    public final void KWHzl(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final int i) {
        C27570jxg.investEvent$default("YieldDeposit_Full_Page_View", null, new Function1() { // from class: o.iQR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC23992iQx.KWHzl(this.KWHzl, str, str2, str3, str4, i, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit KWHzl(ActivityC23992iQx activityC23992iQx, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("investment_id", C33129mqd.gEmmrt(java.lang.Long.valueOf(activityC23992iQx.AYXKKw)), false);
        eventParamsList.put("chain_id", str, false);
        eventParamsList.put("balance", "Balance_" + str2, false);
        eventParamsList.put("same_chain_balance", "Balance_" + str3, false);
        eventParamsList.put("other_chains_balance", "Balance_" + str4, false);
        eventParamsList.put("product", C27577jxn.copydefault.EZpvd(i), true);
        EventParamsList.put$default(eventParamsList, "source", activityC23992iQx.DbNXlk, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void DbNXlk() {
        android.widget.LinearLayout linearLayout;
        iGZ igz = this.isConnected;
        if (igz == null || (linearLayout = igz.djBIcL) == null) {
            return;
        }
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: o.iQB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC23992iQx.AEQbTJ(this.AEQbTJ, view);
            }
        });
    }

    public static final void AEQbTJ(ActivityC23992iQx activityC23992iQx, android.view.View view) {
        C24111iVh.TaskDescription taskDescription = C24111iVh.Companion;
        long j = activityC23992iQx.AYXKKw;
        Bitmap<java.util.List<InvestValidatorListItems>> value = activityC23992iQx.djBIcL().valueOf().getValue();
        java.util.List<InvestValidatorListItems> listOLrzqt = value != null ? value.OLrzqt() : null;
        java.util.ArrayList<InvestValidatorListItems> arrayList = listOLrzqt instanceof java.util.ArrayList ? (java.util.ArrayList) listOLrzqt : null;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList<>();
        }
        C24111iVh c24111iVhAEQbTJ = taskDescription.AEQbTJ(j, 0, arrayList);
        c24111iVhAEQbTJ.show(activityC23992iQx.getSupportFragmentManager(), (java.lang.String) null);
        c24111iVhAEQbTJ.AEQbTJ(activityC23992iQx.new TaskDescription(c24111iVhAEQbTJ));
    }

    /* JADX INFO: renamed from: o.iQx$TaskDescription */
    public static final class TaskDescription implements iVW {
        public final /* synthetic */ C24111iVh KWHzl;

        public TaskDescription(C24111iVh c24111iVh) {
            this.KWHzl = c24111iVh;
        }

        @Override // o.iVW
        public void OLrzqt(java.lang.Long l) {
            if (l != null) {
                ActivityC23992iQx.this.OLrzqt(l.longValue());
                ActivityC23992iQx.this.gEmmrt();
            }
            this.KWHzl.dismissAllowingStateLoss();
        }
    }

    public final void valueOf() {
        android.widget.ImageView imageView;
        int i;
        InvestSubscriptionInfo investSubscriptionInfo = this.fARcdN;
        if (investSubscriptionInfo == null || !investSubscriptionInfo.isSingleValidator()) {
            iGZ igz = this.isConnected;
            if (igz == null || (imageView = igz.AYXKKw) == null) {
                return;
            } else {
                i = C52761wXj.TaskDescription.SlnMSS;
            }
        } else {
            iGZ igz2 = this.isConnected;
            if (igz2 == null || (imageView = igz2.AYXKKw) == null) {
                return;
            } else {
                i = C52761wXj.TaskDescription.GGlJim;
            }
        }
        imageView.setImageResource(i);
    }

    public final void gEmmrt() {
        iGZ igz;
        android.widget.ImageView imageView;
        InvestSubscriptionInfo investSubscriptionInfo = this.fARcdN;
        if ((investSubscriptionInfo != null && investSubscriptionInfo.isSingleValidator()) || (igz = this.isConnected) == null || (imageView = igz.AYXKKw) == null) {
            return;
        }
        C27569jxf.OLrzqt.AEQbTJ(imageView);
    }

    @Override // o.AbstractActivityC33041mov
    public void addConfig() {
        C27569jxf.setStatusBarsStyle$OKDeFi_invest_biz$default(C27569jxf.OLrzqt, this, 0, 1, null);
    }

    public final void OLrzqt(long j) {
        this.AYXKKw = j;
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = ((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).gEmmrt().KWHzl();
        final Function1 function1 = new Function1() { // from class: o.iQC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC23992iQx.OLrzqt(this.EZpvd, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.iQK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC23992iQx.djBIcL(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.iQN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC23992iQx.OLrzqt(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.iQO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC23992iQx.AhwBna(function12, obj);
            }
        }), "");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(@NotNull InvestSubscriptionInfo investSubscriptionInfo) {
        InterfaceC9738bbJ interfaceC9738bbJ;
        ActivityC23992iQx activityC23992iQx;
        java.util.ArrayList<InvestInputData> arrayList;
        java.lang.String currencyDataToDollar$default;
        java.lang.String str;
        InterfaceC9738bbJ interfaceC9738bbJ2;
        java.lang.String strDjBIcL;
        java.lang.String str2;
        java.lang.Object obj;
        boolean z;
        java.lang.String currencyDataToDollar$default2;
        java.lang.String strHDKMBd;
        java.util.ArrayList<InvestInputData> arrayList2;
        java.lang.String strEZpvd;
        Intrinsics.checkNotNullParameter(investSubscriptionInfo, "");
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt = ((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).gEmmrt().OLrzqt(this.AuCTel);
        java.lang.String str3 = (interfaceC9738bbJOLrzqt == null || (strEZpvd = interfaceC9738bbJOLrzqt.EZpvd(investSubscriptionInfo.getChainId())) == null) ? "" : strEZpvd;
        if (C27577jxn.copydefault.EZpvd(java.lang.Integer.valueOf(investSubscriptionInfo.getInvestType().getValue()))) {
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
            int i = C25493ixk.ActionBar.invokespecialROgMPW;
            iQS.StateListAnimator stateListAnimator = iQS.Companion;
            java.lang.String str4 = this.AuCTel;
            long j = this.AYXKKw;
            int value = investSubscriptionInfo.getInvestType().getValue();
            java.lang.String validatorName = investSubscriptionInfo.getValidatorName();
            boolean z2 = this.fetchVPNInfo;
            java.util.ArrayList<InvestInputData> arrayList3 = this.gEmmrt;
            interfaceC9738bbJ = interfaceC9738bbJOLrzqt;
            fragmentTransactionBeginTransaction.replace(i, stateListAnimator.KWHzl(str4, str3, j, value, validatorName, !z2, investSubscriptionInfo, ((arrayList3 == null || !arrayList3.isEmpty()) && (arrayList2 = this.gEmmrt) != null) ? arrayList2.get(0) : null, this.AkhnZx, this.djBIcL, this.DbNXlk, this.values)).commitAllowingStateLoss();
            activityC23992iQx = this;
        } else {
            interfaceC9738bbJ = interfaceC9738bbJOLrzqt;
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction2 = getSupportFragmentManager().beginTransaction();
            int i2 = C25493ixk.ActionBar.invokespecialROgMPW;
            iQS.StateListAnimator stateListAnimator2 = iQS.Companion;
            activityC23992iQx = this;
            java.lang.String str5 = activityC23992iQx.AuCTel;
            long j2 = activityC23992iQx.AYXKKw;
            int value2 = investSubscriptionInfo.getInvestType().getValue();
            java.lang.String validatorName2 = investSubscriptionInfo.getValidatorName();
            java.util.ArrayList<InvestInputData> arrayList4 = activityC23992iQx.gEmmrt;
            fragmentTransactionBeginTransaction2.replace(i2, stateListAnimator2.KWHzl(str5, str3, j2, value2, validatorName2, false, investSubscriptionInfo, ((arrayList4 == null || !arrayList4.isEmpty()) && (arrayList = activityC23992iQx.gEmmrt) != null) ? arrayList.get(0) : null, activityC23992iQx.AkhnZx, activityC23992iQx.djBIcL, activityC23992iQx.DbNXlk, activityC23992iQx.values)).commitAllowingStateLoss();
        }
        if (activityC23992iQx.fetchVPNInfo) {
            if (!investSubscriptionInfo.getSwapToTokenList().isEmpty()) {
                if (activityC23992iQx.gEmmrt != null && (!r0.isEmpty())) {
                    java.lang.String tokenAddress = investSubscriptionInfo.getSwapToTokenList().get(0).getTokenAddress();
                    java.util.ArrayList<InvestInputData> arrayList5 = activityC23992iQx.gEmmrt;
                    Intrinsics.copydefault(arrayList5);
                    if (C59449zhJ.gEmmrt(tokenAddress, arrayList5.get(0).getTokenAddress(), true) && (!investSubscriptionInfo.getInvestWithTokenList().isEmpty())) {
                        currencyDataToDollar$default = C27492jwH.formatCurrencyDataToDollar$default(C27492jwH.OLrzqt, investSubscriptionInfo.getInvestWithTokenList().get(0).getCurrencyAmount(), false, 2, null);
                    }
                    str = MultiTransferSignData.DEFAULT_INTERVAL;
                } else if (!investSubscriptionInfo.getInvestWithTokenList().isEmpty()) {
                    currencyDataToDollar$default = C27492jwH.formatCurrencyDataToDollar$default(C27492jwH.OLrzqt, investSubscriptionInfo.getInvestWithTokenList().get(0).getCurrencyAmount(), false, 2, null);
                } else {
                    str = MultiTransferSignData.DEFAULT_INTERVAL;
                }
            } else {
                if (!investSubscriptionInfo.getInvestWithTokenList().isEmpty()) {
                    currencyDataToDollar$default = C27492jwH.formatCurrencyDataToDollar$default(C27492jwH.OLrzqt, investSubscriptionInfo.getInvestWithTokenList().get(0).getCurrencyAmount(), false, 2, null);
                }
                str = MultiTransferSignData.DEFAULT_INTERVAL;
            }
            if (interfaceC9738bbJ == null) {
                interfaceC9738bbJ2 = interfaceC9738bbJ;
                strDjBIcL = interfaceC9738bbJ2.djBIcL(investSubscriptionInfo.getChainId());
                if (strDjBIcL == null) {
                }
                str2 = (interfaceC9738bbJ2 == null || (strHDKMBd = interfaceC9738bbJ2.hDKMBd()) == null) ? MultiTransferSignData.DEFAULT_INTERVAL : strHDKMBd;
                if (str2.equals(MultiTransferSignData.DEFAULT_INTERVAL)) {
                    currencyDataToDollar$default2 = MultiTransferSignData.DEFAULT_INTERVAL;
                    obj = null;
                    z = false;
                } else if (strDjBIcL.equals(MultiTransferSignData.DEFAULT_INTERVAL)) {
                    currencyDataToDollar$default2 = C27492jwH.formatCurrencyDataToDollar$default(C27492jwH.OLrzqt, str2, false, 2, null);
                    z = false;
                    obj = null;
                } else {
                    C27492jwH c27492jwH = C27492jwH.OLrzqt;
                    java.lang.String strSubS$default = C33129mqd.subS$default(str2, strDjBIcL, null, null, null, 14, null);
                    obj = null;
                    z = false;
                    currencyDataToDollar$default2 = C27492jwH.formatCurrencyDataToDollar$default(c27492jwH, strSubS$default, false, 2, null);
                }
                KWHzl(C33129mqd.gEmmrt(java.lang.Long.valueOf(investSubscriptionInfo.getChainId())), str, C27492jwH.formatCurrencyDataToDollar$default(C27492jwH.OLrzqt, strDjBIcL, z, 2, obj), currencyDataToDollar$default2, investSubscriptionInfo.getInvestType().getValue());
            }
            interfaceC9738bbJ2 = interfaceC9738bbJ;
            strDjBIcL = MultiTransferSignData.DEFAULT_INTERVAL;
            if (interfaceC9738bbJ2 == null) {
            }
            if (str2.equals(MultiTransferSignData.DEFAULT_INTERVAL)) {
            }
            KWHzl(C33129mqd.gEmmrt(java.lang.Long.valueOf(investSubscriptionInfo.getChainId())), str, C27492jwH.formatCurrencyDataToDollar$default(C27492jwH.OLrzqt, strDjBIcL, z, 2, obj), currencyDataToDollar$default2, investSubscriptionInfo.getInvestType().getValue());
        }
        if (investSubscriptionInfo.getInvestWithTokenList().size() > 1) {
            C27492jwH c27492jwH2 = C27492jwH.OLrzqt;
            currencyDataToDollar$default = C27492jwH.formatCurrencyDataToDollar$default(c27492jwH2, investSubscriptionInfo.getInvestWithTokenList().get(0).getCurrencyAmount(), false, 2, null) + "_" + C27492jwH.formatCurrencyDataToDollar$default(c27492jwH2, investSubscriptionInfo.getInvestWithTokenList().get(1).getCurrencyAmount(), false, 2, null);
        } else {
            currencyDataToDollar$default = "-1_-1";
        }
        str = currencyDataToDollar$default;
        if (interfaceC9738bbJ == null) {
        }
        strDjBIcL = MultiTransferSignData.DEFAULT_INTERVAL;
        if (interfaceC9738bbJ2 == null) {
        }
        if (str2.equals(MultiTransferSignData.DEFAULT_INTERVAL)) {
        }
        KWHzl(C33129mqd.gEmmrt(java.lang.Long.valueOf(investSubscriptionInfo.getChainId())), str, C27492jwH.formatCurrencyDataToDollar$default(C27492jwH.OLrzqt, strDjBIcL, z, 2, obj), currencyDataToDollar$default2, investSubscriptionInfo.getInvestType().getValue());
    }

    @Override // o.iPU, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.iPU, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.iPU, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.iPU, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
