package com.okinc.tradingbot.impl.aiBot.ui.order;

import androidx.camera.video.AudioStats;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.tradingbot.impl.aiBot.dto.AiHomeDto;
import com.okinc.tradingbot.impl.aiBot.dto.LlmDisclaimerInfoDto;
import com.okinc.tradingbot.impl.aiBot.dto.ModelInfoDto;
import com.okinc.tradingbot.impl.aiBot.ui.order.LlmOrderViewModel;
import com.okinc.unify_trade.biz.AiOrderReq;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.DataSetting;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC54531xLw;
import o.C33129mqd;
import o.C52761wXj;
import o.C53418wlC;
import o.C54589xNz;
import o.C54799xVt;
import o.C55276xgr;
import o.C56391yDq;
import o.C56392yDr;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;
import o.InterfaceC56387yDm;
import o.uCB;
import o.uCK;
import o.uCP;
import o.uCR;
import o.uCU;
import o.uLN;
import o.vNB;
import o.wUL;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class LlmOrderViewModel extends uLN<Application> {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final MutableStateFlow<List<uCB>> AEQbTJ;
    public final MutableStateFlow<ModelInfoDto> AYXKKw;
    public final StateFlow<vNB<AiHomeDto>> AhwBna;
    public final uCP AkhnZx;
    public final SavedStateHandle AuCTel;
    public final uCK DbNXlk;
    public final MutableStateFlow<vNB<AiHomeDto>> EZpvd;
    public final MutableStateFlow<StateListAnimator> OLrzqt;
    public final MutableStateFlow<String> copydefault;
    public uCU.Application djBIcL;
    public final StateFlow<ModelInfoDto> ejfBZ;
    public final uCR fARcdN;
    public final StateFlow<List<uCB>> fIwbmz;
    public final StateFlow<String> fJNWhG;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final StateFlow<StateListAnimator> gEmmrt;
    public final uCU isConnected;
    public final StateFlow<DataSetting> iwGUEr;
    public final MutableStateFlow<DataSetting> valueOf;
    public final CoroutineDispatcher values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<StateListAnimator> AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<ModelInfoDto> AkhnZx() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<vNB<AiHomeDto>> OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<DataSetting> fARcdN() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> isConnected() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<uCB>> values() {
        return this.fIwbmz;
    }

    @yCM
    public LlmOrderViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull uCK uck, @NotNull uCP ucp, @NotNull uCU ucu, @NotNull uCR ucr) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(uck, "");
        Intrinsics.checkNotNullParameter(ucp, "");
        Intrinsics.checkNotNullParameter(ucu, "");
        Intrinsics.checkNotNullParameter(ucr, "");
        this.AuCTel = savedStateHandle;
        this.values = coroutineDispatcher;
        this.DbNXlk = uck;
        this.AkhnZx = ucp;
        this.isConnected = ucu;
        this.fARcdN = ucr;
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.uFC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LlmOrderViewModel.AhwBna(this.copydefault);
            }
        });
        MutableStateFlow<vNB<AiHomeDto>> MutableStateFlow = StateFlowKt.MutableStateFlow(vNB.Activity.copydefault);
        this.EZpvd = MutableStateFlow;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<ModelInfoDto> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new ModelInfoDto((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null));
        this.AYXKKw = MutableStateFlow2;
        this.ejfBZ = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<String> MutableStateFlow3 = StateFlowKt.MutableStateFlow("");
        this.copydefault = MutableStateFlow3;
        this.fJNWhG = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<List<uCB>> MutableStateFlow4 = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.AEQbTJ = MutableStateFlow4;
        this.fIwbmz = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<DataSetting> MutableStateFlow5 = StateFlowKt.MutableStateFlow(new DataSetting((String) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null));
        this.valueOf = MutableStateFlow5;
        this.iwGUEr = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<StateListAnimator> MutableStateFlow6 = StateFlowKt.MutableStateFlow(new StateListAnimator(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
        this.OLrzqt = MutableStateFlow6;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow6);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.aiBot.ui.order.LlmOrderViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static final AiOrderReq AhwBna(LlmOrderViewModel llmOrderViewModel) {
        return (AiOrderReq) llmOrderViewModel.AuCTel.get("bot_copy_req");
    }

    public final AiOrderReq gEmmrt() {
        return (AiOrderReq) this.fetchVPNInfo.getValue();
    }

    public final AiHomeDto copydefault() {
        return this.AhwBna.getValue().KWHzl();
    }

    public final DataSetting ejfBZ() {
        return this.iwGUEr.getValue();
    }

    public static final class StateListAnimator {
        public final String EZpvd;
        public final String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.KWHzl(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new StateListAnimator(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((Object) this.EZpvd, (Object) stateListAnimator.EZpvd) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) stateListAnimator.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "AiPromptData(original=" + this.EZpvd + ", english=" + this.OLrzqt + ")";
        }

        public StateListAnimator(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.EZpvd = str;
            this.OLrzqt = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:76) call: com.okinc.tradingbot.impl.aiBot.ui.order.LlmOrderViewModel.StateListAnimator.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ StateListAnimator(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }
    }

    public final String AYXKKw() {
        return this.gEmmrt.getValue().KWHzl();
    }

    public final String valueOf() {
        Map<String, String> mapCopydefault;
        AiHomeDto aiHomeDtoCopydefault = copydefault();
        String str = (aiHomeDtoCopydefault == null || (mapCopydefault = aiHomeDtoCopydefault.copydefault()) == null) ? null : mapCopydefault.get(ejfBZ().getAiThinkingInterval());
        return str == null ? "" : str;
    }

    public final DataSetting djBIcL() {
        AiHomeDto aiHomeDtoCopydefault = copydefault();
        return aiHomeDtoCopydefault == null ? new DataSetting((String) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null) : new DataSetting(aiHomeDtoCopydefault.OLrzqt(), aiHomeDtoCopydefault.djBIcL(), aiHomeDtoCopydefault.valueOf());
    }

    public final void AEQbTJ() {
        wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.values, null, new LlmOrderViewModel$checkDisclaimerForInvest$1(this, null), 2, null);
    }

    public final void KWHzl() {
        wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.values, null, new LlmOrderViewModel$checkPopupsOnStart$1(this, null), 2, null);
    }

    public final void AuCTel() {
        uCU.Application application = this.djBIcL;
        if (application != null && application.OLrzqt()) {
            EZpvd(new Application.StateListAnimator(application.copydefault()));
        }
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.values, null, new LlmOrderViewModel$markBotGuidePopupShown$1(this, str, null), 2, null);
    }

    public final AiOrderReq DbNXlk() {
        String strCopydefault = this.ejfBZ.getValue().copydefault();
        List<uCB> value = this.fIwbmz.getValue();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(value, 10));
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            arrayList.add(((uCB) it.next()).copydefault());
        }
        String value2 = this.fJNWhG.getValue();
        DataSetting dataSettingEjfBZ = ejfBZ();
        String strEZpvd = this.gEmmrt.getValue().EZpvd();
        String strKWHzl = this.gEmmrt.getValue().KWHzl();
        AiOrderReq aiOrderReqGEmmrt = gEmmrt();
        String totalAmt = aiOrderReqGEmmrt != null ? aiOrderReqGEmmrt.getTotalAmt() : null;
        String str = totalAmt == null ? "" : totalAmt;
        AiOrderReq aiOrderReqGEmmrt2 = gEmmrt();
        String quoteCcy = aiOrderReqGEmmrt2 != null ? aiOrderReqGEmmrt2.getQuoteCcy() : null;
        String str2 = quoteCcy == null ? "" : quoteCcy;
        AiOrderReq aiOrderReqGEmmrt3 = gEmmrt();
        String tpRatio = aiOrderReqGEmmrt3 != null ? aiOrderReqGEmmrt3.getTpRatio() : null;
        AiOrderReq aiOrderReqGEmmrt4 = gEmmrt();
        return new AiOrderReq(strCopydefault, arrayList, value2, "ai_bot", "cross", dataSettingEjfBZ, strEZpvd, strKWHzl, str, str2, tpRatio, aiOrderReqGEmmrt4 != null ? aiOrderReqGEmmrt4.getSlRatio() : null, (String) null, 4096, (DefaultConstructorMarker) null);
    }

    public final void KWHzl(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt.setValue(new StateListAnimator(str, str2));
    }

    public final void EZpvd(@NotNull DataSetting dataSetting) {
        Intrinsics.checkNotNullParameter(dataSetting, "");
        this.valueOf.setValue(dataSetting);
    }

    public final void EZpvd(@NotNull List<uCB> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ.setValue(list);
    }

    public final void AEQbTJ(int i) {
        List<uCB> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) this.fIwbmz.getValue());
        int size = listFJNWhG.size();
        AiHomeDto aiHomeDtoCopydefault = copydefault();
        if (!C33129mqd.valueOf(Integer.valueOf(size), aiHomeDtoCopydefault != null ? Integer.valueOf(aiHomeDtoCopydefault.isConnected()) : null) && i >= 0 && i <= yDY.AuCTel(listFJNWhG)) {
            listFJNWhG.remove(i);
            EZpvd(listFJNWhG);
        }
    }

    public static /* synthetic */ void setSelectedInstType$default(LlmOrderViewModel llmOrderViewModel, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        llmOrderViewModel.copydefault(str, z);
    }

    public final void copydefault(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.setValue(str);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.values, null, new LlmOrderViewModel$setSelectedInstType$1(this, z, null), 2, null);
    }

    public final void EZpvd(@NotNull ModelInfoDto modelInfoDto) {
        Intrinsics.checkNotNullParameter(modelInfoDto, "");
        this.AYXKKw.setValue(modelInfoDto);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:0x005b */
    public final List<C55276xgr> fetchVPNInfo() {
        AiHomeDto aiHomeDtoCopydefault = copydefault();
        List<ModelInfoDto> listAEQbTJ = aiHomeDtoCopydefault != null ? aiHomeDtoCopydefault.AEQbTJ() : null;
        if (listAEQbTJ == null) {
            listAEQbTJ = yDY.AhwBna();
        }
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
        for (ModelInfoDto modelInfoDto : listAEQbTJ) {
            String strCopydefault = modelInfoDto.copydefault();
            String strEZpvd = modelInfoDto.EZpvd();
            boolean zEZpvd = Intrinsics.EZpvd(modelInfoDto, this.ejfBZ.getValue());
            String strAEQbTJ = C53418wlC.AEQbTJ(modelInfoDto.OLrzqt());
            boolean z = !StringsKt__StringsKt.fARcdN((CharSequence) strAEQbTJ);
            Object objValueOf = strAEQbTJ;
            if (!z) {
                objValueOf = null;
            }
            if (objValueOf == null) {
                objValueOf = Integer.valueOf(C52761wXj.TaskDescription.DDxOgT);
            }
            arrayList.add(new C55276xgr(strCopydefault, modelInfoDto, strEZpvd, zEZpvd, false, objValueOf, null, 80, null));
        }
        return arrayList;
    }

    public final void EZpvd() {
        this.EZpvd.setValue(vNB.Activity.copydefault);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.values, null, new LlmOrderViewModel$fetchAiHome$1(this, null), 2, null);
    }

    public final String copydefault(Set<String> set) {
        Object obj;
        Object next;
        Set<String> set2 = set;
        Iterator<T> it = set2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String str = (String) next;
            AiOrderReq aiOrderReqGEmmrt = gEmmrt();
            if (Intrinsics.EZpvd((Object) str, (Object) (aiOrderReqGEmmrt != null ? aiOrderReqGEmmrt.getInstType() : null))) {
                break;
            }
        }
        String str2 = (String) next;
        if (str2 != null) {
            return str2;
        }
        Iterator<T> it2 = set2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (Intrinsics.EZpvd(next2, (Object) "SWAP")) {
                obj = next2;
                break;
            }
        }
        String str3 = (String) obj;
        return str3 == null ? (String) CollectionsKt___CollectionsKt.dNCPSb(set2) : str3;
    }

    public final ModelInfoDto KWHzl(List<ModelInfoDto> list) {
        Object obj;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String strCopydefault = ((ModelInfoDto) next).copydefault();
            AiOrderReq aiOrderReqGEmmrt = gEmmrt();
            if (Intrinsics.EZpvd(strCopydefault, aiOrderReqGEmmrt != null ? aiOrderReqGEmmrt.getAiModel() : null)) {
                obj = next;
                break;
            }
        }
        ModelInfoDto modelInfoDto = (ModelInfoDto) obj;
        return modelInfoDto == null ? (ModelInfoDto) CollectionsKt___CollectionsKt.AuCTelauCTel(list) : modelInfoDto;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(boolean z, Continuation<? super Unit> continuation) throws Throwable {
        LlmOrderViewModel$refreshSelectedCryptoList$1 llmOrderViewModel$refreshSelectedCryptoList$1;
        LlmOrderViewModel llmOrderViewModel;
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        LlmOrderViewModel llmOrderViewModel2;
        String str;
        AbstractC54531xLw abstractC54531xLw;
        AiOrderReq aiOrderReqGEmmrt;
        List<String> instIds;
        List<uCB> listCopydefault;
        Map<String, List<String>> mapGEmmrt;
        if (continuation instanceof LlmOrderViewModel$refreshSelectedCryptoList$1) {
            llmOrderViewModel$refreshSelectedCryptoList$1 = (LlmOrderViewModel$refreshSelectedCryptoList$1) continuation;
            int i = llmOrderViewModel$refreshSelectedCryptoList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                llmOrderViewModel$refreshSelectedCryptoList$1.label = i - Integer.MIN_VALUE;
            } else {
                llmOrderViewModel$refreshSelectedCryptoList$1 = new LlmOrderViewModel$refreshSelectedCryptoList$1(this, continuation);
            }
        }
        Object obj = llmOrderViewModel$refreshSelectedCryptoList$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = llmOrderViewModel$refreshSelectedCryptoList$1.label;
        List<String> list = null;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            llmOrderViewModel$refreshSelectedCryptoList$1.L$0 = this;
            llmOrderViewModel$refreshSelectedCryptoList$1.Z$0 = z;
            llmOrderViewModel$refreshSelectedCryptoList$1.label = 1;
            if (InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(c54589xNz, false, null, llmOrderViewModel$refreshSelectedCryptoList$1, 3, null) == objCopydefault) {
                return objCopydefault;
            }
            llmOrderViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = llmOrderViewModel$refreshSelectedCryptoList$1.Z$0;
                str = (String) llmOrderViewModel$refreshSelectedCryptoList$1.L$2;
                interfaceC54581xNrCopydefault = (InterfaceC54581xNr) llmOrderViewModel$refreshSelectedCryptoList$1.L$1;
                llmOrderViewModel2 = (LlmOrderViewModel) llmOrderViewModel$refreshSelectedCryptoList$1.L$0;
                C56391yDq.AEQbTJ(obj);
                abstractC54531xLw = (AbstractC54531xLw) obj;
                aiOrderReqGEmmrt = llmOrderViewModel2.gEmmrt();
                if (aiOrderReqGEmmrt == null || (instIds = aiOrderReqGEmmrt.getInstIds()) == null || !z) {
                    instIds = null;
                }
                listCopydefault = copydefault(instIds, abstractC54531xLw, interfaceC54581xNrCopydefault);
                if (listCopydefault.isEmpty()) {
                    AiHomeDto aiHomeDtoCopydefault = llmOrderViewModel2.copydefault();
                    if (aiHomeDtoCopydefault != null && (mapGEmmrt = aiHomeDtoCopydefault.gEmmrt()) != null) {
                        list = mapGEmmrt.get(str);
                    }
                    listCopydefault = copydefault(list, abstractC54531xLw, interfaceC54581xNrCopydefault);
                }
                llmOrderViewModel2.EZpvd(listCopydefault);
                return Unit.INSTANCE;
            }
            z = llmOrderViewModel$refreshSelectedCryptoList$1.Z$0;
            llmOrderViewModel = (LlmOrderViewModel) llmOrderViewModel$refreshSelectedCryptoList$1.L$0;
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
        }
        interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        String value = llmOrderViewModel.fJNWhG.getValue();
        if (interfaceC54581xNrCopydefault != null) {
            llmOrderViewModel$refreshSelectedCryptoList$1.L$0 = llmOrderViewModel;
            llmOrderViewModel$refreshSelectedCryptoList$1.L$1 = interfaceC54581xNrCopydefault;
            llmOrderViewModel$refreshSelectedCryptoList$1.L$2 = value;
            llmOrderViewModel$refreshSelectedCryptoList$1.Z$0 = z;
            llmOrderViewModel$refreshSelectedCryptoList$1.label = 2;
            Object objEZpvd = interfaceC54581xNrCopydefault.EZpvd(value, llmOrderViewModel$refreshSelectedCryptoList$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            LlmOrderViewModel llmOrderViewModel3 = llmOrderViewModel;
            str = value;
            obj = objEZpvd;
            llmOrderViewModel2 = llmOrderViewModel3;
            abstractC54531xLw = (AbstractC54531xLw) obj;
            aiOrderReqGEmmrt = llmOrderViewModel2.gEmmrt();
            if (aiOrderReqGEmmrt == null) {
                instIds = null;
            }
            listCopydefault = copydefault(instIds, abstractC54531xLw, interfaceC54581xNrCopydefault);
            if (listCopydefault.isEmpty()) {
            }
            llmOrderViewModel2.EZpvd(listCopydefault);
            return Unit.INSTANCE;
        }
        llmOrderViewModel2 = llmOrderViewModel;
        str = value;
        abstractC54531xLw = null;
        aiOrderReqGEmmrt = llmOrderViewModel2.gEmmrt();
        if (aiOrderReqGEmmrt == null) {
        }
        listCopydefault = copydefault(instIds, abstractC54531xLw, interfaceC54581xNrCopydefault);
        if (listCopydefault.isEmpty()) {
        }
        llmOrderViewModel2.EZpvd(listCopydefault);
        return Unit.INSTANCE;
    }

    public static final List<uCB> copydefault(List<String> list, AbstractC54531xLw abstractC54531xLw, InterfaceC54581xNr interfaceC54581xNr) {
        uCB ucb;
        BizInstrument bizInstrumentValueOf;
        List<String> listAhwBna = list == null ? yDY.AhwBna() : list;
        ArrayList arrayList = new ArrayList();
        for (String str : listAhwBna) {
            if (abstractC54531xLw == null || (bizInstrumentValueOf = abstractC54531xLw.valueOf(str)) == null) {
                ucb = null;
            } else {
                String instId = bizInstrumentValueOf.getInstId();
                String strValueOf = interfaceC54581xNr.valueOf(bizInstrumentValueOf.getTradeSymbol());
                C54799xVt c54799xVt = C54799xVt.AEQbTJ;
                ucb = new uCB(instId, strValueOf, C54799xVt.getTitleByIdAndType$default(c54799xVt, bizInstrumentValueOf.getInstId(), bizInstrumentValueOf.getInstType(), false, false, 12, null), c54799xVt.copydefault(bizInstrumentValueOf.getInstId(), bizInstrumentValueOf.getInstType(), (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? "normal" : null, (124 & 32) != 0, (124 & 64) != 0 ? null : null, (124 & 128) != 0 ? false : true), false, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, AudioStats.AUDIO_AMPLITUDE_NONE, 496, null);
            }
            if (ucb != null) {
                arrayList.add(ucb);
            }
        }
        return arrayList;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public interface Application {

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.aiBot.ui.order.LlmOrderViewModel$Application$Application, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes19.dex */
        public static final class C0636Application implements Application {
            public final LlmDisclaimerInfoDto OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0636Application copy$default(C0636Application c0636Application, LlmDisclaimerInfoDto llmDisclaimerInfoDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    llmDisclaimerInfoDto = c0636Application.OLrzqt;
                }
                return c0636Application.OLrzqt(llmDisclaimerInfoDto);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final LlmDisclaimerInfoDto OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0636Application OLrzqt(@NotNull LlmDisclaimerInfoDto llmDisclaimerInfoDto) {
                Intrinsics.checkNotNullParameter(llmDisclaimerInfoDto, "");
                return new C0636Application(llmDisclaimerInfoDto);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0636Application) && Intrinsics.EZpvd(this.OLrzqt, ((C0636Application) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ShowDisclaimer(disclaimerInfo=" + this.OLrzqt + ")";
            }

            public C0636Application(@NotNull LlmDisclaimerInfoDto llmDisclaimerInfoDto) {
                Intrinsics.checkNotNullParameter(llmDisclaimerInfoDto, "");
                this.OLrzqt = llmDisclaimerInfoDto;
            }
        }

        /* JADX INFO: loaded from: classes19.dex */
        public static final class TaskDescription implements Application {
            public static final TaskDescription EZpvd = new TaskDescription();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TaskDescription)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 2035503159;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ShowInvestBottomSheet";
            }

            private TaskDescription() {
            }
        }

        public static final class StateListAnimator implements Application {
            public final String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.OLrzqt;
                }
                return stateListAnimator.EZpvd(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator EZpvd(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new StateListAnimator(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String copydefault() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) ((StateListAnimator) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ShowBotGuide(timestamp=" + this.OLrzqt + ")";
            }

            public StateListAnimator(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.OLrzqt = str;
            }
        }

        /* JADX INFO: loaded from: classes19.dex */
        public static final class ActionBar implements Application {
            public final String EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = actionBar.EZpvd;
                }
                return actionBar.AEQbTJ(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar AEQbTJ(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new ActionBar(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String copydefault() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionBar) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) ((ActionBar) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ShowErrorToast(errMsg=" + this.EZpvd + ")";
            }

            public ActionBar(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.EZpvd = str;
            }
        }
    }
}
