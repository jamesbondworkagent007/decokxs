package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.appupdate.api.AppUpdateService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.laM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30393laM extends AbstractC30448lbO<C21614hFx> {
    public static final ActionBar Companion = new ActionBar(null);

    @Override // o.hTH, o.AbstractC32998moE
    public void onVisible() {
    }

    /* JADX INFO: renamed from: o.laM$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.laM.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C30393laM AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C30393laM c30393laM = new C30393laM();
            android.os.Bundle bundle = new android.os.Bundle();
            C31200lpY.EZpvd(bundle, str);
            c30393laM.setArguments(bundle);
            return c30393laM;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.hTH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C21614hFx OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21614hFx c21614hFxKWHzl = C21614hFx.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21614hFxKWHzl, "");
        return c21614hFxKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.hTH
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C21614hFx c21614hFx, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(c21614hFx, "");
        C52794wYp c52794wYp = c21614hFx.AEQbTJ;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
        c21614hFx.getRoot().post(new java.lang.Runnable() { // from class: o.laK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C30393laM.OLrzqt(this.KWHzl);
            }
        });
    }

    public static final void OLrzqt(C30393laM c30393laM) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c30393laM, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.laM$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C30393laM OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C30393laM c30393laM) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = c30393laM;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                FragmentActivity activity = this.OLrzqt.getActivity();
                AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
                if (abstractActivityC33041mov != null) {
                    ((AppUpdateService) C43251rlk.copydefault(AppUpdateService.class)).checkUpdate(abstractActivityC33041mov, false);
                }
            }
        }
    }
}
