package o;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.config.page.IMPageType;
import com.okinc.im.config.serviceprovider.GeneralAction;
import com.okinc.im.config.serviceprovider.ObserverSource;
import com.okinc.im.imui.messageV2.view.ChatActivityViewModel;
import com.okinc.im.imui.messageV2.view.keyboard.plugin.PluginsViewModel;
import com.okinc.okimcore.model.im.GroupVoiceCallData;
import com.okinc.okimcore.model.im.GroupVoiceCallUser;
import com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig;
import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC37592owj;
import o.C35399nuc;
import o.C37290oqz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.okd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C36950okd extends AbstractC36953okg implements InterfaceC36485obp {
    public final InterfaceC56387yDm AYXKKw;
    public C33918nKr DbNXlk;
    public final InterfaceC56387yDm isConnected;
    public final InterfaceC56387yDm valueOf;
    public final InterfaceC56387yDm values;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AhwBna = 8;
    public final int gEmmrt = C35399nuc.Dialog.fERRXa;
    public final ActivityResultLauncher<android.content.Intent> djBIcL = C37290oqz.copydefault.KWHzl(this, new Activity());

    /* JADX INFO: renamed from: o.okd$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.gEmmrt;
    }

    public C36950okd() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.messageV2.view.keyboard.plugin.PluginsFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.messageV2.view.keyboard.plugin.PluginsFragment$special$$inlined$viewModels$default$2
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
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PluginsViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.messageV2.view.keyboard.plugin.PluginsFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.messageV2.view.keyboard.plugin.PluginsFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.messageV2.view.keyboard.plugin.PluginsFragment$special$$inlined$viewModels$default$5
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ChatActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.messageV2.view.keyboard.plugin.PluginsFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.messageV2.view.keyboard.plugin.PluginsFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.messageV2.view.keyboard.plugin.PluginsFragment$special$$inlined$activityViewModels$default$3
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
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.oki
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36950okd.KWHzl(this.EZpvd);
            }
        });
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.okk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36950okd.AYXKKw(this.AEQbTJ);
            }
        });
    }

    /* JADX INFO: renamed from: o.okd$Activity */
    public static final class Activity implements C37290oqz.StateListAnimator {
        public Activity() {
        }

        @Override // o.C37290oqz.StateListAnimator
        public void EZpvd(ActivityResult activityResult) {
            Intrinsics.checkNotNullParameter(activityResult, "");
            if (activityResult.getResultCode() == -1) {
                android.content.Intent data = activityResult.getData();
                java.util.ArrayList<java.lang.String> stringArrayListExtra = data != null ? data.getStringArrayListExtra("LIST_FINAL_RESULT") : null;
                pUU.KWHzl("PluginsFragment", "the size of list is " + (stringArrayListExtra != null ? java.lang.Integer.valueOf(stringArrayListExtra.size()) : null));
                androidx.fragment.app.Fragment parentFragment = C36950okd.this.getParentFragment();
                C36609oeG c36609oeG = parentFragment instanceof C36609oeG ? (C36609oeG) parentFragment : null;
                if (c36609oeG != null) {
                    c36609oeG.EZpvd(stringArrayListExtra);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.okd$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.okd.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C36950okd EZpvd(java.lang.String str, @NotNull IMPageType iMPageType) {
            Intrinsics.checkNotNullParameter(iMPageType, "");
            C36950okd c36950okd = new C36950okd();
            android.os.Bundle bundleEnsureArguments = c36950okd.ensureArguments();
            bundleEnsureArguments.putString("ARG_CHANNEL_ID", str);
            bundleEnsureArguments.putSerializable("ARG_PAGE_TYPE", iMPageType);
            return c36950okd;
        }
    }

    public final PluginsViewModel gEmmrt() {
        return (PluginsViewModel) this.values.getValue();
    }

    private final ChatActivityViewModel AhwBna() {
        return (ChatActivityViewModel) this.valueOf.getValue();
    }

    private final java.lang.String valueOf() {
        return (java.lang.String) this.AYXKKw.getValue();
    }

    public static final java.lang.String KWHzl(C36950okd c36950okd) {
        android.os.Bundle arguments = c36950okd.getArguments();
        if (arguments != null) {
            return arguments.getString("ARG_CHANNEL_ID");
        }
        return null;
    }

    private final IMPageType fetchVPNInfo() {
        return (IMPageType) this.isConnected.getValue();
    }

    public static final IMPageType AYXKKw(C36950okd c36950okd) {
        android.os.Bundle arguments = c36950okd.getArguments();
        java.io.Serializable serializable = arguments != null ? arguments.getSerializable("ARG_PAGE_TYPE") : null;
        if (serializable instanceof IMPageType) {
            return (IMPageType) serializable;
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        pUU.KWHzl(getTAG(), "Initializing PluginsFragment with channelId: " + valueOf() + ", pageType:" + fetchVPNInfo());
        AkhnZx();
        gEmmrt().copydefault(valueOf(), fetchVPNInfo());
    }

    private final void AkhnZx() {
        gEmmrt().AEQbTJ().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.okh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36950okd.EZpvd(this.OLrzqt, (java.util.List) obj);
            }
        }));
        gEmmrt().copydefault().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.okm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36950okd.KWHzl(this.OLrzqt, (java.util.List) obj);
            }
        }));
        C35290nsY.AEQbTJ(this, ObserverSource.PluginsFragment, (Function1<? super java.util.ArrayList<GeneralAction>, Unit>) new Function1() { // from class: o.okj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36950okd.OLrzqt(this.AEQbTJ, (java.util.ArrayList) obj);
            }
        });
    }

    public static final Unit EZpvd(C36950okd c36950okd, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C35290nsY.copydefault(c36950okd, (java.util.List<? extends GeneralAction>) list);
        return Unit.INSTANCE;
    }

    public static final java.lang.CharSequence KWHzl(AbstractC35291nsZ abstractC35291nsZ) {
        Intrinsics.checkNotNullParameter(abstractC35291nsZ, "");
        return abstractC35291nsZ.KWHzl();
    }

    public static final Unit KWHzl(C36950okd c36950okd, java.util.List list) {
        Intrinsics.copydefault(list);
        java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, new Function1() { // from class: o.okr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36950okd.KWHzl((AbstractC35291nsZ) obj);
            }
        }, 30, null);
        pUU.KWHzl(c36950okd.getTAG(), "visible plugins: count => " + list.size() + ", names => " + strJoinToString$default);
        c36950okd.EZpvd((java.util.List<? extends InterfaceC35288nsW>) list);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c36950okd, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C36950okd c36950okd, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.util.List<AbstractC35291nsZ> value = c36950okd.gEmmrt().copydefault().getValue();
        if (value != null) {
            java.util.Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                ((AbstractC35291nsZ) it.next()).EZpvd(c36950okd, arrayList);
            }
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.util.List<? extends InterfaceC35288nsW> list) {
        C36484obo c36484obo;
        pUU.KWHzl(getTAG(), "Setting up plugin board with " + list.size() + " plugins");
        C33918nKr c33918nKr = this.DbNXlk;
        if (c33918nKr == null || (c36484obo = c33918nKr.KWHzl) == null) {
            return;
        }
        c36484obo.AEQbTJ(list, this);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C33918nKr c33918nKrOLrzqt = C33918nKr.OLrzqt(layoutInflater, viewGroup, false);
        this.DbNXlk = c33918nKrOLrzqt;
        if (c33918nKrOLrzqt != null) {
            return c33918nKrOLrzqt.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.DbNXlk = null;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, @NotNull java.lang.String[] strArr, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        super.onRequestPermissionsResult(i, strArr, iArr);
        java.util.List<AbstractC35291nsZ> value = gEmmrt().copydefault().getValue();
        if (value != null) {
            for (AbstractC35291nsZ abstractC35291nsZ : value) {
                java.lang.Integer numAEQbTJ = abstractC35291nsZ.AEQbTJ();
                if (numAEQbTJ != null && i == numAEQbTJ.intValue()) {
                    pUU.KWHzl(getTAG(), "Handling permission result for plugin: " + abstractC35291nsZ.KWHzl());
                    abstractC35291nsZ.OLrzqt(this, i, strArr, iArr);
                    return;
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        java.util.List<AbstractC35291nsZ> value = gEmmrt().copydefault().getValue();
        if (value != null) {
            for (AbstractC35291nsZ abstractC35291nsZ : value) {
                java.lang.Integer numAEQbTJ = abstractC35291nsZ.AEQbTJ();
                if (numAEQbTJ != null && i == numAEQbTJ.intValue()) {
                    pUU.KWHzl(getTAG(), "Handling activity result for plugin: " + abstractC35291nsZ.KWHzl());
                    android.content.Context contextRequireContext = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    abstractC35291nsZ.OLrzqt(i, i2, intent, contextRequireContext);
                    return;
                }
            }
        }
    }

    @Override // o.InterfaceC36485obp
    public void KWHzl(@NotNull InterfaceC35288nsW interfaceC35288nsW) {
        Intrinsics.checkNotNullParameter(interfaceC35288nsW, "");
        pUU.KWHzl(getTAG(), "Plugin clicked: " + interfaceC35288nsW.KWHzl());
        interfaceC35288nsW.copydefault(this);
    }

    public final void OLrzqt() {
        if (AYXKKw()) {
            C36574odY c36574odY = C36574odY.OLrzqt;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            c36574odY.EZpvd(contextRequireContext, new Function0() { // from class: o.okl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C36950okd.AEQbTJ(this.copydefault);
                }
            });
            return;
        }
        djBIcL();
    }

    public static final Unit AEQbTJ(C36950okd c36950okd) {
        GroupVoiceCallConfig groupVoiceCallConfig;
        GroupVoiceCallData currentCall;
        java.util.List<GroupVoiceCallUser> activeUsers;
        GroupVoiceCallConfig groupVoiceCallConfig2;
        GroupVoiceCallData currentCall2;
        java.lang.Integer maxParticipants;
        GroupInfo value = c36950okd.AhwBna().fetchVPNInfo().getValue();
        if (value == null || (groupVoiceCallConfig = value.getGroupVoiceCallConfig()) == null || (currentCall = groupVoiceCallConfig.getCurrentCall()) == null || (activeUsers = currentCall.getActiveUsers()) == null) {
            return Unit.INSTANCE;
        }
        int size = activeUsers.size();
        GroupInfo value2 = c36950okd.AhwBna().fetchVPNInfo().getValue();
        if (value2 == null || (groupVoiceCallConfig2 = value2.getGroupVoiceCallConfig()) == null || (currentCall2 = groupVoiceCallConfig2.getCurrentCall()) == null || (maxParticipants = currentCall2.getMaxParticipants()) == null) {
            return Unit.INSTANCE;
        }
        int iIntValue = maxParticipants.intValue();
        if (size < iIntValue) {
            pUU.EZpvd(c36950okd.getTAG(), "joinCall: proceeding to requestStartVoiceCall");
            androidx.fragment.app.Fragment parentFragment = c36950okd.getParentFragment();
            C36609oeG c36609oeG = parentFragment instanceof C36609oeG ? (C36609oeG) parentFragment : null;
            if (c36609oeG != null) {
                C36609oeG.requestStartVoiceCall$default(c36609oeG, null, 1, null);
            }
        } else {
            pUU.EZpvd(c36950okd.getTAG(), "joinCall: call at max capacity (" + size + "/" + iIntValue + ")");
            androidx.fragment.app.Fragment parentFragment2 = c36950okd.getParentFragment();
            C36609oeG c36609oeG2 = parentFragment2 instanceof C36609oeG ? (C36609oeG) parentFragment2 : null;
            if (c36609oeG2 != null) {
                c36609oeG2.copydefault(C35399nuc.LoaderManager.DPHsZd);
            }
        }
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        ActivityC37592owj.Activity activity = ActivityC37592owj.Companion;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        this.djBIcL.launch(activity.OLrzqt(contextRequireContext, yDY.AhwBna(), valueOf()));
    }

    public final boolean AYXKKw() {
        GroupVoiceCallConfig groupVoiceCallConfig;
        GroupInfo value = AhwBna().fetchVPNInfo().getValue();
        return ((value == null || (groupVoiceCallConfig = value.getGroupVoiceCallConfig()) == null) ? null : groupVoiceCallConfig.getCurrentCall()) != null;
    }
}
