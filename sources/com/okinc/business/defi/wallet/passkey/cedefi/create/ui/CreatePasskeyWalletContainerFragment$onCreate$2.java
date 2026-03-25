package com.okinc.business.defi.wallet.passkey.cedefi.create.ui;

import com.okinc.business.defi.api.bean.passkeywallet.cedefi.BindEmailData;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.CeDeFiWalletResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailOperationInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailOperationSourceType;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.WalletCreationError;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.C17545fJh;
import o.C17661fNp;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class CreatePasskeyWalletContainerFragment$onCreate$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C17545fJh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePasskeyWalletContainerFragment$onCreate$2(C17545fJh c17545fJh, Continuation<? super CreatePasskeyWalletContainerFragment$onCreate$2> continuation) {
        super(2, continuation);
        this.this$0 = c17545fJh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreatePasskeyWalletContainerFragment$onCreate$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreatePasskeyWalletContainerFragment$onCreate$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.passkey.cedefi.create.ui.CreatePasskeyWalletContainerFragment$onCreate$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends BindEmailData>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C17545fJh this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C17545fJh c17545fJh, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c17545fJh;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends BindEmailData> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return invoke2((InterfaceC49371unL<BindEmailData>) interfaceC49371unL, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC49371unL<BindEmailData> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
                if (!(interfaceC49371unL instanceof InterfaceC49371unL.StateListAnimator) && !(interfaceC49371unL instanceof InterfaceC49371unL.ActionBar)) {
                    if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                        this.this$0.AhwBna.launch(new EmailOperationInput(EmailOperationSourceType.FROM_CREATE_WALLET, (BindEmailData) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault(), (String) null, 4, (DefaultConstructorMarker) null));
                    } else if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
                        InterfaceC49371unL.Application application = (InterfaceC49371unL.Application) interfaceC49371unL;
                        String message = application.AEQbTJ().getMessage();
                        if (message == null) {
                            message = "";
                        }
                        pUU.copydefault("CreatePasskeyWalletContainer", "bindEmailDataFlow = " + message);
                        String message2 = application.AEQbTJ().getMessage();
                        String strHandleNetworkCommonErrorMessage$default = C17661fNp.handleNetworkCommonErrorMessage$default(C17661fNp.OLrzqt, null, 1, null);
                        if (message2 == null || message2.length() == 0 || StringsKt__StringsKt.fARcdN((CharSequence) message2)) {
                            message2 = strHandleNetworkCommonErrorMessage$default;
                        }
                        C55326xho.toastWithFailedIcon$default(message2, 0, 1, (Object) null);
                        this.this$0.copydefault(new CeDeFiWalletResult.Failed(new WalletCreationError.WalletNetworkFailure(new Throwable(message2))));
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SharedFlow<InterfaceC49371unL<BindEmailData>> sharedFlowOLrzqt = this.this$0.AhwBna().OLrzqt();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlowOLrzqt, anonymousClass1, this) == objCopydefault) {
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
