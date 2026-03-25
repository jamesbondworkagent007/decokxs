package com.okinc.business.market.features.meme.filter.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import o.C28667kfB;
import o.C28757kgm;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC28823khz;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeFilterBottomSheet$onFooterCreated$buttonEnabledFlow$1 extends SuspendLambda implements yHO<C28667kfB, List<? extends InterfaceC28823khz.ActionBar>, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ C28757kgm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeFilterBottomSheet$onFooterCreated$buttonEnabledFlow$1(C28757kgm c28757kgm, Continuation<? super MemeFilterBottomSheet$onFooterCreated$buttonEnabledFlow$1> continuation) {
        super(3, continuation);
        this.this$0 = c28757kgm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(C28667kfB c28667kfB, List<? extends InterfaceC28823khz.ActionBar> list, Continuation<? super Boolean> continuation) {
        return invoke2(c28667kfB, (List<InterfaceC28823khz.ActionBar>) list, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C28667kfB c28667kfB, List<InterfaceC28823khz.ActionBar> list, Continuation<? super Boolean> continuation) {
        MemeFilterBottomSheet$onFooterCreated$buttonEnabledFlow$1 memeFilterBottomSheet$onFooterCreated$buttonEnabledFlow$1 = new MemeFilterBottomSheet$onFooterCreated$buttonEnabledFlow$1(this.this$0, continuation);
        memeFilterBottomSheet$onFooterCreated$buttonEnabledFlow$1.L$0 = c28667kfB;
        memeFilterBottomSheet$onFooterCreated$buttonEnabledFlow$1.L$1 = list;
        return memeFilterBottomSheet$onFooterCreated$buttonEnabledFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C28667kfB c28667kfB = (C28667kfB) this.L$0;
            List list = (List) this.L$1;
            boolean zCopydefault = c28667kfB.copydefault();
            boolean zOLrzqt = c28667kfB.OLrzqt();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((InterfaceC28823khz.ActionBar) obj2).EZpvd()) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((InterfaceC28823khz.ActionBar) it.next()).OLrzqt());
            }
            boolean zEZpvd = Intrinsics.EZpvd(arrayList2, this.this$0.isConnected().uzCIH());
            boolean z = true;
            if (!(!arrayList2.isEmpty()) || !(!zCopydefault) || (!(!zEZpvd) && !zOLrzqt && this.this$0.gEmmrt().AEQbTJ())) {
                z = false;
            }
            return C56443yFo.KWHzl(z);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
