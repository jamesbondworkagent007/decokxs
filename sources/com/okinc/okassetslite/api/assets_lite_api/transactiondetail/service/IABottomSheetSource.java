package com.okinc.okassetslite.api.assets_lite_api.transactiondetail.service;

import com.okinc.okassetslite.api.assets_lite_api.transactiondetail.service.IABottomSheetSource;
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
public final class IABottomSheetSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ IABottomSheetSource[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final String tag;
    public static final IABottomSheetSource LITE_SIMPLE_HOME = new IABottomSheetSource("LITE_SIMPLE_HOME", 0, "LITE_SIMPLE_HOME");
    public static final IABottomSheetSource LITE_SIMPLE_PORTFOLIO = new IABottomSheetSource("LITE_SIMPLE_PORTFOLIO", 1, "LITE_SIMPLE_PORTFOLIO");
    public static final IABottomSheetSource LITE_SIMPLE_ASSETS_DETAILS = new IABottomSheetSource("LITE_SIMPLE_ASSETS_DETAILS", 2, "LITE_SIMPLE_ASSETS_DETAILS");
    public static final IABottomSheetSource LITE_SIMPLE_DISCOVER = new IABottomSheetSource("LITE_SIMPLE_DISCOVER", 3, "LITE_SIMPLE_DISCOVER");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ IABottomSheetSource[] $values() {
        return new IABottomSheetSource[]{LITE_SIMPLE_HOME, LITE_SIMPLE_PORTFOLIO, LITE_SIMPLE_ASSETS_DETAILS, LITE_SIMPLE_DISCOVER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<IABottomSheetSource> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okassetslite.api.assets_lite_api.transactiondetail.service.IABottomSheetSource.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) IABottomSheetSource.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<IABottomSheetSource> serializer() {
            return AEQbTJ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.okassetslite.api.assets_lite_api.transactiondetail.service.IABottomSheetSource", values());
    }

    private IABottomSheetSource(String str, int i, String str2) {
        this.tag = str2;
    }

    static {
        IABottomSheetSource[] iABottomSheetSourceArr$values = $values();
        $VALUES = iABottomSheetSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(iABottomSheetSourceArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.rWW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return IABottomSheetSource._init_$_anonymous_();
            }
        });
    }

    public static IABottomSheetSource valueOf(String str) {
        return (IABottomSheetSource) Enum.valueOf(IABottomSheetSource.class, str);
    }

    public static IABottomSheetSource[] values() {
        return (IABottomSheetSource[]) $VALUES.clone();
    }
}
