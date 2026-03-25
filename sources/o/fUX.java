package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.wallet.tee.converter.viewmodel.SmallAssetsConverterViewModel$1;
import com.okinc.business.defi.wallet.tee.converter.viewmodel.SmallAssetsConverterViewModel$checkRepeatFlow$1;
import com.okinc.business.defi.wallet.tee.converter.viewmodel.SmallAssetsConverterViewModel$checkRepeatFlow$2;
import com.okinc.business.defi.wallet.tee.converter.viewmodel.SmallAssetsConverterViewModel$loadNextPageAndQuote$1;
import com.okinc.business.defi.wallet.tee.converter.viewmodel.SmallAssetsConverterViewModel$maxQuote$3;
import com.okinc.business.defi.wallet.tee.converter.viewmodel.SmallAssetsConverterViewModel$quoteFlow$1;
import com.okinc.business.defi.wallet.tee.converter.viewmodel.SmallAssetsConverterViewModel$quoteFlow$2;
import com.okinc.business.defi.wallet.tee.converter.viewmodel.SmallAssetsConverterViewModel$quoteFlow$3;
import com.okinc.business.defi.wallet.tee.converter.viewmodel.SmallAssetsConverterViewModel$quoteFlow$4;
import com.okinc.business.defi.wallet.tee.converter.viewmodel.SmallAssetsConverterViewModel$quoteFlow$5;
import com.okinc.business.defi.wallet.tee.converter.viewmodel.SmallAssetsConverterViewModel$refreshQuote$1;
import com.okinc.business.defi.wallet.tee.converter.viewmodel.SmallAssetsConverterViewModel$special$$inlined$filter$1$2$1;
import com.okinc.business.defi.wallet.tee.converter.viewmodel.SmallAssetsConverterViewModel$special$$inlined$filter$2$2$1;
import com.okinc.business.defi.wallet.tee.converter.viewmodel.SmallAssetsConverterViewModel$special$$inlined$map$1$2$1;
import com.okinc.business.defi.wallet.tee.converter.viewmodel.SmallAssetsConverterViewModel$special$$inlined$map$2$2$1;
import com.okinc.business.defi.wallet.tee.converter.viewmodel.SmallAssetsConverterViewModel$special$$inlined$map$3$2$1;
import com.okinc.business.defi.wallet.tee.converter.viewmodel.SmallAssetsConverterViewModel$submitOrder$1;
import com.okinc.business.defi.wallet.tee.converter.viewmodel.SmallAssetsConverterViewModel$tokenAssetsFlow$2;
import com.okinc.business.defi.wallet.tee.converter.viewmodel.SmallAssetsConverterViewModel$tokenAssetsFlow$3;
import com.okinc.business.defi.wallet.tee.converter.viewmodel.SmallAssetsConverterViewModel$tokenAssetsFlow$4;
import com.okinc.business.dex.api.bean.sa_small_assets.CheckRepeatParam;
import com.okinc.business.dex.api.bean.sa_small_assets.CheckRepeatResult;
import com.okinc.business.dex.api.bean.sa_small_assets.DustToken;
import com.okinc.business.dex.api.bean.sa_small_assets.DustTokenQuoteParam;
import com.okinc.business.dex.api.bean.sa_small_assets.SmallAssetOrderParam;
import com.okinc.business.dex.api.bean.sa_small_assets.SmallAssetQuoteData;
import com.okinc.network.okg.response.OKServerException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC43419rot;
import o.C17862fVa;
import o.fTZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class fUX extends ViewModel {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public static final java.util.List<java.lang.String> OLrzqt = yDY.gEmmrt("0.1", "0.2", "0.3");
    public static final yIY<java.lang.Double> copydefault = C56547yJk.copydefault(0.001d, 10.0d);
    public final MutableStateFlow<java.lang.String> AEQbTJ;
    public final MutableStateFlow<java.lang.Integer> AYXKKw;
    public final MutableStateFlow<fTY> AhwBna;
    public final MutableStateFlow<java.lang.String> AkhnZx;
    public final long AuCTel;
    public final MutableStateFlow<java.lang.Boolean> AuCTelauCTel;
    public final StateFlow<AbstractC43419rot<SmallAssetQuoteData, OKServerException>> AubY;
    public final SharedFlow<java.lang.String> AwvSrB;
    public final SharedFlow<AbstractC43419rot<Unit, OKServerException>> AxsJAY;
    public final C12827cuN DTwDnp;
    public final MutableSharedFlow<AbstractC43419rot<Unit, OKServerException>> DbNXlk;
    public final MutableStateFlow<java.lang.Integer> EZpvd;
    public final MutableSharedFlow<java.lang.Integer> djBIcL;
    public final StateFlow<kotlin.Pair<AbstractC12782ctV, CheckRepeatResult>> ejfBZ;
    public final Flow<AbstractC43419rot<CheckRepeatResult, OKServerException>> fARcdN;
    public final C10948byA fIwbmz;
    public final fUY fJNWhG;
    public final StateFlow<java.lang.String> fetchVPNInfo;
    public final MutableStateFlow<java.lang.Boolean> gEmmrt;
    public final StateFlow<C17862fVa.TaskDescription> gHZMYf;
    public final gKO getFieldNames;
    public final C17862fVa getNewProxyInstance;
    public final SharedFlow<java.lang.Integer> hDKMBd;
    public java.util.List<fTZ.Application> isConnected;
    public final StateFlow<fTY> iwGUEr;
    public final StateFlow<java.lang.String> sSMYrx;
    public final CoroutineDispatcher uzCIH;
    public final MutableSharedFlow<java.lang.String> valueOf;
    public final MutableStateFlow<AbstractC12782ctV> values;
    public final StateFlow<java.lang.Boolean> wlaJM;
    public final MutableStateFlow<java.lang.Integer> zLjUOn;
    public final MutableStateFlow<java.lang.Integer> zsXlph;
    public final StateFlow<AbstractC12782ctV> zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<AbstractC43419rot<CheckRepeatResult, OKServerException>> AYXKKw() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.String> AkhnZx() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.Boolean> DbNXlk() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.String> EZpvd() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C17862fVa.TaskDescription> ejfBZ() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC12782ctV> fARcdN() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AbstractC43419rot<Unit, OKServerException>> fJNWhG() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<java.lang.String> fetchVPNInfo() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long gEmmrt() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<fTY> isConnected() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<kotlin.Pair<AbstractC12782ctV, CheckRepeatResult>> valueOf() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC43419rot<SmallAssetQuoteData, OKServerException>> values() {
        return this.AubY;
    }

    public static final class ActionBar implements Flow<AbstractC12782ctV> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.fUX$ActionBar$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SmallAssetsConverterViewModel$special$$inlined$filter$2$2$1 smallAssetsConverterViewModel$special$$inlined$filter$2$2$1;
                if (continuation instanceof SmallAssetsConverterViewModel$special$$inlined$filter$2$2$1) {
                    smallAssetsConverterViewModel$special$$inlined$filter$2$2$1 = (SmallAssetsConverterViewModel$special$$inlined$filter$2$2$1) continuation;
                    int i = smallAssetsConverterViewModel$special$$inlined$filter$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        smallAssetsConverterViewModel$special$$inlined$filter$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        smallAssetsConverterViewModel$special$$inlined$filter$2$2$1 = new SmallAssetsConverterViewModel$special$$inlined$filter$2$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = smallAssetsConverterViewModel$special$$inlined$filter$2$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = smallAssetsConverterViewModel$special$$inlined$filter$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    if (((AbstractC12782ctV) obj).AubY()) {
                        smallAssetsConverterViewModel$special$$inlined$filter$2$2$1.label = 1;
                        if (flowCollector.emit(obj, smallAssetsConverterViewModel$special$$inlined$filter$2$2$1) == objCopydefault) {
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

        public ActionBar(Flow flow) {
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super AbstractC12782ctV> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class Activity implements Flow<java.lang.Integer> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: o.fUX$Activity$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SmallAssetsConverterViewModel$special$$inlined$filter$1$2$1 smallAssetsConverterViewModel$special$$inlined$filter$1$2$1;
                if (continuation instanceof SmallAssetsConverterViewModel$special$$inlined$filter$1$2$1) {
                    smallAssetsConverterViewModel$special$$inlined$filter$1$2$1 = (SmallAssetsConverterViewModel$special$$inlined$filter$1$2$1) continuation;
                    int i = smallAssetsConverterViewModel$special$$inlined$filter$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        smallAssetsConverterViewModel$special$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        smallAssetsConverterViewModel$special$$inlined$filter$1$2$1 = new SmallAssetsConverterViewModel$special$$inlined$filter$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = smallAssetsConverterViewModel$special$$inlined$filter$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = smallAssetsConverterViewModel$special$$inlined$filter$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    if (((java.lang.Number) obj).intValue() != 0) {
                        smallAssetsConverterViewModel$special$$inlined$filter$1$2$1.label = 1;
                        if (flowCollector.emit(obj, smallAssetsConverterViewModel$special$$inlined$filter$1$2$1) == objCopydefault) {
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

        public Activity(Flow flow) {
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.lang.Integer> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class FragmentManager implements Flow<C17862fVa.TaskDescription> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.fUX$FragmentManager$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SmallAssetsConverterViewModel$special$$inlined$map$2$2$1 smallAssetsConverterViewModel$special$$inlined$map$2$2$1;
                if (continuation instanceof SmallAssetsConverterViewModel$special$$inlined$map$2$2$1) {
                    smallAssetsConverterViewModel$special$$inlined$map$2$2$1 = (SmallAssetsConverterViewModel$special$$inlined$map$2$2$1) continuation;
                    int i = smallAssetsConverterViewModel$special$$inlined$map$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        smallAssetsConverterViewModel$special$$inlined$map$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        smallAssetsConverterViewModel$special$$inlined$map$2$2$1 = new SmallAssetsConverterViewModel$special$$inlined$map$2$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = smallAssetsConverterViewModel$special$$inlined$map$2$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = smallAssetsConverterViewModel$special$$inlined$map$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    kotlin.Pair pair = (kotlin.Pair) obj;
                    C17862fVa.TaskDescription taskDescription = pair != null ? (C17862fVa.TaskDescription) pair.getSecond() : null;
                    smallAssetsConverterViewModel$special$$inlined$map$2$2$1.label = 1;
                    if (flowCollector.emit(taskDescription, smallAssetsConverterViewModel$special$$inlined$map$2$2$1) == objCopydefault) {
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

        public FragmentManager(Flow flow) {
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super C17862fVa.TaskDescription> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class PendingIntent implements Flow<AbstractC43419rot<? extends SmallAssetQuoteData, ? extends OKServerException>> {
        public final /* synthetic */ fUX EZpvd;
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.fUX$PendingIntent$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ fUX AEQbTJ;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector, fUX fux) {
                this.copydefault = flowCollector;
                this.AEQbTJ = fux;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SmallAssetsConverterViewModel$special$$inlined$map$3$2$1 smallAssetsConverterViewModel$special$$inlined$map$3$2$1;
                FlowCollector flowCollector;
                kotlin.Pair pair;
                if (continuation instanceof SmallAssetsConverterViewModel$special$$inlined$map$3$2$1) {
                    smallAssetsConverterViewModel$special$$inlined$map$3$2$1 = (SmallAssetsConverterViewModel$special$$inlined$map$3$2$1) continuation;
                    int i = smallAssetsConverterViewModel$special$$inlined$map$3$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        smallAssetsConverterViewModel$special$$inlined$map$3$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        smallAssetsConverterViewModel$special$$inlined$map$3$2$1 = new SmallAssetsConverterViewModel$special$$inlined$map$3$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = smallAssetsConverterViewModel$special$$inlined$map$3$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = smallAssetsConverterViewModel$special$$inlined$map$3$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    flowCollector = this.copydefault;
                    pair = (kotlin.Pair) obj;
                    MutableStateFlow mutableStateFlow = this.AEQbTJ.gEmmrt;
                    java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(false);
                    smallAssetsConverterViewModel$special$$inlined$map$3$2$1.L$0 = flowCollector;
                    smallAssetsConverterViewModel$special$$inlined$map$3$2$1.L$1 = pair;
                    smallAssetsConverterViewModel$special$$inlined$map$3$2$1.label = 1;
                    if (mutableStateFlow.emit(boolKWHzl, smallAssetsConverterViewModel$special$$inlined$map$3$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                        return Unit.INSTANCE;
                    }
                    pair = (kotlin.Pair) smallAssetsConverterViewModel$special$$inlined$map$3$2$1.L$1;
                    flowCollector = (FlowCollector) smallAssetsConverterViewModel$special$$inlined$map$3$2$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                }
                AbstractC43419rot abstractC43419rot = pair != null ? (AbstractC43419rot) pair.getSecond() : null;
                smallAssetsConverterViewModel$special$$inlined$map$3$2$1.L$0 = null;
                smallAssetsConverterViewModel$special$$inlined$map$3$2$1.L$1 = null;
                smallAssetsConverterViewModel$special$$inlined$map$3$2$1.label = 2;
                if (flowCollector.emit(abstractC43419rot, smallAssetsConverterViewModel$special$$inlined$map$3$2$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        }

        public PendingIntent(Flow flow, fUX fux) {
            this.copydefault = flow;
            this.EZpvd = fux;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super AbstractC43419rot<? extends SmallAssetQuoteData, ? extends OKServerException>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass2(flowCollector, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class StateListAnimator implements Flow<AbstractC43419rot<? extends CheckRepeatResult, ? extends OKServerException>> {
        public final /* synthetic */ fUX EZpvd;
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: o.fUX$StateListAnimator$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ fUX AEQbTJ;
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector, fUX fux) {
                this.OLrzqt = flowCollector;
                this.AEQbTJ = fux;
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x0076 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SmallAssetsConverterViewModel$special$$inlined$map$1$2$1 smallAssetsConverterViewModel$special$$inlined$map$1$2$1;
                FlowCollector flowCollector;
                AbstractC43419rot abstractC43419rot;
                FlowCollector flowCollector2;
                if (continuation instanceof SmallAssetsConverterViewModel$special$$inlined$map$1$2$1) {
                    smallAssetsConverterViewModel$special$$inlined$map$1$2$1 = (SmallAssetsConverterViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = smallAssetsConverterViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        smallAssetsConverterViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        smallAssetsConverterViewModel$special$$inlined$map$1$2$1 = new SmallAssetsConverterViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = smallAssetsConverterViewModel$special$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = smallAssetsConverterViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    flowCollector = this.OLrzqt;
                    ((java.lang.Number) obj).intValue();
                    AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) this.AEQbTJ.values.getValue();
                    if (abstractC12782ctV == null) {
                        abstractC43419rot = null;
                        smallAssetsConverterViewModel$special$$inlined$map$1$2$1.L$0 = null;
                        smallAssetsConverterViewModel$special$$inlined$map$1$2$1.label = 2;
                        if (flowCollector.emit(abstractC43419rot, smallAssetsConverterViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                    fUX fux = this.AEQbTJ;
                    smallAssetsConverterViewModel$special$$inlined$map$1$2$1.L$0 = flowCollector;
                    smallAssetsConverterViewModel$special$$inlined$map$1$2$1.label = 1;
                    java.lang.Object objOLrzqt = fux.OLrzqt(abstractC12782ctV, smallAssetsConverterViewModel$special$$inlined$map$1$2$1);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    obj2 = objOLrzqt;
                    flowCollector2 = flowCollector;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                        return Unit.INSTANCE;
                    }
                    flowCollector2 = (FlowCollector) smallAssetsConverterViewModel$special$$inlined$map$1$2$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                }
                AbstractC43419rot abstractC43419rot2 = (AbstractC43419rot) obj2;
                flowCollector = flowCollector2;
                abstractC43419rot = abstractC43419rot2;
                smallAssetsConverterViewModel$special$$inlined$map$1$2$1.L$0 = null;
                smallAssetsConverterViewModel$special$$inlined$map$1$2$1.label = 2;
                if (flowCollector.emit(abstractC43419rot, smallAssetsConverterViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
        }

        public StateListAnimator(Flow flow, fUX fux) {
            this.KWHzl = flow;
            this.EZpvd = fux;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super AbstractC43419rot<? extends CheckRepeatResult, ? extends OKServerException>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass2(flowCollector, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public fUX(@NotNull C12827cuN c12827cuN, @NotNull C10948byA c10948byA, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C17862fVa c17862fVa, @NotNull fUY fuy, @NotNull gKO gko) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(c10948byA, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c17862fVa, "");
        Intrinsics.checkNotNullParameter(fuy, "");
        Intrinsics.checkNotNullParameter(gko, "");
        this.DTwDnp = c12827cuN;
        this.fIwbmz = c10948byA;
        this.uzCIH = coroutineDispatcher;
        this.getNewProxyInstance = c17862fVa;
        this.fJNWhG = fuy;
        this.getFieldNames = gko;
        this.AuCTel = 501L;
        MutableStateFlow<java.lang.String> MutableStateFlow = StateFlowKt.MutableStateFlow("0");
        this.AEQbTJ = MutableStateFlow;
        this.fetchVPNInfo = MutableStateFlow;
        MutableStateFlow<AbstractC12782ctV> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.values = MutableStateFlow2;
        this.zuBGHE = MutableStateFlow2;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SmallAssetsConverterViewModel$1(this, null), 3, null);
        MutableStateFlow<java.lang.Integer> MutableStateFlow3 = StateFlowKt.MutableStateFlow(0);
        this.EZpvd = MutableStateFlow3;
        Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.combine(KWHzl(FlowKt.filterNotNull(MutableStateFlow2)), MutableStateFlow3, new SmallAssetsConverterViewModel$checkRepeatFlow$1(null)), new SmallAssetsConverterViewModel$checkRepeatFlow$2(this, null));
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        this.ejfBZ = FlowKt.stateIn(flowTransformLatest, viewModelScope, SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), null);
        MutableStateFlow<java.lang.Integer> MutableStateFlow4 = StateFlowKt.MutableStateFlow(0);
        this.AYXKKw = MutableStateFlow4;
        this.fARcdN = new StateListAnimator(new Activity(MutableStateFlow4), this);
        MutableStateFlow<java.lang.Integer> MutableStateFlow5 = StateFlowKt.MutableStateFlow(0);
        this.zLjUOn = MutableStateFlow5;
        MutableStateFlow<fTY> MutableStateFlow6 = StateFlowKt.MutableStateFlow(new fTY(0, 0, false, false, null, null, null, 127, null));
        this.AhwBna = MutableStateFlow6;
        this.iwGUEr = MutableStateFlow6;
        MutableSharedFlow<java.lang.Integer> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.djBIcL = mutableSharedFlowMutableSharedFlow$default;
        this.hDKMBd = mutableSharedFlowMutableSharedFlow$default;
        this.isConnected = new java.util.ArrayList();
        this.gHZMYf = FlowKt.stateIn(new FragmentManager(FlowKt.scan(FlowKt.transformLatest(FlowKt.combine(KWHzl(new ActionBar(FlowKt.filterNotNull(MutableStateFlow2))), MutableStateFlow5, new SmallAssetsConverterViewModel$tokenAssetsFlow$2(null)), new SmallAssetsConverterViewModel$tokenAssetsFlow$3(this, null)), null, new SmallAssetsConverterViewModel$tokenAssetsFlow$4(this, null))), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), null);
        MutableStateFlow<java.lang.String> MutableStateFlow7 = StateFlowKt.MutableStateFlow(CollectionsKt___CollectionsKt.AuCTelauCTel(OLrzqt));
        this.AkhnZx = MutableStateFlow7;
        this.sSMYrx = MutableStateFlow7;
        MutableStateFlow<java.lang.Integer> MutableStateFlow8 = StateFlowKt.MutableStateFlow(0);
        this.zsXlph = MutableStateFlow8;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        MutableStateFlow<java.lang.Boolean> MutableStateFlow9 = StateFlowKt.MutableStateFlow(bool);
        this.AuCTelauCTel = MutableStateFlow9;
        MutableStateFlow<java.lang.Boolean> MutableStateFlow10 = StateFlowKt.MutableStateFlow(bool);
        this.gEmmrt = MutableStateFlow10;
        this.wlaJM = MutableStateFlow10;
        this.AubY = FlowKt.stateIn(new PendingIntent(FlowKt.scan(FlowKt.transformLatest(FlowKt.combine(MutableStateFlow6, FlowKt.transformLatest(FlowKt.combine(MutableStateFlow8, MutableStateFlow7, MutableStateFlow9, new SmallAssetsConverterViewModel$quoteFlow$1(null)), new SmallAssetsConverterViewModel$quoteFlow$2(this, null)), new SmallAssetsConverterViewModel$quoteFlow$3(null)), new SmallAssetsConverterViewModel$quoteFlow$4(this, null)), null, new SmallAssetsConverterViewModel$quoteFlow$5(null)), this), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), null);
        MutableSharedFlow<java.lang.String> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.valueOf = mutableSharedFlowMutableSharedFlow$default2;
        this.AwvSrB = mutableSharedFlowMutableSharedFlow$default2;
        MutableSharedFlow<AbstractC43419rot<Unit, OKServerException>> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.DbNXlk = mutableSharedFlowMutableSharedFlow$default3;
        this.AxsJAY = mutableSharedFlowMutableSharedFlow$default3;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fUX.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final java.util.List<java.lang.String> EZpvd() {
            return fUX.OLrzqt;
        }
    }

    public final C10854bwM djBIcL() {
        return this.fIwbmz.copydefault(this.AuCTel);
    }

    public static final boolean OLrzqt(AbstractC12782ctV abstractC12782ctV, AbstractC12782ctV abstractC12782ctV2) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV2, "");
        return Intrinsics.EZpvd((java.lang.Object) abstractC12782ctV.DbNXlk(), (java.lang.Object) abstractC12782ctV2.DbNXlk());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlinx.coroutines.flow.Flow<? extends o.ctV> */
    /* JADX WARN: Multi-variable type inference failed */
    public final Flow<AbstractC12782ctV> KWHzl(Flow<? extends AbstractC12782ctV> flow) {
        FlowKt.distinctUntilChanged(flow, new Function2() { // from class: o.fUZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(fUX.OLrzqt((AbstractC12782ctV) obj, (AbstractC12782ctV) obj2));
            }
        });
        return flow;
    }

    public final void KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        this.values.setValue(abstractC12782ctV);
    }

    public final java.lang.Object OLrzqt(AbstractC12782ctV abstractC12782ctV, Continuation<? super AbstractC43419rot<CheckRepeatResult, OKServerException>> continuation) {
        gKO gko = this.getFieldNames;
        java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
        long j = this.AuCTel;
        ChainAddress chainAddressEZpvd = abstractC12782ctV.EZpvd(j, (java.lang.Integer) null);
        java.lang.String address = chainAddressEZpvd != null ? chainAddressEZpvd.getAddress() : null;
        if (address == null) {
            address = "";
        }
        return gko.KWHzl(new CheckRepeatParam(strDbNXlk, java.lang.String.valueOf(j), address), continuation);
    }

    public final void AuCTel() {
        boolean z = !this.isConnected.isEmpty();
        this.AhwBna.setValue(new fTY(0, 50, false, z, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.isConnected), yDY.AhwBna(), yDY.AhwBna()));
        if (z) {
            fIwbmz();
        }
    }

    public final void fIwbmz() {
        int iCopydefault;
        fTY value = this.AhwBna.getValue();
        if (!value.AEQbTJ() && (iCopydefault = value.copydefault() * 50) < this.isConnected.size()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SmallAssetsConverterViewModel$loadNextPageAndQuote$1(this, iCopydefault, null), 3, null);
        }
    }

    public final java.lang.Object copydefault(java.util.List<fTZ.Application> list, Continuation<? super AbstractC43419rot<SmallAssetQuoteData, OKServerException>> continuation) {
        ChainAddress chainAddressEZpvd;
        java.lang.String address = null;
        if (list.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (fTZ.Application application : list) {
            arrayList.add(new DustToken(application.AEQbTJ(), application.OLrzqt().OLrzqt()));
        }
        gKO gko = this.getFieldNames;
        long j = this.AuCTel;
        java.lang.String value = this.sSMYrx.getValue();
        AbstractC12782ctV value2 = this.zuBGHE.getValue();
        if (value2 != null && (chainAddressEZpvd = value2.EZpvd(this.AuCTel, (java.lang.Integer) null)) != null) {
            address = chainAddressEZpvd.getAddress();
        }
        return gko.AEQbTJ(new DustTokenQuoteParam(java.lang.String.valueOf(j), arrayList, value, "CUSTOM", "11111111111111111111111111111111", address == null ? "" : address), continuation);
    }

    public final java.util.List<fTZ.Application> OLrzqt(java.util.List<fTZ.Application> list, AbstractC43419rot<SmallAssetQuoteData, OKServerException> abstractC43419rot) {
        if (abstractC43419rot != null && !abstractC43419rot.OLrzqt()) {
            SmallAssetQuoteData smallAssetQuoteDataAEQbTJ = abstractC43419rot.AEQbTJ();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (fTZ.Application application : list) {
                arrayList.add(fTZ.Application.copy$default(application, smallAssetQuoteDataAEQbTJ.getQuotes().containsKey(application.OLrzqt().OLrzqt()), false, null, null, null, 30, null));
            }
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(fTZ.Application.copy$default((fTZ.Application) it.next(), false, false, null, null, null, 30, null));
        }
        return arrayList2;
    }

    public final java.util.List<fTZ.Application> AhwBna() {
        return this.AhwBna.getValue().OLrzqt();
    }

    public final void getNewProxyInstance() {
        java.lang.Integer value;
        this.isConnected.clear();
        this.AhwBna.setValue(new fTY(0, 0, false, false, null, null, null, 127, null));
        MutableStateFlow<java.lang.Integer> mutableStateFlow = this.zLjUOn;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, java.lang.Integer.valueOf(value.intValue() + 1)));
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AkhnZx.setValue(str);
    }

    public final void uzCIH() {
        this.AuCTelauCTel.setValue(java.lang.Boolean.TRUE);
    }

    public final void iwGUEr() {
        this.AuCTelauCTel.setValue(java.lang.Boolean.FALSE);
    }

    public final void EZpvd(boolean z) {
        java.util.List<fTZ.Application> listKWHzl = this.AhwBna.getValue().KWHzl();
        if (listKWHzl.isEmpty()) {
            return;
        }
        int i = 0;
        if (z) {
            if (!listKWHzl.isEmpty()) {
                java.util.Iterator<T> it = listKWHzl.iterator();
                while (it.hasNext()) {
                    if (((fTZ.Application) it.next()).copydefault() && (i = i + 1) < 0) {
                        yDY.djBIcL();
                    }
                }
            }
            int i2 = 50 - i;
            for (fTZ.Application application : listKWHzl) {
                if (i2 == 0) {
                    break;
                } else if (!application.copydefault()) {
                    application.AEQbTJ(true);
                    i2--;
                }
            }
        } else {
            java.util.Iterator<T> it2 = listKWHzl.iterator();
            while (it2.hasNext()) {
                ((fTZ.Application) it2.next()).AEQbTJ(false);
            }
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SmallAssetsConverterViewModel$maxQuote$3(this, null), 3, null);
    }

    public static final class TaskDescription {
        public final boolean AEQbTJ;
        public final boolean EZpvd;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = taskDescription.AEQbTJ;
            }
            if ((i & 2) != 0) {
                z2 = taskDescription.EZpvd;
            }
            if ((i & 4) != 0) {
                z3 = taskDescription.copydefault;
            }
            return taskDescription.KWHzl(z, z2, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(boolean z, boolean z2, boolean z3) {
            return new TaskDescription(z, z2, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return this.AEQbTJ == taskDescription.AEQbTJ && this.EZpvd == taskDescription.EZpvd && this.copydefault == taskDescription.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((java.lang.Boolean.hashCode(this.AEQbTJ) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "RefreshQuoteResult(isSuccess=" + this.AEQbTJ + ", isEmpty=" + this.EZpvd + ", isMax=" + this.copydefault + ")";
        }

        public TaskDescription(boolean z, boolean z2, boolean z3) {
            this.AEQbTJ = z;
            this.EZpvd = z2;
            this.copydefault = z3;
        }
    }

    public final TaskDescription hDKMBd() {
        int i;
        java.util.List<fTZ.Application> listKWHzl = this.AhwBna.getValue().KWHzl();
        if (listKWHzl.isEmpty()) {
            return new TaskDescription(false, false, false);
        }
        if (listKWHzl.isEmpty()) {
            i = 0;
        } else {
            java.util.Iterator<T> it = listKWHzl.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((fTZ.Application) it.next()).copydefault() && (i = i + 1) < 0) {
                    yDY.djBIcL();
                }
            }
        }
        boolean z = i <= 50;
        if (z) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SmallAssetsConverterViewModel$refreshQuote$1(this, null), 3, null);
        }
        return new TaskDescription(z, i == 0, i >= 50 || i == listKWHzl.size());
    }

    public final java.lang.Object OLrzqt(@NotNull Continuation<? super Unit> continuation) {
        AbstractC43419rot<SmallAssetQuoteData, OKServerException> value;
        SmallAssetQuoteData smallAssetQuoteDataCopydefault;
        AbstractC12782ctV value2 = this.zuBGHE.getValue();
        if (value2 != null && (value = this.AubY.getValue()) != null && (smallAssetQuoteDataCopydefault = value.copydefault()) != null) {
            MutableSharedFlow<java.lang.String> mutableSharedFlow = this.valueOf;
            fUY fuy = this.fJNWhG;
            ChainAddress chainAddressEZpvd = value2.EZpvd(this.AuCTel, (java.lang.Integer) null);
            java.lang.String address = chainAddressEZpvd != null ? chainAddressEZpvd.getAddress() : null;
            if (address == null) {
                address = "";
            }
            java.lang.Object objEmit = mutableSharedFlow.emit(fuy.OLrzqt(address, smallAssetQuoteDataCopydefault), continuation);
            return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        SmallAssetsConverterViewModel$submitOrder$1 smallAssetsConverterViewModel$submitOrder$1;
        AbstractC43419rot<SmallAssetQuoteData, OKServerException> value;
        MutableSharedFlow<AbstractC43419rot<Unit, OKServerException>> mutableSharedFlow;
        AbstractC43419rot<Unit, OKServerException> actionBar;
        if (continuation instanceof SmallAssetsConverterViewModel$submitOrder$1) {
            smallAssetsConverterViewModel$submitOrder$1 = (SmallAssetsConverterViewModel$submitOrder$1) continuation;
            int i = smallAssetsConverterViewModel$submitOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                smallAssetsConverterViewModel$submitOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                smallAssetsConverterViewModel$submitOrder$1 = new SmallAssetsConverterViewModel$submitOrder$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = smallAssetsConverterViewModel$submitOrder$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = smallAssetsConverterViewModel$submitOrder$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            AbstractC12782ctV value2 = this.zuBGHE.getValue();
            if (value2 != null && (value = this.AubY.getValue()) != null) {
                if (value instanceof AbstractC43419rot.StateListAnimator) {
                    SmallAssetQuoteData smallAssetQuoteData = (SmallAssetQuoteData) ((AbstractC43419rot.StateListAnimator) value).KWHzl();
                    MutableSharedFlow<AbstractC43419rot<Unit, OKServerException>> mutableSharedFlow2 = this.DbNXlk;
                    gKO gko = this.getFieldNames;
                    java.lang.String quoteId = smallAssetQuoteData.getQuoteId();
                    java.lang.String value3 = this.sSMYrx.getValue();
                    long j = this.AuCTel;
                    java.lang.String strDbNXlk = value2.DbNXlk();
                    java.lang.String strEjfBZ = value2.ejfBZ();
                    ChainAddress chainAddressEZpvd = value2.EZpvd(this.AuCTel, (java.lang.Integer) null);
                    java.lang.String address = chainAddressEZpvd != null ? chainAddressEZpvd.getAddress() : null;
                    if (address == null) {
                        address = "";
                    }
                    SmallAssetOrderParam smallAssetOrderParam = new SmallAssetOrderParam(quoteId, value3, "CUSTOM", java.lang.String.valueOf(j), "11111111111111111111111111111111", strDbNXlk, strEjfBZ, address, str, str2, smallAssetQuoteData.getQuotes());
                    smallAssetsConverterViewModel$submitOrder$1.L$0 = mutableSharedFlow2;
                    smallAssetsConverterViewModel$submitOrder$1.label = 1;
                    objKWHzl = gko.KWHzl(smallAssetOrderParam, smallAssetsConverterViewModel$submitOrder$1);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                    mutableSharedFlow = mutableSharedFlow2;
                } else {
                    if (value instanceof AbstractC43419rot.ActionBar) {
                        new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) value).KWHzl());
                        return Unit.INSTANCE;
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
            new AbstractC43419rot.StateListAnimator(Unit.INSTANCE);
            return Unit.INSTANCE;
        }
        mutableSharedFlow = (MutableSharedFlow) smallAssetsConverterViewModel$submitOrder$1.L$0;
        C56391yDq.AEQbTJ(objKWHzl);
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objKWHzl;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            actionBar = new AbstractC43419rot.StateListAnimator<>(Unit.INSTANCE);
        } else {
            if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            actionBar = new AbstractC43419rot.ActionBar<>(((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl());
        }
        smallAssetsConverterViewModel$submitOrder$1.L$0 = null;
        smallAssetsConverterViewModel$submitOrder$1.label = 2;
        if (mutableSharedFlow.emit(actionBar, smallAssetsConverterViewModel$submitOrder$1) == objCopydefault) {
            return objCopydefault;
        }
        new AbstractC43419rot.StateListAnimator(Unit.INSTANCE);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        java.lang.Integer value;
        MutableStateFlow<java.lang.Integer> mutableStateFlow = this.EZpvd;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, java.lang.Integer.valueOf(value.intValue() + 1)));
    }

    public final void KWHzl() {
        java.lang.Integer value;
        MutableStateFlow<java.lang.Integer> mutableStateFlow = this.AYXKKw;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, java.lang.Integer.valueOf(value.intValue() + 1)));
    }
}
