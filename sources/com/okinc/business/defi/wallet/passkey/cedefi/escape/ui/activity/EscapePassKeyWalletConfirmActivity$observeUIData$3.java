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
import o.AbstractC17013eul;
import o.ActivityC17567fKc;
import o.C13754dXa;
import o.C17605fLn;
import o.C52794wYp;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.ViewOnClickListenerC54939xaY;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class EscapePassKeyWalletConfirmActivity$observeUIData$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC17567fKc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EscapePassKeyWalletConfirmActivity$observeUIData$3(ActivityC17567fKc activityC17567fKc, Continuation<? super EscapePassKeyWalletConfirmActivity$observeUIData$3> continuation) {
        super(2, continuation);
        this.this$0 = activityC17567fKc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EscapePassKeyWalletConfirmActivity$observeUIData$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EscapePassKeyWalletConfirmActivity$observeUIData$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletConfirmActivity$observeUIData$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends PasskeyWalletCreateUopRes>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ActivityC17567fKc this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC17567fKc activityC17567fKc, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC17567fKc;
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
                AbstractC17013eul abstractC17013eul = null;
                if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
                    AbstractC17013eul abstractC17013eul2 = this.this$0.AEQbTJ;
                    if (abstractC17013eul2 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC17013eul2 = null;
                    }
                    C52794wYp.startLoading$default(abstractC17013eul2.copydefault, 0L, 1, null);
                } else if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                    AbstractC17013eul abstractC17013eul3 = this.this$0.AEQbTJ;
                    if (abstractC17013eul3 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        abstractC17013eul = abstractC17013eul3;
                    }
                    abstractC17013eul.copydefault.fIwbmz();
                    InterfaceC49371unL.Activity activity = (InterfaceC49371unL.Activity) interfaceC49371unL;
                    Integer promptType = ((PasskeyWalletCreateUopRes) activity.copydefault()).getPromptType();
                    int value = EscapeErrorCodes.EscapeRiskType.ADDRESS_RISK.getValue();
                    if (promptType != null && promptType.intValue() == value) {
                        if (!this.this$0.gEmmrt().djBIcL()) {
                            if (promptType == null) {
                                this.this$0.KWHzl(((PasskeyWalletCreateUopRes) activity.copydefault()).getServerOption());
                            } else {
                                C17605fLn c17605fLnCopydefault = C17605fLn.Companion.copydefault(promptType.intValue());
                                FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                                c17605fLnCopydefault.show(supportFragmentManager);
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
                    AbstractC17013eul abstractC17013eul4 = this.this$0.AEQbTJ;
                    if (abstractC17013eul4 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC17013eul4 = null;
                    }
                    abstractC17013eul4.copydefault.fIwbmz();
                    Throwable thAEQbTJ = ((InterfaceC49371unL.Application) interfaceC49371unL).AEQbTJ();
                    if (thAEQbTJ instanceof OKServerException) {
                        if (((OKServerException) thAEQbTJ).getCode() == 20008) {
                            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.this$0);
                            ActivityC17567fKc activityC17567fKc = this.this$0;
                            viewOnClickListenerC54939xaY.EZpvd(0);
                            viewOnClickListenerC54939xaY.EZpvd(activityC17567fKc.getString(C13754dXa.FragmentManager.MediaControllerCompatCallbackMessageHandler));
                            String string = activityC17567fKc.getString(C13754dXa.FragmentManager.DarRvM);
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
                    pUU.AEQbTJ("EscapePassKeyWalletConfirmActivity", "signEscapeTransactionFlow error: ", thAEQbTJ);
                } else {
                    AbstractC17013eul abstractC17013eul5 = this.this$0.AEQbTJ;
                    if (abstractC17013eul5 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        abstractC17013eul = abstractC17013eul5;
                    }
                    abstractC17013eul.copydefault.fIwbmz();
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
