package com.okinc.oklive.app.data.model.remote;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ChatroomParticipants {
    public static final int $stable = 8;

    @SerializedName("moderators")
    private final List<ChatroomParticipant> moderators;

    @SerializedName("muted")
    private final List<ChatroomParticipant> muted;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChatroomParticipants() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.oklive.app.data.model.remote.ChatroomParticipants */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatroomParticipants copy$default(ChatroomParticipants chatroomParticipants, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = chatroomParticipants.moderators;
        }
        if ((i & 2) != 0) {
            list2 = chatroomParticipants.muted;
        }
        return chatroomParticipants.copy(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChatroomParticipant> component1() {
        return this.moderators;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChatroomParticipant> component2() {
        return this.muted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChatroomParticipants copy(List<ChatroomParticipant> list, List<ChatroomParticipant> list2) {
        return new ChatroomParticipants(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatroomParticipants)) {
            return false;
        }
        ChatroomParticipants chatroomParticipants = (ChatroomParticipants) obj;
        return Intrinsics.EZpvd(this.moderators, chatroomParticipants.moderators) && Intrinsics.EZpvd(this.muted, chatroomParticipants.muted);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChatroomParticipant> getModerators() {
        return this.moderators;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChatroomParticipant> getMuted() {
        return this.muted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<ChatroomParticipant> list = this.moderators;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<ChatroomParticipant> list2 = this.muted;
        return (iHashCode * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChatroomParticipants(moderators=" + this.moderators + ", muted=" + this.muted + ")";
    }

    public ChatroomParticipants(List<ChatroomParticipant> list, List<ChatroomParticipant> list2) {
        this.moderators = list;
        this.muted = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.util.List<com.okinc.oklive.app.data.model.remote.ChatroomParticipant>, java.util.List<com.okinc.oklive.app.data.model.remote.ChatroomParticipant>):void (m)] (LINE:270) call: com.okinc.oklive.app.data.model.remote.ChatroomParticipants.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ ChatroomParticipants(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
