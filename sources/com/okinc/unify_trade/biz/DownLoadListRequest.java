package com.okinc.unify_trade.biz;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class DownLoadListRequest {
    private final String pageSize;
    private final List<DownLoadListPageInfo> pagination;
    private final String reportType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(DownLoadListPageInfo$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DownLoadListRequest() {
        this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.DownLoadListRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DownLoadListRequest copy$default(DownLoadListRequest downLoadListRequest, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = downLoadListRequest.reportType;
        }
        if ((i & 2) != 0) {
            str2 = downLoadListRequest.pageSize;
        }
        if ((i & 4) != 0) {
            list = downLoadListRequest.pagination;
        }
        return downLoadListRequest.copy(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.reportType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DownLoadListPageInfo> component3() {
        return this.pagination;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DownLoadListRequest copy(@NotNull String str, @NotNull String str2, List<DownLoadListPageInfo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new DownLoadListRequest(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownLoadListRequest)) {
            return false;
        }
        DownLoadListRequest downLoadListRequest = (DownLoadListRequest) obj;
        return Intrinsics.EZpvd((Object) this.reportType, (Object) downLoadListRequest.reportType) && Intrinsics.EZpvd((Object) this.pageSize, (Object) downLoadListRequest.pageSize) && Intrinsics.EZpvd(this.pagination, downLoadListRequest.pagination);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPageSize() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DownLoadListPageInfo> getPagination() {
        return this.pagination;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReportType() {
        return this.reportType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.reportType.hashCode();
        int iHashCode2 = this.pageSize.hashCode();
        List<DownLoadListPageInfo> list = this.pagination;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DownLoadListRequest(reportType=" + this.reportType + ", pageSize=" + this.pageSize + ", pagination=" + this.pagination + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.DownLoadListRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DownLoadListRequest> serializer() {
            return DownLoadListRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DownLoadListRequest(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.reportType = "";
        } else {
            this.reportType = str;
        }
        if ((i & 2) == 0) {
            this.pageSize = "";
        } else {
            this.pageSize = str2;
        }
        if ((i & 4) == 0) {
            this.pagination = null;
        } else {
            this.pagination = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(DownLoadListRequest downLoadListRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) downLoadListRequest.reportType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, downLoadListRequest.reportType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) downLoadListRequest.pageSize, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, downLoadListRequest.pageSize);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && downLoadListRequest.pagination == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], downLoadListRequest.pagination);
    }

    public DownLoadListRequest(@NotNull String str, @NotNull String str2, List<DownLoadListPageInfo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.reportType = str;
        this.pageSize = str2;
        this.pagination = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.DownLoadListPageInfo>):void (m)] (LINE:411) call: com.okinc.unify_trade.biz.DownLoadListRequest.<init>(java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ DownLoadListRequest(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : list);
    }
}
