package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.TradeLiveData;
import com.okinc.tradingbot.impl.market_place.bot_copy.bean.CopyBotReqParam;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoEarnStakingQueryConfig;
import com.okinc.unify_trade.biz.BotLeverConfig;
import com.okinc.unify_trade.biz.ExtraActualMarginResp;
import com.okinc.unify_trade.biz.LiquidatePriceResponse;
import com.okinc.unify_trade.biz.LossInsurance;
import com.okinc.unify_trade.biz.MpStgyInfo;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.bot.data.BotGuideData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vkj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC51317vkj {
    public final TradeLiveData<java.util.List<MpStgyInfo>> AuCTelauCTel;
    public final C56111xwe<java.lang.String> AubY;
    public final C56111xwe<java.lang.String> ejfBZ;
    public final C55887xsS fARcdN;
    public final TradeLiveData<LossInsurance> fIwbmz;
    public final C56111xwe<ExtraActualMarginResp> fJNWhG;
    public final C56111xwe<java.lang.String> getFieldNames;
    public final MutableLiveData<BotLeverConfig> getNewProxyInstance;
    public final C56111xwe<java.lang.String> hDKMBd;
    public final C56111xwe<LiquidatePriceResponse> iwGUEr;
    public final C56111xwe<java.util.List<StrategyResponse>> uzCIH;

    public abstract java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    public abstract kotlin.Pair<java.lang.Boolean, java.lang.String> AEQbTJ(@NotNull CopyBotReqParam copyBotReqParam);

    public abstract java.lang.String AYXKKw();

    public abstract java.lang.String AYXKKw(@NotNull java.lang.String str);

    public abstract java.lang.String AkhnZx();

    public abstract xKK AuCTelauCTel();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MutableLiveData<BotLeverConfig> AubY() {
        return this.getNewProxyInstance;
    }

    public void AxsJAYaxsJAY() {
    }

    public abstract java.util.List<java.lang.String> DbNXlk();

    public abstract java.util.ArrayList<java.lang.Object> EZpvd(@NotNull java.lang.String str);

    public void EZpvd(boolean z) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String KWHzl(java.lang.String str, java.lang.String str2) {
        return "";
    }

    public abstract void KWHzl(@NotNull CopyBotReqParam copyBotReqParam, boolean z);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    public abstract java.lang.String OLrzqt(@NotNull java.lang.String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    public abstract java.util.List<xKK> QbewEr();

    public abstract java.lang.String QfsBiF();

    public abstract void RcXXUw();

    public abstract void aKErDB();

    public void bw_() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    public void copydefault(boolean z) {
    }

    public abstract BotGuideData djBIcL();

    public abstract void djSkpj();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<ExtraActualMarginResp> dvKsVJ() {
        return this.fJNWhG;
    }

    public abstract void dxcTrN();

    public abstract int ejfBZ();

    public abstract java.util.ArrayList<java.lang.Object> fARcdN();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55887xsS fFgQHt() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<LossInsurance> fZBcTu() {
        return this.fIwbmz;
    }

    public abstract android.os.Parcelable fetchVPNInfo();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<java.lang.String> finit() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<java.lang.String> flVtFt() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<java.util.List<StrategyResponse>> fvQaOB() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<java.lang.String> gGvvIC() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<LiquidatePriceResponse> gasjUx() {
        return this.iwGUEr;
    }

    public abstract java.lang.String getFieldNames();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<java.lang.String> giSNqX() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<java.util.List<MpStgyInfo>> hUfVAv() {
        return this.AuCTelauCTel;
    }

    public abstract int isConnected();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String p_(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "";
    }

    public abstract java.lang.String values();

    public abstract java.util.ArrayList<java.lang.Object> wlaJM();

    public abstract java.lang.String zsXlph();

    public AbstractC51317vkj(@NotNull TradeLiveData<java.util.List<MpStgyInfo>> tradeLiveData) {
        Intrinsics.checkNotNullParameter(tradeLiveData, "");
        this.AuCTelauCTel = tradeLiveData;
        this.uzCIH = new C56111xwe<>();
        this.getFieldNames = new C56111xwe<>();
        this.hDKMBd = new C56111xwe<>();
        this.ejfBZ = new C56111xwe<>();
        this.AubY = new C56111xwe<>();
        this.iwGUEr = new C56111xwe<>();
        this.getNewProxyInstance = new MutableLiveData<>();
        this.fIwbmz = new TradeLiveData<>();
        this.fJNWhG = new C56111xwe<>();
        this.fARcdN = new C55887xsS("", "");
    }

    public C55887xsS copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.fARcdN.valueOf(str2);
        this.fARcdN.djBIcL(str);
        return this.fARcdN;
    }

    public MutableLiveData<AutoEarnStakingQueryConfig> gkJEwt() {
        return new MutableLiveData<>();
    }

    public MutableLiveData<StrategyConfigInfo> AhwBna() {
        return new MutableLiveData<>();
    }

    public static /* synthetic */ void order$default(AbstractC51317vkj abstractC51317vkj, CopyBotReqParam copyBotReqParam, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: order");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        abstractC51317vkj.KWHzl(copyBotReqParam, z);
    }

    public kotlin.Pair<java.lang.Boolean, java.lang.String> iRxXKY() {
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, "");
    }

    public static /* synthetic */ void onLeverChange$default(AbstractC51317vkj abstractC51317vkj, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onLeverChange");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        abstractC51317vkj.KWHzl(str, z);
    }

    public static /* synthetic */ void onAmtChange$default(AbstractC51317vkj abstractC51317vkj, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAmtChange");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        abstractC51317vkj.copydefault(str, z);
    }

    public static /* synthetic */ void onExtraAmtChange$default(AbstractC51317vkj abstractC51317vkj, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onExtraAmtChange");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        abstractC51317vkj.OLrzqt(str, z);
    }

    public static /* synthetic */ void onAutoReservedCheckedChange$default(AbstractC51317vkj abstractC51317vkj, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAutoReservedCheckedChange");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        abstractC51317vkj.copydefault(z);
    }

    public static /* synthetic */ void setAutoReserve$default(AbstractC51317vkj abstractC51317vkj, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAutoReserve");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        abstractC51317vkj.EZpvd(z);
    }
}
