package com.okinc.im.imui.conversationlist.viewmodel;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelKt;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.bean.ChatOrigin;
import com.okinc.im.imui.conversationlist.model.PageTrackData;
import com.okinc.im.imui.conversationlist.provider.ConversationListFilterChipsType;
import com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel;
import com.okinc.im.usecase.conversation.CheckStartNewChatUseCase;
import com.okinc.okimcore.model.biz.relationlocal.PhoneRelation;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.p2p.api.OtcRouteConst;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import o.AbstractC33073mpa;
import o.C32866mlf;
import o.C32979mnm;
import o.C32989mnw;
import o.C33129mqd;
import o.C35830oFg;
import o.C35831oFh;
import o.C37246oqH;
import o.C44124sEe;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.C56444yFp;
import o.InterfaceC33835nHp;
import o.InterfaceC56445yFq;
import o.nGA;
import o.nGE;
import o.nGF;
import o.nGG;
import o.nGM;
import o.nGO;
import o.rXL;
import o.sDN;
import o.sDZ;
import o.sEF;
import o.sGF;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class BaseConversationListViewModel extends AbstractC33073mpa {
    public final boolean AEQbTJ;
    public final boolean AYXKKw;
    public final boolean AhwBna;
    public final Map<Integer, PageTrackData> AkhnZx = new LinkedHashMap();
    public Job EZpvd;
    public final boolean KWHzl;
    public boolean OLrzqt;
    public Job copydefault;
    public boolean djBIcL;
    public int gEmmrt;
    public boolean isConnected;
    public String valueOf;

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKConversationType.values().length];
            try {
                iArr[OKConversationType.PRIVATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OKConversationType.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OKConversationType.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OKConversationType.OrbitNotifications.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            OLrzqt = iArr;
        }
    }

    public void AEQbTJ() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull CheckStartNewChatUseCase.CheckStep checkStep) {
        Intrinsics.checkNotNullParameter(checkStep, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull PhoneRelation phoneRelation) {
        Intrinsics.checkNotNullParameter(phoneRelation, "");
    }

    public abstract void AEQbTJ(@NotNull String str, boolean z, boolean z2, boolean z3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull C37246oqH c37246oqH) {
        Intrinsics.checkNotNullParameter(c37246oqH, "");
    }

    public void AEQbTJ(boolean z) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Job AYXKKw() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AhwBna() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AkhnZx() {
        return this.gEmmrt;
    }

    public abstract C35831oFh AuCTel();

    public abstract MutableLiveData<C32989mnw<nGA>> AuCTelauCTel();

    public abstract MutableLiveData<C32989mnw<AddContactCheckState>> AubY();

    public abstract MutableLiveData<Boolean> AwvSrB();

    public abstract MutableLiveData<List<Object>> AxsJAY();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DTwDnp() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Job DbNXlk() {
        return this.EZpvd;
    }

    public void EZpvd() {
    }

    public abstract void EZpvd(@NotNull List<? extends nGE> list, Integer num);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.djBIcL = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(int i) {
        this.gEmmrt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull ConversationListFilterChipsType conversationListFilterChipsType) {
        Intrinsics.checkNotNullParameter(conversationListFilterChipsType, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    public void KWHzl(Function1<? super Boolean, Unit> function1) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.OLrzqt = z;
    }

    public abstract Object OLrzqt(Throwable th, String str, @NotNull Continuation<? super Unit> continuation);

    public abstract Object OLrzqt(@NotNull List<OKConversation> list, int i, @NotNull Continuation<? super Unit> continuation);

    public void OLrzqt() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull OKConversation oKConversation, boolean z) {
        Intrinsics.checkNotNullParameter(oKConversation, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.isConnected = z;
    }

    public abstract MutableLiveData<C32989mnw<NewChatCheckState>> OcIXYQ();

    public abstract MutableLiveData<C32989mnw<SyncSuggestedListCheckState>> QKVWgx();

    public abstract MutableLiveData<Boolean> QOLQEE();

    public void QVAiDq() {
    }

    public void QbewEr() {
    }

    public void QfsBiF() {
    }

    public abstract void RJOkX();

    public void UeEOUB() {
    }

    public void aKErDB() {
    }

    public abstract void copydefault();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(String str) {
        this.valueOf = str;
    }

    public void copydefault(boolean z) {
    }

    public abstract void dNCPSb();

    public void djSkpj() {
    }

    public void dxcTrN() {
    }

    public abstract C35830oFg fJNWhG();

    public abstract sGF fetchVPNInfo();

    public abstract MutableLiveData<C32989mnw<Set<Integer>>> gHZMYf();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean getFieldNames() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean getNewProxyInstance() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String hDKMBd() {
        return this.valueOf;
    }

    public abstract ConversationListType isConnected();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean sSMYrx() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean valueOf() {
        return this.AEQbTJ;
    }

    public abstract InterfaceC33835nHp values();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<Integer, PageTrackData> wlaJM() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean zLjUOn() {
        return this.isConnected;
    }

    public abstract MutableLiveData<Boolean> zuBGHE();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ConversationListType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ConversationListType[] $VALUES;
        public static final ConversationListType Default = new ConversationListType("Default", 0);
        public static final ConversationListType Restricted = new ConversationListType("Restricted", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ConversationListType[] $values() {
            return new ConversationListType[]{Default, Restricted};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ConversationListType> getEntries() {
            return $ENTRIES;
        }

        private ConversationListType(String str, int i) {
        }

        static {
            ConversationListType[] conversationListTypeArr$values = $values();
            $VALUES = conversationListTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(conversationListTypeArr$values);
        }

        public static ConversationListType valueOf(String str) {
            return (ConversationListType) Enum.valueOf(ConversationListType.class, str);
        }

        public static ConversationListType[] values() {
            return (ConversationListType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class NewChatCheckState {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ NewChatCheckState[] $VALUES;
        public static final NewChatCheckState Success = new NewChatCheckState("Success", 0);
        public static final NewChatCheckState ShowKycFlow = new NewChatCheckState("ShowKycFlow", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ NewChatCheckState[] $values() {
            return new NewChatCheckState[]{Success, ShowKycFlow};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<NewChatCheckState> getEntries() {
            return $ENTRIES;
        }

        private NewChatCheckState(String str, int i) {
        }

        static {
            NewChatCheckState[] newChatCheckStateArr$values = $values();
            $VALUES = newChatCheckStateArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(newChatCheckStateArr$values);
        }

        public static NewChatCheckState valueOf(String str) {
            return (NewChatCheckState) Enum.valueOf(NewChatCheckState.class, str);
        }

        public static NewChatCheckState[] values() {
            return (NewChatCheckState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class AddContactCheckState {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ AddContactCheckState[] $VALUES;
        public static final AddContactCheckState Success = new AddContactCheckState("Success", 0);
        public static final AddContactCheckState ShowKycFlow = new AddContactCheckState("ShowKycFlow", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ AddContactCheckState[] $values() {
            return new AddContactCheckState[]{Success, ShowKycFlow};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<AddContactCheckState> getEntries() {
            return $ENTRIES;
        }

        private AddContactCheckState(String str, int i) {
        }

        static {
            AddContactCheckState[] addContactCheckStateArr$values = $values();
            $VALUES = addContactCheckStateArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(addContactCheckStateArr$values);
        }

        public static AddContactCheckState valueOf(String str) {
            return (AddContactCheckState) Enum.valueOf(AddContactCheckState.class, str);
        }

        public static AddContactCheckState[] values() {
            return (AddContactCheckState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class SyncSuggestedListCheckState {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ SyncSuggestedListCheckState[] $VALUES;
        public static final SyncSuggestedListCheckState Success = new SyncSuggestedListCheckState("Success", 0);
        public static final SyncSuggestedListCheckState ShowKycFlow = new SyncSuggestedListCheckState("ShowKycFlow", 1);
        public static final SyncSuggestedListCheckState AskContactPermission = new SyncSuggestedListCheckState("AskContactPermission", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ SyncSuggestedListCheckState[] $values() {
            return new SyncSuggestedListCheckState[]{Success, ShowKycFlow, AskContactPermission};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<SyncSuggestedListCheckState> getEntries() {
            return $ENTRIES;
        }

        private SyncSuggestedListCheckState(String str, int i) {
        }

        static {
            SyncSuggestedListCheckState[] syncSuggestedListCheckStateArr$values = $values();
            $VALUES = syncSuggestedListCheckStateArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(syncSuggestedListCheckStateArr$values);
        }

        public static SyncSuggestedListCheckState valueOf(String str) {
            return (SyncSuggestedListCheckState) Enum.valueOf(SyncSuggestedListCheckState.class, str);
        }

        public static SyncSuggestedListCheckState[] values() {
            return (SyncSuggestedListCheckState[]) $VALUES.clone();
        }
    }

    public final LiveData<Boolean> ORxRYg() {
        return Transformations.distinctUntilChanged(AwvSrB());
    }

    public final LiveData<C32989mnw<NewChatCheckState>> iwGUEr() {
        return OcIXYQ();
    }

    public final LiveData<C32989mnw<AddContactCheckState>> gEmmrt() {
        return AubY();
    }

    public final LiveData<C32989mnw<SyncSuggestedListCheckState>> zsXlph() {
        return QKVWgx();
    }

    public final LiveData<C32989mnw<nGA>> djBIcL() {
        return AuCTelauCTel();
    }

    public final LiveData<List<Object>> fARcdN() {
        return AxsJAY();
    }

    public final LiveData<C32989mnw<Set<Integer>>> ejfBZ() {
        return gHZMYf();
    }

    public final LiveData<Boolean> uzCIH() {
        return Transformations.distinctUntilChanged(QOLQEE());
    }

    public final LiveData<Boolean> QUSxYX() {
        return Transformations.distinctUntilChanged(zuBGHE());
    }

    public static /* synthetic */ void markConversationAsRead$default(BaseConversationListViewModel baseConversationListViewModel, OKConversation oKConversation, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markConversationAsRead");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        baseConversationListViewModel.OLrzqt(oKConversation, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateUserKycStatus$default(BaseConversationListViewModel baseConversationListViewModel, Function1 function1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateUserKycStatus");
        }
        if ((i & 1) != 0) {
            function1 = null;
        }
        baseConversationListViewModel.KWHzl((Function1<? super Boolean, Unit>) function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(@NotNull Continuation<? super Boolean> continuation) throws Throwable {
        BaseConversationListViewModel$connectInHouseIM$1 baseConversationListViewModel$connectInHouseIM$1;
        BaseConversationListViewModel baseConversationListViewModel;
        if (continuation instanceof BaseConversationListViewModel$connectInHouseIM$1) {
            baseConversationListViewModel$connectInHouseIM$1 = (BaseConversationListViewModel$connectInHouseIM$1) continuation;
            int i = baseConversationListViewModel$connectInHouseIM$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                baseConversationListViewModel$connectInHouseIM$1.label = i - Integer.MIN_VALUE;
            } else {
                baseConversationListViewModel$connectInHouseIM$1 = new BaseConversationListViewModel$connectInHouseIM$1(this, continuation);
            }
        }
        Object objCopydefault = baseConversationListViewModel$connectInHouseIM$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = baseConversationListViewModel$connectInHouseIM$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            if (values().KWHzl()) {
                return C56443yFo.KWHzl(true);
            }
            sDZ sdz = sDZ.AEQbTJ;
            baseConversationListViewModel$connectInHouseIM$1.L$0 = this;
            baseConversationListViewModel$connectInHouseIM$1.label = 1;
            if (sdz.OLrzqt(baseConversationListViewModel$connectInHouseIM$1) == objCopydefault2) {
                return objCopydefault2;
            }
            baseConversationListViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objCopydefault);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            baseConversationListViewModel = (BaseConversationListViewModel) baseConversationListViewModel$connectInHouseIM$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        InterfaceC33835nHp interfaceC33835nHpValues = baseConversationListViewModel.values();
        baseConversationListViewModel$connectInHouseIM$1.L$0 = null;
        baseConversationListViewModel$connectInHouseIM$1.label = 2;
        objCopydefault = interfaceC33835nHpValues.copydefault(baseConversationListViewModel$connectInHouseIM$1);
        return objCopydefault == objCopydefault2 ? objCopydefault2 : objCopydefault;
    }

    public final void finit() {
        Job job = this.copydefault;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.copydefault = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new BaseConversationListViewModel$tryConnectImWebSocket$1(this, null), 2, null);
    }

    public static /* synthetic */ void updateConversationList$default(BaseConversationListViewModel baseConversationListViewModel, List list, Integer num, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateConversationList");
        }
        if ((i & 2) != 0) {
            num = null;
        }
        baseConversationListViewModel.EZpvd(list, num);
    }

    public static /* synthetic */ void observeConversationListFlow$default(BaseConversationListViewModel baseConversationListViewModel, int i, boolean z, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeConversationListFlow");
        }
        if ((i3 & 2) != 0) {
            z = true;
        }
        baseConversationListViewModel.copydefault(i, z, i2);
    }

    public void copydefault(int i, boolean z, int i2) {
        Job job = this.EZpvd;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.EZpvd = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), sDN.copydefault.AEQbTJ(), null, new BaseConversationListViewModel$observeConversationListFlow$1(this, i, z, i2, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        BaseConversationListViewModel$showEmptyIfNoDataInDb$1 baseConversationListViewModel$showEmptyIfNoDataInDb$1;
        BaseConversationListViewModel baseConversationListViewModel;
        Object objM7377constructorimpl;
        if (continuation instanceof BaseConversationListViewModel$showEmptyIfNoDataInDb$1) {
            baseConversationListViewModel$showEmptyIfNoDataInDb$1 = (BaseConversationListViewModel$showEmptyIfNoDataInDb$1) continuation;
            int i = baseConversationListViewModel$showEmptyIfNoDataInDb$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                baseConversationListViewModel$showEmptyIfNoDataInDb$1.label = i - Integer.MIN_VALUE;
            } else {
                baseConversationListViewModel$showEmptyIfNoDataInDb$1 = new BaseConversationListViewModel$showEmptyIfNoDataInDb$1(this, continuation);
            }
        }
        Object objAhwBna = baseConversationListViewModel$showEmptyIfNoDataInDb$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = baseConversationListViewModel$showEmptyIfNoDataInDb$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAhwBna);
            if (!this.djBIcL) {
                try {
                    Result.Application application = Result.Companion;
                    sGF sgfAYXKKw = sDZ.AEQbTJ.AYXKKw();
                    baseConversationListViewModel$showEmptyIfNoDataInDb$1.L$0 = this;
                    baseConversationListViewModel$showEmptyIfNoDataInDb$1.label = 1;
                    objAhwBna = sgfAYXKKw.AhwBna(baseConversationListViewModel$showEmptyIfNoDataInDb$1);
                    if (objAhwBna == objCopydefault) {
                        return objCopydefault;
                    }
                    baseConversationListViewModel = this;
                } catch (Throwable th) {
                    th = th;
                    baseConversationListViewModel = this;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        baseConversationListViewModel = (BaseConversationListViewModel) baseConversationListViewModel$showEmptyIfNoDataInDb$1.L$0;
        try {
            C56391yDq.AEQbTJ(objAhwBna);
        } catch (Throwable th2) {
            th = th2;
            Result.Application application22 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(((Boolean) objAhwBna).booleanValue()));
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C44124sEe.KWHzl("showEmptyIfNoDataInDb - Unable to get count from local db", thM7380exceptionOrNullimpl);
            objM7377constructorimpl = C56443yFo.KWHzl(false);
        }
        boolean zBooleanValue = ((Boolean) objM7377constructorimpl).booleanValue();
        C44124sEe.imLogConversation$default("showEmptyIfNoDataInDb - hasConversationInLocalDb: " + zBooleanValue, null, 2, null);
        if (!zBooleanValue) {
            updateConversationList$default(baseConversationListViewModel, yDY.AhwBna(), null, 2, null);
            C44124sEe.imLogConversation$default("[In-House] Conversation list flow - first load, no data in db, show empty", null, 2, null);
        } else {
            C44124sEe.imLogConversation$default("[In-House] Conversation list flow - first load, has data in db, keep loading...", null, 2, null);
        }
        return Unit.INSTANCE;
    }

    public final ArrayList<nGE> EZpvd(@NotNull List<OKConversation> list) {
        Intrinsics.checkNotNullParameter(list, "");
        Context applicationContext = C32979mnm.EZpvd.OLrzqt().getApplicationContext();
        ArrayList<nGE> arrayList = new ArrayList<>(list.size());
        for (OKConversation oKConversation : list) {
            int i = Activity.OLrzqt[oKConversation.getConversationType().ordinal()];
            if (i == 1) {
                Intrinsics.copydefault(applicationContext);
                arrayList.add(new nGO(applicationContext, oKConversation));
            } else if (i == 2) {
                Intrinsics.copydefault(applicationContext);
                arrayList.add(new nGG(applicationContext, oKConversation));
            } else if (i == 3) {
                rXL rxlEZpvd = rXL.Companion.EZpvd(oKConversation.getTargetId());
                if (rxlEZpvd != null) {
                    Intrinsics.copydefault(applicationContext);
                    arrayList.add(new nGF(applicationContext, oKConversation, rxlEZpvd.AhwBna() ? null : rxlEZpvd));
                }
            } else if (i == 4) {
                Intrinsics.copydefault(applicationContext);
                arrayList.add(new nGM(applicationContext, oKConversation));
            } else {
                C44124sEe.imLogConversation$default("unknown ConversationType:" + oKConversation.getConversationType() + "-->conversation:" + oKConversation, null, 2, null);
            }
        }
        return arrayList;
    }

    public final void KWHzl() {
        if (this.isConnected) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), sDN.copydefault.copydefault(), null, new BaseConversationListViewModel$fetchNotificationConversations$1(this, null), 2, null);
        }
    }

    public final void RcXXUw() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), sDN.copydefault.copydefault(), null, new BaseConversationListViewModel$refreshNotificationConversations$1(this, null), 2, null);
    }

    public final String fIwbmz() {
        String lowerCase;
        String str = this.valueOf;
        String str2 = "";
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        } else {
            lowerCase = null;
        }
        String value = ChatOrigin.P2P.getValue();
        Locale locale = Locale.ROOT;
        String lowerCase2 = value.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        if (Intrinsics.EZpvd((Object) lowerCase, (Object) lowerCase2)) {
            str2 = OtcRouteConst.P2P;
        } else {
            String lowerCase3 = ChatOrigin.AFFILIATE.getValue().toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
            if (Intrinsics.EZpvd((Object) lowerCase, (Object) lowerCase3)) {
                str2 = "affiliate";
            }
        }
        return C33129mqd.gEmmrt(str2);
    }

    public final void fFgQHt() {
        final String strFIwbmz = fIwbmz();
        C32866mlf.onEvent$default("IMHomepage_Full_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.nHv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BaseConversationListViewModel.AEQbTJ(strFIwbmz, (EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    public static final Unit AEQbTJ(String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("origin", str, true);
        return Unit.INSTANCE;
    }

    public final void KWHzl(Throwable th) {
        String message;
        sEF sef = sEF.OLrzqt;
        EventData eventDataAEQbTJ = sef.AEQbTJ();
        eventDataAEQbTJ.setMsg("[In-House] Conversation list flow: Error");
        if (th == null || (message = th.getMessage()) == null) {
            message = "";
        }
        eventDataAEQbTJ.setAttrs(C56423yEv.EZpvd(C56390yDp.OLrzqt("path", message)));
        sef.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ);
    }

    public final void AEQbTJ(int i, int i2) {
        PageTrackData pageTrackData = this.AkhnZx.get(Integer.valueOf(i2));
        if (pageTrackData != null) {
            if (!(!pageTrackData.isPageEventTracked())) {
                pageTrackData = null;
            }
            if (pageTrackData != null) {
                this.AkhnZx.put(Integer.valueOf(i2), PageTrackData.copy$default(pageTrackData, 0, 0L, true, 3, null));
                long jCurrentTimeMillis = System.currentTimeMillis() - pageTrackData.getStartTime();
                String strFIwbmz = fIwbmz();
                sEF sef = sEF.OLrzqt;
                EventData eventDataAEQbTJ = sef.AEQbTJ();
                eventDataAEQbTJ.setMsg("[In-House] Conversation list flow first return: Success");
                eventDataAEQbTJ.setAttrs(C56424yEw.gEmmrt(C56390yDp.OLrzqt("isAppDebuggable", String.valueOf(i)), C56390yDp.OLrzqt("totalTime", String.valueOf(jCurrentTimeMillis)), C56390yDp.OLrzqt("isRunningInEmulator", strFIwbmz)));
                sef.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ);
                if (i2 == 1) {
                    C44124sEe.imLogConversation$default("[In-House] Conversation list flow - first success, total time: " + jCurrentTimeMillis + ", resultSize:" + i, null, 2, null);
                }
                C44124sEe.imLogConversation$default("Track conversation List Page Loaded: page:" + i2 + ", totalTime: " + jCurrentTimeMillis + ", resultSize: " + i, null, 2, null);
            }
        }
    }
}
