package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.viewmodel;

import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeListDataResp;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter.EscapedWalletLoadUIData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC49371unL;
import o.fJS;

/* JADX INFO: loaded from: classes5.dex */
public final class EscapedPassKeyWalletListViewModel$getEscapedWalletListData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isFirstLoad;
    final /* synthetic */ boolean $isLoadMore;
    int label;
    final /* synthetic */ EscapedPassKeyWalletListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EscapedPassKeyWalletListViewModel$getEscapedWalletListData$1(boolean z, EscapedPassKeyWalletListViewModel escapedPassKeyWalletListViewModel, boolean z2, Continuation<? super EscapedPassKeyWalletListViewModel$getEscapedWalletListData$1> continuation) {
        super(2, continuation);
        this.$isFirstLoad = z;
        this.this$0 = escapedPassKeyWalletListViewModel;
        this.$isLoadMore = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EscapedPassKeyWalletListViewModel$getEscapedWalletListData$1(this.$isFirstLoad, this.this$0, this.$isLoadMore, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EscapedPassKeyWalletListViewModel$getEscapedWalletListData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objM8600invoke0E7RQCE$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                if (this.$isFirstLoad) {
                    this.this$0.KWHzl.setValue(new InterfaceC49371unL.ActionBar(null, 1, null));
                } else {
                    this.this$0.KWHzl.setValue(new InterfaceC49371unL.StateListAnimator(null, 1, null));
                }
                EscapedPassKeyWalletListViewModel escapedPassKeyWalletListViewModel = this.this$0;
                Result.Application application = Result.Companion;
                fJS fjs = escapedPassKeyWalletListViewModel.copydefault;
                String str = escapedPassKeyWalletListViewModel.gEmmrt;
                this.label = 1;
                objM8600invoke0E7RQCE$default = fJS.m8600invoke0E7RQCE$default(fjs, 0, str, this, 1, null);
                if (objM8600invoke0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objM8600invoke0E7RQCE$default = ((Result) obj).m7386unboximpl();
            }
            C56391yDq.AEQbTJ(objM8600invoke0E7RQCE$default);
            objM7377constructorimpl = Result.m7377constructorimpl((EscapeListDataResp) objM8600invoke0E7RQCE$default);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        EscapedPassKeyWalletListViewModel escapedPassKeyWalletListViewModel2 = this.this$0;
        boolean z = this.$isFirstLoad;
        boolean z2 = this.$isLoadMore;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            EscapeListDataResp escapeListDataResp = (EscapeListDataResp) objM7377constructorimpl;
            escapedPassKeyWalletListViewModel2.gEmmrt = escapeListDataResp.getNextCursor();
            escapedPassKeyWalletListViewModel2.OLrzqt.setValue(new InterfaceC49371unL.Activity(C56443yFo.KWHzl(true ^ Intrinsics.EZpvd((Object) escapedPassKeyWalletListViewModel2.gEmmrt, (Object) MultiTransferSignData.DEFAULT_INTERVAL))));
            escapedPassKeyWalletListViewModel2.KWHzl.setValue(new InterfaceC49371unL.Activity(new EscapedWalletLoadUIData(z, z2, escapedPassKeyWalletListViewModel2.OLrzqt(escapeListDataResp))));
        }
        EscapedPassKeyWalletListViewModel escapedPassKeyWalletListViewModel3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            escapedPassKeyWalletListViewModel3.OLrzqt.setValue(new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null));
            escapedPassKeyWalletListViewModel3.KWHzl.setValue(new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null));
        }
        return Unit.INSTANCE;
    }
}
