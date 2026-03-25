package o;

import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mmr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32931mmr {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final java.util.List<java.lang.String> copydefault = yDY.gEmmrt("Push", "Widget");
    public static final C32931mmr AEQbTJ = new C32931mmr();

    private C32931mmr() {
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("CommonParamLogger", str);
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull InterfaceC32874mln interfaceC32874mln, @NotNull java.util.Set<? extends InterfaceC32870mlj> set, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC32874mln, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.util.Set<? extends InterfaceC32870mlj> set2 = set;
        if (C56404yEc.OLrzqt((java.lang.Iterable<?>) set2, C32922mmi.class).isEmpty()) {
            pUU.copydefault("CommonParamLogger", "[ParamMap] Missing CommonEventInterceptor when tracking event: " + str + " tracker: " + interfaceC32874mln.fJNWhG());
            return;
        }
        if ((set2 instanceof java.util.Collection) && set2.isEmpty()) {
            return;
        }
        for (InterfaceC32870mlj interfaceC32870mlj : set2) {
            C32922mmi c32922mmi = interfaceC32870mlj instanceof C32922mmi ? (C32922mmi) interfaceC32870mlj : null;
            if (c32922mmi != null && c32922mmi.copydefault(interfaceC32874mln)) {
                if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) copydefault), map.get("launch_source"))) {
                    return;
                }
                pUU.copydefault("CommonParamLogger", "[ParamMap] Missing launch_source when tracking event: " + str + " tracker: " + interfaceC32874mln.fJNWhG());
                return;
            }
        }
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull InterfaceC32874mln interfaceC32874mln, @NotNull java.util.Set<? extends InterfaceC32870mlj> set, @NotNull EventParamsList eventParamsList) {
        EventParam next;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC32874mln, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.util.Set<? extends InterfaceC32870mlj> set2 = set;
        if (C56404yEc.OLrzqt((java.lang.Iterable<?>) set2, C32922mmi.class).isEmpty()) {
            pUU.copydefault("CommonParamLogger", "[ParamList] Missing CommonEventInterceptor when tracking event: " + str + " tracker: " + interfaceC32874mln.fJNWhG());
            return;
        }
        if ((set2 instanceof java.util.Collection) && set2.isEmpty()) {
            return;
        }
        for (InterfaceC32870mlj interfaceC32870mlj : set2) {
            C32922mmi c32922mmi = interfaceC32870mlj instanceof C32922mmi ? (C32922mmi) interfaceC32870mlj : null;
            if (c32922mmi != null && c32922mmi.copydefault(interfaceC32874mln)) {
                java.util.List<java.lang.String> list = copydefault;
                java.util.Iterator<EventParam> it = eventParamsList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (Intrinsics.EZpvd((java.lang.Object) next.copydefault(), (java.lang.Object) "launch_source")) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                EventParam eventParam = next;
                if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) list), eventParam != null ? eventParam.KWHzl() : null)) {
                    return;
                }
                pUU.copydefault("CommonParamLogger", "[ParamList] Missing launch_source when tracking event: " + str + " tracker: " + interfaceC32874mln.fJNWhG());
                return;
            }
        }
    }

    /* JADX INFO: renamed from: o.mmr$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mmr.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C32931mmr AEQbTJ() {
            return C32931mmr.AEQbTJ;
        }

        public final void KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            AEQbTJ().EZpvd(str);
        }
    }
}
