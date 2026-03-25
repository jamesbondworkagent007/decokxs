package com.okinc.im.imui.inputpanelV2.pluginV2;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import com.okinc.business.web3pay.api.model.PayTransactionProjectId;
import com.okinc.business.web3pay.api.model.PayTransactionUidRecipient;
import com.okinc.im.imui.inputpanelV2.pluginV2.TransferPlugin$onClick$2;
import com.okinc.okimcore.model.im.OKConversation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C35287nsV;
import o.C36488obs;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC31257lqc;
import o.pUU;

/* JADX INFO: loaded from: classes16.dex */
public final class TransferPlugin$onClick$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Fragment $fragment;
    int label;
    final /* synthetic */ C36488obs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferPlugin$onClick$2(C36488obs c36488obs, Fragment fragment, Continuation<? super TransferPlugin$onClick$2> continuation) {
        super(2, continuation);
        this.this$0 = c36488obs;
        this.$fragment = fragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TransferPlugin$onClick$2(this.this$0, this.$fragment, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TransferPlugin$onClick$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C35287nsV c35287nsVCopydefault = this.this$0.copydefault();
            PayTransactionUidRecipient payTransactionUidRecipient = null;
            OKConversation oKConversationKWHzl = c35287nsVCopydefault != null ? c35287nsVCopydefault.KWHzl() : null;
            if (oKConversationKWHzl != null) {
                String conversationTitle = oKConversationKWHzl.getConversationTitle();
                if (conversationTitle == null) {
                    conversationTitle = "";
                }
                payTransactionUidRecipient = new PayTransactionUidRecipient(conversationTitle, oKConversationKWHzl.getPortraitUrl(), oKConversationKWHzl.getContactId());
            }
            if (payTransactionUidRecipient != null) {
                Fragment fragment = this.$fragment;
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                final InterfaceC31257lqc interfaceC31257lqc = (InterfaceC31257lqc) C43251rlk.OLrzqt(InterfaceC31257lqc.class);
                if (interfaceC31257lqc != null) {
                    parentFragmentManager.setFragmentResultListener(interfaceC31257lqc.EZpvd(), fragment.getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.obr
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // androidx.fragment.app.FragmentResultListener
                        public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                            TransferPlugin$onClick$2.invokeSuspend$lambda$3$lambda$2$lambda$1(interfaceC31257lqc, str, bundle);
                        }
                    });
                    interfaceC31257lqc.AEQbTJ(parentFragmentManager, payTransactionUidRecipient, PayTransactionProjectId.IM);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$3$lambda$2$lambda$1(InterfaceC31257lqc interfaceC31257lqc, String str, Bundle bundle) {
        pUU.KWHzl("TransferPlugin", "startPayFlowResult=" + interfaceC31257lqc.KWHzl(bundle));
    }
}
