package o;

import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.amplitude.AmplitudeName;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC7340ahw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rqi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43514rqi {
    public static final C43514rqi EZpvd = new C43514rqi();

    private C43514rqi() {
    }

    /* JADX INFO: renamed from: o.rqi$Application */
    public static final class Application implements InterfaceC7340ahw {
        public final /* synthetic */ android.content.Context EZpvd;
        public final /* synthetic */ java.util.Map<java.lang.String, java.lang.String> OLrzqt;

        public Application(android.content.Context context, java.util.Map<java.lang.String, java.lang.String> map) {
            this.EZpvd = context;
            this.OLrzqt = map;
        }

        @Override // o.InterfaceC7340ahw
        public void EZpvd(java.lang.Throwable th) {
            InterfaceC7340ahw.StateListAnimator.copydefault(this, th);
        }

        @Override // o.InterfaceC7340ahw
        public void OLrzqt() {
            C43056riA.AEQbTJ.copydefault(this.EZpvd, "okluanft", "/nft", this.OLrzqt);
        }
    }

    public final void AEQbTJ(android.content.Context context, java.util.Map<java.lang.String, java.lang.String> map) {
        android.content.Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        C43082ria.copydefault(applicationContext, new Application(context, map));
    }

    public final void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AEQbTJ(context, C56424yEw.gEmmrt(C56390yDp.OLrzqt("nftId", str), C56390yDp.OLrzqt("chainId", str2), C56390yDp.OLrzqt("appearance", "alternativeweb3")));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rqi */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void enterNFTDirect$default(C43514rqi c43514rqi, android.content.Context context, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        c43514rqi.copydefault(context, map);
    }

    public final void copydefault(@NotNull android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appearance", "alternativeweb3");
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        C43056riA.AEQbTJ.copydefault(context, "okluanft", "/nft", linkedHashMap);
    }

    public final void copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.util.HashMap map = new java.util.HashMap();
        java.lang.String strAEQbTJ = ABTestManager.AEQbTJ.AEQbTJ("mobile_web3_nft_miniapp_minversion", AmplitudeName.WEB3);
        if (strAEQbTJ == null) {
            strAEQbTJ = "6.155.2";
        }
        map.put("minversion", strAEQbTJ);
        map.put("appearance", "alternativeweb3");
        C43056riA.AEQbTJ.copydefault(context, "okluanft", "/newDashboard", map);
    }
}
