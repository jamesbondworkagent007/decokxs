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
import o.AbstractC33240msi;
import o.C33388mvX;
import o.C43251rlk;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC33233msb;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class TradeModeSwitchBottomSheet$switchSubMode$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC33240msi $to;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C33388mvX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeModeSwitchBottomSheet$switchSubMode$1(AbstractC33240msi abstractC33240msi, C33388mvX c33388mvX, Continuation<? super TradeModeSwitchBottomSheet$switchSubMode$1> continuation) {
        super(2, continuation);
        this.$to = abstractC33240msi;
        this.this$0 = c33388mvX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TradeModeSwitchBottomSheet$switchSubMode$1 tradeModeSwitchBottomSheet$switchSubMode$1 = new TradeModeSwitchBottomSheet$switchSubMode$1(this.$to, this.this$0, continuation);
        tradeModeSwitchBottomSheet$switchSubMode$1.L$0 = obj;
        return tradeModeSwitchBottomSheet$switchSubMode$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TradeModeSwitchBottomSheet$switchSubMode$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC33240msi abstractC33240msi;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC33240msi value = ((InterfaceC33233msb) C43251rlk.copydefault(InterfaceC33233msb.class)).KWHzl().getValue();
            pUU.KWHzl("ModeSwitch", "switchSubMode: from=" + value + ", to=" + this.$to);
            InterfaceC33233msb interfaceC33233msb = (InterfaceC33233msb) C43251rlk.copydefault(InterfaceC33233msb.class);
            AbstractC33240msi abstractC33240msi2 = this.$to;
            FragmentActivity activity = this.this$0.getActivity();
            if (activity != null) {
                this.L$0 = value;
                this.label = 1;
                if (InterfaceC33233msb.ActionBar.switchLiteSubMode$default(interfaceC33233msb, abstractC33240msi2, activity, null, this, 4, null) == objCopydefault) {
                    return objCopydefault;
                }
                abstractC33240msi = value;
            } else {
                pUU.valueOf("ModeSwitch", "switchSubMode: Activity is null");
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC33240msi = (AbstractC33240msi) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC33240msi value2 = ((InterfaceC33233msb) C43251rlk.copydefault(InterfaceC33233msb.class)).KWHzl().getValue();
        pUU.KWHzl("ModeSwitch", "switchSubMode: Switch complete, newMode=" + value2);
        this.this$0.OLrzqt(abstractC33240msi, this.$to);
        FragmentKt.setFragmentResult(this.this$0, "FRAGMENT_RESULT_KEY", BundleKt.bundleOf(C56390yDp.OLrzqt("FRAGMENT_RESULT_MODE_CHANGED", C56443yFo.KWHzl(Intrinsics.EZpvd(abstractC33240msi, value2) ^ true))));
        this.this$0.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }
}
