package o;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.data.TimeIntervalItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pCg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37830pCg implements InterfaceC39509ptg {
    public static java.util.ArrayList<TimeIntervalItem> AEQbTJ;
    public static java.util.ArrayList<TimeIntervalItem> AYXKKw;
    public static final C37830pCg EZpvd;
    public static java.lang.String KWHzl;
    public static java.lang.String OLrzqt;
    public static final int copydefault;

    /* JADX INFO: renamed from: o.pCg$ActionBar */
    public static final class ActionBar extends TypeToken<java.util.ArrayList<TimeIntervalItem>> {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39509ptg
    public java.util.ArrayList<TimeIntervalItem> AEQbTJ() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39509ptg
    public java.util.ArrayList<TimeIntervalItem> KWHzl() {
        return AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39509ptg
    public void KWHzl(@NotNull java.util.ArrayList<TimeIntervalItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        AYXKKw = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String OLrzqt() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String copydefault() {
        return OLrzqt;
    }

    private C37830pCg() {
    }

    static {
        C37830pCg c37830pCg = new C37830pCg();
        EZpvd = c37830pCg;
        OLrzqt = c37830pCg.getClass().getSimpleName();
        AEQbTJ = new java.util.ArrayList<>();
        AYXKKw = new java.util.ArrayList<>();
        KWHzl = "sp_timeinterval_list_version5";
        copydefault = 8;
    }

    @Override // o.InterfaceC39509ptg
    public void valueOf() {
        djBIcL();
        AYXKKw();
    }

    public void djBIcL() {
        if (AEQbTJ().size() > 0) {
            return;
        }
        AEQbTJ().clear();
        AEQbTJ().addAll(pEW.EZpvd.KWHzl());
    }

    public void AYXKKw() {
        if (KWHzl().size() > 0) {
            return;
        }
        if (SPUtils.getString(OLrzqt(), null) != null) {
            java.lang.Object objFromJson = new Gson().fromJson(SPUtils.getString(OLrzqt(), null), new ActionBar().getType());
            Intrinsics.checkNotNullExpressionValue(objFromJson, "");
            java.util.ArrayList<TimeIntervalItem> arrayList = (java.util.ArrayList) objFromJson;
            if (arrayList.size() > 4) {
                KWHzl().clear();
                int i = 0;
                for (java.lang.Object obj : arrayList) {
                    if (i < 0) {
                        yDY.AYXKKw();
                    }
                    TimeIntervalItem timeIntervalItem = (TimeIntervalItem) obj;
                    if (i < 2) {
                        EZpvd.KWHzl().add(timeIntervalItem);
                    }
                    i++;
                }
            } else {
                KWHzl(arrayList);
            }
            gEmmrt();
            return;
        }
        KWHzl(pEW.EZpvd.copydefault());
    }

    @Override // o.InterfaceC39509ptg
    public java.util.ArrayList<TimeIntervalItem> EZpvd() {
        return pEW.EZpvd.copydefault();
    }

    @Override // o.InterfaceC39509ptg
    public void gEmmrt() {
        SPUtils.put(OLrzqt(), new Gson().toJson(KWHzl()));
    }
}
