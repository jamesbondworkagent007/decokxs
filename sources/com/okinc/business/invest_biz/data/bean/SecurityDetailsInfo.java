package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class SecurityDetailsInfo implements Parcelable {
    private final AlertsHighlightsScoreInfo alertsScore;
    private final AlertsHighlightsScoreInfo highlightsScore;
    private final String nightWebsiteLogo;
    private final String scoreExplain;
    private final String securityScoreColor;
    private final List<SecurityRadarScoreInfo> securityScores;
    private final String websiteLogo;
    private final String websiteName;
    private final String websiteUrl;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SecurityDetailsInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(SecurityRadarScoreInfo$$serializer.INSTANCE), null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<SecurityDetailsInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SecurityDetailsInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList = null;
            AlertsHighlightsScoreInfo alertsHighlightsScoreInfoCreateFromParcel = parcel.readInt() == 0 ? null : AlertsHighlightsScoreInfo.CREATOR.createFromParcel(parcel);
            AlertsHighlightsScoreInfo alertsHighlightsScoreInfoCreateFromParcel2 = parcel.readInt() == 0 ? null : AlertsHighlightsScoreInfo.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(SecurityRadarScoreInfo.CREATOR.createFromParcel(parcel));
                }
            }
            return new SecurityDetailsInfo(alertsHighlightsScoreInfoCreateFromParcel, alertsHighlightsScoreInfoCreateFromParcel2, string, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SecurityDetailsInfo[] newArray(int i) {
            return new SecurityDetailsInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SecurityDetailsInfo() {
        this((AlertsHighlightsScoreInfo) null, (AlertsHighlightsScoreInfo) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertsHighlightsScoreInfo component1() {
        return this.alertsScore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertsHighlightsScoreInfo component2() {
        return this.highlightsScore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.scoreExplain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SecurityRadarScoreInfo> component4() {
        return this.securityScores;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.websiteLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.websiteName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.websiteUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.nightWebsiteLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.securityScoreColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SecurityDetailsInfo copy(AlertsHighlightsScoreInfo alertsHighlightsScoreInfo, AlertsHighlightsScoreInfo alertsHighlightsScoreInfo2, String str, List<SecurityRadarScoreInfo> list, String str2, String str3, String str4, String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str6, "");
        return new SecurityDetailsInfo(alertsHighlightsScoreInfo, alertsHighlightsScoreInfo2, str, list, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof SecurityDetailsInfo)) {
            return false;
        }
        SecurityDetailsInfo securityDetailsInfo = (SecurityDetailsInfo) obj;
        return Intrinsics.EZpvd(this.alertsScore, securityDetailsInfo.alertsScore) && Intrinsics.EZpvd(this.highlightsScore, securityDetailsInfo.highlightsScore) && Intrinsics.EZpvd((Object) this.scoreExplain, (Object) securityDetailsInfo.scoreExplain) && Intrinsics.EZpvd(this.securityScores, securityDetailsInfo.securityScores) && Intrinsics.EZpvd((Object) this.websiteLogo, (Object) securityDetailsInfo.websiteLogo) && Intrinsics.EZpvd((Object) this.websiteName, (Object) securityDetailsInfo.websiteName) && Intrinsics.EZpvd((Object) this.websiteUrl, (Object) securityDetailsInfo.websiteUrl) && Intrinsics.EZpvd((Object) this.nightWebsiteLogo, (Object) securityDetailsInfo.nightWebsiteLogo) && Intrinsics.EZpvd((Object) this.securityScoreColor, (Object) securityDetailsInfo.securityScoreColor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertsHighlightsScoreInfo getAlertsScore() {
        return this.alertsScore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertsHighlightsScoreInfo getHighlightsScore() {
        return this.highlightsScore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNightWebsiteLogo() {
        return this.nightWebsiteLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getScoreExplain() {
        return this.scoreExplain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSecurityScoreColor() {
        return this.securityScoreColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SecurityRadarScoreInfo> getSecurityScores() {
        return this.securityScores;
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
    public final String getWebsiteUrl() {
        return this.websiteUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        AlertsHighlightsScoreInfo alertsHighlightsScoreInfo = this.alertsScore;
        int iHashCode = alertsHighlightsScoreInfo == null ? 0 : alertsHighlightsScoreInfo.hashCode();
        AlertsHighlightsScoreInfo alertsHighlightsScoreInfo2 = this.highlightsScore;
        int iHashCode2 = alertsHighlightsScoreInfo2 == null ? 0 : alertsHighlightsScoreInfo2.hashCode();
        String str = this.scoreExplain;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        List<SecurityRadarScoreInfo> list = this.securityScores;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        String str2 = this.websiteLogo;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.websiteName;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.websiteUrl;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.nightWebsiteLogo;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str5 != null ? str5.hashCode() : 0)) * 31) + this.securityScoreColor.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SecurityDetailsInfo(alertsScore=" + this.alertsScore + ", highlightsScore=" + this.highlightsScore + ", scoreExplain=" + this.scoreExplain + ", securityScores=" + this.securityScores + ", websiteLogo=" + this.websiteLogo + ", websiteName=" + this.websiteName + ", websiteUrl=" + this.websiteUrl + ", nightWebsiteLogo=" + this.nightWebsiteLogo + ", securityScoreColor=" + this.securityScoreColor + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        AlertsHighlightsScoreInfo alertsHighlightsScoreInfo = this.alertsScore;
        if (alertsHighlightsScoreInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            alertsHighlightsScoreInfo.writeToParcel(parcel, i);
        }
        AlertsHighlightsScoreInfo alertsHighlightsScoreInfo2 = this.highlightsScore;
        if (alertsHighlightsScoreInfo2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            alertsHighlightsScoreInfo2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.scoreExplain);
        List<SecurityRadarScoreInfo> list = this.securityScores;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<SecurityRadarScoreInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.websiteLogo);
        parcel.writeString(this.websiteName);
        parcel.writeString(this.websiteUrl);
        parcel.writeString(this.nightWebsiteLogo);
        parcel.writeString(this.securityScoreColor);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.SecurityDetailsInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SecurityDetailsInfo> serializer() {
            return SecurityDetailsInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SecurityDetailsInfo(int i, AlertsHighlightsScoreInfo alertsHighlightsScoreInfo, AlertsHighlightsScoreInfo alertsHighlightsScoreInfo2, String str, List list, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.alertsScore = null;
        } else {
            this.alertsScore = alertsHighlightsScoreInfo;
        }
        if ((i & 2) == 0) {
            this.highlightsScore = null;
        } else {
            this.highlightsScore = alertsHighlightsScoreInfo2;
        }
        if ((i & 4) == 0) {
            this.scoreExplain = null;
        } else {
            this.scoreExplain = str;
        }
        if ((i & 8) == 0) {
            this.securityScores = null;
        } else {
            this.securityScores = list;
        }
        if ((i & 16) == 0) {
            this.websiteLogo = null;
        } else {
            this.websiteLogo = str2;
        }
        if ((i & 32) == 0) {
            this.websiteName = null;
        } else {
            this.websiteName = str3;
        }
        if ((i & 64) == 0) {
            this.websiteUrl = null;
        } else {
            this.websiteUrl = str4;
        }
        if ((i & 128) == 0) {
            this.nightWebsiteLogo = null;
        } else {
            this.nightWebsiteLogo = str5;
        }
        if ((i & 256) == 0) {
            this.securityScoreColor = "";
        } else {
            this.securityScoreColor = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(SecurityDetailsInfo securityDetailsInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || securityDetailsInfo.alertsScore != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, AlertsHighlightsScoreInfo$$serializer.INSTANCE, securityDetailsInfo.alertsScore);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || securityDetailsInfo.highlightsScore != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, AlertsHighlightsScoreInfo$$serializer.INSTANCE, securityDetailsInfo.highlightsScore);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || securityDetailsInfo.scoreExplain != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, securityDetailsInfo.scoreExplain);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || securityDetailsInfo.securityScores != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], securityDetailsInfo.securityScores);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || securityDetailsInfo.websiteLogo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, securityDetailsInfo.websiteLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || securityDetailsInfo.websiteName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, securityDetailsInfo.websiteName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || securityDetailsInfo.websiteUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, securityDetailsInfo.websiteUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || securityDetailsInfo.nightWebsiteLogo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, securityDetailsInfo.nightWebsiteLogo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd((Object) securityDetailsInfo.securityScoreColor, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 8, securityDetailsInfo.securityScoreColor);
    }

    public SecurityDetailsInfo(AlertsHighlightsScoreInfo alertsHighlightsScoreInfo, AlertsHighlightsScoreInfo alertsHighlightsScoreInfo2, String str, List<SecurityRadarScoreInfo> list, String str2, String str3, String str4, String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str6, "");
        this.alertsScore = alertsHighlightsScoreInfo;
        this.highlightsScore = alertsHighlightsScoreInfo2;
        this.scoreExplain = str;
        this.securityScores = list;
        this.websiteLogo = str2;
        this.websiteName = str3;
        this.websiteUrl = str4;
        this.nightWebsiteLogo = str5;
        this.securityScoreColor = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0055: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.data.bean.AlertsHighlightsScoreInfo:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.AlertsHighlightsScoreInfo) : (r11v0 com.okinc.business.invest_biz.data.bean.AlertsHighlightsScoreInfo))
  (wrap:com.okinc.business.invest_biz.data.bean.AlertsHighlightsScoreInfo:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.AlertsHighlightsScoreInfo) : (r12v0 com.okinc.business.invest_biz.data.bean.AlertsHighlightsScoreInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r14v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r20v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
 A[MD:(com.okinc.business.invest_biz.data.bean.AlertsHighlightsScoreInfo, com.okinc.business.invest_biz.data.bean.AlertsHighlightsScoreInfo, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.SecurityRadarScoreInfo>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:79) call: com.okinc.business.invest_biz.data.bean.SecurityDetailsInfo.<init>(com.okinc.business.invest_biz.data.bean.AlertsHighlightsScoreInfo, com.okinc.business.invest_biz.data.bean.AlertsHighlightsScoreInfo, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SecurityDetailsInfo(AlertsHighlightsScoreInfo alertsHighlightsScoreInfo, AlertsHighlightsScoreInfo alertsHighlightsScoreInfo2, String str, List list, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : alertsHighlightsScoreInfo, (i & 2) != 0 ? null : alertsHighlightsScoreInfo2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) == 0 ? str5 : null, (i & 256) != 0 ? "" : str6);
    }
}
