package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class SecurityRadarScoreInfo implements Parcelable {
    public static final int $stable = 0;
    private final String score;
    private final String scoreName;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SecurityRadarScoreInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SecurityRadarScoreInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SecurityRadarScoreInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SecurityRadarScoreInfo(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SecurityRadarScoreInfo[] newArray(int i) {
            return new SecurityRadarScoreInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SecurityRadarScoreInfo copy$default(SecurityRadarScoreInfo securityRadarScoreInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = securityRadarScoreInfo.score;
        }
        if ((i & 2) != 0) {
            str2 = securityRadarScoreInfo.scoreName;
        }
        return securityRadarScoreInfo.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.score;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.scoreName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SecurityRadarScoreInfo copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SecurityRadarScoreInfo(str, str2);
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
        if (!(obj instanceof SecurityRadarScoreInfo)) {
            return false;
        }
        SecurityRadarScoreInfo securityRadarScoreInfo = (SecurityRadarScoreInfo) obj;
        return Intrinsics.EZpvd((Object) this.score, (Object) securityRadarScoreInfo.score) && Intrinsics.EZpvd((Object) this.scoreName, (Object) securityRadarScoreInfo.scoreName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getScore() {
        return this.score;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getScoreName() {
        return this.scoreName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.score.hashCode() * 31) + this.scoreName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SecurityRadarScoreInfo(score=" + this.score + ", scoreName=" + this.scoreName + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.score);
        parcel.writeString(this.scoreName);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.SecurityRadarScoreInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SecurityRadarScoreInfo> serializer() {
            return SecurityRadarScoreInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SecurityRadarScoreInfo(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, SecurityRadarScoreInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.score = str;
        this.scoreName = str2;
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(SecurityRadarScoreInfo securityRadarScoreInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, securityRadarScoreInfo.score);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, securityRadarScoreInfo.scoreName);
    }

    public SecurityRadarScoreInfo(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.score = str;
        this.scoreName = str2;
    }
}
