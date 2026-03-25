package o;

import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoEarnOverView;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter.AutoEarnPresenter;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wyj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54140wyj extends AbstractC49945uyC<uPD, AutoEarnPresenter> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final int OLrzqt = C48033uCm.Activity.DGOPHZDGOPHZ;
    public AutoEarnOverView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.OLrzqt;
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        this.copydefault = arguments != null ? (AutoEarnOverView) BundleCompat.getParcelable(arguments, "profitOverView", AutoEarnOverView.class) : null;
        copydefault();
    }

    /* JADX INFO: renamed from: o.wyj$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wyj.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull AutoEarnOverView autoEarnOverView) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(autoEarnOverView, "");
            C54140wyj c54140wyj = new C54140wyj();
            c54140wyj.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("profitOverView", autoEarnOverView)));
            c54140wyj.show(fragmentManager, TaskDescription.class.getSimpleName());
        }
    }

    private final void copydefault() {
        uPD updValues = values();
        AutoEarnOverView autoEarnOverView = this.copydefault;
        java.lang.String matchedAmount = autoEarnOverView != null ? autoEarnOverView.getMatchedAmount() : null;
        AutoEarnOverView autoEarnOverView2 = this.copydefault;
        java.lang.String strAddS$default = C33129mqd.addS$default(matchedAmount, autoEarnOverView2 != null ? autoEarnOverView2.getMatchedSimpleEarnAmount() : null, null, null, null, 14, null);
        android.widget.TextView textView = updValues.OLrzqt;
        AutoEarnOverView autoEarnOverView3 = this.copydefault;
        java.lang.String ccy = autoEarnOverView3 != null ? autoEarnOverView3.getCcy() : null;
        java.lang.String str = ccy == null ? "" : ccy;
        RoundingMode roundingMode = RoundingMode.UP;
        textView.setText(C56033xvF.fmtBotValueBySymbol$default(str, strAddS$default, roundingMode, true, null, false, null, null, null, null, null, 2032, null));
        AutoEarnOverView autoEarnOverView4 = this.copydefault;
        java.lang.String matchedAmount2 = autoEarnOverView4 != null ? autoEarnOverView4.getMatchedAmount() : null;
        android.widget.TextView textView2 = updValues.AEQbTJ.KWHzl;
        AutoEarnOverView autoEarnOverView5 = this.copydefault;
        java.lang.String ccy2 = autoEarnOverView5 != null ? autoEarnOverView5.getCcy() : null;
        textView2.setText(C56033xvF.fmtBotValueBySymbol$default(ccy2 == null ? "" : ccy2, C33129mqd.gEmmrt(matchedAmount2), roundingMode, true, null, false, null, null, null, null, null, 2032, null));
        AutoEarnOverView autoEarnOverView6 = this.copydefault;
        java.lang.String matchedSimpleEarnAmount = autoEarnOverView6 != null ? autoEarnOverView6.getMatchedSimpleEarnAmount() : null;
        android.widget.TextView textView3 = updValues.AEQbTJ.AEQbTJ;
        AutoEarnOverView autoEarnOverView7 = this.copydefault;
        java.lang.String ccy3 = autoEarnOverView7 != null ? autoEarnOverView7.getCcy() : null;
        textView3.setText(C56033xvF.fmtBotValueBySymbol$default(ccy3 == null ? "" : ccy3, C33129mqd.gEmmrt(matchedSimpleEarnAmount), roundingMode, true, null, false, null, null, null, null, null, 2032, null));
        AutoEarnOverView autoEarnOverView8 = this.copydefault;
        java.lang.String autoLendAmount = autoEarnOverView8 != null ? autoEarnOverView8.getAutoLendAmount() : null;
        AutoEarnOverView autoEarnOverView9 = this.copydefault;
        java.lang.String strAddS$default2 = C33129mqd.addS$default(autoLendAmount, autoEarnOverView9 != null ? autoEarnOverView9.getSimpleEarnAmount() : null, null, null, null, 14, null);
        android.widget.TextView textView4 = updValues.EZpvd;
        AutoEarnOverView autoEarnOverView10 = this.copydefault;
        java.lang.String ccy4 = autoEarnOverView10 != null ? autoEarnOverView10.getCcy() : null;
        textView4.setText(C56033xvF.fmtBotValueBySymbol$default(ccy4 == null ? "" : ccy4, C33129mqd.gEmmrt(strAddS$default2), roundingMode, true, null, false, null, null, null, null, null, 2032, null));
        AutoEarnOverView autoEarnOverView11 = this.copydefault;
        java.lang.String simpleEarnAmount = autoEarnOverView11 != null ? autoEarnOverView11.getSimpleEarnAmount() : null;
        android.widget.TextView textView5 = updValues.copydefault.OLrzqt;
        AutoEarnOverView autoEarnOverView12 = this.copydefault;
        java.lang.String ccy5 = autoEarnOverView12 != null ? autoEarnOverView12.getCcy() : null;
        textView5.setText(C56033xvF.fmtBotValueBySymbol$default(ccy5 == null ? "" : ccy5, C33129mqd.gEmmrt(simpleEarnAmount), roundingMode, true, null, false, null, null, null, null, null, 2032, null));
        AutoEarnOverView autoEarnOverView13 = this.copydefault;
        java.lang.String autoLendAmount2 = autoEarnOverView13 != null ? autoEarnOverView13.getAutoLendAmount() : null;
        android.widget.TextView textView6 = updValues.copydefault.copydefault;
        AutoEarnOverView autoEarnOverView14 = this.copydefault;
        java.lang.String ccy6 = autoEarnOverView14 != null ? autoEarnOverView14.getCcy() : null;
        textView6.setText(C56033xvF.fmtBotValueBySymbol$default(ccy6 == null ? "" : ccy6, C33129mqd.gEmmrt(autoLendAmount2), roundingMode, true, null, false, null, null, null, null, null, 2032, null));
    }
}
