package o;

import com.okinc.market.quotation.domain.spot.mixin.GetAllSpotAndCoinVosUseCase$invoke$1;
import com.okinc.market.quotation.domain.spot.mixin.GetAllSpotAndCoinVosUseCase$onExecute$1;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qtu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41604qtu extends AbstractC49400uno<kotlin.Pair<? extends InterfaceC41651quo, ? extends InterfaceC41637qua>, C41600qtq> {
    public final InterfaceC56387yDm AEQbTJ;
    public final C41408qqJ EZpvd;
    public final CoroutineDispatcher OLrzqt;
    public final C41525qsU copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd2((kotlin.Pair<? extends InterfaceC41651quo, ? extends InterfaceC41637qua>) obj, (Continuation<? super C41600qtq>) continuation);
    }

    @yCM
    public C41604qtu(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41525qsU c41525qsU, @NotNull C41408qqJ c41408qqJ) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41525qsU, "");
        Intrinsics.checkNotNullParameter(c41408qqJ, "");
        this.OLrzqt = coroutineDispatcher;
        this.copydefault = c41525qsU;
        this.EZpvd = c41408qqJ;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.qts
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41604qtu.OLrzqt();
            }
        });
    }

    private final Mutex KWHzl() {
        return (Mutex) this.AEQbTJ.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Mutex OLrzqt() {
        return MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:32:0x0023 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Pair<? extends o.quo, ? extends o.qua>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlinx.coroutines.sync.Mutex] */
    @Override // o.AbstractC49400uno
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull kotlin.Pair<? extends InterfaceC41651quo, ? extends InterfaceC41637qua> pair, @NotNull Continuation<? super C41600qtq> continuation) throws java.lang.Throwable {
        GetAllSpotAndCoinVosUseCase$invoke$1 getAllSpotAndCoinVosUseCase$invoke$1;
        C41604qtu c41604qtu;
        ?? r2;
        Mutex mutex;
        if (continuation instanceof GetAllSpotAndCoinVosUseCase$invoke$1) {
            getAllSpotAndCoinVosUseCase$invoke$1 = (GetAllSpotAndCoinVosUseCase$invoke$1) continuation;
            int i = getAllSpotAndCoinVosUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAllSpotAndCoinVosUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getAllSpotAndCoinVosUseCase$invoke$1 = new GetAllSpotAndCoinVosUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getAllSpotAndCoinVosUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getAllSpotAndCoinVosUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Mutex mutexKWHzl = KWHzl();
                getAllSpotAndCoinVosUseCase$invoke$1.L$0 = this;
                getAllSpotAndCoinVosUseCase$invoke$1.L$1 = pair;
                getAllSpotAndCoinVosUseCase$invoke$1.L$2 = mutexKWHzl;
                getAllSpotAndCoinVosUseCase$invoke$1.label = 1;
                if (mutexKWHzl.lock(null, getAllSpotAndCoinVosUseCase$invoke$1) == objCopydefault) {
                    return objCopydefault;
                }
                c41604qtu = this;
                r2 = pair;
                mutex = mutexKWHzl;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Mutex mutex2 = (Mutex) getAllSpotAndCoinVosUseCase$invoke$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    pair = mutex2;
                    return (C41600qtq) objEZpvd;
                }
                Mutex mutex3 = (Mutex) getAllSpotAndCoinVosUseCase$invoke$1.L$2;
                kotlin.Pair pair2 = (kotlin.Pair) getAllSpotAndCoinVosUseCase$invoke$1.L$1;
                c41604qtu = (C41604qtu) getAllSpotAndCoinVosUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                r2 = pair2;
                mutex = mutex3;
            }
            getAllSpotAndCoinVosUseCase$invoke$1.L$0 = mutex;
            getAllSpotAndCoinVosUseCase$invoke$1.L$1 = null;
            getAllSpotAndCoinVosUseCase$invoke$1.L$2 = null;
            getAllSpotAndCoinVosUseCase$invoke$1.label = 2;
            objEZpvd = super.EZpvd(r2, getAllSpotAndCoinVosUseCase$invoke$1);
            pair = mutex;
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            return (C41600qtq) objEZpvd;
        } finally {
            pair.unlock(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd2(@NotNull kotlin.Pair<? extends InterfaceC41651quo, ? extends InterfaceC41637qua> pair, @NotNull Continuation<? super C41600qtq> continuation) throws java.lang.Throwable {
        GetAllSpotAndCoinVosUseCase$onExecute$1 getAllSpotAndCoinVosUseCase$onExecute$1;
        InterfaceC41637qua interfaceC41637quaComponent2;
        C41604qtu c41604qtu;
        java.util.List list;
        java.util.List list2;
        java.util.List list3;
        java.util.List listAhwBna;
        if (continuation instanceof GetAllSpotAndCoinVosUseCase$onExecute$1) {
            getAllSpotAndCoinVosUseCase$onExecute$1 = (GetAllSpotAndCoinVosUseCase$onExecute$1) continuation;
            int i = getAllSpotAndCoinVosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAllSpotAndCoinVosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getAllSpotAndCoinVosUseCase$onExecute$1 = new GetAllSpotAndCoinVosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getAllSpotAndCoinVosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getAllSpotAndCoinVosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            InterfaceC41651quo interfaceC41651quoComponent1 = pair.component1();
            interfaceC41637quaComponent2 = pair.component2();
            C41525qsU c41525qsU = this.copydefault;
            C41526qsV c41526qsV = new C41526qsV(interfaceC41651quoComponent1, null, 2, null);
            getAllSpotAndCoinVosUseCase$onExecute$1.L$0 = this;
            getAllSpotAndCoinVosUseCase$onExecute$1.L$1 = interfaceC41637quaComponent2;
            getAllSpotAndCoinVosUseCase$onExecute$1.label = 1;
            objEZpvd = c41525qsU.EZpvd(c41526qsV, getAllSpotAndCoinVosUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c41604qtu = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.util.List list4 = (java.util.List) getAllSpotAndCoinVosUseCase$onExecute$1.L$2;
                java.util.List list5 = (java.util.List) getAllSpotAndCoinVosUseCase$onExecute$1.L$1;
                java.util.List list6 = (java.util.List) getAllSpotAndCoinVosUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                list = list4;
                list2 = list6;
                list3 = list5;
                listAhwBna = (java.util.List) ((Triple) objEZpvd).component1();
                if (listAhwBna == null) {
                    listAhwBna = yDY.AhwBna();
                }
                return new C41600qtq(list3, list, list2, listAhwBna, java.lang.System.currentTimeMillis());
            }
            interfaceC41637quaComponent2 = (InterfaceC41637qua) getAllSpotAndCoinVosUseCase$onExecute$1.L$1;
            c41604qtu = (C41604qtu) getAllSpotAndCoinVosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        Triple triple = (Triple) objEZpvd;
        java.util.List list7 = (java.util.List) triple.component1();
        java.util.List list8 = (java.util.List) triple.component2();
        java.util.List list9 = (java.util.List) triple.component3();
        C41408qqJ c41408qqJ = c41604qtu.EZpvd;
        kotlin.Pair pair2 = new kotlin.Pair(interfaceC41637quaComponent2, C56443yFo.KWHzl(false));
        getAllSpotAndCoinVosUseCase$onExecute$1.L$0 = list7;
        getAllSpotAndCoinVosUseCase$onExecute$1.L$1 = list8;
        getAllSpotAndCoinVosUseCase$onExecute$1.L$2 = list9;
        getAllSpotAndCoinVosUseCase$onExecute$1.label = 2;
        java.lang.Object objAEQbTJ = c41408qqJ.AEQbTJ((java.lang.Object) pair2, (Continuation) getAllSpotAndCoinVosUseCase$onExecute$1);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        list = list9;
        list2 = list7;
        list3 = list8;
        objEZpvd = objAEQbTJ;
        listAhwBna = (java.util.List) ((Triple) objEZpvd).component1();
        if (listAhwBna == null) {
        }
        return new C41600qtq(list3, list, list2, listAhwBna, java.lang.System.currentTimeMillis());
    }
}
