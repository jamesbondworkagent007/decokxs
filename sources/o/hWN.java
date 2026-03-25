package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.Glide;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class hWN extends ConstraintLayout {
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hWN(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hWN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:24) call: o.hWN.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ hWN(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hWN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.hWK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hWN.gEmmrt(this.copydefault);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.hWL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hWN.AYXKKw(this.KWHzl);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.hWO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hWN.AEQbTJ(this.copydefault);
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.hWM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hWN.AhwBna(this.OLrzqt);
            }
        });
        android.view.LayoutInflater.from(context).inflate(C23274hvD.Activity.DzCpqu, (android.view.ViewGroup) this, true);
    }

    private final AppCompatTextView EZpvd() {
        java.lang.Object value = this.OLrzqt.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public static final AppCompatTextView gEmmrt(hWN hwn) {
        return (AppCompatTextView) hwn.findViewById(C23274hvD.Application.canApplyTheme);
    }

    private final AppCompatTextView AEQbTJ() {
        java.lang.Object value = this.copydefault.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public static final AppCompatTextView AYXKKw(hWN hwn) {
        return (AppCompatTextView) hwn.findViewById(C23274hvD.Application.requestFocus);
    }

    public static final android.widget.ImageView AEQbTJ(hWN hwn) {
        return (android.widget.ImageView) hwn.findViewById(C23274hvD.Application.hlXVux);
    }

    private final android.widget.ImageView OLrzqt() {
        java.lang.Object value = this.KWHzl.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (android.widget.ImageView) value;
    }

    public static final android.view.View AhwBna(hWN hwn) {
        return hwn.findViewById(C23274hvD.Application.dXhJGx);
    }

    private final android.view.View copydefault() {
        java.lang.Object value = this.EZpvd.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (android.view.View) value;
    }

    public final void setCommonTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd().setText(str);
    }

    public final void setCommonValue(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ().setText(str);
    }

    public final void setCommonValueStartIcon(@NotNull java.lang.String str, @androidx.annotation.DrawableRes int i) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt().setVisibility(0);
        copydefault().setVisibility(0);
        Glide.KWHzl(OLrzqt()).EZpvd(str).AEQbTJ(i).copydefault(i).KWHzl(i).EZpvd(OLrzqt());
    }

    public final void KWHzl() {
        OLrzqt().setVisibility(8);
        copydefault().setVisibility(8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hWN */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setTipsCallback$default(hWN hwn, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        hwn.setTipsCallback(function0);
    }

    public final void setTipsCallback(Function0<Unit> function0) {
        if (function0 == null) {
            EZpvd().setCompoundDrawablesRelative(null, null, null, null);
            EZpvd().setOnClickListener(null);
            return;
        }
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.GGlJim);
        if (drawable != null) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iOLrzqt = C55298xhM.OLrzqt(16, context);
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            drawable.setBounds(0, 0, iOLrzqt, C55298xhM.OLrzqt(16, context2));
        } else {
            drawable = null;
        }
        EZpvd().setCompoundDrawablesRelative(null, null, drawable, null);
        AppCompatTextView appCompatTextViewEZpvd = EZpvd();
        appCompatTextViewEZpvd.setOnClickListener(new ActionBar(appCompatTextViewEZpvd, 1000L, function0));
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ Function0 EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, Function0 function0) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.invoke();
            }
        }
    }
}
