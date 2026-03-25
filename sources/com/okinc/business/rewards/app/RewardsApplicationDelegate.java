package com.okinc.business.rewards.app;

import android.app.Application;
import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.business.rewards.app.RewardsApplicationDelegate;
import com.okinc.modular.deeplinkv2.DeeplinkMode;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.C37987pIa;
import o.C43251rlk;
import o.C43265rly;
import o.C56392yDr;
import o.C56524yIo;
import o.C57535ykJ;
import o.InterfaceC43232rlR;
import o.InterfaceC43233rlS;
import o.InterfaceC43234rlT;
import o.InterfaceC43237rlW;
import o.InterfaceC43253rlm;
import o.InterfaceC43299rmf;
import o.InterfaceC56387yDm;
import o.kOE;
import o.kOG;
import o.kOH;
import o.kOI;
import o.kOX;
import o.kOZ;
import o.oJF;
import o.oJI;
import o.yIJ;
import o.yIP;
import o.yJA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class RewardsApplicationDelegate extends C43265rly {
    public static final int $stable = 0;
    public static final String ACTIVITY_FILE_NAME = "okReward";
    public static final Activity Companion = new Activity(null);
    private static final yIP<Object, Application> mApp$delegate = yIJ.OLrzqt.EZpvd();
    private static String OK_ACTIVITY_FILE_ROOT = "";

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public int getPriority() {
        return TypedValues.CycleType.TYPE_EASING;
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public boolean isLazyInit() {
        return true;
    }

    public static final class Activity {
        public static final /* synthetic */ yJA<Object>[] EZpvd = {C56524yIo.EZpvd(new MutablePropertyReference1Impl(Activity.class, "mApp", "getMApp()Landroid/app/Application;", 0))};

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.rewards.app.RewardsApplicationDelegate.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void EZpvd(@NotNull Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            RewardsApplicationDelegate.mApp$delegate.KWHzl(this, EZpvd[0], application);
        }
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void attachBaseContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Companion.EZpvd(getApplication());
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onLaunchComplete() {
        super.onLaunchComplete();
        kOG kog = (kOG) C43251rlk.OLrzqt(kOG.class);
        if (kog != null) {
            kog.KWHzl();
        }
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerService(@NotNull Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
        super.registerService(context, interfaceC43253rlm);
        interfaceC43253rlm.EZpvd(kOE.class, C56392yDr.copydefault(new Function0() { // from class: o.kOF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return RewardsApplicationDelegate.registerService$lambda$0();
            }
        }));
        interfaceC43253rlm.EZpvd(kOI.class, C56392yDr.copydefault(new Function0() { // from class: o.kOK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return RewardsApplicationDelegate.registerService$lambda$1();
            }
        }));
        interfaceC43253rlm.EZpvd(kOG.class, C56392yDr.copydefault(new Function0() { // from class: o.kON
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return RewardsApplicationDelegate.registerService$lambda$2();
            }
        }));
        interfaceC43253rlm.EZpvd(kOH.class, C56392yDr.copydefault(new Function0() { // from class: o.kOL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return RewardsApplicationDelegate.registerService$lambda$3();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kOZ registerService$lambda$0() {
        return new kOZ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C37987pIa registerService$lambda$1() {
        return new C37987pIa();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oJI registerService$lambda$2() {
        return new oJI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C57535ykJ registerService$lambda$3() {
        return new C57535ykJ();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerDeeplinkHandlers(@NotNull Context context, @NotNull InterfaceC43237rlW interfaceC43237rlW) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43237rlW, "");
        super.registerDeeplinkHandlers(context, interfaceC43237rlW);
        InterfaceC56387yDm<? extends InterfaceC43234rlT> interfaceC56387yDmCopydefault = C56392yDr.copydefault(new Function0() { // from class: o.kOM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return RewardsApplicationDelegate.registerDeeplinkHandlers$lambda$4();
            }
        });
        Iterator<T> it = kOX.Companion.AEQbTJ().iterator();
        while (it.hasNext()) {
            interfaceC43237rlW.copydefault((InterfaceC43233rlS) it.next(), interfaceC56387yDmCopydefault);
        }
        interfaceC43237rlW.EZpvd(new ActionBar(), C56392yDr.copydefault(new Function0() { // from class: o.kOJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return RewardsApplicationDelegate.registerDeeplinkHandlers$lambda$6();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kOX registerDeeplinkHandlers$lambda$4() {
        return new kOX();
    }

    public static final class ActionBar implements InterfaceC43232rlR {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC43232rlR
        public String AEQbTJ() {
            return "okg.sjv.io";
        }

        @Override // o.InterfaceC43232rlR
        public boolean EZpvd() {
            return InterfaceC43232rlR.TaskDescription.OLrzqt(this);
        }

        @Override // o.InterfaceC43232rlR
        public boolean KWHzl() {
            return InterfaceC43232rlR.TaskDescription.copydefault(this);
        }

        @Override // o.InterfaceC43232rlR
        public boolean OLrzqt() {
            return InterfaceC43232rlR.TaskDescription.AEQbTJ(this);
        }

        @Override // o.InterfaceC43232rlR
        public List<String> djBIcL() {
            return InterfaceC43232rlR.TaskDescription.EZpvd(this);
        }

        @Override // o.InterfaceC43232rlR
        public DeeplinkMode copydefault() {
            return DeeplinkMode.APP;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oJF registerDeeplinkHandlers$lambda$6() {
        return new oJF();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerExtensions(@NotNull Context context, @NotNull InterfaceC43299rmf interfaceC43299rmf) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43299rmf, "");
        super.registerExtensions(context, interfaceC43299rmf);
    }
}
