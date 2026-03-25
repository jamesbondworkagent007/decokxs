package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.unify_trade.biz.LossInsuranceDisplayData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wtl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53877wtl extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX INFO: renamed from: o.wtl$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wtl.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C53877wtl EZpvd(@NotNull LossInsuranceDisplayData lossInsuranceDisplayData) {
            Intrinsics.checkNotNullParameter(lossInsuranceDisplayData, "");
            C53877wtl c53877wtl = new C53877wtl();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("data", lossInsuranceDisplayData);
            c53877wtl.setArguments(bundle);
            return c53877wtl;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(3);
        wxq.setDividerVisibility(false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r2.equals("not_applicable") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if (r2.equals("compensating") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (r2.equals("compensated") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (r2.equals("denied") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        r1 = getBinding();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        if (r1 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        r1 = r1.KWHzl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        if (r1 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        r1.setTitle(o.C33070mpX.AYXKKw(o.C55688xof.Application.RequiresOptIn));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        r7 = r7.AEQbTJ;
        r0 = r0.getBotType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r0, (java.lang.Object) "contract_dca") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
    
        r0 = o.C33070mpX.AYXKKw(o.C55688xof.Application.ComponentActivityReportFullyDrawnExecutor);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0088, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r0, (java.lang.Object) "contract_grid") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
    
        r0 = o.C33070mpX.AYXKKw(o.C55688xof.Application.OnBackPressedCallback);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0091, code lost:
    
        r0 = o.C33070mpX.AYXKKw(o.C55688xof.Application.allOf);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
    
        r7.setText(r0);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o.wXX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.lang.String strAYXKKw;
        wXQ wxq;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        uRQ urqCopydefault = uRQ.copydefault(getLayoutInflater(), constraintLayout, true);
        Intrinsics.checkNotNullExpressionValue(urqCopydefault, "");
        android.os.Bundle arguments = getArguments();
        LossInsuranceDisplayData lossInsuranceDisplayData = arguments != null ? (LossInsuranceDisplayData) arguments.getParcelable("data") : null;
        java.lang.String status = lossInsuranceDisplayData != null ? lossInsuranceDisplayData.getStatus() : null;
        if (status != null) {
            switch (status.hashCode()) {
                case -1335395429:
                    break;
                case -1258492403:
                    break;
                case -358554572:
                    break;
                case 531647627:
                    break;
            }
        }
        C54946xaf binding = getBinding();
        if (binding != null && (wxq = binding.KWHzl) != null) {
            wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.UiThread));
        }
        android.widget.TextView textView = urqCopydefault.AEQbTJ;
        java.lang.String botType = lossInsuranceDisplayData != null ? lossInsuranceDisplayData.getBotType() : null;
        if (Intrinsics.EZpvd((java.lang.Object) botType, (java.lang.Object) "contract_dca")) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.execute);
        } else if (Intrinsics.EZpvd((java.lang.Object) botType, (java.lang.Object) "contract_grid")) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.initializeReflectiveFields);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.anyOf);
        }
        textView.setText(strAYXKKw);
    }
}
