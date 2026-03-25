package o;

import androidx.core.content.ContextCompat;
import com.okinc.business.invest_biz.data.contants.HealthRateLevel;
import com.okinc.business.invest_biz.ui.screens.transaction.itembinder.TransactionHealthFactorItemBinder$1;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import o.InterfaceC24178iXu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jhs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26734jhs extends AbstractC27119jpF<InterfaceC24178iXu.ActionBar, C23838iLe> {
    public C26734jhs() {
        super(TransactionHealthFactorItemBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C23838iLe c23838iLe, @NotNull InterfaceC24178iXu.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(c23838iLe, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        android.content.Context context = c23838iLe.getRoot().getContext();
        c23838iLe.gEmmrt.setText(context.getString(C25493ixk.FragmentManager.hBpjJd));
        android.widget.TextView textView = c23838iLe.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        boolean zAEQbTJ = C55296xhK.AEQbTJ(textView);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.lang.String oldHealthFactor = actionBar.AEQbTJ().getOldHealthFactor();
        java.lang.String str = "--";
        if (oldHealthFactor == null || oldHealthFactor.length() == 0) {
            oldHealthFactor = "--";
        }
        android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(ContextCompat.getColor(context, C52761wXj.Activity.QwvEab));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) oldHealthFactor);
        spannableStringBuilder.append((java.lang.CharSequence) (zAEQbTJ ? " ← " : " → "));
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        c23838iLe.valueOf.setText(new android.text.SpannedString(spannableStringBuilder));
        HealthRateLevel healthLevel = actionBar.AEQbTJ().getHealthLevel();
        C27536jwz c27536jwz = C27536jwz.OLrzqt;
        int iKWHzl = c27536jwz.KWHzl(healthLevel);
        android.widget.TextView textView2 = c23838iLe.EZpvd;
        C27488jwD c27488jwD = C27488jwD.copydefault;
        java.lang.String newHealthFactor = actionBar.AEQbTJ().getNewHealthFactor();
        if (newHealthFactor != null && newHealthFactor.length() != 0) {
            str = newHealthFactor;
        }
        textView2.setText(c27488jwD.KWHzl(str));
        textView2.setTextColor(ContextCompat.getColor(context, iKWHzl));
        c23838iLe.AEQbTJ.setBackgroundTintList(android.content.res.ColorStateList.valueOf(c27536jwz.EZpvd(ContextCompat.getColor(context, iKWHzl), 10)));
        android.widget.ImageView imageView = c23838iLe.OLrzqt;
        imageView.setImageDrawable(ContextCompat.getDrawable(context, C27487jwC.KWHzl.OLrzqt(healthLevel)));
        imageView.setImageTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(context, iKWHzl)));
    }
}
