package com.okinc.business.invest_biz.data.bean.request;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class DashboardTokenDetailReq {
    private final long analysisPlatformId;
    private final long chainId;
    private final String containAvailableReward;
    private final String containMarketReward;
    private final List<DashboardTokenDetailInvestInfo> investmentInfos;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(DashboardTokenDetailInvestInfo$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.analysisPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.containAvailableReward;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.containMarketReward;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DashboardTokenDetailInvestInfo> component5() {
        return this.investmentInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DashboardTokenDetailReq copy(long j, long j2, @NotNull String str, @NotNull String str2, @NotNull List<DashboardTokenDetailInvestInfo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new DashboardTokenDetailReq(j, j2, str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DashboardTokenDetailReq)) {
            return false;
        }
        DashboardTokenDetailReq dashboardTokenDetailReq = (DashboardTokenDetailReq) obj;
        return this.analysisPlatformId == dashboardTokenDetailReq.analysisPlatformId && this.chainId == dashboardTokenDetailReq.chainId && Intrinsics.EZpvd((Object) this.containAvailableReward, (Object) dashboardTokenDetailReq.containAvailableReward) && Intrinsics.EZpvd((Object) this.containMarketReward, (Object) dashboardTokenDetailReq.containMarketReward) && Intrinsics.EZpvd(this.investmentInfos, dashboardTokenDetailReq.investmentInfos);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getAnalysisPlatformId() {
        return this.analysisPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContainAvailableReward() {
        return this.containAvailableReward;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContainMarketReward() {
        return this.containMarketReward;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DashboardTokenDetailInvestInfo> getInvestmentInfos() {
        return this.investmentInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Long.hashCode(this.analysisPlatformId) * 31) + Long.hashCode(this.chainId)) * 31) + this.containAvailableReward.hashCode()) * 31) + this.containMarketReward.hashCode()) * 31) + this.investmentInfos.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DashboardTokenDetailReq(analysisPlatformId=" + this.analysisPlatformId + ", chainId=" + this.chainId + ", containAvailableReward=" + this.containAvailableReward + ", containMarketReward=" + this.containMarketReward + ", investmentInfos=" + this.investmentInfos + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.request.DashboardTokenDetailReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DashboardTokenDetailReq> serializer() {
            return DashboardTokenDetailReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DashboardTokenDetailReq(int i, long j, long j2, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, DashboardTokenDetailReq$$serializer.INSTANCE.getDescriptor());
        }
        this.analysisPlatformId = j;
        this.chainId = j2;
        this.containAvailableReward = str;
        this.containMarketReward = str2;
        this.investmentInfos = list;
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(DashboardTokenDetailReq dashboardTokenDetailReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeLongElement(serialDescriptor, 0, dashboardTokenDetailReq.analysisPlatformId);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, dashboardTokenDetailReq.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, dashboardTokenDetailReq.containAvailableReward);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, dashboardTokenDetailReq.containMarketReward);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], dashboardTokenDetailReq.investmentInfos);
    }

    public DashboardTokenDetailReq(long j, long j2, @NotNull String str, @NotNull String str2, @NotNull List<DashboardTokenDetailInvestInfo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.analysisPlatformId = j;
        this.chainId = j2;
        this.containAvailableReward = str;
        this.containMarketReward = str2;
        this.investmentInfos = list;
    }
}
