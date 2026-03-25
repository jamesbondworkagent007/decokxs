package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.core.util.ScannerActivity;
import com.okinc.im.bean.ChatOrigin;
import com.okinc.im.deeplink.IMDeeplinkHandler$handleJoinGroup$1;
import com.okinc.im.deeplink.IMDeeplinkHandler$handleNotifyChat$2;
import com.okinc.p2p.api.OTCService;
import com.okinc.web.WebActivity;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35360ntp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ntn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35358ntn implements InterfaceC43234rlT {
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX INFO: renamed from: o.ntn$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ntn.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final C34168nTy AEQbTJ(android.content.Context context) {
        return ((InterfaceC35331ntM) C58113yvE.copydefault(context.getApplicationContext(), InterfaceC35331ntM.class)).DCUTEI();
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [102=8] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        if (r0.equals("im/addRelation") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        if (r0.equals("im/addContacts") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        AEQbTJ(r6, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o.InterfaceC43234rlT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        C35360ntp c35360ntp = C35360ntp.EZpvd;
        C35360ntp.Activity activityEZpvd = c35360ntp.EZpvd();
        if (activityEZpvd instanceof C35360ntp.Activity.Application) {
            pUU.copydefault("IMDeeplinkHandler", "Deeplink " + interfaceC43233rlS.OLrzqt() + " blocked by common restriction check");
            return;
        }
        if (!(activityEZpvd instanceof C35360ntp.Activity.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        C35360ntp.Activity activityAEQbTJ = c35360ntp.AEQbTJ(interfaceC43233rlS.OLrzqt());
        if (activityAEQbTJ instanceof C35360ntp.Activity.Application) {
            pUU.copydefault("IMDeeplinkHandler", "Deeplink " + interfaceC43233rlS.OLrzqt() + " blocked by deeplink restriction check");
            return;
        }
        if (!(activityAEQbTJ instanceof C35360ntp.Activity.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        java.lang.String strOLrzqt = interfaceC43233rlS.OLrzqt();
        switch (strOLrzqt.hashCode()) {
            case -1983550666:
                if (strOLrzqt.equals("im/paidGroupPaymentDashboard")) {
                    gEmmrt(context, map);
                    return;
                }
                pUU.copydefault("IMDeeplinkHandler", "Unknown deeplink path: " + interfaceC43233rlS.OLrzqt());
                return;
            case -1272118163:
                if (strOLrzqt.equals("im/reviewGroupApplicants")) {
                    EZpvd(context, map);
                    return;
                }
                pUU.copydefault("IMDeeplinkHandler", "Unknown deeplink path: " + interfaceC43233rlS.OLrzqt());
                return;
            case -715577012:
                if (strOLrzqt.equals("im/conversationList")) {
                    OLrzqt(context);
                    return;
                }
                pUU.copydefault("IMDeeplinkHandler", "Unknown deeplink path: " + interfaceC43233rlS.OLrzqt());
                return;
            case 719763468:
                if (strOLrzqt.equals("im/notifyChat")) {
                    KWHzl(context, map);
                    return;
                }
                pUU.copydefault("IMDeeplinkHandler", "Unknown deeplink path: " + interfaceC43233rlS.OLrzqt());
                return;
            case 797600600:
                if (strOLrzqt.equals("im/newConversation")) {
                    copydefault(context);
                    return;
                }
                pUU.copydefault("IMDeeplinkHandler", "Unknown deeplink path: " + interfaceC43233rlS.OLrzqt());
                return;
            case 900610834:
                if (strOLrzqt.equals("im/leaderboard")) {
                    OLrzqt(context, map);
                    return;
                }
                pUU.copydefault("IMDeeplinkHandler", "Unknown deeplink path: " + interfaceC43233rlS.OLrzqt());
                return;
            case 1064951721:
                break;
            case 1077967186:
                break;
            case 1207076938:
                if (strOLrzqt.equals("im/joinGroup")) {
                    copydefault(context, map);
                    return;
                }
                pUU.copydefault("IMDeeplinkHandler", "Unknown deeplink path: " + interfaceC43233rlS.OLrzqt());
                return;
            default:
                pUU.copydefault("IMDeeplinkHandler", "Unknown deeplink path: " + interfaceC43233rlS.OLrzqt());
                return;
        }
    }

    public final void OLrzqt(android.content.Context context) {
        C33791nFz.KWHzl.OLrzqt(context, ChatOrigin.DEEPLINK, false);
    }

    public final void KWHzl(android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        OTCService oTCService;
        OTCService oTCService2;
        pUU.KWHzl("IMDeeplinkHandler", "handleNotifyChat => on deeplink");
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null) {
            pUU.copydefault("IMDeeplinkHandler", "handleNotifyChat: context is not an Activity");
            C55326xho.OLrzqt("Context is not an Activity, cannot navigate");
            return;
        }
        LifecycleOwner lifecycleOwner = activity instanceof LifecycleOwner ? (LifecycleOwner) activity : null;
        if (lifecycleOwner == null) {
            pUU.copydefault("IMDeeplinkHandler", "handleNotifyChat: Activity is not a LifecycleOwner");
            C55326xho.OLrzqt("Activity is not a LifecycleOwner, cannot navigate");
            return;
        }
        java.util.Set<java.lang.String> setKeySet = map.keySet();
        if (setKeySet.contains("c2cOrderID")) {
            java.lang.Object obj = map.get("c2cOrderID");
            java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str == null || (oTCService2 = (OTCService) C43251rlk.OLrzqt(OTCService.class)) == null) {
                return;
            }
            oTCService2.openP2PChatWithOrderID(activity, str);
            return;
        }
        if (setKeySet.contains("conversation")) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), sDN.copydefault.copydefault(), null, new IMDeeplinkHandler$handleNotifyChat$2(map, activity, null), 2, null);
        } else {
            if (!setKeySet.contains("orderList") || (oTCService = (OTCService) C43251rlk.OLrzqt(OTCService.class)) == null) {
                return;
            }
            oTCService.openOrderListWithIndex(activity, 0);
        }
    }

    public final void copydefault(android.content.Context context) {
        C33791nFz.KWHzl.AEQbTJ(context, ChatOrigin.DEEPLINK);
        android.content.Intent intentCopydefault = ActivityC37293orB.Companion.copydefault(context);
        intentCopydefault.setFlags(603979776);
        context.startActivity(intentCopydefault);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        boolean z;
        java.lang.Object objPrevious;
        java.lang.Object obj = map.get(RemoteMessageConst.Notification.CHANNEL_ID);
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.Object obj2 = map.get("groupInvitationCode");
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = str2;
        java.util.List<WeakReference<android.app.Activity>> listKWHzl = C32979mnm.EZpvd.KWHzl();
        if ((listKWHzl instanceof java.util.Collection) && listKWHzl.isEmpty()) {
            z = true;
        } else {
            java.util.Iterator<T> it = listKWHzl.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if ((weakReference.get() instanceof nEC) || (weakReference.get() instanceof ActivityC36573odX)) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        pUU.OLrzqt("IMDeeplinkHandler", "handleJoinGroup => isFreshLaunch: " + z);
        if (z) {
            C33791nFz.KWHzl.AEQbTJ(context, ChatOrigin.DEEPLINK);
        }
        java.util.List<WeakReference<android.app.Activity>> listKWHzl2 = C32979mnm.EZpvd.KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it2 = listKWHzl2.iterator();
        while (it2.hasNext()) {
            android.app.Activity activity = (android.app.Activity) ((WeakReference) it2.next()).get();
            if (activity != null) {
                arrayList.add(activity);
            }
        }
        java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            android.app.Activity activity2 = (android.app.Activity) objPrevious;
            if (!(activity2 instanceof ScannerActivity) && !(activity2 instanceof WebActivity) && !activity2.isFinishing()) {
                break;
            }
        }
        android.app.Activity activity3 = (android.app.Activity) objPrevious;
        if (activity3 == 0) {
            pUU.copydefault("IMDeeplinkHandler", "handleJoinGroup: no suitable Activity found in stack");
            C55326xho.OLrzqt("No suitable Activity available, cannot join group");
            return;
        }
        LifecycleOwner lifecycleOwner = activity3 instanceof LifecycleOwner ? (LifecycleOwner) activity3 : null;
        if (lifecycleOwner != null) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new IMDeeplinkHandler$handleJoinGroup$1(this, activity3, str, str3, context, null), 3, null);
        } else {
            pUU.copydefault("IMDeeplinkHandler", "handleJoinGroup: suitable Activity is not a LifecycleOwner");
            C55326xho.OLrzqt("Activity is not a LifecycleOwner, cannot join group");
        }
    }

    public final void AEQbTJ(android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.lang.Object obj = map.get("qr");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        oBK.KWHzl.copydefault(context, str);
    }

    public final void EZpvd(android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.lang.Long fieldNames;
        java.lang.Object obj = map.get("groupId");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        pUU.KWHzl("IMDeeplinkHandler", "handleJoinRequest => groupId: " + str);
        if (str == null || (fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(str)) == null) {
            return;
        }
        context.startActivity(ActivityC34183nUn.Companion.AEQbTJ(context, fieldNames.longValue()));
    }

    public final void gEmmrt(android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.lang.Long fieldNames;
        java.lang.Object obj = map.get("groupId");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        pUU.KWHzl("IMDeeplinkHandler", "handlePaidGroupPayment => groupId: " + str);
        if (str == null || (fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(str)) == null) {
            return;
        }
        context.startActivity(ActivityC34308nZd.Companion.AEQbTJ(context, java.lang.Long.valueOf(fieldNames.longValue())));
    }

    public final void OLrzqt(android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.lang.Object obj = map.get("activityId");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.Object obj2 = map.get("groupId");
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.lang.Object obj3 = map.get("teamLeaderboardType");
        java.lang.String str3 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        java.lang.Object obj4 = map.get("individualLeaderboardType");
        java.lang.String str4 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put("to", "LeaderboardVC");
        map2.put(FirebaseAnalytics.Param.DESTINATION, "leaderboard");
        if (str2 == null) {
            str2 = "";
        }
        map2.put("groupChatId", str2);
        if (str == null) {
            str = "";
        }
        map2.put("activityId", str);
        if (str3 == null) {
            str3 = "";
        }
        map2.put("teamLeaderboardType", str3);
        if (str4 == null) {
            str4 = "";
        }
        map2.put("individualLeaderboardType", str4);
        map2.put("minversion", "6.100.1");
        C35573nxs.copydefault.EZpvd(context, "/im/route", map2);
    }
}
