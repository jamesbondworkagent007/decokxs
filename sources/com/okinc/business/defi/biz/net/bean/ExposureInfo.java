package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class ExposureInfo implements Parcelable {
    private final Asset asset;
    private final String expiration;
    private final String spenderKey;
    private final Spender spenderValue;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = Spender.$stable | Asset.$stable;
    public static final Parcelable.Creator<ExposureInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ExposureInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExposureInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ExposureInfo((Asset) parcel.readParcelable(ExposureInfo.class.getClassLoader()), parcel.readString(), (Spender) parcel.readParcelable(ExposureInfo.class.getClassLoader()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExposureInfo[] newArray(int i) {
            return new ExposureInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ExposureInfo() {
        this((Asset) null, (String) null, (Spender) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ExposureInfo copy$default(ExposureInfo exposureInfo, Asset asset, String str, Spender spender, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            asset = exposureInfo.asset;
        }
        if ((i & 2) != 0) {
            str = exposureInfo.spenderKey;
        }
        if ((i & 4) != 0) {
            spender = exposureInfo.spenderValue;
        }
        if ((i & 8) != 0) {
            str2 = exposureInfo.expiration;
        }
        return exposureInfo.copy(asset, str, spender, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Asset component1() {
        return this.asset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.spenderKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Spender component3() {
        return this.spenderValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.expiration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExposureInfo copy(Asset asset, String str, Spender spender, String str2) {
        return new ExposureInfo(asset, str, spender, str2);
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
        if (!(obj instanceof ExposureInfo)) {
            return false;
        }
        ExposureInfo exposureInfo = (ExposureInfo) obj;
        return Intrinsics.EZpvd(this.asset, exposureInfo.asset) && Intrinsics.EZpvd((Object) this.spenderKey, (Object) exposureInfo.spenderKey) && Intrinsics.EZpvd(this.spenderValue, exposureInfo.spenderValue) && Intrinsics.EZpvd((Object) this.expiration, (Object) exposureInfo.expiration);
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
    public final String getSpenderKey() {
        return this.spenderKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Spender getSpenderValue() {
        return this.spenderValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Asset asset = this.asset;
        int iHashCode = asset == null ? 0 : asset.hashCode();
        String str = this.spenderKey;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Spender spender = this.spenderValue;
        int iHashCode3 = spender == null ? 0 : spender.hashCode();
        String str2 = this.expiration;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ExposureInfo(asset=" + this.asset + ", spenderKey=" + this.spenderKey + ", spenderValue=" + this.spenderValue + ", expiration=" + this.expiration + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.asset, i);
        parcel.writeString(this.spenderKey);
        parcel.writeParcelable(this.spenderValue, i);
        parcel.writeString(this.expiration);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.ExposureInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ExposureInfo> serializer() {
            return ExposureInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ExposureInfo(int i, Asset asset, String str, Spender spender, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.asset = null;
        } else {
            this.asset = asset;
        }
        if ((i & 2) == 0) {
            this.spenderKey = null;
        } else {
            this.spenderKey = str;
        }
        if ((i & 4) == 0) {
            this.spenderValue = null;
        } else {
            this.spenderValue = spender;
        }
        if ((i & 8) == 0) {
            this.expiration = null;
        } else {
            this.expiration = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ExposureInfo exposureInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || exposureInfo.asset != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, Asset$$serializer.INSTANCE, exposureInfo.asset);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || exposureInfo.spenderKey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, exposureInfo.spenderKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || exposureInfo.spenderValue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, Spender$$serializer.INSTANCE, exposureInfo.spenderValue);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && exposureInfo.expiration == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, exposureInfo.expiration);
    }

    public ExposureInfo(Asset asset, String str, Spender spender, String str2) {
        this.asset = asset;
        this.spenderKey = str;
        this.spenderValue = spender;
        this.expiration = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:com.okinc.business.defi.biz.net.bean.Asset:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.Asset) : (r2v0 com.okinc.business.defi.biz.net.bean.Asset))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:com.okinc.business.defi.biz.net.bean.Spender:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.Spender) : (r4v0 com.okinc.business.defi.biz.net.bean.Spender))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(com.okinc.business.defi.biz.net.bean.Asset, java.lang.String, com.okinc.business.defi.biz.net.bean.Spender, java.lang.String):void (m)] (LINE:464) call: com.okinc.business.defi.biz.net.bean.ExposureInfo.<init>(com.okinc.business.defi.biz.net.bean.Asset, java.lang.String, com.okinc.business.defi.biz.net.bean.Spender, java.lang.String):void type: THIS */
    public /* synthetic */ ExposureInfo(Asset asset, String str, Spender spender, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : asset, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : spender, (i & 8) != 0 ? null : str2);
    }
}
