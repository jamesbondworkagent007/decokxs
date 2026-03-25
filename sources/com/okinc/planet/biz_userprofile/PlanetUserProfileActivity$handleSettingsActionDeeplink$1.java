package com.okinc.planet.biz_userprofile;

import com.okinc.planet.biz_userprofile.data.PlanetTradeTypes;
import com.okinc.planet_api.model.PlanetProfileSettingsActions;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49317umK;
import o.tJI;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetUserProfileActivity$handleSettingsActionDeeplink$1 extends SuspendLambda implements Function2<PlanetTradeTypes, Continuation<? super Unit>, Object> {
    final /* synthetic */ PlanetProfileSettingsActions $action;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ tJI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetUserProfileActivity$handleSettingsActionDeeplink$1(tJI tji, PlanetProfileSettingsActions planetProfileSettingsActions, Continuation<? super PlanetUserProfileActivity$handleSettingsActionDeeplink$1> continuation) {
        super(2, continuation);
        this.this$0 = tji;
        this.$action = planetProfileSettingsActions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlanetUserProfileActivity$handleSettingsActionDeeplink$1 planetUserProfileActivity$handleSettingsActionDeeplink$1 = new PlanetUserProfileActivity$handleSettingsActionDeeplink$1(this.this$0, this.$action, continuation);
        planetUserProfileActivity$handleSettingsActionDeeplink$1.L$0 = obj;
        return planetUserProfileActivity$handleSettingsActionDeeplink$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PlanetTradeTypes planetTradeTypes, Continuation<? super Unit> continuation) {
        return ((PlanetUserProfileActivity$handleSettingsActionDeeplink$1) create(planetTradeTypes, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            PlanetTradeTypes planetTradeTypes = (PlanetTradeTypes) this.L$0;
            if (planetTradeTypes == null) {
                return Unit.INSTANCE;
            }
            ((InterfaceC49317umK) C43251rlk.copydefault(InterfaceC49317umK.class)).EZpvd(this.this$0, planetTradeTypes.toString(), this.$action.EZpvd());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
