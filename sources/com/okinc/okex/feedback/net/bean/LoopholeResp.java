package com.okinc.okex.feedback.net.bean;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class LoopholeResp {
    private String auditContent;
    private Integer childId;
    private String childName;
    private String content;
    private long createTime;
    private int id;
    private Integer mainCategoryId;
    private String mainCategoryName;
    private String rewardAmount;
    private int status;
    private ArrayList<StatusInfo> statusInfo;
    private String title;
    private Integer type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(StatusInfo$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LoopholeResp() {
        this(0, 0L, 0, (ArrayList) null, (String) null, (String) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.mainCategoryName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.childName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.rewardAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<StatusInfo> component4() {
        return this.statusInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.auditContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.mainCategoryId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component9() {
        return this.childId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LoopholeResp copy(int i, long j, int i2, ArrayList<StatusInfo> arrayList, String str, String str2, Integer num, Integer num2, Integer num3, String str3, String str4, @NotNull String str5, String str6) {
        Intrinsics.checkNotNullParameter(str5, "");
        return new LoopholeResp(i, j, i2, arrayList, str, str2, num, num2, num3, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoopholeResp)) {
            return false;
        }
        LoopholeResp loopholeResp = (LoopholeResp) obj;
        return this.id == loopholeResp.id && this.createTime == loopholeResp.createTime && this.status == loopholeResp.status && Intrinsics.EZpvd(this.statusInfo, loopholeResp.statusInfo) && Intrinsics.EZpvd((Object) this.content, (Object) loopholeResp.content) && Intrinsics.EZpvd((Object) this.auditContent, (Object) loopholeResp.auditContent) && Intrinsics.EZpvd(this.type, loopholeResp.type) && Intrinsics.EZpvd(this.mainCategoryId, loopholeResp.mainCategoryId) && Intrinsics.EZpvd(this.childId, loopholeResp.childId) && Intrinsics.EZpvd((Object) this.mainCategoryName, (Object) loopholeResp.mainCategoryName) && Intrinsics.EZpvd((Object) this.childName, (Object) loopholeResp.childName) && Intrinsics.EZpvd((Object) this.title, (Object) loopholeResp.title) && Intrinsics.EZpvd((Object) this.rewardAmount, (Object) loopholeResp.rewardAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAuditContent() {
        return this.auditContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getChildId() {
        return this.childId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChildName() {
        return this.childName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMainCategoryId() {
        return this.mainCategoryId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMainCategoryName() {
        return this.mainCategoryName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRewardAmount() {
        return this.rewardAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<StatusInfo> getStatusInfo() {
        return this.statusInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id);
        int iHashCode2 = Long.hashCode(this.createTime);
        int iHashCode3 = Integer.hashCode(this.status);
        ArrayList<StatusInfo> arrayList = this.statusInfo;
        int iHashCode4 = arrayList == null ? 0 : arrayList.hashCode();
        String str = this.content;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.auditContent;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.type;
        int iHashCode7 = num == null ? 0 : num.hashCode();
        Integer num2 = this.mainCategoryId;
        int iHashCode8 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.childId;
        int iHashCode9 = num3 == null ? 0 : num3.hashCode();
        String str3 = this.mainCategoryName;
        int iHashCode10 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.childName;
        int iHashCode11 = str4 == null ? 0 : str4.hashCode();
        int iHashCode12 = this.title.hashCode();
        String str5 = this.rewardAmount;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAuditContent(String str) {
        this.auditContent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChildId(Integer num) {
        this.childId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChildName(String str) {
        this.childName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContent(String str) {
        this.content = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(int i) {
        this.id = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMainCategoryId(Integer num) {
        this.mainCategoryId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMainCategoryName(String str) {
        this.mainCategoryName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRewardAmount(String str) {
        this.rewardAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(int i) {
        this.status = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatusInfo(ArrayList<StatusInfo> arrayList) {
        this.statusInfo = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(Integer num) {
        this.type = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LoopholeResp(id=" + this.id + ", createTime=" + this.createTime + ", status=" + this.status + ", statusInfo=" + this.statusInfo + ", content=" + this.content + ", auditContent=" + this.auditContent + ", type=" + this.type + ", mainCategoryId=" + this.mainCategoryId + ", childId=" + this.childId + ", mainCategoryName=" + this.mainCategoryName + ", childName=" + this.childName + ", title=" + this.title + ", rewardAmount=" + this.rewardAmount + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.feedback.net.bean.LoopholeResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LoopholeResp> serializer() {
            return LoopholeResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LoopholeResp(int i, int i2, long j, int i3, ArrayList arrayList, String str, String str2, Integer num, Integer num2, Integer num3, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = 0;
        } else {
            this.id = i2;
        }
        this.createTime = (i & 2) == 0 ? 0L : j;
        if ((i & 4) == 0) {
            this.status = 0;
        } else {
            this.status = i3;
        }
        this.statusInfo = (i & 8) == 0 ? null : arrayList;
        if ((i & 16) == 0) {
            this.content = "";
        } else {
            this.content = str;
        }
        if ((i & 32) == 0) {
            this.auditContent = "";
        } else {
            this.auditContent = str2;
        }
        this.type = (i & 64) == 0 ? num : num;
        this.mainCategoryId = (i & 128) == 0 ? num : num2;
        this.childId = (i & 256) != 0 ? num3 : 0;
        if ((i & 512) == 0) {
            this.mainCategoryName = "";
        } else {
            this.mainCategoryName = str3;
        }
        if ((i & 1024) == 0) {
            this.childName = "";
        } else {
            this.childName = str4;
        }
        if ((i & 2048) == 0) {
            this.title = "";
        } else {
            this.title = str5;
        }
        if ((i & 4096) == 0) {
            this.rewardAmount = "";
        } else {
            this.rewardAmount = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(LoopholeResp loopholeResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        Integer num2;
        Integer num3;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || loopholeResp.id != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, loopholeResp.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || loopholeResp.createTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, loopholeResp.createTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || loopholeResp.status != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, loopholeResp.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || loopholeResp.statusInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], loopholeResp.statusInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) loopholeResp.content, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, loopholeResp.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) loopholeResp.auditContent, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, loopholeResp.auditContent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || (num3 = loopholeResp.type) == null || num3.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, loopholeResp.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || (num2 = loopholeResp.mainCategoryId) == null || num2.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, loopholeResp.mainCategoryId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || (num = loopholeResp.childId) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.INSTANCE, loopholeResp.childId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) loopholeResp.mainCategoryName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, loopholeResp.mainCategoryName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) loopholeResp.childName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, loopholeResp.childName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) loopholeResp.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, loopholeResp.title);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && Intrinsics.EZpvd((Object) loopholeResp.rewardAmount, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, loopholeResp.rewardAmount);
    }

    public LoopholeResp(int i, long j, int i2, ArrayList<StatusInfo> arrayList, String str, String str2, Integer num, Integer num2, Integer num3, String str3, String str4, @NotNull String str5, String str6) {
        Intrinsics.checkNotNullParameter(str5, "");
        this.id = i;
        this.createTime = j;
        this.status = i2;
        this.statusInfo = arrayList;
        this.content = str;
        this.auditContent = str2;
        this.type = num;
        this.mainCategoryId = num2;
        this.childId = num3;
        this.mainCategoryName = str3;
        this.childName = str4;
        this.title = str5;
        this.rewardAmount = str6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoopholeResp(int i, long j, int i2, ArrayList arrayList, String str, String str2, Integer num, Integer num2, Integer num3, String str3, String str4, String str5, String str6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0L : j, (i3 & 4) == 0 ? i2 : 0, (i3 & 8) != 0 ? null : arrayList, (i3 & 16) != 0 ? "" : str, (i3 & 32) != 0 ? "" : str2, (i3 & 64) != 0 ? num : num, (i3 & 128) != 0 ? num : num2, (i3 & 256) == 0 ? num3 : 0, (i3 & 512) != 0 ? "" : str3, (i3 & 1024) != 0 ? "" : str4, (i3 & 2048) != 0 ? "" : str5, (i3 & 4096) == 0 ? str6 : "");
    }
}
