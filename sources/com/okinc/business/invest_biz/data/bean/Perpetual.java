package com.okinc.business.invest_biz.data.bean;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class Perpetual implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final String leverage;
    private final List<InvestBaseDefiTokenInfo> margin;
    private final String pnl;
    private final List<InvestBaseDefiTokenInfo> position;
    private final int side;
    private final String tradePair;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Perpetual> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Perpetual> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Perpetual createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(InvestBaseDefiTokenInfo.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i4 = parcel.readInt();
                arrayList2 = new ArrayList(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    arrayList2.add(InvestBaseDefiTokenInfo.CREATOR.createFromParcel(parcel));
                }
            }
            return new Perpetual(i, string, string2, string3, arrayList, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Perpetual[] newArray(int i) {
            return new Perpetual[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Perpetual() {
        this(0, (String) null, (String) null, (String) null, (List) null, (List) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.invest_biz.data.bean.Perpetual */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Perpetual copy$default(Perpetual perpetual, int i, String str, String str2, String str3, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = perpetual.side;
        }
        if ((i2 & 2) != 0) {
            str = perpetual.leverage;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = perpetual.pnl;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = perpetual.tradePair;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            list = perpetual.margin;
        }
        List list3 = list;
        if ((i2 & 32) != 0) {
            list2 = perpetual.position;
        }
        return perpetual.copy(i, str4, str5, str6, list3, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.leverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tradePair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestBaseDefiTokenInfo> component5() {
        return this.margin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestBaseDefiTokenInfo> component6() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Perpetual copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, List<InvestBaseDefiTokenInfo> list, List<InvestBaseDefiTokenInfo> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new Perpetual(i, str, str2, str3, list, list2);
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
        if (!(obj instanceof Perpetual)) {
            return false;
        }
        Perpetual perpetual = (Perpetual) obj;
        return this.side == perpetual.side && Intrinsics.EZpvd((Object) this.leverage, (Object) perpetual.leverage) && Intrinsics.EZpvd((Object) this.pnl, (Object) perpetual.pnl) && Intrinsics.EZpvd((Object) this.tradePair, (Object) perpetual.tradePair) && Intrinsics.EZpvd(this.margin, perpetual.margin) && Intrinsics.EZpvd(this.position, perpetual.position);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeverage() {
        return this.leverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestBaseDefiTokenInfo> getMargin() {
        return this.margin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnl() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestBaseDefiTokenInfo> getPosition() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradePair() {
        return this.tradePair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.side);
        int iHashCode2 = this.leverage.hashCode();
        int iHashCode3 = this.pnl.hashCode();
        int iHashCode4 = this.tradePair.hashCode();
        List<InvestBaseDefiTokenInfo> list = this.margin;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        List<InvestBaseDefiTokenInfo> list2 = this.position;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Perpetual(side=" + this.side + ", leverage=" + this.leverage + ", pnl=" + this.pnl + ", tradePair=" + this.tradePair + ", margin=" + this.margin + ", position=" + this.position + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.side);
        parcel.writeString(this.leverage);
        parcel.writeString(this.pnl);
        parcel.writeString(this.tradePair);
        List<InvestBaseDefiTokenInfo> list = this.margin;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<InvestBaseDefiTokenInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        List<InvestBaseDefiTokenInfo> list2 = this.position;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<InvestBaseDefiTokenInfo> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.Perpetual.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Perpetual> serializer() {
            return Perpetual$$serializer.INSTANCE;
        }
    }

    static {
        InvestBaseDefiTokenInfo$$serializer investBaseDefiTokenInfo$$serializer = InvestBaseDefiTokenInfo$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, new ArrayListSerializer(investBaseDefiTokenInfo$$serializer), new ArrayListSerializer(investBaseDefiTokenInfo$$serializer)};
    }

    public /* synthetic */ Perpetual(int i, int i2, String str, String str2, String str3, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        this.side = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.leverage = "";
        } else {
            this.leverage = str;
        }
        if ((i & 4) == 0) {
            this.pnl = "";
        } else {
            this.pnl = str2;
        }
        if ((i & 8) == 0) {
            this.tradePair = "";
        } else {
            this.tradePair = str3;
        }
        if ((i & 16) == 0) {
            this.margin = null;
        } else {
            this.margin = list;
        }
        if ((i & 32) == 0) {
            this.position = null;
        } else {
            this.position = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(Perpetual perpetual, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || perpetual.side != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, perpetual.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) perpetual.leverage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, perpetual.leverage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) perpetual.pnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, perpetual.pnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) perpetual.tradePair, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, perpetual.tradePair);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || perpetual.margin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], perpetual.margin);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && perpetual.position == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], perpetual.position);
    }

    public Perpetual(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, List<InvestBaseDefiTokenInfo> list, List<InvestBaseDefiTokenInfo> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.side = i;
        this.leverage = str;
        this.pnl = str2;
        this.tradePair = str3;
        this.margin = list;
        this.position = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r11v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001b: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r9v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0023: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r10v0 java.util.List))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo>, java.util.List<com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo>):void (m)] (LINE:222) call: com.okinc.business.invest_biz.data.bean.Perpetual.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ Perpetual(int i, String str, String str2, String str3, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) == 0 ? str3 : "", (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : list2);
    }
}
