package o;

import com.okinc.business.market.data.model.HomeFavoriteTokenData;
import com.okinc.business.market.features.home_favorite_list.repo.RealtimeHomeFavoriteListRepo$startBatchWs$$inlined$mapNotNull$1$2$1;
import com.okinc.websocket.v5config.WsSubscribeArgV5;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kaW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28423kaW {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final Json OLrzqt;
    public final C27640jyx copydefault;

    @yCM
    public C28423kaW(@yCL(AEQbTJ = "public_client") @NotNull C27640jyx c27640jyx, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(json, "");
        this.copydefault = c27640jyx;
        this.OLrzqt = json;
    }

    public final Flow<java.util.List<HomeFavoriteTokenData>> AEQbTJ(@NotNull java.util.List<C28420kaT> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList<? extends WsSubscribeArgV5> arrayList = new java.util.ArrayList<>();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (C28420kaT c28420kaT : list) {
            arrayList2.add(new WsArgV5ForWeb3("dex-market-v3", null, c28420kaT.KWHzl(), c28420kaT.OLrzqt(), null, 18, null));
        }
        arrayList.addAll(arrayList2);
        return new TaskDescription(this.copydefault.KWHzl("dex-market-v3", arrayList), this);
    }

    /* JADX INFO: renamed from: o.kaW$TaskDescription */
    public static final class TaskDescription implements Flow<java.util.List<? extends HomeFavoriteTokenData>> {
        public final /* synthetic */ C28423kaW OLrzqt;
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.kaW$TaskDescription$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;
            public final /* synthetic */ C28423kaW copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, C28423kaW c28423kaW) {
                this.EZpvd = flowCollector;
                this.copydefault = c28423kaW;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: kotlinx.coroutines.flow.FlowCollector */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                RealtimeHomeFavoriteListRepo$startBatchWs$$inlined$mapNotNull$1$2$1 realtimeHomeFavoriteListRepo$startBatchWs$$inlined$mapNotNull$1$2$1;
                java.lang.Object objM7377constructorimpl;
                if (continuation instanceof RealtimeHomeFavoriteListRepo$startBatchWs$$inlined$mapNotNull$1$2$1) {
                    realtimeHomeFavoriteListRepo$startBatchWs$$inlined$mapNotNull$1$2$1 = (RealtimeHomeFavoriteListRepo$startBatchWs$$inlined$mapNotNull$1$2$1) continuation;
                    int i = realtimeHomeFavoriteListRepo$startBatchWs$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        realtimeHomeFavoriteListRepo$startBatchWs$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        realtimeHomeFavoriteListRepo$startBatchWs$$inlined$mapNotNull$1$2$1 = new RealtimeHomeFavoriteListRepo$startBatchWs$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = realtimeHomeFavoriteListRepo$startBatchWs$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = realtimeHomeFavoriteListRepo$startBatchWs$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    java.lang.String str = (java.lang.String) obj;
                    try {
                        Result.Application application = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) this.copydefault.OLrzqt.decodeFromString(BuiltinSerializersKt.ListSerializer(HomeFavoriteTokenData.Companion.serializer()), str));
                    } catch (CancellationException e) {
                        throw e;
                    } catch (java.lang.Throwable th) {
                        pUU.AEQbTJ("DEX", "dexRunCatching", th);
                        Result.Application application2 = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                    if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                        objM7377constructorimpl = null;
                    }
                    if (objM7377constructorimpl != null) {
                        realtimeHomeFavoriteListRepo$startBatchWs$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(objM7377constructorimpl, realtimeHomeFavoriteListRepo$startBatchWs$$inlined$mapNotNull$1$2$1) == objCopydefault) {
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

        public TaskDescription(Flow flow, C28423kaW c28423kaW) {
            this.copydefault = flow;
            this.OLrzqt = c28423kaW;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends HomeFavoriteTokenData>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass3(flowCollector, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kaW$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kaW.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final java.lang.Object EZpvd() {
        try {
            Result.Application application = Result.Companion;
            this.copydefault.AEQbTJ();
            return Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
