package o;

import com.google.gson.JsonObject;
import com.okinc.business.market.features.coindetail.domain.models.EarlyBuyers;
import com.okinc.business.market.features.coindetail.domain.models.EarlyBuyersWs;
import com.okinc.business.market.features.coindetail.repo.SniperDetailRepositoryImpl$getSniperDetails$1;
import com.okinc.business.market.features.coindetail.repo.SniperDetailRepositoryImpl$getSniperDetails0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.coindetail.repo.SniperDetailRepositoryImpl$subscribeSniperDetails$$inlined$mapNotNull$1$2$1;
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

/* JADX INFO: renamed from: o.jOb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25996jOb implements InterfaceC25998jOd {
    public final C27640jyx EZpvd;
    public final InterfaceC23229huL OLrzqt;
    public final CoroutineDispatcher copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C25996jOb(@NotNull InterfaceC23229huL interfaceC23229huL, @NotNull C27640jyx c27640jyx, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = interfaceC23229huL;
        this.EZpvd = c27640jyx;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.jOb$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jOb.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.jOb$ActionBar */
    public static final class ActionBar implements Flow<EarlyBuyersWs> {
        public final /* synthetic */ C25996jOb EZpvd;
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.jOb$ActionBar$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;
            public final /* synthetic */ C25996jOb KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector, C25996jOb c25996jOb) {
                this.AEQbTJ = flowCollector;
                this.KWHzl = c25996jOb;
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
                    FlowCollector flowCollector = this.AEQbTJ;
                    EarlyBuyersWs earlyBuyersWsEZpvd = this.KWHzl.EZpvd((java.lang.String) obj);
                    if (earlyBuyersWsEZpvd != null) {
                        sniperDetailRepositoryImpl$subscribeSniperDetails$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(earlyBuyersWsEZpvd, sniperDetailRepositoryImpl$subscribeSniperDetails$$inlined$mapNotNull$1$2$1) == objCopydefault) {
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

        public ActionBar(Flow flow, C25996jOb c25996jOb) {
            this.copydefault = flow;
            this.EZpvd = c25996jOb;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super EarlyBuyersWs> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass2(flowCollector, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // o.InterfaceC25998jOd
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Flow<EarlyBuyersWs>> continuation) {
        this.EZpvd.AEQbTJ();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("chainId", str);
        jsonObject.addProperty("tokenAddress", str2);
        java.lang.String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        jsonObject.addProperty("subId", C59449zhJ.replace$default(string, "-", "", false, 4, (java.lang.Object) null));
        Unit unit = Unit.INSTANCE;
        return new ActionBar(this.EZpvd.KWHzl("dex-market-token-early-buyer", yDY.copydefault(new WsArgV5ForWeb3("dex-market-token-early-buyer", null, null, null, jsonObject, 14, null))), this);
    }

    @Override // o.InterfaceC25998jOd
    public void KWHzl() {
        this.EZpvd.AEQbTJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC25998jOd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<EarlyBuyers>> continuation) {
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
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
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

    public final EarlyBuyersWs EZpvd(@NotNull java.lang.String str) {
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
