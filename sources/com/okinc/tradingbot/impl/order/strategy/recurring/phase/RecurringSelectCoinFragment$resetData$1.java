package com.okinc.tradingbot.impl.order.strategy.recurring.phase;

import androidx.fragment.app.FragmentActivity;
import com.okinc.unify_trade.bot.data.SelectCoinData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C33054mpH;
import o.C33069mpW;
import o.C33070mpX;
import o.C48033uCm;
import o.C49952uyJ;
import o.C52794wYp;
import o.C55688xof;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.vTV;
import o.wYF;

/* JADX INFO: loaded from: classes19.dex */
public final class RecurringSelectCoinFragment$resetData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ vTV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringSelectCoinFragment$resetData$1(vTV vtv, Continuation<? super RecurringSelectCoinFragment$resetData$1> continuation) {
        super(2, continuation);
        this.this$0 = vtv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecurringSelectCoinFragment$resetData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecurringSelectCoinFragment$resetData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        } else {
            C56391yDq.AEQbTJ(obj);
            Iterator it = this.this$0.gEmmrt().iterator();
            while (it.hasNext()) {
                ((SelectCoinData) it.next()).setSelected(false);
            }
            ArrayList<SelectCoinData> arrayListGEmmrt = this.this$0.gEmmrt();
            vTV vtv = this.this$0;
            for (SelectCoinData selectCoinData : arrayListGEmmrt) {
                if (Intrinsics.EZpvd((Object) selectCoinData.getName(), (Object) vtv.OLrzqt)) {
                    selectCoinData.setSelected(true);
                }
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
            this.label = 1;
            if (BuildersKt.withContext(main, anonymousClass3, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.recurring.phase.RecurringSelectCoinFragment$resetData$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ vTV this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(vTV vtv, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = vtv;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C52794wYp c52794wYpCopydefault;
            C52794wYp c52794wYpAEQbTJ;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                FragmentActivity activity = this.this$0.getActivity();
                if (activity != null) {
                    C33054mpH.OLrzqt(activity, this.this$0.AhwBna().getRoot());
                }
                this.this$0.AhwBna().AEQbTJ.KWHzl().setText("");
                C49952uyJ.updateDataOrNoResult$default(this.this$0.copydefault(), this.this$0.gEmmrt(), C33070mpX.AYXKKw(C55688xof.Application.dXcUrg), 0, 4, null);
                wYF wyf = this.this$0.copydefault;
                if (wyf != null && (c52794wYpAEQbTJ = wyf.AEQbTJ()) != null) {
                    c52794wYpAEQbTJ.setEnabled(false);
                }
                wYF wyf2 = this.this$0.copydefault;
                if (wyf2 != null && (c52794wYpCopydefault = wyf2.copydefault()) != null) {
                    c52794wYpCopydefault.setEnabled(true);
                }
                wYF wyf3 = this.this$0.copydefault;
                if (wyf3 != null) {
                    wyf3.setPrimaryText(C33069mpW.copydefault(C48033uCm.Fragment.dPnHjp, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", "1"))));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
