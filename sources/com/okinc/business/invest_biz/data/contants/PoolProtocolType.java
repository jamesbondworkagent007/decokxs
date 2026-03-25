package com.okinc.business.invest_biz.data.contants;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.invest_biz.data.contants.PoolProtocolType;
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
public final class PoolProtocolType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PoolProtocolType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;

    @SerialName(MultiTransferSignData.DEFAULT_INTERVAL)
    public static final PoolProtocolType Unknown = new PoolProtocolType("Unknown", 0, -1);

    @SerialName("1")
    public static final PoolProtocolType V2 = new PoolProtocolType("V2", 1, 1);

    @SerialName("2")
    public static final PoolProtocolType V3 = new PoolProtocolType("V3", 2, 2);
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PoolProtocolType[] $values() {
        return new PoolProtocolType[]{Unknown, V2, V3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PoolProtocolType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.contants.PoolProtocolType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer OLrzqt() {
            return (KSerializer) PoolProtocolType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<PoolProtocolType> serializer() {
            return OLrzqt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.invest_biz.data.contants.PoolProtocolType", values(), new String[]{MultiTransferSignData.DEFAULT_INTERVAL, "1", "2"}, new Annotation[][]{null, null, null}, null);
    }

    private PoolProtocolType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        PoolProtocolType[] poolProtocolTypeArr$values = $values();
        $VALUES = poolProtocolTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(poolProtocolTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.iyy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PoolProtocolType._init_$_anonymous_();
            }
        });
    }

    public static PoolProtocolType valueOf(String str) {
        return (PoolProtocolType) Enum.valueOf(PoolProtocolType.class, str);
    }

    public static PoolProtocolType[] values() {
        return (PoolProtocolType[]) $VALUES.clone();
    }
}
