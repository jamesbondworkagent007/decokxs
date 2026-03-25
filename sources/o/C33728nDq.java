package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBinding;
import com.okinc.im.imui.conversation.message.provider.VoiceSendMessageViewProvider$onMessageContentViewLongClick$1;
import com.okinc.okimcore.model.im.OKHQVoiceMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nDq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33728nDq extends oAA<OKHQVoiceMessage, AbstractC33997nNp> {
    public final java.lang.Integer AEQbTJ = java.lang.Integer.valueOf(C35342ntX.AEQbTJ);
    public final int EZpvd = C35399nuc.Dialog.gtdfxv;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public java.lang.Integer EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKHQVoiceMessage> KWHzl() {
        return OKHQVoiceMessage.class;
    }

    @Override // o.AbstractC35707oAs
    public boolean bf_() {
        return true;
    }

    @Override // o.AbstractC35707oAs
    public boolean bg_() {
        return true;
    }

    @Override // o.oAA, o.AbstractC35707oAs
    public /* bridge */ /* synthetic */ void copydefault(oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent) {
        copydefault((oAC<AbstractC44112sDu, AbstractC33997nNp>) oac, c35254nrp, (OKHQVoiceMessage) oKMessageContent);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKHQVoiceMessage oKHQVoiceMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKHQVoiceMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return "[" + context.getString(C35399nuc.LoaderManager.ZAwExL) + "]";
    }

    public void copydefault(@NotNull oAC<AbstractC44112sDu, AbstractC33997nNp> oac, @NotNull C35254nrp c35254nrp, @NotNull OKHQVoiceMessage oKHQVoiceMessage) {
        android.graphics.drawable.Drawable drawable;
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKHQVoiceMessage, "");
        super.copydefault((oAC) oac, c35254nrp, oKHQVoiceMessage);
        AbstractC33997nNp abstractC33997nNp = (AbstractC33997nNp) oac.EZpvd();
        LinearLayoutCompat linearLayoutCompat = oac.copydefault().AhwBna;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        AEQbTJ(c35254nrp, linearLayoutCompat);
        java.lang.Integer numDjBIcL = c35254nrp.djBIcL();
        if (numDjBIcL != null) {
            drawable = ContextCompat.getDrawable(abstractC33997nNp.getRoot().getContext(), numDjBIcL.intValue());
        } else {
            drawable = null;
        }
        android.widget.TextView textView = abstractC33997nNp.OLrzqt;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        textView.setCompoundDrawablePadding(C55298xhM.dp2px$default(6.0f, null, 1, null));
        abstractC33997nNp.OLrzqt.setText(c35254nrp.AYXKKw());
        pUU.KWHzl("VoiceMessage", "onBindSendMessage->duration:" + c35254nrp.AhwBna() + " progress:" + c35254nrp.valueOf());
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;)V */
    @Override // o.oAA, o.AbstractC35707oAs
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKHQVoiceMessage oKHQVoiceMessage) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKHQVoiceMessage, "");
        Function1<OKMessage, Unit> function1FJNWhG = fJNWhG();
        if (function1FJNWhG != null) {
            function1FJNWhG.invoke(c35254nrp.OLrzqt());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C35802oEf djBIcL() {
        return ((InterfaceC35331ntM) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC35331ntM.class)).DarRvM();
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;Landroidx/viewbinding/ViewBinding;)Z */
    @Override // o.AbstractC35707oAs
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKHQVoiceMessage oKHQVoiceMessage, @NotNull ViewBinding viewBinding) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKHQVoiceMessage, "");
        Intrinsics.checkNotNullParameter(viewBinding, "");
        if (!getFieldNames() || c35254nrp.KWHzl() != 0) {
            return true;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(DbNXlk()), null, null, new VoiceSendMessageViewProvider$onMessageContentViewLongClick$1(c35254nrp, this, viewBinding, null), 3, null);
        return true;
    }
}
