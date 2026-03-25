package com.okinc.oklive.app.data.repository.remote;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
public final class RecordedStreamsRequest {
    public static final int $stable = 0;

    @SerializedName("pageIndex")
    private final int pageIndex;

    @SerializedName("pageSize")
    private final int pageSize;

    @SerializedName("returnRecordingOnly")
    private final boolean returnRecordingOnly;

    @SerializedName("uid")
    private final long uid;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RecordedStreamsRequest copy$default(RecordedStreamsRequest recordedStreamsRequest, long j, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = recordedStreamsRequest.uid;
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            z = recordedStreamsRequest.returnRecordingOnly;
        }
        boolean z2 = z;
        if ((i3 & 4) != 0) {
            i = recordedStreamsRequest.pageIndex;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = recordedStreamsRequest.pageSize;
        }
        return recordedStreamsRequest.copy(j2, z2, i4, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.returnRecordingOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.pageIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecordedStreamsRequest copy(long j, boolean z, int i, int i2) {
        return new RecordedStreamsRequest(j, z, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordedStreamsRequest)) {
            return false;
        }
        RecordedStreamsRequest recordedStreamsRequest = (RecordedStreamsRequest) obj;
        return this.uid == recordedStreamsRequest.uid && this.returnRecordingOnly == recordedStreamsRequest.returnRecordingOnly && this.pageIndex == recordedStreamsRequest.pageIndex && this.pageSize == recordedStreamsRequest.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageIndex() {
        return this.pageIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getReturnRecordingOnly() {
        return this.returnRecordingOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getUid() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Long.hashCode(this.uid) * 31) + Boolean.hashCode(this.returnRecordingOnly)) * 31) + Integer.hashCode(this.pageIndex)) * 31) + Integer.hashCode(this.pageSize);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecordedStreamsRequest(uid=" + this.uid + ", returnRecordingOnly=" + this.returnRecordingOnly + ", pageIndex=" + this.pageIndex + ", pageSize=" + this.pageSize + ")";
    }

    public RecordedStreamsRequest(long j, boolean z, int i, int i2) {
        this.uid = j;
        this.returnRecordingOnly = z;
        this.pageIndex = i;
        this.pageSize = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (r7v0 long)
  (wrap:boolean:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r9v0 boolean))
  (wrap:int:0x000b: TERNARY null = ((wrap:int:0x0006: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r10v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (10 int) : (r11v0 int))
 A[MD:(long, boolean, int, int):void (m)] (LINE:10) call: com.okinc.oklive.app.data.repository.remote.RecordedStreamsRequest.<init>(long, boolean, int, int):void type: THIS */
    public /* synthetic */ RecordedStreamsRequest(long j, boolean z, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i3 & 2) != 0 ? true : z, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 10 : i2);
    }
}
