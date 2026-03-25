package o;

import com.okinc.market.quotation.SampleRustBridge$testDexRankingList$1;
import com.okinc.market.quotation.SampleRustBridge$testDexRankingList$futureWrapper$1;
import com.okinc.market.quotation.SampleRustBridge$testDexRankingList$futureWrapper$2;
import com.okinc.market.quotation.SampleRustBridge$testDexRankingList$futureWrapper$3;
import com.okinc.market.quotation.SampleRustBridge$testDexRankingList$futureWrapper$4;
import com.okinc.market.quotation.SampleRustBridge$testGetAndSubscribeDexRankingList$1;
import com.okinc.market.quotation.SampleRustBridge$testGetAndSubscribeDexRankingList$2;
import com.okinc.market.quotation.SampleRustBridge$testGetAndSubscribeDexRankingList$futureWrapper$1;
import com.okinc.market.quotation.SampleRustBridge$testGetAndSubscribeDexRankingList$futureWrapper$2;
import com.okinc.market.quotation.SampleRustBridge$testGetAndSubscribeDexRankingList$futureWrapper$3;
import com.okinc.market.quotation.SampleRustBridge$testGetAndSubscribeDexRankingList$futureWrapper$4;
import com.okinc.market.quotation.SampleRustBridge$testGetDexChainGroupList$1;
import com.okinc.market.quotation.SampleRustBridge$testGetDexChainGroupList$futureWrapper$1;
import com.okinc.market.quotation.SampleRustBridge$testGetDexChainGroupList$futureWrapper$2;
import com.okinc.market.quotation.SampleRustBridge$testGetDexChainGroupList$futureWrapper$3;
import com.okinc.market.quotation.SampleRustBridge$testGetDexChainGroupList$futureWrapper$4;
import com.okinc.market.quotation.SampleRustBridge$testGetDexRankingList$1;
import com.okinc.market.quotation.SampleRustBridge$testGetDexRankingList$futureWrapper$1;
import com.okinc.market.quotation.SampleRustBridge$testGetDexRankingList$futureWrapper$2;
import com.okinc.market.quotation.SampleRustBridge$testGetDexRankingList$futureWrapper$3;
import com.okinc.market.quotation.SampleRustBridge$testGetDexRankingList$futureWrapper$4;
import com.okinc.market.quotation.SampleRustBridge$testGetDexTokenDetail$1;
import com.okinc.market.quotation.SampleRustBridge$testGetDexTokenDetail$futureWrapper$1;
import com.okinc.market.quotation.SampleRustBridge$testGetDexTokenDetail$futureWrapper$2;
import com.okinc.market.quotation.SampleRustBridge$testGetDexTokenDetail$futureWrapper$3;
import com.okinc.market.quotation.SampleRustBridge$testGetDexTokenDetail$futureWrapper$4;
import com.okinc.market.quotation.SampleRustBridge$testRustRetailDexBridge$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import uniffi.ok_future_utils.OkffiException;
import uniffi.retail_trading.DexPeriod;
import uniffi.retail_trading.DexSortBy;
import uniffi.retail_trading.SortOrder;

