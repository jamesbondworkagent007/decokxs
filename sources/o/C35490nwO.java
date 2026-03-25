package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.account.api.service.UserInfoService;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.imui.chatsettings.ChatSettingsFragment$observeData$1$1;
import com.okinc.im.imui.chatsettings.ChatSettingsFragment$observeData$1$2;
import com.okinc.im.imui.chatsettings.ChatSettingsFragment$observeData$1$3;
import com.okinc.im.imui.chatsettings.ChatSettingsFragment$observeData$1$4;
import com.okinc.im.imui.chatsettings.ChatSettingsFragment$observeData$1$5;
import com.okinc.im.imui.chatsettings.model.ChatSettingsResult;
import com.okinc.im.imui.chatsettings.viewmodel.ChatSettingsViewModel;
import com.okinc.im.imui.privacy.SecurityType;
import com.okinc.im.imui.privacy.SettingType;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.flow.StateFlow;
import o.ActivityC35481nwF;
import o.ActivityC35539nxK;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nwO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C35490nwO extends AbstractC35499nwX {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public C35498nwW EZpvd;
    public C33894nJu copydefault;

    /* JADX INFO: renamed from: o.nwO$Application */
    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SecurityType.values().length];
            try {
                iArr[SecurityType.IM_GROUP_SEARCH_ADD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SecurityType.IM_CONTACT_DISCOVERY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SecurityType.IM_RECEIVE_INAPP_NOTIFICATION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[SettingType.values().length];
            try {
                iArr2[SettingType.BLOCK_LIST.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[SettingType.AUTO_DOWNLOAD_MEDIA.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            KWHzl = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35399nuc.Dialog.RlQdEF;
    }

    public C35490nwO() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.chatsettings.ChatSettingsFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.chatsettings.ChatSettingsFragment$special$$inlined$viewModels$default$2
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
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ChatSettingsViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.chatsettings.ChatSettingsFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.chatsettings.ChatSettingsFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.chatsettings.ChatSettingsFragment$special$$inlined$viewModels$default$5
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

    public final ChatSettingsViewModel OLrzqt() {
        return (ChatSettingsViewModel) this.AEQbTJ.getValue();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C33894nJu c33894nJuAEQbTJ = C33894nJu.AEQbTJ(layoutInflater, viewGroup, false);
        this.copydefault = c33894nJuAEQbTJ;
        if (c33894nJuAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            c33894nJuAEQbTJ = null;
        }
        NestedScrollView root = c33894nJuAEQbTJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        KWHzl();
        OLrzqt().AhwBna();
        AYXKKw();
    }

    public final void KWHzl() {
        C33894nJu c33894nJu = this.copydefault;
        if (c33894nJu == null) {
            Intrinsics.gEmmrt("");
            c33894nJu = null;
        }
        this.EZpvd = new C35498nwW(OLrzqt().copydefault(), new Function2() { // from class: o.nwR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C35490nwO.AEQbTJ(this.OLrzqt, (SecurityType) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        }, new Function1() { // from class: o.nwS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C35490nwO.KWHzl(this.KWHzl, (SettingType) obj);
            }
        });
        RecyclerView recyclerView = c33894nJu.AEQbTJ;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setNestedScrollingEnabled(false);
        C35498nwW c35498nwW = this.EZpvd;
        if (c35498nwW == null) {
            Intrinsics.gEmmrt("");
            c35498nwW = null;
        }
        recyclerView.setAdapter(c35498nwW);
        C52794wYp c52794wYp = c33894nJu.AYXKKw;
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(c52794wYp.getContext(), C52761wXj.TaskDescription.reset);
        if (drawable != null) {
            drawable.setBounds(0, 0, C55298xhM.dp2px$default(12.0f, null, 1, null), C55298xhM.dp2px$default(12.0f, null, 1, null));
        }
        c52794wYp.setCompoundDrawablesRelative(drawable, null, null, null);
        c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.nwQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35490nwO.KWHzl(this.EZpvd, view);
            }
        });
        c33894nJu.AhwBna.setRetryClickListener(new View.OnClickListener() { // from class: o.nwP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35490nwO.OLrzqt(this.KWHzl, view);
            }
        });
    }

    public static final Unit AEQbTJ(C35490nwO c35490nwO, SecurityType securityType, final boolean z) {
        Intrinsics.checkNotNullParameter(securityType, "");
        int i = Application.AEQbTJ[securityType.ordinal()];
        if (i == 1) {
            c35490nwO.OLrzqt().EZpvd(3, !z);
        } else if (i == 2) {
            c35490nwO.OLrzqt().EZpvd(1, !z);
        } else if (i == 3) {
            C32866mlf.onEvent$default("IM_ChatSetting_InAppNotification_Click", (TrackChannel[]) null, new Function1() { // from class: o.nwT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C35490nwO.AEQbTJ(z, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            c35490nwO.OLrzqt().EZpvd(4, !z);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "switch_status", !z ? DebugKt.DEBUG_PROPERTY_VALUE_ON : DebugKt.DEBUG_PROPERTY_VALUE_OFF, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C35490nwO c35490nwO, SettingType settingType) {
        Intrinsics.checkNotNullParameter(settingType, "");
        int i = Application.KWHzl[settingType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (c35490nwO.getContext() == null) {
                    pUU.KWHzl(c35490nwO.getTAG(), "SettingType.AUTO_DOWNLOAD_MEDIA item click context null");
                    return Unit.INSTANCE;
                }
                ActivityC35481nwF.TaskDescription taskDescription = ActivityC35481nwF.Companion;
                android.content.Context contextRequireContext = c35490nwO.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                c35490nwO.startActivity(taskDescription.AEQbTJ(contextRequireContext));
            }
        } else {
            if (c35490nwO.getContext() == null) {
                pUU.KWHzl(c35490nwO.getTAG(), "SettingType.BLOCK_LIST item click context null");
                return Unit.INSTANCE;
            }
            ActivityC35539nxK.StateListAnimator stateListAnimator = ActivityC35539nxK.Companion;
            android.content.Context contextRequireContext2 = c35490nwO.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            c35490nwO.startActivity(stateListAnimator.KWHzl(contextRequireContext2));
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C35490nwO c35490nwO, android.view.View view) {
        UserInfoService userInfoService = (UserInfoService) C43248rlh.KWHzl.AEQbTJ(UserInfoService.class);
        FragmentActivity fragmentActivityRequireActivity = c35490nwO.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        UserInfoService.Application.startEditProfileFlow$default(userInfoService, fragmentActivityRequireActivity, null, c35490nwO.new StateListAnimator(), null, null, null, null, 122, null);
    }

    /* JADX INFO: renamed from: o.nwO$StateListAnimator */
    public static final class StateListAnimator implements UserInfoService.ActionBar {
        public StateListAnimator() {
        }
    }

    public static final void OLrzqt(C35490nwO c35490nwO, android.view.View view) {
        c35490nwO.OLrzqt().AEQbTJ(false);
    }

    private final void AYXKKw() {
        ChatSettingsViewModel chatSettingsViewModelOLrzqt = OLrzqt();
        StateFlow<ChatSettingsViewModel.Application> stateFlowAYXKKw = chatSettingsViewModelOLrzqt.AYXKKw();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C37721ozF.collectOnLifecycle$default(stateFlowAYXKKw, viewLifecycleOwner, (Lifecycle.State) null, new ChatSettingsFragment$observeData$1$1(this, chatSettingsViewModelOLrzqt, null), 2, (java.lang.Object) null);
        StateFlow<ChatSettingsResult> stateFlowKWHzl = chatSettingsViewModelOLrzqt.KWHzl();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        C37721ozF.collectOnLifecycle$default(stateFlowKWHzl, viewLifecycleOwner2, (Lifecycle.State) null, new ChatSettingsFragment$observeData$1$2(this, null), 2, (java.lang.Object) null);
        StateFlow<C32989mnw<ChatSettingsResult>> stateFlowValueOf = chatSettingsViewModelOLrzqt.valueOf();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        C37721ozF.collectOnLifecycle$default(stateFlowValueOf, viewLifecycleOwner3, (Lifecycle.State) null, new ChatSettingsFragment$observeData$1$3(chatSettingsViewModelOLrzqt, this, null), 2, (java.lang.Object) null);
        StateFlow<C35501nwZ> stateFlowOLrzqt = chatSettingsViewModelOLrzqt.OLrzqt();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        C37721ozF.collectOnLifecycle$default(stateFlowOLrzqt, viewLifecycleOwner4, (Lifecycle.State) null, new ChatSettingsFragment$observeData$1$4(this, chatSettingsViewModelOLrzqt, null), 2, (java.lang.Object) null);
        StateFlow<C32989mnw<Unit>> stateFlowGEmmrt = chatSettingsViewModelOLrzqt.gEmmrt();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        C37721ozF.collectOnLifecycle$default(stateFlowGEmmrt, viewLifecycleOwner5, (Lifecycle.State) null, new ChatSettingsFragment$observeData$1$5(chatSettingsViewModelOLrzqt, null), 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.nwO$Activity */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nwO.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
