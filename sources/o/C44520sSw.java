package o;

import com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity;
import com.okinc.okimcore.model.room.inhouseim.PhoneRelationEntity;
import com.okinc.okimcore.usecase.phonerelations.LinkOkxRelationsToRelevantPhoneRelationsUseCase$execute$1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sSw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44520sSw {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final C44358sMw OLrzqt;

    @yCM
    public C44520sSw(@NotNull C44358sMw c44358sMw) {
        Intrinsics.checkNotNullParameter(c44358sMw, "");
        this.OLrzqt = c44358sMw;
    }

    /* JADX INFO: renamed from: o.sSw$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sSw.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.util.List<InHouseIMContactInfoEntity> list, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        LinkOkxRelationsToRelevantPhoneRelationsUseCase$execute$1 linkOkxRelationsToRelevantPhoneRelationsUseCase$execute$1;
        C44520sSw c44520sSw;
        java.util.List<InHouseIMContactInfoEntity> list2;
        java.lang.Object next;
        if (continuation instanceof LinkOkxRelationsToRelevantPhoneRelationsUseCase$execute$1) {
            linkOkxRelationsToRelevantPhoneRelationsUseCase$execute$1 = (LinkOkxRelationsToRelevantPhoneRelationsUseCase$execute$1) continuation;
            int i = linkOkxRelationsToRelevantPhoneRelationsUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                linkOkxRelationsToRelevantPhoneRelationsUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                linkOkxRelationsToRelevantPhoneRelationsUseCase$execute$1 = new LinkOkxRelationsToRelevantPhoneRelationsUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object phoneRelationsNoOkxRelationByHashes = linkOkxRelationsToRelevantPhoneRelationsUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = linkOkxRelationsToRelevantPhoneRelationsUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(phoneRelationsNoOkxRelationByHashes);
            C44124sEe.copydefault("LinkOkxRelationsToRelevantPhoneRelationsUseCase", "okx relation size=" + list.size());
            if (!list.isEmpty()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    java.lang.String phoneHash = ((InHouseIMContactInfoEntity) it.next()).getPhoneHash();
                    if (phoneHash != null) {
                        arrayList.add(phoneHash);
                    }
                }
                java.util.Set<java.lang.String> setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
                C44358sMw c44358sMw = this.OLrzqt;
                linkOkxRelationsToRelevantPhoneRelationsUseCase$execute$1.L$0 = this;
                linkOkxRelationsToRelevantPhoneRelationsUseCase$execute$1.L$1 = list;
                linkOkxRelationsToRelevantPhoneRelationsUseCase$execute$1.label = 1;
                phoneRelationsNoOkxRelationByHashes = c44358sMw.getPhoneRelationsNoOkxRelationByHashes(setOqFWZa, linkOkxRelationsToRelevantPhoneRelationsUseCase$execute$1);
                if (phoneRelationsNoOkxRelationByHashes == objCopydefault) {
                    return objCopydefault;
                }
                c44520sSw = this;
                list2 = list;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(phoneRelationsNoOkxRelationByHashes);
            return Unit.INSTANCE;
        }
        list2 = (java.util.List) linkOkxRelationsToRelevantPhoneRelationsUseCase$execute$1.L$1;
        c44520sSw = (C44520sSw) linkOkxRelationsToRelevantPhoneRelationsUseCase$execute$1.L$0;
        C56391yDq.AEQbTJ(phoneRelationsNoOkxRelationByHashes);
        java.util.List list3 = (java.util.List) phoneRelationsNoOkxRelationByHashes;
        C44124sEe.copydefault("LinkOkxRelationsToRelevantPhoneRelationsUseCase", "phone relation size=" + list3.size());
        if (!list3.isEmpty()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it2 = list3.iterator();
            while (true) {
                PhoneRelationEntity phoneRelationEntityCopy = null;
                if (!it2.hasNext()) {
                    break;
                }
                PhoneRelationEntity phoneRelationEntity = (PhoneRelationEntity) it2.next();
                java.util.Iterator<T> it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((InHouseIMContactInfoEntity) next).getPhoneHash(), (java.lang.Object) phoneRelationEntity.getHash())) {
                        break;
                    }
                }
                InHouseIMContactInfoEntity inHouseIMContactInfoEntity = (InHouseIMContactInfoEntity) next;
                if (inHouseIMContactInfoEntity != null) {
                    phoneRelationEntityCopy = phoneRelationEntity.copy((479 & 1) != 0 ? phoneRelationEntity.hash : null, (479 & 2) != 0 ? phoneRelationEntity.rowId : null, (479 & 4) != 0 ? phoneRelationEntity.countryCode : null, (479 & 8) != 0 ? phoneRelationEntity.isSynced : false, (479 & 16) != 0 ? phoneRelationEntity.phoneRelationId : null, (479 & 32) != 0 ? phoneRelationEntity.okxRelationId : inHouseIMContactInfoEntity.getContactUid(), (479 & 64) != 0 ? phoneRelationEntity.name : null, (479 & 128) != 0 ? phoneRelationEntity.rawNumber : null, (479 & 256) != 0 ? phoneRelationEntity.nationalNumber : null);
                }
                if (phoneRelationEntityCopy != null) {
                    arrayList2.add(phoneRelationEntityCopy);
                }
            }
            C44124sEe.copydefault("LinkOkxRelationsToRelevantPhoneRelationsUseCase", "phone relations with okx relation id size=" + arrayList2.size());
            C44358sMw c44358sMw2 = c44520sSw.OLrzqt;
            linkOkxRelationsToRelevantPhoneRelationsUseCase$execute$1.L$0 = null;
            linkOkxRelationsToRelevantPhoneRelationsUseCase$execute$1.L$1 = null;
            linkOkxRelationsToRelevantPhoneRelationsUseCase$execute$1.label = 2;
            if (c44358sMw2.insertAllOrReplace(arrayList2, linkOkxRelationsToRelevantPhoneRelationsUseCase$execute$1) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
