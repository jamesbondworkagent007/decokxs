package com.okinc.business.dexlogic.main.swap.trade.input.helper;

import com.okinc.business.dexlogic.main.swap.trade.input.helper.CoinAssets;
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
/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class CoinAssets {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CoinAssets[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final CoinAssets BOTH = new CoinAssets("BOTH", 0);
    public static final CoinAssets FROM = new CoinAssets("FROM", 1);
    public static final CoinAssets TO = new CoinAssets("TO", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CoinAssets[] $values() {
        return new CoinAssets[]{BOTH, FROM, TO};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CoinAssets> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.swap.trade.input.helper.CoinAssets.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer OLrzqt() {
            return (KSerializer) CoinAssets.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<CoinAssets> serializer() {
            return OLrzqt();
        }
    }

    private CoinAssets(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.business.dexlogic.main.swap.trade.input.helper.CoinAssets", values());
    }

    static {
        CoinAssets[] coinAssetsArr$values = $values();
        $VALUES = coinAssetsArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(coinAssetsArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.hnn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return CoinAssets._init_$_anonymous_();
            }
        });
    }

    public static CoinAssets valueOf(String str) {
        return (CoinAssets) Enum.valueOf(CoinAssets.class, str);
    }

    public static CoinAssets[] values() {
        return (CoinAssets[]) $VALUES.clone();
    }
}
