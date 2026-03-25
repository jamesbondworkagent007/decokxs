package com.okinc.unify_trade.biz;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class PendingOrderLine {
    private final String botType;
    private final String direction;
    private final List<String> lines;
    private final String triggerPx;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.PendingOrderLine */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PendingOrderLine copy$default(PendingOrderLine pendingOrderLine, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pendingOrderLine.botType;
        }
        if ((i & 2) != 0) {
            str2 = pendingOrderLine.triggerPx;
        }
        if ((i & 4) != 0) {
            str3 = pendingOrderLine.direction;
        }
        if ((i & 8) != 0) {
            list = pendingOrderLine.lines;
        }
        return pendingOrderLine.copy(str, str2, str3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.botType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.triggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component4() {
        return this.lines;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PendingOrderLine copy(@NotNull String str, String str2, @NotNull String str3, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new PendingOrderLine(str, str2, str3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingOrderLine)) {
            return false;
        }
        PendingOrderLine pendingOrderLine = (PendingOrderLine) obj;
        return Intrinsics.EZpvd((Object) this.botType, (Object) pendingOrderLine.botType) && Intrinsics.EZpvd((Object) this.triggerPx, (Object) pendingOrderLine.triggerPx) && Intrinsics.EZpvd((Object) this.direction, (Object) pendingOrderLine.direction) && Intrinsics.EZpvd(this.lines, pendingOrderLine.lines);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBotType() {
        return this.botType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getLines() {
        return this.lines;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerPx() {
        return this.triggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.botType.hashCode();
        String str = this.triggerPx;
        return (((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.direction.hashCode()) * 31) + this.lines.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PendingOrderLine(botType=" + this.botType + ", triggerPx=" + this.triggerPx + ", direction=" + this.direction + ", lines=" + this.lines + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.PendingOrderLine.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PendingOrderLine> serializer() {
            return PendingOrderLine$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PendingOrderLine(int i, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (13 != (i & 13)) {
            PluginExceptionsKt.throwMissingFieldException(i, 13, PendingOrderLine$$serializer.INSTANCE.getDescriptor());
        }
        this.botType = str;
        if ((i & 2) == 0) {
            this.triggerPx = null;
        } else {
            this.triggerPx = str2;
        }
        this.direction = str3;
        this.lines = list;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(PendingOrderLine pendingOrderLine, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, pendingOrderLine.botType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || pendingOrderLine.triggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, pendingOrderLine.triggerPx);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, pendingOrderLine.direction);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], pendingOrderLine.lines);
    }

    public PendingOrderLine(@NotNull String str, String str2, @NotNull String str3, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.botType = str;
        this.triggerPx = str2;
        this.direction = str3;
        this.lines = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (r3v0 java.lang.String)
  (r4v0 java.util.List)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>):void (m)] (LINE:1087) call: com.okinc.unify_trade.biz.PendingOrderLine.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ PendingOrderLine(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, str3, list);
    }
}
