package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC52764wXm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xbQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54984xbQ extends C52794wYp {
    public final C54983xbP EZpvd;
    public final C55065xcs KWHzl;
    public boolean OLrzqt;
    public boolean copydefault;
    public int gEmmrt;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C54984xbQ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C54984xbQ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Possible override for method o.wYp.AEQbTJ()Landroid/graphics/Rect; */
    public final C54984xbQ AEQbTJ() {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStyle(int i) {
        this.gEmmrt = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.ActionBar.igXuih int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:29) call: o.xbQ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C54984xbQ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.ActionBar.igXuih : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54984xbQ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        int i2;
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
        C54983xbP c54983xbP = new C54983xbP(this);
        this.EZpvd = c54983xbP;
        C55065xcs c55065xcs = new C55065xcs(this, 0, 2, null);
        this.KWHzl = c55065xcs;
        c54983xbP.OLrzqt(attributeSet, i, C52761wXj.LoaderManager.djSkpj);
        InterfaceC52764wXm.Application.loadFromAttributes$default(c55065xcs, attributeSet, i, 0, 4, null);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.fGQ, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.gEmmrt = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.gdmIOq, 0);
        this.copydefault = typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.DQzvGNdrmXxu, false);
        typedArrayObtainStyledAttributes.recycle();
        fetchVPNInfo().AEQbTJ(C55298xhM.KWHzl(1.5f, context));
        setOKDSPill(-2);
        if (AkhnZx() == -1) {
            if (c55065xcs.copydefault() > -4) {
                i2 = 44;
            } else if (c55065xcs.copydefault() == -4) {
                i2 = 32;
            } else {
                i2 = c55065xcs.copydefault() == -5 ? 28 : 24;
            }
            setOKDSSize(i2);
        } else {
            setOKDSSize(AkhnZx());
        }
        setButtonCornerRadius(C55298xhM.EZpvd(8.0f, context));
        setEnabledStyle(isEnabled(), this.gEmmrt);
        if (isEnabled()) {
            setSelectedStyle(this.copydefault, this.gEmmrt);
        }
    }

    public final void setTitle(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        setText(charSequence);
    }

    /* JADX DEBUG: Possible override for method o.wYp.EZpvd()Ljava/util/ArrayList; */
    public final android.widget.ImageView EZpvd() {
        return new android.widget.ImageView(getContext());
    }

    public static /* synthetic */ void setSelectedStyle$default(C54984xbQ c54984xbQ, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        c54984xbQ.setSelectedStyle(z, i);
    }

    public final void setSelectedStyle(boolean z, int i) {
        setSelectedStyleInternal(z, i, true);
    }

    public static /* synthetic */ void setEnabledStyle$default(C54984xbQ c54984xbQ, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        c54984xbQ.setEnabledStyle(z, i);
    }

    public final void setEnabledStyle(boolean z, int i) {
        if (i == 0) {
            AEQbTJ().setOKDSType(z ? 34 : 260);
            return;
        }
        if (i == 1) {
            AEQbTJ().setOKDSType(z ? 260 : 49);
            if (z) {
                return;
            }
            AEQbTJ().setTextColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.Dff));
            return;
        }
        if (i == 2) {
            AEQbTJ().setOKDSType(z ? 257 : 260);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            C55279xgu c55279xguFARcdN = fARcdN();
            c55279xguFARcdN.AhwBna(0);
            c55279xguFARcdN.valueOf(0);
            c55279xguFARcdN.AYXKKw(this.EZpvd.dvKsVJ());
            getNewProxyInstance().KWHzl(this, fARcdN());
            if (z && this.copydefault) {
                setTextColor(this.EZpvd.OqFWZa());
            } else {
                setTextColor(this.EZpvd.dNCPSb());
            }
            TextViewCompat.setTextAppearance(this, C52761wXj.LoaderManager.giSNqX);
            return;
        }
        C55279xgu c55279xguFARcdN2 = fARcdN();
        c55279xguFARcdN2.AhwBna(0);
        c55279xguFARcdN2.valueOf(0);
        c55279xguFARcdN2.AYXKKw(this.EZpvd.aKErDB());
        c55279xguFARcdN2.fIwbmz(this.EZpvd.DXXBbs());
        c55279xguFARcdN2.DbNXlk(this.EZpvd.OuxcSI());
        getNewProxyInstance().KWHzl(this, fARcdN());
        if (z && this.copydefault) {
            setTextColor(this.EZpvd.OqFWZa());
        } else {
            setTextColor(this.EZpvd.dNCPSb());
        }
        if (AkhnZx() == 44) {
            TextViewCompat.setTextAppearance(this, C52761wXj.LoaderManager.giSNqX);
        } else {
            TextViewCompat.setTextAppearance(this, C52761wXj.LoaderManager.gGvvIC);
        }
    }

    public static /* synthetic */ void setSelectedStyleInternal$default(C54984xbQ c54984xbQ, boolean z, int i, boolean z2, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        c54984xbQ.setSelectedStyleInternal(z, i, z2);
    }

    public final void setSelectedStyleInternal(boolean z, int i, boolean z2) {
        if (z2) {
            this.copydefault = z;
        }
        if (i == 0) {
            AEQbTJ().setOKDSType(z ? 34 : 260);
            return;
        }
        if (i == 1) {
            AEQbTJ().setOKDSType(z ? 260 : 49);
            if (z) {
                return;
            }
            AEQbTJ().setTextColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.aappFQ));
            return;
        }
        if (i == 2) {
            AEQbTJ().setOKDSType(z ? 257 : 260);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            C55279xgu c55279xguFARcdN = fARcdN();
            c55279xguFARcdN.valueOf(0);
            c55279xguFARcdN.AYXKKw(this.EZpvd.dvKsVJ());
            c55279xguFARcdN.djBIcL(this.EZpvd.getPostValueLengthLimit());
            c55279xguFARcdN.AhwBna(z ? this.EZpvd.getPostValueLengthLimit() : 0);
            getNewProxyInstance().KWHzl(this, fARcdN());
            if (isEnabled() && z) {
                setTextColor(this.EZpvd.OqFWZa());
            } else {
                setTextColor(this.EZpvd.dNCPSb());
            }
            TextViewCompat.setTextAppearance(this, C52761wXj.LoaderManager.giSNqX);
            return;
        }
        C55279xgu c55279xguFARcdN2 = fARcdN();
        c55279xguFARcdN2.AhwBna(0);
        c55279xguFARcdN2.valueOf(0);
        c55279xguFARcdN2.djBIcL(0);
        c55279xguFARcdN2.AYXKKw(this.EZpvd.aKErDB());
        if (z) {
            c55279xguFARcdN2.fIwbmz(this.EZpvd.ODWQjV());
            c55279xguFARcdN2.DbNXlk(this.EZpvd.DCUTEI());
        } else {
            c55279xguFARcdN2.fIwbmz(this.EZpvd.DXXBbs());
            c55279xguFARcdN2.DbNXlk(this.EZpvd.OuxcSI());
        }
        getNewProxyInstance().KWHzl(this, fARcdN());
        if (isEnabled() && z) {
            setTextColor(this.EZpvd.OqFWZa());
        } else {
            setTextColor(this.EZpvd.dNCPSb());
        }
        if (AkhnZx() == 44) {
            TextViewCompat.setTextAppearance(this, C52761wXj.LoaderManager.giSNqX);
        } else {
            TextViewCompat.setTextAppearance(this, C52761wXj.LoaderManager.gGvvIC);
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.OLrzqt = onLongClickListener != null;
        super.setOnLongClickListener(onLongClickListener);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (isEnabled() && (hasOnClickListeners() || this.OLrzqt)) {
            if (motionEvent.getAction() == 0) {
                setSelectedStyleInternal$default(this, false, this.gEmmrt, false, 4, null);
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                setSelectedStyleInternal$default(this, this.copydefault, this.gEmmrt, false, 4, null);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // o.C52794wYp
    public C52770wXs DbNXlk() {
        if (this.EZpvd == null) {
            return null;
        }
        int iAkhnZx = AkhnZx();
        if (iAkhnZx == 28) {
            return this.EZpvd.ffGIBT();
        }
        if (iAkhnZx == 32) {
            return this.EZpvd.DarRvM();
        }
        if (iAkhnZx == 44) {
            return this.EZpvd.DCJXGO();
        }
        return this.EZpvd.zuWLRA();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002c  */
    @Override // o.C52794wYp, o.InterfaceC55066xct
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setOKDSSize(int i) {
        int i2 = 28;
        if (i < 0) {
            if (i > -4) {
                i2 = 44;
            } else if (i == -4) {
                i2 = 32;
            } else if (i != -5) {
                i2 = 24;
            }
            super.setOKDSSize(i2);
            return;
        }
        if (i < 44) {
            if (32 <= i && i < 44) {
                i2 = 32;
            } else if (i != 28) {
                i2 = i == 24 ? 24 : 44;
            }
        }
        super.setOKDSSize(i2);
    }

    /* JADX INFO: renamed from: o.xbQ$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xbQ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
