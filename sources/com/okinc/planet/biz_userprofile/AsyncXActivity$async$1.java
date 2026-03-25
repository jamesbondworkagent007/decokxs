package com.okinc.planet.biz_userprofile;

import android.content.Intent;
import android.view.View;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.planet.biz_userprofile.AsyncXActivity$async$1;
import com.okinc.planet.biz_userprofile.data.PlanetXAsync;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.AbstractC46223tMj;
import o.ActivityC46148tJp;
import o.C32866mlf;
import o.C33070mpX;
import o.C43393roT;
import o.C43401rob;
import o.C43422row;
import o.C47501trL;
import o.C55284xgz;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;
import o.pUU;
import o.tQP;

/* JADX INFO: loaded from: classes16.dex */
public final class AsyncXActivity$async$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC46148tJp this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncXActivity$async$1(ActivityC46148tJp activityC46148tJp, Continuation<? super AsyncXActivity$async$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC46148tJp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AsyncXActivity$async$1 asyncXActivity$async$1 = new AsyncXActivity$async$1(this.this$0, continuation);
        asyncXActivity$async$1.L$0 = obj;
        return asyncXActivity$async$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AsyncXActivity$async$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        final AbstractC43419rot actionBar;
        View root;
        C55284xgz c55284xgzKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                tQP tqp = (tQP) C43393roT.httpService$default(C56524yIo.AEQbTJ(tQP.class), null, 1, null);
                PlanetXAsync planetXAsync = new PlanetXAsync(true);
                this.label = 1;
                obj = tqp.copydefault(planetXAsync, (Continuation<? super ResponseData<Object>>) this);
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
            if (responseData.getCode() == 0) {
                actionBar = new AbstractC43419rot.StateListAnimator(responseData.getData());
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            Intent intent = new Intent();
            intent.putExtra("async_x_result", true);
            this.this$0.setResult(-1, intent);
            this.this$0.finish();
        } else {
            if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            C32866mlf.onEvent$default("Twitter_Sync_Unsuccessfully_View", (TrackChannel[]) null, new Function1() { // from class: o.tJu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return AsyncXActivity$async$1.invokeSuspend$lambda$1(actionBar, (EventParamsList) obj2);
                }
            }, 1, (Object) null);
            AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) actionBar;
            if (((OKServerException) actionBar2.KWHzl()).getCode() != 55013 && ((OKServerException) actionBar2.KWHzl()).getCode() != 55015 && ((OKServerException) actionBar2.KWHzl()).getCode() != 55014) {
                AbstractC46223tMj abstractC46223tMj = this.this$0.AEQbTJ;
                if (abstractC46223tMj != null && (root = abstractC46223tMj.getRoot()) != null && (c55284xgzKWHzl = C55284xgz.Companion.KWHzl(root, C33070mpX.AYXKKw(C47501trL.Fragment.apAOXX))) != null) {
                    c55284xgzKWHzl.isConnected(1);
                    c55284xgzKWHzl.hDKMBd();
                }
            } else {
                Intent intent2 = new Intent();
                intent2.putExtra("async_x_result", false);
                intent2.putExtra("async_x_code", ((OKServerException) actionBar2.KWHzl()).getCode());
                intent2.putExtra("async_x_message", ((OKServerException) actionBar2.KWHzl()).getMessage());
                this.this$0.setResult(-1, intent2);
                this.this$0.finish();
            }
            this.this$0.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(AbstractC43419rot abstractC43419rot, EventParamsList eventParamsList) {
        EventParamsList.put$default(eventParamsList, "type", String.valueOf(((OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()).getCode()), false, 4, null);
        return Unit.INSTANCE;
    }
}
