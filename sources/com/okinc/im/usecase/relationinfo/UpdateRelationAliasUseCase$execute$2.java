package com.okinc.im.usecase.relationinfo;

import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C35718oBc;
import o.C35861oGk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44177sGd;

/* JADX INFO: loaded from: classes8.dex */
public final class UpdateRelationAliasUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $alias;
    final /* synthetic */ String $contactId;
    final /* synthetic */ String $groupId;
    Object L$0;
    int label;
    final /* synthetic */ C35861oGk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateRelationAliasUseCase$execute$2(String str, C35861oGk c35861oGk, String str2, String str3, Continuation<? super UpdateRelationAliasUseCase$execute$2> continuation) {
        super(2, continuation);
        this.$alias = str;
        this.this$0 = c35861oGk;
        this.$contactId = str2;
        this.$groupId = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UpdateRelationAliasUseCase$execute$2(this.$alias, this.this$0, this.$contactId, this.$groupId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UpdateRelationAliasUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String string = StringsKt__StringsKt.hDKMBd((CharSequence) this.$alias).toString();
            InterfaceC44177sGd interfaceC44177sGd = this.this$0.KWHzl;
            String str2 = this.$contactId;
            this.L$0 = string;
            this.label = 1;
            if (interfaceC44177sGd.AYXKKw(str2, string, this) == objCopydefault) {
                return objCopydefault;
            }
            str = string;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (this.$groupId != null) {
            this.this$0.AEQbTJ.KWHzl(this.$groupId, this.$contactId, str);
        }
        RxBus.AEQbTJ(new C35718oBc(this.$contactId));
        return Unit.INSTANCE;
    }
}
