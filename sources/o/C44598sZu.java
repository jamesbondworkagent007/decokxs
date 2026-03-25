package o;

import com.okinc.market.search.features.main.root.ui.SearchActivity;
import com.okinc.okmarket.app.deeplink.handler.ExchangeHomeSearchDeeplinkHandler$executeDeeplink$1;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sZu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44598sZu implements InterfaceC43234rlT {
    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(map.get(JwtUtilsKt.DID_METHOD_KEY));
        java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(map.get("tab"));
        java.lang.Object obj = map.get("isWeb");
        if (obj == null) {
            obj = "0";
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) SearchActivity.class);
        intent.putExtra(JwtUtilsKt.DID_METHOD_KEY, strGEmmrt);
        intent.putExtra("tab", strGEmmrt2);
        intent.putExtra("from", java.lang.String.valueOf(map.get("from")));
        if (Intrinsics.EZpvd(obj, (java.lang.Object) "1")) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new ExchangeHomeSearchDeeplinkHandler$executeDeeplink$1(context, intent, null), 3, null);
        } else {
            context.startActivity(intent);
        }
    }
}
