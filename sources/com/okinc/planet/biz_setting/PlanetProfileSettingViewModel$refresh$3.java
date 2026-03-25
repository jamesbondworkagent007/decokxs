package com.okinc.planet.biz_setting;

import com.okinc.planet_api.model.PlanetProfileSettingsActions;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.AbstractC46197tLk;
import o.C46126tIu;
import o.C56391yDq;
import o.C56442yFn;
import o.tHW;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetProfileSettingViewModel$refresh$3 extends SuspendLambda implements Function2<AbstractC46197tLk<? extends C46126tIu>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ tHW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetProfileSettingViewModel$refresh$3(tHW thw, Continuation<? super PlanetProfileSettingViewModel$refresh$3> continuation) {
        super(2, continuation);
        this.this$0 = thw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlanetProfileSettingViewModel$refresh$3 planetProfileSettingViewModel$refresh$3 = new PlanetProfileSettingViewModel$refresh$3(this.this$0, continuation);
        planetProfileSettingViewModel$refresh$3.L$0 = obj;
        return planetProfileSettingViewModel$refresh$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(AbstractC46197tLk<? extends C46126tIu> abstractC46197tLk, Continuation<? super Unit> continuation) {
        return invoke2((AbstractC46197tLk<C46126tIu>) abstractC46197tLk, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(AbstractC46197tLk<C46126tIu> abstractC46197tLk, Continuation<? super Unit> continuation) {
        return ((PlanetProfileSettingViewModel$refresh$3) create(abstractC46197tLk, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC46197tLk abstractC46197tLk = (AbstractC46197tLk) this.L$0;
            if (abstractC46197tLk instanceof AbstractC46197tLk.Application) {
                this.this$0.copydefault.setValue(abstractC46197tLk);
                PlanetProfileSettingsActions planetProfileSettingsActionsKWHzl = this.this$0.KWHzl();
                if (planetProfileSettingsActionsKWHzl != null) {
                    this.this$0.KWHzl(new tHW.TaskDescription.StateListAnimator(planetProfileSettingsActionsKWHzl));
                }
            } else {
                this.this$0.copydefault.setValue(abstractC46197tLk);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
