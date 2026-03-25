package o;

import android.text.TextPaint;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.FragmentActivity;
import com.okinc.im.imui.relationlist.model.ReferralData;
import com.okinc.im.imui.relationlist.model.RewardType;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.ShareFooterInfo;
import com.okinc.share.bean.link.LinkDefaultPreviewConfig;
import com.okinc.share.bean.link.LinkShareParams;
import com.okinc.share.bean.text.TextShareParams;
import com.okinc.share.platforms.SharePlatform;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.orW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37314orW extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public nJP OLrzqt;

    /* JADX INFO: renamed from: o.orW$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RewardType.values().length];
            try {
                iArr[RewardType.FIXED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[RewardType.RANDOM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[RewardType.NO_REWARD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    /* JADX INFO: renamed from: o.orW$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.orW.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C37314orW KWHzl(@NotNull ReferralData referralData) {
            Intrinsics.checkNotNullParameter(referralData, "");
            C37314orW c37314orW = new C37314orW();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("arg_referral_data", referralData);
            c37314orW.setArguments(bundle);
            return c37314orW;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        wxq.AEQbTJ().setVisibility(0);
        wxq.KWHzl().setVisibility(8);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        RewardType rewardTypeKWHzl;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.OLrzqt = nJP.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
        android.os.Bundle arguments = getArguments();
        ReferralData referralData = arguments != null ? (ReferralData) BundleCompat.getParcelable(arguments, "arg_referral_data", ReferralData.class) : null;
        if (referralData == null) {
            pUU.KWHzl("ReferralBottomSheet", "Referral data not found");
            dismiss();
            return;
        }
        java.lang.String strAEQbTJ = referralData.AEQbTJ();
        if (strAEQbTJ == null || strAEQbTJ.length() == 0) {
            rewardTypeKWHzl = RewardType.NO_REWARD;
        } else {
            rewardTypeKWHzl = referralData.KWHzl();
        }
        java.lang.String strOLrzqt = referralData.OLrzqt();
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(referralData.AEQbTJ());
        java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(referralData.copydefault());
        nJP njp = this.OLrzqt;
        if (njp != null) {
            OLrzqt(njp, rewardTypeKWHzl, strOLrzqt, strGEmmrt);
            copydefault(njp, rewardTypeKWHzl, strOLrzqt, strGEmmrt);
            ActionBar actionBarAEQbTJ = AEQbTJ();
            C52794wYp c52794wYp = njp.KWHzl;
            c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this, strGEmmrt2, actionBarAEQbTJ));
            EZpvd(actionBarAEQbTJ);
        }
    }

    public final void OLrzqt(nJP njp, RewardType rewardType, java.lang.String str, java.lang.String str2) {
        java.lang.String strAYXKKw;
        android.widget.TextView textView = njp.valueOf;
        if (str == null || str.length() == 0) {
            strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.DzkRMH);
        } else if (rewardType == RewardType.FIXED) {
            strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.HJWChPfrwjPh);
        } else if (rewardType == RewardType.RANDOM) {
            strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.dpErvT);
        } else {
            strAYXKKw = rewardType == RewardType.NO_REWARD ? C33070mpX.AYXKKw(C35399nuc.LoaderManager.iOIMNp) : C33070mpX.AYXKKw(C35399nuc.LoaderManager.DzkRMH);
        }
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        if (str == null) {
            str = "";
        }
        pairArr[0] = C56390yDp.OLrzqt("phonebookName", str);
        pairArr[1] = C56390yDp.OLrzqt("rewardAmount", str2);
        textView.setText(C33069mpW.OLrzqt(strAYXKKw, C56424yEw.gEmmrt(pairArr)));
    }

    public final void copydefault(nJP njp, RewardType rewardType, java.lang.String str, java.lang.String str2) {
        int i;
        int i2 = Application.copydefault[rewardType.ordinal()];
        if (i2 == 1) {
            i = (str == null || str.length() == 0) ? C35399nuc.LoaderManager.abAflu : C35399nuc.LoaderManager.QSAYLr;
        } else if (i2 == 2) {
            i = (str == null || str.length() == 0) ? C35399nuc.LoaderManager.glVQsU : C35399nuc.LoaderManager.gdwsGQ;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = (str == null || str.length() == 0) ? C35399nuc.LoaderManager.DwQSDd : C35399nuc.LoaderManager.apHBvG;
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(C33070mpX.AYXKKw(C35399nuc.LoaderManager.HJWChPfvRMlC));
        spannableString.setSpan(new android.text.style.UnderlineSpan() { // from class: com.okinc.im.imui.relationlist.ui.referral.ReferralBottomSheet$setDescription$descriptionSpanBuilder$1$1$1
            @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                Intrinsics.checkNotNullParameter(textPaint, "");
                super.updateDrawState(textPaint);
                textPaint.setColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            }
        }, 0, spannableString.length(), 33);
        spannableString.setSpan(new StateListAnimator(), 0, spannableString.length(), 33);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        if (str == null) {
            str = "";
        }
        android.text.SpannableString spannableStringValueOf = android.text.SpannableString.valueOf(str);
        Intrinsics.checkNotNullExpressionValue(spannableStringValueOf, "");
        pairArr[0] = C56390yDp.OLrzqt("phonebookName", spannableStringValueOf);
        android.text.SpannableString spannableStringValueOf2 = android.text.SpannableString.valueOf(str2);
        Intrinsics.checkNotNullExpressionValue(spannableStringValueOf2, "");
        pairArr[1] = C56390yDp.OLrzqt("rewardAmount", spannableStringValueOf2);
        pairArr[2] = C56390yDp.OLrzqt("learnMore", spannableString);
        android.text.SpannableStringBuilder spannableStringBuilderCopydefault = C33069mpW.copydefault(contextRequireContext, i, (java.util.Map<java.lang.String, ? extends android.text.Spannable>) C56424yEw.gEmmrt(pairArr));
        android.widget.TextView textView = njp.EZpvd;
        textView.setText(spannableStringBuilderCopydefault);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: o.orW$StateListAnimator */
    public static final class StateListAnimator extends android.text.style.ClickableSpan {
        public StateListAnimator() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            InterfaceC48694uaX interfaceC48694uaX = (InterfaceC48694uaX) C43251rlk.copydefault(InterfaceC48694uaX.class);
            FragmentActivity fragmentActivityRequireActivity = C37314orW.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            interfaceC48694uaX.OLrzqt((android.app.Activity) fragmentActivityRequireActivity);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        }
    }

    /* JADX INFO: renamed from: o.orW$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ ActionBar OLrzqt;
        public final /* synthetic */ C37314orW copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C37314orW c37314orW, java.lang.String str, ActionBar actionBar) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.copydefault = c37314orW;
            this.EZpvd = str;
            this.OLrzqt = actionBar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.OLrzqt(this.EZpvd, this.OLrzqt);
            }
        }
    }

    public final void OLrzqt(final java.lang.String str, ActionBar actionBar) {
        TextShareParams textShareParamsKWHzl = TextShareParams.Companion.KWHzl("", actionBar.copydefault(), new Function1() { // from class: o.osb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37314orW.AEQbTJ(str, (TextShareParams) obj);
            }
        });
        InterfaceC48893ueK interfaceC48893ueK = (InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        interfaceC48893ueK.KWHzl(fragmentActivityRequireActivity, textShareParamsKWHzl, SharePlatform.SMS, null);
    }

    public static final Unit AEQbTJ(java.lang.String str, TextShareParams textShareParams) {
        Intrinsics.checkNotNullParameter(textShareParams, "");
        textShareParams.getExtras().putString("sms_address", str);
        textShareParams.setShareFrom("im_sharing");
        return Unit.INSTANCE;
    }

    public final ActionBar AEQbTJ() {
        java.lang.String inviteeShareText;
        java.lang.String shareUrl;
        java.lang.String shareUrl2;
        ShareFooterInfo shareFooterInfoORxRYg = ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).ORxRYg();
        if (shareFooterInfoORxRYg == null || (inviteeShareText = shareFooterInfoORxRYg.getInviteeShareText()) == null) {
            inviteeShareText = "";
        }
        if (shareFooterInfoORxRYg == null || (shareUrl = shareFooterInfoORxRYg.getShareUrl()) == null) {
            shareUrl = "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(inviteeShareText);
        sb.append("\n");
        if (shareFooterInfoORxRYg == null || (shareUrl2 = shareFooterInfoORxRYg.getShareUrl()) == null) {
            shareUrl2 = "";
        }
        sb.append(shareUrl2);
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return new ActionBar(shareUrl, string);
    }

    public final void EZpvd(final ActionBar actionBar) {
        final LinkDefaultPreviewConfig linkDefaultPreviewConfigCreate$default = LinkDefaultPreviewConfig.Activity.create$default(LinkDefaultPreviewConfig.Companion, C33070mpX.AYXKKw(C35399nuc.LoaderManager.onExtraCallback), null, null, null, null, null, 62, null);
        ShareConfig shareConfigCopydefault = ShareConfig.Companion.copydefault(LinkShareParams.Companion.AEQbTJ(actionBar.EZpvd(), new Function1() { // from class: o.orY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37314orW.copydefault(actionBar, (LinkShareParams) obj);
            }
        }), new Function1() { // from class: o.orX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37314orW.OLrzqt(linkDefaultPreviewConfigCreate$default, (ShareConfig) obj);
            }
        });
        InterfaceC48893ueK interfaceC48893ueK = (InterfaceC48893ueK) C43251rlk.OLrzqt(InterfaceC48893ueK.class);
        AbstractC49065uhX abstractC49065uhXOLrzqt = interfaceC48893ueK != null ? interfaceC48893ueK.OLrzqt(shareConfigCopydefault) : null;
        if (abstractC49065uhXOLrzqt != null) {
            getChildFragmentManager().beginTransaction().replace(C35399nuc.StateListAnimator.fBE, abstractC49065uhXOLrzqt, "SharePlatformsFragment").commitNowAllowingStateLoss();
        }
    }

    public static final Unit copydefault(ActionBar actionBar, LinkShareParams linkShareParams) {
        Intrinsics.checkNotNullParameter(linkShareParams, "");
        linkShareParams.setBody(actionBar.copydefault());
        linkShareParams.setShareFrom("im_sharing");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(LinkDefaultPreviewConfig linkDefaultPreviewConfig, ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        shareConfig.setPreviewConfig(linkDefaultPreviewConfig);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.orW$ActionBar */
    public static final class ActionBar {
        public final java.lang.String AEQbTJ;
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = actionBar.KWHzl;
            }
            return actionBar.OLrzqt(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new ActionBar(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) actionBar.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) actionBar.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.AEQbTJ.hashCode() * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ShareData(link=" + this.AEQbTJ + ", body=" + this.KWHzl + ")";
        }

        public ActionBar(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.AEQbTJ = str;
            this.KWHzl = str2;
        }
    }
}
