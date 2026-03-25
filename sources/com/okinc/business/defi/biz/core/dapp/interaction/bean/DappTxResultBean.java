package com.okinc.business.defi.biz.core.dapp.interaction.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class DappTxResultBean implements Parcelable {
    private Boolean isBatch;
    private Boolean isBtcMint;
    private String resultData;
    private String sendCallsId;
    private final String signTx;
    private String txHash;
    private String txId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DappTxResultBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DappTxResultBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappTxResultBean createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DappTxResultBean(string, string2, string3, string4, boolValueOf, boolValueOf2, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappTxResultBean[] newArray(int i) {
            return new DappTxResultBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DappTxResultBean() {
        this((String) null, (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DappTxResultBean copy$default(DappTxResultBean dappTxResultBean, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dappTxResultBean.signTx;
        }
        if ((i & 2) != 0) {
            str2 = dappTxResultBean.txId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = dappTxResultBean.txHash;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = dappTxResultBean.resultData;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            bool = dappTxResultBean.isBatch;
        }
        Boolean bool3 = bool;
        if ((i & 32) != 0) {
            bool2 = dappTxResultBean.isBtcMint;
        }
        Boolean bool4 = bool2;
        if ((i & 64) != 0) {
            str5 = dappTxResultBean.sendCallsId;
        }
        return dappTxResultBean.copy(str, str6, str7, str8, bool3, bool4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.signTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.resultData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.isBatch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.isBtcMint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.sendCallsId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappTxResultBean copy(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str5, "");
        return new DappTxResultBean(str, str2, str3, str4, bool, bool2, str5);
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
        if (!(obj instanceof DappTxResultBean)) {
            return false;
        }
        DappTxResultBean dappTxResultBean = (DappTxResultBean) obj;
        return Intrinsics.EZpvd((Object) this.signTx, (Object) dappTxResultBean.signTx) && Intrinsics.EZpvd((Object) this.txId, (Object) dappTxResultBean.txId) && Intrinsics.EZpvd((Object) this.txHash, (Object) dappTxResultBean.txHash) && Intrinsics.EZpvd((Object) this.resultData, (Object) dappTxResultBean.resultData) && Intrinsics.EZpvd(this.isBatch, dappTxResultBean.isBatch) && Intrinsics.EZpvd(this.isBtcMint, dappTxResultBean.isBtcMint) && Intrinsics.EZpvd((Object) this.sendCallsId, (Object) dappTxResultBean.sendCallsId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getResultData() {
        return this.resultData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSendCallsId() {
        return this.sendCallsId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignTx() {
        return this.signTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxHash() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxId() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.signTx;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.txId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.txHash;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.resultData;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        Boolean bool = this.isBatch;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.isBtcMint;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (bool2 != null ? bool2.hashCode() : 0)) * 31) + this.sendCallsId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isBatch() {
        return this.isBatch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isBtcMint() {
        return this.isBtcMint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBatch(Boolean bool) {
        this.isBatch = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBtcMint(Boolean bool) {
        this.isBtcMint = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setResultData(String str) {
        this.resultData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSendCallsId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sendCallsId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxHash(String str) {
        this.txHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxId(String str) {
        this.txId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DappTxResultBean(signTx=" + this.signTx + ", txId=" + this.txId + ", txHash=" + this.txHash + ", resultData=" + this.resultData + ", isBatch=" + this.isBatch + ", isBtcMint=" + this.isBtcMint + ", sendCallsId=" + this.sendCallsId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.signTx);
        parcel.writeString(this.txId);
        parcel.writeString(this.txHash);
        parcel.writeString(this.resultData);
        Boolean bool = this.isBatch;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isBtcMint;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.sendCallsId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DappTxResultBean> serializer() {
            return DappTxResultBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DappTxResultBean(int i, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.signTx = null;
        } else {
            this.signTx = str;
        }
        if ((i & 2) == 0) {
            this.txId = null;
        } else {
            this.txId = str2;
        }
        if ((i & 4) == 0) {
            this.txHash = null;
        } else {
            this.txHash = str3;
        }
        if ((i & 8) == 0) {
            this.resultData = null;
        } else {
            this.resultData = str4;
        }
        if ((i & 16) == 0) {
            this.isBatch = Boolean.FALSE;
        } else {
            this.isBatch = bool;
        }
        if ((i & 32) == 0) {
            this.isBtcMint = Boolean.FALSE;
        } else {
            this.isBtcMint = bool2;
        }
        if ((i & 64) == 0) {
            this.sendCallsId = "";
        } else {
            this.sendCallsId = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(DappTxResultBean dappTxResultBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || dappTxResultBean.signTx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, dappTxResultBean.signTx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || dappTxResultBean.txId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, dappTxResultBean.txId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || dappTxResultBean.txHash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, dappTxResultBean.txHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || dappTxResultBean.resultData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, dappTxResultBean.resultData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(dappTxResultBean.isBatch, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, dappTxResultBean.isBatch);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(dappTxResultBean.isBtcMint, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, dappTxResultBean.isBtcMint);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) dappTxResultBean.sendCallsId, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, dappTxResultBean.sendCallsId);
    }

    public DappTxResultBean(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str5, "");
        this.signTx = str;
        this.txId = str2;
        this.txHash = str3;
        this.resultData = str4;
        this.isBatch = bool;
        this.isBtcMint = bool2;
        this.sendCallsId = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.Boolean:0x0022: TERNARY null = ((wrap:int:0x001c: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0020: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r10v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:0x0029: TERNARY null = ((wrap:int:0x0023: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0027: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r11v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String):void (m)] (LINE:16) call: com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ DappTxResultBean(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) == 0 ? str4 : null, (i & 16) != 0 ? Boolean.FALSE : bool, (i & 32) != 0 ? Boolean.FALSE : bool2, (i & 64) != 0 ? "" : str5);
    }
}
