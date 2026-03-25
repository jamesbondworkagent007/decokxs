package com.okinc.ok_kyc_core.data.remote.networkmodel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class AccountMergeAliTokenRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String idCard;
    private final String realName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AccountMergeAliTokenRequest copy$default(AccountMergeAliTokenRequest accountMergeAliTokenRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountMergeAliTokenRequest.realName;
        }
        if ((i & 2) != 0) {
            str2 = accountMergeAliTokenRequest.idCard;
        }
        return accountMergeAliTokenRequest.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.realName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.idCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountMergeAliTokenRequest copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AccountMergeAliTokenRequest(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountMergeAliTokenRequest)) {
            return false;
        }
        AccountMergeAliTokenRequest accountMergeAliTokenRequest = (AccountMergeAliTokenRequest) obj;
        return Intrinsics.EZpvd((Object) this.realName, (Object) accountMergeAliTokenRequest.realName) && Intrinsics.EZpvd((Object) this.idCard, (Object) accountMergeAliTokenRequest.idCard);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIdCard() {
        return this.idCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealName() {
        return this.realName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.realName.hashCode() * 31) + this.idCard.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountMergeAliTokenRequest(realName=" + this.realName + ", idCard=" + this.idCard + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.AccountMergeAliTokenRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AccountMergeAliTokenRequest> serializer() {
            return AccountMergeAliTokenRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AccountMergeAliTokenRequest(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, AccountMergeAliTokenRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.realName = str;
        this.idCard = str2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(AccountMergeAliTokenRequest accountMergeAliTokenRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, accountMergeAliTokenRequest.realName);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, accountMergeAliTokenRequest.idCard);
    }

    public AccountMergeAliTokenRequest(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.realName = str;
        this.idCard = str2;
    }
}
