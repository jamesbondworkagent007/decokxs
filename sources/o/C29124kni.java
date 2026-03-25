package o;

import com.okinc.business.market.features.position.domain.GetLimitOrderBalanceUseCase$invoke$1;
import com.okinc.business.market.features.position.domain.GetLimitOrderBalanceUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.position.domain.GetLimitOrderBalanceUseCase$subscribeWs$lambda$3$$inlined$map$1$2$1;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kni, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29124kni {
    public final InterfaceC29130kno EZpvd;
    public final CoroutineScope KWHzl;
    public final kKG OLrzqt;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C29124kni(@NotNull kKG kkg, @NotNull InterfaceC29130kno interfaceC29130kno, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(interfaceC29130kno, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = kkg;
        this.EZpvd = interfaceC29130kno;
        this.copydefault = coroutineDispatcher;
        this.KWHzl = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<C29183koo>> continuation) {
        GetLimitOrderBalanceUseCase$invoke$1 getLimitOrderBalanceUseCase$invoke$1;
        if (continuation instanceof GetLimitOrderBalanceUseCase$invoke$1) {
            getLimitOrderBalanceUseCase$invoke$1 = (GetLimitOrderBalanceUseCase$invoke$1) continuation;
            int i = getLimitOrderBalanceUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getLimitOrderBalanceUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getLimitOrderBalanceUseCase$invoke$1 = new GetLimitOrderBalanceUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getLimitOrderBalanceUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getLimitOrderBalanceUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            java.lang.String strCopydefault = this.OLrzqt.copydefault(str);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            GetLimitOrderBalanceUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 getLimitOrderBalanceUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 = new GetLimitOrderBalanceUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(null, this, str, strCopydefault, str2);
            getLimitOrderBalanceUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getLimitOrderBalanceUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1, getLimitOrderBalanceUseCase$invoke$1);
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

    /* JADX INFO: renamed from: o.kni$ActionBar */
    public static final class ActionBar implements Flow<C29183koo> {
        public final /* synthetic */ Flow EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX INFO: renamed from: o.kni$ActionBar$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ java.lang.String AEQbTJ;
            public final /* synthetic */ java.lang.String EZpvd;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, java.lang.String str, java.lang.String str2) {
                this.copydefault = flowCollector;
                this.AEQbTJ = str;
                this.EZpvd = str2;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                GetLimitOrderBalanceUseCase$subscribeWs$lambda$3$$inlined$map$1$2$1 getLimitOrderBalanceUseCase$subscribeWs$lambda$3$$inlined$map$1$2$1;
                T next;
                if (continuation instanceof GetLimitOrderBalanceUseCase$subscribeWs$lambda$3$$inlined$map$1$2$1) {
                    getLimitOrderBalanceUseCase$subscribeWs$lambda$3$$inlined$map$1$2$1 = (GetLimitOrderBalanceUseCase$subscribeWs$lambda$3$$inlined$map$1$2$1) continuation;
                    int i = getLimitOrderBalanceUseCase$subscribeWs$lambda$3$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        getLimitOrderBalanceUseCase$subscribeWs$lambda$3$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        getLimitOrderBalanceUseCase$subscribeWs$lambda$3$$inlined$map$1$2$1 = new GetLimitOrderBalanceUseCase$subscribeWs$lambda$3$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = getLimitOrderBalanceUseCase$subscribeWs$lambda$3$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = getLimitOrderBalanceUseCase$subscribeWs$lambda$3$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    java.util.Iterator<T> it = C29136knu.KWHzl((java.util.List) obj).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = (T) null;
                            break;
                        }
                        next = it.next();
                        C29183koo c29183koo = (C29183koo) next;
                        if (Intrinsics.EZpvd((java.lang.Object) c29183koo.OLrzqt(), (java.lang.Object) this.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) c29183koo.AEQbTJ(), (java.lang.Object) this.EZpvd)) {
                            break;
                        }
                    }
                    getLimitOrderBalanceUseCase$subscribeWs$lambda$3$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(next, getLimitOrderBalanceUseCase$subscribeWs$lambda$3$$inlined$map$1$2$1) == objCopydefault) {
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

        public ActionBar(Flow flow, java.lang.String str, java.lang.String str2) {
            this.EZpvd = flow;
            this.copydefault = str;
            this.KWHzl = str2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super C29183koo> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass3(flowCollector, this.copydefault, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public final Flow<C29183koo> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        OLrzqt();
        return C22416heu.ejfBZ() ? FlowKt.emptyFlow() : new ActionBar(this.EZpvd.EZpvd(), str, str2);
    }

    public final void OLrzqt() {
        JobKt__JobKt.cancelChildren$default(this.KWHzl.getCoroutineContext(), (CancellationException) null, 1, (java.lang.Object) null);
    }
}
