package o;

import androidx.core.content.ContextCompat;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieListener;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ylN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57592ylN extends C55281xgw {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final int AEQbTJ;
    public int AYXKKw;
    public float AhwBna;
    public java.lang.CharSequence DbNXlk;
    public final int KWHzl;
    public final int OLrzqt;
    public final int copydefault;
    public final int djBIcL;
    public LottieDrawable gEmmrt;
    public boolean isConnected;
    public final int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final int copydefault() {
        int i = this.AYXKKw;
        if (i != 6 && i != 2 && i != this.OLrzqt && i != this.djBIcL) {
            if (i == this.valueOf || i == this.KWHzl) {
                return C52761wXj.PendingIntent.OLrzqt;
            }
            if (i == this.copydefault) {
                return C52761wXj.PendingIntent.KWHzl;
            }
        }
        return C52761wXj.PendingIntent.zLjUOn;
    }

    /* JADX INFO: renamed from: o.ylN$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ylN.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57592ylN(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57592ylN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57592ylN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.valueOf = 1;
        this.djBIcL = 3;
        this.OLrzqt = 4;
        this.KWHzl = 5;
        this.copydefault = 7;
        this.AEQbTJ = 8;
        this.AYXKKw = 1;
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C32113mPz.PendingIntent.fHqPtx);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int integer = typedArrayObtainStyledAttributes.getInteger(C32113mPz.PendingIntent.hCLrkq, -1);
            float fEZpvd = C33052mpF.EZpvd(typedArrayObtainStyledAttributes.getInteger(C32113mPz.PendingIntent.DBxZfM, 4), context);
            this.AhwBna = fEZpvd;
            AEQbTJ(integer, fEZpvd);
            this.AYXKKw = integer;
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void AEQbTJ(int i, float f) {
        C55279xgu c55279xguFARcdN = fARcdN();
        c55279xguFARcdN.OLrzqt(f);
        c55279xguFARcdN.copydefault(true);
        if (i == this.valueOf) {
            fARcdN().DbNXlk(ContextCompat.getColor(getContext(), C52761wXj.Activity.GiPPlLgiPPlL));
            C55279xgu c55279xguFARcdN2 = fARcdN();
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c55279xguFARcdN2.fIwbmz(C33052mpF.EZpvd(0.5f, context));
            fARcdN().AhwBna(0);
            fARcdN().valueOf(0);
            fARcdN().AYXKKw(ContextCompat.getColor(getContext(), C32113mPz.ActionBar.AYXKKw));
            setTextColor(ContextCompat.getColorStateList(getContext(), C32113mPz.ActionBar.copydefault));
        } else if (i == this.KWHzl) {
            fARcdN().AhwBna(ContextCompat.getColor(getContext(), C52761wXj.Activity.fmB));
            fARcdN().valueOf(ContextCompat.getColor(getContext(), C52761wXj.Activity.scanPackages));
            fARcdN().AYXKKw(ContextCompat.getColor(getContext(), C52761wXj.Activity.fZc));
            setTextColor(ContextCompat.getColorStateList(getContext(), C52761wXj.Activity.DcMfJKfbSiEC));
        } else if (i == 2) {
            fARcdN().AhwBna(ContextCompat.getColor(getContext(), C52761wXj.Activity.getStatusCode));
            fARcdN().valueOf(ContextCompat.getColor(getContext(), C52761wXj.Activity.fZc));
            fARcdN().AYXKKw(ContextCompat.getColor(getContext(), C32113mPz.ActionBar.OLrzqt));
            setTextColor(ContextCompat.getColorStateList(getContext(), C52761wXj.Activity.Hx));
        } else if (i == this.OLrzqt) {
            fARcdN().AhwBna(ContextCompat.getColor(getContext(), C52761wXj.Activity.zvzmfz));
            fARcdN().valueOf(ContextCompat.getColor(getContext(), C52761wXj.Activity.fZc));
            fARcdN().AYXKKw(ContextCompat.getColor(getContext(), C52761wXj.Activity.setLocationManually));
            setTextColor(ContextCompat.getColorStateList(getContext(), C52761wXj.Activity.DcMfJKsgNvtZ));
        } else if (i == this.djBIcL) {
            fARcdN().AhwBna(ContextCompat.getColor(getContext(), C52761wXj.Activity.HJWChPdIKEqB));
            fARcdN().valueOf(ContextCompat.getColor(getContext(), C52761wXj.Activity.fZc));
            fARcdN().AYXKKw(ContextCompat.getColor(getContext(), C52761wXj.Activity.dNxZaP));
            setTextColor(ContextCompat.getColorStateList(getContext(), C52761wXj.Activity.DcMfJKsgNvtZ));
        } else if (i == 6) {
            fARcdN().AhwBna(ContextCompat.getColor(getContext(), C52761wXj.Activity.QHmsKR));
            fARcdN().valueOf(ContextCompat.getColor(getContext(), C52761wXj.Activity.UccSpe));
            fARcdN().AYXKKw(ContextCompat.getColor(getContext(), C52761wXj.Activity.HJWChPRGtXKCRGtXKC));
            setTextColor(ContextCompat.getColorStateList(getContext(), C52761wXj.Activity.DcMfJKfNLfdT));
        } else if (i == this.copydefault) {
            fARcdN().AhwBna(ContextCompat.getColor(getContext(), C52761wXj.Activity.sCB));
            fARcdN().valueOf(ContextCompat.getColor(getContext(), C52761wXj.Activity.fZc));
            fARcdN().AYXKKw(ContextCompat.getColor(getContext(), C52761wXj.Activity.sCB));
            setTextColor(ContextCompat.getColorStateList(getContext(), C52761wXj.Activity.fbC));
        }
        getNewProxyInstance().KWHzl(this, fARcdN());
    }

    public final void setType(int i) {
        this.AYXKKw = i;
        AEQbTJ(i, this.AhwBna);
    }

    public final void setButtonBack(int i) {
        setBackgroundResource(i);
    }

    public final void setButtonBackColor(int i) {
        setBackgroundColor(i);
    }

    public final void setButtonTextColor(int i) {
        setTextColor(ContextCompat.getColorStateList(getContext(), i));
    }

    public static /* synthetic */ void startLoading$default(C57592ylN c57592ylN, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c57592ylN.KWHzl(z);
    }

    public final void KWHzl(boolean z) {
        this.isConnected = true;
        setClickable(false);
        EZpvd(z);
    }

    public static /* synthetic */ void loadLottie$default(C57592ylN c57592ylN, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c57592ylN.EZpvd(z);
    }

    public final void EZpvd(final boolean z) {
        LottieDrawable lottieDrawable = this.gEmmrt;
        if (lottieDrawable == null) {
            final LottieDrawable lottieDrawable2 = new LottieDrawable();
            LottieCompositionFactory.fromRawRes(getContext(), copydefault()).addListener(new LottieListener() { // from class: o.ylJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(java.lang.Object obj) {
                    C57592ylN.OLrzqt(lottieDrawable2, this, z, (LottieComposition) obj);
                }
            });
            this.gEmmrt = lottieDrawable2;
            return;
        }
        setLoadingCompoundDrawable(lottieDrawable, z);
    }

    public static final void OLrzqt(LottieDrawable lottieDrawable, C57592ylN c57592ylN, boolean z, LottieComposition lottieComposition) {
        lottieDrawable.setComposition(lottieComposition);
        lottieDrawable.setRepeatCount(-1);
        c57592ylN.setLoadingCompoundDrawable(lottieDrawable, z);
    }

    public static /* synthetic */ void setLoadingCompoundDrawable$default(C57592ylN c57592ylN, LottieDrawable lottieDrawable, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c57592ylN.setLoadingCompoundDrawable(lottieDrawable, z);
    }

    public final void setLoadingCompoundDrawable(LottieDrawable lottieDrawable, boolean z) {
        if (lottieDrawable != null) {
            lottieDrawable.setBounds(0, 0, C33052mpF.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null), C33052mpF.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null));
        }
        setCompoundDrawablesRelative(lottieDrawable, null, null, null);
        if (z) {
            java.lang.CharSequence charSequence = this.DbNXlk;
            if (charSequence == null || charSequence.length() == 0) {
                this.DbNXlk = getText();
            }
            setText("");
        } else {
            setCompoundDrawablePadding(C33052mpF.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null));
        }
        if (lottieDrawable != null) {
            lottieDrawable.start();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        C33615mzm.AEQbTJ(this, canvas);
        super.onDraw(canvas);
    }
}
