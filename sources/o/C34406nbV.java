package o;

import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.okinc.dexkline.market.domain.model.coininfo.Social;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C57406yhn;
import o.C6777aVl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nbV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34406nbV extends AppCompatImageView {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34406nbV(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34406nbV(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.nbV.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C34406nbV(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34406nbV(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        int dimensionPixelSize = getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.RJOkX);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.giSNqX);
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C57406yhn.Activity.AhwBna);
        if (drawableKWHzl != null) {
            drawableKWHzl.setTintList(mUM.AEQbTJ(C52761wXj.Activity.invokespecialDPHOMC));
        } else {
            drawableKWHzl = null;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C55298xhM.dp2px$default(32.0f, null, 1, null), C55298xhM.dp2px$default(32.0f, null, 1, null));
        C55296xhK.AEQbTJ(layoutParams, 0, dimensionPixelSize, dimensionPixelSize, 0);
        setLayoutParams(layoutParams);
        setPaddingRelative(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        setBackground(drawableKWHzl);
    }

    public final void setSocialData(@NotNull final Social social) {
        Intrinsics.checkNotNullParameter(social, "");
        int color = getResources().getColor(C52761wXj.Activity.fdOvFl, null);
        setImageResource(social.AEQbTJ());
        mUO.setOnDoubleCheckClickListener$default(this, 0L, new Function1() { // from class: o.nbY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34406nbV.KWHzl(this.OLrzqt, social, (android.view.View) obj);
            }
        }, 1, null);
        getDrawable().setTint(color);
    }

    public static final Unit KWHzl(C34406nbV c34406nbV, Social social, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        c34406nbV.OLrzqt(social.KWHzl());
        return Unit.INSTANCE;
    }

    public final void OLrzqt(java.lang.String str) {
        java.lang.String message;
        try {
            android.content.Intent intent = new android.content.Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(android.net.Uri.parse(str));
            getContext().startActivity(intent);
        } catch (java.lang.Exception e) {
            C6777aVl.TaskDescription taskDescription = C6777aVl.Companion;
            java.lang.Throwable cause = e.getCause();
            if (cause == null || (message = cause.getMessage()) == null) {
                message = "";
            }
            taskDescription.EZpvd(new java.lang.Exception("openSystemWebView:" + message + ">>>>>>>>" + str));
        }
    }
}
