package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.market.search.features.main.result.ui.page.SearchResultAnnouncementFragment$collectUiState$$inlined$map$1$2$1;
import com.okinc.market.search.features.main.result.ui.page.SearchResultAnnouncementFragment$collectUiState$3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qFM extends qFF<C42745rcH> {
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.qFO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return qFM.values();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.DPHsZd;
    }

    public static final qEP values() {
        return new qEP();
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Lo/qEe; */
    @Override // o.AbstractC40007qFx
    /* JADX INFO: renamed from: AkhnZx, reason: merged with bridge method [inline-methods] */
    public qEP OLrzqt() {
        return (qEP) this.AhwBna.getValue();
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/View;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40007qFx
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C42745rcH copydefault(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C42745rcH c42745rcHOLrzqt = C42745rcH.OLrzqt(view);
        Intrinsics.checkNotNullExpressionValue(c42745rcHOLrzqt, "");
        return c42745rcHOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;)V */
    @Override // o.AbstractC40007qFx
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull C42745rcH c42745rcH) {
        Intrinsics.checkNotNullParameter(c42745rcH, "");
        if (c42745rcH.EZpvd.getContext() == null || !isAdded()) {
            return;
        }
        RecyclerView recyclerView = c42745rcH.EZpvd;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        OLrzqt(recyclerView);
    }

    @Override // o.AbstractC40007qFx
    public java.lang.Object AEQbTJ(@NotNull Flow<C40078qIn> flow, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objCollectLatest = FlowKt.collectLatest(new ActionBar(flow), new SearchResultAnnouncementFragment$collectUiState$3(this, null), continuation);
        return objCollectLatest == C56442yFn.copydefault() ? objCollectLatest : Unit.INSTANCE;
    }

    public static final class ActionBar implements Flow<java.util.List<? extends C39993qFj>> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.qFM$ActionBar$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SearchResultAnnouncementFragment$collectUiState$$inlined$map$1$2$1 searchResultAnnouncementFragment$collectUiState$$inlined$map$1$2$1;
                if (continuation instanceof SearchResultAnnouncementFragment$collectUiState$$inlined$map$1$2$1) {
                    searchResultAnnouncementFragment$collectUiState$$inlined$map$1$2$1 = (SearchResultAnnouncementFragment$collectUiState$$inlined$map$1$2$1) continuation;
                    int i = searchResultAnnouncementFragment$collectUiState$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        searchResultAnnouncementFragment$collectUiState$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        searchResultAnnouncementFragment$collectUiState$$inlined$map$1$2$1 = new SearchResultAnnouncementFragment$collectUiState$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = searchResultAnnouncementFragment$collectUiState$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = searchResultAnnouncementFragment$collectUiState$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    C40078qIn c40078qIn = (C40078qIn) obj;
                    java.util.List<C39993qFj> listCopydefault = c40078qIn != null ? c40078qIn.copydefault() : null;
                    if (listCopydefault == null) {
                        listCopydefault = yDY.AhwBna();
                    }
                    searchResultAnnouncementFragment$collectUiState$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(listCopydefault, searchResultAnnouncementFragment$collectUiState$$inlined$map$1$2$1) == objCopydefault) {
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

        public ActionBar(Flow flow) {
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends C39993qFj>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
