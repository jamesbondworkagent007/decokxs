package o;

import android.view.View;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse;
import com.okinc.unify_trade.biz.LmtOrderNumber;
import com.okinc.unify_trade.biz.SignalBotReq;
import com.okinc.unify_trade.biz.SlippageControl;
import com.okinc.unify_trade.biz.SmartPortfolioConfig;
import com.okinc.unify_trade.biz.SpotGridTpSlConfig;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.ThirdSignalDetail;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.bot.SmartEarnConfig;
import com.okinc.unify_trade.bot.signalbot.viewmodel.EntryOptionsSelectPresenter;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C55688xof;

/* JADX INFO: renamed from: o.vWz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class ActivityC50669vWz extends AbstractActivityC48163uHh<AbstractC48417uQs, EntryOptionsSelectPresenter> {
    public java.lang.String EZpvd = "USDT";
    public SignalBotReq gEmmrt = new SignalBotReq((java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (EntrySignalOrderAmtParam) null, (ExitSignalOrderAmtParam) null, false, (ThirdSignalDetail) null, false, (java.util.ArrayList) null, (java.lang.String) null, (AutoVipProfitInfo) null, 32767, (DefaultConstructorMarker) null);
    public StrategyConfigInfo AEQbTJ = new StrategyConfigInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (SpotGridTpSlConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (LmtOrderNumber) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (SmartEarnConfig) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (GridProfitAutoReinvestResponse) null, (SmartPortfolioConfig) null, (SlippageControl) null, -1, -1, 131071, (DefaultConstructorMarker) null);
    public final Function1<C52873wao, Unit> KWHzl = new Function1() { // from class: o.vWG
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return ActivityC50669vWz.EZpvd(this.AEQbTJ, (C52873wao) obj);
        }
    };
    public final Function1<C52873wao, Unit> OLrzqt = new Function1() { // from class: o.vWC
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return ActivityC50669vWz.AEQbTJ(this.KWHzl, (C52873wao) obj);
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC54499xKr
    public int AYXKKw() {
        return C48033uCm.Activity.aJFbMH;
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC33041mov
    public boolean getApplyNavigationBarInsets() {
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ EntryOptionsSelectPresenter AEQbTJ(ActivityC50669vWz activityC50669vWz) {
        return (EntryOptionsSelectPresenter) activityC50669vWz.gHZMYf();
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AhwBna();
        AEQbTJ();
        KWHzl();
        copydefault();
        gEmmrt();
        OLrzqt();
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void AhwBna() {
        java.lang.String stringExtra = getIntent().getStringExtra("coin");
        if (stringExtra == null) {
            stringExtra = "USDT";
        }
        this.EZpvd = stringExtra;
        SignalBotReq signalBotReq = (SignalBotReq) getIntent().getParcelableExtra("request");
        if (signalBotReq == null) {
            signalBotReq = new SignalBotReq((java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (EntrySignalOrderAmtParam) null, (ExitSignalOrderAmtParam) null, false, (ThirdSignalDetail) null, false, (java.util.ArrayList) null, (java.lang.String) null, (AutoVipProfitInfo) null, 32767, (DefaultConstructorMarker) null);
        }
        this.gEmmrt = signalBotReq;
        StrategyConfigInfo strategyConfigInfo = (StrategyConfigInfo) getIntent().getParcelableExtra("config");
        if (strategyConfigInfo == null) {
            strategyConfigInfo = new StrategyConfigInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (SpotGridTpSlConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (LmtOrderNumber) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (SmartEarnConfig) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (GridProfitAutoReinvestResponse) null, (SmartPortfolioConfig) null, (SlippageControl) null, -1, -1, 131071, (DefaultConstructorMarker) null);
        }
        this.AEQbTJ = strategyConfigInfo;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v24, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v28, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v31, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v33, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v35, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AEQbTJ() {
        java.lang.String deleType;
        java.lang.String amt;
        java.lang.String amtRatio;
        java.lang.String str;
        java.lang.String str2;
        TradeCoinInfo tradeCoinInfoAhwBna;
        java.util.List listSplit$default;
        java.util.List listSplit$default2;
        java.lang.String amtRatio2;
        ((EntryOptionsSelectPresenter) gHZMYf()).KWHzl(this.gEmmrt.getAllowMultipleEntry());
        EntryOptionsSelectPresenter entryOptionsSelectPresenter = (EntryOptionsSelectPresenter) gHZMYf();
        EntrySignalOrderAmtParam signalOrderAmtParam = this.gEmmrt.getSignalOrderAmtParam();
        if (signalOrderAmtParam == null || (deleType = signalOrderAmtParam.getDeleType()) == null) {
            deleType = "1";
        }
        entryOptionsSelectPresenter.AEQbTJ(deleType);
        EntryOptionsSelectPresenter entryOptionsSelectPresenter2 = (EntryOptionsSelectPresenter) gHZMYf();
        EntrySignalOrderAmtParam signalOrderAmtParam2 = this.gEmmrt.getSignalOrderAmtParam();
        java.lang.String str3 = "";
        if (signalOrderAmtParam2 == null || (amt = signalOrderAmtParam2.getAmt()) == null) {
            amt = "";
        }
        entryOptionsSelectPresenter2.OLrzqt(amt);
        EntryOptionsSelectPresenter entryOptionsSelectPresenter3 = (EntryOptionsSelectPresenter) gHZMYf();
        EntrySignalOrderAmtParam signalOrderAmtParam3 = this.gEmmrt.getSignalOrderAmtParam();
        if (signalOrderAmtParam3 == null || (amtRatio = signalOrderAmtParam3.getAmtRatio()) == null) {
            amtRatio = "";
        }
        entryOptionsSelectPresenter3.djBIcL(amtRatio);
        EntryOptionsSelectPresenter entryOptionsSelectPresenter4 = (EntryOptionsSelectPresenter) gHZMYf();
        EntrySignalOrderAmtParam signalOrderAmtParam4 = this.gEmmrt.getSignalOrderAmtParam();
        if (signalOrderAmtParam4 != null && (amtRatio2 = signalOrderAmtParam4.getAmtRatio()) != null) {
            str3 = amtRatio2;
        }
        entryOptionsSelectPresenter4.KWHzl(str3);
        ((EntryOptionsSelectPresenter) gHZMYf()).copydefault(this.gEmmrt.getLever());
        EntryOptionsSelectPresenter entryOptionsSelectPresenter5 = (EntryOptionsSelectPresenter) gHZMYf();
        java.lang.String minAvailablePercentage = this.AEQbTJ.getMinAvailablePercentage();
        if (minAvailablePercentage == null) {
            minAvailablePercentage = "0.0001";
        }
        entryOptionsSelectPresenter5.AhwBna(minAvailablePercentage);
        EntryOptionsSelectPresenter entryOptionsSelectPresenter6 = (EntryOptionsSelectPresenter) gHZMYf();
        java.lang.String maxAvailablePercentage = this.AEQbTJ.getMaxAvailablePercentage();
        if (maxAvailablePercentage == null) {
            maxAvailablePercentage = "1";
        }
        entryOptionsSelectPresenter6.gEmmrt(maxAvailablePercentage);
        EntryOptionsSelectPresenter entryOptionsSelectPresenter7 = (EntryOptionsSelectPresenter) gHZMYf();
        java.lang.String minInitialInvestmentPercentage = this.AEQbTJ.getMinInitialInvestmentPercentage();
        entryOptionsSelectPresenter7.DbNXlk(minInitialInvestmentPercentage != null ? minInitialInvestmentPercentage : "0.0001");
        EntryOptionsSelectPresenter entryOptionsSelectPresenter8 = (EntryOptionsSelectPresenter) gHZMYf();
        java.lang.String maxInitialInvestmentPercentage = this.AEQbTJ.getMaxInitialInvestmentPercentage();
        entryOptionsSelectPresenter8.AYXKKw(maxInitialInvestmentPercentage != null ? maxInitialInvestmentPercentage : "1");
        java.lang.String entrySettingsRatioRecommend = this.AEQbTJ.getEntrySettingsRatioRecommend();
        EntryOptionsSelectPresenter entryOptionsSelectPresenter9 = (EntryOptionsSelectPresenter) gHZMYf();
        if (entrySettingsRatioRecommend == null || (listSplit$default2 = StringsKt__StringsKt.split$default((java.lang.CharSequence) entrySettingsRatioRecommend, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null)) == null || (str = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(listSplit$default2)) == null) {
            str = "0.05";
        }
        entryOptionsSelectPresenter9.EZpvd(str);
        EntryOptionsSelectPresenter entryOptionsSelectPresenter10 = (EntryOptionsSelectPresenter) gHZMYf();
        if (entrySettingsRatioRecommend == null || (listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) entrySettingsRatioRecommend, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null)) == null || (str2 = (java.lang.String) CollectionsKt___CollectionsKt.wlaJM(listSplit$default)) == null) {
            str2 = "0.10";
        }
        entryOptionsSelectPresenter10.values(str2);
        ((EntryOptionsSelectPresenter) gHZMYf()).valueOf(this.EZpvd);
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        java.lang.String sizeDig = (interfaceC54581xNrCopydefault == null || (tradeCoinInfoAhwBna = interfaceC54581xNrCopydefault.AhwBna(((EntryOptionsSelectPresenter) gHZMYf()).AuCTel())) == null) ? null : tradeCoinInfoAhwBna.getSizeDig();
        ((EntryOptionsSelectPresenter) gHZMYf()).KWHzl(sizeDig != null ? C33129mqd.AhwBna(sizeDig) : 4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: Presenter */
    /* JADX DEBUG: Possible override for method o.xKr.OLrzqt()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt() {
        java.lang.String strDbNXlk = ((EntryOptionsSelectPresenter) gHZMYf()).DbNXlk();
        int iHashCode = strDbNXlk.hashCode();
        if (iHashCode == 50) {
            if (strDbNXlk.equals("2")) {
                ((AbstractC48417uQs) sSMYrx()).EZpvd.setInputContent(((EntryOptionsSelectPresenter) gHZMYf()).AkhnZx());
                ((AbstractC48417uQs) sSMYrx()).EZpvd.setAvaValue(((EntryOptionsSelectPresenter) gHZMYf()).getNewProxyInstance());
                return;
            }
            return;
        }
        if (iHashCode == 52) {
            if (strDbNXlk.equals("4")) {
                ((AbstractC48417uQs) sSMYrx()).AhwBna.setInputContent(((EntryOptionsSelectPresenter) gHZMYf()).hDKMBd());
            }
        } else if (iHashCode == 53 && strDbNXlk.equals("5")) {
            ((AbstractC48417uQs) sSMYrx()).AEQbTJ.setInputContent(((EntryOptionsSelectPresenter) gHZMYf()).valueOf());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [116=4] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault() {
        java.lang.String strDbNXlk = ((EntryOptionsSelectPresenter) gHZMYf()).DbNXlk();
        switch (strDbNXlk.hashCode()) {
            case 49:
                if (strDbNXlk.equals("1")) {
                    AbstractC48417uQs abstractC48417uQs = (AbstractC48417uQs) sSMYrx();
                    abstractC48417uQs.AhwBna.setSelect(false);
                    abstractC48417uQs.AEQbTJ.setSelect(false);
                    abstractC48417uQs.EZpvd.setSelect(false);
                    abstractC48417uQs.valueOf.setSelect(true);
                    break;
                }
                break;
            case 50:
                if (strDbNXlk.equals("2")) {
                    AbstractC48417uQs abstractC48417uQs2 = (AbstractC48417uQs) sSMYrx();
                    abstractC48417uQs2.AhwBna.setSelect(false);
                    abstractC48417uQs2.AEQbTJ.setSelect(false);
                    abstractC48417uQs2.EZpvd.setSelect(true);
                    abstractC48417uQs2.valueOf.setSelect(false);
                    break;
                }
                break;
            case 52:
                if (strDbNXlk.equals("4")) {
                    AbstractC48417uQs abstractC48417uQs3 = (AbstractC48417uQs) sSMYrx();
                    abstractC48417uQs3.AEQbTJ.setSelect(false);
                    abstractC48417uQs3.AhwBna.setSelect(true);
                    abstractC48417uQs3.AhwBna.copydefault();
                    abstractC48417uQs3.EZpvd.setSelect(false);
                    abstractC48417uQs3.valueOf.setSelect(false);
                    break;
                }
                break;
            case 53:
                if (strDbNXlk.equals("5")) {
                    AbstractC48417uQs abstractC48417uQs4 = (AbstractC48417uQs) sSMYrx();
                    abstractC48417uQs4.AhwBna.setSelect(false);
                    abstractC48417uQs4.AEQbTJ.setSelect(true);
                    abstractC48417uQs4.AEQbTJ.copydefault();
                    abstractC48417uQs4.EZpvd.setSelect(false);
                    abstractC48417uQs4.valueOf.setSelect(false);
                    break;
                }
                break;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v20, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v22, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v9, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: Presenter */
    /* JADX DEBUG: Possible override for method o.xKr.KWHzl()Ljava/lang/Class; */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl() {
        C52873wao c52873wao = ((AbstractC48417uQs) sSMYrx()).AhwBna;
        c52873wao.AEQbTJ(new Function1() { // from class: o.vWH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC50669vWz.valueOf(this.AEQbTJ, (android.view.View) obj);
            }
        });
        c52873wao.setRecommendText(((EntryOptionsSelectPresenter) gHZMYf()).fIwbmz(), ((EntryOptionsSelectPresenter) gHZMYf()).iwGUEr());
        c52873wao.setTitle(C33070mpX.AYXKKw(C55688xof.Application.postMessage));
        c52873wao.setInputViewConfig(C33070mpX.AYXKKw(C55688xof.Application.extraCommand), ((EntryOptionsSelectPresenter) gHZMYf()).getFieldNames(), java.lang.Integer.valueOf(((EntryOptionsSelectPresenter) gHZMYf()).ejfBZ()));
        C52873wao c52873wao2 = ((AbstractC48417uQs) sSMYrx()).AEQbTJ;
        c52873wao2.AEQbTJ(new Function1() { // from class: o.vWM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC50669vWz.gEmmrt(this.AEQbTJ, (android.view.View) obj);
            }
        });
        c52873wao2.setRecommendText(((EntryOptionsSelectPresenter) gHZMYf()).AEQbTJ(), ((EntryOptionsSelectPresenter) gHZMYf()).djBIcL());
        c52873wao2.setTitle(C33070mpX.AYXKKw(C55688xof.Application.updateVisuals));
        c52873wao2.setInputViewConfig(C33070mpX.AYXKKw(C55688xof.Application.extraCommand), ((EntryOptionsSelectPresenter) gHZMYf()).AhwBna(), java.lang.Integer.valueOf(((EntryOptionsSelectPresenter) gHZMYf()).OLrzqt()));
        C52870wal c52870wal = ((AbstractC48417uQs) sSMYrx()).EZpvd;
        c52870wal.AEQbTJ(new Function1() { // from class: o.vWB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC50669vWz.AhwBna(this.OLrzqt, (android.view.View) obj);
            }
        });
        c52870wal.setTitle(C33070mpX.AYXKKw(C55688xof.Application.requestPostMessageChannel));
        C52870wal.setInputViewConfig$default(c52870wal, C33070mpX.AYXKKw(C55688xof.Application.OBzZra), ((EntryOptionsSelectPresenter) gHZMYf()).AuCTel(), java.lang.Integer.valueOf(((EntryOptionsSelectPresenter) gHZMYf()).values()), false, 8, null);
        c52870wal.setAvaTextShow(true);
        c52870wal.setAvaValue("--");
        c52870wal.setHlAvaText(C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2Stub));
        C53420wlE c53420wlE = ((AbstractC48417uQs) sSMYrx()).valueOf;
        c53420wlE.AEQbTJ(new Function1() { // from class: o.vWA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC50669vWz.AYXKKw(this.AEQbTJ, (android.view.View) obj);
            }
        });
        c53420wlE.setTitle(C33070mpX.AYXKKw(C55688xof.Application.onScrollStateChanged));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit valueOf(ActivityC50669vWz activityC50669vWz, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ((EntryOptionsSelectPresenter) activityC50669vWz.gHZMYf()).AEQbTJ("4");
        activityC50669vWz.copydefault();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit gEmmrt(ActivityC50669vWz activityC50669vWz, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ((EntryOptionsSelectPresenter) activityC50669vWz.gHZMYf()).AEQbTJ("5");
        activityC50669vWz.copydefault();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vWz$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ ActivityC50669vWz EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ AbstractC48417uQs OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ActivityC50669vWz activityC50669vWz, AbstractC48417uQs abstractC48417uQs) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = activityC50669vWz;
            this.OLrzqt = abstractC48417uQs;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (ActivityC50669vWz.AEQbTJ(this.EZpvd).AubY().getFirst().booleanValue()) {
                    this.EZpvd.EZpvd();
                    ActivityC50669vWz activityC50669vWz = this.EZpvd;
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("data", this.EZpvd.gEmmrt);
                    Unit unit = Unit.INSTANCE;
                    activityC50669vWz.setResult(-1, intent);
                    this.EZpvd.finish();
                    return;
                }
                java.lang.String second = ActivityC50669vWz.AEQbTJ(this.EZpvd).AubY().getSecond();
                java.lang.String strDbNXlk = ActivityC50669vWz.AEQbTJ(this.EZpvd).DbNXlk();
                int iHashCode = strDbNXlk.hashCode();
                if (iHashCode == 50) {
                    if (strDbNXlk.equals("2")) {
                        this.OLrzqt.EZpvd.setInputError(second);
                    }
                } else if (iHashCode == 52) {
                    if (strDbNXlk.equals("4")) {
                        this.OLrzqt.AhwBna.setInputError(second);
                    }
                } else if (iHashCode == 53 && strDbNXlk.equals("5")) {
                    this.OLrzqt.AEQbTJ.setInputError(second);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AhwBna(ActivityC50669vWz activityC50669vWz, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ((EntryOptionsSelectPresenter) activityC50669vWz.gHZMYf()).AEQbTJ("2");
        activityC50669vWz.copydefault();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AYXKKw(ActivityC50669vWz activityC50669vWz, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ((EntryOptionsSelectPresenter) activityC50669vWz.gHZMYf()).AEQbTJ("1");
        activityC50669vWz.copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ActivityC50669vWz activityC50669vWz, C52873wao c52873wao) {
        Intrinsics.checkNotNullParameter(c52873wao, "");
        activityC50669vWz.KWHzl(c52873wao);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r11v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r11v14, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r11v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(C52873wao c52873wao) {
        c52873wao.KWHzl();
        ((EntryOptionsSelectPresenter) gHZMYf()).djBIcL(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c52873wao.EZpvd()) ? "" : C33129mqd.divS$default(c52873wao.EZpvd(), 100, 4, null, null, 12, null));
        if (((EntryOptionsSelectPresenter) gHZMYf()).EZpvd().getFirst().booleanValue()) {
            ((AbstractC48417uQs) sSMYrx()).AhwBna.setInputError("");
        } else {
            ((AbstractC48417uQs) sSMYrx()).AhwBna.setInputError(((EntryOptionsSelectPresenter) gHZMYf()).EZpvd().getSecond());
        }
    }

    public static final Unit AEQbTJ(ActivityC50669vWz activityC50669vWz, C52873wao c52873wao) {
        Intrinsics.checkNotNullParameter(c52873wao, "");
        activityC50669vWz.OLrzqt(c52873wao);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r11v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r11v14, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r11v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(C52873wao c52873wao) {
        c52873wao.KWHzl();
        ((EntryOptionsSelectPresenter) gHZMYf()).KWHzl(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c52873wao.EZpvd()) ? "" : C33129mqd.divS$default(c52873wao.EZpvd(), 100, 4, null, null, 12, null));
        if (((EntryOptionsSelectPresenter) gHZMYf()).copydefault().getFirst().booleanValue()) {
            ((AbstractC48417uQs) sSMYrx()).AEQbTJ.setInputError("");
        } else {
            ((AbstractC48417uQs) sSMYrx()).AEQbTJ.setInputError(((EntryOptionsSelectPresenter) gHZMYf()).copydefault().getSecond());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void gEmmrt() {
        final C52873wao c52873wao = ((AbstractC48417uQs) sSMYrx()).AhwBna;
        c52873wao.setFirstRecCallBack(new Function0() { // from class: o.vWx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC50669vWz.AEQbTJ(c52873wao, this);
            }
        });
        c52873wao.setSecondRecCallBack(new Function0() { // from class: o.vWE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC50669vWz.AhwBna(c52873wao, this);
            }
        });
        c52873wao.copydefault(this.KWHzl);
        final C52873wao c52873wao2 = ((AbstractC48417uQs) sSMYrx()).AEQbTJ;
        c52873wao2.setFirstRecCallBack(new Function0() { // from class: o.vWF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC50669vWz.gEmmrt(c52873wao2, this);
            }
        });
        c52873wao2.setSecondRecCallBack(new Function0() { // from class: o.vWI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC50669vWz.djBIcL(c52873wao2, this);
            }
        });
        c52873wao2.copydefault(this.OLrzqt);
        final C52870wal c52870wal = ((AbstractC48417uQs) sSMYrx()).EZpvd;
        c52870wal.setHlAvaClick(new Function0() { // from class: o.vWJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC50669vWz.EZpvd(c52870wal);
            }
        });
        c52870wal.copydefault(new Function2() { // from class: o.vWK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC50669vWz.EZpvd(this.OLrzqt, c52870wal, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        AbstractC48417uQs abstractC48417uQs = (AbstractC48417uQs) sSMYrx();
        abstractC48417uQs.AYXKKw.setChecked(((EntryOptionsSelectPresenter) gHZMYf()).isConnected());
        abstractC48417uQs.AYXKKw.setClickAction(new View.OnClickListener() { // from class: o.vWL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC50669vWz.djBIcL(this.AEQbTJ, view);
            }
        });
        C52794wYp c52794wYp = abstractC48417uQs.KWHzl;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this, abstractC48417uQs));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C52873wao c52873wao, ActivityC50669vWz activityC50669vWz) {
        c52873wao.OLrzqt();
        c52873wao.setInputContent(((EntryOptionsSelectPresenter) activityC50669vWz.gHZMYf()).fJNWhG());
        Intrinsics.copydefault(c52873wao);
        activityC50669vWz.KWHzl(c52873wao);
        c52873wao.copydefault(activityC50669vWz.KWHzl);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AhwBna(C52873wao c52873wao, ActivityC50669vWz activityC50669vWz) {
        c52873wao.OLrzqt();
        c52873wao.setInputContent(((EntryOptionsSelectPresenter) activityC50669vWz.gHZMYf()).uzCIH());
        Intrinsics.copydefault(c52873wao);
        activityC50669vWz.KWHzl(c52873wao);
        c52873wao.copydefault(activityC50669vWz.KWHzl);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit gEmmrt(C52873wao c52873wao, ActivityC50669vWz activityC50669vWz) {
        c52873wao.OLrzqt();
        c52873wao.setInputContent(((EntryOptionsSelectPresenter) activityC50669vWz.gHZMYf()).gEmmrt());
        Intrinsics.copydefault(c52873wao);
        activityC50669vWz.OLrzqt(c52873wao);
        c52873wao.copydefault(activityC50669vWz.OLrzqt);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit djBIcL(C52873wao c52873wao, ActivityC50669vWz activityC50669vWz) {
        c52873wao.OLrzqt();
        c52873wao.setInputContent(((EntryOptionsSelectPresenter) activityC50669vWz.gHZMYf()).AYXKKw());
        Intrinsics.copydefault(c52873wao);
        activityC50669vWz.OLrzqt(c52873wao);
        c52873wao.copydefault(activityC50669vWz.OLrzqt);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C52870wal c52870wal) {
        Intrinsics.copydefault(c52870wal);
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(C35334ntP.KWHzl(c52870wal));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.RYPzIz));
        java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C55688xof.Application.QWSkGZ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.vWD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC50669vWz.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
        return Unit.INSTANCE;
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(ActivityC50669vWz activityC50669vWz, C52870wal c52870wal, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        c47988uAv.copydefault();
        EntryOptionsSelectPresenter entryOptionsSelectPresenter = (EntryOptionsSelectPresenter) activityC50669vWz.gHZMYf();
        if (str == null) {
            str = "";
        }
        entryOptionsSelectPresenter.OLrzqt(str);
        c52870wal.setAvaValue(((EntryOptionsSelectPresenter) activityC50669vWz.gHZMYf()).getNewProxyInstance());
        if (((EntryOptionsSelectPresenter) activityC50669vWz.gHZMYf()).KWHzl().getFirst().booleanValue()) {
            ((AbstractC48417uQs) activityC50669vWz.sSMYrx()).EZpvd.setInputError("");
        } else {
            ((AbstractC48417uQs) activityC50669vWz.sSMYrx()).EZpvd.setInputError(((EntryOptionsSelectPresenter) activityC50669vWz.gHZMYf()).KWHzl().getSecond());
        }
        return Unit.INSTANCE;
    }

    public static final void djBIcL(ActivityC50669vWz activityC50669vWz, android.view.View view) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(C35334ntP.KWHzl(activityC50669vWz));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.OFnBcz));
        java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C55688xof.Application.QWSkGZ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.vWy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                ActivityC50669vWz.copydefault(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [320=4] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v15, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v18, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: Presenter */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd() {
        this.gEmmrt.setAllowMultipleEntry(((AbstractC48417uQs) sSMYrx()).AYXKKw.OLrzqt());
        EntrySignalOrderAmtParam signalOrderAmtParam = this.gEmmrt.getSignalOrderAmtParam();
        if (signalOrderAmtParam != null) {
            signalOrderAmtParam.setDeleType(((EntryOptionsSelectPresenter) gHZMYf()).DbNXlk());
        }
        java.lang.String strDbNXlk = ((EntryOptionsSelectPresenter) gHZMYf()).DbNXlk();
        switch (strDbNXlk.hashCode()) {
            case 49:
                if (strDbNXlk.equals("1")) {
                    EntrySignalOrderAmtParam signalOrderAmtParam2 = this.gEmmrt.getSignalOrderAmtParam();
                    if (signalOrderAmtParam2 != null) {
                        signalOrderAmtParam2.setAmt(null);
                    }
                    EntrySignalOrderAmtParam signalOrderAmtParam3 = this.gEmmrt.getSignalOrderAmtParam();
                    if (signalOrderAmtParam3 != null) {
                        signalOrderAmtParam3.setAmtRatio(null);
                    }
                    break;
                }
                break;
            case 50:
                if (strDbNXlk.equals("2")) {
                    EntrySignalOrderAmtParam signalOrderAmtParam4 = this.gEmmrt.getSignalOrderAmtParam();
                    if (signalOrderAmtParam4 != null) {
                        signalOrderAmtParam4.setAmt(((EntryOptionsSelectPresenter) gHZMYf()).AkhnZx());
                    }
                    EntrySignalOrderAmtParam signalOrderAmtParam5 = this.gEmmrt.getSignalOrderAmtParam();
                    if (signalOrderAmtParam5 != null) {
                        signalOrderAmtParam5.setAmtRatio(null);
                    }
                    break;
                }
                break;
            case 52:
                if (strDbNXlk.equals("4")) {
                    EntrySignalOrderAmtParam signalOrderAmtParam6 = this.gEmmrt.getSignalOrderAmtParam();
                    if (signalOrderAmtParam6 != null) {
                        signalOrderAmtParam6.setAmt(null);
                    }
                    EntrySignalOrderAmtParam signalOrderAmtParam7 = this.gEmmrt.getSignalOrderAmtParam();
                    if (signalOrderAmtParam7 != null) {
                        signalOrderAmtParam7.setAmtRatio(((EntryOptionsSelectPresenter) gHZMYf()).fARcdN());
                    }
                    break;
                }
                break;
            case 53:
                if (strDbNXlk.equals("5")) {
                    EntrySignalOrderAmtParam signalOrderAmtParam8 = this.gEmmrt.getSignalOrderAmtParam();
                    if (signalOrderAmtParam8 != null) {
                        signalOrderAmtParam8.setAmt(null);
                    }
                    EntrySignalOrderAmtParam signalOrderAmtParam9 = this.gEmmrt.getSignalOrderAmtParam();
                    if (signalOrderAmtParam9 != null) {
                        signalOrderAmtParam9.setAmtRatio(((EntryOptionsSelectPresenter) gHZMYf()).fetchVPNInfo());
                    }
                    break;
                }
                break;
        }
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
