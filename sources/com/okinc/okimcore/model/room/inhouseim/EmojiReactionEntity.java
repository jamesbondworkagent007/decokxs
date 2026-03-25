package com.okinc.okimcore.model.room.inhouseim;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class EmojiReactionEntity {
    public static final int $stable = 0;
    private final String emoji;
    private final long emojiReactionId;
    private final boolean isCurrentUserReaction;
    private final String messageId;
    private final long reactorReactionTime;
    private final String reactorUserId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.emojiReactionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.messageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.emoji;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.reactorReactionTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.reactorUserId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isCurrentUserReaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EmojiReactionEntity copy(long j, @NotNull String str, @NotNull String str2, long j2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new EmojiReactionEntity(j, str, str2, j2, str3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmojiReactionEntity)) {
            return false;
        }
        EmojiReactionEntity emojiReactionEntity = (EmojiReactionEntity) obj;
        return this.emojiReactionId == emojiReactionEntity.emojiReactionId && Intrinsics.EZpvd((Object) this.messageId, (Object) emojiReactionEntity.messageId) && Intrinsics.EZpvd((Object) this.emoji, (Object) emojiReactionEntity.emoji) && this.reactorReactionTime == emojiReactionEntity.reactorReactionTime && Intrinsics.EZpvd((Object) this.reactorUserId, (Object) emojiReactionEntity.reactorUserId) && this.isCurrentUserReaction == emojiReactionEntity.isCurrentUserReaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEmoji() {
        return this.emoji;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getEmojiReactionId() {
        return this.emojiReactionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getReactorReactionTime() {
        return this.reactorReactionTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReactorUserId() {
        return this.reactorUserId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((Long.hashCode(this.emojiReactionId) * 31) + this.messageId.hashCode()) * 31) + this.emoji.hashCode()) * 31) + Long.hashCode(this.reactorReactionTime)) * 31) + this.reactorUserId.hashCode()) * 31) + Boolean.hashCode(this.isCurrentUserReaction);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCurrentUserReaction() {
        return this.isCurrentUserReaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EmojiReactionEntity(emojiReactionId=" + this.emojiReactionId + ", messageId=" + this.messageId + ", emoji=" + this.emoji + ", reactorReactionTime=" + this.reactorReactionTime + ", reactorUserId=" + this.reactorUserId + ", isCurrentUserReaction=" + this.isCurrentUserReaction + ")";
    }

    public EmojiReactionEntity(long j, @NotNull String str, @NotNull String str2, long j2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.emojiReactionId = j;
        this.messageId = str;
        this.emoji = str2;
        this.reactorReactionTime = j2;
        this.reactorUserId = str3;
        this.isCurrentUserReaction = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r12v0 long))
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 long)
  (r18v0 java.lang.String)
  (r19v0 boolean)
 A[MD:(long, java.lang.String, java.lang.String, long, java.lang.String, boolean):void (m)] (LINE:27) call: com.okinc.okimcore.model.room.inhouseim.EmojiReactionEntity.<init>(long, java.lang.String, java.lang.String, long, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ EmojiReactionEntity(long j, String str, String str2, long j2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, str, str2, j2, str3, z);
    }
}
