package o;

import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKVipAccessMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nDi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33720nDi extends nAF<OKVipAccessMessage> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKVipAccessMessage> KWHzl() {
        return OKVipAccessMessage.class;
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
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKVipAccessMessage oKVipAccessMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKVipAccessMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        java.lang.String bizName = oKVipAccessMessage.getBizName();
        if (Intrinsics.EZpvd((java.lang.Object) bizName, (java.lang.Object) "VipGainAccess")) {
            if (sSI.copydefault.copydefault()) {
                return C33070mpX.AYXKKw(C35399nuc.LoaderManager.sTbpmZ);
            }
            return C33070mpX.AYXKKw(C35399nuc.LoaderManager.onMessageChannelReady);
        }
        if (!Intrinsics.EZpvd((java.lang.Object) bizName, (java.lang.Object) "VipLostAccess")) {
            return "";
        }
        if (sSI.copydefault.copydefault()) {
            return C33070mpX.AYXKKw(C35399nuc.LoaderManager.hijVBL);
        }
        return new android.text.SpannableString(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C35399nuc.LoaderManager.onRelationshipValidationResult), C56423yEv.EZpvd(C56390yDp.OLrzqt("learnMore", C33070mpX.AYXKKw(C35399nuc.LoaderManager.extraCallbackWithResult)))));
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
        android.widget.TextView textView2 = ((AbstractC34017nOi) ogy.copydefault()).copydefault;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView.setText(OLrzqt(context, (OKVipAccessMessage) content, textView2));
    }

    public final java.lang.CharSequence OLrzqt(final android.content.Context context, OKVipAccessMessage oKVipAccessMessage, android.widget.TextView textView) {
        java.lang.String bizName = oKVipAccessMessage.getBizName();
        if (Intrinsics.EZpvd((java.lang.Object) bizName, (java.lang.Object) "VipGainAccess")) {
            if (sSI.copydefault.copydefault()) {
                return C33070mpX.AYXKKw(C35399nuc.LoaderManager.sTbpmZ);
            }
            return C33070mpX.AYXKKw(C35399nuc.LoaderManager.onMessageChannelReady);
        }
        if (!Intrinsics.EZpvd((java.lang.Object) bizName, (java.lang.Object) "VipLostAccess")) {
            return "";
        }
        if (sSI.copydefault.copydefault()) {
            return C33070mpX.AYXKKw(C35399nuc.LoaderManager.hijVBL);
        }
        return C35879oHb.AEQbTJ(new android.text.SpannableString(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C35399nuc.LoaderManager.onRelationshipValidationResult), C56423yEv.EZpvd(C56390yDp.OLrzqt("learnMore", C33070mpX.AYXKKw(C35399nuc.LoaderManager.extraCallbackWithResult))))), textView, C33070mpX.AYXKKw(C35399nuc.LoaderManager.extraCallbackWithResult), C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), new Function0() { // from class: o.nDk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33720nDi.OLrzqt(context);
            }
        });
    }

    public static final Unit OLrzqt(android.content.Context context) {
        oGV.processDeeplink$default(oGV.EZpvd, context, "okx://exchange/miniapp/auth?appid=growth&pageurl=%2Fwholesale%2Fvip&theme=dark&StatusBarStyle=1&pageanim=push&minversion=6.130.2", null, null, new Function1() { // from class: o.nDj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33720nDi.AEQbTJ((AbstractC43238rlX) obj);
            }
        }, 12, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }
}
