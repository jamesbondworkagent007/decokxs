package o;

import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.im.imui.system.provider.DisclaimerSystemMessageViewProvider$loadRmAvatars$1;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKPrivacyDisclaimerMessage;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.OfficialTagType;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import com.okinc.web.WebActivity;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oyi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37697oyi extends AbstractC35702oAn<OKPrivacyDisclaimerMessage, AbstractC33949nLv> {
    public static final Activity Companion = new Activity(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKPrivacyDisclaimerMessage> KWHzl() {
        return OKPrivacyDisclaimerMessage.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35882oHe
    public int OLrzqt() {
        return C35342ntX.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35882oHe
    public int copydefault() {
        return C35399nuc.Dialog.UscePu;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.oGY, java.lang.Object] */
    @Override // o.AbstractC35702oAn, o.AbstractC35882oHe
    public /* synthetic */ void KWHzl(oGY ogy, C35254nrp c35254nrp) {
        KWHzl((oGY<AbstractC33949nLv>) ogy, c35254nrp);
    }

    /* JADX INFO: renamed from: o.oyi$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oyi.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.AbstractC35703oAo
    public java.util.Set<OKMessage.MessageDirection> be_() {
        return yEE.AhwBna(OKMessage.MessageDirection.SEND, OKMessage.MessageDirection.RECEIVE);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKPrivacyDisclaimerMessage oKPrivacyDisclaimerMessage, @NotNull OKMessage oKMessage) {
        OKConversation oKConversationInvoke;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKPrivacyDisclaimerMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Function0<OKConversation> function0FetchVPNInfo = fetchVPNInfo();
        if (function0FetchVPNInfo != null && (oKConversationInvoke = function0FetchVPNInfo.invoke()) != null && C44170sFx.AEQbTJ(oKConversationInvoke)) {
            return C33070mpX.AYXKKw(C35399nuc.LoaderManager.arDRxL);
        }
        return C33070mpX.AYXKKw(C35399nuc.LoaderManager.aKhcqp);
    }

    @Override // o.AbstractC35702oAn
    /* JADX INFO: renamed from: copydefault */
    public void KWHzl(@NotNull oGY<AbstractC33949nLv> ogy, @NotNull C35254nrp c35254nrp) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        super.KWHzl((oGY) ogy, c35254nrp);
        Function0<OKConversation> function0FetchVPNInfo = fetchVPNInfo();
        OKConversation oKConversationInvoke = function0FetchVPNInfo != null ? function0FetchVPNInfo.invoke() : null;
        if (oKConversationInvoke != null && C44170sFx.AEQbTJ(oKConversationInvoke)) {
            OLrzqt(ogy, oKConversationInvoke != null ? oKConversationInvoke.getTargetId() : null);
        } else {
            OLrzqt(ogy, oKConversationInvoke);
        }
    }

    public final void OLrzqt(oGY<AbstractC33949nLv> ogy, java.lang.String str) {
        AbstractC33949nLv abstractC33949nLv = (AbstractC33949nLv) ogy.copydefault();
        abstractC33949nLv.AYXKKw.setVisibility(0);
        abstractC33949nLv.KWHzl.setVisibility(8);
        abstractC33949nLv.gEmmrt.setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.arDRxL));
        abstractC33949nLv.gEmmrt.setTextColor(ContextCompat.getColor(ogy.itemView.getContext(), C35399nuc.Application.djBIcL));
        abstractC33949nLv.valueOf.setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.OBzZra));
        copydefault(ogy, str);
    }

    public final void copydefault(oGY<AbstractC33949nLv> ogy, java.lang.String str) {
        if (str == null || str.length() == 0) {
            pUU.copydefault(uzCIH(), "groupId is null or empty, cannot load RM avatars");
            return;
        }
        android.content.Context context = ogy.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(DbNXlk()), null, null, new DisclaimerSystemMessageViewProvider$loadRmAvatars$1(((InterfaceC35331ntM) C58114yvF.OLrzqt(context, InterfaceC35331ntM.class)).zuWLRA(), str, this, ogy, null), 3, null);
    }

    public final void KWHzl(oGY<AbstractC33949nLv> ogy, GroupInfo groupInfo) {
        java.util.List<OfficialTagType> supportTagTypes;
        java.util.List<GroupMemberInfo> topGroupMemberList = groupInfo.getTopGroupMemberList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : topGroupMemberList) {
            OfficialTagInfo officialTags = ((GroupMemberInfo) obj).getOfficialTags();
            if (officialTags != null && (supportTagTypes = officialTags.getSupportTagTypes()) != null && !supportTagTypes.isEmpty()) {
                for (OfficialTagType officialTagType : supportTagTypes) {
                    if (officialTagType == OfficialTagType.VipRM || officialTagType == OfficialTagType.VipSupport) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        java.util.List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) arrayList, 2);
        float f = ogy.itemView.getResources().getDisplayMetrics().density;
        AbstractC33949nLv abstractC33949nLv = (AbstractC33949nLv) ogy.copydefault();
        int size = listAhwBna.size();
        if (size == 0) {
            pUU.KWHzl(uzCIH(), "No RM members found in group");
            abstractC33949nLv.AEQbTJ.setVisibility(8);
            return;
        }
        if (size == 1) {
            abstractC33949nLv.AEQbTJ.setVisibility(0);
            int i = (int) (80 * f);
            abstractC33949nLv.EZpvd.getLayoutParams().width = i;
            abstractC33949nLv.EZpvd.getLayoutParams().height = i;
            android.widget.ImageView imageView = abstractC33949nLv.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C33054mpH.loadAvatar$default(imageView, ((GroupMemberInfo) listAhwBna.get(0)).getAvatar(), null, null, 6, null);
            abstractC33949nLv.OLrzqt.setVisibility(8);
            return;
        }
        abstractC33949nLv.AEQbTJ.setVisibility(0);
        int i2 = (int) (64 * f);
        abstractC33949nLv.EZpvd.getLayoutParams().width = i2;
        abstractC33949nLv.EZpvd.getLayoutParams().height = i2;
        android.widget.ImageView imageView2 = abstractC33949nLv.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        C33054mpH.loadAvatar$default(imageView2, ((GroupMemberInfo) listAhwBna.get(0)).getAvatar(), null, null, 6, null);
        abstractC33949nLv.OLrzqt.setVisibility(0);
        android.widget.ImageView imageView3 = abstractC33949nLv.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView3, "");
        C33054mpH.loadAvatar$default(imageView3, ((GroupMemberInfo) listAhwBna.get(1)).getAvatar(), null, null, 6, null);
    }

    public final void OLrzqt(oGY<AbstractC33949nLv> ogy, OKConversation oKConversation) {
        java.lang.CharSequence charSequenceOLrzqt;
        AbstractC33949nLv abstractC33949nLv = (AbstractC33949nLv) ogy.copydefault();
        abstractC33949nLv.AYXKKw.setVisibility(8);
        abstractC33949nLv.KWHzl.setVisibility(0);
        abstractC33949nLv.KWHzl.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        android.widget.TextView textView = abstractC33949nLv.KWHzl;
        textView.setPadding(textView.getPaddingLeft(), 0, abstractC33949nLv.KWHzl.getPaddingRight(), abstractC33949nLv.KWHzl.getPaddingBottom());
        android.widget.TextView textView2 = abstractC33949nLv.KWHzl;
        if ((oKConversation != null ? oKConversation.getGroupType() : null) == GroupTagType.OTC_AGENT) {
            charSequenceOLrzqt = C33070mpX.AYXKKw(C35399nuc.LoaderManager.deregisterUser);
        } else {
            android.content.Context context = ogy.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            charSequenceOLrzqt = OLrzqt(context);
        }
        textView2.setText(charSequenceOLrzqt);
    }

    public final java.lang.CharSequence OLrzqt(android.content.Context context) {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.aVhqwO);
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C35399nuc.LoaderManager.YFmri);
        return OLrzqt(context, C33069mpW.OLrzqt(C33070mpX.AYXKKw(C35399nuc.LoaderManager.aKhcqp), C56424yEw.gEmmrt(C56390yDp.OLrzqt("privacyPolicy", strAYXKKw), C56390yDp.OLrzqt("contentPolicy", strAYXKKw2))), strAYXKKw, strAYXKKw2, C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
    }

    public final java.lang.CharSequence OLrzqt(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        java.lang.Object objM7377constructorimpl;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(str);
        try {
            Result.Application application = Result.Companion;
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, str2, 0, false, 6, (java.lang.Object) null);
            if (iIndexOf$default >= 0) {
                spannableStringBuilder.setSpan(new Application(context, i), iIndexOf$default, str2.length() + iIndexOf$default, 33);
            }
            int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, str3, 0, false, 6, (java.lang.Object) null);
            if (iIndexOf$default2 >= 0) {
                spannableStringBuilder.setSpan(new TaskDescription(context, i), iIndexOf$default2, str3.length() + iIndexOf$default2, 33);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ(uzCIH(), "Failed to create clickable text", thM7380exceptionOrNullimpl);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: o.oyi$Application */
    public static final class Application extends android.text.style.ClickableSpan {
        public final /* synthetic */ android.content.Context AEQbTJ;
        public final /* synthetic */ int copydefault;

        public Application(android.content.Context context, int i) {
            this.AEQbTJ = context;
            this.copydefault = i;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            pUU.KWHzl(C37697oyi.this.uzCIH(), "Privacy Policy clicked");
            C35878oHa.openPageWithInterceptor$default(WebActivity.Companion, this.AEQbTJ, BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C35399nuc.LoaderManager.processStrongAuthMessage))), null, 4, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(this.copydefault);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: o.oyi$TaskDescription */
    public static final class TaskDescription extends android.text.style.ClickableSpan {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ android.content.Context KWHzl;

        public TaskDescription(android.content.Context context, int i) {
            this.KWHzl = context;
            this.AEQbTJ = i;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            pUU.KWHzl(C37697oyi.this.uzCIH(), "Content Policy clicked");
            C35878oHa.openPageWithInterceptor$default(WebActivity.Companion, this.KWHzl, BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C35399nuc.LoaderManager.hOMIpD))), null, 4, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(this.AEQbTJ);
            textPaint.setUnderlineText(false);
        }
    }
}
