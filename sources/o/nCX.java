package o;

import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKTradingDaysPriorCompetitionMessage;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nCX extends nAF<OKTradingDaysPriorCompetitionMessage> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKTradingDaysPriorCompetitionMessage> KWHzl() {
        return OKTradingDaysPriorCompetitionMessage.class;
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
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKTradingDaysPriorCompetitionMessage oKTradingDaysPriorCompetitionMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKTradingDaysPriorCompetitionMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        java.lang.Integer daysPrior = oKTradingDaysPriorCompetitionMessage.getDaysPrior();
        int iIntValue = daysPrior != null ? daysPrior.intValue() : 0;
        return C33069mpW.KWHzl(context, C35399nuc.LoaderManager.DcMfJKDGTeJD, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("var", pTD.EZpvd(context, C35399nuc.Fragment.gEmmrt, iIntValue, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(iIntValue)))))));
    }

    public final java.lang.CharSequence AEQbTJ(android.content.Context context, OKTradingDaysPriorCompetitionMessage oKTradingDaysPriorCompetitionMessage, OKMessage oKMessage) {
        java.lang.Integer daysPrior = oKTradingDaysPriorCompetitionMessage.getDaysPrior();
        int iIntValue = daysPrior != null ? daysPrior.intValue() : 0;
        java.lang.String strEZpvd = pTD.EZpvd(context, C35399nuc.Fragment.gEmmrt, iIntValue, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(iIntValue))));
        return OLrzqt(C33069mpW.KWHzl(context, C35399nuc.LoaderManager.DcMfJKDGTeJD, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("var", strEZpvd))), strEZpvd, C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
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
        textView.setText(AEQbTJ(context, (OKTradingDaysPriorCompetitionMessage) content, c35254nrp.OLrzqt()));
    }

    public final java.lang.CharSequence OLrzqt(java.lang.String str, java.lang.String str2, int i) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(str);
        try {
            Result.Application application = Result.Companion;
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, str2, 0, false, 6, (java.lang.Object) null);
            if (iIndexOf$default >= 0) {
                spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(i), iIndexOf$default, str2.length() + iIndexOf$default, 33);
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return spannableStringBuilder;
    }
}
