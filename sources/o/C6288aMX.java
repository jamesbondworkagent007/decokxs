package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import com.okinc.auth.api.passkey.PasskeyPromotionSource;
import com.okinc.web.WebActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aMX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C6288aMX extends wXX {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final boolean OLrzqt = true;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.aMW
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C6288aMX.copydefault(this.KWHzl);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.aMX$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aMX.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C6288aMX EZpvd(PasskeyPromotionSource passkeyPromotionSource) {
            C6288aMX c6288aMX = new C6288aMX();
            c6288aMX.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_SOURCE", passkeyPromotionSource)));
            return c6288aMX;
        }
    }

    private final PasskeyPromotionSource EZpvd() {
        return (PasskeyPromotionSource) this.AEQbTJ.getValue();
    }

    public static final PasskeyPromotionSource copydefault(C6288aMX c6288aMX) {
        android.os.Bundle arguments = c6288aMX.getArguments();
        java.io.Serializable serializable = arguments != null ? arguments.getSerializable("ARG_SOURCE") : null;
        if (serializable instanceof PasskeyPromotionSource) {
            return (PasskeyPromotionSource) serializable;
        }
        return null;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C5661aAg c5661aAgCopydefault = C5661aAg.copydefault(getLayoutInflater(), constraintLayout, false);
        Intrinsics.checkNotNullExpressionValue(c5661aAgCopydefault, "");
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.DTg);
        android.text.SpannableString spannableString = new android.text.SpannableString(strAYXKKw);
        spannableString.setSpan(new StateListAnimator(), 0, strAYXKKw.length(), 33);
        spannableString.setSpan(new android.text.style.UnderlineSpan(), 0, strAYXKKw.length(), 33);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), 0, strAYXKKw.length(), 33);
        c5661aAgCopydefault.OLrzqt.setText(spannableString);
        c5661aAgCopydefault.OLrzqt.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        constraintLayout.addView(c5661aAgCopydefault.getRoot());
    }

    /* JADX INFO: renamed from: o.aMX$StateListAnimator */
    public static final class StateListAnimator extends android.text.style.ClickableSpan {
        public StateListAnimator() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            java.lang.String strAYXKKw;
            Intrinsics.checkNotNullParameter(view, "");
            if (C34703nhO.AEQbTJ()) {
                strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.zKcAg);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.OcIXYQ);
            }
            FragmentActivity activity = C6288aMX.this.getActivity();
            if (activity != null) {
                WebActivity.TaskDescription.openPage$default(WebActivity.Companion, activity, BundleKt.bundleOf(C56390yDp.OLrzqt("url", strAYXKKw)), null, 4, null);
            }
        }
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(7);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(getString(C8206ayP.Dialog.zqTOFw));
        if (EZpvd() == PasskeyPromotionSource.LOGIN || EZpvd() == PasskeyPromotionSource.SIGNUP) {
            C52794wYp c52794wYpCopydefault = wyf.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setOKDSType(80);
            }
        } else {
            C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
            if (c52794wYpCopydefault2 != null) {
                c52794wYpCopydefault2.setOKDSType(257);
            }
        }
        C52794wYp c52794wYpCopydefault3 = wyf.copydefault();
        if (c52794wYpCopydefault3 != null) {
            c52794wYpCopydefault3.setOnClickListener(new TaskDescription(c52794wYpCopydefault3, 1000L, this));
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: o.aMX$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C6288aMX copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C6288aMX c6288aMX) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = c6288aMX;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.dismiss();
            }
        }
    }
}
