package com.okinc.im.imui.privacy.viewmodel;

import com.okinc.im.imui.chatsettings.model.ChatSettingsResult;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes23.dex */
public final class PrivacySettingViewModel$fetchPrivacySettings$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ PrivacySettingViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrivacySettingViewModel$fetchPrivacySettings$1(PrivacySettingViewModel privacySettingViewModel, Continuation<? super PrivacySettingViewModel$fetchPrivacySettings$1> continuation) {
        super(2, continuation);
        this.this$0 = privacySettingViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PrivacySettingViewModel$fetchPrivacySettings$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PrivacySettingViewModel$fetchPrivacySettings$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow<Result<ChatSettingsResult>> flowKWHzl = this.this$0.copydefault.KWHzl();
                final PrivacySettingViewModel privacySettingViewModel = this.this$0;
                FlowCollector<? super Result<ChatSettingsResult>> flowCollector = new FlowCollector() { // from class: com.okinc.im.imui.privacy.viewmodel.PrivacySettingViewModel$fetchPrivacySettings$1.3
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation<? super Unit> continuation) {
                        Object objM7386unboximpl = ((Result) obj2).m7386unboximpl();
                        PrivacySettingViewModel privacySettingViewModel2 = privacySettingViewModel;
                        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                            privacySettingViewModel2.OLrzqt.setValue((ChatSettingsResult) objM7386unboximpl);
                        }
                        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                        if (thM7380exceptionOrNullimpl != null) {
                            pUU.AEQbTJ("PrivacySettingViewModel", "Error in fetchPrivacySettings: " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowKWHzl.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
        } catch (Exception e) {
            pUU.copydefault("PrivacySettingViewModel", "Error in fetchPrivacySettings: " + e);
        }
        return Unit.INSTANCE;
    }
}
