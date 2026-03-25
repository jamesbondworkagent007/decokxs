package com.okinc.unify_trade.bot.list;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class SortOption implements Parcelable {
    public static final int $stable = 0;
    private final SortOrder order;
    private final SortType type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SortOption> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {EnumsKt.createSimpleEnumSerializer("com.okinc.unify_trade.bot.list.SortType", SortType.values()), EnumsKt.createSimpleEnumSerializer("com.okinc.unify_trade.bot.list.SortOrder", SortOrder.values())};

    public static final class Creator implements Parcelable.Creator<SortOption> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SortOption createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SortOption(SortType.valueOf(parcel.readString()), SortOrder.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SortOption[] newArray(int i) {
            return new SortOption[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SortOption() {
        this((SortType) null, (SortOrder) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SortOption copy$default(SortOption sortOption, SortType sortType, SortOrder sortOrder, int i, Object obj) {
        if ((i & 1) != 0) {
            sortType = sortOption.type;
        }
        if ((i & 2) != 0) {
            sortOrder = sortOption.order;
        }
        return sortOption.copy(sortType, sortOrder);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SortType component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SortOrder component2() {
        return this.order;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SortOption copy(@NotNull SortType sortType, @NotNull SortOrder sortOrder) {
        Intrinsics.checkNotNullParameter(sortType, "");
        Intrinsics.checkNotNullParameter(sortOrder, "");
        return new SortOption(sortType, sortOrder);
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
        if (!(obj instanceof SortOption)) {
            return false;
        }
        SortOption sortOption = (SortOption) obj;
        return this.type == sortOption.type && this.order == sortOption.order;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SortOrder getOrder() {
        return this.order;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SortType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.type.hashCode() * 31) + this.order.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SortOption(type=" + this.type + ", order=" + this.order + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type.name());
        parcel.writeString(this.order.name());
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.list.SortOption.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SortOption> serializer() {
            return SortOption$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SortOption(int i, SortType sortType, SortOrder sortOrder, SerializationConstructorMarker serializationConstructorMarker) {
        this.type = (i & 1) == 0 ? SortType.CREATE_TIME : sortType;
        if ((i & 2) == 0) {
            this.order = SortOrder.DESCENDING;
        } else {
            this.order = sortOrder;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SortOption sortOption, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || sortOption.type != SortType.CREATE_TIME) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], sortOption.type);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && sortOption.order == SortOrder.DESCENDING) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], sortOption.order);
    }

    public SortOption(@NotNull SortType sortType, @NotNull SortOrder sortOrder) {
        Intrinsics.checkNotNullParameter(sortType, "");
        Intrinsics.checkNotNullParameter(sortOrder, "");
        this.type = sortType;
        this.order = sortOrder;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:com.okinc.unify_trade.bot.list.SortType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.unify_trade.bot.list.SortType:0x0004: SGET  A[WRAPPED] (LINE:31) com.okinc.unify_trade.bot.list.SortType.CREATE_TIME com.okinc.unify_trade.bot.list.SortType) : (r1v0 com.okinc.unify_trade.bot.list.SortType))
  (wrap:com.okinc.unify_trade.bot.list.SortOrder:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.unify_trade.bot.list.SortOrder:0x000a: SGET  A[WRAPPED] (LINE:32) com.okinc.unify_trade.bot.list.SortOrder.DESCENDING com.okinc.unify_trade.bot.list.SortOrder) : (r2v0 com.okinc.unify_trade.bot.list.SortOrder))
 A[MD:(com.okinc.unify_trade.bot.list.SortType, com.okinc.unify_trade.bot.list.SortOrder):void (m)] (LINE:30) call: com.okinc.unify_trade.bot.list.SortOption.<init>(com.okinc.unify_trade.bot.list.SortType, com.okinc.unify_trade.bot.list.SortOrder):void type: THIS */
    public /* synthetic */ SortOption(SortType sortType, SortOrder sortOrder, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SortType.CREATE_TIME : sortType, (i & 2) != 0 ? SortOrder.DESCENDING : sortOrder);
    }
}
