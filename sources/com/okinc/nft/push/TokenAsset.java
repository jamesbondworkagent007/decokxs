package com.okinc.nft.push;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class TokenAsset implements Parcelable {
    private String batchTransferInfo;
    private String batchTxState;
    private long chain;
    private String payload;
    private int scene;
    private List<String> speedTxHash;
    private int status;
    private String txHash;
    private String uopHash;
    private String urlPre;
    private String userWalletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TokenAsset> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null};

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<TokenAsset> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenAsset createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TokenAsset(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenAsset[] newArray(int i) {
            return new TokenAsset[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenAsset() {
        this((String) null, (String) null, 0, 0L, 0, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.batchTransferInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.scene;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.chain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.urlPre;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component8() {
        return this.speedTxHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.batchTxState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenAsset copy(@NotNull String str, @NotNull String str2, int i, long j, int i2, @NotNull String str3, @NotNull String str4, @NotNull List<String> list, String str5, String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new TokenAsset(str, str2, i, j, i2, str3, str4, list, str5, str6, str7);
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
        if (!(obj instanceof TokenAsset)) {
            return false;
        }
        TokenAsset tokenAsset = (TokenAsset) obj;
        return Intrinsics.EZpvd((Object) this.txHash, (Object) tokenAsset.txHash) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) tokenAsset.userWalletAddress) && this.scene == tokenAsset.scene && this.chain == tokenAsset.chain && this.status == tokenAsset.status && Intrinsics.EZpvd((Object) this.urlPre, (Object) tokenAsset.urlPre) && Intrinsics.EZpvd((Object) this.payload, (Object) tokenAsset.payload) && Intrinsics.EZpvd(this.speedTxHash, tokenAsset.speedTxHash) && Intrinsics.EZpvd((Object) this.batchTxState, (Object) tokenAsset.batchTxState) && Intrinsics.EZpvd((Object) this.batchTransferInfo, (Object) tokenAsset.batchTransferInfo) && Intrinsics.EZpvd((Object) this.uopHash, (Object) tokenAsset.uopHash);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBatchTransferInfo() {
        return this.batchTransferInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBatchTxState() {
        return this.batchTxState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChain() {
        return this.chain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPayload() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getScene() {
        return this.scene;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSpeedTxHash() {
        return this.speedTxHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxHash() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUopHash() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrlPre() {
        return this.urlPre;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.txHash.hashCode();
        int iHashCode2 = this.userWalletAddress.hashCode();
        int iHashCode3 = Integer.hashCode(this.scene);
        int iHashCode4 = Long.hashCode(this.chain);
        int iHashCode5 = Integer.hashCode(this.status);
        int iHashCode6 = this.urlPre.hashCode();
        int iHashCode7 = this.payload.hashCode();
        int iHashCode8 = this.speedTxHash.hashCode();
        String str = this.batchTxState;
        int iHashCode9 = str == null ? 0 : str.hashCode();
        String str2 = this.batchTransferInfo;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.uopHash.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBatchTransferInfo(String str) {
        this.batchTransferInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBatchTxState(String str) {
        this.batchTxState = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChain(long j) {
        this.chain = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPayload(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.payload = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setScene(int i) {
        this.scene = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpeedTxHash(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.speedTxHash = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(int i) {
        this.status = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxHash(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.txHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUopHash(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uopHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrlPre(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.urlPre = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserWalletAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userWalletAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenAsset(txHash=" + this.txHash + ", userWalletAddress=" + this.userWalletAddress + ", scene=" + this.scene + ", chain=" + this.chain + ", status=" + this.status + ", urlPre=" + this.urlPre + ", payload=" + this.payload + ", speedTxHash=" + this.speedTxHash + ", batchTxState=" + this.batchTxState + ", batchTransferInfo=" + this.batchTransferInfo + ", uopHash=" + this.uopHash + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.txHash);
        parcel.writeString(this.userWalletAddress);
        parcel.writeInt(this.scene);
        parcel.writeLong(this.chain);
        parcel.writeInt(this.status);
        parcel.writeString(this.urlPre);
        parcel.writeString(this.payload);
        parcel.writeStringList(this.speedTxHash);
        parcel.writeString(this.batchTxState);
        parcel.writeString(this.batchTransferInfo);
        parcel.writeString(this.uopHash);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.nft.push.TokenAsset.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenAsset> serializer() {
            return TokenAsset$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenAsset(int i, String str, String str2, int i2, long j, int i3, String str3, String str4, List list, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.txHash = "";
        } else {
            this.txHash = str;
        }
        if ((i & 2) == 0) {
            this.userWalletAddress = "";
        } else {
            this.userWalletAddress = str2;
        }
        if ((i & 4) == 0) {
            this.scene = 0;
        } else {
            this.scene = i2;
        }
        if ((i & 8) == 0) {
            this.chain = 0L;
        } else {
            this.chain = j;
        }
        if ((i & 16) == 0) {
            this.status = 0;
        } else {
            this.status = i3;
        }
        if ((i & 32) == 0) {
            this.urlPre = "";
        } else {
            this.urlPre = str3;
        }
        if ((i & 64) == 0) {
            this.payload = "";
        } else {
            this.payload = str4;
        }
        if ((i & 128) == 0) {
            this.speedTxHash = yDY.AhwBna();
        } else {
            this.speedTxHash = list;
        }
        if ((i & 256) == 0) {
            this.batchTxState = null;
        } else {
            this.batchTxState = str5;
        }
        if ((i & 512) == 0) {
            this.batchTransferInfo = null;
        } else {
            this.batchTransferInfo = str6;
        }
        if ((i & 1024) == 0) {
            this.uopHash = "";
        } else {
            this.uopHash = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKNFT_ok_nft(TokenAsset tokenAsset, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tokenAsset.txHash, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tokenAsset.txHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tokenAsset.userWalletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tokenAsset.userWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || tokenAsset.scene != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, tokenAsset.scene);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || tokenAsset.chain != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 3, tokenAsset.chain);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || tokenAsset.status != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, tokenAsset.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) tokenAsset.urlPre, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, tokenAsset.urlPre);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) tokenAsset.payload, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, tokenAsset.payload);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(tokenAsset.speedTxHash, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], tokenAsset.speedTxHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || tokenAsset.batchTxState != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, tokenAsset.batchTxState);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || tokenAsset.batchTransferInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, tokenAsset.batchTransferInfo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && Intrinsics.EZpvd((Object) tokenAsset.uopHash, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 10, tokenAsset.uopHash);
    }

    public TokenAsset(@NotNull String str, @NotNull String str2, int i, long j, int i2, @NotNull String str3, @NotNull String str4, @NotNull List<String> list, String str5, String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.txHash = str;
        this.userWalletAddress = str2;
        this.scene = i;
        this.chain = j;
        this.status = i2;
        this.urlPre = str3;
        this.payload = str4;
        this.speedTxHash = list;
        this.batchTxState = str5;
        this.batchTransferInfo = str6;
        this.uopHash = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0075: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r27v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0013: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r17v0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x001c: ARITH (r27v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r18v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0025: ARITH (r27v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r20v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x003c: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0040: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:19)) : (r23v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r27v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0050: ARITH (r27v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0057: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r26v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, int, long, int, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.nft.push.TokenAsset.<init>(java.lang.String, java.lang.String, int, long, int, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TokenAsset(String str, String str2, int i, long j, int i2, String str3, String str4, List list, String str5, String str6, String str7, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0L : j, (i3 & 16) == 0 ? i2 : 0, (i3 & 32) != 0 ? "" : str3, (i3 & 64) != 0 ? "" : str4, (i3 & 128) != 0 ? yDY.AhwBna() : list, (i3 & 256) != 0 ? null : str5, (i3 & 512) == 0 ? str6 : null, (i3 & 1024) == 0 ? str7 : "");
    }
}
