package o;

import android.view.View;
import com.okinc.business.dexlogic.bean.ContentTip;
import com.okinc.business.dexlogic.bean.CrossChainBridgeRulesData;
import com.okinc.business.dexlogic.track.enums.DexSwapPopConfirmClick;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iiJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24672iiJ extends AbstractC24712iix {
    public final CrossChainBridgeRulesData copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC24712iix
    public java.lang.String gEmmrt() {
        return "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24672iiJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, android.app.Activity activity, @NotNull AbstractC23101hrq abstractC23101hrq, @NotNull InterfaceC22335hdS interfaceC22335hdS) {
        super(fragmentManager, activity, abstractC23101hrq);
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        Intrinsics.checkNotNullParameter(interfaceC22335hdS, "");
        this.copydefault = interfaceC22335hdS instanceof CrossChainBridgeRulesData ? (CrossChainBridgeRulesData) interfaceC22335hdS : null;
    }

    @Override // o.AbstractC24712iix
    public java.lang.String AEQbTJ() {
        ContentTip contentTip;
        CrossChainBridgeRulesData crossChainBridgeRulesData = this.copydefault;
        java.lang.String msg = (crossChainBridgeRulesData == null || (contentTip = crossChainBridgeRulesData.getContentTip()) == null) ? null : contentTip.getMsg();
        return msg == null ? "" : msg;
    }

    public final int AYXKKw() {
        CrossChainBridgeRulesData crossChainBridgeRulesData = this.copydefault;
        if (crossChainBridgeRulesData != null) {
            return crossChainBridgeRulesData.getBridgeId();
        }
        return -1;
    }

    public boolean AhwBna() {
        CrossChainBridgeRulesData crossChainBridgeRulesData = this.copydefault;
        return !C23317hvu.AEQbTJ(AYXKKw()) && (crossChainBridgeRulesData != null ? crossChainBridgeRulesData.isCentralizedBridgeTip() : false);
    }

    @Override // o.AbstractC24712iix
    public boolean OLrzqt(@NotNull Function0<Unit> function0, androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(function0, "");
        boolean zAhwBna = AhwBna();
        if (zAhwBna) {
            EZpvd(function0);
        }
        return zAhwBna;
    }

    public final void EZpvd(final Function0<Unit> function0) {
        ContentTip contentTip;
        copydefault().dvKsVJ().setValue(java.lang.Boolean.FALSE);
        android.app.Activity activityOLrzqt = OLrzqt();
        if (activityOLrzqt != null) {
            final C25252itH c25252itH = new C25252itH(activityOLrzqt);
            c25252itH.OLrzqt(this.copydefault);
            CrossChainBridgeRulesData crossChainBridgeRulesData = this.copydefault;
            java.lang.String title = null;
            c25252itH.copydefault(crossChainBridgeRulesData != null ? java.lang.Boolean.valueOf(crossChainBridgeRulesData.isShowCheckBox()) : null);
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activityOLrzqt);
            CrossChainBridgeRulesData crossChainBridgeRulesData2 = this.copydefault;
            if (crossChainBridgeRulesData2 != null && (contentTip = crossChainBridgeRulesData2.getContentTip()) != null) {
                title = contentTip.getTitle();
            }
            if (title == null) {
                title = "";
            }
            viewOnClickListenerC54939xaY.setTitle(title);
            viewOnClickListenerC54939xaY.EZpvd(c25252itH);
            viewOnClickListenerC54939xaY.OLrzqt(C23274hvD.Fragment.onPlayFromSearch, new View.OnClickListener() { // from class: o.iiI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C24672iiJ.AEQbTJ(this.AEQbTJ, viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.EZpvd(C23274hvD.Fragment.onPlayFromUri, new View.OnClickListener() { // from class: o.iiK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C24672iiJ.OLrzqt(c25252itH, this, viewOnClickListenerC54939xaY, function0, view);
                }
            });
            viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void AEQbTJ(C24672iiJ c24672iiJ, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        c24672iiJ.valueOf();
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void OLrzqt(C25252itH c25252itH, C24672iiJ c24672iiJ, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function0 function0, android.view.View view) {
        if (c25252itH.EZpvd()) {
            C23317hvu.copydefault(c24672iiJ.AYXKKw(), true);
        }
        c24672iiJ.AkhnZx();
        viewOnClickListenerC54939xaY.dismiss();
        function0.invoke();
    }

    private final void AkhnZx() {
        C22877hne.OLrzqt.EZpvd(copydefault().ffGIBT(), DexSwapPopConfirmClick.ButtonName.CONFIRM.getValue(), (56 & 4) != 0 ? "" : DexSwapPopConfirmClick.PopupType.SWFT_RISK.getValue(), (56 & 8) != 0 ? "" : null, (56 & 16) != 0 ? "" : null, (56 & 32) != 0 ? "" : null);
    }

    private final void valueOf() {
        C22877hne.OLrzqt.EZpvd(copydefault().ffGIBT(), DexSwapPopConfirmClick.ButtonName.CANCEL.getValue(), (56 & 4) != 0 ? "" : DexSwapPopConfirmClick.PopupType.SWFT_RISK.getValue(), (56 & 8) != 0 ? "" : null, (56 & 16) != 0 ? "" : null, (56 & 32) != 0 ? "" : null);
    }
}
