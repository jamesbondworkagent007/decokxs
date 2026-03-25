package com.okinc.business.defi.wallet.passkey.common.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class PasskeyWalletAccountBean {
    private final int accountType;
    private final List<PasskeyWalletAddressBean> addressList;
    private final int status;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(PasskeyWalletAddressBean$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletAccountBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PasskeyWalletAccountBean copy$default(PasskeyWalletAccountBean passkeyWalletAccountBean, int i, List list, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = passkeyWalletAccountBean.accountType;
        }
        if ((i3 & 2) != 0) {
            list = passkeyWalletAccountBean.addressList;
        }
        if ((i3 & 4) != 0) {
            i2 = passkeyWalletAccountBean.status;
        }
        return passkeyWalletAccountBean.copy(i, list, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.accountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PasskeyWalletAddressBean> component2() {
        return this.addressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyWalletAccountBean copy(int i, @NotNull List<PasskeyWalletAddressBean> list, int i2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new PasskeyWalletAccountBean(i, list, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasskeyWalletAccountBean)) {
            return false;
        }
        PasskeyWalletAccountBean passkeyWalletAccountBean = (PasskeyWalletAccountBean) obj;
        return this.accountType == passkeyWalletAccountBean.accountType && Intrinsics.EZpvd(this.addressList, passkeyWalletAccountBean.addressList) && this.status == passkeyWalletAccountBean.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAccountType() {
        return this.accountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PasskeyWalletAddressBean> getAddressList() {
        return this.addressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Integer.hashCode(this.accountType) * 31) + this.addressList.hashCode()) * 31) + Integer.hashCode(this.status);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyWalletAccountBean(accountType=" + this.accountType + ", addressList=" + this.addressList + ", status=" + this.status + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletAccountBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PasskeyWalletAccountBean> serializer() {
            return PasskeyWalletAccountBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PasskeyWalletAccountBean(int i, int i2, List list, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, PasskeyWalletAccountBean$$serializer.INSTANCE.getDescriptor());
        }
        this.accountType = i2;
        this.addressList = list;
        this.status = i3;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(PasskeyWalletAccountBean passkeyWalletAccountBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeIntElement(serialDescriptor, 0, passkeyWalletAccountBean.accountType);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], passkeyWalletAccountBean.addressList);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, passkeyWalletAccountBean.status);
    }

    public PasskeyWalletAccountBean(int i, @NotNull List<PasskeyWalletAddressBean> list, int i2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.accountType = i;
        this.addressList = list;
        this.status = i2;
    }
}
