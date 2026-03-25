package com.okinc.business.defi.api.bean;

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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class NewCurvePrice implements Parcelable {
    private List<CurvePrice> chartPoints;
    private boolean hasPercent;
    private String price;
    private String priceChangePercent;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<NewCurvePrice> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(CurvePrice$$serializer.INSTANCE), null, null, null};

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<NewCurvePrice> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewCurvePrice createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(CurvePrice.CREATOR.createFromParcel(parcel));
            }
            return new NewCurvePrice(arrayList, parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewCurvePrice[] newArray(int i) {
            return new NewCurvePrice[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.api.bean.NewCurvePrice */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewCurvePrice copy$default(NewCurvePrice newCurvePrice, List list, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = newCurvePrice.chartPoints;
        }
        if ((i & 2) != 0) {
            z = newCurvePrice.hasPercent;
        }
        if ((i & 4) != 0) {
            str = newCurvePrice.price;
        }
        if ((i & 8) != 0) {
            str2 = newCurvePrice.priceChangePercent;
        }
        return newCurvePrice.copy(list, z, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CurvePrice> component1() {
        return this.chartPoints;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.hasPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.priceChangePercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewCurvePrice copy(@NotNull List<CurvePrice> list, boolean z, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new NewCurvePrice(list, z, str, str2);
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
        if (!(obj instanceof NewCurvePrice)) {
            return false;
        }
        NewCurvePrice newCurvePrice = (NewCurvePrice) obj;
        return Intrinsics.EZpvd(this.chartPoints, newCurvePrice.chartPoints) && this.hasPercent == newCurvePrice.hasPercent && Intrinsics.EZpvd((Object) this.price, (Object) newCurvePrice.price) && Intrinsics.EZpvd((Object) this.priceChangePercent, (Object) newCurvePrice.priceChangePercent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CurvePrice> getChartPoints() {
        return this.chartPoints;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasPercent() {
        return this.hasPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceChangePercent() {
        return this.priceChangePercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.chartPoints.hashCode() * 31) + Boolean.hashCode(this.hasPercent)) * 31) + this.price.hashCode()) * 31) + this.priceChangePercent.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChartPoints(@NotNull List<CurvePrice> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.chartPoints = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasPercent(boolean z) {
        this.hasPercent = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceChangePercent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.priceChangePercent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NewCurvePrice(chartPoints=" + this.chartPoints + ", hasPercent=" + this.hasPercent + ", price=" + this.price + ", priceChangePercent=" + this.priceChangePercent + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<CurvePrice> list = this.chartPoints;
        parcel.writeInt(list.size());
        Iterator<CurvePrice> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.hasPercent ? 1 : 0);
        parcel.writeString(this.price);
        parcel.writeString(this.priceChangePercent);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.NewCurvePrice.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NewCurvePrice> serializer() {
            return NewCurvePrice$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NewCurvePrice(int i, List list, boolean z, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (14 != (i & 14)) {
            PluginExceptionsKt.throwMissingFieldException(i, 14, NewCurvePrice$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.chartPoints = yDY.AhwBna();
        } else {
            this.chartPoints = list;
        }
        this.hasPercent = z;
        this.price = str;
        this.priceChangePercent = str2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(NewCurvePrice newCurvePrice, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(newCurvePrice.chartPoints, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], newCurvePrice.chartPoints);
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, newCurvePrice.hasPercent);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, newCurvePrice.price);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, newCurvePrice.priceChangePercent);
    }

    public NewCurvePrice(@NotNull List<CurvePrice> list, boolean z, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.chartPoints = list;
        this.hasPercent = z;
        this.price = str;
        this.priceChangePercent = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:48)) : (r1v0 java.util.List))
  (r2v0 boolean)
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
 A[MD:(java.util.List<com.okinc.business.defi.api.bean.CurvePrice>, boolean, java.lang.String, java.lang.String):void (m)] (LINE:47) call: com.okinc.business.defi.api.bean.NewCurvePrice.<init>(java.util.List, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ NewCurvePrice(List list, boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, z, str, str2);
    }
}
