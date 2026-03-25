package o;

import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.bean.SearchResultData;
import com.okinc.im.imui.search.view.ConversationSearchFragment$setupFlow$1;
import com.okinc.im.imui.search.view.ConversationSearchFragment$setupFlow$2;
import com.okinc.im.imui.search.viewmodel.ConversationSearchViewModel;
import com.okinc.okex.ui.search.SearchInputChecker;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.uilab.edit.OKEditText;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ouj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37486ouj extends AbstractC37465ouO {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public nJS AEQbTJ;
    public final int KWHzl = C35399nuc.Dialog.dHguZz;
    public final InterfaceC56387yDm OLrzqt;
    public final C37418otU copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.KWHzl;
    }

    public C37486ouj() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.search.view.ConversationSearchFragment$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.search.view.ConversationSearchFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ConversationSearchViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.search.view.ConversationSearchFragment$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.search.view.ConversationSearchFragment$special$$inlined$viewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.search.view.ConversationSearchFragment$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.copydefault = new C37418otU(new C37421otX());
    }

    /* JADX DEBUG: Possible override for method o.ouO.KWHzl()V */
    public final ConversationSearchViewModel KWHzl() {
        return (ConversationSearchViewModel) this.OLrzqt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String AhwBna() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("conversation");
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AEQbTJ = nJS.copydefault(view);
        OLrzqt();
        valueOf();
        djBIcL();
        view.post(new java.lang.Runnable() { // from class: o.oui
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C37486ouj.AhwBna(this.copydefault);
            }
        });
    }

    public static final void AhwBna(C37486ouj c37486ouj) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c37486ouj, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.AEQbTJ = null;
    }

    public final void OLrzqt() {
        C55230xfy c55230xfy;
        OKEditText oKEditTextKWHzl;
        C55230xfy c55230xfy2;
        C55230xfy c55230xfy3;
        C55230xfy c55230xfy4;
        OKEditText oKEditTextKWHzl2;
        C55230xfy c55230xfy5;
        android.widget.TextView textViewCopydefault;
        nJS njs = this.AEQbTJ;
        if (njs != null && (c55230xfy5 = njs.AEQbTJ) != null && (textViewCopydefault = c55230xfy5.copydefault()) != null) {
            textViewCopydefault.setText(getString(C35399nuc.LoaderManager.AubY));
        }
        nJS njs2 = this.AEQbTJ;
        if (njs2 != null && (c55230xfy4 = njs2.AEQbTJ) != null && (oKEditTextKWHzl2 = c55230xfy4.KWHzl()) != null) {
            oKEditTextKWHzl2.setHint(getString(C35399nuc.LoaderManager.DjwCMv));
        }
        nJS njs3 = this.AEQbTJ;
        if (njs3 != null && (c55230xfy3 = njs3.AEQbTJ) != null) {
            c55230xfy3.requestFocus();
        }
        nJS njs4 = this.AEQbTJ;
        if (njs4 != null && (c55230xfy2 = njs4.AEQbTJ) != null) {
            c55230xfy2.setCancelCallback(new Function0() { // from class: o.our
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C37486ouj.djBIcL(this.EZpvd);
                }
            });
        }
        nJS njs5 = this.AEQbTJ;
        if (njs5 == null || (c55230xfy = njs5.AEQbTJ) == null || (oKEditTextKWHzl = c55230xfy.KWHzl()) == null) {
            return;
        }
        oKEditTextKWHzl.addTextChangedListener(new StateListAnimator());
    }

    public static final Unit djBIcL(C37486ouj c37486ouj) {
        FragmentKt.setFragmentResult(c37486ouj, "finish", BundleKt.bundleOf());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.ouj$StateListAnimator */
    public static final class StateListAnimator implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public StateListAnimator() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String lowerCase = null;
            java.lang.String string = editable != null ? editable.toString() : null;
            pUU.KWHzl(C56524yIo.AEQbTJ(C37486ouj.class).valueOf(), "observeTextChanged: " + string);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) string)) {
                android.content.Context contextRequireContext = C37486ouj.this.requireContext();
                if (string != null) {
                    java.util.Locale locale = java.util.Locale.ROOT;
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    lowerCase = string.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                }
                if (SearchInputChecker.copydefault(contextRequireContext, lowerCase)) {
                    C31977mKy c31977mKy = C31977mKy.AEQbTJ;
                    FragmentActivity fragmentActivityRequireActivity = C37486ouj.this.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    c31977mKy.OLrzqt(fragmentActivityRequireActivity);
                    return;
                }
            }
            if (string == null) {
                string = "";
            }
            C37486ouj.this.KWHzl().OLrzqt(new ConversationSearchViewModel.StateListAnimator(string, C37486ouj.this.AhwBna()));
        }
    }

    private final void valueOf() {
        C33546myW c33546myW;
        RecyclerView recyclerView;
        C37418otU c37418otU = this.copydefault;
        Function0 function0 = new Function0() { // from class: o.oum
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37486ouj.AYXKKw(this.AEQbTJ);
            }
        };
        Function1 function1 = new Function1() { // from class: o.ouk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37486ouj.KWHzl(this.KWHzl, (SearchResultData.Message) obj);
            }
        };
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c37418otU.EZpvd(new C37417otT(function0, function1, viewLifecycleOwner));
        nJS njs = this.AEQbTJ;
        if (njs != null && (recyclerView = njs.OLrzqt) != null) {
            recyclerView.setAdapter(this.copydefault);
            C37716ozA.EZpvd(recyclerView);
        }
        nJS njs2 = this.AEQbTJ;
        if (njs2 == null || (c33546myW = njs2.EZpvd) == null) {
            return;
        }
        c33546myW.AhwBna(false);
        c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.oup
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                C37486ouj.copydefault(this.OLrzqt, interfaceC57934yrl);
            }
        });
    }

    public static final java.lang.String AYXKKw(C37486ouj c37486ouj) {
        return c37486ouj.AYXKKw();
    }

    public static final Unit KWHzl(C37486ouj c37486ouj, SearchResultData.Message message) {
        Intrinsics.checkNotNullParameter(message, "");
        C33764nEz c33764nEz = C33764nEz.OLrzqt;
        OKConversation conversation = message.getConversation();
        OKMessage message2 = message.getMessage();
        FragmentActivity fragmentActivityRequireActivity = c37486ouj.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        c33764nEz.copydefault(conversation, fragmentActivityRequireActivity, (204 & 4) != 0 ? null : message2, (204 & 8) != 0 ? null : c37486ouj.AYXKKw(), (204 & 16) != 0 ? null : "search", (204 & 32) != 0 ? null : null, (204 & 64) != 0 ? null : null, (204 & 128) != 0 ? null : null);
        return Unit.INSTANCE;
    }

    public static final void copydefault(C37486ouj c37486ouj, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c37486ouj.KWHzl().EZpvd(new ConversationSearchViewModel.StateListAnimator(c37486ouj.AYXKKw(), c37486ouj.AhwBna()));
    }

    private final void djBIcL() {
        Flow flowOnEach = FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(KWHzl().KWHzl(), getViewLifecycleOwner().getLifecycle(), null, 2, null), new ConversationSearchFragment$setupFlow$1(this, null));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        FlowKt.launchIn(flowOnEach, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner));
        Flow flowOnEach2 = FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(KWHzl().AEQbTJ(), getViewLifecycleOwner().getLifecycle(), null, 2, null), new ConversationSearchFragment$setupFlow$2(this, null));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        FlowKt.launchIn(flowOnEach2, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2));
    }

    private final java.lang.String AYXKKw() {
        C55230xfy c55230xfy;
        OKEditText oKEditTextKWHzl;
        nJS njs = this.AEQbTJ;
        return java.lang.String.valueOf((njs == null || (c55230xfy = njs.AEQbTJ) == null || (oKEditTextKWHzl = c55230xfy.KWHzl()) == null) ? null : oKEditTextKWHzl.getText());
    }

    /* JADX INFO: renamed from: o.ouj$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ouj.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C37486ouj KWHzl(java.lang.String str) {
            C37486ouj c37486ouj = new C37486ouj();
            c37486ouj.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("conversation", str)));
            return c37486ouj;
        }
    }
}
