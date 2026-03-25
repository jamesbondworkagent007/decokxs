package com.okinc.business.dexlogic.main.limmitorder.bean;

import com.okinc.business.dexlogic.main.limmitorder.bean.LimitMemeOrderStrategyType;
import java.lang.annotation.Annotation;
import java.util.Iterator;
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
/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class LimitMemeOrderStrategyType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LimitMemeOrderStrategyType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int value;

    @SerialName("2")
    public static final LimitMemeOrderStrategyType BUY_DIP = new LimitMemeOrderStrategyType("BUY_DIP", 0, 2);

    @SerialName("3")
    public static final LimitMemeOrderStrategyType TAKE_PROFIT = new LimitMemeOrderStrategyType("TAKE_PROFIT", 1, 3);

    @SerialName("4")
    public static final LimitMemeOrderStrategyType STOP_LOSS = new LimitMemeOrderStrategyType("STOP_LOSS", 2, 4);

    @SerialName("5")
    public static final LimitMemeOrderStrategyType BUY_ABOVE = new LimitMemeOrderStrategyType("BUY_ABOVE", 3, 5);

    @SerialName("8")
    public static final LimitMemeOrderStrategyType MARKET_BUY = new LimitMemeOrderStrategyType("MARKET_BUY", 4, 8);

    @SerialName("9")
    public static final LimitMemeOrderStrategyType MARKET_SELL = new LimitMemeOrderStrategyType("MARKET_SELL", 5, 9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LimitMemeOrderStrategyType[] $values() {
        return new LimitMemeOrderStrategyType[]{BUY_DIP, TAKE_PROFIT, STOP_LOSS, BUY_ABOVE, MARKET_BUY, MARKET_SELL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LimitMemeOrderStrategyType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private LimitMemeOrderStrategyType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        LimitMemeOrderStrategyType[] limitMemeOrderStrategyTypeArr$values = $values();
        $VALUES = limitMemeOrderStrategyTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(limitMemeOrderStrategyTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.hgr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LimitMemeOrderStrategyType._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.limmitorder.bean.LimitMemeOrderStrategyType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer OLrzqt() {
            return (KSerializer) LimitMemeOrderStrategyType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<LimitMemeOrderStrategyType> serializer() {
            return OLrzqt();
        }

        public final LimitMemeOrderStrategyType OLrzqt(int i) {
            LimitMemeOrderStrategyType next;
            Iterator<LimitMemeOrderStrategyType> it = LimitMemeOrderStrategyType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.getValue() == i) {
                    break;
                }
            }
            LimitMemeOrderStrategyType limitMemeOrderStrategyType = next;
            return limitMemeOrderStrategyType == null ? LimitMemeOrderStrategyType.BUY_DIP : limitMemeOrderStrategyType;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.dexlogic.main.limmitorder.bean.LimitMemeOrderStrategyType", values(), new String[]{"2", "3", "4", "5", "8", "9"}, new Annotation[][]{null, null, null, null, null, null}, null);
    }

    public static LimitMemeOrderStrategyType valueOf(String str) {
        return (LimitMemeOrderStrategyType) Enum.valueOf(LimitMemeOrderStrategyType.class, str);
    }

    public static LimitMemeOrderStrategyType[] values() {
        return (LimitMemeOrderStrategyType[]) $VALUES.clone();
    }
}
