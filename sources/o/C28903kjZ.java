package o;

import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.market.data.model.ModuleBoostHeaderData;
import com.okinc.business.market.data.model.ModuleData;
import com.okinc.business.market.data.model.ModuleDetailData;
import com.okinc.business.market.features.module.repository.ModuleRepositoryImpl$getModuleBoostListedTokens$2;
import com.okinc.business.market.features.module.repository.ModuleRepositoryImpl$getModules$2;
import com.okinc.business.market.features.module.repository.ModuleRepositoryImpl$startModuleDetailWs$$inlined$map$1$2$1;
import com.okinc.business.market.features.module.repository.ModuleRepositoryImpl$startModulesWebsocket$$inlined$mapNotNull$1$2$1;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kjZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28903kjZ implements InterfaceC28901kjX {
    public final InterfaceC23229huL AEQbTJ;
    public final java.lang.String OLrzqt;
    public final C27640jyx copydefault;

    /* JADX INFO: renamed from: o.kjZ$Activity */
    public static final class Activity extends TypeToken<java.util.List<? extends ModuleDetailData>> {
    }

    /* JADX INFO: renamed from: o.kjZ$Application */
    public static final class Application extends TypeToken<java.util.List<? extends java.util.List<? extends ModuleData>>> {
    }

    @yCM
    public C28903kjZ(@NotNull InterfaceC23229huL interfaceC23229huL, @NotNull C27640jyx c27640jyx) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        this.AEQbTJ = interfaceC23229huL;
        this.copydefault = c27640jyx;
        this.OLrzqt = "dex-market-categoryModule";
    }

    @Override // o.InterfaceC28901kjX
    public java.lang.Object OLrzqt(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ModuleData>, OKServerException>> continuation) {
        return kAB.EZpvd(new ModuleRepositoryImpl$getModules$2(this, null), continuation);
    }

    @Override // o.InterfaceC28901kjX
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super Unit> continuation) {
        this.copydefault.AEQbTJ();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.kjZ$ActionBar */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class ActionBar implements Flow<ModuleDetailData> {
        public final /* synthetic */ C28903kjZ OLrzqt;
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.kjZ$ActionBar$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;
            public final /* synthetic */ C28903kjZ OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector, C28903kjZ c28903kjZ) {
                this.AEQbTJ = flowCollector;
                this.OLrzqt = c28903kjZ;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ModuleRepositoryImpl$startModuleDetailWs$$inlined$map$1$2$1 moduleRepositoryImpl$startModuleDetailWs$$inlined$map$1$2$1;
                if (continuation instanceof ModuleRepositoryImpl$startModuleDetailWs$$inlined$map$1$2$1) {
                    moduleRepositoryImpl$startModuleDetailWs$$inlined$map$1$2$1 = (ModuleRepositoryImpl$startModuleDetailWs$$inlined$map$1$2$1) continuation;
                    int i = moduleRepositoryImpl$startModuleDetailWs$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        moduleRepositoryImpl$startModuleDetailWs$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        moduleRepositoryImpl$startModuleDetailWs$$inlined$map$1$2$1 = new ModuleRepositoryImpl$startModuleDetailWs$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = moduleRepositoryImpl$startModuleDetailWs$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = moduleRepositoryImpl$startModuleDetailWs$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    ModuleDetailData moduleDetailDataKWHzl = this.OLrzqt.KWHzl((java.lang.String) obj);
                    moduleRepositoryImpl$startModuleDetailWs$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(moduleDetailDataKWHzl, moduleRepositoryImpl$startModuleDetailWs$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
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

        public ActionBar(Flow flow, C28903kjZ c28903kjZ) {
            this.copydefault = flow;
            this.OLrzqt = c28903kjZ;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super ModuleDetailData> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass1(flowCollector, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kjZ$TaskDescription */
    public static final class TaskDescription implements Flow<java.util.List<? extends ModuleData>> {
        public final /* synthetic */ C28903kjZ EZpvd;
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: o.kjZ$TaskDescription$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;
            public final /* synthetic */ C28903kjZ KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, C28903kjZ c28903kjZ) {
                this.EZpvd = flowCollector;
                this.KWHzl = c28903kjZ;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ModuleRepositoryImpl$startModulesWebsocket$$inlined$mapNotNull$1$2$1 moduleRepositoryImpl$startModulesWebsocket$$inlined$mapNotNull$1$2$1;
                if (continuation instanceof ModuleRepositoryImpl$startModulesWebsocket$$inlined$mapNotNull$1$2$1) {
                    moduleRepositoryImpl$startModulesWebsocket$$inlined$mapNotNull$1$2$1 = (ModuleRepositoryImpl$startModulesWebsocket$$inlined$mapNotNull$1$2$1) continuation;
                    int i = moduleRepositoryImpl$startModulesWebsocket$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        moduleRepositoryImpl$startModulesWebsocket$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        moduleRepositoryImpl$startModulesWebsocket$$inlined$mapNotNull$1$2$1 = new ModuleRepositoryImpl$startModulesWebsocket$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = moduleRepositoryImpl$startModulesWebsocket$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = moduleRepositoryImpl$startModulesWebsocket$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    java.util.List listCopydefault = this.KWHzl.copydefault((java.lang.String) obj);
                    if (listCopydefault != null) {
                        moduleRepositoryImpl$startModulesWebsocket$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(listCopydefault, moduleRepositoryImpl$startModulesWebsocket$$inlined$mapNotNull$1$2$1) == objCopydefault) {
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

        public TaskDescription(Flow flow, C28903kjZ c28903kjZ) {
            this.KWHzl = flow;
            this.EZpvd = c28903kjZ;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends ModuleData>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass5(flowCollector, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // o.InterfaceC28901kjX
    public java.lang.Object KWHzl(@NotNull Continuation<? super Flow<? extends java.util.List<ModuleData>>> continuation) {
        return new TaskDescription(this.copydefault.KWHzl(this.OLrzqt, yDY.copydefault(new WsArgV5ForWeb3(this.OLrzqt, null, null, null, null, 30, null))), this);
    }

    @Override // o.InterfaceC28901kjX
    public java.lang.Object copydefault(@NotNull Continuation<? super AbstractC43419rot<ModuleBoostHeaderData, OKServerException>> continuation) {
        return kAB.EZpvd(new ModuleRepositoryImpl$getModuleBoostListedTokens$2(this, null), continuation);
    }

    @Override // o.InterfaceC28901kjX
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Flow<ModuleDetailData>> continuation) {
        return new ActionBar(this.copydefault.KWHzl(str, yDY.copydefault(new WsArgV5ForWeb3(str, null, str2, null, null, 26, null))), this);
    }

    @Override // o.InterfaceC28901kjX
    public java.lang.Object EZpvd(@NotNull Continuation<? super Unit> continuation) {
        this.copydefault.AEQbTJ();
        return Unit.INSTANCE;
    }

    public final java.util.List<ModuleData> copydefault(java.lang.String str) {
        try {
            java.lang.Object objFromJson = new GsonBuilder().create().fromJson(str, new Application().getType());
            Intrinsics.checkNotNullExpressionValue(objFromJson, "");
            return (java.util.List) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) objFromJson);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final ModuleDetailData KWHzl(java.lang.String str) {
        try {
            java.lang.Object objFromJson = new GsonBuilder().create().fromJson(str, new Activity().getType());
            Intrinsics.checkNotNullExpressionValue(objFromJson, "");
            return (ModuleDetailData) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) objFromJson);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
