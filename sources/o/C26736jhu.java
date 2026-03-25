package o;

import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import o.InterfaceC24178iXu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jhu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26736jhu extends AbstractC27115jpB<InterfaceC24178iXu.PictureInPictureParams, InterfaceC26732jhq> {
    public C26736jhu() {
        super(new yHO() { // from class: o.jhB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C26736jhu.KWHzl((android.view.LayoutInflater) obj, (android.view.ViewGroup) obj2, ((java.lang.Boolean) obj3).booleanValue());
            }
        });
    }

    public static final InterfaceC26732jhq KWHzl(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C23795iJp c23795iJpAEQbTJ = C23795iJp.AEQbTJ(layoutInflater, viewGroup, z);
        Intrinsics.checkNotNullExpressionValue(c23795iJpAEQbTJ, "");
        return new C26692jhC(c23795iJpAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull InterfaceC26732jhq interfaceC26732jhq, @NotNull InterfaceC24178iXu.PictureInPictureParams pictureInPictureParams) {
        Intrinsics.checkNotNullParameter(interfaceC26732jhq, "");
        Intrinsics.checkNotNullParameter(pictureInPictureParams, "");
        android.content.Context context = interfaceC26732jhq.getRoot().getContext();
        interfaceC26732jhq.getRoot().setPadding(interfaceC26732jhq.getRoot().getPaddingLeft(), interfaceC26732jhq.getRoot().getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.QbewEr), interfaceC26732jhq.getRoot().getPaddingRight(), interfaceC26732jhq.getRoot().getPaddingBottom());
        interfaceC26732jhq.OLrzqt().setText(context.getString(C25493ixk.FragmentManager.DarRvM));
        interfaceC26732jhq.OLrzqt().setHelperLabelType(2);
        boolean zAEQbTJ = C55296xhK.AEQbTJ(interfaceC26732jhq.OLrzqt());
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        C27492jwH c27492jwH = C27492jwH.OLrzqt;
        java.lang.String coinAmount = pictureInPictureParams.KWHzl().getCoinAmount();
        java.lang.String strLimitFmtNoZeroAndUpWithKMB$default = C27492jwH.limitFmtNoZeroAndUpWithKMB$default(c27492jwH, (coinAmount == null || coinAmount.length() == 0) ? "0" : coinAmount, 6, 2, false, 8, null);
        java.lang.String tokenSymbol = pictureInPictureParams.KWHzl().getTokenSymbol();
        if (tokenSymbol.length() == 0) {
            tokenSymbol = "";
        }
        java.lang.String str = strLimitFmtNoZeroAndUpWithKMB$default + " " + ((java.lang.Object) tokenSymbol);
        java.lang.String coinAmountAfterInput = pictureInPictureParams.KWHzl().getCoinAmountAfterInput();
        java.lang.String strLimitFmtNoZeroAndUpWithKMB$default2 = C27492jwH.limitFmtNoZeroAndUpWithKMB$default(c27492jwH, (coinAmountAfterInput == null || coinAmountAfterInput.length() == 0) ? "0" : coinAmountAfterInput, 6, 2, false, 8, null);
        java.lang.String tokenSymbol2 = pictureInPictureParams.KWHzl().getTokenSymbol();
        java.lang.String str2 = strLimitFmtNoZeroAndUpWithKMB$default2 + " " + ((java.lang.Object) (tokenSymbol2.length() != 0 ? tokenSymbol2 : ""));
        android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(ContextCompat.getColor(context, C52761wXj.Activity.QwvEab));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) str);
        spannableStringBuilder.append((java.lang.CharSequence) (zAEQbTJ ? " ← " : " → "));
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        android.text.style.ForegroundColorSpan foregroundColorSpan2 = new android.text.style.ForegroundColorSpan(ContextCompat.getColor(context, C52761wXj.Activity.fdOvFl));
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) str2);
        spannableStringBuilder.setSpan(foregroundColorSpan2, length2, spannableStringBuilder.length(), 17);
        interfaceC26732jhq.EZpvd().setText(new android.text.SpannedString(spannableStringBuilder));
        interfaceC26732jhq.copydefault().setVisibility(8);
    }
}
