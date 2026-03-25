package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.im.bean.ChatOrigin;
import com.okinc.im.bean.ChatSettingViewComponentScene;
import com.okinc.im.bean.LiveChatRoomConfig;
import com.okinc.im.bean.OrbitIMChatSearchResult;
import com.okinc.im.bean.SearchResultData;
import com.okinc.im.config.page.IMPageType;
import com.okinc.im.config.page.ServiceName;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.ReactionDetail;
import com.okinc.okimcore.model.other.IMSource;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nqU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC35180nqU extends InterfaceC43216rlB {
    android.content.Intent AEQbTJ(@NotNull FragmentActivity fragmentActivity, @NotNull SearchResultData.ChatAndContact chatAndContact, @NotNull java.lang.String str);

    Flow<java.lang.Integer> AEQbTJ(ChatOrigin chatOrigin);

    Flow<Result<OKConversation>> AEQbTJ(@NotNull java.lang.String str, @NotNull OKConversationType oKConversationType, @NotNull IMSource iMSource);

    Flow<java.lang.Integer> AEQbTJ(boolean z);

    sHZ AEQbTJ();

    void AEQbTJ(@NotNull android.content.Context context, java.lang.String str, ChatOrigin chatOrigin, OKMessage oKMessage, java.lang.String str2, java.lang.String str3, IMPageType iMPageType);

    void AEQbTJ(@NotNull android.content.Context context, @NotNull java.util.List<? extends SearchResultData> list, @NotNull java.lang.String str);

    void AEQbTJ(@NotNull C35893oHp c35893oHp, @NotNull SearchResultData.Message message);

    void AEQbTJ(@NotNull C35893oHp c35893oHp, @NotNull OKConversation oKConversation);

    androidx.fragment.app.Fragment EZpvd(@NotNull ChatSettingViewComponentScene chatSettingViewComponentScene);

    androidx.fragment.app.Fragment EZpvd(@NotNull java.lang.String str, int i, boolean z, boolean z2);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super OrbitIMChatSearchResult> continuation);

    Flow<java.lang.Integer> EZpvd(@NotNull java.lang.String str);

    sFU EZpvd();

    void EZpvd(@NotNull android.content.Context context, @NotNull java.util.List<? extends SearchResultData> list, @NotNull java.lang.String str);

    void EZpvd(@NotNull android.widget.TextView textView, @NotNull OfficialTagInfo officialTagInfo);

    void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    android.content.Intent KWHzl(@NotNull FragmentActivity fragmentActivity, @NotNull SearchResultData.Message message, @NotNull java.lang.String str);

    androidx.fragment.app.Fragment KWHzl(@NotNull C35241nrc c35241nrc);

    java.lang.Object KWHzl(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Function1<? super java.lang.Boolean, Unit> function1, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull InterfaceC44197sGx interfaceC44197sGx, @NotNull Continuation<? super Unit> continuation);

    C35743oCa KWHzl(@NotNull oBZ obz, @NotNull InterfaceC35243nre interfaceC35243nre);

    sGF KWHzl();

    void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull OKConversationType oKConversationType, @NotNull java.lang.String str2);

    void KWHzl(@NotNull android.widget.ImageView imageView, @NotNull OKMessage oKMessage);

    void KWHzl(@NotNull FragmentActivity fragmentActivity, @NotNull java.util.List<? extends InterfaceC35698oAj> list);

    void KWHzl(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull java.lang.String str, long j, @NotNull java.util.List<ReactionDetail> list);

    void KWHzl(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull java.lang.String str, java.lang.String str2, java.lang.String str3);

    androidx.fragment.app.Fragment OLrzqt(@NotNull LiveChatRoomConfig liveChatRoomConfig);

    java.lang.Object OLrzqt(@NotNull android.content.Context context, @NotNull Continuation<? super Result<C35185nqZ>> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<? extends SearchResultData>> continuation);

    Flow<OKMessage> OLrzqt(@NotNull java.lang.String str, @NotNull ServiceName serviceName);

    InterfaceC35353nti OLrzqt();

    android.content.Intent copydefault(@NotNull android.content.Context context, java.lang.String str, ChatOrigin chatOrigin, OKMessage oKMessage, java.lang.String str2, java.lang.String str3, IMPageType iMPageType);

    androidx.fragment.app.Fragment copydefault(@NotNull ChatOrigin chatOrigin);

    androidx.fragment.app.Fragment copydefault(@NotNull java.util.List<? extends SearchResultData> list, @NotNull java.lang.String str, java.lang.String str2, @NotNull androidx.fragment.app.Fragment fragment);

    java.lang.String copydefault(@NotNull android.content.Context context, @NotNull SearchResultData.Message message);

    sKH copydefault();

    void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, ChatOrigin chatOrigin);

    void copydefault(@NotNull android.content.Context context, @NotNull java.util.List<? extends SearchResultData> list, @NotNull java.lang.String str);

    void copydefault(@NotNull InterfaceC35282nsQ interfaceC35282nsQ, java.lang.String str, ServiceName serviceName);

    void copydefault(@NotNull C35893oHp c35893oHp, @NotNull SearchResultData.ChatAndContact chatAndContact);

    void copydefault(@NotNull C35893oHp c35893oHp, @NotNull com.okinc.okimcore.model.remote.UserInfo userInfo);

    boolean djBIcL();

    boolean valueOf();

    /* JADX INFO: renamed from: o.nqU$ActionBar */
    public static final class ActionBar {
        public static /* synthetic */ void startChat$default(InterfaceC35180nqU interfaceC35180nqU, android.content.Context context, java.lang.String str, java.lang.String str2, ChatOrigin chatOrigin, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startChat");
            }
            if ((i & 8) != 0) {
                chatOrigin = null;
            }
            interfaceC35180nqU.copydefault(context, str, str2, chatOrigin);
        }

        public static /* synthetic */ void startContactDetailsPage$default(InterfaceC35180nqU interfaceC35180nqU, AbstractActivityC33041mov abstractActivityC33041mov, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startContactDetailsPage");
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            interfaceC35180nqU.KWHzl(abstractActivityC33041mov, str, str2, str3);
        }

        public static /* synthetic */ Flow getOrInitConversationByUserIdFlow$default(InterfaceC35180nqU interfaceC35180nqU, java.lang.String str, OKConversationType oKConversationType, IMSource iMSource, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOrInitConversationByUserIdFlow");
            }
            if ((i & 4) != 0) {
                iMSource = IMSource.IM;
            }
            return interfaceC35180nqU.AEQbTJ(str, oKConversationType, iMSource);
        }

        public static /* synthetic */ androidx.fragment.app.Fragment createConversationListFragment$default(InterfaceC35180nqU interfaceC35180nqU, java.lang.String str, int i, boolean z, boolean z2, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createConversationListFragment");
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            if ((i2 & 4) != 0) {
                z = false;
            }
            if ((i2 & 8) != 0) {
                z2 = false;
            }
            return interfaceC35180nqU.EZpvd(str, i, z, z2);
        }

        public static /* synthetic */ Flow getTotalUnReadCountFlow$default(InterfaceC35180nqU interfaceC35180nqU, ChatOrigin chatOrigin, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTotalUnReadCountFlow");
            }
            if ((i & 1) != 0) {
                chatOrigin = null;
            }
            return interfaceC35180nqU.AEQbTJ(chatOrigin);
        }

        public static /* synthetic */ Flow getAllUnReadCountFlow$default(InterfaceC35180nqU interfaceC35180nqU, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllUnReadCountFlow");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return interfaceC35180nqU.AEQbTJ(z);
        }

        public static /* synthetic */ android.content.Intent createChatActivityIntent$default(InterfaceC35180nqU interfaceC35180nqU, android.content.Context context, java.lang.String str, ChatOrigin chatOrigin, OKMessage oKMessage, java.lang.String str2, java.lang.String str3, IMPageType iMPageType, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC35180nqU.copydefault(context, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : chatOrigin, (i & 8) != 0 ? null : oKMessage, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) == 0 ? iMPageType : null);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createChatActivityIntent");
        }

        public static /* synthetic */ void startChatActivity$default(InterfaceC35180nqU interfaceC35180nqU, android.content.Context context, java.lang.String str, ChatOrigin chatOrigin, OKMessage oKMessage, java.lang.String str2, java.lang.String str3, IMPageType iMPageType, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startChatActivity");
            }
            interfaceC35180nqU.AEQbTJ(context, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : chatOrigin, (i & 8) != 0 ? null : oKMessage, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) == 0 ? iMPageType : null);
        }

        public static /* synthetic */ void registerIMMessageListener$default(InterfaceC35180nqU interfaceC35180nqU, InterfaceC35282nsQ interfaceC35282nsQ, java.lang.String str, ServiceName serviceName, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerIMMessageListener");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                serviceName = null;
            }
            interfaceC35180nqU.copydefault(interfaceC35282nsQ, str, serviceName);
        }

        public static /* synthetic */ androidx.fragment.app.Fragment getFeedChatSearchResultFragment$default(InterfaceC35180nqU interfaceC35180nqU, java.util.List list, java.lang.String str, java.lang.String str2, androidx.fragment.app.Fragment fragment, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFeedChatSearchResultFragment");
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            return interfaceC35180nqU.copydefault((java.util.List<? extends SearchResultData>) list, str, str2, fragment);
        }
    }
}
