package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class UserAssetsBalance {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String fundBalance;
    private final String simpleEarnBalance;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UserAssetsBalance copy$default(UserAssetsBalance userAssetsBalance, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userAssetsBalance.fundBalance;
        }
        if ((i & 2) != 0) {
            str2 = userAssetsBalance.simpleEarnBalance;
        }
        return userAssetsBalance.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.fundBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.simpleEarnBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserAssetsBalance copy(String str, String str2) {
        return new UserAssetsBalance(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAssetsBalance)) {
            return false;
        }
        UserAssetsBalance userAssetsBalance = (UserAssetsBalance) obj;
        return Intrinsics.EZpvd((Object) this.fundBalance, (Object) userAssetsBalance.fundBalance) && Intrinsics.EZpvd((Object) this.simpleEarnBalance, (Object) userAssetsBalance.simpleEarnBalance);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundBalance() {
        return this.fundBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSimpleEarnBalance() {
        return this.simpleEarnBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.fundBalance;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.simpleEarnBalance;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UserAssetsBalance(fundBalance=" + this.fundBalance + ", simpleEarnBalance=" + this.simpleEarnBalance + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.UserAssetsBalance.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserAssetsBalance> serializer() {
            return UserAssetsBalance$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UserAssetsBalance(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, UserAssetsBalance$$serializer.INSTANCE.getDescriptor());
        }
        this.fundBalance = str;
        this.simpleEarnBalance = str2;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(UserAssetsBalance userAssetsBalance, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, userAssetsBalance.fundBalance);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, userAssetsBalance.simpleEarnBalance);
    }

    public UserAssetsBalance(String str, String str2) {
        this.fundBalance = str;
        this.simpleEarnBalance = str2;
    }
}
