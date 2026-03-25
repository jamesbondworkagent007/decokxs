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
public final class CardanoMultiAssetInfo implements Parcelable {
    private ArrayList<CardanoAssetInfo> assets;
    private String policyId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CardanoMultiAssetInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(CardanoAssetInfo$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<CardanoMultiAssetInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardanoMultiAssetInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(CardanoAssetInfo.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new CardanoMultiAssetInfo(string, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardanoMultiAssetInfo[] newArray(int i) {
            return new CardanoMultiAssetInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CardanoMultiAssetInfo() {
        this((String) null, (ArrayList) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.CardanoMultiAssetInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardanoMultiAssetInfo copy$default(CardanoMultiAssetInfo cardanoMultiAssetInfo, String str, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardanoMultiAssetInfo.policyId;
        }
        if ((i & 2) != 0) {
            arrayList = cardanoMultiAssetInfo.assets;
        }
        return cardanoMultiAssetInfo.copy(str, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.policyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<CardanoAssetInfo> component2() {
        return this.assets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardanoMultiAssetInfo copy(String str, ArrayList<CardanoAssetInfo> arrayList) {
        return new CardanoMultiAssetInfo(str, arrayList);
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
        if (!(obj instanceof CardanoMultiAssetInfo)) {
            return false;
        }
        CardanoMultiAssetInfo cardanoMultiAssetInfo = (CardanoMultiAssetInfo) obj;
        return Intrinsics.EZpvd((Object) this.policyId, (Object) cardanoMultiAssetInfo.policyId) && Intrinsics.EZpvd(this.assets, cardanoMultiAssetInfo.assets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<CardanoAssetInfo> getAssets() {
        return this.assets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPolicyId() {
        return this.policyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.policyId;
        int iHashCode = str == null ? 0 : str.hashCode();
        ArrayList<CardanoAssetInfo> arrayList = this.assets;
        return (iHashCode * 31) + (arrayList != null ? arrayList.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssets(ArrayList<CardanoAssetInfo> arrayList) {
        this.assets = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPolicyId(String str) {
        this.policyId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CardanoMultiAssetInfo(policyId=" + this.policyId + ", assets=" + this.assets + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.policyId);
        ArrayList<CardanoAssetInfo> arrayList = this.assets;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList.size());
        Iterator<CardanoAssetInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CardanoMultiAssetInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CardanoMultiAssetInfo> serializer() {
            return CardanoMultiAssetInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CardanoMultiAssetInfo(int i, String str, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.policyId = null;
        } else {
            this.policyId = str;
        }
        if ((i & 2) == 0) {
            this.assets = null;
        } else {
            this.assets = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CardanoMultiAssetInfo cardanoMultiAssetInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || cardanoMultiAssetInfo.policyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, cardanoMultiAssetInfo.policyId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && cardanoMultiAssetInfo.assets == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], cardanoMultiAssetInfo.assets);
    }

    public CardanoMultiAssetInfo(String str, ArrayList<CardanoAssetInfo> arrayList) {
        this.policyId = str;
        this.assets = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r3v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.util.ArrayList<com.okinc.business.defi.biz.net.bean.CardanoAssetInfo>):void (m)] (LINE:378) call: com.okinc.business.defi.biz.net.bean.CardanoMultiAssetInfo.<init>(java.lang.String, java.util.ArrayList):void type: THIS */
    public /* synthetic */ CardanoMultiAssetInfo(String str, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : arrayList);
    }
}
