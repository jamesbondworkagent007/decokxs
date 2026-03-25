package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
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
import kotlinx.serialization.internal.StringSerializer;
import o.xVJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class SimpleOptionProduct implements Parcelable {
    private final SimpleOptionCartItem auto;
    private final SimpleOptionCartItem manual;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SimpleOptionProduct> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SimpleOptionProduct> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleOptionProduct createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SimpleOptionProduct(parcel.readInt() == 0 ? null : SimpleOptionCartItem.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SimpleOptionCartItem.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleOptionProduct[] newArray(int i) {
            return new SimpleOptionProduct[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SimpleOptionProduct() {
        this((SimpleOptionCartItem) null, (SimpleOptionCartItem) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SimpleOptionProduct copy$default(SimpleOptionProduct simpleOptionProduct, SimpleOptionCartItem simpleOptionCartItem, SimpleOptionCartItem simpleOptionCartItem2, int i, Object obj) {
        if ((i & 1) != 0) {
            simpleOptionCartItem = simpleOptionProduct.manual;
        }
        if ((i & 2) != 0) {
            simpleOptionCartItem2 = simpleOptionProduct.auto;
        }
        return simpleOptionProduct.copy(simpleOptionCartItem, simpleOptionCartItem2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleOptionCartItem component1() {
        return this.manual;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleOptionCartItem component2() {
        return this.auto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleOptionProduct copy(SimpleOptionCartItem simpleOptionCartItem, SimpleOptionCartItem simpleOptionCartItem2) {
        return new SimpleOptionProduct(simpleOptionCartItem, simpleOptionCartItem2);
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
        if (!(obj instanceof SimpleOptionProduct)) {
            return false;
        }
        SimpleOptionProduct simpleOptionProduct = (SimpleOptionProduct) obj;
        return Intrinsics.EZpvd(this.manual, simpleOptionProduct.manual) && Intrinsics.EZpvd(this.auto, simpleOptionProduct.auto);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleOptionCartItem getAuto() {
        return this.auto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleOptionCartItem getManual() {
        return this.manual;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        SimpleOptionCartItem simpleOptionCartItem = this.manual;
        int iHashCode = simpleOptionCartItem == null ? 0 : simpleOptionCartItem.hashCode();
        SimpleOptionCartItem simpleOptionCartItem2 = this.auto;
        return (iHashCode * 31) + (simpleOptionCartItem2 != null ? simpleOptionCartItem2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SimpleOptionProduct(manual=" + this.manual + ", auto=" + this.auto + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        SimpleOptionCartItem simpleOptionCartItem = this.manual;
        if (simpleOptionCartItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            simpleOptionCartItem.writeToParcel(parcel, i);
        }
        SimpleOptionCartItem simpleOptionCartItem2 = this.auto;
        if (simpleOptionCartItem2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            simpleOptionCartItem2.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ SimpleOptionProduct(int i, SimpleOptionCartItem simpleOptionCartItem, SimpleOptionCartItem simpleOptionCartItem2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.manual = null;
        } else {
            this.manual = simpleOptionCartItem;
        }
        if ((i & 2) == 0) {
            this.auto = null;
        } else {
            this.auto = simpleOptionCartItem2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SimpleOptionProduct simpleOptionProduct, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || simpleOptionProduct.manual != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, SimpleOptionProduct$SimpleOptionCartItem$$serializer.INSTANCE, simpleOptionProduct.manual);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && simpleOptionProduct.auto == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, SimpleOptionProduct$SimpleOptionCartItem$$serializer.INSTANCE, simpleOptionProduct.auto);
    }

    public SimpleOptionProduct(SimpleOptionCartItem simpleOptionCartItem, SimpleOptionCartItem simpleOptionCartItem2) {
        this.manual = simpleOptionCartItem;
        this.auto = simpleOptionCartItem2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.unify_trade.biz.SimpleOptionProduct$SimpleOptionCartItem:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.SimpleOptionProduct$SimpleOptionCartItem) : (r2v0 com.okinc.unify_trade.biz.SimpleOptionProduct$SimpleOptionCartItem))
  (wrap:com.okinc.unify_trade.biz.SimpleOptionProduct$SimpleOptionCartItem:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.SimpleOptionProduct$SimpleOptionCartItem) : (r3v0 com.okinc.unify_trade.biz.SimpleOptionProduct$SimpleOptionCartItem))
 A[MD:(com.okinc.unify_trade.biz.SimpleOptionProduct$SimpleOptionCartItem, com.okinc.unify_trade.biz.SimpleOptionProduct$SimpleOptionCartItem):void (m)] (LINE:13) call: com.okinc.unify_trade.biz.SimpleOptionProduct.<init>(com.okinc.unify_trade.biz.SimpleOptionProduct$SimpleOptionCartItem, com.okinc.unify_trade.biz.SimpleOptionProduct$SimpleOptionCartItem):void type: THIS */
    public /* synthetic */ SimpleOptionProduct(SimpleOptionCartItem simpleOptionCartItem, SimpleOptionCartItem simpleOptionCartItem2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : simpleOptionCartItem, (i & 2) != 0 ? null : simpleOptionCartItem2);
    }

    @Serializable
    public static final class SimpleOptionCartItem implements Parcelable {
        private static final KSerializer<Object>[] $childSerializers;
        private List<SimpleOptionProductItemPo> C;
        private List<SimpleOptionProductItemPo> P;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<SimpleOptionCartItem> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<SimpleOptionCartItem> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SimpleOptionCartItem createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "");
                ArrayList arrayList2 = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(SimpleOptionProductItemPo.CREATOR.createFromParcel(parcel));
                    }
                }
                if (parcel.readInt() != 0) {
                    int i3 = parcel.readInt();
                    arrayList2 = new ArrayList(i3);
                    for (int i4 = 0; i4 != i3; i4++) {
                        arrayList2.add(SimpleOptionProductItemPo.CREATOR.createFromParcel(parcel));
                    }
                }
                return new SimpleOptionCartItem(arrayList, arrayList2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SimpleOptionCartItem[] newArray(int i) {
                return new SimpleOptionCartItem[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SimpleOptionCartItem() {
            this((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.SimpleOptionProduct$SimpleOptionCartItem */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SimpleOptionCartItem copy$default(SimpleOptionCartItem simpleOptionCartItem, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = simpleOptionCartItem.C;
            }
            if ((i & 2) != 0) {
                list2 = simpleOptionCartItem.P;
            }
            return simpleOptionCartItem.copy(list, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<SimpleOptionProductItemPo> component1() {
            return this.C;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<SimpleOptionProductItemPo> component2() {
            return this.P;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SimpleOptionCartItem copy(List<SimpleOptionProductItemPo> list, List<SimpleOptionProductItemPo> list2) {
            return new SimpleOptionCartItem(list, list2);
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
            if (!(obj instanceof SimpleOptionCartItem)) {
                return false;
            }
            SimpleOptionCartItem simpleOptionCartItem = (SimpleOptionCartItem) obj;
            return Intrinsics.EZpvd(this.C, simpleOptionCartItem.C) && Intrinsics.EZpvd(this.P, simpleOptionCartItem.P);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<SimpleOptionProductItemPo> getC() {
            return this.C;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<SimpleOptionProductItemPo> getP() {
            return this.P;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            List<SimpleOptionProductItemPo> list = this.C;
            int iHashCode = list == null ? 0 : list.hashCode();
            List<SimpleOptionProductItemPo> list2 = this.P;
            return (iHashCode * 31) + (list2 != null ? list2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setC(List<SimpleOptionProductItemPo> list) {
            this.C = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setP(List<SimpleOptionProductItemPo> list) {
            this.P = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SimpleOptionCartItem(C=" + this.C + ", P=" + this.P + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            List<SimpleOptionProductItemPo> list = this.C;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                Iterator<SimpleOptionProductItemPo> it = list.iterator();
                while (it.hasNext()) {
                    it.next().writeToParcel(parcel, i);
                }
            }
            List<SimpleOptionProductItemPo> list2 = this.P;
            if (list2 == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<SimpleOptionProductItemPo> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SimpleOptionProduct.SimpleOptionCartItem.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SimpleOptionCartItem> serializer() {
                return SimpleOptionProduct$SimpleOptionCartItem$$serializer.INSTANCE;
            }
        }

        static {
            SimpleOptionProduct$SimpleOptionProductItemPo$$serializer simpleOptionProduct$SimpleOptionProductItemPo$$serializer = SimpleOptionProduct$SimpleOptionProductItemPo$$serializer.INSTANCE;
            $childSerializers = new KSerializer[]{new ArrayListSerializer(simpleOptionProduct$SimpleOptionProductItemPo$$serializer), new ArrayListSerializer(simpleOptionProduct$SimpleOptionProductItemPo$$serializer)};
        }

        public /* synthetic */ SimpleOptionCartItem(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.C = null;
            } else {
                this.C = list;
            }
            if ((i & 2) == 0) {
                this.P = null;
            } else {
                this.P = list2;
            }
        }

        public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SimpleOptionCartItem simpleOptionCartItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || simpleOptionCartItem.C != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], simpleOptionCartItem.C);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && simpleOptionCartItem.P == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], simpleOptionCartItem.P);
        }

        public SimpleOptionCartItem(List<SimpleOptionProductItemPo> list, List<SimpleOptionProductItemPo> list2) {
            this.C = list;
            this.P = list2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.util.List<com.okinc.unify_trade.biz.SimpleOptionProduct$SimpleOptionProductItemPo>, java.util.List<com.okinc.unify_trade.biz.SimpleOptionProduct$SimpleOptionProductItemPo>):void (m)] (LINE:21) call: com.okinc.unify_trade.biz.SimpleOptionProduct.SimpleOptionCartItem.<init>(java.util.List, java.util.List):void type: THIS */
        public /* synthetic */ SimpleOptionCartItem(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
        }
    }

    @Serializable
    public static final class SimpleOptionProductItemPo implements Parcelable {
        private String askPx;
        private String breakEvenPx;
        private String comment;
        private String days;
        private String expectedRate;
        private String expiry;
        private String instId;
        private boolean isOptionPredict;
        private String leverage;
        private String markPx;
        private String optionType;
        private String simpleOptionType;
        private String stk;
        private String targetPrice;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<SimpleOptionProductItemPo> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<SimpleOptionProductItemPo> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SimpleOptionProductItemPo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new SimpleOptionProductItemPo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SimpleOptionProductItemPo[] newArray(int i) {
                return new SimpleOptionProductItemPo[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SimpleOptionProductItemPo() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, 16383, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.days;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component10() {
            return this.stk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component11() {
            return this.leverage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component12() {
            return this.simpleOptionType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component13() {
            return this.optionType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component14() {
            return this.isOptionPredict;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.targetPrice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.comment;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.askPx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.breakEvenPx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.expectedRate;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.instId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.markPx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component9() {
            return this.expiry;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SimpleOptionProductItemPo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, String str12, String str13, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(str10, "");
            Intrinsics.checkNotNullParameter(str11, "");
            return new SimpleOptionProductItemPo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, z);
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
            if (!(obj instanceof SimpleOptionProductItemPo)) {
                return false;
            }
            SimpleOptionProductItemPo simpleOptionProductItemPo = (SimpleOptionProductItemPo) obj;
            return Intrinsics.EZpvd((Object) this.days, (Object) simpleOptionProductItemPo.days) && Intrinsics.EZpvd((Object) this.targetPrice, (Object) simpleOptionProductItemPo.targetPrice) && Intrinsics.EZpvd((Object) this.comment, (Object) simpleOptionProductItemPo.comment) && Intrinsics.EZpvd((Object) this.askPx, (Object) simpleOptionProductItemPo.askPx) && Intrinsics.EZpvd((Object) this.breakEvenPx, (Object) simpleOptionProductItemPo.breakEvenPx) && Intrinsics.EZpvd((Object) this.expectedRate, (Object) simpleOptionProductItemPo.expectedRate) && Intrinsics.EZpvd((Object) this.instId, (Object) simpleOptionProductItemPo.instId) && Intrinsics.EZpvd((Object) this.markPx, (Object) simpleOptionProductItemPo.markPx) && Intrinsics.EZpvd((Object) this.expiry, (Object) simpleOptionProductItemPo.expiry) && Intrinsics.EZpvd((Object) this.stk, (Object) simpleOptionProductItemPo.stk) && Intrinsics.EZpvd((Object) this.leverage, (Object) simpleOptionProductItemPo.leverage) && Intrinsics.EZpvd((Object) this.simpleOptionType, (Object) simpleOptionProductItemPo.simpleOptionType) && Intrinsics.EZpvd((Object) this.optionType, (Object) simpleOptionProductItemPo.optionType) && this.isOptionPredict == simpleOptionProductItemPo.isOptionPredict;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAskPx() {
            return this.askPx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBreakEvenPx() {
            return this.breakEvenPx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getComment() {
            return this.comment;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDays() {
            return this.days;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getExpectedRate() {
            return this.expectedRate;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getExpiry() {
            return this.expiry;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getInstId() {
            return this.instId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLeverage() {
            return this.leverage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMarkPx() {
            return this.markPx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getOptionType() {
            return this.optionType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSimpleOptionType() {
            return this.simpleOptionType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getStk() {
            return this.stk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTargetPrice() {
            return this.targetPrice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.days.hashCode();
            int iHashCode2 = this.targetPrice.hashCode();
            int iHashCode3 = this.comment.hashCode();
            int iHashCode4 = this.askPx.hashCode();
            int iHashCode5 = this.breakEvenPx.hashCode();
            int iHashCode6 = this.expectedRate.hashCode();
            int iHashCode7 = this.instId.hashCode();
            int iHashCode8 = this.markPx.hashCode();
            int iHashCode9 = this.expiry.hashCode();
            int iHashCode10 = this.stk.hashCode();
            int iHashCode11 = this.leverage.hashCode();
            String str = this.simpleOptionType;
            int iHashCode12 = str == null ? 0 : str.hashCode();
            String str2 = this.optionType;
            return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isOptionPredict);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isOptionPredict() {
            return this.isOptionPredict;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAskPx(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.askPx = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setBreakEvenPx(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.breakEvenPx = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setComment(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.comment = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setDays(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.days = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setExpectedRate(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.expectedRate = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setExpiry(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.expiry = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setInstId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.instId = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setLeverage(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.leverage = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setMarkPx(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.markPx = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setOptionPredict(boolean z) {
            this.isOptionPredict = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setOptionType(String str) {
            this.optionType = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSimpleOptionType(String str) {
            this.simpleOptionType = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setStk(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.stk = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTargetPrice(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.targetPrice = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SimpleOptionProductItemPo(days=" + this.days + ", targetPrice=" + this.targetPrice + ", comment=" + this.comment + ", askPx=" + this.askPx + ", breakEvenPx=" + this.breakEvenPx + ", expectedRate=" + this.expectedRate + ", instId=" + this.instId + ", markPx=" + this.markPx + ", expiry=" + this.expiry + ", stk=" + this.stk + ", leverage=" + this.leverage + ", simpleOptionType=" + this.simpleOptionType + ", optionType=" + this.optionType + ", isOptionPredict=" + this.isOptionPredict + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.days);
            parcel.writeString(this.targetPrice);
            parcel.writeString(this.comment);
            parcel.writeString(this.askPx);
            parcel.writeString(this.breakEvenPx);
            parcel.writeString(this.expectedRate);
            parcel.writeString(this.instId);
            parcel.writeString(this.markPx);
            parcel.writeString(this.expiry);
            parcel.writeString(this.stk);
            parcel.writeString(this.leverage);
            parcel.writeString(this.simpleOptionType);
            parcel.writeString(this.optionType);
            parcel.writeInt(this.isOptionPredict ? 1 : 0);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SimpleOptionProduct.SimpleOptionProductItemPo.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SimpleOptionProductItemPo> serializer() {
                return SimpleOptionProduct$SimpleOptionProductItemPo$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SimpleOptionProductItemPo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.days = "";
            } else {
                this.days = str;
            }
            if ((i & 2) == 0) {
                this.targetPrice = "";
            } else {
                this.targetPrice = str2;
            }
            if ((i & 4) == 0) {
                this.comment = "";
            } else {
                this.comment = str3;
            }
            if ((i & 8) == 0) {
                this.askPx = "";
            } else {
                this.askPx = str4;
            }
            if ((i & 16) == 0) {
                this.breakEvenPx = "";
            } else {
                this.breakEvenPx = str5;
            }
            if ((i & 32) == 0) {
                this.expectedRate = "";
            } else {
                this.expectedRate = str6;
            }
            if ((i & 64) == 0) {
                this.instId = "";
            } else {
                this.instId = str7;
            }
            if ((i & 128) == 0) {
                this.markPx = "";
            } else {
                this.markPx = str8;
            }
            if ((i & 256) == 0) {
                this.expiry = "";
            } else {
                this.expiry = str9;
            }
            if ((i & 512) == 0) {
                this.stk = "";
            } else {
                this.stk = str10;
            }
            if ((i & 1024) == 0) {
                this.leverage = "";
            } else {
                this.leverage = str11;
            }
            if ((i & 2048) == 0) {
                this.simpleOptionType = null;
            } else {
                this.simpleOptionType = str12;
            }
            if ((i & 4096) == 0) {
                this.optionType = null;
            } else {
                this.optionType = str13;
            }
            this.isOptionPredict = (i & 8192) == 0 ? false : z;
        }

        public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SimpleOptionProductItemPo simpleOptionProductItemPo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) simpleOptionProductItemPo.days, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 0, simpleOptionProductItemPo.days);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) simpleOptionProductItemPo.targetPrice, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 1, simpleOptionProductItemPo.targetPrice);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) simpleOptionProductItemPo.comment, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 2, simpleOptionProductItemPo.comment);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) simpleOptionProductItemPo.askPx, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 3, simpleOptionProductItemPo.askPx);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) simpleOptionProductItemPo.breakEvenPx, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 4, simpleOptionProductItemPo.breakEvenPx);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) simpleOptionProductItemPo.expectedRate, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 5, simpleOptionProductItemPo.expectedRate);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) simpleOptionProductItemPo.instId, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 6, simpleOptionProductItemPo.instId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) simpleOptionProductItemPo.markPx, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 7, simpleOptionProductItemPo.markPx);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) simpleOptionProductItemPo.expiry, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 8, simpleOptionProductItemPo.expiry);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) simpleOptionProductItemPo.stk, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 9, simpleOptionProductItemPo.stk);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) simpleOptionProductItemPo.leverage, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 10, simpleOptionProductItemPo.leverage);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || simpleOptionProductItemPo.simpleOptionType != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, simpleOptionProductItemPo.simpleOptionType);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || simpleOptionProductItemPo.optionType != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, simpleOptionProductItemPo.optionType);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || simpleOptionProductItemPo.isOptionPredict) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 13, simpleOptionProductItemPo.isOptionPredict);
            }
        }

        public SimpleOptionProductItemPo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, String str12, String str13, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(str10, "");
            Intrinsics.checkNotNullParameter(str11, "");
            this.days = str;
            this.targetPrice = str2;
            this.comment = str3;
            this.askPx = str4;
            this.breakEvenPx = str5;
            this.expectedRate = str6;
            this.instId = str7;
            this.markPx = str8;
            this.expiry = str9;
            this.stk = str10;
            this.leverage = str11;
            this.simpleOptionType = str12;
            this.optionType = str13;
            this.isOptionPredict = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0091: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r26v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r28v0 java.lang.String) : (null java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006b: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r29v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:30) call: com.okinc.unify_trade.biz.SimpleOptionProduct.SimpleOptionProductItemPo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ SimpleOptionProductItemPo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) == 0 ? str11 : "", (i & 2048) != 0 ? null : str12, (i & 4096) == 0 ? str13 : null, (i & 8192) != 0 ? false : z);
        }
    }

    public static final class Companion {

        public static final class StateListAnimator extends TypeToken<List<? extends SimpleOptionCartItem>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SimpleOptionProduct.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SimpleOptionProduct> serializer() {
            return SimpleOptionProduct$$serializer.INSTANCE;
        }

        public final SimpleOptionProduct OLrzqt(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            xVJ xvj = xVJ.KWHzl;
            Type type = new StateListAnimator().getType();
            Intrinsics.copydefault(type);
            int i = 1;
            List list = (List) xvj.OLrzqt(str, type, true);
            SimpleOptionCartItem simpleOptionCartItem = null;
            byte b = 0;
            if (list == null || list.isEmpty()) {
                return null;
            }
            return new SimpleOptionProduct(simpleOptionCartItem, (SimpleOptionCartItem) list.get(0), i, (DefaultConstructorMarker) (b == true ? 1 : 0));
        }
    }
}
