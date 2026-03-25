package com.okinc.planet.biz_setting.reset;

import com.okinc.planet.biz_performance.data.ProfileChartTypeDto;
import com.okinc.planet.biz_userprofile.data.PlanetAuthorId;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC46197tLk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.tBH;
import o.tIH;

/* JADX INFO: loaded from: classes10.dex */
public final class SocialDataResetViewModel$fetchPnlRatioCurveData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $authorId;
    final /* synthetic */ int $timeSpan;
    int label;
    final /* synthetic */ tIH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialDataResetViewModel$fetchPnlRatioCurveData$2(tIH tih, String str, int i, Continuation<? super SocialDataResetViewModel$fetchPnlRatioCurveData$2> continuation) {
        super(2, continuation);
        this.this$0 = tih;
        this.$authorId = str;
        this.$timeSpan = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SocialDataResetViewModel$fetchPnlRatioCurveData$2(this.this$0, this.$authorId, this.$timeSpan, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SocialDataResetViewModel$fetchPnlRatioCurveData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            tBH tbh = this.this$0.valueOf;
            tBH.StateListAnimator stateListAnimator = new tBH.StateListAnimator(ProfileChartTypeDto.Pnl, C56443yFo.AEQbTJ(this.$timeSpan), PlanetAuthorId.KWHzl(this.$authorId), true, null);
            this.label = 1;
            obj = tbh.KWHzl(stateListAnimator, (Continuation) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        List list = (List) obj;
        ArrayList arrayList = new ArrayList();
        if (list.size() == 1) {
            arrayList.add(CollectionsKt___CollectionsKt.AuCTelauCTel(list));
            arrayList.add(CollectionsKt___CollectionsKt.AuCTelauCTel(list));
        } else {
            arrayList.addAll(list);
        }
        this.this$0.EZpvd.setValue(AbstractC46197tLk.Companion.KWHzl(arrayList));
        return Unit.INSTANCE;
    }
}
