package com.okinc.cruilib.model.listitem.simple;

import com.okinc.cruilib.model.listitem.simple.ItemRank;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class ItemRank {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ItemRank[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final ItemRank FIRST = new ItemRank("FIRST", 0);
    public static final ItemRank MIDDLE = new ItemRank("MIDDLE", 1);
    public static final ItemRank LAST = new ItemRank("LAST", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ItemRank[] $values() {
        return new ItemRank[]{FIRST, MIDDLE, LAST};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ItemRank> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cruilib.model.listitem.simple.ItemRank.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer KWHzl() {
            return (KSerializer) ItemRank.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<ItemRank> serializer() {
            return KWHzl();
        }
    }

    private ItemRank(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.cruilib.model.listitem.simple.ItemRank", values());
    }

    static {
        ItemRank[] itemRankArr$values = $values();
        $VALUES = itemRankArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(itemRankArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.mHK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ItemRank._init_$_anonymous_();
            }
        });
    }

    public static ItemRank valueOf(String str) {
        return (ItemRank) Enum.valueOf(ItemRank.class, str);
    }

    public static ItemRank[] values() {
        return (ItemRank[]) $VALUES.clone();
    }
}
