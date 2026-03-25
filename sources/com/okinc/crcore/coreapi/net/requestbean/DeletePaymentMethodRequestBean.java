package com.okinc.crcore.coreapi.net.requestbean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.enums.ChannelCategoryCode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class DeletePaymentMethodRequestBean implements Parcelable {
    public static final int $stable = 0;
    private final String cardNumber;
    private final ChannelCategoryCode categoryCode;
    private final String depositPlatformCode;
    private final String paymentAccountId;
    private final String paymentMethod;
    private final String userBankId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DeletePaymentMethodRequestBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {ChannelCategoryCode.Companion.serializer(), null, null, null, null, null};

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<DeletePaymentMethodRequestBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeletePaymentMethodRequestBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DeletePaymentMethodRequestBean(parcel.readInt() == 0 ? null : ChannelCategoryCode.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeletePaymentMethodRequestBean[] newArray(int i) {
            return new DeletePaymentMethodRequestBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DeletePaymentMethodRequestBean() {
        this((ChannelCategoryCode) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DeletePaymentMethodRequestBean copy$default(DeletePaymentMethodRequestBean deletePaymentMethodRequestBean, ChannelCategoryCode channelCategoryCode, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            channelCategoryCode = deletePaymentMethodRequestBean.categoryCode;
        }
        if ((i & 2) != 0) {
            str = deletePaymentMethodRequestBean.depositPlatformCode;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = deletePaymentMethodRequestBean.paymentMethod;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = deletePaymentMethodRequestBean.paymentAccountId;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = deletePaymentMethodRequestBean.userBankId;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = deletePaymentMethodRequestBean.cardNumber;
        }
        return deletePaymentMethodRequestBean.copy(channelCategoryCode, str6, str7, str8, str9, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChannelCategoryCode component1() {
        return this.categoryCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.depositPlatformCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.paymentMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.paymentAccountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.userBankId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.cardNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeletePaymentMethodRequestBean copy(ChannelCategoryCode channelCategoryCode, @NotNull String str, @NotNull String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new DeletePaymentMethodRequestBean(channelCategoryCode, str, str2, str3, str4, str5);
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
        if (!(obj instanceof DeletePaymentMethodRequestBean)) {
            return false;
        }
        DeletePaymentMethodRequestBean deletePaymentMethodRequestBean = (DeletePaymentMethodRequestBean) obj;
        return this.categoryCode == deletePaymentMethodRequestBean.categoryCode && Intrinsics.EZpvd((Object) this.depositPlatformCode, (Object) deletePaymentMethodRequestBean.depositPlatformCode) && Intrinsics.EZpvd((Object) this.paymentMethod, (Object) deletePaymentMethodRequestBean.paymentMethod) && Intrinsics.EZpvd((Object) this.paymentAccountId, (Object) deletePaymentMethodRequestBean.paymentAccountId) && Intrinsics.EZpvd((Object) this.userBankId, (Object) deletePaymentMethodRequestBean.userBankId) && Intrinsics.EZpvd((Object) this.cardNumber, (Object) deletePaymentMethodRequestBean.cardNumber);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChannelCategoryCode getCategoryCode() {
        return this.categoryCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositPlatformCode() {
        return this.depositPlatformCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymentAccountId() {
        return this.paymentAccountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserBankId() {
        return this.userBankId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ChannelCategoryCode channelCategoryCode = this.categoryCode;
        int iHashCode = channelCategoryCode == null ? 0 : channelCategoryCode.hashCode();
        int iHashCode2 = this.depositPlatformCode.hashCode();
        int iHashCode3 = this.paymentMethod.hashCode();
        String str = this.paymentAccountId;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.userBankId;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.cardNumber;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DeletePaymentMethodRequestBean(categoryCode=" + this.categoryCode + ", depositPlatformCode=" + this.depositPlatformCode + ", paymentMethod=" + this.paymentMethod + ", paymentAccountId=" + this.paymentAccountId + ", userBankId=" + this.userBankId + ", cardNumber=" + this.cardNumber + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        ChannelCategoryCode channelCategoryCode = this.categoryCode;
        if (channelCategoryCode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channelCategoryCode.writeToParcel(parcel, i);
        }
        parcel.writeString(this.depositPlatformCode);
        parcel.writeString(this.paymentMethod);
        parcel.writeString(this.paymentAccountId);
        parcel.writeString(this.userBankId);
        parcel.writeString(this.cardNumber);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.requestbean.DeletePaymentMethodRequestBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DeletePaymentMethodRequestBean> serializer() {
            return DeletePaymentMethodRequestBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DeletePaymentMethodRequestBean(int i, ChannelCategoryCode channelCategoryCode, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.categoryCode = null;
        } else {
            this.categoryCode = channelCategoryCode;
        }
        if ((i & 2) == 0) {
            this.depositPlatformCode = "";
        } else {
            this.depositPlatformCode = str;
        }
        if ((i & 4) == 0) {
            this.paymentMethod = "";
        } else {
            this.paymentMethod = str2;
        }
        if ((i & 8) == 0) {
            this.paymentAccountId = null;
        } else {
            this.paymentAccountId = str3;
        }
        if ((i & 16) == 0) {
            this.userBankId = null;
        } else {
            this.userBankId = str4;
        }
        if ((i & 32) == 0) {
            this.cardNumber = null;
        } else {
            this.cardNumber = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(DeletePaymentMethodRequestBean deletePaymentMethodRequestBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || deletePaymentMethodRequestBean.categoryCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], deletePaymentMethodRequestBean.categoryCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) deletePaymentMethodRequestBean.depositPlatformCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, deletePaymentMethodRequestBean.depositPlatformCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) deletePaymentMethodRequestBean.paymentMethod, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, deletePaymentMethodRequestBean.paymentMethod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || deletePaymentMethodRequestBean.paymentAccountId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, deletePaymentMethodRequestBean.paymentAccountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || deletePaymentMethodRequestBean.userBankId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, deletePaymentMethodRequestBean.userBankId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && deletePaymentMethodRequestBean.cardNumber == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, deletePaymentMethodRequestBean.cardNumber);
    }

    public DeletePaymentMethodRequestBean(ChannelCategoryCode channelCategoryCode, @NotNull String str, @NotNull String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.categoryCode = channelCategoryCode;
        this.depositPlatformCode = str;
        this.paymentMethod = str2;
        this.paymentAccountId = str3;
        this.userBankId = str4;
        this.cardNumber = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:com.okinc.crcore.coreapi.enums.ChannelCategoryCode:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.coreapi.enums.ChannelCategoryCode) : (r6v0 com.okinc.crcore.coreapi.enums.ChannelCategoryCode))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r12v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(com.okinc.crcore.coreapi.enums.ChannelCategoryCode, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:15) call: com.okinc.crcore.coreapi.net.requestbean.DeletePaymentMethodRequestBean.<init>(com.okinc.crcore.coreapi.enums.ChannelCategoryCode, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DeletePaymentMethodRequestBean(ChannelCategoryCode channelCategoryCode, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : channelCategoryCode, (i & 2) != 0 ? "" : str, (i & 4) == 0 ? str2 : "", (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}
