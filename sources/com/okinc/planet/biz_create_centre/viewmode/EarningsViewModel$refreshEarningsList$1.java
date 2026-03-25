package com.okinc.planet.biz_create_centre.viewmode;

import com.okinc.planet.biz_create_centre.data.EarningsHistoryInfo;
import com.okinc.uilab.stateful.StatefulView;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C46392tSq;
import o.C47773twT;
import o.C47778twY;
import o.C47855txw;
import o.C47857txy;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes19.dex */
public final class EarningsViewModel$refreshEarningsList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C47855txw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarningsViewModel$refreshEarningsList$1(C47855txw c47855txw, Continuation<? super EarningsViewModel$refreshEarningsList$1> continuation) {
        super(2, continuation);
        this.this$0 = c47855txw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EarningsViewModel$refreshEarningsList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EarningsViewModel$refreshEarningsList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0057 A[Catch: all -> 0x00fb, Exception -> 0x00fd, TryCatch #0 {Exception -> 0x00fd, blocks: (B:6:0x0011, B:19:0x0043, B:21:0x0057, B:23:0x0085, B:25:0x00b0, B:24:0x009e, B:26:0x00de, B:10:0x001d, B:16:0x002f, B:13:0x0024), top: B:36:0x000b, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00de A[Catch: all -> 0x00fb, Exception -> 0x00fd, TRY_LEAVE, TryCatch #0 {Exception -> 0x00fd, blocks: (B:6:0x0011, B:19:0x0043, B:21:0x0057, B:23:0x0085, B:25:0x00b0, B:24:0x009e, B:26:0x00de, B:10:0x001d, B:16:0x002f, B:13:0x0024), top: B:36:0x000b, outer: #1 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        EarningsHistoryInfo earningsHistoryInfo;
        C47857txy c47857txy;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            try {
            } catch (Exception e) {
                this.this$0.KWHzl().setValue(new C47857txy(StatefulView.Status.Error, yDY.AhwBna(), null, true, -1));
                pUU.AEQbTJ("EarningsViewModel", "Error loading earnings history", e);
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C46392tSq c46392tSq = C46392tSq.EZpvd;
                this.label = 1;
                if (c46392tSq.AEQbTJ(this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    Pair pair = (Pair) obj;
                    earningsHistoryInfo = (EarningsHistoryInfo) pair.component1();
                    int iIntValue = ((Number) pair.component2()).intValue();
                    if (earningsHistoryInfo == null) {
                        this.this$0.KWHzl = earningsHistoryInfo.getNextCursor();
                        this.this$0.AYXKKw().setValue(earningsHistoryInfo.getTotalPaidOutUsd());
                        ArrayList arrayListOLrzqt = this.this$0.OLrzqt(earningsHistoryInfo.getHistory(), earningsHistoryInfo.getTotalPaidOutUsd());
                        if (earningsHistoryInfo.getHistory().isEmpty()) {
                            arrayListOLrzqt.add(new C47773twT(null, 1, null));
                            c47857txy = new C47857txy(StatefulView.Status.Content, arrayListOLrzqt, null, true, 0, 16, null);
                        } else {
                            c47857txy = new C47857txy(StatefulView.Status.Content, arrayListOLrzqt, earningsHistoryInfo.getNextCursor(), true, 0, 16, null);
                        }
                        this.this$0.KWHzl().setValue(c47857txy);
                        pUU.EZpvd("EarningsViewModel", "Earnings history refreshed: " + arrayListOLrzqt.size() + " items, nextCursor: " + earningsHistoryInfo.getNextCursor());
                    } else {
                        this.this$0.KWHzl().setValue(new C47857txy(StatefulView.Status.Error, yDY.AhwBna(), null, true, iIntValue));
                        pUU.copydefault("EarningsViewModel", "Failed to load earnings history");
                    }
                    this.this$0.AEQbTJ = false;
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
            }
            C47778twY c47778twY = this.this$0.OLrzqt;
            this.label = 2;
            obj = c47778twY.KWHzl(0L, 10L, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            Pair pair2 = (Pair) obj;
            earningsHistoryInfo = (EarningsHistoryInfo) pair2.component1();
            int iIntValue2 = ((Number) pair2.component2()).intValue();
            if (earningsHistoryInfo == null) {
            }
            this.this$0.AEQbTJ = false;
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.this$0.AEQbTJ = false;
            throw th;
        }
    }
}
