package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class MarginLoanInterest implements Parcelable {
    private final ArrayList<LoanInterestBasic> basic;
    private final ArrayList<LoanInterestConfig> config;
    private final ArrayList<LoanInterestConfigCcy> configCcyList;
    private final ArrayList<LoanInterestRegular> regular;
    private final ArrayList<LoanInterestVIP> vip;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MarginLoanInterest> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(LoanInterestBasic$$serializer.INSTANCE), new ArrayListSerializer(LoanInterestVIP$$serializer.INSTANCE), new ArrayListSerializer(LoanInterestRegular$$serializer.INSTANCE), new ArrayListSerializer(LoanInterestConfig$$serializer.INSTANCE), new ArrayListSerializer(LoanInterestConfigCcy$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<MarginLoanInterest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarginLoanInterest createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList2.add(LoanInterestBasic.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList3.add(LoanInterestVIP.CREATOR.createFromParcel(parcel));
            }
            int i5 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList4.add(LoanInterestRegular.CREATOR.createFromParcel(parcel));
            }
            ArrayList arrayList5 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i7 = parcel.readInt();
                arrayList = new ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    arrayList.add(LoanInterestConfig.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i9 = parcel.readInt();
                arrayList5 = new ArrayList(i9);
                for (int i10 = 0; i10 != i9; i10++) {
                    arrayList5.add(LoanInterestConfigCcy.CREATOR.createFromParcel(parcel));
                }
            }
            return new MarginLoanInterest(arrayList2, arrayList3, arrayList4, arrayList, arrayList5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarginLoanInterest[] newArray(int i) {
            return new MarginLoanInterest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.unify_trade.biz.MarginLoanInterest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarginLoanInterest copy$default(MarginLoanInterest marginLoanInterest, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = marginLoanInterest.basic;
        }
        if ((i & 2) != 0) {
            arrayList2 = marginLoanInterest.vip;
        }
        ArrayList arrayList6 = arrayList2;
        if ((i & 4) != 0) {
            arrayList3 = marginLoanInterest.regular;
        }
        ArrayList arrayList7 = arrayList3;
        if ((i & 8) != 0) {
            arrayList4 = marginLoanInterest.config;
        }
        ArrayList arrayList8 = arrayList4;
        if ((i & 16) != 0) {
            arrayList5 = marginLoanInterest.configCcyList;
        }
        return marginLoanInterest.copy(arrayList, arrayList6, arrayList7, arrayList8, arrayList5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<LoanInterestBasic> component1() {
        return this.basic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<LoanInterestVIP> component2() {
        return this.vip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<LoanInterestRegular> component3() {
        return this.regular;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<LoanInterestConfig> component4() {
        return this.config;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<LoanInterestConfigCcy> component5() {
        return this.configCcyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarginLoanInterest copy(@NotNull ArrayList<LoanInterestBasic> arrayList, @NotNull ArrayList<LoanInterestVIP> arrayList2, @NotNull ArrayList<LoanInterestRegular> arrayList3, ArrayList<LoanInterestConfig> arrayList4, ArrayList<LoanInterestConfigCcy> arrayList5) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(arrayList3, "");
        return new MarginLoanInterest(arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
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
        if (!(obj instanceof MarginLoanInterest)) {
            return false;
        }
        MarginLoanInterest marginLoanInterest = (MarginLoanInterest) obj;
        return Intrinsics.EZpvd(this.basic, marginLoanInterest.basic) && Intrinsics.EZpvd(this.vip, marginLoanInterest.vip) && Intrinsics.EZpvd(this.regular, marginLoanInterest.regular) && Intrinsics.EZpvd(this.config, marginLoanInterest.config) && Intrinsics.EZpvd(this.configCcyList, marginLoanInterest.configCcyList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<LoanInterestBasic> getBasic() {
        return this.basic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<LoanInterestConfig> getConfig() {
        return this.config;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<LoanInterestConfigCcy> getConfigCcyList() {
        return this.configCcyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<LoanInterestRegular> getRegular() {
        return this.regular;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<LoanInterestVIP> getVip() {
        return this.vip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.basic.hashCode();
        int iHashCode2 = this.vip.hashCode();
        int iHashCode3 = this.regular.hashCode();
        ArrayList<LoanInterestConfig> arrayList = this.config;
        int iHashCode4 = arrayList == null ? 0 : arrayList.hashCode();
        ArrayList<LoanInterestConfigCcy> arrayList2 = this.configCcyList;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarginLoanInterest(basic=" + this.basic + ", vip=" + this.vip + ", regular=" + this.regular + ", config=" + this.config + ", configCcyList=" + this.configCcyList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        ArrayList<LoanInterestBasic> arrayList = this.basic;
        parcel.writeInt(arrayList.size());
        Iterator<LoanInterestBasic> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        ArrayList<LoanInterestVIP> arrayList2 = this.vip;
        parcel.writeInt(arrayList2.size());
        Iterator<LoanInterestVIP> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        ArrayList<LoanInterestRegular> arrayList3 = this.regular;
        parcel.writeInt(arrayList3.size());
        Iterator<LoanInterestRegular> it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        ArrayList<LoanInterestConfig> arrayList4 = this.config;
        if (arrayList4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList4.size());
            Iterator<LoanInterestConfig> it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, i);
            }
        }
        ArrayList<LoanInterestConfigCcy> arrayList5 = this.configCcyList;
        if (arrayList5 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList5.size());
        Iterator<LoanInterestConfigCcy> it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            it5.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.MarginLoanInterest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MarginLoanInterest> serializer() {
            return MarginLoanInterest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MarginLoanInterest(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, MarginLoanInterest$$serializer.INSTANCE.getDescriptor());
        }
        this.basic = arrayList;
        this.vip = arrayList2;
        this.regular = arrayList3;
        if ((i & 8) == 0) {
            this.config = null;
        } else {
            this.config = arrayList4;
        }
        if ((i & 16) == 0) {
            this.configCcyList = null;
        } else {
            this.configCcyList = arrayList5;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(MarginLoanInterest marginLoanInterest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], marginLoanInterest.basic);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], marginLoanInterest.vip);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], marginLoanInterest.regular);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || marginLoanInterest.config != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], marginLoanInterest.config);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && marginLoanInterest.configCcyList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], marginLoanInterest.configCcyList);
    }

    public MarginLoanInterest(@NotNull ArrayList<LoanInterestBasic> arrayList, @NotNull ArrayList<LoanInterestVIP> arrayList2, @NotNull ArrayList<LoanInterestRegular> arrayList3, ArrayList<LoanInterestConfig> arrayList4, ArrayList<LoanInterestConfigCcy> arrayList5) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(arrayList3, "");
        this.basic = arrayList;
        this.vip = arrayList2;
        this.regular = arrayList3;
        this.config = arrayList4;
        this.configCcyList = arrayList5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (r8v0 java.util.ArrayList)
  (r9v0 java.util.ArrayList)
  (r10v0 java.util.ArrayList)
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r11v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r12v0 java.util.ArrayList))
 A[MD:(java.util.ArrayList<com.okinc.unify_trade.biz.LoanInterestBasic>, java.util.ArrayList<com.okinc.unify_trade.biz.LoanInterestVIP>, java.util.ArrayList<com.okinc.unify_trade.biz.LoanInterestRegular>, java.util.ArrayList<com.okinc.unify_trade.biz.LoanInterestConfig>, java.util.ArrayList<com.okinc.unify_trade.biz.LoanInterestConfigCcy>):void (m)] (LINE:3500) call: com.okinc.unify_trade.biz.MarginLoanInterest.<init>(java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void type: THIS */
    public /* synthetic */ MarginLoanInterest(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(arrayList, arrayList2, arrayList3, (i & 8) != 0 ? null : arrayList4, (i & 16) != 0 ? null : arrayList5);
    }
}
