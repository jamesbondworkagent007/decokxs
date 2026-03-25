package o;

import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.wallet.WalletConstants;
import com.okinc.biz.bean.ChatBotRequest;
import com.okinc.im.bean.ChatOrigin;
import com.okinc.im.config.page.IMPageType;
import com.okinc.im.imui.relationlist.viewmodel.searchrelation.SearchRelationViewModel;
import com.okinc.okimcore.model.biz.relationlocal.PhoneRelation;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.uilab.edit.OKEditText;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C37254oqP;
import o.C37255oqQ;
import o.C37258oqT;
import o.C37374osd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.osd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37374osd extends AbstractC37317orZ {
    public C33924nKx AhwBna;
    public final StateListAnimator AkhnZx;
    public final ActionBar gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public static final Application Companion = new Application(null);
    public static final int AYXKKw = 8;
    public final int djBIcL = C35399nuc.Dialog.ixgjPv;
    public final C37763ozv valueOf = new C37763ozv(new C37283oqs());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.djBIcL;
    }

    public C37374osd() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.relationlist.ui.searchrelation.SearchRelationFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.relationlist.ui.searchrelation.SearchRelationFragment$special$$inlined$viewModels$default$2
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
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SearchRelationViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.relationlist.ui.searchrelation.SearchRelationFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.relationlist.ui.searchrelation.SearchRelationFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.relationlist.ui.searchrelation.SearchRelationFragment$special$$inlined$viewModels$default$5
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
        this.gEmmrt = new ActionBar();
        this.AkhnZx = new StateListAnimator();
    }

    /* JADX INFO: renamed from: o.osd$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.osd.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C37374osd copydefault() {
            return new C37374osd();
        }
    }

    /* JADX DEBUG: Possible override for method o.orZ.EZpvd()V */
    public final SearchRelationViewModel EZpvd() {
        return (SearchRelationViewModel) this.isConnected.getValue();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C33924nKx c33924nKxOLrzqt = C33924nKx.OLrzqt(layoutInflater, viewGroup, false);
        this.AhwBna = c33924nKxOLrzqt;
        if (c33924nKxOLrzqt != null) {
            return c33924nKxOLrzqt.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        EZpvd().OLrzqt();
        gEmmrt();
        AYXKKw();
        AhwBna();
        valueOf();
        djBIcL();
    }

    /* JADX INFO: renamed from: o.osd$Activity */
    public static final class Activity implements android.text.TextWatcher {
        public final /* synthetic */ OKEditText AEQbTJ;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity(OKEditText oKEditText) {
            this.AEQbTJ = oKEditText;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C37374osd.this.EZpvd().EZpvd(java.lang.String.valueOf(this.AEQbTJ.getText()));
        }
    }

    private final void AhwBna() {
        C55230xfy c55230xfy;
        C33924nKx c33924nKx = this.AhwBna;
        if (c33924nKx == null || (c55230xfy = c33924nKx.AEQbTJ) == null) {
            return;
        }
        c55230xfy.copydefault().setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.AubY));
        c55230xfy.setCancelCallback(new Function0() { // from class: o.osl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37374osd.EZpvd(this.OLrzqt);
            }
        });
        OKEditText oKEditTextKWHzl = c55230xfy.KWHzl();
        oKEditTextKWHzl.requestFocus();
        c55230xfy.KWHzl().addTextChangedListener(new Activity(oKEditTextKWHzl));
    }

    public static final Unit EZpvd(C37374osd c37374osd) {
        c37374osd.requireActivity().getOnBackPressedDispatcher().onBackPressed();
        return Unit.INSTANCE;
    }

    private final void gEmmrt() {
        EZpvd().AEQbTJ().observe(this, new Observer() { // from class: o.osk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C37374osd.KWHzl(this.copydefault, (java.util.List) obj);
            }
        });
        EZpvd().copydefault().observe(this, new Observer() { // from class: o.osi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C37374osd.EZpvd(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        EZpvd().KWHzl().observe(this, new C32991mny(new Function1() { // from class: o.osh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37374osd.copydefault(this.OLrzqt, (SearchRelationViewModel.Activity) obj);
            }
        }));
        EZpvd().AYXKKw().observe(this, new Observer() { // from class: o.osj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C37374osd.copydefault(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ozv.updateList$default(o.ozv, java.util.List, java.lang.Runnable, int, java.lang.Object):void */
    public static final void KWHzl(C37374osd c37374osd, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C37763ozv.updateList$default(c37374osd.valueOf, list, null, 2, null);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c37374osd, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void EZpvd(C37374osd c37374osd, boolean z) {
        C55173xeu c55173xeu;
        C33924nKx c33924nKx = c37374osd.AhwBna;
        if (c33924nKx == null || (c55173xeu = c33924nKx.OLrzqt) == null) {
            return;
        }
        c55173xeu.setVisibility(z ? 0 : 8);
    }

    public static final Unit copydefault(C37374osd c37374osd, SearchRelationViewModel.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        pUU.KWHzl("ChatActivity", "action event triggered: " + activity);
        c37374osd.KWHzl(activity);
        return Unit.INSTANCE;
    }

    public static final void copydefault(C37374osd c37374osd, boolean z) {
        if (z) {
            c37374osd.showLoading();
        } else {
            c37374osd.releaseLoading();
        }
    }

    private final void AYXKKw() {
        C37763ozv c37763ozv = this.valueOf;
        C37254oqP c37254oqP = new C37254oqP();
        c37254oqP.KWHzl(this.gEmmrt);
        c37763ozv.EZpvd(c37254oqP);
        c37763ozv.EZpvd(new C37257oqS());
        C37255oqQ c37255oqQ = new C37255oqQ();
        c37255oqQ.AEQbTJ((C37255oqQ.TaskDescription) new TaskDescription());
        c37763ozv.EZpvd(c37255oqQ);
        C37258oqT c37258oqT = new C37258oqT();
        c37258oqT.AEQbTJ((C37258oqT.TaskDescription) this.AkhnZx);
        c37763ozv.EZpvd(c37258oqT);
        C33924nKx c33924nKx = this.AhwBna;
        if (c33924nKx != null) {
            RecyclerView recyclerView = c33924nKx.EZpvd;
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
            recyclerView.setAdapter(this.valueOf);
        }
    }

    /* JADX INFO: renamed from: o.osd$TaskDescription */
    public static final class TaskDescription implements C37255oqQ.TaskDescription {
        public TaskDescription() {
        }

        @Override // o.C37255oqQ.TaskDescription
        public void KWHzl(C37247oqI c37247oqI) {
            Intrinsics.checkNotNullParameter(c37247oqI, "");
            C37374osd.this.EZpvd().OLrzqt(c37247oqI.copydefault());
        }
    }

    private final void valueOf() {
        java.lang.String[] strArrEZpvd = C37724ozI.EZpvd.EZpvd();
        if (C60121zwJ.KWHzl(requireContext(), (java.lang.String[]) java.util.Arrays.copyOf(strArrEZpvd, strArrEZpvd.length))) {
            pUU.KWHzl("SearchRelationFragment", "Contact permission granted");
            EZpvd().EZpvd();
        }
    }

    public final void KWHzl(SearchRelationViewModel.Activity activity) {
        if (activity instanceof SearchRelationViewModel.Activity.TaskDescription) {
            C37314orW c37314orWKWHzl = C37314orW.Companion.KWHzl(((SearchRelationViewModel.Activity.TaskDescription) activity).EZpvd());
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c37314orWKWHzl.show(childFragmentManager);
            return;
        }
        if (activity instanceof SearchRelationViewModel.Activity.ActionBar) {
            C33764nEz c33764nEz = C33764nEz.OLrzqt;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            ChatOrigin chatOrigin = ChatOrigin.NEW_CHAT_FRIEND_LIST;
            IMPageType iMPageType = IMPageType.NORMAL_IM;
            SearchRelationViewModel.Activity.ActionBar actionBar = (SearchRelationViewModel.Activity.ActionBar) activity;
            C33764nEz.startIMChat$default(c33764nEz, contextRequireContext, actionBar.copydefault(), chatOrigin, null, null, actionBar.OLrzqt(), iMPageType, null, null, 408, null);
            C37290oqz c37290oqz = C37290oqz.copydefault;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            c37290oqz.AEQbTJ(fragmentActivityRequireActivity);
            return;
        }
        if (activity instanceof SearchRelationViewModel.Activity.C0476Activity) {
            C55326xho.toastWithFailedIcon$default(((SearchRelationViewModel.Activity.C0476Activity) activity).OLrzqt(), 0, 1, (java.lang.Object) null);
        } else {
            if (!(activity instanceof SearchRelationViewModel.Activity.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            AEQbTJ(((SearchRelationViewModel.Activity.StateListAnimator) activity).OLrzqt());
        }
    }

    private final void AEQbTJ(C37246oqH c37246oqH) {
        C37341orx c37341orxOLrzqt = C37341orx.Companion.OLrzqt(c37246oqH.EZpvd(), c37246oqH.OLrzqt());
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c37341orxOLrzqt.show(childFragmentManager);
    }

    /* JADX INFO: renamed from: o.osd$ActionBar */
    public static final class ActionBar implements C37254oqP.StateListAnimator {
        public ActionBar() {
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.nEz.startIMChat$default(o.nEz, android.content.Context, java.lang.String, com.okinc.im.bean.ChatOrigin, com.okinc.okimcore.model.im.OKMessage, java.lang.String, java.lang.String, com.okinc.im.config.page.IMPageType, java.lang.String, java.lang.String, int, java.lang.Object):void */
        @Override // o.C37254oqP.StateListAnimator
        public void AEQbTJ(RelationInfo relationInfo) {
            Intrinsics.checkNotNullParameter(relationInfo, "");
            pUU.KWHzl("SearchRelationFragment", "Friend item clicked:" + relationInfo.getContactsId());
            C33764nEz c33764nEz = C33764nEz.OLrzqt;
            android.content.Context contextRequireContext = C37374osd.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C33764nEz.startIMChat$default(c33764nEz, contextRequireContext, null, ChatOrigin.NEW_CHAT_FRIEND_LIST, null, null, relationInfo.getContactsId(), IMPageType.NORMAL_IM, null, null, WalletConstants.ERROR_CODE_INVALID_TRANSACTION, null);
            C37290oqz c37290oqz = C37290oqz.copydefault;
            FragmentActivity fragmentActivityRequireActivity = C37374osd.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            c37290oqz.AEQbTJ(fragmentActivityRequireActivity);
        }
    }

    /* JADX INFO: renamed from: o.osd$StateListAnimator */
    public static final class StateListAnimator implements C37258oqT.TaskDescription {
        public StateListAnimator() {
        }

        @Override // o.C37258oqT.TaskDescription
        public void OLrzqt(C37245oqG c37245oqG) {
            Intrinsics.checkNotNullParameter(c37245oqG, "");
            InterfaceC6804aWL interfaceC6804aWL = (InterfaceC6804aWL) C43251rlk.OLrzqt(InterfaceC6804aWL.class);
            if (interfaceC6804aWL != null) {
                android.content.Context contextRequireContext = C37374osd.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                interfaceC6804aWL.copydefault(contextRequireContext, C6805aWM.OLrzqt(new Function1() { // from class: o.osq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C37374osd.StateListAnimator.KWHzl((ChatBotRequest) obj);
                    }
                }));
            }
        }

        public static final Unit KWHzl(ChatBotRequest chatBotRequest) {
            Intrinsics.checkNotNullParameter(chatBotRequest, "");
            chatBotRequest.setOkaFrom("dedicatedvip_imcont_chat");
            return Unit.INSTANCE;
        }
    }

    private final void djBIcL() {
        getChildFragmentManager().setFragmentResultListener("REQUEST_KEY_SELECTION_LOCAL_RELATION", this, new FragmentResultListener() { // from class: o.osg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C37374osd.KWHzl(this.EZpvd, str, bundle);
            }
        });
    }

    public static final void KWHzl(C37374osd c37374osd, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        PhoneRelation phoneRelation = (PhoneRelation) BundleCompat.getParcelable(bundle, "RESULT_KEY_SELECTED_RELATION", PhoneRelation.class);
        if (phoneRelation != null) {
            c37374osd.EZpvd().KWHzl(phoneRelation);
        }
    }
}
