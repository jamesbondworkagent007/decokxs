package com.okinc.annual.download;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class AnnualLottieMD5 implements Parcelable {
    private String lottieFileMD5;
    private String lottieFileName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AnnualLottieMD5> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AnnualLottieMD5> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AnnualLottieMD5 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AnnualLottieMD5(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AnnualLottieMD5[] newArray(int i) {
            return new AnnualLottieMD5[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnnualLottieMD5() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AnnualLottieMD5 copy$default(AnnualLottieMD5 annualLottieMD5, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = annualLottieMD5.lottieFileName;
        }
        if ((i & 2) != 0) {
            str2 = annualLottieMD5.lottieFileMD5;
        }
        return annualLottieMD5.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.lottieFileName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.lottieFileMD5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AnnualLottieMD5 copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AnnualLottieMD5(str, str2);
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
        if (!(obj instanceof AnnualLottieMD5)) {
            return false;
        }
        AnnualLottieMD5 annualLottieMD5 = (AnnualLottieMD5) obj;
        return Intrinsics.EZpvd((Object) this.lottieFileName, (Object) annualLottieMD5.lottieFileName) && Intrinsics.EZpvd((Object) this.lottieFileMD5, (Object) annualLottieMD5.lottieFileMD5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLottieFileMD5() {
        return this.lottieFileMD5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLottieFileName() {
        return this.lottieFileName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.lottieFileName.hashCode() * 31) + this.lottieFileMD5.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLottieFileMD5(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lottieFileMD5 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLottieFileName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lottieFileName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AnnualLottieMD5(lottieFileName=" + this.lottieFileName + ", lottieFileMD5=" + this.lottieFileMD5 + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.lottieFileName);
        parcel.writeString(this.lottieFileMD5);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.annual.download.AnnualLottieMD5.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AnnualLottieMD5> serializer() {
            return AnnualLottieMD5$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AnnualLottieMD5(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.lottieFileName = "";
        } else {
            this.lottieFileName = str;
        }
        if ((i & 2) == 0) {
            this.lottieFileMD5 = "";
        } else {
            this.lottieFileMD5 = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKGrowthTools_biz_rewards(AnnualLottieMD5 annualLottieMD5, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) annualLottieMD5.lottieFileName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, annualLottieMD5.lottieFileName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) annualLottieMD5.lottieFileMD5, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, annualLottieMD5.lottieFileMD5);
    }

    public AnnualLottieMD5(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.lottieFileName = str;
        this.lottieFileMD5 = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:41) call: com.okinc.annual.download.AnnualLottieMD5.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AnnualLottieMD5(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
