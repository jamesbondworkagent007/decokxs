package com.okinc.uilab.banner;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import com.okinc.uilab.banner.OKAlertBanner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C52794wYp;
import o.C54947xag;
import o.C55296xhK;
import o.C55298xhM;
import o.C55302xhQ;
import o.C55307xhV;
import o.C56444yFp;
import o.C56548yJl;
import o.InterfaceC52764wXm;
import o.InterfaceC56445yFq;
import o.wXD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class OKAlertBanner extends RelativeLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public boolean AEQbTJ;
    public Drawable AYXKKw;
    public int AhwBna;
    public int DbNXlk;
    public final C54947xag EZpvd;
    public final wXD KWHzl;
    public ViewTreeObserver.OnGlobalLayoutListener copydefault;
    public Orientation djBIcL;
    public int fetchVPNInfo;
    public int gEmmrt;
    public ViewTreeObserver.OnGlobalLayoutListener valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OKAlertBanner(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OKAlertBanner(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.ActionBar.aUsmxb int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:36) call: com.okinc.uilab.banner.OKAlertBanner.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ OKAlertBanner(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.ActionBar.aUsmxb : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKAlertBanner(@NotNull final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C54947xag c54947xagCopydefault = C54947xag.copydefault(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c54947xagCopydefault, "");
        this.EZpvd = c54947xagCopydefault;
        wXD wxd = new wXD(this);
        this.KWHzl = wxd;
        this.djBIcL = Orientation.UNDEFINED;
        this.gEmmrt = ContextCompat.getColor(context, C52761wXj.Activity.fdOvFl);
        this.AhwBna = -1;
        this.DbNXlk = -1;
        InterfaceC52764wXm.Application.loadFromAttributes$default(wxd, attributeSet, i, 0, 4, null);
        TextViewCompat.setTextAppearance(c54947xagCopydefault.valueOf, wxd.fIwbmz());
        TextViewCompat.setTextAppearance(c54947xagCopydefault.OLrzqt, wxd.KWHzl());
        TextViewCompat.setLineHeight(c54947xagCopydefault.valueOf, C55298xhM.OLrzqt(16, context));
        TextViewCompat.setLineHeight(c54947xagCopydefault.OLrzqt, C55298xhM.OLrzqt(16, context));
        AEQbTJ().setTextAppearance(C52761wXj.LoaderManager.fFgQHt);
        copydefault().setTextAppearance(C52761wXj.LoaderManager.fFgQHt);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.DCUTEI);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        setType(typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.ODXsMY, 0));
        setStyle(typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.RdAHlO, -1));
        setLeadingIconVisibility(typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.hrNTAI, true));
        setTitle(C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context, C52761wXj.PictureInPictureParams.DLWbHP, 0, 4, null));
        setMessage(C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context, C52761wXj.PictureInPictureParams.dmfpNf, 0, 4, null));
        setPrimaryAction$default(this, C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context, C52761wXj.PictureInPictureParams.hBpjJd, 0, 4, null), null, 2, null);
        setSecondaryAction$default(this, C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context, C52761wXj.PictureInPictureParams.dHguZz, 0, 4, null), null, 2, null);
        typedArrayObtainStyledAttributes.recycle();
        this.valueOf = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.wXE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                OKAlertBanner.KWHzl(this.OLrzqt, context);
            }
        };
        this.copydefault = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.wXC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                OKAlertBanner.AEQbTJ(this.AEQbTJ);
            }
        };
    }

    public final TextView gEmmrt() {
        TextView textView = this.EZpvd.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final TextView KWHzl() {
        TextView textView = this.EZpvd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final C52794wYp AEQbTJ() {
        C52794wYp c52794wYp = this.EZpvd.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        return c52794wYp;
    }

    public final C52794wYp copydefault() {
        C52794wYp c52794wYp = this.EZpvd.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        return c52794wYp;
    }

    public final ImageView OLrzqt() {
        ImageView imageView = this.EZpvd.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }

    public final void setLeadingIcon(Drawable drawable) {
        this.AYXKKw = drawable;
        this.EZpvd.djBIcL.setImageDrawable(drawable);
    }

    public final void setType(int i) {
        this.fetchVPNInfo = i;
        EZpvd(i);
    }

    public final void setStyle(int i) {
        this.DbNXlk = i;
        if (i == 0) {
            setImageAndUpdateLayoutParams(C52761wXj.TaskDescription.DztXDE, false);
        } else if (i == 1) {
            setImageAndUpdateLayoutParams(C52761wXj.TaskDescription.DGUQLI, true);
        } else {
            setFunctionIconVisibility(false);
        }
    }

    public static final void KWHzl(OKAlertBanner oKAlertBanner, Context context) {
        int width = (oKAlertBanner.EZpvd.getRoot().getWidth() - C55298xhM.OLrzqt(24, context)) - C55298xhM.OLrzqt(40, context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (oKAlertBanner.EZpvd.AhwBna.getWidth() >= width || oKAlertBanner.EZpvd.gEmmrt.getWidth() >= width || oKAlertBanner.EZpvd.AhwBna.getWidth() + oKAlertBanner.EZpvd.gEmmrt.getWidth() >= width) {
            Orientation orientation = oKAlertBanner.djBIcL;
            Orientation orientation2 = Orientation.VERTICAL;
            if (orientation == orientation2) {
                return;
            }
            oKAlertBanner.djBIcL = orientation2;
            oKAlertBanner.EZpvd.AEQbTJ.setOrientation(1);
            layoutParams.topMargin = C55298xhM.KWHzl(8.0f, context);
            oKAlertBanner.EZpvd.gEmmrt.setLayoutParams(layoutParams);
            return;
        }
        Orientation orientation3 = oKAlertBanner.djBIcL;
        Orientation orientation4 = Orientation.HORIZONTAL;
        if (orientation3 == orientation4) {
            return;
        }
        oKAlertBanner.djBIcL = orientation4;
        oKAlertBanner.EZpvd.AEQbTJ.setOrientation(0);
        layoutParams.topMargin = C55298xhM.KWHzl(8.0f, context);
        layoutParams.setMarginStart(C55298xhM.OLrzqt(8, context));
        oKAlertBanner.EZpvd.gEmmrt.setLayoutParams(layoutParams);
    }

    public static final void AEQbTJ(OKAlertBanner oKAlertBanner) {
        oKAlertBanner.EZpvd();
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ Function0 KWHzl;
        public final /* synthetic */ View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, Function0 function0) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function0 function0 = this.KWHzl;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    public final void EZpvd() {
        TextView textView;
        if (this.EZpvd.djBIcL.getVisibility() == 0 && this.EZpvd.djBIcL.getHeight() != 0) {
            TextView textView2 = this.EZpvd.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            if (textView2.getVisibility() == 0) {
                textView = this.EZpvd.valueOf;
            } else {
                TextView textView3 = this.EZpvd.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                if (textView3.getVisibility() != 0) {
                    return;
                } else {
                    textView = this.EZpvd.OLrzqt;
                }
            }
            Intrinsics.copydefault(textView);
            Layout layout = textView.getLayout();
            if (layout == null || layout.getLineCount() == 0) {
                return;
            }
            int iCopydefault = C56548yJl.copydefault((int) (((layout.getLineTop(0) + layout.getLineBottom(0)) / 2.0f) - (this.EZpvd.djBIcL.getHeight() / 2.0f)), 0);
            if (iCopydefault == this.AhwBna) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.EZpvd.djBIcL.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.topMargin = iCopydefault;
                layoutParams2.bottomMargin = 0;
                this.EZpvd.djBIcL.setLayoutParams(layoutParams2);
                this.AhwBna = iCopydefault;
            }
        }
    }

    public final void EZpvd(int i) {
        Drawable colorDrawable = new ColorDrawable(ContextCompat.getColor(getContext(), C52761wXj.Activity.scanPackages));
        Drawable drawable = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.GGlJim);
        int color = ContextCompat.getColor(getContext(), C52761wXj.Activity.htlTjW);
        if (i == 0) {
            drawable = this.KWHzl.isConnected();
            this.gEmmrt = this.KWHzl.AkhnZx();
            colorDrawable = this.KWHzl.gEmmrt();
            color = this.KWHzl.AYXKKw();
        } else if (i == 1) {
            drawable = this.KWHzl.sSMYrx();
            this.gEmmrt = this.KWHzl.zuBGHE();
            colorDrawable = this.KWHzl.zLjUOn();
            color = this.KWHzl.AuCTelauCTel();
        } else if (i == 2) {
            drawable = this.KWHzl.wlaJM();
            this.gEmmrt = this.KWHzl.getNewProxyInstance();
            colorDrawable = this.KWHzl.iwGUEr();
            color = this.KWHzl.hDKMBd();
        } else if (i == 3) {
            drawable = this.KWHzl.QbewEr();
            this.gEmmrt = this.KWHzl.aKErDB();
            colorDrawable = this.KWHzl.QVAiDq();
            color = this.KWHzl.QfsBiF();
        } else if (i == 4) {
            drawable = this.KWHzl.AwvSrB();
            this.gEmmrt = this.KWHzl.OcIXYQ();
            colorDrawable = this.KWHzl.AxsJAY();
            color = this.KWHzl.ORxRYg();
        }
        C54947xag c54947xag = this.EZpvd;
        ImageView imageView = c54947xag.djBIcL;
        Drawable drawable2 = this.AYXKKw;
        if (drawable2 == null) {
            drawable2 = drawable;
        }
        imageView.setImageDrawable(drawable2);
        if (this.AYXKKw == null && drawable != null) {
            drawable.setTintList(ColorStateList.valueOf(this.gEmmrt));
        }
        c54947xag.EZpvd.setImageTintList(ColorStateList.valueOf(color));
        setBackground(colorDrawable);
        AEQbTJ(i);
        setTextSize();
    }

    public static /* synthetic */ void setLeadingIconVisibility$default(OKAlertBanner oKAlertBanner, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        oKAlertBanner.setLeadingIconVisibility(z);
    }

    public final void setLeadingIconVisibility(boolean z) {
        int iCopydefault;
        int iCopydefault2;
        ImageView imageView = this.EZpvd.djBIcL;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(z ? 0 : 8);
        if (z) {
            C54947xag c54947xag = this.EZpvd;
            View root = c54947xag.getRoot();
            int iOLrzqt = this.KWHzl.OLrzqt();
            int iAhwBna = this.KWHzl.AhwBna();
            int iEZpvd = this.KWHzl.EZpvd();
            if (c54947xag.AhwBna.getVisibility() == 0) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                iCopydefault2 = C55298xhM.OLrzqt(4, context);
            } else {
                iCopydefault2 = this.KWHzl.copydefault();
            }
            root.setPaddingRelative(iOLrzqt, iAhwBna, iEZpvd, iCopydefault2);
            ViewGroup.LayoutParams layoutParams = c54947xag.copydefault.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(0);
            }
            ViewGroup.LayoutParams layoutParams2 = c54947xag.AEQbTJ.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginStart(C55298xhM.OLrzqt(4, context2));
                return;
            }
            return;
        }
        C54947xag c54947xag2 = this.EZpvd;
        View root2 = c54947xag2.getRoot();
        int iAhwBna2 = this.KWHzl.AhwBna();
        int iEZpvd2 = this.KWHzl.EZpvd();
        if (c54947xag2.AhwBna.getVisibility() == 0) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            iCopydefault = C55298xhM.OLrzqt(4, context3);
        } else {
            iCopydefault = this.KWHzl.copydefault();
        }
        root2.setPaddingRelative(0, iAhwBna2, iEZpvd2, iCopydefault);
        ViewGroup.LayoutParams layoutParams3 = c54947xag2.copydefault.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).setMarginStart(this.KWHzl.OLrzqt());
        }
        ViewGroup.LayoutParams layoutParams4 = c54947xag2.AEQbTJ.getLayoutParams();
        if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            ((ViewGroup.MarginLayoutParams) layoutParams4).setMarginStart(C55298xhM.OLrzqt(-4, context4));
        }
    }

    public static /* synthetic */ void setTitle$default(OKAlertBanner oKAlertBanner, CharSequence charSequence, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = null;
        }
        oKAlertBanner.setTitle(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        TextView textView = this.EZpvd.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C55307xhV.AEQbTJ(textView, charSequence);
        this.AhwBna = -1;
        if (this.AEQbTJ) {
            return;
        }
        this.AEQbTJ = true;
        this.EZpvd.valueOf.post(new Runnable() { // from class: o.wXx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                OKAlertBanner.AhwBna(this.AEQbTJ);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AhwBna(OKAlertBanner oKAlertBanner) {
        oKAlertBanner.EZpvd();
        oKAlertBanner.AEQbTJ = false;
    }

    public static /* synthetic */ void setDescription$default(OKAlertBanner oKAlertBanner, CharSequence charSequence, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = null;
        }
        oKAlertBanner.setDescription(charSequence);
    }

    public final void setDescription(CharSequence charSequence) {
        setMessage(charSequence);
    }

    public static /* synthetic */ void setMessage$default(OKAlertBanner oKAlertBanner, CharSequence charSequence, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = null;
        }
        oKAlertBanner.setMessage(charSequence);
    }

    public final void setMessage(CharSequence charSequence) {
        int iOLrzqt;
        TextView textView = this.EZpvd.OLrzqt;
        Intrinsics.copydefault(textView);
        C55307xhV.AEQbTJ(textView, charSequence);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            TextView textView2 = this.EZpvd.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            if (textView2.getVisibility() == 0) {
                Context context = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                iOLrzqt = C55298xhM.OLrzqt(4, context);
            } else {
                iOLrzqt = 0;
            }
            marginLayoutParams.topMargin = iOLrzqt;
        }
        TextView textView3 = this.EZpvd.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        if (textView3.getVisibility() == 0) {
            return;
        }
        this.AhwBna = -1;
        if (this.AEQbTJ) {
            return;
        }
        this.AEQbTJ = true;
        this.EZpvd.OLrzqt.post(new Runnable() { // from class: o.wXF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                OKAlertBanner.OLrzqt(this.OLrzqt);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OLrzqt(OKAlertBanner oKAlertBanner) {
        oKAlertBanner.EZpvd();
        oKAlertBanner.AEQbTJ = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.okinc.uilab.banner.OKAlertBanner */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setPrimaryAction$default(OKAlertBanner oKAlertBanner, CharSequence charSequence, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        oKAlertBanner.setPrimaryAction(charSequence, function0);
    }

    public final void setPrimaryAction(CharSequence charSequence, Function0<Unit> function0) {
        if (this.EZpvd.gEmmrt.getVisibility() != 0) {
            C52794wYp c52794wYp = this.EZpvd.AhwBna;
            Context context = c52794wYp.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c52794wYp.setCompoundDrawablePadding(C55298xhM.OLrzqt(4, context));
            Drawable drawable = ContextCompat.getDrawable(c52794wYp.getContext(), C52761wXj.TaskDescription.HrMTQN);
            if (drawable != null) {
                drawable.setTint(this.gEmmrt);
                Unit unit = Unit.INSTANCE;
            } else {
                drawable = null;
            }
            c52794wYp.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
        realSetAction$default(this, charSequence, function0, null, 4, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.okinc.uilab.banner.OKAlertBanner */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setSecondaryAction$default(OKAlertBanner oKAlertBanner, CharSequence charSequence, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        oKAlertBanner.setSecondaryAction(charSequence, function0);
    }

    public final void setSecondaryAction(CharSequence charSequence, Function0<Unit> function0) {
        if (charSequence != null && charSequence.length() != 0) {
            this.EZpvd.AhwBna.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        C52794wYp c52794wYp = this.EZpvd.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        copydefault(charSequence, function0, c52794wYp);
    }

    public final void setFunctionIconVisibility(boolean z) {
        Context context;
        int i;
        C54947xag c54947xag = this.EZpvd;
        c54947xag.EZpvd.setVisibility(z ? 0 : 8);
        ViewGroup.LayoutParams layoutParams = c54947xag.KWHzl.getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (z) {
                    context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    i = 24;
                } else {
                    context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    i = 4;
                }
                marginLayoutParams.setMarginEnd(C55298xhM.OLrzqt(i, context));
            }
            this.EZpvd.KWHzl.setLayoutParams(layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.EZpvd.getRoot().getViewTreeObserver().addOnGlobalLayoutListener(this.valueOf);
        this.EZpvd.getRoot().getViewTreeObserver().addOnGlobalLayoutListener(this.copydefault);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.EZpvd.getRoot().getViewTreeObserver().removeOnGlobalLayoutListener(this.valueOf);
        this.EZpvd.getRoot().getViewTreeObserver().removeOnGlobalLayoutListener(this.copydefault);
    }

    public static /* synthetic */ void realSetAction$default(OKAlertBanner oKAlertBanner, CharSequence charSequence, Function0 function0, C52794wYp c52794wYp, int i, Object obj) {
        if ((i & 4) != 0) {
            c52794wYp = oKAlertBanner.EZpvd.AhwBna;
        }
        oKAlertBanner.copydefault(charSequence, function0, c52794wYp);
    }

    public final void copydefault(CharSequence charSequence, Function0<Unit> function0, C52794wYp c52794wYp) {
        if (charSequence == null || charSequence.length() == 0) {
            c52794wYp.setVisibility(8);
            return;
        }
        c52794wYp.setVisibility(0);
        c52794wYp.setText(charSequence);
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, function0));
        if (this.EZpvd.djBIcL.getVisibility() == 0) {
            View root = this.EZpvd.getRoot();
            int iOLrzqt = this.KWHzl.OLrzqt();
            int iAhwBna = this.KWHzl.AhwBna();
            int iEZpvd = this.KWHzl.EZpvd();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            root.setPaddingRelative(iOLrzqt, iAhwBna, iEZpvd, C55298xhM.OLrzqt(4, context));
        }
    }

    private final void AEQbTJ(int i) {
        if (i == 0) {
            KWHzl(this.KWHzl.fetchVPNInfo(), this.KWHzl.valueOf());
            return;
        }
        if (i == 1) {
            KWHzl(this.KWHzl.zsXlph(), this.KWHzl.AubY());
            return;
        }
        if (i == 2) {
            KWHzl(this.KWHzl.uzCIH(), this.KWHzl.getFieldNames());
        } else if (i == 3) {
            KWHzl(this.KWHzl.RJOkX(), this.KWHzl.QUSxYX());
        } else {
            if (i != 4) {
                return;
            }
            KWHzl(this.KWHzl.QOLQEE(), this.KWHzl.gHZMYf());
        }
    }

    public final void KWHzl(int i, int i2) {
        C54947xag c54947xag = this.EZpvd;
        c54947xag.valueOf.setTextColor(i);
        c54947xag.OLrzqt.setTextColor(i2);
        c54947xag.AhwBna.setTextColor(i2);
        c54947xag.gEmmrt.setTextColor(i2);
    }

    public final void setTextSize() {
        if (this.KWHzl.djSkpj() != -1) {
            this.EZpvd.valueOf.setTextSize(0, this.KWHzl.djSkpj());
        }
        if (this.KWHzl.DTwDnp() != -1) {
            this.EZpvd.OLrzqt.setTextSize(0, this.KWHzl.DTwDnp());
        }
    }

    public final void setImageAndUpdateLayoutParams(@DrawableRes int i, boolean z) {
        setFunctionIconVisibility(true);
        ImageView imageView = this.EZpvd.EZpvd;
        imageView.setImageResource(i);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            if (z) {
                ((RelativeLayout.LayoutParams) layoutParams).addRule(15, -1);
            } else {
                ((RelativeLayout.LayoutParams) layoutParams).removeRule(15);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Orientation {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Orientation[] $VALUES;
        public static final Orientation VERTICAL = new Orientation("VERTICAL", 0);
        public static final Orientation HORIZONTAL = new Orientation("HORIZONTAL", 1);
        public static final Orientation UNDEFINED = new Orientation("UNDEFINED", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Orientation[] $values() {
            return new Orientation[]{VERTICAL, HORIZONTAL, UNDEFINED};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Orientation> getEntries() {
            return $ENTRIES;
        }

        private Orientation(String str, int i) {
        }

        static {
            Orientation[] orientationArr$values = $values();
            $VALUES = orientationArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(orientationArr$values);
        }

        public static Orientation valueOf(String str) {
            return (Orientation) Enum.valueOf(Orientation.class, str);
        }

        public static Orientation[] values() {
            return (Orientation[]) $VALUES.clone();
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.uilab.banner.OKAlertBanner.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final ImageView AhwBna() {
        ImageView imageView = this.EZpvd.djBIcL;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }
}
