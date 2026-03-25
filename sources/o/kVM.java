package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kVM {

    public static final class Activity extends android.text.style.ClickableSpan {
        public final /* synthetic */ kVO AEQbTJ;
        public final /* synthetic */ android.content.Context EZpvd;

        public Activity(android.content.Context context, kVO kvo) {
            this.EZpvd = context;
            this.AEQbTJ = kvo;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            C25352ivB.OLrzqt(this.EZpvd, this.AEQbTJ.copydefault());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(C25382ivf.KWHzl(this.EZpvd, C52761wXj.Activity.fdOvFl));
        }
    }

    public static final void EZpvd(@NotNull kVO kvo, @NotNull android.content.Context context) {
        android.text.SpannableStringBuilder spannableStringBuilder;
        Intrinsics.checkNotNullParameter(kvo, "");
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.String string = context.getString(C23274hvD.Fragment.onScrollChanged);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Activity activity = new Activity(context, kvo);
        if (kvo.AhwBna()) {
            if (kvo.EZpvd()) {
                android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(C33069mpW.KWHzl(context, C23274hvD.Fragment.r8lambdatX1ZAZ_6mxGyPSL59qbNSbD0n4g, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("pct", C23311hvo.formatPercent$default(kvo.KWHzl(), false, 0, 0, null, null, 31, null)), C56390yDp.OLrzqt("pctStrike", C23311hvo.formatPercent$default(kvo.OLrzqt(), false, 0, 0, null, null, 31, null)), C56390yDp.OLrzqt("article", string))));
                java.lang.String percent$default = C23311hvo.formatPercent$default(kvo.OLrzqt(), false, 0, 0, null, null, 31, null);
                spannableStringBuilder = spannableStringBuilder2;
                spannableStringBuilder2.setSpan(new android.text.style.StrikethroughSpan(), StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) spannableStringBuilder, percent$default, 0, false, 6, (java.lang.Object) null), StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) spannableStringBuilder, percent$default, 0, false, 6, (java.lang.Object) null) + percent$default.length(), 17);
                java.lang.String string2 = spannableStringBuilder2.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "");
                int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) string2, string, 0, false, 6, (java.lang.Object) null);
                spannableStringBuilder.setSpan(activity, iLastIndexOf$default, string.length() + iLastIndexOf$default, 17);
            } else {
                spannableStringBuilder = new android.text.SpannableStringBuilder(C33069mpW.KWHzl(context, C23274hvD.Fragment.PipHintTrackerKttrackPipAnimationHintViewflow1ExternalSyntheticLambda0, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("pct", C23311hvo.formatPercent$default(kvo.OLrzqt(), false, 0, 0, null, null, 31, null)), C56390yDp.OLrzqt("article", context.getString(C23274hvD.Fragment.onScrollChanged)))));
                java.lang.String string3 = spannableStringBuilder.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "");
                int iLastIndexOf$default2 = StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) string3, string, 0, false, 6, (java.lang.Object) null);
                spannableStringBuilder.setSpan(activity, iLastIndexOf$default2, string.length() + iLastIndexOf$default2, 17);
            }
        } else {
            spannableStringBuilder = new android.text.SpannableStringBuilder(C33069mpW.KWHzl(context, C23274hvD.Fragment.create, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("article", string))));
            java.lang.String string4 = spannableStringBuilder.toString();
            Intrinsics.checkNotNullExpressionValue(string4, "");
            int iLastIndexOf$default3 = StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) string4, string, 0, false, 6, (java.lang.Object) null);
            spannableStringBuilder.setSpan(activity, iLastIndexOf$default3, string.length() + iLastIndexOf$default3, 17);
        }
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.sendVolumeInfoChanged));
        viewOnClickListenerC54939xaY.EZpvd(spannableStringBuilder);
        java.lang.String string5 = context.getString(C23274hvD.Fragment.OcIXYQ);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, string5, (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.show();
    }

    public static final java.lang.CharSequence EZpvd(@NotNull kVO kvo) {
        Intrinsics.checkNotNullParameter(kvo, "");
        if (!kvo.AhwBna() || (kvo.EZpvd() && C23313hvq.copydefault(kvo.KWHzl(), 0))) {
            return C23311hvo.formatPercent$default("0", false, 0, 0, null, null, 31, null);
        }
        if (kvo.EZpvd()) {
            return OLrzqt(C23311hvo.formatPercent$default(kvo.OLrzqt(), false, 0, 0, null, null, 31, null), C23311hvo.formatPercent$default(kvo.KWHzl(), false, 0, 0, null, null, 31, null));
        }
        return C23311hvo.formatPercent$default(kvo.OLrzqt(), false, 0, 0, null, null, 31, null);
    }

    public static final java.lang.CharSequence OLrzqt(java.lang.String str, java.lang.String str2) {
        return C33061mpO.setupSpanStyles$default(str2 + " " + str, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.kVK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kVM.copydefault((java.util.List) obj);
            }
        }, 14, null);
    }

    public static final Unit copydefault(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new ActionBar());
        return Unit.INSTANCE;
    }

    public static final class ActionBar extends android.text.style.ClickableSpan {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setStrikeThruText(true);
            textPaint.setColor(C25382ivf.copydefault(C52761wXj.Activity.UlJrfe, C43246rlf.OLrzqt.valueOf()));
        }
    }
}
