package com.okinc.business.trade.features.home.advanced.usecase;

import com.appsflyer.AppsFlyerProperties;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C28179kRv;
import o.C30651lfF;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28152kQv;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMarketPriceUseCase$observePublicPush$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Flow<? extends Object>>, Object> {
    final /* synthetic */ DexMultiTokenInfoBean $baseToken;
    int label;
    final /* synthetic */ C28179kRv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedMarketPriceUseCase$observePublicPush$2(C28179kRv c28179kRv, DexMultiTokenInfoBean dexMultiTokenInfoBean, Continuation<? super AdvancedMarketPriceUseCase$observePublicPush$2> continuation) {
        super(2, continuation);
        this.this$0 = c28179kRv;
        this.$baseToken = dexMultiTokenInfoBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedMarketPriceUseCase$observePublicPush$2(this.this$0, this.$baseToken, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Flow<? extends Object>> continuation) {
        return ((AdvancedMarketPriceUseCase$observePublicPush$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC28152kQv interfaceC28152kQv = this.this$0.copydefault;
            this.label = 1;
            obj = interfaceC28152kQv.EZpvd(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return new StateListAnimator((Flow) obj, this.this$0, this.$baseToken);
    }

    public static final class StateListAnimator implements Flow<Object> {
        public final /* synthetic */ C28179kRv EZpvd;
        public final /* synthetic */ Flow KWHzl;
        public final /* synthetic */ DexMultiTokenInfoBean copydefault;

        /* JADX INFO: renamed from: com.okinc.business.trade.features.home.advanced.usecase.AdvancedMarketPriceUseCase$observePublicPush$2$StateListAnimator$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ C28179kRv EZpvd;
            public final /* synthetic */ FlowCollector KWHzl;
            public final /* synthetic */ DexMultiTokenInfoBean OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, C28179kRv c28179kRv, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
                this.KWHzl = flowCollector;
                this.EZpvd = c28179kRv;
                this.OLrzqt = dexMultiTokenInfoBean;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r9v2, resolved type: kotlinx.coroutines.flow.FlowCollector */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00b3 A[RETURN] */
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
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                AdvancedMarketPriceUseCase$observePublicPush$2$invokeSuspend$$inlined$map$1$2$1 advancedMarketPriceUseCase$observePublicPush$2$invokeSuspend$$inlined$map$1$2$1;
                Object objKWHzl;
                if (continuation instanceof AdvancedMarketPriceUseCase$observePublicPush$2$invokeSuspend$$inlined$map$1$2$1) {
                    advancedMarketPriceUseCase$observePublicPush$2$invokeSuspend$$inlined$map$1$2$1 = (AdvancedMarketPriceUseCase$observePublicPush$2$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i = advancedMarketPriceUseCase$observePublicPush$2$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        advancedMarketPriceUseCase$observePublicPush$2$invokeSuspend$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        advancedMarketPriceUseCase$observePublicPush$2$invokeSuspend$$inlined$map$1$2$1 = new AdvancedMarketPriceUseCase$observePublicPush$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = advancedMarketPriceUseCase$observePublicPush$2$invokeSuspend$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = advancedMarketPriceUseCase$observePublicPush$2$invokeSuspend$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    Pair pair = (Pair) obj;
                    String str = (String) pair.component1();
                    String str2 = (String) ((HashMap) pair.component2()).get(AppsFlyerProperties.CHANNEL);
                    if (str2 == null) {
                        objKWHzl = Unit.INSTANCE;
                        advancedMarketPriceUseCase$observePublicPush$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                        if (flowCollector.emit(objKWHzl, advancedMarketPriceUseCase$observePublicPush$2$invokeSuspend$$inlined$map$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        int iHashCode = str2.hashCode();
                        if (iHashCode != -1195876488) {
                            if (iHashCode == 793155709 && str2.equals("dex-market-trade-history-batch")) {
                                C30651lfF c30651lfF = this.EZpvd.AEQbTJ;
                                DexMultiTokenInfoBean dexMultiTokenInfoBean = this.OLrzqt;
                                C30651lfF c30651lfF2 = this.EZpvd.AEQbTJ;
                                String strSubstring = str.substring(1, str.length() - 1);
                                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                                objKWHzl = c30651lfF.KWHzl(dexMultiTokenInfoBean, c30651lfF2.copydefault(strSubstring));
                            }
                            advancedMarketPriceUseCase$observePublicPush$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(objKWHzl, advancedMarketPriceUseCase$observePublicPush$2$invokeSuspend$$inlined$map$1$2$1) == objCopydefault) {
                            }
                        } else {
                            if (str2.equals("dex-market-v3")) {
                                objKWHzl = this.EZpvd.AEQbTJ.KWHzl(this.EZpvd.AEQbTJ.AEQbTJ(str));
                            }
                            advancedMarketPriceUseCase$observePublicPush$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(objKWHzl, advancedMarketPriceUseCase$observePublicPush$2$invokeSuspend$$inlined$map$1$2$1) == objCopydefault) {
                            }
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public StateListAnimator(Flow flow, C28179kRv c28179kRv, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
            this.KWHzl = flow;
            this.EZpvd = c28179kRv;
            this.copydefault = dexMultiTokenInfoBean;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
            Object objCollect = this.KWHzl.collect(new AnonymousClass5(flowCollector, this.EZpvd, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
