package com.okinc.business.defi.biz.core.transaction.sign.sui.bean;

import com.okinc.wallet.core.sign.sui.SuiObject;
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
public final class SuiInputCoin {
    private String amount;
    private String digest;
    private String objectId;
    private String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SuiInputCoin() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SuiInputCoin copy$default(SuiInputCoin suiInputCoin, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = suiInputCoin.objectId;
        }
        if ((i & 2) != 0) {
            str2 = suiInputCoin.version;
        }
        if ((i & 4) != 0) {
            str3 = suiInputCoin.digest;
        }
        if ((i & 8) != 0) {
            str4 = suiInputCoin.amount;
        }
        return suiInputCoin.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.objectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.digest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SuiInputCoin copy(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SuiInputCoin(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuiInputCoin)) {
            return false;
        }
        SuiInputCoin suiInputCoin = (SuiInputCoin) obj;
        return Intrinsics.EZpvd((Object) this.objectId, (Object) suiInputCoin.objectId) && Intrinsics.EZpvd((Object) this.version, (Object) suiInputCoin.version) && Intrinsics.EZpvd((Object) this.digest, (Object) suiInputCoin.digest) && Intrinsics.EZpvd((Object) this.amount, (Object) suiInputCoin.amount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDigest() {
        return this.digest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getObjectId() {
        return this.objectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.objectId.hashCode();
        int iHashCode2 = this.version.hashCode();
        int iHashCode3 = this.digest.hashCode();
        String str = this.amount;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(String str) {
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDigest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.digest = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setObjectId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.objectId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.version = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SuiInputCoin(objectId=" + this.objectId + ", version=" + this.version + ", digest=" + this.digest + ", amount=" + this.amount + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.sui.bean.SuiInputCoin.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SuiInputCoin> serializer() {
            return SuiInputCoin$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SuiInputCoin(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.objectId = "";
        } else {
            this.objectId = str;
        }
        if ((i & 2) == 0) {
            this.version = "";
        } else {
            this.version = str2;
        }
        if ((i & 4) == 0) {
            this.digest = "";
        } else {
            this.digest = str3;
        }
        if ((i & 8) == 0) {
            this.amount = null;
        } else {
            this.amount = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SuiInputCoin suiInputCoin, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) suiInputCoin.objectId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, suiInputCoin.objectId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) suiInputCoin.version, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, suiInputCoin.version);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) suiInputCoin.digest, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, suiInputCoin.digest);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && suiInputCoin.amount == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, suiInputCoin.amount);
    }

    public SuiInputCoin(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.objectId = str;
        this.version = str2;
        this.digest = str3;
        this.amount = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:21) call: com.okinc.business.defi.biz.core.transaction.sign.sui.bean.SuiInputCoin.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SuiInputCoin(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4);
    }

    public final SuiObject toSuiObject() {
        return new SuiObject(this.objectId, this.version, this.digest);
    }
}
