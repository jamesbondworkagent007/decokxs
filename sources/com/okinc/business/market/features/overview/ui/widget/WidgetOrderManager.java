package com.okinc.business.market.features.overview.ui.widget;

import android.view.View;
import android.view.ViewGroup;
import com.okinc.business.market.features.overview.ui.widget.WidgetOrderManager;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C56390yDp;
import o.C56392yDr;
import o.C56424yEw;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.hAO;
import o.pUU;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class WidgetOrderManager {
    public final hAO EZpvd;
    public final InterfaceC56387yDm OLrzqt;

    public WidgetOrderManager(@NotNull hAO hao) {
        Intrinsics.checkNotNullParameter(hao, "");
        this.EZpvd = hao;
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.kmZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return WidgetOrderManager.KWHzl(this.copydefault);
            }
        });
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class WidgetType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ WidgetType[] $VALUES;
        public static final WidgetType BASIC_INFO = new WidgetType("BASIC_INFO", 0);
        public static final WidgetType SOCIALS = new WidgetType("SOCIALS", 1);
        public static final WidgetType AI_NARRATIVE = new WidgetType("AI_NARRATIVE", 2);
        public static final WidgetType TRANSACTION_INFO = new WidgetType("TRANSACTION_INFO", 3);
        public static final WidgetType MARKET_INFO = new WidgetType("MARKET_INFO", 4);
        public static final WidgetType VIBES = new WidgetType("VIBES", 5);
        public static final WidgetType DEFI = new WidgetType("DEFI", 6);
        public static final WidgetType STOCK_INFO = new WidgetType("STOCK_INFO", 7);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ WidgetType[] $values() {
            return new WidgetType[]{BASIC_INFO, SOCIALS, AI_NARRATIVE, TRANSACTION_INFO, MARKET_INFO, VIBES, DEFI, STOCK_INFO};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<WidgetType> getEntries() {
            return $ENTRIES;
        }

        private WidgetType(String str, int i) {
        }

        static {
            WidgetType[] widgetTypeArr$values = $values();
            $VALUES = widgetTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(widgetTypeArr$values);
        }

        public static WidgetType valueOf(String str) {
            return (WidgetType) Enum.valueOf(WidgetType.class, str);
        }

        public static WidgetType[] values() {
            return (WidgetType[]) $VALUES.clone();
        }
    }

    public final Map<WidgetType, ViewGroup> KWHzl() {
        return (Map) this.OLrzqt.getValue();
    }

    public static final Map KWHzl(WidgetOrderManager widgetOrderManager) {
        return C56424yEw.gEmmrt(C56390yDp.OLrzqt(WidgetType.BASIC_INFO, widgetOrderManager.EZpvd.copydefault), C56390yDp.OLrzqt(WidgetType.MARKET_INFO, widgetOrderManager.EZpvd.values), C56390yDp.OLrzqt(WidgetType.AI_NARRATIVE, widgetOrderManager.EZpvd.KWHzl), C56390yDp.OLrzqt(WidgetType.TRANSACTION_INFO, widgetOrderManager.EZpvd.isConnected), C56390yDp.OLrzqt(WidgetType.SOCIALS, widgetOrderManager.EZpvd.AkhnZx), C56390yDp.OLrzqt(WidgetType.VIBES, widgetOrderManager.EZpvd.ejfBZ), C56390yDp.OLrzqt(WidgetType.DEFI, widgetOrderManager.EZpvd.AuCTel), C56390yDp.OLrzqt(WidgetType.STOCK_INFO, widgetOrderManager.EZpvd.fIwbmz));
    }

    public final List<WidgetType> EZpvd(boolean z, boolean z2, boolean z3) {
        if (z) {
            return yDY.gEmmrt(WidgetType.BASIC_INFO, WidgetType.MARKET_INFO, WidgetType.AI_NARRATIVE, WidgetType.TRANSACTION_INFO, WidgetType.SOCIALS, WidgetType.DEFI);
        }
        if (z2) {
            return yDY.gEmmrt(WidgetType.BASIC_INFO, WidgetType.MARKET_INFO, WidgetType.AI_NARRATIVE, WidgetType.TRANSACTION_INFO, WidgetType.SOCIALS, WidgetType.VIBES, WidgetType.DEFI);
        }
        if (z3) {
            return yDY.gEmmrt(WidgetType.BASIC_INFO, WidgetType.STOCK_INFO, WidgetType.MARKET_INFO, WidgetType.TRANSACTION_INFO, WidgetType.SOCIALS, WidgetType.AI_NARRATIVE, WidgetType.VIBES, WidgetType.DEFI);
        }
        return yDY.gEmmrt(WidgetType.BASIC_INFO, WidgetType.SOCIALS, WidgetType.AI_NARRATIVE, WidgetType.TRANSACTION_INFO, WidgetType.MARKET_INFO, WidgetType.VIBES, WidgetType.DEFI);
    }

    public final void AEQbTJ(boolean z, boolean z2, boolean z3) {
        int iIndexOfChild;
        try {
            int i = 0;
            View childAt = this.EZpvd.AhwBna.getChildAt(0);
            ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup == null) {
                return;
            }
            for (Object obj : EZpvd(z, z2, z3)) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                ViewGroup viewGroup2 = KWHzl().get((WidgetType) obj);
                if (viewGroup2 != null && (iIndexOfChild = viewGroup.indexOfChild(viewGroup2)) != -1 && iIndexOfChild != i) {
                    viewGroup.removeView(viewGroup2);
                    viewGroup.addView(viewGroup2, i);
                }
                i++;
            }
        } catch (Exception e) {
            pUU.AEQbTJ("WidgetOrderManager", "Failed to arrange widgets: " + e.getMessage(), e);
        }
    }
}
