package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyUpdatedResult;
import com.okinc.components.track.TrackChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class fMP extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public boolean KWHzl;

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fMP.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final fMP OLrzqt() {
            return new fMP();
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            dismissAllowingStateLoss();
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C32866mlf.onEvent$default("Wallet_Update_Authorize_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        C16893esX c16893esXEZpvd = C16893esX.EZpvd(getLayoutInflater(), constraintLayout, true);
        Intrinsics.checkNotNullExpressionValue(c16893esXEZpvd, "");
        android.widget.TextView textView = c16893esXEZpvd.valueOf;
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        android.content.res.Resources resources = textView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        int i = C13754dXa.FragmentManager.OGitdB;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        TaskDescription taskDescription = new TaskDescription();
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.ardYFU));
        spannableStringBuilder.setSpan(taskDescription, length, spannableStringBuilder.length(), 17);
        Unit unit = Unit.INSTANCE;
        android.text.SpannableString spannableStringValueOf = android.text.SpannableString.valueOf(new android.text.SpannedString(spannableStringBuilder));
        Intrinsics.checkNotNullExpressionValue(spannableStringValueOf, "");
        textView.setText(C33069mpW.KWHzl(resources, i, (java.util.Map<java.lang.String, ? extends android.text.Spannable>) C56423yEv.EZpvd(C56390yDp.OLrzqt("recoverPasskey", spannableStringValueOf))));
    }

    public static final class TaskDescription extends android.text.style.ClickableSpan {
        public TaskDescription() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            fMP.this.EZpvd(PasskeyUpdatedResult.EmailRecovery.KWHzl);
            C32866mlf.onEvent$default("Wallet_Update_Recover_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
        }
    }

    public final void EZpvd(PasskeyUpdatedResult passkeyUpdatedResult) {
        FragmentKt.setFragmentResult(this, "request_key_passkey_updated", BundleKt.bundleOf(C56390yDp.OLrzqt("result_data_passkey_updated", passkeyUpdatedResult)));
        this.KWHzl = true;
        dismissAllowingStateLoss();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        if (!this.KWHzl) {
            FragmentKt.setFragmentResult(this, "request_key_passkey_updated", BundleKt.bundleOf(C56390yDp.OLrzqt("result_data_passkey_updated", null)));
        }
        super.onDismiss(dialogInterface);
    }
}
