package com.okinc.planet.biz_content.input.data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56424yEw;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class InputDraftContent implements Serializable {
    public static final int $stable = 8;
    private final Map<String, String> additionalData;
    private final List<SerializableImageItem> imageItems;
    private final SerializableInputTextState textState;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.planet.biz_content.input.data.InputDraftContent */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InputDraftContent copy$default(InputDraftContent inputDraftContent, SerializableInputTextState serializableInputTextState, List list, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            serializableInputTextState = inputDraftContent.textState;
        }
        if ((i & 2) != 0) {
            list = inputDraftContent.imageItems;
        }
        if ((i & 4) != 0) {
            map = inputDraftContent.additionalData;
        }
        return inputDraftContent.copy(serializableInputTextState, list, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SerializableInputTextState component1() {
        return this.textState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SerializableImageItem> component2() {
        return this.imageItems;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component3() {
        return this.additionalData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputDraftContent copy(@NotNull SerializableInputTextState serializableInputTextState, @NotNull List<SerializableImageItem> list, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(serializableInputTextState, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new InputDraftContent(serializableInputTextState, list, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputDraftContent)) {
            return false;
        }
        InputDraftContent inputDraftContent = (InputDraftContent) obj;
        return Intrinsics.EZpvd(this.textState, inputDraftContent.textState) && Intrinsics.EZpvd(this.imageItems, inputDraftContent.imageItems) && Intrinsics.EZpvd(this.additionalData, inputDraftContent.additionalData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getAdditionalData() {
        return this.additionalData;
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
    public int hashCode() {
        return (((this.textState.hashCode() * 31) + this.imageItems.hashCode()) * 31) + this.additionalData.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InputDraftContent(textState=" + this.textState + ", imageItems=" + this.imageItems + ", additionalData=" + this.additionalData + ")";
    }

    public InputDraftContent(@NotNull SerializableInputTextState serializableInputTextState, @NotNull List<SerializableImageItem> list, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(serializableInputTextState, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.textState = serializableInputTextState;
        this.imageItems = list;
        this.additionalData = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r1v0 com.okinc.planet.biz_content.input.data.SerializableInputTextState)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:180)) : (r2v0 java.util.List))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0008: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x000c: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:181)) : (r3v0 java.util.Map))
 A[MD:(com.okinc.planet.biz_content.input.data.SerializableInputTextState, java.util.List<com.okinc.planet.biz_content.input.data.SerializableImageItem>, java.util.Map<java.lang.String, java.lang.String>):void (m)] (LINE:178) call: com.okinc.planet.biz_content.input.data.InputDraftContent.<init>(com.okinc.planet.biz_content.input.data.SerializableInputTextState, java.util.List, java.util.Map):void type: THIS */
    public /* synthetic */ InputDraftContent(SerializableInputTextState serializableInputTextState, List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(serializableInputTextState, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? C56424yEw.KWHzl() : map);
    }
}
