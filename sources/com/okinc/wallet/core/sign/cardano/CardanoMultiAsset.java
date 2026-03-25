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
public final class CardanoMultiAsset implements Parcelable {
    private List<CardanoAsset> assets;
    private String policyId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CardanoMultiAsset> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(CardanoAsset$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<CardanoMultiAsset> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardanoMultiAsset createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(CardanoAsset.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new CardanoMultiAsset(string, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardanoMultiAsset[] newArray(int i) {
            return new CardanoMultiAsset[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CardanoMultiAsset() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.wallet.core.sign.cardano.CardanoMultiAsset */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardanoMultiAsset copy$default(CardanoMultiAsset cardanoMultiAsset, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardanoMultiAsset.policyId;
        }
        if ((i & 2) != 0) {
            list = cardanoMultiAsset.assets;
        }
        return cardanoMultiAsset.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.policyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CardanoAsset> component2() {
        return this.assets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardanoMultiAsset copy(@NotNull String str, List<CardanoAsset> list) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CardanoMultiAsset(str, list);
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
        if (!(obj instanceof CardanoMultiAsset)) {
            return false;
        }
        CardanoMultiAsset cardanoMultiAsset = (CardanoMultiAsset) obj;
        return Intrinsics.EZpvd((Object) this.policyId, (Object) cardanoMultiAsset.policyId) && Intrinsics.EZpvd(this.assets, cardanoMultiAsset.assets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CardanoAsset> getAssets() {
        return this.assets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPolicyId() {
        return this.policyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.policyId.hashCode();
        List<CardanoAsset> list = this.assets;
        return (iHashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssets(List<CardanoAsset> list) {
        this.assets = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPolicyId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.policyId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CardanoMultiAsset(policyId=" + this.policyId + ", assets=" + this.assets + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.policyId);
        List<CardanoAsset> list = this.assets;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<CardanoAsset> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.cardano.CardanoMultiAsset.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CardanoMultiAsset> serializer() {
            return CardanoMultiAsset$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CardanoMultiAsset(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.policyId = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.assets = null;
        } else {
            this.assets = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(CardanoMultiAsset cardanoMultiAsset, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) cardanoMultiAsset.policyId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, cardanoMultiAsset.policyId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && cardanoMultiAsset.assets == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], cardanoMultiAsset.assets);
    }

    public CardanoMultiAsset(@NotNull String str, List<CardanoAsset> list) {
        Intrinsics.checkNotNullParameter(str, "");
        this.policyId = str;
        this.assets = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<com.okinc.wallet.core.sign.cardano.CardanoAsset>):void (m)] (LINE:33) call: com.okinc.wallet.core.sign.cardano.CardanoMultiAsset.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ CardanoMultiAsset(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : list);
    }
}
