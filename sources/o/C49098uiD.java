package o;

import com.okinc.share.api.params.IShareParams;
import com.okinc.share.platforms.SharePlatform;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49121uia;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uiD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49098uiD {
    public static final int AEQbTJ;
    public static final C49098uiD OLrzqt;
    public static final ConcurrentHashMap<SharePlatform, InterfaceC49121uia> copydefault;

    private C49098uiD() {
    }

    static {
        C49098uiD c49098uiD = new C49098uiD();
        OLrzqt = c49098uiD;
        copydefault = new ConcurrentHashMap<>();
        c49098uiD.KWHzl();
        AEQbTJ = 8;
    }

    public final void KWHzl() {
        java.lang.System.currentTimeMillis();
        registerSharePerformer$default(this, C49178uje.AEQbTJ, null, 2, null);
        registerSharePerformer$default(this, C49117uiW.AEQbTJ, null, 2, null);
        registerSharePerformer$default(this, C49176ujc.copydefault, null, 2, null);
        registerSharePerformer$default(this, C49110uiP.copydefault, null, 2, null);
        registerSharePerformer$default(this, C49118uiX.copydefault, null, 2, null);
        registerSharePerformer$default(this, C49108uiN.copydefault, null, 2, null);
        registerSharePerformer$default(this, C49111uiQ.AEQbTJ, null, 2, null);
        registerSharePerformer$default(this, C49119uiY.AEQbTJ, null, 2, null);
        registerSharePerformer$default(this, C49174uja.AEQbTJ, null, 2, null);
        registerSharePerformer$default(this, C49114uiT.copydefault, null, 2, null);
        registerSharePerformer$default(this, C49112uiR.AEQbTJ, null, 2, null);
        registerSharePerformer$default(this, C49103uiI.AEQbTJ, null, 2, null);
        registerSharePerformer$default(this, C49113uiS.AEQbTJ, null, 2, null);
        registerSharePerformer$default(this, C49106uiL.OLrzqt, null, 2, null);
        registerSharePerformer$default(this, C49107uiM.OLrzqt, null, 2, null);
        registerSharePerformer$default(this, C49109uiO.copydefault, null, 2, null);
        registerSharePerformer$default(this, C49101uiG.copydefault, null, 2, null);
        registerSharePerformer$default(this, C49116uiV.OLrzqt, null, 2, null);
        registerSharePerformer$default(this, C49175ujb.AEQbTJ, null, 2, null);
        registerSharePerformer$default(this, C49120uiZ.copydefault, null, 2, null);
        java.lang.System.currentTimeMillis();
    }

    public static /* synthetic */ boolean registerSharePerformer$default(C49098uiD c49098uiD, InterfaceC49121uia interfaceC49121uia, SharePlatform sharePlatform, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            sharePlatform = interfaceC49121uia.EZpvd();
        }
        return c49098uiD.EZpvd(interfaceC49121uia, sharePlatform);
    }

    public final boolean EZpvd(@NotNull InterfaceC49121uia interfaceC49121uia, @NotNull SharePlatform sharePlatform) {
        Intrinsics.checkNotNullParameter(interfaceC49121uia, "");
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        try {
            java.lang.String strKWHzl = interfaceC49121uia.KWHzl();
            if (strKWHzl != null && strKWHzl.length() != 0) {
                C49122uib.OLrzqt.AEQbTJ(sharePlatform, strKWHzl);
            }
            copydefault.put(sharePlatform, interfaceC49121uia);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public final boolean copydefault(@NotNull SharePlatform sharePlatform) {
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        InterfaceC49121uia interfaceC49121uiaAEQbTJ = AEQbTJ(sharePlatform);
        if (interfaceC49121uiaAEQbTJ == null) {
            return false;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) interfaceC49121uiaAEQbTJ.KWHzl())) {
            return C49122uib.OLrzqt.OLrzqt(sharePlatform);
        }
        return true;
    }

    public final InterfaceC49121uia AEQbTJ(@NotNull SharePlatform sharePlatform) {
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        return copydefault.get(sharePlatform);
    }

    public static /* synthetic */ void performShareAction$default(C49098uiD c49098uiD, android.app.Activity activity, IShareParams iShareParams, SharePlatform sharePlatform, InterfaceC49121uia.Activity activity2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            activity2 = null;
        }
        c49098uiD.AEQbTJ(activity, iShareParams, sharePlatform, activity2);
    }

    public final void AEQbTJ(@NotNull android.app.Activity activity, @NotNull IShareParams iShareParams, @NotNull SharePlatform sharePlatform, InterfaceC49121uia.Activity activity2) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(iShareParams, "");
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        InterfaceC49121uia interfaceC49121uiaAEQbTJ = AEQbTJ(sharePlatform);
        if (interfaceC49121uiaAEQbTJ != null) {
            interfaceC49121uiaAEQbTJ.OLrzqt(activity, iShareParams, activity2);
        }
    }
}
