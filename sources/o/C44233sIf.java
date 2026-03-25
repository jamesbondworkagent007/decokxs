package o;

import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;

/* JADX INFO: renamed from: o.sIf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44233sIf extends C43280rmM {
    public C44233sIf() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    @Override // o.C43280rmM
    public OkHttpClient.Builder initClientBuilder() {
        OkHttpClient.Builder builderInitClientBuilder = super.initClientBuilder();
        java.lang.String strAEQbTJ = sFM.copydefault.AEQbTJ();
        if (!C44157sFk.gEmmrt().values() && strAEQbTJ != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ)) {
            C44124sEe.imLogTokenOperation$default("Non-login token exists...", null, 2, null);
            builderInitClientBuilder.addInterceptor(new C44235sIh(strAEQbTJ));
        }
        java.util.List<? extends Protocol> listSingletonList = Collections.singletonList(Protocol.HTTP_1_1);
        Intrinsics.checkNotNullExpressionValue(listSingletonList, "");
        builderInitClientBuilder.protocols(listSingletonList);
        return builderInitClientBuilder;
    }
}
