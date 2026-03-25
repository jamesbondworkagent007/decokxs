package o;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.common.database.BaseDao;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$clearConversationInLocal$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$deleteConversation$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$deleteConversationsFromLocal$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$getAllConversationsFlow$$inlined$map$1$2$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$getAllConversationsFlow$2;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$getAndSaveConversationsFromRemote$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$getAndSaveSingleConversation$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$getAnnouncementBanner$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$getContactIdByChannelId$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$getConversationEntityFromLocal$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$getConversationFromLocal$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$getConversationTotalUnreadCountFlow$$inlined$map$1$2$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$getConversationUnreadCount$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$getConversationsByPageFlow$sourceFlow$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$getConversationsByPageFlow$sourceFlow$2;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$getConversationsByPageFlow$sourceFlow$3;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$getConversationsFromRemote$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$getFlaggedConversationsWithUnreadCountFlow$$inlined$map$1$2$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$getNotificationTotalUnreadCountFlow$lambda$69$$inlined$map$1$2$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$getTotalNumberOfConversationsWithFlaggedCountFlow$$inlined$map$1$2$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$getTotalNumberOfConversationsWithUnreadCountFlow$$inlined$map$1$2$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$getTotalUnreadCount$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$getTotalUnreadCountByChannelTypeFlow$$inlined$map$1$2$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$getTotalUnreadCountFlow$$inlined$map$1$2$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$hasConversationInLocalDb$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$markConversationsAsReadInRemote$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$markLocalConversationsAsRead$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$markNotificationConversationViewed$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$removeGroupFromConversationList$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$removeServerDeletedConversations$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$saveDraftMessageModel$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$saveRemoteConversationsToDb$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$storeInAppConversation$2;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$updateConversations$1;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$updateConversations$2;
import com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$updateInGroupStatus$1;
import com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationDao;
import com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationSimpleInfoDao;
import com.okinc.okimcore.feature.conversation.repository.remote.inhouseim.InHouseIMConversationService;
import com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupInfoDao;
import com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupMemberDao;
import com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupSettingDao;
import com.okinc.okimcore.model.im.conversation.InAppConversationExtra;
import com.okinc.okimcore.model.im.inhouseim.ReceiveMessageOptionType;
import com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMConversationStatus;
import com.okinc.okimcore.model.other.AnnouncementBanner;
import com.okinc.okimcore.model.remote.ConversationListRequest;
import com.okinc.okimcore.model.remote.DeleteConversationRequest;
import com.okinc.okimcore.model.remote.DeleteConversationResponse;
import com.okinc.okimcore.model.remote.MarkReadRequest;
import com.okinc.okimcore.model.remote.MaxSeqData;
import com.okinc.okimcore.model.remote.UpdateConversationReq;
import com.okinc.okimcore.model.room.inhouseim.ConversationStatus;
import com.okinc.okimcore.model.room.inhouseim.ConversationUnreadUpdateEntity;
import com.okinc.okimcore.model.room.inhouseim.DraftMessageModel;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationListData;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationSimpleInfoEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMServerConversationEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMServerConversationResponse;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import o.AbstractC43419rot;
import o.C44499sSb;
import o.sGI;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class sGK implements sGI {
    public final C44499sSb AYXKKw;
    public final InHouseIMConversationService EZpvd;
    public final CoroutineScope KWHzl;
    public final sIC OLrzqt;
    public final sHS copydefault;
    public final Mutex djBIcL;
    public CoroutineDispatcher gEmmrt;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    @yCM
    public sGK(@NotNull sIC sic, @NotNull sHS shs, @NotNull InHouseIMConversationService inHouseIMConversationService, @NotNull C44499sSb c44499sSb, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(sic, "");
        Intrinsics.checkNotNullParameter(shs, "");
        Intrinsics.checkNotNullParameter(inHouseIMConversationService, "");
        Intrinsics.checkNotNullParameter(c44499sSb, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.OLrzqt = sic;
        this.copydefault = shs;
        this.EZpvd = inHouseIMConversationService;
        this.AYXKKw = c44499sSb;
        this.KWHzl = coroutineScope;
        this.djBIcL = MutexKt.Mutex$default(false, 1, null);
        this.gEmmrt = sDN.copydefault.copydefault().limitedParallelism(1);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sGK.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final sIB DbNXlk() {
        sIB sibCopydefault = this.OLrzqt.copydefault();
        if (sibCopydefault != null) {
            return sibCopydefault;
        }
        throw new java.lang.IllegalArgumentException("database is null".toString());
    }

    public final InHouseIMConversationDao AYXKKw() {
        return DbNXlk().KWHzl();
    }

    public final InHouseIMGroupInfoDao values() {
        return DbNXlk().EZpvd();
    }

    public static final class ActionBar implements Flow<java.util.List<? extends InHouseIMConversationListData>> {
        public final /* synthetic */ Ref.LongRef AEQbTJ;
        public final /* synthetic */ Ref.BooleanRef EZpvd;
        public final /* synthetic */ Flow OLrzqt;

        public ActionBar(Flow flow, Ref.BooleanRef booleanRef, Ref.LongRef longRef) {
            this.OLrzqt = flow;
            this.EZpvd = booleanRef;
            this.AEQbTJ = longRef;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(@NotNull FlowCollector<? super java.util.List<? extends InHouseIMConversationListData>> flowCollector, @NotNull Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass1(flowCollector, this.EZpvd, this.AEQbTJ), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.sGK$ActionBar$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ Ref.LongRef AEQbTJ;
            public final /* synthetic */ Ref.BooleanRef EZpvd;
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector, Ref.BooleanRef booleanRef, Ref.LongRef longRef) {
                this.KWHzl = flowCollector;
                this.EZpvd = booleanRef;
                this.AEQbTJ = longRef;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, @NotNull Continuation continuation) throws java.lang.Throwable {
                InHouseIMConversationManagerImpl$getAllConversationsFlow$$inlined$map$1$2$1 inHouseIMConversationManagerImpl$getAllConversationsFlow$$inlined$map$1$2$1;
                if (continuation instanceof InHouseIMConversationManagerImpl$getAllConversationsFlow$$inlined$map$1$2$1) {
                    inHouseIMConversationManagerImpl$getAllConversationsFlow$$inlined$map$1$2$1 = (InHouseIMConversationManagerImpl$getAllConversationsFlow$$inlined$map$1$2$1) continuation;
                    int i = inHouseIMConversationManagerImpl$getAllConversationsFlow$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        inHouseIMConversationManagerImpl$getAllConversationsFlow$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        inHouseIMConversationManagerImpl$getAllConversationsFlow$$inlined$map$1$2$1 = new InHouseIMConversationManagerImpl$getAllConversationsFlow$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = inHouseIMConversationManagerImpl$getAllConversationsFlow$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = inHouseIMConversationManagerImpl$getAllConversationsFlow$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    java.util.List list = (java.util.List) obj;
                    C43296rmc.AEQbTJ("InHouseIMConversationManager", "conversation list update...");
                    Ref.BooleanRef booleanRef = this.EZpvd;
                    if (!booleanRef.element) {
                        booleanRef.element = true;
                        C43296rmc.AEQbTJ("InHouseIMConversationManager", "first conversation list update done, execution time: " + (java.lang.System.currentTimeMillis() - this.AEQbTJ.element) + " ms");
                    }
                    inHouseIMConversationManagerImpl$getAllConversationsFlow$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(list, inHouseIMConversationManagerImpl$getAllConversationsFlow$$inlined$map$1$2$1) == objCopydefault) {
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
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application implements Flow<java.lang.Integer> {
        public final /* synthetic */ Flow AEQbTJ;

        public Application(Flow flow) {
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(@NotNull FlowCollector<? super java.lang.Integer> flowCollector, @NotNull Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.sGK$Application$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, @NotNull Continuation continuation) throws java.lang.Throwable {
                InHouseIMConversationManagerImpl$getFlaggedConversationsWithUnreadCountFlow$$inlined$map$1$2$1 inHouseIMConversationManagerImpl$getFlaggedConversationsWithUnreadCountFlow$$inlined$map$1$2$1;
                if (continuation instanceof InHouseIMConversationManagerImpl$getFlaggedConversationsWithUnreadCountFlow$$inlined$map$1$2$1) {
                    inHouseIMConversationManagerImpl$getFlaggedConversationsWithUnreadCountFlow$$inlined$map$1$2$1 = (InHouseIMConversationManagerImpl$getFlaggedConversationsWithUnreadCountFlow$$inlined$map$1$2$1) continuation;
                    int i = inHouseIMConversationManagerImpl$getFlaggedConversationsWithUnreadCountFlow$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        inHouseIMConversationManagerImpl$getFlaggedConversationsWithUnreadCountFlow$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        inHouseIMConversationManagerImpl$getFlaggedConversationsWithUnreadCountFlow$$inlined$map$1$2$1 = new InHouseIMConversationManagerImpl$getFlaggedConversationsWithUnreadCountFlow$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = inHouseIMConversationManagerImpl$getFlaggedConversationsWithUnreadCountFlow$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = inHouseIMConversationManagerImpl$getFlaggedConversationsWithUnreadCountFlow$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    java.lang.Integer num = (java.lang.Integer) obj;
                    java.lang.Integer numAEQbTJ = C56443yFo.AEQbTJ(num != null ? num.intValue() : 0);
                    inHouseIMConversationManagerImpl$getFlaggedConversationsWithUnreadCountFlow$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(numAEQbTJ, inHouseIMConversationManagerImpl$getFlaggedConversationsWithUnreadCountFlow$$inlined$map$1$2$1) == objCopydefault) {
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
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Dialog implements Flow<java.lang.Integer> {
        public final /* synthetic */ Flow KWHzl;

        public Dialog(Flow flow) {
            this.KWHzl = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(@NotNull FlowCollector<? super java.lang.Integer> flowCollector, @NotNull Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.sGK$Dialog$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, @NotNull Continuation continuation) throws java.lang.Throwable {
                InHouseIMConversationManagerImpl$getTotalNumberOfConversationsWithUnreadCountFlow$$inlined$map$1$2$1 inHouseIMConversationManagerImpl$getTotalNumberOfConversationsWithUnreadCountFlow$$inlined$map$1$2$1;
                if (continuation instanceof InHouseIMConversationManagerImpl$getTotalNumberOfConversationsWithUnreadCountFlow$$inlined$map$1$2$1) {
                    inHouseIMConversationManagerImpl$getTotalNumberOfConversationsWithUnreadCountFlow$$inlined$map$1$2$1 = (InHouseIMConversationManagerImpl$getTotalNumberOfConversationsWithUnreadCountFlow$$inlined$map$1$2$1) continuation;
                    int i = inHouseIMConversationManagerImpl$getTotalNumberOfConversationsWithUnreadCountFlow$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        inHouseIMConversationManagerImpl$getTotalNumberOfConversationsWithUnreadCountFlow$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        inHouseIMConversationManagerImpl$getTotalNumberOfConversationsWithUnreadCountFlow$$inlined$map$1$2$1 = new InHouseIMConversationManagerImpl$getTotalNumberOfConversationsWithUnreadCountFlow$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = inHouseIMConversationManagerImpl$getTotalNumberOfConversationsWithUnreadCountFlow$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = inHouseIMConversationManagerImpl$getTotalNumberOfConversationsWithUnreadCountFlow$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    java.lang.Integer num = (java.lang.Integer) obj;
                    java.lang.Integer numAEQbTJ = C56443yFo.AEQbTJ(num != null ? num.intValue() : 0);
                    inHouseIMConversationManagerImpl$getTotalNumberOfConversationsWithUnreadCountFlow$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(numAEQbTJ, inHouseIMConversationManagerImpl$getTotalNumberOfConversationsWithUnreadCountFlow$$inlined$map$1$2$1) == objCopydefault) {
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
    }

    public static final class Fragment implements Flow<java.lang.Integer> {
        public final /* synthetic */ Flow AEQbTJ;

        public Fragment(Flow flow) {
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(@NotNull FlowCollector<? super java.lang.Integer> flowCollector, @NotNull Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.sGK$Fragment$2, reason: invalid class name */
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
            public final java.lang.Object emit(java.lang.Object obj, @NotNull Continuation continuation) throws java.lang.Throwable {
                InHouseIMConversationManagerImpl$getTotalUnreadCountByChannelTypeFlow$$inlined$map$1$2$1 inHouseIMConversationManagerImpl$getTotalUnreadCountByChannelTypeFlow$$inlined$map$1$2$1;
                if (continuation instanceof InHouseIMConversationManagerImpl$getTotalUnreadCountByChannelTypeFlow$$inlined$map$1$2$1) {
                    inHouseIMConversationManagerImpl$getTotalUnreadCountByChannelTypeFlow$$inlined$map$1$2$1 = (InHouseIMConversationManagerImpl$getTotalUnreadCountByChannelTypeFlow$$inlined$map$1$2$1) continuation;
                    int i = inHouseIMConversationManagerImpl$getTotalUnreadCountByChannelTypeFlow$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        inHouseIMConversationManagerImpl$getTotalUnreadCountByChannelTypeFlow$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        inHouseIMConversationManagerImpl$getTotalUnreadCountByChannelTypeFlow$$inlined$map$1$2$1 = new InHouseIMConversationManagerImpl$getTotalUnreadCountByChannelTypeFlow$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = inHouseIMConversationManagerImpl$getTotalUnreadCountByChannelTypeFlow$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = inHouseIMConversationManagerImpl$getTotalUnreadCountByChannelTypeFlow$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    java.lang.Integer num = (java.lang.Integer) obj;
                    java.lang.Integer numAEQbTJ = C56443yFo.AEQbTJ(num != null ? num.intValue() : 0);
                    inHouseIMConversationManagerImpl$getTotalUnreadCountByChannelTypeFlow$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(numAEQbTJ, inHouseIMConversationManagerImpl$getTotalUnreadCountByChannelTypeFlow$$inlined$map$1$2$1) == objCopydefault) {
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
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class FragmentManager implements Flow<java.lang.Integer> {
        public final /* synthetic */ Flow EZpvd;

        public FragmentManager(Flow flow) {
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(@NotNull FlowCollector<? super java.lang.Integer> flowCollector, @NotNull Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.sGK$FragmentManager$4, reason: invalid class name */
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
            public final java.lang.Object emit(java.lang.Object obj, @NotNull Continuation continuation) throws java.lang.Throwable {
                InHouseIMConversationManagerImpl$getTotalNumberOfConversationsWithFlaggedCountFlow$$inlined$map$1$2$1 inHouseIMConversationManagerImpl$getTotalNumberOfConversationsWithFlaggedCountFlow$$inlined$map$1$2$1;
                if (continuation instanceof InHouseIMConversationManagerImpl$getTotalNumberOfConversationsWithFlaggedCountFlow$$inlined$map$1$2$1) {
                    inHouseIMConversationManagerImpl$getTotalNumberOfConversationsWithFlaggedCountFlow$$inlined$map$1$2$1 = (InHouseIMConversationManagerImpl$getTotalNumberOfConversationsWithFlaggedCountFlow$$inlined$map$1$2$1) continuation;
                    int i = inHouseIMConversationManagerImpl$getTotalNumberOfConversationsWithFlaggedCountFlow$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        inHouseIMConversationManagerImpl$getTotalNumberOfConversationsWithFlaggedCountFlow$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        inHouseIMConversationManagerImpl$getTotalNumberOfConversationsWithFlaggedCountFlow$$inlined$map$1$2$1 = new InHouseIMConversationManagerImpl$getTotalNumberOfConversationsWithFlaggedCountFlow$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = inHouseIMConversationManagerImpl$getTotalNumberOfConversationsWithFlaggedCountFlow$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = inHouseIMConversationManagerImpl$getTotalNumberOfConversationsWithFlaggedCountFlow$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    java.lang.Integer num = (java.lang.Integer) obj;
                    java.lang.Integer numAEQbTJ = C56443yFo.AEQbTJ(num != null ? num.intValue() : 0);
                    inHouseIMConversationManagerImpl$getTotalNumberOfConversationsWithFlaggedCountFlow$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(numAEQbTJ, inHouseIMConversationManagerImpl$getTotalNumberOfConversationsWithFlaggedCountFlow$$inlined$map$1$2$1) == objCopydefault) {
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
    }

    public static final class LoaderManager implements Flow<java.lang.Integer> {
        public final /* synthetic */ Flow EZpvd;

        public LoaderManager(Flow flow) {
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(@NotNull FlowCollector<? super java.lang.Integer> flowCollector, @NotNull Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.sGK$LoaderManager$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, @NotNull Continuation continuation) throws java.lang.Throwable {
                InHouseIMConversationManagerImpl$getTotalUnreadCountFlow$$inlined$map$1$2$1 inHouseIMConversationManagerImpl$getTotalUnreadCountFlow$$inlined$map$1$2$1;
                if (continuation instanceof InHouseIMConversationManagerImpl$getTotalUnreadCountFlow$$inlined$map$1$2$1) {
                    inHouseIMConversationManagerImpl$getTotalUnreadCountFlow$$inlined$map$1$2$1 = (InHouseIMConversationManagerImpl$getTotalUnreadCountFlow$$inlined$map$1$2$1) continuation;
                    int i = inHouseIMConversationManagerImpl$getTotalUnreadCountFlow$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        inHouseIMConversationManagerImpl$getTotalUnreadCountFlow$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        inHouseIMConversationManagerImpl$getTotalUnreadCountFlow$$inlined$map$1$2$1 = new InHouseIMConversationManagerImpl$getTotalUnreadCountFlow$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = inHouseIMConversationManagerImpl$getTotalUnreadCountFlow$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = inHouseIMConversationManagerImpl$getTotalUnreadCountFlow$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    java.lang.Integer num = (java.lang.Integer) obj;
                    java.lang.Integer numAEQbTJ = C56443yFo.AEQbTJ(num != null ? num.intValue() : 0);
                    inHouseIMConversationManagerImpl$getTotalUnreadCountFlow$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(numAEQbTJ, inHouseIMConversationManagerImpl$getTotalUnreadCountFlow$$inlined$map$1$2$1) == objCopydefault) {
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
    }

    public static final class TaskDescription implements Flow<java.lang.Integer> {
        public final /* synthetic */ Flow AEQbTJ;

        public TaskDescription(Flow flow) {
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(@NotNull FlowCollector<? super java.lang.Integer> flowCollector, @NotNull Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.sGK$TaskDescription$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, @NotNull Continuation continuation) throws java.lang.Throwable {
                InHouseIMConversationManagerImpl$getNotificationTotalUnreadCountFlow$lambda$69$$inlined$map$1$2$1 inHouseIMConversationManagerImpl$getNotificationTotalUnreadCountFlow$lambda$69$$inlined$map$1$2$1;
                if (continuation instanceof InHouseIMConversationManagerImpl$getNotificationTotalUnreadCountFlow$lambda$69$$inlined$map$1$2$1) {
                    inHouseIMConversationManagerImpl$getNotificationTotalUnreadCountFlow$lambda$69$$inlined$map$1$2$1 = (InHouseIMConversationManagerImpl$getNotificationTotalUnreadCountFlow$lambda$69$$inlined$map$1$2$1) continuation;
                    int i = inHouseIMConversationManagerImpl$getNotificationTotalUnreadCountFlow$lambda$69$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        inHouseIMConversationManagerImpl$getNotificationTotalUnreadCountFlow$lambda$69$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        inHouseIMConversationManagerImpl$getNotificationTotalUnreadCountFlow$lambda$69$$inlined$map$1$2$1 = new InHouseIMConversationManagerImpl$getNotificationTotalUnreadCountFlow$lambda$69$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = inHouseIMConversationManagerImpl$getNotificationTotalUnreadCountFlow$lambda$69$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = inHouseIMConversationManagerImpl$getNotificationTotalUnreadCountFlow$lambda$69$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    java.lang.Integer num = (java.lang.Integer) obj;
                    java.lang.Integer numAEQbTJ = C56443yFo.AEQbTJ(num != null ? num.intValue() : 0);
                    inHouseIMConversationManagerImpl$getNotificationTotalUnreadCountFlow$lambda$69$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(numAEQbTJ, inHouseIMConversationManagerImpl$getNotificationTotalUnreadCountFlow$lambda$69$$inlined$map$1$2$1) == objCopydefault) {
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
    }

    public final InHouseIMGroupMemberDao isConnected() {
        return DbNXlk().AYXKKw();
    }

    public final InHouseIMGroupSettingDao fetchVPNInfo() {
        return DbNXlk().valueOf();
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class StateListAnimator implements Flow<java.lang.Integer> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(@NotNull FlowCollector<? super java.lang.Integer> flowCollector, @NotNull Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.sGK$StateListAnimator$4, reason: invalid class name */
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
            public final java.lang.Object emit(java.lang.Object obj, @NotNull Continuation continuation) throws java.lang.Throwable {
                InHouseIMConversationManagerImpl$getConversationTotalUnreadCountFlow$$inlined$map$1$2$1 inHouseIMConversationManagerImpl$getConversationTotalUnreadCountFlow$$inlined$map$1$2$1;
                if (continuation instanceof InHouseIMConversationManagerImpl$getConversationTotalUnreadCountFlow$$inlined$map$1$2$1) {
                    inHouseIMConversationManagerImpl$getConversationTotalUnreadCountFlow$$inlined$map$1$2$1 = (InHouseIMConversationManagerImpl$getConversationTotalUnreadCountFlow$$inlined$map$1$2$1) continuation;
                    int i = inHouseIMConversationManagerImpl$getConversationTotalUnreadCountFlow$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        inHouseIMConversationManagerImpl$getConversationTotalUnreadCountFlow$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        inHouseIMConversationManagerImpl$getConversationTotalUnreadCountFlow$$inlined$map$1$2$1 = new InHouseIMConversationManagerImpl$getConversationTotalUnreadCountFlow$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = inHouseIMConversationManagerImpl$getConversationTotalUnreadCountFlow$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = inHouseIMConversationManagerImpl$getConversationTotalUnreadCountFlow$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    java.lang.Integer num = (java.lang.Integer) obj;
                    java.lang.Integer numAEQbTJ = C56443yFo.AEQbTJ(num != null ? num.intValue() : 0);
                    inHouseIMConversationManagerImpl$getConversationTotalUnreadCountFlow$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(numAEQbTJ, inHouseIMConversationManagerImpl$getConversationTotalUnreadCountFlow$$inlined$map$1$2$1) == objCopydefault) {
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
    }

    public final InHouseIMConversationSimpleInfoDao valueOf() {
        return DbNXlk().AEQbTJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.sGI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super InHouseIMConversationListData> continuation) throws java.lang.Exception {
        InHouseIMConversationManagerImpl$getAndSaveSingleConversation$1 inHouseIMConversationManagerImpl$getAndSaveSingleConversation$1;
        sGK sgk;
        InHouseIMConversationListData inHouseIMConversationListData;
        sGK sgk2;
        if (continuation instanceof InHouseIMConversationManagerImpl$getAndSaveSingleConversation$1) {
            inHouseIMConversationManagerImpl$getAndSaveSingleConversation$1 = (InHouseIMConversationManagerImpl$getAndSaveSingleConversation$1) continuation;
            int i = inHouseIMConversationManagerImpl$getAndSaveSingleConversation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMConversationManagerImpl$getAndSaveSingleConversation$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMConversationManagerImpl$getAndSaveSingleConversation$1 = new InHouseIMConversationManagerImpl$getAndSaveSingleConversation$1(this, continuation);
            }
        }
        java.lang.Object objDjBIcL = inHouseIMConversationManagerImpl$getAndSaveSingleConversation$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMConversationManagerImpl$getAndSaveSingleConversation$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objDjBIcL);
            C44124sEe.imLogConversation$default("InHouseIMConversationManagerImpl => getSingleConversation start=> channelID = " + str + ", local only=" + z, null, 2, null);
            inHouseIMConversationManagerImpl$getAndSaveSingleConversation$1.L$0 = this;
            inHouseIMConversationManagerImpl$getAndSaveSingleConversation$1.L$1 = str;
            inHouseIMConversationManagerImpl$getAndSaveSingleConversation$1.Z$0 = z;
            inHouseIMConversationManagerImpl$getAndSaveSingleConversation$1.label = 1;
            objDjBIcL = djBIcL(str, inHouseIMConversationManagerImpl$getAndSaveSingleConversation$1);
            if (objDjBIcL == objCopydefault) {
                return objCopydefault;
            }
            sgk = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) inHouseIMConversationManagerImpl$getAndSaveSingleConversation$1.L$0;
                    C56391yDq.AEQbTJ(objDjBIcL);
                    inHouseIMConversationListData = (InHouseIMConversationListData) objDjBIcL;
                    C44124sEe.imLogConversation$default("InHouseIMConversationManagerImpl => getSingleConversation done:" + str, null, 2, null);
                    return inHouseIMConversationListData;
                }
                str = (java.lang.String) inHouseIMConversationManagerImpl$getAndSaveSingleConversation$1.L$1;
                sgk2 = (sGK) inHouseIMConversationManagerImpl$getAndSaveSingleConversation$1.L$0;
                C56391yDq.AEQbTJ(objDjBIcL);
                CollectionsKt___CollectionsKt.firstOrNull((java.util.List) objDjBIcL);
                inHouseIMConversationManagerImpl$getAndSaveSingleConversation$1.L$0 = str;
                inHouseIMConversationManagerImpl$getAndSaveSingleConversation$1.L$1 = null;
                inHouseIMConversationManagerImpl$getAndSaveSingleConversation$1.label = 3;
                objDjBIcL = sgk2.djBIcL(str, inHouseIMConversationManagerImpl$getAndSaveSingleConversation$1);
                if (objDjBIcL == objCopydefault) {
                    return objCopydefault;
                }
                inHouseIMConversationListData = (InHouseIMConversationListData) objDjBIcL;
                C44124sEe.imLogConversation$default("InHouseIMConversationManagerImpl => getSingleConversation done:" + str, null, 2, null);
                return inHouseIMConversationListData;
            }
            z = inHouseIMConversationManagerImpl$getAndSaveSingleConversation$1.Z$0;
            str = (java.lang.String) inHouseIMConversationManagerImpl$getAndSaveSingleConversation$1.L$1;
            sgk = (sGK) inHouseIMConversationManagerImpl$getAndSaveSingleConversation$1.L$0;
            C56391yDq.AEQbTJ(objDjBIcL);
        }
        inHouseIMConversationListData = (InHouseIMConversationListData) objDjBIcL;
        if (!z && inHouseIMConversationListData == null) {
            java.util.List<java.lang.String> listEZpvd = C56402yEa.EZpvd(str);
            inHouseIMConversationManagerImpl$getAndSaveSingleConversation$1.L$0 = sgk;
            inHouseIMConversationManagerImpl$getAndSaveSingleConversation$1.L$1 = str;
            inHouseIMConversationManagerImpl$getAndSaveSingleConversation$1.label = 2;
            objDjBIcL = sgk.copydefault(listEZpvd, inHouseIMConversationManagerImpl$getAndSaveSingleConversation$1);
            if (objDjBIcL == objCopydefault) {
                return objCopydefault;
            }
            sgk2 = sgk;
            CollectionsKt___CollectionsKt.firstOrNull((java.util.List) objDjBIcL);
            inHouseIMConversationManagerImpl$getAndSaveSingleConversation$1.L$0 = str;
            inHouseIMConversationManagerImpl$getAndSaveSingleConversation$1.L$1 = null;
            inHouseIMConversationManagerImpl$getAndSaveSingleConversation$1.label = 3;
            objDjBIcL = sgk2.djBIcL(str, inHouseIMConversationManagerImpl$getAndSaveSingleConversation$1);
            if (objDjBIcL == objCopydefault) {
            }
            inHouseIMConversationListData = (InHouseIMConversationListData) objDjBIcL;
        }
        C44124sEe.imLogConversation$default("InHouseIMConversationManagerImpl => getSingleConversation done:" + str, null, 2, null);
        return inHouseIMConversationListData;
    }

    /* JADX DEBUG: Duplicate block (B:76:0x01a2) to fix multi-entry loop: BACK_EDGE: B:76:0x01a2 -> B:77:0x01ac */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v30, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v43, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v44, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x01b3: MOVE (r6 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:78:0x01b3 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01b4: MOVE (r7 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:78:0x01b3 */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0145 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0046, B:38:0x00fe, B:54:0x0137, B:55:0x013a, B:59:0x013f, B:61:0x0145, B:63:0x0151, B:64:0x0154, B:65:0x0155, B:66:0x0158, B:70:0x016e, B:72:0x017b), top: B:88:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017b A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0046, B:38:0x00fe, B:54:0x0137, B:55:0x013a, B:59:0x013f, B:61:0x0145, B:63:0x0151, B:64:0x0154, B:65:0x0155, B:66:0x0158, B:70:0x016e, B:72:0x017b), top: B:88:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object djBIcL(@NotNull java.lang.String str, @NotNull Continuation<? super InHouseIMConversationListData> continuation) throws java.lang.Exception {
        InHouseIMConversationManagerImpl$getConversationFromLocal$1 inHouseIMConversationManagerImpl$getConversationFromLocal$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDaoAYXKKw;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        sGK sgk;
        InHouseIMConversationManagerImpl$getConversationFromLocal$1 inHouseIMConversationManagerImpl$getConversationFromLocal$12;
        java.lang.String str2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        int i3;
        java.lang.String str3;
        Ref.ObjectRef objectRef2;
        int i4;
        sGK sgk2;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        sGK sgk3;
        Ref.ObjectRef objectRef3;
        Ref.LongRef longRef4;
        int i5;
        BaseDao baseDao2;
        int i6;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException2;
        java.lang.String message;
        ?? r0;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        long jNanoTime;
        java.lang.String str4;
        T t;
        if (continuation instanceof InHouseIMConversationManagerImpl$getConversationFromLocal$1) {
            inHouseIMConversationManagerImpl$getConversationFromLocal$1 = (InHouseIMConversationManagerImpl$getConversationFromLocal$1) continuation;
            int i7 = inHouseIMConversationManagerImpl$getConversationFromLocal$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                inHouseIMConversationManagerImpl$getConversationFromLocal$1.label = i7 - Integer.MIN_VALUE;
            } else {
                inHouseIMConversationManagerImpl$getConversationFromLocal$1 = new InHouseIMConversationManagerImpl$getConversationFromLocal$1(this, continuation);
            }
        }
        java.lang.Object obj = inHouseIMConversationManagerImpl$getConversationFromLocal$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = inHouseIMConversationManagerImpl$getConversationFromLocal$1.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    jNanoTime = inHouseIMConversationManagerImpl$getConversationFromLocal$1.J$0;
                    i4 = inHouseIMConversationManagerImpl$getConversationFromLocal$1.I$2;
                    i3 = inHouseIMConversationManagerImpl$getConversationFromLocal$1.I$1;
                    i = inHouseIMConversationManagerImpl$getConversationFromLocal$1.I$0;
                    objectRef5 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getConversationFromLocal$1.L$7;
                    longRef3 = (Ref.LongRef) inHouseIMConversationManagerImpl$getConversationFromLocal$1.L$6;
                    objectRef4 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getConversationFromLocal$1.L$5;
                    objectRef2 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getConversationFromLocal$1.L$4;
                    longRef2 = (Ref.LongRef) inHouseIMConversationManagerImpl$getConversationFromLocal$1.L$3;
                    baseDaoAYXKKw = (BaseDao) inHouseIMConversationManagerImpl$getConversationFromLocal$1.L$2;
                    str4 = (java.lang.String) inHouseIMConversationManagerImpl$getConversationFromLocal$1.L$1;
                    sgk2 = (sGK) inHouseIMConversationManagerImpl$getConversationFromLocal$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        longRef4 = longRef2;
                        i5 = i3;
                        baseDao2 = baseDaoAYXKKw;
                        i6 = i;
                        t = obj;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        str3 = str4;
                        sQLiteDatabaseLockedException2 = e3;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        sgk3 = sgk2;
                        objectRef3 = objectRef2;
                        int i9 = i3;
                        longRef4 = longRef2;
                        i5 = i9;
                        int i10 = i;
                        baseDao2 = baseDaoAYXKKw;
                        i6 = i10;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        inHouseIMConversationManagerImpl$getConversationFromLocal$12 = inHouseIMConversationManagerImpl$getConversationFromLocal$1;
                        i2 = i + i;
                        sgk = sgk3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    } catch (java.lang.IllegalStateException e4) {
                        e2 = e4;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e5) {
                        e = e5;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        C44159sFm.EZpvd(baseDaoAYXKKw, longRef2.element);
                        throw th;
                    }
                    objectRef5.element = t;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef4.element;
                    C44159sFm.EZpvd(baseDao2, longRef4.element);
                    return t2;
                }
                if (i8 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i11 = inHouseIMConversationManagerImpl$getConversationFromLocal$1.I$1;
                int i12 = inHouseIMConversationManagerImpl$getConversationFromLocal$1.I$0;
                Ref.ObjectRef objectRef6 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getConversationFromLocal$1.L$4;
                longRef4 = (Ref.LongRef) inHouseIMConversationManagerImpl$getConversationFromLocal$1.L$3;
                BaseDao baseDao3 = (BaseDao) inHouseIMConversationManagerImpl$getConversationFromLocal$1.L$2;
                java.lang.String str5 = (java.lang.String) inHouseIMConversationManagerImpl$getConversationFromLocal$1.L$1;
                sgk3 = (sGK) inHouseIMConversationManagerImpl$getConversationFromLocal$1.L$0;
                C56391yDq.AEQbTJ(obj);
                InHouseIMConversationManagerImpl$getConversationFromLocal$1 inHouseIMConversationManagerImpl$getConversationFromLocal$13 = inHouseIMConversationManagerImpl$getConversationFromLocal$1;
                int i13 = 1;
                baseDaoAYXKKw = baseDao3;
                str2 = str5;
                i = i12;
                objectRef = objectRef6;
                inHouseIMConversationManagerImpl$getConversationFromLocal$12 = inHouseIMConversationManagerImpl$getConversationFromLocal$13;
                i2 = i11 + i13;
                sgk = sgk3;
                longRef3 = longRef4;
                if (i2 >= i) {
                    try {
                        try {
                        } catch (java.lang.IllegalStateException e6) {
                            e2 = e6;
                            longRef2 = longRef3;
                            message = e2.getMessage();
                            if (message == null) {
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e7) {
                            e = e7;
                            longRef2 = longRef3;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            longRef2 = longRef3;
                            C44159sFm.EZpvd(baseDaoAYXKKw, longRef2.element);
                            throw th;
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                        str3 = str2;
                        inHouseIMConversationManagerImpl$getConversationFromLocal$1 = inHouseIMConversationManagerImpl$getConversationFromLocal$12;
                        sgk2 = sgk;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException = e8;
                        sgk3 = sgk2;
                        objectRef3 = objectRef2;
                        int i92 = i3;
                        longRef4 = longRef2;
                        i5 = i92;
                        int i102 = i;
                        baseDao2 = baseDaoAYXKKw;
                        i6 = i102;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                            inHouseIMConversationManagerImpl$getConversationFromLocal$1.L$0 = sgk3;
                            inHouseIMConversationManagerImpl$getConversationFromLocal$1.L$1 = str3;
                            inHouseIMConversationManagerImpl$getConversationFromLocal$1.L$2 = baseDao2;
                            inHouseIMConversationManagerImpl$getConversationFromLocal$1.L$3 = longRef4;
                            inHouseIMConversationManagerImpl$getConversationFromLocal$1.L$4 = objectRef3;
                            inHouseIMConversationManagerImpl$getConversationFromLocal$1.L$5 = null;
                            inHouseIMConversationManagerImpl$getConversationFromLocal$1.L$6 = null;
                            inHouseIMConversationManagerImpl$getConversationFromLocal$1.L$7 = null;
                            inHouseIMConversationManagerImpl$getConversationFromLocal$1.I$0 = i6;
                            inHouseIMConversationManagerImpl$getConversationFromLocal$1.I$1 = i5;
                            inHouseIMConversationManagerImpl$getConversationFromLocal$1.label = 2;
                            if (DelayKt.delay(((long) (i4 + 1)) * 50, inHouseIMConversationManagerImpl$getConversationFromLocal$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            inHouseIMConversationManagerImpl$getConversationFromLocal$13 = inHouseIMConversationManagerImpl$getConversationFromLocal$1;
                            i11 = i5;
                            str2 = str3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao4 = baseDao2;
                            i = i6;
                            baseDaoAYXKKw = baseDao4;
                        } else {
                            inHouseIMConversationManagerImpl$getConversationFromLocal$13 = inHouseIMConversationManagerImpl$getConversationFromLocal$1;
                            i11 = i5;
                            str2 = str3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao5 = baseDao2;
                            i = i6;
                            baseDaoAYXKKw = baseDao5;
                        }
                        inHouseIMConversationManagerImpl$getConversationFromLocal$12 = inHouseIMConversationManagerImpl$getConversationFromLocal$13;
                        i2 = i11 + i13;
                        sgk = sgk3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        str3 = str2;
                        inHouseIMConversationManagerImpl$getConversationFromLocal$1 = inHouseIMConversationManagerImpl$getConversationFromLocal$12;
                        sgk2 = sgk;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException2 = e9;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        sgk3 = sgk2;
                        objectRef3 = objectRef2;
                        int i922 = i3;
                        longRef4 = longRef2;
                        i5 = i922;
                        int i1022 = i;
                        baseDao2 = baseDaoAYXKKw;
                        i6 = i1022;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        inHouseIMConversationManagerImpl$getConversationFromLocal$12 = inHouseIMConversationManagerImpl$getConversationFromLocal$13;
                        i2 = i11 + i13;
                        sgk = sgk3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    objectRef5 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    InHouseIMConversationDao inHouseIMConversationDaoAYXKKw = sgk.AYXKKw();
                    inHouseIMConversationManagerImpl$getConversationFromLocal$12.L$0 = sgk;
                    inHouseIMConversationManagerImpl$getConversationFromLocal$12.L$1 = str2;
                    inHouseIMConversationManagerImpl$getConversationFromLocal$12.L$2 = baseDaoAYXKKw;
                    inHouseIMConversationManagerImpl$getConversationFromLocal$12.L$3 = longRef3;
                    inHouseIMConversationManagerImpl$getConversationFromLocal$12.L$4 = objectRef;
                    inHouseIMConversationManagerImpl$getConversationFromLocal$12.L$5 = objectRef5;
                    inHouseIMConversationManagerImpl$getConversationFromLocal$12.L$6 = longRef3;
                    inHouseIMConversationManagerImpl$getConversationFromLocal$12.L$7 = objectRef5;
                    inHouseIMConversationManagerImpl$getConversationFromLocal$12.I$0 = i;
                    inHouseIMConversationManagerImpl$getConversationFromLocal$12.I$1 = i2;
                    inHouseIMConversationManagerImpl$getConversationFromLocal$12.I$2 = i2;
                    inHouseIMConversationManagerImpl$getConversationFromLocal$12.J$0 = jNanoTime;
                    inHouseIMConversationManagerImpl$getConversationFromLocal$12.label = 1;
                    java.lang.Object conversation = inHouseIMConversationDaoAYXKKw.getConversation(str2, inHouseIMConversationManagerImpl$getConversationFromLocal$12);
                    if (conversation == objCopydefault) {
                        return objCopydefault;
                    }
                    str4 = str2;
                    inHouseIMConversationManagerImpl$getConversationFromLocal$1 = inHouseIMConversationManagerImpl$getConversationFromLocal$12;
                    sgk2 = sgk;
                    i4 = i2;
                    objectRef4 = objectRef5;
                    longRef4 = longRef3;
                    objectRef2 = objectRef;
                    i5 = i4;
                    int i14 = i;
                    baseDao2 = baseDaoAYXKKw;
                    i6 = i14;
                    t = conversation;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                        sgk3 = sgk2;
                        objectRef3 = objectRef2;
                        str3 = str4;
                        r0 = e10;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        inHouseIMConversationManagerImpl$getConversationFromLocal$12 = inHouseIMConversationManagerImpl$getConversationFromLocal$13;
                        i2 = i11 + i13;
                        sgk = sgk3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    } catch (java.lang.IllegalStateException e11) {
                        e2 = e11;
                        message = e2.getMessage();
                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                            C44159sFm.OLrzqt(e2);
                            throw e2;
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e12) {
                        e = e12;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    }
                    objectRef5.element = t;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t22 = objectRef4.element;
                    C44159sFm.EZpvd(baseDao2, longRef4.element);
                    return t22;
                }
                C44159sFm.EZpvd(baseDaoAYXKKw, longRef3.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            baseDaoAYXKKw = AYXKKw();
            longRef3 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 3;
            i2 = 0;
            sgk = this;
            inHouseIMConversationManagerImpl$getConversationFromLocal$12 = inHouseIMConversationManagerImpl$getConversationFromLocal$1;
            str2 = str;
            if (i2 >= i) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            longRef2 = longRef;
            baseDaoAYXKKw = baseDao;
        }
    }

    /* JADX DEBUG: Duplicate block (B:76:0x01a2) to fix multi-entry loop: BACK_EDGE: B:76:0x01a2 -> B:77:0x01ac */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v30, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v43, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v44, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x01b3: MOVE (r6 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:78:0x01b3 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01b4: MOVE (r7 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:78:0x01b3 */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0145 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0046, B:38:0x00fe, B:54:0x0137, B:55:0x013a, B:59:0x013f, B:61:0x0145, B:63:0x0151, B:64:0x0154, B:65:0x0155, B:66:0x0158, B:70:0x016e, B:72:0x017b), top: B:88:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017b A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0046, B:38:0x00fe, B:54:0x0137, B:55:0x013a, B:59:0x013f, B:61:0x0145, B:63:0x0151, B:64:0x0154, B:65:0x0155, B:66:0x0158, B:70:0x016e, B:72:0x017b), top: B:88:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    @Override // o.sGI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super InHouseIMConversationEntity> continuation) throws java.lang.Exception {
        InHouseIMConversationManagerImpl$getConversationEntityFromLocal$1 inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDaoAYXKKw;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        sGK sgk;
        InHouseIMConversationManagerImpl$getConversationEntityFromLocal$1 inHouseIMConversationManagerImpl$getConversationEntityFromLocal$12;
        java.lang.String str2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        int i3;
        java.lang.String str3;
        Ref.ObjectRef objectRef2;
        int i4;
        sGK sgk2;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        sGK sgk3;
        Ref.ObjectRef objectRef3;
        Ref.LongRef longRef4;
        int i5;
        BaseDao baseDao2;
        int i6;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException2;
        java.lang.String message;
        ?? r0;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        long jNanoTime;
        java.lang.String str4;
        T t;
        if (continuation instanceof InHouseIMConversationManagerImpl$getConversationEntityFromLocal$1) {
            inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1 = (InHouseIMConversationManagerImpl$getConversationEntityFromLocal$1) continuation;
            int i7 = inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.label = i7 - Integer.MIN_VALUE;
            } else {
                inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1 = new InHouseIMConversationManagerImpl$getConversationEntityFromLocal$1(this, continuation);
            }
        }
        java.lang.Object obj = inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    jNanoTime = inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.J$0;
                    i4 = inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.I$2;
                    i3 = inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.I$1;
                    i = inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.I$0;
                    objectRef5 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.L$7;
                    longRef3 = (Ref.LongRef) inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.L$6;
                    objectRef4 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.L$5;
                    objectRef2 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.L$4;
                    longRef2 = (Ref.LongRef) inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.L$3;
                    baseDaoAYXKKw = (BaseDao) inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.L$2;
                    str4 = (java.lang.String) inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.L$1;
                    sgk2 = (sGK) inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        longRef4 = longRef2;
                        i5 = i3;
                        baseDao2 = baseDaoAYXKKw;
                        i6 = i;
                        t = obj;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        str3 = str4;
                        sQLiteDatabaseLockedException2 = e3;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        sgk3 = sgk2;
                        objectRef3 = objectRef2;
                        int i9 = i3;
                        longRef4 = longRef2;
                        i5 = i9;
                        int i10 = i;
                        baseDao2 = baseDaoAYXKKw;
                        i6 = i10;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        inHouseIMConversationManagerImpl$getConversationEntityFromLocal$12 = inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1;
                        i2 = i + i;
                        sgk = sgk3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    } catch (java.lang.IllegalStateException e4) {
                        e2 = e4;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e5) {
                        e = e5;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        C44159sFm.EZpvd(baseDaoAYXKKw, longRef2.element);
                        throw th;
                    }
                    objectRef5.element = t;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef4.element;
                    C44159sFm.EZpvd(baseDao2, longRef4.element);
                    return t2;
                }
                if (i8 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i11 = inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.I$1;
                int i12 = inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.I$0;
                Ref.ObjectRef objectRef6 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.L$4;
                longRef4 = (Ref.LongRef) inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.L$3;
                BaseDao baseDao3 = (BaseDao) inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.L$2;
                java.lang.String str5 = (java.lang.String) inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.L$1;
                sgk3 = (sGK) inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.L$0;
                C56391yDq.AEQbTJ(obj);
                InHouseIMConversationManagerImpl$getConversationEntityFromLocal$1 inHouseIMConversationManagerImpl$getConversationEntityFromLocal$13 = inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1;
                int i13 = 1;
                baseDaoAYXKKw = baseDao3;
                str2 = str5;
                i = i12;
                objectRef = objectRef6;
                inHouseIMConversationManagerImpl$getConversationEntityFromLocal$12 = inHouseIMConversationManagerImpl$getConversationEntityFromLocal$13;
                i2 = i11 + i13;
                sgk = sgk3;
                longRef3 = longRef4;
                if (i2 >= i) {
                    try {
                        try {
                        } catch (java.lang.IllegalStateException e6) {
                            e2 = e6;
                            longRef2 = longRef3;
                            message = e2.getMessage();
                            if (message == null) {
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e7) {
                            e = e7;
                            longRef2 = longRef3;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            longRef2 = longRef3;
                            C44159sFm.EZpvd(baseDaoAYXKKw, longRef2.element);
                            throw th;
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                        str3 = str2;
                        inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1 = inHouseIMConversationManagerImpl$getConversationEntityFromLocal$12;
                        sgk2 = sgk;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException = e8;
                        sgk3 = sgk2;
                        objectRef3 = objectRef2;
                        int i92 = i3;
                        longRef4 = longRef2;
                        i5 = i92;
                        int i102 = i;
                        baseDao2 = baseDaoAYXKKw;
                        i6 = i102;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                            inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.L$0 = sgk3;
                            inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.L$1 = str3;
                            inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.L$2 = baseDao2;
                            inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.L$3 = longRef4;
                            inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.L$4 = objectRef3;
                            inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.L$5 = null;
                            inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.L$6 = null;
                            inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.L$7 = null;
                            inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.I$0 = i6;
                            inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.I$1 = i5;
                            inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1.label = 2;
                            if (DelayKt.delay(((long) (i4 + 1)) * 50, inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            inHouseIMConversationManagerImpl$getConversationEntityFromLocal$13 = inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1;
                            i11 = i5;
                            str2 = str3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao4 = baseDao2;
                            i = i6;
                            baseDaoAYXKKw = baseDao4;
                        } else {
                            inHouseIMConversationManagerImpl$getConversationEntityFromLocal$13 = inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1;
                            i11 = i5;
                            str2 = str3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao5 = baseDao2;
                            i = i6;
                            baseDaoAYXKKw = baseDao5;
                        }
                        inHouseIMConversationManagerImpl$getConversationEntityFromLocal$12 = inHouseIMConversationManagerImpl$getConversationEntityFromLocal$13;
                        i2 = i11 + i13;
                        sgk = sgk3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        str3 = str2;
                        inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1 = inHouseIMConversationManagerImpl$getConversationEntityFromLocal$12;
                        sgk2 = sgk;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException2 = e9;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        sgk3 = sgk2;
                        objectRef3 = objectRef2;
                        int i922 = i3;
                        longRef4 = longRef2;
                        i5 = i922;
                        int i1022 = i;
                        baseDao2 = baseDaoAYXKKw;
                        i6 = i1022;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        inHouseIMConversationManagerImpl$getConversationEntityFromLocal$12 = inHouseIMConversationManagerImpl$getConversationEntityFromLocal$13;
                        i2 = i11 + i13;
                        sgk = sgk3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    objectRef5 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    InHouseIMConversationDao inHouseIMConversationDaoAYXKKw = sgk.AYXKKw();
                    inHouseIMConversationManagerImpl$getConversationEntityFromLocal$12.L$0 = sgk;
                    inHouseIMConversationManagerImpl$getConversationEntityFromLocal$12.L$1 = str2;
                    inHouseIMConversationManagerImpl$getConversationEntityFromLocal$12.L$2 = baseDaoAYXKKw;
                    inHouseIMConversationManagerImpl$getConversationEntityFromLocal$12.L$3 = longRef3;
                    inHouseIMConversationManagerImpl$getConversationEntityFromLocal$12.L$4 = objectRef;
                    inHouseIMConversationManagerImpl$getConversationEntityFromLocal$12.L$5 = objectRef5;
                    inHouseIMConversationManagerImpl$getConversationEntityFromLocal$12.L$6 = longRef3;
                    inHouseIMConversationManagerImpl$getConversationEntityFromLocal$12.L$7 = objectRef5;
                    inHouseIMConversationManagerImpl$getConversationEntityFromLocal$12.I$0 = i;
                    inHouseIMConversationManagerImpl$getConversationEntityFromLocal$12.I$1 = i2;
                    inHouseIMConversationManagerImpl$getConversationEntityFromLocal$12.I$2 = i2;
                    inHouseIMConversationManagerImpl$getConversationEntityFromLocal$12.J$0 = jNanoTime;
                    inHouseIMConversationManagerImpl$getConversationEntityFromLocal$12.label = 1;
                    java.lang.Object conversationEntity = inHouseIMConversationDaoAYXKKw.getConversationEntity(str2, inHouseIMConversationManagerImpl$getConversationEntityFromLocal$12);
                    if (conversationEntity == objCopydefault) {
                        return objCopydefault;
                    }
                    str4 = str2;
                    inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1 = inHouseIMConversationManagerImpl$getConversationEntityFromLocal$12;
                    sgk2 = sgk;
                    i4 = i2;
                    objectRef4 = objectRef5;
                    longRef4 = longRef3;
                    objectRef2 = objectRef;
                    i5 = i4;
                    int i14 = i;
                    baseDao2 = baseDaoAYXKKw;
                    i6 = i14;
                    t = conversationEntity;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                        sgk3 = sgk2;
                        objectRef3 = objectRef2;
                        str3 = str4;
                        r0 = e10;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        inHouseIMConversationManagerImpl$getConversationEntityFromLocal$12 = inHouseIMConversationManagerImpl$getConversationEntityFromLocal$13;
                        i2 = i11 + i13;
                        sgk = sgk3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    } catch (java.lang.IllegalStateException e11) {
                        e2 = e11;
                        message = e2.getMessage();
                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                            C44159sFm.OLrzqt(e2);
                            throw e2;
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e12) {
                        e = e12;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    }
                    objectRef5.element = t;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t22 = objectRef4.element;
                    C44159sFm.EZpvd(baseDao2, longRef4.element);
                    return t22;
                }
                C44159sFm.EZpvd(baseDaoAYXKKw, longRef3.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            baseDaoAYXKKw = AYXKKw();
            longRef3 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 3;
            i2 = 0;
            sgk = this;
            inHouseIMConversationManagerImpl$getConversationEntityFromLocal$12 = inHouseIMConversationManagerImpl$getConversationEntityFromLocal$1;
            str2 = str;
            if (i2 >= i) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            longRef2 = longRef;
            baseDaoAYXKKw = baseDao;
        }
    }

    @Override // o.sGI
    public Flow<java.lang.Integer> copydefault(@NotNull java.lang.String str) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(str, "");
        InHouseIMConversationDao inHouseIMConversationDaoAYXKKw = AYXKKw();
        Ref.LongRef longRef = new Ref.LongRef();
        java.lang.Exception exc = null;
        int i = 0;
        while (i < 3) {
            try {
                long jNanoTime = java.lang.System.nanoTime();
                Flow<java.lang.Integer> conversationUnreadCountFlow = AYXKKw().getConversationUnreadCountFlow(str);
                long jValueOf = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                longRef.element = jValueOf;
                C44159sFm.EZpvd(inHouseIMConversationDaoAYXKKw, jValueOf);
                return FlowKt.distinctUntilChanged(conversationUnreadCountFlow);
            } catch (android.database.sqlite.SQLiteDatabaseLockedException e) {
                try {
                    C44159sFm.copydefault(e, exc);
                    i++;
                    exc = e;
                } finally {
                    C44159sFm.EZpvd(inHouseIMConversationDaoAYXKKw, longRef.element);
                }
            } catch (java.lang.IllegalStateException e2) {
                java.lang.String message = e2.getMessage();
                if (message != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                    C44159sFm.OLrzqt(e2);
                    throw e2;
                }
                C44159sFm.copydefault(e2);
                throw e2;
            } catch (java.lang.Exception e3) {
                C44159sFm.OLrzqt(e3);
                throw e3;
            }
        }
        if (exc == null) {
            exc = new java.lang.Exception("Database Operation failed after 3 attempts");
        }
        C44159sFm.OLrzqt(exc);
        throw exc;
    }

    /* JADX DEBUG: Duplicate block (B:80:0x01b0) to fix multi-entry loop: BACK_EDGE: B:80:0x01b0 -> B:81:0x01ba */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v21, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v32, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v45, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v46, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x01c1: MOVE (r6 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:82:0x01c1 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01c2: MOVE (r7 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:82:0x01c1 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0153 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0046, B:38:0x00fe, B:58:0x0145, B:59:0x0148, B:63:0x014d, B:65:0x0153, B:67:0x015f, B:68:0x0162, B:69:0x0163, B:70:0x0166, B:74:0x017c, B:76:0x0189), top: B:90:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0189 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0046, B:38:0x00fe, B:58:0x0145, B:59:0x0148, B:63:0x014d, B:65:0x0153, B:67:0x015f, B:68:0x0162, B:69:0x0163, B:70:0x0166, B:74:0x017c, B:76:0x0189), top: B:90:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    @Override // o.sGI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Integer> continuation) throws java.lang.Exception {
        InHouseIMConversationManagerImpl$getConversationUnreadCount$1 inHouseIMConversationManagerImpl$getConversationUnreadCount$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDaoAYXKKw;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        sGK sgk;
        InHouseIMConversationManagerImpl$getConversationUnreadCount$1 inHouseIMConversationManagerImpl$getConversationUnreadCount$12;
        java.lang.String str2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        int i3;
        java.lang.String str3;
        Ref.ObjectRef objectRef2;
        int i4;
        sGK sgk2;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        sGK sgk3;
        Ref.ObjectRef objectRef3;
        Ref.LongRef longRef4;
        int i5;
        BaseDao baseDao2;
        int i6;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException2;
        java.lang.String message;
        ?? r0;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        long jNanoTime;
        java.lang.String str4;
        T t;
        if (continuation instanceof InHouseIMConversationManagerImpl$getConversationUnreadCount$1) {
            inHouseIMConversationManagerImpl$getConversationUnreadCount$1 = (InHouseIMConversationManagerImpl$getConversationUnreadCount$1) continuation;
            int i7 = inHouseIMConversationManagerImpl$getConversationUnreadCount$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                inHouseIMConversationManagerImpl$getConversationUnreadCount$1.label = i7 - Integer.MIN_VALUE;
            } else {
                inHouseIMConversationManagerImpl$getConversationUnreadCount$1 = new InHouseIMConversationManagerImpl$getConversationUnreadCount$1(this, continuation);
            }
        }
        java.lang.Object obj = inHouseIMConversationManagerImpl$getConversationUnreadCount$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = inHouseIMConversationManagerImpl$getConversationUnreadCount$1.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    jNanoTime = inHouseIMConversationManagerImpl$getConversationUnreadCount$1.J$0;
                    i4 = inHouseIMConversationManagerImpl$getConversationUnreadCount$1.I$2;
                    i3 = inHouseIMConversationManagerImpl$getConversationUnreadCount$1.I$1;
                    i = inHouseIMConversationManagerImpl$getConversationUnreadCount$1.I$0;
                    objectRef5 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getConversationUnreadCount$1.L$7;
                    longRef3 = (Ref.LongRef) inHouseIMConversationManagerImpl$getConversationUnreadCount$1.L$6;
                    objectRef4 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getConversationUnreadCount$1.L$5;
                    objectRef2 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getConversationUnreadCount$1.L$4;
                    longRef2 = (Ref.LongRef) inHouseIMConversationManagerImpl$getConversationUnreadCount$1.L$3;
                    baseDaoAYXKKw = (BaseDao) inHouseIMConversationManagerImpl$getConversationUnreadCount$1.L$2;
                    str4 = (java.lang.String) inHouseIMConversationManagerImpl$getConversationUnreadCount$1.L$1;
                    sgk2 = (sGK) inHouseIMConversationManagerImpl$getConversationUnreadCount$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        longRef4 = longRef2;
                        i5 = i3;
                        baseDao2 = baseDaoAYXKKw;
                        i6 = i;
                        t = obj;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        str3 = str4;
                        sQLiteDatabaseLockedException2 = e3;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        sgk3 = sgk2;
                        objectRef3 = objectRef2;
                        int i9 = i3;
                        longRef4 = longRef2;
                        i5 = i9;
                        int i10 = i;
                        baseDao2 = baseDaoAYXKKw;
                        i6 = i10;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        inHouseIMConversationManagerImpl$getConversationUnreadCount$12 = inHouseIMConversationManagerImpl$getConversationUnreadCount$1;
                        i2 = i + i;
                        sgk = sgk3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    } catch (java.lang.IllegalStateException e4) {
                        e2 = e4;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e5) {
                        e = e5;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        C44159sFm.EZpvd(baseDaoAYXKKw, longRef2.element);
                        throw th;
                    }
                    objectRef5.element = t;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef4.element;
                    C44159sFm.EZpvd(baseDao2, longRef4.element);
                    java.lang.Integer num = (java.lang.Integer) t2;
                    return C56443yFo.AEQbTJ(num == null ? num.intValue() : 0);
                }
                if (i8 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i11 = inHouseIMConversationManagerImpl$getConversationUnreadCount$1.I$1;
                int i12 = inHouseIMConversationManagerImpl$getConversationUnreadCount$1.I$0;
                Ref.ObjectRef objectRef6 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getConversationUnreadCount$1.L$4;
                longRef4 = (Ref.LongRef) inHouseIMConversationManagerImpl$getConversationUnreadCount$1.L$3;
                BaseDao baseDao3 = (BaseDao) inHouseIMConversationManagerImpl$getConversationUnreadCount$1.L$2;
                java.lang.String str5 = (java.lang.String) inHouseIMConversationManagerImpl$getConversationUnreadCount$1.L$1;
                sgk3 = (sGK) inHouseIMConversationManagerImpl$getConversationUnreadCount$1.L$0;
                C56391yDq.AEQbTJ(obj);
                InHouseIMConversationManagerImpl$getConversationUnreadCount$1 inHouseIMConversationManagerImpl$getConversationUnreadCount$13 = inHouseIMConversationManagerImpl$getConversationUnreadCount$1;
                objectRef = objectRef6;
                baseDaoAYXKKw = baseDao3;
                str2 = str5;
                int i13 = 1;
                i = i12;
                inHouseIMConversationManagerImpl$getConversationUnreadCount$12 = inHouseIMConversationManagerImpl$getConversationUnreadCount$13;
                i2 = i11 + i13;
                sgk = sgk3;
                longRef3 = longRef4;
                if (i2 >= i) {
                    try {
                        try {
                        } catch (java.lang.IllegalStateException e6) {
                            e2 = e6;
                            longRef2 = longRef3;
                            message = e2.getMessage();
                            if (message == null) {
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e7) {
                            e = e7;
                            longRef2 = longRef3;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            longRef2 = longRef3;
                            C44159sFm.EZpvd(baseDaoAYXKKw, longRef2.element);
                            throw th;
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                        str3 = str2;
                        inHouseIMConversationManagerImpl$getConversationUnreadCount$1 = inHouseIMConversationManagerImpl$getConversationUnreadCount$12;
                        sgk2 = sgk;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException = e8;
                        sgk3 = sgk2;
                        objectRef3 = objectRef2;
                        int i92 = i3;
                        longRef4 = longRef2;
                        i5 = i92;
                        int i102 = i;
                        baseDao2 = baseDaoAYXKKw;
                        i6 = i102;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                            inHouseIMConversationManagerImpl$getConversationUnreadCount$1.L$0 = sgk3;
                            inHouseIMConversationManagerImpl$getConversationUnreadCount$1.L$1 = str3;
                            inHouseIMConversationManagerImpl$getConversationUnreadCount$1.L$2 = baseDao2;
                            inHouseIMConversationManagerImpl$getConversationUnreadCount$1.L$3 = longRef4;
                            inHouseIMConversationManagerImpl$getConversationUnreadCount$1.L$4 = objectRef3;
                            inHouseIMConversationManagerImpl$getConversationUnreadCount$1.L$5 = null;
                            inHouseIMConversationManagerImpl$getConversationUnreadCount$1.L$6 = null;
                            inHouseIMConversationManagerImpl$getConversationUnreadCount$1.L$7 = null;
                            inHouseIMConversationManagerImpl$getConversationUnreadCount$1.I$0 = i6;
                            inHouseIMConversationManagerImpl$getConversationUnreadCount$1.I$1 = i5;
                            inHouseIMConversationManagerImpl$getConversationUnreadCount$1.label = 2;
                            if (DelayKt.delay(((long) (i4 + 1)) * 50, inHouseIMConversationManagerImpl$getConversationUnreadCount$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            inHouseIMConversationManagerImpl$getConversationUnreadCount$13 = inHouseIMConversationManagerImpl$getConversationUnreadCount$1;
                            i11 = i5;
                            str2 = str3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao4 = baseDao2;
                            i = i6;
                            baseDaoAYXKKw = baseDao4;
                        } else {
                            inHouseIMConversationManagerImpl$getConversationUnreadCount$13 = inHouseIMConversationManagerImpl$getConversationUnreadCount$1;
                            i11 = i5;
                            str2 = str3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao5 = baseDao2;
                            i = i6;
                            baseDaoAYXKKw = baseDao5;
                        }
                        inHouseIMConversationManagerImpl$getConversationUnreadCount$12 = inHouseIMConversationManagerImpl$getConversationUnreadCount$13;
                        i2 = i11 + i13;
                        sgk = sgk3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        str3 = str2;
                        inHouseIMConversationManagerImpl$getConversationUnreadCount$1 = inHouseIMConversationManagerImpl$getConversationUnreadCount$12;
                        sgk2 = sgk;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException2 = e9;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        sgk3 = sgk2;
                        objectRef3 = objectRef2;
                        int i922 = i3;
                        longRef4 = longRef2;
                        i5 = i922;
                        int i1022 = i;
                        baseDao2 = baseDaoAYXKKw;
                        i6 = i1022;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        inHouseIMConversationManagerImpl$getConversationUnreadCount$12 = inHouseIMConversationManagerImpl$getConversationUnreadCount$13;
                        i2 = i11 + i13;
                        sgk = sgk3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    objectRef5 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    InHouseIMConversationDao inHouseIMConversationDaoAYXKKw = sgk.AYXKKw();
                    inHouseIMConversationManagerImpl$getConversationUnreadCount$12.L$0 = sgk;
                    inHouseIMConversationManagerImpl$getConversationUnreadCount$12.L$1 = str2;
                    inHouseIMConversationManagerImpl$getConversationUnreadCount$12.L$2 = baseDaoAYXKKw;
                    inHouseIMConversationManagerImpl$getConversationUnreadCount$12.L$3 = longRef3;
                    inHouseIMConversationManagerImpl$getConversationUnreadCount$12.L$4 = objectRef;
                    inHouseIMConversationManagerImpl$getConversationUnreadCount$12.L$5 = objectRef5;
                    inHouseIMConversationManagerImpl$getConversationUnreadCount$12.L$6 = longRef3;
                    inHouseIMConversationManagerImpl$getConversationUnreadCount$12.L$7 = objectRef5;
                    inHouseIMConversationManagerImpl$getConversationUnreadCount$12.I$0 = i;
                    inHouseIMConversationManagerImpl$getConversationUnreadCount$12.I$1 = i2;
                    inHouseIMConversationManagerImpl$getConversationUnreadCount$12.I$2 = i2;
                    inHouseIMConversationManagerImpl$getConversationUnreadCount$12.J$0 = jNanoTime;
                    inHouseIMConversationManagerImpl$getConversationUnreadCount$12.label = 1;
                    java.lang.Object conversationUnreadCount = inHouseIMConversationDaoAYXKKw.getConversationUnreadCount(str2, inHouseIMConversationManagerImpl$getConversationUnreadCount$12);
                    if (conversationUnreadCount == objCopydefault) {
                        return objCopydefault;
                    }
                    str4 = str2;
                    inHouseIMConversationManagerImpl$getConversationUnreadCount$1 = inHouseIMConversationManagerImpl$getConversationUnreadCount$12;
                    sgk2 = sgk;
                    i4 = i2;
                    objectRef4 = objectRef5;
                    longRef4 = longRef3;
                    objectRef2 = objectRef;
                    i5 = i4;
                    int i14 = i;
                    baseDao2 = baseDaoAYXKKw;
                    i6 = i14;
                    t = conversationUnreadCount;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                        sgk3 = sgk2;
                        objectRef3 = objectRef2;
                        str3 = str4;
                        r0 = e10;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        inHouseIMConversationManagerImpl$getConversationUnreadCount$12 = inHouseIMConversationManagerImpl$getConversationUnreadCount$13;
                        i2 = i11 + i13;
                        sgk = sgk3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    } catch (java.lang.IllegalStateException e11) {
                        e2 = e11;
                        message = e2.getMessage();
                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                            C44159sFm.OLrzqt(e2);
                            throw e2;
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e12) {
                        e = e12;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    }
                    objectRef5.element = t;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t22 = objectRef4.element;
                    C44159sFm.EZpvd(baseDao2, longRef4.element);
                    java.lang.Integer num2 = (java.lang.Integer) t22;
                    return C56443yFo.AEQbTJ(num2 == null ? num2.intValue() : 0);
                }
                C44159sFm.EZpvd(baseDaoAYXKKw, longRef3.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            baseDaoAYXKKw = AYXKKw();
            longRef3 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 3;
            i2 = 0;
            sgk = this;
            inHouseIMConversationManagerImpl$getConversationUnreadCount$12 = inHouseIMConversationManagerImpl$getConversationUnreadCount$1;
            str2 = str;
            if (i2 >= i) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            longRef2 = longRef;
            baseDaoAYXKKw = baseDao;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.sGI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.List<InHouseIMServerConversationEntity>> continuation) throws java.lang.Throwable {
        InHouseIMConversationManagerImpl$getAndSaveConversationsFromRemote$1 inHouseIMConversationManagerImpl$getAndSaveConversationsFromRemote$1;
        java.util.List<java.lang.String> list2;
        java.lang.Throwable th;
        java.lang.Object objM7377constructorimpl;
        java.lang.Object obj;
        sGK sgk;
        if (continuation instanceof InHouseIMConversationManagerImpl$getAndSaveConversationsFromRemote$1) {
            inHouseIMConversationManagerImpl$getAndSaveConversationsFromRemote$1 = (InHouseIMConversationManagerImpl$getAndSaveConversationsFromRemote$1) continuation;
            int i = inHouseIMConversationManagerImpl$getAndSaveConversationsFromRemote$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMConversationManagerImpl$getAndSaveConversationsFromRemote$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMConversationManagerImpl$getAndSaveConversationsFromRemote$1 = new InHouseIMConversationManagerImpl$getAndSaveConversationsFromRemote$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = inHouseIMConversationManagerImpl$getAndSaveConversationsFromRemote$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMConversationManagerImpl$getAndSaveConversationsFromRemote$1.label;
        try {
        } catch (java.lang.Throwable th2) {
            list2 = list;
            th = th2;
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            Result.Application application = Result.Companion;
            C44124sEe.imLogConversation$default("InHouseIMConversationManagerImpl => getAndSaveConversationsFromRemote start, size=" + list.size() + ", firstId:" + CollectionsKt___CollectionsKt.firstOrNull(list), null, 2, null);
            inHouseIMConversationManagerImpl$getAndSaveConversationsFromRemote$1.L$0 = list;
            inHouseIMConversationManagerImpl$getAndSaveConversationsFromRemote$1.L$1 = this;
            inHouseIMConversationManagerImpl$getAndSaveConversationsFromRemote$1.label = 1;
            java.lang.Object objKWHzl = KWHzl(list, inHouseIMConversationManagerImpl$getAndSaveConversationsFromRemote$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            obj = objKWHzl;
            sgk = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (java.util.List) inHouseIMConversationManagerImpl$getAndSaveConversationsFromRemote$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                C44124sEe.imLogConversation$default("InHouseIMConversationManagerImpl => getAndSaveConversationsFromRemote completed, request size=" + list.size() + ", firstId:" + CollectionsKt___CollectionsKt.firstOrNull(list), null, 2, null);
                objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) objEZpvd);
                if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                    C44124sEe.imLogConversation$default("InHouseIMConversationManagerImpl => getAndSaveConversationsFromRemote failed, request size=" + list.size() + ", firstId:" + CollectionsKt___CollectionsKt.firstOrNull(list), null, 2, null);
                }
                C56391yDq.AEQbTJ(objM7377constructorimpl);
                return objM7377constructorimpl;
            }
            sGK sgk2 = (sGK) inHouseIMConversationManagerImpl$getAndSaveConversationsFromRemote$1.L$1;
            list2 = (java.util.List) inHouseIMConversationManagerImpl$getAndSaveConversationsFromRemote$1.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
                sgk = sgk2;
                list = list2;
                obj = objEZpvd;
            } catch (java.lang.Throwable th3) {
                th = th3;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                list = list2;
            }
        }
        inHouseIMConversationManagerImpl$getAndSaveConversationsFromRemote$1.L$0 = list;
        inHouseIMConversationManagerImpl$getAndSaveConversationsFromRemote$1.L$1 = null;
        inHouseIMConversationManagerImpl$getAndSaveConversationsFromRemote$1.label = 2;
        objEZpvd = sgk.EZpvd((java.util.List<InHouseIMServerConversationResponse>) obj, inHouseIMConversationManagerImpl$getAndSaveConversationsFromRemote$1);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        C44124sEe.imLogConversation$default("InHouseIMConversationManagerImpl => getAndSaveConversationsFromRemote completed, request size=" + list.size() + ", firstId:" + CollectionsKt___CollectionsKt.firstOrNull(list), null, 2, null);
        objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) objEZpvd);
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
        }
        C56391yDq.AEQbTJ(objM7377constructorimpl);
        return objM7377constructorimpl;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:42:0x00cc */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:50:0x0024 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [long] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.okinc.okimcore.feature.conversation.manager.InHouseIMConversationManagerImpl$getConversationsFromRemote$1, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [long] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r11v10, types: [com.okinc.okimcore.feature.conversation.repository.remote.inhouseim.InHouseIMConversationService] */
    /* JADX WARN: Type inference failed for: r11v9, types: [com.okinc.okimcore.feature.conversation.repository.remote.inhouseim.InHouseIMConversationService] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3, types: [long] */
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
    public final java.lang.Object KWHzl(java.util.List<java.lang.String> list, Continuation<? super java.util.List<InHouseIMServerConversationResponse>> continuation) throws java.lang.Throwable {
        ?? inHouseIMConversationManagerImpl$getConversationsFromRemote$1;
        ?? CurrentTimeMillis;
        java.lang.Object objM7377constructorimpl;
        ?? r0;
        ?? r02;
        ?? r03;
        ResponseData responseData;
        if (continuation instanceof InHouseIMConversationManagerImpl$getConversationsFromRemote$1) {
            InHouseIMConversationManagerImpl$getConversationsFromRemote$1 inHouseIMConversationManagerImpl$getConversationsFromRemote$12 = (InHouseIMConversationManagerImpl$getConversationsFromRemote$1) continuation;
            int i = inHouseIMConversationManagerImpl$getConversationsFromRemote$12.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMConversationManagerImpl$getConversationsFromRemote$12.label = i - Integer.MIN_VALUE;
                inHouseIMConversationManagerImpl$getConversationsFromRemote$1 = inHouseIMConversationManagerImpl$getConversationsFromRemote$12;
            } else {
                inHouseIMConversationManagerImpl$getConversationsFromRemote$1 = new InHouseIMConversationManagerImpl$getConversationsFromRemote$1(this, continuation);
            }
        }
        java.lang.Object conversationsById = inHouseIMConversationManagerImpl$getConversationsFromRemote$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMConversationManagerImpl$getConversationsFromRemote$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(conversationsById);
                CurrentTimeMillis = java.lang.System.currentTimeMillis();
                try {
                    Result.Application application = Result.Companion;
                    ConversationListRequest conversationListRequest = new ConversationListRequest(list);
                    if (!C44157sFk.gEmmrt().values()) {
                        ?? r11 = this.EZpvd;
                        java.lang.String strAEQbTJ = sFM.copydefault.AEQbTJ();
                        inHouseIMConversationManagerImpl$getConversationsFromRemote$1.J$0 = CurrentTimeMillis;
                        inHouseIMConversationManagerImpl$getConversationsFromRemote$1.label = 1;
                        conversationsById = r11.getConversationsByIdNonLogin(conversationListRequest, strAEQbTJ, inHouseIMConversationManagerImpl$getConversationsFromRemote$1);
                        if (conversationsById == objCopydefault) {
                            return objCopydefault;
                        }
                        r03 = CurrentTimeMillis;
                        responseData = (ResponseData) conversationsById;
                        inHouseIMConversationManagerImpl$getConversationsFromRemote$1 = r03;
                    } else {
                        ?? r112 = this.EZpvd;
                        inHouseIMConversationManagerImpl$getConversationsFromRemote$1.J$0 = CurrentTimeMillis;
                        inHouseIMConversationManagerImpl$getConversationsFromRemote$1.label = 2;
                        conversationsById = r112.getConversationsById(conversationListRequest, inHouseIMConversationManagerImpl$getConversationsFromRemote$1);
                        if (conversationsById == objCopydefault) {
                            return objCopydefault;
                        }
                        r02 = CurrentTimeMillis;
                        responseData = (ResponseData) conversationsById;
                        inHouseIMConversationManagerImpl$getConversationsFromRemote$1 = r02;
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    r0 = CurrentTimeMillis;
                }
            } else if (i2 == 1) {
                long j = inHouseIMConversationManagerImpl$getConversationsFromRemote$1.J$0;
                C56391yDq.AEQbTJ(conversationsById);
                r03 = j;
                responseData = (ResponseData) conversationsById;
                inHouseIMConversationManagerImpl$getConversationsFromRemote$1 = r03;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j2 = inHouseIMConversationManagerImpl$getConversationsFromRemote$1.J$0;
                C56391yDq.AEQbTJ(conversationsById);
                r02 = j2;
                responseData = (ResponseData) conversationsById;
                inHouseIMConversationManagerImpl$getConversationsFromRemote$1 = r02;
            }
            java.util.List listAhwBna = (java.util.List) responseData.getData();
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            sEF sef = sEF.OLrzqt;
            EventData eventDataAEQbTJ = sef.AEQbTJ();
            eventDataAEQbTJ.setMsg("[In-House] Get conversation list from remote: Success");
            eventDataAEQbTJ.setAttrs(C56424yEw.gEmmrt(C56390yDp.OLrzqt("isAppDebuggable", java.lang.String.valueOf(listAhwBna.size())), C56390yDp.OLrzqt("totalTime", java.lang.String.valueOf(jCurrentTimeMillis - inHouseIMConversationManagerImpl$getConversationsFromRemote$1))));
            sef.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ);
            objM7377constructorimpl = Result.m7377constructorimpl(listAhwBna);
            r0 = inHouseIMConversationManagerImpl$getConversationsFromRemote$1;
        } catch (java.lang.Throwable th2) {
            th = th2;
            CurrentTimeMillis = inHouseIMConversationManagerImpl$getConversationsFromRemote$1;
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
            sEF sef2 = sEF.OLrzqt;
            EventData eventDataAEQbTJ2 = sef2.AEQbTJ();
            eventDataAEQbTJ2.setMsg("[In-House] Get conversation list from remote: Fail");
            eventDataAEQbTJ2.setAttrs(C56424yEw.gEmmrt(C56390yDp.OLrzqt("totalTime", java.lang.String.valueOf(jCurrentTimeMillis2 - r0)), C56390yDp.OLrzqt("path", java.lang.String.valueOf(thM7380exceptionOrNullimpl.getMessage()))));
            sef2.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ2);
        }
        C56391yDq.AEQbTJ(objM7377constructorimpl);
        return objM7377constructorimpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.util.List<InHouseIMServerConversationResponse> list, Continuation<? super java.util.List<InHouseIMServerConversationEntity>> continuation) throws java.lang.Throwable {
        InHouseIMConversationManagerImpl$saveRemoteConversationsToDb$1 inHouseIMConversationManagerImpl$saveRemoteConversationsToDb$1;
        java.util.List list2;
        long j;
        if (continuation instanceof InHouseIMConversationManagerImpl$saveRemoteConversationsToDb$1) {
            inHouseIMConversationManagerImpl$saveRemoteConversationsToDb$1 = (InHouseIMConversationManagerImpl$saveRemoteConversationsToDb$1) continuation;
            int i = inHouseIMConversationManagerImpl$saveRemoteConversationsToDb$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMConversationManagerImpl$saveRemoteConversationsToDb$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMConversationManagerImpl$saveRemoteConversationsToDb$1 = new InHouseIMConversationManagerImpl$saveRemoteConversationsToDb$1(this, continuation);
            }
        }
        java.lang.Object obj = inHouseIMConversationManagerImpl$saveRemoteConversationsToDb$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMConversationManagerImpl$saveRemoteConversationsToDb$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(sQR.AEQbTJ((InHouseIMServerConversationResponse) it.next()));
            }
            InHouseIMConversationDao inHouseIMConversationDaoAYXKKw = AYXKKw();
            inHouseIMConversationManagerImpl$saveRemoteConversationsToDb$1.L$0 = arrayList;
            inHouseIMConversationManagerImpl$saveRemoteConversationsToDb$1.J$0 = jCurrentTimeMillis;
            inHouseIMConversationManagerImpl$saveRemoteConversationsToDb$1.label = 1;
            if (inHouseIMConversationDaoAYXKKw.insertOrReplaceList(arrayList, inHouseIMConversationManagerImpl$saveRemoteConversationsToDb$1) == objCopydefault) {
                return objCopydefault;
            }
            list2 = arrayList;
            j = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = inHouseIMConversationManagerImpl$saveRemoteConversationsToDb$1.J$0;
            list2 = (java.util.List) inHouseIMConversationManagerImpl$saveRemoteConversationsToDb$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        C43296rmc.AEQbTJ("sync conversations", "saveRemoteConversationsToDb execution time:" + (java.lang.System.currentTimeMillis() - j) + com.ibm.icu.text.DateFormat.MINUTE_SECOND);
        return list2;
    }

    /* JADX DEBUG: Duplicate block (B:76:0x01a2) to fix multi-entry loop: BACK_EDGE: B:76:0x01a2 -> B:77:0x01ac */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v30, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v43, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v44, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x01b3: MOVE (r6 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:78:0x01b3 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01b4: MOVE (r7 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:78:0x01b3 */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0145 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0046, B:38:0x00fe, B:54:0x0137, B:55:0x013a, B:59:0x013f, B:61:0x0145, B:63:0x0151, B:64:0x0154, B:65:0x0155, B:66:0x0158, B:70:0x016e, B:72:0x017b), top: B:88:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017b A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0046, B:38:0x00fe, B:54:0x0137, B:55:0x013a, B:59:0x013f, B:61:0x0145, B:63:0x0151, B:64:0x0154, B:65:0x0155, B:66:0x0158, B:70:0x016e, B:72:0x017b), top: B:88:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.List<InHouseIMConversationEntity>> continuation) throws java.lang.Exception {
        InHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1 inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDaoAYXKKw;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        sGK sgk;
        InHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1 inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$12;
        java.util.List<java.lang.String> list2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        int i3;
        java.util.List<java.lang.String> list3;
        Ref.ObjectRef objectRef2;
        int i4;
        sGK sgk2;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        sGK sgk3;
        Ref.ObjectRef objectRef3;
        Ref.LongRef longRef4;
        int i5;
        BaseDao baseDao2;
        int i6;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException2;
        java.lang.String message;
        ?? r0;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        long jNanoTime;
        java.util.List<java.lang.String> list4;
        T t;
        if (continuation instanceof InHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1) {
            inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1 = (InHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1) continuation;
            int i7 = inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.label = i7 - Integer.MIN_VALUE;
            } else {
                inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1 = new InHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1(this, continuation);
            }
        }
        java.lang.Object obj = inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    jNanoTime = inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.J$0;
                    i4 = inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.I$2;
                    i3 = inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.I$1;
                    i = inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.I$0;
                    objectRef5 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.L$7;
                    longRef3 = (Ref.LongRef) inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.L$6;
                    objectRef4 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.L$5;
                    objectRef2 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.L$4;
                    longRef2 = (Ref.LongRef) inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.L$3;
                    baseDaoAYXKKw = (BaseDao) inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.L$2;
                    list4 = (java.util.List) inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.L$1;
                    sgk2 = (sGK) inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        longRef4 = longRef2;
                        i5 = i3;
                        baseDao2 = baseDaoAYXKKw;
                        i6 = i;
                        t = obj;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        list3 = list4;
                        sQLiteDatabaseLockedException2 = e3;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        sgk3 = sgk2;
                        objectRef3 = objectRef2;
                        int i9 = i3;
                        longRef4 = longRef2;
                        i5 = i9;
                        int i10 = i;
                        baseDao2 = baseDaoAYXKKw;
                        i6 = i10;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$12 = inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1;
                        i2 = i + i;
                        sgk = sgk3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    } catch (java.lang.IllegalStateException e4) {
                        e2 = e4;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e5) {
                        e = e5;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        C44159sFm.EZpvd(baseDaoAYXKKw, longRef2.element);
                        throw th;
                    }
                    objectRef5.element = t;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef4.element;
                    C44159sFm.EZpvd(baseDao2, longRef4.element);
                    return t2;
                }
                if (i8 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i11 = inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.I$1;
                int i12 = inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.I$0;
                Ref.ObjectRef objectRef6 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.L$4;
                longRef4 = (Ref.LongRef) inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.L$3;
                BaseDao baseDao3 = (BaseDao) inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.L$2;
                java.util.List<java.lang.String> list5 = (java.util.List) inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.L$1;
                sgk3 = (sGK) inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.L$0;
                C56391yDq.AEQbTJ(obj);
                InHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1 inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$13 = inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1;
                int i13 = 1;
                baseDaoAYXKKw = baseDao3;
                list2 = list5;
                i = i12;
                objectRef = objectRef6;
                inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$12 = inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$13;
                i2 = i11 + i13;
                sgk = sgk3;
                longRef3 = longRef4;
                if (i2 >= i) {
                    try {
                        try {
                        } catch (java.lang.IllegalStateException e6) {
                            e2 = e6;
                            longRef2 = longRef3;
                            message = e2.getMessage();
                            if (message == null) {
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e7) {
                            e = e7;
                            longRef2 = longRef3;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            longRef2 = longRef3;
                            C44159sFm.EZpvd(baseDaoAYXKKw, longRef2.element);
                            throw th;
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                        list3 = list2;
                        inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1 = inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$12;
                        sgk2 = sgk;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException = e8;
                        sgk3 = sgk2;
                        objectRef3 = objectRef2;
                        int i92 = i3;
                        longRef4 = longRef2;
                        i5 = i92;
                        int i102 = i;
                        baseDao2 = baseDaoAYXKKw;
                        i6 = i102;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                            inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.L$0 = sgk3;
                            inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.L$1 = list3;
                            inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.L$2 = baseDao2;
                            inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.L$3 = longRef4;
                            inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.L$4 = objectRef3;
                            inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.L$5 = null;
                            inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.L$6 = null;
                            inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.L$7 = null;
                            inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.I$0 = i6;
                            inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.I$1 = i5;
                            inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1.label = 2;
                            if (DelayKt.delay(((long) (i4 + 1)) * 50, inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$13 = inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1;
                            i11 = i5;
                            list2 = list3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao4 = baseDao2;
                            i = i6;
                            baseDaoAYXKKw = baseDao4;
                        } else {
                            inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$13 = inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1;
                            i11 = i5;
                            list2 = list3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao5 = baseDao2;
                            i = i6;
                            baseDaoAYXKKw = baseDao5;
                        }
                        inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$12 = inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$13;
                        i2 = i11 + i13;
                        sgk = sgk3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        list3 = list2;
                        inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1 = inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$12;
                        sgk2 = sgk;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException2 = e9;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        sgk3 = sgk2;
                        objectRef3 = objectRef2;
                        int i922 = i3;
                        longRef4 = longRef2;
                        i5 = i922;
                        int i1022 = i;
                        baseDao2 = baseDaoAYXKKw;
                        i6 = i1022;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$12 = inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$13;
                        i2 = i11 + i13;
                        sgk = sgk3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    objectRef5 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    InHouseIMConversationDao inHouseIMConversationDaoAYXKKw = sgk.AYXKKw();
                    inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$12.L$0 = sgk;
                    inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$12.L$1 = list2;
                    inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$12.L$2 = baseDaoAYXKKw;
                    inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$12.L$3 = longRef3;
                    inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$12.L$4 = objectRef;
                    inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$12.L$5 = objectRef5;
                    inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$12.L$6 = longRef3;
                    inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$12.L$7 = objectRef5;
                    inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$12.I$0 = i;
                    inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$12.I$1 = i2;
                    inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$12.I$2 = i2;
                    inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$12.J$0 = jNanoTime;
                    inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$12.label = 1;
                    java.lang.Object multipleConversationEntity = inHouseIMConversationDaoAYXKKw.getMultipleConversationEntity(list2, inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$12);
                    if (multipleConversationEntity == objCopydefault) {
                        return objCopydefault;
                    }
                    list4 = list2;
                    inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1 = inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$12;
                    sgk2 = sgk;
                    i4 = i2;
                    objectRef4 = objectRef5;
                    longRef4 = longRef3;
                    objectRef2 = objectRef;
                    i5 = i4;
                    int i14 = i;
                    baseDao2 = baseDaoAYXKKw;
                    i6 = i14;
                    t = multipleConversationEntity;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                        sgk3 = sgk2;
                        objectRef3 = objectRef2;
                        list3 = list4;
                        r0 = e10;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$12 = inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$13;
                        i2 = i11 + i13;
                        sgk = sgk3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    } catch (java.lang.IllegalStateException e11) {
                        e2 = e11;
                        message = e2.getMessage();
                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                            C44159sFm.OLrzqt(e2);
                            throw e2;
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e12) {
                        e = e12;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    }
                    objectRef5.element = t;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t22 = objectRef4.element;
                    C44159sFm.EZpvd(baseDao2, longRef4.element);
                    return t22;
                }
                C44159sFm.EZpvd(baseDaoAYXKKw, longRef3.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            baseDaoAYXKKw = AYXKKw();
            longRef3 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 3;
            i2 = 0;
            sgk = this;
            inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$12 = inHouseIMConversationManagerImpl$getMultipleConversationsFromLocal$1;
            list2 = list;
            if (i2 >= i) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            longRef2 = longRef;
            baseDaoAYXKKw = baseDao;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.sGI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        InHouseIMConversationManagerImpl$getContactIdByChannelId$1 inHouseIMConversationManagerImpl$getContactIdByChannelId$1;
        if (continuation instanceof InHouseIMConversationManagerImpl$getContactIdByChannelId$1) {
            inHouseIMConversationManagerImpl$getContactIdByChannelId$1 = (InHouseIMConversationManagerImpl$getContactIdByChannelId$1) continuation;
            int i = inHouseIMConversationManagerImpl$getContactIdByChannelId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMConversationManagerImpl$getContactIdByChannelId$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMConversationManagerImpl$getContactIdByChannelId$1 = new InHouseIMConversationManagerImpl$getContactIdByChannelId$1(this, continuation);
            }
        }
        InHouseIMConversationManagerImpl$getContactIdByChannelId$1 inHouseIMConversationManagerImpl$getContactIdByChannelId$12 = inHouseIMConversationManagerImpl$getContactIdByChannelId$1;
        java.lang.Object andSaveSingleConversation$default = inHouseIMConversationManagerImpl$getContactIdByChannelId$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMConversationManagerImpl$getContactIdByChannelId$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(andSaveSingleConversation$default);
            inHouseIMConversationManagerImpl$getContactIdByChannelId$12.label = 1;
            andSaveSingleConversation$default = sGI.TaskDescription.getAndSaveSingleConversation$default(this, str, false, inHouseIMConversationManagerImpl$getContactIdByChannelId$12, 2, null);
            if (andSaveSingleConversation$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(andSaveSingleConversation$default);
        }
        InHouseIMConversationListData inHouseIMConversationListData = (InHouseIMConversationListData) andSaveSingleConversation$default;
        if (inHouseIMConversationListData != null) {
            return inHouseIMConversationListData.getRelatedId();
        }
        return null;
    }

    /* JADX DEBUG: Duplicate block (B:76:0x01a2) to fix multi-entry loop: BACK_EDGE: B:76:0x01a2 -> B:77:0x01ac */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v30, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v43, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v44, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x01b3: MOVE (r6 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:78:0x01b3 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01b4: MOVE (r7 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:78:0x01b3 */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0145 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0046, B:38:0x00fe, B:54:0x0137, B:55:0x013a, B:59:0x013f, B:61:0x0145, B:63:0x0151, B:64:0x0154, B:65:0x0155, B:66:0x0158, B:70:0x016e, B:72:0x017b), top: B:88:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017b A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0046, B:38:0x00fe, B:54:0x0137, B:55:0x013a, B:59:0x013f, B:61:0x0145, B:63:0x0151, B:64:0x0154, B:65:0x0155, B:66:0x0158, B:70:0x016e, B:72:0x017b), top: B:88:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    @Override // o.sGI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super InHouseIMConversationListData> continuation) throws java.lang.Exception {
        InHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1 inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDaoAYXKKw;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        sGK sgk;
        InHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1 inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$12;
        java.lang.String str2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        int i3;
        java.lang.String str3;
        Ref.ObjectRef objectRef2;
        int i4;
        sGK sgk2;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        sGK sgk3;
        Ref.ObjectRef objectRef3;
        Ref.LongRef longRef4;
        int i5;
        BaseDao baseDao2;
        int i6;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException2;
        java.lang.String message;
        ?? r0;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        long jNanoTime;
        java.lang.String str4;
        T t;
        if (continuation instanceof InHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1) {
            inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1 = (InHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1) continuation;
            int i7 = inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.label = i7 - Integer.MIN_VALUE;
            } else {
                inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1 = new InHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1(this, continuation);
            }
        }
        java.lang.Object obj = inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    jNanoTime = inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.J$0;
                    i4 = inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.I$2;
                    i3 = inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.I$1;
                    i = inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.I$0;
                    objectRef5 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.L$7;
                    longRef3 = (Ref.LongRef) inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.L$6;
                    objectRef4 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.L$5;
                    objectRef2 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.L$4;
                    longRef2 = (Ref.LongRef) inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.L$3;
                    baseDaoAYXKKw = (BaseDao) inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.L$2;
                    str4 = (java.lang.String) inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.L$1;
                    sgk2 = (sGK) inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        longRef4 = longRef2;
                        i5 = i3;
                        baseDao2 = baseDaoAYXKKw;
                        i6 = i;
                        t = obj;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        str3 = str4;
                        sQLiteDatabaseLockedException2 = e3;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        sgk3 = sgk2;
                        objectRef3 = objectRef2;
                        int i9 = i3;
                        longRef4 = longRef2;
                        i5 = i9;
                        int i10 = i;
                        baseDao2 = baseDaoAYXKKw;
                        i6 = i10;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$12 = inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1;
                        i2 = i + i;
                        sgk = sgk3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    } catch (java.lang.IllegalStateException e4) {
                        e2 = e4;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e5) {
                        e = e5;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        C44159sFm.EZpvd(baseDaoAYXKKw, longRef2.element);
                        throw th;
                    }
                    objectRef5.element = t;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef4.element;
                    C44159sFm.EZpvd(baseDao2, longRef4.element);
                    return t2;
                }
                if (i8 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i11 = inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.I$1;
                int i12 = inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.I$0;
                Ref.ObjectRef objectRef6 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.L$4;
                longRef4 = (Ref.LongRef) inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.L$3;
                BaseDao baseDao3 = (BaseDao) inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.L$2;
                java.lang.String str5 = (java.lang.String) inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.L$1;
                sgk3 = (sGK) inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.L$0;
                C56391yDq.AEQbTJ(obj);
                InHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1 inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$13 = inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1;
                int i13 = 1;
                baseDaoAYXKKw = baseDao3;
                str2 = str5;
                i = i12;
                objectRef = objectRef6;
                inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$12 = inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$13;
                i2 = i11 + i13;
                sgk = sgk3;
                longRef3 = longRef4;
                if (i2 >= i) {
                    try {
                        try {
                        } catch (java.lang.IllegalStateException e6) {
                            e2 = e6;
                            longRef2 = longRef3;
                            message = e2.getMessage();
                            if (message == null) {
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e7) {
                            e = e7;
                            longRef2 = longRef3;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            longRef2 = longRef3;
                            C44159sFm.EZpvd(baseDaoAYXKKw, longRef2.element);
                            throw th;
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                        str3 = str2;
                        inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1 = inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$12;
                        sgk2 = sgk;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException = e8;
                        sgk3 = sgk2;
                        objectRef3 = objectRef2;
                        int i92 = i3;
                        longRef4 = longRef2;
                        i5 = i92;
                        int i102 = i;
                        baseDao2 = baseDaoAYXKKw;
                        i6 = i102;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                            inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.L$0 = sgk3;
                            inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.L$1 = str3;
                            inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.L$2 = baseDao2;
                            inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.L$3 = longRef4;
                            inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.L$4 = objectRef3;
                            inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.L$5 = null;
                            inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.L$6 = null;
                            inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.L$7 = null;
                            inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.I$0 = i6;
                            inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.I$1 = i5;
                            inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1.label = 2;
                            if (DelayKt.delay(((long) (i4 + 1)) * 50, inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$13 = inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1;
                            i11 = i5;
                            str2 = str3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao4 = baseDao2;
                            i = i6;
                            baseDaoAYXKKw = baseDao4;
                        } else {
                            inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$13 = inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1;
                            i11 = i5;
                            str2 = str3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao5 = baseDao2;
                            i = i6;
                            baseDaoAYXKKw = baseDao5;
                        }
                        inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$12 = inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$13;
                        i2 = i11 + i13;
                        sgk = sgk3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        str3 = str2;
                        inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1 = inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$12;
                        sgk2 = sgk;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException2 = e9;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        sgk3 = sgk2;
                        objectRef3 = objectRef2;
                        int i922 = i3;
                        longRef4 = longRef2;
                        i5 = i922;
                        int i1022 = i;
                        baseDao2 = baseDaoAYXKKw;
                        i6 = i1022;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$12 = inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$13;
                        i2 = i11 + i13;
                        sgk = sgk3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    objectRef5 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    InHouseIMConversationDao inHouseIMConversationDaoAYXKKw = sgk.AYXKKw();
                    inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$12.L$0 = sgk;
                    inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$12.L$1 = str2;
                    inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$12.L$2 = baseDaoAYXKKw;
                    inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$12.L$3 = longRef3;
                    inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$12.L$4 = objectRef;
                    inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$12.L$5 = objectRef5;
                    inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$12.L$6 = longRef3;
                    inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$12.L$7 = objectRef5;
                    inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$12.I$0 = i;
                    inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$12.I$1 = i2;
                    inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$12.I$2 = i2;
                    inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$12.J$0 = jNanoTime;
                    inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$12.label = 1;
                    java.lang.Object conversationByContactId = inHouseIMConversationDaoAYXKKw.getConversationByContactId(str2, inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$12);
                    if (conversationByContactId == objCopydefault) {
                        return objCopydefault;
                    }
                    str4 = str2;
                    inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1 = inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$12;
                    sgk2 = sgk;
                    i4 = i2;
                    objectRef4 = objectRef5;
                    longRef4 = longRef3;
                    objectRef2 = objectRef;
                    i5 = i4;
                    int i14 = i;
                    baseDao2 = baseDaoAYXKKw;
                    i6 = i14;
                    t = conversationByContactId;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                        sgk3 = sgk2;
                        objectRef3 = objectRef2;
                        str3 = str4;
                        r0 = e10;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$12 = inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$13;
                        i2 = i11 + i13;
                        sgk = sgk3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    } catch (java.lang.IllegalStateException e11) {
                        e2 = e11;
                        message = e2.getMessage();
                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                            C44159sFm.OLrzqt(e2);
                            throw e2;
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e12) {
                        e = e12;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    }
                    objectRef5.element = t;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t22 = objectRef4.element;
                    C44159sFm.EZpvd(baseDao2, longRef4.element);
                    return t22;
                }
                C44159sFm.EZpvd(baseDaoAYXKKw, longRef3.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            baseDaoAYXKKw = AYXKKw();
            longRef3 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 3;
            i2 = 0;
            sgk = this;
            inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$12 = inHouseIMConversationManagerImpl$getConversationByContactIdFromLocal$1;
            str2 = str;
            if (i2 >= i) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            longRef2 = longRef;
            baseDaoAYXKKw = baseDao;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [258=5] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019b A[LOOP:8: B:46:0x0195->B:48:0x019b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x020c A[LOOP:3: B:58:0x0206->B:60:0x020c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0236 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.sGI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull C44489sRs c44489sRs, @NotNull Continuation<? super java.util.List<InHouseIMConversationSimpleInfoEntity>> continuation) throws java.lang.Exception {
        InHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1 inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1;
        C44489sRs c44489sRs2;
        java.lang.Object objDjBIcL;
        sGK sgk;
        java.util.List list;
        java.util.List list2;
        java.util.Iterator it;
        java.util.Set<java.lang.String> setOqFWZa;
        java.lang.Object objGEmmrt;
        sGK sgk2;
        java.util.List list3;
        java.util.List list4;
        java.util.Iterator it2;
        java.util.List list5;
        java.util.List list6;
        java.lang.Object next;
        if (continuation instanceof InHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1) {
            inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1 = (InHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1) continuation;
            int i = inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1 = new InHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$0 = this;
            c44489sRs2 = c44489sRs;
            inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$1 = c44489sRs2;
            inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.label = 1;
            objDjBIcL = djBIcL(inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1);
            if (objDjBIcL == objCopydefault2) {
                return objCopydefault2;
            }
            sgk = this;
        } else if (i2 == 1) {
            C44489sRs c44489sRs3 = (C44489sRs) inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$1;
            sgk = (sGK) inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            objDjBIcL = objCopydefault;
            c44489sRs2 = c44489sRs3;
        } else if (i2 == 2) {
            list = (java.util.List) inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$1;
            sgk = (sGK) inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            list2 = list;
            java.util.List list7 = (java.util.List) objCopydefault;
            C44124sEe.imLogConversation$default("sync conversations => getConversationIdsNeededToBeSync => local list size:" + list2.size(), null, 2, null);
            for (java.util.List list8 : CollectionsKt___CollectionsKt.valueOf((java.lang.Iterable) list2, 500)) {
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list8, 10));
                java.util.Iterator it3 = list8.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((InHouseIMConversationSimpleInfoEntity) it3.next()).getChannelId());
                }
                pUU.KWHzl("InHouseIMConversationManagerImpl", "sync conversations => getConversationIdsNeededToBeSync => local list data:" + arrayList);
            }
            C44124sEe.imLogConversation$default("sync conversations => getConversationIdsNeededToBeSync => remote list size:" + list7.size(), null, 2, null);
            for (java.util.List list9 : CollectionsKt___CollectionsKt.valueOf((java.lang.Iterable) list7, 500)) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list9, 10));
                java.util.Iterator it4 = list9.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(((InHouseIMConversationSimpleInfoEntity) it4.next()).getChannelId());
                }
                pUU.KWHzl("InHouseIMConversationManagerImpl", "sync conversations => getConversationIdsNeededToBeSync => remote list data:" + arrayList2);
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(list7, 10));
            it = list7.iterator();
            while (it.hasNext()) {
                arrayList3.add(((InHouseIMConversationSimpleInfoEntity) it.next()).getChannelId());
            }
            setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList3);
            inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$0 = sgk;
            inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$1 = list2;
            inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$2 = list7;
            inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$3 = sgk;
            inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$4 = setOqFWZa;
            inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.label = 3;
            objGEmmrt = sgk.gEmmrt(inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1);
            if (objGEmmrt != objCopydefault2) {
                return objCopydefault2;
            }
            sgk2 = sgk;
            list3 = list7;
            objCopydefault = objGEmmrt;
            java.util.Set<java.lang.String> setOqFWZa2 = CollectionsKt___CollectionsKt.OqFWZa((java.lang.Iterable) objCopydefault);
            inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$0 = sgk2;
            inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$1 = list2;
            inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$2 = list3;
            inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$3 = null;
            inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$4 = null;
            inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.label = 4;
            objCopydefault = sgk.EZpvd(setOqFWZa, setOqFWZa2, inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1);
            if (objCopydefault != objCopydefault2) {
            }
        } else {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list5 = (java.util.List) inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$1;
                    list6 = (java.util.List) inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    pUU.KWHzl("InHouseIMConversationManagerImpl", "sync conversations => getConversationIdsNeededToBeSync => OKAssistantChannelId:" + ((java.util.List) objCopydefault));
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    for (java.lang.Object obj : list5) {
                        if (!r1.contains(((InHouseIMConversationSimpleInfoEntity) obj).getChannelId())) {
                            arrayList4.add(obj);
                        }
                    }
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    for (java.lang.Object obj2 : arrayList4) {
                        InHouseIMConversationSimpleInfoEntity inHouseIMConversationSimpleInfoEntity = (InHouseIMConversationSimpleInfoEntity) obj2;
                        java.util.Iterator it5 = list6.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it5.next();
                            if (Intrinsics.EZpvd((java.lang.Object) ((InHouseIMConversationSimpleInfoEntity) next).getChannelId(), (java.lang.Object) inHouseIMConversationSimpleInfoEntity.getChannelId())) {
                                break;
                            }
                        }
                        InHouseIMConversationSimpleInfoEntity inHouseIMConversationSimpleInfoEntity2 = (InHouseIMConversationSimpleInfoEntity) next;
                        if ((inHouseIMConversationSimpleInfoEntity2 != null ? inHouseIMConversationSimpleInfoEntity2.getUpdateTime() : null) == null || inHouseIMConversationSimpleInfoEntity.getUpdateTime() == null || C33129mqd.valueOf(inHouseIMConversationSimpleInfoEntity.getUpdateTime()) > C33129mqd.valueOf(inHouseIMConversationSimpleInfoEntity2.getUpdateTime())) {
                            arrayList5.add(obj2);
                        }
                    }
                    C44124sEe.imLogConversation$default("sync conversations => getConversationIdsNeededToBeSync => final list size:" + arrayList5.size(), null, 2, null);
                    return arrayList5;
                }
                list4 = (java.util.List) inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$2;
                java.util.List list10 = (java.util.List) inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$1;
                sgk2 = (sGK) inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                list2 = list10;
                java.util.Set set = (java.util.Set) objCopydefault;
                C44124sEe.imLogConversation$default("sync conversations => getConversationIdsNeededToBeSync => removeList size:" + set.size(), null, 2, null);
                it2 = CollectionsKt___CollectionsKt.valueOf(set, 500).iterator();
                while (it2.hasNext()) {
                    pUU.KWHzl("InHouseIMConversationManagerImpl", "sync conversations => getConversationIdsNeededToBeSync =>removeList data:" + ((java.util.List) it2.next()));
                }
                inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$0 = list2;
                inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$1 = list4;
                inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$2 = null;
                inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.label = 5;
                objCopydefault = sgk2.valueOf(inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1);
                if (objCopydefault != objCopydefault2) {
                    return objCopydefault2;
                }
                list5 = list4;
                list6 = list2;
                pUU.KWHzl("InHouseIMConversationManagerImpl", "sync conversations => getConversationIdsNeededToBeSync => OKAssistantChannelId:" + ((java.util.List) objCopydefault));
                java.util.ArrayList arrayList42 = new java.util.ArrayList();
                while (r3.hasNext()) {
                }
                java.util.ArrayList arrayList52 = new java.util.ArrayList();
                while (r3.hasNext()) {
                }
                C44124sEe.imLogConversation$default("sync conversations => getConversationIdsNeededToBeSync => final list size:" + arrayList52.size(), null, 2, null);
                return arrayList52;
            }
            setOqFWZa = (java.util.Set) inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$4;
            sGK sgk3 = (sGK) inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$3;
            java.util.List list11 = (java.util.List) inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$2;
            list2 = (java.util.List) inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$1;
            sGK sgk4 = (sGK) inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            list3 = list11;
            sgk = sgk3;
            sgk2 = sgk4;
            java.util.Set<java.lang.String> setOqFWZa22 = CollectionsKt___CollectionsKt.OqFWZa((java.lang.Iterable) objCopydefault);
            inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$0 = sgk2;
            inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$1 = list2;
            inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$2 = list3;
            inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$3 = null;
            inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$4 = null;
            inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.label = 4;
            objCopydefault = sgk.EZpvd(setOqFWZa, setOqFWZa22, inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1);
            if (objCopydefault != objCopydefault2) {
                return objCopydefault2;
            }
            list4 = list3;
            java.util.Set set2 = (java.util.Set) objCopydefault;
            C44124sEe.imLogConversation$default("sync conversations => getConversationIdsNeededToBeSync => removeList size:" + set2.size(), null, 2, null);
            it2 = CollectionsKt___CollectionsKt.valueOf(set2, 500).iterator();
            while (it2.hasNext()) {
            }
            inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$0 = list2;
            inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$1 = list4;
            inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$2 = null;
            inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.label = 5;
            objCopydefault = sgk2.valueOf(inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1);
            if (objCopydefault != objCopydefault2) {
            }
        }
        list = (java.util.List) objDjBIcL;
        inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$0 = sgk;
        inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$1 = list;
        inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.label = 2;
        objCopydefault = c44489sRs2.copydefault(inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        list2 = list;
        java.util.List list72 = (java.util.List) objCopydefault;
        C44124sEe.imLogConversation$default("sync conversations => getConversationIdsNeededToBeSync => local list size:" + list2.size(), null, 2, null);
        while (r4.hasNext()) {
        }
        C44124sEe.imLogConversation$default("sync conversations => getConversationIdsNeededToBeSync => remote list size:" + list72.size(), null, 2, null);
        while (r4.hasNext()) {
        }
        java.util.ArrayList arrayList32 = new java.util.ArrayList(C56403yEb.AYXKKw(list72, 10));
        it = list72.iterator();
        while (it.hasNext()) {
        }
        setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList32);
        inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$0 = sgk;
        inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$1 = list2;
        inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$2 = list72;
        inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$3 = sgk;
        inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.L$4 = setOqFWZa;
        inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1.label = 3;
        objGEmmrt = sgk.gEmmrt(inHouseIMConversationManagerImpl$getConversationIdsNeededToBeSync$1);
        if (objGEmmrt != objCopydefault2) {
        }
    }

    @Override // o.sGI
    public Flow<java.util.List<InHouseIMConversationListData>> KWHzl() throws java.lang.Exception {
        Ref.LongRef longRef = new Ref.LongRef();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        InHouseIMConversationDao inHouseIMConversationDaoAYXKKw = AYXKKw();
        Ref.LongRef longRef2 = new Ref.LongRef();
        java.lang.Exception exc = null;
        int i = 0;
        while (i < 3) {
            try {
                long jNanoTime = java.lang.System.nanoTime();
                Flow allConversationsFlow$default = InHouseIMConversationDao.Activity.getAllConversationsFlow$default(AYXKKw(), null, 0, 3, null);
                long jValueOf = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                longRef2.element = jValueOf;
                C44159sFm.EZpvd(inHouseIMConversationDaoAYXKKw, jValueOf);
                return new ActionBar(FlowKt.onStart(allConversationsFlow$default, new InHouseIMConversationManagerImpl$getAllConversationsFlow$2(longRef, null)), booleanRef, longRef);
            } catch (android.database.sqlite.SQLiteDatabaseLockedException e) {
                try {
                    C44159sFm.copydefault(e, exc);
                    i++;
                    exc = e;
                } finally {
                    C44159sFm.EZpvd(inHouseIMConversationDaoAYXKKw, longRef2.element);
                }
            } catch (java.lang.IllegalStateException e2) {
                java.lang.String message = e2.getMessage();
                if (message != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                    C44159sFm.OLrzqt(e2);
                    throw e2;
                }
                C44159sFm.copydefault(e2);
                throw e2;
            } catch (java.lang.Exception e3) {
                C44159sFm.OLrzqt(e3);
                throw e3;
            }
        }
        if (exc == null) {
            exc = new java.lang.Exception("Database Operation failed after 3 attempts");
        }
        C44159sFm.OLrzqt(exc);
        throw exc;
    }

    @Override // o.sGI
    public Flow<java.util.List<InHouseIMConversationListData>> KWHzl(int i, boolean z, boolean z2) throws java.lang.Exception {
        InHouseIMConversationDao inHouseIMConversationDaoAYXKKw = AYXKKw();
        Ref.LongRef longRef = new Ref.LongRef();
        java.lang.Exception exc = null;
        int i2 = 0;
        while (i2 < 3) {
            try {
                long jNanoTime = java.lang.System.nanoTime();
                Flow conversationsByPageFlow$default = InHouseIMConversationDao.Activity.getConversationsByPageFlow$default(AYXKKw(), i, null, 0, z, java.lang.Boolean.valueOf(z2), 6, null);
                long jValueOf = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                longRef.element = jValueOf;
                C44159sFm.EZpvd(inHouseIMConversationDaoAYXKKw, jValueOf);
                Ref.LongRef longRef2 = new Ref.LongRef();
                Flow flowOnCompletion = FlowKt.onCompletion(FlowKt.onEach(FlowKt.onStart(FlowKt.distinctUntilChanged(conversationsByPageFlow$default), new InHouseIMConversationManagerImpl$getConversationsByPageFlow$sourceFlow$1(longRef2, null)), new InHouseIMConversationManagerImpl$getConversationsByPageFlow$sourceFlow$2(longRef2, null)), new InHouseIMConversationManagerImpl$getConversationsByPageFlow$sourceFlow$3(longRef2, null));
                return FlowKt.merge(FlowKt.take(flowOnCompletion, 1), FlowKt.sample(FlowKt.drop(flowOnCompletion, 1), 500L));
            } catch (android.database.sqlite.SQLiteDatabaseLockedException e) {
                try {
                    C44159sFm.copydefault(e, exc);
                    i2++;
                    exc = e;
                } finally {
                    C44159sFm.EZpvd(inHouseIMConversationDaoAYXKKw, longRef.element);
                }
            } catch (java.lang.IllegalStateException e2) {
                java.lang.String message = e2.getMessage();
                if (message != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                    C44159sFm.OLrzqt(e2);
                    throw e2;
                }
                C44159sFm.copydefault(e2);
                throw e2;
            } catch (java.lang.Exception e3) {
                C44159sFm.OLrzqt(e3);
                throw e3;
            }
        }
        if (exc == null) {
            exc = new java.lang.Exception("Database Operation failed after 3 attempts");
        }
        C44159sFm.OLrzqt(exc);
        throw exc;
    }

    @Override // o.sGI
    public Flow<InHouseIMConversationListData> OLrzqt(@NotNull java.lang.String str) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(str, "");
        InHouseIMConversationDao inHouseIMConversationDaoAYXKKw = AYXKKw();
        Ref.LongRef longRef = new Ref.LongRef();
        java.lang.Exception exc = null;
        int i = 0;
        while (i < 3) {
            try {
                long jNanoTime = java.lang.System.nanoTime();
                Flow<InHouseIMConversationListData> singleConversationsFlow = AYXKKw().getSingleConversationsFlow(str);
                long jValueOf = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                longRef.element = jValueOf;
                C44159sFm.EZpvd(inHouseIMConversationDaoAYXKKw, jValueOf);
                return FlowKt.distinctUntilChanged(singleConversationsFlow);
            } catch (android.database.sqlite.SQLiteDatabaseLockedException e) {
                try {
                    C44159sFm.copydefault(e, exc);
                    i++;
                    exc = e;
                } finally {
                    C44159sFm.EZpvd(inHouseIMConversationDaoAYXKKw, longRef.element);
                }
            } catch (java.lang.IllegalStateException e2) {
                java.lang.String message = e2.getMessage();
                if (message != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                    C44159sFm.OLrzqt(e2);
                    throw e2;
                }
                C44159sFm.copydefault(e2);
                throw e2;
            } catch (java.lang.Exception e3) {
                C44159sFm.OLrzqt(e3);
                throw e3;
            }
        }
        if (exc == null) {
            exc = new java.lang.Exception("Database Operation failed after 3 attempts");
        }
        C44159sFm.OLrzqt(exc);
        throw exc;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v24, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v26, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v38, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x01a7: MOVE (r6 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:79:0x01a7 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01a8: MOVE (r7 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:79:0x01a7 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014c A[Catch: all -> 0x004a, TryCatch #8 {all -> 0x004a, blocks: (B:13:0x0042, B:36:0x0100, B:54:0x013f, B:55:0x0142, B:58:0x0146, B:60:0x014c, B:62:0x0158, B:63:0x015b, B:64:0x015c, B:65:0x015f, B:69:0x0167, B:71:0x0174), top: B:87:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0174 A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #8 {all -> 0x004a, blocks: (B:13:0x0042, B:36:0x0100, B:54:0x013f, B:55:0x0142, B:58:0x0146, B:60:0x014c, B:62:0x0158, B:63:0x015b, B:64:0x015c, B:65:0x015f, B:69:0x0167, B:71:0x0174), top: B:87:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0197 -> B:75:0x0198). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x019d -> B:76:0x0199). Please report as a decompilation issue!!! */
    @Override // o.sGI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Exception {
        InHouseIMConversationManagerImpl$hasConversationInLocalDb$1 inHouseIMConversationManagerImpl$hasConversationInLocalDb$1;
        sGK sgk;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDao2;
        Ref.ObjectRef objectRef;
        sGK sgk2;
        Ref.LongRef longRef3;
        int i;
        int i2;
        BaseDao baseDao3;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        BaseDao baseDao4;
        Ref.LongRef longRef4;
        Ref.ObjectRef objectRef2;
        int i3;
        int i4;
        ?? r0;
        Ref.ObjectRef objectRef3;
        long j;
        sGK sgk3;
        Ref.ObjectRef objectRef4;
        T t;
        if (continuation instanceof InHouseIMConversationManagerImpl$hasConversationInLocalDb$1) {
            inHouseIMConversationManagerImpl$hasConversationInLocalDb$1 = (InHouseIMConversationManagerImpl$hasConversationInLocalDb$1) continuation;
            int i5 = inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.label = i5 - Integer.MIN_VALUE;
                sgk = this;
            } else {
                sgk = this;
                inHouseIMConversationManagerImpl$hasConversationInLocalDb$1 = new InHouseIMConversationManagerImpl$hasConversationInLocalDb$1(sgk, continuation);
            }
        }
        java.lang.Object obj = inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i6 = inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.label;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    j = inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.J$0;
                    i2 = inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.I$2;
                    int i7 = inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.I$1;
                    int i8 = inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.I$0;
                    objectRef3 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.L$6;
                    Ref.LongRef longRef5 = (Ref.LongRef) inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.L$5;
                    Ref.ObjectRef objectRef5 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.L$4;
                    objectRef = (Ref.ObjectRef) inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.L$3;
                    longRef2 = (Ref.LongRef) inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.L$2;
                    baseDao2 = (BaseDao) inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.L$1;
                    sgk3 = (sGK) inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        longRef4 = longRef2;
                        i4 = i7;
                        baseDao4 = baseDao2;
                        objectRef4 = objectRef5;
                        longRef3 = longRef5;
                        i = i8;
                        t = obj;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        objectRef2 = objectRef;
                        sgk2 = sgk3;
                        i3 = i8;
                        baseDao4 = baseDao2;
                        longRef4 = longRef2;
                        i4 = i7;
                        r0 = e3;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i2 < i3 - 1) {
                        }
                    } catch (java.lang.IllegalStateException e4) {
                        e2 = e4;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e5) {
                        e = e5;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        throw th;
                    }
                    objectRef3.element = t;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                    T t2 = objectRef4.element;
                    C44159sFm.EZpvd(baseDao4, longRef4.element);
                    return C56443yFo.KWHzl(((java.lang.Number) t2).intValue() <= 0);
                }
                if (i6 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i9 = inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.I$1;
                i3 = inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.I$0;
                objectRef2 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.L$3;
                longRef4 = (Ref.LongRef) inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.L$2;
                baseDao4 = (BaseDao) inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.L$1;
                sgk2 = (sGK) inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.L$0;
                C56391yDq.AEQbTJ(obj);
                i4 = i9;
                objectRef = objectRef2;
                longRef3 = longRef4;
                i2 = i4 + 1;
                i = i3;
                baseDao3 = baseDao4;
                if (i2 >= i) {
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e6) {
                        objectRef2 = objectRef;
                        baseDao4 = baseDao3;
                        i3 = i;
                        longRef4 = longRef3;
                        i4 = i2;
                        r0 = e6;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i2 < i3 - 1) {
                        }
                    } catch (java.lang.IllegalStateException e7) {
                        e2 = e7;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e8) {
                        e = e8;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        baseDao2 = baseDao3;
                        longRef2 = longRef3;
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        throw th;
                    }
                    Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
                    long jNanoTime = java.lang.System.nanoTime();
                    InHouseIMConversationDao inHouseIMConversationDaoAYXKKw = sgk2.AYXKKw();
                    inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.L$0 = sgk2;
                    inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.L$1 = baseDao3;
                    inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.L$2 = longRef3;
                    inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.L$3 = objectRef;
                    inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.L$4 = objectRef6;
                    inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.L$5 = longRef3;
                    inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.L$6 = objectRef6;
                    inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.I$0 = i;
                    inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.I$1 = i2;
                    inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.I$2 = i2;
                    inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.J$0 = jNanoTime;
                    inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.label = 1;
                    java.lang.Object conversationsCount$default = InHouseIMConversationDao.Activity.getConversationsCount$default(inHouseIMConversationDaoAYXKKw, null, 0, inHouseIMConversationManagerImpl$hasConversationInLocalDb$1, 3, null);
                    if (conversationsCount$default == objCopydefault) {
                        return objCopydefault;
                    }
                    baseDao4 = baseDao3;
                    sgk3 = sgk2;
                    longRef4 = longRef3;
                    j = jNanoTime;
                    objectRef3 = objectRef6;
                    i4 = i2;
                    t = conversationsCount$default;
                    objectRef4 = objectRef3;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        objectRef2 = objectRef;
                        sgk2 = sgk3;
                        i3 = i;
                        r0 = e9;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i2 < i3 - 1) {
                            inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.L$0 = sgk2;
                            inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.L$1 = baseDao4;
                            inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.L$2 = longRef4;
                            inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.L$3 = objectRef2;
                            inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.L$4 = null;
                            inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.L$5 = null;
                            inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.L$6 = null;
                            inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.I$0 = i3;
                            inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.I$1 = i4;
                            inHouseIMConversationManagerImpl$hasConversationInLocalDb$1.label = 2;
                            if (DelayKt.delay(((long) (i2 + 1)) * 50, inHouseIMConversationManagerImpl$hasConversationInLocalDb$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            i9 = i4;
                            i4 = i9;
                            objectRef = objectRef2;
                            longRef3 = longRef4;
                            i2 = i4 + 1;
                            i = i3;
                            baseDao3 = baseDao4;
                            if (i2 >= i) {
                            }
                        } else {
                            objectRef = objectRef2;
                            longRef3 = longRef4;
                            i2 = i4 + 1;
                            i = i3;
                            baseDao3 = baseDao4;
                            if (i2 >= i) {
                            }
                        }
                    } catch (java.lang.IllegalStateException e10) {
                        e2 = e10;
                        message = e2.getMessage();
                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                            C44159sFm.OLrzqt(e2);
                            throw e2;
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e11) {
                        e = e11;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    }
                    objectRef3.element = t;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                    T t22 = objectRef4.element;
                    C44159sFm.EZpvd(baseDao4, longRef4.element);
                    return C56443yFo.KWHzl(((java.lang.Number) t22).intValue() <= 0);
                }
                C44159sFm.EZpvd(baseDao3, longRef3.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            InHouseIMConversationDao inHouseIMConversationDaoAYXKKw2 = AYXKKw();
            Ref.LongRef longRef6 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            sgk2 = sgk;
            longRef3 = longRef6;
            i = 3;
            i2 = 0;
            baseDao3 = inHouseIMConversationDaoAYXKKw2;
            if (i2 >= i) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            longRef2 = longRef;
            baseDao2 = baseDao;
        }
    }

    /* JADX DEBUG: Duplicate block (B:74:0x01c2) to fix multi-entry loop: BACK_EDGE: B:74:0x01c2 -> B:75:0x01ca */
    /* JADX DEBUG: Multi-variable search result rejected for r0v29, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x017d: MOVE (r6 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:64:0x017d */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x017e: MOVE (r7 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:64:0x017d */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0169 A[Catch: all -> 0x005c, TryCatch #12 {all -> 0x005c, blocks: (B:13:0x004a, B:37:0x0120, B:52:0x015c, B:53:0x015f, B:56:0x0163, B:58:0x0169, B:60:0x0175, B:61:0x0178, B:62:0x0179, B:63:0x017c), top: B:89:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0198 A[Catch: all -> 0x01d0, TRY_LEAVE, TryCatch #5 {all -> 0x01d0, blocks: (B:68:0x018b, B:70:0x0198), top: B:87:0x018b }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r1v11, types: [T, java.lang.Object, kotlin.Unit] */
    @Override // o.sGI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull InGroupStatus inGroupStatus, @NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        InHouseIMConversationManagerImpl$updateInGroupStatus$1 inHouseIMConversationManagerImpl$updateInGroupStatus$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDao2;
        sGK sgk;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        InGroupStatus inGroupStatus2;
        BaseDao baseDao3;
        InHouseIMConversationManagerImpl$updateInGroupStatus$1 inHouseIMConversationManagerImpl$updateInGroupStatus$12;
        java.lang.String str2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        sGK sgk2;
        Ref.LongRef longRef4;
        Ref.ObjectRef objectRef2;
        InGroupStatus inGroupStatus3;
        BaseDao baseDao4;
        int i3;
        java.lang.String str3;
        ?? r0;
        InHouseIMConversationManagerImpl$updateInGroupStatus$1 inHouseIMConversationManagerImpl$updateInGroupStatus$13;
        Ref.ObjectRef objectRef3;
        int i4;
        BaseDao baseDao5;
        long jNanoTime;
        int i5;
        Ref.ObjectRef objectRef4;
        java.lang.String str4;
        sGK sgk3;
        Ref.ObjectRef objectRef5;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        if (continuation instanceof InHouseIMConversationManagerImpl$updateInGroupStatus$1) {
            inHouseIMConversationManagerImpl$updateInGroupStatus$1 = (InHouseIMConversationManagerImpl$updateInGroupStatus$1) continuation;
            int i6 = inHouseIMConversationManagerImpl$updateInGroupStatus$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                inHouseIMConversationManagerImpl$updateInGroupStatus$1.label = i6 - Integer.MIN_VALUE;
            } else {
                inHouseIMConversationManagerImpl$updateInGroupStatus$1 = new InHouseIMConversationManagerImpl$updateInGroupStatus$1(this, continuation);
            }
        }
        java.lang.Object obj = inHouseIMConversationManagerImpl$updateInGroupStatus$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i7 = inHouseIMConversationManagerImpl$updateInGroupStatus$1.label;
        try {
            if (i7 != 0) {
                if (i7 == 1) {
                    jNanoTime = inHouseIMConversationManagerImpl$updateInGroupStatus$1.J$0;
                    i3 = inHouseIMConversationManagerImpl$updateInGroupStatus$1.I$2;
                    int i8 = inHouseIMConversationManagerImpl$updateInGroupStatus$1.I$1;
                    i = inHouseIMConversationManagerImpl$updateInGroupStatus$1.I$0;
                    Ref.ObjectRef objectRef6 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$updateInGroupStatus$1.L$8;
                    longRef3 = (Ref.LongRef) inHouseIMConversationManagerImpl$updateInGroupStatus$1.L$7;
                    objectRef3 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$updateInGroupStatus$1.L$6;
                    objectRef4 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$updateInGroupStatus$1.L$5;
                    longRef2 = (Ref.LongRef) inHouseIMConversationManagerImpl$updateInGroupStatus$1.L$4;
                    baseDao2 = (BaseDao) inHouseIMConversationManagerImpl$updateInGroupStatus$1.L$3;
                    inGroupStatus3 = (InGroupStatus) inHouseIMConversationManagerImpl$updateInGroupStatus$1.L$2;
                    java.lang.String str5 = (java.lang.String) inHouseIMConversationManagerImpl$updateInGroupStatus$1.L$1;
                    sgk3 = (sGK) inHouseIMConversationManagerImpl$updateInGroupStatus$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        objectRef5 = objectRef6;
                        i4 = i;
                        baseDao5 = baseDao2;
                        i2 = i3;
                        str4 = str5;
                        inHouseIMConversationManagerImpl$updateInGroupStatus$13 = inHouseIMConversationManagerImpl$updateInGroupStatus$1;
                        longRef4 = longRef2;
                        i5 = i8;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        sgk2 = sgk3;
                        objectRef2 = objectRef4;
                        baseDao4 = baseDao2;
                        i2 = i8;
                        str3 = str5;
                        longRef4 = longRef2;
                        r0 = e3;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i3 < i - 1) {
                        }
                        i2 += i;
                        baseDao3 = baseDao;
                        sgk = sgk2;
                        i = i;
                        if (i2 < i) {
                        }
                    } catch (java.lang.IllegalStateException e4) {
                        e2 = e4;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e5) {
                        e = e5;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        throw th;
                    }
                    ?? r1 = Unit.INSTANCE;
                    objectRef5.element = r1;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t = objectRef3.element;
                    C44159sFm.EZpvd(baseDao5, longRef4.element);
                    return r1;
                }
                if (i7 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i9 = inHouseIMConversationManagerImpl$updateInGroupStatus$1.I$1;
                int i10 = inHouseIMConversationManagerImpl$updateInGroupStatus$1.I$0;
                Ref.ObjectRef objectRef7 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$updateInGroupStatus$1.L$5;
                Ref.LongRef longRef5 = (Ref.LongRef) inHouseIMConversationManagerImpl$updateInGroupStatus$1.L$4;
                BaseDao baseDao6 = (BaseDao) inHouseIMConversationManagerImpl$updateInGroupStatus$1.L$3;
                InGroupStatus inGroupStatus4 = (InGroupStatus) inHouseIMConversationManagerImpl$updateInGroupStatus$1.L$2;
                java.lang.String str6 = (java.lang.String) inHouseIMConversationManagerImpl$updateInGroupStatus$1.L$1;
                sgk2 = (sGK) inHouseIMConversationManagerImpl$updateInGroupStatus$1.L$0;
                C56391yDq.AEQbTJ(obj);
                inHouseIMConversationManagerImpl$updateInGroupStatus$12 = inHouseIMConversationManagerImpl$updateInGroupStatus$1;
                i2 = i9;
                int i11 = i10;
                inGroupStatus2 = inGroupStatus4;
                str2 = str6;
                longRef3 = longRef5;
                int i12 = 1;
                objectRef = objectRef7;
                i2 += i12;
                baseDao3 = baseDao6;
                sgk = sgk2;
                i = i11;
                if (i2 < i) {
                    try {
                        try {
                        } catch (java.lang.IllegalStateException e6) {
                            e2 = e6;
                            message = e2.getMessage();
                            if (message == null) {
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e7) {
                            e = e7;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            baseDao2 = baseDao3;
                            longRef2 = longRef3;
                            C44159sFm.EZpvd(baseDao2, longRef2.element);
                            throw th;
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                        sgk2 = sgk;
                        objectRef2 = objectRef;
                        longRef4 = longRef3;
                        sQLiteDatabaseLockedException = e8;
                    }
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        try {
                            sgk2 = sgk;
                            objectRef2 = objectRef;
                            longRef4 = longRef3;
                            sQLiteDatabaseLockedException = e9;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i3 < i - 1) {
                                inHouseIMConversationManagerImpl$updateInGroupStatus$1.L$0 = sgk2;
                                inHouseIMConversationManagerImpl$updateInGroupStatus$1.L$1 = str3;
                                inHouseIMConversationManagerImpl$updateInGroupStatus$1.L$2 = inGroupStatus3;
                                inHouseIMConversationManagerImpl$updateInGroupStatus$1.L$3 = baseDao4;
                                inHouseIMConversationManagerImpl$updateInGroupStatus$1.L$4 = longRef4;
                                inHouseIMConversationManagerImpl$updateInGroupStatus$1.L$5 = objectRef2;
                                inHouseIMConversationManagerImpl$updateInGroupStatus$1.L$6 = null;
                                inHouseIMConversationManagerImpl$updateInGroupStatus$1.L$7 = null;
                                inHouseIMConversationManagerImpl$updateInGroupStatus$1.L$8 = null;
                                inHouseIMConversationManagerImpl$updateInGroupStatus$1.I$0 = i;
                                inHouseIMConversationManagerImpl$updateInGroupStatus$1.I$1 = i2;
                                inHouseIMConversationManagerImpl$updateInGroupStatus$1.label = 2;
                                if (DelayKt.delay(((long) (i3 + 1)) * 50, inHouseIMConversationManagerImpl$updateInGroupStatus$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                                longRef3 = longRef4;
                                i11 = i;
                                baseDao6 = baseDao4;
                                inHouseIMConversationManagerImpl$updateInGroupStatus$12 = inHouseIMConversationManagerImpl$updateInGroupStatus$1;
                                str2 = str3;
                                inGroupStatus2 = inGroupStatus3;
                                objectRef = objectRef2;
                                i12 = 1;
                            } else {
                                longRef3 = longRef4;
                                i11 = i;
                                baseDao6 = baseDao4;
                                inHouseIMConversationManagerImpl$updateInGroupStatus$12 = inHouseIMConversationManagerImpl$updateInGroupStatus$1;
                                str2 = str3;
                                inGroupStatus2 = inGroupStatus3;
                                objectRef = objectRef2;
                                i12 = 1;
                            }
                            i2 += i12;
                            baseDao3 = baseDao6;
                            sgk = sgk2;
                            i = i11;
                            if (i2 < i) {
                            }
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            baseDao2 = baseDao4;
                            longRef2 = longRef4;
                            C44159sFm.EZpvd(baseDao2, longRef2.element);
                            throw th;
                        }
                        inGroupStatus3 = inGroupStatus2;
                        str3 = str2;
                        inHouseIMConversationManagerImpl$updateInGroupStatus$1 = inHouseIMConversationManagerImpl$updateInGroupStatus$12;
                        baseDao4 = baseDao3;
                        i3 = i2;
                        r0 = sQLiteDatabaseLockedException;
                    }
                    Ref.ObjectRef objectRef8 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    InHouseIMConversationDao inHouseIMConversationDaoAYXKKw = sgk.AYXKKw();
                    int apiValue = inGroupStatus2.getApiValue();
                    inHouseIMConversationManagerImpl$updateInGroupStatus$12.L$0 = sgk;
                    inHouseIMConversationManagerImpl$updateInGroupStatus$12.L$1 = str2;
                    inHouseIMConversationManagerImpl$updateInGroupStatus$12.L$2 = inGroupStatus2;
                    inHouseIMConversationManagerImpl$updateInGroupStatus$12.L$3 = baseDao3;
                    inHouseIMConversationManagerImpl$updateInGroupStatus$12.L$4 = longRef3;
                    inHouseIMConversationManagerImpl$updateInGroupStatus$12.L$5 = objectRef;
                    inHouseIMConversationManagerImpl$updateInGroupStatus$12.L$6 = objectRef8;
                    inHouseIMConversationManagerImpl$updateInGroupStatus$12.L$7 = longRef3;
                    inHouseIMConversationManagerImpl$updateInGroupStatus$12.L$8 = objectRef8;
                    inHouseIMConversationManagerImpl$updateInGroupStatus$12.I$0 = i;
                    inHouseIMConversationManagerImpl$updateInGroupStatus$12.I$1 = i2;
                    inHouseIMConversationManagerImpl$updateInGroupStatus$12.I$2 = i2;
                    inHouseIMConversationManagerImpl$updateInGroupStatus$12.J$0 = jNanoTime;
                    inHouseIMConversationManagerImpl$updateInGroupStatus$12.label = 1;
                    if (inHouseIMConversationDaoAYXKKw.updateInGroupStatus(str2, apiValue, inHouseIMConversationManagerImpl$updateInGroupStatus$12) == objCopydefault) {
                        return objCopydefault;
                    }
                    inHouseIMConversationManagerImpl$updateInGroupStatus$13 = inHouseIMConversationManagerImpl$updateInGroupStatus$12;
                    objectRef4 = objectRef;
                    objectRef5 = objectRef8;
                    objectRef3 = objectRef5;
                    longRef4 = longRef3;
                    inGroupStatus3 = inGroupStatus2;
                    sgk3 = sgk;
                    i5 = i2;
                    i4 = i;
                    baseDao5 = baseDao3;
                    str4 = str2;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                        inHouseIMConversationManagerImpl$updateInGroupStatus$1 = inHouseIMConversationManagerImpl$updateInGroupStatus$13;
                        sgk2 = sgk3;
                        str3 = str4;
                        objectRef2 = objectRef4;
                        i3 = i2;
                        baseDao4 = baseDao5;
                        i = i4;
                        i2 = i5;
                        r0 = e10;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i3 < i - 1) {
                        }
                        i2 += i12;
                        baseDao3 = baseDao6;
                        sgk = sgk2;
                        i = i11;
                        if (i2 < i) {
                        }
                    } catch (java.lang.IllegalStateException e11) {
                        e2 = e11;
                        message = e2.getMessage();
                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                            C44159sFm.OLrzqt(e2);
                            throw e2;
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e12) {
                        e = e12;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    }
                    ?? r12 = Unit.INSTANCE;
                    objectRef5.element = r12;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef3.element;
                    C44159sFm.EZpvd(baseDao5, longRef4.element);
                    return r12;
                }
                C44159sFm.EZpvd(baseDao3, longRef3.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            InHouseIMConversationDao inHouseIMConversationDaoAYXKKw2 = AYXKKw();
            sgk = this;
            longRef3 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 3;
            i2 = 0;
            inGroupStatus2 = inGroupStatus;
            baseDao3 = inHouseIMConversationDaoAYXKKw2;
            inHouseIMConversationManagerImpl$updateInGroupStatus$12 = inHouseIMConversationManagerImpl$updateInGroupStatus$1;
            str2 = str;
            if (i2 < i) {
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            longRef2 = longRef;
            baseDao2 = baseDao;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:136:0x03a5 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:147:0x03c1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:77:0x0284 */
    /* JADX DEBUG: Incorrect finally slice size: {[IGET, INVOKE, IGET] complete}, expected: {[IGET, INVOKE] complete} */
    /* JADX DEBUG: Multi-variable search result rejected for r0v45, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v70, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v92, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r10v17, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v23, resolved type: T */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x03e6: MOVE (r4 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:161:0x03e5 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x03e5: MOVE (r5 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:161:0x03e5 */
    /* JADX WARN: Path cross not found for [B:44:0x0149, B:51:0x0167], limit reached: 201 */
    /* JADX WARN: Path cross not found for [B:51:0x0167, B:44:0x0149], limit reached: 201 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x040c A[Catch: all -> 0x0453, TRY_LEAVE, TryCatch #12 {all -> 0x0453, blocks: (B:24:0x009b, B:166:0x03ff, B:168:0x040c, B:150:0x03c7, B:151:0x03ca, B:153:0x03cd, B:155:0x03d3, B:157:0x03dd, B:158:0x03e0, B:159:0x03e1, B:160:0x03e4), top: B:200:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0182 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x023b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v22, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v57, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v79, types: [android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v80, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v87, types: [android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r2v10, types: [T, kotlin.Unit] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x02e8 -> B:100:0x02e6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:124:0x034b -> B:20:0x007b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:126:0x0372 -> B:20:0x007b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:171:0x0436 -> B:172:0x0437). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:174:0x0444 -> B:173:0x0438). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x02de -> B:99:0x02e4). Please report as a decompilation issue!!! */
    @Override // o.sGI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Exception {
        InHouseIMConversationManagerImpl$deleteConversation$1 inHouseIMConversationManagerImpl$deleteConversation$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDao2;
        java.lang.String str2;
        sGK sgk;
        DeleteConversationResponse deleteConversationResponse;
        int i;
        Ref.ObjectRef objectRef;
        int i2;
        Ref.LongRef longRef3;
        java.lang.String str3;
        int i3;
        java.lang.String str4;
        java.lang.String str5;
        int i4;
        int i5;
        long j;
        sGK sgk2;
        int i6;
        BaseDao baseDao3;
        java.lang.String str6;
        Ref.ObjectRef objectRef2;
        Ref.LongRef longRef4;
        int i7;
        Ref.ObjectRef objectRef3;
        Ref.LongRef longRef5;
        Ref.ObjectRef objectRef4;
        InHouseIMConversationManagerImpl$deleteConversation$1 inHouseIMConversationManagerImpl$deleteConversation$12;
        java.lang.String str7;
        int i8;
        java.lang.String message;
        ?? r0;
        sGK sgk3;
        java.lang.String str8;
        int i9;
        java.lang.String str9;
        java.lang.String str10;
        int i10;
        Ref.ObjectRef objectRef5;
        int i11;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        int i12;
        Ref.ObjectRef objectRef6;
        BaseDao baseDao4;
        Ref.ObjectRef objectRef7;
        sGK sgk4;
        java.lang.String str11;
        int i13;
        int i14;
        int i15;
        Ref.LongRef longRef6;
        BaseDao baseDao5;
        Ref.ObjectRef objectRef8;
        sGK sgk5;
        java.lang.String str12;
        int i16;
        int i17;
        Ref.LongRef longRef7;
        InHouseIMConversationManagerImpl$deleteConversation$1 inHouseIMConversationManagerImpl$deleteConversation$13;
        int i18;
        java.lang.String str13;
        java.lang.String str14;
        int i19;
        if (continuation instanceof InHouseIMConversationManagerImpl$deleteConversation$1) {
            inHouseIMConversationManagerImpl$deleteConversation$1 = (InHouseIMConversationManagerImpl$deleteConversation$1) continuation;
            int i20 = inHouseIMConversationManagerImpl$deleteConversation$1.label;
            if ((i20 & Integer.MIN_VALUE) != 0) {
                inHouseIMConversationManagerImpl$deleteConversation$1.label = i20 - Integer.MIN_VALUE;
            } else {
                inHouseIMConversationManagerImpl$deleteConversation$1 = new InHouseIMConversationManagerImpl$deleteConversation$1(this, continuation);
            }
        }
        java.lang.Object objDeleteConversation = inHouseIMConversationManagerImpl$deleteConversation$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        java.lang.String str15 = "not open";
        java.lang.String str16 = "Database Operation failed after ";
        java.lang.String str17 = " attempts";
        try {
            switch (inHouseIMConversationManagerImpl$deleteConversation$1.label) {
                case 0:
                    C56391yDq.AEQbTJ(objDeleteConversation);
                    InHouseIMConversationService inHouseIMConversationService = this.EZpvd;
                    DeleteConversationRequest deleteConversationRequest = new DeleteConversationRequest(C56402yEa.EZpvd(str));
                    inHouseIMConversationManagerImpl$deleteConversation$1.L$0 = this;
                    inHouseIMConversationManagerImpl$deleteConversation$1.L$1 = str;
                    inHouseIMConversationManagerImpl$deleteConversation$1.label = 1;
                    objDeleteConversation = inHouseIMConversationService.deleteConversation(deleteConversationRequest, inHouseIMConversationManagerImpl$deleteConversation$1);
                    if (objDeleteConversation == objCopydefault) {
                        return objCopydefault;
                    }
                    str2 = str;
                    sgk = this;
                    deleteConversationResponse = (DeleteConversationResponse) ((ResponseData) objDeleteConversation).getData();
                    if (deleteConversationResponse != null) {
                        boolean zIsSuccess = deleteConversationResponse.isSuccess();
                        java.util.List<java.lang.Long> deletedConversationChanIds = deleteConversationResponse.getDeletedConversationChanIds();
                        boolean zContains = deletedConversationChanIds != null ? deletedConversationChanIds.contains(C56443yFo.KWHzl(C33129mqd.valueOf(str2))) : false;
                        if (zIsSuccess && zContains) {
                            i = 1;
                        }
                        if (i != 0) {
                            InHouseIMGroupInfoDao inHouseIMGroupInfoDaoValues = sgk.values();
                            Ref.LongRef longRef8 = new Ref.LongRef();
                            objectRef = new Ref.ObjectRef();
                            i2 = i;
                            longRef3 = longRef8;
                            str3 = " attempts";
                            i3 = 0;
                            str4 = str2;
                            str5 = "Database Operation failed after ";
                            i4 = 3;
                            baseDao2 = inHouseIMGroupInfoDaoValues;
                            if (i3 >= i4) {
                                try {
                                    try {
                                    } catch (java.lang.IllegalStateException e) {
                                        e = e;
                                        message = e.getMessage();
                                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) str15, false, 2, (java.lang.Object) null)) {
                                            C44159sFm.OLrzqt(e);
                                            throw e;
                                        }
                                        C44159sFm.copydefault(e);
                                        throw e;
                                    } catch (java.lang.Exception e2) {
                                        e = e2;
                                        C44159sFm.OLrzqt(e);
                                        throw e;
                                    } catch (java.lang.Throwable th) {
                                        th = th;
                                        longRef2 = longRef3;
                                        throw th;
                                    }
                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                                    e = e3;
                                    str9 = str3;
                                }
                                objectRef4 = new Ref.ObjectRef();
                                long jNanoTime = java.lang.System.nanoTime();
                                str9 = str3;
                                try {
                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e4) {
                                    e = e4;
                                    str10 = str5;
                                    i10 = i4;
                                    objectRef5 = objectRef;
                                    i11 = i3;
                                    sQLiteDatabaseLockedException = e;
                                    sgk2 = sgk;
                                    i7 = i10;
                                    str17 = str9;
                                    java.lang.String str18 = str10;
                                    baseDao3 = baseDao2;
                                    i6 = i11;
                                    longRef4 = longRef3;
                                    str6 = str4;
                                    i5 = i3;
                                    objectRef2 = objectRef5;
                                    str16 = str18;
                                    r0 = sQLiteDatabaseLockedException;
                                    C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                                    objectRef2.element = r0;
                                    if (i5 < i7 - 1) {
                                    }
                                }
                                InHouseIMGroupInfoDao inHouseIMGroupInfoDaoValues2 = sgk.values();
                                inHouseIMConversationManagerImpl$deleteConversation$1.L$0 = sgk;
                                inHouseIMConversationManagerImpl$deleteConversation$1.L$1 = str4;
                                inHouseIMConversationManagerImpl$deleteConversation$1.L$2 = baseDao2;
                                inHouseIMConversationManagerImpl$deleteConversation$1.L$3 = longRef3;
                                inHouseIMConversationManagerImpl$deleteConversation$1.L$4 = objectRef;
                                inHouseIMConversationManagerImpl$deleteConversation$1.L$5 = objectRef4;
                                inHouseIMConversationManagerImpl$deleteConversation$1.L$6 = longRef3;
                                inHouseIMConversationManagerImpl$deleteConversation$1.L$7 = objectRef4;
                                inHouseIMConversationManagerImpl$deleteConversation$1.I$0 = i2;
                                inHouseIMConversationManagerImpl$deleteConversation$1.I$1 = i4;
                                inHouseIMConversationManagerImpl$deleteConversation$1.I$2 = i3;
                                inHouseIMConversationManagerImpl$deleteConversation$1.I$3 = i3;
                                inHouseIMConversationManagerImpl$deleteConversation$1.J$0 = jNanoTime;
                                inHouseIMConversationManagerImpl$deleteConversation$1.label = 2;
                                if (inHouseIMGroupInfoDaoValues2.deleteGroupInfoById(str4, inHouseIMConversationManagerImpl$deleteConversation$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                                i8 = i3;
                                objectRef3 = objectRef4;
                                longRef5 = longRef3;
                                str7 = str9;
                                j = jNanoTime;
                                inHouseIMConversationManagerImpl$deleteConversation$12 = inHouseIMConversationManagerImpl$deleteConversation$1;
                                try {
                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e5) {
                                    e = e5;
                                    i12 = i3;
                                    objectRef6 = objectRef;
                                }
                                objectRef3.element = Unit.INSTANCE;
                                i12 = i3;
                                objectRef6 = objectRef;
                                try {
                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e6) {
                                    e = e6;
                                    i11 = i8;
                                    str9 = str7;
                                    i3 = i12;
                                    str10 = str5;
                                    i10 = i4;
                                    objectRef5 = objectRef6;
                                    inHouseIMConversationManagerImpl$deleteConversation$1 = inHouseIMConversationManagerImpl$deleteConversation$12;
                                    sQLiteDatabaseLockedException = e;
                                    sgk2 = sgk;
                                    i7 = i10;
                                    str17 = str9;
                                    java.lang.String str182 = str10;
                                    baseDao3 = baseDao2;
                                    i6 = i11;
                                    longRef4 = longRef3;
                                    str6 = str4;
                                    i5 = i3;
                                    objectRef2 = objectRef5;
                                    str16 = str182;
                                    r0 = sQLiteDatabaseLockedException;
                                    C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                                    objectRef2.element = r0;
                                    if (i5 < i7 - 1) {
                                        str8 = str15;
                                        inHouseIMConversationManagerImpl$deleteConversation$1.L$0 = sgk2;
                                        inHouseIMConversationManagerImpl$deleteConversation$1.L$1 = str6;
                                        inHouseIMConversationManagerImpl$deleteConversation$1.L$2 = baseDao3;
                                        inHouseIMConversationManagerImpl$deleteConversation$1.L$3 = longRef4;
                                        inHouseIMConversationManagerImpl$deleteConversation$1.L$4 = objectRef2;
                                        sgk3 = sgk2;
                                        inHouseIMConversationManagerImpl$deleteConversation$1.L$5 = null;
                                        inHouseIMConversationManagerImpl$deleteConversation$1.L$6 = null;
                                        inHouseIMConversationManagerImpl$deleteConversation$1.L$7 = null;
                                        inHouseIMConversationManagerImpl$deleteConversation$1.I$0 = i2;
                                        inHouseIMConversationManagerImpl$deleteConversation$1.I$1 = i7;
                                        inHouseIMConversationManagerImpl$deleteConversation$1.I$2 = i6;
                                        inHouseIMConversationManagerImpl$deleteConversation$1.label = 3;
                                        if (DelayKt.delay(((long) (i5 + 1)) * 50, inHouseIMConversationManagerImpl$deleteConversation$1) == objCopydefault) {
                                            return objCopydefault;
                                        }
                                        i9 = i2;
                                        i2 = i9;
                                        str4 = str6;
                                        longRef3 = longRef4;
                                        objectRef = objectRef2;
                                        int i21 = i7;
                                        sgk = sgk3;
                                        java.lang.String str19 = str17;
                                        str5 = str16;
                                        i4 = i21;
                                        i3 = i6 + 1;
                                        baseDao2 = baseDao3;
                                        str15 = str8;
                                        str3 = str19;
                                        if (i3 >= i4) {
                                        }
                                    } else {
                                        sgk3 = sgk2;
                                        str8 = str15;
                                        str4 = str6;
                                        longRef3 = longRef4;
                                        objectRef = objectRef2;
                                        int i212 = i7;
                                        sgk = sgk3;
                                        java.lang.String str192 = str17;
                                        str5 = str16;
                                        i4 = i212;
                                        i3 = i6 + 1;
                                        baseDao2 = baseDao3;
                                        str15 = str8;
                                        str3 = str192;
                                        if (i3 >= i4) {
                                        }
                                    }
                                }
                                longRef5.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                                T t = objectRef4.element;
                                C44159sFm.EZpvd(baseDao2, longRef3.element);
                                InHouseIMGroupMemberDao inHouseIMGroupMemberDaoIsConnected = sgk.isConnected();
                                Ref.LongRef longRef9 = new Ref.LongRef();
                                baseDao4 = inHouseIMGroupMemberDaoIsConnected;
                                objectRef7 = new Ref.ObjectRef();
                                sgk4 = sgk;
                                str11 = str4;
                                str16 = str5;
                                str17 = str7;
                                i13 = i2;
                                inHouseIMConversationManagerImpl$deleteConversation$1 = inHouseIMConversationManagerImpl$deleteConversation$12;
                                i14 = 0;
                                i15 = 3;
                                longRef6 = longRef9;
                                if (i14 >= i15) {
                                    try {
                                        try {
                                            break;
                                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e7) {
                                            C44159sFm.copydefault(e7, (java.lang.Exception) objectRef7.element);
                                            objectRef7.element = e7;
                                            if (i14 < i15 - 1) {
                                                inHouseIMConversationManagerImpl$deleteConversation$1.L$0 = sgk4;
                                                inHouseIMConversationManagerImpl$deleteConversation$1.L$1 = str11;
                                                inHouseIMConversationManagerImpl$deleteConversation$1.L$2 = baseDao4;
                                                inHouseIMConversationManagerImpl$deleteConversation$1.L$3 = longRef6;
                                                inHouseIMConversationManagerImpl$deleteConversation$1.L$4 = objectRef7;
                                                inHouseIMConversationManagerImpl$deleteConversation$1.L$5 = null;
                                                inHouseIMConversationManagerImpl$deleteConversation$1.L$6 = null;
                                                inHouseIMConversationManagerImpl$deleteConversation$1.L$7 = null;
                                                inHouseIMConversationManagerImpl$deleteConversation$1.I$0 = i13;
                                                inHouseIMConversationManagerImpl$deleteConversation$1.I$1 = i15;
                                                inHouseIMConversationManagerImpl$deleteConversation$1.I$2 = i14;
                                                inHouseIMConversationManagerImpl$deleteConversation$1.label = 4;
                                                if (DelayKt.delay(((long) (i14 + 1)) * 50, inHouseIMConversationManagerImpl$deleteConversation$1) == objCopydefault) {
                                                    return objCopydefault;
                                                }
                                            }
                                            i14++;
                                            if (i14 >= i15) {
                                            }
                                        } catch (java.lang.IllegalStateException e8) {
                                            java.lang.String message2 = e8.getMessage();
                                            if (message2 != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message2, (java.lang.CharSequence) str15, false, 2, (java.lang.Object) null)) {
                                                C44159sFm.OLrzqt(e8);
                                                throw e8;
                                            }
                                            C44159sFm.copydefault(e8);
                                            throw e8;
                                        }
                                        long jNanoTime2 = java.lang.System.nanoTime();
                                        sgk4.isConnected().deleteGroupMemberList(str11);
                                        Unit unit = Unit.INSTANCE;
                                        long jValueOf = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime2, DurationUnit.NANOSECONDS));
                                        longRef6.element = jValueOf;
                                        C44159sFm.EZpvd(baseDao4, jValueOf);
                                        InHouseIMGroupSettingDao inHouseIMGroupSettingDaoFetchVPNInfo = sgk4.fetchVPNInfo();
                                        Ref.LongRef longRef10 = new Ref.LongRef();
                                        baseDao5 = inHouseIMGroupSettingDaoFetchVPNInfo;
                                        objectRef8 = new Ref.ObjectRef();
                                        sgk5 = sgk4;
                                        str12 = str11;
                                        i16 = 0;
                                        i17 = 3;
                                        int i22 = i13;
                                        longRef7 = longRef10;
                                        inHouseIMConversationManagerImpl$deleteConversation$13 = inHouseIMConversationManagerImpl$deleteConversation$1;
                                        i18 = i22;
                                        if (i16 >= i17) {
                                            try {
                                                try {
                                                } catch (java.lang.IllegalStateException e9) {
                                                    java.lang.String message3 = e9.getMessage();
                                                    if (message3 != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message3, (java.lang.CharSequence) str15, false, 2, (java.lang.Object) null)) {
                                                        C44159sFm.OLrzqt(e9);
                                                        throw e9;
                                                    }
                                                    C44159sFm.copydefault(e9);
                                                    throw e9;
                                                } catch (java.lang.Exception e10) {
                                                    C44159sFm.OLrzqt(e10);
                                                    throw e10;
                                                }
                                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e11) {
                                                e = e11;
                                                str13 = str16;
                                                str14 = str17;
                                            }
                                            long jNanoTime3 = java.lang.System.nanoTime();
                                            sgk5.fetchVPNInfo().deleteSettingInfoById(str12);
                                            Unit unit2 = Unit.INSTANCE;
                                            str13 = str16;
                                            str14 = str17;
                                            try {
                                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e12) {
                                                e = e12;
                                                C44159sFm.copydefault(e, (java.lang.Exception) objectRef8.element);
                                                objectRef8.element = e;
                                                if (i16 < i17 - 1) {
                                                    inHouseIMConversationManagerImpl$deleteConversation$13.L$0 = sgk5;
                                                    inHouseIMConversationManagerImpl$deleteConversation$13.L$1 = str12;
                                                    inHouseIMConversationManagerImpl$deleteConversation$13.L$2 = baseDao5;
                                                    inHouseIMConversationManagerImpl$deleteConversation$13.L$3 = longRef7;
                                                    inHouseIMConversationManagerImpl$deleteConversation$13.L$4 = objectRef8;
                                                    sGK sgk6 = sgk5;
                                                    inHouseIMConversationManagerImpl$deleteConversation$13.L$5 = null;
                                                    inHouseIMConversationManagerImpl$deleteConversation$13.L$6 = null;
                                                    inHouseIMConversationManagerImpl$deleteConversation$13.L$7 = null;
                                                    inHouseIMConversationManagerImpl$deleteConversation$13.I$0 = i18;
                                                    inHouseIMConversationManagerImpl$deleteConversation$13.I$1 = i17;
                                                    inHouseIMConversationManagerImpl$deleteConversation$13.I$2 = i16;
                                                    inHouseIMConversationManagerImpl$deleteConversation$13.label = 5;
                                                    if (DelayKt.delay(((long) (i16 + 1)) * 50, inHouseIMConversationManagerImpl$deleteConversation$13) == objCopydefault) {
                                                        return objCopydefault;
                                                    }
                                                    sgk5 = sgk6;
                                                    str16 = str13;
                                                    str17 = str14;
                                                    i19 = i18;
                                                    inHouseIMConversationManagerImpl$deleteConversation$1 = inHouseIMConversationManagerImpl$deleteConversation$13;
                                                    inHouseIMConversationManagerImpl$deleteConversation$13 = inHouseIMConversationManagerImpl$deleteConversation$1;
                                                    i18 = i19;
                                                    i16++;
                                                    if (i16 >= i17) {
                                                    }
                                                } else {
                                                    str16 = str13;
                                                    str17 = str14;
                                                    i16++;
                                                    if (i16 >= i17) {
                                                    }
                                                }
                                            }
                                            long jValueOf2 = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime3, DurationUnit.NANOSECONDS));
                                            longRef7.element = jValueOf2;
                                            C44159sFm.EZpvd(baseDao5, jValueOf2);
                                            java.util.Set<java.lang.String> setAEQbTJ = yED.AEQbTJ(str12);
                                            inHouseIMConversationManagerImpl$deleteConversation$13.L$0 = null;
                                            inHouseIMConversationManagerImpl$deleteConversation$13.L$1 = null;
                                            inHouseIMConversationManagerImpl$deleteConversation$13.L$2 = null;
                                            inHouseIMConversationManagerImpl$deleteConversation$13.L$3 = null;
                                            inHouseIMConversationManagerImpl$deleteConversation$13.L$4 = null;
                                            inHouseIMConversationManagerImpl$deleteConversation$13.L$5 = null;
                                            inHouseIMConversationManagerImpl$deleteConversation$13.L$6 = null;
                                            inHouseIMConversationManagerImpl$deleteConversation$13.L$7 = null;
                                            inHouseIMConversationManagerImpl$deleteConversation$13.I$0 = i18;
                                            inHouseIMConversationManagerImpl$deleteConversation$13.label = 6;
                                            if (sgk5.KWHzl(setAEQbTJ, inHouseIMConversationManagerImpl$deleteConversation$13) == objCopydefault) {
                                                return objCopydefault;
                                            }
                                            i = i18;
                                        } else {
                                            java.lang.String str20 = str16;
                                            java.lang.String str21 = str17;
                                            C44159sFm.EZpvd(baseDao5, longRef7.element);
                                            java.lang.Exception exc = (java.lang.Exception) objectRef8.element;
                                            if (exc == null) {
                                                exc = new java.lang.Exception(str20 + i17 + str21);
                                            }
                                            C44159sFm.OLrzqt(exc);
                                            throw exc;
                                        }
                                    } catch (java.lang.Exception e13) {
                                        C44159sFm.OLrzqt(e13);
                                        throw e13;
                                    }
                                } else {
                                    C44159sFm.EZpvd(baseDao4, longRef6.element);
                                    java.lang.Exception exc2 = (java.lang.Exception) objectRef7.element;
                                    if (exc2 == null) {
                                        exc2 = new java.lang.Exception(str16 + i15 + str17);
                                    }
                                    C44159sFm.OLrzqt(exc2);
                                    throw exc2;
                                }
                            } else {
                                java.lang.String str22 = str3;
                                C44159sFm.EZpvd(baseDao2, longRef3.element);
                                java.lang.Exception exc3 = (java.lang.Exception) objectRef.element;
                                if (exc3 == null) {
                                    exc3 = new java.lang.Exception(str5 + i4 + str22);
                                }
                                C44159sFm.OLrzqt(exc3);
                                throw exc3;
                            }
                            break;
                        }
                        return C56443yFo.KWHzl(i == 0);
                    }
                    i = 0;
                    if (i != 0) {
                    }
                    return C56443yFo.KWHzl(i == 0);
                case 1:
                    str2 = (java.lang.String) inHouseIMConversationManagerImpl$deleteConversation$1.L$1;
                    sgk = (sGK) inHouseIMConversationManagerImpl$deleteConversation$1.L$0;
                    C56391yDq.AEQbTJ(objDeleteConversation);
                    deleteConversationResponse = (DeleteConversationResponse) ((ResponseData) objDeleteConversation).getData();
                    if (deleteConversationResponse != null) {
                    }
                    i = 0;
                    if (i != 0) {
                    }
                    return C56443yFo.KWHzl(i == 0);
                case 2:
                    long j2 = inHouseIMConversationManagerImpl$deleteConversation$1.J$0;
                    i5 = inHouseIMConversationManagerImpl$deleteConversation$1.I$3;
                    int i23 = inHouseIMConversationManagerImpl$deleteConversation$1.I$2;
                    int i24 = inHouseIMConversationManagerImpl$deleteConversation$1.I$1;
                    int i25 = inHouseIMConversationManagerImpl$deleteConversation$1.I$0;
                    Ref.ObjectRef objectRef9 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$deleteConversation$1.L$7;
                    Ref.LongRef longRef11 = (Ref.LongRef) inHouseIMConversationManagerImpl$deleteConversation$1.L$6;
                    Ref.ObjectRef objectRef10 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$deleteConversation$1.L$5;
                    j = j2;
                    Ref.ObjectRef objectRef11 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$deleteConversation$1.L$4;
                    longRef2 = (Ref.LongRef) inHouseIMConversationManagerImpl$deleteConversation$1.L$3;
                    BaseDao baseDao6 = (BaseDao) inHouseIMConversationManagerImpl$deleteConversation$1.L$2;
                    java.lang.String str23 = (java.lang.String) inHouseIMConversationManagerImpl$deleteConversation$1.L$1;
                    sGK sgk7 = (sGK) inHouseIMConversationManagerImpl$deleteConversation$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(objDeleteConversation);
                        objectRef3 = objectRef9;
                        longRef5 = longRef11;
                        longRef3 = longRef2;
                        objectRef4 = objectRef10;
                        sgk = sgk7;
                        i2 = i25;
                        baseDao2 = baseDao6;
                        inHouseIMConversationManagerImpl$deleteConversation$12 = inHouseIMConversationManagerImpl$deleteConversation$1;
                        str7 = " attempts";
                        str5 = "Database Operation failed after ";
                        i4 = i24;
                        objectRef = objectRef11;
                        i8 = i23;
                        i3 = i5;
                        str4 = str23;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e14) {
                        sgk2 = sgk7;
                        i6 = i23;
                        i2 = i25;
                        baseDao3 = baseDao6;
                        str6 = str23;
                        objectRef2 = objectRef11;
                        longRef4 = longRef2;
                        i7 = i24;
                        r0 = e14;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i5 < i7 - 1) {
                        }
                    } catch (java.lang.IllegalStateException e15) {
                        e = e15;
                        message = e.getMessage();
                        if (message == null) {
                            break;
                        }
                        C44159sFm.copydefault(e);
                        throw e;
                    } catch (java.lang.Exception e16) {
                        e = e16;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        baseDao2 = baseDao6;
                        throw th;
                    }
                    objectRef3.element = Unit.INSTANCE;
                    i12 = i3;
                    objectRef6 = objectRef;
                    longRef5.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                    T t2 = objectRef4.element;
                    C44159sFm.EZpvd(baseDao2, longRef3.element);
                    InHouseIMGroupMemberDao inHouseIMGroupMemberDaoIsConnected2 = sgk.isConnected();
                    Ref.LongRef longRef92 = new Ref.LongRef();
                    baseDao4 = inHouseIMGroupMemberDaoIsConnected2;
                    objectRef7 = new Ref.ObjectRef();
                    sgk4 = sgk;
                    str11 = str4;
                    str16 = str5;
                    str17 = str7;
                    i13 = i2;
                    inHouseIMConversationManagerImpl$deleteConversation$1 = inHouseIMConversationManagerImpl$deleteConversation$12;
                    i14 = 0;
                    i15 = 3;
                    longRef6 = longRef92;
                    if (i14 >= i15) {
                    }
                    break;
                case 3:
                    i6 = inHouseIMConversationManagerImpl$deleteConversation$1.I$2;
                    i7 = inHouseIMConversationManagerImpl$deleteConversation$1.I$1;
                    i9 = inHouseIMConversationManagerImpl$deleteConversation$1.I$0;
                    objectRef2 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$deleteConversation$1.L$4;
                    longRef4 = (Ref.LongRef) inHouseIMConversationManagerImpl$deleteConversation$1.L$3;
                    baseDao3 = (BaseDao) inHouseIMConversationManagerImpl$deleteConversation$1.L$2;
                    java.lang.String str24 = (java.lang.String) inHouseIMConversationManagerImpl$deleteConversation$1.L$1;
                    sGK sgk8 = (sGK) inHouseIMConversationManagerImpl$deleteConversation$1.L$0;
                    C56391yDq.AEQbTJ(objDeleteConversation);
                    sgk3 = sgk8;
                    str6 = str24;
                    str8 = "not open";
                    i2 = i9;
                    str4 = str6;
                    longRef3 = longRef4;
                    objectRef = objectRef2;
                    int i2122 = i7;
                    sgk = sgk3;
                    java.lang.String str1922 = str17;
                    str5 = str16;
                    i4 = i2122;
                    i3 = i6 + 1;
                    baseDao2 = baseDao3;
                    str15 = str8;
                    str3 = str1922;
                    if (i3 >= i4) {
                    }
                    break;
                case 4:
                    i14 = inHouseIMConversationManagerImpl$deleteConversation$1.I$2;
                    i15 = inHouseIMConversationManagerImpl$deleteConversation$1.I$1;
                    i13 = inHouseIMConversationManagerImpl$deleteConversation$1.I$0;
                    objectRef7 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$deleteConversation$1.L$4;
                    longRef6 = (Ref.LongRef) inHouseIMConversationManagerImpl$deleteConversation$1.L$3;
                    baseDao4 = (BaseDao) inHouseIMConversationManagerImpl$deleteConversation$1.L$2;
                    str11 = (java.lang.String) inHouseIMConversationManagerImpl$deleteConversation$1.L$1;
                    sgk4 = (sGK) inHouseIMConversationManagerImpl$deleteConversation$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(objDeleteConversation);
                        i14++;
                        if (i14 >= i15) {
                        }
                    } finally {
                        C44159sFm.EZpvd(baseDao4, longRef6.element);
                    }
                    break;
                case 5:
                    i16 = inHouseIMConversationManagerImpl$deleteConversation$1.I$2;
                    i17 = inHouseIMConversationManagerImpl$deleteConversation$1.I$1;
                    i19 = inHouseIMConversationManagerImpl$deleteConversation$1.I$0;
                    objectRef8 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$deleteConversation$1.L$4;
                    longRef7 = (Ref.LongRef) inHouseIMConversationManagerImpl$deleteConversation$1.L$3;
                    baseDao5 = (BaseDao) inHouseIMConversationManagerImpl$deleteConversation$1.L$2;
                    str12 = (java.lang.String) inHouseIMConversationManagerImpl$deleteConversation$1.L$1;
                    sgk5 = (sGK) inHouseIMConversationManagerImpl$deleteConversation$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(objDeleteConversation);
                        inHouseIMConversationManagerImpl$deleteConversation$13 = inHouseIMConversationManagerImpl$deleteConversation$1;
                        i18 = i19;
                        i16++;
                        if (i16 >= i17) {
                        }
                    } catch (java.lang.Throwable th3) {
                        throw th3;
                    }
                    break;
                case 6:
                    i18 = inHouseIMConversationManagerImpl$deleteConversation$1.I$0;
                    C56391yDq.AEQbTJ(objDeleteConversation);
                    i = i18;
                    return C56443yFo.KWHzl(i == 0);
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            longRef2 = longRef;
            baseDao2 = baseDao;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.sGI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Continuation<? super AnnouncementBanner> continuation) throws java.lang.Throwable {
        InHouseIMConversationManagerImpl$getAnnouncementBanner$1 inHouseIMConversationManagerImpl$getAnnouncementBanner$1;
        if (continuation instanceof InHouseIMConversationManagerImpl$getAnnouncementBanner$1) {
            inHouseIMConversationManagerImpl$getAnnouncementBanner$1 = (InHouseIMConversationManagerImpl$getAnnouncementBanner$1) continuation;
            int i = inHouseIMConversationManagerImpl$getAnnouncementBanner$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMConversationManagerImpl$getAnnouncementBanner$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMConversationManagerImpl$getAnnouncementBanner$1 = new InHouseIMConversationManagerImpl$getAnnouncementBanner$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = inHouseIMConversationManagerImpl$getAnnouncementBanner$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMConversationManagerImpl$getAnnouncementBanner$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            if (C44157sFk.gEmmrt().values()) {
                sHS shs = this.copydefault;
                inHouseIMConversationManagerImpl$getAnnouncementBanner$1.label = 1;
                objEZpvd = shs.EZpvd(inHouseIMConversationManagerImpl$getAnnouncementBanner$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                C44124sEe.imLogLogin$default("getBannerAnnouncementContent: User not logged in", null, 2, null);
                return null;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        return (AnnouncementBanner) ((ResponseData) objEZpvd).getData();
    }

    @Override // o.sGI
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull InHouseIMChannelType inHouseIMChannelType, int i, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objStoreInAppConversation$default = sGI.TaskDescription.storeInAppConversation$default(this, str, inHouseIMChannelType, null, null, C56443yFo.AEQbTJ(i), continuation, 12, null);
        return objStoreInAppConversation$default == C56442yFn.copydefault() ? objStoreInAppConversation$default : Unit.INSTANCE;
    }

    @Override // o.sGI
    public Flow<java.lang.Integer> copydefault(@NotNull ReceiveMessageOptionType receiveMessageOptionType) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(receiveMessageOptionType, "");
        InHouseIMConversationDao inHouseIMConversationDaoAYXKKw = AYXKKw();
        Ref.LongRef longRef = new Ref.LongRef();
        java.lang.Exception exc = null;
        int i = 0;
        while (i < 3) {
            try {
                long jNanoTime = java.lang.System.nanoTime();
                Flow totalUnreadCountFlow$default = InHouseIMConversationDao.Activity.getTotalUnreadCountFlow$default(AYXKKw(), receiveMessageOptionType.getApiValue(), null, 0, 6, null);
                long jValueOf = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                longRef.element = jValueOf;
                C44159sFm.EZpvd(inHouseIMConversationDaoAYXKKw, jValueOf);
                return new LoaderManager(FlowKt.distinctUntilChanged(totalUnreadCountFlow$default));
            } catch (android.database.sqlite.SQLiteDatabaseLockedException e) {
                try {
                    C44159sFm.copydefault(e, exc);
                    i++;
                    exc = e;
                } finally {
                    C44159sFm.EZpvd(inHouseIMConversationDaoAYXKKw, longRef.element);
                }
            } catch (java.lang.IllegalStateException e2) {
                java.lang.String message = e2.getMessage();
                if (message != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                    C44159sFm.OLrzqt(e2);
                    throw e2;
                }
                C44159sFm.copydefault(e2);
                throw e2;
            } catch (java.lang.Exception e3) {
                C44159sFm.OLrzqt(e3);
                throw e3;
            }
        }
        if (exc == null) {
            exc = new java.lang.Exception("Database Operation failed after 3 attempts");
        }
        C44159sFm.OLrzqt(exc);
        throw exc;
    }

    @Override // o.sGI
    public Flow<java.lang.Integer> AhwBna() throws java.lang.Exception {
        InHouseIMConversationDao inHouseIMConversationDaoAYXKKw = AYXKKw();
        Ref.LongRef longRef = new Ref.LongRef();
        java.lang.Exception exc = null;
        int i = 0;
        while (i < 3) {
            try {
                long jNanoTime = java.lang.System.nanoTime();
                Flow totalNumberOfConversationsWithUnreadCountFlow$default = InHouseIMConversationDao.Activity.getTotalNumberOfConversationsWithUnreadCountFlow$default(AYXKKw(), 0, null, 0, 7, null);
                long jValueOf = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                longRef.element = jValueOf;
                C44159sFm.EZpvd(inHouseIMConversationDaoAYXKKw, jValueOf);
                return new Dialog(FlowKt.distinctUntilChanged(totalNumberOfConversationsWithUnreadCountFlow$default));
            } catch (android.database.sqlite.SQLiteDatabaseLockedException e) {
                try {
                    C44159sFm.copydefault(e, exc);
                    i++;
                    exc = e;
                } finally {
                    C44159sFm.EZpvd(inHouseIMConversationDaoAYXKKw, longRef.element);
                }
            } catch (java.lang.IllegalStateException e2) {
                java.lang.String message = e2.getMessage();
                if (message != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                    C44159sFm.OLrzqt(e2);
                    throw e2;
                }
                C44159sFm.copydefault(e2);
                throw e2;
            } catch (java.lang.Exception e3) {
                C44159sFm.OLrzqt(e3);
                throw e3;
            }
        }
        if (exc == null) {
            exc = new java.lang.Exception("Database Operation failed after 3 attempts");
        }
        C44159sFm.OLrzqt(exc);
        throw exc;
    }

    @Override // o.sGI
    public Flow<java.lang.Integer> djBIcL() throws java.lang.Exception {
        InHouseIMConversationDao inHouseIMConversationDaoAYXKKw = AYXKKw();
        Ref.LongRef longRef = new Ref.LongRef();
        java.lang.Exception exc = null;
        int i = 0;
        while (i < 3) {
            try {
                long jNanoTime = java.lang.System.nanoTime();
                Flow totalNumberOfConversationsWithFlaggedCountFlow$default = InHouseIMConversationDao.Activity.getTotalNumberOfConversationsWithFlaggedCountFlow$default(AYXKKw(), null, 0, 3, null);
                long jValueOf = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                longRef.element = jValueOf;
                C44159sFm.EZpvd(inHouseIMConversationDaoAYXKKw, jValueOf);
                return new FragmentManager(FlowKt.distinctUntilChanged(totalNumberOfConversationsWithFlaggedCountFlow$default));
            } catch (android.database.sqlite.SQLiteDatabaseLockedException e) {
                try {
                    C44159sFm.copydefault(e, exc);
                    i++;
                    exc = e;
                } finally {
                    C44159sFm.EZpvd(inHouseIMConversationDaoAYXKKw, longRef.element);
                }
            } catch (java.lang.IllegalStateException e2) {
                java.lang.String message = e2.getMessage();
                if (message != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                    C44159sFm.OLrzqt(e2);
                    throw e2;
                }
                C44159sFm.copydefault(e2);
                throw e2;
            } catch (java.lang.Exception e3) {
                C44159sFm.OLrzqt(e3);
                throw e3;
            }
        }
        if (exc == null) {
            exc = new java.lang.Exception("Database Operation failed after 3 attempts");
        }
        C44159sFm.OLrzqt(exc);
        throw exc;
    }

    @Override // o.sGI
    public Flow<java.lang.Integer> AEQbTJ() throws java.lang.Exception {
        InHouseIMConversationDao inHouseIMConversationDaoAYXKKw = AYXKKw();
        Ref.LongRef longRef = new Ref.LongRef();
        java.lang.Exception exc = null;
        int i = 0;
        while (i < 3) {
            try {
                long jNanoTime = java.lang.System.nanoTime();
                Flow flaggedConversationsWithUnreadCountFlow$default = InHouseIMConversationDao.Activity.getFlaggedConversationsWithUnreadCountFlow$default(AYXKKw(), 0, null, 0, 7, null);
                long jValueOf = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                longRef.element = jValueOf;
                C44159sFm.EZpvd(inHouseIMConversationDaoAYXKKw, jValueOf);
                return new Application(FlowKt.distinctUntilChanged(flaggedConversationsWithUnreadCountFlow$default));
            } catch (android.database.sqlite.SQLiteDatabaseLockedException e) {
                try {
                    C44159sFm.copydefault(e, exc);
                    i++;
                    exc = e;
                } finally {
                    C44159sFm.EZpvd(inHouseIMConversationDaoAYXKKw, longRef.element);
                }
            } catch (java.lang.IllegalStateException e2) {
                java.lang.String message = e2.getMessage();
                if (message != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                    C44159sFm.OLrzqt(e2);
                    throw e2;
                }
                C44159sFm.copydefault(e2);
                throw e2;
            } catch (java.lang.Exception e3) {
                C44159sFm.OLrzqt(e3);
                throw e3;
            }
        }
        if (exc == null) {
            exc = new java.lang.Exception("Database Operation failed after 3 attempts");
        }
        C44159sFm.OLrzqt(exc);
        throw exc;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:54:0x0143 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v30, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v38, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0168: MOVE (r6 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:68:0x0168 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0169: MOVE (r7 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:68:0x0168 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0186 A[Catch: all -> 0x01bc, TRY_LEAVE, TryCatch #6 {all -> 0x01bc, blocks: (B:72:0x0179, B:74:0x0186), top: B:94:0x0179 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x01a9 -> B:77:0x01ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x01b4 -> B:77:0x01ac). Please report as a decompilation issue!!! */
    @Override // o.sGI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull ReceiveMessageOptionType receiveMessageOptionType, @NotNull Continuation<? super java.lang.Integer> continuation) throws java.lang.Exception {
        InHouseIMConversationManagerImpl$getTotalUnreadCount$1 inHouseIMConversationManagerImpl$getTotalUnreadCount$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDao2;
        sGK sgk;
        InHouseIMConversationManagerImpl$getTotalUnreadCount$1 inHouseIMConversationManagerImpl$getTotalUnreadCount$12;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        ReceiveMessageOptionType receiveMessageOptionType2;
        BaseDao baseDao3;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        sGK sgk2;
        ReceiveMessageOptionType receiveMessageOptionType3;
        BaseDao baseDao4;
        Ref.LongRef longRef4;
        Ref.ObjectRef objectRef2;
        int i3;
        int i4;
        ?? r0;
        int i5;
        int i6;
        ReceiveMessageOptionType receiveMessageOptionType4;
        Ref.ObjectRef objectRef3;
        int i7;
        sGK sgk3;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        long j;
        T t;
        sGK sgk4;
        if (continuation instanceof InHouseIMConversationManagerImpl$getTotalUnreadCount$1) {
            inHouseIMConversationManagerImpl$getTotalUnreadCount$1 = (InHouseIMConversationManagerImpl$getTotalUnreadCount$1) continuation;
            int i8 = inHouseIMConversationManagerImpl$getTotalUnreadCount$1.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                inHouseIMConversationManagerImpl$getTotalUnreadCount$1.label = i8 - Integer.MIN_VALUE;
            } else {
                inHouseIMConversationManagerImpl$getTotalUnreadCount$1 = new InHouseIMConversationManagerImpl$getTotalUnreadCount$1(this, continuation);
            }
        }
        java.lang.Object obj = inHouseIMConversationManagerImpl$getTotalUnreadCount$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i9 = inHouseIMConversationManagerImpl$getTotalUnreadCount$1.label;
        try {
            if (i9 != 0) {
                if (i9 == 1) {
                    j = inHouseIMConversationManagerImpl$getTotalUnreadCount$1.J$0;
                    i7 = inHouseIMConversationManagerImpl$getTotalUnreadCount$1.I$2;
                    i6 = inHouseIMConversationManagerImpl$getTotalUnreadCount$1.I$1;
                    i5 = inHouseIMConversationManagerImpl$getTotalUnreadCount$1.I$0;
                    objectRef5 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getTotalUnreadCount$1.L$7;
                    longRef3 = (Ref.LongRef) inHouseIMConversationManagerImpl$getTotalUnreadCount$1.L$6;
                    objectRef4 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getTotalUnreadCount$1.L$5;
                    objectRef3 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getTotalUnreadCount$1.L$4;
                    longRef2 = (Ref.LongRef) inHouseIMConversationManagerImpl$getTotalUnreadCount$1.L$3;
                    baseDao2 = (BaseDao) inHouseIMConversationManagerImpl$getTotalUnreadCount$1.L$2;
                    receiveMessageOptionType4 = (ReceiveMessageOptionType) inHouseIMConversationManagerImpl$getTotalUnreadCount$1.L$1;
                    sgk3 = (sGK) inHouseIMConversationManagerImpl$getTotalUnreadCount$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        t = obj;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        sgk2 = sgk3;
                        i4 = i7;
                        objectRef2 = objectRef3;
                        receiveMessageOptionType3 = receiveMessageOptionType4;
                        i2 = i6;
                        i3 = i5;
                        longRef4 = longRef2;
                        baseDao4 = baseDao2;
                        r0 = e3;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i4 >= i3 - 1) {
                        }
                        Ref.ObjectRef objectRef6 = objectRef2;
                        sgk = sgk2;
                        longRef3 = longRef4;
                        inHouseIMConversationManagerImpl$getTotalUnreadCount$12 = inHouseIMConversationManagerImpl$getTotalUnreadCount$1;
                        receiveMessageOptionType2 = receiveMessageOptionType3;
                        i = i3;
                        i2++;
                        baseDao3 = baseDao4;
                        objectRef = objectRef6;
                        if (i2 >= i) {
                        }
                    } catch (java.lang.IllegalStateException e4) {
                        e2 = e4;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e5) {
                        e = e5;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        throw th;
                    }
                    objectRef5.element = t;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                    T t2 = objectRef4.element;
                    C44159sFm.EZpvd(baseDao2, longRef2.element);
                    java.lang.Integer num = (java.lang.Integer) t2;
                    return C56443yFo.AEQbTJ(num == null ? num.intValue() : 0);
                }
                if (i9 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i10 = inHouseIMConversationManagerImpl$getTotalUnreadCount$1.I$1;
                i3 = inHouseIMConversationManagerImpl$getTotalUnreadCount$1.I$0;
                objectRef2 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getTotalUnreadCount$1.L$4;
                longRef4 = (Ref.LongRef) inHouseIMConversationManagerImpl$getTotalUnreadCount$1.L$3;
                baseDao4 = (BaseDao) inHouseIMConversationManagerImpl$getTotalUnreadCount$1.L$2;
                receiveMessageOptionType3 = (ReceiveMessageOptionType) inHouseIMConversationManagerImpl$getTotalUnreadCount$1.L$1;
                sgk2 = (sGK) inHouseIMConversationManagerImpl$getTotalUnreadCount$1.L$0;
                C56391yDq.AEQbTJ(obj);
                i2 = i10;
                Ref.ObjectRef objectRef62 = objectRef2;
                sgk = sgk2;
                longRef3 = longRef4;
                inHouseIMConversationManagerImpl$getTotalUnreadCount$12 = inHouseIMConversationManagerImpl$getTotalUnreadCount$1;
                receiveMessageOptionType2 = receiveMessageOptionType3;
                i = i3;
                i2++;
                baseDao3 = baseDao4;
                objectRef = objectRef62;
                if (i2 >= i) {
                    try {
                        try {
                        } catch (java.lang.IllegalStateException e6) {
                            e2 = e6;
                            message = e2.getMessage();
                            if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                                C44159sFm.OLrzqt(e2);
                                throw e2;
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e7) {
                            e = e7;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            baseDao2 = baseDao3;
                            longRef2 = longRef3;
                            C44159sFm.EZpvd(baseDao2, longRef2.element);
                            throw th;
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                        e = e8;
                        sgk4 = sgk;
                    }
                    Ref.ObjectRef objectRef7 = new Ref.ObjectRef();
                    long jNanoTime = java.lang.System.nanoTime();
                    InHouseIMConversationDao inHouseIMConversationDaoAYXKKw = sgk.AYXKKw();
                    int apiValue = receiveMessageOptionType2.getApiValue();
                    inHouseIMConversationManagerImpl$getTotalUnreadCount$12.L$0 = sgk;
                    inHouseIMConversationManagerImpl$getTotalUnreadCount$12.L$1 = receiveMessageOptionType2;
                    inHouseIMConversationManagerImpl$getTotalUnreadCount$12.L$2 = baseDao3;
                    inHouseIMConversationManagerImpl$getTotalUnreadCount$12.L$3 = longRef3;
                    inHouseIMConversationManagerImpl$getTotalUnreadCount$12.L$4 = objectRef;
                    inHouseIMConversationManagerImpl$getTotalUnreadCount$12.L$5 = objectRef7;
                    inHouseIMConversationManagerImpl$getTotalUnreadCount$12.L$6 = longRef3;
                    inHouseIMConversationManagerImpl$getTotalUnreadCount$12.L$7 = objectRef7;
                    inHouseIMConversationManagerImpl$getTotalUnreadCount$12.I$0 = i;
                    inHouseIMConversationManagerImpl$getTotalUnreadCount$12.I$1 = i2;
                    inHouseIMConversationManagerImpl$getTotalUnreadCount$12.I$2 = i2;
                    inHouseIMConversationManagerImpl$getTotalUnreadCount$12.J$0 = jNanoTime;
                    inHouseIMConversationManagerImpl$getTotalUnreadCount$12.label = 1;
                    sgk4 = sgk;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        try {
                            e = e9;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i4 >= i3 - 1) {
                                inHouseIMConversationManagerImpl$getTotalUnreadCount$1.L$0 = sgk2;
                                inHouseIMConversationManagerImpl$getTotalUnreadCount$1.L$1 = receiveMessageOptionType3;
                                inHouseIMConversationManagerImpl$getTotalUnreadCount$1.L$2 = baseDao4;
                                inHouseIMConversationManagerImpl$getTotalUnreadCount$1.L$3 = longRef4;
                                inHouseIMConversationManagerImpl$getTotalUnreadCount$1.L$4 = objectRef2;
                                inHouseIMConversationManagerImpl$getTotalUnreadCount$1.L$5 = null;
                                inHouseIMConversationManagerImpl$getTotalUnreadCount$1.L$6 = null;
                                inHouseIMConversationManagerImpl$getTotalUnreadCount$1.L$7 = null;
                                inHouseIMConversationManagerImpl$getTotalUnreadCount$1.I$0 = i3;
                                inHouseIMConversationManagerImpl$getTotalUnreadCount$1.I$1 = i2;
                                inHouseIMConversationManagerImpl$getTotalUnreadCount$1.label = 2;
                                if (DelayKt.delay(((long) (i4 + 1)) * 50, inHouseIMConversationManagerImpl$getTotalUnreadCount$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                            }
                            Ref.ObjectRef objectRef622 = objectRef2;
                            sgk = sgk2;
                            longRef3 = longRef4;
                            inHouseIMConversationManagerImpl$getTotalUnreadCount$12 = inHouseIMConversationManagerImpl$getTotalUnreadCount$1;
                            receiveMessageOptionType2 = receiveMessageOptionType3;
                            i = i3;
                            i2++;
                            baseDao3 = baseDao4;
                            objectRef = objectRef622;
                            if (i2 >= i) {
                            }
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            longRef3 = longRef4;
                            baseDao3 = baseDao4;
                            baseDao2 = baseDao3;
                            longRef2 = longRef3;
                            C44159sFm.EZpvd(baseDao2, longRef2.element);
                            throw th;
                        }
                        objectRef2 = objectRef;
                        i3 = i;
                        receiveMessageOptionType3 = receiveMessageOptionType2;
                        baseDao4 = baseDao3;
                        inHouseIMConversationManagerImpl$getTotalUnreadCount$1 = inHouseIMConversationManagerImpl$getTotalUnreadCount$12;
                        longRef4 = longRef3;
                        i4 = i2;
                        sgk2 = sgk4;
                        r0 = e;
                    }
                    java.lang.Object totalUnreadCount$default = InHouseIMConversationDao.Activity.getTotalUnreadCount$default(inHouseIMConversationDaoAYXKKw, apiValue, null, 0, inHouseIMConversationManagerImpl$getTotalUnreadCount$12, 6, null);
                    if (totalUnreadCount$default == objCopydefault) {
                        return objCopydefault;
                    }
                    receiveMessageOptionType4 = receiveMessageOptionType2;
                    baseDao2 = baseDao3;
                    inHouseIMConversationManagerImpl$getTotalUnreadCount$1 = inHouseIMConversationManagerImpl$getTotalUnreadCount$12;
                    objectRef3 = objectRef;
                    i5 = i;
                    longRef2 = longRef3;
                    i6 = i2;
                    sgk3 = sgk4;
                    j = jNanoTime;
                    objectRef5 = objectRef7;
                    objectRef4 = objectRef5;
                    t = totalUnreadCount$default;
                    i7 = i6;
                    objectRef5.element = t;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                    T t22 = objectRef4.element;
                    C44159sFm.EZpvd(baseDao2, longRef2.element);
                    java.lang.Integer num2 = (java.lang.Integer) t22;
                    return C56443yFo.AEQbTJ(num2 == null ? num2.intValue() : 0);
                }
                C44159sFm.EZpvd(baseDao3, longRef3.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            InHouseIMConversationDao inHouseIMConversationDaoAYXKKw2 = AYXKKw();
            sgk = this;
            inHouseIMConversationManagerImpl$getTotalUnreadCount$12 = inHouseIMConversationManagerImpl$getTotalUnreadCount$1;
            longRef3 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 3;
            i2 = 0;
            receiveMessageOptionType2 = receiveMessageOptionType;
            baseDao3 = inHouseIMConversationDaoAYXKKw2;
            if (i2 >= i) {
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            longRef2 = longRef;
            baseDao2 = baseDao;
        }
    }

    @Override // o.sGI
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, boolean z, boolean z2, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return KWHzl(new UpdateConversationReq(str, C56443yFo.AEQbTJ(z ? 1 : 0), (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, 252, (DefaultConstructorMarker) null), z2, continuation);
    }

    @Override // o.sGI
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, boolean z, boolean z2, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return KWHzl(new UpdateConversationReq(str, (java.lang.Integer) null, C56443yFo.AEQbTJ(z ? 1 : 0), (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, 250, (DefaultConstructorMarker) null), z2, continuation);
    }

    @Override // o.sGI
    public java.lang.Object copydefault(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        int apiValue;
        if (z) {
            apiValue = ReceiveMessageOptionType.RECEIVE_SILENTLY.getApiValue();
        } else {
            apiValue = ReceiveMessageOptionType.RECEIVE.getApiValue();
        }
        return sGI.TaskDescription.updateConversations$default(this, new UpdateConversationReq(str, (java.lang.Integer) null, (java.lang.Integer) null, C56443yFo.AEQbTJ(apiValue), (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, 246, (DefaultConstructorMarker) null), false, continuation, 2, null);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:160:0x041e */
    /* JADX DEBUG: Multi-variable search result rejected for r0v108, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v61, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v83, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v35, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v29, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0455: MOVE (r12 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:183:0x0455 */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0445 A[Catch: all -> 0x009e, TryCatch #26 {all -> 0x009e, blocks: (B:23:0x0096, B:75:0x0227, B:172:0x0437, B:173:0x043a, B:175:0x043f, B:177:0x0445, B:179:0x044d, B:180:0x0450, B:181:0x0451, B:182:0x0454), top: B:225:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0474 A[Catch: all -> 0x04be, TRY_LEAVE, TryCatch #14 {all -> 0x04be, blocks: (B:187:0x0467, B:189:0x0474), top: B:215:0x0467 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0294 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x01db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x025c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r0v118 */
    /* JADX WARN: Type inference failed for: r0v119 */
    /* JADX WARN: Type inference failed for: r0v120 */
    /* JADX WARN: Type inference failed for: r0v121 */
    /* JADX WARN: Type inference failed for: r0v122 */
    /* JADX WARN: Type inference failed for: r0v28, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v70, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v97, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r1v10, types: [T, kotlin.Unit] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x0317 -> B:108:0x031d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x0323 -> B:109:0x0321). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x03af -> B:139:0x03b5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:140:0x03b9 -> B:141:0x03c1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:192:0x049b -> B:193:0x04a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:194:0x04ad -> B:195:0x04b8). Please report as a decompilation issue!!! */
    @Override // o.sGI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object gEmmrt(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Exception {
        InHouseIMConversationManagerImpl$removeGroupFromConversationList$1 inHouseIMConversationManagerImpl$removeGroupFromConversationList$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        sGK sgk;
        InHouseIMConversationListData inHouseIMConversationListData;
        int i;
        java.lang.Object objUpdateConversations$default;
        sGK sgk2;
        boolean zBooleanValue;
        java.lang.String str2;
        boolean z;
        BaseDao baseDaoValues;
        boolean z2;
        sGK sgk3;
        int i2;
        java.lang.String str3;
        Ref.ObjectRef objectRef;
        int i3;
        long j;
        int i4;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Ref.LongRef longRef3;
        BaseDao baseDao2;
        java.lang.String str4;
        sGK sgk4;
        java.lang.Object obj;
        boolean z3;
        java.lang.String str5;
        Ref.ObjectRef objectRef4;
        java.lang.String str6;
        sGK sgk5;
        java.lang.Object obj2;
        InHouseIMConversationManagerImpl$removeGroupFromConversationList$1 inHouseIMConversationManagerImpl$removeGroupFromConversationList$12;
        Ref.ObjectRef objectRef5;
        int i5;
        int i6;
        Ref.LongRef longRef4;
        int i7;
        java.lang.String message;
        ?? r0;
        int i8;
        int i9;
        int i10;
        Ref.LongRef longRef5;
        sGK sgk6;
        Ref.ObjectRef objectRef6;
        Ref.ObjectRef objectRef7;
        Ref.LongRef longRef6;
        boolean z4;
        java.lang.String str7;
        sGK sgk7;
        int i11;
        int i12;
        BaseDao baseDao3;
        java.lang.String str8;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        int i13;
        int i14;
        sGK sgk8;
        int i15;
        Ref.ObjectRef objectRef8;
        Ref.LongRef longRef7;
        BaseDao baseDao4;
        sGK sgk9;
        boolean z5;
        int i16;
        int i17;
        Ref.ObjectRef objectRef9;
        Ref.LongRef longRef8;
        java.lang.Throwable th;
        ?? r02;
        int i18;
        int i19;
        boolean z6;
        java.lang.String str9 = str;
        if (continuation instanceof InHouseIMConversationManagerImpl$removeGroupFromConversationList$1) {
            inHouseIMConversationManagerImpl$removeGroupFromConversationList$1 = (InHouseIMConversationManagerImpl$removeGroupFromConversationList$1) continuation;
            int i20 = inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.label;
            if ((i20 & Integer.MIN_VALUE) != 0) {
                inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.label = i20 - Integer.MIN_VALUE;
            } else {
                inHouseIMConversationManagerImpl$removeGroupFromConversationList$1 = new InHouseIMConversationManagerImpl$removeGroupFromConversationList$1(this, continuation);
            }
        }
        java.lang.Object obj3 = inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        java.lang.String str10 = "not open";
        try {
            switch (inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.label) {
                case 0:
                    C56391yDq.AEQbTJ(obj3);
                    inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$0 = this;
                    inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$1 = str9;
                    inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.label = 1;
                    java.lang.Object objKWHzl = KWHzl(str9, true, (Continuation<? super InHouseIMConversationListData>) inHouseIMConversationManagerImpl$removeGroupFromConversationList$1);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                    sgk = this;
                    obj3 = objKWHzl;
                    inHouseIMConversationListData = (InHouseIMConversationListData) obj3;
                    if (inHouseIMConversationListData != null) {
                        java.lang.Integer inGroupStatus = inHouseIMConversationListData.getInGroupStatus();
                        int apiValue = InGroupStatus.IN_GROUP.getApiValue();
                        if (inGroupStatus != null && inGroupStatus.intValue() == apiValue) {
                            return C56443yFo.KWHzl(true);
                        }
                    }
                    UpdateConversationReq updateConversationReq = new UpdateConversationReq(str9, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, C56443yFo.AEQbTJ(InHouseIMConversationStatus.CONVERSATION_REMOVED.getStatus()), WebSocketProtocol.PAYLOAD_SHORT, (DefaultConstructorMarker) null);
                    inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$0 = sgk;
                    inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$1 = str9;
                    inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.label = 2;
                    i = 3;
                    objUpdateConversations$default = sGI.TaskDescription.updateConversations$default(sgk, updateConversationReq, false, inHouseIMConversationManagerImpl$removeGroupFromConversationList$1, 2, null);
                    if (objUpdateConversations$default != objCopydefault) {
                        return objCopydefault;
                    }
                    sgk2 = sgk;
                    zBooleanValue = ((java.lang.Boolean) objUpdateConversations$default).booleanValue();
                    if (zBooleanValue) {
                        java.util.Set<java.lang.String> setAEQbTJ = yED.AEQbTJ(str9);
                        inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$0 = sgk2;
                        inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$1 = str9;
                        inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.Z$0 = zBooleanValue;
                        inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.label = i;
                        if (sgk2.KWHzl(setAEQbTJ, inHouseIMConversationManagerImpl$removeGroupFromConversationList$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        str2 = str9;
                        z = zBooleanValue;
                        baseDaoValues = sgk2.values();
                        z2 = z;
                        sgk3 = sgk2;
                        longRef2 = new Ref.LongRef();
                        i2 = 0;
                        str3 = str2;
                        objectRef = new Ref.ObjectRef();
                        i3 = i;
                        if (i2 < i3) {
                            try {
                                try {
                                    try {
                                    } catch (java.lang.Exception e) {
                                        e = e;
                                        C44159sFm.OLrzqt(e);
                                        throw e;
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                        baseDao = baseDaoValues;
                                        C44159sFm.EZpvd(baseDao, longRef2.element);
                                        throw th;
                                    }
                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e2) {
                                    str8 = str10;
                                    obj2 = null;
                                    inHouseIMConversationManagerImpl$removeGroupFromConversationList$12 = inHouseIMConversationManagerImpl$removeGroupFromConversationList$1;
                                    sQLiteDatabaseLockedException = e2;
                                }
                                Ref.ObjectRef objectRef10 = new Ref.ObjectRef();
                                InHouseIMConversationManagerImpl$removeGroupFromConversationList$1 inHouseIMConversationManagerImpl$removeGroupFromConversationList$13 = inHouseIMConversationManagerImpl$removeGroupFromConversationList$1;
                                try {
                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                                    e = e3;
                                    str8 = str10;
                                    inHouseIMConversationManagerImpl$removeGroupFromConversationList$12 = inHouseIMConversationManagerImpl$removeGroupFromConversationList$13;
                                }
                                long jNanoTime = java.lang.System.nanoTime();
                                InHouseIMGroupInfoDao inHouseIMGroupInfoDaoValues = sgk3.values();
                                str8 = str10;
                                inHouseIMConversationManagerImpl$removeGroupFromConversationList$12 = inHouseIMConversationManagerImpl$removeGroupFromConversationList$13;
                                try {
                                    try {
                                    } catch (java.lang.IllegalStateException e4) {
                                        e = e4;
                                        obj = null;
                                        i7 = 2;
                                        str10 = str8;
                                        message = e.getMessage();
                                        if (message == null) {
                                        }
                                        C44159sFm.copydefault(e);
                                        throw e;
                                    }
                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e5) {
                                    try {
                                        e = e5;
                                        obj2 = null;
                                        sQLiteDatabaseLockedException = e;
                                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef4.element);
                                        objectRef4.element = r0;
                                        if (i4 < i3 - 1) {
                                            inHouseIMConversationManagerImpl$removeGroupFromConversationList$12.L$0 = sgk5;
                                            inHouseIMConversationManagerImpl$removeGroupFromConversationList$12.L$1 = str6;
                                            inHouseIMConversationManagerImpl$removeGroupFromConversationList$12.L$2 = baseDao;
                                            inHouseIMConversationManagerImpl$removeGroupFromConversationList$12.L$3 = longRef2;
                                            inHouseIMConversationManagerImpl$removeGroupFromConversationList$12.L$4 = objectRef4;
                                            inHouseIMConversationManagerImpl$removeGroupFromConversationList$12.L$5 = obj2;
                                            inHouseIMConversationManagerImpl$removeGroupFromConversationList$12.L$6 = obj2;
                                            inHouseIMConversationManagerImpl$removeGroupFromConversationList$12.L$7 = obj2;
                                            inHouseIMConversationManagerImpl$removeGroupFromConversationList$12.Z$0 = z3;
                                            inHouseIMConversationManagerImpl$removeGroupFromConversationList$12.I$0 = i3;
                                            inHouseIMConversationManagerImpl$removeGroupFromConversationList$12.I$1 = i2;
                                            inHouseIMConversationManagerImpl$removeGroupFromConversationList$12.label = 5;
                                            if (DelayKt.delay(((long) (i4 + 1)) * 50, inHouseIMConversationManagerImpl$removeGroupFromConversationList$12) == objCopydefault) {
                                                return objCopydefault;
                                            }
                                            i9 = i2;
                                            i10 = i3;
                                            longRef5 = longRef2;
                                            inHouseIMConversationManagerImpl$removeGroupFromConversationList$1 = inHouseIMConversationManagerImpl$removeGroupFromConversationList$12;
                                            str10 = str5;
                                            sgk6 = sgk5;
                                            objectRef6 = objectRef4;
                                            str3 = str6;
                                            i8 = 1;
                                            z2 = z3;
                                            baseDaoValues = baseDao;
                                            sgk3 = sgk6;
                                            longRef2 = longRef5;
                                            i3 = i10;
                                            objectRef = objectRef6;
                                            i2 = i9;
                                            i2 += i8;
                                            if (i2 < i3) {
                                            }
                                        } else {
                                            objectRef = objectRef4;
                                            str3 = str6;
                                            inHouseIMConversationManagerImpl$removeGroupFromConversationList$1 = inHouseIMConversationManagerImpl$removeGroupFromConversationList$12;
                                            str10 = str5;
                                            z2 = z3;
                                            baseDaoValues = baseDao;
                                            sgk3 = sgk5;
                                            i8 = 1;
                                            i2 += i8;
                                            if (i2 < i3) {
                                            }
                                        }
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                        C44159sFm.EZpvd(baseDao, longRef2.element);
                                        throw th;
                                    }
                                    str5 = str8;
                                    sgk5 = sgk3;
                                    baseDao = baseDaoValues;
                                    z3 = z2;
                                    str6 = str3;
                                    objectRef4 = objectRef;
                                    i4 = i2;
                                    r0 = sQLiteDatabaseLockedException;
                                }
                                inHouseIMConversationManagerImpl$removeGroupFromConversationList$12.L$0 = sgk3;
                                inHouseIMConversationManagerImpl$removeGroupFromConversationList$12.L$1 = str3;
                                inHouseIMConversationManagerImpl$removeGroupFromConversationList$12.L$2 = baseDaoValues;
                                inHouseIMConversationManagerImpl$removeGroupFromConversationList$12.L$3 = longRef2;
                                inHouseIMConversationManagerImpl$removeGroupFromConversationList$12.L$4 = objectRef;
                                inHouseIMConversationManagerImpl$removeGroupFromConversationList$12.L$5 = objectRef10;
                                inHouseIMConversationManagerImpl$removeGroupFromConversationList$12.L$6 = longRef2;
                                inHouseIMConversationManagerImpl$removeGroupFromConversationList$12.L$7 = objectRef10;
                                inHouseIMConversationManagerImpl$removeGroupFromConversationList$12.Z$0 = z2;
                                inHouseIMConversationManagerImpl$removeGroupFromConversationList$12.I$0 = i3;
                                inHouseIMConversationManagerImpl$removeGroupFromConversationList$12.I$1 = i2;
                                inHouseIMConversationManagerImpl$removeGroupFromConversationList$12.I$2 = i2;
                                inHouseIMConversationManagerImpl$removeGroupFromConversationList$12.J$0 = jNanoTime;
                                inHouseIMConversationManagerImpl$removeGroupFromConversationList$12.label = 4;
                                try {
                                    if (inHouseIMGroupInfoDaoValues.deleteGroupInfoById(str3, inHouseIMConversationManagerImpl$removeGroupFromConversationList$12) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                    objectRef5 = objectRef10;
                                    objectRef3 = objectRef;
                                    str4 = str3;
                                    i4 = i2;
                                    sgk4 = sgk3;
                                    objectRef2 = objectRef5;
                                    baseDao = baseDaoValues;
                                    j = jNanoTime;
                                    i6 = i3;
                                    longRef4 = longRef2;
                                    inHouseIMConversationManagerImpl$removeGroupFromConversationList$1 = inHouseIMConversationManagerImpl$removeGroupFromConversationList$12;
                                    str10 = str8;
                                    i5 = i4;
                                    try {
                                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e6) {
                                        obj2 = null;
                                        i2 = i5;
                                        longRef2 = longRef4;
                                        z3 = z2;
                                        str5 = str10;
                                        objectRef4 = objectRef3;
                                        str6 = str4;
                                        i3 = i6;
                                        inHouseIMConversationManagerImpl$removeGroupFromConversationList$12 = inHouseIMConversationManagerImpl$removeGroupFromConversationList$1;
                                        sgk5 = sgk4;
                                        r0 = e6;
                                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef4.element);
                                        objectRef4.element = r0;
                                        if (i4 < i3 - 1) {
                                        }
                                    } catch (java.lang.IllegalStateException e7) {
                                        e = e7;
                                        obj = null;
                                        longRef3 = longRef4;
                                        baseDao2 = baseDao;
                                        i7 = 2;
                                        message = e.getMessage();
                                        if (message == null) {
                                        }
                                        C44159sFm.copydefault(e);
                                        throw e;
                                    } catch (java.lang.Exception e8) {
                                        e = e8;
                                        C44159sFm.OLrzqt(e);
                                        throw e;
                                    }
                                    objectRef5.element = Unit.INSTANCE;
                                    longRef2.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                                    T t = objectRef2.element;
                                    C44159sFm.EZpvd(baseDao, longRef4.element);
                                    InHouseIMGroupMemberDao inHouseIMGroupMemberDaoIsConnected = sgk4.isConnected();
                                    Ref.LongRef longRef9 = new Ref.LongRef();
                                    objectRef7 = new Ref.ObjectRef();
                                    longRef6 = longRef9;
                                    z4 = z2;
                                    str7 = str4;
                                    sgk7 = sgk4;
                                    i11 = 0;
                                    i12 = 3;
                                    baseDao3 = inHouseIMGroupMemberDaoIsConnected;
                                    if (i11 < i12) {
                                        try {
                                            try {
                                                try {
                                                    break;
                                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                                                    C44159sFm.copydefault(e9, (java.lang.Exception) objectRef7.element);
                                                    objectRef7.element = e9;
                                                    if (i11 < i12 - 1) {
                                                        boolean z7 = z4;
                                                        inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$0 = sgk7;
                                                        inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$1 = str7;
                                                        inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$2 = baseDao3;
                                                        inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$3 = longRef6;
                                                        inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$4 = objectRef7;
                                                        sGK sgk10 = sgk7;
                                                        inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$5 = null;
                                                        inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$6 = null;
                                                        inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$7 = null;
                                                        inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.Z$0 = z7;
                                                        inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.I$0 = i12;
                                                        inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.I$1 = i11;
                                                        inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.label = 6;
                                                        if (DelayKt.delay(((long) (i11 + 1)) * 50, inHouseIMConversationManagerImpl$removeGroupFromConversationList$1) == objCopydefault) {
                                                            return objCopydefault;
                                                        }
                                                        z4 = z7;
                                                        i15 = i11;
                                                        i13 = i12;
                                                        sgk8 = sgk10;
                                                        objectRef8 = objectRef7;
                                                        objectRef7 = objectRef8;
                                                        i14 = 1;
                                                        i11 = i15;
                                                        i11 += i14;
                                                        sgk7 = sgk8;
                                                        i12 = i13;
                                                        if (i11 < i12) {
                                                        }
                                                    } else {
                                                        i13 = i12;
                                                        i14 = 1;
                                                        sgk8 = sgk7;
                                                        i11 += i14;
                                                        sgk7 = sgk8;
                                                        i12 = i13;
                                                        if (i11 < i12) {
                                                        }
                                                    }
                                                }
                                                long jNanoTime2 = java.lang.System.nanoTime();
                                                sgk7.isConnected().deleteGroupMemberList(str7);
                                                Unit unit = Unit.INSTANCE;
                                                long jValueOf = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime2, DurationUnit.NANOSECONDS));
                                                longRef6.element = jValueOf;
                                                C44159sFm.EZpvd(baseDao3, jValueOf);
                                                InHouseIMGroupSettingDao inHouseIMGroupSettingDaoFetchVPNInfo = sgk7.fetchVPNInfo();
                                                longRef7 = new Ref.LongRef();
                                                baseDao4 = inHouseIMGroupSettingDaoFetchVPNInfo;
                                                sgk9 = sgk7;
                                                z5 = z4;
                                                i16 = 0;
                                                i17 = 3;
                                                objectRef9 = new Ref.ObjectRef();
                                                if (i16 >= i17) {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                } catch (java.lang.IllegalStateException e10) {
                                                                    java.lang.String message2 = e10.getMessage();
                                                                    if (message2 != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message2, (java.lang.CharSequence) str10, false, 2, (java.lang.Object) null)) {
                                                                        C44159sFm.OLrzqt(e10);
                                                                        throw e10;
                                                                    }
                                                                    C44159sFm.copydefault(e10);
                                                                    throw e10;
                                                                }
                                                            } catch (java.lang.Exception e11) {
                                                                C44159sFm.OLrzqt(e11);
                                                                throw e11;
                                                            }
                                                        } catch (java.lang.Throwable th4) {
                                                            th = th4;
                                                            longRef8 = longRef7;
                                                            C44159sFm.EZpvd(baseDao4, longRef8.element);
                                                            throw th;
                                                        }
                                                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e12) {
                                                        r02 = e12;
                                                    }
                                                    long jNanoTime3 = java.lang.System.nanoTime();
                                                    try {
                                                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e13) {
                                                        r02 = e13;
                                                        C44159sFm.copydefault(r02, (java.lang.Exception) objectRef9.element);
                                                        objectRef9.element = r02;
                                                        if (i16 < i17 - 1) {
                                                            inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$0 = sgk9;
                                                            inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$1 = str7;
                                                            inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$2 = baseDao4;
                                                            inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$3 = longRef7;
                                                            inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$4 = objectRef9;
                                                            sGK sgk11 = sgk9;
                                                            inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$5 = null;
                                                            inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$6 = null;
                                                            inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$7 = null;
                                                            inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.Z$0 = z5;
                                                            inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.I$0 = i17;
                                                            inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.I$1 = i16;
                                                            inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.label = 7;
                                                            if (DelayKt.delay(((long) (i16 + 1)) * 50, inHouseIMConversationManagerImpl$removeGroupFromConversationList$1) == objCopydefault) {
                                                                return objCopydefault;
                                                            }
                                                            sgk9 = sgk11;
                                                            i18 = i16;
                                                            i19 = i17;
                                                            z6 = z5;
                                                            longRef8 = longRef7;
                                                            longRef7 = longRef8;
                                                            z5 = z6;
                                                            i16 = i18;
                                                            i17 = i19;
                                                            i16++;
                                                            if (i16 >= i17) {
                                                            }
                                                        } else {
                                                            i16++;
                                                            if (i16 >= i17) {
                                                            }
                                                        }
                                                    }
                                                    sgk9.fetchVPNInfo().deleteSettingInfoById(str7);
                                                    Unit unit2 = Unit.INSTANCE;
                                                    long jValueOf2 = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime3, DurationUnit.NANOSECONDS));
                                                    longRef7.element = jValueOf2;
                                                    C44159sFm.EZpvd(baseDao4, jValueOf2);
                                                    zBooleanValue = z5;
                                                } else {
                                                    C44159sFm.EZpvd(baseDao4, longRef7.element);
                                                    java.lang.Exception exc = (java.lang.Exception) objectRef9.element;
                                                    if (exc == null) {
                                                        exc = new java.lang.Exception("Database Operation failed after " + i17 + " attempts");
                                                    }
                                                    C44159sFm.OLrzqt(exc);
                                                    throw exc;
                                                }
                                            } catch (java.lang.IllegalStateException e14) {
                                                java.lang.String message3 = e14.getMessage();
                                                if (message3 != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message3, (java.lang.CharSequence) str10, false, 2, (java.lang.Object) null)) {
                                                    C44159sFm.OLrzqt(e14);
                                                    throw e14;
                                                }
                                                C44159sFm.copydefault(e14);
                                                throw e14;
                                            }
                                        } catch (java.lang.Exception e15) {
                                            C44159sFm.OLrzqt(e15);
                                            throw e15;
                                        }
                                    } else {
                                        C44159sFm.EZpvd(baseDao3, longRef6.element);
                                        java.lang.Exception exc2 = (java.lang.Exception) objectRef7.element;
                                        if (exc2 == null) {
                                            exc2 = new java.lang.Exception("Database Operation failed after " + i12 + " attempts");
                                        }
                                        C44159sFm.OLrzqt(exc2);
                                        throw exc2;
                                    }
                                } catch (java.lang.IllegalStateException e16) {
                                    e = e16;
                                    obj = null;
                                    str10 = str8;
                                    baseDao2 = baseDaoValues;
                                    longRef3 = longRef2;
                                    i7 = 2;
                                    message = e.getMessage();
                                    if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) str10, false, i7, obj)) {
                                        C44159sFm.OLrzqt(e);
                                        throw e;
                                    }
                                    C44159sFm.copydefault(e);
                                    throw e;
                                }
                            } catch (java.lang.IllegalStateException e17) {
                                e = e17;
                                str8 = str10;
                            }
                        } else {
                            C44159sFm.EZpvd(baseDaoValues, longRef2.element);
                            java.lang.Exception exc3 = (java.lang.Exception) objectRef.element;
                            if (exc3 == null) {
                                exc3 = new java.lang.Exception("Database Operation failed after " + i3 + " attempts");
                            }
                            C44159sFm.OLrzqt(exc3);
                            throw exc3;
                        }
                    }
                    return C56443yFo.KWHzl(zBooleanValue);
                case 1:
                    str9 = (java.lang.String) inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$1;
                    sGK sgk12 = (sGK) inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$0;
                    C56391yDq.AEQbTJ(obj3);
                    sgk = sgk12;
                    inHouseIMConversationListData = (InHouseIMConversationListData) obj3;
                    if (inHouseIMConversationListData != null) {
                    }
                    UpdateConversationReq updateConversationReq2 = new UpdateConversationReq(str9, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, C56443yFo.AEQbTJ(InHouseIMConversationStatus.CONVERSATION_REMOVED.getStatus()), WebSocketProtocol.PAYLOAD_SHORT, (DefaultConstructorMarker) null);
                    inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$0 = sgk;
                    inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$1 = str9;
                    inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.label = 2;
                    i = 3;
                    objUpdateConversations$default = sGI.TaskDescription.updateConversations$default(sgk, updateConversationReq2, false, inHouseIMConversationManagerImpl$removeGroupFromConversationList$1, 2, null);
                    if (objUpdateConversations$default != objCopydefault) {
                    }
                    break;
                case 2:
                    str9 = (java.lang.String) inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$1;
                    sGK sgk13 = (sGK) inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$0;
                    C56391yDq.AEQbTJ(obj3);
                    sgk2 = sgk13;
                    objUpdateConversations$default = obj3;
                    i = 3;
                    zBooleanValue = ((java.lang.Boolean) objUpdateConversations$default).booleanValue();
                    if (zBooleanValue) {
                    }
                    return C56443yFo.KWHzl(zBooleanValue);
                case 3:
                    z = inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.Z$0;
                    str2 = (java.lang.String) inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$1;
                    sgk2 = (sGK) inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$0;
                    C56391yDq.AEQbTJ(obj3);
                    i = 3;
                    baseDaoValues = sgk2.values();
                    z2 = z;
                    sgk3 = sgk2;
                    longRef2 = new Ref.LongRef();
                    i2 = 0;
                    str3 = str2;
                    objectRef = new Ref.ObjectRef();
                    i3 = i;
                    if (i2 < i3) {
                    }
                    break;
                case 4:
                    j = inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.J$0;
                    i4 = inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.I$2;
                    int i21 = inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.I$1;
                    int i22 = inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.I$0;
                    z2 = inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.Z$0;
                    Ref.ObjectRef objectRef11 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$7;
                    longRef2 = (Ref.LongRef) inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$6;
                    objectRef2 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$5;
                    objectRef3 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$4;
                    longRef3 = (Ref.LongRef) inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$3;
                    baseDao2 = (BaseDao) inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$2;
                    str4 = (java.lang.String) inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$1;
                    sgk4 = (sGK) inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj3);
                        objectRef5 = objectRef11;
                        i5 = i21;
                        i6 = i22;
                        longRef4 = longRef3;
                        baseDao = baseDao2;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e18) {
                        i2 = i21;
                        i3 = i22;
                        z3 = z2;
                        str5 = "not open";
                        objectRef4 = objectRef3;
                        longRef2 = longRef3;
                        baseDao = baseDao2;
                        str6 = str4;
                        sgk5 = sgk4;
                        obj2 = null;
                        inHouseIMConversationManagerImpl$removeGroupFromConversationList$12 = inHouseIMConversationManagerImpl$removeGroupFromConversationList$1;
                        r0 = e18;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef4.element);
                        objectRef4.element = r0;
                        if (i4 < i3 - 1) {
                        }
                    } catch (java.lang.IllegalStateException e19) {
                        e = e19;
                        obj = null;
                        i7 = 2;
                        message = e.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e);
                        throw e;
                    } catch (java.lang.Exception e20) {
                        e = e20;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        longRef2 = longRef3;
                        baseDao = baseDao2;
                        C44159sFm.EZpvd(baseDao, longRef2.element);
                        throw th;
                    }
                    objectRef5.element = Unit.INSTANCE;
                    longRef2.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                    T t2 = objectRef2.element;
                    C44159sFm.EZpvd(baseDao, longRef4.element);
                    InHouseIMGroupMemberDao inHouseIMGroupMemberDaoIsConnected2 = sgk4.isConnected();
                    Ref.LongRef longRef92 = new Ref.LongRef();
                    objectRef7 = new Ref.ObjectRef();
                    longRef6 = longRef92;
                    z4 = z2;
                    str7 = str4;
                    sgk7 = sgk4;
                    i11 = 0;
                    i12 = 3;
                    baseDao3 = inHouseIMGroupMemberDaoIsConnected2;
                    if (i11 < i12) {
                    }
                    break;
                case 5:
                    i9 = inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.I$1;
                    i10 = inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.I$0;
                    z3 = inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.Z$0;
                    objectRef6 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$4;
                    longRef5 = (Ref.LongRef) inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$3;
                    baseDao = (BaseDao) inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$2;
                    str6 = (java.lang.String) inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$1;
                    sgk6 = (sGK) inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$0;
                    C56391yDq.AEQbTJ(obj3);
                    str3 = str6;
                    i8 = 1;
                    z2 = z3;
                    baseDaoValues = baseDao;
                    sgk3 = sgk6;
                    longRef2 = longRef5;
                    i3 = i10;
                    objectRef = objectRef6;
                    i2 = i9;
                    i2 += i8;
                    if (i2 < i3) {
                    }
                    break;
                case 6:
                    i15 = inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.I$1;
                    i13 = inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.I$0;
                    z4 = inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.Z$0;
                    objectRef8 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$4;
                    longRef6 = (Ref.LongRef) inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$3;
                    baseDao3 = (BaseDao) inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$2;
                    str7 = (java.lang.String) inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$1;
                    sgk8 = (sGK) inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj3);
                        objectRef7 = objectRef8;
                        i14 = 1;
                        i11 = i15;
                        i11 += i14;
                        sgk7 = sgk8;
                        i12 = i13;
                        if (i11 < i12) {
                        }
                    } catch (java.lang.Throwable th6) {
                        C44159sFm.EZpvd(baseDao3, longRef6.element);
                        throw th6;
                    }
                    break;
                case 7:
                    i18 = inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.I$1;
                    i19 = inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.I$0;
                    z6 = inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.Z$0;
                    objectRef9 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$4;
                    longRef8 = (Ref.LongRef) inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$3;
                    baseDao4 = (BaseDao) inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$2;
                    str7 = (java.lang.String) inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$1;
                    sgk9 = (sGK) inHouseIMConversationManagerImpl$removeGroupFromConversationList$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj3);
                        longRef7 = longRef8;
                        z5 = z6;
                        i16 = i18;
                        i17 = i19;
                        i16++;
                        if (i16 >= i17) {
                        }
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        C44159sFm.EZpvd(baseDao4, longRef8.element);
                        throw th;
                    }
                    break;
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
            longRef2 = longRef;
        }
    }

    @Override // o.sGI
    public Flow<C44499sSb.Activity> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.AYXKKw.EZpvd(str);
    }

    @Override // o.sGI
    public Flow<C44499sSb.TaskDescription> EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.AYXKKw.OLrzqt(str);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:110:0x035f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:114:0x0363 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:164:0x043f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:35:0x0102 */
    /* JADX DEBUG: Type inference failed for r0v28. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v41. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v65. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v79. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r1v19. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r1v4. Raw type applied. Possible types: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0388 A[Catch: all -> 0x005a, TryCatch #28 {all -> 0x005a, blocks: (B:15:0x0054, B:71:0x0247, B:73:0x024d, B:75:0x0253, B:77:0x025c, B:79:0x0264, B:81:0x026d, B:83:0x0275, B:85:0x027e, B:87:0x0286, B:88:0x028a, B:90:0x0292, B:92:0x029b, B:94:0x02a3, B:96:0x02b5, B:100:0x032c, B:127:0x0382, B:129:0x0388, B:131:0x0392, B:132:0x0395, B:133:0x0396, B:134:0x0399, B:136:0x03a5, B:138:0x03b2, B:95:0x02af, B:91:0x0297, B:84:0x027a, B:80:0x0269, B:121:0x0375, B:122:0x0378), top: B:223:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03b2 A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #28 {all -> 0x005a, blocks: (B:15:0x0054, B:71:0x0247, B:73:0x024d, B:75:0x0253, B:77:0x025c, B:79:0x0264, B:81:0x026d, B:83:0x0275, B:85:0x027e, B:87:0x0286, B:88:0x028a, B:90:0x0292, B:92:0x029b, B:94:0x02a3, B:96:0x02b5, B:100:0x032c, B:127:0x0382, B:129:0x0388, B:131:0x0392, B:132:0x0395, B:133:0x0396, B:134:0x0399, B:136:0x03a5, B:138:0x03b2, B:95:0x02af, B:91:0x0297, B:84:0x027a, B:80:0x0269, B:121:0x0375, B:122:0x0378), top: B:223:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x045d A[Catch: all -> 0x0102, TryCatch #12 {all -> 0x0102, blocks: (B:33:0x00f2, B:174:0x0450, B:175:0x0453, B:178:0x0457, B:180:0x045d, B:182:0x0467, B:183:0x046a, B:184:0x046b, B:185:0x046e), top: B:213:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x048e A[Catch: all -> 0x04ca, TRY_LEAVE, TryCatch #19 {all -> 0x04ca, blocks: (B:190:0x0481, B:192:0x048e), top: B:215:0x0481 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0247 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v22, types: [T] */
    /* JADX WARN: Type inference failed for: r0v52, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r1v23, types: [T, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.okinc.okimcore.common.database.BaseDao] */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x03da -> B:142:0x03dd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:144:0x03e2 -> B:143:0x03de). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:193:0x04b1 -> B:195:0x04b4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:196:0x04bd -> B:195:0x04b4). Please report as a decompilation issue!!! */
    @Override // o.sGI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull UpdateConversationReq updateConversationReq, boolean z, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Exception {
        InHouseIMConversationManagerImpl$updateConversations$1 inHouseIMConversationManagerImpl$updateConversations$1;
        ?? r4;
        ?? r5;
        UpdateConversationReq updateConversationReq2;
        Ref.LongRef longRef;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        sGK sgk;
        InHouseIMConversationManagerImpl$updateConversations$1 inHouseIMConversationManagerImpl$updateConversations$12;
        BaseDao baseDao;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        BaseDao baseDao2;
        java.lang.String str;
        java.lang.String str2;
        sGK sgk2;
        UpdateConversationReq updateConversationReq3;
        BaseDao baseDao3;
        Ref.ObjectRef objectRef2;
        int i3;
        int i4;
        ?? r0;
        UpdateConversationReq updateConversationReq4;
        Ref.ObjectRef objectRef3;
        Ref.LongRef longRef2;
        Ref.ObjectRef objectRef4;
        int i5;
        BaseDao baseDao4;
        int i6;
        long j;
        Ref.ObjectRef objectRef5;
        ?? r02;
        InHouseIMConversationEntity inHouseIMConversationEntity;
        BaseDao baseDaoAYXKKw;
        Ref.LongRef longRef3;
        sGK sgk3;
        int i7;
        int i8;
        InHouseIMConversationEntity inHouseIMConversationEntity2;
        Ref.ObjectRef objectRef6;
        UpdateConversationReq updateConversationReq5;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        java.lang.Exception e3;
        BaseDao baseDao5;
        Ref.LongRef longRef4;
        java.lang.IllegalStateException e4;
        java.lang.String message2;
        java.lang.String str3;
        sGK sgk4;
        java.lang.String str4;
        UpdateConversationReq updateConversationReq6;
        InHouseIMConversationEntity inHouseIMConversationEntity3;
        int i9;
        Ref.ObjectRef objectRef7;
        int i10;
        int i11;
        ?? r03;
        InHouseIMConversationEntity inHouseIMConversationEntity4;
        UpdateConversationReq updateConversationReq7;
        Ref.ObjectRef objectRef8;
        java.lang.String str5;
        Ref.LongRef longRef5;
        int i12;
        Ref.ObjectRef objectRef9;
        int i13;
        sGK sgk5;
        long j2;
        Ref.ObjectRef objectRef10;
        java.lang.String str6;
        java.lang.String str7;
        long j3;
        java.lang.Long lastReadMsgSeq;
        Ref.LongRef longRef6;
        if (continuation instanceof InHouseIMConversationManagerImpl$updateConversations$1) {
            inHouseIMConversationManagerImpl$updateConversations$1 = (InHouseIMConversationManagerImpl$updateConversations$1) continuation;
            int i14 = inHouseIMConversationManagerImpl$updateConversations$1.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                inHouseIMConversationManagerImpl$updateConversations$1.label = i14 - Integer.MIN_VALUE;
            } else {
                inHouseIMConversationManagerImpl$updateConversations$1 = new InHouseIMConversationManagerImpl$updateConversations$1(this, continuation);
            }
        }
        java.lang.Object obj = inHouseIMConversationManagerImpl$updateConversations$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i15 = inHouseIMConversationManagerImpl$updateConversations$1.label;
        ?? r7 = 4;
        java.lang.String str8 = "not open";
        ?? r9 = 3;
        java.lang.String str9 = "Database Operation failed after ";
        java.lang.String str10 = " attempts";
        try {
            if (i15 == 0) {
                C56391yDq.AEQbTJ(obj);
                if (!C44157sFk.gEmmrt().values()) {
                    return C56443yFo.KWHzl(true);
                }
                if (z) {
                    updateConversationReq2 = updateConversationReq;
                } else {
                    updateConversationReq2 = updateConversationReq;
                    BuildersKt__Builders_commonKt.launch$default(this.KWHzl, null, null, new InHouseIMConversationManagerImpl$updateConversations$2(this, updateConversationReq2, null), 3, null);
                }
                if (!sQE.AEQbTJ(updateConversationReq)) {
                    InHouseIMConversationDao inHouseIMConversationDaoAYXKKw = AYXKKw();
                    longRef = new Ref.LongRef();
                    objectRef = new Ref.ObjectRef();
                    i = 0;
                    i2 = 3;
                    sgk = this;
                    inHouseIMConversationManagerImpl$updateConversations$12 = inHouseIMConversationManagerImpl$updateConversations$1;
                    baseDao = inHouseIMConversationDaoAYXKKw;
                    if (i < i2) {
                    }
                }
                return C56443yFo.KWHzl(true);
            }
            if (i15 == 1) {
                long j4 = inHouseIMConversationManagerImpl$updateConversations$1.J$0;
                int i16 = inHouseIMConversationManagerImpl$updateConversations$1.I$2;
                int i17 = inHouseIMConversationManagerImpl$updateConversations$1.I$1;
                int i18 = inHouseIMConversationManagerImpl$updateConversations$1.I$0;
                Ref.ObjectRef objectRef11 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$updateConversations$1.L$7;
                Ref.LongRef longRef7 = (Ref.LongRef) inHouseIMConversationManagerImpl$updateConversations$1.L$6;
                Ref.ObjectRef objectRef12 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$updateConversations$1.L$5;
                Ref.ObjectRef objectRef13 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$updateConversations$1.L$4;
                Ref.LongRef longRef8 = (Ref.LongRef) inHouseIMConversationManagerImpl$updateConversations$1.L$3;
                BaseDao baseDao6 = (BaseDao) inHouseIMConversationManagerImpl$updateConversations$1.L$2;
                UpdateConversationReq updateConversationReq8 = (UpdateConversationReq) inHouseIMConversationManagerImpl$updateConversations$1.L$1;
                sGK sgk6 = (sGK) inHouseIMConversationManagerImpl$updateConversations$1.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    objectRef5 = objectRef12;
                    longRef2 = longRef7;
                    longRef = longRef8;
                    updateConversationReq4 = updateConversationReq8;
                    sgk = sgk6;
                    baseDao4 = baseDao6;
                    j = j4;
                    str = " attempts";
                    objectRef3 = objectRef13;
                    objectRef4 = objectRef11;
                    str2 = "Database Operation failed after ";
                    i5 = i18;
                    i6 = i17;
                    i = i16;
                    r02 = obj;
                } catch (android.database.sqlite.SQLiteDatabaseLockedException e5) {
                    longRef = longRef8;
                    sgk2 = sgk6;
                    i4 = i17;
                    str = " attempts";
                    i = i16;
                    objectRef2 = objectRef13;
                    str2 = "Database Operation failed after ";
                    updateConversationReq3 = updateConversationReq8;
                    baseDao3 = baseDao6;
                    i3 = i18;
                    r0 = e5;
                    C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                    objectRef2.element = r0;
                    if (i < i3 - 1) {
                    }
                    InHouseIMConversationManagerImpl$updateConversations$1 inHouseIMConversationManagerImpl$updateConversations$13 = inHouseIMConversationManagerImpl$updateConversations$1;
                    baseDao = baseDao;
                    i2 = i3;
                    updateConversationReq2 = updateConversationReq3;
                    str9 = str2;
                    objectRef = objectRef2;
                    sgk = sgk2;
                    i = i4 + 1;
                    str10 = str;
                    inHouseIMConversationManagerImpl$updateConversations$12 = inHouseIMConversationManagerImpl$updateConversations$13;
                    if (i < i2) {
                    }
                } catch (java.lang.IllegalStateException e6) {
                    e2 = e6;
                    message = e2.getMessage();
                    if (message == null) {
                    }
                    C44159sFm.copydefault(e2);
                    throw e2;
                } catch (java.lang.Exception e7) {
                    e = e7;
                    C44159sFm.OLrzqt(e);
                    throw e;
                } catch (java.lang.Throwable th) {
                    th = th;
                    r4 = longRef8;
                    r5 = baseDao6;
                    C44159sFm.EZpvd(r5, r4.element);
                    throw th;
                }
                objectRef4.element = r02;
                longRef2.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                java.lang.Object obj2 = objectRef5.element;
                C44159sFm.EZpvd(baseDao4, longRef.element);
                inHouseIMConversationEntity = (InHouseIMConversationEntity) obj2;
                if (inHouseIMConversationEntity != null) {
                }
                return C56443yFo.KWHzl(true);
            }
            if (i15 == 2) {
                i4 = inHouseIMConversationManagerImpl$updateConversations$1.I$1;
                i3 = inHouseIMConversationManagerImpl$updateConversations$1.I$0;
                objectRef2 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$updateConversations$1.L$4;
                Ref.LongRef longRef9 = (Ref.LongRef) inHouseIMConversationManagerImpl$updateConversations$1.L$3;
                BaseDao baseDao7 = (BaseDao) inHouseIMConversationManagerImpl$updateConversations$1.L$2;
                UpdateConversationReq updateConversationReq9 = (UpdateConversationReq) inHouseIMConversationManagerImpl$updateConversations$1.L$1;
                sGK sgk7 = (sGK) inHouseIMConversationManagerImpl$updateConversations$1.L$0;
                C56391yDq.AEQbTJ(obj);
                sgk2 = sgk7;
                str2 = "Database Operation failed after ";
                str = " attempts";
                longRef = longRef9;
                updateConversationReq3 = updateConversationReq9;
                BaseDao baseDao8 = baseDao7;
                InHouseIMConversationManagerImpl$updateConversations$1 inHouseIMConversationManagerImpl$updateConversations$132 = inHouseIMConversationManagerImpl$updateConversations$1;
                baseDao = baseDao8;
                i2 = i3;
                updateConversationReq2 = updateConversationReq3;
                str9 = str2;
                objectRef = objectRef2;
                sgk = sgk2;
                i = i4 + 1;
                str10 = str;
                inHouseIMConversationManagerImpl$updateConversations$12 = inHouseIMConversationManagerImpl$updateConversations$132;
                if (i < i2) {
                    try {
                        try {
                        } catch (java.lang.IllegalStateException e8) {
                            e2 = e8;
                            message = e2.getMessage();
                            if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                                C44159sFm.OLrzqt(e2);
                                throw e2;
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e9) {
                            e = e9;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            baseDao2 = baseDao;
                            r4 = longRef;
                            r5 = baseDao2;
                            C44159sFm.EZpvd(r5, r4.element);
                            throw th;
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                        str = str10;
                        sQLiteDatabaseLockedException = e10;
                    }
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e11) {
                        e = e11;
                        str = str10;
                    }
                    Ref.ObjectRef objectRef14 = new Ref.ObjectRef();
                    long jNanoTime = java.lang.System.nanoTime();
                    InHouseIMConversationDao inHouseIMConversationDaoAYXKKw2 = sgk.AYXKKw();
                    str = str10;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e12) {
                        try {
                            e = e12;
                            sQLiteDatabaseLockedException = e;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i < i3 - 1) {
                                inHouseIMConversationManagerImpl$updateConversations$1.L$0 = sgk2;
                                inHouseIMConversationManagerImpl$updateConversations$1.L$1 = updateConversationReq3;
                                inHouseIMConversationManagerImpl$updateConversations$1.L$2 = baseDao3;
                                inHouseIMConversationManagerImpl$updateConversations$1.L$3 = longRef;
                                inHouseIMConversationManagerImpl$updateConversations$1.L$4 = objectRef2;
                                inHouseIMConversationManagerImpl$updateConversations$1.L$5 = null;
                                inHouseIMConversationManagerImpl$updateConversations$1.L$6 = null;
                                inHouseIMConversationManagerImpl$updateConversations$1.L$7 = null;
                                inHouseIMConversationManagerImpl$updateConversations$1.I$0 = i3;
                                inHouseIMConversationManagerImpl$updateConversations$1.I$1 = i4;
                                inHouseIMConversationManagerImpl$updateConversations$1.label = 2;
                                baseDao8 = baseDao3;
                                if (DelayKt.delay(((long) (i + 1)) * 50, inHouseIMConversationManagerImpl$updateConversations$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                            } else {
                                baseDao8 = baseDao3;
                            }
                            InHouseIMConversationManagerImpl$updateConversations$1 inHouseIMConversationManagerImpl$updateConversations$1322 = inHouseIMConversationManagerImpl$updateConversations$1;
                            baseDao = baseDao8;
                            i2 = i3;
                            updateConversationReq2 = updateConversationReq3;
                            str9 = str2;
                            objectRef = objectRef2;
                            sgk = sgk2;
                            i = i4 + 1;
                            str10 = str;
                            inHouseIMConversationManagerImpl$updateConversations$12 = inHouseIMConversationManagerImpl$updateConversations$1322;
                            if (i < i2) {
                            }
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            baseDao2 = baseDao3;
                            r4 = longRef;
                            r5 = baseDao2;
                            C44159sFm.EZpvd(r5, r4.element);
                            throw th;
                        }
                        sgk2 = sgk;
                        objectRef2 = objectRef;
                        str2 = str9;
                        updateConversationReq3 = updateConversationReq2;
                        i3 = i2;
                        baseDao3 = baseDao;
                        inHouseIMConversationManagerImpl$updateConversations$1 = inHouseIMConversationManagerImpl$updateConversations$12;
                        i4 = i;
                        r0 = sQLiteDatabaseLockedException;
                    }
                    java.lang.String channelId = updateConversationReq2.getChannelId();
                    inHouseIMConversationManagerImpl$updateConversations$12.L$0 = sgk;
                    inHouseIMConversationManagerImpl$updateConversations$12.L$1 = updateConversationReq2;
                    inHouseIMConversationManagerImpl$updateConversations$12.L$2 = baseDao;
                    inHouseIMConversationManagerImpl$updateConversations$12.L$3 = longRef;
                    inHouseIMConversationManagerImpl$updateConversations$12.L$4 = objectRef;
                    inHouseIMConversationManagerImpl$updateConversations$12.L$5 = objectRef14;
                    inHouseIMConversationManagerImpl$updateConversations$12.L$6 = longRef;
                    inHouseIMConversationManagerImpl$updateConversations$12.L$7 = objectRef14;
                    inHouseIMConversationManagerImpl$updateConversations$12.I$0 = i2;
                    inHouseIMConversationManagerImpl$updateConversations$12.I$1 = i;
                    inHouseIMConversationManagerImpl$updateConversations$12.I$2 = i;
                    inHouseIMConversationManagerImpl$updateConversations$12.J$0 = jNanoTime;
                    inHouseIMConversationManagerImpl$updateConversations$12.label = 1;
                    java.lang.Object conversationEntity = inHouseIMConversationDaoAYXKKw2.getConversationEntity(channelId, inHouseIMConversationManagerImpl$updateConversations$12);
                    if (conversationEntity == objCopydefault) {
                        return objCopydefault;
                    }
                    objectRef5 = objectRef14;
                    objectRef4 = objectRef5;
                    longRef2 = longRef;
                    objectRef3 = objectRef;
                    baseDao4 = baseDao;
                    inHouseIMConversationManagerImpl$updateConversations$1 = inHouseIMConversationManagerImpl$updateConversations$12;
                    str2 = str9;
                    i5 = i2;
                    i6 = i;
                    updateConversationReq4 = updateConversationReq2;
                    j = jNanoTime;
                    r02 = conversationEntity;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e13) {
                        sgk2 = sgk;
                        i4 = i6;
                        baseDao3 = baseDao4;
                        i3 = i5;
                        objectRef2 = objectRef3;
                        updateConversationReq3 = updateConversationReq4;
                        r0 = e13;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i < i3 - 1) {
                        }
                        InHouseIMConversationManagerImpl$updateConversations$1 inHouseIMConversationManagerImpl$updateConversations$13222 = inHouseIMConversationManagerImpl$updateConversations$1;
                        baseDao = baseDao8;
                        i2 = i3;
                        updateConversationReq2 = updateConversationReq3;
                        str9 = str2;
                        objectRef = objectRef2;
                        sgk = sgk2;
                        i = i4 + 1;
                        str10 = str;
                        inHouseIMConversationManagerImpl$updateConversations$12 = inHouseIMConversationManagerImpl$updateConversations$13222;
                        if (i < i2) {
                        }
                    } catch (java.lang.IllegalStateException e14) {
                        e2 = e14;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e15) {
                        e = e15;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        r9 = baseDao4;
                        r7 = longRef;
                        r4 = r7;
                        r5 = r9;
                        C44159sFm.EZpvd(r5, r4.element);
                        throw th;
                    }
                    objectRef4.element = r02;
                    longRef2.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                    java.lang.Object obj22 = objectRef5.element;
                    C44159sFm.EZpvd(baseDao4, longRef.element);
                    inHouseIMConversationEntity = (InHouseIMConversationEntity) obj22;
                    if (inHouseIMConversationEntity != null) {
                        baseDaoAYXKKw = sgk.AYXKKw();
                        longRef3 = new Ref.LongRef();
                        sgk3 = sgk;
                        str9 = str2;
                        str10 = str;
                        i7 = 0;
                        i8 = 3;
                        inHouseIMConversationEntity2 = inHouseIMConversationEntity;
                        objectRef6 = new Ref.ObjectRef();
                        updateConversationReq5 = updateConversationReq4;
                        if (i7 >= i8) {
                        }
                    }
                    return C56443yFo.KWHzl(true);
                }
                java.lang.String str11 = str10;
                C44159sFm.EZpvd(baseDao, longRef.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception(str9 + i2 + str11);
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            if (i15 == 3) {
                long j5 = inHouseIMConversationManagerImpl$updateConversations$1.J$0;
                int i19 = inHouseIMConversationManagerImpl$updateConversations$1.I$2;
                int i20 = inHouseIMConversationManagerImpl$updateConversations$1.I$1;
                int i21 = inHouseIMConversationManagerImpl$updateConversations$1.I$0;
                Ref.ObjectRef objectRef15 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$updateConversations$1.L$8;
                Ref.LongRef longRef10 = (Ref.LongRef) inHouseIMConversationManagerImpl$updateConversations$1.L$7;
                Ref.ObjectRef objectRef16 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$updateConversations$1.L$6;
                Ref.ObjectRef objectRef17 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$updateConversations$1.L$5;
                Ref.LongRef longRef11 = (Ref.LongRef) inHouseIMConversationManagerImpl$updateConversations$1.L$4;
                baseDao5 = (BaseDao) inHouseIMConversationManagerImpl$updateConversations$1.L$3;
                InHouseIMConversationEntity inHouseIMConversationEntity5 = (InHouseIMConversationEntity) inHouseIMConversationManagerImpl$updateConversations$1.L$2;
                updateConversationReq7 = (UpdateConversationReq) inHouseIMConversationManagerImpl$updateConversations$1.L$1;
                sGK sgk8 = (sGK) inHouseIMConversationManagerImpl$updateConversations$1.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    objectRef10 = objectRef15;
                    str3 = "Database Operation failed after ";
                    baseDaoAYXKKw = baseDao5;
                    str4 = "not open";
                    i9 = i19;
                    sgk5 = sgk8;
                    j2 = j5;
                    inHouseIMConversationEntity4 = inHouseIMConversationEntity5;
                    i13 = i20;
                    longRef3 = longRef11;
                    objectRef8 = objectRef17;
                    str5 = " attempts";
                    i12 = i21;
                    longRef5 = longRef10;
                    objectRef9 = objectRef16;
                } catch (android.database.sqlite.SQLiteDatabaseLockedException e16) {
                    sgk4 = sgk8;
                    baseDaoAYXKKw = baseDao5;
                    i11 = i20;
                    i10 = i21;
                    str3 = "Database Operation failed after ";
                    longRef3 = longRef11;
                    inHouseIMConversationEntity3 = inHouseIMConversationEntity5;
                    updateConversationReq6 = updateConversationReq7;
                    str4 = "not open";
                    i9 = i19;
                    objectRef7 = objectRef17;
                    r03 = e16;
                    C44159sFm.copydefault(r03, (java.lang.Exception) objectRef7.element);
                    objectRef7.element = r03;
                    if (i9 >= i10 - 1) {
                    }
                } catch (java.lang.IllegalStateException e17) {
                    e4 = e17;
                    longRef4 = longRef11;
                    message2 = e4.getMessage();
                    if (message2 == null) {
                    }
                    C44159sFm.copydefault(e4);
                    throw e4;
                } catch (java.lang.Exception e18) {
                    e3 = e18;
                    C44159sFm.OLrzqt(e3);
                    throw e3;
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    longRef6 = longRef11;
                }
                objectRef10.element = Unit.INSTANCE;
                longRef5.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j2, DurationUnit.NANOSECONDS));
                java.lang.Object obj3 = objectRef9.element;
                C44159sFm.EZpvd(baseDaoAYXKKw, longRef3.element);
                return C56443yFo.KWHzl(true);
            }
            if (i15 != 4) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = inHouseIMConversationManagerImpl$updateConversations$1.I$1;
            i10 = inHouseIMConversationManagerImpl$updateConversations$1.I$0;
            objectRef7 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$updateConversations$1.L$5;
            longRef3 = (Ref.LongRef) inHouseIMConversationManagerImpl$updateConversations$1.L$4;
            baseDaoAYXKKw = (BaseDao) inHouseIMConversationManagerImpl$updateConversations$1.L$3;
            inHouseIMConversationEntity3 = (InHouseIMConversationEntity) inHouseIMConversationManagerImpl$updateConversations$1.L$2;
            updateConversationReq6 = (UpdateConversationReq) inHouseIMConversationManagerImpl$updateConversations$1.L$1;
            sgk4 = (sGK) inHouseIMConversationManagerImpl$updateConversations$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                inHouseIMConversationEntity2 = inHouseIMConversationEntity3;
                i8 = i10;
                updateConversationReq5 = updateConversationReq6;
                int i22 = i11 + 1;
                objectRef6 = objectRef7;
                sgk3 = sgk4;
                i7 = i22;
                if (i7 >= i8) {
                    try {
                        try {
                            try {
                            } catch (java.lang.Exception e19) {
                                e3 = e19;
                                C44159sFm.OLrzqt(e3);
                                throw e3;
                            }
                        } catch (java.lang.IllegalStateException e20) {
                            e4 = e20;
                            str6 = str8;
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e21) {
                        e = e21;
                        str6 = str8;
                        str3 = str9;
                        str7 = str10;
                    }
                    objectRef10 = new Ref.ObjectRef();
                    java.lang.String str12 = str10;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e22) {
                        e = e22;
                        str6 = str8;
                    }
                    long jNanoTime2 = java.lang.System.nanoTime();
                    str6 = str8;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e23) {
                        e = e23;
                        str7 = str12;
                        str3 = str9;
                        str4 = str6;
                        str10 = str7;
                        sgk4 = sgk3;
                        updateConversationReq6 = updateConversationReq5;
                        i11 = i7;
                        i9 = i11;
                        i10 = i8;
                        objectRef7 = objectRef6;
                        inHouseIMConversationEntity3 = inHouseIMConversationEntity2;
                        r03 = e;
                        C44159sFm.copydefault(r03, (java.lang.Exception) objectRef7.element);
                        objectRef7.element = r03;
                        if (i9 >= i10 - 1) {
                            inHouseIMConversationManagerImpl$updateConversations$1.L$0 = sgk4;
                            inHouseIMConversationManagerImpl$updateConversations$1.L$1 = updateConversationReq6;
                            inHouseIMConversationManagerImpl$updateConversations$1.L$2 = inHouseIMConversationEntity3;
                            inHouseIMConversationManagerImpl$updateConversations$1.L$3 = baseDaoAYXKKw;
                            inHouseIMConversationManagerImpl$updateConversations$1.L$4 = longRef3;
                            inHouseIMConversationManagerImpl$updateConversations$1.L$5 = objectRef7;
                            inHouseIMConversationManagerImpl$updateConversations$1.L$6 = null;
                            inHouseIMConversationManagerImpl$updateConversations$1.L$7 = null;
                            inHouseIMConversationManagerImpl$updateConversations$1.L$8 = null;
                            inHouseIMConversationManagerImpl$updateConversations$1.I$0 = i10;
                            inHouseIMConversationManagerImpl$updateConversations$1.I$1 = i11;
                            inHouseIMConversationManagerImpl$updateConversations$1.label = 4;
                            if (DelayKt.delay(((long) (i9 + 1)) * 50, inHouseIMConversationManagerImpl$updateConversations$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            str8 = str4;
                            str9 = str3;
                            inHouseIMConversationEntity2 = inHouseIMConversationEntity3;
                            i8 = i10;
                            updateConversationReq5 = updateConversationReq6;
                            int i222 = i11 + 1;
                            objectRef6 = objectRef7;
                            sgk3 = sgk4;
                            i7 = i222;
                            if (i7 >= i8) {
                            }
                        } else {
                            inHouseIMConversationEntity2 = inHouseIMConversationEntity3;
                            str8 = str4;
                            str9 = str3;
                            i8 = i10;
                            updateConversationReq5 = updateConversationReq6;
                            int i2222 = i11 + 1;
                            objectRef6 = objectRef7;
                            sgk3 = sgk4;
                            i7 = i2222;
                            if (i7 >= i8) {
                            }
                        }
                    } catch (java.lang.IllegalStateException e24) {
                        e4 = e24;
                        str8 = str6;
                        longRef4 = longRef3;
                        baseDao5 = baseDaoAYXKKw;
                        message2 = e4.getMessage();
                        if (message2 == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message2, (java.lang.CharSequence) str8, false, 2, (java.lang.Object) null)) {
                            C44159sFm.OLrzqt(e4);
                            throw e4;
                        }
                        C44159sFm.copydefault(e4);
                        throw e4;
                    }
                    InHouseIMConversationDao inHouseIMConversationDaoAYXKKw3 = sgk3.AYXKKw();
                    str7 = str12;
                    str3 = str9;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e25) {
                        e = e25;
                        str4 = str6;
                        str10 = str7;
                        sgk4 = sgk3;
                        updateConversationReq6 = updateConversationReq5;
                        i11 = i7;
                        i9 = i11;
                        i10 = i8;
                        objectRef7 = objectRef6;
                        inHouseIMConversationEntity3 = inHouseIMConversationEntity2;
                        r03 = e;
                        C44159sFm.copydefault(r03, (java.lang.Exception) objectRef7.element);
                        objectRef7.element = r03;
                        if (i9 >= i10 - 1) {
                        }
                    } catch (java.lang.IllegalStateException e26) {
                        e4 = e26;
                        str8 = str6;
                        message2 = e4.getMessage();
                        if (message2 == null) {
                        }
                        C44159sFm.copydefault(e4);
                        throw e4;
                    }
                    InHouseIMConversationEntity[] inHouseIMConversationEntityArr = new InHouseIMConversationEntity[1];
                    java.lang.Integer pinnedStatus = updateConversationReq5.getPinnedStatus();
                    int iIntValue = pinnedStatus != null ? pinnedStatus.intValue() : inHouseIMConversationEntity2.getPinnedStatus();
                    java.lang.Integer numIsFlagged = updateConversationReq5.isFlagged();
                    int iIntValue2 = numIsFlagged != null ? numIsFlagged.intValue() : inHouseIMConversationEntity2.isFlagged();
                    java.lang.Integer receiveMsgOption = updateConversationReq5.getReceiveMsgOption();
                    if (receiveMsgOption == null) {
                        receiveMsgOption = inHouseIMConversationEntity2.getMuteStatus();
                    }
                    java.lang.Integer num = receiveMsgOption;
                    java.lang.Integer unreadCount = updateConversationReq5.getUnreadCount();
                    int iIntValue3 = unreadCount != null ? unreadCount.intValue() : inHouseIMConversationEntity2.getUnreadCount();
                    if (updateConversationReq5.getLastReadMsgSeq() != null) {
                        j3 = jNanoTime2;
                        lastReadMsgSeq = C56443yFo.KWHzl(r11.intValue());
                    } else {
                        j3 = jNanoTime2;
                        lastReadMsgSeq = inHouseIMConversationEntity2.getLastReadMsgSeq();
                    }
                    InHouseIMConversationEntity inHouseIMConversationEntity6 = inHouseIMConversationEntity2;
                    inHouseIMConversationEntityArr[0] = inHouseIMConversationEntity6.copy((536769023 & 1) != 0 ? inHouseIMConversationEntity6.channelId : null, (536769023 & 2) != 0 ? inHouseIMConversationEntity6.channelType : null, (536769023 & 4) != 0 ? inHouseIMConversationEntity6.groupAtType : 0, (536769023 & 8) != 0 ? inHouseIMConversationEntity6.inGroupStatus : null, (536769023 & 16) != 0 ? inHouseIMConversationEntity6.groupStatus : null, (536769023 & 32) != 0 ? inHouseIMConversationEntity6.pinnedStatus : iIntValue, (536769023 & 64) != 0 ? inHouseIMConversationEntity6.isFlagged : iIntValue2, (536769023 & 128) != 0 ? inHouseIMConversationEntity6.muteStatus : num, (536769023 & 256) != 0 ? inHouseIMConversationEntity6.role : 0, (536769023 & 512) != 0 ? inHouseIMConversationEntity6.unreadCount : iIntValue3, (536769023 & 1024) != 0 ? inHouseIMConversationEntity6.unreadMentionedCount : 0, (536769023 & 2048) != 0 ? inHouseIMConversationEntity6.unreadMentionedType : null, (536769023 & 4096) != 0 ? inHouseIMConversationEntity6.startMsgSeq : null, (536769023 & 8192) != 0 ? inHouseIMConversationEntity6.lastReadMsgSeq : lastReadMsgSeq, (536769023 & 16384) != 0 ? inHouseIMConversationEntity6.extra : null, (536769023 & 32768) != 0 ? inHouseIMConversationEntity6.lastUserMessageId : null, (536769023 & 65536) != 0 ? inHouseIMConversationEntity6.lastUserMessageSendTime : 0L, (536769023 & 131072) != 0 ? inHouseIMConversationEntity6.draftMessage : null, (262144 & 536769023) != 0 ? inHouseIMConversationEntity6.updateTime : null, (536769023 & 524288) != 0 ? inHouseIMConversationEntity6.conversationStatus : null, (536769023 & 1048576) != 0 ? inHouseIMConversationEntity6.relatedId : null, (536769023 & 2097152) != 0 ? inHouseIMConversationEntity6.avatar : null, (536769023 & 4194304) != 0 ? inHouseIMConversationEntity6.nickname : null, (536769023 & 8388608) != 0 ? inHouseIMConversationEntity6.enNickname : null, (536769023 & 16777216) != 0 ? inHouseIMConversationEntity6.bizGroupName : null, (536769023 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? inHouseIMConversationEntity6.tags : null, (536769023 & 67108864) != 0 ? inHouseIMConversationEntity6.groupType : null, (536769023 & 134217728) != 0 ? inHouseIMConversationEntity6.conversationIcons : null, (536769023 & 268435456) != 0 ? inHouseIMConversationEntity6.entityInfoExtra : null);
                    inHouseIMConversationManagerImpl$updateConversations$1.L$0 = sgk3;
                    inHouseIMConversationManagerImpl$updateConversations$1.L$1 = updateConversationReq5;
                    inHouseIMConversationManagerImpl$updateConversations$1.L$2 = inHouseIMConversationEntity2;
                    inHouseIMConversationManagerImpl$updateConversations$1.L$3 = baseDaoAYXKKw;
                    inHouseIMConversationManagerImpl$updateConversations$1.L$4 = longRef3;
                    inHouseIMConversationManagerImpl$updateConversations$1.L$5 = objectRef6;
                    inHouseIMConversationManagerImpl$updateConversations$1.L$6 = objectRef10;
                    inHouseIMConversationManagerImpl$updateConversations$1.L$7 = longRef3;
                    inHouseIMConversationManagerImpl$updateConversations$1.L$8 = objectRef10;
                    inHouseIMConversationManagerImpl$updateConversations$1.I$0 = i8;
                    inHouseIMConversationManagerImpl$updateConversations$1.I$1 = i7;
                    inHouseIMConversationManagerImpl$updateConversations$1.I$2 = i7;
                    long j6 = j3;
                    inHouseIMConversationManagerImpl$updateConversations$1.J$0 = j6;
                    inHouseIMConversationManagerImpl$updateConversations$1.label = 3;
                    if (inHouseIMConversationDaoAYXKKw3.insertOrReplace(inHouseIMConversationEntityArr, inHouseIMConversationManagerImpl$updateConversations$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    str4 = str6;
                    objectRef9 = objectRef10;
                    inHouseIMConversationEntity4 = inHouseIMConversationEntity2;
                    updateConversationReq7 = updateConversationReq5;
                    i9 = i7;
                    objectRef8 = objectRef6;
                    str5 = str7;
                    sgk5 = sgk3;
                    j2 = j6;
                    longRef5 = longRef3;
                    i12 = i8;
                    i13 = i9;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e27) {
                        sgk4 = sgk5;
                        i11 = i13;
                        i10 = i12;
                        str10 = str5;
                        objectRef7 = objectRef8;
                        updateConversationReq6 = updateConversationReq7;
                        inHouseIMConversationEntity3 = inHouseIMConversationEntity4;
                        r03 = e27;
                        C44159sFm.copydefault(r03, (java.lang.Exception) objectRef7.element);
                        objectRef7.element = r03;
                        if (i9 >= i10 - 1) {
                        }
                    } catch (java.lang.IllegalStateException e28) {
                        e4 = e28;
                        str8 = str4;
                        message2 = e4.getMessage();
                        if (message2 == null) {
                        }
                        C44159sFm.copydefault(e4);
                        throw e4;
                    }
                    objectRef10.element = Unit.INSTANCE;
                    longRef5.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j2, DurationUnit.NANOSECONDS));
                    java.lang.Object obj32 = objectRef9.element;
                    C44159sFm.EZpvd(baseDaoAYXKKw, longRef3.element);
                    return C56443yFo.KWHzl(true);
                }
                java.lang.String str13 = str9;
                java.lang.String str14 = str10;
                C44159sFm.EZpvd(baseDaoAYXKKw, longRef3.element);
                java.lang.Exception exc2 = (java.lang.Exception) objectRef6.element;
                if (exc2 == null) {
                    exc2 = new java.lang.Exception(str13 + i8 + str14);
                }
                C44159sFm.OLrzqt(exc2);
                throw exc2;
            } catch (java.lang.Throwable th6) {
                th = th6;
                longRef6 = longRef3;
                baseDao5 = baseDaoAYXKKw;
            }
            C44159sFm.EZpvd(baseDao5, longRef6.element);
            throw th;
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    /* JADX DEBUG: Duplicate block (B:74:0x01be) to fix multi-entry loop: BACK_EDGE: B:74:0x01be -> B:75:0x01c6 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v29, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0179: MOVE (r6 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:64:0x0179 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x017a: MOVE (r7 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:64:0x0179 */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0165 A[Catch: all -> 0x005c, TryCatch #13 {all -> 0x005c, blocks: (B:13:0x004a, B:37:0x011c, B:52:0x0158, B:53:0x015b, B:56:0x015f, B:58:0x0165, B:60:0x0171, B:61:0x0174, B:62:0x0175, B:63:0x0178), top: B:91:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0194 A[Catch: all -> 0x01cc, TRY_LEAVE, TryCatch #5 {all -> 0x01cc, blocks: (B:68:0x0187, B:70:0x0194), top: B:87:0x0187 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r1v11, types: [T, java.lang.Object, kotlin.Unit] */
    @Override // o.sGI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, DraftMessageModel draftMessageModel, @NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        InHouseIMConversationManagerImpl$saveDraftMessageModel$1 inHouseIMConversationManagerImpl$saveDraftMessageModel$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDao2;
        sGK sgk;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        DraftMessageModel draftMessageModel2;
        BaseDao baseDao3;
        InHouseIMConversationManagerImpl$saveDraftMessageModel$1 inHouseIMConversationManagerImpl$saveDraftMessageModel$12;
        java.lang.String str2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        sGK sgk2;
        Ref.LongRef longRef4;
        Ref.ObjectRef objectRef2;
        DraftMessageModel draftMessageModel3;
        BaseDao baseDao4;
        int i3;
        java.lang.String str3;
        ?? r0;
        InHouseIMConversationManagerImpl$saveDraftMessageModel$1 inHouseIMConversationManagerImpl$saveDraftMessageModel$13;
        Ref.ObjectRef objectRef3;
        int i4;
        BaseDao baseDao5;
        long jNanoTime;
        int i5;
        Ref.ObjectRef objectRef4;
        java.lang.String str4;
        sGK sgk3;
        Ref.ObjectRef objectRef5;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        if (continuation instanceof InHouseIMConversationManagerImpl$saveDraftMessageModel$1) {
            inHouseIMConversationManagerImpl$saveDraftMessageModel$1 = (InHouseIMConversationManagerImpl$saveDraftMessageModel$1) continuation;
            int i6 = inHouseIMConversationManagerImpl$saveDraftMessageModel$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                inHouseIMConversationManagerImpl$saveDraftMessageModel$1.label = i6 - Integer.MIN_VALUE;
            } else {
                inHouseIMConversationManagerImpl$saveDraftMessageModel$1 = new InHouseIMConversationManagerImpl$saveDraftMessageModel$1(this, continuation);
            }
        }
        java.lang.Object obj = inHouseIMConversationManagerImpl$saveDraftMessageModel$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i7 = inHouseIMConversationManagerImpl$saveDraftMessageModel$1.label;
        try {
            if (i7 != 0) {
                if (i7 == 1) {
                    jNanoTime = inHouseIMConversationManagerImpl$saveDraftMessageModel$1.J$0;
                    i3 = inHouseIMConversationManagerImpl$saveDraftMessageModel$1.I$2;
                    int i8 = inHouseIMConversationManagerImpl$saveDraftMessageModel$1.I$1;
                    i = inHouseIMConversationManagerImpl$saveDraftMessageModel$1.I$0;
                    Ref.ObjectRef objectRef6 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$saveDraftMessageModel$1.L$8;
                    longRef3 = (Ref.LongRef) inHouseIMConversationManagerImpl$saveDraftMessageModel$1.L$7;
                    objectRef3 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$saveDraftMessageModel$1.L$6;
                    objectRef4 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$saveDraftMessageModel$1.L$5;
                    longRef2 = (Ref.LongRef) inHouseIMConversationManagerImpl$saveDraftMessageModel$1.L$4;
                    baseDao2 = (BaseDao) inHouseIMConversationManagerImpl$saveDraftMessageModel$1.L$3;
                    draftMessageModel3 = (DraftMessageModel) inHouseIMConversationManagerImpl$saveDraftMessageModel$1.L$2;
                    java.lang.String str5 = (java.lang.String) inHouseIMConversationManagerImpl$saveDraftMessageModel$1.L$1;
                    sgk3 = (sGK) inHouseIMConversationManagerImpl$saveDraftMessageModel$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        objectRef5 = objectRef6;
                        i4 = i;
                        baseDao5 = baseDao2;
                        i2 = i3;
                        str4 = str5;
                        inHouseIMConversationManagerImpl$saveDraftMessageModel$13 = inHouseIMConversationManagerImpl$saveDraftMessageModel$1;
                        longRef4 = longRef2;
                        i5 = i8;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        sgk2 = sgk3;
                        objectRef2 = objectRef4;
                        baseDao4 = baseDao2;
                        i2 = i8;
                        str3 = str5;
                        longRef4 = longRef2;
                        r0 = e3;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i3 < i - 1) {
                        }
                        i2 += i;
                        baseDao3 = baseDao;
                        sgk = sgk2;
                        i = i;
                        if (i2 < i) {
                        }
                    } catch (java.lang.IllegalStateException e4) {
                        e2 = e4;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e5) {
                        e = e5;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        throw th;
                    }
                    ?? r1 = Unit.INSTANCE;
                    objectRef5.element = r1;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t = objectRef3.element;
                    C44159sFm.EZpvd(baseDao5, longRef4.element);
                    return r1;
                }
                if (i7 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i9 = inHouseIMConversationManagerImpl$saveDraftMessageModel$1.I$1;
                int i10 = inHouseIMConversationManagerImpl$saveDraftMessageModel$1.I$0;
                Ref.ObjectRef objectRef7 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$saveDraftMessageModel$1.L$5;
                Ref.LongRef longRef5 = (Ref.LongRef) inHouseIMConversationManagerImpl$saveDraftMessageModel$1.L$4;
                BaseDao baseDao6 = (BaseDao) inHouseIMConversationManagerImpl$saveDraftMessageModel$1.L$3;
                DraftMessageModel draftMessageModel4 = (DraftMessageModel) inHouseIMConversationManagerImpl$saveDraftMessageModel$1.L$2;
                java.lang.String str6 = (java.lang.String) inHouseIMConversationManagerImpl$saveDraftMessageModel$1.L$1;
                sgk2 = (sGK) inHouseIMConversationManagerImpl$saveDraftMessageModel$1.L$0;
                C56391yDq.AEQbTJ(obj);
                inHouseIMConversationManagerImpl$saveDraftMessageModel$12 = inHouseIMConversationManagerImpl$saveDraftMessageModel$1;
                i2 = i9;
                int i11 = i10;
                draftMessageModel2 = draftMessageModel4;
                str2 = str6;
                longRef3 = longRef5;
                int i12 = 1;
                objectRef = objectRef7;
                i2 += i12;
                baseDao3 = baseDao6;
                sgk = sgk2;
                i = i11;
                if (i2 < i) {
                    try {
                        try {
                        } catch (java.lang.IllegalStateException e6) {
                            e2 = e6;
                            message = e2.getMessage();
                            if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                                C44159sFm.OLrzqt(e2);
                                throw e2;
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e7) {
                            e = e7;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            baseDao2 = baseDao3;
                            longRef2 = longRef3;
                            C44159sFm.EZpvd(baseDao2, longRef2.element);
                            throw th;
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                        sgk2 = sgk;
                        objectRef2 = objectRef;
                        longRef4 = longRef3;
                        sQLiteDatabaseLockedException = e8;
                    }
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        try {
                            sgk2 = sgk;
                            objectRef2 = objectRef;
                            longRef4 = longRef3;
                            sQLiteDatabaseLockedException = e9;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i3 < i - 1) {
                                inHouseIMConversationManagerImpl$saveDraftMessageModel$1.L$0 = sgk2;
                                inHouseIMConversationManagerImpl$saveDraftMessageModel$1.L$1 = str3;
                                inHouseIMConversationManagerImpl$saveDraftMessageModel$1.L$2 = draftMessageModel3;
                                inHouseIMConversationManagerImpl$saveDraftMessageModel$1.L$3 = baseDao4;
                                inHouseIMConversationManagerImpl$saveDraftMessageModel$1.L$4 = longRef4;
                                inHouseIMConversationManagerImpl$saveDraftMessageModel$1.L$5 = objectRef2;
                                inHouseIMConversationManagerImpl$saveDraftMessageModel$1.L$6 = null;
                                inHouseIMConversationManagerImpl$saveDraftMessageModel$1.L$7 = null;
                                inHouseIMConversationManagerImpl$saveDraftMessageModel$1.L$8 = null;
                                inHouseIMConversationManagerImpl$saveDraftMessageModel$1.I$0 = i;
                                inHouseIMConversationManagerImpl$saveDraftMessageModel$1.I$1 = i2;
                                inHouseIMConversationManagerImpl$saveDraftMessageModel$1.label = 2;
                                if (DelayKt.delay(((long) (i3 + 1)) * 50, inHouseIMConversationManagerImpl$saveDraftMessageModel$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                                longRef3 = longRef4;
                                i11 = i;
                                baseDao6 = baseDao4;
                                inHouseIMConversationManagerImpl$saveDraftMessageModel$12 = inHouseIMConversationManagerImpl$saveDraftMessageModel$1;
                                str2 = str3;
                                draftMessageModel2 = draftMessageModel3;
                                objectRef = objectRef2;
                                i12 = 1;
                            } else {
                                longRef3 = longRef4;
                                i11 = i;
                                baseDao6 = baseDao4;
                                inHouseIMConversationManagerImpl$saveDraftMessageModel$12 = inHouseIMConversationManagerImpl$saveDraftMessageModel$1;
                                str2 = str3;
                                draftMessageModel2 = draftMessageModel3;
                                objectRef = objectRef2;
                                i12 = 1;
                            }
                            i2 += i12;
                            baseDao3 = baseDao6;
                            sgk = sgk2;
                            i = i11;
                            if (i2 < i) {
                            }
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            baseDao2 = baseDao4;
                            longRef2 = longRef4;
                            C44159sFm.EZpvd(baseDao2, longRef2.element);
                            throw th;
                        }
                        draftMessageModel3 = draftMessageModel2;
                        str3 = str2;
                        inHouseIMConversationManagerImpl$saveDraftMessageModel$1 = inHouseIMConversationManagerImpl$saveDraftMessageModel$12;
                        baseDao4 = baseDao3;
                        i3 = i2;
                        r0 = sQLiteDatabaseLockedException;
                    }
                    Ref.ObjectRef objectRef8 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    InHouseIMConversationDao inHouseIMConversationDaoAYXKKw = sgk.AYXKKw();
                    inHouseIMConversationManagerImpl$saveDraftMessageModel$12.L$0 = sgk;
                    inHouseIMConversationManagerImpl$saveDraftMessageModel$12.L$1 = str2;
                    inHouseIMConversationManagerImpl$saveDraftMessageModel$12.L$2 = draftMessageModel2;
                    inHouseIMConversationManagerImpl$saveDraftMessageModel$12.L$3 = baseDao3;
                    inHouseIMConversationManagerImpl$saveDraftMessageModel$12.L$4 = longRef3;
                    inHouseIMConversationManagerImpl$saveDraftMessageModel$12.L$5 = objectRef;
                    inHouseIMConversationManagerImpl$saveDraftMessageModel$12.L$6 = objectRef8;
                    inHouseIMConversationManagerImpl$saveDraftMessageModel$12.L$7 = longRef3;
                    inHouseIMConversationManagerImpl$saveDraftMessageModel$12.L$8 = objectRef8;
                    inHouseIMConversationManagerImpl$saveDraftMessageModel$12.I$0 = i;
                    inHouseIMConversationManagerImpl$saveDraftMessageModel$12.I$1 = i2;
                    inHouseIMConversationManagerImpl$saveDraftMessageModel$12.I$2 = i2;
                    inHouseIMConversationManagerImpl$saveDraftMessageModel$12.J$0 = jNanoTime;
                    inHouseIMConversationManagerImpl$saveDraftMessageModel$12.label = 1;
                    if (inHouseIMConversationDaoAYXKKw.updateDraftMessageModel(str2, draftMessageModel2, inHouseIMConversationManagerImpl$saveDraftMessageModel$12) == objCopydefault) {
                        return objCopydefault;
                    }
                    inHouseIMConversationManagerImpl$saveDraftMessageModel$13 = inHouseIMConversationManagerImpl$saveDraftMessageModel$12;
                    objectRef4 = objectRef;
                    objectRef5 = objectRef8;
                    objectRef3 = objectRef5;
                    longRef4 = longRef3;
                    draftMessageModel3 = draftMessageModel2;
                    sgk3 = sgk;
                    i5 = i2;
                    i4 = i;
                    baseDao5 = baseDao3;
                    str4 = str2;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                        inHouseIMConversationManagerImpl$saveDraftMessageModel$1 = inHouseIMConversationManagerImpl$saveDraftMessageModel$13;
                        sgk2 = sgk3;
                        str3 = str4;
                        objectRef2 = objectRef4;
                        i3 = i2;
                        baseDao4 = baseDao5;
                        i = i4;
                        i2 = i5;
                        r0 = e10;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i3 < i - 1) {
                        }
                        i2 += i12;
                        baseDao3 = baseDao6;
                        sgk = sgk2;
                        i = i11;
                        if (i2 < i) {
                        }
                    } catch (java.lang.IllegalStateException e11) {
                        e2 = e11;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e12) {
                        e = e12;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    }
                    ?? r12 = Unit.INSTANCE;
                    objectRef5.element = r12;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef3.element;
                    C44159sFm.EZpvd(baseDao5, longRef4.element);
                    return r12;
                }
                C44159sFm.EZpvd(baseDao3, longRef3.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            InHouseIMConversationDao inHouseIMConversationDaoAYXKKw2 = AYXKKw();
            sgk = this;
            longRef3 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 3;
            i2 = 0;
            draftMessageModel2 = draftMessageModel;
            baseDao3 = inHouseIMConversationDaoAYXKKw2;
            inHouseIMConversationManagerImpl$saveDraftMessageModel$12 = inHouseIMConversationManagerImpl$saveDraftMessageModel$1;
            str2 = str;
            if (i2 < i) {
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            longRef2 = longRef;
            baseDao2 = baseDao;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v26, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v38, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v39, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b A[Catch: all -> 0x004a, TryCatch #10 {all -> 0x004a, blocks: (B:13:0x0042, B:37:0x00ed, B:51:0x011e, B:52:0x0121, B:55:0x0125, B:57:0x012b, B:59:0x0137, B:60:0x013a, B:61:0x013b, B:62:0x013e), top: B:88:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0154 A[Catch: all -> 0x018a, TRY_LEAVE, TryCatch #9 {all -> 0x018a, blocks: (B:66:0x0147, B:68:0x0154), top: B:86:0x0147 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0177 -> B:72:0x0179). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x017e -> B:73:0x017c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object gEmmrt(Continuation<? super java.util.List<java.lang.String>> continuation) throws java.lang.Exception {
        InHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1 inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1;
        sGK sgk;
        BaseDao baseDao;
        Ref.LongRef longRef;
        Ref.ObjectRef objectRef;
        sGK sgk2;
        Ref.LongRef longRef2;
        int i;
        int i2;
        sGK sgk3;
        int i3;
        Ref.ObjectRef objectRef2;
        int i4;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        BaseDao baseDao2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        ?? r0;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.LongRef longRef3;
        long jNanoTime;
        int i5;
        int i6;
        T t;
        if (continuation instanceof InHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1) {
            inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1 = (InHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1) continuation;
            int i7 = inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.label = i7 - Integer.MIN_VALUE;
                sgk = this;
            } else {
                sgk = this;
                inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1 = new InHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1(sgk, continuation);
            }
        }
        java.lang.Object obj = inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    jNanoTime = inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.J$0;
                    i2 = inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.I$2;
                    i3 = inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.I$1;
                    int i9 = inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.I$0;
                    objectRef4 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.L$6;
                    longRef2 = (Ref.LongRef) inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.L$5;
                    objectRef3 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.L$4;
                    objectRef = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.L$3;
                    longRef = (Ref.LongRef) inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.L$2;
                    baseDao = (BaseDao) inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.L$1;
                    sgk2 = (sGK) inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        longRef3 = longRef;
                        i6 = i3;
                        baseDao2 = baseDao;
                        i5 = i9;
                        t = obj;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        objectRef2 = objectRef;
                        longRef2 = longRef;
                        sgk3 = sgk2;
                        i4 = i9;
                        sQLiteDatabaseLockedException = e3;
                        baseDao2 = baseDao;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i2 < i4 - 1) {
                        }
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    } catch (java.lang.IllegalStateException e4) {
                        e2 = e4;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e5) {
                        e = e5;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    }
                    objectRef4.element = t;
                    longRef2.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef3.element;
                    C44159sFm.EZpvd(baseDao2, longRef3.element);
                    return t2;
                }
                if (i8 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i10 = inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.I$1;
                i4 = inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.I$0;
                objectRef2 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.L$3;
                Ref.LongRef longRef4 = (Ref.LongRef) inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.L$2;
                baseDao2 = (BaseDao) inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.L$1;
                sgk3 = (sGK) inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objectRef = objectRef2;
                longRef2 = longRef4;
                i3 = i10;
                i2 = i3 + 1;
                baseDao = baseDao2;
                sgk2 = sgk3;
                i = i4;
                if (i2 >= i) {
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e6) {
                        try {
                            i3 = i2;
                            objectRef2 = objectRef;
                            sgk3 = sgk2;
                            i4 = i;
                            sQLiteDatabaseLockedException = e6;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i2 < i4 - 1) {
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            Ref.LongRef longRef5 = longRef2;
                            longRef = longRef5;
                            baseDao = baseDao2;
                            C44159sFm.EZpvd(baseDao, longRef.element);
                            throw th;
                        }
                        baseDao2 = baseDao;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    } catch (java.lang.IllegalStateException e7) {
                        e2 = e7;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e8) {
                        e = e8;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        longRef = longRef2;
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    }
                    objectRef4 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    InHouseIMConversationDao inHouseIMConversationDaoAYXKKw = sgk2.AYXKKw();
                    inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.L$0 = sgk2;
                    inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.L$1 = baseDao;
                    inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.L$2 = longRef2;
                    inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.L$3 = objectRef;
                    inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.L$4 = objectRef4;
                    inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.L$5 = longRef2;
                    inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.L$6 = objectRef4;
                    inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.I$0 = i;
                    inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.I$1 = i2;
                    inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.I$2 = i2;
                    inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.J$0 = jNanoTime;
                    inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.label = 1;
                    java.lang.Object allChannelIdsForSync$default = InHouseIMConversationDao.Activity.getAllChannelIdsForSync$default(inHouseIMConversationDaoAYXKKw, null, inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1, 1, null);
                    if (allChannelIdsForSync$default == objCopydefault) {
                        return objCopydefault;
                    }
                    i6 = i2;
                    objectRef3 = objectRef4;
                    longRef3 = longRef2;
                    int i11 = i;
                    baseDao2 = baseDao;
                    i5 = i11;
                    t = allChannelIdsForSync$default;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        objectRef2 = objectRef;
                        i4 = i5;
                        sgk3 = sgk2;
                        longRef2 = longRef3;
                        i3 = i6;
                        r0 = e9;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i2 < i4 - 1) {
                            inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.L$0 = sgk3;
                            inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.L$1 = baseDao2;
                            inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.L$2 = longRef2;
                            inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.L$3 = objectRef2;
                            inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.L$4 = null;
                            inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.L$5 = null;
                            inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.L$6 = null;
                            inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.I$0 = i4;
                            inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.I$1 = i3;
                            inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1.label = 2;
                            if (DelayKt.delay(((long) (i2 + 1)) * 50, inHouseIMConversationManagerImpl$getAllChannelIdsForSyncFromLocal$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            i10 = i3;
                            longRef4 = longRef2;
                            objectRef = objectRef2;
                            longRef2 = longRef4;
                            i3 = i10;
                            i2 = i3 + 1;
                            baseDao = baseDao2;
                            sgk2 = sgk3;
                            i = i4;
                            if (i2 >= i) {
                            }
                        } else {
                            objectRef = objectRef2;
                            i2 = i3 + 1;
                            baseDao = baseDao2;
                            sgk2 = sgk3;
                            i = i4;
                            if (i2 >= i) {
                            }
                        }
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    } catch (java.lang.IllegalStateException e10) {
                        e2 = e10;
                        message = e2.getMessage();
                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                            C44159sFm.OLrzqt(e2);
                            throw e2;
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e11) {
                        e = e11;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    }
                    objectRef4.element = t;
                    longRef2.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t22 = objectRef3.element;
                    C44159sFm.EZpvd(baseDao2, longRef3.element);
                    return t22;
                }
                C44159sFm.EZpvd(baseDao, longRef2.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            InHouseIMConversationDao inHouseIMConversationDaoAYXKKw2 = AYXKKw();
            Ref.LongRef longRef6 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            baseDao = inHouseIMConversationDaoAYXKKw2;
            sgk2 = sgk;
            longRef2 = longRef6;
            i = 3;
            i2 = 0;
            if (i2 >= i) {
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
    }

    @Override // o.sGI
    public Flow<java.util.List<java.lang.String>> OLrzqt() throws java.lang.Exception {
        InHouseIMConversationDao inHouseIMConversationDaoAYXKKw = AYXKKw();
        Ref.LongRef longRef = new Ref.LongRef();
        java.lang.Exception exc = null;
        int i = 0;
        while (i < 3) {
            try {
                try {
                    try {
                        long jNanoTime = java.lang.System.nanoTime();
                        Flow<java.util.List<java.lang.String>> allRelatedIdsFlow$default = InHouseIMConversationDao.Activity.getAllRelatedIdsFlow$default(AYXKKw(), 0, 1, null);
                        long jValueOf = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                        longRef.element = jValueOf;
                        C44159sFm.EZpvd(inHouseIMConversationDaoAYXKKw, jValueOf);
                        return allRelatedIdsFlow$default;
                    } catch (java.lang.Exception e) {
                        C44159sFm.OLrzqt(e);
                        throw e;
                    }
                } catch (android.database.sqlite.SQLiteDatabaseLockedException e2) {
                    try {
                        C44159sFm.copydefault(e2, exc);
                        i++;
                        exc = e2;
                    } finally {
                        C44159sFm.EZpvd(inHouseIMConversationDaoAYXKKw, longRef.element);
                    }
                }
            } catch (java.lang.IllegalStateException e3) {
                java.lang.String message = e3.getMessage();
                if (message != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                    C44159sFm.OLrzqt(e3);
                    throw e3;
                }
                C44159sFm.copydefault(e3);
                throw e3;
            }
        }
        if (exc == null) {
            exc = new java.lang.Exception("Database Operation failed after 3 attempts");
        }
        C44159sFm.OLrzqt(exc);
        throw exc;
    }

    @Override // o.sGI
    public Flow<java.lang.Integer> KWHzl(@NotNull ReceiveMessageOptionType receiveMessageOptionType, @NotNull java.util.List<? extends InHouseIMChannelType> list) {
        Intrinsics.checkNotNullParameter(receiveMessageOptionType, "");
        Intrinsics.checkNotNullParameter(list, "");
        InHouseIMConversationDao inHouseIMConversationDaoKWHzl = this.OLrzqt.copydefault().KWHzl();
        int apiValue = receiveMessageOptionType.getApiValue();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((InHouseIMChannelType) it.next()).getApiValue()));
        }
        return new Fragment(FlowKt.distinctUntilChanged(InHouseIMConversationDao.Activity.getTotalUnreadCountByChannelTypeFlow$default(inHouseIMConversationDaoKWHzl, apiValue, null, 0, arrayList, 6, null)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v26, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v38, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v39, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012a A[Catch: all -> 0x004a, TryCatch #10 {all -> 0x004a, blocks: (B:13:0x0042, B:37:0x00ec, B:51:0x011d, B:52:0x0120, B:55:0x0124, B:57:0x012a, B:59:0x0136, B:60:0x0139, B:61:0x013a, B:62:0x013d), top: B:88:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0153 A[Catch: all -> 0x0189, TRY_LEAVE, TryCatch #9 {all -> 0x0189, blocks: (B:66:0x0146, B:68:0x0153), top: B:86:0x0146 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0176 -> B:72:0x0178). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x017d -> B:73:0x017b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object djBIcL(Continuation<? super java.util.List<InHouseIMConversationSimpleInfoEntity>> continuation) throws java.lang.Exception {
        InHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1 inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1;
        sGK sgk;
        BaseDao baseDao;
        Ref.LongRef longRef;
        Ref.ObjectRef objectRef;
        sGK sgk2;
        Ref.LongRef longRef2;
        int i;
        int i2;
        sGK sgk3;
        int i3;
        Ref.ObjectRef objectRef2;
        int i4;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        BaseDao baseDao2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        ?? r0;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.LongRef longRef3;
        long jNanoTime;
        int i5;
        int i6;
        T t;
        if (continuation instanceof InHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1) {
            inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1 = (InHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1) continuation;
            int i7 = inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.label = i7 - Integer.MIN_VALUE;
                sgk = this;
            } else {
                sgk = this;
                inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1 = new InHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1(sgk, continuation);
            }
        }
        java.lang.Object obj = inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    jNanoTime = inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.J$0;
                    i2 = inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.I$2;
                    i3 = inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.I$1;
                    int i9 = inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.I$0;
                    objectRef4 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.L$6;
                    longRef2 = (Ref.LongRef) inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.L$5;
                    objectRef3 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.L$4;
                    objectRef = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.L$3;
                    longRef = (Ref.LongRef) inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.L$2;
                    baseDao = (BaseDao) inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.L$1;
                    sgk2 = (sGK) inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        longRef3 = longRef;
                        i6 = i3;
                        baseDao2 = baseDao;
                        i5 = i9;
                        t = obj;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        objectRef2 = objectRef;
                        longRef2 = longRef;
                        sgk3 = sgk2;
                        i4 = i9;
                        sQLiteDatabaseLockedException = e3;
                        baseDao2 = baseDao;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i2 < i4 - 1) {
                        }
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    } catch (java.lang.IllegalStateException e4) {
                        e2 = e4;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e5) {
                        e = e5;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    }
                    objectRef4.element = t;
                    longRef2.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef3.element;
                    C44159sFm.EZpvd(baseDao2, longRef3.element);
                    return t2;
                }
                if (i8 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i10 = inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.I$1;
                i4 = inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.I$0;
                objectRef2 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.L$3;
                Ref.LongRef longRef4 = (Ref.LongRef) inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.L$2;
                baseDao2 = (BaseDao) inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.L$1;
                sgk3 = (sGK) inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objectRef = objectRef2;
                longRef2 = longRef4;
                i3 = i10;
                i2 = i3 + 1;
                baseDao = baseDao2;
                sgk2 = sgk3;
                i = i4;
                if (i2 >= i) {
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e6) {
                        try {
                            i3 = i2;
                            objectRef2 = objectRef;
                            sgk3 = sgk2;
                            i4 = i;
                            sQLiteDatabaseLockedException = e6;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i2 < i4 - 1) {
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            Ref.LongRef longRef5 = longRef2;
                            longRef = longRef5;
                            baseDao = baseDao2;
                            C44159sFm.EZpvd(baseDao, longRef.element);
                            throw th;
                        }
                        baseDao2 = baseDao;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    } catch (java.lang.IllegalStateException e7) {
                        e2 = e7;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e8) {
                        e = e8;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        longRef = longRef2;
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    }
                    objectRef4 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    InHouseIMConversationSimpleInfoDao inHouseIMConversationSimpleInfoDaoValueOf = sgk2.valueOf();
                    inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.L$0 = sgk2;
                    inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.L$1 = baseDao;
                    inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.L$2 = longRef2;
                    inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.L$3 = objectRef;
                    inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.L$4 = objectRef4;
                    inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.L$5 = longRef2;
                    inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.L$6 = objectRef4;
                    inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.I$0 = i;
                    inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.I$1 = i2;
                    inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.I$2 = i2;
                    inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.J$0 = jNanoTime;
                    inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.label = 1;
                    java.lang.Object allSimpleConversationInfo = inHouseIMConversationSimpleInfoDaoValueOf.getAllSimpleConversationInfo(inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1);
                    if (allSimpleConversationInfo == objCopydefault) {
                        return objCopydefault;
                    }
                    i6 = i2;
                    objectRef3 = objectRef4;
                    longRef3 = longRef2;
                    int i11 = i;
                    baseDao2 = baseDao;
                    i5 = i11;
                    t = allSimpleConversationInfo;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        objectRef2 = objectRef;
                        i4 = i5;
                        sgk3 = sgk2;
                        longRef2 = longRef3;
                        i3 = i6;
                        r0 = e9;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i2 < i4 - 1) {
                            inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.L$0 = sgk3;
                            inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.L$1 = baseDao2;
                            inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.L$2 = longRef2;
                            inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.L$3 = objectRef2;
                            inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.L$4 = null;
                            inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.L$5 = null;
                            inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.L$6 = null;
                            inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.I$0 = i4;
                            inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.I$1 = i3;
                            inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1.label = 2;
                            if (DelayKt.delay(((long) (i2 + 1)) * 50, inHouseIMConversationManagerImpl$getAllSimpleConversationInfoFromLocal$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            i10 = i3;
                            longRef4 = longRef2;
                            objectRef = objectRef2;
                            longRef2 = longRef4;
                            i3 = i10;
                            i2 = i3 + 1;
                            baseDao = baseDao2;
                            sgk2 = sgk3;
                            i = i4;
                            if (i2 >= i) {
                            }
                        } else {
                            objectRef = objectRef2;
                            i2 = i3 + 1;
                            baseDao = baseDao2;
                            sgk2 = sgk3;
                            i = i4;
                            if (i2 >= i) {
                            }
                        }
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    } catch (java.lang.IllegalStateException e10) {
                        e2 = e10;
                        message = e2.getMessage();
                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                            C44159sFm.OLrzqt(e2);
                            throw e2;
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e11) {
                        e = e11;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    }
                    objectRef4.element = t;
                    longRef2.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t22 = objectRef3.element;
                    C44159sFm.EZpvd(baseDao2, longRef3.element);
                    return t22;
                }
                C44159sFm.EZpvd(baseDao, longRef2.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            InHouseIMConversationSimpleInfoDao inHouseIMConversationSimpleInfoDaoValueOf2 = valueOf();
            Ref.LongRef longRef6 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            baseDao = inHouseIMConversationSimpleInfoDaoValueOf2;
            sgk2 = sgk;
            longRef2 = longRef6;
            i = 3;
            i2 = 0;
            if (i2 >= i) {
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
    }

    /* JADX DEBUG: Duplicate block (B:72:0x0180) to fix multi-entry loop: BACK_EDGE: B:72:0x0180 -> B:73:0x0183 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v26, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v37, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v38, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0132 A[Catch: all -> 0x0050, TryCatch #1 {all -> 0x0050, blocks: (B:13:0x0042, B:37:0x00f4, B:51:0x0125, B:52:0x0128, B:55:0x012c, B:57:0x0132, B:59:0x013e, B:60:0x0141, B:61:0x0142, B:62:0x0145), top: B:84:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015b A[Catch: all -> 0x0189, TRY_LEAVE, TryCatch #6 {all -> 0x0189, blocks: (B:66:0x014e, B:68:0x015b), top: B:85:0x014e }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object valueOf(Continuation<? super java.util.List<java.lang.String>> continuation) throws java.lang.Exception {
        InHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1 inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1;
        sGK sgk;
        BaseDao baseDao;
        Ref.LongRef longRef;
        Ref.ObjectRef objectRef;
        sGK sgk2;
        Ref.LongRef longRef2;
        int i;
        int i2;
        sGK sgk3;
        int i3;
        Ref.ObjectRef objectRef2;
        int i4;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        BaseDao baseDao2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        ?? r0;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.LongRef longRef3;
        long jNanoTime;
        int i5;
        int i6;
        T t;
        if (continuation instanceof InHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1) {
            inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1 = (InHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1) continuation;
            int i7 = inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.label = i7 - Integer.MIN_VALUE;
                sgk = this;
            } else {
                sgk = this;
                inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1 = new InHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1(sgk, continuation);
            }
        }
        java.lang.Object obj = inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    jNanoTime = inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.J$0;
                    i2 = inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.I$2;
                    i3 = inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.I$1;
                    int i9 = inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.I$0;
                    objectRef4 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.L$6;
                    longRef2 = (Ref.LongRef) inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.L$5;
                    objectRef3 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.L$4;
                    objectRef = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.L$3;
                    longRef = (Ref.LongRef) inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.L$2;
                    baseDao = (BaseDao) inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.L$1;
                    sgk2 = (sGK) inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        longRef3 = longRef;
                        i6 = i3;
                        baseDao2 = baseDao;
                        i5 = i9;
                        t = obj;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        objectRef2 = objectRef;
                        longRef2 = longRef;
                        sgk3 = sgk2;
                        i4 = i9;
                        sQLiteDatabaseLockedException = e3;
                        baseDao2 = baseDao;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i2 < i4 - 1) {
                        }
                        i2 = i + i;
                        baseDao = baseDao2;
                        sgk2 = sgk3;
                        i = i4;
                        if (i2 < i) {
                        }
                    } catch (java.lang.IllegalStateException e4) {
                        e2 = e4;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e5) {
                        e = e5;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    }
                    objectRef4.element = t;
                    longRef2.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef3.element;
                    C44159sFm.EZpvd(baseDao2, longRef3.element);
                    return t2;
                }
                if (i8 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i10 = inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.I$1;
                i4 = inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.I$0;
                Ref.ObjectRef objectRef5 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.L$3;
                Ref.LongRef longRef4 = (Ref.LongRef) inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.L$2;
                baseDao2 = (BaseDao) inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.L$1;
                sgk3 = (sGK) inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.L$0;
                C56391yDq.AEQbTJ(obj);
                longRef2 = longRef4;
                objectRef = objectRef5;
                int i11 = 1;
                i2 = i10 + i11;
                baseDao = baseDao2;
                sgk2 = sgk3;
                i = i4;
                if (i2 < i) {
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e6) {
                        try {
                            i3 = i2;
                            objectRef2 = objectRef;
                            sgk3 = sgk2;
                            i4 = i;
                            sQLiteDatabaseLockedException = e6;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i2 < i4 - 1) {
                            }
                            i2 = i10 + i11;
                            baseDao = baseDao2;
                            sgk2 = sgk3;
                            i = i4;
                            if (i2 < i) {
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            Ref.LongRef longRef5 = longRef2;
                            longRef = longRef5;
                            baseDao = baseDao2;
                            C44159sFm.EZpvd(baseDao, longRef.element);
                            throw th;
                        }
                        baseDao2 = baseDao;
                        r0 = sQLiteDatabaseLockedException;
                    } catch (java.lang.IllegalStateException e7) {
                        e2 = e7;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e8) {
                        e = e8;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        longRef = longRef2;
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    }
                    objectRef4 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    InHouseIMConversationDao inHouseIMConversationDaoAYXKKw = sgk2.AYXKKw();
                    inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.L$0 = sgk2;
                    inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.L$1 = baseDao;
                    inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.L$2 = longRef2;
                    inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.L$3 = objectRef;
                    inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.L$4 = objectRef4;
                    inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.L$5 = longRef2;
                    inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.L$6 = objectRef4;
                    inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.I$0 = i;
                    inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.I$1 = i2;
                    inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.I$2 = i2;
                    inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.J$0 = jNanoTime;
                    inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.label = 1;
                    java.lang.Object allOKAssistantChannelIds$default = InHouseIMConversationDao.Activity.getAllOKAssistantChannelIds$default(inHouseIMConversationDaoAYXKKw, 0, inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1, 1, null);
                    if (allOKAssistantChannelIds$default == objCopydefault) {
                        return objCopydefault;
                    }
                    i6 = i2;
                    objectRef3 = objectRef4;
                    longRef3 = longRef2;
                    int i12 = i;
                    baseDao2 = baseDao;
                    i5 = i12;
                    t = allOKAssistantChannelIds$default;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        objectRef2 = objectRef;
                        i4 = i5;
                        sgk3 = sgk2;
                        longRef2 = longRef3;
                        i3 = i6;
                        r0 = e9;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i2 < i4 - 1) {
                            inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.L$0 = sgk3;
                            inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.L$1 = baseDao2;
                            inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.L$2 = longRef2;
                            inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.L$3 = objectRef2;
                            inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.L$4 = null;
                            inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.L$5 = null;
                            inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.L$6 = null;
                            inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.I$0 = i4;
                            inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.I$1 = i3;
                            inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1.label = 2;
                            if (DelayKt.delay(((long) (i2 + 1)) * 50, inHouseIMConversationManagerImpl$getAllOKAssistantChannelIds$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            objectRef = objectRef2;
                            i10 = i3;
                            i11 = 1;
                        } else {
                            objectRef = objectRef2;
                            i10 = i3;
                            i11 = 1;
                        }
                        i2 = i10 + i11;
                        baseDao = baseDao2;
                        sgk2 = sgk3;
                        i = i4;
                        if (i2 < i) {
                        }
                    } catch (java.lang.IllegalStateException e10) {
                        e2 = e10;
                        message = e2.getMessage();
                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                            C44159sFm.OLrzqt(e2);
                            throw e2;
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e11) {
                        e = e11;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    }
                    objectRef4.element = t;
                    longRef2.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t22 = objectRef3.element;
                    C44159sFm.EZpvd(baseDao2, longRef3.element);
                    return t22;
                }
                C44159sFm.EZpvd(baseDao, longRef2.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            InHouseIMConversationDao inHouseIMConversationDaoAYXKKw2 = AYXKKw();
            Ref.LongRef longRef6 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            baseDao = inHouseIMConversationDaoAYXKKw2;
            sgk2 = sgk;
            longRef2 = longRef6;
            i = 3;
            i2 = 0;
            if (i2 < i) {
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.util.Set<java.lang.String> set, java.util.Set<java.lang.String> set2, Continuation<? super java.util.Set<java.lang.String>> continuation) throws java.lang.Throwable {
        InHouseIMConversationManagerImpl$removeServerDeletedConversations$1 inHouseIMConversationManagerImpl$removeServerDeletedConversations$1;
        if (continuation instanceof InHouseIMConversationManagerImpl$removeServerDeletedConversations$1) {
            inHouseIMConversationManagerImpl$removeServerDeletedConversations$1 = (InHouseIMConversationManagerImpl$removeServerDeletedConversations$1) continuation;
            int i = inHouseIMConversationManagerImpl$removeServerDeletedConversations$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMConversationManagerImpl$removeServerDeletedConversations$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMConversationManagerImpl$removeServerDeletedConversations$1 = new InHouseIMConversationManagerImpl$removeServerDeletedConversations$1(this, continuation);
            }
        }
        java.lang.Object obj = inHouseIMConversationManagerImpl$removeServerDeletedConversations$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMConversationManagerImpl$removeServerDeletedConversations$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.util.Set set3 = (java.util.Set) inHouseIMConversationManagerImpl$removeServerDeletedConversations$1.L$0;
            C56391yDq.AEQbTJ(obj);
            return set3;
        }
        C56391yDq.AEQbTJ(obj);
        java.util.Set<java.lang.String> setAYXKKw = CollectionsKt___CollectionsKt.AYXKKw((java.lang.Iterable) yEJ.EZpvd((java.util.Set) set2, (java.lang.Iterable) sGJ.copydefault.EZpvd()), (java.lang.Iterable) set);
        if (!(!setAYXKKw.isEmpty())) {
            return setAYXKKw;
        }
        inHouseIMConversationManagerImpl$removeServerDeletedConversations$1.L$0 = setAYXKKw;
        inHouseIMConversationManagerImpl$removeServerDeletedConversations$1.label = 1;
        return KWHzl(setAYXKKw, inHouseIMConversationManagerImpl$removeServerDeletedConversations$1) == objCopydefault ? objCopydefault : setAYXKKw;
    }

    /* JADX DEBUG: Duplicate block (B:160:0x03c5) to fix multi-entry loop: BACK_EDGE: B:160:0x03c5 -> B:161:0x03cc */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:126:0x0343 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:35:0x00f9 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:75:0x0266 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:83:0x0280 */
    /* JADX DEBUG: Type inference failed for r0v30. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v44. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v58. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v70. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r13v5. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r4v4. Raw type applied. Possible types: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x02a3: MOVE (r2 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:97:0x02a2 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02c1 A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #24 {all -> 0x0057, blocks: (B:15:0x0052, B:101:0x02b4, B:103:0x02c1, B:87:0x0286, B:88:0x0289, B:89:0x028a, B:91:0x0290, B:93:0x029a, B:94:0x029d, B:95:0x029e, B:96:0x02a1), top: B:173:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0365 A[Catch: all -> 0x00f9, TryCatch #9 {all -> 0x00f9, blocks: (B:33:0x00e8, B:137:0x0358, B:138:0x035b, B:141:0x035f, B:143:0x0365, B:145:0x036f, B:146:0x0372, B:147:0x0373, B:148:0x0376), top: B:173:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0397 A[Catch: all -> 0x03d3, TRY_LEAVE, TryCatch #23 {all -> 0x03d3, blocks: (B:154:0x038a, B:156:0x0397), top: B:186:0x038a }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x020d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0195 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v53, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v12, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.Object, kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v2, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r1v10, types: [T, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r1v21, types: [T, java.lang.Object, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.okinc.okimcore.common.database.BaseDao] */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v8, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x02e8 -> B:107:0x02ea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x02ef -> B:109:0x02f1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(java.util.Set<java.lang.String> set, Continuation<? super Unit> continuation) throws java.lang.Exception {
        InHouseIMConversationManagerImpl$clearConversationInLocal$1 inHouseIMConversationManagerImpl$clearConversationInLocal$1;
        ?? longRef;
        BaseDao baseDao;
        BaseDao baseDao2;
        Ref.LongRef longRef2;
        ?? r2;
        java.util.Set<java.lang.String> set2;
        sGK sgk;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        InHouseIMConversationManagerImpl$clearConversationInLocal$1 inHouseIMConversationManagerImpl$clearConversationInLocal$12;
        BaseDao baseDao3;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        java.lang.String str;
        sGK sgk2;
        java.lang.String str2;
        BaseDao baseDao4;
        int i3;
        int i4;
        ?? r0;
        InHouseIMConversationManagerImpl$clearConversationInLocal$1 inHouseIMConversationManagerImpl$clearConversationInLocal$13;
        Ref.ObjectRef objectRef2;
        int i5;
        Ref.ObjectRef objectRef3;
        Ref.LongRef longRef4;
        int i6;
        int i7;
        long j;
        java.util.Set<java.lang.String> set3;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        int i8;
        int i9;
        java.util.Set<java.lang.String> set4;
        java.lang.String str3;
        java.lang.Exception e3;
        java.lang.IllegalStateException e4;
        java.lang.String message2;
        sGK sgk3;
        BaseDao baseDao5;
        java.util.Set<java.lang.String> set5;
        ?? r8;
        Ref.ObjectRef objectRef6;
        int i10;
        int i11;
        int i12;
        ?? r02;
        InHouseIMConversationManagerImpl$clearConversationInLocal$1 inHouseIMConversationManagerImpl$clearConversationInLocal$14;
        Ref.ObjectRef objectRef7;
        int i13;
        java.lang.String str4;
        ?? r14;
        long jNanoTime;
        Ref.ObjectRef objectRef8;
        int i14;
        ?? r5;
        Ref.ObjectRef objectRef9;
        java.lang.String str5;
        if (continuation instanceof InHouseIMConversationManagerImpl$clearConversationInLocal$1) {
            inHouseIMConversationManagerImpl$clearConversationInLocal$1 = (InHouseIMConversationManagerImpl$clearConversationInLocal$1) continuation;
            int i15 = inHouseIMConversationManagerImpl$clearConversationInLocal$1.label;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                inHouseIMConversationManagerImpl$clearConversationInLocal$1.label = i15 - Integer.MIN_VALUE;
            } else {
                inHouseIMConversationManagerImpl$clearConversationInLocal$1 = new InHouseIMConversationManagerImpl$clearConversationInLocal$1(this, continuation);
            }
        }
        java.lang.Object obj = inHouseIMConversationManagerImpl$clearConversationInLocal$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i16 = inHouseIMConversationManagerImpl$clearConversationInLocal$1.label;
        ?? r82 = 4;
        java.lang.String str6 = "Database Operation failed after ";
        java.lang.String str7 = " attempts";
        try {
            try {
                if (i16 == 0) {
                    C56391yDq.AEQbTJ(obj);
                    C44124sEe.imLogConversation$default("start clearConversationInLocal...", null, 2, null);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("delete conversations: ");
                    set2 = set;
                    sb.append(set2);
                    C44124sEe.imLogConversation$default(sb.toString(), null, 2, null);
                    InHouseIMConversationSimpleInfoDao inHouseIMConversationSimpleInfoDaoValueOf = valueOf();
                    sgk = this;
                    longRef3 = new Ref.LongRef();
                    objectRef = new Ref.ObjectRef();
                    i = 0;
                    i2 = 3;
                    inHouseIMConversationManagerImpl$clearConversationInLocal$12 = inHouseIMConversationManagerImpl$clearConversationInLocal$1;
                    baseDao3 = inHouseIMConversationSimpleInfoDaoValueOf;
                    if (i < i2) {
                    }
                } else if (i16 == 1) {
                    j = inHouseIMConversationManagerImpl$clearConversationInLocal$1.J$0;
                    int i17 = inHouseIMConversationManagerImpl$clearConversationInLocal$1.I$2;
                    i3 = inHouseIMConversationManagerImpl$clearConversationInLocal$1.I$1;
                    i2 = inHouseIMConversationManagerImpl$clearConversationInLocal$1.I$0;
                    Ref.ObjectRef objectRef10 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$7;
                    Ref.LongRef longRef5 = (Ref.LongRef) inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$6;
                    Ref.ObjectRef objectRef11 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$5;
                    objectRef = (Ref.ObjectRef) inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$4;
                    longRef2 = (Ref.LongRef) inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$3;
                    i5 = i17;
                    BaseDao baseDao6 = (BaseDao) inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$2;
                    java.util.Set<java.lang.String> set6 = (java.util.Set) inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$1;
                    sGK sgk4 = (sGK) inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        objectRef4 = objectRef10;
                        i6 = i2;
                        i7 = i3;
                        sgk = sgk4;
                        set3 = set6;
                        objectRef2 = objectRef;
                        objectRef3 = objectRef11;
                        str = " attempts";
                        longRef4 = longRef5;
                        str2 = "Database Operation failed after ";
                        baseDao4 = baseDao6;
                        inHouseIMConversationManagerImpl$clearConversationInLocal$13 = inHouseIMConversationManagerImpl$clearConversationInLocal$1;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e5) {
                        str2 = "Database Operation failed after ";
                        str = " attempts";
                        set2 = set6;
                        baseDao4 = baseDao6;
                        sgk2 = sgk4;
                        i4 = i5;
                        r0 = e5;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                        objectRef.element = r0;
                        if (i4 < i2 - 1) {
                        }
                        inHouseIMConversationManagerImpl$clearConversationInLocal$12 = inHouseIMConversationManagerImpl$clearConversationInLocal$1;
                        i = i3 + i;
                        sgk = sgk;
                        longRef3 = longRef2;
                        if (i < i2) {
                        }
                    } catch (java.lang.IllegalStateException e6) {
                        e2 = e6;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e7) {
                        e = e7;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        r2 = baseDao6;
                        C44159sFm.EZpvd(r2, longRef2.element);
                        throw th;
                    }
                    objectRef4.element = Unit.INSTANCE;
                    longRef4.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                    java.lang.Object obj2 = objectRef3.element;
                    C44159sFm.EZpvd(baseDao4, longRef2.element);
                    InHouseIMConversationDao inHouseIMConversationDaoAYXKKw = sgk.AYXKKw();
                    longRef = new Ref.LongRef();
                    objectRef5 = new Ref.ObjectRef();
                    str6 = str2;
                    str7 = str;
                    i8 = 0;
                    i9 = 3;
                    inHouseIMConversationManagerImpl$clearConversationInLocal$1 = inHouseIMConversationManagerImpl$clearConversationInLocal$13;
                    set4 = set3;
                    baseDao2 = inHouseIMConversationDaoAYXKKw;
                    if (i8 < i9) {
                    }
                } else {
                    if (i16 != 2) {
                        if (i16 == 3) {
                            long j2 = inHouseIMConversationManagerImpl$clearConversationInLocal$1.J$0;
                            int i18 = inHouseIMConversationManagerImpl$clearConversationInLocal$1.I$2;
                            i14 = inHouseIMConversationManagerImpl$clearConversationInLocal$1.I$1;
                            i9 = inHouseIMConversationManagerImpl$clearConversationInLocal$1.I$0;
                            objectRef8 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$7;
                            Ref.LongRef longRef6 = (Ref.LongRef) inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$6;
                            Ref.ObjectRef objectRef12 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$5;
                            Ref.ObjectRef objectRef13 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$4;
                            Ref.LongRef longRef7 = (Ref.LongRef) inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$3;
                            BaseDao baseDao7 = (BaseDao) inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$2;
                            java.util.Set<java.lang.String> set7 = (java.util.Set) inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$1;
                            sGK sgk5 = (sGK) inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$0;
                            try {
                                C56391yDq.AEQbTJ(obj);
                                objectRef9 = objectRef12;
                                r14 = longRef7;
                                inHouseIMConversationManagerImpl$clearConversationInLocal$14 = inHouseIMConversationManagerImpl$clearConversationInLocal$1;
                                sgk = sgk5;
                                baseDao2 = baseDao7;
                                i13 = i18;
                                str4 = " attempts";
                                jNanoTime = j2;
                                r5 = longRef6;
                                set4 = set7;
                                objectRef7 = objectRef13;
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                                sgk3 = sgk5;
                                i12 = i18;
                                i11 = i14;
                                i10 = i9;
                                objectRef6 = objectRef13;
                                baseDao5 = baseDao7;
                                set5 = set7;
                                r8 = longRef7;
                                r02 = e8;
                                C44159sFm.copydefault(r02, (java.lang.Exception) objectRef6.element);
                                objectRef6.element = r02;
                                if (i12 < i10 - 1) {
                                }
                            } catch (java.lang.IllegalStateException e9) {
                                e4 = e9;
                                message2 = e4.getMessage();
                                if (message2 == null) {
                                }
                                C44159sFm.copydefault(e4);
                                throw e4;
                            } catch (java.lang.Exception e10) {
                                e3 = e10;
                                C44159sFm.OLrzqt(e3);
                                throw e3;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                longRef = longRef7;
                                baseDao2 = baseDao7;
                                C44159sFm.EZpvd(baseDao2, longRef.element);
                                throw th;
                            }
                            ?? r1 = Unit.INSTANCE;
                            objectRef8.element = r1;
                            r5.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                            java.lang.Object obj3 = objectRef9.element;
                            C44159sFm.EZpvd(baseDao2, r14.element);
                            return r1;
                        }
                        if (i16 != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i11 = inHouseIMConversationManagerImpl$clearConversationInLocal$1.I$1;
                        i10 = inHouseIMConversationManagerImpl$clearConversationInLocal$1.I$0;
                        objectRef6 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$4;
                        Ref.LongRef longRef8 = (Ref.LongRef) inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$3;
                        baseDao5 = (BaseDao) inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$2;
                        set5 = (java.util.Set) inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$1;
                        sgk3 = (sGK) inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$0;
                        C56391yDq.AEQbTJ(obj);
                        ?? r83 = longRef8;
                        ?? r84 = r83;
                        objectRef5 = objectRef6;
                        sgk = sgk3;
                        longRef = r84;
                        int i19 = i11 + 1;
                        set4 = set5;
                        baseDao2 = baseDao5;
                        i9 = i10;
                        i8 = i19;
                        if (i8 < i9) {
                            try {
                                try {
                                } catch (java.lang.IllegalStateException e11) {
                                    e4 = e11;
                                    message2 = e4.getMessage();
                                    if (message2 == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message2, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                                        C44159sFm.OLrzqt(e4);
                                        throw e4;
                                    }
                                    C44159sFm.copydefault(e4);
                                    throw e4;
                                } catch (java.lang.Exception e12) {
                                    e3 = e12;
                                    C44159sFm.OLrzqt(e3);
                                    throw e3;
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    C44159sFm.EZpvd(baseDao2, longRef.element);
                                    throw th;
                                }
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e13) {
                                e = e13;
                                i13 = i8;
                                str5 = str7;
                            }
                            objectRef8 = new Ref.ObjectRef();
                            str5 = str7;
                            try {
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e14) {
                                e = e14;
                                i13 = i8;
                            }
                            jNanoTime = java.lang.System.nanoTime();
                            InHouseIMConversationDao inHouseIMConversationDaoAYXKKw2 = sgk.AYXKKw();
                            inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$0 = sgk;
                            inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$1 = set4;
                            inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$2 = baseDao2;
                            inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$3 = longRef;
                            inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$4 = objectRef5;
                            inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$5 = objectRef8;
                            inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$6 = longRef;
                            inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$7 = objectRef8;
                            inHouseIMConversationManagerImpl$clearConversationInLocal$1.I$0 = i9;
                            inHouseIMConversationManagerImpl$clearConversationInLocal$1.I$1 = i8;
                            inHouseIMConversationManagerImpl$clearConversationInLocal$1.I$2 = i8;
                            inHouseIMConversationManagerImpl$clearConversationInLocal$1.J$0 = jNanoTime;
                            i13 = i8;
                            try {
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e15) {
                                e = e15;
                                baseDao5 = baseDao2;
                                str7 = str5;
                                i10 = i9;
                                r8 = longRef;
                                i12 = i13;
                                set5 = set4;
                                sgk3 = sgk;
                                objectRef6 = objectRef5;
                                i11 = i12;
                                r02 = e;
                                C44159sFm.copydefault(r02, (java.lang.Exception) objectRef6.element);
                                objectRef6.element = r02;
                                if (i12 < i10 - 1) {
                                    java.lang.String str8 = str7;
                                    inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$0 = sgk3;
                                    inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$1 = set5;
                                    inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$2 = baseDao5;
                                    inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$3 = r8;
                                    inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$4 = objectRef6;
                                    inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$5 = null;
                                    inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$6 = null;
                                    inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$7 = null;
                                    inHouseIMConversationManagerImpl$clearConversationInLocal$1.I$0 = i10;
                                    inHouseIMConversationManagerImpl$clearConversationInLocal$1.I$1 = i11;
                                    inHouseIMConversationManagerImpl$clearConversationInLocal$1.label = 4;
                                    if (DelayKt.delay(((long) (i12 + 1)) * 50, inHouseIMConversationManagerImpl$clearConversationInLocal$1) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                    str7 = str8;
                                    r84 = r8;
                                    objectRef5 = objectRef6;
                                    sgk = sgk3;
                                    longRef = r84;
                                    int i192 = i11 + 1;
                                    set4 = set5;
                                    baseDao2 = baseDao5;
                                    i9 = i10;
                                    i8 = i192;
                                    if (i8 < i9) {
                                    }
                                } else {
                                    r83 = r8;
                                    ?? r842 = r83;
                                    objectRef5 = objectRef6;
                                    sgk = sgk3;
                                    longRef = r842;
                                    int i1922 = i11 + 1;
                                    set4 = set5;
                                    baseDao2 = baseDao5;
                                    i9 = i10;
                                    i8 = i1922;
                                    if (i8 < i9) {
                                    }
                                }
                            }
                            inHouseIMConversationManagerImpl$clearConversationInLocal$1.label = 3;
                            if (inHouseIMConversationDaoAYXKKw2.deleteConversations(set4, inHouseIMConversationManagerImpl$clearConversationInLocal$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            inHouseIMConversationManagerImpl$clearConversationInLocal$14 = inHouseIMConversationManagerImpl$clearConversationInLocal$1;
                            objectRef9 = objectRef8;
                            r5 = longRef;
                            objectRef7 = objectRef5;
                            str4 = str5;
                            i14 = i13;
                            r14 = longRef;
                            try {
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e16) {
                                inHouseIMConversationManagerImpl$clearConversationInLocal$1 = inHouseIMConversationManagerImpl$clearConversationInLocal$14;
                                baseDao5 = baseDao2;
                                i10 = i9;
                                str7 = str4;
                                i12 = i13;
                                set5 = set4;
                                i11 = i14;
                                r8 = r14;
                                sgk3 = sgk;
                                objectRef6 = objectRef7;
                                r02 = e16;
                                C44159sFm.copydefault(r02, (java.lang.Exception) objectRef6.element);
                                objectRef6.element = r02;
                                if (i12 < i10 - 1) {
                                }
                            }
                            ?? r12 = Unit.INSTANCE;
                            objectRef8.element = r12;
                            r5.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                            java.lang.Object obj32 = objectRef9.element;
                            C44159sFm.EZpvd(baseDao2, r14.element);
                            return r12;
                        }
                        java.lang.String str9 = str7;
                        C44159sFm.EZpvd(baseDao2, longRef.element);
                        java.lang.Exception exc = (java.lang.Exception) objectRef5.element;
                        if (exc == null) {
                            exc = new java.lang.Exception(str6 + i9 + str9);
                        }
                        C44159sFm.OLrzqt(exc);
                        throw exc;
                    }
                    int i20 = inHouseIMConversationManagerImpl$clearConversationInLocal$1.I$1;
                    int i21 = inHouseIMConversationManagerImpl$clearConversationInLocal$1.I$0;
                    Ref.ObjectRef objectRef14 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$4;
                    Ref.LongRef longRef9 = (Ref.LongRef) inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$3;
                    BaseDao baseDao8 = (BaseDao) inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$2;
                    java.util.Set<java.lang.String> set8 = (java.util.Set) inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$1;
                    sGK sgk6 = (sGK) inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    InHouseIMConversationManagerImpl$clearConversationInLocal$1 inHouseIMConversationManagerImpl$clearConversationInLocal$15 = inHouseIMConversationManagerImpl$clearConversationInLocal$1;
                    objectRef = objectRef14;
                    longRef2 = longRef9;
                    baseDao3 = baseDao8;
                    set2 = set8;
                    int i22 = 1;
                    i3 = i20;
                    i2 = i21;
                    inHouseIMConversationManagerImpl$clearConversationInLocal$12 = inHouseIMConversationManagerImpl$clearConversationInLocal$15;
                    i = i3 + i22;
                    sgk = sgk6;
                    longRef3 = longRef2;
                    if (i < i2) {
                        try {
                            try {
                            } catch (java.lang.IllegalStateException e17) {
                                e2 = e17;
                                message = e2.getMessage();
                                if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                                    C44159sFm.OLrzqt(e2);
                                    throw e2;
                                }
                                C44159sFm.copydefault(e2);
                                throw e2;
                            } catch (java.lang.Exception e18) {
                                e = e18;
                                C44159sFm.OLrzqt(e);
                                throw e;
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                r2 = baseDao3;
                                longRef2 = longRef3;
                                C44159sFm.EZpvd(r2, longRef2.element);
                                throw th;
                            }
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e19) {
                            e = e19;
                            i5 = i;
                            str3 = str7;
                        }
                        try {
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e20) {
                            e = e20;
                            i5 = i;
                            str3 = str7;
                        }
                        Ref.ObjectRef objectRef15 = new Ref.ObjectRef();
                        str3 = str7;
                        try {
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e21) {
                            e = e21;
                            i5 = i;
                        }
                        long jNanoTime2 = java.lang.System.nanoTime();
                        InHouseIMConversationSimpleInfoDao inHouseIMConversationSimpleInfoDaoValueOf2 = sgk.valueOf();
                        inHouseIMConversationManagerImpl$clearConversationInLocal$12.L$0 = sgk;
                        inHouseIMConversationManagerImpl$clearConversationInLocal$12.L$1 = set2;
                        inHouseIMConversationManagerImpl$clearConversationInLocal$12.L$2 = baseDao3;
                        inHouseIMConversationManagerImpl$clearConversationInLocal$12.L$3 = longRef3;
                        inHouseIMConversationManagerImpl$clearConversationInLocal$12.L$4 = objectRef;
                        inHouseIMConversationManagerImpl$clearConversationInLocal$12.L$5 = objectRef15;
                        inHouseIMConversationManagerImpl$clearConversationInLocal$12.L$6 = longRef3;
                        inHouseIMConversationManagerImpl$clearConversationInLocal$12.L$7 = objectRef15;
                        inHouseIMConversationManagerImpl$clearConversationInLocal$12.I$0 = i2;
                        inHouseIMConversationManagerImpl$clearConversationInLocal$12.I$1 = i;
                        inHouseIMConversationManagerImpl$clearConversationInLocal$12.I$2 = i;
                        inHouseIMConversationManagerImpl$clearConversationInLocal$12.J$0 = jNanoTime2;
                        i5 = i;
                        try {
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e22) {
                            try {
                                e = e22;
                                C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                                objectRef.element = r0;
                                if (i4 < i2 - 1) {
                                    java.lang.String str10 = str2;
                                    inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$0 = sgk2;
                                    inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$1 = set2;
                                    inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$2 = baseDao4;
                                    inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$3 = longRef2;
                                    inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$4 = objectRef;
                                    inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$5 = null;
                                    inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$6 = null;
                                    inHouseIMConversationManagerImpl$clearConversationInLocal$1.L$7 = null;
                                    inHouseIMConversationManagerImpl$clearConversationInLocal$1.I$0 = i2;
                                    inHouseIMConversationManagerImpl$clearConversationInLocal$1.I$1 = i3;
                                    inHouseIMConversationManagerImpl$clearConversationInLocal$1.label = 2;
                                    if (DelayKt.delay(((long) (i4 + 1)) * 50, inHouseIMConversationManagerImpl$clearConversationInLocal$1) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                    inHouseIMConversationManagerImpl$clearConversationInLocal$15 = inHouseIMConversationManagerImpl$clearConversationInLocal$1;
                                    baseDao3 = baseDao4;
                                    sgk6 = sgk2;
                                    str7 = str;
                                    i22 = 1;
                                    str6 = str10;
                                } else {
                                    java.lang.String str11 = str2;
                                    inHouseIMConversationManagerImpl$clearConversationInLocal$15 = inHouseIMConversationManagerImpl$clearConversationInLocal$1;
                                    baseDao3 = baseDao4;
                                    sgk6 = sgk2;
                                    str7 = str;
                                    i22 = 1;
                                    str6 = str11;
                                }
                                inHouseIMConversationManagerImpl$clearConversationInLocal$12 = inHouseIMConversationManagerImpl$clearConversationInLocal$15;
                                i = i3 + i22;
                                sgk = sgk6;
                                longRef3 = longRef2;
                                if (i < i2) {
                                }
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                r2 = baseDao4;
                                C44159sFm.EZpvd(r2, longRef2.element);
                                throw th;
                            }
                            sgk2 = sgk;
                            str = str3;
                            i3 = i5;
                            longRef2 = longRef3;
                            str2 = str6;
                            baseDao4 = baseDao3;
                            inHouseIMConversationManagerImpl$clearConversationInLocal$1 = inHouseIMConversationManagerImpl$clearConversationInLocal$12;
                            i4 = i3;
                            r0 = e;
                        }
                        inHouseIMConversationManagerImpl$clearConversationInLocal$12.label = 1;
                        if (inHouseIMConversationSimpleInfoDaoValueOf2.delete(set2, inHouseIMConversationManagerImpl$clearConversationInLocal$12) == objCopydefault) {
                            return objCopydefault;
                        }
                        inHouseIMConversationManagerImpl$clearConversationInLocal$13 = inHouseIMConversationManagerImpl$clearConversationInLocal$12;
                        set3 = set2;
                        objectRef4 = objectRef15;
                        j = jNanoTime2;
                        objectRef2 = objectRef;
                        str = str3;
                        objectRef3 = objectRef4;
                        longRef4 = longRef3;
                        longRef2 = longRef4;
                        i6 = i2;
                        str2 = str6;
                        i7 = i5;
                        baseDao4 = baseDao3;
                        try {
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e23) {
                            inHouseIMConversationManagerImpl$clearConversationInLocal$1 = inHouseIMConversationManagerImpl$clearConversationInLocal$13;
                            set2 = set3;
                            sgk2 = sgk;
                            i3 = i7;
                            i2 = i6;
                            i4 = i5;
                            objectRef = objectRef2;
                            r0 = e23;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                            objectRef.element = r0;
                            if (i4 < i2 - 1) {
                            }
                            inHouseIMConversationManagerImpl$clearConversationInLocal$12 = inHouseIMConversationManagerImpl$clearConversationInLocal$15;
                            i = i3 + i22;
                            sgk = sgk6;
                            longRef3 = longRef2;
                            if (i < i2) {
                            }
                        } catch (java.lang.IllegalStateException e24) {
                            e2 = e24;
                            message = e2.getMessage();
                            if (message == null) {
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e25) {
                            e = e25;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            r82 = baseDao4;
                            Ref.LongRef longRef10 = longRef2;
                            longRef2 = longRef10;
                            r2 = r82;
                            C44159sFm.EZpvd(r2, longRef2.element);
                            throw th;
                        }
                        objectRef4.element = Unit.INSTANCE;
                        longRef4.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                        java.lang.Object obj22 = objectRef3.element;
                        C44159sFm.EZpvd(baseDao4, longRef2.element);
                        InHouseIMConversationDao inHouseIMConversationDaoAYXKKw3 = sgk.AYXKKw();
                        longRef = new Ref.LongRef();
                        objectRef5 = new Ref.ObjectRef();
                        str6 = str2;
                        str7 = str;
                        i8 = 0;
                        i9 = 3;
                        inHouseIMConversationManagerImpl$clearConversationInLocal$1 = inHouseIMConversationManagerImpl$clearConversationInLocal$13;
                        set4 = set3;
                        baseDao2 = inHouseIMConversationDaoAYXKKw3;
                        if (i8 < i9) {
                        }
                    } else {
                        java.lang.String str12 = str7;
                        C44159sFm.EZpvd(baseDao3, longRef3.element);
                        java.lang.Exception exc2 = (java.lang.Exception) objectRef.element;
                        if (exc2 == null) {
                            exc2 = new java.lang.Exception(str6 + i2 + str12);
                        }
                        C44159sFm.OLrzqt(exc2);
                        throw exc2;
                    }
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                longRef = 4;
                baseDao2 = baseDao;
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
        }
    }

    @Override // o.sGI
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull InHouseIMChannelType inHouseIMChannelType, InAppConversationExtra inAppConversationExtra, java.lang.Long l, java.lang.Integer num, @NotNull Continuation<? super InHouseIMConversationEntity> continuation) {
        return BuildersKt.withContext(this.gEmmrt, new InHouseIMConversationManagerImpl$storeInAppConversation$2(this, str, num, l, inAppConversationExtra, inHouseIMChannelType, null), continuation);
    }

    /* JADX DEBUG: Duplicate block (B:76:0x01a4) to fix multi-entry loop: BACK_EDGE: B:76:0x01a4 -> B:77:0x01ae */
    /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x01b5: MOVE (r6 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:78:0x01b5 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01b6: MOVE (r7 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:78:0x01b5 */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0147 A[Catch: all -> 0x0054, TryCatch #4 {all -> 0x0054, blocks: (B:13:0x0046, B:38:0x00fe, B:54:0x0139, B:55:0x013c, B:59:0x0141, B:61:0x0147, B:63:0x0153, B:64:0x0156, B:65:0x0157, B:66:0x015a, B:70:0x0170, B:72:0x017d), top: B:88:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017d A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #4 {all -> 0x0054, blocks: (B:13:0x0046, B:38:0x00fe, B:54:0x0139, B:55:0x013c, B:59:0x0141, B:61:0x0147, B:63:0x0153, B:64:0x0156, B:65:0x0157, B:66:0x015a, B:70:0x0170, B:72:0x017d), top: B:88:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, java.lang.Object, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    @Override // o.sGI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.util.Set<java.lang.String> set, @NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        InHouseIMConversationManagerImpl$deleteConversationsFromLocal$1 inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDaoAYXKKw;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        sGK sgk;
        InHouseIMConversationManagerImpl$deleteConversationsFromLocal$1 inHouseIMConversationManagerImpl$deleteConversationsFromLocal$12;
        java.util.Set<java.lang.String> set2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        int i3;
        java.util.Set<java.lang.String> set3;
        Ref.ObjectRef objectRef2;
        int i4;
        sGK sgk2;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        sGK sgk3;
        Ref.ObjectRef objectRef3;
        Ref.LongRef longRef4;
        int i5;
        BaseDao baseDao2;
        int i6;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException2;
        java.lang.String message;
        ?? r0;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        long jNanoTime;
        java.util.Set<java.lang.String> set4;
        if (continuation instanceof InHouseIMConversationManagerImpl$deleteConversationsFromLocal$1) {
            inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1 = (InHouseIMConversationManagerImpl$deleteConversationsFromLocal$1) continuation;
            int i7 = inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.label = i7 - Integer.MIN_VALUE;
            } else {
                inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1 = new InHouseIMConversationManagerImpl$deleteConversationsFromLocal$1(this, continuation);
            }
        }
        java.lang.Object obj = inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    jNanoTime = inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.J$0;
                    i4 = inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.I$2;
                    i3 = inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.I$1;
                    i = inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.I$0;
                    objectRef5 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.L$7;
                    longRef3 = (Ref.LongRef) inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.L$6;
                    objectRef4 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.L$5;
                    objectRef2 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.L$4;
                    longRef2 = (Ref.LongRef) inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.L$3;
                    baseDaoAYXKKw = (BaseDao) inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.L$2;
                    set4 = (java.util.Set) inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.L$1;
                    sgk2 = (sGK) inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        longRef4 = longRef2;
                        i5 = i3;
                        baseDao2 = baseDaoAYXKKw;
                        i6 = i;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        set3 = set4;
                        sQLiteDatabaseLockedException2 = e3;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        sgk3 = sgk2;
                        objectRef3 = objectRef2;
                        int i9 = i3;
                        longRef4 = longRef2;
                        i5 = i9;
                        int i10 = i;
                        baseDao2 = baseDaoAYXKKw;
                        i6 = i10;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        inHouseIMConversationManagerImpl$deleteConversationsFromLocal$12 = inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1;
                        i2 = i + i;
                        sgk = sgk3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    } catch (java.lang.IllegalStateException e4) {
                        e2 = e4;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e5) {
                        e = e5;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        C44159sFm.EZpvd(baseDaoAYXKKw, longRef2.element);
                        throw th;
                    }
                    ?? r02 = Unit.INSTANCE;
                    objectRef5.element = r02;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t = objectRef4.element;
                    C44159sFm.EZpvd(baseDao2, longRef4.element);
                    return r02;
                }
                if (i8 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i11 = inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.I$1;
                int i12 = inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.I$0;
                Ref.ObjectRef objectRef6 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.L$4;
                longRef4 = (Ref.LongRef) inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.L$3;
                BaseDao baseDao3 = (BaseDao) inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.L$2;
                java.util.Set<java.lang.String> set5 = (java.util.Set) inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.L$1;
                sgk3 = (sGK) inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.L$0;
                C56391yDq.AEQbTJ(obj);
                InHouseIMConversationManagerImpl$deleteConversationsFromLocal$1 inHouseIMConversationManagerImpl$deleteConversationsFromLocal$13 = inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1;
                int i13 = 1;
                baseDaoAYXKKw = baseDao3;
                set2 = set5;
                i = i12;
                objectRef = objectRef6;
                inHouseIMConversationManagerImpl$deleteConversationsFromLocal$12 = inHouseIMConversationManagerImpl$deleteConversationsFromLocal$13;
                i2 = i11 + i13;
                sgk = sgk3;
                longRef3 = longRef4;
                if (i2 >= i) {
                    try {
                        try {
                        } catch (java.lang.IllegalStateException e6) {
                            e2 = e6;
                            longRef2 = longRef3;
                            message = e2.getMessage();
                            if (message == null) {
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e7) {
                            e = e7;
                            longRef2 = longRef3;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            longRef2 = longRef3;
                            C44159sFm.EZpvd(baseDaoAYXKKw, longRef2.element);
                            throw th;
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                        set3 = set2;
                        inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1 = inHouseIMConversationManagerImpl$deleteConversationsFromLocal$12;
                        sgk2 = sgk;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException = e8;
                        sgk3 = sgk2;
                        objectRef3 = objectRef2;
                        int i92 = i3;
                        longRef4 = longRef2;
                        i5 = i92;
                        int i102 = i;
                        baseDao2 = baseDaoAYXKKw;
                        i6 = i102;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                            inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.L$0 = sgk3;
                            inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.L$1 = set3;
                            inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.L$2 = baseDao2;
                            inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.L$3 = longRef4;
                            inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.L$4 = objectRef3;
                            inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.L$5 = null;
                            inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.L$6 = null;
                            inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.L$7 = null;
                            inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.I$0 = i6;
                            inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.I$1 = i5;
                            inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1.label = 2;
                            if (DelayKt.delay(((long) (i4 + 1)) * 50, inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            inHouseIMConversationManagerImpl$deleteConversationsFromLocal$13 = inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1;
                            i11 = i5;
                            set2 = set3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao4 = baseDao2;
                            i = i6;
                            baseDaoAYXKKw = baseDao4;
                        } else {
                            inHouseIMConversationManagerImpl$deleteConversationsFromLocal$13 = inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1;
                            i11 = i5;
                            set2 = set3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao5 = baseDao2;
                            i = i6;
                            baseDaoAYXKKw = baseDao5;
                        }
                        inHouseIMConversationManagerImpl$deleteConversationsFromLocal$12 = inHouseIMConversationManagerImpl$deleteConversationsFromLocal$13;
                        i2 = i11 + i13;
                        sgk = sgk3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        set3 = set2;
                        inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1 = inHouseIMConversationManagerImpl$deleteConversationsFromLocal$12;
                        sgk2 = sgk;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException2 = e9;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        sgk3 = sgk2;
                        objectRef3 = objectRef2;
                        int i922 = i3;
                        longRef4 = longRef2;
                        i5 = i922;
                        int i1022 = i;
                        baseDao2 = baseDaoAYXKKw;
                        i6 = i1022;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        inHouseIMConversationManagerImpl$deleteConversationsFromLocal$12 = inHouseIMConversationManagerImpl$deleteConversationsFromLocal$13;
                        i2 = i11 + i13;
                        sgk = sgk3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    objectRef5 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    InHouseIMConversationDao inHouseIMConversationDaoAYXKKw = sgk.AYXKKw();
                    inHouseIMConversationManagerImpl$deleteConversationsFromLocal$12.L$0 = sgk;
                    inHouseIMConversationManagerImpl$deleteConversationsFromLocal$12.L$1 = set2;
                    inHouseIMConversationManagerImpl$deleteConversationsFromLocal$12.L$2 = baseDaoAYXKKw;
                    inHouseIMConversationManagerImpl$deleteConversationsFromLocal$12.L$3 = longRef3;
                    inHouseIMConversationManagerImpl$deleteConversationsFromLocal$12.L$4 = objectRef;
                    inHouseIMConversationManagerImpl$deleteConversationsFromLocal$12.L$5 = objectRef5;
                    inHouseIMConversationManagerImpl$deleteConversationsFromLocal$12.L$6 = longRef3;
                    inHouseIMConversationManagerImpl$deleteConversationsFromLocal$12.L$7 = objectRef5;
                    inHouseIMConversationManagerImpl$deleteConversationsFromLocal$12.I$0 = i;
                    inHouseIMConversationManagerImpl$deleteConversationsFromLocal$12.I$1 = i2;
                    inHouseIMConversationManagerImpl$deleteConversationsFromLocal$12.I$2 = i2;
                    inHouseIMConversationManagerImpl$deleteConversationsFromLocal$12.J$0 = jNanoTime;
                    inHouseIMConversationManagerImpl$deleteConversationsFromLocal$12.label = 1;
                    if (inHouseIMConversationDaoAYXKKw.deleteConversations(set2, inHouseIMConversationManagerImpl$deleteConversationsFromLocal$12) == objCopydefault) {
                        return objCopydefault;
                    }
                    set4 = set2;
                    inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1 = inHouseIMConversationManagerImpl$deleteConversationsFromLocal$12;
                    sgk2 = sgk;
                    i4 = i2;
                    objectRef4 = objectRef5;
                    longRef4 = longRef3;
                    objectRef2 = objectRef;
                    i5 = i4;
                    int i14 = i;
                    baseDao2 = baseDaoAYXKKw;
                    i6 = i14;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                        sgk3 = sgk2;
                        objectRef3 = objectRef2;
                        set3 = set4;
                        r0 = e10;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        inHouseIMConversationManagerImpl$deleteConversationsFromLocal$12 = inHouseIMConversationManagerImpl$deleteConversationsFromLocal$13;
                        i2 = i11 + i13;
                        sgk = sgk3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    } catch (java.lang.IllegalStateException e11) {
                        e2 = e11;
                        message = e2.getMessage();
                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                            C44159sFm.OLrzqt(e2);
                            throw e2;
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e12) {
                        e = e12;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    }
                    ?? r022 = Unit.INSTANCE;
                    objectRef5.element = r022;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef4.element;
                    C44159sFm.EZpvd(baseDao2, longRef4.element);
                    return r022;
                }
                C44159sFm.EZpvd(baseDaoAYXKKw, longRef3.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            baseDaoAYXKKw = AYXKKw();
            longRef3 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 3;
            i2 = 0;
            sgk = this;
            inHouseIMConversationManagerImpl$deleteConversationsFromLocal$12 = inHouseIMConversationManagerImpl$deleteConversationsFromLocal$1;
            set2 = set;
            if (i2 >= i) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            longRef2 = longRef;
            baseDaoAYXKKw = baseDao;
        }
    }

    public final java.lang.String copydefault(InAppConversationExtra inAppConversationExtra, java.lang.String str) {
        java.util.Map linkedHashMap;
        if (inAppConversationExtra == null) {
            return str;
        }
        if (str != null) {
            linkedHashMap = C56424yEw.isConnected(JsonElementKt.getJsonObject(Json.Default.parseToJsonElement(str)));
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        java.lang.String lastMessage = inAppConversationExtra.getLastMessage();
        if (lastMessage != null) {
            linkedHashMap.put("lastMessage", JsonElementKt.JsonPrimitive(lastMessage));
        }
        if (!linkedHashMap.isEmpty()) {
            return new JsonObject(linkedHashMap).toString();
        }
        return null;
    }

    public final InHouseIMConversationEntity EZpvd(@NotNull java.lang.String str, @NotNull InHouseIMChannelType inHouseIMChannelType, java.lang.String str2, long j, int i, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(inHouseIMChannelType, "");
        return new InHouseIMConversationEntity(str, java.lang.Integer.valueOf(inHouseIMChannelType.getApiValue()), 0, (java.lang.Integer) null, (java.lang.Integer) null, 0, 0, java.lang.Integer.valueOf(ReceiveMessageOptionType.RECEIVE.getApiValue()), 0, i, 0, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.Long) null, str2, str3, j, (DraftMessageModel) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.Integer) null, (java.util.List) null, (JsonElement) null, 457063804, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:49:0x0184 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v37, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x01b0: MOVE (r10 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:70:0x01b0 */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x01b1: MOVE (r2 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:70:0x01b0 */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019c A[Catch: all -> 0x0050, TryCatch #8 {all -> 0x0050, blocks: (B:13:0x004a, B:57:0x018f, B:58:0x0192, B:62:0x0196, B:64:0x019c, B:66:0x01a8, B:67:0x01ab, B:68:0x01ac, B:69:0x01af), top: B:96:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c9 A[Catch: all -> 0x0200, TRY_LEAVE, TryCatch #0 {all -> 0x0200, blocks: (B:74:0x01bc, B:76:0x01c9), top: B:92:0x01bc }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, kotlin.Unit] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x01ef -> B:82:0x01fa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x01f1 -> B:81:0x01f6). Please report as a decompilation issue!!! */
    @Override // o.sGI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object valueOf(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Exception {
        InHouseIMConversationManagerImpl$markNotificationConversationViewed$1 inHouseIMConversationManagerImpl$markNotificationConversationViewed$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDao2;
        java.lang.String str2;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        sGK sgk;
        BaseDao baseDao3;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        BaseDao baseDao4;
        Ref.ObjectRef objectRef2;
        int i3;
        ?? r0;
        InHouseIMConversationManagerImpl$markNotificationConversationViewed$1 inHouseIMConversationManagerImpl$markNotificationConversationViewed$12;
        sGK sgk2;
        int i4;
        int i5;
        int i6;
        java.lang.String str3;
        long jNanoTime;
        Ref.ObjectRef objectRef3;
        java.lang.String str4;
        Ref.LongRef longRef4;
        Ref.ObjectRef objectRef4;
        java.lang.String str5;
        if (continuation instanceof InHouseIMConversationManagerImpl$markNotificationConversationViewed$1) {
            inHouseIMConversationManagerImpl$markNotificationConversationViewed$1 = (InHouseIMConversationManagerImpl$markNotificationConversationViewed$1) continuation;
            int i7 = inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.label = i7 - Integer.MIN_VALUE;
            } else {
                inHouseIMConversationManagerImpl$markNotificationConversationViewed$1 = new InHouseIMConversationManagerImpl$markNotificationConversationViewed$1(this, continuation);
            }
        }
        java.lang.Object obj = inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.label;
        java.lang.String str6 = "InHouseIMConversationManagerImpl";
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    long j = inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.J$0;
                    i2 = inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.I$2;
                    int i9 = inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.I$1;
                    i = inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.I$0;
                    Ref.ObjectRef objectRef5 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.L$7;
                    Ref.LongRef longRef5 = (Ref.LongRef) inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.L$6;
                    objectRef3 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.L$5;
                    objectRef = (Ref.ObjectRef) inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.L$4;
                    longRef2 = (Ref.LongRef) inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.L$3;
                    BaseDao baseDao5 = (BaseDao) inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.L$2;
                    java.lang.String str7 = (java.lang.String) inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.L$1;
                    sGK sgk3 = (sGK) inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        objectRef4 = objectRef5;
                        i4 = i;
                        i5 = i9;
                        i6 = i2;
                        str3 = "InHouseIMConversationManagerImpl";
                        baseDao2 = baseDao5;
                        inHouseIMConversationManagerImpl$markNotificationConversationViewed$12 = inHouseIMConversationManagerImpl$markNotificationConversationViewed$1;
                        longRef4 = longRef5;
                        longRef3 = longRef2;
                        jNanoTime = j;
                        str4 = str7;
                        sgk2 = sgk3;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        baseDao4 = baseDao5;
                        sgk = sgk3;
                        longRef3 = longRef2;
                        i3 = i9;
                        str2 = str7;
                        objectRef2 = objectRef;
                        r0 = e3;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i2 < i - 1) {
                        }
                        longRef2 = longRef3;
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        throw th;
                    } catch (java.lang.IllegalStateException e4) {
                        e2 = e4;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e5) {
                        e = e5;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        baseDao2 = baseDao5;
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        throw th;
                    }
                    objectRef4.element = Unit.INSTANCE;
                    longRef4.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t = objectRef3.element;
                    C44159sFm.EZpvd(baseDao2, longRef3.element);
                    pUU.KWHzl(str3, "markNotificationConversationViewed " + str4 + ": success");
                    return C56443yFo.KWHzl(true);
                }
                if (i8 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.I$1;
                int i10 = inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.I$0;
                objectRef2 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.L$4;
                Ref.LongRef longRef6 = (Ref.LongRef) inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.L$3;
                baseDao4 = (BaseDao) inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.L$2;
                java.lang.String str8 = (java.lang.String) inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.L$1;
                sgk = (sGK) inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.L$0;
                C56391yDq.AEQbTJ(obj);
                str2 = str8;
                longRef3 = longRef6;
                i = i10;
                i2 = i3 + 1;
                objectRef = objectRef2;
                baseDao3 = baseDao4;
                if (i2 >= i) {
                    try {
                        try {
                        } catch (java.lang.IllegalStateException e6) {
                            e2 = e6;
                            message = e2.getMessage();
                            if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                                C44159sFm.OLrzqt(e2);
                                throw e2;
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e7) {
                            e = e7;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            baseDao2 = baseDao3;
                            longRef2 = longRef3;
                            C44159sFm.EZpvd(baseDao2, longRef2.element);
                            throw th;
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                        e = e8;
                        str5 = str6;
                    }
                    Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
                    str5 = str6;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        try {
                            e = e9;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i2 < i - 1) {
                                inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.L$0 = sgk;
                                inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.L$1 = str2;
                                inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.L$2 = baseDao4;
                                inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.L$3 = longRef3;
                                inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.L$4 = objectRef2;
                                inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.L$5 = null;
                                inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.L$6 = null;
                                inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.L$7 = null;
                                inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.I$0 = i;
                                inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.I$1 = i3;
                                inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.label = 2;
                                if (DelayKt.delay(((long) (i2 + 1)) * 50, inHouseIMConversationManagerImpl$markNotificationConversationViewed$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                                i2 = i3 + 1;
                                objectRef = objectRef2;
                                baseDao3 = baseDao4;
                                if (i2 >= i) {
                                }
                            } else {
                                i10 = i;
                                longRef6 = longRef3;
                                str8 = str2;
                                str2 = str8;
                                longRef3 = longRef6;
                                i = i10;
                                i2 = i3 + 1;
                                objectRef = objectRef2;
                                baseDao3 = baseDao4;
                                if (i2 >= i) {
                                }
                            }
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            baseDao2 = baseDao4;
                            longRef2 = longRef3;
                            C44159sFm.EZpvd(baseDao2, longRef2.element);
                            throw th;
                        }
                        str6 = str5;
                        baseDao4 = baseDao3;
                        objectRef2 = objectRef;
                        i3 = i2;
                        r0 = e;
                        longRef2 = longRef3;
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        throw th;
                    }
                    jNanoTime = java.lang.System.nanoTime();
                    InHouseIMConversationDao inHouseIMConversationDaoAYXKKw = sgk.AYXKKw();
                    inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.L$0 = sgk;
                    inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.L$1 = str2;
                    inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.L$2 = baseDao3;
                    inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.L$3 = longRef3;
                    inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.L$4 = objectRef;
                    inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.L$5 = objectRef6;
                    inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.L$6 = longRef3;
                    inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.L$7 = objectRef6;
                    inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.I$0 = i;
                    inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.I$1 = i2;
                    inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.I$2 = i2;
                    inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.J$0 = jNanoTime;
                    inHouseIMConversationManagerImpl$markNotificationConversationViewed$1.label = 1;
                    if (inHouseIMConversationDaoAYXKKw.resetUnreadCount(str2, inHouseIMConversationManagerImpl$markNotificationConversationViewed$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    sgk2 = sgk;
                    i6 = i2;
                    objectRef4 = objectRef6;
                    objectRef3 = objectRef4;
                    i4 = i;
                    str3 = str5;
                    inHouseIMConversationManagerImpl$markNotificationConversationViewed$12 = inHouseIMConversationManagerImpl$markNotificationConversationViewed$1;
                    i5 = i6;
                    longRef4 = longRef3;
                    BaseDao baseDao6 = baseDao3;
                    str4 = str2;
                    baseDao2 = baseDao6;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                        inHouseIMConversationManagerImpl$markNotificationConversationViewed$1 = inHouseIMConversationManagerImpl$markNotificationConversationViewed$12;
                        str6 = str3;
                        i2 = i6;
                        sgk = sgk2;
                        objectRef2 = objectRef;
                        int i11 = i4;
                        baseDao4 = baseDao2;
                        str2 = str4;
                        i3 = i5;
                        i = i11;
                        r0 = e10;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i2 < i - 1) {
                        }
                        longRef2 = longRef3;
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        throw th;
                    } catch (java.lang.IllegalStateException e11) {
                        e2 = e11;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e12) {
                        e = e12;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        longRef2 = longRef3;
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        throw th;
                    }
                    objectRef4.element = Unit.INSTANCE;
                    longRef4.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef3.element;
                    C44159sFm.EZpvd(baseDao2, longRef3.element);
                    pUU.KWHzl(str3, "markNotificationConversationViewed " + str4 + ": success");
                    return C56443yFo.KWHzl(true);
                }
                C44159sFm.EZpvd(baseDao3, longRef3.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("markNotificationConversationViewed ");
            str2 = str;
            sb.append(str2);
            sb.append(" - clear local notification conversation unread count");
            pUU.KWHzl("InHouseIMConversationManagerImpl", sb.toString());
            InHouseIMConversationDao inHouseIMConversationDaoAYXKKw2 = AYXKKw();
            longRef3 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 3;
            i2 = 0;
            sgk = this;
            baseDao3 = inHouseIMConversationDaoAYXKKw2;
            if (i2 >= i) {
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            longRef2 = longRef;
            baseDao2 = baseDao;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.sGI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        InHouseIMConversationManagerImpl$markConversationsAsReadInRemote$1 inHouseIMConversationManagerImpl$markConversationsAsReadInRemote$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof InHouseIMConversationManagerImpl$markConversationsAsReadInRemote$1) {
            inHouseIMConversationManagerImpl$markConversationsAsReadInRemote$1 = (InHouseIMConversationManagerImpl$markConversationsAsReadInRemote$1) continuation;
            int i = inHouseIMConversationManagerImpl$markConversationsAsReadInRemote$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMConversationManagerImpl$markConversationsAsReadInRemote$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMConversationManagerImpl$markConversationsAsReadInRemote$1 = new InHouseIMConversationManagerImpl$markConversationsAsReadInRemote$1(this, continuation);
            }
        }
        java.lang.Object objMarkRead = inHouseIMConversationManagerImpl$markConversationsAsReadInRemote$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMConversationManagerImpl$markConversationsAsReadInRemote$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objMarkRead);
                pUU.KWHzl("InHouseIMConversationManagerImpl", "markRead - start server call");
                InHouseIMConversationService inHouseIMConversationService = this.EZpvd;
                MarkReadRequest markReadRequest = new MarkReadRequest((java.util.List) null, 1, (DefaultConstructorMarker) null);
                inHouseIMConversationManagerImpl$markConversationsAsReadInRemote$1.label = 1;
                objMarkRead = inHouseIMConversationService.markRead(markReadRequest, inHouseIMConversationManagerImpl$markConversationsAsReadInRemote$1);
                if (objMarkRead == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objMarkRead);
            }
            ResponseData responseData = (ResponseData) objMarkRead;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        actionBar.AEQbTJ();
        pUU.KWHzl("InHouseIMConversationManagerImpl", "markRead - server call: success");
        return C56443yFo.KWHzl(true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v26, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v40, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01b3: MOVE (r8 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:78:0x01b3 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x01b4: MOVE (r9 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:78:0x01b3 */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0158 A[Catch: all -> 0x004c, TryCatch #11 {all -> 0x004c, blocks: (B:13:0x0044, B:37:0x0107, B:53:0x014c, B:54:0x014f, B:57:0x0152, B:59:0x0158, B:61:0x0164, B:62:0x0167, B:63:0x0168, B:64:0x016b, B:68:0x0173, B:70:0x0180), top: B:90:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0180 A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #11 {all -> 0x004c, blocks: (B:13:0x0044, B:37:0x0107, B:53:0x014c, B:54:0x014f, B:57:0x0152, B:59:0x0158, B:61:0x0164, B:62:0x0167, B:63:0x0168, B:64:0x016b, B:68:0x0173, B:70:0x0180), top: B:90:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01a3 -> B:74:0x01a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x01a9 -> B:75:0x01a5). Please report as a decompilation issue!!! */
    @Override // o.sGI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Continuation<? super java.util.List<java.lang.String>> continuation) throws java.lang.Exception {
        InHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1 inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDao2;
        BaseDao baseDaoAYXKKw;
        Ref.LongRef longRef3;
        int i;
        sGK sgk;
        Ref.ObjectRef objectRef;
        int i2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        sGK sgk2;
        Ref.LongRef longRef4;
        Ref.ObjectRef objectRef2;
        int i3;
        int i4;
        ?? r0;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException2;
        Ref.LongRef longRef5;
        long j;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        T t;
        if (continuation instanceof InHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1) {
            inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1 = (InHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1) continuation;
            int i5 = inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.label = i5 - Integer.MIN_VALUE;
            } else {
                inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1 = new InHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1(this, continuation);
            }
        }
        java.lang.Object obj = inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i6 = inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.label;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    j = inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.J$0;
                    i2 = inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.I$2;
                    int i7 = inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.I$1;
                    int i8 = inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.I$0;
                    Ref.ObjectRef objectRef6 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.L$6;
                    longRef3 = (Ref.LongRef) inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.L$5;
                    objectRef5 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.L$4;
                    objectRef4 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.L$3;
                    longRef2 = (Ref.LongRef) inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.L$2;
                    baseDao2 = (BaseDao) inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.L$1;
                    sgk = (sGK) inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        longRef5 = longRef2;
                        i4 = i7;
                        baseDaoAYXKKw = baseDao2;
                        objectRef3 = objectRef6;
                        i = i8;
                        t = obj;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        sgk2 = sgk;
                        objectRef2 = objectRef4;
                        i3 = i8;
                        baseDaoAYXKKw = baseDao2;
                        longRef4 = longRef2;
                        i4 = i7;
                        r0 = e3;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i2 >= i3 - 1) {
                        }
                    } catch (java.lang.IllegalStateException e4) {
                        e2 = e4;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e5) {
                        e = e5;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        throw th;
                    }
                    objectRef3.element = t;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                    T t2 = objectRef5.element;
                    C44159sFm.EZpvd(baseDaoAYXKKw, longRef5.element);
                    java.util.List list = (java.util.List) t2;
                    pUU.KWHzl("InHouseIMConversationManagerImpl", "getAllChannelsWithUnreadCount - result: " + list);
                    return list;
                }
                if (i6 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i9 = inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.I$1;
                i3 = inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.I$0;
                objectRef2 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.L$3;
                longRef4 = (Ref.LongRef) inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.L$2;
                baseDaoAYXKKw = (BaseDao) inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.L$1;
                sgk2 = (sGK) inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.L$0;
                C56391yDq.AEQbTJ(obj);
                i4 = i9;
                objectRef = objectRef2;
                longRef3 = longRef4;
                i2 = i4 + 1;
                sgk = sgk2;
                i = i3;
                if (i2 >= i) {
                    try {
                        try {
                        } catch (java.lang.IllegalStateException e6) {
                            e2 = e6;
                            message = e2.getMessage();
                            if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                                C44159sFm.OLrzqt(e2);
                                throw e2;
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e7) {
                            e = e7;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            baseDao2 = baseDaoAYXKKw;
                            longRef2 = longRef3;
                            C44159sFm.EZpvd(baseDao2, longRef2.element);
                            throw th;
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                        i4 = i2;
                        sQLiteDatabaseLockedException = e8;
                        objectRef2 = objectRef;
                        i3 = i;
                        longRef4 = longRef3;
                        sgk2 = sgk;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i2 >= i3 - 1) {
                            inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.L$0 = sgk2;
                            inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.L$1 = baseDaoAYXKKw;
                            inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.L$2 = longRef4;
                            inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.L$3 = objectRef2;
                            inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.L$4 = null;
                            inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.L$5 = null;
                            inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.L$6 = null;
                            inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.I$0 = i3;
                            inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.I$1 = i4;
                            inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.label = 2;
                            if (DelayKt.delay(((long) (i2 + 1)) * 50, inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            i9 = i4;
                            i4 = i9;
                            objectRef = objectRef2;
                            longRef3 = longRef4;
                            i2 = i4 + 1;
                            sgk = sgk2;
                            i = i3;
                            if (i2 >= i) {
                            }
                        } else {
                            objectRef = objectRef2;
                            longRef3 = longRef4;
                            i2 = i4 + 1;
                            sgk = sgk2;
                            i = i3;
                            if (i2 >= i) {
                            }
                        }
                    }
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        i4 = i2;
                        sQLiteDatabaseLockedException2 = e9;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        objectRef2 = objectRef;
                        i3 = i;
                        longRef4 = longRef3;
                        sgk2 = sgk;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i2 >= i3 - 1) {
                        }
                    }
                    Ref.ObjectRef objectRef7 = new Ref.ObjectRef();
                    long jNanoTime = java.lang.System.nanoTime();
                    InHouseIMConversationDao inHouseIMConversationDaoAYXKKw = sgk.AYXKKw();
                    inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.L$0 = sgk;
                    inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.L$1 = baseDaoAYXKKw;
                    inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.L$2 = longRef3;
                    inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.L$3 = objectRef;
                    inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.L$4 = objectRef7;
                    inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.L$5 = longRef3;
                    inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.L$6 = objectRef7;
                    inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.I$0 = i;
                    inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.I$1 = i2;
                    inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.I$2 = i2;
                    inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.J$0 = jNanoTime;
                    inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1.label = 1;
                    java.lang.Object allChannelsWithUnreadCount$default = InHouseIMConversationDao.Activity.getAllChannelsWithUnreadCount$default(inHouseIMConversationDaoAYXKKw, null, 0, inHouseIMConversationManagerImpl$getAllChannelIdsWithUnreadCount$1, 3, null);
                    if (allChannelsWithUnreadCount$default == objCopydefault) {
                        return objCopydefault;
                    }
                    objectRef3 = objectRef7;
                    i4 = i2;
                    longRef5 = longRef3;
                    j = jNanoTime;
                    t = allChannelsWithUnreadCount$default;
                    objectRef4 = objectRef;
                    objectRef5 = objectRef3;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                        objectRef = objectRef4;
                        longRef3 = longRef5;
                        sQLiteDatabaseLockedException2 = e10;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        objectRef2 = objectRef;
                        i3 = i;
                        longRef4 = longRef3;
                        sgk2 = sgk;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i2 >= i3 - 1) {
                        }
                    } catch (java.lang.IllegalStateException e11) {
                        e2 = e11;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e12) {
                        e = e12;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    }
                    objectRef3.element = t;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                    T t22 = objectRef5.element;
                    C44159sFm.EZpvd(baseDaoAYXKKw, longRef5.element);
                    java.util.List list2 = (java.util.List) t22;
                    pUU.KWHzl("InHouseIMConversationManagerImpl", "getAllChannelsWithUnreadCount - result: " + list2);
                    return list2;
                }
                C44159sFm.EZpvd(baseDaoAYXKKw, longRef3.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("InHouseIMConversationManagerImpl", "getAllChannelsWithUnreadCount - start");
            baseDaoAYXKKw = AYXKKw();
            longRef3 = new Ref.LongRef();
            i = 3;
            sgk = this;
            objectRef = new Ref.ObjectRef();
            i2 = 0;
            if (i2 >= i) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            longRef2 = longRef;
            baseDao2 = baseDao;
        }
    }

    /* JADX DEBUG: Duplicate block (B:76:0x01f3) to fix multi-entry loop: BACK_EDGE: B:76:0x01f3 -> B:77:0x01f7 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v33, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01fd: MOVE (r9 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:78:0x01fd */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x01fe: MOVE (r6 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:78:0x01fd */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a1 A[Catch: all -> 0x0055, TryCatch #3 {all -> 0x0055, blocks: (B:13:0x0048, B:41:0x0145, B:55:0x0194, B:56:0x0197, B:59:0x019b, B:61:0x01a1, B:63:0x01ad, B:64:0x01b0, B:65:0x01b1, B:66:0x01b4, B:70:0x01be, B:72:0x01cb), top: B:86:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cb A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #3 {all -> 0x0055, blocks: (B:13:0x0048, B:41:0x0145, B:55:0x0194, B:56:0x0197, B:59:0x019b, B:61:0x01a1, B:63:0x01ad, B:64:0x01b0, B:65:0x01b1, B:66:0x01b4, B:70:0x01be, B:72:0x01cb), top: B:86:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, kotlin.Unit] */
    @Override // o.sGI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.util.List<MaxSeqData> list, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Exception {
        InHouseIMConversationManagerImpl$markLocalConversationsAsRead$1 inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDao2;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        sGK sgk;
        BaseDao baseDao3;
        java.util.List<ConversationUnreadUpdateEntity> list2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        sGK sgk2;
        java.util.List<ConversationUnreadUpdateEntity> list3;
        BaseDao baseDao4;
        Ref.LongRef longRef4;
        Ref.ObjectRef objectRef2;
        int i3;
        int i4;
        ?? r0;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        InHouseIMConversationManagerImpl$markLocalConversationsAsRead$1 inHouseIMConversationManagerImpl$markLocalConversationsAsRead$12;
        int i5;
        long jNanoTime;
        int i6;
        Ref.ObjectRef objectRef3;
        java.util.List<ConversationUnreadUpdateEntity> list4;
        sGK sgk3;
        Ref.ObjectRef objectRef4;
        if (continuation instanceof InHouseIMConversationManagerImpl$markLocalConversationsAsRead$1) {
            inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1 = (InHouseIMConversationManagerImpl$markLocalConversationsAsRead$1) continuation;
            int i7 = inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.label = i7 - Integer.MIN_VALUE;
            } else {
                inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1 = new InHouseIMConversationManagerImpl$markLocalConversationsAsRead$1(this, continuation);
            }
        }
        java.lang.Object obj = inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    jNanoTime = inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.J$0;
                    i4 = inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.I$2;
                    int i9 = inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.I$1;
                    int i10 = inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.I$0;
                    Ref.ObjectRef objectRef5 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.L$7;
                    longRef3 = (Ref.LongRef) inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.L$6;
                    objectRef3 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.L$5;
                    objectRef = (Ref.ObjectRef) inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.L$4;
                    longRef2 = (Ref.LongRef) inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.L$3;
                    baseDao2 = (BaseDao) inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.L$2;
                    java.util.List<ConversationUnreadUpdateEntity> list5 = (java.util.List) inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.L$1;
                    sgk3 = (sGK) inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        objectRef4 = objectRef5;
                        i5 = i10;
                        baseDao4 = baseDao2;
                        i2 = i4;
                        list4 = list5;
                        inHouseIMConversationManagerImpl$markLocalConversationsAsRead$12 = inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1;
                        longRef4 = longRef2;
                        i6 = i9;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        list3 = list5;
                        sgk2 = sgk3;
                        objectRef2 = objectRef;
                        i3 = i10;
                        baseDao4 = baseDao2;
                        i2 = i9;
                        longRef4 = longRef2;
                        sQLiteDatabaseLockedException = e3;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i4 < i3 - 1) {
                        }
                        i2 += i;
                        list2 = list3;
                        sgk = sgk2;
                        longRef3 = longRef4;
                        if (i2 < i) {
                        }
                    } catch (java.lang.IllegalStateException e4) {
                        e2 = e4;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e5) {
                        e = e5;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        throw th;
                    }
                    objectRef4.element = Unit.INSTANCE;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t = objectRef3.element;
                    C44159sFm.EZpvd(baseDao4, longRef4.element);
                    pUU.KWHzl("InHouseIMConversationManagerImpl", "markLocalConversationAsRead - success with entity:" + list4);
                    return C56443yFo.KWHzl(true);
                }
                if (i8 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i11 = inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.I$1;
                int i12 = inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.I$0;
                Ref.ObjectRef objectRef6 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.L$4;
                longRef4 = (Ref.LongRef) inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.L$3;
                BaseDao baseDao5 = (BaseDao) inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.L$2;
                list3 = (java.util.List) inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.L$1;
                sgk2 = (sGK) inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.L$0;
                C56391yDq.AEQbTJ(obj);
                i2 = i11;
                objectRef = objectRef6;
                baseDao3 = baseDao5;
                i = i12;
                int i13 = 1;
                i2 += i13;
                list2 = list3;
                sgk = sgk2;
                longRef3 = longRef4;
                if (i2 < i) {
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e6) {
                        list3 = list2;
                        objectRef2 = objectRef;
                        i3 = i;
                        longRef4 = longRef3;
                        sgk2 = sgk;
                        i4 = i2;
                        baseDao4 = baseDao3;
                        r0 = e6;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i4 < i3 - 1) {
                        }
                        i2 += i13;
                        list2 = list3;
                        sgk = sgk2;
                        longRef3 = longRef4;
                        if (i2 < i) {
                        }
                    } catch (java.lang.IllegalStateException e7) {
                        e2 = e7;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e8) {
                        e = e8;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        baseDao2 = baseDao3;
                        longRef2 = longRef3;
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        throw th;
                    }
                    Ref.ObjectRef objectRef7 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    InHouseIMConversationDao inHouseIMConversationDaoAYXKKw = sgk.AYXKKw();
                    inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.L$0 = sgk;
                    inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.L$1 = list2;
                    inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.L$2 = baseDao3;
                    inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.L$3 = longRef3;
                    inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.L$4 = objectRef;
                    inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.L$5 = objectRef7;
                    inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.L$6 = longRef3;
                    inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.L$7 = objectRef7;
                    inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.I$0 = i;
                    inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.I$1 = i2;
                    inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.I$2 = i2;
                    inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.J$0 = jNanoTime;
                    inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.label = 1;
                    if (inHouseIMConversationDaoAYXKKw.updateConversationsUnread(list2, inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    inHouseIMConversationManagerImpl$markLocalConversationsAsRead$12 = inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1;
                    i6 = i2;
                    objectRef4 = objectRef7;
                    longRef4 = longRef3;
                    i5 = i;
                    baseDao4 = baseDao3;
                    objectRef3 = objectRef4;
                    sGK sgk4 = sgk;
                    list4 = list2;
                    sgk3 = sgk4;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1 = inHouseIMConversationManagerImpl$markLocalConversationsAsRead$12;
                        sgk2 = sgk3;
                        objectRef2 = objectRef;
                        i3 = i5;
                        list3 = list4;
                        i4 = i2;
                        i2 = i6;
                        sQLiteDatabaseLockedException = e9;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i4 < i3 - 1) {
                            inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.L$0 = sgk2;
                            inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.L$1 = list3;
                            inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.L$2 = baseDao4;
                            inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.L$3 = longRef4;
                            inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.L$4 = objectRef2;
                            inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.L$5 = null;
                            inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.L$6 = null;
                            inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.L$7 = null;
                            inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.I$0 = i3;
                            inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.I$1 = i2;
                            inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1.label = 2;
                            if (DelayKt.delay(((long) (i4 + 1)) * 50, inHouseIMConversationManagerImpl$markLocalConversationsAsRead$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            objectRef = objectRef2;
                            baseDao3 = baseDao4;
                            i = i3;
                            i13 = 1;
                        } else {
                            objectRef = objectRef2;
                            baseDao3 = baseDao4;
                            i = i3;
                            i13 = 1;
                        }
                        i2 += i13;
                        list2 = list3;
                        sgk = sgk2;
                        longRef3 = longRef4;
                        if (i2 < i) {
                        }
                    } catch (java.lang.IllegalStateException e10) {
                        e2 = e10;
                        message = e2.getMessage();
                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                            C44159sFm.OLrzqt(e2);
                            throw e2;
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e11) {
                        e = e11;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    }
                    objectRef4.element = Unit.INSTANCE;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef3.element;
                    C44159sFm.EZpvd(baseDao4, longRef4.element);
                    pUU.KWHzl("InHouseIMConversationManagerImpl", "markLocalConversationAsRead - success with entity:" + list4);
                    return C56443yFo.KWHzl(true);
                }
                C44159sFm.EZpvd(baseDao3, longRef3.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("InHouseIMConversationManagerImpl", "markLocalConversationAsRead - start");
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (MaxSeqData maxSeqData : list) {
                arrayList.add(new ConversationUnreadUpdateEntity(maxSeqData.getChannelId(), maxSeqData.getLastMsgSeq(), C56443yFo.AEQbTJ(0)));
            }
            InHouseIMConversationDao inHouseIMConversationDaoAYXKKw2 = AYXKKw();
            longRef3 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 3;
            i2 = 0;
            sgk = this;
            baseDao3 = inHouseIMConversationDaoAYXKKw2;
            list2 = arrayList;
            if (i2 < i) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            longRef2 = longRef;
            baseDao2 = baseDao;
        }
    }

    @Override // o.sGI
    public Flow<java.lang.Integer> copydefault() {
        return FlowKt.filterNotNull(FlowKt.distinctUntilChanged(AYXKKw().getConversationTotalCountFlow()));
    }

    @Override // o.sGI
    public Flow<java.lang.Integer> EZpvd() {
        return FlowKt.distinctUntilChanged(InHouseIMConversationDao.Activity.getConversationCountWithoutNotificationFlow$default(AYXKKw(), null, 0, 0, 7, null));
    }

    @Override // o.sGI
    public Flow<java.lang.Integer> gEmmrt() throws java.lang.Exception {
        InHouseIMConversationDao inHouseIMConversationDaoAYXKKw = AYXKKw();
        Ref.LongRef longRef = new Ref.LongRef();
        java.lang.Exception exc = null;
        int i = 0;
        while (i < 3) {
            try {
                long jNanoTime = java.lang.System.nanoTime();
                TaskDescription taskDescription = new TaskDescription(FlowKt.distinctUntilChanged(InHouseIMConversationDao.Activity.getSystemNotificationTotalUnreadCount$default(AYXKKw(), 0, 1, null)));
                long jValueOf = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                longRef.element = jValueOf;
                C44159sFm.EZpvd(inHouseIMConversationDaoAYXKKw, jValueOf);
                return taskDescription;
            } catch (android.database.sqlite.SQLiteDatabaseLockedException e) {
                try {
                    C44159sFm.copydefault(e, exc);
                    i++;
                    exc = e;
                } finally {
                    C44159sFm.EZpvd(inHouseIMConversationDaoAYXKKw, longRef.element);
                }
            } catch (java.lang.IllegalStateException e2) {
                java.lang.String message = e2.getMessage();
                if (message != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                    C44159sFm.OLrzqt(e2);
                    throw e2;
                }
                C44159sFm.copydefault(e2);
                throw e2;
            } catch (java.lang.Exception e3) {
                C44159sFm.OLrzqt(e3);
                throw e3;
            }
        }
        if (exc == null) {
            exc = new java.lang.Exception("Database Operation failed after 3 attempts");
        }
        C44159sFm.OLrzqt(exc);
        throw exc;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v29, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0196 A[Catch: all -> 0x004e, TryCatch #11 {all -> 0x004e, blocks: (B:13:0x0046, B:37:0x0156, B:51:0x0189, B:52:0x018c, B:55:0x0190, B:57:0x0196, B:59:0x01a2, B:60:0x01a5, B:61:0x01a6, B:62:0x01a9), top: B:88:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bf A[Catch: all -> 0x01f9, TRY_LEAVE, TryCatch #6 {all -> 0x01f9, blocks: (B:66:0x01b2, B:68:0x01bf), top: B:86:0x01b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x01e4 -> B:72:0x01e7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01ed -> B:73:0x01eb). Please report as a decompilation issue!!! */
    @Override // o.sGI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AhwBna(@NotNull java.lang.String str, @NotNull Continuation<? super InHouseIMConversationEntity> continuation) throws java.lang.Exception {
        InHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1 inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1;
        BaseDao baseDao;
        Ref.LongRef longRef;
        Ref.ObjectRef objectRef;
        InHouseIMConversationEntity inHouseIMConversationEntity;
        Ref.LongRef longRef2;
        int i;
        int i2;
        sGK sgk;
        InHouseIMConversationEntity inHouseIMConversationEntity2;
        int i3;
        Ref.ObjectRef objectRef2;
        int i4;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        BaseDao baseDao2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        ?? r0;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.LongRef longRef3;
        long jNanoTime;
        int i5;
        int i6;
        if (continuation instanceof InHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1) {
            inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1 = (InHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1) continuation;
            int i7 = inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.label = i7 - Integer.MIN_VALUE;
            } else {
                inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1 = new InHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1(this, continuation);
            }
        }
        java.lang.Object obj = inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    jNanoTime = inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.J$0;
                    i2 = inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.I$2;
                    i3 = inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.I$1;
                    int i9 = inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.I$0;
                    objectRef4 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.L$7;
                    longRef2 = (Ref.LongRef) inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.L$6;
                    objectRef3 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.L$5;
                    objectRef = (Ref.ObjectRef) inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.L$4;
                    longRef = (Ref.LongRef) inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.L$3;
                    baseDao = (BaseDao) inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.L$2;
                    inHouseIMConversationEntity = (InHouseIMConversationEntity) inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.L$1;
                    sgk = (sGK) inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        longRef3 = longRef;
                        i6 = i3;
                        baseDao2 = baseDao;
                        i5 = i9;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        objectRef2 = objectRef;
                        longRef2 = longRef;
                        inHouseIMConversationEntity2 = inHouseIMConversationEntity;
                        i4 = i9;
                        sQLiteDatabaseLockedException = e3;
                        baseDao2 = baseDao;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i2 < i4 - 1) {
                        }
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    } catch (java.lang.IllegalStateException e4) {
                        e2 = e4;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e5) {
                        e = e5;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    }
                    objectRef4.element = Unit.INSTANCE;
                    longRef2.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t = objectRef3.element;
                    C44159sFm.EZpvd(baseDao2, longRef3.element);
                    return inHouseIMConversationEntity;
                }
                if (i8 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i10 = inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.I$1;
                i4 = inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.I$0;
                objectRef2 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.L$4;
                Ref.LongRef longRef4 = (Ref.LongRef) inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.L$3;
                baseDao2 = (BaseDao) inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.L$2;
                inHouseIMConversationEntity2 = (InHouseIMConversationEntity) inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.L$1;
                sGK sgk2 = (sGK) inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objectRef = objectRef2;
                sgk = sgk2;
                longRef2 = longRef4;
                i3 = i10;
                i2 = i3 + 1;
                baseDao = baseDao2;
                inHouseIMConversationEntity = inHouseIMConversationEntity2;
                i = i4;
                if (i2 >= i) {
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e6) {
                        try {
                            i3 = i2;
                            objectRef2 = objectRef;
                            inHouseIMConversationEntity2 = inHouseIMConversationEntity;
                            i4 = i;
                            sQLiteDatabaseLockedException = e6;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i2 < i4 - 1) {
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            Ref.LongRef longRef5 = longRef2;
                            longRef = longRef5;
                            baseDao = baseDao2;
                            C44159sFm.EZpvd(baseDao, longRef.element);
                            throw th;
                        }
                        baseDao2 = baseDao;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    } catch (java.lang.IllegalStateException e7) {
                        e2 = e7;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e8) {
                        e = e8;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        longRef = longRef2;
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    }
                    objectRef4 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.L$0 = sgk;
                    inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.L$1 = inHouseIMConversationEntity;
                    inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.L$2 = baseDao;
                    inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.L$3 = longRef2;
                    inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.L$4 = objectRef;
                    inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.L$5 = objectRef4;
                    inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.L$6 = longRef2;
                    inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.L$7 = objectRef4;
                    inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.I$0 = i;
                    inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.I$1 = i2;
                    inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.I$2 = i2;
                    inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.J$0 = jNanoTime;
                    inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.label = 1;
                    if (sgk.AYXKKw().insertOrReplace(new InHouseIMConversationEntity[]{inHouseIMConversationEntity}, inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    i6 = i2;
                    objectRef3 = objectRef4;
                    longRef3 = longRef2;
                    int i11 = i;
                    baseDao2 = baseDao;
                    i5 = i11;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        objectRef2 = objectRef;
                        i4 = i5;
                        inHouseIMConversationEntity2 = inHouseIMConversationEntity;
                        longRef2 = longRef3;
                        i3 = i6;
                        r0 = e9;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i2 < i4 - 1) {
                            inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.L$0 = sgk;
                            inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.L$1 = inHouseIMConversationEntity2;
                            inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.L$2 = baseDao2;
                            inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.L$3 = longRef2;
                            inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.L$4 = objectRef2;
                            inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.L$5 = null;
                            inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.L$6 = null;
                            inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.L$7 = null;
                            inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.I$0 = i4;
                            inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.I$1 = i3;
                            inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1.label = 2;
                            if (DelayKt.delay(((long) (i2 + 1)) * 50, inHouseIMConversationManagerImpl$storeLivestreamChatRoomConversation$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            i10 = i3;
                            longRef4 = longRef2;
                            sgk2 = sgk;
                            objectRef = objectRef2;
                            sgk = sgk2;
                            longRef2 = longRef4;
                            i3 = i10;
                            i2 = i3 + 1;
                            baseDao = baseDao2;
                            inHouseIMConversationEntity = inHouseIMConversationEntity2;
                            i = i4;
                            if (i2 >= i) {
                            }
                        } else {
                            objectRef = objectRef2;
                            i2 = i3 + 1;
                            baseDao = baseDao2;
                            inHouseIMConversationEntity = inHouseIMConversationEntity2;
                            i = i4;
                            if (i2 >= i) {
                            }
                        }
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    } catch (java.lang.IllegalStateException e10) {
                        e2 = e10;
                        message = e2.getMessage();
                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                            C44159sFm.OLrzqt(e2);
                            throw e2;
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e11) {
                        e = e11;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    }
                    objectRef4.element = Unit.INSTANCE;
                    longRef2.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef3.element;
                    C44159sFm.EZpvd(baseDao2, longRef3.element);
                    return inHouseIMConversationEntity;
                }
                C44159sFm.EZpvd(baseDao, longRef2.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            InHouseIMConversationEntity inHouseIMConversationEntity3 = new InHouseIMConversationEntity(str, C56443yFo.AEQbTJ(InHouseIMChannelType.LiveStreamChatRoom.getApiValue()), 0, (java.lang.Integer) null, (java.lang.Integer) null, 0, 0, (java.lang.Integer) null, 0, 0, 0, (java.lang.Integer) null, C56443yFo.KWHzl(0L), (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, 0L, (DraftMessageModel) null, (java.lang.String) null, C56443yFo.AEQbTJ(ConversationStatus.FOREVER_HIDDEN.getValue()), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.Integer) null, (java.util.List) null, (JsonElement) null, 456601596, (DefaultConstructorMarker) null);
            InHouseIMConversationDao inHouseIMConversationDaoAYXKKw = AYXKKw();
            Ref.LongRef longRef6 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            inHouseIMConversationEntity = inHouseIMConversationEntity3;
            baseDao = inHouseIMConversationDaoAYXKKw;
            longRef2 = longRef6;
            i = 3;
            i2 = 0;
            sgk = this;
            if (i2 >= i) {
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:28:0x0096 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v23, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0197: MOVE (r7 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:74:0x0197 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0198: MOVE (r6 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:74:0x0197 */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013d A[Catch: all -> 0x004b, TryCatch #9 {all -> 0x004b, blocks: (B:13:0x0042, B:36:0x00ea, B:51:0x0130, B:52:0x0133, B:55:0x0137, B:57:0x013d, B:59:0x0149, B:60:0x014c, B:61:0x014d, B:62:0x0150, B:66:0x0158, B:68:0x0165), top: B:82:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0165 A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #9 {all -> 0x004b, blocks: (B:13:0x0042, B:36:0x00ea, B:51:0x0130, B:52:0x0133, B:55:0x0137, B:57:0x013d, B:59:0x0149, B:60:0x014c, B:61:0x014d, B:62:0x0150, B:66:0x0158, B:68:0x0165), top: B:82:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.Object, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0186 -> B:71:0x0189). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x018c -> B:71:0x0189). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        InHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1 inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1;
        sGK sgk;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDao2;
        Ref.ObjectRef objectRef;
        int i;
        sGK sgk2;
        Ref.LongRef longRef3;
        int i2;
        BaseDao baseDao3;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        sGK sgk3;
        BaseDao baseDao4;
        Ref.LongRef longRef4;
        Ref.ObjectRef objectRef2;
        int i3;
        ?? r0;
        int i4;
        int i5;
        int i6;
        android.database.sqlite.SQLiteDatabaseLockedException e3;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        BaseDao baseDao5;
        Ref.LongRef longRef5;
        long jNanoTime;
        if (continuation instanceof InHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1) {
            inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1 = (InHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1) continuation;
            int i7 = inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.label = i7 - Integer.MIN_VALUE;
                sgk = this;
            } else {
                sgk = this;
                inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1 = new InHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1(sgk, continuation);
            }
        }
        java.lang.Object obj = inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    jNanoTime = inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.J$0;
                    i6 = inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.I$2;
                    i5 = inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.I$1;
                    i4 = inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.I$0;
                    objectRef4 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.L$6;
                    longRef3 = (Ref.LongRef) inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.L$5;
                    objectRef3 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.L$4;
                    objectRef = (Ref.ObjectRef) inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.L$3;
                    longRef2 = (Ref.LongRef) inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.L$2;
                    baseDao2 = (BaseDao) inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.L$1;
                    sgk2 = (sGK) inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        baseDao5 = baseDao2;
                        i = i4;
                        longRef5 = longRef2;
                        i2 = i5;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e4) {
                        e3 = e4;
                        objectRef2 = objectRef;
                        sgk3 = sgk2;
                        Ref.LongRef longRef6 = longRef2;
                        i2 = i6;
                        i3 = i5;
                        longRef4 = longRef6;
                        int i9 = i4;
                        baseDao4 = baseDao2;
                        i = i9;
                        r0 = e3;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i2 < i - 1) {
                        }
                        sgk2 = sgk3;
                        i2 = i3 + 1;
                        objectRef = objectRef2;
                        longRef3 = longRef4;
                        baseDao3 = baseDao4;
                        if (i2 < i) {
                        }
                    } catch (java.lang.IllegalStateException e5) {
                        e2 = e5;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e6) {
                        e = e6;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        throw th;
                    }
                    ?? r02 = Unit.INSTANCE;
                    objectRef4.element = r02;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t = objectRef3.element;
                    C44159sFm.EZpvd(baseDao5, longRef5.element);
                    return r02;
                }
                if (i8 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.I$1;
                int i10 = inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.I$0;
                objectRef2 = (Ref.ObjectRef) inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.L$3;
                longRef4 = (Ref.LongRef) inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.L$2;
                baseDao4 = (BaseDao) inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.L$1;
                sgk3 = (sGK) inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.L$0;
                C56391yDq.AEQbTJ(obj);
                i = i10;
                sgk2 = sgk3;
                i2 = i3 + 1;
                objectRef = objectRef2;
                longRef3 = longRef4;
                baseDao3 = baseDao4;
                if (i2 < i) {
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e7) {
                        baseDao4 = baseDao3;
                        objectRef2 = objectRef;
                        i3 = i2;
                        sgk3 = sgk2;
                        longRef4 = longRef3;
                        r0 = e7;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i2 < i - 1) {
                        }
                        sgk2 = sgk3;
                        i2 = i3 + 1;
                        objectRef = objectRef2;
                        longRef3 = longRef4;
                        baseDao3 = baseDao4;
                        if (i2 < i) {
                        }
                    } catch (java.lang.IllegalStateException e8) {
                        e2 = e8;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e9) {
                        e = e9;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        baseDao2 = baseDao3;
                        longRef2 = longRef3;
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        throw th;
                    }
                    objectRef4 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    InHouseIMConversationDao inHouseIMConversationDaoAYXKKw = sgk2.AYXKKw();
                    inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.L$0 = sgk2;
                    inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.L$1 = baseDao3;
                    inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.L$2 = longRef3;
                    inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.L$3 = objectRef;
                    inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.L$4 = objectRef4;
                    inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.L$5 = longRef3;
                    inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.L$6 = objectRef4;
                    inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.I$0 = i;
                    inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.I$1 = i2;
                    inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.I$2 = i2;
                    inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.J$0 = jNanoTime;
                    inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.label = 1;
                    if (InHouseIMConversationDao.Activity.deleteLiveStreamingConversations$default(inHouseIMConversationDaoAYXKKw, null, inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1, 1, null) == objCopydefault) {
                        return objCopydefault;
                    }
                    baseDao5 = baseDao3;
                    i6 = i2;
                    objectRef3 = objectRef4;
                    longRef5 = longRef3;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                        e3 = e10;
                        BaseDao baseDao6 = baseDao5;
                        i4 = i;
                        baseDao2 = baseDao6;
                        Ref.LongRef longRef7 = longRef5;
                        i5 = i2;
                        longRef2 = longRef7;
                        objectRef2 = objectRef;
                        sgk3 = sgk2;
                        Ref.LongRef longRef62 = longRef2;
                        i2 = i6;
                        i3 = i5;
                        longRef4 = longRef62;
                        int i92 = i4;
                        baseDao4 = baseDao2;
                        i = i92;
                        r0 = e3;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i2 < i - 1) {
                            inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.L$0 = sgk3;
                            inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.L$1 = baseDao4;
                            inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.L$2 = longRef4;
                            inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.L$3 = objectRef2;
                            inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.L$4 = null;
                            inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.L$5 = null;
                            inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.L$6 = null;
                            inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.I$0 = i;
                            inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.I$1 = i3;
                            inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1.label = 2;
                            if (DelayKt.delay(((long) (i2 + 1)) * 50, inHouseIMConversationManagerImpl$deleteLiveStreamingConversations$1) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                        sgk2 = sgk3;
                        i2 = i3 + 1;
                        objectRef = objectRef2;
                        longRef3 = longRef4;
                        baseDao3 = baseDao4;
                        if (i2 < i) {
                        }
                    } catch (java.lang.IllegalStateException e11) {
                        e2 = e11;
                        message = e2.getMessage();
                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                            C44159sFm.OLrzqt(e2);
                            throw e2;
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e12) {
                        e = e12;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    }
                    ?? r022 = Unit.INSTANCE;
                    objectRef4.element = r022;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef3.element;
                    C44159sFm.EZpvd(baseDao5, longRef5.element);
                    return r022;
                }
                C44159sFm.EZpvd(baseDao3, longRef3.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            C44124sEe.imLogConversation$default("start deleteLiveStreamingConversations...", null, 2, null);
            InHouseIMConversationDao inHouseIMConversationDaoAYXKKw2 = AYXKKw();
            Ref.LongRef longRef8 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 3;
            sgk2 = sgk;
            longRef3 = longRef8;
            i2 = 0;
            baseDao3 = inHouseIMConversationDaoAYXKKw2;
            if (i2 < i) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            longRef2 = longRef;
            baseDao2 = baseDao;
        }
    }
}
