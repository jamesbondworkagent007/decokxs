package o;

import com.okinc.business.dexlogic.bean.ContentTip;
import com.okinc.business.dexlogic.bean.CrossChainBridgeRulesData;
import com.okinc.business.dexlogic.bean.Extra;
import com.okinc.business.dexlogic.bean.RepeatOrderResponse;
import com.okinc.business.dexlogic.track.enums.DexHistoryDetailsPageView;
import com.okinc.business.dexlogic.track.enums.DexSwapPopConfirmClick;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ijc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24744ijc extends AbstractC24712iix {
    public final InterfaceC22335hdS copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24744ijc(@NotNull androidx.fragment.app.FragmentManager fragmentManager, android.app.Activity activity, @NotNull AbstractC23101hrq abstractC23101hrq, @NotNull InterfaceC22335hdS interfaceC22335hdS) {
        super(fragmentManager, activity, abstractC23101hrq);
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        Intrinsics.checkNotNullParameter(interfaceC22335hdS, "");
        this.copydefault = interfaceC22335hdS;
    }

    public final java.lang.String AhwBna() {
        Extra extra;
        InterfaceC22335hdS interfaceC22335hdS = this.copydefault;
        if (interfaceC22335hdS instanceof RepeatOrderResponse) {
            return ((RepeatOrderResponse) interfaceC22335hdS).getOrderId();
        }
        if (interfaceC22335hdS instanceof CrossChainBridgeRulesData) {
            ContentTip contentTip = ((CrossChainBridgeRulesData) interfaceC22335hdS).getContentTip();
            java.lang.String orderId = (contentTip == null || (extra = contentTip.getExtra()) == null) ? null : extra.getOrderId();
            if (orderId != null) {
                return orderId;
            }
        }
        return "";
    }

    public boolean AYXKKw() {
        InterfaceC22335hdS interfaceC22335hdS = this.copydefault;
        if (interfaceC22335hdS instanceof RepeatOrderResponse) {
            if (((RepeatOrderResponse) interfaceC22335hdS).isRepeatOrderHasNextStep() || (!((RepeatOrderResponse) this.copydefault).isEnoughFlag() && ((RepeatOrderResponse) this.copydefault).isRepeatOrder())) {
                return true;
            }
        } else if (interfaceC22335hdS instanceof CrossChainBridgeRulesData) {
            return ((CrossChainBridgeRulesData) interfaceC22335hdS).isRepeatOrderUnSupported();
        }
        return false;
    }

    @Override // o.AbstractC24712iix
    public java.lang.String gEmmrt() {
        return C33070mpX.AYXKKw(C23274hvD.Fragment.Ufzxmz);
    }

    @Override // o.AbstractC24712iix
    public java.lang.String AEQbTJ() {
        return valueOf();
    }

    @Override // o.AbstractC24712iix
    public boolean OLrzqt(@NotNull Function0<Unit> function0, androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(function0, "");
        boolean zAYXKKw = AYXKKw();
        if (zAYXKKw) {
            DbNXlk();
        }
        return zAYXKKw;
    }

    public final void DbNXlk() {
        copydefault().dvKsVJ().setValue(java.lang.Boolean.FALSE);
        final java.lang.String strQCjLjM = copydefault().QCjLjM();
        InterfaceC22335hdS interfaceC22335hdS = this.copydefault;
        AbstractC24712iix.showCheckDialog$default(this, EZpvd(), (AhwBna().length() != 0 || (interfaceC22335hdS instanceof RepeatOrderResponse ? ((RepeatOrderResponse) interfaceC22335hdS).isEnoughFlag() : true)) ? C23274hvD.Fragment.MediaControllerCompatMediaControllerImplApi21ExtraCallback : -1, C23274hvD.Fragment.processPendingCallbacksLocked, 0, 0, new Function0() { // from class: o.iji
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24744ijc.copydefault(this.copydefault, strQCjLjM);
            }
        }, new Function0() { // from class: o.ijj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24744ijc.OLrzqt(this.KWHzl, strQCjLjM);
            }
        }, null, null, 408, null);
    }

    public static final Unit OLrzqt(C24744ijc c24744ijc, java.lang.String str) {
        c24744ijc.copydefault(str);
        c24744ijc.AkhnZx();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C24744ijc c24744ijc, java.lang.String str) {
        c24744ijc.OLrzqt(str);
        return Unit.INSTANCE;
    }

    public final void AkhnZx() {
        java.lang.String strAhwBna = AhwBna();
        android.app.Activity activityOLrzqt = OLrzqt();
        if (activityOLrzqt != null) {
            android.content.Intent intent = new android.content.Intent(OLrzqt(), (java.lang.Class<?>) ActivityC22009hUn.class);
            C31200lpY.EZpvd(intent, copydefault().ffGIBT());
            intent.putExtra(OtcExtraKeys.ORDER_ID, strAhwBna);
            intent.putExtra("source", DexHistoryDetailsPageView.Source.TRANSACTION_HISTORY.getValue());
            activityOLrzqt.startActivity(intent);
        }
    }

    public final void OLrzqt(final java.lang.String str) {
        C32866mlf.onEvent$default("app_swap_repeat_order_close", (TrackChannel[]) null, new Function1() { // from class: o.ijg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24744ijc.KWHzl(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C22877hne.OLrzqt.EZpvd(copydefault().ffGIBT(), DexSwapPopConfirmClick.ButtonName.CANCEL.getValue(), (56 & 4) != 0 ? "" : DexSwapPopConfirmClick.PopupType.REPEAT_ORDER_WITHOUT_ENOUGH_BALANCE.getValue(), (56 & 8) != 0 ? "" : null, (56 & 16) != 0 ? "" : null, (56 & 32) != 0 ? "" : null);
    }

    public static final Unit KWHzl(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("user_address", str, false);
        return Unit.INSTANCE;
    }

    public final void copydefault(final java.lang.String str) {
        C32866mlf.onEvent$default("app_swap_repeat_order_close", (TrackChannel[]) null, new Function1() { // from class: o.ijf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24744ijc.copydefault(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C22877hne.OLrzqt.EZpvd(copydefault().ffGIBT(), DexSwapPopConfirmClick.ButtonName.VIEW_LAST_ORDER.getValue(), (56 & 4) != 0 ? "" : DexSwapPopConfirmClick.PopupType.REPEAT_ORDER_WITHOUT_ENOUGH_BALANCE.getValue(), (56 & 8) != 0 ? "" : null, (56 & 16) != 0 ? "" : null, (56 & 32) != 0 ? "" : null);
    }

    public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("user_address", str, false);
        return Unit.INSTANCE;
    }

    public final java.lang.String valueOf() {
        InterfaceC22335hdS interfaceC22335hdS = this.copydefault;
        if (interfaceC22335hdS instanceof RepeatOrderResponse) {
            return C25352ivB.OLrzqt(false, ((RepeatOrderResponse) interfaceC22335hdS).isEnoughFlag());
        }
        if (!(interfaceC22335hdS instanceof CrossChainBridgeRulesData)) {
            return C25352ivB.OLrzqt(false, false);
        }
        if (!((CrossChainBridgeRulesData) interfaceC22335hdS).isRepeatOrderUnSupported()) {
            return C33070mpX.AYXKKw(C23274hvD.Fragment.heceqZ);
        }
        ContentTip contentTip = ((CrossChainBridgeRulesData) this.copydefault).getContentTip();
        java.lang.String msg = contentTip != null ? contentTip.getMsg() : null;
        return msg == null ? "" : msg;
    }
}
