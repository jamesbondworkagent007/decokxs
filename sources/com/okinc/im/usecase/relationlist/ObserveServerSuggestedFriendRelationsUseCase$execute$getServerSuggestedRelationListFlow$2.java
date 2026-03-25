package com.okinc.im.usecase.relationlist;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.okimcore.model.biz.relationlocal.PhoneRelation;
import com.okinc.okimcore.model.biz.relationlocal.PhoneRelationGroup;
import com.okinc.okimcore.model.remote.RelationInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C35551nxW;
import o.C35873oGw;
import o.C37248oqJ;
import o.C56391yDq;
import o.C56403yEb;
import o.C56406yEe;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2 extends SuspendLambda implements Function2<List<? extends RelationInfo>, Continuation<? super Flow<? extends List<? extends C37248oqJ>>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C35873oGw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2(C35873oGw c35873oGw, Continuation<? super ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2> continuation) {
        super(2, continuation);
        this.this$0 = c35873oGw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2 observeServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2 = new ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2(this.this$0, continuation);
        observeServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2.L$0 = obj;
        return observeServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends RelationInfo> list, Continuation<? super Flow<? extends List<? extends C37248oqJ>>> continuation) {
        return invoke2((List<RelationInfo>) list, (Continuation<? super Flow<? extends List<C37248oqJ>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<RelationInfo> list, Continuation<? super Flow<? extends List<C37248oqJ>>> continuation) {
        return ((ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List list = (List) this.L$0;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String hash = ((RelationInfo) it.next()).getHash();
                if (hash != null) {
                    arrayList.add(hash);
                }
            }
            return new StateListAnimator(this.this$0.copydefault.KWHzl(CollectionsKt___CollectionsKt.OqFWZa(arrayList)), list);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static final class StateListAnimator implements Flow<List<? extends C37248oqJ>> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ List EZpvd;

        /* JADX INFO: renamed from: com.okinc.im.usecase.relationlist.ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2$StateListAnimator$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ List EZpvd;
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector, List list) {
                this.KWHzl = flowCollector;
                this.EZpvd = list;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2$invokeSuspend$$inlined$map$1$2$1 observeServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2$invokeSuspend$$inlined$map$1$2$1;
                T next;
                FlowCollector flowCollector;
                if (continuation instanceof ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2$invokeSuspend$$inlined$map$1$2$1) {
                    observeServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2$invokeSuspend$$inlined$map$1$2$1 = (ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i = observeServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        observeServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2$invokeSuspend$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        observeServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2$invokeSuspend$$inlined$map$1$2$1 = new ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object objKWHzl = observeServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2$invokeSuspend$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = observeServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2$invokeSuspend$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(objKWHzl);
                    FlowCollector flowCollector2 = this.KWHzl;
                    List list = (List) obj;
                    C35551nxW c35551nxW = C35551nxW.copydefault;
                    List<RelationInfo> list2 = this.EZpvd;
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list2, 10));
                    for (RelationInfo relationInfo : list2) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            C56406yEe.KWHzl(arrayList2, ((PhoneRelationGroup) it.next()).getLocalRelationList());
                        }
                        Iterator<T> it2 = arrayList2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it2.next();
                            if (Intrinsics.EZpvd((Object) ((PhoneRelation) next).getHash(), (Object) relationInfo.getHash())) {
                                break;
                            }
                        }
                        PhoneRelation phoneRelation = next;
                        String name = phoneRelation != null ? phoneRelation.getName() : null;
                        if (name == null) {
                            name = "";
                        }
                        String rawNumber = phoneRelation != null ? phoneRelation.getRawNumber() : null;
                        arrayList.add(new C37248oqJ(name, relationInfo.copy(((-50331649) & 1) != 0 ? relationInfo.contactsId : null, ((-50331649) & 2) != 0 ? relationInfo.avatar : null, ((-50331649) & 4) != 0 ? relationInfo.nickName : null, ((-50331649) & 8) != 0 ? relationInfo.remarkName : null, ((-50331649) & 16) != 0 ? relationInfo.sign : null, ((-50331649) & 32) != 0 ? relationInfo.isBlackList : false, ((-50331649) & 64) != 0 ? relationInfo.isNoDisturb : false, ((-50331649) & 128) != 0 ? relationInfo.isTop : false, ((-50331649) & 256) != 0 ? relationInfo.isFriend : false, ((-50331649) & 512) != 0 ? relationInfo.isBothFriend : false, ((-50331649) & 1024) != 0 ? relationInfo.isCanChat : false, ((-50331649) & 2048) != 0 ? relationInfo.isCurrentUser : false, ((-50331649) & 4096) != 0 ? relationInfo.displayAlphabetText : null, ((-50331649) & 8192) != 0 ? relationInfo.officialTags : null, ((-50331649) & 16384) != 0 ? relationInfo.timestamp : 0L, ((-50331649) & 32768) != 0 ? relationInfo.isOpenKOL : false, (65536 & (-50331649)) != 0 ? relationInfo.kolUniqueName : null, ((-50331649) & 131072) != 0 ? relationInfo.enNickName : null, ((-50331649) & 262144) != 0 ? relationInfo.allowAddContact : null, ((-50331649) & 524288) != 0 ? relationInfo.isAllowSendMessage : null, ((-50331649) & 1048576) != 0 ? relationInfo.showVoiceCall : null, ((-50331649) & 2097152) != 0 ? relationInfo.showKycBanner : null, ((-50331649) & 4194304) != 0 ? relationInfo.relationSourceType : null, ((-50331649) & 8388608) != 0 ? relationInfo.hash : null, ((-50331649) & 16777216) != 0 ? relationInfo.phoneName : name, ((-50331649) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? relationInfo.phoneRawNumber : rawNumber == null ? "" : rawNumber, ((-50331649) & 67108864) != 0 ? relationInfo.isAllowSingleChatInGroup : null, ((-50331649) & 134217728) != 0 ? relationInfo.showUnknownContactBanner : null, ((-50331649) & 268435456) != 0 ? relationInfo.allowVoice : null, ((-50331649) & 536870912) != 0 ? relationInfo.allowFile : null, ((-50331649) & 1073741824) != 0 ? relationInfo.allowPlanetProfile : null, ((-50331649) & Integer.MIN_VALUE) != 0 ? relationInfo.orbitBackgroundImage : null, (63 & 1) != 0 ? relationInfo.orbitStatus : null, (63 & 2) != 0 ? relationInfo.allowBlockUser : null, (63 & 4) != 0 ? relationInfo.showVipPerformanceDetails : null, (63 & 8) != 0 ? relationInfo.allowRemoveGroupMember : null, (63 & 16) != 0 ? relationInfo.customNote : null, (63 & 32) != 0 ? relationInfo.isAllowPay : null)));
                    }
                    observeServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2$invokeSuspend$$inlined$map$1$2$1.L$0 = flowCollector2;
                    observeServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    objKWHzl = c35551nxW.KWHzl(arrayList, observeServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2$invokeSuspend$$inlined$map$1$2$1);
                    flowCollector = flowCollector2;
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(objKWHzl);
                        return Unit.INSTANCE;
                    }
                    FlowCollector flowCollector3 = (FlowCollector) observeServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2$invokeSuspend$$inlined$map$1$2$1.L$0;
                    C56391yDq.AEQbTJ(objKWHzl);
                    flowCollector = flowCollector3;
                }
                observeServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                observeServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2$invokeSuspend$$inlined$map$1$2$1.label = 2;
                if (flowCollector.emit(objKWHzl, observeServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2$invokeSuspend$$inlined$map$1$2$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        }

        public StateListAnimator(Flow flow, List list) {
            this.AEQbTJ = flow;
            this.EZpvd = list;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super List<? extends C37248oqJ>> flowCollector, Continuation continuation) {
            Object objCollect = this.AEQbTJ.collect(new AnonymousClass1(flowCollector, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
