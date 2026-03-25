package com.okinc.unify_trade.bot.signalbot.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.EmptyResp;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import com.okinc.unify_trade.bot.data.SignalBotEditStrategyBean;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C54240xBb;
import o.C54507xKz;
import o.C55688xof;
import o.C56111xwe;
import o.C56235xyw;
import o.C56390yDp;
import o.C56423yEv;
import o.C56424yEw;
import o.xKK;
import o.xMR;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class ExitOptionsSelectPresenter extends AbsPresenter {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final TradeLiveData<List<EmptyResp>> AEQbTJ;
    public String AYXKKw;
    public String AhwBna;
    public final C56111xwe<StrategyConfigInfo> EZpvd;
    public final C56235xyw KWHzl;
    public final C54240xBb copydefault;
    public String djBIcL;
    public String gEmmrt;
    public String valueOf;
    public String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54240xBb AhwBna() {
        return this.copydefault;
    }

    public final int AkhnZx() {
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<EmptyResp>> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fARcdN() {
        return "%";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<StrategyConfigInfo> gEmmrt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
    }

    public final int isConnected() {
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void valueOf(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.values = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return "%";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.signalbot.viewmodel.ExitOptionsSelectPresenter.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExitOptionsSelectPresenter(@NotNull android.app.Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.copydefault = new C54240xBb();
        this.AEQbTJ = new TradeLiveData<>();
        this.KWHzl = new C56235xyw();
        this.EZpvd = new C56111xwe<>();
        this.values = "1";
        this.djBIcL = "2";
        this.gEmmrt = "";
        this.AYXKKw = "";
        this.AhwBna = "0.001";
        this.valueOf = "0.001";
    }

    public final String ejfBZ() {
        return StringsKt__StringsKt.fARcdN((CharSequence) this.gEmmrt) ? "" : C33129mqd.mulS$default(this.gEmmrt, 100, 2, null, null, 12, null);
    }

    public final String DbNXlk() {
        return StringsKt__StringsKt.fARcdN((CharSequence) this.AYXKKw) ? "" : C33129mqd.mulS$default(this.AYXKKw, 100, 2, null, null, 12, null);
    }

    public final String AuCTel() {
        if (Intrinsics.EZpvd((Object) this.djBIcL, (Object) "2")) {
            return C33070mpX.AYXKKw(C55688xof.Application.dispatchMediaButtonEvent);
        }
        return C33070mpX.AYXKKw(C55688xof.Application.AnimatorRes);
    }

    public final List<TradeMenuItemBean> fIwbmz() {
        boolean zEZpvd = Intrinsics.EZpvd((Object) this.djBIcL, (Object) "2");
        return yDY.gEmmrt(new TradeMenuItemBean(C33070mpX.AYXKKw(C55688xof.Application.dispatchMediaButtonEvent), zEZpvd, "2", null, false, null, null, 0, false, null, 0, false, 0, null, null, 32760, null), new TradeMenuItemBean(C33070mpX.AYXKKw(C55688xof.Application.AnimatorRes), !zEZpvd, "1", null, false, null, null, 0, false, null, 0, false, 0, null, null, 32760, null));
    }

    public final Pair<Boolean, String> copydefault() {
        if (StringsKt__StringsKt.fARcdN((CharSequence) this.gEmmrt)) {
            return new Pair<>(Boolean.TRUE, "");
        }
        if (C33129mqd.copydefault(this.gEmmrt, this.AhwBna)) {
            return new Pair<>(Boolean.TRUE, "");
        }
        return new Pair<>(Boolean.FALSE, C33069mpW.copydefault(C55688xof.Application.ActivityResultContractsPickVisualMediaCompanion, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.onBackPressed)), C56390yDp.OLrzqt("lowLimit", xMR.formatPercent$default(xMR.copydefault, this.AhwBna, 2, 0, null, 8, null)))));
    }

    public final Pair<Boolean, String> AEQbTJ() {
        if (StringsKt__StringsKt.fARcdN((CharSequence) this.AYXKKw)) {
            return new Pair<>(Boolean.TRUE, "");
        }
        if (C33129mqd.copydefault(this.AYXKKw, this.valueOf)) {
            return new Pair<>(Boolean.TRUE, "");
        }
        return new Pair<>(Boolean.FALSE, C33069mpW.copydefault(C55688xof.Application.ActivityResultContractsPickVisualMediaCompanion, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.getLifecycle)), C56390yDp.OLrzqt("lowLimit", xMR.formatPercent$default(xMR.copydefault, this.valueOf, 2, 0, null, 8, null)))));
    }

    public final boolean fJNWhG() {
        String str = this.values;
        if (!Intrinsics.EZpvd((Object) str, (Object) "1") && Intrinsics.EZpvd((Object) str, (Object) "2")) {
            return KWHzl().getFirst().booleanValue() && OLrzqt().getFirst().booleanValue();
        }
        return true;
    }

    public final Pair<Boolean, String> KWHzl() {
        String strCopydefault;
        if (StringsKt__StringsKt.fARcdN((CharSequence) this.gEmmrt) && StringsKt__StringsKt.fARcdN((CharSequence) this.AYXKKw)) {
            strCopydefault = C33069mpW.copydefault(C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", C33070mpX.AYXKKw(C55688xof.Application.onBackPressed))));
        } else {
            strCopydefault = ((StringsKt__StringsKt.fARcdN((CharSequence) this.gEmmrt) ^ true) && C33129mqd.gEmmrt(this.gEmmrt, this.AhwBna)) ? C33069mpW.copydefault(C55688xof.Application.ActivityResultContractsPickVisualMediaCompanion, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.onBackPressed)), C56390yDp.OLrzqt("lowLimit", xMR.formatPercent$default(xMR.copydefault, this.AhwBna, 2, 0, null, 8, null)))) : "";
        }
        if (C33129mqd.OLrzqt((CharSequence) strCopydefault)) {
            return new Pair<>(Boolean.FALSE, strCopydefault);
        }
        return new Pair<>(Boolean.TRUE, "");
    }

    public final Pair<Boolean, String> OLrzqt() {
        String strCopydefault;
        if (StringsKt__StringsKt.fARcdN((CharSequence) this.gEmmrt) && StringsKt__StringsKt.fARcdN((CharSequence) this.AYXKKw)) {
            strCopydefault = C33069mpW.copydefault(C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", C33070mpX.AYXKKw(C55688xof.Application.getLifecycle))));
        } else {
            strCopydefault = ((StringsKt__StringsKt.fARcdN((CharSequence) this.AYXKKw) ^ true) && C33129mqd.gEmmrt(this.AYXKKw, this.valueOf)) ? C33069mpW.copydefault(C55688xof.Application.ActivityResultContractsPickVisualMediaCompanion, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.getLifecycle)), C56390yDp.OLrzqt("lowLimit", xMR.formatPercent$default(xMR.copydefault, this.valueOf, 2, 0, null, 8, null)))) : "";
        }
        if (C33129mqd.OLrzqt((CharSequence) strCopydefault)) {
            return new Pair<>(Boolean.FALSE, strCopydefault);
        }
        return new Pair<>(Boolean.TRUE, "");
    }

    public final void OLrzqt(@NotNull String str, ExitSignalOrderAmtParam exitSignalOrderAmtParam) {
        Intrinsics.checkNotNullParameter(str, "");
        C54240xBb c54240xBb = this.copydefault;
        c54240xBb.KWHzl(new SignalBotEditStrategyBean(str, (List) null, exitSignalOrderAmtParam, 2, (DefaultConstructorMarker) null));
        c54240xBb.AEQbTJ(this.AEQbTJ);
        xKK.Activity.execute$default(c54240xBb, 0L, 1, null);
    }

    public final void AEQbTJ(String str) {
        C56235xyw c56235xyw = this.KWHzl;
        c56235xyw.KWHzl("signal_bot");
        if (str == null) {
            str = "BTC-USDT-SWAP";
        }
        c56235xyw.AEQbTJ(str);
        c56235xyw.djBIcL();
        c56235xyw.OLrzqt(this.EZpvd, new C54507xKz());
        xKK.Activity.execute$default(c56235xyw, 0L, 1, null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.copydefault, this.KWHzl);
    }
}
