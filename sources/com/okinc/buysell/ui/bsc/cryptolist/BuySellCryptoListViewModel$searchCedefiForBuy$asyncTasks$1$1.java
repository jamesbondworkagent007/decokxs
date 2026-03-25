package com.okinc.buysell.ui.bsc.cryptolist;

import com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListViewModel;
import com.okinc.network.okg.response.OKServerException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC31767mDd;
import o.lyD;

/* JADX INFO: loaded from: classes7.dex */
public final class BuySellCryptoListViewModel$searchCedefiForBuy$asyncTasks$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends Object, ? extends OKServerException>>, Object> {
    final /* synthetic */ BuySellCryptoListViewModel.SearchApiTask $apiTask;
    final /* synthetic */ String $searchKeyword;
    int label;
    final /* synthetic */ BuySellCryptoListViewModel this$0;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[BuySellCryptoListViewModel.SearchApiTask.values().length];
            try {
                iArr[BuySellCryptoListViewModel.SearchApiTask.CEFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BuySellCryptoListViewModel.SearchApiTask.DEX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuySellCryptoListViewModel$searchCedefiForBuy$asyncTasks$1$1(BuySellCryptoListViewModel.SearchApiTask searchApiTask, BuySellCryptoListViewModel buySellCryptoListViewModel, String str, Continuation<? super BuySellCryptoListViewModel$searchCedefiForBuy$asyncTasks$1$1> continuation) {
        super(2, continuation);
        this.$apiTask = searchApiTask;
        this.this$0 = buySellCryptoListViewModel;
        this.$searchKeyword = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuySellCryptoListViewModel$searchCedefiForBuy$asyncTasks$1$1(this.$apiTask, this.this$0, this.$searchKeyword, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends Object, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<? extends Object, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends Object, OKServerException>> continuation) {
        return ((BuySellCryptoListViewModel$searchCedefiForBuy$asyncTasks$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                return (AbstractC43419rot) obj;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return (AbstractC43419rot) obj;
        }
        C56391yDq.AEQbTJ(obj);
        int i2 = StateListAnimator.EZpvd[this.$apiTask.ordinal()];
        if (i2 == 1) {
            lyD lyd = this.this$0.djBIcL;
            this.label = 1;
            obj = lyd.copydefault(300, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            return (AbstractC43419rot) obj;
        }
        if (i2 == 2) {
            InterfaceC31767mDd interfaceC31767mDd = this.this$0.fARcdN;
            String str = this.$searchKeyword;
            this.label = 2;
            obj = InterfaceC31767mDd.Application.searchDexTokenList$default(interfaceC31767mDd, str, null, this, 2, null);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            return (AbstractC43419rot) obj;
        }
        throw new NoWhenBranchMatchedException();
    }
}
