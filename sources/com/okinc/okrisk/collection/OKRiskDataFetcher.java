package com.okinc.okrisk.collection;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.okinc.okrisk.OKRiskPayloadManager;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.C46988thZ;
import o.C47004thp;
import o.C47042tia;
import o.C47212tll;
import o.InterfaceC47047tif;
import o.InterfaceC47060tis;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public class OKRiskDataFetcher {
    public static InterfaceC47060tis OLrzqt;
    public static OKRiskDataFetcher copydefault;
    public ScheduledExecutorService AhwBna;
    public Context EZpvd;
    public String KWHzl;
    public C46988thZ gEmmrt;
    public SharedPreferences valueOf;
    public final ExecutorService AEQbTJ = Executors.newFixedThreadPool(1);
    public String djBIcL = "https://test-tlog.okg.com";

    public static native String expEn(String str, String str2);

    private static native int forkOrphan(String str);

    private static native byte[] getHealthMessageV2(Context context, byte[] bArr);

    public static native void nativeHandleChargingPower(float f);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C46988thZ EZpvd() {
        return this.gEmmrt;
    }

    public static void KWHzl() {
        try {
            System.loadLibrary("collection_v3");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public OKRiskDataFetcher(Context context, String str, String str2, InterfaceC47060tis interfaceC47060tis, InterfaceC47047tif interfaceC47047tif, String str3) {
        this.EZpvd = context;
        OLrzqt = interfaceC47060tis;
        this.KWHzl = str3;
        this.valueOf = context.getSharedPreferences("OKRiskSecurityInit", 0);
        this.gEmmrt = new C46988thZ(context, C47212tll.Companion.copydefault(context).copydefault());
        this.AhwBna = Executors.newScheduledThreadPool(1);
    }

    public static void EZpvd(Context context, String str, String str2, InterfaceC47060tis interfaceC47060tis, InterfaceC47047tif interfaceC47047tif, String str3) {
        synchronized (OKRiskDataFetcher.class) {
            if (copydefault == null) {
                OKRiskDataFetcher oKRiskDataFetcher = new OKRiskDataFetcher(context, str, str2, interfaceC47060tis, interfaceC47047tif, str3);
                copydefault = oKRiskDataFetcher;
                oKRiskDataFetcher.OLrzqt();
            } else {
                C47042tia.OLrzqt(context, "OK_Collection_init", "Ok Collection init Repeated call");
                pUU.copydefault("OK_Collection_init", "Do not repeat initialization please!");
            }
        }
    }

    public static OKRiskDataFetcher AEQbTJ() {
        OKRiskDataFetcher oKRiskDataFetcher;
        synchronized (OKRiskDataFetcher.class) {
            oKRiskDataFetcher = copydefault;
        }
        return oKRiskDataFetcher;
    }

    public void OLrzqt() {
        int refreshCycle = C47004thp.EZpvd.gEmmrt().getRefreshCycle();
        final C47212tll c47212tllCopydefault = C47212tll.Companion.copydefault(this.EZpvd);
        final byte[] bArrDecode = Base64.decode(c47212tllCopydefault.AEQbTJ("cg", c47212tllCopydefault.copydefault()), 0);
        this.AhwBna.scheduleWithFixedDelay(new Runnable() { // from class: o.tic
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                this.EZpvd.AEQbTJ(c47212tllCopydefault, bArrDecode);
            }
        }, 0L, refreshCycle, TimeUnit.SECONDS);
    }

    public final /* synthetic */ void AEQbTJ(final C47212tll c47212tll, final byte[] bArr) {
        this.AEQbTJ.execute(new Runnable() { // from class: o.tid
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                this.AEQbTJ.copydefault(c47212tll, bArr);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void copydefault(C47212tll c47212tll, byte[] bArr) {
        String strAEQbTJ;
        C46988thZ c46988thZ;
        try {
            try {
                if (OKRiskPayloadManager.copydefault.fetchVPNInfo() && (c46988thZ = this.gEmmrt) != null) {
                    c46988thZ.EZpvd(this.EZpvd);
                }
            } catch (Throwable th) {
                pUU.copydefault("startNewMergedApi", "queue reset check failed: " + th.getMessage());
                OKRiskPayloadManager.copydefault.AEQbTJ("startNewMergedApi queue reset check failed:", th.getMessage() != null ? th.getMessage() : "");
            }
            try {
                strAEQbTJ = c47212tll.AEQbTJ("cg", c47212tll.copydefault());
            } catch (Throwable th2) {
                pUU.copydefault("startNewMergedApi", "refresh cg failed: " + th2.getMessage());
                OKRiskPayloadManager.copydefault.AEQbTJ("startNewMergedApi refresh cg failed: ", th2.getMessage() != null ? th2.getMessage() : "");
            }
            byte[] bArrDecode = strAEQbTJ != null ? Base64.decode(strAEQbTJ, 0) : null;
            if (bArrDecode != null) {
                bArr = bArrDecode;
            }
            try {
                byte[] bArrOLrzqt = OLrzqt(bArr);
                if (bArrOLrzqt == null || bArrOLrzqt.length <= 0) {
                    return;
                }
                this.gEmmrt.KWHzl(this.EZpvd, bArrOLrzqt);
                return;
            } catch (Exception e) {
                pUU.copydefault("startNewMergedApi", "Failed to generate health data: " + e.getMessage());
                OKRiskPayloadManager.copydefault.AEQbTJ("startNewMergedApi Failed to generate health data: ", e.getMessage() != null ? e.getMessage() : "");
                return;
            }
        } catch (Exception e2) {
            pUU.copydefault("startNewMergedApi", "Exception: " + e2.getMessage());
            OKRiskPayloadManager.copydefault.AEQbTJ("startNewMergedApi ", e2.getMessage() != null ? e2.getMessage() : "");
        }
        pUU.copydefault("startNewMergedApi", "Exception: " + e2.getMessage());
        OKRiskPayloadManager.copydefault.AEQbTJ("startNewMergedApi ", e2.getMessage() != null ? e2.getMessage() : "");
    }

    public final byte[] OLrzqt(byte[] bArr) {
        return getHealthMessageV2(this.EZpvd, bArr);
    }
}
