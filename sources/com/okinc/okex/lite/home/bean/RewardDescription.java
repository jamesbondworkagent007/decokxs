package com.okinc.okex.lite.home.bean;

import com.google.gson.annotations.SerializedName;
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
public final class RewardDescription {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    @SerializedName("rewardCurrencyName")
    private final String rewardCurrencyName;

    @SerializedName("rewardType")
    private final int rewardType;

    @SerializedName("rewardValuation")
    private final double rewardValuation;

    @SerializedName("rewardValuationCurrencyName")
    private final String rewardValuationCurrencyName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RewardDescription copy$default(RewardDescription rewardDescription, int i, String str, String str2, double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = rewardDescription.rewardType;
        }
        if ((i2 & 2) != 0) {
            str = rewardDescription.rewardCurrencyName;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = rewardDescription.rewardValuationCurrencyName;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            d = rewardDescription.rewardValuation;
        }
        return rewardDescription.KWHzl(i, str3, str4, d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RewardDescription KWHzl(int i, @NotNull String str, @NotNull String str2, double d) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new RewardDescription(i, str, str2, d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardDescription)) {
            return false;
        }
        RewardDescription rewardDescription = (RewardDescription) obj;
        return this.rewardType == rewardDescription.rewardType && Intrinsics.EZpvd((Object) this.rewardCurrencyName, (Object) rewardDescription.rewardCurrencyName) && Intrinsics.EZpvd((Object) this.rewardValuationCurrencyName, (Object) rewardDescription.rewardValuationCurrencyName) && Double.compare(this.rewardValuation, rewardDescription.rewardValuation) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Integer.hashCode(this.rewardType) * 31) + this.rewardCurrencyName.hashCode()) * 31) + this.rewardValuationCurrencyName.hashCode()) * 31) + Double.hashCode(this.rewardValuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RewardDescription(rewardType=" + this.rewardType + ", rewardCurrencyName=" + this.rewardCurrencyName + ", rewardValuationCurrencyName=" + this.rewardValuationCurrencyName + ", rewardValuation=" + this.rewardValuation + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.RewardDescription.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RewardDescription> serializer() {
            return RewardDescription$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RewardDescription(int i, int i2, String str, String str2, double d, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, RewardDescription$$serializer.INSTANCE.getDescriptor());
        }
        this.rewardType = i2;
        this.rewardCurrencyName = str;
        this.rewardValuationCurrencyName = str2;
        this.rewardValuation = d;
    }

    public static final /* synthetic */ void OLrzqt(RewardDescription rewardDescription, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, rewardDescription.rewardType);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, rewardDescription.rewardCurrencyName);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, rewardDescription.rewardValuationCurrencyName);
        compositeEncoder.encodeDoubleElement(serialDescriptor, 3, rewardDescription.rewardValuation);
    }

    public RewardDescription(int i, @NotNull String str, @NotNull String str2, double d) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.rewardType = i;
        this.rewardCurrencyName = str;
        this.rewardValuationCurrencyName = str2;
        this.rewardValuation = d;
    }
}
