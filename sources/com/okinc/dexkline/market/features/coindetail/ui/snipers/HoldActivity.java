package com.okinc.dexkline.market.features.coindetail.ui.snipers;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.dexkline.market.features.coindetail.ui.snipers.HoldActivity;
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
/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class HoldActivity {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ HoldActivity[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;

    @SerialName("0")
    public static final HoldActivity HOLD = new HoldActivity("HOLD", 0, "0");

    @SerialName("10")
    public static final HoldActivity BUY_MORE = new HoldActivity("BUY_MORE", 1, "10");

    @SerialName("20")
    public static final HoldActivity SELL_PART = new HoldActivity("SELL_PART", 2, "20");

    @SerialName("30")
    public static final HoldActivity SELL_ALL = new HoldActivity("SELL_ALL", 3, "30");

    @SerialName("40")
    public static final HoldActivity TRANSFER = new HoldActivity("TRANSFER", 4, "40");

    @SerialName(MultiTransferSignData.DEFAULT_INTERVAL)
    public static final HoldActivity UNKNOWN = new HoldActivity("UNKNOWN", 5, MultiTransferSignData.DEFAULT_INTERVAL);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ HoldActivity[] $values() {
        return new HoldActivity[]{HOLD, BUY_MORE, SELL_PART, SELL_ALL, TRANSFER, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<HoldActivity> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.features.coindetail.ui.snipers.HoldActivity.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) HoldActivity.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<HoldActivity> serializer() {
            return copydefault();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.dexkline.market.features.coindetail.ui.snipers.HoldActivity", values(), new String[]{"0", "10", "20", "30", "40", MultiTransferSignData.DEFAULT_INTERVAL}, new Annotation[][]{null, null, null, null, null, null}, null);
    }

    private HoldActivity(String str, int i, String str2) {
    }

    static {
        HoldActivity[] holdActivityArr$values = $values();
        $VALUES = holdActivityArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(holdActivityArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.mXp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return HoldActivity._init_$_anonymous_();
            }
        });
    }

    public static HoldActivity valueOf(String str) {
        return (HoldActivity) Enum.valueOf(HoldActivity.class, str);
    }

    public static HoldActivity[] values() {
        return (HoldActivity[]) $VALUES.clone();
    }
}
