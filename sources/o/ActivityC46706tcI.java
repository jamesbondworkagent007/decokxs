package o;

import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.SettingWatchList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tcI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ActivityC46706tcI extends AbstractActivityC46710tcM {
    public java.lang.String AEQbTJ = "ANY";
    public InterfaceC58217yxC KWHzl;

    /* JADX DEBUG: Possible override for method o.tcM.OLrzqt()F */
    public final java.lang.String OLrzqt() {
        java.lang.String stringExtra = getIntent().getStringExtra(OtcExtraKeys.SUB_TYPE);
        return stringExtra == null ? "ANY" : stringExtra;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d A[RETURN, SYNTHETIC] */
    @Override // o.AbstractActivityC46710tcM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean EZpvd() {
        java.lang.String strOLrzqt = OLrzqt();
        if (strOLrzqt != null) {
            switch (strOLrzqt.hashCode()) {
                case -2027980370:
                    if (strOLrzqt.equals("MARGIN")) {
                        return true;
                    }
                    break;
                case -1956807563:
                    if (!strOLrzqt.equals("OPTION")) {
                    }
                    break;
                case 2074257:
                    if (strOLrzqt.equals("COIN")) {
                    }
                    break;
                case 2552066:
                    if (!strOLrzqt.equals("SPOT")) {
                    }
                    break;
                case 2558355:
                    if (!strOLrzqt.equals("SWAP")) {
                    }
                    break;
                case 214415088:
                    if (!strOLrzqt.equals("FUTURES")) {
                    }
                    break;
                case 1131295064:
                    if (!strOLrzqt.equals("pre_market")) {
                    }
                    break;
            }
        }
        return false;
    }

    @Override // o.AbstractActivityC46710tcM
    public java.lang.String AEQbTJ() {
        java.lang.String stringExtra = getIntent().getStringExtra(OtcExtraKeys.SUB_TYPE);
        return stringExtra == null ? "ANY" : stringExtra;
    }

    @Override // o.AbstractActivityC46710tcM
    public void EZpvd(@NotNull java.util.List<C46708tcK> list, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function2, "");
        KWHzl(list, function2);
    }

    /* JADX INFO: renamed from: o.tcI$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC55701xos<Unit> {
        public final /* synthetic */ Function2<java.lang.Boolean, java.lang.String, Unit> KWHzl;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2) {
            this.KWHzl = function2;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, Unit unit, java.lang.Exception exc) {
            this.KWHzl.invoke(java.lang.Boolean.valueOf(z), exc != null ? exc.getMessage() : null);
        }
    }

    public final java.util.List<SettingWatchList> copydefault(java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            if (Intrinsics.EZpvd(pair.getSecond(), (java.lang.Object) "COIN")) {
                arrayList.add(new SettingWatchList("0", (java.lang.String) pair.getFirst(), (java.lang.String) pair.getSecond(), null, null, null, null));
            } else {
                SettingWatchList settingWatchListKWHzl = xUV.EZpvd.KWHzl("0", xUD.getWatchMarketInstrument$default((java.lang.String) pair.getSecond(), (java.lang.String) pair.getFirst(), null, null, false, 28, null));
                if (settingWatchListKWHzl != null) {
                    arrayList.add(settingWatchListKWHzl);
                }
            }
        }
        return arrayList;
    }

    @Override // o.AbstractActivityC46710tcM, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public final void KWHzl(java.util.List<C46708tcK> list, Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2) {
        java.util.ArrayList<C46708tcK> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((C46708tcK) obj).EZpvd() != null) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (C46708tcK c46708tcK : arrayList) {
            BizInstrument bizInstrumentEZpvd = c46708tcK.EZpvd();
            Intrinsics.copydefault(bizInstrumentEZpvd);
            java.lang.String instId = bizInstrumentEZpvd.getInstId();
            BizInstrument bizInstrumentEZpvd2 = c46708tcK.EZpvd();
            Intrinsics.copydefault(bizInstrumentEZpvd2);
            arrayList2.add(C56390yDp.OLrzqt(instId, bizInstrumentEZpvd2.getInstType()));
        }
        java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList2);
        InterfaceC54581xNr interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault();
        C56131xwy c56131xwyFetchVPNInfo = interfaceC54581xNrCopydefault != null ? interfaceC54581xNrCopydefault.fetchVPNInfo() : null;
        this.KWHzl = c56131xwyFetchVPNInfo != null ? c56131xwyFetchVPNInfo.EZpvd(copydefault(listAxsJAYsNCnLh), new StateListAnimator(function2)) : null;
    }

    @Override // o.AbstractActivityC46710tcM, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC46710tcM, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC46710tcM, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC46710tcM, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // o.AbstractActivityC46710tcM, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
