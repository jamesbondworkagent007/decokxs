package o;

import androidx.lifecycle.SavedStateHandle;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.TradeHistoryOrderData;
import com.okinc.unify_trade.trade.setting.setting_data.SettingType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.upe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC49496upe extends InterfaceC43217rlC {
    InterfaceC49427uoO EZpvd(@NotNull InterfaceC49435uoW interfaceC49435uoW, @NotNull android.view.View view);

    InterfaceC49434uoV EZpvd(@NotNull android.view.View view, @NotNull InterfaceC49498upg interfaceC49498upg, @NotNull android.app.Application application, @NotNull SavedStateHandle savedStateHandle);

    wXX EZpvd(java.lang.String str, @NotNull java.lang.String str2);

    void EZpvd(@NotNull android.content.Context context, java.lang.String str, java.lang.Boolean bool);

    void EZpvd(@NotNull android.content.Context context, java.lang.String str, java.lang.Integer num, java.lang.Boolean bool, java.lang.String str2, java.lang.Integer num2, java.lang.String str3, java.lang.String str4, TradeHistoryOrderData tradeHistoryOrderData);

    boolean EZpvd(android.content.Context context);

    boolean EZpvd(BizInstrument bizInstrument, @NotNull androidx.fragment.app.FragmentManager fragmentManager);

    AbstractC52792wYn KWHzl(BizInstrument bizInstrument, @NotNull SettingType settingType, boolean z, @NotNull yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.Boolean, Unit> yho, Function0<Unit> function0);

    void KWHzl();

    boolean KWHzl(BizInstrument bizInstrument);

    InterfaceC49432uoT OLrzqt(@NotNull android.view.View view, @NotNull InterfaceC49498upg interfaceC49498upg, @NotNull android.app.Application application, @NotNull SavedStateHandle savedStateHandle);

    AbstractC52792wYn OLrzqt(@NotNull Function0<Unit> function0);

    void OLrzqt();

    void OLrzqt(java.lang.String str, @NotNull java.lang.String str2);

    xHS copydefault(@NotNull android.view.View view, @NotNull InterfaceC49498upg interfaceC49498upg, @NotNull android.app.Application application, @NotNull SavedStateHandle savedStateHandle);

    void copydefault(@NotNull TradePositionManager.PositionItem positionItem, @NotNull android.content.Context context);

    void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    /* JADX INFO: renamed from: o.upe$Application */
    public static final class Application {
        public static /* synthetic */ void startAccountModeActivity$default(InterfaceC49496upe interfaceC49496upe, android.content.Context context, java.lang.String str, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startAccountModeActivity");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 4) != 0) {
                bool = java.lang.Boolean.FALSE;
            }
            interfaceC49496upe.EZpvd(context, str, bool);
        }

        public static /* synthetic */ wXX provideMoreToolsBottomFragment$default(InterfaceC49496upe interfaceC49496upe, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: provideMoreToolsBottomFragment");
            }
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            return interfaceC49496upe.EZpvd(str, str2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.upe */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AbstractC52792wYn tradeUnitContractAndOptionBottomSheet$default(InterfaceC49496upe interfaceC49496upe, BizInstrument bizInstrument, SettingType settingType, boolean z, yHO yho, Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tradeUnitContractAndOptionBottomSheet");
            }
            if ((i & 4) != 0) {
                z = false;
            }
            boolean z2 = z;
            if ((i & 16) != 0) {
                function0 = null;
            }
            return interfaceC49496upe.KWHzl(bizInstrument, settingType, z2, yho, function0);
        }

        public static /* synthetic */ void startMoreActivity$default(InterfaceC49496upe interfaceC49496upe, android.content.Context context, java.lang.String str, java.lang.Integer num, java.lang.Boolean bool, java.lang.String str2, java.lang.Integer num2, java.lang.String str3, java.lang.String str4, TradeHistoryOrderData tradeHistoryOrderData, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startMoreActivity");
            }
            interfaceC49496upe.EZpvd(context, (i & 2) != 0 ? null : str, (i & 4) != 0 ? 0 : num, (i & 8) != 0 ? java.lang.Boolean.FALSE : bool, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? 0 : num2, (i & 64) != 0 ? "" : str3, (i & 128) == 0 ? str4 : "", (i & 256) == 0 ? tradeHistoryOrderData : null);
        }
    }
}
