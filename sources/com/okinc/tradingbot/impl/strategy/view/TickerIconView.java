package com.okinc.tradingbot.impl.strategy.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC54531xLw;
import o.AbstractC55737xpb;
import o.C33070mpX;
import o.C33129mqd;
import o.C43251rlk;
import o.C48033uCm;
import o.C52761wXj;
import o.C54589xNz;
import o.C54789xVj;
import o.C55296xhK;
import o.C56033xvF;
import o.C56444yFp;
import o.InterfaceC54581xNr;
import o.InterfaceC56445yFq;
import o.oKA;
import o.wYD;
import o.xMR;
import o.xMS;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class TickerIconView extends ConstraintLayout {
    public ColorChangeMode AEQbTJ;
    public AbstractC55737xpb AYXKKw;
    public boolean AhwBna;
    public boolean EZpvd;
    public final AppCompatImageView KWHzl;
    public String OLrzqt;
    public Function0<Unit> copydefault;
    public final AppCompatTextView djBIcL;
    public final wYD gEmmrt;
    public Function1<? super String, Unit> valueOf;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ColorChangeMode.values().length];
            try {
                iArr[ColorChangeMode.FOLLOW_KLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ColorChangeMode.COMPARE_LAST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> */
    public final Function1<String, Unit> KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppCompatTextView copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setColorChangeMode(@NotNull ColorChangeMode colorChangeMode) {
        Intrinsics.checkNotNullParameter(colorChangeMode, "");
        this.AEQbTJ = colorChangeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIsNeedColorChange(boolean z) {
        this.EZpvd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setKlineIconListener(Function0<Unit> function0) {
        this.copydefault = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnTickerChange(Function1<? super String, Unit> function1) {
        this.valueOf = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TickerIconView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = true;
        this.AEQbTJ = ColorChangeMode.FOLLOW_KLINE;
        this.AhwBna = true;
        LayoutInflater.from(context).inflate(C48033uCm.Activity.fsw, this);
        this.djBIcL = (AppCompatTextView) findViewById(C48033uCm.Application.LayoutRes);
        this.KWHzl = (AppCompatImageView) findViewById(C48033uCm.Application.search);
        this.gEmmrt = (wYD) findViewById(C48033uCm.Application.getAudioStream);
    }

    public final void copydefault(String str, String str2) {
        String instType;
        String instFamily;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        xMS xmsGEmmrt = null;
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null) : null;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null) {
            String str3 = "";
            if (suggestedInstrument$default == null || (instType = suggestedInstrument$default.getInstType()) == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt != null) {
                if (suggestedInstrument$default != null && (instFamily = suggestedInstrument$default.getInstFamily()) != null) {
                    str3 = instFamily;
                }
                xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(str3);
            }
        }
        AEQbTJ();
        Activity activity = new Activity(str, this, xmsGEmmrt, C33129mqd.gEmmrt(Long.valueOf(System.currentTimeMillis())));
        this.AYXKKw = activity;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            interfaceC54581xNrCopydefault.copydefault(yDY.copydefault(activity));
        }
    }

    public static final class Activity extends AbstractC55737xpb {
        public final /* synthetic */ xMS OLrzqt;
        public final /* synthetic */ TickerIconView copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(String str, TickerIconView tickerIconView, xMS xms, String str2) {
            super(str, str2, false, 4, null);
            this.copydefault = tickerIconView;
            this.OLrzqt = xms;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void EZpvd(List<TickersData> list, String str) {
            String strAhwBna;
            String str2 = "";
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            TickersData tickersData = (TickersData) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (tickersData == null) {
                this.copydefault.copydefault().setText("--");
                return;
            }
            if (tickersData.getLast().length() == 0) {
                return;
            }
            AppCompatTextView appCompatTextViewCopydefault = this.copydefault.copydefault();
            xMR xmr = xMR.copydefault;
            xMS xms = this.OLrzqt;
            if (xms != null && (strAhwBna = xms.AhwBna(tickersData.getLast())) != null) {
                str2 = strAhwBna;
            }
            xMS xms2 = this.OLrzqt;
            appCompatTextViewCopydefault.setText(xmr.AEQbTJ(str2, C33129mqd.AhwBna(xms2 != null ? xms2.AEQbTJ() : null)));
            this.copydefault.KWHzl(tickersData);
            this.copydefault.OLrzqt = tickersData.getLast();
            Function1<String, Unit> function1KWHzl = this.copydefault.KWHzl();
            if (function1KWHzl != null) {
                function1KWHzl.invoke(tickersData.getLast());
            }
        }
    }

    public final void setShowNewPriceIcon(boolean z) {
        if (z) {
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(this);
            constraintSet.clear(C48033uCm.Application.LayoutRes, 7);
            constraintSet.connect(C48033uCm.Application.LayoutRes, 7, C48033uCm.Application.getAudioStream, 6);
            constraintSet.applyTo(this);
            this.gEmmrt.OLrzqt().setImageTintList(ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
            this.gEmmrt.setVisibility(0);
            this.KWHzl.setVisibility(8);
            return;
        }
        ConstraintSet constraintSet2 = new ConstraintSet();
        constraintSet2.clone(this);
        constraintSet2.clear(C48033uCm.Application.LayoutRes, 7);
        constraintSet2.connect(C48033uCm.Application.LayoutRes, 7, C48033uCm.Application.search, 6);
        constraintSet2.applyTo(this);
        this.gEmmrt.setVisibility(8);
        this.KWHzl.setVisibility(0);
    }

    public final void KWHzl(TickersData tickersData) {
        double dDoubleValue;
        if (this.EZpvd) {
            int i = ActionBar.KWHzl[this.AEQbTJ.ordinal()];
            if (i == 1) {
                dDoubleValue = C54789xVj.EZpvd.AEQbTJ(tickersData.getLast(), tickersData.getOpen24h(), tickersData.getSodUtc0(), tickersData.getSodUtc8()).getFirst().doubleValue();
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                dDoubleValue = C33129mqd.subD$default(tickersData.getLast(), this.OLrzqt, null, null, null, 14, null);
            }
            this.djBIcL.setTextColor(C56033xvF.OLrzqt(Double.valueOf(dDoubleValue)));
        }
    }

    private final void AEQbTJ() {
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        AbstractC55737xpb abstractC55737xpb = this.AYXKKw;
        if (abstractC55737xpb == null || (interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault()) == null) {
            return;
        }
        interfaceC54581xNrCopydefault.AEQbTJ(yDY.copydefault(abstractC55737xpb));
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ColorChangeMode {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ColorChangeMode[] $VALUES;
        public static final ColorChangeMode FOLLOW_KLINE = new ColorChangeMode("FOLLOW_KLINE", 0);
        public static final ColorChangeMode COMPARE_LAST = new ColorChangeMode("COMPARE_LAST", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ColorChangeMode[] $values() {
            return new ColorChangeMode[]{FOLLOW_KLINE, COMPARE_LAST};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ColorChangeMode> getEntries() {
            return $ENTRIES;
        }

        private ColorChangeMode(String str, int i) {
        }

        static {
            ColorChangeMode[] colorChangeModeArr$values = $values();
            $VALUES = colorChangeModeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(colorChangeModeArr$values);
        }

        public static ColorChangeMode valueOf(String str) {
            return (ColorChangeMode) Enum.valueOf(ColorChangeMode.class, str);
        }

        public static ColorChangeMode[] values() {
            return (ColorChangeMode[]) $VALUES.clone();
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ TickerIconView KWHzl;
        public final /* synthetic */ String OLrzqt;
        public final /* synthetic */ String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, TickerIconView tickerIconView, String str, String str2) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = tickerIconView;
            this.OLrzqt = str;
            this.copydefault = str2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (this.KWHzl.AhwBna) {
                    Function0 function0 = this.KWHzl.copydefault;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    MarketCoinInfo marketCoinInfo = new MarketCoinInfo(this.OLrzqt, this.copydefault, (String) null, (String) null, (String) null, 28, (DefaultConstructorMarker) null);
                    oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
                    if (oka != null) {
                        Context context = this.KWHzl.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        oKA.TaskDescription.gotoNewKlinePage$default(oka, context, marketCoinInfo, null, null, "bot_page_trade", null, null, null, null, null, null, 2028, null);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AEQbTJ();
    }

    public final void OLrzqt(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        setOnClickListener(new Application(this, 1000L, this, str, str2));
        copydefault(str, str2);
    }

    public final void setShowTickerIcon(boolean z) {
        this.AhwBna = z;
        this.KWHzl.setVisibility(z ? 0 : 8);
    }
}
