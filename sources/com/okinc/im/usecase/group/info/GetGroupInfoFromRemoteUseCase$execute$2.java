package com.okinc.im.usecase.group.info;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.oCE;
import o.oDA;
import o.sIR;

/* JADX INFO: loaded from: classes8.dex */
public final class GetGroupInfoFromRemoteUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super GroupInfo>, Object> {
    final /* synthetic */ String $targetId;
    int label;
    final /* synthetic */ oDA this$0;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[GroupTagType.values().length];
            try {
                iArr[GroupTagType.VIDEO_CALL_CHAT_GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetGroupInfoFromRemoteUseCase$execute$2(oDA oda, String str, Continuation<? super GetGroupInfoFromRemoteUseCase$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = oda;
        this.$targetId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetGroupInfoFromRemoteUseCase$execute$2(this.this$0, this.$targetId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super GroupInfo> continuation) {
        return ((GetGroupInfoFromRemoteUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            oCE oce = this.this$0.KWHzl;
            String str = this.$targetId;
            this.label = 1;
            obj = oce.OLrzqt(str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return (GroupInfo) obj;
            }
            C56391yDq.AEQbTJ(obj);
        }
        OKConversation oKConversation = (OKConversation) obj;
        GroupTagType groupType = oKConversation != null ? oKConversation.getGroupType() : null;
        if (groupType != null && ActionBar.KWHzl[groupType.ordinal()] == 1) {
            return null;
        }
        sIR sir = this.this$0.copydefault;
        String str2 = this.$targetId;
        this.label = 2;
        obj = sir.valueOf(str2, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        return (GroupInfo) obj;
    }
}
