package com.okinc.find_ui.widgetprovider.p2p.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class P2PTradeSide {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ P2PTradeSide[] $VALUES;
    public static final ActionBar Companion;
    private final String accessibilityId;
    private final int title;
    private final String value;
    public static final P2PTradeSide BUY = new P2PTradeSide("BUY", 0, "buy", qZH.PendingIntent.QHmsKR, "p2pWidgetsBuyTab");
    public static final P2PTradeSide SELL = new P2PTradeSide("SELL", 1, "sell", qZH.PendingIntent.QkdxfA, "p2pWidgetsSellTab");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ P2PTradeSide[] $values() {
        return new P2PTradeSide[]{BUY, SELL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<P2PTradeSide> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccessibilityId() {
        return this.accessibilityId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private P2PTradeSide(String str, int i, String str2, int i2, String str3) {
        this.value = str2;
        this.title = i2;
        this.accessibilityId = str3;
    }

    static {
        P2PTradeSide[] p2PTradeSideArr$values = $values();
        $VALUES = p2PTradeSideArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(p2PTradeSideArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.find_ui.widgetprovider.p2p.data.P2PTradeSide.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final P2PTradeSide KWHzl(@NotNull String str) {
            P2PTradeSide p2PTradeSide;
            Intrinsics.checkNotNullParameter(str, "");
            P2PTradeSide[] p2PTradeSideArrValues = P2PTradeSide.values();
            int length = p2PTradeSideArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    p2PTradeSide = null;
                    break;
                }
                p2PTradeSide = p2PTradeSideArrValues[i];
                if (Intrinsics.EZpvd((Object) p2PTradeSide.getValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return p2PTradeSide == null ? P2PTradeSide.BUY : p2PTradeSide;
        }
    }

    public static P2PTradeSide valueOf(String str) {
        return (P2PTradeSide) Enum.valueOf(P2PTradeSide.class, str);
    }

    public static P2PTradeSide[] values() {
        return (P2PTradeSide[]) $VALUES.clone();
    }
}
