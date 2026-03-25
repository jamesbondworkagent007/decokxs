package com.okinc.cruilib.view.listitem.share;

import com.okinc.cruilib.view.listitem.share.OKCRTrend;
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
public final class OKCRTrend {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OKCRTrend[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final OKCRTrend UP = new OKCRTrend("UP", 0);
    public static final OKCRTrend DOWN = new OKCRTrend("DOWN", 1);
    public static final OKCRTrend FLAT = new OKCRTrend("FLAT", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OKCRTrend[] $values() {
        return new OKCRTrend[]{UP, DOWN, FLAT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OKCRTrend> getEntries() {
        return $ENTRIES;
    }

    private OKCRTrend(String str, int i) {
    }

    static {
        OKCRTrend[] oKCRTrendArr$values = $values();
        $VALUES = oKCRTrendArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(oKCRTrendArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.mJc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OKCRTrend._init_$_anonymous_();
            }
        });
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cruilib.view.listitem.share.OKCRTrend.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) OKCRTrend.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<OKCRTrend> serializer() {
            return AEQbTJ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.cruilib.view.listitem.share.OKCRTrend", values());
    }

    public static OKCRTrend valueOf(String str) {
        return (OKCRTrend) Enum.valueOf(OKCRTrend.class, str);
    }

    public static OKCRTrend[] values() {
        return (OKCRTrend[]) $VALUES.clone();
    }
}
