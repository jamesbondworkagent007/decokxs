package com.okinc.auth.impl.passkey.ui.rename;

import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.impl.passkey.model.AuthenticatorDisplayModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC32955mnO;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5973aGa;
import o.C5987aGo;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class SecurityFido2RenameViewModel$clickConfirm$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isOkxPay;
    Object L$0;
    int label;
    final /* synthetic */ SecurityFido2RenameViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityFido2RenameViewModel$clickConfirm$1(boolean z, SecurityFido2RenameViewModel securityFido2RenameViewModel, Continuation<? super SecurityFido2RenameViewModel$clickConfirm$1> continuation) {
        super(2, continuation);
        this.$isOkxPay = z;
        this.this$0 = securityFido2RenameViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityFido2RenameViewModel$clickConfirm$1(this.$isOkxPay, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SecurityFido2RenameViewModel$clickConfirm$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v13, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object obj2;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$isOkxPay) {
                MutableSharedFlow mutableSharedFlow2 = this.this$0.copydefault;
                Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
                this.label = 1;
                if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                C5973aGa c5973aGa = this.this$0.AkhnZx;
                String str = (String) this.this$0.KWHzl.getValue();
                if (str == null) {
                    str = "";
                }
                AuthenticatorDisplayModel authenticatorDisplayModel = this.this$0.gEmmrt;
                String strCopydefault = authenticatorDisplayModel != null ? authenticatorDisplayModel.copydefault() : null;
                FlowKt.launchIn(FlowKt.m7441catch(FlowKt.onCompletion(FlowKt.onEach(FlowKt.onStart(c5973aGa.KWHzl(str, strCopydefault != null ? strCopydefault : ""), new AnonymousClass1(this.this$0, null)), new AnonymousClass2(this.this$0, null)), new AnonymousClass3(this.this$0, null)), new AnonymousClass4(this.this$0, null)), ViewModelKt.getViewModelScope(this.this$0));
                return Unit.INSTANCE;
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    Unit unit = Unit.INSTANCE;
                    return Unit.INSTANCE;
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (Result.m7384isSuccessimpl(obj2)) {
                    this.this$0.gEmmrt();
                    return Unit.INSTANCE;
                }
                Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                String message = thM7380exceptionOrNullimpl != null ? thM7380exceptionOrNullimpl.getMessage() : null;
                String str2 = message != null ? message : "";
                MutableSharedFlow mutableSharedFlow3 = this.this$0.AEQbTJ;
                this.L$0 = null;
                this.label = 4;
                if (mutableSharedFlow3.emit(str2, this) == objCopydefault) {
                    return objCopydefault;
                }
                Unit unit2 = Unit.INSTANCE;
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
            obj2 = objKWHzl;
            mutableSharedFlow = this.this$0.copydefault;
            boolKWHzl = C56443yFo.KWHzl(false);
            this.L$0 = obj2;
            this.label = 3;
            if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                return objCopydefault;
            }
            if (Result.m7384isSuccessimpl(obj2)) {
            }
        }
        C5987aGo c5987aGo = this.this$0.valueOf;
        String str3 = (String) this.this$0.KWHzl.getValue();
        if (str3 == null) {
            str3 = "";
        }
        AuthenticatorDisplayModel authenticatorDisplayModel2 = this.this$0.gEmmrt;
        String strCopydefault2 = authenticatorDisplayModel2 != null ? authenticatorDisplayModel2.copydefault() : null;
        if (strCopydefault2 == null) {
            strCopydefault2 = "";
        }
        this.label = 2;
        objKWHzl = c5987aGo.KWHzl(str3, strCopydefault2, this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        obj2 = objKWHzl;
        mutableSharedFlow = this.this$0.copydefault;
        boolKWHzl = C56443yFo.KWHzl(false);
        this.L$0 = obj2;
        this.label = 3;
        if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
        }
        if (Result.m7384isSuccessimpl(obj2)) {
        }
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.passkey.ui.rename.SecurityFido2RenameViewModel$clickConfirm$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super AbstractC32955mnO<Unit>>, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ SecurityFido2RenameViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SecurityFido2RenameViewModel securityFido2RenameViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = securityFido2RenameViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super AbstractC32955mnO<Unit>> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MutableSharedFlow mutableSharedFlow = this.this$0.copydefault;
                Boolean boolKWHzl = C56443yFo.KWHzl(true);
                this.label = 1;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.passkey.ui.rename.SecurityFido2RenameViewModel$clickConfirm$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<AbstractC32955mnO<Unit>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SecurityFido2RenameViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SecurityFido2RenameViewModel securityFido2RenameViewModel, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = securityFido2RenameViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AbstractC32955mnO<Unit> abstractC32955mnO, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(abstractC32955mnO, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                AbstractC32955mnO abstractC32955mnO = (AbstractC32955mnO) this.L$0;
                if (!(abstractC32955mnO instanceof AbstractC32955mnO.TaskDescription)) {
                    if (abstractC32955mnO instanceof AbstractC32955mnO.ActionBar) {
                        this.this$0.gEmmrt();
                    } else if (abstractC32955mnO instanceof AbstractC32955mnO.Activity) {
                        MutableSharedFlow mutableSharedFlow = this.this$0.AEQbTJ;
                        String strOLrzqt = ((AbstractC32955mnO.Activity) abstractC32955mnO).OLrzqt();
                        if (strOLrzqt == null) {
                            strOLrzqt = "";
                        }
                        this.label = 1;
                        if (mutableSharedFlow.emit(strOLrzqt, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.passkey.ui.rename.SecurityFido2RenameViewModel$clickConfirm$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements yHO<FlowCollector<? super AbstractC32955mnO<Unit>>, Throwable, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ SecurityFido2RenameViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(SecurityFido2RenameViewModel securityFido2RenameViewModel, Continuation<? super AnonymousClass3> continuation) {
            super(3, continuation);
            this.this$0 = securityFido2RenameViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.yHO
        public final Object invoke(FlowCollector<? super AbstractC32955mnO<Unit>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return new AnonymousClass3(this.this$0, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MutableSharedFlow mutableSharedFlow = this.this$0.copydefault;
                Boolean boolKWHzl = C56443yFo.KWHzl(false);
                this.label = 1;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.passkey.ui.rename.SecurityFido2RenameViewModel$clickConfirm$1$4, reason: invalid class name */
    public static final class AnonymousClass4 extends SuspendLambda implements yHO<FlowCollector<? super AbstractC32955mnO<Unit>>, Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SecurityFido2RenameViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(SecurityFido2RenameViewModel securityFido2RenameViewModel, Continuation<? super AnonymousClass4> continuation) {
            super(3, continuation);
            this.this$0 = securityFido2RenameViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.yHO
        public final Object invoke(FlowCollector<? super AbstractC32955mnO<Unit>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
            anonymousClass4.L$0 = th;
            return anonymousClass4.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Throwable th = (Throwable) this.L$0;
                MutableSharedFlow mutableSharedFlow = this.this$0.AEQbTJ;
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                this.label = 1;
                if (mutableSharedFlow.emit(message, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
