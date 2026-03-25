package com.okinc.business.market.features.analysis.futures.root;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.market.features.analysis.futures.root.FuturesAnalysisRootFragment$showAccountSortDialog$1;
import com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C25852jIt;
import o.C33070mpX;
import o.C55276xgr;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.jHT;
import o.qXX;
import o.qZH;

/* JADX INFO: loaded from: classes18.dex */
public final class FuturesAnalysisRootFragment$showAccountSortDialog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ C25852jIt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAnalysisRootFragment$showAccountSortDialog$1(C25852jIt c25852jIt, Continuation<? super FuturesAnalysisRootFragment$showAccountSortDialog$1> continuation) {
        super(2, continuation);
        this.this$0 = c25852jIt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesAnalysisRootFragment$showAccountSortDialog$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuturesAnalysisRootFragment$showAccountSortDialog$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060 A[LOOP:0: B:18:0x005a->B:20:0x0060, LOOP_END] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FuturesAnalysisViewModel futuresAnalysisViewModelFARcdN = this.this$0.fARcdN();
            this.label = 1;
            obj = futuresAnalysisViewModelFARcdN.AEQbTJ(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                Iterable<jHT> iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
                for (jHT jht : iterable) {
                    arrayList.add(new C55276xgr(jht.AEQbTJ(), jht.EZpvd(), null, Intrinsics.EZpvd((Object) jht.EZpvd(), (Object) str), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
                }
                final qXX qxx = new qXX(arrayList, C33070mpX.AYXKKw(qZH.PendingIntent.QDqgQU));
                final C25852jIt c25852jIt = this.this$0;
                qxx.OLrzqt(new Function1() { // from class: o.jIA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return FuturesAnalysisRootFragment$showAccountSortDialog$1.invokeSuspend$lambda$2$lambda$1(qxx, c25852jIt, (C55276xgr) obj2);
                    }
                });
                FragmentManager childFragmentManager = this.this$0.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                qxx.show(childFragmentManager);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        String str2 = (String) obj;
        FuturesAnalysisViewModel futuresAnalysisViewModelFARcdN2 = this.this$0.fARcdN();
        this.L$0 = str2;
        this.label = 2;
        Object objKWHzl = futuresAnalysisViewModelFARcdN2.KWHzl(this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        str = str2;
        obj = objKWHzl;
        Iterable<jHT> iterable2 = (Iterable) obj;
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(iterable2, 10));
        while (r14.hasNext()) {
        }
        final qXX qxx2 = new qXX(arrayList2, C33070mpX.AYXKKw(qZH.PendingIntent.QDqgQU));
        final C25852jIt c25852jIt2 = this.this$0;
        qxx2.OLrzqt(new Function1() { // from class: o.jIA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return FuturesAnalysisRootFragment$showAccountSortDialog$1.invokeSuspend$lambda$2$lambda$1(qxx2, c25852jIt2, (C55276xgr) obj2);
            }
        });
        FragmentManager childFragmentManager2 = this.this$0.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
        qxx2.show(childFragmentManager2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2$lambda$1(qXX qxx, C25852jIt c25852jIt, C55276xgr c55276xgr) {
        Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
        String str = objOLrzqt instanceof String ? (String) objOLrzqt : null;
        if (str == null) {
            return Unit.INSTANCE;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(qxx), null, null, new FuturesAnalysisRootFragment$showAccountSortDialog$1$1$1$1(c25852jIt, str, null), 3, null);
        qxx.dismiss();
        return Unit.INSTANCE;
    }
}
