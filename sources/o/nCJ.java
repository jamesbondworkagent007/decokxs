package o;

import android.animation.ValueAnimator;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import androidx.databinding.ViewStubProxy;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBinding;
import com.okinc.im.imui.conversation.message.provider.StreamMessageViewHolder$longPressAction$1;
import com.okinc.im.imui.conversation.message.viewmodel.tracker.IMEventTracker;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKStreamPlaceHolderMessage;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nCJ extends oAO<OKStreamPlaceHolderMessage> {
    public static final Activity Companion = new Activity(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKStreamPlaceHolderMessage> KWHzl() {
        return OKStreamPlaceHolderMessage.class;
    }

    @Override // o.oAO, o.AbstractC35707oAs
    public boolean bf_() {
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.oGY, java.lang.Object, java.util.List] */
    @Override // o.oAO, o.AbstractC35707oAs, o.AbstractC35882oHe
    public /* synthetic */ void AEQbTJ(oGY ogy, C35254nrp c35254nrp, java.util.List list) {
        copydefault((oGY<AbstractC44111sDt>) ogy, c35254nrp, (java.util.List<java.lang.Object>) list);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nCJ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final C36589odn AhwBna() {
        return ((InterfaceC35331ntM) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC35331ntM.class)).QSBOWP();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKStreamPlaceHolderMessage oKStreamPlaceHolderMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKStreamPlaceHolderMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        java.lang.String content = oKStreamPlaceHolderMessage.getContent();
        return content == null ? "" : content;
    }

    @Override // o.oAO, o.AbstractC35707oAs
    public void copydefault(@NotNull oGY<AbstractC44111sDt> ogy, @NotNull C35254nrp c35254nrp, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(list, "");
        super.copydefault(ogy, c35254nrp, list);
        pUU.EZpvd("StreamMessageViewHolder", "--------------------");
        OKMessageContent content = c35254nrp.OLrzqt().getContent();
        OKStreamPlaceHolderMessage oKStreamPlaceHolderMessage = content instanceof OKStreamPlaceHolderMessage ? (OKStreamPlaceHolderMessage) content : null;
        oAC oac = ogy instanceof oAC ? (oAC) ogy : null;
        AbstractC44117sDz abstractC44117sDz = oac != null ? (AbstractC44117sDz) oac.EZpvd() : null;
        if (oKStreamPlaceHolderMessage == null || abstractC44117sDz == null) {
            return;
        }
        long seq = c35254nrp.OLrzqt().getSeq();
        pUU.EZpvd("StreamMessageViewHolder", "seq: " + seq + ", msgData.isCompleted:" + oKStreamPlaceHolderMessage.isCompleted() + " isAnimating:" + AhwBna().OLrzqt(seq) + " queueUpdate:" + AhwBna().copydefault(seq));
        java.lang.String content2 = oKStreamPlaceHolderMessage.getContent();
        pUU.EZpvd("StreamMessageViewHolder", "seq: " + seq + ", payloads:" + list + ", msgContent:" + (content2 != null ? java.lang.Integer.valueOf(content2.length()) : null));
        if (list.contains("PAYLOAD_STREAM_UPDATE")) {
            AEQbTJ(ogy, c35254nrp);
        } else {
            KWHzl(ogy, c35254nrp);
        }
    }

    public final void AEQbTJ(oGY<AbstractC44111sDt> ogy, C35254nrp c35254nrp) {
        OKMessageContent content = c35254nrp.OLrzqt().getContent();
        OKStreamPlaceHolderMessage oKStreamPlaceHolderMessage = content instanceof OKStreamPlaceHolderMessage ? (OKStreamPlaceHolderMessage) content : null;
        oAC oac = ogy instanceof oAC ? (oAC) ogy : null;
        if (oKStreamPlaceHolderMessage == null || oac == null) {
            return;
        }
        long seq = c35254nrp.OLrzqt().getSeq();
        boolean z = Intrinsics.EZpvd(oKStreamPlaceHolderMessage.isCompleted(), java.lang.Boolean.FALSE) && !AhwBna().OLrzqt(seq);
        boolean zOLrzqt = AhwBna().OLrzqt(seq);
        boolean z2 = Intrinsics.EZpvd(oKStreamPlaceHolderMessage.isCompleted(), java.lang.Boolean.TRUE) && !AhwBna().OLrzqt(seq);
        if (z) {
            pUU.EZpvd("StreamMessageViewHolder", "case1: continuous typing: " + seq);
            OLrzqt((oAC<AbstractC44111sDt, AbstractC44117sDz>) ogy, c35254nrp);
            return;
        }
        if (zOLrzqt) {
            pUU.EZpvd("StreamMessageViewHolder", "case2: add queue: " + seq + ", isAnimating: " + AhwBna().OLrzqt(seq) + ", isCompleted: " + oKStreamPlaceHolderMessage.isCompleted());
            AhwBna().EZpvd(seq, c35254nrp);
            return;
        }
        if (z2) {
            pUU.EZpvd("StreamMessageViewHolder", "case3: final typing: " + seq + " inTheQueue:" + AhwBna().AEQbTJ(seq));
            if (AhwBna().AEQbTJ(seq)) {
                OLrzqt((oAC<AbstractC44111sDt, AbstractC44117sDz>) ogy, c35254nrp);
                return;
            } else {
                KWHzl(ogy, c35254nrp);
                return;
            }
        }
        pUU.EZpvd("StreamMessageViewHolder", "case4: no ops");
    }

    public final void OLrzqt(oAC<AbstractC44111sDt, AbstractC44117sDz> oac, C35254nrp c35254nrp) {
        java.lang.CharSequence charSequence;
        java.lang.Object objM7377constructorimpl;
        pUU.EZpvd("StreamMessageViewHolder", "showAnimation");
        OKMessageContent content = c35254nrp.OLrzqt().getContent();
        OKStreamPlaceHolderMessage oKStreamPlaceHolderMessage = content instanceof OKStreamPlaceHolderMessage ? (OKStreamPlaceHolderMessage) content : null;
        if (oKStreamPlaceHolderMessage == null) {
            return;
        }
        AbstractC44117sDz abstractC44117sDz = (AbstractC44117sDz) oac.EZpvd();
        final oHK ohk = abstractC44117sDz.EZpvd;
        Intrinsics.checkNotNullExpressionValue(ohk, "");
        final long seq = c35254nrp.OLrzqt().getSeq();
        java.lang.String content2 = oKStreamPlaceHolderMessage.getContent();
        if (content2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) content2)) {
            return;
        }
        AhwBna().KWHzl(seq, true);
        oac.setIsRecyclable(false);
        AEQbTJ(oac, c35254nrp);
        android.text.SpannableStringBuilder spannableStringBuilderOLrzqt = sSS.OLrzqt(oKStreamPlaceHolderMessage, ContextCompat.getColor(abstractC44117sDz.getRoot().getContext(), C52761wXj.Activity.fdOvFl), ContextCompat.getColor(abstractC44117sDz.getRoot().getContext(), C52761wXj.Activity.fdOvFl));
        java.lang.String strEZpvd = c35254nrp.EZpvd();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strEZpvd)) {
            android.content.Context context = abstractC44117sDz.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            charSequence = C37683oyU.setupHighlightBgSpanStyle$default(spannableStringBuilderOLrzqt, context, strEZpvd, C33070mpX.copydefault(C52761wXj.Activity.fkESqH), null, 8, null);
        } else {
            charSequence = spannableStringBuilderOLrzqt;
        }
        java.lang.CharSequence text = ohk.getText();
        java.lang.String string = text != null ? text.toString() : null;
        if (string == null) {
            string = "";
        }
        java.lang.String string2 = spannableStringBuilderOLrzqt.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        try {
            Result.Application application = Result.Companion;
            int length = string.length();
            int length2 = string2.length();
            int iEZpvd = C56548yJl.EZpvd(length, 0, charSequence.length());
            int iEZpvd2 = C56548yJl.EZpvd(length2, 0, charSequence.length());
            if (iEZpvd < iEZpvd2) {
                ohk.setText(charSequence.subSequence(0, iEZpvd));
                final int length3 = charSequence.length();
                final android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(iEZpvd, iEZpvd2);
                valueAnimatorOfInt.setDuration(1400L);
                final java.lang.CharSequence charSequence2 = charSequence;
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.nCP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                        nCJ.KWHzl(valueAnimatorOfInt, ohk, charSequence2, seq, length3, valueAnimator);
                    }
                });
                valueAnimatorOfInt.addListener(new StateListAnimator(iEZpvd2, iEZpvd, charSequence, this, seq, oac));
                valueAnimatorOfInt.start();
                AhwBna().KWHzl(seq, true);
            } else {
                ohk.setText(charSequence);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            ohk.setText(charSequence);
        }
    }

    public static final void KWHzl(android.animation.ValueAnimator valueAnimator, oHK ohk, java.lang.CharSequence charSequence, long j, int i, android.animation.ValueAnimator valueAnimator2) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(valueAnimator2, "");
        java.lang.Object animatedValue = valueAnimator2.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        int iIntValue = ((java.lang.Integer) animatedValue).intValue();
        try {
            Result.Application application = Result.Companion;
            ohk.setText(charSequence.subSequence(0, iIntValue));
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("StreamMessageViewHolder", "seq: " + j + ", Failed to update text: length=" + iIntValue + ", max=" + i, thM7380exceptionOrNullimpl);
            ohk.setText(charSequence);
            valueAnimator.cancel();
        }
    }

    public static final class StateListAnimator extends android.animation.AnimatorListenerAdapter {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ int EZpvd;
        public final /* synthetic */ java.lang.CharSequence KWHzl;
        public final /* synthetic */ oAC<AbstractC44111sDt, AbstractC44117sDz> OLrzqt;
        public final /* synthetic */ long copydefault;
        public final /* synthetic */ nCJ djBIcL;

        public StateListAnimator(int i, int i2, java.lang.CharSequence charSequence, nCJ ncj, long j, oAC<AbstractC44111sDt, AbstractC44117sDz> oac) {
            this.AEQbTJ = i;
            this.EZpvd = i2;
            this.KWHzl = charSequence;
            this.djBIcL = ncj;
            this.copydefault = j;
            this.OLrzqt = oac;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            int i = this.AEQbTJ;
            int i2 = this.EZpvd;
            pUU.EZpvd("StreamMessageViewHolder", "onAnimationStart: typing " + (i - i2) + " new characters, ended with " + ((java.lang.Object) this.KWHzl.subSequence(i2, i)));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            super.onAnimationEnd(animator);
            pUU.EZpvd("StreamMessageViewHolder", "onAnimationEnd");
            this.djBIcL.AhwBna().KWHzl(this.copydefault, false);
            this.djBIcL.AEQbTJ(this.OLrzqt, this.copydefault);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            super.onAnimationCancel(animator);
            pUU.EZpvd("StreamMessageViewHolder", "onAnimationCancel");
            this.djBIcL.AhwBna().KWHzl(this.copydefault, false);
            this.djBIcL.AEQbTJ(this.OLrzqt, this.copydefault);
        }
    }

    public final void AEQbTJ(oAC<AbstractC44111sDt, AbstractC44117sDz> oac, long j) {
        OKMessage oKMessageOLrzqt;
        C35254nrp c35254nrpEZpvd = AhwBna().EZpvd(j);
        if (AhwBna().copydefault(j)) {
            if (c35254nrpEZpvd != null) {
                OLrzqt(oac, c35254nrpEZpvd);
                return;
            }
            return;
        }
        AhwBna().KWHzl(j);
        OKMessageContent content = (c35254nrpEZpvd == null || (oKMessageOLrzqt = c35254nrpEZpvd.OLrzqt()) == null) ? null : oKMessageOLrzqt.getContent();
        OKStreamPlaceHolderMessage oKStreamPlaceHolderMessage = content instanceof OKStreamPlaceHolderMessage ? (OKStreamPlaceHolderMessage) content : null;
        pUU.EZpvd("StreamMessageViewHolder", "seq: " + j + ", final item: " + (oKStreamPlaceHolderMessage != null ? oKStreamPlaceHolderMessage.isCompleted() : null));
        if (c35254nrpEZpvd != null) {
            KWHzl((oGY<AbstractC44111sDt>) oac, c35254nrpEZpvd);
        }
        oac.setIsRecyclable(true);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;Landroidx/viewbinding/ViewBinding;)Z */
    @Override // o.AbstractC35707oAs
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKStreamPlaceHolderMessage oKStreamPlaceHolderMessage, @NotNull ViewBinding viewBinding) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKStreamPlaceHolderMessage, "");
        Intrinsics.checkNotNullParameter(viewBinding, "");
        EZpvd(viewBinding, c35254nrp);
        return true;
    }

    public final void EZpvd(ViewBinding viewBinding, C35254nrp c35254nrp) {
        if (getFieldNames()) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(DbNXlk()), null, null, new StreamMessageViewHolder$longPressAction$1(c35254nrp, this, viewBinding, null), 3, null);
        }
    }

    public final void AEQbTJ(oAC<AbstractC44111sDt, AbstractC44117sDz> oac, final C35254nrp c35254nrp) {
        OKMessageContent content = c35254nrp.OLrzqt().getContent();
        OKStreamPlaceHolderMessage oKStreamPlaceHolderMessage = content instanceof OKStreamPlaceHolderMessage ? (OKStreamPlaceHolderMessage) content : null;
        if (oKStreamPlaceHolderMessage == null) {
            return;
        }
        java.lang.String content2 = oKStreamPlaceHolderMessage.getContent();
        if (content2 != null && content2.length() > 0) {
            LinearLayoutCompat linearLayoutCompat = oac.copydefault().AhwBna;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            AEQbTJ(c35254nrp, linearLayoutCompat);
        } else {
            oac.copydefault().AhwBna.setBackground(null);
        }
        AbstractC44117sDz abstractC44117sDz = (AbstractC44117sDz) oac.EZpvd();
        oHK ohk = abstractC44117sDz.EZpvd;
        ohk.setNormalTextColor(ContextCompat.getColor(ohk.getContext(), C52761wXj.Activity.fdOvFl));
        ohk.setIMStyle(new Function1() { // from class: o.nCR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return nCJ.EZpvd(this.KWHzl, c35254nrp, (java.lang.String) obj);
            }
        });
        android.content.Context context = ohk.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ohk.setMaxWidth(AbstractC35707oAs.getMaxBubbleWidth$default(this, context, 0, 2, null));
        ViewStubProxy viewStubProxy = abstractC44117sDz.KWHzl;
        Intrinsics.checkNotNullExpressionValue(viewStubProxy, "");
        C33131mqf.EZpvd(viewStubProxy);
    }

    public static final Unit EZpvd(nCJ ncj, C35254nrp c35254nrp, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        new IMEventTracker().OLrzqt(LifecycleOwnerKt.getLifecycleScope(ncj.DbNXlk()), c35254nrp.OLrzqt().getTargetId(), str, IMEventTracker.LinkLocation.Message, c35254nrp.OLrzqt().getSenderUserId());
        return Unit.INSTANCE;
    }

    public final void KWHzl(oGY<AbstractC44111sDt> ogy, C35254nrp c35254nrp) {
        oAC oac = ogy instanceof oAC ? (oAC) ogy : null;
        AbstractC44117sDz abstractC44117sDz = oac != null ? (AbstractC44117sDz) oac.EZpvd() : null;
        OKMessageContent content = c35254nrp.OLrzqt().getContent();
        OKStreamPlaceHolderMessage oKStreamPlaceHolderMessage = content instanceof OKStreamPlaceHolderMessage ? (OKStreamPlaceHolderMessage) content : null;
        if (oKStreamPlaceHolderMessage == null || abstractC44117sDz == null) {
            return;
        }
        AEQbTJ((oAC<AbstractC44111sDt, AbstractC44117sDz>) ogy, c35254nrp);
        java.lang.CharSequence charSequenceOLrzqt = sSS.OLrzqt(oKStreamPlaceHolderMessage, ContextCompat.getColor(abstractC44117sDz.getRoot().getContext(), C52761wXj.Activity.fdOvFl), ContextCompat.getColor(abstractC44117sDz.getRoot().getContext(), C52761wXj.Activity.fdOvFl));
        java.lang.String strEZpvd = c35254nrp.EZpvd();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strEZpvd)) {
            android.content.Context context = abstractC44117sDz.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            charSequenceOLrzqt = C37683oyU.setupHighlightBgSpanStyle$default(charSequenceOLrzqt, context, strEZpvd, C33070mpX.copydefault(C52761wXj.Activity.fkESqH), null, 8, null);
        }
        abstractC44117sDz.EZpvd.setText(charSequenceOLrzqt);
    }
}
