package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class SecurityScoreInfo implements Parcelable {
    private final String colorType;
    private final String nightScoreLogo;
    private final String nightWebsiteLogo;
    private final String score;
    private final String scoreDesc;
    private final String scoreLevel;
    private final String scoreLogo;
    private final SecurityDetailsInfo securityDetails;
    private final String totalScore;
    private final String websiteLogo;
    private final String websiteName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SecurityScoreInfo> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<SecurityScoreInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SecurityScoreInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SecurityScoreInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SecurityDetailsInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SecurityScoreInfo[] newArray(int i) {
            return new SecurityScoreInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SecurityScoreInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (SecurityDetailsInfo) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.colorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.websiteName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SecurityDetailsInfo component11() {
        return this.securityDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.score;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.scoreDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.scoreLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.scoreLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.nightScoreLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.totalScore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.websiteLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.nightWebsiteLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SecurityScoreInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SecurityDetailsInfo securityDetailsInfo) {
        return new SecurityScoreInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, securityDetailsInfo);
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
        if (!(obj instanceof SecurityScoreInfo)) {
            return false;
        }
        SecurityScoreInfo securityScoreInfo = (SecurityScoreInfo) obj;
        return Intrinsics.EZpvd((Object) this.colorType, (Object) securityScoreInfo.colorType) && Intrinsics.EZpvd((Object) this.score, (Object) securityScoreInfo.score) && Intrinsics.EZpvd((Object) this.scoreDesc, (Object) securityScoreInfo.scoreDesc) && Intrinsics.EZpvd((Object) this.scoreLevel, (Object) securityScoreInfo.scoreLevel) && Intrinsics.EZpvd((Object) this.scoreLogo, (Object) securityScoreInfo.scoreLogo) && Intrinsics.EZpvd((Object) this.nightScoreLogo, (Object) securityScoreInfo.nightScoreLogo) && Intrinsics.EZpvd((Object) this.totalScore, (Object) securityScoreInfo.totalScore) && Intrinsics.EZpvd((Object) this.websiteLogo, (Object) securityScoreInfo.websiteLogo) && Intrinsics.EZpvd((Object) this.nightWebsiteLogo, (Object) securityScoreInfo.nightWebsiteLogo) && Intrinsics.EZpvd((Object) this.websiteName, (Object) securityScoreInfo.websiteName) && Intrinsics.EZpvd(this.securityDetails, securityScoreInfo.securityDetails);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getColorType() {
        return this.colorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNightScoreLogo() {
        return this.nightScoreLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNightWebsiteLogo() {
        return this.nightWebsiteLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getScore() {
        return this.score;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getScoreDesc() {
        return this.scoreDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getScoreLevel() {
        return this.scoreLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getScoreLogo() {
        return this.scoreLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SecurityDetailsInfo getSecurityDetails() {
        return this.securityDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalScore() {
        return this.totalScore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWebsiteLogo() {
        return this.websiteLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWebsiteName() {
        return this.websiteName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.colorType;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.score;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.scoreDesc;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.scoreLevel;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.scoreLogo;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.nightScoreLogo;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.totalScore;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.websiteLogo;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.nightWebsiteLogo;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.websiteName;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        SecurityDetailsInfo securityDetailsInfo = this.securityDetails;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (securityDetailsInfo != null ? securityDetailsInfo.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SecurityScoreInfo(colorType=" + this.colorType + ", score=" + this.score + ", scoreDesc=" + this.scoreDesc + ", scoreLevel=" + this.scoreLevel + ", scoreLogo=" + this.scoreLogo + ", nightScoreLogo=" + this.nightScoreLogo + ", totalScore=" + this.totalScore + ", websiteLogo=" + this.websiteLogo + ", nightWebsiteLogo=" + this.nightWebsiteLogo + ", websiteName=" + this.websiteName + ", securityDetails=" + this.securityDetails + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.colorType);
        parcel.writeString(this.score);
        parcel.writeString(this.scoreDesc);
        parcel.writeString(this.scoreLevel);
        parcel.writeString(this.scoreLogo);
        parcel.writeString(this.nightScoreLogo);
        parcel.writeString(this.totalScore);
        parcel.writeString(this.websiteLogo);
        parcel.writeString(this.nightWebsiteLogo);
        parcel.writeString(this.websiteName);
        SecurityDetailsInfo securityDetailsInfo = this.securityDetails;
        if (securityDetailsInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            securityDetailsInfo.writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.SecurityScoreInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SecurityScoreInfo> serializer() {
            return SecurityScoreInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SecurityScoreInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SecurityDetailsInfo securityDetailsInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.colorType = null;
        } else {
            this.colorType = str;
        }
        if ((i & 2) == 0) {
            this.score = null;
        } else {
            this.score = str2;
        }
        if ((i & 4) == 0) {
            this.scoreDesc = null;
        } else {
            this.scoreDesc = str3;
        }
        if ((i & 8) == 0) {
            this.scoreLevel = null;
        } else {
            this.scoreLevel = str4;
        }
        if ((i & 16) == 0) {
            this.scoreLogo = null;
        } else {
            this.scoreLogo = str5;
        }
        if ((i & 32) == 0) {
            this.nightScoreLogo = null;
        } else {
            this.nightScoreLogo = str6;
        }
        if ((i & 64) == 0) {
            this.totalScore = null;
        } else {
            this.totalScore = str7;
        }
        if ((i & 128) == 0) {
            this.websiteLogo = null;
        } else {
            this.websiteLogo = str8;
        }
        if ((i & 256) == 0) {
            this.nightWebsiteLogo = null;
        } else {
            this.nightWebsiteLogo = str9;
        }
        if ((i & 512) == 0) {
            this.websiteName = null;
        } else {
            this.websiteName = str10;
        }
        if ((i & 1024) == 0) {
            this.securityDetails = null;
        } else {
            this.securityDetails = securityDetailsInfo;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(SecurityScoreInfo securityScoreInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || securityScoreInfo.colorType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, securityScoreInfo.colorType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || securityScoreInfo.score != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, securityScoreInfo.score);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || securityScoreInfo.scoreDesc != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, securityScoreInfo.scoreDesc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || securityScoreInfo.scoreLevel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, securityScoreInfo.scoreLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || securityScoreInfo.scoreLogo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, securityScoreInfo.scoreLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || securityScoreInfo.nightScoreLogo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, securityScoreInfo.nightScoreLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || securityScoreInfo.totalScore != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, securityScoreInfo.totalScore);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || securityScoreInfo.websiteLogo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, securityScoreInfo.websiteLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || securityScoreInfo.nightWebsiteLogo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, securityScoreInfo.nightWebsiteLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || securityScoreInfo.websiteName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, securityScoreInfo.websiteName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && securityScoreInfo.securityDetails == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, SecurityDetailsInfo$$serializer.INSTANCE, securityScoreInfo.securityDetails);
    }

    public SecurityScoreInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SecurityDetailsInfo securityDetailsInfo) {
        this.colorType = str;
        this.score = str2;
        this.scoreDesc = str3;
        this.scoreLevel = str4;
        this.scoreLogo = str5;
        this.nightScoreLogo = str6;
        this.totalScore = str7;
        this.websiteLogo = str8;
        this.nightWebsiteLogo = str9;
        this.websiteName = str10;
        this.securityDetails = securityDetailsInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.SecurityDetailsInfo:?: TERNARY null = ((wrap:int:0x0050: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 com.okinc.business.invest_biz.data.bean.SecurityDetailsInfo) : (null com.okinc.business.invest_biz.data.bean.SecurityDetailsInfo))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.SecurityDetailsInfo):void (m)] (LINE:62) call: com.okinc.business.invest_biz.data.bean.SecurityScoreInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.SecurityDetailsInfo):void type: THIS */
    public /* synthetic */ SecurityScoreInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SecurityDetailsInfo securityDetailsInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) == 0 ? securityDetailsInfo : null);
    }
}
