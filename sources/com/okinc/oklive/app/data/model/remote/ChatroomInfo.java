package com.okinc.oklive.app.data.model.remote;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ChatroomInfo {
    public static final int $stable = 8;

    @SerializedName("enabled")
    private final Integer enabled;

    @SerializedName("maxCharacterLimit")
    private final Integer maxCharacterLimit;

    @SerializedName("messageInterval")
    private final Integer messageInterval;

    @SerializedName("participants")
    private final ChatroomParticipants participants;

    @SerializedName("permissions")
    private final ChatroomPermissions permissions;

    @SerializedName("pinnedMessageList")
    private final List<PinnedMessageModel> pinnedMessageList;

    @SerializedName("role")
    private final Integer role;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChatroomInfo() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.oklive.app.data.model.remote.ChatroomInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatroomInfo copy$default(ChatroomInfo chatroomInfo, Integer num, Integer num2, Integer num3, ChatroomPermissions chatroomPermissions, Integer num4, ChatroomParticipants chatroomParticipants, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = chatroomInfo.enabled;
        }
        if ((i & 2) != 0) {
            num2 = chatroomInfo.maxCharacterLimit;
        }
        Integer num5 = num2;
        if ((i & 4) != 0) {
            num3 = chatroomInfo.messageInterval;
        }
        Integer num6 = num3;
        if ((i & 8) != 0) {
            chatroomPermissions = chatroomInfo.permissions;
        }
        ChatroomPermissions chatroomPermissions2 = chatroomPermissions;
        if ((i & 16) != 0) {
            num4 = chatroomInfo.role;
        }
        Integer num7 = num4;
        if ((i & 32) != 0) {
            chatroomParticipants = chatroomInfo.participants;
        }
        ChatroomParticipants chatroomParticipants2 = chatroomParticipants;
        if ((i & 64) != 0) {
            list = chatroomInfo.pinnedMessageList;
        }
        return chatroomInfo.copy(num, num5, num6, chatroomPermissions2, num7, chatroomParticipants2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.maxCharacterLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.messageInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChatroomPermissions component4() {
        return this.permissions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.role;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChatroomParticipants component6() {
        return this.participants;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PinnedMessageModel> component7() {
        return this.pinnedMessageList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChatroomInfo copy(Integer num, Integer num2, Integer num3, ChatroomPermissions chatroomPermissions, Integer num4, ChatroomParticipants chatroomParticipants, List<PinnedMessageModel> list) {
        return new ChatroomInfo(num, num2, num3, chatroomPermissions, num4, chatroomParticipants, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatroomInfo)) {
            return false;
        }
        ChatroomInfo chatroomInfo = (ChatroomInfo) obj;
        return Intrinsics.EZpvd(this.enabled, chatroomInfo.enabled) && Intrinsics.EZpvd(this.maxCharacterLimit, chatroomInfo.maxCharacterLimit) && Intrinsics.EZpvd(this.messageInterval, chatroomInfo.messageInterval) && Intrinsics.EZpvd(this.permissions, chatroomInfo.permissions) && Intrinsics.EZpvd(this.role, chatroomInfo.role) && Intrinsics.EZpvd(this.participants, chatroomInfo.participants) && Intrinsics.EZpvd(this.pinnedMessageList, chatroomInfo.pinnedMessageList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getEnabled() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMaxCharacterLimit() {
        return this.maxCharacterLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMessageInterval() {
        return this.messageInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChatroomParticipants getParticipants() {
        return this.participants;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChatroomPermissions getPermissions() {
        return this.permissions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PinnedMessageModel> getPinnedMessageList() {
        return this.pinnedMessageList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRole() {
        return this.role;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.enabled;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.maxCharacterLimit;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.messageInterval;
        int iHashCode3 = num3 == null ? 0 : num3.hashCode();
        ChatroomPermissions chatroomPermissions = this.permissions;
        int iHashCode4 = chatroomPermissions == null ? 0 : chatroomPermissions.hashCode();
        Integer num4 = this.role;
        int iHashCode5 = num4 == null ? 0 : num4.hashCode();
        ChatroomParticipants chatroomParticipants = this.participants;
        int iHashCode6 = chatroomParticipants == null ? 0 : chatroomParticipants.hashCode();
        List<PinnedMessageModel> list = this.pinnedMessageList;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChatroomInfo(enabled=" + this.enabled + ", maxCharacterLimit=" + this.maxCharacterLimit + ", messageInterval=" + this.messageInterval + ", permissions=" + this.permissions + ", role=" + this.role + ", participants=" + this.participants + ", pinnedMessageList=" + this.pinnedMessageList + ")";
    }

    public ChatroomInfo(Integer num, Integer num2, Integer num3, ChatroomPermissions chatroomPermissions, Integer num4, ChatroomParticipants chatroomParticipants, List<PinnedMessageModel> list) {
        this.enabled = num;
        this.maxCharacterLimit = num2;
        this.messageInterval = num3;
        this.permissions = chatroomPermissions;
        this.role = num4;
        this.participants = chatroomParticipants;
        this.pinnedMessageList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r7v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r8v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
  (wrap:com.okinc.oklive.app.data.model.remote.ChatroomPermissions:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.oklive.app.data.model.remote.ChatroomPermissions) : (r10v0 com.okinc.oklive.app.data.model.remote.ChatroomPermissions))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r11v0 java.lang.Integer))
  (wrap:com.okinc.oklive.app.data.model.remote.ChatroomParticipants:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.oklive.app.data.model.remote.ChatroomParticipants) : (r12v0 com.okinc.oklive.app.data.model.remote.ChatroomParticipants))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r13v0 java.util.List))
 A[MD:(java.lang.Integer, java.lang.Integer, java.lang.Integer, com.okinc.oklive.app.data.model.remote.ChatroomPermissions, java.lang.Integer, com.okinc.oklive.app.data.model.remote.ChatroomParticipants, java.util.List<com.okinc.oklive.app.data.model.remote.PinnedMessageModel>):void (m)] (LINE:240) call: com.okinc.oklive.app.data.model.remote.ChatroomInfo.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer, com.okinc.oklive.app.data.model.remote.ChatroomPermissions, java.lang.Integer, com.okinc.oklive.app.data.model.remote.ChatroomParticipants, java.util.List):void type: THIS */
    public /* synthetic */ ChatroomInfo(Integer num, Integer num2, Integer num3, ChatroomPermissions chatroomPermissions, Integer num4, ChatroomParticipants chatroomParticipants, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : chatroomPermissions, (i & 16) != 0 ? null : num4, (i & 32) != 0 ? null : chatroomParticipants, (i & 64) != 0 ? null : list);
    }
}
