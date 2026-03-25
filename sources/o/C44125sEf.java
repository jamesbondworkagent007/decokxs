package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.okinc.core.livelistener.OKWsConnectionState;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.channel.inhouse.InHouseMessenger$getLatestCustomMessageFlow$1;
import com.okinc.okimcore.channel.inhouse.InHouseMessenger$getLatestCustomMessageFlow$2;
import com.okinc.okimcore.channel.inhouse.InHouseMessenger$getLatestCustomMessageFlow$3;
import com.okinc.okimcore.feature.storage.repository.remote.InHouseIMUploadMediaService;
import com.okinc.okimcore.model.im.ChannelConnectionStatus;
import com.okinc.okimcore.model.im.MessengerConnectionStatus;
import com.okinc.okimcore.model.im.OKCustomMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.inhouseim.ws.CallMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.FrontendOption;
import com.okinc.okimcore.model.im.inhouseim.ws.GroupInvitationMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.ImageMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMPlatformType;
import com.okinc.okimcore.model.im.inhouseim.ws.MediaMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.ReadReceiptMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.SenderName;
import com.okinc.okimcore.model.im.inhouseim.ws.ShareMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.StickerMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.StreamPlaceHolderMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.TextMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.VideoMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.VoiceMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionResponse;
import com.okinc.okimcore.model.other.OKRecallNotificationMessage;
import com.okinc.okimcore.model.remote.BroadcastMessageRequest;
import com.okinc.okimcore.model.remote.CreateBroadcastChannelRequest;
import com.okinc.okimcore.model.remote.CreateBroadcastChannelResponse;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import dagger.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sEf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C44125sEf extends AbstractC44292sKk {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final android.content.Context AEQbTJ;
    public final MutableStateFlow<java.util.List<InHouseIMMessageEntity>> AhwBna;
    public final sFU KWHzl;
    public final InterfaceC44123sEd OLrzqt;
    public final Lazy<sHU> copydefault;
    public final MutableSharedFlow<InHouseIMMessageEntity> djBIcL;
    public final InHouseIMUploadMediaService gEmmrt;

    /* JADX INFO: renamed from: o.sEf$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKWsConnectionState.values().length];
            try {
                iArr[OKWsConnectionState.OPEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKWsConnectionState.CLOSED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OKWsConnectionState.FAILURE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC44304sKw
    public sFU OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sKH
    public StateFlow<java.util.List<InHouseIMMessageEntity>> gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sKH
    public SharedFlow<InHouseIMMessageEntity> valueOf() {
        return this.djBIcL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C44125sEf(@NotNull InHouseIMUploadMediaService inHouseIMUploadMediaService, @NotNull InterfaceC44123sEd interfaceC44123sEd, @yCL(AEQbTJ = "latestCallMessagesStateFlow") @NotNull MutableStateFlow<java.util.List<InHouseIMMessageEntity>> mutableStateFlow, @yCL(AEQbTJ = "groupVoiceCallSharedFlow") @NotNull MutableSharedFlow<InHouseIMMessageEntity> mutableSharedFlow, @NotNull sFU sfu, @NotNull Lazy<sHU> lazy, @NotNull sKD skd, @NotNull sGF sgf, @NotNull sHZ shz, @NotNull android.content.Context context, @NotNull CoroutineScope coroutineScope) {
        super(shz, skd, sgf, coroutineScope);
        Intrinsics.checkNotNullParameter(inHouseIMUploadMediaService, "");
        Intrinsics.checkNotNullParameter(interfaceC44123sEd, "");
        Intrinsics.checkNotNullParameter(mutableStateFlow, "");
        Intrinsics.checkNotNullParameter(mutableSharedFlow, "");
        Intrinsics.checkNotNullParameter(sfu, "");
        Intrinsics.checkNotNullParameter(lazy, "");
        Intrinsics.checkNotNullParameter(skd, "");
        Intrinsics.checkNotNullParameter(sgf, "");
        Intrinsics.checkNotNullParameter(shz, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.gEmmrt = inHouseIMUploadMediaService;
        this.OLrzqt = interfaceC44123sEd;
        this.AhwBna = mutableStateFlow;
        this.djBIcL = mutableSharedFlow;
        this.KWHzl = sfu;
        this.copydefault = lazy;
        this.AEQbTJ = context;
    }

    /* JADX INFO: renamed from: o.sEf$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sEf.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.InterfaceC44304sKw
    public void AkhnZx() {
        this.copydefault.get().copydefault();
        sGJ sgj = sGJ.copydefault;
        sgj.OLrzqt(null);
        sgj.KWHzl(null);
        sgj.EZpvd(null);
    }

    /* JADX INFO: renamed from: o.sEf$Activity */
    public static final class Activity implements InterfaceC44228sIa {
        public final /* synthetic */ yHT<OKMessage, java.lang.Boolean, java.lang.String, Continuation<? super Unit>, java.lang.Object> AEQbTJ;
        public final /* synthetic */ Function2<OKMessage, OKRecallNotificationMessage, Unit> KWHzl;
        public final /* synthetic */ Function1<OKMessage, Unit> OLrzqt;
        public final /* synthetic */ Function1<OKMessage, Unit> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHT<? super com.okinc.okimcore.model.im.OKMessage, ? super java.lang.Boolean, ? super java.lang.String, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.okimcore.model.im.OKMessage, ? super com.okinc.okimcore.model.other.OKRecallNotificationMessage, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.okimcore.model.im.OKMessage, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.okimcore.model.im.OKMessage, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(yHT<? super OKMessage, ? super java.lang.Boolean, ? super java.lang.String, ? super Continuation<? super Unit>, ? extends java.lang.Object> yht, Function2<? super OKMessage, ? super OKRecallNotificationMessage, Unit> function2, Function1<? super OKMessage, Unit> function1, Function1<? super OKMessage, Unit> function12) {
            this.AEQbTJ = yht;
            this.KWHzl = function2;
            this.copydefault = function1;
            this.OLrzqt = function12;
        }

        @Override // o.InterfaceC44228sIa
        public java.lang.Object EZpvd(OKMessage oKMessage, boolean z, Continuation<? super Unit> continuation) {
            java.lang.Object objInvoke = this.AEQbTJ.invoke(oKMessage, C56443yFo.KWHzl(z), null, continuation);
            return objInvoke == C56442yFn.copydefault() ? objInvoke : Unit.INSTANCE;
        }

        @Override // o.InterfaceC44228sIa
        public void AEQbTJ(OKMessage oKMessage, OKRecallNotificationMessage oKRecallNotificationMessage) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            Intrinsics.checkNotNullParameter(oKRecallNotificationMessage, "");
            this.KWHzl.invoke(oKMessage, oKRecallNotificationMessage);
        }

        @Override // o.InterfaceC44228sIa
        public void OLrzqt(OKMessage oKMessage) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            this.copydefault.invoke(oKMessage);
        }

        @Override // o.InterfaceC44228sIa
        public void EZpvd(OKMessage oKMessage) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            this.OLrzqt.invoke(oKMessage);
        }
    }

    @Override // o.InterfaceC44304sKw
    public void AEQbTJ(@NotNull yHT<? super OKMessage, ? super java.lang.Boolean, ? super java.lang.String, ? super Continuation<? super Unit>, ? extends java.lang.Object> yht, @NotNull Function2<? super OKMessage, ? super OKRecallNotificationMessage, Unit> function2, @NotNull Function1<? super OKMessage, Unit> function1, @NotNull Function1<? super OKMessage, Unit> function12) {
        Intrinsics.checkNotNullParameter(yht, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.copydefault.get().OLrzqt(new Activity(yht, function2, function1, function12));
    }

    @Override // o.sKH
    public java.lang.String fetchVPNInfo() {
        return this.copydefault.get().isConnected();
    }

    @Override // o.sKH
    public StateFlow<sNJ> EZpvd() {
        return this.copydefault.get().AYXKKw();
    }

    @Override // o.sKH
    public SharedFlow<C44391sOb> djBIcL() {
        return this.copydefault.get().AhwBna();
    }

    @Override // o.sKH
    public MessengerConnectionStatus AYXKKw() {
        int i = Application.KWHzl[this.copydefault.get().gEmmrt().ordinal()];
        if (i == 1) {
            return MessengerConnectionStatus.Connected;
        }
        if (i == 2) {
            return MessengerConnectionStatus.Disconnected;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return MessengerConnectionStatus.Failure;
    }

    @Override // o.sKH
    public void DbNXlk() {
        this.copydefault.get().DbNXlk();
    }

    @Override // o.sKH
    public void AEQbTJ() {
        this.copydefault.get().OLrzqt(new Function1() { // from class: o.sEb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44125sEf.OLrzqt(this.KWHzl, (ChannelConnectionStatus) obj);
            }
        });
        this.copydefault.get().KWHzl(new Function1() { // from class: o.sEc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44125sEf.AEQbTJ(this.OLrzqt, (java.lang.String) obj);
            }
        });
        this.copydefault.get().EZpvd();
    }

    public static final Unit OLrzqt(C44125sEf c44125sEf, ChannelConnectionStatus channelConnectionStatus) {
        Intrinsics.checkNotNullParameter(channelConnectionStatus, "");
        c44125sEf.AEQbTJ(channelConnectionStatus);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C44125sEf c44125sEf, java.lang.String str) {
        c44125sEf.KWHzl(str);
        return Unit.INSTANCE;
    }

    @Override // o.sKH
    public void copydefault() {
        this.copydefault.get().copydefault();
    }

    @Override // o.sKH
    public java.lang.Object AEQbTJ(@NotNull CreateBroadcastChannelRequest createBroadcastChannelRequest, @NotNull Continuation<? super ResponseData<CreateBroadcastChannelResponse>> continuation) {
        return this.OLrzqt.AEQbTJ(createBroadcastChannelRequest, continuation);
    }

    @Override // o.sKH
    public java.lang.Object OLrzqt(long j, @NotNull OKMessageContent oKMessageContent, @NotNull Continuation<? super WSSendMessageDetailData> continuation) {
        return C44169sFw.toWSSendMessageDetailData$default(oKMessageContent, this.gEmmrt, new WSSendMessageDetailData(C44157sFk.copydefault(C44157sFk.gEmmrt()), java.lang.String.valueOf(j), (InHouseIMContentType) null, (InHouseIMChannelType) null, (InHouseIMPlatformType) null, (java.lang.Long) null, (TextMessageData) null, (ImageMessageData) null, (VideoMessageData) null, (VoiceMessageData) null, (ShareMessageData) null, (CallMessageData) null, (WSSendMessageDetailData) null, (CustomMessageData) null, (SystemMessageData) null, (StickerMessageData) null, (ReadReceiptMessageData) null, (RecallMessageData) null, (RecallMessageData) null, (GroupInvitationMessageData) null, (StreamPlaceHolderMessageData) null, (StreamPlaceHolderMessageData) null, (MediaMessageData) null, (SenderName) null, (java.lang.Long) null, (JsonElement) null, (java.lang.Integer) null, (java.lang.String) null, (java.util.List) null, (FrontendOption) null, (java.lang.Long) null, (WSSendReactionResponse) null, (java.util.List) null, -36, 1, (DefaultConstructorMarker) null), this.AEQbTJ, true, null, continuation, 16, null);
    }

    @Override // o.sKH
    public java.lang.Object EZpvd(long j, @NotNull OKMessageContent oKMessageContent, @NotNull Continuation<? super WSSendMessageDetailData> continuation) {
        return C44169sFw.toWSSendMessageDetailData$default(oKMessageContent, null, new WSSendMessageDetailData(C44157sFk.copydefault(C44157sFk.gEmmrt()), java.lang.String.valueOf(j), (InHouseIMContentType) null, (InHouseIMChannelType) null, (InHouseIMPlatformType) null, (java.lang.Long) null, (TextMessageData) null, (ImageMessageData) null, (VideoMessageData) null, (VoiceMessageData) null, (ShareMessageData) null, (CallMessageData) null, (WSSendMessageDetailData) null, (CustomMessageData) null, (SystemMessageData) null, (StickerMessageData) null, (ReadReceiptMessageData) null, (RecallMessageData) null, (RecallMessageData) null, (GroupInvitationMessageData) null, (StreamPlaceHolderMessageData) null, (StreamPlaceHolderMessageData) null, (MediaMessageData) null, (SenderName) null, (java.lang.Long) null, (JsonElement) null, (java.lang.Integer) null, (java.lang.String) null, (java.util.List) null, (FrontendOption) null, (java.lang.Long) null, (WSSendReactionResponse) null, (java.util.List) null, -36, 1, (DefaultConstructorMarker) null), this.AEQbTJ, true, null, continuation, 16, null);
    }

    @Override // o.sKH
    public java.lang.Object EZpvd(long j, @NotNull WSSendMessageDetailData wSSendMessageDetailData, @NotNull Continuation<? super ResponseData<java.lang.Object>> continuation) {
        return this.OLrzqt.AEQbTJ(new BroadcastMessageRequest(j, wSSendMessageDetailData), continuation);
    }

    public final boolean AEQbTJ(OKMessage oKMessage, java.lang.String str) {
        OKMessageContent content = oKMessage.getContent();
        return content != null && (content instanceof OKCustomMessage) && Intrinsics.EZpvd((java.lang.Object) ((OKCustomMessage) content).getServiceName(), (java.lang.Object) str);
    }

    @Override // o.sKH
    public Flow<OKMessage> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return FlowKt.flowOn(FlowKt.onEach(FlowKt.onStart(FlowKt.callbackFlow(new InHouseMessenger$getLatestCustomMessageFlow$1(this, str, str2, null)), new InHouseMessenger$getLatestCustomMessageFlow$2(str, str2, null)), new InHouseMessenger$getLatestCustomMessageFlow$3(null)), sDN.copydefault.copydefault());
    }

    /* JADX INFO: renamed from: o.sEf$ActionBar */
    public static final class ActionBar extends MutableLiveData<MessengerConnectionStatus> {
        public final TaskDescription OLrzqt = new TaskDescription();

        /* JADX INFO: renamed from: o.sEf$ActionBar$TaskDescription */
        public static final class TaskDescription implements InterfaceC44287sKf {
            public TaskDescription() {
            }

            @Override // o.InterfaceC44287sKf
            public void KWHzl(ChannelConnectionStatus channelConnectionStatus) {
                Intrinsics.checkNotNullParameter(channelConnectionStatus, "");
                ActionBar actionBar = ActionBar.this;
                actionBar.setValue(actionBar.copydefault());
            }
        }

        public ActionBar() {
        }

        public final MessengerConnectionStatus copydefault() {
            return C44125sEf.this.AYXKKw();
        }

        @Override // androidx.lifecycle.LiveData
        public void onActive() {
            super.onActive();
            C44125sEf.this.fIwbmz().AEQbTJ(this.OLrzqt);
            setValue(copydefault());
        }

        @Override // androidx.lifecycle.LiveData
        public void onInactive() {
            super.onInactive();
            C44125sEf.this.fIwbmz().OLrzqt(this.OLrzqt);
        }
    }

    @Override // o.sKH
    public LiveData<MessengerConnectionStatus> KWHzl() {
        return new ActionBar();
    }

    @Override // o.sKH
    public Flow<java.lang.Integer> AhwBna() {
        return values().EZpvd().copydefault();
    }
}
