package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.profileinstaller.ProfileVerifier;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.ws.channel.WalletTxHistorySubManager;
import com.okinc.business.defi.biz.net.bean.ApproveItem;
import com.okinc.business.defi.biz.net.bean.ApproveToken;
import com.okinc.business.defi.wallet.approve.ApproveListItem;
import com.okinc.business.defi.wallet.approve.ApproveRiskyTagType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C12827cuN;
import o.C13754dXa;
import o.eLJ;
import o.xZF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dXm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13766dXm extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public android.content.Context AEQbTJ;
    public AbstractC16508elJ AhwBna;
    public AbstractC12782ctV gEmmrt;
    public final C59534zip OLrzqt = new C59534zip();
    public java.util.List<ApproveListItem> EZpvd = yDY.AhwBna();
    public final Activity KWHzl = new Activity(new xZA(0, 300, null, 4, null));

    public final int OLrzqt() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getInt("PARAM_POPUPTYPE");
        }
        return 0;
    }

    /* JADX INFO: renamed from: o.dXm$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dXm.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C13766dXm newInstance$default(ActionBar actionBar, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = 30;
            }
            return actionBar.copydefault(i, i2);
        }

        public final C13766dXm copydefault(int i, int i2) {
            C13766dXm c13766dXm = new C13766dXm();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("PARAM_POPUPTYPE", i);
            bundle.putInt("PARAM_BLACKTAGLONGTIMEDAYLIMIT", i2);
            c13766dXm.setArguments(bundle);
            return c13766dXm;
        }
    }

    /* JADX INFO: renamed from: o.dXm$Activity */
    public static final class Activity extends xZF.TaskDescription<WalletTxHistorySubManager.SubResponse> {
        public Activity(xZA xza) {
            super("TxHistorySub-approveDetail", xza);
        }

        @Override // o.xZF.TaskDescription
        public void EZpvd(java.util.List<WalletTxHistorySubManager.SubResponse> list) {
            Intrinsics.checkNotNullParameter(list, "");
            AbstractC12782ctV abstractC12782ctV = C13766dXm.this.gEmmrt;
            if (abstractC12782ctV != null) {
                if ((list instanceof java.util.Collection) && list.isEmpty()) {
                    return;
                }
                for (WalletTxHistorySubManager.SubResponse subResponse : list) {
                    if (subResponse.isTxTypeAuthorization()) {
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
    }

    public final eLJ AEQbTJ() {
        return eLJ.StateListAnimator.getInstance$default(eLJ.Companion, null, 1, null);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.AhwBna = AbstractC16508elJ.KWHzl(android.view.LayoutInflater.from(constraintLayout.getContext()), constraintLayout, false);
        setDynamicFullScreen(true);
        constraintLayout.setLongClickable(false);
        OLrzqt(constraintLayout);
        valueOf();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        this.AEQbTJ = context;
    }

    public final java.util.List<ApproveItem> EZpvd() {
        int iOLrzqt = OLrzqt();
        if (iOLrzqt == 0) {
            return AEQbTJ().gEmmrt();
        }
        if (iOLrzqt == 1) {
            return AEQbTJ().valueOf();
        }
        return yDY.AhwBna();
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.defi.wallet.approve.ApproveListItem.copy$default(com.okinc.business.defi.wallet.approve.ApproveListItem, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.Long, int, java.lang.Integer, java.lang.String, boolean, java.lang.Long, boolean, java.util.List, java.lang.Integer, int, java.lang.Object):com.okinc.business.defi.wallet.approve.ApproveListItem */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v21, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v19, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r7v19, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v20, types: [T, android.content.Context] */
    public final void OLrzqt(ConstraintLayout constraintLayout) {
        android.view.View root;
        wYF wyf;
        RecyclerView recyclerView;
        java.lang.String strEZpvd;
        java.lang.String str;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        try {
            objectRef.element = requireContext();
        } catch (java.lang.Exception unused) {
            android.content.Context context = this.AEQbTJ;
            T t = context;
            if (context == null) {
                Intrinsics.gEmmrt("");
                t = 0;
            }
            objectRef.element = t;
        }
        this.OLrzqt.register(dXN.class, new TaskDescription(requireActivity().getSupportFragmentManager(), OLrzqt(), AEQbTJ()));
        AbstractC16508elJ abstractC16508elJ = this.AhwBna;
        if (abstractC16508elJ != null && (recyclerView3 = abstractC16508elJ.AEQbTJ) != null) {
            recyclerView3.setLayoutManager(new LinearLayoutManager((android.content.Context) objectRef.element));
            Unit unit = Unit.INSTANCE;
        }
        AbstractC16508elJ abstractC16508elJ2 = this.AhwBna;
        if (abstractC16508elJ2 != null && (recyclerView2 = abstractC16508elJ2.AEQbTJ) != null) {
            recyclerView2.setAdapter(this.OLrzqt);
            Unit unit2 = Unit.INSTANCE;
        }
        java.util.List<ApproveItem> listEZpvd = EZpvd();
        java.util.ArrayList<ApproveItem> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listEZpvd) {
            java.lang.Integer blackTagType = ((ApproveItem) obj).getBlackTagType();
            int value = ApproveRiskyTagType.DISCARDED_CONTRACT.getValue();
            if (blackTagType == null || blackTagType.intValue() != value) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            dismiss();
            Unit unit3 = Unit.INSTANCE;
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (ApproveItem approveItem : arrayList) {
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(C33129mqd.valueOf(approveItem.getCoinId()));
            java.lang.String strDjBIcL = c10854bwMKWHzl != null ? c10854bwMKWHzl.djBIcL() : null;
            java.lang.String str2 = strDjBIcL == null ? "" : strDjBIcL;
            java.lang.String coinId = approveItem.getCoinId();
            java.lang.String str3 = coinId == null ? "" : coinId;
            android.content.res.Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            java.lang.String showProjectIconUri = approveItem.getShowProjectIconUri(resources, C13754dXa.Activity.aKErDB);
            java.lang.String string = getString(C13754dXa.FragmentManager.RckOJh);
            Intrinsics.checkNotNullExpressionValue(string, "");
            java.lang.String showProjectName = approveItem.getShowProjectName(string);
            java.lang.String projectName = approveItem.getProjectName();
            java.lang.String network = approveItem.getNetwork();
            java.lang.String approvalAddress = approveItem.getApprovalAddress();
            java.lang.String linkApprovalAddress = approveItem.getLinkApprovalAddress();
            boolean zIsRiskyProject = approveItem.isRiskyProject();
            java.lang.Integer blackTagType2 = approveItem.getBlackTagType();
            java.lang.Long blackTagAlarmTime = approveItem.getBlackTagAlarmTime();
            java.util.List<ApproveToken> tokens = approveItem.getTokens();
            int iCopydefault = C11600cUg.copydefault(tokens != null ? java.lang.Integer.valueOf(tokens.size()) : null);
            java.lang.Integer blackTagLongTimeDayLimit = approveItem.getBlackTagLongTimeDayLimit();
            java.util.List<ApproveToken> tokens2 = approveItem.getTokens();
            if (tokens2 == null || tokens2.isEmpty()) {
                str = "2";
            } else {
                java.util.Iterator<T> it = tokens2.iterator();
                while (it.hasNext()) {
                    str = "1";
                    if (Intrinsics.EZpvd((java.lang.Object) ((ApproveToken) it.next()).getStatus(), (java.lang.Object) "1")) {
                        break;
                    }
                }
                str = "2";
            }
            ApproveListItem approveListItem = new ApproveListItem(str3, showProjectIconUri, showProjectName, str2, projectName, network, approvalAddress, linkApprovalAddress, zIsRiskyProject, blackTagType2, blackTagAlarmTime, iCopydefault, blackTagLongTimeDayLimit, str, true, approveItem.getBlackTagAlarmGapTime(), false, null, null, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, null);
            arrayList2.add(approveListItem.KWHzl((262143 & 1) != 0 ? approveListItem.gEmmrt : null, (262143 & 2) != 0 ? approveListItem.fetchVPNInfo : null, (262143 & 4) != 0 ? approveListItem.fJNWhG : null, (262143 & 8) != 0 ? approveListItem.AhwBna : null, (262143 & 16) != 0 ? approveListItem.fARcdN : null, (262143 & 32) != 0 ? approveListItem.fIwbmz : null, (262143 & 64) != 0 ? approveListItem.OLrzqt : null, (262143 & 128) != 0 ? approveListItem.AkhnZx : null, (262143 & 256) != 0 ? approveListItem.values : false, (262143 & 512) != 0 ? approveListItem.djBIcL : null, (262143 & 1024) != 0 ? approveListItem.AEQbTJ : null, (262143 & 2048) != 0 ? approveListItem.copydefault : 0, (262143 & 4096) != 0 ? approveListItem.valueOf : null, (262143 & 8192) != 0 ? approveListItem.ejfBZ : null, (262143 & 16384) != 0 ? approveListItem.DbNXlk : false, (262143 & 32768) != 0 ? approveListItem.EZpvd : null, (262143 & 65536) != 0 ? approveListItem.isConnected : false, (262143 & 131072) != 0 ? approveListItem.AYXKKw : null, (262143 & 262144) != 0 ? approveListItem.KWHzl : java.lang.Integer.valueOf(C13757dXd.copydefault.OLrzqt(approveListItem, (android.content.Context) objectRef.element, AEQbTJ()).size())));
        }
        this.EZpvd = arrayList2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj2 : arrayList2) {
            java.lang.Integer numOLrzqt = ((ApproveListItem) obj2).OLrzqt();
            java.lang.Object arrayList3 = linkedHashMap.get(numOLrzqt);
            if (arrayList3 == null) {
                arrayList3 = new java.util.ArrayList();
                linkedHashMap.put(numOLrzqt, arrayList3);
            }
            ((java.util.List) arrayList3).add(obj2);
        }
        int size = linkedHashMap.keySet().size();
        java.util.List<ApproveListItem> list = this.EZpvd;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (java.lang.Object obj3 : list) {
            java.lang.Integer numOLrzqt2 = ((ApproveListItem) obj3).OLrzqt();
            java.lang.Object arrayList4 = linkedHashMap2.get(numOLrzqt2);
            if (arrayList4 == null) {
                arrayList4 = new java.util.ArrayList();
                linkedHashMap2.put(numOLrzqt2, arrayList4);
            }
            ((java.util.List) arrayList4).add(obj3);
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList(linkedHashMap2.size());
        java.util.Iterator it2 = linkedHashMap2.entrySet().iterator();
        while (true) {
            boolean z = true;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            java.lang.Integer num = (java.lang.Integer) entry.getKey();
            if (num != null && num.intValue() == 1) {
                strEZpvd = pTD.EZpvd((android.content.Context) objectRef.element, C13754dXa.Dialog.AEQbTJ, ((java.util.List) entry.getValue()).size(), C56423yEv.EZpvd(C56390yDp.OLrzqt("count", java.lang.Integer.valueOf(((java.util.List) entry.getValue()).size()))));
            } else {
                strEZpvd = pTD.EZpvd((android.content.Context) objectRef.element, C13754dXa.Dialog.AkhnZx, ((java.util.List) entry.getValue()).size(), C56423yEv.EZpvd(C56390yDp.OLrzqt("count", java.lang.Integer.valueOf(((java.util.List) entry.getValue()).size()))));
            }
            java.util.List list2 = (java.util.List) entry.getValue();
            if (((java.util.List) entry.getValue()).size() <= 3 || size <= 1) {
                z = false;
            }
            arrayList5.add(new dXN(strEZpvd, list2, z));
        }
        this.OLrzqt.setItems(arrayList5);
        this.OLrzqt.notifyDataSetChanged();
        AbstractC16508elJ abstractC16508elJ3 = this.AhwBna;
        if (abstractC16508elJ3 != null && (recyclerView = abstractC16508elJ3.AEQbTJ) != null) {
            recyclerView.setVisibility(arrayList5.isEmpty() ^ true ? 0 : 8);
            Unit unit4 = Unit.INSTANCE;
        }
        AbstractC16508elJ abstractC16508elJ4 = this.AhwBna;
        if (abstractC16508elJ4 != null && (wyf = abstractC16508elJ4.EZpvd) != null) {
            C52794wYp c52794wYpCopydefault = wyf.copydefault();
            if (c52794wYpCopydefault != null) {
                KWHzl(c52794wYpCopydefault);
                Unit unit5 = Unit.INSTANCE;
            }
            C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
            if (c52794wYpCopydefault2 != null) {
                c52794wYpCopydefault2.setOnClickListener(new View.OnClickListener() { // from class: o.dXq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C13766dXm.KWHzl(this.OLrzqt, objectRef, view);
                    }
                });
                Unit unit6 = Unit.INSTANCE;
            }
            wyf.setSecondaryText(getString(C13754dXa.FragmentManager.fOrBHg));
            C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.dXp
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C13766dXm.copydefault(this.OLrzqt, view);
                    }
                });
                Unit unit7 = Unit.INSTANCE;
            }
            C52794wYp c52794wYpCopydefault3 = wyf.copydefault();
            if (c52794wYpCopydefault3 != null) {
                c52794wYpCopydefault3.setVisibility(0);
                Unit unit8 = Unit.INSTANCE;
            }
            C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ2 != null) {
                c52794wYpAEQbTJ2.setVisibility(0);
                Unit unit9 = Unit.INSTANCE;
            }
            C52794wYp c52794wYpAEQbTJ3 = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ3 != null) {
                c52794wYpAEQbTJ3.setOKDSType(260);
                Unit unit10 = Unit.INSTANCE;
            }
        }
        AbstractC16508elJ abstractC16508elJ5 = this.AhwBna;
        if (abstractC16508elJ5 == null || (root = abstractC16508elJ5.getRoot()) == null) {
            return;
        }
        constraintLayout.addView(root);
    }

    /* JADX INFO: renamed from: o.dXm$TaskDescription */
    public static final class TaskDescription extends dXJ {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(androidx.fragment.app.FragmentManager fragmentManager, int i, eLJ elj) {
            super(fragmentManager, i, elj);
            Intrinsics.copydefault(fragmentManager);
        }

        @Override // o.dXJ
        public void EZpvd(ApproveListItem approveListItem) {
            wYF wyf;
            C52794wYp c52794wYpCopydefault;
            wYF wyf2;
            C52794wYp c52794wYpCopydefault2;
            wYF wyf3;
            C52794wYp c52794wYpCopydefault3;
            wYF wyf4;
            C52794wYp c52794wYpCopydefault4;
            wYF wyf5;
            C52794wYp c52794wYpCopydefault5;
            Intrinsics.checkNotNullParameter(approveListItem, "");
            AbstractC16508elJ abstractC16508elJ = C13766dXm.this.AhwBna;
            if (abstractC16508elJ != null && (wyf5 = abstractC16508elJ.EZpvd) != null && (c52794wYpCopydefault5 = wyf5.copydefault()) != null) {
                C13766dXm.this.KWHzl(c52794wYpCopydefault5);
            }
            java.util.List list = C13766dXm.this.EZpvd;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (((ApproveListItem) obj).ejfBZ()) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                AbstractC16508elJ abstractC16508elJ2 = C13766dXm.this.AhwBna;
                if (abstractC16508elJ2 != null && (wyf4 = abstractC16508elJ2.EZpvd) != null && (c52794wYpCopydefault4 = wyf4.copydefault()) != null) {
                    c52794wYpCopydefault4.setClickable(false);
                }
                AbstractC16508elJ abstractC16508elJ3 = C13766dXm.this.AhwBna;
                if (abstractC16508elJ3 == null || (wyf3 = abstractC16508elJ3.EZpvd) == null || (c52794wYpCopydefault3 = wyf3.copydefault()) == null) {
                    return;
                }
                c52794wYpCopydefault3.setEnabled(false);
                return;
            }
            AbstractC16508elJ abstractC16508elJ4 = C13766dXm.this.AhwBna;
            if (abstractC16508elJ4 != null && (wyf2 = abstractC16508elJ4.EZpvd) != null && (c52794wYpCopydefault2 = wyf2.copydefault()) != null) {
                c52794wYpCopydefault2.setClickable(true);
            }
            AbstractC16508elJ abstractC16508elJ5 = C13766dXm.this.AhwBna;
            if (abstractC16508elJ5 == null || (wyf = abstractC16508elJ5.EZpvd) == null || (c52794wYpCopydefault = wyf.copydefault()) == null) {
                return;
            }
            c52794wYpCopydefault.setEnabled(true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(final C13766dXm c13766dXm, final Ref.ObjectRef objectRef, android.view.View view) {
        java.util.List<ApproveListItem> list = c13766dXm.EZpvd;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((ApproveListItem) obj).ejfBZ()) {
                arrayList.add(obj);
            }
        }
        final java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C56406yEe.KWHzl(arrayList2, C13757dXd.copydefault.OLrzqt((ApproveListItem) it.next(), (android.content.Context) objectRef.element, c13766dXm.AEQbTJ()));
        }
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.dXt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C13766dXm.AEQbTJ(objectRef, arrayList2, c13766dXm, (AbstractC12782ctV) obj2);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dXx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                C13766dXm.OLrzqt(function1, obj2);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dXy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C13766dXm.KWHzl(this.EZpvd, (java.lang.Throwable) obj2);
            }
        };
        abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dXu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                C13766dXm.AYXKKw(function12, obj2);
            }
        });
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(final Ref.ObjectRef objectRef, final java.util.List list, final C13766dXm c13766dXm, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV.gHZMYf() || abstractC12782ctV.AEQbTJ(WalletType.HardwareWallet)) {
            InterfaceC9854bdT interfaceC9854bdT = (InterfaceC9854bdT) C43251rlk.OLrzqt(InterfaceC9854bdT.class);
            if (interfaceC9854bdT != null) {
                interfaceC9854bdT.OLrzqt((android.content.Context) objectRef.element, list);
            }
            c13766dXm.dismissAllowingStateLoss();
        } else {
            FragmentActivity fragmentActivityRequireActivity = c13766dXm.requireActivity();
            androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivityRequireActivity != null ? fragmentActivityRequireActivity.getSupportFragmentManager() : null;
            if (supportFragmentManager != null) {
                new C14506dmj(supportFragmentManager, "approveRiskBottomSheet", true, new Function1() { // from class: o.dXr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C13766dXm.AEQbTJ(objectRef, list, c13766dXm, (java.lang.String) obj);
                    }
                }, new Function0() { // from class: o.dXs
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C13766dXm.KWHzl();
                    }
                }).EZpvd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(Ref.ObjectRef objectRef, java.util.List list, C13766dXm c13766dXm, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC9854bdT interfaceC9854bdT = (InterfaceC9854bdT) C43251rlk.OLrzqt(InterfaceC9854bdT.class);
        if (interfaceC9854bdT != null) {
            interfaceC9854bdT.OLrzqt((android.content.Context) objectRef.element, list);
        }
        c13766dXm.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl() {
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C13766dXm c13766dXm, java.lang.Throwable th) {
        c13766dXm.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final void copydefault(C13766dXm c13766dXm, android.view.View view) {
        c13766dXm.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AYXKKw();
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    private final void valueOf() {
        AbstractC58260yxt abstractC58260yxtKWHzl = C58156yvv.KWHzl(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false), this);
        final Function1 function1 = new Function1() { // from class: o.dXw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13766dXm.EZpvd(this.AEQbTJ, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dXv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C13766dXm.gEmmrt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dXz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13766dXm.OLrzqt((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dXA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C13766dXm.valueOf(function12, obj);
            }
        });
        C11205cFp.EZpvd.AxsJAY().AEQbTJ(this.KWHzl);
    }

    public static final Unit EZpvd(C13766dXm c13766dXm, AbstractC12782ctV abstractC12782ctV) {
        c13766dXm.gEmmrt = abstractC12782ctV;
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    private final void AYXKKw() {
        C11205cFp.EZpvd.AxsJAY().OLrzqt(this.KWHzl);
    }

    public final void KWHzl(C52794wYp c52794wYp) {
        java.lang.String string;
        java.util.List<ApproveListItem> list = this.EZpvd;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((ApproveListItem) obj).ejfBZ()) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            java.lang.Integer numEZpvd = ((ApproveListItem) it.next()).EZpvd();
            iIntValue += numEZpvd != null ? numEZpvd.intValue() : 0;
        }
        java.util.Iterator<T> it2 = this.EZpvd.iterator();
        int iIntValue2 = 0;
        while (it2.hasNext()) {
            java.lang.Integer numEZpvd2 = ((ApproveListItem) it2.next()).EZpvd();
            iIntValue2 += numEZpvd2 != null ? numEZpvd2.intValue() : 0;
        }
        if (iIntValue == iIntValue2) {
            string = getString(C13754dXa.FragmentManager.aRClCA);
        } else if (iIntValue > 0) {
            string = C33069mpW.copydefault(this, C13754dXa.FragmentManager.UimiPOhkCVbT, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(iIntValue))));
        } else {
            string = getString(C13754dXa.FragmentManager.zCTncp);
        }
        c52794wYp.setText(string);
    }
}
