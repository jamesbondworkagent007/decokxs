package o;

import com.okinc.im.bean.OrbitIMChatSearchResult;
import com.okinc.im.bean.SearchResultData;
import com.okinc.im.usecase.message.SearchOrbitIMChatsUseCase$invoke$2;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.ContactEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oEt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@yCR
public final class C35816oEt {
    public final sKO AEQbTJ;

    @yCM
    public C35816oEt(@NotNull sKO sko) {
        Intrinsics.checkNotNullParameter(sko, "");
        this.AEQbTJ = sko;
    }

    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super OrbitIMChatSearchResult> continuation) {
        return CoroutineScopeKt.coroutineScope(new SearchOrbitIMChatsUseCase$invoke$2(this, str, null), continuation);
    }

    public final OrbitIMChatSearchResult AEQbTJ(java.lang.String str) {
        return new OrbitIMChatSearchResult(str, yDY.AhwBna(), yDY.AhwBna(), yDY.AhwBna());
    }

    public final java.util.List<SearchResultData.ChatAndContact> copydefault(java.util.List<sQU> list, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (sQU squ : list) {
            InHouseIMConversationEntity inHouseIMConversationEntityCopydefault = squ.copydefault();
            ContactEntity contactEntityOLrzqt = null;
            OKConversation oKConversationOLrzqt = inHouseIMConversationEntityCopydefault != null ? C44169sFw.OLrzqt(inHouseIMConversationEntityCopydefault) : null;
            sSM ssm = sSM.AEQbTJ;
            InHouseIMContactInfoEntity inHouseIMContactInfoEntityOLrzqt = squ.OLrzqt();
            if (inHouseIMContactInfoEntityOLrzqt != null) {
                contactEntityOLrzqt = C44169sFw.OLrzqt(inHouseIMContactInfoEntityOLrzqt);
            }
            arrayList.add(new SearchResultData.ChatAndContact(oKConversationOLrzqt, ssm.OLrzqt(contactEntityOLrzqt), squ.KWHzl(), str));
        }
        return arrayList;
    }

    public final java.util.List<SearchResultData.GroupResult> AEQbTJ(java.util.List<InHouseIMConversationEntity> list, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new SearchResultData.GroupResult(C44169sFw.OLrzqt((InHouseIMConversationEntity) it.next()), str));
        }
        return arrayList;
    }

    public final java.util.List<SearchResultData.Message> AEQbTJ(java.util.List<sQY> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (sQY sqy : list) {
            OKMessage oKMessageAEQbTJ = C44169sFw.AEQbTJ(sqy.copydefault());
            OKConversation oKConversationOLrzqt = C44169sFw.OLrzqt(sqy.OLrzqt());
            sSM ssm = sSM.AEQbTJ;
            InHouseIMContactInfoEntity inHouseIMContactInfoEntityKWHzl = sqy.KWHzl();
            ContactEntity contactEntityOLrzqt = null;
            RelationInfo relationInfoOLrzqt = ssm.OLrzqt(inHouseIMContactInfoEntityKWHzl != null ? C44169sFw.OLrzqt(inHouseIMContactInfoEntityKWHzl) : null);
            InHouseIMContactInfoEntity inHouseIMContactInfoEntityAEQbTJ = sqy.AEQbTJ();
            if (inHouseIMContactInfoEntityAEQbTJ != null) {
                contactEntityOLrzqt = C44169sFw.OLrzqt(inHouseIMContactInfoEntityAEQbTJ);
            }
            arrayList.add(new SearchResultData.Message(oKMessageAEQbTJ, oKConversationOLrzqt, relationInfoOLrzqt, ssm.OLrzqt(contactEntityOLrzqt), sqy.EZpvd()));
        }
        return arrayList;
    }
}
