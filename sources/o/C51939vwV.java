package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vwV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51939vwV extends android.widget.LinearLayout {
    public AbstractC50879vcV copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51939vwV(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51939vwV(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:14) call: o.vwV.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C51939vwV(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51939vwV(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setGravity(16);
        EZpvd();
    }

    public final void EZpvd() {
        this.copydefault = (AbstractC50879vcV) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.OAUGar, this, true);
    }

    public static /* synthetic */ void setText$default(C51939vwV c51939vwV, java.lang.String str, java.lang.String str2, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z2 = false;
        }
        c51939vwV.setText(str, str2, z, z2);
    }

    public final void setText(@NotNull final java.lang.String str, @NotNull java.lang.String str2, boolean z, final boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC50879vcV abstractC50879vcV = this.copydefault;
        AbstractC50879vcV abstractC50879vcV2 = null;
        if (abstractC50879vcV == null) {
            Intrinsics.gEmmrt("");
            abstractC50879vcV = null;
        }
        android.widget.LinearLayout linearLayout = abstractC50879vcV.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
        AbstractC50879vcV abstractC50879vcV3 = this.copydefault;
        if (abstractC50879vcV3 == null) {
            Intrinsics.gEmmrt("");
            abstractC50879vcV3 = null;
        }
        AppCompatTextView appCompatTextView = abstractC50879vcV3.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(0);
        if (str.length() <= 10 || z2) {
            AbstractC50879vcV abstractC50879vcV4 = this.copydefault;
            if (abstractC50879vcV4 == null) {
                Intrinsics.gEmmrt("");
                abstractC50879vcV4 = null;
            }
            abstractC50879vcV4.EZpvd.setText(str);
        } else {
            KWHzl(str);
        }
        AbstractC50879vcV abstractC50879vcV5 = this.copydefault;
        if (abstractC50879vcV5 == null) {
            Intrinsics.gEmmrt("");
            abstractC50879vcV5 = null;
        }
        C55251xgS c55251xgS = abstractC50879vcV5.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        c55251xgS.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) str2) ? 0 : 8);
        AbstractC50879vcV abstractC50879vcV6 = this.copydefault;
        if (abstractC50879vcV6 == null) {
            Intrinsics.gEmmrt("");
            abstractC50879vcV6 = null;
        }
        abstractC50879vcV6.OLrzqt.setText(str2);
        AbstractC50879vcV abstractC50879vcV7 = this.copydefault;
        if (abstractC50879vcV7 == null) {
            Intrinsics.gEmmrt("");
            abstractC50879vcV7 = null;
        }
        C55251xgS c55251xgS2 = abstractC50879vcV7.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
        c55251xgS2.setVisibility(z ? 0 : 8);
        AbstractC50879vcV abstractC50879vcV8 = this.copydefault;
        if (abstractC50879vcV8 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC50879vcV2 = abstractC50879vcV8;
        }
        abstractC50879vcV2.EZpvd.post(new java.lang.Runnable() { // from class: o.vxa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C51939vwV.setText$lambda$0(this.EZpvd, z2, str);
            }
        });
    }

    public static final void setText$lambda$0(C51939vwV c51939vwV, boolean z, java.lang.String str) {
        AbstractC50879vcV abstractC50879vcV = c51939vwV.copydefault;
        if (abstractC50879vcV == null) {
            Intrinsics.gEmmrt("");
            abstractC50879vcV = null;
        }
        if (abstractC50879vcV.EZpvd.getLineCount() <= 1 || z) {
            return;
        }
        c51939vwV.KWHzl(str);
    }

    public final void KWHzl(java.lang.String str) {
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{" "}, false, 0, 6, (java.lang.Object) null);
        if (listSplit$default.size() <= 1) {
            listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"/"}, false, 0, 6, (java.lang.Object) null);
        }
        AbstractC50879vcV abstractC50879vcV = null;
        if (listSplit$default.size() <= 1) {
            AbstractC50879vcV abstractC50879vcV2 = this.copydefault;
            if (abstractC50879vcV2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC50879vcV = abstractC50879vcV2;
            }
            abstractC50879vcV.EZpvd.setText(str);
            return;
        }
        int size = listSplit$default.size();
        java.lang.String str2 = "";
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                str2 = str2 + listSplit$default.get(i) + "\n";
            } else {
                str2 = str2 + listSplit$default.get(i);
            }
        }
        AbstractC50879vcV abstractC50879vcV3 = this.copydefault;
        if (abstractC50879vcV3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC50879vcV = abstractC50879vcV3;
        }
        abstractC50879vcV.EZpvd.setText(str2);
    }

    public final void setTextForArbitrage(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        AbstractC50879vcV abstractC50879vcV = this.copydefault;
        AbstractC50879vcV abstractC50879vcV2 = null;
        if (abstractC50879vcV == null) {
            Intrinsics.gEmmrt("");
            abstractC50879vcV = null;
        }
        android.widget.LinearLayout linearLayout = abstractC50879vcV.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(0);
        AbstractC50879vcV abstractC50879vcV3 = this.copydefault;
        if (abstractC50879vcV3 == null) {
            Intrinsics.gEmmrt("");
            abstractC50879vcV3 = null;
        }
        AppCompatTextView appCompatTextView = abstractC50879vcV3.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(8);
        AbstractC50879vcV abstractC50879vcV4 = this.copydefault;
        if (abstractC50879vcV4 == null) {
            Intrinsics.gEmmrt("");
            abstractC50879vcV4 = null;
        }
        C55251xgS c55251xgS = abstractC50879vcV4.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        c55251xgS.setVisibility(8);
        AbstractC50879vcV abstractC50879vcV5 = this.copydefault;
        if (abstractC50879vcV5 == null) {
            Intrinsics.gEmmrt("");
            abstractC50879vcV5 = null;
        }
        C55251xgS c55251xgS2 = abstractC50879vcV5.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
        c55251xgS2.setVisibility(8);
        AbstractC50879vcV abstractC50879vcV6 = this.copydefault;
        if (abstractC50879vcV6 == null) {
            Intrinsics.gEmmrt("");
            abstractC50879vcV6 = null;
        }
        C52710wVm c52710wVm = abstractC50879vcV6.djBIcL;
        AbstractC50879vcV abstractC50879vcV7 = this.copydefault;
        if (abstractC50879vcV7 == null) {
            Intrinsics.gEmmrt("");
            abstractC50879vcV7 = null;
        }
        c52710wVm.setOpponentInstrumentView(abstractC50879vcV7.AEQbTJ);
        AbstractC50879vcV abstractC50879vcV8 = this.copydefault;
        if (abstractC50879vcV8 == null) {
            Intrinsics.gEmmrt("");
            abstractC50879vcV8 = null;
        }
        C52710wVm c52710wVm2 = abstractC50879vcV8.AEQbTJ;
        AbstractC50879vcV abstractC50879vcV9 = this.copydefault;
        if (abstractC50879vcV9 == null) {
            Intrinsics.gEmmrt("");
            abstractC50879vcV9 = null;
        }
        c52710wVm2.setOpponentInstrumentView(abstractC50879vcV9.djBIcL);
        AbstractC50879vcV abstractC50879vcV10 = this.copydefault;
        if (abstractC50879vcV10 == null) {
            Intrinsics.gEmmrt("");
            abstractC50879vcV10 = null;
        }
        abstractC50879vcV10.djBIcL.setDirection(str);
        AbstractC50879vcV abstractC50879vcV11 = this.copydefault;
        if (abstractC50879vcV11 == null) {
            Intrinsics.gEmmrt("");
            abstractC50879vcV11 = null;
        }
        abstractC50879vcV11.djBIcL.setTitle(str2);
        AbstractC50879vcV abstractC50879vcV12 = this.copydefault;
        if (abstractC50879vcV12 == null) {
            Intrinsics.gEmmrt("");
            abstractC50879vcV12 = null;
        }
        abstractC50879vcV12.djBIcL.setMargin(str3);
        AbstractC50879vcV abstractC50879vcV13 = this.copydefault;
        if (abstractC50879vcV13 == null) {
            Intrinsics.gEmmrt("");
            abstractC50879vcV13 = null;
        }
        abstractC50879vcV13.AEQbTJ.setDirection(str4);
        AbstractC50879vcV abstractC50879vcV14 = this.copydefault;
        if (abstractC50879vcV14 == null) {
            Intrinsics.gEmmrt("");
            abstractC50879vcV14 = null;
        }
        abstractC50879vcV14.AEQbTJ.setTitle(str5);
        AbstractC50879vcV abstractC50879vcV15 = this.copydefault;
        if (abstractC50879vcV15 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC50879vcV2 = abstractC50879vcV15;
        }
        abstractC50879vcV2.AEQbTJ.setMargin(str6);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        AbstractC50879vcV abstractC50879vcV = this.copydefault;
        if (abstractC50879vcV == null) {
            Intrinsics.gEmmrt("");
            abstractC50879vcV = null;
        }
        abstractC50879vcV.copydefault.setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        AbstractC50879vcV abstractC50879vcV = this.copydefault;
        if (abstractC50879vcV == null) {
            Intrinsics.gEmmrt("");
            abstractC50879vcV = null;
        }
        AppCompatImageView appCompatImageView = abstractC50879vcV.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(z ? 0 : 8);
        super.setEnabled(z);
    }
}
