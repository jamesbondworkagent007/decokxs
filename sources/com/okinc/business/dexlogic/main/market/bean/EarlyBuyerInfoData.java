package com.okinc.business.dexlogic.main.market.bean;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class EarlyBuyerInfoData implements Parcelable {
    public static final int $stable = 0;
    private final String totalEarlyBuyerAmount;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EarlyBuyerInfoData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EarlyBuyerInfoData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarlyBuyerInfoData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EarlyBuyerInfoData(parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarlyBuyerInfoData[] newArray(int i) {
            return new EarlyBuyerInfoData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EarlyBuyerInfoData() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EarlyBuyerInfoData copy$default(EarlyBuyerInfoData earlyBuyerInfoData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = earlyBuyerInfoData.totalEarlyBuyerAmount;
        }
        return earlyBuyerInfoData.copy(str);
    }

    @SerialName("totalEarlyBuyerAmount")
    public static /* synthetic */ void getTotalEarlyBuyerAmount$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.totalEarlyBuyerAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarlyBuyerInfoData copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new EarlyBuyerInfoData(str);
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
        return (obj instanceof EarlyBuyerInfoData) && Intrinsics.EZpvd((Object) this.totalEarlyBuyerAmount, (Object) ((EarlyBuyerInfoData) obj).totalEarlyBuyerAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalEarlyBuyerAmount() {
        return this.totalEarlyBuyerAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.totalEarlyBuyerAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EarlyBuyerInfoData(totalEarlyBuyerAmount=" + this.totalEarlyBuyerAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.totalEarlyBuyerAmount);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.market.bean.EarlyBuyerInfoData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EarlyBuyerInfoData> serializer() {
            return EarlyBuyerInfoData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EarlyBuyerInfoData(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.totalEarlyBuyerAmount = "";
        } else {
            this.totalEarlyBuyerAmount = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(EarlyBuyerInfoData earlyBuyerInfoData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd((Object) earlyBuyerInfoData.totalEarlyBuyerAmount, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 0, earlyBuyerInfoData.totalEarlyBuyerAmount);
    }

    public EarlyBuyerInfoData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalEarlyBuyerAmount = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:170) call: com.okinc.business.dexlogic.main.market.bean.EarlyBuyerInfoData.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ EarlyBuyerInfoData(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
