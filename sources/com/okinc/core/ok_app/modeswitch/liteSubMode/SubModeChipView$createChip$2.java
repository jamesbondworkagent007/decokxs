package com.okinc.core.ok_app.modeswitch.liteSubMode;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC33240msi;
import o.AbstractC33249msr;
import o.C33070mpX;
import o.C33160mrH;
import o.C33299mto;
import o.C33367mvC;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class SubModeChipView$createChip$2 extends SuspendLambda implements yHO<CoroutineScope, Pair<? extends AbstractC33249msr, ? extends AbstractC33240msi>, Continuation<? super Unit>, Object> {
    final /* synthetic */ C33299mto $binding;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubModeChipView$createChip$2(C33299mto c33299mto, Continuation<? super SubModeChipView$createChip$2> continuation) {
        super(3, continuation);
        this.$binding = c33299mto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, Pair<? extends AbstractC33249msr, ? extends AbstractC33240msi> pair, Continuation<? super Unit> continuation) {
        SubModeChipView$createChip$2 subModeChipView$createChip$2 = new SubModeChipView$createChip$2(this.$binding, continuation);
        subModeChipView$createChip$2.L$0 = pair;
        return subModeChipView$createChip$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Pair pair = (Pair) this.L$0;
            AbstractC33249msr abstractC33249msr = (AbstractC33249msr) pair.component1();
            AbstractC33240msi abstractC33240msi = (AbstractC33240msi) pair.component2();
            pUU.KWHzl("ModeSwitch", "createChip: collect proSubMode=" + abstractC33249msr + ", liteSubMode=" + abstractC33240msi);
            pUU.KWHzl("ModeSwitch", "createChip: isProAvailable=" + C33367mvC.valueOf() + ", isLiteAvailable=" + C33367mvC.copydefault());
            if (C33367mvC.valueOf()) {
                if (Intrinsics.EZpvd(abstractC33249msr, AbstractC33249msr.TaskDescription.KWHzl)) {
                    this.$binding.copydefault.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.AxsJAY));
                } else if (Intrinsics.EZpvd(abstractC33249msr, AbstractC33249msr.Application.AEQbTJ)) {
                    this.$binding.copydefault.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.zuBGHE));
                } else {
                    if (!Intrinsics.EZpvd(abstractC33249msr, AbstractC33249msr.ActionBar.EZpvd)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.$binding.copydefault.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.AwvSrB));
                }
            } else if (abstractC33240msi instanceof AbstractC33240msi.Activity) {
                this.$binding.copydefault.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.AYXKKw));
            } else if (abstractC33240msi instanceof AbstractC33240msi.ActionBar) {
                this.$binding.copydefault.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.fetchVPNInfo));
            } else if (abstractC33240msi instanceof AbstractC33240msi.Application) {
                this.$binding.copydefault.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.ejfBZ));
            } else if (Intrinsics.EZpvd(abstractC33240msi, AbstractC33240msi.LoaderManager.EZpvd)) {
                this.$binding.copydefault.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.valueOf));
            } else {
                if (!Intrinsics.EZpvd(abstractC33240msi, AbstractC33240msi.TaskDescription.OLrzqt)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.$binding.copydefault.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.zuBGHE));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
