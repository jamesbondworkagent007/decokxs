package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBinding;
import com.okinc.im.imui.conversation.message.provider.ReferenceReceiveMessageViewProvider$longClickForMessageSuccess$1;
import com.okinc.im.imui.conversation.message.provider.ReferenceReceiveMessageViewProvider$onBindMessageContentView$1;
import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuCopyAction;
import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuRecallAction;
import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuReplyAction;
import com.okinc.im.menu.MenuActionBase;
import com.okinc.okimcore.model.im.OKFileMessage;
import com.okinc.okimcore.model.im.OKGIFMessage;
import com.okinc.okimcore.model.im.OKHQVoiceMessage;
import com.okinc.okimcore.model.im.OKImageMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKReferenceMessage;
import com.okinc.okimcore.model.im.OKStickerMessage;
import com.okinc.okimcore.model.im.OKTextMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC37218opg;
import o.C35399nuc;
import o.nDB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nBX extends oAE<OKReferenceMessage, nMO> {
    public final java.lang.Integer KWHzl = java.lang.Integer.valueOf(C35342ntX.AEQbTJ);
    public final int copydefault = C35399nuc.Dialog.gtCCJH;

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
    public java.lang.Class<OKReferenceMessage> KWHzl() {
        return OKReferenceMessage.class;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.oGY, java.lang.Object, java.util.List] */
    @Override // o.oAE, o.AbstractC35707oAs, o.AbstractC35882oHe
    public /* synthetic */ void AEQbTJ(oGY ogy, C35254nrp c35254nrp, java.util.List list) {
        copydefault((oGY<AbstractC44111sDt>) ogy, c35254nrp, (java.util.List<java.lang.Object>) list);
    }

    @Override // o.oAE, o.AbstractC35707oAs
    public /* synthetic */ void copydefault(oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent) {
        AEQbTJ((oAC<AbstractC44111sDt, nMO>) oac, c35254nrp, (OKReferenceMessage) oKMessageContent);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKReferenceMessage oKReferenceMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKReferenceMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        OKMessageContent originalOKMessageContent = oKReferenceMessage.getOriginalOKMessageContent();
        if ((originalOKMessageContent instanceof OKImageMessage) || (originalOKMessageContent instanceof OKGIFMessage)) {
            return "[" + context.getString(C35399nuc.LoaderManager.FdcJU) + "]";
        }
        if (originalOKMessageContent instanceof OKTextMessage) {
            OKMessageContent originalOKMessageContent2 = oKReferenceMessage.getOriginalOKMessageContent();
            Intrinsics.copydefault(originalOKMessageContent2, "");
            java.lang.String aliasedContent = ((OKTextMessage) originalOKMessageContent2).getAliasedContent();
            return aliasedContent == null ? "" : aliasedContent;
        }
        if (originalOKMessageContent instanceof OKStickerMessage) {
            return "[" + context.getString(C35399nuc.LoaderManager.ZGRCNj) + "]";
        }
        if (originalOKMessageContent instanceof OKFileMessage) {
            OKMessageContent originalOKMessageContent3 = oKReferenceMessage.getOriginalOKMessageContent();
            Intrinsics.copydefault(originalOKMessageContent3, "");
            java.lang.String string = context.getString(C35399nuc.LoaderManager.QhsCdEQhsCdE);
            java.lang.String fileName = ((OKFileMessage) originalOKMessageContent3).getFileName();
            return "[" + string + "] " + (fileName != null ? fileName : "");
        }
        return "[" + context.getString(C35399nuc.LoaderManager.shErWi) + "]";
    }

    @Override // o.oAE, o.AbstractC35707oAs
    public void copydefault(@NotNull oGY<AbstractC44111sDt> ogy, @NotNull C35254nrp c35254nrp, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(list, "");
        super.copydefault(ogy, c35254nrp, new java.util.ArrayList());
    }

    public void AEQbTJ(@NotNull final oAC<AbstractC44111sDt, nMO> oac, @NotNull final C35254nrp c35254nrp, @NotNull final OKReferenceMessage oKReferenceMessage) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKReferenceMessage, "");
        super.copydefault(oac, c35254nrp, oKReferenceMessage);
        android.view.View view = oac.itemView;
        java.lang.String clientMessageId = c35254nrp.OLrzqt().getClientMessageId();
        if (clientMessageId == null) {
            clientMessageId = java.lang.String.valueOf(c35254nrp.OLrzqt().getSeq());
        }
        view.setTag(clientMessageId);
        nDB.TaskDescription taskDescriptionKWHzl = nDB.TaskDescription.Companion.KWHzl((nMO) oac.EZpvd(), oac.copydefault());
        nDB.copydefault.AEQbTJ(taskDescriptionKWHzl, oKReferenceMessage, zLjUOn(), c35254nrp.AEQbTJ() == 8);
        AEQbTJ(oac, new ReferenceReceiveMessageViewProvider$onBindMessageContentView$1(c35254nrp, oKReferenceMessage, taskDescriptionKWHzl, new nDB.Application(new Function1() { // from class: o.nBU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return nBX.AEQbTJ(oKReferenceMessage, c35254nrp, (android.view.View) obj);
            }
        }, new Function1() { // from class: o.nCc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(nBX.AhwBna(oac, (android.view.View) obj));
            }
        }, new Function1() { // from class: o.nCd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return nBX.DbNXlk(oac, (android.view.View) obj);
            }
        }, new Function1() { // from class: o.nCe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(nBX.values(oac, (android.view.View) obj));
            }
        }, new Function1() { // from class: o.nCi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return nBX.copydefault(c35254nrp, oKReferenceMessage, (android.view.View) obj);
            }
        }, new Function1() { // from class: o.nCh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(nBX.AkhnZx(oac, (android.view.View) obj));
            }
        }, new Function1() { // from class: o.nCg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return nBX.valueOf(c35254nrp, oKReferenceMessage, (android.view.View) obj);
            }
        }, new Function1() { // from class: o.nBY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(nBX.fIwbmz(oac, (android.view.View) obj));
            }
        }, new Function1() { // from class: o.nBW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return nBX.KWHzl(c35254nrp, oKReferenceMessage, (android.view.View) obj);
            }
        }, new Function1() { // from class: o.nBZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(nBX.AYXKKw(oac, (android.view.View) obj));
            }
        }, new Function1() { // from class: o.nBV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return nBX.EZpvd(oKReferenceMessage, this, c35254nrp, (android.view.View) obj);
            }
        }, new Function1() { // from class: o.nCa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(nBX.isConnected(oac, (android.view.View) obj));
            }
        }, new Function1() { // from class: o.nCb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return nBX.fetchVPNInfo(oac, (android.view.View) obj);
            }
        }), this, null));
    }

    public static final Unit AEQbTJ(OKReferenceMessage oKReferenceMessage, C35254nrp c35254nrp, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        java.lang.String referMsgUid = oKReferenceMessage.getReferMsgUid();
        java.lang.Long fieldNames = referMsgUid != null ? StringsKt__StringNumberConversionsKt.getFieldNames(referMsgUid) : null;
        nDE.copydefault(java.lang.Long.valueOf(c35254nrp.OLrzqt().getSeq()), fieldNames, oKReferenceMessage.getReferMsg());
        return Unit.INSTANCE;
    }

    public static final boolean AhwBna(oAC oac, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return ((nMO) oac.EZpvd()).getRoot().performLongClick();
    }

    public static final Unit DbNXlk(oAC oac, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ((nMO) oac.EZpvd()).getRoot().performClick();
        return Unit.INSTANCE;
    }

    public static final boolean values(oAC oac, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return ((nMO) oac.EZpvd()).getRoot().performLongClick();
    }

    public static final Unit copydefault(C35254nrp c35254nrp, OKReferenceMessage oKReferenceMessage, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        OKMessage oKMessageEZpvd = nDB.copydefault.EZpvd(c35254nrp.OLrzqt(), oKReferenceMessage);
        if (oKMessageEZpvd != null) {
            ActivityC37218opg.Application application = ActivityC37218opg.Companion;
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            view.getContext().startActivity(application.EZpvd(context, oKMessageEZpvd), application.OLrzqt(view, oKMessageEZpvd));
        }
        return Unit.INSTANCE;
    }

    public static final boolean AkhnZx(oAC oac, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return ((nMO) oac.EZpvd()).getRoot().performLongClick();
    }

    public static final Unit valueOf(C35254nrp c35254nrp, OKReferenceMessage oKReferenceMessage, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        OKMessage oKMessageEZpvd = nDB.copydefault.EZpvd(c35254nrp.OLrzqt(), oKReferenceMessage);
        if (oKMessageEZpvd != null) {
            ActivityC37218opg.Application application = ActivityC37218opg.Companion;
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            view.getContext().startActivity(application.EZpvd(context, oKMessageEZpvd), application.OLrzqt(view, oKMessageEZpvd));
        }
        return Unit.INSTANCE;
    }

    public static final boolean fIwbmz(oAC oac, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return ((nMO) oac.EZpvd()).getRoot().performLongClick();
    }

    public static final Unit KWHzl(C35254nrp c35254nrp, OKReferenceMessage oKReferenceMessage, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (OKMessage.SentStatus.SENDING == c35254nrp.OLrzqt().getSentStatus()) {
            return Unit.INSTANCE;
        }
        OKMessage oKMessageEZpvd = nDB.copydefault.EZpvd(c35254nrp.OLrzqt(), oKReferenceMessage);
        if (oKMessageEZpvd != null) {
            ActivityC37218opg.Application application = ActivityC37218opg.Companion;
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            view.getContext().startActivity(application.EZpvd(context, oKMessageEZpvd), application.OLrzqt(view, oKMessageEZpvd));
        }
        return Unit.INSTANCE;
    }

    public static final boolean AYXKKw(oAC oac, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return ((nMO) oac.EZpvd()).getRoot().performLongClick();
    }

    public static final Unit EZpvd(OKReferenceMessage oKReferenceMessage, nBX nbx, C35254nrp c35254nrp, android.view.View view) {
        Function1<OKMessage, Unit> function1FJNWhG;
        Intrinsics.checkNotNullParameter(view, "");
        OKMessageContent originalOKMessageContent = oKReferenceMessage.getOriginalOKMessageContent();
        if ((originalOKMessageContent instanceof OKHQVoiceMessage ? (OKHQVoiceMessage) originalOKMessageContent : null) != null && (function1FJNWhG = nbx.fJNWhG()) != null) {
            function1FJNWhG.invoke(c35254nrp.OLrzqt());
        }
        return Unit.INSTANCE;
    }

    public static final boolean isConnected(oAC oac, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return ((nMO) oac.EZpvd()).getRoot().performLongClick();
    }

    public static final Unit fetchVPNInfo(oAC oac, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ((nMO) oac.EZpvd()).getRoot().performLongClick();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v2, resolved type: B */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.oAE, o.AbstractC35703oAo, o.AbstractC35882oHe
    public void AEQbTJ(@NotNull oGY<AbstractC44111sDt> ogy) {
        Intrinsics.checkNotNullParameter(ogy, "");
        super.AEQbTJ(ogy);
        nDB ndb = nDB.copydefault;
        java.lang.Object tag = ogy.itemView.getTag();
        ndb.copydefault(tag instanceof java.lang.String ? (java.lang.String) tag : null);
        oAC oac = ogy instanceof oAC ? (oAC) ogy : null;
        if (oac != null) {
            nDB.bind$default(ndb, nDB.TaskDescription.Companion.KWHzl((nMO) oac.EZpvd(), (AbstractC44111sDt) ((oAC) ogy).copydefault()), nDB.Application.Companion.copydefault(), null, null, null, null, 32, null);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;Landroidx/viewbinding/ViewBinding;)Z */
    @Override // o.AbstractC35707oAs
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKReferenceMessage oKReferenceMessage, @NotNull ViewBinding viewBinding) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKReferenceMessage, "");
        Intrinsics.checkNotNullParameter(viewBinding, "");
        if (c35254nrp.KWHzl() == 0) {
            EZpvd(oKReferenceMessage, c35254nrp, viewBinding);
        } else if (c35254nrp.KWHzl() == 1) {
            KWHzl(oKReferenceMessage, c35254nrp, viewBinding);
        }
        return true;
    }

    public final void EZpvd(OKReferenceMessage oKReferenceMessage, C35254nrp c35254nrp, ViewBinding viewBinding) {
        LinearLayoutCompat linearLayoutCompat;
        yHO<android.view.View, java.util.List<? extends MenuActionBase>, C35254nrp, Unit> yhoAuCTel;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (oKReferenceMessage.getOriginalOKMessageContent() instanceof OKTextMessage) {
            arrayList.add(new MenuCopyAction());
        }
        if (C44157sFk.EZpvd(c35254nrp.OLrzqt())) {
            arrayList.add(new MenuReplyAction());
        }
        if (copydefault(c35254nrp.OLrzqt())) {
            arrayList.add(new MenuRecallAction());
        }
        if (oKReferenceMessage.getOriginalOKMessageContent() instanceof OKStickerMessage) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(DbNXlk()), sDN.copydefault.copydefault(), null, new ReferenceReceiveMessageViewProvider$longClickForMessageSuccess$1(oKReferenceMessage, arrayList, viewBinding, this, c35254nrp, null), 2, null);
            return;
        }
        if (C33129mqd.KWHzl((java.util.Collection) arrayList)) {
            AbstractC44111sDt abstractC44111sDt = viewBinding instanceof AbstractC44111sDt ? (AbstractC44111sDt) viewBinding : null;
            if (abstractC44111sDt == null || (linearLayoutCompat = abstractC44111sDt.AhwBna) == null || (yhoAuCTel = AuCTel()) == null) {
                return;
            }
            yhoAuCTel.invoke(linearLayoutCompat, arrayList, c35254nrp);
        }
    }

    public final void KWHzl(OKReferenceMessage oKReferenceMessage, C35254nrp c35254nrp, ViewBinding viewBinding) {
        LinearLayoutCompat linearLayoutCompat;
        yHO<android.view.View, java.util.List<? extends MenuActionBase>, C35254nrp, Unit> yhoAuCTel;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (oKReferenceMessage.getOriginalOKMessageContent() instanceof OKTextMessage) {
            arrayList.add(new MenuCopyAction());
        }
        if (C33129mqd.KWHzl((java.util.Collection) arrayList)) {
            AbstractC44111sDt abstractC44111sDt = viewBinding instanceof AbstractC44111sDt ? (AbstractC44111sDt) viewBinding : null;
            if (abstractC44111sDt == null || (linearLayoutCompat = abstractC44111sDt.AhwBna) == null || (yhoAuCTel = AuCTel()) == null) {
                return;
            }
            yhoAuCTel.invoke(linearLayoutCompat, arrayList, c35254nrp);
        }
    }
}
