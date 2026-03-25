package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.highlight.Highlight;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.api.bean.NewCurvePrice;
import com.okinc.business.defi.wallet.ui.kline.viewmodel.NoDataError;
import com.robinhood.ticker.TickerView;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class gIB extends gIO {
    public long OLrzqt;
    public AbstractC16550elz copydefault;
    public InterfaceC58217yxC valueOf;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;
    public java.lang.String AYXKKw = "1";
    public java.lang.String djBIcL = "--";
    public java.lang.String KWHzl = "";
    public java.lang.String EZpvd = "";
    public java.lang.String gEmmrt = "";
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.gIL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return gIB.KWHzl(this.OLrzqt);
        }
    });

    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gIB.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final gIB copydefault(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, NewCurvePrice newCurvePrice) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            gIB gib = new gIB();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("coin_id", j);
            bundle.putString("price_percent", str2);
            bundle.putString("coin_name", str3);
            bundle.putString("coin_icon", str4);
            bundle.putString("last_price", str);
            bundle.putParcelable("day_data", newCurvePrice);
            gib.setArguments(bundle);
            return gib;
        }
    }

    public final gIV EZpvd() {
        return (gIV) this.AhwBna.getValue();
    }

    public static final gIV KWHzl(gIB gib) {
        FragmentActivity fragmentActivityRequireActivity = gib.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return (gIV) new ViewModelProvider(fragmentActivityRequireActivity).get(gIV.class);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC16550elz abstractC16550elz = (AbstractC16550elz) DataBindingUtil.inflate(layoutInflater, C13754dXa.TaskDescription.zKcAg, viewGroup, false);
        this.copydefault = abstractC16550elz;
        if (abstractC16550elz != null) {
            return abstractC16550elz.getRoot();
        }
        return null;
    }

    @Override // o.gIO, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        isConnected();
        values();
        AYXKKw();
        djBIcL();
        KWHzl();
        AEQbTJ();
    }

    private final void isConnected() {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String string4;
        android.os.Bundle arguments = getArguments();
        this.OLrzqt = arguments != null ? arguments.getLong("coin_id") : 0L;
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("price_percent")) == null) {
            string = "--";
        }
        this.djBIcL = string;
        android.os.Bundle arguments3 = getArguments();
        java.lang.String str = "";
        if (arguments3 == null || (string2 = arguments3.getString("coin_name")) == null) {
            string2 = "";
        }
        this.KWHzl = string2;
        android.os.Bundle arguments4 = getArguments();
        if (arguments4 == null || (string3 = arguments4.getString("coin_icon")) == null) {
            string3 = "";
        }
        this.EZpvd = string3;
        android.os.Bundle arguments5 = getArguments();
        if (arguments5 != null && (string4 = arguments5.getString("last_price")) != null) {
            str = string4;
        }
        this.gEmmrt = str;
    }

    private final void values() {
        AbstractC16550elz abstractC16550elz;
        TickerView tickerView;
        C54984xbQ c54984xbQ;
        C54984xbQ c54984xbQ2;
        C54984xbQ c54984xbQ3;
        gIW giw;
        YAxis axisRight;
        gIW giw2;
        YAxis axisRight2;
        C19627gJj c19627gJj;
        C19627gJj c19627gJj2;
        C19627gJj c19627gJj3;
        C19628gJk c19628gJk;
        EZpvd().KWHzl(true);
        copydefault(EZpvd().gEmmrt());
        AbstractC16550elz abstractC16550elz2 = this.copydefault;
        if (abstractC16550elz2 != null && (c19628gJk = abstractC16550elz2.getNewProxyInstance) != null) {
            c19628gJk.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatSubscription));
        }
        AbstractC16550elz abstractC16550elz3 = this.copydefault;
        if (abstractC16550elz3 != null && (c19627gJj3 = abstractC16550elz3.hDKMBd) != null) {
            c19627gJj3.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.OhcwxsRkSIEV));
        }
        AbstractC16550elz abstractC16550elz4 = this.copydefault;
        if (abstractC16550elz4 != null && (c19627gJj2 = abstractC16550elz4.hDKMBd) != null) {
            c19627gJj2.setSubTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.registerCallbackMessenger));
        }
        AbstractC16550elz abstractC16550elz5 = this.copydefault;
        if (abstractC16550elz5 != null && (c19627gJj = abstractC16550elz5.hDKMBd) != null) {
            c19627gJj.setButtonText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.QbewEr));
        }
        AbstractC16550elz abstractC16550elz6 = this.copydefault;
        if (abstractC16550elz6 != null && (giw2 = abstractC16550elz6.copydefault) != null && (axisRight2 = giw2.getAxisRight()) != null) {
            axisRight2.setEnabled(false);
        }
        AbstractC16550elz abstractC16550elz7 = this.copydefault;
        if (abstractC16550elz7 != null && (giw = abstractC16550elz7.AEQbTJ) != null && (axisRight = giw.getAxisRight()) != null) {
            axisRight.setEnabled(false);
        }
        OLrzqt();
        AbstractC16550elz abstractC16550elz8 = this.copydefault;
        if (abstractC16550elz8 != null && (c54984xbQ3 = abstractC16550elz8.isConnected) != null) {
            c54984xbQ3.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatServiceBinderWrapper));
        }
        AbstractC16550elz abstractC16550elz9 = this.copydefault;
        if (abstractC16550elz9 != null && (c54984xbQ2 = abstractC16550elz9.DbNXlk) != null) {
            c54984xbQ2.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaItem));
        }
        AbstractC16550elz abstractC16550elz10 = this.copydefault;
        if (abstractC16550elz10 != null && (c54984xbQ = abstractC16550elz10.fetchVPNInfo) != null) {
            c54984xbQ.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.addSubscription));
        }
        android.content.Context context = getContext();
        if (context == null || (abstractC16550elz = this.copydefault) == null || (tickerView = abstractC16550elz.fARcdN) == null) {
            return;
        }
        tickerView.setTypeface(ResourcesCompat.getFont(context, C52761wXj.Dialog.KWHzl));
    }

    private final void AYXKKw() {
        EZpvd().AYXKKw().observe(this, new TaskDescription(new Function1() { // from class: o.gIG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gIB.AEQbTJ(this.EZpvd, (NewCurvePrice) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(gIB gib, NewCurvePrice newCurvePrice) {
        if (newCurvePrice == null) {
            return Unit.INSTANCE;
        }
        gib.AEQbTJ(newCurvePrice.getPriceChangePercent());
        gib.copydefault(newCurvePrice.getPrice(), false);
        gib.copydefault();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void loadChartData$default(gIB gib, long j, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        gib.KWHzl(j, str);
    }

    public final void KWHzl(long j, @NotNull java.lang.String str) {
        C55113xdn c55113xdn;
        Intrinsics.checkNotNullParameter(str, "");
        fetchVPNInfo();
        AbstractC16550elz abstractC16550elz = this.copydefault;
        if (abstractC16550elz != null && (c55113xdn = abstractC16550elz.fJNWhG) != null) {
            c55113xdn.KWHzl(0L);
        }
        EZpvd().EZpvd(j, DbNXlk());
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault() {
        boolean z;
        gIV givEZpvd = EZpvd();
        android.content.Context context = getContext();
        if (context != null) {
            z = C55296xhK.OLrzqt(context);
        }
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(givEZpvd.EZpvd(z, this.OLrzqt), this);
        final Function1 function1 = new Function1() { // from class: o.gIF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gIB.AEQbTJ(this.EZpvd, (Triple) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gIE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gIB.AEQbTJ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gIC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gIB.OLrzqt(this.copydefault, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gID
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gIB.AYXKKw(function12, obj);
            }
        });
    }

    public static final Unit AEQbTJ(gIB gib, Triple triple) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        gIW giw;
        gIW giw2;
        C19628gJk c19628gJk;
        C19627gJj c19627gJj;
        android.widget.LinearLayout linearLayout;
        android.widget.LinearLayout linearLayout2;
        gIW giw3;
        gIW giw4;
        C55113xdn c55113xdn;
        AbstractC16550elz abstractC16550elz = gib.copydefault;
        if (abstractC16550elz != null && (c55113xdn = abstractC16550elz.fJNWhG) != null) {
            c55113xdn.copydefault();
        }
        ViewGroup.LayoutParams layoutParams = null;
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) gib, true, (java.lang.String) null, 2, (java.lang.Object) null);
        AbstractC16550elz abstractC16550elz2 = gib.copydefault;
        if (abstractC16550elz2 != null && (giw4 = abstractC16550elz2.copydefault) != null) {
            giw4.setVisibility(0);
        }
        AbstractC16550elz abstractC16550elz3 = gib.copydefault;
        if (abstractC16550elz3 != null && (giw3 = abstractC16550elz3.AEQbTJ) != null) {
            giw3.setVisibility(0);
        }
        AbstractC16550elz abstractC16550elz4 = gib.copydefault;
        if (abstractC16550elz4 != null && (linearLayout2 = abstractC16550elz4.valueOf) != null) {
            linearLayout2.setVisibility(0);
        }
        AbstractC16550elz abstractC16550elz5 = gib.copydefault;
        if (abstractC16550elz5 != null && (linearLayout = abstractC16550elz5.AYXKKw) != null) {
            linearLayout.setVisibility(0);
        }
        AbstractC16550elz abstractC16550elz6 = gib.copydefault;
        if (abstractC16550elz6 != null && (c19627gJj = abstractC16550elz6.hDKMBd) != null) {
            c19627gJj.setVisibility(8);
        }
        AbstractC16550elz abstractC16550elz7 = gib.copydefault;
        if (abstractC16550elz7 != null && (c19628gJk = abstractC16550elz7.getNewProxyInstance) != null) {
            c19628gJk.setVisibility(8);
        }
        NewCurvePrice value = gib.EZpvd().AYXKKw().getValue();
        java.lang.String priceChangePercent = value != null ? value.getPriceChangePercent() : null;
        AbstractC16550elz abstractC16550elz8 = gib.copydefault;
        if (abstractC16550elz8 != null && (giw2 = abstractC16550elz8.copydefault) != null) {
            giw2.setChartData((java.util.ArrayList) triple.getFirst(), 0.120000005f, priceChangePercent);
        }
        AbstractC16550elz abstractC16550elz9 = gib.copydefault;
        if (abstractC16550elz9 != null && (giw = abstractC16550elz9.AEQbTJ) != null) {
            giw.setChartData((java.util.ArrayList) triple.getFirst(), 0.88f, priceChangePercent);
        }
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(gib.OLrzqt));
        AbstractC16550elz abstractC16550elz10 = gib.copydefault;
        if (abstractC16550elz10 != null && (textView4 = abstractC16550elz10.djBIcL) != null) {
            textView4.setText(C54872xYl.formatCoinPrice$default(C33129mqd.EZpvd(((kotlin.Pair) triple.getThird()).getFirst()), null, c10854bwMKWHzl != null ? c10854bwMKWHzl.getNewProxyInstance() : false, gib.EZpvd().AEQbTJ(), CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, 17, null));
        }
        AbstractC16550elz abstractC16550elz11 = gib.copydefault;
        if (abstractC16550elz11 != null && (textView3 = abstractC16550elz11.AhwBna) != null) {
            textView3.setText(C54872xYl.formatCoinPrice$default(C33129mqd.EZpvd(((kotlin.Pair) triple.getThird()).getSecond()), null, c10854bwMKWHzl != null ? c10854bwMKWHzl.getNewProxyInstance() : false, gib.EZpvd().AEQbTJ(), CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, 17, null));
        }
        AbstractC16550elz abstractC16550elz12 = gib.copydefault;
        if (abstractC16550elz12 != null && (textView2 = abstractC16550elz12.djBIcL) != null) {
            ViewGroup.LayoutParams layoutParams2 = (abstractC16550elz12 == null || textView2 == null) ? null : textView2.getLayoutParams();
            LinearLayout.LayoutParams layoutParams3 = layoutParams2 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams2 : null;
            if (layoutParams3 != null) {
                layoutParams3.weight = ((java.lang.Number) ((kotlin.Pair) triple.getSecond()).getFirst()).floatValue();
                if (((java.lang.Number) ((kotlin.Pair) triple.getSecond()).getFirst()).floatValue() == 0.0f) {
                    android.content.Context context = gib.getContext();
                    layoutParams3.leftMargin = C57676yms.EZpvd(context != null ? context.getApplicationContext() : null, 16.0f);
                } else {
                    layoutParams3.leftMargin = 0;
                }
                if (((java.lang.Number) ((kotlin.Pair) triple.getSecond()).getFirst()).floatValue() == 100.0f) {
                    android.content.Context context2 = gib.getContext();
                    layoutParams3.rightMargin = C57676yms.EZpvd(context2 != null ? context2.getApplicationContext() : null, 16.0f);
                } else {
                    layoutParams3.rightMargin = 0;
                }
                layoutParams3.width = ((java.lang.Number) ((kotlin.Pair) triple.getSecond()).getFirst()).floatValue() == 0.0f ? -2 : 0;
            } else {
                layoutParams3 = null;
            }
            textView2.setLayoutParams(layoutParams3);
        }
        AbstractC16550elz abstractC16550elz13 = gib.copydefault;
        if (abstractC16550elz13 != null && (textView = abstractC16550elz13.AhwBna) != null) {
            ViewGroup.LayoutParams layoutParams4 = (abstractC16550elz13 == null || textView == null) ? null : textView.getLayoutParams();
            LinearLayout.LayoutParams layoutParams5 = layoutParams4 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams4 : null;
            if (layoutParams5 != null) {
                layoutParams5.weight = ((java.lang.Number) ((kotlin.Pair) triple.getSecond()).getSecond()).floatValue();
                if (((java.lang.Number) ((kotlin.Pair) triple.getSecond()).getSecond()).floatValue() == 0.0f) {
                    android.content.Context context3 = gib.getContext();
                    layoutParams5.leftMargin = C57676yms.EZpvd(context3 != null ? context3.getApplicationContext() : null, 16.0f);
                } else {
                    layoutParams5.leftMargin = 0;
                }
                if (((java.lang.Number) ((kotlin.Pair) triple.getSecond()).getSecond()).floatValue() == 100.0f) {
                    android.content.Context context4 = gib.getContext();
                    layoutParams5.rightMargin = C57676yms.EZpvd(context4 != null ? context4.getApplicationContext() : null, 16.0f);
                } else {
                    layoutParams5.rightMargin = 0;
                }
                layoutParams5.width = ((java.lang.Number) ((kotlin.Pair) triple.getSecond()).getSecond()).floatValue() == 0.0f ? -2 : 0;
                layoutParams = layoutParams5;
            }
            textView.setLayoutParams(layoutParams);
        }
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(gIB gib, java.lang.Throwable th) {
        C19628gJk c19628gJk;
        C19627gJj c19627gJj;
        C19627gJj c19627gJj2;
        C19628gJk c19628gJk2;
        android.widget.LinearLayout linearLayout;
        android.widget.LinearLayout linearLayout2;
        gIW giw;
        gIW giw2;
        C55113xdn c55113xdn;
        AbstractC16550elz abstractC16550elz = gib.copydefault;
        if (abstractC16550elz != null && (c55113xdn = abstractC16550elz.fJNWhG) != null) {
            c55113xdn.copydefault();
        }
        AbstractC16550elz abstractC16550elz2 = gib.copydefault;
        if (abstractC16550elz2 != null && (giw2 = abstractC16550elz2.copydefault) != null) {
            giw2.setVisibility(8);
        }
        AbstractC16550elz abstractC16550elz3 = gib.copydefault;
        if (abstractC16550elz3 != null && (giw = abstractC16550elz3.AEQbTJ) != null) {
            giw.setVisibility(8);
        }
        AbstractC16550elz abstractC16550elz4 = gib.copydefault;
        if (abstractC16550elz4 != null && (linearLayout2 = abstractC16550elz4.valueOf) != null) {
            linearLayout2.setVisibility(8);
        }
        AbstractC16550elz abstractC16550elz5 = gib.copydefault;
        if (abstractC16550elz5 != null && (linearLayout = abstractC16550elz5.AYXKKw) != null) {
            linearLayout.setVisibility(8);
        }
        if (th instanceof NoDataError) {
            AbstractC16550elz abstractC16550elz6 = gib.copydefault;
            if (abstractC16550elz6 != null && (c19628gJk2 = abstractC16550elz6.getNewProxyInstance) != null) {
                c19628gJk2.setVisibility(0);
            }
            AbstractC16550elz abstractC16550elz7 = gib.copydefault;
            if (abstractC16550elz7 != null && (c19627gJj2 = abstractC16550elz7.hDKMBd) != null) {
                c19627gJj2.setVisibility(8);
            }
        } else {
            AbstractC16550elz abstractC16550elz8 = gib.copydefault;
            if (abstractC16550elz8 != null && (c19627gJj = abstractC16550elz8.hDKMBd) != null) {
                c19627gJj.setVisibility(0);
            }
            AbstractC16550elz abstractC16550elz9 = gib.copydefault;
            if (abstractC16550elz9 != null && (c19628gJk = abstractC16550elz9.getNewProxyInstance) != null) {
                c19628gJk.setVisibility(8);
            }
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(java.lang.String str) {
        android.widget.TextView textView;
        AbstractC16550elz abstractC16550elz = this.copydefault;
        if (abstractC16550elz == null || (textView = abstractC16550elz.AkhnZx) == null) {
            return;
        }
        textView.setText(str);
    }

    public final void copydefault(java.lang.String str, boolean z) {
        TickerView tickerView;
        gIV givEZpvd = EZpvd();
        AbstractC16550elz abstractC16550elz = this.copydefault;
        if (abstractC16550elz == null || (tickerView = abstractC16550elz.fARcdN) == null) {
            return;
        }
        tickerView.setText(givEZpvd.EZpvd(str, this.OLrzqt), z);
    }

    public final void AEQbTJ(java.lang.String str) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        gIV givEZpvd = EZpvd();
        if (str == null || str.length() == 0) {
            AbstractC16550elz abstractC16550elz = this.copydefault;
            if (abstractC16550elz == null || (textView = abstractC16550elz.values) == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        android.content.Context context = getContext();
        if (context != null) {
            AbstractC16550elz abstractC16550elz2 = this.copydefault;
            if (abstractC16550elz2 != null && (textView4 = abstractC16550elz2.values) != null) {
                textView4.setVisibility(0);
            }
            AbstractC16550elz abstractC16550elz3 = this.copydefault;
            if (abstractC16550elz3 != null && (textView3 = abstractC16550elz3.values) != null) {
                textView3.setTextColor(KWHzl(context, str));
            }
        }
        AbstractC16550elz abstractC16550elz4 = this.copydefault;
        if (abstractC16550elz4 == null || (textView2 = abstractC16550elz4.values) == null) {
            return;
        }
        textView2.setText(givEZpvd.EZpvd(str));
    }

    public static /* synthetic */ int getCurrentRadioColor$default(gIB gib, android.content.Context context, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "0";
        }
        return gib.KWHzl(context, str);
    }

    public final int KWHzl(android.content.Context context, java.lang.String str) {
        if (C33129mqd.AEQbTJ(str, 0)) {
            return C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
        }
        if (C33129mqd.OLrzqt((java.lang.Object) str, (java.lang.Object) 0)) {
            return context.getColor(C52761wXj.Activity.QwvEab);
        }
        return C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
    }

    public final void KWHzl() {
        OLrzqt(this.KWHzl);
        copydefault(this.gEmmrt, false);
        AEQbTJ(this.djBIcL);
        KWHzl(this.EZpvd);
    }

    public final void AEQbTJ() {
        android.os.Bundle arguments = getArguments();
        NewCurvePrice newCurvePrice = arguments != null ? (NewCurvePrice) arguments.getParcelable("day_data") : null;
        if (newCurvePrice != null) {
            fetchVPNInfo();
            EZpvd().AYXKKw().postValue(newCurvePrice);
        } else {
            KWHzl(this.OLrzqt, this.AYXKKw);
        }
    }

    public final void KWHzl(java.lang.String str) {
        if (!EZpvd().valueOf()) {
            str = "";
        }
        EZpvd(str);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        EZpvd().AkhnZx();
        InterfaceC58217yxC interfaceC58217yxC = this.valueOf;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    private final void djBIcL() {
        final AbstractC16550elz abstractC16550elz = this.copydefault;
        if (abstractC16550elz != null) {
            abstractC16550elz.copydefault.setSelectCallback(new yHO() { // from class: o.gIA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return gIB.AEQbTJ(abstractC16550elz, this, (java.lang.String) obj, (java.lang.String) obj2, (Highlight) obj3);
                }
            });
            abstractC16550elz.hDKMBd.setRetryClick(new Function0() { // from class: o.gIy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return gIB.copydefault(this.KWHzl);
                }
            });
            abstractC16550elz.DbNXlk.setOnClickListener(new View.OnClickListener() { // from class: o.gIJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    gIB.copydefault(this.AEQbTJ, view);
                }
            });
            abstractC16550elz.isConnected.setOnClickListener(new View.OnClickListener() { // from class: o.gIK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    gIB.valueOf(this.AEQbTJ, view);
                }
            });
            abstractC16550elz.fetchVPNInfo.setOnClickListener(new View.OnClickListener() { // from class: o.gII
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    gIB.gEmmrt(this.copydefault, view);
                }
            });
            abstractC16550elz.AkhnZx.setOnClickListener(new View.OnClickListener() { // from class: o.gIH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    gIB.AYXKKw(this.AEQbTJ, view);
                }
            });
        }
    }

    public static final Unit AEQbTJ(AbstractC16550elz abstractC16550elz, gIB gib, java.lang.String str, java.lang.String str2, Highlight highlight) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        gIW giw = abstractC16550elz.AEQbTJ;
        if (highlight != null) {
            giw.setClipBounds(new android.graphics.Rect((int) giw.getX(), 0, ((int) giw.getX()) + C33129mqd.AhwBna(java.lang.Double.valueOf(giw.getPixelForValues(highlight.getX(), highlight.getY(), YAxis.AxisDependency.LEFT).x)), giw.getHeight()));
        } else {
            giw.setClipBounds(new android.graphics.Rect((int) giw.getX(), 0, ((int) giw.getX()) + giw.getWidth(), giw.getHeight()));
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            abstractC16550elz.ejfBZ.setVisibility(8);
            abstractC16550elz.AuCTel.setVisibility(0);
            abstractC16550elz.AuCTel.setText(str2);
        } else {
            abstractC16550elz.ejfBZ.setVisibility(0);
            abstractC16550elz.AuCTel.setVisibility(8);
        }
        if (str.length() == 0 && (str = gib.gEmmrt) == null) {
            str = "";
        }
        gib.copydefault(str, true);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(gIB gib) {
        gib.KWHzl(gib.OLrzqt, gib.DbNXlk());
        return Unit.INSTANCE;
    }

    public static final void copydefault(gIB gib, android.view.View view) {
        gib.copydefault(view.getTag().toString());
        gib.KWHzl(gib.OLrzqt, gib.DbNXlk());
    }

    public static final void valueOf(gIB gib, android.view.View view) {
        gib.copydefault(view.getTag().toString());
        gib.KWHzl(gib.OLrzqt, gib.DbNXlk());
    }

    public static final void gEmmrt(gIB gib, android.view.View view) {
        gib.copydefault(view.getTag().toString());
        gib.KWHzl(gib.OLrzqt, gib.DbNXlk());
    }

    public static final void AYXKKw(gIB gib, android.view.View view) {
        gib.EZpvd().KWHzl(!gib.EZpvd().valueOf());
        gib.KWHzl(gib.OLrzqt, gib.DbNXlk());
    }

    public final void copydefault(java.lang.String str) {
        C54984xbQ c54984xbQ;
        C54984xbQ c54984xbQ2;
        android.widget.TextView textView;
        C54984xbQ c54984xbQ3;
        C54984xbQ c54984xbQ4;
        android.widget.TextView textView2;
        C54984xbQ c54984xbQ5;
        android.widget.TextView textView3;
        C54984xbQ c54984xbQ6;
        C54984xbQ c54984xbQ7;
        C54984xbQ c54984xbQ8;
        C54984xbQ c54984xbQ9;
        C54984xbQ c54984xbQ10;
        C54984xbQ c54984xbQ11;
        C54984xbQ c54984xbQ12;
        AbstractC16550elz abstractC16550elz = this.copydefault;
        if (abstractC16550elz != null && (c54984xbQ12 = abstractC16550elz.isConnected) != null) {
            c54984xbQ12.setSelected(false);
        }
        AbstractC16550elz abstractC16550elz2 = this.copydefault;
        if (abstractC16550elz2 != null && (c54984xbQ11 = abstractC16550elz2.fetchVPNInfo) != null) {
            c54984xbQ11.setSelected(false);
        }
        AbstractC16550elz abstractC16550elz3 = this.copydefault;
        if (abstractC16550elz3 != null && (c54984xbQ10 = abstractC16550elz3.DbNXlk) != null) {
            c54984xbQ10.setSelected(false);
        }
        AbstractC16550elz abstractC16550elz4 = this.copydefault;
        if (abstractC16550elz4 != null && (c54984xbQ9 = abstractC16550elz4.fetchVPNInfo) != null) {
            c54984xbQ9.setSelectedStyle(false, 1);
        }
        AbstractC16550elz abstractC16550elz5 = this.copydefault;
        if (abstractC16550elz5 != null && (c54984xbQ8 = abstractC16550elz5.isConnected) != null) {
            c54984xbQ8.setSelectedStyle(false, 1);
        }
        AbstractC16550elz abstractC16550elz6 = this.copydefault;
        if (abstractC16550elz6 != null && (c54984xbQ7 = abstractC16550elz6.DbNXlk) != null) {
            c54984xbQ7.setSelectedStyle(false, 1);
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1")) {
            AbstractC16550elz abstractC16550elz7 = this.copydefault;
            if (abstractC16550elz7 != null && (c54984xbQ6 = abstractC16550elz7.isConnected) != null) {
                c54984xbQ6.setSelectedStyle(true, 1);
            }
            AbstractC16550elz abstractC16550elz8 = this.copydefault;
            if (abstractC16550elz8 != null && (textView3 = abstractC16550elz8.fIwbmz) != null) {
                textView3.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.removeSubscription));
            }
            AbstractC16550elz abstractC16550elz9 = this.copydefault;
            if (abstractC16550elz9 == null || (c54984xbQ5 = abstractC16550elz9.isConnected) == null) {
                return;
            }
            c54984xbQ5.setSelected(true);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "2")) {
            AbstractC16550elz abstractC16550elz10 = this.copydefault;
            if (abstractC16550elz10 != null && (textView2 = abstractC16550elz10.fIwbmz) != null) {
                textView2.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getCallback));
            }
            AbstractC16550elz abstractC16550elz11 = this.copydefault;
            if (abstractC16550elz11 != null && (c54984xbQ4 = abstractC16550elz11.DbNXlk) != null) {
                c54984xbQ4.setSelected(true);
            }
            AbstractC16550elz abstractC16550elz12 = this.copydefault;
            if (abstractC16550elz12 == null || (c54984xbQ3 = abstractC16550elz12.DbNXlk) == null) {
                return;
            }
            c54984xbQ3.setSelectedStyle(true, 1);
            return;
        }
        AbstractC16550elz abstractC16550elz13 = this.copydefault;
        if (abstractC16550elz13 != null && (textView = abstractC16550elz13.fIwbmz) != null) {
            textView.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.unregisterCallbackMessenger));
        }
        AbstractC16550elz abstractC16550elz14 = this.copydefault;
        if (abstractC16550elz14 != null && (c54984xbQ2 = abstractC16550elz14.fetchVPNInfo) != null) {
            c54984xbQ2.setSelected(true);
        }
        AbstractC16550elz abstractC16550elz15 = this.copydefault;
        if (abstractC16550elz15 == null || (c54984xbQ = abstractC16550elz15.fetchVPNInfo) == null) {
            return;
        }
        c54984xbQ.setSelectedStyle(true, 1);
    }

    private final java.lang.String DbNXlk() {
        AbstractC16550elz abstractC16550elz = this.copydefault;
        return (abstractC16550elz == null || abstractC16550elz.isConnected.isSelected()) ? "1" : abstractC16550elz.DbNXlk.isSelected() ? "2" : "3";
    }

    private final void fetchVPNInfo() {
        C55113xdn c55113xdn;
        C19628gJk c19628gJk;
        C19627gJj c19627gJj;
        android.widget.LinearLayout linearLayout;
        android.widget.LinearLayout linearLayout2;
        gIW giw;
        gIW giw2;
        AbstractC16550elz abstractC16550elz = this.copydefault;
        if (abstractC16550elz != null) {
            if (abstractC16550elz != null && (giw2 = abstractC16550elz.copydefault) != null) {
                giw2.setVisibility(8);
            }
            AbstractC16550elz abstractC16550elz2 = this.copydefault;
            if (abstractC16550elz2 != null && (giw = abstractC16550elz2.AEQbTJ) != null) {
                giw.setVisibility(8);
            }
            AbstractC16550elz abstractC16550elz3 = this.copydefault;
            if (abstractC16550elz3 != null && (linearLayout2 = abstractC16550elz3.valueOf) != null) {
                linearLayout2.setVisibility(8);
            }
            AbstractC16550elz abstractC16550elz4 = this.copydefault;
            if (abstractC16550elz4 != null && (linearLayout = abstractC16550elz4.AYXKKw) != null) {
                linearLayout.setVisibility(8);
            }
            AbstractC16550elz abstractC16550elz5 = this.copydefault;
            if (abstractC16550elz5 != null && (c19627gJj = abstractC16550elz5.hDKMBd) != null) {
                c19627gJj.setVisibility(8);
            }
            AbstractC16550elz abstractC16550elz6 = this.copydefault;
            if (abstractC16550elz6 != null && (c19628gJk = abstractC16550elz6.getNewProxyInstance) != null) {
                c19628gJk.setVisibility(8);
            }
            AbstractC16550elz abstractC16550elz7 = this.copydefault;
            if (abstractC16550elz7 == null || (c55113xdn = abstractC16550elz7.fJNWhG) == null) {
                return;
            }
            c55113xdn.copydefault();
        }
    }

    public final void EZpvd(java.lang.String str) {
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        AbstractC16550elz abstractC16550elz = this.copydefault;
        if (abstractC16550elz != null && (imageView2 = abstractC16550elz.KWHzl) != null) {
            imageView2.setVisibility(0);
        }
        AbstractC16550elz abstractC16550elz2 = this.copydefault;
        if (abstractC16550elz2 == null || (imageView = abstractC16550elz2.KWHzl) == null) {
            return;
        }
        C57659ymb.loadFixSizeBorderImage$default(imageView, str, C52761wXj.TaskDescription.aHXSQp, 0.0f, 26.0f, 4, null);
    }

    public final void OLrzqt() {
        InterfaceC58217yxC interfaceC58217yxC = this.valueOf;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgObserveOn = AbstractC58247yxg.timer(3L, java.util.concurrent.TimeUnit.SECONDS).observeOn(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.gIP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gIB.OLrzqt((java.lang.Long) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Long> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gIQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gIB.gEmmrt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gIN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gIB.copydefault((java.lang.Throwable) obj);
            }
        };
        this.valueOf = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gIM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gIB.valueOf(function12, obj);
            }
        });
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Long l) {
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }
}
