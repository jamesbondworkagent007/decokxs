package o;

import com.okinc.core.livelistener.OKWsConnectionState;
import com.okinc.core.util.SPUtils;
import com.okinc.okimcore.feature.conversation.listener.RefreshEvent;
import com.okinc.okimcore.feature.conversation.repository.remote.inhouseim.InHouseIMConversationService;
import com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupInfoDao;
import com.okinc.okimcore.feature.group.repository.remote.InHouseIMGroupService;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$broadcastMessages$1;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$broadcastMessages$2;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$broadcastMessages$3$1$1;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$broadcastMessages$3$2$1;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$broadcastMessages$3$4$1;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$broadcastMessages$3$6$1;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$clearConversationUnreadCount$2;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$connect$1;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$deleteConversationsMessages$1;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$disconnect$1;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$handleIncomingResponse$1;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$handleReactionData$1;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$handleReactionData$2$1$1;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$handleReactionPush$3;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$initConnection$1;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$initConnection$2;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$initInboundMsgQueueJob$1;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactions$2;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$2;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$internalClearConversationUnreadCount$1;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$internalClearConversationUnreadCount$3$1;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$internalConnect$1;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$internalReadAllConversationMessages$1;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$internalRecallMessage$1;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$invalidatePendingMessages$1;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$markAllConversationsAsRead$1;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$markAllConversationsAsRead$2;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$markConversationAsReadLocally$1;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$markConversationAsReadLocally$2;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$notifySyncUnreadCountUpdates$1;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$processCallMessages$1;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$readAllConversationMessages$2;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$recallMessage$2;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$1;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$syncConversations$1;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$syncMessageReactions$2;
import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$updateInboundGroupInfoTransactions$2;
import com.okinc.okimcore.feature.message.utility.TaskPriority;
import com.okinc.okimcore.model.im.ConversationSyncStatus;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMResponse;
import com.okinc.okimcore.model.im.inhouseim.ws.Reaction;
import com.okinc.okimcore.model.im.inhouseim.ws.ReactionDisplay;
import com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.UserUid;
import com.okinc.okimcore.model.im.inhouseim.ws.WSPushReaction;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionData;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionResponse;
import com.okinc.okimcore.model.other.OKRecallNotificationMessage;
import com.okinc.okimcore.model.room.inhouseim.EmojiReactionEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationSimpleInfoEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageWithReactions;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMServerConversationEntity;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonElement;
import o.C44498sSa;
import o.C44502sSe;
import o.sFA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sKu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44302sKu implements InterfaceC44301sKt {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final long AEQbTJ;
    public final MutableStateFlow<java.lang.String> AYXKKw;
    public final sGH AhwBna;
    public final InHouseIMConversationService AkhnZx;
    public final MutableSharedFlow<InHouseIMMessageEntity> AuCTel;
    public C44486sRp AuCTelauCTel;
    public final InterfaceC44293sKl AubY;
    public final C44504sSg AwvSrB;
    public sMU AxsJAY;
    public CoroutineScope DTwDnp;
    public C44482sRl DbNXlk;
    public final MutableStateFlow<OKWsConnectionState> KWHzl;
    public final MutableStateFlow<sNJ> OLrzqt;
    public final CoroutineDispatcher ORxRYg;
    public final CoroutineDispatcher OcIXYQ;
    public final CoroutineDispatcher QKVWgx;
    public final CoroutineScope QOLQEE;
    public InterfaceC44228sIa QUSxYX;
    public final sED QVAiDq;
    public final C44489sRs QbewEr;
    public CoroutineDispatcher QfsBiF;
    public Job RJOkX;
    public final MutableSharedFlow<C44391sOb> copydefault;
    public final sGI djBIcL;
    public final C44272sJr ejfBZ;
    public final InHouseIMGroupService fARcdN;
    public final ConcurrentLinkedQueue<WSSendMessageDetailData> fIwbmz;
    public Job fJNWhG;
    public final C44498sSa fetchVPNInfo;
    public final C44485sRo gEmmrt;
    public final ConcurrentHashMap<java.lang.String, Job> gHZMYf;
    public final sMF getFieldNames;
    public sJY getNewProxyInstance;
    public final MutableStateFlow<java.util.List<InHouseIMMessageEntity>> hDKMBd;
    public final CoroutineDispatcher isConnected;
    public final sMU iwGUEr;
    public sMV sSMYrx;
    public sJW uzCIH;
    public C44484sRn valueOf;
    public InHouseIMGroupInfoDao values;
    public C44502sSe wlaJM;
    public sJZ zLjUOn;
    public Mutex zsXlph;
    public final ConcurrentHashMap<java.lang.String, WSPushReaction> zuBGHE;

    /* JADX INFO: renamed from: o.sKu$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKWsConnectionState.values().length];
            try {
                iArr[OKWsConnectionState.OPEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMConversationService AYXKKw() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44484sRn AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44486sRp AkhnZx() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConcurrentHashMap<java.lang.String, Job> AuCTel() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44502sSe DbNXlk() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC44301sKt
    public StateFlow<sNJ> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC44301sKt
    public StateFlow<OKWsConnectionState> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC44301sKt
    public void copydefault(InterfaceC44228sIa interfaceC44228sIa) {
        this.QUSxYX = interfaceC44228sIa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final sMU ejfBZ() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConcurrentHashMap<java.lang.String, WSPushReaction> fARcdN() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC44293sKl fIwbmz() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final sMV fJNWhG() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44482sRl fetchVPNInfo() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoroutineDispatcher getFieldNames() {
        return this.QfsBiF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44504sSg getNewProxyInstance() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44489sRs hDKMBd() {
        return this.QbewEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConcurrentLinkedQueue<WSSendMessageDetailData> isConnected() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC44228sIa uzCIH() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC44301sKt
    public StateFlow<java.lang.String> valueOf() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMGroupInfoDao values() {
        return this.values;
    }

    @yCM
    public C44302sKu(@NotNull sIC sic, @NotNull sHZ shz, @NotNull C44498sSa c44498sSa, @NotNull sGI sgi, @NotNull C44489sRs c44489sRs, @NotNull sED sed, @NotNull InHouseIMConversationService inHouseIMConversationService, @NotNull InHouseIMGroupService inHouseIMGroupService, @NotNull C44272sJr c44272sJr, @NotNull InterfaceC44293sKl interfaceC44293sKl, @NotNull MutableStateFlow<java.util.List<InHouseIMMessageEntity>> mutableStateFlow, @NotNull MutableSharedFlow<InHouseIMMessageEntity> mutableSharedFlow, @NotNull sGH sgh, @NotNull sMU smu, @NotNull C44504sSg c44504sSg, @NotNull sMF smf, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sic, "");
        Intrinsics.checkNotNullParameter(shz, "");
        Intrinsics.checkNotNullParameter(c44498sSa, "");
        Intrinsics.checkNotNullParameter(sgi, "");
        Intrinsics.checkNotNullParameter(c44489sRs, "");
        Intrinsics.checkNotNullParameter(sed, "");
        Intrinsics.checkNotNullParameter(inHouseIMConversationService, "");
        Intrinsics.checkNotNullParameter(inHouseIMGroupService, "");
        Intrinsics.checkNotNullParameter(c44272sJr, "");
        Intrinsics.checkNotNullParameter(interfaceC44293sKl, "");
        Intrinsics.checkNotNullParameter(mutableStateFlow, "");
        Intrinsics.checkNotNullParameter(mutableSharedFlow, "");
        Intrinsics.checkNotNullParameter(sgh, "");
        Intrinsics.checkNotNullParameter(smu, "");
        Intrinsics.checkNotNullParameter(c44504sSg, "");
        Intrinsics.checkNotNullParameter(smf, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.fetchVPNInfo = c44498sSa;
        this.djBIcL = sgi;
        this.QbewEr = c44489sRs;
        this.QVAiDq = sed;
        this.AkhnZx = inHouseIMConversationService;
        this.fARcdN = inHouseIMGroupService;
        this.ejfBZ = c44272sJr;
        this.AubY = interfaceC44293sKl;
        this.hDKMBd = mutableStateFlow;
        this.AuCTel = mutableSharedFlow;
        this.AhwBna = sgh;
        this.iwGUEr = smu;
        this.AwvSrB = c44504sSg;
        this.getFieldNames = smf;
        this.isConnected = coroutineDispatcher;
        sDN sdn = sDN.copydefault;
        CoroutineDispatcher coroutineDispatcherCopydefault = sdn.copydefault();
        java.lang.Integer num = SPUtils.getInt("SHARE_PREFERENCE_TOTAL_WORKER", 4);
        Intrinsics.checkNotNullExpressionValue(num, "");
        this.QfsBiF = coroutineDispatcherCopydefault.limitedParallelism(num.intValue());
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(sdn.copydefault()));
        this.QOLQEE = CoroutineScope;
        CoroutineDispatcher coroutineDispatcherLimitedParallelism = sdn.copydefault().limitedParallelism(1);
        this.ORxRYg = coroutineDispatcherLimitedParallelism;
        CoroutineDispatcher coroutineDispatcherLimitedParallelism2 = sdn.copydefault().limitedParallelism(1);
        this.OcIXYQ = coroutineDispatcherLimitedParallelism2;
        this.QKVWgx = sdn.copydefault().limitedParallelism(1);
        this.KWHzl = StateFlowKt.MutableStateFlow(OKWsConnectionState.CLOSED);
        this.AYXKKw = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = StateFlowKt.MutableStateFlow(new sNJ(null, ConversationSyncStatus.Idle, 1, null));
        this.copydefault = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1, null);
        this.AuCTelauCTel = new C44486sRp(sic);
        this.valueOf = new C44484sRn(sic);
        this.DbNXlk = new C44482sRl(sic);
        this.values = sic.copydefault().EZpvd();
        this.zsXlph = MutexKt.Mutex$default(false, 1, null);
        C44485sRo c44485sRo = new C44485sRo(sic);
        this.gEmmrt = c44485sRo;
        this.zLjUOn = new sJZ(interfaceC44293sKl, coroutineDispatcherLimitedParallelism, this.AuCTelauCTel);
        this.uzCIH = new sJW(interfaceC44293sKl, coroutineDispatcherLimitedParallelism2, this.valueOf, this.AuCTelauCTel);
        this.getNewProxyInstance = new sJY(interfaceC44293sKl, CoroutineScope, this.AuCTelauCTel, c44489sRs, c44485sRo, this.valueOf, AYXKKw(), this.uzCIH, this.zLjUOn, smf, c44272sJr);
        this.wlaJM = new C44502sSe(this.valueOf, c44485sRo, this.AuCTelauCTel, smf, AYXKKw(), c44489sRs, c44272sJr, shz, this.getNewProxyInstance, this.zLjUOn, this.uzCIH, coroutineDispatcher, null, null, null, 28672, null);
        this.sSMYrx = new sMV("PriorityTaskQueue", new Function0() { // from class: o.sKA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C44302sKu.values(this.OLrzqt);
            }
        }, null, null, false, 28, null);
        this.AxsJAY = new sMU("NotifyTaskQueue", new Function0() { // from class: o.sKB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C44302sKu.AkhnZx(this.OLrzqt);
            }
        }, null, null, null, true, 28, null);
        smu.copydefault();
        this.fIwbmz = new ConcurrentLinkedQueue<>();
        this.AEQbTJ = 300L;
        this.zuBGHE = new ConcurrentHashMap<>();
        this.gHZMYf = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: o.sKu$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sKu.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.InterfaceC44301sKt
    public SharedFlow<C44391sOb> OLrzqt() {
        return FlowKt.asSharedFlow(this.copydefault);
    }

    public static final CoroutineScope values(C44302sKu c44302sKu) {
        return c44302sKu.DTwDnp;
    }

    public static final CoroutineScope AkhnZx(C44302sKu c44302sKu) {
        return c44302sKu.DTwDnp;
    }

    @Override // o.InterfaceC44301sKt
    public void AEQbTJ() {
        C44124sEe.imLogSync$default("connect", null, null, 6, null);
        this.iwGUEr.KWHzl(new InHouseIMWebSocketSyncManagerImpl$connect$1(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        InHouseIMWebSocketSyncManagerImpl$internalConnect$1 inHouseIMWebSocketSyncManagerImpl$internalConnect$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        C44302sKu c44302sKu;
        if (continuation instanceof InHouseIMWebSocketSyncManagerImpl$internalConnect$1) {
            inHouseIMWebSocketSyncManagerImpl$internalConnect$1 = (InHouseIMWebSocketSyncManagerImpl$internalConnect$1) continuation;
            int i = inHouseIMWebSocketSyncManagerImpl$internalConnect$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMWebSocketSyncManagerImpl$internalConnect$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMWebSocketSyncManagerImpl$internalConnect$1 = new InHouseIMWebSocketSyncManagerImpl$internalConnect$1(this, continuation);
            }
        }
        java.lang.Object obj = inHouseIMWebSocketSyncManagerImpl$internalConnect$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMWebSocketSyncManagerImpl$internalConnect$1.label;
        try {
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            if (this.DTwDnp == null) {
                C44124sEe.imLogSync$default("execute connect: previous scope is cancelled, create new scope...", null, null, 6, null);
                this.DTwDnp = CoroutineScopeKt.CoroutineScope(this.QKVWgx.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null)));
            }
            C44124sEe.imLogSync$default("execute connect", null, null, 6, null);
            if (this.QVAiDq.valueOf() != null && this.QVAiDq.djBIcL()) {
                C44124sEe.imLogSync$default("execute connect => webSocket already init and is open, will not reinit", null, null, 6, null);
                return Unit.INSTANCE;
            }
            inHouseIMWebSocketSyncManagerImpl$internalConnect$1.L$0 = this;
            inHouseIMWebSocketSyncManagerImpl$internalConnect$1.label = 1;
            if (EZpvd(inHouseIMWebSocketSyncManagerImpl$internalConnect$1) == objCopydefault) {
                return objCopydefault;
            }
            c44302sKu = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                C44124sEe.imLogSync$default("execute connect => completed", null, null, 6, null);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    C44124sEe.imLogSync$default("execute connect => failed, message=" + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl, null, 4, null);
                }
                return Unit.INSTANCE;
            }
            c44302sKu = (C44302sKu) inHouseIMWebSocketSyncManagerImpl$internalConnect$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        C44124sEe.imLogSync$default("execute connect: web socket is null or is not open, init web socket connection....", null, null, 6, null);
        inHouseIMWebSocketSyncManagerImpl$internalConnect$1.L$0 = null;
        inHouseIMWebSocketSyncManagerImpl$internalConnect$1.label = 2;
        if (c44302sKu.AEQbTJ(inHouseIMWebSocketSyncManagerImpl$internalConnect$1) == objCopydefault) {
            return objCopydefault;
        }
        C44124sEe.imLogSync$default("execute connect => completed", null, null, 6, null);
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC44301sKt
    public void copydefault() {
        C44124sEe.imLogSync$default("disconnect", null, null, 6, null);
        this.iwGUEr.KWHzl(new InHouseIMWebSocketSyncManagerImpl$disconnect$1(this, null));
    }

    public final void zLjUOn() {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            C44124sEe.imLogSync$default("execute disconnect", null, null, 6, null);
            sED sed = this.QVAiDq;
            sed.AEQbTJ();
            sed.EZpvd((Function1<? super InHouseIMResponse, Unit>) null);
            sed.OLrzqt((Function1<? super OKWsConnectionState, Unit>) null);
            CoroutineScope coroutineScope = this.DTwDnp;
            if (coroutineScope != null) {
                CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
            }
            this.DTwDnp = null;
            C44124sEe.imLogSync$default("execute disconnect => success", null, null, 6, null);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C44124sEe.imLogSync$default("execute disconnect => failed", thM7380exceptionOrNullimpl, null, 4, null);
        }
    }

    @Override // o.InterfaceC44301sKt
    public Flow<C44502sSe.StateListAnimator> KWHzl(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return this.wlaJM.KWHzl(oKMessage);
    }

    @Override // o.InterfaceC44301sKt
    public Flow<C44502sSe.Dialog> AEQbTJ(@NotNull WSSendReactionData wSSendReactionData) {
        Intrinsics.checkNotNullParameter(wSSendReactionData, "");
        return this.wlaJM.KWHzl(wSSendReactionData);
    }

    @Override // o.InterfaceC44301sKt
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objAEQbTJ = this.sSMYrx.AEQbTJ(TaskPriority.HIGH, new InHouseIMWebSocketSyncManagerImpl$clearConversationUnreadCount$2(this, str, null), continuation);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        InHouseIMWebSocketSyncManagerImpl$internalClearConversationUnreadCount$1 inHouseIMWebSocketSyncManagerImpl$internalClearConversationUnreadCount$1;
        C44302sKu c44302sKu;
        java.lang.Object objM7377constructorimpl;
        C44498sSa.Activity activityEZpvd;
        if (continuation instanceof InHouseIMWebSocketSyncManagerImpl$internalClearConversationUnreadCount$1) {
            inHouseIMWebSocketSyncManagerImpl$internalClearConversationUnreadCount$1 = (InHouseIMWebSocketSyncManagerImpl$internalClearConversationUnreadCount$1) continuation;
            int i = inHouseIMWebSocketSyncManagerImpl$internalClearConversationUnreadCount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMWebSocketSyncManagerImpl$internalClearConversationUnreadCount$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMWebSocketSyncManagerImpl$internalClearConversationUnreadCount$1 = new InHouseIMWebSocketSyncManagerImpl$internalClearConversationUnreadCount$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = inHouseIMWebSocketSyncManagerImpl$internalClearConversationUnreadCount$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMWebSocketSyncManagerImpl$internalClearConversationUnreadCount$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            try {
                Result.Application application = Result.Companion;
                C44498sSa c44498sSa = this.fetchVPNInfo;
                inHouseIMWebSocketSyncManagerImpl$internalClearConversationUnreadCount$1.L$0 = this;
                inHouseIMWebSocketSyncManagerImpl$internalClearConversationUnreadCount$1.L$1 = str;
                inHouseIMWebSocketSyncManagerImpl$internalClearConversationUnreadCount$1.label = 1;
                objOLrzqt = c44498sSa.OLrzqt(str, inHouseIMWebSocketSyncManagerImpl$internalClearConversationUnreadCount$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                c44302sKu = this;
            } catch (java.lang.Throwable th) {
                th = th;
                c44302sKu = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) inHouseIMWebSocketSyncManagerImpl$internalClearConversationUnreadCount$1.L$1;
            c44302sKu = (C44302sKu) inHouseIMWebSocketSyncManagerImpl$internalClearConversationUnreadCount$1.L$0;
            try {
                C56391yDq.AEQbTJ(objOLrzqt);
            } catch (java.lang.Throwable th2) {
                th = th2;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((C44498sSa.Application) objOLrzqt);
        if (Result.m7384isSuccessimpl(objM7377constructorimpl) && (activityEZpvd = ((C44498sSa.Application) objM7377constructorimpl).EZpvd()) != null) {
            c44302sKu.AxsJAY.KWHzl(new InHouseIMWebSocketSyncManagerImpl$internalClearConversationUnreadCount$3$1(c44302sKu, activityEZpvd.copydefault(), null));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C44124sEe.AEQbTJ("clear conversation unread count => failed to clear unread count", thM7380exceptionOrNullimpl, str);
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull InHouseIMConversationEntity inHouseIMConversationEntity) {
        Intrinsics.checkNotNullParameter(inHouseIMConversationEntity, "");
        sDZ.AEQbTJ.AYXKKw().KWHzl(RefreshEvent.EVENT_UNREAD_COUNT, C44169sFw.OLrzqt(inHouseIMConversationEntity));
    }

    @Override // o.InterfaceC44301sKt
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objAEQbTJ = this.sSMYrx.AEQbTJ(TaskPriority.HIGH, new InHouseIMWebSocketSyncManagerImpl$readAllConversationMessages$2(this, str, null), continuation);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        InHouseIMWebSocketSyncManagerImpl$internalReadAllConversationMessages$1 inHouseIMWebSocketSyncManagerImpl$internalReadAllConversationMessages$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof InHouseIMWebSocketSyncManagerImpl$internalReadAllConversationMessages$1) {
            inHouseIMWebSocketSyncManagerImpl$internalReadAllConversationMessages$1 = (InHouseIMWebSocketSyncManagerImpl$internalReadAllConversationMessages$1) continuation;
            int i = inHouseIMWebSocketSyncManagerImpl$internalReadAllConversationMessages$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMWebSocketSyncManagerImpl$internalReadAllConversationMessages$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMWebSocketSyncManagerImpl$internalReadAllConversationMessages$1 = new InHouseIMWebSocketSyncManagerImpl$internalReadAllConversationMessages$1(this, continuation);
            }
        }
        java.lang.Object obj = inHouseIMWebSocketSyncManagerImpl$internalReadAllConversationMessages$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMWebSocketSyncManagerImpl$internalReadAllConversationMessages$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                C44502sSe c44502sSe = this.wlaJM;
                inHouseIMWebSocketSyncManagerImpl$internalReadAllConversationMessages$1.L$0 = str;
                inHouseIMWebSocketSyncManagerImpl$internalReadAllConversationMessages$1.label = 1;
                if (c44502sSe.OLrzqt(str, inHouseIMWebSocketSyncManagerImpl$internalReadAllConversationMessages$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (java.lang.String) inHouseIMWebSocketSyncManagerImpl$internalReadAllConversationMessages$1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C44124sEe.AEQbTJ("read all messages => failed to send read receipt", thM7380exceptionOrNullimpl, str);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.util.Set<java.lang.String> set, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        InHouseIMWebSocketSyncManagerImpl$deleteConversationsMessages$1 inHouseIMWebSocketSyncManagerImpl$deleteConversationsMessages$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof InHouseIMWebSocketSyncManagerImpl$deleteConversationsMessages$1) {
            inHouseIMWebSocketSyncManagerImpl$deleteConversationsMessages$1 = (InHouseIMWebSocketSyncManagerImpl$deleteConversationsMessages$1) continuation;
            int i = inHouseIMWebSocketSyncManagerImpl$deleteConversationsMessages$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMWebSocketSyncManagerImpl$deleteConversationsMessages$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMWebSocketSyncManagerImpl$deleteConversationsMessages$1 = new InHouseIMWebSocketSyncManagerImpl$deleteConversationsMessages$1(this, continuation);
            }
        }
        java.lang.Object obj = inHouseIMWebSocketSyncManagerImpl$deleteConversationsMessages$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMWebSocketSyncManagerImpl$deleteConversationsMessages$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                C44502sSe c44502sSe = this.wlaJM;
                inHouseIMWebSocketSyncManagerImpl$deleteConversationsMessages$1.label = 1;
                if (c44502sSe.OLrzqt(set, inHouseIMWebSocketSyncManagerImpl$deleteConversationsMessages$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C44124sEe.imLogSync$default("failed delete conversation and messages", thM7380exceptionOrNullimpl, null, 4, null);
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC44301sKt
    public java.lang.Object KWHzl(@NotNull java.lang.String str, long j, @NotNull OKConversationType oKConversationType, @NotNull OKMessageContent oKMessageContent, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objAEQbTJ = this.sSMYrx.AEQbTJ(TaskPriority.HIGH, new InHouseIMWebSocketSyncManagerImpl$recallMessage$2(this, str, j, oKConversationType, null), continuation);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, long j, @NotNull OKConversationType oKConversationType, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        InHouseIMWebSocketSyncManagerImpl$internalRecallMessage$1 inHouseIMWebSocketSyncManagerImpl$internalRecallMessage$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof InHouseIMWebSocketSyncManagerImpl$internalRecallMessage$1) {
            inHouseIMWebSocketSyncManagerImpl$internalRecallMessage$1 = (InHouseIMWebSocketSyncManagerImpl$internalRecallMessage$1) continuation;
            int i = inHouseIMWebSocketSyncManagerImpl$internalRecallMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMWebSocketSyncManagerImpl$internalRecallMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMWebSocketSyncManagerImpl$internalRecallMessage$1 = new InHouseIMWebSocketSyncManagerImpl$internalRecallMessage$1(this, continuation);
            }
        }
        InHouseIMWebSocketSyncManagerImpl$internalRecallMessage$1 inHouseIMWebSocketSyncManagerImpl$internalRecallMessage$12 = inHouseIMWebSocketSyncManagerImpl$internalRecallMessage$1;
        java.lang.Object obj = inHouseIMWebSocketSyncManagerImpl$internalRecallMessage$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMWebSocketSyncManagerImpl$internalRecallMessage$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                C44502sSe c44502sSe = this.wlaJM;
                inHouseIMWebSocketSyncManagerImpl$internalRecallMessage$12.L$0 = str;
                inHouseIMWebSocketSyncManagerImpl$internalRecallMessage$12.J$0 = j;
                inHouseIMWebSocketSyncManagerImpl$internalRecallMessage$12.label = 1;
                if (c44502sSe.copydefault(str, j, oKConversationType, inHouseIMWebSocketSyncManagerImpl$internalRecallMessage$12) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = inHouseIMWebSocketSyncManagerImpl$internalRecallMessage$12.J$0;
                str = (java.lang.String) inHouseIMWebSocketSyncManagerImpl$internalRecallMessage$12.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C44124sEe.AEQbTJ("recall message[" + j + "] => failed to recall", thM7380exceptionOrNullimpl, str);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009b A[Catch: all -> 0x00cc, TryCatch #0 {all -> 0x00cc, blocks: (B:13:0x0035, B:36:0x00be, B:30:0x0095, B:32:0x009b, B:37:0x00c5, B:18:0x0046, B:25:0x005d, B:26:0x0072, B:28:0x0078, B:29:0x0086, B:21:0x004d), top: B:46:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5 A[Catch: all -> 0x00cc, TRY_LEAVE, TryCatch #0 {all -> 0x00cc, blocks: (B:13:0x0035, B:36:0x00be, B:30:0x0095, B:32:0x009b, B:37:0x00c5, B:18:0x0046, B:25:0x005d, B:26:0x0072, B:28:0x0078, B:29:0x0086, B:21:0x004d), top: B:46:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00bc -> B:36:0x00be). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        InHouseIMWebSocketSyncManagerImpl$invalidatePendingMessages$1 inHouseIMWebSocketSyncManagerImpl$invalidatePendingMessages$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        C44302sKu c44302sKu;
        java.util.Iterator it;
        if (continuation instanceof InHouseIMWebSocketSyncManagerImpl$invalidatePendingMessages$1) {
            inHouseIMWebSocketSyncManagerImpl$invalidatePendingMessages$1 = (InHouseIMWebSocketSyncManagerImpl$invalidatePendingMessages$1) continuation;
            int i = inHouseIMWebSocketSyncManagerImpl$invalidatePendingMessages$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMWebSocketSyncManagerImpl$invalidatePendingMessages$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMWebSocketSyncManagerImpl$invalidatePendingMessages$1 = new InHouseIMWebSocketSyncManagerImpl$invalidatePendingMessages$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = inHouseIMWebSocketSyncManagerImpl$invalidatePendingMessages$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMWebSocketSyncManagerImpl$invalidatePendingMessages$1.label;
        try {
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            Result.Application application2 = Result.Companion;
            C44502sSe c44502sSe = this.wlaJM;
            inHouseIMWebSocketSyncManagerImpl$invalidatePendingMessages$1.L$0 = this;
            inHouseIMWebSocketSyncManagerImpl$invalidatePendingMessages$1.label = 1;
            objOLrzqt = c44502sSe.OLrzqt(inHouseIMWebSocketSyncManagerImpl$invalidatePendingMessages$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c44302sKu = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.String str = (java.lang.String) inHouseIMWebSocketSyncManagerImpl$invalidatePendingMessages$1.L$2;
                it = (java.util.Iterator) inHouseIMWebSocketSyncManagerImpl$invalidatePendingMessages$1.L$1;
                C44302sKu c44302sKu2 = (C44302sKu) inHouseIMWebSocketSyncManagerImpl$invalidatePendingMessages$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                C44124sEe.imLogSync$default("invalidate pending messages => broadcast completed", null, str, 2, null);
                c44302sKu = c44302sKu2;
                if (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    java.util.List listAhwBna = yDY.AhwBna();
                    inHouseIMWebSocketSyncManagerImpl$invalidatePendingMessages$1.L$0 = c44302sKu;
                    inHouseIMWebSocketSyncManagerImpl$invalidatePendingMessages$1.L$1 = it;
                    inHouseIMWebSocketSyncManagerImpl$invalidatePendingMessages$1.L$2 = str2;
                    inHouseIMWebSocketSyncManagerImpl$invalidatePendingMessages$1.label = 2;
                    if (broadcastMessages$default(c44302sKu, str2, listAhwBna, true, null, inHouseIMWebSocketSyncManagerImpl$invalidatePendingMessages$1, 8, null) == objCopydefault) {
                        return objCopydefault;
                    }
                    c44302sKu2 = c44302sKu;
                    str = str2;
                    C44124sEe.imLogSync$default("invalidate pending messages => broadcast completed", null, str, 2, null);
                    c44302sKu = c44302sKu2;
                    if (it.hasNext()) {
                        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    }
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    C44124sEe.imLogSync$default("invalidate pending messages => failed", thM7380exceptionOrNullimpl, null, 4, null);
                }
                C56391yDq.AEQbTJ(objM7377constructorimpl);
                return Unit.INSTANCE;
            }
            c44302sKu = (C44302sKu) inHouseIMWebSocketSyncManagerImpl$invalidatePendingMessages$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        java.util.List<InHouseIMMessageEntity> listOLrzqt = ((C44502sSe.TaskDescription) objOLrzqt).OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        java.util.Iterator<T> it2 = listOLrzqt.iterator();
        while (it2.hasNext()) {
            arrayList.add(((InHouseIMMessageEntity) it2.next()).getChannelId());
        }
        java.util.HashSet hashSetQKudOq = CollectionsKt___CollectionsKt.QKudOq(arrayList);
        C44124sEe.imLogSync$default("invalidate pending messages => batch updated", null, null, 6, null);
        it = hashSetQKudOq.iterator();
        if (it.hasNext()) {
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        C56391yDq.AEQbTJ(objM7377constructorimpl);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        InHouseIMWebSocketSyncManagerImpl$initConnection$1 inHouseIMWebSocketSyncManagerImpl$initConnection$1;
        if (continuation instanceof InHouseIMWebSocketSyncManagerImpl$initConnection$1) {
            inHouseIMWebSocketSyncManagerImpl$initConnection$1 = (InHouseIMWebSocketSyncManagerImpl$initConnection$1) continuation;
            int i = inHouseIMWebSocketSyncManagerImpl$initConnection$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMWebSocketSyncManagerImpl$initConnection$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMWebSocketSyncManagerImpl$initConnection$1 = new InHouseIMWebSocketSyncManagerImpl$initConnection$1(this, continuation);
            }
        }
        java.lang.Object obj = inHouseIMWebSocketSyncManagerImpl$initConnection$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMWebSocketSyncManagerImpl$initConnection$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                C44124sEe.imLogSync$default("initConnection => init task queue", null, null, 6, null);
                this.sSMYrx.KWHzl();
                this.AxsJAY.copydefault();
                iwGUEr();
                InHouseIMWebSocketSyncManagerImpl$initConnection$2 inHouseIMWebSocketSyncManagerImpl$initConnection$2 = new InHouseIMWebSocketSyncManagerImpl$initConnection$2(this, null);
                inHouseIMWebSocketSyncManagerImpl$initConnection$1.label = 1;
                if (TimeoutKt.withTimeout(60000L, inHouseIMWebSocketSyncManagerImpl$initConnection$2, inHouseIMWebSocketSyncManagerImpl$initConnection$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
        } catch (TimeoutCancellationException e) {
            C44124sEe.imLogSync$default("initConnection => waiting connection state timeout", e, null, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull OKWsConnectionState oKWsConnectionState) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(oKWsConnectionState, "");
        this.KWHzl.tryEmit(oKWsConnectionState);
        if (StateListAnimator.AEQbTJ[oKWsConnectionState.ordinal()] == 1) {
            try {
                Result.Application application = Result.Companion;
                gEmmrt();
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                C44124sEe.imLogSync$default("initConnection: launch sync success", null, null, 6, null);
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                C44124sEe.imLogSync$default("initConnection: launch sync failed", thM7380exceptionOrNullimpl, null, 4, null);
            }
            Result.m7376boximpl(objM7377constructorimpl);
            return;
        }
        C44124sEe.imLogSync$default("connection state failure, cancel sync job", null, null, 6, null);
        Job job = this.RJOkX;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
    }

    public final void KWHzl(@NotNull InHouseIMResponse inHouseIMResponse) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(inHouseIMResponse, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(OLrzqt(inHouseIMResponse));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C44124sEe.imLogSync$default("initConnection: launch handleIncomingData failed", thM7380exceptionOrNullimpl, null, 4, null);
        }
    }

    public final void iwGUEr() {
        this.fIwbmz.clear();
        Job job = this.fJNWhG;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        CoroutineScope coroutineScope = this.DTwDnp;
        this.fJNWhG = coroutineScope != null ? BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new InHouseIMWebSocketSyncManagerImpl$initInboundMsgQueueJob$1(this, null), 3, null) : null;
    }

    public final Job OLrzqt(@NotNull InHouseIMResponse inHouseIMResponse) {
        Intrinsics.checkNotNullParameter(inHouseIMResponse, "");
        return BuildersKt__Builders_commonKt.launch$default(C44157sFk.getOrThrow$default(this.DTwDnp, (java.lang.String) null, 1, (java.lang.Object) null), null, null, new InHouseIMWebSocketSyncManagerImpl$handleIncomingResponse$1(inHouseIMResponse, this, null), 3, null);
    }

    public final java.lang.Object KWHzl(@NotNull JsonElement jsonElement, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objDecodeFromJsonElement;
        Job jobLaunch$default;
        try {
            objDecodeFromJsonElement = sHW.copydefault().KWHzl().decodeFromJsonElement(WSPushReaction.Companion.serializer(), jsonElement);
        } catch (SerializationException e) {
            pUU.copydefault("SafeJson", "decodeFromJsonElement SerializationException: " + e.getMessage());
            sSR.copydefault("decodeFromJsonElement SerializationException", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e.getMessage()))));
            objDecodeFromJsonElement = null;
        } catch (java.lang.Exception e2) {
            pUU.copydefault("SafeJson", "decodeFromJsonElement error: " + e2.getMessage());
            sSR.copydefault("decodeFromJsonElement Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e2.getMessage()))));
            objDecodeFromJsonElement = null;
        }
        WSPushReaction wSPushReaction = (WSPushReaction) objDecodeFromJsonElement;
        if (wSPushReaction == null) {
            return Unit.INSTANCE;
        }
        WSSendReactionResponse wSSendReactionResponseOLrzqt = wSPushReaction.OLrzqt();
        java.lang.String str = wSSendReactionResponseOLrzqt.OLrzqt() + ":" + wSSendReactionResponseOLrzqt.EZpvd();
        WSPushReaction wSPushReaction2 = this.zuBGHE.get(str);
        if (wSPushReaction2 != null && wSPushReaction2.OLrzqt().KWHzl() > wSSendReactionResponseOLrzqt.KWHzl()) {
            C44124sEe.imLogSync$default("WSPushReaction => ignoring new data for key: " + str + " as existing data is newer (existing: " + wSPushReaction2.OLrzqt().KWHzl() + " > new: " + wSSendReactionResponseOLrzqt.KWHzl() + ")", null, null, 6, null);
            return Unit.INSTANCE;
        }
        this.zuBGHE.put(str, wSPushReaction);
        Job job = this.gHZMYf.get(str);
        if (job != null && job.isActive()) {
            C44124sEe.imLogSync$default("WSPushReaction => cancelling existing job for key: " + str, null, null, 6, null);
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        CoroutineScope coroutineScope = this.DTwDnp;
        if (coroutineScope != null && (jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new InHouseIMWebSocketSyncManagerImpl$handleReactionPush$3(this, str, wSPushReaction, null), 3, null)) != null) {
            this.gHZMYf.put(str, jobLaunch$default);
            C44124sEe.imLogSync$default("WSPushReaction => started new job for key: " + str, null, null, 6, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:107:0x02d1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:112:? */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:115:? */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x0040 */
    /* JADX DEBUG: Type inference failed for r27v0. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x025d A[Catch: all -> 0x0061, TryCatch #1 {all -> 0x0061, blocks: (B:22:0x005b, B:84:0x0255, B:86:0x025d, B:87:0x0266, B:45:0x00ed, B:46:0x0100, B:48:0x0106, B:49:0x0121, B:51:0x0127, B:52:0x0158, B:53:0x0160, B:54:0x0169, B:56:0x016f, B:58:0x0180, B:60:0x018f, B:61:0x0199, B:62:0x01aa, B:64:0x01b0, B:65:0x01cd, B:67:0x01d3, B:68:0x01e5, B:79:0x0216, B:71:0x01f0, B:72:0x01f4, B:74:0x01fa, B:80:0x0223), top: B:113:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0266 A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #1 {all -> 0x0061, blocks: (B:22:0x005b, B:84:0x0255, B:86:0x025d, B:87:0x0266, B:45:0x00ed, B:46:0x0100, B:48:0x0106, B:49:0x0121, B:51:0x0127, B:52:0x0158, B:53:0x0160, B:54:0x0169, B:56:0x016f, B:58:0x0180, B:60:0x018f, B:61:0x0199, B:62:0x01aa, B:64:0x01b0, B:65:0x01cd, B:67:0x01d3, B:68:0x01e5, B:79:0x0216, B:71:0x01f0, B:72:0x01f4, B:74:0x01fa, B:80:0x0223), top: B:113:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02a1 A[Catch: all -> 0x02d1, TryCatch #2 {all -> 0x02d1, blocks: (B:97:0x029b, B:99:0x02a1, B:104:0x02cb, B:40:0x00e1, B:42:0x00e5, B:103:0x02ad, B:36:0x00c3), top: B:114:0x00c3 }] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, long j, @NotNull java.util.List<Reaction> list, long j2, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        InHouseIMWebSocketSyncManagerImpl$handleReactionData$1 inHouseIMWebSocketSyncManagerImpl$handleReactionData$1;
        ?? r3;
        ?? r4;
        java.lang.Object objM7377constructorimpl;
        ?? r42;
        java.lang.Object obj;
        java.lang.Object obj2;
        ?? r32;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        long j3;
        long j4;
        java.lang.String str2;
        java.util.List<Reaction> list2;
        C44302sKu c44302sKu;
        java.util.List<Reaction> list3;
        C44302sKu c44302sKu2;
        long j5;
        long j6;
        ?? r43;
        java.lang.String str3;
        long j7;
        long j8;
        java.lang.String str4;
        java.lang.String str5;
        boolean z;
        java.util.Iterator it;
        ?? r44;
        ?? r33;
        C44302sKu c44302sKu3;
        if (continuation instanceof InHouseIMWebSocketSyncManagerImpl$handleReactionData$1) {
            inHouseIMWebSocketSyncManagerImpl$handleReactionData$1 = (InHouseIMWebSocketSyncManagerImpl$handleReactionData$1) continuation;
            int i = inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMWebSocketSyncManagerImpl$handleReactionData$1 = new InHouseIMWebSocketSyncManagerImpl$handleReactionData$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        ?? r45 = inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.label;
        try {
        } catch (java.lang.Throwable th) {
            th = th;
            r3 = r45;
        }
        try {
            if (r45 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Mutex mutex = this.zsXlph;
                inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.L$0 = this;
                inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.L$1 = str;
                inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.L$2 = list;
                inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.L$3 = mutex;
                j3 = j;
                inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.J$0 = j3;
                j4 = j2;
                inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.J$1 = j4;
                inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.label = 1;
                if (mutex.lock(null, inHouseIMWebSocketSyncManagerImpl$handleReactionData$1) == objCopydefault) {
                    return objCopydefault;
                }
                str2 = str;
                list2 = list;
                c44302sKu = this;
                r4 = mutex;
            } else if (r45 == 1) {
                long j9 = inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.J$1;
                long j10 = inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.J$0;
                Mutex mutex2 = (Mutex) inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.L$3;
                list2 = (java.util.List) inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.L$2;
                str2 = (java.lang.String) inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.L$1;
                c44302sKu = (C44302sKu) inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                j3 = j10;
                j4 = j9;
                r4 = mutex2;
            } else {
                if (r45 != 2) {
                    if (r45 != 3) {
                        if (r45 != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r3 = (Mutex) inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.L$1;
                        c44302sKu3 = (C44302sKu) inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.L$0;
                        try {
                            C56391yDq.AEQbTJ(objEZpvd);
                            r33 = r3;
                            c44302sKu3.djBIcL();
                            r3 = r33;
                            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                            r32 = r3;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            try {
                                Result.Application application = Result.Companion;
                                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                                r32 = r3;
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                r4 = r3;
                                obj = null;
                                r42 = r4;
                                r42.unlock(obj);
                                throw th;
                            }
                        }
                        r4 = r32;
                        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                        if (thM7380exceptionOrNullimpl != null) {
                            C44124sEe.imLogSync$default("Handle Reaction => failed to process reaction update", thM7380exceptionOrNullimpl, null, 4, null);
                        }
                        obj2 = null;
                        Unit unit = Unit.INSTANCE;
                        r4.unlock(obj2);
                        return unit;
                    }
                    j7 = inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.J$1;
                    j8 = inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.J$0;
                    Mutex mutex3 = (Mutex) inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.L$2;
                    str4 = (java.lang.String) inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.L$1;
                    C44302sKu c44302sKu4 = (C44302sKu) inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    c44302sKu2 = c44302sKu4;
                    r44 = mutex3;
                    if (((java.lang.Boolean) objEZpvd).booleanValue()) {
                        C44124sEe.imLogSync$default("Handle Reaction => failed to update reactions", null, null, 6, null);
                        r3 = r44;
                        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                        r32 = r3;
                        r4 = r32;
                        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                        if (thM7380exceptionOrNullimpl != null) {
                        }
                        obj2 = null;
                        Unit unit2 = Unit.INSTANCE;
                        r4.unlock(obj2);
                        return unit2;
                    }
                    C44486sRp c44486sRp = c44302sKu2.AuCTelauCTel;
                    inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.L$0 = c44302sKu2;
                    inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.L$1 = r44;
                    inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.L$2 = null;
                    inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.label = 4;
                    if (c44486sRp.copydefault(str4, j8, j7, inHouseIMWebSocketSyncManagerImpl$handleReactionData$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    r33 = r44;
                    c44302sKu3 = c44302sKu2;
                    c44302sKu3.djBIcL();
                    r3 = r33;
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    r32 = r3;
                    r4 = r32;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    obj2 = null;
                    Unit unit22 = Unit.INSTANCE;
                    r4.unlock(obj2);
                    return unit22;
                }
                j5 = inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.J$1;
                j6 = inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.J$0;
                Mutex mutex4 = (Mutex) inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.L$3;
                list3 = (java.util.List) inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.L$2;
                str2 = (java.lang.String) inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.L$1;
                c44302sKu2 = (C44302sKu) inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objEZpvd);
                    r43 = mutex4;
                    str3 = (java.lang.String) objEZpvd;
                    if (str3 != null || str3.length() == 0) {
                        obj2 = null;
                        C44124sEe.imLogSync$default("Handle Reaction => cannot find message for reaction, channelId: " + str2 + ", seq: " + j6, null, null, 6, null);
                        r4 = r43;
                        Unit unit222 = Unit.INSTANCE;
                        r4.unlock(obj2);
                        return unit222;
                    }
                    Result.Application application2 = Result.Companion;
                    java.lang.String strCopydefault = C44157sFk.copydefault(C44157sFk.gEmmrt());
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (Reaction reaction : list3) {
                        java.util.List<UserUid> listAEQbTJ = reaction.AEQbTJ();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
                        for (java.util.Iterator it2 = listAEQbTJ.iterator(); it2.hasNext(); it2 = it2) {
                            UserUid userUid = (UserUid) it2.next();
                            arrayList2.add(new EmojiReactionEntity(0L, str3, reaction.copydefault(), userUid.EZpvd(), userUid.OLrzqt(), Intrinsics.EZpvd((java.lang.Object) userUid.OLrzqt(), (java.lang.Object) strCopydefault), 1, null));
                        }
                        C56406yEe.KWHzl(arrayList, arrayList2);
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    java.util.Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        java.lang.Object next = it3.next();
                        java.lang.String strCopydefault2 = ((Reaction) next).copydefault();
                        java.lang.Object obj3 = linkedHashMap.get(strCopydefault2);
                        if (obj3 == null) {
                            it = it3;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            linkedHashMap.put(strCopydefault2, arrayList3);
                            obj3 = arrayList3;
                        } else {
                            it = it3;
                        }
                        ((java.util.List) obj3).add(next);
                        it3 = it;
                    }
                    java.util.ArrayList arrayList4 = new java.util.ArrayList(linkedHashMap.size());
                    java.util.Iterator it4 = linkedHashMap.entrySet().iterator();
                    while (it4.hasNext()) {
                        Map.Entry entry = (Map.Entry) it4.next();
                        java.lang.String str6 = (java.lang.String) entry.getKey();
                        java.util.List list4 = (java.util.List) entry.getValue();
                        java.util.Iterator it5 = it4;
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        for (java.util.Iterator it6 = list4.iterator(); it6.hasNext(); it6 = it6) {
                            C56406yEe.KWHzl(arrayList5, ((Reaction) it6.next()).AEQbTJ());
                        }
                        int size = arrayList5.size();
                        if (!arrayList5.isEmpty()) {
                            java.util.Iterator it7 = arrayList5.iterator();
                            while (it7.hasNext()) {
                                java.util.Iterator it8 = it7;
                                if (Intrinsics.EZpvd((java.lang.Object) ((UserUid) it7.next()).OLrzqt(), (java.lang.Object) strCopydefault)) {
                                    str5 = strCopydefault;
                                    z = true;
                                    break;
                                }
                                it7 = it8;
                            }
                        }
                        z = false;
                        str5 = strCopydefault;
                        arrayList4.add(new ReactionDisplay(str6, size, z));
                        it4 = it5;
                        strCopydefault = str5;
                    }
                    c44302sKu2.AxsJAY.KWHzl(new InHouseIMWebSocketSyncManagerImpl$handleReactionData$2$1$1(c44302sKu2, str2, j6, arrayList4, null));
                    sMF smf = c44302sKu2.getFieldNames;
                    inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.L$0 = c44302sKu2;
                    inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.L$1 = str2;
                    inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.L$2 = r43;
                    inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.L$3 = null;
                    inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.J$0 = j6;
                    inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.J$1 = j5;
                    inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.label = 3;
                    objEZpvd = smf.AEQbTJ(str3, arrayList, inHouseIMWebSocketSyncManagerImpl$handleReactionData$1);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    j7 = j5;
                    j8 = j6;
                    str4 = str2;
                    r44 = r43;
                    if (((java.lang.Boolean) objEZpvd).booleanValue()) {
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    obj = null;
                    r42 = mutex4;
                    r42.unlock(obj);
                    throw th;
                }
            }
            C44486sRp c44486sRp2 = c44302sKu.AuCTelauCTel;
            inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.L$0 = c44302sKu;
            inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.L$1 = str2;
            inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.L$2 = list2;
            inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.L$3 = r4;
            inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.J$0 = j3;
            inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.J$1 = j4;
            inHouseIMWebSocketSyncManagerImpl$handleReactionData$1.label = 2;
            objEZpvd = c44486sRp2.EZpvd(str2, j3, inHouseIMWebSocketSyncManagerImpl$handleReactionData$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            list3 = list2;
            c44302sKu2 = c44302sKu;
            long j11 = j3;
            j5 = j4;
            j6 = j11;
            r43 = r4;
            str3 = (java.lang.String) objEZpvd;
            if (str3 != null) {
            }
            obj2 = null;
            C44124sEe.imLogSync$default("Handle Reaction => cannot find message for reaction, channelId: " + str2 + ", seq: " + j6, null, null, 6, null);
            r4 = r43;
            Unit unit2222 = Unit.INSTANCE;
            r4.unlock(obj2);
            return unit2222;
        } catch (java.lang.Throwable th5) {
            th = th5;
            obj = null;
            r42 = r4;
            r42.unlock(obj);
            throw th;
        }
    }

    public static final boolean AEQbTJ(Function1 function1, java.lang.Object obj) {
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean OLrzqt(C44302sKu c44302sKu, Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "");
        java.lang.Object key = entry.getKey();
        Intrinsics.checkNotNullExpressionValue(key, "");
        java.lang.String str = (java.lang.String) key;
        java.lang.Object value = entry.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (((Job) value).isActive()) {
            return false;
        }
        c44302sKu.zuBGHE.remove(str);
        return true;
    }

    public final void djBIcL() {
        java.util.Set<Map.Entry<java.lang.String, Job>> setEntrySet = this.gHZMYf.entrySet();
        final Function1 function1 = new Function1() { // from class: o.sKz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C44302sKu.OLrzqt(this.KWHzl, (Map.Entry) obj));
            }
        };
        setEntrySet.removeIf(new java.util.function.Predicate() { // from class: o.sKC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return C44302sKu.AEQbTJ(function1, obj);
            }
        });
    }

    @Override // o.InterfaceC44301sKt
    public void gEmmrt() {
        if (!C44157sFk.gEmmrt().values()) {
            C44124sEe.imLogSync$default("sync conversations => not logged in: skipping sync operations", null, null, 6, null);
            return;
        }
        Job job = this.RJOkX;
        if (job == null || !job.isActive()) {
            CoroutineScope coroutineScope = this.DTwDnp;
            this.RJOkX = coroutineScope != null ? BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new InHouseIMWebSocketSyncManagerImpl$syncConversations$1(this, null), 3, null) : null;
        } else {
            C44124sEe.imLogSync$default("sync conversations => already in progress", null, null, 6, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x018d -> B:47:0x018e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.util.List<InHouseIMConversationSimpleInfoEntity> list, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1 inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1;
        long jCurrentTimeMillis;
        C44302sKu c44302sKu;
        java.util.List<InHouseIMConversationSimpleInfoEntity> list2;
        C44302sKu c44302sKu2;
        java.util.Collection arrayList;
        java.util.Iterator it;
        if (continuation instanceof InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1) {
            inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1 = (InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1) continuation;
            int i = inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1 = new InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            sGI sgi = this.djBIcL;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((InHouseIMConversationSimpleInfoEntity) it2.next()).getChannelId());
            }
            inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1.L$0 = this;
            inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1.L$1 = list;
            inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1.J$0 = jCurrentTimeMillis;
            inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1.label = 1;
            objCopydefault = sgi.copydefault(arrayList2, inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c44302sKu = this;
        } else if (i2 == 1) {
            jCurrentTimeMillis = inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1.J$0;
            list = (java.util.List) inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1.L$1;
            c44302sKu = (C44302sKu) inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
                return Unit.INSTANCE;
            }
            arrayList = (java.util.Collection) inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1.L$4;
            it = (java.util.Iterator) inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1.L$3;
            java.util.Collection collection = (java.util.Collection) inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1.L$2;
            list2 = (java.util.List) inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1.L$1;
            c44302sKu2 = (C44302sKu) inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            arrayList.add((Job) objCopydefault);
            arrayList = collection;
            if (it.hasNext()) {
                java.util.List list3 = (java.util.List) it.next();
                sMV smv = c44302sKu2.sSMYrx;
                TaskPriority taskPriority = TaskPriority.LOW;
                InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1 inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1 = new InHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1(list3, c44302sKu2, list2, null);
                inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1.L$0 = c44302sKu2;
                inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1.L$1 = list2;
                inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1.L$2 = arrayList;
                inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1.L$3 = it;
                inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1.L$4 = arrayList;
                inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1.label = 2;
                objCopydefault = smv.AEQbTJ(taskPriority, inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$jobs$1$1, inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                collection = arrayList;
                arrayList.add((Job) objCopydefault);
                arrayList = collection;
                if (it.hasNext()) {
                    inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1.L$0 = null;
                    inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1.L$1 = null;
                    inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1.L$2 = null;
                    inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1.L$3 = null;
                    inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1.L$4 = null;
                    inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1.label = 3;
                    if (AwaitKt.joinAll((java.util.List) arrayList, inHouseIMWebSocketSyncManagerImpl$syncConversationBatch$1) == objCopydefault2) {
                        return objCopydefault2;
                    }
                    return Unit.INSTANCE;
                }
            }
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt((java.util.List) objCopydefault, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
        long jLongValue = ((java.lang.Number) pairOLrzqt.getSecond()).longValue();
        java.util.List list4 = (java.util.List) pairOLrzqt.getFirst();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(list4, 10));
        java.util.Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((InHouseIMServerConversationEntity) it3.next()).getChannelId());
        }
        C44124sEe.logSyncAnalysis$default("sync conversations => api call time:" + jLongValue + ", syncListIds:" + arrayList3, null, null, 6, null);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj : list4) {
            if (c44302sKu.fetchVPNInfo.AEQbTJ((InHouseIMServerConversationEntity) obj)) {
                arrayList4.add(obj);
            }
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList(C56403yEb.AYXKKw(list4, 10));
        java.util.Iterator it4 = list4.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((InHouseIMServerConversationEntity) it4.next()).getChannelId());
        }
        C44124sEe.logSyncAnalysis$default("sync conversations => filteredSyncListIds :" + arrayList5, null, null, 6, null);
        java.util.List listValueOf = CollectionsKt___CollectionsKt.valueOf((java.lang.Iterable) arrayList4, 10);
        list2 = list;
        c44302sKu2 = c44302sKu;
        arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listValueOf, 10));
        it = listValueOf.iterator();
        if (it.hasNext()) {
        }
    }

    /* JADX INFO: renamed from: o.sKu$ActionBar */
    public static final class ActionBar {
        public final long AEQbTJ;
        public final java.lang.String EZpvd;
        public final long KWHzl;
        public final long OLrzqt;
        public final long copydefault;
        public final int gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(@NotNull java.lang.String str, long j, int i, long j2, long j3, long j4) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(str, j, i, j2, j3, j4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd) && this.OLrzqt == actionBar.OLrzqt && this.gEmmrt == actionBar.gEmmrt && this.KWHzl == actionBar.KWHzl && this.copydefault == actionBar.copydefault && this.AEQbTJ == actionBar.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((this.EZpvd.hashCode() * 31) + java.lang.Long.hashCode(this.OLrzqt)) * 31) + java.lang.Integer.hashCode(this.gEmmrt)) * 31) + java.lang.Long.hashCode(this.KWHzl)) * 31) + java.lang.Long.hashCode(this.copydefault)) * 31) + java.lang.Long.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SyncConversationTransactionResult(channelId=" + this.EZpvd + ", timeCostSyncMessage=" + this.OLrzqt + ", totalOfMessages=" + this.gEmmrt + ", timeCostBroadcastMessage=" + this.KWHzl + ", timeCostLoadCurrentConversation=" + this.copydefault + ", timeCostNotifySyncUnreadCountUpdates=" + this.AEQbTJ + ")";
        }

        public ActionBar(@NotNull java.lang.String str, long j, int i, long j2, long j3, long j4) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
            this.OLrzqt = j;
            this.gEmmrt = i;
            this.KWHzl = j2;
            this.copydefault = j3;
            this.AEQbTJ = j4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x01b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, long j, @NotNull Continuation<? super ActionBar> continuation) throws java.lang.Exception {
        InHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$1 inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$1;
        java.lang.Throwable th;
        int i;
        C44302sKu c44302sKu;
        sNO sno;
        long j2;
        long j3;
        long jLongValue;
        long jCurrentTimeMillis;
        InHouseIMConversationEntity inHouseIMConversationEntity;
        java.util.List<sFA.TaskDescription> listAhwBna;
        C44302sKu c44302sKu2;
        java.util.List list;
        java.lang.String str2;
        long j4;
        long j5;
        long j6;
        java.lang.String str3 = str;
        if (continuation instanceof InHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$1) {
            inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$1 = (InHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$1) continuation;
            int i2 = inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$1.label = i2 - Integer.MIN_VALUE;
            } else {
                inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$1 = new InHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$1(this, continuation);
            }
        }
        InHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$1 inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12 = inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$1;
        java.lang.Object objEZpvd = inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            th = null;
            sNO sno2 = new sNO(str, C56443yFo.KWHzl(j), 200, null, true, 0, false, 32, null);
            i = 2;
            C44124sEe.imLogSync$default("sync => starting from: " + sno2.djBIcL() + ", total=" + sno2.AhwBna(), null, str3, 2, null);
            long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
            C44484sRn c44484sRn = this.valueOf;
            inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.L$0 = this;
            inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.L$1 = str3;
            inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.L$2 = sno2;
            inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.J$0 = j;
            inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.J$1 = jCurrentTimeMillis2;
            inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.label = 1;
            objEZpvd = c44484sRn.EZpvd(str3, inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c44302sKu = this;
            sno = sno2;
            j2 = j;
            j3 = jCurrentTimeMillis2;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j4 = inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.J$2;
                    long j7 = inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.J$1;
                    long j8 = inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.J$0;
                    list = (java.util.List) inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.L$3;
                    inHouseIMConversationEntity = (InHouseIMConversationEntity) inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.L$2;
                    java.lang.String str4 = (java.lang.String) inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.L$1;
                    C44302sKu c44302sKu3 = (C44302sKu) inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    th = null;
                    c44302sKu2 = c44302sKu3;
                    str2 = str4;
                    j6 = j8;
                    j5 = j7;
                    long jCurrentTimeMillis3 = java.lang.System.currentTimeMillis() - j4;
                    C44124sEe.logSyncAnalysis$default("sync conversations => timeCostBroadcastMessage:" + jCurrentTimeMillis3, th, str2, 2, th);
                    long jCurrentTimeMillis4 = java.lang.System.currentTimeMillis();
                    if (inHouseIMConversationEntity != null) {
                        c44302sKu2.OLrzqt(str2, inHouseIMConversationEntity);
                    }
                    long jCurrentTimeMillis5 = java.lang.System.currentTimeMillis() - jCurrentTimeMillis4;
                    C44124sEe.logSyncAnalysis$default("sync conversations => timeCostNotifySyncUnreadCountUpdates:" + jCurrentTimeMillis5, th, str2, 2, th);
                    return new ActionBar(str2, j5, list.size(), jCurrentTimeMillis3, j6, jCurrentTimeMillis5);
                }
                jCurrentTimeMillis = inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.J$1;
                long j9 = inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.J$0;
                InHouseIMConversationEntity inHouseIMConversationEntity2 = (InHouseIMConversationEntity) inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.L$2;
                java.lang.String str5 = (java.lang.String) inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.L$1;
                c44302sKu = (C44302sKu) inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                inHouseIMConversationEntity = inHouseIMConversationEntity2;
                str3 = str5;
                th = null;
                jLongValue = j9;
                kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt((java.util.List) objEZpvd, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
                java.util.List list2 = (java.util.List) pairOLrzqt.component1();
                long jLongValue2 = ((java.lang.Number) pairOLrzqt.component2()).longValue();
                C44124sEe.logSyncAnalysis$default("sync conversations => timeCostSyncMessage:" + jLongValue2, th, str3, 2, th);
                long jCurrentTimeMillis6 = java.lang.System.currentTimeMillis();
                listAhwBna = yDY.AhwBna();
                inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.L$0 = c44302sKu;
                inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.L$1 = str3;
                inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.L$2 = inHouseIMConversationEntity;
                inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.L$3 = list2;
                inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.J$0 = jLongValue;
                inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.J$1 = jLongValue2;
                inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.J$2 = jCurrentTimeMillis6;
                inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.label = 3;
                c44302sKu2 = c44302sKu;
                if (c44302sKu.EZpvd(str3, listAhwBna, true, inHouseIMConversationEntity, inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12) != objCopydefault) {
                    return objCopydefault;
                }
                list = list2;
                str2 = str3;
                j4 = jCurrentTimeMillis6;
                j5 = jLongValue2;
                j6 = jLongValue;
                long jCurrentTimeMillis32 = java.lang.System.currentTimeMillis() - j4;
                C44124sEe.logSyncAnalysis$default("sync conversations => timeCostBroadcastMessage:" + jCurrentTimeMillis32, th, str2, 2, th);
                long jCurrentTimeMillis42 = java.lang.System.currentTimeMillis();
                if (inHouseIMConversationEntity != null) {
                }
                long jCurrentTimeMillis52 = java.lang.System.currentTimeMillis() - jCurrentTimeMillis42;
                C44124sEe.logSyncAnalysis$default("sync conversations => timeCostNotifySyncUnreadCountUpdates:" + jCurrentTimeMillis52, th, str2, 2, th);
                return new ActionBar(str2, j5, list.size(), jCurrentTimeMillis32, j6, jCurrentTimeMillis52);
            }
            long j10 = inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.J$1;
            j2 = inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.J$0;
            sNO sno3 = (sNO) inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.L$2;
            java.lang.String str6 = (java.lang.String) inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.L$1;
            c44302sKu = (C44302sKu) inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            str3 = str6;
            th = null;
            sno = sno3;
            j3 = j10;
            i = 2;
        }
        kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt((InHouseIMConversationEntity) objEZpvd, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - j3));
        InHouseIMConversationEntity inHouseIMConversationEntity3 = (InHouseIMConversationEntity) pairOLrzqt2.component1();
        jLongValue = ((java.lang.Number) pairOLrzqt2.component2()).longValue();
        C44124sEe.logSyncAnalysis$default("sync conversations => timeCostLoadCurrentConversation:" + jLongValue, th, str3, i, th);
        jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        C44502sSe c44502sSe = c44302sKu.wlaJM;
        java.lang.Long lKWHzl = C56443yFo.KWHzl(j2);
        inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.L$0 = c44302sKu;
        inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.L$1 = str3;
        inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.L$2 = inHouseIMConversationEntity3;
        inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.J$0 = jLongValue;
        inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.J$1 = jCurrentTimeMillis;
        inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.label = 2;
        objEZpvd = c44502sSe.OLrzqt(sno, lKWHzl, inHouseIMConversationEntity3, inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        inHouseIMConversationEntity = inHouseIMConversationEntity3;
        kotlin.Pair pairOLrzqt3 = C56390yDp.OLrzqt((java.util.List) objEZpvd, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
        java.util.List list22 = (java.util.List) pairOLrzqt3.component1();
        long jLongValue22 = ((java.lang.Number) pairOLrzqt3.component2()).longValue();
        C44124sEe.logSyncAnalysis$default("sync conversations => timeCostSyncMessage:" + jLongValue22, th, str3, 2, th);
        long jCurrentTimeMillis62 = java.lang.System.currentTimeMillis();
        listAhwBna = yDY.AhwBna();
        inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.L$0 = c44302sKu;
        inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.L$1 = str3;
        inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.L$2 = inHouseIMConversationEntity;
        inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.L$3 = list22;
        inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.J$0 = jLongValue;
        inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.J$1 = jLongValue22;
        inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.J$2 = jCurrentTimeMillis62;
        inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12.label = 3;
        c44302sKu2 = c44302sKu;
        if (c44302sKu.EZpvd(str3, listAhwBna, true, inHouseIMConversationEntity, inHouseIMWebSocketSyncManagerImpl$syncConversationTransactions$12) != objCopydefault) {
        }
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull InHouseIMConversationEntity inHouseIMConversationEntity) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(inHouseIMConversationEntity, "");
        OKConversation oKConversationOLrzqt = C44169sFw.OLrzqt(inHouseIMConversationEntity);
        C44124sEe.imLogSync$default("sync => isEnded=true, requesting refresh conversation[" + oKConversationOLrzqt.getTargetId() + "]", null, str, 2, null);
        this.AxsJAY.KWHzl(new InHouseIMWebSocketSyncManagerImpl$notifySyncUnreadCountUpdates$1(this, oKConversationOLrzqt, str, null));
    }

    public static /* synthetic */ java.lang.Object broadcastMessages$default(C44302sKu c44302sKu, java.lang.String str, java.util.List list, boolean z, InHouseIMConversationEntity inHouseIMConversationEntity, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            inHouseIMConversationEntity = null;
        }
        return c44302sKu.EZpvd(str, list, z, inHouseIMConversationEntity, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x034d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02ae  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x034e -> B:108:0x0357). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<sFA.TaskDescription> list, boolean z, InHouseIMConversationEntity inHouseIMConversationEntity, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        InHouseIMWebSocketSyncManagerImpl$broadcastMessages$1 inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1;
        C44302sKu c44302sKu;
        java.util.Iterator it;
        InHouseIMWebSocketSyncManagerImpl$broadcastMessages$1 inHouseIMWebSocketSyncManagerImpl$broadcastMessages$12;
        java.lang.String str2;
        boolean z2;
        C44302sKu c44302sKu2;
        InHouseIMConversationEntity inHouseIMConversationEntity2;
        java.lang.Object objM7377constructorimpl;
        C44302sKu c44302sKu3;
        java.lang.String str3;
        java.util.Iterator it2;
        sFA.TaskDescription taskDescription;
        boolean z3;
        java.lang.String str4;
        sJW sjw;
        java.util.Set<java.lang.String> setOLrzqt;
        java.lang.Throwable th;
        char c;
        OKMessage oKMessageCopy;
        sFA.TaskDescription taskDescription2;
        C44302sKu c44302sKu4;
        java.util.Iterator it3;
        java.lang.String str5 = str;
        if (continuation instanceof InHouseIMWebSocketSyncManagerImpl$broadcastMessages$1) {
            inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1 = (InHouseIMWebSocketSyncManagerImpl$broadcastMessages$1) continuation;
            int i = inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1 = new InHouseIMWebSocketSyncManagerImpl$broadcastMessages$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.label;
        java.lang.Throwable th2 = null;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            java.lang.String strCopydefault = C44157sFk.copydefault(C44157sFk.gEmmrt());
            if (!z) {
                c44302sKu = this;
                it = list.iterator();
                inHouseIMWebSocketSyncManagerImpl$broadcastMessages$12 = inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1;
                str2 = strCopydefault;
                z2 = z;
                if (it.hasNext()) {
                }
                return Unit.INSTANCE;
            }
            if (inHouseIMConversationEntity == null) {
                try {
                    Result.Application application = Result.Companion;
                    C44484sRn c44484sRn = this.valueOf;
                    inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.L$0 = this;
                    inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.L$1 = str5;
                    inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.label = 1;
                    objEZpvd = c44484sRn.EZpvd(str5, inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    c44302sKu2 = this;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    c44302sKu2 = this;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            } else {
                inHouseIMConversationEntity2 = inHouseIMConversationEntity;
                c44302sKu2 = this;
                C44124sEe.imLogSync$default("broadcast messages => refresh whole conversation", null, str5, 2, null);
                if (inHouseIMConversationEntity2 != null) {
                    c44302sKu2.AxsJAY.KWHzl(new InHouseIMWebSocketSyncManagerImpl$broadcastMessages$2(str5, c44302sKu2, sPI.copydefault(inHouseIMConversationEntity2.getChannelType()), null));
                }
                return Unit.INSTANCE;
            }
        } else if (i2 == 1) {
            str5 = (java.lang.String) inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.L$1;
            c44302sKu2 = (C44302sKu) inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
            } catch (java.lang.Throwable th4) {
                th = th4;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z4 = inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.Z$0;
                java.util.Iterator it4 = (java.util.Iterator) inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.L$3;
                java.lang.String str6 = (java.lang.String) inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.L$2;
                java.lang.String str7 = (java.lang.String) inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.L$1;
                C44302sKu c44302sKu5 = (C44302sKu) inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                z2 = z4;
                it = it4;
                c = 3;
                th = null;
                str5 = str7;
                c44302sKu = c44302sKu5;
                inHouseIMWebSocketSyncManagerImpl$broadcastMessages$12 = inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1;
                str2 = str6;
                th2 = th;
                if (it.hasNext()) {
                    sFA.TaskDescription taskDescription3 = (sFA.TaskDescription) it.next();
                    for (InHouseIMMessageWithReactions inHouseIMMessageWithReactions : taskDescription3.EZpvd()) {
                        OKMessage oKMessageOLrzqt = C44169sFw.OLrzqt(inHouseIMMessageWithReactions);
                        C44124sEe.imLogSync$default("broadcasting message[" + inHouseIMMessageWithReactions.getImMessageEntity().getSeq() + "]", th2, inHouseIMMessageWithReactions.getImMessageEntity().getChannelId(), 2, th2);
                        if (oKMessageOLrzqt != null) {
                            taskDescription2 = taskDescription3;
                            c44302sKu4 = c44302sKu;
                            it3 = it;
                            c44302sKu.AxsJAY.KWHzl(new InHouseIMWebSocketSyncManagerImpl$broadcastMessages$3$1$1(inHouseIMMessageWithReactions, c44302sKu, oKMessageOLrzqt, z2, null));
                        } else {
                            taskDescription2 = taskDescription3;
                            c44302sKu4 = c44302sKu;
                            it3 = it;
                        }
                        taskDescription3 = taskDescription2;
                        it = it3;
                        c44302sKu = c44302sKu4;
                        th2 = null;
                    }
                    sFA.TaskDescription taskDescription4 = taskDescription3;
                    C44302sKu c44302sKu6 = c44302sKu;
                    java.util.Iterator it5 = it;
                    for (InHouseIMMessageWithReactions inHouseIMMessageWithReactions2 : taskDescription4.AEQbTJ()) {
                        OKMessage oKMessageOLrzqt2 = C44169sFw.OLrzqt(inHouseIMMessageWithReactions2);
                        if (oKMessageOLrzqt2 != null) {
                            c44302sKu6.AxsJAY.KWHzl(new InHouseIMWebSocketSyncManagerImpl$broadcastMessages$3$2$1(inHouseIMMessageWithReactions2, c44302sKu6, oKMessageOLrzqt2, null));
                        }
                    }
                    java.util.List<InHouseIMMessageWithReactions> listCopydefault = taskDescription4.copydefault();
                    java.util.ArrayList<InHouseIMMessageWithReactions> arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : listCopydefault) {
                        if (((InHouseIMMessageWithReactions) obj).getImMessageEntity().getReadReceiptSequence() != null) {
                            arrayList.add(obj);
                        }
                    }
                    for (InHouseIMMessageWithReactions inHouseIMMessageWithReactions3 : arrayList) {
                        OKMessage oKMessageOLrzqt3 = C44169sFw.OLrzqt(inHouseIMMessageWithReactions3);
                        C44124sEe.imLogSync$default("broadcast messages => read message seq=" + inHouseIMMessageWithReactions3.getImMessageEntity().getSeq() + ", okMessage=" + oKMessageOLrzqt3 + ", currentUserId=" + str2, null, inHouseIMMessageWithReactions3.getImMessageEntity().getChannelId(), 2, null);
                        if (oKMessageOLrzqt3 != null && !Intrinsics.EZpvd((java.lang.Object) oKMessageOLrzqt3.getSenderUserId(), (java.lang.Object) str2)) {
                            c44302sKu6.AxsJAY.KWHzl(new InHouseIMWebSocketSyncManagerImpl$broadcastMessages$3$4$1(inHouseIMMessageWithReactions3, oKMessageOLrzqt3, str2, c44302sKu6, null));
                        }
                    }
                    java.util.List<InHouseIMMessageWithReactions> listCopydefault2 = taskDescription4.copydefault();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj2 : listCopydefault2) {
                        if (((InHouseIMMessageWithReactions) obj2).getImMessageEntity().getRecallMessage() != null) {
                            arrayList2.add(obj2);
                        }
                    }
                    java.util.Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        InHouseIMMessageWithReactions inHouseIMMessageWithReactions4 = (InHouseIMMessageWithReactions) it6.next();
                        RecallMessageData recallMessage = inHouseIMMessageWithReactions4.getImMessageEntity().getRecallMessage();
                        java.lang.Long msgSeq = recallMessage != null ? recallMessage.getMsgSeq() : null;
                        OKMessageContent oKMessageContent$default = C44169sFw.toOKMessageContent$default(inHouseIMMessageWithReactions4.getImMessageEntity(), false, 1, null);
                        OKRecallNotificationMessage oKRecallNotificationMessage = oKMessageContent$default instanceof OKRecallNotificationMessage ? (OKRecallNotificationMessage) oKMessageContent$default : null;
                        if (msgSeq != null) {
                            long jLongValue = msgSeq.longValue();
                            OKMessage oKMessageOLrzqt4 = C44169sFw.OLrzqt(inHouseIMMessageWithReactions4);
                            oKMessageCopy = oKMessageOLrzqt4 != null ? oKMessageOLrzqt4.copy((262143 & 1) != 0 ? oKMessageOLrzqt4.seq : jLongValue, (262143 & 2) != 0 ? oKMessageOLrzqt4.clientMessageId : null, (262143 & 4) != 0 ? oKMessageOLrzqt4.targetId : null, (262143 & 8) != 0 ? oKMessageOLrzqt4.senderUserId : null, (262143 & 16) != 0 ? oKMessageOLrzqt4.messageType : null, (262143 & 32) != 0 ? oKMessageOLrzqt4.conversationType : null, (262143 & 64) != 0 ? oKMessageOLrzqt4.sentTime : 0L, (262143 & 128) != 0 ? oKMessageOLrzqt4.receivedTime : 0L, (262143 & 256) != 0 ? oKMessageOLrzqt4.extra : null, (262143 & 512) != 0 ? oKMessageOLrzqt4.objectName : null, (262143 & 1024) != 0 ? oKMessageOLrzqt4.messageDirection : null, (262143 & 2048) != 0 ? oKMessageOLrzqt4.sentStatus : null, (262143 & 4096) != 0 ? oKMessageOLrzqt4.content : null, (262143 & 8192) != 0 ? oKMessageOLrzqt4.messagePushConfig : null, (262143 & 16384) != 0 ? oKMessageOLrzqt4.sourceJsonString : null, (262143 & 32768) != 0 ? oKMessageOLrzqt4.isVisible : false, (262143 & 65536) != 0 ? oKMessageOLrzqt4.error : null, (262143 & 131072) != 0 ? oKMessageOLrzqt4.reactionDisplay : null) : null;
                        }
                        java.lang.String channelId = inHouseIMMessageWithReactions4.getImMessageEntity().getChannelId();
                        long seq = inHouseIMMessageWithReactions4.getImMessageEntity().getSeq();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        java.util.Iterator it7 = it6;
                        sb.append("broadcast messages => recalled message seq=");
                        sb.append(seq);
                        sb.append(", recallMsgId=");
                        sb.append(msgSeq);
                        sb.append(", okMessage=");
                        sb.append(oKMessageCopy);
                        sb.append(", recallNotification=");
                        sb.append(oKRecallNotificationMessage);
                        C44124sEe.imLogSync$default(sb.toString(), null, channelId, 2, null);
                        if (oKMessageCopy != null && oKRecallNotificationMessage != null) {
                            c44302sKu6.AxsJAY.KWHzl(new InHouseIMWebSocketSyncManagerImpl$broadcastMessages$3$6$1(inHouseIMMessageWithReactions4, oKMessageCopy, c44302sKu6, oKRecallNotificationMessage, null));
                        }
                        it6 = it7;
                    }
                    sJZ sjz = c44302sKu6.zLjUOn;
                    java.util.Set<java.lang.String> setValueOf = taskDescription4.valueOf();
                    inHouseIMWebSocketSyncManagerImpl$broadcastMessages$12.L$0 = c44302sKu6;
                    inHouseIMWebSocketSyncManagerImpl$broadcastMessages$12.L$1 = str5;
                    inHouseIMWebSocketSyncManagerImpl$broadcastMessages$12.L$2 = str2;
                    inHouseIMWebSocketSyncManagerImpl$broadcastMessages$12.L$3 = it5;
                    inHouseIMWebSocketSyncManagerImpl$broadcastMessages$12.L$4 = taskDescription4;
                    inHouseIMWebSocketSyncManagerImpl$broadcastMessages$12.Z$0 = z2;
                    inHouseIMWebSocketSyncManagerImpl$broadcastMessages$12.label = 2;
                    if (sjz.KWHzl(str5, setValueOf, inHouseIMWebSocketSyncManagerImpl$broadcastMessages$12) == objCopydefault) {
                        return objCopydefault;
                    }
                    str3 = str2;
                    inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1 = inHouseIMWebSocketSyncManagerImpl$broadcastMessages$12;
                    c44302sKu3 = c44302sKu6;
                    taskDescription = taskDescription4;
                    it2 = it5;
                    java.lang.String str8 = str5;
                    z3 = z2;
                    str4 = str8;
                    sjw = c44302sKu3.uzCIH;
                    setOLrzqt = taskDescription.OLrzqt();
                    inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.L$0 = c44302sKu3;
                    inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.L$1 = str4;
                    inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.L$2 = str3;
                    inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.L$3 = it2;
                    th = null;
                    inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.L$4 = null;
                    inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.Z$0 = z3;
                    c = 3;
                    inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.label = 3;
                    if (sjw.AEQbTJ(str4, setOLrzqt, inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1) != objCopydefault) {
                        return objCopydefault;
                    }
                    inHouseIMWebSocketSyncManagerImpl$broadcastMessages$12 = inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1;
                    it = it2;
                    str2 = str3;
                    c44302sKu = c44302sKu3;
                    boolean z5 = z3;
                    str5 = str4;
                    z2 = z5;
                    th2 = th;
                    if (it.hasNext()) {
                    }
                }
                return Unit.INSTANCE;
            }
            z3 = inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.Z$0;
            taskDescription = (sFA.TaskDescription) inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.L$4;
            it2 = (java.util.Iterator) inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.L$3;
            str3 = (java.lang.String) inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.L$2;
            java.lang.String str9 = (java.lang.String) inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.L$1;
            C44302sKu c44302sKu7 = (C44302sKu) inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            str4 = str9;
            c44302sKu3 = c44302sKu7;
            sjw = c44302sKu3.uzCIH;
            setOLrzqt = taskDescription.OLrzqt();
            inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.L$0 = c44302sKu3;
            inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.L$1 = str4;
            inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.L$2 = str3;
            inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.L$3 = it2;
            th = null;
            inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.L$4 = null;
            inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.Z$0 = z3;
            c = 3;
            inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1.label = 3;
            if (sjw.AEQbTJ(str4, setOLrzqt, inHouseIMWebSocketSyncManagerImpl$broadcastMessages$1) != objCopydefault) {
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((InHouseIMConversationEntity) objEZpvd);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        inHouseIMConversationEntity2 = (InHouseIMConversationEntity) objM7377constructorimpl;
        C44124sEe.imLogSync$default("broadcast messages => refresh whole conversation", null, str5, 2, null);
        if (inHouseIMConversationEntity2 != null) {
        }
        return Unit.INSTANCE;
    }

    public final java.lang.Object OLrzqt(@NotNull java.util.List<WSSendMessageDetailData> list, boolean z, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new InHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactions$2(list, this, z, null), continuation);
        return objCoroutineScope == C56442yFn.copydefault() ? objCoroutineScope : Unit.INSTANCE;
    }

    public final java.lang.Object OLrzqt(@NotNull java.util.List<WSSendMessageDetailData> list, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new InHouseIMWebSocketSyncManagerImpl$updateInboundGroupInfoTransactions$2(list, this, null), continuation);
        return objCoroutineScope == C56442yFn.copydefault() ? objCoroutineScope : Unit.INSTANCE;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:101:0x002b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:26:0x008d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:75:0x01ce */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:89:? */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0158 A[Catch: all -> 0x01a2, TryCatch #1 {all -> 0x01a2, blocks: (B:56:0x0154, B:58:0x0158, B:60:0x015e, B:62:0x0173, B:52:0x013e), top: B:88:0x013e }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0173 A[Catch: all -> 0x01a2, TRY_LEAVE, TryCatch #1 {all -> 0x01a2, blocks: (B:56:0x0154, B:58:0x0158, B:60:0x015e, B:62:0x0173, B:52:0x013e), top: B:88:0x013e }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a5 A[Catch: all -> 0x01ce, TryCatch #8 {all -> 0x01ce, blocks: (B:64:0x0188, B:70:0x01bc, B:72:0x01c2, B:69:0x01a5), top: B:101:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.util.List<WSSendMessageDetailData> list, boolean z, @NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        InHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1 inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1;
        ?? r6;
        boolean z2;
        int i;
        java.lang.String str2;
        java.lang.Object objKWHzl;
        java.util.List<WSSendMessageDetailData> list2;
        java.lang.String str3;
        java.lang.Object obj;
        C44302sKu c44302sKu;
        boolean z3;
        sFA.TaskDescription taskDescription;
        java.util.List<WSSendMessageDetailData> list3;
        java.lang.String str4;
        C44302sKu c44302sKu2;
        sFA.TaskDescription taskDescription2;
        C44302sKu c44302sKu3;
        java.util.List<WSSendMessageDetailData> list4;
        java.lang.String str5;
        InHouseIMConversationEntity inHouseIMConversationEntity;
        sFA sfa;
        C44486sRp c44486sRp;
        C44484sRn c44484sRn;
        C44485sRo c44485sRo;
        InHouseIMConversationService inHouseIMConversationServiceAYXKKw;
        C44489sRs c44489sRs;
        sMF smf;
        C44272sJr c44272sJr;
        int i2;
        java.lang.String str6 = "insert incoming message => requesting refresh conversation[";
        if (!(continuation instanceof InHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1) || (r6 = (i2 = (inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1 = (InHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1) continuation).label) & Integer.MIN_VALUE) == 0) {
            inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1 = new InHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1(this, continuation);
        } else {
            inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1.label = i2 - Integer.MIN_VALUE;
        }
        java.lang.Object obj2 = inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1.label;
        ?? r5 = 1;
        r5 = 1;
        try {
            if (i3 != 0) {
                try {
                    if (i3 == 1) {
                        boolean z4 = inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1.Z$0;
                        java.util.List<WSSendMessageDetailData> list5 = (java.util.List) inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1.L$2;
                        java.lang.String str7 = (java.lang.String) inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1.L$1;
                        C44302sKu c44302sKu4 = (C44302sKu) inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1.L$0;
                        C56391yDq.AEQbTJ(obj2);
                        z2 = z4;
                        i = 2;
                        str2 = "]";
                        objKWHzl = obj2;
                        list2 = list5;
                        str3 = str7;
                        obj = objCopydefault;
                        c44302sKu = c44302sKu4;
                        try {
                            sFA.TaskDescription taskDescription3 = (sFA.TaskDescription) objKWHzl;
                            if (!z2) {
                                try {
                                    java.util.List listEZpvd = C56402yEa.EZpvd(taskDescription3);
                                    inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1.L$0 = c44302sKu;
                                    inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1.L$1 = str3;
                                    inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1.L$2 = list2;
                                    inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1.L$3 = taskDescription3;
                                    inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1.Z$0 = z2;
                                    inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1.label = i;
                                    if (broadcastMessages$default(c44302sKu, str3, listEZpvd, false, null, inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1, 8, null) == obj) {
                                        return obj;
                                    }
                                    str4 = str3;
                                    list3 = list2;
                                    z3 = z2;
                                    c44302sKu2 = c44302sKu;
                                    taskDescription = taskDescription3;
                                    C44124sEe.imLogSync$default("insert incoming message => broadcast new transactions", null, str4, i, null);
                                    z2 = z3;
                                    taskDescription2 = taskDescription;
                                    list4 = list3;
                                    str5 = str4;
                                    c44302sKu = c44302sKu2;
                                    if (z2) {
                                    }
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    r6 = str3;
                                    r5 = list2;
                                    str6 = str2;
                                    C44124sEe.AEQbTJ("insert incoming message => failed to insert new transactions, size=[" + r5.size() + str6, th, (java.lang.String) r6);
                                    throw new java.lang.Exception("conversation[" + r6 + "]:insert incoming message => failed to insert new transactions, size=[" + r5.size() + str6, th);
                                }
                            } else {
                                C44124sEe.imLogSync$default("insert incoming message => not broadcast new transactions: isNotifyUI=" + z2, null, str3, i, null);
                                str5 = str3;
                                list4 = list2;
                                taskDescription2 = taskDescription3;
                                if (z2) {
                                }
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            str6 = str2;
                            r6 = str3;
                            r5 = list2;
                            C44124sEe.AEQbTJ("insert incoming message => failed to insert new transactions, size=[" + r5.size() + str6, th, (java.lang.String) r6);
                            throw new java.lang.Exception("conversation[" + r6 + "]:insert incoming message => failed to insert new transactions, size=[" + r5.size() + str6, th);
                        }
                    } else if (i3 == 2) {
                        z3 = inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1.Z$0;
                        taskDescription = (sFA.TaskDescription) inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1.L$3;
                        list3 = (java.util.List) inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1.L$2;
                        str4 = (java.lang.String) inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1.L$1;
                        c44302sKu2 = (C44302sKu) inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1.L$0;
                        try {
                            C56391yDq.AEQbTJ(obj2);
                            i = 2;
                            str2 = "]";
                            obj = objCopydefault;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            r5 = list3;
                            r6 = str4;
                            str6 = "]";
                            C44124sEe.AEQbTJ("insert incoming message => failed to insert new transactions, size=[" + r5.size() + str6, th, (java.lang.String) r6);
                            throw new java.lang.Exception("conversation[" + r6 + "]:insert incoming message => failed to insert new transactions, size=[" + r5.size() + str6, th);
                        }
                        try {
                            C44124sEe.imLogSync$default("insert incoming message => broadcast new transactions", null, str4, i, null);
                            z2 = z3;
                            taskDescription2 = taskDescription;
                            list4 = list3;
                            str5 = str4;
                            c44302sKu = c44302sKu2;
                            if (z2) {
                                try {
                                    C44484sRn c44484sRn2 = c44302sKu.valueOf;
                                    inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1.L$0 = c44302sKu;
                                    inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1.L$1 = str5;
                                    inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1.L$2 = list4;
                                    inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1.L$3 = taskDescription2;
                                    inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1.label = 3;
                                    java.lang.Object objEZpvd = c44484sRn2.EZpvd(str5, inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1);
                                    if (objEZpvd == obj) {
                                        return obj;
                                    }
                                    obj2 = objEZpvd;
                                    c44302sKu3 = c44302sKu;
                                    list4 = list4;
                                    str5 = str5;
                                    inHouseIMConversationEntity = (InHouseIMConversationEntity) obj2;
                                    if (inHouseIMConversationEntity == null) {
                                    }
                                    C44124sEe.imLogSync$default("insert incoming message => requesting refresh conversation[" + (inHouseIMConversationEntity == null ? inHouseIMConversationEntity.getChannelId() : null), null, str5, i, null);
                                    if (inHouseIMConversationEntity == null) {
                                    }
                                    c44302sKu = c44302sKu3;
                                    r5 = list4;
                                    r6 = str5;
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                    r5 = list4;
                                    r6 = str5;
                                    str6 = str2;
                                    C44124sEe.AEQbTJ("insert incoming message => failed to insert new transactions, size=[" + r5.size() + str6, th, (java.lang.String) r6);
                                    throw new java.lang.Exception("conversation[" + r6 + "]:insert incoming message => failed to insert new transactions, size=[" + r5.size() + str6, th);
                                }
                            } else {
                                str6 = str2;
                                C44124sEe.imLogSync$default("insert incoming message => not requesting refresh conversation: isNotifyUI=" + z2, null, str5, i, null);
                                r5 = list4;
                                r6 = str5;
                            }
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            r5 = list3;
                            r6 = str4;
                            str6 = str2;
                            C44124sEe.AEQbTJ("insert incoming message => failed to insert new transactions, size=[" + r5.size() + str6, th, (java.lang.String) r6);
                            throw new java.lang.Exception("conversation[" + r6 + "]:insert incoming message => failed to insert new transactions, size=[" + r5.size() + str6, th);
                        }
                    } else {
                        if (i3 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        taskDescription2 = (sFA.TaskDescription) inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1.L$3;
                        java.util.List<WSSendMessageDetailData> list6 = (java.util.List) inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1.L$2;
                        java.lang.String str8 = (java.lang.String) inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1.L$1;
                        c44302sKu3 = (C44302sKu) inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1.L$0;
                        C56391yDq.AEQbTJ(obj2);
                        i = 2;
                        str2 = "]";
                        list4 = list6;
                        str5 = str8;
                        inHouseIMConversationEntity = (InHouseIMConversationEntity) obj2;
                        C44124sEe.imLogSync$default("insert incoming message => requesting refresh conversation[" + (inHouseIMConversationEntity == null ? inHouseIMConversationEntity.getChannelId() : null), null, str5, i, null);
                        if (inHouseIMConversationEntity == null) {
                            OKConversation oKConversationOLrzqt = C44169sFw.OLrzqt(inHouseIMConversationEntity);
                            java.lang.String targetId = oKConversationOLrzqt.getTargetId();
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append("insert incoming message => requesting refresh conversation[");
                            sb.append(targetId);
                            str6 = str2;
                            sb.append(str6);
                            C44124sEe.imLogSync$default(sb.toString(), null, str5, i, null);
                            c44302sKu3.AxsJAY.KWHzl(new InHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$2(c44302sKu3, oKConversationOLrzqt, str5, null));
                        } else {
                            str6 = str2;
                        }
                        c44302sKu = c44302sKu3;
                        r5 = list4;
                        r6 = str5;
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                }
            } else {
                C56391yDq.AEQbTJ(obj2);
                try {
                    sfa = sFA.KWHzl;
                    c44486sRp = this.AuCTelauCTel;
                    c44484sRn = this.valueOf;
                    c44485sRo = this.gEmmrt;
                    inHouseIMConversationServiceAYXKKw = AYXKKw();
                    c44489sRs = this.QbewEr;
                    smf = this.getFieldNames;
                    c44272sJr = this.ejfBZ;
                    inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1.L$0 = this;
                    inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1.L$1 = str;
                    inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1.L$2 = list;
                    inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1.Z$0 = z;
                    inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1.label = 1;
                    i = 2;
                    str2 = "]";
                    obj = objCopydefault;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    str6 = "]";
                }
                try {
                    objKWHzl = sfa.KWHzl(c44486sRp, c44484sRn, c44485sRo, inHouseIMConversationServiceAYXKKw, str, list, false, c44489sRs, smf, c44272sJr, inHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactionsPerChannel$1);
                    if (objKWHzl == obj) {
                        return obj;
                    }
                    c44302sKu = this;
                    str3 = str;
                    list2 = list;
                    z2 = z;
                    sFA.TaskDescription taskDescription32 = (sFA.TaskDescription) objKWHzl;
                    if (!z2) {
                    }
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    str6 = str2;
                    r6 = str;
                    r5 = list;
                    C44124sEe.AEQbTJ("insert incoming message => failed to insert new transactions, size=[" + r5.size() + str6, th, (java.lang.String) r6);
                    throw new java.lang.Exception("conversation[" + r6 + "]:insert incoming message => failed to insert new transactions, size=[" + r5.size() + str6, th);
                }
            }
            InHouseIMMessageEntity inHouseIMMessageEntityKWHzl = taskDescription2.KWHzl();
            if (inHouseIMMessageEntityKWHzl != null) {
                C56443yFo.KWHzl(c44302sKu.AuCTel.tryEmit(inHouseIMMessageEntityKWHzl));
            }
            return Unit.INSTANCE;
        } catch (java.lang.Throwable th9) {
            th = th9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0087 -> B:20:0x008a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.util.Set<java.lang.String> set, @NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        InHouseIMWebSocketSyncManagerImpl$processCallMessages$1 inHouseIMWebSocketSyncManagerImpl$processCallMessages$1;
        C44302sKu c44302sKu;
        java.util.Collection arrayList;
        java.util.Iterator it;
        MutableStateFlow<java.util.List<InHouseIMMessageEntity>> mutableStateFlow;
        if (continuation instanceof InHouseIMWebSocketSyncManagerImpl$processCallMessages$1) {
            inHouseIMWebSocketSyncManagerImpl$processCallMessages$1 = (InHouseIMWebSocketSyncManagerImpl$processCallMessages$1) continuation;
            int i = inHouseIMWebSocketSyncManagerImpl$processCallMessages$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMWebSocketSyncManagerImpl$processCallMessages$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMWebSocketSyncManagerImpl$processCallMessages$1 = new InHouseIMWebSocketSyncManagerImpl$processCallMessages$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = inHouseIMWebSocketSyncManagerImpl$processCallMessages$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = inHouseIMWebSocketSyncManagerImpl$processCallMessages$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            C44124sEe.imLogVoiceCall$default("sync:processCallMessages conversationIds=" + set, null, 2, null);
            MutableStateFlow<java.util.List<InHouseIMMessageEntity>> mutableStateFlow2 = this.hDKMBd;
            c44302sKu = this;
            arrayList = new java.util.ArrayList();
            it = set.iterator();
            mutableStateFlow = mutableStateFlow2;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableStateFlow = (MutableStateFlow) inHouseIMWebSocketSyncManagerImpl$processCallMessages$1.L$3;
            it = (java.util.Iterator) inHouseIMWebSocketSyncManagerImpl$processCallMessages$1.L$2;
            arrayList = (java.util.Collection) inHouseIMWebSocketSyncManagerImpl$processCallMessages$1.L$1;
            c44302sKu = (C44302sKu) inHouseIMWebSocketSyncManagerImpl$processCallMessages$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            InHouseIMMessageEntity inHouseIMMessageEntity = (InHouseIMMessageEntity) objCopydefault;
            if (inHouseIMMessageEntity != null) {
                arrayList.add(inHouseIMMessageEntity);
            }
            if (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                C44486sRp c44486sRp = c44302sKu.AuCTelauCTel;
                inHouseIMWebSocketSyncManagerImpl$processCallMessages$1.L$0 = c44302sKu;
                inHouseIMWebSocketSyncManagerImpl$processCallMessages$1.L$1 = arrayList;
                inHouseIMWebSocketSyncManagerImpl$processCallMessages$1.L$2 = it;
                inHouseIMWebSocketSyncManagerImpl$processCallMessages$1.L$3 = mutableStateFlow;
                inHouseIMWebSocketSyncManagerImpl$processCallMessages$1.label = 1;
                objCopydefault = c44486sRp.copydefault(str, inHouseIMWebSocketSyncManagerImpl$processCallMessages$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                InHouseIMMessageEntity inHouseIMMessageEntity2 = (InHouseIMMessageEntity) objCopydefault;
                if (inHouseIMMessageEntity2 != null) {
                }
                if (it.hasNext()) {
                    mutableStateFlow.tryEmit((java.util.List) arrayList);
                    return Unit.INSTANCE;
                }
            }
        }
    }

    @Override // o.InterfaceC44301sKt
    public java.lang.Object AEQbTJ(@NotNull sNO sno, @NotNull Continuation<? super java.util.List<InHouseIMMessageWithReactions>> continuation) {
        this.QbewEr.OLrzqt();
        return C44502sSe.loadMessageWithReactionResult$default(this.wlaJM, sno, null, null, continuation, 6, null);
    }

    @Override // o.InterfaceC44301sKt
    public void OLrzqt(@NotNull java.lang.String str, long j) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(str, "");
        this.QbewEr.OLrzqt();
        this.wlaJM.KWHzl(str, j);
    }

    @Override // o.InterfaceC44301sKt
    public java.lang.Object OLrzqt(@NotNull sNO sno, @NotNull Continuation<? super java.util.List<InHouseIMMessageWithReactions>> continuation) {
        return this.wlaJM.KWHzl(sno, continuation);
    }

    @Override // o.InterfaceC44301sKt
    public java.lang.Object EZpvd(@NotNull sNH snh, @NotNull Continuation<? super sNQ> continuation) {
        return this.wlaJM.KWHzl(snh, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC44301sKt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        InHouseIMWebSocketSyncManagerImpl$markAllConversationsAsRead$1 inHouseIMWebSocketSyncManagerImpl$markAllConversationsAsRead$1;
        if (continuation instanceof InHouseIMWebSocketSyncManagerImpl$markAllConversationsAsRead$1) {
            inHouseIMWebSocketSyncManagerImpl$markAllConversationsAsRead$1 = (InHouseIMWebSocketSyncManagerImpl$markAllConversationsAsRead$1) continuation;
            int i = inHouseIMWebSocketSyncManagerImpl$markAllConversationsAsRead$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMWebSocketSyncManagerImpl$markAllConversationsAsRead$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMWebSocketSyncManagerImpl$markAllConversationsAsRead$1 = new InHouseIMWebSocketSyncManagerImpl$markAllConversationsAsRead$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = inHouseIMWebSocketSyncManagerImpl$markAllConversationsAsRead$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMWebSocketSyncManagerImpl$markAllConversationsAsRead$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            sMV smv = this.sSMYrx;
            TaskPriority taskPriority = TaskPriority.HIGH;
            InHouseIMWebSocketSyncManagerImpl$markAllConversationsAsRead$2 inHouseIMWebSocketSyncManagerImpl$markAllConversationsAsRead$2 = new InHouseIMWebSocketSyncManagerImpl$markAllConversationsAsRead$2(this, null);
            inHouseIMWebSocketSyncManagerImpl$markAllConversationsAsRead$1.label = 1;
            objAEQbTJ = smv.AEQbTJ(taskPriority, inHouseIMWebSocketSyncManagerImpl$markAllConversationsAsRead$2, inHouseIMWebSocketSyncManagerImpl$markAllConversationsAsRead$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
                return C56443yFo.KWHzl(true);
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        inHouseIMWebSocketSyncManagerImpl$markAllConversationsAsRead$1.label = 2;
        if (((Job) objAEQbTJ).join(inHouseIMWebSocketSyncManagerImpl$markAllConversationsAsRead$1) == objCopydefault) {
            return objCopydefault;
        }
        return C56443yFo.KWHzl(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC44301sKt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        InHouseIMWebSocketSyncManagerImpl$markConversationAsReadLocally$1 inHouseIMWebSocketSyncManagerImpl$markConversationAsReadLocally$1;
        if (continuation instanceof InHouseIMWebSocketSyncManagerImpl$markConversationAsReadLocally$1) {
            inHouseIMWebSocketSyncManagerImpl$markConversationAsReadLocally$1 = (InHouseIMWebSocketSyncManagerImpl$markConversationAsReadLocally$1) continuation;
            int i = inHouseIMWebSocketSyncManagerImpl$markConversationAsReadLocally$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMWebSocketSyncManagerImpl$markConversationAsReadLocally$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMWebSocketSyncManagerImpl$markConversationAsReadLocally$1 = new InHouseIMWebSocketSyncManagerImpl$markConversationAsReadLocally$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = inHouseIMWebSocketSyncManagerImpl$markConversationAsReadLocally$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMWebSocketSyncManagerImpl$markConversationAsReadLocally$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            sMV smv = this.sSMYrx;
            TaskPriority taskPriority = TaskPriority.HIGH;
            InHouseIMWebSocketSyncManagerImpl$markConversationAsReadLocally$2 inHouseIMWebSocketSyncManagerImpl$markConversationAsReadLocally$2 = new InHouseIMWebSocketSyncManagerImpl$markConversationAsReadLocally$2(this, str, null);
            inHouseIMWebSocketSyncManagerImpl$markConversationAsReadLocally$1.label = 1;
            objAEQbTJ = smv.AEQbTJ(taskPriority, inHouseIMWebSocketSyncManagerImpl$markConversationAsReadLocally$2, inHouseIMWebSocketSyncManagerImpl$markConversationAsReadLocally$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
                return C56443yFo.KWHzl(true);
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        inHouseIMWebSocketSyncManagerImpl$markConversationAsReadLocally$1.label = 2;
        if (((Job) objAEQbTJ).join(inHouseIMWebSocketSyncManagerImpl$markConversationAsReadLocally$1) == objCopydefault) {
            return objCopydefault;
        }
        return C56443yFo.KWHzl(true);
    }

    @Override // o.InterfaceC44301sKt
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.Long> list, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new InHouseIMWebSocketSyncManagerImpl$syncMessageReactions$2(this, str, list, null), continuation);
        return objCoroutineScope == C56442yFn.copydefault() ? objCoroutineScope : Unit.INSTANCE;
    }
}
