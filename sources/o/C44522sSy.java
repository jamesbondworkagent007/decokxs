package o;

import com.okinc.okimcore.model.room.inhouseim.PhoneRelationEntity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sSy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44522sSy {
    public final C44358sMw EZpvd;

    @yCM
    public C44522sSy(@NotNull C44358sMw c44358sMw) {
        Intrinsics.checkNotNullParameter(c44358sMw, "");
        this.EZpvd = c44358sMw;
    }

    public final java.lang.Object OLrzqt(@NotNull java.util.List<PhoneRelationEntity> list, @NotNull java.util.List<java.lang.String> list2, @NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        if (!(!list.isEmpty())) {
            throw new java.lang.IllegalArgumentException("no phone relations".toString());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (PhoneRelationEntity phoneRelationEntity : list) {
            arrayList.add(phoneRelationEntity.copy((479 & 1) != 0 ? phoneRelationEntity.hash : null, (479 & 2) != 0 ? phoneRelationEntity.rowId : null, (479 & 4) != 0 ? phoneRelationEntity.countryCode : null, (479 & 8) != 0 ? phoneRelationEntity.isSynced : !list2.contains(phoneRelationEntity.getHash()), (479 & 16) != 0 ? phoneRelationEntity.phoneRelationId : null, (479 & 32) != 0 ? phoneRelationEntity.okxRelationId : null, (479 & 64) != 0 ? phoneRelationEntity.name : null, (479 & 128) != 0 ? phoneRelationEntity.rawNumber : null, (479 & 256) != 0 ? phoneRelationEntity.nationalNumber : null));
        }
        java.lang.Object objInsertAllOrReplace = this.EZpvd.insertAllOrReplace(arrayList, continuation);
        return objInsertAllOrReplace == C56442yFn.copydefault() ? objInsertAllOrReplace : Unit.INSTANCE;
    }
}
