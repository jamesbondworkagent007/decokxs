package com.okinc.okmarket.data;

import androidx.lifecycle.LifecycleOwner;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C55608xnE;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;
import o.pWO;

/* JADX INFO: loaded from: classes10.dex */
public final class MarketDataApiImpl$tryInitOkTrade$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketDataApiImpl$tryInitOkTrade$2(LifecycleOwner lifecycleOwner, Continuation<? super MarketDataApiImpl$tryInitOkTrade$2> continuation) {
        super(2, continuation);
        this.$lifecycleOwner = lifecycleOwner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketDataApiImpl$tryInitOkTrade$2(this.$lifecycleOwner, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Unit>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
        return ((MarketDataApiImpl$tryInitOkTrade$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
                Result.Application application = Result.Companion;
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
                if (interfaceC54581xNrOLrzqt == null || !InterfaceC54581xNr.TaskDescription.isInit$default(interfaceC54581xNrOLrzqt, null, 1, null)) {
                    InterfaceC54577xNn interfaceC54577xNnKWHzl = pWO.KWHzl();
                    this.label = 1;
                    if (C55608xnE.AEQbTJ(interfaceC54577xNnKWHzl, lifecycleOwner, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
