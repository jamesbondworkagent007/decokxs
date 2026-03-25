package com.okinc.assets.api.model.guideboard;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.assets.api.utils.PnlState;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class TickerData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<TickerData> CREATOR = new Creator();
    private final String id;
    private final String name;
    private final String price;
    private final Rate rate;
    private final InstType type;

    public static final class Creator implements Parcelable.Creator<TickerData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TickerData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TickerData(parcel.readString(), (InstType) parcel.readParcelable(TickerData.class.getClassLoader()), parcel.readString(), parcel.readString(), Rate.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TickerData[] newArray(int i) {
            return new TickerData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TickerData copy$default(TickerData tickerData, String str, InstType instType, String str2, String str3, Rate rate, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tickerData.id;
        }
        if ((i & 2) != 0) {
            instType = tickerData.type;
        }
        InstType instType2 = instType;
        if ((i & 4) != 0) {
            str2 = tickerData.name;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            str3 = tickerData.price;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            rate = tickerData.rate;
        }
        return tickerData.copy(str, instType2, str4, str5, rate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InstType component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Rate component5() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TickerData copy(@NotNull String str, @NotNull InstType instType, @NotNull String str2, @NotNull String str3, @NotNull Rate rate) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(instType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(rate, "");
        return new TickerData(str, instType, str2, str3, rate);
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
        if (!(obj instanceof TickerData)) {
            return false;
        }
        TickerData tickerData = (TickerData) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) tickerData.id) && this.type == tickerData.type && Intrinsics.EZpvd((Object) this.name, (Object) tickerData.name) && Intrinsics.EZpvd((Object) this.price, (Object) tickerData.price) && Intrinsics.EZpvd(this.rate, tickerData.rate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Rate getRate() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InstType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.type.hashCode()) * 31) + this.name.hashCode()) * 31) + this.price.hashCode()) * 31) + this.rate.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TickerData(id=" + this.id + ", type=" + this.type + ", name=" + this.name + ", price=" + this.price + ", rate=" + this.rate + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        parcel.writeParcelable(this.type, i);
        parcel.writeString(this.name);
        parcel.writeString(this.price);
        this.rate.writeToParcel(parcel, i);
    }

    public TickerData(@NotNull String str, @NotNull InstType instType, @NotNull String str2, @NotNull String str3, @NotNull Rate rate) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(instType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(rate, "");
        this.id = str;
        this.type = instType;
        this.name = str2;
        this.price = str3;
        this.rate = rate;
    }

    public static final class Rate implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Rate> CREATOR = new Creator();
        private final PnlState state;
        private final BigDecimal value;

        public static final class Creator implements Parcelable.Creator<Rate> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Rate createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Rate((BigDecimal) parcel.readSerializable(), PnlState.valueOf(parcel.readString()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Rate[] newArray(int i) {
                return new Rate[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Rate copy$default(Rate rate, BigDecimal bigDecimal, PnlState pnlState, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = rate.value;
            }
            if ((i & 2) != 0) {
                pnlState = rate.state;
            }
            return rate.copy(bigDecimal, pnlState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BigDecimal component1() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PnlState component2() {
            return this.state;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Rate copy(@NotNull BigDecimal bigDecimal, @NotNull PnlState pnlState) {
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            Intrinsics.checkNotNullParameter(pnlState, "");
            return new Rate(bigDecimal, pnlState);
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
            if (!(obj instanceof Rate)) {
                return false;
            }
            Rate rate = (Rate) obj;
            return Intrinsics.EZpvd(this.value, rate.value) && this.state == rate.state;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PnlState getState() {
            return this.state;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BigDecimal getValue() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.value.hashCode() * 31) + this.state.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Rate(value=" + this.value + ", state=" + this.state + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeSerializable(this.value);
            parcel.writeString(this.state.name());
        }

        public Rate(@NotNull BigDecimal bigDecimal, @NotNull PnlState pnlState) {
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            Intrinsics.checkNotNullParameter(pnlState, "");
            this.value = bigDecimal;
            this.state = pnlState;
        }
    }
}
