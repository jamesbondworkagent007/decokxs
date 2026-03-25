package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class OrderLeadPosSize implements Parcelable {
    private String detailsPosSize;
    private String spotDetailsPosSize;
    private String summaryPosSize;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OrderLeadPosSize> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OrderLeadPosSize> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderLeadPosSize createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OrderLeadPosSize(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderLeadPosSize[] newArray(int i) {
            return new OrderLeadPosSize[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OrderLeadPosSize() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OrderLeadPosSize copy$default(OrderLeadPosSize orderLeadPosSize, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderLeadPosSize.detailsPosSize;
        }
        if ((i & 2) != 0) {
            str2 = orderLeadPosSize.summaryPosSize;
        }
        if ((i & 4) != 0) {
            str3 = orderLeadPosSize.spotDetailsPosSize;
        }
        return orderLeadPosSize.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.detailsPosSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.summaryPosSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.spotDetailsPosSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderLeadPosSize copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new OrderLeadPosSize(str, str2, str3);
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
        if (!(obj instanceof OrderLeadPosSize)) {
            return false;
        }
        OrderLeadPosSize orderLeadPosSize = (OrderLeadPosSize) obj;
        return Intrinsics.EZpvd((Object) this.detailsPosSize, (Object) orderLeadPosSize.detailsPosSize) && Intrinsics.EZpvd((Object) this.summaryPosSize, (Object) orderLeadPosSize.summaryPosSize) && Intrinsics.EZpvd((Object) this.spotDetailsPosSize, (Object) orderLeadPosSize.spotDetailsPosSize);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDetailsPosSize() {
        return this.detailsPosSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotDetailsPosSize() {
        return this.spotDetailsPosSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSummaryPosSize() {
        return this.summaryPosSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.detailsPosSize.hashCode() * 31) + this.summaryPosSize.hashCode()) * 31) + this.spotDetailsPosSize.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDetailsPosSize(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.detailsPosSize = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpotDetailsPosSize(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.spotDetailsPosSize = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSummaryPosSize(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.summaryPosSize = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrderLeadPosSize(detailsPosSize=" + this.detailsPosSize + ", summaryPosSize=" + this.summaryPosSize + ", spotDetailsPosSize=" + this.spotDetailsPosSize + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.detailsPosSize);
        parcel.writeString(this.summaryPosSize);
        parcel.writeString(this.spotDetailsPosSize);
    }

    public /* synthetic */ OrderLeadPosSize(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.detailsPosSize = "";
        } else {
            this.detailsPosSize = str;
        }
        if ((i & 2) == 0) {
            this.summaryPosSize = "";
        } else {
            this.summaryPosSize = str2;
        }
        if ((i & 4) == 0) {
            this.spotDetailsPosSize = "";
        } else {
            this.spotDetailsPosSize = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(OrderLeadPosSize orderLeadPosSize, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) orderLeadPosSize.detailsPosSize, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, orderLeadPosSize.detailsPosSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) orderLeadPosSize.summaryPosSize, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, orderLeadPosSize.summaryPosSize);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) orderLeadPosSize.spotDetailsPosSize, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, orderLeadPosSize.spotDetailsPosSize);
    }

    public OrderLeadPosSize(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.detailsPosSize = str;
        this.summaryPosSize = str2;
        this.spotDetailsPosSize = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:3367) call: com.okinc.unify_trade.biz.OrderLeadPosSize.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ OrderLeadPosSize(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public static final class Companion {

        public static final class Activity extends TypeToken<List<? extends OrderLeadPosSize>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.OrderLeadPosSize.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OrderLeadPosSize> serializer() {
            return OrderLeadPosSize$$serializer.INSTANCE;
        }

        public final List<OrderLeadPosSize> KWHzl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                return (List) new Gson().fromJson(str, new Activity().getType());
            } catch (Exception e) {
                pUU.KWHzl("JSON PARSE", "OrderLeadPosSize-jsonConvert" + e.getMessage());
                return null;
            }
        }
    }
}
