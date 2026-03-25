package o;

import com.okinc.business.market.data.model.HomeTokenListWsData;
import com.okinc.business.market.features.filter.domain.AdvancedFilter;
import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import com.okinc.business.market.features.home_token_list.domain.RealtimeHomeTokenListUseCase$collectChunk$1;
import com.okinc.business.market.features.home_token_list.domain.RealtimeHomeTokenListUseCase$startWs$1;
import com.okinc.business.market.features.home_token_list.domain.RealtimeHomeTokenListUseCase$startWs$2$1$1;
import com.okinc.business.market.features.home_token_list.domain.RealtimeHomeTokenListUseCase$startWsgIAlus$$inlined$dexRunCatching$1;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kcg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28539kcg {
    public final C25980jNm AEQbTJ;
    public final CoroutineScope AYXKKw;
    public final C28546kcn AhwBna;
    public final jUB EZpvd;
    public final MutableSharedFlow<java.util.List<HomeToken>> KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final C28540kch copydefault;
    public final SharedFlow<java.util.List<HomeToken>> djBIcL;
    public final kKG gEmmrt;
    public final C28544kcl valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<java.util.List<HomeToken>> copydefault() {
        return this.djBIcL;
    }

    @yCM
    public C28539kcg(@NotNull kKG kkg, @NotNull C28540kch c28540kch, @NotNull C25980jNm c25980jNm, @NotNull C28544kcl c28544kcl, @NotNull C28546kcn c28546kcn, @NotNull jUB jub, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c28540kch, "");
        Intrinsics.checkNotNullParameter(c25980jNm, "");
        Intrinsics.checkNotNullParameter(c28544kcl, "");
        Intrinsics.checkNotNullParameter(c28546kcn, "");
        Intrinsics.checkNotNullParameter(jub, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.gEmmrt = kkg;
        this.copydefault = c28540kch;
        this.AEQbTJ = c25980jNm;
        this.valueOf = c28544kcl;
        this.AhwBna = c28546kcn;
        this.EZpvd = jub;
        this.OLrzqt = coroutineDispatcher;
        this.AYXKKw = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
        MutableSharedFlow<java.util.List<HomeToken>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default;
        this.djBIcL = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(AdvancedFilter advancedFilter, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        RealtimeHomeTokenListUseCase$startWs$1 realtimeHomeTokenListUseCase$startWs$1;
        if (continuation instanceof RealtimeHomeTokenListUseCase$startWs$1) {
            realtimeHomeTokenListUseCase$startWs$1 = (RealtimeHomeTokenListUseCase$startWs$1) continuation;
            int i = realtimeHomeTokenListUseCase$startWs$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                realtimeHomeTokenListUseCase$startWs$1.label = i - Integer.MIN_VALUE;
            } else {
                realtimeHomeTokenListUseCase$startWs$1 = new RealtimeHomeTokenListUseCase$startWs$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = realtimeHomeTokenListUseCase$startWs$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = realtimeHomeTokenListUseCase$startWs$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            RealtimeHomeTokenListUseCase$startWsgIAlus$$inlined$dexRunCatching$1 realtimeHomeTokenListUseCase$startWsgIAlus$$inlined$dexRunCatching$1 = new RealtimeHomeTokenListUseCase$startWsgIAlus$$inlined$dexRunCatching$1(null, this, advancedFilter);
            realtimeHomeTokenListUseCase$startWs$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, realtimeHomeTokenListUseCase$startWsgIAlus$$inlined$dexRunCatching$1, realtimeHomeTokenListUseCase$startWs$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX INFO: renamed from: o.kcg$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(HomeTokenListWsData homeTokenListWsData, Continuation<? super Unit> continuation) {
            BuildersKt__Builders_commonKt.launch$default(C28539kcg.this.AYXKKw, null, null, new RealtimeHomeTokenListUseCase$startWs$2$1$1(C28539kcg.this, homeTokenListWsData, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0123 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0121 -> B:18:0x0064). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull HomeTokenListWsData homeTokenListWsData, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        RealtimeHomeTokenListUseCase$collectChunk$1 realtimeHomeTokenListUseCase$collectChunk$1;
        java.lang.Object objEZpvd;
        C28539kcg c28539kcg;
        java.util.Collection arrayList;
        java.util.Iterator it;
        C28539kcg c28539kcg2;
        java.lang.Object obj;
        java.util.Collection collection;
        java.util.Iterator it2;
        HomeToken homeToken;
        java.util.Collection collection2;
        java.lang.Object objM7386unboximpl;
        java.lang.String str;
        java.lang.Object objAEQbTJ;
        if (continuation instanceof RealtimeHomeTokenListUseCase$collectChunk$1) {
            realtimeHomeTokenListUseCase$collectChunk$1 = (RealtimeHomeTokenListUseCase$collectChunk$1) continuation;
            int i = realtimeHomeTokenListUseCase$collectChunk$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                realtimeHomeTokenListUseCase$collectChunk$1.label = i - Integer.MIN_VALUE;
            } else {
                realtimeHomeTokenListUseCase$collectChunk$1 = new RealtimeHomeTokenListUseCase$collectChunk$1(this, continuation);
            }
        }
        java.lang.Object obj2 = realtimeHomeTokenListUseCase$collectChunk$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = realtimeHomeTokenListUseCase$collectChunk$1.label;
        int i3 = 2;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj2);
            C28540kch c28540kch = this.copydefault;
            realtimeHomeTokenListUseCase$collectChunk$1.L$0 = this;
            realtimeHomeTokenListUseCase$collectChunk$1.label = 1;
            objEZpvd = c28540kch.EZpvd(homeTokenListWsData, realtimeHomeTokenListUseCase$collectChunk$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c28539kcg = this;
        } else if (i2 == 1) {
            c28539kcg = (C28539kcg) realtimeHomeTokenListUseCase$collectChunk$1.L$0;
            C56391yDq.AEQbTJ(obj2);
            objEZpvd = ((Result) obj2).m7386unboximpl();
        } else if (i2 == 2) {
            java.util.Collection collection3 = (java.util.Collection) realtimeHomeTokenListUseCase$collectChunk$1.L$5;
            HomeToken homeToken2 = (HomeToken) realtimeHomeTokenListUseCase$collectChunk$1.L$4;
            java.util.Iterator it3 = (java.util.Iterator) realtimeHomeTokenListUseCase$collectChunk$1.L$3;
            java.util.Collection collection4 = (java.util.Collection) realtimeHomeTokenListUseCase$collectChunk$1.L$2;
            java.lang.Object obj3 = realtimeHomeTokenListUseCase$collectChunk$1.L$1;
            C28539kcg c28539kcg3 = (C28539kcg) realtimeHomeTokenListUseCase$collectChunk$1.L$0;
            C56391yDq.AEQbTJ(obj2);
            objM7386unboximpl = ((Result) obj2).m7386unboximpl();
            c28539kcg2 = c28539kcg3;
            obj = obj3;
            collection = collection4;
            it2 = it3;
            homeToken = homeToken2;
            collection2 = collection3;
            if (Result.m7380exceptionOrNullimpl(objM7386unboximpl) != null) {
            }
            str = (java.lang.String) objM7386unboximpl;
            C25980jNm c25980jNm = c28539kcg2.AEQbTJ;
            java.lang.String strOLrzqt = homeToken.OLrzqt();
            realtimeHomeTokenListUseCase$collectChunk$1.L$0 = c28539kcg2;
            realtimeHomeTokenListUseCase$collectChunk$1.L$1 = obj;
            realtimeHomeTokenListUseCase$collectChunk$1.L$2 = collection;
            realtimeHomeTokenListUseCase$collectChunk$1.L$3 = it2;
            realtimeHomeTokenListUseCase$collectChunk$1.L$4 = homeToken;
            realtimeHomeTokenListUseCase$collectChunk$1.L$5 = collection2;
            realtimeHomeTokenListUseCase$collectChunk$1.L$6 = str;
            realtimeHomeTokenListUseCase$collectChunk$1.label = 3;
            objAEQbTJ = c25980jNm.AEQbTJ(strOLrzqt, realtimeHomeTokenListUseCase$collectChunk$1);
            if (objAEQbTJ == objCopydefault) {
            }
            java.lang.String str2 = str;
            c28539kcg = c28539kcg2;
            HomeToken homeToken3 = homeToken;
            arrayList = collection;
            if (Result.m7380exceptionOrNullimpl(objAEQbTJ) != null) {
            }
            collection2.add(homeToken3.EZpvd((1048541 & 1) != 0 ? homeToken3.AEQbTJ : null, (1048541 & 2) != 0 ? homeToken3.KWHzl : (java.lang.String) objAEQbTJ, (1048541 & 4) != 0 ? homeToken3.fetchVPNInfo : null, (1048541 & 8) != 0 ? homeToken3.fARcdN : null, (1048541 & 16) != 0 ? homeToken3.fIwbmz : null, (1048541 & 32) != 0 ? homeToken3.OLrzqt : str2, (1048541 & 64) != 0 ? homeToken3.AkhnZx : null, (1048541 & 128) != 0 ? homeToken3.EZpvd : null, (1048541 & 256) != 0 ? homeToken3.ejfBZ : null, (1048541 & 512) != 0 ? homeToken3.copydefault : null, (1048541 & 1024) != 0 ? homeToken3.DbNXlk : null, (1048541 & 2048) != 0 ? homeToken3.AuCTel : null, (1048541 & 4096) != 0 ? homeToken3.fJNWhG : null, (1048541 & 8192) != 0 ? homeToken3.gEmmrt : null, (1048541 & 16384) != 0 ? homeToken3.djBIcL : null, (1048541 & 32768) != 0 ? homeToken3.AhwBna : null, (1048541 & 65536) != 0 ? homeToken3.AYXKKw : false, (1048541 & 131072) != 0 ? homeToken3.values : null, (1048541 & 262144) != 0 ? homeToken3.valueOf : null, (1048541 & 524288) != 0 ? homeToken3.isConnected : null));
            it = it2;
            objEZpvd = obj;
            i3 = 2;
            if (!it.hasNext()) {
            }
        } else {
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj2);
                return Unit.INSTANCE;
            }
            str = (java.lang.String) realtimeHomeTokenListUseCase$collectChunk$1.L$6;
            collection2 = (java.util.Collection) realtimeHomeTokenListUseCase$collectChunk$1.L$5;
            homeToken = (HomeToken) realtimeHomeTokenListUseCase$collectChunk$1.L$4;
            it2 = (java.util.Iterator) realtimeHomeTokenListUseCase$collectChunk$1.L$3;
            collection = (java.util.Collection) realtimeHomeTokenListUseCase$collectChunk$1.L$2;
            obj = realtimeHomeTokenListUseCase$collectChunk$1.L$1;
            c28539kcg2 = (C28539kcg) realtimeHomeTokenListUseCase$collectChunk$1.L$0;
            C56391yDq.AEQbTJ(obj2);
            objAEQbTJ = ((Result) obj2).m7386unboximpl();
            java.lang.String str22 = str;
            c28539kcg = c28539kcg2;
            HomeToken homeToken32 = homeToken;
            arrayList = collection;
            if (Result.m7380exceptionOrNullimpl(objAEQbTJ) != null) {
                objAEQbTJ = "";
            }
            collection2.add(homeToken32.EZpvd((1048541 & 1) != 0 ? homeToken32.AEQbTJ : null, (1048541 & 2) != 0 ? homeToken32.KWHzl : (java.lang.String) objAEQbTJ, (1048541 & 4) != 0 ? homeToken32.fetchVPNInfo : null, (1048541 & 8) != 0 ? homeToken32.fARcdN : null, (1048541 & 16) != 0 ? homeToken32.fIwbmz : null, (1048541 & 32) != 0 ? homeToken32.OLrzqt : str22, (1048541 & 64) != 0 ? homeToken32.AkhnZx : null, (1048541 & 128) != 0 ? homeToken32.EZpvd : null, (1048541 & 256) != 0 ? homeToken32.ejfBZ : null, (1048541 & 512) != 0 ? homeToken32.copydefault : null, (1048541 & 1024) != 0 ? homeToken32.DbNXlk : null, (1048541 & 2048) != 0 ? homeToken32.AuCTel : null, (1048541 & 4096) != 0 ? homeToken32.fJNWhG : null, (1048541 & 8192) != 0 ? homeToken32.gEmmrt : null, (1048541 & 16384) != 0 ? homeToken32.djBIcL : null, (1048541 & 32768) != 0 ? homeToken32.AhwBna : null, (1048541 & 65536) != 0 ? homeToken32.AYXKKw : false, (1048541 & 131072) != 0 ? homeToken32.values : null, (1048541 & 262144) != 0 ? homeToken32.valueOf : null, (1048541 & 524288) != 0 ? homeToken32.isConnected : null));
            it = it2;
            objEZpvd = obj;
            i3 = 2;
            if (!it.hasNext()) {
                HomeToken homeToken4 = (HomeToken) it.next();
                C25980jNm c25980jNm2 = c28539kcg.AEQbTJ;
                java.lang.String strOLrzqt2 = homeToken4.OLrzqt();
                realtimeHomeTokenListUseCase$collectChunk$1.L$0 = c28539kcg;
                realtimeHomeTokenListUseCase$collectChunk$1.L$1 = objEZpvd;
                realtimeHomeTokenListUseCase$collectChunk$1.L$2 = arrayList;
                realtimeHomeTokenListUseCase$collectChunk$1.L$3 = it;
                realtimeHomeTokenListUseCase$collectChunk$1.L$4 = homeToken4;
                realtimeHomeTokenListUseCase$collectChunk$1.L$5 = arrayList;
                realtimeHomeTokenListUseCase$collectChunk$1.L$6 = null;
                realtimeHomeTokenListUseCase$collectChunk$1.label = i3;
                java.lang.Object objCopydefault2 = c25980jNm2.copydefault(strOLrzqt2, realtimeHomeTokenListUseCase$collectChunk$1);
                if (objCopydefault2 == objCopydefault) {
                    return objCopydefault;
                }
                obj = objEZpvd;
                c28539kcg2 = c28539kcg;
                objM7386unboximpl = objCopydefault2;
                collection = arrayList;
                homeToken = homeToken4;
                it2 = it;
                collection2 = collection;
                if (Result.m7380exceptionOrNullimpl(objM7386unboximpl) != null) {
                    objM7386unboximpl = "";
                }
                str = (java.lang.String) objM7386unboximpl;
                C25980jNm c25980jNm3 = c28539kcg2.AEQbTJ;
                java.lang.String strOLrzqt3 = homeToken.OLrzqt();
                realtimeHomeTokenListUseCase$collectChunk$1.L$0 = c28539kcg2;
                realtimeHomeTokenListUseCase$collectChunk$1.L$1 = obj;
                realtimeHomeTokenListUseCase$collectChunk$1.L$2 = collection;
                realtimeHomeTokenListUseCase$collectChunk$1.L$3 = it2;
                realtimeHomeTokenListUseCase$collectChunk$1.L$4 = homeToken;
                realtimeHomeTokenListUseCase$collectChunk$1.L$5 = collection2;
                realtimeHomeTokenListUseCase$collectChunk$1.L$6 = str;
                realtimeHomeTokenListUseCase$collectChunk$1.label = 3;
                objAEQbTJ = c25980jNm3.AEQbTJ(strOLrzqt3, realtimeHomeTokenListUseCase$collectChunk$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                java.lang.String str222 = str;
                c28539kcg = c28539kcg2;
                HomeToken homeToken322 = homeToken;
                arrayList = collection;
                if (Result.m7380exceptionOrNullimpl(objAEQbTJ) != null) {
                }
                collection2.add(homeToken322.EZpvd((1048541 & 1) != 0 ? homeToken322.AEQbTJ : null, (1048541 & 2) != 0 ? homeToken322.KWHzl : (java.lang.String) objAEQbTJ, (1048541 & 4) != 0 ? homeToken322.fetchVPNInfo : null, (1048541 & 8) != 0 ? homeToken322.fARcdN : null, (1048541 & 16) != 0 ? homeToken322.fIwbmz : null, (1048541 & 32) != 0 ? homeToken322.OLrzqt : str222, (1048541 & 64) != 0 ? homeToken322.AkhnZx : null, (1048541 & 128) != 0 ? homeToken322.EZpvd : null, (1048541 & 256) != 0 ? homeToken322.ejfBZ : null, (1048541 & 512) != 0 ? homeToken322.copydefault : null, (1048541 & 1024) != 0 ? homeToken322.DbNXlk : null, (1048541 & 2048) != 0 ? homeToken322.AuCTel : null, (1048541 & 4096) != 0 ? homeToken322.fJNWhG : null, (1048541 & 8192) != 0 ? homeToken322.gEmmrt : null, (1048541 & 16384) != 0 ? homeToken322.djBIcL : null, (1048541 & 32768) != 0 ? homeToken322.AhwBna : null, (1048541 & 65536) != 0 ? homeToken322.AYXKKw : false, (1048541 & 131072) != 0 ? homeToken322.values : null, (1048541 & 262144) != 0 ? homeToken322.valueOf : null, (1048541 & 524288) != 0 ? homeToken322.isConnected : null));
                it = it2;
                objEZpvd = obj;
                i3 = 2;
                if (!it.hasNext()) {
                    java.util.List<HomeToken> list = (java.util.List) arrayList;
                    if (!list.isEmpty()) {
                        MutableSharedFlow<java.util.List<HomeToken>> mutableSharedFlow = c28539kcg.KWHzl;
                        realtimeHomeTokenListUseCase$collectChunk$1.L$0 = objEZpvd;
                        realtimeHomeTokenListUseCase$collectChunk$1.L$1 = null;
                        realtimeHomeTokenListUseCase$collectChunk$1.L$2 = null;
                        realtimeHomeTokenListUseCase$collectChunk$1.L$3 = null;
                        realtimeHomeTokenListUseCase$collectChunk$1.L$4 = null;
                        realtimeHomeTokenListUseCase$collectChunk$1.L$5 = null;
                        realtimeHomeTokenListUseCase$collectChunk$1.L$6 = null;
                        realtimeHomeTokenListUseCase$collectChunk$1.label = 4;
                        if (mutableSharedFlow.emit(list, realtimeHomeTokenListUseCase$collectChunk$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
        }
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            java.util.List list2 = (java.util.List) objEZpvd;
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
            it = list2.iterator();
            if (!it.hasNext()) {
            }
        }
        return Unit.INSTANCE;
    }

    public final java.lang.Object OLrzqt() {
        try {
            Result.Application application = Result.Companion;
            this.AhwBna.OLrzqt();
            return Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
