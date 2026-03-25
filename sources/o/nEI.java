package o;

import androidx.recyclerview.widget.DiffUtil;
import com.okinc.okimcore.model.biz.relationlocal.PhoneRelation;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKCustomMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKStreamPlaceHolderMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class nEI extends DiffUtil.ItemCallback<java.lang.Object> {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public boolean areItemsTheSame(@NotNull java.lang.Object obj, @NotNull java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        if ((!(obj instanceof nGP) || !(obj2 instanceof nGP)) && (!(obj instanceof nGN) || !(obj2 instanceof nGN))) {
            if ((obj instanceof nGM) && (obj2 instanceof nGM)) {
                return Intrinsics.EZpvd((java.lang.Object) ((nGM) obj).AYXKKw(), (java.lang.Object) ((nGM) obj2).AYXKKw());
            }
            if ((obj instanceof nGF) && (obj2 instanceof nGF)) {
                return Intrinsics.EZpvd((java.lang.Object) ((nGF) obj).AhwBna(), (java.lang.Object) ((nGF) obj2).AhwBna());
            }
            if ((obj instanceof nGE) && (obj2 instanceof nGE)) {
                return Intrinsics.EZpvd((java.lang.Object) ((nGE) obj).AEQbTJ().getTargetId(), (java.lang.Object) ((nGE) obj2).AEQbTJ().getTargetId());
            }
            if ((!(obj instanceof nGK) || !(obj2 instanceof nGK)) && ((!(obj instanceof nGL) || !(obj2 instanceof nGL)) && ((!(obj instanceof nGJ) || !(obj2 instanceof nGJ)) && ((!(obj instanceof nGH) || !(obj2 instanceof nGH)) && (!(obj instanceof nGI) || !(obj2 instanceof nGI)))))) {
                if ((obj instanceof C37248oqJ) && (obj2 instanceof C37248oqJ)) {
                    return Intrinsics.EZpvd((java.lang.Object) ((C37248oqJ) obj).OLrzqt().getContactsId(), (java.lang.Object) ((C37248oqJ) obj2).OLrzqt().getContactsId());
                }
                if ((obj instanceof C37246oqH) && (obj2 instanceof C37246oqH)) {
                    return Intrinsics.EZpvd((java.lang.Object) ((PhoneRelation) CollectionsKt___CollectionsKt.AuCTelauCTel(((C37246oqH) obj).OLrzqt())).getRawNumber(), (java.lang.Object) ((PhoneRelation) CollectionsKt___CollectionsKt.AuCTelauCTel(((C37246oqH) obj2).OLrzqt())).getRawNumber());
                }
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public boolean areContentsTheSame(@NotNull java.lang.Object obj, @NotNull java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        if ((obj instanceof nGN) && (obj2 instanceof nGN)) {
            return true;
        }
        if ((obj instanceof nGF) && (obj2 instanceof nGF)) {
            nGF ngf = (nGF) obj;
            nGF ngf2 = (nGF) obj2;
            return Intrinsics.EZpvd((java.lang.Object) ngf.AhwBna(), (java.lang.Object) ngf2.AhwBna()) && ngf.valueOf() == ngf2.valueOf() && ngf.AEQbTJ().isTop() == ngf2.AEQbTJ().isTop() && ngf.AEQbTJ().getUnreadMessageCount() == ngf2.AEQbTJ().getUnreadMessageCount() && Intrinsics.EZpvd((java.lang.Object) ngf.AEQbTJ().getExtra(), (java.lang.Object) ngf.AEQbTJ().getExtra());
        }
        if ((obj instanceof nGM) && (obj2 instanceof nGM)) {
            nGM ngm = (nGM) obj;
            nGM ngm2 = (nGM) obj2;
            return Intrinsics.EZpvd((java.lang.Object) ngm.AYXKKw(), (java.lang.Object) ngm2.AYXKKw()) && ngm.AhwBna() == ngm2.AhwBna() && ngm.AEQbTJ().isTop() == ngm2.AEQbTJ().isTop() && ngm.AEQbTJ().getUnreadMessageCount() == ngm2.AEQbTJ().getUnreadMessageCount() && Intrinsics.EZpvd((java.lang.Object) ngm.AEQbTJ().getExtra(), (java.lang.Object) ngm.AEQbTJ().getExtra());
        }
        if ((obj instanceof nGE) && (obj2 instanceof nGE)) {
            OKConversation oKConversationAEQbTJ = ((nGE) obj).AEQbTJ();
            OKConversation oKConversationAEQbTJ2 = ((nGE) obj2).AEQbTJ();
            if (oKConversationAEQbTJ.getConversationType().getValue() == oKConversationAEQbTJ2.getConversationType().getValue() && Intrinsics.EZpvd((java.lang.Object) oKConversationAEQbTJ.getContactId(), (java.lang.Object) oKConversationAEQbTJ2.getContactId()) && Intrinsics.EZpvd((java.lang.Object) oKConversationAEQbTJ.getConversationTitle(), (java.lang.Object) oKConversationAEQbTJ2.getConversationTitle()) && Intrinsics.EZpvd((java.lang.Object) oKConversationAEQbTJ.getPortraitUrl(), (java.lang.Object) oKConversationAEQbTJ2.getPortraitUrl()) && oKConversationAEQbTJ.getUnreadMessageCount() == oKConversationAEQbTJ2.getUnreadMessageCount() && oKConversationAEQbTJ.getUnreadMentionedCount() == oKConversationAEQbTJ2.getUnreadMentionedCount() && Intrinsics.EZpvd(oKConversationAEQbTJ.getMentionedType(), oKConversationAEQbTJ2.getMentionedType()) && oKConversationAEQbTJ.isTop() == oKConversationAEQbTJ2.isTop() && oKConversationAEQbTJ.isFlagged() == oKConversationAEQbTJ2.isFlagged() && oKConversationAEQbTJ.isNoDisturb() == oKConversationAEQbTJ2.isNoDisturb() && oKConversationAEQbTJ.getSentTime() == oKConversationAEQbTJ2.getSentTime() && Intrinsics.EZpvd((java.lang.Object) oKConversationAEQbTJ.getSenderUserId(), (java.lang.Object) oKConversationAEQbTJ2.getSenderUserId()) && Intrinsics.EZpvd(oKConversationAEQbTJ.getDraftMessageModel(), oKConversationAEQbTJ2.getDraftMessageModel()) && Intrinsics.EZpvd(oKConversationAEQbTJ.getOfficialTagInfo(), oKConversationAEQbTJ2.getOfficialTagInfo()) && oKConversationAEQbTJ.getInGroupStatus() == oKConversationAEQbTJ2.getInGroupStatus() && oKConversationAEQbTJ.getGroupStatus() == oKConversationAEQbTJ2.getGroupStatus()) {
                OKMessage.SentStatus sentStatus = oKConversationAEQbTJ.getSentStatus();
                java.lang.Integer numValueOf = sentStatus != null ? java.lang.Integer.valueOf(sentStatus.getValue()) : null;
                OKMessage.SentStatus sentStatus2 = oKConversationAEQbTJ2.getSentStatus();
                if (Intrinsics.EZpvd(numValueOf, sentStatus2 != null ? java.lang.Integer.valueOf(sentStatus2.getValue()) : null)) {
                    OKMessageContent latestMessage = oKConversationAEQbTJ.getLatestMessage();
                    InHouseIMContentType contentType = latestMessage != null ? latestMessage.getContentType() : null;
                    OKMessageContent latestMessage2 = oKConversationAEQbTJ2.getLatestMessage();
                    if (contentType == (latestMessage2 != null ? latestMessage2.getContentType() : null)) {
                        OKMessageContent latestMessage3 = oKConversationAEQbTJ.getLatestMessage();
                        OKCustomMessage oKCustomMessage = latestMessage3 instanceof OKCustomMessage ? (OKCustomMessage) latestMessage3 : null;
                        java.lang.String content = oKCustomMessage != null ? oKCustomMessage.getContent() : null;
                        OKMessageContent latestMessage4 = oKConversationAEQbTJ2.getLatestMessage();
                        OKCustomMessage oKCustomMessage2 = latestMessage4 instanceof OKCustomMessage ? (OKCustomMessage) latestMessage4 : null;
                        if (Intrinsics.EZpvd((java.lang.Object) content, (java.lang.Object) (oKCustomMessage2 != null ? oKCustomMessage2.getContent() : null))) {
                            OKMessageContent latestMessage5 = oKConversationAEQbTJ.getLatestMessage();
                            OKCustomMessage oKCustomMessage3 = latestMessage5 instanceof OKCustomMessage ? (OKCustomMessage) latestMessage5 : null;
                            java.lang.String bizName = oKCustomMessage3 != null ? oKCustomMessage3.getBizName() : null;
                            OKMessageContent latestMessage6 = oKConversationAEQbTJ2.getLatestMessage();
                            OKCustomMessage oKCustomMessage4 = latestMessage6 instanceof OKCustomMessage ? (OKCustomMessage) latestMessage6 : null;
                            if (Intrinsics.EZpvd((java.lang.Object) bizName, (java.lang.Object) (oKCustomMessage4 != null ? oKCustomMessage4.getBizName() : null))) {
                                OKMessageContent latestMessage7 = oKConversationAEQbTJ.getLatestMessage();
                                OKStreamPlaceHolderMessage oKStreamPlaceHolderMessage = latestMessage7 instanceof OKStreamPlaceHolderMessage ? (OKStreamPlaceHolderMessage) latestMessage7 : null;
                                java.lang.String content2 = oKStreamPlaceHolderMessage != null ? oKStreamPlaceHolderMessage.getContent() : null;
                                OKMessageContent latestMessage8 = oKConversationAEQbTJ2.getLatestMessage();
                                OKStreamPlaceHolderMessage oKStreamPlaceHolderMessage2 = latestMessage8 instanceof OKStreamPlaceHolderMessage ? (OKStreamPlaceHolderMessage) latestMessage8 : null;
                                if (Intrinsics.EZpvd((java.lang.Object) content2, (java.lang.Object) (oKStreamPlaceHolderMessage2 != null ? oKStreamPlaceHolderMessage2.getContent() : null))) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if ((obj instanceof nGK) && (obj2 instanceof nGK)) {
                return true;
            }
            if ((obj instanceof nGL) && (obj2 instanceof nGL)) {
                return true;
            }
            if ((obj instanceof nGJ) && (obj2 instanceof nGJ)) {
                return true;
            }
            if ((obj instanceof nGH) && (obj2 instanceof nGH)) {
                nGH ngh = (nGH) obj;
                nGH ngh2 = (nGH) obj2;
                if (ngh.OLrzqt() == ngh2.OLrzqt() && ngh.KWHzl() == ngh2.KWHzl()) {
                    return true;
                }
            } else if ((obj instanceof nGI) && (obj2 instanceof nGI)) {
                nGI ngi = (nGI) obj;
                nGI ngi2 = (nGI) obj2;
                if (ngi.AEQbTJ() == ngi2.AEQbTJ() && ngi.copydefault() == ngi2.copydefault() && ngi.OLrzqt() == ngi2.OLrzqt() && ngi.KWHzl() == ngi2.KWHzl()) {
                    return true;
                }
            } else if ((obj instanceof C37248oqJ) && (obj2 instanceof C37248oqJ)) {
                RelationInfo relationInfoOLrzqt = ((C37248oqJ) obj).OLrzqt();
                RelationInfo relationInfoOLrzqt2 = ((C37248oqJ) obj2).OLrzqt();
                if (Intrinsics.EZpvd((java.lang.Object) C44157sFk.getDisplayName$default(relationInfoOLrzqt, null, 1, null), (java.lang.Object) C44157sFk.getDisplayName$default(relationInfoOLrzqt2, null, 1, null)) && Intrinsics.EZpvd((java.lang.Object) relationInfoOLrzqt.getContactsId(), (java.lang.Object) relationInfoOLrzqt2.getContactsId()) && Intrinsics.EZpvd((java.lang.Object) relationInfoOLrzqt.getAvatar(), (java.lang.Object) relationInfoOLrzqt2.getAvatar()) && Intrinsics.EZpvd((java.lang.Object) relationInfoOLrzqt.getPhoneRawNumber(), (java.lang.Object) relationInfoOLrzqt2.getPhoneRawNumber())) {
                    return true;
                }
            } else if ((obj instanceof C37246oqH) && (obj2 instanceof C37246oqH)) {
                C37246oqH c37246oqH = (C37246oqH) obj;
                C37246oqH c37246oqH2 = (C37246oqH) obj2;
                if (Intrinsics.EZpvd((java.lang.Object) c37246oqH.copydefault(), (java.lang.Object) c37246oqH2.copydefault()) && Intrinsics.EZpvd((java.lang.Object) c37246oqH.EZpvd(), (java.lang.Object) c37246oqH2.EZpvd()) && Intrinsics.EZpvd((java.lang.Object) ((PhoneRelation) CollectionsKt___CollectionsKt.AuCTelauCTel(c37246oqH.OLrzqt())).getRawNumber(), (java.lang.Object) ((PhoneRelation) CollectionsKt___CollectionsKt.AuCTelauCTel(c37246oqH2.OLrzqt())).getRawNumber()) && c37246oqH.OLrzqt().size() == c37246oqH2.OLrzqt().size()) {
                    return true;
                }
            } else if ((obj instanceof nGP) && (obj2 instanceof nGP)) {
                nGP ngp = (nGP) obj;
                nGP ngp2 = (nGP) obj2;
                if (ngp.AEQbTJ().size() == ngp2.AEQbTJ().size() && ((nGS) CollectionsKt___CollectionsKt.AuCTelauCTel(ngp.AEQbTJ())).copydefault() == ((nGS) CollectionsKt___CollectionsKt.AuCTelauCTel(ngp2.AEQbTJ())).copydefault()) {
                    return true;
                }
            }
        }
        return false;
    }
}
