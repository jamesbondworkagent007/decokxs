package com.okinc.unify_trade.biz.bot;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class EarnPayoutHistoryResponseDto implements Parcelable {
    private final String baseTotalProfit;
    private final int currentPage;
    private final List<EarnPayoutItemDto> list;
    private final int pageLength;
    private final String quoteTotalProfit;
    private final int total;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EarnPayoutHistoryResponseDto> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(EarnPayoutItemDto$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<EarnPayoutHistoryResponseDto> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarnPayoutHistoryResponseDto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i4 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = 0; i5 != i4; i5++) {
                arrayList.add(EarnPayoutItemDto.CREATOR.createFromParcel(parcel));
            }
            return new EarnPayoutHistoryResponseDto(i, i2, i3, string, string2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarnPayoutHistoryResponseDto[] newArray(int i) {
            return new EarnPayoutHistoryResponseDto[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EarnPayoutHistoryResponseDto() {
        this(0, 0, 0, (String) null, (String) null, (List) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.unify_trade.biz.bot.EarnPayoutHistoryResponseDto */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EarnPayoutHistoryResponseDto copy$default(EarnPayoutHistoryResponseDto earnPayoutHistoryResponseDto, int i, int i2, int i3, String str, String str2, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = earnPayoutHistoryResponseDto.currentPage;
        }
        if ((i4 & 2) != 0) {
            i2 = earnPayoutHistoryResponseDto.pageLength;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = earnPayoutHistoryResponseDto.total;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            str = earnPayoutHistoryResponseDto.baseTotalProfit;
        }
        String str3 = str;
        if ((i4 & 16) != 0) {
            str2 = earnPayoutHistoryResponseDto.quoteTotalProfit;
        }
        String str4 = str2;
        if ((i4 & 32) != 0) {
            list = earnPayoutHistoryResponseDto.list;
        }
        return earnPayoutHistoryResponseDto.copy(i, i5, i6, str3, str4, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.currentPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.pageLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.baseTotalProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.quoteTotalProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EarnPayoutItemDto> component6() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnPayoutHistoryResponseDto copy(int i, int i2, int i3, @NotNull String str, @NotNull String str2, @NotNull List<EarnPayoutItemDto> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new EarnPayoutHistoryResponseDto(i, i2, i3, str, str2, list);
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
        if (!(obj instanceof EarnPayoutHistoryResponseDto)) {
            return false;
        }
        EarnPayoutHistoryResponseDto earnPayoutHistoryResponseDto = (EarnPayoutHistoryResponseDto) obj;
        return this.currentPage == earnPayoutHistoryResponseDto.currentPage && this.pageLength == earnPayoutHistoryResponseDto.pageLength && this.total == earnPayoutHistoryResponseDto.total && Intrinsics.EZpvd((Object) this.baseTotalProfit, (Object) earnPayoutHistoryResponseDto.baseTotalProfit) && Intrinsics.EZpvd((Object) this.quoteTotalProfit, (Object) earnPayoutHistoryResponseDto.quoteTotalProfit) && Intrinsics.EZpvd(this.list, earnPayoutHistoryResponseDto.list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseTotalProfit() {
        return this.baseTotalProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EarnPayoutItemDto> getList() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageLength() {
        return this.pageLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteTotalProfit() {
        return this.quoteTotalProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTotal() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((Integer.hashCode(this.currentPage) * 31) + Integer.hashCode(this.pageLength)) * 31) + Integer.hashCode(this.total)) * 31) + this.baseTotalProfit.hashCode()) * 31) + this.quoteTotalProfit.hashCode()) * 31) + this.list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EarnPayoutHistoryResponseDto(currentPage=" + this.currentPage + ", pageLength=" + this.pageLength + ", total=" + this.total + ", baseTotalProfit=" + this.baseTotalProfit + ", quoteTotalProfit=" + this.quoteTotalProfit + ", list=" + this.list + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.currentPage);
        parcel.writeInt(this.pageLength);
        parcel.writeInt(this.total);
        parcel.writeString(this.baseTotalProfit);
        parcel.writeString(this.quoteTotalProfit);
        List<EarnPayoutItemDto> list = this.list;
        parcel.writeInt(list.size());
        Iterator<EarnPayoutItemDto> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.bot.EarnPayoutHistoryResponseDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EarnPayoutHistoryResponseDto> serializer() {
            return EarnPayoutHistoryResponseDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EarnPayoutHistoryResponseDto(int i, int i2, int i3, int i4, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.currentPage = 0;
        } else {
            this.currentPage = i2;
        }
        if ((i & 2) == 0) {
            this.pageLength = 0;
        } else {
            this.pageLength = i3;
        }
        if ((i & 4) == 0) {
            this.total = 0;
        } else {
            this.total = i4;
        }
        if ((i & 8) == 0) {
            this.baseTotalProfit = "";
        } else {
            this.baseTotalProfit = str;
        }
        if ((i & 16) == 0) {
            this.quoteTotalProfit = "";
        } else {
            this.quoteTotalProfit = str2;
        }
        if ((i & 32) == 0) {
            this.list = yDY.AhwBna();
        } else {
            this.list = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(EarnPayoutHistoryResponseDto earnPayoutHistoryResponseDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || earnPayoutHistoryResponseDto.currentPage != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, earnPayoutHistoryResponseDto.currentPage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || earnPayoutHistoryResponseDto.pageLength != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, earnPayoutHistoryResponseDto.pageLength);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || earnPayoutHistoryResponseDto.total != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, earnPayoutHistoryResponseDto.total);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) earnPayoutHistoryResponseDto.baseTotalProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, earnPayoutHistoryResponseDto.baseTotalProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) earnPayoutHistoryResponseDto.quoteTotalProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, earnPayoutHistoryResponseDto.quoteTotalProfit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd(earnPayoutHistoryResponseDto.list, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], earnPayoutHistoryResponseDto.list);
    }

    public EarnPayoutHistoryResponseDto(int i, int i2, int i3, @NotNull String str, @NotNull String str2, @NotNull List<EarnPayoutItemDto> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.currentPage = i;
        this.pageLength = i2;
        this.total = i3;
        this.baseTotalProfit = str;
        this.quoteTotalProfit = str2;
        this.list = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0034: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0008: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r6v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000f: ARITH (r11v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r7v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0025: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0029: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:18)) : (r10v0 java.util.List))
 A[MD:(int, int, int, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.bot.EarnPayoutItemDto>):void (m)] (LINE:12) call: com.okinc.unify_trade.biz.bot.EarnPayoutHistoryResponseDto.<init>(int, int, int, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ EarnPayoutHistoryResponseDto(int i, int i2, int i3, String str, String str2, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) == 0 ? i3 : 0, (i4 & 8) != 0 ? "" : str, (i4 & 16) != 0 ? "" : str2, (i4 & 32) != 0 ? yDY.AhwBna() : list);
    }
}
