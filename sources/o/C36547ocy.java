package o;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.bean.LiveChatRoomConfig;
import com.okinc.im.imui.livestream.model.SnackBarEvent;
import com.okinc.im.imui.livestream.model.UXBehavior;
import com.okinc.im.imui.livestream.model.UserRole;
import com.okinc.im.imui.livestream.viewmodel.LivestreamChatViewModel$getLatestMessageList$1;
import com.okinc.im.imui.livestream.viewmodel.LivestreamChatViewModel$handleDisconnectedState$1;
import com.okinc.im.imui.livestream.viewmodel.LivestreamChatViewModel$initConversation$1;
import com.okinc.im.imui.livestream.viewmodel.LivestreamChatViewModel$initTaskQueue$1;
import com.okinc.im.imui.livestream.viewmodel.LivestreamChatViewModel$loadMoreOlderMessages$1;
import com.okinc.im.imui.livestream.viewmodel.LivestreamChatViewModel$onDeleteMessage$1;
import com.okinc.im.imui.livestream.viewmodel.LivestreamChatViewModel$onRecallEvent$1;
import com.okinc.im.imui.livestream.viewmodel.LivestreamChatViewModel$onReceiveMessage$1;
import com.okinc.im.imui.livestream.viewmodel.LivestreamChatViewModel$onRefreshEvent$1;
import com.okinc.im.imui.livestream.viewmodel.LivestreamChatViewModel$sendTextMessage$1;
import com.okinc.im.imui.livestream.viewmodel.LivestreamChatViewModel$showTheLatestMessageList$1;
import com.okinc.im.imui.livestream.viewmodel.LivestreamChatViewModel$startStatusBannerUpdatesListener$1;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKTextMessage;
import com.okinc.okimcore.model.im.OKUserInfo;
import com.okinc.okimcore.model.other.OKRecallNotificationMessage;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.OfficialTagType;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.InterfaceC36545ocw;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ocy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C36547ocy extends ViewModel implements InterfaceC44291sKj {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final MutableSharedFlow<Unit> AEQbTJ;
    public final oCM AYXKKw;
    public final MutableSharedFlow<SnackBarEvent> AhwBna;
    public final SharedFlow<Unit> AkhnZx;
    public final SharedFlow<AbstractC36555odF> AuCTel;
    public final LiveChatRoomConfig DbNXlk;
    public final MutableStateFlow<java.lang.Boolean> EZpvd;
    public final MutableStateFlow<InterfaceC36545ocw> KWHzl;
    public final MutableSharedFlow<AbstractC36555odF> copydefault;
    public final MutableStateFlow<C36499ocC> djBIcL;
    public final StateFlow<java.lang.Boolean> ejfBZ;
    public final oEI fARcdN;
    public final oCJ fIwbmz;
    public final StateFlow<java.lang.Boolean> fJNWhG;
    public final java.util.List<C36498ocB> fetchVPNInfo;
    public final MutableStateFlow<java.lang.Boolean> gEmmrt;
    public final C35820oEx getFieldNames;
    public long getNewProxyInstance;
    public final sKH hDKMBd;
    public Job isConnected;
    public final StateFlow<C36499ocC> iwGUEr;
    public final InterfaceC44293sKl uzCIH;
    public final StateFlow<InterfaceC36545ocw> valueOf;
    public final oCO values;
    public final kotlinx.coroutines.channels.Channel<Function1<Continuation<? super Unit>, java.lang.Object>> wlaJM;
    public final SharedFlow<SnackBarEvent> zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC36545ocw> AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C36499ocC> AYXKKw() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<SnackBarEvent> AhwBna() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC44291sKj
    public void EZpvd(@NotNull java.util.List<OKMessage> list) {
        Intrinsics.checkNotNullParameter(list, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC44291sKj
    public void EZpvd(@NotNull C44462sQs c44462sQs) {
        Intrinsics.checkNotNullParameter(c44462sQs, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC44291sKj
    public void EZpvd(@NotNull C44468sQy c44468sQy) {
        Intrinsics.checkNotNullParameter(c44468sQy, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> KWHzl() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC44291sKj
    public void KWHzl(@NotNull sQB sqb) {
        Intrinsics.checkNotNullParameter(sqb, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC44291sKj
    public void KWHzl(@NotNull C44466sQw c44466sQw) {
        Intrinsics.checkNotNullParameter(c44466sQw, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC44291sKj
    public void KWHzl(@NotNull C44469sQz c44469sQz) {
        Intrinsics.checkNotNullParameter(c44469sQz, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AbstractC36555odF> OLrzqt() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC44291sKj
    public void copydefault(@NotNull C44467sQx c44467sQx) {
        Intrinsics.checkNotNullParameter(c44467sQx, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.Boolean> djBIcL() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.Boolean> gEmmrt() {
        return this.ejfBZ;
    }

    public C36547ocy(@NotNull InterfaceC44293sKl interfaceC44293sKl, @NotNull oCJ ocj, @NotNull oCM ocm, @NotNull oCO oco, @NotNull C35820oEx c35820oEx, @NotNull oEI oei, @NotNull sKH skh, @NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(interfaceC44293sKl, "");
        Intrinsics.checkNotNullParameter(ocj, "");
        Intrinsics.checkNotNullParameter(ocm, "");
        Intrinsics.checkNotNullParameter(oco, "");
        Intrinsics.checkNotNullParameter(c35820oEx, "");
        Intrinsics.checkNotNullParameter(oei, "");
        Intrinsics.checkNotNullParameter(skh, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.uzCIH = interfaceC44293sKl;
        this.fIwbmz = ocj;
        this.AYXKKw = ocm;
        this.values = oco;
        this.getFieldNames = c35820oEx;
        this.fARcdN = oei;
        this.hDKMBd = skh;
        java.lang.Object obj = savedStateHandle.get("ARG_CONFIG");
        Intrinsics.copydefault(obj);
        LiveChatRoomConfig liveChatRoomConfig = (LiveChatRoomConfig) obj;
        this.DbNXlk = liveChatRoomConfig;
        MutableSharedFlow<AbstractC36555odF> mutableSharedFlowAEQbTJ = C37721ozF.AEQbTJ();
        this.copydefault = mutableSharedFlowAEQbTJ;
        this.AuCTel = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        MutableStateFlow<java.lang.Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.EZpvd = MutableStateFlow;
        this.ejfBZ = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<C36499ocC> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new C36499ocC(null, null, null, 7, null));
        this.djBIcL = MutableStateFlow2;
        this.iwGUEr = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<InterfaceC36545ocw> MutableStateFlow3 = StateFlowKt.MutableStateFlow(InterfaceC36545ocw.StateListAnimator.KWHzl);
        this.KWHzl = MutableStateFlow3;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<java.lang.Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(bool);
        this.gEmmrt = MutableStateFlow4;
        this.fJNWhG = FlowKt.asStateFlow(MutableStateFlow4);
        MutableSharedFlow<SnackBarEvent> mutableSharedFlowAEQbTJ2 = C37721ozF.AEQbTJ();
        this.AhwBna = mutableSharedFlowAEQbTJ2;
        this.zsXlph = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ2);
        MutableSharedFlow<Unit> mutableSharedFlowAEQbTJ3 = C37721ozF.AEQbTJ();
        this.AEQbTJ = mutableSharedFlowAEQbTJ3;
        this.AkhnZx = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ3);
        this.fetchVPNInfo = new java.util.ArrayList();
        this.wlaJM = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        pUU.KWHzl("LivestreamChatViewModel", "Initializing livestream chat: " + liveChatRoomConfig);
        valueOf();
        interfaceC44293sKl.AEQbTJ(this);
        interfaceC44293sKl.OLrzqt(this);
        skh.AEQbTJ();
        fetchVPNInfo();
        AEQbTJ(liveChatRoomConfig);
    }

    /* JADX INFO: renamed from: o.ocy$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ocy.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void copydefault(@NotNull InterfaceC36545ocw interfaceC36545ocw) {
        Intrinsics.checkNotNullParameter(interfaceC36545ocw, "");
        InterfaceC36545ocw value = this.KWHzl.getValue();
        if (Intrinsics.EZpvd(value, InterfaceC36545ocw.Dialog.EZpvd) || Intrinsics.EZpvd(value, InterfaceC36545ocw.TaskDescription.OLrzqt)) {
            return;
        }
        this.KWHzl.setValue(interfaceC36545ocw);
    }

    public final Job valueOf() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new LivestreamChatViewModel$initTaskQueue$1(this, null), 2, null);
    }

    public final void AEQbTJ(LiveChatRoomConfig liveChatRoomConfig) {
        pUU.KWHzl("LivestreamChatViewModel", "initConversation: channelId=" + liveChatRoomConfig.copydefault());
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new LivestreamChatViewModel$initConversation$1(liveChatRoomConfig, this, null), 3, null);
    }

    public final void KWHzl(java.lang.String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new LivestreamChatViewModel$getLatestMessageList$1(this, str, null), 3, null);
    }

    public final void isConnected() {
        if (C33129mqd.valueOf(this.djBIcL.getValue().copydefault()) <= 0) {
            pUU.KWHzl("LivestreamChatViewModel", "No more messages to load");
            return;
        }
        java.lang.Long lCopydefault = this.djBIcL.getValue().copydefault();
        if (lCopydefault != null && lCopydefault.longValue() > 0) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new LivestreamChatViewModel$loadMoreOlderMessages$1(this, lCopydefault, null), 3, null);
        } else {
            pUU.valueOf("LivestreamChatViewModel", "No messages to load from");
        }
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return;
        }
        InterfaceC36545ocw value = this.KWHzl.getValue();
        if (Intrinsics.EZpvd(value, InterfaceC36545ocw.Dialog.EZpvd)) {
            this.AhwBna.tryEmit(SnackBarEvent.StreamEnded);
            return;
        }
        InterfaceC36545ocw.ActionBar actionBar = InterfaceC36545ocw.ActionBar.copydefault;
        if (Intrinsics.EZpvd(value, actionBar)) {
            copydefault(actionBar);
            this.AhwBna.tryEmit(SnackBarEvent.BeingMuted);
        } else {
            if (str.codePointCount(0, str.length()) > this.DbNXlk.AEQbTJ()) {
                this.AhwBna.tryEmit(SnackBarEvent.ExceedCharacter);
                return;
            }
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - this.getNewProxyInstance >= this.DbNXlk.KWHzl()) {
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new LivestreamChatViewModel$sendTextMessage$1(this, str, jCurrentTimeMillis, null), 3, null);
            } else {
                this.AhwBna.tryEmit(SnackBarEvent.TooFrequent);
            }
        }
    }

    public final C36498ocB EZpvd(@NotNull OKMessage oKMessage) {
        java.lang.String strGEmmrt;
        java.lang.String str;
        OKUserInfo userInfo;
        android.net.Uri portraitUri;
        OKUserInfo userInfo2;
        Intrinsics.checkNotNullParameter(oKMessage, "");
        pUU.EZpvd("LivestreamChatViewModel", "convertToLivestreamMessage - seq:" + oKMessage.getSeq() + ", extra:" + oKMessage.getExtra());
        kotlin.Pair<UserRole, java.util.List<java.lang.Integer>> pairCopydefault = copydefault(oKMessage.getExtra());
        UserRole userRoleComponent1 = pairCopydefault.component1();
        java.util.List<java.lang.Integer> listComponent2 = pairCopydefault.component2();
        OKMessageContent content = oKMessage.getContent();
        if (content instanceof OKTextMessage) {
            strGEmmrt = ((OKTextMessage) content).getContent();
            str = strGEmmrt == null ? "" : strGEmmrt;
        } else {
            if (!(content instanceof OKRecallNotificationMessage)) {
                strGEmmrt = C33129mqd.gEmmrt(content);
            }
        }
        long seq = oKMessage.getSeq();
        java.lang.String clientMessageId = oKMessage.getClientMessageId();
        java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(oKMessage.getSenderUserId());
        OKMessageContent content2 = oKMessage.getContent();
        java.lang.String name = (content2 == null || (userInfo2 = content2.getUserInfo()) == null) ? null : userInfo2.getName();
        java.lang.String str2 = name == null ? "" : name;
        OKMessageContent content3 = oKMessage.getContent();
        return new C36498ocB(seq, clientMessageId, strGEmmrt2, str2, (content3 == null || (userInfo = content3.getUserInfo()) == null || (portraitUri = userInfo.getPortraitUri()) == null) ? null : portraitUri.toString(), str, oKMessage.getSentTime(), userRoleComponent1, null, AEQbTJ(listComponent2), oKMessage.getContent() instanceof OKRecallNotificationMessage, 256, null);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x004d */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public final kotlin.Pair<UserRole, java.util.List<java.lang.Integer>> copydefault(java.lang.String str) {
        java.lang.Object objAhwBna;
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return new kotlin.Pair<>(UserRole.VIEWER, yDY.AhwBna());
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("livestreamUserInfo");
            if (jSONObjectOptJSONObject != null) {
                java.lang.Object objCopydefault = UserRole.Companion.copydefault(jSONObjectOptJSONObject.optInt("role", 2));
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("tags");
                if (jSONArrayOptJSONArray != null) {
                    int length = jSONArrayOptJSONArray.length();
                    objAhwBna = new java.util.ArrayList(length);
                    for (int i = 0; i < length; i++) {
                        objAhwBna.add(java.lang.Integer.valueOf(jSONArrayOptJSONArray.optInt(i, 0)));
                    }
                } else {
                    objAhwBna = yDY.AhwBna();
                }
                pUU.EZpvd("LivestreamChatViewModel", "parseLivestreamUserInfo - role:" + objCopydefault + ", tags:" + objAhwBna);
                return new kotlin.Pair<>(objCopydefault, objAhwBna);
            }
            pUU.valueOf("LivestreamChatViewModel", "parseLivestreamUserInfo - livestreamUserInfo not found in extra");
            return new kotlin.Pair<>(UserRole.VIEWER, yDY.AhwBna());
        } catch (java.lang.Exception e) {
            pUU.copydefault("LivestreamChatViewModel", "parseLivestreamUserInfo - failed to parse extra: " + e.getMessage());
            return new kotlin.Pair<>(UserRole.VIEWER, yDY.AhwBna());
        }
    }

    public final OfficialTagInfo AEQbTJ(@NotNull java.util.List<java.lang.Integer> list) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return null;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((java.lang.Number) it.next()).intValue();
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(OfficialTagType.CREATOR.valueOf(iIntValue));
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = null;
                }
                OfficialTagType officialTagType = (OfficialTagType) objM7377constructorimpl;
                if (officialTagType != null) {
                    arrayList.add(officialTagType);
                }
            }
            if (!arrayList.isEmpty()) {
                return new OfficialTagInfo((java.util.List) null, (java.util.List) null, (java.util.List) null, arrayList, 7, (DefaultConstructorMarker) null);
            }
            return null;
        } catch (java.lang.Exception e) {
            pUU.copydefault("LivestreamChatViewModel", "convertTagsToOfficialTagInfo - failed to convert tags: " + e.getMessage());
            return null;
        }
    }

    public final void copydefault() {
        this.AYXKKw.AEQbTJ(this.DbNXlk.copydefault());
    }

    public final void EZpvd() {
        this.values.KWHzl();
    }

    public final boolean EZpvd(java.lang.String str) {
        if (str == null) {
            return false;
        }
        return Intrinsics.EZpvd((java.lang.Object) this.DbNXlk.copydefault(), (java.lang.Object) str);
    }

    public final boolean OLrzqt(OKMessage oKMessage) {
        return (oKMessage.getContent() instanceof OKTextMessage) || (oKMessage.getContent() instanceof OKRecallNotificationMessage);
    }

    @Override // o.InterfaceC44291sKj
    public void KWHzl(@NotNull C44467sQx c44467sQx) {
        Intrinsics.checkNotNullParameter(c44467sQx, "");
        if (EZpvd(c44467sQx.copydefault().getTargetId())) {
            if (!OLrzqt(c44467sQx.copydefault())) {
                pUU.EZpvd("LivestreamChatViewModel", "onReceiveMessage - skipping non-text message, seq:" + c44467sQx.copydefault().getSeq());
                return;
            }
            this.wlaJM.mo5769trySendJP2dKIU(new LivestreamChatViewModel$onReceiveMessage$1(this, c44467sQx, null));
        }
    }

    @Override // o.InterfaceC44291sKj
    public void OLrzqt(@NotNull C44454sQk c44454sQk) {
        Intrinsics.checkNotNullParameter(c44454sQk, "");
        if (EZpvd(c44454sQk.copydefault())) {
            this.wlaJM.mo5769trySendJP2dKIU(new LivestreamChatViewModel$onDeleteMessage$1(this, c44454sQk, null));
        }
    }

    @Override // o.InterfaceC44291sKj
    public void EZpvd(@NotNull C44464sQu c44464sQu) {
        Intrinsics.checkNotNullParameter(c44464sQu, "");
        if (EZpvd(c44464sQu.AEQbTJ().getTargetId())) {
            this.wlaJM.mo5769trySendJP2dKIU(new LivestreamChatViewModel$onRecallEvent$1(this, c44464sQu, null));
        }
    }

    @Override // o.InterfaceC44291sKj
    public void KWHzl(@NotNull sQA sqa) {
        Intrinsics.checkNotNullParameter(sqa, "");
        if (EZpvd(sqa.EZpvd().getTargetId()) && OLrzqt(sqa.EZpvd())) {
            this.wlaJM.mo5769trySendJP2dKIU(new LivestreamChatViewModel$onRefreshEvent$1(this, sqa, null));
        }
    }

    @Override // o.InterfaceC44291sKj
    public void EZpvd(@NotNull C44452sQi c44452sQi) {
        Intrinsics.checkNotNullParameter(c44452sQi, "");
        AEQbTJ(c44452sQi.EZpvd());
    }

    public final void AEQbTJ(java.lang.String str) {
        if (EZpvd(str)) {
            this.wlaJM.mo5769trySendJP2dKIU(new LivestreamChatViewModel$showTheLatestMessageList$1(this, str, null));
        }
    }

    private final void fetchVPNInfo() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new LivestreamChatViewModel$startStatusBannerUpdatesListener$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AkhnZx() {
        Job job = this.isConnected;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        pUU.KWHzl("LivestreamChatViewModel", "updateConnectionState - emit connection state: Connected");
        this.gEmmrt.tryEmit(java.lang.Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void values() {
        Job job = this.isConnected;
        if (job == null || !job.isActive()) {
            this.isConnected = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new LivestreamChatViewModel$handleDisconnectedState$1(this, null), 3, null);
        } else {
            pUU.KWHzl("LivestreamChatViewModel", "updateConnectionState - drop state change");
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.uzCIH.AEQbTJ(this);
        Job job = this.isConnected;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        pUU.EZpvd("LivestreamChatViewModel", "LivestreamChatViewModel cleared");
    }

    public final void AEQbTJ(@NotNull C36498ocB c36498ocB) {
        Intrinsics.checkNotNullParameter(c36498ocB, "");
        java.util.Iterator<C36498ocB> it = this.fetchVPNInfo.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (Intrinsics.EZpvd((java.lang.Object) it.next().copydefault(), (java.lang.Object) c36498ocB.copydefault())) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            java.util.Iterator<C36498ocB> it2 = this.fetchVPNInfo.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    i2 = -1;
                    break;
                } else {
                    if (it2.next().EZpvd() == c36498ocB.EZpvd()) {
                        i2 = i;
                        break;
                    }
                    i++;
                }
            }
        }
        if (i2 != -1) {
            this.fetchVPNInfo.set(i2, c36498ocB);
            pUU.EZpvd("LivestreamChatViewModel", "Updated existing livestream message: " + c36498ocB);
        } else {
            this.fetchVPNInfo.add(c36498ocB);
            pUU.EZpvd("LivestreamChatViewModel", "Added new livestream message: " + c36498ocB);
        }
        this.djBIcL.setValue(new C36499ocC(CollectionsKt___CollectionsKt.gkJEwt(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.fetchVPNInfo)), UXBehavior.ReceiveOtherMessage, this.djBIcL.getValue().copydefault()));
    }
}
