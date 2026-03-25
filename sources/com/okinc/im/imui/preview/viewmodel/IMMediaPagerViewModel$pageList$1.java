package com.okinc.im.imui.preview.viewmodel;

import com.okinc.im.imui.preview.model.ImageState;
import com.okinc.im.imui.preview.model.PagerState;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C37186opA;
import o.C37233opv;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.yDY;
import o.yHT;

/* JADX INFO: loaded from: classes8.dex */
public final class IMMediaPagerViewModel$pageList$1 extends SuspendLambda implements yHT<List<? extends C37233opv>, PagerState, Map<Long, ? extends ImageState>, Continuation<? super List<? extends C37186opA>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ IMMediaPagerViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IMMediaPagerViewModel$pageList$1(IMMediaPagerViewModel iMMediaPagerViewModel, Continuation<? super IMMediaPagerViewModel$pageList$1> continuation) {
        super(4, continuation);
        this.this$0 = iMMediaPagerViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHT
    public /* bridge */ /* synthetic */ Object invoke(List<? extends C37233opv> list, PagerState pagerState, Map<Long, ? extends ImageState> map, Continuation<? super List<? extends C37186opA>> continuation) {
        return invoke2((List<C37233opv>) list, pagerState, (Map<Long, ImageState>) map, (Continuation<? super List<C37186opA>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<C37233opv> list, PagerState pagerState, Map<Long, ImageState> map, Continuation<? super List<C37186opA>> continuation) {
        IMMediaPagerViewModel$pageList$1 iMMediaPagerViewModel$pageList$1 = new IMMediaPagerViewModel$pageList$1(this.this$0, continuation);
        iMMediaPagerViewModel$pageList$1.L$0 = list;
        iMMediaPagerViewModel$pageList$1.L$1 = pagerState;
        iMMediaPagerViewModel$pageList$1.L$2 = map;
        return iMMediaPagerViewModel$pageList$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List list = (List) this.L$0;
            PagerState pagerState = (PagerState) this.L$1;
            Map map = (Map) this.L$2;
            IMMediaPagerViewModel iMMediaPagerViewModel = this.this$0;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            int i = 0;
            for (Object obj2 : list) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                C37233opv c37233opv = (C37233opv) obj2;
                arrayList.add(new C37186opA(c37233opv, pagerState, (ImageState) map.get(C56443yFo.KWHzl(c37233opv.KWHzl().getSeq())), i == iMMediaPagerViewModel.AhwBna()));
                i++;
            }
            return arrayList;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
