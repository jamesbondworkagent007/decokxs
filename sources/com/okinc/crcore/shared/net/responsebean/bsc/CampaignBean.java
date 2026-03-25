package com.okinc.crcore.shared.net.responsebean.bsc;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.crcore.coreapi.net.responsebean.bsc.CampaignResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.MissionResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.RewardResponseBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56403yEb;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class CampaignBean {
    private final String campaignCode;
    private final long endTime;
    private final int inactiveCode;
    private final List<MissionBean> missions;
    private final String nextAction;
    private final String recordKey;
    private final List<RewardBean> rewards;
    private final long startTime;
    private final String status;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(MissionBean$$serializer.INSTANCE), null, null, new ArrayListSerializer(RewardBean$$serializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CampaignBean() {
        this((String) null, 0L, 0, (List) null, (String) null, (String) null, (List) null, 0L, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.campaignCode;
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
    public final List<MissionBean> component4() {
        return this.missions;
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
    public final List<RewardBean> component7() {
        return this.rewards;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component8() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CampaignBean copy(@NotNull String str, long j, int i, @NotNull List<MissionBean> list, @NotNull String str2, @NotNull String str3, @NotNull List<RewardBean> list2, long j2, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new CampaignBean(str, j, i, list, str2, str3, list2, j2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CampaignBean)) {
            return false;
        }
        CampaignBean campaignBean = (CampaignBean) obj;
        return Intrinsics.EZpvd((Object) this.campaignCode, (Object) campaignBean.campaignCode) && this.endTime == campaignBean.endTime && this.inactiveCode == campaignBean.inactiveCode && Intrinsics.EZpvd(this.missions, campaignBean.missions) && Intrinsics.EZpvd((Object) this.nextAction, (Object) campaignBean.nextAction) && Intrinsics.EZpvd((Object) this.recordKey, (Object) campaignBean.recordKey) && Intrinsics.EZpvd(this.rewards, campaignBean.rewards) && this.startTime == campaignBean.startTime && Intrinsics.EZpvd((Object) this.status, (Object) campaignBean.status);
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
    public final List<MissionBean> getMissions() {
        return this.missions;
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
    public final List<RewardBean> getRewards() {
        return this.rewards;
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
        return (((((((((((((((this.campaignCode.hashCode() * 31) + Long.hashCode(this.endTime)) * 31) + Integer.hashCode(this.inactiveCode)) * 31) + this.missions.hashCode()) * 31) + this.nextAction.hashCode()) * 31) + this.recordKey.hashCode()) * 31) + this.rewards.hashCode()) * 31) + Long.hashCode(this.startTime)) * 31) + this.status.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CampaignBean(campaignCode=" + this.campaignCode + ", endTime=" + this.endTime + ", inactiveCode=" + this.inactiveCode + ", missions=" + this.missions + ", nextAction=" + this.nextAction + ", recordKey=" + this.recordKey + ", rewards=" + this.rewards + ", startTime=" + this.startTime + ", status=" + this.status + ")";
    }

    public /* synthetic */ CampaignBean(int i, String str, long j, int i2, List list, String str2, String str3, List list2, long j2, String str4, SerializationConstructorMarker serializationConstructorMarker) {
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
        this.missions = (i & 8) == 0 ? yDY.AhwBna() : list;
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
        this.rewards = (i & 64) == 0 ? yDY.AhwBna() : list2;
        this.startTime = (i & 128) != 0 ? j2 : 0L;
        if ((i & 256) == 0) {
            this.status = "";
        } else {
            this.status = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(CampaignBean campaignBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) campaignBean.campaignCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, campaignBean.campaignCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || campaignBean.endTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, campaignBean.endTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || campaignBean.inactiveCode != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, campaignBean.inactiveCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(campaignBean.missions, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], campaignBean.missions);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) campaignBean.nextAction, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, campaignBean.nextAction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) campaignBean.recordKey, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, campaignBean.recordKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(campaignBean.rewards, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], campaignBean.rewards);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || campaignBean.startTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 7, campaignBean.startTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd((Object) campaignBean.status, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 8, campaignBean.status);
    }

    public CampaignBean(@NotNull String str, long j, int i, @NotNull List<MissionBean> list, @NotNull String str2, @NotNull String str3, @NotNull List<RewardBean> list2, long j2, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.campaignCode = str;
        this.endTime = j;
        this.inactiveCode = i;
        this.missions = list;
        this.nextAction = str2;
        this.recordKey = str3;
        this.rewards = list2;
        this.startTime = j2;
        this.status = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0062: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r25v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r15v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0014: ARITH (r25v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r17v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001c: ARITH (r25v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0020: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:20)) : (r18v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r25v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0037: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003b: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:23)) : (r21v0 java.util.List))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0042: ARITH (r25v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r22v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r25v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r24v0 java.lang.String) : (""))
 A[MD:(java.lang.String, long, int, java.util.List<com.okinc.crcore.shared.net.responsebean.bsc.MissionBean>, java.lang.String, java.lang.String, java.util.List<com.okinc.crcore.shared.net.responsebean.bsc.RewardBean>, long, java.lang.String):void (m)] (LINE:15) call: com.okinc.crcore.shared.net.responsebean.bsc.CampaignBean.<init>(java.lang.String, long, int, java.util.List, java.lang.String, java.lang.String, java.util.List, long, java.lang.String):void type: THIS */
    public /* synthetic */ CampaignBean(String str, long j, int i, List list, String str2, String str3, List list2, long j2, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? yDY.AhwBna() : list, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? yDY.AhwBna() : list2, (i2 & 128) == 0 ? j2 : 0L, (i2 & 256) == 0 ? str4 : "");
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.CampaignBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CampaignBean> serializer() {
            return CampaignBean$$serializer.INSTANCE;
        }

        public final CampaignBean OLrzqt(@NotNull CampaignResponseBean campaignResponseBean) {
            Intrinsics.checkNotNullParameter(campaignResponseBean, "");
            String campaignCode = campaignResponseBean.getCampaignCode();
            long endTime = campaignResponseBean.getEndTime();
            int inactiveCode = campaignResponseBean.getInactiveCode();
            List<MissionResponseBean> missions = campaignResponseBean.getMissions();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(missions, 10));
            Iterator<T> it = missions.iterator();
            while (it.hasNext()) {
                arrayList.add(MissionBean.Companion.KWHzl((MissionResponseBean) it.next()));
            }
            String nextAction = campaignResponseBean.getNextAction();
            String recordKey = campaignResponseBean.getRecordKey();
            List<RewardResponseBean> rewards = campaignResponseBean.getRewards();
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(rewards, 10));
            Iterator<T> it2 = rewards.iterator();
            while (it2.hasNext()) {
                arrayList2.add(RewardBean.Companion.AEQbTJ((RewardResponseBean) it2.next()));
            }
            return new CampaignBean(campaignCode, endTime, inactiveCode, arrayList, nextAction, recordKey, arrayList2, campaignResponseBean.getStartTime(), campaignResponseBean.getStatus());
        }
    }
}
