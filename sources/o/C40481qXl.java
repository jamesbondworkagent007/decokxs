package o;

import com.okinc.market.watch.usecase.SearchWatchListSubscribeUseCaseV2$onExecute$1;
import com.okinc.market.watch.usecase.SearchWatchListSubscribeUseCaseV2$onExecute$2;
import com.okinc.trade.arch.util.Quartet;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qXl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40481qXl extends AbstractC49400uno<Quartet<? extends Flow<? extends java.lang.String>, ? extends java.lang.String, ? extends java.lang.String, ? extends Function1<? super qWH, ? extends java.lang.Boolean>>, Flow<? extends Triple<? extends java.lang.String, ? extends java.lang.String, ? extends java.util.List<? extends qWH>>>> {
    public final C41575qtR<qWH> AEQbTJ;
    public final CoroutineDispatcher OLrzqt;
    public final qWV copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @yCM
    public C40481qXl(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull qWV qwv, @NotNull C41575qtR<qWH> c41575qtR) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(qwv, "");
        Intrinsics.checkNotNullParameter(c41575qtR, "");
        this.OLrzqt = coroutineDispatcher;
        this.copydefault = qwv;
        this.AEQbTJ = c41575qtR;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Quartet<? extends Flow<java.lang.String>, java.lang.String, java.lang.String, ? extends Function1<? super qWH, java.lang.Boolean>> quartet, @NotNull Continuation<? super Flow<? extends Triple<java.lang.String, java.lang.String, ? extends java.util.List<? extends qWH>>>> continuation) throws java.lang.Throwable {
        SearchWatchListSubscribeUseCaseV2$onExecute$1 searchWatchListSubscribeUseCaseV2$onExecute$1;
        C40481qXl c40481qXl;
        Function1<? super qWH, java.lang.Boolean> function1;
        Flow<java.lang.String> flow;
        java.lang.String str;
        java.lang.String str2;
        if (continuation instanceof SearchWatchListSubscribeUseCaseV2$onExecute$1) {
            searchWatchListSubscribeUseCaseV2$onExecute$1 = (SearchWatchListSubscribeUseCaseV2$onExecute$1) continuation;
            int i = searchWatchListSubscribeUseCaseV2$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchWatchListSubscribeUseCaseV2$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                searchWatchListSubscribeUseCaseV2$onExecute$1 = new SearchWatchListSubscribeUseCaseV2$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = searchWatchListSubscribeUseCaseV2$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = searchWatchListSubscribeUseCaseV2$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow<java.lang.String> flowComponent1 = quartet.component1();
            java.lang.String strComponent2 = quartet.component2();
            java.lang.String strComponent3 = quartet.component3();
            Function1<? super qWH, java.lang.Boolean> function1Component4 = quartet.component4();
            qWV qwv = this.copydefault;
            searchWatchListSubscribeUseCaseV2$onExecute$1.L$0 = this;
            searchWatchListSubscribeUseCaseV2$onExecute$1.L$1 = flowComponent1;
            searchWatchListSubscribeUseCaseV2$onExecute$1.L$2 = strComponent2;
            searchWatchListSubscribeUseCaseV2$onExecute$1.L$3 = strComponent3;
            searchWatchListSubscribeUseCaseV2$onExecute$1.L$4 = function1Component4;
            searchWatchListSubscribeUseCaseV2$onExecute$1.label = 1;
            java.lang.Object objEZpvd = qwv.EZpvd(strComponent2, (Continuation) searchWatchListSubscribeUseCaseV2$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c40481qXl = this;
            function1 = function1Component4;
            flow = flowComponent1;
            obj = objEZpvd;
            str = strComponent2;
            str2 = strComponent3;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Function1<? super qWH, java.lang.Boolean> function12 = (Function1) searchWatchListSubscribeUseCaseV2$onExecute$1.L$4;
            java.lang.String str3 = (java.lang.String) searchWatchListSubscribeUseCaseV2$onExecute$1.L$3;
            java.lang.String str4 = (java.lang.String) searchWatchListSubscribeUseCaseV2$onExecute$1.L$2;
            flow = (Flow) searchWatchListSubscribeUseCaseV2$onExecute$1.L$1;
            C40481qXl c40481qXl2 = (C40481qXl) searchWatchListSubscribeUseCaseV2$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            function1 = function12;
            c40481qXl = c40481qXl2;
            str2 = str3;
            str = str4;
        }
        return FlowKt.combine(flow, (Flow) obj, new SearchWatchListSubscribeUseCaseV2$onExecute$2(c40481qXl, str, str2, function1, null));
    }
}
