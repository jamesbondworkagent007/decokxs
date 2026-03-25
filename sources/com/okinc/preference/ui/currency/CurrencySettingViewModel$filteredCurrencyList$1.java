package com.okinc.preference.ui.currency;

import com.okinc.preference.data.model.ValuationCurrencyBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.StringsKt__StringsKt;
import o.C46548tYk;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.yHT;

/* JADX INFO: loaded from: classes11.dex */
public final class CurrencySettingViewModel$filteredCurrencyList$1 extends SuspendLambda implements yHT<List<? extends ValuationCurrencyBean>, String, Integer, Continuation<? super List<? extends C46548tYk<ValuationCurrencyBean>>>, Object> {
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CurrencySettingViewModel$filteredCurrencyList$1(Continuation<? super CurrencySettingViewModel$filteredCurrencyList$1> continuation) {
        super(4, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHT
    public /* synthetic */ Object invoke(List<? extends ValuationCurrencyBean> list, String str, Integer num, Continuation<? super List<? extends C46548tYk<ValuationCurrencyBean>>> continuation) {
        return invoke((List<ValuationCurrencyBean>) list, str, num.intValue(), (Continuation<? super List<C46548tYk<ValuationCurrencyBean>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(List<ValuationCurrencyBean> list, String str, int i, Continuation<? super List<C46548tYk<ValuationCurrencyBean>>> continuation) {
        CurrencySettingViewModel$filteredCurrencyList$1 currencySettingViewModel$filteredCurrencyList$1 = new CurrencySettingViewModel$filteredCurrencyList$1(continuation);
        currencySettingViewModel$filteredCurrencyList$1.L$0 = list;
        currencySettingViewModel$filteredCurrencyList$1.L$1 = str;
        currencySettingViewModel$filteredCurrencyList$1.I$0 = i;
        return currencySettingViewModel$filteredCurrencyList$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List<ValuationCurrencyBean> list = (List) this.L$0;
            String str = (String) this.L$1;
            int i = this.I$0;
            if (str.length() != 0) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    ValuationCurrencyBean valuationCurrencyBean = (ValuationCurrencyBean) obj2;
                    if (StringsKt__StringsKt.AhwBna((CharSequence) valuationCurrencyBean.getDisplayName(), (CharSequence) str, true) || StringsKt__StringsKt.AhwBna((CharSequence) valuationCurrencyBean.getIsoCode(), (CharSequence) str, true)) {
                        arrayList.add(obj2);
                    }
                }
                list = arrayList;
            }
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (ValuationCurrencyBean valuationCurrencyBean2 : list) {
                arrayList2.add(new C46548tYk(i == valuationCurrencyBean2.getCurrencyId(), valuationCurrencyBean2));
            }
            return arrayList2;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
