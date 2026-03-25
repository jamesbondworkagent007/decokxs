package o;

import android.view.View;
import com.okinc.business.dexui.main.swap.setting.widget.NetWorkFeeShowType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ieJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewOnClickListenerC24460ieJ extends AbstractC24459ieI implements View.OnClickListener {
    public Function0<Unit> EZpvd;
    public boolean KWHzl;
    public Function0<Unit> OLrzqt;
    public final hFR copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC24460ieJ(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.EZpvd = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitleInfoCallBack(@NotNull java.lang.String str, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:22) call: o.ieJ.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ ViewOnClickListenerC24460ieJ(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC24460ieJ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        hFR hfrOLrzqt = hFR.OLrzqt(android.view.LayoutInflater.from(context), DbNXlk(), true);
        Intrinsics.checkNotNullExpressionValue(hfrOLrzqt, "");
        this.copydefault = hfrOLrzqt;
    }

    @Override // o.AbstractC24459ieI
    public android.view.View AEQbTJ() {
        android.widget.FrameLayout frameLayout = this.copydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        return frameLayout;
    }

    public android.widget.TextView OLrzqt() {
        android.widget.TextView textView = this.copydefault.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public static /* synthetic */ void initData$default(ViewOnClickListenerC24460ieJ viewOnClickListenerC24460ieJ, java.lang.String str, boolean z, java.lang.String str2, NetWorkFeeShowType netWorkFeeShowType, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            netWorkFeeShowType = NetWorkFeeShowType.NOT_FREE;
        }
        viewOnClickListenerC24460ieJ.OLrzqt(str, z, str2, netWorkFeeShowType);
    }

    public final void OLrzqt(@NotNull java.lang.String str, boolean z, java.lang.String str2, @NotNull NetWorkFeeShowType netWorkFeeShowType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(netWorkFeeShowType, "");
        hFR hfr = this.copydefault;
        this.KWHzl = z;
        if (!z || netWorkFeeShowType == NetWorkFeeShowType.FREE_WITH_FEE_CROSSED) {
            hfr.valueOf.setHelperLabelType(2);
            hfr.valueOf.setOnClickListener(null);
            if (netWorkFeeShowType == NetWorkFeeShowType.FREE_WITH_FEE_CROSSED) {
                hfr.valueOf.setTextValue(C33070mpX.AYXKKw(C23274hvD.Fragment.DQzvGN));
            } else {
                hfr.valueOf.setTextValue(C33070mpX.AYXKKw(C23274hvD.Fragment.hlkKmr));
            }
        } else {
            hfr.valueOf.setTextValue(C33070mpX.AYXKKw(C23274hvD.Fragment.hlkKmr));
            hfr.valueOf.setHelperLabelType(1);
            hfr.valueOf.setOnClickListener(this);
        }
        hfr.AhwBna.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.Dmq));
        if (netWorkFeeShowType == NetWorkFeeShowType.FREE_WITH_FEE_CROSSED) {
            hfr.AhwBna.setTextColor(C25382ivf.KWHzl(C52761wXj.ActionBar.DCUTEI));
            if ((str2 != null && str2.length() == 0) || C59449zhJ.AEQbTJ((java.lang.CharSequence) str2, (java.lang.CharSequence) "--")) {
                hfr.AkhnZx.getPaint().setStrikeThruText(false);
                hfr.AkhnZx.setVisibility(8);
            } else {
                hfr.AkhnZx.setVisibility(0);
                hfr.AkhnZx.setText(str2);
                hfr.AkhnZx.getPaint().setStrikeThruText(true);
            }
            hfr.AhwBna.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.LocalActivityResultRegistryOwner));
        } else {
            hfr.AkhnZx.getPaint().setStrikeThruText(false);
            hfr.AkhnZx.setVisibility(8);
            hfr.AhwBna.setText(str);
        }
        hfr.AhwBna.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        Function0<Unit> function0;
        if (!this.KWHzl || (function0 = this.EZpvd) == null) {
            return;
        }
        function0.invoke();
    }
}
