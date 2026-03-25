package com.okinc.im.imui.inputpanel.plugin;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C37127onv;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35259nru;
import o.sNK;

/* JADX INFO: loaded from: classes18.dex */
public final class AudioCallPluginHelper$ableToMakeCall$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super sNK>, Object> {
    final /* synthetic */ String $targetId;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioCallPluginHelper$ableToMakeCall$2$1(String str, Continuation<? super AudioCallPluginHelper$ableToMakeCall$2$1> continuation) {
        super(2, continuation);
        this.$targetId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AudioCallPluginHelper$ableToMakeCall$2$1(this.$targetId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super sNK> continuation) {
        return ((AudioCallPluginHelper$ableToMakeCall$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC35259nru interfaceC35259nruAhwBna = C37127onv.AEQbTJ.AhwBna();
            String str = this.$targetId;
            this.label = 1;
            obj = interfaceC35259nruAhwBna.AEQbTJ(str, this);
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
