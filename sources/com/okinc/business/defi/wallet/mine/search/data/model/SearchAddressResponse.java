package com.okinc.business.defi.wallet.mine.search.data.model;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class SearchAddressResponse implements Parcelable {
    private final String address;
    private final ArrayList<Long> chainIndexes;
    private final String currencyAmount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SearchAddressResponse> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(LongSerializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<SearchAddressResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SearchAddressResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(Long.valueOf(parcel.readLong()));
                }
                arrayList = arrayList2;
            }
            return new SearchAddressResponse(string, string2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SearchAddressResponse[] newArray(int i) {
            return new SearchAddressResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.mine.search.data.model.SearchAddressResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchAddressResponse copy$default(SearchAddressResponse searchAddressResponse, String str, String str2, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchAddressResponse.address;
        }
        if ((i & 2) != 0) {
            str2 = searchAddressResponse.currencyAmount;
        }
        if ((i & 4) != 0) {
            arrayList = searchAddressResponse.chainIndexes;
        }
        return searchAddressResponse.copy(str, str2, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Long> component3() {
        return this.chainIndexes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchAddressResponse copy(String str, String str2, ArrayList<Long> arrayList) {
        return new SearchAddressResponse(str, str2, arrayList);
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
        if (!(obj instanceof SearchAddressResponse)) {
            return false;
        }
        SearchAddressResponse searchAddressResponse = (SearchAddressResponse) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) searchAddressResponse.address) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) searchAddressResponse.currencyAmount) && Intrinsics.EZpvd(this.chainIndexes, searchAddressResponse.chainIndexes);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Long> getChainIndexes() {
        return this.chainIndexes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyAmount() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.address;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.currencyAmount;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        ArrayList<Long> arrayList = this.chainIndexes;
        return (((iHashCode * 31) + iHashCode2) * 31) + (arrayList != null ? arrayList.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SearchAddressResponse(address=" + this.address + ", currencyAmount=" + this.currencyAmount + ", chainIndexes=" + this.chainIndexes + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        parcel.writeString(this.currencyAmount);
        ArrayList<Long> arrayList = this.chainIndexes;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList.size());
        Iterator<Long> it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeLong(it.next().longValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.search.data.model.SearchAddressResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SearchAddressResponse> serializer() {
            return SearchAddressResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SearchAddressResponse(int i, String str, String str2, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if (4 != (i & 4)) {
            PluginExceptionsKt.throwMissingFieldException(i, 4, SearchAddressResponse$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.address = "";
        } else {
            this.address = str;
        }
        if ((i & 2) == 0) {
            this.currencyAmount = "";
        } else {
            this.currencyAmount = str2;
        }
        this.chainIndexes = arrayList;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SearchAddressResponse searchAddressResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) searchAddressResponse.address, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, searchAddressResponse.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) searchAddressResponse.currencyAmount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, searchAddressResponse.currencyAmount);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], searchAddressResponse.chainIndexes);
    }

    public SearchAddressResponse(String str, String str2, ArrayList<Long> arrayList) {
        this.address = str;
        this.currencyAmount = str2;
        this.chainIndexes = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (r4v0 java.util.ArrayList)
 A[MD:(java.lang.String, java.lang.String, java.util.ArrayList<java.lang.Long>):void (m)] (LINE:178) call: com.okinc.business.defi.wallet.mine.search.data.model.SearchAddressResponse.<init>(java.lang.String, java.lang.String, java.util.ArrayList):void type: THIS */
    public /* synthetic */ SearchAddressResponse(String str, String str2, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, arrayList);
    }
}
