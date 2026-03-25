package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material3.CalendarModelKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.localization.util.format.OKDateEnum;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import o.C52812wZg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.drz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14787drz extends RecyclerView.ViewHolder {
    public final Function1<C14738drC, Unit> AEQbTJ;
    public final C17172exl KWHzl;
    public boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.drC, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C14787drz(@NotNull C17172exl c17172exl, @NotNull Function1<? super C14738drC, Unit> function1) {
        super(c17172exl.getRoot());
        Intrinsics.checkNotNullParameter(c17172exl, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = c17172exl;
        this.AEQbTJ = function1;
    }

    private final android.content.Context OLrzqt() {
        android.content.Context context = this.KWHzl.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return context;
    }

    public final void OLrzqt(@NotNull C14738drC c14738drC) {
        int iTradeRiseDefault$default;
        java.lang.String valuation$default;
        Intrinsics.checkNotNullParameter(c14738drC, "");
        C17172exl c17172exl = this.KWHzl;
        ShapeableImageView shapeableImageView = c17172exl.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
        java.lang.String strOLrzqt = c14738drC.OLrzqt();
        int i = C52761wXj.TaskDescription.aHXSQp;
        int i2 = C52761wXj.Activity.zuBGHE;
        android.content.Context context = c17172exl.gEmmrt.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C14725dqq.loadFixSizeBorderImage$default(shapeableImageView, strOLrzqt, i, 1.0f, 32.0f, C33070mpX.OLrzqt(i2, context), false, 32, null);
        ShapeableImageView shapeableImageView2 = c17172exl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView2, "");
        java.lang.String strKWHzl = c14738drC.KWHzl();
        int i3 = C52761wXj.TaskDescription.aHXSQp;
        int i4 = C52761wXj.Activity.zuBGHE;
        android.content.Context context2 = c17172exl.AEQbTJ.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        C14725dqq.loadFixSizeBorderImage$default(shapeableImageView2, strKWHzl, i3, 1.0f, 16.0f, C33070mpX.OLrzqt(i4, context2), false, 32, null);
        c17172exl.AhwBna.setText(c14738drC.AYXKKw());
        android.widget.ImageView imageView = c17172exl.OLrzqt;
        if (c14738drC.AhwBna()) {
            imageView.setVisibility(0);
            imageView.setOnClickListener(new Application(imageView, 1000L, imageView));
        } else {
            imageView.setVisibility(8);
            imageView.setOnClickListener(null);
        }
        if (Intrinsics.EZpvd((java.lang.Object) c14738drC.djBIcL(), (java.lang.Object) "--")) {
            iTradeRiseDefault$default = ContextCompat.getColor(OLrzqt(), C52761wXj.Activity.QwvEab);
        } else if (C33129mqd.OLrzqt((java.lang.Object) c14738drC.djBIcL(), (java.lang.Object) 0)) {
            iTradeRiseDefault$default = ContextCompat.getColor(OLrzqt(), C52761wXj.Activity.fdOvFl);
        } else {
            iTradeRiseDefault$default = C33129mqd.AEQbTJ(c14738drC.djBIcL(), 0) ? C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, OLrzqt(), 0.0f, 2, null) : C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, OLrzqt(), 0.0f, 2, null);
        }
        android.widget.TextView textView = c17172exl.AYXKKw;
        if (this.OLrzqt) {
            valuation$default = C13821dZn.EZpvd.KWHzl(C54880xYt.formatValuation$default(C33129mqd.EZpvd(c14738drC.djBIcL()), 0, 0, DisplaySign.ALWAYS, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, null, false, 115, null));
        } else {
            valuation$default = C54880xYt.formatValuation$default(C33129mqd.EZpvd(c14738drC.djBIcL()), 0, 0, DisplaySign.ALWAYS, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, null, false, 115, null);
        }
        textView.setText(valuation$default);
        c17172exl.AYXKKw.setTextColor(iTradeRiseDefault$default);
        java.lang.String strValueOf = c14738drC.valueOf();
        java.lang.String priceChangePercentage$default = Intrinsics.EZpvd((java.lang.Object) strValueOf, (java.lang.Object) "--") ? "--" : C54873xYm.formatPriceChangePercentage$default(C33129mqd.copydefault(strValueOf), 0, 0, false, null, null, 31, null);
        android.widget.TextView textView2 = c17172exl.valueOf;
        if (this.OLrzqt) {
            priceChangePercentage$default = C13821dZn.EZpvd.KWHzl(priceChangePercentage$default);
        }
        textView2.setText(priceChangePercentage$default);
        c17172exl.djBIcL.setText(AEQbTJ(c14738drC.copydefault()));
        ConstraintLayout root = c17172exl.getRoot();
        root.setOnClickListener(new Activity(root, 1000L, this, c14738drC));
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        long jValueOf = C33129mqd.valueOf(str);
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - jValueOf;
        if (jCurrentTimeMillis < 60000) {
            return C33069mpW.copydefault(C13754dXa.FragmentManager.DYICSh, C56423yEv.EZpvd(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, java.lang.String.valueOf(jCurrentTimeMillis / ((long) 1000)))));
        }
        if (jCurrentTimeMillis < 3600000) {
            return C33069mpW.copydefault(C13754dXa.FragmentManager.QUeTTI, C56423yEv.EZpvd(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, java.lang.String.valueOf(jCurrentTimeMillis / ((long) 60000)))));
        }
        if (jCurrentTimeMillis < CalendarModelKt.MillisecondsIn24Hours) {
            return C33069mpW.copydefault(C13754dXa.FragmentManager.RxVVQC, C56423yEv.EZpvd(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, java.lang.String.valueOf(jCurrentTimeMillis / ((long) 3600000)))));
        }
        if (jCurrentTimeMillis < 604800000) {
            return C33069mpW.copydefault(C13754dXa.FragmentManager.DLl, C56423yEv.EZpvd(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, java.lang.String.valueOf(jCurrentTimeMillis / ((long) 86400000)))));
        }
        return xMM.formatDate$default(xMM.AEQbTJ, jValueOf, OKDateEnum.DATE_FORMAT_SIMPLE_MD, null, null, 12, null);
    }

    /* JADX INFO: renamed from: o.drz$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C14738drC KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C14787drz copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C14787drz c14787drz, C14738drC c14738drC) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = c14787drz;
            this.KWHzl = c14738drC;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.AEQbTJ.invoke(this.KWHzl);
            }
        }
    }

    /* JADX INFO: renamed from: o.drz$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.widget.ImageView AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, android.widget.ImageView imageView) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = imageView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.content.Context context = this.AEQbTJ.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                C52812wZg c52812wZg = new C52812wZg(context);
                Intrinsics.copydefault(this.AEQbTJ);
                C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(this.AEQbTJ);
                stateListAnimator.EZpvd(1);
                stateListAnimator.OLrzqt(this.AEQbTJ.getContext().getString(C13754dXa.FragmentManager.Size));
                c52812wZg.AEQbTJ(stateListAnimator);
                android.widget.TextView textViewValueOf = c52812wZg.valueOf();
                if (textViewValueOf != null) {
                    ViewGroup.LayoutParams layoutParams = textViewValueOf.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    float f = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
                    ViewGroup.LayoutParams layoutParams2 = textViewValueOf.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    float f2 = marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0;
                    ViewGroup.LayoutParams layoutParams3 = textViewValueOf.getLayoutParams();
                    C55296xhK.OLrzqt(textViewValueOf, java.lang.Float.valueOf(f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(f2), java.lang.Float.valueOf((layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null) != null ? r4.bottomMargin : 0));
                }
                c52812wZg.OLrzqt(0);
                c52812wZg.fARcdN();
            }
        }
    }
}
