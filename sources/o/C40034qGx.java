package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.market.search.features.main.result.ui.page.SearchResultTraderFragment$collectUiState$$inlined$map$1$2$1;
import com.okinc.market.search.features.main.result.ui.page.SearchResultTraderFragment$collectUiState$3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qGx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40034qGx extends qFI<C42751rcN> {
    public final int djBIcL = qZH.ActionBar.geLlBI;
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.qGw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C40034qGx.isConnected();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.djBIcL;
    }

    public static final C39987qFd isConnected() {
        return new C39987qFd();
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Lo/qEe; */
    @Override // o.AbstractC40007qFx
    /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
    public C39987qFd OLrzqt() {
        return (C39987qFd) this.AhwBna.getValue();
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/View;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40007qFx
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C42751rcN copydefault(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C42751rcN c42751rcNOLrzqt = C42751rcN.OLrzqt(view);
        Intrinsics.checkNotNullExpressionValue(c42751rcNOLrzqt, "");
        return c42751rcNOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;)V */
    @Override // o.AbstractC40007qFx
    public void EZpvd(@NotNull C42751rcN c42751rcN) {
        Intrinsics.checkNotNullParameter(c42751rcN, "");
        RecyclerView recyclerView = c42751rcN.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        OLrzqt(recyclerView);
    }

    @Override // o.AbstractC40007qFx
    public java.lang.Object AEQbTJ(@NotNull Flow<C40078qIn> flow, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objCollectLatest = FlowKt.collectLatest(new Application(flow), new SearchResultTraderFragment$collectUiState$3(this, null), continuation);
        return objCollectLatest == C56442yFn.copydefault() ? objCollectLatest : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.qGx$Application */
    public static final class Application implements Flow<java.util.List<? extends C40006qFw>> {
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: o.qGx$Application$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SearchResultTraderFragment$collectUiState$$inlined$map$1$2$1 searchResultTraderFragment$collectUiState$$inlined$map$1$2$1;
                if (continuation instanceof SearchResultTraderFragment$collectUiState$$inlined$map$1$2$1) {
                    searchResultTraderFragment$collectUiState$$inlined$map$1$2$1 = (SearchResultTraderFragment$collectUiState$$inlined$map$1$2$1) continuation;
                    int i = searchResultTraderFragment$collectUiState$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        searchResultTraderFragment$collectUiState$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        searchResultTraderFragment$collectUiState$$inlined$map$1$2$1 = new SearchResultTraderFragment$collectUiState$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = searchResultTraderFragment$collectUiState$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = searchResultTraderFragment$collectUiState$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    C40078qIn c40078qIn = (C40078qIn) obj;
                    java.util.List<C40006qFw> listIsConnected = c40078qIn != null ? c40078qIn.isConnected() : null;
                    if (listIsConnected == null) {
                        listIsConnected = yDY.AhwBna();
                    }
                    searchResultTraderFragment$collectUiState$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(listIsConnected, searchResultTraderFragment$collectUiState$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Application(Flow flow) {
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends C40006qFw>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
