package com.okinc.business.invest_biz.data.bean.response;

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
public final class ProtocolExtraData {
    public final List<AdditionalData> additionalDataList;
    public final HealthRate healthRate;
    public final Points points;
    public final ProtocolRewards protocolRewards;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(AdditionalData$$serializer.INSTANCE), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ProtocolExtraData() {
        this((List) null, (HealthRate) null, (Points) null, (ProtocolRewards) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.response.ProtocolExtraData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProtocolExtraData copy$default(ProtocolExtraData protocolExtraData, List list, HealthRate healthRate, Points points, ProtocolRewards protocolRewards, int i, Object obj) {
        if ((i & 1) != 0) {
            list = protocolExtraData.additionalDataList;
        }
        if ((i & 2) != 0) {
            healthRate = protocolExtraData.healthRate;
        }
        if ((i & 4) != 0) {
            points = protocolExtraData.points;
        }
        if ((i & 8) != 0) {
            protocolRewards = protocolExtraData.protocolRewards;
        }
        return protocolExtraData.copydefault(list, healthRate, points, protocolRewards);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HealthRate AEQbTJ() {
        return this.healthRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Points EZpvd() {
        return this.points;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AdditionalData> KWHzl() {
        return this.additionalDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProtocolExtraData copydefault(@NotNull List<AdditionalData> list, HealthRate healthRate, Points points, ProtocolRewards protocolRewards) {
        Intrinsics.checkNotNullParameter(list, "");
        return new ProtocolExtraData(list, healthRate, points, protocolRewards);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProtocolRewards copydefault() {
        return this.protocolRewards;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtocolExtraData)) {
            return false;
        }
        ProtocolExtraData protocolExtraData = (ProtocolExtraData) obj;
        return Intrinsics.EZpvd(this.additionalDataList, protocolExtraData.additionalDataList) && Intrinsics.EZpvd(this.healthRate, protocolExtraData.healthRate) && Intrinsics.EZpvd(this.points, protocolExtraData.points) && Intrinsics.EZpvd(this.protocolRewards, protocolExtraData.protocolRewards);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.additionalDataList.hashCode();
        HealthRate healthRate = this.healthRate;
        int iHashCode2 = healthRate == null ? 0 : healthRate.hashCode();
        Points points = this.points;
        int iHashCode3 = points == null ? 0 : points.hashCode();
        ProtocolRewards protocolRewards = this.protocolRewards;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (protocolRewards != null ? protocolRewards.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProtocolExtraData(additionalDataList=" + this.additionalDataList + ", healthRate=" + this.healthRate + ", points=" + this.points + ", protocolRewards=" + this.protocolRewards + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.response.ProtocolExtraData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ProtocolExtraData> serializer() {
            return ProtocolExtraData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ProtocolExtraData(int i, List list, HealthRate healthRate, Points points, ProtocolRewards protocolRewards, SerializationConstructorMarker serializationConstructorMarker) {
        this.additionalDataList = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.healthRate = null;
        } else {
            this.healthRate = healthRate;
        }
        if ((i & 4) == 0) {
            this.points = null;
        } else {
            this.points = points;
        }
        if ((i & 8) == 0) {
            this.protocolRewards = null;
        } else {
            this.protocolRewards = protocolRewards;
        }
    }

    public static final /* synthetic */ void OLrzqt(ProtocolExtraData protocolExtraData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(protocolExtraData.additionalDataList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], protocolExtraData.additionalDataList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || protocolExtraData.healthRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, HealthRate$$serializer.INSTANCE, protocolExtraData.healthRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || protocolExtraData.points != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, Points$$serializer.INSTANCE, protocolExtraData.points);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && protocolExtraData.protocolRewards == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, ProtocolRewards$$serializer.INSTANCE, protocolExtraData.protocolRewards);
    }

    public ProtocolExtraData(@NotNull List<AdditionalData> list, HealthRate healthRate, Points points, ProtocolRewards protocolRewards) {
        Intrinsics.checkNotNullParameter(list, "");
        this.additionalDataList = list;
        this.healthRate = healthRate;
        this.points = points;
        this.protocolRewards = protocolRewards;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:157)) : (r2v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.bean.response.HealthRate:?: TERNARY null = ((wrap:int:0x0008: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.response.HealthRate) : (r3v0 com.okinc.business.invest_biz.data.bean.response.HealthRate))
  (wrap:com.okinc.business.invest_biz.data.bean.response.Points:?: TERNARY null = ((wrap:int:0x000e: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.response.Points) : (r4v0 com.okinc.business.invest_biz.data.bean.response.Points))
  (wrap:com.okinc.business.invest_biz.data.bean.response.ProtocolRewards:?: TERNARY null = ((wrap:int:0x0013: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.response.ProtocolRewards) : (r5v0 com.okinc.business.invest_biz.data.bean.response.ProtocolRewards))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.bean.response.AdditionalData>, com.okinc.business.invest_biz.data.bean.response.HealthRate, com.okinc.business.invest_biz.data.bean.response.Points, com.okinc.business.invest_biz.data.bean.response.ProtocolRewards):void (m)] (LINE:155) call: com.okinc.business.invest_biz.data.bean.response.ProtocolExtraData.<init>(java.util.List, com.okinc.business.invest_biz.data.bean.response.HealthRate, com.okinc.business.invest_biz.data.bean.response.Points, com.okinc.business.invest_biz.data.bean.response.ProtocolRewards):void type: THIS */
    public /* synthetic */ ProtocolExtraData(List list, HealthRate healthRate, Points points, ProtocolRewards protocolRewards, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? null : healthRate, (i & 4) != 0 ? null : points, (i & 8) != 0 ? null : protocolRewards);
    }
}
