package com.okinc.im.imui.preview;

import com.okinc.im.imui.preview.IMMediaPagerActivity$initViewModel$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC37218opg;
import o.C37186opA;
import o.C37228opq;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.pUU;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class IMMediaPagerActivity$initViewModel$1 extends SuspendLambda implements yHO<CoroutineScope, List<? extends C37186opA>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC37218opg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IMMediaPagerActivity$initViewModel$1(ActivityC37218opg activityC37218opg, Continuation<? super IMMediaPagerActivity$initViewModel$1> continuation) {
        super(3, continuation);
        this.this$0 = activityC37218opg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, List<? extends C37186opA> list, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (List<C37186opA>) list, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, List<C37186opA> list, Continuation<? super Unit> continuation) {
        IMMediaPagerActivity$initViewModel$1 iMMediaPagerActivity$initViewModel$1 = new IMMediaPagerActivity$initViewModel$1(this.this$0, continuation);
        iMMediaPagerActivity$initViewModel$1.L$0 = list;
        return iMMediaPagerActivity$initViewModel$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            final List<C37186opA> list = (List) this.L$0;
            String tag = this.this$0.getTAG();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (C37186opA c37186opA : list) {
                arrayList.add(c37186opA.OLrzqt().KWHzl().getSeq() + "[" + c37186opA.copydefault() + "]");
            }
            pUU.EZpvd(tag, "pagerList: " + arrayList);
            List<C37186opA> currentList = this.this$0.djBIcL().getCurrentList();
            Intrinsics.checkNotNullExpressionValue(currentList, "");
            final C37186opA c37186opA2 = (C37186opA) CollectionsKt___CollectionsKt.AkhnZx(currentList, this.this$0.fARcdN().getCurrentItem());
            C37228opq c37228opqDjBIcL = this.this$0.djBIcL();
            final ActivityC37218opg activityC37218opg = this.this$0;
            c37228opqDjBIcL.submitList(list, new Runnable() { // from class: o.opm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    IMMediaPagerActivity$initViewModel$1.invokeSuspend$lambda$2(c37186opA2, list, activityC37218opg);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(C37186opA c37186opA, List list, ActivityC37218opg activityC37218opg) {
        if (c37186opA != null) {
            int iIndexOf = list.indexOf(c37186opA);
            if (iIndexOf == -1 || iIndexOf == activityC37218opg.fARcdN().getCurrentItem()) {
                return;
            }
            activityC37218opg.fARcdN().setCurrentItem(iIndexOf, false);
            activityC37218opg.valueOf().copydefault(iIndexOf);
            return;
        }
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((C37186opA) it.next()).OLrzqt().KWHzl().getSeq() == activityC37218opg.gEmmrt().getSeq()) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            activityC37218opg.fARcdN().setCurrentItem(i, false);
            activityC37218opg.valueOf().copydefault(i);
        }
    }
}
