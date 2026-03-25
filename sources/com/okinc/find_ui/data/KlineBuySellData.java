package com.okinc.find_ui.data;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class KlineBuySellData {
    private static final KSerializer<Object>[] $childSerializers;
    private final ArrayList<BuySellBean> cont;
    private final ArrayList<BuySellBean> crypto;
    private final ArrayList<BuySellBean> usds;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public KlineBuySellData() {
        this((ArrayList) null, (ArrayList) null, (ArrayList) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.find_ui.data.KlineBuySellData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KlineBuySellData copy$default(KlineBuySellData klineBuySellData, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = klineBuySellData.cont;
        }
        if ((i & 2) != 0) {
            arrayList2 = klineBuySellData.crypto;
        }
        if ((i & 4) != 0) {
            arrayList3 = klineBuySellData.usds;
        }
        return klineBuySellData.copy(arrayList, arrayList2, arrayList3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<BuySellBean> component1() {
        return this.cont;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<BuySellBean> component2() {
        return this.crypto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<BuySellBean> component3() {
        return this.usds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KlineBuySellData copy(@NotNull ArrayList<BuySellBean> arrayList, @NotNull ArrayList<BuySellBean> arrayList2, @NotNull ArrayList<BuySellBean> arrayList3) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(arrayList3, "");
        return new KlineBuySellData(arrayList, arrayList2, arrayList3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KlineBuySellData)) {
            return false;
        }
        KlineBuySellData klineBuySellData = (KlineBuySellData) obj;
        return Intrinsics.EZpvd(this.cont, klineBuySellData.cont) && Intrinsics.EZpvd(this.crypto, klineBuySellData.crypto) && Intrinsics.EZpvd(this.usds, klineBuySellData.usds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<BuySellBean> getCont() {
        return this.cont;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<BuySellBean> getCrypto() {
        return this.crypto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<BuySellBean> getUsds() {
        return this.usds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.cont.hashCode() * 31) + this.crypto.hashCode()) * 31) + this.usds.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KlineBuySellData(cont=" + this.cont + ", crypto=" + this.crypto + ", usds=" + this.usds + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.find_ui.data.KlineBuySellData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<KlineBuySellData> serializer() {
            return KlineBuySellData$$serializer.INSTANCE;
        }
    }

    static {
        BuySellBean$$serializer buySellBean$$serializer = BuySellBean$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(buySellBean$$serializer), new ArrayListSerializer(buySellBean$$serializer), new ArrayListSerializer(buySellBean$$serializer)};
    }

    public /* synthetic */ KlineBuySellData(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SerializationConstructorMarker serializationConstructorMarker) {
        this.cont = (i & 1) == 0 ? new ArrayList() : arrayList;
        if ((i & 2) == 0) {
            this.crypto = new ArrayList<>();
        } else {
            this.crypto = arrayList2;
        }
        if ((i & 4) == 0) {
            this.usds = new ArrayList<>();
        } else {
            this.usds = arrayList3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [124=4] */
    public static final /* synthetic */ void write$Self$OKMarket_market_impl(KlineBuySellData klineBuySellData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(klineBuySellData.cont, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], klineBuySellData.cont);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(klineBuySellData.crypto, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], klineBuySellData.crypto);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(klineBuySellData.usds, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], klineBuySellData.usds);
    }

    public KlineBuySellData(@NotNull ArrayList<BuySellBean> arrayList, @NotNull ArrayList<BuySellBean> arrayList2, @NotNull ArrayList<BuySellBean> arrayList3) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(arrayList3, "");
        this.cont = arrayList;
        this.crypto = arrayList2;
        this.usds = arrayList3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:127) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r1v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0009: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x000f: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:128) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0012: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0018: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:129) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r3v0 java.util.ArrayList))
 A[MD:(java.util.ArrayList<com.okinc.find_ui.data.BuySellBean>, java.util.ArrayList<com.okinc.find_ui.data.BuySellBean>, java.util.ArrayList<com.okinc.find_ui.data.BuySellBean>):void (m)] (LINE:126) call: com.okinc.find_ui.data.KlineBuySellData.<init>(java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void type: THIS */
    public /* synthetic */ KlineBuySellData(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : arrayList, (i & 2) != 0 ? new ArrayList() : arrayList2, (i & 4) != 0 ? new ArrayList() : arrayList3);
    }
}
