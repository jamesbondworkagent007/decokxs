package com.okinc.components.security.scanner;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.okinc.components.security.scanner.DeviceScanner;
import com.okinc.components.security.scanner.EnsecureAppInfo;
import com.okinc.crcore.coreapi.service.IMarketApiService;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import o.AbstractC58185ywX;
import o.ActivityC32771mjq;
import o.C32686miK;
import o.C32757mjc;
import o.C32772mjr;
import o.C32786mkE;
import o.C32788mkG;
import o.C33129mqd;
import o.C43308rmo;
import o.C54819xWm;
import o.C56402yEa;
import o.C56403yEb;
import o.C56406yEe;
import o.C56444yFp;
import o.InterfaceC32767mjm;
import o.InterfaceC56445yFq;
import o.InterfaceC58229yxO;
import o.ServiceC32756mjb;
import o.xVW;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class DeviceScanner {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public List<EnsecureAppInfo> AEQbTJ;
    public final Context EZpvd;
    public C32757mjc KWHzl;
    public List<ApplicationInfo> copydefault;
    public InterfaceC32767mjm gEmmrt;
    public String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EnsecureAppInfo> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull List<EnsecureAppInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
    }

    public DeviceScanner(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = context;
        this.copydefault = CollectionsKt___CollectionsKt.fJNWhG((Collection) yDY.AhwBna());
        this.AEQbTJ = new ArrayList();
        this.valueOf = "";
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ScannerStatus {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ScannerStatus[] $VALUES;
        private final int value;
        public static final ScannerStatus IDLE = new ScannerStatus("IDLE", 0, 0);
        public static final ScannerStatus RUNNING = new ScannerStatus(DebugCoroutineInfoImplKt.RUNNING, 1, 1);
        public static final ScannerStatus COMPLETED = new ScannerStatus("COMPLETED", 2, 2);
        public static final ScannerStatus PENDING = new ScannerStatus(CardSyncResponse.PENDING, 3, 3);
        public static final ScannerStatus START = new ScannerStatus("START", 4, 4);
        public static final ScannerStatus PENDING_BACKGROUND = new ScannerStatus("PENDING_BACKGROUND", 5, 2);
        public static final ScannerStatus RUNNING_BACKGROUND = new ScannerStatus("RUNNING_BACKGROUND", 6, 3);
        public static final ScannerStatus IDLE_BACKGROUND = new ScannerStatus("IDLE_BACKGROUND", 7, 0);
        public static final ScannerStatus COMPLETED_NO_RISK_BACKGROUND = new ScannerStatus("COMPLETED_NO_RISK_BACKGROUND", 8, -1);
        public static final ScannerStatus COMPLETED_RISKY_BACKGROUND = new ScannerStatus("COMPLETED_RISKY_BACKGROUND", 9, 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ScannerStatus[] $values() {
            return new ScannerStatus[]{IDLE, RUNNING, COMPLETED, PENDING, START, PENDING_BACKGROUND, RUNNING_BACKGROUND, IDLE_BACKGROUND, COMPLETED_NO_RISK_BACKGROUND, COMPLETED_RISKY_BACKGROUND};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ScannerStatus> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        private ScannerStatus(String str, int i, int i2) {
            this.value = i2;
        }

        static {
            ScannerStatus[] scannerStatusArr$values = $values();
            $VALUES = scannerStatusArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(scannerStatusArr$values);
        }

        public static ScannerStatus valueOf(String str) {
            return (ScannerStatus) Enum.valueOf(ScannerStatus.class, str);
        }

        public static ScannerStatus[] values() {
            return (ScannerStatus[]) $VALUES.clone();
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.components.security.scanner.DeviceScanner.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void KWHzl(@NotNull Context context, @NotNull String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            ActivityC32771mjq.Application.start$default(ActivityC32771mjq.Companion, context, str, false, false, 12, null);
        }

        public static /* synthetic */ void checkDeviceSecurityStatus$default(StateListAnimator stateListAnimator, Context context, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            stateListAnimator.OLrzqt(context, str);
        }

        public final void OLrzqt(@NotNull Context context, @NotNull final String str) {
            Activity activityAEQbTJ;
            int size;
            Map<String, EnsecureAppInfo.ScanResult> second;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            C32757mjc.StateListAnimator stateListAnimator = C32757mjc.Companion;
            if (stateListAnimator.AEQbTJ().KWHzl()) {
                if (stateListAnimator.AEQbTJ().AEQbTJ() && C43308rmo.OLrzqt(context)) {
                    C32788mkG.StateListAnimator stateListAnimator2 = C32788mkG.Companion;
                    int iGEmmrt = stateListAnimator2.gEmmrt("status_background");
                    Pair<Long, Map<String, EnsecureAppInfo.ScanResult>> pairDjBIcL = stateListAnimator2.djBIcL("lastRecord_background");
                    if (pairDjBIcL.getFirst().longValue() == 0 || pairDjBIcL.getSecond() == null || pairDjBIcL.getSecond().isEmpty()) {
                        size = 0;
                    } else {
                        Map<String, EnsecureAppInfo.ScanResult> second2 = pairDjBIcL.getSecond();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, EnsecureAppInfo.ScanResult> entry : second2.entrySet()) {
                            if (!C32788mkG.Companion.copydefault(entry.getKey())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        size = linkedHashMap.size();
                    }
                    boolean zOLrzqt = C32786mkE.KWHzl.OLrzqt(context);
                    if (iGEmmrt != ScannerStatus.IDLE_BACKGROUND.getValue()) {
                        C32788mkG.StateListAnimator stateListAnimator3 = C32788mkG.Companion;
                        long jAEQbTJ = stateListAnimator3.AEQbTJ("lastTime_background");
                        if (jAEQbTJ > 0 && System.currentTimeMillis() - jAEQbTJ > 86400000) {
                            if (zOLrzqt) {
                                stateListAnimator3.OLrzqt(ScannerStatus.PENDING_BACKGROUND.getValue(), "status_background");
                            } else {
                                ServiceC32756mjb.Companion.copydefault(context, 0, str);
                            }
                        }
                    }
                    if (size > 0 && iGEmmrt == ScannerStatus.COMPLETED_RISKY_BACKGROUND.getValue() && (second = pairDjBIcL.getSecond()) != null) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry<String, EnsecureAppInfo.ScanResult> entry2 : second.entrySet()) {
                            if (C32786mkE.KWHzl.copydefault(context, entry2.getKey())) {
                                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        if (!linkedHashMap2.isEmpty()) {
                            final Activity activityAEQbTJ2 = C54819xWm.KWHzl().AEQbTJ();
                            if (activityAEQbTJ2 instanceof FragmentActivity) {
                                FragmentActivity fragmentActivity = (FragmentActivity) activityAEQbTJ2;
                                if (!fragmentActivity.isDestroyed()) {
                                    C32772mjr c32772mjrEZpvd = C32772mjr.Companion.EZpvd(new Function0() { // from class: o.mjf
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return DeviceScanner.StateListAnimator.KWHzl(activityAEQbTJ2, str);
                                        }
                                    });
                                    FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                                    c32772mjrEZpvd.show(supportFragmentManager);
                                }
                            }
                        }
                    }
                }
                C32788mkG.StateListAnimator stateListAnimator4 = C32788mkG.Companion;
                int riskCount$default = C32788mkG.StateListAnimator.getRiskCount$default(stateListAnimator4, false, null, 3, null);
                if (C32788mkG.StateListAnimator.readScanstatus$default(stateListAnimator4, null, 1, null) != ScannerStatus.COMPLETED.getValue() || (activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ()) == null) {
                    return;
                }
                ActivityC32771mjq.Companion.EZpvd(activityAEQbTJ, riskCount$default, str);
            }
        }

        public static final Unit KWHzl(Activity activity, String str) {
            ActivityC32771mjq.Application.start$default(ActivityC32771mjq.Companion, activity, str, false, false, 8, null);
            return Unit.INSTANCE;
        }

        public final boolean KWHzl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            Pair<Long, Integer> pairOLrzqt = C32788mkG.Companion.OLrzqt(str);
            long jLongValue = pairOLrzqt.component1().longValue();
            int iIntValue = pairOLrzqt.component2().intValue();
            if (jLongValue == 0) {
                return false;
            }
            return System.currentTimeMillis() - jLongValue <= (((iIntValue != 1 ? iIntValue != 2 ? 30L : 14L : 7L) * ((long) 24)) * ((long) IMarketApiService.SIXTY_MINUTES)) * 1000;
        }
    }

    public final void OLrzqt(InterfaceC32767mjm interfaceC32767mjm) {
        xVW.EZpvd(this.EZpvd);
        this.valueOf = xVW.copydefault();
        this.gEmmrt = interfaceC32767mjm;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new DeviceScanner$startScan$1(this, null), 3, null);
    }

    public final List<EnsecureAppInfo> KWHzl() {
        ApplicationInfo applicationInfoOLrzqt;
        Object next;
        ApplicationInfo applicationInfoOLrzqt2;
        List listAhwBna;
        List<EnsecureAppInfo> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) yDY.AhwBna());
        List<ApplicationInfo> installedApplications = this.EZpvd.getPackageManager().getInstalledApplications(128);
        Intrinsics.checkNotNullExpressionValue(installedApplications, "");
        ArrayList arrayList = new ArrayList();
        for (Object obj : installedApplications) {
            if ((1 & ((ApplicationInfo) obj).flags) == 0) {
                arrayList.add(obj);
            }
        }
        this.copydefault = CollectionsKt___CollectionsKt.fJNWhG((Collection) arrayList);
        List<String> listEZpvd = C32757mjc.Companion.AEQbTJ().EZpvd();
        C32757mjc c32757mjc = new C32757mjc();
        this.KWHzl = c32757mjc;
        List<AccessibilityServiceInfoDetails> listEZpvd2 = c32757mjc.EZpvd(listEZpvd);
        List<AccessibilityServiceInfoDetails> listCopydefault = c32757mjc.copydefault(listEZpvd);
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = listEZpvd2.iterator();
        while (true) {
            Object obj2 = null;
            if (!it.hasNext()) {
                break;
            }
            AccessibilityServiceInfoDetails accessibilityServiceInfoDetails = (AccessibilityServiceInfoDetails) it.next();
            if (this.copydefault.size() <= 1) {
                applicationInfoOLrzqt2 = C32786mkE.KWHzl.OLrzqt(this.EZpvd, accessibilityServiceInfoDetails.getPackageName());
            } else {
                Iterator<T> it2 = this.copydefault.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (Intrinsics.EZpvd((Object) ((ApplicationInfo) next2).packageName, (Object) accessibilityServiceInfoDetails.getPackageName())) {
                        obj2 = next2;
                        break;
                    }
                }
                applicationInfoOLrzqt2 = (ApplicationInfo) obj2;
            }
            ApplicationInfo applicationInfo = applicationInfoOLrzqt2;
            if (applicationInfo == null || (listAhwBna = C56402yEa.EZpvd(new EnsecureAppInfo(applicationInfo, accessibilityServiceInfoDetails.getAppName(), accessibilityServiceInfoDetails.getPackageName(), this.EZpvd.getPackageManager().getApplicationIcon(applicationInfo), new EnsecureAppInfo.ScanResult(AccessibilityAppType.MAL_TROJAN.getValue(), EnsecureAppInfo.RiskLevel.DEVICE_SECURITY_LEVEL_MEDIUM), false, 32, null))) == null) {
                listAhwBna = yDY.AhwBna();
            }
            C56406yEe.KWHzl(arrayList2, listAhwBna);
        }
        listFJNWhG.addAll(CollectionsKt___CollectionsKt.fJNWhG((Collection) arrayList2));
        ArrayList<AccessibilityServiceInfoDetails> arrayList3 = new ArrayList();
        for (Object obj3 : listCopydefault) {
            AccessibilityServiceInfoDetails accessibilityServiceInfoDetails2 = (AccessibilityServiceInfoDetails) obj3;
            if (!(listEZpvd2 instanceof Collection) || !listEZpvd2.isEmpty()) {
                Iterator<T> it3 = listEZpvd2.iterator();
                while (it3.hasNext()) {
                    if (Intrinsics.EZpvd((Object) ((AccessibilityServiceInfoDetails) it3.next()).getPackageName(), (Object) accessibilityServiceInfoDetails2.getPackageName())) {
                        break;
                    }
                }
            }
            arrayList3.add(obj3);
        }
        for (AccessibilityServiceInfoDetails accessibilityServiceInfoDetails3 : arrayList3) {
            if (this.copydefault.size() <= 1) {
                applicationInfoOLrzqt = C32786mkE.KWHzl.OLrzqt(this.EZpvd, accessibilityServiceInfoDetails3.getPackageName());
            } else {
                Iterator<T> it4 = this.copydefault.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                    if (Intrinsics.EZpvd((Object) ((ApplicationInfo) next).packageName, (Object) accessibilityServiceInfoDetails3.getPackageName())) {
                        break;
                    }
                }
                applicationInfoOLrzqt = (ApplicationInfo) next;
            }
            ApplicationInfo applicationInfo2 = applicationInfoOLrzqt;
            if (applicationInfo2 != null) {
                listFJNWhG.add(new EnsecureAppInfo(applicationInfo2, accessibilityServiceInfoDetails3.getAppName(), accessibilityServiceInfoDetails3.getPackageName(), this.EZpvd.getPackageManager().getApplicationIcon(applicationInfo2), new EnsecureAppInfo.ScanResult(AccessibilityAppType.SUS_TROJAN.getValue(), EnsecureAppInfo.RiskLevel.DEVICE_SECURITY_LEVEL_MEDIUM), false, 32, null));
            }
        }
        return listFJNWhG;
    }

    /* JADX DEBUG: Type inference failed for r1v3. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.util.List<com.okinc.components.security.scanner.EnsecureAppInfo>> */
    public final AbstractC58185ywX<List<EnsecureAppInfo>> copydefault() {
        List<ApplicationInfo> arrayList;
        String str;
        ArrayList arrayList2 = new ArrayList();
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        Ref.IntRef intRef = new Ref.IntRef();
        if (this.copydefault.size() < 2) {
            C32757mjc c32757mjc = this.KWHzl;
            if (c32757mjc == null) {
                Intrinsics.gEmmrt("");
                c32757mjc = null;
            }
            List<AccessibilityServiceInfoDetails> listKWHzl = c32757mjc.KWHzl();
            arrayList = new ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
            Iterator<T> it = listKWHzl.iterator();
            while (it.hasNext()) {
                arrayList.add(C32786mkE.KWHzl.OLrzqt(this.EZpvd, ((AccessibilityServiceInfoDetails) it.next()).getPackageName()));
            }
        } else {
            arrayList = this.copydefault;
        }
        int size = arrayList.size();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new DeviceScanner$verify$1(size, null), 3, null);
        int i = -1;
        for (ApplicationInfo applicationInfo : arrayList) {
            if (applicationInfo != null) {
                String strKWHzl = C32786mkE.KWHzl.KWHzl(this.EZpvd, applicationInfo.packageName);
                if (C33129mqd.OLrzqt((CharSequence) strKWHzl)) {
                    Intrinsics.copydefault((Object) strKWHzl);
                    str = strKWHzl;
                } else {
                    str = "";
                }
                String string = this.EZpvd.getPackageManager().getApplicationLabel(applicationInfo).toString();
                String str2 = applicationInfo.packageName;
                Intrinsics.checkNotNullExpressionValue(str2, "");
                arrayList2.add(new AppHash(str, string, str2, (String) null, 8, (DefaultConstructorMarker) null));
                String str3 = applicationInfo.packageName;
                Intrinsics.checkNotNullExpressionValue(str3, "");
                linkedHashMap.put(str3, applicationInfo);
                int i2 = intRef.element + 1;
                intRef.element = i2;
                int iMin = (Math.min((i2 * 80) / size, 80) / 10) * 10;
                if (iMin != i) {
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new DeviceScanner$verify$2$1$1(intRef, size, iMin, null), 3, null);
                    i = iMin;
                }
            }
        }
        AbstractC58185ywX<ResponseData<List<AppHash>>> abstractC58185ywXOLrzqt = new C32686miK().OLrzqt(new SecurityAppsReq(this.valueOf, arrayList2));
        final Function1 function1 = new Function1() { // from class: o.mje
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DeviceScanner.EZpvd(linkedHashMap, this, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.mjg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return DeviceScanner.copydefault(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final List copydefault(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static final List EZpvd(Map map, DeviceScanner deviceScanner, ResponseData responseData) {
        EnsecureAppInfo.RiskLevel riskLevel;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && C33129mqd.KWHzl((Collection) responseData.getData())) {
            ArrayList arrayList = new ArrayList();
            Object data = responseData.getData();
            Intrinsics.copydefault(data);
            for (AppHash appHash : (Iterable) data) {
                if (map.containsKey(appHash.getPackage_name())) {
                    Object obj = map.get(appHash.getPackage_name());
                    Intrinsics.copydefault(obj);
                    ApplicationInfo applicationInfo = (ApplicationInfo) obj;
                    String string = deviceScanner.EZpvd.getPackageManager().getApplicationLabel(applicationInfo).toString();
                    String str = applicationInfo.packageName;
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    Drawable applicationIcon = deviceScanner.EZpvd.getPackageManager().getApplicationIcon(applicationInfo);
                    String risk_type = appHash.getRisk_type();
                    String risk_type2 = appHash.getRisk_type();
                    if (Intrinsics.EZpvd((Object) risk_type2, (Object) BlackAppType.FAKE_IM.getValue()) || Intrinsics.EZpvd((Object) risk_type2, (Object) BlackAppType.FAKE_WALLET.getValue())) {
                        riskLevel = EnsecureAppInfo.RiskLevel.DEVICE_SECURITY_LEVEL_MEDIUM;
                    } else {
                        riskLevel = EnsecureAppInfo.RiskLevel.DEVICE_SECURITY_LEVEL_HIGH;
                    }
                    arrayList.add(new EnsecureAppInfo(applicationInfo, string, str, applicationIcon, new EnsecureAppInfo.ScanResult(risk_type, riskLevel), false, 32, null));
                }
            }
            return arrayList;
        }
        return yDY.AhwBna();
    }
}
