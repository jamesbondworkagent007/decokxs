package com.okinc.buysell.domain;

import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean;
import com.okinc.crcore.shared.net.responsebean.CurrencySuggestionPairsBean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC31670lzr;
import o.lyK;
import o.lyZ;
import o.mCZ;

/* JADX INFO: loaded from: classes7.dex */
public final class GetPairSuggestionUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CurrencySuggestionPairsBean>, Object> {
    final /* synthetic */ boolean $applyCachePolicy;
    final /* synthetic */ String $symbol;
    final /* synthetic */ String $valuationUnit;
    int label;
    final /* synthetic */ lyZ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPairSuggestionUseCase$invoke$2(String str, boolean z, lyZ lyz, String str2, Continuation<? super GetPairSuggestionUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$symbol = str;
        this.$applyCachePolicy = z;
        this.this$0 = lyz;
        this.$valuationUnit = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetPairSuggestionUseCase$invoke$2(this.$symbol, this.$applyCachePolicy, this.this$0, this.$valuationUnit, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CurrencySuggestionPairsBean> continuation) {
        return ((GetPairSuggestionUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    C56391yDq.AEQbTJ(obj);
                    return (CurrencySuggestionPairsBean) ((AbstractC43419rot) obj).AEQbTJ();
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return (CurrencySuggestionPairsBean) ((AbstractC43419rot) obj).AEQbTJ();
            }
            C56391yDq.AEQbTJ(obj);
            String str = this.$symbol;
            String str2 = (str == null || str.length() <= 0) ? null : str;
            boolean z = (((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).AYXKKw() ^ true) && !((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).AhwBna();
            if (this.$applyCachePolicy) {
                mCZ mcz = this.this$0.KWHzl;
                Integer numAEQbTJ = C56443yFo.AEQbTJ(5);
                Integer numAEQbTJ2 = C56443yFo.AEQbTJ(0);
                String str3 = this.$valuationUnit;
                Integer numAEQbTJ3 = C56443yFo.AEQbTJ(1);
                Boolean boolKWHzl = C56443yFo.KWHzl(z);
                this.label = 1;
                obj = mcz.copydefault("FIRST_CACHE", numAEQbTJ, str2, numAEQbTJ2, str3, numAEQbTJ3, boolKWHzl, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                return (CurrencySuggestionPairsBean) ((AbstractC43419rot) obj).AEQbTJ();
            }
            mCZ mcz2 = this.this$0.KWHzl;
            Integer numAEQbTJ4 = C56443yFo.AEQbTJ(0);
            Integer numAEQbTJ5 = C56443yFo.AEQbTJ(0);
            String str4 = this.$valuationUnit;
            Integer numAEQbTJ6 = C56443yFo.AEQbTJ(1);
            Boolean boolKWHzl2 = C56443yFo.KWHzl(z);
            this.label = 2;
            obj = mcz2.copydefault("NO_CACHE", numAEQbTJ4, str2, numAEQbTJ5, str4, numAEQbTJ6, boolKWHzl2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            return (CurrencySuggestionPairsBean) ((AbstractC43419rot) obj).AEQbTJ();
        } catch (Exception unused) {
            CurrencySuggestionPairsBean currencySuggestionPairsBean = new CurrencySuggestionPairsBean((ConvertCurrencyBean) null, (ConvertCurrencyBean) null, 3, (DefaultConstructorMarker) null);
            Pair<ConvertCurrencyBean, ConvertCurrencyBean> pairOLrzqt = lyK.copydefault.OLrzqt();
            currencySuggestionPairsBean.setFrom(pairOLrzqt.getFirst());
            currencySuggestionPairsBean.setTo(pairOLrzqt.getSecond());
            return currencySuggestionPairsBean;
        }
    }
}
