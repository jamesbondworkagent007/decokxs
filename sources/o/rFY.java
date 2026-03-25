package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.amplifyframework.core.model.ModelIdentifier;
import com.bytedance.applog.encryptor.IEncryptorType;
import com.okinc.components.track.TrackChannel;
import com.okinc.ok_kyc_core.presentation.countrylist.CountryListFragment$onCreateContent$1;
import com.okinc.ok_kyc_core.presentation.countrylist.CountryListFragment$onCreateContent$4;
import com.okinc.ok_kyc_core_api.ComplianceCountryListService;
import com.okinc.ok_kyc_core_api.model.CountryBean;
import java.util.LinkedHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C42095rGd;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class rFY extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public C43828rwe AEQbTJ;
    public final java.util.List<C55102xdc> AYXKKw;
    public java.util.Map<java.lang.Integer, InterfaceC55105xdf> AhwBna;
    public final C43316rmw EZpvd = new C43316rmw();
    public boolean KWHzl = true;
    public java.util.List<java.lang.String> OLrzqt;
    public int gEmmrt;
    public final InterfaceC56387yDm valueOf;

    @Override // o.wXX
    public float getHeightScale() {
        return 0.95f;
    }

    public rFY() {
        Function0 function0 = new Function0() { // from class: o.rGa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return rFY.AEQbTJ(this.KWHzl);
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.ok_kyc_core.presentation.countrylist.CountryListFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.ok_kyc_core.presentation.countrylist.CountryListFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        final Function0 function03 = null;
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C42095rGd.class), new Function0<ViewModelStore>() { // from class: com.okinc.ok_kyc_core.presentation.countrylist.CountryListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.ok_kyc_core.presentation.countrylist.CountryListFragment$special$$inlined$viewModels$default$4
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
                Function0 function04 = function03;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function0);
        this.OLrzqt = new java.util.ArrayList();
        this.AhwBna = new LinkedHashMap();
        this.AYXKKw = new java.util.ArrayList();
    }

    public final C43828rwe OLrzqt() {
        C43828rwe c43828rwe = this.AEQbTJ;
        Intrinsics.copydefault(c43828rwe);
        return c43828rwe;
    }

    public final C42095rGd EZpvd() {
        return (C42095rGd) this.valueOf.getValue();
    }

    public static final ViewModelProvider.Factory AEQbTJ(rFY rfy) {
        return new C42095rGd.Activity((ComplianceCountryListService) C43251rlk.copydefault(ComplianceCountryListService.class), rfy, rfy.getArguments());
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        android.view.Window window;
        android.view.View decorView;
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewCompat.setOnApplyWindowInsetsListener(decorView, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.rFZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return rFY.copydefault(this.AEQbTJ, view, windowInsetsCompat);
            }
        });
    }

    public static final WindowInsetsCompat copydefault(rFY rfy, android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        rfy.OLrzqt().copydefault.setPaddingRelative(0, 0, 0, windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()).bottom);
        return windowInsetsCompat;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        android.view.Window window;
        android.view.View decorView;
        super.onPause();
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.setOnApplyWindowInsetsListener(null);
    }

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
            java.lang.String string;
            java.lang.String string2;
            if (editable == null || (string2 = editable.toString()) == null || (string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) string2).toString()) == null) {
                string = "";
            }
            rFY.this.EZpvd().copydefault(string);
            rFY.this.OLrzqt().djBIcL.setVisibility(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string) ? 0 : 8);
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        c52781wYc.setType(3);
        android.os.Bundle arguments = getArguments();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (arguments != null ? arguments.getString("ARG_COUNTRY_CODE") : null))) {
            java.lang.String string = getString(C43662rtX.Dialog.iwGUEr);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c52781wYc.setTitle(string);
        } else {
            java.lang.String string2 = getString(C43662rtX.Dialog.run);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            c52781wYc.setTitle(string2);
        }
        android.widget.ImageView imageViewOLrzqt = c52781wYc.OLrzqt();
        if (imageViewOLrzqt != null) {
            imageViewOLrzqt.setOnClickListener(new StateListAnimator(imageViewOLrzqt, 1000L, this));
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        this.AEQbTJ = C43828rwe.copydefault(getLayoutInflater(), constraintLayout, false);
        constraintLayout.addView(OLrzqt().getRoot());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        OLrzqt().copydefault.setLayoutManager(linearLayoutManager);
        OLrzqt().djBIcL.setLayoutManager(linearLayoutManager);
        OLrzqt().copydefault.setAdapter(this.EZpvd);
        this.EZpvd.register(C42095rGd.TaskDescription.Activity.class, new C42097rGf());
        this.EZpvd.register(C42095rGd.TaskDescription.Application.class, new C42096rGe());
        this.EZpvd.register(C42095rGd.TaskDescription.C0927TaskDescription.class, new C42093rGb(EZpvd().AEQbTJ(), EZpvd().AhwBna(), EZpvd().EZpvd(), new CountryListFragment$onCreateContent$1(this)));
        OLrzqt().copydefault.setHasFixedSize(true);
        OLrzqt().AYXKKw.EZpvd().addTextChangedListener(new Application());
        if (!EZpvd().AhwBna() && EZpvd().AEQbTJ()) {
            OLrzqt().AYXKKw.EZpvd().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.rFX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    rFY.copydefault(view, z);
                }
            });
        }
        OLrzqt().AYXKKw.EZpvd().setImeOptions(6);
        Flow flowOnEach = FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(EZpvd().KWHzl(), getViewLifecycleOwner().getLifecycle(), null, 2, null), new CountryListFragment$onCreateContent$4(this, null));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        FlowKt.launchIn(flowOnEach, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner));
        OLrzqt().KWHzl.setAutoMirrored(true);
        OLrzqt().KWHzl.KWHzl(0L);
        EZpvd().valueOf();
    }

    public static final void copydefault(android.view.View view, boolean z) {
        if (z) {
            C32866mlf.onEvent$default("All_PhoneCountryCodeSearch_Inputbox_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        }
    }

    public final void AEQbTJ() {
        this.gEmmrt = 0;
        this.OLrzqt.clear();
        this.AYXKKw.clear();
        this.AhwBna.clear();
    }

    public final void KWHzl(InterfaceC55105xdf interfaceC55105xdf) {
        this.AhwBna.put(java.lang.Integer.valueOf(this.gEmmrt), interfaceC55105xdf);
        this.gEmmrt++;
        copydefault();
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ rFY KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, rFY rfy) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = rfy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }

    private final void copydefault() {
        if (this.gEmmrt == 0) {
            return;
        }
        KWHzl();
    }

    public final void KWHzl() {
        this.AYXKKw.clear();
        if (this.OLrzqt.size() == 0) {
            return;
        }
        int i = this.gEmmrt;
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC55105xdf interfaceC55105xdf = this.AhwBna.get(java.lang.Integer.valueOf(i2));
            Intrinsics.copydefault(interfaceC55105xdf);
            int size = interfaceC55105xdf.getSectionDataList().size();
            if (!android.text.TextUtils.isEmpty(this.OLrzqt.get(i2))) {
                size++;
            }
            for (int i3 = 0; i3 < size; i3++) {
                this.AYXKKw.add(new C55102xdc(false, this.OLrzqt.get(i2), null, 5, null));
            }
        }
        OLrzqt().djBIcL.OLrzqt(this.AYXKKw).requestLayout();
    }

    public final void copydefault(java.util.List<java.lang.String> list) {
        java.util.List<java.lang.String> list2 = this.OLrzqt;
        list2.clear();
        list2.addAll(list);
        KWHzl();
    }

    public final void EZpvd(java.util.List<C42095rGd.TaskDescription> list) {
        AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.String str = "";
        int i = 0;
        boolean z = false;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            C42095rGd.TaskDescription taskDescription = (C42095rGd.TaskDescription) obj;
            if (taskDescription instanceof C42095rGd.TaskDescription.Activity) {
                z = i == 0 && !C59449zhJ.gEmmrt(((C42095rGd.TaskDescription.Activity) taskDescription).EZpvd().copydefault(), IEncryptorType.DEFAULT_ENCRYPTOR, true);
                if (C33129mqd.KWHzl((java.util.Collection) arrayList2)) {
                    KWHzl(new C55102xdc(!z, str, arrayList2));
                    arrayList2 = new java.util.ArrayList();
                }
                java.lang.String strCopydefault = z ? ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER : ((C42095rGd.TaskDescription.Activity) taskDescription).EZpvd().copydefault();
                java.lang.String strCopydefault2 = ((C42095rGd.TaskDescription.Activity) taskDescription).EZpvd().copydefault();
                arrayList.add(strCopydefault);
                str = strCopydefault2;
            } else if (taskDescription instanceof C42095rGd.TaskDescription.C0927TaskDescription) {
                arrayList2.add(taskDescription);
            } else if (taskDescription instanceof C42095rGd.TaskDescription.Application) {
                arrayList2.add(taskDescription);
            }
            i++;
        }
        if (C33129mqd.KWHzl((java.util.Collection) arrayList2)) {
            KWHzl(new C55102xdc(!z, str, arrayList2));
            new java.util.ArrayList();
        }
        copydefault(arrayList);
    }

    public final void EZpvd(CountryBean.Country country) {
        FragmentKt.setFragmentResult(this, "REQUEST_KEY_COUNTRY_SELECTED", BundleKt.bundleOf(C56390yDp.OLrzqt("RESULT_KEY_COUNTRY", country)));
        dismissAllowingStateLoss();
    }

    public final void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull LifecycleOwner lifecycleOwner, @NotNull final Function1<? super CountryBean.Country, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(function1, "");
        fragmentManager.setFragmentResultListener("REQUEST_KEY_COUNTRY_SELECTED", lifecycleOwner, new FragmentResultListener() { // from class: o.rGc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                rFY.OLrzqt(function1, str, bundle);
            }
        });
    }

    public static final void OLrzqt(Function1 function1, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        CountryBean.Country country = (CountryBean.Country) bundle.getParcelable("RESULT_KEY_COUNTRY");
        if (country != null) {
            function1.invoke(country);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AEQbTJ = null;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rFY.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ rFY newInstance$default(TaskDescription taskDescription, boolean z, ComplianceCountryListService.FunctionType functionType, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = true;
            }
            if ((i & 2) != 0) {
                functionType = ComplianceCountryListService.FunctionType.OKX_PHONE;
            }
            ComplianceCountryListService.FunctionType functionType2 = functionType;
            java.lang.String str3 = (i & 4) != 0 ? null : str;
            java.lang.String str4 = (i & 8) == 0 ? str2 : null;
            if ((i & 16) != 0) {
                bool = java.lang.Boolean.FALSE;
            }
            return taskDescription.copydefault(z, functionType2, str3, str4, bool);
        }

        public final rFY copydefault(boolean z, @NotNull ComplianceCountryListService.FunctionType functionType, java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
            Intrinsics.checkNotNullParameter(functionType, "");
            rFY rfy = new rFY();
            kotlin.Pair[] pairArr = new kotlin.Pair[5];
            if (functionType == ComplianceCountryListService.FunctionType.REGISTRATION_LIST) {
                z = false;
            }
            pairArr[0] = C56390yDp.OLrzqt("ARG_SHOW_AREA_CODE", java.lang.Boolean.valueOf(z));
            pairArr[1] = C56390yDp.OLrzqt("KEY_FUNCTION_TYPE", functionType);
            pairArr[2] = C56390yDp.OLrzqt("ARG_SELECTED_COUNTRY_ID", str);
            pairArr[3] = C56390yDp.OLrzqt("ARG_SHOW_COUNTRY_FLAG", bool);
            pairArr[4] = C56390yDp.OLrzqt("ARG_COUNTRY_CODE", str2);
            rfy.setArguments(BundleKt.bundleOf(pairArr));
            return rfy;
        }
    }
}
