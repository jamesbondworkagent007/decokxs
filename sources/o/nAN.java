package o;

import com.okinc.okimcore.model.im.BaseOKPayMessage;
import com.okinc.okimcore.model.im.OKCanceledPayMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKUserInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nAN extends nAF<OKCanceledPayMessage> {

    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKMessage.MessageDirection.values().length];
            try {
                iArr[OKMessage.MessageDirection.RECEIVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKCanceledPayMessage> KWHzl() {
        return OKCanceledPayMessage.class;
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
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035 A[PHI: r3
  0x0035: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v2 java.lang.String) binds: [B:3:0x0011, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.AbstractC35703oAo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKCanceledPayMessage oKCanceledPayMessage, @NotNull OKMessage oKMessage) {
        java.lang.String displayName$default;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKCanceledPayMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        java.lang.String senderUserId = oKMessage.getSenderUserId();
        if (senderUserId == null) {
            str = name;
        } else {
            RelationInfo relationInfoKWHzl = sDZ.AEQbTJ.valueOf().KWHzl(senderUserId);
            if (relationInfoKWHzl == null || (displayName$default = C44157sFk.getDisplayName$default(relationInfoKWHzl, null, 1, null)) == null) {
                OKUserInfo userInfo = oKCanceledPayMessage.getUserInfo();
                name = userInfo != null ? userInfo.getName() : null;
                if (name != null) {
                }
            } else {
                str = displayName$default;
            }
        }
        java.lang.String strValueOf = java.lang.String.valueOf(str);
        if (StateListAnimator.EZpvd[oKMessage.getMessageDirection().ordinal()] == 1) {
            return C33069mpW.KWHzl(context, C35399nuc.LoaderManager.UccSpe, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("userName", strValueOf)));
        }
        return AEQbTJ(context, strValueOf);
    }

    public final java.lang.CharSequence AEQbTJ(android.content.Context context, java.lang.String str) {
        return C33069mpW.KWHzl(context, C35399nuc.LoaderManager.RZNAhV, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("userName", str), C56390yDp.OLrzqt(OtcExtraKeys.PAYMENT, context.getString(C35399nuc.LoaderManager.RTWSvT))));
    }

    public final java.lang.CharSequence OLrzqt(android.content.Context context, OKCanceledPayMessage oKCanceledPayMessage, OKMessage oKMessage, android.widget.TextView textView) {
        java.lang.String displayName$default;
        java.lang.String senderUserId = oKMessage.getSenderUserId();
        if (senderUserId != null) {
            RelationInfo relationInfoKWHzl = sDZ.AEQbTJ.valueOf().KWHzl(senderUserId);
            if (relationInfoKWHzl == null || (displayName$default = C44157sFk.getDisplayName$default(relationInfoKWHzl, null, 1, null)) == null) {
                OKUserInfo userInfo = oKCanceledPayMessage.getUserInfo();
                name = userInfo != null ? userInfo.getName() : null;
                if (name == null) {
                    name = "";
                }
            } else {
                name = displayName$default;
            }
        }
        java.lang.String strValueOf = java.lang.String.valueOf(name);
        if (StateListAnimator.EZpvd[oKMessage.getMessageDirection().ordinal()] == 1) {
            return C33069mpW.KWHzl(context, C35399nuc.LoaderManager.UccSpe, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("userName", strValueOf)));
        }
        java.lang.String string = AEQbTJ(context, strValueOf).toString();
        java.lang.String string2 = context.getString(C35399nuc.LoaderManager.RTWSvT);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return OLrzqt(oKMessage, string, string2, oKCanceledPayMessage, textView, context);
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
        textView.setText(OLrzqt(context, (OKCanceledPayMessage) content, oKMessageOLrzqt, textView2));
    }

    public final java.lang.CharSequence OLrzqt(final OKMessage oKMessage, java.lang.String str, java.lang.String str2, final OKCanceledPayMessage oKCanceledPayMessage, android.widget.TextView textView, final android.content.Context context) {
        return C35879oHb.AEQbTJ(new android.text.SpannableString(str), textView, str2, C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), new Function0() { // from class: o.nAQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return nAN.OLrzqt(oKCanceledPayMessage, context, oKMessage);
            }
        });
    }

    public static final Unit OLrzqt(OKCanceledPayMessage oKCanceledPayMessage, android.content.Context context, OKMessage oKMessage) {
        C33726nDo.EZpvd.AEQbTJ(context, oKMessage, BaseOKPayMessage.Companion.EZpvd(oKCanceledPayMessage));
        return Unit.INSTANCE;
    }
}
