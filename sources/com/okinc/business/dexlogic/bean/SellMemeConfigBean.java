package com.okinc.business.dexlogic.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class SellMemeConfigBean {
    private final String chainId;
    private final List<String> defaultSellPercentList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SellMemeConfigBean() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexlogic.bean.SellMemeConfigBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SellMemeConfigBean copy$default(SellMemeConfigBean sellMemeConfigBean, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sellMemeConfigBean.chainId;
        }
        if ((i & 2) != 0) {
            list = sellMemeConfigBean.defaultSellPercentList;
        }
        return sellMemeConfigBean.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.defaultSellPercentList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SellMemeConfigBean copy(@NotNull String str, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new SellMemeConfigBean(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellMemeConfigBean)) {
            return false;
        }
        SellMemeConfigBean sellMemeConfigBean = (SellMemeConfigBean) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) sellMemeConfigBean.chainId) && Intrinsics.EZpvd(this.defaultSellPercentList, sellMemeConfigBean.defaultSellPercentList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getDefaultSellPercentList() {
        return this.defaultSellPercentList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.chainId.hashCode() * 31) + this.defaultSellPercentList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SellMemeConfigBean(chainId=" + this.chainId + ", defaultSellPercentList=" + this.defaultSellPercentList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.SellMemeConfigBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SellMemeConfigBean> serializer() {
            return SellMemeConfigBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SellMemeConfigBean(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.chainId = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.defaultSellPercentList = yDY.AhwBna();
        } else {
            this.defaultSellPercentList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(SellMemeConfigBean sellMemeConfigBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) sellMemeConfigBean.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, sellMemeConfigBean.chainId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(sellMemeConfigBean.defaultSellPercentList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], sellMemeConfigBean.defaultSellPercentList);
    }

    public SellMemeConfigBean(@NotNull String str, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.chainId = str;
        this.defaultSellPercentList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:16)) : (r2v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<java.lang.String>):void (m)] (LINE:14) call: com.okinc.business.dexlogic.bean.SellMemeConfigBean.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ SellMemeConfigBean(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list);
    }
}
