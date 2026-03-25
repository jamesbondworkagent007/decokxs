package o;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.im.imui.glide.model.IMImageModel;
import com.okinc.im.usecase.message.GetMediaMessageHistoryListUseCase$invoke$1;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKGIFMessage;
import com.okinc.okimcore.model.im.OKGetMessageDirection;
import com.okinc.okimcore.model.im.OKImageMessage;
import com.okinc.okimcore.model.im.OKMediaMessageContent;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKReferenceMessage;
import com.okinc.okimcore.model.im.OKShareMessage;
import com.okinc.okimcore.model.im.OKSightMessage;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oEh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35804oEh {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final InterfaceC44375sNm AEQbTJ;

    @yCM
    public C35804oEh(@NotNull InterfaceC44375sNm interfaceC44375sNm) {
        Intrinsics.checkNotNullParameter(interfaceC44375sNm, "");
        this.AEQbTJ = interfaceC44375sNm;
    }

    /* JADX INFO: renamed from: o.oEh$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oEh.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull OKMessage oKMessage, int i, @NotNull OKGetMessageDirection oKGetMessageDirection, @NotNull Continuation<? super java.util.List<C37233opv>> continuation) throws java.lang.Throwable {
        GetMediaMessageHistoryListUseCase$invoke$1 getMediaMessageHistoryListUseCase$invoke$1;
        C35804oEh c35804oEh;
        if (continuation instanceof GetMediaMessageHistoryListUseCase$invoke$1) {
            getMediaMessageHistoryListUseCase$invoke$1 = (GetMediaMessageHistoryListUseCase$invoke$1) continuation;
            int i2 = getMediaMessageHistoryListUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getMediaMessageHistoryListUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                getMediaMessageHistoryListUseCase$invoke$1 = new GetMediaMessageHistoryListUseCase$invoke$1(this, continuation);
            }
        }
        GetMediaMessageHistoryListUseCase$invoke$1 getMediaMessageHistoryListUseCase$invoke$12 = getMediaMessageHistoryListUseCase$invoke$1;
        java.lang.Object objEZpvd = getMediaMessageHistoryListUseCase$invoke$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = getMediaMessageHistoryListUseCase$invoke$12.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                OKConversation oKConversationAEQbTJ = OKConversation.Companion.AEQbTJ(oKMessage.getConversationType(), oKMessage.getTargetId(), "");
                pUU.EZpvd("GetMediaMessageHistoryListUseCase", "Anchor message ID: " + oKMessage.getSeq());
                InterfaceC44375sNm interfaceC44375sNm = this.AEQbTJ;
                getMediaMessageHistoryListUseCase$invoke$12.L$0 = this;
                getMediaMessageHistoryListUseCase$invoke$12.L$1 = oKGetMessageDirection;
                getMediaMessageHistoryListUseCase$invoke$12.label = 1;
                objEZpvd = interfaceC44375sNm.EZpvd(oKConversationAEQbTJ, oKMessage, i, oKGetMessageDirection, getMediaMessageHistoryListUseCase$invoke$12);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                c35804oEh = this;
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oKGetMessageDirection = (OKGetMessageDirection) getMediaMessageHistoryListUseCase$invoke$12.L$1;
                c35804oEh = (C35804oEh) getMediaMessageHistoryListUseCase$invoke$12.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
            }
            java.util.List<OKMessage> listGkJEwt = (java.util.List) objEZpvd;
            if (oKGetMessageDirection == OKGetMessageDirection.FRONT) {
                listGkJEwt = CollectionsKt___CollectionsKt.gkJEwt(listGkJEwt);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listGkJEwt, 10));
            java.util.Iterator<T> it = listGkJEwt.iterator();
            while (it.hasNext()) {
                arrayList.add(C56443yFo.KWHzl(((OKMessage) it.next()).getSeq()));
            }
            pUU.EZpvd("GetMediaMessageHistoryListUseCase", "Result: " + arrayList);
            return c35804oEh.OLrzqt(listGkJEwt);
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("GetMediaMessageHistoryListUseCase", "Error fetching media messages", th);
            return yDY.AhwBna();
        }
    }

    public final java.util.List<C37233opv> copydefault(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return OLrzqt(C56402yEa.EZpvd(oKMessage));
    }

    public final OKMediaMessageContent AEQbTJ(OKMessage oKMessage) {
        OKMessageContent content = oKMessage.getContent();
        OKMediaMessageContent oKMediaMessageContent = content instanceof OKMediaMessageContent ? (OKMediaMessageContent) content : null;
        if (oKMediaMessageContent == null || oKMediaMessageContent.isDestruct()) {
            return null;
        }
        if ((oKMediaMessageContent instanceof OKImageMessage) || (oKMediaMessageContent instanceof OKGIFMessage) || (oKMediaMessageContent instanceof OKSightMessage)) {
            return oKMediaMessageContent;
        }
        if (oKMediaMessageContent instanceof OKShareMessage) {
            return ((OKShareMessage) oKMediaMessageContent).getImage();
        }
        if (!(oKMediaMessageContent instanceof OKReferenceMessage)) {
            return null;
        }
        OKMessageContent originalOKMessageContent = ((OKReferenceMessage) oKMediaMessageContent).getOriginalOKMessageContent();
        if (originalOKMessageContent instanceof OKMediaMessageContent) {
            return (OKMediaMessageContent) originalOKMessageContent;
        }
        return null;
    }

    public final IMImageModel OLrzqt(OKMediaMessageContent oKMediaMessageContent) {
        OKImageMessage image;
        if (oKMediaMessageContent instanceof OKImageMessage) {
            OKImageMessage oKImageMessage = (OKImageMessage) oKMediaMessageContent;
            return new IMImageModel(oKImageMessage.getBase64(), oKImageMessage.getThumbUri(), oKMediaMessageContent.getLocalUri(), oKMediaMessageContent.getRemoteUri(), null, null, null, false, PsExtractor.VIDEO_STREAM_MASK, null);
        }
        if (oKMediaMessageContent instanceof OKSightMessage) {
            OKSightMessage oKSightMessage = (OKSightMessage) oKMediaMessageContent;
            return new IMImageModel(oKSightMessage.getBase64(), oKSightMessage.getThumbUri(), oKMediaMessageContent.getLocalUri(), oKSightMessage.getRemoteUri(), null, null, null, false, PsExtractor.VIDEO_STREAM_MASK, null);
        }
        if (oKMediaMessageContent instanceof OKGIFMessage) {
            return new IMImageModel(null, null, oKMediaMessageContent.getLocalUri(), ((OKGIFMessage) oKMediaMessageContent).getRemoteUri(), null, null, null, false, 243, null);
        }
        if (!(oKMediaMessageContent instanceof OKShareMessage) || (image = ((OKShareMessage) oKMediaMessageContent).getImage()) == null) {
            return null;
        }
        return new IMImageModel(image.getBase64(), image.getThumbUri(), image.getLocalUri(), image.getRemoteUri(), null, null, null, false, PsExtractor.VIDEO_STREAM_MASK, null);
    }

    public final java.util.List<C37233opv> OLrzqt(java.util.List<OKMessage> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (OKMessage oKMessage : list) {
            OKMediaMessageContent oKMediaMessageContentAEQbTJ = AEQbTJ(oKMessage);
            C37233opv c37233opv = null;
            IMImageModel iMImageModelOLrzqt = oKMediaMessageContentAEQbTJ != null ? OLrzqt(oKMediaMessageContentAEQbTJ) : null;
            if (oKMediaMessageContentAEQbTJ != null && iMImageModelOLrzqt != null) {
                c37233opv = new C37233opv(oKMessage, oKMediaMessageContentAEQbTJ, iMImageModelOLrzqt);
            }
            if (c37233opv != null) {
                arrayList.add(c37233opv);
            }
        }
        return arrayList;
    }
}
