package com.okinc.kline.features.kline.indexcomponents.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class IndexComponent {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String cnvPx;
    private final String exch;
    private final String symPx;
    private final String symbol;
    private final String wgt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IndexComponent() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ IndexComponent copy$default(IndexComponent indexComponent, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = indexComponent.exch;
        }
        if ((i & 2) != 0) {
            str2 = indexComponent.symbol;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = indexComponent.symPx;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = indexComponent.wgt;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = indexComponent.cnvPx;
        }
        return indexComponent.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.exch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.symPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.wgt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.cnvPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IndexComponent copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new IndexComponent(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndexComponent)) {
            return false;
        }
        IndexComponent indexComponent = (IndexComponent) obj;
        return Intrinsics.EZpvd((Object) this.exch, (Object) indexComponent.exch) && Intrinsics.EZpvd((Object) this.symbol, (Object) indexComponent.symbol) && Intrinsics.EZpvd((Object) this.symPx, (Object) indexComponent.symPx) && Intrinsics.EZpvd((Object) this.wgt, (Object) indexComponent.wgt) && Intrinsics.EZpvd((Object) this.cnvPx, (Object) indexComponent.cnvPx);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCnvPx() {
        return this.cnvPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExch() {
        return this.exch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymPx() {
        return this.symPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWgt() {
        return this.wgt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.exch.hashCode() * 31) + this.symbol.hashCode()) * 31) + this.symPx.hashCode()) * 31) + this.wgt.hashCode()) * 31) + this.cnvPx.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IndexComponent(exch=" + this.exch + ", symbol=" + this.symbol + ", symPx=" + this.symPx + ", wgt=" + this.wgt + ", cnvPx=" + this.cnvPx + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kline.features.kline.indexcomponents.data.model.IndexComponent.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<IndexComponent> serializer() {
            return IndexComponent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IndexComponent(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.exch = "";
        } else {
            this.exch = str;
        }
        if ((i & 2) == 0) {
            this.symbol = "";
        } else {
            this.symbol = str2;
        }
        if ((i & 4) == 0) {
            this.symPx = "";
        } else {
            this.symPx = str3;
        }
        if ((i & 8) == 0) {
            this.wgt = "";
        } else {
            this.wgt = str4;
        }
        if ((i & 16) == 0) {
            this.cnvPx = "";
        } else {
            this.cnvPx = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKKLine_kline_impl(IndexComponent indexComponent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) indexComponent.exch, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, indexComponent.exch);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) indexComponent.symbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, indexComponent.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) indexComponent.symPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, indexComponent.symPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) indexComponent.wgt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, indexComponent.wgt);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) indexComponent.cnvPx, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, indexComponent.cnvPx);
    }

    public IndexComponent(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.exch = str;
        this.symbol = str2;
        this.symPx = str3;
        this.wgt = str4;
        this.cnvPx = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:17) call: com.okinc.kline.features.kline.indexcomponents.data.model.IndexComponent.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ IndexComponent(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
