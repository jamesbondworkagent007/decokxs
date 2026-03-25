package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import com.bumptech.glide.Glide;
import com.okinc.im.bean.IMUserInfo;
import com.okinc.im.bean.tag.TagSize;
import com.okinc.im.message.MessageClusterType;
import com.okinc.im.message.provider.direction.BaseReceiveMessageViewProvider$onBindViewHolder$1;
import com.okinc.im.message.provider.direction.BaseReceiveMessageViewProvider$onFullBind$1$1;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMediaMessageContent;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
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
public abstract class oAE<C extends OKMessageContent, CVB extends ViewDataBinding> extends AbstractC35707oAs<C, AbstractC44111sDt, CVB> {
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
        Intrinsics.checkNotNullParameter(ogy, "");
        super.AEQbTJ(ogy);
        ((AbstractC44111sDt) ogy.copydefault()).uzCIH.setText((java.lang.CharSequence) null);
        ((AbstractC44111sDt) ogy.copydefault()).ejfBZ.setText((java.lang.CharSequence) null);
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
        try {
            Result.Application application = Result.Companion;
            Glide.KWHzl(ogy.itemView).AEQbTJ(((AbstractC44111sDt) ogy.copydefault()).OLrzqt);
            ((AbstractC44111sDt) ogy.copydefault()).OLrzqt.setImageResource(0);
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    @Override // o.AbstractC35703oAo
    public java.util.Set<OKMessage.MessageDirection> be_() {
        return yED.AEQbTJ(OKMessage.MessageDirection.RECEIVE);
    }

    @Override // o.AbstractC35707oAs
    public final android.view.ViewGroup copydefault(@NotNull oAC<AbstractC44111sDt, CVB> oac) {
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
            AEQbTJ(ogy, new BaseReceiveMessageViewProvider$onBindViewHolder$1(this, c35254nrp, ogy, null));
            return;
        }
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

    public final void KWHzl(oGY<AbstractC44111sDt> ogy, C35254nrp c35254nrp) {
        if (c35254nrp.OLrzqt().getConversationType() == OKConversationType.PRIVATE) {
            KWHzl(false);
        }
        AbstractC44111sDt abstractC44111sDt = (AbstractC44111sDt) ogy.copydefault();
        if (AubY()) {
            abstractC44111sDt.OLrzqt.setVisibility(8);
        } else {
            abstractC44111sDt.OLrzqt.setVisibility(c35254nrp.AEQbTJ());
        }
        int adapterPosition = ogy.getAdapterPosition();
        android.widget.TextView textView = abstractC44111sDt.fARcdN;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        AEQbTJ(adapterPosition, c35254nrp, textView);
        if (c35254nrp.copydefault() == MessageClusterType.First || c35254nrp.AEQbTJ() == 0) {
            AEQbTJ(ogy, new BaseReceiveMessageViewProvider$onFullBind$1$1(this, c35254nrp, ogy, abstractC44111sDt, null));
        }
        AEQbTJ(ogy, c35254nrp);
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
    public final void EZpvd(oGY<AbstractC44111sDt> ogy) {
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

    @Override // o.AbstractC35707oAs
    public void copydefault(@NotNull final oAC<AbstractC44111sDt, CVB> oac, @NotNull final C35254nrp c35254nrp, @NotNull final C c) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(c, "");
        super.copydefault(oac, c35254nrp, c);
        final C35893oHp c35893oHp = oac.copydefault().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
        c35893oHp.setOnClickListener(new Application(c35893oHp, 1000L, this, c35893oHp, oac, c35254nrp, c));
        c35893oHp.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.oAB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return oAE.EZpvd(this.KWHzl, c35893oHp, oac, c35254nrp, c, view);
            }
        });
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
        C35888oHk c35888oHk = oac.copydefault().fJNWhG;
        c35888oHk.setMaxWidthPercent(bl_());
        c35888oHk.setMaxWidthDp(maxBubbleWidth$default / oac.itemView.getContext().getResources().getDisplayMetrics().density);
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C35893oHp AEQbTJ;
        public final /* synthetic */ oAE AYXKKw;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ OKMessageContent KWHzl;
        public final /* synthetic */ C35254nrp OLrzqt;
        public final /* synthetic */ oAC copydefault;
        public final /* synthetic */ long gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, oAE oae, C35893oHp c35893oHp, oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent) {
            this.EZpvd = view;
            this.gEmmrt = j;
            this.AYXKKw = oae;
            this.AEQbTJ = c35893oHp;
            this.copydefault = oac;
            this.OLrzqt = c35254nrp;
            this.KWHzl = oKMessageContent;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v12, resolved type: o.oAE */
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
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.gEmmrt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
                if (interfaceC35180nqU != null && interfaceC35180nqU.djBIcL() && this.AYXKKw.getFieldNames()) {
                    this.AYXKKw.KWHzl(this.AEQbTJ, this.copydefault.getBindingAdapterPosition(), this.OLrzqt, this.KWHzl);
                }
            }
        }
    }

    public static final boolean EZpvd(oAE oae, C35893oHp c35893oHp, oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent, android.view.View view) {
        if (oae.getFieldNames()) {
            oae.AEQbTJ(c35893oHp, oac.getBindingAdapterPosition(), c35254nrp, oKMessageContent);
        }
        if (!C34703nhO.AhwBna(c35893oHp.getContext())) {
            return true;
        }
        C33570myu.EZpvd(c35893oHp.getContext(), c35254nrp.toString());
        return true;
    }

    public final void AEQbTJ(oGY<AbstractC44111sDt> ogy, final C35254nrp c35254nrp) {
        AbstractC44111sDt abstractC44111sDt = (AbstractC44111sDt) ogy.copydefault();
        if (c35254nrp.OLrzqt().getContent() instanceof OKMediaMessageContent) {
            int iKWHzl = c35254nrp.KWHzl();
            if (iKWHzl == 2) {
                android.widget.LinearLayout linearLayout = abstractC44111sDt.KWHzl;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                linearLayout.setVisibility(8);
                android.widget.ImageView imageView = abstractC44111sDt.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(8);
                android.widget.TextView textView = abstractC44111sDt.fIwbmz;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(8);
                android.widget.ProgressBar progressBar = abstractC44111sDt.DbNXlk;
                Intrinsics.checkNotNullExpressionValue(progressBar, "");
                progressBar.setVisibility(0);
                return;
            }
            if (iKWHzl == 4 || iKWHzl == 5 || iKWHzl == 6) {
                if (c35254nrp.KWHzl() == 6) {
                    android.widget.LinearLayout linearLayout2 = abstractC44111sDt.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                    linearLayout2.setVisibility(0);
                    android.widget.ImageView imageView2 = abstractC44111sDt.AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(imageView2, "");
                    imageView2.setVisibility(0);
                    android.widget.TextView textView2 = abstractC44111sDt.fIwbmz;
                    Intrinsics.checkNotNullExpressionValue(textView2, "");
                    textView2.setVisibility(0);
                } else {
                    android.widget.LinearLayout linearLayout3 = abstractC44111sDt.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
                    linearLayout3.setVisibility(0);
                    android.widget.ImageView imageView3 = abstractC44111sDt.AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(imageView3, "");
                    imageView3.setVisibility(0);
                    android.widget.TextView textView3 = abstractC44111sDt.fIwbmz;
                    Intrinsics.checkNotNullExpressionValue(textView3, "");
                    textView3.setVisibility(8);
                }
                android.widget.LinearLayout linearLayout4 = abstractC44111sDt.KWHzl;
                Intrinsics.checkNotNullExpressionValue(linearLayout4, "");
                linearLayout4.setVisibility(0);
                android.widget.ImageView imageView4 = abstractC44111sDt.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(imageView4, "");
                imageView4.setVisibility(0);
                android.widget.ProgressBar progressBar2 = abstractC44111sDt.DbNXlk;
                Intrinsics.checkNotNullExpressionValue(progressBar2, "");
                progressBar2.setVisibility(8);
                abstractC44111sDt.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.oAD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        oAE.KWHzl(this.copydefault, c35254nrp, view);
                    }
                });
                return;
            }
            android.widget.LinearLayout linearLayout5 = abstractC44111sDt.KWHzl;
            Intrinsics.checkNotNullExpressionValue(linearLayout5, "");
            linearLayout5.setVisibility(8);
            android.widget.ImageView imageView5 = abstractC44111sDt.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView5, "");
            imageView5.setVisibility(8);
            android.widget.TextView textView4 = abstractC44111sDt.fIwbmz;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            textView4.setVisibility(8);
            android.widget.ProgressBar progressBar3 = abstractC44111sDt.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(progressBar3, "");
            progressBar3.setVisibility(8);
            return;
        }
        android.widget.LinearLayout linearLayout6 = abstractC44111sDt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout6, "");
        linearLayout6.setVisibility(8);
        android.widget.ImageView imageView6 = abstractC44111sDt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView6, "");
        imageView6.setVisibility(8);
        android.widget.TextView textView5 = abstractC44111sDt.fIwbmz;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        textView5.setVisibility(8);
        android.widget.ProgressBar progressBar4 = abstractC44111sDt.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(progressBar4, "");
        progressBar4.setVisibility(8);
    }

    public static final void KWHzl(oAE oae, C35254nrp c35254nrp, android.view.View view) {
        Function1<OKMessage, Unit> function1FARcdN = oae.fARcdN();
        if (function1FARcdN != null) {
            function1FARcdN.invoke(c35254nrp.OLrzqt());
        }
    }

    public final void KWHzl(C35893oHp c35893oHp, IMUserInfo iMUserInfo) {
        InterfaceC35179nqT interfaceC35179nqT = (InterfaceC35179nqT) C43251rlk.OLrzqt(InterfaceC35179nqT.class);
        if (interfaceC35179nqT != null) {
            interfaceC35179nqT.KWHzl(c35893oHp, iMUserInfo != null ? iMUserInfo.getOfficialTagInfo() : null, TagSize.DP_14);
        }
    }

    public final boolean wlaJM() {
        OKConversation oKConversationInvoke;
        Function0<OKConversation> function0FetchVPNInfo = fetchVPNInfo();
        return ((function0FetchVPNInfo == null || (oKConversationInvoke = function0FetchVPNInfo.invoke()) == null) ? null : oKConversationInvoke.getGroupType()) == GroupTagType.RM_VIP_GROUP;
    }

    public final boolean zsXlph() {
        OKConversation oKConversationInvoke;
        Function0<OKConversation> function0FetchVPNInfo = fetchVPNInfo();
        return (function0FetchVPNInfo == null || (oKConversationInvoke = function0FetchVPNInfo.invoke()) == null || !C44170sFx.AEQbTJ(oKConversationInvoke)) ? false : true;
    }

    public final void AEQbTJ(C35893oHp c35893oHp, C35254nrp c35254nrp, IMUserInfo iMUserInfo) {
        boolean z = c35254nrp.AEQbTJ() == 0;
        if (z) {
            Unit unit = null;
            if (iMUserInfo == null || !z) {
                iMUserInfo = null;
            }
            try {
                Result.Application application = Result.Companion;
                if (wlaJM()) {
                    InterfaceC35179nqT interfaceC35179nqT = (InterfaceC35179nqT) C43251rlk.OLrzqt(InterfaceC35179nqT.class);
                    if (interfaceC35179nqT != null) {
                        interfaceC35179nqT.AEQbTJ(c35893oHp, iMUserInfo);
                        unit = Unit.INSTANCE;
                    }
                } else {
                    InterfaceC35179nqT interfaceC35179nqT2 = (InterfaceC35179nqT) C43251rlk.OLrzqt(InterfaceC35179nqT.class);
                    if (interfaceC35179nqT2 != null) {
                        interfaceC35179nqT2.KWHzl(c35893oHp, iMUserInfo);
                        unit = Unit.INSTANCE;
                    }
                }
                Result.m7377constructorimpl(unit);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
    }

    public final void KWHzl(oGY<AbstractC44111sDt> ogy, IMUserInfo iMUserInfo, C35254nrp c35254nrp, android.widget.TextView textView, android.widget.TextView textView2) {
        boolean z = getNewProxyInstance() && c35254nrp.copydefault() == MessageClusterType.First;
        if (iMUserInfo == null || !z) {
            iMUserInfo = null;
        }
        android.widget.TextView textView3 = ((AbstractC44111sDt) ogy.copydefault()).ejfBZ;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setVisibility((AubY() || iMUserInfo == null) ? 8 : 0);
        if (wlaJM()) {
            InterfaceC35179nqT interfaceC35179nqT = (InterfaceC35179nqT) C43251rlk.OLrzqt(InterfaceC35179nqT.class);
            if (interfaceC35179nqT != null) {
                interfaceC35179nqT.KWHzl(textView2, iMUserInfo != null ? iMUserInfo.getOfficialTagInfo() : null, 0, zsXlph());
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

    public void KWHzl(@NotNull android.widget.ImageView imageView, int i, @NotNull C35254nrp c35254nrp, @NotNull C c) {
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

    public void AEQbTJ(@NotNull android.widget.ImageView imageView, int i, @NotNull C35254nrp c35254nrp, @NotNull C c) {
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
}
