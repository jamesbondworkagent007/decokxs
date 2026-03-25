package com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.common.constants.StringBooleanType;
import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.data.model.TagExtraData;
import com.okinc.business.market.data.model.TrackingAddressData;
import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import com.okinc.network.okg.response.ResponseData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC25769jFr;
import o.AbstractC25781jGc;
import o.C25352ivB;
import o.C25389ivm;
import o.C25640jAx;
import o.C25648jBe;
import o.C25749jEy;
import o.C27634jyr;
import o.C28586kda;
import o.C28603kdr;
import o.C33129mqd;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.jAD;
import o.jFL;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerManageAddressGroupViewModel extends AbstractC25769jFr {
    public final MutableStateFlow<List<jFL>> AkhnZx;
    public final StateFlow<List<jFL>> AuCTel;
    public final MutableSharedFlow<Integer> DbNXlk;
    public final MutableStateFlow<AbstractC25781jGc> ejfBZ;
    public final MutableStateFlow<TrackerAddressGroupUIModel> fARcdN;
    public final StateFlow<Integer> fIwbmz;
    public final StateFlow<Boolean> fJNWhG;
    public final MutableStateFlow<Integer> fetchVPNInfo;
    public final SharedFlow<Integer> getFieldNames;
    public final StateFlow<AbstractC25781jGc> getNewProxyInstance;
    public final MutableStateFlow<Boolean> isConnected;
    public final StateFlow<TrackerAddressGroupUIModel> iwGUEr;
    public final StateFlow<Integer> uzCIH;
    public final MutableStateFlow<Integer> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Integer> AkhnZx() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Integer> AuCTel() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<jFL>> djBIcL() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> fARcdN() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC25781jGc> fetchVPNInfo() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<TrackerAddressGroupUIModel> isConnected() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Integer> values() {
        return this.uzCIH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public TrackerManageAddressGroupViewModel(@NotNull C25749jEy c25749jEy, @NotNull C28586kda c28586kda, @NotNull C25648jBe c25648jBe, @NotNull jAD jad, @NotNull C25640jAx c25640jAx, @NotNull C28603kdr c28603kdr, @NotNull C27634jyr c27634jyr) {
        super(c25640jAx, c25648jBe, jad, c28586kda, c28603kdr, c25749jEy, c27634jyr);
        Intrinsics.checkNotNullParameter(c25749jEy, "");
        Intrinsics.checkNotNullParameter(c28586kda, "");
        Intrinsics.checkNotNullParameter(c25648jBe, "");
        Intrinsics.checkNotNullParameter(jad, "");
        Intrinsics.checkNotNullParameter(c25640jAx, "");
        Intrinsics.checkNotNullParameter(c28603kdr, "");
        Intrinsics.checkNotNullParameter(c27634jyr, "");
        MutableStateFlow<List<jFL>> MutableStateFlow = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.AkhnZx = MutableStateFlow;
        this.AuCTel = MutableStateFlow;
        MutableStateFlow<TrackerAddressGroupUIModel> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.fARcdN = MutableStateFlow2;
        this.iwGUEr = MutableStateFlow2;
        MutableStateFlow<AbstractC25781jGc> MutableStateFlow3 = StateFlowKt.MutableStateFlow(AbstractC25781jGc.ActionBar.copydefault);
        this.ejfBZ = MutableStateFlow3;
        this.getNewProxyInstance = MutableStateFlow3;
        MutableStateFlow<Integer> MutableStateFlow4 = StateFlowKt.MutableStateFlow(0);
        this.fetchVPNInfo = MutableStateFlow4;
        this.uzCIH = MutableStateFlow4;
        MutableStateFlow<Boolean> MutableStateFlow5 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.isConnected = MutableStateFlow5;
        this.fJNWhG = MutableStateFlow5;
        MutableStateFlow<Integer> MutableStateFlow6 = StateFlowKt.MutableStateFlow(0);
        this.values = MutableStateFlow6;
        this.fIwbmz = MutableStateFlow6;
        MutableSharedFlow<Integer> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.DbNXlk = mutableSharedFlowMutableSharedFlow$default;
        this.getFieldNames = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    @Override // o.AbstractC25769jFr
    public void AEQbTJ(@NotNull List<TrackerAddressGroupUIModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AEQbTJ(EZpvd());
    }

    @Override // o.AbstractC25769jFr
    public void KWHzl(boolean z) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new TrackerManageAddressGroupViewModel$loadAddresses$1(z, this, null), 3, null);
    }

    @Override // o.AbstractC25769jFr
    public void OLrzqt(long j) {
        Object next;
        MutableStateFlow<TrackerAddressGroupUIModel> mutableStateFlow = this.fARcdN;
        Iterator<T> it = KWHzl().getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (C33129mqd.valueOf(Integer.valueOf(((TrackerAddressGroupUIModel) next).EZpvd())) == j) {
                    break;
                }
            }
        }
        mutableStateFlow.setValue((TrackerAddressGroupUIModel) next);
    }

    public final void fIwbmz() {
        boolean z = !this.isConnected.getValue().booleanValue();
        MutableStateFlow<List<jFL>> mutableStateFlow = this.AkhnZx;
        List<jFL> value = mutableStateFlow.getValue();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(value, 10));
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            arrayList.add(jFL.copy$default((jFL) it.next(), null, null, null, null, false, z, null, 95, null));
        }
        mutableStateFlow.setValue(arrayList);
        this.isConnected.setValue(Boolean.valueOf(z));
        fJNWhG();
        gEmmrt();
    }

    public final void copydefault(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        MutableStateFlow<List<jFL>> mutableStateFlow = this.AkhnZx;
        List<jFL> value = mutableStateFlow.getValue();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(value, 10));
        for (jFL jflCopy$default : value) {
            if (Intrinsics.EZpvd((Object) jflCopy$default.OLrzqt(), (Object) str)) {
                jflCopy$default = jFL.copy$default(jflCopy$default, null, null, null, null, false, z, null, 95, null);
            }
            arrayList.add(jflCopy$default);
        }
        mutableStateFlow.setValue(arrayList);
        fJNWhG();
        AYXKKw();
        gEmmrt();
    }

    public final List<jFL> DbNXlk() {
        List<jFL> value = this.AkhnZx.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : value) {
            if (((jFL) obj).AhwBna()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void fJNWhG() {
        MutableStateFlow<Integer> mutableStateFlow = this.fetchVPNInfo;
        List<jFL> value = this.AkhnZx.getValue();
        int i = 0;
        if (!(value instanceof Collection) || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                if (((jFL) it.next()).AhwBna() && (i = i + 1) < 0) {
                    yDY.djBIcL();
                }
            }
        }
        mutableStateFlow.setValue(Integer.valueOf(i));
    }

    public final void AYXKKw() {
        boolean z = true;
        if (!(!this.AkhnZx.getValue().isEmpty())) {
            z = false;
            break;
        }
        List<jFL> value = this.AkhnZx.getValue();
        if (!(value instanceof Collection) || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                if (!((jFL) it.next()).AhwBna()) {
                    z = false;
                    break;
                }
            }
        }
        this.isConnected.setValue(Boolean.valueOf(z));
    }

    public final void gEmmrt() {
        boolean z = false;
        if (!this.AkhnZx.getValue().isEmpty()) {
            List<jFL> value = this.AkhnZx.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : value) {
                if (((jFL) obj).AhwBna()) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                if (!this.AkhnZx.getValue().isEmpty()) {
                    List<jFL> value2 = this.AkhnZx.getValue();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : value2) {
                        if (((jFL) obj2).AhwBna()) {
                            arrayList2.add(obj2);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        Iterator it = arrayList2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((jFL) it.next()).gEmmrt()) {
                                    z = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
                this.values.setValue(Integer.valueOf(z ? 2 : 1));
                return;
            }
        }
        this.values.setValue(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final jFL copydefault(TrackingAddressData trackingAddressData, Map<String, String> map) {
        String address$default;
        TagExtraData tagExtraDataAEQbTJ;
        String strAhwBna;
        String str;
        TagExtraData tagExtraDataAEQbTJ2;
        CompactTagData compactTagData;
        String strGEmmrt;
        TagExtraData tagExtraDataAEQbTJ3;
        List<jFL> listDbNXlk = DbNXlk();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listDbNXlk, 10));
        Iterator<T> it = listDbNXlk.iterator();
        while (it.hasNext()) {
            arrayList.add(((jFL) it.next()).OLrzqt());
        }
        String strIsConnected = trackingAddressData.isConnected();
        StringBooleanType stringBooleanTypeGEmmrt = trackingAddressData.gEmmrt();
        StringBooleanType stringBooleanType = StringBooleanType.TRUE;
        if (stringBooleanTypeGEmmrt == stringBooleanType && (!StringsKt__StringsKt.fARcdN((CharSequence) trackingAddressData.AEQbTJ()))) {
            address$default = trackingAddressData.AEQbTJ();
        } else {
            CompactTagData compactTagData2 = (CompactTagData) CollectionsKt___CollectionsKt.firstOrNull(trackingAddressData.AhwBna());
            if (compactTagData2 != null && (tagExtraDataAEQbTJ = compactTagData2.AEQbTJ()) != null && (strAhwBna = tagExtraDataAEQbTJ.AhwBna()) != null && C33129mqd.OLrzqt((CharSequence) strAhwBna)) {
                CompactTagData compactTagData3 = (CompactTagData) CollectionsKt___CollectionsKt.firstOrNull(trackingAddressData.AhwBna());
                address$default = (compactTagData3 == null || (tagExtraDataAEQbTJ2 = compactTagData3.AEQbTJ()) == null) ? null : tagExtraDataAEQbTJ2.AhwBna();
                if (address$default == null) {
                    str = "";
                }
                String strAEQbTJ = trackingAddressData.AEQbTJ();
                compactTagData = (CompactTagData) CollectionsKt___CollectionsKt.firstOrNull(trackingAddressData.AhwBna());
                if (compactTagData != null || (tagExtraDataAEQbTJ3 = compactTagData.AEQbTJ()) == null || (strGEmmrt = tagExtraDataAEQbTJ3.gEmmrt()) == null) {
                    strGEmmrt = "";
                }
                return new jFL(strIsConnected, strAEQbTJ, str, strGEmmrt, trackingAddressData.EZpvd() != stringBooleanType, arrayList.contains(trackingAddressData.isConnected()), map.getOrDefault(trackingAddressData.isConnected(), ""));
            }
            address$default = C25352ivB.formatAddress$default(trackingAddressData.isConnected(), 6, 4, null, 4, null);
        }
        str = address$default;
        String strAEQbTJ2 = trackingAddressData.AEQbTJ();
        compactTagData = (CompactTagData) CollectionsKt___CollectionsKt.firstOrNull(trackingAddressData.AhwBna());
        if (compactTagData != null) {
            strGEmmrt = "";
        }
        return new jFL(strIsConnected, strAEQbTJ2, str, strGEmmrt, trackingAddressData.EZpvd() != stringBooleanType, arrayList.contains(trackingAddressData.isConnected()), map.getOrDefault(trackingAddressData.isConnected(), ""));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(@NotNull Continuation<? super Result<ResponseData<Object>>> continuation) {
        TrackerManageAddressGroupViewModel$batchAlertAction$1 trackerManageAddressGroupViewModel$batchAlertAction$1;
        if (continuation instanceof TrackerManageAddressGroupViewModel$batchAlertAction$1) {
            trackerManageAddressGroupViewModel$batchAlertAction$1 = (TrackerManageAddressGroupViewModel$batchAlertAction$1) continuation;
            int i = trackerManageAddressGroupViewModel$batchAlertAction$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerManageAddressGroupViewModel$batchAlertAction$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerManageAddressGroupViewModel$batchAlertAction$1 = new TrackerManageAddressGroupViewModel$batchAlertAction$1(this, continuation);
            }
        }
        Object obj = trackerManageAddressGroupViewModel$batchAlertAction$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackerManageAddressGroupViewModel$batchAlertAction$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        List<jFL> listDbNXlk = DbNXlk();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listDbNXlk, 10));
        Iterator<T> it = listDbNXlk.iterator();
        while (it.hasNext()) {
            arrayList.add(((jFL) it.next()).OLrzqt());
        }
        jAD jadCopydefault = copydefault();
        int i3 = this.values.getValue().intValue() == 2 ? 0 : 1;
        trackerManageAddressGroupViewModel$batchAlertAction$1.label = 1;
        Object objKWHzl = jadCopydefault.KWHzl(arrayList, i3, trackerManageAddressGroupViewModel$batchAlertAction$1);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(boolean z, @NotNull Continuation<? super Result<Integer>> continuation) {
        TrackerManageAddressGroupViewModel$batchUnfollow$1 trackerManageAddressGroupViewModel$batchUnfollow$1;
        List<String> arrayList;
        Object objOLrzqt;
        TrackerManageAddressGroupViewModel trackerManageAddressGroupViewModel;
        if (continuation instanceof TrackerManageAddressGroupViewModel$batchUnfollow$1) {
            trackerManageAddressGroupViewModel$batchUnfollow$1 = (TrackerManageAddressGroupViewModel$batchUnfollow$1) continuation;
            int i = trackerManageAddressGroupViewModel$batchUnfollow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerManageAddressGroupViewModel$batchUnfollow$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerManageAddressGroupViewModel$batchUnfollow$1 = new TrackerManageAddressGroupViewModel$batchUnfollow$1(this, continuation);
            }
        }
        Object obj = trackerManageAddressGroupViewModel$batchUnfollow$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackerManageAddressGroupViewModel$batchUnfollow$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            List<jFL> listDbNXlk = DbNXlk();
            arrayList = new ArrayList<>(C56403yEb.AYXKKw(listDbNXlk, 10));
            Iterator<T> it = listDbNXlk.iterator();
            while (it.hasNext()) {
                arrayList.add(((jFL) it.next()).OLrzqt());
            }
            C28586kda c28586kdaOLrzqt = OLrzqt();
            trackerManageAddressGroupViewModel$batchUnfollow$1.L$0 = this;
            trackerManageAddressGroupViewModel$batchUnfollow$1.L$1 = arrayList;
            trackerManageAddressGroupViewModel$batchUnfollow$1.Z$0 = z;
            trackerManageAddressGroupViewModel$batchUnfollow$1.label = 1;
            objOLrzqt = c28586kdaOLrzqt.OLrzqt(trackerManageAddressGroupViewModel$batchUnfollow$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            trackerManageAddressGroupViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return ((Result) obj).m7386unboximpl();
            }
            z = trackerManageAddressGroupViewModel$batchUnfollow$1.Z$0;
            arrayList = (List) trackerManageAddressGroupViewModel$batchUnfollow$1.L$1;
            trackerManageAddressGroupViewModel = (TrackerManageAddressGroupViewModel) trackerManageAddressGroupViewModel$batchUnfollow$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objOLrzqt);
        String strEZpvd = ((DexUserIdentity) objOLrzqt).EZpvd();
        C25749jEy c25749jEyAEQbTJ = trackerManageAddressGroupViewModel.AEQbTJ();
        Long lKWHzl = (z || trackerManageAddressGroupViewModel.EZpvd() == -1) ? null : C56443yFo.KWHzl(trackerManageAddressGroupViewModel.EZpvd());
        trackerManageAddressGroupViewModel$batchUnfollow$1.L$0 = null;
        trackerManageAddressGroupViewModel$batchUnfollow$1.L$1 = null;
        trackerManageAddressGroupViewModel$batchUnfollow$1.label = 2;
        Object objAEQbTJ = c25749jEyAEQbTJ.AEQbTJ(strEZpvd, arrayList, lKWHzl, trackerManageAddressGroupViewModel$batchUnfollow$1);
        return objAEQbTJ == objCopydefault ? objCopydefault : objAEQbTJ;
    }

    public final void KWHzl(@NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new TrackerManageAddressGroupViewModel$batchMigrate$1(this, list, null), 3, null);
    }
}
