package com.okinc.buysell.domain;

import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean;
import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyPairsBean;
import com.okinc.crcore.shared.net.responsebean.IndicativePriceDataBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C31389ltB;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.lyP;
import o.mCZ;

/* JADX INFO: loaded from: classes7.dex */
public final class GetAssetsQuoteUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends C31389ltB, ? extends OKServerException>>, Object> {
    final /* synthetic */ ConvertCurrencyBean $fromCcy;
    final /* synthetic */ ConvertCurrencyBean $toCcy;
    Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ lyP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAssetsQuoteUseCase$invoke$2(lyP lyp, ConvertCurrencyBean convertCurrencyBean, ConvertCurrencyBean convertCurrencyBean2, Continuation<? super GetAssetsQuoteUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = lyp;
        this.$fromCcy = convertCurrencyBean;
        this.$toCcy = convertCurrencyBean2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetAssetsQuoteUseCase$invoke$2(this.this$0, this.$fromCcy, this.$toCcy, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends C31389ltB, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<C31389ltB, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<C31389ltB, OKServerException>> continuation) {
        return ((GetAssetsQuoteUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b A[Catch: OKServerException -> 0x00d4, TryCatch #0 {OKServerException -> 0x00d4, blocks: (B:7:0x0014, B:25:0x0081, B:27:0x008b, B:30:0x009c, B:32:0x00b4, B:36:0x00c0, B:38:0x00c9, B:37:0x00c5, B:33:0x00b9, B:29:0x0091, B:11:0x0020, B:17:0x004a, B:21:0x0072, B:14:0x0027), top: B:43:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091 A[Catch: OKServerException -> 0x00d4, TryCatch #0 {OKServerException -> 0x00d4, blocks: (B:7:0x0014, B:25:0x0081, B:27:0x008b, B:30:0x009c, B:32:0x00b4, B:36:0x00c0, B:38:0x00c9, B:37:0x00c5, B:33:0x00b9, B:29:0x0091, B:11:0x0020, B:17:0x004a, B:21:0x0072, B:14:0x0027), top: B:43:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4 A[Catch: OKServerException -> 0x00d4, TryCatch #0 {OKServerException -> 0x00d4, blocks: (B:7:0x0014, B:25:0x0081, B:27:0x008b, B:30:0x009c, B:32:0x00b4, B:36:0x00c0, B:38:0x00c9, B:37:0x00c5, B:33:0x00b9, B:29:0x0091, B:11:0x0020, B:17:0x004a, B:21:0x0072, B:14:0x0027), top: B:43:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9 A[Catch: OKServerException -> 0x00d4, TryCatch #0 {OKServerException -> 0x00d4, blocks: (B:7:0x0014, B:25:0x0081, B:27:0x008b, B:30:0x009c, B:32:0x00b4, B:36:0x00c0, B:38:0x00c9, B:37:0x00c5, B:33:0x00b9, B:29:0x0091, B:11:0x0020, B:17:0x004a, B:21:0x0072, B:14:0x0027), top: B:43:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0 A[Catch: OKServerException -> 0x00d4, TryCatch #0 {OKServerException -> 0x00d4, blocks: (B:7:0x0014, B:25:0x0081, B:27:0x008b, B:30:0x009c, B:32:0x00b4, B:36:0x00c0, B:38:0x00c9, B:37:0x00c5, B:33:0x00b9, B:29:0x0091, B:11:0x0020, B:17:0x004a, B:21:0x0072, B:14:0x0027), top: B:43:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5 A[Catch: OKServerException -> 0x00d4, TryCatch #0 {OKServerException -> 0x00d4, blocks: (B:7:0x0014, B:25:0x0081, B:27:0x008b, B:30:0x009c, B:32:0x00b4, B:36:0x00c0, B:38:0x00c9, B:37:0x00c5, B:33:0x00b9, B:29:0x0091, B:11:0x0020, B:17:0x004a, B:21:0x0072, B:14:0x0027), top: B:43:0x0008 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ConvertCurrencyPairsBean convertCurrencyPairsBean;
        boolean z;
        String strCopydefault;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                mCZ mcz = this.this$0.KWHzl;
                Integer numAEQbTJ = C56443yFo.AEQbTJ(5);
                String ccy = this.$fromCcy.getCcy();
                String ccy2 = this.$toCcy.getCcy();
                this.label = 1;
                obj = mcz.EZpvd("FIRST_CACHE", numAEQbTJ, ccy, ccy2, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = this.Z$0;
                    convertCurrencyPairsBean = (ConvertCurrencyPairsBean) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    IndicativePriceDataBean indicativePriceDataBean = (IndicativePriceDataBean) ((AbstractC43419rot) obj).AEQbTJ();
                    if (z) {
                        strCopydefault = this.this$0.copydefault(indicativePriceDataBean.getPrice());
                    } else {
                        strCopydefault = indicativePriceDataBean.getPrice();
                    }
                    return new AbstractC43419rot.StateListAnimator(new C31389ltB(indicativePriceDataBean.getQuoteCcy(), indicativePriceDataBean.getBaseCcy(), indicativePriceDataBean.getPrice(), indicativePriceDataBean.getSide(), indicativePriceDataBean.getTtlMs(), strCopydefault, !z ? convertCurrencyPairsBean.getBaseSingleMin() : convertCurrencyPairsBean.getQuoteSingleMin(), !z ? convertCurrencyPairsBean.getBaseSingleMax() : convertCurrencyPairsBean.getQuoteSingleMax()));
                }
                C56391yDq.AEQbTJ(obj);
            }
            convertCurrencyPairsBean = (ConvertCurrencyPairsBean) ((AbstractC43419rot) obj).AEQbTJ();
            boolean zEZpvd = Intrinsics.EZpvd((Object) this.$fromCcy.getCcy(), (Object) convertCurrencyPairsBean.getBaseCcy());
            mCZ mcz2 = this.this$0.KWHzl;
            String instId = convertCurrencyPairsBean.getInstId();
            String str = zEZpvd ? "sell" : "buy";
            this.L$0 = convertCurrencyPairsBean;
            this.Z$0 = zEZpvd;
            this.label = 2;
            Object objEZpvd = mcz2.EZpvd(instId, str, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            z = zEZpvd;
            obj = objEZpvd;
            IndicativePriceDataBean indicativePriceDataBean2 = (IndicativePriceDataBean) ((AbstractC43419rot) obj).AEQbTJ();
            if (z) {
            }
            return new AbstractC43419rot.StateListAnimator(new C31389ltB(indicativePriceDataBean2.getQuoteCcy(), indicativePriceDataBean2.getBaseCcy(), indicativePriceDataBean2.getPrice(), indicativePriceDataBean2.getSide(), indicativePriceDataBean2.getTtlMs(), strCopydefault, !z ? convertCurrencyPairsBean.getBaseSingleMin() : convertCurrencyPairsBean.getQuoteSingleMin(), !z ? convertCurrencyPairsBean.getBaseSingleMax() : convertCurrencyPairsBean.getQuoteSingleMax()));
        } catch (OKServerException e) {
            return new AbstractC43419rot.ActionBar(e);
        }
    }
}
