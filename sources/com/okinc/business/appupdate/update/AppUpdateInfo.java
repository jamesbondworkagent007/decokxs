package com.okinc.business.appupdate.update;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33129mqd;
import o.C43251rlk;
import o.InterfaceC33171mrS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class AppUpdateInfo implements Parcelable {
    public static final int MUST_UPDATE = 2;
    public static final int NEED_UPDATE = 1;
    private final String additionalUrl;
    private final AlertContent alertContent;
    private final String apkMD5;
    private final Integer mode;
    private final String newVersion;
    private final String updateType;
    private UpgradeTypeDetail upgradeTypeDetail;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AppUpdateInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AppUpdateInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AppUpdateInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AppUpdateInfo(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AlertContent.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : UpgradeTypeDetail.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AppUpdateInfo[] newArray(int i) {
            return new AppUpdateInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AppUpdateInfo copy$default(AppUpdateInfo appUpdateInfo, String str, String str2, AlertContent alertContent, String str3, UpgradeTypeDetail upgradeTypeDetail, Integer num, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appUpdateInfo.newVersion;
        }
        if ((i & 2) != 0) {
            str2 = appUpdateInfo.updateType;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            alertContent = appUpdateInfo.alertContent;
        }
        AlertContent alertContent2 = alertContent;
        if ((i & 8) != 0) {
            str3 = appUpdateInfo.apkMD5;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            upgradeTypeDetail = appUpdateInfo.upgradeTypeDetail;
        }
        UpgradeTypeDetail upgradeTypeDetail2 = upgradeTypeDetail;
        if ((i & 32) != 0) {
            num = appUpdateInfo.mode;
        }
        Integer num2 = num;
        if ((i & 64) != 0) {
            str4 = appUpdateInfo.additionalUrl;
        }
        return appUpdateInfo.copy(str, str5, alertContent2, str6, upgradeTypeDetail2, num2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.newVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.updateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertContent component3() {
        return this.alertContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.apkMD5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpgradeTypeDetail component5() {
        return this.upgradeTypeDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.additionalUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppUpdateInfo copy(@NotNull String str, @NotNull String str2, AlertContent alertContent, @NotNull String str3, UpgradeTypeDetail upgradeTypeDetail, Integer num, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new AppUpdateInfo(str, str2, alertContent, str3, upgradeTypeDetail, num, str4);
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
        if (!(obj instanceof AppUpdateInfo)) {
            return false;
        }
        AppUpdateInfo appUpdateInfo = (AppUpdateInfo) obj;
        return Intrinsics.EZpvd((Object) this.newVersion, (Object) appUpdateInfo.newVersion) && Intrinsics.EZpvd((Object) this.updateType, (Object) appUpdateInfo.updateType) && Intrinsics.EZpvd(this.alertContent, appUpdateInfo.alertContent) && Intrinsics.EZpvd((Object) this.apkMD5, (Object) appUpdateInfo.apkMD5) && Intrinsics.EZpvd(this.upgradeTypeDetail, appUpdateInfo.upgradeTypeDetail) && Intrinsics.EZpvd(this.mode, appUpdateInfo.mode) && Intrinsics.EZpvd((Object) this.additionalUrl, (Object) appUpdateInfo.additionalUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAdditionalUrl() {
        return this.additionalUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertContent getAlertContent() {
        return this.alertContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApkMD5() {
        return this.apkMD5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMode() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewVersion() {
        return this.newVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUpdateType() {
        return this.updateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpgradeTypeDetail getUpgradeTypeDetail() {
        return this.upgradeTypeDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.newVersion.hashCode();
        int iHashCode2 = this.updateType.hashCode();
        AlertContent alertContent = this.alertContent;
        int iHashCode3 = alertContent == null ? 0 : alertContent.hashCode();
        int iHashCode4 = this.apkMD5.hashCode();
        UpgradeTypeDetail upgradeTypeDetail = this.upgradeTypeDetail;
        int iHashCode5 = upgradeTypeDetail == null ? 0 : upgradeTypeDetail.hashCode();
        Integer num = this.mode;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        String str = this.additionalUrl;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpgradeTypeDetail(UpgradeTypeDetail upgradeTypeDetail) {
        this.upgradeTypeDetail = upgradeTypeDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AppUpdateInfo(newVersion=" + this.newVersion + ", updateType=" + this.updateType + ", alertContent=" + this.alertContent + ", apkMD5=" + this.apkMD5 + ", upgradeTypeDetail=" + this.upgradeTypeDetail + ", mode=" + this.mode + ", additionalUrl=" + this.additionalUrl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.newVersion);
        parcel.writeString(this.updateType);
        AlertContent alertContent = this.alertContent;
        if (alertContent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            alertContent.writeToParcel(parcel, i);
        }
        parcel.writeString(this.apkMD5);
        UpgradeTypeDetail upgradeTypeDetail = this.upgradeTypeDetail;
        if (upgradeTypeDetail == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            upgradeTypeDetail.writeToParcel(parcel, i);
        }
        Integer num = this.mode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.additionalUrl);
    }

    public /* synthetic */ AppUpdateInfo(int i, String str, String str2, AlertContent alertContent, String str3, UpgradeTypeDetail upgradeTypeDetail, Integer num, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, AppUpdateInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.newVersion = str;
        this.updateType = str2;
        this.alertContent = alertContent;
        this.apkMD5 = str3;
        this.upgradeTypeDetail = upgradeTypeDetail;
        if ((i & 32) == 0) {
            this.mode = null;
        } else {
            this.mode = num;
        }
        if ((i & 64) == 0) {
            this.additionalUrl = null;
        } else {
            this.additionalUrl = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKUpgrade_ok_upgrade(AppUpdateInfo appUpdateInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, appUpdateInfo.newVersion);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, appUpdateInfo.updateType);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, AlertContent$$serializer.INSTANCE, appUpdateInfo.alertContent);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, appUpdateInfo.apkMD5);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, UpgradeTypeDetail$$serializer.INSTANCE, appUpdateInfo.upgradeTypeDetail);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || appUpdateInfo.mode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, appUpdateInfo.mode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && appUpdateInfo.additionalUrl == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, appUpdateInfo.additionalUrl);
    }

    public AppUpdateInfo(@NotNull String str, @NotNull String str2, AlertContent alertContent, @NotNull String str3, UpgradeTypeDetail upgradeTypeDetail, Integer num, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.newVersion = str;
        this.updateType = str2;
        this.alertContent = alertContent;
        this.apkMD5 = str3;
        this.upgradeTypeDetail = upgradeTypeDetail;
        this.mode = num;
        this.additionalUrl = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 com.okinc.business.appupdate.update.AlertContent)
  (r14v0 java.lang.String)
  (r15v0 com.okinc.business.appupdate.update.UpgradeTypeDetail)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r16v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.appupdate.update.AlertContent, java.lang.String, com.okinc.business.appupdate.update.UpgradeTypeDetail, java.lang.Integer, java.lang.String):void (m)] (LINE:143) call: com.okinc.business.appupdate.update.AppUpdateInfo.<init>(java.lang.String, java.lang.String, com.okinc.business.appupdate.update.AlertContent, java.lang.String, com.okinc.business.appupdate.update.UpgradeTypeDetail, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ AppUpdateInfo(String str, String str2, AlertContent alertContent, String str3, UpgradeTypeDetail upgradeTypeDetail, Integer num, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, alertContent, str3, upgradeTypeDetail, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : str4);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.appupdate.update.AppUpdateInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AppUpdateInfo> serializer() {
            return AppUpdateInfo$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isForcedUpdate() {
        String mainSite;
        boolean z = C33129mqd.AhwBna(this.updateType) == 2;
        if (!z || this.upgradeTypeDetail == null) {
            return z;
        }
        if (((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).fIwbmz()) {
            UpgradeTypeDetail upgradeTypeDetail = this.upgradeTypeDetail;
            mainSite = upgradeTypeDetail != null ? upgradeTypeDetail.getWeb3() : null;
        } else {
            UpgradeTypeDetail upgradeTypeDetail2 = this.upgradeTypeDetail;
            if (upgradeTypeDetail2 != null) {
                mainSite = upgradeTypeDetail2.getMainSite();
            }
        }
        return C33129mqd.AhwBna(mainSite) == 2;
    }
}
