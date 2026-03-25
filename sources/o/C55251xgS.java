package o;

import android.graphics.PorterDuff;
import android.text.TextUtils;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC52764wXm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xgS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55251xgS extends AppCompatTextView implements InterfaceC55066xct {
    public final C55280xgv AYXKKw;
    public boolean AhwBna;
    public int AkhnZx;
    public int DbNXlk;
    public boolean EZpvd;
    public final C55257xgY KWHzl;
    public final C55060xcn OLrzqt;
    public C55279xgu copydefault;
    public final C55065xcs djBIcL;
    public android.graphics.drawable.Drawable gEmmrt;
    public android.content.res.ColorStateList valueOf;
    public int values;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55251xgS(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55251xgS(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCustomizeAppearance(boolean z) {
        this.EZpvd = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.ActionBar.DWgRXt int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:35) call: o.xgS.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55251xgS(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.ActionBar.DWgRXt : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55251xgS(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.values = -2;
        C55065xcs c55065xcs = new C55065xcs(this, 0, 2, null);
        this.djBIcL = c55065xcs;
        C55060xcn c55060xcn = new C55060xcn(this);
        this.OLrzqt = c55060xcn;
        this.AYXKKw = new C55280xgv();
        C55257xgY c55257xgY = new C55257xgY(this);
        this.KWHzl = c55257xgY;
        InterfaceC52764wXm.Application.loadFromAttributes$default(c55065xcs, attributeSet, i, 0, 4, null);
        InterfaceC52764wXm.Application.loadFromAttributes$default(c55060xcn, attributeSet, i, 0, 4, null);
        InterfaceC52764wXm.Application.loadFromAttributes$default(c55257xgY, attributeSet, i, 0, 4, null);
        setMaxWidth(C55298xhM.OLrzqt(200, context));
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        setGravity(17);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.SlnMSS, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        c55257xgY.OLrzqt(!typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.DXTac, false) && C33512mxp.AEQbTJ.isConnected() == 1);
        this.DbNXlk = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.sYOsaF, 0);
        setTagType(typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.sJqpAA, -2));
        setTagPaint(typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.fhwtiV, 0));
        setShowIcon(typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.isAvailable, false));
        setTagIcon(typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.UkvvWh));
        if (this.gEmmrt == null) {
            setTagIcon(ContextCompat.getDrawable(context, C52761wXj.TaskDescription.setPageName));
        }
        typedArrayObtainStyledAttributes.recycle();
        setStyle();
        setRadius();
        copydefault();
    }

    public final void setTagType(int i) {
        this.values = i;
        setRadius();
    }

    public final void setTagPaint(int i) {
        this.AkhnZx = i;
        setStyle();
        copydefault();
    }

    public final void setShowIcon(boolean z) {
        this.AhwBna = z;
        setIcon();
    }

    public final void setTagIcon(android.graphics.drawable.Drawable drawable) {
        this.gEmmrt = drawable;
        setIcon();
    }

    public final void setRadius() {
        float fEZpvd;
        int color;
        C55279xgu c55279xgu = new C55279xgu();
        c55279xgu.AkhnZx(0);
        if (this.values == -2) {
            float fValueOf = this.KWHzl.valueOf();
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            fEZpvd = C55298xhM.EZpvd(fValueOf, context);
        } else {
            float fKWHzl = this.KWHzl.KWHzl();
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            fEZpvd = C55298xhM.EZpvd(fKWHzl, context2);
        }
        c55279xgu.OLrzqt(fEZpvd);
        int i = this.DbNXlk;
        if (8 <= i && i < 13) {
            android.content.res.ColorStateList colorStateList = this.KWHzl.AEQbTJ()[this.DbNXlk];
            Intrinsics.copydefault(colorStateList);
            c55279xgu.isConnected(colorStateList.getDefaultColor());
            c55279xgu.KWHzl(this.KWHzl.OLrzqt()[this.DbNXlk]);
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            c55279xgu.fIwbmz(C55298xhM.KWHzl(1.0f, context3));
        } else if (this.KWHzl.gEmmrt()) {
            if (this.DbNXlk == 7) {
                android.content.res.ColorStateList colorStateList2 = this.KWHzl.AEQbTJ()[7];
                Intrinsics.copydefault(colorStateList2);
                color = colorStateList2.getDefaultColor();
            } else {
                color = ContextCompat.getColor(getContext(), C52761wXj.Activity.aBDePw);
            }
            c55279xgu.isConnected(color);
            c55279xgu.KWHzl(this.KWHzl.copydefault()[this.DbNXlk]);
            c55279xgu.fIwbmz(this.KWHzl.AhwBna());
        }
        this.copydefault = c55279xgu;
        C55280xgv c55280xgv = this.AYXKKw;
        Intrinsics.copydefault(c55279xgu);
        c55280xgv.KWHzl(this, c55279xgu);
    }

    public final void setBgColor(int i) {
        C55280xgv c55280xgv = this.AYXKKw;
        setBackgroundTintList(null);
        float fValueOf = this.KWHzl.valueOf();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c55280xgv.EZpvd(C55298xhM.EZpvd(fValueOf, context));
        c55280xgv.values(i);
        c55280xgv.OLrzqt(this);
    }

    public static /* synthetic */ void setBorder$default(C55251xgS c55251xgS, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            android.content.Context context = c55251xgS.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            i2 = C55298xhM.KWHzl(1.0f, context);
        }
        c55251xgS.setBorder(i, i2);
    }

    public final void setBorder(int i, int i2) {
        C55280xgv c55280xgv = this.AYXKKw;
        setBackgroundTintList(null);
        float fValueOf = this.KWHzl.valueOf();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c55280xgv.EZpvd(C55298xhM.EZpvd(fValueOf, context));
        c55280xgv.fetchVPNInfo(i2);
        c55280xgv.EZpvd((android.content.res.ColorStateList) null);
        c55280xgv.DbNXlk(i);
        c55280xgv.OLrzqt(this);
    }

    private final void copydefault() {
        int iCopydefault = this.djBIcL.copydefault();
        float fEZpvd = this.KWHzl.EZpvd(iCopydefault);
        int iOLrzqt = this.KWHzl.OLrzqt(iCopydefault);
        int iCopydefault2 = this.KWHzl.copydefault(iCopydefault);
        if (this.DbNXlk >= 6) {
            if (iCopydefault == -5 || iCopydefault == -4) {
                if (iCopydefault == -4) {
                    fEZpvd = C55298xhM.dp2pxFloat$default(12.0f, null, 1, null);
                } else {
                    fEZpvd = C55298xhM.dp2pxFloat$default(10.0f, null, 1, null);
                }
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                iOLrzqt = C55298xhM.KWHzl(4.0f, context);
            }
            if (iCopydefault <= -6) {
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                iCopydefault2 = C55298xhM.KWHzl(2.0f, context2);
            } else {
                setHeight(this.KWHzl.AEQbTJ(iCopydefault));
                setMaxLines(1);
                setEllipsize(TextUtils.TruncateAt.END);
                iCopydefault2 = 0;
            }
        }
        setPaddingRelative(iOLrzqt, iCopydefault2, iOLrzqt, iCopydefault2);
        setTextSize(0, fEZpvd);
    }

    public final void setStyle() {
        TextViewCompat.setTextAppearance(this, this.DbNXlk == 7 ? C52761wXj.LoaderManager.fFgQHt : this.KWHzl.AYXKKw());
        if (this.AkhnZx == 0 || this.DbNXlk >= 6) {
            int i = this.DbNXlk;
            setBackgroundTintList((8 > i || i >= 13) ? this.KWHzl.AEQbTJ()[this.DbNXlk] : null);
            setTextColor(this.KWHzl.OLrzqt()[this.DbNXlk]);
            this.valueOf = this.KWHzl.OLrzqt()[this.DbNXlk];
        } else {
            setBackgroundTintList(this.KWHzl.EZpvd()[this.DbNXlk]);
            setTextColor(this.KWHzl.copydefault()[this.DbNXlk]);
            this.valueOf = this.KWHzl.copydefault()[this.DbNXlk];
        }
        setIcon();
    }

    public final void setIcon() {
        if (this.AhwBna && this.valueOf != null) {
            int iKWHzl = this.KWHzl.KWHzl(this.djBIcL.copydefault());
            android.graphics.drawable.Drawable drawable = this.gEmmrt;
            if (drawable != null) {
                drawable.setBounds(0, 0, iKWHzl, iKWHzl);
                drawable.setTintList(this.valueOf);
                drawable.setTintMode(PorterDuff.Mode.SRC_IN);
            }
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            setCompoundDrawablePadding(C55298xhM.copydefault(2.0f, context));
            if (getLayoutDirection() == 1) {
                setCompoundDrawables(null, null, this.gEmmrt, null);
                return;
            } else {
                setCompoundDrawables(this.gEmmrt, null, null, null);
                return;
            }
        }
        setCompoundDrawables(null, null, null, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        setIcon();
    }

    @Override // o.InterfaceC55066xct
    public void setOKDSSize(int i) {
        this.djBIcL.setOKDSSize(i);
        copydefault();
    }

    public void setOKDSStyle(int i) {
        this.DbNXlk = i;
        setStyle();
        setRadius();
        copydefault();
    }

    public void setOKDSPill(int i) {
        this.OLrzqt.OLrzqt(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setStyleStability(boolean z) {
        boolean z2;
        C55257xgY c55257xgY = this.KWHzl;
        if (!z) {
            z2 = C33512mxp.AEQbTJ.isConnected() == 1;
        }
        c55257xgY.OLrzqt(z2);
        setStyle();
        invalidate();
    }

    /* JADX INFO: renamed from: o.xgS$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xgS.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
