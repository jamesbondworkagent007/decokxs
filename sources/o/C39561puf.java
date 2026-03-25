package o;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.data.TimeIntervalItem;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC39509ptg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.puf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C39561puf implements InterfaceC39509ptg {
    public static final C39561puf AEQbTJ;
    public static java.util.ArrayList<TimeIntervalItem> EZpvd;
    public static java.lang.String KWHzl;
    public static final int OLrzqt;
    public static java.lang.String copydefault;
    public static java.util.ArrayList<TimeIntervalItem> gEmmrt;

    /* JADX INFO: renamed from: o.puf$StateListAnimator */
    public static final class StateListAnimator extends TypeToken<java.util.ArrayList<TimeIntervalItem>> {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39509ptg
    public java.util.ArrayList<TimeIntervalItem> AEQbTJ() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39509ptg
    public java.util.ArrayList<TimeIntervalItem> KWHzl() {
        return gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39509ptg
    public void KWHzl(@NotNull java.util.ArrayList<TimeIntervalItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        gEmmrt = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String OLrzqt() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String copydefault() {
        return KWHzl;
    }

    private C39561puf() {
    }

    @Override // o.InterfaceC39509ptg
    public java.util.ArrayList<TimeIntervalItem> EZpvd() {
        return InterfaceC39509ptg.Activity.KWHzl(this);
    }

    static {
        C39561puf c39561puf = new C39561puf();
        AEQbTJ = c39561puf;
        copydefault = c39561puf.getClass().getSimpleName();
        EZpvd = new java.util.ArrayList<>();
        gEmmrt = new java.util.ArrayList<>();
        KWHzl = "sp_timeinterval_list_lite";
        OLrzqt = 8;
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
        if (SPUtils.getString(copydefault(), null) != null) {
            java.lang.Object objFromJson = new Gson().fromJson(SPUtils.getString(copydefault(), null), new StateListAnimator().getType());
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
                        AEQbTJ.KWHzl().add(timeIntervalItem);
                    }
                    i++;
                }
            } else {
                KWHzl(arrayList);
            }
            gEmmrt();
            return;
        }
        KWHzl().clear();
        KWHzl().addAll(pEW.EZpvd.copydefault());
    }

    @Override // o.InterfaceC39509ptg
    public void gEmmrt() {
        SPUtils.put(copydefault(), new Gson().toJson(KWHzl()));
    }
}
