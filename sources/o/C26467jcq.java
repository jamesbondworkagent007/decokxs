package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.invest_biz.data.bean.AggregateData;
import com.okinc.business.invest_biz.data.bean.AggregateItem;
import com.okinc.business.invest_biz.data.bean.CommonV2Filter;
import com.okinc.business.invest_biz.data.bean.InvestChip;
import com.okinc.business.invest_biz.data.bean.ProductJumpParam;
import com.okinc.business.invest_biz.data.usecase.V2ProductQuery;
import com.okinc.business.invest_biz.ui.screens.home.CommonProductListVM$1;
import com.okinc.business.invest_biz.ui.screens.home.CommonProductListVM$fetchData$1;
import com.okinc.business.invest_biz.ui.screens.home.CommonProductListVM$loadMore$1;
import com.okinc.business.invest_biz.ui.screens.home.CommonProductListVM$loadMore$2;
import com.okinc.business.invest_biz.ui.screens.home.CommonProductListVM$refresh$1;
import com.okinc.business.invest_biz.ui.screens.home.CommonProductListVM$refreshInternally$1;
import com.okinc.business.invest_biz.ui.screens.home.CommonProductListVM$trackViewMoreClick$1;
import com.okinc.business.invest_biz.ui.screens.home.CommonProductListVM$updateCommonFilter$1;
import com.okinc.business.invest_biz.ui.screens.home.CommonProductListVM$updateDefaultFilter$2;
import com.okinc.business.invest_biz.ui.screens.home.CommonProductListVM$updateFilters$1;
import com.okinc.business.invest_biz.ui.screens.home.CommonProductListVM$updateFilters$2;
import com.okinc.business.invest_biz.ui.screens.home.CommonProductListVM$updateFilters$3;
import com.okinc.business.invest_biz.ui.screens.home.CommonProductListVM$updateFilters$4;
import com.okinc.business.invest_biz.ui.screens.home.CommonProductListVM$updateFilters$5;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.json.Json;
import o.InterfaceC26463jcm;
import o.InterfaceC26469jcs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jcq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26467jcq extends ViewModel {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final MutableStateFlow<CommonV2Filter> AEQbTJ;
    public final StateFlow<C55276xgr> AYXKKw;
    public final Json AhwBna;
    public V2ProductQuery AkhnZx;
    public final C26519jdp DbNXlk;
    public final MutableSharedFlow<InterfaceC26463jcm> EZpvd;
    public final MutableStateFlow<C55276xgr> OLrzqt;
    public final MutableStateFlow<InterfaceC26469jcs> copydefault;
    public final iFH djBIcL;
    public final StateFlow<InterfaceC26469jcs> fARcdN;
    public final CoroutineScope fetchVPNInfo;
    public final MutableSharedFlow<Unit> gEmmrt;
    public C26468jcr isConnected;
    public final InterfaceC23702iGd valueOf;
    public final SharedFlow<InterfaceC26463jcm> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<CommonV2Filter> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableSharedFlow<Unit> EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<InterfaceC26463jcm> KWHzl() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C55276xgr> OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(V2ProductQuery v2ProductQuery) {
        this.AkhnZx = v2ProductQuery;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C26468jcr copydefault() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC26469jcs> djBIcL() {
        return this.fARcdN;
    }

    @yCM
    public C26467jcq(@NotNull iFH ifh, @NotNull InterfaceC23702iGd interfaceC23702iGd, @NotNull C26519jdp c26519jdp, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(ifh, "");
        Intrinsics.checkNotNullParameter(interfaceC23702iGd, "");
        Intrinsics.checkNotNullParameter(c26519jdp, "");
        Intrinsics.checkNotNullParameter(json, "");
        this.djBIcL = ifh;
        this.valueOf = interfaceC23702iGd;
        this.DbNXlk = c26519jdp;
        this.AhwBna = json;
        this.AEQbTJ = StateFlowKt.MutableStateFlow(null);
        MutableStateFlow<InterfaceC26469jcs> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC26469jcs.StateListAnimator.AEQbTJ);
        this.copydefault = MutableStateFlow;
        this.fARcdN = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<InterfaceC26463jcm> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        this.values = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.gEmmrt = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        MutableStateFlow<C55276xgr> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow2;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow2);
        this.fetchVPNInfo = CoroutineScopeKt.plus(ViewModelKt.getViewModelScope(this), SupervisorKt.SupervisorJob((Job) ViewModelKt.getViewModelScope(this).getCoroutineContext().get(Job.Key)));
        this.isConnected = new C26468jcr(null, 0, false, false, 15, null);
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CommonProductListVM$1(this, null), 3, null);
    }

    public final void valueOf() {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CommonProductListVM$refresh$1(this, null), 3, null);
    }

    public final void gEmmrt() {
        if (this.isConnected.KWHzl()) {
            C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CommonProductListVM$loadMore$1(this, null), 3, null);
        } else {
            C27493jwI.safeLaunch$default(this.fetchVPNInfo, null, null, new CommonProductListVM$loadMore$2(this, null), 3, null);
        }
    }

    public final boolean EZpvd(C55276xgr c55276xgr) {
        java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
        iWQ iwq = objOLrzqt instanceof iWQ ? (iWQ) objOLrzqt : null;
        if (iwq == null) {
            return false;
        }
        int iEZpvd = iwq.EZpvd();
        if (iEZpvd == 1) {
            CommonV2Filter value = this.AEQbTJ.getValue();
            if (Intrinsics.EZpvd((java.lang.Object) (value != null ? value.getNetwork() : null), (java.lang.Object) iwq.OLrzqt())) {
                return false;
            }
            C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CommonProductListVM$updateFilters$1(this, iwq, null), 3, null);
            return true;
        }
        if (iEZpvd == 2) {
            CommonV2Filter value2 = this.AEQbTJ.getValue();
            if (Intrinsics.EZpvd((java.lang.Object) (value2 != null ? value2.getProperty() : null), (java.lang.Object) iwq.OLrzqt())) {
                return false;
            }
            C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CommonProductListVM$updateFilters$3(this, iwq, null), 3, null);
            return true;
        }
        if (iEZpvd == 3) {
            CommonV2Filter value3 = this.AEQbTJ.getValue();
            if (Intrinsics.EZpvd((java.lang.Object) (value3 != null ? value3.getFilterTypeId() : null), (java.lang.Object) iwq.OLrzqt())) {
                return false;
            }
            C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CommonProductListVM$updateFilters$2(this, iwq, null), 3, null);
            return true;
        }
        if (iEZpvd == 4) {
            CommonV2Filter value4 = this.AEQbTJ.getValue();
            if (Intrinsics.EZpvd((java.lang.Object) (value4 != null ? value4.getInvestType() : null), (java.lang.Object) iwq.OLrzqt())) {
                return false;
            }
            C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CommonProductListVM$updateFilters$4(this, iwq, null), 3, null);
            return true;
        }
        if (iEZpvd != 5) {
            return false;
        }
        CommonV2Filter value5 = this.AEQbTJ.getValue();
        if (Intrinsics.EZpvd((java.lang.Object) (value5 != null ? value5.getRiskFilterId() : null), (java.lang.Object) iwq.OLrzqt())) {
            return false;
        }
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CommonProductListVM$updateFilters$5(this, iwq, null), 3, null);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v18, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v20, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v23, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v26, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v29, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v31, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v33, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v34, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v35, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v36, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v37, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v38, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.okinc.business.invest_biz.data.bean.CommonV2Filter] */
    public final void OLrzqt(java.util.List<C24148iWr> list) {
        java.lang.Object next;
        java.lang.String strOLrzqt;
        T tCopy$default;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = CommonV2Filter.Companion.KWHzl();
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (C24148iWr c24148iWr : list) {
                C55276xgr c55276xgr = (C55276xgr) CollectionsKt___CollectionsKt.firstOrNull(c24148iWr.KWHzl());
                java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
                iWQ iwq = objOLrzqt instanceof iWQ ? (iWQ) objOLrzqt : null;
                if (iwq != null) {
                    int iEZpvd = iwq.EZpvd();
                    if (iEZpvd == 1) {
                        CommonV2Filter commonV2Filter = (CommonV2Filter) objectRef.element;
                        java.util.Iterator<T> it = c24148iWr.KWHzl().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                if (((C55276xgr) next).AEQbTJ()) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        C55276xgr c55276xgr2 = (C55276xgr) next;
                        java.lang.Object objOLrzqt2 = c55276xgr2 != null ? c55276xgr2.OLrzqt() : null;
                        iWQ iwq2 = objOLrzqt2 instanceof iWQ ? (iWQ) objOLrzqt2 : null;
                        if (iwq2 == null || (strOLrzqt = iwq2.OLrzqt()) == null) {
                            strOLrzqt = iwq.OLrzqt();
                        }
                        tCopy$default = CommonV2Filter.copy$default(commonV2Filter, strOLrzqt, null, null, null, null, 30, null);
                    } else if (iEZpvd == 2) {
                        tCopy$default = CommonV2Filter.copy$default((CommonV2Filter) objectRef.element, null, null, iwq.OLrzqt(), null, null, 27, null);
                    } else if (iEZpvd == 3) {
                        tCopy$default = CommonV2Filter.copy$default((CommonV2Filter) objectRef.element, null, iwq.OLrzqt(), null, null, null, 29, null);
                    } else if (iEZpvd == 4) {
                        tCopy$default = CommonV2Filter.copy$default((CommonV2Filter) objectRef.element, null, null, null, iwq.OLrzqt(), null, 23, null);
                    } else if (iEZpvd == 5) {
                        tCopy$default = CommonV2Filter.copy$default((CommonV2Filter) objectRef.element, null, null, null, null, iwq.OLrzqt(), 15, null);
                    } else {
                        tCopy$default = (CommonV2Filter) objectRef.element;
                    }
                    objectRef.element = tCopy$default;
                }
                arrayList.add(Unit.INSTANCE);
            }
        }
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CommonProductListVM$updateDefaultFilter$2(this, objectRef, null), 3, null);
    }

    public final void AEQbTJ(C55276xgr c55276xgr) {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CommonProductListVM$updateCommonFilter$1(this, c55276xgr, null), 3, null);
    }

    public final void EZpvd(java.lang.Integer num) {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CommonProductListVM$trackViewMoreClick$1(this, num, null), 3, null);
    }

    public final void copydefault(@NotNull CommonV2Filter commonV2Filter) {
        Intrinsics.checkNotNullParameter(commonV2Filter, "");
        AEQbTJ(InterfaceC26469jcs.StateListAnimator.AEQbTJ);
        JobKt__JobKt.cancelChildren$default(this.fetchVPNInfo.getCoroutineContext(), (CancellationException) null, 1, (java.lang.Object) null);
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CommonProductListVM$refreshInternally$1(this, commonV2Filter, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull CommonV2Filter commonV2Filter, int i, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        CommonProductListVM$fetchData$1 commonProductListVM$fetchData$1;
        java.lang.Object objOLrzqt;
        int i2;
        C26467jcq c26467jcq;
        java.lang.Boolean supportPaging;
        java.lang.Object obj;
        C26467jcq c26467jcq2;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        if (continuation instanceof CommonProductListVM$fetchData$1) {
            commonProductListVM$fetchData$1 = (CommonProductListVM$fetchData$1) continuation;
            int i3 = commonProductListVM$fetchData$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                commonProductListVM$fetchData$1.label = i3 - Integer.MIN_VALUE;
            } else {
                commonProductListVM$fetchData$1 = new CommonProductListVM$fetchData$1(this, continuation);
            }
        }
        java.lang.Object obj2 = commonProductListVM$fetchData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = commonProductListVM$fetchData$1.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(obj2);
            V2ProductQuery v2ProductQuery = this.AkhnZx;
            if (v2ProductQuery == null) {
                AEQbTJ(InterfaceC26469jcs.TaskDescription.KWHzl);
                return Unit.INSTANCE;
            }
            boolean zBooleanValue = (v2ProductQuery == null || (supportPaging = v2ProductQuery.getSupportPaging()) == null) ? false : supportPaging.booleanValue();
            V2ProductQuery v2ProductQuery2 = this.AkhnZx;
            int iAhwBna = C33129mqd.AhwBna(v2ProductQuery2 != null ? C56443yFo.AEQbTJ(v2ProductQuery2.getTabId()) : null);
            V2ProductQuery v2ProductQuery3 = this.AkhnZx;
            java.lang.Integer subTabId = v2ProductQuery3 != null ? v2ProductQuery3.getSubTabId() : null;
            V2ProductQuery v2ProductQuery4 = this.AkhnZx;
            java.lang.String itemKey = v2ProductQuery4 != null ? v2ProductQuery4.getItemKey() : null;
            V2ProductQuery v2ProductQuery5 = this.AkhnZx;
            java.lang.Boolean boolIsSearch = v2ProductQuery5 != null ? v2ProductQuery5.isSearch() : null;
            V2ProductQuery v2ProductQuery6 = this.AkhnZx;
            java.util.List<InvestChip> keyword = v2ProductQuery6 != null ? v2ProductQuery6.getKeyword() : null;
            V2ProductQuery v2ProductQuery7 = new V2ProductQuery(iAhwBna, itemKey, zBooleanValue ? C56443yFo.AEQbTJ(i) : null, subTabId, commonV2Filter.getNetwork(), commonV2Filter.getFilterTypeId(), commonV2Filter.getProperty(), null, boolIsSearch, keyword, commonV2Filter.getInvestType(), commonV2Filter.getRiskFilterId(), 128, null);
            iFH ifh = this.djBIcL;
            commonProductListVM$fetchData$1.L$0 = this;
            commonProductListVM$fetchData$1.I$0 = i;
            commonProductListVM$fetchData$1.label = 1;
            objOLrzqt = ifh.OLrzqt(v2ProductQuery7, commonProductListVM$fetchData$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            i2 = i;
            c26467jcq = this;
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                    return Unit.INSTANCE;
                }
                i2 = commonProductListVM$fetchData$1.I$0;
                obj = commonProductListVM$fetchData$1.L$1;
                c26467jcq2 = (C26467jcq) commonProductListVM$fetchData$1.L$0;
                C56391yDq.AEQbTJ(obj2);
                objOLrzqt = obj;
                c26467jcq = c26467jcq2;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objOLrzqt);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.KWHzl(thM7380exceptionOrNullimpl);
                    if (i2 == 1) {
                        c26467jcq.AEQbTJ(InterfaceC26469jcs.TaskDescription.KWHzl);
                    } else {
                        InterfaceC26463jcm.Application application = InterfaceC26463jcm.Application.AEQbTJ;
                        commonProductListVM$fetchData$1.L$0 = objOLrzqt;
                        commonProductListVM$fetchData$1.L$1 = null;
                        commonProductListVM$fetchData$1.label = 3;
                        if (c26467jcq.KWHzl(application, commonProductListVM$fetchData$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            i2 = commonProductListVM$fetchData$1.I$0;
            c26467jcq = (C26467jcq) commonProductListVM$fetchData$1.L$0;
            C56391yDq.AEQbTJ(obj2);
            objOLrzqt = ((Result) obj2).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objOLrzqt)) {
            AggregateData aggregateData = (AggregateData) objOLrzqt;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (i2 != 1) {
                arrayList.addAll(c26467jcq.isConnected.copydefault());
            }
            java.util.List<AggregateItem> listEZpvd = aggregateData.EZpvd();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            java.util.Iterator<T> it = listEZpvd.iterator();
            while (it.hasNext()) {
                arrayList2.add(c26467jcq.DbNXlk.KWHzl((AggregateItem) it.next()));
            }
            arrayList.addAll(arrayList2);
            C26468jcr c26468jcr = new C26468jcr(arrayList, i2, aggregateData.KWHzl(), aggregateData.EZpvd().size() < 20);
            c26467jcq.isConnected = c26468jcr;
            c26467jcq.AEQbTJ(new InterfaceC26469jcs.ActionBar(c26468jcr));
            InterfaceC26463jcm.TaskDescription taskDescription = InterfaceC26463jcm.TaskDescription.EZpvd;
            commonProductListVM$fetchData$1.L$0 = c26467jcq;
            commonProductListVM$fetchData$1.L$1 = objOLrzqt;
            commonProductListVM$fetchData$1.I$0 = i2;
            commonProductListVM$fetchData$1.label = 2;
            if (c26467jcq.KWHzl(taskDescription, commonProductListVM$fetchData$1) == objCopydefault) {
                return objCopydefault;
            }
            obj = objOLrzqt;
            c26467jcq2 = c26467jcq;
            objOLrzqt = obj;
            c26467jcq = c26467jcq2;
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objOLrzqt);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull InterfaceC26469jcs interfaceC26469jcs) {
        Intrinsics.checkNotNullParameter(interfaceC26469jcs, "");
        this.copydefault.setValue(interfaceC26469jcs);
    }

    public final java.lang.Object KWHzl(@NotNull InterfaceC26463jcm interfaceC26463jcm, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objEmit = this.EZpvd.emit(interfaceC26463jcm, continuation);
        return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
    }

    public final ProductJumpParam EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                Json json = this.AhwBna;
                json.getSerializersModule();
                return (ProductJumpParam) json.decodeFromString(ProductJumpParam.Companion.serializer(), str);
            }
        } catch (java.lang.Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: o.jcq$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jcq.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
