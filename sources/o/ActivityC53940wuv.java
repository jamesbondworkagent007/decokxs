package o;

import android.view.KeyEvent;
import android.view.View;
import android.widget.CompoundButton;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.view.ViewGroupKt;
import androidx.lifecycle.Observer;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.bot.config.GridStopTriggerType;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.presenter.GridTpSlPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.ActivityC50475vPu;
import o.C48033uCm;
import o.C55688xof;
import o.InterfaceC54581xNr;
import o.vFP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wuv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class ActivityC53940wuv extends AbstractActivityC48163uHh<uTF, GridTpSlPresenter> {
    public TacticsData valueOf;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;
    public final ActivityResultLauncher<android.content.Intent> KWHzl = AEQbTJ();
    public final ActivityResultLauncher<android.content.Intent> EZpvd = EZpvd();
    public final boolean OLrzqt = true;

    /* JADX INFO: renamed from: o.wuv$StateListAnimator */
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
    @Override // o.AbstractActivityC54499xKr
    public int AYXKKw() {
        return C48033uCm.Activity.siEkQe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC33041mov
    public boolean getApplyNavigationBarInsets() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ uTF KWHzl(ActivityC53940wuv activityC53940wuv) {
        return (uTF) activityC53940wuv.sSMYrx();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ GridTpSlPresenter OLrzqt(ActivityC53940wuv activityC53940wuv) {
        return (GridTpSlPresenter) activityC53940wuv.gHZMYf();
    }

    /* JADX INFO: renamed from: o.wuv$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wuv.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void EZpvd(@NotNull android.content.Context context, @NotNull TacticsData tacticsData) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(tacticsData, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC53940wuv.class);
            intent.putExtra("bot_order_data", tacticsData);
            context.startActivity(intent);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.os.Bundle extras;
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        this.valueOf = (intent == null || (extras = intent.getExtras()) == null) ? null : (TacticsData) extras.getParcelable("bot_order_data");
        ((GridTpSlPresenter) gHZMYf()).KWHzl(this.valueOf);
        ((GridTpSlPresenter) gHZMYf()).QKVWgx();
        valueOf();
        fetchVPNInfo();
        OLrzqt();
        DbNXlk();
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void valueOf() {
        ((uTF) sSMYrx()).OLrzqt.setTitle(C33070mpX.AYXKKw(C55688xof.Application.setShuffleModeEnabledRemoved));
        isConnected();
        KWHzl();
        djBIcL();
        AhwBna();
        copydefault();
        gEmmrt();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void isConnected() {
        ((uTF) sSMYrx()).KWHzl.setTag(GridStopTriggerType.MANUAL_STOP.getMode());
        ((uTF) sSMYrx()).AEQbTJ.setTag(GridStopTriggerType.PRICE.getMode());
        ((uTF) sSMYrx()).AYXKKw.setTag(GridStopTriggerType.RSI_14.getMode());
        ((uTF) sSMYrx()).valueOf.setTag(GridStopTriggerType.TRADINGVIEW.getMode());
        AdvancedTriggerSign advancedTriggerSignFIwbmz = ((GridTpSlPresenter) gHZMYf()).fIwbmz();
        OLrzqt(advancedTriggerSignFIwbmz != null ? advancedTriggerSignFIwbmz.getTriggerStrategy() : null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Presenter */
    /* JADX DEBUG: Possible override for method o.xKr.KWHzl()Ljava/lang/Class; */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl() {
        ((uTF) sSMYrx()).KWHzl.setTitle(C33070mpX.AYXKKw(GridStopTriggerType.MANUAL_STOP.getDesc()));
        C53420wlE c53420wlE = ((uTF) sSMYrx()).KWHzl;
        Intrinsics.checkNotNullExpressionValue(c53420wlE, "");
        c53420wlE.setVisibility(((GridTpSlPresenter) gHZMYf()).zsXlph() ? 0 : 8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v16, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v18, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v20, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void djBIcL() {
        C53567wnt c53567wnt = ((uTF) sSMYrx()).AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c53567wnt, "");
        c53567wnt.setVisibility(((GridTpSlPresenter) gHZMYf()).zLjUOn() ? 0 : 8);
        C53567wnt c53567wnt2 = ((uTF) sSMYrx()).AEQbTJ;
        Intrinsics.copydefault(c53567wnt2);
        if (c53567wnt2.getVisibility() == 0) {
            final java.lang.String strFARcdN = ((GridTpSlPresenter) gHZMYf()).fARcdN();
            c53567wnt2.copydefault(C33070mpX.AYXKKw(C55688xof.Application.ActionBar), strFARcdN, "", java.lang.Integer.valueOf(((GridTpSlPresenter) gHZMYf()).isConnected()), ((GridTpSlPresenter) gHZMYf()).AuCTelauCTel());
            c53567wnt2.AEQbTJ(new yHO() { // from class: o.wuB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return ActivityC53940wuv.OLrzqt(this.AEQbTJ, strFARcdN, (C47988uAv) obj, (java.lang.String) obj2, ((java.lang.Boolean) obj3).booleanValue());
                }
            });
            c53567wnt2.KWHzl(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsGetMultipleContentsCompanion), ((GridTpSlPresenter) gHZMYf()).djBIcL(), ((GridTpSlPresenter) gHZMYf()).AYXKKw(), java.lang.Integer.valueOf(((GridTpSlPresenter) gHZMYf()).AhwBna()), ((GridTpSlPresenter) gHZMYf()).uzCIH());
            c53567wnt2.EZpvd(new yHO() { // from class: o.wuA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return ActivityC53940wuv.OLrzqt(this.KWHzl, (C47988uAv) obj, (java.lang.String) obj2, ((java.lang.Boolean) obj3).booleanValue());
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r9v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.Object OLrzqt(ActivityC53940wuv activityC53940wuv, java.lang.String str, C47988uAv c47988uAv, java.lang.String str2, boolean z) {
        java.lang.String strKWHzl = "";
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        pUU.EZpvd(activityC53940wuv.getTAG(), "stopTriggerPrice: " + str2 + " " + str);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = null;
        if (interfaceC54581xNrOLrzqt != null) {
            TacticsData tacticsData = activityC53940wuv.valueOf;
            java.lang.String instType = tacticsData != null ? tacticsData.getInstType() : null;
            java.lang.String str3 = instType == null ? "" : instType;
            TacticsData tacticsData2 = activityC53940wuv.valueOf;
            suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str3, tacticsData2 != null ? tacticsData2.getInstId() : null, null, null, 12, null);
        }
        if (str2 != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) {
            strKWHzl = C56033xvF.KWHzl(str2, suggestedInstrument$default);
        }
        ((GridTpSlPresenter) activityC53940wuv.gHZMYf()).KWHzl(strKWHzl);
        return ((GridTpSlPresenter) activityC53940wuv.gHZMYf()).AEQbTJ(strKWHzl, z).getSecond();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.Object OLrzqt(ActivityC53940wuv activityC53940wuv, C47988uAv c47988uAv, java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (str == null) {
            str = "";
        }
        pUU.EZpvd(activityC53940wuv.getTAG(), "stopDelay: " + str);
        ((GridTpSlPresenter) activityC53940wuv.gHZMYf()).AEQbTJ(str);
        return ((GridTpSlPresenter) activityC53940wuv.gHZMYf()).OLrzqt(str).getSecond();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v14, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v16, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AhwBna() {
        C53570wnw c53570wnw = ((uTF) sSMYrx()).AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c53570wnw, "");
        c53570wnw.setVisibility(((GridTpSlPresenter) gHZMYf()).AxsJAY() ? 0 : 8);
        final C53570wnw c53570wnw2 = ((uTF) sSMYrx()).AYXKKw;
        Intrinsics.copydefault(c53570wnw2);
        if (c53570wnw2.getVisibility() == 0) {
            c53570wnw2.setRsiEnable(((GridTpSlPresenter) gHZMYf()).AubY());
            c53570wnw2.setRsiEditListener(new View.OnClickListener() { // from class: o.wuG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC53940wuv.EZpvd(this.AEQbTJ, c53570wnw2, view);
                }
            });
            c53570wnw2.KWHzl(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsGetMultipleContentsCompanion), ((GridTpSlPresenter) gHZMYf()).djBIcL(), ((GridTpSlPresenter) gHZMYf()).AYXKKw(), java.lang.Integer.valueOf(((GridTpSlPresenter) gHZMYf()).AhwBna()), ((GridTpSlPresenter) gHZMYf()).uzCIH());
            c53570wnw2.KWHzl(new Function2() { // from class: o.wuI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return ActivityC53940wuv.copydefault(this.EZpvd, (C47988uAv) obj, (java.lang.String) obj2);
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r11v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(ActivityC53940wuv activityC53940wuv, C53570wnw c53570wnw, android.view.View view) {
        java.lang.String instId;
        TacticsData tacticsData = activityC53940wuv.valueOf;
        java.lang.String orderType = tacticsData != null ? tacticsData.getOrderType() : null;
        java.lang.String str = "";
        if (Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "grid")) {
            ActivityC50475vPu.Application application = ActivityC50475vPu.Companion;
            android.content.Context context = c53570wnw.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            AdvancedTriggerSign advancedTriggerSignFJNWhG = ((GridTpSlPresenter) activityC53940wuv.gHZMYf()).fJNWhG();
            TacticsData tacticsData2 = activityC53940wuv.valueOf;
            activityC53940wuv.KWHzl.launch(ActivityC50475vPu.Application.getIntent$default(application, context, advancedTriggerSignFJNWhG, null, tacticsData2 != null ? tacticsData2.getOrderType() : null, 4, null));
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "contract_grid")) {
            vFP.Application application2 = vFP.Companion;
            android.content.Context context2 = c53570wnw.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            TacticsData tacticsData3 = activityC53940wuv.valueOf;
            if (tacticsData3 != null && (instId = tacticsData3.getInstId()) != null) {
                str = instId;
            }
            activityC53940wuv.EZpvd.launch(application2.OLrzqt(context2, str, ((GridTpSlPresenter) activityC53940wuv.gHZMYf()).fJNWhG()));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.Object copydefault(ActivityC53940wuv activityC53940wuv, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (str == null) {
            str = "";
        }
        pUU.EZpvd(activityC53940wuv.getTAG(), "stopDelay: " + str);
        ((GridTpSlPresenter) activityC53940wuv.gHZMYf()).AEQbTJ(str);
        return ((GridTpSlPresenter) activityC53940wuv.gHZMYf()).OLrzqt(str).getSecond();
    }

    /* JADX INFO: renamed from: o.wuv$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ ActivityC53940wuv EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ActivityC53940wuv activityC53940wuv) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = activityC53940wuv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (ActivityC53940wuv.KWHzl(this.EZpvd).AEQbTJ.OLrzqt() && ActivityC53940wuv.KWHzl(this.EZpvd).AYXKKw.OLrzqt()) {
                    ActivityC53940wuv.OLrzqt(this.EZpvd).EZpvd();
                    if (ActivityC53940wuv.OLrzqt(this.EZpvd).values()) {
                        GridTpSlPresenter.adjustCondition$default(ActivityC53940wuv.OLrzqt(this.EZpvd), null, 1, null);
                    } else {
                        this.EZpvd.finish();
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault() {
        C53420wlE c53420wlE = ((uTF) sSMYrx()).valueOf;
        Intrinsics.checkNotNullExpressionValue(c53420wlE, "");
        c53420wlE.setVisibility(((GridTpSlPresenter) gHZMYf()).OcIXYQ() ? 0 : 8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void gEmmrt() {
        final uTF utf = (uTF) sSMYrx();
        boolean zHDKMBd = ((GridTpSlPresenter) gHZMYf()).hDKMBd();
        android.view.View view = utf.copydefault;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(zHDKMBd ? 0 : 8);
        C53425wlJ c53425wlJ = utf.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c53425wlJ, "");
        c53425wlJ.setVisibility(zHDKMBd ? 0 : 8);
        utf.AhwBna.setTitle(((GridTpSlPresenter) gHZMYf()).getNewProxyInstance());
        utf.AhwBna.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.wuH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                ActivityC53940wuv.EZpvd(this.EZpvd, utf, compoundButton, z);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(ActivityC53940wuv activityC53940wuv, uTF utf, android.widget.CompoundButton compoundButton, boolean z) {
        java.lang.String str = z ? "1" : "2";
        ((GridTpSlPresenter) activityC53940wuv.gHZMYf()).AYXKKw(str);
        utf.AhwBna.setWarning(((GridTpSlPresenter) activityC53940wuv.gHZMYf()).DTwDnp());
        pUU.KWHzl(activityC53940wuv.getTAG(), "stopType change to " + str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    private final void OLrzqt(java.lang.String str) {
        android.widget.LinearLayout linearLayout = ((uTF) sSMYrx()).djBIcL;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        for (android.view.View view : ViewGroupKt.getChildren(linearLayout)) {
            InterfaceC50054vAe interfaceC50054vAe = view instanceof InterfaceC50054vAe ? (InterfaceC50054vAe) view : null;
            if (interfaceC50054vAe != null) {
                interfaceC50054vAe.setSelect(Intrinsics.EZpvd(view.getTag(), (java.lang.Object) str));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v9, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v14, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v8, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fetchVPNInfo() {
        AdvancedTriggerSign advancedTriggerSignFIwbmz = ((GridTpSlPresenter) gHZMYf()).fIwbmz();
        java.lang.String triggerStrategy = advancedTriggerSignFIwbmz != null ? advancedTriggerSignFIwbmz.getTriggerStrategy() : null;
        if (Intrinsics.EZpvd((java.lang.Object) triggerStrategy, (java.lang.Object) GridStopTriggerType.PRICE.getMode())) {
            ((uTF) sSMYrx()).AEQbTJ.setFirstContent(((GridTpSlPresenter) gHZMYf()).OLrzqt(this.valueOf));
            ((uTF) sSMYrx()).AEQbTJ.setSecondContent(((GridTpSlPresenter) gHZMYf()).wlaJM());
        } else if (Intrinsics.EZpvd((java.lang.Object) triggerStrategy, (java.lang.Object) GridStopTriggerType.RSI_14.getMode())) {
            ((uTF) sSMYrx()).AYXKKw.setRsiContent(((GridTpSlPresenter) gHZMYf()).zuBGHE(), ((GridTpSlPresenter) gHZMYf()).sSMYrx(), ((GridTpSlPresenter) gHZMYf()).AwvSrB(), ((GridTpSlPresenter) gHZMYf()).gHZMYf());
            ((uTF) sSMYrx()).AYXKKw.setFirstContent(((GridTpSlPresenter) gHZMYf()).wlaJM());
        }
        C53425wlJ c53425wlJ = ((uTF) sSMYrx()).AhwBna;
        c53425wlJ.setChecked(Intrinsics.EZpvd((java.lang.Object) (advancedTriggerSignFIwbmz != null ? advancedTriggerSignFIwbmz.getStopType() : null), (java.lang.Object) "1"));
        c53425wlJ.setWarning(((GridTpSlPresenter) gHZMYf()).DTwDnp());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void OLrzqt() {
        android.widget.LinearLayout linearLayout = ((uTF) sSMYrx()).djBIcL;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        for (KeyEvent.Callback callback : ViewGroupKt.getChildren(linearLayout)) {
            InterfaceC50054vAe interfaceC50054vAe = callback instanceof InterfaceC50054vAe ? (InterfaceC50054vAe) callback : null;
            if (interfaceC50054vAe != null) {
                interfaceC50054vAe.AEQbTJ(new Function1() { // from class: o.wuz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ActivityC53940wuv.EZpvd(this.KWHzl, (android.view.View) obj);
                    }
                });
            }
        }
        ((uTF) sSMYrx()).AhwBna.setClickAction(new View.OnClickListener() { // from class: o.wuD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC53940wuv.KWHzl(this.EZpvd, view);
            }
        });
        C52794wYp c52794wYp = ((uTF) sSMYrx()).EZpvd;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(ActivityC53940wuv activityC53940wuv, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        java.lang.Object tag = view.getTag();
        java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        if (str != null) {
            activityC53940wuv.OLrzqt(str);
            ((GridTpSlPresenter) activityC53940wuv.gHZMYf()).gEmmrt(str);
            activityC53940wuv.fetchVPNInfo();
            pUU.EZpvd(activityC53940wuv.getTAG(), "stop type change to : " + str);
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(ActivityC53940wuv activityC53940wuv, android.view.View view) {
        java.lang.String strAYXKKw;
        TacticsData tacticsData = activityC53940wuv.valueOf;
        java.lang.String orderType = tacticsData != null ? tacticsData.getOrderType() : null;
        if (Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "grid")) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.OptIn);
        } else {
            strAYXKKw = Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "contract_grid") ? C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsPickMultipleVisualMedia) : "";
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(C35334ntP.KWHzl(activityC53940wuv));
        viewOnClickListenerC54939xaY.EZpvd(strAYXKKw);
        java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C55688xof.Application.QWSkGZ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.wuu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                ActivityC53940wuv.copydefault(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void DbNXlk() {
        ((GridTpSlPresenter) gHZMYf()).AkhnZx().observe(this, new StateListAnimator(new Function1() { // from class: o.wuE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC53940wuv.EZpvd(this.EZpvd, (ResponseData) obj);
            }
        }));
        ((GridTpSlPresenter) gHZMYf()).getAggregateLoadingLiveData().observe(this, new StateListAnimator(new Function1() { // from class: o.wuJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC53940wuv.copydefault(this.KWHzl, (androidx.core.util.Pair) obj);
            }
        }));
        ((GridTpSlPresenter) gHZMYf()).getAggregateErrorLiveData().observe(this, new StateListAnimator(new Function1() { // from class: o.wuM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC53940wuv.OLrzqt(this.copydefault, (androidx.core.util.Pair) obj);
            }
        }));
        ((GridTpSlPresenter) gHZMYf()).valueOf().observe(this, new StateListAnimator(new Function1() { // from class: o.wuN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC53940wuv.copydefault(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final Unit EZpvd(ActivityC53940wuv activityC53940wuv, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        C55326xho.toastWithSuccessfulIcon$default(C55688xof.Application.onMultiWindowModeChanged, 0, 1, (java.lang.Object) null);
        activityC53940wuv.finish();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(ActivityC53940wuv activityC53940wuv, androidx.core.util.Pair pair) {
        if (Intrinsics.EZpvd((java.lang.Object) pair.first, (java.lang.Object) ((GridTpSlPresenter) activityC53940wuv.gHZMYf()).fetchVPNInfo().bB_())) {
            if (Intrinsics.EZpvd(pair.second, java.lang.Boolean.TRUE)) {
                activityC53940wuv.showLoading();
            } else {
                activityC53940wuv.dismissLoading();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(ActivityC53940wuv activityC53940wuv, androidx.core.util.Pair pair) {
        java.lang.String message;
        if (Intrinsics.EZpvd((java.lang.Object) pair.first, (java.lang.Object) ((GridTpSlPresenter) activityC53940wuv.gHZMYf()).fetchVPNInfo().bB_()) && (message = ((java.lang.Exception) pair.second).getMessage()) != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(ActivityC53940wuv activityC53940wuv, java.lang.Boolean bool) {
        ((uTF) activityC53940wuv.sSMYrx()).EZpvd.setEnabled(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((GridTpSlPresenter) gHZMYf()).RJOkX();
    }

    public final ActivityResultLauncher<android.content.Intent> AEQbTJ() {
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.wuC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC53940wuv.copydefault(this.EZpvd, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        return activityResultLauncherRegisterForActivityResult;
    }

    public static final void copydefault(ActivityC53940wuv activityC53940wuv, ActivityResult activityResult) {
        Intrinsics.copydefault(activityResult);
        activityC53940wuv.EZpvd(activityResult);
    }

    public final ActivityResultLauncher<android.content.Intent> EZpvd() {
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.wuF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC53940wuv.EZpvd(this.KWHzl, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        return activityResultLauncherRegisterForActivityResult;
    }

    public static final void EZpvd(ActivityC53940wuv activityC53940wuv, ActivityResult activityResult) {
        Intrinsics.copydefault(activityResult);
        activityC53940wuv.EZpvd(activityResult);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(ActivityResult activityResult) {
        android.content.Intent data;
        android.os.Bundle extras;
        AdvancedTriggerSign advancedTriggerSign;
        if (activityResult.getResultCode() != -1 || (data = activityResult.getData()) == null || (extras = data.getExtras()) == null || (advancedTriggerSign = (AdvancedTriggerSign) extras.getParcelable("trigger_sign")) == null) {
            return;
        }
        ((GridTpSlPresenter) gHZMYf()).OLrzqt(advancedTriggerSign);
        fetchVPNInfo();
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
