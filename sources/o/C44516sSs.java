package o;

import com.okinc.okimcore.model.biz.relationlocal.OsPhoneRelation;
import com.okinc.okimcore.model.room.inhouseim.PhoneRelationEntity;
import com.okinc.okimcore.model.room.inhouseim.PhoneRelationUpdateEntity;
import com.okinc.okimcore.usecase.phonerelations.InsertPhoneRelationsUseCase$execute$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sSs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44516sSs {
    public final C44358sMw EZpvd;

    @yCM
    public C44516sSs(@NotNull C44358sMw c44358sMw) {
        Intrinsics.checkNotNullParameter(c44358sMw, "");
        this.EZpvd = c44358sMw;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.util.List<OsPhoneRelation> list, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        InsertPhoneRelationsUseCase$execute$1 insertPhoneRelationsUseCase$execute$1;
        java.util.List<PhoneRelationEntity> arrayList;
        C44516sSs c44516sSs;
        if (continuation instanceof InsertPhoneRelationsUseCase$execute$1) {
            insertPhoneRelationsUseCase$execute$1 = (InsertPhoneRelationsUseCase$execute$1) continuation;
            int i = insertPhoneRelationsUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                insertPhoneRelationsUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                insertPhoneRelationsUseCase$execute$1 = new InsertPhoneRelationsUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object obj = insertPhoneRelationsUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = insertPhoneRelationsUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            arrayList = new java.util.ArrayList<>(C56403yEb.AYXKKw(list, 10));
            for (OsPhoneRelation osPhoneRelation : list) {
                arrayList.add(new PhoneRelationEntity(sFC.EZpvd(osPhoneRelation.getNationalNumber()), osPhoneRelation.getRowId(), osPhoneRelation.getCountryCode(), false, osPhoneRelation.getContactId(), null, osPhoneRelation.getName(), osPhoneRelation.getRawNumber(), osPhoneRelation.getNationalNumber()));
            }
            C44358sMw c44358sMw = this.EZpvd;
            insertPhoneRelationsUseCase$execute$1.L$0 = this;
            insertPhoneRelationsUseCase$execute$1.L$1 = arrayList;
            insertPhoneRelationsUseCase$execute$1.label = 1;
            if (c44358sMw.insertAllOrIgnore(arrayList, insertPhoneRelationsUseCase$execute$1) == objCopydefault) {
                return objCopydefault;
            }
            c44516sSs = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            arrayList = (java.util.List) insertPhoneRelationsUseCase$execute$1.L$1;
            c44516sSs = (C44516sSs) insertPhoneRelationsUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (PhoneRelationEntity phoneRelationEntity : arrayList) {
            arrayList2.add(new PhoneRelationUpdateEntity(phoneRelationEntity.getHash(), phoneRelationEntity.getRowId(), phoneRelationEntity.getCountryCode(), phoneRelationEntity.getPhoneRelationId(), phoneRelationEntity.getName(), phoneRelationEntity.getRawNumber(), phoneRelationEntity.getNationalNumber()));
        }
        C44358sMw c44358sMw2 = c44516sSs.EZpvd;
        insertPhoneRelationsUseCase$execute$1.L$0 = null;
        insertPhoneRelationsUseCase$execute$1.L$1 = null;
        insertPhoneRelationsUseCase$execute$1.label = 2;
        if (c44358sMw2.updateAll(arrayList2, insertPhoneRelationsUseCase$execute$1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
