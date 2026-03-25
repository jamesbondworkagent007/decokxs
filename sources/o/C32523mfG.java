package o;

import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.amplitude.AmplitudeName;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import uniffi.experiment.AbTestInstance;

/* JADX INFO: renamed from: o.mfG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32523mfG implements AHX {
    public final java.lang.String AEQbTJ = "";

    /* JADX INFO: renamed from: o.mfG$Application */
    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AbTestInstance.values().length];
            try {
                iArr[AbTestInstance.CEFI.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AbTestInstance.WEB3.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    public final java.lang.String EZpvd(java.lang.Object obj) {
        if (obj == null) {
            obj = this.AEQbTJ;
        }
        return obj instanceof JSONObject ? ((JSONObject) obj).toString() : obj instanceof JSONArray ? ((JSONArray) obj).toString() : C33490mxT.OLrzqt(obj);
    }

    @Override // o.AHX
    public java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull AbTestInstance abTestInstance) {
        AmplitudeName amplitudeName;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abTestInstance, "");
        int i = Application.OLrzqt[abTestInstance.ordinal()];
        if (i == 1) {
            amplitudeName = AmplitudeName.CEFI;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            amplitudeName = AmplitudeName.WEB3;
        }
        return EZpvd(ABTestManager.AEQbTJ.KWHzl(str, amplitudeName));
    }

    @Override // o.AHX
    public java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull AbTestInstance abTestInstance, @NotNull java.lang.String str2) {
        AmplitudeName amplitudeName;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abTestInstance, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int i = Application.OLrzqt[abTestInstance.ordinal()];
        if (i == 1) {
            amplitudeName = AmplitudeName.CEFI;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            amplitudeName = AmplitudeName.WEB3;
        }
        return EZpvd(ABTestManager.AEQbTJ.copydefault(str, amplitudeName, (java.lang.Object) str2));
    }
}
