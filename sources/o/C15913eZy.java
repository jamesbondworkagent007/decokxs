package o;

import android.view.View;
import androidx.camera.video.AudioStats;
import androidx.compose.material3.CalendarModelKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.wallet.core.formatter.WalletCurrencyBean;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eZy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15913eZy extends RecyclerView.ViewHolder {
    public final boolean AEQbTJ;
    public final C17170exj EZpvd;
    public final Function1<eWR, Unit> KWHzl;
    public final Function2<eWR, android.view.View, Unit> OLrzqt;
    public final Function1<eWR, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.eWR, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super o.eWR, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function2<? super o.eWR, ? super android.view.View, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15913eZy(@NotNull C17170exj c17170exj, boolean z, @NotNull Function1<? super eWR, Unit> function1, @NotNull Function1<? super eWR, Unit> function12, @NotNull Function2<? super eWR, ? super android.view.View, Unit> function2) {
        super(c17170exj.getRoot());
        Intrinsics.checkNotNullParameter(c17170exj, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.EZpvd = c17170exj;
        this.AEQbTJ = z;
        this.KWHzl = function1;
        this.copydefault = function12;
        this.OLrzqt = function2;
    }

    private final android.content.Context OLrzqt() {
        android.content.Context context = this.EZpvd.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return context;
    }

    public final void AEQbTJ(@NotNull final eWR ewr, boolean z) {
        Intrinsics.checkNotNullParameter(ewr, "");
        final C17170exj c17170exj = this.EZpvd;
        ShapeableImageView shapeableImageView = c17170exj.copydefault;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
        java.lang.String strAYXKKw = ewr.AYXKKw();
        int i = C52761wXj.TaskDescription.aHXSQp;
        int i2 = C52761wXj.Activity.zuBGHE;
        android.content.Context context = c17170exj.copydefault.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C14725dqq.loadFixSizeBorderImage$default(shapeableImageView, strAYXKKw, i, 1.0f, 32.0f, C33070mpX.OLrzqt(i2, context), false, 32, null);
        ShapeableImageView shapeableImageView2 = c17170exj.KWHzl;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView2, "");
        java.lang.String strCopydefault = ewr.copydefault();
        int i3 = C52761wXj.TaskDescription.aHXSQp;
        int i4 = C52761wXj.Activity.zuBGHE;
        android.content.Context context2 = c17170exj.KWHzl.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        C14725dqq.loadFixSizeBorderImage$default(shapeableImageView2, strCopydefault, i3, 1.0f, 16.0f, C33070mpX.OLrzqt(i4, context2), false, 32, null);
        android.widget.ImageView imageView = c17170exj.gEmmrt;
        if (ewr.isConnected()) {
            imageView.setVisibility(0);
            imageView.setOnClickListener(new TaskDescription(imageView, 1000L, this, ewr, imageView));
        } else {
            imageView.setVisibility(8);
            imageView.setOnClickListener(null);
        }
        try {
            c17170exj.AYXKKw.post(new java.lang.Runnable() { // from class: o.eZA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C15913eZy.EZpvd(c17170exj, this, ewr);
                }
            });
        } catch (java.lang.Exception unused) {
            c17170exj.AYXKKw.setText(ewr.djBIcL());
        }
        c17170exj.djBIcL.setText(copydefault(ewr.gEmmrt()));
        int iAEQbTJ = AEQbTJ(ewr.AkhnZx());
        c17170exj.DbNXlk.setTextColor(iAEQbTJ);
        c17170exj.fetchVPNInfo.setTextColor(iAEQbTJ);
        java.lang.String strDbNXlk = ewr.DbNXlk();
        java.lang.String strKWHzl = "--";
        if (!Intrinsics.EZpvd((java.lang.Object) strDbNXlk, (java.lang.Object) "--")) {
            strKWHzl = C54873xYm.formatPriceChangePercentage$default(C33129mqd.copydefault(strDbNXlk), 0, 0, false, null, null, 31, null);
        }
        android.widget.TextView textView = c17170exj.fetchVPNInfo;
        if (this.AEQbTJ) {
            strKWHzl = C13821dZn.EZpvd.KWHzl(strKWHzl);
        }
        textView.setText(strKWHzl);
        C10854bwM c10854bwMEZpvd = C10954byG.EZpvd.valueOf().EZpvd(ewr.AhwBna(), C33129mqd.valueOf(ewr.EZpvd()));
        java.lang.String largeValue$default = C54873xYm.formatLargeValue$default(C33129mqd.EZpvd(ewr.OLrzqt()), null, new WalletCurrencyBean(null, null, AudioStats.AUDIO_AMPLITUDE_NONE, 0, c10854bwMEZpvd != null ? c10854bwMEZpvd.AkhnZx() : 6, 15, null), CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY, null, true, 9, null);
        android.widget.TextView textView2 = c17170exj.values;
        if (this.AEQbTJ) {
            largeValue$default = C13821dZn.EZpvd.KWHzl(largeValue$default);
        }
        textView2.setText(largeValue$default);
        ConstraintLayout root = c17170exj.getRoot();
        root.setOnClickListener(new Activity(root, 1000L, this, ewr));
        android.widget.ImageView imageView2 = c17170exj.AEQbTJ;
        imageView2.setOnClickListener(new ActionBar(imageView2, 1000L, this, ewr));
        KWHzl(ewr, z);
    }

    public static final void EZpvd(C17170exj c17170exj, C15913eZy c15913eZy, eWR ewr) {
        int iCopydefault;
        int iCopydefault2;
        Intrinsics.copydefault(c17170exj.EZpvd.getParent(), "");
        float width = ((android.view.View) r0).getWidth() * 0.4f;
        android.widget.TextView textView = new android.widget.TextView(c15913eZy.OLrzqt());
        textView.setTextSize(7.0f);
        float fMeasureText = textView.getPaint().measureText(ewr.djBIcL());
        if (ewr.isConnected()) {
            iCopydefault = C55298xhM.copydefault(86.0f, c15913eZy.OLrzqt());
        } else {
            iCopydefault = C55298xhM.copydefault(64.0f, c15913eZy.OLrzqt());
        }
        ewr.isConnected();
        float f = iCopydefault;
        if (fMeasureText + f > width && (iCopydefault2 = C56548yJl.copydefault(C33129mqd.AhwBna(java.lang.Float.valueOf(width - f)), 0)) > 0 && c17170exj.AYXKKw.getMaxWidth() != iCopydefault2) {
            c17170exj.AYXKKw.setMaxWidth(iCopydefault2);
        }
        c17170exj.AYXKKw.setText(ewr.djBIcL());
    }

    /* JADX INFO: renamed from: o.eZy$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C15913eZy EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ eWR copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C15913eZy c15913eZy, eWR ewr) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c15913eZy;
            this.copydefault = ewr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.copydefault.invoke(this.copydefault);
            }
        }
    }

    /* JADX INFO: renamed from: o.eZy$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C15913eZy KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ eWR copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C15913eZy c15913eZy, eWR ewr) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = c15913eZy;
            this.copydefault = ewr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.KWHzl.invoke(this.copydefault);
            }
        }
    }

    /* JADX INFO: renamed from: o.eZy$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ eWR EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C15913eZy OLrzqt;
        public final /* synthetic */ android.widget.ImageView copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C15913eZy c15913eZy, eWR ewr, android.widget.ImageView imageView) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c15913eZy;
            this.EZpvd = ewr;
            this.copydefault = imageView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function2 function2 = this.OLrzqt.OLrzqt;
                eWR ewr = this.EZpvd;
                Intrinsics.copydefault(this.copydefault);
                function2.invoke(ewr, this.copydefault);
            }
        }
    }

    public final int AEQbTJ(java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "--")) {
            return ContextCompat.getColor(OLrzqt(), C52761wXj.Activity.QwvEab);
        }
        if (C33129mqd.OLrzqt((java.lang.Object) str, (java.lang.Object) 0)) {
            return ContextCompat.getColor(OLrzqt(), C52761wXj.Activity.fdOvFl);
        }
        return C33129mqd.AEQbTJ(str, 0) ? C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, OLrzqt(), 0.0f, 2, null) : C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, OLrzqt(), 0.0f, 2, null);
    }

    private final java.lang.String copydefault(java.lang.String str) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - C33129mqd.valueOf(str);
        if (jCurrentTimeMillis < 60000) {
            return C33069mpW.copydefault(C13754dXa.FragmentManager.DYICSh, C56423yEv.EZpvd(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, java.lang.String.valueOf(jCurrentTimeMillis / ((long) 1000)))));
        }
        if (jCurrentTimeMillis < 3600000) {
            return C33069mpW.copydefault(C13754dXa.FragmentManager.QUeTTI, C56423yEv.EZpvd(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, java.lang.String.valueOf(jCurrentTimeMillis / ((long) 60000)))));
        }
        if (jCurrentTimeMillis < CalendarModelKt.MillisecondsIn24Hours) {
            return C33069mpW.copydefault(C13754dXa.FragmentManager.RxVVQC, C56423yEv.EZpvd(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, java.lang.String.valueOf(jCurrentTimeMillis / ((long) 3600000)))));
        }
        return C33069mpW.copydefault(C13754dXa.FragmentManager.DLl, C56423yEv.EZpvd(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, java.lang.String.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS.toDays(jCurrentTimeMillis)))));
    }

    public final void KWHzl(@NotNull eWR ewr, boolean z) {
        java.lang.String strOLrzqt;
        java.lang.String strOLrzqt2;
        Intrinsics.checkNotNullParameter(ewr, "");
        C17170exj c17170exj = this.EZpvd;
        if (z) {
            strOLrzqt = C54880xYt.formatValuation$default(C33129mqd.EZpvd(ewr.AkhnZx()), 0, 0, DisplaySign.ALWAYS, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, null, false, 115, null);
        } else {
            java.lang.String strConvertToString$default = C54862xYb.convertToString$default(C54862xYb.divB$default(ewr.AkhnZx(), ewr.valueOf(), 0, null, 6, null), false, null, null, 7, null);
            DisplaySign displaySign = DisplaySign.ALWAYS;
            C10854bwM c10854bwMKWHzl = ewr.KWHzl();
            int iAkhnZx = c10854bwMKWHzl != null ? c10854bwMKWHzl.AkhnZx() : 6;
            C10854bwM c10854bwMKWHzl2 = ewr.KWHzl();
            strOLrzqt = C54870xYj.OLrzqt(strConvertToString$default, (249 & 1) != 0 ? 0 : 0, iAkhnZx, c10854bwMKWHzl2 != null ? c10854bwMKWHzl2.fJNWhG() : null, (249 & 8) != 0 ? DisplaySign.AUTO : displaySign, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
        }
        android.widget.TextView textView = c17170exj.DbNXlk;
        if (this.AEQbTJ) {
            strOLrzqt = C13821dZn.EZpvd.KWHzl(strOLrzqt);
        }
        textView.setText(strOLrzqt);
        if (z) {
            strOLrzqt2 = C54880xYt.formatValuation$default(C33129mqd.EZpvd(ewr.AEQbTJ()), 0, 0, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, null, false, 119, null);
        } else {
            java.lang.String strConvertToString$default2 = C54862xYb.convertToString$default(C54862xYb.divB$default(ewr.AEQbTJ(), ewr.valueOf(), 0, null, 6, null), false, null, null, 7, null);
            C10854bwM c10854bwMKWHzl3 = ewr.KWHzl();
            int iAkhnZx2 = c10854bwMKWHzl3 != null ? c10854bwMKWHzl3.AkhnZx() : 6;
            C10854bwM c10854bwMKWHzl4 = ewr.KWHzl();
            strOLrzqt2 = C54870xYj.OLrzqt(strConvertToString$default2, (249 & 1) != 0 ? 0 : 0, iAkhnZx2, c10854bwMKWHzl4 != null ? c10854bwMKWHzl4.fJNWhG() : null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
        }
        android.widget.TextView textView2 = c17170exj.valueOf;
        if (this.AEQbTJ) {
            strOLrzqt2 = C13821dZn.EZpvd.KWHzl(strOLrzqt2);
        }
        textView2.setText(strOLrzqt2);
    }
}
