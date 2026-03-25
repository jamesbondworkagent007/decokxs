package o;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.okinc.business.market.data.constant.AddressTrackerSortType;
import com.okinc.business.market.data.model.GetTrackingAddressGroup;
import com.okinc.business.market.data.model.GetTrackingAddressListResponse;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerActivityRequest;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerActivityResponse;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerActivityWsParam;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerAddressSourceResponse;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendDetailRequest;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendRequest;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendResponse;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendWsParam;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrendTrader;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.repo.SaTrackerRepositoryImpl$batchMigrate$2;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.repo.SaTrackerRepositoryImpl$batchUnfollow$2;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.repo.SaTrackerRepositoryImpl$getActivities$2;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.repo.SaTrackerRepositoryImpl$getAddressSourceList$2;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.repo.SaTrackerRepositoryImpl$getTrackerGroups$2;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.repo.SaTrackerRepositoryImpl$getTrackingAddressList$2;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.repo.SaTrackerRepositoryImpl$getTrendDetail$2;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.repo.SaTrackerRepositoryImpl$getTrends$2;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.repo.SaTrackerRepositoryImpl$subscribeActivity$$inlined$mapNotNull$1$2$1;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.repo.SaTrackerRepositoryImpl$subscribeSMActivity$$inlined$mapNotNull$1$2$1;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.repo.SaTrackerRepositoryImpl$subscribeTrends$$inlined$mapNotNull$1$2$1;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jEC implements jEA {
    public final Gson AEQbTJ;
    public final InterfaceC27595jyE EZpvd;
    public final Json KWHzl;
    public final C27640jyx OLrzqt;
    public final C27640jyx copydefault;
    public final C27640jyx djBIcL;

    public static final class ActionBar implements Flow<java.util.List<? extends TrackerActivityResponse>> {
        public final /* synthetic */ jEC EZpvd;
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: o.jEC$ActionBar$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ jEC OLrzqt;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector, jEC jec) {
                this.copydefault = flowCollector;
                this.OLrzqt = jec;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SaTrackerRepositoryImpl$subscribeSMActivity$$inlined$mapNotNull$1$2$1 saTrackerRepositoryImpl$subscribeSMActivity$$inlined$mapNotNull$1$2$1;
                if (continuation instanceof SaTrackerRepositoryImpl$subscribeSMActivity$$inlined$mapNotNull$1$2$1) {
                    saTrackerRepositoryImpl$subscribeSMActivity$$inlined$mapNotNull$1$2$1 = (SaTrackerRepositoryImpl$subscribeSMActivity$$inlined$mapNotNull$1$2$1) continuation;
                    int i = saTrackerRepositoryImpl$subscribeSMActivity$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        saTrackerRepositoryImpl$subscribeSMActivity$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        saTrackerRepositoryImpl$subscribeSMActivity$$inlined$mapNotNull$1$2$1 = new SaTrackerRepositoryImpl$subscribeSMActivity$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = saTrackerRepositoryImpl$subscribeSMActivity$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = saTrackerRepositoryImpl$subscribeSMActivity$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    java.util.List listEZpvd = this.OLrzqt.EZpvd((java.lang.String) obj);
                    if (listEZpvd != null) {
                        saTrackerRepositoryImpl$subscribeSMActivity$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(listEZpvd, saTrackerRepositoryImpl$subscribeSMActivity$$inlined$mapNotNull$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public ActionBar(Flow flow, jEC jec) {
            this.OLrzqt = flow;
            this.EZpvd = jec;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends TrackerActivityResponse>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass2(flowCollector, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class Activity implements Flow<java.util.List<? extends TrackerActivityResponse>> {
        public final /* synthetic */ jEC AEQbTJ;
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.jEC$Activity$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ jEC AEQbTJ;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector, jEC jec) {
                this.copydefault = flowCollector;
                this.AEQbTJ = jec;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SaTrackerRepositoryImpl$subscribeActivity$$inlined$mapNotNull$1$2$1 saTrackerRepositoryImpl$subscribeActivity$$inlined$mapNotNull$1$2$1;
                if (continuation instanceof SaTrackerRepositoryImpl$subscribeActivity$$inlined$mapNotNull$1$2$1) {
                    saTrackerRepositoryImpl$subscribeActivity$$inlined$mapNotNull$1$2$1 = (SaTrackerRepositoryImpl$subscribeActivity$$inlined$mapNotNull$1$2$1) continuation;
                    int i = saTrackerRepositoryImpl$subscribeActivity$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        saTrackerRepositoryImpl$subscribeActivity$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        saTrackerRepositoryImpl$subscribeActivity$$inlined$mapNotNull$1$2$1 = new SaTrackerRepositoryImpl$subscribeActivity$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = saTrackerRepositoryImpl$subscribeActivity$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = saTrackerRepositoryImpl$subscribeActivity$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    java.util.List listEZpvd = this.AEQbTJ.EZpvd((java.lang.String) obj);
                    if (listEZpvd != null) {
                        saTrackerRepositoryImpl$subscribeActivity$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(listEZpvd, saTrackerRepositoryImpl$subscribeActivity$$inlined$mapNotNull$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Activity(Flow flow, jEC jec) {
            this.copydefault = flow;
            this.AEQbTJ = jec;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends TrackerActivityResponse>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass1(flowCollector, this.AEQbTJ), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class Application implements Flow<TrackerTrendResponse> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ jEC KWHzl;

        /* JADX INFO: renamed from: o.jEC$Application$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;
            public final /* synthetic */ jEC copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, jEC jec) {
                this.KWHzl = flowCollector;
                this.copydefault = jec;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SaTrackerRepositoryImpl$subscribeTrends$$inlined$mapNotNull$1$2$1 saTrackerRepositoryImpl$subscribeTrends$$inlined$mapNotNull$1$2$1;
                if (continuation instanceof SaTrackerRepositoryImpl$subscribeTrends$$inlined$mapNotNull$1$2$1) {
                    saTrackerRepositoryImpl$subscribeTrends$$inlined$mapNotNull$1$2$1 = (SaTrackerRepositoryImpl$subscribeTrends$$inlined$mapNotNull$1$2$1) continuation;
                    int i = saTrackerRepositoryImpl$subscribeTrends$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        saTrackerRepositoryImpl$subscribeTrends$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        saTrackerRepositoryImpl$subscribeTrends$$inlined$mapNotNull$1$2$1 = new SaTrackerRepositoryImpl$subscribeTrends$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = saTrackerRepositoryImpl$subscribeTrends$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = saTrackerRepositoryImpl$subscribeTrends$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    TrackerTrendResponse trackerTrendResponseOLrzqt = this.copydefault.OLrzqt((java.lang.String) obj);
                    if (trackerTrendResponseOLrzqt != null) {
                        saTrackerRepositoryImpl$subscribeTrends$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(trackerTrendResponseOLrzqt, saTrackerRepositoryImpl$subscribeTrends$$inlined$mapNotNull$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Application(Flow flow, jEC jec) {
            this.AEQbTJ = flow;
            this.KWHzl = jec;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super TrackerTrendResponse> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass5(flowCollector, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public jEC(@NotNull InterfaceC27595jyE interfaceC27595jyE, @yCL(AEQbTJ = "public_client") @NotNull C27640jyx c27640jyx, @yCL(AEQbTJ = "public_client") @NotNull C27640jyx c27640jyx2, @yCL(AEQbTJ = "public_client") @NotNull C27640jyx c27640jyx3, @NotNull Json json, @NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(c27640jyx2, "");
        Intrinsics.checkNotNullParameter(c27640jyx3, "");
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(gson, "");
        this.EZpvd = interfaceC27595jyE;
        this.OLrzqt = c27640jyx;
        this.copydefault = c27640jyx2;
        this.djBIcL = c27640jyx3;
        this.KWHzl = json;
        this.AEQbTJ = gson;
    }

    @Override // o.jEA
    public java.lang.Object KWHzl(@NotNull TrackerActivityRequest trackerActivityRequest, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<TrackerActivityResponse>, OKServerException>> continuation) {
        return kAB.EZpvd(new SaTrackerRepositoryImpl$getActivities$2(this, trackerActivityRequest, null), continuation);
    }

    @Override // o.jEA
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<TrackerAddressSourceResponse, OKServerException>> continuation) {
        return kAB.EZpvd(new SaTrackerRepositoryImpl$getAddressSourceList$2(this, C56424yEw.AYXKKw(C56390yDp.OLrzqt("walletAddress", str)), null), continuation);
    }

    @Override // o.jEA
    public java.lang.Object OLrzqt(@NotNull TrackerTrendRequest trackerTrendRequest, @NotNull Continuation<? super AbstractC43419rot<TrackerTrendResponse, OKServerException>> continuation) {
        return kAB.EZpvd(new SaTrackerRepositoryImpl$getTrends$2(this, trackerTrendRequest, null), continuation);
    }

    @Override // o.jEA
    public java.lang.Object KWHzl(@NotNull TrackerTrendDetailRequest trackerTrendDetailRequest, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<TrendTrader>, OKServerException>> continuation) {
        return kAB.EZpvd(new SaTrackerRepositoryImpl$getTrendDetail$2(this, trackerTrendDetailRequest, null), continuation);
    }

    @Override // o.jEA
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<GetTrackingAddressGroup>, OKServerException>> continuation) {
        return kAB.EZpvd(new SaTrackerRepositoryImpl$getTrackerGroups$2(this, str, null), continuation);
    }

    @Override // o.jEA
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, java.lang.Long l, int i, int i2, @NotNull AddressTrackerSortType addressTrackerSortType, boolean z, @NotNull Continuation<? super AbstractC43419rot<GetTrackingAddressListResponse, OKServerException>> continuation) {
        return kAB.EZpvd(new SaTrackerRepositoryImpl$getTrackingAddressList$2(str, l, i, i2, addressTrackerSortType, z, this, null), continuation);
    }

    @Override // o.jEA
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<java.lang.String> list, java.lang.Long l, @NotNull Continuation<? super AbstractC43419rot<java.lang.Integer, OKServerException>> continuation) {
        return kAB.EZpvd(new SaTrackerRepositoryImpl$batchUnfollow$2(str2, list, l, this, str, null), continuation);
    }

    @Override // o.jEA
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<java.lang.String> list, long j, @NotNull java.util.List<java.lang.Long> list2, @NotNull Continuation<? super AbstractC43419rot<java.lang.Integer, OKServerException>> continuation) {
        return kAB.EZpvd(new SaTrackerRepositoryImpl$batchMigrate$2(str2, list, j, list2, this, str, null), continuation);
    }

    @Override // o.jEA
    public java.lang.Object EZpvd(@NotNull TrackerTrendWsParam trackerTrendWsParam, @NotNull Continuation<? super Flow<TrackerTrendResponse>> continuation) {
        JsonObject jsonObject = (JsonObject) this.AEQbTJ.fromJson(this.KWHzl.encodeToString(TrackerTrendWsParam.Companion.serializer(), trackerTrendWsParam), JsonObject.class);
        Intrinsics.copydefault(jsonObject);
        copydefault(jsonObject);
        return new Application(this.djBIcL.KWHzl("dex-market-sa-trends", yDY.copydefault(new WsArgV5ForWeb3("dex-market-sa-trends", null, null, null, jsonObject, 14, null))), this);
    }

    @Override // o.jEA
    public void copydefault() {
        this.djBIcL.AEQbTJ();
    }

    @Override // o.jEA
    public java.lang.Object AEQbTJ(@NotNull TrackerActivityWsParam trackerActivityWsParam, @NotNull Continuation<? super Flow<? extends java.util.List<TrackerActivityResponse>>> continuation) {
        JsonObject jsonObject = (JsonObject) this.AEQbTJ.fromJson(this.KWHzl.encodeToString(TrackerActivityWsParam.Companion.serializer(), trackerActivityWsParam), JsonObject.class);
        Intrinsics.copydefault(jsonObject);
        copydefault(jsonObject);
        return new Activity(this.OLrzqt.KWHzl("dex-market-tracker-activity", yDY.copydefault(new WsArgV5ForWeb3("dex-market-tracker-activity", null, null, null, jsonObject, 14, null))), this);
    }

    @Override // o.jEA
    public java.lang.Object KWHzl(@NotNull Continuation<? super Flow<? extends java.util.List<TrackerActivityResponse>>> continuation) {
        return new ActionBar(this.copydefault.KWHzl("dex-market-tracker-sm-activity", yDY.copydefault(new WsArgV5ForWeb3("dex-market-tracker-sm-activity", null, null, null, null, 10, null))), this);
    }

    @Override // o.jEA
    public void OLrzqt() {
        this.OLrzqt.AEQbTJ();
    }

    @Override // o.jEA
    public void EZpvd() {
        this.copydefault.AEQbTJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(JsonObject jsonObject) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (Map.Entry<java.lang.String, JsonElement> entry : jsonObject.entrySet()) {
            Intrinsics.copydefault(entry);
            java.lang.String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (!value.isJsonNull()) {
                if (value.isJsonPrimitive()) {
                    java.lang.String asString = value.getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    if (asString.length() != 0) {
                        if (!value.isJsonArray() || value.getAsJsonArray().size() != 0) {
                        }
                    }
                }
            }
            Intrinsics.copydefault((java.lang.Object) key);
            arrayList.add(key);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jsonObject.remove((java.lang.String) it.next());
        }
    }

    public final java.util.List<TrackerActivityResponse> EZpvd(java.lang.String str) {
        try {
            Json json = this.KWHzl;
            json.getSerializersModule();
            return (java.util.List) json.decodeFromString(new ArrayListSerializer(TrackerActivityResponse.Companion.serializer()), str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public final TrackerTrendResponse OLrzqt(java.lang.String str) {
        try {
            Json json = this.KWHzl;
            json.getSerializersModule();
            return (TrackerTrendResponse) json.decodeFromString(TrackerTrendResponse.Companion.serializer(), str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
