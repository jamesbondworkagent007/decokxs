package com.okinc.unify_find.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class UpDownRank extends BaseRank {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String ccyV2;
    private final String changePer;
    private final String fullNameV2;
    private final String iconV2;
    private final String lastPrice;
    private final String turnOverV2;
    private final String volumeV2;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UpDownRank() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UpDownRank copy$default(UpDownRank upDownRank, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = upDownRank.iconV2;
        }
        if ((i & 2) != 0) {
            str2 = upDownRank.fullNameV2;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = upDownRank.volumeV2;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = upDownRank.turnOverV2;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = upDownRank.lastPrice;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = upDownRank.changePer;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = upDownRank.ccyV2;
        }
        return upDownRank.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.iconV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fullNameV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.volumeV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.turnOverV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.changePer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.ccyV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpDownRank copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new UpDownRank(str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpDownRank)) {
            return false;
        }
        UpDownRank upDownRank = (UpDownRank) obj;
        return Intrinsics.EZpvd((Object) this.iconV2, (Object) upDownRank.iconV2) && Intrinsics.EZpvd((Object) this.fullNameV2, (Object) upDownRank.fullNameV2) && Intrinsics.EZpvd((Object) this.volumeV2, (Object) upDownRank.volumeV2) && Intrinsics.EZpvd((Object) this.turnOverV2, (Object) upDownRank.turnOverV2) && Intrinsics.EZpvd((Object) this.lastPrice, (Object) upDownRank.lastPrice) && Intrinsics.EZpvd((Object) this.changePer, (Object) upDownRank.changePer) && Intrinsics.EZpvd((Object) this.ccyV2, (Object) upDownRank.ccyV2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcyV2() {
        return this.ccyV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangePer() {
        return this.changePer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullNameV2() {
        return this.fullNameV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconV2() {
        return this.iconV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastPrice() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTurnOverV2() {
        return this.turnOverV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolumeV2() {
        return this.volumeV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.iconV2.hashCode() * 31) + this.fullNameV2.hashCode()) * 31) + this.volumeV2.hashCode()) * 31) + this.turnOverV2.hashCode()) * 31) + this.lastPrice.hashCode()) * 31) + this.changePer.hashCode()) * 31) + this.ccyV2.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UpDownRank(iconV2=" + this.iconV2 + ", fullNameV2=" + this.fullNameV2 + ", volumeV2=" + this.volumeV2 + ", turnOverV2=" + this.turnOverV2 + ", lastPrice=" + this.lastPrice + ", changePer=" + this.changePer + ", ccyV2=" + this.ccyV2 + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_find.data.UpDownRank.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UpDownRank> serializer() {
            return UpDownRank$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UpDownRank(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, str2, serializationConstructorMarker);
        if ((i & 4) == 0) {
            this.iconV2 = "";
        } else {
            this.iconV2 = str3;
        }
        if ((i & 8) == 0) {
            this.fullNameV2 = "";
        } else {
            this.fullNameV2 = str4;
        }
        if ((i & 16) == 0) {
            this.volumeV2 = "";
        } else {
            this.volumeV2 = str5;
        }
        if ((i & 32) == 0) {
            this.turnOverV2 = "";
        } else {
            this.turnOverV2 = str6;
        }
        if ((i & 64) == 0) {
            this.lastPrice = "";
        } else {
            this.lastPrice = str7;
        }
        if ((i & 128) == 0) {
            this.changePer = "";
        } else {
            this.changePer = str8;
        }
        if ((i & 256) == 0) {
            this.ccyV2 = "";
        } else {
            this.ccyV2 = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKMarket_market_impl(UpDownRank upDownRank, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        BaseRank.write$Self(upDownRank, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) upDownRank.iconV2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, upDownRank.iconV2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) upDownRank.fullNameV2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, upDownRank.fullNameV2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) upDownRank.volumeV2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, upDownRank.volumeV2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) upDownRank.turnOverV2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, upDownRank.turnOverV2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) upDownRank.lastPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, upDownRank.lastPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) upDownRank.changePer, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, upDownRank.changePer);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd((Object) upDownRank.ccyV2, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 8, upDownRank.ccyV2);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:101) call: com.okinc.unify_find.data.UpDownRank.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ UpDownRank(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpDownRank(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        super((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.iconV2 = str;
        this.fullNameV2 = str2;
        this.volumeV2 = str3;
        this.turnOverV2 = str4;
        this.lastPrice = str5;
        this.changePer = str6;
        this.ccyV2 = str7;
    }
}
