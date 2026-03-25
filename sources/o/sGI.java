package o;

import com.okinc.okimcore.model.im.conversation.InAppConversationExtra;
import com.okinc.okimcore.model.im.inhouseim.ReceiveMessageOptionType;
import com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType;
import com.okinc.okimcore.model.other.AnnouncementBanner;
import com.okinc.okimcore.model.remote.MaxSeqData;
import com.okinc.okimcore.model.remote.UpdateConversationReq;
import com.okinc.okimcore.model.room.inhouseim.DraftMessageModel;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationListData;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationSimpleInfoEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMServerConversationEntity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import o.C44499sSb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface sGI {
    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull InHouseIMChannelType inHouseIMChannelType, int i, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, DraftMessageModel draftMessageModel, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.String> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, boolean z, boolean z2, @NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object AEQbTJ(@NotNull Continuation<? super java.lang.Boolean> continuation);

    Flow<java.lang.Integer> AEQbTJ();

    java.lang.Object AhwBna(@NotNull java.lang.String str, @NotNull Continuation<? super InHouseIMConversationEntity> continuation);

    Flow<java.lang.Integer> AhwBna();

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super InHouseIMConversationListData> continuation);

    java.lang.Object EZpvd(@NotNull Continuation<? super AnnouncementBanner> continuation);

    Flow<java.lang.Integer> EZpvd();

    Flow<C44499sSb.TaskDescription> EZpvd(@NotNull java.lang.String str);

    java.lang.Object KWHzl(@NotNull UpdateConversationReq updateConversationReq, boolean z, @NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super InHouseIMConversationEntity> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super InHouseIMConversationListData> continuation);

    java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation);

    Flow<java.util.List<InHouseIMConversationListData>> KWHzl();

    Flow<java.util.List<InHouseIMConversationListData>> KWHzl(int i, boolean z, boolean z2);

    Flow<java.lang.Integer> KWHzl(@NotNull ReceiveMessageOptionType receiveMessageOptionType, @NotNull java.util.List<? extends InHouseIMChannelType> list);

    Flow<C44499sSb.Activity> KWHzl(@NotNull java.lang.String str);

    java.lang.Object OLrzqt(@NotNull ReceiveMessageOptionType receiveMessageOptionType, @NotNull Continuation<? super java.lang.Integer> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull InGroupStatus inGroupStatus, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Integer> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, boolean z, boolean z2, @NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object OLrzqt(@NotNull java.util.List<MaxSeqData> list, @NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object OLrzqt(@NotNull java.util.Set<java.lang.String> set, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object OLrzqt(@NotNull Continuation<? super java.util.List<java.lang.String>> continuation);

    java.lang.Object OLrzqt(@NotNull C44489sRs c44489sRs, @NotNull Continuation<? super java.util.List<InHouseIMConversationSimpleInfoEntity>> continuation);

    Flow<java.util.List<java.lang.String>> OLrzqt();

    Flow<InHouseIMConversationListData> OLrzqt(@NotNull java.lang.String str);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull InHouseIMChannelType inHouseIMChannelType, InAppConversationExtra inAppConversationExtra, java.lang.Long l, java.lang.Integer num, @NotNull Continuation<? super InHouseIMConversationEntity> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object copydefault(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.List<InHouseIMServerConversationEntity>> continuation);

    Flow<java.lang.Integer> copydefault();

    Flow<java.lang.Integer> copydefault(@NotNull ReceiveMessageOptionType receiveMessageOptionType);

    Flow<java.lang.Integer> copydefault(@NotNull java.lang.String str);

    Flow<java.lang.Integer> djBIcL();

    java.lang.Object gEmmrt(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation);

    Flow<java.lang.Integer> gEmmrt();

    java.lang.Object valueOf(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation);

    public static final class TaskDescription {
        public static /* synthetic */ java.lang.Object getAndSaveSingleConversation$default(sGI sgi, java.lang.String str, boolean z, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndSaveSingleConversation");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return sgi.KWHzl(str, z, (Continuation<? super InHouseIMConversationListData>) continuation);
        }

        public static /* synthetic */ java.lang.Object pinConversation$default(sGI sgi, java.lang.String str, boolean z, boolean z2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pinConversation");
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            return sgi.AEQbTJ(str, z, z2, (Continuation<? super java.lang.Boolean>) continuation);
        }

        public static /* synthetic */ java.lang.Object flaggedConversation$default(sGI sgi, java.lang.String str, boolean z, boolean z2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: flaggedConversation");
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            return sgi.OLrzqt(str, z, z2, continuation);
        }

        public static /* synthetic */ java.lang.Object updateConversations$default(sGI sgi, UpdateConversationReq updateConversationReq, boolean z, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateConversations");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return sgi.KWHzl(updateConversationReq, z, (Continuation<? super java.lang.Boolean>) continuation);
        }

        public static /* synthetic */ java.lang.Object storeInAppConversation$default(sGI sgi, java.lang.String str, InHouseIMChannelType inHouseIMChannelType, InAppConversationExtra inAppConversationExtra, java.lang.Long l, java.lang.Integer num, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return sgi.copydefault(str, inHouseIMChannelType, (i & 4) != 0 ? null : inAppConversationExtra, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : num, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: storeInAppConversation");
        }
    }
}
