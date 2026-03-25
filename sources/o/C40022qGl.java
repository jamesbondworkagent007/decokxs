package o;

import com.okinc.im.bean.SearchResultData;
import com.okinc.market.search.features.main.result.ui.page.SearchResultIMChatFragment$collectUiState$$inlined$map$1$2$1;
import com.okinc.market.search.features.main.result.ui.page.SearchResultIMChatFragment$collectUiState$3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qGl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40022qGl extends AbstractC40007qFx<C42752rcO> {
    private static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final int AhwBna = qZH.ActionBar.RAQtXZ;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.qGk
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C40022qGl.gEmmrt();
        }
    });
    public C40001qFr valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;)V */
    @Override // o.AbstractC40007qFx
    public void EZpvd(@NotNull C42752rcO c42752rcO) {
        Intrinsics.checkNotNullParameter(c42752rcO, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AhwBna;
    }

    /* JADX INFO: renamed from: o.qGl$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qGl.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static final qEY gEmmrt() {
        return new qEY();
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Lo/qEe; */
    /* JADX DEBUG: Possible override for method o.qFx.AhwBna()V */
    @Override // o.AbstractC40007qFx
    /* JADX INFO: renamed from: AhwBna, reason: merged with bridge method [inline-methods] */
    public qEY OLrzqt() {
        return (qEY) this.copydefault.getValue();
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/View;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40007qFx
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42752rcO copydefault(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C42752rcO c42752rcOCopydefault = C42752rcO.copydefault(view);
        Intrinsics.checkNotNullExpressionValue(c42752rcOCopydefault, "");
        return c42752rcOCopydefault;
    }

    /* JADX INFO: renamed from: o.qGl$Activity */
    public static final class Activity implements Flow<C40001qFr> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: o.qGl$Activity$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.AEQbTJ = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SearchResultIMChatFragment$collectUiState$$inlined$map$1$2$1 searchResultIMChatFragment$collectUiState$$inlined$map$1$2$1;
                if (continuation instanceof SearchResultIMChatFragment$collectUiState$$inlined$map$1$2$1) {
                    searchResultIMChatFragment$collectUiState$$inlined$map$1$2$1 = (SearchResultIMChatFragment$collectUiState$$inlined$map$1$2$1) continuation;
                    int i = searchResultIMChatFragment$collectUiState$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        searchResultIMChatFragment$collectUiState$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        searchResultIMChatFragment$collectUiState$$inlined$map$1$2$1 = new SearchResultIMChatFragment$collectUiState$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = searchResultIMChatFragment$collectUiState$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = searchResultIMChatFragment$collectUiState$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    C40078qIn c40078qIn = (C40078qIn) obj;
                    C40001qFr c40001qFrDjBIcL = c40078qIn != null ? c40078qIn.djBIcL() : null;
                    searchResultIMChatFragment$collectUiState$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(c40001qFrDjBIcL, searchResultIMChatFragment$collectUiState$$inlined$map$1$2$1) == objCopydefault) {
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

        public Activity(Flow flow) {
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super C40001qFr> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public final void OLrzqt(C40001qFr c40001qFr) {
        androidx.fragment.app.Fragment fragmentCopydefault;
        if (Intrinsics.EZpvd(this.valueOf, c40001qFr)) {
            return;
        }
        this.valueOf = c40001qFr;
        if (c40001qFr == null) {
            androidx.fragment.app.Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("FeedChatSearchResultFragment");
            if (fragmentFindFragmentByTag == null) {
                return;
            }
            getChildFragmentManager().beginTransaction().remove(fragmentFindFragmentByTag).commitAllowingStateLoss();
            return;
        }
        qHP qhpAEQbTJ = qHQ.AEQbTJ(this);
        java.lang.String strKWHzl = qhpAEQbTJ != null ? qhpAEQbTJ.KWHzl(this) : null;
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC35180nqU.class));
        if (interfaceC35180nqU != null) {
            java.util.List<SearchResultData> listCopydefault = c40001qFr.copydefault();
            java.lang.String strKWHzl2 = OLrzqt().KWHzl();
            if (strKWHzl2 == null || (fragmentCopydefault = interfaceC35180nqU.copydefault(listCopydefault, strKWHzl2, strKWHzl, this)) == null) {
                return;
            }
            getChildFragmentManager().beginTransaction().replace(qZH.StateListAnimator.DMb, fragmentCopydefault, "FeedChatSearchResultFragment").commitAllowingStateLoss();
        }
    }

    @Override // o.AbstractC40007qFx
    public java.lang.Object AEQbTJ(@NotNull Flow<C40078qIn> flow, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objCollectLatest = FlowKt.collectLatest(new Activity(flow), new SearchResultIMChatFragment$collectUiState$3(this, null), continuation);
        return objCollectLatest == C56442yFn.copydefault() ? objCollectLatest : Unit.INSTANCE;
    }
}
