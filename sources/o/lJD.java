package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class lJD extends AbstractC52780wYb {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public Function0<Unit> OLrzqt;

    @Override // o.AbstractC52780wYb
    public java.lang.CharSequence AEQbTJ() {
        return C33070mpX.AYXKKw(C31351lsQ.Activity.DsrFlB);
    }

    @Override // o.AbstractC52780wYb, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.ejfBZ));
    }

    @Override // o.AbstractC52780wYb
    public void copydefault(@NotNull C54953xam c54953xam) {
        Intrinsics.checkNotNullParameter(c54953xam, "");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) C33070mpX.AYXKKw(C31351lsQ.Activity.DaRZkR));
        spannableStringBuilder.append((java.lang.CharSequence) "\n\n");
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.DGgnkA);
        spannableStringBuilder.append((java.lang.CharSequence) C33069mpW.copydefault(C31351lsQ.Activity.DNMMPQ, C56423yEv.EZpvd(C56390yDp.OLrzqt(MTCoreConstants.Protocol.KEY_PROTOCOL, strAYXKKw))));
        spannableStringBuilder.append((java.lang.CharSequence) " ");
        C30329lUi c30329lUi = C30329lUi.AEQbTJ;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        java.lang.String string = spannableStringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        android.text.SpannableStringBuilder spannableStringBuilderAEQbTJ = c30329lUi.AEQbTJ(contextRequireContext, string, strAYXKKw, C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ), new Function0() { // from class: o.lJE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return lJD.copydefault(this.KWHzl);
            }
        });
        c54953xam.OLrzqt.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        c54953xam.OLrzqt.setClickable(true);
        c54953xam.OLrzqt.setText(spannableStringBuilderAEQbTJ);
        c54953xam.KWHzl.setVisibility(8);
    }

    public static final Unit copydefault(lJD ljd) {
        android.content.Context contextRequireContext = ljd.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ljd.KWHzl(contextRequireContext, C33070mpX.AYXKKw(C31351lsQ.Activity.zhUgOk));
        return Unit.INSTANCE;
    }

    public final void KWHzl(android.content.Context context, java.lang.String str) {
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, C35334ntP.KWHzl(context), BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("special", java.lang.Boolean.TRUE)), null, 4, null);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C31351lsQ.Activity.QDqgQU));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new TaskDescription(c52794wYpCopydefault, 1000L, this));
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lJD.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.lJD$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ lJD newInstance$default(Application application, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function0 = null;
            }
            return application.EZpvd(function0);
        }

        public final lJD EZpvd(Function0<Unit> function0) {
            lJD ljd = new lJD();
            ljd.OLrzqt = function0;
            return ljd;
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ lJD EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, lJD ljd) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = ljd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function0 function0 = this.EZpvd.OLrzqt;
                if (function0 != null) {
                    function0.invoke();
                }
                this.EZpvd.dismiss();
            }
        }
    }
}
