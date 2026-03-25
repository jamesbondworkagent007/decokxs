package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.im.imui.messages.audio.call.OKIMAudioCallViewActivity;
import com.okinc.im.imui.messages.audio.call.fragment.CallMembersBottomSheet$observeViewModel$1;
import com.okinc.im.imui.messages.audio.call.fragment.CallMembersViewModel;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35399nuc;
import o.nXV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.onN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37093onN extends AbstractC37097onR implements nXV.Activity {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public nJI AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.nXV.Activity
    public void AEQbTJ(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.nXV.Activity
    public void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return false;
    }

    public C37093onN() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.messages.audio.call.fragment.CallMembersBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.messages.audio.call.fragment.CallMembersBottomSheet$special$$inlined$viewModels$default$2
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
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CallMembersViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.messages.audio.call.fragment.CallMembersBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.messages.audio.call.fragment.CallMembersBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.messages.audio.call.fragment.CallMembersBottomSheet$special$$inlined$viewModels$default$5
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
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.onP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37093onN.copydefault(this.EZpvd);
            }
        });
    }

    /* JADX DEBUG: Possible override for method o.onR.EZpvd()V */
    public final CallMembersViewModel EZpvd() {
        return (CallMembersViewModel) this.EZpvd.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nXV AYXKKw() {
        return (nXV) this.KWHzl.getValue();
    }

    public static final nXV copydefault(C37093onN c37093onN) {
        nXV nxv = new nXV();
        nxv.KWHzl(c37093onN);
        return nxv;
    }

    /* JADX INFO: renamed from: o.onN$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.onN.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C37093onN KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("key_audio_call_group_id", str));
            C37093onN c37093onN = new C37093onN();
            c37093onN.setArguments(bundleBundleOf);
            return c37093onN;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.setCloseVisibility(false);
        wxq.setDividerVisibility(false);
        KWHzl(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        nJI njiEZpvd = nJI.EZpvd(getLayoutInflater(), constraintLayout, true);
        njiEZpvd.AEQbTJ.setLayoutManager(new LinearLayoutManager(requireContext()));
        njiEZpvd.AEQbTJ.setAdapter(AYXKKw());
        OKRegularCell oKRegularCell = njiEZpvd.copydefault;
        Intrinsics.checkNotNullExpressionValue(oKRegularCell, "");
        oKRegularCell.setVisibility(8);
        android.view.View view = njiEZpvd.EZpvd;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(8);
        OKRegularCell oKRegularCell2 = njiEZpvd.copydefault;
        oKRegularCell2.setOnClickListener(new Activity(oKRegularCell2, 1000L, this));
        this.AEQbTJ = njiEZpvd;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        gEmmrt();
    }

    private final void gEmmrt() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CallMembersBottomSheet$observeViewModel$1(this, null), 3, null);
    }

    public final void KWHzl(int i) {
        wXQ wxq;
        C54946xaf binding = getBinding();
        if (binding == null || (wxq = binding.KWHzl) == null) {
            return;
        }
        wxq.setTitle(C33069mpW.copydefault(C35399nuc.LoaderManager.DPHNDa, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(i)))));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.AEQbTJ = null;
        super.onDestroyView();
    }

    /* JADX INFO: renamed from: o.onN$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C37093onN KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C37093onN c37093onN) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = c37093onN;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.dismiss();
                FragmentActivity activity = this.KWHzl.getActivity();
                OKIMAudioCallViewActivity oKIMAudioCallViewActivity = activity instanceof OKIMAudioCallViewActivity ? (OKIMAudioCallViewActivity) activity : null;
                if (oKIMAudioCallViewActivity != null) {
                    oKIMAudioCallViewActivity.AkhnZx();
                }
            }
        }
    }
}
