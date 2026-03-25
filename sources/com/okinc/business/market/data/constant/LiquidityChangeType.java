package com.okinc.business.market.data.constant;

import com.okinc.business.market.data.constant.LiquidityChangeType;
import com.okinc.okimcore.model.other.OKGroupNotificationMessage;
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
public final class LiquidityChangeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LiquidityChangeType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final String value;

    @SerialName("0")
    public static final LiquidityChangeType All = new LiquidityChangeType("All", 0, "0");

    @SerialName("1")
    public static final LiquidityChangeType Add = new LiquidityChangeType(OKGroupNotificationMessage.GROUP_OPERATION_ADD, 1, "1");

    @SerialName("2")
    public static final LiquidityChangeType Remove = new LiquidityChangeType("Remove", 2, "2");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LiquidityChangeType[] $values() {
        return new LiquidityChangeType[]{All, Add, Remove};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LiquidityChangeType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.constant.LiquidityChangeType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) LiquidityChangeType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<LiquidityChangeType> serializer() {
            return AEQbTJ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.market.data.constant.LiquidityChangeType", values(), new String[]{"0", "1", "2"}, new Annotation[][]{null, null, null}, null);
    }

    private LiquidityChangeType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        LiquidityChangeType[] liquidityChangeTypeArr$values = $values();
        $VALUES = liquidityChangeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(liquidityChangeTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.jyJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LiquidityChangeType._init_$_anonymous_();
            }
        });
    }

    public static LiquidityChangeType valueOf(String str) {
        return (LiquidityChangeType) Enum.valueOf(LiquidityChangeType.class, str);
    }

    public static LiquidityChangeType[] values() {
        return (LiquidityChangeType[]) $VALUES.clone();
    }
}
