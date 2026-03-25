package o;

import androidx.core.content.ContextCompat;
import com.okinc.business.invest_biz.data.bean.CollateralRatioInfo;
import com.okinc.business.invest_biz.ui.screens.transaction.itembinder.InvestCollateralRatioItemBinder$1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC24178iXu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26716jha extends AbstractC27119jpF<InterfaceC24178iXu.Application, iJY> {
    public final Function0<java.lang.Boolean> copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26716jha(@NotNull Function0<java.lang.Boolean> function0) {
        super(InvestCollateralRatioItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault = function0;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull iJY ijy, @NotNull InterfaceC24178iXu.Application application) {
        Intrinsics.checkNotNullParameter(ijy, "");
        Intrinsics.checkNotNullParameter(application, "");
        ijy.OLrzqt.setText(ijy.getRoot().getContext().getString(application.KWHzl()));
        ijy.AEQbTJ.setText("");
        if (application.copydefault() == null) {
            copydefault(ijy, application.AEQbTJ(), this.copydefault.invoke().booleanValue(), application.OLrzqt());
        } else {
            copydefault(ijy, application.copydefault(), this.copydefault.invoke().booleanValue(), application.OLrzqt());
        }
    }

    public static /* synthetic */ void setCollateralRatioText$default(C26716jha c26716jha, iJY ijy, CollateralRatioInfo collateralRatioInfo, boolean z, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            num = null;
        }
        c26716jha.copydefault(ijy, collateralRatioInfo, z, num);
    }

    public final void copydefault(iJY ijy, CollateralRatioInfo collateralRatioInfo, boolean z, java.lang.Integer num) {
        android.content.Context context = ijy.getRoot().getContext();
        android.widget.TextView textView = ijy.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        boolean zAEQbTJ = C55296xhK.AEQbTJ(textView);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) collateralRatioInfo.getRealCollateralRatio())) {
            Intrinsics.copydefault(context);
            java.lang.String collateralRatio = collateralRatioInfo.getCollateralRatio();
            if (collateralRatio == null) {
                collateralRatio = collateralRatioInfo.getSafeCollateralRatio();
            }
            java.lang.String strCopydefault = C26720jhe.copydefault(context, collateralRatio);
            java.lang.String realCollateralRatio = collateralRatioInfo.getRealCollateralRatio();
            if (realCollateralRatio == null) {
                realCollateralRatio = collateralRatioInfo.getSafeCollateralRatio();
            }
            java.lang.String strCopydefault2 = C26720jhe.copydefault(context, realCollateralRatio);
            android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(ContextCompat.getColor(context, C52761wXj.Activity.QwvEab));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) strCopydefault);
            if (!z) {
                spannableStringBuilder.append((java.lang.CharSequence) "\n");
            }
            spannableStringBuilder.append((java.lang.CharSequence) (zAEQbTJ ? " ← " : " → "));
            spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
            java.lang.Integer realCollateralLevel = collateralRatioInfo.getRealCollateralLevel();
            android.text.style.ForegroundColorSpan foregroundColorSpan2 = new android.text.style.ForegroundColorSpan(ContextCompat.getColor(context, (realCollateralLevel != null && realCollateralLevel.intValue() == 0) ? C52761wXj.Activity.fdOvFl : C52761wXj.Activity.DQzvGN));
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) strCopydefault2);
            spannableStringBuilder.setSpan(foregroundColorSpan2, length2, spannableStringBuilder.length(), 17);
        } else {
            java.lang.String safeCollateralRatio = (num != null && num.intValue() == 0) ? collateralRatioInfo.getSafeCollateralRatio() : collateralRatioInfo.getCollateralRatio();
            Intrinsics.copydefault(context);
            spannableStringBuilder.append((java.lang.CharSequence) C26720jhe.copydefault(context, safeCollateralRatio));
        }
        android.text.SpannedString spannedString = new android.text.SpannedString(spannableStringBuilder);
        android.widget.TextView textView2 = ijy.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(z ? 0 : 8);
        android.widget.TextView textView3 = ijy.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setVisibility(z ^ true ? 0 : 8);
        if (z) {
            ijy.EZpvd.setText(spannedString);
        } else {
            ijy.KWHzl.setText(spannedString);
        }
    }
}
