package com.okinc.im.imui.messageV2.view;

import androidx.lifecycle.MutableLiveData;
import com.okinc.im.bean.ChatOrigin;
import com.okinc.okimcore.model.im.RelationSourceType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC36555odF;
import o.C32989mnw;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageListMainViewModel$init$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ ChatOrigin $chatOrigin;
    final /* synthetic */ String $memberOfGroup;
    final /* synthetic */ String $relationId;
    Object L$0;
    int label;
    final /* synthetic */ MessageListMainViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListMainViewModel$init$2(MessageListMainViewModel messageListMainViewModel, String str, String str2, ChatOrigin chatOrigin, String str3, Continuation<? super MessageListMainViewModel$init$2> continuation) {
        super(2, continuation);
        this.this$0 = messageListMainViewModel;
        this.$channelId = str;
        this.$relationId = str2;
        this.$chatOrigin = chatOrigin;
        this.$memberOfGroup = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageListMainViewModel$init$2(this.this$0, this.$channelId, this.$relationId, this.$chatOrigin, this.$memberOfGroup, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageListMainViewModel$init$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableLiveData mutableLiveData;
        MessageListMainViewModel messageListMainViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MessageListMainViewModel messageListMainViewModel2 = this.this$0;
            String str = this.$channelId;
            String str2 = this.$relationId;
            ChatOrigin chatOrigin = this.$chatOrigin;
            String str3 = this.$memberOfGroup;
            this.label = 1;
            if (messageListMainViewModel2.EZpvd(str, str2, chatOrigin, str3, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                mutableLiveData = (MutableLiveData) this.L$0;
                C56391yDq.AEQbTJ(obj);
                RelationSourceType relationSourceType = (RelationSourceType) obj;
                mutableLiveData.setValue(relationSourceType == null ? C56443yFo.AEQbTJ(relationSourceType.getValue()) : null);
                messageListMainViewModel = this.this$0;
                this.L$0 = null;
                this.label = 3;
                if (messageListMainViewModel.OLrzqt(this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.OLrzqt(this.$channelId);
        this.this$0.AEQbTJ();
        C32989mnw<AbstractC36555odF> value = this.this$0.DbNXlk().getValue();
        if ((value != null ? value.OLrzqt() : null) instanceof AbstractC36555odF.StateListAnimator) {
            this.this$0.aKErDB();
            this.this$0.djSkpj();
        }
        mutableLiveData = this.this$0.fARcdN;
        MessageListMainViewModel messageListMainViewModel3 = this.this$0;
        ChatOrigin chatOrigin2 = this.$chatOrigin;
        String str4 = this.$relationId;
        this.L$0 = mutableLiveData;
        this.label = 2;
        obj = messageListMainViewModel3.KWHzl(chatOrigin2, str4, (Continuation<? super RelationSourceType>) this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        RelationSourceType relationSourceType2 = (RelationSourceType) obj;
        mutableLiveData.setValue(relationSourceType2 == null ? C56443yFo.AEQbTJ(relationSourceType2.getValue()) : null);
        messageListMainViewModel = this.this$0;
        this.L$0 = null;
        this.label = 3;
        if (messageListMainViewModel.OLrzqt(this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
