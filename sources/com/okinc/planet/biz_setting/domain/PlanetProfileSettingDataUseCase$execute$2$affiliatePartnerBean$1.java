package com.okinc.planet.biz_setting.domain;

import com.okinc.social_trade_api.data.AffiliatePartnerBeanForPlanet;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43248rlh;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49317umK;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetProfileSettingDataUseCase$execute$2$affiliatePartnerBean$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends AffiliatePartnerBeanForPlanet>>, Object> {
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlanetProfileSettingDataUseCase$execute$2$affiliatePartnerBean$1(Continuation<? super PlanetProfileSettingDataUseCase$execute$2$affiliatePartnerBean$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetProfileSettingDataUseCase$execute$2$affiliatePartnerBean$1(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends AffiliatePartnerBeanForPlanet>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<AffiliatePartnerBeanForPlanet>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<AffiliatePartnerBeanForPlanet>> continuation) {
        return ((PlanetProfileSettingDataUseCase$execute$2$affiliatePartnerBean$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC49317umK interfaceC49317umK = (InterfaceC49317umK) C43248rlh.KWHzl.AEQbTJ(InterfaceC49317umK.class);
            this.label = 1;
            objKWHzl = interfaceC49317umK.KWHzl(this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        return Result.m7376boximpl(objKWHzl);
    }
}
