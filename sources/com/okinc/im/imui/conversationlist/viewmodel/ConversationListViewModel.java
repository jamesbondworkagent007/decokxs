package com.okinc.im.imui.conversationlist.viewmodel;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.bean.ChatOrigin;
import com.okinc.im.imui.conversationlist.provider.ConversationListFilterChipsType;
import com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel;
import com.okinc.im.imui.conversationlist.viewmodel.ConversationListViewModel;
import com.okinc.im.usecase.conversation.CheckStartNewChatUseCase;
import com.okinc.okimcore.model.biz.relationlocal.PhoneRelation;
import com.okinc.okimcore.model.im.GroupSystemMessage;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKUserInfo;
import com.okinc.okimcore.model.im.UpdateGroupAvatarMessage;
import com.okinc.okimcore.model.im.UpdateGroupNameMessage;
import com.okinc.okimcore.model.remote.GroupRecommendations;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C32989mnw;
import o.C33794nGb;
import o.C35182nqW;
import o.C35748oCf;
import o.C35775oDf;
import o.C35830oFg;
import o.C35831oFh;
import o.C35837oFn;
import o.C35856oGf;
import o.C35868oGr;
import o.C35870oGt;
import o.C35873oGw;
import o.C37246oqH;
import o.C37248oqJ;
import o.C37760ozs;
import o.C43248rlh;
import o.C43296rmc;
import o.C44124sEe;
import o.C44157sFk;
import o.C44373sNk;
import o.C44467sQx;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC33171mrS;
import o.InterfaceC33763nEy;
import o.InterfaceC33835nHp;
import o.InterfaceC44177sGd;
import o.InterfaceC44293sKl;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.nFZ;
import o.nGA;
import o.nGE;
import o.nGN;
import o.nGS;
import o.oCD;
import o.oDA;
import o.oDZ;
import o.oFP;
import o.oGQ;
import o.oGU;
import o.pUU;
import o.rXL;
import o.rXQ;
import o.sDN;
import o.sDZ;
import o.sGF;
import o.sKN;
import o.sSI;
import o.yCM;
import o.yDY;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class ConversationListViewModel extends BaseConversationListViewModel {
    public static final Activity Companion = new Activity(null);
    public static final int DbNXlk = 8;
    public final MutableStateFlow<Integer> AuCTel;
    public final MutableLiveData<Boolean> AuCTelauCTel;
    public final MutableStateFlow<Boolean> AubY;
    public final MutableLiveData<C32989mnw<BaseConversationListViewModel.NewChatCheckState>> AwvSrB;
    public final MutableStateFlow<Boolean> AxsJAY;
    public final Application AxsJAYaxsJAY;
    public final C35870oGt AxsJAYsNCnLh;
    public final sKN DAIeex;
    public final StateFlow<Boolean> DCJXGO;
    public final MutableStateFlow<Integer> DTwDnp;
    public boolean DXXBbs;
    public ConversationListFilterChipsType ODWQjV;
    public final boolean ORxRYg;
    public final boolean OcIXYQ;
    public final rXQ OqFWZa;
    public final MutableStateFlow<List<nGS>> QKVWgx;
    public final oGQ QKudOq;
    public final C35748oCf QOLQEE;
    public final InterfaceC44177sGd QUSxYX;
    public final InterfaceC33835nHp QVAiDq;
    public final CheckStartNewChatUseCase QbewEr;
    public final InterfaceC33763nEy QfsBiF;
    public final oCD RJOkX;
    public final C35830oFg RcXXUw;
    public final C35873oGw RlQdEF;
    public final C35831oFh UeEOUB;
    public int aKErDB;
    public final int accept;
    public final BaseConversationListViewModel.ConversationListType dNCPSb;
    public final sGF djSkpj;
    public final oFP dvKsVJ;
    public final C35856oGf dxcTrN;
    public final MutableStateFlow<List<nGE>> ejfBZ;
    public final MutableStateFlow<Boolean> fARcdN;
    public final oDZ fFgQHt;
    public final MutableLiveData<List<Object>> fIwbmz;
    public final MutableStateFlow<Integer> fJNWhG;
    public final oDA fZBcTu;
    public final MutableLiveData<C32989mnw<BaseConversationListViewModel.AddContactCheckState>> fetchVPNInfo;
    public final C35775oDf finit;
    public final C35868oGr flVtFt;
    public final LiveData<Boolean> fvQaOB;
    public Job gGvvIC;
    public final MutableStateFlow<List<C37248oqJ>> gHZMYf;
    public Job gasjUx;
    public final MutableStateFlow<Boolean> getFieldNames;
    public final MutableStateFlow<Boolean> getNewProxyInstance;
    public Job giSNqX;
    public final C35837oFn gkJEwt;
    public final MutableStateFlow<Boolean> hDKMBd;
    public Set<CheckStartNewChatUseCase.CheckStep> hUfVAv;
    public final InterfaceC44293sKl iRxXKY;
    public Job iZzfmt;
    public final MutableStateFlow<Boolean> iwGUEr;
    public final MutableLiveData<C32989mnw<BaseConversationListViewModel.SyncSuggestedListCheckState>> sSMYrx;
    public final MutableLiveData<Boolean> uzCIH;
    public final MutableLiveData<C32989mnw<nGA>> values;
    public final MutableLiveData<C32989mnw<Set<Integer>>> wlaJM;
    public final MediatorLiveData<Boolean> zLjUOn;
    public final MutableLiveData<Boolean> zsXlph;
    public final MutableStateFlow<List<C37246oqH>> zuBGHE;

    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKConversationType.values().length];
            try {
                iArr[OKConversationType.SYSTEM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OKConversationType.OrbitNotifications.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public boolean AhwBna() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public C35831oFh AuCTel() {
        return this.UeEOUB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public MutableLiveData<C32989mnw<nGA>> AuCTelauCTel() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public MutableLiveData<C32989mnw<BaseConversationListViewModel.AddContactCheckState>> AubY() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public MutableLiveData<Boolean> AwvSrB() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public MutableLiveData<List<Object>> AxsJAY() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public MutableLiveData<C32989mnw<BaseConversationListViewModel.NewChatCheckState>> OcIXYQ() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public MutableLiveData<C32989mnw<BaseConversationListViewModel.SyncSuggestedListCheckState>> QKVWgx() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public MutableLiveData<Boolean> QOLQEE() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public C35830oFg fJNWhG() {
        return this.RcXXUw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public sGF fetchVPNInfo() {
        return this.djSkpj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int flVtFt() {
        return this.accept;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC44177sGd fvQaOB() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Set<CheckStartNewChatUseCase.CheckStep> gGvvIC() {
        return this.hUfVAv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public MutableLiveData<C32989mnw<Set<Integer>>> gHZMYf() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oGQ giSNqX() {
        return this.QKudOq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: zuBGHE()Landroidx/lifecycle/MutableLiveData; */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    /* JADX INFO: renamed from: iRxXKY, reason: merged with bridge method [inline-methods] */
    public MediatorLiveData<Boolean> zuBGHE() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public BaseConversationListViewModel.ConversationListType isConnected() {
        return this.dNCPSb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public boolean valueOf() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public InterfaceC33835nHp values() {
        return this.QVAiDq;
    }

    @yCM
    public ConversationListViewModel(@NotNull sGF sgf, @NotNull InterfaceC33835nHp interfaceC33835nHp, @NotNull InterfaceC44177sGd interfaceC44177sGd, @NotNull oGQ ogq, @NotNull C35830oFg c35830oFg, @NotNull C35831oFh c35831oFh, @NotNull C35837oFn c35837oFn, @NotNull oCD ocd, @NotNull CheckStartNewChatUseCase checkStartNewChatUseCase, @NotNull C35873oGw c35873oGw, @NotNull C35870oGt c35870oGt, @NotNull oFP ofp, @NotNull C35856oGf c35856oGf, @NotNull sKN skn, @NotNull oDZ odz, @NotNull C35868oGr c35868oGr, @NotNull C35775oDf c35775oDf, @NotNull C35748oCf c35748oCf, @NotNull rXQ rxq, @NotNull InterfaceC44293sKl interfaceC44293sKl, @NotNull oDA oda) {
        Intrinsics.checkNotNullParameter(sgf, "");
        Intrinsics.checkNotNullParameter(interfaceC33835nHp, "");
        Intrinsics.checkNotNullParameter(interfaceC44177sGd, "");
        Intrinsics.checkNotNullParameter(ogq, "");
        Intrinsics.checkNotNullParameter(c35830oFg, "");
        Intrinsics.checkNotNullParameter(c35831oFh, "");
        Intrinsics.checkNotNullParameter(c35837oFn, "");
        Intrinsics.checkNotNullParameter(ocd, "");
        Intrinsics.checkNotNullParameter(checkStartNewChatUseCase, "");
        Intrinsics.checkNotNullParameter(c35873oGw, "");
        Intrinsics.checkNotNullParameter(c35870oGt, "");
        Intrinsics.checkNotNullParameter(ofp, "");
        Intrinsics.checkNotNullParameter(c35856oGf, "");
        Intrinsics.checkNotNullParameter(skn, "");
        Intrinsics.checkNotNullParameter(odz, "");
        Intrinsics.checkNotNullParameter(c35868oGr, "");
        Intrinsics.checkNotNullParameter(c35775oDf, "");
        Intrinsics.checkNotNullParameter(c35748oCf, "");
        Intrinsics.checkNotNullParameter(rxq, "");
        Intrinsics.checkNotNullParameter(interfaceC44293sKl, "");
        Intrinsics.checkNotNullParameter(oda, "");
        this.djSkpj = sgf;
        this.QVAiDq = interfaceC33835nHp;
        this.QUSxYX = interfaceC44177sGd;
        this.QKudOq = ogq;
        this.RcXXUw = c35830oFg;
        this.UeEOUB = c35831oFh;
        this.gkJEwt = c35837oFn;
        this.RJOkX = ocd;
        this.QbewEr = checkStartNewChatUseCase;
        this.RlQdEF = c35873oGw;
        this.AxsJAYsNCnLh = c35870oGt;
        this.dvKsVJ = ofp;
        this.dxcTrN = c35856oGf;
        this.DAIeex = skn;
        this.fFgQHt = odz;
        this.flVtFt = c35868oGr;
        this.finit = c35775oDf;
        this.QOLQEE = c35748oCf;
        this.OqFWZa = rxq;
        this.iRxXKY = interfaceC44293sKl;
        this.fZBcTu = oda;
        this.dNCPSb = BaseConversationListViewModel.ConversationListType.Default;
        this.QfsBiF = new nFZ();
        Boolean bool = Boolean.TRUE;
        this.uzCIH = new MutableLiveData<>(bool);
        this.accept = 200;
        this.ODWQjV = ConversationListFilterChipsType.ALL;
        this.DTwDnp = StateFlowKt.MutableStateFlow(0);
        this.fJNWhG = StateFlowKt.MutableStateFlow(0);
        this.AuCTel = StateFlowKt.MutableStateFlow(0);
        this.AwvSrB = new MutableLiveData<>();
        this.fetchVPNInfo = new MutableLiveData<>();
        this.sSMYrx = new MutableLiveData<>();
        this.values = new MutableLiveData<>();
        this.fIwbmz = new MutableLiveData<>();
        this.wlaJM = new MutableLiveData<>();
        this.AuCTelauCTel = new MutableLiveData<>();
        final MediatorLiveData<Boolean> mediatorLiveData = new MediatorLiveData<>();
        mediatorLiveData.addSource(fARcdN(), new ActionBar(new Function1() { // from class: o.nHz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ConversationListViewModel.copydefault(mediatorLiveData, (java.util.List) obj);
            }
        }));
        this.zLjUOn = mediatorLiveData;
        this.hUfVAv = new LinkedHashSet();
        this.ejfBZ = StateFlowKt.MutableStateFlow(null);
        this.QKVWgx = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.gHZMYf = StateFlowKt.MutableStateFlow(null);
        this.zuBGHE = StateFlowKt.MutableStateFlow(null);
        Boolean bool2 = Boolean.FALSE;
        this.AubY = StateFlowKt.MutableStateFlow(bool2);
        this.fARcdN = StateFlowKt.MutableStateFlow(bool2);
        this.iwGUEr = StateFlowKt.MutableStateFlow(bool2);
        this.getFieldNames = StateFlowKt.MutableStateFlow(bool2);
        this.getNewProxyInstance = StateFlowKt.MutableStateFlow(bool2);
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.AxsJAY = MutableStateFlow;
        this.DCJXGO = FlowKt.asStateFlow(MutableStateFlow);
        this.hDKMBd = StateFlowKt.MutableStateFlow(bool2);
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(bool2);
        this.zsXlph = mutableLiveData;
        this.fvQaOB = mutableLiveData;
        this.AxsJAYaxsJAY = new Application();
        fZBcTu();
        hUfVAv();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.conversationlist.viewmodel.ConversationListViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static final Unit copydefault(MediatorLiveData mediatorLiveData, List list) {
        boolean z = true;
        if (list != null && !list.isEmpty() && (list.size() != 1 || !(CollectionsKt___CollectionsKt.firstOrNull(list) instanceof nGN))) {
            z = false;
        }
        mediatorLiveData.setValue(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public static final class Application extends C44373sNk {
        public Application() {
        }

        @Override // o.C44373sNk, o.InterfaceC44291sKj
        public void KWHzl(C44467sQx c44467sQx) {
            Intrinsics.checkNotNullParameter(c44467sQx, "");
            pUU.copydefault("RefreshGroupInfoUseCase", c44467sQx);
            OKMessageContent content = c44467sQx.copydefault().getContent();
            if ((content instanceof UpdateGroupNameMessage) || (content instanceof UpdateGroupAvatarMessage)) {
                Intrinsics.copydefault(content, "");
                if (C44157sFk.KWHzl(((GroupSystemMessage) content).getOperatorUserId())) {
                    return;
                }
                ConversationListViewModel.this.EZpvd(c44467sQx.copydefault().getTargetId());
            }
        }
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public void KWHzl(@NotNull ConversationListFilterChipsType conversationListFilterChipsType) {
        Intrinsics.checkNotNullParameter(conversationListFilterChipsType, "");
        if (conversationListFilterChipsType != this.ODWQjV) {
            this.ODWQjV = conversationListFilterChipsType;
            this.aKErDB = 0;
            KWHzl(0);
            RJOkX();
        }
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public void AEQbTJ(@NotNull String str, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault(str);
        OLrzqt(z);
        this.DXXBbs = z2;
        copydefault(z3);
        fZBcTu();
        hUfVAv();
        iZzfmt();
        QVAiDq();
        DAIeex();
        DarRvM();
        gkJEwt();
        RlQdEF();
        QKudOq();
        BaseConversationListViewModel.updateUserKycStatus$default(this, null, 1, null);
        EZpvd();
        gasjUx();
        InterfaceC44293sKl interfaceC44293sKl = this.iRxXKY;
        interfaceC44293sKl.AEQbTJ(this.AxsJAYaxsJAY);
        interfaceC44293sKl.OLrzqt(this.AxsJAYaxsJAY);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void fZBcTu() {
        boolean z;
        String strKWHzl = C44157sFk.KWHzl();
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        int iCopydefault = this.QfsBiF.copydefault(strKWHzl);
        boolean zAEQbTJ = C33794nGb.EZpvd.AEQbTJ(strKWHzl);
        MutableStateFlow<Boolean> mutableStateFlow = this.AxsJAY;
        if (iCopydefault >= 5 || zAEQbTJ || ((InterfaceC33171mrS) C43248rlh.KWHzl.AEQbTJ(InterfaceC33171mrS.class)).fJNWhG()) {
            z = false;
        } else {
            String strHDKMBd = hDKMBd();
            if ((strHDKMBd != null ? C35182nqW.KWHzl(strHDKMBd) : null) != ChatOrigin.P2P && dvKsVJ()) {
                z = true;
            }
        }
        mutableStateFlow.setValue(Boolean.valueOf(z));
    }

    public final boolean dvKsVJ() {
        ChatOrigin chatOriginKWHzl;
        oGU ogu = oGU.KWHzl;
        String strHDKMBd = hDKMBd();
        if (strHDKMBd == null || (chatOriginKWHzl = C35182nqW.KWHzl(strHDKMBd)) == null) {
            chatOriginKWHzl = ChatOrigin.UNKNOWN;
        }
        if (!ogu.OLrzqt(chatOriginKWHzl)) {
            return true;
        }
        List<nGE> value = this.ejfBZ.getValue();
        return value != null && KWHzl(value) < 5;
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public void QfsBiF() {
        String strKWHzl = C44157sFk.KWHzl();
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        if (this.QfsBiF.copydefault(strKWHzl) < 4) {
            AuCTelauCTel().setValue(new C32989mnw<>(nGA.StateListAnimator.EZpvd));
        } else {
            AuCTelauCTel().setValue(new C32989mnw<>(nGA.PendingIntent.EZpvd));
        }
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public void AEQbTJ(boolean z) {
        String strKWHzl = C44157sFk.KWHzl();
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        if (z) {
            this.QfsBiF.EZpvd(strKWHzl);
            this.AxsJAY.setValue(Boolean.FALSE);
            this.QKVWgx.setValue(yDY.AhwBna());
        } else {
            if (this.QfsBiF.copydefault(strKWHzl) < 4) {
                this.QfsBiF.EZpvd(strKWHzl);
            }
            C33794nGb.EZpvd.EZpvd(strKWHzl);
            this.AxsJAY.setValue(Boolean.FALSE);
            this.QKVWgx.setValue(yDY.AhwBna());
        }
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConversationListViewModel$fetchAndUpdateTrendingGroups$1(this, null), 3, null);
    }

    public final void DarRvM() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConversationListViewModel$observeUnreadConversationCount$1(this, null), 3, null);
    }

    public final void gkJEwt() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConversationListViewModel$observeFlaggedConversationCount$1(this, null), 3, null);
    }

    public final void RlQdEF() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConversationListViewModel$observeFlaggedWithUnreadCount$1(this, null), 3, null);
    }

    public final void DAIeex() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConversationListViewModel$observeSyncPhoneState$1(this, null), 3, null);
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public void copydefault(boolean z) {
        this.fARcdN.setValue(Boolean.valueOf(z));
    }

    public final void gEmmrt(boolean z) {
        pUU.KWHzl("ConversationListViewModel", "Start get suggested list: " + z);
        if (z) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConversationListViewModel$startGetSuggestedList$1(this, null), 3, null);
            return;
        }
        Job job = this.giSNqX;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.giSNqX = null;
        Job job2 = this.gGvvIC;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.gHZMYf.setValue(null);
        this.zuBGHE.setValue(null);
    }

    public static /* synthetic */ void startObserveSuggestedList$default(ConversationListViewModel conversationListViewModel, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        conversationListViewModel.AEQbTJ(l);
    }

    public final void AEQbTJ(Long l) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConversationListViewModel$startObserveSuggestedList$1(l, this, null), 3, null);
    }

    public final void AxsJAYsNCnLh() {
        Job job = this.gGvvIC;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.gGvvIC = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConversationListViewModel$observeServerSuggestedList$1(this, null), 3, null);
    }

    public final void accept() {
        Job job = this.giSNqX;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.giSNqX = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConversationListViewModel$observeRandomPhoneSuggestedList$1(this, null), 3, null);
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public void dNCPSb() {
        fZBcTu();
        RJOkX();
        copydefault();
        EZpvd();
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public void copydefault() {
        Object objM7377constructorimpl;
        if (!values().KWHzl()) {
            C44124sEe.imLogConversation$default("[In-House] Conversation list flow - web socket not connecting, try connect web socket", null, 2, null);
            finit();
            return;
        }
        C44124sEe.imLogConversation$default("[In-House] Conversation list flow - web socket connected, sync conversation", null, 2, null);
        try {
            Result.Application application = Result.Companion;
            sDZ.AEQbTJ.fARcdN().DbNXlk();
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Result.m7376boximpl(objM7377constructorimpl);
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public void RJOkX() {
        int i = this.aKErDB;
        int iFlVtFt = (i / flVtFt()) + 1;
        int iFlVtFt2 = flVtFt() * iFlVtFt;
        if (AkhnZx() == iFlVtFt) {
            C43296rmc.AEQbTJ("ConversationListViewModel", "observeConversationListFlow - getConversationsByPageFlow this page is already fetched...");
            return;
        }
        if (sSMYrx()) {
            C43296rmc.AEQbTJ("ConversationListViewModel", "observeConversationListFlow - getConversationsByPageFlow is already loading...");
            return;
        }
        KWHzl(true);
        KWHzl(iFlVtFt);
        pUU.KWHzl("ConversationListViewModel", "observeNextConversationListFlowByPage => currentConversationSizeBeforeFiltering:" + i + ", nextPage:" + iFlVtFt + ", size:" + iFlVtFt2);
        copydefault(iFlVtFt2, iFlVtFt == 1, iFlVtFt);
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public boolean getNewProxyInstance() {
        return this.ODWQjV == ConversationListFilterChipsType.UNREAD;
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public boolean getFieldNames() {
        return this.ODWQjV == ConversationListFilterChipsType.FLAGGED;
    }

    public final void QKudOq() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConversationListViewModel$observeIsAllowDisplaySyncBanner$1(this, null), 3, null);
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public void QVAiDq() {
        Job job = this.gasjUx;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.gasjUx = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConversationListViewModel$observeIsAllowGetSuggestedList$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object OLrzqt(@NotNull List<OKConversation> list, int i, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        ConversationListViewModel$handleGetConversationListSuccess$1 conversationListViewModel$handleGetConversationListSuccess$1;
        ConversationListViewModel conversationListViewModel;
        if (continuation instanceof ConversationListViewModel$handleGetConversationListSuccess$1) {
            conversationListViewModel$handleGetConversationListSuccess$1 = (ConversationListViewModel$handleGetConversationListSuccess$1) continuation;
            int i2 = conversationListViewModel$handleGetConversationListSuccess$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                conversationListViewModel$handleGetConversationListSuccess$1.label = i2 - Integer.MIN_VALUE;
            } else {
                conversationListViewModel$handleGetConversationListSuccess$1 = new ConversationListViewModel$handleGetConversationListSuccess$1(this, continuation);
            }
        }
        Object objWithContext = conversationListViewModel$handleGetConversationListSuccess$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = conversationListViewModel$handleGetConversationListSuccess$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
            ConversationListViewModel$handleGetConversationListSuccess$result$1 conversationListViewModel$handleGetConversationListSuccess$result$1 = new ConversationListViewModel$handleGetConversationListSuccess$result$1(this, list, null);
            conversationListViewModel$handleGetConversationListSuccess$1.L$0 = this;
            conversationListViewModel$handleGetConversationListSuccess$1.L$1 = list;
            conversationListViewModel$handleGetConversationListSuccess$1.I$0 = i;
            conversationListViewModel$handleGetConversationListSuccess$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, conversationListViewModel$handleGetConversationListSuccess$result$1, conversationListViewModel$handleGetConversationListSuccess$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            conversationListViewModel = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = conversationListViewModel$handleGetConversationListSuccess$1.I$0;
            list = (List) conversationListViewModel$handleGetConversationListSuccess$1.L$1;
            conversationListViewModel = (ConversationListViewModel) conversationListViewModel$handleGetConversationListSuccess$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        ArrayList arrayList = (ArrayList) objWithContext;
        int size = list.size();
        pUU.KWHzl("ConversationListViewModel", "handleGetConversationListSuccess, size:" + arrayList.size());
        conversationListViewModel.AEQbTJ(arrayList.size(), i);
        conversationListViewModel.EZpvd(arrayList, C56443yFo.AEQbTJ(size));
        return Unit.INSTANCE;
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public void EZpvd(@NotNull List<? extends nGE> list, Integer num) {
        Intrinsics.checkNotNullParameter(list, "");
        pUU.KWHzl("ConversationListViewModel", "updateConversationList, result size:" + list.size() + ", pageSize:" + flVtFt() + ", currentPage:" + AkhnZx() + ", resultSizeBeforeFiltering:" + num);
        this.aKErDB = num != null ? num.intValue() : list.size();
        AwvSrB().setValue(Boolean.valueOf(this.aKErDB >= flVtFt() * AkhnZx()));
        AuCTelauCTel().setValue(new C32989mnw<>(nGA.ActionBar.AEQbTJ));
        AuCTelauCTel().setValue(new C32989mnw<>(new nGA.Fragment(false)));
        EZpvd(true);
        this.ejfBZ.setValue(list);
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public Object OLrzqt(Throwable th, String str, @NotNull Continuation<? super Unit> continuation) {
        String message;
        AuCTelauCTel().setValue(new C32989mnw<>(nGA.ActionBar.AEQbTJ));
        AuCTelauCTel().setValue(new C32989mnw<>(new nGA.Fragment(false)));
        if (th != null && (message = th.getMessage()) != null) {
            C55326xho.toast$default(message, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        }
        AuCTelauCTel().setValue(new C32989mnw<>(nGA.FragmentManager.copydefault));
        KWHzl(th);
        if (str != null) {
            C44124sEe.imLogConversation$default(str, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    public final boolean AxsJAYaxsJAY() {
        return sSI.copydefault.copydefault();
    }

    public final void iZzfmt() {
        Job job = this.iZzfmt;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.iZzfmt = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConversationListViewModel$observeDisplayList$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(@NotNull Continuation<? super List<nGS>> continuation) throws Throwable {
        ConversationListViewModel$fetchTrendingGroups$1 conversationListViewModel$fetchTrendingGroups$1;
        Object objM8701invoke0E7RQCE$default;
        nGS ngs;
        if (continuation instanceof ConversationListViewModel$fetchTrendingGroups$1) {
            conversationListViewModel$fetchTrendingGroups$1 = (ConversationListViewModel$fetchTrendingGroups$1) continuation;
            int i = conversationListViewModel$fetchTrendingGroups$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                conversationListViewModel$fetchTrendingGroups$1.label = i - Integer.MIN_VALUE;
            } else {
                conversationListViewModel$fetchTrendingGroups$1 = new ConversationListViewModel$fetchTrendingGroups$1(this, continuation);
            }
        }
        ConversationListViewModel$fetchTrendingGroups$1 conversationListViewModel$fetchTrendingGroups$12 = conversationListViewModel$fetchTrendingGroups$1;
        Object obj = conversationListViewModel$fetchTrendingGroups$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = conversationListViewModel$fetchTrendingGroups$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                if (this.AubY.getValue().booleanValue()) {
                    return yDY.AhwBna();
                }
                boolean zKWHzl = this.QOLQEE.KWHzl();
                C35775oDf c35775oDf = this.finit;
                Boolean boolKWHzl = C56443yFo.KWHzl(!zKWHzl);
                conversationListViewModel$fetchTrendingGroups$12.label = 1;
                objM8701invoke0E7RQCE$default = C35775oDf.m8701invoke0E7RQCE$default(c35775oDf, boolKWHzl, null, conversationListViewModel$fetchTrendingGroups$12, 2, null);
                if (objM8701invoke0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objM8701invoke0E7RQCE$default = ((Result) obj).m7386unboximpl();
            }
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM8701invoke0E7RQCE$default);
            if (thM7380exceptionOrNullimpl == null) {
                List<GroupRecommendations> list = (List) objM8701invoke0E7RQCE$default;
                if (list.isEmpty()) {
                    return yDY.AhwBna();
                }
                ArrayList arrayList = new ArrayList();
                for (GroupRecommendations groupRecommendations : list) {
                    if (groupRecommendations.getGroupId() == null || groupRecommendations.getGroupName() == null) {
                        ngs = null;
                    } else {
                        Long groupId = groupRecommendations.getGroupId();
                        long jLongValue = groupId != null ? groupId.longValue() : 0L;
                        String groupName = groupRecommendations.getGroupName();
                        String str = groupName == null ? "" : groupName;
                        Integer memberCount = groupRecommendations.getMemberCount();
                        int iIntValue = memberCount != null ? memberCount.intValue() : 0;
                        String groupDescription = groupRecommendations.getGroupDescription();
                        String str2 = groupDescription == null ? "" : groupDescription;
                        String groupAvatar = groupRecommendations.getGroupAvatar();
                        Boolean boolIsPaidGroup = groupRecommendations.isPaidGroup();
                        boolean zBooleanValue = boolIsPaidGroup != null ? boolIsPaidGroup.booleanValue() : false;
                        Integer maxMemberCount = groupRecommendations.getMaxMemberCount();
                        String invitationId = groupRecommendations.getInvitationId();
                        Boolean boolIsOfficialGroup = groupRecommendations.isOfficialGroup();
                        ngs = new nGS(jLongValue, str, iIntValue, str2, groupAvatar, zBooleanValue, maxMemberCount, invitationId, boolIsOfficialGroup != null ? boolIsOfficialGroup.booleanValue() : false);
                    }
                    if (ngs != null) {
                        arrayList.add(ngs);
                    }
                }
                return arrayList;
            }
            C44124sEe.KWHzl("Failed to fetch trending groups", thM7380exceptionOrNullimpl);
            return yDY.AhwBna();
        } catch (Exception e) {
            C44124sEe.KWHzl("Failed to fetch trending groups", e);
            return yDY.AhwBna();
        }
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConversationListViewModel$removeGroupFromConversationList$1(this, str, null), 3, null);
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public void QbewEr() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConversationListViewModel$preloadUserInfoIfNecessary$1(this, null), 3, null);
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public void dxcTrN() {
        if (sDZ.AEQbTJ.hDKMBd()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), sDN.copydefault.copydefault(), null, new ConversationListViewModel$syncContactList$1(this, null), 2, null);
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public void OLrzqt(@NotNull OKConversation oKConversation, boolean z) {
        Intrinsics.checkNotNullParameter(oKConversation, "");
        int i = TaskDescription.OLrzqt[oKConversation.getConversationType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            valueOf(z);
        } else {
            rXL rxlEZpvd = rXL.Companion.EZpvd(oKConversation.getTargetId());
            if (rxlEZpvd != null) {
                OLrzqt(rxlEZpvd);
            }
        }
    }

    public final void valueOf(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConversationListViewModel$markOrbitNotificationAsRead$1(this, z, null), 3, null);
    }

    public final void OLrzqt(@NotNull rXL rxl) {
        Intrinsics.checkNotNullParameter(rxl, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConversationListViewModel$markNotificationConversationAsViewed$1(this, rxl, null), 3, null);
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public void AEQbTJ(@NotNull CheckStartNewChatUseCase.CheckStep checkStep) {
        Intrinsics.checkNotNullParameter(checkStep, "");
        this.hUfVAv.add(checkStep);
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public void KWHzl(Function1<? super Boolean, Unit> function1) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConversationListViewModel$updateUserKycStatus$1(this, function1, null), 3, null);
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public void UeEOUB() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConversationListViewModel$startNewChatChecks$1(this, null), 3, null);
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public void djSkpj() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConversationListViewModel$startAddContactChecks$1(this, null), 3, null);
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public void AEQbTJ(@NotNull C37246oqH c37246oqH) {
        Intrinsics.checkNotNullParameter(c37246oqH, "");
        if (c37246oqH.OLrzqt().size() == 1) {
            AEQbTJ((PhoneRelation) CollectionsKt___CollectionsKt.AuCTelauCTel(c37246oqH.OLrzqt()));
        } else {
            AuCTelauCTel().setValue(new C32989mnw<>(new nGA.LoaderManager(c37246oqH)));
        }
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public void AEQbTJ(@NotNull PhoneRelation phoneRelation) {
        Intrinsics.checkNotNullParameter(phoneRelation, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConversationListViewModel$checkLocalRelation$1(this, phoneRelation, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(String str, String str2) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConversationListViewModel$fetchReferralData$1(this, str, str2, null), 3, null);
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public void aKErDB() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConversationListViewModel$startSuggestedListCheck$1(this, null), 3, null);
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public void AEQbTJ() {
        this.getFieldNames.setValue(Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void KWHzl(@NotNull String str) {
        Integer numValueOf;
        OKUserInfo userInfo;
        Intrinsics.checkNotNullParameter(str, "");
        List<Object> value = AxsJAY().getValue();
        Set setCopydefault = null;
        if (value != null) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : value) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                if (obj instanceof nGE) {
                    nGE nge = (nGE) obj;
                    OKMessageContent latestMessage = nge.AEQbTJ().getLatestMessage();
                    if (Intrinsics.EZpvd((Object) ((latestMessage == null || (userInfo = latestMessage.getUserInfo()) == null) ? null : userInfo.getUserId()), (Object) str)) {
                        nge.KWHzl(null);
                        numValueOf = Integer.valueOf(i);
                    } else {
                        numValueOf = null;
                    }
                }
                if (numValueOf != null) {
                    arrayList.add(numValueOf);
                }
                i++;
            }
            setCopydefault = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
        }
        if (setCopydefault == null) {
            setCopydefault = yEE.copydefault();
        }
        pUU.KWHzl("ConversationListViewModel", "updateLastMsgWithRelationId => indexListWithLastMsg:" + setCopydefault);
        if (!setCopydefault.isEmpty()) {
            gHZMYf().setValue(new C32989mnw<>(setCopydefault));
        }
    }

    public final void EZpvd(String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConversationListViewModel$updateGroupInfo$1(this, str, null), 3, null);
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        Job jobAYXKKw = AYXKKw();
        if (jobAYXKKw != null) {
            Job.DefaultImpls.cancel$default(jobAYXKKw, (CancellationException) null, 1, (Object) null);
        }
        Job jobDbNXlk = DbNXlk();
        if (jobDbNXlk != null) {
            Job.DefaultImpls.cancel$default(jobDbNXlk, (CancellationException) null, 1, (Object) null);
        }
        Job job = this.iZzfmt;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.iRxXKY.AEQbTJ(this.AxsJAYaxsJAY);
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public void OLrzqt() {
        String strKWHzl = C44157sFk.KWHzl();
        if (strKWHzl == null || strKWHzl.length() == 0) {
            return;
        }
        C37760ozs.EZpvd("conversation_list_sync_contacts_dismiss" + C44157sFk.KWHzl(), Boolean.TRUE);
        gasjUx();
    }

    public final void gasjUx() {
        String strKWHzl = C44157sFk.KWHzl();
        if (strKWHzl == null || strKWHzl.length() == 0) {
            this.hDKMBd.setValue(Boolean.FALSE);
            return;
        }
        this.hDKMBd.setValue(Boolean.valueOf(C37760ozs.copydefault("conversation_list_sync_contacts_dismiss" + C44157sFk.KWHzl(), false)));
    }

    public final void hUfVAv() {
        ChatOrigin chatOriginKWHzl;
        oGU ogu = oGU.KWHzl;
        String strHDKMBd = hDKMBd();
        if (strHDKMBd == null || (chatOriginKWHzl = C35182nqW.KWHzl(strHDKMBd)) == null) {
            chatOriginKWHzl = ChatOrigin.UNKNOWN;
        }
        if (ogu.OLrzqt(chatOriginKWHzl)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConversationListViewModel$observeConversationListForTrendingGroups$1(this, null), 3, null);
        }
    }

    public final int KWHzl(List<? extends nGE> list) {
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (nGE nge : list) {
                if (nge.AEQbTJ().getConversationType() == OKConversationType.PRIVATE || nge.AEQbTJ().getConversationType() == OKConversationType.GROUP) {
                    i++;
                    if (i < 0) {
                        yDY.djBIcL();
                    }
                }
            }
        }
        return i;
    }
}
