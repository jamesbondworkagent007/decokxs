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
public final class DashboardTokenDetailWarpReq {
    private final String accountId;
    private final List<DashboardTokenDetailReq> platformList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(DashboardTokenDetailReq$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.request.DashboardTokenDetailWarpReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DashboardTokenDetailWarpReq copy$default(DashboardTokenDetailWarpReq dashboardTokenDetailWarpReq, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dashboardTokenDetailWarpReq.accountId;
        }
        if ((i & 2) != 0) {
            list = dashboardTokenDetailWarpReq.platformList;
        }
        return dashboardTokenDetailWarpReq.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DashboardTokenDetailReq> component2() {
        return this.platformList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DashboardTokenDetailWarpReq copy(@NotNull String str, @NotNull List<DashboardTokenDetailReq> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new DashboardTokenDetailWarpReq(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DashboardTokenDetailWarpReq)) {
            return false;
        }
        DashboardTokenDetailWarpReq dashboardTokenDetailWarpReq = (DashboardTokenDetailWarpReq) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) dashboardTokenDetailWarpReq.accountId) && Intrinsics.EZpvd(this.platformList, dashboardTokenDetailWarpReq.platformList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DashboardTokenDetailReq> getPlatformList() {
        return this.platformList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.accountId.hashCode() * 31) + this.platformList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DashboardTokenDetailWarpReq(accountId=" + this.accountId + ", platformList=" + this.platformList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.request.DashboardTokenDetailWarpReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DashboardTokenDetailWarpReq> serializer() {
            return DashboardTokenDetailWarpReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DashboardTokenDetailWarpReq(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, DashboardTokenDetailWarpReq$$serializer.INSTANCE.getDescriptor());
        }
        this.accountId = str;
        this.platformList = list;
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(DashboardTokenDetailWarpReq dashboardTokenDetailWarpReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, dashboardTokenDetailWarpReq.accountId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], dashboardTokenDetailWarpReq.platformList);
    }

    public DashboardTokenDetailWarpReq(@NotNull String str, @NotNull List<DashboardTokenDetailReq> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.accountId = str;
        this.platformList = list;
    }
}
