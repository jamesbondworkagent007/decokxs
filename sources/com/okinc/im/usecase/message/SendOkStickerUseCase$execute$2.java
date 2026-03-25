package com.okinc.im.usecase.message;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56434yFf;
import o.C56441yFm;
import o.C56442yFn;
import o.C56447yFs;
import o.InterfaceC44290sKi;
import o.oEF;

/* JADX INFO: loaded from: classes18.dex */
public final class SendOkStickerUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super OKMessage>, Object> {
    final /* synthetic */ OKMessage $message;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ oEF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendOkStickerUseCase$execute$2(oEF oef, OKMessage oKMessage, Continuation<? super SendOkStickerUseCase$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = oef;
        this.$message = oKMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SendOkStickerUseCase$execute$2 sendOkStickerUseCase$execute$2 = new SendOkStickerUseCase$execute$2(this.this$0, this.$message, continuation);
        sendOkStickerUseCase$execute$2.L$0 = obj;
        return sendOkStickerUseCase$execute$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OKMessage> continuation) {
        return ((SendOkStickerUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            oEF oef = this.this$0;
            OKMessage oKMessage = this.$message;
            this.L$0 = coroutineScope;
            this.L$1 = oef;
            this.L$2 = oKMessage;
            this.label = 1;
            C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(this));
            try {
                Result.Application application = Result.Companion;
                oef.KWHzl.KWHzl(oKMessage, new ActionBar(c56434yFf));
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                Result.Application application3 = Result.Companion;
                c56434yFf.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl)));
            }
            obj = c56434yFf.KWHzl();
            if (obj == C56442yFn.copydefault()) {
                C56447yFs.copydefault(this);
            }
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

    public static final class ActionBar implements InterfaceC44290sKi {
        public final /* synthetic */ Continuation<OKMessage> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC44289sKh
        public void copydefault(OKMessage oKMessage) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super com.okinc.okimcore.model.im.OKMessage> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(Continuation<? super OKMessage> continuation) {
            this.AEQbTJ = continuation;
        }

        @Override // o.InterfaceC44289sKh
        public void AEQbTJ(OKMessage oKMessage) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            Continuation<OKMessage> continuation = this.AEQbTJ;
            Result.Application application = Result.Companion;
            continuation.resumeWith(Result.m7377constructorimpl(oKMessage));
        }

        @Override // o.InterfaceC44289sKh
        public void OLrzqt(OKMessage oKMessage, Throwable th) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            Intrinsics.checkNotNullParameter(th, "");
            Continuation<OKMessage> continuation = this.AEQbTJ;
            Result.Application application = Result.Companion;
            continuation.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(th)));
        }
    }
}
