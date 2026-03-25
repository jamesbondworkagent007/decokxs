package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.ws.channel.WalletTxHistorySubManager;
import com.okinc.business.defi.biz.net.bean.ApproveItem;
import com.okinc.business.defi.biz.net.bean.ApproveToken;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import com.okinc.business.defi.wallet.approve.ApproveListItem;
import com.okinc.business.defi.wallet.approve.ApproveRiskyTagType;
import com.okinc.components.track.TrackChannel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import o.C13754dXa;
import o.xZF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dXD extends AbstractActivityC33013moT {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public static final java.util.Map<java.lang.Integer, java.lang.String> OLrzqt = C56424yEw.gEmmrt(C56390yDp.OLrzqt(java.lang.Integer.valueOf(ApproveRiskyTagType.MALICIOUS_ADDRESS.getValue()), C33070mpX.AYXKKw(C13754dXa.FragmentManager.f1055a)), C56390yDp.OLrzqt(java.lang.Integer.valueOf(ApproveRiskyTagType.DISCARDED_CONTRACT.getValue()), C33070mpX.AYXKKw(C13754dXa.FragmentManager.DbvGUJ)), C56390yDp.OLrzqt(java.lang.Integer.valueOf(ApproveRiskyTagType.INACTIVE_APPROVAL.getValue()), C33070mpX.AYXKKw(C13754dXa.FragmentManager.GVpNrs)));
    public AbstractC16237egD AhwBna;
    public AbstractC12782ctV djBIcL;
    public final C59534zip copydefault = new C59534zip();
    public java.util.List<ApproveListItem> KWHzl = yDY.AhwBna();
    public final Activity AEQbTJ = new Activity(new xZA(0, 300, null, 4, null));

    public static final /* synthetic */ class PendingIntent implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dXD.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            context.startActivity(new android.content.Intent(context, (java.lang.Class<?>) dXD.class));
        }
    }

    public static final class Activity extends xZF.TaskDescription<WalletTxHistorySubManager.SubResponse> {
        public Activity(xZA xza) {
            super("TxHistorySub-approveDetail", xza);
        }

        @Override // o.xZF.TaskDescription
        public void EZpvd(java.util.List<WalletTxHistorySubManager.SubResponse> list) {
            Intrinsics.checkNotNullParameter(list, "");
            dXD dxd = dXD.this;
            if ((list instanceof java.util.Collection) && list.isEmpty()) {
                return;
            }
            for (WalletTxHistorySubManager.SubResponse subResponse : list) {
                if (subResponse.isTxTypeAuthorization()) {
                    AbstractC12782ctV abstractC12782ctV = dxd.djBIcL;
                    if (abstractC12782ctV == null) {
                        Intrinsics.gEmmrt("");
                        abstractC12782ctV = null;
                    }
                    java.lang.String address = subResponse.getAddress();
                    if (address == null) {
                        address = "";
                    }
                    if (abstractC12782ctV.DbNXlk(address)) {
                        C15523eLm.refresh$default(C15523eLm.KWHzl, null, false, 2, null);
                        return;
                    }
                }
            }
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AbstractC16237egD abstractC16237egD = null;
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
        if (abstractC12782ctV == null) {
            finish();
            return;
        }
        this.djBIcL = abstractC12782ctV;
        AbstractC16237egD abstractC16237egDCopydefault = AbstractC16237egD.copydefault(getLayoutInflater());
        this.AhwBna = abstractC16237egDCopydefault;
        if (abstractC16237egDCopydefault == null) {
            Intrinsics.gEmmrt("");
            abstractC16237egDCopydefault = null;
        }
        setContentView(abstractC16237egDCopydefault.getRoot());
        AbstractC16237egD abstractC16237egD2 = this.AhwBna;
        if (abstractC16237egD2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16237egD = abstractC16237egD2;
        }
        abstractC16237egD.djBIcL.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.dXC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                dXD.EZpvd(this.EZpvd, view);
            }
        });
        EZpvd();
        AEQbTJ();
    }

    public static final void EZpvd(dXD dxd, android.view.View view) {
        dxd.finish();
    }

    private final void EZpvd() {
        C59534zip c59534zip = this.copydefault;
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c59534zip.register(dXW.class, new dXU(supportFragmentManager));
        AbstractC16237egD abstractC16237egD = this.AhwBna;
        AbstractC16237egD abstractC16237egD2 = null;
        if (abstractC16237egD == null) {
            Intrinsics.gEmmrt("");
            abstractC16237egD = null;
        }
        abstractC16237egD.AYXKKw.setLayoutManager(new LinearLayoutManager(this));
        AbstractC16237egD abstractC16237egD3 = this.AhwBna;
        if (abstractC16237egD3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16237egD2 = abstractC16237egD3;
        }
        abstractC16237egD2.AYXKKw.setAdapter(this.copydefault);
        C15523eLm.KWHzl.AEQbTJ().observe(this, new PendingIntent(new Function1() { // from class: o.dXB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dXD.OLrzqt(this.AEQbTJ, (java.util.List) obj);
            }
        }));
    }

    public static final Unit OLrzqt(dXD dxd, java.util.List list) {
        java.lang.String str;
        java.util.List<ApproveItem> listGEmmrt = C15523eLm.KWHzl.gEmmrt();
        int iCopydefault = 0;
        AbstractC16237egD abstractC16237egD = null;
        if (listGEmmrt.isEmpty()) {
            AbstractC16237egD abstractC16237egD2 = dxd.AhwBna;
            if (abstractC16237egD2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16237egD2 = null;
            }
            LinearLayoutCompat linearLayoutCompat = abstractC16237egD2.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility(0);
            AbstractC16237egD abstractC16237egD3 = dxd.AhwBna;
            if (abstractC16237egD3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16237egD3 = null;
            }
            NestedScrollView nestedScrollView = abstractC16237egD3.valueOf;
            Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
            nestedScrollView.setVisibility(8);
            AbstractC16237egD abstractC16237egD4 = dxd.AhwBna;
            if (abstractC16237egD4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16237egD4 = null;
            }
            LinearLayoutCompat linearLayoutCompat2 = abstractC16237egD4.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
            linearLayoutCompat2.setVisibility(8);
            AbstractC16237egD abstractC16237egD5 = dxd.AhwBna;
            if (abstractC16237egD5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16237egD5 = null;
            }
            android.widget.ImageView imageView = abstractC16237egD5.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C14677dpv.OLrzqt(imageView, CDNSourceManager.ImageSource.ApprovalNoRisk);
            AbstractC16237egD abstractC16237egD6 = dxd.AhwBna;
            if (abstractC16237egD6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16237egD6 = null;
            }
            android.widget.ImageView imageView2 = abstractC16237egD6.AhwBna;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            C14677dpv.OLrzqt(imageView2, CDNSourceManager.ImageSource.ApprovalRisk);
            AbstractC16237egD abstractC16237egD7 = dxd.AhwBna;
            if (abstractC16237egD7 == null) {
                Intrinsics.gEmmrt("");
                abstractC16237egD7 = null;
            }
            abstractC16237egD7.EZpvd.setText(dxd.getString(C13754dXa.FragmentManager.UkvvWh));
            AbstractC16237egD abstractC16237egD8 = dxd.AhwBna;
            if (abstractC16237egD8 == null) {
                Intrinsics.gEmmrt("");
                abstractC16237egD8 = null;
            }
            abstractC16237egD8.KWHzl.setText(dxd.getString(C13754dXa.FragmentManager.RequiresPermissionWrite));
            AbstractC16237egD abstractC16237egD9 = dxd.AhwBna;
            if (abstractC16237egD9 == null) {
                Intrinsics.gEmmrt("");
                abstractC16237egD9 = null;
            }
            C52794wYp c52794wYp = abstractC16237egD9.KWHzl;
            c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, dxd));
            rVN.reportFullyDrawn$default((android.app.Activity) dxd, true, (java.lang.String) null, 2, (java.lang.Object) null);
        } else {
            AbstractC16237egD abstractC16237egD10 = dxd.AhwBna;
            if (abstractC16237egD10 == null) {
                Intrinsics.gEmmrt("");
                abstractC16237egD10 = null;
            }
            android.widget.ImageView imageView3 = abstractC16237egD10.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            C14677dpv.OLrzqt(imageView3, CDNSourceManager.ImageSource.ApprovalRisk);
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
            for (ApproveItem approveItem : listGEmmrt) {
                C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(C33129mqd.valueOf(approveItem.getCoinId()));
                java.lang.String strDjBIcL = c10854bwMKWHzl != null ? c10854bwMKWHzl.djBIcL() : null;
                java.lang.String str2 = strDjBIcL == null ? "" : strDjBIcL;
                java.lang.String coinId = approveItem.getCoinId();
                java.lang.String str3 = coinId == null ? "" : coinId;
                java.lang.String showProjectIconUri = approveItem.getShowProjectIconUri(dxd.getResources(), C13754dXa.Activity.aKErDB);
                java.lang.String string = dxd.getString(C13754dXa.FragmentManager.RckOJh);
                Intrinsics.checkNotNullExpressionValue(string, "");
                java.lang.String showProjectName = approveItem.getShowProjectName(string);
                java.lang.String projectName = approveItem.getProjectName();
                java.lang.String network = approveItem.getNetwork();
                java.lang.String approvalAddress = approveItem.getApprovalAddress();
                java.lang.String linkApprovalAddress = approveItem.getLinkApprovalAddress();
                boolean zIsRiskyProject = approveItem.isRiskyProject();
                java.lang.Integer blackTagType = approveItem.getBlackTagType();
                java.lang.Long blackTagAlarmTime = approveItem.getBlackTagAlarmTime();
                java.util.List<ApproveToken> tokens = approveItem.getTokens();
                int iCopydefault2 = C11600cUg.copydefault(tokens != null ? java.lang.Integer.valueOf(tokens.size()) : null);
                java.lang.Integer blackTagLongTimeDayLimit = approveItem.getBlackTagLongTimeDayLimit();
                java.util.List<ApproveToken> tokens2 = approveItem.getTokens();
                if (tokens2 == null || tokens2.isEmpty()) {
                    str = "2";
                } else {
                    java.util.Iterator<T> it = tokens2.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.EZpvd((java.lang.Object) ((ApproveToken) it.next()).getStatus(), (java.lang.Object) "1")) {
                            str = "1";
                            break;
                        }
                    }
                    str = "2";
                }
                arrayList.add(new ApproveListItem(str3, showProjectIconUri, showProjectName, str2, projectName, network, approvalAddress, linkApprovalAddress, zIsRiskyProject, blackTagType, blackTagAlarmTime, iCopydefault2, blackTagLongTimeDayLimit, str, false, null, false, null, null, 507904, null));
            }
            dxd.KWHzl = arrayList;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (java.lang.Object obj : arrayList) {
                java.lang.Integer numOLrzqt = ((ApproveListItem) obj).OLrzqt();
                java.lang.Object arrayList2 = linkedHashMap.get(numOLrzqt);
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList();
                    linkedHashMap.put(numOLrzqt, arrayList2);
                }
                ((java.util.List) arrayList2).add(obj);
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList3.add(new dXW(OLrzqt.getOrDefault(java.lang.Integer.valueOf(C33129mqd.AhwBna(entry.getKey())), ""), (java.util.List) entry.getValue()));
            }
            dxd.copydefault.setItems(arrayList3);
            dxd.copydefault.notifyDataSetChanged();
            rVN.reportFullyDrawn$default((android.app.Activity) dxd, true, (java.lang.String) null, 2, (java.lang.Object) null);
            AbstractC16237egD abstractC16237egD11 = dxd.AhwBna;
            if (abstractC16237egD11 == null) {
                Intrinsics.gEmmrt("");
                abstractC16237egD11 = null;
            }
            RecyclerView recyclerView = abstractC16237egD11.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility(arrayList3.isEmpty() ^ true ? 0 : 8);
            AbstractC16237egD abstractC16237egD12 = dxd.AhwBna;
            if (abstractC16237egD12 == null) {
                Intrinsics.gEmmrt("");
                abstractC16237egD12 = null;
            }
            android.widget.TextView textView = abstractC16237egD12.copydefault;
            int i = C13754dXa.Dialog.EZpvd;
            int size = listGEmmrt.size();
            java.util.Iterator<T> it2 = listGEmmrt.iterator();
            while (it2.hasNext()) {
                java.util.List<ApproveToken> tokens3 = ((ApproveItem) it2.next()).getTokens();
                iCopydefault += C11600cUg.copydefault(tokens3 != null ? java.lang.Integer.valueOf(tokens3.size()) : null);
            }
            textView.setText(pTD.EZpvd(dxd, i, size, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(iCopydefault)))));
            AbstractC16237egD abstractC16237egD13 = dxd.AhwBna;
            if (abstractC16237egD13 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16237egD = abstractC16237egD13;
            }
            C52794wYp c52794wYp2 = abstractC16237egD.KWHzl;
            c52794wYp2.setOnClickListener(new Dialog(c52794wYp2, 1000L, dxd));
        }
        return Unit.INSTANCE;
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ dXD EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, dXD dxd) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = dxd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                AbstractC12782ctV abstractC12782ctV = null;
                C32866mlf.onEvent$default("Web3Approvals_Btm_Revokeall_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                java.util.List list = this.EZpvd.KWHzl;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    C56406yEe.KWHzl(arrayList, C13757dXd.copydefault.OLrzqt((ApproveListItem) it.next(), this.EZpvd, C15523eLm.KWHzl));
                }
                AbstractC12782ctV abstractC12782ctV2 = this.EZpvd.djBIcL;
                if (abstractC12782ctV2 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC12782ctV2 = null;
                }
                if (!abstractC12782ctV2.gHZMYf()) {
                    AbstractC12782ctV abstractC12782ctV3 = this.EZpvd.djBIcL;
                    if (abstractC12782ctV3 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        abstractC12782ctV = abstractC12782ctV3;
                    }
                    if (!abstractC12782ctV.AEQbTJ(WalletType.HardwareWallet)) {
                        androidx.fragment.app.FragmentManager supportFragmentManager = this.EZpvd.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                        new C14506dmj(supportFragmentManager, "approveRiskDetail", true, this.EZpvd.new ActionBar(arrayList), StateListAnimator.KWHzl).EZpvd();
                        return;
                    }
                }
                InterfaceC9854bdT interfaceC9854bdT = (InterfaceC9854bdT) C43251rlk.OLrzqt(InterfaceC9854bdT.class);
                if (interfaceC9854bdT != null) {
                    interfaceC9854bdT.OLrzqt(this.EZpvd, arrayList);
                }
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ dXD KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, dXD dxd) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = dxd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.finish();
            }
        }
    }

    public static final class ActionBar implements Function1<java.lang.String, Unit> {
        public final /* synthetic */ java.util.List<DappInteractionArgs> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(java.util.List<DappInteractionArgs> list) {
            this.OLrzqt = list;
        }

        public final void copydefault(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            InterfaceC9854bdT interfaceC9854bdT = (InterfaceC9854bdT) C43251rlk.OLrzqt(InterfaceC9854bdT.class);
            if (interfaceC9854bdT != null) {
                interfaceC9854bdT.OLrzqt(dXD.this, this.OLrzqt);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.String str) {
            copydefault(str);
            return Unit.INSTANCE;
        }
    }

    public static final class StateListAnimator implements Function0<Unit> {
        public static final StateListAnimator KWHzl = new StateListAnimator();

        public final void EZpvd() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            EZpvd();
            return Unit.INSTANCE;
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        OLrzqt();
    }

    private final void AEQbTJ() {
        AbstractC58260yxt abstractC58260yxtKWHzl = C58156yvv.KWHzl(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false), this);
        final Function1 function1 = new Function1() { // from class: o.dXG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dXD.OLrzqt(this.KWHzl, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dXE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dXD.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dXF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dXD.copydefault((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dXI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dXD.AEQbTJ(function12, obj);
            }
        });
        C11205cFp.EZpvd.AxsJAY().AEQbTJ(this.AEQbTJ);
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(dXD dxd, AbstractC12782ctV abstractC12782ctV) {
        dxd.djBIcL = abstractC12782ctV;
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    private final void OLrzqt() {
        C11205cFp.EZpvd.AxsJAY().OLrzqt(this.AEQbTJ);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
