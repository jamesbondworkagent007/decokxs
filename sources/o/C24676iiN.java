package o;

import com.google.android.gms.wallet.WalletConstants;
import com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.CommonDexInfo;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.TraceData;
import com.okinc.business.dexlogic.track.enums.DexSwapPopConfirmClick;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iiN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24676iiN extends AbstractC24712iix {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24676iiN(@NotNull androidx.fragment.app.FragmentManager fragmentManager, android.app.Activity activity, @NotNull AbstractC23101hrq abstractC23101hrq) {
        super(fragmentManager, activity, abstractC23101hrq);
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
    }

    public boolean AhwBna() {
        QuotePriceRes value = copydefault().AubY().getValue();
        if (value == null) {
            value = new QuotePriceRes((java.util.List) null, (java.util.List) null, (java.lang.String) null, (CommonDexInfo) null, false, false, false, (java.lang.String) null, (TraceData) null, (SwapPriorityFeeInfo) null, (java.lang.String) null, (java.lang.String) null, 4095, (DefaultConstructorMarker) null);
        }
        return C23313hvq.EZpvd(copydefault().wlaJM().EZpvd(value), value.toTokenPrice());
    }

    @Override // o.AbstractC24712iix
    public java.lang.String gEmmrt() {
        return C33070mpX.AYXKKw(C23274hvD.Fragment.containsKey);
    }

    @Override // o.AbstractC24712iix
    public java.lang.String AEQbTJ() {
        return C33070mpX.AYXKKw(C23274hvD.Fragment.getCallbacks);
    }

    @Override // o.AbstractC24712iix
    public boolean OLrzqt(@NotNull final Function0<Unit> function0, androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(function0, "");
        boolean zAhwBna = AhwBna();
        if (zAhwBna) {
            AbstractC24712iix.showCheckDialog$default(this, fragmentManager, 0, 0, 0, 0, new Function0() { // from class: o.iiL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C24676iiN.AEQbTJ(this.OLrzqt);
                }
            }, new Function0() { // from class: o.iiO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C24676iiN.OLrzqt(function0, this);
                }
            }, null, null, WalletConstants.ERROR_CODE_ILLEGAL_CALLER, null);
        }
        return zAhwBna;
    }

    public static final Unit OLrzqt(Function0 function0, C24676iiN c24676iiN) {
        function0.invoke();
        c24676iiN.valueOf();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C24676iiN c24676iiN) {
        c24676iiN.AYXKKw();
        return Unit.INSTANCE;
    }

    private final void valueOf() {
        C22877hne.OLrzqt.EZpvd(copydefault().ffGIBT(), DexSwapPopConfirmClick.ButtonName.CONFIRM.getValue(), (56 & 4) != 0 ? "" : DexSwapPopConfirmClick.PopupType.ZERO_VALUE.getValue(), (56 & 8) != 0 ? "" : null, (56 & 16) != 0 ? "" : null, (56 & 32) != 0 ? "" : null);
    }

    private final void AYXKKw() {
        C22877hne.OLrzqt.EZpvd(copydefault().ffGIBT(), DexSwapPopConfirmClick.ButtonName.CANCEL.getValue(), (56 & 4) != 0 ? "" : DexSwapPopConfirmClick.PopupType.ZERO_VALUE.getValue(), (56 & 8) != 0 ? "" : null, (56 & 16) != 0 ? "" : null, (56 & 32) != 0 ? "" : null);
    }
}
