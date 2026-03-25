package o;

import com.okinc.okimcore.model.im.BaseOKPayMessage;
import com.okinc.okimcore.model.im.OKFailedAcceptPayMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nBl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33669nBl extends nAF<OKFailedAcceptPayMessage> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKFailedAcceptPayMessage> KWHzl() {
        return OKFailedAcceptPayMessage.class;
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
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKFailedAcceptPayMessage oKFailedAcceptPayMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKFailedAcceptPayMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return context.getString(C35399nuc.LoaderManager.RbVjfb) + " " + context.getString(C35399nuc.LoaderManager.DTeKQX);
    }

    public final java.lang.CharSequence KWHzl(android.content.Context context, OKFailedAcceptPayMessage oKFailedAcceptPayMessage, OKMessage oKMessage, android.widget.TextView textView) {
        java.lang.String str = context.getString(C35399nuc.LoaderManager.RbVjfb) + " " + context.getString(C35399nuc.LoaderManager.DTeKQX);
        java.lang.String string = context.getString(C35399nuc.LoaderManager.DTeKQX);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return EZpvd(oKMessage, str, string, oKFailedAcceptPayMessage, textView, context);
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
        textView.setText(KWHzl(context, (OKFailedAcceptPayMessage) content, oKMessageOLrzqt, textView2));
    }

    public final java.lang.CharSequence EZpvd(final OKMessage oKMessage, java.lang.String str, java.lang.String str2, final OKFailedAcceptPayMessage oKFailedAcceptPayMessage, android.widget.TextView textView, final android.content.Context context) {
        return C35879oHb.AEQbTJ(new android.text.SpannableString(str), textView, str2, C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), new Function0() { // from class: o.nBo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33669nBl.copydefault(oKFailedAcceptPayMessage, context, oKMessage);
            }
        });
    }

    public static final Unit copydefault(OKFailedAcceptPayMessage oKFailedAcceptPayMessage, android.content.Context context, OKMessage oKMessage) {
        C33726nDo.EZpvd.AEQbTJ(context, oKMessage, BaseOKPayMessage.Companion.KWHzl(oKFailedAcceptPayMessage));
        return Unit.INSTANCE;
    }
}
