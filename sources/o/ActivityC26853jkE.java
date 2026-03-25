package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.InvestRedeemReceiveInfoUIBean;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.bean.InvestUniv3RedeemReceiveInfo;
import com.okinc.business.invest_biz.data.bean.PromptInformation;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestInputData;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestTransactionModel;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3RedeemViewModel;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.Bitmap;
import o.C25493ixk;
import o.C27231jrL;
import o.iXD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jkE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class ActivityC26853jkE extends AbstractActivityC26828jjg<InvestUniv3RedeemViewModel> {
    public iKS AkhnZx;
    public C23813iKg AuCTel;
    public C23815iKi DbNXlk;
    public boolean ejfBZ;
    public java.util.ArrayList<InvestInputData> fARcdN;
    public long fJNWhG;
    public iKR fetchVPNInfo;
    public TransactionConfig getFieldNames;
    public iKM isConnected;
    public long values;
    public java.lang.String uzCIH = "";
    public java.lang.String iwGUEr = "";
    public java.lang.String fIwbmz = "";

    /* JADX INFO: renamed from: o.jkE$Dialog */
    public static final /* synthetic */ class Dialog implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(Function1 function1) {
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
    @Override // o.AbstractActivityC24051iTb
    public java.lang.Class<InvestUniv3RedeemViewModel> AkhnZx() {
        return InvestUniv3RedeemViewModel.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC23612iCv
    public long EZpvd() {
        return this.fJNWhG;
    }

    @Override // o.AbstractActivityC24051iTb
    public boolean djBIcL() {
        return false;
    }

    @Override // o.AbstractActivityC24051iTb
    public int values() {
        return 3;
    }

    @Override // o.AbstractActivityC24051iTb
    public void OLrzqt(android.os.Bundle bundle) {
        android.content.Intent intent = getIntent();
        if (intent != null) {
            TransactionConfig transactionConfig = (TransactionConfig) intent.getParcelableExtra("key.trx_config");
            this.getFieldNames = transactionConfig;
            if (transactionConfig != null) {
                this.fJNWhG = transactionConfig.isConnected();
                this.fARcdN = transactionConfig.valueOf();
                this.values = transactionConfig.copydefault();
                this.ejfBZ = transactionConfig.AwvSrB();
                this.fIwbmz = transactionConfig.ejfBZ();
            }
        }
        this.isConnected = iKM.OLrzqt(android.view.LayoutInflater.from(this), AYXKKw().fetchVPNInfo);
        this.fetchVPNInfo = iKR.AEQbTJ(android.view.LayoutInflater.from(this), AYXKKw().gEmmrt);
        this.AkhnZx = iKS.copydefault(android.view.LayoutInflater.from(this), AYXKKw().DbNXlk);
        this.DbNXlk = C23815iKi.AEQbTJ(android.view.LayoutInflater.from(this), AYXKKw().AhwBna);
        this.AuCTel = C23813iKg.KWHzl(android.view.LayoutInflater.from(this), AYXKKw().AYXKKw);
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().KWHzl();
        final Function1 function1 = new Function1() { // from class: o.jlb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26853jkE.AEQbTJ(this.AEQbTJ, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.jkX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC26853jkE.AEQbTJ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.jla
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26853jkE.KWHzl((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.jkY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC26853jkE.copydefault(function12, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(ActivityC26853jkE activityC26853jkE, InterfaceC9738bbJ interfaceC9738bbJ) {
        if (interfaceC9738bbJ.zsXlph() || !interfaceC9738bbJ.UeEOUB()) {
            activityC26853jkE.EZpvd(interfaceC9738bbJ.DbNXlk(), interfaceC9738bbJ.EZpvd(activityC26853jkE.values));
        } else {
            activityC26853jkE.EZpvd(interfaceC9738bbJ.DbNXlk(), interfaceC9738bbJ.EZpvd(activityC26853jkE.values));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.String str3;
        InvestInputData investInputData;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.uzCIH = str;
        this.iwGUEr = str2;
        AYXKKw().copydefault.setVisibility(8);
        AYXKKw().OLrzqt.setVisibility(0);
        C27207jqo c27207jqo = AYXKKw().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c27207jqo, "");
        C27301jsc.AEQbTJ(c27207jqo);
        AYXKKw().valueOf.setVisibility(8);
        if (C33129mqd.KWHzl((java.util.Collection) this.fARcdN)) {
            java.util.ArrayList<InvestInputData> arrayList = this.fARcdN;
            java.lang.String tokenAddress = (arrayList == null || (investInputData = arrayList.get(0)) == null) ? null : investInputData.getTokenAddress();
            if (tokenAddress != null) {
                str3 = tokenAddress;
            }
        } else {
            str3 = "";
        }
        InvestUniv3RedeemViewModel investUniv3RedeemViewModel = (InvestUniv3RedeemViewModel) DbNXlk();
        java.lang.String str4 = this.iwGUEr;
        long j = this.fJNWhG;
        long j2 = this.values;
        java.lang.String str5 = this.fIwbmz;
        boolean z = this.ejfBZ;
        java.util.ArrayList<InvestInputData> arrayList2 = this.fARcdN;
        investUniv3RedeemViewModel.EZpvd(str, str4, j, j2, str5, z, arrayList2 != null ? (InvestInputData) CollectionsKt___CollectionsKt.AkhnZx(arrayList2, 0) : null);
        ((InvestUniv3RedeemViewModel) DbNXlk()).copydefault(str, this.fJNWhG, str2, str3, this.fIwbmz, this.ejfBZ);
    }

    @Override // o.AbstractActivityC24051iTb
    public void isConnected() {
        AYXKKw().AEQbTJ.getTitle().setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.FhERFw));
        C23813iKg c23813iKg = this.AuCTel;
        C23815iKi c23815iKi = null;
        if (c23813iKg == null) {
            Intrinsics.gEmmrt("");
            c23813iKg = null;
        }
        c23813iKg.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.jkT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC26853jkE.OLrzqt(this.KWHzl, view);
            }
        });
        iKS iks = this.AkhnZx;
        if (iks == null) {
            Intrinsics.gEmmrt("");
            iks = null;
        }
        iks.copydefault.setDelayContentTextWatcher(new Activity());
        iKS iks2 = this.AkhnZx;
        if (iks2 == null) {
            Intrinsics.gEmmrt("");
            iks2 = null;
        }
        iks2.copydefault.setContentTextWatcher(new ActionBar());
        iKM ikm = this.isConnected;
        if (ikm == null) {
            Intrinsics.gEmmrt("");
            ikm = null;
        }
        ikm.copydefault.setChangeClickListener(new Fragment());
        iKR ikr = this.fetchVPNInfo;
        if (ikr == null) {
            Intrinsics.gEmmrt("");
            ikr = null;
        }
        ikr.valueOf.setProcessClickListener(new View.OnClickListener() { // from class: o.jkV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC26853jkE.KWHzl(this.EZpvd, view);
            }
        });
        iKR ikr2 = this.fetchVPNInfo;
        if (ikr2 == null) {
            Intrinsics.gEmmrt("");
            ikr2 = null;
        }
        C27224jrE c27224jrE = ikr2.OLrzqt;
        java.lang.String string = getString(C25493ixk.FragmentManager.invokespecialatDTRm);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C27224jrE.setTitle$default(c27224jrE, string, null, null, 6, null);
        iKR ikr3 = this.fetchVPNInfo;
        if (ikr3 == null) {
            Intrinsics.gEmmrt("");
            ikr3 = null;
        }
        C27224jrE c27224jrE2 = ikr3.KWHzl;
        java.lang.String string2 = getString(C25493ixk.FragmentManager.GQzpsZgQzpsZ);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        C27224jrE.setTitle$default(c27224jrE2, string2, null, null, 6, null);
        android.widget.LinearLayout linearLayout = AYXKKw().DbNXlk;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            android.content.Context context = AYXKKw().DbNXlk.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = C55298xhM.copydefault(24.0f, context);
            linearLayout.setLayoutParams(layoutParams2);
            android.widget.LinearLayout linearLayout2 = AYXKKw().gEmmrt;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            ViewGroup.LayoutParams layoutParams3 = linearLayout2.getLayoutParams();
            if (layoutParams3 != null) {
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                android.content.Context context2 = AYXKKw().gEmmrt.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = C55298xhM.copydefault(28.0f, context2);
                android.content.Context context3 = AYXKKw().gEmmrt.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = C55298xhM.copydefault(20.0f, context3);
                linearLayout2.setLayoutParams(layoutParams4);
                C23815iKi c23815iKi2 = this.DbNXlk;
                if (c23815iKi2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c23815iKi = c23815iKi2;
                }
                c23815iKi.OLrzqt.setOnCTAButtonClick(new Function0() { // from class: o.jkW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return ActivityC26853jkE.AYXKKw(this.OLrzqt);
                    }
                });
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(final ActivityC26853jkE activityC26853jkE, android.view.View view) {
        ((InvestUniv3RedeemViewModel) activityC26853jkE.DbNXlk()).copydefault(new Function0() { // from class: o.jkS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC26853jkE.gEmmrt(this.copydefault);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit gEmmrt(ActivityC26853jkE activityC26853jkE) {
        ((InvestUniv3RedeemViewModel) activityC26853jkE.DbNXlk()).ORxRYg().setValue(new C23963iPv(false, true));
        ((InvestUniv3RedeemViewModel) activityC26853jkE.DbNXlk()).zsXlph();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.jkE$Activity */
    public static final class Activity implements Function1<java.lang.String, Unit> {
        public Activity() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.String str) {
            KWHzl(str);
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        public void KWHzl(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C23813iKg c23813iKg = ActivityC26853jkE.this.AuCTel;
            if (c23813iKg == null) {
                Intrinsics.gEmmrt("");
                c23813iKg = null;
            }
            android.widget.LinearLayout linearLayout = c23813iKg.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(8);
            ((InvestUniv3RedeemViewModel) ActivityC26853jkE.this.DbNXlk()).OLrzqt(str);
        }
    }

    /* JADX INFO: renamed from: o.jkE$ActionBar */
    public static final class ActionBar implements Function1<java.lang.String, Unit> {
        public ActionBar() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.String str) {
            AEQbTJ(str);
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        public void AEQbTJ(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C23813iKg c23813iKg = ActivityC26853jkE.this.AuCTel;
            if (c23813iKg == null) {
                Intrinsics.gEmmrt("");
                c23813iKg = null;
            }
            android.widget.LinearLayout linearLayout = c23813iKg.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(8);
            ((InvestUniv3RedeemViewModel) ActivityC26853jkE.this.DbNXlk()).AEQbTJ(str);
            iKS iks = ActivityC26853jkE.this.AkhnZx;
            if (iks == null) {
                Intrinsics.gEmmrt("");
                iks = null;
            }
            C27250jre.updateAmountAndUI$default(iks.copydefault, C33129mqd.AhwBna(str), false, 2, null);
        }
    }

    /* JADX INFO: renamed from: o.jkE$Fragment */
    public static final class Fragment implements C27231jrL.TaskDescription {
        public Fragment() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.C27231jrL.TaskDescription
        public void AEQbTJ() {
            ((InvestUniv3RedeemViewModel) ActivityC26853jkE.this.DbNXlk()).KWHzl();
        }
    }

    public static final void KWHzl(ActivityC26853jkE activityC26853jkE, android.view.View view) {
        C24085iUi.Companion.KWHzl(3).show(activityC26853jkE.getSupportFragmentManager(), "javaClass");
    }

    public static final Unit AYXKKw(ActivityC26853jkE activityC26853jkE) {
        activityC26853jkE.hDKMBd();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v20, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v23, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v26, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v29, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v32, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v34, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC24051iTb
    public void AhwBna() {
        ((InvestUniv3RedeemViewModel) DbNXlk()).AuCTelauCTel().observe(this, new Dialog(new Function1() { // from class: o.jkZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26853jkE.KWHzl(this.EZpvd, (C23955iPn) obj);
            }
        }));
        ((InvestUniv3RedeemViewModel) DbNXlk()).fJNWhG().observe(this, new Dialog(new Function1() { // from class: o.jle
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26853jkE.AEQbTJ(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        ((InvestUniv3RedeemViewModel) DbNXlk()).AkhnZx().observe(this, new Dialog(new Function1() { // from class: o.jkI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26853jkE.OLrzqt(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        ((InvestUniv3RedeemViewModel) DbNXlk()).fetchVPNInfo().observe(this, new Dialog(new Function1() { // from class: o.jkL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26853jkE.OLrzqt(this.AEQbTJ, (C23961iPt) obj);
            }
        }));
        C27589jxz.collectOnLifecycle$default(this, ((InvestUniv3RedeemViewModel) DbNXlk()).gEmmrt(), null, new Application(), 2, null);
        ((InvestUniv3RedeemViewModel) DbNXlk()).values().observe(this, new Dialog(new Function1() { // from class: o.jkK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26853jkE.EZpvd(this.AEQbTJ, (Bitmap) obj);
            }
        }));
        ((InvestUniv3RedeemViewModel) DbNXlk()).getNewProxyInstance().observe(this, new Dialog(new Function1() { // from class: o.jkN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26853jkE.OLrzqt(this.AEQbTJ, (C23959iPr) obj);
            }
        }));
        ((InvestUniv3RedeemViewModel) DbNXlk()).wlaJM().observe(this, new Dialog(new Function1() { // from class: o.jkP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26853jkE.AhwBna(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        ((InvestUniv3RedeemViewModel) DbNXlk()).AubY().observe(this, new Dialog(new Function1() { // from class: o.jkO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26853jkE.copydefault(this.AEQbTJ, (C23965iPx) obj);
            }
        }));
        ((InvestUniv3RedeemViewModel) DbNXlk()).zLjUOn().observe(this, new Dialog(new Function1() { // from class: o.jkQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26853jkE.copydefault(this.EZpvd, (C23962iPu) obj);
            }
        }));
        ((InvestUniv3RedeemViewModel) DbNXlk()).DbNXlk().observe(this, new Dialog(new Function1() { // from class: o.jkR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26853jkE.AEQbTJ(this.copydefault, (InvestRedeemReceiveInfoUIBean) obj);
            }
        }));
        C27589jxz.collectOnLifecycle$default(this, ((InvestUniv3RedeemViewModel) DbNXlk()).AYXKKw(), null, new StateListAnimator(), 2, null);
        C27589jxz.collectOnLifecycle$default(this, ((InvestUniv3RedeemViewModel) DbNXlk()).iwGUEr(), null, new TaskDescription(), 2, null);
    }

    public static final Unit KWHzl(ActivityC26853jkE activityC26853jkE, C23955iPn c23955iPn) {
        iKR ikr = activityC26853jkE.fetchVPNInfo;
        if (ikr == null) {
            Intrinsics.gEmmrt("");
            ikr = null;
        }
        C27271jrz c27271jrz = ikr.copydefault;
        Intrinsics.copydefault(c23955iPn);
        c27271jrz.setData(c23955iPn);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(final ActivityC26853jkE activityC26853jkE, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            C27496jwL.showDialog$default(C27496jwL.EZpvd, activityC26853jkE, null, C33070mpX.AYXKKw(C25493ixk.FragmentManager.iKEqwx), null, false, false, C33070mpX.AYXKKw(C25493ixk.FragmentManager.RckOJh), new Function0() { // from class: o.jkU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC26853jkE.djBIcL(this.EZpvd);
                }
            }, null, null, false, 1850, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit djBIcL(ActivityC26853jkE activityC26853jkE) {
        ((InvestUniv3RedeemViewModel) activityC26853jkE.DbNXlk()).ORxRYg().setValue(new C23963iPv(true, false));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC26853jkE activityC26853jkE, java.lang.Boolean bool) {
        iKS iks = null;
        C23813iKg c23813iKg = null;
        if (bool.booleanValue()) {
            iKS iks2 = activityC26853jkE.AkhnZx;
            if (iks2 == null) {
                Intrinsics.gEmmrt("");
                iks2 = null;
            }
            iks2.EZpvd.EZpvd();
            C23813iKg c23813iKg2 = activityC26853jkE.AuCTel;
            if (c23813iKg2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23813iKg = c23813iKg2;
            }
            c23813iKg.KWHzl.setEnabled(false);
        } else {
            iKS iks3 = activityC26853jkE.AkhnZx;
            if (iks3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                iks = iks3;
            }
            iks.EZpvd.copydefault();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC26853jkE activityC26853jkE, C23961iPt c23961iPt) {
        iKS iks = activityC26853jkE.AkhnZx;
        if (iks == null) {
            Intrinsics.gEmmrt("");
            iks = null;
        }
        iks.copydefault.setAmountDirect(c23961iPt.AEQbTJ());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.jkE$Application */
    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo, Continuation<? super Unit> continuation) {
            InvestTipInfoVo exceptionTip;
            InvestTipInfoVo exceptionTip2;
            java.lang.String tipContent;
            C23813iKg c23813iKg = ActivityC26853jkE.this.AuCTel;
            C23813iKg c23813iKg2 = null;
            if (c23813iKg == null) {
                Intrinsics.gEmmrt("");
                c23813iKg = null;
            }
            android.widget.LinearLayout linearLayout = c23813iKg.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            PromptInformation promptInformation = investUniv3RedeemReceiveInfo.getPromptInformation();
            linearLayout.setVisibility((promptInformation == null || (exceptionTip2 = promptInformation.getExceptionTip()) == null || (tipContent = exceptionTip2.getTipContent()) == null || !C33129mqd.OLrzqt((java.lang.CharSequence) tipContent)) ? 8 : 0);
            PromptInformation promptInformation2 = investUniv3RedeemReceiveInfo.getPromptInformation();
            if (promptInformation2 != null && (exceptionTip = promptInformation2.getExceptionTip()) != null) {
                C23813iKg c23813iKg3 = ActivityC26853jkE.this.AuCTel;
                if (c23813iKg3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c23813iKg2 = c23813iKg3;
                }
                c23813iKg2.EZpvd.setText(exceptionTip.getTipContent());
            }
            return Unit.INSTANCE;
        }
    }

    public static final Unit EZpvd(ActivityC26853jkE activityC26853jkE, Bitmap bitmap) {
        if (bitmap instanceof Bitmap.StateListAnimator) {
            activityC26853jkE.AYXKKw().copydefault.setVisibility(8);
            C27207jqo c27207jqo = activityC26853jkE.AYXKKw().OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c27207jqo, "");
            C57600ylV.AEQbTJ(c27207jqo);
            activityC26853jkE.AYXKKw().valueOf.setVisibility(0);
            rVN.reportFullyDrawn$default((android.app.Activity) activityC26853jkE, true, (java.lang.String) null, 2, (java.lang.Object) null);
        } else {
            activityC26853jkE.AYXKKw().valueOf.setVisibility(8);
            activityC26853jkE.AYXKKw().copydefault.setVisibility(0);
            C27207jqo c27207jqo2 = activityC26853jkE.AYXKKw().OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c27207jqo2, "");
            C57600ylV.AEQbTJ(c27207jqo2);
            rVN.reportFullyDrawn$default((android.app.Activity) activityC26853jkE, false, (java.lang.String) null, 2, (java.lang.Object) null);
            if (Intrinsics.EZpvd((java.lang.Object) bitmap.AEQbTJ(), (java.lang.Object) "false")) {
                activityC26853jkE.AYXKKw().copydefault.setSubTitleShow(false);
            } else {
                activityC26853jkE.AYXKKw().copydefault.setSubTitleShow(true);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC26853jkE activityC26853jkE, C23959iPr c23959iPr) {
        iKM ikm = activityC26853jkE.isConnected;
        if (ikm == null) {
            Intrinsics.gEmmrt("");
            ikm = null;
        }
        C27231jrL c27231jrL = ikm.copydefault;
        Intrinsics.copydefault(c23959iPr);
        c27231jrL.setData(c23959iPr);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(ActivityC26853jkE activityC26853jkE, java.lang.Boolean bool) {
        iKM ikm = activityC26853jkE.isConnected;
        if (ikm == null) {
            Intrinsics.gEmmrt("");
            ikm = null;
        }
        C27231jrL c27231jrL = ikm.copydefault;
        Intrinsics.copydefault(bool);
        c27231jrL.copydefault(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC26853jkE activityC26853jkE, C23965iPx c23965iPx) {
        InvestTipInfoVo investTipInfoVoKWHzl = c23965iPx.KWHzl();
        if (investTipInfoVoKWHzl != null) {
            iKR ikr = activityC26853jkE.fetchVPNInfo;
            if (ikr == null) {
                Intrinsics.gEmmrt("");
                ikr = null;
            }
            C27224jrE c27224jrE = ikr.KWHzl;
            java.lang.String string = activityC26853jkE.getString(C25493ixk.FragmentManager.GQzpsZgQzpsZ);
            Intrinsics.checkNotNullExpressionValue(string, "");
            C27224jrE.setTitle$default(c27224jrE, string, investTipInfoVoKWHzl, null, 4, null);
        }
        java.util.List<InvestTokenWithAmount> listAEQbTJ = c23965iPx.AEQbTJ();
        if (listAEQbTJ != null) {
            iKR ikr2 = activityC26853jkE.fetchVPNInfo;
            if (ikr2 == null) {
                Intrinsics.gEmmrt("");
                ikr2 = null;
            }
            ikr2.KWHzl.setData(listAEQbTJ.isEmpty() ^ true ? listAEQbTJ.get(0) : new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null), listAEQbTJ.size() > 1 ? listAEQbTJ.get(1) : new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null), c23965iPx.djBIcL(), c23965iPx.EZpvd());
        }
        java.util.List<InvestTokenWithAmount> listOLrzqt = c23965iPx.OLrzqt();
        if (listOLrzqt != null) {
            iKS iks = activityC26853jkE.AkhnZx;
            if (iks == null) {
                Intrinsics.gEmmrt("");
                iks = null;
            }
            C27228jrI.setData$default(iks.EZpvd, listOLrzqt.isEmpty() ^ true ? listOLrzqt.get(0) : new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null), listOLrzqt.size() > 1 ? listOLrzqt.get(1) : new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null), c23965iPx.djBIcL(), c23965iPx.EZpvd(), false, 16, null);
            iKR ikr3 = activityC26853jkE.fetchVPNInfo;
            if (ikr3 == null) {
                Intrinsics.gEmmrt("");
                ikr3 = null;
            }
            ikr3.OLrzqt.setData(listOLrzqt.isEmpty() ^ true ? listOLrzqt.get(0) : new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null), listOLrzqt.size() > 1 ? listOLrzqt.get(1) : new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null), c23965iPx.djBIcL(), c23965iPx.EZpvd());
        }
        iKR ikr4 = activityC26853jkE.fetchVPNInfo;
        if (ikr4 == null) {
            Intrinsics.gEmmrt("");
            ikr4 = null;
        }
        C27224jrE c27224jrE2 = ikr4.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c27224jrE2, "");
        java.util.List<InvestTokenWithAmount> listCopydefault = c23965iPx.copydefault();
        c27224jrE2.setVisibility((listCopydefault == null || !(listCopydefault.isEmpty() ^ true)) ? 8 : 0);
        java.util.List<InvestTokenWithAmount> listCopydefault2 = c23965iPx.copydefault();
        if (listCopydefault2 != null) {
            iKR ikr5 = activityC26853jkE.fetchVPNInfo;
            if (ikr5 == null) {
                Intrinsics.gEmmrt("");
                ikr5 = null;
            }
            C27224jrE c27224jrE3 = ikr5.djBIcL;
            java.lang.String string2 = activityC26853jkE.getString(C25493ixk.FragmentManager.sRzUNh);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            C27224jrE.setTitle$default(c27224jrE3, string2, null, null, 6, null);
            iKR ikr6 = activityC26853jkE.fetchVPNInfo;
            if (ikr6 == null) {
                Intrinsics.gEmmrt("");
                ikr6 = null;
            }
            ikr6.djBIcL.setData(listCopydefault2.isEmpty() ^ true ? listCopydefault2.get(0) : null, listCopydefault2.size() > 1 ? listCopydefault2.get(1) : null, c23965iPx.djBIcL(), c23965iPx.EZpvd());
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC26853jkE activityC26853jkE, C23962iPu c23962iPu) {
        C23813iKg c23813iKg = activityC26853jkE.AuCTel;
        C23813iKg c23813iKg2 = null;
        if (c23813iKg == null) {
            Intrinsics.gEmmrt("");
            c23813iKg = null;
        }
        c23813iKg.KWHzl.setEnabled(c23962iPu.AEQbTJ());
        C23813iKg c23813iKg3 = activityC26853jkE.AuCTel;
        if (c23813iKg3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23813iKg2 = c23813iKg3;
        }
        c23813iKg2.KWHzl.setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.zDUObI));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ActivityC26853jkE activityC26853jkE, InvestRedeemReceiveInfoUIBean investRedeemReceiveInfoUIBean) {
        iKR ikr = activityC26853jkE.fetchVPNInfo;
        if (ikr == null) {
            Intrinsics.gEmmrt("");
            ikr = null;
        }
        C27172jqF c27172jqF = ikr.valueOf;
        Intrinsics.copydefault(investRedeemReceiveInfoUIBean);
        c27172jqF.setData(investRedeemReceiveInfoUIBean);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.jkE$StateListAnimator */
    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC24173iXp interfaceC24173iXp, Continuation<? super Unit> continuation) {
            C23815iKi c23815iKi = ActivityC26853jkE.this.DbNXlk;
            if (c23815iKi == null) {
                Intrinsics.gEmmrt("");
                c23815iKi = null;
            }
            c23815iKi.OLrzqt.setButtonState(interfaceC24173iXp);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.jkE$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(iXD ixd, Continuation<? super Unit> continuation) {
            ActivityC26853jkE.this.EZpvd(ixd);
            return Unit.INSTANCE;
        }
    }

    @Override // o.AbstractActivityC24051iTb
    public C27206jqn valueOf() {
        iKR ikr = this.fetchVPNInfo;
        if (ikr == null) {
            Intrinsics.gEmmrt("");
            ikr = null;
        }
        C27206jqn c27206jqn = ikr.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c27206jqn, "");
        return c27206jqn;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC24051iTb
    public void copydefault(@NotNull InvestTransactionModel investTransactionModel) {
        java.lang.Integer pushToastCode;
        Intrinsics.checkNotNullParameter(investTransactionModel, "");
        super.copydefault(investTransactionModel);
        android.os.Bundle bundleAhwBna = ((InvestUniv3RedeemViewModel) DbNXlk()).AhwBna();
        if (bundleAhwBna != null) {
            if ((C33129mqd.OLrzqt((java.lang.CharSequence) investTransactionModel.getTxHash()) && Intrinsics.EZpvd((java.lang.Object) investTransactionModel.getTxHash(), (java.lang.Object) bundleAhwBna.getString("tx_hash"))) || (C33129mqd.OLrzqt((java.lang.CharSequence) investTransactionModel.getUopHash()) && Intrinsics.EZpvd((java.lang.Object) investTransactionModel.getUopHash(), (java.lang.Object) bundleAhwBna.getString("tx_uop_hash")))) {
                java.lang.Integer pushToastCode2 = investTransactionModel.getPushToastCode();
                if ((pushToastCode2 != null && pushToastCode2.intValue() == 2) || ((pushToastCode = investTransactionModel.getPushToastCode()) != null && pushToastCode.intValue() == 5)) {
                    InvestUniv3RedeemViewModel.getReceiveInfoAndCheckState$default((InvestUniv3RedeemViewModel) DbNXlk(), null, 1, null);
                }
            }
        }
    }

    @Override // o.AbstractActivityC24051iTb
    public void fetchVPNInfo() {
        super.fetchVPNInfo();
        EZpvd(this.uzCIH, this.iwGUEr);
    }

    @Override // o.AbstractActivityC24051iTb
    public void OLrzqt(boolean z) {
        super.OLrzqt(z);
        iKM ikm = this.isConnected;
        if (ikm == null) {
            Intrinsics.gEmmrt("");
            ikm = null;
        }
        ikm.copydefault.OLrzqt(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void hDKMBd() {
        C23815iKi c23815iKi = this.DbNXlk;
        if (c23815iKi == null) {
            Intrinsics.gEmmrt("");
            c23815iKi = null;
        }
        c23815iKi.OLrzqt.AEQbTJ();
        ((InvestUniv3RedeemViewModel) DbNXlk()).zuBGHE();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(final iXD ixd) {
        java.lang.Throwable thOLrzqt;
        if (ixd instanceof iXD.ActionBar) {
            C27508jwX.startContractInteraction$default(C27508jwX.AEQbTJ, this, ((iXD.ActionBar) ixd).EZpvd(), new Function1() { // from class: o.jkJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC26853jkE.KWHzl(this.AEQbTJ, ixd, (android.os.Bundle) obj);
                }
            }, new Function1() { // from class: o.jkM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC26853jkE.AEQbTJ(ixd, (NewCallbackBean) obj);
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

    public static final Unit KWHzl(ActivityC26853jkE activityC26853jkE, iXD ixd, android.os.Bundle bundle) {
        activityC26853jkE.EZpvd(bundle, ((iXD.ActionBar) ixd).copydefault().getOrderType());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC58185ywX AEQbTJ(iXD ixd, NewCallbackBean newCallbackBean) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        iXD.ActionBar actionBar = (iXD.ActionBar) ixd;
        return actionBar.OLrzqt().invoke(newCallbackBean, actionBar.copydefault());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void EZpvd(android.os.Bundle bundle, int i) {
        C23815iKi c23815iKi = null;
        if (bundle == null || bundle.getInt("result") != -1) {
            C23815iKi c23815iKi2 = this.DbNXlk;
            if (c23815iKi2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23815iKi = c23815iKi2;
            }
            c23815iKi.OLrzqt.copydefault();
            return;
        }
        if (!InvestTradeManager.OLrzqt.AEQbTJ(i)) {
            C23815iKi c23815iKi3 = this.DbNXlk;
            if (c23815iKi3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23815iKi = c23815iKi3;
            }
            c23815iKi.OLrzqt.copydefault();
            AEQbTJ(bundle, ((InvestUniv3RedeemViewModel) DbNXlk()).fIwbmz());
            return;
        }
        C23815iKi c23815iKi4 = this.DbNXlk;
        if (c23815iKi4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23815iKi = c23815iKi4;
        }
        c23815iKi.OLrzqt.AEQbTJ();
        ((InvestUniv3RedeemViewModel) DbNXlk()).copydefault(bundle);
    }

    private final void AEQbTJ(android.os.Bundle bundle, InvestTradeManager.TransactionResultExtraData transactionResultExtraData) {
        C27508jwX.toTransactionResultPage$default(C27508jwX.AEQbTJ, this, bundle, transactionResultExtraData, 0, null, null, 28, null);
        finish();
    }

    @Override // o.AbstractActivityC26828jjg, o.AbstractActivityC24051iTb, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC26828jjg, o.AbstractActivityC24051iTb, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC26828jjg, o.AbstractActivityC24051iTb, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC26828jjg, o.AbstractActivityC24051iTb, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // o.AbstractActivityC26828jjg, o.AbstractActivityC24051iTb, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
