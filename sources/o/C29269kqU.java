package o;

import android.widget.CompoundButton;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelStoreOwner;
import com.okinc.business.market.features.meme.filter.domain.TokenAgeType;
import com.okinc.business.market.features.meme.filter.ui.MemeUnitSelectionBottomSheetParams;
import com.okinc.business.market.features.meme.selection_filter.MemeSelection;
import com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilter;
import com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilterBottomSheetViewModel;
import com.okinc.business.market.widget.chart.RankingFilterEditView;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$1;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$2;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$3;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$4;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.C28729kgK;
import o.C31197lpV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kqU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29269kqU extends AbstractC29258kqJ implements InterfaceC28728kgJ {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int gEmmrt = 8;
    public C21629hGl AYXKKw;
    public boolean djBIcL;
    public final InterfaceC56387yDm valueOf;

    public C29269kqU() {
        C31197lpV c31197lpV = C31197lpV.EZpvd;
        InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new FragmentUtils$matchViewModel$$inlined$viewModels$default$1(new StateListAnimator(this)));
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TrendingFilterBottomSheetViewModel.class), new FragmentUtils$matchViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd), new FragmentUtils$matchViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd), new FragmentUtils$matchViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd));
    }

    /* JADX INFO: renamed from: o.kqU$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kqU.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C29269kqU copydefault() {
            C29269kqU c29269kqU = new C29269kqU();
            c29269kqU.setArguments(BundleKt.bundleOf());
            return c29269kqU;
        }
    }

    /* JADX INFO: renamed from: o.kqU$StateListAnimator */
    public static final class StateListAnimator implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(androidx.fragment.app.Fragment fragment) {
            this.EZpvd = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            java.util.Iterator it = C59405zgS.EZpvd(this.EZpvd, (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) C31197lpV.ActionBar.AnonymousClass1.EZpvd)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((androidx.fragment.app.Fragment) next) instanceof C29260kqL) {
                    break;
                }
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
            if (fragment != null) {
                return fragment;
            }
            java.lang.Object objThrowIfDebug$default = C31200lpY.throwIfDebug$default(this.EZpvd.requireActivity(), null, 2, null);
            Intrinsics.copydefault(objThrowIfDebug$default);
            return (ViewModelStoreOwner) objThrowIfDebug$default;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TrendingFilterBottomSheetViewModel gEmmrt() {
        return (TrendingFilterBottomSheetViewModel) this.valueOf.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21629hGl c21629hGlCopydefault = C21629hGl.copydefault(layoutInflater, viewGroup, false);
        this.AYXKKw = c21629hGlCopydefault;
        if (c21629hGlCopydefault != null) {
            return c21629hGlCopydefault.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        valueOf();
        djBIcL();
        AYXKKw();
        fetchVPNInfo();
        AhwBna();
        view.post(new java.lang.Runnable() { // from class: o.kqX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C29269kqU.AhwBna(this.OLrzqt);
            }
        });
    }

    public static final void AhwBna(C29269kqU c29269kqU) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c29269kqU, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void valueOf() {
        C21629hGl c21629hGl = this.AYXKKw;
        if (c21629hGl != null) {
            RankingFilterEditView rankingFilterEditView = c21629hGl.copydefault;
            int i = C23274hvD.Fragment.sEAkxl;
            C23272hvB c23272hvB = C23272hvB.KWHzl;
            rankingFilterEditView.setFilterTitle(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("currency", c23272hvB.OLrzqt().getSymbol()))));
            RankingFilterEditView.InputSymbol inputSymbol = RankingFilterEditView.InputSymbol.NoSymbol;
            rankingFilterEditView.setHintSymbolMode(inputSymbol);
            rankingFilterEditView.AYXKKw();
            Intrinsics.copydefault(rankingFilterEditView);
            KWHzl(rankingFilterEditView, new Function2() { // from class: o.kqS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C29269kqU.AEQbTJ(this.OLrzqt, (java.lang.String) obj, (java.lang.String) obj2);
                }
            });
            RankingFilterEditView rankingFilterEditView2 = c21629hGl.AhwBna;
            rankingFilterEditView2.setFilterTitle(C33069mpW.copydefault(C23274hvD.Fragment.onLocationChanged, C56423yEv.EZpvd(C56390yDp.OLrzqt("currency", c23272hvB.OLrzqt().getSymbol()))));
            rankingFilterEditView2.setHintSymbolMode(inputSymbol);
            rankingFilterEditView2.AYXKKw();
            Intrinsics.copydefault(rankingFilterEditView2);
            KWHzl(rankingFilterEditView2, new Function2() { // from class: o.kqR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C29269kqU.EZpvd(this.EZpvd, (java.lang.String) obj, (java.lang.String) obj2);
                }
            });
            RankingFilterEditView rankingFilterEditView3 = c21629hGl.OLrzqt;
            rankingFilterEditView3.setFilterTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.openFileOutput));
            rankingFilterEditView3.setHintSymbolMode(inputSymbol);
            rankingFilterEditView3.AYXKKw();
            rankingFilterEditView3.setupUnitPicker(new Function0() { // from class: o.kqY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C29269kqU.valueOf(this.copydefault);
                }
            });
            Intrinsics.copydefault(rankingFilterEditView3);
            KWHzl(rankingFilterEditView3, new Function2() { // from class: o.kra
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C29269kqU.djBIcL(this.KWHzl, (java.lang.String) obj, (java.lang.String) obj2);
                }
            });
        }
    }

    public static final Unit AEQbTJ(C29269kqU c29269kqU, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        c29269kqU.gEmmrt().EZpvd(str, str2);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C29269kqU c29269kqU, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        c29269kqU.gEmmrt().copydefault(str, str2);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C29269kqU c29269kqU) {
        c29269kqU.DbNXlk();
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C29269kqU c29269kqU, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        c29269kqU.gEmmrt().OLrzqt(str, str2, c29269kqU.gEmmrt().EZpvd().getValue().EZpvd().AYXKKw());
        return Unit.INSTANCE;
    }

    public final void AYXKKw() {
        C55239xgG c55239xgG;
        C21629hGl c21629hGl = this.AYXKKw;
        if (c21629hGl == null || (c55239xgG = c21629hGl.AEQbTJ) == null) {
            return;
        }
        c55239xgG.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.kqW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C29269kqU.AEQbTJ(this.KWHzl, compoundButton, z);
            }
        });
    }

    public static final void AEQbTJ(C29269kqU c29269kqU, android.widget.CompoundButton compoundButton, boolean z) {
        if (c29269kqU.djBIcL) {
            return;
        }
        c29269kqU.gEmmrt().EZpvd(z);
    }

    /* JADX INFO: renamed from: o.kqU$Application */
    public static final class Application implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            if (C29269kqU.this.djBIcL) {
                return;
            }
            TrendingFilterBottomSheetViewModel trendingFilterBottomSheetViewModelGEmmrt = C29269kqU.this.gEmmrt();
            java.lang.String string = editable != null ? editable.toString() : null;
            if (string == null) {
                string = "";
            }
            trendingFilterBottomSheetViewModelGEmmrt.OLrzqt(string);
        }
    }

    public final void djBIcL() {
        C55008xbo c55008xbo;
        C55001xbh c55001xbhAkhnZx;
        C21629hGl c21629hGl = this.AYXKKw;
        if (c21629hGl == null || (c55008xbo = c21629hGl.EZpvd) == null || (c55001xbhAkhnZx = c55008xbo.AkhnZx()) == null) {
            return;
        }
        c55001xbhAkhnZx.addTextChangedListener(new Application());
    }

    /* JADX INFO: renamed from: o.kqU$Activity */
    public static final class Activity implements android.text.TextWatcher {
        public final /* synthetic */ Function2<java.lang.String, java.lang.String, Unit> OLrzqt;
        public final /* synthetic */ RankingFilterEditView copydefault;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(RankingFilterEditView rankingFilterEditView, Function2<? super java.lang.String, ? super java.lang.String, Unit> function2) {
            this.copydefault = rankingFilterEditView;
            this.OLrzqt = function2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) throws java.io.IOException {
            if (C29269kqU.this.djBIcL) {
                return;
            }
            this.OLrzqt.invoke(this.copydefault.copydefault(), this.copydefault.OLrzqt());
        }
    }

    public final void KWHzl(RankingFilterEditView rankingFilterEditView, Function2<? super java.lang.String, ? super java.lang.String, Unit> function2) {
        Activity activity = new Activity(rankingFilterEditView, function2);
        rankingFilterEditView.KWHzl().addTextChangedListener(activity);
        rankingFilterEditView.AEQbTJ().addTextChangedListener(activity);
    }

    /* JADX INFO: renamed from: o.kqU$ActionBar */
    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C29264kqP c29264kqP, Continuation<? super Unit> continuation) {
            RankingFilterEditView rankingFilterEditView;
            C21629hGl c21629hGl = C29269kqU.this.AYXKKw;
            if (c21629hGl != null && (rankingFilterEditView = c21629hGl.OLrzqt) != null) {
                java.lang.String string = C29269kqU.this.getString(c29264kqP.EZpvd().AYXKKw().toDisplayString());
                Intrinsics.checkNotNullExpressionValue(string, "");
                rankingFilterEditView.setUnitPickerText(string);
            }
            return Unit.INSTANCE;
        }
    }

    private final void fetchVPNInfo() {
        C25390ivn.collectOnViewLifecycle$default(this, gEmmrt().EZpvd(), null, new ActionBar(), 2, null);
    }

    public final void AhwBna() {
        TrendingFilter trendingFilterEZpvd = gEmmrt().EZpvd().getValue().EZpvd();
        this.djBIcL = true;
        C21629hGl c21629hGl = this.AYXKKw;
        if (c21629hGl != null) {
            c21629hGl.copydefault.setMinValue(trendingFilterEZpvd.OLrzqt());
            c21629hGl.copydefault.setMaxValue(trendingFilterEZpvd.AEQbTJ());
            c21629hGl.AhwBna.setMinValue(trendingFilterEZpvd.gEmmrt());
            c21629hGl.AhwBna.setMaxValue(trendingFilterEZpvd.valueOf());
            c21629hGl.OLrzqt.setMinValue(trendingFilterEZpvd.djBIcL());
            c21629hGl.OLrzqt.setMaxValue(trendingFilterEZpvd.copydefault());
            RankingFilterEditView rankingFilterEditView = c21629hGl.OLrzqt;
            java.lang.String string = getString(trendingFilterEZpvd.AYXKKw().toDisplayString());
            Intrinsics.checkNotNullExpressionValue(string, "");
            rankingFilterEditView.setUnitPickerText(string);
            c21629hGl.AEQbTJ.setChecked(trendingFilterEZpvd.EZpvd());
            C55001xbh c55001xbhAkhnZx = c21629hGl.EZpvd.AkhnZx();
            if (c55001xbhAkhnZx != null) {
                c55001xbhAkhnZx.setText(trendingFilterEZpvd.KWHzl());
            }
        }
        this.djBIcL = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AYXKKw = null;
    }

    private final void DbNXlk() {
        TokenAgeType tokenAgeTypeAYXKKw = gEmmrt().EZpvd().getValue().EZpvd().AYXKKw();
        C28729kgK.StateListAnimator stateListAnimator = C28729kgK.Companion;
        java.lang.String string = getString(C23274hvD.Fragment.openFileOutput);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.util.List<TokenAgeType> listGEmmrt = yDY.gEmmrt(TokenAgeType.m, TokenAgeType.H, TokenAgeType.D);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
        for (TokenAgeType tokenAgeType : listGEmmrt) {
            int value = tokenAgeType.getValue();
            java.lang.String string2 = getString(tokenAgeType.toDisplayString());
            Intrinsics.checkNotNullExpressionValue(string2, "");
            arrayList.add(new MemeSelection(string2, null, null, null, tokenAgeTypeAYXKKw.getValue() == tokenAgeType.getValue(), java.lang.String.valueOf(value), null, 78, null));
        }
        C28729kgK c28729kgKAEQbTJ = stateListAnimator.AEQbTJ(new MemeUnitSelectionBottomSheetParams(string, arrayList));
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c28729kgKAEQbTJ.show(childFragmentManager);
    }

    @Override // o.InterfaceC28728kgJ
    public void EZpvd(MemeSelection memeSelection) {
        RankingFilterEditView rankingFilterEditView;
        if (memeSelection != null) {
            TrendingFilter trendingFilterEZpvd = gEmmrt().EZpvd().getValue().EZpvd();
            gEmmrt().OLrzqt(trendingFilterEZpvd.djBIcL(), trendingFilterEZpvd.copydefault(), TokenAgeType.Companion.AEQbTJ(C33129mqd.AhwBna(memeSelection.KWHzl())));
        }
        C21629hGl c21629hGl = this.AYXKKw;
        if (c21629hGl == null || (rankingFilterEditView = c21629hGl.OLrzqt) == null) {
            return;
        }
        rankingFilterEditView.valueOf();
    }

    @Override // o.InterfaceC28728kgJ
    public void KWHzl() {
        RankingFilterEditView rankingFilterEditView;
        C21629hGl c21629hGl = this.AYXKKw;
        if (c21629hGl == null || (rankingFilterEditView = c21629hGl.OLrzqt) == null) {
            return;
        }
        rankingFilterEditView.valueOf();
    }
}
