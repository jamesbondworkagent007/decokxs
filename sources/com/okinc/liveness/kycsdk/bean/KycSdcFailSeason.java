package com.okinc.liveness.kycsdk.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class KycSdcFailSeason implements Parcelable {
    private double analyzerLaplace;
    private int angle;
    private int breakCount;
    private int brightness;
    private int captureLimit;
    private int close;
    private String cropImageInfo;
    private int darkEnvironment;
    private String existObject;
    private int far;
    private String focusState;
    private int glare;
    private int livness;
    private float maxFarRatio;
    private int maxFrameCount;
    private int mlKitFailureCount;
    private String mlKitFailureMsg;
    private int mlKitTotalCount;
    private String mlkitMode;
    private int partGlareCount;
    private String partGlareOnDetect;
    private int position;
    private int positionContains;
    private int positionDivRatio;
    private int realShake;
    private int shake;
    private String status;
    private double successSmd;
    private String takePhotoTimeInfo;
    private int totalGlareCount;
    private String totalGlareOnDetect;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<KycSdcFailSeason> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<KycSdcFailSeason> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycSdcFailSeason createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new KycSdcFailSeason(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readFloat());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycSdcFailSeason[] newArray(int i) {
            return new KycSdcFailSeason[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public KycSdcFailSeason() {
        this(0, 0, 0, 0, 0, 0, 0, (String) null, 0, 0, (String) null, 0, 0, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, 0, (String) null, 0, 0, (String) null, 0, (String) null, (String) null, 0, (String) null, 0, (String) null, 0, 0, 0.0f, Integer.MAX_VALUE, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.maxFrameCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.existObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component12() {
        return this.shake;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component13() {
        return this.realShake;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.focusState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component15() {
        return this.analyzerLaplace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component16() {
        return this.successSmd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component17() {
        return this.mlKitTotalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.takePhotoTimeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component19() {
        return this.totalGlareCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.far;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component20() {
        return this.partGlareCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.cropImageInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component22() {
        return this.darkEnvironment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.totalGlareOnDetect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.partGlareOnDetect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component25() {
        return this.mlKitFailureCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.mlKitFailureMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component27() {
        return this.captureLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.mlkitMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component29() {
        return this.positionContains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.close;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component30() {
        return this.positionDivRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component31() {
        return this.maxFarRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.brightness;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.glare;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.angle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.livness;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.breakCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KycSdcFailSeason copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, @NotNull String str, int i8, int i9, @NotNull String str2, int i10, int i11, @NotNull String str3, double d, double d2, int i12, @NotNull String str4, int i13, int i14, @NotNull String str5, int i15, @NotNull String str6, @NotNull String str7, int i16, @NotNull String str8, int i17, @NotNull String str9, int i18, int i19, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new KycSdcFailSeason(i, i2, i3, i4, i5, i6, i7, str, i8, i9, str2, i10, i11, str3, d, d2, i12, str4, i13, i14, str5, i15, str6, str7, i16, str8, i17, str9, i18, i19, f);
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
        if (!(obj instanceof KycSdcFailSeason)) {
            return false;
        }
        KycSdcFailSeason kycSdcFailSeason = (KycSdcFailSeason) obj;
        return this.position == kycSdcFailSeason.position && this.far == kycSdcFailSeason.far && this.close == kycSdcFailSeason.close && this.brightness == kycSdcFailSeason.brightness && this.glare == kycSdcFailSeason.glare && this.angle == kycSdcFailSeason.angle && this.livness == kycSdcFailSeason.livness && Intrinsics.EZpvd((Object) this.status, (Object) kycSdcFailSeason.status) && this.breakCount == kycSdcFailSeason.breakCount && this.maxFrameCount == kycSdcFailSeason.maxFrameCount && Intrinsics.EZpvd((Object) this.existObject, (Object) kycSdcFailSeason.existObject) && this.shake == kycSdcFailSeason.shake && this.realShake == kycSdcFailSeason.realShake && Intrinsics.EZpvd((Object) this.focusState, (Object) kycSdcFailSeason.focusState) && Double.compare(this.analyzerLaplace, kycSdcFailSeason.analyzerLaplace) == 0 && Double.compare(this.successSmd, kycSdcFailSeason.successSmd) == 0 && this.mlKitTotalCount == kycSdcFailSeason.mlKitTotalCount && Intrinsics.EZpvd((Object) this.takePhotoTimeInfo, (Object) kycSdcFailSeason.takePhotoTimeInfo) && this.totalGlareCount == kycSdcFailSeason.totalGlareCount && this.partGlareCount == kycSdcFailSeason.partGlareCount && Intrinsics.EZpvd((Object) this.cropImageInfo, (Object) kycSdcFailSeason.cropImageInfo) && this.darkEnvironment == kycSdcFailSeason.darkEnvironment && Intrinsics.EZpvd((Object) this.totalGlareOnDetect, (Object) kycSdcFailSeason.totalGlareOnDetect) && Intrinsics.EZpvd((Object) this.partGlareOnDetect, (Object) kycSdcFailSeason.partGlareOnDetect) && this.mlKitFailureCount == kycSdcFailSeason.mlKitFailureCount && Intrinsics.EZpvd((Object) this.mlKitFailureMsg, (Object) kycSdcFailSeason.mlKitFailureMsg) && this.captureLimit == kycSdcFailSeason.captureLimit && Intrinsics.EZpvd((Object) this.mlkitMode, (Object) kycSdcFailSeason.mlkitMode) && this.positionContains == kycSdcFailSeason.positionContains && this.positionDivRatio == kycSdcFailSeason.positionDivRatio && Float.compare(this.maxFarRatio, kycSdcFailSeason.maxFarRatio) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getAnalyzerLaplace() {
        return this.analyzerLaplace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAngle() {
        return this.angle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBreakCount() {
        return this.breakCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBrightness() {
        return this.brightness;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCaptureLimit() {
        return this.captureLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getClose() {
        return this.close;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCropImageInfo() {
        return this.cropImageInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDarkEnvironment() {
        return this.darkEnvironment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExistObject() {
        return this.existObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFar() {
        return this.far;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFocusState() {
        return this.focusState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getGlare() {
        return this.glare;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLivness() {
        return this.livness;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getMaxFarRatio() {
        return this.maxFarRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMaxFrameCount() {
        return this.maxFrameCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMlKitFailureCount() {
        return this.mlKitFailureCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMlKitFailureMsg() {
        return this.mlKitFailureMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMlKitTotalCount() {
        return this.mlKitTotalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMlkitMode() {
        return this.mlkitMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPartGlareCount() {
        return this.partGlareCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPartGlareOnDetect() {
        return this.partGlareOnDetect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPosition() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPositionContains() {
        return this.positionContains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPositionDivRatio() {
        return this.positionDivRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRealShake() {
        return this.realShake;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getShake() {
        return this.shake;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getSuccessSmd() {
        return this.successSmd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTakePhotoTimeInfo() {
        return this.takePhotoTimeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTotalGlareCount() {
        return this.totalGlareCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalGlareOnDetect() {
        return this.totalGlareOnDetect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.position) * 31) + Integer.hashCode(this.far)) * 31) + Integer.hashCode(this.close)) * 31) + Integer.hashCode(this.brightness)) * 31) + Integer.hashCode(this.glare)) * 31) + Integer.hashCode(this.angle)) * 31) + Integer.hashCode(this.livness)) * 31) + this.status.hashCode()) * 31) + Integer.hashCode(this.breakCount)) * 31) + Integer.hashCode(this.maxFrameCount)) * 31) + this.existObject.hashCode()) * 31) + Integer.hashCode(this.shake)) * 31) + Integer.hashCode(this.realShake)) * 31) + this.focusState.hashCode()) * 31) + Double.hashCode(this.analyzerLaplace)) * 31) + Double.hashCode(this.successSmd)) * 31) + Integer.hashCode(this.mlKitTotalCount)) * 31) + this.takePhotoTimeInfo.hashCode()) * 31) + Integer.hashCode(this.totalGlareCount)) * 31) + Integer.hashCode(this.partGlareCount)) * 31) + this.cropImageInfo.hashCode()) * 31) + Integer.hashCode(this.darkEnvironment)) * 31) + this.totalGlareOnDetect.hashCode()) * 31) + this.partGlareOnDetect.hashCode()) * 31) + Integer.hashCode(this.mlKitFailureCount)) * 31) + this.mlKitFailureMsg.hashCode()) * 31) + Integer.hashCode(this.captureLimit)) * 31) + this.mlkitMode.hashCode()) * 31) + Integer.hashCode(this.positionContains)) * 31) + Integer.hashCode(this.positionDivRatio)) * 31) + Float.hashCode(this.maxFarRatio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void reset() {
        this.position = 0;
        this.far = 0;
        this.close = 0;
        this.brightness = 0;
        this.glare = 0;
        this.angle = 0;
        this.livness = 0;
        this.status = "";
        this.breakCount = 0;
        this.maxFrameCount = 0;
        this.existObject = "";
        this.shake = 0;
        this.realShake = 0;
        this.focusState = "";
        this.analyzerLaplace = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.successSmd = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.mlKitTotalCount = 0;
        this.takePhotoTimeInfo = "";
        this.totalGlareCount = 0;
        this.partGlareCount = 0;
        this.cropImageInfo = "";
        this.darkEnvironment = 0;
        this.totalGlareOnDetect = "";
        this.partGlareOnDetect = "";
        this.mlKitFailureCount = 0;
        this.mlKitFailureMsg = "";
        this.captureLimit = 0;
        this.mlkitMode = "";
        this.positionContains = 0;
        this.positionDivRatio = 0;
        this.maxFarRatio = 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAnalyzerLaplace(double d) {
        this.analyzerLaplace = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAngle(int i) {
        this.angle = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBreakCount(int i) {
        this.breakCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBrightness(int i) {
        this.brightness = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCaptureLimit(int i) {
        this.captureLimit = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClose(int i) {
        this.close = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCropImageInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cropImageInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDarkEnvironment(int i) {
        this.darkEnvironment = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExistObject(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.existObject = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFar(int i) {
        this.far = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFocusState(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.focusState = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGlare(int i) {
        this.glare = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLivness(int i) {
        this.livness = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxFarRatio(float f) {
        this.maxFarRatio = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxFrameCount(int i) {
        this.maxFrameCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMlKitFailureCount(int i) {
        this.mlKitFailureCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMlKitFailureMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mlKitFailureMsg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMlKitTotalCount(int i) {
        this.mlKitTotalCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMlkitMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mlkitMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPartGlareCount(int i) {
        this.partGlareCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPartGlareOnDetect(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.partGlareOnDetect = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosition(int i) {
        this.position = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPositionContains(int i) {
        this.positionContains = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPositionDivRatio(int i) {
        this.positionDivRatio = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRealShake(int i) {
        this.realShake = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShake(int i) {
        this.shake = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.status = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSuccessSmd(double d) {
        this.successSmd = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTakePhotoTimeInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.takePhotoTimeInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalGlareCount(int i) {
        this.totalGlareCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalGlareOnDetect(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalGlareOnDetect = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KycSdcFailSeason(position=" + this.position + ", far=" + this.far + ", close=" + this.close + ", brightness=" + this.brightness + ", glare=" + this.glare + ", angle=" + this.angle + ", livness=" + this.livness + ", status=" + this.status + ", breakCount=" + this.breakCount + ", maxFrameCount=" + this.maxFrameCount + ", existObject=" + this.existObject + ", shake=" + this.shake + ", realShake=" + this.realShake + ", focusState=" + this.focusState + ", analyzerLaplace=" + this.analyzerLaplace + ", successSmd=" + this.successSmd + ", mlKitTotalCount=" + this.mlKitTotalCount + ", takePhotoTimeInfo=" + this.takePhotoTimeInfo + ", totalGlareCount=" + this.totalGlareCount + ", partGlareCount=" + this.partGlareCount + ", cropImageInfo=" + this.cropImageInfo + ", darkEnvironment=" + this.darkEnvironment + ", totalGlareOnDetect=" + this.totalGlareOnDetect + ", partGlareOnDetect=" + this.partGlareOnDetect + ", mlKitFailureCount=" + this.mlKitFailureCount + ", mlKitFailureMsg=" + this.mlKitFailureMsg + ", captureLimit=" + this.captureLimit + ", mlkitMode=" + this.mlkitMode + ", positionContains=" + this.positionContains + ", positionDivRatio=" + this.positionDivRatio + ", maxFarRatio=" + this.maxFarRatio + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.position);
        parcel.writeInt(this.far);
        parcel.writeInt(this.close);
        parcel.writeInt(this.brightness);
        parcel.writeInt(this.glare);
        parcel.writeInt(this.angle);
        parcel.writeInt(this.livness);
        parcel.writeString(this.status);
        parcel.writeInt(this.breakCount);
        parcel.writeInt(this.maxFrameCount);
        parcel.writeString(this.existObject);
        parcel.writeInt(this.shake);
        parcel.writeInt(this.realShake);
        parcel.writeString(this.focusState);
        parcel.writeDouble(this.analyzerLaplace);
        parcel.writeDouble(this.successSmd);
        parcel.writeInt(this.mlKitTotalCount);
        parcel.writeString(this.takePhotoTimeInfo);
        parcel.writeInt(this.totalGlareCount);
        parcel.writeInt(this.partGlareCount);
        parcel.writeString(this.cropImageInfo);
        parcel.writeInt(this.darkEnvironment);
        parcel.writeString(this.totalGlareOnDetect);
        parcel.writeString(this.partGlareOnDetect);
        parcel.writeInt(this.mlKitFailureCount);
        parcel.writeString(this.mlKitFailureMsg);
        parcel.writeInt(this.captureLimit);
        parcel.writeString(this.mlkitMode);
        parcel.writeInt(this.positionContains);
        parcel.writeInt(this.positionDivRatio);
        parcel.writeFloat(this.maxFarRatio);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.kycsdk.bean.KycSdcFailSeason.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<KycSdcFailSeason> serializer() {
            return KycSdcFailSeason$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ KycSdcFailSeason(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, int i9, int i10, String str2, int i11, int i12, String str3, double d, double d2, int i13, String str4, int i14, int i15, String str5, int i16, String str6, String str7, int i17, String str8, int i18, String str9, int i19, int i20, float f, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.position = 0;
        } else {
            this.position = i2;
        }
        if ((i & 2) == 0) {
            this.far = 0;
        } else {
            this.far = i3;
        }
        if ((i & 4) == 0) {
            this.close = 0;
        } else {
            this.close = i4;
        }
        if ((i & 8) == 0) {
            this.brightness = 0;
        } else {
            this.brightness = i5;
        }
        if ((i & 16) == 0) {
            this.glare = 0;
        } else {
            this.glare = i6;
        }
        if ((i & 32) == 0) {
            this.angle = 0;
        } else {
            this.angle = i7;
        }
        if ((i & 64) == 0) {
            this.livness = 0;
        } else {
            this.livness = i8;
        }
        if ((i & 128) == 0) {
            this.status = "";
        } else {
            this.status = str;
        }
        if ((i & 256) == 0) {
            this.breakCount = 0;
        } else {
            this.breakCount = i9;
        }
        if ((i & 512) == 0) {
            this.maxFrameCount = 0;
        } else {
            this.maxFrameCount = i10;
        }
        if ((i & 1024) == 0) {
            this.existObject = "";
        } else {
            this.existObject = str2;
        }
        if ((i & 2048) == 0) {
            this.shake = 0;
        } else {
            this.shake = i11;
        }
        if ((i & 4096) == 0) {
            this.realShake = 0;
        } else {
            this.realShake = i12;
        }
        if ((i & 8192) == 0) {
            this.focusState = "";
        } else {
            this.focusState = str3;
        }
        int i21 = i & 16384;
        double d3 = AudioStats.AUDIO_AMPLITUDE_NONE;
        if (i21 == 0) {
            this.analyzerLaplace = AudioStats.AUDIO_AMPLITUDE_NONE;
        } else {
            this.analyzerLaplace = d;
        }
        this.successSmd = (32768 & i) != 0 ? d2 : d3;
        if ((65536 & i) == 0) {
            this.mlKitTotalCount = 0;
        } else {
            this.mlKitTotalCount = i13;
        }
        if ((131072 & i) == 0) {
            this.takePhotoTimeInfo = "";
        } else {
            this.takePhotoTimeInfo = str4;
        }
        if ((262144 & i) == 0) {
            this.totalGlareCount = 0;
        } else {
            this.totalGlareCount = i14;
        }
        if ((524288 & i) == 0) {
            this.partGlareCount = 0;
        } else {
            this.partGlareCount = i15;
        }
        if ((1048576 & i) == 0) {
            this.cropImageInfo = "";
        } else {
            this.cropImageInfo = str5;
        }
        if ((2097152 & i) == 0) {
            this.darkEnvironment = 0;
        } else {
            this.darkEnvironment = i16;
        }
        if ((4194304 & i) == 0) {
            this.totalGlareOnDetect = "";
        } else {
            this.totalGlareOnDetect = str6;
        }
        if ((8388608 & i) == 0) {
            this.partGlareOnDetect = "";
        } else {
            this.partGlareOnDetect = str7;
        }
        if ((16777216 & i) == 0) {
            this.mlKitFailureCount = 0;
        } else {
            this.mlKitFailureCount = i17;
        }
        if ((33554432 & i) == 0) {
            this.mlKitFailureMsg = "";
        } else {
            this.mlKitFailureMsg = str8;
        }
        if ((67108864 & i) == 0) {
            this.captureLimit = 0;
        } else {
            this.captureLimit = i18;
        }
        if ((134217728 & i) == 0) {
            this.mlkitMode = "";
        } else {
            this.mlkitMode = str9;
        }
        if ((268435456 & i) == 0) {
            this.positionContains = 0;
        } else {
            this.positionContains = i19;
        }
        if ((536870912 & i) == 0) {
            this.positionDivRatio = 0;
        } else {
            this.positionDivRatio = i20;
        }
        this.maxFarRatio = (i & 1073741824) == 0 ? 0.0f : f;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_dynamic_eop_liveness_impl(KycSdcFailSeason kycSdcFailSeason, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || kycSdcFailSeason.position != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, kycSdcFailSeason.position);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || kycSdcFailSeason.far != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, kycSdcFailSeason.far);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || kycSdcFailSeason.close != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, kycSdcFailSeason.close);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || kycSdcFailSeason.brightness != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, kycSdcFailSeason.brightness);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || kycSdcFailSeason.glare != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, kycSdcFailSeason.glare);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || kycSdcFailSeason.angle != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 5, kycSdcFailSeason.angle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || kycSdcFailSeason.livness != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 6, kycSdcFailSeason.livness);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) kycSdcFailSeason.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, kycSdcFailSeason.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || kycSdcFailSeason.breakCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 8, kycSdcFailSeason.breakCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || kycSdcFailSeason.maxFrameCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 9, kycSdcFailSeason.maxFrameCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) kycSdcFailSeason.existObject, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, kycSdcFailSeason.existObject);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || kycSdcFailSeason.shake != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 11, kycSdcFailSeason.shake);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || kycSdcFailSeason.realShake != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 12, kycSdcFailSeason.realShake);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) kycSdcFailSeason.focusState, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, kycSdcFailSeason.focusState);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || Double.compare(kycSdcFailSeason.analyzerLaplace, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 14, kycSdcFailSeason.analyzerLaplace);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || Double.compare(kycSdcFailSeason.successSmd, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 15, kycSdcFailSeason.successSmd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || kycSdcFailSeason.mlKitTotalCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 16, kycSdcFailSeason.mlKitTotalCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) kycSdcFailSeason.takePhotoTimeInfo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, kycSdcFailSeason.takePhotoTimeInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || kycSdcFailSeason.totalGlareCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 18, kycSdcFailSeason.totalGlareCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || kycSdcFailSeason.partGlareCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 19, kycSdcFailSeason.partGlareCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) kycSdcFailSeason.cropImageInfo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, kycSdcFailSeason.cropImageInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || kycSdcFailSeason.darkEnvironment != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 21, kycSdcFailSeason.darkEnvironment);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) kycSdcFailSeason.totalGlareOnDetect, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, kycSdcFailSeason.totalGlareOnDetect);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) kycSdcFailSeason.partGlareOnDetect, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, kycSdcFailSeason.partGlareOnDetect);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || kycSdcFailSeason.mlKitFailureCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 24, kycSdcFailSeason.mlKitFailureCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) kycSdcFailSeason.mlKitFailureMsg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, kycSdcFailSeason.mlKitFailureMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || kycSdcFailSeason.captureLimit != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 26, kycSdcFailSeason.captureLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) kycSdcFailSeason.mlkitMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, kycSdcFailSeason.mlkitMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || kycSdcFailSeason.positionContains != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 28, kycSdcFailSeason.positionContains);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || kycSdcFailSeason.positionDivRatio != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 29, kycSdcFailSeason.positionDivRatio);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) && Float.compare(kycSdcFailSeason.maxFarRatio, 0.0f) == 0) {
            return;
        }
        compositeEncoder.encodeFloatElement(serialDescriptor, 30, kycSdcFailSeason.maxFarRatio);
    }

    public KycSdcFailSeason(int i, int i2, int i3, int i4, int i5, int i6, int i7, @NotNull String str, int i8, int i9, @NotNull String str2, int i10, int i11, @NotNull String str3, double d, double d2, int i12, @NotNull String str4, int i13, int i14, @NotNull String str5, int i15, @NotNull String str6, @NotNull String str7, int i16, @NotNull String str8, int i17, @NotNull String str9, int i18, int i19, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.position = i;
        this.far = i2;
        this.close = i3;
        this.brightness = i4;
        this.glare = i5;
        this.angle = i6;
        this.livness = i7;
        this.status = str;
        this.breakCount = i8;
        this.maxFrameCount = i9;
        this.existObject = str2;
        this.shake = i10;
        this.realShake = i11;
        this.focusState = str3;
        this.analyzerLaplace = d;
        this.successSmd = d2;
        this.mlKitTotalCount = i12;
        this.takePhotoTimeInfo = str4;
        this.totalGlareCount = i13;
        this.partGlareCount = i14;
        this.cropImageInfo = str5;
        this.darkEnvironment = i15;
        this.totalGlareOnDetect = str6;
        this.partGlareOnDetect = str7;
        this.mlKitFailureCount = i16;
        this.mlKitFailureMsg = str8;
        this.captureLimit = i17;
        this.mlkitMode = str9;
        this.positionContains = i18;
        this.positionDivRatio = i19;
        this.maxFarRatio = f;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x016c: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r68v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r35v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000a: ARITH (r68v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r36v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0012: ARITH (r68v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r37v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001a: ARITH (r68v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r38v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0022: ARITH (r68v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r39v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002a: ARITH (r68v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r40v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0032: ARITH (r68v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r41v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r68v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0044: ARITH (r68v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r43v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004c: ARITH (r68v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r44v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r68v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x005c: ARITH (r68v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r46v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0064: ARITH (r68v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r47v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r68v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:double:?: TERNARY null = ((wrap:int:0x0076: ARITH (r68v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (0.0d double) : (r49v0 double))
  (wrap:double:?: TERNARY null = ((wrap:int:0x0084: ARITH (32768 int) & (r68v0 int) A[WRAPPED]) == (0 int)) ? (r51v0 double) : (wrap:double:0x0078: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double))
  (wrap:int:?: TERNARY null = ((wrap:int:0x008c: ARITH (65536 int) & (r68v0 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r53v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0095: ARITH (r68v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00a0: ARITH (r68v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r55v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00ab: ARITH (r68v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r56v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b6: ARITH (r68v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00c1: ARITH (r68v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r58v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cc: ARITH (r68v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d7: ARITH (r68v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00e2: ARITH (r68v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r61v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ed: ARITH (r68v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00f8: ARITH (r68v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r63v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0103: ARITH (r68v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x010e: ARITH (r68v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r65v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0119: ARITH (r68v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r66v0 int))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0124: ARITH (r68v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r67v0 float))
 A[MD:(int, int, int, int, int, int, int, java.lang.String, int, int, java.lang.String, int, int, java.lang.String, double, double, int, java.lang.String, int, int, java.lang.String, int, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, int, int, float):void (m)] (LINE:16) call: com.okinc.liveness.kycsdk.bean.KycSdcFailSeason.<init>(int, int, int, int, int, int, int, java.lang.String, int, int, java.lang.String, int, int, java.lang.String, double, double, int, java.lang.String, int, int, java.lang.String, int, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, int, int, float):void type: THIS */
    public /* synthetic */ KycSdcFailSeason(int i, int i2, int i3, int i4, int i5, int i6, int i7, String str, int i8, int i9, String str2, int i10, int i11, String str3, double d, double d2, int i12, String str4, int i13, int i14, String str5, int i15, String str6, String str7, int i16, String str8, int i17, String str9, int i18, int i19, float f, int i20, DefaultConstructorMarker defaultConstructorMarker) {
        this((i20 & 1) != 0 ? 0 : i, (i20 & 2) != 0 ? 0 : i2, (i20 & 4) != 0 ? 0 : i3, (i20 & 8) != 0 ? 0 : i4, (i20 & 16) != 0 ? 0 : i5, (i20 & 32) != 0 ? 0 : i6, (i20 & 64) != 0 ? 0 : i7, (i20 & 128) != 0 ? "" : str, (i20 & 256) != 0 ? 0 : i8, (i20 & 512) != 0 ? 0 : i9, (i20 & 1024) != 0 ? "" : str2, (i20 & 2048) != 0 ? 0 : i10, (i20 & 4096) != 0 ? 0 : i11, (i20 & 8192) != 0 ? "" : str3, (i20 & 16384) != 0 ? 0.0d : d, (32768 & i20) == 0 ? d2 : AudioStats.AUDIO_AMPLITUDE_NONE, (65536 & i20) != 0 ? 0 : i12, (i20 & 131072) != 0 ? "" : str4, (i20 & 262144) != 0 ? 0 : i13, (i20 & 524288) != 0 ? 0 : i14, (i20 & 1048576) != 0 ? "" : str5, (i20 & 2097152) != 0 ? 0 : i15, (i20 & 4194304) != 0 ? "" : str6, (i20 & 8388608) != 0 ? "" : str7, (i20 & 16777216) != 0 ? 0 : i16, (i20 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str8, (i20 & 67108864) != 0 ? 0 : i17, (i20 & 134217728) != 0 ? "" : str9, (i20 & 268435456) != 0 ? 0 : i18, (i20 & 536870912) != 0 ? 0 : i19, (i20 & 1073741824) != 0 ? 0.0f : f);
    }
}
