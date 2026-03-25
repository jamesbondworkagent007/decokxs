package o;

import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.dexlogic.bean.track.TrackOrderType;
import com.okinc.business.dexui.main.shared.model.TradeMode;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedPriorityFeeType;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.leV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC30614leV {
    yHO<java.lang.String, java.lang.String, java.util.Map<java.lang.String, java.lang.String>, Unit> AEQbTJ(@NotNull java.lang.String str, @NotNull TrackOrderType trackOrderType, @NotNull TradeMode tradeMode, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i);

    void EZpvd(@NotNull java.lang.String str, @NotNull TrackOrderType trackOrderType, @NotNull TradeMode tradeMode, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, @NotNull java.util.Map<java.lang.String, java.lang.String> map, int i);

    void KWHzl(@NotNull java.lang.String str, @NotNull TrackOrderType trackOrderType, @NotNull TradeMode tradeMode, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z, PresetRouteType presetRouteType, @NotNull SlippageMode slippageMode, AdvancedPriorityFeeType advancedPriorityFeeType, @NotNull java.lang.String str5, int i, @NotNull java.util.Map<java.lang.String, java.lang.String> map);

    void OLrzqt(@NotNull java.lang.String str, @NotNull TrackOrderType trackOrderType, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull TradeMode tradeMode, int i);

    /* JADX INFO: renamed from: o.leV$ActionBar */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: o.leV */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void trackSettingsClick$default(InterfaceC30614leV interfaceC30614leV, java.lang.String str, TrackOrderType trackOrderType, TradeMode tradeMode, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.Map map, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackSettingsClick");
            }
            interfaceC30614leV.EZpvd(str, trackOrderType, tradeMode, str2, str3, str4, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? C56424yEw.KWHzl() : map, i);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: o.leV */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void trackSettingsSubmit$default(InterfaceC30614leV interfaceC30614leV, java.lang.String str, TrackOrderType trackOrderType, TradeMode tradeMode, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, PresetRouteType presetRouteType, SlippageMode slippageMode, AdvancedPriorityFeeType advancedPriorityFeeType, java.lang.String str5, int i, java.util.Map map, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackSettingsSubmit");
            }
            interfaceC30614leV.KWHzl(str, trackOrderType, tradeMode, str2, str3, str4, z, (i2 & 128) != 0 ? null : presetRouteType, slippageMode, (i2 & 512) != 0 ? null : advancedPriorityFeeType, str5, i, (i2 & 4096) != 0 ? C56424yEw.KWHzl() : map);
        }
    }
}
