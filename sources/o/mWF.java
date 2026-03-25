package o;

import com.google.gson.JsonObject;
import com.okinc.dexkline.market.features.coindetail.domain.models.EarlyBuyers;
import com.okinc.dexkline.market.features.coindetail.domain.models.EarlyBuyersWs;
import com.okinc.dexkline.market.features.coindetail.repo.SniperDetailRepositoryImpl$getSniperDetails$1;
import com.okinc.dexkline.market.features.coindetail.repo.SniperDetailRepositoryImpl$getSniperDetails0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.dexkline.market.features.coindetail.repo.SniperDetailRepositoryImpl$subscribeSniperDetails$$inlined$mapNotNull$1$2$1;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import java.util.UUID;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mWF implements mWI {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final CoroutineDispatcher KWHzl;
    public final C32261mVl OLrzqt;
    public final InterfaceC32162mRu copydefault;

    @yCM
    public mWF(@NotNull InterfaceC32162mRu interfaceC32162mRu, @NotNull C32261mVl c32261mVl, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC32162mRu, "");
        Intrinsics.checkNotNullParameter(c32261mVl, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC32162mRu;
        this.OLrzqt = c32261mVl;
        this.KWHzl = coroutineDispatcher;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mWF.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application implements Flow<EarlyBuyersWs> {
        public final /* synthetic */ Flow EZpvd;
        public final /* synthetic */ mWF copydefault;

        /* JADX INFO: renamed from: o.mWF$Application$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ mWF AEQbTJ;
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, mWF mwf) {
                this.KWHzl = flowCollector;
                this.AEQbTJ = mwf;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SniperDetailRepositoryImpl$subscribeSniperDetails$$inlined$mapNotNull$1$2$1 sniperDetailRepositoryImpl$subscribeSniperDetails$$inlined$mapNotNull$1$2$1;
                if (continuation instanceof SniperDetailRepositoryImpl$subscribeSniperDetails$$inlined$mapNotNull$1$2$1) {
                    sniperDetailRepositoryImpl$subscribeSniperDetails$$inlined$mapNotNull$1$2$1 = (SniperDetailRepositoryImpl$subscribeSniperDetails$$inlined$mapNotNull$1$2$1) continuation;
                    int i = sniperDetailRepositoryImpl$subscribeSniperDetails$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        sniperDetailRepositoryImpl$subscribeSniperDetails$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        sniperDetailRepositoryImpl$subscribeSniperDetails$$inlined$mapNotNull$1$2$1 = new SniperDetailRepositoryImpl$subscribeSniperDetails$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = sniperDetailRepositoryImpl$subscribeSniperDetails$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = sniperDetailRepositoryImpl$subscribeSniperDetails$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    EarlyBuyersWs earlyBuyersWsOLrzqt = this.AEQbTJ.OLrzqt((java.lang.String) obj);
                    if (earlyBuyersWsOLrzqt != null) {
                        sniperDetailRepositoryImpl$subscribeSniperDetails$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(earlyBuyersWsOLrzqt, sniperDetailRepositoryImpl$subscribeSniperDetails$$inlined$mapNotNull$1$2$1) == objCopydefault) {
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

        public Application(Flow flow, mWF mwf) {
            this.EZpvd = flow;
            this.copydefault = mwf;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super EarlyBuyersWs> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass4(flowCollector, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // o.mWI
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Flow<EarlyBuyersWs>> continuation) {
        this.OLrzqt.EZpvd();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("chainId", str);
        jsonObject.addProperty("tokenAddress", str2);
        java.lang.String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        jsonObject.addProperty("subId", C59449zhJ.replace$default(string, "-", "", false, 4, (java.lang.Object) null));
        Unit unit = Unit.INSTANCE;
        this.OLrzqt.KWHzl("dex-market-token-early-buyer", yDY.copydefault(new WsArgV5ForWeb3("dex-market-token-early-buyer", null, null, null, jsonObject, 14, null)));
        return new Application(this.OLrzqt.copydefault(), this);
    }

    @Override // o.mWI
    public void copydefault() {
        this.OLrzqt.EZpvd();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.mWI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<EarlyBuyers>> continuation) throws java.lang.Throwable {
        SniperDetailRepositoryImpl$getSniperDetails$1 sniperDetailRepositoryImpl$getSniperDetails$1;
        if (continuation instanceof SniperDetailRepositoryImpl$getSniperDetails$1) {
            sniperDetailRepositoryImpl$getSniperDetails$1 = (SniperDetailRepositoryImpl$getSniperDetails$1) continuation;
            int i = sniperDetailRepositoryImpl$getSniperDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sniperDetailRepositoryImpl$getSniperDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                sniperDetailRepositoryImpl$getSniperDetails$1 = new SniperDetailRepositoryImpl$getSniperDetails$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = sniperDetailRepositoryImpl$getSniperDetails$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = sniperDetailRepositoryImpl$getSniperDetails$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            SniperDetailRepositoryImpl$getSniperDetails0E7RQCE$$inlined$dexRunCatching$1 sniperDetailRepositoryImpl$getSniperDetails0E7RQCE$$inlined$dexRunCatching$1 = new SniperDetailRepositoryImpl$getSniperDetails0E7RQCE$$inlined$dexRunCatching$1(null, this, str, str2);
            sniperDetailRepositoryImpl$getSniperDetails$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, sniperDetailRepositoryImpl$getSniperDetails0E7RQCE$$inlined$dexRunCatching$1, sniperDetailRepositoryImpl$getSniperDetails$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public final EarlyBuyersWs OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Json jsonKWHzl = C43284rmQ.KWHzl();
            jsonKWHzl.getSerializersModule();
            return (EarlyBuyersWs) jsonKWHzl.decodeFromString(EarlyBuyersWs.Companion.serializer(), str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
