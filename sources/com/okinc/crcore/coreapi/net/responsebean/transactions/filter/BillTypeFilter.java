package com.okinc.crcore.coreapi.net.responsebean.transactions.filter;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class BillTypeFilter {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String billType;
    public final String typeDesc;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BillTypeFilter() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BillTypeFilter copy$default(BillTypeFilter billTypeFilter, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = billTypeFilter.billType;
        }
        if ((i & 2) != 0) {
            str2 = billTypeFilter.typeDesc;
        }
        return billTypeFilter.AEQbTJ(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BillTypeFilter AEQbTJ(String str, String str2) {
        return new BillTypeFilter(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillTypeFilter)) {
            return false;
        }
        BillTypeFilter billTypeFilter = (BillTypeFilter) obj;
        return Intrinsics.EZpvd((Object) this.billType, (Object) billTypeFilter.billType) && Intrinsics.EZpvd((Object) this.typeDesc, (Object) billTypeFilter.typeDesc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.billType;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.typeDesc;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BillTypeFilter(billType=" + this.billType + ", typeDesc=" + this.typeDesc + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.transactions.filter.BillTypeFilter.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BillTypeFilter> serializer() {
            return BillTypeFilter$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BillTypeFilter(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.billType = null;
        } else {
            this.billType = str;
        }
        if ((i & 2) == 0) {
            this.typeDesc = null;
        } else {
            this.typeDesc = str2;
        }
    }

    public static final /* synthetic */ void OLrzqt(BillTypeFilter billTypeFilter, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || billTypeFilter.billType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, billTypeFilter.billType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && billTypeFilter.typeDesc == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, billTypeFilter.typeDesc);
    }

    public BillTypeFilter(String str, String str2) {
        this.billType = str;
        this.typeDesc = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:15) call: com.okinc.crcore.coreapi.net.responsebean.transactions.filter.BillTypeFilter.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BillTypeFilter(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
