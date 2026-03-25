package com.okinc.components.report;

import com.okinc.components.report.EventAction;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class EventAction {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ EventAction[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final String type;
    public static final EventAction APP_HANG = new EventAction("APP_HANG", 0, "app_hang");
    public static final EventAction APP_MEMORY = new EventAction("APP_MEMORY", 1, "app_memory");
    public static final EventAction APP_OOM = new EventAction("APP_OOM", 2, "app_oom");
    public static final EventAction APP_LAUNCH_TIME = new EventAction("APP_LAUNCH_TIME", 3, "app_launch_time");
    public static final EventAction MINIAPP = new EventAction("MINIAPP", 4, "miniapp");
    public static final EventAction WEBVIEW = new EventAction("WEBVIEW", 5, "webview");
    public static final EventAction BLOCK_TIME = new EventAction("BLOCK_TIME", 6, "block_time");
    public static final EventAction APP_CRASH = new EventAction("APP_CRASH", 7, "app_crash");
    public static final EventAction APP_ENV_RASP = new EventAction("APP_ENV_RASP", 8, "app_env_rasp");
    public static final EventAction PAGE_RENDER_TIME = new EventAction("PAGE_RENDER_TIME", 9, "page_render_time");
    public static final EventAction SKYLAB = new EventAction("SKYLAB", 10, "skylab_request");
    public static final EventAction PUSH_NETWORK_OPTIMIZATION = new EventAction("PUSH_NETWORK_OPTIMIZATION", 11, "push_network_optimization");
    public static final EventAction PRO_MAIN_ANR = new EventAction("PRO_MAIN_ANR", 12, "pro_main_anr");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ EventAction[] $values() {
        return new EventAction[]{APP_HANG, APP_MEMORY, APP_OOM, APP_LAUNCH_TIME, MINIAPP, WEBVIEW, BLOCK_TIME, APP_CRASH, APP_ENV_RASP, PAGE_RENDER_TIME, SKYLAB, PUSH_NETWORK_OPTIMIZATION, PRO_MAIN_ANR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<EventAction> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.components.report.EventAction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) EventAction.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<EventAction> serializer() {
            return AEQbTJ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.components.report.EventAction", values());
    }

    private EventAction(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        EventAction[] eventActionArr$values = $values();
        $VALUES = eventActionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(eventActionArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.mhA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return EventAction._init_$_anonymous_();
            }
        });
    }

    public static EventAction valueOf(String str) {
        return (EventAction) Enum.valueOf(EventAction.class, str);
    }

    public static EventAction[] values() {
        return (EventAction[]) $VALUES.clone();
    }
}
