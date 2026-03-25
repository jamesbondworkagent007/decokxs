package com.okinc.im.imui.contacts;

import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35859oGi;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class ContactProfileViewModel$getRelationInfo$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RelationInfo>, Object> {
    final /* synthetic */ String $contactId;
    final /* synthetic */ String $memberOfGroup;
    int label;
    final /* synthetic */ ContactProfileViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactProfileViewModel$getRelationInfo$2(ContactProfileViewModel contactProfileViewModel, String str, String str2, Continuation<? super ContactProfileViewModel$getRelationInfo$2> continuation) {
        super(2, continuation);
        this.this$0 = contactProfileViewModel;
        this.$contactId = str;
        this.$memberOfGroup = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContactProfileViewModel$getRelationInfo$2(this.this$0, this.$contactId, this.$memberOfGroup, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RelationInfo> continuation) {
        return ((ContactProfileViewModel$getRelationInfo$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            RelationInfo relationInfoAhwBna = this.this$0.AhwBna();
            if (relationInfoAhwBna != null) {
                return relationInfoAhwBna;
            }
            C35859oGi c35859oGi = this.this$0.values;
            String str = this.$contactId;
            String str2 = this.$memberOfGroup;
            this.label = 1;
            obj = c35859oGi.copydefault(str, str2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        RelationInfo relationInfo = (RelationInfo) obj;
        this.this$0.DbNXlk.set("info", relationInfo);
        return relationInfo;
    }
}
