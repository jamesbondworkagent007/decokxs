package o;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.network.okg.cache.CacheStrategy;
import com.okinc.okimcore.feature.contact.suggested.GetSuggestedContactsUseCase$execute$$inlined$map$1$2$1;
import com.okinc.okimcore.feature.contact.suggested.GetSuggestedContactsUseCase$execute$1;
import com.okinc.okimcore.model.biz.relationlocal.PhoneRelation;
import com.okinc.okimcore.model.biz.relationlocal.PhoneRelationGroup;
import com.okinc.okimcore.model.remote.RelationInfo;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sGy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44198sGy {
    public final sKN KWHzl;
    public final InterfaceC44177sGd copydefault;

    @yCM
    public C44198sGy(@NotNull InterfaceC44177sGd interfaceC44177sGd, @NotNull sKN skn) {
        Intrinsics.checkNotNullParameter(interfaceC44177sGd, "");
        Intrinsics.checkNotNullParameter(skn, "");
        this.copydefault = interfaceC44177sGd;
        this.KWHzl = skn;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super Flow<? extends java.util.List<RelationInfo>>> continuation) throws java.lang.Throwable {
        GetSuggestedContactsUseCase$execute$1 getSuggestedContactsUseCase$execute$1;
        CacheStrategy cacheStrategy;
        C44198sGy c44198sGy;
        if (continuation instanceof GetSuggestedContactsUseCase$execute$1) {
            getSuggestedContactsUseCase$execute$1 = (GetSuggestedContactsUseCase$execute$1) continuation;
            int i = getSuggestedContactsUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSuggestedContactsUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                getSuggestedContactsUseCase$execute$1 = new GetSuggestedContactsUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = getSuggestedContactsUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getSuggestedContactsUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            if (C33129mqd.AhwBna(sGG.copydefault.copydefault()) < sEI.KWHzl.copydefault()) {
                cacheStrategy = CacheStrategy.NO_CACHE;
            } else {
                cacheStrategy = CacheStrategy.FIRST_CACHE;
            }
            InterfaceC44177sGd interfaceC44177sGd = this.copydefault;
            getSuggestedContactsUseCase$execute$1.L$0 = this;
            getSuggestedContactsUseCase$execute$1.label = 1;
            objOLrzqt = interfaceC44177sGd.OLrzqt(cacheStrategy, getSuggestedContactsUseCase$execute$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c44198sGy = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c44198sGy = (C44198sGy) getSuggestedContactsUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        java.util.List list = (java.util.List) objOLrzqt;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String hash = ((RelationInfo) it.next()).getHash();
            if (hash != null) {
                arrayList.add(hash);
            }
        }
        return new ActionBar(c44198sGy.KWHzl.KWHzl(CollectionsKt___CollectionsKt.OqFWZa(arrayList)), list);
    }

    /* JADX INFO: renamed from: o.sGy$Application */
    public static final class Application<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(C44157sFk.getDisplayName$default((RelationInfo) t, null, 1, null), C44157sFk.getDisplayName$default((RelationInfo) t2, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: o.sGy$ActionBar */
    public static final class ActionBar implements Flow<java.util.List<? extends RelationInfo>> {
        public final /* synthetic */ java.util.List AEQbTJ;
        public final /* synthetic */ Flow copydefault;

        public ActionBar(Flow flow, java.util.List list) {
            this.copydefault = flow;
            this.AEQbTJ = list;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(@NotNull FlowCollector<? super java.util.List<? extends RelationInfo>> flowCollector, @NotNull Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass1(flowCollector, this.AEQbTJ), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.sGy$ActionBar$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ java.util.List EZpvd;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector, java.util.List list) {
                this.copydefault = flowCollector;
                this.EZpvd = list;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, @NotNull Continuation continuation) throws java.lang.Throwable {
                GetSuggestedContactsUseCase$execute$$inlined$map$1$2$1 getSuggestedContactsUseCase$execute$$inlined$map$1$2$1;
                if (continuation instanceof GetSuggestedContactsUseCase$execute$$inlined$map$1$2$1) {
                    getSuggestedContactsUseCase$execute$$inlined$map$1$2$1 = (GetSuggestedContactsUseCase$execute$$inlined$map$1$2$1) continuation;
                    int i = getSuggestedContactsUseCase$execute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        getSuggestedContactsUseCase$execute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        getSuggestedContactsUseCase$execute$$inlined$map$1$2$1 = new GetSuggestedContactsUseCase$execute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = getSuggestedContactsUseCase$execute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = getSuggestedContactsUseCase$execute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator<T> it = ((java.util.List) obj).iterator();
                    while (it.hasNext()) {
                        C56406yEe.KWHzl(arrayList, ((PhoneRelationGroup) it.next()).getLocalRelationList());
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList, 10)), 16));
                    for (T t : arrayList) {
                        linkedHashMap.put(((PhoneRelation) t).getHash(), t);
                    }
                    java.util.List<RelationInfo> list = this.EZpvd;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                    for (RelationInfo relationInfo : list) {
                        PhoneRelation phoneRelation = (PhoneRelation) linkedHashMap.get(relationInfo.getHash());
                        java.lang.String name = phoneRelation != null ? phoneRelation.getName() : null;
                        java.lang.String str = name == null ? "" : name;
                        java.lang.String rawNumber = phoneRelation != null ? phoneRelation.getRawNumber() : null;
                        arrayList2.add(relationInfo.copy(((-50331649) & 1) != 0 ? relationInfo.contactsId : null, ((-50331649) & 2) != 0 ? relationInfo.avatar : null, ((-50331649) & 4) != 0 ? relationInfo.nickName : null, ((-50331649) & 8) != 0 ? relationInfo.remarkName : null, ((-50331649) & 16) != 0 ? relationInfo.sign : null, ((-50331649) & 32) != 0 ? relationInfo.isBlackList : false, ((-50331649) & 64) != 0 ? relationInfo.isNoDisturb : false, ((-50331649) & 128) != 0 ? relationInfo.isTop : false, ((-50331649) & 256) != 0 ? relationInfo.isFriend : false, ((-50331649) & 512) != 0 ? relationInfo.isBothFriend : false, ((-50331649) & 1024) != 0 ? relationInfo.isCanChat : false, ((-50331649) & 2048) != 0 ? relationInfo.isCurrentUser : false, ((-50331649) & 4096) != 0 ? relationInfo.displayAlphabetText : null, ((-50331649) & 8192) != 0 ? relationInfo.officialTags : null, ((-50331649) & 16384) != 0 ? relationInfo.timestamp : 0L, ((-50331649) & 32768) != 0 ? relationInfo.isOpenKOL : false, (65536 & (-50331649)) != 0 ? relationInfo.kolUniqueName : null, ((-50331649) & 131072) != 0 ? relationInfo.enNickName : null, ((-50331649) & 262144) != 0 ? relationInfo.allowAddContact : null, ((-50331649) & 524288) != 0 ? relationInfo.isAllowSendMessage : null, ((-50331649) & 1048576) != 0 ? relationInfo.showVoiceCall : null, ((-50331649) & 2097152) != 0 ? relationInfo.showKycBanner : null, ((-50331649) & 4194304) != 0 ? relationInfo.relationSourceType : null, ((-50331649) & 8388608) != 0 ? relationInfo.hash : null, ((-50331649) & 16777216) != 0 ? relationInfo.phoneName : str, ((-50331649) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? relationInfo.phoneRawNumber : rawNumber == null ? "" : rawNumber, ((-50331649) & 67108864) != 0 ? relationInfo.isAllowSingleChatInGroup : null, ((-50331649) & 134217728) != 0 ? relationInfo.showUnknownContactBanner : null, ((-50331649) & 268435456) != 0 ? relationInfo.allowVoice : null, ((-50331649) & 536870912) != 0 ? relationInfo.allowFile : null, ((-50331649) & 1073741824) != 0 ? relationInfo.allowPlanetProfile : null, ((-50331649) & Integer.MIN_VALUE) != 0 ? relationInfo.orbitBackgroundImage : null, (63 & 1) != 0 ? relationInfo.orbitStatus : null, (63 & 2) != 0 ? relationInfo.allowBlockUser : null, (63 & 4) != 0 ? relationInfo.showVipPerformanceDetails : null, (63 & 8) != 0 ? relationInfo.allowRemoveGroupMember : null, (63 & 16) != 0 ? relationInfo.customNote : null, (63 & 32) != 0 ? relationInfo.isAllowPay : null));
                    }
                    java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList2, new Application());
                    getSuggestedContactsUseCase$execute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(listEZpvd, getSuggestedContactsUseCase$execute$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }
    }
}
