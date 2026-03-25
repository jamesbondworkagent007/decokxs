package com.okinc.unified.shared;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.dexkline.dex.api.bean.CoinDetailRedirection;
import com.okinc.dexkline.dex.api.bean.TokenBase;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unified.BusinessType;
import com.okinc.unified.data.CeDeFiData;
import com.okinc.unified.data.CeFiData;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC49411unz;
import o.AbstractC54531xLw;
import o.C43248rlh;
import o.C55483xkm;
import o.C56390yDp;
import o.InterfaceC49425uoM;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;
import o.xUD;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class CeDeFiSharedViewModel extends AbstractC49411unz<C55483xkm> {
    public final MutableStateFlow<CeFiData> AEQbTJ;
    public BizInstrument AYXKKw;
    public final StateFlow<CeFiData> AhwBna;
    public TokenBase DbNXlk;
    public final MutableStateFlow<Pair<String, BusinessType>> EZpvd;
    public final StateFlow<CeDeFiData> KWHzl;
    public final StateFlow<Pair<String, BusinessType>> OLrzqt;
    public final MutableStateFlow<CeDeFiData> copydefault;
    public boolean djBIcL;
    public MutableLiveData<Boolean> gEmmrt;
    public MarketCoinInfo valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Pair<String, BusinessType>> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<CeFiData> EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<CeDeFiData> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.djBIcL = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketCoinInfo djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenBase valueOf() {
        return this.DbNXlk;
    }

    @yCM
    public CeDeFiSharedViewModel() {
        super(new C55483xkm(null, 1, null));
        MutableStateFlow<CeFiData> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<CeDeFiData> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow2;
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Pair<String, BusinessType>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(C56390yDp.OLrzqt("", null));
        this.EZpvd = MutableStateFlow3;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow3);
        this.gEmmrt = new MutableLiveData<>();
    }

    public final void copydefault(MarketCoinInfo marketCoinInfo) {
        this.valueOf = marketCoinInfo;
        KWHzl(marketCoinInfo);
    }

    public final String KWHzl() {
        String instrumentId;
        MarketCoinInfo marketCoinInfo = this.valueOf;
        return (marketCoinInfo == null || (instrumentId = marketCoinInfo.getInstrumentId()) == null) ? "" : instrumentId;
    }

    public final String copydefault() {
        String instrumentType;
        MarketCoinInfo marketCoinInfo = this.valueOf;
        return (marketCoinInfo == null || (instrumentType = marketCoinInfo.getInstrumentType()) == null) ? "" : instrumentType;
    }

    public final void AEQbTJ(MarketCoinInfo marketCoinInfo, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, String str6, String str7, String str8) {
        copydefault(marketCoinInfo);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CeDeFiSharedViewModel$setCeFiData$1(this, marketCoinInfo, str, str2, str3, str4, str5, z, z2, str6, str7, str8, null), 3, null);
    }

    public final void EZpvd(MarketCoinInfo marketCoinInfo) {
        copydefault(marketCoinInfo);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CeDeFiSharedViewModel$updateCeFiData$1(this, marketCoinInfo, null), 3, null);
    }

    public final void KWHzl(TokenBase tokenBase, String str, CoinDetailRedirection coinDetailRedirection, String str2, boolean z, String str3, String str4, String str5) {
        this.DbNXlk = tokenBase;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CeDeFiSharedViewModel$setDeFiData$1(this, tokenBase, str, coinDetailRedirection, str2, z, str3, str4, str5, null), 3, null);
    }

    public final void KWHzl(@NotNull CeDeFiData ceDeFiData) {
        Intrinsics.checkNotNullParameter(ceDeFiData, "");
        this.DbNXlk = ceDeFiData.AhwBna();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CeDeFiSharedViewModel$setDeFiData$2(this, ceDeFiData, null), 3, null);
    }

    public final void EZpvd(@NotNull String str, @NotNull BusinessType businessType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(businessType, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CeDeFiSharedViewModel$setCurrentBusinessType$1(this, str, businessType, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(MarketCoinInfo marketCoinInfo) {
        BizInstrument bizInstrumentValueOf;
        if (marketCoinInfo == null) {
            bizInstrumentValueOf = null;
        } else {
            InterfaceC54581xNr interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43248rlh.KWHzl.AEQbTJ(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER)).copydefault();
            if (interfaceC54581xNrCopydefault == null || (bizInstrumentValueOf = InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, marketCoinInfo.getInstrumentType(), marketCoinInfo.getInstrumentId(), null, null, 12, null)) == null) {
                AbstractC54531xLw abstractC54531xLwKWHzl = xUD.KWHzl(marketCoinInfo.getInstrumentType());
                if (abstractC54531xLwKWHzl != null) {
                    bizInstrumentValueOf = abstractC54531xLwKWHzl.valueOf(marketCoinInfo.getInstrumentId());
                }
            }
        }
        this.AYXKKw = bizInstrumentValueOf;
    }
}
