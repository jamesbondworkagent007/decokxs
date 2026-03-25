package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.domain.model.EscapeErrorCodes;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletCreateUopRes;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC17006eue;
import o.C13754dXa;
import o.C17603fLl;
import o.C52794wYp;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.ViewOnClickListenerC54939xaY;
import o.fKK;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class EscapePasskeyWalletSignActivity$observeUIState$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ fKK this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EscapePasskeyWalletSignActivity$observeUIState$2(fKK fkk, Continuation<? super EscapePasskeyWalletSignActivity$observeUIState$2> continuation) {
        super(2, continuation);
        this.this$0 = fkk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EscapePasskeyWalletSignActivity$observeUIState$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EscapePasskeyWalletSignActivity$observeUIState$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePasskeyWalletSignActivity$observeUIState$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends PasskeyWalletCreateUopRes>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ fKK this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(fKK fkk, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = fkk;
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
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends PasskeyWalletCreateUopRes> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return invoke2((InterfaceC49371unL<PasskeyWalletCreateUopRes>) interfaceC49371unL, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC49371unL<PasskeyWalletCreateUopRes> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
                AbstractC17006eue abstractC17006eue = null;
                if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
                    AbstractC17006eue abstractC17006eue2 = this.this$0.copydefault;
                    if (abstractC17006eue2 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC17006eue2 = null;
                    }
                    C52794wYp.startLoading$default(abstractC17006eue2.OLrzqt, 0L, 1, null);
                } else if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                    AbstractC17006eue abstractC17006eue3 = this.this$0.copydefault;
                    if (abstractC17006eue3 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        abstractC17006eue = abstractC17006eue3;
                    }
                    abstractC17006eue.OLrzqt.fIwbmz();
                    InterfaceC49371unL.Activity activity = (InterfaceC49371unL.Activity) interfaceC49371unL;
                    Integer promptType = ((PasskeyWalletCreateUopRes) activity.copydefault()).getPromptType();
                    int value = EscapeErrorCodes.EscapeRiskType.ADDRESS_RISK.getValue();
                    if (promptType != null && promptType.intValue() == value) {
                        if (!this.this$0.gEmmrt().djBIcL()) {
                            if (promptType == null) {
                                this.this$0.AEQbTJ(((PasskeyWalletCreateUopRes) activity.copydefault()).getServerOption());
                            } else {
                                C17603fLl c17603fLlEZpvd = C17603fLl.Companion.EZpvd(promptType.intValue());
                                FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                                c17603fLlEZpvd.show(supportFragmentManager);
                            }
                        }
                    } else {
                        int value2 = EscapeErrorCodes.EscapeRiskType.DEVICE_RISK.getValue();
                        if (promptType == null || promptType.intValue() != value2) {
                            int value3 = EscapeErrorCodes.EscapeRiskType.ADDRESS_KYS_RISK.getValue();
                            if (promptType != null && promptType.intValue() == value3) {
                            }
                        }
                    }
                } else if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
                    AbstractC17006eue abstractC17006eue4 = this.this$0.copydefault;
                    if (abstractC17006eue4 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC17006eue4 = null;
                    }
                    abstractC17006eue4.OLrzqt.fIwbmz();
                    Throwable thAEQbTJ = ((InterfaceC49371unL.Application) interfaceC49371unL).AEQbTJ();
                    if (thAEQbTJ instanceof OKServerException) {
                        if (((OKServerException) thAEQbTJ).getCode() == 20008) {
                            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.this$0);
                            fKK fkk = this.this$0;
                            viewOnClickListenerC54939xaY.EZpvd(0);
                            viewOnClickListenerC54939xaY.EZpvd(fkk.getString(C13754dXa.FragmentManager.MediaControllerCompatCallbackMessageHandler));
                            String string = fkk.getString(C13754dXa.FragmentManager.DarRvM);
                            Intrinsics.checkNotNullExpressionValue(string, "");
                            ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, string, (View.OnClickListener) null, 2, (Object) null);
                            viewOnClickListenerC54939xaY.show();
                        } else {
                            String message = thAEQbTJ.getMessage();
                            if (message != null) {
                                C55326xho.toastWithFailedIcon$default(message, 0, 1, (Object) null);
                            }
                        }
                    } else {
                        String message2 = thAEQbTJ.getMessage();
                        if (message2 != null) {
                            C55326xho.toastWithFailedIcon$default(message2, 0, 1, (Object) null);
                        }
                    }
                    pUU.AEQbTJ("EscapePasskeyWalletSignActivity", "signEscapeTransactionFlow error: ", thAEQbTJ);
                } else {
                    AbstractC17006eue abstractC17006eue5 = this.this$0.copydefault;
                    if (abstractC17006eue5 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        abstractC17006eue = abstractC17006eue5;
                    }
                    abstractC17006eue.OLrzqt.fIwbmz();
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
            StateFlow<InterfaceC49371unL<PasskeyWalletCreateUopRes>> stateFlowValueOf = this.this$0.gEmmrt().valueOf();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowValueOf, anonymousClass1, this) == objCopydefault) {
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
