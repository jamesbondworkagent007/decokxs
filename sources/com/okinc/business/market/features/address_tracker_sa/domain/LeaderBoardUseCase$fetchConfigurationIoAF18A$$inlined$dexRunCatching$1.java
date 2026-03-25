package com.okinc.business.market.features.address_tracker_sa.domain;

import com.okinc.business.market.common.constants.RankingSortType;
import com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.jBA;
import o.jBC;
import o.jBD;
import o.jBF;
import o.jBL;
import o.jBZ;
import o.pUU;
import o.yDY;

/* JADX INFO: renamed from: com.okinc.business.market.features.address_tracker_sa.domain.LeaderBoardUseCase$fetchConfiguration-IoAF18A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class LeaderBoardUseCase$fetchConfigurationIoAF18A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends jBF>>>, Object> {
    int label;
    final /* synthetic */ jBD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderBoardUseCase$fetchConfigurationIoAF18A$$inlined$dexRunCatching$1(Continuation continuation, jBD jbd) {
        super(2, continuation);
        this.this$0 = jbd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LeaderBoardUseCase$fetchConfigurationIoAF18A$$inlined$dexRunCatching$1(continuation, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends jBF>>> continuation) {
        return ((LeaderBoardUseCase$fetchConfigurationIoAF18A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objOLrzqt;
        List listAhwBna;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                jBZ jbz = this.this$0.KWHzl;
                this.label = 1;
                objOLrzqt = jbz.OLrzqt(this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = obj;
            }
            jBC jbc = (jBC) ((AbstractC43419rot) objOLrzqt).AEQbTJ();
            jBL jbl = jBL.EZpvd;
            List<LeaderBoardSortModel> listAEQbTJ = jbl.AEQbTJ();
            List<LeaderBoardSortModel> listEZpvd = jbl.EZpvd();
            List<Integer> listOLrzqt = jbc.OLrzqt();
            int i2 = 10;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
            Iterator<T> it = listOLrzqt.iterator();
            while (it.hasNext()) {
                String strValueOf = String.valueOf(((Number) it.next()).intValue());
                List<jBA> list = jbc.copydefault().get(strValueOf);
                if (list != null) {
                    listAhwBna = new ArrayList(C56403yEb.AYXKKw(list, i2));
                    for (jBA jba : list) {
                        listAhwBna.add(new LeaderBoardSortModel(jba.EZpvd(), jba.OLrzqt(), null, false, RankingSortType.CATEGORY, 12, null));
                    }
                } else {
                    listAhwBna = yDY.AhwBna();
                }
                arrayList.add(new jBF(strValueOf, listAhwBna, listAEQbTJ, listEZpvd));
                i2 = 10;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(arrayList);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
