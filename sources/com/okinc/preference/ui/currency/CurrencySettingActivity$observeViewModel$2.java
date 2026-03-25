package com.okinc.preference.ui.currency;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.preference.data.model.ValuationCurrencyBean;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C46548tYk;
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import o.tXC;
import o.tYG;
import o.tYO;

/* JADX INFO: loaded from: classes16.dex */
public final class CurrencySettingActivity$observeViewModel$2 extends SuspendLambda implements Function2<List<? extends C46548tYk<ValuationCurrencyBean>>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ tYG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrencySettingActivity$observeViewModel$2(tYG tyg, Continuation<? super CurrencySettingActivity$observeViewModel$2> continuation) {
        super(2, continuation);
        this.this$0 = tyg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CurrencySettingActivity$observeViewModel$2 currencySettingActivity$observeViewModel$2 = new CurrencySettingActivity$observeViewModel$2(this.this$0, continuation);
        currencySettingActivity$observeViewModel$2.L$0 = obj;
        return currencySettingActivity$observeViewModel$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends C46548tYk<ValuationCurrencyBean>> list, Continuation<? super Unit> continuation) {
        return invoke2((List<C46548tYk<ValuationCurrencyBean>>) list, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<C46548tYk<ValuationCurrencyBean>> list, Continuation<? super Unit> continuation) {
        return ((CurrencySettingActivity$observeViewModel$2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List list = (List) this.L$0;
            tXC txc = this.this$0.KWHzl;
            tYO tyo = null;
            if (txc == null) {
                Intrinsics.gEmmrt("");
                txc = null;
            }
            C55173xeu c55173xeu = txc.AhwBna;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(list.isEmpty() ? 0 : 8);
            tXC txc2 = this.this$0.KWHzl;
            if (txc2 == null) {
                Intrinsics.gEmmrt("");
                txc2 = null;
            }
            RecyclerView recyclerView = txc2.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility(list.isEmpty() ^ true ? 0 : 8);
            tYO tyo2 = this.this$0.OLrzqt;
            if (tyo2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                tyo = tyo2;
            }
            tyo.submitList(list);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
