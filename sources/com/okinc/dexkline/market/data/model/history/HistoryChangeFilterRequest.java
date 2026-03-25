package com.okinc.dexkline.market.data.model.history;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class HistoryChangeFilterRequest {
    private final boolean isDescOrder;
    private final String lastItemId;
    private final String orderBy;
    private final String pageSize;
    private final HistoryTokenFilterData tokenFilter;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HistoryChangeFilterRequest copy$default(HistoryChangeFilterRequest historyChangeFilterRequest, HistoryTokenFilterData historyTokenFilterData, String str, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            historyTokenFilterData = historyChangeFilterRequest.tokenFilter;
        }
        if ((i & 2) != 0) {
            str = historyChangeFilterRequest.lastItemId;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = historyChangeFilterRequest.pageSize;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            z = historyChangeFilterRequest.isDescOrder;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str3 = historyChangeFilterRequest.orderBy;
        }
        return historyChangeFilterRequest.copy(historyTokenFilterData, str4, str5, z2, str3);
    }

    @SerialName("dataId")
    public static /* synthetic */ void getLastItemId$annotations() {
    }

    @SerialName("orderBy")
    public static /* synthetic */ void getOrderBy$annotations() {
    }

    @SerialName("limit")
    public static /* synthetic */ void getPageSize$annotations() {
    }

    @SerialName("tradingHistoryFilter")
    public static /* synthetic */ void getTokenFilter$annotations() {
    }

    @SerialName("desc")
    public static /* synthetic */ void isDescOrder$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HistoryTokenFilterData component1() {
        return this.tokenFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.lastItemId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isDescOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.orderBy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HistoryChangeFilterRequest copy(@NotNull HistoryTokenFilterData historyTokenFilterData, @NotNull String str, @NotNull String str2, boolean z, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(historyTokenFilterData, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new HistoryChangeFilterRequest(historyTokenFilterData, str, str2, z, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryChangeFilterRequest)) {
            return false;
        }
        HistoryChangeFilterRequest historyChangeFilterRequest = (HistoryChangeFilterRequest) obj;
        return Intrinsics.EZpvd(this.tokenFilter, historyChangeFilterRequest.tokenFilter) && Intrinsics.EZpvd((Object) this.lastItemId, (Object) historyChangeFilterRequest.lastItemId) && Intrinsics.EZpvd((Object) this.pageSize, (Object) historyChangeFilterRequest.pageSize) && this.isDescOrder == historyChangeFilterRequest.isDescOrder && Intrinsics.EZpvd((Object) this.orderBy, (Object) historyChangeFilterRequest.orderBy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastItemId() {
        return this.lastItemId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderBy() {
        return this.orderBy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPageSize() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HistoryTokenFilterData getTokenFilter() {
        return this.tokenFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.tokenFilter.hashCode() * 31) + this.lastItemId.hashCode()) * 31) + this.pageSize.hashCode()) * 31) + Boolean.hashCode(this.isDescOrder)) * 31) + this.orderBy.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isDescOrder() {
        return this.isDescOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HistoryChangeFilterRequest(tokenFilter=" + this.tokenFilter + ", lastItemId=" + this.lastItemId + ", pageSize=" + this.pageSize + ", isDescOrder=" + this.isDescOrder + ", orderBy=" + this.orderBy + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.data.model.history.HistoryChangeFilterRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HistoryChangeFilterRequest> serializer() {
            return HistoryChangeFilterRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HistoryChangeFilterRequest(int i, HistoryTokenFilterData historyTokenFilterData, String str, String str2, boolean z, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, HistoryChangeFilterRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenFilter = historyTokenFilterData;
        if ((i & 2) == 0) {
            this.lastItemId = "";
        } else {
            this.lastItemId = str;
        }
        if ((i & 4) == 0) {
            this.pageSize = "100";
        } else {
            this.pageSize = str2;
        }
        if ((i & 8) == 0) {
            this.isDescOrder = true;
        } else {
            this.isDescOrder = z;
        }
        if ((i & 16) == 0) {
            this.orderBy = "";
        } else {
            this.orderBy = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKKLine_kline_impl(HistoryChangeFilterRequest historyChangeFilterRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, HistoryTokenFilterData$$serializer.INSTANCE, historyChangeFilterRequest.tokenFilter);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) historyChangeFilterRequest.lastItemId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, historyChangeFilterRequest.lastItemId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) historyChangeFilterRequest.pageSize, (Object) "100")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, historyChangeFilterRequest.pageSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !historyChangeFilterRequest.isDescOrder) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, historyChangeFilterRequest.isDescOrder);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) historyChangeFilterRequest.orderBy, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, historyChangeFilterRequest.orderBy);
    }

    public HistoryChangeFilterRequest(@NotNull HistoryTokenFilterData historyTokenFilterData, @NotNull String str, @NotNull String str2, boolean z, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(historyTokenFilterData, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.tokenFilter = historyTokenFilterData;
        this.lastItemId = str;
        this.pageSize = str2;
        this.isDescOrder = z;
        this.orderBy = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r8v0 com.okinc.dexkline.market.data.model.history.HistoryTokenFilterData)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("100") : (r10v0 java.lang.String))
  (wrap:boolean:0x0015: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r11v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
 A[MD:(com.okinc.dexkline.market.data.model.history.HistoryTokenFilterData, java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] (LINE:9) call: com.okinc.dexkline.market.data.model.history.HistoryChangeFilterRequest.<init>(com.okinc.dexkline.market.data.model.history.HistoryTokenFilterData, java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ HistoryChangeFilterRequest(HistoryTokenFilterData historyTokenFilterData, String str, String str2, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(historyTokenFilterData, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "100" : str2, (i & 8) != 0 ? true : z, (i & 16) != 0 ? "" : str3);
    }
}
