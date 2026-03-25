package com.okinc.planet.domain.usecase;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.planet.domain.remote.dto.UnreadMsgListResp;
import com.okinc.planet_api.model.PlanetNotificationCategory;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C43401rob;
import o.C43422row;
import o.C46351tRc;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.tQP;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetGetUnreadMsgListUserCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends UnreadMsgListResp, ? extends OKServerException>>, Object> {
    final /* synthetic */ PlanetNotificationCategory $category;
    final /* synthetic */ String $cursor;
    final /* synthetic */ int $size;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C46351tRc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetGetUnreadMsgListUserCase$invoke$2(PlanetNotificationCategory planetNotificationCategory, C46351tRc c46351tRc, String str, int i, Continuation<? super PlanetGetUnreadMsgListUserCase$invoke$2> continuation) {
        super(2, continuation);
        this.$category = planetNotificationCategory;
        this.this$0 = c46351tRc;
        this.$cursor = str;
        this.$size = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlanetGetUnreadMsgListUserCase$invoke$2 planetGetUnreadMsgListUserCase$invoke$2 = new PlanetGetUnreadMsgListUserCase$invoke$2(this.$category, this.this$0, this.$cursor, this.$size, continuation);
        planetGetUnreadMsgListUserCase$invoke$2.L$0 = obj;
        return planetGetUnreadMsgListUserCase$invoke$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends UnreadMsgListResp, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<UnreadMsgListResp, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<UnreadMsgListResp, OKServerException>> continuation) {
        return ((PlanetGetUnreadMsgListUserCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                PlanetNotificationCategory planetNotificationCategory = this.$category;
                C46351tRc c46351tRc = this.this$0;
                String str = this.$cursor;
                int i2 = this.$size;
                Integer numAEQbTJ = planetNotificationCategory.getCategory() != 0 ? C56443yFo.AEQbTJ(planetNotificationCategory.getCategory()) : null;
                tQP tqp = c46351tRc.copydefault;
                this.label = 1;
                obj = tQP.Application.geUnreadMsgList$default(tqp, numAEQbTJ, str, i2, 0, null, this, 24, null);
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
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }
}
