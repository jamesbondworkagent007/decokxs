package o;

import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.im.bean.ChatOrigin;
import com.okinc.im.imui.conversationlist.ConversationListFragment;
import com.okinc.im.imui.conversationlist.ConversationListParentFragment$observeUserEvent$1;
import com.okinc.im.imui.conversationlist.model.ConversationListParams;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class nFE extends AbstractC32996moC {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final int KWHzl = C35399nuc.Dialog.dUDNAs;
    public C33914nKn copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.KWHzl;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nFE.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ nFE newInstance$default(Application application, ConversationListParams conversationListParams, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                conversationListParams = new ConversationListParams(ChatOrigin.CHAT, false, false, true, 0, true, false, true, true, 22, null);
            }
            return application.KWHzl(conversationListParams);
        }

        public final nFE KWHzl(@NotNull ConversationListParams conversationListParams) {
            Intrinsics.checkNotNullParameter(conversationListParams, "");
            nFE nfe = new nFE();
            nfe.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("route_params", conversationListParams)));
            return nfe;
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C33914nKn c33914nKnKWHzl = C33914nKn.KWHzl(layoutInflater, viewGroup, false);
        this.copydefault = c33914nKnKWHzl;
        if (c33914nKnKWHzl != null) {
            return c33914nKnKWHzl.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        OLrzqt();
        AEQbTJ();
        view.post(new java.lang.Runnable() { // from class: o.nFD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                nFE.OLrzqt(this.OLrzqt);
            }
        });
    }

    public static final void OLrzqt(nFE nfe) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) nfe, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void OLrzqt() {
        getChildFragmentManager().beginTransaction().replace(C35399nuc.StateListAnimator.sYcwUD, EZpvd()).commitAllowingStateLoss();
    }

    public final androidx.fragment.app.Fragment EZpvd() {
        ConversationListParams conversationListParams;
        if (!C44157sFk.gEmmrt().values()) {
            return C33803nGk.Companion.KWHzl();
        }
        if (C44157sFk.gEmmrt().DbNXlk()) {
            return C33802nGj.Companion.AEQbTJ();
        }
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (conversationListParams = (ConversationListParams) BundleCompat.getParcelable(arguments, "route_params", ConversationListParams.class)) == null) {
            conversationListParams = new ConversationListParams(null, false, false, oGU.isInPlanetMode$default(oGU.KWHzl, null, 1, null), 0, false, false, false, false, 503, null);
        }
        return ConversationListFragment.Companion.copydefault(conversationListParams);
    }

    public final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ConversationListParentFragment$observeUserEvent$1(this, null), 3, null);
    }
}
