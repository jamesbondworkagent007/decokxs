package com.okinc.im.imui.broadcastmessages.inputpanel;

import android.os.Bundle;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentManager;
import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import com.okinc.im.imui.broadcastmessages.inputpanel.BroadcastMessageInputPanelFragment$initView$4;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C35445nvW;
import o.C35454nvf;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes15.dex */
public final class BroadcastMessageInputPanelFragment$initView$4 extends SuspendLambda implements Function2<List<? extends SendMessageRequestParam>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C35454nvf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastMessageInputPanelFragment$initView$4(C35454nvf c35454nvf, Continuation<? super BroadcastMessageInputPanelFragment$initView$4> continuation) {
        super(2, continuation);
        this.this$0 = c35454nvf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BroadcastMessageInputPanelFragment$initView$4 broadcastMessageInputPanelFragment$initView$4 = new BroadcastMessageInputPanelFragment$initView$4(this.this$0, continuation);
        broadcastMessageInputPanelFragment$initView$4.L$0 = obj;
        return broadcastMessageInputPanelFragment$initView$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends SendMessageRequestParam> list, Continuation<? super Unit> continuation) {
        return ((BroadcastMessageInputPanelFragment$initView$4) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            final List list = (List) this.L$0;
            Integer numEZpvd = this.this$0.KWHzl().AEQbTJ().EZpvd();
            int iIntValue = numEZpvd != null ? numEZpvd.intValue() : 0;
            C35445nvW.Activity activity = C35445nvW.Companion;
            C35445nvW c35445nvWOLrzqt = activity.OLrzqt("FRAGMENT_RESULT_KEY_SEND_CONFIRMATION_DIALOG", iIntValue);
            FragmentManager childFragmentManager = this.this$0.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c35445nvWOLrzqt.show(childFragmentManager, (String) null);
            String strEZpvd = activity.EZpvd("FRAGMENT_RESULT_KEY_SEND_CONFIRMATION_DIALOG");
            final C35454nvf c35454nvf = this.this$0;
            FragmentKt.setFragmentResultListener(c35445nvWOLrzqt, strEZpvd, new Function2() { // from class: o.nvl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return BroadcastMessageInputPanelFragment$initView$4.invokeSuspend$lambda$0(c35454nvf, list, (java.lang.String) obj2, (android.os.Bundle) obj3);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(C35454nvf c35454nvf, List list, String str, Bundle bundle) {
        c35454nvf.AYXKKw().EZpvd(true, list);
        return Unit.INSTANCE;
    }
}
