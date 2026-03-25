package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DecodeFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC10168bjP;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bjv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10200bjv extends RecyclerView.ViewHolder {
    public final AbstractC17057evc OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC17057evc OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10200bjv(@NotNull AbstractC17057evc abstractC17057evc) {
        super(abstractC17057evc.getRoot());
        Intrinsics.checkNotNullParameter(abstractC17057evc, "");
        this.OLrzqt = abstractC17057evc;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(@NotNull AbstractC10168bjP.TaskDescription taskDescription, @NotNull Function2<? super java.lang.Long, ? super android.view.View, Unit> function2) {
        java.lang.String string;
        java.lang.String strOLrzqt;
        int i;
        java.lang.String strGEmmrt = "";
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(function2, "");
        if (taskDescription.AhwBna()) {
            android.widget.ImageView imageView = this.OLrzqt.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(8);
            AppCompatTextView appCompatTextView = this.OLrzqt.KWHzl;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(0);
                appCompatTextView.setLayoutParams(marginLayoutParams);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        } else if (!taskDescription.fetchVPNInfo()) {
            C5448Sc c5448ScCopydefault = copydefault(taskDescription.gEmmrt());
            java.lang.String strGEmmrt2 = taskDescription.gEmmrt();
            java.util.Locale locale = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String lowerCase = strGEmmrt2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (C59449zhJ.endsWith$default(lowerCase, ".svg", false, 2, null)) {
                strGEmmrt = "SVG:" + taskDescription.gEmmrt();
            } else if (!taskDescription.AkhnZx()) {
                strGEmmrt = taskDescription.gEmmrt();
            } else {
                java.lang.Character chWlaJM = C59454zhO.wlaJM(taskDescription.KWHzl());
                if (chWlaJM != null && (string = chWlaJM.toString()) != null && (strOLrzqt = C9700baY.OLrzqt(string)) != null) {
                    strGEmmrt = strOLrzqt;
                }
            }
            C5335Nt<android.graphics.drawable.Drawable> c5335NtOLrzqt = Glide.AEQbTJ(this.OLrzqt.getRoot().getContext()).EZpvd(strGEmmrt).OLrzqt((RX<?>) c5448ScCopydefault);
            android.content.Context context = this.OLrzqt.getRoot().getContext();
            int iDbNXlk = taskDescription.DbNXlk();
            if (iDbNXlk != 74) {
                switch (iDbNXlk) {
                    default:
                        switch (iDbNXlk) {
                            case 56:
                            case 57:
                            case 58:
                            case 59:
                            case 61:
                                i = C13754dXa.Activity.dHguZz;
                                break;
                            case 62:
                                i = C13754dXa.Activity.hrNTAI;
                                break;
                        }
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                        i = C52761wXj.TaskDescription.aHXSQp;
                        break;
                }
                Intrinsics.copydefault(c5335NtOLrzqt.OLrzqt(AppCompatResources.getDrawable(context, i)).EZpvd((NN<android.graphics.Bitmap>) new C57660ymc(this.OLrzqt.getRoot().getContext(), 0.5f, C33070mpX.copydefault(C52761wXj.Activity.invokespecialDPHOMC), false, 8, null)).EZpvd(this.OLrzqt.OLrzqt));
            }
        } else {
            this.OLrzqt.OLrzqt.setImageResource(C13754dXa.Activity.dHguZz);
        }
        if (taskDescription.isConnected()) {
            this.OLrzqt.KWHzl.setVisibility(8);
            LottieAnimationView lottieAnimationView = this.OLrzqt.EZpvd;
            lottieAnimationView.setVisibility(0);
            lottieAnimationView.setAnimation(C13754dXa.Fragment.djBIcL);
            lottieAnimationView.playAnimation();
            Intrinsics.copydefault(lottieAnimationView);
        } else {
            java.lang.CharSequence charSequenceJointColorCharSequence$default = C10186bjh.jointColorCharSequence$default(C10186bjh.KWHzl, taskDescription.AEQbTJ() + taskDescription.copydefault(), taskDescription.EZpvd(), taskDescription.KWHzl(), 0, 8, null);
            this.OLrzqt.EZpvd.setVisibility(8);
            this.OLrzqt.KWHzl.setVisibility(0);
            this.OLrzqt.KWHzl.setText(charSequenceJointColorCharSequence$default);
        }
        if (taskDescription.djBIcL().length() > 0) {
            this.OLrzqt.gEmmrt.setVisibility(0);
            this.OLrzqt.gEmmrt.setText(taskDescription.djBIcL());
        } else {
            this.OLrzqt.gEmmrt.setVisibility(8);
        }
        this.OLrzqt.copydefault.setVisibility(taskDescription.AYXKKw() ? 0 : 8);
        C52794wYp c52794wYp = this.OLrzqt.copydefault;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, function2, taskDescription, this));
    }

    private final C5448Sc copydefault(java.lang.String str) {
        C5448Sc c5448Sc;
        C5448Sc c5448ScCopydefault = new C5448Sc().AEQbTJ(DecodeFormat.PREFER_RGB_565).copydefault(AbstractC5360Os.copydefault);
        Intrinsics.checkNotNullExpressionValue(c5448ScCopydefault, "");
        C5448Sc c5448Sc2 = c5448ScCopydefault;
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (C59449zhJ.endsWith$default(lowerCase, ".svg", false, 2, null)) {
            if (C59449zhJ.startsWith$default("SVG:" + str, "SVG:", false, 2, null)) {
                C5448Sc c5448ScAEQbTJ = c5448Sc2.copydefault(AbstractC5360Os.OLrzqt).AEQbTJ(DecodeFormat.PREFER_ARGB_8888);
                Intrinsics.copydefault(c5448ScAEQbTJ);
                c5448Sc = c5448ScAEQbTJ;
            } else {
                C5448Sc c5448ScCopydefault2 = c5448Sc2.copydefault(AbstractC5360Os.EZpvd);
                Intrinsics.copydefault(c5448ScCopydefault2);
                c5448Sc = c5448ScCopydefault2;
            }
            return c5448Sc;
        }
        java.util.Locale locale2 = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "");
        java.lang.String lowerCase2 = str.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        return StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase2, (java.lang.CharSequence) ".gif", false, 2, (java.lang.Object) null) ? c5448Sc2.copydefault(AbstractC5360Os.OLrzqt) : c5448Sc2;
    }

    /* JADX INFO: renamed from: o.bjv$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ AbstractC10168bjP.TaskDescription AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C10200bjv KWHzl;
        public final /* synthetic */ Function2 OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, Function2 function2, AbstractC10168bjP.TaskDescription taskDescription, C10200bjv c10200bjv) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = function2;
            this.AEQbTJ = taskDescription;
            this.KWHzl = c10200bjv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function2 function2 = this.OLrzqt;
                long jOLrzqt = this.AEQbTJ.OLrzqt();
                C52794wYp c52794wYp = this.KWHzl.OLrzqt().copydefault;
                Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
                function2.invoke(java.lang.Long.valueOf(jOLrzqt), c52794wYp);
            }
        }
    }
}
