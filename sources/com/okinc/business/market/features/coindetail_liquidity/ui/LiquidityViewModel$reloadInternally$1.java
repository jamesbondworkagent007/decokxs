package com.okinc.business.market.features.coindetail_liquidity.ui;

import com.okinc.business.market.features.filter.domain.TokenFilter;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C26069jQu;
import o.C56391yDq;
import o.C56442yFn;
import o.jPS;
import o.pUU;

/* JADX INFO: loaded from: classes6.dex */
public final class LiquidityViewModel$reloadInternally$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TokenFilter $filter;
    final /* synthetic */ boolean $isFirstPage;
    final /* synthetic */ String $lastItemId;
    final /* synthetic */ boolean $showInternalLoading;
    int label;
    final /* synthetic */ LiquidityViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiquidityViewModel$reloadInternally$1(boolean z, boolean z2, LiquidityViewModel liquidityViewModel, String str, TokenFilter tokenFilter, Continuation<? super LiquidityViewModel$reloadInternally$1> continuation) {
        super(2, continuation);
        this.$showInternalLoading = z;
        this.$isFirstPage = z2;
        this.this$0 = liquidityViewModel;
        this.$lastItemId = str;
        this.$filter = tokenFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiquidityViewModel$reloadInternally$1(this.$showInternalLoading, this.$isFirstPage, this.this$0, this.$lastItemId, this.$filter, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LiquidityViewModel$reloadInternally$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C26069jQu c26069jQu;
        Object objM7386unboximpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$showInternalLoading) {
                c26069jQu = new C26069jQu(false, false, false, true, null, false, 55, null);
            } else if (this.$isFirstPage) {
                c26069jQu = new C26069jQu(false, true, false, false, null, false, 61, null);
            } else {
                c26069jQu = new C26069jQu(false, false, true, false, null, false, 59, null);
            }
            this.this$0.EZpvd.setValue(c26069jQu);
            jPS jps = this.this$0.fetchVPNInfo;
            String str = this.$lastItemId;
            TokenFilter tokenFilter = this.$filter;
            boolean z = this.this$0.AhwBna;
            this.label = 1;
            Object objCopydefault2 = jps.copydefault(str, tokenFilter, z, this);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            objM7386unboximpl = objCopydefault2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        LiquidityViewModel liquidityViewModel = this.this$0;
        boolean z2 = this.$isFirstPage;
        TokenFilter tokenFilter2 = this.$filter;
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            liquidityViewModel.EZpvd.setValue(new C26069jQu(((Boolean) objM7386unboximpl).booleanValue(), false, false, false, null, false, 62, null));
            if (z2) {
                liquidityViewModel.EZpvd(tokenFilter2);
            }
        }
        boolean z3 = this.$isFirstPage;
        LiquidityViewModel liquidityViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.KWHzl(thM7380exceptionOrNullimpl);
            if (!z3) {
                liquidityViewModel2.EZpvd.setValue(new C26069jQu(false, false, false, false, null, false, 63, null));
            } else {
                liquidityViewModel2.EZpvd.setValue(new C26069jQu(false, false, false, false, thM7380exceptionOrNullimpl, false, 47, null));
            }
        }
        return Unit.INSTANCE;
    }
}
