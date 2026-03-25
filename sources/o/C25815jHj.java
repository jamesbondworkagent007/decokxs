package o;

import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.business.market.data.model.alert.AlertDataUiItem;
import com.okinc.business.market.data.model.alert.AlertPromptType;
import com.okinc.business.market.data.model.alert.AlertRepeatType;
import com.okinc.business.market.data.model.alert.AlertType;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C22366hdx;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jHj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25815jHj extends RecyclerView.ViewHolder {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final android.view.ViewGroup AEQbTJ;
    public final C22328hdL OLrzqt;

    /* JADX INFO: renamed from: o.jHj$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AlertPromptType.values().length];
            try {
                iArr[AlertPromptType.PRICE_REACHES.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AlertPromptType.PRICE_MOVE_ABOVE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[AlertPromptType.GAIN_EXCEEDS_5MIN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[AlertPromptType.GAIN_EXCEEDS_1H.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[AlertPromptType.GAIN_EXCEEDS_4H.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[AlertPromptType.GAIN_EXCEEDS_24H.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[AlertPromptType.PRICE_MOVE_BELOW.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[AlertPromptType.LOSS_EXCEEDS_5MIN.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[AlertPromptType.LOSS_EXCEEDS_1H.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[AlertPromptType.LOSS_EXCEEDS_4H.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[AlertPromptType.LOSS_EXCEEDS_24H.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[AlertRepeatType.values().length];
            try {
                iArr2[AlertRepeatType.REPEAT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr2[AlertRepeatType.ONCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            OLrzqt = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C22328hdL KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.view.ViewGroup copydefault() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25815jHj(@NotNull C22328hdL c22328hdL, @NotNull android.view.ViewGroup viewGroup) {
        super(c22328hdL.getRoot());
        Intrinsics.checkNotNullParameter(c22328hdL, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        this.OLrzqt = c22328hdL;
        this.AEQbTJ = viewGroup;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(@NotNull AlertDataUiItem alertDataUiItem) {
        android.graphics.drawable.Drawable drawableKWHzl;
        Intrinsics.checkNotNullParameter(alertDataUiItem, "");
        C22328hdL c22328hdL = this.OLrzqt;
        c22328hdL.getRoot().KWHzl(C55296xhK.AEQbTJ(this.AEQbTJ));
        c22328hdL.getRoot().AEQbTJ(!alertDataUiItem.AYXKKw());
        c22328hdL.AEQbTJ.setImageDrawable(OLrzqt(alertDataUiItem.copydefault()));
        android.widget.TextView textView = c22328hdL.AYXKKw;
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView.setText(EZpvd(context, alertDataUiItem.copydefault(), alertDataUiItem.djBIcL(), alertDataUiItem.AEQbTJ()));
        c22328hdL.valueOf.setText(AEQbTJ(alertDataUiItem.valueOf()));
        if (alertDataUiItem.AYXKKw()) {
            android.widget.ImageView imageView = c22328hdL.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            C55239xgG c55239xgG = c22328hdL.AhwBna;
            Intrinsics.checkNotNullExpressionValue(c55239xgG, "");
            c55239xgG.setVisibility(8);
            android.widget.ImageView imageView2 = c22328hdL.KWHzl;
            if (alertDataUiItem.fetchVPNInfo()) {
                drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.gqESXP);
                if (drawableKWHzl != null) {
                    drawableKWHzl.setTint(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
                } else {
                    drawableKWHzl = null;
                }
            } else {
                drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.QqiRNA);
                if (drawableKWHzl != null) {
                    drawableKWHzl.setTint(C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
                }
            }
            imageView2.setImageDrawable(drawableKWHzl);
            return;
        }
        android.widget.ImageView imageView3 = c22328hdL.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView3, "");
        imageView3.setVisibility(8);
        C55239xgG c55239xgG2 = c22328hdL.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c55239xgG2, "");
        c55239xgG2.setVisibility(0);
        c22328hdL.AhwBna.setChecked(alertDataUiItem.EZpvd());
    }

    public final android.graphics.drawable.Drawable OLrzqt(AlertPromptType alertPromptType) {
        android.content.Context context = this.OLrzqt.getRoot().getContext();
        switch (StateListAnimator.KWHzl[alertPromptType.ordinal()]) {
            case 1:
                android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.onProviderDisabled);
                if (drawableKWHzl != null) {
                    drawableKWHzl.setTint(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
                    return drawableKWHzl;
                }
                return null;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                android.graphics.drawable.Drawable drawableKWHzl2 = C33070mpX.KWHzl(C52761wXj.TaskDescription.QOeQqh);
                if (drawableKWHzl2 != null) {
                    int i = C52761wXj.ActionBar.Ufzxmz;
                    Intrinsics.copydefault(context);
                    drawableKWHzl2.setTint(C25382ivf.copydefault(i, context));
                    return drawableKWHzl2;
                }
                return null;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                android.graphics.drawable.Drawable drawableKWHzl3 = C33070mpX.KWHzl(C52761wXj.TaskDescription.nriSR);
                if (drawableKWHzl3 != null) {
                    int i2 = C52761wXj.ActionBar.OJuSTm;
                    Intrinsics.copydefault(context);
                    drawableKWHzl3.setTint(C25382ivf.copydefault(i2, context));
                    return drawableKWHzl3;
                }
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final java.lang.String EZpvd(android.content.Context context, AlertPromptType alertPromptType, java.lang.String str, AlertType alertType) {
        switch (StateListAnimator.KWHzl[alertPromptType.ordinal()]) {
            case 1:
                if (alertType == AlertType.PRICE) {
                    return C33069mpW.KWHzl(context, C22366hdx.StateListAnimator.zLjUOn, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, EZpvd(str))));
                }
                return C33069mpW.KWHzl(context, C22366hdx.StateListAnimator.uzCIH, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, EZpvd(str))));
            case 2:
                if (alertType == AlertType.PRICE) {
                    return C33069mpW.KWHzl(context, C22366hdx.StateListAnimator.getFieldNames, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, EZpvd(str))));
                }
                return C33069mpW.KWHzl(context, C22366hdx.StateListAnimator.fIwbmz, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, EZpvd(str))));
            case 3:
                return C33069mpW.KWHzl(context, C22366hdx.StateListAnimator.wlaJM, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, C33070mpX.AYXKKw(C23274hvD.Fragment.DuQ)), C56390yDp.OLrzqt("percentage", KWHzl(str))));
            case 4:
                return C33069mpW.KWHzl(context, C22366hdx.StateListAnimator.wlaJM, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, C33070mpX.AYXKKw(C23274hvD.Fragment.sSi)), C56390yDp.OLrzqt("percentage", KWHzl(str))));
            case 5:
                return C33069mpW.KWHzl(context, C22366hdx.StateListAnimator.wlaJM, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, C33070mpX.AYXKKw(C23274hvD.Fragment.ZGRCNj)), C56390yDp.OLrzqt("percentage", KWHzl(str))));
            case 6:
                return C33069mpW.KWHzl(context, C22366hdx.StateListAnimator.wlaJM, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, C33070mpX.AYXKKw(C23274hvD.Fragment.ZNPcth)), C56390yDp.OLrzqt("percentage", KWHzl(str))));
            case 7:
                if (alertType == AlertType.PRICE) {
                    return C33069mpW.KWHzl(context, C22366hdx.StateListAnimator.getNewProxyInstance, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, EZpvd(str))));
                }
                return C33069mpW.KWHzl(context, C22366hdx.StateListAnimator.hDKMBd, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, EZpvd(str))));
            case 8:
                return C33069mpW.KWHzl(context, C22366hdx.StateListAnimator.zsXlph, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, C33070mpX.AYXKKw(C23274hvD.Fragment.DuQ)), C56390yDp.OLrzqt("percentage", KWHzl(str))));
            case 9:
                return C33069mpW.KWHzl(context, C22366hdx.StateListAnimator.zsXlph, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, C33070mpX.AYXKKw(C23274hvD.Fragment.sSi)), C56390yDp.OLrzqt("percentage", KWHzl(str))));
            case 10:
                return C33069mpW.KWHzl(context, C22366hdx.StateListAnimator.zsXlph, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, C33070mpX.AYXKKw(C23274hvD.Fragment.ZGRCNj)), C56390yDp.OLrzqt("percentage", KWHzl(str))));
            case 11:
                return C33069mpW.KWHzl(context, C22366hdx.StateListAnimator.zsXlph, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, C33070mpX.AYXKKw(C23274hvD.Fragment.ZNPcth)), C56390yDp.OLrzqt("percentage", KWHzl(str))));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        return C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str, true, RoundingMode.DOWN, false, false, false, false, null, false, false, 496, null);
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        return C23311hvo.formatPercent$default(C23313hvq.divCheckS$default(str, "100", null, null, null, 14, null), false, 0, 0, null, null, 31, null);
    }

    public final java.lang.String AEQbTJ(AlertRepeatType alertRepeatType) {
        int i = StateListAnimator.OLrzqt[alertRepeatType.ordinal()];
        if (i == 1) {
            return C33070mpX.AYXKKw(C22366hdx.StateListAnimator.AhwBna);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return C33070mpX.AYXKKw(C22366hdx.StateListAnimator.copydefault);
    }

    /* JADX INFO: renamed from: o.jHj$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jHj.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C25815jHj KWHzl(@NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C22328hdL c22328hdLAEQbTJ = C22328hdL.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c22328hdLAEQbTJ, "");
            return new C25815jHj(c22328hdLAEQbTJ, viewGroup);
        }
    }
}
