package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.okinc.uilab.util.TipTool;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dqw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14731dqw {
    public static final C14731dqw AEQbTJ = new C14731dqw();
    public static java.lang.String EZpvd = "";
    public static final int KWHzl = 8;

    private C14731dqw() {
    }

    public final java.lang.CharSequence AEQbTJ(@NotNull android.widget.TextView textView, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        EZpvd = str2;
        return EZpvd(textView, str, function0);
    }

    public final java.lang.CharSequence OLrzqt(@NotNull android.widget.TextView textView, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        EZpvd = C33069mpW.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.fcfzuX), C56423yEv.EZpvd(C56390yDp.OLrzqt("token", str2)));
        return EZpvd(textView, str, function0);
    }

    public final java.lang.CharSequence EZpvd(final android.widget.TextView textView, java.lang.String str, final Function0<Unit> function0) {
        if (EZpvd.length() == 0) {
            return C33061mpO.setupSpanStyles$default(str, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.dqD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14731dqw.OLrzqt(textView, (java.util.List) obj);
                }
            }, 14, null);
        }
        java.lang.String string = C14631dpB.copydefault.copydefault(textView, str + "  " + EZpvd, EZpvd, yDY.AhwBna()).toString();
        textView.setOnTouchListener(new ViewOnTouchListenerC14460dlq(textView, string, EZpvd, new Function0() { // from class: o.dqA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14731dqw.AEQbTJ(function0);
            }
        }));
        return C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(string, new java.lang.String[]{StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) StringsKt__StringsKt.EZpvd(string, (java.lang.CharSequence) EZpvd)).toString()}, 0, null, false, new Function1() { // from class: o.dqB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14731dqw.AEQbTJ(textView, (java.util.List) obj);
            }
        }, 14, null), new java.lang.String[]{EZpvd}, 0, null, false, new Function1() { // from class: o.dqC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14731dqw.AYXKKw(textView, (java.util.List) obj);
            }
        }, 14, null);
    }

    public static final Unit OLrzqt(android.widget.TextView textView, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.DQzvGN)));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(android.widget.TextView textView, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.DGOPHZ)));
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(android.widget.TextView textView, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.fdOvFl)));
        list.add(new android.text.style.UnderlineSpan());
        return Unit.INSTANCE;
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!C33129mqd.AEQbTJ(java.lang.Integer.valueOf(str.length()), java.lang.Integer.valueOf(i))) {
            return str;
        }
        java.lang.String strSubstring = str.substring(0, i);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring + "…";
    }

    public final void copydefault(@NotNull android.widget.TextView textView, @NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() > i) {
            textView.setText(AEQbTJ(str, i));
            textView.setOnClickListener(new ActionBar(textView, 1000L, str, textView));
        } else {
            textView.setText(str);
        }
    }

    public static /* synthetic */ android.text.SpannableStringBuilder buildSpannableStringWithIcon$default(C14731dqw c14731dqw, java.lang.String str, int i, java.lang.Integer num, int i2, android.content.Context context, int i3, java.lang.Object obj) {
        java.lang.Integer num2 = (i3 & 4) != 0 ? null : num;
        if ((i3 & 8) != 0) {
            i2 = (int) C55298xhM.dp$default(16.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        }
        return c14731dqw.copydefault(str, i, num2, i2, context);
    }

    public final android.text.SpannableStringBuilder copydefault(@NotNull java.lang.String str, @androidx.annotation.DrawableRes int i, @androidx.annotation.ColorRes java.lang.Integer num, int i2, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(str);
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, i);
        if (drawable != null) {
            drawable.setBounds(0, 0, i2, i2);
            drawable.setLayoutDirection(context.getResources().getConfiguration().getLayoutDirection());
            if (num != null) {
                DrawableCompat.setTint(drawable, ContextCompat.getColor(context, num.intValue()));
            }
            C57306yft c57306yft = new C57306yft(drawable, (int) C55298xhM.dp$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null), (int) C55298xhM.dp$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null));
            spannableStringBuilder.append((java.lang.CharSequence) "\ufeff￼");
            spannableStringBuilder.setSpan(c57306yft, str.length() + 1, str.length() + 2, 33);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: o.dqw$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ android.widget.TextView EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, java.lang.String str, android.widget.TextView textView) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = str;
            this.EZpvd = textView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                TipTool tipToolKWHzl = TipTool.Companion.KWHzl((android.widget.TextView) this.AEQbTJ).OLrzqt(this.copydefault).copydefault(14.0f).AEQbTJ(TipTool.Position.TOP).OLrzqt(0, 0, 0, 0).EZpvd(true).KWHzl(16.0f);
                android.content.Context context = this.EZpvd.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                tipToolKWHzl.EZpvd(C55298xhM.copydefault(8.0f, context)).djBIcL();
            }
        }
    }
}
