package com.okinc.okimcore.feature.message.repository.local.inhouseim;

import com.okinc.okimcore.common.database.BaseDao;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import com.okinc.okimcore.model.remote.MaxSeqData;
import com.okinc.okimcore.model.remote.MsgIdWithVisibility;
import com.okinc.okimcore.model.room.inhouseim.ConversationStatus;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageWithReactions;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import o.C44179sGf;
import o.C56391yDq;
import o.C56442yFn;
import o.sQT;
import o.sQY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface InHouseIMMessageDao extends BaseDao {
    public static final Application Companion = Application.EZpvd;
    public static final String REQUEST_IGNORE_RESPONSE_MESSAGE = "REQUEST_IGNORE_RESPONSE_MESSAGE";

    /* JADX INFO: renamed from: com.okinc.okimcore.feature.message.repository.local.inhouseim.InHouseIMMessageDao$insertMessageAndUpdateSequence$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TaskDescription.KWHzl(null, null, 0L, this);
        }
    }

    Object deleteMessages(@NotNull InHouseIMMessageEntity[] inHouseIMMessageEntityArr, @NotNull Continuation<? super Unit> continuation);

    Object deleteMessagesByChannelIds(@NotNull String[] strArr, @NotNull Continuation<? super Unit> continuation);

    Object getAllMessageIdWithVisibilityBySeqList(@NotNull String str, @NotNull Set<Long> set, @NotNull Continuation<? super List<MsgIdWithVisibility>> continuation);

    Object getAllMessagesByClientIds(@NotNull String str, @NotNull String[] strArr, @NotNull Continuation<? super List<InHouseIMMessageWithReactions>> continuation);

    Object getAllMessagesByIds(@NotNull String str, @NotNull Long[] lArr, @NotNull Continuation<? super List<InHouseIMMessageWithReactions>> continuation);

    Object getAllMessagesWithReactionsBySequenceRange(@NotNull String str, long j, long j2, @NotNull Continuation<? super List<InHouseIMMessageWithReactions>> continuation);

    Object getAllPendingMessages(@NotNull Continuation<? super List<InHouseIMMessageEntity>> continuation);

    Object getClientMessageId(@NotNull String str, long j, @NotNull Continuation<? super String> continuation);

    Object getConversationLatestMessage(@NotNull String str, @NotNull Continuation<? super InHouseIMMessageEntity> continuation);

    Object getConversationOldestMessage(@NotNull String str, @NotNull Continuation<? super InHouseIMMessageEntity> continuation);

    @Override // com.okinc.okimcore.common.database.BaseDao
    String getDaoName();

    Object getExistingSequences(@NotNull String str, @NotNull Set<Long> set, @NotNull Continuation<? super List<Long>> continuation);

    Object getFirstUnreadReadSeq(@NotNull String str, long j, int i, @NotNull String str2, @NotNull Continuation<? super Long> continuation);

    Flow<InHouseIMMessageEntity> getLastVisibleMessageFlow(@NotNull String str);

    Object getLatestCallMessage(@NotNull String str, int i, @NotNull Continuation<? super InHouseIMMessageEntity> continuation);

    Object getLatestMessage(@NotNull String str, @NotNull Continuation<? super InHouseIMMessageEntity> continuation);

    Object getLatestReadReceiptFromCurrentUser(@NotNull String str, int i, @NotNull String str2, @NotNull Continuation<? super InHouseIMMessageEntity> continuation);

    Object getMaxSeqByChannelId(@NotNull String str, @NotNull Continuation<? super Long> continuation);

    Object getMaxSeqForEachChannel(@NotNull List<String> list, @NotNull Continuation<? super List<MaxSeqData>> continuation);

    Object getMaxSeqInBoundMsgIsReceiveReadReceiptHandled(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Long> continuation);

    Object getMaxSeqInBoundMsgIsReceiveReadReceiptNotHandled(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Long> continuation);

    Object getMaxSequenceMessageWithReceivedReadReceiptByChannelId(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Long> continuation);

    Object getMediaMessageHistoryAfter(@NotNull String str, int i, int i2, int i3, long j, @NotNull Continuation<? super List<InHouseIMMessageWithReactions>> continuation);

    Object getMediaMessageHistoryBefore(@NotNull String str, int i, int i2, int i3, long j, @NotNull Continuation<? super List<InHouseIMMessageWithReactions>> continuation);

    Object getMessageById(@NotNull String str, @NotNull Continuation<? super InHouseIMMessageEntity> continuation);

    Object getMessageBySequence(@NotNull String str, long j, @NotNull Continuation<? super InHouseIMMessageEntity> continuation);

    Flow<InHouseIMMessageEntity> getMessageBySequenceFlow(@NotNull String str, long j);

    Object getMessageBySequenceWithReaction(@NotNull String str, long j, @NotNull Continuation<? super InHouseIMMessageWithReactions> continuation);

    Object getMessageEntityBySequence(@NotNull String str, long j, @NotNull Continuation<? super InHouseIMMessageEntity> continuation);

    Object getMessageTimeRangeBySequenceRange(@NotNull String str, long j, long j2, @NotNull Continuation<? super sQT> continuation);

    Object getMessagesBySequenceList(@NotNull String str, @NotNull List<Long> list, @NotNull Continuation<? super List<InHouseIMMessageEntity>> continuation);

    Object getMessagesBySequenceRange(@NotNull String str, long j, long j2, @NotNull Continuation<? super List<InHouseIMMessageEntity>> continuation);

    Object getMessagesWithReactionBySequenceList(@NotNull String str, @NotNull List<Long> list, @NotNull Continuation<? super List<InHouseIMMessageWithReactions>> continuation);

    Object getMinSeqByChannelId(@NotNull String str, @NotNull Continuation<? super Long> continuation);

    Object getNotSentMessagesInTimeRangeCount(@NotNull String str, long j, long j2, @NotNull Continuation<? super Integer> continuation);

    Object getRepliedMessageByBatch(@NotNull String str, @NotNull List<Long> list, @NotNull Continuation<? super List<InHouseIMMessageEntity>> continuation);

    Flow<Integer> getTotalMessageCount();

    Object getTotalOfMessage(@NotNull String str, @NotNull Continuation<? super Integer> continuation);

    Object getTotalOfMessageMentioningAll(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull Continuation<? super Integer> continuation);

    Object getTotalOfMessageMentioningMe(@NotNull String str, @NotNull String str2, int i, @NotNull Continuation<? super Integer> continuation);

    Object getTotalOfUnreadCount(@NotNull String str, @NotNull String str2, int i, @NotNull Continuation<? super Integer> continuation);

    Object getVisibleMessagesSentTimeRangeAsc(@NotNull String str, long j, long j2, int i, @NotNull Continuation<? super List<InHouseIMMessageWithReactions>> continuation);

    Object getVisibleMessagesSentTimeRangeDesc(@NotNull String str, long j, long j2, int i, @NotNull Continuation<? super List<InHouseIMMessageWithReactions>> continuation);

    Object getVisibleMinSeqByChannelId(@NotNull String str, @NotNull Continuation<? super Long> continuation);

    Object insertMessage(@NotNull InHouseIMMessageEntity[] inHouseIMMessageEntityArr, @NotNull Continuation<? super Unit> continuation);

    Object insertMessageAndUpdateSequence(@NotNull InHouseIMMessageEntity inHouseIMMessageEntity, long j, @NotNull Continuation<? super Unit> continuation);

    Flow<List<InHouseIMMessageEntity>> observeAllCustomMessagesAfterSeq(@NotNull String str, long j);

    Object searchMessagesPaginated(@NotNull String str, String str2, int i, Long l, boolean z, @NotNull List<Integer> list, int i2, @NotNull Continuation<? super List<sQY>> continuation);

    Object setInBoundMsgIsReceiveReadReceiptHandled(@NotNull String str, long j, @NotNull String str2, @NotNull Continuation<? super Unit> continuation);

    Object setMessageRead(@NotNull String str, long j, @NotNull Continuation<? super Unit> continuation);

    Object setMessageReceivedReadReceipt(@NotNull String str, long j, @NotNull String str2, @NotNull Continuation<? super Unit> continuation);

    Object setMessagesAsReadWithChannels(@NotNull List<String> list, @NotNull Continuation<? super Unit> continuation);

    Object updateMessageList(@NotNull List<InHouseIMMessageEntity> list, @NotNull Continuation<? super Unit> continuation);

    Object updateMessageReactionTime(@NotNull String str, long j, long j2, @NotNull Continuation<? super Unit> continuation);

    Object updateMessageSequence(@NotNull String str, long j, @NotNull Continuation<? super Unit> continuation);

    Object updateVisibility(@NotNull String str, long j, boolean z, @NotNull Continuation<? super Unit> continuation);

    public static final class Application {
        public static final /* synthetic */ Application EZpvd = new Application();

        private Application() {
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static String OLrzqt(@NotNull InHouseIMMessageDao inHouseIMMessageDao) {
            return "InHouseIMMessageDao";
        }

        public static /* synthetic */ Object getLatestCallMessage$default(InHouseIMMessageDao inHouseIMMessageDao, String str, int i, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLatestCallMessage");
            }
            if ((i2 & 2) != 0) {
                i = InHouseIMContentType.VoiceCall.getApiValue();
            }
            return inHouseIMMessageDao.getLatestCallMessage(str, i, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object KWHzl(@NotNull InHouseIMMessageDao inHouseIMMessageDao, @NotNull InHouseIMMessageEntity inHouseIMMessageEntity, long j, @NotNull Continuation<? super Unit> continuation) throws Throwable {
            AnonymousClass1 anonymousClass1;
            if (continuation instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) continuation;
                int i = anonymousClass1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.label = i - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(continuation);
                }
            }
            Object obj = anonymousClass1.result;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = anonymousClass1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                anonymousClass1.L$0 = inHouseIMMessageDao;
                anonymousClass1.L$1 = inHouseIMMessageEntity;
                anonymousClass1.J$0 = j;
                anonymousClass1.label = 1;
                if (inHouseIMMessageDao.insertMessage(new InHouseIMMessageEntity[]{inHouseIMMessageEntity}, anonymousClass1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                j = anonymousClass1.J$0;
                inHouseIMMessageEntity = (InHouseIMMessageEntity) anonymousClass1.L$1;
                inHouseIMMessageDao = (InHouseIMMessageDao) anonymousClass1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            String messageId = inHouseIMMessageEntity.getMessageId();
            anonymousClass1.L$0 = null;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 2;
            if (inHouseIMMessageDao.updateMessageSequence(messageId, j, anonymousClass1) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Object getLatestReadReceiptFromCurrentUser$default(InHouseIMMessageDao inHouseIMMessageDao, String str, int i, String str2, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLatestReadReceiptFromCurrentUser");
            }
            if ((i2 & 2) != 0) {
                i = InHouseIMContentType.ReadReceipt.getApiValue();
            }
            return inHouseIMMessageDao.getLatestReadReceiptFromCurrentUser(str, i, str2, continuation);
        }

        public static /* synthetic */ Object getTotalOfUnreadCount$default(InHouseIMMessageDao inHouseIMMessageDao, String str, String str2, int i, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTotalOfUnreadCount");
            }
            if ((i2 & 4) != 0) {
                i = InHouseIMContentType.SystemMessage.getApiValue();
            }
            return inHouseIMMessageDao.getTotalOfUnreadCount(str, str2, i, continuation);
        }

        public static /* synthetic */ Object getTotalOfMessageMentioningMe$default(InHouseIMMessageDao inHouseIMMessageDao, String str, String str2, int i, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTotalOfMessageMentioningMe");
            }
            if ((i2 & 4) != 0) {
                i = InHouseIMContentType.SystemMessage.getApiValue();
            }
            return inHouseIMMessageDao.getTotalOfMessageMentioningMe(str, str2, i, continuation);
        }

        public static /* synthetic */ Object getTotalOfMessageMentioningAll$default(InHouseIMMessageDao inHouseIMMessageDao, String str, String str2, int i, int i2, Continuation continuation, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTotalOfMessageMentioningAll");
            }
            if ((i3 & 4) != 0) {
                i = InHouseIMContentType.SystemMessage.getApiValue();
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                i2 = 2;
            }
            return inHouseIMMessageDao.getTotalOfMessageMentioningAll(str, str2, i4, i2, continuation);
        }

        public static /* synthetic */ Object getFirstUnreadReadSeq$default(InHouseIMMessageDao inHouseIMMessageDao, String str, long j, int i, String str2, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFirstUnreadReadSeq");
            }
            if ((i2 & 4) != 0) {
                i = InHouseIMContentType.SystemMessage.getApiValue();
            }
            return inHouseIMMessageDao.getFirstUnreadReadSeq(str, j, i, str2, continuation);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: com.okinc.okimcore.feature.message.repository.local.inhouseim.InHouseIMMessageDao */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object searchMessagesPaginated$default(InHouseIMMessageDao inHouseIMMessageDao, String str, String str2, int i, Long l, boolean z, List list, int i2, Continuation continuation, int i3, Object obj) {
            if (obj == null) {
                return inHouseIMMessageDao.searchMessagesPaginated(str, (i3 & 2) != 0 ? null : str2, i, (i3 & 8) != 0 ? null : l, z, (i3 & 32) != 0 ? C44179sGf.AEQbTJ.EZpvd() : list, (i3 & 64) != 0 ? ConversationStatus.FOREVER_HIDDEN.getValue() : i2, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: searchMessagesPaginated");
        }
    }
}
