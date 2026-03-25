package o;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.market.data.model.position_pnl.HoldingTokenData;
import com.okinc.business.market.data.model.position_pnl.HoldingTransactionData;
import com.okinc.business.market.features.holdings.domain.GetHoldingsUseCase$getActivePositionFilter$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.holdings.domain.GetHoldingsUseCase$getActivePositionFilter$1;
import com.okinc.business.market.features.holdings.domain.GetHoldingsUseCase$invoke$1;
import com.okinc.business.market.features.holdings.domain.GetHoldingsUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.holdings.domain.GetHoldingsUseCase$setHideNativeToken$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.holdings.domain.GetHoldingsUseCase$setHideNativeToken$1;
import com.okinc.business.market.features.holdings.domain.GetHoldingsUseCase$startWebSocketSubscriptions$1;
import com.okinc.business.market.features.holdings.domain.GetHoldingsUseCase$startWebSocketSubscriptions$2;
import com.okinc.business.market.features.holdings.domain.GetHoldingsUseCase$startWebSocketSubscriptions$3;
import com.okinc.business.market.features.holdings.domain.GetHoldingsUseCase$triggerDebouncedAssetUpdate$1;
import com.okinc.business.market.features.holdings.domain.model.HoldingAsset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kah, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28434kah {
    public final C27670jza AEQbTJ;
    public final C28433kag AYXKKw;
    public final AtomicReference<Job> AhwBna;
    public final CoroutineScope DbNXlk;
    public final CoroutineDispatcher EZpvd;
    public final AtomicReference<Job> KWHzl;
    public final java.lang.String OLrzqt;
    public java.util.List<java.lang.String> copydefault;
    public final ConcurrentHashMap<java.lang.String, java.lang.String> djBIcL;
    public final kKG fetchVPNInfo;
    public final ConcurrentHashMap<java.lang.String, HoldingAsset> gEmmrt;
    public final InterfaceC28437kak isConnected;
    public final MutableSharedFlow<java.util.List<HoldingAsset>> valueOf;
    public java.util.List<HoldingAsset> values;

    @yCM
    public C28434kah(@NotNull InterfaceC28437kak interfaceC28437kak, @NotNull kKG kkg, @NotNull C28433kag c28433kag, @NotNull C27670jza c27670jza, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC28437kak, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c28433kag, "");
        Intrinsics.checkNotNullParameter(c27670jza, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.isConnected = interfaceC28437kak;
        this.fetchVPNInfo = kkg;
        this.AYXKKw = c28433kag;
        this.AEQbTJ = c27670jza;
        this.EZpvd = coroutineDispatcher;
        this.DbNXlk = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
        this.OLrzqt = "subAsset-dexFloatWindow";
        this.KWHzl = new AtomicReference<>(null);
        this.AhwBna = new AtomicReference<>(null);
        this.djBIcL = new ConcurrentHashMap<>();
        this.gEmmrt = new ConcurrentHashMap<>();
        this.values = new java.util.ArrayList();
        this.valueOf = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = yDY.AhwBna();
    }

    /* JADX INFO: renamed from: invoke-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8660invokeBWLJW6A$default(C28434kah c28434kah, java.lang.String str, boolean z, C28443kaq c28443kaq, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "all";
        }
        if ((i & 4) != 0) {
            c28443kaq = null;
        }
        return c28434kah.OLrzqt(str, z, c28443kaq, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, boolean z, C28443kaq c28443kaq, @NotNull Continuation<? super Result<? extends java.util.List<HoldingAsset>>> continuation) throws java.lang.Throwable {
        GetHoldingsUseCase$invoke$1 getHoldingsUseCase$invoke$1;
        if (continuation instanceof GetHoldingsUseCase$invoke$1) {
            getHoldingsUseCase$invoke$1 = (GetHoldingsUseCase$invoke$1) continuation;
            int i = getHoldingsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getHoldingsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getHoldingsUseCase$invoke$1 = new GetHoldingsUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getHoldingsUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getHoldingsUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            GetHoldingsUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 getHoldingsUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 = new GetHoldingsUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(null, c28443kaq, this, str, z);
            getHoldingsUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getHoldingsUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1, getHoldingsUseCase$invoke$1);
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

    public final java.lang.Object AEQbTJ(@NotNull java.util.List<HoldingAsset> list, @NotNull Function0<Unit> function0, @NotNull Continuation<? super Flow<? extends java.util.List<HoldingAsset>>> continuation) {
        if (C22416heu.ejfBZ()) {
            return FlowKt.emptyFlow();
        }
        this.values = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list);
        AEQbTJ(function0);
        return this.valueOf;
    }

    public final void AEQbTJ(Function0<Unit> function0) {
        C25389ivm.safeLaunch$default(this.DbNXlk, null, null, new GetHoldingsUseCase$startWebSocketSubscriptions$1(this, function0, null), 3, null);
        C25389ivm.safeLaunch$default(this.DbNXlk, null, null, new GetHoldingsUseCase$startWebSocketSubscriptions$2(this, null), 3, null);
        C25389ivm.safeLaunch$default(this.DbNXlk, null, null, new GetHoldingsUseCase$startWebSocketSubscriptions$3(this, null), 3, null);
    }

    public final void copydefault() {
        this.gEmmrt.clear();
        this.djBIcL.clear();
        this.isConnected.OLrzqt();
        this.isConnected.EZpvd();
    }

    public final void EZpvd() {
        Job andSet = this.KWHzl.getAndSet(C25389ivm.safeLaunch$default(this.DbNXlk, null, null, new GetHoldingsUseCase$triggerDebouncedAssetUpdate$1(this, null), 3, null));
        if (andSet != null) {
            Job.DefaultImpls.cancel$default(andSet, (CancellationException) null, 1, (java.lang.Object) null);
        }
    }

    public static /* synthetic */ void updatePnLByPrice$default(C28434kah c28434kah, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        c28434kah.OLrzqt(str, str2);
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        float fDjBIcL;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        kotlin.Pair<java.lang.String, java.lang.String> pairKWHzl = KWHzl(str);
        java.lang.String strComponent1 = pairKWHzl.component1();
        java.lang.String strComponent2 = pairKWHzl.component2();
        java.util.Iterator<HoldingAsset> it = this.values.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            HoldingAsset next = it.next();
            java.lang.String strFetchVPNInfo = next.fetchVPNInfo();
            java.util.Locale locale = java.util.Locale.ROOT;
            java.lang.String lowerCase = strFetchVPNInfo.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            java.lang.String lowerCase2 = strComponent1.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            if (Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) lowerCase2) && Intrinsics.EZpvd((java.lang.Object) strComponent2, (java.lang.Object) next.OLrzqt())) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            final HoldingAsset holdingAsset = this.values.get(i);
            float fDjBIcL2 = C33129mqd.djBIcL(C31256lqb.KWHzl(str2, (Function0<java.lang.String>) new Function0() { // from class: o.kaf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C28434kah.OLrzqt(holdingAsset);
                }
            }));
            if (C33129mqd.OLrzqt((java.lang.CharSequence) holdingAsset.EZpvd())) {
                fDjBIcL = java.lang.Math.min(C33129mqd.djBIcL(holdingAsset.EZpvd()), C33129mqd.djBIcL(holdingAsset.values()));
            } else {
                fDjBIcL = C33129mqd.djBIcL(holdingAsset.values());
            }
            float fDjBIcL3 = (fDjBIcL2 - C33129mqd.djBIcL(holdingAsset.AYXKKw())) * fDjBIcL;
            java.lang.Object objValueOf = C33129mqd.djBIcL(holdingAsset.AYXKKw()) == 0.0f ? "" : java.lang.Float.valueOf((100 * (fDjBIcL2 - C33129mqd.djBIcL(holdingAsset.AYXKKw()))) / C33129mqd.djBIcL(holdingAsset.AYXKKw()));
            float fDjBIcL4 = C33129mqd.djBIcL(holdingAsset.valueOf()) + fDjBIcL3;
            this.values.set(i, holdingAsset.OLrzqt((2021653471 & 1) != 0 ? holdingAsset.AEQbTJ : null, (2021653471 & 2) != 0 ? holdingAsset.EZpvd : null, (2021653471 & 4) != 0 ? holdingAsset.uzCIH : null, (2021653471 & 8) != 0 ? holdingAsset.iwGUEr : null, (2021653471 & 16) != 0 ? holdingAsset.getFieldNames : null, (2021653471 & 32) != 0 ? holdingAsset.fIwbmz : java.lang.String.valueOf(fDjBIcL2), (2021653471 & 64) != 0 ? holdingAsset.copydefault : null, (2021653471 & 128) != 0 ? holdingAsset.KWHzl : null, (2021653471 & 256) != 0 ? holdingAsset.OLrzqt : null, (2021653471 & 512) != 0 ? holdingAsset.djBIcL : null, (2021653471 & 1024) != 0 ? holdingAsset.gEmmrt : java.lang.String.valueOf(C33129mqd.djBIcL(holdingAsset.EZpvd()) * fDjBIcL2), (2021653471 & 2048) != 0 ? holdingAsset.AYXKKw : null, (2021653471 & 4096) != 0 ? holdingAsset.AhwBna : false, (2021653471 & 8192) != 0 ? holdingAsset.fetchVPNInfo : false, (2021653471 & 16384) != 0 ? holdingAsset.AkhnZx : null, (2021653471 & 32768) != 0 ? holdingAsset.values : false, (2021653471 & 65536) != 0 ? holdingAsset.DbNXlk : false, (2021653471 & 131072) != 0 ? holdingAsset.getNewProxyInstance : false, (2021653471 & 262144) != 0 ? holdingAsset.isConnected : null, (2021653471 & 524288) != 0 ? holdingAsset.fARcdN : null, (2021653471 & 1048576) != 0 ? holdingAsset.fJNWhG : null, (2021653471 & 2097152) != 0 ? holdingAsset.AuCTel : null, (2021653471 & 4194304) != 0 ? holdingAsset.hDKMBd : null, (2021653471 & 8388608) != 0 ? holdingAsset.wlaJM : holdingAsset.ejfBZ() ? java.lang.String.valueOf(fDjBIcL4) : "", (2021653471 & 16777216) != 0 ? holdingAsset.AubY : holdingAsset.ejfBZ() ? java.lang.String.valueOf((C33129mqd.djBIcL(java.lang.Float.valueOf(fDjBIcL4)) / C33129mqd.djBIcL(holdingAsset.copydefault())) * 100) : "", (2021653471 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? holdingAsset.zsXlph : holdingAsset.ejfBZ() ? java.lang.String.valueOf(fDjBIcL3) : "", (2021653471 & 67108864) != 0 ? holdingAsset.AuCTelauCTel : holdingAsset.ejfBZ() ? objValueOf.toString() : "", (2021653471 & 134217728) != 0 ? holdingAsset.zLjUOn : null, (2021653471 & 268435456) != 0 ? holdingAsset.AwvSrB : null, (2021653471 & 536870912) != 0 ? holdingAsset.ejfBZ : false, (2021653471 & 1073741824) != 0 ? holdingAsset.valueOf : false));
        }
    }

    public static final java.lang.String OLrzqt(HoldingAsset holdingAsset) {
        return holdingAsset.AhwBna();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull Continuation<? super C28443kaq> continuation) {
        GetHoldingsUseCase$getActivePositionFilter$1 getHoldingsUseCase$getActivePositionFilter$1;
        if (continuation instanceof GetHoldingsUseCase$getActivePositionFilter$1) {
            getHoldingsUseCase$getActivePositionFilter$1 = (GetHoldingsUseCase$getActivePositionFilter$1) continuation;
            int i = getHoldingsUseCase$getActivePositionFilter$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getHoldingsUseCase$getActivePositionFilter$1.label = i - Integer.MIN_VALUE;
            } else {
                getHoldingsUseCase$getActivePositionFilter$1 = new GetHoldingsUseCase$getActivePositionFilter$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getHoldingsUseCase$getActivePositionFilter$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getHoldingsUseCase$getActivePositionFilter$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            GetHoldingsUseCase$getActivePositionFilter$$inlined$dexRunCatching$1 getHoldingsUseCase$getActivePositionFilter$$inlined$dexRunCatching$1 = new GetHoldingsUseCase$getActivePositionFilter$$inlined$dexRunCatching$1(null, this);
            getHoldingsUseCase$getActivePositionFilter$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getHoldingsUseCase$getActivePositionFilter$$inlined$dexRunCatching$1, getHoldingsUseCase$getActivePositionFilter$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        java.lang.Object objM7386unboximpl = ((Result) objWithContext).m7386unboximpl();
        return Result.m7383isFailureimpl(objM7386unboximpl) ? new C28443kaq(false, null, false, null, 15, null) : objM7386unboximpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(boolean z, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        GetHoldingsUseCase$setHideNativeToken$1 getHoldingsUseCase$setHideNativeToken$1;
        if (continuation instanceof GetHoldingsUseCase$setHideNativeToken$1) {
            getHoldingsUseCase$setHideNativeToken$1 = (GetHoldingsUseCase$setHideNativeToken$1) continuation;
            int i = getHoldingsUseCase$setHideNativeToken$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getHoldingsUseCase$setHideNativeToken$1.label = i - Integer.MIN_VALUE;
            } else {
                getHoldingsUseCase$setHideNativeToken$1 = new GetHoldingsUseCase$setHideNativeToken$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getHoldingsUseCase$setHideNativeToken$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getHoldingsUseCase$setHideNativeToken$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            GetHoldingsUseCase$setHideNativeToken$$inlined$dexRunCatching$1 getHoldingsUseCase$setHideNativeToken$$inlined$dexRunCatching$1 = new GetHoldingsUseCase$setHideNativeToken$$inlined$dexRunCatching$1(null, this, z);
            getHoldingsUseCase$setHideNativeToken$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getHoldingsUseCase$setHideNativeToken$$inlined$dexRunCatching$1, getHoldingsUseCase$setHideNativeToken$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        ((Result) objWithContext).m7386unboximpl();
        return Unit.INSTANCE;
    }

    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2) {
        return str + "_" + str2;
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> KWHzl(java.lang.String str) {
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"_"}, false, 0, 6, (java.lang.Object) null);
        return new kotlin.Pair<>((java.lang.String) (listSplit$default.size() > 0 ? listSplit$default.get(0) : ""), (java.lang.String) (1 < listSplit$default.size() ? listSplit$default.get(1) : ""));
    }

    public final void OLrzqt() {
        this.isConnected.EZpvd();
    }

    public final java.lang.Object KWHzl(@NotNull Continuation<? super Flow<? extends java.util.List<HoldingTransactionData>>> continuation) {
        return this.isConnected.OLrzqt(this.fetchVPNInfo.EZpvd(), continuation);
    }

    public final void KWHzl() {
        this.isConnected.OLrzqt();
    }

    public final java.lang.Object KWHzl(@NotNull java.util.List<HoldingAsset> list, @NotNull Continuation<? super Flow<? extends java.util.List<HoldingTokenData>>> continuation) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (HoldingAsset holdingAsset : list) {
            arrayList.add(new C28438kal(holdingAsset.OLrzqt(), holdingAsset.fetchVPNInfo()));
        }
        return this.isConnected.EZpvd(arrayList, continuation);
    }
}
