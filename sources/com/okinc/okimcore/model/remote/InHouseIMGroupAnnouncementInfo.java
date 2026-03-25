package com.okinc.okimcore.model.remote;

import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InHouseIMGroupAnnouncementInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String content;
    private final String createBy;
    private final String createByName;
    private final long createTime;
    private final Long editTime;
    private final String groupId;
    private final String id;
    private final String operatorUid;
    private final long pinStatus;
    private final String updateBy;
    private final String updateByName;
    private final long updateTime;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component10() {
        return this.editTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.createByName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.updateByName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.operatorUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.pinStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.createBy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component7() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.updateBy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component9() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMGroupAnnouncementInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, @NotNull String str5, long j2, @NotNull String str6, long j3, Long l, String str7, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new InHouseIMGroupAnnouncementInfo(str, str2, str3, str4, j, str5, j2, str6, j3, l, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InHouseIMGroupAnnouncementInfo)) {
            return false;
        }
        InHouseIMGroupAnnouncementInfo inHouseIMGroupAnnouncementInfo = (InHouseIMGroupAnnouncementInfo) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) inHouseIMGroupAnnouncementInfo.id) && Intrinsics.EZpvd((Object) this.groupId, (Object) inHouseIMGroupAnnouncementInfo.groupId) && Intrinsics.EZpvd((Object) this.operatorUid, (Object) inHouseIMGroupAnnouncementInfo.operatorUid) && Intrinsics.EZpvd((Object) this.content, (Object) inHouseIMGroupAnnouncementInfo.content) && this.pinStatus == inHouseIMGroupAnnouncementInfo.pinStatus && Intrinsics.EZpvd((Object) this.createBy, (Object) inHouseIMGroupAnnouncementInfo.createBy) && this.createTime == inHouseIMGroupAnnouncementInfo.createTime && Intrinsics.EZpvd((Object) this.updateBy, (Object) inHouseIMGroupAnnouncementInfo.updateBy) && this.updateTime == inHouseIMGroupAnnouncementInfo.updateTime && Intrinsics.EZpvd(this.editTime, inHouseIMGroupAnnouncementInfo.editTime) && Intrinsics.EZpvd((Object) this.createByName, (Object) inHouseIMGroupAnnouncementInfo.createByName) && Intrinsics.EZpvd((Object) this.updateByName, (Object) inHouseIMGroupAnnouncementInfo.updateByName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreateBy() {
        return this.createBy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreateByName() {
        return this.createByName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getEditTime() {
        return this.editTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOperatorUid() {
        return this.operatorUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getPinStatus() {
        return this.pinStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUpdateBy() {
        return this.updateBy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUpdateByName() {
        return this.updateByName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.groupId.hashCode();
        int iHashCode3 = this.operatorUid.hashCode();
        int iHashCode4 = this.content.hashCode();
        int iHashCode5 = Long.hashCode(this.pinStatus);
        int iHashCode6 = this.createBy.hashCode();
        int iHashCode7 = Long.hashCode(this.createTime);
        int iHashCode8 = this.updateBy.hashCode();
        int iHashCode9 = Long.hashCode(this.updateTime);
        Long l = this.editTime;
        int iHashCode10 = l == null ? 0 : l.hashCode();
        String str = this.createByName;
        int iHashCode11 = str == null ? 0 : str.hashCode();
        String str2 = this.updateByName;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMGroupAnnouncementInfo(id=" + this.id + ", groupId=" + this.groupId + ", operatorUid=" + this.operatorUid + ", content=" + this.content + ", pinStatus=" + this.pinStatus + ", createBy=" + this.createBy + ", createTime=" + this.createTime + ", updateBy=" + this.updateBy + ", updateTime=" + this.updateTime + ", editTime=" + this.editTime + ", createByName=" + this.createByName + ", updateByName=" + this.updateByName + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.InHouseIMGroupAnnouncementInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseIMGroupAnnouncementInfo> serializer() {
            return InHouseIMGroupAnnouncementInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InHouseIMGroupAnnouncementInfo(int i, String str, String str2, String str3, String str4, long j, String str5, long j2, String str6, long j3, Long l, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i, FrameMetricsAggregator.EVERY_DURATION, InHouseIMGroupAnnouncementInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.groupId = str2;
        this.operatorUid = str3;
        this.content = str4;
        this.pinStatus = j;
        this.createBy = str5;
        this.createTime = j2;
        this.updateBy = str6;
        this.updateTime = j3;
        if ((i & 512) == 0) {
            this.editTime = null;
        } else {
            this.editTime = l;
        }
        if ((i & 1024) == 0) {
            this.createByName = null;
        } else {
            this.createByName = str7;
        }
        if ((i & 2048) == 0) {
            this.updateByName = null;
        } else {
            this.updateByName = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(InHouseIMGroupAnnouncementInfo inHouseIMGroupAnnouncementInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, inHouseIMGroupAnnouncementInfo.id);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, inHouseIMGroupAnnouncementInfo.groupId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, inHouseIMGroupAnnouncementInfo.operatorUid);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, inHouseIMGroupAnnouncementInfo.content);
        compositeEncoder.encodeLongElement(serialDescriptor, 4, inHouseIMGroupAnnouncementInfo.pinStatus);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, inHouseIMGroupAnnouncementInfo.createBy);
        compositeEncoder.encodeLongElement(serialDescriptor, 6, inHouseIMGroupAnnouncementInfo.createTime);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, inHouseIMGroupAnnouncementInfo.updateBy);
        compositeEncoder.encodeLongElement(serialDescriptor, 8, inHouseIMGroupAnnouncementInfo.updateTime);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || inHouseIMGroupAnnouncementInfo.editTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.INSTANCE, inHouseIMGroupAnnouncementInfo.editTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || inHouseIMGroupAnnouncementInfo.createByName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, inHouseIMGroupAnnouncementInfo.createByName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && inHouseIMGroupAnnouncementInfo.updateByName == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, inHouseIMGroupAnnouncementInfo.updateByName);
    }

    public InHouseIMGroupAnnouncementInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, @NotNull String str5, long j2, @NotNull String str6, long j3, Long l, String str7, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.id = str;
        this.groupId = str2;
        this.operatorUid = str3;
        this.content = str4;
        this.pinStatus = j;
        this.createBy = str5;
        this.createTime = j2;
        this.updateBy = str6;
        this.updateTime = j3;
        this.editTime = l;
        this.createByName = str7;
        this.updateByName = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 long)
  (r26v0 java.lang.String)
  (r27v0 long)
  (r29v0 java.lang.String)
  (r30v0 long)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r35v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r32v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r35v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r35v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, long, java.lang.String, long, java.lang.Long, java.lang.String, java.lang.String):void (m)] (LINE:146) call: com.okinc.okimcore.model.remote.InHouseIMGroupAnnouncementInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, long, java.lang.String, long, java.lang.Long, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InHouseIMGroupAnnouncementInfo(String str, String str2, String str3, String str4, long j, String str5, long j2, String str6, long j3, Long l, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, j, str5, j2, str6, j3, (i & 512) != 0 ? null : l, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8);
    }
}
