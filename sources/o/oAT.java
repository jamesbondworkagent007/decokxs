package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewStubProxy;
import com.google.gson.Gson;
import com.okinc.im.message.provider.direction.BaseTextSendMessageViewProvider$updateSenderAvatar$1;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKCustomMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKTextMessage;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import com.okinc.rxutils.RxBus;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C44105sDn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class oAT<C extends OKMessageContent> extends AbstractC35707oAs<C, AbstractC44112sDu, AbstractC44115sDx> {
    public final int AEQbTJ = C44105sDn.StateListAnimator.valueOf;
    public final Gson KWHzl = new Gson();
    public final java.lang.Integer copydefault;

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKMessage.SentStatus.values().length];
            try {
                iArr[OKMessage.SentStatus.SENDING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKMessage.SentStatus.FAILED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OKMessage.SentStatus.SENT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[OKMessage.SentStatus.READ.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[OKConversationType.values().length];
            try {
                iArr2[OKConversationType.BROADCAST.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            KWHzl = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public int AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public java.lang.Integer EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull android.widget.ImageView imageView, int i, @NotNull C35254nrp c35254nrp, @NotNull C c) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(c, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt(@NotNull C c, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(c, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return true;
    }

    @Override // o.AbstractC35707oAs
    public boolean bf_() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35882oHe
    public int copydefault() {
        return C44105sDn.StateListAnimator.KWHzl;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.oGY, java.lang.Object, java.util.List] */
    @Override // o.AbstractC35707oAs, o.AbstractC35882oHe
    public /* synthetic */ void AEQbTJ(oGY ogy, C35254nrp c35254nrp, java.util.List list) {
        copydefault((oGY<AbstractC44112sDu>) ogy, c35254nrp, (java.util.List<java.lang.Object>) list);
    }

    @Override // o.AbstractC35703oAo, o.AbstractC35882oHe
    public void AEQbTJ(@NotNull oGY<AbstractC44112sDu> ogy) {
        Intrinsics.checkNotNullParameter(ogy, "");
        super.AEQbTJ(ogy);
        C35893oHp c35893oHp = ((AbstractC44112sDu) ogy.copydefault()).copydefault;
        Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
        c35893oHp.setVisibility(getNewProxyInstance() ? 0 : 8);
    }

    @Override // o.AbstractC35703oAo
    public java.util.Set<OKMessage.MessageDirection> be_() {
        return yED.AEQbTJ(OKMessage.MessageDirection.SEND);
    }

    @Override // o.AbstractC35707oAs
    public android.view.ViewGroup copydefault(@NotNull oAC<AbstractC44112sDu, AbstractC44115sDx> oac) {
        Intrinsics.checkNotNullParameter(oac, "");
        LinearLayoutCompat linearLayoutCompat = oac.copydefault().AYXKKw;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        return linearLayoutCompat;
    }

    @Override // o.AbstractC35707oAs
    public void copydefault(@NotNull oGY<AbstractC44112sDu> ogy, @NotNull C35254nrp c35254nrp, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(list, "");
        super.copydefault(ogy, c35254nrp, list);
        if (list.contains("PAYLOAD_REACTION_UPDATE")) {
            AbstractC44112sDu abstractC44112sDu = (AbstractC44112sDu) ogy.copydefault();
            ViewStubProxy viewStubProxy = abstractC44112sDu.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(viewStubProxy, "");
            ViewStubProxy viewStubProxy2 = abstractC44112sDu.values;
            Intrinsics.checkNotNullExpressionValue(viewStubProxy2, "");
            EZpvd(false, c35254nrp, viewStubProxy, viewStubProxy2);
            return;
        }
        OLrzqt(ogy, c35254nrp);
    }

    private final void OLrzqt(final oGY<AbstractC44112sDu> ogy, final C35254nrp c35254nrp) {
        KWHzl(false);
        AbstractC44112sDu abstractC44112sDu = (AbstractC44112sDu) ogy.copydefault();
        int adapterPosition = ogy.getAdapterPosition();
        android.widget.TextView textView = abstractC44112sDu.fIwbmz;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        AEQbTJ(adapterPosition, c35254nrp, textView);
        OKMessage oKMessageOLrzqt = c35254nrp.OLrzqt();
        C55113xdn c55113xdn = abstractC44112sDu.valueOf;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        android.widget.LinearLayout linearLayout = abstractC44112sDu.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        AEQbTJ(adapterPosition, oKMessageOLrzqt, c55113xdn, linearLayout, new Function1() { // from class: o.oAS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oAT.AEQbTJ(this.copydefault, c35254nrp, ogy, (android.view.View) obj);
            }
        });
        android.widget.TextView textView2 = abstractC44112sDu.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        AEQbTJ(textView2, c35254nrp);
        C35893oHp c35893oHp = abstractC44112sDu.copydefault;
        Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
        KWHzl(ogy, c35254nrp, c35893oHp);
        android.widget.TextView textView3 = abstractC44112sDu.fJNWhG;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        android.widget.TextView textView4 = abstractC44112sDu.fJNWhG;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        EZpvd(adapterPosition, c35254nrp, textView3, textView4);
        ViewStubProxy viewStubProxy = abstractC44112sDu.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(viewStubProxy, "");
        ViewStubProxy viewStubProxy2 = abstractC44112sDu.values;
        Intrinsics.checkNotNullExpressionValue(viewStubProxy2, "");
        EZpvd(false, c35254nrp, viewStubProxy, viewStubProxy2);
    }

    public static final Unit AEQbTJ(oAT oat, C35254nrp c35254nrp, oGY ogy, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        oat.OLrzqt(c35254nrp, c35254nrp.OLrzqt(), ogy.getBindingAdapterPosition());
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC35707oAs
    public void copydefault(@NotNull oAC<AbstractC44112sDu, AbstractC44115sDx> oac, @NotNull C35254nrp c35254nrp, @NotNull C c) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(c, "");
        super.copydefault(oac, c35254nrp, c);
        C35893oHp c35893oHp = oac.copydefault().copydefault;
        Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
        KWHzl(c35893oHp, oac, c35254nrp, c);
        copydefault((AbstractC44115sDx) oac.EZpvd(), c35254nrp, c);
        android.content.Context context = oac.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int maxBubbleWidth$default = AbstractC35707oAs.getMaxBubbleWidth$default(this, context, 0, 2, null);
        ((AbstractC44115sDx) oac.EZpvd()).copydefault.setMaxWidth(maxBubbleWidth$default);
        LinearLayoutCompat linearLayoutCompat = oac.copydefault().AhwBna;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        ViewGroup.LayoutParams layoutParams = linearLayoutCompat.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.matchConstraintMaxWidth = maxBubbleWidth$default;
        linearLayoutCompat.setLayoutParams(layoutParams2);
        C35888oHk c35888oHk = oac.copydefault().fetchVPNInfo;
        c35888oHk.setMaxWidthPercent(bl_());
        c35888oHk.setMaxWidthDp(maxBubbleWidth$default / oac.itemView.getContext().getResources().getDisplayMetrics().density);
    }

    private final void KWHzl(final android.widget.ImageView imageView, final oAC<AbstractC44112sDu, AbstractC44115sDx> oac, final C35254nrp c35254nrp, final C c) {
        imageView.setOnClickListener(new View.OnClickListener() { // from class: o.oAQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                oAT.copydefault(this.EZpvd, imageView, oac, c35254nrp, c, view);
            }
        });
    }

    public static final void copydefault(oAT oat, android.widget.ImageView imageView, oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent, android.view.View view) {
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
        if (interfaceC35180nqU != null && interfaceC35180nqU.djBIcL() && oat.getFieldNames()) {
            oat.KWHzl(imageView, oac.getBindingAdapterPosition(), c35254nrp, oKMessageContent);
        }
    }

    public final void copydefault(final AbstractC44115sDx abstractC44115sDx, C35254nrp c35254nrp, C c) {
        java.lang.String strAYXKKw;
        C35184nqY c35184nqYOLrzqt = OLrzqt(C33129mqd.gEmmrt(c.getExtra()));
        C35246nrh c35246nrhEZpvd = EZpvd(C33129mqd.gEmmrt(c.getExtra()));
        android.widget.TextView textView = abstractC44115sDx.AEQbTJ;
        if (c35184nqYOLrzqt != null && c35184nqYOLrzqt.copydefault()) {
            strAYXKKw = C33070mpX.AYXKKw(C44105sDn.PendingIntent.fARcdN);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C44105sDn.PendingIntent.OLrzqt);
        }
        textView.setText(strAYXKKw);
        android.widget.TextView textView2 = abstractC44115sDx.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(OLrzqt(c, c35184nqYOLrzqt, c35246nrhEZpvd) ? 0 : 8);
        android.view.View view = abstractC44115sDx.KWHzl;
        Intrinsics.checkNotNullExpressionValue(view, "");
        android.widget.TextView textView3 = abstractC44115sDx.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        view.setVisibility(textView3.getVisibility() != 0 ? 8 : 0);
        abstractC44115sDx.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.oAY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                oAT.EZpvd(abstractC44115sDx, view2);
            }
        });
        abstractC44115sDx.copydefault.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.oAW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view2) {
                return oAT.AhwBna(abstractC44115sDx, view2);
            }
        });
    }

    public static final void EZpvd(AbstractC44115sDx abstractC44115sDx, android.view.View view) {
        abstractC44115sDx.getRoot().performClick();
    }

    public static final boolean AhwBna(AbstractC44115sDx abstractC44115sDx, android.view.View view) {
        return abstractC44115sDx.getRoot().performLongClick();
    }

    private final C35184nqY OLrzqt(java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((C35184nqY) this.KWHzl.fromJson(str, C35184nqY.class));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        return (C35184nqY) objM7377constructorimpl;
    }

    private final C35246nrh EZpvd(java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((C35246nrh) this.KWHzl.fromJson(str, C35246nrh.class));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        return (C35246nrh) objM7377constructorimpl;
    }

    private final boolean OLrzqt(C c, C35184nqY c35184nqY, C35246nrh c35246nrh) {
        if (c instanceof OKCustomMessage) {
            if (c35184nqY != null) {
                return c35184nqY.copydefault();
            }
        } else if ((c instanceof OKTextMessage) && c35246nrh != null) {
            return c35246nrh.EZpvd();
        }
        return false;
    }

    public final void KWHzl(@NotNull oGY<AbstractC44112sDu> ogy, @NotNull C35254nrp c35254nrp, @NotNull C35893oHp c35893oHp) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(c35893oHp, "");
        c35893oHp.setVisibility(getNewProxyInstance() ? 0 : 8);
        if (c35893oHp.getVisibility() == 0) {
            AEQbTJ(ogy, new BaseTextSendMessageViewProvider$updateSenderAvatar$1(this, c35254nrp, c35893oHp, null));
        }
    }

    public final void AEQbTJ(int i, @NotNull OKMessage oKMessage, @NotNull C55113xdn c55113xdn, @NotNull android.view.View view, @NotNull final Function1<? super android.view.View, Unit> function1) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(c55113xdn, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(function1, "");
        OKMessage.SentStatus sentStatus = oKMessage.getSentStatus();
        pUU.KWHzl(uzCIH(), "updateSentStatus:" + sentStatus + " @" + i + " message:" + oKMessage.getContent());
        int i2 = sentStatus == null ? -1 : TaskDescription.EZpvd[sentStatus.ordinal()];
        if (i2 == 1) {
            C55113xdn.showLoading$default(c55113xdn, 0L, 1, null);
            view.setVisibility(8);
            view.setOnClickListener(null);
            return;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                c55113xdn.copydefault();
                view.setVisibility(8);
                view.setOnClickListener(null);
                return;
            } else {
                c55113xdn.copydefault();
                c55113xdn.setVisibility(8);
                view.setVisibility(8);
                view.setOnClickListener(null);
                return;
            }
        }
        c55113xdn.copydefault();
        c55113xdn.setVisibility(8);
        OKMessageContent content = oKMessage.getContent();
        Intrinsics.copydefault(content, "");
        if (OLrzqt(content, oKMessage)) {
            view.setVisibility(0);
            android.view.View viewFindViewById = view.findViewById(C44105sDn.ActionBar.fFgQHt);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            viewFindViewById.setVisibility(0);
            ((android.widget.TextView) view.findViewById(C44105sDn.ActionBar.fFgQHt)).setText(C44105sDn.PendingIntent.gEmmrt);
            android.view.View viewFindViewById2 = view.findViewById(C44105sDn.ActionBar.AEQbTJ);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            viewFindViewById2.setVisibility(0);
            android.view.View viewFindViewById3 = view.findViewById(C44105sDn.ActionBar.copydefault);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            viewFindViewById3.setVisibility(8);
            view.setOnClickListener(new View.OnClickListener() { // from class: o.oAP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    oAT.KWHzl(function1, view2);
                }
            });
            return;
        }
        view.setVisibility(8);
    }

    public static final void KWHzl(Function1 function1, android.view.View view) {
        Intrinsics.copydefault(view);
        function1.invoke(view);
    }

    private final void AEQbTJ(android.widget.TextView textView, C35254nrp c35254nrp) {
        java.lang.String strAYXKKw;
        OKConversation oKConversationInvoke;
        OKMessage oKMessageOLrzqt = c35254nrp.OLrzqt();
        boolean z = OKMessage.MessageDirection.SEND == oKMessageOLrzqt.getMessageDirection();
        boolean z2 = OKConversationType.PRIVATE == oKMessageOLrzqt.getConversationType();
        Function0<OKConversation> function0FetchVPNInfo = fetchVPNInfo();
        java.lang.Boolean bool = null;
        boolean z3 = ((function0FetchVPNInfo == null || (oKConversationInvoke = function0FetchVPNInfo.invoke()) == null) ? null : oKConversationInvoke.getGroupType()) == GroupTagType.VIDEO_CALL_CHAT_GROUP;
        OKMessage.SentStatus sentStatus = oKMessageOLrzqt.getSentStatus();
        int i = sentStatus == null ? -1 : TaskDescription.EZpvd[sentStatus.ordinal()];
        if (i == 3) {
            bool = java.lang.Boolean.FALSE;
        } else if (i == 4) {
            bool = java.lang.Boolean.TRUE;
        }
        if (z && z2 && !z3 && bool != null && !android.text.TextUtils.equals(oKMessageOLrzqt.getSenderUserId(), oKMessageOLrzqt.getTargetId()) && c35254nrp.DbNXlk()) {
            textView.setVisibility(0);
            if (bool.booleanValue()) {
                strAYXKKw = C33070mpX.AYXKKw(C44105sDn.PendingIntent.valueOf);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C44105sDn.PendingIntent.isConnected);
            }
            textView.setText(strAYXKKw);
        } else {
            textView.setVisibility(8);
        }
        pUU.KWHzl(uzCIH(), "updateReadStatus--> isRead:" + bool + " message:" + oKMessageOLrzqt.getContent());
    }

    @Override // o.AbstractC35707oAs
    public void copydefault(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull C c) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(c, "");
        RxBus.AEQbTJ(new C35240nrb(c35254nrp.OLrzqt().getSeq()));
    }

    public void OLrzqt(@NotNull C35254nrp c35254nrp, @NotNull OKMessage oKMessage, int i) {
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        int iKWHzl = c35254nrp.KWHzl();
        if (iKWHzl == 4 || iKWHzl == 5) {
            Function1<OKMessage, Unit> function1FARcdN = fARcdN();
            if (function1FARcdN != null) {
                function1FARcdN.invoke(oKMessage);
                return;
            }
            return;
        }
        if (TaskDescription.KWHzl[oKMessage.getConversationType().ordinal()] == 1) {
            RxBus.AEQbTJ(new oAU(i));
            return;
        }
        InterfaceC35179nqT interfaceC35179nqT = (InterfaceC35179nqT) C43251rlk.OLrzqt(InterfaceC35179nqT.class);
        if (interfaceC35179nqT != null) {
            interfaceC35179nqT.AEQbTJ(oKMessage);
        }
    }
}
