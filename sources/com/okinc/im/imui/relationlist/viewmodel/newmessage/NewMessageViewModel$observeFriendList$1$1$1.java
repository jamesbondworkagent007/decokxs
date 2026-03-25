package com.okinc.im.imui.relationlist.viewmodel.newmessage;

import com.okinc.okimcore.model.remote.RelationInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class NewMessageViewModel$observeFriendList$1$1$1 extends SuspendLambda implements Function2<List<? extends RelationInfo>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NewMessageViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewMessageViewModel$observeFriendList$1$1$1(NewMessageViewModel newMessageViewModel, Continuation<? super NewMessageViewModel$observeFriendList$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = newMessageViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NewMessageViewModel$observeFriendList$1$1$1 newMessageViewModel$observeFriendList$1$1$1 = new NewMessageViewModel$observeFriendList$1$1$1(this.this$0, continuation);
        newMessageViewModel$observeFriendList$1$1$1.L$0 = obj;
        return newMessageViewModel$observeFriendList$1$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends RelationInfo> list, Continuation<? super Unit> continuation) {
        return invoke2((List<RelationInfo>) list, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<RelationInfo> list, Continuation<? super Unit> continuation) {
        return ((NewMessageViewModel$observeFriendList$1$1$1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List list = (List) this.L$0;
            pUU.KWHzl("NewMessageViewModel", "friend list size: " + list.size());
            this.this$0.OLrzqt.setValue(list);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
