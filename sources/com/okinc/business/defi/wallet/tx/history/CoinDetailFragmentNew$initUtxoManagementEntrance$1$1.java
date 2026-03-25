package com.okinc.business.defi.wallet.tx.history;

import android.view.View;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC16521elW;
import o.C10525bqB;
import o.C13934dbu;
import o.C19465gDj;
import o.C55296xhK;
import o.C56391yDq;
import o.C56442yFn;
import o.gFH;

/* JADX INFO: loaded from: classes5.dex */
public final class CoinDetailFragmentNew$initUtxoManagementEntrance$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ gFH $event;
    int label;
    final /* synthetic */ CoinDetailFragmentNew this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinDetailFragmentNew$initUtxoManagementEntrance$1$1(CoinDetailFragmentNew coinDetailFragmentNew, gFH gfh, Continuation<? super CoinDetailFragmentNew$initUtxoManagementEntrance$1$1> continuation) {
        super(2, continuation);
        this.this$0 = coinDetailFragmentNew;
        this.$event = gfh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoinDetailFragmentNew$initUtxoManagementEntrance$1$1(this.this$0, this.$event, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CoinDetailFragmentNew$initUtxoManagementEntrance$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ CoinDetailFragmentNew AEQbTJ;
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ gFH KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(View view, long j, CoinDetailFragmentNew coinDetailFragmentNew, gFH gfh) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = coinDetailFragmentNew;
            this.KWHzl = gfh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MutableLiveData<C10525bqB> mutableLiveDataOLrzqt;
            C10525bqB value;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                AbstractC16521elW abstractC16521elW = this.AEQbTJ.AYXKKw;
                if (abstractC16521elW == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW = null;
                }
                C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
                if (c19465gDjAEQbTJ != null && (mutableLiveDataOLrzqt = c19465gDjAEQbTJ.OLrzqt()) != null && (value = mutableLiveDataOLrzqt.getValue()) != null) {
                    this.AEQbTJ.copydefault.OLrzqt("UTXO", value);
                }
                CoinDetailFragmentNew coinDetailFragmentNew = this.AEQbTJ;
                FragmentActivity fragmentActivityRequireActivity = coinDetailFragmentNew.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                coinDetailFragmentNew.AEQbTJ(fragmentActivityRequireActivity, this.AEQbTJ.zLjUOn(), this.KWHzl.copydefault());
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C13934dbu c13934dbu = new C13934dbu();
            String strZLjUOn = this.this$0.zLjUOn();
            long jCopydefault = this.$event.copydefault();
            this.label = 1;
            obj = c13934dbu.OLrzqt(strZLjUOn, jCopydefault, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        AbstractC16521elW abstractC16521elW = this.this$0.AYXKKw;
        AbstractC16521elW abstractC16521elW2 = null;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        TextView textView = abstractC16521elW.zuBGHE;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(zBooleanValue ? 0 : 8);
        if (zBooleanValue) {
            AbstractC16521elW abstractC16521elW3 = this.this$0.AYXKKw;
            if (abstractC16521elW3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW3 = null;
            }
            abstractC16521elW3.zuBGHE.setEnabled(true);
            AbstractC16521elW abstractC16521elW4 = this.this$0.AYXKKw;
            if (abstractC16521elW4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16521elW2 = abstractC16521elW4;
            }
            TextView textView2 = abstractC16521elW2.zuBGHE;
            textView2.setOnClickListener(new TaskDescription(textView2, 1000L, this.this$0, this.$event));
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
