package o;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.market.data.model.HomeFavoriteTokenData;
import com.okinc.business.market.features.home_favorite_list.domain.RealtimeFavoriteListUseCase$batchUpdate$1;
import com.okinc.business.market.features.home_favorite_list.domain.RealtimeFavoriteListUseCase$startWs$1$job$1;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kaN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28414kaN {
    public final CoroutineScope AEQbTJ;
    public final StateFlow<java.util.List<C28422kaV>> AYXKKw;
    public final MutableStateFlow<java.util.List<C28422kaV>> EZpvd;
    public final C28413kaM KWHzl;
    public final java.util.List<Job> OLrzqt;
    public final CoroutineDispatcher copydefault;
    public final C28423kaW djBIcL;
    public final kKG valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.util.List<C28422kaV>> EZpvd() {
        return this.AYXKKw;
    }

    @yCM
    public C28414kaN(@NotNull C28423kaW c28423kaW, @NotNull C28413kaM c28413kaM, @NotNull kKG kkg, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c28423kaW, "");
        Intrinsics.checkNotNullParameter(c28413kaM, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.djBIcL = c28423kaW;
        this.KWHzl = c28413kaM;
        this.valueOf = kkg;
        this.copydefault = coroutineDispatcher;
        this.AEQbTJ = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
        this.OLrzqt = new java.util.ArrayList();
        MutableStateFlow<java.util.List<C28422kaV>> MutableStateFlow = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.EZpvd = MutableStateFlow;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006b -> B:20:0x006e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.util.List<HomeFavoriteTokenData> list, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        RealtimeFavoriteListUseCase$batchUpdate$1 realtimeFavoriteListUseCase$batchUpdate$1;
        java.util.Iterator it;
        C28414kaN c28414kaN;
        java.util.Collection collection;
        if (continuation instanceof RealtimeFavoriteListUseCase$batchUpdate$1) {
            realtimeFavoriteListUseCase$batchUpdate$1 = (RealtimeFavoriteListUseCase$batchUpdate$1) continuation;
            int i = realtimeFavoriteListUseCase$batchUpdate$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                realtimeFavoriteListUseCase$batchUpdate$1.label = i - Integer.MIN_VALUE;
            } else {
                realtimeFavoriteListUseCase$batchUpdate$1 = new RealtimeFavoriteListUseCase$batchUpdate$1(this, continuation);
            }
        }
        java.lang.Object obj = realtimeFavoriteListUseCase$batchUpdate$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = realtimeFavoriteListUseCase$batchUpdate$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            it = list.iterator();
            c28414kaN = this;
            collection = arrayList;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (java.util.Iterator) realtimeFavoriteListUseCase$batchUpdate$1.L$2;
            collection = (java.util.Collection) realtimeFavoriteListUseCase$batchUpdate$1.L$1;
            c28414kaN = (C28414kaN) realtimeFavoriteListUseCase$batchUpdate$1.L$0;
            C56391yDq.AEQbTJ(obj);
            java.lang.Object objAEQbTJ = ((Result) obj).m7386unboximpl();
            if (Result.m7383isFailureimpl(objAEQbTJ)) {
                objAEQbTJ = null;
            }
            C28422kaV c28422kaV = (C28422kaV) objAEQbTJ;
            if (c28422kaV != null) {
                collection.add(c28422kaV);
            }
            if (it.hasNext()) {
                HomeFavoriteTokenData homeFavoriteTokenData = (HomeFavoriteTokenData) it.next();
                C28413kaM c28413kaM = c28414kaN.KWHzl;
                realtimeFavoriteListUseCase$batchUpdate$1.L$0 = c28414kaN;
                realtimeFavoriteListUseCase$batchUpdate$1.L$1 = collection;
                realtimeFavoriteListUseCase$batchUpdate$1.L$2 = it;
                realtimeFavoriteListUseCase$batchUpdate$1.label = 1;
                objAEQbTJ = c28413kaM.AEQbTJ(homeFavoriteTokenData, realtimeFavoriteListUseCase$batchUpdate$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                if (Result.m7383isFailureimpl(objAEQbTJ)) {
                }
                C28422kaV c28422kaV2 = (C28422kaV) objAEQbTJ;
                if (c28422kaV2 != null) {
                }
                if (it.hasNext()) {
                    java.util.Iterator it2 = ((java.util.List) collection).iterator();
                    while (it2.hasNext()) {
                        c28414kaN.copydefault((C28422kaV) it2.next());
                    }
                    return Unit.INSTANCE;
                }
            }
        }
    }

    public final void copydefault(@NotNull final C28422kaV c28422kaV) {
        Intrinsics.checkNotNullParameter(c28422kaV, "");
        java.util.List<C28422kaV> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) this.AYXKKw.getValue());
        listFJNWhG.replaceAll(new java.util.function.UnaryOperator() { // from class: o.kaL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return C28414kaN.copydefault(c28422kaV, (C28422kaV) obj);
            }
        });
        this.EZpvd.setValue(listFJNWhG);
    }

    public static final C28422kaV copydefault(C28422kaV c28422kaV, final C28422kaV c28422kaV2) {
        Intrinsics.checkNotNullParameter(c28422kaV2, "");
        if (!Intrinsics.EZpvd((java.lang.Object) c28422kaV2.EZpvd(), (java.lang.Object) c28422kaV.EZpvd()) || !Intrinsics.EZpvd((java.lang.Object) c28422kaV2.AkhnZx(), (java.lang.Object) c28422kaV.AkhnZx())) {
            return c28422kaV2;
        }
        return c28422kaV.OLrzqt(((-249) & 1) != 0 ? c28422kaV.djBIcL : null, ((-249) & 2) != 0 ? c28422kaV.AEQbTJ : null, ((-249) & 4) != 0 ? c28422kaV.fIwbmz : null, ((-249) & 8) != 0 ? c28422kaV.OLrzqt : c28422kaV2.copydefault(), ((-249) & 16) != 0 ? c28422kaV.copydefault : C31256lqb.KWHzl(c28422kaV2.KWHzl(), (Function0<java.lang.String>) new Function0() { // from class: o.kaQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28414kaN.EZpvd(c28422kaV2);
            }
        }), ((-249) & 32) != 0 ? c28422kaV.uzCIH : c28422kaV2.AuCTel(), ((-249) & 64) != 0 ? c28422kaV.getFieldNames : c28422kaV2.fARcdN(), ((-249) & 128) != 0 ? c28422kaV.fJNWhG : c28422kaV2.ejfBZ(), ((-249) & 256) != 0 ? c28422kaV.ejfBZ : null, ((-249) & 512) != 0 ? c28422kaV.QUSxYX : null, ((-249) & 1024) != 0 ? c28422kaV.DTwDnp : null, ((-249) & 2048) != 0 ? c28422kaV.QbewEr : null, ((-249) & 4096) != 0 ? c28422kaV.OcIXYQ : null, ((-249) & 8192) != 0 ? c28422kaV.AYXKKw : null, ((-249) & 16384) != 0 ? c28422kaV.KWHzl : null, ((-249) & 32768) != 0 ? c28422kaV.valueOf : null, ((-249) & 65536) != 0 ? c28422kaV.EZpvd : null, ((-249) & 131072) != 0 ? c28422kaV.fARcdN : null, ((-249) & 262144) != 0 ? c28422kaV.zsXlph : null, ((-249) & 524288) != 0 ? c28422kaV.hDKMBd : null, ((-249) & 1048576) != 0 ? c28422kaV.iwGUEr : null, ((-249) & 2097152) != 0 ? c28422kaV.getNewProxyInstance : null, ((-249) & 4194304) != 0 ? c28422kaV.QKVWgx : null, ((-249) & 8388608) != 0 ? c28422kaV.QOLQEE : null, ((-249) & 16777216) != 0 ? c28422kaV.ORxRYg : null, ((-249) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? c28422kaV.AwvSrB : null, ((-249) & 67108864) != 0 ? c28422kaV.values : null, ((-249) & 134217728) != 0 ? c28422kaV.isConnected : null, ((-249) & 268435456) != 0 ? c28422kaV.AhwBna : null, ((-249) & 536870912) != 0 ? c28422kaV.DbNXlk : null, ((-249) & 1073741824) != 0 ? c28422kaV.AkhnZx : false, ((-249) & Integer.MIN_VALUE) != 0 ? c28422kaV.gEmmrt : null, (1023 & 1) != 0 ? c28422kaV.AuCTelauCTel : null, (1023 & 2) != 0 ? c28422kaV.AubY : null, (1023 & 4) != 0 ? c28422kaV.zLjUOn : null, (1023 & 8) != 0 ? c28422kaV.wlaJM : null, (1023 & 16) != 0 ? c28422kaV.AxsJAY : null, (1023 & 32) != 0 ? c28422kaV.gHZMYf : null, (1023 & 64) != 0 ? c28422kaV.zuBGHE : null, (1023 & 128) != 0 ? c28422kaV.sSMYrx : null, (1023 & 256) != 0 ? c28422kaV.fetchVPNInfo : null, (1023 & 512) != 0 ? c28422kaV.AuCTel : null);
    }

    public static final java.lang.String EZpvd(C28422kaV c28422kaV) {
        return c28422kaV.copydefault();
    }

    public final java.lang.Object copydefault(@NotNull java.util.List<C28422kaV> list) {
        Intrinsics.checkNotNullParameter(list, "");
        try {
            Result.Application application = Result.Companion;
            this.EZpvd.setValue(list);
            if (!C22416heu.ejfBZ()) {
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                for (C28422kaV c28422kaV : list) {
                    arrayList.add(new C28420kaT(c28422kaV.EZpvd(), c28422kaV.AkhnZx(), this.valueOf.copydefault()));
                }
                this.OLrzqt.add(C25389ivm.safeLaunch$default(this.AEQbTJ, null, null, new RealtimeFavoriteListUseCase$startWs$1$job$1(this, arrayList, null), 3, null));
            }
            return Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final java.lang.Object OLrzqt() {
        try {
            Result.Application application = Result.Companion;
            java.util.Iterator<T> it = this.OLrzqt.iterator();
            while (it.hasNext()) {
                Job.DefaultImpls.cancel$default((Job) it.next(), (CancellationException) null, 1, (java.lang.Object) null);
            }
            this.OLrzqt.clear();
            this.djBIcL.EZpvd();
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
