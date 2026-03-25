package com.okinc.planet.manager;

import com.okinc.planet.biz_onboarding.data.OrbitBeanResp;
import com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp;
import com.okinc.planet.domain.remote.dto.PublishPermissionResp;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C46386tSk;
import o.C46388tSm;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetAccountUserManager$loadCachedData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C46388tSm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetAccountUserManager$loadCachedData$2(C46388tSm c46388tSm, Continuation<? super PlanetAccountUserManager$loadCachedData$2> continuation) {
        super(2, continuation);
        this.this$0 = c46388tSm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlanetAccountUserManager$loadCachedData$2 planetAccountUserManager$loadCachedData$2 = new PlanetAccountUserManager$loadCachedData$2(this.this$0, continuation);
        planetAccountUserManager$loadCachedData$2.L$0 = obj;
        return planetAccountUserManager$loadCachedData$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetAccountUserManager$loadCachedData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String strCopydefault = this.this$0.copydefault();
            if (strCopydefault == null || strCopydefault.length() == 0) {
                pUU.EZpvd("PlanetAccountUserManager", "loadCachedData: accountUuid is null, skip loading");
                return Unit.INSTANCE;
            }
            pUU.EZpvd("PlanetAccountUserManager", "loadCachedData: loading cached data for accountUuid: " + strCopydefault);
            C46388tSm c46388tSm = this.this$0;
            try {
                Result.Application application = Result.Companion;
                C46386tSk c46386tSk = C46386tSk.copydefault;
                PlanetBasicUserInfoResp planetBasicUserInfoRespValues = c46386tSk.values(strCopydefault);
                if (planetBasicUserInfoRespValues != null) {
                    c46388tSm.AEQbTJ.setValue(planetBasicUserInfoRespValues);
                    pUU.KWHzl("PlanetAccountUserManager", "loadCachedData: loaded cached ProfileInfo=" + planetBasicUserInfoRespValues);
                } else {
                    pUU.EZpvd("PlanetAccountUserManager", "loadCachedData: no cached ProfileInfo found");
                }
                OrbitBeanResp orbitBeanRespAYXKKw = c46386tSk.AYXKKw(strCopydefault);
                if (orbitBeanRespAYXKKw != null) {
                    c46388tSm.OLrzqt.setValue(orbitBeanRespAYXKKw);
                    pUU.KWHzl("PlanetAccountUserManager", "loadCachedData: loaded cached OrbitData=" + orbitBeanRespAYXKKw);
                } else {
                    pUU.EZpvd("PlanetAccountUserManager", "loadCachedData: no cached OrbitData found");
                }
                PublishPermissionResp publishPermissionRespDbNXlk = c46386tSk.DbNXlk(strCopydefault);
                if (publishPermissionRespDbNXlk != null) {
                    c46388tSm.copydefault.setValue(publishPermissionRespDbNXlk);
                    pUU.KWHzl("PlanetAccountUserManager", "loadCachedData: loaded cached PublishPermission=" + publishPermissionRespDbNXlk);
                } else {
                    pUU.EZpvd("PlanetAccountUserManager", "loadCachedData: no cached PublishPermission found");
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("PlanetAccountUserManager", "loadCachedData: failed to load cached data", thM7380exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
