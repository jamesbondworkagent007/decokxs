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
public final class DeletePaymentMethodResponseBean implements Parcelable {
    private final AccountResponseBean account;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DeletePaymentMethodResponseBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<DeletePaymentMethodResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeletePaymentMethodResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DeletePaymentMethodResponseBean(parcel.readInt() == 0 ? null : AccountResponseBean.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeletePaymentMethodResponseBean[] newArray(int i) {
            return new DeletePaymentMethodResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DeletePaymentMethodResponseBean() {
        this((AccountResponseBean) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DeletePaymentMethodResponseBean copy$default(DeletePaymentMethodResponseBean deletePaymentMethodResponseBean, AccountResponseBean accountResponseBean, int i, Object obj) {
        if ((i & 1) != 0) {
            accountResponseBean = deletePaymentMethodResponseBean.account;
        }
        return deletePaymentMethodResponseBean.copy(accountResponseBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountResponseBean component1() {
        return this.account;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeletePaymentMethodResponseBean copy(AccountResponseBean accountResponseBean) {
        return new DeletePaymentMethodResponseBean(accountResponseBean);
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
        return (obj instanceof DeletePaymentMethodResponseBean) && Intrinsics.EZpvd(this.account, ((DeletePaymentMethodResponseBean) obj).account);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountResponseBean getAccount() {
        return this.account;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        AccountResponseBean accountResponseBean = this.account;
        if (accountResponseBean == null) {
            return 0;
        }
        return accountResponseBean.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DeletePaymentMethodResponseBean(account=" + this.account + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        AccountResponseBean accountResponseBean = this.account;
        if (accountResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountResponseBean.writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.DeletePaymentMethodResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DeletePaymentMethodResponseBean> serializer() {
            return DeletePaymentMethodResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DeletePaymentMethodResponseBean(int i, AccountResponseBean accountResponseBean, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.account = null;
        } else {
            this.account = accountResponseBean;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(DeletePaymentMethodResponseBean deletePaymentMethodResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && deletePaymentMethodResponseBean.account == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, AccountResponseBean$$serializer.INSTANCE, deletePaymentMethodResponseBean.account);
    }

    public DeletePaymentMethodResponseBean(AccountResponseBean accountResponseBean) {
        this.account = accountResponseBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.crcore.coreapi.net.responsebean.bsc.AccountResponseBean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.coreapi.net.responsebean.bsc.AccountResponseBean) : (r1v0 com.okinc.crcore.coreapi.net.responsebean.bsc.AccountResponseBean))
 A[MD:(com.okinc.crcore.coreapi.net.responsebean.bsc.AccountResponseBean):void (m)] (LINE:14) call: com.okinc.crcore.coreapi.net.responsebean.bsc.DeletePaymentMethodResponseBean.<init>(com.okinc.crcore.coreapi.net.responsebean.bsc.AccountResponseBean):void type: THIS */
    public /* synthetic */ DeletePaymentMethodResponseBean(AccountResponseBean accountResponseBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : accountResponseBean);
    }
}
