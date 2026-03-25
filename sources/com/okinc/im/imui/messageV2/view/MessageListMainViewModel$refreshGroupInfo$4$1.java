package com.okinc.im.imui.messageV2.view;

import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C32989mnw;
import o.C33129mqd;
import o.C37760ozs;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageListMainViewModel$refreshGroupInfo$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GroupInfo $result;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MessageListMainViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListMainViewModel$refreshGroupInfo$4$1(MessageListMainViewModel messageListMainViewModel, GroupInfo groupInfo, Continuation<? super MessageListMainViewModel$refreshGroupInfo$4$1> continuation) {
        super(2, continuation);
        this.this$0 = messageListMainViewModel;
        this.$result = groupInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MessageListMainViewModel$refreshGroupInfo$4$1 messageListMainViewModel$refreshGroupInfo$4$1 = new MessageListMainViewModel$refreshGroupInfo$4$1(this.this$0, this.$result, continuation);
        messageListMainViewModel$refreshGroupInfo$4$1.L$0 = obj;
        return messageListMainViewModel$refreshGroupInfo$4$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageListMainViewModel$refreshGroupInfo$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0072 A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:7:0x0016, B:29:0x0072, B:32:0x007a, B:34:0x0088, B:36:0x008e, B:38:0x00af, B:39:0x00c7, B:40:0x00ca, B:12:0x002a, B:23:0x005b, B:15:0x003a, B:17:0x0042, B:19:0x0048), top: B:46:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:7:0x0016, B:29:0x0072, B:32:0x007a, B:34:0x0088, B:36:0x008e, B:38:0x00af, B:39:0x00c7, B:40:0x00ca, B:12:0x002a, B:23:0x005b, B:15:0x003a, B:17:0x0042, B:19:0x0048), top: B:46:0x0008 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        MessageListMainViewModel messageListMainViewModel;
        GroupInfo groupInfo;
        GroupInfo groupInfo2;
        MessageListMainViewModel messageListMainViewModel2;
        long jValueOf;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            messageListMainViewModel = this.this$0;
            groupInfo = this.$result;
            Result.Application application2 = Result.Companion;
            MutableStateFlow mutableStateFlow = messageListMainViewModel.fIwbmz;
            Boolean boolKWHzl = C56443yFo.KWHzl(groupInfo != null ? groupInfo.getAllowVoice() : true);
            this.L$0 = messageListMainViewModel;
            this.L$1 = groupInfo;
            this.label = 1;
            if (mutableStateFlow.emit(boolKWHzl, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                groupInfo2 = (GroupInfo) this.L$1;
                messageListMainViewModel2 = (MessageListMainViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                messageListMainViewModel = messageListMainViewModel2;
                groupInfo = groupInfo2;
                if ((groupInfo == null ? groupInfo.getOrbiterExpiryTimeStamp() : null) != null && C33129mqd.valueOf(groupInfo.getOrbiterExpiryTimeStamp()) > 0 && !messageListMainViewModel.gGvvIC) {
                    jValueOf = C33129mqd.valueOf(groupInfo.getOrbiterExpiryTimeStamp());
                    if (!C37760ozs.copydefault("SAVE_DO_NOT_SHOW_AGAIN_ORBITER" + jValueOf, false)) {
                        messageListMainViewModel.iwGUEr.setValue(new C32989mnw(C56443yFo.KWHzl(C33129mqd.valueOf(groupInfo.getOrbiterExpiryTimeStamp()))));
                    }
                    messageListMainViewModel.gGvvIC = true;
                }
                Result.m7377constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            }
            groupInfo = (GroupInfo) this.L$1;
            MessageListMainViewModel messageListMainViewModel3 = (MessageListMainViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            messageListMainViewModel = messageListMainViewModel3;
        }
        if (groupInfo != null) {
            MutableSharedFlow mutableSharedFlow = messageListMainViewModel.gEmmrt;
            this.L$0 = messageListMainViewModel;
            this.L$1 = groupInfo;
            this.label = 2;
            if (mutableSharedFlow.emit(groupInfo, this) == objCopydefault) {
                return objCopydefault;
            }
            groupInfo2 = groupInfo;
            messageListMainViewModel2 = messageListMainViewModel;
            messageListMainViewModel = messageListMainViewModel2;
            groupInfo = groupInfo2;
        }
        if ((groupInfo == null ? groupInfo.getOrbiterExpiryTimeStamp() : null) != null) {
            jValueOf = C33129mqd.valueOf(groupInfo.getOrbiterExpiryTimeStamp());
            if (!C37760ozs.copydefault("SAVE_DO_NOT_SHOW_AGAIN_ORBITER" + jValueOf, false)) {
            }
            messageListMainViewModel.gGvvIC = true;
        }
        Result.m7377constructorimpl(Unit.INSTANCE);
        return Unit.INSTANCE;
    }
}
