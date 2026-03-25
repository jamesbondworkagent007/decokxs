package o;

import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import com.okinc.business.market.data.model.common.ProtocolInfoData;
import com.okinc.business.market.features.meme.protocol_filter.ui.MemeProtocolFilterBottomSheetParams;
import com.okinc.business.market.features.meme.protocol_filter.ui.MemeProtocolFilterViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.C52761wXj;
import o.InterfaceC28823khz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.khn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28811khn extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public boolean EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public C23473hyr OLrzqt;

    public C28811khn() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.meme.protocol_filter.ui.MemeProtocolFilterBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.meme.protocol_filter.ui.MemeProtocolFilterBottomSheet$special$$inlined$viewModels$default$2
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
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MemeProtocolFilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.meme.protocol_filter.ui.MemeProtocolFilterBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.meme.protocol_filter.ui.MemeProtocolFilterBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.meme.protocol_filter.ui.MemeProtocolFilterBottomSheet$special$$inlined$viewModels$default$5
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
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.khl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28811khn.gEmmrt(this.copydefault);
            }
        });
    }

    public final C23473hyr copydefault() {
        C23473hyr c23473hyr = this.OLrzqt;
        Intrinsics.copydefault(c23473hyr);
        return c23473hyr;
    }

    public final MemeProtocolFilterBottomSheetParams AEQbTJ() {
        MemeProtocolFilterBottomSheetParams memeProtocolFilterBottomSheetParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (memeProtocolFilterBottomSheetParams = (MemeProtocolFilterBottomSheetParams) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "key.params.protocol_filter", MemeProtocolFilterBottomSheetParams.class))) == null) ? new MemeProtocolFilterBottomSheetParams(null, 0, 3, null) : memeProtocolFilterBottomSheetParams;
    }

    public final MemeProtocolFilterViewModel OLrzqt() {
        return (MemeProtocolFilterViewModel) this.AEQbTJ.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kMM AYXKKw() {
        return (kMM) this.KWHzl.getValue();
    }

    public static final kMM gEmmrt(final C28811khn c28811khn) {
        C28821khx c28821khx = new C28821khx(new Function1() { // from class: o.khu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C28811khn.AEQbTJ(this.OLrzqt, (java.lang.String) obj));
            }
        }, 0, 2, null);
        kMM kmm = new kMM();
        kmm.register(InterfaceC28823khz.ActionBar.class, c28821khx);
        kmm.register(InterfaceC28823khz.StateListAnimator.class, new C28820khw());
        return kmm;
    }

    public static final boolean AEQbTJ(C28811khn c28811khn, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return c28811khn.OLrzqt().AEQbTJ(str);
    }

    /* JADX INFO: renamed from: o.khn$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.khn.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C28811khn KWHzl(@NotNull MemeProtocolFilterBottomSheetParams memeProtocolFilterBottomSheetParams) {
            Intrinsics.checkNotNullParameter(memeProtocolFilterBottomSheetParams, "");
            C28811khn c28811khn = new C28811khn();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.params.protocol_filter", memeProtocolFilterBottomSheetParams);
            c28811khn.setArguments(bundle);
            return c28811khn;
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        MemeProtocolFilterViewModel memeProtocolFilterViewModelOLrzqt = OLrzqt();
        java.util.List<ProtocolInfoData> listCopydefault = AEQbTJ().EZpvd().copydefault();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        for (ProtocolInfoData protocolInfoData : listCopydefault) {
            arrayList.add(new InterfaceC28823khz.ActionBar(protocolInfoData.getProtocolId(), protocolInfoData.getProtocolName(), protocolInfoData.getProtocolLogo(), AEQbTJ().EZpvd().OLrzqt().contains(protocolInfoData.getProtocolId())));
        }
        memeProtocolFilterViewModelOLrzqt.AEQbTJ(arrayList);
        djBIcL();
        KWHzl();
    }

    /* JADX INFO: renamed from: o.khn$StateListAnimator */
    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<InterfaceC28823khz.ActionBar> list, Continuation<? super Unit> continuation) {
            boolean z;
            boolean z2;
            java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list);
            if (list.size() % 2 == 1) {
                listFJNWhG.add(InterfaceC28823khz.StateListAnimator.KWHzl);
            }
            kMM.setData$default(C28811khn.this.AYXKKw(), listFJNWhG, null, 2, null);
            C52794wYp c52794wYpCopydefault = C28811khn.this.copydefault().OLrzqt.copydefault();
            int i = 0;
            if (c52794wYpCopydefault != null) {
                if (list.isEmpty()) {
                    z2 = false;
                    c52794wYpCopydefault.setEnabled(z2);
                } else {
                    java.util.Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((InterfaceC28823khz.ActionBar) it.next()).EZpvd()) {
                            z2 = true;
                            break;
                        }
                    }
                    z2 = false;
                    c52794wYpCopydefault.setEnabled(z2);
                }
            }
            C28811khn c28811khn = C28811khn.this;
            if (list.isEmpty()) {
                z = true;
            } else {
                java.util.Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (!((InterfaceC28823khz.ActionBar) it2.next()).EZpvd()) {
                        z = false;
                        break;
                    }
                }
                z = true;
            }
            c28811khn.EZpvd = z;
            android.widget.TextView textView = C28811khn.this.copydefault().EZpvd;
            if (!list.isEmpty()) {
                java.util.Iterator<T> it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (!(!((InterfaceC28823khz.ActionBar) it3.next()).EZpvd())) {
                        i = 4;
                        break;
                    }
                }
            }
            textView.setVisibility(i);
            C28811khn.this.EZpvd();
            return Unit.INSTANCE;
        }
    }

    public final void KWHzl() {
        C25390ivn.collectOnViewLifecycle$default(this, OLrzqt().OLrzqt(), null, new StateListAnimator(), 2, null);
    }

    public final void djBIcL() {
        C23473hyr c23473hyrCopydefault = copydefault();
        c23473hyrCopydefault.djBIcL.setLayoutManager(new GridLayoutManager(getContext(), 2));
        c23473hyrCopydefault.djBIcL.addItemDecoration(new C31707mAy(C55298xhM.dp2px$default(0.0f, null, 1, null), C55298xhM.dp2px$default(12.0f, null, 1, null)));
        c23473hyrCopydefault.djBIcL.setItemAnimator(null);
        c23473hyrCopydefault.djBIcL.setAdapter(AYXKKw());
        wYF wyf = c23473hyrCopydefault.OLrzqt;
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOnClickListener(new ActionBar(c52794wYpAEQbTJ, 1000L, this));
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOKDSType(260);
        }
        C52794wYp c52794wYpAEQbTJ3 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ3 != null) {
            c52794wYpAEQbTJ3.setVisibility(0);
        }
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new TaskDescription(c52794wYpCopydefault, 1000L, this));
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setContentDescription("web3_dex_market_pump_protocol_selection_apply_btn");
        }
        C52794wYp c52794wYpCopydefault3 = wyf.copydefault();
        if (c52794wYpCopydefault3 != null) {
            c52794wYpCopydefault3.setVisibility(0);
        }
        c23473hyrCopydefault.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.khs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C28811khn.EZpvd(this.copydefault, view);
            }
        });
    }

    public static final void EZpvd(C28811khn c28811khn, android.view.View view) {
        boolean z = !c28811khn.EZpvd;
        c28811khn.EZpvd = z;
        if (z) {
            c28811khn.OLrzqt().AEQbTJ();
        } else {
            c28811khn.OLrzqt().copydefault();
        }
        c28811khn.EZpvd();
    }

    public final void EZpvd() {
        copydefault().AEQbTJ.setImageResource(this.EZpvd ? C52761wXj.TaskDescription.fVjYLc : C52761wXj.TaskDescription.dbwnZN);
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.AYXKKw().setText(wxq.getContext().getString(C23274hvD.Fragment.gZKUVK));
        wxq.setStyle(2);
        wxq.AEQbTJ().setVisibility(0);
    }

    /* JADX INFO: renamed from: o.khn$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C28811khn EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C28811khn c28811khn) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = c28811khn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                ActivityResultCaller parentFragment = this.EZpvd.getParentFragment();
                InterfaceC28815khr interfaceC28815khr = parentFragment instanceof InterfaceC28815khr ? (InterfaceC28815khr) parentFragment : null;
                if (interfaceC28815khr != null) {
                    interfaceC28815khr.EZpvd(this.EZpvd.AEQbTJ().EZpvd().EZpvd(), this.EZpvd.AEQbTJ().copydefault());
                }
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.khn$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C28811khn AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C28811khn c28811khn) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = c28811khn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                ActivityResultCaller parentFragment = this.AEQbTJ.getParentFragment();
                InterfaceC28815khr interfaceC28815khr = parentFragment instanceof InterfaceC28815khr ? (InterfaceC28815khr) parentFragment : null;
                if (interfaceC28815khr != null) {
                    java.util.List<InterfaceC28823khz.ActionBar> value = this.AEQbTJ.OLrzqt().OLrzqt().getValue();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : value) {
                        if (((InterfaceC28823khz.ActionBar) obj).EZpvd()) {
                            arrayList.add(obj);
                        }
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((InterfaceC28823khz.ActionBar) it.next()).OLrzqt());
                    }
                    interfaceC28815khr.EZpvd(arrayList2, this.AEQbTJ.AEQbTJ().copydefault());
                }
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.OLrzqt = C23473hyr.EZpvd(android.view.LayoutInflater.from(requireContext()), constraintLayout, true);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        ActivityResultCaller parentFragment = getParentFragment();
        InterfaceC28815khr interfaceC28815khr = parentFragment instanceof InterfaceC28815khr ? (InterfaceC28815khr) parentFragment : null;
        if (interfaceC28815khr != null) {
            interfaceC28815khr.AhwBna();
        }
    }
}
