package com.okinc.buysell.api;

import com.engagelab.privates.common.constants.MTCommonConstants;
import com.okinc.buysell.api.OKBuySellSource;
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
/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class OKBuySellSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OKBuySellSource[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final String tag;
    public static final OKBuySellSource HOME = new OKBuySellSource("HOME", 0, "home");
    public static final OKBuySellSource PORTFOLIO = new OKBuySellSource("PORTFOLIO", 1, "portfolio");
    public static final OKBuySellSource EXPLORE = new OKBuySellSource("EXPLORE", 2, "explore");
    public static final OKBuySellSource ACTIVITY = new OKBuySellSource("ACTIVITY", 3, MTCommonConstants.Lifecycle.KEY_ACTIVITY);
    public static final OKBuySellSource ASSET_DETAIL = new OKBuySellSource("ASSET_DETAIL", 4, "asset_detail");
    public static final OKBuySellSource LITE_ADVANCED_HOME = new OKBuySellSource("LITE_ADVANCED_HOME", 5, "lite_advanced_home");
    public static final OKBuySellSource UNKNOWN_SOURCE = new OKBuySellSource("UNKNOWN_SOURCE", 6, "unknown_source");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OKBuySellSource[] $values() {
        return new OKBuySellSource[]{HOME, PORTFOLIO, EXPLORE, ACTIVITY, ASSET_DETAIL, LITE_ADVANCED_HOME, UNKNOWN_SOURCE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OKBuySellSource> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.api.OKBuySellSource.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) OKBuySellSource.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<OKBuySellSource> serializer() {
            return copydefault();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.buysell.api.OKBuySellSource", values());
    }

    private OKBuySellSource(String str, int i, String str2) {
        this.tag = str2;
    }

    static {
        OKBuySellSource[] oKBuySellSourceArr$values = $values();
        $VALUES = oKBuySellSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(oKBuySellSourceArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.ltm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OKBuySellSource._init_$_anonymous_();
            }
        });
    }

    public static OKBuySellSource valueOf(String str) {
        return (OKBuySellSource) Enum.valueOf(OKBuySellSource.class, str);
    }

    public static OKBuySellSource[] values() {
        return (OKBuySellSource[]) $VALUES.clone();
    }
}
