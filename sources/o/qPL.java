package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.DexInstrument;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public interface qPL extends InterfaceC48913uee {
    void AEQbTJ();

    void AEQbTJ(@NotNull android.view.View view, @NotNull C48915ueg c48915ueg, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, InterfaceC55797xqi interfaceC55797xqi);

    void KWHzl(@NotNull android.view.View view, @NotNull BizInstrument bizInstrument, int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z);

    void KWHzl(@NotNull android.view.View view, @NotNull DexInstrument dexInstrument, int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, java.lang.Boolean bool);

    void OLrzqt(@NotNull android.content.Context context, @NotNull ActionBar actionBar);

    void OLrzqt(@NotNull java.lang.String str);

    void copydefault(@NotNull C40131qKm c40131qKm);

    void fetchVPNInfo();

    /* JADX INFO: loaded from: classes16.dex */
    public static final class Application {
        public static /* synthetic */ void handleInstrumentClick$default(qPL qpl, android.view.View view, DexInstrument dexInstrument, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.Boolean bool, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleInstrumentClick");
            }
            qpl.KWHzl(view, dexInstrument, i, str, str2, str3, z, (i2 & 128) != 0 ? java.lang.Boolean.FALSE : bool);
        }
    }
}
