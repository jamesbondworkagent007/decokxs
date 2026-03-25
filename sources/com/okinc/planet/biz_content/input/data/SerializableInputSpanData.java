package com.okinc.planet.biz_content.input.data;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class SerializableInputSpanData implements Serializable {
    public static final int $stable = 0;
    private final String activityKey;
    private final int colorResId;
    private final int endPosition;
    private final int startPosition;
    private final String symbol;
    private final String text;
    private final InputHyperlinkType type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SerializableInputSpanData copy$default(SerializableInputSpanData serializableInputSpanData, int i, int i2, String str, String str2, InputHyperlinkType inputHyperlinkType, String str3, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = serializableInputSpanData.startPosition;
        }
        if ((i4 & 2) != 0) {
            i2 = serializableInputSpanData.endPosition;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            str = serializableInputSpanData.text;
        }
        String str4 = str;
        if ((i4 & 8) != 0) {
            str2 = serializableInputSpanData.symbol;
        }
        String str5 = str2;
        if ((i4 & 16) != 0) {
            inputHyperlinkType = serializableInputSpanData.type;
        }
        InputHyperlinkType inputHyperlinkType2 = inputHyperlinkType;
        if ((i4 & 32) != 0) {
            str3 = serializableInputSpanData.activityKey;
        }
        String str6 = str3;
        if ((i4 & 64) != 0) {
            i3 = serializableInputSpanData.colorResId;
        }
        return serializableInputSpanData.copy(i, i5, str4, str5, inputHyperlinkType2, str6, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.startPosition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.endPosition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputHyperlinkType component5() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.activityKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.colorResId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SerializableInputSpanData copy(int i, int i2, @NotNull String str, @NotNull String str2, @NotNull InputHyperlinkType inputHyperlinkType, @NotNull String str3, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(inputHyperlinkType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SerializableInputSpanData(i, i2, str, str2, inputHyperlinkType, str3, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SerializableInputSpanData)) {
            return false;
        }
        SerializableInputSpanData serializableInputSpanData = (SerializableInputSpanData) obj;
        return this.startPosition == serializableInputSpanData.startPosition && this.endPosition == serializableInputSpanData.endPosition && Intrinsics.EZpvd((Object) this.text, (Object) serializableInputSpanData.text) && Intrinsics.EZpvd((Object) this.symbol, (Object) serializableInputSpanData.symbol) && this.type == serializableInputSpanData.type && Intrinsics.EZpvd((Object) this.activityKey, (Object) serializableInputSpanData.activityKey) && this.colorResId == serializableInputSpanData.colorResId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActivityKey() {
        return this.activityKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getColorResId() {
        return this.colorResId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getEndPosition() {
        return this.endPosition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStartPosition() {
        return this.startPosition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputHyperlinkType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((Integer.hashCode(this.startPosition) * 31) + Integer.hashCode(this.endPosition)) * 31) + this.text.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.type.hashCode()) * 31) + this.activityKey.hashCode()) * 31) + Integer.hashCode(this.colorResId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SerializableInputSpanData(startPosition=" + this.startPosition + ", endPosition=" + this.endPosition + ", text=" + this.text + ", symbol=" + this.symbol + ", type=" + this.type + ", activityKey=" + this.activityKey + ", colorResId=" + this.colorResId + ")";
    }

    public SerializableInputSpanData(int i, int i2, @NotNull String str, @NotNull String str2, @NotNull InputHyperlinkType inputHyperlinkType, @NotNull String str3, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(inputHyperlinkType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.startPosition = i;
        this.endPosition = i2;
        this.text = str;
        this.symbol = str2;
        this.type = inputHyperlinkType;
        this.activityKey = str3;
        this.colorResId = i3;
    }
}
