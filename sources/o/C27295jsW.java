package o;

import android.view.View;
import androidx.core.graphics.drawable.DrawableCompat;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.invest_biz.data.bean.InvestLogo;
import com.okinc.business.invest_biz.data.bean.InvestLogoBaseVo;
import com.okinc.business.invest_biz.ui.widget.defi_dashboard.binder.ProtocolItemBinder$1;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import o.InterfaceC27286jsN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jsW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27295jsW extends AbstractC27119jpF<C27369jtr, C23802iJw> {
    public final InterfaceC56387yDm EZpvd;
    public final Function1<InterfaceC27286jsN.PendingIntent, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.jsN$PendingIntent, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C27295jsW(@NotNull Function1<? super InterfaceC27286jsN.PendingIntent, Unit> function1) {
        super(ProtocolItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.jsY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27295jsW.EZpvd();
            }
        });
    }

    public final C24199iYo copydefault() {
        return (C24199iYo) this.EZpvd.getValue();
    }

    public static final C24199iYo EZpvd() {
        return new C24199iYo();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull final C23802iJw c23802iJw, @NotNull final C27369jtr c27369jtr) {
        Intrinsics.checkNotNullParameter(c23802iJw, "");
        Intrinsics.checkNotNullParameter(c27369jtr, "");
        final android.content.Context context = c23802iJw.getRoot().getContext();
        c23802iJw.djBIcL.setText(c27369jtr.djBIcL());
        c23802iJw.AYXKKw.setText(c27369jtr.EZpvd());
        c23802iJw.valueOf.setText(C27488jwD.copydefault.KWHzl(C27586jxw.OLrzqt.KWHzl(C33129mqd.EZpvd(c27369jtr.AEQbTJ()), (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : null, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, (46 & 32) != 0 ? RoundingMode.DOWN : null)));
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        Intrinsics.copydefault(context);
        c27569jxf.EZpvd(context, c23802iJw.EZpvd, new InvestLogo(C56402yEa.EZpvd(new InvestLogoBaseVo(c27369jtr.KWHzl(), c27369jtr.KWHzl())), C56402yEa.EZpvd(new InvestLogoBaseVo(c27369jtr.AYXKKw(), c27369jtr.djBIcL())), (java.util.List) null, (java.util.List) null, 12, (DefaultConstructorMarker) null), C25493ixk.TaskDescription.OLrzqt, 0.1f);
        android.widget.TextView textView = c23802iJw.values;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        int i = 0;
        textView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c27369jtr.isConnected()) ? 0 : 8);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) c27369jtr.isConnected())) {
            android.graphics.drawable.Drawable drawableEZpvd = C33070mpX.EZpvd(C52761wXj.TaskDescription.finishInit, context);
            if (drawableEZpvd != null) {
                drawableEZpvd.setBounds(0, 0, C55298xhM.KWHzl(16.0f, context), C55298xhM.KWHzl(16.0f, context));
                DrawableCompat.setTint(drawableEZpvd, C33070mpX.OLrzqt(C52761wXj.Activity.gdmIOq, context));
            }
            c23802iJw.values.setCompoundDrawablesRelative(drawableEZpvd, null, null, null);
            c23802iJw.values.setText(c27369jtr.isConnected());
        }
        boolean z = !C33129mqd.OLrzqt((java.lang.CharSequence) c27369jtr.isConnected()) && C33129mqd.OLrzqt((java.lang.CharSequence) c27369jtr.AhwBna());
        android.widget.TextView textView2 = c23802iJw.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(z ? 0 : 8);
        if (z) {
            c23802iJw.fetchVPNInfo.setText(c27369jtr.valueOf());
            android.widget.TextView textView3 = c23802iJw.fetchVPNInfo;
            android.content.Context context2 = textView3.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            textView3.setTextColor(C27569jxf.getAssetColor$default(c27569jxf, context2, c27369jtr.AhwBna(), 0, 2, null));
        }
        c23802iJw.KWHzl.setImageDrawable(C33070mpX.EZpvd(c27369jtr.AkhnZx() ? C52761wXj.TaskDescription.DNMMPQ : C52761wXj.TaskDescription.DCUTEIddSDPG, context));
        c23802iJw.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.jtb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27295jsW.KWHzl(this.KWHzl, c27369jtr, context, c23802iJw, view);
            }
        });
        C27291jsS c27291jsS = c23802iJw.copydefault;
        Intrinsics.checkNotNullExpressionValue(c27291jsS, "");
        if (!c27369jtr.AkhnZx() && c27369jtr.OLrzqt() == null) {
            i = 8;
        }
        c27291jsS.setVisibility(i);
        if (c27369jtr.OLrzqt() != null) {
            c23802iJw.copydefault.setData(c27369jtr.OLrzqt());
        }
        if (c27369jtr.AkhnZx()) {
            copydefault().copydefault(c27369jtr.gEmmrt());
        }
    }

    public static final void KWHzl(C27295jsW c27295jsW, C27369jtr c27369jtr, android.content.Context context, C23802iJw c23802iJw, android.view.View view) {
        c27295jsW.copydefault.invoke(new InterfaceC27286jsN.PendingIntent(c27369jtr.gEmmrt(), c27369jtr.copydefault(), !c27369jtr.AkhnZx()));
        android.view.animation.Animation animationLoadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, c27369jtr.AkhnZx() ? C52761wXj.Application.valueOf : C52761wXj.Application.AEQbTJ);
        animationLoadAnimation.setDuration(50L);
        c23802iJw.copydefault.startAnimation(animationLoadAnimation);
    }
}
