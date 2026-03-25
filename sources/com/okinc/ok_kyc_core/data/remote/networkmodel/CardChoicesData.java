package com.okinc.ok_kyc_core.data.remote.networkmodel;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class CardChoicesData implements Parcelable {
    private final String maxNumOfOptions;
    private final Boolean search;
    private List<CardChoicesValueData> values;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CardChoicesData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(CardChoicesValueData$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<CardChoicesData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardChoicesData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            ArrayList arrayList = null;
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(CardChoicesValueData.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new CardChoicesData(string, boolValueOf, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardChoicesData[] newArray(int i) {
            return new CardChoicesData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CardChoicesData() {
        this((String) null, (Boolean) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardChoicesData copy$default(CardChoicesData cardChoicesData, String str, Boolean bool, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardChoicesData.maxNumOfOptions;
        }
        if ((i & 2) != 0) {
            bool = cardChoicesData.search;
        }
        if ((i & 4) != 0) {
            list = cardChoicesData.values;
        }
        return cardChoicesData.copy(str, bool, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.maxNumOfOptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.search;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CardChoicesValueData> component3() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardChoicesData copy(String str, Boolean bool, List<CardChoicesValueData> list) {
        return new CardChoicesData(str, bool, list);
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
        if (!(obj instanceof CardChoicesData)) {
            return false;
        }
        CardChoicesData cardChoicesData = (CardChoicesData) obj;
        return Intrinsics.EZpvd((Object) this.maxNumOfOptions, (Object) cardChoicesData.maxNumOfOptions) && Intrinsics.EZpvd(this.search, cardChoicesData.search) && Intrinsics.EZpvd(this.values, cardChoicesData.values);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxNumOfOptions() {
        return this.maxNumOfOptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSearch() {
        return this.search;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CardChoicesValueData> getValues() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.maxNumOfOptions;
        int iHashCode = str == null ? 0 : str.hashCode();
        Boolean bool = this.search;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        List<CardChoicesValueData> list = this.values;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValues(List<CardChoicesValueData> list) {
        this.values = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CardChoicesData(maxNumOfOptions=" + this.maxNumOfOptions + ", search=" + this.search + ", values=" + this.values + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.maxNumOfOptions);
        Boolean bool = this.search;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        List<CardChoicesValueData> list = this.values;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<CardChoicesValueData> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CardChoicesData> serializer() {
            return CardChoicesData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CardChoicesData(int i, String str, Boolean bool, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.maxNumOfOptions = (i & 1) == 0 ? "1" : str;
        if ((i & 2) == 0) {
            this.search = Boolean.FALSE;
        } else {
            this.search = bool;
        }
        if ((i & 4) == 0) {
            this.values = null;
        } else {
            this.values = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(CardChoicesData cardChoicesData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) cardChoicesData.maxNumOfOptions, (Object) "1")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, cardChoicesData.maxNumOfOptions);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(cardChoicesData.search, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, cardChoicesData.search);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && cardChoicesData.values == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], cardChoicesData.values);
    }

    public CardChoicesData(String str, Boolean bool, List<CardChoicesValueData> list) {
        this.maxNumOfOptions = str;
        this.search = bool;
        this.values = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("1") : (r1v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x000a: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r2v0 java.lang.Boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.lang.String, java.lang.Boolean, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesValueData>):void (m)] (LINE:3121) call: com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesData.<init>(java.lang.String, java.lang.Boolean, java.util.List):void type: THIS */
    public /* synthetic */ CardChoicesData(String str, Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "1" : str, (i & 2) != 0 ? Boolean.FALSE : bool, (i & 4) != 0 ? null : list);
    }
}
