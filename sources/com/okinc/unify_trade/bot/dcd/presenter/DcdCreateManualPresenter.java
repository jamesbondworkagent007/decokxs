package com.okinc.unify_trade.bot.dcd.presenter;

import androidx.core.view.InputDeviceCompat;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.Transformations;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.DcdRecommendedParams;
import com.okinc.unify_trade.biz.MinStrikePxResp;
import com.okinc.unify_trade.biz.ProductItemResp;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.DcdProductListReq;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.dcd.presenter.DcdCreateManualPresenter;
import com.okinc.unify_trade.bot.main.base.BaseBotOrderPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC54531xLw;
import o.C33070mpX;
import o.C33129mqd;
import o.C54589xNz;
import o.C55276xgr;
import o.C55688xof;
import o.C55849xrh;
import o.C55857xrp;
import o.C56033xvF;
import o.C56111xwe;
import o.InterfaceC54501xKt;
import o.InterfaceC54581xNr;
import o.xAA;
import o.xAB;
import o.xAC;
import o.xAG;
import o.xKK;
import o.xMR;
import o.xMS;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class DcdCreateManualPresenter extends BaseBotOrderPresenter {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final xAC AEQbTJ;
    public final C56111xwe<String> AYXKKw;
    public String AhwBna;
    public String AkhnZx;
    public String AuCTel;
    public final C56111xwe<List<DcdRecommendedParams>> DbNXlk;
    public final C56111xwe<List<ProductItemResp>> EZpvd;
    public String OLrzqt;
    public final LiveData<ArrayList<TacticsInsideItemData>> copydefault;
    public String djBIcL;
    public final xAG ejfBZ;
    public final LiveData<ArrayList<TacticsInsideItemData>> fARcdN;
    public final xAA fetchVPNInfo;
    public String gEmmrt;
    public final xAB isConnected;
    public String valueOf;
    public final C56111xwe<String> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AYXKKw(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<List<DcdRecommendedParams>> AkhnZx() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xAG AuCTel() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xAB DbNXlk() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<List<ProductItemResp>> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xAC KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void djBIcL(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<ArrayList<TacticsInsideItemData>> fIwbmz() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<String> fetchVPNInfo() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xAA isConnected() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<ArrayList<TacticsInsideItemData>> valueOf() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<String> values() {
        return this.values;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DcdCreateManualPresenter(@NotNull android.app.Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.gEmmrt = "";
        this.OLrzqt = "";
        this.djBIcL = "";
        this.valueOf = "";
        this.AhwBna = TacticsUiConst.ActionBar.EZpvd.copydefault();
        this.AkhnZx = "";
        this.AuCTel = "";
        this.AEQbTJ = new xAC();
        C56111xwe<List<ProductItemResp>> c56111xwe = new C56111xwe<>();
        this.EZpvd = c56111xwe;
        this.copydefault = Transformations.map(c56111xwe, new Function1() { // from class: o.xrq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DcdCreateManualPresenter.AEQbTJ(this.EZpvd, (java.util.List) obj);
            }
        });
        this.fetchVPNInfo = new xAA();
        this.values = new C56111xwe<>();
        this.ejfBZ = new xAG();
        C56111xwe<List<DcdRecommendedParams>> c56111xwe2 = new C56111xwe<>();
        this.DbNXlk = c56111xwe2;
        this.fARcdN = Transformations.map(c56111xwe2, new Function1() { // from class: o.xru
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DcdCreateManualPresenter.copydefault(this.KWHzl, (java.util.List) obj);
            }
        });
        this.isConnected = new xAB();
        this.AYXKKw = new C56111xwe<>();
    }

    public static final ArrayList AEQbTJ(DcdCreateManualPresenter dcdCreateManualPresenter, List list) {
        C55849xrh c55849xrh = new C55849xrh();
        c55849xrh.KWHzl(dcdCreateManualPresenter.fvQaOB().gEmmrt());
        Intrinsics.copydefault(list);
        return c55849xrh.KWHzl(list);
    }

    public static final ArrayList copydefault(DcdCreateManualPresenter dcdCreateManualPresenter, List list) {
        C55857xrp c55857xrp = new C55857xrp();
        c55857xrp.KWHzl(dcdCreateManualPresenter.fvQaOB().gEmmrt());
        c55857xrp.OLrzqt(dcdCreateManualPresenter.AhwBna);
        Intrinsics.copydefault(list);
        return c55857xrp.KWHzl(list);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.dcd.presenter.DcdCreateManualPresenter.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void KWHzl(String str, String str2) {
        if (C33129mqd.OLrzqt((CharSequence) str)) {
            Intrinsics.copydefault((Object) str);
        } else {
            str = "0.01";
        }
        this.djBIcL = str;
        if (C33129mqd.OLrzqt((CharSequence) str2)) {
            Intrinsics.copydefault((Object) str2);
        } else {
            str2 = "35";
        }
        this.valueOf = str2;
    }

    public final void AEQbTJ() {
        String tradeSymbol;
        String quoteSymbol;
        BizInstrument bizInstrumentAhwBna = fvQaOB().AhwBna();
        String str = "";
        if (bizInstrumentAhwBna == null || (tradeSymbol = bizInstrumentAhwBna.getTradeSymbol()) == null) {
            tradeSymbol = "";
        }
        this.gEmmrt = tradeSymbol;
        BizInstrument bizInstrumentAhwBna2 = fvQaOB().AhwBna();
        if (bizInstrumentAhwBna2 != null && (quoteSymbol = bizInstrumentAhwBna2.getQuoteSymbol()) != null) {
            str = quoteSymbol;
        }
        this.OLrzqt = str;
    }

    public final void ejfBZ() {
        if (this.gEmmrt.length() == 0 || this.OLrzqt.length() == 0 || C33129mqd.valueOf(this.djBIcL, 0) || C33129mqd.valueOf(this.valueOf, 0) || C33129mqd.gEmmrt(this.AkhnZx, "0.001") || C33129mqd.AEQbTJ(this.AkhnZx, "0.50")) {
            this.EZpvd.setValue(new ArrayList());
            return;
        }
        DcdProductListReq dcdProductListReq = new DcdProductListReq(null, fvQaOB().gEmmrt(), fvQaOB().djBIcL(), this.gEmmrt, this.OLrzqt, "PUT", null, this.djBIcL, this.valueOf, this.AkhnZx, 65, null);
        xAC xac = this.AEQbTJ;
        xac.OLrzqt(dcdProductListReq);
        xac.AEQbTJ(this.EZpvd);
        xKK.Activity.execute$default(xac, 0L, 1, null);
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AkhnZx = C33129mqd.divS$default(str, 100, null, null, null, 14, null);
    }

    public final boolean OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.valueOf(str, C33129mqd.mulS$default("0.50", 100, null, null, null, 14, null));
    }

    public final boolean AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.copydefault(str, C33129mqd.mulS$default("0.001", 100, null, null, null, 14, null));
    }

    public final String KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return xMR.copydefault.copydefault(C33129mqd.mulS$default(str, 100, 1, null, null, 12, null));
    }

    public final void fJNWhG() {
        xAB xab = this.isConnected;
        xab.EZpvd(this.gEmmrt);
        xab.copydefault(this.OLrzqt);
        xab.AEQbTJ("PUT");
        xab.djBIcL();
        xab.OLrzqt(this.AYXKKw, new TaskDescription());
        xKK.Activity.execute$default(xab, 0L, 1, null);
    }

    public static final class TaskDescription implements InterfaceC54501xKt<List<? extends MinStrikePxResp>, String> {
        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public String KWHzl(List<MinStrikePxResp> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return ((MinStrikePxResp) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getStrike();
        }
    }

    public final void uzCIH() {
        if (StringsKt__StringsKt.fARcdN((CharSequence) this.gEmmrt) || StringsKt__StringsKt.fARcdN((CharSequence) this.OLrzqt) || C33129mqd.OLrzqt((Object) this.AuCTel, (Object) 0) || C33129mqd.OLrzqt((Object) this.djBIcL, (Object) 0) || C33129mqd.OLrzqt((Object) this.valueOf, (Object) 0)) {
            this.values.setValue("0");
            return;
        }
        DcdProductListReq dcdProductListReq = new DcdProductListReq(null, fvQaOB().gEmmrt(), fvQaOB().djBIcL(), this.gEmmrt, this.OLrzqt, "PUT", this.AuCTel, this.djBIcL, this.valueOf, null, InputDeviceCompat.SOURCE_DPAD, null);
        xAA xaa = this.fetchVPNInfo;
        xaa.copydefault(dcdProductListReq);
        xaa.OLrzqt(this.values, new Application());
        xKK.Activity.execute$default(xaa, 0L, 1, null);
    }

    public static final class Application implements InterfaceC54501xKt<List<? extends ProductItemResp>, String> {
        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public String KWHzl(List<ProductItemResp> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return C33129mqd.gEmmrt(Integer.valueOf(list.size()));
        }
    }

    public final void iwGUEr() {
        if (this.gEmmrt.length() == 0 || this.OLrzqt.length() == 0 || C33129mqd.valueOf(this.djBIcL, 0) || C33129mqd.valueOf(this.valueOf, 0)) {
            this.DbNXlk.setValue(new ArrayList());
            return;
        }
        String str = this.AhwBna;
        TacticsUiConst.ActionBar actionBar = TacticsUiConst.ActionBar.EZpvd;
        if (Intrinsics.EZpvd((Object) str, (Object) actionBar.copydefault()) && (C33129mqd.gEmmrt(this.AkhnZx, "0.001") || C33129mqd.AEQbTJ(this.AkhnZx, "0.50"))) {
            this.DbNXlk.setValue(new ArrayList());
            return;
        }
        if (Intrinsics.EZpvd((Object) this.AhwBna, (Object) actionBar.AEQbTJ()) && C33129mqd.OLrzqt((Object) this.AuCTel, (Object) 0)) {
            this.DbNXlk.setValue(new ArrayList());
            return;
        }
        DcdProductListReq dcdProductListReq = new DcdProductListReq(this.AhwBna, fvQaOB().gEmmrt(), fvQaOB().djBIcL(), this.gEmmrt, this.OLrzqt, "PUT", null, this.djBIcL, this.valueOf, null, 576, null);
        String str2 = this.AhwBna;
        if (Intrinsics.EZpvd((Object) str2, (Object) actionBar.copydefault())) {
            dcdProductListReq.setStrikePercentage(this.AkhnZx);
        } else if (Intrinsics.EZpvd((Object) str2, (Object) actionBar.AEQbTJ())) {
            dcdProductListReq.setStrike(this.AuCTel);
        }
        xAG xag = this.ejfBZ;
        xag.OLrzqt(dcdProductListReq);
        xag.AEQbTJ(this.DbNXlk);
        xKK.Activity.execute$default(xag, 0L, 1, null);
    }

    public final int fARcdN() {
        String strFIwbmz;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        String instFamily;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(fvQaOB().djBIcL())) == null) {
            strFIwbmz = null;
        } else {
            BizInstrument bizInstrumentAhwBna = fvQaOB().AhwBna();
            if (bizInstrumentAhwBna == null || (instFamily = bizInstrumentAhwBna.getInstFamily()) == null) {
                instFamily = "";
            }
            strFIwbmz = abstractC54531xLwOLrzqt.fIwbmz(instFamily);
        }
        return C33129mqd.AhwBna(strFIwbmz);
    }

    public final String AEQbTJ(boolean z) {
        String value = this.AYXKKw.getValue();
        if (value == null || StringsKt__StringsKt.fARcdN((CharSequence) value)) {
            return "";
        }
        String strGEmmrt = fvQaOB().gEmmrt();
        String value2 = this.AYXKKw.getValue();
        return C56033xvF.getBotPrice$default("SPOT", strGEmmrt, value2 == null ? "" : value2, z, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
    }

    public final void copydefault(@NotNull String str) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        String instFamily;
        String strValueOf;
        String strGEmmrt;
        String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt("SPOT")) != null) {
            BizInstrument bizInstrumentAhwBna = fvQaOB().AhwBna();
            if (bizInstrumentAhwBna == null || (instFamily = bizInstrumentAhwBna.getInstFamily()) == null) {
                instFamily = "";
            }
            xMS xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(instFamily);
            if (xmsGEmmrt != null && (strValueOf = xmsGEmmrt.valueOf(str)) != null && (strGEmmrt = C33129mqd.gEmmrt(strValueOf)) != null) {
                str2 = strGEmmrt;
            }
        }
        this.AuCTel = str2;
    }

    public final boolean OLrzqt() {
        return C33129mqd.copydefault(this.AuCTel, this.AYXKKw.getValue());
    }

    public final List<C55276xgr> copydefault() {
        ArrayList arrayList = new ArrayList();
        String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.hrjNmC);
        TacticsUiConst.ActionBar actionBar = TacticsUiConst.ActionBar.EZpvd;
        arrayList.add(new C55276xgr(strAYXKKw, actionBar.copydefault(), C33070mpX.AYXKKw(C55688xof.Application.YqksP), Intrinsics.EZpvd((Object) this.AhwBna, (Object) actionBar.copydefault()), false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null));
        arrayList.add(new C55276xgr(C33070mpX.AYXKKw(C55688xof.Application.iPSTqm), actionBar.AEQbTJ(), C33070mpX.AYXKKw(C55688xof.Application.cBPFI), Intrinsics.EZpvd((Object) this.AhwBna, (Object) actionBar.AEQbTJ()), false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null));
        return arrayList;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.AEQbTJ, this.isConnected, this.fetchVPNInfo, this.ejfBZ);
    }
}
