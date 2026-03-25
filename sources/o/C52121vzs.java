package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.web.WebActivity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vzs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52121vzs extends wXX {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public AbstractC50922vdL AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull AbstractC50922vdL abstractC50922vdL) {
        Intrinsics.checkNotNullParameter(abstractC50922vdL, "");
        this.AEQbTJ = abstractC50922vdL;
    }

    /* JADX INFO: renamed from: o.vzs$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vzs.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C52121vzs AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            C52121vzs c52121vzs = new C52121vzs();
            c52121vzs.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("currency", str), C56390yDp.OLrzqt("maxAvailable", str2), C56390yDp.OLrzqt("ccyBalance", str3), C56390yDp.OLrzqt("maxLoan", str4)));
            return c52121vzs;
        }
    }

    public final AbstractC50922vdL copydefault() {
        AbstractC50922vdL abstractC50922vdL = this.AEQbTJ;
        if (abstractC50922vdL != null) {
            return abstractC50922vdL;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        EZpvd(AbstractC50922vdL.KWHzl(getCustomLayoutInflater(), constraintLayout, true));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String string4;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        copydefault().EZpvd.copydefault().setTextSize(14.0f);
        copydefault().AEQbTJ.copydefault().setTextSize(14.0f);
        copydefault().KWHzl.copydefault().setTextSize(14.0f);
        copydefault().EZpvd.EZpvd().setTextAppearance(C32113mPz.Dialog.sSMYrx);
        copydefault().AEQbTJ.EZpvd().setTextAppearance(C32113mPz.Dialog.sSMYrx);
        copydefault().KWHzl.EZpvd().setTextAppearance(C32113mPz.Dialog.sSMYrx);
        copydefault().KWHzl.OLrzqt(true, new View.OnClickListener() { // from class: o.vzv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C52121vzs.KWHzl(this.KWHzl, view2);
            }
        });
        android.os.Bundle arguments = getArguments();
        java.lang.String str = "--";
        if (arguments == null || (string = arguments.getString("maxAvailable")) == null) {
            string = "--";
        }
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("ccyBalance")) == null) {
            string2 = "--";
        }
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 != null && (string4 = arguments3.getString("maxLoan")) != null) {
            str = string4;
        }
        android.os.Bundle arguments4 = getArguments();
        if (arguments4 == null || (string3 = arguments4.getString("currency")) == null) {
            string3 = "";
        }
        copydefault().EZpvd.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.OVMstZ), string, "");
        copydefault().AEQbTJ.setText(C33069mpW.copydefault(C48033uCm.Fragment.registerKeyboardTarget, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, string3))), string2, "");
        copydefault().KWHzl.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.DDDCac), str, "");
    }

    public static final void KWHzl(final C52121vzs c52121vzs, android.view.View view) {
        FragmentActivity activity = c52121vzs.getActivity();
        if (activity == null) {
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
        viewOnClickListenerC54939xaY.copydefault(C48033uCm.Fragment.setCurrentKeyboardTarget);
        viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.onCreate, new View.OnClickListener() { // from class: o.vzq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C52121vzs.AEQbTJ(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C48033uCm.Fragment.QSLkRj, new View.OnClickListener() { // from class: o.vzx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C52121vzs.copydefault(viewOnClickListenerC54939xaY, c52121vzs, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, C52121vzs c52121vzs, android.view.View view) {
        android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C48033uCm.Fragment.QhYuFg)));
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        FragmentActivity fragmentActivityRequireActivity = c52121vzs.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        WebActivity.TaskDescription.openPage$default(taskDescription, fragmentActivityRequireActivity, bundleBundleOf, null, 4, null);
        viewOnClickListenerC54939xaY.dismiss();
    }
}
