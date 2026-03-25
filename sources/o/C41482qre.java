package o;

import com.okinc.market.quotation.domain.dex.GetAndSubscribeDexVosUseCase$invoke$1;
import com.okinc.market.quotation.domain.dex.GetAndSubscribeDexVosUseCase$onExecute$1;
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

/* JADX INFO: renamed from: o.qre, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41482qre extends AbstractC49400uno<C41495qrr, Flow<? extends java.util.List<? extends InterfaceC41655qus>>> {
    public static final int KWHzl = 8;
    public final C41503qrz AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final CoroutineDispatcher OLrzqt;
    public final C41494qrq copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd2((C41495qrr) obj, (Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41655qus>>>) continuation);
    }

    @yCM
    public C41482qre(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41494qrq c41494qrq, @NotNull C41503qrz c41503qrz) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41494qrq, "");
        Intrinsics.checkNotNullParameter(c41503qrz, "");
        this.OLrzqt = coroutineDispatcher;
        this.copydefault = c41494qrq;
        this.AEQbTJ = c41503qrz;
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.qrc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41482qre.KWHzl();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Mutex KWHzl() {
        return MutexKt.Mutex$default(false, 1, null);
    }

    private final Mutex OLrzqt() {
        return (Mutex) this.EZpvd.getValue();
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
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull C41495qrr c41495qrr, @NotNull Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41655qus>>> continuation) throws java.lang.Throwable {
        GetAndSubscribeDexVosUseCase$invoke$1 getAndSubscribeDexVosUseCase$invoke$1;
        C41482qre c41482qre;
        ?? r2;
        Mutex mutex;
        if (continuation instanceof GetAndSubscribeDexVosUseCase$invoke$1) {
            getAndSubscribeDexVosUseCase$invoke$1 = (GetAndSubscribeDexVosUseCase$invoke$1) continuation;
            int i = getAndSubscribeDexVosUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAndSubscribeDexVosUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getAndSubscribeDexVosUseCase$invoke$1 = new GetAndSubscribeDexVosUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getAndSubscribeDexVosUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getAndSubscribeDexVosUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Mutex mutexOLrzqt = OLrzqt();
                getAndSubscribeDexVosUseCase$invoke$1.L$0 = this;
                getAndSubscribeDexVosUseCase$invoke$1.L$1 = c41495qrr;
                getAndSubscribeDexVosUseCase$invoke$1.L$2 = mutexOLrzqt;
                getAndSubscribeDexVosUseCase$invoke$1.label = 1;
                if (mutexOLrzqt.lock(null, getAndSubscribeDexVosUseCase$invoke$1) == objCopydefault) {
                    return objCopydefault;
                }
                c41482qre = this;
                r2 = c41495qrr;
                mutex = mutexOLrzqt;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Mutex mutex2 = (Mutex) getAndSubscribeDexVosUseCase$invoke$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    c41495qrr = mutex2;
                    return (Flow) objEZpvd;
                }
                Mutex mutex3 = (Mutex) getAndSubscribeDexVosUseCase$invoke$1.L$2;
                C41495qrr c41495qrr2 = (C41495qrr) getAndSubscribeDexVosUseCase$invoke$1.L$1;
                c41482qre = (C41482qre) getAndSubscribeDexVosUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                r2 = c41495qrr2;
                mutex = mutex3;
            }
            getAndSubscribeDexVosUseCase$invoke$1.L$0 = mutex;
            getAndSubscribeDexVosUseCase$invoke$1.L$1 = null;
            getAndSubscribeDexVosUseCase$invoke$1.L$2 = null;
            getAndSubscribeDexVosUseCase$invoke$1.label = 2;
            objEZpvd = super.EZpvd(r2, getAndSubscribeDexVosUseCase$invoke$1);
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
        GetAndSubscribeDexVosUseCase$onExecute$1 getAndSubscribeDexVosUseCase$onExecute$1;
        DexPeriodEnum dexPeriodEnum;
        C41482qre c41482qre;
        kotlin.Pair<DexSortByEnum, SortOrder> pair;
        if (continuation instanceof GetAndSubscribeDexVosUseCase$onExecute$1) {
            getAndSubscribeDexVosUseCase$onExecute$1 = (GetAndSubscribeDexVosUseCase$onExecute$1) continuation;
            int i = getAndSubscribeDexVosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAndSubscribeDexVosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getAndSubscribeDexVosUseCase$onExecute$1 = new GetAndSubscribeDexVosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getAndSubscribeDexVosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getAndSubscribeDexVosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            DexPeriodEnum dexPeriodEnumEZpvd = c41495qrr.EZpvd();
            kotlin.Pair<DexSortByEnum, SortOrder> pairCopydefault = c41495qrr.copydefault();
            C41434qqj.KWHzl.KWHzl("GetAndSubscribeDexVosUseCase", "get and subscribe dex vos, [period: " + dexPeriodEnumEZpvd + ", sorter: " + pairCopydefault + "]");
            C41494qrq c41494qrq = this.copydefault;
            getAndSubscribeDexVosUseCase$onExecute$1.L$0 = this;
            getAndSubscribeDexVosUseCase$onExecute$1.L$1 = dexPeriodEnumEZpvd;
            getAndSubscribeDexVosUseCase$onExecute$1.L$2 = pairCopydefault;
            getAndSubscribeDexVosUseCase$onExecute$1.label = 1;
            java.lang.Object objOLrzqt = c41494qrq.OLrzqt(c41495qrr, getAndSubscribeDexVosUseCase$onExecute$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            dexPeriodEnum = dexPeriodEnumEZpvd;
            c41482qre = this;
            objEZpvd = objOLrzqt;
            pair = pairCopydefault;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
                return (Flow) objEZpvd;
            }
            pair = (kotlin.Pair) getAndSubscribeDexVosUseCase$onExecute$1.L$2;
            DexPeriodEnum dexPeriodEnum2 = (DexPeriodEnum) getAndSubscribeDexVosUseCase$onExecute$1.L$1;
            C41482qre c41482qre2 = (C41482qre) getAndSubscribeDexVosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            dexPeriodEnum = dexPeriodEnum2;
            c41482qre = c41482qre2;
        }
        C41455qrD c41455qrD = new C41455qrD((java.util.List) objEZpvd, pair.getFirst(), pair.getSecond(), dexPeriodEnum, false, 16, null);
        C41503qrz c41503qrz = c41482qre.AEQbTJ;
        getAndSubscribeDexVosUseCase$onExecute$1.L$0 = null;
        getAndSubscribeDexVosUseCase$onExecute$1.L$1 = null;
        getAndSubscribeDexVosUseCase$onExecute$1.L$2 = null;
        getAndSubscribeDexVosUseCase$onExecute$1.label = 2;
        objEZpvd = c41503qrz.EZpvd(c41455qrD, getAndSubscribeDexVosUseCase$onExecute$1);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        return (Flow) objEZpvd;
    }
}
