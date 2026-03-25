package com.okinc.unify_trade.biz;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class FavoriteBizInst extends BaseWatch {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<InstrumentInfo> FUTURES;
    private final List<InstrumentInfo> MARGIN;
    private final List<InstrumentInfo> OPTION;
    private final List<InstrumentInfo> SPOT;
    private final List<InstrumentInfo> SWAP;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FavoriteBizInst() {
        this((List) null, (List) null, (List) null, (List) null, (List) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.unify_trade.biz.FavoriteBizInst */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FavoriteBizInst copy$default(FavoriteBizInst favoriteBizInst, List list, List list2, List list3, List list4, List list5, int i, Object obj) {
        if ((i & 1) != 0) {
            list = favoriteBizInst.SWAP;
        }
        if ((i & 2) != 0) {
            list2 = favoriteBizInst.MARGIN;
        }
        List list6 = list2;
        if ((i & 4) != 0) {
            list3 = favoriteBizInst.SPOT;
        }
        List list7 = list3;
        if ((i & 8) != 0) {
            list4 = favoriteBizInst.FUTURES;
        }
        List list8 = list4;
        if ((i & 16) != 0) {
            list5 = favoriteBizInst.OPTION;
        }
        return favoriteBizInst.copy(list, list6, list7, list8, list5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InstrumentInfo> component1() {
        return this.SWAP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InstrumentInfo> component2() {
        return this.MARGIN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InstrumentInfo> component3() {
        return this.SPOT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InstrumentInfo> component4() {
        return this.FUTURES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InstrumentInfo> component5() {
        return this.OPTION;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FavoriteBizInst copy(@NotNull List<InstrumentInfo> list, @NotNull List<InstrumentInfo> list2, @NotNull List<InstrumentInfo> list3, @NotNull List<InstrumentInfo> list4, @NotNull List<InstrumentInfo> list5) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        return new FavoriteBizInst(list, list2, list3, list4, list5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoriteBizInst)) {
            return false;
        }
        FavoriteBizInst favoriteBizInst = (FavoriteBizInst) obj;
        return Intrinsics.EZpvd(this.SWAP, favoriteBizInst.SWAP) && Intrinsics.EZpvd(this.MARGIN, favoriteBizInst.MARGIN) && Intrinsics.EZpvd(this.SPOT, favoriteBizInst.SPOT) && Intrinsics.EZpvd(this.FUTURES, favoriteBizInst.FUTURES) && Intrinsics.EZpvd(this.OPTION, favoriteBizInst.OPTION);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InstrumentInfo> getFUTURES() {
        return this.FUTURES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InstrumentInfo> getMARGIN() {
        return this.MARGIN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InstrumentInfo> getOPTION() {
        return this.OPTION;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InstrumentInfo> getSPOT() {
        return this.SPOT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InstrumentInfo> getSWAP() {
        return this.SWAP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.SWAP.hashCode() * 31) + this.MARGIN.hashCode()) * 31) + this.SPOT.hashCode()) * 31) + this.FUTURES.hashCode()) * 31) + this.OPTION.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FavoriteBizInst(SWAP=" + this.SWAP + ", MARGIN=" + this.MARGIN + ", SPOT=" + this.SPOT + ", FUTURES=" + this.FUTURES + ", OPTION=" + this.OPTION + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.FavoriteBizInst.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FavoriteBizInst> serializer() {
            return FavoriteBizInst$$serializer.INSTANCE;
        }
    }

    static {
        InstrumentInfo$$serializer instrumentInfo$$serializer = InstrumentInfo$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(instrumentInfo$$serializer), new ArrayListSerializer(instrumentInfo$$serializer), new ArrayListSerializer(instrumentInfo$$serializer), new ArrayListSerializer(instrumentInfo$$serializer), new ArrayListSerializer(instrumentInfo$$serializer)};
    }

    public /* synthetic */ FavoriteBizInst(int i, List list, List list2, List list3, List list4, List list5, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        this.SWAP = (i & 1) == 0 ? new ArrayList() : list;
        if ((i & 2) == 0) {
            this.MARGIN = new ArrayList();
        } else {
            this.MARGIN = list2;
        }
        if ((i & 4) == 0) {
            this.SPOT = new ArrayList();
        } else {
            this.SPOT = list3;
        }
        if ((i & 8) == 0) {
            this.FUTURES = new ArrayList();
        } else {
            this.FUTURES = list4;
        }
        if ((i & 16) == 0) {
            this.OPTION = new ArrayList();
        } else {
            this.OPTION = list5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [6=6] */
    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(FavoriteBizInst favoriteBizInst, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        BaseWatch.write$Self(favoriteBizInst, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(favoriteBizInst.SWAP, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], favoriteBizInst.SWAP);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(favoriteBizInst.MARGIN, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], favoriteBizInst.MARGIN);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(favoriteBizInst.SPOT, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], favoriteBizInst.SPOT);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(favoriteBizInst.FUTURES, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], favoriteBizInst.FUTURES);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd(favoriteBizInst.OPTION, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], favoriteBizInst.OPTION);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0037: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:9) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r4v0 java.util.List))
  (wrap:java.util.List:0x0012: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000f: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:10) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r5v0 java.util.List))
  (wrap:java.util.List:0x001c: TERNARY null = ((wrap:int:0x0013: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0019: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:11) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r6v0 java.util.List))
  (wrap:java.util.List:0x0026: TERNARY null = ((wrap:int:0x001d: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0023: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:12) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r7v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0027: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x002d: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:13) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r8v0 java.util.List))
 A[MD:(java.util.List<com.okinc.unify_trade.biz.InstrumentInfo>, java.util.List<com.okinc.unify_trade.biz.InstrumentInfo>, java.util.List<com.okinc.unify_trade.biz.InstrumentInfo>, java.util.List<com.okinc.unify_trade.biz.InstrumentInfo>, java.util.List<com.okinc.unify_trade.biz.InstrumentInfo>):void (m)] (LINE:8) call: com.okinc.unify_trade.biz.FavoriteBizInst.<init>(java.util.List, java.util.List, java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ FavoriteBizInst(List list, List list2, List list3, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2, (i & 4) != 0 ? new ArrayList() : list3, (i & 8) != 0 ? new ArrayList() : list4, (i & 16) != 0 ? new ArrayList() : list5);
    }

    public FavoriteBizInst(@NotNull List<InstrumentInfo> list, @NotNull List<InstrumentInfo> list2, @NotNull List<InstrumentInfo> list3, @NotNull List<InstrumentInfo> list4, @NotNull List<InstrumentInfo> list5) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        this.SWAP = list;
        this.MARGIN = list2;
        this.SPOT = list3;
        this.FUTURES = list4;
        this.OPTION = list5;
    }
}
