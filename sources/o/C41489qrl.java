package o;

import com.okinc.market.quotation.data.model.DexChainGroupV2Po;
import com.okinc.market.quotation.domain.dex.GetDexChainGroupUseCase$getChainGroupFromRemote$1;
import com.okinc.market.quotation.domain.dex.GetDexChainGroupUseCase$invoke$1;
import com.okinc.market.quotation.domain.dex.GetDexChainGroupUseCase$onExecute$1;
import com.okinc.market.quotation.ui.model.dex.DexChainGroupVo;
import java.lang.ref.SoftReference;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import o.InterfaceC49404uns;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qrl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class C41489qrl implements InterfaceC49404uns<Unit, java.util.List<? extends DexChainGroupVo>> {
    private static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final Mutex AEQbTJ;
    public volatile SoftReference<java.util.List<DexChainGroupVo>> OLrzqt;
    public final C41448qqx copydefault;

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49404uns.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49404uns.Activity.copydefault(this);
    }

    @Override // o.InterfaceC49404uns, o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd((Unit) obj, (Continuation<? super java.util.List<DexChainGroupVo>>) continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49404uns.Activity.KWHzl(this, input, function2, continuation);
    }

    @yCM
    public C41489qrl(@NotNull C41448qqx c41448qqx) {
        Intrinsics.checkNotNullParameter(c41448qqx, "");
        this.copydefault = c41448qqx;
        this.AEQbTJ = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX INFO: renamed from: o.qrl$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qrl.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:32:0x0023 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull Unit unit, @NotNull Continuation<? super java.util.List<DexChainGroupVo>> continuation) throws java.lang.Throwable {
        GetDexChainGroupUseCase$invoke$1 getDexChainGroupUseCase$invoke$1;
        C41489qrl c41489qrl;
        ?? r2;
        Mutex mutex;
        if (continuation instanceof GetDexChainGroupUseCase$invoke$1) {
            getDexChainGroupUseCase$invoke$1 = (GetDexChainGroupUseCase$invoke$1) continuation;
            int i = getDexChainGroupUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getDexChainGroupUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getDexChainGroupUseCase$invoke$1 = new GetDexChainGroupUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getDexChainGroupUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getDexChainGroupUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Mutex mutex2 = this.AEQbTJ;
                getDexChainGroupUseCase$invoke$1.L$0 = this;
                getDexChainGroupUseCase$invoke$1.L$1 = unit;
                getDexChainGroupUseCase$invoke$1.L$2 = mutex2;
                getDexChainGroupUseCase$invoke$1.label = 1;
                if (mutex2.lock(null, getDexChainGroupUseCase$invoke$1) == objCopydefault) {
                    return objCopydefault;
                }
                c41489qrl = this;
                r2 = unit;
                mutex = mutex2;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Mutex mutex3 = (Mutex) getDexChainGroupUseCase$invoke$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    unit = mutex3;
                    return (java.util.List) objEZpvd;
                }
                Mutex mutex4 = (Mutex) getDexChainGroupUseCase$invoke$1.L$2;
                Unit unit2 = (Unit) getDexChainGroupUseCase$invoke$1.L$1;
                c41489qrl = (C41489qrl) getDexChainGroupUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                r2 = unit2;
                mutex = mutex4;
            }
            getDexChainGroupUseCase$invoke$1.L$0 = mutex;
            getDexChainGroupUseCase$invoke$1.L$1 = null;
            getDexChainGroupUseCase$invoke$1.L$2 = null;
            getDexChainGroupUseCase$invoke$1.label = 2;
            objEZpvd = InterfaceC49404uns.Activity.EZpvd(c41489qrl, r2, getDexChainGroupUseCase$invoke$1);
            unit = mutex;
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            return (java.util.List) objEZpvd;
        } finally {
            unit.unlock(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Unit unit, @NotNull Continuation<? super java.util.List<DexChainGroupVo>> continuation) throws java.lang.Throwable {
        GetDexChainGroupUseCase$onExecute$1 getDexChainGroupUseCase$onExecute$1;
        java.lang.Throwable th;
        C41489qrl c41489qrl;
        SoftReference<java.util.List<DexChainGroupVo>> softReference;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        if (continuation instanceof GetDexChainGroupUseCase$onExecute$1) {
            getDexChainGroupUseCase$onExecute$1 = (GetDexChainGroupUseCase$onExecute$1) continuation;
            int i = getDexChainGroupUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getDexChainGroupUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getDexChainGroupUseCase$onExecute$1 = new GetDexChainGroupUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = getDexChainGroupUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getDexChainGroupUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            C41434qqj c41434qqj = C41434qqj.KWHzl;
            c41434qqj.KWHzl("GetDexChainGroupUseCase", "Starting DEX chain group retrieval");
            try {
                Result.Application application = Result.Companion;
                softReference = this.OLrzqt;
            } catch (java.lang.Throwable th2) {
                th = th2;
                c41489qrl = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (softReference != null && (list = softReference.get()) != null) {
                c41434qqj.KWHzl("GetDexChainGroupUseCase", "GetDexChainGroupUseCase: get from cache");
                c41489qrl = this;
                objM7377constructorimpl = Result.m7377constructorimpl(list);
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                    c41489qrl.OLrzqt = new SoftReference<>((java.util.List) objM7377constructorimpl);
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                java.lang.Object obj = objM7377constructorimpl;
                if (thM7380exceptionOrNullimpl != null) {
                    SoftReference<java.util.List<DexChainGroupVo>> softReference2 = c41489qrl.OLrzqt;
                    java.util.List<DexChainGroupVo> list = softReference2 != null ? softReference2.get() : null;
                    if (list == null || list.isEmpty()) {
                        C41434qqj.e$default(C41434qqj.KWHzl, "GetDexChainGroupUseCase", "GetDexChainGroupUseCase: no cache, throw network error [error: " + thM7380exceptionOrNullimpl + "]", null, 4, null);
                        throw thM7380exceptionOrNullimpl;
                    }
                    C41434qqj.KWHzl.KWHzl("GetDexChainGroupUseCase", "GetDexChainGroupUseCase: use cache as fallback [error: " + thM7380exceptionOrNullimpl + "]");
                    obj = list;
                }
                java.util.List list2 = (java.util.List) obj;
                C41434qqj.KWHzl.KWHzl("GetDexChainGroupUseCase", "DEX chain group retrieval completed - total chains: " + list2.size());
                return list2;
            }
            getDexChainGroupUseCase$onExecute$1.L$0 = this;
            getDexChainGroupUseCase$onExecute$1.label = 1;
            objAEQbTJ = AEQbTJ(getDexChainGroupUseCase$onExecute$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c41489qrl = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c41489qrl = (C41489qrl) getDexChainGroupUseCase$onExecute$1.L$0;
            try {
                C56391yDq.AEQbTJ(objAEQbTJ);
            } catch (java.lang.Throwable th3) {
                th = th3;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        java.util.List<DexChainGroupVo> list3 = (java.util.List) objAEQbTJ;
        objM7377constructorimpl = Result.m7377constructorimpl(list3);
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        java.lang.Object obj2 = objM7377constructorimpl;
        if (thM7380exceptionOrNullimpl != null) {
        }
        java.util.List list22 = (java.util.List) obj2;
        C41434qqj.KWHzl.KWHzl("GetDexChainGroupUseCase", "DEX chain group retrieval completed - total chains: " + list22.size());
        return list22;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(Continuation<? super java.util.List<DexChainGroupVo>> continuation) throws java.lang.Throwable {
        GetDexChainGroupUseCase$getChainGroupFromRemote$1 getDexChainGroupUseCase$getChainGroupFromRemote$1;
        if (continuation instanceof GetDexChainGroupUseCase$getChainGroupFromRemote$1) {
            getDexChainGroupUseCase$getChainGroupFromRemote$1 = (GetDexChainGroupUseCase$getChainGroupFromRemote$1) continuation;
            int i = getDexChainGroupUseCase$getChainGroupFromRemote$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getDexChainGroupUseCase$getChainGroupFromRemote$1.label = i - Integer.MIN_VALUE;
            } else {
                getDexChainGroupUseCase$getChainGroupFromRemote$1 = new GetDexChainGroupUseCase$getChainGroupFromRemote$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getDexChainGroupUseCase$getChainGroupFromRemote$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getDexChainGroupUseCase$getChainGroupFromRemote$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C41448qqx c41448qqx = this.copydefault;
            getDexChainGroupUseCase$getChainGroupFromRemote$1.label = 1;
            objEZpvd = c41448qqx.EZpvd(getDexChainGroupUseCase$getChainGroupFromRemote$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        java.util.List list = (java.util.List) objEZpvd;
        if (list == null || list.isEmpty()) {
            C41434qqj.e$default(C41434qqj.KWHzl, "GetDexChainGroupUseCase", "Failed to get DEX chain list from both trade core and remote API", null, 4, null);
            throw new java.lang.RuntimeException("Failed to get DEX chain list from both trade core and remote API");
        }
        DexChainGroupVo.ActionBar actionBar = DexChainGroupVo.Companion;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new DexChainGroupVo((DexChainGroupV2Po) it.next()));
        }
        return actionBar.EZpvd(arrayList);
    }
}
