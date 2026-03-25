package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InHouseIMCtaIcon {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String dark;
    private final String light;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InHouseIMCtaIcon() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InHouseIMCtaIcon copy$default(InHouseIMCtaIcon inHouseIMCtaIcon, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inHouseIMCtaIcon.light;
        }
        if ((i & 2) != 0) {
            str2 = inHouseIMCtaIcon.dark;
        }
        return inHouseIMCtaIcon.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.light;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.dark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMCtaIcon copy(String str, String str2) {
        return new InHouseIMCtaIcon(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InHouseIMCtaIcon)) {
            return false;
        }
        InHouseIMCtaIcon inHouseIMCtaIcon = (InHouseIMCtaIcon) obj;
        return Intrinsics.EZpvd((Object) this.light, (Object) inHouseIMCtaIcon.light) && Intrinsics.EZpvd((Object) this.dark, (Object) inHouseIMCtaIcon.dark);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDark() {
        return this.dark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLight() {
        return this.light;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.light;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.dark;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMCtaIcon(light=" + this.light + ", dark=" + this.dark + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.InHouseIMCtaIcon.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseIMCtaIcon> serializer() {
            return InHouseIMCtaIcon$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InHouseIMCtaIcon(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.light = null;
        } else {
            this.light = str;
        }
        if ((i & 2) == 0) {
            this.dark = null;
        } else {
            this.dark = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(InHouseIMCtaIcon inHouseIMCtaIcon, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || inHouseIMCtaIcon.light != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, inHouseIMCtaIcon.light);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && inHouseIMCtaIcon.dark == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, inHouseIMCtaIcon.dark);
    }

    public InHouseIMCtaIcon(String str, String str2) {
        this.light = str;
        this.dark = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:197) call: com.okinc.okimcore.model.remote.InHouseIMCtaIcon.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InHouseIMCtaIcon(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
