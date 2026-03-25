package o;

import androidx.activity.result.ActivityResultLauncher;
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
import com.okinc.im.imui.search.view.GlobalSearchFragment$setupFlow$1;
import com.okinc.im.imui.search.view.GlobalSearchFragment$setupFlow$2;
import com.okinc.im.imui.search.viewmodel.GlobalSearchViewModel;
import com.okinc.okex.ui.search.SearchInputChecker;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.uilab.edit.OKEditText;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.ActivityC36573odX;
import o.C35399nuc;
import o.C37290oqz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ouC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37453ouC extends AbstractC37463ouM {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public nJS EZpvd;
    public final ActivityResultLauncher<android.content.Intent> OLrzqt;
    public final int copydefault = C35399nuc.Dialog.dHguZz;
    public final C37418otU valueOf;

    /* JADX INFO: renamed from: o.ouC$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SearchResultData.LoadMore.values().length];
            try {
                iArr[SearchResultData.LoadMore.CHAT_AND_CONTACT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SearchResultData.LoadMore.MESSAGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.copydefault;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.oqz.registerForImNewChatActivityResult$default(o.oqz, androidx.fragment.app.Fragment, o.oqz$StateListAnimator, int, java.lang.Object):androidx.activity.result.ActivityResultLauncher */
    public C37453ouC() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.search.view.GlobalSearchFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.search.view.GlobalSearchFragment$special$$inlined$viewModels$default$2
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
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(GlobalSearchViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.search.view.GlobalSearchFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.search.view.GlobalSearchFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.search.view.GlobalSearchFragment$special$$inlined$viewModels$default$5
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
        this.valueOf = new C37418otU(new C37421otX());
        this.OLrzqt = C37290oqz.registerForImNewChatActivityResult$default(C37290oqz.copydefault, this, (C37290oqz.StateListAnimator) null, 1, (java.lang.Object) null);
    }

    /* JADX DEBUG: Possible override for method o.ouM.KWHzl()V */
    public final GlobalSearchViewModel KWHzl() {
        return (GlobalSearchViewModel) this.AEQbTJ.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.EZpvd = nJS.copydefault(view);
        gEmmrt();
        valueOf();
        AhwBna();
        view.post(new java.lang.Runnable() { // from class: o.ouK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C37453ouC.valueOf(this.OLrzqt);
            }
        });
    }

    public static final void valueOf(C37453ouC c37453ouC) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c37453ouC, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.EZpvd = null;
    }

    private final void gEmmrt() {
        C55230xfy c55230xfy;
        OKEditText oKEditTextKWHzl;
        C55230xfy c55230xfy2;
        C55230xfy c55230xfy3;
        C55230xfy c55230xfy4;
        OKEditText oKEditTextKWHzl2;
        C55230xfy c55230xfy5;
        android.widget.TextView textViewCopydefault;
        nJS njs = this.EZpvd;
        if (njs != null && (c55230xfy5 = njs.AEQbTJ) != null && (textViewCopydefault = c55230xfy5.copydefault()) != null) {
            textViewCopydefault.setText(getString(C35399nuc.LoaderManager.AubY));
        }
        nJS njs2 = this.EZpvd;
        if (njs2 != null && (c55230xfy4 = njs2.AEQbTJ) != null && (oKEditTextKWHzl2 = c55230xfy4.KWHzl()) != null) {
            oKEditTextKWHzl2.setHint(getString(C35399nuc.LoaderManager.DjwCMv));
        }
        nJS njs3 = this.EZpvd;
        if (njs3 != null && (c55230xfy3 = njs3.AEQbTJ) != null) {
            c55230xfy3.requestFocus();
        }
        nJS njs4 = this.EZpvd;
        if (njs4 != null && (c55230xfy2 = njs4.AEQbTJ) != null) {
            c55230xfy2.setCancelCallback(new Function0() { // from class: o.ouP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C37453ouC.values(this.copydefault);
                }
            });
        }
        nJS njs5 = this.EZpvd;
        if (njs5 == null || (c55230xfy = njs5.AEQbTJ) == null || (oKEditTextKWHzl = c55230xfy.KWHzl()) == null) {
            return;
        }
        oKEditTextKWHzl.addTextChangedListener(new TaskDescription());
    }

    public static final Unit values(C37453ouC c37453ouC) {
        FragmentKt.setFragmentResult(c37453ouC, "finish", BundleKt.bundleOf());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.ouC$TaskDescription */
    public static final class TaskDescription implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public TaskDescription() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String lowerCase = null;
            java.lang.String string = editable != null ? editable.toString() : null;
            pUU.KWHzl(C56524yIo.AEQbTJ(C37453ouC.class).valueOf(), "observeTextChanged: " + string);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) string)) {
                android.content.Context contextRequireContext = C37453ouC.this.requireContext();
                if (string != null) {
                    java.util.Locale locale = java.util.Locale.ROOT;
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    lowerCase = string.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                }
                if (SearchInputChecker.copydefault(contextRequireContext, lowerCase)) {
                    C31977mKy c31977mKy = C31977mKy.AEQbTJ;
                    FragmentActivity fragmentActivityRequireActivity = C37453ouC.this.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    c31977mKy.OLrzqt(fragmentActivityRequireActivity);
                    return;
                }
            }
            GlobalSearchViewModel globalSearchViewModelKWHzl = C37453ouC.this.KWHzl();
            if (string == null) {
                string = "";
            }
            globalSearchViewModelKWHzl.AEQbTJ(string, 5);
        }
    }

    private final void valueOf() {
        C33546myW c33546myW;
        RecyclerView recyclerView;
        C37418otU c37418otU = this.valueOf;
        c37418otU.EZpvd(new C37481oue());
        c37418otU.EZpvd(new C37480oud());
        c37418otU.EZpvd(new C37483oug(new Function1() { // from class: o.ouE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37453ouC.EZpvd(this.copydefault, (SearchResultData.LoadMore) obj);
            }
        }));
        c37418otU.EZpvd(new C37479ouc(new Function0() { // from class: o.ouG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37453ouC.AYXKKw(this.KWHzl);
            }
        }, new Function1() { // from class: o.ouH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37453ouC.EZpvd(this.AEQbTJ, (SearchResultData.ChatAndContact) obj);
            }
        }));
        c37418otU.EZpvd(new C37422otY(new Function0() { // from class: o.ouJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37453ouC.AhwBna(this.OLrzqt);
            }
        }, new Function1() { // from class: o.ouL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37453ouC.OLrzqt(this.EZpvd, (SearchResultData.Message) obj);
            }
        }));
        nJS njs = this.EZpvd;
        if (njs != null && (recyclerView = njs.OLrzqt) != null) {
            recyclerView.setAdapter(this.valueOf);
            recyclerView.setItemAnimator(null);
            recyclerView.addItemDecoration(new C37419otV(this.valueOf));
            C37716ozA.EZpvd(recyclerView);
        }
        nJS njs2 = this.EZpvd;
        if (njs2 == null || (c33546myW = njs2.EZpvd) == null) {
            return;
        }
        c33546myW.AhwBna(false);
        c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.ouI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                C37453ouC.OLrzqt(this.AEQbTJ, interfaceC57934yrl);
            }
        });
    }

    public static final Unit EZpvd(C37453ouC c37453ouC, SearchResultData.LoadMore loadMore) {
        Intrinsics.checkNotNullParameter(loadMore, "");
        int i = ActionBar.OLrzqt[loadMore.ordinal()];
        if (i == 1) {
            c37453ouC.KWHzl().KWHzl(new GlobalSearchViewModel.Activity(c37453ouC.AYXKKw(), null));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            c37453ouC.KWHzl().OLrzqt(c37453ouC.AYXKKw());
        }
        return Unit.INSTANCE;
    }

    public static final java.lang.String AYXKKw(C37453ouC c37453ouC) {
        return c37453ouC.AYXKKw();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.odX.Activity.createIntent$default(o.odX$Activity, android.content.Context, java.lang.String, com.okinc.okimcore.model.im.OKMessage, java.lang.String, com.okinc.im.bean.ChatOrigin, java.lang.String, com.okinc.im.config.page.IMPageType, java.lang.String, java.lang.String, int, java.lang.Object):android.content.Intent */
    public static final Unit EZpvd(C37453ouC c37453ouC, SearchResultData.ChatAndContact chatAndContact) {
        Intrinsics.checkNotNullParameter(chatAndContact, "");
        ActivityC36573odX.Activity activity = ActivityC36573odX.Companion;
        FragmentActivity fragmentActivityRequireActivity = c37453ouC.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        OKConversation conversation = chatAndContact.getConversation();
        java.lang.String targetId = conversation != null ? conversation.getTargetId() : null;
        RelationInfo relation = chatAndContact.getRelation();
        c37453ouC.OLrzqt.launch(activity.KWHzl(fragmentActivityRequireActivity, (452 & 2) != 0 ? null : targetId, (452 & 4) != 0 ? null : null, (452 & 8) != 0 ? null : c37453ouC.AYXKKw(), (452 & 16) != 0 ? null : C35182nqW.KWHzl("search"), (452 & 32) != 0 ? null : relation != null ? relation.getContactsId() : null, (452 & 64) != 0 ? null : null, (452 & 128) != 0 ? null : null, (452 & 256) == 0 ? null : null));
        return Unit.INSTANCE;
    }

    public static final java.lang.String AhwBna(C37453ouC c37453ouC) {
        return c37453ouC.AYXKKw();
    }

    public static final Unit OLrzqt(C37453ouC c37453ouC, SearchResultData.Message message) {
        Intrinsics.checkNotNullParameter(message, "");
        ActivityC36573odX.Activity activity = ActivityC36573odX.Companion;
        FragmentActivity fragmentActivityRequireActivity = c37453ouC.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        c37453ouC.OLrzqt.launch(activity.KWHzl(fragmentActivityRequireActivity, (452 & 2) != 0 ? null : message.getConversation().getTargetId(), (452 & 4) != 0 ? null : message.getMessage(), (452 & 8) != 0 ? null : c37453ouC.AYXKKw(), (452 & 16) != 0 ? null : C35182nqW.KWHzl("search"), (452 & 32) != 0 ? null : null, (452 & 64) != 0 ? null : null, (452 & 128) != 0 ? null : null, (452 & 256) == 0 ? null : null));
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C37453ouC c37453ouC, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c37453ouC.KWHzl().EZpvd(c37453ouC.AYXKKw());
    }

    private final void AhwBna() {
        Flow flowOnEach = FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(KWHzl().EZpvd(), getViewLifecycleOwner().getLifecycle(), null, 2, null), new GlobalSearchFragment$setupFlow$1(this, null));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        FlowKt.launchIn(flowOnEach, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner));
        Flow flowOnEach2 = FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(KWHzl().OLrzqt(), getViewLifecycleOwner().getLifecycle(), null, 2, null), new GlobalSearchFragment$setupFlow$2(this, null));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        FlowKt.launchIn(flowOnEach2, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2));
    }

    private final java.lang.String AYXKKw() {
        C55230xfy c55230xfy;
        OKEditText oKEditTextKWHzl;
        nJS njs = this.EZpvd;
        return java.lang.String.valueOf((njs == null || (c55230xfy = njs.AEQbTJ) == null || (oKEditTextKWHzl = c55230xfy.KWHzl()) == null) ? null : oKEditTextKWHzl.getText());
    }

    /* JADX INFO: renamed from: o.ouC$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ouC.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C37453ouC EZpvd() {
            return new C37453ouC();
        }
    }
}
