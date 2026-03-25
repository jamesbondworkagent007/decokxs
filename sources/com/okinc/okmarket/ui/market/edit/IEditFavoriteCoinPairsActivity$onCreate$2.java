package com.okinc.okmarket.ui.market.edit;

import android.view.View;
import com.okinc.okmarket.ui.market.edit.IEditFavoriteCoinPairsActivity$onCreate$2;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC46710tcM;
import o.AbstractC32943mnC;
import o.C46708tcK;
import o.C46709tcL;
import o.C52761wXj;
import o.C55237xgE;
import o.C55608xnE;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54577xNn;
import o.pWO;
import o.qZG;

/* JADX INFO: loaded from: classes19.dex */
public final class IEditFavoriteCoinPairsActivity$onCreate$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AbstractActivityC46710tcM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IEditFavoriteCoinPairsActivity$onCreate$2(AbstractActivityC46710tcM abstractActivityC46710tcM, Continuation<? super IEditFavoriteCoinPairsActivity$onCreate$2> continuation) {
        super(2, continuation);
        this.this$0 = abstractActivityC46710tcM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IEditFavoriteCoinPairsActivity$onCreate$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IEditFavoriteCoinPairsActivity$onCreate$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54577xNn interfaceC54577xNnKWHzl = pWO.KWHzl();
            AbstractActivityC46710tcM abstractActivityC46710tcM = this.this$0;
            this.label = 1;
            if (C55608xnE.AEQbTJ(interfaceC54577xNnKWHzl, abstractActivityC46710tcM, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractActivityC46710tcM abstractActivityC46710tcM2 = this.this$0;
        C46709tcL c46709tcL = new C46709tcL();
        c46709tcL.AEQbTJ(this.this$0.copydefault());
        abstractActivityC46710tcM2.djBIcL = c46709tcL;
        C46709tcL c46709tcL2 = this.this$0.djBIcL;
        if (c46709tcL2 != null) {
            AbstractActivityC46710tcM abstractActivityC46710tcM3 = this.this$0;
            qZG qzg = abstractActivityC46710tcM3.OLrzqt;
            if (qzg == null) {
                Intrinsics.gEmmrt("");
                qzg = null;
            }
            c46709tcL2.observe(abstractActivityC46710tcM3, new AnonymousClass2(this.this$0, qzg.djBIcL, this.this$0.djBIcL, C52761wXj.FragmentManager.fIwbmz));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.okmarket.ui.market.edit.IEditFavoriteCoinPairsActivity$onCreate$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC32943mnC<C46708tcK> {
        public final /* synthetic */ AbstractActivityC46710tcM OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AbstractActivityC46710tcM abstractActivityC46710tcM, C55237xgE c55237xgE, C46709tcL c46709tcL, int i) {
            super(c55237xgE, c46709tcL, i);
            this.OLrzqt = abstractActivityC46710tcM;
        }

        public static final void OLrzqt(AbstractActivityC46710tcM abstractActivityC46710tcM, List list) {
            abstractActivityC46710tcM.OLrzqt((List<C46708tcK>) list);
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void AEQbTJ(final List<C46708tcK> list, View view) {
            Intrinsics.checkNotNullParameter(list, "");
            final AbstractActivityC46710tcM abstractActivityC46710tcM = this.OLrzqt;
            abstractActivityC46710tcM.postDelay(new Runnable() { // from class: o.tdg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    IEditFavoriteCoinPairsActivity$onCreate$2.AnonymousClass2.OLrzqt(abstractActivityC46710tcM, list);
                }
            }, 10L);
        }
    }
}
