package o;

import com.google.android.gms.wallet.WalletConstants;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.track.enums.DexSwapPopConfirmClick;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iiM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24675iiM extends AbstractC24712iix {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24675iiM(@NotNull androidx.fragment.app.FragmentManager fragmentManager, android.app.Activity activity, @NotNull AbstractC23101hrq abstractC23101hrq) {
        super(fragmentManager, activity, abstractC23101hrq);
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
    }

    public boolean AhwBna() {
        C22901hoB c22901hoBZuBGHE = copydefault().zuBGHE();
        return (c22901hoBZuBGHE == null || !c22901hoBZuBGHE.copydefault() || copydefault().fjfviF()) ? false : true;
    }

    @Override // o.AbstractC24712iix
    public java.lang.String gEmmrt() {
        return C33070mpX.AYXKKw(C23274hvD.Fragment.getBitmap);
    }

    @Override // o.AbstractC24712iix
    public java.lang.String AEQbTJ() {
        java.lang.String miniReceiveNumber;
        DexMultiTokenInfoBean token;
        java.lang.String tokenSymbol;
        QuotePriceRes quotePriceResAxsJAYsNCnLh = copydefault().AxsJAYsNCnLh();
        java.lang.String str = "";
        if (quotePriceResAxsJAYsNCnLh == null || (miniReceiveNumber = quotePriceResAxsJAYsNCnLh.getMiniReceiveNumber()) == null) {
            miniReceiveNumber = "";
        }
        QuotePriceRes quotePriceResAxsJAYsNCnLh2 = copydefault().AxsJAYsNCnLh();
        if (quotePriceResAxsJAYsNCnLh2 != null && (token = quotePriceResAxsJAYsNCnLh2.toToken()) != null && (tokenSymbol = token.getTokenSymbol()) != null) {
            str = tokenSymbol;
        }
        return OLrzqt(miniReceiveNumber, str);
    }

    @Override // o.AbstractC24712iix
    public boolean OLrzqt(@NotNull final Function0<Unit> function0, androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(function0, "");
        boolean zAhwBna = AhwBna();
        if (zAhwBna) {
            AbstractC24712iix.showCheckDialog$default(this, fragmentManager, 0, 0, 0, 0, new Function0() { // from class: o.iiP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C24675iiM.EZpvd(this.KWHzl);
                }
            }, new Function0() { // from class: o.iiU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C24675iiM.OLrzqt(function0, this);
                }
            }, null, null, WalletConstants.ERROR_CODE_ILLEGAL_CALLER, null);
        }
        return zAhwBna;
    }

    public static final Unit OLrzqt(Function0 function0, C24675iiM c24675iiM) {
        function0.invoke();
        c24675iiM.AYXKKw();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C24675iiM c24675iiM) {
        c24675iiM.valueOf();
        return Unit.INSTANCE;
    }

    public final java.lang.String OLrzqt(java.lang.String str, java.lang.String str2) {
        return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.removeSubscription, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("value", str), C56390yDp.OLrzqt("symbol", str2)));
    }

    private final void AYXKKw() {
        C22877hne.OLrzqt.EZpvd(copydefault().ffGIBT(), DexSwapPopConfirmClick.ButtonName.CONFIRM.getValue(), (56 & 4) != 0 ? "" : DexSwapPopConfirmClick.PopupType.MIN_RECEIVE.getValue(), (56 & 8) != 0 ? "" : null, (56 & 16) != 0 ? "" : null, (56 & 32) != 0 ? "" : null);
    }

    private final void valueOf() {
        C22877hne.OLrzqt.EZpvd(copydefault().ffGIBT(), DexSwapPopConfirmClick.ButtonName.CANCEL.getValue(), (56 & 4) != 0 ? "" : DexSwapPopConfirmClick.PopupType.MIN_RECEIVE.getValue(), (56 & 8) != 0 ? "" : null, (56 & 16) != 0 ? "" : null, (56 & 32) != 0 ? "" : null);
    }
}
