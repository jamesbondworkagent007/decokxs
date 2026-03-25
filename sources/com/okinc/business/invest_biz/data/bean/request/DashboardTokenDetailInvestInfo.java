package com.okinc.business.invest_biz.data.bean.request;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class DashboardTokenDetailInvestInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int investType;
    private final String investmentKey;
    private final String poolAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DashboardTokenDetailInvestInfo copy$default(DashboardTokenDetailInvestInfo dashboardTokenDetailInvestInfo, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dashboardTokenDetailInvestInfo.investmentKey;
        }
        if ((i2 & 2) != 0) {
            i = dashboardTokenDetailInvestInfo.investType;
        }
        if ((i2 & 4) != 0) {
            str2 = dashboardTokenDetailInvestInfo.poolAddress;
        }
        return dashboardTokenDetailInvestInfo.copy(str, i, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.investmentKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.poolAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DashboardTokenDetailInvestInfo copy(@NotNull String str, int i, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new DashboardTokenDetailInvestInfo(str, i, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DashboardTokenDetailInvestInfo)) {
            return false;
        }
        DashboardTokenDetailInvestInfo dashboardTokenDetailInvestInfo = (DashboardTokenDetailInvestInfo) obj;
        return Intrinsics.EZpvd((Object) this.investmentKey, (Object) dashboardTokenDetailInvestInfo.investmentKey) && this.investType == dashboardTokenDetailInvestInfo.investType && Intrinsics.EZpvd((Object) this.poolAddress, (Object) dashboardTokenDetailInvestInfo.poolAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getInvestType() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestmentKey() {
        return this.investmentKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPoolAddress() {
        return this.poolAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.investmentKey.hashCode() * 31) + Integer.hashCode(this.investType)) * 31) + this.poolAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DashboardTokenDetailInvestInfo(investmentKey=" + this.investmentKey + ", investType=" + this.investType + ", poolAddress=" + this.poolAddress + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.request.DashboardTokenDetailInvestInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DashboardTokenDetailInvestInfo> serializer() {
            return DashboardTokenDetailInvestInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DashboardTokenDetailInvestInfo(int i, String str, int i2, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, DashboardTokenDetailInvestInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.investmentKey = str;
        this.investType = i2;
        this.poolAddress = str2;
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(DashboardTokenDetailInvestInfo dashboardTokenDetailInvestInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, dashboardTokenDetailInvestInfo.investmentKey);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, dashboardTokenDetailInvestInfo.investType);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, dashboardTokenDetailInvestInfo.poolAddress);
    }

    public DashboardTokenDetailInvestInfo(@NotNull String str, int i, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.investmentKey = str;
        this.investType = i;
        this.poolAddress = str2;
    }
}
