package o;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.amplifyframework.ui.liveness.camera.LivenessCoordinator;
import com.okinc.business.defi.biz.core.common.WalletSelectedChainBean;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.business.defi.wallet.bean.SelectedNetworkData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C10614brl;
import o.C13754dXa;
import o.Point;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.edV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16096edV extends ViewModel {
    public final MutableStateFlow<java.lang.Boolean> AEQbTJ;
    public final StateFlow<java.util.List<SelectedNetworkData>> AYXKKw;
    public final java.util.Comparator<SelectedNetworkData> AhwBna;
    public final MutableStateFlow<java.util.List<SelectedNetworkData>> EZpvd;
    public final java.util.List<SelectedNetworkData> KWHzl;
    public final MutableStateFlow<Point<TaskDescription>> OLrzqt;
    public final StateFlow<java.lang.Boolean> copydefault;
    public java.lang.String djBIcL;
    public final StateFlow<Point<TaskDescription>> gEmmrt;
    public final java.util.List<C13784dYd> isConnected;
    public java.lang.CharSequence valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.util.List<SelectedNetworkData>> AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Point<TaskDescription>> KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.Boolean> OLrzqt() {
        return this.copydefault;
    }

    public C16096edV(@NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.djBIcL = "-9223372036854775808";
        this.KWHzl = new java.util.ArrayList();
        this.AhwBna = new java.util.Comparator() { // from class: o.edY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return C16096edV.EZpvd((SelectedNetworkData) obj, (SelectedNetworkData) obj2);
            }
        };
        MutableStateFlow<Point<TaskDescription>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<java.lang.Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.AEQbTJ = MutableStateFlow2;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<java.util.List<SelectedNetworkData>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.EZpvd = MutableStateFlow3;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow3);
        this.isConnected = new java.util.ArrayList();
    }

    public static final int EZpvd(SelectedNetworkData selectedNetworkData, SelectedNetworkData selectedNetworkData2) {
        if (selectedNetworkData.djBIcL() > selectedNetworkData2.djBIcL()) {
            return 1;
        }
        return selectedNetworkData.djBIcL() == selectedNetworkData2.djBIcL() ? 0 : -1;
    }

    public final void KWHzl(AbstractC12782ctV abstractC12782ctV) {
        java.lang.String strDbNXlk;
        java.lang.String strOLrzqt;
        java.lang.Boolean value;
        java.util.List<C10854bwM> listOFhtUX;
        java.lang.String strDbNXlk2;
        this.KWHzl.clear();
        this.isConnected.clear();
        C10614brl instance$default = C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null);
        if (abstractC12782ctV == null || (strDbNXlk = abstractC12782ctV.DbNXlk()) == null) {
            strDbNXlk = "";
        }
        WalletSelectedChainBean walletSelectedChainBeanKWHzl = instance$default.KWHzl(strDbNXlk);
        this.djBIcL = walletSelectedChainBeanKWHzl.getChainId();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsPickVisualMediaSingleMimeType);
        if (abstractC12782ctV == null || (strOLrzqt = abstractC12782ctV.OLrzqt("opened")) == null) {
            strOLrzqt = "0";
        }
        arrayList2.add(new SelectedNetworkData("", strAYXKKw, "", strOLrzqt, Long.MIN_VALUE, Long.MIN_VALUE, true, true, Intrinsics.EZpvd((java.lang.Object) walletSelectedChainBeanKWHzl.getChainId(), (java.lang.Object) "-9223372036854775808") && !walletSelectedChainBeanKWHzl.isSingleMode(), 0, false, 0, false, false, (abstractC12782ctV == null || (strDbNXlk2 = abstractC12782ctV.DbNXlk()) == null) ? "" : strDbNXlk2, null, 48640, null));
        arrayList.add(new C13784dYd(false, "", CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList2)));
        java.util.HashMap map = new java.util.HashMap();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.List listAhwBna = yDY.AhwBna("");
        if (abstractC12782ctV != null && (listOFhtUX = abstractC12782ctV.OFhtUX()) != null) {
            for (C10854bwM c10854bwM : listOFhtUX) {
                if (c10854bwM.hBpjJd() && !abstractC12782ctV.getFieldNames()) {
                    arrayList4.add(AEQbTJ(c10854bwM, abstractC12782ctV, walletSelectedChainBeanKWHzl));
                }
                if (c10854bwM.djBIcL().length() > 0) {
                    char cCharAt = c10854bwM.djBIcL().charAt(0);
                    if (java.lang.Character.isLetter(cCharAt)) {
                        char upperCase = java.lang.Character.toUpperCase(cCharAt);
                        java.util.List arrayList5 = (java.util.List) map.get(java.lang.Character.valueOf(upperCase));
                        if (arrayList5 == null) {
                            arrayList5 = new java.util.ArrayList();
                            map.put(java.lang.Character.valueOf(upperCase), arrayList5);
                        }
                        SelectedNetworkData selectedNetworkDataAEQbTJ = AEQbTJ(c10854bwM, abstractC12782ctV, walletSelectedChainBeanKWHzl);
                        arrayList5.add(selectedNetworkDataAEQbTJ);
                        this.KWHzl.add(selectedNetworkDataAEQbTJ);
                    } else {
                        SelectedNetworkData selectedNetworkDataAEQbTJ2 = AEQbTJ(c10854bwM, abstractC12782ctV, walletSelectedChainBeanKWHzl);
                        arrayList3.add(selectedNetworkDataAEQbTJ2);
                        this.KWHzl.add(selectedNetworkDataAEQbTJ2);
                    }
                }
            }
        }
        if (abstractC12782ctV != null && AbstractC12782ctV.isCustomNetworkSupport$default(abstractC12782ctV, false, 1, null)) {
            for (CustomChainMeta customChainMeta : C10598brV.AEQbTJ.fetchVPNInfo()) {
                if (customChainMeta.OLrzqt().length() > 0) {
                    char cCharAt2 = customChainMeta.OLrzqt().charAt(0);
                    if (java.lang.Character.isLetter(cCharAt2)) {
                        char upperCase2 = java.lang.Character.toUpperCase(cCharAt2);
                        java.lang.Object arrayList6 = (java.util.List) map.get(java.lang.Character.valueOf(upperCase2));
                        if (arrayList6 == null) {
                            arrayList6 = new java.util.ArrayList();
                            map.put(java.lang.Character.valueOf(upperCase2), arrayList6);
                        }
                        SelectedNetworkData selectedNetworkDataKWHzl = KWHzl(customChainMeta, walletSelectedChainBeanKWHzl, abstractC12782ctV);
                        C56532yIw.OLrzqt(arrayList6).add(selectedNetworkDataKWHzl);
                        this.KWHzl.add(selectedNetworkDataKWHzl);
                    } else {
                        SelectedNetworkData selectedNetworkDataKWHzl2 = KWHzl(customChainMeta, walletSelectedChainBeanKWHzl, abstractC12782ctV);
                        arrayList3.add(selectedNetworkDataKWHzl2);
                        this.KWHzl.add(selectedNetworkDataKWHzl2);
                    }
                }
            }
        }
        if (copydefault()) {
            arrayList4.clear();
            listAhwBna.clear();
        }
        if (arrayList4.size() > 0) {
            listAhwBna.add("★");
            C56407yEf.copydefault(arrayList4, this.AhwBna);
            arrayList.add(new C13784dYd(true, C33070mpX.AYXKKw(C13754dXa.FragmentManager.ikEgkI), CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList4)));
        }
        for (char c = 'A'; c < '['; c = (char) (c + 1)) {
            java.util.List list = (java.util.List) map.get(java.lang.Character.valueOf(c));
            if (list != null) {
                if (copydefault()) {
                    arrayList.add(new C13784dYd(false, java.lang.String.valueOf(c), CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list)));
                } else {
                    listAhwBna.add(java.lang.String.valueOf(c));
                    arrayList.add(new C13784dYd(true, java.lang.String.valueOf(c), CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list)));
                }
            }
        }
        this.isConnected.addAll(arrayList);
        MutableStateFlow<Point<TaskDescription>> mutableStateFlow = this.OLrzqt;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new Point.Application(new TaskDescription(listAhwBna, arrayList)))) {
        }
        MutableStateFlow<java.lang.Boolean> mutableStateFlow2 = this.AEQbTJ;
        do {
            value = mutableStateFlow2.getValue();
            value.booleanValue();
        } while (!mutableStateFlow2.compareAndSet(value, java.lang.Boolean.valueOf(this.KWHzl.size() + arrayList4.size() > 10)));
        java.lang.CharSequence charSequence = this.valueOf;
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        KWHzl(this.valueOf);
    }

    public final boolean copydefault() {
        java.lang.CharSequence charSequence = this.valueOf;
        return !(charSequence == null || charSequence.length() == 0) || this.KWHzl.size() <= 10;
    }

    public final SelectedNetworkData KWHzl(CustomChainMeta customChainMeta, WalletSelectedChainBean walletSelectedChainBean, AbstractC12782ctV abstractC12782ctV) {
        java.lang.String strDbNXlk;
        java.lang.String strEjfBZ;
        java.lang.String strValueOf = customChainMeta.valueOf();
        java.lang.String strOLrzqt = customChainMeta.OLrzqt();
        CustomChainCoinMeta customChainCoinMetaDjBIcL = customChainMeta.djBIcL();
        return new SelectedNetworkData(strValueOf, strOLrzqt, (customChainCoinMetaDjBIcL == null || (strEjfBZ = customChainCoinMetaDjBIcL.ejfBZ()) == null) ? "" : strEjfBZ, "0", customChainMeta.EZpvd(), customChainMeta.fetchVPNInfo(), true, false, Intrinsics.EZpvd((java.lang.Object) java.lang.String.valueOf(customChainMeta.EZpvd()), (java.lang.Object) walletSelectedChainBean.getChainId()) && Intrinsics.EZpvd((java.lang.Object) customChainMeta.isConnected(), (java.lang.Object) walletSelectedChainBean.getRpcUrl()), 0, false, 0, true, customChainMeta.AhwBna(), (abstractC12782ctV == null || (strDbNXlk = abstractC12782ctV.DbNXlk()) == null) ? "" : strDbNXlk, customChainMeta.isConnected(), LivenessCoordinator.TARGET_HEIGHT, null);
    }

    public final SelectedNetworkData AEQbTJ(C10854bwM c10854bwM, AbstractC12782ctV abstractC12782ctV, WalletSelectedChainBean walletSelectedChainBean) {
        java.lang.String strCopydefault;
        java.lang.String strDbNXlk;
        java.lang.String strCopydefault2 = c10854bwM.copydefault();
        java.lang.String strDjBIcL = c10854bwM.djBIcL();
        java.lang.String strFJNWhG = c10854bwM.fJNWhG();
        if (abstractC12782ctV == null || (strCopydefault = abstractC12782ctV.copydefault("opened", c10854bwM.AEQbTJ(), true)) == null) {
            strCopydefault = "0";
        }
        long jAEQbTJ = c10854bwM.AEQbTJ();
        long jFetchVPNInfo = c10854bwM.fetchVPNInfo();
        boolean zAhwBna = abstractC12782ctV != null ? abstractC12782ctV.AhwBna(java.lang.Long.valueOf(c10854bwM.AEQbTJ())) : false;
        boolean zHBpjJd = c10854bwM.hBpjJd();
        int iORxRYg = c10854bwM.ORxRYg();
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) java.lang.String.valueOf(c10854bwM.AEQbTJ()), (java.lang.Object) walletSelectedChainBean.getChainId());
        if (abstractC12782ctV == null || (strDbNXlk = abstractC12782ctV.DbNXlk()) == null) {
            strDbNXlk = "";
        }
        return new SelectedNetworkData(strCopydefault2, strDjBIcL, strFJNWhG, strCopydefault, jAEQbTJ, jFetchVPNInfo, zAhwBna, false, zEZpvd, 0, zHBpjJd, iORxRYg, false, false, strDbNXlk, null, 45696, null);
    }

    public final java.lang.CharSequence copydefault(@NotNull InterfaceC17407fEe interfaceC17407fEe, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(interfaceC17407fEe, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.CharSequence charSequence = this.valueOf;
        return (charSequence == null || StringsKt__StringsKt.fARcdN(charSequence)) ? str : interfaceC17407fEe.KWHzl(str, java.lang.String.valueOf(this.valueOf), true);
    }

    public final void KWHzl(java.lang.CharSequence charSequence) {
        this.valueOf = charSequence;
        java.util.List<SelectedNetworkData> listOLrzqt = OLrzqt(charSequence);
        MutableStateFlow<java.util.List<SelectedNetworkData>> mutableStateFlow = this.EZpvd;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), listOLrzqt)) {
        }
    }

    /* JADX INFO: renamed from: o.edV$TaskDescription */
    public static final class TaskDescription {
        public final java.util.List<C13784dYd> AEQbTJ;
        public final java.util.List<java.lang.String> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.edV$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = taskDescription.KWHzl;
            }
            if ((i & 2) != 0) {
                list2 = taskDescription.AEQbTJ;
            }
            return taskDescription.AEQbTJ(list, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(@NotNull java.util.List<java.lang.String> list, @NotNull java.util.List<C13784dYd> list2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            return new TaskDescription(list, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C13784dYd> EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd(this.KWHzl, taskDescription.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, taskDescription.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NetworkDataList(indexList=" + this.KWHzl + ", sourceDataList=" + this.AEQbTJ + ")";
        }

        public TaskDescription(@NotNull java.util.List<java.lang.String> list, @NotNull java.util.List<C13784dYd> list2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            this.KWHzl = list;
            this.AEQbTJ = list2;
        }
    }

    /* JADX INFO: renamed from: o.edV$Activity */
    public static final class Activity {
        public final int AEQbTJ;
        public final SelectedNetworkData EZpvd;
        public final int OLrzqt;
        public final C13784dYd copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, int i, C13784dYd c13784dYd, int i2, SelectedNetworkData selectedNetworkData, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = activity.OLrzqt;
            }
            if ((i3 & 2) != 0) {
                c13784dYd = activity.copydefault;
            }
            if ((i3 & 4) != 0) {
                i2 = activity.AEQbTJ;
            }
            if ((i3 & 8) != 0) {
                selectedNetworkData = activity.EZpvd;
            }
            return activity.OLrzqt(i, c13784dYd, i2, selectedNetworkData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C13784dYd EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity OLrzqt(int i, @NotNull C13784dYd c13784dYd, int i2, @NotNull SelectedNetworkData selectedNetworkData) {
            Intrinsics.checkNotNullParameter(c13784dYd, "");
            Intrinsics.checkNotNullParameter(selectedNetworkData, "");
            return new Activity(i, c13784dYd, i2, selectedNetworkData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return this.OLrzqt == activity.OLrzqt && Intrinsics.EZpvd(this.copydefault, activity.copydefault) && this.AEQbTJ == activity.AEQbTJ && Intrinsics.EZpvd(this.EZpvd, activity.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((java.lang.Integer.hashCode(this.OLrzqt) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SectionData(sectionIndex=" + this.OLrzqt + ", dataEntity=" + this.copydefault + ", sectionDataIndex=" + this.AEQbTJ + ", selectedNetworkData=" + this.EZpvd + ")";
        }

        public Activity(int i, @NotNull C13784dYd c13784dYd, int i2, @NotNull SelectedNetworkData selectedNetworkData) {
            Intrinsics.checkNotNullParameter(c13784dYd, "");
            Intrinsics.checkNotNullParameter(selectedNetworkData, "");
            this.OLrzqt = i;
            this.copydefault = c13784dYd;
            this.AEQbTJ = i2;
            this.EZpvd = selectedNetworkData;
        }
    }

    public final java.util.List<SelectedNetworkData> OLrzqt(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            return this.KWHzl;
        }
        java.util.List<SelectedNetworkData> list = this.KWHzl;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) ((SelectedNetworkData) obj).EZpvd(), charSequence, true)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final Activity KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int i = 0;
        for (java.lang.Object obj : this.isConnected) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            C13784dYd c13784dYd = (C13784dYd) obj;
            int i2 = 0;
            for (java.lang.Object obj2 : c13784dYd.getSectionDataList()) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                Intrinsics.copydefault(obj2, "");
                SelectedNetworkData selectedNetworkData = (SelectedNetworkData) obj2;
                if (Intrinsics.EZpvd((java.lang.Object) java.lang.String.valueOf(selectedNetworkData.copydefault()), (java.lang.Object) str)) {
                    return new Activity(i, c13784dYd, i2, selectedNetworkData);
                }
                i2++;
            }
            i++;
        }
        return null;
    }
}
