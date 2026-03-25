package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import androidx.fragment.app.ViewKt;
import com.okinc.im.message.provider.direction.BaseSendMessageViewProvider$updateSenderAvatar$1;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKUserInfo;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import o.C44105sDn;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public abstract class oAA<C extends OKMessageContent, CVB extends ViewDataBinding> extends AbstractC35707oAs<C, AbstractC44112sDu, CVB> {
    public java.util.HashMap<java.lang.Integer, Job> AxsJAY = new java.util.HashMap<>();
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AuCTelauCTel = 8;

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKMessage.SentStatus.values().length];
            try {
                iArr[OKMessage.SentStatus.SENDING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKMessage.SentStatus.SENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OKMessage.SentStatus.READ.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[OKConversationType.values().length];
            try {
                iArr2[OKConversationType.BROADCAST.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            copydefault = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35882oHe
    public int copydefault() {
        return C44105sDn.StateListAnimator.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull android.widget.ImageView imageView, int i, @NotNull C35254nrp c35254nrp, @NotNull C c) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(c, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault(@NotNull C c, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(c, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.oGY, java.lang.Object, java.util.List] */
    @Override // o.AbstractC35707oAs, o.AbstractC35882oHe
    public /* synthetic */ void AEQbTJ(oGY ogy, C35254nrp c35254nrp, java.util.List list) {
        copydefault((oGY<AbstractC44112sDu>) ogy, c35254nrp, (java.util.List<java.lang.Object>) list);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oAA.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
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
    public android.view.ViewGroup copydefault(@NotNull oAC<AbstractC44112sDu, CVB> oac) {
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
        AEQbTJ(ogy, c35254nrp);
    }

    private final void AEQbTJ(final oGY<AbstractC44112sDu> ogy, final C35254nrp c35254nrp) {
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
        OLrzqt(adapterPosition, c35254nrp, oKMessageOLrzqt, c55113xdn, linearLayout, new Function1() { // from class: o.oAG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oAA.EZpvd(this.AEQbTJ, c35254nrp, ogy, (android.view.View) obj);
            }
        });
        android.widget.TextView textView2 = abstractC44112sDu.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        KWHzl(textView2, c35254nrp);
        C35893oHp c35893oHp = abstractC44112sDu.copydefault;
        Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
        AEQbTJ(ogy, c35254nrp, c35893oHp);
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

    public static final Unit EZpvd(oAA oaa, C35254nrp c35254nrp, oGY ogy, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        oaa.AEQbTJ(c35254nrp, c35254nrp.OLrzqt(), ogy.getBindingAdapterPosition());
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC35707oAs
    public void copydefault(@NotNull final oAC<AbstractC44112sDu, CVB> oac, @NotNull final C35254nrp c35254nrp, @NotNull final C c) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(c, "");
        super.copydefault(oac, c35254nrp, c);
        final C35893oHp c35893oHp = oac.copydefault().copydefault;
        Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
        c35893oHp.setOnClickListener(new View.OnClickListener() { // from class: o.oAH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                oAA.EZpvd(this.OLrzqt, c35893oHp, oac, c35254nrp, c, view);
            }
        });
        if (C34703nhO.AhwBna(c35893oHp.getContext())) {
            c35893oHp.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.oAL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    return oAA.OLrzqt(c35254nrp, c35893oHp, view);
                }
            });
        }
        android.content.Context context = oac.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int maxBubbleWidth$default = AbstractC35707oAs.getMaxBubbleWidth$default(this, context, 0, 2, null);
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

    public static final void EZpvd(oAA oaa, C35893oHp c35893oHp, oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent, android.view.View view) {
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
        if (interfaceC35180nqU != null && interfaceC35180nqU.djBIcL() && oaa.getFieldNames()) {
            oaa.copydefault((android.widget.ImageView) c35893oHp, oac.getBindingAdapterPosition(), c35254nrp, oKMessageContent);
        }
    }

    public static final boolean OLrzqt(C35254nrp c35254nrp, C35893oHp c35893oHp, android.view.View view) {
        OKUserInfo userInfo;
        OKMessageContent content = c35254nrp.OLrzqt().getContent();
        C33570myu.EZpvd(c35893oHp.getContext(), c35254nrp + "\n userExtra:" + ((content == null || (userInfo = content.getUserInfo()) == null) ? null : userInfo.getExtra()));
        return true;
    }

    public final void AEQbTJ(@NotNull oGY<AbstractC44112sDu> ogy, @NotNull C35254nrp c35254nrp, @NotNull C35893oHp c35893oHp) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(c35893oHp, "");
        c35893oHp.setVisibility(getNewProxyInstance() ? 0 : 8);
        if (c35893oHp.getVisibility() == 0) {
            AEQbTJ(ogy, new BaseSendMessageViewProvider$updateSenderAvatar$1(this, c35254nrp, c35893oHp, null));
        }
    }

    public final void OLrzqt(int i, @NotNull C35254nrp c35254nrp, @NotNull final OKMessage oKMessage, @NotNull C55113xdn c55113xdn, @NotNull android.view.View view, @NotNull final Function1<? super android.view.View, Unit> function1) {
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(c55113xdn, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(function1, "");
        OKMessage.SentStatus sentStatus = oKMessage.getSentStatus();
        pUU.KWHzl(uzCIH(), "updateSentStatus:" + sentStatus + " @" + i + " message:" + oKMessage.getContent());
        if (c35254nrp.KWHzl() == 1 || c35254nrp.KWHzl() == 4 || c35254nrp.KWHzl() == 5 || c35254nrp.KWHzl() == 6 || sentStatus == OKMessage.SentStatus.FAILED) {
            c55113xdn.copydefault();
            c55113xdn.setVisibility(8);
            OKMessageContent content = oKMessage.getContent();
            Intrinsics.copydefault(content, "");
            if (copydefault(content, oKMessage)) {
                boolean z = c35254nrp.KWHzl() == 4;
                boolean z2 = c35254nrp.KWHzl() == 5;
                boolean z3 = c35254nrp.KWHzl() == 6;
                if (z || z2 || z3) {
                    view.setVisibility(0);
                    android.view.View viewFindViewById = view.findViewById(C44105sDn.ActionBar.AEQbTJ);
                    Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
                    viewFindViewById.setVisibility(0);
                    android.view.View viewFindViewById2 = view.findViewById(C44105sDn.ActionBar.copydefault);
                    Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
                    viewFindViewById2.setVisibility(8);
                    if (z3) {
                        android.view.View viewFindViewById3 = view.findViewById(C44105sDn.ActionBar.fFgQHt);
                        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
                        viewFindViewById3.setVisibility(0);
                        ((android.widget.TextView) view.findViewById(C44105sDn.ActionBar.fFgQHt)).setText(C44105sDn.PendingIntent.AkhnZx);
                    }
                    view.setOnClickListener(new View.OnClickListener() { // from class: o.oAJ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view2) {
                            oAA.copydefault(this.EZpvd, oKMessage, view2);
                        }
                    });
                    return;
                }
                view.setVisibility(0);
                ((android.widget.TextView) view.findViewById(C44105sDn.ActionBar.fFgQHt)).setText(C44105sDn.PendingIntent.gEmmrt);
                android.view.View viewFindViewById4 = view.findViewById(C44105sDn.ActionBar.fFgQHt);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
                viewFindViewById4.setVisibility(0);
                android.view.View viewFindViewById5 = view.findViewById(C44105sDn.ActionBar.AEQbTJ);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
                viewFindViewById5.setVisibility(0);
                android.view.View viewFindViewById6 = view.findViewById(C44105sDn.ActionBar.copydefault);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
                viewFindViewById6.setVisibility(8);
                view.setOnClickListener(new View.OnClickListener() { // from class: o.oAF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        oAA.copydefault(function1, view2);
                    }
                });
                return;
            }
            view.setVisibility(8);
            return;
        }
        int i2 = sentStatus == null ? -1 : Activity.AEQbTJ[sentStatus.ordinal()];
        if (i2 == 1) {
            c55113xdn.setVisibility(0);
            C55113xdn.showLoading$default(c55113xdn, 0L, 1, null);
            c55113xdn.setVisibility(0);
            view.setVisibility(8);
            view.setOnClickListener(null);
            return;
        }
        if (i2 == 2) {
            OKMessageContent content2 = oKMessage.getContent();
            Intrinsics.copydefault(content2, "");
            if (Intrinsics.EZpvd((java.lang.Object) AEQbTJ(content2.getExtra()), (java.lang.Object) "1")) {
                c55113xdn.copydefault();
                c55113xdn.setVisibility(8);
                view.setVisibility(0);
                android.view.View viewFindViewById7 = view.findViewById(C44105sDn.ActionBar.fFgQHt);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "");
                viewFindViewById7.setVisibility(0);
                ((android.widget.TextView) view.findViewById(C44105sDn.ActionBar.fFgQHt)).setText(C44105sDn.PendingIntent.DbNXlk);
                android.view.View viewFindViewById8 = view.findViewById(C44105sDn.ActionBar.AEQbTJ);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "");
                viewFindViewById8.setVisibility(8);
                android.view.View viewFindViewById9 = view.findViewById(C44105sDn.ActionBar.copydefault);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "");
                viewFindViewById9.setVisibility(0);
                view.setOnClickListener(new View.OnClickListener() { // from class: o.oAI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        oAA.OLrzqt(this.OLrzqt, view2);
                    }
                });
                return;
            }
            c55113xdn.setVisibility(8);
            view.setVisibility(8);
            view.setOnClickListener(null);
            return;
        }
        c55113xdn.copydefault();
        c55113xdn.setVisibility(8);
        view.setVisibility(8);
        view.setOnClickListener(null);
    }

    public static final void copydefault(oAA oaa, OKMessage oKMessage, android.view.View view) {
        Function1<OKMessage, Unit> function1FARcdN = oaa.fARcdN();
        if (function1FARcdN != null) {
            function1FARcdN.invoke(oKMessage);
        }
    }

    public static final void copydefault(Function1 function1, android.view.View view) {
        Intrinsics.copydefault(view);
        function1.invoke(view);
    }

    public static final void OLrzqt(oAA oaa, android.view.View view) {
        try {
            Intrinsics.copydefault(view);
            androidx.fragment.app.Fragment fragmentFindFragment = ViewKt.findFragment(view);
            C35704oAp c35704oApOLrzqt = C35704oAp.Companion.OLrzqt();
            androidx.fragment.app.FragmentManager parentFragmentManager = fragmentFindFragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            c35704oApOLrzqt.show(parentFragmentManager);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ(oaa.uzCIH(), "Failed to show bottom sheet", e);
        }
    }

    public final void KWHzl(android.widget.TextView textView, C35254nrp c35254nrp) {
        java.lang.String strAYXKKw;
        OKConversation oKConversationInvoke;
        OKMessage oKMessageOLrzqt = c35254nrp.OLrzqt();
        boolean z = OKMessage.MessageDirection.SEND == oKMessageOLrzqt.getMessageDirection();
        boolean z2 = OKConversationType.PRIVATE == oKMessageOLrzqt.getConversationType();
        Function0<OKConversation> function0FetchVPNInfo = fetchVPNInfo();
        java.lang.Boolean bool = null;
        boolean z3 = ((function0FetchVPNInfo == null || (oKConversationInvoke = function0FetchVPNInfo.invoke()) == null) ? null : oKConversationInvoke.getGroupType()) == GroupTagType.VIDEO_CALL_CHAT_GROUP;
        OKMessage.SentStatus sentStatus = oKMessageOLrzqt.getSentStatus();
        int i = sentStatus == null ? -1 : Activity.AEQbTJ[sentStatus.ordinal()];
        if (i == 2) {
            bool = java.lang.Boolean.FALSE;
        } else if (i == 3) {
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

    public void AEQbTJ(@NotNull C35254nrp c35254nrp, @NotNull OKMessage oKMessage, int i) {
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
        if (Activity.copydefault[oKMessage.getConversationType().ordinal()] == 1) {
            RxBus.AEQbTJ(new oAU(i));
            return;
        }
        InterfaceC35179nqT interfaceC35179nqT = (InterfaceC35179nqT) C43251rlk.OLrzqt(InterfaceC35179nqT.class);
        if (interfaceC35179nqT != null) {
            interfaceC35179nqT.AEQbTJ(oKMessage);
        }
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return "0";
        }
        try {
            java.lang.String strOptString = new JSONObject(str).optString("rejectReasons", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            if (Intrinsics.EZpvd((java.lang.Object) strOptString, (java.lang.Object) HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
                return "0";
            }
            JSONArray jSONArray = new JSONArray(strOptString);
            if (jSONArray.length() == 0) {
                return "0";
            }
            java.lang.String strOptString2 = jSONArray.optString(0, "0");
            Intrinsics.copydefault((java.lang.Object) strOptString2);
            return strOptString2;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ(uzCIH(), "Error parsing message extra", e);
            return "0";
        }
    }
}
