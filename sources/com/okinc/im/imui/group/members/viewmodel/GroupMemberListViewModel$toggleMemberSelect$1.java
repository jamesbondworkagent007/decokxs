package com.okinc.im.imui.group.members.viewmodel;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C34282nYe;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupMemberListViewModel$toggleMemberSelect$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ String $memberId;
    int label;
    final /* synthetic */ GroupMemberListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupMemberListViewModel$toggleMemberSelect$1(GroupMemberListViewModel groupMemberListViewModel, String str, boolean z, Continuation<? super GroupMemberListViewModel$toggleMemberSelect$1> continuation) {
        super(2, continuation);
        this.this$0 = groupMemberListViewModel;
        this.$memberId = str;
        this.$isSelected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupMemberListViewModel$toggleMemberSelect$1(this.this$0, this.$memberId, this.$isSelected, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupMemberListViewModel$toggleMemberSelect$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        ArrayList arrayList;
        Object obj2;
        boolean z2;
        Object obj3;
        ArrayList arrayList2;
        C34282nYe c34282nYeEZpvd;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow = this.this$0.OLrzqt;
            String str = this.$memberId;
            boolean z3 = this.$isSelected;
            while (true) {
                Object value = mutableStateFlow.getValue();
                List<C34282nYe> list = (List) value;
                if (list != null) {
                    arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                    for (C34282nYe c34282nYe : list) {
                        if (Intrinsics.EZpvd((Object) c34282nYe.AhwBna(), (Object) str)) {
                            obj3 = value;
                            z2 = z3;
                            c34282nYeEZpvd = c34282nYe.EZpvd((61431 & 1) != 0 ? c34282nYe.DbNXlk : null, (61431 & 2) != 0 ? c34282nYe.gEmmrt : null, (61431 & 4) != 0 ? c34282nYe.AEQbTJ : null, (61431 & 8) != 0 ? c34282nYe.copydefault : null, (61431 & 16) != 0 ? c34282nYe.fetchVPNInfo : null, (61431 & 32) != 0 ? c34282nYe.isConnected : null, (61431 & 64) != 0 ? c34282nYe.EZpvd : null, (61431 & 128) != 0 ? c34282nYe.fIwbmz : null, (61431 & 256) != 0 ? c34282nYe.KWHzl : null, (61431 & 512) != 0 ? c34282nYe.OLrzqt : null, (61431 & 1024) != 0 ? c34282nYe.values : null, (61431 & 2048) != 0 ? c34282nYe.djBIcL : null, (61431 & 4096) != 0 ? c34282nYe.AkhnZx : null, (61431 & 8192) != 0 ? c34282nYe.AYXKKw : false, (61431 & 16384) != 0 ? c34282nYe.valueOf : z2, (61431 & 32768) != 0 ? c34282nYe.AhwBna : false);
                            arrayList2 = arrayList;
                        } else {
                            z2 = z3;
                            obj3 = value;
                            arrayList2 = arrayList;
                            c34282nYeEZpvd = c34282nYe;
                        }
                        arrayList2.add(c34282nYeEZpvd);
                        arrayList = arrayList2;
                        value = obj3;
                        z3 = z2;
                    }
                    z = z3;
                    obj2 = value;
                } else {
                    z = z3;
                    arrayList = null;
                    obj2 = value;
                }
                if (mutableStateFlow.compareAndSet(obj2, arrayList)) {
                    return Unit.INSTANCE;
                }
                z3 = z;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
