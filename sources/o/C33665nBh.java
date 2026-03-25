package o;

import com.okinc.okimcore.model.im.BaseOKPayMessage;
import com.okinc.okimcore.model.im.OKExpiredPayMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nBh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33665nBh extends nAF<OKExpiredPayMessage> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKExpiredPayMessage> KWHzl() {
        return OKExpiredPayMessage.class;
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
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKExpiredPayMessage oKExpiredPayMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKExpiredPayMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return EZpvd(context);
    }

    public final java.lang.CharSequence KWHzl(android.content.Context context, OKExpiredPayMessage oKExpiredPayMessage, OKMessage oKMessage, android.widget.TextView textView) {
        java.lang.String string = EZpvd(context).toString();
        java.lang.String string2 = context.getString(C35399nuc.LoaderManager.RzdrRQ);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return KWHzl(oKMessage, string, string2, oKExpiredPayMessage, textView, context);
    }

    public final java.lang.CharSequence EZpvd(android.content.Context context) {
        return C33069mpW.KWHzl(context, C35399nuc.LoaderManager.RqmePg, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.PAYMENT, context.getString(C35399nuc.LoaderManager.RzdrRQ))));
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
        OKMessage oKMessageOLrzqt = c35254nrp.OLrzqt();
        android.widget.TextView textView2 = ((AbstractC34017nOi) ogy.copydefault()).copydefault;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView.setText(KWHzl(context, (OKExpiredPayMessage) content, oKMessageOLrzqt, textView2));
    }

    public final java.lang.CharSequence KWHzl(final OKMessage oKMessage, java.lang.String str, java.lang.String str2, final OKExpiredPayMessage oKExpiredPayMessage, android.widget.TextView textView, final android.content.Context context) {
        return C35879oHb.AEQbTJ(new android.text.SpannableString(str), textView, str2, C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), new Function0() { // from class: o.nBn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33665nBh.OLrzqt(oKExpiredPayMessage, context, oKMessage);
            }
        });
    }

    public static final Unit OLrzqt(OKExpiredPayMessage oKExpiredPayMessage, android.content.Context context, OKMessage oKMessage) {
        C33726nDo.EZpvd.AEQbTJ(context, oKMessage, BaseOKPayMessage.Companion.OLrzqt(oKExpiredPayMessage));
        return Unit.INSTANCE;
    }
}
