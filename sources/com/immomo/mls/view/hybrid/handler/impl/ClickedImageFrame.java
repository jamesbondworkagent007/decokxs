package com.immomo.mls.view.hybrid.handler.impl;

import com.google.gson.annotations.SerializedName;
import com.ibm.icu.text.DateFormat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class ClickedImageFrame {
    public static final int $stable = 8;

    @SerializedName("height")
    private String height;

    @SerializedName("width")
    private String width;

    @SerializedName("x")
    private String x;

    @SerializedName(DateFormat.YEAR)
    private String y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ClickedImageFrame copy$default(ClickedImageFrame clickedImageFrame, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clickedImageFrame.x;
        }
        if ((i & 2) != 0) {
            str2 = clickedImageFrame.y;
        }
        if ((i & 4) != 0) {
            str3 = clickedImageFrame.width;
        }
        if ((i & 8) != 0) {
            str4 = clickedImageFrame.height;
        }
        return clickedImageFrame.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ClickedImageFrame copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new ClickedImageFrame(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickedImageFrame)) {
            return false;
        }
        ClickedImageFrame clickedImageFrame = (ClickedImageFrame) obj;
        return Intrinsics.EZpvd((Object) this.x, (Object) clickedImageFrame.x) && Intrinsics.EZpvd((Object) this.y, (Object) clickedImageFrame.y) && Intrinsics.EZpvd((Object) this.width, (Object) clickedImageFrame.width) && Intrinsics.EZpvd((Object) this.height, (Object) clickedImageFrame.height);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHeight() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWidth() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getX() {
        return this.x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getY() {
        return this.y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.x.hashCode() * 31) + this.y.hashCode()) * 31) + this.width.hashCode()) * 31) + this.height.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHeight(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.height = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWidth(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.width = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setX(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.x = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setY(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.y = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ClickedImageFrame(x=" + this.x + ", y=" + this.y + ", width=" + this.width + ", height=" + this.height + ")";
    }

    public ClickedImageFrame(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.x = str;
        this.y = str2;
        this.width = str3;
        this.height = str4;
    }
}
