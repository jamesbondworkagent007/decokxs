package com.okinc.business.market.data.constant;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import com.okinc.business.market.data.constant.AddressTrackerUserAction;
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
/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class AddressTrackerUserAction {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AddressTrackerUserAction[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int value;

    @SerialName(MultiTransferSignData.DEFAULT_INTERVAL)
    public static final AddressTrackerUserAction UNKNOWN = new AddressTrackerUserAction("UNKNOWN", 0, -1);

    @SerialName("1")
    public static final AddressTrackerUserAction NEWLY_HOLD = new AddressTrackerUserAction("NEWLY_HOLD", 1, 1);

    @SerialName("2")
    public static final AddressTrackerUserAction BUY_MORE = new AddressTrackerUserAction("BUY_MORE", 2, 2);

    @SerialName("3")
    public static final AddressTrackerUserAction SELL_PARTIALLY = new AddressTrackerUserAction("SELL_PARTIALLY", 3, 3);

    @SerialName("4")
    public static final AddressTrackerUserAction SELL_ALL = new AddressTrackerUserAction("SELL_ALL", 4, 4);

    @SerialName("5")
    public static final AddressTrackerUserAction BUY = new AddressTrackerUserAction("BUY", 5, 5);

    @SerialName(OrderDetailListItem.SLIP_OUT)
    public static final AddressTrackerUserAction SELL = new AddressTrackerUserAction("SELL", 6, 6);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AddressTrackerUserAction[] $values() {
        return new AddressTrackerUserAction[]{UNKNOWN, NEWLY_HOLD, BUY_MORE, SELL_PARTIALLY, SELL_ALL, BUY, SELL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AddressTrackerUserAction> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private AddressTrackerUserAction(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        AddressTrackerUserAction[] addressTrackerUserActionArr$values = $values();
        $VALUES = addressTrackerUserActionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(addressTrackerUserActionArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.jyF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AddressTrackerUserAction._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.constant.AddressTrackerUserAction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer OLrzqt() {
            return (KSerializer) AddressTrackerUserAction.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<AddressTrackerUserAction> serializer() {
            return OLrzqt();
        }

        public final AddressTrackerUserAction KWHzl(int i) {
            AddressTrackerUserAction next;
            Iterator<AddressTrackerUserAction> it = AddressTrackerUserAction.getEntries().iterator();
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
            AddressTrackerUserAction addressTrackerUserAction = next;
            return addressTrackerUserAction == null ? AddressTrackerUserAction.UNKNOWN : addressTrackerUserAction;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.market.data.constant.AddressTrackerUserAction", values(), new String[]{MultiTransferSignData.DEFAULT_INTERVAL, "1", "2", "3", "4", "5", OrderDetailListItem.SLIP_OUT}, new Annotation[][]{null, null, null, null, null, null, null}, null);
    }

    public static AddressTrackerUserAction valueOf(String str) {
        return (AddressTrackerUserAction) Enum.valueOf(AddressTrackerUserAction.class, str);
    }

    public static AddressTrackerUserAction[] values() {
        return (AddressTrackerUserAction[]) $VALUES.clone();
    }
}
