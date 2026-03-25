package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.main.swap.trade.input.bean.ImageTextSelectData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iky, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24819iky extends android.widget.LinearLayout {
    public ImageTextSelectData AEQbTJ;
    public C21514hCe EZpvd;
    public kotlin.Pair<android.animation.AnimatorSet, android.animation.AnimatorSet> KWHzl;
    public Function1<? super C24819iky, Unit> OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageTextSelectData AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelectClick(@NotNull Function1<? super C24819iky, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenNameA11yPrefix(java.lang.String str) {
        this.copydefault = str;
    }

    public C24819iky(android.content.Context context) {
        super(context);
        this.AEQbTJ = new ImageTextSelectData(null, 0, null, null, null, null, false, 127, null);
        AEQbTJ(context, null);
    }

    public C24819iky(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.AEQbTJ = new ImageTextSelectData(null, 0, null, null, null, null, false, 127, null);
        AEQbTJ(context, attributeSet);
    }

    public C24819iky(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.AEQbTJ = new ImageTextSelectData(null, 0, null, null, null, null, false, 127, null);
        AEQbTJ(context, attributeSet);
    }

    public final void AEQbTJ(android.content.Context context, android.util.AttributeSet attributeSet) {
        if (context == null) {
            return;
        }
        this.EZpvd = C21514hCe.AEQbTJ(android.view.LayoutInflater.from(context), this);
        OLrzqt(this.AEQbTJ);
        EZpvd();
    }

    public final void EZpvd() {
        this.KWHzl = C25352ivB.setOnAnimTouchListener$default(this, false, 0.9f, new Function1() { // from class: o.ikB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24819iky.OLrzqt(this.AEQbTJ, (android.view.MotionEvent) obj);
            }
        }, 1, null);
    }

    public static final Unit OLrzqt(C24819iky c24819iky, android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        Function1<? super C24819iky, Unit> function1 = c24819iky.OLrzqt;
        if (function1 != null) {
            function1.invoke(c24819iky);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(ImageTextSelectData imageTextSelectData) {
        android.graphics.drawable.Drawable drawableKWHzl;
        C21514hCe c21514hCe = this.EZpvd;
        if (c21514hCe != null) {
            if (!imageTextSelectData.getIconClick()) {
                setOnTouchListener(null);
                drawableKWHzl = null;
            } else {
                drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.OJuSTm);
            }
            c21514hCe.EZpvd.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawableKWHzl, (android.graphics.drawable.Drawable) null);
            java.lang.String strConsumeData = imageTextSelectData.getText().consumeData();
            if (strConsumeData != null) {
                c21514hCe.EZpvd.setText(strConsumeData);
            }
            int type = imageTextSelectData.getType();
            if (type == 0) {
                c21514hCe.copydefault.setVisibility(0);
                java.lang.String strConsumeData2 = imageTextSelectData.getImageUrl().consumeData();
                if (strConsumeData2 != null) {
                    android.widget.ImageView imageView = c21514hCe.copydefault;
                    Intrinsics.checkNotNullExpressionValue(imageView, "");
                    C57659ymb.KWHzl(imageView, strConsumeData2, imageTextSelectData.getImageRes().getData().intValue());
                }
                c21514hCe.OLrzqt.setVisibility(0);
                android.widget.ImageView imageView2 = c21514hCe.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                C57659ymb.KWHzl(imageView2, imageTextSelectData.getChainLogoUrl().getData(), imageTextSelectData.getImageRes().getData().intValue());
            } else if (type == 1) {
                c21514hCe.copydefault.setVisibility(0);
                java.lang.Integer numConsumeData = imageTextSelectData.getImageRes().consumeData();
                if (numConsumeData != null) {
                    int iIntValue = numConsumeData.intValue();
                    android.widget.ImageView imageView3 = c21514hCe.copydefault;
                    Intrinsics.checkNotNullExpressionValue(imageView3, "");
                    C57659ymb.EZpvd(imageView3, iIntValue, 0.5f);
                }
            } else {
                c21514hCe.copydefault.setVisibility(8);
                c21514hCe.OLrzqt.setVisibility(8);
            }
        }
        EZpvd(imageTextSelectData);
    }

    public final void setSelectData(@NotNull ImageTextSelectData imageTextSelectData) {
        Intrinsics.checkNotNullParameter(imageTextSelectData, "");
        this.AEQbTJ = imageTextSelectData;
        OLrzqt(imageTextSelectData);
    }

    public final void EZpvd(ImageTextSelectData imageTextSelectData) {
        C21514hCe c21514hCe;
        android.widget.TextView textView;
        java.lang.String str = this.copydefault;
        if (str == null) {
            return;
        }
        java.lang.Object data = imageTextSelectData.getData();
        DexMultiTokenInfoBean dexMultiTokenInfoBean = data instanceof DexMultiTokenInfoBean ? (DexMultiTokenInfoBean) data : null;
        if (dexMultiTokenInfoBean == null || dexMultiTokenInfoBean.getChainId().length() <= 0 || (c21514hCe = this.EZpvd) == null || (textView = c21514hCe.EZpvd) == null) {
            return;
        }
        textView.setContentDescription(str + "_" + dexMultiTokenInfoBean.getChainId() + "_" + dexMultiTokenInfoBean.getTokenContractAddress());
    }

    public final void copydefault() {
        android.animation.AnimatorSet second;
        android.animation.AnimatorSet first;
        kotlin.Pair<android.animation.AnimatorSet, android.animation.AnimatorSet> pair = this.KWHzl;
        if (pair != null && (first = pair.getFirst()) != null) {
            first.cancel();
        }
        kotlin.Pair<android.animation.AnimatorSet, android.animation.AnimatorSet> pair2 = this.KWHzl;
        if (pair2 == null || (second = pair2.getSecond()) == null) {
            return;
        }
        second.cancel();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C33050mpD.OLrzqt(this);
        copydefault();
    }
}
