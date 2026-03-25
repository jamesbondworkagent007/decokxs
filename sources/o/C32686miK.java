package o;

import com.okinc.components.security.scanner.AppHash;
import com.okinc.components.security.scanner.SecurityAppsReq;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC32692miQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.miK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C32686miK {
    public final InterfaceC32692miQ AEQbTJ() {
        return InterfaceC32692miQ.Companion.EZpvd();
    }

    public static final ResponseData OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.miQ.Activity.hashVerifyV2$default(o.miQ, com.okinc.components.security.scanner.SecurityAppsReq, java.lang.String, java.lang.String, int, java.lang.Object):o.ywX */
    public final AbstractC58185ywX<ResponseData<java.util.List<AppHash>>> OLrzqt(@NotNull SecurityAppsReq securityAppsReq) {
        Intrinsics.checkNotNullParameter(securityAppsReq, "");
        AbstractC58185ywX abstractC58185ywXHashVerifyV2$default = InterfaceC32692miQ.Activity.hashVerifyV2$default(AEQbTJ(), securityAppsReq, null, null, 6, null);
        final Function1 function1 = new Function1() { // from class: o.miO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32686miK.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.util.List<AppHash>>> abstractC58185ywXDjBIcL = abstractC58185ywXHashVerifyV2$default.djBIcL(new InterfaceC58229yxO() { // from class: o.miN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C32686miK.OLrzqt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXDjBIcL, "");
        return abstractC58185ywXDjBIcL;
    }

    public static final ResponseData AEQbTJ(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return new ResponseData(0, null, null, null, null, null, 47, null);
    }
}
