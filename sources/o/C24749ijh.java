package o;

import com.google.android.gms.wallet.WalletConstants;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.track.enums.DexSwapPopConfirmClick;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ijh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24749ijh extends AbstractC24712iix {
    @Override // o.AbstractC24712iix
    public boolean djBIcL() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24749ijh(@NotNull androidx.fragment.app.FragmentManager fragmentManager, android.app.Activity activity, @NotNull AbstractC23101hrq abstractC23101hrq) {
        super(fragmentManager, activity, abstractC23101hrq);
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
    }

    public boolean fetchVPNInfo() {
        QuotePriceRes value = copydefault().AubY().getValue();
        if (value != null) {
            return value.showValueDiffWarn();
        }
        return false;
    }

    @Override // o.AbstractC24712iix
    public java.lang.String gEmmrt() {
        return AYXKKw();
    }

    @Override // o.AbstractC24712iix
    public java.lang.String AEQbTJ() {
        return AhwBna();
    }

    @Override // o.AbstractC24712iix
    public java.lang.String KWHzl() {
        QuotePriceRes value = copydefault().AubY().getValue();
        if (value != null) {
            return value.getValueDiffStr();
        }
        return null;
    }

    @Override // o.AbstractC24712iix
    public boolean OLrzqt(@NotNull final Function0<Unit> function0, androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(function0, "");
        boolean zFetchVPNInfo = fetchVPNInfo();
        if (zFetchVPNInfo) {
            AbstractC24712iix.showCheckDialog$default(this, fragmentManager, 0, 0, 0, 0, new Function0() { // from class: o.ijl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C24749ijh.EZpvd(this.KWHzl);
                }
            }, new Function0() { // from class: o.ijk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C24749ijh.KWHzl(function0, this);
                }
            }, null, null, WalletConstants.ERROR_CODE_ILLEGAL_CALLER, null);
        }
        return zFetchVPNInfo;
    }

    public static final Unit KWHzl(Function0 function0, C24749ijh c24749ijh) {
        function0.invoke();
        c24749ijh.DbNXlk();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C24749ijh c24749ijh) {
        c24749ijh.values();
        return Unit.INSTANCE;
    }

    private final void values() {
        QuotePriceRes value = copydefault().AubY().getValue();
        C22877hne c22877hne = C22877hne.OLrzqt;
        java.lang.String strFfGIBT = copydefault().ffGIBT();
        java.lang.String value2 = DexSwapPopConfirmClick.ButtonName.CANCEL.getValue();
        java.lang.String value3 = DexSwapPopConfirmClick.PopupType.VALUE_DIFFERENCE.getValue();
        java.lang.String tokenPrice = value != null ? value.toTokenPrice() : null;
        if (tokenPrice == null) {
            tokenPrice = "";
        }
        java.lang.String newFromTokenPrice = value != null ? value.getNewFromTokenPrice() : null;
        java.lang.String str = newFromTokenPrice == null ? "" : newFromTokenPrice;
        java.lang.String strValueOf = valueOf();
        c22877hne.EZpvd(strFfGIBT, value2, value3, tokenPrice, str, strValueOf != null ? strValueOf : "");
    }

    private final void DbNXlk() {
        QuotePriceRes value = copydefault().AubY().getValue();
        C22877hne c22877hne = C22877hne.OLrzqt;
        java.lang.String strFfGIBT = copydefault().ffGIBT();
        java.lang.String value2 = DexSwapPopConfirmClick.ButtonName.CONFIRM.getValue();
        java.lang.String value3 = DexSwapPopConfirmClick.PopupType.VALUE_DIFFERENCE.getValue();
        java.lang.String tokenPrice = value != null ? value.toTokenPrice() : null;
        if (tokenPrice == null) {
            tokenPrice = "";
        }
        java.lang.String newFromTokenPrice = value != null ? value.getNewFromTokenPrice() : null;
        java.lang.String str = newFromTokenPrice == null ? "" : newFromTokenPrice;
        java.lang.String strValueOf = valueOf();
        c22877hne.EZpvd(strFfGIBT, value2, value3, tokenPrice, str, strValueOf != null ? strValueOf : "");
    }

    public final java.lang.String valueOf() {
        QuotePriceRes value = copydefault().AubY().getValue();
        if (value != null) {
            return value.getPriceDiffAmount();
        }
        return null;
    }

    public final java.lang.String AYXKKw() {
        return C33070mpX.AYXKKw(C23274hvD.Fragment.ReportDrawnKtReportDrawnWhen1invokeinlinedonDispose2);
    }

    public final java.lang.String AhwBna() {
        return C33070mpX.AYXKKw(C23274hvD.Fragment.ReportDrawnKtReportDrawnAfter1);
    }
}
