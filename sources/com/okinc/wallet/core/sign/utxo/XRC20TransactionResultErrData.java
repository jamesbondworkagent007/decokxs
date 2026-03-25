package com.okinc.wallet.core.sign.utxo;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class XRC20TransactionResultErrData implements Parcelable {
    private String amount;
    private String atomicalId;
    private String commitTxFee;
    private Integer vOut;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<XRC20TransactionResultErrData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<XRC20TransactionResultErrData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final XRC20TransactionResultErrData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new XRC20TransactionResultErrData(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final XRC20TransactionResultErrData[] newArray(int i) {
            return new XRC20TransactionResultErrData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public XRC20TransactionResultErrData() {
        this((String) null, (String) null, (Integer) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ XRC20TransactionResultErrData copy$default(XRC20TransactionResultErrData xRC20TransactionResultErrData, String str, String str2, Integer num, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = xRC20TransactionResultErrData.atomicalId;
        }
        if ((i & 2) != 0) {
            str2 = xRC20TransactionResultErrData.amount;
        }
        if ((i & 4) != 0) {
            num = xRC20TransactionResultErrData.vOut;
        }
        if ((i & 8) != 0) {
            str3 = xRC20TransactionResultErrData.commitTxFee;
        }
        return xRC20TransactionResultErrData.copy(str, str2, num, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.atomicalId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.vOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.commitTxFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final XRC20TransactionResultErrData copy(String str, String str2, Integer num, String str3) {
        return new XRC20TransactionResultErrData(str, str2, num, str3);
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
        if (!(obj instanceof XRC20TransactionResultErrData)) {
            return false;
        }
        XRC20TransactionResultErrData xRC20TransactionResultErrData = (XRC20TransactionResultErrData) obj;
        return Intrinsics.EZpvd((Object) this.atomicalId, (Object) xRC20TransactionResultErrData.atomicalId) && Intrinsics.EZpvd((Object) this.amount, (Object) xRC20TransactionResultErrData.amount) && Intrinsics.EZpvd(this.vOut, xRC20TransactionResultErrData.vOut) && Intrinsics.EZpvd((Object) this.commitTxFee, (Object) xRC20TransactionResultErrData.commitTxFee);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAtomicalId() {
        return this.atomicalId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCommitTxFee() {
        return this.commitTxFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getVOut() {
        return this.vOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.atomicalId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.amount;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.vOut;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str3 = this.commitTxFee;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(String str) {
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAtomicalId(String str) {
        this.atomicalId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCommitTxFee(String str) {
        this.commitTxFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVOut(Integer num) {
        this.vOut = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "XRC20TransactionResultErrData(atomicalId=" + this.atomicalId + ", amount=" + this.amount + ", vOut=" + this.vOut + ", commitTxFee=" + this.commitTxFee + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.atomicalId);
        parcel.writeString(this.amount);
        Integer num = this.vOut;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.commitTxFee);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.utxo.XRC20TransactionResultErrData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<XRC20TransactionResultErrData> serializer() {
            return XRC20TransactionResultErrData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ XRC20TransactionResultErrData(int i, String str, String str2, Integer num, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.atomicalId = null;
        } else {
            this.atomicalId = str;
        }
        if ((i & 2) == 0) {
            this.amount = null;
        } else {
            this.amount = str2;
        }
        if ((i & 4) == 0) {
            this.vOut = null;
        } else {
            this.vOut = num;
        }
        if ((i & 8) == 0) {
            this.commitTxFee = null;
        } else {
            this.commitTxFee = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(XRC20TransactionResultErrData xRC20TransactionResultErrData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || xRC20TransactionResultErrData.atomicalId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, xRC20TransactionResultErrData.atomicalId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || xRC20TransactionResultErrData.amount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, xRC20TransactionResultErrData.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || xRC20TransactionResultErrData.vOut != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, xRC20TransactionResultErrData.vOut);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && xRC20TransactionResultErrData.commitTxFee == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, xRC20TransactionResultErrData.commitTxFee);
    }

    public XRC20TransactionResultErrData(String str, String str2, Integer num, String str3) {
        this.atomicalId = str;
        this.amount = str2;
        this.vOut = num;
        this.commitTxFee = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String):void (m)] (LINE:115) call: com.okinc.wallet.core.sign.utxo.XRC20TransactionResultErrData.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ XRC20TransactionResultErrData(String str, String str2, Integer num, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3);
    }
}
