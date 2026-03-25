package com.okinc.crcore.shared.net.responsebean.bsc;

import com.okinc.crcore.coreapi.net.responsebean.bsc.MissionMetadataResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.MissionResponseBean;
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
public final class MissionBean {
    private final String campaignCode;
    private final long endTime;
    private final int inactiveCode;
    private final MissionMetadataBean metadata;
    private final String missionCode;
    private final String nextAction;
    private final String recordKey;
    private final List<String> relatedRewards;
    private final long startTime;
    private final String status;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MissionBean() {
        this((String) null, 0L, 0, (MissionMetadataBean) null, (String) null, (String) null, (String) null, (List) null, 0L, (String) null, 1023, (DefaultConstructorMarker) null);
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
    public final MissionMetadataBean component4() {
        return this.metadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.missionCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.nextAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.recordKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component8() {
        return this.relatedRewards;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component9() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MissionBean copy(@NotNull String str, long j, int i, MissionMetadataBean missionMetadataBean, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<String> list, long j2, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new MissionBean(str, j, i, missionMetadataBean, str2, str3, str4, list, j2, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MissionBean)) {
            return false;
        }
        MissionBean missionBean = (MissionBean) obj;
        return Intrinsics.EZpvd((Object) this.campaignCode, (Object) missionBean.campaignCode) && this.endTime == missionBean.endTime && this.inactiveCode == missionBean.inactiveCode && Intrinsics.EZpvd(this.metadata, missionBean.metadata) && Intrinsics.EZpvd((Object) this.missionCode, (Object) missionBean.missionCode) && Intrinsics.EZpvd((Object) this.nextAction, (Object) missionBean.nextAction) && Intrinsics.EZpvd((Object) this.recordKey, (Object) missionBean.recordKey) && Intrinsics.EZpvd(this.relatedRewards, missionBean.relatedRewards) && this.startTime == missionBean.startTime && Intrinsics.EZpvd((Object) this.status, (Object) missionBean.status);
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
    public final MissionMetadataBean getMetadata() {
        return this.metadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMissionCode() {
        return this.missionCode;
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
    public final List<String> getRelatedRewards() {
        return this.relatedRewards;
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
        MissionMetadataBean missionMetadataBean = this.metadata;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (missionMetadataBean == null ? 0 : missionMetadataBean.hashCode())) * 31) + this.missionCode.hashCode()) * 31) + this.nextAction.hashCode()) * 31) + this.recordKey.hashCode()) * 31) + this.relatedRewards.hashCode()) * 31) + Long.hashCode(this.startTime)) * 31) + this.status.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MissionBean(campaignCode=" + this.campaignCode + ", endTime=" + this.endTime + ", inactiveCode=" + this.inactiveCode + ", metadata=" + this.metadata + ", missionCode=" + this.missionCode + ", nextAction=" + this.nextAction + ", recordKey=" + this.recordKey + ", relatedRewards=" + this.relatedRewards + ", startTime=" + this.startTime + ", status=" + this.status + ")";
    }

    public /* synthetic */ MissionBean(int i, String str, long j, int i2, MissionMetadataBean missionMetadataBean, String str2, String str3, String str4, List list, long j2, String str5, SerializationConstructorMarker serializationConstructorMarker) {
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
        this.metadata = (i & 8) == 0 ? null : missionMetadataBean;
        if ((i & 16) == 0) {
            this.missionCode = "";
        } else {
            this.missionCode = str2;
        }
        if ((i & 32) == 0) {
            this.nextAction = "";
        } else {
            this.nextAction = str3;
        }
        if ((i & 64) == 0) {
            this.recordKey = "";
        } else {
            this.recordKey = str4;
        }
        this.relatedRewards = (i & 128) == 0 ? yDY.AhwBna() : list;
        this.startTime = (i & 256) != 0 ? j2 : 0L;
        if ((i & 512) == 0) {
            this.status = "";
        } else {
            this.status = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(MissionBean missionBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) missionBean.campaignCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, missionBean.campaignCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || missionBean.endTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, missionBean.endTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || missionBean.inactiveCode != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, missionBean.inactiveCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || missionBean.metadata != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, MissionMetadataBean$$serializer.INSTANCE, missionBean.metadata);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) missionBean.missionCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, missionBean.missionCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) missionBean.nextAction, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, missionBean.nextAction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) missionBean.recordKey, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, missionBean.recordKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(missionBean.relatedRewards, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], missionBean.relatedRewards);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || missionBean.startTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 8, missionBean.startTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) missionBean.status, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, missionBean.status);
    }

    public MissionBean(@NotNull String str, long j, int i, MissionMetadataBean missionMetadataBean, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<String> list, long j2, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.campaignCode = str;
        this.endTime = j;
        this.inactiveCode = i;
        this.metadata = missionMetadataBean;
        this.missionCode = str2;
        this.nextAction = str3;
        this.recordKey = str4;
        this.relatedRewards = list;
        this.startTime = j2;
        this.status = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r27v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r16v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0015: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r18v0 int))
  (wrap:com.okinc.crcore.shared.net.responsebean.bsc.MissionMetadataBean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r27v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.shared.net.responsebean.bsc.MissionMetadataBean) : (r19v0 com.okinc.crcore.shared.net.responsebean.bsc.MissionMetadataBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r27v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x003d: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0041: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:57)) : (r23v0 java.util.List))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0048: ARITH (r27v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r24v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r27v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r26v0 java.lang.String) : (""))
 A[MD:(java.lang.String, long, int, com.okinc.crcore.shared.net.responsebean.bsc.MissionMetadataBean, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, long, java.lang.String):void (m)] (LINE:49) call: com.okinc.crcore.shared.net.responsebean.bsc.MissionBean.<init>(java.lang.String, long, int, com.okinc.crcore.shared.net.responsebean.bsc.MissionMetadataBean, java.lang.String, java.lang.String, java.lang.String, java.util.List, long, java.lang.String):void type: THIS */
    public /* synthetic */ MissionBean(String str, long j, int i, MissionMetadataBean missionMetadataBean, String str2, String str3, String str4, List list, long j2, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : missionMetadataBean, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? "" : str4, (i2 & 128) != 0 ? yDY.AhwBna() : list, (i2 & 256) == 0 ? j2 : 0L, (i2 & 512) == 0 ? str5 : "");
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.MissionBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MissionBean> serializer() {
            return MissionBean$$serializer.INSTANCE;
        }

        public final MissionBean KWHzl(@NotNull MissionResponseBean missionResponseBean) {
            Intrinsics.checkNotNullParameter(missionResponseBean, "");
            String campaignCode = missionResponseBean.getCampaignCode();
            long endTime = missionResponseBean.getEndTime();
            int inactiveCode = missionResponseBean.getInactiveCode();
            MissionMetadataResponseBean metadata = missionResponseBean.getMetadata();
            return new MissionBean(campaignCode, endTime, inactiveCode, metadata != null ? MissionMetadataBean.Companion.copydefault(metadata) : null, missionResponseBean.getMissionCode(), missionResponseBean.getNextAction(), missionResponseBean.getRecordKey(), missionResponseBean.getRelatedRewards(), missionResponseBean.getStartTime(), missionResponseBean.getStatus());
        }
    }
}
