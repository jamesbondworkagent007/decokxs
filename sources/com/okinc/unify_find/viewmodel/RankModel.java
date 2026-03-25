package com.okinc.unify_find.viewmodel;

import android.util.ArrayMap;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.kyc.api.biz.restriction.FeatureRestrictionDiffSet;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.unify_find.viewmodel.RankModel;
import com.okinc.unify_trade.biz.BizResp;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.AbstractC33073mpa;
import o.C33129mqd;
import o.C43251rlk;
import o.C55525xlb;
import o.C56131xwy;
import o.C56391yDq;
import o.C56392yDr;
import o.C56442yFn;
import o.C56443yFo;
import o.C56524yIo;
import o.InterfaceC54647xQc;
import o.InterfaceC55467xkW;
import o.InterfaceC56387yDm;
import o.InterfaceC58217yxC;
import o.pUU;
import o.qTI;
import o.qVD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public abstract class RankModel extends AbstractC33073mpa implements InterfaceC55467xkW, DefaultLifecycleObserver {
    public static final Activity Companion = new Activity(null);
    public static final int isConnected = 8;
    public Job AubY;
    public Job fARcdN;
    public final ArrayMap<String, TickersData> fIwbmz;
    public Job getFieldNames;
    public boolean getNewProxyInstance;
    public InterfaceC58217yxC hDKMBd;
    public Function1<? super Integer, Unit> iwGUEr;
    public final InterfaceC56387yDm uzCIH;
    public final InterfaceC54647xQc wlaJM;
    public final MutableLiveData<Boolean> AuCTel = new MutableLiveData<>();
    public final MutableLiveData<Boolean> fJNWhG = new MutableLiveData<>();
    public final String AkhnZx = "7";
    public String ejfBZ = "1000";
    public final int fetchVPNInfo = 7;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> AkhnZx() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTel() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55467xkW
    public Object EZpvd(@NotNull Continuation<? super Unit> continuation) {
        return copydefault(this, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(InterfaceC58217yxC interfaceC58217yxC) {
        this.hDKMBd = interfaceC58217yxC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Job job) {
        this.fARcdN = job;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> ejfBZ() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC58217yxC fARcdN() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fIwbmz() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Job fetchVPNInfo() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNewProxyInstance() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayMap<String, TickersData> isConnected() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String iwGUEr() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC54647xQc uzCIH() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_find.viewmodel.RankModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public RankModel() {
        InterfaceC54647xQc interfaceC54647xQcOLrzqt = qVD.AEQbTJ.OLrzqt();
        this.wlaJM = interfaceC54647xQcOLrzqt;
        this.fIwbmz = new ArrayMap<>();
        interfaceC54647xQcOLrzqt.OLrzqt(new Function0() { // from class: o.xnC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return RankModel.copydefault(this.AEQbTJ);
            }
        });
        this.uzCIH = C56392yDr.copydefault(new Function0() { // from class: o.xnD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return RankModel.DbNXlk();
            }
        });
    }

    public static /* synthetic */ void refresh$default(RankModel rankModel, Boolean bool, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refresh");
        }
        if ((i & 1) != 0) {
            bool = Boolean.FALSE;
        }
        rankModel.EZpvd(bool);
    }

    public void EZpvd(Boolean bool) {
        this.getNewProxyInstance = bool != null ? bool.booleanValue() : false;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onPause(lifecycleOwner);
        Job job = this.getFieldNames;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onResume(lifecycleOwner);
        Job job = this.getFieldNames;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Objects.toString(lifecycleOwner);
        this.getFieldNames = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: renamed from: com.okinc.unify_find.viewmodel.RankModel$onResume$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RankModel.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.unify_find.viewmodel.RankModel$onResume$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C06801 extends SuspendLambda implements Function2<FeatureRestrictionDiffSet, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ RankModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06801(RankModel rankModel, Continuation<? super C06801> continuation) {
                super(2, continuation);
                this.this$0 = rankModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06801 c06801 = new C06801(this.this$0, continuation);
                c06801.L$0 = obj;
                return c06801;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FeatureRestrictionDiffSet featureRestrictionDiffSet, Continuation<? super Unit> continuation) {
                return ((C06801) create(featureRestrictionDiffSet, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    FeatureRestrictionDiffSet featureRestrictionDiffSet = (FeatureRestrictionDiffSet) this.L$0;
                    Objects.toString(featureRestrictionDiffSet);
                    if (featureRestrictionDiffSet.getEntityIdChange()) {
                        pUU.KWHzl("RankModel", "start refresh Rank ");
                        RankModel rankModel = this.this$0;
                        rankModel.EZpvd(C56443yFo.KWHzl(rankModel.getNewProxyInstance()));
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            SharedFlow<FeatureRestrictionDiffSet> sharedFlowGHZMYf;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                OKComplianceRestrictionService oKComplianceRestrictionService = (OKComplianceRestrictionService) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(OKComplianceRestrictionService.class));
                if (oKComplianceRestrictionService != null && (sharedFlowGHZMYf = oKComplianceRestrictionService.gHZMYf()) != null) {
                    C06801 c06801 = new C06801(RankModel.this, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlowGHZMYf, c06801, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public void KWHzl(@NotNull Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "");
        Objects.toString(lifecycle);
        lifecycle.addObserver(this);
    }

    public static final Unit copydefault(RankModel rankModel) {
        Function1<? super Integer, Unit> function1 = rankModel.iwGUEr;
        if (function1 != null) {
            function1.invoke(-1);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ ArrayList getHomeList$default(RankModel rankModel, Integer num, ArrayList arrayList, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHomeList");
        }
        if ((i & 1) != 0) {
            num = 7;
        }
        return rankModel.KWHzl(num, arrayList);
    }

    public final <T> ArrayList<T> KWHzl(Integer num, @NotNull ArrayList<T> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        int size = arrayList.size();
        Intrinsics.copydefault(num);
        return size > num.intValue() ? new ArrayList<>(arrayList.subList(0, num.intValue())) : arrayList;
    }

    public final <T> ArrayList<T> OLrzqt(@NotNull ArrayList<T> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        return KWHzl(Integer.valueOf(this.fetchVPNInfo), arrayList);
    }

    public static final C56131xwy DbNXlk() {
        return new C56131xwy();
    }

    public final C56131xwy fJNWhG() {
        return (C56131xwy) this.uzCIH.getValue();
    }

    public final void OLrzqt(@NotNull WatchListData watchListData, MutableLiveData<BizResp> mutableLiveData) {
        Intrinsics.checkNotNullParameter(watchListData, "");
        this.wlaJM.OLrzqt(watchListData, mutableLiveData);
    }

    public static /* synthetic */ void removeWatchList$default(RankModel rankModel, WatchListData watchListData, MutableLiveData mutableLiveData, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeWatchList");
        }
        if ((i & 4) != 0) {
            z = true;
        }
        rankModel.KWHzl(watchListData, mutableLiveData, z);
    }

    public final void KWHzl(@NotNull WatchListData watchListData, MutableLiveData<BizResp> mutableLiveData, boolean z) {
        Intrinsics.checkNotNullParameter(watchListData, "");
        this.wlaJM.OLrzqt(watchListData, mutableLiveData, z);
    }

    public final WatchListData OLrzqt(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new WatchListData((String) null, (String) null, str, str2, (String) null, (String) null, (String) null, (String) null, 243, (DefaultConstructorMarker) null);
    }

    public final InterfaceC58217yxC OLrzqt(@NotNull Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.wlaJM.AEQbTJ(function1);
        return null;
    }

    public final boolean AYXKKw(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        WatchListData watchListDataOLrzqt = OLrzqt(str, "SPOT");
        return watchListDataOLrzqt != null && this.wlaJM.EZpvd(watchListDataOLrzqt);
    }

    public final String OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (C33129mqd.OLrzqt((CharSequence) str)) {
                return (String) StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"-"}, false, 0, 6, (Object) null).get(0);
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public final String djBIcL(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (C33129mqd.OLrzqt((CharSequence) str) && StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"-"}, false, 0, 6, (Object) null).size() > 1) {
                return (String) StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"-"}, false, 0, 6, (Object) null).get(1);
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public static /* synthetic */ void setRankData$default(RankModel rankModel, String str, C55525xlb c55525xlb, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setRankData");
        }
        if ((i & 4) != 0) {
            str2 = str;
        }
        rankModel.EZpvd(str, c55525xlb, str2);
    }

    public final void EZpvd(@NotNull String str, @NotNull C55525xlb c55525xlb, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c55525xlb, "");
        c55525xlb.copydefault(OLrzqt(str));
        c55525xlb.KWHzl(djBIcL(str));
        if (!C33129mqd.OLrzqt((CharSequence) str2)) {
            c55525xlb.OLrzqt(djBIcL(str));
        } else if (str2 != null) {
            c55525xlb.OLrzqt(djBIcL(str2));
        }
    }

    public void bA_() {
        InterfaceC58217yxC interfaceC58217yxC = this.hDKMBd;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        Job job = this.getFieldNames;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        values();
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        Job job = this.fARcdN;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.wlaJM.bH_();
    }

    public final void AEQbTJ(List<String> list) {
        Job job = this.AubY;
        if (job == null || !job.isActive()) {
            Job job2 = this.AubY;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            this.AubY = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new RankModel$subscribeCupTicker$1(list, this, null), 3, null);
        }
    }

    public final void values() {
        Job job = this.AubY;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // o.InterfaceC55467xkW
    public TickersData copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (this.fIwbmz.get(str) == null && Intrinsics.EZpvd((Object) str, (Object) "USD")) {
            return qTI.Companion.KWHzl();
        }
        return this.fIwbmz.get(str);
    }

    public static /* synthetic */ Object copydefault(RankModel rankModel, Continuation<? super Unit> continuation) {
        Job job = rankModel.fARcdN;
        if (job == null) {
            return Unit.INSTANCE;
        }
        Object objJoin = job.join(continuation);
        return objJoin == C56442yFn.copydefault() ? objJoin : Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (C33129mqd.OLrzqt((CharSequence) obj)) {
                arrayList.add(obj);
            }
        }
        if (list.isEmpty()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new RankModel$initCupProvider$1(this, arrayList, null), 3, null);
    }
}
