package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.fragment;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeProcessInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeStatusInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.ProjectSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractActivityC33041mov;
import o.C17598fLg;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.InterfaceC9914bea;

/* JADX INFO: loaded from: classes23.dex */
public final class EscapeContainerWithCheckStatusFragment$onViewCreated$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C17598fLg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EscapeContainerWithCheckStatusFragment$onViewCreated$1(C17598fLg c17598fLg, Continuation<? super EscapeContainerWithCheckStatusFragment$onViewCreated$1> continuation) {
        super(2, continuation);
        this.this$0 = c17598fLg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EscapeContainerWithCheckStatusFragment$onViewCreated$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EscapeContainerWithCheckStatusFragment$onViewCreated$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.fragment.EscapeContainerWithCheckStatusFragment$onViewCreated$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends Boolean>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C17598fLg this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C17598fLg c17598fLg, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c17598fLg;
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
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends Boolean> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return invoke2((InterfaceC49371unL<Boolean>) interfaceC49371unL, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC49371unL<Boolean> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Parcelable parcelable;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
                EscapeProcessInput escapeProcessInput = null;
                if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
                    FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                    AbstractActivityC33041mov abstractActivityC33041mov = fragmentActivityRequireActivity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) fragmentActivityRequireActivity : null;
                    if (abstractActivityC33041mov != null) {
                        abstractActivityC33041mov.showLoading();
                    }
                } else if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                    FragmentActivity fragmentActivityRequireActivity2 = this.this$0.requireActivity();
                    AbstractActivityC33041mov abstractActivityC33041mov2 = fragmentActivityRequireActivity2 instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) fragmentActivityRequireActivity2 : null;
                    if (abstractActivityC33041mov2 != null) {
                        abstractActivityC33041mov2.dismissLoading();
                    }
                    if (!((Boolean) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault()).booleanValue()) {
                        ActivityResultLauncher activityResultLauncher = this.this$0.EZpvd;
                        Bundle arguments = this.this$0.getArguments();
                        if (arguments != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) arguments.getParcelable("escape_input", EscapeProcessInput.class);
                            } else {
                                parcelable = arguments.getParcelable("escape_input");
                            }
                            escapeProcessInput = (EscapeProcessInput) parcelable;
                        }
                        activityResultLauncher.launch(escapeProcessInput);
                    } else {
                        InterfaceC9914bea interfaceC9914bea = (InterfaceC9914bea) C43251rlk.copydefault(InterfaceC9914bea.class);
                        FragmentActivity fragmentActivityRequireActivity3 = this.this$0.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity3, "");
                        interfaceC9914bea.copydefault(fragmentActivityRequireActivity3, new EscapeStatusInput(ProjectSource.CeDeFi, (String) null, 2, (DefaultConstructorMarker) null));
                    }
                } else if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
                    FragmentActivity fragmentActivityRequireActivity4 = this.this$0.requireActivity();
                    AbstractActivityC33041mov abstractActivityC33041mov3 = fragmentActivityRequireActivity4 instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) fragmentActivityRequireActivity4 : null;
                    if (abstractActivityC33041mov3 != null) {
                        abstractActivityC33041mov3.dismissLoading();
                    }
                    this.this$0.OLrzqt(EscapeResult.Cancelled.AEQbTJ);
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
            StateFlow<InterfaceC49371unL<Boolean>> stateFlowOLrzqt = this.this$0.EZpvd().OLrzqt();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowOLrzqt, anonymousClass1, this) == objCopydefault) {
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
