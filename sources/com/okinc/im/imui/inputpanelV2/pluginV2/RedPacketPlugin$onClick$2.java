package com.okinc.im.imui.inputpanelV2.pluginV2;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.redbag.bean.GiftSendInfo;
import com.okinc.okimcore.model.im.OKConversation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C35287nsV;
import o.C36489obt;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.kOA;

/* JADX INFO: loaded from: classes16.dex */
public final class RedPacketPlugin$onClick$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Fragment $fragment;
    int label;
    final /* synthetic */ C36489obt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedPacketPlugin$onClick$2(C36489obt c36489obt, Fragment fragment, Continuation<? super RedPacketPlugin$onClick$2> continuation) {
        super(2, continuation);
        this.this$0 = c36489obt;
        this.$fragment = fragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RedPacketPlugin$onClick$2(this.this$0, this.$fragment, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RedPacketPlugin$onClick$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        OKConversation oKConversationKWHzl;
        String targetId;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C35287nsV c35287nsVCopydefault = this.this$0.copydefault();
            if (c35287nsVCopydefault != null && (oKConversationKWHzl = c35287nsVCopydefault.KWHzl()) != null && (targetId = oKConversationKWHzl.getTargetId()) != null) {
                Fragment fragment = this.$fragment;
                kOA koa = (kOA) C43251rlk.OLrzqt(kOA.class);
                if (koa != null) {
                    GiftSendInfo giftSendInfo = new GiftSendInfo(targetId);
                    FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    koa.copydefault(giftSendInfo, fragmentActivityRequireActivity);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
