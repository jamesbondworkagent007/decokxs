package com.okinc.business.market.features.home.ui;

import com.okinc.business.market.common.marketconfig.domain.MarketConfig;
import com.okinc.business.market.features.home.domain.HomeTab;
import java.util.Collection;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25983jNp;
import o.C27633jyq;
import o.C27634jyr;
import o.C28446kat;
import o.C29709kyk;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.InterfaceC28403kaC;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketHomeViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $pageFrom;
    int label;
    final /* synthetic */ MarketHomeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeViewModel$loadData$1(MarketHomeViewModel marketHomeViewModel, String str, Continuation<? super MarketHomeViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = marketHomeViewModel;
        this.$pageFrom = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketHomeViewModel$loadData$1(this.this$0, this.$pageFrom, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketHomeViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        MarketHomeViewModel marketHomeViewModel;
        Object objM8661getHomeTabList0E7RQCE$default;
        C27634jyr c27634jyr;
        C27633jyq c27633jyq;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                this.this$0.EZpvd.setValue(InterfaceC28403kaC.ActionBar.EZpvd);
                C25983jNp c25983jNp = this.this$0.gEmmrt;
                this.label = 1;
                objOLrzqt = c25983jNp.OLrzqt(this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                if (!Result.m7383isFailureimpl(objOLrzqt)) {
                    this.this$0.EZpvd.setValue(InterfaceC28403kaC.Activity.EZpvd);
                    return Unit.INSTANCE;
                }
                C29709kyk c29709kyk = this.this$0.valueOf;
                this.label = 2;
                if (c29709kyk.AEQbTJ(this) == objCopydefault) {
                    return objCopydefault;
                }
                marketHomeViewModel = this.this$0;
                this.label = 3;
                if (marketHomeViewModel.copydefault((Continuation<? super Unit>) this) == objCopydefault) {
                    return objCopydefault;
                }
                C28446kat c28446kat = this.this$0.AhwBna;
                String str = this.$pageFrom;
                this.label = 4;
                objM8661getHomeTabList0E7RQCE$default = C28446kat.m8661getHomeTabList0E7RQCE$default(c28446kat, str, null, this, 2, null);
                if (objM8661getHomeTabList0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
                String str2 = this.$pageFrom;
                MarketHomeViewModel marketHomeViewModel2 = this.this$0;
                if (Result.m7384isSuccessimpl(objM8661getHomeTabList0E7RQCE$default)) {
                    marketHomeViewModel2.EZpvd.setValue(new InterfaceC28403kaC.StateListAnimator(CollectionsKt___CollectionsKt.djBIcL((Collection) C56402yEa.EZpvd(new HomeTab("watchlist", null, null, null, null, str2, 30, null)), (Iterable) objM8661getHomeTabList0E7RQCE$default)));
                }
                MarketHomeViewModel marketHomeViewModel3 = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objM8661getHomeTabList0E7RQCE$default) != null) {
                    marketHomeViewModel3.EZpvd.setValue(InterfaceC28403kaC.Activity.EZpvd);
                }
                c27634jyr = this.this$0.djBIcL;
                this.label = 5;
                if (c27634jyr.EZpvd(true, this) == objCopydefault) {
                    return objCopydefault;
                }
                c27633jyq = this.this$0.fetchVPNInfo;
                this.label = 6;
                if (c27633jyq.copydefault(true, (Continuation<? super MarketConfig>) this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
                if (!Result.m7383isFailureimpl(objOLrzqt)) {
                }
                break;
            case 2:
                C56391yDq.AEQbTJ(obj);
                ((Result) obj).m7386unboximpl();
                marketHomeViewModel = this.this$0;
                this.label = 3;
                if (marketHomeViewModel.copydefault((Continuation<? super Unit>) this) == objCopydefault) {
                }
                C28446kat c28446kat2 = this.this$0.AhwBna;
                String str3 = this.$pageFrom;
                this.label = 4;
                objM8661getHomeTabList0E7RQCE$default = C28446kat.m8661getHomeTabList0E7RQCE$default(c28446kat2, str3, null, this, 2, null);
                if (objM8661getHomeTabList0E7RQCE$default == objCopydefault) {
                }
                String str22 = this.$pageFrom;
                MarketHomeViewModel marketHomeViewModel22 = this.this$0;
                if (Result.m7384isSuccessimpl(objM8661getHomeTabList0E7RQCE$default)) {
                }
                MarketHomeViewModel marketHomeViewModel32 = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objM8661getHomeTabList0E7RQCE$default) != null) {
                }
                c27634jyr = this.this$0.djBIcL;
                this.label = 5;
                if (c27634jyr.EZpvd(true, this) == objCopydefault) {
                }
                c27633jyq = this.this$0.fetchVPNInfo;
                this.label = 6;
                if (c27633jyq.copydefault(true, (Continuation<? super MarketConfig>) this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 3:
                C56391yDq.AEQbTJ(obj);
                C28446kat c28446kat22 = this.this$0.AhwBna;
                String str32 = this.$pageFrom;
                this.label = 4;
                objM8661getHomeTabList0E7RQCE$default = C28446kat.m8661getHomeTabList0E7RQCE$default(c28446kat22, str32, null, this, 2, null);
                if (objM8661getHomeTabList0E7RQCE$default == objCopydefault) {
                }
                String str222 = this.$pageFrom;
                MarketHomeViewModel marketHomeViewModel222 = this.this$0;
                if (Result.m7384isSuccessimpl(objM8661getHomeTabList0E7RQCE$default)) {
                }
                MarketHomeViewModel marketHomeViewModel322 = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objM8661getHomeTabList0E7RQCE$default) != null) {
                }
                c27634jyr = this.this$0.djBIcL;
                this.label = 5;
                if (c27634jyr.EZpvd(true, this) == objCopydefault) {
                }
                c27633jyq = this.this$0.fetchVPNInfo;
                this.label = 6;
                if (c27633jyq.copydefault(true, (Continuation<? super MarketConfig>) this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 4:
                C56391yDq.AEQbTJ(obj);
                objM8661getHomeTabList0E7RQCE$default = ((Result) obj).m7386unboximpl();
                String str2222 = this.$pageFrom;
                MarketHomeViewModel marketHomeViewModel2222 = this.this$0;
                if (Result.m7384isSuccessimpl(objM8661getHomeTabList0E7RQCE$default)) {
                }
                MarketHomeViewModel marketHomeViewModel3222 = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objM8661getHomeTabList0E7RQCE$default) != null) {
                }
                c27634jyr = this.this$0.djBIcL;
                this.label = 5;
                if (c27634jyr.EZpvd(true, this) == objCopydefault) {
                }
                c27633jyq = this.this$0.fetchVPNInfo;
                this.label = 6;
                if (c27633jyq.copydefault(true, (Continuation<? super MarketConfig>) this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 5:
                C56391yDq.AEQbTJ(obj);
                c27633jyq = this.this$0.fetchVPNInfo;
                this.label = 6;
                if (c27633jyq.copydefault(true, (Continuation<? super MarketConfig>) this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 6:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
