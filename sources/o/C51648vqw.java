package o;

import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.okinc.unify_trade.biz.RecommendInvestItem;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.vqw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51648vqw extends android.widget.FrameLayout {
    public int AEQbTJ;
    public int AYXKKw;
    public float EZpvd;
    public int KWHzl;
    public int OLrzqt;
    public int copydefault;
    public int djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51648vqw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C48033uCm.LoaderManager.ejfBZ);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.OLrzqt = typedArrayObtainStyledAttributes.getColor(C48033uCm.LoaderManager.fARcdN, C33070mpX.copydefault(C32113mPz.ActionBar.isConnected));
        this.AYXKKw = typedArrayObtainStyledAttributes.getColor(C48033uCm.LoaderManager.iwGUEr, C33070mpX.copydefault(C32113mPz.ActionBar.fARcdN));
        this.djBIcL = typedArrayObtainStyledAttributes.getColor(C48033uCm.LoaderManager.hDKMBd, C33070mpX.copydefault(C32113mPz.ActionBar.zLjUOn));
        this.EZpvd = typedArrayObtainStyledAttributes.getDimension(C48033uCm.LoaderManager.fIwbmz, C57681ymx.OLrzqt(this, 3.0f));
        this.AEQbTJ = (int) typedArrayObtainStyledAttributes.getDimension(C48033uCm.LoaderManager.getNewProxyInstance, 16.0f);
        this.copydefault = typedArrayObtainStyledAttributes.getInt(C48033uCm.LoaderManager.zLjUOn, Integer.MAX_VALUE);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void refreshCircleCoins$default(C51648vqw c51648vqw, java.util.List list, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = c51648vqw.copydefault;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        c51648vqw.AEQbTJ(list, i, i2);
    }

    public final void AEQbTJ(@NotNull java.util.List<RecommendInvestItem> list, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "");
        removeAllViews();
        int iMin = java.lang.Math.min(list.size(), i);
        this.KWHzl = iMin;
        for (int i3 = 0; i3 < iMin; i3++) {
            android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C48033uCm.Activity.isElapsedRealtimeNanosAvailable, (android.view.ViewGroup) this, false);
            android.graphics.drawable.Drawable background = viewInflate.getBackground();
            if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setColor(android.content.res.ColorStateList.valueOf(this.OLrzqt));
            }
            android.widget.ImageView imageView = (android.widget.ImageView) viewInflate.findViewById(C48033uCm.Application.ITrustedWebActivityCallback);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            int i4 = this.AEQbTJ;
            layoutParams.width = i4;
            layoutParams.height = i4;
            imageView.setLayoutParams(layoutParams);
            InterfaceC49317umK interfaceC49317umK = (InterfaceC49317umK) C43251rlk.copydefault(InterfaceC49317umK.class);
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Intrinsics.copydefault(imageView);
            interfaceC49317umK.copydefault(context, imageView, list.get(i3).getNickName(), list.get(i3).getPortrait(), list.get(i3).getTargetId());
            ViewGroup.LayoutParams layoutParams2 = viewInflate.getLayoutParams();
            Intrinsics.copydefault(layoutParams2, "");
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
            layoutParams3.width = this.AEQbTJ + C57681ymx.OLrzqt(this, 2.0f);
            layoutParams3.height = this.AEQbTJ + C57681ymx.OLrzqt(this, 2.0f);
            if (i3 != list.size() - 1) {
                C55296xhK.AEQbTJ(layoutParams3, C57681ymx.OLrzqt(this, this.EZpvd) * ((list.size() - 1) - i3), 0, 0, 0);
            }
            viewInflate.setLayoutParams(layoutParams3);
            addView(viewInflate);
        }
        int i5 = i2 - i;
        if (i5 > 0) {
            android.view.View viewInflate2 = android.view.LayoutInflater.from(getContext()).inflate(i5 > 9 ? C48033uCm.Activity.dNxZaP : C48033uCm.Activity.HJWChPdNQGVJ, (android.view.ViewGroup) this, false);
            android.graphics.drawable.Drawable background2 = viewInflate2.getBackground();
            if (background2 instanceof GradientDrawable) {
                ((GradientDrawable) background2).setColor(android.content.res.ColorStateList.valueOf(this.OLrzqt));
            }
            android.widget.TextView textView = (android.widget.TextView) viewInflate2.findViewById(C48033uCm.Application.getContext);
            android.graphics.drawable.Drawable background3 = textView.getBackground();
            if (background3 instanceof GradientDrawable) {
                ((GradientDrawable) background3).setColor(android.content.res.ColorStateList.valueOf(this.AYXKKw));
            }
            textView.setTextColor(this.djBIcL);
            ViewGroup.LayoutParams layoutParams4 = textView.getLayoutParams();
            layoutParams4.width = i5 > 9 ? -2 : this.AEQbTJ;
            layoutParams4.height = this.AEQbTJ;
            textView.setLayoutParams(layoutParams4);
            textView.setText(Marker.ANY_NON_NULL_MARKER + xMR.copydefault.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(i5))));
            ViewGroup.LayoutParams layoutParams5 = viewInflate2.getLayoutParams();
            Intrinsics.copydefault(layoutParams5, "");
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
            C55296xhK.AEQbTJ(layoutParams6, C57681ymx.OLrzqt(this, 0.0f - this.EZpvd), 0, 0, 0);
            layoutParams6.width = i5 <= 9 ? this.AEQbTJ + C57681ymx.OLrzqt(this, 2.0f) : -2;
            layoutParams6.height = this.AEQbTJ + C57681ymx.OLrzqt(this, 2.0f);
            viewInflate2.setLayoutParams(layoutParams6);
            addView(viewInflate2);
        }
    }
}
