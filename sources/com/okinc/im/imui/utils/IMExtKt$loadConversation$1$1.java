package com.okinc.im.imui.utils;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.sGF;

/* JADX INFO: loaded from: classes8.dex */
public final class IMExtKt$loadConversation$1$1 extends SuspendLambda implements Function1<Continuation<? super OKConversation>, Object> {
    final /* synthetic */ OKConversationType $conversationType;
    final /* synthetic */ boolean $createIfNotExist;
    final /* synthetic */ InterfaceC35180nqU $okimService;
    final /* synthetic */ String $this_loadConversation;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IMExtKt$loadConversation$1$1(InterfaceC35180nqU interfaceC35180nqU, OKConversationType oKConversationType, String str, boolean z, Continuation<? super IMExtKt$loadConversation$1$1> continuation) {
        super(1, continuation);
        this.$okimService = interfaceC35180nqU;
        this.$conversationType = oKConversationType;
        this.$this_loadConversation = str;
        this.$createIfNotExist = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new IMExtKt$loadConversation$1$1(this.$okimService, this.$conversationType, this.$this_loadConversation, this.$createIfNotExist, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super OKConversation> continuation) {
        return ((IMExtKt$loadConversation$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sGF sgfKWHzl = this.$okimService.KWHzl();
            OKConversationType oKConversationType = this.$conversationType;
            String str = this.$this_loadConversation;
            boolean z = this.$createIfNotExist;
            this.label = 1;
            obj = sGF.Activity.getConversation$default(sgfKWHzl, oKConversationType, str, z, false, null, this, 24, null);
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
