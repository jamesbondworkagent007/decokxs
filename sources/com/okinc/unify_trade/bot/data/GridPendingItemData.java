package com.okinc.unify_trade.bot.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.InterfaceC55787xqY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class GridPendingItemData implements InterfaceC55787xqY {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String amount;
    private final int index;
    private final String orderTag;
    private final String px;
    private final String text;
    private final String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GridPendingItemData copy$default(GridPendingItemData gridPendingItemData, int i, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = gridPendingItemData.index;
        }
        if ((i2 & 2) != 0) {
            str = gridPendingItemData.title;
        }
        String str6 = str;
        if ((i2 & 4) != 0) {
            str2 = gridPendingItemData.text;
        }
        String str7 = str2;
        if ((i2 & 8) != 0) {
            str3 = gridPendingItemData.orderTag;
        }
        String str8 = str3;
        if ((i2 & 16) != 0) {
            str4 = gridPendingItemData.amount;
        }
        String str9 = str4;
        if ((i2 & 32) != 0) {
            str5 = gridPendingItemData.px;
        }
        return gridPendingItemData.copy(i, str6, str7, str8, str9, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.orderTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridPendingItemData copy(int i, @NotNull String str, @NotNull String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new GridPendingItemData(i, str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridPendingItemData)) {
            return false;
        }
        GridPendingItemData gridPendingItemData = (GridPendingItemData) obj;
        return this.index == gridPendingItemData.index && Intrinsics.EZpvd((Object) this.title, (Object) gridPendingItemData.title) && Intrinsics.EZpvd((Object) this.text, (Object) gridPendingItemData.text) && Intrinsics.EZpvd((Object) this.orderTag, (Object) gridPendingItemData.orderTag) && Intrinsics.EZpvd((Object) this.amount, (Object) gridPendingItemData.amount) && Intrinsics.EZpvd((Object) this.px, (Object) gridPendingItemData.px);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIndex() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderTag() {
        return this.orderTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPx() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.index);
        int iHashCode2 = this.title.hashCode();
        int iHashCode3 = this.text.hashCode();
        String str = this.orderTag;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.amount;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.px;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GridPendingItemData(index=" + this.index + ", title=" + this.title + ", text=" + this.text + ", orderTag=" + this.orderTag + ", amount=" + this.amount + ", px=" + this.px + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.data.GridPendingItemData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GridPendingItemData> serializer() {
            return GridPendingItemData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GridPendingItemData(int i, int i2, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, GridPendingItemData$$serializer.INSTANCE.getDescriptor());
        }
        this.index = i2;
        this.title = str;
        this.text = str2;
        if ((i & 8) == 0) {
            this.orderTag = null;
        } else {
            this.orderTag = str3;
        }
        if ((i & 16) == 0) {
            this.amount = "";
        } else {
            this.amount = str4;
        }
        if ((i & 32) == 0) {
            this.px = "";
        } else {
            this.px = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(GridPendingItemData gridPendingItemData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, gridPendingItemData.index);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, gridPendingItemData.title);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, gridPendingItemData.text);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || gridPendingItemData.orderTag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, gridPendingItemData.orderTag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) gridPendingItemData.amount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, gridPendingItemData.amount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) gridPendingItemData.px, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, gridPendingItemData.px);
    }

    public GridPendingItemData(int i, @NotNull String str, @NotNull String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.index = i;
        this.title = str;
        this.text = str2;
        this.orderTag = str3;
        this.amount = str4;
        this.px = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (r8v0 int)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (wrap:java.lang.String:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1233) call: com.okinc.unify_trade.bot.data.GridPendingItemData.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ GridPendingItemData(int i, String str, String str2, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5);
    }
}
