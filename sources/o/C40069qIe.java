package o;

import android.view.View;
import androidx.core.os.BundleKt;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C40069qIe;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qIe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C40069qIe {
    public static final C40069qIe KWHzl = new C40069qIe();

    private C40069qIe() {
    }

    public static /* synthetic */ InterfaceC19677gLf createDialogHandler$default(C40069qIe c40069qIe, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = -1;
        }
        return c40069qIe.AEQbTJ(num);
    }

    public final InterfaceC19677gLf AEQbTJ(final java.lang.Integer num) {
        return new InterfaceC19677gLf() { // from class: o.qIk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC19677gLf
            public final void OLrzqt(android.content.Context context, Function0 function0, Function0 function02) {
                C40069qIe.KWHzl(num, context, function0, function02);
            }
        };
    }

    public static final void KWHzl(java.lang.Integer num, android.content.Context context, Function0 function0, Function0 function02) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        KWHzl.EZpvd(context, num, function0, function02);
    }

    public final InterfaceC19674gLc AEQbTJ() {
        return new InterfaceC19674gLc() { // from class: o.qIj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC19674gLc
            public final boolean KWHzl() {
                return C40069qIe.EZpvd();
            }
        };
    }

    public static final boolean EZpvd() {
        return SPUtils.getBoolean("show_disclaimer_dialog", true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qIe */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showDisclaimerDialog$default(C40069qIe c40069qIe, android.content.Context context, java.lang.Integer num, Function0 function0, Function0 function02, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            num = -1;
        }
        if ((i & 8) != 0) {
            function02 = null;
        }
        c40069qIe.EZpvd(context, num, function0, function02);
    }

    public final void EZpvd(@NotNull android.content.Context context, java.lang.Integer num, @NotNull final Function0<Unit> function0, final Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function0, "");
        final java.lang.String str = (num != null && num.intValue() == -1) ? "search_history" : "search_result";
        C32866mlf.onEvent$default("Search_DexLegalPopUp_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.qIf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40069qIe.KWHzl(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        android.text.SpannableString spannableString = new android.text.SpannableString(C33070mpX.AYXKKw(qZH.PendingIntent.iqeXgQ));
        spannableString.setSpan(new Activity(context, str), 0, spannableString.length(), 0);
        android.text.SpannableString spannableString2 = new android.text.SpannableString(C33070mpX.AYXKKw(qZH.PendingIntent.HJWChPRGtXKC));
        spannableString2.setSpan(new ActionBar(context, str), 0, spannableString2.length(), 0);
        android.text.SpannableStringBuilder spannableStringBuilderCopydefault = C33069mpW.copydefault(context, qZH.PendingIntent.BVXAa, (java.util.Map<java.lang.String, ? extends android.text.Spannable>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("termsService", spannableString), C56390yDp.OLrzqt("privacyNotice", spannableString2)));
        boolean zEZpvd = ((InterfaceC49494upc) C43251rlk.copydefault(InterfaceC49494upc.class)).EZpvd();
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.EZpvd(spannableStringBuilderCopydefault);
        final android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(qZH.ActionBar.DFbvW, (android.view.ViewGroup) null);
        final wYK wyk = (wYK) viewInflate.findViewById(qZH.StateListAnimator.fdOvFl);
        Intrinsics.copydefault(viewInflate);
        viewOnClickListenerC54939xaY.EZpvd(viewInflate);
        viewInflate.setVisibility(zEZpvd ^ true ? 0 : 8);
        final java.lang.String str2 = str;
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(qZH.PendingIntent.AuCTel), new View.OnClickListener() { // from class: o.qIb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C40069qIe.copydefault(viewInflate, wyk, function0, viewOnClickListenerC54939xaY, str2, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(qZH.PendingIntent.iwGUEr, new View.OnClickListener() { // from class: o.qIh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C40069qIe.KWHzl(function02, viewOnClickListenerC54939xaY, str, wyk, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final Unit KWHzl(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "from_page", str, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.qIe$Activity */
    public static final class Activity extends android.text.style.ClickableSpan {
        public final /* synthetic */ android.content.Context EZpvd;
        public final /* synthetic */ java.lang.String OLrzqt;

        public Activity(android.content.Context context, java.lang.String str) {
            this.EZpvd = context;
            this.OLrzqt = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            final java.lang.String str = this.OLrzqt;
            C32866mlf.onEvent$default("Search_DexLegalPopUp_Link_Click", (TrackChannel[]) null, new Function1() { // from class: o.qIg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C40069qIe.Activity.copydefault(str, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            C40069qIe.KWHzl.AEQbTJ(this.EZpvd, C33070mpX.AYXKKw(qZH.PendingIntent.ikIEnW));
        }

        public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "from_page", str, false, 4, null);
            EventParamsList.put$default(eventParamsList, "link", "terms_of_service", false, 4, null);
            return Unit.INSTANCE;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(true);
            textPaint.setColor(this.EZpvd.getColor(C52761wXj.Activity.fdOvFl));
        }
    }

    /* JADX INFO: renamed from: o.qIe$ActionBar */
    public static final class ActionBar extends android.text.style.ClickableSpan {
        public final /* synthetic */ android.content.Context AEQbTJ;
        public final /* synthetic */ java.lang.String copydefault;

        public ActionBar(android.content.Context context, java.lang.String str) {
            this.AEQbTJ = context;
            this.copydefault = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            final java.lang.String str = this.copydefault;
            C32866mlf.onEvent$default("Search_DexLegalPopUp_Link_Click", (TrackChannel[]) null, new Function1() { // from class: o.qIi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C40069qIe.ActionBar.copydefault(str, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            C40069qIe.KWHzl.AEQbTJ(this.AEQbTJ, C33070mpX.AYXKKw(qZH.PendingIntent.HJWChPUUMfbK));
        }

        public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "from_page", str, false, 4, null);
            EventParamsList.put$default(eventParamsList, "link", "privacy_notice", false, 4, null);
            return Unit.INSTANCE;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(true);
            textPaint.setColor(this.AEQbTJ.getColor(C52761wXj.Activity.fdOvFl));
        }
    }

    public static final void copydefault(android.view.View view, final wYK wyk, Function0 function0, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, final java.lang.String str, android.view.View view2) {
        Intrinsics.copydefault(view);
        if (view.getVisibility() == 0 && wyk.isChecked()) {
            SPUtils.put("show_disclaimer_dialog", java.lang.Boolean.FALSE);
        }
        C32866mlf.onEvent$default("Search_DexLegalPopUp_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.qIc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40069qIe.AEQbTJ(str, wyk, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        function0.invoke();
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit AEQbTJ(java.lang.String str, wYK wyk, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "from_page", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "Button", "continue", false, 4, null);
        EventParamsList.put$default(eventParamsList, "is_checked_do_not_show_again", java.lang.String.valueOf(wyk.isChecked()), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function0 function0, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, final java.lang.String str, final wYK wyk, android.view.View view) {
        C32866mlf.onEvent$default("Search_DexLegalPopUp_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.qId
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40069qIe.KWHzl(str, wyk, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        if (function0 != null) {
            function0.invoke();
        }
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit KWHzl(java.lang.String str, wYK wyk, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "from_page", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "Button", "back", false, 4, null);
        EventParamsList.put$default(eventParamsList, "is_checked_do_not_show_again", java.lang.String.valueOf(wyk.isChecked()), false, 4, null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(android.content.Context context, java.lang.String str) {
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("title", "")), null, 4, null);
    }
}
