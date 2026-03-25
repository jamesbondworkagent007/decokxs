package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.defi.biz.core.segwit.bean.AddressData;
import com.okinc.wallet.core.formatter.WalletCurrencyBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class eDZ extends ConstraintLayout {
    public final C16804eqo AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public eDZ(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:20) call: o.eDZ.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ eDZ(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eDZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C16804eqo c16804eqoEZpvd = C16804eqo.EZpvd(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c16804eqoEZpvd, "");
        this.AEQbTJ = c16804eqoEZpvd;
    }

    public final void copydefault(@NotNull eFI efi) {
        Intrinsics.checkNotNullParameter(efi, "");
        java.lang.String address = efi.copydefault().getAddress();
        this.AEQbTJ.AEQbTJ.setText(C14079deg.getAddressStr$default(C14079deg.EZpvd, address, false, 2, null));
        WalletCurrencyBean walletCurrencyBeanCopydefault = C54864xYd.AEQbTJ.copydefault();
        java.lang.String strEZpvd = efi.EZpvd();
        java.lang.String valuationFromFee$default = strEZpvd != null ? C54880xYt.formatValuationFromFee$default(strEZpvd, walletCurrencyBeanCopydefault, false, false, 6, null) : null;
        android.widget.TextView textView = this.AEQbTJ.valueOf;
        if (valuationFromFee$default == null) {
            valuationFromFee$default = efi.OLrzqt();
        }
        textView.setText(valuationFromFee$default);
        android.widget.TextView textView2 = this.AEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(8);
        C55251xgS c55251xgS = this.AEQbTJ.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        AddressData addressData = new AddressData(efi.copydefault().getAddressType(), false, false, null, 14, null);
        c55251xgS.setVisibility(0);
        c55251xgS.setText(addressData.getAddressFormat());
        AppCompatImageView appCompatImageView = this.AEQbTJ.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C14725dqq.loadBlockiesIcon$default(appCompatImageView, address, C13754dXa.Activity.getNewProxyInstance, null, 40.0f, 4, null);
    }
}
