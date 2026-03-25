package com.okinc.tradingbot.impl.market_place.bot_copy.itembinder;

import android.os.Parcel;
import android.os.Parcelable;
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
public final class BotWinLossRateData implements Parcelable {
    public static final int $stable = 0;
    public final String lossCount;
    public final String lossRate;
    public final String winCount;
    public final String winRate;
    public final float winRatio;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BotWinLossRateData> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<BotWinLossRateData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotWinLossRateData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BotWinLossRateData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readFloat());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotWinLossRateData[] newArray(int i) {
            return new BotWinLossRateData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BotWinLossRateData copy$default(BotWinLossRateData botWinLossRateData, String str, String str2, String str3, String str4, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = botWinLossRateData.winRate;
        }
        if ((i & 2) != 0) {
            str2 = botWinLossRateData.lossRate;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = botWinLossRateData.winCount;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = botWinLossRateData.lossCount;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            f = botWinLossRateData.winRatio;
        }
        return botWinLossRateData.copydefault(str, str5, str6, str7, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.winCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.lossCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.winRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.lossRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float copydefault() {
        return this.winRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotWinLossRateData copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new BotWinLossRateData(str, str2, str3, str4, f);
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
        if (!(obj instanceof BotWinLossRateData)) {
            return false;
        }
        BotWinLossRateData botWinLossRateData = (BotWinLossRateData) obj;
        return Intrinsics.EZpvd((Object) this.winRate, (Object) botWinLossRateData.winRate) && Intrinsics.EZpvd((Object) this.lossRate, (Object) botWinLossRateData.lossRate) && Intrinsics.EZpvd((Object) this.winCount, (Object) botWinLossRateData.winCount) && Intrinsics.EZpvd((Object) this.lossCount, (Object) botWinLossRateData.lossCount) && Float.compare(this.winRatio, botWinLossRateData.winRatio) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.winRate.hashCode() * 31) + this.lossRate.hashCode()) * 31) + this.winCount.hashCode()) * 31) + this.lossCount.hashCode()) * 31) + Float.hashCode(this.winRatio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotWinLossRateData(winRate=" + this.winRate + ", lossRate=" + this.lossRate + ", winCount=" + this.winCount + ", lossCount=" + this.lossCount + ", winRatio=" + this.winRatio + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.winRate);
        parcel.writeString(this.lossRate);
        parcel.writeString(this.winCount);
        parcel.writeString(this.lossCount);
        parcel.writeFloat(this.winRatio);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.BotWinLossRateData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BotWinLossRateData> serializer() {
            return BotWinLossRateData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BotWinLossRateData(int i, String str, String str2, String str3, String str4, float f, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, BotWinLossRateData$$serializer.INSTANCE.getDescriptor());
        }
        this.winRate = str;
        this.lossRate = str2;
        this.winCount = str3;
        this.lossCount = str4;
        this.winRatio = f;
    }

    public static final /* synthetic */ void copydefault(BotWinLossRateData botWinLossRateData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, botWinLossRateData.winRate);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, botWinLossRateData.lossRate);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, botWinLossRateData.winCount);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, botWinLossRateData.lossCount);
        compositeEncoder.encodeFloatElement(serialDescriptor, 4, botWinLossRateData.winRatio);
    }

    public BotWinLossRateData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.winRate = str;
        this.lossRate = str2;
        this.winCount = str3;
        this.lossCount = str4;
        this.winRatio = f;
    }
}
