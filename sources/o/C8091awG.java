package o;

import android.graphics.drawable.Drawable;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.okinc.kyc.api.biz.bean.FacialExtParams;
import com.okinc.ok_kyc_core.impl.ComplianceCountryListServiceImpl;
import com.okinc.ok_kyc_core_api.ComplianceCountryListService;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import o.C33129mqd;
import o.C43251rlk;
import o.C43455rpc;
import o.C43662rtX;
import o.C55326xho;
import o.pUU;
import o.rTU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.awG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8091awG extends C43265rly {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm EZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.awP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C8091awG.AEQbTJ(this.KWHzl);
        }
    });

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public boolean isLazyInit() {
        return false;
    }

    /* JADX INFO: renamed from: o.awG$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.awG.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final InterfaceC8102awR DbNXlk() {
        return (InterfaceC8102awR) this.EZpvd.getValue();
    }

    public static final InterfaceC8102awR AEQbTJ(C8091awG c8091awG) {
        return (InterfaceC8102awR) C58113yvE.copydefault(c8091awG.getApplication(), InterfaceC8102awR.class);
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerService(@NotNull android.content.Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
        super.registerService(context, interfaceC43253rlm);
        interfaceC43253rlm.EZpvd(rTU.class, C56392yDr.copydefault(new Function0() { // from class: o.awN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C8091awG.valueOf(this.OLrzqt);
            }
        }));
        interfaceC43253rlm.EZpvd(rSF.class, C56392yDr.copydefault(new Function0() { // from class: o.awJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C8091awG.djBIcL(this.AEQbTJ);
            }
        }));
        interfaceC43253rlm.EZpvd(ComplianceCountryListService.class, C56392yDr.copydefault(new Function0() { // from class: o.awL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C8091awG.gEmmrt(this.KWHzl);
            }
        }));
        interfaceC43253rlm.KWHzl(InterfaceC37981pHw.class, rDJ.class);
        interfaceC43253rlm.EZpvd(rTR.class, C56392yDr.copydefault(new Function0() { // from class: o.awK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C8091awG.isConnected();
            }
        }));
    }

    public static final rCV valueOf(C8091awG c8091awG) {
        return c8091awG.DbNXlk().EZpvd();
    }

    public static final rCV djBIcL(C8091awG c8091awG) {
        return c8091awG.DbNXlk().EZpvd();
    }

    public static final ComplianceCountryListService gEmmrt(C8091awG c8091awG) {
        return c8091awG.DbNXlk().KWHzl();
    }

    public static final rCT isConnected() {
        return new rCT(new ComplianceCountryListServiceImpl(InterfaceC43703ruL.Companion.KWHzl(), Dispatchers.getIO()));
    }

    @Override // o.C43265rly
    public void onInit(@NotNull final android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onInit(context);
        RxBus.KWHzl(C43455rpc.class, new java.lang.String[0]).subscribe(new RxBus.EventCallback<C43455rpc>(this) { // from class: com.okinc.OKComplianceServiceApplicationDelegate$onInit$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this);
            }

            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(C43455rpc c43455rpc) {
                JsonElement jsonElement;
                Intrinsics.checkNotNullParameter(c43455rpc, "");
                pUU.KWHzl("OKComplianceServiceApplicationDelegate", "receive event: " + c43455rpc.AEQbTJ() + ", " + c43455rpc.copydefault() + ", " + c43455rpc.KWHzl());
                if (c43455rpc.copydefault() == 5001) {
                    JsonObject jsonObjectKWHzl = c43455rpc.KWHzl();
                    if (jsonObjectKWHzl != null && jsonObjectKWHzl.has(OtcExtraKeys.SESSIONID)) {
                        JsonObject jsonObjectKWHzl2 = c43455rpc.KWHzl();
                        String strGEmmrt = C33129mqd.gEmmrt((jsonObjectKWHzl2 == null || (jsonElement = jsonObjectKWHzl2.get(OtcExtraKeys.SESSIONID)) == null) ? null : jsonElement.getAsString());
                        rTU rtu = (rTU) C43251rlk.OLrzqt(rTU.class);
                        if (rtu != null) {
                            rtu.copydefault(context, strGEmmrt, new FacialExtParams((Map) null, "network_error", 1, (DefaultConstructorMarker) null));
                            return;
                        }
                        return;
                    }
                    C55326xho.toast$default(C43662rtX.Dialog.AubY, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                }
            }
        });
        rTU.Application.showPermissionConsent$default(DbNXlk().EZpvd(), null, null, 3, null);
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerDeeplinkHandlers(@NotNull android.content.Context context, @NotNull InterfaceC43237rlW interfaceC43237rlW) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43237rlW, "");
        for (Map.Entry<java.lang.String, InterfaceC56387yDm<InterfaceC43234rlT>> entry : C41938rAi.fetchVPNInfo().entrySet()) {
            java.lang.String key = entry.getKey();
            InterfaceC56387yDm<InterfaceC43234rlT> value = entry.getValue();
            interfaceC43237rlW.copydefault(new C41946rAq(key), value);
            interfaceC43237rlW.copydefault(new C41945rAp(key), value);
            interfaceC43237rlW.copydefault(new C41944rAo(key), value);
        }
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerExtensions(@NotNull android.content.Context context, @NotNull InterfaceC43299rmf interfaceC43299rmf) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43299rmf, "");
        super.registerExtensions(context, interfaceC43299rmf);
        interfaceC43299rmf.EZpvd(InterfaceC46977thO.class, C56392yDr.copydefault(new Function0() { // from class: o.awF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C8091awG.gEmmrt();
            }
        }));
        interfaceC43299rmf.EZpvd(mMP.class, C56392yDr.copydefault(new Function0() { // from class: o.awE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C8091awG.AYXKKw();
            }
        }));
        interfaceC43299rmf.EZpvd(mMP.class, C56392yDr.copydefault(new Function0() { // from class: o.awI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C8091awG.djBIcL();
            }
        }));
        interfaceC43299rmf.EZpvd(mMP.class, C56392yDr.copydefault(new Function0() { // from class: o.awH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C8091awG.AkhnZx();
            }
        }));
        interfaceC43299rmf.EZpvd(mMP.class, C56392yDr.copydefault(new Function0() { // from class: o.awM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C8091awG.AhwBna();
            }
        }));
    }

    public static final rBV gEmmrt() {
        return new rBV();
    }

    public static final C41999rCp AYXKKw() {
        return new C41999rCp();
    }

    public static final rBX djBIcL() {
        return new rBX();
    }

    public static final C41990rCg AkhnZx() {
        return new C41990rCg();
    }

    public static final C42510rVn AhwBna() {
        return new C42510rVn();
    }
}
