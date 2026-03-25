package com.okinc.business.defi.biz.model.wallet;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class MpcEncryptData {
    private String ecdsaP2;
    private String ecdsaP3;
    private String ecdsaShare2;
    private String ecdsaShare3;
    private String ed25519Share2;
    private String ed25519Share3;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MpcEncryptData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MpcEncryptData copy$default(MpcEncryptData mpcEncryptData, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mpcEncryptData.ecdsaShare2;
        }
        if ((i & 2) != 0) {
            str2 = mpcEncryptData.ecdsaShare3;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = mpcEncryptData.ed25519Share2;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = mpcEncryptData.ed25519Share3;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = mpcEncryptData.ecdsaP2;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = mpcEncryptData.ecdsaP3;
        }
        return mpcEncryptData.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ecdsaShare2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ecdsaShare3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.ed25519Share2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.ed25519Share3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.ecdsaP2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.ecdsaP3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MpcEncryptData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new MpcEncryptData(str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MpcEncryptData)) {
            return false;
        }
        MpcEncryptData mpcEncryptData = (MpcEncryptData) obj;
        return Intrinsics.EZpvd((Object) this.ecdsaShare2, (Object) mpcEncryptData.ecdsaShare2) && Intrinsics.EZpvd((Object) this.ecdsaShare3, (Object) mpcEncryptData.ecdsaShare3) && Intrinsics.EZpvd((Object) this.ed25519Share2, (Object) mpcEncryptData.ed25519Share2) && Intrinsics.EZpvd((Object) this.ed25519Share3, (Object) mpcEncryptData.ed25519Share3) && Intrinsics.EZpvd((Object) this.ecdsaP2, (Object) mpcEncryptData.ecdsaP2) && Intrinsics.EZpvd((Object) this.ecdsaP3, (Object) mpcEncryptData.ecdsaP3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEcdsaP2() {
        return this.ecdsaP2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEcdsaP3() {
        return this.ecdsaP3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEcdsaShare2() {
        return this.ecdsaShare2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEcdsaShare3() {
        return this.ecdsaShare3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEd25519Share2() {
        return this.ed25519Share2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEd25519Share3() {
        return this.ed25519Share3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.ecdsaShare2.hashCode() * 31) + this.ecdsaShare3.hashCode()) * 31) + this.ed25519Share2.hashCode()) * 31) + this.ed25519Share3.hashCode()) * 31) + this.ecdsaP2.hashCode()) * 31) + this.ecdsaP3.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEcdsaP2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ecdsaP2 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEcdsaP3(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ecdsaP3 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEcdsaShare2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ecdsaShare2 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEcdsaShare3(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ecdsaShare3 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEd25519Share2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ed25519Share2 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEd25519Share3(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ed25519Share3 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MpcEncryptData(ecdsaShare2=" + this.ecdsaShare2 + ", ecdsaShare3=" + this.ecdsaShare3 + ", ed25519Share2=" + this.ed25519Share2 + ", ed25519Share3=" + this.ed25519Share3 + ", ecdsaP2=" + this.ecdsaP2 + ", ecdsaP3=" + this.ecdsaP3 + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.model.wallet.MpcEncryptData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MpcEncryptData> serializer() {
            return MpcEncryptData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MpcEncryptData(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ecdsaShare2 = "";
        } else {
            this.ecdsaShare2 = str;
        }
        if ((i & 2) == 0) {
            this.ecdsaShare3 = "";
        } else {
            this.ecdsaShare3 = str2;
        }
        if ((i & 4) == 0) {
            this.ed25519Share2 = "";
        } else {
            this.ed25519Share2 = str3;
        }
        if ((i & 8) == 0) {
            this.ed25519Share3 = "";
        } else {
            this.ed25519Share3 = str4;
        }
        if ((i & 16) == 0) {
            this.ecdsaP2 = "";
        } else {
            this.ecdsaP2 = str5;
        }
        if ((i & 32) == 0) {
            this.ecdsaP3 = "";
        } else {
            this.ecdsaP3 = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(MpcEncryptData mpcEncryptData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) mpcEncryptData.ecdsaShare2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, mpcEncryptData.ecdsaShare2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) mpcEncryptData.ecdsaShare3, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, mpcEncryptData.ecdsaShare3);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) mpcEncryptData.ed25519Share2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, mpcEncryptData.ed25519Share2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) mpcEncryptData.ed25519Share3, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, mpcEncryptData.ed25519Share3);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) mpcEncryptData.ecdsaP2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, mpcEncryptData.ecdsaP2);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) mpcEncryptData.ecdsaP3, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, mpcEncryptData.ecdsaP3);
    }

    public MpcEncryptData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.ecdsaShare2 = str;
        this.ecdsaShare3 = str2;
        this.ed25519Share2 = str3;
        this.ed25519Share3 = str4;
        this.ecdsaP2 = str5;
        this.ecdsaP3 = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:86) call: com.okinc.business.defi.biz.model.wallet.MpcEncryptData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MpcEncryptData(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}
