package com.okinc.core.ok_app.modeswitch.liteSubMode;

import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC33249msr;
import o.C33371mvG;
import o.C43251rlk;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC33237msf;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class AppSubModeSwitchBottomSheet$switchSubMode$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC33249msr $to;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C33371mvG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSubModeSwitchBottomSheet$switchSubMode$1(AbstractC33249msr abstractC33249msr, C33371mvG c33371mvG, Continuation<? super AppSubModeSwitchBottomSheet$switchSubMode$1> continuation) {
        super(2, continuation);
        this.$to = abstractC33249msr;
        this.this$0 = c33371mvG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AppSubModeSwitchBottomSheet$switchSubMode$1 appSubModeSwitchBottomSheet$switchSubMode$1 = new AppSubModeSwitchBottomSheet$switchSubMode$1(this.$to, this.this$0, continuation);
        appSubModeSwitchBottomSheet$switchSubMode$1.L$0 = obj;
        return appSubModeSwitchBottomSheet$switchSubMode$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppSubModeSwitchBottomSheet$switchSubMode$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC33249msr abstractC33249msr;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC33249msr value = ((InterfaceC33237msf) C43251rlk.copydefault(InterfaceC33237msf.class)).OLrzqt().getValue();
            pUU.KWHzl("ModeSwitch", "switchSubMode: from=" + value + ", to=" + this.$to);
            this.this$0.OLrzqt(value, this.$to);
            InterfaceC33237msf interfaceC33237msf = (InterfaceC33237msf) C43251rlk.copydefault(InterfaceC33237msf.class);
            AbstractC33249msr abstractC33249msr2 = this.$to;
            FragmentActivity activity = this.this$0.getActivity();
            if (activity != null) {
                this.L$0 = value;
                this.label = 1;
                if (InterfaceC33237msf.Activity.switchProSubMode$default(interfaceC33237msf, abstractC33249msr2, activity, null, this, 4, null) == objCopydefault) {
                    return objCopydefault;
                }
                abstractC33249msr = value;
            } else {
                pUU.valueOf("ModeSwitch", "switchSubMode: Activity is null");
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC33249msr = (AbstractC33249msr) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        pUU.KWHzl("ModeSwitch", "switchSubMode: Switch complete, newMode=" + ((InterfaceC33237msf) C43251rlk.copydefault(InterfaceC33237msf.class)).OLrzqt().getValue());
        if (this.this$0.isAdded()) {
            FragmentKt.setFragmentResult(this.this$0, "FRAGMENT_RESULT_KEY", BundleKt.bundleOf(C56390yDp.OLrzqt("FRAGMENT_RESULT_MODE_CHANGED", C56443yFo.KWHzl(!Intrinsics.EZpvd(abstractC33249msr, r12)))));
            this.this$0.dismissAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }
}
