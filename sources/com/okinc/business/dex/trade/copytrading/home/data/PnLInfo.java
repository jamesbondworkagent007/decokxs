package com.okinc.business.dex.trade.copytrading.home.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class PnLInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final PnLDetail realizedPnl;
    private final PnLDetail totalPnl;
    private final PnLDetail unrealizedPnl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PnLInfo() {
        this((PnLDetail) null, (PnLDetail) null, (PnLDetail) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PnLInfo copy$default(PnLInfo pnLInfo, PnLDetail pnLDetail, PnLDetail pnLDetail2, PnLDetail pnLDetail3, int i, Object obj) {
        if ((i & 1) != 0) {
            pnLDetail = pnLInfo.totalPnl;
        }
        if ((i & 2) != 0) {
            pnLDetail2 = pnLInfo.realizedPnl;
        }
        if ((i & 4) != 0) {
            pnLDetail3 = pnLInfo.unrealizedPnl;
        }
        return pnLInfo.copy(pnLDetail, pnLDetail2, pnLDetail3);
    }

    @SerialName("realizedPnl")
    public static /* synthetic */ void getRealizedPnl$annotations() {
    }

    @SerialName("totalPnl")
    public static /* synthetic */ void getTotalPnl$annotations() {
    }

    @SerialName("unrealizedPnl")
    public static /* synthetic */ void getUnrealizedPnl$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PnLDetail component1() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PnLDetail component2() {
        return this.realizedPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PnLDetail component3() {
        return this.unrealizedPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PnLInfo copy(@NotNull PnLDetail pnLDetail, @NotNull PnLDetail pnLDetail2, @NotNull PnLDetail pnLDetail3) {
        Intrinsics.checkNotNullParameter(pnLDetail, "");
        Intrinsics.checkNotNullParameter(pnLDetail2, "");
        Intrinsics.checkNotNullParameter(pnLDetail3, "");
        return new PnLInfo(pnLDetail, pnLDetail2, pnLDetail3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PnLInfo)) {
            return false;
        }
        PnLInfo pnLInfo = (PnLInfo) obj;
        return Intrinsics.EZpvd(this.totalPnl, pnLInfo.totalPnl) && Intrinsics.EZpvd(this.realizedPnl, pnLInfo.realizedPnl) && Intrinsics.EZpvd(this.unrealizedPnl, pnLInfo.unrealizedPnl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PnLDetail getRealizedPnl() {
        return this.realizedPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PnLDetail getTotalPnl() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PnLDetail getUnrealizedPnl() {
        return this.unrealizedPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.totalPnl.hashCode() * 31) + this.realizedPnl.hashCode()) * 31) + this.unrealizedPnl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PnLInfo(totalPnl=" + this.totalPnl + ", realizedPnl=" + this.realizedPnl + ", unrealizedPnl=" + this.unrealizedPnl + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.home.data.PnLInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PnLInfo> serializer() {
            return PnLInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PnLInfo(int i, PnLDetail pnLDetail, PnLDetail pnLDetail2, PnLDetail pnLDetail3, SerializationConstructorMarker serializationConstructorMarker) {
        this.totalPnl = (i & 1) == 0 ? new PnLDetail((String) null, (String) null, 3, (DefaultConstructorMarker) null) : pnLDetail;
        if ((i & 2) == 0) {
            this.realizedPnl = new PnLDetail((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        } else {
            this.realizedPnl = pnLDetail2;
        }
        if ((i & 4) == 0) {
            this.unrealizedPnl = new PnLDetail((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        } else {
            this.unrealizedPnl = pnLDetail3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [62=4] */
    public static final /* synthetic */ void write$Self$OKDex_dex_impl(PnLInfo pnLInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(pnLInfo.totalPnl, new PnLDetail((String) null, (String) null, 3, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, PnLDetail$$serializer.INSTANCE, pnLInfo.totalPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(pnLInfo.realizedPnl, new PnLDetail((String) null, (String) null, 3, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, PnLDetail$$serializer.INSTANCE, pnLInfo.realizedPnl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(pnLInfo.unrealizedPnl, new PnLDetail((String) null, (String) null, 3, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, PnLDetail$$serializer.INSTANCE, pnLInfo.unrealizedPnl);
    }

    public PnLInfo(@NotNull PnLDetail pnLDetail, @NotNull PnLDetail pnLDetail2, @NotNull PnLDetail pnLDetail3) {
        Intrinsics.checkNotNullParameter(pnLDetail, "");
        Intrinsics.checkNotNullParameter(pnLDetail2, "");
        Intrinsics.checkNotNullParameter(pnLDetail3, "");
        this.totalPnl = pnLDetail;
        this.realizedPnl = pnLDetail2;
        this.unrealizedPnl = pnLDetail3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
  (wrap:com.okinc.business.dex.trade.copytrading.home.data.PnLDetail:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.dex.trade.copytrading.home.data.PnLDetail:0x0008: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (3 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:66) call: com.okinc.business.dex.trade.copytrading.home.data.PnLDetail.<init>(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r3v0 com.okinc.business.dex.trade.copytrading.home.data.PnLDetail))
  (wrap:com.okinc.business.dex.trade.copytrading.home.data.PnLDetail:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.dex.trade.copytrading.home.data.PnLDetail:0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (3 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:68) call: com.okinc.business.dex.trade.copytrading.home.data.PnLDetail.<init>(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r4v0 com.okinc.business.dex.trade.copytrading.home.data.PnLDetail))
  (wrap:com.okinc.business.dex.trade.copytrading.home.data.PnLDetail:?: TERNARY null = ((wrap:int:0x0014: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.dex.trade.copytrading.home.data.PnLDetail:0x001a: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (3 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:70) call: com.okinc.business.dex.trade.copytrading.home.data.PnLDetail.<init>(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r5v0 com.okinc.business.dex.trade.copytrading.home.data.PnLDetail))
 A[MD:(com.okinc.business.dex.trade.copytrading.home.data.PnLDetail, com.okinc.business.dex.trade.copytrading.home.data.PnLDetail, com.okinc.business.dex.trade.copytrading.home.data.PnLDetail):void (m)] (LINE:64) call: com.okinc.business.dex.trade.copytrading.home.data.PnLInfo.<init>(com.okinc.business.dex.trade.copytrading.home.data.PnLDetail, com.okinc.business.dex.trade.copytrading.home.data.PnLDetail, com.okinc.business.dex.trade.copytrading.home.data.PnLDetail):void type: THIS */
    public /* synthetic */ PnLInfo(PnLDetail pnLDetail, PnLDetail pnLDetail2, PnLDetail pnLDetail3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new PnLDetail((String) null, (String) null, 3, (DefaultConstructorMarker) null) : pnLDetail, (i & 2) != 0 ? new PnLDetail((String) null, (String) null, 3, (DefaultConstructorMarker) null) : pnLDetail2, (i & 4) != 0 ? new PnLDetail((String) null, (String) null, 3, (DefaultConstructorMarker) null) : pnLDetail3);
    }
}
