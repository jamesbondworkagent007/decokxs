package com.okinc.okimcore.feature.message.manager;

import com.okinc.core.livelistener.OKWsConnectionState;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMResponse;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import o.C44124sEe;
import o.C44302sKu;
import o.C56391yDq;
import o.C56441yFm;
import o.C56442yFn;
import o.C56447yFs;
import o.sED;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMWebSocketSyncManagerImpl$initConnection$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ C44302sKu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMWebSocketSyncManagerImpl$initConnection$2(C44302sKu c44302sKu, Continuation<? super InHouseIMWebSocketSyncManagerImpl$initConnection$2> continuation) {
        super(2, continuation);
        this.this$0 = c44302sKu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InHouseIMWebSocketSyncManagerImpl$initConnection$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InHouseIMWebSocketSyncManagerImpl$initConnection$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C44302sKu c44302sKu = this.this$0;
            this.L$0 = c44302sKu;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(this), 1);
            cancellableContinuationImpl.initCancellability();
            sED sed = c44302sKu.QVAiDq;
            sed.OLrzqt(new Activity(cancellableContinuationImpl, c44302sKu));
            sed.copydefault(new StateListAnimator(c44302sKu));
            sed.EZpvd(new Application(c44302sKu));
            sed.AEQbTJ();
            sed.EZpvd();
            cancellableContinuationImpl.invokeOnCancellation(ActionBar.OLrzqt);
            Object result = cancellableContinuationImpl.getResult();
            if (result == C56442yFn.copydefault()) {
                C56447yFs.copydefault(this);
            }
            if (result == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    public static final class Activity implements Function1<OKWsConnectionState, Unit> {
        public final /* synthetic */ CancellableContinuation<Unit> EZpvd;
        public final /* synthetic */ C44302sKu KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(CancellableContinuation<? super Unit> cancellableContinuation, C44302sKu c44302sKu) {
            this.EZpvd = cancellableContinuation;
            this.KWHzl = c44302sKu;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(OKWsConnectionState oKWsConnectionState) {
            copydefault(oKWsConnectionState);
            return Unit.INSTANCE;
        }

        public final void copydefault(OKWsConnectionState oKWsConnectionState) {
            Intrinsics.checkNotNullParameter(oKWsConnectionState, "");
            C44124sEe.imLogSync$default("initConnection => waiting connection state completed: " + oKWsConnectionState, null, null, 6, null);
            if (!this.EZpvd.isCompleted()) {
                CancellableContinuation<Unit> cancellableContinuation = this.EZpvd;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
            }
            this.KWHzl.copydefault(oKWsConnectionState);
        }
    }

    public static final class StateListAnimator implements Function1<String, Unit> {
        public final /* synthetic */ C44302sKu AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(C44302sKu c44302sKu) {
            this.AEQbTJ = c44302sKu;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(String str) {
            copydefault(str);
            return Unit.INSTANCE;
        }

        public final void copydefault(String str) {
            this.AEQbTJ.AYXKKw.tryEmit(str);
        }
    }

    public static final class Application implements Function1<InHouseIMResponse, Unit> {
        public final /* synthetic */ C44302sKu AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(C44302sKu c44302sKu) {
            this.AEQbTJ = c44302sKu;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(InHouseIMResponse inHouseIMResponse) {
            EZpvd(inHouseIMResponse);
            return Unit.INSTANCE;
        }

        public final void EZpvd(InHouseIMResponse inHouseIMResponse) {
            Intrinsics.checkNotNullParameter(inHouseIMResponse, "");
            this.AEQbTJ.KWHzl(inHouseIMResponse);
        }
    }

    public static final class ActionBar implements Function1<Throwable, Unit> {
        public static final ActionBar OLrzqt = new ActionBar();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Throwable th) {
            OLrzqt(th);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(Throwable th) {
            C44124sEe.imLogSync$default("initConnection => waiting connection state cancelled", null, null, 6, null);
        }
    }
}
