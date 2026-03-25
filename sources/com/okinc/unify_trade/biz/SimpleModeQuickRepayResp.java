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
public final class SimpleModeQuickRepayResp implements Parcelable {
    private final String debtCcy;
    private final List<String> repayCcyList;
    private final String ts;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SimpleModeQuickRepayResp> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<SimpleModeQuickRepayResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleModeQuickRepayResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SimpleModeQuickRepayResp(parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleModeQuickRepayResp[] newArray(int i) {
            return new SimpleModeQuickRepayResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SimpleModeQuickRepayResp() {
        this((String) null, (List) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.SimpleModeQuickRepayResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SimpleModeQuickRepayResp copy$default(SimpleModeQuickRepayResp simpleModeQuickRepayResp, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simpleModeQuickRepayResp.debtCcy;
        }
        if ((i & 2) != 0) {
            list = simpleModeQuickRepayResp.repayCcyList;
        }
        if ((i & 4) != 0) {
            str2 = simpleModeQuickRepayResp.ts;
        }
        return simpleModeQuickRepayResp.copy(str, list, str2);
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
    public final String component3() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleModeQuickRepayResp copy(@NotNull String str, List<String> list, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SimpleModeQuickRepayResp(str, list, str2);
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
        if (!(obj instanceof SimpleModeQuickRepayResp)) {
            return false;
        }
        SimpleModeQuickRepayResp simpleModeQuickRepayResp = (SimpleModeQuickRepayResp) obj;
        return Intrinsics.EZpvd((Object) this.debtCcy, (Object) simpleModeQuickRepayResp.debtCcy) && Intrinsics.EZpvd(this.repayCcyList, simpleModeQuickRepayResp.repayCcyList) && Intrinsics.EZpvd((Object) this.ts, (Object) simpleModeQuickRepayResp.ts);
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
    public final String getTs() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.debtCcy.hashCode();
        List<String> list = this.repayCcyList;
        return (((iHashCode * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.ts.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SimpleModeQuickRepayResp(debtCcy=" + this.debtCcy + ", repayCcyList=" + this.repayCcyList + ", ts=" + this.ts + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.debtCcy);
        parcel.writeStringList(this.repayCcyList);
        parcel.writeString(this.ts);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SimpleModeQuickRepayResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SimpleModeQuickRepayResp> serializer() {
            return SimpleModeQuickRepayResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SimpleModeQuickRepayResp(int i, String str, List list, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.debtCcy = "";
        } else {
            this.debtCcy = str;
        }
        if ((i & 2) == 0) {
            this.repayCcyList = yDY.AhwBna();
        } else {
            this.repayCcyList = list;
        }
        if ((i & 4) == 0) {
            this.ts = "";
        } else {
            this.ts = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SimpleModeQuickRepayResp simpleModeQuickRepayResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) simpleModeQuickRepayResp.debtCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, simpleModeQuickRepayResp.debtCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(simpleModeQuickRepayResp.repayCcyList, yDY.AhwBna())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], simpleModeQuickRepayResp.repayCcyList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) simpleModeQuickRepayResp.ts, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, simpleModeQuickRepayResp.ts);
    }

    public SimpleModeQuickRepayResp(@NotNull String str, List<String> list, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.debtCcy = str;
        this.repayCcyList = list;
        this.ts = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000b: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:5023)) : (r3v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, java.lang.String):void (m)] (LINE:5021) call: com.okinc.unify_trade.biz.SimpleModeQuickRepayResp.<init>(java.lang.String, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ SimpleModeQuickRepayResp(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? "" : str2);
    }
}
