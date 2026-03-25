package com.okinc.okex.lite.earn.bean;

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
public final class EarnAssetRewardProgram {
    private String apy;
    private String lifeTimeRewards;
    private String pendingRewards;
    private long rewardCurrencyId;
    private String rewardCurrencySymbol;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EarnAssetRewardProgram copy$default(EarnAssetRewardProgram earnAssetRewardProgram, String str, String str2, long j, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = earnAssetRewardProgram.lifeTimeRewards;
        }
        if ((i & 2) != 0) {
            str2 = earnAssetRewardProgram.pendingRewards;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            j = earnAssetRewardProgram.rewardCurrencyId;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            str3 = earnAssetRewardProgram.rewardCurrencySymbol;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = earnAssetRewardProgram.apy;
        }
        return earnAssetRewardProgram.copy(str, str5, j2, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.lifeTimeRewards;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pendingRewards;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.rewardCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.rewardCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.apy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnAssetRewardProgram copy(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new EarnAssetRewardProgram(str, str2, j, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarnAssetRewardProgram)) {
            return false;
        }
        EarnAssetRewardProgram earnAssetRewardProgram = (EarnAssetRewardProgram) obj;
        return Intrinsics.EZpvd((Object) this.lifeTimeRewards, (Object) earnAssetRewardProgram.lifeTimeRewards) && Intrinsics.EZpvd((Object) this.pendingRewards, (Object) earnAssetRewardProgram.pendingRewards) && this.rewardCurrencyId == earnAssetRewardProgram.rewardCurrencyId && Intrinsics.EZpvd((Object) this.rewardCurrencySymbol, (Object) earnAssetRewardProgram.rewardCurrencySymbol) && Intrinsics.EZpvd((Object) this.apy, (Object) earnAssetRewardProgram.apy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApy() {
        return this.apy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLifeTimeRewards() {
        return this.lifeTimeRewards;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPendingRewards() {
        return this.pendingRewards;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getRewardCurrencyId() {
        return this.rewardCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRewardCurrencySymbol() {
        return this.rewardCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.lifeTimeRewards.hashCode() * 31) + this.pendingRewards.hashCode()) * 31) + Long.hashCode(this.rewardCurrencyId)) * 31) + this.rewardCurrencySymbol.hashCode()) * 31) + this.apy.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.apy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLifeTimeRewards(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lifeTimeRewards = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPendingRewards(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pendingRewards = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRewardCurrencyId(long j) {
        this.rewardCurrencyId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRewardCurrencySymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rewardCurrencySymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EarnAssetRewardProgram(lifeTimeRewards=" + this.lifeTimeRewards + ", pendingRewards=" + this.pendingRewards + ", rewardCurrencyId=" + this.rewardCurrencyId + ", rewardCurrencySymbol=" + this.rewardCurrencySymbol + ", apy=" + this.apy + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.earn.bean.EarnAssetRewardProgram.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EarnAssetRewardProgram> serializer() {
            return EarnAssetRewardProgram$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EarnAssetRewardProgram(int i, String str, String str2, long j, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, EarnAssetRewardProgram$$serializer.INSTANCE.getDescriptor());
        }
        this.lifeTimeRewards = str;
        this.pendingRewards = str2;
        this.rewardCurrencyId = j;
        this.rewardCurrencySymbol = str3;
        this.apy = str4;
    }

    public static final /* synthetic */ void write$Self$OKFinance_finance_api(EarnAssetRewardProgram earnAssetRewardProgram, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, earnAssetRewardProgram.lifeTimeRewards);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, earnAssetRewardProgram.pendingRewards);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, earnAssetRewardProgram.rewardCurrencyId);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, earnAssetRewardProgram.rewardCurrencySymbol);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, earnAssetRewardProgram.apy);
    }

    public EarnAssetRewardProgram(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.lifeTimeRewards = str;
        this.pendingRewards = str2;
        this.rewardCurrencyId = j;
        this.rewardCurrencySymbol = str3;
        this.apy = str4;
    }
}
