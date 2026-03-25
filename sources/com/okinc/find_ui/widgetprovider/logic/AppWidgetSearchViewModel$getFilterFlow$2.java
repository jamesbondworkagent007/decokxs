package com.okinc.find_ui.widgetprovider.logic;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C35119npM;
import o.C35197nql;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class AppWidgetSearchViewModel$getFilterFlow$2 extends SuspendLambda implements yHO<List<? extends C35119npM.Application>, String, Continuation<? super List<? extends C35119npM.Application>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ C35119npM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppWidgetSearchViewModel$getFilterFlow$2(C35119npM c35119npM, Continuation<? super AppWidgetSearchViewModel$getFilterFlow$2> continuation) {
        super(3, continuation);
        this.this$0 = c35119npM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(List<? extends C35119npM.Application> list, String str, Continuation<? super List<? extends C35119npM.Application>> continuation) {
        return invoke2((List<C35119npM.Application>) list, str, (Continuation<? super List<C35119npM.Application>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<C35119npM.Application> list, String str, Continuation<? super List<C35119npM.Application>> continuation) {
        AppWidgetSearchViewModel$getFilterFlow$2 appWidgetSearchViewModel$getFilterFlow$2 = new AppWidgetSearchViewModel$getFilterFlow$2(this.this$0, continuation);
        appWidgetSearchViewModel$getFilterFlow$2.L$0 = list;
        appWidgetSearchViewModel$getFilterFlow$2.L$1 = str;
        return appWidgetSearchViewModel$getFilterFlow$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zAhwBna;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List list = (List) this.L$0;
            String str = (String) this.L$1;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                arrayList.add(obj2);
            }
            if (StringsKt__StringsKt.hDKMBd((CharSequence) str).toString().length() == 0) {
                this.this$0.OLrzqt(false);
                return arrayList;
            }
            this.this$0.OLrzqt(true);
            C35119npM c35119npM = this.this$0;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                C35119npM.Application application = (C35119npM.Application) obj3;
                if (Intrinsics.EZpvd((Object) c35119npM.fetchVPNInfo, (Object) "P2P_MARKET_PREFS_KEY_STRING")) {
                    zAhwBna = c35119npM.copydefault(application.KWHzl().getInstId(), StringsKt__StringsKt.hDKMBd((CharSequence) str).toString());
                } else {
                    zAhwBna = StringsKt__StringsKt.AhwBna((CharSequence) C35197nql.AEQbTJ(application.KWHzl()), (CharSequence) StringsKt__StringsKt.hDKMBd((CharSequence) str).toString(), true);
                }
                if (zAhwBna) {
                    arrayList2.add(obj3);
                }
            }
            return arrayList2;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
