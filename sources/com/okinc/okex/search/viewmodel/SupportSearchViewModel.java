package com.okinc.okex.search.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.okex.center.bean.enums.CategorySlug;
import com.okinc.okex.search.ui.displaymodels.SearchArticleDisplayModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C44058sBu;
import o.C44760scx;
import o.C45366soT;
import o.C56391yDq;
import o.C56442yFn;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class SupportSearchViewModel extends AbstractC33073mpa {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final MutableStateFlow<String> AEQbTJ;
    public boolean AYXKKw;
    public final StateFlow<CategorySlug> AhwBna;
    public final MutableStateFlow<Activity> EZpvd;
    public final MutableStateFlow<CategorySlug> KWHzl;
    public final MutableStateFlow<StateListAnimator> OLrzqt;
    public final Flow<String> djBIcL;
    public final StateFlow<StateListAnimator> fetchVPNInfo;
    public final C44058sBu gEmmrt;
    public final SavedStateHandle valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<String> EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<StateListAnimator> valueOf() {
        return this.fetchVPNInfo;
    }

    @yCM
    public SupportSearchViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C44058sBu c44058sBu) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c44058sBu, "");
        this.valueOf = savedStateHandle;
        this.gEmmrt = c44058sBu;
        MutableStateFlow<StateListAnimator> MutableStateFlow = StateFlowKt.MutableStateFlow(StateListAnimator.C0569StateListAnimator.OLrzqt);
        this.OLrzqt = MutableStateFlow;
        this.fetchVPNInfo = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<String> MutableStateFlow2 = StateFlowKt.MutableStateFlow("");
        this.AEQbTJ = MutableStateFlow2;
        this.djBIcL = FlowKt.debounce(MutableStateFlow2, 300L);
        this.EZpvd = StateFlowKt.MutableStateFlow(new Activity(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
        MutableStateFlow<CategorySlug> MutableStateFlow3 = StateFlowKt.MutableStateFlow(CategorySlug.Unknown);
        this.KWHzl = MutableStateFlow3;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow3);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.search.viewmodel.SupportSearchViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static abstract class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.search.viewmodel.SupportSearchViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class Activity extends StateListAnimator {
            public final String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = activity.OLrzqt;
                }
                return activity.KWHzl(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity KWHzl(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Activity(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String copydefault() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) ((Activity) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SearchInput(keyword=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.OLrzqt = str;
            }
        }

        /* JADX INFO: renamed from: com.okinc.okex.search.viewmodel.SupportSearchViewModel$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class C0569StateListAnimator extends StateListAnimator {
            public static final C0569StateListAnimator OLrzqt = new C0569StateListAnimator();

            private C0569StateListAnimator() {
                super(null);
            }
        }

        public static final class Application extends StateListAnimator {
            public static final Application EZpvd = new Application();

            private Application() {
                super(null);
            }
        }

        public static final class ActionBar extends StateListAnimator {
            public static final ActionBar OLrzqt = new ActionBar();

            private ActionBar() {
                super(null);
            }
        }
    }

    public static final class Activity {
        public final String AEQbTJ;
        public final String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = activity.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = activity.EZpvd;
            }
            return activity.EZpvd(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@NotNull String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
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
            return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) activity.AEQbTJ) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) activity.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AEQbTJ.hashCode();
            String str = this.EZpvd;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SearchParamsPayload(keyword=" + this.AEQbTJ + ", intentId=" + this.EZpvd + ")";
        }

        public Activity(@NotNull String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
            this.EZpvd = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:50) call: com.okinc.okex.search.viewmodel.SupportSearchViewModel.Activity.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Activity(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2);
        }
    }

    public final String djBIcL() {
        String str = (String) this.valueOf.get("ARG_PAGE_SOURCE");
        return str == null ? "" : str;
    }

    public final String AEQbTJ() {
        return (String) this.valueOf.get("ARG_PAGE_SCENARIO");
    }

    public final StateFlow<Activity> AYXKKw() {
        return FlowKt.asStateFlow(this.EZpvd);
    }

    public final String OLrzqt() {
        return this.AEQbTJ.getValue();
    }

    public final String copydefault() {
        return (String) this.valueOf.get("ARG_INTENT_ID");
    }

    public final boolean KWHzl() {
        Boolean bool = (Boolean) this.valueOf.get("ARG_HAS_INTENTS");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: com.okinc.okex.search.viewmodel.SupportSearchViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SupportSearchViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow<String> flowEZpvd = SupportSearchViewModel.this.EZpvd();
                C05681 c05681 = new C05681(SupportSearchViewModel.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowEZpvd, c05681, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.okex.search.viewmodel.SupportSearchViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05681 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SupportSearchViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05681(SupportSearchViewModel supportSearchViewModel, Continuation<? super C05681> continuation) {
                super(2, continuation);
                this.this$0 = supportSearchViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C05681 c05681 = new C05681(this.this$0, continuation);
                c05681.L$0 = obj;
                return c05681;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return ((C05681) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    String str = (String) this.L$0;
                    C44760scx.log$default("SupportSearchViewModel: keywordHintFlow > pendingSearch: " + this.this$0.AYXKKw + " | text: " + str, null, 2, null);
                    if (StringsKt__StringsKt.fARcdN((CharSequence) str)) {
                        MutableStateFlow mutableStateFlow = this.this$0.OLrzqt;
                        StateListAnimator.C0569StateListAnimator c0569StateListAnimator = StateListAnimator.C0569StateListAnimator.OLrzqt;
                        this.label = 1;
                        if (mutableStateFlow.emit(c0569StateListAnimator, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (this.this$0.AYXKKw) {
                        this.this$0.AYXKKw = false;
                        this.this$0.AhwBna();
                    } else {
                        MutableStateFlow mutableStateFlow2 = this.this$0.OLrzqt;
                        StateListAnimator.Application application = StateListAnimator.Application.EZpvd;
                        this.label = 2;
                        if (mutableStateFlow2.emit(application, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf.set("ARG_PAGE_SOURCE", str);
    }

    public final void OLrzqt(String str) {
        this.valueOf.set("ARG_PAGE_SCENARIO", str);
    }

    public final void gEmmrt() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SupportSearchViewModel$gotoSuggestions$1(this, null), 3, null);
    }

    public final void EZpvd(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl(str2);
        if (!Intrinsics.EZpvd((Object) str, (Object) OLrzqt())) {
            this.AYXKKw = true;
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SupportSearchViewModel$updateSearchInput$1(this, str, null), 3, null);
        } else {
            AhwBna();
        }
    }

    public final void EZpvd(String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SupportSearchViewModel$updateSearchKeyword$1(this, str, null), 3, null);
    }

    public final void KWHzl(String str) {
        C44760scx.log$default("SupportSearchViewModel: updateIntentId > intentId: " + str, null, 2, null);
        this.valueOf.set("ARG_INTENT_ID", str);
    }

    public final void AEQbTJ(boolean z) {
        C44760scx.log$default("SupportSearchViewModel: updateHasIntents > hasIntents: " + z, null, 2, null);
        this.valueOf.set("ARG_HAS_INTENTS", Boolean.valueOf(z));
    }

    public final void AhwBna() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SupportSearchViewModel$initiateSearch$1(this, null), 3, null);
    }

    public final void AEQbTJ(@NotNull CategorySlug categorySlug) {
        Intrinsics.checkNotNullParameter(categorySlug, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SupportSearchViewModel$updateSelectedCategory$1(this, categorySlug, null), 3, null);
    }

    public final void AEQbTJ(@NotNull SearchArticleDisplayModel searchArticleDisplayModel) {
        Intrinsics.checkNotNullParameter(searchArticleDisplayModel, "");
        this.gEmmrt.EZpvd(searchArticleDisplayModel);
    }

    public final void values() {
        C45366soT.KWHzl.AhwBna();
    }
}
