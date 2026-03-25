package o;

import com.okinc.business.market.bean.TokenInfoForAlert;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tfA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46857tfA implements InterfaceC46849tet {
    public final InterfaceC56387yDm AEQbTJ;
    public final TokenInfoForAlert EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46849tet
    public java.lang.String KWHzl(int i) {
        return "USD";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46849tet
    public java.lang.String OLrzqt() {
        return "CEDEFI";
    }

    public C46857tfA(@NotNull TokenInfoForAlert tokenInfoForAlert) {
        Intrinsics.checkNotNullParameter(tokenInfoForAlert, "");
        this.EZpvd = tokenInfoForAlert;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.tfx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46857tfA.AYXKKw();
            }
        });
    }

    public final oKB gEmmrt() {
        return (oKB) this.AEQbTJ.getValue();
    }

    public static final oKB AYXKKw() {
        return (oKB) C43251rlk.copydefault(oKB.class);
    }

    @Override // o.InterfaceC46849tet
    public java.lang.String EZpvd() {
        return this.EZpvd.AYXKKw();
    }

    @Override // o.InterfaceC46849tet
    public kotlin.Pair<java.lang.String, java.lang.String> copydefault() {
        return C56390yDp.OLrzqt(this.EZpvd.EZpvd(), this.EZpvd.KWHzl());
    }

    @Override // o.InterfaceC46849tet
    public int KWHzl() {
        return gEmmrt().OLrzqt(this.EZpvd.djBIcL());
    }

    @Override // o.InterfaceC46849tet
    public int KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return gEmmrt().OLrzqt(str);
    }
}
