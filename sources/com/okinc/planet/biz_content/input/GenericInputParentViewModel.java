package com.okinc.planet.biz_content.input;

import android.net.Uri;
import androidx.lifecycle.ViewModel;
import com.okinc.planet.biz_content.input.data.InputPageState;
import com.okinc.planet.biz_content.input.data.SerializableContentValidationResult;
import com.okinc.planet.domain.remote.dto.ImageItem;
import com.okinc.planet.domain.remote.dto.PublisherTokenInfo;
import com.okinc.planet.domain.remote.dto.PublisherTopicInfo;
import com.okinc.planet_api.PluginShareToFeedConfig;
import com.okinc.planet_api.RichShareToFeedImage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C47572tse;
import o.C47577tsj;
import o.C56423yEv;
import o.C56424yEw;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class GenericInputParentViewModel extends ViewModel {
    public final MutableStateFlow<Boolean> AEQbTJ;
    public final MutableSharedFlow<TaskDescription> AYXKKw;
    public final MutableSharedFlow<PluginShareToFeedConfig> AhwBna;
    public final MutableStateFlow<List<ImageItem>> AkhnZx;
    public final StateFlow<Boolean> AuCTel;
    public final SharedFlow<PublisherTokenInfo> AuCTelauCTel;
    public final StateFlow<List<ImageItem>> AubY;
    public final MutableSharedFlow<List<RichShareToFeedImage>> DbNXlk;
    public final MutableSharedFlow<String> EZpvd;
    public final MutableStateFlow<C47577tsj> KWHzl;
    public final MutableSharedFlow<List<Uri>> OLrzqt;
    public final MutableSharedFlow<Boolean> copydefault;
    public final MutableSharedFlow<ArrayList<PublisherTokenInfo>> djBIcL;
    public final SharedFlow<List<Uri>> ejfBZ;
    public final StateFlow<C47577tsj> fARcdN;
    public final SharedFlow<String> fIwbmz;
    public final SharedFlow<Boolean> fJNWhG;
    public final MutableSharedFlow<PublisherTopicInfo> fetchVPNInfo;
    public final MutableSharedFlow<ArrayList<PublisherTopicInfo>> gEmmrt;
    public final SharedFlow<ArrayList<PublisherTopicInfo>> getFieldNames;
    public final SharedFlow<PluginShareToFeedConfig> getNewProxyInstance;
    public final SharedFlow<ArrayList<PublisherTokenInfo>> hDKMBd;
    public final MutableSharedFlow<PublisherTokenInfo> isConnected;
    public final StateFlow<Boolean> iwGUEr;
    public final SharedFlow<TaskDescription> uzCIH;
    public final MutableStateFlow<Boolean> valueOf;
    public final MutableSharedFlow<Pair<ArrayList<PublisherTopicInfo>, String>> values;
    public final SharedFlow<PublisherTopicInfo> wlaJM;
    public final SharedFlow<Pair<ArrayList<PublisherTopicInfo>, String>> zLjUOn;
    public final SharedFlow<List<RichShareToFeedImage>> zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C47577tsj> AEQbTJ() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<PublisherTokenInfo> AYXKKw() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<TaskDescription> AhwBna() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<C47577tsj> AkhnZx() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<Boolean> AuCTel() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<Boolean> DbNXlk() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<ArrayList<PublisherTokenInfo>> EZpvd() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> KWHzl() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<List<Uri>> OLrzqt() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<PluginShareToFeedConfig> copydefault() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<ImageItem>> djBIcL() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> fARcdN() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<List<ImageItem>> fIwbmz() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> fJNWhG() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<List<RichShareToFeedImage>> fetchVPNInfo() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<ArrayList<PublisherTopicInfo>> gEmmrt() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<PublisherTopicInfo> isConnected() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Pair<ArrayList<PublisherTopicInfo>, String>> values() {
        return this.zLjUOn;
    }

    public GenericInputParentViewModel() {
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        this.fIwbmz = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<List<RichShareToFeedImage>> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, null);
        this.DbNXlk = mutableSharedFlowMutableSharedFlow$default2;
        this.zsXlph = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<List<Uri>> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default3;
        this.ejfBZ = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<PublisherTokenInfo> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, null);
        this.isConnected = mutableSharedFlowMutableSharedFlow$default4;
        this.AuCTelauCTel = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        MutableSharedFlow<PublisherTopicInfo> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, null);
        this.fetchVPNInfo = mutableSharedFlowMutableSharedFlow$default5;
        this.wlaJM = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default5);
        MutableSharedFlow<Pair<ArrayList<PublisherTopicInfo>, String>> mutableSharedFlowMutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, null);
        this.values = mutableSharedFlowMutableSharedFlow$default6;
        this.zLjUOn = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default6);
        MutableSharedFlow<PluginShareToFeedConfig> mutableSharedFlowMutableSharedFlow$default7 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, null);
        this.AhwBna = mutableSharedFlowMutableSharedFlow$default7;
        this.getNewProxyInstance = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default7);
        MutableSharedFlow<ArrayList<PublisherTopicInfo>> mutableSharedFlowMutableSharedFlow$default8 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, null);
        this.gEmmrt = mutableSharedFlowMutableSharedFlow$default8;
        this.getFieldNames = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default8);
        MutableSharedFlow<ArrayList<PublisherTokenInfo>> mutableSharedFlowMutableSharedFlow$default9 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, null);
        this.djBIcL = mutableSharedFlowMutableSharedFlow$default9;
        this.hDKMBd = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default9);
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default10 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default10;
        this.fJNWhG = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default10);
        MutableSharedFlow<TaskDescription> mutableSharedFlowMutableSharedFlow$default11 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, null);
        this.AYXKKw = mutableSharedFlowMutableSharedFlow$default11;
        this.uzCIH = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default11);
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.AEQbTJ = MutableStateFlow;
        this.AuCTel = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.valueOf = MutableStateFlow2;
        this.iwGUEr = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<List<ImageItem>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.AkhnZx = MutableStateFlow3;
        this.AubY = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<C47577tsj> MutableStateFlow4 = StateFlowKt.MutableStateFlow(new C47577tsj(null, false, 3, null));
        this.KWHzl = MutableStateFlow4;
        this.fARcdN = FlowKt.asStateFlow(MutableStateFlow4);
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.tryEmit(str);
    }

    public final void OLrzqt(@NotNull List<RichShareToFeedImage> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.DbNXlk.tryEmit(list);
    }

    public final void copydefault(@NotNull List<? extends Uri> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt.tryEmit(list);
    }

    public final void KWHzl(@NotNull PublisherTokenInfo publisherTokenInfo) {
        Intrinsics.checkNotNullParameter(publisherTokenInfo, "");
        this.isConnected.tryEmit(publisherTokenInfo);
    }

    public final void AEQbTJ(@NotNull PublisherTopicInfo publisherTopicInfo) {
        Intrinsics.checkNotNullParameter(publisherTopicInfo, "");
        this.fetchVPNInfo.tryEmit(publisherTopicInfo);
    }

    public final void OLrzqt(ArrayList<PublisherTopicInfo> arrayList, String str) {
        this.values.tryEmit(new Pair<>(arrayList, str));
    }

    public final void copydefault(@NotNull PluginShareToFeedConfig pluginShareToFeedConfig) {
        Intrinsics.checkNotNullParameter(pluginShareToFeedConfig, "");
        this.AhwBna.tryEmit(pluginShareToFeedConfig);
    }

    public final void KWHzl(@NotNull ArrayList<PublisherTopicInfo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.gEmmrt.tryEmit(arrayList);
    }

    public final void EZpvd(@NotNull ArrayList<PublisherTokenInfo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.djBIcL.tryEmit(arrayList);
    }

    public final void copydefault(boolean z) {
        this.copydefault.tryEmit(Boolean.valueOf(z));
    }

    public final void EZpvd(@NotNull String str, @NotNull SearchType searchType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(searchType, "");
        this.AYXKKw.tryEmit(new TaskDescription(str, searchType));
    }

    public final void OLrzqt(boolean z) {
        this.AEQbTJ.setValue(Boolean.valueOf(z));
    }

    public final void AEQbTJ(boolean z) {
        this.valueOf.setValue(Boolean.valueOf(z));
    }

    public final List<ImageItem> valueOf() {
        return this.AkhnZx.getValue();
    }

    public final void EZpvd(@NotNull List<ImageItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AkhnZx.setValue(list);
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class TaskDescription {
        public final String EZpvd;
        public final SearchType copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, String str, SearchType searchType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.EZpvd;
            }
            if ((i & 2) != 0) {
                searchType = taskDescription.copydefault;
            }
            return taskDescription.OLrzqt(str, searchType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SearchType KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(@NotNull String str, @NotNull SearchType searchType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(searchType, "");
            return new TaskDescription(str, searchType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd((Object) this.EZpvd, (Object) taskDescription.EZpvd) && this.copydefault == taskDescription.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SearchQueryEvent(query=" + this.EZpvd + ", type=" + this.copydefault + ")";
        }

        public TaskDescription(@NotNull String str, @NotNull SearchType searchType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(searchType, "");
            this.EZpvd = str;
            this.copydefault = searchType;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class SearchType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ SearchType[] $VALUES;
        public static final SearchType TOKEN = new SearchType("TOKEN", 0);
        public static final SearchType TOPIC = new SearchType("TOPIC", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ SearchType[] $values() {
            return new SearchType[]{TOKEN, TOPIC};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<SearchType> getEntries() {
            return $ENTRIES;
        }

        private SearchType(String str, int i) {
        }

        static {
            SearchType[] searchTypeArr$values = $values();
            $VALUES = searchTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(searchTypeArr$values);
        }

        public static SearchType valueOf(String str) {
            return (SearchType) Enum.valueOf(SearchType.class, str);
        }

        public static SearchType[] values() {
            return (SearchType[]) $VALUES.clone();
        }
    }

    public final void EZpvd(@NotNull C47572tse c47572tse) {
        Intrinsics.checkNotNullParameter(c47572tse, "");
        Map mapIsConnected = C56424yEw.isConnected(this.KWHzl.getValue().OLrzqt());
        mapIsConnected.put(c47572tse.KWHzl(), c47572tse);
        this.KWHzl.setValue(new C47577tsj(mapIsConnected, AEQbTJ(mapIsConnected.values())));
    }

    public final void AEQbTJ(@NotNull ContentValidationType contentValidationType) {
        Intrinsics.checkNotNullParameter(contentValidationType, "");
        Map mapIsConnected = C56424yEw.isConnected(this.KWHzl.getValue().OLrzqt());
        mapIsConnected.remove(contentValidationType);
        this.KWHzl.setValue(new C47577tsj(mapIsConnected, AEQbTJ(mapIsConnected.values())));
    }

    public final boolean AEQbTJ(Collection<C47572tse> collection) {
        Collection<C47572tse> collection2 = collection;
        if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
            Iterator<T> it = collection2.iterator();
            while (it.hasNext()) {
                if (((C47572tse) it.next()).EZpvd() != ValidationStatus.PASS) {
                    return false;
                }
            }
        }
        return true;
    }

    public void EZpvd(@NotNull InputPageState inputPageState) {
        boolean z;
        Intrinsics.checkNotNullParameter(inputPageState, "");
        this.AEQbTJ.setValue(Boolean.valueOf(inputPageState.isHyperlinkAtLimit()));
        this.valueOf.setValue(Boolean.valueOf(inputPageState.isImageAtLimit()));
        Map<String, SerializableContentValidationResult> contentValidationState = inputPageState.getContentValidationState();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(contentValidationState.size()));
        Iterator<T> it = contentValidationState.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(ContentValidationType.valueOf((String) entry.getKey()), entry.getValue());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56423yEv.copydefault(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), ((SerializableContentValidationResult) entry2.getValue()).toContentValidationResult());
        }
        Collection<SerializableContentValidationResult> collectionValues = inputPageState.getContentValidationState().values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            z = true;
        } else {
            Iterator<T> it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                if (((SerializableContentValidationResult) it2.next()).getStatus() != ValidationStatus.PASS) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        this.KWHzl.setValue(new C47577tsj(linkedHashMap2, z));
    }
}
