package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewStubProxy;
import com.google.gson.Gson;
import com.okinc.im.bean.IMUserInfo;
import com.okinc.im.bean.tag.TagSize;
import com.okinc.im.message.MessageClusterType;
import com.okinc.im.message.provider.direction.BaseTextReceiveMessageViewProvider$onBindViewHolder$1;
import com.okinc.im.message.provider.direction.BaseTextReceiveMessageViewProvider$onFullBind$1$1;
import com.okinc.im.message.provider.direction.BaseTextReceiveMessageViewProvider$updateReceiverAvatar$1;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKCustomMessage;
import com.okinc.okimcore.model.im.OKMediaMessageContent;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKTextMessage;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C44105sDn;
import o.InterfaceC35179nqT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class oAO<C extends OKMessageContent> extends AbstractC35707oAs<C, AbstractC44111sDt, AbstractC44117sDz> {
    public final java.lang.Integer KWHzl;
    public final int EZpvd = C44105sDn.StateListAnimator.OLrzqt;
    public final Gson copydefault = new Gson();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public java.lang.Integer EZpvd() {
        return this.KWHzl;
    }

    @Override // o.AbstractC35707oAs
    public boolean bf_() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35882oHe
    public int copydefault() {
        return C44105sDn.StateListAnimator.EZpvd;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.oGY, java.lang.Object, java.util.List] */
    @Override // o.AbstractC35707oAs, o.AbstractC35882oHe
    public /* synthetic */ void AEQbTJ(oGY ogy, C35254nrp c35254nrp, java.util.List list) {
        copydefault((oGY<AbstractC44111sDt>) ogy, c35254nrp, (java.util.List<java.lang.Object>) list);
    }

    @Override // o.AbstractC35703oAo, o.AbstractC35882oHe
    public void AEQbTJ(@NotNull oGY<AbstractC44111sDt> ogy) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(ogy, "");
        super.AEQbTJ(ogy);
        try {
            Result.Application application = Result.Companion;
            C35893oHp c35893oHp = ((AbstractC44111sDt) ogy.copydefault()).OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
            c35893oHp.setVisibility(8);
            android.widget.TextView textView = ((AbstractC44111sDt) ogy.copydefault()).ejfBZ;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            android.widget.TextView textView2 = ((AbstractC44111sDt) ogy.copydefault()).uzCIH;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
            android.widget.TextView textView3 = ((AbstractC44111sDt) ogy.copydefault()).AuCTel;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(8);
            android.widget.LinearLayout linearLayout = ((AbstractC44111sDt) ogy.copydefault()).isConnected;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(8);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("BaseTextReceiveMessageViewProvider", "onViewRecycled error", thM7380exceptionOrNullimpl);
        }
    }

    @Override // o.AbstractC35703oAo
    public java.util.Set<OKMessage.MessageDirection> be_() {
        return yED.AEQbTJ(OKMessage.MessageDirection.RECEIVE);
    }

    @Override // o.AbstractC35707oAs
    public final android.view.ViewGroup copydefault(@NotNull oAC<AbstractC44111sDt, AbstractC44117sDz> oac) {
        Intrinsics.checkNotNullParameter(oac, "");
        android.widget.FrameLayout frameLayout = oac.copydefault().AYXKKw;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        return frameLayout;
    }

    @Override // o.AbstractC35707oAs
    public void copydefault(@NotNull oGY<AbstractC44111sDt> ogy, @NotNull C35254nrp c35254nrp, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(list, "");
        super.copydefault(ogy, c35254nrp, list);
        if (list.contains("PAYLOAD_UI_UPDATE")) {
            if (c35254nrp.copydefault() == MessageClusterType.First) {
                AEQbTJ(ogy, new BaseTextReceiveMessageViewProvider$onBindViewHolder$1(this, c35254nrp, ogy, null));
            }
        } else {
            if (list.contains("PAYLOAD_REACTION_UPDATE")) {
                AbstractC44111sDt abstractC44111sDt = (AbstractC44111sDt) ogy.copydefault();
                ViewStubProxy viewStubProxy = abstractC44111sDt.EZpvd;
                Intrinsics.checkNotNullExpressionValue(viewStubProxy, "");
                ViewStubProxy viewStubProxy2 = abstractC44111sDt.fetchVPNInfo;
                Intrinsics.checkNotNullExpressionValue(viewStubProxy2, "");
                EZpvd(true, c35254nrp, viewStubProxy, viewStubProxy2);
                return;
            }
            KWHzl(ogy, c35254nrp);
        }
    }

    private final void KWHzl(oGY<AbstractC44111sDt> ogy, C35254nrp c35254nrp) {
        AbstractC44111sDt abstractC44111sDt = (AbstractC44111sDt) ogy.copydefault();
        int adapterPosition = ogy.getAdapterPosition();
        android.widget.TextView textView = abstractC44111sDt.fARcdN;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        AEQbTJ(adapterPosition, c35254nrp, textView);
        if (c35254nrp.copydefault() == MessageClusterType.First) {
            AEQbTJ(ogy, new BaseTextReceiveMessageViewProvider$onFullBind$1$1(this, c35254nrp, ogy, abstractC44111sDt, null));
        }
        OLrzqt(ogy, c35254nrp);
        C35893oHp c35893oHp = abstractC44111sDt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
        copydefault(ogy, c35254nrp, c35893oHp);
        android.widget.TextView textView2 = abstractC44111sDt.AuCTel;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        android.widget.TextView textView3 = abstractC44111sDt.AuCTel;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        EZpvd(adapterPosition, c35254nrp, textView2, textView3);
        android.widget.LinearLayout linearLayout = ((AbstractC44111sDt) ogy.copydefault()).valueOf;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        android.widget.TextView textView4 = ((AbstractC44111sDt) ogy.copydefault()).getNewProxyInstance;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        OLrzqt(linearLayout, textView4, c35254nrp);
        ViewStubProxy viewStubProxy = abstractC44111sDt.EZpvd;
        Intrinsics.checkNotNullExpressionValue(viewStubProxy, "");
        ViewStubProxy viewStubProxy2 = abstractC44111sDt.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(viewStubProxy2, "");
        EZpvd(true, c35254nrp, viewStubProxy, viewStubProxy2);
        EZpvd(ogy);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void EZpvd(oGY<AbstractC44111sDt> ogy) {
        boolean z;
        android.widget.TextView textView = ((AbstractC44111sDt) ogy.copydefault()).ejfBZ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        int i = 0;
        boolean z2 = textView.getVisibility() == 0;
        android.widget.TextView textView2 = ((AbstractC44111sDt) ogy.copydefault()).uzCIH;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        if (textView2.getVisibility() == 0) {
            android.widget.TextView textView3 = ((AbstractC44111sDt) ogy.copydefault()).uzCIH;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            z = textView3.getVisibility() == 0;
        }
        android.widget.TextView textView4 = ((AbstractC44111sDt) ogy.copydefault()).AuCTel;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        boolean z3 = textView4.getVisibility() == 0;
        android.widget.LinearLayout linearLayout = ((AbstractC44111sDt) ogy.copydefault()).isConnected;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        if (!z2 && !z && !z3) {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ oAC AEQbTJ;
        public final /* synthetic */ android.widget.ImageView EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ OKMessageContent OLrzqt;
        public final /* synthetic */ C35254nrp copydefault;
        public final /* synthetic */ long djBIcL;
        public final /* synthetic */ oAO valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, oAO oao, android.widget.ImageView imageView, oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent) {
            this.KWHzl = view;
            this.djBIcL = j;
            this.valueOf = oao;
            this.EZpvd = imageView;
            this.AEQbTJ = oac;
            this.copydefault = c35254nrp;
            this.OLrzqt = oKMessageContent;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v12, resolved type: o.oAO */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.djBIcL || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
                if (interfaceC35180nqU != null && interfaceC35180nqU.djBIcL() && this.valueOf.getFieldNames()) {
                    this.valueOf.AEQbTJ(this.EZpvd, this.AEQbTJ.getBindingAdapterPosition(), this.copydefault, this.OLrzqt);
                }
            }
        }
    }

    @Override // o.AbstractC35707oAs
    public void copydefault(@NotNull oAC<AbstractC44111sDt, AbstractC44117sDz> oac, @NotNull C35254nrp c35254nrp, @NotNull C c) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(c, "");
        super.copydefault(oac, c35254nrp, c);
        C35893oHp c35893oHp = oac.copydefault().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
        AEQbTJ(c35893oHp, oac, c35254nrp, c);
        EZpvd((AbstractC44117sDz) oac.EZpvd(), c35254nrp, c);
        if (c35254nrp.OLrzqt().getConversationType() == OKConversationType.PRIVATE) {
            KWHzl(false);
        }
        boolean z = AubY() || !getNewProxyInstance();
        int iDp2px$default = C55298xhM.dp2px$default(32.0f, null, 1, null);
        android.content.Context context = oac.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iKWHzl = KWHzl(context, iDp2px$default);
        if (!z) {
            android.content.res.Resources resources = oac.itemView.getContext().getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            iKWHzl = java.lang.Math.min(iKWHzl, C55302xhQ.EZpvd(resources) - (iDp2px$default * 2));
        }
        ((AbstractC44117sDz) oac.EZpvd()).EZpvd.setMaxWidth(iKWHzl);
        LinearLayoutCompat linearLayoutCompat = oac.copydefault().AhwBna;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        ViewGroup.LayoutParams layoutParams = linearLayoutCompat.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.matchConstraintMaxWidth = iKWHzl;
        linearLayoutCompat.setLayoutParams(layoutParams2);
        C35888oHk c35888oHk = oac.copydefault().fJNWhG;
        c35888oHk.setMaxWidthPercent(bl_());
        c35888oHk.setMaxWidthDp(iKWHzl / oac.itemView.getContext().getResources().getDisplayMetrics().density);
    }

    public static final boolean AEQbTJ(oAO oao, android.widget.ImageView imageView, oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent, android.view.View view) {
        if (!oao.getFieldNames()) {
            return true;
        }
        oao.copydefault(imageView, oac.getBindingAdapterPosition(), c35254nrp, oKMessageContent);
        return true;
    }

    public final void EZpvd(final AbstractC44117sDz abstractC44117sDz, C35254nrp c35254nrp, C c) {
        java.lang.String strAYXKKw;
        C35184nqY c35184nqYKWHzl = KWHzl(C33129mqd.gEmmrt(c.getExtra()));
        C35246nrh c35246nrhOLrzqt = OLrzqt(C33129mqd.gEmmrt(c.getExtra()));
        android.widget.TextView textView = abstractC44117sDz.OLrzqt;
        if (c35184nqYKWHzl != null && c35184nqYKWHzl.copydefault()) {
            strAYXKKw = C33070mpX.AYXKKw(C44105sDn.PendingIntent.fARcdN);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C44105sDn.PendingIntent.OLrzqt);
        }
        textView.setText(strAYXKKw);
        android.widget.TextView textView2 = abstractC44117sDz.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(copydefault(c, c35184nqYKWHzl, c35246nrhOLrzqt) ? 0 : 8);
        android.view.View view = abstractC44117sDz.copydefault;
        Intrinsics.checkNotNullExpressionValue(view, "");
        android.widget.TextView textView3 = abstractC44117sDz.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        view.setVisibility(textView3.getVisibility() != 0 ? 8 : 0);
        abstractC44117sDz.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.oAK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                oAO.OLrzqt(abstractC44117sDz, view2);
            }
        });
        abstractC44117sDz.EZpvd.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.oAN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view2) {
                return oAO.gEmmrt(abstractC44117sDz, view2);
            }
        });
    }

    public static final void OLrzqt(AbstractC44117sDz abstractC44117sDz, android.view.View view) {
        abstractC44117sDz.getRoot().performClick();
    }

    public static final boolean gEmmrt(AbstractC44117sDz abstractC44117sDz, android.view.View view) {
        return abstractC44117sDz.getRoot().performLongClick();
    }

    public final C35184nqY KWHzl(java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((C35184nqY) this.copydefault.fromJson(C33129mqd.gEmmrt(str), C35184nqY.class));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        return (C35184nqY) objM7377constructorimpl;
    }

    public final C35246nrh OLrzqt(java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((C35246nrh) this.copydefault.fromJson(C33129mqd.gEmmrt(str), C35246nrh.class));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        return (C35246nrh) objM7377constructorimpl;
    }

    public final boolean copydefault(C c, C35184nqY c35184nqY, C35246nrh c35246nrh) {
        if (c instanceof OKCustomMessage) {
            if (c35184nqY != null) {
                return c35184nqY.copydefault();
            }
        } else if ((c instanceof OKTextMessage) && c35246nrh != null) {
            return c35246nrh.EZpvd();
        }
        return false;
    }

    private final void OLrzqt(oGY<AbstractC44111sDt> ogy, final C35254nrp c35254nrp) {
        AbstractC44111sDt abstractC44111sDt = (AbstractC44111sDt) ogy.copydefault();
        if (c35254nrp.OLrzqt().getContent() instanceof OKMediaMessageContent) {
            int iKWHzl = c35254nrp.KWHzl();
            if (iKWHzl == 2) {
                abstractC44111sDt.KWHzl.setVisibility(8);
                abstractC44111sDt.AEQbTJ.setVisibility(8);
                abstractC44111sDt.DbNXlk.setVisibility(0);
                return;
            } else {
                if (iKWHzl == 4 || iKWHzl == 5) {
                    abstractC44111sDt.KWHzl.setVisibility(0);
                    abstractC44111sDt.AEQbTJ.setVisibility(0);
                    abstractC44111sDt.DbNXlk.setVisibility(8);
                    abstractC44111sDt.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.oAR
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            oAO.KWHzl(this.copydefault, c35254nrp, view);
                        }
                    });
                    return;
                }
                abstractC44111sDt.KWHzl.setVisibility(8);
                abstractC44111sDt.AEQbTJ.setVisibility(8);
                abstractC44111sDt.DbNXlk.setVisibility(8);
                return;
            }
        }
        abstractC44111sDt.KWHzl.setVisibility(8);
        abstractC44111sDt.AEQbTJ.setVisibility(8);
        abstractC44111sDt.DbNXlk.setVisibility(8);
    }

    public static final void KWHzl(oAO oao, C35254nrp c35254nrp, android.view.View view) {
        Function1<OKMessage, Unit> function1FARcdN = oao.fARcdN();
        if (function1FARcdN != null) {
            function1FARcdN.invoke(c35254nrp.OLrzqt());
        }
    }

    public final void AEQbTJ(IMUserInfo iMUserInfo, C35893oHp c35893oHp) {
        InterfaceC35179nqT interfaceC35179nqT = (InterfaceC35179nqT) C43251rlk.OLrzqt(InterfaceC35179nqT.class);
        if (interfaceC35179nqT != null) {
            interfaceC35179nqT.KWHzl(c35893oHp, iMUserInfo != null ? iMUserInfo.getOfficialTagInfo() : null, TagSize.DP_14);
        }
    }

    public final boolean gEmmrt() {
        OKConversation oKConversationInvoke;
        Function0<OKConversation> function0FetchVPNInfo = fetchVPNInfo();
        return ((function0FetchVPNInfo == null || (oKConversationInvoke = function0FetchVPNInfo.invoke()) == null) ? null : oKConversationInvoke.getGroupType()) == GroupTagType.RM_VIP_GROUP;
    }

    public final boolean AYXKKw() {
        OKConversation oKConversationInvoke;
        Function0<OKConversation> function0FetchVPNInfo = fetchVPNInfo();
        return (function0FetchVPNInfo == null || (oKConversationInvoke = function0FetchVPNInfo.invoke()) == null || !C44170sFx.AEQbTJ(oKConversationInvoke)) ? false : true;
    }

    public final void copydefault(@NotNull oGY<AbstractC44111sDt> ogy, @NotNull C35254nrp c35254nrp, @NotNull C35893oHp c35893oHp) {
        int i;
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(c35893oHp, "");
        if (AubY() || !getNewProxyInstance()) {
            i = 8;
        } else {
            i = Intrinsics.EZpvd(c35254nrp.AkhnZx(), java.lang.Boolean.TRUE) ? 0 : 4;
        }
        c35893oHp.setVisibility(i);
        if (c35893oHp.getVisibility() == 0) {
            AEQbTJ(ogy, new BaseTextReceiveMessageViewProvider$updateReceiverAvatar$1(this, c35254nrp, c35893oHp, null));
        }
    }

    public final void KWHzl(oGY<AbstractC44111sDt> ogy, C35254nrp c35254nrp, IMUserInfo iMUserInfo, android.widget.TextView textView, android.widget.TextView textView2) {
        boolean z = getNewProxyInstance() && c35254nrp.copydefault() == MessageClusterType.First;
        if (iMUserInfo == null || !z) {
            iMUserInfo = null;
        }
        android.widget.TextView textView3 = ((AbstractC44111sDt) ogy.copydefault()).ejfBZ;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setVisibility((AubY() || iMUserInfo == null) ? 8 : 0);
        if (gEmmrt()) {
            InterfaceC35179nqT interfaceC35179nqT = (InterfaceC35179nqT) C43251rlk.OLrzqt(InterfaceC35179nqT.class);
            if (interfaceC35179nqT != null) {
                interfaceC35179nqT.KWHzl(textView2, iMUserInfo != null ? iMUserInfo.getOfficialTagInfo() : null, 0, AYXKKw());
            }
        } else {
            InterfaceC35179nqT interfaceC35179nqT2 = (InterfaceC35179nqT) C43251rlk.OLrzqt(InterfaceC35179nqT.class);
            if (interfaceC35179nqT2 != null) {
                interfaceC35179nqT2.copydefault(textView2, iMUserInfo != null ? iMUserInfo.getOfficialTagInfo() : null, 8);
            }
        }
        android.widget.TextView textView4 = ((AbstractC44111sDt) ogy.copydefault()).uzCIH;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        android.widget.TextView textView5 = ((AbstractC44111sDt) ogy.copydefault()).uzCIH;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        textView4.setVisibility(textView5.getVisibility() != 0 ? 8 : 0);
        textView.setText(iMUserInfo != null ? iMUserInfo.getUsername() : null);
    }

    public void AEQbTJ(@NotNull android.widget.ImageView imageView, int i, @NotNull C35254nrp c35254nrp, @NotNull C c) {
        OKConversation oKConversationCopydefault;
        OKConversationType conversationType;
        GroupInfo groupInfoOLrzqt;
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(c, "");
        android.content.Context contextOLrzqt = C58196ywi.OLrzqt(imageView.getContext());
        AbstractActivityC33041mov abstractActivityC33041mov = contextOLrzqt instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) contextOLrzqt : null;
        if (abstractActivityC33041mov != null) {
            InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
            sFU sfuEZpvd = interfaceC35180nqU != null ? interfaceC35180nqU.EZpvd() : null;
            java.lang.String targetId = c35254nrp.OLrzqt().getTargetId();
            if (sfuEZpvd != null && (oKConversationCopydefault = sfuEZpvd.copydefault(targetId)) != null && (conversationType = oKConversationCopydefault.getConversationType()) != null) {
                if ((conversationType == OKConversationType.GROUP ? conversationType : null) != null && ((groupInfoOLrzqt = sfuEZpvd.OLrzqt(targetId)) == null || !groupInfoOLrzqt.isJoinedGroup())) {
                    return;
                }
            }
            InterfaceC35179nqT interfaceC35179nqT = (InterfaceC35179nqT) C43251rlk.OLrzqt(InterfaceC35179nqT.class);
            if (interfaceC35179nqT != null) {
                interfaceC35179nqT.copydefault(abstractActivityC33041mov, c35254nrp.OLrzqt(), targetId);
            }
        }
    }

    public void copydefault(@NotNull android.widget.ImageView imageView, int i, @NotNull C35254nrp c35254nrp, @NotNull C c) {
        InterfaceC35179nqT interfaceC35179nqT;
        java.lang.String targetId;
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(c, "");
        android.content.Context contextOLrzqt = C58196ywi.OLrzqt(imageView.getContext());
        GroupInfo groupInfoOLrzqt = null;
        AbstractActivityC33041mov abstractActivityC33041mov = contextOLrzqt instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) contextOLrzqt : null;
        if (abstractActivityC33041mov != null) {
            InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
            sFU sfuEZpvd = interfaceC35180nqU != null ? interfaceC35180nqU.EZpvd() : null;
            OKMessage oKMessageOLrzqt = c35254nrp.OLrzqt();
            if (oKMessageOLrzqt.getConversationType() != OKConversationType.GROUP) {
                oKMessageOLrzqt = null;
            }
            if (oKMessageOLrzqt != null && (targetId = oKMessageOLrzqt.getTargetId()) != null && sfuEZpvd != null) {
                groupInfoOLrzqt = sfuEZpvd.OLrzqt(targetId);
            }
            GroupInfo groupInfo = groupInfoOLrzqt;
            java.lang.String targetId2 = c35254nrp.OLrzqt().getTargetId();
            java.lang.String senderUserId = c35254nrp.OLrzqt().getSenderUserId();
            if (C44157sFk.AEQbTJ(targetId2, senderUserId != null ? senderUserId : "") || (interfaceC35179nqT = (InterfaceC35179nqT) C43251rlk.OLrzqt(InterfaceC35179nqT.class)) == null) {
                return;
            }
            InterfaceC35179nqT.ActionBar.openMentionAndRemoveMemberBottomSheetORMentionUserOnly$default(interfaceC35179nqT, abstractActivityC33041mov, c35254nrp.OLrzqt(), groupInfo, null, 8, null);
        }
    }

    public final void AEQbTJ(final android.widget.ImageView imageView, final oAC<AbstractC44111sDt, AbstractC44117sDz> oac, final C35254nrp c35254nrp, final C c) {
        imageView.setOnClickListener(new ActionBar(imageView, 1000L, this, imageView, oac, c35254nrp, c));
        imageView.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.oAM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return oAO.AEQbTJ(this.copydefault, imageView, oac, c35254nrp, c, view);
            }
        });
    }
}
