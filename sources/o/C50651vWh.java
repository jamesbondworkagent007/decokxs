package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import com.bumptech.glide.Glide;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vWh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C50651vWh extends android.widget.FrameLayout {
    public final InterfaceC50649vWf AEQbTJ;
    public final java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public final AbstractC50957vdu OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC50649vWf OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRatio(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 o.vWf)
  (r14v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r15v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0008: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r16v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, o.vWf, android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:24) call: o.vWh.<init>(java.lang.String, java.lang.String, java.lang.String, o.vWf, android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C50651vWh(java.lang.String str, java.lang.String str2, java.lang.String str3, InterfaceC50649vWf interfaceC50649vWf, android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, interfaceC50649vWf, context, (i2 & 32) != 0 ? null : attributeSet, (i2 & 64) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50651vWh(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull InterfaceC50649vWf interfaceC50649vWf, @NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(interfaceC50649vWf, "");
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = str;
        this.EZpvd = str2;
        this.KWHzl = str3;
        this.AEQbTJ = interfaceC50649vWf;
        AbstractC50957vdu abstractC50957vdu = (AbstractC50957vdu) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.compare, this, true);
        this.OLrzqt = abstractC50957vdu;
        android.widget.FrameLayout frameLayout = abstractC50957vdu.EZpvd;
        frameLayout.setOnClickListener(new ActionBar(frameLayout, 1000L, this));
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.KWHzl)) {
            abstractC50957vdu.AEQbTJ.setText(this.KWHzl);
        }
        abstractC50957vdu.AEQbTJ.addTextChangedListener(new uBH(new Function0() { // from class: o.vWe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50651vWh.KWHzl(this.copydefault);
            }
        }));
        abstractC50957vdu.AEQbTJ.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.vWg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                C50651vWh.copydefault(this.EZpvd, view, z);
            }
        });
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrKWHzl = Glide.KWHzl(this);
        Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrKWHzl, "");
        C55297xhL.AEQbTJ(componentCallbacks2C5333NrKWHzl, str, "lfit", 48, 48).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(context)).EZpvd(abstractC50957vdu.copydefault);
        abstractC50957vdu.AYXKKw.setText(str2);
    }

    public static final Unit KWHzl(C50651vWh c50651vWh) {
        if (Intrinsics.EZpvd((java.lang.Object) c50651vWh.OLrzqt.AEQbTJ.isConnected(), (java.lang.Object) "0")) {
            c50651vWh.OLrzqt.AEQbTJ.setPlainNumericText("");
        }
        c50651vWh.AEQbTJ.OLrzqt(c50651vWh.EZpvd, c50651vWh.OLrzqt.AEQbTJ.isConnected());
        return Unit.INSTANCE;
    }

    public static final void copydefault(final C50651vWh c50651vWh, android.view.View view, boolean z) {
        if (z) {
            c50651vWh.OLrzqt.AEQbTJ.post(new java.lang.Runnable() { // from class: o.vWd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C50651vWh.EZpvd(this.KWHzl);
                }
            });
        }
    }

    public static final void EZpvd(C50651vWh c50651vWh) {
        C55001xbh c55001xbh = c50651vWh.OLrzqt.AEQbTJ;
        android.text.Editable text = c55001xbh.getText();
        c55001xbh.setSelection(text != null ? text.length() : 0);
    }

    public final void setRatioConfig(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt.AEQbTJ.setText(str);
        this.KWHzl = str;
    }

    public final boolean EZpvd() {
        return java.lang.String.valueOf(this.OLrzqt.AEQbTJ.getText()).length() > 0;
    }

    public final void setDeleteEnable(boolean z) {
        this.OLrzqt.EZpvd.setEnabled(z);
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.alsFma);
        if (z) {
            if (drawable != null) {
                drawable.setTint(C33070mpX.copydefault(C52761wXj.Activity.aappFQ));
            }
        } else if (drawable != null) {
            drawable.setTint(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
        }
        this.OLrzqt.OLrzqt.setImageDrawable(drawable);
    }

    public final void setDeleteVisible(boolean z) {
        android.widget.FrameLayout frameLayout = this.OLrzqt.EZpvd;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(z ? 0 : 8);
    }

    public final void setBgSelect(boolean z) {
        this.OLrzqt.KWHzl.setSelected(z);
    }

    public final void setInputFilters() {
        C55001xbh c55001xbh = this.OLrzqt.AEQbTJ;
        c55001xbh.setMaxDecimalValue(0);
        c55001xbh.setShowThousandsSeparator(true);
    }

    /* JADX INFO: renamed from: o.vWh$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C50651vWh copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C50651vWh c50651vWh) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = c50651vWh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.OLrzqt().AEQbTJ(this.copydefault.AEQbTJ());
            }
        }
    }
}
