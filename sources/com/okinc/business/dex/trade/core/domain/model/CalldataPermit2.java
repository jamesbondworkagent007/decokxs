package com.okinc.business.dex.trade.core.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CalldataPermit2 {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String signature;
    private final String unsignedTx;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CalldataPermit2() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CalldataPermit2 copy$default(CalldataPermit2 calldataPermit2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = calldataPermit2.unsignedTx;
        }
        if ((i & 2) != 0) {
            str2 = calldataPermit2.signature;
        }
        return calldataPermit2.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.unsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CalldataPermit2 copy(String str, String str2) {
        return new CalldataPermit2(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalldataPermit2)) {
            return false;
        }
        CalldataPermit2 calldataPermit2 = (CalldataPermit2) obj;
        return Intrinsics.EZpvd((Object) this.unsignedTx, (Object) calldataPermit2.unsignedTx) && Intrinsics.EZpvd((Object) this.signature, (Object) calldataPermit2.signature);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnsignedTx() {
        return this.unsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.unsignedTx;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.signature;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CalldataPermit2(unsignedTx=" + this.unsignedTx + ", signature=" + this.signature + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.CalldataPermit2.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CalldataPermit2> serializer() {
            return CalldataPermit2$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CalldataPermit2(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.unsignedTx = null;
        } else {
            this.unsignedTx = str;
        }
        if ((i & 2) == 0) {
            this.signature = null;
        } else {
            this.signature = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CalldataPermit2 calldataPermit2, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || calldataPermit2.unsignedTx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, calldataPermit2.unsignedTx);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && calldataPermit2.signature == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, calldataPermit2.signature);
    }

    public CalldataPermit2(String str, String str2) {
        this.unsignedTx = str;
        this.signature = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:50) call: com.okinc.business.dex.trade.core.domain.model.CalldataPermit2.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CalldataPermit2(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
