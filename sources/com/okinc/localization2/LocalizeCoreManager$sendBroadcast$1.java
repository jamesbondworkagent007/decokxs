package com.okinc.localization2;

import com.okinc.localization2.bean.AppLocale;
import com.okinc.localization2.bean.AppLocaleInfo;
import com.okinc.localization2.bean.LocalizeEvent;
import com.okinc.rxutils.RecreateEvent;
import com.okinc.rxutils.RecreateType;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.pTJ;

/* JADX INFO: loaded from: classes9.dex */
public final class LocalizeCoreManager$sendBroadcast$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AppLocaleInfo $fromLocale;
    final /* synthetic */ AppLocaleInfo $newAppLocaleInfo;
    final /* synthetic */ boolean $skipRecreate;
    int label;
    final /* synthetic */ pTJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalizeCoreManager$sendBroadcast$1(AppLocaleInfo appLocaleInfo, AppLocaleInfo appLocaleInfo2, pTJ ptj, boolean z, Continuation<? super LocalizeCoreManager$sendBroadcast$1> continuation) {
        super(2, continuation);
        this.$fromLocale = appLocaleInfo;
        this.$newAppLocaleInfo = appLocaleInfo2;
        this.this$0 = ptj;
        this.$skipRecreate = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocalizeCoreManager$sendBroadcast$1(this.$fromLocale, this.$newAppLocaleInfo, this.this$0, this.$skipRecreate, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LocalizeCoreManager$sendBroadcast$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!Intrinsics.EZpvd(this.$fromLocale, this.$newAppLocaleInfo)) {
                MutableSharedFlow mutableSharedFlow = this.this$0.OLrzqt;
                AppLocaleInfo appLocaleInfo = this.$fromLocale;
                LocalizeEvent.ActionBar actionBar = new LocalizeEvent.ActionBar(appLocaleInfo != null ? AppLocale.Companion.OLrzqt(appLocaleInfo) : null, AppLocale.Companion.OLrzqt(this.$newAppLocaleInfo));
                this.label = 1;
                if (mutableSharedFlow.emit(actionBar, this) == objCopydefault) {
                    return objCopydefault;
                }
                RxBus.KWHzl("EVENT_CHANGE_LANGUAGE");
                if (!this.$skipRecreate) {
                }
            } else {
                MutableSharedFlow mutableSharedFlow2 = this.this$0.OLrzqt;
                LocalizeEvent.StateListAnimator stateListAnimator = new LocalizeEvent.StateListAnimator(C56402yEa.EZpvd(AppLocale.Companion.OLrzqt(this.$newAppLocaleInfo)));
                this.label = 2;
                if (mutableSharedFlow2.emit(stateListAnimator, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            RxBus.KWHzl("EVENT_CHANGE_LANGUAGE");
            if (!this.$skipRecreate) {
                RxBus.AEQbTJ(new RecreateEvent(RecreateType.LANGUAGE));
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
