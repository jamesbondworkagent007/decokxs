package o;

import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import com.okinc.okimcore.usecase.messages.SearchGroupUseCase$invoke$1;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sSj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44507sSj {
    public final C44484sRn EZpvd;

    @yCM
    public C44507sSj(@NotNull C44484sRn c44484sRn) {
        Intrinsics.checkNotNullParameter(c44484sRn, "");
        this.EZpvd = c44484sRn;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull sKR skr, @NotNull Continuation<? super java.util.List<InHouseIMConversationEntity>> continuation) throws java.lang.Exception {
        SearchGroupUseCase$invoke$1 searchGroupUseCase$invoke$1;
        if (continuation instanceof SearchGroupUseCase$invoke$1) {
            searchGroupUseCase$invoke$1 = (SearchGroupUseCase$invoke$1) continuation;
            int i = searchGroupUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchGroupUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                searchGroupUseCase$invoke$1 = new SearchGroupUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = searchGroupUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = searchGroupUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            C44484sRn c44484sRn = this.EZpvd;
            java.lang.String strEZpvd = skr.EZpvd();
            java.lang.Integer numCopydefault = skr.copydefault();
            searchGroupUseCase$invoke$1.L$0 = skr;
            searchGroupUseCase$invoke$1.label = 1;
            objOLrzqt = c44484sRn.OLrzqt(strEZpvd, numCopydefault, searchGroupUseCase$invoke$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            skr = (sKR) searchGroupUseCase$invoke$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        java.util.List list = (java.util.List) objOLrzqt;
        return skr.copydefault() == null ? list : CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) list, skr.copydefault().intValue());
    }
}
