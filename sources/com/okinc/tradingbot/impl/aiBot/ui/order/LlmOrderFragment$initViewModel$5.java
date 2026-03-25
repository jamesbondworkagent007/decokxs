package com.okinc.tradingbot.impl.aiBot.ui.order;

import android.widget.TextView;
import com.okinc.tradingbot.impl.aiBot.ui.order.LlmOrderFragment$initViewModel$5;
import com.okinc.unify_trade.biz.DataSetting;
import com.okinc.unify_trade.biz.TechnicalIndex;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC48473uSs;
import o.C33070mpX;
import o.C48112uFk;
import o.C55688xof;
import o.C56391yDq;
import o.C56442yFn;
import o.pTB;

/* JADX INFO: loaded from: classes16.dex */
public final class LlmOrderFragment$initViewModel$5 extends SuspendLambda implements Function2<DataSetting, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C48112uFk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LlmOrderFragment$initViewModel$5(C48112uFk c48112uFk, Continuation<? super LlmOrderFragment$initViewModel$5> continuation) {
        super(2, continuation);
        this.this$0 = c48112uFk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LlmOrderFragment$initViewModel$5 llmOrderFragment$initViewModel$5 = new LlmOrderFragment$initViewModel$5(this.this$0, continuation);
        llmOrderFragment$initViewModel$5.L$0 = obj;
        return llmOrderFragment$initViewModel$5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DataSetting dataSetting, Continuation<? super Unit> continuation) {
        return ((LlmOrderFragment$initViewModel$5) create(dataSetting, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            DataSetting dataSetting = (DataSetting) this.L$0;
            String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.StyleableRes);
            AbstractC48473uSs abstractC48473uSsIsConnected = C48112uFk.isConnected(this.this$0);
            TextView textView = abstractC48473uSsIsConnected.valueOf;
            String aiThinkingInterval = dataSetting.getAiThinkingInterval();
            if (aiThinkingInterval == null || aiThinkingInterval.length() == 0 || StringsKt__StringsKt.fARcdN((CharSequence) aiThinkingInterval)) {
                aiThinkingInterval = strAYXKKw;
            }
            textView.setText(aiThinkingInterval);
            TextView textView2 = abstractC48473uSsIsConnected.fetchVPNInfo;
            String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(dataSetting.getKLineLevels(), null, null, null, 0, null, null, 63, null);
            if (strJoinToString$default.length() == 0) {
                strJoinToString$default = strAYXKKw;
            }
            textView2.setText(strJoinToString$default);
            TextView textView3 = abstractC48473uSsIsConnected.gEmmrt;
            String strJoinToString$default2 = CollectionsKt___CollectionsKt.joinToString$default(dataSetting.getTechnicalIndexes(), null, null, null, 0, null, new Function1() { // from class: o.uFA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return LlmOrderFragment$initViewModel$5.invokeSuspend$lambda$4$lambda$2((TechnicalIndex) obj2);
                }
            }, 31, null);
            if (strJoinToString$default2.length() != 0) {
                strAYXKKw = strJoinToString$default2;
            }
            textView3.setText(strAYXKKw);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence invokeSuspend$lambda$4$lambda$2(TechnicalIndex technicalIndex) {
        String str;
        if (technicalIndex.getParams().isEmpty()) {
            str = "";
        } else {
            str = "(" + CollectionsKt___CollectionsKt.joinToString$default(technicalIndex.getParams(), null, null, null, 0, null, new Function1() { // from class: o.uFE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LlmOrderFragment$initViewModel$5.invokeSuspend$lambda$4$lambda$2$lambda$1((java.lang.String) obj);
                }
            }, 31, null) + ")";
        }
        return technicalIndex.getIndicator() + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence invokeSuspend$lambda$4$lambda$2$lambda$1(String str) {
        return pTB.formatLocalized$default(str, null, 1, null);
    }
}
