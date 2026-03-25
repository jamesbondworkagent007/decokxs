package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBinding;
import com.okinc.im.imui.conversation.message.provider.ReferenceSendMessageViewProvider$longClickForMessageSuccess$1;
import com.okinc.im.imui.conversation.message.provider.ReferenceSendMessageViewProvider$onBindMessageContentView$1;
import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuCopyAction;
import com.okinc.im.menu.MenuActionBase;
import com.okinc.okimcore.model.im.OKFileMessage;
import com.okinc.okimcore.model.im.OKGIFMessage;
import com.okinc.okimcore.model.im.OKHQVoiceMessage;
import com.okinc.okimcore.model.im.OKImageMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKReferenceMessage;
import com.okinc.okimcore.model.im.OKSightMessage;
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

/* JADX INFO: renamed from: o.nCf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33690nCf extends oAA<OKReferenceMessage, nMS> {
    public final int EZpvd = C35342ntX.AEQbTJ;
    public final int AEQbTJ = C35399nuc.Dialog.fBE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public int AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKReferenceMessage> KWHzl() {
        return OKReferenceMessage.class;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.oGY, java.lang.Object, java.util.List] */
    @Override // o.oAA, o.AbstractC35707oAs, o.AbstractC35882oHe
    public /* synthetic */ void AEQbTJ(oGY ogy, C35254nrp c35254nrp, java.util.List list) {
        copydefault((oGY<AbstractC44112sDu>) ogy, c35254nrp, (java.util.List<java.lang.Object>) list);
    }

    @Override // o.oAA, o.AbstractC35707oAs
    public /* synthetic */ void copydefault(oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent) {
        EZpvd((oAC<AbstractC44112sDu, nMS>) oac, c35254nrp, (OKReferenceMessage) oKMessageContent);
    }

    @Override // o.AbstractC35707oAs
    public java.lang.Integer EZpvd() {
        return java.lang.Integer.valueOf(this.EZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
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
        if (originalOKMessageContent instanceof OKSightMessage) {
            return "[" + context.getString(C35399nuc.LoaderManager.shErWi) + "]";
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
        return "[" + context.getString(C35399nuc.LoaderManager.ZAwExL) + "]";
    }

    @Override // o.oAA, o.AbstractC35707oAs
    public void copydefault(@NotNull oGY<AbstractC44112sDu> ogy, @NotNull C35254nrp c35254nrp, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(list, "");
        super.copydefault(ogy, c35254nrp, new java.util.ArrayList());
    }

    public void EZpvd(@NotNull final oAC<AbstractC44112sDu, nMS> oac, @NotNull final C35254nrp c35254nrp, @NotNull final OKReferenceMessage oKReferenceMessage) {
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
        nDB.TaskDescription taskDescriptionAEQbTJ = nDB.TaskDescription.Companion.AEQbTJ((nMS) oac.EZpvd(), oac.copydefault());
        nDB.applyReferenceMaxWidthIfNeeded$default(nDB.copydefault, taskDescriptionAEQbTJ, oKReferenceMessage, zLjUOn(), false, 8, null);
        AEQbTJ(oac, new ReferenceSendMessageViewProvider$onBindMessageContentView$1(c35254nrp, oKReferenceMessage, taskDescriptionAEQbTJ, new nDB.Application(new Function1() { // from class: o.nCl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33690nCf.AEQbTJ(oKReferenceMessage, c35254nrp, (android.view.View) obj);
            }
        }, new Function1() { // from class: o.nCq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C33690nCf.gEmmrt(oac, (android.view.View) obj));
            }
        }, new Function1() { // from class: o.nCr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33690nCf.values(oac, (android.view.View) obj);
            }
        }, new Function1() { // from class: o.nCp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C33690nCf.isConnected(oac, (android.view.View) obj));
            }
        }, new Function1() { // from class: o.nCt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33690nCf.OLrzqt(c35254nrp, oKReferenceMessage, (android.view.View) obj);
            }
        }, new Function1() { // from class: o.nCw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C33690nCf.fetchVPNInfo(oac, (android.view.View) obj));
            }
        }, new Function1() { // from class: o.nCv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33690nCf.AYXKKw(c35254nrp, oKReferenceMessage, (android.view.View) obj);
            }
        }, new Function1() { // from class: o.nCk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C33690nCf.ejfBZ(oac, (android.view.View) obj));
            }
        }, new Function1() { // from class: o.nCj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33690nCf.KWHzl(c35254nrp, oKReferenceMessage, (android.view.View) obj);
            }
        }, new Function1() { // from class: o.nCm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C33690nCf.djBIcL(oac, (android.view.View) obj));
            }
        }, new Function1() { // from class: o.nCn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33690nCf.OLrzqt(oKReferenceMessage, this, c35254nrp, (android.view.View) obj);
            }
        }, new Function1() { // from class: o.nCs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C33690nCf.AkhnZx(oac, (android.view.View) obj));
            }
        }, new Function1() { // from class: o.nCo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33690nCf.DbNXlk(oac, (android.view.View) obj);
            }
        }), this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(OKReferenceMessage oKReferenceMessage, C35254nrp c35254nrp, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        java.lang.String referMsgUid = oKReferenceMessage.getReferMsgUid();
        java.lang.Long fieldNames = referMsgUid != null ? StringsKt__StringNumberConversionsKt.getFieldNames(referMsgUid) : null;
        nDE.copydefault(java.lang.Long.valueOf(c35254nrp.OLrzqt().getSeq()), fieldNames, oKReferenceMessage.getReferMsg());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean gEmmrt(oAC oac, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return ((nMS) oac.EZpvd()).getRoot().performLongClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit values(oAC oac, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ((nMS) oac.EZpvd()).getRoot().performClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isConnected(oAC oac, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return ((nMS) oac.EZpvd()).getRoot().performLongClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(C35254nrp c35254nrp, OKReferenceMessage oKReferenceMessage, android.view.View view) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fetchVPNInfo(oAC oac, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return ((nMS) oac.EZpvd()).getRoot().performLongClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AYXKKw(C35254nrp c35254nrp, OKReferenceMessage oKReferenceMessage, android.view.View view) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ejfBZ(oAC oac, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return ((nMS) oac.EZpvd()).getRoot().performLongClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean djBIcL(oAC oac, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return ((nMS) oac.EZpvd()).getRoot().performLongClick();
    }

    public static final Unit OLrzqt(OKReferenceMessage oKReferenceMessage, C33690nCf c33690nCf, C35254nrp c35254nrp, android.view.View view) {
        Function1<OKMessage, Unit> function1FJNWhG;
        Intrinsics.checkNotNullParameter(view, "");
        OKMessageContent originalOKMessageContent = oKReferenceMessage.getOriginalOKMessageContent();
        if ((originalOKMessageContent instanceof OKHQVoiceMessage ? (OKHQVoiceMessage) originalOKMessageContent : null) != null && (function1FJNWhG = c33690nCf.fJNWhG()) != null) {
            function1FJNWhG.invoke(c35254nrp.OLrzqt());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AkhnZx(oAC oac, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return ((nMS) oac.EZpvd()).getRoot().performLongClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DbNXlk(oAC oac, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ((nMS) oac.EZpvd()).getRoot().performLongClick();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v2, resolved type: B */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.oAA, o.AbstractC35703oAo, o.AbstractC35882oHe
    public void AEQbTJ(@NotNull oGY<AbstractC44112sDu> ogy) {
        Intrinsics.checkNotNullParameter(ogy, "");
        super.AEQbTJ(ogy);
        nDB ndb = nDB.copydefault;
        java.lang.Object tag = ogy.itemView.getTag();
        ndb.copydefault(tag instanceof java.lang.String ? (java.lang.String) tag : null);
        oAC oac = ogy instanceof oAC ? (oAC) ogy : null;
        if (oac != null) {
            nDB.bind$default(ndb, nDB.TaskDescription.Companion.AEQbTJ((nMS) oac.EZpvd(), (AbstractC44112sDu) ((oAC) ogy).copydefault()), nDB.Application.Companion.copydefault(), null, null, null, null, 32, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C35802oEf gEmmrt() {
        return ((InterfaceC35331ntM) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC35331ntM.class)).DarRvM();
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;Landroidx/viewbinding/ViewBinding;)Z */
    @Override // o.AbstractC35707oAs
    public boolean OLrzqt(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKReferenceMessage oKReferenceMessage, @NotNull ViewBinding viewBinding) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKReferenceMessage, "");
        Intrinsics.checkNotNullParameter(viewBinding, "");
        if (c35254nrp.KWHzl() == 0) {
            copydefault(oKReferenceMessage, c35254nrp, viewBinding);
        } else if (c35254nrp.KWHzl() == 1) {
            EZpvd(oKReferenceMessage, c35254nrp, viewBinding);
        }
        return true;
    }

    private final void copydefault(OKReferenceMessage oKReferenceMessage, C35254nrp c35254nrp, ViewBinding viewBinding) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(DbNXlk()), null, null, new ReferenceSendMessageViewProvider$longClickForMessageSuccess$1(oKReferenceMessage, c35254nrp, this, viewBinding, null), 3, null);
    }

    private final void EZpvd(OKReferenceMessage oKReferenceMessage, C35254nrp c35254nrp, ViewBinding viewBinding) {
        LinearLayoutCompat linearLayoutCompat;
        yHO<android.view.View, java.util.List<? extends MenuActionBase>, C35254nrp, Unit> yhoAuCTel;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (oKReferenceMessage.getOriginalOKMessageContent() instanceof OKTextMessage) {
            arrayList.add(new MenuCopyAction());
        }
        if (C33129mqd.KWHzl((java.util.Collection) arrayList)) {
            AbstractC44112sDu abstractC44112sDu = viewBinding instanceof AbstractC44112sDu ? (AbstractC44112sDu) viewBinding : null;
            if (abstractC44112sDu == null || (linearLayoutCompat = abstractC44112sDu.AhwBna) == null || (yhoAuCTel = AuCTel()) == null) {
                return;
            }
            yhoAuCTel.invoke(linearLayoutCompat, arrayList, c35254nrp);
        }
    }
}
