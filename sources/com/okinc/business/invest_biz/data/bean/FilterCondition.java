package com.okinc.business.invest_biz.data.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class FilterCondition {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final long chainId;
    public final String filterId;
    public final String logo;
    public final int size;
    public final String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FilterCondition() {
        this((String) null, (String) null, (String) null, 0, 0L, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FilterCondition copy$default(FilterCondition filterCondition, String str, String str2, String str3, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = filterCondition.filterId;
        }
        if ((i2 & 2) != 0) {
            str2 = filterCondition.logo;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = filterCondition.title;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            i = filterCondition.size;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            j = filterCondition.chainId;
        }
        return filterCondition.KWHzl(str, str4, str5, i3, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FilterCondition KWHzl(@NotNull String str, String str2, @NotNull String str3, int i, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new FilterCondition(str, str2, str3, i, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.filterId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterCondition)) {
            return false;
        }
        FilterCondition filterCondition = (FilterCondition) obj;
        return Intrinsics.EZpvd((Object) this.filterId, (Object) filterCondition.filterId) && Intrinsics.EZpvd((Object) this.logo, (Object) filterCondition.logo) && Intrinsics.EZpvd((Object) this.title, (Object) filterCondition.title) && this.size == filterCondition.size && this.chainId == filterCondition.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.filterId.hashCode();
        String str = this.logo;
        return (((((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.size)) * 31) + Long.hashCode(this.chainId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FilterCondition(filterId=" + this.filterId + ", logo=" + this.logo + ", title=" + this.title + ", size=" + this.size + ", chainId=" + this.chainId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.FilterCondition.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FilterCondition> serializer() {
            return FilterCondition$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FilterCondition(int i, String str, String str2, String str3, int i2, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.filterId = "";
        } else {
            this.filterId = str;
        }
        if ((i & 2) == 0) {
            this.logo = null;
        } else {
            this.logo = str2;
        }
        if ((i & 4) == 0) {
            this.title = "";
        } else {
            this.title = str3;
        }
        if ((i & 8) == 0) {
            this.size = -1;
        } else {
            this.size = i2;
        }
        if ((i & 16) == 0) {
            this.chainId = -1L;
        } else {
            this.chainId = j;
        }
    }

    public static final /* synthetic */ void copydefault(FilterCondition filterCondition, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) filterCondition.filterId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, filterCondition.filterId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || filterCondition.logo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, filterCondition.logo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) filterCondition.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, filterCondition.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || filterCondition.size != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, filterCondition.size);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && filterCondition.chainId == -1) {
            return;
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 4, filterCondition.chainId);
    }

    public FilterCondition(@NotNull String str, String str2, @NotNull String str3, int i, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.filterId = str;
        this.logo = str2;
        this.title = str3;
        this.size = i;
        this.chainId = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:0x000e: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r6v0 java.lang.String) : (""))
  (wrap:int:0x001a: TERNARY null = ((wrap:int:0x0015: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r7v0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x001b: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r8v0 long))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, long):void (m)] (LINE:481) call: com.okinc.business.invest_biz.data.bean.FilterCondition.<init>(java.lang.String, java.lang.String, java.lang.String, int, long):void type: THIS */
    public /* synthetic */ FilterCondition(String str, String str2, String str3, int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) == 0 ? str3 : "", (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? -1L : j);
    }
}
