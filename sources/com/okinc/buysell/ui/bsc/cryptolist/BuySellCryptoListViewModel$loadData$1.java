package com.okinc.buysell.ui.bsc.cryptolist;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListFragment;
import com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListViewModel;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC31905mIg;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54577xNn;
import o.mHA;
import o.pWO;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class BuySellCryptoListViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $hasNetwork;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ boolean $shouldShowLoading;
    int label;
    final /* synthetic */ BuySellCryptoListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuySellCryptoListViewModel$loadData$1(BuySellCryptoListViewModel buySellCryptoListViewModel, boolean z, boolean z2, LifecycleOwner lifecycleOwner, Continuation<? super BuySellCryptoListViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = buySellCryptoListViewModel;
        this.$shouldShowLoading = z;
        this.$hasNetwork = z2;
        this.$lifecycleOwner = lifecycleOwner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuySellCryptoListViewModel$loadData$1(this.this$0, this.$shouldShowLoading, this.$hasNetwork, this.$lifecycleOwner, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BuySellCryptoListViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8790ensureInitialize0E7RQCE$default;
        BuySellCryptoListViewModel.ApiTask apiTask;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54577xNn interfaceC54577xNnKWHzl = pWO.KWHzl();
            this.label = 1;
            objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNnKWHzl, false, null, this, 3, null);
            if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objM8790ensureInitialize0E7RQCE$default = ((Result) obj).m7386unboximpl();
        }
        if (!Result.m7384isSuccessimpl(objM8790ensureInitialize0E7RQCE$default)) {
            mHA.OLrzqt.OLrzqt(this.this$0.valueOf, new AbstractC31905mIg.TaskDescription("Failed to initialize trade manager", null, null, 6, null));
        } else {
            BuySellCryptoListViewModel.ApiTask[] apiTaskArr = new BuySellCryptoListViewModel.ApiTask[2];
            if (this.this$0.AhwBna() == BuySellCryptoListFragment.Companion.ListType.BUY) {
                apiTask = BuySellCryptoListViewModel.ApiTask.BUY;
            } else {
                apiTask = BuySellCryptoListViewModel.ApiTask.SELL;
            }
            apiTaskArr[0] = apiTask;
            apiTaskArr[1] = BuySellCryptoListViewModel.ApiTask.UK_WARNING;
            List listAhwBna = yDY.AhwBna(apiTaskArr);
            BuySellCryptoListViewModel buySellCryptoListViewModel = this.this$0;
            boolean z = this.$shouldShowLoading;
            boolean z2 = this.$hasNetwork;
            LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
            this.label = 2;
            if (buySellCryptoListViewModel.OLrzqt(listAhwBna, z, z2, lifecycleOwner, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
