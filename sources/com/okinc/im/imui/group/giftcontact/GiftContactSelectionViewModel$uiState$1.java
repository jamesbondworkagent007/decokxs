package com.okinc.im.imui.group.giftcontact;

import com.okinc.okimcore.model.other.GroupMemberInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.StringsKt__StringsKt;
import o.C44157sFk;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class GiftContactSelectionViewModel$uiState$1 extends SuspendLambda implements yHO<List<? extends GroupMemberInfo>, String, Continuation<? super List<? extends GroupMemberInfo>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GiftContactSelectionViewModel$uiState$1(Continuation<? super GiftContactSelectionViewModel$uiState$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(List<? extends GroupMemberInfo> list, String str, Continuation<? super List<? extends GroupMemberInfo>> continuation) {
        return invoke2((List<GroupMemberInfo>) list, str, (Continuation<? super List<GroupMemberInfo>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<GroupMemberInfo> list, String str, Continuation<? super List<GroupMemberInfo>> continuation) {
        GiftContactSelectionViewModel$uiState$1 giftContactSelectionViewModel$uiState$1 = new GiftContactSelectionViewModel$uiState$1(continuation);
        giftContactSelectionViewModel$uiState$1.L$0 = list;
        giftContactSelectionViewModel$uiState$1.L$1 = str;
        return giftContactSelectionViewModel$uiState$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List list = (List) this.L$0;
            String str = (String) this.L$1;
            if (str == null || str.length() == 0) {
                return list;
            }
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (StringsKt__StringsKt.AhwBna((CharSequence) C44157sFk.EZpvd((GroupMemberInfo) obj2), (CharSequence) str, true)) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
