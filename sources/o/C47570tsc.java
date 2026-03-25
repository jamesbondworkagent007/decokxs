package o;

import com.immomo.mls.InitData;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tsc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47570tsc extends AbstractC43061riF {
    public boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43061riF
    public java.lang.String copydefault() {
        return "PlanetNewsHome.lua";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C47501trL.Application.iZzfmt;
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
        view.post(new java.lang.Runnable() { // from class: o.tsf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C47570tsc.AEQbTJ(this.AEQbTJ);
            }
        });
    }

    public static final void AEQbTJ(C47570tsc c47570tsc) {
        if (c47570tsc.OLrzqt) {
            return;
        }
        c47570tsc.OLrzqt = true;
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c47570tsc, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC43061riF
    public InitData OLrzqt() {
        return C43056riA.createInitDataForMiniApp$default(C43056riA.AEQbTJ, "market", "/feed/news", null, 4, null);
    }
}
