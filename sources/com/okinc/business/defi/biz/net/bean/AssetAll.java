package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class AssetAll implements Parcelable {
    private String accountId;
    private ArrayList<Portfolio> defis;
    private ArrayList<NftAll> nfts;
    private ArrayList<TokenAsset> tokens;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AssetAll> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(TokenAsset$$serializer.INSTANCE), new ArrayListSerializer(Portfolio$$serializer.INSTANCE), new ArrayListSerializer(NftAll$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<AssetAll> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetAll createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(TokenAsset.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(Portfolio.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i5 = parcel.readInt();
                arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(NftAll.CREATOR.createFromParcel(parcel));
                }
            }
            return new AssetAll(string, arrayList, arrayList2, arrayList3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetAll[] newArray(int i) {
            return new AssetAll[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AssetAll() {
        this((String) null, (ArrayList) null, (ArrayList) null, (ArrayList) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.AssetAll */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AssetAll copy$default(AssetAll assetAll, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assetAll.accountId;
        }
        if ((i & 2) != 0) {
            arrayList = assetAll.tokens;
        }
        if ((i & 4) != 0) {
            arrayList2 = assetAll.defis;
        }
        if ((i & 8) != 0) {
            arrayList3 = assetAll.nfts;
        }
        return assetAll.copy(str, arrayList, arrayList2, arrayList3);
    }

    @SerialName("aid")
    public static /* synthetic */ void getAccountId$annotations() {
    }

    @SerialName("dfs")
    public static /* synthetic */ void getDefis$annotations() {
    }

    @SerialName("nfts")
    public static /* synthetic */ void getNfts$annotations() {
    }

    @SerialName("tks")
    public static /* synthetic */ void getTokens$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<TokenAsset> component2() {
        return this.tokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Portfolio> component3() {
        return this.defis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<NftAll> component4() {
        return this.nfts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetAll copy(@NotNull String str, ArrayList<TokenAsset> arrayList, ArrayList<Portfolio> arrayList2, ArrayList<NftAll> arrayList3) {
        Intrinsics.checkNotNullParameter(str, "");
        return new AssetAll(str, arrayList, arrayList2, arrayList3);
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
        if (!(obj instanceof AssetAll)) {
            return false;
        }
        AssetAll assetAll = (AssetAll) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) assetAll.accountId) && Intrinsics.EZpvd(this.tokens, assetAll.tokens) && Intrinsics.EZpvd(this.defis, assetAll.defis) && Intrinsics.EZpvd(this.nfts, assetAll.nfts);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Portfolio> getDefis() {
        return this.defis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<NftAll> getNfts() {
        return this.nfts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<TokenAsset> getTokens() {
        return this.tokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.accountId.hashCode();
        ArrayList<TokenAsset> arrayList = this.tokens;
        int iHashCode2 = arrayList == null ? 0 : arrayList.hashCode();
        ArrayList<Portfolio> arrayList2 = this.defis;
        int iHashCode3 = arrayList2 == null ? 0 : arrayList2.hashCode();
        ArrayList<NftAll> arrayList3 = this.nfts;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (arrayList3 != null ? arrayList3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDefis(ArrayList<Portfolio> arrayList) {
        this.defis = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNfts(ArrayList<NftAll> arrayList) {
        this.nfts = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokens(ArrayList<TokenAsset> arrayList) {
        this.tokens = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AssetAll(accountId=" + this.accountId + ", tokens=" + this.tokens + ", defis=" + this.defis + ", nfts=" + this.nfts + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accountId);
        ArrayList<TokenAsset> arrayList = this.tokens;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<TokenAsset> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        ArrayList<Portfolio> arrayList2 = this.defis;
        if (arrayList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList2.size());
            Iterator<Portfolio> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        ArrayList<NftAll> arrayList3 = this.nfts;
        if (arrayList3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList3.size());
        Iterator<NftAll> it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.AssetAll.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AssetAll> serializer() {
            return AssetAll$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AssetAll(int i, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SerializationConstructorMarker serializationConstructorMarker) {
        this.accountId = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.tokens = null;
        } else {
            this.tokens = arrayList;
        }
        if ((i & 4) == 0) {
            this.defis = null;
        } else {
            this.defis = arrayList2;
        }
        if ((i & 8) == 0) {
            this.nfts = null;
        } else {
            this.nfts = arrayList3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(AssetAll assetAll, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) assetAll.accountId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, assetAll.accountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || assetAll.tokens != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], assetAll.tokens);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || assetAll.defis != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], assetAll.defis);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && assetAll.nfts == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], assetAll.nfts);
    }

    public AssetAll(@NotNull String str, ArrayList<TokenAsset> arrayList, ArrayList<Portfolio> arrayList2, ArrayList<NftAll> arrayList3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountId = str;
        this.tokens = arrayList;
        this.defis = arrayList2;
        this.nfts = arrayList3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r3v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r4v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r5v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.util.ArrayList<com.okinc.business.defi.biz.net.bean.TokenAsset>, java.util.ArrayList<com.okinc.business.defi.biz.net.bean.Portfolio>, java.util.ArrayList<com.okinc.business.defi.biz.net.bean.NftAll>):void (m)] (LINE:365) call: com.okinc.business.defi.biz.net.bean.AssetAll.<init>(java.lang.String, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void type: THIS */
    public /* synthetic */ AssetAll(String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : arrayList, (i & 4) != 0 ? null : arrayList2, (i & 8) != 0 ? null : arrayList3);
    }
}
