package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import com.okinc.buysell.ui.cedefiwallet.BuySellEnableDexTradingActivity;
import com.okinc.web.WebActivity;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C31351lsQ;
import o.C52761wXj;
import o.mDC;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lJF extends androidx.fragment.app.Fragment {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final ActivityResultLauncher<android.content.Intent> AEQbTJ;
    public AbstractC31537lvr copydefault;

    public lJF() {
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.lJH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                lJF.copydefault(this.copydefault, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.AEQbTJ = activityResultLauncherRegisterForActivityResult;
    }

    public final AbstractC31537lvr KWHzl() {
        AbstractC31537lvr abstractC31537lvr = this.copydefault;
        if (abstractC31537lvr != null) {
            return abstractC31537lvr;
        }
        throw new java.lang.IllegalStateException("DexBriefFragment, Trying to access binding outside of view lifecycle");
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.copydefault = AbstractC31537lvr.AEQbTJ(layoutInflater, viewGroup, false);
        android.view.View root = KWHzl().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    public static final void copydefault(lJF ljf, ActivityResult activityResult) {
        ljf.requireActivity().finish();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AbstractC31537lvr abstractC31537lvrKWHzl = KWHzl();
        android.widget.ImageView imageView = abstractC31537lvrKWHzl.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        android.content.Context context = abstractC31537lvrKWHzl.copydefault.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C33054mpH.EZpvd(imageView, C43454rpb.copydefault("images/cr_market/cedefi_risk.webp", context, true), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
        C52794wYp c52794wYp = abstractC31537lvrKWHzl.AhwBna;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
        wYC wyc = abstractC31537lvrKWHzl.djBIcL;
        wyc.setOnClickListener(new Application(wyc, 1000L, this));
        copydefault();
        abstractC31537lvrKWHzl.valueOf.setText(OLrzqt(C33070mpX.AYXKKw(mDC.PendingIntent.EZpvd), "{faq}", C33070mpX.AYXKKw(mDC.PendingIntent.KWHzl), ContextCompat.getColor(requireContext(), C52761wXj.Activity.Dmq), true, C33070mpX.AYXKKw(mDC.PendingIntent.copydefault)));
        android.widget.TextView textView = abstractC31537lvrKWHzl.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        EZpvd(textView);
    }

    public final void copydefault() {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.isConnected);
        if (C34703nhO.AEQbTJ()) {
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C31351lsQ.Activity.ejfBZ);
            java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C31351lsQ.Activity.fIwbmz);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(strAYXKKw);
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) spannableStringBuilder, "{tos}", 0, false, 6, (java.lang.Object) null);
            if (iIndexOf$default >= 0) {
                spannableStringBuilder.replace(iIndexOf$default, iIndexOf$default + 5, (java.lang.CharSequence) strAYXKKw2);
                AEQbTJ(spannableStringBuilder, iIndexOf$default, iIndexOf$default + strAYXKKw2.length(), ContextCompat.getColor(requireContext(), C52761wXj.Activity.OJuSTm), true, C33070mpX.AYXKKw(C31351lsQ.Activity.DbNXlk));
            }
            int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) spannableStringBuilder, "{riskDisclosure}", 0, false, 6, (java.lang.Object) null);
            if (iIndexOf$default2 >= 0) {
                spannableStringBuilder.replace(iIndexOf$default2, iIndexOf$default2 + 16, (java.lang.CharSequence) strAYXKKw3);
                AEQbTJ(spannableStringBuilder, iIndexOf$default2, iIndexOf$default2 + strAYXKKw3.length(), ContextCompat.getColor(requireContext(), C52761wXj.Activity.OJuSTm), true, C33070mpX.AYXKKw(C31351lsQ.Activity.fetchVPNInfo));
            }
            KWHzl().values.setText(spannableStringBuilder);
        } else {
            KWHzl().values.setText(OLrzqt(strAYXKKw, "{tos}", C33070mpX.AYXKKw(C31351lsQ.Activity.fJNWhG), ContextCompat.getColor(requireContext(), C52761wXj.Activity.OJuSTm), true, C33070mpX.AYXKKw(C31351lsQ.Activity.zhUgOk)));
        }
        android.widget.TextView textView = KWHzl().values;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        EZpvd(textView);
    }

    public static /* synthetic */ android.text.SpannableStringBuilder createUrlSpannableDescription$default(lJF ljf, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, boolean z, java.lang.String str4, int i2, java.lang.Object obj) {
        if ((i2 & 16) != 0) {
            z = true;
        }
        return ljf.OLrzqt(str, str2, str3, i, z, str4);
    }

    public final android.text.SpannableStringBuilder OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, boolean z, java.lang.String str4) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(str);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, str2, 0, false, 6, (java.lang.Object) null);
        if (iIndexOf$default >= 0) {
            spannableStringBuilder.replace(iIndexOf$default, str2.length() + iIndexOf$default, (java.lang.CharSequence) str3);
            AEQbTJ(spannableStringBuilder, iIndexOf$default, iIndexOf$default + str3.length(), i, z, str4);
        }
        return spannableStringBuilder;
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ lJF copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, lJF ljf) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = ljf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.requireActivity().finish();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ lJF copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, lJF ljf) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = ljf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.AEQbTJ.launch(new android.content.Intent(this.copydefault.requireContext(), (java.lang.Class<?>) BuySellEnableDexTradingActivity.class));
            }
        }
    }

    public static /* synthetic */ void applyUrlSpan$default(lJF ljf, android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, boolean z, java.lang.String str, int i4, java.lang.Object obj) {
        if ((i4 & 16) != 0) {
            z = true;
        }
        ljf.AEQbTJ(spannableStringBuilder, i, i2, i3, z, str);
    }

    public static final class TaskDescription extends android.text.style.ClickableSpan {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ boolean KWHzl;
        public final /* synthetic */ int copydefault;

        public TaskDescription(java.lang.String str, boolean z, int i) {
            this.AEQbTJ = str;
            this.KWHzl = z;
            this.copydefault = i;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            lJF ljf = lJF.this;
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            ljf.OLrzqt(context, this.AEQbTJ);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(this.KWHzl);
            textPaint.setColor(this.copydefault);
        }
    }

    public final void AEQbTJ(android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, boolean z, java.lang.String str) {
        try {
            Result.Application application = Result.Companion;
            spannableStringBuilder.setSpan(new TaskDescription(str, z, i3), i, i2, 33);
            spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i, i2, 33);
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(android.content.Context context, java.lang.String str) {
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, C35334ntP.KWHzl(context), BundleKt.bundleOf(C56390yDp.OLrzqt("url", str)), null, 4, null);
    }

    public final void EZpvd(android.widget.TextView textView) {
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setHighlightColor(ContextCompat.getColor(requireContext(), android.R.color.transparent));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.copydefault = null;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lJF.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final lJF OLrzqt() {
            return new lJF();
        }
    }
}
