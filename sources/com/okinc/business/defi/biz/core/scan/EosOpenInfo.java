package com.okinc.business.defi.biz.core.scan;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class EosOpenInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String accountName;
    private final String activeKey;
    private final String ownerKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EosOpenInfo copy$default(EosOpenInfo eosOpenInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eosOpenInfo.accountName;
        }
        if ((i & 2) != 0) {
            str2 = eosOpenInfo.ownerKey;
        }
        if ((i & 4) != 0) {
            str3 = eosOpenInfo.activeKey;
        }
        return eosOpenInfo.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ownerKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.activeKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EosOpenInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new EosOpenInfo(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EosOpenInfo)) {
            return false;
        }
        EosOpenInfo eosOpenInfo = (EosOpenInfo) obj;
        return Intrinsics.EZpvd((Object) this.accountName, (Object) eosOpenInfo.accountName) && Intrinsics.EZpvd((Object) this.ownerKey, (Object) eosOpenInfo.ownerKey) && Intrinsics.EZpvd((Object) this.activeKey, (Object) eosOpenInfo.activeKey);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountName() {
        return this.accountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActiveKey() {
        return this.activeKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOwnerKey() {
        return this.ownerKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.accountName.hashCode() * 31) + this.ownerKey.hashCode()) * 31) + this.activeKey.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EosOpenInfo(accountName=" + this.accountName + ", ownerKey=" + this.ownerKey + ", activeKey=" + this.activeKey + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.scan.EosOpenInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EosOpenInfo> serializer() {
            return EosOpenInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EosOpenInfo(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, EosOpenInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.accountName = str;
        this.ownerKey = str2;
        this.activeKey = str3;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(EosOpenInfo eosOpenInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, eosOpenInfo.accountName);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, eosOpenInfo.ownerKey);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, eosOpenInfo.activeKey);
    }

    public EosOpenInfo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.accountName = str;
        this.ownerKey = str2;
        this.activeKey = str3;
    }
}
