package o;

import com.google.gson.Gson;
import com.okinc.business.defi.biz.database.wallet.WalletDatabase;
import com.okinc.business.defi.biz.database.wallet.entity.KVEntity;
import java.util.concurrent.Callable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cPO {
    public InterfaceC11342cKr copydefault;

    public cPO(@NotNull android.app.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.copydefault = WalletDatabase.Companion.OLrzqt(application).fFgQHt();
    }

    public final AbstractC58260yxt<java.lang.Long> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return KWHzl(str, (java.lang.Object) str2);
    }

    public final AbstractC58260yxt<java.lang.Long> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return copydefault(str, str2);
    }

    public static /* synthetic */ AbstractC58260yxt booleanForKeyInCallThread$default(cPO cpo, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return cpo.KWHzl(str, z);
    }

    public final AbstractC58260yxt<java.lang.Boolean> KWHzl(@NotNull final java.lang.String str, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cPX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cPO.KWHzl(this.EZpvd, str, z);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.lang.Boolean KWHzl(cPO cpo, java.lang.String str, boolean z) {
        java.util.List<java.lang.String> listAEQbTJ = cpo.copydefault.AEQbTJ(str);
        if (!listAEQbTJ.isEmpty()) {
            z = java.lang.Boolean.parseBoolean((java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(listAEQbTJ)) || C33129mqd.OLrzqt(CollectionsKt___CollectionsKt.AuCTelauCTel(listAEQbTJ), "\"true\"");
        }
        return java.lang.Boolean.valueOf(z);
    }

    public static /* synthetic */ AbstractC58260yxt booleanForKey$default(cPO cpo, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return cpo.EZpvd(str, z);
    }

    public final AbstractC58260yxt<java.lang.Boolean> EZpvd(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return C11607cUn.valueOf(KWHzl(str, z));
    }

    public final AbstractC58260yxt<java.lang.Long> AEQbTJ(@NotNull final java.lang.String str, final long j) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cPQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cPO.EZpvd(this.EZpvd, str, j);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Long EZpvd(cPO cpo, java.lang.String str, long j) {
        java.util.List<java.lang.String> listAEQbTJ = cpo.copydefault.AEQbTJ(str);
        if (!listAEQbTJ.isEmpty()) {
            j = java.lang.Long.parseLong((java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(listAEQbTJ));
        }
        return java.lang.Long.valueOf(j);
    }

    public final AbstractC58260yxt<java.lang.Long> EZpvd(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return copydefault(str, java.lang.Long.valueOf(j));
    }

    public final AbstractC58260yxt<java.lang.Long> KWHzl(java.lang.String str, java.lang.Object obj) {
        final KVEntity kVEntity;
        if (obj instanceof java.lang.String) {
            kVEntity = new KVEntity(str, (java.lang.String) obj);
        } else {
            java.lang.String json = new Gson().toJson(C33490mxT.copydefault(obj));
            Intrinsics.checkNotNullExpressionValue(json, "");
            kVEntity = new KVEntity(str, json);
        }
        AbstractC58260yxt<java.lang.Long> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cPR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cPO.copydefault(this.EZpvd, kVEntity);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.lang.Long copydefault(cPO cpo, KVEntity kVEntity) {
        return java.lang.Long.valueOf(cpo.copydefault.OLrzqt(kVEntity));
    }

    public final AbstractC58260yxt<java.lang.Long> copydefault(java.lang.String str, java.lang.Object obj) {
        return C11607cUn.valueOf(KWHzl(str, obj));
    }
}
