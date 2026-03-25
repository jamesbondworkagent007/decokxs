package com.okinc.im.imui.messageV2.view.messagelist;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.core.util.SPUtils;
import com.okinc.im.config.page.IMPageType;
import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuInfoAction;
import com.okinc.im.imui.messageV2.model.StringResource;
import com.okinc.im.imui.messageV2.view.ChatActivityViewModel;
import com.okinc.im.imui.messageV2.view.messagelist.MessageListFragment;
import com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel;
import com.okinc.im.message.MessageClusterType;
import com.okinc.okimcore.feature.config.TypingIndicatorConfig;
import com.okinc.okimcore.model.im.GroupVoiceCallData;
import com.okinc.okimcore.model.im.GroupVoiceCallUser;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.ReactionAction;
import com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig;
import com.okinc.okimcore.model.im.inhouseim.ws.ReactionDisplay;
import com.okinc.okimcore.model.im.inhouseim.ws.SendReactionAction;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionData;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.remote.UserInfo;
import com.okinc.rxutils.RxBus;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractActivityC33041mov;
import o.AbstractC33902nKb;
import o.AbstractC37001olb;
import o.AbstractC58185ywX;
import o.ActivityC36573odX;
import o.C32979mnm;
import o.C32991mny;
import o.C33024moe;
import o.C33069mpW;
import o.C33070mpX;
import o.C33546myW;
import o.C33731nDt;
import o.C33734nDw;
import o.C33736nDy;
import o.C34703nhO;
import o.C35233nrU;
import o.C35240nrb;
import o.C35242nrd;
import o.C35250nrl;
import o.C35254nrp;
import o.C35399nuc;
import o.C35693oAe;
import o.C35718oBc;
import o.C35921oIq;
import o.C35922oIr;
import o.C35944oJm;
import o.C36558odI;
import o.C36563odN;
import o.C36576oda;
import o.C36609oeG;
import o.C37002olc;
import o.C37005olf;
import o.C37068omp;
import o.C37070omr;
import o.C37721ozF;
import o.C44105sDn;
import o.C52761wXj;
import o.C55298xhM;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56423yEv;
import o.C56442yFn;
import o.C56524yIo;
import o.C59449zhJ;
import o.InterfaceC35259nru;
import o.InterfaceC35920oIp;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC57901yrE;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.ViewOnClickListenerC54939xaY;
import o.nDF;
import o.oIG;
import o.pUU;
import o.rVN;
import o.yCM;
import o.yDY;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class MessageListFragment extends AbstractC37001olb implements InterfaceC35920oIp {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int valueOf = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final Function0<Boolean> AkhnZx;
    public boolean AuCTel;
    public InterfaceC58217yxC AuCTelauCTel;
    public InterfaceC58217yxC AubY;
    public AbstractC33902nKb AwvSrB;
    public final InterfaceC56387yDm AxsJAY;
    public Dialog DbNXlk;
    public final InterfaceC56387yDm QOLQEE;

    @yCM
    public InterfaceC35259nru audioCallAPI;
    public final InterfaceC56387yDm djBIcL;
    public List<String> ejfBZ;
    public final InterfaceC56387yDm fARcdN;
    public final InterfaceC56387yDm fIwbmz;
    public Long fetchVPNInfo;
    public Job gHZMYf;
    public InterfaceC58217yxC getFieldNames;
    public C37005olf getNewProxyInstance;
    public InterfaceC58217yxC hDKMBd;
    public boolean isConnected;
    public InterfaceC58217yxC iwGUEr;

    @yCM
    public C36576oda playAudioManager;
    public final InterfaceC56387yDm sSMYrx;
    public InterfaceC58217yxC uzCIH;
    public final InterfaceC56387yDm values;
    public final C35921oIq wlaJM;
    public C37068omp zLjUOn;
    public InterfaceC58217yxC zsXlph;
    public Job zuBGHE;
    public final /* synthetic */ C35921oIq AhwBna = new C35921oIq();
    public final int fJNWhG = C35399nuc.Dialog.OFhtUX;
    public final C37002olc gEmmrt = new C37002olc();

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
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
        public final /* synthetic */ void onChanged(Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35920oIp
    public void copydefault(@NotNull Fragment fragment, @Dimension(unit = 0) int i, @ColorInt int i2) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.AhwBna.copydefault(fragment, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.fJNWhG;
    }

    public MessageListFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.okinc.im.imui.messageV2.view.messagelist.MessageListFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.messageV2.view.messagelist.MessageListFragment$special$$inlined$viewModels$default$2
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
        this.QOLQEE = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MessageListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.messageV2.view.messagelist.MessageListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.messageV2.view.messagelist.MessageListFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.messageV2.view.messagelist.MessageListFragment$special$$inlined$viewModels$default$5
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ChatActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.messageV2.view.messagelist.MessageListFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.messageV2.view.messagelist.MessageListFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.messageV2.view.messagelist.MessageListFragment$special$$inlined$activityViewModels$default$3
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
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.oli
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MessageListFragment.AubY(this.OLrzqt);
            }
        });
        this.sSMYrx = C56392yDr.copydefault(new Function0() { // from class: o.olh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MessageListFragment.QbewEr(this.KWHzl);
            }
        });
        this.AxsJAY = C56392yDr.copydefault(new Function0() { // from class: o.olr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MessageListFragment.QKVWgx(this.EZpvd);
            }
        });
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.olA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MessageListFragment.AuCTelauCTel(this.EZpvd);
            }
        });
        this.fIwbmz = C56392yDr.copydefault(new Function0() { // from class: o.olN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(MessageListFragment.DTwDnp(this.KWHzl));
            }
        });
        this.fARcdN = C56392yDr.copydefault(new Function0() { // from class: o.omd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(MessageListFragment.OcIXYQ(this.copydefault));
            }
        });
        this.ejfBZ = yDY.AhwBna();
        this.AkhnZx = new Function0() { // from class: o.omm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(MessageListFragment.ORxRYg(this.EZpvd));
            }
        };
        this.wlaJM = new C35921oIq();
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.messageV2.view.messagelist.MessageListFragment.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final String EZpvd(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return str + "_FRAGMENT_RESULT_IS_LOADING";
        }

        public final String AEQbTJ(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return str + "_FRAGMENT_RESULT_IS_LOADING_LEGACY";
        }

        public final String copydefault(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return str + "_FRAGMENT_RESULT_LOAD_MESSAGE_LIST_STATE";
        }

        public final String KWHzl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return str + "_FRAGMENT_RESULT_RELOAD_INPUT_STATE";
        }

        public final MessageListFragment KWHzl(@NotNull String str, String str2, Long l, String str3, @NotNull IMPageType iMPageType, boolean z, boolean z2, Long l2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(iMPageType, "");
            MessageListFragment messageListFragment = new MessageListFragment();
            Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_FRAGMENT_REQUEST_KEY", str), C56390yDp.OLrzqt("ARG_CHANNEL_ID", str2), C56390yDp.OLrzqt("ARG_SEARCH_KEY", str3), C56390yDp.OLrzqt("ARG_PAGE_TYPE", iMPageType), C56390yDp.OLrzqt("ARG_IS_DISPLAY_USER_INFO", Boolean.valueOf(z)), C56390yDp.OLrzqt("ARG_IS_DISPLAY_INTERVAL_TIMESTAMP", Boolean.valueOf(z2)), C56390yDp.OLrzqt("ARGS_GROUP_ID", l2));
            if (l != null) {
                bundleBundleOf.putLong("ARG_TARGET_MESSAGE_ID", l.longValue());
            }
            messageListFragment.setArguments(bundleBundleOf);
            return messageListFragment;
        }
    }

    public final MessageListViewModel AYXKKw() {
        return (MessageListViewModel) this.QOLQEE.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChatActivityViewModel getNewProxyInstance() {
        return (ChatActivityViewModel) this.djBIcL.getValue();
    }

    public final C36576oda gEmmrt() {
        C36576oda c36576oda = this.playAudioManager;
        if (c36576oda != null) {
            return c36576oda;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final InterfaceC35259nru djBIcL() {
        InterfaceC35259nru interfaceC35259nru = this.audioCallAPI;
        if (interfaceC35259nru != null) {
            return interfaceC35259nru;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getFieldNames() {
        return (String) this.AYXKKw.getValue();
    }

    public static final String AubY(MessageListFragment messageListFragment) {
        Bundle arguments = messageListFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("ARG_CHANNEL_ID");
        }
        return null;
    }

    public final Long valueOf() {
        return (Long) this.sSMYrx.getValue();
    }

    public static final Long QbewEr(MessageListFragment messageListFragment) {
        Bundle arguments = messageListFragment.getArguments();
        if (arguments == null || !arguments.containsKey("ARG_TARGET_MESSAGE_ID")) {
            return null;
        }
        return Long.valueOf(arguments.getLong("ARG_TARGET_MESSAGE_ID"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String hDKMBd() {
        return (String) this.AxsJAY.getValue();
    }

    public static final String QKVWgx(MessageListFragment messageListFragment) {
        Bundle arguments = messageListFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("ARG_SEARCH_KEY");
        }
        return null;
    }

    private final String uzCIH() {
        return (String) this.values.getValue();
    }

    public static final String AuCTelauCTel(MessageListFragment messageListFragment) {
        String string;
        Bundle arguments = messageListFragment.getArguments();
        return (arguments == null || (string = arguments.getString("ARG_FRAGMENT_REQUEST_KEY")) == null) ? "" : string;
    }

    private final boolean zLjUOn() {
        return ((Boolean) this.fIwbmz.getValue()).booleanValue();
    }

    public static final boolean DTwDnp(MessageListFragment messageListFragment) {
        Bundle arguments = messageListFragment.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("ARG_IS_DISPLAY_USER_INFO");
        }
        return true;
    }

    private final boolean wlaJM() {
        return ((Boolean) this.fARcdN.getValue()).booleanValue();
    }

    public static final boolean OcIXYQ(MessageListFragment messageListFragment) {
        Bundle arguments = messageListFragment.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("ARG_IS_DISPLAY_INTERVAL_TIMESTAMP");
        }
        return true;
    }

    public static final boolean ORxRYg(MessageListFragment messageListFragment) {
        return messageListFragment.AYXKKw().AkhnZx();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC33902nKb abstractC33902nKbCopydefault = AbstractC33902nKb.copydefault(layoutInflater, viewGroup, false);
        this.AwvSrB = abstractC33902nKbCopydefault;
        if (abstractC33902nKbCopydefault != null) {
            return abstractC33902nKbCopydefault.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        RecyclerView recyclerView;
        super.onResume();
        AbstractC33902nKb abstractC33902nKb = this.AwvSrB;
        if (abstractC33902nKb == null || (recyclerView = abstractC33902nKb.KWHzl) == null) {
            return;
        }
        recyclerView.post(new Runnable() { // from class: o.omn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                MessageListFragment.QOLQEE(this.AEQbTJ);
            }
        });
    }

    public static final void QOLQEE(MessageListFragment messageListFragment) {
        messageListFragment.KWHzl();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        RecyclerView recyclerView;
        super.onDestroyView();
        Job job = this.zuBGHE;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.zuBGHE = null;
        gEmmrt().OLrzqt();
        AbstractC33902nKb abstractC33902nKb = this.AwvSrB;
        if (abstractC33902nKb != null && (recyclerView = abstractC33902nKb.KWHzl) != null) {
            recyclerView.setAdapter(null);
        }
        this.AwvSrB = null;
        InterfaceC58217yxC interfaceC58217yxC = this.iwGUEr;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.iwGUEr = null;
        InterfaceC58217yxC interfaceC58217yxC2 = this.AubY;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        this.AubY = null;
        this.zLjUOn = null;
        InterfaceC58217yxC interfaceC58217yxC3 = this.hDKMBd;
        if (interfaceC58217yxC3 != null) {
            interfaceC58217yxC3.dispose();
        }
        this.hDKMBd = null;
        InterfaceC58217yxC interfaceC58217yxC4 = this.zsXlph;
        if (interfaceC58217yxC4 != null) {
            interfaceC58217yxC4.dispose();
        }
        this.zsXlph = null;
        InterfaceC58217yxC interfaceC58217yxC5 = this.uzCIH;
        if (interfaceC58217yxC5 != null) {
            interfaceC58217yxC5.dispose();
        }
        this.uzCIH = null;
        InterfaceC58217yxC interfaceC58217yxC6 = this.AuCTelauCTel;
        if (interfaceC58217yxC6 != null) {
            interfaceC58217yxC6.dispose();
        }
        this.AuCTelauCTel = null;
        InterfaceC58217yxC interfaceC58217yxC7 = this.getFieldNames;
        if (interfaceC58217yxC7 != null) {
            interfaceC58217yxC7.dispose();
        }
        this.getFieldNames = null;
        C33736nDy.copydefault.KWHzl();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        ejfBZ();
        EZpvd(yDY.AhwBna());
        AYXKKw().KWHzl(false);
        AYXKKw().copydefault();
    }

    public final void AkhnZx() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C37068omp c37068omp = null;
        C37005olf c37005olf = null;
        c37068omp = null;
        C35693oAe c35693oAe = wlaJM() ? C35693oAe.AEQbTJ : null;
        C37002olc c37002olc = this.gEmmrt;
        Function0<Boolean> function0 = this.AkhnZx;
        boolean zZLjUOn = zLjUOn();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        this.getNewProxyInstance = c37002olc.OLrzqt(c35693oAe, zZLjUOn, (10112 & 4) != 0 ? null : function0, (10112 & 8) != 0 ? false : false, (10112 & 16) != 0 ? null : new Function0() { // from class: o.omc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MessageListFragment.AxsJAY(this.KWHzl);
            }
        }, (10112 & 32) != 0 ? null : new Function0() { // from class: o.omb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MessageListFragment.sSMYrx(this.KWHzl);
            }
        }, (10112 & 64) != 0 ? null : new yHO() { // from class: o.oma
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return MessageListFragment.copydefault(this.KWHzl, (android.view.View) obj, (java.util.List) obj2, (C35254nrp) obj3);
            }
        }, (10112 & 128) != 0 ? null : new Function1() { // from class: o.omi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListFragment.copydefault(this.AEQbTJ, (OKMessage) obj);
            }
        }, (10112 & 256) != 0 ? null : new Function1() { // from class: o.omf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListFragment.OLrzqt(this.KWHzl, (OKMessage) obj);
            }
        }, (10112 & 512) != 0 ? null : new Function1() { // from class: o.ome
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListFragment.AhwBna(this.OLrzqt, (OKMessage) obj);
            }
        }, (10112 & 1024) != 0 ? null : new Function0() { // from class: o.omg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MessageListFragment.AwvSrB(this.EZpvd);
            }
        }, viewLifecycleOwner, (10112 & 4096) != 0 ? false : getNewProxyInstance().AuCTelauCTel().getValue().booleanValue(), (10112 & 8192) != 0 ? null : new Function0() { // from class: o.omh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MessageListFragment.gHZMYf(this.copydefault);
            }
        });
        AbstractC33902nKb abstractC33902nKb = this.AwvSrB;
        if (abstractC33902nKb != null && (recyclerView2 = abstractC33902nKb.KWHzl) != null) {
            recyclerView2.setItemAnimator(null);
            C37005olf c37005olf2 = this.getNewProxyInstance;
            if (c37005olf2 == null) {
                Intrinsics.gEmmrt("");
                c37005olf2 = null;
            }
            recyclerView2.setAdapter(c37005olf2);
        }
        AbstractC33902nKb abstractC33902nKb2 = this.AwvSrB;
        if (abstractC33902nKb2 != null && (recyclerView = abstractC33902nKb2.KWHzl) != null) {
            C37005olf c37005olf3 = this.getNewProxyInstance;
            if (c37005olf3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c37005olf = c37005olf3;
            }
            c37068omp = new C37068omp(recyclerView, c37005olf, AYXKKw(), LifecycleOwnerKt.getLifecycleScope(this));
        }
        this.zLjUOn = c37068omp;
    }

    public static final OKConversation AxsJAY(MessageListFragment messageListFragment) {
        return messageListFragment.AYXKKw().gEmmrt().getValue();
    }

    public static final UserInfo sSMYrx(MessageListFragment messageListFragment) {
        return messageListFragment.AYXKKw().djBIcL().getValue();
    }

    public static final Unit copydefault(final MessageListFragment messageListFragment, View view, List list, final C35254nrp c35254nrp) {
        Context context;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        if (messageListFragment.getNewProxyInstance().zsXlph().getValue().booleanValue() && (context = messageListFragment.getContext()) != null) {
            boolean z = c35254nrp.OLrzqt().getMessageDirection() == OKMessage.MessageDirection.RECEIVE;
            ArrayList<MenuInfoAction> arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof MenuInfoAction) {
                    arrayList.add(obj);
                }
            }
            for (MenuInfoAction menuInfoAction : arrayList) {
                MessageClusterType messageClusterTypeCopydefault = c35254nrp.copydefault();
                menuInfoAction.KWHzl(messageClusterTypeCopydefault != null ? messageClusterTypeCopydefault.name() : null);
            }
            C35921oIq c35921oIq = messageListFragment.wlaJM;
            FragmentActivity fragmentActivityRequireActivity = messageListFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            c35921oIq.KWHzl(view, new oIG(fragmentActivityRequireActivity, view, yDY.gEmmrt("👍", "👎", "❤️", "😊", "🥲", "🔥"), messageListFragment.AEQbTJ(list.listIterator()), c35254nrp.OLrzqt().getReactionDisplay(), new Function1() { // from class: o.omk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return MessageListFragment.EZpvd(this.copydefault, c35254nrp, (java.lang.String) obj2);
                }
            }), new C35922oIr.ActionBar(Integer.valueOf(C55298xhM.OLrzqt(8, context)), 0, 0, Integer.valueOf(z ? 8388611 : 8388613)), c35254nrp.OLrzqt(), messageListFragment.getNewProxyInstance().wlaJM().getValue().booleanValue());
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(MessageListFragment messageListFragment, C35254nrp c35254nrp, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(messageListFragment), null, null, new MessageListFragment$initMessageList$3$1$2$1(messageListFragment, str, c35254nrp, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(MessageListFragment messageListFragment, OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        messageListFragment.AYXKKw().OLrzqt(oKMessage);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(MessageListFragment messageListFragment, OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        messageListFragment.AYXKKw().valueOf(oKMessage);
        return Unit.INSTANCE;
    }

    public static final Unit AwvSrB(MessageListFragment messageListFragment) {
        Fragment parentFragment = messageListFragment.getParentFragment();
        C36609oeG c36609oeG = parentFragment instanceof C36609oeG ? (C36609oeG) parentFragment : null;
        if (c36609oeG != null) {
            c36609oeG.copydefault(C35399nuc.LoaderManager.zLnOGN);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(MessageListFragment messageListFragment, OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        messageListFragment.zsXlph();
        return Unit.INSTANCE;
    }

    public static final Long gHZMYf(MessageListFragment messageListFragment) {
        return messageListFragment.fetchVPNInfo;
    }

    private final void zsXlph() {
        GroupInfo value = getNewProxyInstance().fetchVPNInfo().getValue();
        GroupVoiceCallConfig groupVoiceCallConfig = value != null ? value.getGroupVoiceCallConfig() : null;
        GroupVoiceCallData currentCall = groupVoiceCallConfig != null ? groupVoiceCallConfig.getCurrentCall() : null;
        Integer maxParticipants = currentCall != null ? currentCall.getMaxParticipants() : null;
        List<GroupVoiceCallUser> activeUsers = currentCall != null ? currentCall.getActiveUsers() : null;
        Integer numValueOf = activeUsers != null ? Integer.valueOf(activeUsers.size()) : null;
        pUU.EZpvd(getTAG(), "joinCall: groupInfo=" + (value != null) + ", voiceCallConfig=" + (groupVoiceCallConfig != null) + ", currentCall=" + (currentCall != null) + ", maxParticipants=" + maxParticipants + ", activeUsersCount=" + numValueOf);
        if (maxParticipants == null || numValueOf == null) {
            pUU.EZpvd(getTAG(), "joinCall: cannot proceed - missing required values");
            return;
        }
        if (numValueOf.intValue() < maxParticipants.intValue()) {
            pUU.EZpvd(getTAG(), "joinCall: proceeding to requestStartVoiceCall");
            Fragment parentFragment = getParentFragment();
            C36609oeG c36609oeG = parentFragment instanceof C36609oeG ? (C36609oeG) parentFragment : null;
            if (c36609oeG != null) {
                C36609oeG.requestStartVoiceCall$default(c36609oeG, null, 1, null);
                return;
            }
            return;
        }
        pUU.EZpvd(getTAG(), "joinCall: call at max capacity (" + numValueOf + "/" + maxParticipants + ")");
        Fragment parentFragment2 = getParentFragment();
        C36609oeG c36609oeG2 = parentFragment2 instanceof C36609oeG ? (C36609oeG) parentFragment2 : null;
        if (c36609oeG2 != null) {
            c36609oeG2.copydefault(C35399nuc.LoaderManager.DPHsZd);
        }
    }

    public final void values() {
        StateFlow<C35233nrU> stateFlowEZpvd = djBIcL().EZpvd();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C37721ozF.collectOnLifecycle$default(stateFlowEZpvd, viewLifecycleOwner, (Lifecycle.State) null, new MessageListFragment$observeGroupCallParticipation$1(this, null), 2, (Object) null);
    }

    public final void DbNXlk() {
        C37005olf c37005olf = this.getNewProxyInstance;
        if (c37005olf != null) {
            if (c37005olf == null) {
                Intrinsics.gEmmrt("");
                c37005olf = null;
            }
            c37005olf.notifyDataSetChanged();
        }
    }

    public final void AEQbTJ(String str, String str2, long j, List<ReactionDisplay> list) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        if ((fragmentActivityRequireActivity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) fragmentActivityRequireActivity : null) != null) {
            if (C34703nhO.AhwBna(C32979mnm.EZpvd.OLrzqt()) && SPUtils.getBoolean("KEY_AUTO_SEND_EMOJI_MSG_TOGGLE", false)) {
                KWHzl(str, str2, j);
                return;
            }
            String strEZpvd = oIG.Companion.EZpvd(list);
            ArrayList arrayList = new ArrayList();
            if (strEZpvd != null) {
                arrayList.add(new ReactionAction(strEZpvd, SendReactionAction.REMOVE));
            }
            if (!C59449zhJ.equals$default(strEZpvd, str, false, 2, null)) {
                arrayList.add(new ReactionAction(str, SendReactionAction.ADD));
            }
            RxBus.AEQbTJ(new C35250nrl(new WSSendReactionData(str2, j, arrayList)));
            return;
        }
        pUU.copydefault(getTAG(), "Error handling emoji reaction");
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [T, com.okinc.okimcore.model.im.inhouseim.ws.SendReactionAction] */
    public final void KWHzl(String str, String str2, long j) {
        Job job = this.gHZMYf;
        if (job == null || !job.isActive()) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = SendReactionAction.ADD;
            this.gHZMYf = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MessageListFragment$debugSendEmojiLoopMessage$1(this, SPUtils.getInt("ModifyIMAPIKeyActivity_KEY_AUTO_SYNC_FREQ", 300), objectRef, null), 3, null);
            return;
        }
        Job job2 = this.gHZMYf;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
    }

    private final void AuCTelauCTel() {
        C33546myW c33546myW;
        AbstractC33902nKb abstractC33902nKb = this.AwvSrB;
        if (abstractC33902nKb == null || (c33546myW = abstractC33902nKb.EZpvd) == null) {
            return;
        }
        c33546myW.OLrzqt(200);
        c33546myW.OLrzqt((InterfaceC57901yrE) new C37070omr(AYXKKw()));
    }

    private final void AEQbTJ(boolean z) {
        C33546myW c33546myW;
        AbstractC33902nKb abstractC33902nKb = this.AwvSrB;
        if (abstractC33902nKb == null || (c33546myW = abstractC33902nKb.EZpvd) == null) {
            return;
        }
        if (z) {
            c33546myW.AhwBna();
        } else {
            c33546myW.AEQbTJ();
        }
    }

    private final void copydefault(boolean z) {
        C33546myW c33546myW;
        AbstractC33902nKb abstractC33902nKb = this.AwvSrB;
        if (abstractC33902nKb == null || (c33546myW = abstractC33902nKb.EZpvd) == null) {
            return;
        }
        if (z) {
            c33546myW.gEmmrt();
        } else {
            c33546myW.valueOf();
        }
    }

    public static final void DbNXlk(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public final void isConnected() {
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(nDF.class, new String[0]);
        final Function1 function1 = new Function1() { // from class: o.olu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListFragment.AEQbTJ(this.KWHzl, (nDF) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.olJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MessageListFragment.DbNXlk(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.olQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListFragment.AhwBna((java.lang.Throwable) obj);
            }
        };
        this.iwGUEr = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.olT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MessageListFragment.fIwbmz(function12, obj);
            }
        });
        AbstractC58185ywX abstractC58185ywXKWHzl2 = RxBus.KWHzl(C35240nrb.class, new String[0]);
        final Function1 function13 = new Function1() { // from class: o.olS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListFragment.OLrzqt(this.AEQbTJ, (C35240nrb) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.olR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MessageListFragment.fARcdN(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.olP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListFragment.djBIcL((java.lang.Throwable) obj);
            }
        };
        this.hDKMBd = abstractC58185ywXKWHzl2.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.olW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MessageListFragment.fJNWhG(function14, obj);
            }
        });
        AbstractC58185ywX abstractC58185ywXKWHzl3 = RxBus.KWHzl(C35250nrl.class, new String[0]);
        final Function1 function15 = new Function1() { // from class: o.olV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListFragment.OLrzqt(this.OLrzqt, (C35250nrl) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM3 = new InterfaceC58227yxM() { // from class: o.olX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MessageListFragment.AuCTel(function15, obj);
            }
        };
        final Function1 function16 = new Function1() { // from class: o.olt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListFragment.gEmmrt((java.lang.Throwable) obj);
            }
        };
        this.zsXlph = abstractC58185ywXKWHzl3.AEQbTJ(interfaceC58227yxM3, new InterfaceC58227yxM() { // from class: o.olv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MessageListFragment.ejfBZ(function16, obj);
            }
        });
        AbstractC58185ywX abstractC58185ywXKWHzl4 = RxBus.KWHzl(C35242nrd.class, new String[0]);
        final Function1 function17 = new Function1() { // from class: o.olz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListFragment.EZpvd(this.EZpvd, (C35242nrd) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM4 = new InterfaceC58227yxM() { // from class: o.oly
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MessageListFragment.hDKMBd(function17, obj);
            }
        };
        final Function1 function18 = new Function1() { // from class: o.olw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListFragment.fetchVPNInfo((java.lang.Throwable) obj);
            }
        };
        this.uzCIH = abstractC58185ywXKWHzl4.AEQbTJ(interfaceC58227yxM4, new InterfaceC58227yxM() { // from class: o.olx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MessageListFragment.getNewProxyInstance(function18, obj);
            }
        });
        AbstractC58185ywX abstractC58185ywXKWHzl5 = RxBus.KWHzl(C33731nDt.class, new String[0]);
        final Function1 function19 = new Function1() { // from class: o.olE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListFragment.AEQbTJ(this.OLrzqt, (C33731nDt) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM5 = new InterfaceC58227yxM() { // from class: o.olB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MessageListFragment.uzCIH(function19, obj);
            }
        };
        final Function1 function110 = new Function1() { // from class: o.olC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListFragment.DbNXlk((java.lang.Throwable) obj);
            }
        };
        this.AubY = abstractC58185ywXKWHzl5.AEQbTJ(interfaceC58227yxM5, new InterfaceC58227yxM() { // from class: o.olD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MessageListFragment.getFieldNames(function110, obj);
            }
        });
        AbstractC58185ywX abstractC58185ywXKWHzl6 = RxBus.KWHzl(C35718oBc.class, new String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl6, "");
        AbstractC58185ywX abstractC58185ywXKWHzl7 = C33024moe.KWHzl(abstractC58185ywXKWHzl6);
        final Function1 function111 = new Function1() { // from class: o.olH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListFragment.EZpvd(this.KWHzl, (C35718oBc) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM6 = new InterfaceC58227yxM() { // from class: o.olG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MessageListFragment.iwGUEr(function111, obj);
            }
        };
        final Function1 function112 = new Function1() { // from class: o.olI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListFragment.values((java.lang.Throwable) obj);
            }
        };
        this.AuCTelauCTel = abstractC58185ywXKWHzl7.AEQbTJ(interfaceC58227yxM6, new InterfaceC58227yxM() { // from class: o.olF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MessageListFragment.wlaJM(function112, obj);
            }
        });
        AbstractC58185ywX abstractC58185ywXKWHzl8 = RxBus.KWHzl(C33734nDw.class, new String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl8, "");
        AbstractC58185ywX abstractC58185ywXKWHzl9 = C33024moe.KWHzl(abstractC58185ywXKWHzl8);
        final Function1 function113 = new Function1() { // from class: o.olK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListFragment.AEQbTJ(this.KWHzl, (C33734nDw) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM7 = new InterfaceC58227yxM() { // from class: o.olO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MessageListFragment.AuCTelauCTel(function113, obj);
            }
        };
        final Function1 function114 = new Function1() { // from class: o.olL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListFragment.AkhnZx((java.lang.Throwable) obj);
            }
        };
        this.getFieldNames = abstractC58185ywXKWHzl9.AEQbTJ(interfaceC58227yxM7, new InterfaceC58227yxM() { // from class: o.olM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MessageListFragment.AubY(function114, obj);
            }
        });
    }

    public static final Unit AEQbTJ(MessageListFragment messageListFragment, nDF ndf) {
        messageListFragment.AYXKKw().KWHzl(ndf.copydefault());
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void fIwbmz(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void fARcdN(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(MessageListFragment messageListFragment, C35240nrb c35240nrb) {
        messageListFragment.AYXKKw().KWHzl(Long.valueOf(c35240nrb.KWHzl()));
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void fJNWhG(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void AuCTel(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(MessageListFragment messageListFragment, C35250nrl c35250nrl) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(messageListFragment), null, null, new MessageListFragment$listenNavigateEvent$5$1(messageListFragment, c35250nrl, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final void ejfBZ(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void hDKMBd(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(MessageListFragment messageListFragment, C35242nrd c35242nrd) {
        messageListFragment.AYXKKw().KWHzl((Long) null);
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void getNewProxyInstance(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void uzCIH(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(MessageListFragment messageListFragment, C33731nDt c33731nDt) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(messageListFragment), null, null, new MessageListFragment$listenNavigateEvent$9$1(messageListFragment, c33731nDt, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void getFieldNames(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void iwGUEr(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(MessageListFragment messageListFragment, C35718oBc c35718oBc) {
        messageListFragment.AYXKKw().getNewProxyInstance();
        messageListFragment.AuCTel();
        return Unit.INSTANCE;
    }

    public static final Unit values(Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void wlaJM(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void AuCTelauCTel(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(MessageListFragment messageListFragment, C33734nDw c33734nDw) {
        Context context = messageListFragment.getContext();
        if (context != null) {
            messageListFragment.AYXKKw().copydefault(context, c33734nDw.copydefault(), c33734nDw.EZpvd());
        }
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void AubY(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.oIp.Activity.init$default(o.oIp, androidx.fragment.app.Fragment, int, int, int, java.lang.Object):void */
    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        InterfaceC35920oIp.Activity.init$default(this.wlaJM, this, 0, C33070mpX.copydefault(C52761wXj.Activity.DjwCMv), 2, null);
        AuCTelauCTel();
        isConnected();
        gHZMYf();
        AubY();
        AYXKKw().fIwbmz().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.omj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListFragment.AhwBna(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        AYXKKw().DbNXlk().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.oml
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListFragment.valueOf(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        AYXKKw().ejfBZ().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.olj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListFragment.AYXKKw(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        AYXKKw().gEmmrt().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.olk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListFragment.OLrzqt((OKConversation) obj);
            }
        }));
        AYXKKw().AhwBna().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.olg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListFragment.OLrzqt(this.OLrzqt, (MessageListViewModel.ActionBar) obj);
            }
        }));
        AYXKKw().isConnected().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.olp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListFragment.djBIcL(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        AYXKKw().fetchVPNInfo().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.olo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListFragment.values(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        AYXKKw().values().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.oll
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListFragment.fetchVPNInfo(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        AYXKKw().OLrzqt().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.olm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListFragment.OLrzqt(this.copydefault, (MessageListViewModel.Application) obj);
            }
        }));
        StateFlow<Boolean> stateFlowAuCTelauCTel = getNewProxyInstance().AuCTelauCTel();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C37721ozF.collectOnLifecycle$default(stateFlowAuCTelauCTel, viewLifecycleOwner, (Lifecycle.State) null, new AnonymousClass10(null), 2, (Object) null);
        SharedFlow<String> sharedFlowAYXKKw = AYXKKw().AYXKKw();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        C37721ozF.collectOnLifecycle$default(sharedFlowAYXKKw, viewLifecycleOwner2, (Lifecycle.State) null, new AnonymousClass11(null), 2, (Object) null);
        StateFlow<TypingIndicatorConfig> stateFlowUzCIH = getNewProxyInstance().uzCIH();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        C37721ozF.collectOnLifecycle$default(stateFlowUzCIH, viewLifecycleOwner3, (Lifecycle.State) null, new AnonymousClass12(null), 2, (Object) null);
        StateFlow<OKConversation> stateFlowValueOf = getNewProxyInstance().valueOf();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        C37721ozF.collectOnLifecycle$default(stateFlowValueOf, viewLifecycleOwner4, (Lifecycle.State) null, new AnonymousClass13(null), 2, (Object) null);
        fetchVPNInfo();
        AYXKKw().AEQbTJ(getFieldNames(), valueOf(), hDKMBd());
        AkhnZx();
        values();
    }

    public static final Unit AhwBna(MessageListFragment messageListFragment, Boolean bool) {
        FragmentKt.setFragmentResult(messageListFragment, Companion.AEQbTJ(messageListFragment.uzCIH()), BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_IS_LOADING", bool)));
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(MessageListFragment messageListFragment, Boolean bool) {
        FragmentKt.setFragmentResult(messageListFragment, Companion.EZpvd(messageListFragment.uzCIH()), BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_IS_LOADING", bool)));
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(MessageListFragment messageListFragment, Boolean bool) {
        Intrinsics.copydefault(bool);
        messageListFragment.AEQbTJ(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(OKConversation oKConversation) {
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final MessageListFragment messageListFragment, MessageListViewModel.ActionBar actionBar) {
        C37068omp c37068omp = messageListFragment.zLjUOn;
        if (c37068omp != null) {
            Intrinsics.copydefault(actionBar);
            c37068omp.copydefault(actionBar, new Function0() { // from class: o.olq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MessageListFragment.zuBGHE(this.EZpvd);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit zuBGHE(MessageListFragment messageListFragment) {
        messageListFragment.KWHzl();
        rVN.reportFullyDrawn$default((Fragment) messageListFragment, true, (String) null, 2, (Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(MessageListFragment messageListFragment, Boolean bool) {
        Intrinsics.copydefault(bool);
        messageListFragment.copydefault(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final Unit values(MessageListFragment messageListFragment, Boolean bool) {
        C33546myW c33546myW;
        AbstractC33902nKb abstractC33902nKb = messageListFragment.AwvSrB;
        if (abstractC33902nKb != null && (c33546myW = abstractC33902nKb.EZpvd) != null) {
            Intrinsics.copydefault(bool);
            c33546myW.AhwBna(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(MessageListFragment messageListFragment, Boolean bool) {
        FragmentKt.setFragmentResult(messageListFragment, Companion.copydefault(messageListFragment.uzCIH()), BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_IS_FAILURE", bool)));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(MessageListFragment messageListFragment, MessageListViewModel.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        messageListFragment.AEQbTJ(application);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.messageV2.view.messagelist.MessageListFragment$initView$10, reason: invalid class name */
    public static final class AnonymousClass10 extends SuspendLambda implements yHO<CoroutineScope, Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass10(Continuation<? super AnonymousClass10> continuation) {
            super(3, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // o.yHO
        public /* synthetic */ Object invoke(CoroutineScope coroutineScope, Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(coroutineScope, bool.booleanValue(), continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(CoroutineScope coroutineScope, boolean z, Continuation<? super Unit> continuation) {
            AnonymousClass10 anonymousClass10 = MessageListFragment.this.new AnonymousClass10(continuation);
            anonymousClass10.Z$0 = z;
            return anonymousClass10.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                boolean z = this.Z$0;
                if (MessageListFragment.this.getNewProxyInstance != null) {
                    C37005olf c37005olf = MessageListFragment.this.getNewProxyInstance;
                    if (c37005olf == null) {
                        Intrinsics.gEmmrt("");
                        c37005olf = null;
                    }
                    c37005olf.EZpvd(z);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.messageV2.view.messagelist.MessageListFragment$initView$11, reason: invalid class name */
    public static final class AnonymousClass11 extends SuspendLambda implements yHO<CoroutineScope, String, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass11(Continuation<? super AnonymousClass11> continuation) {
            super(3, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.yHO
        public final Object invoke(CoroutineScope coroutineScope, String str, Continuation<? super Unit> continuation) {
            AnonymousClass11 anonymousClass11 = MessageListFragment.this.new AnonymousClass11(continuation);
            anonymousClass11.L$0 = str;
            return anonymousClass11.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                MessageListFragment.this.AEQbTJ((String) this.L$0);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.messageV2.view.messagelist.MessageListFragment$initView$12, reason: invalid class name */
    public static final class AnonymousClass12 extends SuspendLambda implements yHO<CoroutineScope, TypingIndicatorConfig, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass12(Continuation<? super AnonymousClass12> continuation) {
            super(3, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.yHO
        public final Object invoke(CoroutineScope coroutineScope, TypingIndicatorConfig typingIndicatorConfig, Continuation<? super Unit> continuation) {
            AnonymousClass12 anonymousClass12 = MessageListFragment.this.new AnonymousClass12(continuation);
            anonymousClass12.L$0 = typingIndicatorConfig;
            return anonymousClass12.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                TypingIndicatorConfig typingIndicatorConfig = (TypingIndicatorConfig) this.L$0;
                MessageListFragment.this.fIwbmz();
                if (typingIndicatorConfig == null) {
                    MessageListFragment.this.ejfBZ();
                    MessageListFragment.this.EZpvd((List<String>) yDY.AhwBna());
                    MessageListFragment.this.AYXKKw().KWHzl(false);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.messageV2.view.messagelist.MessageListFragment$initView$13, reason: invalid class name */
    public static final class AnonymousClass13 extends SuspendLambda implements yHO<CoroutineScope, OKConversation, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass13(Continuation<? super AnonymousClass13> continuation) {
            super(3, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.yHO
        public final Object invoke(CoroutineScope coroutineScope, OKConversation oKConversation, Continuation<? super Unit> continuation) {
            return MessageListFragment.this.new AnonymousClass13(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                MessageListFragment.this.fIwbmz();
                MessageListFragment.this.iwGUEr();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void fetchVPNInfo() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MessageListFragment$observeTypingIndicator$1(this, null), 3, null);
    }

    public final void fJNWhG() {
        Job job = this.zuBGHE;
        if (job == null || !job.isActive()) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            this.zuBGHE = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new MessageListFragment$startTypingTickerIfNeeded$1(this, null), 3, null);
        }
    }

    public final void EZpvd(List<String> list) {
        if (Intrinsics.EZpvd(list, this.ejfBZ)) {
            return;
        }
        this.ejfBZ = list;
        KWHzl(list);
    }

    public final void ejfBZ() {
        Job job = this.zuBGHE;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.zuBGHE = null;
    }

    public final void fIwbmz() {
        TypingIndicatorConfig value = getNewProxyInstance().uzCIH().getValue();
        OKConversation value2 = getNewProxyInstance().valueOf().getValue();
        AYXKKw().KWHzl(value, value2 != null ? value2.getConversationType() : null);
    }

    public final void KWHzl(List<String> list) {
        FragmentActivity activity = getActivity();
        ActivityC36573odX activityC36573odX = activity instanceof ActivityC36573odX ? (ActivityC36573odX) activity : null;
        if (activityC36573odX != null) {
            activityC36573odX.EZpvd(list);
        }
    }

    public final void iwGUEr() {
        boolean z = false;
        if (getNewProxyInstance().uzCIH().getValue() == null) {
            AYXKKw().KWHzl(false);
            return;
        }
        OKConversation value = getNewProxyInstance().valueOf().getValue();
        if ((value != null ? value.getConversationType() : null) == OKConversationType.PRIVATE && AYXKKw().AuCTel().getValue().booleanValue()) {
            z = true;
        }
        AYXKKw().KWHzl(z);
    }

    private final void AubY() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        FrameLayout frameLayout;
        AbstractC33902nKb abstractC33902nKb = this.AwvSrB;
        if (abstractC33902nKb != null && (frameLayout = abstractC33902nKb.copydefault) != null) {
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: o.olU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    MessageListFragment.OLrzqt(this.EZpvd, view);
                }
            });
        }
        AbstractC33902nKb abstractC33902nKb2 = this.AwvSrB;
        if (abstractC33902nKb2 != null && (recyclerView2 = abstractC33902nKb2.KWHzl) != null) {
            recyclerView2.setOnTouchListener(new View.OnTouchListener() { // from class: o.olZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    return MessageListFragment.AEQbTJ(this.EZpvd, view, motionEvent);
                }
            });
        }
        AbstractC33902nKb abstractC33902nKb3 = this.AwvSrB;
        if (abstractC33902nKb3 == null || (recyclerView = abstractC33902nKb3.KWHzl) == null) {
            return;
        }
        recyclerView.addOnScrollListener(new Activity());
    }

    public static final void OLrzqt(MessageListFragment messageListFragment, View view) {
        messageListFragment.AYXKKw().getFieldNames();
        messageListFragment.isConnected = false;
    }

    public static final boolean AEQbTJ(MessageListFragment messageListFragment, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            messageListFragment.AuCTel = true;
        } else if (actionMasked == 1 || actionMasked == 3) {
            messageListFragment.AuCTel = false;
            messageListFragment.KWHzl();
        }
        return false;
    }

    public static final class Activity extends RecyclerView.OnScrollListener {
        public Activity() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
            if (i2 < 0) {
                MessageListFragment.this.isConnected = true;
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Intrinsics.copydefault(layoutManager, "");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager.findLastVisibleItemPosition() >= linearLayoutManager.getItemCount() - 1 && !recyclerView.canScrollVertically(1)) {
                MessageListFragment.this.isConnected = false;
            }
            MessageListFragment.this.AhwBna();
            if (recyclerView.canScrollVertically(-1)) {
                return;
            }
            pUU.EZpvd(MessageListFragment.this.getTAG(), "loadMoreNewestMessages");
            MessageListFragment.this.AYXKKw().fARcdN();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrollStateChanged(recyclerView, i);
            if (i != 0 || MessageListFragment.this.AuCTel) {
                return;
            }
            MessageListFragment.this.KWHzl();
        }
    }

    public final void KWHzl() {
        RecyclerView recyclerView;
        AbstractC33902nKb abstractC33902nKb = this.AwvSrB;
        if (abstractC33902nKb == null || (recyclerView = abstractC33902nKb.KWHzl) == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || recyclerView.getScrollState() != 0 || this.AuCTel) {
            return;
        }
        int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        if (iFindFirstCompletelyVisibleItemPosition < 0 || iFindLastCompletelyVisibleItemPosition < 0) {
            return;
        }
        AYXKKw().AEQbTJ(iFindFirstCompletelyVisibleItemPosition, iFindLastCompletelyVisibleItemPosition);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.oJm.playAnimation$default(o.oJm, android.app.Activity, java.lang.String, kotlin.jvm.functions.Function0, int, java.lang.Object):void */
    public final void AEQbTJ(String str) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        C35944oJm.playAnimation$default(C35944oJm.OLrzqt, activity, str, null, 4, null);
    }

    public final void AuCTel() {
        final AbstractC33902nKb abstractC33902nKb = this.AwvSrB;
        if (abstractC33902nKb != null) {
            abstractC33902nKb.KWHzl.post(new Runnable() { // from class: o.ols
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    MessageListFragment.AEQbTJ(abstractC33902nKb);
                }
            });
        }
    }

    public static final void AEQbTJ(AbstractC33902nKb abstractC33902nKb) {
        RecyclerView.Adapter adapter = abstractC33902nKb.KWHzl.getAdapter();
        if (adapter != null) {
            adapter.notifyItemRangeChanged(0, adapter.getItemCount(), "PAYLOAD_UI_UPDATE");
        }
    }

    public final void AhwBna() {
        C36558odI c36558odIKWHzl;
        AbstractC33902nKb abstractC33902nKb = this.AwvSrB;
        if (abstractC33902nKb != null) {
            RecyclerView.LayoutManager layoutManager = abstractC33902nKb.KWHzl.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            if (linearLayoutManager.getItemCount() == 0) {
                OLrzqt(abstractC33902nKb);
                return;
            }
            MessageListViewModel.ActionBar value = AYXKKw().AhwBna().getValue();
            boolean z = (value == null || (c36558odIKWHzl = value.KWHzl()) == null || !c36558odIKWHzl.KWHzl()) ? false : true;
            boolean zCanScrollVertically = abstractC33902nKb.KWHzl.canScrollVertically(1);
            if ((this.isConnected || z) && zCanScrollVertically) {
                EZpvd(abstractC33902nKb);
            } else {
                OLrzqt(abstractC33902nKb);
            }
        }
    }

    public final void EZpvd(AbstractC33902nKb abstractC33902nKb) {
        if (abstractC33902nKb.copydefault.getVisibility() != 0) {
            abstractC33902nKb.copydefault.animate().alpha(1.0f).setDuration(300L).setListener(new StateListAnimator(abstractC33902nKb)).start();
        }
    }

    public static final class StateListAnimator extends AnimatorListenerAdapter {
        public final /* synthetic */ AbstractC33902nKb OLrzqt;

        public StateListAnimator(AbstractC33902nKb abstractC33902nKb) {
            this.OLrzqt = abstractC33902nKb;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.OLrzqt.copydefault.setVisibility(0);
        }
    }

    public final void OLrzqt(AbstractC33902nKb abstractC33902nKb) {
        FrameLayout frameLayout = abstractC33902nKb.copydefault;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        if (frameLayout.getVisibility() == 0) {
            abstractC33902nKb.copydefault.animate().alpha(0.0f).setDuration(300L).setListener(new ActionBar(abstractC33902nKb)).start();
        }
    }

    public static final class ActionBar extends AnimatorListenerAdapter {
        public final /* synthetic */ AbstractC33902nKb EZpvd;

        public ActionBar(AbstractC33902nKb abstractC33902nKb) {
            this.EZpvd = abstractC33902nKb;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.EZpvd.copydefault.setVisibility(4);
        }
    }

    public final void fARcdN() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MessageListFragment$retry$1(this, null), 3, null);
    }

    public final void AEQbTJ(MessageListViewModel.Application application) {
        if (application instanceof MessageListViewModel.Application.LoaderManager) {
            StringResource stringResourceOLrzqt = ((MessageListViewModel.Application.LoaderManager) application).OLrzqt();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C55326xho.toast$default(C36563odN.AEQbTJ(stringResourceOLrzqt, contextRequireContext), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            return;
        }
        if (application instanceof MessageListViewModel.Application.TaskDescription) {
            C36576oda c36576odaGEmmrt = gEmmrt();
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            MessageListViewModel.Application.TaskDescription taskDescription = (MessageListViewModel.Application.TaskDescription) application;
            c36576odaGEmmrt.AEQbTJ(contextRequireContext2, taskDescription.OLrzqt(), taskDescription.copydefault());
            return;
        }
        if (Intrinsics.EZpvd(application, MessageListViewModel.Application.ActionBar.copydefault)) {
            gEmmrt().valueOf();
            return;
        }
        if (Intrinsics.EZpvd(application, MessageListViewModel.Application.PendingIntent.AEQbTJ)) {
            gEmmrt().AhwBna();
            return;
        }
        if (application instanceof MessageListViewModel.Application.StateListAnimator) {
            Context contextRequireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
            EZpvd(contextRequireContext3, ((MessageListViewModel.Application.StateListAnimator) application).OLrzqt());
            return;
        }
        if (application instanceof MessageListViewModel.Application.Fragment) {
            Context contextRequireContext4 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "");
            AEQbTJ(contextRequireContext4, C33070mpX.AYXKKw(C35399nuc.LoaderManager.DxnCrt), C33070mpX.AYXKKw(C35399nuc.LoaderManager.DlABUU));
        } else if (application instanceof MessageListViewModel.Application.C0458Application) {
            Context contextRequireContext5 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext5, "");
            AEQbTJ(contextRequireContext5, C33070mpX.AYXKKw(C35399nuc.LoaderManager.isReflectionWorking), C33070mpX.AYXKKw(C35399nuc.LoaderManager.dNxZaP));
        } else {
            if (!Intrinsics.EZpvd(application, MessageListViewModel.Application.Activity.OLrzqt)) {
                throw new NoWhenBranchMatchedException();
            }
            C37068omp c37068omp = this.zLjUOn;
            if (c37068omp != null) {
                c37068omp.EZpvd(true);
            }
        }
    }

    private final void EZpvd(Context context, String str) {
        String strCopydefault = C33069mpW.copydefault(this, C35399nuc.LoaderManager.QVAiDq, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("user", str)));
        Dialog dialog = this.DbNXlk;
        if (dialog != null) {
            dialog.dismiss();
        }
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(strCopydefault);
        viewOnClickListenerC54939xaY.copydefault(C35399nuc.LoaderManager.QbewEr);
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C35399nuc.LoaderManager.DCUTEI, (View.OnClickListener) null, 2, (Object) null);
        this.DbNXlk = viewOnClickListenerC54939xaY;
        viewOnClickListenerC54939xaY.show();
    }

    public final void AEQbTJ(Context context, String str, String str2) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(str);
        viewOnClickListenerC54939xaY.EZpvd(str2);
        viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) C33070mpX.AYXKKw(C44105sDn.PendingIntent.EZpvd), new View.OnClickListener() { // from class: o.olY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                MessageListFragment.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    private final void gHZMYf() {
        getParentFragmentManager().setFragmentResultListener("KEY_REQUEST_BANNER_HEIGHT_CHANGED", this, new FragmentResultListener() { // from class: o.oln
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                MessageListFragment.KWHzl(this.EZpvd, str, bundle);
            }
        });
    }

    public static final void KWHzl(MessageListFragment messageListFragment, String str, Bundle bundle) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        int i = bundle.getInt("KEY_BANNER_HEIGHT", 0);
        AbstractC33902nKb abstractC33902nKb = messageListFragment.AwvSrB;
        if (abstractC33902nKb == null || (recyclerView = abstractC33902nKb.KWHzl) == null) {
            return;
        }
        recyclerView.setPadding(recyclerView.getPaddingLeft(), i, recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
    }

    public final <T> ArrayList<T> AEQbTJ(@NotNull ListIterator<? extends T> listIterator) {
        Intrinsics.checkNotNullParameter(listIterator, "");
        ArrayList<T> arrayList = new ArrayList<>();
        while (listIterator.hasNext()) {
            arrayList.add(listIterator.next());
        }
        return arrayList;
    }
}
