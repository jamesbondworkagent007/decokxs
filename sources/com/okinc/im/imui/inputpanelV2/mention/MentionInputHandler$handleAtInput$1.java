package com.okinc.im.imui.inputpanelV2.mention;

import android.content.Intent;
import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC34289nYl;
import o.C36403oaM;
import o.C56391yDq;
import o.C56442yFn;
import o.oDB;

/* JADX INFO: loaded from: classes18.dex */
public final class MentionInputHandler$handleAtInput$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C36403oaM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MentionInputHandler$handleAtInput$1(C36403oaM c36403oaM, Continuation<? super MentionInputHandler$handleAtInput$1> continuation) {
        super(2, continuation);
        this.this$0 = c36403oaM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MentionInputHandler$handleAtInput$1 mentionInputHandler$handleAtInput$1 = new MentionInputHandler$handleAtInput$1(this.this$0, continuation);
        mentionInputHandler$handleAtInput$1.L$0 = obj;
        return mentionInputHandler$handleAtInput$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MentionInputHandler$handleAtInput$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C36403oaM c36403oaM;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C36403oaM c36403oaM2 = this.this$0;
                Result.Application application = Result.Companion;
                oDB odbEZpvd = c36403oaM2.EZpvd();
                String str = c36403oaM2.AkhnZx;
                this.L$0 = c36403oaM2;
                this.label = 1;
                Object objAEQbTJ = odbEZpvd.AEQbTJ(str, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                c36403oaM = c36403oaM2;
                obj = objAEQbTJ;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c36403oaM = (C36403oaM) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            GroupInfo groupInfo = (GroupInfo) obj;
            if (c36403oaM.OLrzqt().OLrzqt(groupInfo, c36403oaM.fetchVPNInfo)) {
                Intent intentEZpvd = ActivityC34289nYl.Companion.EZpvd(c36403oaM.copydefault, groupInfo, c36403oaM.KWHzl);
                if (c36403oaM.AhwBna != null) {
                    c36403oaM.AhwBna.launch(intentEZpvd);
                } else {
                    c36403oaM.copydefault.startActivity(intentEZpvd);
                }
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }
}
