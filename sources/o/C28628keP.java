package o;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.okinc.business.market.features.meme.data.model.PersonalizedInfoWsResponse;
import com.okinc.business.market.features.meme.data.repo.PersonalizedWebSocketRepositoryImpl$subscribePersonalizedData$$inlined$mapNotNull$1$2$1;
import com.okinc.business.market.features.meme.filter.domain.MemeFilter;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.keP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28628keP implements InterfaceC28701kfj {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final java.lang.String EZpvd;
    public final Json KWHzl;
    public final C27640jyx copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd(int i) {
        if (i != 0) {
            if (i == 1) {
                return "marketRankingFilterInMigrating";
            }
            if (i == 2) {
                return "marketRankingFilterMigrated";
            }
        }
        return "marketRankingFilterNew";
    }

    @yCM
    public C28628keP(@NotNull C27640jyx c27640jyx, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(json, "");
        this.copydefault = c27640jyx;
        this.KWHzl = json;
        this.EZpvd = "dex-market-meme-token-private";
    }

    /* JADX INFO: renamed from: o.keP$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.keP.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.InterfaceC28701kfj
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.util.List<java.lang.String> list, java.lang.Integer num, MemeFilter memeFilter, @NotNull Continuation<? super Flow<PersonalizedInfoWsResponse>> continuation) {
        JsonObject jsonObject = new JsonObject();
        if (str2 != null) {
            jsonObject.addProperty("walletAddress", str2);
        }
        jsonObject.addProperty("chainIndex", str);
        jsonObject.addProperty("client", "1");
        if (num != null) {
            jsonObject.add(EZpvd(num.intValue()), copydefault(str, str2, list, memeFilter));
        }
        return new TaskDescription(this.copydefault.KWHzl(this.EZpvd, yDY.copydefault(new WsArgV5ForWeb3(this.EZpvd, null, str, null, jsonObject, 10, null))), this);
    }

    /* JADX INFO: renamed from: o.keP$TaskDescription */
    public static final class TaskDescription implements Flow<PersonalizedInfoWsResponse> {
        public final /* synthetic */ Flow KWHzl;
        public final /* synthetic */ C28628keP OLrzqt;

        /* JADX INFO: renamed from: o.keP$TaskDescription$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ C28628keP KWHzl;
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, C28628keP c28628keP) {
                this.OLrzqt = flowCollector;
                this.KWHzl = c28628keP;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                PersonalizedWebSocketRepositoryImpl$subscribePersonalizedData$$inlined$mapNotNull$1$2$1 personalizedWebSocketRepositoryImpl$subscribePersonalizedData$$inlined$mapNotNull$1$2$1;
                if (continuation instanceof PersonalizedWebSocketRepositoryImpl$subscribePersonalizedData$$inlined$mapNotNull$1$2$1) {
                    personalizedWebSocketRepositoryImpl$subscribePersonalizedData$$inlined$mapNotNull$1$2$1 = (PersonalizedWebSocketRepositoryImpl$subscribePersonalizedData$$inlined$mapNotNull$1$2$1) continuation;
                    int i = personalizedWebSocketRepositoryImpl$subscribePersonalizedData$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        personalizedWebSocketRepositoryImpl$subscribePersonalizedData$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        personalizedWebSocketRepositoryImpl$subscribePersonalizedData$$inlined$mapNotNull$1$2$1 = new PersonalizedWebSocketRepositoryImpl$subscribePersonalizedData$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = personalizedWebSocketRepositoryImpl$subscribePersonalizedData$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = personalizedWebSocketRepositoryImpl$subscribePersonalizedData$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    PersonalizedInfoWsResponse personalizedInfoWsResponseCopydefault = this.KWHzl.copydefault((java.lang.String) obj);
                    if (personalizedInfoWsResponseCopydefault != null) {
                        personalizedWebSocketRepositoryImpl$subscribePersonalizedData$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(personalizedInfoWsResponseCopydefault, personalizedWebSocketRepositoryImpl$subscribePersonalizedData$$inlined$mapNotNull$1$2$1) == objCopydefault) {
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

        public TaskDescription(Flow flow, C28628keP c28628keP) {
            this.KWHzl = flow;
            this.OLrzqt = c28628keP;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super PersonalizedInfoWsResponse> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass5(flowCollector, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public final JsonObject copydefault(java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> list, MemeFilter memeFilter) {
        C28631keS c28631keS = C28631keS.KWHzl;
        if (str2 == null) {
            str2 = "";
        }
        java.util.Map<java.lang.String, java.lang.String> queryMap = c28631keS.OLrzqt(str, list, str2, "", memeFilter).toQueryMap();
        JsonObject jsonObject = new JsonObject();
        for (Map.Entry<java.lang.String, java.lang.String> entry : queryMap.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.String value = entry.getValue();
            if (!Intrinsics.EZpvd((java.lang.Object) key, (java.lang.Object) "rankType")) {
                jsonObject.addProperty(key, value);
            }
        }
        if (!list.isEmpty()) {
            jsonObject.remove("protocolIdList");
            JsonArray jsonArray = new JsonArray();
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                jsonArray.add((java.lang.String) it.next());
            }
            jsonObject.add("protocolIdList", jsonArray);
        }
        return jsonObject;
    }

    @Override // o.InterfaceC28701kfj
    public void copydefault() {
        this.copydefault.AEQbTJ();
    }

    public final PersonalizedInfoWsResponse copydefault(java.lang.String str) {
        try {
            Json json = this.KWHzl;
            json.getSerializersModule();
            return (PersonalizedInfoWsResponse) json.decodeFromString(PersonalizedInfoWsResponse.Companion.serializer(), str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
