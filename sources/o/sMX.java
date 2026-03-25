package o;

import com.okinc.okimcore.feature.notification.manager.NotificationManager$onUserLogout$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class sMX implements sMW, sEH {
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC44367sNe AhwBna;
    public final CoroutineScope EZpvd;
    public final android.content.Context KWHzl;
    public final InterfaceC44476sRf OLrzqt;
    public final java.lang.String copydefault;
    public final InterfaceC44365sNc valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC44476sRf
    public void AEQbTJ() {
        this.OLrzqt.AEQbTJ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC44476sRf
    public boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.OLrzqt.AEQbTJ(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC44365sNc
    public java.lang.Object EZpvd(@NotNull Continuation<? super Unit> continuation) {
        return this.valueOf.EZpvd(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC44367sNe
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna.EZpvd(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC44365sNc
    public boolean EZpvd() {
        return this.valueOf.EZpvd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC44476sRf
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt.KWHzl(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC44367sNe
    public void OLrzqt() {
        this.AhwBna.OLrzqt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC44476sRf
    public boolean OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.OLrzqt.OLrzqt(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC44365sNc
    public boolean copydefault() {
        return this.valueOf.copydefault();
    }

    @yCM
    public sMX(@NotNull InterfaceC44365sNc interfaceC44365sNc, @NotNull InterfaceC44367sNe interfaceC44367sNe, @NotNull InterfaceC44476sRf interfaceC44476sRf, @NotNull android.content.Context context, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC44365sNc, "");
        Intrinsics.checkNotNullParameter(interfaceC44367sNe, "");
        Intrinsics.checkNotNullParameter(interfaceC44476sRf, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.valueOf = interfaceC44365sNc;
        this.AhwBna = interfaceC44367sNe;
        this.OLrzqt = interfaceC44476sRf;
        this.KWHzl = context;
        this.AEQbTJ = coroutineDispatcher;
        this.copydefault = "NotificationManager";
        this.EZpvd = CoroutineScopeKt.CoroutineScope(coroutineDispatcher);
    }

    @Override // o.sEH
    public void bp_() {
        pUU.EZpvd(this.copydefault, "onUserLogin");
        sMT.OLrzqt.OLrzqt();
        C44370sNh.EZpvd.KWHzl(this.KWHzl);
    }

    @Override // o.sEH
    public void bq_() {
        pUU.EZpvd(this.copydefault, "onUserLogout");
        sMT.OLrzqt.AEQbTJ();
        BuildersKt__Builders_commonKt.launch$default(this.EZpvd, null, null, new NotificationManager$onUserLogout$1(this, null), 3, null);
    }

    @Override // o.sMW
    public void KWHzl(@NotNull C44373sNk c44373sNk) {
        Intrinsics.checkNotNullParameter(c44373sNk, "");
        sMT.OLrzqt.OLrzqt(c44373sNk);
    }
}
