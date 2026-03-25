package o;

import android.view.View;
import androidx.activity.OnBackPressedCallback;
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
import com.okinc.auth.api.reset2fa.data.model.ResetMfaInitiateResponse;
import com.okinc.auth.impl.reset2fa.ui.ResetMfaViewModel;
import com.okinc.auth.impl.reset2fa.ui.resetmfaoption.ResetMfaSelectionViewModel;
import com.okinc.auth.impl.reset2fa.ui.resetmfaoption.ResetOption;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C6671aTj;
import o.C8206ayP;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aTj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6671aTj extends AbstractC6674aTm {
    private static final Application Companion = new Application(null);
    public static final int djBIcL = 8;
    public C8244azA AYXKKw;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm valueOf;

    /* JADX INFO: renamed from: o.aTj$Dialog */
    public static final /* synthetic */ class Dialog implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C8206ayP.Application.AxsJAY;
    }

    public C6671aTj() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.auth.impl.reset2fa.ui.resetmfaoption.ResetMfaSelectionFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.auth.impl.reset2fa.ui.resetmfaoption.ResetMfaSelectionFragment$special$$inlined$viewModels$default$2
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ResetMfaSelectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.reset2fa.ui.resetmfaoption.ResetMfaSelectionFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.reset2fa.ui.resetmfaoption.ResetMfaSelectionFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.reset2fa.ui.resetmfaoption.ResetMfaSelectionFragment$special$$inlined$viewModels$default$5
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ResetMfaViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.reset2fa.ui.resetmfaoption.ResetMfaSelectionFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.reset2fa.ui.resetmfaoption.ResetMfaSelectionFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.reset2fa.ui.resetmfaoption.ResetMfaSelectionFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX DEBUG: Possible override for method o.aTm.EZpvd()V */
    public final C8244azA EZpvd() {
        C8244azA c8244azA = this.AYXKKw;
        Intrinsics.copydefault(c8244azA);
        return c8244azA;
    }

    public final ResetMfaSelectionViewModel gEmmrt() {
        return (ResetMfaSelectionViewModel) this.gEmmrt.getValue();
    }

    private final ResetMfaViewModel djBIcL() {
        return (ResetMfaViewModel) this.valueOf.getValue();
    }

    /* JADX INFO: renamed from: o.aTj$Application */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aTj.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.aTj$TaskDescription */
    public static final class TaskDescription extends OnBackPressedCallback {
        public TaskDescription() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("Reset2FAFirstLanding_Full_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aTG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C6671aTj.TaskDescription.KWHzl((EventParamsList) obj);
                }
            });
            C6671aTj.this.requireActivity().finish();
        }

        public static final Unit KWHzl(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "back", false);
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new TaskDescription());
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.onEvent$default("Reset2FAFirstLanding_Account_FullPage_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String string;
        java.lang.String strUnicodeWrap;
        int i;
        java.lang.String str;
        Intrinsics.checkNotNullParameter(view, "");
        this.AYXKKw = C8244azA.EZpvd(view);
        gEmmrt().EZpvd(djBIcL().fJNWhG(), djBIcL().ejfBZ(), djBIcL().AuCTel());
        EZpvd().AYXKKw.setNavigationOnClickListener(new Function0() { // from class: o.aTB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C6671aTj.KWHzl(this.OLrzqt);
            }
        });
        C55198xfS c55198xfS = EZpvd().OLrzqt;
        java.util.List<ResetOption> value = gEmmrt().EZpvd().getValue();
        Intrinsics.copydefault(value);
        java.util.List<ResetOption> list = value;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        int i2 = 0;
        for (java.lang.Object obj : list) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            ResetOption resetOption = (ResetOption) obj;
            ResetOption.AuthApp authApp = ResetOption.AuthApp.INSTANCE;
            if (Intrinsics.EZpvd(resetOption, authApp)) {
                string = getString(C8206ayP.Dialog.ejfBZ);
            } else if (Intrinsics.EZpvd(resetOption, ResetOption.Email.INSTANCE)) {
                string = getString(C8206ayP.Dialog.DPhTBN);
            } else {
                if (!Intrinsics.EZpvd(resetOption, ResetOption.Mobile.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                string = getString(C8206ayP.Dialog.fIwbmz);
            }
            java.lang.String str2 = string;
            Intrinsics.copydefault((java.lang.Object) str2);
            if (Intrinsics.EZpvd(resetOption, authApp)) {
                strUnicodeWrap = getString(C8206ayP.Dialog.fARcdN);
            } else if (Intrinsics.EZpvd(resetOption, ResetOption.Email.INSTANCE)) {
                strUnicodeWrap = djBIcL().AhwBna();
            } else {
                if (!Intrinsics.EZpvd(resetOption, ResetOption.Mobile.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                strUnicodeWrap = androidx.core.text.BidiFormatter.getInstance().unicodeWrap(djBIcL().AkhnZx(), true);
            }
            java.lang.String str3 = strUnicodeWrap;
            Intrinsics.copydefault((java.lang.Object) str3);
            boolean checked = resetOption.getChecked();
            if (Intrinsics.EZpvd(resetOption, authApp)) {
                i = C8206ayP.Activity.EZpvd;
            } else if (Intrinsics.EZpvd(resetOption, ResetOption.Email.INSTANCE)) {
                i = C52761wXj.TaskDescription.GiPPlLgiPPlL;
            } else {
                if (!Intrinsics.EZpvd(resetOption, ResetOption.Mobile.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C52761wXj.TaskDescription.fDu;
            }
            if (Intrinsics.EZpvd(resetOption, authApp)) {
                str = "AuthApp";
            } else if (Intrinsics.EZpvd(resetOption, ResetOption.Email.INSTANCE)) {
                str = "Email";
            } else {
                if (!Intrinsics.EZpvd(resetOption, ResetOption.Mobile.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "Mobile";
            }
            arrayList.add(new C55276xgr(str2, java.lang.Integer.valueOf(i2), str3, checked, false, java.lang.Integer.valueOf(i), str, 16, null));
            i2++;
        }
        c55198xfS.setMultipleOneColumnData(arrayList, new Function1() { // from class: o.aTC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C6671aTj.AEQbTJ(this.AEQbTJ, (java.util.List) obj2);
            }
        });
        C52794wYp c52794wYp = EZpvd().AEQbTJ;
        Intrinsics.copydefault(c52794wYp);
        C6738aUz.EZpvd(c52794wYp);
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
        getParentFragmentManager().setFragmentResultListener("KEY_REQUEST_NOTICE_PAGE", this, new FragmentResultListener() { // from class: o.aTz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str4, android.os.Bundle bundle2) {
                C6671aTj.AEQbTJ(this.OLrzqt, str4, bundle2);
            }
        });
        AYXKKw();
        AhwBna();
        valueOf();
    }

    public static final Unit KWHzl(C6671aTj c6671aTj) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("Reset2FAFirstLanding_Full_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aTp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6671aTj.OLrzqt((EventParamsList) obj);
            }
        });
        FragmentActivity activity = c6671aTj.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "back", false);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C6671aTj c6671aTj, java.util.List list) {
        boolean z;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.List<ResetOption> value = c6671aTj.gEmmrt().EZpvd().getValue();
        if (value == null) {
            return Unit.INSTANCE;
        }
        int i = 0;
        for (java.lang.Object obj : value) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            ResetOption resetOption = (ResetOption) obj;
            if ((list instanceof java.util.Collection) && list.isEmpty()) {
                z = false;
            } else {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    java.lang.Object objOLrzqt = ((C55276xgr) it.next()).OLrzqt();
                    java.lang.Integer num = objOLrzqt instanceof java.lang.Integer ? (java.lang.Integer) objOLrzqt : null;
                    if (num != null && num.intValue() == i) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            resetOption.setChecked(z);
            i++;
        }
        c6671aTj.gEmmrt().copydefault(value);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.aTj$Activity */
    public static final class Activity implements Function1<EventParamsList, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            copydefault(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void copydefault(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("reset_type", C6671aTj.this.gEmmrt().AhwBna(), true);
        }
    }

    /* JADX INFO: renamed from: o.aTj$ActionBar */
    public static final class ActionBar implements Function1<EventParamsList, Unit> {
        public static final ActionBar EZpvd = new ActionBar();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            OLrzqt(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, Web3SecurityTrackEvent.VALUE_CONFIRM, false);
        }
    }

    public static final void AEQbTJ(C6671aTj c6671aTj, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c6671aTj.gEmmrt().AEQbTJ();
    }

    public final void AYXKKw() {
        gEmmrt().EZpvd().observe(getViewLifecycleOwner(), new Dialog(new Function1() { // from class: o.aTx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6671aTj.KWHzl(this.copydefault, (java.util.List) obj);
            }
        }));
    }

    public static final Unit KWHzl(C6671aTj c6671aTj, java.util.List list) {
        boolean z;
        C52794wYp c52794wYp = c6671aTj.EZpvd().AEQbTJ;
        Intrinsics.copydefault(list);
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            z = false;
        } else {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((ResetOption) it.next()).getChecked()) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        c52794wYp.setEnabled(z);
        return Unit.INSTANCE;
    }

    public final void AhwBna() {
        gEmmrt().AYXKKw().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.aTE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6671aTj.OLrzqt(this.KWHzl, (kotlin.Pair) obj);
            }
        }));
        gEmmrt().gEmmrt().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.aTr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6671aTj.OLrzqt(this.copydefault, (java.lang.String) obj);
            }
        }));
        gEmmrt().valueOf().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.aTo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6671aTj.EZpvd(this.copydefault, (java.lang.String) obj);
            }
        }));
        gEmmrt().djBIcL().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.aTq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6671aTj.OLrzqt(this.AEQbTJ, (Unit) obj);
            }
        }));
    }

    public static final Unit OLrzqt(C6671aTj c6671aTj, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        c6671aTj.djBIcL().copydefault((ResetMfaInitiateResponse) pair.getSecond());
        c6671aTj.djBIcL().copydefault((java.lang.String) pair.getFirst());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final C6671aTj c6671aTj, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.content.Context contextRequireContext = c6671aTj.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C8206ayP.Dialog.AhwBna));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C8206ayP.Dialog.djBIcL));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C8206ayP.Dialog.AYXKKw), new View.OnClickListener() { // from class: o.aTs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C6671aTj.AEQbTJ(this.KWHzl, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
        C32868mlh c32868mlh = C32868mlh.OLrzqt;
        TrackChannel[] trackChannelArrCopydefault = c32868mlh.copydefault();
        C32866mlf.onEvent$default("Reset2FADoNotSupport_Full_Page_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
        TrackChannel[] trackChannelArrCopydefault2 = c32868mlh.copydefault();
        C32866mlf.onEvent$default("AccountReset2fa_Reminder_Popup_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C6671aTj c6671aTj, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        FragmentActivity fragmentActivityRequireActivity = c6671aTj.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, fragmentActivityRequireActivity, C33070mpX.AYXKKw(C8206ayP.Dialog.AkhnZx), null, new Function1() { // from class: o.aTu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6671aTj.AEQbTJ((AbstractC43238rlX) obj);
            }
        }, 4, null);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit AEQbTJ(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(final C6671aTj c6671aTj, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.content.Context contextRequireContext = c6671aTj.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C8206ayP.Dialog.AhwBna));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C8206ayP.Dialog.djBIcL));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C8206ayP.Dialog.AYXKKw), new View.OnClickListener() { // from class: o.aTy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C6671aTj.KWHzl(this.OLrzqt, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
        C32868mlh c32868mlh = C32868mlh.OLrzqt;
        TrackChannel[] trackChannelArrCopydefault = c32868mlh.copydefault();
        C32866mlf.onEvent$default("Reset2FADoNotSupport_Full_Page_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
        TrackChannel[] trackChannelArrCopydefault2 = c32868mlh.copydefault();
        C32866mlf.onEvent$default("AccountReset2fa_ReminderKybContactCS_Popup_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.aTj$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C6671aTj KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C6671aTj c6671aTj) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = c6671aTj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C32868mlh c32868mlh = C32868mlh.OLrzqt;
                TrackChannel[] trackChannelArrCopydefault = c32868mlh.copydefault();
                C32866mlf.EZpvd("AccountReset2fa_StartReset_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), this.KWHzl.new Activity());
                TrackChannel[] trackChannelArrCopydefault2 = c32868mlh.copydefault();
                C32866mlf.EZpvd("Reset2FAFirstLanding_Full_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), ActionBar.EZpvd);
                C6644aTI.Companion.AEQbTJ("KEY_REQUEST_NOTICE_PAGE").show(this.KWHzl.getParentFragmentManager(), this.KWHzl.getTAG());
            }
        }
    }

    public static final void KWHzl(C6671aTj c6671aTj, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        FragmentActivity fragmentActivityRequireActivity = c6671aTj.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, fragmentActivityRequireActivity, C33070mpX.AYXKKw(C8206ayP.Dialog.AkhnZx), null, new Function1() { // from class: o.aTv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6671aTj.OLrzqt((AbstractC43238rlX) obj);
            }
        }, 4, null);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit OLrzqt(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C6671aTj c6671aTj, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        android.content.Context contextRequireContext = c6671aTj.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C8206ayP.Dialog.AhwBna));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C8206ayP.Dialog.fHqPtx));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C8206ayP.Dialog.Swccd), new View.OnClickListener() { // from class: o.aTA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C6671aTj.OLrzqt(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.onEvent$default("Reset2FADoNotSupport_Full_Page_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void valueOf() {
        gEmmrt().copydefault().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.aTt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6671aTj.copydefault(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        gEmmrt().KWHzl().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.aTw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6671aTj.AEQbTJ((java.lang.String) obj);
            }
        }));
    }

    public static final Unit copydefault(C6671aTj c6671aTj, boolean z) {
        if (z) {
            c6671aTj.showLoadingAtOnce();
        } else {
            c6671aTj.releaseLoading();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55326xho.toast$default(str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AYXKKw = null;
    }
}
