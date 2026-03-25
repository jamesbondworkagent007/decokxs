package o;

import com.okinc.market.quotation.data.model.DexTokenPo;
import com.okinc.market.quotation.domain.dex.GetDexBoostVosUseCase$getDexVosFromRemote$1;
import com.okinc.market.quotation.domain.dex.GetDexBoostVosUseCase$invoke$1;
import com.okinc.market.quotation.domain.dex.GetDexBoostVosUseCase$onExecute$1;
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

/* JADX INFO: renamed from: o.qrf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41483qrf implements InterfaceC49404uns<C41495qrr, java.util.List<? extends InterfaceC41655qus>> {
    private static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC46557tYt AhwBna;
    public C41495qrr EZpvd;
    public final C41484qrg OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final C41437qqm djBIcL;

    @yCM
    public C41483qrf(@NotNull C41484qrg c41484qrg, @NotNull C41437qqm c41437qqm, @NotNull InterfaceC46557tYt interfaceC46557tYt) {
        Intrinsics.checkNotNullParameter(c41484qrg, "");
        Intrinsics.checkNotNullParameter(c41437qqm, "");
        Intrinsics.checkNotNullParameter(interfaceC46557tYt, "");
        this.OLrzqt = c41484qrg;
        this.djBIcL = c41437qqm;
        this.AhwBna = interfaceC46557tYt;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.qri
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41483qrf.AhwBna();
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.qrh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41483qrf.AEQbTJ();
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

    @Override // o.InterfaceC49404uns, o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((C41495qrr) obj, (Continuation<? super java.util.List<? extends InterfaceC41655qus>>) continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49404uns.Activity.KWHzl(this, input, function2, continuation);
    }

    /* JADX INFO: renamed from: o.qrf$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qrf.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Mutex AhwBna() {
        return MutexKt.Mutex$default(false, 1, null);
    }

    private final Mutex valueOf() {
        return (Mutex) this.AEQbTJ.getValue();
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
    public java.lang.Object EZpvd(@NotNull C41495qrr c41495qrr, @NotNull Continuation<? super java.util.List<? extends InterfaceC41655qus>> continuation) {
        GetDexBoostVosUseCase$invoke$1 getDexBoostVosUseCase$invoke$1;
        C41483qrf c41483qrf;
        ?? r2;
        Mutex mutex;
        if (continuation instanceof GetDexBoostVosUseCase$invoke$1) {
            getDexBoostVosUseCase$invoke$1 = (GetDexBoostVosUseCase$invoke$1) continuation;
            int i = getDexBoostVosUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getDexBoostVosUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getDexBoostVosUseCase$invoke$1 = new GetDexBoostVosUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getDexBoostVosUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getDexBoostVosUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Mutex mutexValueOf = valueOf();
                getDexBoostVosUseCase$invoke$1.L$0 = this;
                getDexBoostVosUseCase$invoke$1.L$1 = c41495qrr;
                getDexBoostVosUseCase$invoke$1.L$2 = mutexValueOf;
                getDexBoostVosUseCase$invoke$1.label = 1;
                if (mutexValueOf.lock(null, getDexBoostVosUseCase$invoke$1) == objCopydefault) {
                    return objCopydefault;
                }
                c41483qrf = this;
                r2 = c41495qrr;
                mutex = mutexValueOf;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Mutex mutex2 = (Mutex) getDexBoostVosUseCase$invoke$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    c41495qrr = mutex2;
                    return (java.util.List) objEZpvd;
                }
                Mutex mutex3 = (Mutex) getDexBoostVosUseCase$invoke$1.L$2;
                C41495qrr c41495qrr2 = (C41495qrr) getDexBoostVosUseCase$invoke$1.L$1;
                c41483qrf = (C41483qrf) getDexBoostVosUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                r2 = c41495qrr2;
                mutex = mutex3;
            }
            getDexBoostVosUseCase$invoke$1.L$0 = mutex;
            getDexBoostVosUseCase$invoke$1.L$1 = null;
            getDexBoostVosUseCase$invoke$1.L$2 = null;
            getDexBoostVosUseCase$invoke$1.label = 2;
            objEZpvd = InterfaceC49404uns.Activity.EZpvd(c41483qrf, r2, getDexBoostVosUseCase$invoke$1);
            c41495qrr = mutex;
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            return (java.util.List) objEZpvd;
        } finally {
            c41495qrr.unlock(null);
        }
    }

    public final ConcurrentHashMap<java.lang.String, SoftReference<java.util.List<InterfaceC41655qus>>> KWHzl() {
        return (ConcurrentHashMap) this.copydefault.getValue();
    }

    public static final ConcurrentHashMap AEQbTJ() {
        return new ConcurrentHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41495qrr c41495qrr, @NotNull Continuation<? super java.util.List<? extends InterfaceC41655qus>> continuation) throws java.lang.Throwable {
        GetDexBoostVosUseCase$onExecute$1 getDexBoostVosUseCase$onExecute$1;
        java.lang.String str;
        C41483qrf c41483qrf;
        java.lang.String str2;
        java.util.List<InterfaceC41655qus> list;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        if (continuation instanceof GetDexBoostVosUseCase$onExecute$1) {
            getDexBoostVosUseCase$onExecute$1 = (GetDexBoostVosUseCase$onExecute$1) continuation;
            int i = getDexBoostVosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getDexBoostVosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getDexBoostVosUseCase$onExecute$1 = new GetDexBoostVosUseCase$onExecute$1(this, continuation);
            }
        }
        GetDexBoostVosUseCase$onExecute$1 getDexBoostVosUseCase$onExecute$12 = getDexBoostVosUseCase$onExecute$1;
        java.lang.Object objKWHzl = getDexBoostVosUseCase$onExecute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getDexBoostVosUseCase$onExecute$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            DexChainGroupVo dexChainGroupVoKWHzl = c41495qrr.KWHzl();
            DexPeriodEnum dexPeriodEnumEZpvd = c41495qrr.EZpvd();
            kotlin.Pair<DexSortByEnum, SortOrder> pairCopydefault = c41495qrr.copydefault();
            InterfaceC41652qup interfaceC41652qupOLrzqt = c41495qrr.OLrzqt();
            java.lang.Integer numAEQbTJ = c41495qrr.AEQbTJ();
            boolean zAhwBna = c41495qrr.AhwBna();
            C41434qqj c41434qqj = C41434qqj.KWHzl;
            c41434qqj.KWHzl("GetDexVosUseCase", "get dex vos, [input: " + c41495qrr + "]");
            str = dexChainGroupVoKWHzl.EZpvd() + "_" + dexPeriodEnumEZpvd.name();
            C41495qrr c41495qrr2 = this.EZpvd;
            this.EZpvd = c41495qrr;
            try {
                Result.Application application = Result.Companion;
            } catch (java.lang.Throwable th) {
                th = th;
                c41483qrf = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                str2 = str;
            }
            if (c41495qrr2 != null) {
                if ((Intrinsics.EZpvd(c41495qrr2.djBIcL(), dexChainGroupVoKWHzl) && c41495qrr2.gEmmrt() == dexPeriodEnumEZpvd && !Intrinsics.EZpvd(c41495qrr2.AYXKKw(), pairCopydefault)) || zAhwBna) {
                    SoftReference<java.util.List<InterfaceC41655qus>> softReference = KWHzl().get(str);
                    list = softReference != null ? softReference.get() : null;
                    c41434qqj.KWHzl("GetDexVosUseCase", "getDexVosUseCase: get from cache by sorter changed [key: " + str + "]");
                } else {
                    list = null;
                }
                if (list != null) {
                    c41483qrf = this;
                    str2 = str;
                    objM7377constructorimpl = Result.m7377constructorimpl(list);
                    if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                        c41483qrf.KWHzl().put(str2, new SoftReference<>((java.util.List) objM7377constructorimpl));
                    }
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        SoftReference<java.util.List<InterfaceC41655qus>> softReference2 = c41483qrf.KWHzl().get(str2);
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
            getDexBoostVosUseCase$onExecute$12.L$0 = this;
            getDexBoostVosUseCase$onExecute$12.L$1 = str;
            getDexBoostVosUseCase$onExecute$12.label = 1;
            objKWHzl = KWHzl(dexChainGroupVoKWHzl, dexPeriodEnumEZpvd, pairCopydefault, interfaceC41652qupOLrzqt, numAEQbTJ, getDexBoostVosUseCase$onExecute$12);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c41483qrf = this;
            str2 = str;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (java.lang.String) getDexBoostVosUseCase$onExecute$12.L$1;
            c41483qrf = (C41483qrf) getDexBoostVosUseCase$onExecute$12.L$0;
            try {
                C56391yDq.AEQbTJ(objKWHzl);
            } catch (java.lang.Throwable th2) {
                th = th2;
                str = str2;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                str2 = str;
            }
        }
        list = (java.util.List) objKWHzl;
        objM7377constructorimpl = Result.m7377constructorimpl(list);
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return (java.util.List) objM7377constructorimpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(DexChainGroupVo dexChainGroupVo, final DexPeriodEnum dexPeriodEnum, kotlin.Pair<? extends DexSortByEnum, ? extends SortOrder> pair, final InterfaceC41652qup interfaceC41652qup, java.lang.Integer num, Continuation<? super java.util.List<? extends InterfaceC41655qus>> continuation) throws java.lang.Throwable {
        GetDexBoostVosUseCase$getDexVosFromRemote$1 getDexBoostVosUseCase$getDexVosFromRemote$1;
        final C41483qrf c41483qrf;
        if (continuation instanceof GetDexBoostVosUseCase$getDexVosFromRemote$1) {
            getDexBoostVosUseCase$getDexVosFromRemote$1 = (GetDexBoostVosUseCase$getDexVosFromRemote$1) continuation;
            int i = getDexBoostVosUseCase$getDexVosFromRemote$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getDexBoostVosUseCase$getDexVosFromRemote$1.label = i - Integer.MIN_VALUE;
            } else {
                getDexBoostVosUseCase$getDexVosFromRemote$1 = new GetDexBoostVosUseCase$getDexVosFromRemote$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getDexBoostVosUseCase$getDexVosFromRemote$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getDexBoostVosUseCase$getDexVosFromRemote$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            C41434qqj.KWHzl.KWHzl("GetDexVosUseCase", "getDexVosFromRemote: fetching from remote [chain=" + dexChainGroupVo.EZpvd() + ", period=" + dexPeriodEnum.name() + ", sorter=" + pair + "]");
            C41484qrg c41484qrg = this.OLrzqt;
            Quartet quartet = new Quartet(dexChainGroupVo.copydefault(), DexSortByEnum.NONE, dexPeriodEnum, num);
            getDexBoostVosUseCase$getDexVosFromRemote$1.L$0 = this;
            getDexBoostVosUseCase$getDexVosFromRemote$1.L$1 = dexPeriodEnum;
            getDexBoostVosUseCase$getDexVosFromRemote$1.L$2 = interfaceC41652qup;
            getDexBoostVosUseCase$getDexVosFromRemote$1.label = 1;
            objCopydefault = c41484qrg.copydefault((java.lang.Object) quartet, (Continuation) getDexBoostVosUseCase$getDexVosFromRemote$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c41483qrf = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC41652qup = (InterfaceC41652qup) getDexBoostVosUseCase$getDexVosFromRemote$1.L$2;
            dexPeriodEnum = (DexPeriodEnum) getDexBoostVosUseCase$getDexVosFromRemote$1.L$1;
            c41483qrf = (C41483qrf) getDexBoostVosUseCase$getDexVosFromRemote$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        java.util.List listEZpvd = C41389qpr.EZpvd((java.util.List) objCopydefault, new Function1() { // from class: o.qrj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41483qrf.AEQbTJ(interfaceC41652qup, dexPeriodEnum, c41483qrf, (DexTokenPo) obj);
            }
        });
        c41483qrf.djBIcL.OLrzqt();
        return listEZpvd;
    }

    public static final java.lang.String KWHzl(DexTokenPo dexTokenPo, DexPeriodEnum dexPeriodEnum, C41483qrf c41483qrf) {
        if (dexPeriodEnum == DexPeriodEnum.ONE_DAY) {
            int iEZpvd = c41483qrf.AhwBna.EZpvd();
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

    public static final InterfaceC41655qus AEQbTJ(InterfaceC41652qup interfaceC41652qup, DexPeriodEnum dexPeriodEnum, C41483qrf c41483qrf, DexTokenPo dexTokenPo) {
        Intrinsics.checkNotNullParameter(dexTokenPo, "");
        DexInstrument dexInstrumentCopydefault = DexTokenPo.Companion.copydefault(dexTokenPo);
        java.lang.String strKWHzl = KWHzl(dexTokenPo, dexPeriodEnum, c41483qrf);
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) strKWHzl)) {
            strKWHzl = null;
        }
        return interfaceC41652qup.OLrzqt(dexInstrumentCopydefault, strKWHzl != null ? java.lang.Double.valueOf(C33129mqd.AEQbTJ(strKWHzl)) : null, java.lang.Double.valueOf(C33129mqd.AEQbTJ(dexTokenPo.getPrice())), C33129mqd.EZpvd(dexTokenPo.getTurnOver()), C33129mqd.EZpvd(dexTokenPo.getMarketCap()), C33129mqd.EZpvd(dexTokenPo.getLiquidity()), Intrinsics.EZpvd(dexTokenPo.getVerified(), java.lang.Boolean.TRUE), java.lang.Boolean.valueOf(dexTokenPo.getBoosted()), dexTokenPo.getBoostPercentage(), dexTokenPo.getBoostRate());
    }
}
