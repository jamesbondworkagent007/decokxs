package com.okinc.business.invest_api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestUtxoConfirmationItem implements Parcelable {
    public static final int $stable = 0;
    public final Long coinAmount;
    public final String imageUrl;
    public final String nftId;
    public final Integer status;
    public final String txHash;
    public final boolean unlockUtxo;
    public final int vout;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<InvestUtxoConfirmationItem> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestUtxoConfirmationItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUtxoConfirmationItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestUtxoConfirmationItem(parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUtxoConfirmationItem[] newArray(int i) {
            return new InvestUtxoConfirmationItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestUtxoConfirmationItem copy$default(InvestUtxoConfirmationItem investUtxoConfirmationItem, String str, int i, Integer num, boolean z, Long l, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = investUtxoConfirmationItem.txHash;
        }
        if ((i2 & 2) != 0) {
            i = investUtxoConfirmationItem.vout;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            num = investUtxoConfirmationItem.status;
        }
        Integer num2 = num;
        if ((i2 & 8) != 0) {
            z = investUtxoConfirmationItem.unlockUtxo;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            l = investUtxoConfirmationItem.coinAmount;
        }
        Long l2 = l;
        if ((i2 & 32) != 0) {
            str2 = investUtxoConfirmationItem.nftId;
        }
        String str4 = str2;
        if ((i2 & 64) != 0) {
            str3 = investUtxoConfirmationItem.imageUrl;
        }
        return investUtxoConfirmationItem.OLrzqt(str, i3, num2, z2, l2, str4, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer AEQbTJ() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.unlockUtxo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.nftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUtxoConfirmationItem OLrzqt(@NotNull String str, int i, Integer num, boolean z, Long l, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        return new InvestUtxoConfirmationItem(str, i, num, z, l, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long OLrzqt() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.txHash;
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
        if (!(obj instanceof InvestUtxoConfirmationItem)) {
            return false;
        }
        InvestUtxoConfirmationItem investUtxoConfirmationItem = (InvestUtxoConfirmationItem) obj;
        return Intrinsics.EZpvd((Object) this.txHash, (Object) investUtxoConfirmationItem.txHash) && this.vout == investUtxoConfirmationItem.vout && Intrinsics.EZpvd(this.status, investUtxoConfirmationItem.status) && this.unlockUtxo == investUtxoConfirmationItem.unlockUtxo && Intrinsics.EZpvd(this.coinAmount, investUtxoConfirmationItem.coinAmount) && Intrinsics.EZpvd((Object) this.nftId, (Object) investUtxoConfirmationItem.nftId) && Intrinsics.EZpvd((Object) this.imageUrl, (Object) investUtxoConfirmationItem.imageUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gEmmrt() {
        return this.vout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.txHash.hashCode();
        int iHashCode2 = Integer.hashCode(this.vout);
        Integer num = this.status;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        int iHashCode4 = Boolean.hashCode(this.unlockUtxo);
        Long l = this.coinAmount;
        int iHashCode5 = l == null ? 0 : l.hashCode();
        String str = this.nftId;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.imageUrl;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestUtxoConfirmationItem(txHash=" + this.txHash + ", vout=" + this.vout + ", status=" + this.status + ", unlockUtxo=" + this.unlockUtxo + ", coinAmount=" + this.coinAmount + ", nftId=" + this.nftId + ", imageUrl=" + this.imageUrl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.txHash);
        parcel.writeInt(this.vout);
        Integer num = this.status;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.unlockUtxo ? 1 : 0);
        Long l = this.coinAmount;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.nftId);
        parcel.writeString(this.imageUrl);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_api.bean.InvestUtxoConfirmationItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestUtxoConfirmationItem> serializer() {
            return InvestUtxoConfirmationItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestUtxoConfirmationItem(int i, String str, int i2, Integer num, boolean z, Long l, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i & 11)) {
            PluginExceptionsKt.throwMissingFieldException(i, 11, InvestUtxoConfirmationItem$$serializer.INSTANCE.getDescriptor());
        }
        this.txHash = str;
        this.vout = i2;
        if ((i & 4) == 0) {
            this.status = null;
        } else {
            this.status = num;
        }
        this.unlockUtxo = z;
        if ((i & 16) == 0) {
            this.coinAmount = null;
        } else {
            this.coinAmount = l;
        }
        if ((i & 32) == 0) {
            this.nftId = null;
        } else {
            this.nftId = str2;
        }
        if ((i & 64) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str3;
        }
    }

    public static final /* synthetic */ void OLrzqt(InvestUtxoConfirmationItem investUtxoConfirmationItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, investUtxoConfirmationItem.txHash);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, investUtxoConfirmationItem.vout);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investUtxoConfirmationItem.status != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, investUtxoConfirmationItem.status);
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, investUtxoConfirmationItem.unlockUtxo);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investUtxoConfirmationItem.coinAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, investUtxoConfirmationItem.coinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investUtxoConfirmationItem.nftId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, investUtxoConfirmationItem.nftId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && investUtxoConfirmationItem.imageUrl == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, investUtxoConfirmationItem.imageUrl);
    }

    public InvestUtxoConfirmationItem(@NotNull String str, int i, Integer num, boolean z, Long l, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.txHash = str;
        this.vout = i;
        this.status = num;
        this.unlockUtxo = z;
        this.coinAmount = l;
        this.nftId = str2;
        this.imageUrl = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0023: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 int)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r13v0 java.lang.Integer))
  (r14v0 boolean)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0008: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r15v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
 A[MD:(java.lang.String, int, java.lang.Integer, boolean, java.lang.Long, java.lang.String, java.lang.String):void (m)] (LINE:16) call: com.okinc.business.invest_api.bean.InvestUtxoConfirmationItem.<init>(java.lang.String, int, java.lang.Integer, boolean, java.lang.Long, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InvestUtxoConfirmationItem(String str, int i, Integer num, boolean z, Long l, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? null : num, z, (i2 & 16) != 0 ? null : l, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : str3);
    }
}
