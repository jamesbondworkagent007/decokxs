package com.okinc.planet.biz_performance.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.planet.serializer.PlanetNumericString;
import com.okinc.planet.serializer.PlanetNumericString$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C46417tTo;
import o.C46419tTq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class UserProfileOverviewDto implements Parcelable {
    public static final int $stable = 0;
    public final String equity;
    public final float maxRetreat;
    public final long onboardDuration;
    public final String pnl;
    public final String pnlRatio;
    public final String riskRewardRatio;
    public final float winRate;
    public final String withdrawal;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<UserProfileOverviewDto> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<UserProfileOverviewDto> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserProfileOverviewDto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            Parcelable.Creator<PlanetNumericString> creator = PlanetNumericString.CREATOR;
            return new UserProfileOverviewDto(creator.createFromParcel(parcel).AEQbTJ(), creator.createFromParcel(parcel).AEQbTJ(), creator.createFromParcel(parcel).AEQbTJ(), parcel.readLong(), parcel.readFloat(), parcel.readString(), parcel.readFloat(), creator.createFromParcel(parcel).AEQbTJ(), null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserProfileOverviewDto[] newArray(int i) {
            return new UserProfileOverviewDto[i];
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
  (r5v0 long)
  (r7v0 float)
  (r8v0 java.lang.String)
  (r9v0 float)
  (r10v0 java.lang.String)
  (r11v0 kotlinx.serialization.internal.SerializationConstructorMarker)
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, long, float, java.lang.String, float, java.lang.String, kotlinx.serialization.internal.SerializationConstructorMarker):void (m)] call: com.okinc.planet.biz_performance.data.UserProfileOverviewDto.<init>(int, java.lang.String, java.lang.String, java.lang.String, long, float, java.lang.String, float, java.lang.String, kotlinx.serialization.internal.SerializationConstructorMarker):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ UserProfileOverviewDto(int i, String str, String str2, String str3, long j, float f, String str4, float f2, String str5, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, j, f, str4, f2, str5, serializationConstructorMarker);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (r4v0 long)
  (r6v0 float)
  (r7v0 java.lang.String)
  (r8v0 float)
  (r9v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, long, float, java.lang.String, float, java.lang.String):void (m)] call: com.okinc.planet.biz_performance.data.UserProfileOverviewDto.<init>(java.lang.String, java.lang.String, java.lang.String, long, float, java.lang.String, float, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ UserProfileOverviewDto(String str, String str2, String str3, long j, float f, String str4, float f2, String str5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, j, f, str4, f2, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserProfileOverviewDto AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, float f, @NotNull String str4, float f2, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new UserProfileOverviewDto(str, str2, str3, j, f, str4, f2, str5, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.equity;
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
        if (!(obj instanceof UserProfileOverviewDto)) {
            return false;
        }
        UserProfileOverviewDto userProfileOverviewDto = (UserProfileOverviewDto) obj;
        return PlanetNumericString.EZpvd(this.pnl, userProfileOverviewDto.pnl) && PlanetNumericString.EZpvd(this.pnlRatio, userProfileOverviewDto.pnlRatio) && PlanetNumericString.EZpvd(this.equity, userProfileOverviewDto.equity) && this.onboardDuration == userProfileOverviewDto.onboardDuration && Float.compare(this.maxRetreat, userProfileOverviewDto.maxRetreat) == 0 && Intrinsics.EZpvd((Object) this.riskRewardRatio, (Object) userProfileOverviewDto.riskRewardRatio) && Float.compare(this.winRate, userProfileOverviewDto.winRate) == 0 && PlanetNumericString.EZpvd(this.withdrawal, userProfileOverviewDto.withdrawal);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((PlanetNumericString.EZpvd(this.pnl) * 31) + PlanetNumericString.EZpvd(this.pnlRatio)) * 31) + PlanetNumericString.EZpvd(this.equity)) * 31) + Long.hashCode(this.onboardDuration)) * 31) + Float.hashCode(this.maxRetreat)) * 31) + this.riskRewardRatio.hashCode()) * 31) + Float.hashCode(this.winRate)) * 31) + PlanetNumericString.EZpvd(this.withdrawal);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UserProfileOverviewDto(pnl=" + PlanetNumericString.copydefault(this.pnl) + ", pnlRatio=" + PlanetNumericString.copydefault(this.pnlRatio) + ", equity=" + PlanetNumericString.copydefault(this.equity) + ", onboardDuration=" + this.onboardDuration + ", maxRetreat=" + this.maxRetreat + ", riskRewardRatio=" + this.riskRewardRatio + ", winRate=" + this.winRate + ", withdrawal=" + PlanetNumericString.copydefault(this.withdrawal) + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        PlanetNumericString.AEQbTJ(this.pnl, parcel, i);
        PlanetNumericString.AEQbTJ(this.pnlRatio, parcel, i);
        PlanetNumericString.AEQbTJ(this.equity, parcel, i);
        parcel.writeLong(this.onboardDuration);
        parcel.writeFloat(this.maxRetreat);
        parcel.writeString(this.riskRewardRatio);
        parcel.writeFloat(this.winRate);
        PlanetNumericString.AEQbTJ(this.withdrawal, parcel, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_performance.data.UserProfileOverviewDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserProfileOverviewDto> serializer() {
            return UserProfileOverviewDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UserProfileOverviewDto(int i, String str, String str2, String str3, long j, float f, String str4, float f2, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (32 != (i & 32)) {
            PluginExceptionsKt.throwMissingFieldException(i, 32, UserProfileOverviewDto$$serializer.INSTANCE.getDescriptor());
        }
        this.pnl = (i & 1) == 0 ? PlanetNumericString.Companion.EZpvd() : str;
        if ((i & 2) == 0) {
            this.pnlRatio = PlanetNumericString.Companion.EZpvd();
        } else {
            this.pnlRatio = str2;
        }
        if ((i & 4) == 0) {
            this.equity = PlanetNumericString.Companion.EZpvd();
        } else {
            this.equity = str3;
        }
        if ((i & 8) == 0) {
            this.onboardDuration = 0L;
        } else {
            this.onboardDuration = j;
        }
        if ((i & 16) == 0) {
            this.maxRetreat = 0.0f;
        } else {
            this.maxRetreat = f;
        }
        this.riskRewardRatio = str4;
        if ((i & 64) == 0) {
            this.winRate = 0.0f;
        } else {
            this.winRate = f2;
        }
        if ((i & 128) == 0) {
            this.withdrawal = PlanetNumericString.Companion.EZpvd();
        } else {
            this.withdrawal = str5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [10=5] */
    public static final /* synthetic */ void OLrzqt(UserProfileOverviewDto userProfileOverviewDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !PlanetNumericString.EZpvd(userProfileOverviewDto.pnl, PlanetNumericString.Companion.EZpvd())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(userProfileOverviewDto.pnl));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !PlanetNumericString.EZpvd(userProfileOverviewDto.pnlRatio, PlanetNumericString.Companion.EZpvd())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(userProfileOverviewDto.pnlRatio));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !PlanetNumericString.EZpvd(userProfileOverviewDto.equity, PlanetNumericString.Companion.EZpvd())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(userProfileOverviewDto.equity));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || userProfileOverviewDto.onboardDuration != 0) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, C46417tTo.KWHzl, Long.valueOf(userProfileOverviewDto.onboardDuration));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || Float.compare(userProfileOverviewDto.maxRetreat, 0.0f) != 0) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, C46419tTq.EZpvd, Float.valueOf(userProfileOverviewDto.maxRetreat));
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, userProfileOverviewDto.riskRewardRatio);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || Float.compare(userProfileOverviewDto.winRate, 0.0f) != 0) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, C46419tTq.EZpvd, Float.valueOf(userProfileOverviewDto.winRate));
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && PlanetNumericString.EZpvd(userProfileOverviewDto.withdrawal, PlanetNumericString.Companion.EZpvd())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(userProfileOverviewDto.withdrawal));
    }

    public UserProfileOverviewDto(String str, String str2, String str3, long j, float f, String str4, float f2, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.pnl = str;
        this.pnlRatio = str2;
        this.equity = str3;
        this.onboardDuration = j;
        this.maxRetreat = f;
        this.riskRewardRatio = str4;
        this.winRate = f2;
        this.withdrawal = str5;
    }
}
