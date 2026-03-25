package com.okinc.tradingbot.impl.order.strategy.signalbot.ui.dialog;

import com.okinc.oksearch.analytics.FuzzySearchEventSourceEnum;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.SignalMultiCoinPairSelectItemData;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.StringsKt__StringsKt;
import o.C33070mpX;
import o.C47222tlv;
import o.C52861wac;
import o.C55688xof;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes11.dex */
public final class SignalMultiCoinSelectViewModel$displayList$2 extends SuspendLambda implements yHO<Pair<? extends List<? extends SignalMultiCoinPairSelectItemData>, ? extends String>, C52861wac.Activity, Continuation<? super List<? extends Object>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalMultiCoinSelectViewModel$displayList$2(Continuation<? super SignalMultiCoinSelectViewModel$displayList$2> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(Pair<? extends List<? extends SignalMultiCoinPairSelectItemData>, ? extends String> pair, C52861wac.Activity activity, Continuation<? super List<? extends Object>> continuation) {
        return invoke2((Pair<? extends List<SignalMultiCoinPairSelectItemData>, String>) pair, activity, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Pair<? extends List<SignalMultiCoinPairSelectItemData>, String> pair, C52861wac.Activity activity, Continuation<? super List<? extends Object>> continuation) {
        SignalMultiCoinSelectViewModel$displayList$2 signalMultiCoinSelectViewModel$displayList$2 = new SignalMultiCoinSelectViewModel$displayList$2(continuation);
        signalMultiCoinSelectViewModel$displayList$2.L$0 = pair;
        signalMultiCoinSelectViewModel$displayList$2.L$1 = activity;
        return signalMultiCoinSelectViewModel$displayList$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.wac.Activity.copy$default(o.wac$Activity, boolean, boolean, int, java.lang.Object):o.wac$Activity */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Pair pair = (Pair) this.L$0;
            C52861wac.Activity activity = (C52861wac.Activity) this.L$1;
            List listSearchAndSortItems$default = (List) pair.component1();
            String str = (String) pair.component2();
            List listOLrzqt = C56402yEa.OLrzqt();
            if ((listSearchAndSortItems$default instanceof Collection) && listSearchAndSortItems$default.isEmpty()) {
                z = false;
            } else {
                Iterator it = listSearchAndSortItems$default.iterator();
                while (it.hasNext()) {
                    if (((SignalMultiCoinPairSelectItemData) it.next()).gEmmrt()) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            listOLrzqt.add(C52861wac.Activity.copy$default(activity, false, z, 1, null));
            if (!StringsKt__StringsKt.fARcdN((CharSequence) str)) {
                listSearchAndSortItems$default = C47222tlv.searchAndSortItems$default(C47222tlv.KWHzl, str, listSearchAndSortItems$default, FuzzySearchEventSourceEnum.OKTRADE_MULTI_COIN.getSource(), false, 8, null);
                if (listSearchAndSortItems$default.isEmpty()) {
                    listSearchAndSortItems$default = CommonEmptyData.ActionBar.buildNoResultData$default(CommonEmptyData.Companion, null, 0, 3, null);
                }
            } else if (listSearchAndSortItems$default.isEmpty()) {
                listSearchAndSortItems$default = CommonEmptyData.ActionBar.buildEmptyData$default(CommonEmptyData.Companion, C33070mpX.AYXKKw(C55688xof.Application.dXcUrg), 0, null, null, false, false, 62, null);
            }
            listOLrzqt.addAll(listSearchAndSortItems$default);
            return C56402yEa.fARcdN(listOLrzqt);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
