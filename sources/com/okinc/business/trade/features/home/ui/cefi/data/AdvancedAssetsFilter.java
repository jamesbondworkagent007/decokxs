package com.okinc.business.trade.features.home.ui.cefi.data;

import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedAssetSort;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class AdvancedAssetsFilter {
    public static final int $stable = 0;
    private final boolean hidePricedTokens;
    private final AdvancedAssetSort sortBy;
    private final boolean sortDesc;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, EnumsKt.createSimpleEnumSerializer("com.okinc.business.trade.features.home.ui.cefi.common.AdvancedAssetSort", AdvancedAssetSort.values()), null};

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AdvancedAssetSort.values().length];
            try {
                iArr[AdvancedAssetSort.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvancedAssetSort.VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdvancedAssetSort.PNL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdvancedAssetSort.PNL_PERCENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AdvancedAssetsFilter() {
        this(false, (AdvancedAssetSort) null, false, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AdvancedAssetsFilter copy$default(AdvancedAssetsFilter advancedAssetsFilter, boolean z, AdvancedAssetSort advancedAssetSort, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = advancedAssetsFilter.hidePricedTokens;
        }
        if ((i & 2) != 0) {
            advancedAssetSort = advancedAssetsFilter.sortBy;
        }
        if ((i & 4) != 0) {
            z2 = advancedAssetsFilter.sortDesc;
        }
        return advancedAssetsFilter.copy(z, advancedAssetSort, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.hidePricedTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedAssetSort component2() {
        return this.sortBy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.sortDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedAssetsFilter copy(boolean z, @NotNull AdvancedAssetSort advancedAssetSort, boolean z2) {
        Intrinsics.checkNotNullParameter(advancedAssetSort, "");
        return new AdvancedAssetsFilter(z, advancedAssetSort, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvancedAssetsFilter)) {
            return false;
        }
        AdvancedAssetsFilter advancedAssetsFilter = (AdvancedAssetsFilter) obj;
        return this.hidePricedTokens == advancedAssetsFilter.hidePricedTokens && this.sortBy == advancedAssetsFilter.sortBy && this.sortDesc == advancedAssetsFilter.sortDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHidePricedTokens() {
        return this.hidePricedTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedAssetSort getSortBy() {
        return this.sortBy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSortDesc() {
        return this.sortDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Boolean.hashCode(this.hidePricedTokens) * 31) + this.sortBy.hashCode()) * 31) + Boolean.hashCode(this.sortDesc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AdvancedAssetsFilter(hidePricedTokens=" + this.hidePricedTokens + ", sortBy=" + this.sortBy + ", sortDesc=" + this.sortDesc + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.cefi.data.AdvancedAssetsFilter.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AdvancedAssetsFilter> serializer() {
            return AdvancedAssetsFilter$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AdvancedAssetsFilter(int i, boolean z, AdvancedAssetSort advancedAssetSort, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        this.hidePricedTokens = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.sortBy = AdvancedAssetSort.DEFAULT;
        } else {
            this.sortBy = advancedAssetSort;
        }
        if ((i & 4) == 0) {
            this.sortDesc = true;
        } else {
            this.sortDesc = z2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(AdvancedAssetsFilter advancedAssetsFilter, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || advancedAssetsFilter.hidePricedTokens) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, advancedAssetsFilter.hidePricedTokens);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || advancedAssetsFilter.sortBy != AdvancedAssetSort.DEFAULT) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], advancedAssetsFilter.sortBy);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && advancedAssetsFilter.sortDesc) {
            return;
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 2, advancedAssetsFilter.sortDesc);
    }

    public AdvancedAssetsFilter(boolean z, @NotNull AdvancedAssetSort advancedAssetSort, boolean z2) {
        Intrinsics.checkNotNullParameter(advancedAssetSort, "");
        this.hidePricedTokens = z;
        this.sortBy = advancedAssetSort;
        this.sortDesc = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (wrap:com.okinc.business.trade.features.home.ui.cefi.common.AdvancedAssetSort:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.trade.features.home.ui.cefi.common.AdvancedAssetSort:0x0009: SGET  A[WRAPPED] (LINE:119) com.okinc.business.trade.features.home.ui.cefi.common.AdvancedAssetSort.DEFAULT com.okinc.business.trade.features.home.ui.cefi.common.AdvancedAssetSort) : (r2v0 com.okinc.business.trade.features.home.ui.cefi.common.AdvancedAssetSort))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
 A[MD:(boolean, com.okinc.business.trade.features.home.ui.cefi.common.AdvancedAssetSort, boolean):void (m)] (LINE:117) call: com.okinc.business.trade.features.home.ui.cefi.data.AdvancedAssetsFilter.<init>(boolean, com.okinc.business.trade.features.home.ui.cefi.common.AdvancedAssetSort, boolean):void type: THIS */
    public /* synthetic */ AdvancedAssetsFilter(boolean z, AdvancedAssetSort advancedAssetSort, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? AdvancedAssetSort.DEFAULT : advancedAssetSort, (i & 4) != 0 ? true : z2);
    }

    public final String getSortByString() {
        int i = TaskDescription.copydefault[this.sortBy.ordinal()];
        if (i == 1 || i == 2) {
            return "value";
        }
        if (i == 3) {
            return "pnl";
        }
        if (i == 4) {
            return "pnlPercent";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean isDefaultFilter() {
        return !this.hidePricedTokens && this.sortBy == AdvancedAssetSort.DEFAULT && this.sortDesc;
    }
}
