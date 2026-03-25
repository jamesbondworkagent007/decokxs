package com.okinc.business.defi.wallet.common.okxconnect.util;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C13754dXa;
import o.C15974ebF;
import o.C16013ebs;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class DAppConnectRequestHelper$moveBackToDApp$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $redirect;
    Object L$0;
    int label;
    final /* synthetic */ C16013ebs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppConnectRequestHelper$moveBackToDApp$2(String str, C16013ebs c16013ebs, Continuation<? super DAppConnectRequestHelper$moveBackToDApp$2> continuation) {
        super(2, continuation);
        this.$redirect = str;
        this.this$0 = c16013ebs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DAppConnectRequestHelper$moveBackToDApp$2(this.$redirect, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DAppConnectRequestHelper$moveBackToDApp$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Activity activity;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("DAppConnectRequestHelper", "start moveBackToDApp - redirect: " + this.$redirect);
            C16013ebs c16013ebs = this.this$0;
            this.label = 1;
            obj = c16013ebs.EZpvd((Continuation<? super Activity>) this);
            if (obj == objCopydefault) {
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
                activity = (Activity) this.L$0;
                C56391yDq.AEQbTJ(obj);
                activity.moveTaskToBack(true);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        Activity activity2 = (Activity) obj;
        if (activity2 != null && !Intrinsics.EZpvd((Object) this.$redirect, (Object) "none")) {
            if (Intrinsics.EZpvd((Object) this.$redirect, (Object) "back")) {
                pUU.KWHzl("DAppConnectRequestHelper", "Moving task to back");
                C15974ebF c15974ebF = this.this$0.EZpvd;
                int i2 = C13754dXa.FragmentManager.ComponentActivityReportFullyDrawnExecutorApi16ImplExternalSyntheticLambda0;
                this.L$0 = activity2;
                this.label = 2;
                if (C15974ebF.displayToast$default(c15974ebF, i2, false, false, false, this, 14, null) == objCopydefault) {
                    return objCopydefault;
                }
                activity = activity2;
                activity.moveTaskToBack(true);
                return Unit.INSTANCE;
            }
            try {
                if (C33129mqd.OLrzqt((CharSequence) this.$redirect)) {
                    pUU.KWHzl("DAppConnectRequestHelper", "Invoking redirect " + this.$redirect);
                    Uri uri = Uri.parse(this.$redirect);
                    Intrinsics.checkNotNullExpressionValue(uri, "");
                    activity2.startActivity(new Intent("android.intent.action.VIEW", uri));
                }
            } catch (Exception e) {
                pUU.AEQbTJ("DAppConnectRequestHelper", "Failed to move back to dApp", e);
                C15974ebF c15974ebF2 = this.this$0.EZpvd;
                int i3 = C13754dXa.FragmentManager.ComponentActivityReportFullyDrawnExecutorApi16ImplExternalSyntheticLambda0;
                this.label = 3;
                if (C15974ebF.displayToast$default(c15974ebF2, i3, false, false, false, this, 14, null) == objCopydefault) {
                    return objCopydefault;
                }
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
