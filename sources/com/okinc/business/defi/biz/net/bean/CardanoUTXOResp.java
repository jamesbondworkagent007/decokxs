package com.okinc.business.defi.biz.net.bean;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class CardanoUTXOResp implements Parcelable {
    private String address;
    private String amount;
    private String index;
    private ArrayList<CardanoMultiAssetInfo> multiAsset;
    private String txId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CardanoUTXOResp> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(CardanoMultiAssetInfo$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<CardanoUTXOResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardanoUTXOResp createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(CardanoMultiAssetInfo.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new CardanoUTXOResp(string, string2, string3, string4, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardanoUTXOResp[] newArray(int i) {
            return new CardanoUTXOResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CardanoUTXOResp() {
        this((String) null, (String) null, (String) null, (String) null, (ArrayList) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.defi.biz.net.bean.CardanoUTXOResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardanoUTXOResp copy$default(CardanoUTXOResp cardanoUTXOResp, String str, String str2, String str3, String str4, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardanoUTXOResp.txId;
        }
        if ((i & 2) != 0) {
            str2 = cardanoUTXOResp.index;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = cardanoUTXOResp.address;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = cardanoUTXOResp.amount;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            arrayList = cardanoUTXOResp.multiAsset;
        }
        return cardanoUTXOResp.copy(str, str5, str6, str7, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<CardanoMultiAssetInfo> component5() {
        return this.multiAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardanoUTXOResp copy(String str, String str2, String str3, String str4, ArrayList<CardanoMultiAssetInfo> arrayList) {
        return new CardanoUTXOResp(str, str2, str3, str4, arrayList);
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
        if (!(obj instanceof CardanoUTXOResp)) {
            return false;
        }
        CardanoUTXOResp cardanoUTXOResp = (CardanoUTXOResp) obj;
        return Intrinsics.EZpvd((Object) this.txId, (Object) cardanoUTXOResp.txId) && Intrinsics.EZpvd((Object) this.index, (Object) cardanoUTXOResp.index) && Intrinsics.EZpvd((Object) this.address, (Object) cardanoUTXOResp.address) && Intrinsics.EZpvd((Object) this.amount, (Object) cardanoUTXOResp.amount) && Intrinsics.EZpvd(this.multiAsset, cardanoUTXOResp.multiAsset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIndex() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<CardanoMultiAssetInfo> getMultiAsset() {
        return this.multiAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxId() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.txId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.index;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.address;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.amount;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        ArrayList<CardanoMultiAssetInfo> arrayList = this.multiAsset;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (arrayList != null ? arrayList.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(String str) {
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIndex(String str) {
        this.index = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMultiAsset(ArrayList<CardanoMultiAssetInfo> arrayList) {
        this.multiAsset = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxId(String str) {
        this.txId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CardanoUTXOResp(txId=" + this.txId + ", index=" + this.index + ", address=" + this.address + ", amount=" + this.amount + ", multiAsset=" + this.multiAsset + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.txId);
        parcel.writeString(this.index);
        parcel.writeString(this.address);
        parcel.writeString(this.amount);
        ArrayList<CardanoMultiAssetInfo> arrayList = this.multiAsset;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList.size());
        Iterator<CardanoMultiAssetInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CardanoUTXOResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CardanoUTXOResp> serializer() {
            return CardanoUTXOResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CardanoUTXOResp(int i, String str, String str2, String str3, String str4, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.txId = null;
        } else {
            this.txId = str;
        }
        if ((i & 2) == 0) {
            this.index = null;
        } else {
            this.index = str2;
        }
        if ((i & 4) == 0) {
            this.address = null;
        } else {
            this.address = str3;
        }
        if ((i & 8) == 0) {
            this.amount = null;
        } else {
            this.amount = str4;
        }
        if ((i & 16) == 0) {
            this.multiAsset = null;
        } else {
            this.multiAsset = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CardanoUTXOResp cardanoUTXOResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || cardanoUTXOResp.txId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, cardanoUTXOResp.txId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || cardanoUTXOResp.index != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, cardanoUTXOResp.index);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || cardanoUTXOResp.address != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, cardanoUTXOResp.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || cardanoUTXOResp.amount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, cardanoUTXOResp.amount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && cardanoUTXOResp.multiAsset == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], cardanoUTXOResp.multiAsset);
    }

    public CardanoUTXOResp(String str, String str2, String str3, String str4, ArrayList<CardanoMultiAssetInfo> arrayList) {
        this.txId = str;
        this.index = str2;
        this.address = str3;
        this.amount = str4;
        this.multiAsset = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r9v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.business.defi.biz.net.bean.CardanoMultiAssetInfo>):void (m)] (LINE:367) call: com.okinc.business.defi.biz.net.bean.CardanoUTXOResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList):void type: THIS */
    public /* synthetic */ CardanoUTXOResp(String str, String str2, String str3, String str4, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : arrayList);
    }
}
