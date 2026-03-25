package com.okinc.im.imui.privacy.viewmodel;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C37203opR;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class CommonChatSettingsViewModel$getFetchingJobWithAvatar$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C37203opR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonChatSettingsViewModel$getFetchingJobWithAvatar$2(C37203opR c37203opR, Continuation<? super CommonChatSettingsViewModel$getFetchingJobWithAvatar$2> continuation) {
        super(2, continuation);
        this.this$0 = c37203opR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CommonChatSettingsViewModel$getFetchingJobWithAvatar$2 commonChatSettingsViewModel$getFetchingJobWithAvatar$2 = new CommonChatSettingsViewModel$getFetchingJobWithAvatar$2(this.this$0, continuation);
        commonChatSettingsViewModel$getFetchingJobWithAvatar$2.L$0 = obj;
        return commonChatSettingsViewModel$getFetchingJobWithAvatar$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CommonChatSettingsViewModel$getFetchingJobWithAvatar$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Deferred deferred;
        Object obj2;
        Object objM7386unboximpl;
        Object value;
        String message;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CommonChatSettingsViewModel$getFetchingJobWithAvatar$2$avatarJob$1(this.this$0, null), 3, null);
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CommonChatSettingsViewModel$getFetchingJobWithAvatar$2$chatSettingsJob$1(this.this$0, null), 3, null);
            this.L$0 = deferredAsync$default2;
            this.label = 1;
            Object objAwait = deferredAsync$default.await(this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            deferred = deferredAsync$default2;
            obj = objAwait;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                if (!Result.m7383isFailureimpl(objM7386unboximpl)) {
                    MutableStateFlow mutableStateFlow = this.this$0.OLrzqt;
                    do {
                        value = mutableStateFlow.getValue();
                        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                        if (thM7380exceptionOrNullimpl == null || (message = thM7380exceptionOrNullimpl.getMessage()) == null) {
                            message = "Failed to fetch settings";
                        }
                    } while (!mutableStateFlow.compareAndSet(value, new C37203opR.Activity.C0907Activity(message)));
                } else if (Result.m7383isFailureimpl(obj2)) {
                    pUU.valueOf("CommonChatSettingsViewModel", "Avatar loading failed but continuing with settings");
                }
                return Unit.INSTANCE;
            }
            deferred = (Deferred) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        Object objM7386unboximpl2 = ((Result) obj).m7386unboximpl();
        this.L$0 = objM7386unboximpl2;
        this.label = 2;
        Object objAwait2 = deferred.await(this);
        if (objAwait2 == objCopydefault) {
            return objCopydefault;
        }
        obj2 = objM7386unboximpl2;
        obj = objAwait2;
        objM7386unboximpl = ((Result) obj).m7386unboximpl();
        if (!Result.m7383isFailureimpl(objM7386unboximpl)) {
        }
        return Unit.INSTANCE;
    }
}
