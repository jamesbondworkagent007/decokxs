package o;

import androidx.recyclerview.widget.DiffUtil;
import com.okinc.im.bean.SearchResultData;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.otX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37421otX extends DiffUtil.ItemCallback<SearchResultData> {
    /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull SearchResultData searchResultData, @NotNull SearchResultData searchResultData2) {
        Intrinsics.checkNotNullParameter(searchResultData, "");
        Intrinsics.checkNotNullParameter(searchResultData2, "");
        if ((!EZpvd(searchResultData) || !EZpvd(searchResultData2)) && ((!OLrzqt(searchResultData) || !OLrzqt(searchResultData2)) && (!(searchResultData instanceof SearchResultData.Divider) || !(searchResultData2 instanceof SearchResultData.Divider)))) {
            if ((searchResultData instanceof SearchResultData.Header) && (searchResultData2 instanceof SearchResultData.Header)) {
                if (((SearchResultData.Header) searchResultData).getTitle() != ((SearchResultData.Header) searchResultData2).getTitle()) {
                    return false;
                }
            } else {
                if ((searchResultData instanceof SearchResultData.ChatAndContact) && (searchResultData2 instanceof SearchResultData.ChatAndContact)) {
                    SearchResultData.ChatAndContact chatAndContact = (SearchResultData.ChatAndContact) searchResultData;
                    OKConversation conversation = chatAndContact.getConversation();
                    java.lang.String targetId = conversation != null ? conversation.getTargetId() : null;
                    SearchResultData.ChatAndContact chatAndContact2 = (SearchResultData.ChatAndContact) searchResultData2;
                    OKConversation conversation2 = chatAndContact2.getConversation();
                    boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) targetId, (java.lang.Object) (conversation2 != null ? conversation2.getTargetId() : null));
                    RelationInfo relation = chatAndContact.getRelation();
                    java.lang.String contactsId = relation != null ? relation.getContactsId() : null;
                    RelationInfo relation2 = chatAndContact2.getRelation();
                    boolean zEZpvd2 = Intrinsics.EZpvd(contactsId, relation2 != null ? relation2.getContactsId() : null);
                    if (!zEZpvd || !zEZpvd2) {
                    }
                } else if ((searchResultData instanceof SearchResultData.Message) && (searchResultData2 instanceof SearchResultData.Message)) {
                    OKMessage message = ((SearchResultData.Message) searchResultData).getMessage();
                    java.lang.Long lValueOf = message != null ? java.lang.Long.valueOf(message.getSeq()) : null;
                    OKMessage message2 = ((SearchResultData.Message) searchResultData2).getMessage();
                    return Intrinsics.EZpvd(lValueOf, message2 != null ? java.lang.Long.valueOf(message2.getSeq()) : null);
                }
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011d A[ORIG_RETURN, RETURN] */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean areContentsTheSame(@NotNull SearchResultData searchResultData, @NotNull SearchResultData searchResultData2) {
        Intrinsics.checkNotNullParameter(searchResultData, "");
        Intrinsics.checkNotNullParameter(searchResultData2, "");
        if ((!EZpvd(searchResultData) || !EZpvd(searchResultData2)) && ((!OLrzqt(searchResultData) || !OLrzqt(searchResultData2)) && (!(searchResultData instanceof SearchResultData.Divider) || !(searchResultData2 instanceof SearchResultData.Divider)))) {
            if ((searchResultData instanceof SearchResultData.Header) && (searchResultData2 instanceof SearchResultData.Header)) {
                if (((SearchResultData.Header) searchResultData).getTitle() == ((SearchResultData.Header) searchResultData2).getTitle()) {
                }
            } else {
                if ((searchResultData instanceof SearchResultData.ChatAndContact) && (searchResultData2 instanceof SearchResultData.ChatAndContact)) {
                    SearchResultData.ChatAndContact chatAndContact = (SearchResultData.ChatAndContact) searchResultData;
                    OKConversation conversation = chatAndContact.getConversation();
                    java.lang.String targetId = conversation != null ? conversation.getTargetId() : null;
                    SearchResultData.ChatAndContact chatAndContact2 = (SearchResultData.ChatAndContact) searchResultData2;
                    OKConversation conversation2 = chatAndContact2.getConversation();
                    boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) targetId, (java.lang.Object) (conversation2 != null ? conversation2.getTargetId() : null));
                    RelationInfo relation = chatAndContact.getRelation();
                    java.lang.String contactsId = relation != null ? relation.getContactsId() : null;
                    RelationInfo relation2 = chatAndContact2.getRelation();
                    boolean zEZpvd2 = Intrinsics.EZpvd(contactsId, relation2 != null ? relation2.getContactsId() : null);
                    boolean zEZpvd3 = Intrinsics.EZpvd(chatAndContact.getPhoneRelation(), chatAndContact2.getPhoneRelation());
                    boolean zEZpvd4 = Intrinsics.EZpvd((java.lang.Object) chatAndContact.getSearchKeyword(), (java.lang.Object) chatAndContact2.getSearchKeyword());
                    if (!zEZpvd || !zEZpvd2 || !zEZpvd3 || !zEZpvd4) {
                        return false;
                    }
                } else {
                    if ((searchResultData instanceof SearchResultData.Message) && (searchResultData2 instanceof SearchResultData.Message)) {
                        SearchResultData.Message message = (SearchResultData.Message) searchResultData;
                        OKMessage message2 = message.getMessage();
                        java.lang.Long lValueOf = message2 != null ? java.lang.Long.valueOf(message2.getSeq()) : null;
                        SearchResultData.Message message3 = (SearchResultData.Message) searchResultData2;
                        OKMessage message4 = message3.getMessage();
                        boolean zEZpvd5 = Intrinsics.EZpvd(lValueOf, message4 != null ? java.lang.Long.valueOf(message4.getSeq()) : null);
                        boolean zEZpvd6 = Intrinsics.EZpvd((java.lang.Object) message.getConversation().getTargetId(), (java.lang.Object) message3.getConversation().getTargetId());
                        boolean zEZpvd7 = Intrinsics.EZpvd(message.getTaggedUserContact(), message3.getTaggedUserContact());
                        boolean zEZpvd8 = Intrinsics.EZpvd(message.getContact(), message3.getContact());
                        boolean zEZpvd9 = Intrinsics.EZpvd(message.getPhoneRelation(), message3.getPhoneRelation());
                        if (!zEZpvd5 || !zEZpvd6 || !zEZpvd7 || !zEZpvd8 || !zEZpvd9) {
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean EZpvd(SearchResultData searchResultData) {
        return (searchResultData instanceof SearchResultData.LoadMore) && ((SearchResultData.LoadMore) searchResultData).ordinal() == SearchResultData.LoadMore.MESSAGE.ordinal();
    }

    public final boolean OLrzqt(SearchResultData searchResultData) {
        return (searchResultData instanceof SearchResultData.LoadMore) && ((SearchResultData.LoadMore) searchResultData).ordinal() == SearchResultData.LoadMore.CHAT_AND_CONTACT.ordinal();
    }
}
