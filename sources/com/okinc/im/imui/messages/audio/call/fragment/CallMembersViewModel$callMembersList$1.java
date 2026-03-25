package com.okinc.im.imui.messages.audio.call.fragment;

import com.okinc.okimcore.model.im.GroupVoiceCallData;
import com.okinc.okimcore.model.im.GroupVoiceCallUser;
import com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig;
import com.okinc.okimcore.model.other.GroupInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C34282nYe;
import o.C56391yDq;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes8.dex */
public final class CallMembersViewModel$callMembersList$1 extends SuspendLambda implements Function2<GroupInfo, Continuation<? super List<? extends C34282nYe>>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ CallMembersViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallMembersViewModel$callMembersList$1(CallMembersViewModel callMembersViewModel, Continuation<? super CallMembersViewModel$callMembersList$1> continuation) {
        super(2, continuation);
        this.this$0 = callMembersViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CallMembersViewModel$callMembersList$1 callMembersViewModel$callMembersList$1 = new CallMembersViewModel$callMembersList$1(this.this$0, continuation);
        callMembersViewModel$callMembersList$1.L$0 = obj;
        return callMembersViewModel$callMembersList$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(GroupInfo groupInfo, Continuation<? super List<C34282nYe>> continuation) {
        return ((CallMembersViewModel$callMembersList$1) create(groupInfo, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(GroupInfo groupInfo, Continuation<? super List<? extends C34282nYe>> continuation) {
        return invoke2(groupInfo, (Continuation<? super List<C34282nYe>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0097 -> B:24:0x009a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e6 -> B:40:0x00e9). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CallMembersViewModel callMembersViewModel;
        GroupInfo groupInfo;
        String str;
        Iterator it;
        Collection collection;
        GroupVoiceCallData currentCall;
        List list;
        CallMembersViewModel callMembersViewModel2;
        String str2;
        Collection collection2;
        Iterator it2;
        GroupVoiceCallData currentCall2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        List<String> listAhwBna = null;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            GroupInfo groupInfo2 = (GroupInfo) this.L$0;
            String groupId = groupInfo2.getGroupId();
            GroupVoiceCallConfig groupVoiceCallConfig = groupInfo2.getGroupVoiceCallConfig();
            List<GroupVoiceCallUser> activeUsers = (groupVoiceCallConfig == null || (currentCall = groupVoiceCallConfig.getCurrentCall()) == null) ? null : currentCall.getActiveUsers();
            if (activeUsers == null) {
                activeUsers = yDY.AhwBna();
            }
            callMembersViewModel = this.this$0;
            ArrayList arrayList = new ArrayList();
            groupInfo = groupInfo2;
            str = groupId;
            it = activeUsers.iterator();
            collection = arrayList;
            if (it.hasNext()) {
            }
        } else if (i == 1) {
            it = (Iterator) this.L$4;
            collection = (Collection) this.L$3;
            callMembersViewModel = (CallMembersViewModel) this.L$2;
            str = (String) this.L$1;
            groupInfo = (GroupInfo) this.L$0;
            C56391yDq.AEQbTJ(obj);
            C34282nYe c34282nYe = (C34282nYe) obj;
            if (c34282nYe != null) {
                collection.add(c34282nYe);
            }
            if (it.hasNext()) {
                GroupVoiceCallUser groupVoiceCallUser = (GroupVoiceCallUser) it.next();
                this.L$0 = groupInfo;
                this.L$1 = str;
                this.L$2 = callMembersViewModel;
                this.L$3 = collection;
                this.L$4 = it;
                this.label = 1;
                obj = callMembersViewModel.EZpvd(str, groupVoiceCallUser, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                C34282nYe c34282nYe2 = (C34282nYe) obj;
                if (c34282nYe2 != null) {
                }
                if (it.hasNext()) {
                    list = (List) collection;
                    GroupVoiceCallConfig groupVoiceCallConfig2 = groupInfo.getGroupVoiceCallConfig();
                    if (groupVoiceCallConfig2 != null && (currentCall2 = groupVoiceCallConfig2.getCurrentCall()) != null) {
                        listAhwBna = currentCall2.getTargetUids();
                    }
                    if (listAhwBna == null) {
                        listAhwBna = yDY.AhwBna();
                    }
                    CallMembersViewModel callMembersViewModel3 = this.this$0;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = listAhwBna.iterator();
                    callMembersViewModel2 = callMembersViewModel3;
                    str2 = str;
                    collection2 = arrayList2;
                    it2 = it3;
                    if (it2.hasNext()) {
                    }
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it2 = (Iterator) this.L$4;
            collection2 = (Collection) this.L$3;
            callMembersViewModel2 = (CallMembersViewModel) this.L$2;
            list = (List) this.L$1;
            str2 = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
            C34282nYe c34282nYe3 = (C34282nYe) obj;
            if (c34282nYe3 != null) {
                collection2.add(c34282nYe3);
            }
            if (it2.hasNext()) {
                String str3 = (String) it2.next();
                this.L$0 = str2;
                this.L$1 = list;
                this.L$2 = callMembersViewModel2;
                this.L$3 = collection2;
                this.L$4 = it2;
                this.label = 2;
                obj = callMembersViewModel2.AEQbTJ(str2, str3, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                C34282nYe c34282nYe32 = (C34282nYe) obj;
                if (c34282nYe32 != null) {
                }
                if (it2.hasNext()) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : (List) collection2) {
                        C34282nYe c34282nYe4 = (C34282nYe) obj2;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it4 = list.iterator();
                            while (it4.hasNext()) {
                                if (Intrinsics.EZpvd((Object) ((C34282nYe) it4.next()).AhwBna(), (Object) c34282nYe4.AhwBna())) {
                                    break;
                                }
                            }
                        }
                        arrayList3.add(obj2);
                    }
                    return CollectionsKt___CollectionsKt.djBIcL((Collection) this.this$0.copydefault(list), (Iterable) this.this$0.copydefault(arrayList3));
                }
            }
        }
    }
}
