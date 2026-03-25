package o;

import com.okinc.market.quotation.domain.dex.GetAndSubscribeDexBoostVosUseCase$invoke$1;
import com.okinc.market.quotation.domain.dex.GetAndSubscribeDexBoostVosUseCase$onExecute$1;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.quotation.ui.model.dex.DexPeriodEnum;
import com.okinc.market.quotation.ui.model.dex.DexSortByEnum;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qra, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41478qra extends AbstractC49400uno<C41495qrr, Flow<? extends java.util.List<? extends InterfaceC41655qus>>> {
    public final InterfaceC56387yDm AEQbTJ;
    public final CoroutineDispatcher KWHzl;
    public final C41503qrz OLrzqt;
    public final C41483qrf copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd2((C41495qrr) obj, (Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41655qus>>>) continuation);
    }

    @yCM
    public C41478qra(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41483qrf c41483qrf, @NotNull C41503qrz c41503qrz) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41483qrf, "");
        Intrinsics.checkNotNullParameter(c41503qrz, "");
        this.KWHzl = coroutineDispatcher;
        this.copydefault = c41483qrf;
        this.OLrzqt = c41503qrz;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.qrb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41478qra.KWHzl();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Mutex KWHzl() {
        return MutexKt.Mutex$default(false, 1, null);
    }

    private final Mutex copydefault() {
        return (Mutex) this.AEQbTJ.getValue();
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:32:0x0023 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, o.qrr] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlinx.coroutines.sync.Mutex] */
    @Override // o.AbstractC49400uno
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull C41495qrr c41495qrr, @NotNull Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41655qus>>> continuation) throws java.lang.Throwable {
        GetAndSubscribeDexBoostVosUseCase$invoke$1 getAndSubscribeDexBoostVosUseCase$invoke$1;
        C41478qra c41478qra;
        ?? r2;
        Mutex mutex;
        if (continuation instanceof GetAndSubscribeDexBoostVosUseCase$invoke$1) {
            getAndSubscribeDexBoostVosUseCase$invoke$1 = (GetAndSubscribeDexBoostVosUseCase$invoke$1) continuation;
            int i = getAndSubscribeDexBoostVosUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAndSubscribeDexBoostVosUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getAndSubscribeDexBoostVosUseCase$invoke$1 = new GetAndSubscribeDexBoostVosUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getAndSubscribeDexBoostVosUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getAndSubscribeDexBoostVosUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Mutex mutexCopydefault = copydefault();
                getAndSubscribeDexBoostVosUseCase$invoke$1.L$0 = this;
                getAndSubscribeDexBoostVosUseCase$invoke$1.L$1 = c41495qrr;
                getAndSubscribeDexBoostVosUseCase$invoke$1.L$2 = mutexCopydefault;
                getAndSubscribeDexBoostVosUseCase$invoke$1.label = 1;
                if (mutexCopydefault.lock(null, getAndSubscribeDexBoostVosUseCase$invoke$1) == objCopydefault) {
                    return objCopydefault;
                }
                c41478qra = this;
                r2 = c41495qrr;
                mutex = mutexCopydefault;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Mutex mutex2 = (Mutex) getAndSubscribeDexBoostVosUseCase$invoke$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    c41495qrr = mutex2;
                    return (Flow) objEZpvd;
                }
                Mutex mutex3 = (Mutex) getAndSubscribeDexBoostVosUseCase$invoke$1.L$2;
                C41495qrr c41495qrr2 = (C41495qrr) getAndSubscribeDexBoostVosUseCase$invoke$1.L$1;
                c41478qra = (C41478qra) getAndSubscribeDexBoostVosUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                r2 = c41495qrr2;
                mutex = mutex3;
            }
            getAndSubscribeDexBoostVosUseCase$invoke$1.L$0 = mutex;
            getAndSubscribeDexBoostVosUseCase$invoke$1.L$1 = null;
            getAndSubscribeDexBoostVosUseCase$invoke$1.L$2 = null;
            getAndSubscribeDexBoostVosUseCase$invoke$1.label = 2;
            objEZpvd = super.EZpvd(r2, getAndSubscribeDexBoostVosUseCase$invoke$1);
            c41495qrr = mutex;
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            return (Flow) objEZpvd;
        } finally {
            c41495qrr.unlock(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd2(@NotNull C41495qrr c41495qrr, @NotNull Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41655qus>>> continuation) throws java.lang.Throwable {
        GetAndSubscribeDexBoostVosUseCase$onExecute$1 getAndSubscribeDexBoostVosUseCase$onExecute$1;
        DexPeriodEnum dexPeriodEnum;
        C41478qra c41478qra;
        kotlin.Pair<DexSortByEnum, SortOrder> pair;
        if (continuation instanceof GetAndSubscribeDexBoostVosUseCase$onExecute$1) {
            getAndSubscribeDexBoostVosUseCase$onExecute$1 = (GetAndSubscribeDexBoostVosUseCase$onExecute$1) continuation;
            int i = getAndSubscribeDexBoostVosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAndSubscribeDexBoostVosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getAndSubscribeDexBoostVosUseCase$onExecute$1 = new GetAndSubscribeDexBoostVosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getAndSubscribeDexBoostVosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getAndSubscribeDexBoostVosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            DexPeriodEnum dexPeriodEnumEZpvd = c41495qrr.EZpvd();
            kotlin.Pair<DexSortByEnum, SortOrder> pairCopydefault = c41495qrr.copydefault();
            C41434qqj.KWHzl.KWHzl("GetAndSubscribeDexBoostVosUseCase", "get and subscribe dex vos, [period: " + dexPeriodEnumEZpvd + ", sorter: " + pairCopydefault + "]");
            C41483qrf c41483qrf = this.copydefault;
            getAndSubscribeDexBoostVosUseCase$onExecute$1.L$0 = this;
            getAndSubscribeDexBoostVosUseCase$onExecute$1.L$1 = dexPeriodEnumEZpvd;
            getAndSubscribeDexBoostVosUseCase$onExecute$1.L$2 = pairCopydefault;
            getAndSubscribeDexBoostVosUseCase$onExecute$1.label = 1;
            java.lang.Object objEZpvd2 = c41483qrf.EZpvd(c41495qrr, getAndSubscribeDexBoostVosUseCase$onExecute$1);
            if (objEZpvd2 == objCopydefault) {
                return objCopydefault;
            }
            dexPeriodEnum = dexPeriodEnumEZpvd;
            c41478qra = this;
            objEZpvd = objEZpvd2;
            pair = pairCopydefault;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
                return (Flow) objEZpvd;
            }
            pair = (kotlin.Pair) getAndSubscribeDexBoostVosUseCase$onExecute$1.L$2;
            DexPeriodEnum dexPeriodEnum2 = (DexPeriodEnum) getAndSubscribeDexBoostVosUseCase$onExecute$1.L$1;
            C41478qra c41478qra2 = (C41478qra) getAndSubscribeDexBoostVosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            dexPeriodEnum = dexPeriodEnum2;
            c41478qra = c41478qra2;
        }
        C41455qrD c41455qrD = new C41455qrD((java.util.List) objEZpvd, pair.getFirst(), pair.getSecond(), dexPeriodEnum, false, 16, null);
        C41503qrz c41503qrz = c41478qra.OLrzqt;
        getAndSubscribeDexBoostVosUseCase$onExecute$1.L$0 = null;
        getAndSubscribeDexBoostVosUseCase$onExecute$1.L$1 = null;
        getAndSubscribeDexBoostVosUseCase$onExecute$1.L$2 = null;
        getAndSubscribeDexBoostVosUseCase$onExecute$1.label = 2;
        objEZpvd = c41503qrz.EZpvd(c41455qrD, getAndSubscribeDexBoostVosUseCase$onExecute$1);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        return (Flow) objEZpvd;
    }
}
