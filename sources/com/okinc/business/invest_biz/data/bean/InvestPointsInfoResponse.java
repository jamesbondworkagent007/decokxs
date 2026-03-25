package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class InvestPointsInfoResponse implements Parcelable {
    private final PointsInfoTip pointInfoTip;
    private final String pointLogoDark;
    private final String pointLogoLight;
    private final PointsInfo pointsInfo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestPointsInfoResponse> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<InvestPointsInfoResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestPointsInfoResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestPointsInfoResponse(parcel.readString(), parcel.readString(), PointsInfoTip.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PointsInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestPointsInfoResponse[] newArray(int i) {
            return new InvestPointsInfoResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestPointsInfoResponse() {
        this((String) null, (String) null, (PointsInfoTip) null, (PointsInfo) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestPointsInfoResponse copy$default(InvestPointsInfoResponse investPointsInfoResponse, String str, String str2, PointsInfoTip pointsInfoTip, PointsInfo pointsInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investPointsInfoResponse.pointLogoLight;
        }
        if ((i & 2) != 0) {
            str2 = investPointsInfoResponse.pointLogoDark;
        }
        if ((i & 4) != 0) {
            pointsInfoTip = investPointsInfoResponse.pointInfoTip;
        }
        if ((i & 8) != 0) {
            pointsInfo = investPointsInfoResponse.pointsInfo;
        }
        return investPointsInfoResponse.copy(str, str2, pointsInfoTip, pointsInfo);
    }

    @SerialName("pointInfoTip")
    public static /* synthetic */ void getPointInfoTip$annotations() {
    }

    @SerialName("pointLogoDark")
    public static /* synthetic */ void getPointLogoDark$annotations() {
    }

    @SerialName("pointLogoLight")
    public static /* synthetic */ void getPointLogoLight$annotations() {
    }

    @SerialName("pointsInfo")
    public static /* synthetic */ void getPointsInfo$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.pointLogoLight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pointLogoDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PointsInfoTip component3() {
        return this.pointInfoTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PointsInfo component4() {
        return this.pointsInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestPointsInfoResponse copy(@NotNull String str, @NotNull String str2, @NotNull PointsInfoTip pointsInfoTip, PointsInfo pointsInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(pointsInfoTip, "");
        return new InvestPointsInfoResponse(str, str2, pointsInfoTip, pointsInfo);
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
        if (!(obj instanceof InvestPointsInfoResponse)) {
            return false;
        }
        InvestPointsInfoResponse investPointsInfoResponse = (InvestPointsInfoResponse) obj;
        return Intrinsics.EZpvd((Object) this.pointLogoLight, (Object) investPointsInfoResponse.pointLogoLight) && Intrinsics.EZpvd((Object) this.pointLogoDark, (Object) investPointsInfoResponse.pointLogoDark) && Intrinsics.EZpvd(this.pointInfoTip, investPointsInfoResponse.pointInfoTip) && Intrinsics.EZpvd(this.pointsInfo, investPointsInfoResponse.pointsInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PointsInfoTip getPointInfoTip() {
        return this.pointInfoTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPointLogoDark() {
        return this.pointLogoDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPointLogoLight() {
        return this.pointLogoLight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PointsInfo getPointsInfo() {
        return this.pointsInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.pointLogoLight.hashCode();
        int iHashCode2 = this.pointLogoDark.hashCode();
        int iHashCode3 = this.pointInfoTip.hashCode();
        PointsInfo pointsInfo = this.pointsInfo;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (pointsInfo == null ? 0 : pointsInfo.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestPointsInfoResponse(pointLogoLight=" + this.pointLogoLight + ", pointLogoDark=" + this.pointLogoDark + ", pointInfoTip=" + this.pointInfoTip + ", pointsInfo=" + this.pointsInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.pointLogoLight);
        parcel.writeString(this.pointLogoDark);
        this.pointInfoTip.writeToParcel(parcel, i);
        PointsInfo pointsInfo = this.pointsInfo;
        if (pointsInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pointsInfo.writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestPointsInfoResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestPointsInfoResponse> serializer() {
            return InvestPointsInfoResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestPointsInfoResponse(int i, String str, String str2, PointsInfoTip pointsInfoTip, PointsInfo pointsInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.pointLogoLight = "";
        } else {
            this.pointLogoLight = str;
        }
        if ((i & 2) == 0) {
            this.pointLogoDark = "";
        } else {
            this.pointLogoDark = str2;
        }
        if ((i & 4) == 0) {
            this.pointInfoTip = new PointsInfoTip((String) null, 1, (DefaultConstructorMarker) null);
        } else {
            this.pointInfoTip = pointsInfoTip;
        }
        if ((i & 8) == 0) {
            this.pointsInfo = null;
        } else {
            this.pointsInfo = pointsInfo;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestPointsInfoResponse investPointsInfoResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) investPointsInfoResponse.pointLogoLight, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, investPointsInfoResponse.pointLogoLight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) investPointsInfoResponse.pointLogoDark, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, investPointsInfoResponse.pointLogoDark);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(investPointsInfoResponse.pointInfoTip, new PointsInfoTip((String) null, 1, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, PointsInfoTip$$serializer.INSTANCE, investPointsInfoResponse.pointInfoTip);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && investPointsInfoResponse.pointsInfo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, PointsInfo$$serializer.INSTANCE, investPointsInfoResponse.pointsInfo);
    }

    public InvestPointsInfoResponse(@NotNull String str, @NotNull String str2, @NotNull PointsInfoTip pointsInfoTip, PointsInfo pointsInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(pointsInfoTip, "");
        this.pointLogoLight = str;
        this.pointLogoDark = str2;
        this.pointInfoTip = pointsInfoTip;
        this.pointsInfo = pointsInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.PointsInfoTip:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.invest_biz.data.bean.PointsInfoTip:0x0014: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (1 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:537) call: com.okinc.business.invest_biz.data.bean.PointsInfoTip.<init>(java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r4v0 com.okinc.business.invest_biz.data.bean.PointsInfoTip))
  (wrap:com.okinc.business.invest_biz.data.bean.PointsInfo:?: TERNARY null = ((wrap:int:0x0017: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.PointsInfo) : (r5v0 com.okinc.business.invest_biz.data.bean.PointsInfo))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.PointsInfoTip, com.okinc.business.invest_biz.data.bean.PointsInfo):void (m)] (LINE:531) call: com.okinc.business.invest_biz.data.bean.InvestPointsInfoResponse.<init>(java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.PointsInfoTip, com.okinc.business.invest_biz.data.bean.PointsInfo):void type: THIS */
    public /* synthetic */ InvestPointsInfoResponse(String str, String str2, PointsInfoTip pointsInfoTip, PointsInfo pointsInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new PointsInfoTip((String) null, 1, (DefaultConstructorMarker) null) : pointsInfoTip, (i & 8) != 0 ? null : pointsInfo);
    }
}
