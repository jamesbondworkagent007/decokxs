package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import com.okinc.business.dex.trade.copytrading.edit.ui.widget.BuySellConfigData;
import com.okinc.business.dex.utils.CDNSourceManager;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gUe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C19919gUe extends ConstraintLayout {
    public final C23524hzp EZpvd;
    public BuySellConfigData OLrzqt;

    /* JADX INFO: renamed from: o.gUe$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PresetRouteType.values().length];
            try {
                iArr[PresetRouteType.RouteTypeMev.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PresetRouteType.RouteTypeAuto.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[PresetRouteType.RouteTypeFast.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[PresetRouteType.RouteTypeNotSupport.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[PriorityFeeType.values().length];
            try {
                iArr2[PriorityFeeType.PriorityMarket.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[PriorityFeeType.PriorityFast.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[PriorityFeeType.PriorityTurbo.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            EZpvd = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBuySellConfigData(@NotNull BuySellConfigData buySellConfigData) {
        Intrinsics.checkNotNullParameter(buySellConfigData, "");
        this.OLrzqt = buySellConfigData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19919gUe(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        C23524hzp c23524hzpEZpvd = C23524hzp.EZpvd(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(c23524hzpEZpvd, "");
        this.EZpvd = c23524hzpEZpvd;
        C55113xdn c55113xdn = c23524hzpEZpvd.valueOf;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        CDNSourceManager.LottieSource lottieSource = CDNSourceManager.LottieSource.DEX_CEFI_SETTING_LOADING;
        C22361hds.OLrzqt(c55113xdn, lottieSource);
        C55113xdn c55113xdn2 = c23524hzpEZpvd.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
        C22361hds.OLrzqt(c55113xdn2, lottieSource);
        c23524hzpEZpvd.djBIcL.setBackground(AEQbTJ());
        c23524hzpEZpvd.fetchVPNInfo.setBackground(AEQbTJ());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19919gUe(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C23524hzp c23524hzpEZpvd = C23524hzp.EZpvd(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(c23524hzpEZpvd, "");
        this.EZpvd = c23524hzpEZpvd;
        C55113xdn c55113xdn = c23524hzpEZpvd.valueOf;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        CDNSourceManager.LottieSource lottieSource = CDNSourceManager.LottieSource.DEX_CEFI_SETTING_LOADING;
        C22361hds.OLrzqt(c55113xdn, lottieSource);
        C55113xdn c55113xdn2 = c23524hzpEZpvd.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
        C22361hds.OLrzqt(c55113xdn2, lottieSource);
        c23524hzpEZpvd.djBIcL.setBackground(AEQbTJ());
        c23524hzpEZpvd.fetchVPNInfo.setBackground(AEQbTJ());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19919gUe(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C23524hzp c23524hzpEZpvd = C23524hzp.EZpvd(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(c23524hzpEZpvd, "");
        this.EZpvd = c23524hzpEZpvd;
        C55113xdn c55113xdn = c23524hzpEZpvd.valueOf;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        CDNSourceManager.LottieSource lottieSource = CDNSourceManager.LottieSource.DEX_CEFI_SETTING_LOADING;
        C22361hds.OLrzqt(c55113xdn, lottieSource);
        C55113xdn c55113xdn2 = c23524hzpEZpvd.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
        C22361hds.OLrzqt(c55113xdn2, lottieSource);
        c23524hzpEZpvd.djBIcL.setBackground(AEQbTJ());
        c23524hzpEZpvd.fetchVPNInfo.setBackground(AEQbTJ());
    }

    public final C30822liR AEQbTJ() {
        int color = ContextCompat.getColor(getContext(), C52761wXj.Activity.invokespecialDPHOMC);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return new C30822liR(color, C55298xhM.OLrzqt(4.0f, context));
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.hvo.formatPercent$default(java.lang.String, boolean, int, int, java.math.RoundingMode, java.util.Locale, int, java.lang.Object):java.lang.String */
    public final void setSlippageValue(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.DbNXlk.setText(str.length() == 0 ? "--" : C23311hvo.formatPercent$default(str, false, 0, 0, null, null, 31, null));
    }

    public final void setPriorityFeeValue(@NotNull java.lang.String str, @NotNull PriorityFeeType priorityFeeType) {
        java.lang.String showDataWithPrefix$default;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(priorityFeeType, "");
        android.widget.TextView textView = this.EZpvd.isConnected;
        if (str.length() == 0) {
            showDataWithPrefix$default = "--";
        } else if (priorityFeeType != PriorityFeeType.PriorityCustom) {
            showDataWithPrefix$default = KWHzl(priorityFeeType);
        } else {
            showDataWithPrefix$default = C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, str, false, false, null, false, 30, null);
        }
        textView.setText(showDataWithPrefix$default);
    }

    public final void setMevDisplay(@NotNull PresetRouteType presetRouteType) {
        Intrinsics.checkNotNullParameter(presetRouteType, "");
        int i = StateListAnimator.AEQbTJ[presetRouteType.ordinal()];
        if (i == 1) {
            KWHzl(C23274hvD.Fragment.MediaControllerCompatCallback, true);
            return;
        }
        if (i == 2) {
            KWHzl(C23274hvD.Fragment.binderDied, false);
            return;
        }
        if (i == 3) {
            KWHzl(C23274hvD.Fragment.binderDied, false);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            Group group = this.EZpvd.copydefault;
            Intrinsics.checkNotNullExpressionValue(group, "");
            group.setVisibility(8);
        }
    }

    public final void KWHzl(@androidx.annotation.StringRes int i, boolean z) {
        C23524hzp c23524hzp = this.EZpvd;
        Group group = c23524hzp.copydefault;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(0);
        c23524hzp.AkhnZx.setText(i);
        c23524hzp.gEmmrt.setImageResource(z ? C52761wXj.TaskDescription.dhOYXF : C52761wXj.TaskDescription.dtVxwd);
    }

    public final java.lang.String KWHzl(PriorityFeeType priorityFeeType) {
        int i = StateListAnimator.EZpvd[priorityFeeType.ordinal()];
        if (i == 1) {
            java.lang.String string = getContext().getString(C23274hvD.Fragment.setIconUri);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
        if (i == 2) {
            java.lang.String string2 = getContext().getString(C23274hvD.Fragment.setIconBitmap);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            return string2;
        }
        if (i != 3) {
            return "--";
        }
        java.lang.String string3 = getContext().getString(C23274hvD.Fragment.newInstance);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        return string3;
    }

    public final void setInitUI(boolean z) {
        this.EZpvd.DbNXlk.setText(C23274hvD.Fragment.MediaDescriptionCompatApi21);
        this.EZpvd.isConnected.setText(C23274hvD.Fragment.DAgZj);
        Group group = this.EZpvd.copydefault;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(z ? 0 : 8);
    }
}
