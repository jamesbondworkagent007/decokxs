package com.okinc.business.invest_biz.data.bean.response;

import com.okinc.business.invest_biz.data.contants.AssetStatus;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class DashboardResponse {
    public final AssetStatus assetStatus;
    public final List<NetworkTotal> networkAssets;
    public final List<PlatformDetails> platformDetails;
    public final long updateAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, AssetStatus.Companion.serializer(), new ArrayListSerializer(PlatformDetails$$serializer.INSTANCE), new ArrayListSerializer(NetworkTotal$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DashboardResponse() {
        this(0L, (AssetStatus) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.okinc.business.invest_biz.data.bean.response.DashboardResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DashboardResponse copy$default(DashboardResponse dashboardResponse, long j, AssetStatus assetStatus, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dashboardResponse.updateAt;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            assetStatus = dashboardResponse.assetStatus;
        }
        AssetStatus assetStatus2 = assetStatus;
        if ((i & 4) != 0) {
            list = dashboardResponse.platformDetails;
        }
        List list3 = list;
        if ((i & 8) != 0) {
            list2 = dashboardResponse.networkAssets;
        }
        return dashboardResponse.copydefault(j2, assetStatus2, list3, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetStatus AEQbTJ() {
        return this.assetStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PlatformDetails> EZpvd() {
        return this.platformDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NetworkTotal> KWHzl() {
        return this.networkAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.updateAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DashboardResponse copydefault(long j, @NotNull AssetStatus assetStatus, @NotNull List<PlatformDetails> list, @NotNull List<NetworkTotal> list2) {
        Intrinsics.checkNotNullParameter(assetStatus, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new DashboardResponse(j, assetStatus, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DashboardResponse)) {
            return false;
        }
        DashboardResponse dashboardResponse = (DashboardResponse) obj;
        return this.updateAt == dashboardResponse.updateAt && this.assetStatus == dashboardResponse.assetStatus && Intrinsics.EZpvd(this.platformDetails, dashboardResponse.platformDetails) && Intrinsics.EZpvd(this.networkAssets, dashboardResponse.networkAssets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Long.hashCode(this.updateAt) * 31) + this.assetStatus.hashCode()) * 31) + this.platformDetails.hashCode()) * 31) + this.networkAssets.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DashboardResponse(updateAt=" + this.updateAt + ", assetStatus=" + this.assetStatus + ", platformDetails=" + this.platformDetails + ", networkAssets=" + this.networkAssets + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.response.DashboardResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DashboardResponse> serializer() {
            return DashboardResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DashboardResponse(int i, long j, AssetStatus assetStatus, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        this.updateAt = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.assetStatus = AssetStatus.Default;
        } else {
            this.assetStatus = assetStatus;
        }
        if ((i & 4) == 0) {
            this.platformDetails = yDY.AhwBna();
        } else {
            this.platformDetails = list;
        }
        if ((i & 8) == 0) {
            this.networkAssets = yDY.AhwBna();
        } else {
            this.networkAssets = list2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [10=4] */
    public static final /* synthetic */ void EZpvd(DashboardResponse dashboardResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || dashboardResponse.updateAt != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, dashboardResponse.updateAt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || dashboardResponse.assetStatus != AssetStatus.Default) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], dashboardResponse.assetStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(dashboardResponse.platformDetails, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], dashboardResponse.platformDetails);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(dashboardResponse.networkAssets, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], dashboardResponse.networkAssets);
    }

    public DashboardResponse(long j, @NotNull AssetStatus assetStatus, @NotNull List<PlatformDetails> list, @NotNull List<NetworkTotal> list2) {
        Intrinsics.checkNotNullParameter(assetStatus, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.updateAt = j;
        this.assetStatus = assetStatus;
        this.platformDetails = list;
        this.networkAssets = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0021: CONSTRUCTOR 
  (wrap:long:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r7v0 long))
  (wrap:com.okinc.business.invest_biz.data.contants.AssetStatus:0x000d: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.invest_biz.data.contants.AssetStatus:0x000b: SGET  A[WRAPPED] (LINE:15) com.okinc.business.invest_biz.data.contants.AssetStatus.Default com.okinc.business.invest_biz.data.contants.AssetStatus) : (r9v0 com.okinc.business.invest_biz.data.contants.AssetStatus))
  (wrap:java.util.List:0x0016: TERNARY null = ((wrap:int:0x000e: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0012: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:17)) : (r10v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x001b: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:19)) : (r11v0 java.util.List))
 A[MD:(long, com.okinc.business.invest_biz.data.contants.AssetStatus, java.util.List<com.okinc.business.invest_biz.data.bean.response.PlatformDetails>, java.util.List<com.okinc.business.invest_biz.data.bean.response.NetworkTotal>):void (m)] (LINE:11) call: com.okinc.business.invest_biz.data.bean.response.DashboardResponse.<init>(long, com.okinc.business.invest_biz.data.contants.AssetStatus, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ DashboardResponse(long j, AssetStatus assetStatus, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? AssetStatus.Default : assetStatus, (i & 4) != 0 ? yDY.AhwBna() : list, (i & 8) != 0 ? yDY.AhwBna() : list2);
    }
}
