package com.okinc.crcore.coreapi.net.responsebean.bsc;

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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class SellerReceiptAccountResponseBean implements Parcelable {
    private String accountNo;
    private String id;
    private boolean isSelected;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SellerReceiptAccountResponseBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<SellerReceiptAccountResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SellerReceiptAccountResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SellerReceiptAccountResponseBean(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SellerReceiptAccountResponseBean[] newArray(int i) {
            return new SellerReceiptAccountResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SellerReceiptAccountResponseBean() {
        this((String) null, (String) null, false, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SellerReceiptAccountResponseBean copy$default(SellerReceiptAccountResponseBean sellerReceiptAccountResponseBean, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sellerReceiptAccountResponseBean.id;
        }
        if ((i & 2) != 0) {
            str2 = sellerReceiptAccountResponseBean.accountNo;
        }
        if ((i & 4) != 0) {
            z = sellerReceiptAccountResponseBean.isSelected;
        }
        return sellerReceiptAccountResponseBean.copy(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.accountNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SellerReceiptAccountResponseBean copy(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SellerReceiptAccountResponseBean(str, str2, z);
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
        if (!(obj instanceof SellerReceiptAccountResponseBean)) {
            return false;
        }
        SellerReceiptAccountResponseBean sellerReceiptAccountResponseBean = (SellerReceiptAccountResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) sellerReceiptAccountResponseBean.id) && Intrinsics.EZpvd((Object) this.accountNo, (Object) sellerReceiptAccountResponseBean.accountNo) && this.isSelected == sellerReceiptAccountResponseBean.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountNo() {
        return this.accountNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.accountNo.hashCode()) * 31) + Boolean.hashCode(this.isSelected);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelected() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountNo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountNo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SellerReceiptAccountResponseBean(id=" + this.id + ", accountNo=" + this.accountNo + ", isSelected=" + this.isSelected + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        parcel.writeString(this.accountNo);
        parcel.writeInt(this.isSelected ? 1 : 0);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.SellerReceiptAccountResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SellerReceiptAccountResponseBean> serializer() {
            return SellerReceiptAccountResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SellerReceiptAccountResponseBean(int i, String str, String str2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.accountNo = "";
        } else {
            this.accountNo = str2;
        }
        if ((i & 4) == 0) {
            this.isSelected = false;
        } else {
            this.isSelected = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(SellerReceiptAccountResponseBean sellerReceiptAccountResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) sellerReceiptAccountResponseBean.id, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, sellerReceiptAccountResponseBean.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) sellerReceiptAccountResponseBean.accountNo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, sellerReceiptAccountResponseBean.accountNo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || sellerReceiptAccountResponseBean.isSelected) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, sellerReceiptAccountResponseBean.isSelected);
        }
    }

    public SellerReceiptAccountResponseBean(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.id = str;
        this.accountNo = str2;
        this.isSelected = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.lang.String, java.lang.String, boolean):void (m)] (LINE:11) call: com.okinc.crcore.coreapi.net.responsebean.bsc.SellerReceiptAccountResponseBean.<init>(java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ SellerReceiptAccountResponseBean(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z);
    }
}
