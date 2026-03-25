package o;

import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.find_ui.widgetprovider.logic.AppWidgetSearchViewModel$getFilterFlow$2;
import com.okinc.find_ui.widgetprovider.logic.AppWidgetSearchViewModel$initType$1;
import com.okinc.find_ui.widgetprovider.logic.AppWidgetSearchViewModel$loadCryptoData$1;
import com.okinc.find_ui.widgetprovider.logic.AppWidgetSearchViewModel$loadP2PData$1;
import com.okinc.find_ui.widgetprovider.logic.AppWidgetSearchViewModel$markSelected$2;
import com.okinc.find_ui.widgetprovider.logic.AppWidgetSearchViewModel$switchP2PTradeSide$1;
import com.okinc.find_ui.widgetprovider.p2p.data.P2PPairsInfo;
import com.okinc.find_ui.widgetprovider.p2p.data.P2PTradeSide;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_find.net.BizFindApiService;
import com.okinc.unify_trade.biz.InstrumentInfo;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import o.AbstractC35121npO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.npM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35119npM extends AndroidViewModel {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final MutableStateFlow<java.util.List<Application>> AEQbTJ;
    public boolean AYXKKw;
    public final StateFlow<C35128npV> AhwBna;
    public final MutableStateFlow<java.lang.String> AkhnZx;
    public Job EZpvd;
    public java.util.List<InstrumentInfo> KWHzl;
    public final MutableStateFlow<C35128npV> copydefault;
    public final java.util.Map<P2PTradeSide, java.util.List<P2PPairsInfo>> djBIcL;
    public java.lang.String fetchVPNInfo;
    public boolean gEmmrt;
    public final Mutex isConnected;
    public int valueOf;
    public final StateFlow<java.util.List<Application>> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C35128npV> KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<java.util.List<Application>> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.gEmmrt = z;
    }

    /* JADX INFO: renamed from: o.npM$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.npM.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35119npM(@NotNull android.app.Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "");
        this.AkhnZx = StateFlowKt.MutableStateFlow("");
        MutableStateFlow<C35128npV> MutableStateFlow = StateFlowKt.MutableStateFlow(new C35128npV(false, null, null, null, 15, null));
        this.copydefault = MutableStateFlow;
        this.AhwBna = MutableStateFlow;
        this.djBIcL = new LinkedHashMap();
        this.AEQbTJ = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.isConnected = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX INFO: renamed from: o.npM$Application */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class Application {
        public static final int copydefault = InstrumentInfo.$stable;
        public final boolean AEQbTJ;
        public final int KWHzl;
        public final InstrumentInfo OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, InstrumentInfo instrumentInfo, int i, boolean z, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                instrumentInfo = application.OLrzqt;
            }
            if ((i2 & 2) != 0) {
                i = application.KWHzl;
            }
            if ((i2 & 4) != 0) {
                z = application.AEQbTJ;
            }
            return application.AEQbTJ(instrumentInfo, i, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(@NotNull InstrumentInfo instrumentInfo, int i, boolean z) {
            Intrinsics.checkNotNullParameter(instrumentInfo, "");
            return new Application(instrumentInfo, i, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InstrumentInfo KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.OLrzqt, application.OLrzqt) && this.KWHzl == application.KWHzl && this.AEQbTJ == application.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "BizWrapperInstrumentInfo(info=" + this.OLrzqt + ", isSelected=" + this.KWHzl + ", showCoin=" + this.AEQbTJ + ")";
        }

        public Application(@NotNull InstrumentInfo instrumentInfo, int i, boolean z) {
            Intrinsics.checkNotNullParameter(instrumentInfo, "");
            this.OLrzqt = instrumentInfo;
            this.KWHzl = i;
            this.AEQbTJ = z;
        }

        public int hashCode() {
            return super.hashCode();
        }
    }

    public final void KWHzl(@NotNull AbstractC35121npO abstractC35121npO) {
        Intrinsics.checkNotNullParameter(abstractC35121npO, "");
        if (!(abstractC35121npO instanceof AbstractC35121npO.TaskDescription)) {
            throw new NoWhenBranchMatchedException();
        }
        copydefault(((AbstractC35121npO.TaskDescription) abstractC35121npO).copydefault());
    }

    public final boolean OLrzqt(@NotNull P2PTradeSide p2PTradeSide) {
        Intrinsics.checkNotNullParameter(p2PTradeSide, "");
        return this.djBIcL.containsKey(p2PTradeSide);
    }

    public final void copydefault() {
        this.djBIcL.clear();
        this.AYXKKw = false;
    }

    public final void copydefault(P2PTradeSide p2PTradeSide) {
        if (Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) "P2P_MARKET_PREFS_KEY_STRING")) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), C40440qVy.Companion.AEQbTJ(), null, new AppWidgetSearchViewModel$switchP2PTradeSide$1(this, p2PTradeSide, null), 2, null);
        }
    }

    /* JADX INFO: renamed from: o.npM$ActionBar */
    public static final class ActionBar<T> implements java.util.Comparator {
        public final /* synthetic */ java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) this.AEQbTJ, ((Application) t).KWHzl().getInstId(), 0, false, 6, (java.lang.Object) null);
            if (iIndexOf$default <= -1) {
                iIndexOf$default = 10;
            }
            int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) this.AEQbTJ, ((Application) t2).KWHzl().getInstId(), 0, false, 6, (java.lang.Object) null);
            return yET.KWHzl(java.lang.Integer.valueOf(iIndexOf$default), java.lang.Integer.valueOf(iIndexOf$default2 > -1 ? iIndexOf$default2 : 10));
        }
    }

    /* JADX INFO: renamed from: o.npM$TaskDescription */
    public static final class TaskDescription<T> implements java.util.Comparator {
        public final /* synthetic */ boolean AEQbTJ;
        public final /* synthetic */ java.util.List EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(java.util.List list, boolean z) {
            this.EZpvd = list;
            this.AEQbTJ = z;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.util.List list = this.EZpvd;
            boolean z = this.AEQbTJ;
            InstrumentInfo instrumentInfoKWHzl = ((Application) t).KWHzl();
            int iIndexOf = list.indexOf(z ? C35197nql.AEQbTJ(instrumentInfoKWHzl) : instrumentInfoKWHzl.getInstId());
            if (iIndexOf <= -1) {
                iIndexOf = 10;
            }
            java.util.List list2 = this.EZpvd;
            boolean z2 = this.AEQbTJ;
            InstrumentInfo instrumentInfoKWHzl2 = ((Application) t2).KWHzl();
            int iIndexOf2 = list2.indexOf(z2 ? C35197nql.AEQbTJ(instrumentInfoKWHzl2) : instrumentInfoKWHzl2.getInstId());
            return yET.KWHzl(java.lang.Integer.valueOf(iIndexOf), java.lang.Integer.valueOf(iIndexOf2 > -1 ? iIndexOf2 : 10));
        }
    }

    public final void KWHzl(int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (this.EZpvd != null) {
            return;
        }
        this.valueOf = i;
        this.fetchVPNInfo = str;
        this.EZpvd = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), C40440qVy.Companion.AEQbTJ(), null, new AppWidgetSearchViewModel$initType$1(str, this, i, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(int i, java.lang.String str, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AppWidgetSearchViewModel$loadCryptoData$1 appWidgetSearchViewModel$loadCryptoData$1;
        C35119npM c35119npM;
        java.lang.Throwable th;
        C35119npM c35119npM2;
        java.lang.Object obj;
        java.lang.Object objM7377constructorimpl;
        java.util.List<InstrumentInfo> listAhwBna;
        boolean zKWHzl;
        java.util.ArrayList arrayList;
        if (continuation instanceof AppWidgetSearchViewModel$loadCryptoData$1) {
            appWidgetSearchViewModel$loadCryptoData$1 = (AppWidgetSearchViewModel$loadCryptoData$1) continuation;
            int i2 = appWidgetSearchViewModel$loadCryptoData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                appWidgetSearchViewModel$loadCryptoData$1.label = i2 - Integer.MIN_VALUE;
            } else {
                appWidgetSearchViewModel$loadCryptoData$1 = new AppWidgetSearchViewModel$loadCryptoData$1(this, continuation);
            }
        }
        java.lang.Object obj2 = appWidgetSearchViewModel$loadCryptoData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = appWidgetSearchViewModel$loadCryptoData$1.label;
        java.util.ArrayList arrayList2 = null;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj2);
            try {
                Result.Application application = Result.Companion;
                BizFindApiService bizFindApiService = (BizFindApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizFindApiService.class), null, 1, null);
                appWidgetSearchViewModel$loadCryptoData$1.L$0 = this;
                appWidgetSearchViewModel$loadCryptoData$1.L$1 = str;
                appWidgetSearchViewModel$loadCryptoData$1.L$2 = this;
                appWidgetSearchViewModel$loadCryptoData$1.I$0 = i;
                appWidgetSearchViewModel$loadCryptoData$1.label = 1;
                java.lang.Object simpleInstrumentsInfo = bizFindApiService.getSimpleInstrumentsInfo("SPOT", appWidgetSearchViewModel$loadCryptoData$1);
                if (simpleInstrumentsInfo == objCopydefault) {
                    return objCopydefault;
                }
                c35119npM = this;
                obj = simpleInstrumentsInfo;
                c35119npM2 = c35119npM;
                objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) ((ResponseData) obj).getData());
            } catch (java.lang.Throwable th2) {
                c35119npM = this;
                th = th2;
                c35119npM2 = c35119npM;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                }
                listAhwBna = (java.util.List) objM7377constructorimpl;
                if (listAhwBna == null) {
                }
                c35119npM2.KWHzl = listAhwBna;
                java.util.List<java.lang.String> listKWHzl = C35192nqg.KWHzl(c35119npM.getApplication(), i, str);
                c35119npM.fetchVPNInfo = str;
                if (listKWHzl.size() < C35192nqg.AEQbTJ(str)) {
                }
                zKWHzl = C35192nqg.KWHzl(str);
                java.lang.String stableText$default = C55633xnd.getStableText$default(null, 1, null);
                if (!zKWHzl) {
                }
                if (arrayList2 != null) {
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = appWidgetSearchViewModel$loadCryptoData$1.I$0;
            C35119npM c35119npM3 = (C35119npM) appWidgetSearchViewModel$loadCryptoData$1.L$2;
            java.lang.String str2 = (java.lang.String) appWidgetSearchViewModel$loadCryptoData$1.L$1;
            C35119npM c35119npM4 = (C35119npM) appWidgetSearchViewModel$loadCryptoData$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj2);
                c35119npM2 = c35119npM3;
                str = str2;
                c35119npM = c35119npM4;
                obj = obj2;
            } catch (java.lang.Throwable th3) {
                c35119npM2 = c35119npM3;
                str = str2;
                c35119npM = c35119npM4;
                th = th3;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                }
                listAhwBna = (java.util.List) objM7377constructorimpl;
                if (listAhwBna == null) {
                }
                c35119npM2.KWHzl = listAhwBna;
                java.util.List<java.lang.String> listKWHzl2 = C35192nqg.KWHzl(c35119npM.getApplication(), i, str);
                c35119npM.fetchVPNInfo = str;
                if (listKWHzl2.size() < C35192nqg.AEQbTJ(str)) {
                }
                zKWHzl = C35192nqg.KWHzl(str);
                java.lang.String stableText$default2 = C55633xnd.getStableText$default(null, 1, null);
                if (!zKWHzl) {
                }
                if (arrayList2 != null) {
                }
                return Unit.INSTANCE;
            }
            try {
                objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) ((ResponseData) obj).getData());
            } catch (java.lang.Throwable th4) {
                th = th4;
                Result.Application application222 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        listAhwBna = (java.util.List) objM7377constructorimpl;
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        c35119npM2.KWHzl = listAhwBna;
        java.util.List<java.lang.String> listKWHzl22 = C35192nqg.KWHzl(c35119npM.getApplication(), i, str);
        c35119npM.fetchVPNInfo = str;
        int i4 = listKWHzl22.size() < C35192nqg.AEQbTJ(str) ? 0 : 2;
        zKWHzl = C35192nqg.KWHzl(str);
        java.lang.String stableText$default22 = C55633xnd.getStableText$default(null, 1, null);
        if (!zKWHzl) {
            java.util.List<InstrumentInfo> list = c35119npM.KWHzl;
            if (list != null) {
                java.util.ArrayList<InstrumentInfo> arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj3 : list) {
                    InstrumentInfo instrumentInfo = (InstrumentInfo) obj3;
                    if (!Intrinsics.EZpvd((java.lang.Object) C35197nql.AEQbTJ(instrumentInfo), (java.lang.Object) "USDT") && !Intrinsics.EZpvd((java.lang.Object) C35197nql.AEQbTJ(instrumentInfo), (java.lang.Object) "USDC")) {
                        arrayList3.add(obj3);
                    }
                }
                arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList3, 10));
                for (InstrumentInfo instrumentInfo2 : arrayList3) {
                    arrayList.add(new Application(instrumentInfo2, listKWHzl22.contains(instrumentInfo2.getInstId()) ? 1 : i4, false));
                }
                arrayList2 = arrayList;
            }
        } else {
            java.util.List<InstrumentInfo> list2 = c35119npM.KWHzl;
            if (list2 != null) {
                java.util.ArrayList<InstrumentInfo> arrayList4 = new java.util.ArrayList();
                for (java.lang.Object obj4 : list2) {
                    if (Intrinsics.EZpvd((java.lang.Object) C35197nql.KWHzl((InstrumentInfo) obj4), (java.lang.Object) stableText$default22)) {
                        arrayList4.add(obj4);
                    }
                }
                arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList4, 10));
                for (InstrumentInfo instrumentInfo3 : arrayList4) {
                    arrayList.add(new Application(instrumentInfo3, listKWHzl22.contains(C35197nql.AEQbTJ(instrumentInfo3)) ? 1 : i4, true));
                }
                arrayList2 = arrayList;
            }
        }
        if (arrayList2 != null) {
            java.util.List<Application> listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList2, new TaskDescription(listKWHzl22, zKWHzl));
            C43296rmc.AEQbTJ("AppWidgetSearchViewModel", "initType() called with: recordList = " + arrayList2);
            MutableStateFlow<java.util.List<Application>> mutableStateFlow = c35119npM.AEQbTJ;
            while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), listEZpvd)) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(P2PTradeSide p2PTradeSide, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AppWidgetSearchViewModel$loadP2PData$1 appWidgetSearchViewModel$loadP2PData$1;
        C35119npM c35119npM;
        if (continuation instanceof AppWidgetSearchViewModel$loadP2PData$1) {
            appWidgetSearchViewModel$loadP2PData$1 = (AppWidgetSearchViewModel$loadP2PData$1) continuation;
            int i = appWidgetSearchViewModel$loadP2PData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                appWidgetSearchViewModel$loadP2PData$1.label = i - Integer.MIN_VALUE;
            } else {
                appWidgetSearchViewModel$loadP2PData$1 = new AppWidgetSearchViewModel$loadP2PData$1(this, continuation);
            }
        }
        java.lang.Object p2PWidgetPairs = appWidgetSearchViewModel$loadP2PData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = appWidgetSearchViewModel$loadP2PData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(p2PWidgetPairs);
            BizFindApiService bizFindApiService = (BizFindApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizFindApiService.class), null, 1, null);
            java.lang.String value = p2PTradeSide.getValue();
            appWidgetSearchViewModel$loadP2PData$1.L$0 = this;
            appWidgetSearchViewModel$loadP2PData$1.L$1 = p2PTradeSide;
            appWidgetSearchViewModel$loadP2PData$1.label = 1;
            p2PWidgetPairs = bizFindApiService.getP2PWidgetPairs(value, appWidgetSearchViewModel$loadP2PData$1);
            if (p2PWidgetPairs == objCopydefault) {
                return objCopydefault;
            }
            c35119npM = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p2PTradeSide = (P2PTradeSide) appWidgetSearchViewModel$loadP2PData$1.L$1;
            c35119npM = (C35119npM) appWidgetSearchViewModel$loadP2PData$1.L$0;
            C56391yDq.AEQbTJ(p2PWidgetPairs);
        }
        java.util.List<P2PPairsInfo> listAhwBna = (java.util.List) ((ResponseData) p2PWidgetPairs).getData();
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        c35119npM.djBIcL.put(p2PTradeSide, listAhwBna);
        c35119npM.KWHzl(listAhwBna, p2PTradeSide);
        return Unit.INSTANCE;
    }

    public final java.lang.Object KWHzl(@NotNull Continuation<? super StateFlow<? extends java.util.List<Application>>> continuation) {
        Flow flow = this.values;
        if (flow == null) {
            flow = this.AEQbTJ;
        }
        return FlowKt.stateIn(FlowKt.flowCombine(flow, this.AkhnZx, new AppWidgetSearchViewModel$getFilterFlow$2(this, null)), ViewModelKt.getViewModelScope(this), continuation);
    }

    public final boolean copydefault(java.lang.String str, java.lang.String str2) {
        if (str2.length() == 0) {
            return true;
        }
        java.lang.String strReplace = new Regex("[^a-zA-Z]").replace(str2, "");
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return StringsKt__StringsKt.AhwBna((java.lang.CharSequence) C59449zhJ.replace$default(lowerCase, "-", "", false, 4, (java.lang.Object) null), (java.lang.CharSequence) strReplace, true);
    }

    public final java.lang.Object EZpvd(@NotNull Application application, boolean z, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext;
        return (application.OLrzqt() != z && (objWithContext = BuildersKt.withContext(Dispatchers.getDefault(), new AppWidgetSearchViewModel$markSelected$2(this, z, application, null), continuation)) == C56442yFn.copydefault()) ? objWithContext : Unit.INSTANCE;
    }

    public final void KWHzl(java.util.List<P2PPairsInfo> list, P2PTradeSide p2PTradeSide) {
        int i;
        C35128npV value;
        java.lang.String fiat;
        java.util.ArrayList<InstrumentInfo> arrayList = new java.util.ArrayList();
        for (P2PPairsInfo p2PPairsInfo : list) {
            java.lang.String crypto = p2PPairsInfo.getCrypto();
            InstrumentInfo instrumentInfo = (crypto == null || (fiat = p2PPairsInfo.getFiat()) == null) ? null : new InstrumentInfo((java.lang.String) null, crypto + "-" + fiat, (java.lang.String) null, crypto, fiat, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, -27, -1, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
            if (instrumentInfo != null) {
                arrayList.add(instrumentInfo);
            }
        }
        this.KWHzl = arrayList;
        java.lang.String strKWHzl = C35127npU.KWHzl(getApplication(), this.valueOf);
        java.lang.String strEZpvd = C35127npU.EZpvd(getApplication(), this.valueOf);
        java.lang.String strCopydefault = C35127npU.copydefault(getApplication(), this.valueOf);
        if (strEZpvd.length() <= 0 || !Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) p2PTradeSide.getValue()) || arrayList.isEmpty()) {
            i = 0;
        } else {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((java.lang.Object) ((InstrumentInfo) it.next()).getInstId(), (java.lang.Object) strEZpvd)) {
                    i = 2;
                    break;
                }
            }
            i = 0;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (InstrumentInfo instrumentInfo2 : arrayList) {
            arrayList2.add(new Application(instrumentInfo2, (Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) instrumentInfo2.getInstId()) && Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) p2PTradeSide.getValue())) ? 1 : i, false));
        }
        java.util.List<Application> listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList2, new ActionBar(strKWHzl));
        MutableStateFlow<java.util.List<Application>> mutableStateFlow = this.AEQbTJ;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), listEZpvd)) {
        }
        MutableStateFlow<C35128npV> mutableStateFlow2 = this.copydefault;
        do {
            value = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.compareAndSet(value, C35128npV.copy$default(value, false, null, p2PTradeSide, list, 3, null)));
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        MutableStateFlow<java.lang.String> mutableStateFlow = this.AkhnZx;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), C59449zhJ.replace$default(C59449zhJ.replace$default(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString(), "-", "", false, 4, (java.lang.Object) null), "/", "", false, 4, (java.lang.Object) null))) {
        }
    }
}
