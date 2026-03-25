package com.okinc.im.imui.messages.audio.call;

import com.okinc.okimcore.model.other.GroupMemberInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44124sEe;
import o.C44157sFk;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.oDT;

/* JADX INFO: loaded from: classes8.dex */
public final class OKIMAudioCallViewModel$fetchDisplayNamesForSubheader$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $groupId;
    final /* synthetic */ Function1<List<String>, Unit> $onResult;
    final /* synthetic */ List<String> $userUids;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ OKIMAudioCallViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.util.List<java.lang.String>, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OKIMAudioCallViewModel$fetchDisplayNamesForSubheader$1(List<String> list, Function1<? super List<String>, Unit> function1, OKIMAudioCallViewModel oKIMAudioCallViewModel, String str, Continuation<? super OKIMAudioCallViewModel$fetchDisplayNamesForSubheader$1> continuation) {
        super(2, continuation);
        this.$userUids = list;
        this.$onResult = function1;
        this.this$0 = oKIMAudioCallViewModel;
        this.$groupId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OKIMAudioCallViewModel$fetchDisplayNamesForSubheader$1 oKIMAudioCallViewModel$fetchDisplayNamesForSubheader$1 = new OKIMAudioCallViewModel$fetchDisplayNamesForSubheader$1(this.$userUids, this.$onResult, this.this$0, this.$groupId, continuation);
        oKIMAudioCallViewModel$fetchDisplayNamesForSubheader$1.L$0 = obj;
        return oKIMAudioCallViewModel$fetchDisplayNamesForSubheader$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKIMAudioCallViewModel$fetchDisplayNamesForSubheader$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Duplicate block (B:30:0x0093) to fix multi-entry loop: BACK_EDGE: B:30:0x0093 -> B:31:0x009d */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083 A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:6:0x0026, B:20:0x007f, B:22:0x0083, B:26:0x008c), top: B:40:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007e -> B:20:0x007f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        OKIMAudioCallViewModel oKIMAudioCallViewModel;
        Iterator it;
        Collection collection;
        String str;
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            List<String> list = this.$userUids;
            OKIMAudioCallViewModel oKIMAudioCallViewModel2 = this.this$0;
            String str2 = this.$groupId;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            coroutineScope = coroutineScope2;
            oKIMAudioCallViewModel = oKIMAudioCallViewModel2;
            it = list.iterator();
            collection = arrayList;
            str = str2;
            if (!it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = (Collection) this.L$5;
            it = (Iterator) this.L$4;
            Collection collection2 = (Collection) this.L$3;
            str = (String) this.L$2;
            oKIMAudioCallViewModel = (OKIMAudioCallViewModel) this.L$1;
            coroutineScope = (CoroutineScope) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (Throwable th) {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                }
                collection.add((String) objM7377constructorimpl);
                collection = collection2;
                if (!it.hasNext()) {
                }
            }
            GroupMemberInfo groupMemberInfo = (GroupMemberInfo) obj;
            String strEZpvd = groupMemberInfo == null ? C44157sFk.EZpvd(groupMemberInfo) : null;
            if (strEZpvd == null) {
                strEZpvd = "";
            }
            objM7377constructorimpl = Result.m7377constructorimpl(strEZpvd);
            if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                objM7377constructorimpl = "";
            }
            collection.add((String) objM7377constructorimpl);
            collection = collection2;
            if (!it.hasNext()) {
                String str3 = (String) it.next();
                try {
                } catch (Throwable th2) {
                    collection2 = collection;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
                }
                Result.Application application3 = Result.Companion;
                oDT odt = oKIMAudioCallViewModel.AkhnZx;
                this.L$0 = coroutineScope;
                this.L$1 = oKIMAudioCallViewModel;
                this.L$2 = str;
                this.L$3 = collection;
                this.L$4 = it;
                this.L$5 = collection;
                this.label = 1;
                obj = odt.AEQbTJ(str, str3, false, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                collection2 = collection;
                GroupMemberInfo groupMemberInfo2 = (GroupMemberInfo) obj;
                if (groupMemberInfo2 == null) {
                }
                if (strEZpvd == null) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(strEZpvd);
                if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                }
                collection.add((String) objM7377constructorimpl);
                collection = collection2;
                if (!it.hasNext()) {
                    List<String> list2 = (List) collection;
                    this.$onResult.invoke(list2);
                    C44124sEe.imLogVoiceCall$default("ViewModel: fetched display names for subheader - " + list2, null, 2, null);
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
