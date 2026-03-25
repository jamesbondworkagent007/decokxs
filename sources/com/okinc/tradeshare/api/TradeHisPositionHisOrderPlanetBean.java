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
public final class TradeHisPositionHisOrderPlanetBean implements Parcelable {
    public static final int $stable = 0;
    private final String fillPx;
    private final String side;
    private final String timestamp;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TradeHisPositionHisOrderPlanetBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TradeHisPositionHisOrderPlanetBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeHisPositionHisOrderPlanetBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TradeHisPositionHisOrderPlanetBean(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeHisPositionHisOrderPlanetBean[] newArray(int i) {
            return new TradeHisPositionHisOrderPlanetBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TradeHisPositionHisOrderPlanetBean copy$default(TradeHisPositionHisOrderPlanetBean tradeHisPositionHisOrderPlanetBean, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tradeHisPositionHisOrderPlanetBean.timestamp;
        }
        if ((i & 2) != 0) {
            str2 = tradeHisPositionHisOrderPlanetBean.side;
        }
        if ((i & 4) != 0) {
            str3 = tradeHisPositionHisOrderPlanetBean.fillPx;
        }
        return tradeHisPositionHisOrderPlanetBean.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fillPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeHisPositionHisOrderPlanetBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new TradeHisPositionHisOrderPlanetBean(str, str2, str3);
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
        if (!(obj instanceof TradeHisPositionHisOrderPlanetBean)) {
            return false;
        }
        TradeHisPositionHisOrderPlanetBean tradeHisPositionHisOrderPlanetBean = (TradeHisPositionHisOrderPlanetBean) obj;
        return Intrinsics.EZpvd((Object) this.timestamp, (Object) tradeHisPositionHisOrderPlanetBean.timestamp) && Intrinsics.EZpvd((Object) this.side, (Object) tradeHisPositionHisOrderPlanetBean.side) && Intrinsics.EZpvd((Object) this.fillPx, (Object) tradeHisPositionHisOrderPlanetBean.fillPx);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFillPx() {
        return this.fillPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.timestamp.hashCode() * 31) + this.side.hashCode()) * 31) + this.fillPx.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeHisPositionHisOrderPlanetBean(timestamp=" + this.timestamp + ", side=" + this.side + ", fillPx=" + this.fillPx + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.timestamp);
        parcel.writeString(this.side);
        parcel.writeString(this.fillPx);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradeshare.api.TradeHisPositionHisOrderPlanetBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeHisPositionHisOrderPlanetBean> serializer() {
            return TradeHisPositionHisOrderPlanetBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeHisPositionHisOrderPlanetBean(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, TradeHisPositionHisOrderPlanetBean$$serializer.INSTANCE.getDescriptor());
        }
        this.timestamp = str;
        this.side = str2;
        this.fillPx = str3;
    }

    public static final /* synthetic */ void write$Self$OKTrade_trade_api(TradeHisPositionHisOrderPlanetBean tradeHisPositionHisOrderPlanetBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, tradeHisPositionHisOrderPlanetBean.timestamp);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tradeHisPositionHisOrderPlanetBean.side);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, tradeHisPositionHisOrderPlanetBean.fillPx);
    }

    public TradeHisPositionHisOrderPlanetBean(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.timestamp = str;
        this.side = str2;
        this.fillPx = str3;
    }
}
