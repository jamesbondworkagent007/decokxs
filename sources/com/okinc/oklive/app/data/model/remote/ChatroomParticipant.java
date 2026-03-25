package com.okinc.oklive.app.data.model.remote;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class ChatroomParticipant {
    public static final int $stable = 8;

    @SerializedName("avatar")
    private final String avatar;

    @SerializedName("moderatorState")
    private final Integer moderatorState;

    @SerializedName("muteStatus")
    private final Integer muteStatus;

    @SerializedName("nickname")
    private final String nickname;

    @SerializedName("role")
    private final Integer role;

    @SerializedName("tags")
    private final List<Integer> tags;

    @SerializedName("userUid")
    private final long userUid;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.userUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component4() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.muteStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.role;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.moderatorState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChatroomParticipant copy(long j, String str, String str2, List<Integer> list, Integer num, Integer num2, Integer num3) {
        return new ChatroomParticipant(j, str, str2, list, num, num2, num3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatroomParticipant)) {
            return false;
        }
        ChatroomParticipant chatroomParticipant = (ChatroomParticipant) obj;
        return this.userUid == chatroomParticipant.userUid && Intrinsics.EZpvd((Object) this.avatar, (Object) chatroomParticipant.avatar) && Intrinsics.EZpvd((Object) this.nickname, (Object) chatroomParticipant.nickname) && Intrinsics.EZpvd(this.tags, chatroomParticipant.tags) && Intrinsics.EZpvd(this.muteStatus, chatroomParticipant.muteStatus) && Intrinsics.EZpvd(this.role, chatroomParticipant.role) && Intrinsics.EZpvd(this.moderatorState, chatroomParticipant.moderatorState);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getModeratorState() {
        return this.moderatorState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMuteStatus() {
        return this.muteStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRole() {
        return this.role;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getTags() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getUserUid() {
        return this.userUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.userUid);
        String str = this.avatar;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.nickname;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        List<Integer> list = this.tags;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        Integer num = this.muteStatus;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        Integer num2 = this.role;
        int iHashCode6 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.moderatorState;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (num3 != null ? num3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChatroomParticipant(userUid=" + this.userUid + ", avatar=" + this.avatar + ", nickname=" + this.nickname + ", tags=" + this.tags + ", muteStatus=" + this.muteStatus + ", role=" + this.role + ", moderatorState=" + this.moderatorState + ")";
    }

    public ChatroomParticipant(long j, String str, String str2, List<Integer> list, Integer num, Integer num2, Integer num3) {
        this.userUid = j;
        this.avatar = str;
        this.nickname = str2;
        this.tags = list;
        this.muteStatus = num;
        this.role = num2;
        this.moderatorState = num3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (r12v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000f: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r16v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0017: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r17v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r18v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0027: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r19v0 java.lang.Integer))
 A[MD:(long, java.lang.String, java.lang.String, java.util.List<java.lang.Integer>, java.lang.Integer, java.lang.Integer, java.lang.Integer):void (m)] (LINE:279) call: com.okinc.oklive.app.data.model.remote.ChatroomParticipant.<init>(long, java.lang.String, java.lang.String, java.util.List, java.lang.Integer, java.lang.Integer, java.lang.Integer):void type: THIS */
    public /* synthetic */ ChatroomParticipant(long j, String str, String str2, List list, Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : num3);
    }
}
