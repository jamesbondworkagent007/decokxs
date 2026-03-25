package com.okinc.im.config.serviceprovider;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class ObserverSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ObserverSource[] $VALUES;
    public static final StateListAnimator Companion;
    public static final ObserverSource KeyboardFragment = new ObserverSource("KeyboardFragment", 0);
    public static final ObserverSource MessageListMainFragment = new ObserverSource("MessageListMainFragment", 1);
    public static final ObserverSource PluginsFragment = new ObserverSource("PluginsFragment", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ObserverSource[] $values() {
        return new ObserverSource[]{KeyboardFragment, MessageListMainFragment, PluginsFragment};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ObserverSource> getEntries() {
        return $ENTRIES;
    }

    private ObserverSource(String str, int i) {
    }

    static {
        ObserverSource[] observerSourceArr$values = $values();
        $VALUES = observerSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(observerSourceArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.config.serviceprovider.ObserverSource.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final String KWHzl(@NotNull ObserverSource observerSource) {
            Intrinsics.checkNotNullParameter(observerSource, "");
            return "FRAGMENT_RESULT_KEY_ACTION/" + observerSource.name();
        }

        public final List<String> EZpvd() {
            ObserverSource[] observerSourceArrValues = ObserverSource.values();
            ArrayList arrayList = new ArrayList(observerSourceArrValues.length);
            for (ObserverSource observerSource : observerSourceArrValues) {
                arrayList.add(ObserverSource.Companion.KWHzl(observerSource));
            }
            return arrayList;
        }
    }

    public static ObserverSource valueOf(String str) {
        return (ObserverSource) Enum.valueOf(ObserverSource.class, str);
    }

    public static ObserverSource[] values() {
        return (ObserverSource[]) $VALUES.clone();
    }
}
