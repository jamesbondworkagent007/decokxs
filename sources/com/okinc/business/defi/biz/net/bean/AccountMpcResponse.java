package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class AccountMpcResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String areaCode;
    private final String email;
    private final String mpcId;
    private final String phone;
    private final String uId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AccountMpcResponse copy$default(AccountMpcResponse accountMpcResponse, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountMpcResponse.mpcId;
        }
        if ((i & 2) != 0) {
            str2 = accountMpcResponse.uId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = accountMpcResponse.email;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = accountMpcResponse.areaCode;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = accountMpcResponse.phone;
        }
        return accountMpcResponse.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.uId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.email;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.phone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountMpcResponse copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new AccountMpcResponse(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountMpcResponse)) {
            return false;
        }
        AccountMpcResponse accountMpcResponse = (AccountMpcResponse) obj;
        return Intrinsics.EZpvd((Object) this.mpcId, (Object) accountMpcResponse.mpcId) && Intrinsics.EZpvd((Object) this.uId, (Object) accountMpcResponse.uId) && Intrinsics.EZpvd((Object) this.email, (Object) accountMpcResponse.email) && Intrinsics.EZpvd((Object) this.areaCode, (Object) accountMpcResponse.areaCode) && Intrinsics.EZpvd((Object) this.phone, (Object) accountMpcResponse.phone);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAreaCode() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEmail() {
        return this.email;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMpcId() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUId() {
        return this.uId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.mpcId.hashCode() * 31) + this.uId.hashCode()) * 31) + this.email.hashCode()) * 31) + this.areaCode.hashCode()) * 31) + this.phone.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountMpcResponse(mpcId=" + this.mpcId + ", uId=" + this.uId + ", email=" + this.email + ", areaCode=" + this.areaCode + ", phone=" + this.phone + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.AccountMpcResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AccountMpcResponse> serializer() {
            return AccountMpcResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AccountMpcResponse(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, AccountMpcResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.mpcId = str;
        this.uId = str2;
        this.email = str3;
        this.areaCode = str4;
        this.phone = str5;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(AccountMpcResponse accountMpcResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, accountMpcResponse.mpcId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, accountMpcResponse.uId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, accountMpcResponse.email);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, accountMpcResponse.areaCode);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, accountMpcResponse.phone);
    }

    public AccountMpcResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.mpcId = str;
        this.uId = str2;
        this.email = str3;
        this.areaCode = str4;
        this.phone = str5;
    }
}
