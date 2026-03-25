package com.okinc.dexkline.market.data.model.smart_money;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class Ranking {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final int itemId;
    public final String itemName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Ranking() {
        this(0, (String) null, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Ranking copy$default(Ranking ranking, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ranking.itemId;
        }
        if ((i2 & 2) != 0) {
            str = ranking.itemName;
        }
        return ranking.KWHzl(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Ranking KWHzl(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new Ranking(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ranking)) {
            return false;
        }
        Ranking ranking = (Ranking) obj;
        return this.itemId == ranking.itemId && Intrinsics.EZpvd((Object) this.itemName, (Object) ranking.itemName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.itemId) * 31) + this.itemName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Ranking(itemId=" + this.itemId + ", itemName=" + this.itemName + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.data.model.smart_money.Ranking.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Ranking> serializer() {
            return Ranking$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Ranking(int i, int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.itemId = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.itemName = "";
        } else {
            this.itemName = str;
        }
    }

    public static final /* synthetic */ void EZpvd(Ranking ranking, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || ranking.itemId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, ranking.itemId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) ranking.itemName, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, ranking.itemName);
    }

    public Ranking(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.itemId = i;
        this.itemName = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
 A[MD:(int, java.lang.String):void (m)] (LINE:8) call: com.okinc.dexkline.market.data.model.smart_money.Ranking.<init>(int, java.lang.String):void type: THIS */
    public /* synthetic */ Ranking(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
    }
}
