package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.business.defi.biz.core.scan.TransactionInfo;
import com.okinc.business.defi.wallet.mine.addressbook.detail.AddressBookNetworkSelectionBottomSheet;
import com.okinc.business.defi.wallet.mine.addressbook.detail.AddressChainUiData;
import com.okinc.business.defi.wallet.mine.addressbook.detail.WalletAddressBookDetailFragment$observeAddressAddOrUpdateState$1;
import com.okinc.business.defi.wallet.mine.addressbook.detail.WalletAddressBookDetailFragment$observeAddressErrorState$1;
import com.okinc.business.defi.wallet.mine.addressbook.detail.WalletAddressBookDetailFragment$observeAddressText$1;
import com.okinc.business.defi.wallet.mine.addressbook.detail.WalletAddressBookDetailFragment$observeButtonEnabledState$1;
import com.okinc.business.defi.wallet.mine.addressbook.detail.WalletAddressBookDetailFragment$observeExistingAddressBookState$1;
import com.okinc.business.defi.wallet.mine.addressbook.detail.WalletAddressBookDetailFragment$observeNameErrorState$1;
import com.okinc.business.defi.wallet.mine.addressbook.detail.WalletAddressBookDetailFragment$observeNameText$1;
import com.okinc.business.defi.wallet.mine.addressbook.detail.WalletAddressBookDetailFragment$observeNetworkChainList$1;
import com.okinc.business.defi.wallet.mine.addressbook.detail.WalletAddressBookDetailFragment$onDeleteButtonClicked$1$1$2;
import com.okinc.business.defi.wallet.mine.addressbook.detail.WalletAddressBookDetailViewModel;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.ScannerActivity;
import com.okinc.core.util.model.ScanConfig;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.uilab.edit.OKEditText;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fnb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C18713fnb extends AbstractC18714fnc implements AddressBookNetworkSelectionBottomSheet.StateListAnimator {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int gEmmrt = 8;
    public C16415ejW AYXKKw;
    public android.text.TextWatcher AhwBna;
    public final InterfaceC56387yDm DbNXlk;
    public C16623enS djBIcL;
    public android.text.TextWatcher fetchVPNInfo;
    public final ActivityResultLauncher<Unit> isConnected;
    public C16415ejW valueOf;

    /* JADX INFO: renamed from: o.fnb$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WalletAddressBookDetailViewModel.NameInputFieldState.NameInputFieldError.values().length];
            try {
                iArr[WalletAddressBookDetailViewModel.NameInputFieldState.NameInputFieldError.MAX_20_CHARACTERS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[WalletAddressBookDetailViewModel.NameInputFieldState.NameInputFieldError.EMPTY_NAME.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[WalletAddressBookDetailViewModel.AddressInputFieldState.AddressInputFieldError.values().length];
            try {
                iArr2[WalletAddressBookDetailViewModel.AddressInputFieldState.AddressInputFieldError.EMPTY_ADDRESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[WalletAddressBookDetailViewModel.AddressInputFieldState.AddressInputFieldError.DUPLICATE_ADDRESS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[WalletAddressBookDetailViewModel.AddressInputFieldState.AddressInputFieldError.WRONG_ADDRESS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            EZpvd = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.invokespecialgBtXYZ;
    }

    public C18713fnb() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.mine.addressbook.detail.WalletAddressBookDetailFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.mine.addressbook.detail.WalletAddressBookDetailFragment$special$$inlined$viewModels$default$2
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
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(WalletAddressBookDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.mine.addressbook.detail.WalletAddressBookDetailFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.mine.addressbook.detail.WalletAddressBookDetailFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.mine.addressbook.detail.WalletAddressBookDetailFragment$special$$inlined$viewModels$default$5
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
        ActivityResultLauncher<Unit> activityResultLauncherRegisterForActivityResult = registerForActivityResult(ScannerActivity.Activity.getResultContract$default(ScannerActivity.Companion, new ScanConfig(false, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DrqXHJ), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DGUQLIhJrIAr), C33070mpX.AYXKKw(C13754dXa.FragmentManager.profile), false, null, true, false, null, false, null, 3941, null), yDY.AhwBna(), null, 4, null), new ActivityResultCallback() { // from class: o.fmZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C18713fnb.KWHzl(this.KWHzl, (java.lang.String) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.isConnected = activityResultLauncherRegisterForActivityResult;
    }

    public final WalletAddressBookDetailViewModel gEmmrt() {
        return (WalletAddressBookDetailViewModel) this.DbNXlk.getValue();
    }

    /* JADX INFO: renamed from: o.fnb$Application */
    public static final class Application implements android.text.TextWatcher {
        public final /* synthetic */ C16415ejW KWHzl;
        public final /* synthetic */ C18713fnb OLrzqt;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application(C16415ejW c16415ejW, C18713fnb c18713fnb) {
            this.KWHzl = c16415ejW;
            this.OLrzqt = c18713fnb;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            wYC wyc = this.KWHzl.copydefault;
            Intrinsics.checkNotNullExpressionValue(wyc, "");
            wyc.setVisibility((this.KWHzl.EZpvd.hasFocus() && (editable != null && editable.length() > 0)) ? 0 : 8);
            WalletAddressBookDetailViewModel walletAddressBookDetailViewModelGEmmrt = this.OLrzqt.gEmmrt();
            java.lang.String string = editable != null ? editable.toString() : null;
            walletAddressBookDetailViewModelGEmmrt.KWHzl(string != null ? string : "");
        }
    }

    /* JADX INFO: renamed from: o.fnb$Fragment */
    public static final class Fragment implements android.text.TextWatcher {
        public final /* synthetic */ C16415ejW AEQbTJ;
        public final /* synthetic */ C18713fnb KWHzl;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Fragment(C16415ejW c16415ejW, C18713fnb c18713fnb) {
            this.AEQbTJ = c16415ejW;
            this.KWHzl = c18713fnb;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            wYC wyc = this.AEQbTJ.copydefault;
            Intrinsics.checkNotNullExpressionValue(wyc, "");
            wyc.setVisibility((this.AEQbTJ.EZpvd.hasFocus() && (editable != null && editable.length() > 0)) ? 0 : 8);
            WalletAddressBookDetailViewModel walletAddressBookDetailViewModelGEmmrt = this.KWHzl.gEmmrt();
            java.lang.String string = editable != null ? editable.toString() : null;
            walletAddressBookDetailViewModelGEmmrt.AEQbTJ(string != null ? string : "");
        }
    }

    public static final void KWHzl(C18713fnb c18713fnb, java.lang.String str) {
        OKEditText oKEditText;
        OKEditText oKEditText2;
        Intrinsics.copydefault((java.lang.Object) str);
        if (str.length() == 0) {
            return;
        }
        TransactionInfo transactionInfoGEmmrt = C8349bAz.OLrzqt.gEmmrt(str);
        C16415ejW c16415ejW = c18713fnb.valueOf;
        if (c16415ejW != null && (oKEditText2 = c16415ejW.EZpvd) != null) {
            oKEditText2.setText(transactionInfoGEmmrt.getAddress());
        }
        C16415ejW c16415ejW2 = c18713fnb.valueOf;
        if (c16415ejW2 == null || (oKEditText = c16415ejW2.EZpvd) == null) {
            return;
        }
        oKEditText.setSelection(transactionInfoGEmmrt.getAddress().length());
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C16623enS c16623enSKWHzl = C16623enS.KWHzl(view);
        this.djBIcL = c16623enSKWHzl;
        if (c16623enSKWHzl != null) {
            AEQbTJ(c16623enSKWHzl);
            copydefault(c16623enSKWHzl);
            boolean zOLrzqt = OLrzqt();
            int i = zOLrzqt ? C13754dXa.FragmentManager.config : C13754dXa.FragmentManager.RvdRAu;
            C33537myN c33537myN = c16623enSKWHzl.copydefault;
            android.content.Context context = getContext();
            c33537myN.setAppBarTitle(context != null ? context.getString(i) : null);
            c16623enSKWHzl.copydefault.setTitleTypeface("harmony_sans_bold.ttf");
            android.widget.TextView root = c16623enSKWHzl.AhwBna.getRoot();
            android.content.Context context2 = getContext();
            root.setText(context2 != null ? context2.getString(C13754dXa.FragmentManager.unregister) : null);
            AppCompatImageView appCompatImageView = c16623enSKWHzl.EZpvd;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            appCompatImageView.setVisibility(zOLrzqt ^ true ? 0 : 8);
            AppCompatImageView appCompatImageView2 = c16623enSKWHzl.EZpvd;
            appCompatImageView2.setOnClickListener(new Dialog(appCompatImageView2, 1000L, this));
            C52794wYp c52794wYp = c16623enSKWHzl.KWHzl;
            c52794wYp.setOnClickListener(new FragmentManager(c52794wYp, 1000L, this));
            c16623enSKWHzl.getRoot().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.fnq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view2, boolean z) {
                    C18713fnb.OLrzqt(this.copydefault, view2, z);
                }
            });
        }
        isConnected();
        djBIcL();
        AkhnZx();
        AYXKKw();
        DbNXlk();
        fetchVPNInfo();
        valueOf();
        AhwBna();
        view.post(new java.lang.Runnable() { // from class: o.fnp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C18713fnb.valueOf(this.KWHzl);
            }
        });
    }

    public static final void OLrzqt(C18713fnb c18713fnb, android.view.View view, boolean z) {
        if (z) {
            C33570myu.copydefault((android.app.Activity) c18713fnb.getActivity());
        }
    }

    public static final void valueOf(C18713fnb c18713fnb) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c18713fnb, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Possible override for method o.fnc.OLrzqt()V */
    public final boolean OLrzqt() {
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) : null;
        return string == null || string.length() == 0;
    }

    public final void AEQbTJ(C16623enS c16623enS) {
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        final C16415ejW c16415ejWCopydefault = C16415ejW.copydefault(android.view.LayoutInflater.from(context), c16623enS.OLrzqt.fIwbmz(), false);
        C55008xbo c55008xbo = c16623enS.OLrzqt;
        android.widget.LinearLayout root = c16415ejWCopydefault.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        c55008xbo.setContentView(root);
        c16415ejWCopydefault.EZpvd.setId(C13754dXa.ActionBar.aKErDB);
        wYC wyc = c16415ejWCopydefault.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(wyc, "");
        wyc.setVisibility(8);
        c16415ejWCopydefault.EZpvd.setHint(context.getString(C13754dXa.FragmentManager.Qsauvs));
        c16415ejWCopydefault.EZpvd.setSingleLine(true);
        c16415ejWCopydefault.EZpvd.setInputType(1);
        wYC wyc2 = c16415ejWCopydefault.copydefault;
        Intrinsics.checkNotNullExpressionValue(wyc2, "");
        wyc2.setVisibility(8);
        c16415ejWCopydefault.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.fne
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C18713fnb.OLrzqt(c16415ejWCopydefault, view);
            }
        });
        c16415ejWCopydefault.EZpvd.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.fni
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                C18713fnb.AEQbTJ(c16415ejWCopydefault, this, view, z);
            }
        });
        C33570myu.AEQbTJ(context, (android.widget.EditText) c16415ejWCopydefault.EZpvd);
        OKEditText oKEditText = c16415ejWCopydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(oKEditText, "");
        Fragment fragment = new Fragment(c16415ejWCopydefault, this);
        oKEditText.addTextChangedListener(fragment);
        this.fetchVPNInfo = fragment;
        this.AYXKKw = c16415ejWCopydefault;
        android.widget.TextView root2 = C16411ejS.copydefault(android.view.LayoutInflater.from(context), c16623enS.OLrzqt.fIwbmz(), false).getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        root2.setText(context.getString(C13754dXa.FragmentManager.fZc));
        c16623enS.OLrzqt.setLabelView(root2);
    }

    public static final void OLrzqt(C16415ejW c16415ejW, android.view.View view) {
        c16415ejW.EZpvd.setText("");
    }

    public static final void AEQbTJ(C16415ejW c16415ejW, C18713fnb c18713fnb, android.view.View view, boolean z) {
        wYC wyc = c16415ejW.copydefault;
        Intrinsics.checkNotNullExpressionValue(wyc, "");
        android.text.Editable text = c16415ejW.EZpvd.getText();
        wyc.setVisibility(((text != null && text.length() > 0) && z) ? 0 : 8);
        if (z) {
            c18713fnb.OLrzqt("name");
        }
    }

    /* JADX INFO: renamed from: o.fnb$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C18713fnb OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C18713fnb c18713fnb) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = c18713fnb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.values();
            }
        }
    }

    /* JADX INFO: renamed from: o.fnb$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ C18713fnb EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C18713fnb c18713fnb) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = c18713fnb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.OLrzqt(Web3SecurityTrackEvent.VALUE_CONFIRM);
                this.EZpvd.gEmmrt().gEmmrt();
            }
        }
    }

    /* JADX INFO: renamed from: o.fnb$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C18713fnb OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C18713fnb c18713fnb) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = c18713fnb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.OLrzqt("network");
                AddressBookNetworkSelectionBottomSheet addressBookNetworkSelectionBottomSheetOLrzqt = AddressBookNetworkSelectionBottomSheet.Companion.OLrzqt(new java.util.ArrayList<>(this.OLrzqt.gEmmrt().copydefault().getValue()));
                androidx.fragment.app.FragmentManager childFragmentManager = this.OLrzqt.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                addressBookNetworkSelectionBottomSheetOLrzqt.show(childFragmentManager);
            }
        }
    }

    /* JADX INFO: renamed from: o.fnb$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C18713fnb KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C18713fnb c18713fnb) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = c18713fnb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.OLrzqt("scan");
                this.KWHzl.isConnected.launch(Unit.INSTANCE);
            }
        }
    }

    public final void copydefault(C16623enS c16623enS) {
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        final C16415ejW c16415ejWCopydefault = C16415ejW.copydefault(android.view.LayoutInflater.from(context), c16623enS.AEQbTJ.fIwbmz(), false);
        C55008xbo c55008xbo = c16623enS.AEQbTJ;
        android.widget.LinearLayout root = c16415ejWCopydefault.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        c55008xbo.setContentView(root);
        c16415ejWCopydefault.EZpvd.setId(C13754dXa.ActionBar.djSkpj);
        c16415ejWCopydefault.EZpvd.setInputType(131073);
        wYC wyc = c16415ejWCopydefault.copydefault;
        Intrinsics.checkNotNullExpressionValue(wyc, "");
        wyc.setVisibility(8);
        c16415ejWCopydefault.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.fnf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C18713fnb.AEQbTJ(c16415ejWCopydefault, view);
            }
        });
        c16415ejWCopydefault.EZpvd.setHint(context.getString(C13754dXa.FragmentManager.DeEinT));
        c16415ejWCopydefault.EZpvd.setRawInputType(1);
        c16415ejWCopydefault.EZpvd.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.fnn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                C18713fnb.OLrzqt(c16415ejWCopydefault, this, view, z);
            }
        });
        OKEditText oKEditText = c16415ejWCopydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(oKEditText, "");
        Application application = new Application(c16415ejWCopydefault, this);
        oKEditText.addTextChangedListener(application);
        this.AhwBna = application;
        wYC wyc2 = c16415ejWCopydefault.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(wyc2, "");
        wyc2.setVisibility(0);
        c16415ejWCopydefault.AEQbTJ.setImageDrawable(ContextCompat.getDrawable(context, C52761wXj.TaskDescription.compare));
        wYC wyc3 = c16415ejWCopydefault.AEQbTJ;
        wyc3.setOnClickListener(new StateListAnimator(wyc3, 1000L, this));
        this.valueOf = c16415ejWCopydefault;
        android.widget.TextView root2 = C16411ejS.copydefault(android.view.LayoutInflater.from(context), c16623enS.OLrzqt.fIwbmz(), false).getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        root2.setText(context.getString(C13754dXa.FragmentManager.GqbzPL));
        c16623enS.AEQbTJ.setLabelView(root2);
    }

    public static final void AEQbTJ(C16415ejW c16415ejW, android.view.View view) {
        c16415ejW.EZpvd.setText("");
    }

    public static final void OLrzqt(C16415ejW c16415ejW, C18713fnb c18713fnb, android.view.View view, boolean z) {
        wYC wyc = c16415ejW.copydefault;
        Intrinsics.checkNotNullExpressionValue(wyc, "");
        android.text.Editable text = c16415ejW.EZpvd.getText();
        wyc.setVisibility(((text != null && text.length() > 0) && z) ? 0 : 8);
        if (z) {
            c18713fnb.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
        }
    }

    public final void values() {
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(context.getString(C13754dXa.FragmentManager.DuR));
        java.lang.String string = context.getString(C13754dXa.FragmentManager.ROgMPW);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.fnm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C18713fnb.copydefault(this.KWHzl, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C13754dXa.FragmentManager.DaTmkG, new View.OnClickListener() { // from class: o.fnk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C18713fnb.copydefault(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(C18713fnb c18713fnb, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        C32866mlf.onEvent$default("Web3AddAddress_Pop_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.fnj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18713fnb.AEQbTJ((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        LifecycleOwner viewLifecycleOwner = c18713fnb.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new WalletAddressBookDetailFragment$onDeleteButtonClicked$1$1$2(c18713fnb, null), 3, null);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, RequestParameters.SUBRESOURCE_DELETE, true));
        return Unit.INSTANCE;
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        C32866mlf.onEvent$default("Web3AddAddress_Pop_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.fnh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18713fnb.EZpvd((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, OtpEventTracker.OTP_EVENT_VALUE_CANCEL, true));
        return Unit.INSTANCE;
    }

    public final void isConnected() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new WalletAddressBookDetailFragment$observeNameText$1(this, null), 3, null);
    }

    public final void djBIcL() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new WalletAddressBookDetailFragment$observeAddressText$1(this, null), 3, null);
    }

    public static final void KWHzl(C18713fnb c18713fnb, WalletAddressBookDetailViewModel.NameInputFieldState.NameInputFieldError nameInputFieldError) {
        C16623enS c16623enS;
        C55008xbo c55008xbo;
        C55008xbo c55008xbo2;
        int i = TaskDescription.KWHzl[nameInputFieldError.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            C16623enS c16623enS2 = c18713fnb.djBIcL;
            if (c16623enS2 == null || (c55008xbo2 = c16623enS2.OLrzqt) == null) {
                return;
            }
            c55008xbo2.values();
            return;
        }
        android.content.Context context = c18713fnb.getContext();
        if (context == null || (c16623enS = c18713fnb.djBIcL) == null || (c55008xbo = c16623enS.OLrzqt) == null) {
            return;
        }
        java.lang.CharSequence text = context.getText(C13754dXa.FragmentManager.fkESqH);
        Intrinsics.checkNotNullExpressionValue(text, "");
        c55008xbo.setErrorText(text);
    }

    public final void AkhnZx() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new WalletAddressBookDetailFragment$observeNameErrorState$1(this, null), 3, null);
    }

    public static final void KWHzl(C18713fnb c18713fnb, WalletAddressBookDetailViewModel.AddressInputFieldState.AddressInputFieldError addressInputFieldError) {
        C55008xbo c55008xbo;
        ConstraintLayout constraintLayout;
        C55113xdn c55113xdn;
        C55008xbo c55008xbo2;
        C55008xbo c55008xbo3;
        int i = TaskDescription.EZpvd[addressInputFieldError.ordinal()];
        if (i == 1) {
            C16623enS c16623enS = c18713fnb.djBIcL;
            if (c16623enS != null && (c55008xbo = c16623enS.AEQbTJ) != null) {
                c55008xbo.values();
            }
        } else if (i == 2) {
            C16623enS c16623enS2 = c18713fnb.djBIcL;
            if (c16623enS2 != null && (c55008xbo2 = c16623enS2.AEQbTJ) != null) {
                FragmentActivity activity = c18713fnb.getActivity();
                if (activity == null) {
                    return;
                } else {
                    c55008xbo2.setErrorText(c18713fnb.EZpvd(activity));
                }
            }
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            android.content.Context context = c18713fnb.getContext();
            if (context == null) {
                return;
            }
            C16623enS c16623enS3 = c18713fnb.djBIcL;
            if (c16623enS3 != null && (c55008xbo3 = c16623enS3.AEQbTJ) != null) {
                java.lang.CharSequence text = context.getText(C13754dXa.FragmentManager.getUriFromString);
                Intrinsics.checkNotNullExpressionValue(text, "");
                c55008xbo3.setErrorText(text);
            }
        }
        C16623enS c16623enS4 = c18713fnb.djBIcL;
        if (c16623enS4 != null && (c55113xdn = c16623enS4.valueOf) != null) {
            c55113xdn.copydefault();
        }
        C16623enS c16623enS5 = c18713fnb.djBIcL;
        if (c16623enS5 == null || (constraintLayout = c16623enS5.values) == null) {
            return;
        }
        constraintLayout.setVisibility(8);
    }

    public final void AYXKKw() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new WalletAddressBookDetailFragment$observeAddressErrorState$1(this, null), 3, null);
    }

    public final void DbNXlk() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new WalletAddressBookDetailFragment$observeExistingAddressBookState$1(this, null), 3, null);
    }

    public final java.lang.CharSequence EZpvd(final android.app.Activity activity) {
        java.lang.String string = activity.getString(C13754dXa.FragmentManager.registerUser);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = activity.getString(C13754dXa.FragmentManager.HJWChPHhYHK);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return C33061mpO.setupSpanStyles$default(C59449zhJ.replace$default(string2, "{edit}", string, false, 4, (java.lang.Object) null), new java.lang.String[]{string}, 0, null, false, new Function1() { // from class: o.fng
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18713fnb.EZpvd(this.KWHzl, activity, (java.util.List) obj);
            }
        }, 14, null);
    }

    /* JADX INFO: renamed from: o.fnb$Activity */
    public static final class Activity extends android.text.style.ClickableSpan {
        public final /* synthetic */ android.app.Activity copydefault;

        public Activity(android.app.Activity activity) {
            this.copydefault = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            C18713fnb c18713fnb = C18713fnb.this;
            c18713fnb.copydefault(c18713fnb.gEmmrt().AEQbTJ().getValue());
            C33570myu.copydefault(this.copydefault);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setColor(ContextCompat.getColor(C18713fnb.this.requireContext(), C52761wXj.Activity.DeEinT));
            textPaint.setUnderlineText(false);
        }
    }

    public static final Unit EZpvd(C18713fnb c18713fnb, android.app.Activity activity, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(c18713fnb.new Activity(activity));
        return Unit.INSTANCE;
    }

    public final void copydefault(java.lang.String str) {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        androidx.fragment.app.FragmentManager supportFragmentManager2;
        FragmentActivity activity = getActivity();
        if (activity != null && (supportFragmentManager2 = activity.getSupportFragmentManager()) != null) {
            supportFragmentManager2.popBackStack();
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 == null || (supportFragmentManager = activity2.getSupportFragmentManager()) == null) {
            return;
        }
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        fragmentTransactionBeginTransaction.setCustomAnimations(C52761wXj.Application.OLrzqt, C52761wXj.Application.AYXKKw, C52761wXj.Application.KWHzl, C52761wXj.Application.djBIcL);
        fragmentTransactionBeginTransaction.replace(C13754dXa.ActionBar.XW, Companion.KWHzl(str));
        fragmentTransactionBeginTransaction.addToBackStack(null);
        fragmentTransactionBeginTransaction.commit();
    }

    public final void fetchVPNInfo() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new WalletAddressBookDetailFragment$observeNetworkChainList$1(this, null), 3, null);
    }

    public final void EZpvd(java.util.List<AddressChainUiData> list) {
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((AddressChainUiData) obj).AhwBna()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            C16623enS c16623enS = this.djBIcL;
            if (c16623enS != null) {
                ConstraintLayout constraintLayout = c16623enS.values;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                constraintLayout.setVisibility(0);
                android.widget.TextView textView = c16623enS.fetchVPNInfo;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(0);
                c16623enS.fetchVPNInfo.setTextColor(context.getColor(C52761wXj.Activity.QwvEab));
                c16623enS.fetchVPNInfo.setText(context.getString(C13754dXa.FragmentManager.INotificationSideChannelStubProxy));
                android.widget.LinearLayout linearLayout = c16623enS.djBIcL;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                linearLayout.setVisibility(8);
                android.widget.ImageView imageView = c16623enS.isConnected;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(0);
            }
        } else {
            C16623enS c16623enS2 = this.djBIcL;
            if (c16623enS2 != null) {
                ConstraintLayout constraintLayout2 = c16623enS2.values;
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
                constraintLayout2.setVisibility(0);
                android.widget.TextView textView2 = c16623enS2.fetchVPNInfo;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(8);
                android.widget.LinearLayout linearLayout2 = c16623enS2.djBIcL;
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                linearLayout2.setVisibility(0);
                android.widget.ImageView imageView2 = c16623enS2.isConnected;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                imageView2.setVisibility(0);
                if (arrayList.size() == 1) {
                    c16623enS2.djBIcL.setOrientation(0);
                    android.widget.TextView textView3 = c16623enS2.DbNXlk;
                    Intrinsics.checkNotNullExpressionValue(textView3, "");
                    ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMarginStart(C55298xhM.copydefault(8.0f, context));
                        marginLayoutParams.setMarginEnd(0);
                        marginLayoutParams.topMargin = 0;
                        marginLayoutParams.bottomMargin = 0;
                        textView3.setLayoutParams(marginLayoutParams);
                    } else {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                } else {
                    c16623enS2.djBIcL.setOrientation(1);
                    android.widget.TextView textView4 = c16623enS2.DbNXlk;
                    Intrinsics.checkNotNullExpressionValue(textView4, "");
                    ViewGroup.LayoutParams layoutParams2 = textView4.getLayoutParams();
                    if (layoutParams2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.setMarginStart(0);
                        marginLayoutParams2.setMarginEnd(0);
                        marginLayoutParams2.topMargin = C55298xhM.copydefault(12.0f, context);
                        marginLayoutParams2.bottomMargin = 0;
                        textView4.setLayoutParams(marginLayoutParams2);
                    } else {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                }
                KWHzl(list, arrayList);
            }
        }
        ejfBZ();
        java.util.List<java.lang.String> arrayList2 = new java.util.ArrayList<>(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AddressChainUiData) it.next()).copydefault());
        }
        AEQbTJ(arrayList2);
    }

    public final void AEQbTJ(java.util.List<java.lang.String> list) {
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        C18693fnH c18693fnH = C18693fnH.EZpvd;
        C16623enS c16623enS = this.djBIcL;
        C18693fnH.setAvatarLayoutIcons$default(c18693fnH, context, c16623enS != null ? c16623enS.AYXKKw : null, list, 32.0f, 0.0f, 5, null, 80, null);
    }

    public final void KWHzl(java.util.List<AddressChainUiData> list, java.util.List<AddressChainUiData> list2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        java.lang.String strDjBIcL;
        android.widget.TextView textView4;
        android.widget.TextView textView5;
        android.widget.TextView textView6;
        android.widget.TextView textView7;
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        if (list.size() == list2.size()) {
            C16623enS c16623enS = this.djBIcL;
            if (c16623enS == null || (textView7 = c16623enS.DbNXlk) == null) {
                return;
            }
            textView7.setText(context.getString(C13754dXa.FragmentManager.INotificationSideChannel));
            return;
        }
        if (list2.isEmpty()) {
            z = true;
        } else {
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (!((AddressChainUiData) it.next()).valueOf()) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        int size = list2.size();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((AddressChainUiData) obj).valueOf()) {
                arrayList.add(obj);
            }
        }
        if (z && (size == arrayList.size())) {
            C16623enS c16623enS2 = this.djBIcL;
            if (c16623enS2 == null || (textView6 = c16623enS2.DbNXlk) == null) {
                return;
            }
            textView6.setText(context.getString(C13754dXa.FragmentManager.ITrustedWebActivityServiceStub));
            return;
        }
        if (list2.isEmpty()) {
            z2 = true;
        } else {
            java.util.Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (!((AddressChainUiData) it2.next()).AYXKKw()) {
                    z2 = false;
                    break;
                }
            }
            z2 = true;
        }
        int size2 = list2.size();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (((AddressChainUiData) obj2).AYXKKw()) {
                arrayList2.add(obj2);
            }
        }
        if (z2 && (size2 == arrayList2.size())) {
            C16623enS c16623enS3 = this.djBIcL;
            if (c16623enS3 == null || (textView5 = c16623enS3.DbNXlk) == null) {
                return;
            }
            textView5.setText(context.getString(C13754dXa.FragmentManager.isDrawerSlideAnimationEnabled));
            return;
        }
        if (list2.isEmpty()) {
            z3 = true;
        } else {
            java.util.Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                if (!((AddressChainUiData) it3.next()).AEQbTJ()) {
                    z3 = false;
                    break;
                }
            }
            z3 = true;
        }
        int size3 = list2.size();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj3 : list) {
            if (((AddressChainUiData) obj3).AEQbTJ()) {
                arrayList3.add(obj3);
            }
        }
        if (z3 && (size3 == arrayList3.size())) {
            C16623enS c16623enS4 = this.djBIcL;
            if (c16623enS4 == null || (textView4 = c16623enS4.DbNXlk) == null) {
                return;
            }
            textView4.setText(context.getString(C13754dXa.FragmentManager.hkDICb));
            return;
        }
        if (list2.isEmpty()) {
            z4 = true;
        } else {
            java.util.Iterator<T> it4 = list2.iterator();
            while (it4.hasNext()) {
                if (!((AddressChainUiData) it4.next()).KWHzl()) {
                    z4 = false;
                    break;
                }
            }
            z4 = true;
        }
        int size4 = list2.size();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj4 : list) {
            if (((AddressChainUiData) obj4).KWHzl()) {
                arrayList4.add(obj4);
            }
        }
        if ((size4 == arrayList4.size()) && z4) {
            C16623enS c16623enS5 = this.djBIcL;
            if (c16623enS5 == null || (textView3 = c16623enS5.DbNXlk) == null) {
                return;
            }
            int i = C13754dXa.FragmentManager.read;
            kotlin.Pair[] pairArr = new kotlin.Pair[1];
            C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault();
            if (c10854bwMCopydefault == null || (strDjBIcL = c10854bwMCopydefault.djBIcL()) == null) {
                strDjBIcL = "";
            }
            pairArr[0] = C56390yDp.OLrzqt("chainName", strDjBIcL);
            textView3.setText(C33069mpW.KWHzl(context, i, C56424yEw.AYXKKw(pairArr)));
            return;
        }
        if (list2.size() == 2) {
            C16623enS c16623enS6 = this.djBIcL;
            if (c16623enS6 == null || (textView2 = c16623enS6.DbNXlk) == null) {
                return;
            }
            textView2.setText(C33069mpW.KWHzl(context, C13754dXa.FragmentManager.ITrustedWebActivityServiceDefault, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("first", ((AddressChainUiData) CollectionsKt___CollectionsKt.AuCTelauCTel(list2)).EZpvd()), C56390yDp.OLrzqt("second", list2.get(1).EZpvd()))));
            return;
        }
        if (list2.size() == 1) {
            C16623enS c16623enS7 = this.djBIcL;
            if (c16623enS7 != null) {
                c16623enS7.DbNXlk.setText(((AddressChainUiData) CollectionsKt___CollectionsKt.AuCTelauCTel(list2)).EZpvd());
                return;
            }
            return;
        }
        C16623enS c16623enS8 = this.djBIcL;
        if (c16623enS8 == null || (textView = c16623enS8.DbNXlk) == null) {
            return;
        }
        textView.setText(C33069mpW.KWHzl(context, C13754dXa.FragmentManager.cancelAll, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("first", ((AddressChainUiData) CollectionsKt___CollectionsKt.AuCTelauCTel(list2)).EZpvd()))));
    }

    public final void ejfBZ() {
        ConstraintLayout constraintLayout;
        C16623enS c16623enS = this.djBIcL;
        if (c16623enS == null || (constraintLayout = c16623enS.values) == null) {
            return;
        }
        constraintLayout.setOnClickListener(new LoaderManager(constraintLayout, 1000L, this));
    }

    public final void valueOf() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new WalletAddressBookDetailFragment$observeButtonEnabledState$1(this, null), 3, null);
    }

    public final void AhwBna() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new WalletAddressBookDetailFragment$observeAddressAddOrUpdateState$1(this, null), 3, null);
    }

    @Override // com.okinc.business.defi.wallet.mine.addressbook.detail.AddressBookNetworkSelectionBottomSheet.StateListAnimator
    public void KWHzl(@NotNull java.util.List<AddressChainUiData> list) {
        ConstraintLayout constraintLayoutCopydefault;
        Intrinsics.checkNotNullParameter(list, "");
        C16623enS c16623enS = this.djBIcL;
        if (c16623enS != null && (constraintLayoutCopydefault = c16623enS.getRoot()) != null) {
            constraintLayoutCopydefault.requestFocus();
        }
        gEmmrt().OLrzqt(list);
    }

    public final void OLrzqt(final java.lang.String str) {
        C32866mlf.onEvent$default("Web3AddAddress_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.fnl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18713fnb.KWHzl(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, str, true));
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        C16415ejW c16415ejW;
        OKEditText oKEditText;
        C16415ejW c16415ejW2;
        OKEditText oKEditText2;
        super.onDestroyView();
        android.text.TextWatcher textWatcher = this.fetchVPNInfo;
        if (textWatcher != null && (c16415ejW2 = this.AYXKKw) != null && (oKEditText2 = c16415ejW2.EZpvd) != null) {
            C33606mzd.OLrzqt(oKEditText2, textWatcher);
        }
        android.text.TextWatcher textWatcher2 = this.AhwBna;
        if (textWatcher2 != null && (c16415ejW = this.valueOf) != null && (oKEditText = c16415ejW.EZpvd) != null) {
            C33606mzd.OLrzqt(oKEditText, textWatcher2);
        }
        this.fetchVPNInfo = null;
        this.AhwBna = null;
        this.AYXKKw = null;
        this.valueOf = null;
        this.djBIcL = null;
    }

    /* JADX INFO: renamed from: o.fnb$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fnb.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C18713fnb newInstance$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return actionBar.KWHzl(str);
        }

        public final C18713fnb KWHzl(java.lang.String str) {
            C18713fnb c18713fnb = new C18713fnb();
            if (str != null) {
                c18713fnb.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str)));
            }
            return c18713fnb;
        }
    }
}
