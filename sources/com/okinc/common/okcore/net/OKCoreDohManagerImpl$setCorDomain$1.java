package com.okinc.common.okcore.net;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C32529mfM;
import o.C43372rnz;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import uniffi.network.OkdohfFiException;

/* JADX INFO: loaded from: classes7.dex */
public final class OKCoreDohManagerImpl$setCorDomain$1 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $httpHost;
    final /* synthetic */ long $timeoutMs;
    final /* synthetic */ String $userSite;
    final /* synthetic */ String $wsDexHost;
    final /* synthetic */ String $wsv5Host;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKCoreDohManagerImpl$setCorDomain$1(String str, String str2, String str3, String str4, long j, Continuation<? super OKCoreDohManagerImpl$setCorDomain$1> continuation) {
        super(1, continuation);
        this.$userSite = str;
        this.$httpHost = str2;
        this.$wsv5Host = str3;
        this.$wsDexHost = str4;
        this.$timeoutMs = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OKCoreDohManagerImpl$setCorDomain$1(this.$userSite, this.$httpHost, this.$wsv5Host, this.$wsDexHost, this.$timeoutMs, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Boolean> continuation) {
        return ((OKCoreDohManagerImpl$setCorDomain$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C43372rnz c43372rnz = C43372rnz.copydefault;
            String str = this.$userSite;
            String str2 = this.$httpHost;
            String str3 = this.$wsv5Host;
            String str4 = this.$wsDexHost;
            long j = this.$timeoutMs;
            this.label = 1;
            objAEQbTJ = c43372rnz.AEQbTJ(str, str2, str3, str4, j, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.KWHzl("OKCoreDohManagerImpl", "got network error msg from setCorDomain");
            String message = thM7380exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = C32529mfM.Companion.AEQbTJ();
            }
            throw new OkdohfFiException.Exception(message);
        }
        return C56443yFo.KWHzl(true);
    }
}
