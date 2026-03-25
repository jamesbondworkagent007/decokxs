package o;

import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.NewSignCallbackBean;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.api.bean.SignType;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.Permit2Data;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.loZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31148loZ {
    public static final void OLrzqt(@NotNull DeFiPlatformForSwap deFiPlatformForSwap, @NotNull android.app.Activity activity, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Function2<? super java.lang.Integer, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(deFiPlatformForSwap, "");
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Permit2Data permit2Data = deFiPlatformForSwap.getPermit2Data();
        KWHzl(activity, permit2Data != null ? permit2Data.getUnsignedTx() : null, deFiPlatformForSwap.getDefiPlatformId(), deFiPlatformForSwap.getName(), deFiPlatformForSwap.getLogo(), str, str2, function2);
    }

    public static final void KWHzl(@NotNull android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull final Function2<? super java.lang.Integer, ? super java.lang.String, Unit> function2) {
        java.lang.Long fieldNames;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(function2, "");
        if (str == null) {
            function2.invoke(-1, null);
        } else {
            ((InterfaceC9854bdT) C43251rlk.copydefault(InterfaceC9854bdT.class)).EZpvd(context, new DappSignArgs(str5, str6, new PlatformItem((str2 == null || (fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(str2)) == null) ? 0L : fieldNames.longValue(), str3 == null ? "" : str3, str4 == null ? "" : str4, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, 0L, 0, (java.lang.String) null, (java.lang.String) null, 16376, (DefaultConstructorMarker) null), str, false, 3, "dex", null, true, false, DappSignArgs.SIGN_TYPEDMESSAGE, SignType.TYPED_MESSAGE, null, null, null, false, null, 127616, null), new Function1() { // from class: o.loX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C31148loZ.copydefault(function2, (android.os.Bundle) obj);
                }
            }, new Function1() { // from class: o.loY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C31148loZ.copydefault((NewSignCallbackBean) obj);
                }
            });
        }
    }

    public static final Unit copydefault(Function2 function2, android.os.Bundle bundle) {
        function2.invoke(bundle != null ? java.lang.Integer.valueOf(bundle.getInt("result")) : null, bundle != null ? bundle.getString("data") : null);
        return Unit.INSTANCE;
    }

    public static final AbstractC58185ywX copydefault(NewSignCallbackBean newSignCallbackBean) {
        Intrinsics.checkNotNullParameter(newSignCallbackBean, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, null, null, 62, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }
}
