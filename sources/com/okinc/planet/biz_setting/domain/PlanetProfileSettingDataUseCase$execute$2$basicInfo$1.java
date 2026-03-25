package com.okinc.planet.biz_setting.domain;

import com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C46189tLc;
import o.C46388tSm;
import o.C56391yDq;
import o.C56442yFn;
import o.tIA;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetProfileSettingDataUseCase$execute$2$basicInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PlanetBasicUserInfoResp>, Object> {
    int label;
    final /* synthetic */ tIA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetProfileSettingDataUseCase$execute$2$basicInfo$1(tIA tia, Continuation<? super PlanetProfileSettingDataUseCase$execute$2$basicInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = tia;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetProfileSettingDataUseCase$execute$2$basicInfo$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PlanetBasicUserInfoResp> continuation) {
        return ((PlanetProfileSettingDataUseCase$execute$2$basicInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        PlanetBasicUserInfoResp planetBasicUserInfoRespEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C46388tSm c46388tSm = this.this$0.AEQbTJ;
            this.label = 1;
            obj = c46388tSm.copydefault(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        Pair pair = (Pair) obj;
        C46189tLc c46189tLc = (C46189tLc) pair.component1();
        Throwable th = (Throwable) pair.component2();
        if (c46189tLc != null && (planetBasicUserInfoRespEZpvd = c46189tLc.EZpvd()) != null) {
            return planetBasicUserInfoRespEZpvd;
        }
        if (th == null) {
            throw new Exception("Failed to refresh user info");
        }
        throw th;
    }
}
