package com.okinc.business.dexui.main.market.detail.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.okinc.business.dexui.main.market.detail.widget.KLineSimpleView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C21949hSh;
import o.C23271hvA;
import o.C23274hvD;
import o.C23420hxr;
import o.C24335ibr;
import o.C24337ibt;
import o.C25323iuZ;
import o.C32866mlf;
import o.C33050mpD;
import o.C33070mpX;
import o.C33129mqd;
import o.C54984xbQ;
import o.C55113xdn;
import o.C55296xhK;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.RunnableC24336ibs;
import o.RunnableC24338ibu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class KLineSimpleView extends ConstraintLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public C23420hxr AEQbTJ;
    public String AYXKKw;
    public Activity AhwBna;
    public boolean EZpvd;
    public RunnableC24336ibs KWHzl;
    public Object copydefault;
    public String djBIcL;
    public RunnableC24338ibu gEmmrt;
    public String valueOf;

    public interface Activity {
        void EZpvd(@NotNull String str);

        void KWHzl(@NotNull String str, @NotNull String str2, boolean z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnKlineTouchCallback(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.AhwBna = activity;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexui.main.market.detail.widget.KLineSimpleView.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KLineSimpleView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KLineSimpleView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineSimpleView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.djBIcL = "default_trade";
        this.copydefault = new Object();
        this.valueOf = "";
        this.AYXKKw = "";
        gEmmrt();
    }

    private final void gEmmrt() {
        C23420hxr c23420hxrOLrzqt = C23420hxr.OLrzqt(LayoutInflater.from(getContext()), this);
        this.AEQbTJ = c23420hxrOLrzqt;
        if (c23420hxrOLrzqt != null) {
            TextView textView = c23420hxrOLrzqt.EZpvd;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            this.KWHzl = new RunnableC24336ibs(textView);
            TextView textView2 = c23420hxrOLrzqt.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            this.gEmmrt = new RunnableC24338ibu(textView2);
        }
    }

    public final void AEQbTJ(@NotNull String str, boolean z) {
        YAxis axisRight;
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = z;
        C23420hxr c23420hxr = this.AEQbTJ;
        if (c23420hxr != null) {
            c23420hxr.valueOf.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.KDccX));
            c23420hxr.AYXKKw.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.fHqPtx));
            c23420hxr.djBIcL.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.DcqEDu));
        }
        this.djBIcL = str;
        EZpvd("1");
        C23420hxr c23420hxr2 = this.AEQbTJ;
        if (c23420hxr2 != null && (axisRight = c23420hxr2.AEQbTJ.getAxisRight()) != null) {
            axisRight.setEnabled(false);
        }
        KWHzl();
        AhwBna();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(String str) {
        C23420hxr c23420hxr = this.AEQbTJ;
        if (c23420hxr != null) {
            c23420hxr.valueOf.setSelected(false);
            c23420hxr.djBIcL.setSelected(false);
            c23420hxr.AYXKKw.setSelected(false);
            c23420hxr.valueOf.setSelectedStyle(false, 1);
            c23420hxr.djBIcL.setSelectedStyle(false, 1);
            c23420hxr.AYXKKw.setSelectedStyle(false, 1);
            if (Intrinsics.EZpvd((Object) str, (Object) "1")) {
                c23420hxr.valueOf.setSelected(true);
                c23420hxr.valueOf.setSelectedStyle(true, 1);
                copydefault("24h");
            } else if (Intrinsics.EZpvd((Object) str, (Object) "2")) {
                c23420hxr.AYXKKw.setSelected(true);
                c23420hxr.AYXKKw.setSelectedStyle(true, 1);
                copydefault("1w");
            } else {
                c23420hxr.djBIcL.setSelected(true);
                c23420hxr.djBIcL.setSelectedStyle(true, 1);
                copydefault("1m");
            }
        }
    }

    private final void AhwBna() {
        final C23420hxr c23420hxr = this.AEQbTJ;
        if (c23420hxr != null) {
            C24337ibt c24337ibt = c23420hxr.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c24337ibt, "");
            c24337ibt.setOnMaxPointDrawListener(new Function2() { // from class: o.hTd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return KLineSimpleView.copydefault(c23420hxr, this, ((java.lang.Float) obj).floatValue(), (PointF) obj2);
                }
            });
            c24337ibt.setOnMinPointDrawListener(new Function2() { // from class: o.hTg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return KLineSimpleView.AEQbTJ(c23420hxr, this, ((java.lang.Float) obj).floatValue(), (PointF) obj2);
                }
            });
            c23420hxr.AEQbTJ.setSelectCallback(new Function2() { // from class: o.hTc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return KLineSimpleView.EZpvd(this.EZpvd, (java.lang.String) obj, (java.lang.String) obj2);
                }
            });
            c23420hxr.AhwBna.setRetryClick(new Function0() { // from class: o.hTf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return KLineSimpleView.EZpvd(this.copydefault);
                }
            });
            C54984xbQ c54984xbQ = c23420hxr.AYXKKw;
            c54984xbQ.setOnClickListener(new ActionBar(c54984xbQ, 1000L, this));
            C54984xbQ c54984xbQ2 = c23420hxr.valueOf;
            c54984xbQ2.setOnClickListener(new Application(c54984xbQ2, 1000L, this));
            C54984xbQ c54984xbQ3 = c23420hxr.djBIcL;
            c54984xbQ3.setOnClickListener(new TaskDescription(c54984xbQ3, 1000L, this));
        }
    }

    public static final Unit copydefault(C23420hxr c23420hxr, KLineSimpleView kLineSimpleView, float f, PointF pointF) {
        Intrinsics.checkNotNullParameter(pointF, "");
        c23420hxr.EZpvd.setText(kLineSimpleView.KWHzl(kLineSimpleView.AYXKKw.length() == 0 ? String.valueOf(f) : kLineSimpleView.AYXKKw));
        RunnableC24336ibs runnableC24336ibs = kLineSimpleView.KWHzl;
        if (runnableC24336ibs != null) {
            runnableC24336ibs.KWHzl(pointF);
        }
        c23420hxr.EZpvd.post(kLineSimpleView.KWHzl);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C23420hxr c23420hxr, KLineSimpleView kLineSimpleView, float f, PointF pointF) {
        Intrinsics.checkNotNullParameter(pointF, "");
        c23420hxr.copydefault.setText(kLineSimpleView.KWHzl(kLineSimpleView.valueOf.length() == 0 ? String.valueOf(f) : kLineSimpleView.valueOf));
        RunnableC24338ibu runnableC24338ibu = kLineSimpleView.gEmmrt;
        if (runnableC24338ibu != null) {
            runnableC24338ibu.OLrzqt(pointF);
        }
        c23420hxr.copydefault.post(kLineSimpleView.gEmmrt);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(KLineSimpleView kLineSimpleView, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (C33129mqd.OLrzqt((CharSequence) str2)) {
            Activity activity = kLineSimpleView.AhwBna;
            if (activity != null) {
                activity.KWHzl(str2, str, true);
            }
        } else {
            Activity activity2 = kLineSimpleView.AhwBna;
            if (activity2 != null) {
                activity2.KWHzl("", str, false);
            }
        }
        kLineSimpleView.AEQbTJ();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(KLineSimpleView kLineSimpleView) {
        Activity activity = kLineSimpleView.AhwBna;
        if (activity != null) {
            activity.EZpvd(kLineSimpleView.OLrzqt());
        }
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ KLineSimpleView KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(View view, long j, KLineSimpleView kLineSimpleView) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = kLineSimpleView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.EZpvd(((C54984xbQ) this.EZpvd).getTag().toString());
                Activity activity = this.KWHzl.AhwBna;
                if (activity != null) {
                    activity.EZpvd(this.KWHzl.OLrzqt());
                }
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ KLineSimpleView AEQbTJ;
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, KLineSimpleView kLineSimpleView) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = kLineSimpleView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.EZpvd(((C54984xbQ) this.KWHzl).getTag().toString());
                Activity activity = this.AEQbTJ.AhwBna;
                if (activity != null) {
                    activity.EZpvd(this.AEQbTJ.OLrzqt());
                }
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ KLineSimpleView copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(View view, long j, KLineSimpleView kLineSimpleView) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = kLineSimpleView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.EZpvd(((C54984xbQ) this.KWHzl).getTag().toString());
                Activity activity = this.copydefault.AhwBna;
                if (activity != null) {
                    activity.EZpvd(this.copydefault.OLrzqt());
                }
            }
        }
    }

    public final void KWHzl() {
        C55113xdn c55113xdn;
        EZpvd();
        C23420hxr c23420hxr = this.AEQbTJ;
        if (c23420hxr == null || (c55113xdn = c23420hxr.gEmmrt) == null) {
            return;
        }
        C25323iuZ.AEQbTJ(c55113xdn);
    }

    public final void copydefault() {
        C55113xdn c55113xdn;
        C23420hxr c23420hxr = this.AEQbTJ;
        if (c23420hxr == null || (c55113xdn = c23420hxr.gEmmrt) == null) {
            return;
        }
        C25323iuZ.EZpvd(c55113xdn);
    }

    public static /* synthetic */ void updateKlineView$default(KLineSimpleView kLineSimpleView, KlineState klineState, String str, String str2, Triple triple, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        kLineSimpleView.EZpvd(klineState, str, str2, (Triple<? extends ArrayList<Entry>, Pair<Float, Float>, Pair<String, String>>) triple);
    }

    public final void EZpvd(@NotNull KlineState klineState, @NotNull String str, @NotNull String str2, Triple<? extends ArrayList<Entry>, Pair<Float, Float>, Pair<String, String>> triple) {
        ArrayList<Entry> first;
        Intrinsics.checkNotNullParameter(klineState, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AYXKKw = str;
        this.valueOf = str2;
        C23420hxr c23420hxr = this.AEQbTJ;
        if (c23420hxr != null) {
            int iOrdinal = klineState.ordinal();
            if (iOrdinal == KlineState.SUCCESS.ordinal()) {
                KWHzl(true);
                c23420hxr.AEQbTJ.setVisibility(0);
                c23420hxr.EZpvd.setVisibility(0);
                c23420hxr.copydefault.setVisibility(0);
                c23420hxr.AhwBna.setVisibility(8);
                c23420hxr.gEmmrt.setVisibility(8);
                if (triple == null || (first = triple.getFirst()) == null) {
                    return;
                }
                c23420hxr.AEQbTJ.setChartData(first);
                return;
            }
            if (iOrdinal == KlineState.EMPTY.ordinal()) {
                copydefault();
                KWHzl(true);
                c23420hxr.AEQbTJ.setVisibility(8);
                c23420hxr.EZpvd.setVisibility(8);
                c23420hxr.copydefault.setVisibility(8);
                AYXKKw();
                return;
            }
            copydefault();
            KWHzl(true);
            c23420hxr.AEQbTJ.setVisibility(8);
            c23420hxr.EZpvd.setVisibility(8);
            c23420hxr.copydefault.setVisibility(8);
            valueOf();
        }
    }

    public final void EZpvd() {
        C55113xdn c55113xdn;
        C24335ibr c24335ibr;
        TextView textView;
        TextView textView2;
        C24337ibt c24337ibt;
        C23420hxr c23420hxr = this.AEQbTJ;
        if (c23420hxr != null) {
            if (c23420hxr != null && (c24337ibt = c23420hxr.AEQbTJ) != null) {
                c24337ibt.setVisibility(8);
            }
            C23420hxr c23420hxr2 = this.AEQbTJ;
            if (c23420hxr2 != null && (textView2 = c23420hxr2.EZpvd) != null) {
                textView2.setVisibility(8);
            }
            C23420hxr c23420hxr3 = this.AEQbTJ;
            if (c23420hxr3 != null && (textView = c23420hxr3.copydefault) != null) {
                textView.setVisibility(8);
            }
            C23420hxr c23420hxr4 = this.AEQbTJ;
            if (c23420hxr4 != null && (c24335ibr = c23420hxr4.AhwBna) != null) {
                c24335ibr.setVisibility(8);
            }
            C23420hxr c23420hxr5 = this.AEQbTJ;
            if (c23420hxr5 == null || (c55113xdn = c23420hxr5.gEmmrt) == null) {
                return;
            }
            c55113xdn.setVisibility(8);
        }
    }

    private final void AYXKKw() {
        C24335ibr c24335ibr;
        C23420hxr c23420hxr = this.AEQbTJ;
        if (c23420hxr == null || (c24335ibr = c23420hxr.AhwBna) == null) {
            return;
        }
        c24335ibr.setVisibility(0);
        c24335ibr.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.akftKQ));
        c24335ibr.setEmptyType(6);
        c24335ibr.setButtonText("");
        c24335ibr.setRetryClickVisible(false);
    }

    private final void valueOf() {
        C24335ibr c24335ibr;
        C23420hxr c23420hxr = this.AEQbTJ;
        if (c23420hxr == null || (c24335ibr = c23420hxr.AhwBna) == null) {
            return;
        }
        c24335ibr.setVisibility(0);
        c24335ibr.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultKt));
        c24335ibr.setSubTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.UscePu));
        c24335ibr.setButtonText(C33070mpX.AYXKKw(C23274hvD.Fragment.EZpvd));
        c24335ibr.setEmptyType(8);
        c24335ibr.setRetryClickVisible(true);
        c24335ibr.setRetryClick(new Function0() { // from class: o.hTj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return KLineSimpleView.OLrzqt(this.KWHzl);
            }
        });
    }

    public static final Unit OLrzqt(KLineSimpleView kLineSimpleView) {
        Activity activity = kLineSimpleView.AhwBna;
        if (activity != null) {
            activity.EZpvd(kLineSimpleView.OLrzqt());
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(boolean z) {
        C23420hxr c23420hxr = this.AEQbTJ;
        if (c23420hxr != null) {
            if (z) {
                c23420hxr.valueOf.setVisibility(0);
                c23420hxr.AYXKKw.setVisibility(0);
                c23420hxr.djBIcL.setVisibility(0);
            } else {
                c23420hxr.valueOf.setVisibility(8);
                c23420hxr.AYXKKw.setVisibility(8);
                c23420hxr.djBIcL.setVisibility(8);
            }
        }
    }

    public final String OLrzqt() {
        C23420hxr c23420hxr = this.AEQbTJ;
        return (c23420hxr == null || c23420hxr.valueOf.isSelected()) ? "1" : c23420hxr.AYXKKw.isSelected() ? "2" : "3";
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        TextView textView;
        TextView textView2;
        super.onDetachedFromWindow();
        C33050mpD.OLrzqt(this.copydefault);
        C23420hxr c23420hxr = this.AEQbTJ;
        if (c23420hxr != null && (textView2 = c23420hxr.EZpvd) != null) {
            textView2.removeCallbacks(this.KWHzl);
        }
        C23420hxr c23420hxr2 = this.AEQbTJ;
        if (c23420hxr2 == null || (textView = c23420hxr2.copydefault) == null) {
            return;
        }
        textView.removeCallbacks(this.gEmmrt);
    }

    public final String KWHzl(String str) {
        if (str.length() == 0 || C33129mqd.OLrzqt((Object) str, (Object) 0)) {
            return "--";
        }
        if (this.EZpvd) {
            return C23271hvA.formatTokenCode$default(C23271hvA.copydefault, str, false, null, false, null, null, 31, null);
        }
        return C21949hSh.EZpvd.KWHzl(str);
    }

    public final void copydefault(final String str) {
        C32866mlf.onEvent$default("DEX_Kline_Duration_Click", (TrackChannel[]) null, new Function1() { // from class: o.hTe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return KLineSimpleView.copydefault(str, (EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    public static final Unit copydefault(String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("klinetime", str, false);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        C32866mlf.onEvent$default("DEX_Pop_Kline_Click", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class KlineState {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ KlineState[] $VALUES;
        public static final KlineState SUCCESS = new KlineState("SUCCESS", 0, 1);
        public static final KlineState EMPTY = new KlineState("EMPTY", 1, 0);
        public static final KlineState FAIL = new KlineState("FAIL", 2, -1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ KlineState[] $values() {
            return new KlineState[]{SUCCESS, EMPTY, FAIL};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<KlineState> getEntries() {
            return $ENTRIES;
        }

        private KlineState(String str, int i, int i2) {
        }

        static {
            KlineState[] klineStateArr$values = $values();
            $VALUES = klineStateArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(klineStateArr$values);
        }

        public static KlineState valueOf(String str) {
            return (KlineState) Enum.valueOf(KlineState.class, str);
        }

        public static KlineState[] values() {
            return (KlineState[]) $VALUES.clone();
        }
    }
}
