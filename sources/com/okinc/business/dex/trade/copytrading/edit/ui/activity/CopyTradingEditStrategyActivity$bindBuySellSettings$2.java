package com.okinc.business.dex.trade.copytrading.edit.ui.activity;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleDestroyedException;
import androidx.lifecycle.WithLifecycleStateKt;
import com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingBuyInputPanelFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C19888gTa;
import o.C19900gTm;
import o.C23428hxz;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class CopyTradingEditStrategyActivity$bindBuySellSettings$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C23428hxz $this_bindBuySellSettings;
    int label;
    final /* synthetic */ CopyTradingEditStrategyActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingEditStrategyActivity$bindBuySellSettings$2(CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, C23428hxz c23428hxz, Continuation<? super CopyTradingEditStrategyActivity$bindBuySellSettings$2> continuation) {
        super(2, continuation);
        this.this$0 = copyTradingEditStrategyActivity;
        this.$this_bindBuySellSettings = c23428hxz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingEditStrategyActivity$bindBuySellSettings$2(this.this$0, this.$this_bindBuySellSettings, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingEditStrategyActivity$bindBuySellSettings$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final CopyTradingEditStrategyActivity copyTradingEditStrategyActivity = this.this$0;
            final C23428hxz c23428hxz = this.$this_bindBuySellSettings;
            Lifecycle lifecycle = copyTradingEditStrategyActivity.getLifecycle();
            Lifecycle.State state = Lifecycle.State.STARTED;
            MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
            boolean zIsDispatchNeeded = immediate.isDispatchNeeded(getContext());
            if (!zIsDispatchNeeded) {
                if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                    throw new LifecycleDestroyedException();
                }
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    FragmentManager supportFragmentManager = copyTradingEditStrategyActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
                    Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
                    fragmentTransactionBeginTransaction.replace(c23428hxz.KWHzl.getId(), CopyTradingBuyInputPanelFragment.Companion.OLrzqt(), CopyTradingBuyInputPanelFragment.class.getName());
                    fragmentTransactionBeginTransaction.commitAllowingStateLoss();
                    FragmentManager supportFragmentManager2 = copyTradingEditStrategyActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                    FragmentTransaction fragmentTransactionBeginTransaction2 = supportFragmentManager2.beginTransaction();
                    Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction2, "");
                    fragmentTransactionBeginTransaction2.replace(c23428hxz.AEQbTJ.getId(), C19888gTa.Companion.EZpvd(), C19888gTa.class.getName());
                    fragmentTransactionBeginTransaction2.commitAllowingStateLoss();
                    FragmentManager supportFragmentManager3 = copyTradingEditStrategyActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "");
                    FragmentTransaction fragmentTransactionBeginTransaction3 = supportFragmentManager3.beginTransaction();
                    Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction3, "");
                    fragmentTransactionBeginTransaction3.replace(c23428hxz.fetchVPNInfo.getId(), C19900gTm.Companion.EZpvd(), C19900gTm.class.getName());
                    fragmentTransactionBeginTransaction3.commitAllowingStateLoss();
                    Unit unit = Unit.INSTANCE;
                }
            } else {
                Function0<Unit> function0 = new Function0<Unit>() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.activity.CopyTradingEditStrategyActivity$bindBuySellSettings$2$invokeSuspend$$inlined$withStarted$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Unit invoke() {
                        FragmentManager supportFragmentManager4 = copyTradingEditStrategyActivity.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager4, "");
                        FragmentTransaction fragmentTransactionBeginTransaction4 = supportFragmentManager4.beginTransaction();
                        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction4, "");
                        fragmentTransactionBeginTransaction4.replace(c23428hxz.KWHzl.getId(), CopyTradingBuyInputPanelFragment.Companion.OLrzqt(), CopyTradingBuyInputPanelFragment.class.getName());
                        fragmentTransactionBeginTransaction4.commitAllowingStateLoss();
                        FragmentManager supportFragmentManager5 = copyTradingEditStrategyActivity.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager5, "");
                        FragmentTransaction fragmentTransactionBeginTransaction5 = supportFragmentManager5.beginTransaction();
                        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction5, "");
                        fragmentTransactionBeginTransaction5.replace(c23428hxz.AEQbTJ.getId(), C19888gTa.Companion.EZpvd(), C19888gTa.class.getName());
                        fragmentTransactionBeginTransaction5.commitAllowingStateLoss();
                        FragmentManager supportFragmentManager6 = copyTradingEditStrategyActivity.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager6, "");
                        FragmentTransaction fragmentTransactionBeginTransaction6 = supportFragmentManager6.beginTransaction();
                        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction6, "");
                        fragmentTransactionBeginTransaction6.replace(c23428hxz.fetchVPNInfo.getId(), C19900gTm.Companion.EZpvd(), C19900gTm.class.getName());
                        fragmentTransactionBeginTransaction6.commitAllowingStateLoss();
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, immediate, function0, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
