package com.okinc.oksearch.analytics;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.oksearch.analytics.FuzzySearchEventTracker;
import com.okinc.oksearch.analytics.FuzzySearchEventTracker$trackFuzzySearchStart$1;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C32866mlf;
import o.C56391yDq;
import o.C56442yFn;
import o.C59462zhW;
import o.C59519zia;

/* JADX INFO: loaded from: classes10.dex */
public final class FuzzySearchEventTracker$trackFuzzySearchStart$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $fuzzySize;
    final /* synthetic */ String $identifier;
    final /* synthetic */ CharSequence $input;
    final /* synthetic */ List<T> $items;
    final /* synthetic */ String $timeCost;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FuzzySearchEventTracker$trackFuzzySearchStart$1(List<? extends T> list, String str, CharSequence charSequence, String str2, String str3, Continuation<? super FuzzySearchEventTracker$trackFuzzySearchStart$1> continuation) {
        super(2, continuation);
        this.$items = list;
        this.$identifier = str;
        this.$input = charSequence;
        this.$fuzzySize = str2;
        this.$timeCost = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuzzySearchEventTracker$trackFuzzySearchStart$1(this.$items, this.$identifier, this.$input, this.$fuzzySize, this.$timeCost, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuzzySearchEventTracker$trackFuzzySearchStart$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C59462zhW.Activity activity = C59462zhW.OLrzqt;
            long jEZpvd = C59519zia.EZpvd(1, DurationUnit.SECONDS);
            this.label = 1;
            if (DelayKt.m7393delayVtjQ1oo(jEZpvd, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        final List<T> list = this.$items;
        final String str = this.$identifier;
        final CharSequence charSequence = this.$input;
        final String str2 = this.$fuzzySize;
        final String str3 = this.$timeCost;
        C32866mlf.onEvent$default("Search_Search_FuzzySearchStart_View", (TrackChannel[]) null, new Function1() { // from class: o.tlG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return FuzzySearchEventTracker$trackFuzzySearchStart$1.invokeSuspend$lambda$0(list, str, charSequence, str2, str3, (EventParamsList) obj2);
            }
        }, 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(List list, String str, CharSequence charSequence, String str2, String str3, EventParamsList eventParamsList) {
        FuzzySearchEventTracker.AEQbTJ.invoke(eventParamsList);
        FuzzySearchEventTracker fuzzySearchEventTracker = FuzzySearchEventTracker.EZpvd;
        Pair pairOLrzqt = fuzzySearchEventTracker.OLrzqt(list, FuzzySearchEventTracker.SearchType.SEARCH_MATCHER_PRIMARY);
        Pair pairOLrzqt2 = fuzzySearchEventTracker.OLrzqt(list, FuzzySearchEventTracker.SearchType.SEARCH_MATCHER_SECONDARY);
        EventParamsList.put$default(eventParamsList, "identifier", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, Web3SecurityTrackEvent.VALUE_INPUT, String.valueOf(charSequence), false, 4, null);
        EventParamsList.put$default(eventParamsList, "size_original", String.valueOf(list.size()), false, 4, null);
        EventParamsList.put$default(eventParamsList, "size_fuzzy", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "primary_avg", (String) pairOLrzqt.getFirst(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "primary_var", (String) pairOLrzqt.getSecond(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "secondary_avg", (String) pairOLrzqt2.getFirst(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "secondary_var", (String) pairOLrzqt2.getSecond(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "time_cost", str3, false, 4, null);
        return Unit.INSTANCE;
    }
}
