package com.okinc.business.web3pay.lib.features.account.data.model;

import com.okinc.business.web3pay.lib.features.account.model.AccountAddress;
import com.okinc.business.web3pay.lib.features.account.model.AccountAddress$$serializer;
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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class AccountInfoApiModel {
    private final String accountId;
    private final List<AccountAddress> addressList;
    private final int status;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(AccountAddress$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.web3pay.lib.features.account.data.model.AccountInfoApiModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountInfoApiModel copy$default(AccountInfoApiModel accountInfoApiModel, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = accountInfoApiModel.status;
        }
        if ((i2 & 2) != 0) {
            str = accountInfoApiModel.accountId;
        }
        if ((i2 & 4) != 0) {
            list = accountInfoApiModel.addressList;
        }
        return accountInfoApiModel.copy(i, str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AccountAddress> component3() {
        return this.addressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountInfoApiModel copy(int i, @NotNull String str, @NotNull List<AccountAddress> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new AccountInfoApiModel(i, str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountInfoApiModel)) {
            return false;
        }
        AccountInfoApiModel accountInfoApiModel = (AccountInfoApiModel) obj;
        return this.status == accountInfoApiModel.status && Intrinsics.EZpvd((Object) this.accountId, (Object) accountInfoApiModel.accountId) && Intrinsics.EZpvd(this.addressList, accountInfoApiModel.addressList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AccountAddress> getAddressList() {
        return this.addressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Integer.hashCode(this.status) * 31) + this.accountId.hashCode()) * 31) + this.addressList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountInfoApiModel(status=" + this.status + ", accountId=" + this.accountId + ", addressList=" + this.addressList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.account.data.model.AccountInfoApiModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AccountInfoApiModel> serializer() {
            return AccountInfoApiModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AccountInfoApiModel(int i, int i2, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, AccountInfoApiModel$$serializer.INSTANCE.getDescriptor());
        }
        this.status = i2;
        this.accountId = str;
        this.addressList = list;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(AccountInfoApiModel accountInfoApiModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeIntElement(serialDescriptor, 0, accountInfoApiModel.status);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, accountInfoApiModel.accountId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], accountInfoApiModel.addressList);
    }

    public AccountInfoApiModel(int i, @NotNull String str, @NotNull List<AccountAddress> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.status = i;
        this.accountId = str;
        this.addressList = list;
    }
}
