package com.okinc.business.invest_biz.data.bean;

import com.okinc.business.invest_biz.data.bean.FilterChip;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class FilterChip {
    private final InvestSearchData data;
    private final ItemType type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {ItemType.Companion.serializer(), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FilterChip copy$default(FilterChip filterChip, ItemType itemType, InvestSearchData investSearchData, int i, Object obj) {
        if ((i & 1) != 0) {
            itemType = filterChip.type;
        }
        if ((i & 2) != 0) {
            investSearchData = filterChip.data;
        }
        return filterChip.copy(itemType, investSearchData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ItemType component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestSearchData component2() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FilterChip copy(@NotNull ItemType itemType, @NotNull InvestSearchData investSearchData) {
        Intrinsics.checkNotNullParameter(itemType, "");
        Intrinsics.checkNotNullParameter(investSearchData, "");
        return new FilterChip(itemType, investSearchData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterChip)) {
            return false;
        }
        FilterChip filterChip = (FilterChip) obj;
        return this.type == filterChip.type && Intrinsics.EZpvd(this.data, filterChip.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestSearchData getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ItemType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.type.hashCode() * 31) + this.data.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FilterChip(type=" + this.type + ", data=" + this.data + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.FilterChip.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FilterChip> serializer() {
            return FilterChip$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FilterChip(int i, ItemType itemType, InvestSearchData investSearchData, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, FilterChip$$serializer.INSTANCE.getDescriptor());
        }
        this.type = itemType;
        this.data = investSearchData;
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(FilterChip filterChip, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], filterChip.type);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, InvestSearchData$$serializer.INSTANCE, filterChip.data);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Serializable
    public static final class ItemType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ItemType[] $VALUES;
        private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
        public static final Companion Companion;
        public static final ItemType TOKEN = new ItemType("TOKEN", 0);
        public static final ItemType PLATFORM = new ItemType("PLATFORM", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ItemType[] $values() {
            return new ItemType[]{TOKEN, PLATFORM};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ItemType> getEntries() {
            return $ENTRIES;
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.FilterChip.ItemType.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ KSerializer AEQbTJ() {
                return (KSerializer) ItemType.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer<ItemType> serializer() {
                return AEQbTJ();
            }
        }

        private ItemType(String str, int i) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return EnumsKt.createSimpleEnumSerializer("com.okinc.business.invest_biz.data.bean.FilterChip.ItemType", values());
        }

        static {
            ItemType[] itemTypeArr$values = $values();
            $VALUES = itemTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(itemTypeArr$values);
            Companion = new Companion(null);
            $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.ixR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return FilterChip.ItemType._init_$_anonymous_();
                }
            });
        }

        public static ItemType valueOf(String str) {
            return (ItemType) Enum.valueOf(ItemType.class, str);
        }

        public static ItemType[] values() {
            return (ItemType[]) $VALUES.clone();
        }
    }

    public FilterChip(@NotNull ItemType itemType, @NotNull InvestSearchData investSearchData) {
        Intrinsics.checkNotNullParameter(itemType, "");
        Intrinsics.checkNotNullParameter(investSearchData, "");
        this.type = itemType;
        this.data = investSearchData;
    }
}
