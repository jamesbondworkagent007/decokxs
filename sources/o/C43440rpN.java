package o;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rpN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43440rpN implements InterfaceC43234rlT {
    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull final android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull final java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.lang.Object objM7377constructorimpl;
        InterfaceC9773bbs interfaceC9773bbs;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.String strOLrzqt = interfaceC43233rlS.OLrzqt();
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) strOLrzqt, (java.lang.CharSequence) "nft/appmini", false, 2, (java.lang.Object) null)) {
            C7840arS.KWHzl("nft/appmini", new java.lang.Runnable() { // from class: o.rpL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C43440rpN.KWHzl(context, map);
                }
            }, 500L);
            return;
        }
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) strOLrzqt, (java.lang.CharSequence) "wallet/home/nft", false, 2, (java.lang.Object) null)) {
            C43514rqi.EZpvd.copydefault(context);
            return;
        }
        if (Intrinsics.EZpvd(map.get("jumpType"), (java.lang.Object) DevicePublicKeyStringDef.DIRECT) || Intrinsics.EZpvd(map.get("jumpType"), (java.lang.Object) "jump")) {
            C7840arS.KWHzl("deeplink", new java.lang.Runnable() { // from class: o.rpO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C43440rpN.OLrzqt(context, map);
                }
            }, 500L);
            return;
        }
        try {
            Result.Application application = Result.Companion;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("?");
            for (java.lang.String str : map.keySet()) {
                sb.append(str);
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append(map.get(str));
                sb.append(ContainerUtils.FIELD_DELIMITER);
            }
            java.lang.String str2 = interfaceC43233rlS.OLrzqt() + ((java.lang.Object) sb);
            java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9773bbs.class));
            if (listKWHzl != null && (interfaceC9773bbs = (InterfaceC9773bbs) CollectionsKt___CollectionsKt.AuCTelauCTel(listKWHzl)) != null) {
                interfaceC9773bbs.KWHzl(str2);
            }
            C7840arS.KWHzl("deeplink", new java.lang.Runnable() { // from class: o.rpP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C43440rpN.valueOf(context, map);
                }
            }, 500L);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Result.m7376boximpl(objM7377constructorimpl);
    }

    public static final void KWHzl(android.content.Context context, java.util.Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("jumpType", "jump");
        linkedHashMap.putAll(map);
        C43514rqi.EZpvd.copydefault(context, linkedHashMap);
    }

    public static final void OLrzqt(android.content.Context context, java.util.Map map) {
        C43514rqi.EZpvd.copydefault(context, map);
    }

    public static final void valueOf(android.content.Context context, java.util.Map map) {
        C43514rqi.EZpvd.copydefault(context, map);
    }
}
