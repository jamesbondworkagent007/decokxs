package o;

import com.amplitude.core.platform.Plugin;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C5242Ke;
import o.C5247Kj;
import o.C56424yEw;
import o.IV;
import o.JZ;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JD implements com.amplitude.core.platform.Plugin {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public IX AEQbTJ;
    public final Plugin.Type EZpvd = Plugin.Type.Before;
    public JZ KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplitude.core.platform.Plugin
    public void AEQbTJ(@NotNull JZ jz) {
        Intrinsics.checkNotNullParameter(jz, "");
        this.KWHzl = jz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplitude.core.platform.Plugin
    public Plugin.Type EZpvd() {
        return this.EZpvd;
    }

    @Override // com.amplitude.core.platform.Plugin
    public void KWHzl(@NotNull final JZ jz) {
        Intrinsics.checkNotNullParameter(jz, "");
        super.KWHzl(jz);
        IX ixKWHzl = IX.Companion.KWHzl(jz.djBIcL().fetchVPNInfo());
        this.AEQbTJ = ixKWHzl;
        if (ixKWHzl == null) {
            Intrinsics.gEmmrt("");
            ixKWHzl = null;
        }
        ixKWHzl.copydefault().KWHzl(new Function1<IV, Unit>() { // from class: com.amplitude.android.plugins.AnalyticsConnectorPlugin$setup$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IV iv) {
                invoke2(iv);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull IV iv) {
                Intrinsics.checkNotNullParameter(iv, "");
                String strOLrzqt = iv.OLrzqt();
                Map<String, Object> mapEZpvd = iv.EZpvd();
                Map<String, Map<String, Object>> mapKWHzl = iv.KWHzl();
                C5242Ke c5242Ke = new C5242Ke();
                c5242Ke.OLrzqt(strOLrzqt);
                c5242Ke.AEQbTJ(mapEZpvd != null ? C56424yEw.isConnected(mapEZpvd) : null);
                c5242Ke.EZpvd(mapKWHzl != null ? C56424yEw.isConnected(mapKWHzl) : null);
                JZ.track$default(jz, c5242Ke, (C5247Kj) null, (yHO) null, 6, (Object) null);
            }
        });
    }

    @Override // com.amplitude.core.platform.Plugin
    public C5242Ke EZpvd(@NotNull C5242Ke c5242Ke) {
        Intrinsics.checkNotNullParameter(c5242Ke, "");
        java.util.Map<java.lang.String, java.lang.Object> mapOLrzqt = c5242Ke.OLrzqt();
        if (mapOLrzqt != null && !mapOLrzqt.isEmpty() && !Intrinsics.EZpvd((java.lang.Object) c5242Ke.copydefault(), (java.lang.Object) "$exposure")) {
            java.util.HashMap map = new java.util.HashMap();
            for (Map.Entry<java.lang.String, java.lang.Object> entry : mapOLrzqt.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.Object value = entry.getValue();
                if (value instanceof java.util.Map) {
                    try {
                        map.put(key, (java.util.Map) value);
                    } catch (java.lang.ClassCastException e) {
                        e.printStackTrace();
                    }
                }
            }
            IX ix = this.AEQbTJ;
            if (ix == null) {
                Intrinsics.gEmmrt("");
                ix = null;
            }
            ix.EZpvd().copydefault().copydefault(map).copydefault();
        }
        return c5242Ke;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.JD.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
