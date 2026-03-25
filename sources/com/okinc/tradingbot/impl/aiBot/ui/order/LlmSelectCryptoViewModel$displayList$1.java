package com.okinc.tradingbot.impl.aiBot.ui.order;

import com.okinc.unify_trade.bot.data.CommonEmptyData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C33070mpX;
import o.C47222tlv;
import o.C55688xof;
import o.C56391yDq;
import o.C56442yFn;
import o.uCB;
import o.yHO;

/* JADX INFO: loaded from: classes11.dex */
public final class LlmSelectCryptoViewModel$displayList$1 extends SuspendLambda implements yHO<String, List<? extends uCB>, Continuation<? super List<? extends Object>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LlmSelectCryptoViewModel$displayList$1(Continuation<? super LlmSelectCryptoViewModel$displayList$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(String str, List<? extends uCB> list, Continuation<? super List<? extends Object>> continuation) {
        return invoke2(str, (List<uCB>) list, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(String str, List<uCB> list, Continuation<? super List<? extends Object>> continuation) {
        LlmSelectCryptoViewModel$displayList$1 llmSelectCryptoViewModel$displayList$1 = new LlmSelectCryptoViewModel$displayList$1(continuation);
        llmSelectCryptoViewModel$displayList$1.L$0 = str;
        llmSelectCryptoViewModel$displayList$1.L$1 = list;
        return llmSelectCryptoViewModel$displayList$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.unify_trade.bot.data.CommonEmptyData.ActionBar.buildEmptyData$default(com.okinc.unify_trade.bot.data.CommonEmptyData$ActionBar, java.lang.String, int, java.lang.String, java.lang.String, boolean, boolean, int, java.lang.Object):java.util.List */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = (String) this.L$0;
            List list = (List) this.L$1;
            if (str.length() == 0) {
                return list.isEmpty() ? CommonEmptyData.ActionBar.buildEmptyData$default(CommonEmptyData.Companion, C33070mpX.AYXKKw(C55688xof.Application.dXcUrg), 0, null, null, false, false, 62, null) : list;
            }
            List listSearchAndSortItems$default = C47222tlv.searchAndSortItems$default(C47222tlv.KWHzl, str, list, null, false, 12, null);
            return listSearchAndSortItems$default.isEmpty() ? CommonEmptyData.ActionBar.buildNoResultData$default(CommonEmptyData.Companion, null, 0, 3, null) : listSearchAndSortItems$default;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
