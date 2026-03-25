package o;

import android.view.View;
import com.okinc.business.dexlogic.bean.ContentTip;
import com.okinc.business.dexlogic.bean.CrossChainBridgeRulesData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ijo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24756ijo extends AbstractC24712iix {
    public final CrossChainBridgeRulesData AEQbTJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24756ijo(@NotNull androidx.fragment.app.FragmentManager fragmentManager, android.app.Activity activity, @NotNull AbstractC23101hrq abstractC23101hrq, @NotNull InterfaceC22335hdS interfaceC22335hdS) {
        super(fragmentManager, activity, abstractC23101hrq);
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        Intrinsics.checkNotNullParameter(interfaceC22335hdS, "");
        this.AEQbTJ = interfaceC22335hdS instanceof CrossChainBridgeRulesData ? (CrossChainBridgeRulesData) interfaceC22335hdS : null;
    }

    @Override // o.AbstractC24712iix
    public java.lang.String gEmmrt() {
        ContentTip contentTip;
        CrossChainBridgeRulesData crossChainBridgeRulesData = this.AEQbTJ;
        java.lang.String title = (crossChainBridgeRulesData == null || (contentTip = crossChainBridgeRulesData.getContentTip()) == null) ? null : contentTip.getTitle();
        return title == null ? "" : title;
    }

    @Override // o.AbstractC24712iix
    public java.lang.String AEQbTJ() {
        ContentTip contentTip;
        CrossChainBridgeRulesData crossChainBridgeRulesData = this.AEQbTJ;
        java.lang.String msg = (crossChainBridgeRulesData == null || (contentTip = crossChainBridgeRulesData.getContentTip()) == null) ? null : contentTip.getMsg();
        return msg == null ? "" : msg;
    }

    public final int AYXKKw() {
        CrossChainBridgeRulesData crossChainBridgeRulesData = this.AEQbTJ;
        if (crossChainBridgeRulesData != null) {
            return crossChainBridgeRulesData.getBridgeId();
        }
        return -1;
    }

    public boolean valueOf() {
        CrossChainBridgeRulesData crossChainBridgeRulesData = this.AEQbTJ;
        return (crossChainBridgeRulesData == null || !crossChainBridgeRulesData.isWarmHoleDailyLimit() || C23317hvu.EZpvd(AYXKKw())) ? false : true;
    }

    @Override // o.AbstractC24712iix
    public boolean OLrzqt(@NotNull Function0<Unit> function0, androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(function0, "");
        boolean zValueOf = valueOf();
        if (zValueOf) {
            EZpvd(function0);
        }
        return zValueOf;
    }

    public final void EZpvd(final Function0<Unit> function0) {
        copydefault().dvKsVJ().setValue(java.lang.Boolean.FALSE);
        android.app.Activity activityOLrzqt = OLrzqt();
        if (activityOLrzqt != null) {
            CrossChainBridgeRulesData crossChainBridgeRulesData = this.AEQbTJ;
            int i = (crossChainBridgeRulesData == null || !crossChainBridgeRulesData.isSupportedSwap()) ? -1 : C23274hvD.Fragment.onRemoveQueueItemAt;
            final C25341iur c25341iur = new C25341iur(activityOLrzqt);
            java.lang.String strAEQbTJ = AEQbTJ();
            CrossChainBridgeRulesData crossChainBridgeRulesData2 = this.AEQbTJ;
            c25341iur.AEQbTJ(strAEQbTJ, crossChainBridgeRulesData2 != null ? java.lang.Boolean.valueOf(crossChainBridgeRulesData2.isShowCheckBox()) : null);
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activityOLrzqt);
            viewOnClickListenerC54939xaY.setTitle(gEmmrt());
            viewOnClickListenerC54939xaY.EZpvd(c25341iur);
            viewOnClickListenerC54939xaY.OLrzqt(C23274hvD.Fragment.onPrepareFromUri, new View.OnClickListener() { // from class: o.ijm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C24756ijo.AEQbTJ(viewOnClickListenerC54939xaY, view);
                }
            });
            if (i != -1) {
                viewOnClickListenerC54939xaY.EZpvd(C23274hvD.Fragment.onRemoveQueueItemAt, new View.OnClickListener() { // from class: o.ijn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C24756ijo.KWHzl(c25341iur, this, viewOnClickListenerC54939xaY, function0, view);
                    }
                });
            }
            viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void KWHzl(C25341iur c25341iur, C24756ijo c24756ijo, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function0 function0, android.view.View view) {
        if (c25341iur.AEQbTJ()) {
            C23317hvu.EZpvd(c24756ijo.AYXKKw(), true);
        }
        viewOnClickListenerC54939xaY.dismiss();
        function0.invoke();
    }
}
