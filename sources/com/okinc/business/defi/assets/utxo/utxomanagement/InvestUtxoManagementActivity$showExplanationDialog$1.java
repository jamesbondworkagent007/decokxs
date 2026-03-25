package com.okinc.business.defi.assets.utxo.utxomanagement;

import android.view.View;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC10355bmr;
import o.C10854bwM;
import o.C10954byG;
import o.C13754dXa;
import o.C33069mpW;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.ViewOnClickListenerC54939xaY;

/* JADX INFO: loaded from: classes3.dex */
public final class InvestUtxoManagementActivity$showExplanationDialog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC10355bmr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUtxoManagementActivity$showExplanationDialog$1(ActivityC10355bmr activityC10355bmr, Continuation<? super InvestUtxoManagementActivity$showExplanationDialog$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC10355bmr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUtxoManagementActivity$showExplanationDialog$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUtxoManagementActivity$showExplanationDialog$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(this.this$0.valueOf().KWHzl());
            String strFJNWhG = c10854bwMCopydefault != null ? c10854bwMCopydefault.fJNWhG() : null;
            if (strFJNWhG == null) {
                strFJNWhG = "";
            }
            String strKWHzl = C33069mpW.KWHzl(this.this$0, C13754dXa.FragmentManager.Ufzxmz, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("token", strFJNWhG)));
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.this$0);
            ActivityC10355bmr activityC10355bmr = this.this$0;
            viewOnClickListenerC54939xaY.setTitle(activityC10355bmr.getString(C13754dXa.FragmentManager.fXHmeK));
            viewOnClickListenerC54939xaY.EZpvd(strKWHzl);
            String string = activityC10355bmr.getString(C13754dXa.FragmentManager.DCJXGO);
            Intrinsics.checkNotNullExpressionValue(string, "");
            viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) string, new View.OnClickListener() { // from class: o.bmA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    viewOnClickListenerC54939xaY.dismiss();
                }
            });
            viewOnClickListenerC54939xaY.show();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
