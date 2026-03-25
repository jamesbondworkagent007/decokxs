package o;

import androidx.core.os.BundleKt;
import com.google.common.annotations.VisibleForTesting;
import com.okinc.core.util.SPUtils;
import com.okinc.im.bean.ChatOrigin;
import com.okinc.im.config.ImEnabledStatus;
import com.okinc.im.imui.conversationlist.ConversationListJumper$checkMessageCenterNavigationResultAsync$2;
import com.okinc.im.imui.conversationlist.ConversationListJumper$observeMessageCenterNavigationResult$$inlined$flatMapLatest$1;
import com.okinc.im.imui.conversationlist.ConversationListJumper$observeMessageCenterNavigationResult$3;
import com.okinc.im.imui.conversationlist.ConversationListJumper$observeMessageCenterNavigationResult$lambda$6$$inlined$map$1$2$1;
import com.okinc.im.imui.conversationlist.ConversationListJumper$observeMessageCenterNavigationResult$lambda$6$$inlined$map$2$2$1;
import com.okinc.im.imui.conversationlist.ConversationListJumper$startMessageCenterAsync$1;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.MessageCenterNavigation;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.InterfaceC33171mrS;
import o.rXT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nFz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33791nFz {
    public static final MutableSharedFlow<Unit> OLrzqt;
    public static final int copydefault;
    public static final C33791nFz KWHzl = new C33791nFz();
    public static final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.nFA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C33791nFz.KWHzl();
        }
    });
    public static final AtomicReference<java.lang.Boolean> AEQbTJ = new AtomicReference<>(null);

    /* JADX INFO: renamed from: o.nFz$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MessageCenterNavigation.values().length];
            try {
                iArr[MessageCenterNavigation.IM.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[MessageCenterNavigation.Notification.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageCenterNavigation.Invalid.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    private C33791nFz() {
    }

    /* JADX INFO: renamed from: o.nFz$Application */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Application implements Flow<java.lang.Boolean> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.nFz$Application$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ConversationListJumper$observeMessageCenterNavigationResult$lambda$6$$inlined$map$1$2$1 conversationListJumper$observeMessageCenterNavigationResult$lambda$6$$inlined$map$1$2$1;
                if (continuation instanceof ConversationListJumper$observeMessageCenterNavigationResult$lambda$6$$inlined$map$1$2$1) {
                    conversationListJumper$observeMessageCenterNavigationResult$lambda$6$$inlined$map$1$2$1 = (ConversationListJumper$observeMessageCenterNavigationResult$lambda$6$$inlined$map$1$2$1) continuation;
                    int i = conversationListJumper$observeMessageCenterNavigationResult$lambda$6$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        conversationListJumper$observeMessageCenterNavigationResult$lambda$6$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        conversationListJumper$observeMessageCenterNavigationResult$lambda$6$$inlined$map$1$2$1 = new ConversationListJumper$observeMessageCenterNavigationResult$lambda$6$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = conversationListJumper$observeMessageCenterNavigationResult$lambda$6$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = conversationListJumper$observeMessageCenterNavigationResult$lambda$6$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(((java.lang.Number) obj).intValue() > 0);
                    conversationListJumper$observeMessageCenterNavigationResult$lambda$6$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(boolKWHzl, conversationListJumper$observeMessageCenterNavigationResult$lambda$6$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Application(Flow flow) {
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.lang.Boolean> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.nFz$TaskDescription */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class TaskDescription implements Flow<MessageCenterNavigation> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ boolean KWHzl;

        /* JADX INFO: renamed from: o.nFz$TaskDescription$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;
            public final /* synthetic */ boolean OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, boolean z) {
                this.EZpvd = flowCollector;
                this.OLrzqt = z;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ConversationListJumper$observeMessageCenterNavigationResult$lambda$6$$inlined$map$2$2$1 conversationListJumper$observeMessageCenterNavigationResult$lambda$6$$inlined$map$2$2$1;
                if (continuation instanceof ConversationListJumper$observeMessageCenterNavigationResult$lambda$6$$inlined$map$2$2$1) {
                    conversationListJumper$observeMessageCenterNavigationResult$lambda$6$$inlined$map$2$2$1 = (ConversationListJumper$observeMessageCenterNavigationResult$lambda$6$$inlined$map$2$2$1) continuation;
                    int i = conversationListJumper$observeMessageCenterNavigationResult$lambda$6$$inlined$map$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        conversationListJumper$observeMessageCenterNavigationResult$lambda$6$$inlined$map$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        conversationListJumper$observeMessageCenterNavigationResult$lambda$6$$inlined$map$2$2$1 = new ConversationListJumper$observeMessageCenterNavigationResult$lambda$6$$inlined$map$2$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = conversationListJumper$observeMessageCenterNavigationResult$lambda$6$$inlined$map$2$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = conversationListJumper$observeMessageCenterNavigationResult$lambda$6$$inlined$map$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                    C33791nFz c33791nFz = C33791nFz.KWHzl;
                    MessageCenterNavigation messageCenterNavigationKWHzl = c33791nFz.KWHzl(this.OLrzqt, C56443yFo.KWHzl(zBooleanValue));
                    SPUtils.put(c33791nFz.copydefault(), messageCenterNavigationKWHzl.name());
                    conversationListJumper$observeMessageCenterNavigationResult$lambda$6$$inlined$map$2$2$1.label = 1;
                    if (flowCollector.emit(messageCenterNavigationKWHzl, conversationListJumper$observeMessageCenterNavigationResult$lambda$6$$inlined$map$2$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public TaskDescription(Flow flow, boolean z) {
            this.AEQbTJ = flow;
            this.KWHzl = z;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super MessageCenterNavigation> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass3(flowCollector, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    static {
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        mutableSharedFlowMutableSharedFlow$default.tryEmit(Unit.INSTANCE);
        OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        copydefault = 8;
    }

    public final java.lang.String copydefault() {
        return (java.lang.String) EZpvd.getValue();
    }

    public static final java.lang.String KWHzl() {
        return "key_im_navigation_result_" + C44157sFk.EZpvd();
    }

    public static /* synthetic */ void startMessageCenter$default(C33791nFz c33791nFz, android.content.Context context, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        c33791nFz.copydefault(context, str, z);
    }

    public final void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("ConversationListJumper", "startMessageCenter: origin=" + str + ", allowRedirectToNotificationCenter=" + z);
        int i = Activity.AEQbTJ[checkMessageCenterNavigationResult$default(this, z, null, 2, null).ordinal()];
        if (i == 1) {
            pUU.KWHzl("ConversationListJumper", "Start navigate to conversation list");
            navigateToConversationList$default(this, context, null, 2, null);
        } else if (i == 2) {
            pUU.KWHzl("ConversationListJumper", "Start navigate to notification center");
            EZpvd(context);
        } else {
            if (i == 3) {
                pUU.KWHzl("ConversationListJumper", "No navigation available");
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static /* synthetic */ java.lang.Object startMessageCenterAsync$default(C33791nFz c33791nFz, android.content.Context context, java.lang.String str, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return c33791nFz.copydefault(context, str, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, boolean z, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        ConversationListJumper$startMessageCenterAsync$1 conversationListJumper$startMessageCenterAsync$1;
        C33791nFz c33791nFz;
        if (continuation instanceof ConversationListJumper$startMessageCenterAsync$1) {
            conversationListJumper$startMessageCenterAsync$1 = (ConversationListJumper$startMessageCenterAsync$1) continuation;
            int i = conversationListJumper$startMessageCenterAsync$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                conversationListJumper$startMessageCenterAsync$1.label = i - Integer.MIN_VALUE;
            } else {
                conversationListJumper$startMessageCenterAsync$1 = new ConversationListJumper$startMessageCenterAsync$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = conversationListJumper$startMessageCenterAsync$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = conversationListJumper$startMessageCenterAsync$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            pUU.KWHzl("ConversationListJumper", "startMessageCenterAsync: origin=" + str + ", allowRedirectToNotificationCenter=" + z);
            conversationListJumper$startMessageCenterAsync$1.L$0 = this;
            conversationListJumper$startMessageCenterAsync$1.L$1 = context;
            conversationListJumper$startMessageCenterAsync$1.label = 1;
            objEZpvd = EZpvd(z, conversationListJumper$startMessageCenterAsync$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c33791nFz = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = (android.content.Context) conversationListJumper$startMessageCenterAsync$1.L$1;
            c33791nFz = (C33791nFz) conversationListJumper$startMessageCenterAsync$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        int i3 = Activity.AEQbTJ[((MessageCenterNavigation) objEZpvd).ordinal()];
        if (i3 == 1) {
            pUU.KWHzl("ConversationListJumper", "Start navigate to conversation list");
            navigateToConversationList$default(c33791nFz, context, null, 2, null);
        } else if (i3 == 2) {
            pUU.KWHzl("ConversationListJumper", "Start navigate to notification center");
            c33791nFz.EZpvd(context);
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            pUU.KWHzl("ConversationListJumper", "No navigation available");
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ MessageCenterNavigation checkMessageCenterNavigationResult$default(C33791nFz c33791nFz, boolean z, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        return c33791nFz.KWHzl(z, bool);
    }

    public final MessageCenterNavigation KWHzl(boolean z, java.lang.Boolean bool) {
        boolean zBooleanValue;
        if (bool != null || (bool = AEQbTJ.get()) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            pUU.EZpvd("ConversationListJumper", "checkMessageCenterNavigationResult: No cached conversation data, using conservative default (false)");
            zBooleanValue = false;
        }
        oGU ogu = oGU.KWHzl;
        ImEnabledStatus imEnabledStatusAEQbTJ = ogu.AEQbTJ();
        C35273nsH c35273nsH = C35273nsH.KWHzl;
        boolean zCopydefault = c35273nsH.copydefault();
        if (oGU.isInPlanetMode$default(ogu, null, 1, null) && z) {
            pUU.KWHzl("ConversationListJumper", "checkMessageCenterNavigationResult: Planet Mode -> Notification");
            return MessageCenterNavigation.Notification;
        }
        if (oGU.isInPlanetMode$default(ogu, null, 1, null) && C44157sFk.gEmmrt().DbNXlk()) {
            pUU.KWHzl("ConversationListJumper", "checkMessageCenterNavigationResult: Planet Mode, Login Sub-Account");
            return MessageCenterNavigation.IM;
        }
        if (zCopydefault && imEnabledStatusAEQbTJ == ImEnabledStatus.Full) {
            pUU.KWHzl("ConversationListJumper", "checkMessageCenterNavigationResult: IM Full Access -> IM");
            return MessageCenterNavigation.IM;
        }
        if (zCopydefault && imEnabledStatusAEQbTJ == ImEnabledStatus.Limited && zBooleanValue) {
            pUU.KWHzl("ConversationListJumper", "checkMessageCenterNavigationResult: IM Limited Access with conversations -> IM");
            return MessageCenterNavigation.IM;
        }
        if (z && c35273nsH.AEQbTJ()) {
            pUU.KWHzl("ConversationListJumper", "checkMessageCenterNavigationResult: Fallback -> Notification");
            return MessageCenterNavigation.Notification;
        }
        pUU.KWHzl("ConversationListJumper", "checkMessageCenterNavigationResult: Invalid navigation state");
        return MessageCenterNavigation.Invalid;
    }

    public static /* synthetic */ java.lang.Object checkMessageCenterNavigationResultAsync$default(C33791nFz c33791nFz, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c33791nFz.EZpvd(z, continuation);
    }

    public final java.lang.Object EZpvd(boolean z, @NotNull Continuation<? super MessageCenterNavigation> continuation) {
        return BuildersKt.withContext(sDN.copydefault.copydefault(), new ConversationListJumper$checkMessageCenterNavigationResultAsync$2(z, null), continuation);
    }

    public static /* synthetic */ Flow observeMessageCenterNavigationResult$default(C33791nFz c33791nFz, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c33791nFz.OLrzqt(z);
    }

    public final Flow<MessageCenterNavigation> OLrzqt(boolean z) {
        C43248rlh.KWHzl.EZpvd(InterfaceC31422lti.class, new Function1() { // from class: o.nFF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33791nFz.KWHzl((InterfaceC31422lti) obj);
            }
        });
        return FlowKt.onEach(FlowKt.distinctUntilChanged(FlowKt.transformLatest(OLrzqt, new ConversationListJumper$observeMessageCenterNavigationResult$$inlined$flatMapLatest$1(null, z))), new ConversationListJumper$observeMessageCenterNavigationResult$3(z, null));
    }

    public static final Unit KWHzl(InterfaceC31422lti interfaceC31422lti) {
        Intrinsics.checkNotNullParameter(interfaceC31422lti, "");
        MutableSharedFlow<Unit> mutableSharedFlow = OLrzqt;
        Unit unit = Unit.INSTANCE;
        mutableSharedFlow.tryEmit(unit);
        return unit;
    }

    public static /* synthetic */ void startMessageCenter$default(C33791nFz c33791nFz, android.content.Context context, ChatOrigin chatOrigin, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        c33791nFz.OLrzqt(context, chatOrigin, z);
    }

    public final void OLrzqt(@NotNull android.content.Context context, @NotNull ChatOrigin chatOrigin, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(chatOrigin, "");
        copydefault(context, chatOrigin.getValue(), z);
    }

    @VisibleForTesting
    public final void EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        rXT rxt = (rXT) C43251rlk.OLrzqt(rXT.class);
        android.content.Intent intentBuildNotificationCenterIntent$default = rxt != null ? rXT.StateListAnimator.buildNotificationCenterIntent$default(rxt, context, null, null, 4, null) : null;
        if (intentBuildNotificationCenterIntent$default != null) {
            context.startActivity(intentBuildNotificationCenterIntent$default);
        }
    }

    public static /* synthetic */ void navigateToConversationList$default(C33791nFz c33791nFz, android.content.Context context, ChatOrigin chatOrigin, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            chatOrigin = null;
        }
        c33791nFz.AEQbTJ(context, chatOrigin);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.oGU.isInPlanetMode$default(o.oGU, com.okinc.im.bean.ChatOrigin, int, java.lang.Object):boolean */
    public final void AEQbTJ(@NotNull android.content.Context context, ChatOrigin chatOrigin) {
        Intrinsics.checkNotNullParameter(context, "");
        oGU ogu = oGU.KWHzl;
        if (oGU.isInPlanetMode$default(ogu, null, 1, null)) {
            ((tWL) C43251rlk.copydefault(tWL.class)).copydefault(context);
            return;
        }
        if (!C35273nsH.KWHzl.copydefault()) {
            pUU.KWHzl("ConversationListJumper", "navigation is not allowed, chatOrigin:" + chatOrigin);
            return;
        }
        if (ogu.KWHzl()) {
            AEQbTJ(context);
        } else {
            copydefault(context, chatOrigin);
        }
    }

    public static /* synthetic */ void startConversationListActivity$default(C33791nFz c33791nFz, android.content.Context context, ChatOrigin chatOrigin, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            chatOrigin = null;
        }
        c33791nFz.copydefault(context, chatOrigin);
    }

    @VisibleForTesting
    public final void copydefault(@NotNull android.content.Context context, ChatOrigin chatOrigin) {
        Intrinsics.checkNotNullParameter(context, "");
        pUU.KWHzl("ConversationListJumper", "startConversationListActivity execute...");
        context.startActivity(nEC.Companion.AEQbTJ(context, chatOrigin != null ? chatOrigin.getValue() : null));
    }

    @VisibleForTesting
    public final void AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        pUU.KWHzl("ConversationListJumper", "navigateToConversationTabInPayMode execute...");
        InterfaceC33171mrS.Activity.switchToAppMode$default((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class), context, 5, false, 2, BundleKt.bundleOf(C56390yDp.OLrzqt("im_tab_type", java.lang.Boolean.TRUE)), null, 32, null);
    }
}
