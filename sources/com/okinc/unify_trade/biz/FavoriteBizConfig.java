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
public final class FavoriteBizConfig extends BaseWatch {
    private final List<IdxCcyConfig> idxCcyConfig;
    private final List<IdxConfig> idxConfig;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(IdxCcyConfig$$serializer.INSTANCE), new ArrayListSerializer(IdxConfig$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FavoriteBizConfig() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.FavoriteBizConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FavoriteBizConfig copy$default(FavoriteBizConfig favoriteBizConfig, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = favoriteBizConfig.idxCcyConfig;
        }
        if ((i & 2) != 0) {
            list2 = favoriteBizConfig.idxConfig;
        }
        return favoriteBizConfig.copy(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<IdxCcyConfig> component1() {
        return this.idxCcyConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<IdxConfig> component2() {
        return this.idxConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FavoriteBizConfig copy(@NotNull List<IdxCcyConfig> list, @NotNull List<IdxConfig> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new FavoriteBizConfig(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoriteBizConfig)) {
            return false;
        }
        FavoriteBizConfig favoriteBizConfig = (FavoriteBizConfig) obj;
        return Intrinsics.EZpvd(this.idxCcyConfig, favoriteBizConfig.idxCcyConfig) && Intrinsics.EZpvd(this.idxConfig, favoriteBizConfig.idxConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<IdxCcyConfig> getIdxCcyConfig() {
        return this.idxCcyConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<IdxConfig> getIdxConfig() {
        return this.idxConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.idxCcyConfig.hashCode() * 31) + this.idxConfig.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FavoriteBizConfig(idxCcyConfig=" + this.idxCcyConfig + ", idxConfig=" + this.idxConfig + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.FavoriteBizConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FavoriteBizConfig> serializer() {
            return FavoriteBizConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FavoriteBizConfig(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        this.idxCcyConfig = (i & 1) == 0 ? new ArrayList() : list;
        if ((i & 2) == 0) {
            this.idxConfig = new ArrayList();
        } else {
            this.idxConfig = list2;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.unify_trade.biz.BaseWatch.write$Self(com.okinc.unify_trade.biz.BaseWatch, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(FavoriteBizConfig favoriteBizConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        BaseWatch.write$Self(favoriteBizConfig, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(favoriteBizConfig.idxCcyConfig, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], favoriteBizConfig.idxCcyConfig);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(favoriteBizConfig.idxConfig, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], favoriteBizConfig.idxConfig);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:19) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0009: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000f: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:20) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.List))
 A[MD:(java.util.List<com.okinc.unify_trade.biz.IdxCcyConfig>, java.util.List<com.okinc.unify_trade.biz.IdxConfig>):void (m)] (LINE:18) call: com.okinc.unify_trade.biz.FavoriteBizConfig.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ FavoriteBizConfig(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2);
    }

    public FavoriteBizConfig(@NotNull List<IdxCcyConfig> list, @NotNull List<IdxConfig> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.idxCcyConfig = list;
        this.idxConfig = list2;
    }
}
