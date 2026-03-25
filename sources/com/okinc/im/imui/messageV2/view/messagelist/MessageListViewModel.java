package com.okinc.im.imui.messageV2.view.messagelist;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ibm.icu.text.DateFormat;
import com.okinc.core.util.SPUtils;
import com.okinc.im.imui.messageV2.model.StringResource;
import com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel;
import com.okinc.okimcore.feature.config.TypingIndicatorConfig;
import com.okinc.okimcore.model.im.DisbandGroupMessage;
import com.okinc.okimcore.model.im.MessengerConnectionStatus;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKTypingIndicatorMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionData;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.remote.UserInfo;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import com.okinc.okimcore.usecase.ObserveShowAgentProcessingFlow;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
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
import o.C32979mnm;
import o.C32989mnw;
import o.C33129mqd;
import o.C34168nTy;
import o.C34703nhO;
import o.C35249nrk;
import o.C35254nrp;
import o.C35747oCe;
import o.C35749oCg;
import o.C35858oGh;
import o.C35863oGm;
import o.C35872oGv;
import o.C36517ocU;
import o.C36556odG;
import o.C36558odI;
import o.C36561odL;
import o.C36576oda;
import o.C36588odm;
import o.C36593odr;
import o.C44157sFk;
import o.C44452sQi;
import o.C44454sQk;
import o.C44462sQs;
import o.C44464sQu;
import o.C44466sQw;
import o.C44467sQx;
import o.C44468sQy;
import o.C44469sQz;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC36507ocK;
import o.InterfaceC36522ocZ;
import o.InterfaceC36569odT;
import o.InterfaceC44291sKj;
import o.InterfaceC44293sKl;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.oCE;
import o.oCF;
import o.oCH;
import o.oCI;
import o.oCL;
import o.oDO;
import o.oDX;
import o.oEE;
import o.oGO;
import o.pUU;
import o.sDN;
import o.sKH;
import o.sQA;
import o.sQB;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageListViewModel extends ViewModel implements InterfaceC44291sKj, InterfaceC36507ocK, InterfaceC36522ocZ {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final StateFlow<Boolean> AEQbTJ;
    public final MutableLiveData<Boolean> AYXKKw;
    public final MutableStateFlow<Boolean> AhwBna;
    public ActionBar AkhnZx;
    public final C35872oGv AuCTel;
    public final LiveData<Boolean> AuCTelauCTel;
    public final LiveData<Boolean> AubY;
    public boolean AwvSrB;
    public final LiveData<Boolean> AxsJAY;
    public final LiveData<ActionBar> DTwDnp;
    public final MutableSharedFlow<String> DbNXlk;
    public final MutableLiveData<C32989mnw<Application>> EZpvd;
    public final MutableLiveData<Boolean> KWHzl;
    public final MutableLiveData<String> OLrzqt;
    public OKMessage ORxRYg;
    public final Map<Long, Long> OcIXYQ;
    public final LiveData<List<GroupMemberInfo>> QKVWgx;
    public final C34168nTy QOLQEE;
    public final sKH QUSxYX;
    public final C36593odr QVAiDq;
    public final oDX QbewEr;
    public final oCI QfsBiF;
    public final InterfaceC44293sKl RJOkX;
    public final C36561odL RcXXUw;
    public final C36576oda UeEOUB;
    public final oCH aKErDB;
    public final C35863oGm dNCPSb;
    public final MutableLiveData<Boolean> djBIcL;
    public final ObserveShowAgentProcessingFlow djSkpj;
    public String dvKsVJ;
    public final oEE dxcTrN;
    public final C36517ocU ejfBZ;
    public Job fARcdN;
    public final LiveData<RelationInfo> fFgQHt;
    public final LiveData<OKConversation> fIwbmz;
    public final oCF fJNWhG;
    public final SharedFlow<String> fZBcTu;
    public final MediatorLiveData<ActionBar> fetchVPNInfo;
    public final C36561odL finit;
    public final oCL flVtFt;
    public String fvQaOB;
    public final MutableLiveData<Boolean> gEmmrt;
    public OKConversationType gGvvIC;
    public final StateFlow<Boolean> gHZMYf;
    public final Channel<Function1<Continuation<? super Unit>, Object>> gasjUx;
    public final C35749oCg getFieldNames;
    public final C35858oGh getNewProxyInstance;
    public TypingIndicatorConfig giSNqX;
    public final Map<String, Long> gkJEwt;
    public final C35747oCe hDKMBd;
    public final LiveData<UserInfo> hUfVAv;
    public final LiveData<Pair<Boolean, Boolean>> iRxXKY;
    public final Object iZzfmt;
    public final LiveData<C32989mnw<Application>> isConnected;
    public final oCE iwGUEr;
    public boolean sSMYrx;
    public final oDO uzCIH;
    public final MutableLiveData<Boolean> valueOf;
    public final Context values;
    public final LiveData<Boolean> wlaJM;
    public final LiveData<Boolean> zLjUOn;
    public final LiveData<Boolean> zsXlph;
    public boolean zuBGHE;

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKConversationType.values().length];
            try {
                iArr[OKConversationType.GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OKConversationType.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> AYXKKw() {
        return this.fZBcTu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<ActionBar> AhwBna() {
        return this.DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(OKMessage oKMessage) {
        this.ORxRYg = oKMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> AuCTel() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> DbNXlk() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC44291sKj
    public void EZpvd(@NotNull C44462sQs c44462sQs) {
        Intrinsics.checkNotNullParameter(c44462sQs, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC44291sKj
    public void KWHzl(@NotNull C44466sQw c44466sQw) {
        Intrinsics.checkNotNullParameter(c44466sQw, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Application>> OLrzqt() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<UserInfo> djBIcL() {
        return this.hUfVAv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> ejfBZ() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> fIwbmz() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> fetchVPNInfo() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<OKConversation> gEmmrt() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> isConnected() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> values() {
        return this.wlaJM;
    }

    public static final class Fragment implements Flow<Pair<? extends GroupTagType, ? extends String>> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel$Fragment$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                MessageListViewModel$special$$inlined$map$1$2$1 messageListViewModel$special$$inlined$map$1$2$1;
                if (continuation instanceof MessageListViewModel$special$$inlined$map$1$2$1) {
                    messageListViewModel$special$$inlined$map$1$2$1 = (MessageListViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = messageListViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        messageListViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        messageListViewModel$special$$inlined$map$1$2$1 = new MessageListViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = messageListViewModel$special$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = messageListViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    OKConversation oKConversation = (OKConversation) obj;
                    Pair pairOLrzqt = C56390yDp.OLrzqt(oKConversation.getGroupType(), oKConversation.getTargetId());
                    messageListViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(pairOLrzqt, messageListViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
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

        public Fragment(Flow flow) {
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Pair<? extends GroupTagType, ? extends String>> flowCollector, Continuation continuation) {
            Object objCollect = this.OLrzqt.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class FragmentManager implements Flow<Pair<? extends GroupTagType, ? extends String>> {
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel$FragmentManager$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                MessageListViewModel$special$$inlined$filter$1$2$1 messageListViewModel$special$$inlined$filter$1$2$1;
                if (continuation instanceof MessageListViewModel$special$$inlined$filter$1$2$1) {
                    messageListViewModel$special$$inlined$filter$1$2$1 = (MessageListViewModel$special$$inlined$filter$1$2$1) continuation;
                    int i = messageListViewModel$special$$inlined$filter$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        messageListViewModel$special$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        messageListViewModel$special$$inlined$filter$1$2$1 = new MessageListViewModel$special$$inlined$filter$1$2$1(this, continuation);
                    }
                }
                Object obj2 = messageListViewModel$special$$inlined$filter$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = messageListViewModel$special$$inlined$filter$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    if (((GroupTagType) ((Pair) obj).component1()) == GroupTagType.OTC_AGENT) {
                        messageListViewModel$special$$inlined$filter$1$2$1.label = 1;
                        if (flowCollector.emit(obj, messageListViewModel$special$$inlined$filter$1$2$1) == objCopydefault) {
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

        public FragmentManager(Flow flow) {
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Pair<? extends GroupTagType, ? extends String>> flowCollector, Continuation continuation) {
            Object objCollect = this.EZpvd.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class LoaderManager implements Flow<Boolean> {
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel$LoaderManager$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                MessageListViewModel$special$$inlined$map$2$2$1 messageListViewModel$special$$inlined$map$2$2$1;
                if (continuation instanceof MessageListViewModel$special$$inlined$map$2$2$1) {
                    messageListViewModel$special$$inlined$map$2$2$1 = (MessageListViewModel$special$$inlined$map$2$2$1) continuation;
                    int i = messageListViewModel$special$$inlined$map$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        messageListViewModel$special$$inlined$map$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        messageListViewModel$special$$inlined$map$2$2$1 = new MessageListViewModel$special$$inlined$map$2$2$1(this, continuation);
                    }
                }
                Object obj2 = messageListViewModel$special$$inlined$map$2$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = messageListViewModel$special$$inlined$map$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    Boolean boolKWHzl = C56443yFo.KWHzl(((ObserveShowAgentProcessingFlow.AgentProcessingState) obj) == ObserveShowAgentProcessingFlow.AgentProcessingState.WORKING);
                    messageListViewModel$special$$inlined$map$2$2$1.label = 1;
                    if (flowCollector.emit(boolKWHzl, messageListViewModel$special$$inlined$map$2$2$1) == objCopydefault) {
                        return objCopydefault;
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

        public LoaderManager(Flow flow) {
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
            Object objCollect = this.EZpvd.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @yCM
    public MessageListViewModel(@NotNull InterfaceC36569odT interfaceC36569odT, @NotNull oGO ogo, @NotNull sKH skh, @NotNull InterfaceC44293sKl interfaceC44293sKl, @NotNull C36593odr c36593odr, @NotNull C35858oGh c35858oGh, @NotNull oCE oce, @NotNull oDO odo, @NotNull C35863oGm c35863oGm, @NotNull oCI oci, @NotNull oDX odx, @NotNull oCF ocf, @NotNull oCH och, @NotNull C34168nTy c34168nTy, @NotNull C35747oCe c35747oCe, @NotNull C35749oCg c35749oCg, @NotNull oCL ocl, @NotNull oEE oee, @NotNull C36517ocU c36517ocU, @NotNull C36576oda c36576oda, @NotNull ObserveShowAgentProcessingFlow observeShowAgentProcessingFlow, @NotNull C35872oGv c35872oGv, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(interfaceC36569odT, "");
        Intrinsics.checkNotNullParameter(ogo, "");
        Intrinsics.checkNotNullParameter(skh, "");
        Intrinsics.checkNotNullParameter(interfaceC44293sKl, "");
        Intrinsics.checkNotNullParameter(c36593odr, "");
        Intrinsics.checkNotNullParameter(c35858oGh, "");
        Intrinsics.checkNotNullParameter(oce, "");
        Intrinsics.checkNotNullParameter(odo, "");
        Intrinsics.checkNotNullParameter(c35863oGm, "");
        Intrinsics.checkNotNullParameter(oci, "");
        Intrinsics.checkNotNullParameter(odx, "");
        Intrinsics.checkNotNullParameter(ocf, "");
        Intrinsics.checkNotNullParameter(och, "");
        Intrinsics.checkNotNullParameter(c34168nTy, "");
        Intrinsics.checkNotNullParameter(c35747oCe, "");
        Intrinsics.checkNotNullParameter(c35749oCg, "");
        Intrinsics.checkNotNullParameter(ocl, "");
        Intrinsics.checkNotNullParameter(oee, "");
        Intrinsics.checkNotNullParameter(c36517ocU, "");
        Intrinsics.checkNotNullParameter(c36576oda, "");
        Intrinsics.checkNotNullParameter(observeShowAgentProcessingFlow, "");
        Intrinsics.checkNotNullParameter(c35872oGv, "");
        Intrinsics.checkNotNullParameter(context, "");
        this.QUSxYX = skh;
        this.RJOkX = interfaceC44293sKl;
        this.QVAiDq = c36593odr;
        this.getNewProxyInstance = c35858oGh;
        this.iwGUEr = oce;
        this.uzCIH = odo;
        this.dNCPSb = c35863oGm;
        this.QfsBiF = oci;
        this.QbewEr = odx;
        this.fJNWhG = ocf;
        this.aKErDB = och;
        this.QOLQEE = c34168nTy;
        this.hDKMBd = c35747oCe;
        this.getFieldNames = c35749oCg;
        this.flVtFt = ocl;
        this.dxcTrN = oee;
        this.ejfBZ = c36517ocU;
        this.UeEOUB = c36576oda;
        this.djSkpj = observeShowAgentProcessingFlow;
        this.AuCTel = c35872oGv;
        this.values = context;
        Boolean bool = Boolean.FALSE;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(bool);
        this.valueOf = mutableLiveData;
        this.zLjUOn = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>(bool);
        this.AYXKKw = mutableLiveData2;
        this.AubY = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>(bool);
        this.gEmmrt = mutableLiveData3;
        this.AxsJAY = mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4 = new MutableLiveData<>(bool);
        this.KWHzl = mutableLiveData4;
        this.AuCTelauCTel = mutableLiveData4;
        MutableLiveData<Boolean> mutableLiveData5 = new MutableLiveData<>(bool);
        this.djBIcL = mutableLiveData5;
        this.wlaJM = mutableLiveData5;
        MutableLiveData<String> mutableLiveData6 = new MutableLiveData<>();
        this.OLrzqt = mutableLiveData6;
        LiveData<OKConversation> liveDataSwitchMap = Transformations.switchMap(mutableLiveData6, new Function1() { // from class: o.omF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListViewModel.KWHzl(this.copydefault, (java.lang.String) obj);
            }
        });
        this.fIwbmz = liveDataSwitchMap;
        LiveData<RelationInfo> liveDataSwitchMap2 = Transformations.switchMap(mutableLiveData6, new Function1() { // from class: o.omM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListViewModel.djBIcL(this.AEQbTJ, (java.lang.String) obj);
            }
        });
        this.fFgQHt = liveDataSwitchMap2;
        LiveData<List<GroupMemberInfo>> liveDataSwitchMap3 = Transformations.switchMap(mutableLiveData6, new Function1() { // from class: o.omI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListViewModel.OLrzqt(this.copydefault, (java.lang.String) obj);
            }
        });
        this.QKVWgx = liveDataSwitchMap3;
        LiveData<UserInfo> liveDataAsLiveData$default = FlowLiveDataConversions.asLiveData$default(ogo.EZpvd(), (CoroutineContext) null, 0L, 3, (Object) null);
        this.hUfVAv = liveDataAsLiveData$default;
        LiveData<MessengerConnectionStatus> liveDataKWHzl = skh.KWHzl();
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveDataKWHzl, new StateListAnimator(new Function1() { // from class: o.omL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListViewModel.OLrzqt(mediatorLiveData, (MessengerConnectionStatus) obj);
            }
        }));
        this.iRxXKY = mediatorLiveData;
        MutableLiveData<C32989mnw<Application>> mutableLiveData7 = new MutableLiveData<>();
        this.EZpvd = mutableLiveData7;
        this.isConnected = mutableLiveData7;
        MediatorLiveData<ActionBar> mediatorLiveData2 = new MediatorLiveData<>();
        mediatorLiveData2.addSource(liveDataSwitchMap2, new StateListAnimator(new Function1() { // from class: o.omN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListViewModel.copydefault(this.EZpvd, (RelationInfo) obj);
            }
        }));
        mediatorLiveData2.addSource(liveDataSwitchMap3, new StateListAnimator(new Function1() { // from class: o.omQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListViewModel.AEQbTJ(this.OLrzqt, (java.util.List) obj);
            }
        }));
        mediatorLiveData2.addSource(liveDataAsLiveData$default, new StateListAnimator(new Function1() { // from class: o.omP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListViewModel.KWHzl(this.AEQbTJ, (com.okinc.okimcore.model.remote.UserInfo) obj);
            }
        }));
        mediatorLiveData2.addSource(mediatorLiveData, new StateListAnimator(new Function1() { // from class: o.omO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListViewModel.AEQbTJ(this.copydefault, (kotlin.Pair) obj);
            }
        }));
        this.fetchVPNInfo = mediatorLiveData2;
        this.DTwDnp = mediatorLiveData2;
        this.zsXlph = Transformations.map(mediatorLiveData2, new Function1() { // from class: o.omR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(MessageListViewModel.EZpvd((MessageListViewModel.ActionBar) obj));
            }
        });
        this.gasjUx = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.finit = interfaceC36569odT.copydefault(300L);
        this.RcXXUw = interfaceC36569odT.copydefault(300L);
        this.OcIXYQ = new LinkedHashMap();
        this.iZzfmt = new Object();
        this.gkJEwt = new LinkedHashMap();
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.AhwBna = MutableStateFlow;
        this.gHZMYf = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.DbNXlk = mutableSharedFlowMutableSharedFlow$default;
        this.fZBcTu = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.AEQbTJ = FlowKt.stateIn(FlowKt.onEach(FlowKt.distinctUntilChanged(new LoaderManager(FlowKt.transformLatest(new FragmentManager(FlowKt.distinctUntilChanged(new Fragment(FlowKt.filterNotNull(FlowLiveDataConversions.asFlow(liveDataSwitchMap))))), new MessageListViewModel$special$$inlined$flatMapLatest$1(null, this)))), new MessageListViewModel$_isAgentProcessing$5(this, null)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.getEagerly(), bool);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class LoaderManager extends Application {
            public final StringResource AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ LoaderManager copy$default(LoaderManager loaderManager, StringResource stringResource, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = loaderManager.AEQbTJ;
                }
                return loaderManager.copydefault(stringResource);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StringResource OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final LoaderManager copydefault(@NotNull StringResource stringResource) {
                Intrinsics.checkNotNullParameter(stringResource, "");
                return new LoaderManager(stringResource);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoaderManager) && Intrinsics.EZpvd(this.AEQbTJ, ((LoaderManager) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ShowToast(res=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LoaderManager(@NotNull StringResource stringResource) {
                super(null);
                Intrinsics.checkNotNullParameter(stringResource, "");
                this.AEQbTJ = stringResource;
            }
        }

        private Application() {
        }

        public static final class TaskDescription extends Application {
            public final C35254nrp AEQbTJ;
            public final Uri OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, C35254nrp c35254nrp, Uri uri, int i, Object obj) {
                if ((i & 1) != 0) {
                    c35254nrp = taskDescription.AEQbTJ;
                }
                if ((i & 2) != 0) {
                    uri = taskDescription.OLrzqt;
                }
                return taskDescription.AEQbTJ(c35254nrp, uri);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription AEQbTJ(@NotNull C35254nrp c35254nrp, @NotNull Uri uri) {
                Intrinsics.checkNotNullParameter(c35254nrp, "");
                Intrinsics.checkNotNullParameter(uri, "");
                return new TaskDescription(c35254nrp, uri);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Uri OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C35254nrp copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TaskDescription)) {
                    return false;
                }
                TaskDescription taskDescription = (TaskDescription) obj;
                return Intrinsics.EZpvd(this.AEQbTJ, taskDescription.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, taskDescription.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "PlayAudio(message=" + this.AEQbTJ + ", playUri=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull C35254nrp c35254nrp, @NotNull Uri uri) {
                super(null);
                Intrinsics.checkNotNullParameter(c35254nrp, "");
                Intrinsics.checkNotNullParameter(uri, "");
                this.AEQbTJ = c35254nrp;
                this.OLrzqt = uri;
            }
        }

        public static final class ActionBar extends Application {
            public static final ActionBar copydefault = new ActionBar();

            private ActionBar() {
                super(null);
            }
        }

        public static final class PendingIntent extends Application {
            public static final PendingIntent AEQbTJ = new PendingIntent();

            private PendingIntent() {
                super(null);
            }
        }

        public static final class StateListAnimator extends Application {
            public final String AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.AEQbTJ;
                }
                return stateListAnimator.EZpvd(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator EZpvd(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new StateListAnimator(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) ((StateListAnimator) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ShowBlockDialog(displayName=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.AEQbTJ = str;
            }
        }

        public static final class Fragment extends Application {
            public static final Fragment OLrzqt = new Fragment();

            private Fragment() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel$Application$Application, reason: collision with other inner class name */
        public static final class C0458Application extends Application {
            public static final C0458Application EZpvd = new C0458Application();

            private C0458Application() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Activity extends Application {
            public static final Activity OLrzqt = new Activity();

            private Activity() {
                super(null);
            }
        }
    }

    public static final LiveData KWHzl(MessageListViewModel messageListViewModel, String str) {
        return FlowLiveDataConversions.asLiveData$default(messageListViewModel.QfsBiF.KWHzl(str), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public static final LiveData djBIcL(MessageListViewModel messageListViewModel, String str) {
        return FlowLiveDataConversions.asLiveData$default(messageListViewModel.dNCPSb.EZpvd(str), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public static final LiveData OLrzqt(MessageListViewModel messageListViewModel, String str) {
        return FlowLiveDataConversions.asLiveData$default(messageListViewModel.QbewEr.copydefault(str), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(MediatorLiveData mediatorLiveData, MessengerConnectionStatus messengerConnectionStatus) {
        Pair pair = (Pair) mediatorLiveData.getValue();
        Boolean bool = null;
        if ((pair != null ? (Boolean) pair.getSecond() : null) != null) {
            Pair pair2 = (Pair) mediatorLiveData.getValue();
            if (pair2 == null || !((Boolean) pair2.getSecond()).booleanValue()) {
                Pair pair3 = (Pair) mediatorLiveData.getValue();
                if (pair3 != null) {
                    Object first = pair3.getFirst();
                    bool = Boolean.TRUE;
                    if (!Intrinsics.EZpvd(first, bool)) {
                        bool = Boolean.FALSE;
                    }
                }
            } else {
                bool = Boolean.TRUE;
            }
        }
        mediatorLiveData.setValue(new Pair(bool, Boolean.valueOf(messengerConnectionStatus == MessengerConnectionStatus.Connected)));
        return Unit.INSTANCE;
    }

    public static final class ActionBar {
        public final C36558odI EZpvd;
        public final Integer KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, C36558odI c36558odI, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                c36558odI = actionBar.EZpvd;
            }
            if ((i & 2) != 0) {
                num = actionBar.KWHzl;
            }
            return actionBar.EZpvd(c36558odI, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(@NotNull C36558odI c36558odI, Integer num) {
            Intrinsics.checkNotNullParameter(c36558odI, "");
            return new ActionBar(c36558odI, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C36558odI KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd(this.EZpvd, actionBar.EZpvd) && Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            Integer num = this.KWHzl;
            return (iHashCode * 31) + (num == null ? 0 : num.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "MessageListUiModel(model=" + this.EZpvd + ", scenario=" + this.KWHzl + ")";
        }

        public ActionBar(@NotNull C36558odI c36558odI, Integer num) {
            Intrinsics.checkNotNullParameter(c36558odI, "");
            this.EZpvd = c36558odI;
            this.KWHzl = num;
        }
    }

    public static final Unit copydefault(MessageListViewModel messageListViewModel, RelationInfo relationInfo) {
        messageListViewModel.iwGUEr();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(MessageListViewModel messageListViewModel, List list) {
        messageListViewModel.getNewProxyInstance();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(MessageListViewModel messageListViewModel, UserInfo userInfo) {
        messageListViewModel.uzCIH();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(MessageListViewModel messageListViewModel, Pair pair) {
        messageListViewModel.hDKMBd();
        return Unit.INSTANCE;
    }

    public static final boolean EZpvd(ActionBar actionBar) {
        return actionBar.KWHzl().KWHzl();
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.RJOkX.AEQbTJ(this);
        this.UeEOUB.AEQbTJ(this);
        this.UeEOUB.OLrzqt();
        this.ejfBZ.EZpvd(this);
        this.ejfBZ.KWHzl();
        this.finit.OLrzqt();
        this.OcIXYQ.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(ActionBar actionBar, Continuation<? super Unit> continuation) throws Throwable {
        MessageListViewModel$setMessageListModel$1 messageListViewModel$setMessageListModel$1;
        MessageListViewModel messageListViewModel;
        OKMessage oKMessageAhwBna;
        if (continuation instanceof MessageListViewModel$setMessageListModel$1) {
            messageListViewModel$setMessageListModel$1 = (MessageListViewModel$setMessageListModel$1) continuation;
            int i = messageListViewModel$setMessageListModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageListViewModel$setMessageListModel$1.label = i - Integer.MIN_VALUE;
            } else {
                messageListViewModel$setMessageListModel$1 = new MessageListViewModel$setMessageListModel$1(this, continuation);
            }
        }
        Object objKWHzl = messageListViewModel$setMessageListModel$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = messageListViewModel$setMessageListModel$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            Integer numCopydefault = actionBar.copydefault();
            if (numCopydefault != null && numCopydefault.intValue() == 3 && (oKMessageAhwBna = actionBar.KWHzl().AhwBna()) != null) {
                this.ORxRYg = oKMessageAhwBna;
            }
            C36593odr c36593odr = this.QVAiDq;
            C36558odI c36558odIKWHzl = actionBar.KWHzl();
            boolean z = this.AwvSrB;
            messageListViewModel$setMessageListModel$1.L$0 = this;
            messageListViewModel$setMessageListModel$1.L$1 = actionBar;
            messageListViewModel$setMessageListModel$1.label = 1;
            objKWHzl = c36593odr.KWHzl(c36558odIKWHzl, z, messageListViewModel$setMessageListModel$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            messageListViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
                return Unit.INSTANCE;
            }
            actionBar = (ActionBar) messageListViewModel$setMessageListModel$1.L$1;
            messageListViewModel = (MessageListViewModel) messageListViewModel$setMessageListModel$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        ActionBar actionBarCopy$default = ActionBar.copy$default(actionBar, (C36558odI) objKWHzl, null, 2, null);
        messageListViewModel.AkhnZx = actionBarCopy$default;
        MediatorLiveData<ActionBar> mediatorLiveData = messageListViewModel.fetchVPNInfo;
        messageListViewModel$setMessageListModel$1.L$0 = null;
        messageListViewModel$setMessageListModel$1.L$1 = null;
        messageListViewModel$setMessageListModel$1.label = 2;
        if (C36588odm.KWHzl(mediatorLiveData, actionBarCopy$default, messageListViewModel$setMessageListModel$1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    public final Object AEQbTJ(Object obj, Continuation<? super Unit> continuation) {
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("MessageListViewModel", "dispatchFailureStateIfAny: " + thM7380exceptionOrNullimpl.getMessage());
        }
        Object objKWHzl = C36588odm.KWHzl(this.djBIcL, C56443yFo.KWHzl(Result.m7383isFailureimpl(obj)), continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public final Integer AEQbTJ(C36558odI c36558odI) {
        return c36558odI.valueOf() ? 4 : null;
    }

    public final C36558odI copydefault(C36558odI c36558odI) {
        return c36558odI.AEQbTJ((32318 & 1) != 0 ? c36558odI.AhwBna : null, (32318 & 2) != 0 ? c36558odI.KWHzl : null, (32318 & 4) != 0 ? c36558odI.DbNXlk : null, (32318 & 8) != 0 ? c36558odI.AkhnZx : null, (32318 & 16) != 0 ? c36558odI.isConnected : null, (32318 & 32) != 0 ? c36558odI.djBIcL : null, (32318 & 64) != 0 ? c36558odI.EZpvd : false, (32318 & 128) != 0 ? c36558odI.OLrzqt : false, (32318 & 256) != 0 ? c36558odI.values : null, (32318 & 512) != 0 ? c36558odI.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI.copydefault : null, (32318 & 4096) != 0 ? c36558odI.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI.valueOf : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(C35747oCe.ActionBar actionBar, Continuation<? super Application> continuation) throws Throwable {
        MessageListViewModel$mapAudioAction$1 messageListViewModel$mapAudioAction$1;
        if (continuation instanceof MessageListViewModel$mapAudioAction$1) {
            messageListViewModel$mapAudioAction$1 = (MessageListViewModel$mapAudioAction$1) continuation;
            int i = messageListViewModel$mapAudioAction$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageListViewModel$mapAudioAction$1.label = i - Integer.MIN_VALUE;
            } else {
                messageListViewModel$mapAudioAction$1 = new MessageListViewModel$mapAudioAction$1(this, continuation);
            }
        }
        Object objEZpvd = messageListViewModel$mapAudioAction$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = messageListViewModel$mapAudioAction$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            if (actionBar instanceof C35747oCe.ActionBar.Activity) {
                return Application.ActionBar.copydefault;
            }
            if (actionBar instanceof C35747oCe.ActionBar.Application) {
                return Application.PendingIntent.AEQbTJ;
            }
            if (actionBar instanceof C35747oCe.ActionBar.StateListAnimator) {
                return new Application.LoaderManager(((C35747oCe.ActionBar.StateListAnimator) actionBar).OLrzqt());
            }
            if (!(actionBar instanceof C35747oCe.ActionBar.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            C35749oCg c35749oCg = this.getFieldNames;
            C35254nrp c35254nrpAEQbTJ = ((C35747oCe.ActionBar.TaskDescription) actionBar).AEQbTJ();
            messageListViewModel$mapAudioAction$1.label = 1;
            objEZpvd = c35749oCg.EZpvd(c35254nrpAEQbTJ, messageListViewModel$mapAudioAction$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        C35749oCg.Application application = (C35749oCg.Application) objEZpvd;
        if (application != null) {
            return new Application.TaskDescription(application.AEQbTJ(), application.KWHzl());
        }
        return null;
    }

    public final Object EZpvd(Integer num, Continuation<? super Unit> continuation) {
        String displayName$default;
        if ((num != null && num.intValue() == 40005) || (num != null && num.intValue() == 30003)) {
            RelationInfo value = this.fFgQHt.getValue();
            if (value == null || (displayName$default = C44157sFk.getDisplayName$default(value, null, 1, null)) == null) {
                displayName$default = "";
            }
            Object objKWHzl = C36588odm.KWHzl(this.EZpvd, new C32989mnw(new Application.StateListAnimator(displayName$default)), continuation);
            return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
        }
        if (num != null && num.intValue() == 40004) {
            Object objKWHzl2 = C36588odm.KWHzl(this.EZpvd, new C32989mnw(Application.Fragment.OLrzqt), continuation);
            return objKWHzl2 == C56442yFn.copydefault() ? objKWHzl2 : Unit.INSTANCE;
        }
        if ((num != null && num.intValue() == 40002) || (num != null && num.intValue() == 40001)) {
            Object objKWHzl3 = C36588odm.KWHzl(this.EZpvd, new C32989mnw(Application.C0458Application.EZpvd), continuation);
            return objKWHzl3 == C56442yFn.copydefault() ? objKWHzl3 : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        this.RcXXUw.OLrzqt(new Function0() { // from class: o.omK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MessageListViewModel.getFieldNames(this.EZpvd);
            }
        });
    }

    public static final Unit getFieldNames(MessageListViewModel messageListViewModel) {
        messageListViewModel.gasjUx.mo5769trySendJP2dKIU(new MessageListViewModel$debounceRefresh$1$1(messageListViewModel, null));
        return Unit.INSTANCE;
    }

    public final void iwGUEr() {
        EZpvd();
    }

    public final void getNewProxyInstance() {
        EZpvd();
    }

    public final void uzCIH() {
        EZpvd();
    }

    public final void hDKMBd() {
        C36558odI c36558odIKWHzl;
        Pair<Boolean, Boolean> value = this.iRxXKY.getValue();
        pUU.KWHzl("MessageListViewModel", "onWebSocketConnectionStateUpdated, webSocketStateValue:" + value + ", isLoading:" + this.zLjUOn);
        if (value == null) {
            return;
        }
        Boolean boolComponent1 = value.component1();
        boolean zBooleanValue = value.component2().booleanValue();
        if (boolComponent1 != null && !boolComponent1.booleanValue() && zBooleanValue && this.AkhnZx == null) {
            this.gasjUx.mo5769trySendJP2dKIU(new MessageListViewModel$onWebSocketConnectionStateUpdated$1(this, null));
        }
        ActionBar actionBar = this.AkhnZx;
        List<C35254nrp> listAEQbTJ = (actionBar == null || (c36558odIKWHzl = actionBar.KWHzl()) == null) ? null : c36558odIKWHzl.AEQbTJ();
        if (listAEQbTJ == null) {
            listAEQbTJ = yDY.AhwBna();
        }
        if (boolComponent1 != null && zBooleanValue && C33129mqd.KWHzl((Collection) listAEQbTJ)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), sDN.copydefault.copydefault(), null, new MessageListViewModel$onWebSocketConnectionStateUpdated$2(this, listAEQbTJ, null), 2, null);
        }
    }

    @Override // o.InterfaceC44291sKj
    public void EZpvd(@NotNull C44468sQy c44468sQy) {
        Intrinsics.checkNotNullParameter(c44468sQy, "");
        if (AEQbTJ(c44468sQy.EZpvd().getTargetId()) && !(c44468sQy.EZpvd().getContent() instanceof OKTypingIndicatorMessage)) {
            this.gasjUx.mo5769trySendJP2dKIU(new MessageListViewModel$onSendMessage$1(this, c44468sQy, null));
        }
    }

    @Override // o.InterfaceC44291sKj
    public void KWHzl(@NotNull C44467sQx c44467sQx) {
        Intrinsics.checkNotNullParameter(c44467sQx, "");
        if (AEQbTJ(c44467sQx.copydefault().getTargetId())) {
            if (c44467sQx.copydefault().getContent() instanceof OKTypingIndicatorMessage) {
                copydefault(c44467sQx.copydefault());
            } else {
                KWHzl(c44467sQx.copydefault());
                this.gasjUx.mo5769trySendJP2dKIU(new MessageListViewModel$onReceiveMessage$1(this, c44467sQx, null));
            }
        }
    }

    public final void KWHzl(OKMessage oKMessage) {
        boolean zBooleanValue;
        String senderUserId = oKMessage.getSenderUserId();
        if (senderUserId != null) {
            if (!(!StringsKt__StringsKt.fARcdN((CharSequence) senderUserId))) {
                senderUserId = null;
            }
            if (senderUserId == null) {
                return;
            }
            synchronized (this.iZzfmt) {
                this.gkJEwt.remove(senderUserId);
                this.AhwBna.setValue(Boolean.valueOf(!this.gkJEwt.isEmpty()));
                zBooleanValue = this.AhwBna.getValue().booleanValue();
            }
            if (zBooleanValue) {
                return;
            }
            KWHzl(false);
        }
    }

    public final void copydefault(OKMessage oKMessage) {
        boolean z;
        String senderUserId = oKMessage.getSenderUserId();
        if (senderUserId != null) {
            if (!(!StringsKt__StringsKt.fARcdN((CharSequence) senderUserId))) {
                senderUserId = null;
            }
            if (senderUserId != null) {
                synchronized (this.iZzfmt) {
                    z = this.zuBGHE;
                }
                UserInfo value = this.hUfVAv.getValue();
                String identifyId = value != null ? value.getIdentifyId() : null;
                boolean z2 = (identifyId == null || StringsKt__StringsKt.fARcdN((CharSequence) identifyId) || !Intrinsics.EZpvd((Object) senderUserId, (Object) identifyId)) ? false : true;
                if (!z || z2) {
                    return;
                }
                OLrzqt(senderUserId, oKMessage.getSentTime());
            }
        }
    }

    public final void OLrzqt(boolean z) {
        synchronized (this.iZzfmt) {
            this.zuBGHE = z;
            if (!z) {
                this.gkJEwt.clear();
                this.AhwBna.setValue(Boolean.FALSE);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void KWHzl(TypingIndicatorConfig typingIndicatorConfig, OKConversationType oKConversationType) {
        synchronized (this.iZzfmt) {
            this.gGvvIC = oKConversationType;
            this.giSNqX = typingIndicatorConfig;
            Unit unit = Unit.INSTANCE;
        }
        OLrzqt(typingIndicatorConfig != null);
    }

    public final void KWHzl(boolean z) {
        synchronized (this.iZzfmt) {
            if (this.AwvSrB == z) {
                return;
            }
            this.AwvSrB = z;
            Unit unit = Unit.INSTANCE;
            copydefault(z);
        }
    }

    public final void copydefault(boolean z) {
        this.gasjUx.mo5769trySendJP2dKIU(new MessageListViewModel$updateModelWithPrivateTypingIndicatorState$1(this, z, null));
    }

    public final void OLrzqt(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this.iZzfmt) {
            if (this.zuBGHE) {
                this.gkJEwt.put(str, Long.valueOf(j));
                this.AhwBna.setValue(Boolean.valueOf(!this.gkJEwt.isEmpty()));
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final List<String> AEQbTJ(long j, long j2) {
        synchronized (this.iZzfmt) {
            if (!this.zuBGHE) {
                return yDY.AhwBna();
            }
            Iterator<Map.Entry<String, Long>> it = this.gkJEwt.entrySet().iterator();
            while (it.hasNext()) {
                if (j - it.next().getValue().longValue() > j2) {
                    it.remove();
                }
            }
            this.AhwBna.setValue(Boolean.valueOf(!this.gkJEwt.isEmpty()));
            Pair pairOLrzqt = C56390yDp.OLrzqt(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.gkJEwt.keySet()), this.gGvvIC);
            List list = (List) pairOLrzqt.component1();
            OKConversationType oKConversationType = (OKConversationType) pairOLrzqt.component2();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String strCopydefault = copydefault((String) it2.next(), oKConversationType);
                if (strCopydefault != null) {
                    arrayList.add(strCopydefault);
                }
            }
            return arrayList;
        }
    }

    public final String copydefault(String str, OKConversationType oKConversationType) {
        RelationInfo value;
        int i = oKConversationType == null ? -1 : Activity.AEQbTJ[oKConversationType.ordinal()];
        if (i == 1) {
            return EZpvd(str);
        }
        if (i == 2 && (value = this.fFgQHt.getValue()) != null) {
            return C44157sFk.getDisplayName$default(value, null, 1, null);
        }
        return null;
    }

    public final String EZpvd(@NotNull String str) {
        Object next;
        Intrinsics.checkNotNullParameter(str, "");
        List<GroupMemberInfo> value = this.QKVWgx.getValue();
        if (value == null) {
            return null;
        }
        Iterator<T> it = value.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((GroupMemberInfo) next).getMemberId(), (Object) str)) {
                break;
            }
        }
        GroupMemberInfo groupMemberInfo = (GroupMemberInfo) next;
        if (groupMemberInfo == null) {
            return null;
        }
        if (groupMemberInfo.getRemarkName() != null && (!StringsKt__StringsKt.fARcdN((CharSequence) r5))) {
            return groupMemberInfo.getRemarkName();
        }
        if (!StringsKt__StringsKt.fARcdN((CharSequence) groupMemberInfo.getNickName())) {
            return groupMemberInfo.getNickName();
        }
        if (!StringsKt__StringsKt.fARcdN((CharSequence) groupMemberInfo.getName())) {
            return groupMemberInfo.getName();
        }
        return null;
    }

    public final void AEQbTJ(OKMessage oKMessage) {
        String value = this.OLrzqt.getValue();
        if (value == null || oKMessage == null) {
            return;
        }
        copydefault(new C36556odG(value, oKMessage));
    }

    public final void EZpvd(OKMessage oKMessage) {
        C36558odI c36558odIKWHzl;
        OKConversation oKConversationOLrzqt;
        ActionBar actionBar = this.AkhnZx;
        String contactId = (actionBar == null || (c36558odIKWHzl = actionBar.KWHzl()) == null || (oKConversationOLrzqt = c36558odIKWHzl.OLrzqt()) == null) ? null : oKConversationOLrzqt.getContactId();
        if (contactId == null || StringsKt__StringsKt.fARcdN((CharSequence) contactId) || oKMessage == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MessageListViewModel$maybeReloadRelationInfo$1(this, contactId, oKMessage, null), 3, null);
    }

    @Override // o.InterfaceC44291sKj
    public void KWHzl(@NotNull sQB sqb) {
        Intrinsics.checkNotNullParameter(sqb, "");
        if (AEQbTJ(sqb.copydefault().getTargetId())) {
            this.gasjUx.mo5769trySendJP2dKIU(new MessageListViewModel$onSendMediaMessage$1(this, sqb, null));
        }
    }

    @Override // o.InterfaceC44291sKj
    public void OLrzqt(@NotNull C44454sQk c44454sQk) {
        Intrinsics.checkNotNullParameter(c44454sQk, "");
        if (AEQbTJ(c44454sQk.copydefault())) {
            this.gasjUx.mo5769trySendJP2dKIU(new MessageListViewModel$onDeleteMessage$1(this, c44454sQk, null));
        }
    }

    @Override // o.InterfaceC44291sKj
    public void EZpvd(@NotNull C44464sQu c44464sQu) {
        Intrinsics.checkNotNullParameter(c44464sQu, "");
        if (AEQbTJ(c44464sQu.AEQbTJ().getTargetId())) {
            this.gasjUx.mo5769trySendJP2dKIU(new MessageListViewModel$onRecallEvent$1(this, c44464sQu, null));
        }
    }

    @Override // o.InterfaceC44291sKj
    public void KWHzl(@NotNull sQA sqa) {
        Intrinsics.checkNotNullParameter(sqa, "");
        if (AEQbTJ(sqa.EZpvd().getTargetId())) {
            this.gasjUx.mo5769trySendJP2dKIU(new MessageListViewModel$onRefreshEvent$1(this, sqa, null));
        }
    }

    @Override // o.InterfaceC44291sKj
    public void EZpvd(@NotNull C44452sQi c44452sQi) {
        Intrinsics.checkNotNullParameter(c44452sQi, "");
        if (AEQbTJ(c44452sQi.EZpvd())) {
            this.gasjUx.mo5769trySendJP2dKIU(new MessageListViewModel$onClearMessages$1(this, c44452sQi, null));
        }
    }

    @Override // o.InterfaceC44291sKj
    public void KWHzl(@NotNull C44469sQz c44469sQz) {
        Intrinsics.checkNotNullParameter(c44469sQz, "");
        if (AEQbTJ(c44469sQz.copydefault().getTargetId())) {
            this.gasjUx.mo5769trySendJP2dKIU(new MessageListViewModel$onReceiveReadReceipt$1(this, c44469sQz, null));
        }
    }

    @Override // o.InterfaceC44291sKj
    public void EZpvd(@NotNull List<OKMessage> list) {
        Intrinsics.checkNotNullParameter(list, "");
        OKMessage oKMessage = (OKMessage) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (AEQbTJ(oKMessage != null ? oKMessage.getTargetId() : null)) {
            this.gasjUx.mo5769trySendJP2dKIU(new MessageListViewModel$onMessageDownloaded$1(this, list, null));
        }
    }

    @Override // o.InterfaceC44291sKj
    public void copydefault(@NotNull C44467sQx c44467sQx) {
        Intrinsics.checkNotNullParameter(c44467sQx, "");
        pUU.KWHzl("MessageListViewModel", "onReactionEvent:seq:" + c44467sQx.copydefault().getSeq());
        KWHzl(new sQA(c44467sQx.copydefault(), null, 2, null));
    }

    public final void AEQbTJ(String str, Long l, String str2) {
        valueOf();
        InterfaceC44293sKl interfaceC44293sKl = this.RJOkX;
        interfaceC44293sKl.AEQbTJ(this);
        interfaceC44293sKl.OLrzqt(this);
        C36576oda c36576oda = this.UeEOUB;
        c36576oda.AEQbTJ(this);
        c36576oda.EZpvd(this);
        C36517ocU c36517ocU = this.ejfBZ;
        c36517ocU.EZpvd(this);
        c36517ocU.AEQbTJ(this);
        this.OLrzqt.setValue(str);
        this.QUSxYX.AEQbTJ();
        OLrzqt(str, l, str2);
        KWHzl(str);
    }

    public final void valueOf() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), sDN.copydefault.copydefault(), null, new MessageListViewModel$initUiEventQueue$1(this, null), 2, null);
    }

    private final boolean AEQbTJ(String str) {
        if (str == null) {
            return false;
        }
        OKConversation value = this.fIwbmz.getValue();
        return Intrinsics.EZpvd((Object) (value != null ? value.getTargetId() : null), (Object) str);
    }

    public final void OLrzqt(String str, Long l, String str2) {
        this.gasjUx.mo5769trySendJP2dKIU(new MessageListViewModel$loadMessageList$1(this, str, l, str2, null));
    }

    public final void KWHzl(String str) {
        if (str == null || StringsKt__StringsKt.fARcdN((CharSequence) str)) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MessageListViewModel$loadGroupMemberList$1(this, str, null), 3, null);
    }

    public final void fARcdN() {
        if (this.sSMYrx) {
            return;
        }
        this.sSMYrx = true;
        this.gasjUx.mo5769trySendJP2dKIU(new MessageListViewModel$loadMoreOlderMessages$1(this, null));
    }

    public final void fJNWhG() {
        this.gasjUx.mo5769trySendJP2dKIU(new MessageListViewModel$loadMoreNewestMessages$1(this, null));
    }

    public final void KWHzl(long j) {
        this.gasjUx.mo5769trySendJP2dKIU(new MessageListViewModel$loadMessagesForNavigation$1(this, j, null));
    }

    public final void zLjUOn() {
        this.gasjUx.mo5769trySendJP2dKIU(new MessageListViewModel$resetTargetMessage$1(this, null));
    }

    public final void copydefault() {
        if (!C34703nhO.AhwBna(C32979mnm.EZpvd.OLrzqt()) || !SPUtils.getBoolean("ModifyIMAPIKeyActivity_KEY_MESSAGE_IS_UNREAD_COUNT_DISABLED_TOGGLE", false)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MessageListViewModel$clearConversationUnreadCount$1(this, null), 3, null);
        } else {
            pUU.KWHzl("MessageListViewModel", "Will not clear unread count as debug toggle ON");
        }
    }

    public final boolean AkhnZx() {
        return !((this.fIwbmz.getValue() != null ? r0.getLatestMessage() : null) instanceof DisbandGroupMessage);
    }

    public final void copydefault(C36556odG c36556odG) {
        Job job = this.fARcdN;
        if (job == null || !job.isActive()) {
            this.fARcdN = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MessageListViewModel$readAllMessageAndClearUnread$1(this, c36556odG, null), 3, null);
        }
    }

    public final void KWHzl(Long l) {
        this.gasjUx.mo5769trySendJP2dKIU(new MessageListViewModel$updateIsShowMessageStatus$1(this, l, null));
    }

    public final void copydefault(@NotNull Context context, Long l, String str) {
        Intrinsics.checkNotNullParameter(context, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MessageListViewModel$checkIsAllGroupInvitation$1(this, context, l, str, null), 3, null);
    }

    public final void OLrzqt(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        this.gasjUx.mo5769trySendJP2dKIU(new MessageListViewModel$playAudio$1(this, oKMessage, null));
    }

    public final void valueOf(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        this.gasjUx.mo5769trySendJP2dKIU(new MessageListViewModel$retryDownloadAndPlayAudio$1(this, oKMessage, null));
    }

    @Override // o.InterfaceC36507ocK
    public void AEQbTJ(@NotNull C35249nrk c35249nrk) {
        Intrinsics.checkNotNullParameter(c35249nrk, "");
        this.gasjUx.mo5769trySendJP2dKIU(new MessageListViewModel$onUpdatePlayState$1(this, c35249nrk, null));
    }

    @Override // o.InterfaceC36522ocZ
    public void EZpvd(@NotNull OKMessage oKMessage, @NotNull C36517ocU.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.gasjUx.mo5769trySendJP2dKIU(new MessageListViewModel$onUpdateDownloadAudioState$1(this, stateListAnimator, oKMessage, null));
    }

    public final void getFieldNames() {
        this.gasjUx.mo5769trySendJP2dKIU(new MessageListViewModel$onScrollToEndClicked$1(this, null));
    }

    public final Object OLrzqt(@NotNull final WSSendReactionData wSSendReactionData, @NotNull Continuation<? super Unit> continuation) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long seq = wSSendReactionData.getSeq();
        Long l = this.OcIXYQ.get(C56443yFo.KWHzl(seq));
        long jLongValue = jCurrentTimeMillis - (l != null ? l.longValue() : 0L);
        if (jLongValue < 500) {
            pUU.EZpvd("MessageListViewModel", "reactAEmoji throttled for message: " + jLongValue + DateFormat.MINUTE_SECOND);
            return Unit.INSTANCE;
        }
        this.OcIXYQ.put(C56443yFo.KWHzl(seq), C56443yFo.KWHzl(jCurrentTimeMillis));
        OLrzqt(jCurrentTimeMillis);
        KWHzl(wSSendReactionData, (OKMessage) null);
        Object objEZpvd = this.dxcTrN.EZpvd(wSSendReactionData, new Function0() { // from class: o.omT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MessageListViewModel.KWHzl();
            }
        }, new Function2() { // from class: o.omJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return MessageListViewModel.EZpvd(this.copydefault, wSSendReactionData, (OKMessage) obj, (java.lang.Throwable) obj2);
            }
        }, continuation);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
    }

    public static final Unit KWHzl() {
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(MessageListViewModel messageListViewModel, WSSendReactionData wSSendReactionData, OKMessage oKMessage, Throwable th) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(th, "");
        messageListViewModel.KWHzl(wSSendReactionData, oKMessage);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(long j) {
        if (this.OcIXYQ.size() % 10 == 0) {
            Iterator<Map.Entry<Long, Long>> it = this.OcIXYQ.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue().longValue() < j - 500) {
                    it.remove();
                }
            }
        }
    }

    public final void KWHzl(WSSendReactionData wSSendReactionData, OKMessage oKMessage) {
        this.gasjUx.mo5769trySendJP2dKIU(new MessageListViewModel$updateAMessageDisplayReaction$1(this, oKMessage, wSSendReactionData, null));
    }

    public final void EZpvd(boolean z) {
        this.gasjUx.mo5769trySendJP2dKIU(new MessageListViewModel$updateModelWithAgentProcessingState$1(this, z, null));
    }

    public final Object EZpvd(C36558odI c36558odI, Continuation<? super C36558odI> continuation) {
        return c36558odI.OLrzqt().getGroupType() == GroupTagType.OTC_AGENT ? this.QVAiDq.copydefault(c36558odI, this.AEQbTJ.getValue().booleanValue(), continuation) : c36558odI;
    }

    public final void AEQbTJ(int i, int i2) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MessageListViewModel$checkAndTriggerShareMessageAnimation$1(i, i2, this, null), 3, null);
    }
}
