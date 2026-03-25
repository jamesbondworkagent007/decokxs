package com.okinc.wallet.core.sign.cardano;

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

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class CardanoTxIn implements Parcelable {
    private String amount;
    private String index;
    private List<CardanoMultiAsset> multiAsset;
    private String txId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CardanoTxIn> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(CardanoMultiAsset$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<CardanoTxIn> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardanoTxIn createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(CardanoMultiAsset.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new CardanoTxIn(string, string2, string3, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardanoTxIn[] newArray(int i) {
            return new CardanoTxIn[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CardanoTxIn() {
        this((String) null, (String) null, (String) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.wallet.core.sign.cardano.CardanoTxIn */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardanoTxIn copy$default(CardanoTxIn cardanoTxIn, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardanoTxIn.txId;
        }
        if ((i & 2) != 0) {
            str2 = cardanoTxIn.index;
        }
        if ((i & 4) != 0) {
            str3 = cardanoTxIn.amount;
        }
        if ((i & 8) != 0) {
            list = cardanoTxIn.multiAsset;
        }
        return cardanoTxIn.copy(str, str2, str3, list);
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
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CardanoMultiAsset> component4() {
        return this.multiAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardanoTxIn copy(@NotNull String str, @NotNull String str2, @NotNull String str3, List<CardanoMultiAsset> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new CardanoTxIn(str, str2, str3, list);
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
        if (!(obj instanceof CardanoTxIn)) {
            return false;
        }
        CardanoTxIn cardanoTxIn = (CardanoTxIn) obj;
        return Intrinsics.EZpvd((Object) this.txId, (Object) cardanoTxIn.txId) && Intrinsics.EZpvd((Object) this.index, (Object) cardanoTxIn.index) && Intrinsics.EZpvd((Object) this.amount, (Object) cardanoTxIn.amount) && Intrinsics.EZpvd(this.multiAsset, cardanoTxIn.multiAsset);
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
    public final List<CardanoMultiAsset> getMultiAsset() {
        return this.multiAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxId() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.txId.hashCode();
        int iHashCode2 = this.index.hashCode();
        int iHashCode3 = this.amount.hashCode();
        List<CardanoMultiAsset> list = this.multiAsset;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIndex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.index = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMultiAsset(List<CardanoMultiAsset> list) {
        this.multiAsset = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.txId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CardanoTxIn(txId=" + this.txId + ", index=" + this.index + ", amount=" + this.amount + ", multiAsset=" + this.multiAsset + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.txId);
        parcel.writeString(this.index);
        parcel.writeString(this.amount);
        List<CardanoMultiAsset> list = this.multiAsset;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<CardanoMultiAsset> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.cardano.CardanoTxIn.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CardanoTxIn> serializer() {
            return CardanoTxIn$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CardanoTxIn(int i, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.txId = "";
        } else {
            this.txId = str;
        }
        if ((i & 2) == 0) {
            this.index = "";
        } else {
            this.index = str2;
        }
        if ((i & 4) == 0) {
            this.amount = "";
        } else {
            this.amount = str3;
        }
        if ((i & 8) == 0) {
            this.multiAsset = null;
        } else {
            this.multiAsset = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(CardanoTxIn cardanoTxIn, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) cardanoTxIn.txId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, cardanoTxIn.txId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) cardanoTxIn.index, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, cardanoTxIn.index);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) cardanoTxIn.amount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, cardanoTxIn.amount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && cardanoTxIn.multiAsset == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], cardanoTxIn.multiAsset);
    }

    public CardanoTxIn(@NotNull String str, @NotNull String str2, @NotNull String str3, List<CardanoMultiAsset> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.txId = str;
        this.index = str2;
        this.amount = str3;
        this.multiAsset = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.wallet.core.sign.cardano.CardanoMultiAsset>):void (m)] (LINE:23) call: com.okinc.wallet.core.sign.cardano.CardanoTxIn.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ CardanoTxIn(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : list);
    }
}
