package o;

import com.okinc.okimcore.model.biz.relationlocal.OsPhoneRelation;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sSx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44521sSx {
    public final C44358sMw OLrzqt;

    @yCM
    public C44521sSx(@NotNull C44358sMw c44358sMw) {
        Intrinsics.checkNotNullParameter(c44358sMw, "");
        this.OLrzqt = c44358sMw;
    }

    public final java.lang.Object EZpvd(@NotNull java.util.List<OsPhoneRelation> list, @NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        if (list.isEmpty()) {
            java.lang.Object objDeleteAll = this.OLrzqt.deleteAll(continuation);
            return objDeleteAll == C56442yFn.copydefault() ? objDeleteAll : Unit.INSTANCE;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(sFC.EZpvd(((OsPhoneRelation) it.next()).getNationalNumber()));
        }
        java.lang.Object objDeleteAllNotInHashes = this.OLrzqt.deleteAllNotInHashes(CollectionsKt___CollectionsKt.OqFWZa(arrayList), continuation);
        return objDeleteAllNotInHashes == C56442yFn.copydefault() ? objDeleteAllNotInHashes : Unit.INSTANCE;
    }
}
