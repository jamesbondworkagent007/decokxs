package o;

import com.okinc.auth.impl.AuthModule$registerService$7;
import com.okinc.auth.impl.debugtool.passkey.PasskeyDebugTool;
import com.okinc.auth.impl.featureflag.FeatureFlagManagerImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ayI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8199ayI extends C43265rly {
    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public boolean isLazyInit() {
        return true;
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerService(@NotNull final android.content.Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
        super.registerService(context, interfaceC43253rlm);
        interfaceC43253rlm.EZpvd(InterfaceC8197ayG.class, C56392yDr.copydefault(new Function0() { // from class: o.ayL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C8199ayI.djBIcL();
            }
        }));
        interfaceC43253rlm.EZpvd(InterfaceC8196ayF.class, C56392yDr.copydefault(new Function0() { // from class: o.ayN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C8199ayI.KWHzl(context);
            }
        }));
        interfaceC43253rlm.EZpvd(InterfaceC8194ayD.class, C56392yDr.copydefault(new Function0() { // from class: o.ayK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C8199ayI.AkhnZx();
            }
        }));
        interfaceC43253rlm.EZpvd(InterfaceC5697aBP.class, C56392yDr.copydefault(new Function0() { // from class: o.ayM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C8199ayI.DbNXlk();
            }
        }));
        interfaceC43253rlm.EZpvd(InterfaceC5687aBF.class, C56392yDr.copydefault(new Function0() { // from class: o.ayO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C8199ayI.fetchVPNInfo();
            }
        }));
        interfaceC43253rlm.EZpvd(InterfaceC8200ayJ.class, C56392yDr.copydefault(new Function0() { // from class: o.ayR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C8199ayI.values();
            }
        }));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new AuthModule$registerService$7(context, null), 3, null);
    }

    public static final C5782aCv djBIcL() {
        return new C5782aCv();
    }

    public static final InterfaceC8196ayF KWHzl(android.content.Context context) {
        return ((InterfaceC5960aGN) C58113yvE.copydefault(context.getApplicationContext(), InterfaceC5960aGN.class)).copydefault();
    }

    public static final C5728aBu AkhnZx() {
        return new C5728aBu();
    }

    public static final C5698aBQ DbNXlk() {
        return new C5698aBQ();
    }

    public static final FeatureFlagManagerImpl fetchVPNInfo() {
        return new FeatureFlagManagerImpl();
    }

    public static final C6622aSn values() {
        return new C6622aSn();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerDeeplinkHandlers(@NotNull android.content.Context context, @NotNull InterfaceC43237rlW interfaceC43237rlW) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43237rlW, "");
        super.registerDeeplinkHandlers(context, interfaceC43237rlW);
        if (C34703nhO.copydefault()) {
            return;
        }
        C5933aFn.copydefault(interfaceC43237rlW);
        C5931aFl.copydefault(interfaceC43237rlW);
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerExtensions(@NotNull android.content.Context context, @NotNull InterfaceC43299rmf interfaceC43299rmf) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43299rmf, "");
        super.registerExtensions(context, interfaceC43299rmf);
        C5644aAP.OLrzqt(interfaceC43299rmf, PasskeyDebugTool.EZpvd);
        interfaceC43299rmf.EZpvd(mMP.class, C56392yDr.copydefault(new Function0() { // from class: o.ayQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C8199ayI.valueOf();
            }
        }));
        C7381aik.Companion.AEQbTJ(this, C56392yDr.copydefault(new Function0() { // from class: o.ayT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C8199ayI.gEmmrt();
            }
        }));
    }

    public static final C5717aBj valueOf() {
        return new C5717aBj();
    }

    public static final C8198ayH gEmmrt() {
        return new C8198ayH();
    }
}
