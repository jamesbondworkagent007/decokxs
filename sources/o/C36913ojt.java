package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.autofill.HintConstants;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.config.page.IMPageType;
import com.okinc.im.config.serviceprovider.GeneralAction;
import com.okinc.im.config.serviceprovider.ObserverSource;
import com.okinc.im.imui.messageV2.model.StringResource;
import com.okinc.im.imui.messageV2.view.ChatActivityViewModel;
import com.okinc.im.imui.messageV2.view.keyboard.KeyboardFragment$maybeDisplayLastImage$1;
import com.okinc.im.imui.messageV2.view.keyboard.KeyboardFragment$setupObservers$12;
import com.okinc.im.imui.messageV2.view.keyboard.KeyboardFragment$setupObservers$13;
import com.okinc.im.imui.messageV2.view.keyboard.KeyboardFragment$setupObservers$14;
import com.okinc.im.imui.messageV2.view.keyboard.KeyboardFragment$setupObservers$15;
import com.okinc.im.imui.messageV2.view.keyboard.KeyboardFragment$showKeyboardForMessage$1;
import com.okinc.im.imui.messageV2.view.keyboard.KeyboardViewModel;
import com.okinc.im.usecase.ObserveKeyboardInputStateUseCase;
import com.okinc.im.widgets.inputpanel.InputMode;
import com.okinc.okimcore.feature.config.TypingIndicatorConfig;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.inhouseim.DraftMentionedStringRangeInfoModel;
import com.okinc.okimcore.model.room.inhouseim.DraftMessageModel;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import com.okinc.okimcore.usecase.ObserveShowAgentProcessingFlow;
import com.okinc.rxutils.RxBus;
import com.okinc.uilab.edit.OKEditText;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import o.C35399nuc;
import o.InterfaceC35179nqT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ojt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C36913ojt extends AbstractC36911ojr implements InterfaceC36409oaS {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int gEmmrt = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public android.app.Dialog AkhnZx;
    public InterfaceC58217yxC AuCTel;
    public final InterfaceC56387yDm DbNXlk;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm ejfBZ;
    public final int fARcdN;
    public InterfaceC58217yxC fIwbmz;
    public C36403oaM fJNWhG;
    public final InterfaceC56387yDm fetchVPNInfo;
    public nJW getNewProxyInstance;
    public final InterfaceC56387yDm hDKMBd;
    public final InterfaceC56387yDm isConnected;
    public final ActivityResultLauncher<android.content.Intent> valueOf;
    public final InterfaceC56387yDm values;

    /* JADX INFO: renamed from: o.ojt$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKConversationType.values().length];
            try {
                iArr[OKConversationType.GROUP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            copydefault = iArr;
        }
    }

    public static final void KWHzl(GroupInfo groupInfo) {
    }

    public static final void KWHzl(RelationInfo relationInfo) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.fARcdN;
    }

    public C36913ojt() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.messageV2.view.keyboard.KeyboardFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.messageV2.view.keyboard.KeyboardFragment$special$$inlined$viewModels$default$2
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
        this.hDKMBd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(KeyboardViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.messageV2.view.keyboard.KeyboardFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.messageV2.view.keyboard.KeyboardFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.messageV2.view.keyboard.KeyboardFragment$special$$inlined$viewModels$default$5
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ChatActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.messageV2.view.keyboard.KeyboardFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.messageV2.view.keyboard.KeyboardFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.messageV2.view.keyboard.KeyboardFragment$special$$inlined$activityViewModels$default$3
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
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.ojs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36913ojt.hDKMBd(this.EZpvd);
            }
        });
        this.ejfBZ = C56392yDr.copydefault(new Function0() { // from class: o.ojq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36913ojt.zuBGHE(this.copydefault);
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.ojE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36913ojt.uzCIH(this.OLrzqt);
            }
        });
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.ojO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36913ojt.getFieldNames(this.AEQbTJ);
            }
        });
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.ojV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C36913ojt.wlaJM(this.EZpvd));
            }
        });
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.ojW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C36913ojt.AuCTelauCTel(this.EZpvd));
            }
        });
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.ojT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C36913ojt.AwvSrB(this.EZpvd));
            }
        });
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.ojU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C36913ojt.AEQbTJ(this.EZpvd, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.valueOf = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: renamed from: o.ojt$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ojt.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final java.lang.String EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return str + "_LISTENER_KEY_INPUT_MODE";
        }

        public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return str + "_LISTENER_KEY_TEXT_CHANGED";
        }

        public final C36913ojt AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, @NotNull OKConversationType oKConversationType, java.lang.String str3, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(oKConversationType, "");
            C36913ojt c36913ojt = new C36913ojt();
            android.os.Bundle bundleEnsureArguments = c36913ojt.ensureArguments();
            bundleEnsureArguments.putString("ARG_FRAGMENT_RESULT_KEY", str);
            bundleEnsureArguments.putString("ARG_CHANNEL_ID", str2);
            bundleEnsureArguments.putString("ARG_PREFILLED_INPUT_MSG", str3);
            bundleEnsureArguments.putSerializable("ARG_CONVERSATION_TYPE", oKConversationType);
            bundleEnsureArguments.putBoolean("ARG_IS_ENABLE_ADD_BUTTON", z);
            bundleEnsureArguments.putBoolean("ARG_IS_ENABLE_VOICE_BUTTON", z2);
            bundleEnsureArguments.putBoolean("ARG_IS_ENABLE_STICKER_BUTTON", z3);
            return c36913ojt;
        }
    }

    /* JADX INFO: renamed from: o.ojt$Activity */
    public static final class Activity implements android.text.TextWatcher {
        public final /* synthetic */ android.widget.EditText KWHzl;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity(android.widget.EditText editText) {
            this.KWHzl = editText;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            DraftMessageModel draftMessageModelCopy$default;
            java.lang.String string;
            C36913ojt.this.valueOf().OLrzqt((java.lang.CharSequence) (editable != null ? editable.toString() : null));
            if (this.KWHzl.hasFocus()) {
                TypingIndicatorConfig value = C36913ojt.this.fetchVPNInfo().uzCIH().getValue();
                if (value == null) {
                    return;
                } else {
                    C36913ojt.this.valueOf().KWHzl(editable, value);
                }
            }
            if (C36913ojt.this.isAdded()) {
                C36913ojt c36913ojt = C36913ojt.this;
                java.lang.String strAEQbTJ = C36913ojt.Companion.AEQbTJ(c36913ojt.gEmmrt());
                kotlin.Pair[] pairArr = new kotlin.Pair[1];
                if (editable == null || (string = editable.toString()) == null) {
                    string = "";
                }
                pairArr[0] = C56390yDp.OLrzqt("ARG_TEXT_CONTENT", string);
                FragmentKt.setFragmentResult(c36913ojt, strAEQbTJ, BundleKt.bundleOf(pairArr));
            }
            if (C36913ojt.this.isAdded()) {
                ChatActivityViewModel chatActivityViewModelFetchVPNInfo = C36913ojt.this.fetchVPNInfo();
                if (C36913ojt.this.fetchVPNInfo().AkhnZx() == null) {
                    java.lang.String strValues = C36913ojt.this.values();
                    draftMessageModelCopy$default = new DraftMessageModel(strValues == null ? "" : strValues, java.lang.String.valueOf(editable), (java.lang.String) null, (java.util.List) null, 4, (DefaultConstructorMarker) null);
                } else {
                    DraftMessageModel draftMessageModelAkhnZx = C36913ojt.this.fetchVPNInfo().AkhnZx();
                    draftMessageModelCopy$default = draftMessageModelAkhnZx != null ? DraftMessageModel.copy$default(draftMessageModelAkhnZx, null, java.lang.String.valueOf(editable), null, null, 13, null) : null;
                }
                ChatActivityViewModel.setDraftMessageModel$default(chatActivityViewModelFetchVPNInfo, draftMessageModelCopy$default, false, 2, null);
            }
        }
    }

    public final KeyboardViewModel valueOf() {
        return (KeyboardViewModel) this.hDKMBd.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChatActivityViewModel fetchVPNInfo() {
        return (ChatActivityViewModel) this.AYXKKw.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String values() {
        return (java.lang.String) this.djBIcL.getValue();
    }

    public static final java.lang.String hDKMBd(C36913ojt c36913ojt) {
        android.os.Bundle arguments = c36913ojt.getArguments();
        if (arguments != null) {
            return arguments.getString("ARG_CHANNEL_ID");
        }
        return null;
    }

    public final java.lang.String djBIcL() {
        return (java.lang.String) this.ejfBZ.getValue();
    }

    public static final java.lang.String zuBGHE(C36913ojt c36913ojt) {
        android.os.Bundle arguments = c36913ojt.getArguments();
        if (arguments != null) {
            return arguments.getString("ARG_PREFILLED_INPUT_MSG");
        }
        return null;
    }

    private final OKConversationType isConnected() {
        return (OKConversationType) this.AhwBna.getValue();
    }

    public static final OKConversationType uzCIH(C36913ojt c36913ojt) {
        android.os.Bundle arguments = c36913ojt.getArguments();
        java.io.Serializable serializable = arguments != null ? arguments.getSerializable("ARG_CONVERSATION_TYPE") : null;
        if (serializable instanceof OKConversationType) {
            return (OKConversationType) serializable;
        }
        return null;
    }

    public final java.lang.String gEmmrt() {
        return (java.lang.String) this.DbNXlk.getValue();
    }

    public static final java.lang.String getFieldNames(C36913ojt c36913ojt) {
        java.lang.String string;
        android.os.Bundle arguments = c36913ojt.getArguments();
        return (arguments == null || (string = arguments.getString("ARG_FRAGMENT_RESULT_KEY")) == null) ? "" : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean DbNXlk() {
        return ((java.lang.Boolean) this.values.getValue()).booleanValue();
    }

    public static final boolean wlaJM(C36913ojt c36913ojt) {
        android.os.Bundle arguments = c36913ojt.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("ARG_IS_ENABLE_ADD_BUTTON");
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean ejfBZ() {
        return ((java.lang.Boolean) this.fetchVPNInfo.getValue()).booleanValue();
    }

    public static final boolean AuCTelauCTel(C36913ojt c36913ojt) {
        android.os.Bundle arguments;
        return C44157sFk.gEmmrt().values() && (arguments = c36913ojt.getArguments()) != null && arguments.getBoolean("ARG_IS_ENABLE_STICKER_BUTTON");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean fARcdN() {
        return ((java.lang.Boolean) this.isConnected.getValue()).booleanValue();
    }

    public static final boolean AwvSrB(C36913ojt c36913ojt) {
        android.os.Bundle arguments = c36913ojt.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("ARG_IS_ENABLE_VOICE_BUTTON");
        }
        return true;
    }

    public final boolean AhwBna() {
        return valueOf().values().getValue() == ObserveShowAgentProcessingFlow.AgentProcessingState.WORKING || valueOf().values().getValue() == ObserveShowAgentProcessingFlow.AgentProcessingState.WORKING_STREAMING;
    }

    public static final void AEQbTJ(C36913ojt c36913ojt, ActivityResult activityResult) {
        C35934oJc c35934oJc;
        nJW njw = c36913ojt.getNewProxyInstance;
        c36913ojt.copydefault((njw == null || (c35934oJc = njw.KWHzl) == null) ? null : c35934oJc.djBIcL());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(android.widget.EditText editText) {
        boolean z;
        java.lang.String strValues = values();
        OKConversationType oKConversationTypeIsConnected = isConnected();
        if (strValues == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strValues) || oKConversationTypeIsConnected == null || oKConversationTypeIsConnected != OKConversationType.GROUP) {
            return;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ActivityResultLauncher<android.content.Intent> activityResultLauncher = this.valueOf;
        GroupInfo value = fetchVPNInfo().fetchVPNInfo().getValue();
        if (value != null) {
            java.lang.Integer type = value.getType();
            z = type != null && type.intValue() == GroupTagType.RM_VIP_GROUP.getValue();
        }
        this.fJNWhG = new C36403oaM(contextRequireContext, editText, strValues, this, activityResultLauncher, z);
    }

    public final void KWHzl() {
        java.lang.String strValues = values();
        OKConversationType oKConversationTypeIsConnected = isConnected();
        if (strValues == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strValues) || oKConversationTypeIsConnected == null || oKConversationTypeIsConnected != OKConversationType.GROUP) {
            return;
        }
        C36403oaM c36403oaM = this.fJNWhG;
        if (c36403oaM != null) {
            c36403oaM.copydefault();
        }
        this.fJNWhG = null;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        nJW njwOLrzqt = nJW.OLrzqt(layoutInflater, viewGroup, false);
        this.getNewProxyInstance = njwOLrzqt;
        if (njwOLrzqt != null) {
            return njwOLrzqt.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        KWHzl();
        this.getNewProxyInstance = null;
        android.app.Dialog dialog = this.AkhnZx;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.AkhnZx = null;
        InterfaceC58217yxC interfaceC58217yxC = this.AuCTel;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.AuCTel = null;
        InterfaceC58217yxC interfaceC58217yxC2 = this.fIwbmz;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        this.fIwbmz = null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        final C35934oJc c35934oJc;
        Intrinsics.checkNotNullParameter(view, "");
        nJW njw = this.getNewProxyInstance;
        if (njw != null && (c35934oJc = njw.KWHzl) != null) {
            c35934oJc.setIsEnableStickerButton(ejfBZ());
            c35934oJc.setIsEnablePluginButton(DbNXlk());
            c35934oJc.setIsEnableVoiceButton(fARcdN());
            androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.setFragmentResultListener("KEY_VOICE_MESSAGE_STATUS_CHANGED", this, new FragmentResultListener() { // from class: o.ojI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.fragment.app.FragmentResultListener
                public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle2) {
                    C36913ojt.AEQbTJ(c35934oJc, this, str, bundle2);
                }
            });
            parentFragmentManager.setFragmentResultListener("KEY_STICKER_BOARD_STATUS_CHANGED", this, new FragmentResultListener() { // from class: o.ojG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.fragment.app.FragmentResultListener
                public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle2) {
                    C36913ojt.copydefault(c35934oJc, str, bundle2);
                }
            });
            android.widget.EditText editTextDjBIcL = c35934oJc.djBIcL();
            editTextDjBIcL.addTextChangedListener(new Activity(editTextDjBIcL));
            oIY oiy = editTextDjBIcL instanceof oIY ? (oIY) editTextDjBIcL : null;
            if (oiy != null) {
                oiy.setOnImagePaste(new Function1() { // from class: o.ojF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C36913ojt.copydefault(this.KWHzl, (java.util.List) obj);
                    }
                });
            }
            c35934oJc.setOnProduceKeyboardInputState(new Function0() { // from class: o.ojH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C36913ojt.getNewProxyInstance(this.AEQbTJ);
                }
            });
            c35934oJc.setOnClickSendButton(new Function0() { // from class: o.ojJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C36913ojt.zsXlph(this.EZpvd);
                }
            });
            c35934oJc.setOnClickStopButton(new Function0() { // from class: o.ojL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C36913ojt.zLjUOn(this.copydefault);
                }
            });
            c35934oJc.setOnPostAnimateAddButton(new Function2() { // from class: o.ojM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C36913ojt.copydefault(this.copydefault, ((java.lang.Integer) obj).intValue(), (android.view.ViewGroup) obj2);
                }
            });
            c35934oJc.setOnInputModeChange(new Function1() { // from class: o.ojK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C36913ojt.AEQbTJ(this.EZpvd, (InputMode) obj);
                }
            });
        }
        fIwbmz();
        AuCTel();
        valueOf().copydefault(values(), djBIcL(), isConnected());
        view.post(new java.lang.Runnable() { // from class: o.ojN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C36913ojt.AubY(this.copydefault);
            }
        });
    }

    public static final void AEQbTJ(C35934oJc c35934oJc, C36913ojt c36913ojt, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c35934oJc.setIsEnableVoiceButton(c36913ojt.fARcdN() && bundle.getBoolean("ARG_VOICE_MESSAGE_STATUS", true));
    }

    public static final void copydefault(C35934oJc c35934oJc, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c35934oJc.setIsEnableStickerButton(bundle.getBoolean("ARG_IS_ENABLE_STICKER_BUTTON", true));
    }

    public static final Unit copydefault(C36913ojt c36913ojt, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C35290nsY.copydefault(c36913ojt, new GeneralAction.ProcessPastedUris(list));
        return Unit.INSTANCE;
    }

    public static final ObserveKeyboardInputStateUseCase.KeyboardInputState getNewProxyInstance(C36913ojt c36913ojt) {
        ObserveKeyboardInputStateUseCase.KeyboardInputState value = c36913ojt.valueOf().AYXKKw().getValue();
        return value == null ? ObserveKeyboardInputStateUseCase.KeyboardInputState.Unknown : value;
    }

    public static final Unit zsXlph(C36913ojt c36913ojt) {
        c36913ojt.valueOf().ejfBZ();
        return Unit.INSTANCE;
    }

    public static final Unit zLjUOn(C36913ojt c36913ojt) {
        c36913ojt.valueOf().fIwbmz();
        c36913ojt.AkhnZx();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C36913ojt c36913ojt, int i, android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        c36913ojt.OLrzqt(i, viewGroup);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C36913ojt c36913ojt, InputMode inputMode) {
        Intrinsics.checkNotNullParameter(inputMode, "");
        if (c36913ojt.isAdded()) {
            FragmentKt.setFragmentResult(c36913ojt, Companion.EZpvd(c36913ojt.gEmmrt()), BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_INPUT_MODE", inputMode)));
        }
        return Unit.INSTANCE;
    }

    public static final void AubY(C36913ojt c36913ojt) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c36913ojt, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void fIwbmz() {
        C35934oJc c35934oJc;
        nJW njw = this.getNewProxyInstance;
        final OKEditText oKEditText = (njw == null || (c35934oJc = njw.KWHzl) == null) ? null : (OKEditText) c35934oJc.findViewById(C35399nuc.StateListAnimator.gmHjFq);
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C33729nDr.class, new java.lang.String[0]);
        final Function1 function1 = new Function1() { // from class: o.ojR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36913ojt.EZpvd(this.KWHzl, oKEditText, (C33729nDr) obj);
            }
        };
        this.AuCTel = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58227yxM() { // from class: o.ojP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C36913ojt.copydefault(function1, obj);
            }
        });
        C35290nsY.AEQbTJ(this, ObserverSource.KeyboardFragment, (Function1<? super java.util.ArrayList<GeneralAction>, Unit>) new Function1() { // from class: o.ojS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36913ojt.EZpvd(this.KWHzl, (java.util.ArrayList) obj);
            }
        });
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C36913ojt c36913ojt, OKEditText oKEditText, C33729nDr c33729nDr) {
        DraftMessageModel draftMessageModelCopy$default = null;
        if (c36913ojt.fetchVPNInfo().AkhnZx() == null) {
            java.lang.String strValues = c36913ojt.values();
            Intrinsics.copydefault((java.lang.Object) strValues);
            OKMessage oKMessageEZpvd = c33729nDr.EZpvd();
            draftMessageModelCopy$default = new DraftMessageModel(strValues, (java.lang.String) null, oKMessageEZpvd != null ? java.lang.Long.valueOf(oKMessageEZpvd.getSeq()).toString() : null, yDY.AhwBna(), 2, (DefaultConstructorMarker) null);
        } else {
            DraftMessageModel draftMessageModelAkhnZx = c36913ojt.fetchVPNInfo().AkhnZx();
            if (draftMessageModelAkhnZx != null) {
                OKMessage oKMessageEZpvd2 = c33729nDr.EZpvd();
                draftMessageModelCopy$default = DraftMessageModel.copy$default(draftMessageModelAkhnZx, null, null, oKMessageEZpvd2 != null ? java.lang.Long.valueOf(oKMessageEZpvd2.getSeq()).toString() : null, null, 11, null);
            }
        }
        c36913ojt.fetchVPNInfo().copydefault(draftMessageModelCopy$default, false);
        KeyboardViewModel keyboardViewModelValueOf = c36913ojt.valueOf();
        Intrinsics.copydefault(c33729nDr);
        keyboardViewModelValueOf.AEQbTJ(c33729nDr, draftMessageModelCopy$default);
        c36913ojt.copydefault(oKEditText);
        return Unit.INSTANCE;
    }

    private final void AuCTel() {
        valueOf().copydefault().observe(getViewLifecycleOwner(), new Observer() { // from class: o.ojX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C36913ojt.AEQbTJ(this.AEQbTJ, (OKConversation) obj);
            }
        });
        valueOf().AhwBna().observe(getViewLifecycleOwner(), new Observer() { // from class: o.ojy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C36913ojt.KWHzl((GroupInfo) obj);
            }
        });
        valueOf().fetchVPNInfo().observe(getViewLifecycleOwner(), new Observer() { // from class: o.ojx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C36913ojt.KWHzl((RelationInfo) obj);
            }
        });
        valueOf().djBIcL().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.ojv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36913ojt.AEQbTJ(this.KWHzl, (GeneralAction) obj);
            }
        }));
        valueOf().gEmmrt().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.ojw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36913ojt.AEQbTJ(this.AEQbTJ, (C36560odK) obj);
            }
        }));
        valueOf().AEQbTJ().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.oju
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36913ojt.AEQbTJ((Unit) obj);
            }
        }));
        valueOf().OLrzqt().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.ojD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36913ojt.AEQbTJ(this.AEQbTJ, (StringResource) obj);
            }
        }));
        valueOf().isConnected().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.ojA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36913ojt.KWHzl(this.OLrzqt, (StringResource) obj);
            }
        }));
        valueOf().valueOf().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.ojz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36913ojt.EZpvd(this.copydefault, (Unit) obj);
            }
        }));
        valueOf().DbNXlk().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.ojC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36913ojt.EZpvd(this.OLrzqt, (java.lang.String) obj);
            }
        }));
        valueOf().EZpvd().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.ojY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36913ojt.KWHzl(this.OLrzqt, (java.lang.String) obj);
            }
        }));
        MutableSharedFlow<Unit> mutableSharedFlowAhwBna = fetchVPNInfo().AhwBna();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C37721ozF.collectOnLifecycle$default(mutableSharedFlowAhwBna, viewLifecycleOwner, (Lifecycle.State) null, new KeyboardFragment$setupObservers$12(this, null), 2, (java.lang.Object) null);
        StateFlow<IMPageType> stateFlowFIwbmz = fetchVPNInfo().fIwbmz();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        C37721ozF.collectOnLifecycle$default(stateFlowFIwbmz, viewLifecycleOwner2, (Lifecycle.State) null, new KeyboardFragment$setupObservers$13(this, null), 2, (java.lang.Object) null);
        StateFlow<ObserveShowAgentProcessingFlow.AgentProcessingState> stateFlowValues = valueOf().values();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        C37721ozF.collectOnLifecycle$default(stateFlowValues, viewLifecycleOwner3, (Lifecycle.State) null, new KeyboardFragment$setupObservers$14(this, null), 2, (java.lang.Object) null);
        StateFlow<C35285nsT> stateFlowFARcdN = fetchVPNInfo().fARcdN();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        C37721ozF.collectOnLifecycle$default(stateFlowFARcdN, viewLifecycleOwner4, (Lifecycle.State) null, new KeyboardFragment$setupObservers$15(this, null), 2, (java.lang.Object) null);
    }

    public static final void AEQbTJ(C36913ojt c36913ojt, OKConversation oKConversation) {
        nJW njw;
        C35934oJc c35934oJc;
        android.widget.EditText editTextDjBIcL;
        if (oKConversation == null || !C44170sFx.AEQbTJ(oKConversation) || (njw = c36913ojt.getNewProxyInstance) == null || (c35934oJc = njw.KWHzl) == null || (editTextDjBIcL = c35934oJc.djBIcL()) == null) {
            return;
        }
        editTextDjBIcL.setHint(c36913ojt.getString(C35399nuc.LoaderManager.ddauOi));
    }

    public static final Unit AEQbTJ(C36913ojt c36913ojt, GeneralAction generalAction) {
        Intrinsics.checkNotNullParameter(generalAction, "");
        C35290nsY.copydefault(c36913ojt, generalAction);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C36913ojt c36913ojt, C36560odK c36560odK) {
        InterfaceC35179nqT interfaceC35179nqT;
        Intrinsics.checkNotNullParameter(c36560odK, "");
        FragmentActivity activity = c36913ojt.getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null && (interfaceC35179nqT = (InterfaceC35179nqT) C43251rlk.OLrzqt(InterfaceC35179nqT.class)) != null) {
            InterfaceC35179nqT.ActionBar.mentionMemberByMessage$default(interfaceC35179nqT, abstractActivityC33041mov, c36560odK.copydefault(), c36560odK.OLrzqt(), true, null, 16, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        C36411oaU.AEQbTJ.OLrzqt();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C36913ojt c36913ojt, StringResource stringResource) {
        Intrinsics.checkNotNullParameter(stringResource, "");
        android.content.Context contextRequireContext = c36913ojt.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C55326xho.toastWithFailedIcon$default(C36563odN.AEQbTJ(stringResource, contextRequireContext), 0, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C36913ojt c36913ojt, StringResource stringResource) {
        Intrinsics.checkNotNullParameter(stringResource, "");
        android.content.Context contextRequireContext = c36913ojt.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C35290nsY.copydefault(c36913ojt, new GeneralAction.SetTextToEditTextField(C36563odN.AEQbTJ(stringResource, contextRequireContext)));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C36913ojt c36913ojt, Unit unit) {
        C35934oJc c35934oJc;
        android.widget.EditText editTextDjBIcL;
        Intrinsics.checkNotNullParameter(unit, "");
        nJW njw = c36913ojt.getNewProxyInstance;
        if (njw != null && (c35934oJc = njw.KWHzl) != null && (editTextDjBIcL = c35934oJc.djBIcL()) != null) {
            c36913ojt.KWHzl(editTextDjBIcL);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C36913ojt c36913ojt, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.content.Context contextRequireContext = c36913ojt.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        c36913ojt.OLrzqt(contextRequireContext, str);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C36913ojt c36913ojt, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.content.res.Resources resources = c36913ojt.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        C55326xho.toast$default(C33069mpW.copydefault(resources, C35399nuc.LoaderManager.getSupportedCipherSuites, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(HintConstants.AUTOFILL_HINT_USERNAME, str))), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    private final void OLrzqt(android.content.Context context, java.lang.String str) {
        java.lang.String strCopydefault = C33069mpW.copydefault(this, C35399nuc.LoaderManager.QVAiDq, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("user", str)));
        android.app.Dialog dialog = this.AkhnZx;
        if (dialog != null) {
            dialog.dismiss();
        }
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(strCopydefault);
        viewOnClickListenerC54939xaY.copydefault(C35399nuc.LoaderManager.QbewEr);
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C35399nuc.LoaderManager.DCUTEI, (View.OnClickListener) null, 2, (java.lang.Object) null);
        this.AkhnZx = viewOnClickListenerC54939xaY;
        viewOnClickListenerC54939xaY.show();
    }

    public final void OLrzqt(int i, android.view.ViewGroup viewGroup) {
        if (i == 1) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KeyboardFragment$maybeDisplayLastImage$1(this, viewGroup, null), 3, null);
        }
    }

    public final void AYXKKw() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KeyboardFragment$showKeyboardForMessage$1(this, null), 3, null);
    }

    public final void AEQbTJ(boolean z) {
        C35934oJc c35934oJc;
        nJW njw = this.getNewProxyInstance;
        if (njw == null || (c35934oJc = njw.KWHzl) == null) {
            return;
        }
        c35934oJc.setIsEnablePluginButton(z);
    }

    public final void copydefault(final android.widget.EditText editText) {
        if (editText != null) {
            editText.setFocusable(true);
        }
        if (editText != null) {
            editText.setFocusableInTouchMode(true);
        }
        if (editText != null) {
            editText.requestFocus();
        }
        if (editText != null) {
            editText.postDelayed(new java.lang.Runnable() { // from class: o.ojQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C36913ojt.copydefault(this.EZpvd, editText);
                }
            }, 200L);
        }
    }

    public static final void copydefault(C36913ojt c36913ojt, android.widget.EditText editText) {
        C33570myu.AEQbTJ(c36913ojt.getContext(), editText);
    }

    public final void AkhnZx() {
        OKConversation value = valueOf().copydefault().getValue();
        OKConversationType conversationType = value != null ? value.getConversationType() : null;
        final java.lang.Integer numValueOf = (conversationType != null && StateListAnimator.copydefault[conversationType.ordinal()] == 1) ? java.lang.Integer.valueOf(value.getGroupType().getValue()) : null;
        OKConversationType conversationType2 = value != null ? value.getConversationType() : null;
        final int i = (conversationType2 != null && StateListAnimator.copydefault[conversationType2.ordinal()] == 1) ? 0 : 1;
        C32866mlf.onEvent$default("IMChat_AIAgent_MessageStopButton_Click", (TrackChannel[]) null, new Function1() { // from class: o.ojB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36913ojt.OLrzqt(numValueOf, i, this, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.Integer num, int i, C36913ojt c36913ojt, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (num != null) {
            eventParamsList.put("group_type", java.lang.String.valueOf(num.intValue()), true);
        }
        eventParamsList.put("channel_type", java.lang.String.valueOf(i), true);
        java.lang.String strValues = c36913ojt.values();
        EventParamsList.put$default(eventParamsList, "channel_id", strValues == null ? "" : strValues, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC36409oaS
    public void copydefault(@NotNull java.util.List<C36407oaQ> list) {
        DraftMessageModel draftMessageModelCopy$default;
        Intrinsics.checkNotNullParameter(list, "");
        pUU.EZpvd(getTAG(), "onMentionBlocksChanged: [STAGE 1/3] Starting draft storage. blocks.size=" + list.size());
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        int i = 0;
        for (java.lang.Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                yDY.AYXKKw();
            }
            C36407oaQ c36407oaQ = (C36407oaQ) obj;
            pUU.EZpvd(getTAG(), "onMentionBlocksChanged: [STAGE 2/3] Mapping block " + i2 + "/" + list.size() + " - '" + c36407oaQ.AEQbTJ() + "' at [" + c36407oaQ.EZpvd() + ", " + c36407oaQ.KWHzl() + "]");
            arrayList.add(new DraftMentionedStringRangeInfoModel(c36407oaQ.copydefault(), C36404oaN.EZpvd.EZpvd(c36407oaQ.AEQbTJ()), c36407oaQ.OLrzqt(), c36407oaQ.AEQbTJ(), c36407oaQ.EZpvd()));
            i = i2;
        }
        boolean z = fetchVPNInfo().AkhnZx() == null;
        ChatActivityViewModel chatActivityViewModelFetchVPNInfo = fetchVPNInfo();
        if (z) {
            java.lang.String strValues = values();
            Intrinsics.copydefault((java.lang.Object) strValues);
            draftMessageModelCopy$default = new DraftMessageModel(strValues, (java.lang.String) null, (java.lang.String) null, arrayList, 6, (DefaultConstructorMarker) null);
        } else {
            DraftMessageModel draftMessageModelAkhnZx = fetchVPNInfo().AkhnZx();
            draftMessageModelCopy$default = draftMessageModelAkhnZx != null ? DraftMessageModel.copy$default(draftMessageModelAkhnZx, null, null, null, arrayList, 7, null) : null;
        }
        ChatActivityViewModel.setDraftMessageModel$default(chatActivityViewModelFetchVPNInfo, draftMessageModelCopy$default, false, 2, null);
        pUU.EZpvd(getTAG(), "onMentionBlocksChanged: [STAGE 3/3] Draft storage complete. stored=" + list.size() + ", isNewModel=" + z);
    }

    public static final Unit EZpvd(C36913ojt c36913ojt, java.util.ArrayList arrayList) {
        C35934oJc c35934oJc;
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            GeneralAction generalAction = (GeneralAction) it.next();
            nJW njw = c36913ojt.getNewProxyInstance;
            if (njw != null && (c35934oJc = njw.KWHzl) != null) {
                c35934oJc.OLrzqt(generalAction);
            }
        }
        return Unit.INSTANCE;
    }
}
