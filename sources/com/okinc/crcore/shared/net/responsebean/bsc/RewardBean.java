package com.okinc.crcore.shared.net.responsebean.bsc;

import com.okinc.crcore.coreapi.net.responsebean.bsc.RewardMetadataResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.RewardResponseBean;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class RewardBean {
    private final String campaignCode;
    private final long endTime;
    private final int inactiveCode;
    private final RewardMetadataBean metadata;
    private final String nextAction;
    private final String recordKey;
    private final List<String> relatedMissions;
    private final String rewardCode;
    private final long startTime;
    private final String status;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RewardBean() {
        this((String) null, 0L, 0, (RewardMetadataBean) null, (String) null, (String) null, (List) null, (String) null, 0L, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.campaignCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.inactiveCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RewardMetadataBean component4() {
        return this.metadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.nextAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.recordKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component7() {
        return this.relatedMissions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.rewardCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component9() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RewardBean copy(@NotNull String str, long j, int i, RewardMetadataBean rewardMetadataBean, @NotNull String str2, @NotNull String str3, @NotNull List<String> list, @NotNull String str4, long j2, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new RewardBean(str, j, i, rewardMetadataBean, str2, str3, list, str4, j2, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardBean)) {
            return false;
        }
        RewardBean rewardBean = (RewardBean) obj;
        return Intrinsics.EZpvd((Object) this.campaignCode, (Object) rewardBean.campaignCode) && this.endTime == rewardBean.endTime && this.inactiveCode == rewardBean.inactiveCode && Intrinsics.EZpvd(this.metadata, rewardBean.metadata) && Intrinsics.EZpvd((Object) this.nextAction, (Object) rewardBean.nextAction) && Intrinsics.EZpvd((Object) this.recordKey, (Object) rewardBean.recordKey) && Intrinsics.EZpvd(this.relatedMissions, rewardBean.relatedMissions) && Intrinsics.EZpvd((Object) this.rewardCode, (Object) rewardBean.rewardCode) && this.startTime == rewardBean.startTime && Intrinsics.EZpvd((Object) this.status, (Object) rewardBean.status);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCampaignCode() {
        return this.campaignCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getInactiveCode() {
        return this.inactiveCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RewardMetadataBean getMetadata() {
        return this.metadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextAction() {
        return this.nextAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecordKey() {
        return this.recordKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getRelatedMissions() {
        return this.relatedMissions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRewardCode() {
        return this.rewardCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.campaignCode.hashCode();
        int iHashCode2 = Long.hashCode(this.endTime);
        int iHashCode3 = Integer.hashCode(this.inactiveCode);
        RewardMetadataBean rewardMetadataBean = this.metadata;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (rewardMetadataBean == null ? 0 : rewardMetadataBean.hashCode())) * 31) + this.nextAction.hashCode()) * 31) + this.recordKey.hashCode()) * 31) + this.relatedMissions.hashCode()) * 31) + this.rewardCode.hashCode()) * 31) + Long.hashCode(this.startTime)) * 31) + this.status.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RewardBean(campaignCode=" + this.campaignCode + ", endTime=" + this.endTime + ", inactiveCode=" + this.inactiveCode + ", metadata=" + this.metadata + ", nextAction=" + this.nextAction + ", recordKey=" + this.recordKey + ", relatedMissions=" + this.relatedMissions + ", rewardCode=" + this.rewardCode + ", startTime=" + this.startTime + ", status=" + this.status + ")";
    }

    public /* synthetic */ RewardBean(int i, String str, long j, int i2, RewardMetadataBean rewardMetadataBean, String str2, String str3, List list, String str4, long j2, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.campaignCode = "";
        } else {
            this.campaignCode = str;
        }
        if ((i & 2) == 0) {
            this.endTime = 0L;
        } else {
            this.endTime = j;
        }
        this.inactiveCode = (i & 4) == 0 ? 0 : i2;
        this.metadata = (i & 8) == 0 ? null : rewardMetadataBean;
        if ((i & 16) == 0) {
            this.nextAction = "";
        } else {
            this.nextAction = str2;
        }
        if ((i & 32) == 0) {
            this.recordKey = "";
        } else {
            this.recordKey = str3;
        }
        this.relatedMissions = (i & 64) == 0 ? yDY.AhwBna() : list;
        if ((i & 128) == 0) {
            this.rewardCode = "";
        } else {
            this.rewardCode = str4;
        }
        this.startTime = (i & 256) != 0 ? j2 : 0L;
        if ((i & 512) == 0) {
            this.status = "";
        } else {
            this.status = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(RewardBean rewardBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) rewardBean.campaignCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, rewardBean.campaignCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || rewardBean.endTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, rewardBean.endTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || rewardBean.inactiveCode != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, rewardBean.inactiveCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || rewardBean.metadata != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, RewardMetadataBean$$serializer.INSTANCE, rewardBean.metadata);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) rewardBean.nextAction, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, rewardBean.nextAction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) rewardBean.recordKey, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, rewardBean.recordKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(rewardBean.relatedMissions, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], rewardBean.relatedMissions);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) rewardBean.rewardCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, rewardBean.rewardCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || rewardBean.startTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 8, rewardBean.startTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) rewardBean.status, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, rewardBean.status);
    }

    public RewardBean(@NotNull String str, long j, int i, RewardMetadataBean rewardMetadataBean, @NotNull String str2, @NotNull String str3, @NotNull List<String> list, @NotNull String str4, long j2, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.campaignCode = str;
        this.endTime = j;
        this.inactiveCode = i;
        this.metadata = rewardMetadataBean;
        this.nextAction = str2;
        this.recordKey = str3;
        this.relatedMissions = list;
        this.rewardCode = str4;
        this.startTime = j2;
        this.status = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r27v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r16v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0015: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r18v0 int))
  (wrap:com.okinc.crcore.shared.net.responsebean.bsc.RewardMetadataBean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r27v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.shared.net.responsebean.bsc.RewardMetadataBean) : (r19v0 com.okinc.crcore.shared.net.responsebean.bsc.RewardMetadataBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r27v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0035: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0039: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:188)) : (r22v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0048: ARITH (r27v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r24v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r27v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r26v0 java.lang.String) : (""))
 A[MD:(java.lang.String, long, int, com.okinc.crcore.shared.net.responsebean.bsc.RewardMetadataBean, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, long, java.lang.String):void (m)] (LINE:181) call: com.okinc.crcore.shared.net.responsebean.bsc.RewardBean.<init>(java.lang.String, long, int, com.okinc.crcore.shared.net.responsebean.bsc.RewardMetadataBean, java.lang.String, java.lang.String, java.util.List, java.lang.String, long, java.lang.String):void type: THIS */
    public /* synthetic */ RewardBean(String str, long j, int i, RewardMetadataBean rewardMetadataBean, String str2, String str3, List list, String str4, long j2, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : rewardMetadataBean, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? yDY.AhwBna() : list, (i2 & 128) != 0 ? "" : str4, (i2 & 256) == 0 ? j2 : 0L, (i2 & 512) == 0 ? str5 : "");
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.RewardBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RewardBean> serializer() {
            return RewardBean$$serializer.INSTANCE;
        }

        public final RewardBean AEQbTJ(@NotNull RewardResponseBean rewardResponseBean) {
            Intrinsics.checkNotNullParameter(rewardResponseBean, "");
            String campaignCode = rewardResponseBean.getCampaignCode();
            long endTime = rewardResponseBean.getEndTime();
            int inactiveCode = rewardResponseBean.getInactiveCode();
            RewardMetadataResponseBean metadata = rewardResponseBean.getMetadata();
            return new RewardBean(campaignCode, endTime, inactiveCode, metadata != null ? RewardMetadataBean.Companion.OLrzqt(metadata) : null, rewardResponseBean.getNextAction(), rewardResponseBean.getRecordKey(), rewardResponseBean.getRelatedMissions(), rewardResponseBean.getRewardCode(), rewardResponseBean.getStartTime(), rewardResponseBean.getStatus());
        }
    }
}
