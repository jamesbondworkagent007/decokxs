package com.okinc.dexkline.market.features.filter_tag.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class FilterTagData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final int count;
    public final String displayTitle;
    public final String tagKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FilterTagData() {
        this(0, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FilterTagData copy$default(FilterTagData filterTagData, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = filterTagData.count;
        }
        if ((i2 & 2) != 0) {
            str = filterTagData.tagKey;
        }
        if ((i2 & 4) != 0) {
            str2 = filterTagData.displayTitle;
        }
        return filterTagData.KWHzl(i, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FilterTagData KWHzl(int i, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new FilterTagData(i, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterTagData)) {
            return false;
        }
        FilterTagData filterTagData = (FilterTagData) obj;
        return this.count == filterTagData.count && Intrinsics.EZpvd((Object) this.tagKey, (Object) filterTagData.tagKey) && Intrinsics.EZpvd((Object) this.displayTitle, (Object) filterTagData.displayTitle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Integer.hashCode(this.count) * 31) + this.tagKey.hashCode()) * 31) + this.displayTitle.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FilterTagData(count=" + this.count + ", tagKey=" + this.tagKey + ", displayTitle=" + this.displayTitle + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.features.filter_tag.data.model.FilterTagData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FilterTagData> serializer() {
            return FilterTagData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FilterTagData(int i, int i2, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.count = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.tagKey = "";
        } else {
            this.tagKey = str;
        }
        if ((i & 4) == 0) {
            this.displayTitle = "";
        } else {
            this.displayTitle = str2;
        }
    }

    public static final /* synthetic */ void copydefault(FilterTagData filterTagData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || filterTagData.count != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, filterTagData.count);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) filterTagData.tagKey, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, filterTagData.tagKey);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) filterTagData.displayTitle, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, filterTagData.displayTitle);
    }

    public FilterTagData(int i, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.count = i;
        this.tagKey = str;
        this.displayTitle = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(int, java.lang.String, java.lang.String):void (m)] (LINE:7) call: com.okinc.dexkline.market.features.filter_tag.data.model.FilterTagData.<init>(int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FilterTagData(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2);
    }
}
