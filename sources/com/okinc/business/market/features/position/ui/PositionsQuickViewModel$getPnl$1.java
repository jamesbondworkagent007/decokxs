package com.okinc.business.market.features.position.ui;

import com.okinc.business.market.features.position.ui.widget.PnLDetailsUiModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C29095knF;
import o.C29123knh;
import o.C56391yDq;
import o.C56442yFn;
import o.kKG;

/* JADX INFO: loaded from: classes7.dex */
public final class PositionsQuickViewModel$getPnl$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ boolean $showLoading;
    final /* synthetic */ String $tokenAddress;
    int label;
    final /* synthetic */ PositionsQuickViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionsQuickViewModel$getPnl$1(PositionsQuickViewModel positionsQuickViewModel, boolean z, String str, String str2, Continuation<? super PositionsQuickViewModel$getPnl$1> continuation) {
        super(2, continuation);
        this.this$0 = positionsQuickViewModel;
        this.$showLoading = z;
        this.$chainId = str;
        this.$tokenAddress = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PositionsQuickViewModel$getPnl$1(this.this$0, this.$showLoading, this.$chainId, this.$tokenAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PositionsQuickViewModel$getPnl$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAYXKKw;
        Object objM8669invokeBWLJW6A$default;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            kKG kkg = this.this$0.djBIcL;
            this.label = 1;
            objAYXKKw = kkg.AYXKKw(this);
            if (objAYXKKw == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objM8669invokeBWLJW6A$default = ((Result) obj).m7386unboximpl();
                PositionsQuickViewModel positionsQuickViewModel = this.this$0;
                String str = this.$chainId;
                String str2 = this.$tokenAddress;
                if (Result.m7384isSuccessimpl(objM8669invokeBWLJW6A$default)) {
                    PnLDetailsUiModel pnLDetailsUiModel = (PnLDetailsUiModel) objM8669invokeBWLJW6A$default;
                    positionsQuickViewModel.EZpvd.setValue(new C29095knF(false, pnLDetailsUiModel, null, 5, null));
                    if (pnLDetailsUiModel.AYXKKw()) {
                        positionsQuickViewModel.KWHzl(str, str2);
                    }
                }
                PositionsQuickViewModel positionsQuickViewModel2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM8669invokeBWLJW6A$default);
                if (thM7380exceptionOrNullimpl != null) {
                    positionsQuickViewModel2.EZpvd.setValue(new C29095knF(false, new PnLDetailsUiModel(false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286, null), thM7380exceptionOrNullimpl, 1, null));
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objAYXKKw = obj;
        }
        if (((Boolean) objAYXKKw).booleanValue()) {
            if (this.$showLoading) {
                this.this$0.EZpvd.setValue(new C29095knF(true, null, null, 6, null));
            }
            C29123knh c29123knh = this.this$0.AhwBna;
            String str3 = this.$chainId;
            String str4 = this.$tokenAddress;
            this.label = 2;
            objM8669invokeBWLJW6A$default = C29123knh.m8669invokeBWLJW6A$default(c29123knh, str3, str4, null, this, 4, null);
            if (objM8669invokeBWLJW6A$default == objCopydefault) {
                return objCopydefault;
            }
            PositionsQuickViewModel positionsQuickViewModel3 = this.this$0;
            String str5 = this.$chainId;
            String str22 = this.$tokenAddress;
            if (Result.m7384isSuccessimpl(objM8669invokeBWLJW6A$default)) {
            }
            PositionsQuickViewModel positionsQuickViewModel22 = this.this$0;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM8669invokeBWLJW6A$default);
            if (thM7380exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
