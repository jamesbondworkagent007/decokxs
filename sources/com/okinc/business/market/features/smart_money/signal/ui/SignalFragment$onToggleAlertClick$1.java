package com.okinc.business.market.features.smart_money.signal.ui;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C23274hvD;
import o.C29463kuC;
import o.C29542kvc;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalFragment$onToggleAlertClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C29463kuC.Application $tokenAlert;
    int label;
    final /* synthetic */ C29542kvc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalFragment$onToggleAlertClick$1(C29542kvc c29542kvc, C29463kuC.Application application, Continuation<? super SignalFragment$onToggleAlertClick$1> continuation) {
        super(2, continuation);
        this.this$0 = c29542kvc;
        this.$tokenAlert = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignalFragment$onToggleAlertClick$1(this.this$0, this.$tokenAlert, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SignalFragment$onToggleAlertClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SignalAlertViewModel signalAlertViewModelFARcdN = this.this$0.fARcdN();
            this.label = 1;
            obj = signalAlertViewModelFARcdN.copydefault(this);
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
                    if (!((Boolean) obj).booleanValue()) {
                        this.this$0.fARcdN().KWHzl(this.$tokenAlert);
                    } else {
                        C55326xho.toast$default(this.this$0.getString(C23274hvD.Fragment.fjfviF), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                if (!((Boolean) obj).booleanValue()) {
                    this.this$0.fARcdN().AEQbTJ(this.$tokenAlert);
                    return Unit.INSTANCE;
                }
                SignalAlertViewModel signalAlertViewModelFARcdN2 = this.this$0.fARcdN();
                this.label = 3;
                obj = signalAlertViewModelFARcdN2.AEQbTJ(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                if (!((Boolean) obj).booleanValue()) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((CharSequence) obj).length() != 0 && this.this$0.fARcdN().valueOf()) {
            SignalAlertViewModel signalAlertViewModelFARcdN3 = this.this$0.fARcdN();
            this.label = 2;
            obj = signalAlertViewModelFARcdN3.KWHzl(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            if (!((Boolean) obj).booleanValue()) {
            }
        } else {
            C55326xho.toast$default(this.this$0.getString(C23274hvD.Fragment.UlJrfe), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            return Unit.INSTANCE;
        }
    }
}
