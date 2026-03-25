package com.okinc.im.imui.messages.audio.call.service;

import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35864oGn;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35331ntM;

/* JADX INFO: loaded from: classes8.dex */
public final class OKIMAudioCallFloatingViewService$resolveP2PDisplayInfo$relationInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RelationInfo>, Object> {
    final /* synthetic */ String $remoteUserId;
    final /* synthetic */ InterfaceC35331ntM $useCaseComponent;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKIMAudioCallFloatingViewService$resolveP2PDisplayInfo$relationInfo$1(InterfaceC35331ntM interfaceC35331ntM, String str, Continuation<? super OKIMAudioCallFloatingViewService$resolveP2PDisplayInfo$relationInfo$1> continuation) {
        super(2, continuation);
        this.$useCaseComponent = interfaceC35331ntM;
        this.$remoteUserId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKIMAudioCallFloatingViewService$resolveP2PDisplayInfo$relationInfo$1(this.$useCaseComponent, this.$remoteUserId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RelationInfo> continuation) {
        return ((OKIMAudioCallFloatingViewService$resolveP2PDisplayInfo$relationInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C35864oGn c35864oGnQkdxfA = this.$useCaseComponent.QkdxfA();
            String str = this.$remoteUserId;
            this.label = 1;
            obj = c35864oGnQkdxfA.AEQbTJ(str, this);
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
