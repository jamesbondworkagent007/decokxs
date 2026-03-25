package com.okinc.unify_trade.bot.list;

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
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class FilterState implements Parcelable {
    private final CardStyle cardStyle;
    private final String selectedBotTypeId;
    private final List<String> selectedCurrencyIds;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FilterState> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE), null, EnumsKt.createSimpleEnumSerializer("com.okinc.unify_trade.bot.list.CardStyle", CardStyle.values())};

    public static final class Creator implements Parcelable.Creator<FilterState> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilterState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FilterState(parcel.createStringArrayList(), parcel.readString(), CardStyle.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilterState[] newArray(int i) {
            return new FilterState[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FilterState() {
        this((List) null, (String) null, (CardStyle) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.bot.list.FilterState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FilterState copy$default(FilterState filterState, List list, String str, CardStyle cardStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            list = filterState.selectedCurrencyIds;
        }
        if ((i & 2) != 0) {
            str = filterState.selectedBotTypeId;
        }
        if ((i & 4) != 0) {
            cardStyle = filterState.cardStyle;
        }
        return filterState.copy(list, str, cardStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.selectedCurrencyIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.selectedBotTypeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardStyle component3() {
        return this.cardStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FilterState copy(@NotNull List<String> list, @NotNull String str, @NotNull CardStyle cardStyle) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cardStyle, "");
        return new FilterState(list, str, cardStyle);
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
        if (!(obj instanceof FilterState)) {
            return false;
        }
        FilterState filterState = (FilterState) obj;
        return Intrinsics.EZpvd(this.selectedCurrencyIds, filterState.selectedCurrencyIds) && Intrinsics.EZpvd((Object) this.selectedBotTypeId, (Object) filterState.selectedBotTypeId) && this.cardStyle == filterState.cardStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardStyle getCardStyle() {
        return this.cardStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSelectedBotTypeId() {
        return this.selectedBotTypeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSelectedCurrencyIds() {
        return this.selectedCurrencyIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.selectedCurrencyIds.hashCode() * 31) + this.selectedBotTypeId.hashCode()) * 31) + this.cardStyle.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FilterState(selectedCurrencyIds=" + this.selectedCurrencyIds + ", selectedBotTypeId=" + this.selectedBotTypeId + ", cardStyle=" + this.cardStyle + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.selectedCurrencyIds);
        parcel.writeString(this.selectedBotTypeId);
        parcel.writeString(this.cardStyle.name());
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.list.FilterState.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FilterState> serializer() {
            return FilterState$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FilterState(int i, List list, String str, CardStyle cardStyle, SerializationConstructorMarker serializationConstructorMarker) {
        this.selectedCurrencyIds = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.selectedBotTypeId = "all_bot";
        } else {
            this.selectedBotTypeId = str;
        }
        if ((i & 4) == 0) {
            this.cardStyle = CardStyle.DETAILED;
        } else {
            this.cardStyle = cardStyle;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(FilterState filterState, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(filterState.selectedCurrencyIds, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], filterState.selectedCurrencyIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) filterState.selectedBotTypeId, (Object) "all_bot")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, filterState.selectedBotTypeId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && filterState.cardStyle == CardStyle.DETAILED) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], filterState.cardStyle);
    }

    public FilterState(@NotNull List<String> list, @NotNull String str, @NotNull CardStyle cardStyle) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cardStyle, "");
        this.selectedCurrencyIds = list;
        this.selectedBotTypeId = str;
        this.cardStyle = cardStyle;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:39)) : (r1v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("all_bot") : (r2v0 java.lang.String))
  (wrap:com.okinc.unify_trade.bot.list.CardStyle:?: TERNARY null = ((wrap:int:0x000e: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.unify_trade.bot.list.CardStyle:0x0012: SGET  A[WRAPPED] (LINE:41) com.okinc.unify_trade.bot.list.CardStyle.DETAILED com.okinc.unify_trade.bot.list.CardStyle) : (r3v0 com.okinc.unify_trade.bot.list.CardStyle))
 A[MD:(java.util.List<java.lang.String>, java.lang.String, com.okinc.unify_trade.bot.list.CardStyle):void (m)] (LINE:38) call: com.okinc.unify_trade.bot.list.FilterState.<init>(java.util.List, java.lang.String, com.okinc.unify_trade.bot.list.CardStyle):void type: THIS */
    public /* synthetic */ FilterState(List list, String str, CardStyle cardStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? "all_bot" : str, (i & 4) != 0 ? CardStyle.DETAILED : cardStyle);
    }
}
