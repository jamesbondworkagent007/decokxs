package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.okinc.okimcore.model.im.OKGroupVoiceCallMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nBE extends oAA<OKGroupVoiceCallMessage, AbstractC33970nMp> {
    public final int copydefault = C35399nuc.Dialog.zqTOFw;
    public final java.lang.Integer KWHzl = java.lang.Integer.valueOf(C35342ntX.AEQbTJ);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public java.lang.Integer EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKGroupVoiceCallMessage> KWHzl() {
        return OKGroupVoiceCallMessage.class;
    }

    @Override // o.oAA, o.AbstractC35707oAs
    public /* synthetic */ void copydefault(oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent) {
        EZpvd((oAC<AbstractC44112sDu, AbstractC33970nMp>) oac, c35254nrp, (OKGroupVoiceCallMessage) oKMessageContent);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKGroupVoiceCallMessage oKGroupVoiceCallMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKGroupVoiceCallMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return "[" + ((java.lang.Object) C33736nDy.copydefault.EZpvd(context, oKGroupVoiceCallMessage)) + "]";
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/databinding/ViewDataBinding; */
    @Override // o.AbstractC35707oAs
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public AbstractC33970nMp OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return C33736nDy.copydefault.copydefault((AbstractC33970nMp) super.OLrzqt(layoutInflater, viewGroup));
    }

    public void EZpvd(@NotNull oAC<AbstractC44112sDu, AbstractC33970nMp> oac, @NotNull C35254nrp c35254nrp, @NotNull OKGroupVoiceCallMessage oKGroupVoiceCallMessage) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKGroupVoiceCallMessage, "");
        super.copydefault(oac, c35254nrp, oKGroupVoiceCallMessage);
        oac.itemView.setTag(java.lang.Long.valueOf(c35254nrp.OLrzqt().getSeq()));
        C33736nDy c33736nDy = C33736nDy.copydefault;
        Function0<java.lang.Long> function0AkhnZx = AkhnZx();
        c33736nDy.EZpvd(oac, c35254nrp, oKGroupVoiceCallMessage, function0AkhnZx != null ? function0AkhnZx.invoke() : null);
        ConstraintLayout constraintLayout = ((AbstractC33970nMp) oac.EZpvd()).copydefault;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        AEQbTJ(c35254nrp, constraintLayout);
        C52794wYp c52794wYp = ((AbstractC33970nMp) oac.EZpvd()).djBIcL;
        Intrinsics.copydefault(c52794wYp);
        C37716ozA.AEQbTJ(c52794wYp);
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this, c35254nrp));
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;)V */
    @Override // o.oAA, o.AbstractC35707oAs
    public void copydefault(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKGroupVoiceCallMessage oKGroupVoiceCallMessage) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKGroupVoiceCallMessage, "");
        super.copydefault(view, i, c35254nrp, oKGroupVoiceCallMessage);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;Landroidx/viewbinding/ViewBinding;)Z */
    @Override // o.AbstractC35707oAs
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKGroupVoiceCallMessage oKGroupVoiceCallMessage, @NotNull ViewBinding viewBinding) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKGroupVoiceCallMessage, "");
        Intrinsics.checkNotNullParameter(viewBinding, "");
        return super.OLrzqt(view, i, c35254nrp, oKGroupVoiceCallMessage, viewBinding);
    }

    @Override // o.oAA, o.AbstractC35703oAo, o.AbstractC35882oHe
    public void AEQbTJ(@NotNull oGY<AbstractC44112sDu> ogy) {
        Intrinsics.checkNotNullParameter(ogy, "");
        super.AEQbTJ(ogy);
        java.lang.Object tag = ogy.itemView.getTag();
        java.lang.Long l = tag instanceof java.lang.Long ? (java.lang.Long) tag : null;
        if (l != null) {
            C33736nDy.copydefault.EZpvd(l.longValue());
            ogy.itemView.setTag(null);
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C35254nrp KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ nBE copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, nBE nbe, C35254nrp c35254nrp) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = nbe;
            this.KWHzl = c35254nrp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Function1 function1EjfBZ = this.copydefault.ejfBZ();
                if (function1EjfBZ != null) {
                    function1EjfBZ.invoke(this.KWHzl.OLrzqt());
                }
            }
        }
    }
}
