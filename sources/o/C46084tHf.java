package o;

import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.bean.SearchResultData;
import com.okinc.mln_ui.ui.okkit.UdMath;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKReferenceMessage;
import com.okinc.okimcore.model.im.OKTextMessage;
import com.okinc.okimcore.model.im.OKUserInfo;
import com.okinc.okimcore.model.other.OKRecallNotificationMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.inhouseim.PhoneRelationEntity;
import com.okinc.planet.biz_search.fragment.OrbitSearchResultFragment$assembleAdapterData$1;
import com.okinc.search.bean.SearchResultContentPo;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tHf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46084tHf extends AbstractC32996moC {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public SearchResultContentPo AEQbTJ;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.tHd
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C46084tHf.EZpvd();
        }
    });
    public boolean KWHzl;
    public tME copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C47501trL.Application.fJNWhG;
    }

    public final C46079tHa copydefault() {
        return (C46079tHa) this.EZpvd.getValue();
    }

    public static final C46079tHa EZpvd() {
        return new C46079tHa();
    }

    public final SearchResultContentPo gEmmrt() {
        SearchResultContentPo searchResultContentPo = this.AEQbTJ;
        if (searchResultContentPo != null) {
            return searchResultContentPo;
        }
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("KEY_CACHE_ID") : null;
        SearchResultContentPo searchResultContentPoOLrzqt = string != null ? tGF.OLrzqt.OLrzqt(string) : null;
        this.AEQbTJ = searchResultContentPoOLrzqt;
        return searchResultContentPoOLrzqt;
    }

    public final java.lang.String AEQbTJ() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("pageSource");
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.copydefault = tME.AEQbTJ(view);
        AhwBna();
        KWHzl();
        view.post(new java.lang.Runnable() { // from class: o.tHg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C46084tHf.KWHzl(this.OLrzqt);
            }
        });
    }

    public static final void KWHzl(C46084tHf c46084tHf) {
        if (c46084tHf.KWHzl) {
            return;
        }
        c46084tHf.KWHzl = true;
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c46084tHf, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void AhwBna() {
        RecyclerView recyclerView;
        tME tme = this.copydefault;
        if (tme == null || (recyclerView = tme.OLrzqt) == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        recyclerView.setAdapter(copydefault());
        recyclerView.setHasFixedSize(false);
        recyclerView.setItemAnimator(null);
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OrbitSearchResultFragment$assembleAdapterData$1(this, ((tWL) C43251rlk.copydefault(tWL.class)).AhwBna(), null), 3, null);
    }

    public final C46086tHh EZpvd(SearchResultContentPo.SearchResultContentItemPo searchResultContentItemPo) {
        SearchResultContentPo.SearchResultContentItemPo.ContentAuthorPo author = searchResultContentItemPo.getAuthor();
        java.lang.String strCopydefault = author != null ? author.copydefault() : null;
        SearchResultContentPo.SearchResultContentItemPo.ContentAuthorPo author2 = searchResultContentItemPo.getAuthor();
        return new C46086tHh(strCopydefault, author2 != null ? author2.EZpvd() : null, tTZ.EZpvd.KWHzl(C32979mnm.EZpvd.OLrzqt(), java.lang.Long.valueOf(searchResultContentItemPo.getPublishTime())), searchResultContentItemPo.getContentId(), C33129mqd.gEmmrt(searchResultContentItemPo.getContent()), (C59449zhJ.gEmmrt(SearchResultContentPo.SearchResultContentItemPo.SOURCE_PLATFORM_TWITTER, searchResultContentItemPo.getSourcePlatform(), true) || C59449zhJ.gEmmrt(SearchResultContentPo.SearchResultContentItemPo.SOURCE_PLATFORM_OKX, searchResultContentItemPo.getSourcePlatform(), true)) ? false : true, searchResultContentItemPo);
    }

    public final C46089tHk copydefault(SearchResultContentPo.SearchResultContentKolPo searchResultContentKolPo) {
        java.lang.String numberKmb = UdMath.formatNumberKmb(java.lang.String.valueOf(searchResultContentKolPo.getFollowerCount()), 1, 2, 0, 0);
        java.lang.String kolId = searchResultContentKolPo.getKolId();
        java.lang.String nickName = searchResultContentKolPo.getNickName();
        java.lang.String portrait = searchResultContentKolPo.getPortrait();
        Intrinsics.copydefault((java.lang.Object) numberKmb);
        java.lang.String bio = searchResultContentKolPo.getBio();
        if (bio == null) {
            bio = "";
        }
        return new C46089tHk(kolId, nickName, portrait, numberKmb, bio, searchResultContentKolPo);
    }

    public final C46087tHi EZpvd(SearchResultData.ChatAndContact chatAndContact) {
        java.lang.String str;
        java.lang.Integer groupEntityType;
        java.lang.String strOLrzqt = C35339ntU.OLrzqt(chatAndContact);
        java.lang.String strAEQbTJ = AEQbTJ(chatAndContact);
        RelationInfo relation = chatAndContact.getRelation();
        if (relation == null || (portraitUrl = relation.getAvatar()) == null) {
            OKConversation conversation = chatAndContact.getConversation();
            if (conversation != null) {
                java.lang.String portraitUrl = conversation.getPortraitUrl();
                str = portraitUrl;
            } else {
                str = null;
            }
        } else {
            str = portraitUrl;
        }
        OKConversation conversation2 = chatAndContact.getConversation();
        boolean z = (conversation2 == null || (groupEntityType = conversation2.getGroupEntityType()) == null || groupEntityType.intValue() != 12) ? false : true;
        OKConversation conversation3 = chatAndContact.getConversation();
        return new C46087tHi(strOLrzqt, strAEQbTJ, str, z, conversation3 != null ? conversation3.getOfficialTagInfo() : null, chatAndContact);
    }

    public final java.lang.String AEQbTJ(SearchResultData.ChatAndContact chatAndContact) {
        PhoneRelationEntity phoneRelation = chatAndContact.getPhoneRelation();
        RelationInfo relation = chatAndContact.getRelation();
        if (phoneRelation != null) {
            return phoneRelation.getNationalNumber();
        }
        if (relation != null) {
            java.lang.String strKWHzl = copydefault().KWHzl();
            if (strKWHzl == null) {
                strKWHzl = "";
            }
            if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) relation.getRemarkName(), (java.lang.CharSequence) strKWHzl, true)) {
                return relation.getNickName();
            }
        }
        return null;
    }

    public final C46088tHj OLrzqt(SearchResultData.GroupResult groupResult) {
        java.lang.String conversationTitle;
        java.lang.String groupName;
        java.lang.Integer groupEntityType;
        java.lang.String bizGroupName;
        OKConversation conversation = groupResult.getConversation();
        if (conversation == null || (conversationTitle = conversation.getConversationTitle()) == null) {
            conversationTitle = "";
        }
        java.lang.String str = conversationTitle;
        java.lang.String portraitUrl = conversation != null ? conversation.getPortraitUrl() : null;
        if (conversation == null || (groupName = conversation.getGroupName()) == null || (bizGroupName = conversation.getBizGroupName()) == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) bizGroupName) || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) groupName))) {
            groupName = null;
        }
        return new C46088tHj(str, groupName, portraitUrl, (conversation == null || (groupEntityType = conversation.getGroupEntityType()) == null || groupEntityType.intValue() != 12) ? false : true, conversation != null ? conversation.getOfficialTagInfo() : null, groupResult);
    }

    public final C46094tHp OLrzqt(SearchResultData.Message message) {
        java.lang.String conversationTitle;
        PhoneRelationEntity phoneRelation = message.getPhoneRelation();
        if (phoneRelation == null ? (conversationTitle = message.getConversation().getConversationTitle()) == null : (conversationTitle = phoneRelation.getName()) == null) {
            conversationTitle = "";
        }
        java.lang.String str = conversationTitle;
        java.lang.String portraitUrl = message.getConversation().getPortraitUrl();
        java.lang.String strAEQbTJ = AEQbTJ(message);
        tTZ ttz = tTZ.EZpvd;
        android.app.Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
        OKMessage message2 = message.getMessage();
        java.lang.String strKWHzl = ttz.KWHzl(applicationOLrzqt, java.lang.Long.valueOf(C33129mqd.valueOf(message2 != null ? java.lang.Long.valueOf(message2.getSentTime()) : null)));
        java.lang.Integer groupEntityType = message.getConversation().getGroupEntityType();
        return new C46094tHp(str, strAEQbTJ, portraitUrl, strKWHzl, groupEntityType != null && groupEntityType.intValue() == 12, message.getConversation().getOfficialTagInfo(), message);
    }

    public final java.lang.String AEQbTJ(SearchResultData.Message message) {
        OKTextMessage oKTextMessageObtain;
        OKMessage message2;
        OKMessageContent content;
        OKUserInfo userInfo;
        OKMessage message3 = message.getMessage();
        OKMessageContent content2 = message3 != null ? message3.getContent() : null;
        if (content2 instanceof OKTextMessage) {
            oKTextMessageObtain = (OKTextMessage) content2;
        } else {
            oKTextMessageObtain = content2 instanceof OKReferenceMessage ? OKTextMessage.CREATOR.obtain(((OKReferenceMessage) content2).getContent()) : null;
        }
        OKMessage message4 = message.getMessage();
        java.lang.String name = (((message4 != null ? message4.getContent() : null) instanceof OKRecallNotificationMessage) || C44166sFt.OLrzqt(message.getConversation()) || (message2 = message.getMessage()) == null || (content = message2.getContent()) == null || (userInfo = content.getUserInfo()) == null) ? null : userInfo.getName();
        java.lang.String strValueOf = java.lang.String.valueOf(oKTextMessageObtain != null ? oKTextMessageObtain.getAliasedContent() : null);
        if (name == null || name.length() == 0 || message.getConversation().getConversationType() != OKConversationType.GROUP) {
            return strValueOf;
        }
        return name + ": " + strValueOf;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.copydefault = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("KEY_CACHE_ID")) != null) {
            tGF.OLrzqt.KWHzl(string);
        }
        this.AEQbTJ = null;
        super.onDestroy();
    }

    /* JADX INFO: renamed from: o.tHf$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tHf.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ C46084tHf newInstance$default(TaskDescription taskDescription, SearchResultContentPo searchResultContentPo, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return taskDescription.copydefault(searchResultContentPo, str);
        }

        public final C46084tHf copydefault(@NotNull SearchResultContentPo searchResultContentPo, java.lang.String str) {
            Intrinsics.checkNotNullParameter(searchResultContentPo, "");
            java.lang.String strKWHzl = tGF.OLrzqt.KWHzl(searchResultContentPo);
            C46084tHf c46084tHf = new C46084tHf();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("KEY_CACHE_ID", strKWHzl);
            bundle.putString("pageSource", str);
            c46084tHf.setArguments(bundle);
            return c46084tHf;
        }
    }
}
