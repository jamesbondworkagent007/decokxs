package com.okinc.business.defi.biz.core.wallet;

import com.okinc.wallet.mln.service.UDWalletManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.sync.Mutex;
import o.AbstractC12782ctV;
import o.C12827cuN;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yDT;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletManager$fetchMainWallet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC12782ctV>, Object> {
    final /* synthetic */ boolean $needSubWallets;
    final /* synthetic */ StackTraceElement[] $stackTrace;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ C12827cuN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletManager$fetchMainWallet$1(C12827cuN c12827cuN, boolean z, StackTraceElement[] stackTraceElementArr, Continuation<? super WalletManager$fetchMainWallet$1> continuation) {
        super(2, continuation);
        this.this$0 = c12827cuN;
        this.$needSubWallets = z;
        this.$stackTrace = stackTraceElementArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletManager$fetchMainWallet$1(this.this$0, this.$needSubWallets, this.$stackTrace, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC12782ctV> continuation) {
        return ((WalletManager$fetchMainWallet$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [683=4] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[Catch: all -> 0x003d, TryCatch #2 {all -> 0x003d, blocks: (B:15:0x0030, B:41:0x00c6, B:18:0x0039, B:37:0x008f, B:32:0x0078, B:34:0x0082, B:38:0x00b9), top: B:62:0x000e, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9 A[Catch: all -> 0x003d, TryCatch #2 {all -> 0x003d, blocks: (B:15:0x0030, B:41:0x00c6, B:18:0x0039, B:37:0x008f, B:32:0x0078, B:34:0x0082, B:38:0x00b9), top: B:62:0x000e, outer: #3 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        boolean z;
        Mutex mutex;
        C12827cuN c12827cuN;
        Mutex mutex2;
        AbstractC12782ctV abstractC12782ctV;
        Object objCopydefault = C56442yFn.copydefault();
        ?? r1 = this.label;
        try {
            try {
            } catch (Throwable th) {
                r1.unlock(null);
                throw th;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th2) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        if (r1 == 0) {
            C56391yDq.AEQbTJ(obj);
            C12827cuN c12827cuN2 = this.this$0;
            z = this.$needSubWallets;
            Result.Application application2 = Result.Companion;
            if (c12827cuN2.copydefault.isEmpty()) {
                mutex = c12827cuN2.isConnected;
                this.L$0 = c12827cuN2;
                this.L$1 = mutex;
                this.Z$0 = z;
                this.label = 1;
                if (mutex.lock(null, this) == objCopydefault) {
                    return objCopydefault;
                }
                c12827cuN = c12827cuN2;
                boolean z2 = z;
                mutex2 = mutex;
                if (c12827cuN.copydefault.isEmpty()) {
                }
            } else {
                this.label = 4;
                obj = C12827cuN.EZpvd(c12827cuN2, z, (Continuation<? super AbstractC12782ctV>) this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                abstractC12782ctV = (AbstractC12782ctV) obj;
                objM7377constructorimpl = Result.m7377constructorimpl(abstractC12782ctV);
            }
        } else if (r1 == 1) {
            z = this.Z$0;
            mutex = (Mutex) this.L$1;
            c12827cuN = (C12827cuN) this.L$0;
            C56391yDq.AEQbTJ(obj);
            boolean z22 = z;
            mutex2 = mutex;
            if (c12827cuN.copydefault.isEmpty()) {
                this.L$0 = mutex2;
                this.L$1 = null;
                this.label = 3;
                obj = C12827cuN.EZpvd(c12827cuN, z22, (Continuation<? super AbstractC12782ctV>) this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                abstractC12782ctV = (AbstractC12782ctV) obj;
                mutex2.unlock(null);
                objM7377constructorimpl = Result.m7377constructorimpl(abstractC12782ctV);
            } else {
                this.L$0 = mutex2;
                this.L$1 = null;
                this.label = 2;
                obj = c12827cuN.AEQbTJ((Continuation<? super List<? extends AbstractC12782ctV>>) this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                pUU.OLrzqt(UDWalletManager.LUA_CLASS_NAME, "[" + Thread.currentThread().getName() + "]\tfetchMainWallets().await");
                abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel((List) obj);
                mutex2.unlock(null);
                objM7377constructorimpl = Result.m7377constructorimpl(abstractC12782ctV);
            }
        } else if (r1 == 2) {
            mutex2 = (Mutex) this.L$0;
            C56391yDq.AEQbTJ(obj);
            pUU.OLrzqt(UDWalletManager.LUA_CLASS_NAME, "[" + Thread.currentThread().getName() + "]\tfetchMainWallets().await");
            abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel((List) obj);
            mutex2.unlock(null);
            objM7377constructorimpl = Result.m7377constructorimpl(abstractC12782ctV);
        } else if (r1 == 3) {
            mutex2 = (Mutex) this.L$0;
            C56391yDq.AEQbTJ(obj);
            abstractC12782ctV = (AbstractC12782ctV) obj;
            mutex2.unlock(null);
            objM7377constructorimpl = Result.m7377constructorimpl(abstractC12782ctV);
        } else {
            if (r1 != 4) {
                if (r1 == 5) {
                    C56391yDq.AEQbTJ(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            abstractC12782ctV = (AbstractC12782ctV) obj;
            objM7377constructorimpl = Result.m7377constructorimpl(abstractC12782ctV);
        }
        StackTraceElement[] stackTraceElementArr = this.$stackTrace;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            StackTraceElement[] stackTrace = thM7380exceptionOrNullimpl.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "");
            Intrinsics.copydefault(stackTraceElementArr);
            thM7380exceptionOrNullimpl.setStackTrace((StackTraceElement[]) yDT.EZpvd((Object[]) stackTrace, (Object[]) stackTraceElementArr));
            pUU.AEQbTJ(UDWalletManager.LUA_CLASS_NAME, "fetchMainWallets()", thM7380exceptionOrNullimpl);
        }
        C56391yDq.AEQbTJ(objM7377constructorimpl);
        MainCoroutineDispatcher main = Dispatchers.getMain();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1((AbstractC12782ctV) objM7377constructorimpl, this.this$0, null);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 5;
        obj = BuildersKt.withContext(main, anonymousClass1, this);
        return obj == objCopydefault ? objCopydefault : obj;
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.biz.core.wallet.WalletManager$fetchMainWallet$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC12782ctV>, Object> {
        final /* synthetic */ AbstractC12782ctV $wallet;
        int label;
        final /* synthetic */ C12827cuN this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC12782ctV abstractC12782ctV, C12827cuN c12827cuN, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$wallet = abstractC12782ctV;
            this.this$0 = c12827cuN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$wallet, this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC12782ctV> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.$wallet);
                this.this$0.djBIcL = arrayList;
                return this.$wallet;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
