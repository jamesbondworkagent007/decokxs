package com.okinc.ok_kyc_core_okx_impl.foebidden.service;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionLegacyRepository$loadFeatureRestrictionInfos$2;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C32866mlf;
import o.C32868mlh;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.rUS;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class FeatureRestrictionLegacyRepository$loadFeatureRestrictionInfos$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super JSONObject>, Object> {
    int label;
    final /* synthetic */ rUS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureRestrictionLegacyRepository$loadFeatureRestrictionInfos$2(rUS rus, Continuation<? super FeatureRestrictionLegacyRepository$loadFeatureRestrictionInfos$2> continuation) {
        super(2, continuation);
        this.this$0 = rus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FeatureRestrictionLegacyRepository$loadFeatureRestrictionInfos$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super JSONObject> continuation) {
        return ((FeatureRestrictionLegacyRepository$loadFeatureRestrictionInfos$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        JSONObject jSONObjectOLrzqt;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            String string = SPUtils.getString("FeatureRestrictionDatas", "");
            if (C33129mqd.OLrzqt((CharSequence) string)) {
                rUS rus = this.this$0;
                Intrinsics.copydefault((Object) string);
                jSONObjectOLrzqt = rus.OLrzqt(string, true);
            } else {
                jSONObjectOLrzqt = null;
            }
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("feature_restriction_cache_load_time", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rUU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return FeatureRestrictionLegacyRepository$loadFeatureRestrictionInfos$2.invokeSuspend$lambda$0(jCurrentTimeMillis, (EventParamsList) obj2);
                }
            });
            pUU.EZpvd(this.this$0.valueOf(), "loadFeatureRestrictionInfos-----cache LoadTime=" + (System.currentTimeMillis() - jCurrentTimeMillis));
            return jSONObjectOLrzqt;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(long j, EventParamsList eventParamsList) {
        EventParamsList.put$default(eventParamsList, "loadCacheTime", String.valueOf(System.currentTimeMillis() - j), false, 4, null);
        return Unit.INSTANCE;
    }
}