/* JADX INFO: renamed from: o.qqi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41433qqi {
    public static final C41433qqi copydefault = new C41433qqi();
    public static final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.qqh
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C41433qqi.AEQbTJ();
        }
    });
    public static final int AEQbTJ = 8;

    private C41433qqi() {
    }

    public final CoroutineScope OLrzqt() {
        return (CoroutineScope) KWHzl.getValue();
    }

    public static final CoroutineScope AEQbTJ() {
        return CoroutineScopeKt.CoroutineScope(C40440qVy.Companion.AEQbTJ().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null)).plus(new Activity(CoroutineExceptionHandler.Key)));
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(OLrzqt(), null, null, new SampleRustBridge$testRustRetailDexBridge$1(null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull BkX bkX, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        SampleRustBridge$testGetDexChainGroupList$1 sampleRustBridge$testGetDexChainGroupList$1;
        java.lang.Object objAEQbTJ;
        if (continuation instanceof SampleRustBridge$testGetDexChainGroupList$1) {
            sampleRustBridge$testGetDexChainGroupList$1 = (SampleRustBridge$testGetDexChainGroupList$1) continuation;
            int i = sampleRustBridge$testGetDexChainGroupList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sampleRustBridge$testGetDexChainGroupList$1.label = i - Integer.MIN_VALUE;
            } else {
                sampleRustBridge$testGetDexChainGroupList$1 = new SampleRustBridge$testGetDexChainGroupList$1(this, continuation);
            }
        }
        java.lang.Object obj = sampleRustBridge$testGetDexChainGroupList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = sampleRustBridge$testGetDexChainGroupList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            BjX bjXOLrzqt = bkX.OLrzqt();
            C33077mpe c33077mpe = new C33077mpe(new SampleRustBridge$testGetDexChainGroupList$futureWrapper$1(bjXOLrzqt), new SampleRustBridge$testGetDexChainGroupList$futureWrapper$2(bjXOLrzqt), new SampleRustBridge$testGetDexChainGroupList$futureWrapper$3(bjXOLrzqt), new SampleRustBridge$testGetDexChainGroupList$futureWrapper$4(bjXOLrzqt), null, 16, null);
            sampleRustBridge$testGetDexChainGroupList$1.label = 1;
            objAEQbTJ = c33077mpe.AEQbTJ(sampleRustBridge$testGetDexChainGroupList$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
        if (thM7380exceptionOrNullimpl != null) {
            C41434qqj.e$default(C41434qqj.KWHzl, "SampleRustBridge", "Dex chain group list result failed: " + thM7380exceptionOrNullimpl, null, 4, null);
        }
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            C41434qqj.KWHzl.AEQbTJ("SampleRustBridge", "Dex chain group list result ok: " + ((java.util.List) objAEQbTJ));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.qqi$Activity */
    public static final class Activity extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public Activity(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            C41434qqj.KWHzl.copydefault("SampleRustBridge", "subscribeAsync error", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull BkX bkX, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        SampleRustBridge$testGetDexRankingList$1 sampleRustBridge$testGetDexRankingList$1;
        java.lang.Object objAEQbTJ;
        if (continuation instanceof SampleRustBridge$testGetDexRankingList$1) {
            sampleRustBridge$testGetDexRankingList$1 = (SampleRustBridge$testGetDexRankingList$1) continuation;
            int i = sampleRustBridge$testGetDexRankingList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sampleRustBridge$testGetDexRankingList$1.label = i - Integer.MIN_VALUE;
            } else {
                sampleRustBridge$testGetDexRankingList$1 = new SampleRustBridge$testGetDexRankingList$1(this, continuation);
            }
        }
        java.lang.Object obj = sampleRustBridge$testGetDexRankingList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = sampleRustBridge$testGetDexRankingList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C4608Bkj c4608BkjAEQbTJ = bkX.AEQbTJ(new BjD(null, "All", "", "", true), DexPeriod.ONE_DAY, DexSortBy.NONE, SortOrder.NONE, C56395yDu.AEQbTJ(C56395yDu.EZpvd(7)));
            C33077mpe c33077mpe = new C33077mpe(new SampleRustBridge$testGetDexRankingList$futureWrapper$1(c4608BkjAEQbTJ), new SampleRustBridge$testGetDexRankingList$futureWrapper$2(c4608BkjAEQbTJ), new SampleRustBridge$testGetDexRankingList$futureWrapper$3(c4608BkjAEQbTJ), new SampleRustBridge$testGetDexRankingList$futureWrapper$4(c4608BkjAEQbTJ), null, 16, null);
            sampleRustBridge$testGetDexRankingList$1.label = 1;
            objAEQbTJ = c33077mpe.AEQbTJ(sampleRustBridge$testGetDexRankingList$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
        if (thM7380exceptionOrNullimpl != null) {
            C41434qqj.e$default(C41434qqj.KWHzl, "SampleRustBridge", "Dex ranking list result failed: " + thM7380exceptionOrNullimpl, null, 4, null);
        }
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            C41434qqj.KWHzl.AEQbTJ("SampleRustBridge", "Dex ranking list result ok: " + ((java.util.List) objAEQbTJ));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull BkX bkX, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        SampleRustBridge$testGetAndSubscribeDexRankingList$1 sampleRustBridge$testGetAndSubscribeDexRankingList$1;
        java.lang.Object objAEQbTJ;
        if (continuation instanceof SampleRustBridge$testGetAndSubscribeDexRankingList$1) {
            sampleRustBridge$testGetAndSubscribeDexRankingList$1 = (SampleRustBridge$testGetAndSubscribeDexRankingList$1) continuation;
            int i = sampleRustBridge$testGetAndSubscribeDexRankingList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sampleRustBridge$testGetAndSubscribeDexRankingList$1.label = i - Integer.MIN_VALUE;
            } else {
                sampleRustBridge$testGetAndSubscribeDexRankingList$1 = new SampleRustBridge$testGetAndSubscribeDexRankingList$1(this, continuation);
            }
        }
        java.lang.Object obj = sampleRustBridge$testGetAndSubscribeDexRankingList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = sampleRustBridge$testGetAndSubscribeDexRankingList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C4449Bem c4449BemKWHzl = bkX.KWHzl(new BjD(null, "All", "", "", true), DexPeriod.ONE_DAY, DexSortBy.NONE, SortOrder.NONE, C56395yDu.AEQbTJ(C56395yDu.EZpvd(7)), new ActionBar());
            C33077mpe c33077mpe = new C33077mpe(new SampleRustBridge$testGetAndSubscribeDexRankingList$futureWrapper$1(c4449BemKWHzl), new SampleRustBridge$testGetAndSubscribeDexRankingList$futureWrapper$2(c4449BemKWHzl), new SampleRustBridge$testGetAndSubscribeDexRankingList$futureWrapper$3(c4449BemKWHzl), new SampleRustBridge$testGetAndSubscribeDexRankingList$futureWrapper$4(c4449BemKWHzl), null, 16, null);
            BuildersKt__Builders_commonKt.launch$default(OLrzqt(), null, null, new SampleRustBridge$testGetAndSubscribeDexRankingList$2(c4449BemKWHzl, null), 3, null);
            sampleRustBridge$testGetAndSubscribeDexRankingList$1.label = 1;
            objAEQbTJ = c33077mpe.AEQbTJ(sampleRustBridge$testGetAndSubscribeDexRankingList$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
        if (thM7380exceptionOrNullimpl != null) {
            C41434qqj.e$default(C41434qqj.KWHzl, "SampleRustBridge", "Get and subscribe Dex ranking list result failed: " + thM7380exceptionOrNullimpl, null, 4, null);
        }
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            boolean zBooleanValue = ((java.lang.Boolean) objAEQbTJ).booleanValue();
            C41434qqj.KWHzl.AEQbTJ("SampleRustBridge", "Get and subscribe Dex ranking list result ok: " + zBooleanValue);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.qqi$ActionBar */
    public static final class ActionBar implements BjI {
        @Override // o.BjI
        public void copydefault(java.util.List<BkU> list) {
            Intrinsics.checkNotNullParameter(list, "");
            C41434qqj.KWHzl.AEQbTJ("SampleRustBridge", "onUpdateDexListBatched: " + list);
        }

        @Override // o.BjI
        public void AEQbTJ(OkffiException okffiException) {
            Intrinsics.checkNotNullParameter(okffiException, "");
            C41434qqj.e$default(C41434qqj.KWHzl, "SampleRustBridge", "onUpdateDexListError: " + okffiException, null, 4, null);
        }

        @Override // o.BjI
        public void copydefault() {
            C41434qqj.KWHzl.AEQbTJ("SampleRustBridge", "onUpdateDexListCompleted");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull BkX bkX, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        SampleRustBridge$testGetDexTokenDetail$1 sampleRustBridge$testGetDexTokenDetail$1;
        java.lang.Object objAEQbTJ;
        if (continuation instanceof SampleRustBridge$testGetDexTokenDetail$1) {
            sampleRustBridge$testGetDexTokenDetail$1 = (SampleRustBridge$testGetDexTokenDetail$1) continuation;
            int i = sampleRustBridge$testGetDexTokenDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sampleRustBridge$testGetDexTokenDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                sampleRustBridge$testGetDexTokenDetail$1 = new SampleRustBridge$testGetDexTokenDetail$1(this, continuation);
            }
        }
        java.lang.Object obj = sampleRustBridge$testGetDexTokenDetail$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = sampleRustBridge$testGetDexTokenDetail$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            BjJ bjJ = new BjJ("", "", "", "", "", "", "", "", false, "");
            C4608Bkj c4608BkjAEQbTJ = bkX.AEQbTJ(yDY.gEmmrt(bjJ.KWHzl((958 & 1) != 0 ? bjJ.EZpvd : "8453", (958 & 2) != 0 ? bjJ.KWHzl : null, (958 & 4) != 0 ? bjJ.OLrzqt : null, (958 & 8) != 0 ? bjJ.AYXKKw : null, (958 & 16) != 0 ? bjJ.djBIcL : null, (958 & 32) != 0 ? bjJ.AhwBna : null, (958 & 64) != 0 ? bjJ.gEmmrt : "0x50f88fe97f72cd3e75b9eb4f747f59bceba80d59", (958 & 128) != 0 ? bjJ.AEQbTJ : null, (958 & 256) != 0 ? bjJ.valueOf : false, (958 & 512) != 0 ? bjJ.copydefault : null), bjJ.KWHzl((958 & 1) != 0 ? bjJ.EZpvd : "501", (958 & 2) != 0 ? bjJ.KWHzl : null, (958 & 4) != 0 ? bjJ.OLrzqt : null, (958 & 8) != 0 ? bjJ.AYXKKw : null, (958 & 16) != 0 ? bjJ.djBIcL : null, (958 & 32) != 0 ? bjJ.AhwBna : null, (958 & 64) != 0 ? bjJ.gEmmrt : "7Y2TPeq3hqw21LRTCi4wBWoivDngCpNNJsN1hzhZpump", (958 & 128) != 0 ? bjJ.AEQbTJ : null, (958 & 256) != 0 ? bjJ.valueOf : false, (958 & 512) != 0 ? bjJ.copydefault : null)));
            C33077mpe c33077mpe = new C33077mpe(new SampleRustBridge$testGetDexTokenDetail$futureWrapper$1(c4608BkjAEQbTJ), new SampleRustBridge$testGetDexTokenDetail$futureWrapper$2(c4608BkjAEQbTJ), new SampleRustBridge$testGetDexTokenDetail$futureWrapper$3(c4608BkjAEQbTJ), new SampleRustBridge$testGetDexTokenDetail$futureWrapper$4(c4608BkjAEQbTJ), null, 16, null);
            sampleRustBridge$testGetDexTokenDetail$1.label = 1;
            objAEQbTJ = c33077mpe.AEQbTJ(sampleRustBridge$testGetDexTokenDetail$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
        if (thM7380exceptionOrNullimpl != null) {
            C41434qqj.KWHzl.copydefault("SampleRustBridge", "Get Dex token detail failed", thM7380exceptionOrNullimpl);
        }
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            C41434qqj.KWHzl.AEQbTJ("SampleRustBridge", "Get Dex token detail success: " + ((java.util.List) objAEQbTJ));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull BkX bkX, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        SampleRustBridge$testDexRankingList$1 sampleRustBridge$testDexRankingList$1;
        java.lang.Object objAEQbTJ;
        if (continuation instanceof SampleRustBridge$testDexRankingList$1) {
            sampleRustBridge$testDexRankingList$1 = (SampleRustBridge$testDexRankingList$1) continuation;
            int i = sampleRustBridge$testDexRankingList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sampleRustBridge$testDexRankingList$1.label = i - Integer.MIN_VALUE;
            } else {
                sampleRustBridge$testDexRankingList$1 = new SampleRustBridge$testDexRankingList$1(this, continuation);
            }
        }
        java.lang.Object obj = sampleRustBridge$testDexRankingList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = sampleRustBridge$testDexRankingList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C4623Bky c4623BkyCopydefault = bkX.copydefault("B");
            C33077mpe c33077mpe = new C33077mpe(new SampleRustBridge$testDexRankingList$futureWrapper$1(c4623BkyCopydefault), new SampleRustBridge$testDexRankingList$futureWrapper$2(c4623BkyCopydefault), new SampleRustBridge$testDexRankingList$futureWrapper$3(c4623BkyCopydefault), new SampleRustBridge$testDexRankingList$futureWrapper$4(c4623BkyCopydefault), null, 16, null);
            sampleRustBridge$testDexRankingList$1.label = 1;
            objAEQbTJ = c33077mpe.AEQbTJ(sampleRustBridge$testDexRankingList$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
        if (thM7380exceptionOrNullimpl != null) {
            C41434qqj.KWHzl.copydefault("SampleRustBridge", "Search Dex ranking list failed", thM7380exceptionOrNullimpl);
        }
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            C41434qqj.KWHzl.AEQbTJ("SampleRustBridge", "Search Dex ranking list success: " + ((C4648Blw) objAEQbTJ));
        }
        return Unit.INSTANCE;
    }
}
