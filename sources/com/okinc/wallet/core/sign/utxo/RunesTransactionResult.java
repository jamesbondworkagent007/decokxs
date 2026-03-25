package com.okinc.wallet.core.sign.utxo;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class RunesTransactionResult implements Parcelable {
    public static final int $stable = 0;
    private final RunesTransactionResultErrData data;
    private final String errCode;
    private final String publicKey;
    private final String txFee;
    private final String txHex;
    private final String txId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<RunesTransactionResult> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RunesTransactionResult> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RunesTransactionResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RunesTransactionResult(parcel.readString(), parcel.readInt() == 0 ? null : RunesTransactionResultErrData.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RunesTransactionResult[] newArray(int i) {
            return new RunesTransactionResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RunesTransactionResult() {
        this((String) null, (RunesTransactionResultErrData) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RunesTransactionResult copy$default(RunesTransactionResult runesTransactionResult, String str, RunesTransactionResultErrData runesTransactionResultErrData, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = runesTransactionResult.errCode;
        }
        if ((i & 2) != 0) {
            runesTransactionResultErrData = runesTransactionResult.data;
        }
        RunesTransactionResultErrData runesTransactionResultErrData2 = runesTransactionResultErrData;
        if ((i & 4) != 0) {
            str2 = runesTransactionResult.txHex;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = runesTransactionResult.txFee;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = runesTransactionResult.txId;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = runesTransactionResult.publicKey;
        }
        return runesTransactionResult.copy(str, runesTransactionResultErrData2, str6, str7, str8, str5);
    }

    @SerialName("data")
    public static /* synthetic */ void getData$annotations() {
    }

    @SerialName("errCode")
    public static /* synthetic */ void getErrCode$annotations() {
    }

    @SerialName("publicKey")
    public static /* synthetic */ void getPublicKey$annotations() {
    }

    @SerialName("txFee")
    public static /* synthetic */ void getTxFee$annotations() {
    }

    @SerialName("txHex")
    public static /* synthetic */ void getTxHex$annotations() {
    }

    @SerialName("txId")
    public static /* synthetic */ void getTxId$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.errCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RunesTransactionResultErrData component2() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.txHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.txFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RunesTransactionResult copy(String str, RunesTransactionResultErrData runesTransactionResultErrData, String str2, String str3, String str4, String str5) {
        return new RunesTransactionResult(str, runesTransactionResultErrData, str2, str3, str4, str5);
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
        if (!(obj instanceof RunesTransactionResult)) {
            return false;
        }
        RunesTransactionResult runesTransactionResult = (RunesTransactionResult) obj;
        return Intrinsics.EZpvd((Object) this.errCode, (Object) runesTransactionResult.errCode) && Intrinsics.EZpvd(this.data, runesTransactionResult.data) && Intrinsics.EZpvd((Object) this.txHex, (Object) runesTransactionResult.txHex) && Intrinsics.EZpvd((Object) this.txFee, (Object) runesTransactionResult.txFee) && Intrinsics.EZpvd((Object) this.txId, (Object) runesTransactionResult.txId) && Intrinsics.EZpvd((Object) this.publicKey, (Object) runesTransactionResult.publicKey);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RunesTransactionResultErrData getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrCode() {
        return this.errCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPublicKey() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxFee() {
        return this.txFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxHex() {
        return this.txHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxId() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.errCode;
        int iHashCode = str == null ? 0 : str.hashCode();
        RunesTransactionResultErrData runesTransactionResultErrData = this.data;
        int iHashCode2 = runesTransactionResultErrData == null ? 0 : runesTransactionResultErrData.hashCode();
        String str2 = this.txHex;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.txFee;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.txId;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.publicKey;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RunesTransactionResult(errCode=" + this.errCode + ", data=" + this.data + ", txHex=" + this.txHex + ", txFee=" + this.txFee + ", txId=" + this.txId + ", publicKey=" + this.publicKey + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.errCode);
        RunesTransactionResultErrData runesTransactionResultErrData = this.data;
        if (runesTransactionResultErrData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            runesTransactionResultErrData.writeToParcel(parcel, i);
        }
        parcel.writeString(this.txHex);
        parcel.writeString(this.txFee);
        parcel.writeString(this.txId);
        parcel.writeString(this.publicKey);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.utxo.RunesTransactionResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RunesTransactionResult> serializer() {
            return RunesTransactionResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RunesTransactionResult(int i, String str, RunesTransactionResultErrData runesTransactionResultErrData, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.errCode = null;
        } else {
            this.errCode = str;
        }
        if ((i & 2) == 0) {
            this.data = null;
        } else {
            this.data = runesTransactionResultErrData;
        }
        if ((i & 4) == 0) {
            this.txHex = null;
        } else {
            this.txHex = str2;
        }
        if ((i & 8) == 0) {
            this.txFee = null;
        } else {
            this.txFee = str3;
        }
        if ((i & 16) == 0) {
            this.txId = null;
        } else {
            this.txId = str4;
        }
        if ((i & 32) == 0) {
            this.publicKey = null;
        } else {
            this.publicKey = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(RunesTransactionResult runesTransactionResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || runesTransactionResult.errCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, runesTransactionResult.errCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || runesTransactionResult.data != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, RunesTransactionResultErrData$$serializer.INSTANCE, runesTransactionResult.data);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || runesTransactionResult.txHex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, runesTransactionResult.txHex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || runesTransactionResult.txFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, runesTransactionResult.txFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || runesTransactionResult.txId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, runesTransactionResult.txId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && runesTransactionResult.publicKey == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, runesTransactionResult.publicKey);
    }

    public RunesTransactionResult(String str, RunesTransactionResultErrData runesTransactionResultErrData, String str2, String str3, String str4, String str5) {
        this.errCode = str;
        this.data = runesTransactionResultErrData;
        this.txHex = str2;
        this.txFee = str3;
        this.txId = str4;
        this.publicKey = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:com.okinc.wallet.core.sign.utxo.RunesTransactionResultErrData:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.core.sign.utxo.RunesTransactionResultErrData) : (r7v0 com.okinc.wallet.core.sign.utxo.RunesTransactionResultErrData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.String, com.okinc.wallet.core.sign.utxo.RunesTransactionResultErrData, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:60) call: com.okinc.wallet.core.sign.utxo.RunesTransactionResult.<init>(java.lang.String, com.okinc.wallet.core.sign.utxo.RunesTransactionResultErrData, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RunesTransactionResult(String str, RunesTransactionResultErrData runesTransactionResultErrData, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : runesTransactionResultErrData, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}
