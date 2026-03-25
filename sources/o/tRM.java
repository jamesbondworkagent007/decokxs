package o;

import androidx.lifecycle.SavedStateHandle;
import com.okinc.planet.biz_userprofile.data.PlanetUniqueName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tRM {
    public final InterfaceC56387yDm OLrzqt;

    public tRM(@NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.OLrzqt = C56392yDr.copydefault(new TaskDescription(savedStateHandle));
    }

    public static final class TaskDescription implements Function0<PlanetUniqueName> {
        public final /* synthetic */ SavedStateHandle OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(SavedStateHandle savedStateHandle) {
            this.OLrzqt = savedStateHandle;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ PlanetUniqueName invoke() {
            java.lang.String strKWHzl = KWHzl();
            if (strKWHzl != null) {
                return PlanetUniqueName.EZpvd(strKWHzl);
            }
            return null;
        }

        public final java.lang.String KWHzl() {
            PlanetUniqueName planetUniqueName = (PlanetUniqueName) this.OLrzqt.get(PlanetUniqueName.Key);
            if (planetUniqueName != null) {
                return planetUniqueName.EZpvd();
            }
            return null;
        }
    }

    public java.lang.String AEQbTJ() {
        PlanetUniqueName planetUniqueName = (PlanetUniqueName) this.OLrzqt.getValue();
        if (planetUniqueName != null) {
            return planetUniqueName.EZpvd();
        }
        return null;
    }
}
