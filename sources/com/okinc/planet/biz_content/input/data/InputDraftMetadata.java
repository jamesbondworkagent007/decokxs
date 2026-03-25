package com.okinc.planet.biz_content.input.data;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class InputDraftMetadata implements Serializable {
    public static final int $stable = 0;
    private final long createdAt;
    private final String id;
    private final boolean isRestored;
    private final String title;
    private final InputDraftType type;
    private final long updatedAt;
    private final int version;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputDraftType component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.createdAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.updatedAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isRestored;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputDraftMetadata copy(@NotNull String str, @NotNull InputDraftType inputDraftType, @NotNull String str2, long j, long j2, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(inputDraftType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new InputDraftMetadata(str, inputDraftType, str2, j, j2, z, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputDraftMetadata)) {
            return false;
        }
        InputDraftMetadata inputDraftMetadata = (InputDraftMetadata) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) inputDraftMetadata.id) && this.type == inputDraftMetadata.type && Intrinsics.EZpvd((Object) this.title, (Object) inputDraftMetadata.title) && this.createdAt == inputDraftMetadata.createdAt && this.updatedAt == inputDraftMetadata.updatedAt && this.isRestored == inputDraftMetadata.isRestored && this.version == inputDraftMetadata.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputDraftType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.id.hashCode() * 31) + this.type.hashCode()) * 31) + this.title.hashCode()) * 31) + Long.hashCode(this.createdAt)) * 31) + Long.hashCode(this.updatedAt)) * 31) + Boolean.hashCode(this.isRestored)) * 31) + Integer.hashCode(this.version);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isRestored() {
        return this.isRestored;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InputDraftMetadata(id=" + this.id + ", type=" + this.type + ", title=" + this.title + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", isRestored=" + this.isRestored + ", version=" + this.version + ")";
    }

    public InputDraftMetadata(@NotNull String str, @NotNull InputDraftType inputDraftType, @NotNull String str2, long j, long j2, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(inputDraftType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.id = str;
        this.type = inputDraftType;
        this.title = str2;
        this.createdAt = j;
        this.updatedAt = j2;
        this.isRestored = z;
        this.version = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0035: CONSTRUCTOR 
  (r12v0 java.lang.String)
  (r13v0 com.okinc.planet.biz_content.input.data.InputDraftType)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0009: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0011: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:169)) : (r15v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0014: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001c: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:170)) : (r17v0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0020: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0029: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r20v0 int))
 A[MD:(java.lang.String, com.okinc.planet.biz_content.input.data.InputDraftType, java.lang.String, long, long, boolean, int):void (m)] (LINE:165) call: com.okinc.planet.biz_content.input.data.InputDraftMetadata.<init>(java.lang.String, com.okinc.planet.biz_content.input.data.InputDraftType, java.lang.String, long, long, boolean, int):void type: THIS */
    public /* synthetic */ InputDraftMetadata(String str, InputDraftType inputDraftType, String str2, long j, long j2, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, inputDraftType, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? System.currentTimeMillis() : j, (i2 & 16) != 0 ? System.currentTimeMillis() : j2, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? 1 : i);
    }
}
