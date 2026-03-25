package com.okinc.buysell.ui.paymentmethod.select;

import com.okinc.buysell.ui.paymentmethod.data.BuySellParameter;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okpaymentapi.data.remote.model.management.Account;
import com.okinc.okpaymentapi.data.remote.model.management.Channel;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okx.paymentapi.service.DexTokenParameters;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC30126lMw;
import o.AbstractC43419rot;
import o.C33129mqd;
import o.C43422row;
import o.C46876tfT;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.lyG;
import o.mHA;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class SelectPaymentMethodViewModel$getBuySellPaymentChannelsV3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Channel> $cachedChannels;
    int label;
    final /* synthetic */ SelectPaymentMethodViewModel this$0;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

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
                iArr[TradeType.TOPUP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TradeType.ADDFUNDS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TradeType.STABLECOIN_DEPOSIT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectPaymentMethodViewModel$getBuySellPaymentChannelsV3$1(SelectPaymentMethodViewModel selectPaymentMethodViewModel, List<Channel> list, Continuation<? super SelectPaymentMethodViewModel$getBuySellPaymentChannelsV3$1> continuation) {
        super(2, continuation);
        this.this$0 = selectPaymentMethodViewModel;
        this.$cachedChannels = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SelectPaymentMethodViewModel$getBuySellPaymentChannelsV3$1(this.this$0, this.$cachedChannels, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SelectPaymentMethodViewModel$getBuySellPaymentChannelsV3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0236 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:5:0x0011, B:44:0x010d, B:45:0x0115, B:48:0x011b, B:50:0x0125, B:52:0x012d, B:107:0x0225, B:109:0x0236, B:110:0x023b, B:112:0x0243, B:55:0x0135, B:56:0x0139, B:58:0x013f, B:60:0x015f, B:62:0x016d, B:64:0x017b, B:66:0x0189, B:68:0x0193, B:70:0x019d, B:72:0x01a3, B:74:0x01a9, B:76:0x01b3, B:78:0x01bb, B:81:0x01c3, B:82:0x01c7, B:84:0x01cd, B:86:0x01e5, B:88:0x01ec, B:90:0x01f2, B:92:0x01f9, B:94:0x01ff, B:96:0x0205, B:98:0x020c, B:100:0x0212, B:102:0x0219, B:17:0x0062, B:18:0x0074, B:19:0x0077, B:113:0x0251, B:114:0x0254, B:20:0x007b, B:21:0x0083, B:23:0x0095, B:25:0x009d, B:27:0x00a9, B:29:0x00b1, B:31:0x00c7, B:33:0x00cf, B:35:0x00db, B:37:0x00e3, B:39:0x00ef, B:41:0x00f7), top: B:118:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0243 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:5:0x0011, B:44:0x010d, B:45:0x0115, B:48:0x011b, B:50:0x0125, B:52:0x012d, B:107:0x0225, B:109:0x0236, B:110:0x023b, B:112:0x0243, B:55:0x0135, B:56:0x0139, B:58:0x013f, B:60:0x015f, B:62:0x016d, B:64:0x017b, B:66:0x0189, B:68:0x0193, B:70:0x019d, B:72:0x01a3, B:74:0x01a9, B:76:0x01b3, B:78:0x01bb, B:81:0x01c3, B:82:0x01c7, B:84:0x01cd, B:86:0x01e5, B:88:0x01ec, B:90:0x01f2, B:92:0x01f9, B:94:0x01ff, B:96:0x0205, B:98:0x020c, B:100:0x0212, B:102:0x0219, B:17:0x0062, B:18:0x0074, B:19:0x0077, B:113:0x0251, B:114:0x0254, B:20:0x007b, B:21:0x0083, B:23:0x0095, B:25:0x009d, B:27:0x00a9, B:29:0x00b1, B:31:0x00c7, B:33:0x00cf, B:35:0x00db, B:37:0x00e3, B:39:0x00ef, B:41:0x00f7), top: B:118:0x000d }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        Object objOLrzqt;
        List listAhwBna;
        List<Channel> list;
        boolean z2;
        List<PaymentMethod> paymentMethods;
        List<PaymentMethod> paymentMethods2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            mHA mha = mHA.OLrzqt;
            mha.OLrzqt(this.this$0.AYXKKw, C56443yFo.KWHzl(false));
            OKServerException oKServerExceptionOLrzqt = C43422row.OLrzqt(th);
            mha.OLrzqt(this.this$0.djBIcL, new AbstractC30126lMw.StateListAnimator(oKServerExceptionOLrzqt));
            this.this$0.OLrzqt(C33129mqd.gEmmrt(C56443yFo.AEQbTJ(oKServerExceptionOLrzqt.getCode())), C33129mqd.gEmmrt(oKServerExceptionOLrzqt.getRequestUrl()), C33129mqd.gEmmrt(oKServerExceptionOLrzqt.getMessage()));
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = obj;
            z = true;
        } else {
            C56391yDq.AEQbTJ(obj);
            mHA mha2 = mHA.OLrzqt;
            mha2.OLrzqt(this.this$0.djBIcL, AbstractC30126lMw.ActionBar.AEQbTJ);
            if (this.$cachedChannels == null || !(!r2.isEmpty())) {
                mha2.OLrzqt(this.this$0.AYXKKw, C56443yFo.KWHzl(true));
            } else {
                mha2.OLrzqt(this.this$0.AYXKKw, C56443yFo.KWHzl(false));
                this.this$0.copydefault((List<Channel>) this.$cachedChannels);
            }
            switch (TaskDescription.copydefault[this.this$0.uzCIH().getTradeType().ordinal()]) {
                case 1:
                case 2:
                    lyG lyg = this.this$0.fetchVPNInfo;
                    BuySellParameter buySellParameter = this.this$0.uzCIH().getBuySellParameter();
                    String strEZpvd = buySellParameter != null ? buySellParameter.EZpvd() : null;
                    BuySellParameter buySellParameter2 = this.this$0.uzCIH().getBuySellParameter();
                    String strAEQbTJ = buySellParameter2 != null ? buySellParameter2.AEQbTJ() : null;
                    TradeType tradeType = this.this$0.uzCIH().getTradeType();
                    BuySellParameter buySellParameter3 = this.this$0.uzCIH().getBuySellParameter();
                    Integer numKWHzl = buySellParameter3 != null ? buySellParameter3.KWHzl() : null;
                    DexTokenParameters dexTokenParameters = this.this$0.uzCIH().getDexTokenParameters();
                    String strAEQbTJ2 = dexTokenParameters != null ? dexTokenParameters.AEQbTJ() : null;
                    DexTokenParameters dexTokenParameters2 = this.this$0.uzCIH().getDexTokenParameters();
                    String strKWHzl = dexTokenParameters2 != null ? dexTokenParameters2.KWHzl() : null;
                    this.label = 1;
                    z = true;
                    objOLrzqt = lyg.OLrzqt((5 & 1) != 0 ? null : null, (5 & 2) != 0 ? null : strEZpvd, (5 & 4) != 0 ? null : null, (5 & 8) != 0 ? null : strAEQbTJ, (5 & 16) != 0 ? TradeType.BUY : tradeType, (5 & 32) != 0 ? null : numKWHzl, (5 & 64) != 0 ? false : true, (5 & 128) != 0 ? false : true, (5 & 256) != 0 ? null : strKWHzl, (5 & 512) != 0 ? null : strAEQbTJ2, this);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    listAhwBna = yDY.AhwBna();
                    z = true;
                    list = this.$cachedChannels;
                    if (list != null || listAhwBna == null || list.size() != listAhwBna.size()) {
                        z2 = z;
                        mHA mha3 = mHA.OLrzqt;
                        mha3.OLrzqt(this.this$0.AYXKKw, C56443yFo.KWHzl(false));
                        if (z2) {
                            this.this$0.copydefault((List<Channel>) listAhwBna);
                        }
                        if (this.this$0.valueOf(listAhwBna)) {
                            mha3.OLrzqt(this.this$0.DbNXlk, C56443yFo.KWHzl(z));
                        }
                    } else {
                        List<Pair> listValues = CollectionsKt___CollectionsKt.values(list, listAhwBna);
                        if (!(listValues instanceof Collection) || !listValues.isEmpty()) {
                            for (Pair pair : listValues) {
                                Object objComponent1 = pair.component1();
                                Channel channel = (Channel) pair.component2();
                                Channel channel2 = (Channel) objComponent1;
                                if (Intrinsics.EZpvd((Object) channel2.getDepositPlatformCode(), (Object) channel.getDepositPlatformCode()) && Intrinsics.EZpvd((Object) channel2.getSupportCurrency(), (Object) channel.getSupportCurrency()) && Intrinsics.EZpvd((Object) channel2.getAvailableAmount(), (Object) channel.getAvailableAmount()) && Intrinsics.EZpvd(C46876tfT.KWHzl(channel2), C46876tfT.KWHzl(channel)) && channel2.getGooglePayReadyToUse() == channel.getGooglePayReadyToUse() && channel2.getGooglePaySupportedButNotSetup() == channel.getGooglePaySupportedButNotSetup() && (paymentMethods = channel2.getPaymentMethods()) != null && (paymentMethods2 = channel.getPaymentMethods()) != null && paymentMethods.size() == paymentMethods2.size()) {
                                    List<Pair> listValues2 = CollectionsKt___CollectionsKt.values(paymentMethods, paymentMethods2);
                                    if (!(listValues2 instanceof Collection) || !listValues2.isEmpty()) {
                                        for (Pair pair2 : listValues2) {
                                            Object objComponent12 = pair2.component1();
                                            PaymentMethod paymentMethod = (PaymentMethod) pair2.component2();
                                            PaymentMethod paymentMethod2 = (PaymentMethod) objComponent12;
                                            Account account = paymentMethod2.getAccount();
                                            String paymentAccountId = account != null ? account.getPaymentAccountId() : null;
                                            Account account2 = paymentMethod.getAccount();
                                            if (Intrinsics.EZpvd((Object) paymentAccountId, (Object) (account2 != null ? account2.getPaymentAccountId() : null))) {
                                                Account account3 = paymentMethod2.getAccount();
                                                String availableBalance = account3 != null ? account3.getAvailableBalance() : null;
                                                Account account4 = paymentMethod.getAccount();
                                                if (Intrinsics.EZpvd((Object) availableBalance, (Object) (account4 != null ? account4.getAvailableBalance() : null))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                z2 = z;
                                mHA mha32 = mHA.OLrzqt;
                                mha32.OLrzqt(this.this$0.AYXKKw, C56443yFo.KWHzl(false));
                                if (z2) {
                                }
                                if (this.this$0.valueOf(listAhwBna)) {
                                }
                            }
                        }
                        z2 = false;
                        mHA mha322 = mHA.OLrzqt;
                        mha322.OLrzqt(this.this$0.AYXKKw, C56443yFo.KWHzl(false));
                        if (z2) {
                        }
                        if (this.this$0.valueOf(listAhwBna)) {
                        }
                    }
                    return Unit.INSTANCE;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        listAhwBna = (List) ((AbstractC43419rot) objOLrzqt).AEQbTJ();
        list = this.$cachedChannels;
        if (list != null) {
            z2 = z;
            mHA mha3222 = mHA.OLrzqt;
            mha3222.OLrzqt(this.this$0.AYXKKw, C56443yFo.KWHzl(false));
            if (z2) {
            }
            if (this.this$0.valueOf(listAhwBna)) {
            }
        }
        return Unit.INSTANCE;
    }
}
