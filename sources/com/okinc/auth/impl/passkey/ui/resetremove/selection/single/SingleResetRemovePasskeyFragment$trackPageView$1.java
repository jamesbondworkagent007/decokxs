package com.okinc.auth.impl.passkey.ui.resetremove.selection.single;

import com.okinc.auth.api.passkey.PasskeyResetRemoveType;
import com.okinc.auth.impl.passkey.ui.resetremove.selection.BatchResetRemovePasskeyViewModel;
import com.okinc.auth.impl.passkey.ui.resetremove.selection.single.SingleResetRemovePasskeyFragment$trackPageView$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32866mlf;
import o.C32868mlh;
import o.C56391yDq;
import o.C56442yFn;
import o.C6480aQD;

/* JADX INFO: loaded from: classes14.dex */
public final class SingleResetRemovePasskeyFragment$trackPageView$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C6480aQD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleResetRemovePasskeyFragment$trackPageView$1(C6480aQD c6480aQD, Continuation<? super SingleResetRemovePasskeyFragment$trackPageView$1> continuation) {
        super(2, continuation);
        this.this$0 = c6480aQD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SingleResetRemovePasskeyFragment$trackPageView$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SingleResetRemovePasskeyFragment$trackPageView$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.showLoadingAtOnce();
            BatchResetRemovePasskeyViewModel batchResetRemovePasskeyViewModelDjBIcL = this.this$0.djBIcL();
            this.label = 1;
            obj = batchResetRemovePasskeyViewModelDjBIcL.EZpvd(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        final boolean zBooleanValue = ((Boolean) obj).booleanValue();
        this.this$0.releaseLoading();
        PasskeyResetRemoveType passkeyResetRemoveTypeAYXKKw = this.this$0.AYXKKw();
        if (passkeyResetRemoveTypeAYXKKw instanceof PasskeyResetRemoveType.Remove) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("PasskeySingleRemove_Full_Page_View", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aQI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return SingleResetRemovePasskeyFragment$trackPageView$1.invokeSuspend$lambda$0(zBooleanValue, (EventParamsList) obj2);
                }
            });
        } else if (passkeyResetRemoveTypeAYXKKw instanceof PasskeyResetRemoveType.Reset) {
            TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("PasskeySingleReset_Full_Page_View", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aQF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return SingleResetRemovePasskeyFragment$trackPageView$1.invokeSuspend$lambda$1(zBooleanValue, (EventParamsList) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(boolean z, EventParamsList eventParamsList) {
        eventParamsList.put("flow", z ? "normal" : "notsupport", true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(boolean z, EventParamsList eventParamsList) {
        eventParamsList.put("flow", z ? "normal" : "notsupport", true);
        return Unit.INSTANCE;
    }
}
