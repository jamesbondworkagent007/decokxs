package com.okinc.business.defi.wallet.tee.converter.ui.activity;

import com.okinc.business.defi.biz.core.ws.channel.SmallAssetsTxStatusSubManager;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC17855fUu;
import o.C10854bwM;
import o.C33129mqd;
import o.C54870xYj;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes18.dex */
public final class SmallAssetsConverterResultActivity$txStatusSubListener$1$onSubData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C10854bwM $chainCoinMeta;
    final /* synthetic */ SmallAssetsTxStatusSubManager.SubResponseData $item;
    int label;
    final /* synthetic */ ActivityC17855fUu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmallAssetsConverterResultActivity$txStatusSubListener$1$onSubData$1(SmallAssetsTxStatusSubManager.SubResponseData subResponseData, ActivityC17855fUu activityC17855fUu, C10854bwM c10854bwM, Continuation<? super SmallAssetsConverterResultActivity$txStatusSubListener$1$onSubData$1> continuation) {
        super(2, continuation);
        this.$item = subResponseData;
        this.this$0 = activityC17855fUu;
        this.$chainCoinMeta = c10854bwM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SmallAssetsConverterResultActivity$txStatusSubListener$1$onSubData$1(this.$item, this.this$0, this.$chainCoinMeta, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SmallAssetsConverterResultActivity$txStatusSubListener$1$onSubData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String coinFromFee$default;
        String successNativeTokenAmount;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!C33129mqd.AEQbTJ(this.$item.getSuccessOrderCount(), C56443yFo.AEQbTJ(0))) {
                this.this$0.copydefault();
            } else {
                ActivityC17855fUu activityC17855fUu = this.this$0;
                String totalNetworkFee = this.$item.getTotalNetworkFee();
                String str = "--";
                if (totalNetworkFee != null) {
                    C10854bwM c10854bwM = this.$chainCoinMeta;
                    int iAkhnZx = c10854bwM != null ? c10854bwM.AkhnZx() : 6;
                    C10854bwM c10854bwM2 = this.$chainCoinMeta;
                    coinFromFee$default = C54870xYj.formatCoinFromFee$default(totalNetworkFee, iAkhnZx, c10854bwM2 != null ? c10854bwM2.fJNWhG() : null, null, false, null, false, 60, null);
                    if (coinFromFee$default == null) {
                    }
                    successNativeTokenAmount = this.$item.getSuccessNativeTokenAmount();
                    if (successNativeTokenAmount != null) {
                    }
                    activityC17855fUu.KWHzl(coinFromFee$default, str, C33129mqd.AhwBna(this.$item.getFailedOrderCount()));
                } else {
                    coinFromFee$default = "--";
                    successNativeTokenAmount = this.$item.getSuccessNativeTokenAmount();
                    if (successNativeTokenAmount != null) {
                        C10854bwM c10854bwM3 = this.$chainCoinMeta;
                        int iAkhnZx2 = c10854bwM3 != null ? c10854bwM3.AkhnZx() : 6;
                        C10854bwM c10854bwM4 = this.$chainCoinMeta;
                        String strOLrzqt = C54870xYj.OLrzqt(successNativeTokenAmount, (249 & 1) != 0 ? 0 : 0, iAkhnZx2, c10854bwM4 != null ? c10854bwM4.fJNWhG() : null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
                        if (strOLrzqt != null) {
                            str = strOLrzqt;
                        }
                    }
                    activityC17855fUu.KWHzl(coinFromFee$default, str, C33129mqd.AhwBna(this.$item.getFailedOrderCount()));
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
