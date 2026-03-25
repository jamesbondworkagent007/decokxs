package com.okinc.business.market.features.holders.ui;

import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.market.features.holders.domain.model.HolderDetailModel;
import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25389ivm;
import o.C25624jAh;
import o.C26211jWa;
import o.C26287jYw;
import o.C27633jyq;
import o.C28586kda;
import o.C28603kdr;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.jNY;
import o.jVY;
import o.jYC;
import o.jYD;
import o.jYF;
import o.jYJ;
import o.jYL;
import o.kKG;
import o.pUU;
import o.yCM;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TokenHoldersViewModel extends ViewModel {
    public final MutableStateFlow<jYJ> AEQbTJ;
    public final CoroutineDispatcher AYXKKw;
    public final StateFlow<jYF> AhwBna;
    public final StateFlow<jYL> AkhnZx;
    public Map<String, Integer> AuCTel;
    public final jYD DbNXlk;
    public String EZpvd;
    public final MutableStateFlow<jYF> KWHzl;
    public final MutableLiveData<Boolean> OLrzqt;
    public final MutableStateFlow<jYL> copydefault;
    public final jVY djBIcL;
    public final C27633jyq ejfBZ;
    public Integer fARcdN;
    public jNY fIwbmz;
    public C26211jWa fJNWhG;
    public final StateFlow<jYJ> fetchVPNInfo;
    public String gEmmrt;
    public String getFieldNames;
    public final kKG hDKMBd;
    public final C28603kdr isConnected;
    public final C25624jAh uzCIH;
    public String valueOf;
    public final C28586kda values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<jYF> AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jNY AYXKKw() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<jYL> EZpvd() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<jYJ> OLrzqt() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C26211jWa gEmmrt() {
        return this.fJNWhG;
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.holders.ui.TokenHoldersViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TokenHoldersViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.business.market.features.holders.ui.TokenHoldersViewModel$1$ActionBar */
        public static final class ActionBar implements Flow<C26287jYw> {
            public final /* synthetic */ Flow OLrzqt;

            /* JADX INFO: renamed from: com.okinc.business.market.features.holders.ui.TokenHoldersViewModel$1$ActionBar$1, reason: invalid class name and collision with other inner class name */
            public static final class C03641<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector AEQbTJ;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public C03641(FlowCollector flowCollector) {
                    this.AEQbTJ = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) throws Throwable {
                    TokenHoldersViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1 tokenHoldersViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1;
                    if (continuation instanceof TokenHoldersViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1) {
                        tokenHoldersViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = (TokenHoldersViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1) continuation;
                        int i = tokenHoldersViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            tokenHoldersViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                        } else {
                            tokenHoldersViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = new TokenHoldersViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1(this, continuation);
                        }
                    }
                    Object obj2 = tokenHoldersViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                    Object objCopydefault = C56442yFn.copydefault();
                    int i2 = tokenHoldersViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                    if (i2 == 0) {
                        C56391yDq.AEQbTJ(obj2);
                        FlowCollector flowCollector = this.AEQbTJ;
                        C26287jYw c26287jYw = (C26287jYw) obj;
                        if (c26287jYw != null) {
                            tokenHoldersViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 1;
                            if (flowCollector.emit(c26287jYw, tokenHoldersViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1) == objCopydefault) {
                                return objCopydefault;
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

            public ActionBar(Flow flow) {
                this.OLrzqt = flow;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super C26287jYw> flowCollector, Continuation continuation) {
                Object objCollect = this.OLrzqt.collect(new C03641(flowCollector), continuation);
                return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            TokenHoldersViewModel tokenHoldersViewModel;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                tokenHoldersViewModel = TokenHoldersViewModel.this;
                kKG kkg = tokenHoldersViewModel.hDKMBd;
                this.L$0 = tokenHoldersViewModel;
                this.label = 1;
                obj = kkg.AEQbTJ(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                tokenHoldersViewModel = (TokenHoldersViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            tokenHoldersViewModel.EZpvd = (String) obj;
            ActionBar actionBar = new ActionBar(TokenHoldersViewModel.this.DbNXlk.AEQbTJ());
            C03631 c03631 = new C03631(TokenHoldersViewModel.this);
            this.L$0 = null;
            this.label = 2;
            if (actionBar.collect(c03631, this) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.business.market.features.holders.ui.TokenHoldersViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C03631<T> implements FlowCollector {
            public final /* synthetic */ TokenHoldersViewModel EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public C03631(TokenHoldersViewModel tokenHoldersViewModel) {
                this.EZpvd = tokenHoldersViewModel;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(C26287jYw c26287jYw, Continuation<? super Unit> continuation) throws Throwable {
                TokenHoldersViewModel$1$2$emit$1 tokenHoldersViewModel$1$2$emit$1;
                jYC jyc;
                String str;
                C26211jWa c26211jWa;
                List<HolderDetailModel> list;
                MutableStateFlow mutableStateFlow;
                if (continuation instanceof TokenHoldersViewModel$1$2$emit$1) {
                    tokenHoldersViewModel$1$2$emit$1 = (TokenHoldersViewModel$1$2$emit$1) continuation;
                    int i = tokenHoldersViewModel$1$2$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        tokenHoldersViewModel$1$2$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        tokenHoldersViewModel$1$2$emit$1 = new TokenHoldersViewModel$1$2$emit$1(this, continuation);
                    }
                }
                Object obj = tokenHoldersViewModel$1$2$emit$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = tokenHoldersViewModel$1$2$emit$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj);
                    MutableStateFlow mutableStateFlow2 = this.EZpvd.copydefault;
                    jYC jycKWHzl = c26287jYw.KWHzl();
                    List<HolderDetailModel> listOLrzqt = c26287jYw.OLrzqt();
                    String str2 = this.EZpvd.gEmmrt;
                    C26211jWa c26211jWaGEmmrt = this.EZpvd.gEmmrt();
                    TokenHoldersViewModel tokenHoldersViewModel = this.EZpvd;
                    String str3 = tokenHoldersViewModel.valueOf;
                    tokenHoldersViewModel$1$2$emit$1.L$0 = jycKWHzl;
                    tokenHoldersViewModel$1$2$emit$1.L$1 = listOLrzqt;
                    tokenHoldersViewModel$1$2$emit$1.L$2 = str2;
                    tokenHoldersViewModel$1$2$emit$1.L$3 = c26211jWaGEmmrt;
                    tokenHoldersViewModel$1$2$emit$1.L$4 = mutableStateFlow2;
                    tokenHoldersViewModel$1$2$emit$1.label = 1;
                    Object objAEQbTJ = tokenHoldersViewModel.AEQbTJ(str3, tokenHoldersViewModel$1$2$emit$1);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    jyc = jycKWHzl;
                    str = str2;
                    c26211jWa = c26211jWaGEmmrt;
                    list = listOLrzqt;
                    mutableStateFlow = mutableStateFlow2;
                    obj = objAEQbTJ;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutableStateFlow = (MutableStateFlow) tokenHoldersViewModel$1$2$emit$1.L$4;
                    C26211jWa c26211jWa2 = (C26211jWa) tokenHoldersViewModel$1$2$emit$1.L$3;
                    str = (String) tokenHoldersViewModel$1$2$emit$1.L$2;
                    List<HolderDetailModel> list2 = (List) tokenHoldersViewModel$1$2$emit$1.L$1;
                    jYC jyc2 = (jYC) tokenHoldersViewModel$1$2$emit$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    list = list2;
                    c26211jWa = c26211jWa2;
                    jyc = jyc2;
                }
                mutableStateFlow.setValue(new jYL.Activity(jyc, str, c26211jWa, list, ((Boolean) obj).booleanValue()));
                return Unit.INSTANCE;
            }
        }
    }

    @yCM
    public TokenHoldersViewModel(@NotNull kKG kkg, @NotNull jYD jyd, @NotNull C28586kda c28586kda, @NotNull jVY jvy, @NotNull C27633jyq c27633jyq, @NotNull C25624jAh c25624jAh, @NotNull C28603kdr c28603kdr, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(jyd, "");
        Intrinsics.checkNotNullParameter(c28586kda, "");
        Intrinsics.checkNotNullParameter(jvy, "");
        Intrinsics.checkNotNullParameter(c27633jyq, "");
        Intrinsics.checkNotNullParameter(c25624jAh, "");
        Intrinsics.checkNotNullParameter(c28603kdr, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.hDKMBd = kkg;
        this.DbNXlk = jyd;
        this.values = c28586kda;
        this.djBIcL = jvy;
        this.ejfBZ = c27633jyq;
        this.uzCIH = c25624jAh;
        this.isConnected = c28603kdr;
        this.AYXKKw = coroutineDispatcher;
        this.valueOf = "";
        this.getFieldNames = "";
        this.EZpvd = "";
        this.gEmmrt = "";
        this.fJNWhG = new C26211jWa(0, null, null, 7, null);
        MutableStateFlow<jYL> MutableStateFlow = StateFlowKt.MutableStateFlow(jYL.ActionBar.copydefault);
        this.copydefault = MutableStateFlow;
        this.AkhnZx = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<jYF> MutableStateFlow2 = StateFlowKt.MutableStateFlow(jYF.Activity.EZpvd);
        this.KWHzl = MutableStateFlow2;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<jYJ> MutableStateFlow3 = StateFlowKt.MutableStateFlow(jYJ.StateListAnimator.copydefault);
        this.AEQbTJ = MutableStateFlow3;
        this.fetchVPNInfo = FlowKt.asStateFlow(MutableStateFlow3);
        this.OLrzqt = new MutableLiveData<>(Boolean.FALSE);
        this.AuCTel = C56424yEw.KWHzl();
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass2(null), 3, null);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.holders.ui.TokenHoldersViewModel$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TokenHoldersViewModel.this.new AnonymousClass2(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow flowCombine = FlowKt.combine(TokenHoldersViewModel.this.copydefault, TokenHoldersViewModel.this.KWHzl, new AnonymousClass1(null));
                final TokenHoldersViewModel tokenHoldersViewModel = TokenHoldersViewModel.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.holders.ui.TokenHoldersViewModel.2.4
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                    public final Object emit(jYJ jyj, Continuation<? super Unit> continuation) {
                        tokenHoldersViewModel.AEQbTJ.setValue(jyj);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowCombine.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.business.market.features.holders.ui.TokenHoldersViewModel$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements yHO<jYL, jYF, Continuation<? super jYJ>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // o.yHO
            public final Object invoke(jYL jyl, jYF jyf, Continuation<? super jYJ> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = jyl;
                anonymousClass1.L$1 = jyf;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    jYL jyl = (jYL) this.L$0;
                    jYF jyf = (jYF) this.L$1;
                    if ((jyl instanceof jYL.Application) || (jyf instanceof jYF.ActionBar)) {
                        return jYJ.Activity.copydefault;
                    }
                    if ((jyl instanceof jYL.ActionBar) || (jyf instanceof jYF.Activity)) {
                        return jYJ.StateListAnimator.copydefault;
                    }
                    if ((jyl instanceof jYL.Activity) && (jyf instanceof jYF.StateListAnimator)) {
                        return jYJ.Application.AEQbTJ;
                    }
                    return jYJ.StateListAnimator.copydefault;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void AEQbTJ(boolean z) {
        this.OLrzqt.setValue(Boolean.valueOf(z));
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AYXKKw, null, new TokenHoldersViewModel$updateAmountDisplay$1(this, z, null), 2, null);
    }

    public final void KWHzl() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AYXKKw, null, new TokenHoldersViewModel$getAmountDisplay$1(this, null), 2, null);
    }

    public final void EZpvd(int i) {
        this.fARcdN = Integer.valueOf(i);
    }

    public final void djBIcL() {
        jYL value = this.copydefault.getValue();
        if (value instanceof jYL.Activity) {
            jYL.Activity activity = (jYL.Activity) value;
            if (activity.AEQbTJ().length() == 0 && activity.KWHzl().copydefault().length() == 0) {
                this.DbNXlk.OLrzqt(this.valueOf, this.getFieldNames, this.EZpvd);
            }
        }
    }

    public final void valueOf() {
        this.DbNXlk.EZpvd();
    }

    public static /* synthetic */ void getTokenHolders$default(TokenHoldersViewModel tokenHoldersViewModel, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        tokenHoldersViewModel.OLrzqt(str, str2, z);
    }

    public final void OLrzqt(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.valueOf = str;
        this.getFieldNames = str2;
        AEQbTJ(str);
        if (z) {
            this.copydefault.setValue(jYL.ActionBar.copydefault);
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AYXKKw, null, new TokenHoldersViewModel$getTokenHolders$1(this, str, str2, null), 2, null);
    }

    public static /* synthetic */ void updateFilter$default(TokenHoldersViewModel tokenHoldersViewModel, String str, C26211jWa c26211jWa, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenHoldersViewModel.gEmmrt;
        }
        if ((i & 2) != 0) {
            c26211jWa = tokenHoldersViewModel.fJNWhG;
        }
        tokenHoldersViewModel.AEQbTJ(str, c26211jWa);
    }

    public final void AEQbTJ(@NotNull String str, @NotNull C26211jWa c26211jWa) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c26211jWa, "");
        valueOf();
        this.gEmmrt = str;
        this.fJNWhG = c26211jWa;
        if (str.length() == 0 && this.fJNWhG.copydefault().length() == 0) {
            djBIcL();
        }
        getTokenHolders$default(this, this.valueOf, this.getFieldNames, false, 4, null);
    }

    public final void copydefault(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AYXKKw, null, new TokenHoldersViewModel$getHolderFilterTags$1(this, str, str2, null), 2, null);
    }

    public final Object AEQbTJ(String str, Continuation<? super Boolean> continuation) {
        return this.ejfBZ.copydefault(str, continuation);
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new TokenHoldersViewModel$getNativeTokenPrice$1(this, str, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(@NotNull Continuation<? super Boolean> continuation) throws Throwable {
        TokenHoldersViewModel$isValidJwt$1 tokenHoldersViewModel$isValidJwt$1;
        Object objOLrzqt;
        TokenHoldersViewModel tokenHoldersViewModel;
        Object objCopydefault;
        if (continuation instanceof TokenHoldersViewModel$isValidJwt$1) {
            tokenHoldersViewModel$isValidJwt$1 = (TokenHoldersViewModel$isValidJwt$1) continuation;
            int i = tokenHoldersViewModel$isValidJwt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tokenHoldersViewModel$isValidJwt$1.label = i - Integer.MIN_VALUE;
            } else {
                tokenHoldersViewModel$isValidJwt$1 = new TokenHoldersViewModel$isValidJwt$1(this, continuation);
            }
        }
        Object obj = tokenHoldersViewModel$isValidJwt$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = tokenHoldersViewModel$isValidJwt$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C28586kda c28586kda = this.values;
            tokenHoldersViewModel$isValidJwt$1.L$0 = this;
            tokenHoldersViewModel$isValidJwt$1.label = 1;
            objOLrzqt = c28586kda.OLrzqt(tokenHoldersViewModel$isValidJwt$1);
            if (objOLrzqt == objCopydefault2) {
                return objCopydefault2;
            }
            tokenHoldersViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objCopydefault = ((Result) obj).m7386unboximpl();
                return !Result.m7383isFailureimpl(objCopydefault) ? C56443yFo.KWHzl(false) : objCopydefault;
            }
            tokenHoldersViewModel = (TokenHoldersViewModel) tokenHoldersViewModel$isValidJwt$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objOLrzqt)) {
            objOLrzqt = null;
        }
        DexUserIdentity dexUserIdentity = (DexUserIdentity) objOLrzqt;
        if (dexUserIdentity == null) {
            return C56443yFo.KWHzl(false);
        }
        C28603kdr c28603kdr = tokenHoldersViewModel.isConnected;
        String strEZpvd = dexUserIdentity.EZpvd();
        tokenHoldersViewModel$isValidJwt$1.L$0 = null;
        tokenHoldersViewModel$isValidJwt$1.label = 2;
        objCopydefault = c28603kdr.copydefault(strEZpvd, tokenHoldersViewModel$isValidJwt$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        if (!Result.m7383isFailureimpl(objCopydefault)) {
        }
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:117)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(@NotNull Continuation<? super Result<DappSignArgs>> continuation) {
        TokenHoldersViewModel$generateSignMessage$1 tokenHoldersViewModel$generateSignMessage$1;
        Object objOLrzqt;
        TokenHoldersViewModel tokenHoldersViewModel;
        Object objEZpvd;
        if (continuation instanceof TokenHoldersViewModel$generateSignMessage$1) {
            tokenHoldersViewModel$generateSignMessage$1 = (TokenHoldersViewModel$generateSignMessage$1) continuation;
            int i = tokenHoldersViewModel$generateSignMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tokenHoldersViewModel$generateSignMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                tokenHoldersViewModel$generateSignMessage$1 = new TokenHoldersViewModel$generateSignMessage$1(this, continuation);
            }
        }
        Object obj = tokenHoldersViewModel$generateSignMessage$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = tokenHoldersViewModel$generateSignMessage$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                C28586kda c28586kda = this.values;
                tokenHoldersViewModel$generateSignMessage$1.L$0 = this;
                tokenHoldersViewModel$generateSignMessage$1.label = 1;
                objOLrzqt = c28586kda.OLrzqt(tokenHoldersViewModel$generateSignMessage$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                tokenHoldersViewModel = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objEZpvd = ((Result) obj).m7386unboximpl();
                    C56391yDq.AEQbTJ(objEZpvd);
                    return Result.m7377constructorimpl((DappSignArgs) objEZpvd);
                }
                tokenHoldersViewModel = (TokenHoldersViewModel) tokenHoldersViewModel$generateSignMessage$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
            }
            C56391yDq.AEQbTJ(objOLrzqt);
            DexUserIdentity dexUserIdentity = (DexUserIdentity) objOLrzqt;
            C28603kdr c28603kdr = tokenHoldersViewModel.isConnected;
            String strEZpvd = dexUserIdentity.EZpvd();
            long jOLrzqt = dexUserIdentity.OLrzqt();
            tokenHoldersViewModel$generateSignMessage$1.L$0 = null;
            tokenHoldersViewModel$generateSignMessage$1.label = 2;
            objEZpvd = c28603kdr.EZpvd(strEZpvd, jOLrzqt, tokenHoldersViewModel$generateSignMessage$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            C56391yDq.AEQbTJ(objEZpvd);
            return Result.m7377constructorimpl((DappSignArgs) objEZpvd);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(Bundle bundle, @NotNull Continuation<? super Result<Boolean>> continuation) throws Throwable {
        TokenHoldersViewModel$login$1 tokenHoldersViewModel$login$1;
        Object objOLrzqt;
        TokenHoldersViewModel tokenHoldersViewModel;
        Object objKWHzl;
        if (continuation instanceof TokenHoldersViewModel$login$1) {
            tokenHoldersViewModel$login$1 = (TokenHoldersViewModel$login$1) continuation;
            int i = tokenHoldersViewModel$login$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tokenHoldersViewModel$login$1.label = i - Integer.MIN_VALUE;
            } else {
                tokenHoldersViewModel$login$1 = new TokenHoldersViewModel$login$1(this, continuation);
            }
        }
        TokenHoldersViewModel$login$1 tokenHoldersViewModel$login$12 = tokenHoldersViewModel$login$1;
        Object obj = tokenHoldersViewModel$login$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = tokenHoldersViewModel$login$12.label;
        Object obj2 = null;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                C28586kda c28586kda = this.values;
                tokenHoldersViewModel$login$12.L$0 = this;
                tokenHoldersViewModel$login$12.L$1 = bundle;
                tokenHoldersViewModel$login$12.label = 1;
                objOLrzqt = c28586kda.OLrzqt(tokenHoldersViewModel$login$12);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                tokenHoldersViewModel = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objKWHzl = ((Result) obj).m7386unboximpl();
                    if (Result.m7383isFailureimpl(objKWHzl)) {
                        obj2 = objKWHzl;
                    }
                    return Result.m7377constructorimpl(C56443yFo.KWHzl(Intrinsics.EZpvd(obj2, C56443yFo.KWHzl(true))));
                }
                bundle = (Bundle) tokenHoldersViewModel$login$12.L$1;
                tokenHoldersViewModel = (TokenHoldersViewModel) tokenHoldersViewModel$login$12.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
            }
            Bundle bundle2 = bundle;
            C56391yDq.AEQbTJ(objOLrzqt);
            DexUserIdentity dexUserIdentity = (DexUserIdentity) objOLrzqt;
            C28603kdr c28603kdr = tokenHoldersViewModel.isConnected;
            String strEZpvd = dexUserIdentity.EZpvd();
            long jOLrzqt = dexUserIdentity.OLrzqt();
            tokenHoldersViewModel$login$12.L$0 = null;
            tokenHoldersViewModel$login$12.L$1 = null;
            tokenHoldersViewModel$login$12.label = 2;
            objKWHzl = c28603kdr.KWHzl(strEZpvd, jOLrzqt, bundle2, tokenHoldersViewModel$login$12);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            if (Result.m7383isFailureimpl(objKWHzl)) {
            }
            return Result.m7377constructorimpl(C56443yFo.KWHzl(Intrinsics.EZpvd(obj2, C56443yFo.KWHzl(true))));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final int KWHzl(String str) {
        Integer numValueOf = this.AuCTel.get(str);
        if (numValueOf == null) {
            Integer num = this.fARcdN;
            numValueOf = num != null ? Integer.valueOf(num.intValue() + 1) : null;
            if (numValueOf == null) {
                return 101;
            }
        }
        return numValueOf.intValue();
    }
}
