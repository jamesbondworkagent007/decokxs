package com.okinc.okex.search.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.okex.center.bean.enums.CategorySlug;
import com.okinc.okex.search.ui.displaymodels.SearchArticleDisplayModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C44058sBu;
import o.C44059sBv;
import o.C44061sBx;
import o.C45426spa;
import o.C56390yDp;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C56442yFn;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class SearchResultArticlesViewModel extends AbstractC33073mpa {
    public final Map<CategorySlug, List<C45426spa.TaskDescription>> AYXKKw;
    public final StateFlow<ActionBar> AhwBna;
    public final MutableStateFlow<Pair<CategorySlug, List<C45426spa.TaskDescription>>> EZpvd;
    public final SavedStateHandle KWHzl;
    public final MutableStateFlow<ActionBar> OLrzqt;
    public final List<CategorySlug> copydefault;
    public final C44059sBv djBIcL;
    public final C44061sBx gEmmrt;
    public final StateFlow<Pair<CategorySlug, List<C45426spa.TaskDescription>>> isConnected;
    public final C44058sBu valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Pair<CategorySlug, List<C45426spa.TaskDescription>>> AYXKKw() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CategorySlug> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<ActionBar> valueOf() {
        return this.AhwBna;
    }

    @yCM
    public SearchResultArticlesViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C44059sBv c44059sBv, @NotNull C44061sBx c44061sBx, @NotNull C44058sBu c44058sBu) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c44059sBv, "");
        Intrinsics.checkNotNullParameter(c44061sBx, "");
        Intrinsics.checkNotNullParameter(c44058sBu, "");
        this.KWHzl = savedStateHandle;
        this.djBIcL = c44059sBv;
        this.gEmmrt = c44061sBx;
        this.valueOf = c44058sBu;
        this.copydefault = yDY.gEmmrt(CategorySlug.FAQ, CategorySlug.Announcement, CategorySlug.ProductDoc);
        this.AYXKKw = new LinkedHashMap();
        MutableStateFlow<Pair<CategorySlug, List<C45426spa.TaskDescription>>> MutableStateFlow = StateFlowKt.MutableStateFlow(C56390yDp.OLrzqt(CategorySlug.Unknown, yDY.AhwBna()));
        this.EZpvd = MutableStateFlow;
        this.isConnected = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<ActionBar> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new ActionBar.Application("", AEQbTJ()));
        this.OLrzqt = MutableStateFlow2;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.search.viewmodel.SearchResultArticlesViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static abstract class ActionBar {
        public final CategorySlug copydefault;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 com.okinc.okex.center.bean.enums.CategorySlug) A[MD:(com.okinc.okex.center.bean.enums.CategorySlug):void (m)] call: com.okinc.okex.search.viewmodel.SearchResultArticlesViewModel.ActionBar.<init>(com.okinc.okex.center.bean.enums.CategorySlug):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(CategorySlug categorySlug, DefaultConstructorMarker defaultConstructorMarker) {
            this(categorySlug);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public CategorySlug copydefault() {
            return this.copydefault;
        }

        public ActionBar(CategorySlug categorySlug) {
            this.copydefault = categorySlug;
        }

        public static final class Application extends ActionBar {
            public final CategorySlug KWHzl;
            public final String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, String str, CategorySlug categorySlug, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = application.OLrzqt;
                }
                if ((i & 2) != 0) {
                    categorySlug = application.KWHzl;
                }
                return application.EZpvd(str, categorySlug);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application EZpvd(@NotNull String str, @NotNull CategorySlug categorySlug) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(categorySlug, "");
                return new Application(str, categorySlug);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String KWHzl() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.okex.search.viewmodel.SearchResultArticlesViewModel.ActionBar
            public CategorySlug copydefault() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Application)) {
                    return false;
                }
                Application application = (Application) obj;
                return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) application.OLrzqt) && this.KWHzl == application.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.OLrzqt.hashCode() * 31) + this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Empty(keyword=" + this.OLrzqt + ", category=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull String str, @NotNull CategorySlug categorySlug) {
                super(categorySlug, null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(categorySlug, "");
                this.OLrzqt = str;
                this.KWHzl = categorySlug;
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class TaskDescription extends ActionBar {
            public final CategorySlug AEQbTJ;
            public final Throwable OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, Throwable th, CategorySlug categorySlug, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = taskDescription.OLrzqt;
                }
                if ((i & 2) != 0) {
                    categorySlug = taskDescription.AEQbTJ;
                }
                return taskDescription.KWHzl(th, categorySlug);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Throwable AEQbTJ() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription KWHzl(@NotNull Throwable th, @NotNull CategorySlug categorySlug) {
                Intrinsics.checkNotNullParameter(th, "");
                Intrinsics.checkNotNullParameter(categorySlug, "");
                return new TaskDescription(th, categorySlug);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.okex.search.viewmodel.SearchResultArticlesViewModel.ActionBar
            public CategorySlug copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TaskDescription)) {
                    return false;
                }
                TaskDescription taskDescription = (TaskDescription) obj;
                return Intrinsics.EZpvd(this.OLrzqt, taskDescription.OLrzqt) && this.AEQbTJ == taskDescription.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Error(throwable=" + this.OLrzqt + ", category=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull Throwable th, @NotNull CategorySlug categorySlug) {
                super(categorySlug, null);
                Intrinsics.checkNotNullParameter(th, "");
                Intrinsics.checkNotNullParameter(categorySlug, "");
                this.OLrzqt = th;
                this.AEQbTJ = categorySlug;
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class Activity extends ActionBar {
            public final boolean AEQbTJ;
            public final CategorySlug EZpvd;
            public final List<SearchArticleDisplayModel> KWHzl;
            public final String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.search.viewmodel.SearchResultArticlesViewModel$ActionBar$Activity */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Activity copy$default(Activity activity, String str, List list, boolean z, CategorySlug categorySlug, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = activity.OLrzqt;
                }
                if ((i & 2) != 0) {
                    list = activity.KWHzl;
                }
                if ((i & 4) != 0) {
                    z = activity.AEQbTJ;
                }
                if ((i & 8) != 0) {
                    categorySlug = activity.EZpvd;
                }
                return activity.KWHzl(str, list, z, categorySlug);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String EZpvd() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity KWHzl(@NotNull String str, @NotNull List<SearchArticleDisplayModel> list, boolean z, @NotNull CategorySlug categorySlug) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(categorySlug, "");
                return new Activity(str, list, z, categorySlug);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean KWHzl() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<SearchArticleDisplayModel> OLrzqt() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.okex.search.viewmodel.SearchResultArticlesViewModel.ActionBar
            public CategorySlug copydefault() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Activity)) {
                    return false;
                }
                Activity activity = (Activity) obj;
                return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) activity.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, activity.KWHzl) && this.AEQbTJ == activity.AEQbTJ && this.EZpvd == activity.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((((this.OLrzqt.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + Boolean.hashCode(this.AEQbTJ)) * 31) + this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Success(keyword=" + this.OLrzqt + ", listOfSearchResult=" + this.KWHzl + ", hasNextPage=" + this.AEQbTJ + ", category=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull String str, @NotNull List<SearchArticleDisplayModel> list, boolean z, @NotNull CategorySlug categorySlug) {
                super(categorySlug, null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(categorySlug, "");
                this.OLrzqt = str;
                this.KWHzl = list;
                this.AEQbTJ = z;
                this.EZpvd = categorySlug;
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class StateListAnimator extends ActionBar {
            public final CategorySlug AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, CategorySlug categorySlug, int i, Object obj) {
                if ((i & 1) != 0) {
                    categorySlug = stateListAnimator.AEQbTJ;
                }
                return stateListAnimator.KWHzl(categorySlug);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator KWHzl(@NotNull CategorySlug categorySlug) {
                Intrinsics.checkNotNullParameter(categorySlug, "");
                return new StateListAnimator(categorySlug);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.okex.search.viewmodel.SearchResultArticlesViewModel.ActionBar
            public CategorySlug copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && this.AEQbTJ == ((StateListAnimator) obj).AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "PageEnd(category=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull CategorySlug categorySlug) {
                super(categorySlug, null);
                Intrinsics.checkNotNullParameter(categorySlug, "");
                this.AEQbTJ = categorySlug;
            }
        }
    }

    public final String gEmmrt() {
        String str = (String) this.KWHzl.get("ARG_PAGE_SOURCE");
        return str == null ? "" : str;
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.set("ARG_PAGE_SOURCE", str);
    }

    public final String EZpvd() {
        String str = (String) this.KWHzl.get("ARG_CURRENT_KEYWORD");
        return str == null ? "" : str;
    }

    public final int djBIcL() {
        Integer num = (Integer) this.KWHzl.get("ARG_RESULT_PAGE");
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public final StateFlow<CategorySlug> OLrzqt() {
        return this.KWHzl.getStateFlow("ARG_CURRENT_TAB", CategorySlug.Unknown);
    }

    public final CategorySlug AEQbTJ() {
        return OLrzqt().getValue();
    }

    public final int AhwBna() {
        return this.copydefault.indexOf(AEQbTJ());
    }

    public final void copydefault(int i) {
        CategorySlug categorySlug;
        if (i < 0 || i >= this.copydefault.size() || (categorySlug = this.copydefault.get(i)) == AEQbTJ()) {
            return;
        }
        this.KWHzl.set("ARG_CURRENT_TAB", categorySlug);
    }

    public final void EZpvd(int i) {
        this.KWHzl.set("ARG_RESULT_PAGE", Integer.valueOf(i));
    }

    public final void AkhnZx() {
        this.KWHzl.set("ARG_RESULT_PAGE", 1);
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SearchResultArticlesViewModel$newSearch$1(this, str, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(int i, Continuation<? super Unit> continuation) throws Throwable {
        SearchResultArticlesViewModel$performArticleSearch$1 searchResultArticlesViewModel$performArticleSearch$1;
        ActionBar value;
        ArrayList arrayList;
        SearchResultArticlesViewModel searchResultArticlesViewModel;
        ActionBar actionBar;
        Object objM7377constructorimpl;
        SearchResultArticlesViewModel searchResultArticlesViewModel2;
        if (continuation instanceof SearchResultArticlesViewModel$performArticleSearch$1) {
            searchResultArticlesViewModel$performArticleSearch$1 = (SearchResultArticlesViewModel$performArticleSearch$1) continuation;
            int i2 = searchResultArticlesViewModel$performArticleSearch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                searchResultArticlesViewModel$performArticleSearch$1.label = i2 - Integer.MIN_VALUE;
            } else {
                searchResultArticlesViewModel$performArticleSearch$1 = new SearchResultArticlesViewModel$performArticleSearch$1(this, continuation);
            }
        }
        Object objOLrzqt = searchResultArticlesViewModel$performArticleSearch$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = searchResultArticlesViewModel$performArticleSearch$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            String strEZpvd = EZpvd();
            if (StringsKt__StringsKt.fARcdN((CharSequence) strEZpvd)) {
                strEZpvd = null;
            }
            value = this.OLrzqt.getValue();
            List<? extends CategorySlug> listEZpvd = C56402yEa.EZpvd(AEQbTJ());
            List<C45426spa.TaskDescription> list = this.AYXKKw.get(AEQbTJ());
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (((C45426spa.TaskDescription) obj).OLrzqt() && (!StringsKt__StringsKt.fARcdN((CharSequence) r6.copydefault()))) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((C45426spa.TaskDescription) it.next()).copydefault());
                }
                if (!(!arrayList3.isEmpty())) {
                    arrayList3 = null;
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            try {
                Result.Application application = Result.Companion;
                C44059sBv c44059sBv = this.djBIcL;
                searchResultArticlesViewModel$performArticleSearch$1.L$0 = this;
                searchResultArticlesViewModel$performArticleSearch$1.L$1 = value;
                searchResultArticlesViewModel$performArticleSearch$1.I$0 = i;
                searchResultArticlesViewModel$performArticleSearch$1.label = 1;
                objOLrzqt = c44059sBv.OLrzqt(strEZpvd, listEZpvd, arrayList, i, 20, searchResultArticlesViewModel$performArticleSearch$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                searchResultArticlesViewModel = this;
                actionBar = value;
            } catch (Throwable th) {
                th = th;
                searchResultArticlesViewModel = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                actionBar = value;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2 && i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = searchResultArticlesViewModel$performArticleSearch$1.I$0;
                searchResultArticlesViewModel2 = (SearchResultArticlesViewModel) searchResultArticlesViewModel$performArticleSearch$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                searchResultArticlesViewModel2.EZpvd(i);
                return Unit.INSTANCE;
            }
            i = searchResultArticlesViewModel$performArticleSearch$1.I$0;
            actionBar = (ActionBar) searchResultArticlesViewModel$performArticleSearch$1.L$1;
            searchResultArticlesViewModel = (SearchResultArticlesViewModel) searchResultArticlesViewModel$performArticleSearch$1.L$0;
            try {
                C56391yDq.AEQbTJ(objOLrzqt);
            } catch (Throwable th2) {
                th = th2;
                value = actionBar;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                actionBar = value;
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((List) objOLrzqt);
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            ActionBar actionBarEZpvd = searchResultArticlesViewModel.EZpvd((List) objM7377constructorimpl, i, actionBar);
            MutableStateFlow<ActionBar> mutableStateFlow = searchResultArticlesViewModel.OLrzqt;
            searchResultArticlesViewModel$performArticleSearch$1.L$0 = searchResultArticlesViewModel;
            searchResultArticlesViewModel$performArticleSearch$1.L$1 = null;
            searchResultArticlesViewModel$performArticleSearch$1.I$0 = i;
            searchResultArticlesViewModel$performArticleSearch$1.label = 2;
            if (mutableStateFlow.emit(actionBarEZpvd, searchResultArticlesViewModel$performArticleSearch$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            ActionBar actionBarCopydefault = searchResultArticlesViewModel.copydefault(i, thM7380exceptionOrNullimpl);
            MutableStateFlow<ActionBar> mutableStateFlow2 = searchResultArticlesViewModel.OLrzqt;
            searchResultArticlesViewModel$performArticleSearch$1.L$0 = searchResultArticlesViewModel;
            searchResultArticlesViewModel$performArticleSearch$1.L$1 = null;
            searchResultArticlesViewModel$performArticleSearch$1.I$0 = i;
            searchResultArticlesViewModel$performArticleSearch$1.label = 3;
            if (mutableStateFlow2.emit(actionBarCopydefault, searchResultArticlesViewModel$performArticleSearch$1) == objCopydefault) {
                return objCopydefault;
            }
        }
        searchResultArticlesViewModel2 = searchResultArticlesViewModel;
        searchResultArticlesViewModel2.EZpvd(i);
        return Unit.INSTANCE;
    }

    public final ActionBar EZpvd(List<SearchArticleDisplayModel> list, int i, ActionBar actionBar) {
        List<SearchArticleDisplayModel> listAhwBna;
        boolean z = list.size() >= 20;
        if (i <= 1) {
            if (!list.isEmpty()) {
                return new ActionBar.Activity(EZpvd(), list, z, AEQbTJ());
            }
            return new ActionBar.Application(EZpvd(), AEQbTJ());
        }
        if (list.isEmpty()) {
            return new ActionBar.StateListAnimator(AEQbTJ());
        }
        if (actionBar instanceof ActionBar.Activity) {
            listAhwBna = ((ActionBar.Activity) actionBar).OLrzqt();
        } else {
            listAhwBna = yDY.AhwBna();
        }
        return new ActionBar.Activity(EZpvd(), CollectionsKt___CollectionsKt.djBIcL((Collection) listAhwBna, (Iterable) list), z, AEQbTJ());
    }

    public final ActionBar copydefault(int i, Throwable th) {
        if (i == 1) {
            return new ActionBar.TaskDescription(th, AEQbTJ());
        }
        return new ActionBar.StateListAnimator(AEQbTJ());
    }

    public final void DbNXlk() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SearchResultArticlesViewModel$retryLastSearch$1(this, null), 3, null);
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SearchResultArticlesViewModel$fetchAnnouncements$1(this, null), 3, null);
    }

    public final void values() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SearchResultArticlesViewModel$loadMore$1(this, djBIcL() + 1, null), 3, null);
    }

    public final void EZpvd(@NotNull CategorySlug categorySlug) {
        Intrinsics.checkNotNullParameter(categorySlug, "");
        if (categorySlug == CategorySlug.Announcement) {
            List<C45426spa.TaskDescription> list = this.AYXKKw.get(categorySlug);
            if (list == null || list.isEmpty()) {
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SearchResultArticlesViewModel$loadSearchTags$1(this, categorySlug, null), 3, null);
            }
        }
    }

    public final void OLrzqt(@NotNull CategorySlug categorySlug, @NotNull C45426spa.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(categorySlug, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        List<C45426spa.TaskDescription> list = this.AYXKKw.get(categorySlug);
        if (list != null) {
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (C45426spa.TaskDescription taskDescription2 : list) {
                arrayList.add(C45426spa.TaskDescription.copy$default(taskDescription2, null, null, Intrinsics.EZpvd((Object) taskDescription2.copydefault(), (Object) taskDescription.copydefault()) && !taskDescription2.OLrzqt(), null, 11, null));
            }
            this.AYXKKw.put(categorySlug, arrayList);
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SearchResultArticlesViewModel$selectSearchTag$1$1(this, categorySlug, arrayList, null), 3, null);
        }
    }

    public final List<C45426spa.TaskDescription> OLrzqt(@NotNull CategorySlug categorySlug) {
        Intrinsics.checkNotNullParameter(categorySlug, "");
        List<C45426spa.TaskDescription> list = this.AYXKKw.get(categorySlug);
        return list == null ? yDY.AhwBna() : list;
    }

    public final void OLrzqt(@NotNull SearchArticleDisplayModel searchArticleDisplayModel) {
        Intrinsics.checkNotNullParameter(searchArticleDisplayModel, "");
        this.valueOf.EZpvd(searchArticleDisplayModel);
    }
}
