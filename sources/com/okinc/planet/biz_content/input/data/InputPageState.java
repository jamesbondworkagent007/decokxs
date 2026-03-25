package com.okinc.planet.biz_content.input.data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class InputPageState implements Serializable {
    public static final int $stable = 8;
    private final Map<String, SerializableContentValidationResult> contentValidationState;
    private final List<SerializableImageItem> imageItems;
    private final boolean isHyperlinkAtLimit;
    private final boolean isImageAtLimit;
    private final SerializableInputTextState textState;
    private final long timestamp;
    private final String toolFragmentType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SerializableInputTextState component1() {
        return this.textState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SerializableImageItem> component2() {
        return this.imageItems;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isHyperlinkAtLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isImageAtLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, SerializableContentValidationResult> component5() {
        return this.contentValidationState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.toolFragmentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component7() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputPageState copy(@NotNull SerializableInputTextState serializableInputTextState, @NotNull List<SerializableImageItem> list, boolean z, boolean z2, @NotNull Map<String, SerializableContentValidationResult> map, @NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(serializableInputTextState, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new InputPageState(serializableInputTextState, list, z, z2, map, str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputPageState)) {
            return false;
        }
        InputPageState inputPageState = (InputPageState) obj;
        return Intrinsics.EZpvd(this.textState, inputPageState.textState) && Intrinsics.EZpvd(this.imageItems, inputPageState.imageItems) && this.isHyperlinkAtLimit == inputPageState.isHyperlinkAtLimit && this.isImageAtLimit == inputPageState.isImageAtLimit && Intrinsics.EZpvd(this.contentValidationState, inputPageState.contentValidationState) && Intrinsics.EZpvd((Object) this.toolFragmentType, (Object) inputPageState.toolFragmentType) && this.timestamp == inputPageState.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, SerializableContentValidationResult> getContentValidationState() {
        return this.contentValidationState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SerializableImageItem> getImageItems() {
        return this.imageItems;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SerializableInputTextState getTextState() {
        return this.textState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToolFragmentType() {
        return this.toolFragmentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.textState.hashCode() * 31) + this.imageItems.hashCode()) * 31) + Boolean.hashCode(this.isHyperlinkAtLimit)) * 31) + Boolean.hashCode(this.isImageAtLimit)) * 31) + this.contentValidationState.hashCode()) * 31) + this.toolFragmentType.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHyperlinkAtLimit() {
        return this.isHyperlinkAtLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isImageAtLimit() {
        return this.isImageAtLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InputPageState(textState=" + this.textState + ", imageItems=" + this.imageItems + ", isHyperlinkAtLimit=" + this.isHyperlinkAtLimit + ", isImageAtLimit=" + this.isImageAtLimit + ", contentValidationState=" + this.contentValidationState + ", toolFragmentType=" + this.toolFragmentType + ", timestamp=" + this.timestamp + ")";
    }

    public InputPageState(@NotNull SerializableInputTextState serializableInputTextState, @NotNull List<SerializableImageItem> list, boolean z, boolean z2, @NotNull Map<String, SerializableContentValidationResult> map, @NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(serializableInputTextState, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.textState = serializableInputTextState;
        this.imageItems = list;
        this.isHyperlinkAtLimit = z;
        this.isImageAtLimit = z2;
        this.contentValidationState = map;
        this.toolFragmentType = str;
        this.timestamp = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (r12v0 com.okinc.planet.biz_content.input.data.SerializableInputTextState)
  (r13v0 java.util.List)
  (r14v0 boolean)
  (r15v0 boolean)
  (r16v0 java.util.Map)
  (r17v0 java.lang.String)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:151)) : (r18v0 long))
 A[MD:(com.okinc.planet.biz_content.input.data.SerializableInputTextState, java.util.List<com.okinc.planet.biz_content.input.data.SerializableImageItem>, boolean, boolean, java.util.Map<java.lang.String, com.okinc.planet.biz_content.input.data.SerializableContentValidationResult>, java.lang.String, long):void (m)] (LINE:144) call: com.okinc.planet.biz_content.input.data.InputPageState.<init>(com.okinc.planet.biz_content.input.data.SerializableInputTextState, java.util.List, boolean, boolean, java.util.Map, java.lang.String, long):void type: THIS */
    public /* synthetic */ InputPageState(SerializableInputTextState serializableInputTextState, List list, boolean z, boolean z2, Map map, String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(serializableInputTextState, list, z, z2, map, str, (i & 64) != 0 ? System.currentTimeMillis() : j);
    }
}
