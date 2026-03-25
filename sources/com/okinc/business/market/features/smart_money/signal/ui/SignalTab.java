package com.okinc.business.market.features.smart_money.signal.ui;

import androidx.annotation.StringRes;
import com.okinc.business.dex.api.bean.SignalTabApi;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class SignalTab {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SignalTab[] $VALUES;
    public static final TaskDescription Companion;
    private final int position;
    private final String tabValue;
    private final int titleResId;
    public static final SignalTab GEMS = new SignalTab("GEMS", 0, SignalTabApi.GEMS.getTabValue(), C23274hvD.Fragment.onComplete, 0);
    public static final SignalTab OVERVIEW = new SignalTab("OVERVIEW", 1, SignalTabApi.OVERVIEW.getTabValue(), C23274hvD.Fragment.setCallbacksMessenger, 1);
    public static final SignalTab ACTIVITY = new SignalTab("ACTIVITY", 2, SignalTabApi.ACTIVITY.getTabValue(), C23274hvD.Fragment.registerUser, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SignalTab[] $values() {
        return new SignalTab[]{GEMS, OVERVIEW, ACTIVITY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SignalTab> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPosition() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTabValue() {
        return this.tabValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleResId() {
        return this.titleResId;
    }

    private SignalTab(String str, @StringRes int i, String str2, int i2, int i3) {
        this.tabValue = str2;
        this.titleResId = i2;
        this.position = i3;
    }

    static {
        SignalTab[] signalTabArr$values = $values();
        $VALUES = signalTabArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(signalTabArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.smart_money.signal.ui.SignalTab.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final SignalTab AEQbTJ(int i) {
            SignalTab next;
            Iterator<SignalTab> it = SignalTab.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.getPosition() == i) {
                    break;
                }
            }
            return next;
        }

        public final SignalTab KWHzl(String str) {
            SignalTab next;
            Iterator<SignalTab> it = SignalTab.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) next.getTabValue(), (Object) str)) {
                    break;
                }
            }
            SignalTab signalTab = next;
            return signalTab == null ? SignalTab.GEMS : signalTab;
        }
    }

    public static SignalTab valueOf(String str) {
        return (SignalTab) Enum.valueOf(SignalTab.class, str);
    }

    public static SignalTab[] values() {
        return (SignalTab[]) $VALUES.clone();
    }
}
