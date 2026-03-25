package com.okinc.unify_trade.biz;

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
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class SimpleModeQuickRepayReq implements Parcelable {
    private final String debtCcy;
    private final List<String> repayCcyList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SimpleModeQuickRepayReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<SimpleModeQuickRepayReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleModeQuickRepayReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SimpleModeQuickRepayReq(parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleModeQuickRepayReq[] newArray(int i) {
            return new SimpleModeQuickRepayReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SimpleModeQuickRepayReq() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.SimpleModeQuickRepayReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SimpleModeQuickRepayReq copy$default(SimpleModeQuickRepayReq simpleModeQuickRepayReq, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simpleModeQuickRepayReq.debtCcy;
        }
        if ((i & 2) != 0) {
            list = simpleModeQuickRepayReq.repayCcyList;
        }
        return simpleModeQuickRepayReq.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.debtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.repayCcyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleModeQuickRepayReq copy(@NotNull String str, List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        return new SimpleModeQuickRepayReq(str, list);
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
        if (!(obj instanceof SimpleModeQuickRepayReq)) {
            return false;
        }
        SimpleModeQuickRepayReq simpleModeQuickRepayReq = (SimpleModeQuickRepayReq) obj;
        return Intrinsics.EZpvd((Object) this.debtCcy, (Object) simpleModeQuickRepayReq.debtCcy) && Intrinsics.EZpvd(this.repayCcyList, simpleModeQuickRepayReq.repayCcyList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDebtCcy() {
        return this.debtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getRepayCcyList() {
        return this.repayCcyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.debtCcy.hashCode();
        List<String> list = this.repayCcyList;
        return (iHashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SimpleModeQuickRepayReq(debtCcy=" + this.debtCcy + ", repayCcyList=" + this.repayCcyList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.debtCcy);
        parcel.writeStringList(this.repayCcyList);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SimpleModeQuickRepayReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SimpleModeQuickRepayReq> serializer() {
            return SimpleModeQuickRepayReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SimpleModeQuickRepayReq(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.debtCcy = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.repayCcyList = yDY.AhwBna();
        } else {
            this.repayCcyList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SimpleModeQuickRepayReq simpleModeQuickRepayReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) simpleModeQuickRepayReq.debtCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, simpleModeQuickRepayReq.debtCcy);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(simpleModeQuickRepayReq.repayCcyList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], simpleModeQuickRepayReq.repayCcyList);
    }

    public SimpleModeQuickRepayReq(@NotNull String str, List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        this.debtCcy = str;
        this.repayCcyList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:5012)) : (r2v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<java.lang.String>):void (m)] (LINE:5010) call: com.okinc.unify_trade.biz.SimpleModeQuickRepayReq.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ SimpleModeQuickRepayReq(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list);
    }
}
