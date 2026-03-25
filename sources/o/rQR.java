package o;

import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;
import com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelTag;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import com.okinc.ok_kyc_core.presentation.views.BackgroundStyle;
import com.okinc.ok_kyc_core.presentation.views.Icon;
import com.okinc.ok_kyc_core.presentation.views.LinkColor;
import com.okinc.ok_kyc_core.presentation.views.TextColor;
import com.okinc.ok_kyc_core.presentation.views.UnderLineColor;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class rQR {
    public static final rQR AEQbTJ = new rQR();

    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ViewStatus.values().length];
            try {
                iArr[ViewStatus.Cta.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ViewStatus.Result.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ViewStatus.Card.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[BackgroundStyle.values().length];
            try {
                iArr2[BackgroundStyle.CARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[BackgroundStyle.DEFAULT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            AEQbTJ = iArr2;
        }
    }

    private rQR() {
    }

    public final int AEQbTJ(@NotNull android.content.Context context, @NotNull ViewStatus viewStatus, java.lang.Float f) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(viewStatus, "");
        if (f != null) {
            return C55298xhM.copydefault(f.floatValue(), context);
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        int i = TaskDescription.KWHzl[viewStatus.ordinal()];
        if (i == 1 || i == 2) {
            context.getTheme().resolveAttribute(C43662rtX.Application.AEQbTJ, typedValue, true);
        } else if (i == 3) {
            context.getTheme().resolveAttribute(C43662rtX.Application.OLrzqt, typedValue, true);
        } else {
            context.getTheme().resolveAttribute(C43662rtX.Application.KWHzl, typedValue, true);
        }
        return android.util.TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
    }

    public final android.graphics.drawable.Drawable KWHzl(java.lang.String str, @NotNull C42519rVw c42519rVw) {
        Intrinsics.checkNotNullParameter(c42519rVw, "");
        if (str == null) {
            return null;
        }
        for (Icon icon : Icon.values()) {
            if (Intrinsics.EZpvd((java.lang.Object) icon.getNameValue(), (java.lang.Object) str)) {
                return c42519rVw.OLrzqt(icon.getImageId());
            }
        }
        return null;
    }

    public final int KWHzl(android.content.Context context) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (context.getTheme().resolveAttribute(C43662rtX.Application.valueOf, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    public final android.content.res.TypedArray AEQbTJ(android.content.Context context) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(KWHzl(context), C43662rtX.PendingIntent.copydefault);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        return typedArrayObtainStyledAttributes;
    }

    public final android.graphics.drawable.Drawable OLrzqt(@NotNull android.content.Context context, java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        if (str == null) {
            return null;
        }
        for (Icon icon : Icon.values()) {
            if (Intrinsics.EZpvd((java.lang.Object) icon.getNameValue(), (java.lang.Object) str)) {
                android.content.res.TypedArray typedArrayAEQbTJ = AEQbTJ.AEQbTJ(context);
                android.graphics.drawable.Drawable drawable = typedArrayAEQbTJ.getDrawable(icon.getImageId());
                typedArrayAEQbTJ.recycle();
                return drawable;
            }
        }
        return null;
    }

    public static /* synthetic */ int getTextColorResId$default(rQR rqr, java.lang.String str, TextColor textColor, C42519rVw c42519rVw, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            textColor = null;
        }
        return rqr.AEQbTJ(str, textColor, c42519rVw);
    }

    public final int AEQbTJ(java.lang.String str, TextColor textColor, @NotNull C42519rVw c42519rVw) {
        Intrinsics.checkNotNullParameter(c42519rVw, "");
        if (str != null) {
            for (TextColor textColor2 : TextColor.getEntries()) {
                if (Intrinsics.EZpvd((java.lang.Object) textColor2.getNameValue(), (java.lang.Object) str)) {
                    return c42519rVw.EZpvd(textColor2.getColorId());
                }
            }
        }
        return c42519rVw.EZpvd(textColor != null ? textColor.getColorId() : TextColor.BLACK.getColorId());
    }

    public final int AEQbTJ(java.lang.String str, @NotNull C42519rVw c42519rVw) {
        Intrinsics.checkNotNullParameter(c42519rVw, "");
        if (str != null) {
            for (TextColor textColor : TextColor.values()) {
                if (Intrinsics.EZpvd((java.lang.Object) textColor.getNameValue(), (java.lang.Object) str)) {
                    return c42519rVw.EZpvd(textColor.getColorId());
                }
            }
        }
        return c42519rVw.EZpvd(TextColor.BLACK.getColorId());
    }

    public final int AEQbTJ(@NotNull android.content.Context context, java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        if (str != null) {
            for (TextColor textColor : TextColor.values()) {
                if (Intrinsics.EZpvd((java.lang.Object) textColor.getNameValue(), (java.lang.Object) str)) {
                    android.content.res.TypedArray typedArrayAEQbTJ = AEQbTJ.AEQbTJ(context);
                    int color = typedArrayAEQbTJ.getColor(textColor.getColorId(), 0);
                    typedArrayAEQbTJ.recycle();
                    return color;
                }
            }
        }
        android.content.res.TypedArray typedArrayAEQbTJ2 = AEQbTJ(context);
        int color2 = typedArrayAEQbTJ2.getColor(TextColor.BLACK.getColorId(), 0);
        typedArrayAEQbTJ2.recycle();
        return color2;
    }

    public final java.lang.Integer OLrzqt(java.lang.String str, @NotNull C42519rVw c42519rVw) {
        Intrinsics.checkNotNullParameter(c42519rVw, "");
        if (str == null) {
            return null;
        }
        for (TextColor textColor : TextColor.values()) {
            if (Intrinsics.EZpvd((java.lang.Object) textColor.getNameValue(), (java.lang.Object) str)) {
                return java.lang.Integer.valueOf(c42519rVw.EZpvd(textColor.getColorId()));
            }
        }
        return null;
    }

    public final java.lang.Integer EZpvd(java.lang.String str, @NotNull C42519rVw c42519rVw) {
        Intrinsics.checkNotNullParameter(c42519rVw, "");
        if (str == null) {
            return null;
        }
        for (LinkColor linkColor : LinkColor.values()) {
            if (Intrinsics.EZpvd((java.lang.Object) linkColor.getNameValue(), (java.lang.Object) str)) {
                return java.lang.Integer.valueOf(c42519rVw.EZpvd(linkColor.getColorId()));
            }
        }
        return null;
    }

    public final java.lang.Integer AYXKKw(java.lang.String str, @NotNull C42519rVw c42519rVw) {
        Intrinsics.checkNotNullParameter(c42519rVw, "");
        if (str == null) {
            return null;
        }
        for (UnderLineColor underLineColor : UnderLineColor.values()) {
            if (Intrinsics.EZpvd((java.lang.Object) underLineColor.getNameValue(), (java.lang.Object) str)) {
                return java.lang.Integer.valueOf(c42519rVw.EZpvd(underLineColor.getColorId()));
            }
        }
        return null;
    }

    public final java.lang.Integer copydefault(java.lang.String str, @NotNull C42519rVw c42519rVw) {
        Intrinsics.checkNotNullParameter(c42519rVw, "");
        if (str == null) {
            return null;
        }
        for (TextColor textColor : TextColor.values()) {
            if (Intrinsics.EZpvd((java.lang.Object) textColor.getNameValue(), (java.lang.Object) str)) {
                return java.lang.Integer.valueOf(c42519rVw.EZpvd(textColor.getColorId()));
            }
        }
        return null;
    }

    public static /* synthetic */ void setupTag$default(rQR rqr, C55251xgS c55251xgS, HelperLabelTag helperLabelTag, java.lang.Integer num, android.graphics.drawable.Drawable drawable, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            drawable = null;
        }
        rqr.KWHzl(c55251xgS, helperLabelTag, num, drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [231=10] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(@NotNull C55251xgS c55251xgS, @NotNull HelperLabelTag helperLabelTag, java.lang.Integer num, android.graphics.drawable.Drawable drawable) {
        Intrinsics.checkNotNullParameter(c55251xgS, "");
        Intrinsics.checkNotNullParameter(helperLabelTag, "");
        java.lang.String content = helperLabelTag.getContent();
        if (content == null) {
            content = "";
        }
        c55251xgS.setText(content);
        c55251xgS.setTagIcon(drawable);
        c55251xgS.setShowIcon(drawable != null);
        java.lang.String size = helperLabelTag.getSize();
        if (size == null) {
            c55251xgS.setOKDSSize(-3);
        } else {
            int iHashCode = size.hashCode();
            if (iHashCode != 3451) {
                if (iHashCode != 3479) {
                    if (iHashCode == 3674 && size.equals("sm")) {
                        c55251xgS.setOKDSSize(-5);
                    }
                } else if (size.equals("md")) {
                    c55251xgS.setOKDSSize(-4);
                }
            } else if (size.equals("lg")) {
                c55251xgS.setOKDSSize(-3);
            }
        }
        java.lang.String style = helperLabelTag.getStyle();
        if (style != null) {
            switch (style.hashCode()) {
                case -1363407290:
                    if (!style.equals("statusCancled")) {
                        c55251xgS.setOKDSStyle(6);
                    } else {
                        c55251xgS.setOKDSStyle(11);
                    }
                    break;
                case -933793099:
                    if (style.equals("marketRed")) {
                        c55251xgS.setOKDSStyle(13);
                        break;
                    }
                    break;
                case -517090709:
                    if (style.equals("featureDefault")) {
                        c55251xgS.setOKDSStyle(7);
                        break;
                    }
                    break;
                case -69308043:
                    if (style.equals("statusNeutral")) {
                        c55251xgS.setOKDSStyle(12);
                        break;
                    }
                    break;
                case 263229479:
                    if (style.equals("marketGreen")) {
                        c55251xgS.setOKDSStyle(14);
                        break;
                    }
                    break;
                case 514167729:
                    if (style.equals("statusSuccess")) {
                        c55251xgS.setOKDSStyle(8);
                        break;
                    }
                    break;
                case 610842467:
                    if (style.equals("categoryDefault")) {
                        c55251xgS.setOKDSStyle(6);
                        break;
                    }
                    break;
                case 1571744053:
                    if (style.equals("categoryStrong")) {
                        C55279xgu c55279xgu = new C55279xgu();
                        android.content.Context context = c55251xgS.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        c55279xgu.OLrzqt(C55298xhM.EZpvd(4.0f, context));
                        c55279xgu.isConnected(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                        android.content.Context context2 = c55251xgS.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "");
                        c55279xgu.fIwbmz(C55298xhM.KWHzl(0.5f, context2));
                        c55279xgu.KWHzl(C33070mpX.AEQbTJ(C52761wXj.Activity.htlTjW));
                        new C55280xgv().KWHzl(c55251xgS, c55279xgu);
                        break;
                    }
                    break;
                case 1698749765:
                    if (style.equals("statusPending")) {
                        c55251xgS.setOKDSStyle(10);
                        break;
                    }
                    break;
                case 1704334031:
                    if (style.equals("statusFailed")) {
                        c55251xgS.setOKDSStyle(9);
                        break;
                    }
                    break;
            }
        }
        c55251xgS.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        C55296xhK.OLrzqt(c55251xgS, java.lang.Float.valueOf(C33129mqd.djBIcL(java.lang.Integer.valueOf(num != null ? num.intValue() : 6))), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(12.0f), java.lang.Float.valueOf(0.0f));
    }

    public final void EZpvd(@NotNull android.content.Context context, @NotNull android.view.View view, java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(view, "");
        int i = TaskDescription.AEQbTJ[BackgroundStyle.Companion.KWHzl(str).ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(C33070mpX.copydefault(C52761wXj.Activity.invokespecialDPHOMC));
        gradientDrawable.setCornerRadius(C55298xhM.EZpvd(8.0f, context));
        view.setBackground(gradientDrawable);
        view.setPadding(32, 32, 32, 32);
    }
}
