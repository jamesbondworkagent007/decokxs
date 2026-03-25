package o;

import com.okinc.business.rewards.impl.RewardsServiceImpl$goToNewRewardsCenter$1;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kOZ extends AbstractC43215rlA implements kOE {
    @Override // o.kOE
    public void AEQbTJ(@NotNull android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new RewardsServiceImpl$goToNewRewardsCenter$1(map, context, null), 2, null);
    }

    @Override // o.kOE
    public void KWHzl(@NotNull android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        java.util.HashMap map2 = new java.util.HashMap();
        java.lang.String strGEmmrt = "growthAnnualBill";
        java.lang.String strGEmmrt2 = "/growth/route";
        java.lang.String strGEmmrt3 = "OKLGAnnualBillMainVC";
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.Object value = entry.getValue();
                if (map.containsKey("appid")) {
                    strGEmmrt = C33129mqd.gEmmrt(map.get("appid"));
                } else if (map.containsKey("pageurl")) {
                    strGEmmrt2 = C33129mqd.gEmmrt(map.get("pageurl"));
                } else if (map.containsKey("to")) {
                    strGEmmrt3 = C33129mqd.gEmmrt(map.get("to"));
                } else {
                    if (value == null) {
                        value = "";
                    }
                    map2.put(key, value);
                }
            }
        }
        map2.put("to", strGEmmrt3);
        C43056riA.AEQbTJ.copydefault(context, strGEmmrt, strGEmmrt2, map2);
    }

    @Override // o.kOE
    public void KWHzl(@NotNull android.content.Context context, @NotNull final java.lang.String str, @NotNull final java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: o.kPb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                kOZ.copydefault(str, map);
            }
        }, 1000L);
    }

    public static final void copydefault(java.lang.String str, java.util.Map map) {
        C43173rkL.EZpvd.AEQbTJ(str, (java.util.Map<java.lang.String, ? extends java.lang.Object>) map);
    }
}
