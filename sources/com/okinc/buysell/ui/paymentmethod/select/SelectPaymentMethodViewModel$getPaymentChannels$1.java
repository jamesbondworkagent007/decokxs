package com.okinc.buysell.ui.paymentmethod.select;

import com.okinc.buysell.ui.paymentmethod.data.BuySellParameter;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okpaymentapi.data.remote.model.management.Channel;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okx.paymentapi.service.DexTokenParameters;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC30126lMw;
import o.AbstractC43419rot;
import o.C33129mqd;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.lyG;
import o.mHA;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class SelectPaymentMethodViewModel$getPaymentChannels$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SelectPaymentMethodViewModel this$0;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TradeType.values().length];
            try {
                iArr[TradeType.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TradeType.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TradeType.DEPOSIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TradeType.WITHDRAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TradeType.STABLECOIN_DEPOSIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TradeType.TOPUP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TradeType.ADDFUNDS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectPaymentMethodViewModel$getPaymentChannels$1(SelectPaymentMethodViewModel selectPaymentMethodViewModel, Continuation<? super SelectPaymentMethodViewModel$getPaymentChannels$1> continuation) {
        super(2, continuation);
        this.this$0 = selectPaymentMethodViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SelectPaymentMethodViewModel$getPaymentChannels$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SelectPaymentMethodViewModel$getPaymentChannels$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5 A[Catch: all -> 0x012e, TryCatch #0 {all -> 0x012e, blocks: (B:5:0x000c, B:45:0x00e5, B:46:0x00ed, B:48:0x00f5, B:50:0x0112, B:52:0x011a, B:49:0x0107, B:10:0x001e, B:11:0x0030, B:12:0x0033, B:53:0x012a, B:54:0x012d, B:13:0x0037, B:14:0x003d, B:15:0x0043, B:17:0x0056, B:19:0x005c, B:21:0x0068, B:23:0x006e, B:25:0x007a, B:27:0x0080, B:29:0x008c, B:31:0x0092, B:33:0x00a8, B:35:0x00ae, B:37:0x00ba, B:39:0x00c1, B:41:0x00cd, B:42:0x00d1), top: B:59:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0107 A[Catch: all -> 0x012e, TryCatch #0 {all -> 0x012e, blocks: (B:5:0x000c, B:45:0x00e5, B:46:0x00ed, B:48:0x00f5, B:50:0x0112, B:52:0x011a, B:49:0x0107, B:10:0x001e, B:11:0x0030, B:12:0x0033, B:53:0x012a, B:54:0x012d, B:13:0x0037, B:14:0x003d, B:15:0x0043, B:17:0x0056, B:19:0x005c, B:21:0x0068, B:23:0x006e, B:25:0x007a, B:27:0x0080, B:29:0x008c, B:31:0x0092, B:33:0x00a8, B:35:0x00ae, B:37:0x00ba, B:39:0x00c1, B:41:0x00cd, B:42:0x00d1), top: B:59:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011a A[Catch: all -> 0x012e, TryCatch #0 {all -> 0x012e, blocks: (B:5:0x000c, B:45:0x00e5, B:46:0x00ed, B:48:0x00f5, B:50:0x0112, B:52:0x011a, B:49:0x0107, B:10:0x001e, B:11:0x0030, B:12:0x0033, B:53:0x012a, B:54:0x012d, B:13:0x0037, B:14:0x003d, B:15:0x0043, B:17:0x0056, B:19:0x005c, B:21:0x0068, B:23:0x006e, B:25:0x007a, B:27:0x0080, B:29:0x008c, B:31:0x0092, B:33:0x00a8, B:35:0x00ae, B:37:0x00ba, B:39:0x00c1, B:41:0x00cd, B:42:0x00d1), top: B:59:0x0008 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        List<Channel> listAhwBna;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            OKServerException oKServerExceptionOLrzqt = C43422row.OLrzqt(th);
            mHA.OLrzqt.OLrzqt(this.this$0.djBIcL, new AbstractC30126lMw.StateListAnimator(oKServerExceptionOLrzqt));
            this.this$0.OLrzqt(C33129mqd.gEmmrt(C56443yFo.AEQbTJ(oKServerExceptionOLrzqt.getCode())), C33129mqd.gEmmrt(oKServerExceptionOLrzqt.getRequestUrl()), C33129mqd.gEmmrt(oKServerExceptionOLrzqt.getMessage()));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            switch (StateListAnimator.AEQbTJ[this.this$0.uzCIH().getTradeType().ordinal()]) {
                case 1:
                case 2:
                    lyG lyg = this.this$0.fetchVPNInfo;
                    BuySellParameter buySellParameter = this.this$0.uzCIH().getBuySellParameter();
                    String strCopydefault = buySellParameter != null ? buySellParameter.copydefault() : null;
                    BuySellParameter buySellParameter2 = this.this$0.uzCIH().getBuySellParameter();
                    String strEZpvd = buySellParameter2 != null ? buySellParameter2.EZpvd() : null;
                    BuySellParameter buySellParameter3 = this.this$0.uzCIH().getBuySellParameter();
                    String strOLrzqt = buySellParameter3 != null ? buySellParameter3.OLrzqt() : null;
                    BuySellParameter buySellParameter4 = this.this$0.uzCIH().getBuySellParameter();
                    String strAEQbTJ = buySellParameter4 != null ? buySellParameter4.AEQbTJ() : null;
                    TradeType tradeType = this.this$0.uzCIH().getTradeType();
                    BuySellParameter buySellParameter5 = this.this$0.uzCIH().getBuySellParameter();
                    Integer numKWHzl = buySellParameter5 != null ? buySellParameter5.KWHzl() : null;
                    DexTokenParameters dexTokenParameters = this.this$0.uzCIH().getDexTokenParameters();
                    String strAEQbTJ2 = dexTokenParameters != null ? dexTokenParameters.AEQbTJ() : null;
                    DexTokenParameters dexTokenParameters2 = this.this$0.uzCIH().getDexTokenParameters();
                    String strKWHzl = dexTokenParameters2 != null ? dexTokenParameters2.KWHzl() : null;
                    this.label = 1;
                    objOLrzqt = lyg.OLrzqt(strCopydefault, strEZpvd, strOLrzqt, strAEQbTJ, tradeType, numKWHzl, true, false, strKWHzl, strAEQbTJ2, this);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    break;
                case 3:
                case 4:
                case 5:
                    listAhwBna = yDY.AhwBna();
                    if (this.this$0.AuCTel) {
                        mHA.OLrzqt.OLrzqt(this.this$0.valueOf, this.this$0.OLrzqt(listAhwBna));
                    } else {
                        mHA.OLrzqt.OLrzqt(this.this$0.valueOf, listAhwBna);
                    }
                    if (this.this$0.valueOf(listAhwBna)) {
                        mHA.OLrzqt.OLrzqt(this.this$0.DbNXlk, C56443yFo.KWHzl(true));
                    }
                    return Unit.INSTANCE;
                case 6:
                case 7:
                    listAhwBna = yDY.AhwBna();
                    if (this.this$0.AuCTel) {
                    }
                    if (this.this$0.valueOf(listAhwBna)) {
                    }
                    return Unit.INSTANCE;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = obj;
        }
        listAhwBna = (List) ((AbstractC43419rot) objOLrzqt).AEQbTJ();
        if (this.this$0.AuCTel) {
        }
        if (this.this$0.valueOf(listAhwBna)) {
        }
        return Unit.INSTANCE;
    }
}
