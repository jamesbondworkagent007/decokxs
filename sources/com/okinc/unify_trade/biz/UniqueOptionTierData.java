package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class UniqueOptionTierData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String left;
    private final String middle;
    private final String right;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniqueOptionTierData() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UniqueOptionTierData copy$default(UniqueOptionTierData uniqueOptionTierData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uniqueOptionTierData.left;
        }
        if ((i & 2) != 0) {
            str2 = uniqueOptionTierData.middle;
        }
        if ((i & 4) != 0) {
            str3 = uniqueOptionTierData.right;
        }
        return uniqueOptionTierData.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.left;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.middle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.right;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UniqueOptionTierData copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new UniqueOptionTierData(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniqueOptionTierData)) {
            return false;
        }
        UniqueOptionTierData uniqueOptionTierData = (UniqueOptionTierData) obj;
        return Intrinsics.EZpvd((Object) this.left, (Object) uniqueOptionTierData.left) && Intrinsics.EZpvd((Object) this.middle, (Object) uniqueOptionTierData.middle) && Intrinsics.EZpvd((Object) this.right, (Object) uniqueOptionTierData.right);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeft() {
        return this.left;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMiddle() {
        return this.middle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRight() {
        return this.right;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.left.hashCode() * 31) + this.middle.hashCode()) * 31) + this.right.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UniqueOptionTierData(left=" + this.left + ", middle=" + this.middle + ", right=" + this.right + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.UniqueOptionTierData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UniqueOptionTierData> serializer() {
            return UniqueOptionTierData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UniqueOptionTierData(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.left = "";
        } else {
            this.left = str;
        }
        if ((i & 2) == 0) {
            this.middle = "";
        } else {
            this.middle = str2;
        }
        if ((i & 4) == 0) {
            this.right = "";
        } else {
            this.right = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(UniqueOptionTierData uniqueOptionTierData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) uniqueOptionTierData.left, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, uniqueOptionTierData.left);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) uniqueOptionTierData.middle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, uniqueOptionTierData.middle);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) uniqueOptionTierData.right, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, uniqueOptionTierData.right);
    }

    public UniqueOptionTierData(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.left = str;
        this.middle = str2;
        this.right = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:209) call: com.okinc.unify_trade.biz.UniqueOptionTierData.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ UniqueOptionTierData(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
