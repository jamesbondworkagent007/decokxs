package com.okinc.wallet.core.sign.utxo;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class MPCBRC20PsbtResult implements Parcelable {
    private String fee;
    private String psbtTx;
    private List<String> signHashList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MPCBRC20PsbtResult> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<MPCBRC20PsbtResult> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MPCBRC20PsbtResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MPCBRC20PsbtResult(parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MPCBRC20PsbtResult[] newArray(int i) {
            return new MPCBRC20PsbtResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MPCBRC20PsbtResult() {
        this((String) null, (List) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.wallet.core.sign.utxo.MPCBRC20PsbtResult */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MPCBRC20PsbtResult copy$default(MPCBRC20PsbtResult mPCBRC20PsbtResult, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mPCBRC20PsbtResult.psbtTx;
        }
        if ((i & 2) != 0) {
            list = mPCBRC20PsbtResult.signHashList;
        }
        if ((i & 4) != 0) {
            str2 = mPCBRC20PsbtResult.fee;
        }
        return mPCBRC20PsbtResult.copy(str, list, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.psbtTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.signHashList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MPCBRC20PsbtResult copy(String str, List<String> list, String str2) {
        return new MPCBRC20PsbtResult(str, list, str2);
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
        if (!(obj instanceof MPCBRC20PsbtResult)) {
            return false;
        }
        MPCBRC20PsbtResult mPCBRC20PsbtResult = (MPCBRC20PsbtResult) obj;
        return Intrinsics.EZpvd((Object) this.psbtTx, (Object) mPCBRC20PsbtResult.psbtTx) && Intrinsics.EZpvd(this.signHashList, mPCBRC20PsbtResult.signHashList) && Intrinsics.EZpvd((Object) this.fee, (Object) mPCBRC20PsbtResult.fee);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPsbtTx() {
        return this.psbtTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSignHashList() {
        return this.signHashList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.psbtTx;
        int iHashCode = str == null ? 0 : str.hashCode();
        List<String> list = this.signHashList;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        String str2 = this.fee;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFee(String str) {
        this.fee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPsbtTx(String str) {
        this.psbtTx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignHashList(List<String> list) {
        this.signHashList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MPCBRC20PsbtResult(psbtTx=" + this.psbtTx + ", signHashList=" + this.signHashList + ", fee=" + this.fee + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.psbtTx);
        parcel.writeStringList(this.signHashList);
        parcel.writeString(this.fee);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.utxo.MPCBRC20PsbtResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MPCBRC20PsbtResult> serializer() {
            return MPCBRC20PsbtResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MPCBRC20PsbtResult(int i, String str, List list, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.psbtTx = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.signHashList = null;
        } else {
            this.signHashList = list;
        }
        if ((i & 4) == 0) {
            this.fee = null;
        } else {
            this.fee = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(MPCBRC20PsbtResult mPCBRC20PsbtResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) mPCBRC20PsbtResult.psbtTx, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, mPCBRC20PsbtResult.psbtTx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || mPCBRC20PsbtResult.signHashList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], mPCBRC20PsbtResult.signHashList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && mPCBRC20PsbtResult.fee == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, mPCBRC20PsbtResult.fee);
    }

    public MPCBRC20PsbtResult(String str, List<String> list, String str2) {
        this.psbtTx = str;
        this.signHashList = list;
        this.fee = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, java.lang.String):void (m)] (LINE:113) call: com.okinc.wallet.core.sign.utxo.MPCBRC20PsbtResult.<init>(java.lang.String, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ MPCBRC20PsbtResult(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2);
    }
}
