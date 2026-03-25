package o;

import android.view.View;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.track.enums.DexSwapFullClick;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ieK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24461ieK extends AbstractC24459ieI {
    public C21515hCf copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24461ieK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24461ieK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24461ieK(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private final void KWHzl() {
        C55258xgZ c55258xgZ;
        C21515hCf c21515hCfOLrzqt = C21515hCf.OLrzqt(android.view.LayoutInflater.from(getContext()), DbNXlk(), true);
        this.copydefault = c21515hCfOLrzqt;
        if (c21515hCfOLrzqt == null || (c55258xgZ = c21515hCfOLrzqt.AEQbTJ) == null) {
            return;
        }
        c55258xgZ.setHelperLabelType(1);
    }

    @Override // o.AbstractC24459ieI
    public android.view.View AEQbTJ() {
        C21515hCf c21515hCf = this.copydefault;
        if (c21515hCf != null) {
            return c21515hCf.copydefault;
        }
        return null;
    }

    public final void setRateInfo(@NotNull QuotePriceRes quotePriceRes, @NotNull java.lang.CharSequence charSequence) {
        C21515hCf c21515hCf;
        C55258xgZ c55258xgZ;
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        C21515hCf c21515hCf2 = this.copydefault;
        if (c21515hCf2 != null) {
            if (quotePriceRes.isSingle() && (c21515hCf = this.copydefault) != null && (c55258xgZ = c21515hCf.AEQbTJ) != null) {
                c55258xgZ.setHelperLabelType(2);
            }
            c21515hCf2.copydefault.setText(charSequence);
        }
    }

    public final void setRateSwitchListener(@NotNull final Function0<Unit> function0) {
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(function0, "");
        C21515hCf c21515hCf = this.copydefault;
        if (c21515hCf == null || (textView = c21515hCf.copydefault) == null) {
            return;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: o.ieP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                function0.invoke();
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ieK */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setTitleInfoCallBack$default(C24461ieK c24461ieK, android.app.Activity activity, java.lang.String str, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        c24461ieK.setTitleInfoCallBack(activity, str, function0);
    }

    public final void setTitleInfoCallBack(final android.app.Activity activity, @NotNull final java.lang.String str, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        C21515hCf c21515hCf = this.copydefault;
        if (c21515hCf != null) {
            C25352ivB.setOnDoubleCheckClickListener$default(c21515hCf.AEQbTJ, 0L, new Function1() { // from class: o.ieM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24461ieK.EZpvd(activity, str, function0, (android.view.View) obj);
                }
            }, 1, null);
        }
    }

    public static final Unit EZpvd(android.app.Activity activity, java.lang.String str, Function0 function0, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (activity != null) {
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
            viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.RSmiaq));
            viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultCallerLauncherresultContract2));
            ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C23274hvD.Fragment.buildRccMetadata, (View.OnClickListener) null, 2, (java.lang.Object) null);
            viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
            viewOnClickListenerC54939xaY.show();
        }
        C22877hne.trackDexSwapFullClick$default(C22877hne.OLrzqt, str, DexSwapFullClick.TOOLTIP_RATE.getValue(), false, null, 12, null);
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull QuotePriceRes quotePriceRes, @NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        setRateInfo(quotePriceRes, charSequence);
        C21515hCf c21515hCf = this.copydefault;
        if (c21515hCf != null) {
            c21515hCf.copydefault.setClickable(true);
        }
    }

    public final void EZpvd() {
        android.widget.TextView textView;
        C21515hCf c21515hCf = this.copydefault;
        if (c21515hCf == null || (textView = c21515hCf.copydefault) == null) {
            return;
        }
        textView.setClickable(false);
    }
}
