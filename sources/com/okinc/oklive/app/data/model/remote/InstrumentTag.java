package com.okinc.oklive.app.data.model.remote;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class InstrumentTag {
    public static final int $stable = 0;

    @SerializedName("tagId")
    private final int tagId;

    @SerializedName("tagName")
    private final String tagName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InstrumentTag copy$default(InstrumentTag instrumentTag, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = instrumentTag.tagId;
        }
        if ((i2 & 2) != 0) {
            str = instrumentTag.tagName;
        }
        return instrumentTag.copy(i, str);
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
    public final InstrumentTag copy(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new InstrumentTag(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentTag)) {
            return false;
        }
        InstrumentTag instrumentTag = (InstrumentTag) obj;
        return this.tagId == instrumentTag.tagId && Intrinsics.EZpvd((Object) this.tagName, (Object) instrumentTag.tagName);
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
        return (Integer.hashCode(this.tagId) * 31) + this.tagName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InstrumentTag(tagId=" + this.tagId + ", tagName=" + this.tagName + ")";
    }

    public InstrumentTag(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tagId = i;
        this.tagName = str;
    }
}
