package com.okinc.business.defi.wallet.mine.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.defi.biz.constant.WalletType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class BatchCreateRootWalletInformationBean implements Parcelable {
    public static final int $stable = 0;
    private final String name;
    private final String rootWalletId;
    private final WalletType walletType;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BatchCreateRootWalletInformationBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.business.defi.biz.constant.WalletType", WalletType.values())};

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<BatchCreateRootWalletInformationBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BatchCreateRootWalletInformationBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BatchCreateRootWalletInformationBean(parcel.readString(), parcel.readString(), WalletType.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BatchCreateRootWalletInformationBean[] newArray(int i) {
            return new BatchCreateRootWalletInformationBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BatchCreateRootWalletInformationBean copy$default(BatchCreateRootWalletInformationBean batchCreateRootWalletInformationBean, String str, String str2, WalletType walletType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = batchCreateRootWalletInformationBean.name;
        }
        if ((i & 2) != 0) {
            str2 = batchCreateRootWalletInformationBean.rootWalletId;
        }
        if ((i & 4) != 0) {
            walletType = batchCreateRootWalletInformationBean.walletType;
        }
        return batchCreateRootWalletInformationBean.copy(str, str2, walletType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.rootWalletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletType component3() {
        return this.walletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BatchCreateRootWalletInformationBean copy(@NotNull String str, @NotNull String str2, @NotNull WalletType walletType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(walletType, "");
        return new BatchCreateRootWalletInformationBean(str, str2, walletType);
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
        if (!(obj instanceof BatchCreateRootWalletInformationBean)) {
            return false;
        }
        BatchCreateRootWalletInformationBean batchCreateRootWalletInformationBean = (BatchCreateRootWalletInformationBean) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) batchCreateRootWalletInformationBean.name) && Intrinsics.EZpvd((Object) this.rootWalletId, (Object) batchCreateRootWalletInformationBean.rootWalletId) && this.walletType == batchCreateRootWalletInformationBean.walletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRootWalletId() {
        return this.rootWalletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletType getWalletType() {
        return this.walletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.rootWalletId.hashCode()) * 31) + this.walletType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BatchCreateRootWalletInformationBean(name=" + this.name + ", rootWalletId=" + this.rootWalletId + ", walletType=" + this.walletType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.name);
        parcel.writeString(this.rootWalletId);
        parcel.writeString(this.walletType.name());
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.bean.BatchCreateRootWalletInformationBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BatchCreateRootWalletInformationBean> serializer() {
            return BatchCreateRootWalletInformationBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BatchCreateRootWalletInformationBean(int i, String str, String str2, WalletType walletType, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, BatchCreateRootWalletInformationBean$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        this.rootWalletId = str2;
        this.walletType = walletType;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(BatchCreateRootWalletInformationBean batchCreateRootWalletInformationBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, batchCreateRootWalletInformationBean.name);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, batchCreateRootWalletInformationBean.rootWalletId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], batchCreateRootWalletInformationBean.walletType);
    }

    public BatchCreateRootWalletInformationBean(@NotNull String str, @NotNull String str2, @NotNull WalletType walletType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(walletType, "");
        this.name = str;
        this.rootWalletId = str2;
        this.walletType = walletType;
    }
}
