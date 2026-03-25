package o;

import com.okinc.business.redbag.bean.GiftInfo;
import com.okinc.business.redbag.bean.MsgType;
import com.okinc.okimcore.model.im.OKFullyClaimedRedPacketMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C35399nuc;
import o.C52761wXj;
import o.kOA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nBx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33681nBx extends nAF<OKFullyClaimedRedPacketMessage> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKFullyClaimedRedPacketMessage> KWHzl() {
        return OKFullyClaimedRedPacketMessage.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35882oHe
    public int OLrzqt() {
        return C35342ntX.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35882oHe
    public int copydefault() {
        return C35399nuc.Dialog.DTeKQX;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.oGY, java.lang.Object] */
    @Override // o.nAF, o.AbstractC35702oAn, o.AbstractC35882oHe
    public /* synthetic */ void KWHzl(oGY ogy, C35254nrp c35254nrp) {
        KWHzl((oGY<AbstractC34017nOi>) ogy, c35254nrp);
    }

    @Override // o.AbstractC35703oAo
    public java.util.Set<OKMessage.MessageDirection> be_() {
        return yEE.AhwBna(OKMessage.MessageDirection.SEND, OKMessage.MessageDirection.RECEIVE);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKFullyClaimedRedPacketMessage oKFullyClaimedRedPacketMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKFullyClaimedRedPacketMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return C33069mpW.KWHzl(context, C35399nuc.LoaderManager.DQnQnb, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("gift", context.getString(C35399nuc.LoaderManager.RkASWs))));
    }

    public final java.lang.CharSequence OLrzqt(android.content.Context context, OKFullyClaimedRedPacketMessage oKFullyClaimedRedPacketMessage, OKMessage oKMessage) {
        java.lang.String string = KWHzl(context, oKFullyClaimedRedPacketMessage, oKMessage).toString();
        java.lang.String string2 = context.getString(C35399nuc.LoaderManager.RkASWs);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return KWHzl(string, string2, oKFullyClaimedRedPacketMessage.getGiftId(), oKFullyClaimedRedPacketMessage.getGiftSenderUid(), oKMessage.getTargetId());
    }

    @Override // o.nAF, o.AbstractC35702oAn
    /* JADX INFO: renamed from: copydefault */
    public void KWHzl(@NotNull oGY<AbstractC34017nOi> ogy, @NotNull C35254nrp c35254nrp) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        super.KWHzl(ogy, c35254nrp);
        OKMessageContent content = c35254nrp.OLrzqt().getContent();
        Intrinsics.copydefault(content, "");
        android.widget.TextView textView = ((AbstractC34017nOi) ogy.copydefault()).copydefault;
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        android.content.Context context = ogy.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView.setText(OLrzqt(context, (OKFullyClaimedRedPacketMessage) content, c35254nrp.OLrzqt()));
    }

    public final java.lang.CharSequence KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(str);
        try {
            Result.Application application = Result.Companion;
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, str2, 0, false, 6, (java.lang.Object) null);
            int length = str2.length() + iIndexOf$default;
            spannableStringBuilder.setSpan(new Application(str3, str5, str4), iIndexOf$default, length, 33);
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), iIndexOf$default, length, 33);
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: o.nBx$Application */
    public static final class Application extends android.text.style.ClickableSpan {
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;

        public Application(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.OLrzqt = str;
            this.copydefault = str2;
            this.KWHzl = str3;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            java.lang.String str = this.OLrzqt;
            if (str != null) {
                java.lang.String str2 = this.copydefault;
                java.lang.String str3 = this.KWHzl;
                kOA koa = (kOA) C43251rlk.OLrzqt(kOA.class);
                if (koa != null) {
                    if (str2 == null) {
                        str2 = "";
                    }
                    kOA.TaskDescription.claimGift$default(koa, new GiftInfo(str, str2, str3 != null ? str3 : ""), C35334ntP.KWHzl(view), null, MsgType.IM_SYSTEM, 4, null);
                }
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(false);
            textPaint.linkColor = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        }
    }
}
