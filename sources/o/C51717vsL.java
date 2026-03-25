package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewStubProxy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35966oKh;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vsL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51717vsL extends android.widget.FrameLayout {
    public uWA KWHzl;
    public AbstractC48581uWs copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51717vsL(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51717vsL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.vsL.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C51717vsL(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51717vsL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = (uWA) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.zDGrpR, this, true);
    }

    public final void copydefault() {
        LinearLayoutCompat linearLayoutCompat;
        uWA uwa = this.KWHzl;
        if (uwa != null) {
            C55173xeu c55173xeu = uwa.OLrzqt;
            Intrinsics.copydefault(c55173xeu);
            c55173xeu.setVisibility(0);
            c55173xeu.setEmptyTypeImage(6);
            c55173xeu.setTitle("");
            c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatMediaBrowserServiceCallbackImpl));
            c55173xeu.setRetry("");
            AbstractC48581uWs abstractC48581uWs = this.copydefault;
            if (abstractC48581uWs != null && (linearLayoutCompat = abstractC48581uWs.AEQbTJ) != null) {
                linearLayoutCompat.setVisibility(8);
            }
            setVisibility(0);
            OLrzqt();
        }
    }

    public final void AEQbTJ() {
        uWA uwa = this.KWHzl;
        if (uwa != null) {
            if (!uwa.EZpvd.isInflated()) {
                ViewStubProxy viewStubProxy = uwa.EZpvd;
                Intrinsics.checkNotNullExpressionValue(viewStubProxy, "");
                this.copydefault = (AbstractC48581uWs) C33131mqf.OLrzqt(viewStubProxy);
            }
            C55173xeu c55173xeu = uwa.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(8);
            AbstractC48581uWs abstractC48581uWs = this.copydefault;
            if (abstractC48581uWs != null) {
                LinearLayoutCompat linearLayoutCompat = abstractC48581uWs.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
                linearLayoutCompat.setVisibility(0);
                if (!abstractC48581uWs.KWHzl.isAnimating()) {
                    abstractC48581uWs.KWHzl.playAnimation();
                }
            }
            setVisibility(0);
        }
    }

    public final void AEQbTJ(java.lang.String str, final Function0<Unit> function0) {
        LinearLayoutCompat linearLayoutCompat;
        uWA uwa = this.KWHzl;
        if (uwa != null) {
            AbstractC48581uWs abstractC48581uWs = this.copydefault;
            if (abstractC48581uWs != null && (linearLayoutCompat = abstractC48581uWs.AEQbTJ) != null) {
                linearLayoutCompat.setVisibility(8);
            }
            C55173xeu c55173xeu = uwa.OLrzqt;
            Intrinsics.copydefault(c55173xeu);
            c55173xeu.setVisibility(0);
            c55173xeu.setEmptyTypeImage(8);
            c55173xeu.setTitle(C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityApi33Impl));
            if (str == null) {
                str = C33070mpX.AYXKKw(C35966oKh.TaskDescription.EZpvd);
            }
            c55173xeu.setSubTitle((java.lang.CharSequence) str);
            c55173xeu.setRetry(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultRegistry));
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.vsH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C51717vsL.copydefault(function0, view);
                }
            });
            setVisibility(0);
            OLrzqt();
        }
    }

    public static final void copydefault(Function0 function0, android.view.View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void OLrzqt() {
        AbstractC48581uWs abstractC48581uWs = this.copydefault;
        if (abstractC48581uWs == null || !abstractC48581uWs.KWHzl.isAnimating()) {
            return;
        }
        abstractC48581uWs.KWHzl.cancelAnimation();
    }

    public final void KWHzl() {
        LinearLayoutCompat linearLayoutCompat;
        C55173xeu c55173xeu;
        setVisibility(8);
        uWA uwa = this.KWHzl;
        if (uwa != null && (c55173xeu = uwa.OLrzqt) != null) {
            c55173xeu.setVisibility(8);
        }
        AbstractC48581uWs abstractC48581uWs = this.copydefault;
        if (abstractC48581uWs != null && (linearLayoutCompat = abstractC48581uWs.AEQbTJ) != null) {
            linearLayoutCompat.setVisibility(8);
        }
        OLrzqt();
    }
}
