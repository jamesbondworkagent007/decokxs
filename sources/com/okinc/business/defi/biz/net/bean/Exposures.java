package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class Exposures implements Parcelable {
    private final Asset asset;
    private final String expiration;
    private final Map<String, Spender> spenders;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Exposures> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new LinkedHashMapSerializer(StringSerializer.INSTANCE, Spender$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<Exposures> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Exposures createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            LinkedHashMap linkedHashMap = null;
            Asset assetCreateFromParcel = parcel.readInt() == 0 ? null : Asset.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap2.put(parcel.readString(), Spender.CREATOR.createFromParcel(parcel));
                }
                linkedHashMap = linkedHashMap2;
            }
            return new Exposures(assetCreateFromParcel, linkedHashMap, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Exposures[] newArray(int i) {
            return new Exposures[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Exposures() {
        this((Asset) null, (Map) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.Exposures */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Exposures copy$default(Exposures exposures, Asset asset, Map map, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            asset = exposures.asset;
        }
        if ((i & 2) != 0) {
            map = exposures.spenders;
        }
        if ((i & 4) != 0) {
            str = exposures.expiration;
        }
        return exposures.copy(asset, map, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Asset component1() {
        return this.asset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Spender> component2() {
        return this.spenders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.expiration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Exposures copy(Asset asset, Map<String, Spender> map, String str) {
        return new Exposures(asset, map, str);
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
        if (!(obj instanceof Exposures)) {
            return false;
        }
        Exposures exposures = (Exposures) obj;
        return Intrinsics.EZpvd(this.asset, exposures.asset) && Intrinsics.EZpvd(this.spenders, exposures.spenders) && Intrinsics.EZpvd((Object) this.expiration, (Object) exposures.expiration);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Asset getAsset() {
        return this.asset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpiration() {
        return this.expiration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Spender> getSpenders() {
        return this.spenders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Asset asset = this.asset;
        int iHashCode = asset == null ? 0 : asset.hashCode();
        Map<String, Spender> map = this.spenders;
        int iHashCode2 = map == null ? 0 : map.hashCode();
        String str = this.expiration;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Exposures(asset=" + this.asset + ", spenders=" + this.spenders + ", expiration=" + this.expiration + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Asset asset = this.asset;
        if (asset == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            asset.writeToParcel(parcel, i);
        }
        Map<String, Spender> map = this.spenders;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, Spender> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                entry.getValue().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.expiration);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.Exposures.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Exposures> serializer() {
            return Exposures$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Exposures(int i, Asset asset, Map map, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.asset = null;
        } else {
            this.asset = asset;
        }
        if ((i & 2) == 0) {
            this.spenders = null;
        } else {
            this.spenders = map;
        }
        if ((i & 4) == 0) {
            this.expiration = null;
        } else {
            this.expiration = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(Exposures exposures, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || exposures.asset != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, Asset$$serializer.INSTANCE, exposures.asset);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || exposures.spenders != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], exposures.spenders);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && exposures.expiration == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, exposures.expiration);
    }

    public Exposures(Asset asset, Map<String, Spender> map, String str) {
        this.asset = asset;
        this.spenders = map;
        this.expiration = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.okinc.business.defi.biz.net.bean.Asset:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.Asset) : (r2v0 com.okinc.business.defi.biz.net.bean.Asset))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r3v0 java.util.Map))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(com.okinc.business.defi.biz.net.bean.Asset, java.util.Map<java.lang.String, com.okinc.business.defi.biz.net.bean.Spender>, java.lang.String):void (m)] (LINE:165) call: com.okinc.business.defi.biz.net.bean.Exposures.<init>(com.okinc.business.defi.biz.net.bean.Asset, java.util.Map, java.lang.String):void type: THIS */
    public /* synthetic */ Exposures(Asset asset, Map map, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : asset, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : str);
    }
}
