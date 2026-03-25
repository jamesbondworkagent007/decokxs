package o;

import androidx.core.content.ContextCompat;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.network.okg.response.ResponseFailedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C25493ixk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jxn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27577jxn {
    public static final C27577jxn copydefault = new C27577jxn();

    public final boolean AEQbTJ(int i, boolean z, int i2) {
        return (i == 2 || z || i2 <= 0) ? false : true;
    }

    public final boolean AEQbTJ(int i, boolean z, boolean z2, int i2) {
        if (i == 2 && z) {
            if (!z2 && i2 > 0) {
                return true;
            }
            if (z2 && i2 > 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown Type" : "stake" : "vaults" : "farm" : "pool" : "save";
    }

    private C27577jxn() {
    }

    public final boolean OLrzqt(java.lang.Integer num) {
        return num != null && num.intValue() == 1;
    }

    public final boolean EZpvd(java.lang.Integer num) {
        return num != null && num.intValue() == 2;
    }

    public final boolean copydefault(java.lang.Integer num) {
        return num != null && num.intValue() == 3;
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof ResponseFailedException) {
            java.lang.String errorMsg = ((ResponseFailedException) th).getErrorMsg();
            return errorMsg.length() == 0 ? C33070mpX.AYXKKw(C25493ixk.FragmentManager.DIIpTV) : errorMsg;
        }
        return C33070mpX.AYXKKw(C25493ixk.FragmentManager.zSsVtY);
    }

    public final java.lang.String KWHzl(@NotNull java.util.List<InvestTokenWithAmount> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (InvestTokenWithAmount investTokenWithAmount : list) {
            if (sb.length() > 0) {
                sb.append(C33070mpX.AYXKKw(C25493ixk.FragmentManager.DcqEDu));
            }
            sb.append(investTokenWithAmount.getTokenSymbol());
        }
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final <T> kotlin.Pair<java.lang.Boolean, java.util.List<InvestTokenWithAmount>> EZpvd(@NotNull java.util.List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z = false;
        for (T t : list) {
            if ((t instanceof InvestTokenWithAmount) && C33129mqd.OLrzqt((java.lang.Object) ((InvestTokenWithAmount) t).getCurrencyAmount(), (java.lang.Object) 0)) {
                if (!z) {
                    z = true;
                }
                arrayList.add(t);
            }
        }
        return new kotlin.Pair<>(java.lang.Boolean.valueOf(z), arrayList);
    }

    public final void copydefault(@NotNull android.widget.TextView textView, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, str2, 0, false, 6, (java.lang.Object) null);
        if (iIndexOf$default == -1) {
            return;
        }
        int length = str2.length() + iIndexOf$default;
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.fdOvFl)), iIndexOf$default, length, 33);
        spannableString.setSpan(new TaskDescription(function0), iIndexOf$default, length, 33);
        textView.setText(spannableString);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: o.jxn$TaskDescription */
    public static final class TaskDescription extends android.text.style.ClickableSpan {
        public final /* synthetic */ Function0<Unit> AEQbTJ;

        public TaskDescription(Function0<Unit> function0) {
            this.AEQbTJ = function0;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            view.cancelPendingInputEvents();
            this.AEQbTJ.invoke();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(true);
        }
    }

    public final int copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
    }
}
