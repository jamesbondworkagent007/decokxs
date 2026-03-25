package com.okinc.business.market.data.constant;

import com.okinc.business.market.data.constant.AddressTrackerSortType;
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
public final class AddressTrackerSortType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AddressTrackerSortType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int value;

    @SerialName("1")
    public static final AddressTrackerSortType TrackedTime = new AddressTrackerSortType("TrackedTime", 0, 1);

    @SerialName("2")
    public static final AddressTrackerSortType SevenDayPnl = new AddressTrackerSortType("SevenDayPnl", 1, 2);

    @SerialName("3")
    public static final AddressTrackerSortType ThreeMonthPnl = new AddressTrackerSortType("ThreeMonthPnl", 2, 3);

    @SerialName("4")
    public static final AddressTrackerSortType SevenDayTransactionCount = new AddressTrackerSortType("SevenDayTransactionCount", 3, 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AddressTrackerSortType[] $values() {
        return new AddressTrackerSortType[]{TrackedTime, SevenDayPnl, ThreeMonthPnl, SevenDayTransactionCount};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AddressTrackerSortType> getEntries() {
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.constant.AddressTrackerSortType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer OLrzqt() {
            return (KSerializer) AddressTrackerSortType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<AddressTrackerSortType> serializer() {
            return OLrzqt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.market.data.constant.AddressTrackerSortType", values(), new String[]{"1", "2", "3", "4"}, new Annotation[][]{null, null, null, null}, null);
    }

    private AddressTrackerSortType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        AddressTrackerSortType[] addressTrackerSortTypeArr$values = $values();
        $VALUES = addressTrackerSortTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(addressTrackerSortTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.jyH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AddressTrackerSortType._init_$_anonymous_();
            }
        });
    }

    public static AddressTrackerSortType valueOf(String str) {
        return (AddressTrackerSortType) Enum.valueOf(AddressTrackerSortType.class, str);
    }

    public static AddressTrackerSortType[] values() {
        return (AddressTrackerSortType[]) $VALUES.clone();
    }
}
