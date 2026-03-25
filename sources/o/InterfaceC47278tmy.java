package o;

import com.google.gson.JsonObject;
import com.okinc.okuser.data.Token;
import com.okinc.okuser.data.User;
import kotlin.Unit;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tmy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC47278tmy extends InterfaceC43217rlC {
    public static final ActionBar Companion = ActionBar.copydefault;

    java.util.List<User> AEQbTJ();

    void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    java.lang.String AYXKKw();

    Token AhwBna();

    boolean AkhnZx();

    Flow<Unit> AuCTel();

    boolean DbNXlk();

    void EZpvd(@NotNull User user);

    User OLrzqt();

    java.util.List<User> copydefault();

    Token djBIcL();

    Flow<java.lang.String> ejfBZ();

    void fARcdN();

    Flow<AbstractC47263tmj> fIwbmz();

    boolean fJNWhG();

    boolean fetchVPNInfo();

    java.lang.String gEmmrt();

    boolean isConnected();

    JsonObject valueOf();

    boolean values();

    /* JADX INFO: renamed from: o.tmy$ActionBar */
    public static final class ActionBar {
        public static final /* synthetic */ ActionBar copydefault = new ActionBar();

        private ActionBar() {
        }
    }
}
