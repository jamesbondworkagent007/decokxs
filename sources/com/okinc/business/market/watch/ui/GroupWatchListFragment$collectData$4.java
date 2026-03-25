package com.okinc.business.market.watch.ui;

import androidx.fragment.app.FragmentActivity;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.jSE;
import o.kKI;
import o.pUU;
import o.qZH;

/* JADX INFO: loaded from: classes7.dex */
public final class GroupWatchListFragment$collectData$4 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ kKI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupWatchListFragment$collectData$4(kKI kki, Continuation<? super GroupWatchListFragment$collectData$4> continuation) {
        super(2, continuation);
        this.this$0 = kki;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GroupWatchListFragment$collectData$4 groupWatchListFragment$collectData$4 = new GroupWatchListFragment$collectData$4(this.this$0, continuation);
        groupWatchListFragment$collectData$4.L$0 = obj;
        return groupWatchListFragment$collectData$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((GroupWatchListFragment$collectData$4) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        kKI kki;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = (String) this.L$0;
            pUU.KWHzl(this.this$0.getTAG(), " collect to select pendingTab: " + str);
            if (C33129mqd.OLrzqt((CharSequence) str)) {
                pUU.KWHzl(this.this$0.getTAG(), " try to select pendingTab: " + str);
                kKI kki2 = this.this$0;
                Result.Application application2 = Result.Companion;
                int iAEQbTJ = kki2.AEQbTJ(str);
                if (iAEQbTJ >= 0) {
                    pUU.KWHzl(kki2.getTAG(), "selected success pendingTab: " + str);
                    kKI.onSetViewPagerCurrentItem$default(kki2, iAEQbTJ, false, 2, null);
                    kki2.AkhnZx().AEQbTJ("");
                    this.L$0 = kki2;
                    this.label = 1;
                    if (DelayKt.delay(150L, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    kki = kki2;
                }
                Result.m7377constructorimpl(Unit.INSTANCE);
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kki = (kKI) this.L$0;
        C56391yDq.AEQbTJ(obj);
        FragmentActivity activity = kki.getActivity();
        if (activity != null) {
            jSE.showTip$default(jSE.EZpvd, activity, qZH.PendingIntent.zEHIKV, null, 0, 12, null);
        }
        Result.m7377constructorimpl(Unit.INSTANCE);
        return Unit.INSTANCE;
    }
}
