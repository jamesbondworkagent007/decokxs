package com.okinc.dexkline.market.features.coindetail.domain.models;

import com.okinc.dexkline.market.data.model.CompactTagData;
import com.okinc.dexkline.market.data.model.CompactTagData$$serializer;
import com.okinc.dexkline.market.features.coindetail.ui.snipers.HoldActivity;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class SniperHolder {
    private final HoldActivity holdStatus;
    private final String holderAddress;
    private final List<CompactTagData> newTagList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, HoldActivity.Companion.serializer(), new ArrayListSerializer(CompactTagData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.dexkline.market.features.coindetail.domain.models.SniperHolder */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SniperHolder copy$default(SniperHolder sniperHolder, String str, HoldActivity holdActivity, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sniperHolder.holderAddress;
        }
        if ((i & 2) != 0) {
            holdActivity = sniperHolder.holdStatus;
        }
        if ((i & 4) != 0) {
            list = sniperHolder.newTagList;
        }
        return sniperHolder.copy(str, holdActivity, list);
    }

    @SerialName("holdStatus")
    public static /* synthetic */ void getHoldStatus$annotations() {
    }

    @SerialName("holderAddress")
    public static /* synthetic */ void getHolderAddress$annotations() {
    }

    @SerialName("t")
    public static /* synthetic */ void getNewTagList$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.holderAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HoldActivity component2() {
        return this.holdStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> component3() {
        return this.newTagList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SniperHolder copy(@NotNull String str, @NotNull HoldActivity holdActivity, @NotNull List<CompactTagData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(holdActivity, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new SniperHolder(str, holdActivity, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SniperHolder)) {
            return false;
        }
        SniperHolder sniperHolder = (SniperHolder) obj;
        return Intrinsics.EZpvd((Object) this.holderAddress, (Object) sniperHolder.holderAddress) && this.holdStatus == sniperHolder.holdStatus && Intrinsics.EZpvd(this.newTagList, sniperHolder.newTagList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HoldActivity getHoldStatus() {
        return this.holdStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHolderAddress() {
        return this.holderAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> getNewTagList() {
        return this.newTagList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.holderAddress.hashCode() * 31) + this.holdStatus.hashCode()) * 31) + this.newTagList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SniperHolder(holderAddress=" + this.holderAddress + ", holdStatus=" + this.holdStatus + ", newTagList=" + this.newTagList + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.features.coindetail.domain.models.SniperHolder.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SniperHolder> serializer() {
            return SniperHolder$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SniperHolder(int i, String str, HoldActivity holdActivity, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, SniperHolder$$serializer.INSTANCE.getDescriptor());
        }
        this.holderAddress = str;
        if ((i & 2) == 0) {
            this.holdStatus = HoldActivity.HOLD;
        } else {
            this.holdStatus = holdActivity;
        }
        if ((i & 4) == 0) {
            this.newTagList = yDY.AhwBna();
        } else {
            this.newTagList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKKLine_kline_impl(SniperHolder sniperHolder, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, sniperHolder.holderAddress);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || sniperHolder.holdStatus != HoldActivity.HOLD) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], sniperHolder.holdStatus);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(sniperHolder.newTagList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], sniperHolder.newTagList);
    }

    public SniperHolder(@NotNull String str, @NotNull HoldActivity holdActivity, @NotNull List<CompactTagData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(holdActivity, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.holderAddress = str;
        this.holdStatus = holdActivity;
        this.newTagList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:com.okinc.dexkline.market.features.coindetail.ui.snipers.HoldActivity:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.dexkline.market.features.coindetail.ui.snipers.HoldActivity:0x0004: SGET  A[WRAPPED] (LINE:15) com.okinc.dexkline.market.features.coindetail.ui.snipers.HoldActivity.HOLD com.okinc.dexkline.market.features.coindetail.ui.snipers.HoldActivity) : (r2v0 com.okinc.dexkline.market.features.coindetail.ui.snipers.HoldActivity))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:17)) : (r3v0 java.util.List))
 A[MD:(java.lang.String, com.okinc.dexkline.market.features.coindetail.ui.snipers.HoldActivity, java.util.List<com.okinc.dexkline.market.data.model.CompactTagData>):void (m)] (LINE:11) call: com.okinc.dexkline.market.features.coindetail.domain.models.SniperHolder.<init>(java.lang.String, com.okinc.dexkline.market.features.coindetail.ui.snipers.HoldActivity, java.util.List):void type: THIS */
    public /* synthetic */ SniperHolder(String str, HoldActivity holdActivity, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? HoldActivity.HOLD : holdActivity, (i & 4) != 0 ? yDY.AhwBna() : list);
    }
}
