package o;

import android.content.DialogInterface;
import android.os.Build;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import com.okinc.business.defi.api.bean.ActivateTeeGuideModel;
import com.okinc.business.defi.biz.net.bean.EventItem;
import com.okinc.business.defi.biz.net.bean.SingleTeeStatus;
import com.okinc.business.defi.biz.net.bean.SingleTeeStatusAndWarringInfo;
import com.okinc.business.defi.biz.net.bean.TeeMetadata;
import com.okinc.business.defi.biz.net.bean.TeeStatus;
import com.okinc.business.defi.wallet.bean.WalletCreatedData;
import com.okinc.business.defi.wallet.tee.status.TeeExtensionKt$dealWithTeeServiceNotification$1;
import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import o.dTH;
import o.dTK;
import o.fSU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fXg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17922fXg {
    public static final dTH OLrzqt(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        dTQ dtq = (dTQ) C43251rlk.OLrzqt(dTQ.class);
        if (dtq == null || !dtq.copydefault()) {
            return new dTH.FragmentManager(abstractC12782ctV.DbNXlk());
        }
        if (!abstractC12782ctV.AubY()) {
            return new dTH.FragmentManager(abstractC12782ctV.DbNXlk());
        }
        if (abstractC12782ctV.DTwDnp()) {
            long jFIwbmz = abstractC12782ctV.fIwbmz() - java.lang.System.currentTimeMillis();
            if (AEQbTJ(abstractC12782ctV) || jFIwbmz > 172800000) {
                return new dTH.Activity(abstractC12782ctV.DbNXlk(), abstractC12782ctV.fIwbmz());
            }
            if (jFIwbmz > 1800000) {
                return new dTH.StateListAnimator(abstractC12782ctV.DbNXlk(), abstractC12782ctV.fIwbmz());
            }
            return new dTH.TaskDescription(abstractC12782ctV.DbNXlk(), abstractC12782ctV.fIwbmz());
        }
        if (abstractC12782ctV.QbewEr()) {
            if (abstractC12782ctV.AuCTel()) {
                return new dTH.Dialog(abstractC12782ctV.DbNXlk());
            }
            return new dTH.ActionBar(abstractC12782ctV.DbNXlk());
        }
        return new dTH.FragmentManager(abstractC12782ctV.DbNXlk());
    }

    public static final dTH AEQbTJ(TeeStatus teeStatus, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (teeStatus == null) {
            return new dTH.FragmentManager(str);
        }
        if (teeStatus.isActive()) {
            long expiredTimestamp = teeStatus.getExpiredTimestamp() - java.lang.System.currentTimeMillis();
            if (AEQbTJ(teeStatus) || expiredTimestamp > 172800000) {
                return new dTH.Activity(str, teeStatus.getExpiredTimestamp());
            }
            if (expiredTimestamp > 1800000) {
                return new dTH.StateListAnimator(str, teeStatus.getExpiredTimestamp());
            }
            if (expiredTimestamp >= 0) {
                return new dTH.TaskDescription(str, teeStatus.getExpiredTimestamp());
            }
            return new dTH.ActionBar(str);
        }
        if (teeStatus.isCreated()) {
            if (teeStatus.getUserDisable()) {
                return new dTH.Dialog(str);
            }
            return new dTH.ActionBar(str);
        }
        return new dTH.FragmentManager(str);
    }

    public static final boolean AEQbTJ(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return abstractC12782ctV.uzCIH() == 1 && abstractC12782ctV.KWHzl();
    }

    public static final boolean AEQbTJ(TeeStatus teeStatus) {
        java.lang.Integer upgradeStatus;
        return teeStatus != null && (upgradeStatus = teeStatus.getUpgradeStatus()) != null && upgradeStatus.intValue() == 1 && Intrinsics.EZpvd(teeStatus.getAutoRenew(), java.lang.Boolean.TRUE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.lang.Integer */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public static final dTK EZpvd(@NotNull AbstractC12782ctV abstractC12782ctV) {
        SingleTeeStatus singleTeeStatus;
        TeeStatus teeStatus;
        SingleTeeStatus singleTeeStatus2;
        TeeStatus teeStatus2;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        dTQ dtq = (dTQ) C43251rlk.OLrzqt(dTQ.class);
        if (dtq != null && !dtq.OLrzqt(abstractC12782ctV.DbNXlk())) {
            return new dTK.Fragment(abstractC12782ctV.DbNXlk());
        }
        if (!abstractC12782ctV.AubY()) {
            return new dTK.Fragment(abstractC12782ctV.DbNXlk());
        }
        SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfoOJuSTm = abstractC12782ctV.OJuSTm();
        java.lang.Integer numValueOf = 0;
        numValueOf = 0;
        numValueOf = 0;
        if (((singleTeeStatusAndWarringInfoOJuSTm == null || (singleTeeStatus2 = singleTeeStatusAndWarringInfoOJuSTm.getSingleTeeStatus()) == null || (teeStatus2 = singleTeeStatus2.getTeeStatus()) == null) ? null : java.lang.Integer.valueOf(teeStatus2.getModel())) != null) {
            dTK.Activity activity = dTK.Companion;
            SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfoOJuSTm2 = abstractC12782ctV.OJuSTm();
            if (singleTeeStatusAndWarringInfoOJuSTm2 != null && (singleTeeStatus = singleTeeStatusAndWarringInfoOJuSTm2.getSingleTeeStatus()) != null && (teeStatus = singleTeeStatus.getTeeStatus()) != null) {
                numValueOf = java.lang.Integer.valueOf(teeStatus.getModel());
            }
            Intrinsics.copydefault(numValueOf);
            return activity.copydefault(numValueOf.intValue(), abstractC12782ctV.DbNXlk());
        }
        if (abstractC12782ctV.DTwDnp()) {
            return new dTK.Application(abstractC12782ctV.DbNXlk());
        }
        if (abstractC12782ctV.QbewEr()) {
            if (!abstractC12782ctV.AuCTel()) {
                return new dTK.ActionBar(abstractC12782ctV.DbNXlk(), 0, 2, numValueOf);
            }
            return new dTK.Fragment(abstractC12782ctV.DbNXlk());
        }
        return new dTK.Fragment(abstractC12782ctV.DbNXlk());
    }

    public static /* synthetic */ void showSAGuide$default(android.content.Context context, ActivateTeeGuideModel activateTeeGuideModel, androidx.fragment.app.FragmentManager fragmentManager, Function1 function1, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            fragmentManager = null;
        }
        if ((i & 8) != 0) {
            function1 = null;
        }
        if ((i & 16) != 0) {
            function0 = null;
        }
        EZpvd(context, activateTeeGuideModel, fragmentManager, function1, function0);
    }

    public static final void EZpvd(@NotNull android.content.Context context, @NotNull ActivateTeeGuideModel activateTeeGuideModel, androidx.fragment.app.FragmentManager fragmentManager, final Function1<? super WalletCreatedData, Unit> function1, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(activateTeeGuideModel, "");
        boolean z = false;
        if (!SPUtils.getBoolean("TEE_SHOW_GUILD_KEY", false)) {
            dTQ dtq = (dTQ) C43251rlk.OLrzqt(dTQ.class);
            if (dtq != null && dtq.OLrzqt(activateTeeGuideModel.getAccountId())) {
                z = true;
            }
            android.app.Activity activityOLrzqt = C33569myt.OLrzqt(context);
            AbstractActivityC33041mov abstractActivityC33041mov = activityOLrzqt instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activityOLrzqt : null;
            if (abstractActivityC33041mov == null) {
                return;
            }
            if (fragmentManager == null) {
                fragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(fragmentManager, "");
            }
            if (fragmentManager.isStateSaved()) {
                if (function0 != null) {
                    function0.invoke();
                }
            } else {
                if (z) {
                    androidx.fragment.app.Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag("ActivateSAGuideBottomSheet");
                    if (fragmentFindFragmentByTag == null || !fragmentFindFragmentByTag.isAdded()) {
                        fST fstKWHzl = fST.Companion.KWHzl(activateTeeGuideModel);
                        fstKWHzl.OLrzqt(function1);
                        fstKWHzl.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.fXf
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                                C17922fXg.EZpvd(function0, dialogInterface);
                            }
                        });
                        fstKWHzl.show(fragmentManager, "ActivateSAGuideBottomSheet");
                        return;
                    }
                    return;
                }
                abstractActivityC33041mov.getActivityResultRegistry().register("ActivateSAGuideActivityResult", fSU.Application.OLrzqt, new ActivityResultCallback() { // from class: o.fXd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // androidx.activity.result.ActivityResultCallback
                    public final void onActivityResult(java.lang.Object obj) {
                        C17922fXg.OLrzqt(function1, function0, (ActivityResult) obj);
                    }
                }).launch(activateTeeGuideModel);
            }
        }
    }

    public static final void EZpvd(Function0 function0, android.content.DialogInterface dialogInterface) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void OLrzqt(Function1 function1, Function0 function0, ActivityResult activityResult) {
        WalletCreatedData walletCreatedData;
        android.os.Parcelable parcelableExtra;
        android.content.Intent data = activityResult.getData();
        if (data != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra = (android.os.Parcelable) data.getParcelableExtra("result_key_wallet_created_data", WalletCreatedData.class);
            } else {
                parcelableExtra = data.getParcelableExtra("result_key_wallet_created_data");
            }
            walletCreatedData = (WalletCreatedData) parcelableExtra;
        } else {
            walletCreatedData = null;
        }
        if (activityResult.getResultCode() != -1 || walletCreatedData == null) {
            if (function0 != null) {
                function0.invoke();
            }
        } else if (function1 != null) {
            function1.invoke(walletCreatedData);
        }
    }

    public static final boolean copydefault(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull android.content.Context context, @NotNull java.lang.String str) {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (!interfaceC9738bbJ.zLjUOn() || !(!SPUtils.getBoolean("TEE_SHOW_GUILD_KEY", false))) {
            return false;
        }
        dTQ dtq = (dTQ) C43251rlk.OLrzqt(dTQ.class);
        if (dtq != null && dtq.OLrzqt(interfaceC9738bbJ.DbNXlk())) {
            android.app.Activity activityOLrzqt = C33569myt.OLrzqt(context);
            AbstractActivityC33041mov abstractActivityC33041mov = activityOLrzqt instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activityOLrzqt : null;
            if (abstractActivityC33041mov == null || (supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager()) == null || supportFragmentManager.isStateSaved()) {
                return false;
            }
            androidx.fragment.app.Fragment fragmentFindFragmentByTag = supportFragmentManager.findFragmentByTag("ActivateSAGuideBottomSheet");
            if (fragmentFindFragmentByTag == null || !fragmentFindFragmentByTag.isAdded()) {
                fST.Companion.KWHzl(new ActivateTeeGuideModel(interfaceC9738bbJ.DbNXlk(), false, false, (java.lang.String) null, 0, 0, 0, str, 94, (DefaultConstructorMarker) null)).show(supportFragmentManager, "ActivateSAGuideBottomSheet");
            }
            return true;
        }
        if (!interfaceC9738bbJ.QbewEr() || interfaceC9738bbJ.DTwDnp()) {
            return false;
        }
        fSU.Companion.AEQbTJ(context, new ActivateTeeGuideModel(interfaceC9738bbJ.DbNXlk(), false, false, (java.lang.String) null, 0, 0, 0, str, 94, (DefaultConstructorMarker) null));
        return true;
    }

    public static final boolean OLrzqt(@NotNull InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return interfaceC9738bbJ.AubY() && !SPUtils.getBoolean("TEE_SHOW_GUILD_KEY", false);
    }

    public static final boolean EZpvd(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return SPUtils.getBoolean("TEE_SHOW_GUILD_KEY", false);
    }

    public static final void AEQbTJ(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        SPUtils.put("TEE_SHOW_GUILD_KEY", java.lang.Boolean.TRUE);
    }

    public static final <T> boolean OLrzqt(@NotNull java.lang.Iterable<? extends T> iterable, @NotNull java.lang.Iterable<? extends T> iterable2) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(iterable2, "");
        return CollectionsKt___CollectionsKt.fvQaOB(iterable2) || (CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) iterable, (java.lang.Iterable) iterable2).isEmpty() ^ true);
    }

    public static final java.util.Set<java.lang.Long> copydefault(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        java.util.List<C10854bwM> listOFhtUX = abstractC12782ctV.OFhtUX();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOFhtUX, 10));
        java.util.Iterator<T> it = listOFhtUX.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Long.valueOf(((C10854bwM) it.next()).fetchVPNInfo()));
        }
        return CollectionsKt___CollectionsKt.OqFWZa(arrayList);
    }

    public static final int EZpvd(@NotNull TeeMetadata teeMetadata) {
        EventItem eventItem;
        Intrinsics.checkNotNullParameter(teeMetadata, "");
        java.util.List<EventItem> maintenanceEventList = teeMetadata.getMaintenanceEventList();
        if (maintenanceEventList == null || (eventItem = (EventItem) CollectionsKt___CollectionsKt.firstOrNull(maintenanceEventList)) == null) {
            return 0;
        }
        return eventItem.getEventType();
    }

    public static final int copydefault(TeeMetadata teeMetadata) {
        EventItem eventItem;
        java.util.List<EventItem> maintenanceEventList = teeMetadata.getMaintenanceEventList();
        if (maintenanceEventList == null || (eventItem = (EventItem) CollectionsKt___CollectionsKt.firstOrNull(maintenanceEventList)) == null || C33129mqd.OLrzqt(SPUtils.getLong("tee_show_notification_key", 0L), java.lang.Long.valueOf(eventItem.getEventId()))) {
            return 0;
        }
        SPUtils.put("tee_show_notification_key", java.lang.Long.valueOf(eventItem.getEventId()));
        return eventItem.getEventType();
    }

    public static final void KWHzl(@NotNull TeeMetadata teeMetadata) {
        Intrinsics.checkNotNullParameter(teeMetadata, "");
        copydefault(copydefault(teeMetadata));
    }

    public static final void copydefault(int i) {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new TeeExtensionKt$dealWithTeeServiceNotification$1(i, null), 3, null);
    }

    public static final int OLrzqt() {
        java.lang.Integer num = SPUtils.getInt("TEE_LAST_MODEL_KEY", 0);
        Intrinsics.checkNotNullExpressionValue(num, "");
        return num.intValue();
    }

    public static final void EZpvd(int i) {
        SPUtils.put("TEE_LAST_MODEL_KEY", java.lang.Integer.valueOf(i));
    }

    public static final void KWHzl() {
        SPUtils.remove("TEE_LAST_MODEL_KEY");
    }
}
