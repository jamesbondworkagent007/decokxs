package o;

import com.okinc.market.search.features.main.result.ui.page.SearchResultContentFeedFragment$collectUiState$$inlined$map$1$2$1;
import com.okinc.market.search.features.main.result.ui.page.SearchResultContentFeedFragment$collectUiState$3;
import com.okinc.search.bean.SearchResultContentPo;
import kotlin.Result;
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

/* JADX INFO: renamed from: o.qGa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40011qGa extends AbstractC40007qFx<C42747rcJ> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public C39998qFo valueOf;
    public final int djBIcL = qZH.ActionBar.aJZHYI;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.qGc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C40011qGa.gEmmrt();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;)V */
    @Override // o.AbstractC40007qFx
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull C42747rcJ c42747rcJ) {
        Intrinsics.checkNotNullParameter(c42747rcJ, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.djBIcL;
    }

    /* JADX INFO: renamed from: o.qGa$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qGa.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static final qEN gEmmrt() {
        return new qEN();
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Lo/qEe; */
    /* JADX DEBUG: Possible override for method o.qFx.AhwBna()V */
    @Override // o.AbstractC40007qFx
    /* JADX INFO: renamed from: AhwBna, reason: merged with bridge method [inline-methods] */
    public qEN OLrzqt() {
        return (qEN) this.EZpvd.getValue();
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/View;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40007qFx
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C42747rcJ copydefault(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C42747rcJ c42747rcJOLrzqt = C42747rcJ.OLrzqt(view);
        Intrinsics.checkNotNullExpressionValue(c42747rcJOLrzqt, "");
        return c42747rcJOLrzqt;
    }

    /* JADX INFO: renamed from: o.qGa$Activity */
    public static final class Activity implements Flow<C39998qFo> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.qGa$Activity$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SearchResultContentFeedFragment$collectUiState$$inlined$map$1$2$1 searchResultContentFeedFragment$collectUiState$$inlined$map$1$2$1;
                if (continuation instanceof SearchResultContentFeedFragment$collectUiState$$inlined$map$1$2$1) {
                    searchResultContentFeedFragment$collectUiState$$inlined$map$1$2$1 = (SearchResultContentFeedFragment$collectUiState$$inlined$map$1$2$1) continuation;
                    int i = searchResultContentFeedFragment$collectUiState$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        searchResultContentFeedFragment$collectUiState$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        searchResultContentFeedFragment$collectUiState$$inlined$map$1$2$1 = new SearchResultContentFeedFragment$collectUiState$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = searchResultContentFeedFragment$collectUiState$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = searchResultContentFeedFragment$collectUiState$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    C40078qIn c40078qIn = (C40078qIn) obj;
                    C39998qFo c39998qFoEZpvd = c40078qIn != null ? c40078qIn.EZpvd() : null;
                    searchResultContentFeedFragment$collectUiState$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(c39998qFoEZpvd, searchResultContentFeedFragment$collectUiState$$inlined$map$1$2$1) == objCopydefault) {
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
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super C39998qFo> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.valueOf = null;
    }

    public final void copydefault(C39998qFo c39998qFo) {
        if (Intrinsics.EZpvd(this.valueOf, c39998qFo)) {
            C40375qTn.AEQbTJ.KWHzl(getTAG(), "Content unchanged, skip fragment update");
            return;
        }
        this.valueOf = c39998qFo;
        if (c39998qFo == null) {
            djBIcL();
        } else {
            AEQbTJ(c39998qFo);
        }
    }

    public final void djBIcL() {
        androidx.fragment.app.Fragment fragmentFindFragmentByTag;
        if (isAdded() && (fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("OrbitSearchResultFragment")) != null) {
            C40375qTn.AEQbTJ.KWHzl(getTAG(), "Removing existing OrbitSearchResultFragment");
            getChildFragmentManager().beginTransaction().remove(fragmentFindFragmentByTag).commitAllowingStateLoss();
        }
    }

    public final void AEQbTJ(C39998qFo c39998qFo) {
        java.lang.Object objM7377constructorimpl;
        if (!isAdded() || isStateSaved()) {
            C40375qTn.AEQbTJ.KWHzl(getTAG(), "Fragment not added or state saved, skip fragment update");
            return;
        }
        SearchResultContentPo searchResultContentPoKWHzl = c39998qFo.KWHzl();
        qHP qhpAEQbTJ = qHQ.AEQbTJ(this);
        java.lang.String strKWHzl = qhpAEQbTJ != null ? qhpAEQbTJ.KWHzl(this) : null;
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(((tWL) C43251rlk.copydefault(tWL.class)).AEQbTJ(searchResultContentPoKWHzl, strKWHzl));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C40375qTn.e$default(C40375qTn.AEQbTJ, getTAG(), "Failed to get OrbitSearchResultFragment: " + thM7380exceptionOrNullimpl.getMessage(), null, 4, null);
        }
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        if (fragment == null) {
            C40375qTn.w$default(C40375qTn.AEQbTJ, getTAG(), "OrbitSearchResultFragment is null, skip adding", null, 4, null);
        } else {
            getChildFragmentManager().beginTransaction().replace(qZH.StateListAnimator.HJWChPRGtXKC, fragment, "OrbitSearchResultFragment").commitAllowingStateLoss();
            C40375qTn.AEQbTJ.KWHzl(getTAG(), "OrbitSearchResultFragment added successfully");
        }
    }

    @Override // o.AbstractC40007qFx
    public java.lang.Object AEQbTJ(@NotNull Flow<C40078qIn> flow, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objCollectLatest = FlowKt.collectLatest(new Activity(flow), new SearchResultContentFeedFragment$collectUiState$3(this, null), continuation);
        return objCollectLatest == C56442yFn.copydefault() ? objCollectLatest : Unit.INSTANCE;
    }
}
