package o;

import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieListener;
import com.google.android.material.textview.MaterialTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.xez, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55178xez extends android.widget.LinearLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public int AEQbTJ;
    public java.lang.String AYXKKw;
    public int AhwBna;
    public int DbNXlk;
    public android.view.View EZpvd;
    public final C54915xaA KWHzl;
    public android.view.View copydefault;
    public android.view.View djBIcL;
    public java.lang.String fetchVPNInfo;
    public int gEmmrt;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55178xez(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.view.View EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:34) call: o.xez.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C55178xez(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55178xez(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.gEmmrt = -1;
        this.fetchVPNInfo = "";
        this.AYXKKw = "";
        C54915xaA c54915xaACopydefault = C54915xaA.copydefault(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c54915xaACopydefault, "");
        this.KWHzl = c54915xaACopydefault;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.HJWChPRAkuRW);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        setType(typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.getSerial, 0));
        setStatus(typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.HJWChPRGtXKCRGtXKC, -1));
        setTitleText(typedArrayObtainStyledAttributes.getString(C52761wXj.PictureInPictureParams.HJWChPRGtXKCDKRTZD));
        setSubTitleText(typedArrayObtainStyledAttributes.getString(C52761wXj.PictureInPictureParams.gCNefq));
        setAdvancedViewId(typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.RSmiaq, 0));
        setBottomViewId(typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.RWIpjU, 0));
        setOrientation(1);
        typedArrayObtainStyledAttributes.recycle();
        c54915xaACopydefault.AYXKKw.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: o.xex
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
            public final void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                C55178xez.OLrzqt(this.copydefault, nestedScrollView, i, i2, i3, i4);
            }
        });
        C52794wYp c52794wYpAEQbTJ = c54915xaACopydefault.OLrzqt.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
    }

    public final void setType(int i) {
        this.DbNXlk = i;
        if (i == 0) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            this.AhwBna = (int) (((double) C55302xhQ.AEQbTJ(context)) * 0.06d);
            ViewGroup.LayoutParams layoutParams = KWHzl().getLayoutParams();
            if (this.gEmmrt >= 3) {
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                int iOLrzqt = C55298xhM.OLrzqt(216, context2);
                layoutParams.width = iOLrzqt;
                layoutParams.height = iOLrzqt;
            } else {
                layoutParams.width = -2;
                layoutParams.height = -2;
            }
            KWHzl().setLayoutParams(layoutParams);
        } else if (i == 1) {
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            this.AhwBna = (int) (((double) C55302xhQ.AEQbTJ(context3)) * 0.03d);
            ViewGroup.LayoutParams layoutParams2 = KWHzl().getLayoutParams();
            if (this.gEmmrt >= 3) {
                android.content.Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                int iOLrzqt2 = C55298xhM.OLrzqt(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, context4);
                layoutParams2.width = iOLrzqt2;
                layoutParams2.height = iOLrzqt2;
            } else {
                layoutParams2.width = -2;
                layoutParams2.height = -2;
            }
            KWHzl().setLayoutParams(layoutParams2);
        }
        ViewGroup.LayoutParams layoutParams3 = this.KWHzl.KWHzl.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = this.AhwBna;
        }
        this.KWHzl.KWHzl.setLayoutParams(layoutParams3);
    }

    public final void setStatus(int i) {
        this.gEmmrt = i;
        switch (i) {
            case 0:
                copydefault(C52761wXj.TaskDescription.gVEiQJ);
                break;
            case 1:
                copydefault(C52761wXj.TaskDescription.GCXiNH);
                break;
            case 2:
                copydefault(C52761wXj.TaskDescription.FhERFw);
                break;
            case 3:
                AEQbTJ(C52761wXj.PendingIntent.valueOf, 0);
                break;
            case 4:
                AEQbTJ(C52761wXj.PendingIntent.uzCIH, 0);
                break;
            case 5:
                AEQbTJ(C52761wXj.PendingIntent.ejfBZ, 0);
                break;
            case 6:
                AEQbTJ(C52761wXj.PendingIntent.fIwbmz, -1);
                break;
            case 7:
                AEQbTJ(C52761wXj.PendingIntent.iwGUEr, -1);
                break;
        }
    }

    public final void setTitleText(java.lang.String str) {
        this.fetchVPNInfo = str;
        MaterialTextView materialTextView = this.KWHzl.values;
        Intrinsics.checkNotNullExpressionValue(materialTextView, "");
        C55307xhV.AEQbTJ(materialTextView, this.fetchVPNInfo);
    }

    public final void setSubTitleText(java.lang.String str) {
        this.AYXKKw = str;
        MaterialTextView materialTextView = this.KWHzl.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(materialTextView, "");
        C55307xhV.AEQbTJ(materialTextView, this.AYXKKw);
    }

    public final void setAdvancedViewId(int i) {
        if (i == 0) {
            return;
        }
        this.AEQbTJ = i;
        android.widget.RelativeLayout relativeLayout = this.KWHzl.copydefault;
        relativeLayout.removeAllViews();
        relativeLayout.addView(android.view.LayoutInflater.from(relativeLayout.getContext()).inflate(i, (android.view.ViewGroup) relativeLayout, false));
    }

    public final void setAdvancedView(android.view.View view) {
        if (view == null) {
            return;
        }
        this.EZpvd = view;
        android.widget.RelativeLayout relativeLayout = this.KWHzl.copydefault;
        relativeLayout.removeAllViews();
        relativeLayout.addView(view);
    }

    public final void setBottomViewId(int i) {
        if (i == 0) {
            return;
        }
        this.valueOf = i;
        android.widget.RelativeLayout relativeLayout = this.KWHzl.AhwBna;
        relativeLayout.removeAllViews();
        android.view.LayoutInflater.from(relativeLayout.getContext()).inflate(i, (android.view.ViewGroup) relativeLayout, true);
    }

    public final void setBottomView(android.view.View view) {
        if (view == null) {
            return;
        }
        this.copydefault = view;
        android.widget.RelativeLayout relativeLayout = this.KWHzl.AhwBna;
        relativeLayout.removeAllViews();
        relativeLayout.addView(view);
    }

    public final void setOptionalView(android.view.View view) {
        if (view == null) {
            return;
        }
        this.djBIcL = view;
        android.widget.RelativeLayout relativeLayout = this.KWHzl.djBIcL;
        relativeLayout.removeAllViews();
        relativeLayout.addView(view);
    }

    public final android.widget.ImageView AEQbTJ() {
        android.widget.ImageView imageView = this.KWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }

    public final android.widget.ImageView KWHzl() {
        android.widget.ImageView imageView = this.KWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }

    public final android.widget.TextView copydefault() {
        MaterialTextView materialTextView = this.KWHzl.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(materialTextView, "");
        return materialTextView;
    }

    public final wYF OLrzqt() {
        wYF wyf = this.KWHzl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(wyf, "");
        return wyf;
    }

    public static final void OLrzqt(C55178xez c55178xez, NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(nestedScrollView, "");
        c55178xez.KWHzl.KWHzl.setTranslationY(C56548yJl.EZpvd(0 - i2, -c55178xez.AhwBna, 0));
    }

    private final void copydefault(@androidx.annotation.DrawableRes int i) {
        ViewGroup.LayoutParams layoutParams = KWHzl().getLayoutParams();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iOLrzqt = C55298xhM.OLrzqt(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, context);
        layoutParams.width = iOLrzqt;
        layoutParams.height = iOLrzqt;
        KWHzl().setImageDrawable(ContextCompat.getDrawable(getContext(), i));
    }

    public static /* synthetic */ void showStatusLottieAnimation$default(C55178xez c55178xez, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        c55178xez.AEQbTJ(i, i2);
    }

    public final void AEQbTJ(@androidx.annotation.RawRes int i, final int i2) {
        LottieCompositionFactory.fromRawRes(getContext(), i).addListener(new LottieListener() { // from class: o.xeF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(java.lang.Object obj) {
                C55178xez.AEQbTJ(this.KWHzl, i2, (LottieComposition) obj);
            }
        });
    }

    public static final void AEQbTJ(C55178xez c55178xez, int i, LottieComposition lottieComposition) {
        android.widget.ImageView imageViewKWHzl = c55178xez.KWHzl();
        LottieDrawable lottieDrawable = new LottieDrawable();
        lottieDrawable.setComposition(lottieComposition);
        lottieDrawable.setRepeatCount(i);
        lottieDrawable.playAnimation();
        imageViewKWHzl.performHapticFeedback(0);
        imageViewKWHzl.setImageDrawable(lottieDrawable);
        ViewGroup.LayoutParams layoutParams = imageViewKWHzl.getLayoutParams();
        if (c55178xez.DbNXlk == 0) {
            android.content.Context context = imageViewKWHzl.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iOLrzqt = C55298xhM.OLrzqt(216, context);
            layoutParams.width = iOLrzqt;
            layoutParams.height = iOLrzqt;
            return;
        }
        android.content.Context context2 = imageViewKWHzl.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int iOLrzqt2 = C55298xhM.OLrzqt(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, context2);
        layoutParams.width = iOLrzqt2;
        layoutParams.height = iOLrzqt2;
    }

    /* JADX INFO: renamed from: o.xez$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xez.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
