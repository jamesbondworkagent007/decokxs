package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class CoinStackItemData implements Parcelable {
    private List<String> coins;
    private boolean isShowIvRight;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CoinStackItemData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<CoinStackItemData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinStackItemData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CoinStackItemData(parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinStackItemData[] newArray(int i) {
            return new CoinStackItemData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoinStackItemData() {
        this((String) null, (List) null, false, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.bot.data.CoinStackItemData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CoinStackItemData copy$default(CoinStackItemData coinStackItemData, String str, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = coinStackItemData.title;
        }
        if ((i & 2) != 0) {
            list = coinStackItemData.coins;
        }
        if ((i & 4) != 0) {
            z = coinStackItemData.isShowIvRight;
        }
        return coinStackItemData.copy(str, list, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.coins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isShowIvRight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinStackItemData copy(@NotNull String str, List<String> list, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CoinStackItemData(str, list, z);
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
        if (!(obj instanceof CoinStackItemData)) {
            return false;
        }
        CoinStackItemData coinStackItemData = (CoinStackItemData) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) coinStackItemData.title) && Intrinsics.EZpvd(this.coins, coinStackItemData.coins) && this.isShowIvRight == coinStackItemData.isShowIvRight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getCoins() {
        return this.coins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.title.hashCode();
        List<String> list = this.coins;
        return (((iHashCode * 31) + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.isShowIvRight);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowIvRight() {
        return this.isShowIvRight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoins(List<String> list) {
        this.coins = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowIvRight(boolean z) {
        this.isShowIvRight = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinStackItemData(title=" + this.title + ", coins=" + this.coins + ", isShowIvRight=" + this.isShowIvRight + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeStringList(this.coins);
        parcel.writeInt(this.isShowIvRight ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.data.CoinStackItemData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CoinStackItemData> serializer() {
            return CoinStackItemData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CoinStackItemData(int i, String str, List list, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        this.title = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.coins = null;
        } else {
            this.coins = list;
        }
        if ((i & 4) == 0) {
            this.isShowIvRight = true;
        } else {
            this.isShowIvRight = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(CoinStackItemData coinStackItemData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) coinStackItemData.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, coinStackItemData.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || coinStackItemData.coins != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], coinStackItemData.coins);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && coinStackItemData.isShowIvRight) {
            return;
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 2, coinStackItemData.isShowIvRight);
    }

    public CoinStackItemData(@NotNull String str, List<String> list, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
        this.coins = list;
        this.isShowIvRight = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, boolean):void (m)] (LINE:1258) call: com.okinc.unify_trade.bot.data.CoinStackItemData.<init>(java.lang.String, java.util.List, boolean):void type: THIS */
    public /* synthetic */ CoinStackItemData(String str, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? true : z);
    }
}
