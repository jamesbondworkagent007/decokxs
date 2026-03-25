package com.okinc.wallet.core.sign.utxo;

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

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class ARCBuyTransactionResult implements Parcelable {
    private String fee;
    private String psbt;
    private String tx;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ARCBuyTransactionResult> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ARCBuyTransactionResult> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ARCBuyTransactionResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ARCBuyTransactionResult(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ARCBuyTransactionResult[] newArray(int i) {
            return new ARCBuyTransactionResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ARCBuyTransactionResult() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ARCBuyTransactionResult copy$default(ARCBuyTransactionResult aRCBuyTransactionResult, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aRCBuyTransactionResult.tx;
        }
        if ((i & 2) != 0) {
            str2 = aRCBuyTransactionResult.psbt;
        }
        if ((i & 4) != 0) {
            str3 = aRCBuyTransactionResult.fee;
        }
        return aRCBuyTransactionResult.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.psbt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ARCBuyTransactionResult copy(String str, String str2, String str3) {
        return new ARCBuyTransactionResult(str, str2, str3);
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
        if (!(obj instanceof ARCBuyTransactionResult)) {
            return false;
        }
        ARCBuyTransactionResult aRCBuyTransactionResult = (ARCBuyTransactionResult) obj;
        return Intrinsics.EZpvd((Object) this.tx, (Object) aRCBuyTransactionResult.tx) && Intrinsics.EZpvd((Object) this.psbt, (Object) aRCBuyTransactionResult.psbt) && Intrinsics.EZpvd((Object) this.fee, (Object) aRCBuyTransactionResult.fee);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPsbt() {
        return this.psbt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTx() {
        return this.tx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.tx;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.psbt;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.fee;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFee(String str) {
        this.fee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPsbt(String str) {
        this.psbt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTx(String str) {
        this.tx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ARCBuyTransactionResult(tx=" + this.tx + ", psbt=" + this.psbt + ", fee=" + this.fee + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.tx);
        parcel.writeString(this.psbt);
        parcel.writeString(this.fee);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.utxo.ARCBuyTransactionResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ARCBuyTransactionResult> serializer() {
            return ARCBuyTransactionResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ARCBuyTransactionResult(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tx = null;
        } else {
            this.tx = str;
        }
        if ((i & 2) == 0) {
            this.psbt = null;
        } else {
            this.psbt = str2;
        }
        if ((i & 4) == 0) {
            this.fee = null;
        } else {
            this.fee = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(ARCBuyTransactionResult aRCBuyTransactionResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || aRCBuyTransactionResult.tx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, aRCBuyTransactionResult.tx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || aRCBuyTransactionResult.psbt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, aRCBuyTransactionResult.psbt);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && aRCBuyTransactionResult.fee == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, aRCBuyTransactionResult.fee);
    }

    public ARCBuyTransactionResult(String str, String str2, String str3) {
        this.tx = str;
        this.psbt = str2;
        this.fee = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:41) call: com.okinc.wallet.core.sign.utxo.ARCBuyTransactionResult.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ARCBuyTransactionResult(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
