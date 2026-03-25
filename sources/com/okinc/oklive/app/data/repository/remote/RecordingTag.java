package com.okinc.oklive.app.data.repository.remote;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class RecordingTag {
    public static final int $stable = 0;

    @SerializedName("tagId")
    private final int tagId;

    @SerializedName("tagName")
    private final String tagName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RecordingTag copy$default(RecordingTag recordingTag, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = recordingTag.tagId;
        }
        if ((i2 & 2) != 0) {
            str = recordingTag.tagName;
        }
        return recordingTag.copy(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.tagId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tagName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecordingTag copy(int i, String str) {
        return new RecordingTag(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordingTag)) {
            return false;
        }
        RecordingTag recordingTag = (RecordingTag) obj;
        return this.tagId == recordingTag.tagId && Intrinsics.EZpvd((Object) this.tagName, (Object) recordingTag.tagName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTagId() {
        return this.tagId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTagName() {
        return this.tagName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.tagId);
        String str = this.tagName;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecordingTag(tagId=" + this.tagId + ", tagName=" + this.tagName + ")";
    }

    public RecordingTag(int i, String str) {
        this.tagId = i;
        this.tagName = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(int, java.lang.String):void (m)] (LINE:83) call: com.okinc.oklive.app.data.repository.remote.RecordingTag.<init>(int, java.lang.String):void type: THIS */
    public /* synthetic */ RecordingTag(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str);
    }
}
