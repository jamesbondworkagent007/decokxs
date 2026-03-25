package com.okinc.im.imui.privacy.viewmodel;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C37203opR;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class CommonChatSettingsViewModel$fetchPrivacySettings$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $shouldLoadAvatar;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C37203opR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonChatSettingsViewModel$fetchPrivacySettings$2(boolean z, C37203opR c37203opR, Continuation<? super CommonChatSettingsViewModel$fetchPrivacySettings$2> continuation) {
        super(2, continuation);
        this.$shouldLoadAvatar = z;
        this.this$0 = c37203opR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CommonChatSettingsViewModel$fetchPrivacySettings$2 commonChatSettingsViewModel$fetchPrivacySettings$2 = new CommonChatSettingsViewModel$fetchPrivacySettings$2(this.$shouldLoadAvatar, this.this$0, continuation);
        commonChatSettingsViewModel$fetchPrivacySettings$2.L$0 = obj;
        return commonChatSettingsViewModel$fetchPrivacySettings$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CommonChatSettingsViewModel$fetchPrivacySettings$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object value;
        String message;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                boolean z = this.$shouldLoadAvatar;
                C37203opR c37203opR = this.this$0;
                Result.Application application = Result.Companion;
                if (z) {
                    this.label = 1;
                    if (c37203opR.AEQbTJ(this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    this.label = 2;
                    if (c37203opR.EZpvd((Continuation<? super Unit>) this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        C37203opR c37203opR2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("CommonChatSettingsViewModel", "Error in fetchPrivacySettings: " + thM7380exceptionOrNullimpl);
            MutableStateFlow mutableStateFlow = c37203opR2.OLrzqt;
            do {
                value = mutableStateFlow.getValue();
                message = thM7380exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "Failed to fetch settings";
                }
            } while (!mutableStateFlow.compareAndSet(value, new C37203opR.Activity.C0907Activity(message)));
        }
        return Unit.INSTANCE;
    }
}
