package o;

import com.bytedance.applog.IAppLogInstance;
import com.okinc.components.track.amplitude.AmplitudeName;
import com.okinc.components.track.bean.EventParamsList;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mmu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32934mmu implements InterfaceC32870mlj {
    public static final Activity Companion = new Activity(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC32870mlj
    public boolean copydefault(@NotNull InterfaceC32874mln interfaceC32874mln) {
        Intrinsics.checkNotNullParameter(interfaceC32874mln, "");
        return true;
    }

    @Override // o.InterfaceC32870mlj
    public void KWHzl(@NotNull InterfaceC32874mln interfaceC32874mln, @NotNull java.lang.String str, @NotNull EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(interfaceC32874mln, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.set("site", copydefault());
        if (interfaceC32874mln instanceof C32883mlw) {
            kotlin.Pair<AmplitudeName, C5214Jc> pairCopydefault = ((C32883mlw) interfaceC32874mln).copydefault(str);
            AmplitudeName amplitudeNameComponent1 = pairCopydefault.component1();
            pairCopydefault.component2();
            if (amplitudeNameComponent1 == AmplitudeName.CEFI) {
                EZpvd(eventParamsList);
                return;
            }
            return;
        }
        if (interfaceC32874mln instanceof C32859mlY) {
            kotlin.Pair<AmplitudeName, IAppLogInstance> pairCopydefault2 = ((C32859mlY) interfaceC32874mln).copydefault(str);
            AmplitudeName amplitudeNameComponent12 = pairCopydefault2.component1();
            pairCopydefault2.component2();
            if (amplitudeNameComponent12 == AmplitudeName.CEFI) {
                EZpvd(eventParamsList);
                return;
            }
            return;
        }
        if (interfaceC32874mln instanceof C6862aXQ) {
            EZpvd(eventParamsList);
        }
    }

    public final void EZpvd(EventParamsList eventParamsList) {
        java.util.Map<java.lang.String, java.lang.String> mapValues = C43292rmY.OLrzqt.values();
        if (mapValues != null) {
            for (Map.Entry<java.lang.String, java.lang.String> entry : mapValues.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    EventParamsList.put$default(eventParamsList, entry.getKey(), entry.getValue(), false, 4, null);
                }
            }
        }
    }

    public final void AEQbTJ(java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.Map<java.lang.String, java.lang.String> mapValues = C43292rmY.OLrzqt.values();
        if (mapValues != null) {
            for (Map.Entry<java.lang.String, java.lang.String> entry : mapValues.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    map.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    @Override // o.InterfaceC32870mlj
    public void copydefault(@NotNull InterfaceC32874mln interfaceC32874mln, @NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(interfaceC32874mln, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        map.put("site", copydefault());
        if (interfaceC32874mln instanceof C32883mlw) {
            kotlin.Pair<AmplitudeName, C5214Jc> pairCopydefault = ((C32883mlw) interfaceC32874mln).copydefault(str);
            AmplitudeName amplitudeNameComponent1 = pairCopydefault.component1();
            pairCopydefault.component2();
            if (amplitudeNameComponent1 == AmplitudeName.CEFI) {
                AEQbTJ(map);
                return;
            }
            return;
        }
        if (interfaceC32874mln instanceof C32859mlY) {
            kotlin.Pair<AmplitudeName, IAppLogInstance> pairCopydefault2 = ((C32859mlY) interfaceC32874mln).copydefault(str);
            AmplitudeName amplitudeNameComponent12 = pairCopydefault2.component1();
            pairCopydefault2.component2();
            if (amplitudeNameComponent12 == AmplitudeName.CEFI) {
                AEQbTJ(map);
                return;
            }
            return;
        }
        if (interfaceC32874mln instanceof C6862aXQ) {
            AEQbTJ(map);
        }
    }

    public final java.lang.String copydefault() {
        java.lang.String lowerCase = C43655rtQ.OLrzqt.OLrzqt().toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    /* JADX INFO: renamed from: o.mmu$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mmu.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
