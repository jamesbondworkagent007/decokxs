package com.okinc.planet.biz_content.input.data;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class SerializableInputTextState implements Serializable {
    public static final int $stable = 8;
    private final String plainText;
    private final List<SerializableInputSpanData> spans;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.planet.biz_content.input.data.SerializableInputTextState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SerializableInputTextState copy$default(SerializableInputTextState serializableInputTextState, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serializableInputTextState.plainText;
        }
        if ((i & 2) != 0) {
            list = serializableInputTextState.spans;
        }
        return serializableInputTextState.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.plainText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SerializableInputSpanData> component2() {
        return this.spans;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SerializableInputTextState copy(@NotNull String str, @NotNull List<SerializableInputSpanData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new SerializableInputTextState(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SerializableInputTextState)) {
            return false;
        }
        SerializableInputTextState serializableInputTextState = (SerializableInputTextState) obj;
        return Intrinsics.EZpvd((Object) this.plainText, (Object) serializableInputTextState.plainText) && Intrinsics.EZpvd(this.spans, serializableInputTextState.spans);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlainText() {
        return this.plainText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SerializableInputSpanData> getSpans() {
        return this.spans;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.plainText.hashCode() * 31) + this.spans.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SerializableInputTextState(plainText=" + this.plainText + ", spans=" + this.spans + ")";
    }

    public SerializableInputTextState(@NotNull String str, @NotNull List<SerializableInputSpanData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.plainText = str;
        this.spans = list;
    }
}
