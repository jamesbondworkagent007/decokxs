package com.okinc.ok_kyc_core_okx_impl.foebidden.service;

import com.google.gson.JsonObject;
import com.okinc.core.util.SPUtils;
import com.okinc.kyc.api.biz.restriction.FeatureRestrictionDiffSet;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C42499rVc;
import o.C42500rVd;
import o.C42503rVg;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.rUO;
import o.rUP;
import o.rUS;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class FeatureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super JSONObject>, Object> {
    final /* synthetic */ Ref.ObjectRef<FeatureRestrictionDiffSet> $diffSet;
    final /* synthetic */ boolean $isLogin;
    int label;
    final /* synthetic */ rUS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$2(rUS rus, boolean z, Ref.ObjectRef<FeatureRestrictionDiffSet> objectRef, Continuation<? super FeatureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$2> continuation) {
        super(2, continuation);
        this.this$0 = rus;
        this.$isLogin = z;
        this.$diffSet = objectRef;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FeatureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$2(this.this$0, this.$isLogin, this.$diffSet, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super JSONObject> continuation) {
        return ((FeatureRestrictionLegacyRepository$triggerFeatureRestrictionAPIAndUpdatesLocalModels$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [T, com.okinc.kyc.api.biz.restriction.FeatureRestrictionDiffSet] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        ResponseData responseData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                String strEZpvd = this.this$0.iwGUEr.EZpvd();
                if (strEZpvd != null && !StringsKt__StringsKt.fARcdN((CharSequence) strEZpvd)) {
                    rUP rup = this.this$0.fetchVPNInfo;
                    this.label = 2;
                    obj = rUP.StateListAnimator.getFeatureRestrictions$default(rup, null, strEZpvd, this, 1, null);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    responseData = (ResponseData) obj;
                }
                rUP rup2 = this.this$0.fetchVPNInfo;
                this.label = 1;
                obj = rUP.StateListAnimator.getFeatureRestrictions$default(rup2, null, null, this, 3, null);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                responseData = (ResponseData) obj;
            } else if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                responseData = (ResponseData) obj;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                responseData = (ResponseData) obj;
            }
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                JsonObject jsonObject = (JsonObject) responseData.getData();
                String string = jsonObject != null ? jsonObject.toString() : null;
                if (string == null || StringsKt__StringsKt.fARcdN((CharSequence) string)) {
                    this.this$0.KWHzl(false);
                    this.this$0.EZpvd(false);
                    throw new Exception("Feature restriction data is null or empty");
                }
                if (rUO.OLrzqt.isConnected()) {
                    pUU.KWHzl(this.this$0.valueOf(), "updateFeatureRestrictions | E2E");
                    if (this.$isLogin != C42503rVg.KWHzl.copydefault().values() || !this.this$0.fJNWhG) {
                        pUU.KWHzl(this.this$0.valueOf(), "updateFeatureRestrictions | netwithfail=" + responseData.getData());
                        this.this$0.KWHzl(false);
                        this.this$0.EZpvd(false);
                        throw new Exception(responseData.getMsg());
                    }
                }
                String strValueOf = String.valueOf(this.this$0.copydefault());
                String strValueOf2 = String.valueOf(this.this$0.OLrzqt());
                String strValueOf3 = String.valueOf(this.this$0.EZpvd());
                String strValueOf4 = String.valueOf(this.this$0.KWHzl());
                JSONObject jSONObjectOLrzqt = this.this$0.OLrzqt(string, false);
                if (jSONObjectOLrzqt != null) {
                    C42500rVd.KWHzl.EZpvd(jSONObjectOLrzqt);
                }
                pUU.KWHzl(this.this$0.valueOf(), "updateFeatureRestrictions success | " + responseData.getData());
                SPUtils.put("FeatureRestrictionDatas", string);
                if (jSONObjectOLrzqt != null) {
                    this.$diffSet.element = this.this$0.KWHzl(strValueOf, strValueOf2, strValueOf3, strValueOf4, jSONObjectOLrzqt);
                }
                C42499rVc.AEQbTJ.OLrzqt();
                return jSONObjectOLrzqt;
            }
            pUU.KWHzl(this.this$0.valueOf(), "updateFeatureRestrictions failure | " + responseData.getData());
            this.this$0.KWHzl(false);
            this.this$0.EZpvd(false);
            throw new Exception(responseData.getMsg());
        } catch (Exception e) {
            pUU.KWHzl(this.this$0.valueOf(), "updateFeatureRestrictions failure | decoding error");
            this.this$0.KWHzl(false);
            this.this$0.EZpvd(false);
            throw new Exception(e.getMessage());
        }
    }
}
