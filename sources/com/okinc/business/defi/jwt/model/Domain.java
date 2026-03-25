package com.okinc.business.defi.jwt.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class Domain {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int lengthBytes;
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Domain() {
        this(0, (String) null, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Domain copy$default(Domain domain, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = domain.lengthBytes;
        }
        if ((i2 & 2) != 0) {
            str = domain.value;
        }
        return domain.copy(i, str);
    }

    @SerialName("lengthBytes")
    public static /* synthetic */ void getLengthBytes$annotations() {
    }

    @SerialName("value")
    public static /* synthetic */ void getValue$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.lengthBytes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Domain copy(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new Domain(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Domain)) {
            return false;
        }
        Domain domain = (Domain) obj;
        return this.lengthBytes == domain.lengthBytes && Intrinsics.EZpvd((Object) this.value, (Object) domain.value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLengthBytes() {
        return this.lengthBytes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.lengthBytes) * 31) + this.value.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Domain(lengthBytes=" + this.lengthBytes + ", value=" + this.value + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.jwt.model.Domain.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Domain> serializer() {
            return Domain$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Domain(int i, int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.lengthBytes = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.value = "";
        } else {
            this.value = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Domain domain, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || domain.lengthBytes != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, domain.lengthBytes);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) domain.value, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, domain.value);
    }

    public Domain(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lengthBytes = i;
        this.value = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
 A[MD:(int, java.lang.String):void (m)] (LINE:31) call: com.okinc.business.defi.jwt.model.Domain.<init>(int, java.lang.String):void type: THIS */
    public /* synthetic */ Domain(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
    }
}
