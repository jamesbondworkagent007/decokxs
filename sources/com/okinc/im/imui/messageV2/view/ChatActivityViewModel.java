package com.okinc.im.imui.messageV2.view;

import android.view.MenuItem;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.bean.ChatOrigin;
import com.okinc.im.config.page.IMPageType;
import com.okinc.im.config.serviceprovider.GeneralAction;
import com.okinc.im.imui.messageV2.view.ChatActivityViewModel;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.feature.agentbot.model.enums.AgentBotEntryInfo;
import com.okinc.okimcore.feature.config.TypingIndicatorConfig;
import com.okinc.okimcore.feature.user.repository.remote.inhouseim.InHouseIMUserService;
import com.okinc.okimcore.model.im.GroupSystemMessage;
import com.okinc.okimcore.model.im.MessengerConnectionStatus;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKCustomMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.UpdateGroupAvatarMessage;
import com.okinc.okimcore.model.im.UpdateGroupNameMessage;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.remote.InHouseUserConfigDto;
import com.okinc.okimcore.model.remote.InHouseUserInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.remote.TypingIndicatorConfigDto;
import com.okinc.okimcore.model.room.inhouseim.DraftMentionedStringRangeInfoModel;
import com.okinc.okimcore.model.room.inhouseim.DraftMessageModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.AbstractC35351ntg;
import o.C32866mlf;
import o.C32989mnw;
import o.C33129mqd;
import o.C35285nsT;
import o.C35341ntW;
import o.C35399nuc;
import o.C35863oGm;
import o.C36407oaQ;
import o.C36601odz;
import o.C36644oep;
import o.C37708oyt;
import o.C37721ozF;
import o.C44157sFk;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC37705oyq;
import o.oCI;
import o.oCN;
import o.oCU;
import o.oDA;
import o.oDI;
import o.oFI;
import o.oFJ;
import o.oFK;
import o.oFL;
import o.oFN;
import o.oFO;
import o.oFS;
import o.oGM;
import o.pUU;
import o.sDN;
import o.sFG;
import o.sFH;
import o.sKH;
import o.sNN;
import o.yCL;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class ChatActivityViewModel extends AbstractC33073mpa {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final MutableSharedFlow<Unit> AEQbTJ;
    public final StateFlow<RelationInfo> AYXKKw;
    public final StateFlow<C35285nsT> AhwBna;
    public DraftMessageModel AkhnZx;
    public final sFG AuCTel;
    public final oFK AuCTelauCTel;
    public final oCI AubY;
    public final StateFlow<C35285nsT> AwvSrB;
    public final C35863oGm AxsJAY;
    public final StateFlow<String> DTwDnp;
    public final oCN DbNXlk;
    public final MutableLiveData<C32989mnw<Activity>> EZpvd;
    public final MutableLiveData<C32989mnw<GeneralAction>> OLrzqt;
    public final StateFlow<Integer> ORxRYg;
    public final SavedStateHandle OcIXYQ;
    public final StateFlow<oFS> QKVWgx;
    public final oCU QOLQEE;
    public final C37708oyt QbewEr;
    public final StateFlow<TypingIndicatorConfig> QfsBiF;
    public final StateFlow<AbstractC35351ntg> RJOkX;
    public final StateFlow<String> copydefault;
    public final StateFlow<OKConversation> djBIcL;
    public final StateFlow<GroupInfo> ejfBZ;
    public final InHouseIMUserService fARcdN;
    public final oFI fIwbmz;
    public final SharedFlow<Unit> fJNWhG;
    public final oFJ fetchVPNInfo;
    public final MutableSharedFlow<Unit> gEmmrt;
    public final oFN gHZMYf;
    public final StateFlow<Boolean> getFieldNames;
    public final StateFlow<Boolean> getNewProxyInstance;
    public final StateFlow<MenuProvider> hDKMBd;
    public final oGM isConnected;
    public final StateFlow<Boolean> iwGUEr;
    public final StateFlow<IMPageType> sSMYrx;
    public final StateFlow<Boolean> uzCIH;
    public final MutableStateFlow<TypingIndicatorConfig> valueOf;
    public final oDA values;
    public final sKH wlaJM;
    public final oFO zLjUOn;
    public final oDI zsXlph;
    public final oFL zuBGHE;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[IMPageType.values().length];
            try {
                iArr[IMPageType.OTC_AGENT_BOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableSharedFlow<Unit> AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DraftMessageModel AkhnZx() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Activity>> AuCTel() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> AuCTelauCTel() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> AubY() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<oFS> ejfBZ() {
        return this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C35285nsT> fARcdN() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<IMPageType> fIwbmz() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<MenuProvider> fJNWhG() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<GroupInfo> fetchVPNInfo() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> getNewProxyInstance() {
        return this.DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Integer> hDKMBd() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> isConnected() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC35351ntg> iwGUEr() {
        return this.RJOkX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<TypingIndicatorConfig> uzCIH() {
        return this.QfsBiF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<OKConversation> valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<GeneralAction>> values() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> wlaJM() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> zsXlph() {
        return this.uzCIH;
    }

    public static final class Dialog implements Flow<Boolean> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: com.okinc.im.imui.messageV2.view.ChatActivityViewModel$Dialog$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                ChatActivityViewModel$buildWebSocketConnectionStatusFlow$$inlined$map$1$2$1 chatActivityViewModel$buildWebSocketConnectionStatusFlow$$inlined$map$1$2$1;
                if (continuation instanceof ChatActivityViewModel$buildWebSocketConnectionStatusFlow$$inlined$map$1$2$1) {
                    chatActivityViewModel$buildWebSocketConnectionStatusFlow$$inlined$map$1$2$1 = (ChatActivityViewModel$buildWebSocketConnectionStatusFlow$$inlined$map$1$2$1) continuation;
                    int i = chatActivityViewModel$buildWebSocketConnectionStatusFlow$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        chatActivityViewModel$buildWebSocketConnectionStatusFlow$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        chatActivityViewModel$buildWebSocketConnectionStatusFlow$$inlined$map$1$2$1 = new ChatActivityViewModel$buildWebSocketConnectionStatusFlow$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = chatActivityViewModel$buildWebSocketConnectionStatusFlow$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = chatActivityViewModel$buildWebSocketConnectionStatusFlow$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    Boolean boolKWHzl = C56443yFo.KWHzl(((MessengerConnectionStatus) obj) == MessengerConnectionStatus.Connected);
                    chatActivityViewModel$buildWebSocketConnectionStatusFlow$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(boolKWHzl, chatActivityViewModel$buildWebSocketConnectionStatusFlow$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Dialog(Flow flow) {
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
            Object objCollect = this.AEQbTJ.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class FragmentManager implements Flow<Pair<? extends String, ? extends Boolean>> {
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: com.okinc.im.imui.messageV2.view.ChatActivityViewModel$FragmentManager$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                ChatActivityViewModel$observeAgentBotSessionEnd$$inlined$filter$1$2$1 chatActivityViewModel$observeAgentBotSessionEnd$$inlined$filter$1$2$1;
                if (continuation instanceof ChatActivityViewModel$observeAgentBotSessionEnd$$inlined$filter$1$2$1) {
                    chatActivityViewModel$observeAgentBotSessionEnd$$inlined$filter$1$2$1 = (ChatActivityViewModel$observeAgentBotSessionEnd$$inlined$filter$1$2$1) continuation;
                    int i = chatActivityViewModel$observeAgentBotSessionEnd$$inlined$filter$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        chatActivityViewModel$observeAgentBotSessionEnd$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        chatActivityViewModel$observeAgentBotSessionEnd$$inlined$filter$1$2$1 = new ChatActivityViewModel$observeAgentBotSessionEnd$$inlined$filter$1$2$1(this, continuation);
                    }
                }
                Object obj2 = chatActivityViewModel$observeAgentBotSessionEnd$$inlined$filter$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = chatActivityViewModel$observeAgentBotSessionEnd$$inlined$filter$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    Pair pair = (Pair) obj;
                    String str = (String) pair.component1();
                    boolean zBooleanValue = ((Boolean) pair.component2()).booleanValue();
                    pUU.KWHzl("ChatActivityViewModel", "isAgentBot: " + zBooleanValue + " for channelId: " + str);
                    if (zBooleanValue) {
                        chatActivityViewModel$observeAgentBotSessionEnd$$inlined$filter$1$2$1.label = 1;
                        if (flowCollector.emit(obj, chatActivityViewModel$observeAgentBotSessionEnd$$inlined$filter$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public FragmentManager(Flow flow) {
            this.KWHzl = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Pair<? extends String, ? extends Boolean>> flowCollector, Continuation continuation) {
            Object objCollect = this.KWHzl.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class LoaderManager implements Flow<OKMessage> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: com.okinc.im.imui.messageV2.view.ChatActivityViewModel$LoaderManager$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                ChatActivityViewModel$monitorAgentBotSessionEnd$$inlined$filter$1$2$1 chatActivityViewModel$monitorAgentBotSessionEnd$$inlined$filter$1$2$1;
                if (continuation instanceof ChatActivityViewModel$monitorAgentBotSessionEnd$$inlined$filter$1$2$1) {
                    chatActivityViewModel$monitorAgentBotSessionEnd$$inlined$filter$1$2$1 = (ChatActivityViewModel$monitorAgentBotSessionEnd$$inlined$filter$1$2$1) continuation;
                    int i = chatActivityViewModel$monitorAgentBotSessionEnd$$inlined$filter$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        chatActivityViewModel$monitorAgentBotSessionEnd$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        chatActivityViewModel$monitorAgentBotSessionEnd$$inlined$filter$1$2$1 = new ChatActivityViewModel$monitorAgentBotSessionEnd$$inlined$filter$1$2$1(this, continuation);
                    }
                }
                Object obj2 = chatActivityViewModel$monitorAgentBotSessionEnd$$inlined$filter$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = chatActivityViewModel$monitorAgentBotSessionEnd$$inlined$filter$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    OKMessageContent content = ((OKMessage) obj).getContent();
                    if ((content instanceof OKCustomMessage) && Intrinsics.EZpvd((Object) ((OKCustomMessage) content).getBizName(), (Object) "SESSION_END")) {
                        chatActivityViewModel$monitorAgentBotSessionEnd$$inlined$filter$1$2$1.label = 1;
                        if (flowCollector.emit(obj, chatActivityViewModel$monitorAgentBotSessionEnd$$inlined$filter$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public LoaderManager(Flow flow) {
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super OKMessage> flowCollector, Continuation continuation) {
            Object objCollect = this.AEQbTJ.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class TaskDescription implements Flow<MenuProvider> {
        public final /* synthetic */ ChatActivityViewModel EZpvd;
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: com.okinc.im.imui.messageV2.view.ChatActivityViewModel$TaskDescription$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;
            public final /* synthetic */ ChatActivityViewModel KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, ChatActivityViewModel chatActivityViewModel) {
                this.EZpvd = flowCollector;
                this.KWHzl = chatActivityViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                ChatActivityViewModel$buildMenuProviderFlow$lambda$18$$inlined$map$1$2$1 chatActivityViewModel$buildMenuProviderFlow$lambda$18$$inlined$map$1$2$1;
                if (continuation instanceof ChatActivityViewModel$buildMenuProviderFlow$lambda$18$$inlined$map$1$2$1) {
                    chatActivityViewModel$buildMenuProviderFlow$lambda$18$$inlined$map$1$2$1 = (ChatActivityViewModel$buildMenuProviderFlow$lambda$18$$inlined$map$1$2$1) continuation;
                    int i = chatActivityViewModel$buildMenuProviderFlow$lambda$18$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        chatActivityViewModel$buildMenuProviderFlow$lambda$18$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        chatActivityViewModel$buildMenuProviderFlow$lambda$18$$inlined$map$1$2$1 = new ChatActivityViewModel$buildMenuProviderFlow$lambda$18$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = chatActivityViewModel$buildMenuProviderFlow$lambda$18$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = chatActivityViewModel$buildMenuProviderFlow$lambda$18$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    MenuProvider menuProvider = (MenuProvider) obj;
                    pUU.KWHzl("ChatActivityViewModel", "observePageMenuProvider changed: " + menuProvider);
                    C36601odz c36601odz = new C36601odz(menuProvider);
                    c36601odz.KWHzl(this.KWHzl.new ActionBar());
                    chatActivityViewModel$buildMenuProviderFlow$lambda$18$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(c36601odz, chatActivityViewModel$buildMenuProviderFlow$lambda$18$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public TaskDescription(Flow flow, ChatActivityViewModel chatActivityViewModel) {
            this.copydefault = flow;
            this.EZpvd = chatActivityViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super MenuProvider> flowCollector, Continuation continuation) {
            Object objCollect = this.copydefault.collect(new AnonymousClass4(flowCollector, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @yCM
    public ChatActivityViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull oCI oci, @NotNull C35863oGm c35863oGm, @NotNull oGM ogm, @NotNull oFI ofi, @NotNull oFJ ofj, @NotNull oFL ofl, @NotNull oFK ofk, @NotNull oFO ofo, @NotNull oFN ofn, @NotNull oDI odi, @NotNull sKH skh, @yCL(AEQbTJ = "TrackerChatActivityViewModel") @NotNull C37708oyt c37708oyt, @NotNull oCU ocu, @NotNull oCN ocn, @NotNull sFG sfg, @NotNull oDA oda, @NotNull InHouseIMUserService inHouseIMUserService) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(oci, "");
        Intrinsics.checkNotNullParameter(c35863oGm, "");
        Intrinsics.checkNotNullParameter(ogm, "");
        Intrinsics.checkNotNullParameter(ofi, "");
        Intrinsics.checkNotNullParameter(ofj, "");
        Intrinsics.checkNotNullParameter(ofl, "");
        Intrinsics.checkNotNullParameter(ofk, "");
        Intrinsics.checkNotNullParameter(ofo, "");
        Intrinsics.checkNotNullParameter(ofn, "");
        Intrinsics.checkNotNullParameter(odi, "");
        Intrinsics.checkNotNullParameter(skh, "");
        Intrinsics.checkNotNullParameter(c37708oyt, "");
        Intrinsics.checkNotNullParameter(ocu, "");
        Intrinsics.checkNotNullParameter(ocn, "");
        Intrinsics.checkNotNullParameter(sfg, "");
        Intrinsics.checkNotNullParameter(oda, "");
        Intrinsics.checkNotNullParameter(inHouseIMUserService, "");
        this.OcIXYQ = savedStateHandle;
        this.AubY = oci;
        this.AxsJAY = c35863oGm;
        this.isConnected = ogm;
        this.fIwbmz = ofi;
        this.fetchVPNInfo = ofj;
        this.zuBGHE = ofl;
        this.AuCTelauCTel = ofk;
        this.zLjUOn = ofo;
        this.gHZMYf = ofn;
        this.zsXlph = odi;
        this.wlaJM = skh;
        this.QbewEr = c37708oyt;
        this.QOLQEE = ocu;
        this.DbNXlk = ocn;
        this.AuCTel = sfg;
        this.values = oda;
        this.fARcdN = inHouseIMUserService;
        this.OLrzqt = new MutableLiveData<>();
        this.gEmmrt = C37721ozF.copydefault();
        this.EZpvd = new MutableLiveData<>();
        this.copydefault = savedStateHandle.getStateFlow("key_channel_id", null);
        StateFlow<IMPageType> stateFlow = savedStateHandle.getStateFlow("key_page_type", null);
        this.sSMYrx = stateFlow;
        Flow flowMapLatest = FlowKt.mapLatest(stateFlow, new ChatActivityViewModel$_pageConfig$1(this, null));
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        StateFlow<C35285nsT> stateFlowStateIn = FlowKt.stateIn(flowMapLatest, viewModelScope, companion.getEagerly(), null);
        this.AhwBna = stateFlowStateIn;
        this.AwvSrB = stateFlowStateIn;
        this.djBIcL = EZpvd();
        this.AYXKKw = createChannelIdFlow$default(this, new Function1() { // from class: o.oem
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChatActivityViewModel.OLrzqt(this.EZpvd, (java.lang.String) obj);
            }
        }, null, null, 4, null);
        StateFlow<GroupInfo> stateFlowCreateChannelIdFlow$default = createChannelIdFlow$default(this, new Function1() { // from class: o.oen
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChatActivityViewModel.valueOf(this.copydefault, (java.lang.String) obj);
            }
        }, null, null, 4, null);
        this.ejfBZ = stateFlowCreateChannelIdFlow$default;
        Function1 function1 = new Function1() { // from class: o.oel
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(ChatActivityViewModel.KWHzl((C35285nsT) obj));
            }
        };
        Boolean bool = Boolean.FALSE;
        StateFlow<Boolean> stateFlowCreatePageConfigFlow$default = createPageConfigFlow$default(this, function1, bool, null, 4, null);
        this.getFieldNames = stateFlowCreatePageConfigFlow$default;
        this.uzCIH = createPageConfigFlow$default(this, new Function1() { // from class: o.oek
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(ChatActivityViewModel.AYXKKw((C35285nsT) obj));
            }
        }, Boolean.TRUE, null, 4, null);
        this.iwGUEr = createPageConfigFlow$default(this, new Function1() { // from class: o.oeo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(ChatActivityViewModel.copydefault((C35285nsT) obj));
            }
        }, bool, null, 4, null);
        MutableSharedFlow<Unit> mutableSharedFlowAEQbTJ = C37721ozF.AEQbTJ();
        this.AEQbTJ = mutableSharedFlowAEQbTJ;
        this.fJNWhG = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ);
        this.hDKMBd = FlowKt.stateIn(copydefault(), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), null);
        this.DTwDnp = FlowKt.stateIn(AEQbTJ(), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), "");
        this.QKVWgx = FlowKt.stateIn(KWHzl(), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), null);
        this.RJOkX = FlowKt.stateIn(OLrzqt(), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), null);
        this.ORxRYg = FlowKt.stateIn(FlowKt.distinctUntilChanged(FlowKt.combine(stateFlowCreateChannelIdFlow$default, stateFlowCreatePageConfigFlow$default, new ChatActivityViewModel$toolBarMemberCount$1(null))), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), null);
        this.getNewProxyInstance = FlowKt.stateIn(djBIcL(), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), bool);
        MutableStateFlow<TypingIndicatorConfig> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.valueOf = MutableStateFlow;
        this.QfsBiF = MutableStateFlow;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public static /* synthetic */ void setDraftMessageModel$default(ChatActivityViewModel chatActivityViewModel, DraftMessageModel draftMessageModel, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        chatActivityViewModel.copydefault(draftMessageModel, z);
    }

    public final void copydefault(DraftMessageModel draftMessageModel, boolean z) {
        this.AkhnZx = draftMessageModel;
        pUU.KWHzl("ChatActivityViewModel", "setDraftMessageModel: " + draftMessageModel);
        if (z) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatActivityViewModel$setDraftMessageModel$1(this, draftMessageModel, null), 3, null);
        }
    }

    public final List<C36407oaQ> DbNXlk() {
        List<DraftMentionedStringRangeInfoModel> mentionedInfo;
        DraftMessageModel draftMessageModel = this.AkhnZx;
        if (draftMessageModel == null || (mentionedInfo = draftMessageModel.getMentionedInfo()) == null) {
            return yDY.AhwBna();
        }
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(mentionedInfo, 10));
        for (DraftMentionedStringRangeInfoModel draftMentionedStringRangeInfoModel : mentionedInfo) {
            arrayList.add(new C36407oaQ(draftMentionedStringRangeInfoModel.getUserId(), draftMentionedStringRangeInfoModel.getDisplayName(), draftMentionedStringRangeInfoModel.getSendName(), draftMentionedStringRangeInfoModel.getRangeLocation(), draftMentionedStringRangeInfoModel.getRangeLocation() + 1 + draftMentionedStringRangeInfoModel.getDisplayName().length()));
        }
        return arrayList;
    }

    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.messageV2.view.ChatActivityViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.messageV2.view.ChatActivityViewModel$Activity$Activity, reason: collision with other inner class name */
        public static final class C0455Activity extends Activity {
            public final String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0455Activity copy$default(C0455Activity c0455Activity, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = c0455Activity.copydefault;
                }
                return c0455Activity.KWHzl(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0455Activity KWHzl(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new C0455Activity(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0455Activity) && Intrinsics.EZpvd((Object) this.copydefault, (Object) ((C0455Activity) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "GroupProfilePage(channelId=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0455Activity(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.copydefault = str;
            }
        }

        private Activity() {
        }

        public static final class StateListAnimator extends Activity {
            public static final int KWHzl = OKConversation.$stable;
            public final String EZpvd;
            public final OKConversation OLrzqt;
            public final String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, String str2, OKConversation oKConversation, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.copydefault;
                }
                if ((i & 2) != 0) {
                    str2 = stateListAnimator.EZpvd;
                }
                if ((i & 4) != 0) {
                    oKConversation = stateListAnimator.OLrzqt;
                }
                return stateListAnimator.KWHzl(str, str2, oKConversation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator KWHzl(@NotNull String str, @NotNull String str2, OKConversation oKConversation) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new StateListAnimator(str, str2, oKConversation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String KWHzl() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final OKConversation OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StateListAnimator)) {
                    return false;
                }
                StateListAnimator stateListAnimator = (StateListAnimator) obj;
                return Intrinsics.EZpvd((Object) this.copydefault, (Object) stateListAnimator.copydefault) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) stateListAnimator.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.copydefault.hashCode();
                int iHashCode2 = this.EZpvd.hashCode();
                OKConversation oKConversation = this.OLrzqt;
                return (((iHashCode * 31) + iHashCode2) * 31) + (oKConversation == null ? 0 : oKConversation.hashCode());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ContactProfilePage(userId=" + this.copydefault + ", origin=" + this.EZpvd + ", conversation=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull String str, @NotNull String str2, OKConversation oKConversation) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.copydefault = str;
                this.EZpvd = str2;
                this.OLrzqt = oKConversation;
            }
        }
    }

    public static final Flow OLrzqt(ChatActivityViewModel chatActivityViewModel, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return chatActivityViewModel.AxsJAY.EZpvd(str);
    }

    public static final Flow valueOf(ChatActivityViewModel chatActivityViewModel, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return chatActivityViewModel.zsXlph.AEQbTJ(str);
    }

    public static final boolean KWHzl(C35285nsT c35285nsT) {
        Intrinsics.checkNotNullParameter(c35285nsT, "");
        return c35285nsT.values();
    }

    public static final boolean AYXKKw(C35285nsT c35285nsT) {
        Intrinsics.checkNotNullParameter(c35285nsT, "");
        return c35285nsT.EZpvd();
    }

    public static final boolean copydefault(C35285nsT c35285nsT) {
        Intrinsics.checkNotNullParameter(c35285nsT, "");
        return c35285nsT.KWHzl();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.messageV2.view.ChatActivityViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.messageV2.view.ChatActivityViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = ChatActivityViewModel.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.messageV2.view.ChatActivityViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C04541 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ChatActivityViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04541(ChatActivityViewModel chatActivityViewModel, Continuation<? super C04541> continuation) {
                super(2, continuation);
                this.this$0 = chatActivityViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04541(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    ChatActivityViewModel chatActivityViewModel = this.this$0;
                    this.label = 1;
                    if (chatActivityViewModel.copydefault(this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C04541(ChatActivityViewModel.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(ChatActivityViewModel.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(ChatActivityViewModel.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(ChatActivityViewModel.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(ChatActivityViewModel.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.messageV2.view.ChatActivityViewModel$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ChatActivityViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ChatActivityViewModel chatActivityViewModel, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = chatActivityViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    ChatActivityViewModel chatActivityViewModel = this.this$0;
                    this.label = 1;
                    if (chatActivityViewModel.AEQbTJ(this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.messageV2.view.ChatActivityViewModel$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ChatActivityViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(ChatActivityViewModel chatActivityViewModel, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = chatActivityViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    ChatActivityViewModel chatActivityViewModel = this.this$0;
                    this.label = 1;
                    if (chatActivityViewModel.OLrzqt(this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.messageV2.view.ChatActivityViewModel$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ChatActivityViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(ChatActivityViewModel chatActivityViewModel, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = chatActivityViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    ChatActivityViewModel chatActivityViewModel = this.this$0;
                    this.label = 1;
                    if (chatActivityViewModel.valueOf(this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.messageV2.view.ChatActivityViewModel$1$5, reason: invalid class name */
        public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ChatActivityViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(ChatActivityViewModel chatActivityViewModel, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = chatActivityViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    ChatActivityViewModel chatActivityViewModel = this.this$0;
                    this.label = 1;
                    if (chatActivityViewModel.EZpvd(this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(Continuation<? super Unit> continuation) throws Throwable {
        ChatActivityViewModel$fetchTypingIndicatorConfigOnce$1 chatActivityViewModel$fetchTypingIndicatorConfigOnce$1;
        ChatActivityViewModel chatActivityViewModel;
        Object objM7377constructorimpl;
        InHouseUserConfigDto config;
        if (continuation instanceof ChatActivityViewModel$fetchTypingIndicatorConfigOnce$1) {
            chatActivityViewModel$fetchTypingIndicatorConfigOnce$1 = (ChatActivityViewModel$fetchTypingIndicatorConfigOnce$1) continuation;
            int i = chatActivityViewModel$fetchTypingIndicatorConfigOnce$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chatActivityViewModel$fetchTypingIndicatorConfigOnce$1.label = i - Integer.MIN_VALUE;
            } else {
                chatActivityViewModel$fetchTypingIndicatorConfigOnce$1 = new ChatActivityViewModel$fetchTypingIndicatorConfigOnce$1(this, continuation);
            }
        }
        Object currentUserInfo = chatActivityViewModel$fetchTypingIndicatorConfigOnce$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = chatActivityViewModel$fetchTypingIndicatorConfigOnce$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(currentUserInfo);
            try {
                Result.Application application = Result.Companion;
                InHouseIMUserService inHouseIMUserService = this.fARcdN;
                chatActivityViewModel$fetchTypingIndicatorConfigOnce$1.L$0 = this;
                chatActivityViewModel$fetchTypingIndicatorConfigOnce$1.label = 1;
                currentUserInfo = inHouseIMUserService.getCurrentUserInfo(chatActivityViewModel$fetchTypingIndicatorConfigOnce$1);
                if (currentUserInfo == objCopydefault) {
                    return objCopydefault;
                }
                chatActivityViewModel = this;
            } catch (Throwable th) {
                th = th;
                chatActivityViewModel = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chatActivityViewModel = (ChatActivityViewModel) chatActivityViewModel$fetchTypingIndicatorConfigOnce$1.L$0;
            try {
                C56391yDq.AEQbTJ(currentUserInfo);
            } catch (Throwable th2) {
                th = th2;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((ResponseData) currentUserInfo);
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            InHouseUserInfo inHouseUserInfo = (InHouseUserInfo) ((ResponseData) objM7377constructorimpl).getData();
            TypingIndicatorConfigDto typingIndicator = (inHouseUserInfo == null || (config = inHouseUserInfo.getConfig()) == null) ? null : config.getTypingIndicator();
            chatActivityViewModel.valueOf.setValue(typingIndicator != null ? C36644oep.EZpvd(typingIndicator) : null);
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.OLrzqt("ChatActivityViewModel", "fetchTypingIndicatorConfigOnce failed, typing indicator disabled", thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }

    public final Flow<Boolean> djBIcL() {
        pUU.KWHzl("ChatActivityViewModel", "buildWebSocketConnectionStatusFlow - starting observation");
        return FlowKt.distinctUntilChanged(FlowKt.transformLatest(new Dialog(FlowKt.onEach(FlowLiveDataConversions.asFlow(this.wlaJM.KWHzl()), new ChatActivityViewModel$buildWebSocketConnectionStatusFlow$1(null))), new ChatActivityViewModel$buildWebSocketConnectionStatusFlow$$inlined$flatMapLatest$1(null)));
    }

    public static /* synthetic */ StateFlow createChannelIdFlow$default(ChatActivityViewModel chatActivityViewModel, Function1 function1, Object obj, SharingStarted sharingStarted, int i, Object obj2) {
        if ((i & 4) != 0) {
            sharingStarted = SharingStarted.Companion.getEagerly();
        }
        return chatActivityViewModel.EZpvd((Function1<? super String, ? extends Flow<? extends Object>>) function1, obj, sharingStarted);
    }

    public final <T> StateFlow<T> EZpvd(Function1<? super String, ? extends Flow<? extends T>> function1, T t, SharingStarted sharingStarted) {
        return FlowKt.stateIn(FlowKt.transformLatest(FlowKt.filterNotNull(this.copydefault), new ChatActivityViewModel$createChannelIdFlow$$inlined$flatMapLatest$1(null, function1)), ViewModelKt.getViewModelScope(this), sharingStarted, t);
    }

    public static /* synthetic */ StateFlow createPageConfigFlow$default(ChatActivityViewModel chatActivityViewModel, Function1 function1, Object obj, SharingStarted sharingStarted, int i, Object obj2) {
        if ((i & 4) != 0) {
            sharingStarted = SharingStarted.Companion.getEagerly();
        }
        return chatActivityViewModel.KWHzl((Function1<? super C35285nsT, ? extends Object>) function1, obj, sharingStarted);
    }

    public final <T> StateFlow<T> KWHzl(Function1<? super C35285nsT, ? extends T> function1, T t, SharingStarted sharingStarted) {
        return FlowKt.stateIn(FlowKt.distinctUntilChanged(FlowKt.mapLatest(FlowKt.filterNotNull(this.AhwBna), new ChatActivityViewModel$createPageConfigFlow$1(function1))), ViewModelKt.getViewModelScope(this), sharingStarted, t);
    }

    public static final /* synthetic */ Object copydefault(Function1 function1, C35285nsT c35285nsT, Continuation continuation) {
        return function1.invoke(c35285nsT);
    }

    public final StateFlow<OKConversation> EZpvd() {
        pUU.KWHzl("ChatActivityViewModel", "buildConversationFlow - starting observation");
        return createChannelIdFlow$default(this, new Function1() { // from class: o.oet
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChatActivityViewModel.copydefault(this.OLrzqt, (java.lang.String) obj);
            }
        }, null, null, 4, null);
    }

    public static final Flow copydefault(ChatActivityViewModel chatActivityViewModel, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return chatActivityViewModel.AubY.KWHzl(str);
    }

    public final Object OLrzqt(Continuation<? super Unit> continuation) {
        pUU.KWHzl("ChatActivityViewModel", "observeAndUpdatePageType - starting observation");
        Object objCollect = FlowKt.filterNotNull(this.djBIcL).collect(new Fragment(), continuation);
        return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
    }

    public static final class Fragment<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final Object emit(OKConversation oKConversation, Continuation<? super Unit> continuation) {
            IMPageType iMPageTypeKWHzl = ChatActivityViewModel.this.fIwbmz.KWHzl(ChatActivityViewModel.this.fIwbmz().getValue(), oKConversation);
            if (iMPageTypeKWHzl != ChatActivityViewModel.this.fIwbmz().getValue()) {
                pUU.KWHzl("ChatActivityViewModel", "observeAndUpdatePageType - updating pageType to: " + iMPageTypeKWHzl);
                ChatActivityViewModel.this.OcIXYQ.set("key_page_type", iMPageTypeKWHzl);
            }
            return Unit.INSTANCE;
        }
    }

    public final Object valueOf(Continuation<? super Unit> continuation) {
        pUU.KWHzl("ChatActivityViewModel", "observeGroupInfoRefresh - starting observation");
        Object objCollect = FlowKt.filterNotNull(this.djBIcL).collect(new PendingIntent(), continuation);
        return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
    }

    public static final class PendingIntent<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(OKConversation oKConversation, Continuation<? super Unit> continuation) throws Throwable {
            ChatActivityViewModel$observeGroupInfoRefresh$2$emit$1 chatActivityViewModel$observeGroupInfoRefresh$2$emit$1;
            Object objM7377constructorimpl;
            if (continuation instanceof ChatActivityViewModel$observeGroupInfoRefresh$2$emit$1) {
                chatActivityViewModel$observeGroupInfoRefresh$2$emit$1 = (ChatActivityViewModel$observeGroupInfoRefresh$2$emit$1) continuation;
                int i = chatActivityViewModel$observeGroupInfoRefresh$2$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    chatActivityViewModel$observeGroupInfoRefresh$2$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    chatActivityViewModel$observeGroupInfoRefresh$2$emit$1 = new ChatActivityViewModel$observeGroupInfoRefresh$2$emit$1(this, continuation);
                }
            }
            Object obj = chatActivityViewModel$observeGroupInfoRefresh$2$emit$1.result;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = chatActivityViewModel$observeGroupInfoRefresh$2$emit$1.label;
            try {
            } catch (Throwable th) {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                OKMessageContent latestMessage = oKConversation.getLatestMessage();
                if ((latestMessage instanceof UpdateGroupNameMessage) || (latestMessage instanceof UpdateGroupAvatarMessage)) {
                    ChatActivityViewModel chatActivityViewModel = ChatActivityViewModel.this;
                    Result.Application application2 = Result.Companion;
                    if (!C44157sFk.KWHzl(((GroupSystemMessage) latestMessage).getOperatorUserId())) {
                        pUU.KWHzl("ChatActivityViewModel", "observeGroupInfoRefresh - fetching updated group info");
                        oDA oda = chatActivityViewModel.values;
                        String targetId = oKConversation.getTargetId();
                        chatActivityViewModel$observeGroupInfoRefresh$2$emit$1.label = 1;
                        if (oda.copydefault(targetId, chatActivityViewModel$observeGroupInfoRefresh$2$emit$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("ChatActivityViewModel", "observeGroupInfoRefresh - error fetching group info", thM7380exceptionOrNullimpl);
            }
            Result.m7376boximpl(objM7377constructorimpl);
            return Unit.INSTANCE;
        }
    }

    public final Flow<String> AEQbTJ() {
        pUU.KWHzl("ChatActivityViewModel", "buildPageToolbarTitleFlow - starting observation");
        return FlowKt.transformLatest(FlowKt.combine(FlowKt.filterNotNull(this.copydefault), FlowKt.filterNotNull(this.sSMYrx), new ChatActivityViewModel$buildPageToolbarTitleFlow$1(null)), new ChatActivityViewModel$buildPageToolbarTitleFlow$$inlined$flatMapLatest$1(null, this));
    }

    public final Flow<oFS> KWHzl() {
        pUU.KWHzl("ChatActivityViewModel", "buildPageToolbarSubtitleFlow - starting observation");
        return FlowKt.transformLatest(FlowKt.filterNotNull(this.copydefault), new ChatActivityViewModel$buildPageToolbarSubtitleFlow$$inlined$flatMapLatest$1(null, this));
    }

    public final Flow<AbstractC35351ntg> OLrzqt() {
        pUU.KWHzl("ChatActivityViewModel", "buildPageToolbarTagSection - starting observation");
        return FlowKt.drop(FlowKt.scan(FlowKt.filterNotNull(FlowKt.transformLatest(FlowKt.filterNotNull(this.sSMYrx), new ChatActivityViewModel$buildPageToolbarTagSection$$inlined$flatMapLatest$1(null, this))), null, new ChatActivityViewModel$buildPageToolbarTagSection$2(null)), 1);
    }

    public final Flow<MenuProvider> copydefault() {
        return FlowKt.combine(FlowKt.transformLatest(FlowKt.filterNotNull(this.copydefault), new ChatActivityViewModel$buildMenuProviderFlow$$inlined$flatMapLatest$1(null, this)), this.getFieldNames, new ChatActivityViewModel$buildMenuProviderFlow$1(null));
    }

    public static final class ActionBar implements Function1<MenuItem, Boolean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(MenuItem menuItem) {
            boolean z;
            Intrinsics.checkNotNullParameter(menuItem, "");
            if (menuItem.getItemId() == C35399nuc.StateListAnimator.Th) {
                final ChatActivityViewModel chatActivityViewModel = ChatActivityViewModel.this;
                z = true;
                C32866mlf.onEvent$default("IMChat_Full_Detail_Click", (TrackChannel[]) null, new Function1<EventParamsList, Unit>() { // from class: com.okinc.im.imui.messageV2.view.ChatActivityViewModel.ActionBar.4
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                        OLrzqt(eventParamsList);
                        return Unit.INSTANCE;
                    }

                    public final void OLrzqt(EventParamsList eventParamsList) {
                        OKConversationType conversationType;
                        Intrinsics.checkNotNullParameter(eventParamsList, "");
                        EventParamsList.put$default(eventParamsList, "channel_id", C33129mqd.gEmmrt(chatActivityViewModel.copydefault.getValue()), false, 4, null);
                        OKConversation value = chatActivityViewModel.valueOf().getValue();
                        String strCopydefault = (value == null || (conversationType = value.getConversationType()) == null) ? null : sNN.copydefault(conversationType);
                        EventParamsList.put$default(eventParamsList, "channel_type", strCopydefault == null ? "" : strCopydefault, false, 4, null);
                    }
                }, 1, (Object) null);
                ChatActivityViewModel.this.AxsJAY();
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public final Object copydefault(Continuation<? super Unit> continuation) {
        pUU.KWHzl("ChatActivityViewModel", "observeDraftMessageModel - starting observation");
        Object objCollectLatest = FlowKt.collectLatest(FlowKt.filterNotNull(this.copydefault), new ChatActivityViewModel$observeDraftMessageModel$2(this, null), continuation);
        return objCollectLatest == C56442yFn.copydefault() ? objCollectLatest : Unit.INSTANCE;
    }

    public final Object AEQbTJ(Continuation<? super Unit> continuation) {
        pUU.KWHzl("ChatActivityViewModel", "observeAgentBotSessionEnd - starting observation");
        Object objCollectLatest = FlowKt.collectLatest(new FragmentManager(FlowKt.combine(FlowKt.filterNotNull(this.copydefault), this.getFieldNames, new ChatActivityViewModel$observeAgentBotSessionEnd$2(null))), new ChatActivityViewModel$observeAgentBotSessionEnd$4(this, null), continuation);
        return objCollectLatest == C56442yFn.copydefault() ? objCollectLatest : Unit.INSTANCE;
    }

    public final String gEmmrt() {
        String strAEQbTJ = this.isConnected.AEQbTJ();
        return strAEQbTJ == null ? "" : strAEQbTJ;
    }

    public final void zLjUOn() {
        if (C35341ntW.EZpvd.KWHzl(this.djBIcL.getValue())) {
            MutableLiveData<C32989mnw<Activity>> mutableLiveData = this.EZpvd;
            OKConversation value = this.djBIcL.getValue();
            String contactId = value != null ? value.getContactId() : null;
            if (contactId == null) {
                contactId = "";
            }
            mutableLiveData.setValue(new C32989mnw<>(new Activity.StateListAnimator(contactId, ChatOrigin.CHAT.getValue(), this.djBIcL.getValue())));
            return;
        }
        if (this.getFieldNames.getValue().booleanValue()) {
            return;
        }
        C35285nsT value2 = this.AhwBna.getValue();
        Function1<Continuation<? super GeneralAction>, Object> function1DjBIcL = value2 != null ? value2.djBIcL() : null;
        if (function1DjBIcL != null) {
            pUU.KWHzl("ChatActivityViewModel", "onTitleClicked pageConfigClickAction: " + function1DjBIcL);
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), sDN.copydefault.copydefault(), null, new ChatActivityViewModel$onTitleClicked$1(function1DjBIcL, this, null), 2, null);
            return;
        }
        pUU.KWHzl("ChatActivityViewModel", "onTitleClicked default title click action");
        AYXKKw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AxsJAY() {
        final OKConversation value = this.djBIcL.getValue();
        final RelationInfo value2 = this.AYXKKw.getValue();
        C35341ntW c35341ntW = C35341ntW.EZpvd;
        final boolean zKWHzl = c35341ntW.KWHzl(value);
        final boolean zOLrzqt = c35341ntW.OLrzqt(value);
        this.QbewEr.OLrzqt(ViewModelKt.getViewModelScope(this), new Function1() { // from class: o.oer
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChatActivityViewModel.EZpvd(value, zKWHzl, value2, this, zOLrzqt, (InterfaceC37705oyq) obj);
            }
        }, 0, value, value2, Boolean.valueOf(zKWHzl), Boolean.valueOf(zOLrzqt));
    }

    public static final Unit EZpvd(OKConversation oKConversation, boolean z, RelationInfo relationInfo, ChatActivityViewModel chatActivityViewModel, boolean z2, InterfaceC37705oyq interfaceC37705oyq) {
        Intrinsics.checkNotNullParameter(interfaceC37705oyq, "");
        if (oKConversation != null) {
            if (z && relationInfo != null) {
                chatActivityViewModel.EZpvd.setValue(new C32989mnw<>(new Activity.StateListAnimator(oKConversation.getContactId(), ChatOrigin.CHAT.getValue(), oKConversation)));
            } else if (z2) {
                chatActivityViewModel.EZpvd.setValue(new C32989mnw<>(new Activity.C0455Activity(oKConversation.getTargetId())));
            }
        }
        return Unit.INSTANCE;
    }

    public final void AYXKKw() {
        final OKConversation value = this.djBIcL.getValue();
        C35341ntW c35341ntW = C35341ntW.EZpvd;
        final boolean zKWHzl = c35341ntW.KWHzl(value);
        final boolean zOLrzqt = c35341ntW.OLrzqt(value);
        this.QbewEr.OLrzqt(ViewModelKt.getViewModelScope(this), new Function1() { // from class: o.oeq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChatActivityViewModel.OLrzqt(value, zOLrzqt, this, zKWHzl, (InterfaceC37705oyq) obj);
            }
        }, 1, value, Boolean.valueOf(zKWHzl), Boolean.valueOf(zOLrzqt));
    }

    public static final Unit OLrzqt(OKConversation oKConversation, boolean z, ChatActivityViewModel chatActivityViewModel, boolean z2, InterfaceC37705oyq interfaceC37705oyq) {
        Intrinsics.checkNotNullParameter(interfaceC37705oyq, "");
        if (oKConversation != null) {
            if (z && C35341ntW.EZpvd.EZpvd(oKConversation, chatActivityViewModel.ejfBZ.getValue())) {
                chatActivityViewModel.EZpvd.setValue(new C32989mnw<>(new Activity.C0455Activity(oKConversation.getTargetId())));
            } else if (z2) {
                chatActivityViewModel.EZpvd.setValue(new C32989mnw<>(new Activity.StateListAnimator(oKConversation.getContactId(), ChatOrigin.CHAT.getValue(), oKConversation)));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(String str, Continuation<? super Unit> continuation) throws Throwable {
        ChatActivityViewModel$monitorAgentBotSessionEnd$1 chatActivityViewModel$monitorAgentBotSessionEnd$1;
        ChatActivityViewModel chatActivityViewModel;
        if (continuation instanceof ChatActivityViewModel$monitorAgentBotSessionEnd$1) {
            chatActivityViewModel$monitorAgentBotSessionEnd$1 = (ChatActivityViewModel$monitorAgentBotSessionEnd$1) continuation;
            int i = chatActivityViewModel$monitorAgentBotSessionEnd$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chatActivityViewModel$monitorAgentBotSessionEnd$1.label = i - Integer.MIN_VALUE;
            } else {
                chatActivityViewModel$monitorAgentBotSessionEnd$1 = new ChatActivityViewModel$monitorAgentBotSessionEnd$1(this, continuation);
            }
        }
        Object obj = chatActivityViewModel$monitorAgentBotSessionEnd$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = chatActivityViewModel$monitorAgentBotSessionEnd$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            chatActivityViewModel$monitorAgentBotSessionEnd$1.L$0 = this;
            chatActivityViewModel$monitorAgentBotSessionEnd$1.L$1 = str;
            chatActivityViewModel$monitorAgentBotSessionEnd$1.label = 1;
            if (KWHzl(chatActivityViewModel$monitorAgentBotSessionEnd$1) == objCopydefault) {
                return objCopydefault;
            }
            chatActivityViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            str = (String) chatActivityViewModel$monitorAgentBotSessionEnd$1.L$1;
            chatActivityViewModel = (ChatActivityViewModel) chatActivityViewModel$monitorAgentBotSessionEnd$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        LoaderManager loaderManager = new LoaderManager(chatActivityViewModel.wlaJM.OLrzqt(str, "assistant-api"));
        ChatActivityViewModel$monitorAgentBotSessionEnd$3 chatActivityViewModel$monitorAgentBotSessionEnd$3 = new ChatActivityViewModel$monitorAgentBotSessionEnd$3(chatActivityViewModel, null);
        chatActivityViewModel$monitorAgentBotSessionEnd$1.L$0 = null;
        chatActivityViewModel$monitorAgentBotSessionEnd$1.L$1 = null;
        chatActivityViewModel$monitorAgentBotSessionEnd$1.label = 2;
        if (FlowKt.collectLatest(loaderManager, chatActivityViewModel$monitorAgentBotSessionEnd$3, chatActivityViewModel$monitorAgentBotSessionEnd$1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    public final void getFieldNames() {
        if (this.getFieldNames.getValue().booleanValue()) {
            pUU.KWHzl("ChatActivityViewModel", "initAgentBotSessionIfNeeded - triggering agent bot session init on resume");
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatActivityViewModel$initAgentBotSessionIfNeeded$1(this, null), 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(Continuation<? super Unit> continuation) throws Throwable {
        ChatActivityViewModel$initAgentBotSession$1 chatActivityViewModel$initAgentBotSession$1;
        ChatActivityViewModel chatActivityViewModel;
        Object objM7377constructorimpl;
        if (continuation instanceof ChatActivityViewModel$initAgentBotSession$1) {
            chatActivityViewModel$initAgentBotSession$1 = (ChatActivityViewModel$initAgentBotSession$1) continuation;
            int i = chatActivityViewModel$initAgentBotSession$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chatActivityViewModel$initAgentBotSession$1.label = i - Integer.MIN_VALUE;
            } else {
                chatActivityViewModel$initAgentBotSession$1 = new ChatActivityViewModel$initAgentBotSession$1(this, continuation);
            }
        }
        Object objEZpvd = chatActivityViewModel$initAgentBotSession$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = chatActivityViewModel$initAgentBotSession$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            IMPageType value = this.sSMYrx.getValue();
            AgentBotEntryInfo agentBotEntryInfo = (value != null && StateListAnimator.KWHzl[value.ordinal()] == 1) ? AgentBotEntryInfo.OtcTrade : null;
            if (agentBotEntryInfo == null) {
                return Unit.INSTANCE;
            }
            try {
                Result.Application application = Result.Companion;
                sFG sfg = this.AuCTel;
                chatActivityViewModel$initAgentBotSession$1.L$0 = this;
                chatActivityViewModel$initAgentBotSession$1.label = 1;
                objEZpvd = sfg.EZpvd(agentBotEntryInfo, chatActivityViewModel$initAgentBotSession$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                chatActivityViewModel = this;
            } catch (Throwable th) {
                th = th;
                chatActivityViewModel = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
                return Unit.INSTANCE;
            }
            chatActivityViewModel = (ChatActivityViewModel) chatActivityViewModel$initAgentBotSession$1.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
            } catch (Throwable th2) {
                th = th2;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((sFH) objEZpvd);
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("ChatActivityViewModel", "initAgentBotSession - unexpected exception", thM7380exceptionOrNullimpl);
            objM7377constructorimpl = sFH.Activity.AEQbTJ;
        }
        sFH sfh = (sFH) objM7377constructorimpl;
        if (sfh instanceof sFH.TaskDescription) {
            pUU.KWHzl("ChatActivityViewModel", "initAgentBotSession - success");
        } else if (sfh instanceof sFH.ActionBar) {
            pUU.KWHzl("ChatActivityViewModel", "initAgentBotSession - discarded due to buffer");
        } else {
            if (!(sfh instanceof sFH.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            pUU.valueOf("ChatActivityViewModel", "initAgentBotSession - failure, emitting error");
            MutableSharedFlow<Unit> mutableSharedFlow = chatActivityViewModel.AEQbTJ;
            Unit unit = Unit.INSTANCE;
            chatActivityViewModel$initAgentBotSession$1.L$0 = null;
            chatActivityViewModel$initAgentBotSession$1.label = 2;
            if (mutableSharedFlow.emit(unit, chatActivityViewModel$initAgentBotSession$1) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(String str, IMPageType iMPageType) {
        this.OcIXYQ.set("key_channel_id", str);
        this.OcIXYQ.set("key_page_type", iMPageType);
    }
}
