package o;

import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.market.search.features.main.root.ui.SearchActivity;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.oKA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.unS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C49378unS implements InterfaceC7380aij {
    private static final Application Companion = new Application(null);

    /* JADX INFO: renamed from: o.unS$Application */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.unS.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.InterfaceC7380aij
    public java.util.Set<java.lang.String> KWHzl() {
        return yEE.AhwBna(C49377unR.KWHzl.KWHzl(), "GoToTradeKLine", "market/image_gallery");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x012d  */
    @Override // o.InterfaceC7380aij
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull InterfaceC7379aii interfaceC7379aii) {
        java.lang.String str2;
        java.util.ArrayList arrayList;
        java.util.Collection collectionValues;
        java.util.List listAxsJAYsNCnLh;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC7379aii, "");
        java.lang.String strKWHzl = C49377unR.KWHzl.KWHzl(str);
        int iHashCode = strKWHzl.hashCode();
        if (iHashCode == -1992213436) {
            if (strKWHzl.equals("trade_kline") && map != null && map.containsKey("instId")) {
                java.lang.Object obj = map.get("instId");
                java.lang.String str3 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
                java.lang.Object obj2 = map.get("bizType");
                java.lang.String str4 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                if (str4 == null) {
                    str2 = "SPOT";
                } else {
                    str2 = C33129mqd.OLrzqt((java.lang.CharSequence) str4) ? str4 : null;
                    if (str2 == null) {
                    }
                }
                if (str3 == null || str3.length() == 0) {
                    return;
                }
                MarketCoinInfo marketCoinInfo = new MarketCoinInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
                marketCoinInfo.setInstrumentId(str3);
                marketCoinInfo.setInstrumentType(str2);
                oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
                if (oka != null) {
                    oKA.TaskDescription.gotoNewKlinePage$default(oka, context, marketCoinInfo, null, null, null, null, null, null, null, null, null, 2044, null);
                    return;
                }
                return;
            }
            return;
        }
        if (iHashCode == -1144349754) {
            if (strKWHzl.equals("search_activity")) {
                context.startActivity(new android.content.Intent(context, (java.lang.Class<?>) SearchActivity.class));
                return;
            }
            return;
        }
        if (iHashCode == -913327141 && strKWHzl.equals("market/image_gallery")) {
            pUU.EZpvd("MLNTradeExperienceRouter", "launch image gallery: " + map);
            java.lang.Object obj3 = map != null ? map.get("imageUrlList") : null;
            java.util.Map map2 = obj3 instanceof java.util.Map ? (java.util.Map) obj3 : null;
            if (map2 == null || (collectionValues = map2.values()) == null || (listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(collectionValues)) == null) {
                arrayList = null;
            } else {
                arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAxsJAYsNCnLh, 10));
                java.util.Iterator it = listAxsJAYsNCnLh.iterator();
                while (it.hasNext()) {
                    arrayList.add(java.lang.String.valueOf(it.next()));
                }
            }
            if (arrayList == null || arrayList.isEmpty()) {
                pUU.copydefault("MLNTradeExperienceRouter", "illegal params: " + map + ", none imageUrlList found.");
                return;
            }
            ActivityC40528qZe.Companion.AEQbTJ(context, C33129mqd.gEmmrt(map.get("fromPage")), arrayList, C33129mqd.AhwBna(map.get("defaultSelectIndex")), C33129mqd.gEmmrt(map.get("recMetadata")));
        }
    }
}
