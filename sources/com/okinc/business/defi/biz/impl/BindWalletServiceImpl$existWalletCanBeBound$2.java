package com.okinc.business.defi.biz.impl;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.reactive.AwaitKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58185ywX;
import o.AbstractC58260yxt;
import o.C10337bmZ;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC9739bbK;
import o.cUH;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class BindWalletServiceImpl$existWalletCanBeBound$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Boolean>>, Object> {
    final /* synthetic */ Long $chainIndex;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ cUH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BindWalletServiceImpl$existWalletCanBeBound$2(cUH cuh, Long l, Continuation<? super BindWalletServiceImpl$existWalletCanBeBound$2> continuation) {
        super(2, continuation);
        this.this$0 = cuh;
        this.$chainIndex = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BindWalletServiceImpl$existWalletCanBeBound$2(this.this$0, this.$chainIndex, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Boolean>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Boolean>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Boolean>> continuation) {
        return ((BindWalletServiceImpl$existWalletCanBeBound$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0079 A[Catch: all -> 0x00a4, CancellationException -> 0x00c1, TryCatch #2 {CancellationException -> 0x00c1, all -> 0x00a4, blocks: (B:7:0x0014, B:22:0x0064, B:24:0x006f, B:39:0x009b, B:27:0x0079, B:28:0x007d, B:30:0x0083, B:34:0x0091, B:33:0x008d, B:12:0x0028, B:18:0x0049, B:15:0x0034), top: B:50:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083 A[Catch: all -> 0x00a4, CancellationException -> 0x00c1, TryCatch #2 {CancellationException -> 0x00c1, all -> 0x00a4, blocks: (B:7:0x0014, B:22:0x0064, B:24:0x006f, B:39:0x009b, B:27:0x0079, B:28:0x007d, B:30:0x0083, B:34:0x0091, B:33:0x008d, B:12:0x0028, B:18:0x0049, B:15:0x0034), top: B:50:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        cUH cuh;
        Long l;
        Long l2;
        Iterable<AbstractC12782ctV> iterable;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            cuh = this.this$0;
            l = this.$chainIndex;
            Result.Application application2 = Result.Companion;
            AbstractC58185ywX abstractC58185ywXEnsureInitialized$default = InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(C10337bmZ.KWHzl, false, 1, null);
            this.L$0 = cuh;
            this.L$1 = l;
            this.label = 1;
            if (AwaitKt.awaitFirst(abstractC58185ywXEnsureInitialized$default, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l2 = (Long) this.L$0;
                C56391yDq.AEQbTJ(obj);
                Intrinsics.checkNotNullExpressionValue(obj, "");
                iterable = (Iterable) obj;
                if ((iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (AbstractC12782ctV abstractC12782ctV : iterable) {
                        boolean zKWHzl = l2 == null ? true : abstractC12782ctV.KWHzl(l2);
                        if (abstractC12782ctV.fZBcTu() && zKWHzl) {
                            break;
                        }
                    }
                }
                z = false;
                objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(z));
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("BindWalletServiceImpl", "existWalletCanBeBound onFailure", thM7380exceptionOrNullimpl);
                }
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            Long l3 = (Long) this.L$1;
            cuh = (cUH) this.L$0;
            C56391yDq.AEQbTJ(obj);
            l = l3;
        }
        AbstractC58260yxt<List<AbstractC12782ctV>> abstractC58260yxtFetchVPNInfo = cuh.AYXKKw.AhwBna().fetchVPNInfo();
        this.L$0 = l;
        this.L$1 = null;
        this.label = 2;
        Object objAwait = RxAwaitKt.await(abstractC58260yxtFetchVPNInfo, this);
        if (objAwait == objCopydefault) {
            return objCopydefault;
        }
        l2 = l;
        obj = objAwait;
        Intrinsics.checkNotNullExpressionValue(obj, "");
        iterable = (Iterable) obj;
        if (iterable instanceof Collection) {
            while (r8.hasNext()) {
            }
            z = false;
            objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(z));
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
