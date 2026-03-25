package com.okinc.business.dexlogic.main.swap.trade.input.helper;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexDefaultFromToTokenShowVO;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.main.swap.trade.bean.EditTextData;
import com.okinc.business.dexlogic.main.swap.trade.bean.ExchangeRateData;
import com.okinc.business.dexlogic.main.swap.trade.bean.FromToBalance;
import com.okinc.business.dexlogic.main.swap.trade.bean.ImageTextData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C22332hdP;
import o.C23274hvD;
import o.C23311hvo;
import o.C33050mpD;
import o.C33070mpX;
import o.C33129mqd;
import o.InterfaceC22425hfC;
import o.InterfaceC22824hme;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public class InitTradeGroup {
    public static final int $stable = 8;
    private final String INIT_AMOUNT;
    private Object destroyKey;
    private final boolean isLimit;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitTradeGroup() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getINIT_AMOUNT() {
        return this.INIT_AMOUNT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isLimit() {
        return this.isLimit;
    }

    public InitTradeGroup(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.INIT_AMOUNT = str;
        this.isLimit = z;
        this.destroyKey = new Object();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("1") : (r1v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(java.lang.String, boolean):void (m)] (LINE:29) call: com.okinc.business.dexlogic.main.swap.trade.input.helper.InitTradeGroup.<init>(java.lang.String, boolean):void type: THIS */
    public /* synthetic */ InitTradeGroup(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "1" : str, (i & 2) != 0 ? false : z);
    }

    public static /* synthetic */ TradeInputData initFromData$default(InitTradeGroup initTradeGroup, DexMultiTokenInfoBean dexMultiTokenInfoBean, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initFromData");
        }
        if ((i & 2) != 0) {
            str = "";
        }
        return initTradeGroup.initFromData(dexMultiTokenInfoBean, str);
    }

    public final TradeInputData initFromData(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull String str) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = StringsKt__StringsKt.fARcdN((CharSequence) str) ? "" : str;
        return new TradeInputData(new FromToBalance(getFromTitle(), null, C22332hdP.EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.DsrFlB)), null, null, null, true, false, null, null, null, 1978, null), new ImageTextData(C22332hdP.EZpvd(dexMultiTokenInfoBean.getTokenSymbol()), 0, C22332hdP.EZpvd(dexMultiTokenInfoBean.getTokenLogoUrl()), C22332hdP.EZpvd(dexMultiTokenInfoBean.getChainLogoUrl()), dexMultiTokenInfoBean), new EditTextData(str2.length() != 0 ? C23311hvo.AEQbTJ(str2) : "", null, str, null, 0, true, false, null, null, false, null, null, null, false, false, 32730, null), false, 8, null);
    }

    public final TradeInputData initToData(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        return new TradeInputData(new FromToBalance(getToTitle(), null, null, null, null, null, false, false, null, null, null, 2046, null), new ImageTextData(C22332hdP.EZpvd(dexMultiTokenInfoBean.getTokenSymbol()), 0, C22332hdP.EZpvd(dexMultiTokenInfoBean.getTokenLogoUrl()), C22332hdP.EZpvd(dexMultiTokenInfoBean.getChainLogoUrl()), dexMultiTokenInfoBean), new EditTextData(null, null, null, null, 0, true, false, null, null, false, null, null, null, false, false, 32735, null), false, 8, null);
    }

    public static /* synthetic */ TradeInputData initFromData$default(InitTradeGroup initTradeGroup, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initFromData");
        }
        if ((i & 1) != 0) {
            str = "";
        }
        return initTradeGroup.initFromData(str);
    }

    public final TradeInputData initFromData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String s$default = StringsKt__StringsKt.fARcdN((CharSequence) str) ? "" : C33129mqd.formatS$default(str, 6, null, null, 6, null);
        return new TradeInputData(new FromToBalance(getFromTitle(), null, C22332hdP.EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.DsrFlB)), null, null, null, true, false, null, null, null, 1978, null), new ImageTextData(C22332hdP.EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.ULRxlR)), 0, null, null, null, 30, null), new EditTextData(s$default.length() != 0 ? C23311hvo.AEQbTJ(s$default) : "", null, s$default, null, 0, true, false, null, null, false, null, null, null, false, false, 32730, null), false, 8, null);
    }

    public final TradeInputData initToData() {
        return new TradeInputData(new FromToBalance(getToTitle(), null, null, null, null, null, false, false, null, null, null, 2046, null), new ImageTextData(C22332hdP.EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.ULRxlR)), 0, null, null, null, 30, null), new EditTextData(null, null, null, null, 0, true, false, null, null, false, null, null, null, false, false, 32735, null), false, 8, null);
    }

    public final ExchangeRateData initChangeRate() {
        return new ExchangeRateData("", "");
    }

    public final TradeInputData resetFromData() {
        return new TradeInputData(new FromToBalance(getFromTitle(), null, C22332hdP.EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.DsrFlB)), null, null, null, true, false, null, null, null, 1978, null), new ImageTextData(C22332hdP.EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.IntentSenderRequestCompanionCREATOR1)), 0, null, null, null, 30, null), new EditTextData(null, null, null, null, 0, true, false, null, null, false, null, null, null, false, false, 32735, null), false, 8, null);
    }

    public final void initTradeGroup(@NotNull MutableLiveData<ConsumeData<TradeInputGroup>> mutableLiveData, @NotNull DefiChainInfo defiChainInfo, @NotNull InterfaceC22824hme interfaceC22824hme, boolean z, @NotNull String str, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        Intrinsics.checkNotNullParameter(interfaceC22824hme, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (defiChainInfo.getDexDefaultFromToTokenShowVO() == null) {
            mutableLiveData.setValue(C22332hdP.EZpvd(new TradeInputGroup(C22332hdP.EZpvd(initFromData(str)), C22332hdP.EZpvd(initToData()), null, 4, null)));
            interfaceC22824hme.OLrzqt(null, false);
            InterfaceC22824hme.ActionBar.setCurrentToCoin$default(interfaceC22824hme, null, false, 2, null);
            return;
        }
        DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVO = defiChainInfo.getDexDefaultFromToTokenShowVO();
        DexMultiTokenInfoBean value = interfaceC22824hme.EZpvd().getValue();
        if (value == null) {
            value = (z || dexDefaultFromToTokenShowVO.getToCrossDexMultiTokenInfoVO() == null) ? dexDefaultFromToTokenShowVO.getToDexMultiTokenInfoVO() : dexDefaultFromToTokenShowVO.getToCrossDexMultiTokenInfoVO();
        }
        DexMultiTokenInfoBean value2 = interfaceC22824hme.KWHzl().getValue();
        if (value2 == null) {
            value2 = dexDefaultFromToTokenShowVO.getFromDexMultiTokenInfoVO();
        }
        mutableLiveData.setValue(C22332hdP.EZpvd(new TradeInputGroup(C22332hdP.EZpvd(value2 != null ? initFromData(value2, str) : initFromData(str)), C22332hdP.EZpvd(value != null ? initToData(value) : initToData()), null, 4, null)));
        interfaceC22824hme.OLrzqt(value2, false);
        interfaceC22824hme.AEQbTJ(value, true);
        function0.invoke();
    }

    public final void initTradeGroup(@NotNull MutableLiveData<ConsumeData<TradeInputGroup>> mutableLiveData, @NotNull DefiChainInfo defiChainInfo, @NotNull InterfaceC22425hfC interfaceC22425hfC, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        Intrinsics.checkNotNullParameter(interfaceC22425hfC, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (defiChainInfo.getDexDefaultFromToTokenShowVO() == null) {
            mutableLiveData.setValue(C22332hdP.EZpvd(new TradeInputGroup(C22332hdP.EZpvd(initFromData(this.INIT_AMOUNT)), C22332hdP.EZpvd(initToData()), null, 4, null)));
            interfaceC22425hfC.OLrzqt(null, false);
            InterfaceC22425hfC.TaskDescription.setCurrentToCoin$default(interfaceC22425hfC, null, false, 2, null);
            return;
        }
        DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVO = defiChainInfo.getDexDefaultFromToTokenShowVO();
        DexMultiTokenInfoBean value = interfaceC22425hfC.KWHzl().getValue();
        if (value == null) {
            value = dexDefaultFromToTokenShowVO.getToDexMultiTokenInfoVO();
        }
        DexMultiTokenInfoBean value2 = interfaceC22425hfC.AEQbTJ().getValue();
        if (value2 == null) {
            value2 = dexDefaultFromToTokenShowVO.getFromDexMultiTokenInfoVO();
        }
        String str = this.INIT_AMOUNT;
        mutableLiveData.setValue(C22332hdP.EZpvd(new TradeInputGroup(C22332hdP.EZpvd(value2 != null ? initFromData(value2, str) : initFromData(str)), C22332hdP.EZpvd(value != null ? initToData(value) : initToData()), null, 4, null)));
        interfaceC22425hfC.OLrzqt(value2, false);
        interfaceC22425hfC.EZpvd(value, true);
        function0.invoke();
    }

    private final ConsumeData<String> getFromTitle() {
        if (this.isLimit) {
            return C22332hdP.EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.doTurnConnection));
        }
        return C22332hdP.EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.apNbdB));
    }

    private final ConsumeData<String> getToTitle() {
        if (this.isLimit) {
            return C22332hdP.EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.UimiPOhkCVbT));
        }
        return C22332hdP.EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.gSBher));
    }

    public final void releaseData() {
        C33050mpD.OLrzqt(this.destroyKey);
    }
}
