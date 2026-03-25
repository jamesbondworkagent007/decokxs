package com.okinc.okmarket.ui.market.remind.fragment;

import com.okinc.market.ticker.model.DexTickerPo;
import com.okinc.okmarket.ui.market.remind.data.model.TokenPriceResponse;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C33129mqd;
import o.C46806teC;
import o.C46854tey;
import o.C56390yDp;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class PriceEditViewModel$subDexMarketPrice$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenAddress;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PriceEditViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceEditViewModel$subDexMarketPrice$1(PriceEditViewModel priceEditViewModel, String str, String str2, Continuation<? super PriceEditViewModel$subDexMarketPrice$1> continuation) {
        super(2, continuation);
        this.this$0 = priceEditViewModel;
        this.$chainId = str;
        this.$tokenAddress = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PriceEditViewModel$subDexMarketPrice$1 priceEditViewModel$subDexMarketPrice$1 = new PriceEditViewModel$subDexMarketPrice$1(this.this$0, this.$chainId, this.$tokenAddress, continuation);
        priceEditViewModel$subDexMarketPrice$1.L$0 = obj;
        return priceEditViewModel$subDexMarketPrice$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PriceEditViewModel$subDexMarketPrice$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        String str;
        PriceEditViewModel priceEditViewModel;
        String str2;
        Activity activity;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            PriceEditViewModel priceEditViewModel2 = this.this$0;
            String str3 = this.$chainId;
            str = this.$tokenAddress;
            Result.Application application2 = Result.Companion;
            C46854tey c46854tey = priceEditViewModel2.AYXKKw;
            Pair pairOLrzqt = C56390yDp.OLrzqt(str3, str);
            this.L$0 = priceEditViewModel2;
            this.L$1 = str3;
            this.L$2 = str;
            this.label = 1;
            Object objEZpvd = c46854tey.EZpvd(pairOLrzqt, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            priceEditViewModel = priceEditViewModel2;
            obj = objEZpvd;
            str2 = str3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        pUU.copydefault("PriceEditViewModel", "subDexMarketPrice fail: " + thM7380exceptionOrNullimpl);
                    }
                    return Unit.INSTANCE;
                }
                priceEditViewModel = (PriceEditViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                activity = new Activity(priceEditViewModel);
                this.L$0 = null;
                this.label = 3;
                if (((Flow) obj).collect(activity, this) == objCopydefault) {
                    return objCopydefault;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            String str4 = (String) this.L$2;
            str2 = (String) this.L$1;
            PriceEditViewModel priceEditViewModel3 = (PriceEditViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            str = str4;
            priceEditViewModel = priceEditViewModel3;
        }
        TokenPriceResponse tokenPriceResponse = (TokenPriceResponse) obj;
        priceEditViewModel.AEQbTJ.setValue(C33129mqd.gEmmrt(tokenPriceResponse != null ? C56443yFo.AEQbTJ(tokenPriceResponse.getPrice()) : null));
        C46806teC c46806teC = priceEditViewModel.EZpvd;
        List listEZpvd = C56402yEa.EZpvd(C56390yDp.OLrzqt(str2, str));
        this.L$0 = priceEditViewModel;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
        obj = c46806teC.EZpvd(listEZpvd, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        activity = new Activity(priceEditViewModel);
        this.L$0 = null;
        this.label = 3;
        if (((Flow) obj).collect(activity, this) == objCopydefault) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    public static final class Activity<T> implements FlowCollector {
        public final /* synthetic */ PriceEditViewModel copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(PriceEditViewModel priceEditViewModel) {
            this.copydefault = priceEditViewModel;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final Object emit(DexTickerPo dexTickerPo, Continuation<? super Unit> continuation) {
            this.copydefault.AEQbTJ.setValue(dexTickerPo.getPrice());
            return Unit.INSTANCE;
        }
    }
}
