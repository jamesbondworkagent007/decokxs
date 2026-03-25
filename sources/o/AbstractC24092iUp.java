package o;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iUp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC24092iUp extends wXX {
    public C23820iKn AhwBna;
    public C23821iKo gEmmrt;

    public abstract Application AEQbTJ();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23821iKo KWHzl() {
        return this.gEmmrt;
    }

    public void OLrzqt() {
    }

    public void copydefault() {
    }

    public void gEmmrt() {
    }

    @Override // o.wXX
    public float getHeightScale() {
        return 0.0f;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setCloseVisibility(false);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C23820iKn c23820iKnKWHzl = C23820iKn.KWHzl(android.view.LayoutInflater.from(requireContext()));
        this.AhwBna = c23820iKnKWHzl;
        if (c23820iKnKWHzl != null) {
            c23820iKnKWHzl.EZpvd.setText(AEQbTJ().valueOf());
            c23820iKnKWHzl.KWHzl.setText(AEQbTJ().AEQbTJ());
            if (AEQbTJ().AhwBna() != 0 || AEQbTJ().AYXKKw().length() > 0) {
                android.widget.ImageView imageView = c23820iKnKWHzl.copydefault;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(0);
                if (AEQbTJ().AYXKKw().length() > 0) {
                    ComponentCallbacks2C5333Nr componentCallbacks2C5333NrKWHzl = Glide.KWHzl(c23820iKnKWHzl.copydefault);
                    java.lang.String strAYXKKw = AEQbTJ().AYXKKw();
                    android.content.Context context = c23820iKnKWHzl.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    Intrinsics.copydefault(componentCallbacks2C5333NrKWHzl.EZpvd(C43454rpb.copydefault(strAYXKKw, context, true)).OLrzqt((RX<?>) AEQbTJ(AEQbTJ().AkhnZx(), AEQbTJ().copydefault())).EZpvd(c23820iKnKWHzl.copydefault));
                } else {
                    c23820iKnKWHzl.copydefault.setImageResource(AEQbTJ().AhwBna());
                }
                c23820iKnKWHzl.copydefault.setColorFilter(new PorterDuffColorFilter(requireContext().getColor(C52761wXj.Activity.fdOvFl), PorterDuff.Mode.DST_IN));
            } else {
                android.widget.ImageView imageView2 = c23820iKnKWHzl.copydefault;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                imageView2.setVisibility(8);
            }
            c23820iKnKWHzl.OLrzqt.setChecked(SPUtils.getBoolean(AEQbTJ().gEmmrt(), false));
            c23820iKnKWHzl.OLrzqt.setContentDescription("web3_defi_detail_invest_check_box_label");
            OLrzqt(c23820iKnKWHzl, AEQbTJ());
            c23820iKnKWHzl.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.iUn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AbstractC24092iUp.KWHzl(this.EZpvd, view);
                }
            });
            constraintLayout.addView(c23820iKnKWHzl.getRoot(), new ViewGroup.LayoutParams(-1, -2));
        }
    }

    public static final void KWHzl(AbstractC24092iUp abstractC24092iUp, android.view.View view) {
        abstractC24092iUp.dismissAllowingStateLoss();
    }

    public final C5448Sc AEQbTJ(int i, int i2) {
        C5448Sc c5448ScCopydefault = new C5448Sc().KWHzl(C52761wXj.TaskDescription.getUriFromString).copydefault(C52761wXj.TaskDescription.getUriFromString);
        Intrinsics.checkNotNullExpressionValue(c5448ScCopydefault, "");
        C5448Sc c5448Sc = c5448ScCopydefault;
        if (i <= 0 || i2 <= 0) {
            return c5448Sc;
        }
        C5448Sc c5448ScCopydefault2 = c5448Sc.copydefault(i, i2);
        Intrinsics.checkNotNullExpressionValue(c5448ScCopydefault2, "");
        return c5448ScCopydefault2;
    }

    @Override // o.wXX
    public void onCreateFooter(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateFooter(constraintLayout);
        C23821iKo c23821iKoAEQbTJ = C23821iKo.AEQbTJ(android.view.LayoutInflater.from(requireContext()));
        this.gEmmrt = c23821iKoAEQbTJ;
        if (c23821iKoAEQbTJ != null) {
            constraintLayout.addView(c23821iKoAEQbTJ.getRoot(), new ViewGroup.LayoutParams(-1, -2));
            c23821iKoAEQbTJ.EZpvd.setText(AEQbTJ().KWHzl());
            c23821iKoAEQbTJ.EZpvd.setEnabled(!AEQbTJ().djBIcL());
            c23821iKoAEQbTJ.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.iUq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AbstractC24092iUp.AEQbTJ(this.AEQbTJ, view);
                }
            });
        }
    }

    public static final void AEQbTJ(AbstractC24092iUp abstractC24092iUp, android.view.View view) {
        wYK wyk;
        C23820iKn c23820iKn = abstractC24092iUp.AhwBna;
        if (c23820iKn != null && (wyk = c23820iKn.OLrzqt) != null && wyk.isChecked() && abstractC24092iUp.AEQbTJ().gEmmrt().length() > 0) {
            SPUtils.put(abstractC24092iUp.AEQbTJ().gEmmrt(), java.lang.Boolean.TRUE);
        }
        abstractC24092iUp.dismissAllowingStateLoss();
        abstractC24092iUp.OLrzqt();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        copydefault();
    }

    public void OLrzqt(@NotNull C23820iKn c23820iKn, @NotNull final Application application) {
        Intrinsics.checkNotNullParameter(c23820iKn, "");
        Intrinsics.checkNotNullParameter(application, "");
        wYK wyk = c23820iKn.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(wyk, "");
        wyk.setVisibility(application.EZpvd() ? 0 : 8);
        c23820iKn.OLrzqt.setText(application.OLrzqt());
        c23820iKn.OLrzqt.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        c23820iKn.OLrzqt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.iUs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                AbstractC24092iUp.OLrzqt(application, this, compoundButton, z);
            }
        });
    }

    public static final void OLrzqt(Application application, AbstractC24092iUp abstractC24092iUp, android.widget.CompoundButton compoundButton, boolean z) {
        C23821iKo c23821iKo;
        C52794wYp c52794wYp;
        if (application.djBIcL() && (c23821iKo = abstractC24092iUp.gEmmrt) != null && (c52794wYp = c23821iKo.EZpvd) != null) {
            c52794wYp.setEnabled(z);
        }
        abstractC24092iUp.gEmmrt();
    }

    /* JADX INFO: renamed from: o.iUp$Application */
    public static final class Application {
        public final java.lang.String AEQbTJ;
        public final java.lang.String AYXKKw;
        public final java.lang.String AhwBna;
        public final java.lang.String EZpvd;
        public final java.lang.CharSequence KWHzl;
        public final boolean OLrzqt;
        public final int copydefault;
        public final java.lang.String djBIcL;
        public final int fetchVPNInfo;
        public final int gEmmrt;
        public final boolean valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AkhnZx() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.String str4, boolean z, @androidx.annotation.DrawableRes int i, @NotNull java.lang.String str5, boolean z2, int i2, int i3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return new Application(str, str2, str3, charSequence, str4, z, i, str5, z2, i2, i3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.CharSequence OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) application.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) application.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) application.EZpvd) && Intrinsics.EZpvd(this.KWHzl, application.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) application.AEQbTJ) && this.OLrzqt == application.OLrzqt && this.gEmmrt == application.gEmmrt && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) application.djBIcL) && this.valueOf == application.valueOf && this.fetchVPNInfo == application.fetchVPNInfo && this.copydefault == application.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((((((this.AYXKKw.hashCode() * 31) + this.AhwBna.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Integer.hashCode(this.gEmmrt)) * 31) + this.djBIcL.hashCode()) * 31) + java.lang.Boolean.hashCode(this.valueOf)) * 31) + java.lang.Integer.hashCode(this.fetchVPNInfo)) * 31) + java.lang.Integer.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            java.lang.String str = this.AYXKKw;
            java.lang.String str2 = this.AhwBna;
            java.lang.String str3 = this.EZpvd;
            java.lang.CharSequence charSequence = this.KWHzl;
            return "ReminderDialogData(sharedPreferencesKey=" + str + ", title=" + str2 + ", content=" + str3 + ", checkText=" + ((java.lang.Object) charSequence) + ", btnText=" + this.AEQbTJ + ", hasCheckBox=" + this.OLrzqt + ", topImg=" + this.gEmmrt + ", topImgCdnUrl=" + this.djBIcL + ", onlyAllowContinuingWhenChecked=" + this.valueOf + ", width=" + this.fetchVPNInfo + ", height=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.AhwBna;
        }

        public Application(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.String str4, boolean z, @androidx.annotation.DrawableRes int i, @NotNull java.lang.String str5, boolean z2, int i2, int i3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.AYXKKw = str;
            this.AhwBna = str2;
            this.EZpvd = str3;
            this.KWHzl = charSequence;
            this.AEQbTJ = str4;
            this.OLrzqt = z;
            this.gEmmrt = i;
            this.djBIcL = str5;
            this.valueOf = z2;
            this.fetchVPNInfo = i2;
            this.copydefault = i3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0065: CONSTRUCTOR 
  (r12v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0012: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.CharSequence))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0021: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : (r17v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0029: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r18v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r23v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0039: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0041: ARITH (r23v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r21v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0049: ARITH (r23v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r22v0 int) : (0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.CharSequence, java.lang.String, boolean, int, java.lang.String, boolean, int, int):void (m)] (LINE:138) call: o.iUp.Application.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.CharSequence, java.lang.String, boolean, int, java.lang.String, boolean, int, int):void type: THIS */
        public /* synthetic */ Application(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.CharSequence charSequence, java.lang.String str4, boolean z, int i, java.lang.String str5, boolean z2, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? "" : charSequence, (i4 & 16) != 0 ? "" : str4, (i4 & 32) != 0 ? true : z, (i4 & 64) != 0 ? 0 : i, (i4 & 128) == 0 ? str5 : "", (i4 & 256) != 0 ? false : z2, (i4 & 512) != 0 ? 0 : i2, (i4 & 1024) == 0 ? i3 : 0);
        }
    }
}
