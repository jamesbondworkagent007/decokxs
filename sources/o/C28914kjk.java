package o;

import android.widget.ImageView;
import android.widget.LinearLayout;
import com.okinc.business.market.features.meme.data.model.XPostType;
import com.okinc.business.market.features.meme.domain.model.MemeSocialMediaData;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kjk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28914kjk {
    public static /* synthetic */ java.util.List getSocialImageViews$default(android.content.Context context, java.util.List list, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            f = 16.0f;
        }
        if ((i & 8) != 0) {
            f2 = 0.0f;
        }
        return EZpvd(context, list, f, f2);
    }

    public static final java.util.List<android.widget.ImageView> EZpvd(@NotNull android.content.Context context, @NotNull java.util.List<MemeSocialMediaData> list, float f, float f2) {
        int iCopydefault;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            MemeSocialMediaData memeSocialMediaData = (MemeSocialMediaData) obj;
            android.widget.ImageView imageView = new android.widget.ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C55298xhM.KWHzl(f, context), C55298xhM.KWHzl(f, context));
            layoutParams.gravity = 16;
            layoutParams.setMarginEnd(C55298xhM.KWHzl(f2, context));
            imageView.setLayoutParams(layoutParams);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) memeSocialMediaData.KWHzl())) {
                C33054mpH.AEQbTJ(imageView, memeSocialMediaData.KWHzl());
            } else {
                if (memeSocialMediaData.gEmmrt() != null) {
                    iCopydefault = memeSocialMediaData.gEmmrt().intValue();
                } else if (memeSocialMediaData.djBIcL() != XPostType.POST) {
                    iCopydefault = C25382ivf.copydefault(C52761wXj.Activity.DCUTEIddSDPG, context);
                } else if (memeSocialMediaData.AhwBna() > 0) {
                    iCopydefault = C25382ivf.copydefault(C28888kjK.KWHzl(java.lang.System.currentTimeMillis() - memeSocialMediaData.AhwBna()), context);
                } else {
                    iCopydefault = C25382ivf.copydefault(C23274hvD.StateListAnimator.AEQbTJ, context);
                }
                android.graphics.drawable.Drawable drawableEZpvd = C33070mpX.EZpvd(memeSocialMediaData.AYXKKw(), context);
                if (drawableEZpvd != null) {
                    C33057mpK.copydefault(drawableEZpvd, iCopydefault);
                } else {
                    drawableEZpvd = null;
                }
                imageView.setImageDrawable(drawableEZpvd);
            }
            arrayList.add(imageView);
            i++;
        }
        return arrayList;
    }
}
