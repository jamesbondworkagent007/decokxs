package o;

import com.okinc.trade.manager.common.position.TradePositionManager;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49872uwj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uwx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C49886uwx {
    public TradePositionManager.PositionItem AYXKKw;
    public InterfaceC49872uwj.Application OLrzqt;
    public java.lang.String copydefault = "";
    public java.lang.String EZpvd = "";
    public java.lang.String AEQbTJ = "";
    public java.lang.String KWHzl = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, TradePositionManager.PositionItem positionItem) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.copydefault = str;
        this.EZpvd = str2;
        this.AEQbTJ = str3;
        this.KWHzl = str4;
        this.AYXKKw = positionItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull InterfaceC49872uwj.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.OLrzqt = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    public void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC49872uwj.Application application = this.OLrzqt;
        if (application == null) {
            Intrinsics.gEmmrt("");
            application = null;
        }
        application.KWHzl(str);
    }
}
