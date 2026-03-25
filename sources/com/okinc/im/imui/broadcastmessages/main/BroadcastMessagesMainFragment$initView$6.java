package com.okinc.im.imui.broadcastmessages.main;

import android.os.Bundle;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragment$initView$6;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35467nvs;
import o.C35510nwi;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class BroadcastMessagesMainFragment$initView$6 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C35467nvs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastMessagesMainFragment$initView$6(C35467nvs c35467nvs, Continuation<? super BroadcastMessagesMainFragment$initView$6> continuation) {
        super(2, continuation);
        this.this$0 = c35467nvs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BroadcastMessagesMainFragment$initView$6(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((BroadcastMessagesMainFragment$initView$6) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C35510nwi.Activity activity = C35510nwi.Companion;
            C35510nwi c35510nwiOLrzqt = activity.OLrzqt("FRAGMENT_RESULT_KEY_TIMEOUT_DIALOG");
            FragmentManager childFragmentManager = this.this$0.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c35510nwiOLrzqt.show(childFragmentManager, (String) null);
            String strKWHzl = activity.KWHzl("FRAGMENT_RESULT_KEY_TIMEOUT_DIALOG");
            final C35467nvs c35467nvs = this.this$0;
            FragmentKt.setFragmentResultListener(c35510nwiOLrzqt, strKWHzl, new Function2() { // from class: o.nvA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return BroadcastMessagesMainFragment$initView$6.invokeSuspend$lambda$0(c35467nvs, (java.lang.String) obj2, (android.os.Bundle) obj3);
                }
            });
            String strCopydefault = activity.copydefault("FRAGMENT_RESULT_KEY_TIMEOUT_DIALOG");
            final C35467nvs c35467nvs2 = this.this$0;
            FragmentKt.setFragmentResultListener(c35510nwiOLrzqt, strCopydefault, new Function2() { // from class: o.nvy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return BroadcastMessagesMainFragment$initView$6.invokeSuspend$lambda$1(c35467nvs2, (java.lang.String) obj2, (android.os.Bundle) obj3);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(C35467nvs c35467nvs, String str, Bundle bundle) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c35467nvs), null, null, new BroadcastMessagesMainFragment$initView$6$1$1(c35467nvs, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(C35467nvs c35467nvs, String str, Bundle bundle) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c35467nvs), null, null, new BroadcastMessagesMainFragment$initView$6$2$1(c35467nvs, null), 3, null);
        return Unit.INSTANCE;
    }
}
