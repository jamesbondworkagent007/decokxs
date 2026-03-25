package o;

import android.view.View;
import androidx.core.view.ViewKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.SendCrossDeviceVerificationRequestActivity;
import com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.SendCrossDeviceVerificationRequestViewModel;
import com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.devicelist.DeviceListViewModel;
import com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.devicelist.DevicesListFragment$initView$4;
import com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.devicelist.DevicesListFragment$initView$5;
import com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.devicelist.DevicesListFragment$initView$6;
import com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.devicelist.DevicesListFragment$initView$7;
import com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.devicelist.DevicesListFragment$initView$8;
import com.okinc.auth.impl.passkey.model.AuthenticationStartResponse;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aEu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5887aEu extends AbstractC5892aEz {
    public C8281azl EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C8206ayP.Application.values;
    }

    public C5887aEu() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.devicelist.DevicesListFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.devicelist.DevicesListFragment$special$$inlined$viewModels$default$2
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
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(DeviceListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.devicelist.DevicesListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.devicelist.DevicesListFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.devicelist.DevicesListFragment$special$$inlined$viewModels$default$5
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
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SendCrossDeviceVerificationRequestViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.devicelist.DevicesListFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.devicelist.DevicesListFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.devicelist.DevicesListFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX DEBUG: Possible override for method o.aEz.KWHzl()V */
    public final DeviceListViewModel KWHzl() {
        return (DeviceListViewModel) this.OLrzqt.getValue();
    }

    public final SendCrossDeviceVerificationRequestViewModel AEQbTJ() {
        return (SendCrossDeviceVerificationRequestViewModel) this.copydefault.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        wYC wyc;
        AuthenticationStartResponse authenticationStartResponseOLrzqt;
        Intrinsics.checkNotNullParameter(view, "");
        this.EZpvd = C8281azl.OLrzqt(view);
        SendCrossDeviceVerificationRequestActivity.Input inputOLrzqt = AEQbTJ().OLrzqt();
        java.util.List<AuthenticationStartResponse.AdditionalData> additionalData = (inputOLrzqt == null || (authenticationStartResponseOLrzqt = inputOLrzqt.OLrzqt()) == null) ? null : authenticationStartResponseOLrzqt.getAdditionalData();
        if (additionalData == null) {
            additionalData = yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : additionalData) {
            if (Intrinsics.EZpvd(((AuthenticationStartResponse.AdditionalData) obj).getCurrentDevice(), java.lang.Boolean.FALSE)) {
                arrayList.add(obj);
            }
        }
        java.util.List<AuthenticationStartResponse.AdditionalData> listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList, new StateListAnimator());
        SendCrossDeviceVerificationRequestActivity.Input inputOLrzqt2 = AEQbTJ().OLrzqt();
        java.lang.String strEZpvd = inputOLrzqt2 != null ? inputOLrzqt2.EZpvd() : null;
        java.lang.String str = strEZpvd == null ? "" : strEZpvd;
        AuthenticationStartResponse.AdditionalData additionalData2 = (AuthenticationStartResponse.AdditionalData) CollectionsKt___CollectionsKt.firstOrNull(listEZpvd);
        C8281azl c8281azl = this.EZpvd;
        if (c8281azl != null) {
            AEQbTJ(c8281azl, listEZpvd);
        }
        C8281azl c8281azl2 = this.EZpvd;
        if (c8281azl2 != null && (wyc = c8281azl2.OLrzqt) != null) {
            wyc.setOnClickListener(new Activity(wyc, 1000L, this));
        }
        C8281azl c8281azl3 = this.EZpvd;
        if (c8281azl3 != null && (c52794wYp2 = c8281azl3.EZpvd) != null) {
            c52794wYp2.setOnClickListener(new TaskDescription(c52794wYp2, 1000L, this, str));
        }
        C8281azl c8281azl4 = this.EZpvd;
        if (c8281azl4 != null && (c52794wYp = c8281azl4.KWHzl) != null) {
            c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
        }
        C6690aUB.KWHzl(KWHzl().KWHzl(), this, new DevicesListFragment$initView$4(null));
        C6690aUB.KWHzl(KWHzl().copydefault(), this, new DevicesListFragment$initView$5(this, null));
        C6690aUB.KWHzl(KWHzl().AEQbTJ(), this, new DevicesListFragment$initView$6(this, null));
        C6690aUB.KWHzl(KWHzl().OLrzqt(), this, new DevicesListFragment$initView$7(this, null));
        C6690aUB.observeState$default(KWHzl().gEmmrt(), this, (Lifecycle.State) null, new DevicesListFragment$initView$8(this, null), 2, (java.lang.Object) null);
        if (additionalData2 != null) {
            KWHzl().KWHzl(additionalData2);
        }
    }

    public final void OLrzqt() {
        AEQbTJ().AkhnZx();
    }

    public final void AEQbTJ(C8281azl c8281azl, java.util.List<AuthenticationStartResponse.AdditionalData> list) {
        c8281azl.copydefault.removeAllViews();
        int i = 0;
        for (AuthenticationStartResponse.AdditionalData additionalData : list) {
            C8274aze c8274azeAEQbTJ = C8274aze.AEQbTJ(android.view.LayoutInflater.from(requireContext()), c8281azl.copydefault, false);
            Intrinsics.checkNotNullExpressionValue(c8274azeAEQbTJ, "");
            android.widget.TextView textView = c8274azeAEQbTJ.KWHzl;
            java.lang.String deviceName = additionalData.getDeviceName();
            textView.setText(deviceName != null ? deviceName : "");
            c8274azeAEQbTJ.OLrzqt.setText(C33069mpW.copydefault(this, C8206ayP.Dialog.DGUQLIhJrIAr, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("date", KWHzl().AEQbTJ(additionalData.getLastUsedTimestamp())))));
            c8274azeAEQbTJ.getRoot().setTag(additionalData.getCredentialId());
            android.widget.LinearLayout root = c8274azeAEQbTJ.getRoot();
            root.setOnClickListener(new Dialog(root, 1000L, this, additionalData, c8281azl, c8274azeAEQbTJ));
            if (i == 0) {
                c8274azeAEQbTJ.getRoot().setSelected(true);
            }
            c8281azl.copydefault.addView(c8274azeAEQbTJ.getRoot());
            i++;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.EZpvd = null;
    }

    /* JADX INFO: renamed from: o.aEu$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aEu.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C5887aEu AEQbTJ() {
            return new C5887aEu();
        }
    }

    /* JADX INFO: renamed from: o.aEu$StateListAnimator */
    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((AuthenticationStartResponse.AdditionalData) t2).getLastUsedTimestamp(), ((AuthenticationStartResponse.AdditionalData) t).getLastUsedTimestamp());
        }
    }

    /* JADX INFO: renamed from: o.aEu$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C5887aEu OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C5887aEu c5887aEu) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = c5887aEu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.AEQbTJ().DbNXlk();
            }
        }
    }

    /* JADX INFO: renamed from: o.aEu$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C5887aEu OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C5887aEu c5887aEu) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = c5887aEu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.OLrzqt();
            }
        }
    }

    /* JADX INFO: renamed from: o.aEu$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C5887aEu AhwBna;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ AuthenticationStartResponse.AdditionalData KWHzl;
        public final /* synthetic */ C8274aze OLrzqt;
        public final /* synthetic */ C8281azl copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C5887aEu c5887aEu, AuthenticationStartResponse.AdditionalData additionalData, C8281azl c8281azl, C8274aze c8274aze) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.AhwBna = c5887aEu;
            this.KWHzl = additionalData;
            this.copydefault = c8281azl;
            this.OLrzqt = c8274aze;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AhwBna.KWHzl().OLrzqt(this.KWHzl);
                android.widget.LinearLayout linearLayout = this.copydefault.copydefault;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                java.util.Iterator<android.view.View> it = ViewKt.getAllViews(linearLayout).iterator();
                while (it.hasNext()) {
                    it.next().setSelected(false);
                }
                this.OLrzqt.getRoot().setSelected(true);
            }
        }
    }

    /* JADX INFO: renamed from: o.aEu$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C5887aEu AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C5887aEu c5887aEu, java.lang.String str) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c5887aEu;
            this.copydefault = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.KWHzl().OLrzqt(this.copydefault);
            }
        }
    }
}
