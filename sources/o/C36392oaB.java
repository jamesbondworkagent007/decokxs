package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.im.bean.ChatOrigin;
import com.okinc.im.bean.ChatSettingViewComponentScene;
import com.okinc.im.bean.IMBizNameContentModel;
import com.okinc.im.bean.LiveChatRoomConfig;
import com.okinc.im.bean.OrbitIMChatSearchResult;
import com.okinc.im.bean.SearchResultData;
import com.okinc.im.config.page.IMPageType;
import com.okinc.im.config.page.ServiceName;
import com.okinc.im.imui.conversationlist.ConversationListFragment;
import com.okinc.im.imui.conversationlist.model.ConversationListParams;
import com.okinc.im.imui.impl.OKIMServiceImpl$getServiceCustomMessageFlow$$inlined$map$1$2$1;
import com.okinc.im.imui.impl.OKIMServiceImpl$getTotalUnReadCountFlow$$inlined$map$1$2$1;
import com.okinc.im.imui.impl.OKIMServiceImpl$getTotalUnReadCountFlow$2;
import com.okinc.im.imui.impl.OKIMServiceImpl$getTotalUnReadCountFlow$3;
import com.okinc.im.imui.impl.OKIMServiceImpl$getTotalUnreadCountDisplayFlow$$inlined$map$1$2$1;
import com.okinc.im.imui.impl.OKIMServiceImpl$initOTCAgentChannel$1;
import com.okinc.im.imui.impl.OKIMServiceImpl$joinLiveStream$1;
import com.okinc.im.imui.impl.OKIMServiceImpl$presentIMPublicGroupJoinFlow$1;
import com.okinc.im.imui.impl.OKIMServiceImpl$presentIMPublicGroupJoinFlow$result$1;
import com.okinc.im.imui.impl.OKIMServiceImpl$showIMMenuBottomSheet$1;
import com.okinc.im.imui.impl.OKIMServiceImpl$startIMChatPage$1;
import com.okinc.im.imui.search.viewmodel.OrbitSearchViewModel;
import com.okinc.im.imui.trending.TrendingGroupsHorizontalFragment;
import com.okinc.okimcore.feature.agentbot.model.enums.AgentBotEntryInfo;
import com.okinc.okimcore.feature.group.repository.remote.InHouseIMGroupService;
import com.okinc.okimcore.model.exception.OKIMException;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKCustomMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.RelationSourceType;
import com.okinc.okimcore.model.im.inhouseim.ws.ReactionDetail;
import com.okinc.okimcore.model.other.IMSource;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.PublicGroupInfo;
import com.okinc.okimcore.model.remote.PublicGroupInfoList;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC43419rot;
import o.ActivityC35548nxT;
import o.ActivityC36573odX;
import o.C35399nuc;
import o.InterfaceC35180nqU;
import o.nZO;
import o.sFH;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.oaB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36392oaB extends AbstractC43215rlA implements InterfaceC35180nqU {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX INFO: renamed from: o.oaB$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar implements Flow<java.lang.Integer> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: o.oaB$ActionBar$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                OKIMServiceImpl$getTotalUnReadCountFlow$$inlined$map$1$2$1 oKIMServiceImpl$getTotalUnReadCountFlow$$inlined$map$1$2$1;
                if (continuation instanceof OKIMServiceImpl$getTotalUnReadCountFlow$$inlined$map$1$2$1) {
                    oKIMServiceImpl$getTotalUnReadCountFlow$$inlined$map$1$2$1 = (OKIMServiceImpl$getTotalUnReadCountFlow$$inlined$map$1$2$1) continuation;
                    int i = oKIMServiceImpl$getTotalUnReadCountFlow$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        oKIMServiceImpl$getTotalUnReadCountFlow$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        oKIMServiceImpl$getTotalUnReadCountFlow$$inlined$map$1$2$1 = new OKIMServiceImpl$getTotalUnReadCountFlow$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = oKIMServiceImpl$getTotalUnReadCountFlow$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = oKIMServiceImpl$getTotalUnReadCountFlow$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    int iIntValue = ((java.lang.Number) obj).intValue();
                    if (!C44157sFk.gEmmrt().values()) {
                        iIntValue = 0;
                    }
                    java.lang.Integer numAEQbTJ = C56443yFo.AEQbTJ(iIntValue);
                    oKIMServiceImpl$getTotalUnReadCountFlow$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(numAEQbTJ, oKIMServiceImpl$getTotalUnReadCountFlow$$inlined$map$1$2$1) == objCopydefault) {
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

        public ActionBar(Flow flow) {
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.lang.Integer> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.oaB$Activity */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Activity implements Flow<C35253nro> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.oaB$Activity$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                OKIMServiceImpl$getTotalUnreadCountDisplayFlow$$inlined$map$1$2$1 oKIMServiceImpl$getTotalUnreadCountDisplayFlow$$inlined$map$1$2$1;
                java.lang.String strValueOf;
                if (continuation instanceof OKIMServiceImpl$getTotalUnreadCountDisplayFlow$$inlined$map$1$2$1) {
                    oKIMServiceImpl$getTotalUnreadCountDisplayFlow$$inlined$map$1$2$1 = (OKIMServiceImpl$getTotalUnreadCountDisplayFlow$$inlined$map$1$2$1) continuation;
                    int i = oKIMServiceImpl$getTotalUnreadCountDisplayFlow$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        oKIMServiceImpl$getTotalUnreadCountDisplayFlow$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        oKIMServiceImpl$getTotalUnreadCountDisplayFlow$$inlined$map$1$2$1 = new OKIMServiceImpl$getTotalUnreadCountDisplayFlow$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = oKIMServiceImpl$getTotalUnreadCountDisplayFlow$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = oKIMServiceImpl$getTotalUnreadCountDisplayFlow$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    int iIntValue = ((java.lang.Number) obj).intValue();
                    C44124sEe.imLogGetAllUnreadCountFlow$default("OKIMServiceImpl - getTotalUnreadCountStringFlow - value update: " + iIntValue, null, 2, null);
                    boolean z = iIntValue > 0;
                    if (iIntValue > 99) {
                        strValueOf = 99 + Marker.ANY_NON_NULL_MARKER;
                    } else {
                        strValueOf = java.lang.String.valueOf(iIntValue);
                    }
                    C35253nro c35253nro = new C35253nro(z, strValueOf);
                    oKIMServiceImpl$getTotalUnreadCountDisplayFlow$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(c35253nro, oKIMServiceImpl$getTotalUnreadCountDisplayFlow$$inlined$map$1$2$1) == objCopydefault) {
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

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super C35253nro> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.oaB$TaskDescription */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class TaskDescription implements Flow<IMBizNameContentModel> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: o.oaB$TaskDescription$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                OKIMServiceImpl$getServiceCustomMessageFlow$$inlined$map$1$2$1 oKIMServiceImpl$getServiceCustomMessageFlow$$inlined$map$1$2$1;
                if (continuation instanceof OKIMServiceImpl$getServiceCustomMessageFlow$$inlined$map$1$2$1) {
                    oKIMServiceImpl$getServiceCustomMessageFlow$$inlined$map$1$2$1 = (OKIMServiceImpl$getServiceCustomMessageFlow$$inlined$map$1$2$1) continuation;
                    int i = oKIMServiceImpl$getServiceCustomMessageFlow$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        oKIMServiceImpl$getServiceCustomMessageFlow$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        oKIMServiceImpl$getServiceCustomMessageFlow$$inlined$map$1$2$1 = new OKIMServiceImpl$getServiceCustomMessageFlow$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = oKIMServiceImpl$getServiceCustomMessageFlow$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = oKIMServiceImpl$getServiceCustomMessageFlow$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    OKMessageContent content = ((OKMessage) obj).getContent();
                    OKCustomMessage oKCustomMessage = content instanceof OKCustomMessage ? (OKCustomMessage) content : null;
                    java.lang.String bizName = oKCustomMessage != null ? oKCustomMessage.getBizName() : null;
                    if (bizName == null) {
                        bizName = "";
                    }
                    IMBizNameContentModel iMBizNameContentModel = new IMBizNameContentModel(bizName, oKCustomMessage != null ? oKCustomMessage.getContent() : null);
                    oKIMServiceImpl$getServiceCustomMessageFlow$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(iMBizNameContentModel, oKIMServiceImpl$getServiceCustomMessageFlow$$inlined$map$1$2$1) == objCopydefault) {
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

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super IMBizNameContentModel> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.oaB$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oaB.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final InHouseIMGroupService gEmmrt() {
        return (InHouseIMGroupService) C43393roT.EZpvd(C56524yIo.AEQbTJ(InHouseIMGroupService.class), new C44234sIg());
    }

    @Override // o.InterfaceC35180nqU
    public void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, ChatOrigin chatOrigin) {
        java.lang.String value;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (sDZ.AEQbTJ.uzCIH()) {
            C33764nEz c33764nEz = C33764nEz.OLrzqt;
            if (chatOrigin == null || (value = chatOrigin.getValue()) == null) {
                value = ChatOrigin.OKIM_SERVICE.getValue();
            }
            c33764nEz.copydefault(null, context, (204 & 4) != 0 ? null : null, (204 & 8) != 0 ? null : null, (204 & 16) != 0 ? null : value, (204 & 32) != 0 ? null : str, (204 & 64) != 0 ? null : null, (204 & 128) != 0 ? null : null);
        }
    }

    @Override // o.InterfaceC35180nqU
    public boolean djBIcL() {
        return sDZ.AEQbTJ.uzCIH();
    }

    @Override // o.InterfaceC35180nqU
    public void KWHzl(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(str, "");
        ActivityC35548nxT.ActionBar actionBar = ActivityC35548nxT.Companion;
        if (str3 == null) {
            str3 = ChatOrigin.OKIM_SERVICE.getValue();
        }
        android.content.Intent intentCreateIntent$default = ActivityC35548nxT.ActionBar.createIntent$default(actionBar, abstractActivityC33041mov, str3, str, null, false, 16, null);
        intentCreateIntent$default.addFlags(67108864);
        abstractActivityC33041mov.startActivity(intentCreateIntent$default);
    }

    @Override // o.InterfaceC35180nqU
    public void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull OKConversationType oKConversationType, @NotNull java.lang.String str2) {
        LifecycleCoroutineScope lifecycleScope;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(oKConversationType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        LifecycleOwner lifecycleOwnerAEQbTJ = C35334ntP.AEQbTJ(context);
        if (lifecycleOwnerAEQbTJ == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerAEQbTJ)) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(lifecycleScope, sDN.copydefault.AEQbTJ(), null, new OKIMServiceImpl$startIMChatPage$1(str, oKConversationType, str2, context, null), 2, null);
    }

    @Override // o.InterfaceC35180nqU
    public InterfaceC35353nti OLrzqt() {
        return C35696oAh.KWHzl;
    }

    @Override // o.InterfaceC35180nqU
    public sHZ AEQbTJ() {
        return sDZ.AEQbTJ.AhwBna();
    }

    @Override // o.InterfaceC35180nqU
    public sKH copydefault() {
        return sDZ.AEQbTJ.fARcdN();
    }

    @Override // o.InterfaceC35180nqU
    public sGF KWHzl() {
        return sDZ.AEQbTJ.AYXKKw();
    }

    @Override // o.InterfaceC35180nqU
    public sFU EZpvd() {
        return sDZ.AEQbTJ.valueOf();
    }

    @Override // o.InterfaceC35180nqU
    public androidx.fragment.app.Fragment KWHzl(@NotNull C35241nrc c35241nrc) {
        Intrinsics.checkNotNullParameter(c35241nrc, "");
        return C36609oeG.Companion.EZpvd(c35241nrc);
    }

    @Override // o.InterfaceC35180nqU
    public void AEQbTJ(@NotNull C35893oHp c35893oHp, @NotNull OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(c35893oHp, "");
        Intrinsics.checkNotNullParameter(oKConversation, "");
        C35891oHn.AEQbTJ(c35893oHp, oKConversation);
    }

    @Override // o.InterfaceC35180nqU
    public void copydefault(@NotNull C35893oHp c35893oHp, @NotNull com.okinc.okimcore.model.remote.UserInfo userInfo) {
        Intrinsics.checkNotNullParameter(c35893oHp, "");
        Intrinsics.checkNotNullParameter(userInfo, "");
        java.lang.String identifyId = userInfo.getIdentifyId();
        java.lang.String str = identifyId == null ? "" : identifyId;
        java.lang.String petname = userInfo.getPetname();
        java.lang.String str2 = petname == null ? "" : petname;
        java.lang.String avatar = userInfo.getAvatar();
        C35891oHn.OLrzqt(c35893oHp, new RelationInfo(str, avatar == null ? "" : avatar, str2, (java.lang.String) null, (java.lang.String) null, false, false, false, false, false, false, false, (java.lang.String) null, (OfficialTagInfo) null, 0L, false, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (RelationSourceType) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, -8, 63, (DefaultConstructorMarker) null));
    }

    @Override // o.InterfaceC35180nqU
    public androidx.fragment.app.Fragment EZpvd(@NotNull java.lang.String str, int i, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        return ConversationListFragment.Companion.copydefault(new ConversationListParams(C35182nqW.KWHzl(str), false, false, false, i, z, z2, false, false, 396, null));
    }

    @Override // o.InterfaceC35180nqU
    public Flow<Result<OKConversation>> AEQbTJ(@NotNull java.lang.String str, @NotNull OKConversationType oKConversationType, @NotNull IMSource iMSource) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(oKConversationType, "");
        Intrinsics.checkNotNullParameter(iMSource, "");
        return sDZ.AEQbTJ.AYXKKw().AEQbTJ(str, oKConversationType, iMSource, (java.lang.String) null);
    }

    @Override // o.InterfaceC35180nqU
    public Flow<java.lang.Integer> EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return KWHzl().KWHzl(str);
    }

    @Override // o.InterfaceC35180nqU
    public Flow<java.lang.Integer> AEQbTJ(ChatOrigin chatOrigin) {
        return FlowKt.m7441catch(FlowKt.onEach(new ActionBar(sDZ.AEQbTJ.AhwBna().djBIcL().copydefault(false)), new OKIMServiceImpl$getTotalUnReadCountFlow$2(null)), new OKIMServiceImpl$getTotalUnReadCountFlow$3(null));
    }

    @Override // o.InterfaceC35180nqU
    public Flow<java.lang.Integer> AEQbTJ(boolean z) {
        return InterfaceC35180nqU.ActionBar.getTotalUnReadCountFlow$default(this, null, 1, null);
    }

    @Override // o.InterfaceC35180nqU
    public android.content.Intent copydefault(@NotNull android.content.Context context, java.lang.String str, ChatOrigin chatOrigin, OKMessage oKMessage, java.lang.String str2, java.lang.String str3, IMPageType iMPageType) {
        Intrinsics.checkNotNullParameter(context, "");
        return C33764nEz.OLrzqt.OLrzqt(context, (MLKEMEngine.KyberPolyBytes & 2) != 0 ? null : str, (MLKEMEngine.KyberPolyBytes & 4) != 0 ? null : chatOrigin, (MLKEMEngine.KyberPolyBytes & 8) != 0 ? null : oKMessage, (MLKEMEngine.KyberPolyBytes & 16) != 0 ? null : str2, (MLKEMEngine.KyberPolyBytes & 32) != 0 ? null : str3, (MLKEMEngine.KyberPolyBytes & 64) != 0 ? null : iMPageType, (MLKEMEngine.KyberPolyBytes & 128) != 0 ? null : null, (MLKEMEngine.KyberPolyBytes & 256) == 0 ? null : null);
    }

    @Override // o.InterfaceC35180nqU
    public void AEQbTJ(@NotNull android.content.Context context, java.lang.String str, ChatOrigin chatOrigin, OKMessage oKMessage, java.lang.String str2, java.lang.String str3, IMPageType iMPageType) {
        Intrinsics.checkNotNullParameter(context, "");
        C33764nEz.startIMChat$default(C33764nEz.OLrzqt, context, str, chatOrigin, oKMessage, str2, str3, iMPageType, null, null, MLKEMEngine.KyberPolyBytes, null);
    }

    @Override // o.InterfaceC35180nqU
    public void copydefault(@NotNull InterfaceC35282nsQ interfaceC35282nsQ, java.lang.String str, ServiceName serviceName) {
        Intrinsics.checkNotNullParameter(interfaceC35282nsQ, "");
        C36597odv.KWHzl.KWHzl(interfaceC35282nsQ, str, serviceName);
    }

    @Override // o.InterfaceC35180nqU
    public Flow<OKMessage> OLrzqt(@NotNull java.lang.String str, @NotNull ServiceName serviceName) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(serviceName, "");
        return sDZ.AEQbTJ.fARcdN().OLrzqt(str, serviceName.getServiceName());
    }

    @Override // o.InterfaceC35180nqU
    public void KWHzl(@NotNull FragmentActivity fragmentActivity, @NotNull java.util.List<? extends InterfaceC35698oAj> list) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(list, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new OKIMServiceImpl$showIMMenuBottomSheet$1(fragmentActivity, list, null), 3, null);
    }

    @Override // o.InterfaceC35180nqU
    public void KWHzl(@NotNull android.widget.ImageView imageView, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        oGX.copydefault.EZpvd(imageView, oKMessage);
    }

    @Override // o.InterfaceC35180nqU
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<? extends SearchResultData>> continuation) {
        return C35819oEw.execute$default(new C35819oEw(sDZ.AEQbTJ.ejfBZ()), str, false, continuation, 2, null);
    }

    @Override // o.InterfaceC35180nqU
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super OrbitIMChatSearchResult> continuation) {
        return new C35816oEt(sDZ.AEQbTJ.ejfBZ()).AEQbTJ(str, continuation);
    }

    @Override // o.InterfaceC35180nqU
    public androidx.fragment.app.Fragment copydefault(@NotNull java.util.List<? extends SearchResultData> list, @NotNull java.lang.String str, java.lang.String str2, @NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        return C37491ouo.Companion.AEQbTJ(list, str, str2, fragment);
    }

    @Override // o.InterfaceC35180nqU
    public void copydefault(@NotNull C35893oHp c35893oHp, @NotNull SearchResultData.ChatAndContact chatAndContact) {
        Intrinsics.checkNotNullParameter(c35893oHp, "");
        Intrinsics.checkNotNullParameter(chatAndContact, "");
        C37731ozP.KWHzl(chatAndContact, c35893oHp);
    }

    @Override // o.InterfaceC35180nqU
    public void AEQbTJ(@NotNull C35893oHp c35893oHp, @NotNull SearchResultData.Message message) {
        Intrinsics.checkNotNullParameter(c35893oHp, "");
        Intrinsics.checkNotNullParameter(message, "");
        C37731ozP.OLrzqt(message, c35893oHp);
    }

    @Override // o.InterfaceC35180nqU
    public void EZpvd(@NotNull android.widget.TextView textView, @NotNull OfficialTagInfo officialTagInfo) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(officialTagInfo, "");
        C37716ozA.updateTagViewWithTagInfo$default(textView, officialTagInfo, 0, null, false, false, false, 62, null);
    }

    @Override // o.InterfaceC35180nqU
    public java.lang.String copydefault(@NotNull android.content.Context context, @NotNull SearchResultData.Message message) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(message, "");
        return C37731ozP.OLrzqt(message, context);
    }

    @Override // o.InterfaceC35180nqU
    public android.content.Intent AEQbTJ(@NotNull FragmentActivity fragmentActivity, @NotNull SearchResultData.ChatAndContact chatAndContact, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(chatAndContact, "");
        Intrinsics.checkNotNullParameter(str, "");
        ActivityC36573odX.Activity activity = ActivityC36573odX.Companion;
        OKConversation conversation = chatAndContact.getConversation();
        java.lang.String targetId = conversation != null ? conversation.getTargetId() : null;
        RelationInfo relation = chatAndContact.getRelation();
        return activity.KWHzl(fragmentActivity, (452 & 2) != 0 ? null : targetId, (452 & 4) != 0 ? null : null, (452 & 8) != 0 ? null : str, (452 & 16) != 0 ? null : C35182nqW.KWHzl("search"), (452 & 32) != 0 ? null : relation != null ? relation.getContactsId() : null, (452 & 64) != 0 ? null : null, (452 & 128) != 0 ? null : null, (452 & 256) == 0 ? null : null);
    }

    @Override // o.InterfaceC35180nqU
    public android.content.Intent KWHzl(@NotNull FragmentActivity fragmentActivity, @NotNull SearchResultData.Message message, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(str, "");
        return ActivityC36573odX.Companion.KWHzl(fragmentActivity, (452 & 2) != 0 ? null : message.getConversation().getTargetId(), (452 & 4) != 0 ? null : message.getMessage(), (452 & 8) != 0 ? null : str, (452 & 16) != 0 ? null : C35182nqW.KWHzl("search"), (452 & 32) != 0 ? null : null, (452 & 64) != 0 ? null : null, (452 & 128) != 0 ? null : null, (452 & 256) == 0 ? null : null);
    }

    @Override // o.InterfaceC35180nqU
    public androidx.fragment.app.Fragment copydefault(@NotNull ChatOrigin chatOrigin) {
        Intrinsics.checkNotNullParameter(chatOrigin, "");
        ChatOrigin chatOrigin2 = ChatOrigin.PLANET;
        if (chatOrigin != chatOrigin2 || !sDZ.AEQbTJ.fetchVPNInfo().getValue().AEQbTJ()) {
            if (chatOrigin == chatOrigin2 && !sDZ.AEQbTJ.fetchVPNInfo().getValue().AEQbTJ()) {
                return nFE.Companion.KWHzl(new ConversationListParams(chatOrigin, false, false, true, 0, false, false, false, false, 150, null));
            }
            if (chatOrigin != chatOrigin2 && sDZ.AEQbTJ.uzCIH()) {
                return nFE.Companion.KWHzl(new ConversationListParams(chatOrigin, false, false, false, 0, false, false, false, false, 150, null));
            }
            if (chatOrigin != chatOrigin2) {
                sDZ.AEQbTJ.uzCIH();
            }
        }
        return null;
    }

    @Override // o.InterfaceC35180nqU
    public boolean valueOf() {
        return sDZ.AEQbTJ.fetchVPNInfo().getValue().AEQbTJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC35180nqU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull final Function1<? super java.lang.Boolean, Unit> function1, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        OKIMServiceImpl$presentIMPublicGroupJoinFlow$1 oKIMServiceImpl$presentIMPublicGroupJoinFlow$1;
        PublicGroupInfo publicGroupInfo;
        PublicGroupInfo publicGroupInfo2;
        if (continuation instanceof OKIMServiceImpl$presentIMPublicGroupJoinFlow$1) {
            oKIMServiceImpl$presentIMPublicGroupJoinFlow$1 = (OKIMServiceImpl$presentIMPublicGroupJoinFlow$1) continuation;
            int i = oKIMServiceImpl$presentIMPublicGroupJoinFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKIMServiceImpl$presentIMPublicGroupJoinFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                oKIMServiceImpl$presentIMPublicGroupJoinFlow$1 = new OKIMServiceImpl$presentIMPublicGroupJoinFlow$1(this, continuation);
            }
        }
        OKIMServiceImpl$presentIMPublicGroupJoinFlow$1 oKIMServiceImpl$presentIMPublicGroupJoinFlow$12 = oKIMServiceImpl$presentIMPublicGroupJoinFlow$1;
        java.lang.Object objWithContext = oKIMServiceImpl$presentIMPublicGroupJoinFlow$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKIMServiceImpl$presentIMPublicGroupJoinFlow$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            function1.invoke(C56443yFo.KWHzl(true));
            CoroutineDispatcher coroutineDispatcherCopydefault = sDN.copydefault.copydefault();
            OKIMServiceImpl$presentIMPublicGroupJoinFlow$result$1 oKIMServiceImpl$presentIMPublicGroupJoinFlow$result$1 = new OKIMServiceImpl$presentIMPublicGroupJoinFlow$result$1(this, str2, null);
            oKIMServiceImpl$presentIMPublicGroupJoinFlow$12.L$0 = context;
            oKIMServiceImpl$presentIMPublicGroupJoinFlow$12.L$1 = fragmentManager;
            oKIMServiceImpl$presentIMPublicGroupJoinFlow$12.L$2 = str;
            oKIMServiceImpl$presentIMPublicGroupJoinFlow$12.L$3 = function1;
            oKIMServiceImpl$presentIMPublicGroupJoinFlow$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcherCopydefault, oKIMServiceImpl$presentIMPublicGroupJoinFlow$result$1, oKIMServiceImpl$presentIMPublicGroupJoinFlow$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
                return Unit.INSTANCE;
            }
            function1 = (Function1) oKIMServiceImpl$presentIMPublicGroupJoinFlow$12.L$3;
            str = (java.lang.String) oKIMServiceImpl$presentIMPublicGroupJoinFlow$12.L$2;
            fragmentManager = (androidx.fragment.app.FragmentManager) oKIMServiceImpl$presentIMPublicGroupJoinFlow$12.L$1;
            context = (android.content.Context) oKIMServiceImpl$presentIMPublicGroupJoinFlow$12.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        java.lang.String str3 = str;
        android.content.Context context2 = context;
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objWithContext;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            function1.invoke(C56443yFo.KWHzl(false));
            C55326xho.toastWithFailedIcon$default(C35399nuc.LoaderManager.addSocket, 0, 1, (java.lang.Object) null);
        } else {
            if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            function1.invoke(C56443yFo.KWHzl(false));
            AbstractC43419rot.StateListAnimator stateListAnimator = (AbstractC43419rot.StateListAnimator) abstractC43419rot;
            java.util.List<PublicGroupInfo> groupInfoList = ((PublicGroupInfoList) stateListAnimator.KWHzl()).getGroupInfoList();
            java.lang.Integer numAEQbTJ = groupInfoList != null ? C56443yFo.AEQbTJ(groupInfoList.size()) : null;
            if ((numAEQbTJ != null && numAEQbTJ.intValue() == 0) || numAEQbTJ == null) {
                function1.invoke(C56443yFo.KWHzl(false));
                C55326xho.toastWithFailedIcon$default(C35399nuc.LoaderManager.addSocket, 0, 1, (java.lang.Object) null);
            } else {
                if (numAEQbTJ.intValue() == 1) {
                    nTB ntb = nTB.copydefault;
                    java.util.List<PublicGroupInfo> groupInfoList2 = ((PublicGroupInfoList) stateListAnimator.KWHzl()).getGroupInfoList();
                    java.lang.String groupId = (groupInfoList2 == null || (publicGroupInfo2 = (PublicGroupInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(groupInfoList2)) == null) ? null : publicGroupInfo2.getGroupId();
                    java.lang.String str4 = groupId == null ? "" : groupId;
                    java.util.List<PublicGroupInfo> groupInfoList3 = ((PublicGroupInfoList) stateListAnimator.KWHzl()).getGroupInfoList();
                    java.lang.String invitationId = (groupInfoList3 == null || (publicGroupInfo = (PublicGroupInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(groupInfoList3)) == null) ? null : publicGroupInfo.getInvitationId();
                    java.lang.String str5 = invitationId != null ? invitationId : "";
                    Function0<Unit> function0 = new Function0() { // from class: o.oax
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C36392oaB.copydefault(function1);
                        }
                    };
                    oKIMServiceImpl$presentIMPublicGroupJoinFlow$12.L$0 = null;
                    oKIMServiceImpl$presentIMPublicGroupJoinFlow$12.L$1 = null;
                    oKIMServiceImpl$presentIMPublicGroupJoinFlow$12.L$2 = null;
                    oKIMServiceImpl$presentIMPublicGroupJoinFlow$12.L$3 = null;
                    oKIMServiceImpl$presentIMPublicGroupJoinFlow$12.label = 2;
                    if (ntb.AEQbTJ(context2, str4, str5, function0, oKIMServiceImpl$presentIMPublicGroupJoinFlow$12) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                function1.invoke(C56443yFo.KWHzl(false));
                nZO.Application application = nZO.Companion;
                java.util.List<PublicGroupInfo> groupInfoList4 = ((PublicGroupInfoList) stateListAnimator.KWHzl()).getGroupInfoList();
                if (groupInfoList4 == null) {
                    groupInfoList4 = yDY.AhwBna();
                }
                application.EZpvd(str3, groupInfoList4).show(fragmentManager, nZO.class.getSimpleName());
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(Function1 function1) {
        function1.invoke(java.lang.Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lcom/okinc/im/bean/LiveChatRoomConfig;)Landroidx/fragment/app/Fragment; */
    @Override // o.InterfaceC35180nqU
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C36536ocn OLrzqt(@NotNull LiveChatRoomConfig liveChatRoomConfig) {
        Intrinsics.checkNotNullParameter(liveChatRoomConfig, "");
        return C36536ocn.Companion.EZpvd(liveChatRoomConfig);
    }

    @Override // o.InterfaceC35180nqU
    public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if ((!C44157sFk.gEmmrt().values()) && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str))) {
            sFM sfm = sFM.copydefault;
            if (Intrinsics.EZpvd((java.lang.Object) sfm.AEQbTJ(), (java.lang.Object) str)) {
                return;
            }
            sfm.OLrzqt(str);
            sfm.AEQbTJ(str2);
            sDZ sdz = sDZ.AEQbTJ;
            sdz.fARcdN().copydefault();
            sdz.fARcdN().AEQbTJ();
        }
    }

    @Override // o.InterfaceC35180nqU
    public void KWHzl(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull java.lang.String str, long j, @NotNull java.util.List<ReactionDetail> list) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.lang.String simpleName = oHY.class.getSimpleName();
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = abstractActivityC33041mov.getSupportFragmentManager().findFragmentByTag(simpleName);
        if (fragmentFindFragmentByTag == null || !fragmentFindFragmentByTag.isAdded() || fragmentFindFragmentByTag.isRemoving()) {
            oHY.Companion.OLrzqt(str, j, list).show(abstractActivityC33041mov.getSupportFragmentManager(), simpleName);
        }
    }

    @Override // o.InterfaceC35180nqU
    public androidx.fragment.app.Fragment EZpvd(@NotNull ChatSettingViewComponentScene chatSettingViewComponentScene) {
        Intrinsics.checkNotNullParameter(chatSettingViewComponentScene, "");
        return C37189opD.Companion.OLrzqt(chatSettingViewComponentScene);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC35180nqU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull InterfaceC44197sGx interfaceC44197sGx, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        OKIMServiceImpl$joinLiveStream$1 oKIMServiceImpl$joinLiveStream$1;
        C36392oaB c36392oaB;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof OKIMServiceImpl$joinLiveStream$1) {
            oKIMServiceImpl$joinLiveStream$1 = (OKIMServiceImpl$joinLiveStream$1) continuation;
            int i = oKIMServiceImpl$joinLiveStream$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKIMServiceImpl$joinLiveStream$1.label = i - Integer.MIN_VALUE;
            } else {
                oKIMServiceImpl$joinLiveStream$1 = new OKIMServiceImpl$joinLiveStream$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = oKIMServiceImpl$joinLiveStream$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKIMServiceImpl$joinLiveStream$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            pUU.AEQbTJ("joinLiveStream channelId:" + str);
            try {
                Result.Application application = Result.Companion;
                sGF sgfKWHzl = KWHzl();
                oKIMServiceImpl$joinLiveStream$1.L$0 = this;
                oKIMServiceImpl$joinLiveStream$1.L$1 = str;
                oKIMServiceImpl$joinLiveStream$1.L$2 = interfaceC44197sGx;
                oKIMServiceImpl$joinLiveStream$1.label = 1;
                objOLrzqt = sgfKWHzl.OLrzqt(str, oKIMServiceImpl$joinLiveStream$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                c36392oaB = this;
            } catch (java.lang.Throwable th) {
                th = th;
                c36392oaB = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC44197sGx = (InterfaceC44197sGx) oKIMServiceImpl$joinLiveStream$1.L$2;
            str = (java.lang.String) oKIMServiceImpl$joinLiveStream$1.L$1;
            c36392oaB = (C36392oaB) oKIMServiceImpl$joinLiveStream$1.L$0;
            try {
                C56391yDq.AEQbTJ(objOLrzqt);
            } catch (java.lang.Throwable th2) {
                th = th2;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        pUU.AEQbTJ("joinLiveStream store conversation:" + ((InHouseIMConversationEntity) objOLrzqt));
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            c36392oaB.KWHzl().OLrzqt(str, new Application(interfaceC44197sGx));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("joinLiveStream store conversation failed:" + thM7380exceptionOrNullimpl.getMessage());
            interfaceC44197sGx.AEQbTJ();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.oaB$Application */
    public static final class Application implements InterfaceC44197sGx {
        public final /* synthetic */ InterfaceC44197sGx copydefault;

        public Application(InterfaceC44197sGx interfaceC44197sGx) {
            this.copydefault = interfaceC44197sGx;
        }

        @Override // o.InterfaceC44197sGx
        public void copydefault() {
            this.copydefault.copydefault();
        }

        @Override // o.InterfaceC44197sGx
        public void AEQbTJ() {
            this.copydefault.AEQbTJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC35180nqU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull android.content.Context context, @NotNull Continuation<? super Result<C35185nqZ>> continuation) throws java.lang.Throwable {
        OKIMServiceImpl$initOTCAgentChannel$1 oKIMServiceImpl$initOTCAgentChannel$1;
        if (continuation instanceof OKIMServiceImpl$initOTCAgentChannel$1) {
            oKIMServiceImpl$initOTCAgentChannel$1 = (OKIMServiceImpl$initOTCAgentChannel$1) continuation;
            int i = oKIMServiceImpl$initOTCAgentChannel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKIMServiceImpl$initOTCAgentChannel$1.label = i - Integer.MIN_VALUE;
            } else {
                oKIMServiceImpl$initOTCAgentChannel$1 = new OKIMServiceImpl$initOTCAgentChannel$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = oKIMServiceImpl$initOTCAgentChannel$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKIMServiceImpl$initOTCAgentChannel$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            sFG sfgRqmePg = ((InterfaceC44151sFe) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC44151sFe.class)).RqmePg();
            AgentBotEntryInfo agentBotEntryInfo = AgentBotEntryInfo.OtcTrade;
            oKIMServiceImpl$initOTCAgentChannel$1.L$0 = context;
            oKIMServiceImpl$initOTCAgentChannel$1.label = 1;
            objEZpvd = sfgRqmePg.EZpvd(agentBotEntryInfo, oKIMServiceImpl$initOTCAgentChannel$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = (android.content.Context) oKIMServiceImpl$initOTCAgentChannel$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        sFH sfh = (sFH) objEZpvd;
        if (sfh instanceof sFH.TaskDescription) {
            sFH.TaskDescription taskDescription = (sFH.TaskDescription) sfh;
            C35185nqZ c35185nqZ = new C35185nqZ(taskDescription.EZpvd().KWHzl(), taskDescription.EZpvd().EZpvd());
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(c35185nqZ);
        }
        if (sfh instanceof sFH.ActionBar) {
            OKIMException oKIMException = new OKIMException("Request discarded due to rate limiting", 0, 2, (DefaultConstructorMarker) null);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(oKIMException));
        }
        if (!(sfh instanceof sFH.Activity)) {
            throw new NoWhenBranchMatchedException();
        }
        C37716ozA.EZpvd(context).show();
        java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("Failed to init agent bot session");
        Result.Application application3 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd(illegalStateException));
    }

    @Override // o.InterfaceC35180nqU
    public C35743oCa KWHzl(@NotNull oBZ obz, @NotNull InterfaceC35243nre interfaceC35243nre) {
        Intrinsics.checkNotNullParameter(obz, "");
        Intrinsics.checkNotNullParameter(interfaceC35243nre, "");
        return TrendingGroupsHorizontalFragment.Companion.OLrzqt(obz, interfaceC35243nre);
    }

    @Override // o.InterfaceC35180nqU
    public void AEQbTJ(@NotNull android.content.Context context, @NotNull java.util.List<? extends SearchResultData> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        context.startActivity(ActivityC37470ouT.Companion.OLrzqt(context, list, str, OrbitSearchViewModel.SearchType.CONTACT));
    }

    @Override // o.InterfaceC35180nqU
    public void copydefault(@NotNull android.content.Context context, @NotNull java.util.List<? extends SearchResultData> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        context.startActivity(ActivityC37470ouT.Companion.OLrzqt(context, list, str, OrbitSearchViewModel.SearchType.GROUP));
    }

    @Override // o.InterfaceC35180nqU
    public void EZpvd(@NotNull android.content.Context context, @NotNull java.util.List<? extends SearchResultData> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        context.startActivity(ActivityC37470ouT.Companion.OLrzqt(context, list, str, OrbitSearchViewModel.SearchType.MESSAGE));
    }
}
