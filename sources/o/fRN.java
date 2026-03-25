package o;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fRN extends ViewModel {
    public final StateFlow<Application> AEQbTJ;
    public final InterfaceC9737bbI EZpvd;
    public final MutableStateFlow<Application> KWHzl;
    public final java.lang.Long OLrzqt;
    public final java.util.ArrayList<java.lang.Long> copydefault;
    public final java.util.List<java.lang.Long> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Application> KWHzl() {
        return this.AEQbTJ;
    }

    public fRN(@NotNull SavedStateHandle savedStateHandle, @NotNull InterfaceC9737bbI interfaceC9737bbI) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(interfaceC9737bbI, "");
        this.EZpvd = interfaceC9737bbI;
        java.util.List<java.lang.Long> list = (java.util.List) savedStateHandle.get("SUPPORTED_CHAIN_IDS");
        this.gEmmrt = list == null ? yDY.AhwBna() : list;
        java.util.ArrayList<java.lang.Long> arrayList = (java.util.ArrayList) savedStateHandle.get("POPULAR_CHAIN_IDS");
        this.copydefault = arrayList == null ? new java.util.ArrayList<>() : arrayList;
        this.OLrzqt = (java.lang.Long) savedStateHandle.get("SELECTED_CHAIN_ID");
        MutableStateFlow<Application> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
        AEQbTJ();
    }

    public final void AEQbTJ() {
        ActionBar actionBar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.HashMap map = new java.util.HashMap();
        java.util.List<java.lang.Long> list = this.gEmmrt;
        java.util.ArrayList<InterfaceC9731bbC> arrayList3 = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            InterfaceC9731bbC interfaceC9731bbCEZpvd = this.EZpvd.EZpvd(((java.lang.Number) it.next()).longValue(), true);
            if (interfaceC9731bbCEZpvd != null) {
                arrayList3.add(interfaceC9731bbCEZpvd);
            }
        }
        for (InterfaceC9731bbC interfaceC9731bbC : arrayList3) {
            if (interfaceC9731bbC.djBIcL().length() > 0) {
                char cZLjUOn = C59454zhO.zLjUOn((java.lang.CharSequence) interfaceC9731bbC.djBIcL());
                long jFetchVPNInfo = interfaceC9731bbC.fetchVPNInfo();
                java.lang.Long l = this.OLrzqt;
                ActionBar actionBarAEQbTJ = AEQbTJ(interfaceC9731bbC, l != null && jFetchVPNInfo == l.longValue());
                if (java.lang.Character.isLetter(cZLjUOn)) {
                    java.lang.String strValueOf = java.lang.String.valueOf(cZLjUOn);
                    Intrinsics.copydefault(strValueOf, "");
                    java.lang.String upperCase = strValueOf.toUpperCase(java.util.Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    java.util.List listAhwBna = (java.util.List) map.get(upperCase);
                    if (listAhwBna == null) {
                        listAhwBna = yDY.AhwBna();
                    }
                    map.put(upperCase, CollectionsKt___CollectionsKt.copydefault((java.util.Collection<? extends ActionBar>) listAhwBna, actionBarAEQbTJ));
                }
                arrayList2.add(actionBarAEQbTJ);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList2, 10)), 16));
        for (java.lang.Object obj : arrayList2) {
            linkedHashMap.put(java.lang.Long.valueOf(((ActionBar) obj).KWHzl()), obj);
        }
        java.util.Iterator<T> it2 = this.copydefault.iterator();
        while (it2.hasNext()) {
            long jLongValue = ((java.lang.Number) it2.next()).longValue();
            if (linkedHashMap.containsKey(java.lang.Long.valueOf(jLongValue)) && (actionBar = (ActionBar) linkedHashMap.get(java.lang.Long.valueOf(jLongValue))) != null) {
                arrayList.add(actionBar);
            }
        }
        MutableStateFlow<Application> mutableStateFlow = this.KWHzl;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new Application(arrayList, arrayList2, map))) {
        }
    }

    public final ActionBar AEQbTJ(InterfaceC9731bbC interfaceC9731bbC, boolean z) {
        java.lang.String string;
        java.lang.String strCopydefault = interfaceC9731bbC.copydefault();
        java.lang.Character chWlaJM = C59454zhO.wlaJM(interfaceC9731bbC.fJNWhG());
        java.lang.String strOLrzqt = (chWlaJM == null || (string = chWlaJM.toString()) == null) ? null : C9700baY.OLrzqt(string);
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        return new ActionBar((strCopydefault == null || strCopydefault.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault)) ? strOLrzqt : strCopydefault, interfaceC9731bbC.djBIcL(), interfaceC9731bbC.fetchVPNInfo(), z);
    }

    public static final class Application {
        public final java.util.List<ActionBar> AEQbTJ;
        public final java.util.Map<java.lang.String, java.util.List<ActionBar>> EZpvd;
        public final java.util.List<ActionBar> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.fRN$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, java.util.List list, java.util.List list2, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = application.copydefault;
            }
            if ((i & 2) != 0) {
                list2 = application.AEQbTJ;
            }
            if ((i & 4) != 0) {
                map = application.EZpvd;
            }
            return application.AEQbTJ(list, list2, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(@NotNull java.util.List<ActionBar> list, @NotNull java.util.List<ActionBar> list2, @NotNull java.util.Map<java.lang.String, ? extends java.util.List<ActionBar>> map) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(map, "");
            return new Application(list, list2, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ActionBar> EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.util.List<ActionBar>> KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ActionBar> OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.copydefault, application.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, application.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SupportedNetworkDataResult(popularNetworks=" + this.copydefault + ", allSupportedNetworks=" + this.AEQbTJ + ", lettersToNetworksMap=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.List<o.fRN$ActionBar>> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(@NotNull java.util.List<ActionBar> list, @NotNull java.util.List<ActionBar> list2, @NotNull java.util.Map<java.lang.String, ? extends java.util.List<ActionBar>> map) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.copydefault = list;
            this.AEQbTJ = list2;
            this.EZpvd = map;
        }
    }

    public static final class ActionBar {
        public final long AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String OLrzqt;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, long j, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = actionBar.OLrzqt;
            }
            java.lang.String str3 = str2;
            if ((i & 4) != 0) {
                j = actionBar.AEQbTJ;
            }
            long j2 = j;
            if ((i & 8) != 0) {
                z = actionBar.copydefault;
            }
            return actionBar.KWHzl(str, str3, j2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new ActionBar(str, str2, j, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) actionBar.OLrzqt) && this.AEQbTJ == actionBar.AEQbTJ && this.copydefault == actionBar.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.EZpvd.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Long.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NetworkData(iconUrl=" + this.EZpvd + ", chainName=" + this.OLrzqt + ", generalChainId=" + this.AEQbTJ + ", isSelected=" + this.copydefault + ")";
        }

        public ActionBar(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.EZpvd = str;
            this.OLrzqt = str2;
            this.AEQbTJ = j;
            this.copydefault = z;
        }
    }
}
