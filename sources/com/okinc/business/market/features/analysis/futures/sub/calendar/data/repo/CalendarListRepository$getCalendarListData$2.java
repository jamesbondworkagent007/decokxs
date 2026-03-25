package com.okinc.business.market.features.analysis.futures.sub.calendar.data.repo;

import com.okinc.business.market.features.analysis.futures.sub.calendar.data.model.CalendarPo;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.jIS;
import o.jIY;

/* JADX INFO: loaded from: classes6.dex */
public final class CalendarListRepository$getCalendarListData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CalendarPo>, Object> {
    final /* synthetic */ String $dateTIme;
    final /* synthetic */ Integer $timezone;
    final /* synthetic */ String $uid;
    final /* synthetic */ String $valuationUnit;
    int label;
    final /* synthetic */ jIY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarListRepository$getCalendarListData$2(jIY jiy, String str, String str2, String str3, Integer num, Continuation<? super CalendarListRepository$getCalendarListData$2> continuation) {
        super(2, continuation);
        this.this$0 = jiy;
        this.$dateTIme = str;
        this.$valuationUnit = str2;
        this.$uid = str3;
        this.$timezone = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CalendarListRepository$getCalendarListData$2(this.this$0, this.$dateTIme, this.$valuationUnit, this.$uid, this.$timezone, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CalendarPo> continuation) {
        return ((CalendarListRepository$getCalendarListData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jIS jis = this.this$0.copydefault;
            String str = this.$dateTIme;
            String str2 = this.$valuationUnit;
            String str3 = this.$uid;
            Integer num = this.$timezone;
            this.label = 1;
            obj = jis.copydefault(str, str2, str3, num, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        List list = (List) ((ResponseData) obj).getData();
        if (list != null) {
            return (CalendarPo) CollectionsKt___CollectionsKt.firstOrNull(list);
        }
        return null;
    }
}
