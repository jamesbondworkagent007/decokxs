package com.okinc.business.appupdate.app;

import android.content.Context;
import com.okinc.business.appupdate.mln.MLNGPUpgradeRegister;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C43265rly;
import o.C56392yDr;
import o.C7381aik;
import o.InterfaceC43299rmf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class GPUpgradeModule extends C43265rly {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: com.okinc.business.appupdate.app.GPUpgradeModule$registerExtensions$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<MLNGPUpgradeRegister> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1() {
            super(0, MLNGPUpgradeRegister.class, "<init>", "<init>()V", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final MLNGPUpgradeRegister invoke() {
            return new MLNGPUpgradeRegister();
        }
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerExtensions(@NotNull Context context, @NotNull InterfaceC43299rmf interfaceC43299rmf) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43299rmf, "");
        super.registerExtensions(context, interfaceC43299rmf);
        C7381aik.Companion.AEQbTJ(this, C56392yDr.copydefault(AnonymousClass1.INSTANCE));
    }
}
