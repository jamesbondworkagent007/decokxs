package com.okinc.wallet.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class WalletRechargeBean implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final boolean addCustomToken;
    private final int addressType;
    private final String bizSource;
    private final ArrayList<String> blackList;
    private final String chainId;
    private final String scene;
    private final String tip;
    private final String tokenAddress;
    private final ArrayList<String> whiteList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<WalletRechargeBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<WalletRechargeBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletRechargeBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WalletRechargeBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletRechargeBean[] newArray(int i) {
            return new WalletRechargeBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.bizSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.scene;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component5() {
        return this.blackList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component6() {
        return this.whiteList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.addCustomToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletRechargeBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, ArrayList<String> arrayList, ArrayList<String> arrayList2, boolean z, @NotNull String str5, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new WalletRechargeBean(str, str2, str3, str4, arrayList, arrayList2, z, str5, i);
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
        if (!(obj instanceof WalletRechargeBean)) {
            return false;
        }
        WalletRechargeBean walletRechargeBean = (WalletRechargeBean) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) walletRechargeBean.chainId) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) walletRechargeBean.tokenAddress) && Intrinsics.EZpvd((Object) this.bizSource, (Object) walletRechargeBean.bizSource) && Intrinsics.EZpvd((Object) this.scene, (Object) walletRechargeBean.scene) && Intrinsics.EZpvd(this.blackList, walletRechargeBean.blackList) && Intrinsics.EZpvd(this.whiteList, walletRechargeBean.whiteList) && this.addCustomToken == walletRechargeBean.addCustomToken && Intrinsics.EZpvd((Object) this.tip, (Object) walletRechargeBean.tip) && this.addressType == walletRechargeBean.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAddCustomToken() {
        return this.addCustomToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAddressType() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizSource() {
        return this.bizSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getBlackList() {
        return this.blackList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getScene() {
        return this.scene;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTip() {
        return this.tip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getWhiteList() {
        return this.whiteList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainId.hashCode();
        int iHashCode2 = this.tokenAddress.hashCode();
        int iHashCode3 = this.bizSource.hashCode();
        int iHashCode4 = this.scene.hashCode();
        ArrayList<String> arrayList = this.blackList;
        int iHashCode5 = arrayList == null ? 0 : arrayList.hashCode();
        ArrayList<String> arrayList2 = this.whiteList;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31) + Boolean.hashCode(this.addCustomToken)) * 31) + this.tip.hashCode()) * 31) + Integer.hashCode(this.addressType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletRechargeBean(chainId=" + this.chainId + ", tokenAddress=" + this.tokenAddress + ", bizSource=" + this.bizSource + ", scene=" + this.scene + ", blackList=" + this.blackList + ", whiteList=" + this.whiteList + ", addCustomToken=" + this.addCustomToken + ", tip=" + this.tip + ", addressType=" + this.addressType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainId);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.bizSource);
        parcel.writeString(this.scene);
        parcel.writeStringList(this.blackList);
        parcel.writeStringList(this.whiteList);
        parcel.writeInt(this.addCustomToken ? 1 : 0);
        parcel.writeString(this.tip);
        parcel.writeInt(this.addressType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.api.bean.WalletRechargeBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletRechargeBean> serializer() {
            return WalletRechargeBean$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), null, null, null};
    }

    public /* synthetic */ WalletRechargeBean(int i, String str, String str2, String str3, String str4, ArrayList arrayList, ArrayList arrayList2, boolean z, String str5, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, WalletRechargeBean$$serializer.INSTANCE.getDescriptor());
        }
        this.chainId = str;
        this.tokenAddress = str2;
        this.bizSource = str3;
        this.scene = str4;
        if ((i & 16) == 0) {
            this.blackList = null;
        } else {
            this.blackList = arrayList;
        }
        if ((i & 32) == 0) {
            this.whiteList = null;
        } else {
            this.whiteList = arrayList2;
        }
        if ((i & 64) == 0) {
            this.addCustomToken = false;
        } else {
            this.addCustomToken = z;
        }
        if ((i & 128) == 0) {
            this.tip = "";
        } else {
            this.tip = str5;
        }
        if ((i & 256) == 0) {
            this.addressType = -1;
        } else {
            this.addressType = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(WalletRechargeBean walletRechargeBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, walletRechargeBean.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, walletRechargeBean.tokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, walletRechargeBean.bizSource);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, walletRechargeBean.scene);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || walletRechargeBean.blackList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], walletRechargeBean.blackList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || walletRechargeBean.whiteList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], walletRechargeBean.whiteList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || walletRechargeBean.addCustomToken) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, walletRechargeBean.addCustomToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) walletRechargeBean.tip, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, walletRechargeBean.tip);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && walletRechargeBean.addressType == -1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 8, walletRechargeBean.addressType);
    }

    public WalletRechargeBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, ArrayList<String> arrayList, ArrayList<String> arrayList2, boolean z, @NotNull String str5, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.chainId = str;
        this.tokenAddress = str2;
        this.bizSource = str3;
        this.scene = str4;
        this.blackList = arrayList;
        this.whiteList = arrayList2;
        this.addCustomToken = z;
        this.tip = str5;
        this.addressType = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0036: CONSTRUCTOR 
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r18v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x000b: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r19v0 java.util.ArrayList))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0026: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r22v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<java.lang.String>, java.util.ArrayList<java.lang.String>, boolean, java.lang.String, int):void (m)] (LINE:27) call: com.okinc.wallet.api.bean.WalletRechargeBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.util.ArrayList, boolean, java.lang.String, int):void type: THIS */
    public /* synthetic */ WalletRechargeBean(String str, String str2, String str3, String str4, ArrayList arrayList, ArrayList arrayList2, boolean z, String str5, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i2 & 16) != 0 ? null : arrayList, (i2 & 32) != 0 ? null : arrayList2, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? "" : str5, (i2 & 256) != 0 ? -1 : i);
    }
}
