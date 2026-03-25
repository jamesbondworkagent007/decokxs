package o;

import com.okinc.mln.miniapp.AppJson;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43022rhT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rhR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43020rhR implements InterfaceC43022rhT {
    public AppJson AEQbTJ;
    public final ConcurrentHashMap.KeySetView<java.lang.String, java.lang.Boolean> AYXKKw;
    public boolean AhwBna;
    public java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public boolean copydefault;
    public java.lang.String djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.EZpvd;
    }

    public C43020rhR(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        this.copydefault = true;
        this.AYXKKw = ConcurrentHashMap.newKeySet();
        this.EZpvd = "";
        this.djBIcL = "";
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.rhQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C43020rhR.copydefault(this.OLrzqt);
            }
        });
    }

    public final boolean AYXKKw() {
        if (!C43017rhO.EZpvd.KWHzl(this.KWHzl)) {
            if (this.copydefault) {
                this.copydefault = false;
                this.AhwBna = C48833udD.copydefault(djBIcL(), gEmmrt()) >= 0;
            }
            return this.AhwBna;
        }
        pUU.EZpvd("asdf", "MiniAppInfo: " + this.KWHzl + " use file system only");
        return false;
    }

    public final java.lang.String gEmmrt() {
        AppJson appJson = this.AEQbTJ;
        if (appJson != null) {
            return appJson.getVersion();
        }
        return null;
    }

    public static final AppJson copydefault(C43020rhR c43020rhR) {
        return c43020rhR.OLrzqt(InterfaceC43022rhT.StateListAnimator.Activity.EZpvd);
    }

    public final AppJson AEQbTJ() {
        return (AppJson) this.OLrzqt.getValue();
    }

    public final java.lang.String djBIcL() {
        AppJson appJsonAEQbTJ = AEQbTJ();
        if (appJsonAEQbTJ != null) {
            return appJsonAEQbTJ.getVersion();
        }
        return null;
    }

    @Override // o.InterfaceC43022rhT
    public java.lang.String copydefault() {
        if (AYXKKw()) {
            return null;
        }
        return this.EZpvd;
    }

    @Override // o.InterfaceC43022rhT
    public AppJson EZpvd() {
        return AYXKKw() ? AEQbTJ() : this.AEQbTJ;
    }

    @Override // o.InterfaceC43022rhT
    public java.lang.String OLrzqt() {
        return AYXKKw() ? djBIcL() : gEmmrt();
    }

    @Override // o.InterfaceC43022rhT
    public java.util.Set<java.lang.String> KWHzl() {
        ConcurrentHashMap.KeySetView<java.lang.String, java.lang.Boolean> keySetView = this.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(keySetView, "");
        return CollectionsKt___CollectionsKt.OqFWZa(keySetView);
    }

    @Override // o.InterfaceC43022rhT
    public void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.copydefault = true;
        this.EZpvd = str2;
        this.djBIcL = str3;
        this.AEQbTJ = OLrzqt(InterfaceC43022rhT.StateListAnimator.TaskDescription.OLrzqt);
        ConcurrentHashMap.KeySetView<java.lang.String, java.lang.Boolean> keySetView = this.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(keySetView, "");
        keySetView.add(str);
    }

    public static /* synthetic */ AppJson readAppJson$default(C43020rhR c43020rhR, InterfaceC43022rhT.StateListAnimator stateListAnimator, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            stateListAnimator = InterfaceC43022rhT.StateListAnimator.Application.EZpvd;
        }
        return c43020rhR.OLrzqt(stateListAnimator);
    }

    public final AppJson OLrzqt(InterfaceC43022rhT.StateListAnimator stateListAnimator) {
        return InterfaceC43022rhT.Companion.EZpvd(AEQbTJ(stateListAnimator));
    }

    @Override // o.InterfaceC43022rhT
    public C43045rhq AEQbTJ(@NotNull InterfaceC43022rhT.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        if (Intrinsics.EZpvd(stateListAnimator, InterfaceC43022rhT.StateListAnimator.Activity.EZpvd) || (!Intrinsics.EZpvd(stateListAnimator, InterfaceC43022rhT.StateListAnimator.TaskDescription.OLrzqt) && AYXKKw())) {
            return new C43045rhq(C43045rhq.Companion.copydefault(), C43047rhs.AEQbTJ.OLrzqt(this.KWHzl));
        }
        return new C43045rhq(C43045rhq.Companion.EZpvd(), this.djBIcL);
    }
}
