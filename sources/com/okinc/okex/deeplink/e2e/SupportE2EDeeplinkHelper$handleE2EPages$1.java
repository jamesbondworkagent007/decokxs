package com.okinc.okex.deeplink.e2e;

import android.content.Context;
import android.content.Intent;
import com.okinc.biz.model.ModuleType;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C6803aWK;
import o.InterfaceC6804aWL;

/* JADX INFO: loaded from: classes10.dex */
public final class SupportE2EDeeplinkHelper$handleE2EPages$1 extends SuspendLambda implements Function2<Context, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $acContext;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportE2EDeeplinkHelper$handleE2EPages$1(Context context, Continuation<? super SupportE2EDeeplinkHelper$handleE2EPages$1> continuation) {
        super(2, continuation);
        this.$acContext = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SupportE2EDeeplinkHelper$handleE2EPages$1 supportE2EDeeplinkHelper$handleE2EPages$1 = new SupportE2EDeeplinkHelper$handleE2EPages$1(this.$acContext, continuation);
        supportE2EDeeplinkHelper$handleE2EPages$1.L$0 = obj;
        return supportE2EDeeplinkHelper$handleE2EPages$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Context context, Continuation<? super Unit> continuation) {
        return ((SupportE2EDeeplinkHelper$handleE2EPages$1) create(context, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Context context = (Context) this.L$0;
            C6803aWK c6803aWK = new C6803aWK(ModuleType.AffiliatePortal, null, null, null, 14, null);
            InterfaceC6804aWL interfaceC6804aWL = (InterfaceC6804aWL) C43251rlk.OLrzqt(InterfaceC6804aWL.class);
            if (interfaceC6804aWL != null) {
                this.label = 1;
                objCopydefault = interfaceC6804aWL.copydefault(context, c6803aWK, this);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        objCopydefault = ((Result) obj).m7386unboximpl();
        Result.m7380exceptionOrNullimpl(objCopydefault);
        if (Result.m7383isFailureimpl(objCopydefault)) {
            objCopydefault = null;
        }
        Intent intent = (Intent) objCopydefault;
        if (intent != null) {
            this.$acContext.startActivity(intent);
        }
        return Unit.INSTANCE;
    }
}
