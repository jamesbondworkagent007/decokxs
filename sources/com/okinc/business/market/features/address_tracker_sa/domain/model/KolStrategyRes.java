package com.okinc.business.market.features.address_tracker_sa.domain.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class KolStrategyRes {
    private final List<TopTradersItem> kols;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(TopTradersItem$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public KolStrategyRes() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.address_tracker_sa.domain.model.KolStrategyRes */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KolStrategyRes copy$default(KolStrategyRes kolStrategyRes, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = kolStrategyRes.kols;
        }
        return kolStrategyRes.copy(list);
    }

    @SerialName("kols")
    public static /* synthetic */ void getKols$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TopTradersItem> component1() {
        return this.kols;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KolStrategyRes copy(@NotNull List<TopTradersItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new KolStrategyRes(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KolStrategyRes) && Intrinsics.EZpvd(this.kols, ((KolStrategyRes) obj).kols);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TopTradersItem> getKols() {
        return this.kols;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.kols.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KolStrategyRes(kols=" + this.kols + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.address_tracker_sa.domain.model.KolStrategyRes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<KolStrategyRes> serializer() {
            return KolStrategyRes$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ KolStrategyRes(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.kols = yDY.AhwBna();
        } else {
            this.kols = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(KolStrategyRes kolStrategyRes, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd(kolStrategyRes.kols, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], kolStrategyRes.kols);
    }

    public KolStrategyRes(@NotNull List<TopTradersItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.kols = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:30)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.market.features.address_tracker_sa.domain.model.TopTradersItem>):void (m)] (LINE:28) call: com.okinc.business.market.features.address_tracker_sa.domain.model.KolStrategyRes.<init>(java.util.List):void type: THIS */
    public /* synthetic */ KolStrategyRes(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }
}
