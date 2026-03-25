package com.okinc.tradeshare.api;

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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class TradeTickerChartEntry implements Parcelable {
    public static final int $stable = 0;
    private final String closePrice;
    private final String timestamp;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TradeTickerChartEntry> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TradeTickerChartEntry> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeTickerChartEntry createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TradeTickerChartEntry(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeTickerChartEntry[] newArray(int i) {
            return new TradeTickerChartEntry[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TradeTickerChartEntry copy$default(TradeTickerChartEntry tradeTickerChartEntry, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tradeTickerChartEntry.timestamp;
        }
        if ((i & 2) != 0) {
            str2 = tradeTickerChartEntry.closePrice;
        }
        return tradeTickerChartEntry.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.closePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeTickerChartEntry copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TradeTickerChartEntry(str, str2);
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
        if (!(obj instanceof TradeTickerChartEntry)) {
            return false;
        }
        TradeTickerChartEntry tradeTickerChartEntry = (TradeTickerChartEntry) obj;
        return Intrinsics.EZpvd((Object) this.timestamp, (Object) tradeTickerChartEntry.timestamp) && Intrinsics.EZpvd((Object) this.closePrice, (Object) tradeTickerChartEntry.closePrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClosePrice() {
        return this.closePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.timestamp.hashCode() * 31) + this.closePrice.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeTickerChartEntry(timestamp=" + this.timestamp + ", closePrice=" + this.closePrice + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.timestamp);
        parcel.writeString(this.closePrice);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradeshare.api.TradeTickerChartEntry.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeTickerChartEntry> serializer() {
            return TradeTickerChartEntry$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeTickerChartEntry(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, TradeTickerChartEntry$$serializer.INSTANCE.getDescriptor());
        }
        this.timestamp = str;
        this.closePrice = str2;
    }

    public static final /* synthetic */ void write$Self$OKTrade_trade_api(TradeTickerChartEntry tradeTickerChartEntry, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, tradeTickerChartEntry.timestamp);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tradeTickerChartEntry.closePrice);
    }

    public TradeTickerChartEntry(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.timestamp = str;
        this.closePrice = str2;
    }
}
