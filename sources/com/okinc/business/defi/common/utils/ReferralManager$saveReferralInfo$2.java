package com.okinc.business.defi.common.utils;

import com.okinc.business.defi.biz.database.extra.bean.ReferralInfoBean;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C11286cIp;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class ReferralManager$saveReferralInfo$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ Map<String, String> $addressMap;
    final /* synthetic */ String $code;
    final /* synthetic */ String $inviterAddress;
    final /* synthetic */ String $rate;
    final /* synthetic */ String $signMsg;
    final /* synthetic */ String $signature;
    final /* synthetic */ AbstractC12782ctV $wallet;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ReferralManager this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralManager$saveReferralInfo$2(AbstractC12782ctV abstractC12782ctV, String str, String str2, Map<String, String> map, String str3, String str4, String str5, ReferralManager referralManager, Continuation<? super ReferralManager$saveReferralInfo$2> continuation) {
        super(2, continuation);
        this.$wallet = abstractC12782ctV;
        this.$code = str;
        this.$inviterAddress = str2;
        this.$addressMap = map;
        this.$rate = str3;
        this.$signMsg = str4;
        this.$signature = str5;
        this.this$0 = referralManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReferralManager$saveReferralInfo$2(this.$wallet, this.$code, this.$inviterAddress, this.$addressMap, this.$rate, this.$signMsg, this.$signature, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((ReferralManager$saveReferralInfo$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strValueOf;
        ReferralInfoBean referralInfoBean;
        Object objCopydefault;
        String str;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "saveReferralInfo: Exception occurred", e);
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("DexReferral", "saveReferralInfo: Starting save for accountId=" + this.$wallet.DbNXlk() + ", code=" + this.$code + ", inviterAddress=" + this.$inviterAddress + ", addressMap=" + this.$addressMap + ", rate=" + this.$rate + ", signMsg=" + this.$signMsg + ", signature=" + this.$signature);
            if (this.this$0.KWHzl(this.$wallet, (Map<String, String>) this.$addressMap)) {
                pUU.KWHzl("DexReferral", "saveReferralInfo: final check self bind");
                return C56443yFo.KWHzl(false);
            }
            strValueOf = String.valueOf(this.$wallet.QwvEab().ordinal());
            String strAYXKKw = this.this$0.AYXKKw(this.$wallet);
            if (strAYXKKw != null && C33129mqd.OLrzqt((CharSequence) this.$signMsg) && C33129mqd.OLrzqt((CharSequence) this.$signature)) {
                referralInfoBean = new ReferralInfoBean(this.$code, this.$inviterAddress, this.$addressMap, false, this.$rate, this.$signMsg, this.$signature);
                String json = referralInfoBean.toJson();
                pUU.KWHzl("DexReferral", "saveReferralInfo: walletType=" + strValueOf + ", walletAddress = " + strAYXKKw + ", code=" + this.$code + ", referralInfoBeanString=" + json);
                C11286cIp c11286cIp = this.this$0.gEmmrt;
                int iOrdinal = this.$wallet.QwvEab().ordinal();
                this.L$0 = strValueOf;
                this.L$1 = strAYXKKw;
                this.L$2 = referralInfoBean;
                this.label = 1;
                objCopydefault = c11286cIp.copydefault(String.valueOf(iOrdinal), strAYXKKw, json, this);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                str = strAYXKKw;
            } else {
                pUU.KWHzl("DexReferral", "saveReferralInfo: walletAddress empty");
                return C56443yFo.KWHzl(false);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ReferralInfoBean referralInfoBean2 = (ReferralInfoBean) this.L$2;
            str = (String) this.L$1;
            strValueOf = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
            referralInfoBean = referralInfoBean2;
            objCopydefault = obj;
        }
        boolean zBooleanValue = ((Boolean) objCopydefault).booleanValue();
        if (zBooleanValue) {
            pUU.KWHzl("DexReferral", "saveReferralInfo: success");
            this.this$0.AhwBna.put(this.this$0.EZpvd(strValueOf, str), referralInfoBean);
        } else {
            pUU.valueOf("DexReferral", "saveReferralInfo error");
        }
        return C56443yFo.KWHzl(zBooleanValue);
    }
}
