package com.okinc.business.defi.common.utils;

import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class ReferralManager$reportCodeError$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $from;
    final /* synthetic */ String $regexListString;
    final /* synthetic */ String $url;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralManager$reportCodeError$1(String str, String str2, String str3, Continuation<? super ReferralManager$reportCodeError$1> continuation) {
        super(2, continuation);
        this.$url = str;
        this.$regexListString = str2;
        this.$from = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReferralManager$reportCodeError$1(this.$url, this.$regexListString, this.$from, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReferralManager$reportCodeError$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                EventData eventData = new EventData();
                eventData.setAct("web3_wallet_log");
                eventData.setMsg("report execute link failed");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("attr_1", this.$url);
                linkedHashMap.put("attr_2", this.$regexListString);
                linkedHashMap.put("attr_3", this.$from);
                eventData.setAttrs(linkedHashMap);
                ReportManager.AEQbTJ.EZpvd(eventData);
            } catch (Exception e) {
                pUU.AEQbTJ("ReportCodeError", "Failed to report code error", e);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
