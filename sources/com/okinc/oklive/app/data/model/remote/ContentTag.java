package com.okinc.oklive.app.data.model.remote;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class ContentTag {
    public static final int $stable = 0;

    @SerializedName("tagId")
    private final int tagId;

    @SerializedName("tagName")
    private final String tagName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ContentTag copy$default(ContentTag contentTag, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = contentTag.tagId;
        }
        if ((i2 & 2) != 0) {
            str = contentTag.tagName;
        }
        return contentTag.copy(i, str);
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
    public final ContentTag copy(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ContentTag(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentTag)) {
            return false;
        }
        ContentTag contentTag = (ContentTag) obj;
        return this.tagId == contentTag.tagId && Intrinsics.EZpvd((Object) this.tagName, (Object) contentTag.tagName);
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
        return "ContentTag(tagId=" + this.tagId + ", tagName=" + this.tagName + ")";
    }

    public ContentTag(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tagId = i;
        this.tagName = str;
    }
}
