package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mln, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC32874mln {

    /* JADX INFO: renamed from: o.mln$TaskDescription */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static void copydefault(@NotNull InterfaceC32874mln interfaceC32874mln, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
            Intrinsics.checkNotNullParameter(map, "");
        }
    }

    void AEQbTJ(@NotNull java.util.Map<java.lang.String, java.lang.String> map);

    void EZpvd(@NotNull android.content.Context context);

    void copydefault(@NotNull java.lang.String str, @NotNull EventParamsList eventParamsList);

    void copydefault(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map);

    TrackChannel fJNWhG();

    boolean hDKMBd();

    void onEvent(@NotNull java.lang.String str);
}
