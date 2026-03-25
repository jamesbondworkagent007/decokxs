package com.okinc.im.usecase.message;

import com.okinc.im.bean.SearchResultData;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C35819oEw;
import o.C43251rlk;
import o.C44169sFw;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.sQU;
import o.sQY;
import o.sSM;

/* JADX INFO: loaded from: classes8.dex */
public final class SearchContactAndMessageUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<SearchResultData>>, Object> {
    final /* synthetic */ boolean $includingGroup;
    final /* synthetic */ String $keyword;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C35819oEw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchContactAndMessageUseCase$execute$2(C35819oEw c35819oEw, String str, boolean z, Continuation<? super SearchContactAndMessageUseCase$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = c35819oEw;
        this.$keyword = str;
        this.$includingGroup = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchContactAndMessageUseCase$execute$2 searchContactAndMessageUseCase$execute$2 = new SearchContactAndMessageUseCase$execute$2(this.this$0, this.$keyword, this.$includingGroup, continuation);
        searchContactAndMessageUseCase$execute$2.L$0 = obj;
        return searchContactAndMessageUseCase$execute$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<SearchResultData>> continuation) {
        return ((SearchContactAndMessageUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List arrayList;
        Deferred deferred;
        List<sQU> list;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            arrayList = new ArrayList();
            InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
            if (interfaceC35180nqU != null && interfaceC35180nqU.djBIcL()) {
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new SearchContactAndMessageUseCase$execute$2$chatsDeferred$1(this.this$0, this.$keyword, this.$includingGroup, null), 3, null);
                Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new SearchContactAndMessageUseCase$execute$2$messagesDeferred$1(this.this$0, this.$keyword, null), 3, null);
                this.L$0 = arrayList;
                this.L$1 = deferredAsync$default2;
                this.label = 1;
                Object objAwait = deferredAsync$default.await(this);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
                deferred = deferredAsync$default2;
                obj = objAwait;
            }
            return arrayList;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) this.L$1;
            arrayList = (List) this.L$0;
            C56391yDq.AEQbTJ(obj);
            List<sQY> list2 = (List) obj;
            String str = this.$keyword;
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (sQU squ : list) {
                InHouseIMConversationEntity inHouseIMConversationEntityCopydefault = squ.copydefault();
                OKConversation oKConversationOLrzqt = inHouseIMConversationEntityCopydefault != null ? C44169sFw.OLrzqt(inHouseIMConversationEntityCopydefault) : null;
                sSM ssm = sSM.AEQbTJ;
                InHouseIMContactInfoEntity inHouseIMContactInfoEntityOLrzqt = squ.OLrzqt();
                arrayList2.add(new SearchResultData.ChatAndContact(oKConversationOLrzqt, ssm.OLrzqt(inHouseIMContactInfoEntityOLrzqt != null ? C44169sFw.OLrzqt(inHouseIMContactInfoEntityOLrzqt) : null), squ.KWHzl(), str));
            }
            arrayList.addAll(arrayList2);
            ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(list2, 10));
            for (sQY sqy : list2) {
                OKMessage oKMessageAEQbTJ = C44169sFw.AEQbTJ(sqy.copydefault());
                OKConversation oKConversationOLrzqt2 = C44169sFw.OLrzqt(sqy.OLrzqt());
                sSM ssm2 = sSM.AEQbTJ;
                InHouseIMContactInfoEntity inHouseIMContactInfoEntityKWHzl = sqy.KWHzl();
                RelationInfo relationInfoOLrzqt = ssm2.OLrzqt(inHouseIMContactInfoEntityKWHzl != null ? C44169sFw.OLrzqt(inHouseIMContactInfoEntityKWHzl) : null);
                InHouseIMContactInfoEntity inHouseIMContactInfoEntityAEQbTJ = sqy.AEQbTJ();
                arrayList3.add(new SearchResultData.Message(oKMessageAEQbTJ, oKConversationOLrzqt2, relationInfoOLrzqt, ssm2.OLrzqt(inHouseIMContactInfoEntityAEQbTJ != null ? C44169sFw.OLrzqt(inHouseIMContactInfoEntityAEQbTJ) : null), sqy.EZpvd()));
            }
            arrayList.addAll(arrayList3);
            return arrayList;
        }
        Deferred deferred2 = (Deferred) this.L$1;
        List list3 = (List) this.L$0;
        C56391yDq.AEQbTJ(obj);
        deferred = deferred2;
        arrayList = list3;
        List list4 = (List) obj;
        this.L$0 = arrayList;
        this.L$1 = list4;
        this.label = 2;
        Object objAwait2 = deferred.await(this);
        if (objAwait2 == objCopydefault) {
            return objCopydefault;
        }
        list = list4;
        obj = objAwait2;
        List<sQY> list22 = (List) obj;
        String str2 = this.$keyword;
        ArrayList arrayList22 = new ArrayList(C56403yEb.AYXKKw(list, 10));
        while (r0.hasNext()) {
        }
        arrayList.addAll(arrayList22);
        ArrayList arrayList32 = new ArrayList(C56403yEb.AYXKKw(list22, 10));
        while (r14.hasNext()) {
        }
        arrayList.addAll(arrayList32);
        return arrayList;
    }
}
