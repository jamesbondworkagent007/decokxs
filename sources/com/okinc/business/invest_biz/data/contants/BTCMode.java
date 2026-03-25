package com.okinc.business.invest_biz.data.contants;

import com.okinc.business.invest_biz.data.contants.BTCMode;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
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
public final class BTCMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BTCMode[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;

    @SerialName("0")
    public static final BTCMode DEFAULT = new BTCMode("DEFAULT", 0);

    @SerialName("1")
    public static final BTCMode DOT_SWAP = new BTCMode("DOT_SWAP", 1);

    @SerialName("2")
    public static final BTCMode BABYLON = new BTCMode("BABYLON", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BTCMode[] $values() {
        return new BTCMode[]{DEFAULT, DOT_SWAP, BABYLON};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BTCMode> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.contants.BTCMode.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) BTCMode.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<BTCMode> serializer() {
            return copydefault();
        }
    }

    private BTCMode(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.invest_biz.data.contants.BTCMode", values(), new String[]{"0", "1", "2"}, new Annotation[][]{null, null, null}, null);
    }

    static {
        BTCMode[] bTCModeArr$values = $values();
        $VALUES = bTCModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(bTCModeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.iyt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BTCMode._init_$_anonymous_();
            }
        });
    }

    public static BTCMode valueOf(String str) {
        return (BTCMode) Enum.valueOf(BTCMode.class, str);
    }

    public static BTCMode[] values() {
        return (BTCMode[]) $VALUES.clone();
    }
}
