package com.okinc.okimcore.model.room.inhouseim;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMMessageHandling {
    public static final int $stable = 8;
    private final String channelId;
    private final String content;
    private final long id;
    private final boolean isCurrentUserInStrategy;
    private final int priority;
    private final long referenceSequence;
    private final String replaceMessage;
    private final Integer replaceMessageType;
    private final long sequence;
    private final List<String> strategyUids;
    private final int type;
    private final Integer visibility;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component10() {
        return this.visibility;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component11() {
        return this.strategyUids;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.isCurrentUserInStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.sequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.priority;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component7() {
        return this.referenceSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.replaceMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component9() {
        return this.replaceMessageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMMessageHandling copy(long j, @NotNull String str, long j2, String str2, int i, int i2, long j3, String str3, Integer num, Integer num2, List<String> list, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new InHouseIMMessageHandling(j, str, j2, str2, i, i2, j3, str3, num, num2, list, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InHouseIMMessageHandling)) {
            return false;
        }
        InHouseIMMessageHandling inHouseIMMessageHandling = (InHouseIMMessageHandling) obj;
        return this.id == inHouseIMMessageHandling.id && Intrinsics.EZpvd((Object) this.channelId, (Object) inHouseIMMessageHandling.channelId) && this.sequence == inHouseIMMessageHandling.sequence && Intrinsics.EZpvd((Object) this.content, (Object) inHouseIMMessageHandling.content) && this.type == inHouseIMMessageHandling.type && this.priority == inHouseIMMessageHandling.priority && this.referenceSequence == inHouseIMMessageHandling.referenceSequence && Intrinsics.EZpvd((Object) this.replaceMessage, (Object) inHouseIMMessageHandling.replaceMessage) && Intrinsics.EZpvd(this.replaceMessageType, inHouseIMMessageHandling.replaceMessageType) && Intrinsics.EZpvd(this.visibility, inHouseIMMessageHandling.visibility) && Intrinsics.EZpvd(this.strategyUids, inHouseIMMessageHandling.strategyUids) && this.isCurrentUserInStrategy == inHouseIMMessageHandling.isCurrentUserInStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPriority() {
        return this.priority;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getReferenceSequence() {
        return this.referenceSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReplaceMessage() {
        return this.replaceMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getReplaceMessageType() {
        return this.replaceMessageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getSequence() {
        return this.sequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getStrategyUids() {
        return this.strategyUids;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getVisibility() {
        return this.visibility;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.id);
        int iHashCode2 = this.channelId.hashCode();
        int iHashCode3 = Long.hashCode(this.sequence);
        String str = this.content;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        int iHashCode5 = Integer.hashCode(this.type);
        int iHashCode6 = Integer.hashCode(this.priority);
        int iHashCode7 = Long.hashCode(this.referenceSequence);
        String str2 = this.replaceMessage;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.replaceMessageType;
        int iHashCode9 = num == null ? 0 : num.hashCode();
        Integer num2 = this.visibility;
        int iHashCode10 = num2 == null ? 0 : num2.hashCode();
        List<String> list = this.strategyUids;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (list != null ? list.hashCode() : 0)) * 31) + Boolean.hashCode(this.isCurrentUserInStrategy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCurrentUserInStrategy() {
        return this.isCurrentUserInStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMMessageHandling(id=" + this.id + ", channelId=" + this.channelId + ", sequence=" + this.sequence + ", content=" + this.content + ", type=" + this.type + ", priority=" + this.priority + ", referenceSequence=" + this.referenceSequence + ", replaceMessage=" + this.replaceMessage + ", replaceMessageType=" + this.replaceMessageType + ", visibility=" + this.visibility + ", strategyUids=" + this.strategyUids + ", isCurrentUserInStrategy=" + this.isCurrentUserInStrategy + ")";
    }

    public InHouseIMMessageHandling(long j, @NotNull String str, long j2, String str2, int i, int i2, long j3, String str3, Integer num, Integer num2, List<String> list, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = j;
        this.channelId = str;
        this.sequence = j2;
        this.content = str2;
        this.type = i;
        this.priority = i2;
        this.referenceSequence = j3;
        this.replaceMessage = str3;
        this.replaceMessageType = num;
        this.visibility = num2;
        this.strategyUids = list;
        this.isCurrentUserInStrategy = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0022: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r34v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r19v0 long))
  (r21v0 java.lang.String)
  (r22v0 long)
  (r24v0 java.lang.String)
  (r25v0 int)
  (r26v0 int)
  (r27v0 long)
  (r29v0 java.lang.String)
  (r30v0 java.lang.Integer)
  (r31v0 java.lang.Integer)
  (r32v0 java.util.List)
  (r33v0 boolean)
 A[MD:(long, java.lang.String, long, java.lang.String, int, int, long, java.lang.String, java.lang.Integer, java.lang.Integer, java.util.List<java.lang.String>, boolean):void (m)] (LINE:13) call: com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageHandling.<init>(long, java.lang.String, long, java.lang.String, int, int, long, java.lang.String, java.lang.Integer, java.lang.Integer, java.util.List, boolean):void type: THIS */
    public /* synthetic */ InHouseIMMessageHandling(long j, String str, long j2, String str2, int i, int i2, long j3, String str3, Integer num, Integer num2, List list, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, str, j2, str2, i, i2, j3, str3, num, num2, list, z);
    }
}
