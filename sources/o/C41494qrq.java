package o;

import com.okinc.market.quotation.data.model.DexTokenPo;
import com.okinc.market.quotation.domain.dex.GetDexVosUseCase$getDexVosFromRemote$1;
import com.okinc.market.quotation.domain.dex.GetDexVosUseCase$invoke$1;
import com.okinc.market.quotation.domain.dex.GetDexVosUseCase$onExecute$1;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.quotation.ui.model.dex.DexChainGroupVo;
import com.okinc.market.quotation.ui.model.dex.DexPeriodEnum;
import com.okinc.market.quotation.ui.model.dex.DexSortByEnum;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.unify_trade.biz.DexInstrument;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import o.InterfaceC49404uns;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qrq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41494qrq implements InterfaceC49404uns<C41495qrr, java.util.List<? extends InterfaceC41655qus>> {
    private static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final C41488qrk AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public C41495qrr KWHzl;
    public final InterfaceC56387yDm copydefault;
    public final C41437qqm gEmmrt;
    public final InterfaceC46557tYt valueOf;

    @yCM
    public C41494qrq(@NotNull C41488qrk c41488qrk, @NotNull C41437qqm c41437qqm, @NotNull InterfaceC46557tYt interfaceC46557tYt) {
        Intrinsics.checkNotNullParameter(c41488qrk, "");
        Intrinsics.checkNotNullParameter(c41437qqm, "");
        Intrinsics.checkNotNullParameter(interfaceC46557tYt, "");
        this.AEQbTJ = c41488qrk;
        this.gEmmrt = c41437qqm;
        this.valueOf = interfaceC46557tYt;
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.qrp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41494qrq.valueOf();
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.qrt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41494qrq.KWHzl();
            }
        });
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49404uns.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49404uns.Activity.copydefault(this);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49404uns.Activity.KWHzl(this, input, function2, continuation);
    }

    /* JADX INFO: renamed from: o.qrq$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qrq.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    private final Mutex AhwBna() {
        return (Mutex) this.copydefault.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Mutex valueOf() {
        return MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:32:0x0023 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull C41495qrr c41495qrr, @NotNull Continuation<? super java.util.List<? extends InterfaceC41655qus>> continuation) {
        GetDexVosUseCase$invoke$1 getDexVosUseCase$invoke$1;
        C41494qrq c41494qrq;
        ?? r2;
        Mutex mutex;
        if (continuation instanceof GetDexVosUseCase$invoke$1) {
            getDexVosUseCase$invoke$1 = (GetDexVosUseCase$invoke$1) continuation;
            int i = getDexVosUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getDexVosUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getDexVosUseCase$invoke$1 = new GetDexVosUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getDexVosUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getDexVosUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Mutex mutexAhwBna = AhwBna();
                getDexVosUseCase$invoke$1.L$0 = this;
                getDexVosUseCase$invoke$1.L$1 = c41495qrr;
                getDexVosUseCase$invoke$1.L$2 = mutexAhwBna;
                getDexVosUseCase$invoke$1.label = 1;
                if (mutexAhwBna.lock(null, getDexVosUseCase$invoke$1) == objCopydefault) {
                    return objCopydefault;
                }
                c41494qrq = this;
                r2 = c41495qrr;
                mutex = mutexAhwBna;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Mutex mutex2 = (Mutex) getDexVosUseCase$invoke$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    c41495qrr = mutex2;
                    return (java.util.List) objEZpvd;
                }
                Mutex mutex3 = (Mutex) getDexVosUseCase$invoke$1.L$2;
                C41495qrr c41495qrr2 = (C41495qrr) getDexVosUseCase$invoke$1.L$1;
                c41494qrq = (C41494qrq) getDexVosUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                r2 = c41495qrr2;
                mutex = mutex3;
            }
            getDexVosUseCase$invoke$1.L$0 = mutex;
            getDexVosUseCase$invoke$1.L$1 = null;
            getDexVosUseCase$invoke$1.L$2 = null;
            getDexVosUseCase$invoke$1.label = 2;
            objEZpvd = InterfaceC49404uns.Activity.EZpvd(c41494qrq, r2, getDexVosUseCase$invoke$1);
            c41495qrr = mutex;
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            return (java.util.List) objEZpvd;
        } finally {
            c41495qrr.unlock(null);
        }
    }

    private final ConcurrentHashMap<java.lang.String, SoftReference<java.util.List<InterfaceC41655qus>>> AEQbTJ() {
        return (ConcurrentHashMap) this.EZpvd.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConcurrentHashMap KWHzl() {
        return new ConcurrentHashMap();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // o.InterfaceC49404uns, o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41495qrr c41495qrr, @NotNull Continuation<? super java.util.List<? extends InterfaceC41655qus>> continuation) throws java.lang.Throwable {
        GetDexVosUseCase$onExecute$1 getDexVosUseCase$onExecute$1;
        java.lang.String str;
        C41494qrq c41494qrq;
        java.lang.String str2;
        java.util.List<InterfaceC41655qus> list;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        if (continuation instanceof GetDexVosUseCase$onExecute$1) {
            getDexVosUseCase$onExecute$1 = (GetDexVosUseCase$onExecute$1) continuation;
            int i = getDexVosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getDexVosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getDexVosUseCase$onExecute$1 = new GetDexVosUseCase$onExecute$1(this, continuation);
            }
        }
        GetDexVosUseCase$onExecute$1 getDexVosUseCase$onExecute$12 = getDexVosUseCase$onExecute$1;
        java.lang.Object objCopydefault = getDexVosUseCase$onExecute$12.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getDexVosUseCase$onExecute$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            DexChainGroupVo dexChainGroupVoKWHzl = c41495qrr.KWHzl();
            DexPeriodEnum dexPeriodEnumEZpvd = c41495qrr.EZpvd();
            kotlin.Pair<DexSortByEnum, SortOrder> pairCopydefault = c41495qrr.copydefault();
            InterfaceC41652qup interfaceC41652qupOLrzqt = c41495qrr.OLrzqt();
            java.lang.Integer numAEQbTJ = c41495qrr.AEQbTJ();
            boolean zAhwBna = c41495qrr.AhwBna();
            C41434qqj c41434qqj = C41434qqj.KWHzl;
            c41434qqj.KWHzl("GetDexVosUseCase", "get dex vos, [input: " + c41495qrr + "]");
            str = dexChainGroupVoKWHzl.EZpvd() + "_" + dexPeriodEnumEZpvd.name();
            C41495qrr c41495qrr2 = this.KWHzl;
            this.KWHzl = c41495qrr;
            try {
                Result.Application application = Result.Companion;
            } catch (java.lang.Throwable th) {
                th = th;
                c41494qrq = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                str2 = str;
            }
            if (c41495qrr2 != null) {
                if ((Intrinsics.EZpvd(c41495qrr2.djBIcL(), dexChainGroupVoKWHzl) && c41495qrr2.gEmmrt() == dexPeriodEnumEZpvd && !Intrinsics.EZpvd(c41495qrr2.AYXKKw(), pairCopydefault)) || zAhwBna) {
                    SoftReference<java.util.List<InterfaceC41655qus>> softReference = AEQbTJ().get(str);
                    list = softReference != null ? softReference.get() : null;
                    c41434qqj.KWHzl("GetDexVosUseCase", "getDexVosUseCase: get from cache by sorter changed [key: " + str + "]");
                } else {
                    list = null;
                }
                if (list != null) {
                    c41494qrq = this;
                    str2 = str;
                    objM7377constructorimpl = Result.m7377constructorimpl(list);
                    if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                        c41494qrq.AEQbTJ().put(str2, new SoftReference<>((java.util.List) objM7377constructorimpl));
                    }
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        SoftReference<java.util.List<InterfaceC41655qus>> softReference2 = c41494qrq.AEQbTJ().get(str2);
                        java.util.List<InterfaceC41655qus> list2 = softReference2 != null ? softReference2.get() : null;
                        if (list2 == null || list2.isEmpty()) {
                            C41434qqj.KWHzl.KWHzl("GetDexVosUseCase", "getDexVosUseCase: no cache, throw network error [key: " + str2 + ", error: " + thM7380exceptionOrNullimpl + "]");
                            throw thM7380exceptionOrNullimpl;
                        }
                        C41434qqj.KWHzl.KWHzl("GetDexVosUseCase", "getDexVosUseCase: use cache as fallback [key: " + str2 + ", error: " + thM7380exceptionOrNullimpl + "]");
                        objM7377constructorimpl = list2;
                    }
                    return (java.util.List) objM7377constructorimpl;
                }
            }
            getDexVosUseCase$onExecute$12.L$0 = this;
            getDexVosUseCase$onExecute$12.L$1 = str;
            getDexVosUseCase$onExecute$12.label = 1;
            objCopydefault = copydefault(dexChainGroupVoKWHzl, dexPeriodEnumEZpvd, pairCopydefault, interfaceC41652qupOLrzqt, numAEQbTJ, getDexVosUseCase$onExecute$12);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c41494qrq = this;
            str2 = str;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (java.lang.String) getDexVosUseCase$onExecute$12.L$1;
            c41494qrq = (C41494qrq) getDexVosUseCase$onExecute$12.L$0;
            try {
                C56391yDq.AEQbTJ(objCopydefault);
            } catch (java.lang.Throwable th2) {
                th = th2;
                str = str2;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                str2 = str;
            }
        }
        list = (java.util.List) objCopydefault;
        objM7377constructorimpl = Result.m7377constructorimpl(list);
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return (java.util.List) objM7377constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(DexChainGroupVo dexChainGroupVo, final DexPeriodEnum dexPeriodEnum, kotlin.Pair<? extends DexSortByEnum, ? extends SortOrder> pair, final InterfaceC41652qup interfaceC41652qup, java.lang.Integer num, Continuation<? super java.util.List<? extends InterfaceC41655qus>> continuation) throws java.lang.Throwable {
        GetDexVosUseCase$getDexVosFromRemote$1 getDexVosUseCase$getDexVosFromRemote$1;
        final C41494qrq c41494qrq;
        if (continuation instanceof GetDexVosUseCase$getDexVosFromRemote$1) {
            getDexVosUseCase$getDexVosFromRemote$1 = (GetDexVosUseCase$getDexVosFromRemote$1) continuation;
            int i = getDexVosUseCase$getDexVosFromRemote$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getDexVosUseCase$getDexVosFromRemote$1.label = i - Integer.MIN_VALUE;
            } else {
                getDexVosUseCase$getDexVosFromRemote$1 = new GetDexVosUseCase$getDexVosFromRemote$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = getDexVosUseCase$getDexVosFromRemote$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getDexVosUseCase$getDexVosFromRemote$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            C41434qqj.KWHzl.KWHzl("GetDexVosUseCase", "getDexVosFromRemote: fetching from remote [chain=" + dexChainGroupVo.EZpvd() + ", period=" + dexPeriodEnum.name() + ", sorter=" + pair + "]");
            C41488qrk c41488qrk = this.AEQbTJ;
            Quartet quartet = new Quartet(dexChainGroupVo.copydefault(), DexSortByEnum.NONE, dexPeriodEnum, num);
            getDexVosUseCase$getDexVosFromRemote$1.L$0 = this;
            getDexVosUseCase$getDexVosFromRemote$1.L$1 = dexPeriodEnum;
            getDexVosUseCase$getDexVosFromRemote$1.L$2 = interfaceC41652qup;
            getDexVosUseCase$getDexVosFromRemote$1.label = 1;
            objOLrzqt = c41488qrk.OLrzqt(quartet, getDexVosUseCase$getDexVosFromRemote$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c41494qrq = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC41652qup = (InterfaceC41652qup) getDexVosUseCase$getDexVosFromRemote$1.L$2;
            dexPeriodEnum = (DexPeriodEnum) getDexVosUseCase$getDexVosFromRemote$1.L$1;
            c41494qrq = (C41494qrq) getDexVosUseCase$getDexVosFromRemote$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        java.util.List listEZpvd = C41389qpr.EZpvd((java.util.List) objOLrzqt, new Function1() { // from class: o.qrs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41494qrq.OLrzqt(interfaceC41652qup, dexPeriodEnum, c41494qrq, (DexTokenPo) obj);
            }
        });
        c41494qrq.gEmmrt.OLrzqt();
        return listEZpvd;
    }

    public static final java.lang.String copydefault(DexTokenPo dexTokenPo, DexPeriodEnum dexPeriodEnum, C41494qrq c41494qrq) {
        if (dexPeriodEnum == DexPeriodEnum.ONE_DAY) {
            int iEZpvd = c41494qrq.valueOf.EZpvd();
            if (iEZpvd == 1) {
                return dexTokenPo.getPriceChangeUtc0();
            }
            if (iEZpvd == 2) {
                return dexTokenPo.getPriceChangeUtc8();
            }
            return dexTokenPo.getPriceChange();
        }
        return dexTokenPo.getPriceChange();
    }

    public static final InterfaceC41655qus OLrzqt(InterfaceC41652qup interfaceC41652qup, DexPeriodEnum dexPeriodEnum, C41494qrq c41494qrq, DexTokenPo dexTokenPo) {
        Intrinsics.checkNotNullParameter(dexTokenPo, "");
        DexInstrument dexInstrumentCopydefault = DexTokenPo.Companion.copydefault(dexTokenPo);
        java.lang.String strCopydefault = copydefault(dexTokenPo, dexPeriodEnum, c41494qrq);
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) strCopydefault)) {
            strCopydefault = null;
        }
        return interfaceC41652qup.OLrzqt(dexInstrumentCopydefault, strCopydefault != null ? java.lang.Double.valueOf(C33129mqd.AEQbTJ(strCopydefault)) : null, java.lang.Double.valueOf(C33129mqd.AEQbTJ(dexTokenPo.getPrice())), C33129mqd.EZpvd(dexTokenPo.getTurnOver()), C33129mqd.EZpvd(dexTokenPo.getMarketCap()), C33129mqd.EZpvd(dexTokenPo.getLiquidity()), Intrinsics.EZpvd(dexTokenPo.getVerified(), java.lang.Boolean.TRUE), java.lang.Boolean.valueOf(dexTokenPo.getBoosted()), dexTokenPo.getBoostPercentage(), dexTokenPo.getBoostRate());
    }
}
