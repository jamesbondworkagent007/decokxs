package com.okinc.tradingbot.impl.aiBot.ui.order;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.tradingbot.impl.aiBot.dto.InvestLimitDto;
import com.okinc.tradingbot.impl.aiBot.dto.MinMaxDto;
import com.okinc.tradingbot.impl.aiBot.dto.TpSlLimitDto;
import com.okinc.tradingbot.impl.aiBot.ui.order.LlmInvestViewModel;
import com.okinc.unify_trade.biz.AiOrderReq;
import com.okinc.unify_trade.biz.DataSetting;
import com.okinc.unify_trade.biz.StrategyResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC56429yFa;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C48033uCm;
import o.C53735wrB;
import o.C55276xgr;
import o.C55688xof;
import o.C56390yDp;
import o.C56392yDr;
import o.C56403yEb;
import o.C56424yEw;
import o.InterfaceC56387yDm;
import o.pTB;
import o.uLN;
import o.wUL;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class LlmInvestViewModel extends uLN<ActionBar> {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final SavedStateHandle AkhnZx;
    public final C53735wrB DbNXlk;
    public final InterfaceC56387yDm EZpvd;
    public final StateFlow<InvestLimitDto> KWHzl;
    public final MutableStateFlow<InvestLimitDto> OLrzqt;
    public AiOrderReq copydefault;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm fARcdN;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final CoroutineDispatcher gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public final InterfaceC56387yDm valueOf;
    public final InterfaceC56387yDm values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InvestLimitDto> AEQbTJ() {
        return this.KWHzl;
    }

    public static final class Activity extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public final /* synthetic */ LlmInvestViewModel AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(CoroutineExceptionHandler.Key key, LlmInvestViewModel llmInvestViewModel) {
            super(key);
            this.AEQbTJ = llmInvestViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            this.AEQbTJ.EZpvd(new ActionBar.TaskDescription(th));
        }
    }

    @yCM
    public LlmInvestViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C53735wrB c53735wrB) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c53735wrB, "");
        this.AkhnZx = savedStateHandle;
        this.gEmmrt = coroutineDispatcher;
        this.DbNXlk = c53735wrB;
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.uEW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LlmInvestViewModel.fetchVPNInfo(this.OLrzqt);
            }
        });
        this.fARcdN = C56392yDr.copydefault(new Function0() { // from class: o.uEY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LlmInvestViewModel.hDKMBd(this.AEQbTJ);
            }
        });
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.uEZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LlmInvestViewModel.uzCIH(this.copydefault);
            }
        });
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.uFa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LlmInvestViewModel.fJNWhG(this.AEQbTJ);
            }
        });
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.uFf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LlmInvestViewModel.fARcdN(this.AEQbTJ);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.uFb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LlmInvestViewModel.ejfBZ(this.EZpvd);
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.uFd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(LlmInvestViewModel.AuCTel(this.OLrzqt));
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.uFe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(LlmInvestViewModel.fIwbmz(this.copydefault));
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.uFc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LlmInvestViewModel.DbNXlk(this.KWHzl);
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.uFj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(LlmInvestViewModel.values(this.AEQbTJ));
            }
        });
        MutableStateFlow<InvestLimitDto> MutableStateFlow = StateFlowKt.MutableStateFlow(new InvestLimitDto((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null));
        this.OLrzqt = MutableStateFlow;
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow);
        this.copydefault = OLrzqt();
    }

    public static final List fetchVPNInfo(LlmInvestViewModel llmInvestViewModel) {
        List list = (List) llmInvestViewModel.AkhnZx.get("INVEST_LIMITS");
        return list == null ? yDY.AhwBna() : list;
    }

    public final List<InvestLimitDto> KWHzl() {
        return (List) this.djBIcL.getValue();
    }

    public static final TpSlLimitDto hDKMBd(LlmInvestViewModel llmInvestViewModel) {
        TpSlLimitDto tpSlLimitDto = (TpSlLimitDto) llmInvestViewModel.AkhnZx.get("TP_SL_LIMIT");
        return tpSlLimitDto == null ? new TpSlLimitDto((MinMaxDto) null, (MinMaxDto) null, 3, (DefaultConstructorMarker) null) : tpSlLimitDto;
    }

    public final TpSlLimitDto AYXKKw() {
        return (TpSlLimitDto) this.fARcdN.getValue();
    }

    public static final String uzCIH(LlmInvestViewModel llmInvestViewModel) {
        return llmInvestViewModel.AEQbTJ(llmInvestViewModel.AYXKKw().KWHzl().copydefault());
    }

    public final String gEmmrt() {
        return (String) this.fetchVPNInfo.getValue();
    }

    public static final String fJNWhG(LlmInvestViewModel llmInvestViewModel) {
        return llmInvestViewModel.AEQbTJ(llmInvestViewModel.AYXKKw().KWHzl().KWHzl());
    }

    public final String djBIcL() {
        return (String) this.values.getValue();
    }

    public static final String fARcdN(LlmInvestViewModel llmInvestViewModel) {
        return llmInvestViewModel.AEQbTJ(llmInvestViewModel.AYXKKw().EZpvd().copydefault());
    }

    public final String valueOf() {
        return (String) this.isConnected.getValue();
    }

    public static final String ejfBZ(LlmInvestViewModel llmInvestViewModel) {
        return llmInvestViewModel.AEQbTJ(llmInvestViewModel.AYXKKw().EZpvd().KWHzl());
    }

    public final String AhwBna() {
        return (String) this.AYXKKw.getValue();
    }

    public static final boolean AuCTel(LlmInvestViewModel llmInvestViewModel) {
        Boolean bool = (Boolean) llmInvestViewModel.AkhnZx.get("IS_TP_MANDATORY");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean fetchVPNInfo() {
        return ((Boolean) this.AhwBna.getValue()).booleanValue();
    }

    public static final boolean fIwbmz(LlmInvestViewModel llmInvestViewModel) {
        Boolean bool = (Boolean) llmInvestViewModel.AkhnZx.get("IS_SL_MANDATORY");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean values() {
        return ((Boolean) this.valueOf.getValue()).booleanValue();
    }

    public static final AiOrderReq DbNXlk(LlmInvestViewModel llmInvestViewModel) {
        AiOrderReq aiOrderReq = (AiOrderReq) llmInvestViewModel.AkhnZx.get("ORDER_REQ");
        return aiOrderReq == null ? new AiOrderReq((String) null, (List) null, (String) null, (String) null, (String) null, (DataSetting) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 8191, (DefaultConstructorMarker) null) : aiOrderReq;
    }

    public final AiOrderReq OLrzqt() {
        return (AiOrderReq) this.AEQbTJ.getValue();
    }

    public static final boolean values(LlmInvestViewModel llmInvestViewModel) {
        return llmInvestViewModel.KWHzl().size() > 1;
    }

    public final boolean EZpvd() {
        return ((Boolean) this.EZpvd.getValue()).booleanValue();
    }

    public final String AEQbTJ(String str) {
        String str2 = !StringsKt__StringsKt.fARcdN((CharSequence) str) ? str : null;
        String strMulS$default = str2 != null ? C33129mqd.mulS$default(str2, 100, null, null, null, 14, null) : null;
        return strMulS$default == null ? "" : strMulS$default;
    }

    public final void isConnected() {
        wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.gEmmrt.plus(new Activity(CoroutineExceptionHandler.Key, this)), null, new LlmInvestViewModel$placeOrder$2(this, null), 2, null);
    }

    public final AiOrderReq KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        AiOrderReq aiOrderReqOLrzqt = OLrzqt();
        AiOrderReq aiOrderReqCopy = aiOrderReqOLrzqt.copy((4351 & 1) != 0 ? aiOrderReqOLrzqt.aiModel : null, (4351 & 2) != 0 ? aiOrderReqOLrzqt.instIds : null, (4351 & 4) != 0 ? aiOrderReqOLrzqt.instType : null, (4351 & 8) != 0 ? aiOrderReqOLrzqt.ordType : null, (4351 & 16) != 0 ? aiOrderReqOLrzqt.tdMode : null, (4351 & 32) != 0 ? aiOrderReqOLrzqt.dataSetting : null, (4351 & 64) != 0 ? aiOrderReqOLrzqt.userPrompt : null, (4351 & 128) != 0 ? aiOrderReqOLrzqt.userPromptEn : null, (4351 & 256) != 0 ? aiOrderReqOLrzqt.totalAmt : str, (4351 & 512) != 0 ? aiOrderReqOLrzqt.quoteCcy : str2, (4351 & 1024) != 0 ? aiOrderReqOLrzqt.tpRatio : KWHzl(str3), (4351 & 2048) != 0 ? aiOrderReqOLrzqt.slRatio : KWHzl(str4), (4351 & 4096) != 0 ? aiOrderReqOLrzqt.systemPromptVersion : null);
        this.copydefault = aiOrderReqCopy;
        return aiOrderReqCopy;
    }

    public final String KWHzl(String str) {
        if (StringsKt__StringsKt.fARcdN((CharSequence) str)) {
            return null;
        }
        return C33129mqd.divS$default(str, 100, null, null, null, 14, null);
    }

    public final void copydefault(@NotNull InvestLimitDto investLimitDto) {
        Intrinsics.checkNotNullParameter(investLimitDto, "");
        this.OLrzqt.setValue(investLimitDto);
    }

    public final List<C55276xgr> copydefault() {
        List<InvestLimitDto> listKWHzl = KWHzl();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        for (InvestLimitDto investLimitDto : listKWHzl) {
            arrayList.add(new C55276xgr(investLimitDto.KWHzl(), investLimitDto, null, Intrinsics.EZpvd(investLimitDto, this.KWHzl.getValue()), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        }
        return arrayList;
    }

    public final void DbNXlk() {
        Object obj;
        Object next;
        Iterator<T> it = KWHzl().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((InvestLimitDto) next).KWHzl(), (Object) OLrzqt().getQuoteCcy())) {
                    break;
                }
            }
        }
        InvestLimitDto investLimitDto = (InvestLimitDto) next;
        if (investLimitDto == null) {
            Iterator<T> it2 = KWHzl().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (Intrinsics.EZpvd((Object) ((InvestLimitDto) next2).KWHzl(), (Object) "USDT")) {
                    obj = next2;
                    break;
                }
            }
            investLimitDto = (InvestLimitDto) obj;
            if (investLimitDto == null) {
                investLimitDto = (InvestLimitDto) CollectionsKt___CollectionsKt.firstOrNull(KWHzl());
            }
        }
        if (investLimitDto != null) {
            this.OLrzqt.setValue(investLimitDto);
        }
    }

    public final String EZpvd(@NotNull String str, @NotNull String str2, boolean z) {
        Pair pairOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        boolean zFARcdN = StringsKt__StringsKt.fARcdN((CharSequence) str);
        if (z) {
            pairOLrzqt = C56390yDp.OLrzqt(Boolean.valueOf(fetchVPNInfo()), Integer.valueOf(C48033uCm.Fragment.giSNqX));
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(Boolean.valueOf(values()), Integer.valueOf(C48033uCm.Fragment.fvQaOB));
        }
        boolean zBooleanValue = ((Boolean) pairOLrzqt.component1()).booleanValue();
        int iIntValue = ((Number) pairOLrzqt.component2()).intValue();
        String strGEmmrt = z ? gEmmrt() : valueOf();
        String strDjBIcL = z ? djBIcL() : AhwBna();
        if (zFARcdN && zBooleanValue) {
            return C33070mpX.AYXKKw(iIntValue);
        }
        if (zFARcdN) {
            return "";
        }
        if (C33129mqd.gEmmrt(str, strGEmmrt)) {
            return C33069mpW.copydefault(C55688xof.Application.USBtdM, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", str2), C56390yDp.OLrzqt("minValue", EZpvd(strGEmmrt, 2))));
        }
        return ((StringsKt__StringsKt.fARcdN((CharSequence) strDjBIcL) ^ true) && C33129mqd.AEQbTJ(str, strDjBIcL)) ? C33069mpW.copydefault(C55688xof.Application.QCjLjM, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", str2), C56390yDp.OLrzqt("minValue", EZpvd(strDjBIcL, 2)))) : "";
    }

    public final String OLrzqt(@NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.ActivityComposeUtilsKt);
        InvestLimitDto value = this.KWHzl.getValue();
        String strAEQbTJ = value.AEQbTJ();
        String strEZpvd = value.EZpvd();
        if (StringsKt__StringsKt.fARcdN((CharSequence) str)) {
            return "";
        }
        if (C33129mqd.gEmmrt(str, strAEQbTJ)) {
            return C33069mpW.copydefault(C55688xof.Application.gGNlxh, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", strAYXKKw), C56390yDp.OLrzqt("minValue", EZpvd(strAEQbTJ, i)), C56390yDp.OLrzqt("unit", str2)));
        }
        return ((StringsKt__StringsKt.fARcdN((CharSequence) strEZpvd) ^ true) && C33129mqd.AEQbTJ(str, strEZpvd)) ? C33069mpW.copydefault(C48033uCm.Fragment.gmHjFq, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", strAYXKKw), C56390yDp.OLrzqt("minValue", EZpvd(strEZpvd, i)), C56390yDp.OLrzqt("unit", str2))) : "";
    }

    public final String EZpvd(String str, int i) {
        return pTB.formatLocalized$default(C33129mqd.formatS$default(str, Integer.valueOf(i), null, null, 6, null), null, 1, null);
    }

    public interface ActionBar {

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.aiBot.ui.order.LlmInvestViewModel$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C0635ActionBar implements ActionBar {
            public static final int AEQbTJ = StrategyResponse.$stable;
            public final StrategyResponse EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0635ActionBar copy$default(C0635ActionBar c0635ActionBar, StrategyResponse strategyResponse, int i, Object obj) {
                if ((i & 1) != 0) {
                    strategyResponse = c0635ActionBar.EZpvd;
                }
                return c0635ActionBar.copydefault(strategyResponse);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0635ActionBar copydefault(@NotNull StrategyResponse strategyResponse) {
                Intrinsics.checkNotNullParameter(strategyResponse, "");
                return new C0635ActionBar(strategyResponse);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StrategyResponse copydefault() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0635ActionBar) && Intrinsics.EZpvd(this.EZpvd, ((C0635ActionBar) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "OrderPlacedSuccess(strategyResponse=" + this.EZpvd + ")";
            }

            public C0635ActionBar(@NotNull StrategyResponse strategyResponse) {
                Intrinsics.checkNotNullParameter(strategyResponse, "");
                this.EZpvd = strategyResponse;
            }
        }

        public static final class TaskDescription implements ActionBar {
            public final Throwable copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = taskDescription.copydefault;
                }
                return taskDescription.copydefault(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Throwable AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription copydefault(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new TaskDescription(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.copydefault, ((TaskDescription) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "OrderPlacedError(throwable=" + this.copydefault + ")";
            }

            public TaskDescription(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                this.copydefault = th;
            }
        }
    }
}
