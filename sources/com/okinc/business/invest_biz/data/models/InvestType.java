package com.okinc.business.invest_biz.data.models;

import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import com.okinc.business.invest_biz.data.models.InvestType;
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
public final class InvestType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InvestType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int value;

    @SerialName("1")
    public static final InvestType Save = new InvestType("Save", 0, 1);

    @SerialName("2")
    public static final InvestType Pool = new InvestType("Pool", 1, 2);

    @SerialName("3")
    public static final InvestType Farm = new InvestType("Farm", 2, 3);

    @SerialName("4")
    public static final InvestType Vaults = new InvestType("Vaults", 3, 4);

    @SerialName("5")
    public static final InvestType Stake = new InvestType("Stake", 4, 5);

    @SerialName(OrderDetailListItem.SLIP_OUT)
    public static final InvestType Borrow = new InvestType("Borrow", 5, 6);

    @SerialName("7")
    public static final InvestType Pos = new InvestType("Pos", 6, 7);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InvestType[] $values() {
        return new InvestType[]{Save, Pool, Farm, Vaults, Stake, Borrow, Pos};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InvestType> getEntries() {
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.models.InvestType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer EZpvd() {
            return (KSerializer) InvestType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<InvestType> serializer() {
            return EZpvd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.invest_biz.data.models.InvestType", values(), new String[]{"1", "2", "3", "4", "5", OrderDetailListItem.SLIP_OUT, "7"}, new Annotation[][]{null, null, null, null, null, null, null}, null);
    }

    private InvestType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        InvestType[] investTypeArr$values = $values();
        $VALUES = investTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(investTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.iDg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InvestType._init_$_anonymous_();
            }
        });
    }

    public static InvestType valueOf(String str) {
        return (InvestType) Enum.valueOf(InvestType.class, str);
    }

    public static InvestType[] values() {
        return (InvestType[]) $VALUES.clone();
    }
}
