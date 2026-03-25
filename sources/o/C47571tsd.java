package o;

import com.immomo.mls.InitData;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tsd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47571tsd extends AbstractC43061riF {
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43061riF
    public java.lang.String copydefault() {
        return "PlanetForYouHome.lua";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C47501trL.Application.QKudOq;
    }

    @Override // o.AbstractC43061riF
    public android.view.ViewGroup EZpvd() {
        android.view.View view = getView();
        if (view != null) {
            return (android.view.ViewGroup) view.findViewById(C47501trL.TaskDescription.DcMfJKsgNvtZ);
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        view.post(new java.lang.Runnable() { // from class: o.tsb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C47571tsd.AEQbTJ(this.copydefault);
            }
        });
    }

    public static final void AEQbTJ(C47571tsd c47571tsd) {
        if (c47571tsd.copydefault) {
            return;
        }
        c47571tsd.copydefault = true;
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c47571tsd, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC43061riF
    public InitData OLrzqt() {
        return C43056riA.createInitDataForMiniApp$default(C43056riA.AEQbTJ, "market", "/feed/forYou", null, 4, null);
    }
}
