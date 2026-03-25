package com.okinc.buysell.domain;

import com.okinc.crcore.coreapi.net.requestbean.ExchangeQuoteRequestBean;
import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean;
import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyPairsBean;
import com.okinc.crcore.shared.net.responsebean.ExchangeQuoteBean;
import com.okinc.network.okg.response.OKServerException;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C31435ltv;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C56548yJl;
import o.lyP;
import o.mCZ;

/* JADX INFO: loaded from: classes7.dex */
public final class GetAssetsQuoteUseCase$invoke$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends C31435ltv, ? extends OKServerException>>, Object> {
    final /* synthetic */ ConvertCurrencyBean $fromCcy;
    final /* synthetic */ String $quoteAmount;
    final /* synthetic */ ConvertCurrencyBean $toCcy;
    boolean Z$0;
    int label;
    final /* synthetic */ lyP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAssetsQuoteUseCase$invoke$4(lyP lyp, ConvertCurrencyBean convertCurrencyBean, ConvertCurrencyBean convertCurrencyBean2, String str, Continuation<? super GetAssetsQuoteUseCase$invoke$4> continuation) {
        super(2, continuation);
        this.this$0 = lyp;
        this.$fromCcy = convertCurrencyBean;
        this.$toCcy = convertCurrencyBean2;
        this.$quoteAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetAssetsQuoteUseCase$invoke$4(this.this$0, this.$fromCcy, this.$toCcy, this.$quoteAmount, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends C31435ltv, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<C31435ltv, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<C31435ltv, OKServerException>> continuation) {
        return ((GetAssetsQuoteUseCase$invoke$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3 A[Catch: OKServerException -> 0x00e9, TryCatch #0 {OKServerException -> 0x00e9, blocks: (B:7:0x0010, B:34:0x00b9, B:36:0x00c3, B:39:0x00d4, B:41:0x00dd, B:40:0x00d9, B:37:0x00c8, B:11:0x001d, B:17:0x0047, B:19:0x005f, B:21:0x0068, B:23:0x008d, B:30:0x00a4, B:24:0x0092, B:20:0x0064, B:14:0x0024), top: B:46:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8 A[Catch: OKServerException -> 0x00e9, TryCatch #0 {OKServerException -> 0x00e9, blocks: (B:7:0x0010, B:34:0x00b9, B:36:0x00c3, B:39:0x00d4, B:41:0x00dd, B:40:0x00d9, B:37:0x00c8, B:11:0x001d, B:17:0x0047, B:19:0x005f, B:21:0x0068, B:23:0x008d, B:30:0x00a4, B:24:0x0092, B:20:0x0064, B:14:0x0024), top: B:46:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d4 A[Catch: OKServerException -> 0x00e9, TryCatch #0 {OKServerException -> 0x00e9, blocks: (B:7:0x0010, B:34:0x00b9, B:36:0x00c3, B:39:0x00d4, B:41:0x00dd, B:40:0x00d9, B:37:0x00c8, B:11:0x001d, B:17:0x0047, B:19:0x005f, B:21:0x0068, B:23:0x008d, B:30:0x00a4, B:24:0x0092, B:20:0x0064, B:14:0x0024), top: B:46:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d9 A[Catch: OKServerException -> 0x00e9, TryCatch #0 {OKServerException -> 0x00e9, blocks: (B:7:0x0010, B:34:0x00b9, B:36:0x00c3, B:39:0x00d4, B:41:0x00dd, B:40:0x00d9, B:37:0x00c8, B:11:0x001d, B:17:0x0047, B:19:0x005f, B:21:0x0068, B:23:0x008d, B:30:0x00a4, B:24:0x0092, B:20:0x0064, B:14:0x0024), top: B:46:0x0008 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
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
                    C56391yDq.AEQbTJ(obj);
                    ExchangeQuoteBean exchangeQuoteBean = (ExchangeQuoteBean) ((AbstractC43419rot) obj).AEQbTJ();
                    if (z) {
                        strCopydefault = this.this$0.copydefault(exchangeQuoteBean.getAskPx());
                    } else {
                        strCopydefault = exchangeQuoteBean.getBidPx();
                    }
                    return new AbstractC43419rot.StateListAnimator(new C31435ltv(strCopydefault, !z ? exchangeQuoteBean.getBidPx() : exchangeQuoteBean.getAskPx(), false));
                }
                C56391yDq.AEQbTJ(obj);
            }
            ConvertCurrencyPairsBean convertCurrencyPairsBean = (ConvertCurrencyPairsBean) ((AbstractC43419rot) obj).AEQbTJ();
            boolean zEZpvd = Intrinsics.EZpvd((Object) this.$fromCcy.getCcy(), (Object) convertCurrencyPairsBean.getBaseCcy());
            BigDecimal bigDecimal = (BigDecimal) C56548yJl.KWHzl(C33129mqd.EZpvd(this.$quoteAmount), C33129mqd.EZpvd(zEZpvd ? convertCurrencyPairsBean.getBaseSingleMin() : convertCurrencyPairsBean.getQuoteSingleMin()));
            String baseCcy = convertCurrencyPairsBean.getBaseCcy();
            String quoteCcy = convertCurrencyPairsBean.getQuoteCcy();
            String string = bigDecimal.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            ExchangeQuoteRequestBean exchangeQuoteRequestBean = new ExchangeQuoteRequestBean(baseCcy, quoteCcy, string, zEZpvd ? convertCurrencyPairsBean.getBaseCcy() : convertCurrencyPairsBean.getQuoteCcy(), zEZpvd ? "sell" : "buy", 0, 32, (DefaultConstructorMarker) null);
            mCZ mcz2 = this.this$0.KWHzl;
            this.Z$0 = zEZpvd;
            this.label = 2;
            obj = mcz2.OLrzqt(exchangeQuoteRequestBean, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            z = zEZpvd;
            ExchangeQuoteBean exchangeQuoteBean2 = (ExchangeQuoteBean) ((AbstractC43419rot) obj).AEQbTJ();
            if (z) {
            }
            return new AbstractC43419rot.StateListAnimator(new C31435ltv(strCopydefault, !z ? exchangeQuoteBean2.getBidPx() : exchangeQuoteBean2.getAskPx(), false));
        } catch (OKServerException e) {
            return new AbstractC43419rot.ActionBar(e);
        }
    }
}
