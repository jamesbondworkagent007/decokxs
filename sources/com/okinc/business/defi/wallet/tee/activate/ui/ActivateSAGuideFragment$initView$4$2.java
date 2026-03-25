package com.okinc.business.defi.wallet.tee.activate.ui;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C12827cuN;
import o.C17818fTk;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class ActivateSAGuideFragment$initView$4$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ C17818fTk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivateSAGuideFragment$initView$4$2(C17818fTk c17818fTk, Continuation<? super ActivateSAGuideFragment$initView$4$2> continuation) {
        super(2, continuation);
        this.this$0 = c17818fTk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ActivateSAGuideFragment$initView$4$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ActivateSAGuideFragment$initView$4$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        C17818fTk c17818fTk;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C17818fTk c17818fTk2 = this.this$0;
            Result.Application application2 = Result.Companion;
            String accountId = c17818fTk2.AEQbTJ().getAccountId();
            if (!StringsKt__StringsKt.fARcdN((CharSequence) accountId)) {
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(accountId, false);
                this.L$0 = c17818fTk2;
                this.label = 1;
                Object objAwait = RxAwaitKt.await(abstractC58260yxtOLrzqt, this);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
                c17818fTk = c17818fTk2;
                obj = objAwait;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("failed to get wallet : ", thM7380exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c17818fTk = (C17818fTk) this.L$0;
        C56391yDq.AEQbTJ(obj);
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj;
        if (abstractC12782ctV.RJOkX() && !abstractC12782ctV.DTwDnp()) {
            c17818fTk.EZpvd.launch(abstractC12782ctV.DbNXlk());
        } else if (!abstractC12782ctV.RJOkX()) {
            c17818fTk.OLrzqt.launch(c17818fTk.AEQbTJ());
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
