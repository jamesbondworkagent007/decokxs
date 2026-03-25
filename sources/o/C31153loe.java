package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dex.trade.core.domain.model.CommonDexInfo;
import com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo;
import com.okinc.business.dex.trade.core.domain.model.Permit2Data;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC28108kPe;
import o.C23274hvD;
import o.InterfaceC23194htd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.loe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31153loe {
    public final TokenBase AEQbTJ;
    public final AbstractC31214lpm EZpvd;
    public final InterfaceC28107kPd KWHzl;
    public final android.content.Context OLrzqt;
    public final Function1<java.lang.String, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C31153loe(@NotNull AbstractC31214lpm abstractC31214lpm, @NotNull android.content.Context context, @NotNull InterfaceC28107kPd interfaceC28107kPd, @NotNull TokenBase tokenBase, @NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(abstractC31214lpm, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC28107kPd, "");
        Intrinsics.checkNotNullParameter(tokenBase, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = abstractC31214lpm;
        this.OLrzqt = context;
        this.KWHzl = interfaceC28107kPd;
        this.AEQbTJ = tokenBase;
        this.copydefault = function1;
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            C22380heK c22380heK = C22380heK.OLrzqt;
            InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = c22380heK.copydefault(this.KWHzl.KWHzl()).fARcdN().AEQbTJ();
            FragmentActivity activity = this.EZpvd.getActivity();
            Unit unit = null;
            AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
            if (interfaceC9738bbJAEQbTJ != null) {
                if (interfaceC9738bbJAEQbTJ.zLjUOn()) {
                    if (abstractActivityC33041mov != null) {
                        InterfaceC23194htd.Application.showRechargeDialog$default(c22380heK.copydefault(this.KWHzl.KWHzl()).fARcdN(), abstractActivityC33041mov, this.AEQbTJ.getChainId(), str, null, null, null, 56, null);
                        unit = Unit.INSTANCE;
                    }
                } else if (abstractActivityC33041mov != null) {
                    java.lang.String strKWHzl = this.KWHzl.KWHzl();
                    androidx.fragment.app.FragmentManager parentFragmentManager = this.EZpvd.getParentFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                    C31205lpd.AEQbTJ(abstractActivityC33041mov, strKWHzl, parentFragmentManager, interfaceC9738bbJAEQbTJ);
                    unit = Unit.INSTANCE;
                }
                if (unit != null) {
                    return;
                }
            }
            if (abstractActivityC33041mov != null) {
                InterfaceC23194htd.Application.showRechargeDialog$default(c22380heK.copydefault(this.KWHzl.KWHzl()).fARcdN(), abstractActivityC33041mov, this.AEQbTJ.getChainId(), str, null, null, null, 56, null);
                Unit unit2 = Unit.INSTANCE;
            }
        } catch (java.lang.Exception e) {
            java.lang.String message = e.getMessage();
            pUU.KWHzl("MemeDialogManager", "showRechargeDialog error: " + (message != null ? message : ""));
        }
    }

    public final void OLrzqt(@NotNull final java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String strKWHzl = pTD.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.IMediaControllerCallbackStubProxy, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("nativeToken", str2)));
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.OLrzqt);
        viewOnClickListenerC54939xaY.EZpvd(strKWHzl);
        viewOnClickListenerC54939xaY.EZpvd(C23274hvD.Fragment.adjustVolume, new View.OnClickListener() { // from class: o.lol
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C31153loe.OLrzqt(viewOnClickListenerC54939xaY, this, str, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C23274hvD.Fragment.DDxOgT, new View.OnClickListener() { // from class: o.loi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C31153loe.EZpvd(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, C31153loe c31153loe, java.lang.String str, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        InterfaceC23194htd interfaceC23194htdFARcdN = C22380heK.OLrzqt.copydefault(c31153loe.KWHzl.KWHzl()).fARcdN();
        FragmentActivity fragmentActivityRequireActivity = c31153loe.EZpvd.requireActivity();
        Intrinsics.copydefault(fragmentActivityRequireActivity, "");
        InterfaceC23194htd.Application.showRechargeDialog$default(interfaceC23194htdFARcdN, (AbstractActivityC33041mov) fragmentActivityRequireActivity, c31153loe.AEQbTJ.getChainId(), str, yDY.copydefault("dex"), null, null, 48, null);
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.OLrzqt);
        viewOnClickListenerC54939xaY.EZpvd(str);
        viewOnClickListenerC54939xaY.EZpvd(C23274hvD.Fragment.buildRccMetadata, new View.OnClickListener() { // from class: o.lok
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C31153loe.OLrzqt(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void KWHzl(@NotNull android.content.Context context, V6BaseQuoteResponse v6BaseQuoteResponse, @NotNull Function0<C28109kPf> function0) {
        CommonDexInfo commonDexInfo;
        DexMultiTokenInfoBean fromToken;
        Permit2Data permit2Data;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function0, "");
        C28110kPg.KWHzl.copydefault(new AbstractC28108kPe.ActionBar(function0.invoke()));
        java.lang.String chainId = null;
        DefiPlatformInfo selectedDeFiPlatform = v6BaseQuoteResponse != null ? v6BaseQuoteResponse.getSelectedDeFiPlatform() : null;
        java.lang.String unsignedTx = (selectedDeFiPlatform == null || (permit2Data = selectedDeFiPlatform.getPermit2Data()) == null) ? null : permit2Data.getUnsignedTx();
        java.lang.String defiPlatformId = selectedDeFiPlatform != null ? selectedDeFiPlatform.getDefiPlatformId() : null;
        java.lang.String name = selectedDeFiPlatform != null ? selectedDeFiPlatform.getName() : null;
        java.lang.String logo = selectedDeFiPlatform != null ? selectedDeFiPlatform.getLogo() : null;
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = C22380heK.OLrzqt.copydefault(this.KWHzl.KWHzl()).fARcdN().AEQbTJ();
        java.lang.String strDbNXlk = interfaceC9738bbJAEQbTJ != null ? interfaceC9738bbJAEQbTJ.DbNXlk() : null;
        java.lang.String str = strDbNXlk == null ? "" : strDbNXlk;
        if (v6BaseQuoteResponse != null && (commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo()) != null && (fromToken = commonDexInfo.getFromToken()) != null) {
            chainId = fromToken.getChainId();
        }
        C31148loZ.KWHzl(context, unsignedTx, defiPlatformId, name, logo, str, chainId == null ? "" : chainId, new Function2() { // from class: o.loj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C31153loe.KWHzl(this.EZpvd, (java.lang.Integer) obj, (java.lang.String) obj2);
            }
        });
    }

    public static final Unit KWHzl(C31153loe c31153loe, java.lang.Integer num, java.lang.String str) {
        if (num != null) {
            if (num.intValue() != -1) {
                pUU.KWHzl("Permit2Helper", "Permit2 signing failed");
            }
            c31153loe.copydefault.invoke(str);
        } else {
            pUU.KWHzl("Permit2Helper", "Permit2 signing cancelled");
        }
        return Unit.INSTANCE;
    }
}
