package com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class SystemNotification implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SystemNotification> CREATOR = new Creator();
    private final String bizType;
    private final String businessIdentity;
    private final String content;
    private final String darkIconLink;
    private final String data;
    private final Long id;
    private final String lightIconLink;
    private final Integer linkType;
    private final String messageName;
    private final Long pushTime;
    private Integer readStatus;
    private final String template;
    private final String title;
    private final Integer type;
    private final String url;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<SystemNotification> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SystemNotification createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SystemNotification(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SystemNotification[] newArray(int i) {
            return new SystemNotification[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SystemNotification() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component11() {
        return this.linkType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.messageName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.template;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.businessIdentity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component15() {
        return this.readStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.lightIconLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.darkIconLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component8() {
        return this.pushTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SystemNotification copy(Long l, String str, String str2, String str3, String str4, String str5, Integer num, Long l2, String str6, String str7, Integer num2, String str8, String str9, String str10, Integer num3) {
        return new SystemNotification(l, str, str2, str3, str4, str5, num, l2, str6, str7, num2, str8, str9, str10, num3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemNotification)) {
            return false;
        }
        SystemNotification systemNotification = (SystemNotification) obj;
        return Intrinsics.EZpvd(this.id, systemNotification.id) && Intrinsics.EZpvd((Object) this.title, (Object) systemNotification.title) && Intrinsics.EZpvd((Object) this.content, (Object) systemNotification.content) && Intrinsics.EZpvd((Object) this.url, (Object) systemNotification.url) && Intrinsics.EZpvd((Object) this.lightIconLink, (Object) systemNotification.lightIconLink) && Intrinsics.EZpvd((Object) this.darkIconLink, (Object) systemNotification.darkIconLink) && Intrinsics.EZpvd(this.type, systemNotification.type) && Intrinsics.EZpvd(this.pushTime, systemNotification.pushTime) && Intrinsics.EZpvd((Object) this.data, (Object) systemNotification.data) && Intrinsics.EZpvd((Object) this.bizType, (Object) systemNotification.bizType) && Intrinsics.EZpvd(this.linkType, systemNotification.linkType) && Intrinsics.EZpvd((Object) this.messageName, (Object) systemNotification.messageName) && Intrinsics.EZpvd((Object) this.template, (Object) systemNotification.template) && Intrinsics.EZpvd((Object) this.businessIdentity, (Object) systemNotification.businessIdentity) && Intrinsics.EZpvd(this.readStatus, systemNotification.readStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBusinessIdentity() {
        return this.businessIdentity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDarkIconLink() {
        return this.darkIconLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLightIconLink() {
        return this.lightIconLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getLinkType() {
        return this.linkType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessageName() {
        return this.messageName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getPushTime() {
        return this.pushTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getReadStatus() {
        return this.readStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTemplate() {
        return this.template;
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
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.id;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.title;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.content;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.url;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.lightIconLink;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.darkIconLink;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        Integer num = this.type;
        int iHashCode7 = num == null ? 0 : num.hashCode();
        Long l2 = this.pushTime;
        int iHashCode8 = l2 == null ? 0 : l2.hashCode();
        String str6 = this.data;
        int iHashCode9 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.bizType;
        int iHashCode10 = str7 == null ? 0 : str7.hashCode();
        Integer num2 = this.linkType;
        int iHashCode11 = num2 == null ? 0 : num2.hashCode();
        String str8 = this.messageName;
        int iHashCode12 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.template;
        int iHashCode13 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.businessIdentity;
        int iHashCode14 = str10 == null ? 0 : str10.hashCode();
        Integer num3 = this.readStatus;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (num3 == null ? 0 : num3.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReadStatus(Integer num) {
        this.readStatus = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SystemNotification(id=" + this.id + ", title=" + this.title + ", content=" + this.content + ", url=" + this.url + ", lightIconLink=" + this.lightIconLink + ", darkIconLink=" + this.darkIconLink + ", type=" + this.type + ", pushTime=" + this.pushTime + ", data=" + this.data + ", bizType=" + this.bizType + ", linkType=" + this.linkType + ", messageName=" + this.messageName + ", template=" + this.template + ", businessIdentity=" + this.businessIdentity + ", readStatus=" + this.readStatus + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.id;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        parcel.writeString(this.url);
        parcel.writeString(this.lightIconLink);
        parcel.writeString(this.darkIconLink);
        Integer num = this.type;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l2 = this.pushTime;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.data);
        parcel.writeString(this.bizType);
        Integer num2 = this.linkType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.messageName);
        parcel.writeString(this.template);
        parcel.writeString(this.businessIdentity);
        Integer num3 = this.readStatus;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }

    public SystemNotification(Long l, String str, String str2, String str3, String str4, String str5, Integer num, Long l2, String str6, String str7, Integer num2, String str8, String str9, String str10, Integer num3) {
        this.id = l;
        this.title = str;
        this.content = str2;
        this.url = str3;
        this.lightIconLink = str4;
        this.darkIconLink = str5;
        this.type = num;
        this.pushTime = l2;
        this.data = str6;
        this.bizType = str7;
        this.linkType = num2;
        this.messageName = str8;
        this.template = str9;
        this.businessIdentity = str10;
        this.readStatus = num3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ab: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r17v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0039: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r23v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0045: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r24v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x005d: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r27v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0068: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0070: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0078: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r30v0 java.lang.String) : (""))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x007f: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r31v0 java.lang.Integer))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:9) call: com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.SystemNotification.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ SystemNotification(Long l, String str, String str2, String str3, String str4, String str5, Integer num, Long l2, String str6, String str7, Integer num2, String str8, String str9, String str10, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : l, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? 0 : num, (i & 128) != 0 ? null : l2, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? "" : str7, (i & 1024) != 0 ? 0 : num2, (i & 2048) != 0 ? "" : str8, (i & 4096) != 0 ? "" : str9, (i & 8192) == 0 ? str10 : "", (i & 16384) != 0 ? 0 : num3);
    }
}
