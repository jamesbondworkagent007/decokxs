package com.okinc.unify_trade.biz;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class DownLoadListResponse {
    private final ArrayList<DownLoadInfo> downloads;
    private final ArrayList<DownLoadListPageInfo> pagination;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(DownLoadInfo$$serializer.INSTANCE), new ArrayListSerializer(DownLoadListPageInfo$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DownLoadListResponse() {
        this((ArrayList) null, (ArrayList) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.DownLoadListResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DownLoadListResponse copy$default(DownLoadListResponse downLoadListResponse, ArrayList arrayList, ArrayList arrayList2, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = downLoadListResponse.downloads;
        }
        if ((i & 2) != 0) {
            arrayList2 = downLoadListResponse.pagination;
        }
        return downLoadListResponse.copy(arrayList, arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DownLoadInfo> component1() {
        return this.downloads;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DownLoadListPageInfo> component2() {
        return this.pagination;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DownLoadListResponse copy(ArrayList<DownLoadInfo> arrayList, ArrayList<DownLoadListPageInfo> arrayList2) {
        return new DownLoadListResponse(arrayList, arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownLoadListResponse)) {
            return false;
        }
        DownLoadListResponse downLoadListResponse = (DownLoadListResponse) obj;
        return Intrinsics.EZpvd(this.downloads, downLoadListResponse.downloads) && Intrinsics.EZpvd(this.pagination, downLoadListResponse.pagination);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DownLoadInfo> getDownloads() {
        return this.downloads;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DownLoadListPageInfo> getPagination() {
        return this.pagination;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ArrayList<DownLoadInfo> arrayList = this.downloads;
        int iHashCode = arrayList == null ? 0 : arrayList.hashCode();
        ArrayList<DownLoadListPageInfo> arrayList2 = this.pagination;
        return (iHashCode * 31) + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DownLoadListResponse(downloads=" + this.downloads + ", pagination=" + this.pagination + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.DownLoadListResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DownLoadListResponse> serializer() {
            return DownLoadListResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DownLoadListResponse(int i, ArrayList arrayList, ArrayList arrayList2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.downloads = null;
        } else {
            this.downloads = arrayList;
        }
        if ((i & 2) == 0) {
            this.pagination = null;
        } else {
            this.pagination = arrayList2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(DownLoadListResponse downLoadListResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || downLoadListResponse.downloads != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], downLoadListResponse.downloads);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && downLoadListResponse.pagination == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], downLoadListResponse.pagination);
    }

    public DownLoadListResponse(ArrayList<DownLoadInfo> arrayList, ArrayList<DownLoadListPageInfo> arrayList2) {
        this.downloads = arrayList;
        this.pagination = arrayList2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r2v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r3v0 java.util.ArrayList))
 A[MD:(java.util.ArrayList<com.okinc.unify_trade.biz.DownLoadInfo>, java.util.ArrayList<com.okinc.unify_trade.biz.DownLoadListPageInfo>):void (m)] (LINE:425) call: com.okinc.unify_trade.biz.DownLoadListResponse.<init>(java.util.ArrayList, java.util.ArrayList):void type: THIS */
    public /* synthetic */ DownLoadListResponse(ArrayList arrayList, ArrayList arrayList2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : arrayList, (i & 2) != 0 ? null : arrayList2);
    }
}
