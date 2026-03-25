package com.okinc.business.defi.wallet.mine.search.ui.view;

import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import com.okinc.business.defi.wallet.home.navigation.WalletNavigator;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.WalletSearchHistoryViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C18976fsa;
import o.C19080fuY;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC18922frZ;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSearchHistoryFragment$performClearHistory$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C19080fuY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSearchHistoryFragment$performClearHistory$1(C19080fuY c19080fuY, Continuation<? super WalletSearchHistoryFragment$performClearHistory$1> continuation) {
        super(2, continuation);
        this.this$0 = c19080fuY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletSearchHistoryFragment$performClearHistory$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletSearchHistoryFragment$performClearHistory$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.OLrzqt = true;
                WalletSearchHistoryViewModel walletSearchHistoryViewModelValueOf = this.this$0.valueOf();
                this.label = 1;
                if (walletSearchHistoryViewModelValueOf.copydefault(this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
        } catch (Exception e) {
            pUU.AEQbTJ(this.this$0.getTAG(), "Error clearing history: " + e.getMessage(), e);
        }
        if (this.this$0.isAdded() && !this.this$0.isDetached()) {
            FragmentKt.setFragmentResult(this.this$0, "request_key_history_cleared", BundleKt.bundleOf(C56390yDp.OLrzqt("result_key_history_cleared", C56443yFo.KWHzl(true))));
            InterfaceC18922frZ interfaceC18922frZCopydefault = C18976fsa.copydefault(this.this$0);
            if (interfaceC18922frZCopydefault != null) {
                C56443yFo.KWHzl(WalletNavigator.Activity.pop$default(interfaceC18922frZCopydefault, false, 1, null));
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
