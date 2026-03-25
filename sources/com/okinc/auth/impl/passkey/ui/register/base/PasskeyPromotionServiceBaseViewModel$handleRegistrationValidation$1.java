package com.okinc.auth.impl.passkey.ui.register.base;

import com.okinc.auth.api.passkey.PasskeyPromotionSource;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C6307aMq;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyPromotionServiceBaseViewModel$handleRegistrationValidation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Object $response;
    int label;
    final /* synthetic */ PasskeyPromotionServiceBaseViewModel this$0;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PasskeyPromotionSource.values().length];
            try {
                iArr[PasskeyPromotionSource.DIRECTLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PasskeyPromotionSource.ALERT_MODULE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PasskeyPromotionSource.SECURITY_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyPromotionServiceBaseViewModel$handleRegistrationValidation$1(Object obj, PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel, Continuation<? super PasskeyPromotionServiceBaseViewModel$handleRegistrationValidation$1> continuation) {
        super(2, continuation);
        this.$response = obj;
        this.this$0 = passkeyPromotionServiceBaseViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyPromotionServiceBaseViewModel$handleRegistrationValidation$1(this.$response, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyPromotionServiceBaseViewModel$handleRegistrationValidation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Object obj2 = this.$response;
            if (Result.m7383isFailureimpl(obj2)) {
                obj2 = null;
            }
            if (((Unit) obj2) != null) {
                PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel = this.this$0;
                PasskeyPromotionSource passkeyPromotionSource = (PasskeyPromotionSource) passkeyPromotionServiceBaseViewModel.DbNXlk.getValue();
                int i2 = passkeyPromotionSource == null ? -1 : Activity.OLrzqt[passkeyPromotionSource.ordinal()];
                if (i2 == 1) {
                    C6307aMq.EZpvd.AYXKKw();
                } else if (i2 == 2 || i2 == 3) {
                    C6307aMq.EZpvd.AEQbTJ();
                }
                MutableSharedFlow mutableSharedFlow = passkeyPromotionServiceBaseViewModel.AhwBna;
                Unit unit = Unit.INSTANCE;
                this.label = 1;
                if (mutableSharedFlow.emit(unit, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(this.$response);
        if (thM7380exceptionOrNullimpl != null) {
            MutableSharedFlow mutableSharedFlow2 = this.this$0.uzCIH;
            String message = thM7380exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            this.label = 2;
            if (mutableSharedFlow2.emit(message, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
