package o;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DecodeFormat;
import java.security.MessageDigest;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC10168bjP;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bjD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10156bjD extends RecyclerView.ViewHolder {
    public final AbstractC17064evj EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10156bjD(@NotNull AbstractC17064evj abstractC17064evj) {
        super(abstractC17064evj.getRoot());
        Intrinsics.checkNotNullParameter(abstractC17064evj, "");
        this.EZpvd = abstractC17064evj;
    }

    public final void KWHzl(@NotNull final AbstractC10168bjP.Activity activity) {
        java.lang.String strValueOf;
        Intrinsics.checkNotNullParameter(activity, "");
        C5448Sc c5448ScCopydefault = copydefault(activity.valueOf());
        java.lang.String strValueOf2 = activity.valueOf();
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = strValueOf2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (C59449zhJ.endsWith$default(lowerCase, ".svg", false, 2, null)) {
            strValueOf = "SVG:" + activity.valueOf();
        } else {
            strValueOf = activity.valueOf();
        }
        C5335Nt c5335NtOLrzqt = Glide.AEQbTJ(this.EZpvd.getRoot().getContext()).EZpvd(strValueOf).OLrzqt((RX<?>) c5448ScCopydefault).OLrzqt(AppCompatResources.getDrawable(this.EZpvd.getRoot().getContext(), C13754dXa.Activity.hrNTAI));
        android.content.Context context = this.EZpvd.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        NN<android.graphics.Bitmap>[] nnArrCopydefault = copydefault(context);
        c5335NtOLrzqt.AEQbTJ((NN<android.graphics.Bitmap>[]) java.util.Arrays.copyOf(nnArrCopydefault, nnArrCopydefault.length)).EZpvd(this.EZpvd.AEQbTJ);
        this.EZpvd.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.bjG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C10156bjD.AEQbTJ(activity, this, view);
            }
        });
        if (C33129mqd.OLrzqt((java.lang.CharSequence) activity.AYXKKw()) && activity.KWHzl()) {
            this.EZpvd.copydefault.setVisibility(0);
        } else {
            this.EZpvd.copydefault.setVisibility(8);
        }
        if (activity.gEmmrt().length() > 0) {
            this.EZpvd.KWHzl.setVisibility(0);
            this.EZpvd.KWHzl.setText(activity.gEmmrt());
        } else {
            this.EZpvd.KWHzl.setVisibility(8);
        }
        C10186bjh c10186bjh = C10186bjh.KWHzl;
        java.lang.CharSequence charSequenceEZpvd = activity.EZpvd();
        this.EZpvd.OLrzqt.setText(C10186bjh.jointColorCharSequence$default(c10186bjh, ((java.lang.Object) charSequenceEZpvd) + activity.OLrzqt(), activity.AhwBna(), activity.copydefault(), 0, 8, null));
    }

    public static final void AEQbTJ(AbstractC10168bjP.Activity activity, C10156bjD c10156bjD, android.view.View view) {
        InterfaceC9773bbs interfaceC9773bbs;
        if (activity.AYXKKw().length() != 0 && activity.KWHzl()) {
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(activity.AEQbTJ());
            java.lang.Long lValueOf = c10854bwMKWHzl != null ? java.lang.Long.valueOf(c10854bwMKWHzl.fetchVPNInfo()) : null;
            java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9773bbs.class));
            if (listKWHzl == null || (interfaceC9773bbs = (InterfaceC9773bbs) CollectionsKt___CollectionsKt.AuCTelauCTel(listKWHzl)) == null) {
                return;
            }
            android.content.Context context = c10156bjD.EZpvd.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            interfaceC9773bbs.copydefault(context, activity.AYXKKw(), C33129mqd.gEmmrt(lValueOf));
        }
    }

    /* JADX INFO: renamed from: o.bjD$Activity */
    public static final class Activity extends AbstractC5396Qc {
        public final java.lang.String EZpvd = "DefiWalletTxDetailActivity.GlideRoundWithBorder";
        public final android.graphics.Paint KWHzl;
        public final byte[] copydefault;

        public Activity() {
            java.nio.charset.Charset charset = NH.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(charset, "");
            byte[] bytes = "DefiWalletTxDetailActivity.GlideRoundWithBorder".getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            this.copydefault = bytes;
            android.graphics.Paint paint = new android.graphics.Paint(5);
            this.KWHzl = paint;
            paint.setColor(C33070mpX.copydefault(C52761wXj.Activity.invokespecialDPHOMC));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(C33052mpF.dp2pxFloat$default(0.5f, null, 1, null));
        }

        @Override // o.NH
        public void AEQbTJ(MessageDigest messageDigest) {
            Intrinsics.checkNotNullParameter(messageDigest, "");
            messageDigest.update(this.copydefault);
        }

        @Override // o.AbstractC5396Qc
        public android.graphics.Bitmap AEQbTJ(OG og, android.graphics.Bitmap bitmap, int i, int i2) {
            Intrinsics.checkNotNullParameter(og, "");
            Intrinsics.checkNotNullParameter(bitmap, "");
            float strokeWidth = this.KWHzl.getStrokeWidth();
            int iMin = java.lang.Math.min(i, i2);
            android.graphics.Bitmap bitmapCopydefault = og.copydefault(iMin, iMin, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCopydefault, "");
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCopydefault);
            float f = iMin;
            float f2 = f - strokeWidth;
            canvas.drawBitmap(bitmap, (android.graphics.Rect) null, new RectF(strokeWidth, strokeWidth, f2, f2), new android.graphics.Paint(7));
            float fDp2pxFloat$default = C33052mpF.dp2pxFloat$default(4.0f, null, 1, null);
            float f3 = strokeWidth / 2;
            float f4 = f - f3;
            canvas.drawRoundRect(new RectF(f3, f3, f4, f4), fDp2pxFloat$default, fDp2pxFloat$default, this.KWHzl);
            return bitmapCopydefault;
        }
    }

    public final NN<android.graphics.Bitmap>[] copydefault(android.content.Context context) {
        return new NN[]{new C33481mxK(context, 4), new Activity()};
    }

    private final C5448Sc copydefault(java.lang.String str) {
        C5448Sc c5448Sc;
        C5448Sc c5448ScCopydefault = new C5448Sc().AEQbTJ(DecodeFormat.PREFER_RGB_565).copydefault(AbstractC5360Os.copydefault);
        Intrinsics.checkNotNullExpressionValue(c5448ScCopydefault, "");
        C5448Sc c5448Sc2 = c5448ScCopydefault;
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (C59449zhJ.endsWith$default(lowerCase, ".svg", false, 2, null)) {
            if (C59449zhJ.startsWith$default("SVG:" + str, "SVG:", false, 2, null)) {
                C5448Sc c5448ScAEQbTJ = c5448Sc2.copydefault(AbstractC5360Os.OLrzqt).AEQbTJ(DecodeFormat.PREFER_ARGB_8888);
                Intrinsics.copydefault(c5448ScAEQbTJ);
                c5448Sc = c5448ScAEQbTJ;
            } else {
                C5448Sc c5448ScCopydefault2 = c5448Sc2.copydefault(AbstractC5360Os.EZpvd);
                Intrinsics.copydefault(c5448ScCopydefault2);
                c5448Sc = c5448ScCopydefault2;
            }
            return c5448Sc;
        }
        java.util.Locale locale2 = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "");
        java.lang.String lowerCase2 = str.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        return StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase2, (java.lang.CharSequence) ".gif", false, 2, (java.lang.Object) null) ? c5448Sc2.copydefault(AbstractC5360Os.OLrzqt) : c5448Sc2;
    }
}
