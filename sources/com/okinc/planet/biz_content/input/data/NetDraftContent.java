package com.okinc.planet.biz_content.input.data;

import com.okinc.planet.domain.remote.dto.CashTag;
import com.okinc.planet_api.ShareTopic;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class NetDraftContent implements Serializable {
    public static final int $stable = 8;
    private final List<SerializableImageItem> imageItems;
    private final SerializableInputTextState textState;
    private final ArrayList<CashTag> tokenList;
    private final ArrayList<ShareTopic> topicList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.planet.biz_content.input.data.NetDraftContent */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetDraftContent copy$default(NetDraftContent netDraftContent, SerializableInputTextState serializableInputTextState, List list, ArrayList arrayList, ArrayList arrayList2, int i, Object obj) {
        if ((i & 1) != 0) {
            serializableInputTextState = netDraftContent.textState;
        }
        if ((i & 2) != 0) {
            list = netDraftContent.imageItems;
        }
        if ((i & 4) != 0) {
            arrayList = netDraftContent.topicList;
        }
        if ((i & 8) != 0) {
            arrayList2 = netDraftContent.tokenList;
        }
        return netDraftContent.copy(serializableInputTextState, list, arrayList, arrayList2);
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
    public final ArrayList<ShareTopic> component3() {
        return this.topicList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<CashTag> component4() {
        return this.tokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetDraftContent copy(@NotNull SerializableInputTextState serializableInputTextState, @NotNull List<SerializableImageItem> list, ArrayList<ShareTopic> arrayList, ArrayList<CashTag> arrayList2) {
        Intrinsics.checkNotNullParameter(serializableInputTextState, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new NetDraftContent(serializableInputTextState, list, arrayList, arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetDraftContent)) {
            return false;
        }
        NetDraftContent netDraftContent = (NetDraftContent) obj;
        return Intrinsics.EZpvd(this.textState, netDraftContent.textState) && Intrinsics.EZpvd(this.imageItems, netDraftContent.imageItems) && Intrinsics.EZpvd(this.topicList, netDraftContent.topicList) && Intrinsics.EZpvd(this.tokenList, netDraftContent.tokenList);
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
    public final ArrayList<CashTag> getTokenList() {
        return this.tokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ShareTopic> getTopicList() {
        return this.topicList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.textState.hashCode();
        int iHashCode2 = this.imageItems.hashCode();
        ArrayList<ShareTopic> arrayList = this.topicList;
        int iHashCode3 = arrayList == null ? 0 : arrayList.hashCode();
        ArrayList<CashTag> arrayList2 = this.tokenList;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NetDraftContent(textState=" + this.textState + ", imageItems=" + this.imageItems + ", topicList=" + this.topicList + ", tokenList=" + this.tokenList + ")";
    }

    public NetDraftContent(@NotNull SerializableInputTextState serializableInputTextState, @NotNull List<SerializableImageItem> list, ArrayList<ShareTopic> arrayList, ArrayList<CashTag> arrayList2) {
        Intrinsics.checkNotNullParameter(serializableInputTextState, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.textState = serializableInputTextState;
        this.imageItems = list;
        this.topicList = arrayList;
        this.tokenList = arrayList2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (r2v0 com.okinc.planet.biz_content.input.data.SerializableInputTextState)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:189)) : (r3v0 java.util.List))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0008: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r4v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x000e: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r5v0 java.util.ArrayList))
 A[MD:(com.okinc.planet.biz_content.input.data.SerializableInputTextState, java.util.List<com.okinc.planet.biz_content.input.data.SerializableImageItem>, java.util.ArrayList<com.okinc.planet_api.ShareTopic>, java.util.ArrayList<com.okinc.planet.domain.remote.dto.CashTag>):void (m)] (LINE:187) call: com.okinc.planet.biz_content.input.data.NetDraftContent.<init>(com.okinc.planet.biz_content.input.data.SerializableInputTextState, java.util.List, java.util.ArrayList, java.util.ArrayList):void type: THIS */
    public /* synthetic */ NetDraftContent(SerializableInputTextState serializableInputTextState, List list, ArrayList arrayList, ArrayList arrayList2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(serializableInputTextState, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? null : arrayList, (i & 8) != 0 ? null : arrayList2);
    }
}
