package com.okinc.core.ok_app;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleKt;
import com.okinc.core.ok_app.ModeManager;
import com.okinc.core.ok_app.homepage.lite.OKLiteMainContainerActivity;
import com.okinc.core.ok_app.homepage.pro.MainActivity;
import com.okinc.core.util.SPUtils;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.rxutils.RxBus;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33240msi;
import o.AbstractC33244msm;
import o.AbstractC33247msp;
import o.ActivityC33327muP;
import o.C32979mnm;
import o.C33102mqC;
import o.C33129mqd;
import o.C33234msc;
import o.C33239msh;
import o.C33257msz;
import o.C33569myt;
import o.C34703nhO;
import o.C34704nhP;
import o.C43251rlk;
import o.C56390yDp;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC33170mrR;
import o.InterfaceC33174mrV;
import o.InterfaceC33207msB;
import o.InterfaceC33208msC;
import o.InterfaceC33236mse;
import o.InterfaceC33254msw;
import o.InterfaceC33256msy;
import o.InterfaceC56387yDm;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class ModeManager {
    public static final ModeManager EZpvd = new ModeManager();
    public static final Map<String, Function1<Boolean, Unit>> copydefault = new LinkedHashMap();
    public static final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.mqI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ModeManager.valueOf();
        }
    });
    public static final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.mqH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ModeManager.AhwBna();
        }
    });
    public static final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.mqJ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ModeManager.gEmmrt();
        }
    });
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Class<? extends Activity> AkhnZx() {
        return OKLiteMainContainerActivity.class;
    }

    private ModeManager() {
    }

    public static final MutableStateFlow valueOf() {
        return StateFlowKt.MutableStateFlow(Integer.valueOf(EZpvd.fJNWhG()));
    }

    public final MutableStateFlow<Integer> fIwbmz() {
        return (MutableStateFlow) OLrzqt.getValue();
    }

    public static final MutableStateFlow AhwBna() {
        return EZpvd.fIwbmz();
    }

    public final StateFlow<Integer> DbNXlk() {
        return (StateFlow) KWHzl.getValue();
    }

    public final OKComplianceRestrictionService isConnected() {
        return (OKComplianceRestrictionService) djBIcL.getValue();
    }

    public static final OKComplianceRestrictionService gEmmrt() {
        return (OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class);
    }

    public final int fJNWhG() {
        if (hDKMBd()) {
            return 3;
        }
        if (getNewProxyInstance()) {
            return 5;
        }
        if (AuCTel()) {
            return 2;
        }
        return uzCIH() ? 1 : 0;
    }

    public final boolean AuCTel() {
        return C34704nhP.copydefault.copydefault() && Intrinsics.EZpvd((Object) fetchVPNInfo(), (Object) "lite_home_mode");
    }

    public final boolean uzCIH() {
        return C34704nhP.copydefault.copydefault() && Intrinsics.EZpvd((Object) fetchVPNInfo(), (Object) "pro_home_mode");
    }

    public final boolean getNewProxyInstance() {
        return C34704nhP.copydefault.copydefault() && Intrinsics.EZpvd((Object) fetchVPNInfo(), (Object) "pro_pay_home_mode");
    }

    public final boolean hDKMBd() {
        return C34704nhP.copydefault.copydefault() && SPUtils.getBoolean("on_chain_key", false);
    }

    public final void wlaJM() {
        SPUtils.put("on_chain_key", Boolean.TRUE);
        fIwbmz().setValue(3);
    }

    public final void values() {
        SPUtils.put("on_chain_key", Boolean.FALSE);
    }

    public final String fetchVPNInfo() {
        String string = SPUtils.getString("home_mode", "pro_home_mode", "home_mode_file");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        values();
        SPUtils.put("home_mode", str, "home_mode_file");
        fIwbmz().setValue(Integer.valueOf(C33102mqC.OLrzqt(str)));
    }

    public static final Unit copydefault(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: com.okinc.core.ok_app.ModeManager */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean switchAppMode$default(ModeManager modeManager, Context context, int i, boolean z, int i2, Bundle bundle, boolean z2, boolean z3, Function1 function1, int i3, Object obj) {
        return modeManager.OLrzqt(context, i, z, (i3 & 8) != 0 ? 0 : i2, bundle, (i3 & 32) != 0 ? false : z2, (i3 & 64) != 0 ? false : z3, (i3 & 128) != 0 ? new Function1() { // from class: o.mqK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return ModeManager.copydefault(((java.lang.Boolean) obj2).booleanValue());
            }
        } : function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OLrzqt(@NotNull Context context, int i, boolean z, int i2, Bundle bundle, boolean z2, boolean z3, @NotNull Function1<? super Boolean, Unit> function1) {
        Pair<Boolean, Integer> pairAEQbTJ;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33254msw.class));
        InterfaceC33254msw interfaceC33254msw = listKWHzl != null ? (InterfaceC33254msw) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl) : null;
        if (interfaceC33254msw != null && interfaceC33254msw.EZpvd()) {
            pUU.KWHzl("OKAppService", "switchAppMode: intercepted by AccountDependencyExtension");
            EZpvd(C33102mqC.KWHzl(i));
            interfaceC33254msw.OLrzqt(context);
            copydefault(context, bundle);
            KWHzl(context, i2, 0);
            function1.invoke(Boolean.FALSE);
            return false;
        }
        pUU.KWHzl("OKAppService", "switchAppMode: " + i + ", current app mode: " + DbNXlk().getValue() + ", current exchange mode: " + fetchVPNInfo());
        if (i == 1) {
            pairAEQbTJ = AEQbTJ(context, i, z, i2, bundle, z2, function1);
        } else if (i == 2) {
            pairAEQbTJ = C56390yDp.OLrzqt(Boolean.valueOf(EZpvd(context, i, z, i2, bundle, z2, z3, function1)), Integer.valueOf(i));
        } else if (i == 3) {
            pairAEQbTJ = C56390yDp.OLrzqt(Boolean.valueOf(OLrzqt(context, i, z, i2, bundle, z2, function1)), Integer.valueOf(i));
        } else if (i != 5) {
            pUU.copydefault("OKAppService", "switchAppMode: mode is not support --- " + i);
            Boolean bool = Boolean.FALSE;
            function1.invoke(bool);
            pairAEQbTJ = C56390yDp.OLrzqt(bool, 0);
        }
        boolean zBooleanValue = pairAEQbTJ.component1().booleanValue();
        int iIntValue = pairAEQbTJ.component2().intValue();
        if (zBooleanValue) {
            fIwbmz().setValue(Integer.valueOf(iIntValue));
        }
        return zBooleanValue;
    }

    public final boolean OLrzqt(Context context, int i, boolean z, int i2, Bundle bundle, boolean z2, final Function1<? super Boolean, Unit> function1) {
        if (z2) {
            AEQbTJ(context, i, z, i2, bundle, function1);
        } else if (!hDKMBd()) {
            if (!copydefault(context, i, z, i2, bundle, "CeFi", function1)) {
                return false;
            }
        } else {
            KWHzl(context, false, bundle, new Function1() { // from class: o.mqA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ModeManager.gEmmrt(function1, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            return false;
        }
        RxBus.KWHzl("EVENT_OKEX_HOME_MODE_CHANGE");
        return true;
    }

    public static final Unit gEmmrt(Function1 function1, boolean z) {
        function1.invoke(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public final boolean EZpvd(Context context, int i, boolean z, int i2, Bundle bundle, boolean z2, boolean z3, final Function1<? super Boolean, Unit> function1) {
        if (AuCTelauCTel()) {
            function1.invoke(Boolean.FALSE);
            return false;
        }
        if (z2) {
            copydefault(context, i, z, i2, bundle, function1);
        } else if (hDKMBd()) {
            if (!AEQbTJ(context, i, z, i2, bundle, "DeFi", function1)) {
                return false;
            }
        } else if (!AuCTel()) {
            if (!AEQbTJ(context, i, z, i2, bundle, "Pro", function1)) {
                return false;
            }
        } else {
            AEQbTJ(context, z && z3, bundle, new Function1() { // from class: o.mqM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ModeManager.AEQbTJ(function1, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            return false;
        }
        RxBus.KWHzl("EVENT_OKEX_HOME_MODE_CHANGE");
        return true;
    }

    public static final Unit AEQbTJ(Function1 function1, boolean z) {
        function1.invoke(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair<Boolean, Integer> AEQbTJ(final Context context, final int i, boolean z, final int i2, Bundle bundle, boolean z2, final Function1<? super Boolean, Unit> function1) {
        C33257msz c33257mszKWHzl;
        Object next;
        if (AuCTelauCTel()) {
            Boolean bool = Boolean.FALSE;
            function1.invoke(bool);
            return C56390yDp.OLrzqt(bool, 0);
        }
        if (z2) {
            OLrzqt(context, i, z, i2, bundle, function1);
            RxBus.KWHzl("EVENT_OKEX_HOME_MODE_CHANGE");
            return C56390yDp.OLrzqt(Boolean.TRUE, Integer.valueOf(i));
        }
        if (i == 5) {
            if (!EZpvd(5)) {
                pUU.KWHzl("OKAppService", "can't switch to " + i + ", use fallback");
                List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33256msy.class));
                if (listKWHzl != null) {
                    Iterator it = listKWHzl.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.EZpvd(((InterfaceC33256msy) next).copydefault(), AbstractC33244msm.TaskDescription.KWHzl)) {
                            break;
                        }
                    }
                    InterfaceC33256msy interfaceC33256msy = (InterfaceC33256msy) next;
                    c33257mszKWHzl = interfaceC33256msy != null ? interfaceC33256msy.KWHzl() : null;
                }
                AbstractC33244msm abstractC33244msmEZpvd = c33257mszKWHzl != null ? c33257mszKWHzl.EZpvd() : null;
                if (abstractC33244msmEZpvd != null) {
                    Bundle bundleBundleOf = bundle == null ? BundleKt.bundleOf() : bundle;
                    Bundle bundleKWHzl = c33257mszKWHzl.KWHzl();
                    if (bundleKWHzl != null) {
                        bundleBundleOf.putAll(bundleKWHzl);
                    }
                    if (Intrinsics.EZpvd(abstractC33244msmEZpvd.KWHzl(), AbstractC33247msp.StateListAnimator.AEQbTJ)) {
                        AbstractC33240msi abstractC33240msiCopydefault = C33239msh.copydefault(c33257mszKWHzl.EZpvd());
                        Intrinsics.copydefault(abstractC33240msiCopydefault);
                        if (((InterfaceC33236mse) C43251rlk.AEQbTJ(C56524yIo.AEQbTJ(InterfaceC33236mse.class))).KWHzl(abstractC33240msiCopydefault)) {
                            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null))), null, null, new ModeManager$toPro$2(abstractC33240msiCopydefault, context, bundleBundleOf, function1, null), 3, null);
                            return C56390yDp.OLrzqt(Boolean.TRUE, 2);
                        }
                    } else {
                        int iEZpvd = C33234msc.EZpvd(abstractC33244msmEZpvd);
                        if (iEZpvd == DbNXlk().getValue().intValue()) {
                            Boolean bool2 = Boolean.TRUE;
                            function1.invoke(bool2);
                            return C56390yDp.OLrzqt(bool2, Integer.valueOf(iEZpvd));
                        }
                        boolean zSwitchAppMode$default = switchAppMode$default(this, context, iEZpvd, z, i2, bundleBundleOf, false, false, function1, 96, null);
                        return C56390yDp.OLrzqt(Boolean.valueOf(zSwitchAppMode$default), Integer.valueOf(zSwitchAppMode$default ? iEZpvd : 0));
                    }
                }
                Boolean bool3 = Boolean.FALSE;
                function1.invoke(bool3);
                return C56390yDp.OLrzqt(bool3, 0);
            }
            EZpvd(C33102mqC.KWHzl(i));
            AEQbTJ(context, z, bundle, i, new Function1() { // from class: o.mqB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ModeManager.AhwBna(function1, context, i2, i, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        } else if (hDKMBd()) {
            if (!EZpvd(context, i, z, i2, bundle, "DeFi", function1)) {
                return C56390yDp.OLrzqt(Boolean.FALSE, 0);
            }
        } else if (uzCIH() || getNewProxyInstance()) {
            boolean z3 = !uzCIH() ? i != 5 : i != 1;
            EZpvd(C33102mqC.KWHzl(i));
            if (z && !z3) {
                i = 1;
            }
            AEQbTJ(context, (boolean) i, bundle, i, function1);
        } else if (!EZpvd(context, i, z, i2, bundle, "Lite", function1)) {
            return C56390yDp.OLrzqt(Boolean.FALSE, 0);
        }
        RxBus.KWHzl("EVENT_OKEX_HOME_MODE_CHANGE");
        return C56390yDp.OLrzqt(Boolean.TRUE, Integer.valueOf(i));
    }

    public static final Unit AhwBna(Function1 function1, Context context, int i, int i2, boolean z) {
        function1.invoke(Boolean.valueOf(z));
        EZpvd.KWHzl(context, i, i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(@NotNull Context context, int i, int i2) {
        String name;
        List listKWHzl;
        InterfaceC33207msB interfaceC33207msB;
        Class<?> clsCopydefault;
        InterfaceC33254msw interfaceC33254msw;
        Intrinsics.checkNotNullParameter(context, "");
        List listKWHzl2 = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33254msw.class));
        InterfaceC33254msw interfaceC33254msw2 = listKWHzl2 != null ? (InterfaceC33254msw) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl2) : null;
        if (interfaceC33254msw2 != null && interfaceC33254msw2.EZpvd()) {
            List listKWHzl3 = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33254msw.class));
            if (listKWHzl3 != null && (interfaceC33254msw = (InterfaceC33254msw) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl3)) != null) {
                name = interfaceC33254msw.AEQbTJ();
            }
        } else if (i2 == 2) {
            name = AkhnZx().getName();
        } else if (i2 == 1 || i2 == 5) {
            name = MainActivity.class.getName();
        } else {
            name = (i2 != 3 || (listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33207msB.class))) == null || (interfaceC33207msB = (InterfaceC33207msB) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) == null || (clsCopydefault = interfaceC33207msB.copydefault()) == null) ? null : clsCopydefault.getName();
        }
        if (i == 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(C32979mnm.EZpvd.KWHzl());
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                WeakReference weakReference = (WeakReference) arrayList.get(i3);
                Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                if (!Intrinsics.EZpvd((Object) name, (Object) (activity != null ? activity.getClass().getName() : null)) && !(activity instanceof InterfaceC33170mrR) && activity != null) {
                    activity.finish();
                }
            }
            return;
        }
        if (i == 1 && (context instanceof Activity)) {
            ((Activity) context).finish();
        }
    }

    public final void EZpvd(@NotNull Context context, boolean z, @NotNull TargetActivity targetActivity, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(targetActivity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        copydefault(context, z, targetActivity, bundle);
        copydefault(context, bundle);
    }

    public final void AEQbTJ(String str) {
        Function1<Boolean, Unit> function1Remove;
        if (str == null || (function1Remove = copydefault.remove(str)) == null) {
            return;
        }
        function1Remove.invoke(Boolean.FALSE);
    }

    public final void copydefault(@NotNull Context context, boolean z, @NotNull TargetActivity targetActivity, @NotNull Bundle bundle) {
        InterfaceC33207msB interfaceC33207msB;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(targetActivity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (targetActivity instanceof TargetActivity.Pro) {
            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            intent.putExtras(bundle);
            context.startActivity(intent);
        } else if (targetActivity instanceof TargetActivity.Lite) {
            Intent intent2 = new Intent(context, AkhnZx());
            intent2.putExtras(bundle);
            context.startActivity(intent2);
        } else {
            if (!(targetActivity instanceof TargetActivity.Wallet)) {
                throw new NoWhenBranchMatchedException();
            }
            List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33207msB.class));
            if (listKWHzl == null || (interfaceC33207msB = (InterfaceC33207msB) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) == null) {
                return;
            }
            interfaceC33207msB.EZpvd(context, z, bundle);
        }
    }

    public final void KWHzl(@NotNull Context context, boolean z, @NotNull Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (z) {
            String str = System.currentTimeMillis() + "_" + function1;
            copydefault.put(str, function1);
            ActivityC33327muP.Companion.KWHzl(context, str);
            return;
        }
        function1.invoke(Boolean.FALSE);
    }

    public final void AEQbTJ(final Context context, boolean z, final Bundle bundle, final int i, final Function1<? super Boolean, Unit> function1) {
        values();
        KWHzl(context, z, new Function1() { // from class: o.mqL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ModeManager.OLrzqt(bundle, i, context, function1, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit OLrzqt(Bundle bundle, int i, Context context, Function1 function1, boolean z) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("app_mode", i);
        EZpvd.EZpvd(context, z, TargetActivity.Pro.EZpvd, bundle);
        function1.invoke(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final Context context, boolean z, final Bundle bundle, final Function1<? super Boolean, Unit> function1) {
        values();
        KWHzl(context, z, new Function1() { // from class: o.mqF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ModeManager.AEQbTJ(bundle, context, function1, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit AEQbTJ(Bundle bundle, Context context, Function1 function1, boolean z) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        EZpvd.EZpvd(context, z, TargetActivity.Lite.copydefault, bundle);
        function1.invoke(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public final void KWHzl(final Context context, boolean z, final Bundle bundle, final Function1<? super Boolean, Unit> function1) {
        wlaJM();
        KWHzl(context, z, new Function1() { // from class: o.mqO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ModeManager.EZpvd(bundle, context, function1, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit EZpvd(Bundle bundle, Context context, Function1 function1, boolean z) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        EZpvd.EZpvd(context, z, TargetActivity.Wallet.AEQbTJ, bundle);
        function1.invoke(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "");
        Activity activityOLrzqt = C33569myt.OLrzqt(context);
        if (activityOLrzqt != null) {
            if (bundle != null && bundle.getBoolean("fade_animation", false)) {
                activityOLrzqt.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            } else {
                activityOLrzqt.overridePendingTransition(0, 0);
            }
        }
    }

    public static final Unit KWHzl(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.okinc.core.ok_app.ModeManager */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean autoSwitchMode$default(ModeManager modeManager, Context context, boolean z, boolean z2, Bundle bundle, Function1 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if ((i & 16) != 0) {
            function1 = new Function1() { // from class: o.mqG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return ModeManager.KWHzl(((java.lang.Boolean) obj2).booleanValue());
                }
            };
        }
        return modeManager.KWHzl(context, z, z2, bundle2, (Function1<? super Boolean, Unit>) function1);
    }

    public final boolean KWHzl(@NotNull Context context, boolean z, boolean z2, Bundle bundle, @NotNull final Function1<? super Boolean, Unit> function1) {
        String str;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        pUU.KWHzl("OKAppService", "autoSwitchMode: current app mode: " + DbNXlk().getValue() + ", current exchange mode: " + fetchVPNInfo());
        List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33254msw.class));
        InterfaceC33254msw interfaceC33254msw = listKWHzl != null ? (InterfaceC33254msw) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl) : null;
        if (interfaceC33254msw != null && interfaceC33254msw.EZpvd()) {
            pUU.KWHzl("OKAppService", "autoSwitchMode: intercepted by AccountDependencyExtension");
            if (iwGUEr()) {
                str = "lite_home_mode";
            } else {
                str = getFieldNames() ? "pro_home_mode" : "on_chain_mode";
            }
            EZpvd(str);
            interfaceC33254msw.OLrzqt(context);
            copydefault(context, bundle);
            KWHzl(context, 0, 0);
            function1.invoke(Boolean.FALSE);
        } else if (fARcdN()) {
            if (z2) {
                EZpvd(context, bundle, new Function1() { // from class: o.mqQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ModeManager.EZpvd(function1, ((java.lang.Boolean) obj).booleanValue());
                    }
                });
            }
        } else if (!hDKMBd()) {
            if (tryJumpFirstModeInCeFiList$default(this, context, z, 0, bundle == null ? new Bundle() : bundle, function1, null, 36, null)) {
                return true;
            }
            if (zLjUOn()) {
                return switchAppMode$default(this, context, 3, z, 0, bundle, true, false, function1, 72, null);
            }
            String str2 = uzCIH() ? "Pro" : "Lite";
            pUU.copydefault("OKAppService", "Current is [" + str2 + "] and restriction support neither web3 or cefi, " + isConnected().fIwbmz() + ", " + isConnected().AuCTel());
            function1.invoke(Boolean.FALSE);
        } else {
            if (ejfBZ()) {
                return switchToCeFi$default(this, context, z, 0, bundle, false, function1, 20, null);
            }
            pUU.copydefault("OKAppService", "Current is [DeFi] and restriction support neither web3 or cefi, " + isConnected().AuCTel());
            function1.invoke(Boolean.FALSE);
        }
        return false;
    }

    public static final Unit EZpvd(Function1 function1, boolean z) {
        function1.invoke(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.okinc.core.ok_app.ModeManager */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean switchToCeFi$default(ModeManager modeManager, Context context, boolean z, int i, Bundle bundle, boolean z2, Function1 function1, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if ((i2 & 16) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i2 & 32) != 0) {
            function1 = new Function1() { // from class: o.mqP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return ModeManager.djBIcL(((java.lang.Boolean) obj2).booleanValue());
                }
            };
        }
        return modeManager.OLrzqt(context, z, i3, bundle2, z3, (Function1<? super Boolean, Unit>) function1);
    }

    public static final Unit djBIcL(boolean z) {
        return Unit.INSTANCE;
    }

    public final boolean OLrzqt(@NotNull Context context, boolean z, int i, Bundle bundle, boolean z2, @NotNull Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (z2 && !hDKMBd()) {
            pUU.copydefault("OKAppService", "Current is not on chain, this function only support switch from web3 to cefi");
            function1.invoke(Boolean.FALSE);
            return false;
        }
        if (AEQbTJ(context, z, i, bundle, function1)) {
            return true;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        return EZpvd(context, z, i, bundle, function1, new Function0() { // from class: o.mqS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ModeManager.AYXKKw();
            }
        });
    }

    public static final Unit AYXKKw() {
        ModeManager modeManager = EZpvd;
        pUU.copydefault("OKAppService", "Current is web3 and restriction not support cefi, " + modeManager.isConnected().fIwbmz() + ", " + modeManager.isConnected().AuCTel());
        return Unit.INSTANCE;
    }

    public final boolean AEQbTJ(final Context context, final int i, boolean z, final int i2, Bundle bundle, final Function1<? super Boolean, Unit> function1) {
        KWHzl(context, z, bundle, new Function1() { // from class: o.mqW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ModeManager.valueOf(function1, context, i2, i, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        return true;
    }

    public static final Unit valueOf(Function1 function1, Context context, int i, int i2, boolean z) {
        function1.invoke(Boolean.valueOf(z));
        EZpvd.KWHzl(context, i, i2);
        return Unit.INSTANCE;
    }

    public final boolean OLrzqt(final Context context, final int i, boolean z, final int i2, Bundle bundle, final Function1<? super Boolean, Unit> function1) {
        EZpvd(C33102mqC.KWHzl(i));
        AEQbTJ(context, z, bundle, i, new Function1() { // from class: o.mqE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ModeManager.djBIcL(function1, context, i2, i, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        return true;
    }

    public static final Unit djBIcL(Function1 function1, Context context, int i, int i2, boolean z) {
        function1.invoke(Boolean.valueOf(z));
        EZpvd.KWHzl(context, i, i2);
        return Unit.INSTANCE;
    }

    public final boolean copydefault(final Context context, final int i, boolean z, final int i2, Bundle bundle, final Function1<? super Boolean, Unit> function1) {
        EZpvd("lite_home_mode");
        AEQbTJ(context, z, bundle, new Function1() { // from class: o.mqR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ModeManager.KWHzl(function1, context, i2, i, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        return true;
    }

    public static final Unit KWHzl(Function1 function1, Context context, int i, int i2, boolean z) {
        function1.invoke(Boolean.valueOf(z));
        EZpvd.KWHzl(context, i, i2);
        return Unit.INSTANCE;
    }

    public final boolean KWHzl(AbstractC33244msm abstractC33244msm) {
        ArrayList arrayList;
        InterfaceC33208msC interfaceC33208msC;
        List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33208msC.class));
        if (listKWHzl != null) {
            arrayList = new ArrayList();
            for (Object obj : listKWHzl) {
                if (Intrinsics.EZpvd(((InterfaceC33208msC) obj).EZpvd(), abstractC33244msm)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || !C33129mqd.AEQbTJ(Integer.valueOf(arrayList.size()), 1)) {
            if (arrayList == null || (interfaceC33208msC = (InterfaceC33208msC) CollectionsKt___CollectionsKt.firstOrNull(arrayList)) == null) {
                return true;
            }
            return interfaceC33208msC.KWHzl();
        }
        throw new IllegalStateException("There should be only one OKAppModeVisibilityExtension with mode " + abstractC33244msm + ", but found " + arrayList.size());
    }

    public final boolean zLjUOn() {
        return isConnected().AuCTel().contains(OKComplianceRestrictionService.AppMode.WEB3.getModeName()) && KWHzl(AbstractC33244msm.PendingIntent.KWHzl);
    }

    public final boolean ejfBZ() {
        return isConnected().AuCTel().contains(OKComplianceRestrictionService.AppMode.CEFI.getModeName());
    }

    public final boolean getFieldNames() {
        return ejfBZ() && isConnected().fIwbmz().contains(OKComplianceRestrictionService.CefiMode.PRO.getModeName());
    }

    public final boolean iwGUEr() {
        return ejfBZ() && isConnected().fIwbmz().contains(OKComplianceRestrictionService.CefiMode.LITE.getModeName());
    }

    public final boolean EZpvd(Context context, int i, boolean z, int i2, Bundle bundle, String str, Function1<? super Boolean, Unit> function1) {
        if (EZpvd(i)) {
            OLrzqt(context, i, z, i2, bundle, function1);
            return true;
        }
        pUU.copydefault("OKAppService", "Current is [" + str + "] and restriction not support [Pro], " + isConnected().fIwbmz());
        function1.invoke(Boolean.FALSE);
        return false;
    }

    public final boolean AEQbTJ(Context context, int i, boolean z, int i2, Bundle bundle, String str, Function1<? super Boolean, Unit> function1) {
        if (iwGUEr()) {
            copydefault(context, i, z, i2, bundle, function1);
            return true;
        }
        pUU.copydefault("OKAppService", "Current is [" + str + "] and restriction not support [Lite], " + isConnected().fIwbmz());
        function1.invoke(Boolean.FALSE);
        return false;
    }

    public final boolean copydefault(Context context, int i, boolean z, int i2, Bundle bundle, String str, Function1<? super Boolean, Unit> function1) {
        if (zLjUOn()) {
            AEQbTJ(context, i, z, i2, bundle, function1);
            return true;
        }
        pUU.copydefault("OKAppService", "Current is [" + str + "] and restriction not support [DeFi], " + isConnected().AuCTel());
        function1.invoke(Boolean.FALSE);
        return false;
    }

    public final boolean AEQbTJ(Context context, boolean z, int i, Bundle bundle, Function1<? super Boolean, Unit> function1) {
        String strFetchVPNInfo = fetchVPNInfo();
        if (Intrinsics.EZpvd((Object) strFetchVPNInfo, (Object) "lite_home_mode")) {
            if (iwGUEr()) {
                switchAppMode$default(this, context, 2, z, i, bundle, true, false, function1, 64, null);
                return true;
            }
            function1.invoke(Boolean.FALSE);
            return false;
        }
        if (Intrinsics.EZpvd((Object) strFetchVPNInfo, (Object) "pro_home_mode")) {
            if (getFieldNames()) {
                switchAppMode$default(this, context, 1, z, i, bundle, true, false, function1, 64, null);
                return true;
            }
            function1.invoke(Boolean.FALSE);
        } else {
            pUU.copydefault("OKAppService", "Last Cefi mode is not lite or pro, " + fetchVPNInfo());
            function1.invoke(Boolean.FALSE);
        }
        return false;
    }

    public final boolean fARcdN() {
        InterfaceC33174mrV interfaceC33174mrV;
        if (hDKMBd()) {
            return zLjUOn();
        }
        if (getNewProxyInstance()) {
            List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33174mrV.class));
            return (listKWHzl == null || (interfaceC33174mrV = (InterfaceC33174mrV) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) == null || !interfaceC33174mrV.OLrzqt()) ? false : true;
        }
        if (AuCTel()) {
            return iwGUEr();
        }
        return getFieldNames();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.okinc.core.ok_app.ModeManager */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean tryJumpFirstModeInCeFiList$default(ModeManager modeManager, Context context, boolean z, int i, Bundle bundle, Function1 function1, Function0 function0, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if ((i2 & 32) != 0) {
            function0 = new Function0() { // from class: o.mqN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ModeManager.djBIcL();
                }
            };
        }
        return modeManager.EZpvd(context, z, i3, bundle2, function1, function0);
    }

    public static final Unit djBIcL() {
        return Unit.INSTANCE;
    }

    public final boolean EZpvd(Context context, boolean z, int i, Bundle bundle, Function1<? super Boolean, Unit> function1, Function0<Unit> function0) {
        if (!ejfBZ()) {
            function1.invoke(Boolean.FALSE);
            return false;
        }
        String str = (String) CollectionsKt___CollectionsKt.firstOrNull(isConnected().fIwbmz());
        if (Intrinsics.EZpvd((Object) str, (Object) OKComplianceRestrictionService.CefiMode.PRO.getModeName())) {
            return switchAppMode$default(this, context, 1, z, i, bundle, true, false, function1, 64, null);
        }
        if (Intrinsics.EZpvd((Object) str, (Object) OKComplianceRestrictionService.CefiMode.LITE.getModeName())) {
            return switchAppMode$default(this, context, 2, z, i, bundle, true, false, function1, 64, null);
        }
        function0.invoke();
        function1.invoke(Boolean.FALSE);
        return false;
    }

    public static /* synthetic */ void forceSwitchToCurrentMode$default(ModeManager modeManager, Context context, Bundle bundle, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        modeManager.EZpvd(context, bundle, function1);
    }

    public final void EZpvd(Context context, Bundle bundle, Function1<? super Boolean, Unit> function1) {
        int i;
        MutableStateFlow<Integer> mutableStateFlowFIwbmz = fIwbmz();
        if (hDKMBd() || AuCTelauCTel()) {
            AEQbTJ(context, 3, false, 0, bundle, function1);
            i = 3;
        } else if (AuCTel()) {
            copydefault(context, 2, false, 0, bundle, function1);
            i = 2;
        } else if (getNewProxyInstance()) {
            OLrzqt(context, 5, false, 0, bundle, function1);
            i = 5;
        } else {
            OLrzqt(context, 1, false, 0, bundle, function1);
            i = 1;
        }
        mutableStateFlowFIwbmz.setValue(Integer.valueOf(i));
    }

    public final boolean AuCTelauCTel() {
        return C34703nhO.copydefault() && zLjUOn();
    }

    public final boolean EZpvd(int i) {
        List listKWHzl;
        InterfaceC33174mrV interfaceC33174mrV;
        if (i == 1) {
            return getFieldNames();
        }
        if (i == 2) {
            return iwGUEr();
        }
        if (i != 3) {
            return i == 5 && (listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33174mrV.class))) != null && (interfaceC33174mrV = (InterfaceC33174mrV) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) != null && interfaceC33174mrV.OLrzqt();
        }
        return zLjUOn();
    }

    public static abstract class TargetActivity implements Parcelable {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.core.ok_app.ModeManager.TargetActivity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TargetActivity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TargetActivity() {
        }

        public static final class Pro extends TargetActivity {
            public static final Pro EZpvd = new Pro();
            public static final Parcelable.Creator<Pro> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<Pro> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Pro createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return Pro.EZpvd;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Pro[] newArray(int i) {
                    return new Pro[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private Pro() {
                super(null);
            }
        }

        public static final class Lite extends TargetActivity {
            public static final Lite copydefault = new Lite();
            public static final Parcelable.Creator<Lite> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<Lite> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Lite createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return Lite.copydefault;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Lite[] newArray(int i) {
                    return new Lite[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private Lite() {
                super(null);
            }
        }

        public static final class Wallet extends TargetActivity {
            public static final Wallet AEQbTJ = new Wallet();
            public static final Parcelable.Creator<Wallet> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<Wallet> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Wallet createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return Wallet.AEQbTJ;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Wallet[] newArray(int i) {
                    return new Wallet[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private Wallet() {
                super(null);
            }
        }
    }
}
