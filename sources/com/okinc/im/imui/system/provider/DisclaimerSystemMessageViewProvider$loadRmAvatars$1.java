package com.okinc.im.imui.system.provider;

import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC33949nLv;
import o.C37697oyi;
import o.C56391yDq;
import o.C56442yFn;
import o.oDB;
import o.oGY;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class DisclaimerSystemMessageViewProvider$loadRmAvatars$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ oDB $getGroupInfoFromCacheUseCase;
    final /* synthetic */ String $groupId;
    final /* synthetic */ oGY<AbstractC33949nLv> $holder;
    int label;
    final /* synthetic */ C37697oyi this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisclaimerSystemMessageViewProvider$loadRmAvatars$1(oDB odb, String str, C37697oyi c37697oyi, oGY<AbstractC33949nLv> ogy, Continuation<? super DisclaimerSystemMessageViewProvider$loadRmAvatars$1> continuation) {
        super(2, continuation);
        this.$getGroupInfoFromCacheUseCase = odb;
        this.$groupId = str;
        this.this$0 = c37697oyi;
        this.$holder = ogy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DisclaimerSystemMessageViewProvider$loadRmAvatars$1(this.$getGroupInfoFromCacheUseCase, this.$groupId, this.this$0, this.$holder, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DisclaimerSystemMessageViewProvider$loadRmAvatars$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            oDB odb = this.$getGroupInfoFromCacheUseCase;
            String str = this.$groupId;
            this.label = 1;
            obj = odb.AEQbTJ(str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        GroupInfo groupInfo = (GroupInfo) obj;
        if (groupInfo != null) {
            this.this$0.KWHzl((oGY<AbstractC33949nLv>) this.$holder, groupInfo);
            return Unit.INSTANCE;
        }
        pUU.copydefault(this.this$0.uzCIH(), "GroupInfo is null for groupId: " + this.$groupId);
        return Unit.INSTANCE;
    }
}
