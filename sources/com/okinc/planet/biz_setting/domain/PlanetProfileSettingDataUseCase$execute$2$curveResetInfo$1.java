package com.okinc.planet.biz_setting.domain;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.planet.biz_setting.data.CurveResetInfo;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.tIA;
import o.tQP;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetProfileSettingDataUseCase$execute$2$curveResetInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CurveResetInfo>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ tIA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetProfileSettingDataUseCase$execute$2$curveResetInfo$1(tIA tia, Continuation<? super PlanetProfileSettingDataUseCase$execute$2$curveResetInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = tia;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlanetProfileSettingDataUseCase$execute$2$curveResetInfo$1 planetProfileSettingDataUseCase$execute$2$curveResetInfo$1 = new PlanetProfileSettingDataUseCase$execute$2$curveResetInfo$1(this.this$0, continuation);
        planetProfileSettingDataUseCase$execute$2$curveResetInfo$1.L$0 = obj;
        return planetProfileSettingDataUseCase$execute$2$curveResetInfo$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CurveResetInfo> continuation) {
        return ((PlanetProfileSettingDataUseCase$execute$2$curveResetInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        AbstractC43419rot actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    tIA tia = this.this$0;
                    Result.Application application = Result.Companion;
                    tQP tqp = tia.copydefault;
                    this.label = 1;
                    obj = tqp.OLrzqt(this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                ResponseData responseData = (ResponseData) obj;
                if (responseData.getCode() == 0 && responseData.getData() != null) {
                    Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (Throwable th) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
            objM7377constructorimpl = Result.m7377constructorimpl((CurveResetInfo) ((List) actionBar.AEQbTJ()).get(0));
        } catch (Throwable th2) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            return null;
        }
        return objM7377constructorimpl;
    }
}
