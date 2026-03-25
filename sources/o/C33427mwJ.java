package o;

import android.os.Build;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.ok_app.api.bean.AccessibilityServiceInfoDetails;
import com.okinc.core.ok_app.security.AccessibilityServiceHelper$Companion$reportSecurityIssueV2$2;
import com.okinc.core.ok_app.security.AccessibilityServiceHelper$Companion$reportSecurityIssueV2$4;
import com.okinc.core.ok_app.security.RiskAttributes;
import com.okinc.core.ok_app.security.SecurityDetection;
import com.okinc.core.util.SPUtils;
import com.okinc.okuser.data.User;
import com.okinc.rxutils.RxBus;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import o.C33427mwJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mwJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33427mwJ {
    public static boolean AhwBna;
    public static boolean AkhnZx;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public static final java.lang.String OLrzqt = "security_accessibility_permission_list";
    public static final java.lang.String AYXKKw = "Security_Detector_AccessibilityService_View";
    public static final java.lang.String AEQbTJ = "as_h_history";
    public static final java.lang.String copydefault = "as_m_history";
    public static final java.lang.String gEmmrt = "high";
    public static final java.lang.String djBIcL = "medium";
    public static final java.lang.String valueOf = "low";
    public static final java.lang.String EZpvd = "api";
    public static final C33433mwP DbNXlk = new C33433mwP();
    public static final InterfaceC56387yDm<InterfaceC47278tmy> values = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.mwL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C33427mwJ.values();
        }
    });
    public final java.lang.String isConnected = "accessibilityRules";
    public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.mwI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C33427mwJ.EZpvd(this.EZpvd);
        }
    });

    /* JADX INFO: renamed from: o.mwJ$StateListAnimator */
    public static final class StateListAnimator {

        /* JADX INFO: renamed from: o.mwJ$StateListAnimator$Application */
        public static final class Application extends TypeToken<java.util.List<? extends AccessibilityServiceInfoDetails>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mwJ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean AkhnZx() {
            return true;
        }

        private StateListAnimator() {
        }

        public final java.lang.String copydefault() {
            return C33427mwJ.OLrzqt;
        }

        public final java.lang.String AEQbTJ() {
            return C33427mwJ.AYXKKw;
        }

        public final java.lang.String OLrzqt() {
            return C33427mwJ.AEQbTJ;
        }

        public final java.lang.String KWHzl() {
            return C33427mwJ.copydefault;
        }

        public final java.lang.String gEmmrt() {
            return C33427mwJ.gEmmrt;
        }

        public final java.lang.String AYXKKw() {
            return C33427mwJ.djBIcL;
        }

        public final java.lang.String djBIcL() {
            return C33427mwJ.valueOf;
        }

        public final java.lang.String EZpvd() {
            return C33427mwJ.EZpvd;
        }

        public final C33433mwP AhwBna() {
            return C33427mwJ.DbNXlk;
        }

        public final void AEQbTJ(boolean z) {
            C33427mwJ.AhwBna = z;
        }

        public final boolean isConnected() {
            return C33427mwJ.AhwBna;
        }

        public final void OLrzqt(boolean z) {
            C33427mwJ.AkhnZx = z;
        }

        public final boolean fetchVPNInfo() {
            return C33427mwJ.AkhnZx;
        }

        public final InterfaceC47278tmy valueOf() {
            return (InterfaceC47278tmy) C33427mwJ.values.getValue();
        }

        public final void DbNXlk() {
            C54819xWm.KWHzl().AEQbTJ(new TaskDescription());
            AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("event_first_activity_created");
            final java.lang.Object obj = new java.lang.Object();
            abstractC58185ywXAEQbTJ.subscribe(new RxBus.EventCallback<java.lang.String>(obj) { // from class: com.okinc.core.ok_app.security.AccessibilityServiceHelper$Companion$registerAccessibilityCheck$2
                /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
                @Override // com.okinc.rxutils.RxBus.EventCallback
                public void onEvent(String str) {
                    FlowKt.launchIn(FlowKt.onEach(C33427mwJ.Companion.valueOf().fIwbmz(), new AccessibilityServiceHelper$Companion$registerAccessibilityCheck$2$onEvent$1(null)), GlobalScope.INSTANCE);
                }
            });
        }

        /* JADX INFO: renamed from: o.mwJ$StateListAnimator$TaskDescription */
        public static final class TaskDescription implements InterfaceC54816xWj {
            @Override // o.InterfaceC54816xWj
            public void KWHzl() {
            }

            @Override // o.InterfaceC54816xWj
            public void OLrzqt(android.app.Activity activity) {
                C33427mwJ.Companion.values();
            }
        }

        public final void values() {
            java.util.List<AccessibilityServiceInfoDetails> listCopydefault;
            java.util.List listKWHzl;
            boolean zKWHzl = AhwBna().KWHzl();
            boolean zCopydefault = AhwBna().copydefault();
            boolean zAEQbTJ = AhwBna().AEQbTJ();
            java.util.List<java.lang.String> listOLrzqt = AhwBna().OLrzqt();
            if (zAEQbTJ || AkhnZx()) {
                if (zKWHzl || zCopydefault) {
                    C33427mwJ c33427mwJ = new C33427mwJ();
                    java.util.List<AccessibilityServiceInfoDetails> listFIwbmz = c33427mwJ.fIwbmz();
                    if (listFIwbmz != null) {
                        listCopydefault = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(CollectionsKt___CollectionsKt.AYXKKw((java.lang.Iterable) c33427mwJ.copydefault(listOLrzqt), (java.lang.Iterable) listFIwbmz));
                    } else {
                        listCopydefault = c33427mwJ.copydefault(listOLrzqt);
                    }
                    if (C33129mqd.KWHzl((java.util.Collection) listFIwbmz) && zKWHzl && (listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33254msw.class))) != null) {
                        java.util.Iterator it = listKWHzl.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC33254msw) it.next()).KWHzl(listFIwbmz);
                        }
                    }
                    boolean z = true;
                    if (C33129mqd.KWHzl((java.util.Collection) listFIwbmz) || C33129mqd.KWHzl((java.util.Collection) listCopydefault)) {
                        if (zCopydefault) {
                            StateListAnimator stateListAnimator = C33427mwJ.Companion;
                            if (!stateListAnimator.isConnected() && C33129mqd.KWHzl((java.util.Collection) listFIwbmz)) {
                                stateListAnimator.OLrzqt(stateListAnimator.copydefault(listFIwbmz), stateListAnimator.gEmmrt());
                                stateListAnimator.AEQbTJ(true);
                            }
                            if (!stateListAnimator.fetchVPNInfo() && C33129mqd.KWHzl((java.util.Collection) listCopydefault)) {
                                stateListAnimator.OLrzqt(stateListAnimator.copydefault(listCopydefault), stateListAnimator.AYXKKw());
                                stateListAnimator.OLrzqt(true);
                            }
                            stateListAnimator.EZpvd(listFIwbmz, listCopydefault, (java.util.List<AccessibilityServiceInfoDetails>) null);
                        }
                        z = false;
                    }
                    StateListAnimator stateListAnimator2 = C33427mwJ.Companion;
                    java.util.List listGEmmrt = yDY.gEmmrt(stateListAnimator2.OLrzqt(), stateListAnimator2.KWHzl());
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
                    java.util.Iterator it2 = listGEmmrt.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(C33427mwJ.Companion.copydefault((java.lang.String) it2.next()));
                    }
                    java.util.List<AccessibilityServiceInfoDetails> listOLrzqt2 = c33427mwJ.OLrzqt(C56403yEb.QOLQEE(arrayList), listOLrzqt);
                    if (C33129mqd.KWHzl((java.util.Collection) listOLrzqt2)) {
                        if (z && zCopydefault) {
                            C33427mwJ.Companion.EZpvd((java.util.List<AccessibilityServiceInfoDetails>) null, (java.util.List<AccessibilityServiceInfoDetails>) null, listOLrzqt2);
                        }
                        StateListAnimator stateListAnimator3 = C33427mwJ.Companion;
                        java.util.Iterator it3 = yDY.gEmmrt(stateListAnimator3.OLrzqt(), stateListAnimator3.KWHzl()).iterator();
                        while (it3.hasNext()) {
                            C33427mwJ.Companion.copydefault(listOLrzqt2, (java.lang.String) it3.next());
                        }
                    }
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [470=4] */
        public final void EZpvd(final java.util.List<AccessibilityServiceInfoDetails> list, final java.util.List<AccessibilityServiceInfoDetails> list2, java.util.List<AccessibilityServiceInfoDetails> list3) {
            java.lang.String strGEmmrt;
            boolean zEZpvd;
            boolean zEZpvd2;
            if (C33129mqd.KWHzl((java.util.Collection) list3)) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                java.lang.String strDjBIcL = djBIcL();
                java.lang.String str = Build.VERSION.RELEASE;
                if (str == null) {
                    str = EZpvd() + Build.VERSION.SDK_INT;
                }
                Intrinsics.copydefault(list3);
                SecurityDetection securityDetection = new SecurityDetection(jCurrentTimeMillis, strDjBIcL, new RiskAttributes(str, list3));
                Json.Default r11 = Json.Default;
                r11.getSerializersModule();
                JsonElement jsonElementEncodeToJsonElement = r11.encodeToJsonElement(SecurityDetection.Companion.serializer(), securityDetection);
                Intrinsics.copydefault(jsonElementEncodeToJsonElement, "");
                JsonObject jsonObject = (JsonObject) jsonElementEncodeToJsonElement;
                final java.lang.String strCopydefault = copydefault(list3);
                if (strCopydefault != null) {
                    C32866mlf.onEvent$default(C33427mwJ.Companion.AEQbTJ(), (TrackChannel[]) null, new Function1() { // from class: o.mwH
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C33427mwJ.StateListAnimator.copydefault(strCopydefault, (EventParamsList) obj);
                        }
                    }, 1, (java.lang.Object) null);
                }
                OLrzqt(strCopydefault, djBIcL());
                BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new AccessibilityServiceHelper$Companion$reportSecurityIssueV2$2(jsonObject, null), 3, null);
                return;
            }
            if (C33129mqd.KWHzl((java.util.Collection) list) || C33129mqd.KWHzl((java.util.Collection) list2)) {
                java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) new java.util.ArrayList());
                java.util.List<AccessibilityServiceInfoDetails> listCopydefault = copydefault(OLrzqt());
                java.util.List<AccessibilityServiceInfoDetails> listCopydefault2 = copydefault(KWHzl());
                if (C33129mqd.KWHzl((java.util.Collection) list2)) {
                    strGEmmrt = AYXKKw();
                    Intrinsics.copydefault(list2);
                    C56406yEe.KWHzl(listFJNWhG, list2);
                } else {
                    strGEmmrt = "";
                }
                if (C33129mqd.KWHzl((java.util.Collection) list)) {
                    strGEmmrt = gEmmrt();
                    Intrinsics.copydefault(list);
                    C56406yEe.KWHzl(listFJNWhG, list);
                }
                if (C33129mqd.OLrzqt((java.lang.CharSequence) strGEmmrt)) {
                    if (list != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
                        java.util.Iterator<T> it = listCopydefault.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((AccessibilityServiceInfoDetails) it.next()).getPackageName());
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                        java.util.Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((AccessibilityServiceInfoDetails) it2.next()).getPackageName());
                        }
                        zEZpvd = Intrinsics.EZpvd(arrayList, arrayList2);
                    } else {
                        zEZpvd = true;
                    }
                    if (list2 != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault2, 10));
                        java.util.Iterator<T> it3 = listCopydefault2.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(((AccessibilityServiceInfoDetails) it3.next()).getPackageName());
                        }
                        java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
                        java.util.Iterator<T> it4 = list2.iterator();
                        while (it4.hasNext()) {
                            arrayList4.add(((AccessibilityServiceInfoDetails) it4.next()).getPackageName());
                        }
                        zEZpvd2 = Intrinsics.EZpvd(arrayList3, arrayList4);
                    } else {
                        zEZpvd2 = true;
                    }
                    if (zEZpvd && zEZpvd2) {
                        return;
                    }
                    long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
                    java.lang.String str2 = Build.VERSION.RELEASE;
                    if (str2 == null) {
                        str2 = EZpvd() + Build.VERSION.SDK_INT;
                    }
                    if (!AkhnZx()) {
                        listFJNWhG = yDY.AhwBna();
                    }
                    SecurityDetection securityDetection2 = new SecurityDetection(jCurrentTimeMillis2, strGEmmrt, new RiskAttributes(str2, listFJNWhG));
                    C32866mlf.onEvent$default(AEQbTJ(), (TrackChannel[]) null, new Function1() { // from class: o.mwQ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C33427mwJ.StateListAnimator.copydefault(list2, list, (EventParamsList) obj);
                        }
                    }, 1, (java.lang.Object) null);
                    Json.Default r0 = Json.Default;
                    r0.getSerializersModule();
                    JsonElement jsonElementEncodeToJsonElement2 = r0.encodeToJsonElement(SecurityDetection.Companion.serializer(), securityDetection2);
                    Intrinsics.copydefault(jsonElementEncodeToJsonElement2, "");
                    BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new AccessibilityServiceHelper$Companion$reportSecurityIssueV2$4((JsonObject) jsonElementEncodeToJsonElement2, list2, list, null), 3, null);
                }
            }
        }

        public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "low_list", str, false, 4, null);
            return Unit.INSTANCE;
        }

        public static final Unit copydefault(java.util.List list, java.util.List list2, EventParamsList eventParamsList) {
            java.lang.String strCopydefault;
            java.lang.String strCopydefault2;
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            if (list != null && (strCopydefault2 = C33427mwJ.Companion.copydefault((java.util.List<AccessibilityServiceInfoDetails>) list)) != null) {
                EventParamsList.put$default(eventParamsList, "medium_list", strCopydefault2, false, 4, null);
            }
            if (list2 != null && (strCopydefault = C33427mwJ.Companion.copydefault((java.util.List<AccessibilityServiceInfoDetails>) list2)) != null) {
                EventParamsList.put$default(eventParamsList, "high_list", strCopydefault, false, 4, null);
            }
            return Unit.INSTANCE;
        }

        public final void OLrzqt(final java.lang.String str, @NotNull final java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            if (str == null || str.length() == 0) {
                return;
            }
            C32866mlf.onEvent$default(copydefault(), (TrackChannel[]) null, new Function1() { // from class: o.mwK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C33427mwJ.StateListAnimator.EZpvd(str, str2, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }

        public static final Unit EZpvd(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "list", str, false, 4, null);
            EventParamsList.put$default(eventParamsList, FirebaseAnalytics.Param.LEVEL, str2, false, 4, null);
            return Unit.INSTANCE;
        }

        public final void EZpvd(java.util.List<AccessibilityServiceInfoDetails> list, java.lang.String str) {
            java.lang.String uid;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                User userOLrzqt = valueOf().OLrzqt();
                if (userOLrzqt == null || (uid = userOLrzqt.getUid()) == null) {
                    uid = "0";
                }
                SPUtils.put(str + uid, new Gson().toJson(list));
            }
        }

        public final java.util.List<AccessibilityServiceInfoDetails> copydefault(java.lang.String str) {
            java.lang.String uid;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                User userOLrzqt = valueOf().OLrzqt();
                if (userOLrzqt == null || (uid = userOLrzqt.getUid()) == null) {
                    uid = "0";
                }
                java.lang.String string = SPUtils.getString(str + uid, "");
                if (C33129mqd.OLrzqt((java.lang.CharSequence) string)) {
                    java.lang.Object objFromJson = new Gson().fromJson(string, new Application().getType());
                    Intrinsics.checkNotNullExpressionValue(objFromJson, "");
                    return (java.util.List) objFromJson;
                }
            }
            return new java.util.ArrayList();
        }

        public final void copydefault(java.util.List<AccessibilityServiceInfoDetails> list, java.lang.String str) {
            EZpvd(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(CollectionsKt___CollectionsKt.AYXKKw((java.lang.Iterable) copydefault(str), (java.lang.Iterable) list)), str);
        }

        public final java.lang.String copydefault(@NotNull java.util.List<AccessibilityServiceInfoDetails> list) {
            Intrinsics.checkNotNullParameter(list, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (AccessibilityServiceInfoDetails accessibilityServiceInfoDetails : list) {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) accessibilityServiceInfoDetails.getPackageName()) && C33129mqd.OLrzqt((java.lang.CharSequence) accessibilityServiceInfoDetails.getAppName())) {
                    linkedHashMap.put(accessibilityServiceInfoDetails.getPackageName(), accessibilityServiceInfoDetails.getAppName());
                }
            }
            if (linkedHashMap.isEmpty()) {
                return null;
            }
            return C33488mxR.KWHzl().toJson(linkedHashMap);
        }
    }

    public static final InterfaceC47278tmy values() {
        return ((InterfaceC47230tmC) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC47230tmC.class)).fmB();
    }

    public static final java.util.List EZpvd(C33427mwJ c33427mwJ) {
        return c33427mwJ.ejfBZ();
    }

    public final java.util.List<AccessibilityServiceInfoDetails> AkhnZx() {
        return (java.util.List) this.fetchVPNInfo.getValue();
    }

    public final java.util.List<AccessibilityServiceInfoDetails> ejfBZ() {
        android.content.Context applicationContext = C43246rlf.OLrzqt.valueOf().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        java.lang.Object systemService = applicationContext.getSystemService("accessibility");
        Intrinsics.copydefault(systemService, "");
        java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledAccessibilityServiceList = ((android.view.accessibility.AccessibilityManager) systemService).getEnabledAccessibilityServiceList(-1);
        android.content.pm.PackageManager packageManager = applicationContext.getPackageManager();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.accessibilityservice.AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            java.lang.String str = accessibilityServiceInfo.getResolveInfo().serviceInfo.packageName;
            try {
                java.lang.String string = packageManager.getApplicationLabel(accessibilityServiceInfo.getResolveInfo().serviceInfo.applicationInfo).toString();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add("android.permission.BIND_ACCESSIBILITY_SERVICE");
                Intrinsics.copydefault((java.lang.Object) str);
                arrayList.add(new AccessibilityServiceInfoDetails(string, str, arrayList2));
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                Unit unit = Unit.INSTANCE;
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [401=4] */
    public final java.util.List<AccessibilityServiceInfoDetails> fIwbmz() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.okinc.core.ok_app.security.Config config = (com.okinc.core.ok_app.security.Config) C48787ucK.AEQbTJ.EZpvd(this.isConnected, com.okinc.core.ok_app.security.Config.class);
        if (config != null) {
            for (AccessibilityServiceInfoDetails accessibilityServiceInfoDetails : AkhnZx()) {
                if (C33129mqd.KWHzl((java.util.Collection) config.getAppNameOnly())) {
                    java.util.List<java.lang.String> appNameOnly = config.getAppNameOnly();
                    if (!(appNameOnly instanceof java.util.Collection) || !appNameOnly.isEmpty()) {
                        java.util.Iterator<T> it = appNameOnly.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((java.lang.String) it.next()).equals(accessibilityServiceInfoDetails.getAppName())) {
                                arrayList.add(accessibilityServiceInfoDetails);
                                break;
                            }
                        }
                    }
                }
                if (C33129mqd.KWHzl((java.util.Collection) config.getPackageNameOnly())) {
                    java.util.List<java.lang.String> packageNameOnly = config.getPackageNameOnly();
                    if (!(packageNameOnly instanceof java.util.Collection) || !packageNameOnly.isEmpty()) {
                        java.util.Iterator<T> it2 = packageNameOnly.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if (((java.lang.String) it2.next()).equals(accessibilityServiceInfoDetails.getPackageName())) {
                                arrayList.add(accessibilityServiceInfoDetails);
                                break;
                            }
                        }
                    }
                }
                if (config.getAppPackageName() != null && (!config.getAppPackageName().isEmpty())) {
                    java.util.Map<java.lang.String, java.util.List<java.lang.String>> appPackageName = config.getAppPackageName();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : appPackageName.entrySet()) {
                        if (entry.getKey().equals(accessibilityServiceInfoDetails.getAppName())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    if (!linkedHashMap.isEmpty()) {
                        java.util.Iterator it3 = linkedHashMap.entrySet().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            java.lang.Iterable iterable = (java.lang.Iterable) ((Map.Entry) it3.next()).getValue();
                            if (!(iterable instanceof java.util.Collection) || !((java.util.Collection) iterable).isEmpty()) {
                                java.util.Iterator it4 = iterable.iterator();
                                while (it4.hasNext()) {
                                    if (((java.lang.String) it4.next()).equals(accessibilityServiceInfoDetails.getPackageName())) {
                                        arrayList.add(accessibilityServiceInfoDetails);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                if (C33129mqd.KWHzl((java.util.Collection) config.getAppNameRegex()) && AEQbTJ(config.getAppNameRegex(), accessibilityServiceInfoDetails.getAppName())) {
                    arrayList.add(accessibilityServiceInfoDetails);
                }
                if (C33129mqd.KWHzl((java.util.Collection) config.getPackageNameRegex()) && AEQbTJ(config.getPackageNameRegex(), accessibilityServiceInfoDetails.getPackageName())) {
                    arrayList.add(accessibilityServiceInfoDetails);
                }
            }
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (hashSet.add(((AccessibilityServiceInfoDetails) obj).getPackageName())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final boolean AEQbTJ(java.util.List<java.lang.String> list, java.lang.String str) {
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            return false;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (new Regex((java.lang.String) it.next()).matches(str)) {
                return true;
            }
        }
        return false;
    }

    public final java.util.List<AccessibilityServiceInfoDetails> copydefault(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            for (AccessibilityServiceInfoDetails accessibilityServiceInfoDetails : AkhnZx()) {
                if (!list.contains(accessibilityServiceInfoDetails.getPackageName())) {
                    arrayList.add(accessibilityServiceInfoDetails);
                }
            }
        }
        return arrayList;
    }

    public final java.util.List<AccessibilityServiceInfoDetails> OLrzqt(@NotNull java.util.List<AccessibilityServiceInfoDetails> list, @NotNull java.util.List<java.lang.String> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<AccessibilityServiceInfoDetails> listAkhnZx = AkhnZx();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listAkhnZx, 10));
        java.util.Iterator<T> it = listAkhnZx.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AccessibilityServiceInfoDetails) it.next()).getPackageName());
        }
        for (AccessibilityServiceInfoDetails accessibilityServiceInfoDetails : list) {
            if (!arrayList2.contains(accessibilityServiceInfoDetails.getPackageName())) {
                arrayList.add(accessibilityServiceInfoDetails);
            } else if (list2.contains(accessibilityServiceInfoDetails.getPackageName())) {
                arrayList.add(accessibilityServiceInfoDetails);
            }
        }
        return arrayList;
    }
}
