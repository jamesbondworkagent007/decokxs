package o;

import com.google.android.material.navigation.NavigationBarView;
import com.okinc.im.imui.app.ChatHomeBottomNavItem$observeIMUnreadCountFlow$1;
import com.okinc.im.imui.app.ChatHomeBottomNavItem$observeUserLoginStatus$1;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.C35399nuc;
import o.C44105sDn;
import o.C52761wXj;
import o.InterfaceC33251mst;
import o.nFE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ntY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35343ntY implements InterfaceC33251mst {
    public final CoroutineScope EZpvd = CoroutineScopeKt.CoroutineScope(sDN.copydefault.AEQbTJ().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null)));
    public Job KWHzl;
    public WeakReference<InterfaceC33252msu> OLrzqt;
    public boolean copydefault;
    public Job djBIcL;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC33248msq
    public int AEQbTJ() {
        return C35399nuc.StateListAnimator.DRGLNw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC33248msq
    public int KWHzl() {
        return C44105sDn.TaskDescription.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC33248msq
    public java.lang.String OLrzqt() {
        return "pay_chat";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC33248msq
    public int copydefault() {
        return C52761wXj.TaskDescription.Qsauvs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC33248msq
    public int djBIcL() {
        return C35399nuc.LoaderManager.HJWChPHhYHK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC33248msq
    public java.lang.String gEmmrt() {
        return "ConversationListFragment";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43216rlB
    public void init(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43216rlB
    public boolean isInitialized() {
        return this.copydefault;
    }

    @Override // o.InterfaceC33248msq
    public void AEQbTJ(@NotNull NavigationBarView navigationBarView, @NotNull android.view.MenuItem menuItem) {
        InterfaceC33251mst.StateListAnimator.KWHzl(this, navigationBarView, menuItem);
    }

    @Override // o.InterfaceC33248msq
    public void EZpvd(android.content.Intent intent) {
        InterfaceC33251mst.StateListAnimator.KWHzl(this, intent);
    }

    @Override // o.InterfaceC33248msq
    public boolean OLrzqt(@NotNull NavigationBarView navigationBarView, @NotNull android.view.MenuItem menuItem) {
        return InterfaceC33251mst.StateListAnimator.EZpvd(this, navigationBarView, menuItem);
    }

    @Override // o.InterfaceC33248msq
    public InterfaceC55083xdJ copydefault(@NotNull android.content.Context context) {
        return InterfaceC33251mst.StateListAnimator.KWHzl(this, context);
    }

    @Override // o.InterfaceC33248msq
    public boolean EZpvd() {
        return (sDZ.AEQbTJ.fetchVPNInfo().getValue().AEQbTJ() || ((InterfaceC31257lqc) C43251rlk.copydefault(InterfaceC31257lqc.class)).KWHzl()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000d  */
    @Override // o.InterfaceC33248msq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean copydefault(android.content.Intent intent) {
        boolean z;
        WeakReference<InterfaceC33252msu> weakReference;
        InterfaceC33252msu interfaceC33252msu;
        boolean zKWHzl = false;
        if (intent != null) {
            z = intent.getBooleanExtra("im_tab_type", false);
        }
        if (z && (weakReference = this.OLrzqt) != null && (interfaceC33252msu = weakReference.get()) != null) {
            zKWHzl = interfaceC33252msu.KWHzl(OLrzqt());
        }
        pUU.KWHzl("ChatHomeBottomNavItem", "shouldNavigateToImTab:" + z + ", hasNavigate:" + zKWHzl);
        return zKWHzl;
    }

    @Override // o.InterfaceC33248msq
    public void OLrzqt(@NotNull InterfaceC33252msu interfaceC33252msu) {
        Intrinsics.checkNotNullParameter(interfaceC33252msu, "");
        InterfaceC33251mst.StateListAnimator.KWHzl(this, interfaceC33252msu);
        this.OLrzqt = new WeakReference<>(interfaceC33252msu);
    }

    @Override // o.InterfaceC33248msq
    public void AEQbTJ(@NotNull NavigationBarView navigationBarView) {
        Intrinsics.checkNotNullParameter(navigationBarView, "");
        OLrzqt(navigationBarView);
        copydefault(navigationBarView);
    }

    public final void copydefault(NavigationBarView navigationBarView) {
        pUU.EZpvd("ChatHomeBottomNavItem", "observeUserLoginStatus");
        Job job = this.djBIcL;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.djBIcL = null;
        this.djBIcL = BuildersKt__Builders_commonKt.launch$default(this.EZpvd, null, null, new ChatHomeBottomNavItem$observeUserLoginStatus$1(this, navigationBarView, null), 3, null);
    }

    public final void OLrzqt(NavigationBarView navigationBarView) {
        Job job = this.KWHzl;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.KWHzl = null;
        this.KWHzl = BuildersKt__Builders_commonKt.launch$default(this.EZpvd, null, null, new ChatHomeBottomNavItem$observeIMUnreadCountFlow$1(navigationBarView, this, null), 3, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.nFE.Application.newInstance$default(o.nFE$Application, com.okinc.im.imui.conversationlist.model.ConversationListParams, int, java.lang.Object):o.nFE */
    @Override // o.InterfaceC33248msq
    public androidx.fragment.app.Fragment AEQbTJ(android.content.Intent intent) {
        return nFE.Application.newInstance$default(nFE.Companion, null, 1, null);
    }

    /* JADX INFO: renamed from: o.ntY$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ntY.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
