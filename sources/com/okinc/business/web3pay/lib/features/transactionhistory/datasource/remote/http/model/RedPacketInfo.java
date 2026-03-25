package com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class RedPacketInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String claimedAmount;
    private final int claimedUser;
    private final String remainAmount;
    private final String remainUsdAmount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RedPacketInfo copy$default(RedPacketInfo redPacketInfo, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = redPacketInfo.claimedUser;
        }
        if ((i2 & 2) != 0) {
            str = redPacketInfo.claimedAmount;
        }
        if ((i2 & 4) != 0) {
            str2 = redPacketInfo.remainAmount;
        }
        if ((i2 & 8) != 0) {
            str3 = redPacketInfo.remainUsdAmount;
        }
        return redPacketInfo.copy(i, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.claimedUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.claimedAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.remainAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.remainUsdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RedPacketInfo copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new RedPacketInfo(i, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RedPacketInfo)) {
            return false;
        }
        RedPacketInfo redPacketInfo = (RedPacketInfo) obj;
        return this.claimedUser == redPacketInfo.claimedUser && Intrinsics.EZpvd((Object) this.claimedAmount, (Object) redPacketInfo.claimedAmount) && Intrinsics.EZpvd((Object) this.remainAmount, (Object) redPacketInfo.remainAmount) && Intrinsics.EZpvd((Object) this.remainUsdAmount, (Object) redPacketInfo.remainUsdAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClaimedAmount() {
        return this.claimedAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getClaimedUser() {
        return this.claimedUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRemainAmount() {
        return this.remainAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRemainUsdAmount() {
        return this.remainUsdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Integer.hashCode(this.claimedUser) * 31) + this.claimedAmount.hashCode()) * 31) + this.remainAmount.hashCode()) * 31) + this.remainUsdAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RedPacketInfo(claimedUser=" + this.claimedUser + ", claimedAmount=" + this.claimedAmount + ", remainAmount=" + this.remainAmount + ", remainUsdAmount=" + this.remainUsdAmount + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.RedPacketInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RedPacketInfo> serializer() {
            return RedPacketInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RedPacketInfo(int i, int i2, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, RedPacketInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.claimedUser = i2;
        this.claimedAmount = str;
        this.remainAmount = str2;
        this.remainUsdAmount = str3;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(RedPacketInfo redPacketInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, redPacketInfo.claimedUser);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, redPacketInfo.claimedAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, redPacketInfo.remainAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, redPacketInfo.remainUsdAmount);
    }

    public RedPacketInfo(int i, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.claimedUser = i;
        this.claimedAmount = str;
        this.remainAmount = str2;
        this.remainUsdAmount = str3;
    }
}
