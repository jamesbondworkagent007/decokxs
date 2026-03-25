package com.okinc.okimcore.model.room.inhouseim;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMMessageTagsEntity {
    public static final int $stable = 0;
    private final String atUserId;
    private final int id;
    private final String messageId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InHouseIMMessageTagsEntity copy$default(InHouseIMMessageTagsEntity inHouseIMMessageTagsEntity, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = inHouseIMMessageTagsEntity.id;
        }
        if ((i2 & 2) != 0) {
            str = inHouseIMMessageTagsEntity.messageId;
        }
        if ((i2 & 4) != 0) {
            str2 = inHouseIMMessageTagsEntity.atUserId;
        }
        return inHouseIMMessageTagsEntity.copy(i, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.messageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.atUserId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMMessageTagsEntity copy(int i, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new InHouseIMMessageTagsEntity(i, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InHouseIMMessageTagsEntity)) {
            return false;
        }
        InHouseIMMessageTagsEntity inHouseIMMessageTagsEntity = (InHouseIMMessageTagsEntity) obj;
        return this.id == inHouseIMMessageTagsEntity.id && Intrinsics.EZpvd((Object) this.messageId, (Object) inHouseIMMessageTagsEntity.messageId) && Intrinsics.EZpvd((Object) this.atUserId, (Object) inHouseIMMessageTagsEntity.atUserId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAtUserId() {
        return this.atUserId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Integer.hashCode(this.id) * 31) + this.messageId.hashCode()) * 31) + this.atUserId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMMessageTagsEntity(id=" + this.id + ", messageId=" + this.messageId + ", atUserId=" + this.atUserId + ")";
    }

    public InHouseIMMessageTagsEntity(int i, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.id = i;
        this.messageId = str;
        this.atUserId = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
 A[MD:(int, java.lang.String, java.lang.String):void (m)] (LINE:23) call: com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageTagsEntity.<init>(int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InHouseIMMessageTagsEntity(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str, str2);
    }
}
