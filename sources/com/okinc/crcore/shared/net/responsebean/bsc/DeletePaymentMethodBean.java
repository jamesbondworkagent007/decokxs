package com.okinc.crcore.shared.net.responsebean.bsc;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.bsc.AccountResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.AccountResponseBean$$serializer;
import com.okinc.crcore.coreapi.net.responsebean.bsc.DeletePaymentMethodResponseBean;
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
public final class DeletePaymentMethodBean implements Parcelable {
    private final AccountResponseBean account;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DeletePaymentMethodBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<DeletePaymentMethodBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeletePaymentMethodBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DeletePaymentMethodBean(parcel.readInt() == 0 ? null : AccountResponseBean.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeletePaymentMethodBean[] newArray(int i) {
            return new DeletePaymentMethodBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DeletePaymentMethodBean() {
        this((AccountResponseBean) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DeletePaymentMethodBean copy$default(DeletePaymentMethodBean deletePaymentMethodBean, AccountResponseBean accountResponseBean, int i, Object obj) {
        if ((i & 1) != 0) {
            accountResponseBean = deletePaymentMethodBean.account;
        }
        return deletePaymentMethodBean.copy(accountResponseBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountResponseBean component1() {
        return this.account;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeletePaymentMethodBean copy(AccountResponseBean accountResponseBean) {
        return new DeletePaymentMethodBean(accountResponseBean);
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
        return (obj instanceof DeletePaymentMethodBean) && Intrinsics.EZpvd(this.account, ((DeletePaymentMethodBean) obj).account);
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
        return "DeletePaymentMethodBean(account=" + this.account + ")";
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

    public /* synthetic */ DeletePaymentMethodBean(int i, AccountResponseBean accountResponseBean, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.account = null;
        } else {
            this.account = accountResponseBean;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(DeletePaymentMethodBean deletePaymentMethodBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && deletePaymentMethodBean.account == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, AccountResponseBean$$serializer.INSTANCE, deletePaymentMethodBean.account);
    }

    public DeletePaymentMethodBean(AccountResponseBean accountResponseBean) {
        this.account = accountResponseBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.crcore.coreapi.net.responsebean.bsc.AccountResponseBean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.coreapi.net.responsebean.bsc.AccountResponseBean) : (r1v0 com.okinc.crcore.coreapi.net.responsebean.bsc.AccountResponseBean))
 A[MD:(com.okinc.crcore.coreapi.net.responsebean.bsc.AccountResponseBean):void (m)] (LINE:16) call: com.okinc.crcore.shared.net.responsebean.bsc.DeletePaymentMethodBean.<init>(com.okinc.crcore.coreapi.net.responsebean.bsc.AccountResponseBean):void type: THIS */
    public /* synthetic */ DeletePaymentMethodBean(AccountResponseBean accountResponseBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : accountResponseBean);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.DeletePaymentMethodBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DeletePaymentMethodBean> serializer() {
            return DeletePaymentMethodBean$$serializer.INSTANCE;
        }

        public final DeletePaymentMethodBean EZpvd(@NotNull DeletePaymentMethodResponseBean deletePaymentMethodResponseBean) {
            Intrinsics.checkNotNullParameter(deletePaymentMethodResponseBean, "");
            return new DeletePaymentMethodBean(deletePaymentMethodResponseBean.getAccount());
        }
    }
}
