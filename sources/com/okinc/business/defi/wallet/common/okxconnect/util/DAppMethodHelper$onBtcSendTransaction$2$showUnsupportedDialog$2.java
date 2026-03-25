package com.okinc.business.defi.wallet.common.okxconnect.util;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C13754dXa;
import o.C15974ebF;
import o.C56391yDq;
import o.C56442yFn;
import o.ViewOnClickListenerC54939xaY;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class DAppMethodHelper$onBtcSendTransaction$2$showUnsupportedDialog$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C15974ebF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppMethodHelper$onBtcSendTransaction$2$showUnsupportedDialog$2(C15974ebF c15974ebF, Continuation<? super DAppMethodHelper$onBtcSendTransaction$2$showUnsupportedDialog$2> continuation) {
        super(2, continuation);
        this.this$0 = c15974ebF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DAppMethodHelper$onBtcSendTransaction$2$showUnsupportedDialog$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DAppMethodHelper$onBtcSendTransaction$2$showUnsupportedDialog$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("DAppMethodHelper", "Showing unsupported atomicals dialog");
            C15974ebF c15974ebF = this.this$0;
            this.label = 1;
            obj = c15974ebF.OLrzqt((Continuation<? super WeakReference<Context>>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        Context context = (Context) ((WeakReference) obj).get();
        if (context == null) {
            return null;
        }
        try {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.setTitle(C13754dXa.FragmentManager.RdAHlO);
            viewOnClickListenerC54939xaY.copydefault(C13754dXa.FragmentManager.dmfpNf);
            viewOnClickListenerC54939xaY.EZpvd(C13754dXa.FragmentManager.iRxXKY, new View.OnClickListener() { // from class: o.ebK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    viewOnClickListenerC54939xaY.dismiss();
                }
            });
            viewOnClickListenerC54939xaY.show();
        } catch (Exception e) {
            pUU.AEQbTJ("DAppMethodHelper", "onBtcSendTransaction - Failed to showUnsupportedDialog", e);
        }
        return Unit.INSTANCE;
    }
}
