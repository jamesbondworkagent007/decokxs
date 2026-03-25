package com.okinc.im.imui.group.create.viewmodel;

import com.okinc.im.imui.group.create.model.CreateGroupDisplayItem;
import com.okinc.okimcore.model.biz.relationlocal.PhoneRelationGroup;
import com.okinc.okimcore.model.remote.RelationInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35551nxW;
import o.C35864oGn;
import o.C44124sEe;
import o.C44157sFk;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.sKN;
import o.yED;

/* JADX INFO: loaded from: classes8.dex */
public final class CreateGroupViewModel$toMemberList$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends CreateGroupDisplayItem.MemberItem>>, Object> {
    final /* synthetic */ List<String> $this_toMemberList;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ CreateGroupViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateGroupViewModel$toMemberList$2$1(List<String> list, CreateGroupViewModel createGroupViewModel, Continuation<? super CreateGroupViewModel$toMemberList$2$1> continuation) {
        super(2, continuation);
        this.$this_toMemberList = list;
        this.this$0 = createGroupViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateGroupViewModel$toMemberList$2$1(this.$this_toMemberList, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends CreateGroupDisplayItem.MemberItem>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<CreateGroupDisplayItem.MemberItem>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<CreateGroupDisplayItem.MemberItem>> continuation) {
        return ((CreateGroupViewModel$toMemberList$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [281=4] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x008b -> B:18:0x008e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0106 -> B:36:0x0109). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CreateGroupViewModel createGroupViewModel;
        Collection arrayList;
        Iterator it;
        Iterator it2;
        CreateGroupViewModel createGroupViewModel2;
        Collection collection;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(this.$this_toMemberList);
            createGroupViewModel = this.this$0;
            arrayList = new ArrayList();
            it = setOqFWZa.iterator();
            if (it.hasNext()) {
            }
        } else if (i == 1) {
            String str = (String) this.L$3;
            it = (Iterator) this.L$2;
            arrayList = (Collection) this.L$1;
            createGroupViewModel = (CreateGroupViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            RelationInfo relationInfo = (RelationInfo) obj;
            if (relationInfo == null) {
                C44124sEe.imLogGroup$default("Failed to get relation info for memberId: " + str, null, 2, null);
            }
            if (relationInfo != null) {
                arrayList.add(relationInfo);
            }
            if (it.hasNext()) {
                str = (String) it.next();
                C35864oGn c35864oGn = createGroupViewModel.ejfBZ;
                this.L$0 = createGroupViewModel;
                this.L$1 = arrayList;
                this.L$2 = it;
                this.L$3 = str;
                this.label = 1;
                obj = c35864oGn.AEQbTJ(str, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                RelationInfo relationInfo2 = (RelationInfo) obj;
                if (relationInfo2 == null) {
                }
                if (relationInfo2 != null) {
                }
                if (it.hasNext()) {
                    C35551nxW c35551nxW = C35551nxW.copydefault;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 2;
                    obj = c35551nxW.EZpvd((List) arrayList, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    Iterable iterable = (Iterable) obj;
                    CreateGroupViewModel createGroupViewModel3 = this.this$0;
                    ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
                    it2 = iterable.iterator();
                    createGroupViewModel2 = createGroupViewModel3;
                    collection = arrayList2;
                    if (!it2.hasNext()) {
                    }
                }
            }
        } else if (i == 2) {
            C56391yDq.AEQbTJ(obj);
            Iterable iterable2 = (Iterable) obj;
            CreateGroupViewModel createGroupViewModel32 = this.this$0;
            ArrayList arrayList22 = new ArrayList(C56403yEb.AYXKKw(iterable2, 10));
            it2 = iterable2.iterator();
            createGroupViewModel2 = createGroupViewModel32;
            collection = arrayList22;
            if (!it2.hasNext()) {
            }
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Collection collection2 = (Collection) this.L$4;
            RelationInfo relationInfo3 = (RelationInfo) this.L$3;
            Iterator it3 = (Iterator) this.L$2;
            Collection collection3 = (Collection) this.L$1;
            createGroupViewModel2 = (CreateGroupViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            Collection collection4 = collection2;
            collection = collection3;
            Iterator it4 = it3;
            RelationInfo relationInfo4 = relationInfo3;
            PhoneRelationGroup phoneRelationGroup = (PhoneRelationGroup) CollectionsKt___CollectionsKt.firstOrNull((List) obj);
            String displayName = phoneRelationGroup == null ? phoneRelationGroup.getDisplayName() : null;
            if (displayName == null) {
                displayName = "";
            }
            collection4.add(new CreateGroupDisplayItem.MemberItem(relationInfo4, C44157sFk.getDisplayName$default(relationInfo4, null, 1, null), displayName));
            it2 = it4;
            if (!it2.hasNext()) {
                RelationInfo relationInfo5 = (RelationInfo) it2.next();
                sKN skn = createGroupViewModel2.fJNWhG;
                String hash = relationInfo5.getHash();
                if (hash == null) {
                    hash = "";
                }
                Set<String> setAEQbTJ = yED.AEQbTJ(hash);
                this.L$0 = createGroupViewModel2;
                this.L$1 = collection;
                this.L$2 = it2;
                this.L$3 = relationInfo5;
                this.L$4 = collection;
                this.label = 3;
                obj = skn.AEQbTJ(setAEQbTJ, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                it4 = it2;
                relationInfo4 = relationInfo5;
                collection4 = collection;
                PhoneRelationGroup phoneRelationGroup2 = (PhoneRelationGroup) CollectionsKt___CollectionsKt.firstOrNull((List) obj);
                if (phoneRelationGroup2 == null) {
                }
                if (displayName == null) {
                }
                collection4.add(new CreateGroupDisplayItem.MemberItem(relationInfo4, C44157sFk.getDisplayName$default(relationInfo4, null, 1, null), displayName));
                it2 = it4;
                if (!it2.hasNext()) {
                    return (List) collection;
                }
            }
        }
    }
}
