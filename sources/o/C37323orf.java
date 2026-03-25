package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.okinc.core.util.ScannerActivity;
import com.okinc.core.util.model.ScanConfig;
import com.okinc.core.util.qrcode.decode.ScanType;
import com.okinc.im.bean.ChatOrigin;
import com.okinc.im.config.page.IMPageType;
import com.okinc.im.imui.relationlist.model.AddContactOption;
import com.okinc.im.imui.relationlist.model.ReferralData;
import com.okinc.im.imui.relationlist.ui.addcontact.AddContactFragment$initView$1;
import com.okinc.im.imui.relationlist.viewmodel.addcontact.AddContactViewModel;
import com.okinc.ok_kyc_core_api.ComplianceCountryListService;
import com.okinc.ok_kyc_core_api.model.CountryBean;
import com.okinc.uilab.edit.OKEditText;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.orf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37323orf extends AbstractC37338oru {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public C33886nJm AEQbTJ;
    public final InterfaceC56387yDm KWHzl;
    public final int OLrzqt = C35399nuc.Dialog.fZBcTu;

    /* JADX INFO: renamed from: o.orf$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AddContactOption.values().length];
            try {
                iArr[AddContactOption.PHONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AddContactOption.EMAIL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[AddContactOption.UID.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX INFO: renamed from: o.orf$PendingIntent */
    public static final /* synthetic */ class PendingIntent implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.OLrzqt;
    }

    public C37323orf() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.relationlist.ui.addcontact.AddContactFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.relationlist.ui.addcontact.AddContactFragment$special$$inlined$viewModels$default$2
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
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AddContactViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.relationlist.ui.addcontact.AddContactFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.relationlist.ui.addcontact.AddContactFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.relationlist.ui.addcontact.AddContactFragment$special$$inlined$viewModels$default$5
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
    }

    /* JADX INFO: renamed from: o.orf$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.orf.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C37323orf EZpvd() {
            return new C37323orf();
        }
    }

    public final AddContactViewModel KWHzl() {
        return (AddContactViewModel) this.KWHzl.getValue();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C33886nJm c33886nJmAEQbTJ = C33886nJm.AEQbTJ(layoutInflater, viewGroup, false);
        this.AEQbTJ = c33886nJmAEQbTJ;
        if (c33886nJmAEQbTJ != null) {
            return c33886nJmAEQbTJ.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AYXKKw();
        AhwBna();
        AkhnZx();
        valueOf();
        djBIcL();
        fetchVPNInfo();
        EZpvd();
        fARcdN();
        KWHzl().djBIcL();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new AddContactFragment$initView$1(this, null), 3, null);
        view.post(new java.lang.Runnable() { // from class: o.orv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C37323orf.copydefault(this.EZpvd);
            }
        });
    }

    public static final void copydefault(C37323orf c37323orf) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c37323orf, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void KWHzl(AddContactViewModel.TaskDescription taskDescription) {
        if (!(taskDescription instanceof AddContactViewModel.TaskDescription.C0474TaskDescription)) {
            throw new NoWhenBranchMatchedException();
        }
        ScannerActivity.Activity activity = ScannerActivity.Companion;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        activity.KWHzl(contextRequireContext, ScanType.Companion.copydefault(), new ScanConfig(false, null, null, null, null, false, null, false, true, null, false, null, 3839, null));
    }

    public final void EZpvd() {
        KWHzl().values().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.orn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37323orf.gEmmrt(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final Unit gEmmrt(C37323orf c37323orf, java.lang.Boolean bool) {
        C52794wYp c52794wYp;
        C33886nJm c33886nJm = c37323orf.AEQbTJ;
        if (c33886nJm != null && (c52794wYp = c33886nJm.AhwBna) != null) {
            c52794wYp.setEnabled(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    public final void AYXKKw() {
        OLrzqt();
        AEQbTJ();
        gEmmrt();
        KWHzl().isConnected().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.orl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37323orf.AYXKKw(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final Unit AYXKKw(C37323orf c37323orf, java.lang.Boolean bool) {
        OKEditText oKEditText;
        android.text.Editable text;
        OKEditText oKEditText2;
        ConstraintLayout constraintLayout;
        C33886nJm c33886nJm = c37323orf.AEQbTJ;
        if (c33886nJm != null && (constraintLayout = c33886nJm.valueOf) != null) {
            constraintLayout.setVisibility(bool.booleanValue() ? 0 : 8);
        }
        if (bool.booleanValue()) {
            C33886nJm c33886nJm2 = c37323orf.AEQbTJ;
            if (c33886nJm2 != null && (oKEditText2 = c33886nJm2.EZpvd) != null) {
                c37323orf.AEQbTJ(oKEditText2);
            }
            C33886nJm c33886nJm3 = c37323orf.AEQbTJ;
            if (c33886nJm3 != null && (oKEditText = c33886nJm3.EZpvd) != null && (text = oKEditText.getText()) != null) {
                c37323orf.KWHzl().EZpvd(text, AddContactOption.PHONE);
            }
        }
        return Unit.INSTANCE;
    }

    public final void AhwBna() {
        KWHzl().AkhnZx().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.ork
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37323orf.AhwBna(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final Unit AhwBna(C37323orf c37323orf, java.lang.Boolean bool) {
        OKEditText oKEditText;
        android.text.Editable text;
        OKEditText oKEditText2;
        TextInputLayout textInputLayout;
        C33886nJm c33886nJm = c37323orf.AEQbTJ;
        if (c33886nJm != null && (textInputLayout = c33886nJm.AkhnZx) != null) {
            textInputLayout.setVisibility(bool.booleanValue() ? 0 : 8);
        }
        if (bool.booleanValue()) {
            C33886nJm c33886nJm2 = c37323orf.AEQbTJ;
            if (c33886nJm2 != null && (oKEditText2 = c33886nJm2.OLrzqt) != null) {
                c37323orf.AEQbTJ(oKEditText2);
            }
            C33886nJm c33886nJm3 = c37323orf.AEQbTJ;
            if (c33886nJm3 != null && (oKEditText = c33886nJm3.OLrzqt) != null && (text = oKEditText.getText()) != null) {
                c37323orf.KWHzl().EZpvd(text, AddContactOption.EMAIL);
            }
        }
        return Unit.INSTANCE;
    }

    public final void AkhnZx() {
        KWHzl().fetchVPNInfo().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.orm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37323orf.djBIcL(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final Unit djBIcL(C37323orf c37323orf, java.lang.Boolean bool) {
        OKEditText oKEditText;
        android.text.Editable text;
        OKEditText oKEditText2;
        TextInputLayout textInputLayout;
        C33886nJm c33886nJm = c37323orf.AEQbTJ;
        if (c33886nJm != null && (textInputLayout = c33886nJm.fetchVPNInfo) != null) {
            textInputLayout.setVisibility(bool.booleanValue() ? 0 : 8);
        }
        if (bool.booleanValue()) {
            C33886nJm c33886nJm2 = c37323orf.AEQbTJ;
            if (c33886nJm2 != null && (oKEditText2 = c33886nJm2.KWHzl) != null) {
                c37323orf.AEQbTJ(oKEditText2);
            }
            C33886nJm c33886nJm3 = c37323orf.AEQbTJ;
            if (c33886nJm3 != null && (oKEditText = c33886nJm3.KWHzl) != null && (text = oKEditText.getText()) != null) {
                c37323orf.KWHzl().EZpvd(text, AddContactOption.UID);
            }
        }
        return Unit.INSTANCE;
    }

    public final void fetchVPNInfo() {
        C55254xgV c55254xgV;
        java.lang.String str;
        C33886nJm c33886nJm = this.AEQbTJ;
        if (c33886nJm == null || (c55254xgV = c33886nJm.AYXKKw) == null) {
            return;
        }
        for (AddContactOption addContactOption : KWHzl().valueOf()) {
            TabLayout.Tab text = c55254xgV.gEmmrt().setText(addContactOption.getTitle());
            int i = ActionBar.AEQbTJ[addContactOption.ordinal()];
            if (i == 1) {
                str = "add_contact_tab_phone";
            } else if (i == 2) {
                str = "add_contact_tab_email";
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "add_contact_tab_uid";
            }
            TabLayout.Tab contentDescription = text.setContentDescription(str);
            Intrinsics.checkNotNullExpressionValue(contentDescription, "");
            c55254xgV.EZpvd(contentDescription);
        }
        c55254xgV.AEQbTJ(new FragmentManager());
    }

    /* JADX INFO: renamed from: o.orf$FragmentManager */
    public static final class FragmentManager implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public FragmentManager() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            AddContactOption addContactOption = (AddContactOption) yDV.gEmmrt(AddContactOption.values(), tab != null ? tab.getPosition() : -1);
            if (addContactOption != null) {
                C37323orf.this.KWHzl().OLrzqt(addContactOption);
            }
        }
    }

    public final void AEQbTJ(android.widget.EditText editText) {
        android.view.Window window;
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(5);
    }

    /* JADX INFO: renamed from: o.orf$Fragment */
    public static final class Fragment implements Function1<CountryBean.Country, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(CountryBean.Country country) {
            OLrzqt(country);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(CountryBean.Country country) {
            OKEditText oKEditText;
            android.text.Editable text;
            Intrinsics.checkNotNullParameter(country, "");
            C37323orf.this.KWHzl().OLrzqt(country.getTelephoneCode());
            C33886nJm c33886nJm = C37323orf.this.AEQbTJ;
            if (c33886nJm == null || (oKEditText = c33886nJm.EZpvd) == null || (text = oKEditText.getText()) == null) {
                return;
            }
            C37323orf.this.KWHzl().EZpvd(text, AddContactOption.PHONE);
        }
    }

    public final void gEmmrt() {
        android.widget.LinearLayout linearLayout;
        C33886nJm c33886nJm = this.AEQbTJ;
        if (c33886nJm == null || (linearLayout = c33886nJm.fARcdN) == null) {
            return;
        }
        linearLayout.setOnClickListener(new Activity(linearLayout, 1000L, this));
    }

    /* JADX INFO: renamed from: o.orf$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C37323orf AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C37323orf c37323orf) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = c37323orf;
        }

        /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core_api.ComplianceCountryListService.StateListAnimator.showCountryListPage$default(com.okinc.ok_kyc_core_api.ComplianceCountryListService, androidx.fragment.app.FragmentManager, androidx.lifecycle.LifecycleOwner, com.okinc.ok_kyc_core_api.ComplianceCountryListService$FunctionType, java.lang.String, java.lang.Boolean, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                ComplianceCountryListService complianceCountryListService = (ComplianceCountryListService) C43251rlk.copydefault(ComplianceCountryListService.class);
                androidx.fragment.app.FragmentManager parentFragmentManager = this.AEQbTJ.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                LifecycleOwner viewLifecycleOwner = this.AEQbTJ.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                ComplianceCountryListService.StateListAnimator.showCountryListPage$default(complianceCountryListService, parentFragmentManager, viewLifecycleOwner, ComplianceCountryListService.FunctionType.OKX_PHONE, null, java.lang.Boolean.FALSE, this.AEQbTJ.new Fragment(), 8, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.orf$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C37323orf AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C37323orf c37323orf) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = c37323orf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.KWHzl().fJNWhG();
            }
        }
    }

    /* JADX INFO: renamed from: o.orf$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C37323orf OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C37323orf c37323orf) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = c37323orf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            OKEditText oKEditText;
            OKEditText oKEditText2;
            OKEditText oKEditText3;
            android.widget.TextView textView;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C33886nJm c33886nJm = this.OLrzqt.AEQbTJ;
                android.text.Editable text = null;
                java.lang.String strValueOf = java.lang.String.valueOf((c33886nJm == null || (textView = c33886nJm.isConnected) == null) ? null : textView.getText());
                C33886nJm c33886nJm2 = this.OLrzqt.AEQbTJ;
                java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) java.lang.String.valueOf((c33886nJm2 == null || (oKEditText3 = c33886nJm2.EZpvd) == null) ? null : oKEditText3.getText())).toString();
                C33886nJm c33886nJm3 = this.OLrzqt.AEQbTJ;
                java.lang.String string2 = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) java.lang.String.valueOf((c33886nJm3 == null || (oKEditText2 = c33886nJm3.OLrzqt) == null) ? null : oKEditText2.getText())).toString();
                C33886nJm c33886nJm4 = this.OLrzqt.AEQbTJ;
                if (c33886nJm4 != null && (oKEditText = c33886nJm4.KWHzl) != null) {
                    text = oKEditText.getText();
                }
                this.OLrzqt.KWHzl().OLrzqt(strValueOf, string, string2, StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) java.lang.String.valueOf(text)).toString());
            }
        }
    }

    public final void OLrzqt() {
        KWHzl().copydefault().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.oro
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37323orf.KWHzl(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
    }

    public static final Unit KWHzl(C37323orf c37323orf, java.lang.String str) {
        android.widget.TextView textView;
        C33886nJm c33886nJm = c37323orf.AEQbTJ;
        if (c33886nJm != null && (textView = c33886nJm.isConnected) != null) {
            textView.setText(str);
            textView.setTextColor(ContextCompat.getColorStateList(textView.getContext(), C52761wXj.Activity.getSerial));
        }
        return Unit.INSTANCE;
    }

    public final void valueOf() {
        KWHzl().AYXKKw().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.orj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37323orf.OLrzqt((C32989mnw) obj);
            }
        }));
    }

    public static final Unit OLrzqt(C32989mnw c32989mnw) {
        java.lang.String str = (java.lang.String) c32989mnw.KWHzl();
        if (str != null) {
            C55326xho.toast$default(str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        OKEditText oKEditText;
        OKEditText oKEditText2;
        OKEditText oKEditText3;
        C33886nJm c33886nJm = this.AEQbTJ;
        if (c33886nJm != null && (oKEditText3 = c33886nJm.EZpvd) != null) {
            oKEditText3.addTextChangedListener(copydefault(AddContactOption.PHONE));
        }
        C33886nJm c33886nJm2 = this.AEQbTJ;
        if (c33886nJm2 != null && (oKEditText2 = c33886nJm2.OLrzqt) != null) {
            oKEditText2.addTextChangedListener(copydefault(AddContactOption.EMAIL));
        }
        C33886nJm c33886nJm3 = this.AEQbTJ;
        if (c33886nJm3 == null || (oKEditText = c33886nJm3.KWHzl) == null) {
            return;
        }
        oKEditText.addTextChangedListener(copydefault(AddContactOption.UID));
    }

    /* JADX INFO: renamed from: o.orf$Dialog */
    public static final class Dialog implements android.text.TextWatcher {
        public final /* synthetic */ AddContactOption OLrzqt;

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Dialog(AddContactOption addContactOption) {
            this.OLrzqt = addContactOption;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            C37323orf.this.KWHzl().EZpvd(java.lang.String.valueOf(charSequence), this.OLrzqt);
        }
    }

    public final Dialog copydefault(AddContactOption addContactOption) {
        return new Dialog(addContactOption);
    }

    private final void fARcdN() {
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        C33886nJm c33886nJm = this.AEQbTJ;
        if (c33886nJm != null && (c52794wYp2 = c33886nJm.gEmmrt) != null) {
            c52794wYp2.setOnClickListener(new Application(c52794wYp2, 1000L, this));
        }
        C33886nJm c33886nJm2 = this.AEQbTJ;
        if (c33886nJm2 == null || (c52794wYp = c33886nJm2.AhwBna) == null) {
            return;
        }
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
    }

    public final void AEQbTJ() {
        KWHzl().DbNXlk().observe(this, new PendingIntent(new Function1() { // from class: o.ors
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37323orf.valueOf(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        KWHzl().OLrzqt().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.orp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37323orf.EZpvd(this.AEQbTJ, (C32989mnw) obj);
            }
        }));
        KWHzl().AhwBna().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.orq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37323orf.copydefault(this.AEQbTJ, (C32989mnw) obj);
            }
        }));
    }

    public static final Unit valueOf(C37323orf c37323orf, java.lang.Boolean bool) {
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        boolean zBooleanValue = bool.booleanValue();
        C33886nJm c33886nJm = c37323orf.AEQbTJ;
        if (zBooleanValue) {
            if (c33886nJm != null && (c52794wYp2 = c33886nJm.AhwBna) != null) {
                c52794wYp2.OLrzqt(0L);
            }
        } else if (c33886nJm != null && (c52794wYp = c33886nJm.AhwBna) != null) {
            c52794wYp.fIwbmz();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C37323orf c37323orf, C32989mnw c32989mnw) {
        kotlin.Pair pair = (kotlin.Pair) c32989mnw.KWHzl();
        if (pair != null) {
            C33764nEz c33764nEz = C33764nEz.OLrzqt;
            android.content.Context contextRequireContext = c37323orf.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            ChatOrigin chatOrigin = ChatOrigin.NEW_CHAT_FRIEND_LIST;
            IMPageType iMPageType = IMPageType.NORMAL_IM;
            C33764nEz.startIMChat$default(c33764nEz, contextRequireContext, (java.lang.String) pair.getSecond(), chatOrigin, null, null, (java.lang.String) pair.getFirst(), iMPageType, null, null, 408, null);
        }
        C37290oqz c37290oqz = C37290oqz.copydefault;
        FragmentActivity fragmentActivityRequireActivity = c37323orf.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        c37290oqz.AEQbTJ(fragmentActivityRequireActivity);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(final C37323orf c37323orf, C32989mnw c32989mnw) {
        ConstraintLayout constraintLayoutAEQbTJ;
        final ReferralData referralData = (ReferralData) c32989mnw.KWHzl();
        if (referralData != null) {
            C33886nJm c33886nJm = c37323orf.AEQbTJ;
            if ((c33886nJm != null ? c33886nJm.EZpvd : null) != null) {
                android.content.Context contextRequireContext = c37323orf.requireContext();
                C33886nJm c33886nJm2 = c37323orf.AEQbTJ;
                C33570myu.AEQbTJ(contextRequireContext, (android.view.View) (c33886nJm2 != null ? c33886nJm2.EZpvd : null));
            }
            C33886nJm c33886nJm3 = c37323orf.AEQbTJ;
            if (c33886nJm3 != null && (constraintLayoutAEQbTJ = c33886nJm3.getRoot()) != null) {
                constraintLayoutAEQbTJ.postDelayed(new java.lang.Runnable() { // from class: o.orr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C37323orf.AEQbTJ(referralData, c37323orf);
                    }
                }, 300L);
            }
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(ReferralData referralData, C37323orf c37323orf) {
        C37314orW c37314orWKWHzl = C37314orW.Companion.KWHzl(referralData);
        androidx.fragment.app.FragmentManager childFragmentManager = c37323orf.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c37314orWKWHzl.show(childFragmentManager);
    }
}
