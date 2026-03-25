package o;

import android.view.View;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.im.bean.SearchResultData;
import com.okinc.im.imui.search.provider.SearchResultChatAndContactProvider$SearchResultItemViewHolder$handleAlias$1;
import com.okinc.im.imui.search.provider.SearchResultChatAndContactProvider$SearchResultItemViewHolder$handleAlias$2;
import com.okinc.im.imui.utils.IMImageHelper;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.inhouseim.PhoneRelationEntity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C37479ouc;
import o.InterfaceC35897oHt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ouc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37479ouc implements InterfaceC35897oHt<SearchResultData> {
    public final Function0<java.lang.String> AEQbTJ;
    public final Function1<SearchResultData.ChatAndContact, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.im.bean.SearchResultData$ChatAndContact, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C37479ouc(@NotNull Function0<java.lang.String> function0, @NotNull Function1<? super SearchResultData.ChatAndContact, Unit> function1) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function0;
        this.copydefault = function1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.oHr, java.lang.Object, java.util.List] */
    @Override // o.InterfaceC35897oHt
    public /* synthetic */ void AEQbTJ(C35895oHr c35895oHr, SearchResultData searchResultData, java.util.List list) {
        OLrzqt(c35895oHr, searchResultData, (java.util.List<? extends java.lang.Object>) list);
    }

    public void OLrzqt(@NotNull C35895oHr c35895oHr, @NotNull SearchResultData searchResultData, @NotNull java.util.List<? extends java.lang.Object> list) {
        InterfaceC35897oHt.Application.AEQbTJ(this, c35895oHr, searchResultData, list);
    }

    @Override // o.InterfaceC35897oHt
    public C35895oHr AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        nNM nnmKWHzl = nNM.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(nnmKWHzl, "");
        return new ActionBar(this, nnmKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/oHr;Ljava/lang/Object;I)V */
    @Override // o.InterfaceC35897oHt
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull SearchResultData searchResultData, int i) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(searchResultData, "");
        if ((c35895oHr instanceof ActionBar) && (searchResultData instanceof SearchResultData.ChatAndContact)) {
            ((ActionBar) c35895oHr).AEQbTJ((SearchResultData.ChatAndContact) searchResultData);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Z */
    @Override // o.InterfaceC35897oHt
    public boolean AEQbTJ(@NotNull SearchResultData searchResultData) {
        Intrinsics.checkNotNullParameter(searchResultData, "");
        return searchResultData instanceof SearchResultData.ChatAndContact;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/oHr;Ljava/lang/Object;)V */
    @Override // o.InterfaceC35897oHt
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull C35895oHr c35895oHr, @NotNull SearchResultData searchResultData) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(searchResultData, "");
        if (c35895oHr instanceof ActionBar) {
            ((ActionBar) c35895oHr).AEQbTJ();
        }
    }

    /* JADX INFO: renamed from: o.ouc$ActionBar */
    public final class ActionBar extends C35895oHr {
        public final /* synthetic */ C37479ouc EZpvd;
        public final nNM KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C37479ouc c37479ouc, nNM nnm) {
            super(nnm.getRoot().getContext(), nnm.getRoot());
            Intrinsics.checkNotNullParameter(nnm, "");
            this.EZpvd = c37479ouc;
            this.KWHzl = nnm;
        }

        public final void AEQbTJ(@NotNull final SearchResultData.ChatAndContact chatAndContact) {
            Intrinsics.checkNotNullParameter(chatAndContact, "");
            KWHzl(chatAndContact);
            valueOf(chatAndContact);
            OLrzqt(chatAndContact);
            EZpvd(chatAndContact);
            android.widget.TextView textView = this.KWHzl.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            OKConversation conversation = chatAndContact.getConversation();
            C37716ozA.updateTagViewWithTagInfo$default(textView, conversation != null ? conversation.getOfficialTagInfo() : null, 0, null, false, false, false, 62, null);
            android.view.View view = this.itemView;
            final C37479ouc c37479ouc = this.EZpvd;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.oub
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C37479ouc.ActionBar.OLrzqt(c37479ouc, chatAndContact, view2);
                }
            });
        }

        public static final void OLrzqt(C37479ouc c37479ouc, SearchResultData.ChatAndContact chatAndContact, android.view.View view) {
            c37479ouc.copydefault.invoke(chatAndContact);
        }

        public final void KWHzl(SearchResultData.ChatAndContact chatAndContact) {
            java.lang.String str;
            java.lang.String str2;
            RelationInfo relation = chatAndContact.getRelation();
            OKConversation conversation = chatAndContact.getConversation();
            if (relation != null) {
                C37241oqC c37241oqC = C37241oqC.AEQbTJ;
                nKW nkw = this.KWHzl.EZpvd;
                Intrinsics.checkNotNullExpressionValue(nkw, "");
                PhoneRelationEntity phoneRelation = chatAndContact.getPhoneRelation();
                str = "ivAvatar";
                c37241oqC.EZpvd(nkw, relation.copy(((-50331649) & 1) != 0 ? relation.contactsId : null, ((-50331649) & 2) != 0 ? relation.avatar : null, ((-50331649) & 4) != 0 ? relation.nickName : null, ((-50331649) & 8) != 0 ? relation.remarkName : null, ((-50331649) & 16) != 0 ? relation.sign : null, ((-50331649) & 32) != 0 ? relation.isBlackList : false, ((-50331649) & 64) != 0 ? relation.isNoDisturb : false, ((-50331649) & 128) != 0 ? relation.isTop : false, ((-50331649) & 256) != 0 ? relation.isFriend : false, ((-50331649) & 512) != 0 ? relation.isBothFriend : false, ((-50331649) & 1024) != 0 ? relation.isCanChat : false, ((-50331649) & 2048) != 0 ? relation.isCurrentUser : false, ((-50331649) & 4096) != 0 ? relation.displayAlphabetText : null, ((-50331649) & 8192) != 0 ? relation.officialTags : null, ((-50331649) & 16384) != 0 ? relation.timestamp : 0L, ((-50331649) & 32768) != 0 ? relation.isOpenKOL : false, (65536 & (-50331649)) != 0 ? relation.kolUniqueName : null, ((-50331649) & 131072) != 0 ? relation.enNickName : null, ((-50331649) & 262144) != 0 ? relation.allowAddContact : null, ((-50331649) & 524288) != 0 ? relation.isAllowSendMessage : null, ((-50331649) & 1048576) != 0 ? relation.showVoiceCall : null, ((-50331649) & 2097152) != 0 ? relation.showKycBanner : null, ((-50331649) & 4194304) != 0 ? relation.relationSourceType : null, ((-50331649) & 8388608) != 0 ? relation.hash : null, ((-50331649) & 16777216) != 0 ? relation.phoneName : phoneRelation != null ? phoneRelation.getName() : null, ((-50331649) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? relation.phoneRawNumber : null, ((-50331649) & 67108864) != 0 ? relation.isAllowSingleChatInGroup : null, ((-50331649) & 134217728) != 0 ? relation.showUnknownContactBanner : null, ((-50331649) & 268435456) != 0 ? relation.allowVoice : null, ((-50331649) & 536870912) != 0 ? relation.allowFile : null, ((-50331649) & 1073741824) != 0 ? relation.allowPlanetProfile : null, ((-50331649) & Integer.MIN_VALUE) != 0 ? relation.orbitBackgroundImage : null, (63 & 1) != 0 ? relation.orbitStatus : null, (63 & 2) != 0 ? relation.allowBlockUser : null, (63 & 4) != 0 ? relation.showVipPerformanceDetails : null, (63 & 8) != 0 ? relation.allowRemoveGroupMember : null, (63 & 16) != 0 ? relation.customNote : null, (63 & 32) != 0 ? relation.isAllowPay : null));
            } else {
                str = "ivAvatar";
                if (conversation != null) {
                    C35893oHp c35893oHp = this.KWHzl.EZpvd.copydefault;
                    str2 = str;
                    Intrinsics.checkNotNullExpressionValue(c35893oHp, str2);
                    c35893oHp.setVisibility(0);
                    C35893oHp c35893oHp2 = this.KWHzl.EZpvd.copydefault;
                    Intrinsics.checkNotNullExpressionValue(c35893oHp2, str2);
                    C35891oHn.AEQbTJ(c35893oHp2, conversation);
                }
                IMImageHelper iMImageHelper = IMImageHelper.OLrzqt;
                C35893oHp c35893oHp3 = this.KWHzl.EZpvd.copydefault;
                Intrinsics.checkNotNullExpressionValue(c35893oHp3, str2);
                iMImageHelper.AEQbTJ(c35893oHp3, 32);
            }
            str2 = str;
            IMImageHelper iMImageHelper2 = IMImageHelper.OLrzqt;
            C35893oHp c35893oHp32 = this.KWHzl.EZpvd.copydefault;
            Intrinsics.checkNotNullExpressionValue(c35893oHp32, str2);
            iMImageHelper2.AEQbTJ(c35893oHp32, 32);
        }

        public final void valueOf(SearchResultData.ChatAndContact chatAndContact) {
            C37241oqC c37241oqC = C37241oqC.AEQbTJ;
            android.widget.TextView textView = this.KWHzl.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            C37241oqC.handleKeywordHighlight$default(c37241oqC, this, textView, C35339ntU.OLrzqt(chatAndContact), (java.lang.String) this.EZpvd.AEQbTJ.invoke(), false, 16, null);
        }

        public final void OLrzqt(SearchResultData.ChatAndContact chatAndContact) {
            PhoneRelationEntity phoneRelation = chatAndContact.getPhoneRelation();
            RelationInfo relation = chatAndContact.getRelation();
            if (phoneRelation != null) {
                android.widget.TextView textView = this.KWHzl.copydefault;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(0);
                this.KWHzl.copydefault.setText(phoneRelation.getNationalNumber());
                C37730ozO.OLrzqt.AEQbTJ(this, new SearchResultChatAndContactProvider$SearchResultItemViewHolder$handleAlias$1(this, phoneRelation, this.EZpvd, null));
                return;
            }
            if (relation != null) {
                if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) relation.getRemarkName(), (java.lang.CharSequence) this.EZpvd.AEQbTJ.invoke(), true)) {
                    android.widget.TextView textView2 = this.KWHzl.copydefault;
                    Intrinsics.checkNotNullExpressionValue(textView2, "");
                    textView2.setVisibility(0);
                    C37730ozO.OLrzqt.AEQbTJ(this, new SearchResultChatAndContactProvider$SearchResultItemViewHolder$handleAlias$2(this, relation, this.EZpvd, null));
                    return;
                }
                android.widget.TextView textView3 = this.KWHzl.copydefault;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                C55307xhV.AEQbTJ(textView3, null);
                return;
            }
            copydefault(chatAndContact);
        }

        public final void copydefault(SearchResultData.ChatAndContact chatAndContact) {
            java.lang.String groupName;
            java.lang.String bizGroupName;
            OKConversation conversation = chatAndContact.getConversation();
            java.lang.String str = (conversation == null || (groupName = conversation.getGroupName()) == null || (bizGroupName = conversation.getBizGroupName()) == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) bizGroupName) || !(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) groupName) ^ true)) ? null : groupName;
            if (str == null) {
                android.widget.TextView textView = this.KWHzl.copydefault;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                C55307xhV.AEQbTJ(textView, null);
                return;
            }
            android.widget.TextView textView2 = this.KWHzl.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(0);
            C37241oqC c37241oqC = C37241oqC.AEQbTJ;
            android.widget.TextView textView3 = this.KWHzl.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            C37241oqC.handleKeywordHighlight$default(c37241oqC, this, textView3, str, (java.lang.String) this.EZpvd.AEQbTJ.invoke(), false, 16, null);
        }

        public final void EZpvd(SearchResultData.ChatAndContact chatAndContact) {
            java.lang.Integer groupEntityType;
            OKConversation conversation = chatAndContact.getConversation();
            android.widget.ImageView imageView = this.KWHzl.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility((conversation == null || (groupEntityType = conversation.getGroupEntityType()) == null || groupEntityType.intValue() != 12) ? 8 : 0);
        }

        public final void AEQbTJ() {
            android.widget.TextView textView = this.KWHzl.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            C55307xhV.AEQbTJ(textView, null);
        }
    }
}
