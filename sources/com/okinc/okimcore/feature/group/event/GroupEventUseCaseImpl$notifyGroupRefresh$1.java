package com.okinc.okimcore.feature.group.event;

import com.okinc.okimcore.feature.group.event.GroupEventUseCaseImpl$notifyGroupRefresh$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import o.C44459sQp;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44260sJf;
import o.sIY;

/* JADX INFO: loaded from: classes10.dex */
public final class GroupEventUseCaseImpl$notifyGroupRefresh$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $groupId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ sIY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupEventUseCaseImpl$notifyGroupRefresh$1(sIY siy, String str, Continuation<? super GroupEventUseCaseImpl$notifyGroupRefresh$1> continuation) {
        super(2, continuation);
        this.this$0 = siy;
        this.$groupId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GroupEventUseCaseImpl$notifyGroupRefresh$1 groupEventUseCaseImpl$notifyGroupRefresh$1 = new GroupEventUseCaseImpl$notifyGroupRefresh$1(this.this$0, this.$groupId, continuation);
        groupEventUseCaseImpl$notifyGroupRefresh$1.L$0 = obj;
        return groupEventUseCaseImpl$notifyGroupRefresh$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupEventUseCaseImpl$notifyGroupRefresh$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            sIY siy = this.this$0;
            final String str = this.$groupId;
            siy.copydefault((Function1<? super InterfaceC44260sJf, Unit>) new Function1() { // from class: o.sJe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return GroupEventUseCaseImpl$notifyGroupRefresh$1.invokeSuspend$lambda$0(str, (InterfaceC44260sJf) obj2);
                }
            });
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(String str, InterfaceC44260sJf interfaceC44260sJf) {
        interfaceC44260sJf.EZpvd(new C44459sQp(str));
        return Unit.INSTANCE;
    }
}
