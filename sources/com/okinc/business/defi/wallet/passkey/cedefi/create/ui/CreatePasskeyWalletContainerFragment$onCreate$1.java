package com.okinc.business.defi.wallet.passkey.cedefi.create.ui;

import com.okinc.auth.api.passkey.PasskeyRegisterScenarioRequest;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.CeDeFiWalletResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.WalletCreationError;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyAccountData;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.C17545fJh;
import o.C17661fNp;
import o.C17662fNq;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.fJL;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class CreatePasskeyWalletContainerFragment$onCreate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C17545fJh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePasskeyWalletContainerFragment$onCreate$1(C17545fJh c17545fJh, Continuation<? super CreatePasskeyWalletContainerFragment$onCreate$1> continuation) {
        super(2, continuation);
        this.this$0 = c17545fJh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreatePasskeyWalletContainerFragment$onCreate$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreatePasskeyWalletContainerFragment$onCreate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.passkey.cedefi.create.ui.CreatePasskeyWalletContainerFragment$onCreate$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends PasskeyAccountData>, Continuation<? super Unit>, Object> {
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
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends PasskeyAccountData> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return invoke2((InterfaceC49371unL<PasskeyAccountData>) interfaceC49371unL, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC49371unL<PasskeyAccountData> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
                if (!(interfaceC49371unL instanceof InterfaceC49371unL.StateListAnimator) && !(interfaceC49371unL instanceof InterfaceC49371unL.ActionBar)) {
                    if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                        C17545fJh c17545fJh = this.this$0;
                        C17662fNq c17662fNq = C17662fNq.KWHzl;
                        c17545fJh.copydefault(new CeDeFiWalletResult.Success(c17662fNq.AEQbTJ()));
                        c17662fNq.OLrzqt();
                    } else if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
                        Throwable thAEQbTJ = ((InterfaceC49371unL.Application) interfaceC49371unL).AEQbTJ();
                        String message = thAEQbTJ.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        pUU.copydefault("CreatePasskeyWalletContainer", "createAccountFlow = " + message);
                        if (thAEQbTJ instanceof OKServerException) {
                            int code = ((OKServerException) thAEQbTJ).getCode();
                            if (code == 10018) {
                                this.this$0.KWHzl.launch(new PasskeyRegisterScenarioRequest(new PasskeyScenario.CedefiWallet("dex_create", false, 2, null), null, 2, null));
                            } else if (code == 10030) {
                                fJL.loadUserEmailInfo$default(this.this$0.AhwBna(), null, 1, null);
                            } else if (code == 40002) {
                                this.this$0.copydefault(new CeDeFiWalletResult.Failed(WalletCreationError.RiskControl.copydefault));
                            } else if (code != 10020) {
                                if (code == 10021) {
                                    this.this$0.djBIcL();
                                } else {
                                    C17661fNp c17661fNp = C17661fNp.OLrzqt;
                                    String message2 = thAEQbTJ.getMessage();
                                    C55326xho.toastWithFailedIcon$default(c17661fNp.EZpvd(message2 != null ? message2 : ""), 0, 1, (Object) null);
                                    this.this$0.copydefault(new CeDeFiWalletResult.Failed(new WalletCreationError.WalletNetworkFailure(thAEQbTJ)));
                                }
                            }
                        } else {
                            C55326xho.toastWithFailedIcon$default(C17661fNp.handleNetworkCommonErrorMessage$default(C17661fNp.OLrzqt, null, 1, null), 0, 1, (Object) null);
                            this.this$0.copydefault(new CeDeFiWalletResult.Failed(new WalletCreationError.WalletNetworkFailure(thAEQbTJ)));
                        }
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
            SharedFlow<InterfaceC49371unL<PasskeyAccountData>> sharedFlowCopydefault = this.this$0.OLrzqt().copydefault();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlowCopydefault, anonymousClass1, this) == objCopydefault) {
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
