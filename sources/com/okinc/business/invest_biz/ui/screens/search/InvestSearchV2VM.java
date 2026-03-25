package com.okinc.business.invest_biz.ui.screens.search;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.invest_biz.data.bean.FilterCondition;
import com.okinc.business.invest_biz.data.bean.FilterRecord;
import com.okinc.business.invest_biz.data.bean.InvestChip;
import com.okinc.business.invest_biz.data.bean.InvestSearchData;
import com.okinc.business.invest_biz.data.bean.SearchHeaderInfoResponse;
import com.okinc.business.invest_biz.data.bean.SubTabsData;
import com.okinc.business.invest_biz.data.usecase.SearchKeywordRequest;
import com.okinc.business.invest_biz.ui.screens.search.InvestSearchV2VM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.C23542iAf;
import o.C23613iCw;
import o.C27493jwI;
import o.C55276xgr;
import o.C56391yDq;
import o.C56403yEb;
import o.C56406yEe;
import o.C56442yFn;
import o.InterfaceC23717iGs;
import o.InterfaceC26619jfj;
import o.iGA;
import o.iGB;
import o.iWX;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestSearchV2VM extends ViewModel {
    public final MutableStateFlow<List<InvestChip>> AEQbTJ;
    public final StateFlow<InvestChip> AYXKKw;
    public final StateFlow<C55276xgr> AhwBna;
    public final StateFlow<List<InvestChip>> AkhnZx;
    public final SavedStateHandle DbNXlk;
    public final MutableStateFlow<InterfaceC26619jfj> EZpvd;
    public final MutableStateFlow<C55276xgr> KWHzl;
    public final MutableStateFlow<InvestChip> OLrzqt;
    public final MutableStateFlow<List<InvestChip>> copydefault;
    public final iGB djBIcL;
    public final InterfaceC23717iGs ejfBZ;
    public final StateFlow<List<InvestChip>> fIwbmz;
    public final StateFlow<InterfaceC26619jfj> fetchVPNInfo;
    public final StateFlow<List<FilterRecord>> gEmmrt;
    public final iGA isConnected;
    public final Json valueOf;
    public final C23542iAf values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<FilterRecord>> AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<InvestChip>> AYXKKw() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InvestChip> EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C55276xgr> copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC26619jfj> gEmmrt() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<InvestChip>> valueOf() {
        return this.fIwbmz;
    }

    @yCM
    public InvestSearchV2VM(@NotNull C23542iAf c23542iAf, @NotNull iGB igb, @NotNull InterfaceC23717iGs interfaceC23717iGs, @NotNull iGA iga, @NotNull Json json, @NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(c23542iAf, "");
        Intrinsics.checkNotNullParameter(igb, "");
        Intrinsics.checkNotNullParameter(interfaceC23717iGs, "");
        Intrinsics.checkNotNullParameter(iga, "");
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.values = c23542iAf;
        this.djBIcL = igb;
        this.ejfBZ = interfaceC23717iGs;
        this.isConnected = iga;
        this.valueOf = json;
        this.DbNXlk = savedStateHandle;
        MutableStateFlow<InterfaceC26619jfj> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC26619jfj.Application.AEQbTJ);
        this.EZpvd = MutableStateFlow;
        this.fetchVPNInfo = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<List<InvestChip>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow2;
        this.fIwbmz = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<List<InvestChip>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(new ArrayList());
        this.copydefault = MutableStateFlow3;
        this.AkhnZx = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<InvestChip> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow4;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<C55276xgr> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow5;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow5);
        this.gEmmrt = c23542iAf.EZpvd();
        KWHzl();
    }

    private final String values() {
        String str = (String) this.DbNXlk.get("chainId");
        return str == null ? "" : str;
    }

    private final String isConnected() {
        String str = (String) this.DbNXlk.get("searchKey");
        return str == null ? "" : str;
    }

    public final String AhwBna() {
        String str = (String) this.DbNXlk.get("tagType");
        return str == null ? "" : str;
    }

    public final void KWHzl() {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestSearchV2VM$beforeInitSearchData$1(this, null), 3, null);
    }

    public final void djBIcL() {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestSearchV2VM$initSearchData$1(this, null), 3, null);
    }

    public final InvestChip OLrzqt() {
        JsonArray jsonArray;
        JsonPrimitive jsonPrimitive;
        if (isConnected().length() == 0) {
            return null;
        }
        try {
            Result.Application application = Result.Companion;
            JsonObject jsonObject = JsonElementKt.getJsonObject(Json.Default.parseToJsonElement(isConnected()));
            JsonElement jsonElement = (JsonElement) jsonObject.get((Object) "symbol");
            String content = (jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : jsonPrimitive.getContent();
            ArrayList arrayList = new ArrayList();
            JsonElement jsonElement2 = (JsonElement) jsonObject.get((Object) "idList");
            if (jsonElement2 != null && (jsonArray = JsonElementKt.getJsonArray(jsonElement2)) != null) {
                Iterator<JsonElement> it = jsonArray.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(JsonElementKt.getInt(JsonElementKt.getJsonPrimitive(it.next()))));
                }
            }
            InvestSearchData investSearchData = new InvestSearchData(content, arrayList, (String) null, 4, (DefaultConstructorMarker) null);
            if (Intrinsics.EZpvd((Object) "1", (Object) AhwBna())) {
                return new InvestChip(null, investSearchData, 1, null);
            }
            return new InvestChip(investSearchData, null, 2, null);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(@NotNull List<InvestChip> list, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        InvestSearchV2VM$fetchHeaderData$1 investSearchV2VM$fetchHeaderData$1;
        final InvestSearchV2VM investSearchV2VM;
        Object objEZpvd;
        if (continuation instanceof InvestSearchV2VM$fetchHeaderData$1) {
            investSearchV2VM$fetchHeaderData$1 = (InvestSearchV2VM$fetchHeaderData$1) continuation;
            int i = investSearchV2VM$fetchHeaderData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investSearchV2VM$fetchHeaderData$1.label = i - Integer.MIN_VALUE;
            } else {
                investSearchV2VM$fetchHeaderData$1 = new InvestSearchV2VM$fetchHeaderData$1(this, continuation);
            }
        }
        Object obj = investSearchV2VM$fetchHeaderData$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = investSearchV2VM$fetchHeaderData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow<InterfaceC26619jfj> mutableStateFlow = this.EZpvd;
            InterfaceC26619jfj.Application application = InterfaceC26619jfj.Application.AEQbTJ;
            investSearchV2VM$fetchHeaderData$1.L$0 = this;
            investSearchV2VM$fetchHeaderData$1.L$1 = list;
            investSearchV2VM$fetchHeaderData$1.label = 1;
            if (mutableStateFlow.emit(application, investSearchV2VM$fetchHeaderData$1) == objCopydefault) {
                return objCopydefault;
            }
            investSearchV2VM = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    objEZpvd = investSearchV2VM$fetchHeaderData$1.L$1;
                    investSearchV2VM = (InvestSearchV2VM) investSearchV2VM$fetchHeaderData$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
                        MutableStateFlow<InterfaceC26619jfj> mutableStateFlow2 = investSearchV2VM.EZpvd;
                        InterfaceC26619jfj.StateListAnimator stateListAnimator = InterfaceC26619jfj.StateListAnimator.OLrzqt;
                        investSearchV2VM$fetchHeaderData$1.L$0 = objEZpvd;
                        investSearchV2VM$fetchHeaderData$1.L$1 = null;
                        investSearchV2VM$fetchHeaderData$1.label = 4;
                        if (mutableStateFlow2.emit(stateListAnimator, investSearchV2VM$fetchHeaderData$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                InvestSearchV2VM investSearchV2VM2 = (InvestSearchV2VM) investSearchV2VM$fetchHeaderData$1.L$0;
                C56391yDq.AEQbTJ(obj);
                investSearchV2VM = investSearchV2VM2;
                objEZpvd = ((Result) obj).m7386unboximpl();
                if (Result.m7384isSuccessimpl(objEZpvd)) {
                    List<SubTabsData> listAEQbTJ = ((SearchHeaderInfoResponse) objEZpvd).AEQbTJ();
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
                    for (SubTabsData subTabsData : listAEQbTJ) {
                        arrayList.add(new iWX(subTabsData.EZpvd(), subTabsData.KWHzl(), C23613iCw.copydefault(subTabsData.AEQbTJ(), investSearchV2VM.values().length() == 0 ? null : new Function1() { // from class: o.jff
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return java.lang.Boolean.valueOf(InvestSearchV2VM.AEQbTJ(this.AEQbTJ, (FilterCondition) obj2));
                            }
                        }), subTabsData.copydefault()));
                    }
                    MutableStateFlow<InterfaceC26619jfj> mutableStateFlow3 = investSearchV2VM.EZpvd;
                    InterfaceC26619jfj.TaskDescription taskDescription = new InterfaceC26619jfj.TaskDescription(arrayList);
                    investSearchV2VM$fetchHeaderData$1.L$0 = investSearchV2VM;
                    investSearchV2VM$fetchHeaderData$1.L$1 = objEZpvd;
                    investSearchV2VM$fetchHeaderData$1.label = 3;
                    if (mutableStateFlow3.emit(taskDescription, investSearchV2VM$fetchHeaderData$1) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
                }
                return Unit.INSTANCE;
            }
            list = (List) investSearchV2VM$fetchHeaderData$1.L$1;
            investSearchV2VM = (InvestSearchV2VM) investSearchV2VM$fetchHeaderData$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        iGB igb = investSearchV2VM.djBIcL;
        String strCopydefault = investSearchV2VM.copydefault(list);
        investSearchV2VM$fetchHeaderData$1.L$0 = investSearchV2VM;
        investSearchV2VM$fetchHeaderData$1.L$1 = null;
        investSearchV2VM$fetchHeaderData$1.label = 2;
        objEZpvd = igb.EZpvd(strCopydefault, investSearchV2VM$fetchHeaderData$1);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        if (Result.m7384isSuccessimpl(objEZpvd)) {
        }
        if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
        }
        return Unit.INSTANCE;
    }

    public static final boolean AEQbTJ(InvestSearchV2VM investSearchV2VM, FilterCondition filterCondition) {
        Intrinsics.checkNotNullParameter(filterCondition, "");
        return filterCondition.KWHzl() != -1 && Intrinsics.EZpvd((Object) String.valueOf(filterCondition.KWHzl()), (Object) investSearchV2VM.values());
    }

    public final void OLrzqt(@NotNull List<InvestChip> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestSearchV2VM$searchByText$1(this, list, str, null), 3, null);
    }

    public final void AEQbTJ(@NotNull List<InvestChip> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestSearchV2VM$searchByChips$1(this, list, null), 3, null);
    }

    public final void AEQbTJ(C55276xgr c55276xgr) {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestSearchV2VM$updateCommonFilter$1(this, c55276xgr, null), 3, null);
    }

    public final void EZpvd(@NotNull List<InvestChip> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return;
        }
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestSearchV2VM$saveHistory$1(this, list, null), 3, null);
    }

    public final String copydefault(List<InvestChip> list) {
        List<Integer> ids;
        List<Integer> ids2;
        if (list == null || list.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (InvestChip investChip : list) {
            InvestSearchData investSearchDataAEQbTJ = investChip.AEQbTJ();
            if (investSearchDataAEQbTJ != null && (ids2 = investSearchDataAEQbTJ.getIds()) != null) {
                C56406yEe.KWHzl(arrayList2, ids2);
            }
            InvestSearchData investSearchDataOLrzqt = investChip.OLrzqt();
            if (investSearchDataOLrzqt != null && (ids = investSearchDataOLrzqt.getIds()) != null) {
                C56406yEe.KWHzl(arrayList, ids);
                i++;
            }
        }
        Json json = this.valueOf;
        SearchKeywordRequest searchKeywordRequest = new SearchKeywordRequest(arrayList2, arrayList, i);
        json.getSerializersModule();
        return json.encodeToString(SearchKeywordRequest.Companion.serializer(), searchKeywordRequest);
    }

    public final void AEQbTJ(int i) {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestSearchV2VM$trackTabClick$1(this, i, null), 3, null);
    }
}
