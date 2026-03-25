package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import com.okinc.core.util.SPUtils;
import com.okinc.tradingbot.impl.strategy.bean.GuideLottieCard;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wMp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52470wMp extends ConstraintLayout {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public uXO AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52470wMp(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52470wMp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:21) call: o.wMp.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C52470wMp(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52470wMp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        uXO uxoAEQbTJ = uXO.AEQbTJ(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(uxoAEQbTJ, "");
        this.AEQbTJ = uxoAEQbTJ;
        AEQbTJ();
    }

    /* JADX INFO: renamed from: o.wMp$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wMp.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    private final void AEQbTJ() {
        final uXO uxo = this.AEQbTJ;
        boolean z = SPUtils.getBoolean("sp_key_bot_guide_expand", true);
        ConstraintLayout constraintLayout = uxo.copydefault;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(z ? 0 : 8);
        KWHzl(uxo);
        uxo.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.wMu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52470wMp.KWHzl(uxo, this, view);
            }
        });
    }

    public static final void KWHzl(uXO uxo, C52470wMp c52470wMp, android.view.View view) {
        ConstraintLayout constraintLayout = uxo.copydefault;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        ConstraintLayout constraintLayout2 = uxo.copydefault;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        constraintLayout.setVisibility((constraintLayout2.getVisibility() == 0) ^ true ? 0 : 8);
        c52470wMp.KWHzl(uxo);
    }

    private final void KWHzl(uXO uxo) {
        ConstraintLayout constraintLayout = uxo.copydefault;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(constraintLayout.getVisibility() == 0 ? C52761wXj.TaskDescription.DNMMPQ : C52761wXj.TaskDescription.DCUTEIddSDPG);
        if (drawableKWHzl != null) {
            drawableKWHzl.setBounds(0, 0, C55298xhM.dpInt$default(20.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(20.0f, (android.content.Context) null, 1, (java.lang.Object) null));
        }
        uxo.EZpvd.setCompoundDrawablesRelative(null, null, drawableKWHzl, null);
    }

    public final void setData(@NotNull GuideLottieCard guideLottieCard) {
        Intrinsics.checkNotNullParameter(guideLottieCard, "");
        uXO uxo = this.AEQbTJ;
        uxo.EZpvd.setText(guideLottieCard.KWHzl());
        AppCompatTextView appCompatTextView = uxo.OLrzqt;
        Intrinsics.copydefault(appCompatTextView);
        appCompatTextView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) guideLottieCard.AEQbTJ()) ? 0 : 8);
        appCompatTextView.setText(guideLottieCard.AEQbTJ());
        java.lang.Integer numOLrzqt = guideLottieCard.OLrzqt();
        if (numOLrzqt != null) {
            int iIntValue = numOLrzqt.intValue();
            C55353xiO c55353xiO = uxo.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55353xiO, "");
            c55353xiO.setVisibility(0);
            uxo.AEQbTJ.setAnimation(iIntValue);
            uxo.AEQbTJ.playAnimation();
        }
        java.lang.String strCopydefault = guideLottieCard.copydefault();
        if (strCopydefault != null) {
            AppCompatImageView appCompatImageView = uxo.KWHzl;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            appCompatImageView.setVisibility(0);
            Glide.AEQbTJ(getContext()).copydefault().KWHzl(C48033uCm.ActionBar.zsXlph).copydefault(strCopydefault).fetchVPNInfo().EZpvd((android.widget.ImageView) uxo.KWHzl);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.AEQbTJ.AEQbTJ.cancelAnimation();
        ConstraintLayout constraintLayout = this.AEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        SPUtils.put("sp_key_bot_guide_expand", java.lang.Boolean.valueOf(constraintLayout.getVisibility() == 0));
    }
}
