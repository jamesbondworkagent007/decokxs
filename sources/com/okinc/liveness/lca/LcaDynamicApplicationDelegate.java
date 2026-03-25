package com.okinc.liveness.lca;

import android.app.Application;
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.C43265rly;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC43253rlm;
import o.InterfaceC43299rmf;
import o.mMP;
import o.rSA;
import o.yIJ;
import o.yIP;
import o.yJA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class LcaDynamicApplicationDelegate extends C43265rly {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final yIP<Object, Application> mApp$delegate = yIJ.OLrzqt.EZpvd();

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public boolean isLazyInit() {
        return true;
    }

    public static final class Companion {
        public static final /* synthetic */ yJA<Object>[] $$delegatedProperties = {C56524yIo.EZpvd(new MutablePropertyReference1Impl(Companion.class, "mApp", "getMApp()Landroid/app/Application;", 0))};

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.LcaDynamicApplicationDelegate.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Application getMApp() {
            return (Application) LcaDynamicApplicationDelegate.mApp$delegate.getValue(this, $$delegatedProperties[0]);
        }

        public final void setMApp(@NotNull Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            LcaDynamicApplicationDelegate.mApp$delegate.KWHzl(this, $$delegatedProperties[0], application);
        }

        public final Application getApp() {
            return getMApp();
        }
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerService(@NotNull Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
        super.registerService(context, interfaceC43253rlm);
        interfaceC43253rlm.KWHzl(rSA.class, LcaDynamicImpl.class);
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void attachBaseContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Companion.setMApp(getApplication());
    }

    public static final EopLivenessLcaDBoxExtension registerExtensions$lambda$0() {
        return new EopLivenessLcaDBoxExtension();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerExtensions(@NotNull Context context, @NotNull InterfaceC43299rmf interfaceC43299rmf) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43299rmf, "");
        interfaceC43299rmf.EZpvd(mMP.class, C56392yDr.copydefault(new Function0() { // from class: com.okinc.liveness.lca.LcaDynamicApplicationDelegate$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LcaDynamicApplicationDelegate.registerExtensions$lambda$0();
            }
        }));
    }
}
