package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yaE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57000yaE extends C43265rly {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static android.app.Application EZpvd;

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public int getPriority() {
        return 290;
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public boolean isLazyInit() {
        return true;
    }

    /* JADX INFO: renamed from: o.yaE$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yaE.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final android.app.Application OLrzqt() {
            android.app.Application application = C57000yaE.EZpvd;
            if (application != null) {
                return application;
            }
            Intrinsics.gEmmrt("");
            return null;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.udq.registerFileResourceId$default(o.udq, java.lang.String, java.lang.String, int, java.lang.Object):void */
    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onCreate() {
        super.onCreate();
        C48872udq.registerFileResourceId$default(C48872udq.AEQbTJ, "file_wallet_hardware_oneKey_js", null, 2, null);
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void attachBaseContext(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        EZpvd = getApplication();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerService(@NotNull final android.content.Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
        interfaceC43253rlm.EZpvd(InterfaceC57001yaF.class, C56392yDr.copydefault(new Function0() { // from class: o.yaB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C57000yaE.AEQbTJ(context);
            }
        }));
        interfaceC43253rlm.EZpvd(InterfaceC57029yah.class, C56392yDr.copydefault(new Function0() { // from class: o.yaC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C57000yaE.EZpvd(context);
            }
        }));
    }

    public static final InterfaceC57001yaF AEQbTJ(android.content.Context context) {
        return C57010yaO.copydefault(context).OLrzqt();
    }

    public static final InterfaceC57029yah EZpvd(android.content.Context context) {
        return C57010yaO.copydefault(context).copydefault();
    }
}
