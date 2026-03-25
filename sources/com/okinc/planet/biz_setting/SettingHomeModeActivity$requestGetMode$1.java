package com.okinc.planet.biz_setting;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.ActivityC46114tIi;
import o.C43393roT;
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;
import o.pUU;
import o.tQP;

/* JADX INFO: loaded from: classes10.dex */
public final class SettingHomeModeActivity$requestGetMode$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $uid;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC46114tIi this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingHomeModeActivity$requestGetMode$1(ActivityC46114tIi activityC46114tIi, String str, Continuation<? super SettingHomeModeActivity$requestGetMode$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC46114tIi;
        this.$uid = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SettingHomeModeActivity$requestGetMode$1 settingHomeModeActivity$requestGetMode$1 = new SettingHomeModeActivity$requestGetMode$1(this.this$0, this.$uid, continuation);
        settingHomeModeActivity$requestGetMode$1.L$0 = obj;
        return settingHomeModeActivity$requestGetMode$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SettingHomeModeActivity$requestGetMode$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.showLoading();
                String str = this.$uid;
                tQP tqp = (tQP) C43393roT.httpService$default(C56524yIo.AEQbTJ(tQP.class), null, 1, null);
                this.label = 1;
                obj = tqp.EZpvd(null, str, null, this);
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
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            this.this$0.KWHzl(((PlanetBasicUserInfoResp) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl()).hDKMBd());
            this.this$0.dismissLoading();
        } else {
            if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.dismissLoading();
        }
        return Unit.INSTANCE;
    }
}
