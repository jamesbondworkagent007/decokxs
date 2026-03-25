package com.okinc.im.usecase.pluginlist;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C35287nsV;
import o.C56391yDq;
import o.C56442yFn;
import o.yHT;

/* JADX INFO: loaded from: classes8.dex */
public final class ObservePluginDataConfigUseCase$execute$1 extends SuspendLambda implements yHT<OKConversation, RelationInfo, GroupInfo, Continuation<? super C35287nsV>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ObservePluginDataConfigUseCase$execute$1(Continuation<? super ObservePluginDataConfigUseCase$execute$1> continuation) {
        super(4, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHT
    public final Object invoke(OKConversation oKConversation, RelationInfo relationInfo, GroupInfo groupInfo, Continuation<? super C35287nsV> continuation) {
        ObservePluginDataConfigUseCase$execute$1 observePluginDataConfigUseCase$execute$1 = new ObservePluginDataConfigUseCase$execute$1(continuation);
        observePluginDataConfigUseCase$execute$1.L$0 = oKConversation;
        observePluginDataConfigUseCase$execute$1.L$1 = relationInfo;
        observePluginDataConfigUseCase$execute$1.L$2 = groupInfo;
        return observePluginDataConfigUseCase$execute$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return new C35287nsV((OKConversation) this.L$0, (RelationInfo) this.L$1, (GroupInfo) this.L$2);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
