package o;

import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.amplifyframework.core.model.ModelIdentifier;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C7343ahz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.atF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7933atF {
    public android.widget.ProgressBar AEQbTJ;
    public final android.content.Context EZpvd;
    public android.view.ViewGroup KWHzl;
    public android.widget.TextView OLrzqt;
    public C55113xdn copydefault;

    public C7933atF(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = context;
    }

    public final void AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        if (this.copydefault == null) {
            this.KWHzl = new android.widget.FrameLayout(this.EZpvd);
            C55113xdn c55113xdn = new C55113xdn(this.EZpvd, null, 0, 6, null);
            this.copydefault = c55113xdn;
            Intrinsics.copydefault(c55113xdn);
            c55113xdn.setAnimation(i);
            android.view.ViewGroup viewGroup2 = this.KWHzl;
            Intrinsics.copydefault(viewGroup2);
            C55113xdn c55113xdn2 = this.copydefault;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            Unit unit = Unit.INSTANCE;
            viewGroup2.addView(c55113xdn2, layoutParams);
        }
        viewGroup.addView(this.KWHzl, new ViewGroup.LayoutParams(-1, -1));
        C55113xdn c55113xdn3 = this.copydefault;
        if (c55113xdn3 != null) {
            c55113xdn3.playAnimation();
        }
    }

    public final void EZpvd(@NotNull android.view.ViewGroup viewGroup, java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        if (this.copydefault == null) {
            android.view.View viewInflate = android.view.LayoutInflater.from(this.EZpvd).inflate(C7343ahz.Activity.djBIcL, viewGroup, false);
            Intrinsics.copydefault(viewInflate, "");
            this.KWHzl = (android.view.ViewGroup) viewInflate;
            if (str != null) {
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Integer.valueOf(C59449zhJ.startsWith$default(str, ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER, false, 2, null) ? Color.parseColor(str) : java.lang.Integer.parseInt(str)));
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                    int iIntValue = ((java.lang.Number) objM7377constructorimpl).intValue();
                    android.view.ViewGroup viewGroup2 = this.KWHzl;
                    Intrinsics.copydefault(viewGroup2);
                    viewGroup2.setBackgroundColor(iIntValue);
                }
                Result.m7376boximpl(objM7377constructorimpl);
            }
            android.view.ViewGroup viewGroup3 = this.KWHzl;
            Intrinsics.copydefault(viewGroup3);
            this.copydefault = (C55113xdn) viewGroup3.findViewById(C7343ahz.TaskDescription.AuCTelauCTel);
            android.view.ViewGroup viewGroup4 = this.KWHzl;
            Intrinsics.copydefault(viewGroup4);
            this.AEQbTJ = (android.widget.ProgressBar) viewGroup4.findViewById(C7343ahz.TaskDescription.QKVWgx);
            android.view.ViewGroup viewGroup5 = this.KWHzl;
            Intrinsics.copydefault(viewGroup5);
            this.OLrzqt = (android.widget.TextView) viewGroup5.findViewById(C7343ahz.TaskDescription.QUSxYX);
        }
        android.widget.ProgressBar progressBar = this.AEQbTJ;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
        android.widget.TextView textView = this.OLrzqt;
        if (textView != null) {
            textView.setVisibility(4);
        }
        android.view.ViewGroup viewGroup6 = this.KWHzl;
        if ((viewGroup6 != null ? viewGroup6.getParent() : null) != null) {
            return;
        }
        viewGroup.addView(this.KWHzl, new ViewGroup.LayoutParams(-1, -1));
        C55113xdn c55113xdn = this.copydefault;
        if (c55113xdn != null) {
            c55113xdn.playAnimation();
        }
    }

    public final void OLrzqt(int i) {
        android.widget.ProgressBar progressBar = this.AEQbTJ;
        if (progressBar != null) {
            progressBar.setVisibility(0);
            progressBar.setProgress(i);
        }
        android.widget.TextView textView = this.OLrzqt;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setText(pTB.formatICUPercent$default(java.lang.Integer.valueOf(i), null, C38307pTy.Companion.EZpvd(0), null, null, null, 29, null));
        }
    }

    public final void copydefault(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C55113xdn c55113xdn = this.copydefault;
        if (c55113xdn != null) {
            c55113xdn.pauseAnimation();
        }
        android.view.ViewGroup viewGroup2 = this.KWHzl;
        if (viewGroup2 != null) {
            viewGroup.removeView(viewGroup2);
        }
    }
}
