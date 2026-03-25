package com.okinc.localization;

import com.okinc.localization.bean.RemoteUpdateStatus;
import com.okinc.localization2.bean.LanguageUpdateResult;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC58184ywW;
import o.pSC;
import o.pSD;
import o.pTJ;

/* JADX INFO: loaded from: classes9.dex */
public final class OKLocalize$updateLanguage$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC58184ywW<pSD> $it;
    Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKLocalize$updateLanguage$1$1(InterfaceC58184ywW<pSD> interfaceC58184ywW, Continuation<? super OKLocalize$updateLanguage$1$1> continuation) {
        super(2, continuation);
        this.$it = interfaceC58184ywW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKLocalize$updateLanguage$1$1(this.$it, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKLocalize$updateLanguage$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        InterfaceC58184ywW<pSD> interfaceC58184ywW;
        RemoteUpdateStatus remoteUpdateStatus;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC58184ywW<pSD> interfaceC58184ywW2 = this.$it;
                Result.Application application = Result.Companion;
                pTJ ptj = pSC.copydefault;
                this.L$0 = interfaceC58184ywW2;
                this.label = 1;
                Object objAEQbTJ = ptj.AEQbTJ(this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                interfaceC58184ywW = interfaceC58184ywW2;
                obj = objAEQbTJ;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC58184ywW = (InterfaceC58184ywW) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            LanguageUpdateResult languageUpdateResult = (LanguageUpdateResult) obj;
            if (languageUpdateResult instanceof LanguageUpdateResult.ActionBar) {
                remoteUpdateStatus = RemoteUpdateStatus.FAILED;
            } else if (Intrinsics.EZpvd(languageUpdateResult, LanguageUpdateResult.TaskDescription.OLrzqt)) {
                remoteUpdateStatus = RemoteUpdateStatus.LATEST;
            } else {
                if (!Intrinsics.EZpvd(languageUpdateResult, LanguageUpdateResult.Application.KWHzl)) {
                    throw new NoWhenBranchMatchedException();
                }
                remoteUpdateStatus = RemoteUpdateStatus.UPDATED;
            }
            pSD psd = new pSD(null, null, null, 7, null);
            psd.copydefault(remoteUpdateStatus);
            psd.OLrzqt(RemoteUpdateStatus.LATEST);
            interfaceC58184ywW.onNext(psd);
            interfaceC58184ywW.onComplete();
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        InterfaceC58184ywW<pSD> interfaceC58184ywW3 = this.$it;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            thM7380exceptionOrNullimpl.printStackTrace();
            interfaceC58184ywW3.onError(thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
