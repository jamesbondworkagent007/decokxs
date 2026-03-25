package o;

import com.huawei.hms.framework.common.ContainerUtils;
import com.okinc.core.util.ScannerActivity;
import com.okinc.core.util.qrcode.decode.ScanType;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fNf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17651fNf extends AbstractC43215rlA implements InterfaceC33530myG {
    @Override // o.InterfaceC33530myG
    public ScanType KWHzl() {
        return ScanType.CE_DEFI_DEX_TRADE;
    }

    @Override // o.InterfaceC33530myG
    public boolean copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        return C59449zhJ.startsWith$default(str, "okx_passkey_wallet:scan_passkey", false, 2, null);
    }

    @Override // o.InterfaceC33530myG
    public void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = copydefault(str).get("chain_index");
        if (str2 == null) {
            return;
        }
        ScannerActivity scannerActivity = context instanceof ScannerActivity ? (ScannerActivity) context : null;
        if (scannerActivity != null) {
            scannerActivity.finish();
        }
        fMF.Companion.KWHzl(context, str2);
    }

    public final java.util.Map<java.lang.String, java.lang.String> copydefault(java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"?"}, false, 0, 6, (java.lang.Object) null).get(1), new java.lang.String[]{ContainerUtils.FIELD_DELIMITER}, false, 0, 6, (java.lang.Object) null);
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listSplit$default, 10)), 16));
            java.util.Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                java.util.List listSplit$default2 = StringsKt__StringsKt.split$default((java.lang.CharSequence) it.next(), new java.lang.String[]{ContainerUtils.KEY_VALUE_DELIMITER}, false, 0, 6, (java.lang.Object) null);
                kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(listSplit$default2.get(0), listSplit$default2.get(1));
                linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
            }
            objM7377constructorimpl = Result.m7377constructorimpl(linkedHashMap);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            objM7377constructorimpl = C56424yEw.KWHzl();
        }
        return (java.util.Map) objM7377constructorimpl;
    }
}
