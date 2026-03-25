package com.okinc.business.defi.dapp.webview;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C15112dyF;
import o.C15196dzk;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC9738bbJ;

/* JADX INFO: loaded from: classes4.dex */
public final class DappNewWebFragment$selectWallet$1$1$2$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ InterfaceC9738bbJ $wallet;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DappNewWebFragment$selectWallet$1$1$2$result$1(InterfaceC9738bbJ interfaceC9738bbJ, Continuation<? super DappNewWebFragment$selectWallet$1$1$2$result$1> continuation) {
        super(2, continuation);
        this.$wallet = interfaceC9738bbJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DappNewWebFragment$selectWallet$1$1$2$result$1(this.$wallet, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((DappNewWebFragment$selectWallet$1$1$2$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.dapp.webview.DappNewWebFragment$selectWallet$1$1$2$result$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ InterfaceC9738bbJ $wallet;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC9738bbJ interfaceC9738bbJ, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$wallet = interfaceC9738bbJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$wallet, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z;
            List<String> okxConnectRequiredGeneralChainIds;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
                if (dappTabDataOLrzqt == null || (okxConnectRequiredGeneralChainIds = dappTabDataOLrzqt.getOkxConnectRequiredGeneralChainIds()) == null) {
                    z = false;
                    break;
                }
                InterfaceC9738bbJ interfaceC9738bbJ = this.$wallet;
                if (!okxConnectRequiredGeneralChainIds.isEmpty()) {
                    Iterator<T> it = okxConnectRequiredGeneralChainIds.iterator();
                    while (it.hasNext()) {
                        if (!C15196dzk.KWHzl.KWHzl(interfaceC9738bbJ.DbNXlk(), C56443yFo.KWHzl(C33129mqd.valueOf((String) it.next())))) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                return C56443yFo.KWHzl(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$wallet, null);
            this.label = 1;
            obj = BuildersKt.withContext(main, anonymousClass1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
