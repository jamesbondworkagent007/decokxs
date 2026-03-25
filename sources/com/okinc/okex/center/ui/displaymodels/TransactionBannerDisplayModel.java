package com.okinc.okex.center.ui.displaymodels;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class TransactionBannerDisplayModel implements Parcelable {
    public static final int $stable = 0;
    private final String bannerDetails;
    private final String bannerTitle;
    private final String withdrawRelease;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TransactionBannerDisplayModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TransactionBannerDisplayModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionBannerDisplayModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TransactionBannerDisplayModel(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionBannerDisplayModel[] newArray(int i) {
            return new TransactionBannerDisplayModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TransactionBannerDisplayModel copy$default(TransactionBannerDisplayModel transactionBannerDisplayModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transactionBannerDisplayModel.bannerTitle;
        }
        if ((i & 2) != 0) {
            str2 = transactionBannerDisplayModel.bannerDetails;
        }
        if ((i & 4) != 0) {
            str3 = transactionBannerDisplayModel.withdrawRelease;
        }
        return transactionBannerDisplayModel.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.bannerTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.bannerDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.withdrawRelease;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionBannerDisplayModel copy(@NotNull String str, @NotNull String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TransactionBannerDisplayModel(str, str2, str3);
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
        if (!(obj instanceof TransactionBannerDisplayModel)) {
            return false;
        }
        TransactionBannerDisplayModel transactionBannerDisplayModel = (TransactionBannerDisplayModel) obj;
        return Intrinsics.EZpvd((Object) this.bannerTitle, (Object) transactionBannerDisplayModel.bannerTitle) && Intrinsics.EZpvd((Object) this.bannerDetails, (Object) transactionBannerDisplayModel.bannerDetails) && Intrinsics.EZpvd((Object) this.withdrawRelease, (Object) transactionBannerDisplayModel.withdrawRelease);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBannerDetails() {
        return this.bannerDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBannerTitle() {
        return this.bannerTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWithdrawRelease() {
        return this.withdrawRelease;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.bannerTitle.hashCode();
        int iHashCode2 = this.bannerDetails.hashCode();
        String str = this.withdrawRelease;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionBannerDisplayModel(bannerTitle=" + this.bannerTitle + ", bannerDetails=" + this.bannerDetails + ", withdrawRelease=" + this.withdrawRelease + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.bannerTitle);
        parcel.writeString(this.bannerDetails);
        parcel.writeString(this.withdrawRelease);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.ui.displaymodels.TransactionBannerDisplayModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TransactionBannerDisplayModel> serializer() {
            return TransactionBannerDisplayModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TransactionBannerDisplayModel(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, TransactionBannerDisplayModel$$serializer.INSTANCE.getDescriptor());
        }
        this.bannerTitle = str;
        this.bannerDetails = str2;
        if ((i & 4) == 0) {
            this.withdrawRelease = null;
        } else {
            this.withdrawRelease = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(TransactionBannerDisplayModel transactionBannerDisplayModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, transactionBannerDisplayModel.bannerTitle);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, transactionBannerDisplayModel.bannerDetails);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && transactionBannerDisplayModel.withdrawRelease == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, transactionBannerDisplayModel.withdrawRelease);
    }

    public TransactionBannerDisplayModel(@NotNull String str, @NotNull String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.bannerTitle = str;
        this.bannerDetails = str2;
        this.withdrawRelease = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:15) call: com.okinc.okex.center.ui.displaymodels.TransactionBannerDisplayModel.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TransactionBannerDisplayModel(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
