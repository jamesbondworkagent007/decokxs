package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.imui.group.publicgroup.PublicGroupInfoBottomsheetFragment$handleGroupClick$1;
import com.okinc.im.usecase.group.invite.CheckIsAllowGroupInvitationUseCase;
import com.okinc.okimcore.model.remote.PublicGroupInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class nZO extends wXX {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public C33916nKp AEQbTJ;
    public boolean EZpvd;
    public nZJ valueOf;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.nZQ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return nZO.gEmmrt(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.nZS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return nZO.AYXKKw(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.nZP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return nZO.djBIcL(this.AEQbTJ);
        }
    });

    public final java.lang.String EZpvd() {
        java.lang.Object value = this.copydefault.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (java.lang.String) value;
    }

    public static final java.lang.String gEmmrt(nZO nzo) {
        return nzo.requireArguments().getString("GroupOwnerName", "");
    }

    public final java.util.List<PublicGroupInfo> KWHzl() {
        return (java.util.List) this.djBIcL.getValue();
    }

    public static final java.util.List AYXKKw(nZO nzo) {
        java.util.ArrayList parcelableArrayList = nzo.requireArguments().getParcelableArrayList("PublicGroupInfoData");
        return parcelableArrayList != null ? parcelableArrayList : yDY.AhwBna();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C34168nTy AEQbTJ() {
        return (C34168nTy) this.OLrzqt.getValue();
    }

    public static final C34168nTy djBIcL(nZO nzo) {
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
        if (interfaceC35180nqU == null) {
            throw new java.lang.IllegalArgumentException("OKIMService not available".toString());
        }
        android.content.Context applicationContext = nzo.requireContext().getApplicationContext();
        Intrinsics.copydefault(applicationContext);
        CoroutineDispatcher coroutineDispatcherInvokespecialDaTmkG = ((InterfaceC44149sFc) C58114yvF.OLrzqt(applicationContext, InterfaceC44149sFc.class)).invokespecialDaTmkG();
        return new C34168nTy(new CheckIsAllowGroupInvitationUseCase(new oDL(interfaceC35180nqU.AEQbTJ().copydefault(), coroutineDispatcherInvokespecialDaTmkG), coroutineDispatcherInvokespecialDaTmkG), ((InterfaceC35332ntN) C58114yvF.OLrzqt(applicationContext, InterfaceC35332ntN.class)).ODWQjV());
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.AEQbTJ = C33916nKp.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        copydefault();
        OLrzqt();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.setTitle(C33069mpW.copydefault(this, C35399nuc.LoaderManager.aPFruk, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("name", EZpvd()))));
    }

    private final void copydefault() {
        C33916nKp c33916nKp = this.AEQbTJ;
        if (c33916nKp == null) {
            Intrinsics.gEmmrt("");
            c33916nKp = null;
        }
        RecyclerView recyclerView = c33916nKp.EZpvd;
        recyclerView.setHasFixedSize(true);
        nZJ nzj = new nZJ(new Function1() { // from class: o.nZR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return nZO.OLrzqt(this.KWHzl, (PublicGroupInfo) obj);
            }
        });
        this.valueOf = nzj;
        recyclerView.setAdapter(nzj);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
    }

    public static final Unit OLrzqt(nZO nzo, PublicGroupInfo publicGroupInfo) {
        Intrinsics.checkNotNullParameter(publicGroupInfo, "");
        if (!nzo.EZpvd) {
            nzo.KWHzl(C33129mqd.gEmmrt(publicGroupInfo.getInvitationId()), C33129mqd.gEmmrt(publicGroupInfo.getGroupId()));
        }
        return Unit.INSTANCE;
    }

    private final void OLrzqt() {
        nZJ nzj = this.valueOf;
        if (nzj == null) {
            Intrinsics.gEmmrt("");
            nzj = null;
        }
        nzj.EZpvd(KWHzl());
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2) {
        C33916nKp c33916nKp = this.AEQbTJ;
        if (c33916nKp == null) {
            Intrinsics.gEmmrt("");
            c33916nKp = null;
        }
        C55113xdn.showLoading$default(c33916nKp.AEQbTJ, 0L, 1, null);
        this.EZpvd = true;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PublicGroupInfoBottomsheetFragment$handleGroupClick$1(this, str2, str, null), 3, null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nZO.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final nZO EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<PublicGroupInfo> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            nZO nzo = new nZO();
            nzo.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("GroupOwnerName", str), C56390yDp.OLrzqt("PublicGroupInfoData", new java.util.ArrayList(list))));
            return nzo;
        }
    }
}
