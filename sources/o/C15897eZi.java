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
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eZi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15897eZi extends RecyclerView.ViewHolder {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final boolean AEQbTJ;
    public final Function1<eWM, Unit> KWHzl;
    public final C16702eos OLrzqt;
    public final Function2<eWM, android.view.View, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.eWM, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function2<? super o.eWM, ? super android.view.View, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15897eZi(@NotNull C16702eos c16702eos, boolean z, @NotNull Function1<? super eWM, Unit> function1, @NotNull Function2<? super eWM, ? super android.view.View, Unit> function2) {
        super(c16702eos.getRoot());
        Intrinsics.checkNotNullParameter(c16702eos, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.OLrzqt = c16702eos;
        this.AEQbTJ = z;
        this.KWHzl = function1;
        this.copydefault = function2;
    }

    /* JADX INFO: renamed from: o.eZi$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eZi.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    private final android.content.Context OLrzqt() {
        android.content.Context context = this.OLrzqt.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return context;
    }

    public final void EZpvd(@NotNull final eWM ewm, boolean z) {
        java.lang.String largeValue$default;
        Intrinsics.checkNotNullParameter(ewm, "");
        final C16702eos c16702eos = this.OLrzqt;
        ShapeableImageView shapeableImageView = c16702eos.copydefault;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
        java.lang.String strGEmmrt = ewm.gEmmrt();
        int i = C52761wXj.TaskDescription.aHXSQp;
        int i2 = C52761wXj.Activity.zuBGHE;
        android.content.Context context = c16702eos.copydefault.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C14725dqq.loadFixSizeBorderImage$default(shapeableImageView, strGEmmrt, i, 1.0f, 32.0f, C33070mpX.OLrzqt(i2, context), false, 32, null);
        ShapeableImageView shapeableImageView2 = c16702eos.KWHzl;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView2, "");
        java.lang.String strCopydefault = ewm.copydefault();
        int i3 = C52761wXj.TaskDescription.aHXSQp;
        int i4 = C52761wXj.Activity.zuBGHE;
        android.content.Context context2 = c16702eos.KWHzl.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        C14725dqq.loadFixSizeBorderImage$default(shapeableImageView2, strCopydefault, i3, 1.0f, 16.0f, C33070mpX.OLrzqt(i4, context2), false, 32, null);
        android.widget.ImageView imageView = c16702eos.EZpvd;
        if (ewm.AkhnZx()) {
            imageView.setVisibility(0);
            imageView.setOnClickListener(new Activity(imageView, 1000L, this, ewm, imageView));
        } else {
            imageView.setVisibility(8);
            imageView.setOnClickListener(null);
        }
        try {
            c16702eos.AYXKKw.post(new java.lang.Runnable() { // from class: o.eZh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C15897eZi.copydefault(c16702eos, this, ewm);
                }
            });
        } catch (java.lang.Exception unused) {
            c16702eos.AYXKKw.setText(ewm.djBIcL());
        }
        int iAEQbTJ = AEQbTJ(ewm.values());
        KWHzl(ewm, z);
        c16702eos.values.setTextColor(iAEQbTJ);
        android.widget.TextView textView = c16702eos.valueOf;
        if (ewm.AEQbTJ().length() == 0) {
            largeValue$default = "--";
        } else {
            BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(ewm.AEQbTJ());
            C10854bwM c10854bwMOLrzqt = ewm.OLrzqt();
            largeValue$default = C54873xYm.formatLargeValue$default(bigDecimalEZpvd, null, new WalletCurrencyBean(null, null, AudioStats.AUDIO_AMPLITUDE_NONE, 0, c10854bwMOLrzqt != null ? c10854bwMOLrzqt.AkhnZx() : 6, 15, null), CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY, null, true, 9, null);
        }
        textView.setText(largeValue$default);
        android.widget.TextView textView2 = c16702eos.AkhnZx;
        textView2.setText(copydefault(ewm.values()));
        textView2.setTextColor(iAEQbTJ);
        c16702eos.AhwBna.setText(KWHzl(ewm.KWHzl()));
        if (ewm.AkhnZx()) {
            return;
        }
        ConstraintLayout root = c16702eos.getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, this, ewm));
    }

    public static final void copydefault(C16702eos c16702eos, C15897eZi c15897eZi, eWM ewm) {
        int iCopydefault;
        Intrinsics.copydefault(c16702eos.AEQbTJ.getParent(), "");
        float width = ((android.view.View) r0).getWidth() * 0.4f;
        android.widget.TextView textView = new android.widget.TextView(c15897eZi.OLrzqt());
        textView.setTextSize(7.0f);
        float fMeasureText = textView.getPaint().measureText(ewm.djBIcL());
        float fCopydefault = C55298xhM.copydefault(64.0f, c15897eZi.OLrzqt());
        if (fMeasureText + fCopydefault > width && (iCopydefault = C56548yJl.copydefault(C33129mqd.AhwBna(java.lang.Float.valueOf(width - fCopydefault)), 0)) > 0 && c16702eos.AYXKKw.getMaxWidth() != iCopydefault) {
            c16702eos.AYXKKw.setMaxWidth(iCopydefault);
        }
        c16702eos.AYXKKw.setText(ewm.djBIcL());
    }

    /* JADX INFO: renamed from: o.eZi$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ eWM KWHzl;
        public final /* synthetic */ android.widget.ImageView OLrzqt;
        public final /* synthetic */ C15897eZi copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C15897eZi c15897eZi, eWM ewm, android.widget.ImageView imageView) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = c15897eZi;
            this.KWHzl = ewm;
            this.OLrzqt = imageView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Function2 function2 = this.copydefault.copydefault;
                eWM ewm = this.KWHzl;
                Intrinsics.copydefault(this.OLrzqt);
                function2.invoke(ewm, this.OLrzqt);
            }
        }
    }

    /* JADX INFO: renamed from: o.eZi$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ eWM AEQbTJ;
        public final /* synthetic */ C15897eZi EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C15897eZi c15897eZi, eWM ewm) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c15897eZi;
            this.AEQbTJ = ewm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.KWHzl.invoke(this.AEQbTJ);
            }
        }
    }

    public final java.lang.String copydefault(int i) {
        if (i == 1) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.Discouraged);
        }
        if (i == 2) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.DoNotInline);
        }
        if (i != 3) {
            return i != 4 ? "--" : C33070mpX.AYXKKw(C13754dXa.FragmentManager.DimensionCompanion);
        }
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.unit);
    }

    public final int AEQbTJ(int i) {
        if (i == 1) {
            return C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, OLrzqt(), 0.0f, 2, null);
        }
        if (i == 2) {
            return C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, OLrzqt(), 0.0f, 2, null);
        }
        return ContextCompat.getColor(OLrzqt(), C52761wXj.Activity.fdOvFl);
    }

    public final java.lang.String KWHzl(long j) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - j;
        if (jCurrentTimeMillis < 60000) {
            return C33069mpW.copydefault(C13754dXa.FragmentManager.DYICSh, C56423yEv.EZpvd(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, java.lang.String.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis)))));
        }
        if (jCurrentTimeMillis < 3600000) {
            return C33069mpW.copydefault(C13754dXa.FragmentManager.QUeTTI, C56423yEv.EZpvd(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, java.lang.String.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(jCurrentTimeMillis)))));
        }
        if (jCurrentTimeMillis < CalendarModelKt.MillisecondsIn24Hours) {
            return C33069mpW.copydefault(C13754dXa.FragmentManager.RxVVQC, C56423yEv.EZpvd(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, java.lang.String.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS.toHours(jCurrentTimeMillis)))));
        }
        return C33069mpW.copydefault(C13754dXa.FragmentManager.DLl, C56423yEv.EZpvd(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, java.lang.String.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS.toDays(jCurrentTimeMillis)))));
    }

    public final void KWHzl(@NotNull eWM ewm, boolean z) {
        java.lang.String strOLrzqt;
        Intrinsics.checkNotNullParameter(ewm, "");
        C16702eos c16702eos = this.OLrzqt;
        java.lang.String strOLrzqt2 = "--";
        if (ewm.AYXKKw().length() == 0) {
            strOLrzqt = "--";
        } else if (z) {
            strOLrzqt = C54880xYt.formatValuation$default(C33129mqd.EZpvd(ewm.AYXKKw()), 0, 0, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, null, false, 119, null);
        } else {
            java.lang.String strConvertToString$default = C54862xYb.convertToString$default(C54862xYb.divB$default(ewm.AYXKKw(), ewm.EZpvd(), 0, null, 6, null), false, null, null, 7, null);
            C10854bwM c10854bwMOLrzqt = ewm.OLrzqt();
            int iAkhnZx = c10854bwMOLrzqt != null ? c10854bwMOLrzqt.AkhnZx() : 6;
            C10854bwM c10854bwMOLrzqt2 = ewm.OLrzqt();
            strOLrzqt = C54870xYj.OLrzqt(strConvertToString$default, (249 & 1) != 0 ? 0 : 0, iAkhnZx, c10854bwMOLrzqt2 != null ? c10854bwMOLrzqt2.fJNWhG() : null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
        }
        android.widget.TextView textView = c16702eos.values;
        if (this.AEQbTJ) {
            strOLrzqt = C13821dZn.EZpvd.KWHzl(strOLrzqt);
        }
        textView.setText(strOLrzqt);
        if (ewm.AhwBna().length() != 0) {
            if (z) {
                strOLrzqt2 = C54872xYl.formatCoinPrice$default(C33129mqd.EZpvd(ewm.AhwBna()), null, false, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, 21, null);
            } else {
                java.lang.String strConvertToString$default2 = C54862xYb.convertToString$default(C54862xYb.divB$default(ewm.AhwBna(), ewm.EZpvd(), 0, null, 6, null), false, null, null, 7, null);
                C10854bwM c10854bwMOLrzqt3 = ewm.OLrzqt();
                int iAkhnZx2 = c10854bwMOLrzqt3 != null ? c10854bwMOLrzqt3.AkhnZx() : 6;
                C10854bwM c10854bwMOLrzqt4 = ewm.OLrzqt();
                strOLrzqt2 = C54870xYj.OLrzqt(strConvertToString$default2, (249 & 1) != 0 ? 0 : 0, iAkhnZx2, c10854bwMOLrzqt4 != null ? c10854bwMOLrzqt4.fJNWhG() : null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
            }
        }
        c16702eos.djBIcL.setText(strOLrzqt2);
    }
}
