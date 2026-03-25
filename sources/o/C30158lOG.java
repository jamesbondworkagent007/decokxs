package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.buysell.ui.paymentmethod.data.AvailableBalanceParameter;
import com.okinc.components.track.TrackChannel;
import com.okinc.uilab.reminder.OKReminder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.C38307pTy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lOG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30158lOG extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public Function0<Unit> EZpvd;
    public AvailableBalanceParameter KWHzl;
    public java.lang.String OLrzqt = "";

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (this.KWHzl == null) {
            dismissAllowingStateLoss();
        } else {
            C32866mlf.onEvent$default("PaymentMethod_AvailableBalance_BottomSheet_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.lang.String strAppendCryptoSymbol$default;
        java.lang.String strAppendCryptoSymbol$default2;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AbstractC31472luf abstractC31472lufEZpvd = AbstractC31472luf.EZpvd(android.view.LayoutInflater.from(getContext()));
        Intrinsics.checkNotNullExpressionValue(abstractC31472lufEZpvd, "");
        AvailableBalanceParameter availableBalanceParameter = this.KWHzl;
        if (availableBalanceParameter != null) {
            android.widget.TextView textView = abstractC31472lufEZpvd.OLrzqt;
            java.lang.String strEZpvd = availableBalanceParameter.EZpvd();
            java.lang.String strAEQbTJ = availableBalanceParameter.AEQbTJ();
            C38307pTy.Application application = C38307pTy.Companion;
            textView.setText(C31661lzi.appendCryptoSymbol$default(strEZpvd, strAEQbTJ, 0, application.KWHzl(0, availableBalanceParameter.copydefault()), null, null, 26, null));
            android.widget.TextView textView2 = abstractC31472lufEZpvd.djBIcL;
            if (availableBalanceParameter.OLrzqt()) {
                strAppendCryptoSymbol$default = C31661lzi.prependFiatSymbol$default(availableBalanceParameter.valueOf(), availableBalanceParameter.AEQbTJ(), this.OLrzqt, null, null, false, 28, null);
            } else {
                strAppendCryptoSymbol$default = C31661lzi.appendCryptoSymbol$default(availableBalanceParameter.valueOf(), availableBalanceParameter.AEQbTJ(), 0, application.KWHzl(0, availableBalanceParameter.copydefault()), null, null, 26, null);
            }
            textView2.setText(strAppendCryptoSymbol$default);
            android.widget.TextView textView3 = abstractC31472lufEZpvd.AhwBna;
            if (availableBalanceParameter.OLrzqt()) {
                strAppendCryptoSymbol$default2 = C31661lzi.prependFiatSymbol$default(availableBalanceParameter.KWHzl(), availableBalanceParameter.AEQbTJ(), this.OLrzqt, null, null, false, 28, null);
            } else {
                strAppendCryptoSymbol$default2 = C31661lzi.appendCryptoSymbol$default(availableBalanceParameter.KWHzl(), availableBalanceParameter.AEQbTJ(), 0, application.KWHzl(0, availableBalanceParameter.copydefault()), null, null, 26, null);
            }
            textView3.setText(strAppendCryptoSymbol$default2);
            if (C33129mqd.AEQbTJ(availableBalanceParameter.valueOf(), 0)) {
                OKReminder oKReminder = abstractC31472lufEZpvd.values;
                oKReminder.setStyle(0);
                oKReminder.setMessage(C33070mpX.AYXKKw(C31351lsQ.Activity.fsSxsn));
                oKReminder.setCloseIconVisibility(false);
                oKReminder.setVisibility(0);
            } else {
                abstractC31472lufEZpvd.values.setVisibility(8);
            }
        }
        constraintLayout.addView(abstractC31472lufEZpvd.getRoot(), -1, -2);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        Function0<Unit> function0 = this.EZpvd;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: o.lOG$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lOG.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.lOG$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C30158lOG newInstance$default(ActionBar actionBar, AvailableBalanceParameter availableBalanceParameter, java.lang.String str, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                function0 = null;
            }
            return actionBar.EZpvd(availableBalanceParameter, str, function0);
        }

        public final C30158lOG EZpvd(@NotNull AvailableBalanceParameter availableBalanceParameter, @NotNull java.lang.String str, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(availableBalanceParameter, "");
            Intrinsics.checkNotNullParameter(str, "");
            C30158lOG c30158lOG = new C30158lOG();
            c30158lOG.KWHzl = availableBalanceParameter;
            c30158lOG.OLrzqt = str;
            c30158lOG.EZpvd = function0;
            return c30158lOG;
        }
    }
}
