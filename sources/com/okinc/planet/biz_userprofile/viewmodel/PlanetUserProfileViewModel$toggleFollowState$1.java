package com.okinc.planet.biz_userprofile.viewmodel;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.planet.biz_notifications.model.FollowStatusV2Enum;
import com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp;
import com.okinc.rxutils.RxBus;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C43422row;
import o.C46187tLa;
import o.C46189tLc;
import o.C46203tLq;
import o.C46437tUh;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC7298ahG;
import o.tLX;
import o.tRK;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetUserProfileViewModel$toggleFollowState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ tLX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetUserProfileViewModel$toggleFollowState$1(tLX tlx, Continuation<? super PlanetUserProfileViewModel$toggleFollowState$1> continuation) {
        super(2, continuation);
        this.this$0 = tlx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlanetUserProfileViewModel$toggleFollowState$1 planetUserProfileViewModel$toggleFollowState$1 = new PlanetUserProfileViewModel$toggleFollowState$1(this.this$0, continuation);
        planetUserProfileViewModel$toggleFollowState$1.L$0 = obj;
        return planetUserProfileViewModel$toggleFollowState$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetUserProfileViewModel$toggleFollowState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        String status;
        int i;
        tLX tlx;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C46189tLc c46189tLcAEQbTJ = this.this$0.AEQbTJ();
            if (c46189tLcAEQbTJ == null) {
                return Unit.INSTANCE;
            }
            FollowStatusV2Enum.Activity activity = FollowStatusV2Enum.Companion;
            boolean z = !activity.EZpvd(c46189tLcAEQbTJ.valueOf());
            FollowStatusV2Enum followStatusV2EnumAEQbTJ = activity.AEQbTJ(c46189tLcAEQbTJ.valueOf());
            status = followStatusV2EnumAEQbTJ != null ? followStatusV2EnumAEQbTJ.getStatus() : null;
            tLX tlx2 = this.this$0;
            Result.Application application2 = Result.Companion;
            C46203tLq c46203tLq = tlx2.AYXKKw;
            C46203tLq.StateListAnimator stateListAnimator = new C46203tLq.StateListAnimator(z, tlx2.copydefault());
            this.L$0 = status;
            this.L$1 = tlx2;
            this.I$0 = z ? 1 : 0;
            this.label = 1;
            if (c46203tLq.KWHzl(stateListAnimator, this) == objCopydefault) {
                return objCopydefault;
            }
            i = z ? 1 : 0;
            tlx = tlx2;
        } else {
            if (i2 != 1) {
                if (i2 != 2 && i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            i = this.I$0;
            tlx = (tLX) this.L$1;
            status = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        InterfaceC7298ahG interfaceC7298ahGAuCTel = tlx.AuCTel();
        if (interfaceC7298ahGAuCTel != null) {
            Pair[] pairArr = new Pair[5];
            pairArr[0] = C56390yDp.OLrzqt("isFollowing", C56443yFo.KWHzl(i != 0));
            pairArr[1] = C56390yDp.OLrzqt("followStatusV2", status);
            pairArr[2] = C56390yDp.OLrzqt("authorId", tlx.copydefault());
            PlanetBasicUserInfoResp planetBasicUserInfoRespAEQbTJ = tlx.DbNXlk.AEQbTJ();
            pairArr[3] = C56390yDp.OLrzqt("nickName", planetBasicUserInfoRespAEQbTJ != null ? planetBasicUserInfoRespAEQbTJ.fJNWhG() : null);
            PlanetBasicUserInfoResp planetBasicUserInfoRespAEQbTJ2 = tlx.DbNXlk.AEQbTJ();
            pairArr[4] = C56390yDp.OLrzqt("portrait", planetBasicUserInfoRespAEQbTJ2 != null ? planetBasicUserInfoRespAEQbTJ2.getFieldNames() : null);
            interfaceC7298ahGAuCTel.AEQbTJ("follow_button_update_status_listener", null, C56424yEw.gEmmrt(pairArr));
        }
        boolean z2 = i != 0;
        String strCopydefault = tlx.copydefault();
        PlanetBasicUserInfoResp planetBasicUserInfoRespAEQbTJ3 = tlx.DbNXlk.AEQbTJ();
        String strFJNWhG = planetBasicUserInfoRespAEQbTJ3 != null ? planetBasicUserInfoRespAEQbTJ3.fJNWhG() : null;
        PlanetBasicUserInfoResp planetBasicUserInfoRespAEQbTJ4 = tlx.DbNXlk.AEQbTJ();
        RxBus.AEQbTJ(new C46187tLa(z2, strCopydefault, strFJNWhG, planetBasicUserInfoRespAEQbTJ4 != null ? planetBasicUserInfoRespAEQbTJ4.getFieldNames() : null, null, 16, null));
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        tLX tlx3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            OKServerException oKServerExceptionOLrzqt = C43422row.OLrzqt(thM7380exceptionOrNullimpl);
            if (oKServerExceptionOLrzqt == null || oKServerExceptionOLrzqt.getCode() != 50034 || !C46437tUh.OLrzqt.AEQbTJ()) {
                MutableSharedFlow mutableSharedFlow = tlx3.KWHzl;
                tLX.Application.StateListAnimator stateListAnimator2 = new tLX.Application.StateListAnimator(tRK.EZpvd(thM7380exceptionOrNullimpl));
                this.L$0 = objM7377constructorimpl;
                this.L$1 = null;
                this.label = 3;
                if (mutableSharedFlow.emit(stateListAnimator2, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                MutableSharedFlow mutableSharedFlow2 = tlx3.KWHzl;
                tLX.Application.Activity activity2 = new tLX.Application.Activity(tRK.EZpvd(thM7380exceptionOrNullimpl));
                this.L$0 = objM7377constructorimpl;
                this.L$1 = null;
                this.label = 2;
                if (mutableSharedFlow2.emit(activity2, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
