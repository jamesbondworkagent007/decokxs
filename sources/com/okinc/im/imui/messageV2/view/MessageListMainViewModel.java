package com.okinc.im.imui.messageV2.view;

import android.content.SharedPreferences;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.bean.ChatOrigin;
import com.okinc.im.config.page.IMPageType;
import com.okinc.im.config.serviceprovider.GeneralAction;
import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import com.okinc.im.imui.messageV2.model.StringResource;
import com.okinc.im.imui.messageV2.view.MessageListMainViewModel;
import com.okinc.im.usecase.ObserveKeyboardInputStateUseCase;
import com.okinc.im.widgets.inputpanel.InputMode;
import com.okinc.okimcore.model.im.GroupVoiceCallData;
import com.okinc.okimcore.model.im.GroupVoiceCallUser;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.RelationSourceType;
import com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.inhouseim.ContractAddressTokenInfo;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC35281nsP;
import o.AbstractC36555odF;
import o.AbstractC43419rot;
import o.C32989mnw;
import o.C35182nqW;
import o.C35257nrs;
import o.C35399nuc;
import o.C35783oDn;
import o.C35813oEq;
import o.C35820oEx;
import o.C35859oGi;
import o.C35864oGn;
import o.C36588odm;
import o.C36596odu;
import o.C36598odw;
import o.C37721ozF;
import o.C44157sFk;
import o.C44288sKg;
import o.C44373sNk;
import o.C44460sQq;
import o.C44467sQx;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.C56444yFp;
import o.InterfaceC35284nsS;
import o.InterfaceC35289nsX;
import o.InterfaceC44293sKl;
import o.InterfaceC44487sRq;
import o.InterfaceC56388yDn;
import o.InterfaceC56445yFq;
import o.InterfaceC56514yIe;
import o.oCI;
import o.oCJ;
import o.oCM;
import o.oCO;
import o.oDA;
import o.oDI;
import o.oDO;
import o.oFA;
import o.oFF;
import o.oFH;
import o.oFI;
import o.oFM;
import o.oFQ;
import o.oFT;
import o.oGB;
import o.oGC;
import o.oGL;
import o.oGN;
import o.oGP;
import o.pUU;
import o.sIR;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageListMainViewModel extends ViewModel {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final MutableLiveData<C32989mnw<StringResource>> AEQbTJ;
    public final MutableLiveData<Boolean> AYXKKw;
    public final MutableLiveData<InputMode> AhwBna;
    public final MutableStateFlow<Boolean> AkhnZx;
    public final MutableSharedFlow<Boolean> AuCTel;
    public final MutableLiveData<C32989mnw<String>> AuCTelauCTel;
    public final oCM AubY;
    public final LiveData<OKConversation> AwvSrB;
    public final LiveData<String> AxsJAY;
    public final MutableLiveData<Boolean> AxsJAYaxsJAY;
    public final LiveData<Boolean> AxsJAYsNCnLh;
    public final LiveData<Boolean> DAIeex;
    public final LiveData<ObserveKeyboardInputStateUseCase.KeyboardInputState> DCJXGO;
    public final oFH DCUTEI;
    public final LiveData<ContractAddressTokenInfo> DLWbHP;
    public final oGN DTwDnp;
    public final InterfaceC44293sKl DXXBbs;
    public final oCI DarRvM;
    public final MutableLiveData<AbstractC35281nsP> DbNXlk;
    public final MediatorLiveData<OKConversation> EZpvd;
    public final oFQ OBJEWx;
    public final ActionBar ODWQjV;
    public final LiveData<C32989mnw<String>> ODXsMY;
    public final oGC OFhtUX;
    public final SharedFlow<Boolean> OHqIaq;
    public final MutableLiveData<C32989mnw<Unit>> OLrzqt;
    public final LiveData<C32989mnw<List<GeneralAction>>> ORxRYg;
    public final LiveData<C32989mnw<StringResource>> OcIXYQ;
    public final MutableSharedFlow<Unit> OqFWZa;
    public final oFM OuxcSI;
    public final C35783oDn OxVOHk;
    public final oGP QHmsKR;
    public final TaskDescription QKVWgx;
    public final LiveData<Boolean> QKudOq;
    public final oGL QOLQEE;
    public final oFT QSBOWP;
    public final SharedFlow<Boolean> QSLkRj;
    public final oDA QUSxYX;
    public final C35813oEq QVAiDq;
    public final LiveData<String> QVsKAR;
    public final oDO QbewEr;
    public final oFI QfsBiF;
    public final SharedFlow<Boolean> QkdxfA;
    public final C35859oGi RJOkX;
    public IMPageType RKDWNf;
    public final C44288sKg RcXXUw;
    public final C35820oEx RdAHlO;
    public final LiveData<Boolean> RlQdEF;
    public final oGB UeEOUB;
    public final Application aKErDB;
    public final LiveData<Boolean> accept;
    public final MutableLiveData<C32989mnw<Unit>> copydefault;
    public final LiveData<StringResource> dHguZz;
    public final C35864oGn dNCPSb;
    public final MutableLiveData<C32989mnw<List<GeneralAction>>> djBIcL;
    public final sIR djSkpj;
    public final LiveData<C32989mnw<Long>> dmfpNf;
    public final oCJ dvKsVJ;
    public final MutableLiveData<OKConversation> dxcTrN;
    public final MutableLiveData<C32989mnw<RetryEventType>> ejfBZ;
    public final MutableLiveData<Integer> fARcdN;
    public final SharedFlow<GroupInfo> fFgQHt;
    public final MutableStateFlow<Boolean> fIwbmz;
    public final MutableLiveData<C32989mnw<Unit>> fJNWhG;
    public boolean fZBcTu;
    public final MutableLiveData<Boolean> fetchVPNInfo;
    public final oDI ffGIBT;
    public IMPageType finit;
    public final LiveData<Boolean> flVtFt;
    public final LiveData<Boolean> fvQaOB;
    public final MutableSharedFlow<GroupInfo> gEmmrt;
    public boolean gGvvIC;
    public final MutableSharedFlow<Unit> gHZMYf;
    public Pair<? extends InputMode, ? extends InputMode> gasjUx;
    public final MutableSharedFlow<Boolean> getFieldNames;
    public final MutableLiveData<C32989mnw<String>> getNewProxyInstance;
    public final oFF getPostValueLengthLimit;
    public final MutableLiveData<Boolean> giSNqX;
    public final LiveData<Boolean> gkJEwt;
    public final LiveData<C32989mnw<Unit>> gwTjWJ;
    public final LiveData<C32989mnw<String>> hBpjJd;
    public final MutableLiveData<ContractAddressTokenInfo> hDKMBd;
    public final MutableLiveData<Boolean> hUfVAv;
    public final InterfaceC44487sRq hrNTAI;
    public boolean iRxXKY;
    public final LiveData<Boolean> iZzfmt;
    public final MutableLiveData<Boolean> isConnected;
    public final MutableLiveData<C32989mnw<Long>> iwGUEr;
    public final oCO sSMYrx;
    public final MutableLiveData<C32989mnw<C36598odw>> uzCIH;
    public final MutableLiveData<C32989mnw<AbstractC36555odF>> valueOf;
    public final MutableLiveData<AbstractC35281nsP> values;
    public boolean wlaJM;
    public final MutableLiveData<String> zLjUOn;
    public final MutableSharedFlow<Boolean> zsXlph;
    public final oFA zuBGHE;
    public final ObserveKeyboardInputStateUseCase zuWLRA;

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;

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
            KWHzl = iArr;
        }
    }

    public static final /* synthetic */ class Fragment implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(Function1 function1) {
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
    public final MutableSharedFlow<Unit> AYXKKw() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> AhwBna() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> AkhnZx() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableSharedFlow<Unit> AuCTel() {
        return this.OqFWZa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<String> AuCTelauCTel() {
        return this.QVsKAR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> AubY() {
        return this.OHqIaq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> AwvSrB() {
        return this.fvQaOB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> AxsJAY() {
        return this.QSLkRj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> DTwDnp() {
        return this.iZzfmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<AbstractC36555odF>> DbNXlk() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> OcIXYQ() {
        return this.gkJEwt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> QKVWgx() {
        return this.RlQdEF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> QUSxYX() {
        return this.AxsJAYsNCnLh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> QVAiDq() {
        return this.QKudOq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> QfsBiF() {
        return this.DAIeex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> dNCPSb() {
        return this.accept;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<AbstractC35281nsP> ejfBZ() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> fARcdN() {
        return this.QkdxfA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> fIwbmz() {
        return this.gwTjWJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<AbstractC35281nsP> fJNWhG() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.Pair<? extends com.okinc.im.widgets.inputpanel.InputMode, ? extends com.okinc.im.widgets.inputpanel.InputMode>, kotlin.Pair<com.okinc.im.widgets.inputpanel.InputMode, com.okinc.im.widgets.inputpanel.InputMode> */
    public final Pair<InputMode, InputMode> fetchVPNInfo() {
        return this.gasjUx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<StringResource>> gEmmrt() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> gHZMYf() {
        return this.flVtFt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<RetryEventType>> getFieldNames() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Integer> getNewProxyInstance() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<String>> hDKMBd() {
        return this.hBpjJd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<List<GeneralAction>>> isConnected() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<C36598odw>> iwGUEr() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<StringResource> uzCIH() {
        return this.dHguZz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<GroupInfo> values() {
        return this.fFgQHt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<String>> wlaJM() {
        return this.ODXsMY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<ContractAddressTokenInfo> zLjUOn() {
        return this.DLWbHP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Long>> zsXlph() {
        return this.dmfpNf;
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX WARN: Failed to check method usage
    java.lang.NullPointerException
     */
    public static final /* synthetic */ IMPageType fetchVPNInfo(MessageListMainViewModel messageListMainViewModel) {
        return messageListMainViewModel.RKDWNf;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.messageV2.view.MessageListMainViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @yCM
    public MessageListMainViewModel(@NotNull InterfaceC44293sKl interfaceC44293sKl, @NotNull oCJ ocj, @NotNull oCI oci, @NotNull oFH ofh, @NotNull oFF off, @NotNull oCM ocm, @NotNull oCO oco, @NotNull C35859oGi c35859oGi, @NotNull oGL ogl, @NotNull oGP ogp, @NotNull oDA oda, @NotNull oDO odo, @NotNull oGN ogn, @NotNull oFI ofi, @NotNull C35813oEq c35813oEq, @NotNull C35820oEx c35820oEx, @NotNull ObserveKeyboardInputStateUseCase observeKeyboardInputStateUseCase, @NotNull sIR sir, @NotNull oFA ofa, @NotNull C35864oGn c35864oGn, @NotNull InterfaceC44487sRq interfaceC44487sRq, @NotNull oGB ogb, @NotNull oGC ogc, @NotNull C44288sKg c44288sKg, @NotNull oFT oft, @NotNull oFM ofm, @NotNull oFQ ofq, @NotNull C35783oDn c35783oDn, @NotNull oDI odi) {
        Intrinsics.checkNotNullParameter(interfaceC44293sKl, "");
        Intrinsics.checkNotNullParameter(ocj, "");
        Intrinsics.checkNotNullParameter(oci, "");
        Intrinsics.checkNotNullParameter(ofh, "");
        Intrinsics.checkNotNullParameter(off, "");
        Intrinsics.checkNotNullParameter(ocm, "");
        Intrinsics.checkNotNullParameter(oco, "");
        Intrinsics.checkNotNullParameter(c35859oGi, "");
        Intrinsics.checkNotNullParameter(ogl, "");
        Intrinsics.checkNotNullParameter(ogp, "");
        Intrinsics.checkNotNullParameter(oda, "");
        Intrinsics.checkNotNullParameter(odo, "");
        Intrinsics.checkNotNullParameter(ogn, "");
        Intrinsics.checkNotNullParameter(ofi, "");
        Intrinsics.checkNotNullParameter(c35813oEq, "");
        Intrinsics.checkNotNullParameter(c35820oEx, "");
        Intrinsics.checkNotNullParameter(observeKeyboardInputStateUseCase, "");
        Intrinsics.checkNotNullParameter(sir, "");
        Intrinsics.checkNotNullParameter(ofa, "");
        Intrinsics.checkNotNullParameter(c35864oGn, "");
        Intrinsics.checkNotNullParameter(interfaceC44487sRq, "");
        Intrinsics.checkNotNullParameter(ogb, "");
        Intrinsics.checkNotNullParameter(ogc, "");
        Intrinsics.checkNotNullParameter(c44288sKg, "");
        Intrinsics.checkNotNullParameter(oft, "");
        Intrinsics.checkNotNullParameter(ofm, "");
        Intrinsics.checkNotNullParameter(ofq, "");
        Intrinsics.checkNotNullParameter(c35783oDn, "");
        Intrinsics.checkNotNullParameter(odi, "");
        this.DXXBbs = interfaceC44293sKl;
        this.dvKsVJ = ocj;
        this.DarRvM = oci;
        this.DCUTEI = ofh;
        this.getPostValueLengthLimit = off;
        this.AubY = ocm;
        this.sSMYrx = oco;
        this.RJOkX = c35859oGi;
        this.QOLQEE = ogl;
        this.QHmsKR = ogp;
        this.QUSxYX = oda;
        this.QbewEr = odo;
        this.DTwDnp = ogn;
        this.QfsBiF = ofi;
        this.QVAiDq = c35813oEq;
        this.RdAHlO = c35820oEx;
        this.zuWLRA = observeKeyboardInputStateUseCase;
        this.djSkpj = sir;
        this.zuBGHE = ofa;
        this.dNCPSb = c35864oGn;
        this.hrNTAI = interfaceC44487sRq;
        this.UeEOUB = ogb;
        this.OFhtUX = ogc;
        this.RcXXUw = c44288sKg;
        this.QSBOWP = oft;
        this.OuxcSI = ofm;
        this.OBJEWx = ofq;
        this.OxVOHk = c35783oDn;
        this.ffGIBT = odi;
        MutableLiveData<C32989mnw<StringResource>> mutableLiveData = new MutableLiveData<>();
        this.AEQbTJ = mutableLiveData;
        this.OcIXYQ = mutableLiveData;
        MutableLiveData<C32989mnw<String>> mutableLiveData2 = new MutableLiveData<>();
        this.getNewProxyInstance = mutableLiveData2;
        this.hBpjJd = mutableLiveData2;
        MutableLiveData<C32989mnw<AbstractC36555odF>> mutableLiveData3 = new MutableLiveData<>();
        this.valueOf = mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4 = new MutableLiveData<>();
        this.giSNqX = mutableLiveData4;
        MutableLiveData<InputMode> mutableLiveData5 = new MutableLiveData<>();
        this.AhwBna = mutableLiveData5;
        InputMode inputMode = InputMode.DefaultMode;
        this.gasjUx = new Pair<>(inputMode, inputMode);
        MutableLiveData<OKConversation> mutableLiveData6 = new MutableLiveData<>();
        this.dxcTrN = mutableLiveData6;
        LiveData<String> map = Transformations.map(mutableLiveData6, new Function1() { // from class: o.ofR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListMainViewModel.AEQbTJ((OKConversation) obj);
            }
        });
        this.AxsJAY = map;
        MutableLiveData<Boolean> mutableLiveData7 = new MutableLiveData<>(Boolean.FALSE);
        this.fetchVPNInfo = mutableLiveData7;
        LiveData<ObserveKeyboardInputStateUseCase.KeyboardInputState> liveDataDistinctUntilChanged = Transformations.distinctUntilChanged(Transformations.switchMap(map, new Function1() { // from class: o.ofS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListMainViewModel.AEQbTJ(this.EZpvd, (java.lang.String) obj);
            }
        }));
        this.DCJXGO = liveDataDistinctUntilChanged;
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(mutableLiveData3, new Fragment(new Function1() { // from class: o.ofY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListMainViewModel.copydefault(mediatorLiveData, this, (C32989mnw) obj);
            }
        }));
        mediatorLiveData.addSource(liveDataDistinctUntilChanged, new Fragment(new Function1() { // from class: o.ofX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListMainViewModel.OLrzqt(mediatorLiveData, this, (ObserveKeyboardInputStateUseCase.KeyboardInputState) obj);
            }
        }));
        mediatorLiveData.addSource(mutableLiveData7, new Fragment(new Function1() { // from class: o.ogd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListMainViewModel.isConnected(mediatorLiveData, this, (java.lang.Boolean) obj);
            }
        }));
        this.flVtFt = mediatorLiveData;
        final MediatorLiveData mediatorLiveData2 = new MediatorLiveData();
        mediatorLiveData2.addSource(mediatorLiveData, new Fragment(new Function1() { // from class: o.ogc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListMainViewModel.AuCTel(mediatorLiveData2, this, (java.lang.Boolean) obj);
            }
        }));
        mediatorLiveData2.addSource(mutableLiveData5, new Fragment(new Function1() { // from class: o.ogf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListMainViewModel.copydefault(mediatorLiveData2, this, (InputMode) obj);
            }
        }));
        this.AxsJAYsNCnLh = mediatorLiveData2;
        final MediatorLiveData mediatorLiveData3 = new MediatorLiveData();
        mediatorLiveData3.addSource(mediatorLiveData, new Fragment(new Function1() { // from class: o.ogb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListMainViewModel.iwGUEr(mediatorLiveData3, this, (java.lang.Boolean) obj);
            }
        }));
        mediatorLiveData3.addSource(mutableLiveData5, new Fragment(new Function1() { // from class: o.ogg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListMainViewModel.AYXKKw(mediatorLiveData3, this, (InputMode) obj);
            }
        }));
        mediatorLiveData3.addSource(mutableLiveData7, new Fragment(new Function1() { // from class: o.ogk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListMainViewModel.fIwbmz(mediatorLiveData3, this, (java.lang.Boolean) obj);
            }
        }));
        this.accept = mediatorLiveData3;
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.AuCTel = mutableSharedFlowMutableSharedFlow$default;
        this.QkdxfA = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        final MediatorLiveData mediatorLiveData4 = new MediatorLiveData();
        mediatorLiveData4.addSource(mediatorLiveData, new Fragment(new Function1() { // from class: o.ofT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListMainViewModel.fetchVPNInfo(mediatorLiveData4, this, (java.lang.Boolean) obj);
            }
        }));
        mediatorLiveData4.addSource(mutableLiveData5, new Fragment(new Function1() { // from class: o.oge
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListMainViewModel.KWHzl(mediatorLiveData4, this, (InputMode) obj);
            }
        }));
        mediatorLiveData4.addSource(FlowLiveDataConversions.asLiveData$default(mutableSharedFlowMutableSharedFlow$default, (CoroutineContext) null, 0L, 3, (Object) null), new Fragment(new Function1() { // from class: o.ogh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListMainViewModel.fJNWhG(mediatorLiveData4, this, (java.lang.Boolean) obj);
            }
        }));
        this.RlQdEF = mediatorLiveData4;
        final MediatorLiveData mediatorLiveData5 = new MediatorLiveData();
        mediatorLiveData5.addSource(mutableLiveData3, new Fragment(new Function1() { // from class: o.ogi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListMainViewModel.djBIcL(mediatorLiveData5, this, (C32989mnw) obj);
            }
        }));
        mediatorLiveData5.addSource(mutableLiveData4, new Fragment(new Function1() { // from class: o.ogm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListMainViewModel.ejfBZ(mediatorLiveData5, this, (java.lang.Boolean) obj);
            }
        }));
        this.QKudOq = Transformations.distinctUntilChanged(mediatorLiveData5);
        final MediatorLiveData mediatorLiveData6 = new MediatorLiveData();
        mediatorLiveData6.addSource(mutableLiveData3, new Fragment(new Function1() { // from class: o.ogp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListMainViewModel.valueOf(mediatorLiveData6, this, (C32989mnw) obj);
            }
        }));
        mediatorLiveData6.addSource(mutableLiveData4, new Fragment(new Function1() { // from class: o.ogn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListMainViewModel.fARcdN(mediatorLiveData6, this, (java.lang.Boolean) obj);
            }
        }));
        this.DAIeex = Transformations.distinctUntilChanged(mediatorLiveData6);
        final MediatorLiveData mediatorLiveData7 = new MediatorLiveData();
        mediatorLiveData7.addSource(mutableLiveData3, new Fragment(new Function1() { // from class: o.ogo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListMainViewModel.AYXKKw(mediatorLiveData7, this, (C32989mnw) obj);
            }
        }));
        mediatorLiveData7.addSource(mutableLiveData4, new Fragment(new Function1() { // from class: o.ogl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListMainViewModel.uzCIH(mediatorLiveData7, this, (java.lang.Boolean) obj);
            }
        }));
        this.dHguZz = Transformations.distinctUntilChanged(mediatorLiveData7);
        this.ejfBZ = new MutableLiveData<>();
        this.copydefault = new MutableLiveData<>();
        this.fARcdN = new MutableLiveData<>();
        MutableLiveData<Boolean> mutableLiveData8 = new MutableLiveData<>();
        this.AYXKKw = mutableLiveData8;
        this.gkJEwt = Transformations.distinctUntilChanged(mutableLiveData8);
        MutableLiveData<Boolean> mutableLiveData9 = new MutableLiveData<>();
        this.isConnected = mutableLiveData9;
        this.iZzfmt = Transformations.distinctUntilChanged(mutableLiveData9);
        MutableLiveData<Boolean> mutableLiveData10 = new MutableLiveData<>();
        this.hUfVAv = mutableLiveData10;
        MutableLiveData<Boolean> mutableLiveData11 = new MutableLiveData<>();
        this.AxsJAYaxsJAY = mutableLiveData11;
        final MediatorLiveData mediatorLiveData8 = new MediatorLiveData();
        mediatorLiveData8.addSource(mutableLiveData10, new Fragment(new Function1() { // from class: o.ofU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListMainViewModel.AkhnZx(mediatorLiveData8, this, (java.lang.Boolean) obj);
            }
        }));
        mediatorLiveData8.addSource(mutableLiveData11, new Fragment(new Function1() { // from class: o.ofV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListMainViewModel.DbNXlk(mediatorLiveData8, this, (java.lang.Boolean) obj);
            }
        }));
        this.fvQaOB = Transformations.distinctUntilChanged(mediatorLiveData8);
        this.OLrzqt = new MutableLiveData<>();
        this.uzCIH = new MutableLiveData<>();
        this.values = new MutableLiveData<>(null);
        this.DbNXlk = new MutableLiveData<>(null);
        this.RKDWNf = IMPageType.NORMAL_IM;
        this.OqFWZa = C37721ozF.AEQbTJ();
        LiveData<OKConversation> liveDataSwitchMap = Transformations.switchMap(map, new Function1() { // from class: o.oga
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListMainViewModel.EZpvd(this.AEQbTJ, (java.lang.String) obj);
            }
        });
        this.AwvSrB = liveDataSwitchMap;
        final MediatorLiveData<OKConversation> mediatorLiveData9 = new MediatorLiveData<>();
        mediatorLiveData9.addSource(liveDataSwitchMap, new Fragment(new Function1() { // from class: o.ofZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListMainViewModel.AEQbTJ(mediatorLiveData9, (OKConversation) obj);
            }
        }));
        mediatorLiveData9.addSource(mutableLiveData6, new Fragment(new Function1() { // from class: o.ofW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListMainViewModel.OLrzqt(mediatorLiveData9, (OKConversation) obj);
            }
        }));
        this.EZpvd = mediatorLiveData9;
        MutableLiveData<C32989mnw<List<GeneralAction>>> mutableLiveData12 = new MutableLiveData<>();
        this.djBIcL = mutableLiveData12;
        this.ORxRYg = mutableLiveData12;
        MutableLiveData<C32989mnw<Unit>> mutableLiveData13 = new MutableLiveData<>();
        this.fJNWhG = mutableLiveData13;
        this.gwTjWJ = mutableLiveData13;
        MutableSharedFlow<Boolean> mutableSharedFlowAEQbTJ = C37721ozF.AEQbTJ();
        this.zsXlph = mutableSharedFlowAEQbTJ;
        this.QSLkRj = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ);
        MutableSharedFlow<GroupInfo> mutableSharedFlowAEQbTJ2 = C37721ozF.AEQbTJ();
        this.gEmmrt = mutableSharedFlowAEQbTJ2;
        this.fFgQHt = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ2);
        Boolean bool = Boolean.TRUE;
        this.fIwbmz = StateFlowKt.MutableStateFlow(bool);
        this.AkhnZx = StateFlowKt.MutableStateFlow(bool);
        MutableSharedFlow<Boolean> mutableSharedFlowAEQbTJ3 = C37721ozF.AEQbTJ();
        this.getFieldNames = mutableSharedFlowAEQbTJ3;
        this.OHqIaq = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ3);
        MutableLiveData<String> mutableLiveData14 = new MutableLiveData<>("");
        this.zLjUOn = mutableLiveData14;
        this.QVsKAR = mutableLiveData14;
        MutableLiveData<ContractAddressTokenInfo> mutableLiveData15 = new MutableLiveData<>();
        this.hDKMBd = mutableLiveData15;
        this.DLWbHP = mutableLiveData15;
        MutableLiveData<C32989mnw<String>> mutableLiveData16 = new MutableLiveData<>();
        this.AuCTelauCTel = mutableLiveData16;
        this.ODXsMY = mutableLiveData16;
        MutableLiveData<C32989mnw<Long>> mutableLiveData17 = new MutableLiveData<>();
        this.iwGUEr = mutableLiveData17;
        this.dmfpNf = mutableLiveData17;
        this.gHZMYf = C37721ozF.AEQbTJ();
        this.aKErDB = new Application();
        this.ODWQjV = new ActionBar();
        this.QKVWgx = new TaskDescription();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class RetryEventType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ RetryEventType[] $VALUES;
        public static final RetryEventType RETRY_INIT_CONVERSATION = new RetryEventType("RETRY_INIT_CONVERSATION", 0);
        public static final RetryEventType RETRY_MESSAGE_LIST = new RetryEventType("RETRY_MESSAGE_LIST", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ RetryEventType[] $values() {
            return new RetryEventType[]{RETRY_INIT_CONVERSATION, RETRY_MESSAGE_LIST};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<RetryEventType> getEntries() {
            return $ENTRIES;
        }

        private RetryEventType(String str, int i) {
        }

        static {
            RetryEventType[] retryEventTypeArr$values = $values();
            $VALUES = retryEventTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(retryEventTypeArr$values);
        }

        public static RetryEventType valueOf(String str) {
            return (RetryEventType) Enum.valueOf(RetryEventType.class, str);
        }

        public static RetryEventType[] values() {
            return (RetryEventType[]) $VALUES.clone();
        }
    }

    public static final String AEQbTJ(OKConversation oKConversation) {
        return oKConversation.getTargetId();
    }

    public static final LiveData AEQbTJ(MessageListMainViewModel messageListMainViewModel, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return StringsKt__StringsKt.fARcdN((CharSequence) str) ? new MutableLiveData(ObserveKeyboardInputStateUseCase.KeyboardInputState.Unknown) : FlowLiveDataConversions.asLiveData$default(messageListMainViewModel.zuWLRA.EZpvd(str), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public static final Unit copydefault(MediatorLiveData mediatorLiveData, MessageListMainViewModel messageListMainViewModel, C32989mnw c32989mnw) {
        mediatorLiveData.setValue(Boolean.valueOf(messageListMainViewModel.zuBGHE()));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(MediatorLiveData mediatorLiveData, MessageListMainViewModel messageListMainViewModel, ObserveKeyboardInputStateUseCase.KeyboardInputState keyboardInputState) {
        mediatorLiveData.setValue(Boolean.valueOf(messageListMainViewModel.zuBGHE()));
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(MediatorLiveData mediatorLiveData, MessageListMainViewModel messageListMainViewModel, Boolean bool) {
        mediatorLiveData.setValue(Boolean.valueOf(messageListMainViewModel.zuBGHE()));
        return Unit.INSTANCE;
    }

    public static final Unit AuCTel(MediatorLiveData mediatorLiveData, MessageListMainViewModel messageListMainViewModel, Boolean bool) {
        mediatorLiveData.setValue(Boolean.valueOf(messageListMainViewModel.RcXXUw()));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(MediatorLiveData mediatorLiveData, MessageListMainViewModel messageListMainViewModel, InputMode inputMode) {
        mediatorLiveData.setValue(Boolean.valueOf(messageListMainViewModel.RcXXUw()));
        return Unit.INSTANCE;
    }

    public static final Unit iwGUEr(MediatorLiveData mediatorLiveData, MessageListMainViewModel messageListMainViewModel, Boolean bool) {
        mediatorLiveData.setValue(Boolean.valueOf(messageListMainViewModel.UeEOUB()));
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(MediatorLiveData mediatorLiveData, MessageListMainViewModel messageListMainViewModel, InputMode inputMode) {
        mediatorLiveData.setValue(Boolean.valueOf(messageListMainViewModel.UeEOUB()));
        return Unit.INSTANCE;
    }

    public static final Unit fIwbmz(MediatorLiveData mediatorLiveData, MessageListMainViewModel messageListMainViewModel, Boolean bool) {
        mediatorLiveData.setValue(Boolean.valueOf(messageListMainViewModel.UeEOUB()));
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(MediatorLiveData mediatorLiveData, MessageListMainViewModel messageListMainViewModel, Boolean bool) {
        mediatorLiveData.setValue(Boolean.valueOf(messageListMainViewModel.QOLQEE()));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(MediatorLiveData mediatorLiveData, MessageListMainViewModel messageListMainViewModel, InputMode inputMode) {
        mediatorLiveData.setValue(Boolean.valueOf(messageListMainViewModel.QOLQEE()));
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG(MediatorLiveData mediatorLiveData, MessageListMainViewModel messageListMainViewModel, Boolean bool) {
        mediatorLiveData.setValue(Boolean.valueOf(messageListMainViewModel.QOLQEE()));
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(MediatorLiveData mediatorLiveData, MessageListMainViewModel messageListMainViewModel, C32989mnw c32989mnw) {
        mediatorLiveData.setValue(Boolean.valueOf(messageListMainViewModel.QbewEr()));
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(MediatorLiveData mediatorLiveData, MessageListMainViewModel messageListMainViewModel, Boolean bool) {
        mediatorLiveData.setValue(Boolean.valueOf(messageListMainViewModel.QbewEr()));
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(MediatorLiveData mediatorLiveData, MessageListMainViewModel messageListMainViewModel, C32989mnw c32989mnw) {
        mediatorLiveData.setValue(Boolean.valueOf(messageListMainViewModel.RJOkX()));
        return Unit.INSTANCE;
    }

    public static final Unit fARcdN(MediatorLiveData mediatorLiveData, MessageListMainViewModel messageListMainViewModel, Boolean bool) {
        mediatorLiveData.setValue(Boolean.valueOf(messageListMainViewModel.RJOkX()));
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(MediatorLiveData mediatorLiveData, MessageListMainViewModel messageListMainViewModel, C32989mnw c32989mnw) {
        mediatorLiveData.setValue(messageListMainViewModel.KWHzl());
        return Unit.INSTANCE;
    }

    public static final Unit uzCIH(MediatorLiveData mediatorLiveData, MessageListMainViewModel messageListMainViewModel, Boolean bool) {
        mediatorLiveData.setValue(messageListMainViewModel.KWHzl());
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(MediatorLiveData mediatorLiveData, MessageListMainViewModel messageListMainViewModel, Boolean bool) {
        mediatorLiveData.setValue(Boolean.valueOf(messageListMainViewModel.ORxRYg()));
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(MediatorLiveData mediatorLiveData, MessageListMainViewModel messageListMainViewModel, Boolean bool) {
        mediatorLiveData.setValue(Boolean.valueOf(messageListMainViewModel.ORxRYg()));
        return Unit.INSTANCE;
    }

    public static final LiveData EZpvd(MessageListMainViewModel messageListMainViewModel, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FlowLiveDataConversions.asLiveData$default(messageListMainViewModel.DarRvM.KWHzl(str), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public final LiveData<OKConversation> valueOf() {
        return Transformations.distinctUntilChanged(this.EZpvd);
    }

    public static final Unit AEQbTJ(MediatorLiveData mediatorLiveData, OKConversation oKConversation) {
        mediatorLiveData.setValue(oKConversation);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(MediatorLiveData mediatorLiveData, OKConversation oKConversation) {
        mediatorLiveData.setValue(oKConversation);
        return Unit.INSTANCE;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class Application extends C35257nrs {
        public Application() {
        }

        @Override // o.C35257nrs, o.InterfaceC44260sJf
        public void KWHzl(C44460sQq c44460sQq) {
            Intrinsics.checkNotNullParameter(c44460sQq, "");
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(MessageListMainViewModel.this), Dispatchers.getMain(), null, new MessageListMainViewModel$groupEventListener$1$onGroupDelete$1(c44460sQq, MessageListMainViewModel.this, null), 2, null);
        }
    }

    public static final class ActionBar extends C44373sNk {
        public ActionBar() {
        }

        @Override // o.C44373sNk, o.InterfaceC44291sKj
        public void KWHzl(C44467sQx c44467sQx) {
            Intrinsics.checkNotNullParameter(c44467sQx, "");
            super.KWHzl(c44467sQx);
            OKMessage oKMessageCopydefault = c44467sQx.copydefault();
            String str = (String) MessageListMainViewModel.this.AxsJAY.getValue();
            if (str != null && Intrinsics.EZpvd(oKMessageCopydefault.getTargetId(), MessageListMainViewModel.this.AxsJAY.getValue())) {
                MessageListMainViewModel.this.OLrzqt(str, oKMessageCopydefault);
            }
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class TaskDescription implements InterfaceC35289nsX {
        public TaskDescription() {
        }

        @Override // o.InterfaceC35289nsX
        public void KWHzl(GeneralAction generalAction) {
            InterfaceC35289nsX.ActionBar.OLrzqt(this, generalAction);
        }

        @Override // o.InterfaceC35289nsX
        public void AEQbTJ(List<? extends GeneralAction> list) {
            Intrinsics.checkNotNullParameter(list, "");
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(MessageListMainViewModel.this), null, null, new MessageListMainViewModel$executeGeneralActionServiceProvider$1$execute$1(MessageListMainViewModel.this, list, null), 3, null);
        }
    }

    public final boolean zuBGHE() {
        C32989mnw<AbstractC36555odF> value = this.valueOf.getValue();
        return ((value != null ? value.OLrzqt() : null) instanceof AbstractC36555odF.StateListAnimator) && this.DCJXGO.getValue() == ObserveKeyboardInputStateUseCase.KeyboardInputState.AllowInput && Intrinsics.EZpvd(this.fetchVPNInfo.getValue(), Boolean.FALSE);
    }

    public final boolean UeEOUB() {
        Boolean value = this.fetchVPNInfo.getValue();
        Boolean bool = Boolean.TRUE;
        return Intrinsics.EZpvd(value, bool) || (Intrinsics.EZpvd(this.flVtFt.getValue(), bool) && this.AhwBna.getValue() == InputMode.VoiceInput);
    }

    public final boolean RcXXUw() {
        return Intrinsics.EZpvd(this.flVtFt.getValue(), Boolean.TRUE) && this.AhwBna.getValue() == InputMode.StickerMode;
    }

    public final boolean QOLQEE() {
        return Intrinsics.EZpvd(this.flVtFt.getValue(), Boolean.TRUE) && this.AhwBna.getValue() == InputMode.PluginMode;
    }

    public final boolean QbewEr() {
        C32989mnw<AbstractC36555odF> value = this.valueOf.getValue();
        return Intrinsics.EZpvd(this.giSNqX.getValue(), Boolean.TRUE) || ((value != null ? value.OLrzqt() : null) instanceof AbstractC36555odF.TaskDescription);
    }

    public final StringResource KWHzl() {
        C32989mnw<AbstractC36555odF> value = this.valueOf.getValue();
        boolean z = (value != null ? value.OLrzqt() : null) instanceof AbstractC36555odF.TaskDescription;
        boolean zEZpvd = Intrinsics.EZpvd(this.giSNqX.getValue(), Boolean.TRUE);
        if (z) {
            return new StringResource.Raw("Initialisation failed");
        }
        if (zEZpvd) {
            return new StringResource.Res(C35399nuc.LoaderManager.DDjfYY);
        }
        return null;
    }

    public final boolean RJOkX() {
        C32989mnw<AbstractC36555odF> value = this.valueOf.getValue();
        return Intrinsics.EZpvd(this.giSNqX.getValue(), Boolean.TRUE) || ((value != null ? value.OLrzqt() : null) instanceof AbstractC36555odF.TaskDescription);
    }

    public final boolean ORxRYg() {
        Boolean value = this.hUfVAv.getValue();
        boolean zBooleanValue = value != null ? value.booleanValue() : false;
        Boolean value2 = this.AxsJAYaxsJAY.getValue();
        return zBooleanValue || (value2 != null ? value2.booleanValue() : false);
    }

    public final void EZpvd(boolean z) {
        this.giSNqX.setValue(Boolean.valueOf(z));
    }

    public final void AEQbTJ(boolean z) {
        this.hUfVAv.setValue(Boolean.valueOf(z));
    }

    public final void OLrzqt(boolean z) {
        this.isConnected.setValue(Boolean.valueOf(z));
    }

    public final void copydefault(boolean z) {
        this.AxsJAYaxsJAY.setValue(Boolean.valueOf(z));
    }

    public final void copydefault(String str, String str2, ChatOrigin chatOrigin, IMPageType iMPageType, String str3, Boolean bool) {
        this.finit = iMPageType;
        sIR sir = this.djSkpj;
        sir.copydefault(this.aKErDB);
        sir.KWHzl(this.aKErDB);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MessageListMainViewModel$init$2(this, str, str2, chatOrigin, str3, null), 3, null);
        if (Intrinsics.EZpvd(bool, Boolean.TRUE)) {
            fFgQHt();
        } else {
            this.fZBcTu = false;
            AEQbTJ();
        }
        if (C44157sFk.gEmmrt().values()) {
            djBIcL();
        }
    }

    public final void OLrzqt(String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new MessageListMainViewModel$observeGroupInfo$1(str, this, null), 2, null);
    }

    public final boolean EZpvd(GroupInfo groupInfo) {
        GroupVoiceCallConfig groupVoiceCallConfig;
        GroupVoiceCallData currentCall;
        List<GroupVoiceCallUser> activeUsers;
        if (groupInfo != null && (groupVoiceCallConfig = groupInfo.getGroupVoiceCallConfig()) != null && (currentCall = groupVoiceCallConfig.getCurrentCall()) != null && (activeUsers = currentCall.getActiveUsers()) != null) {
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(activeUsers, 10));
            Iterator<T> it = activeUsers.iterator();
            while (it.hasNext()) {
                arrayList.add(((GroupVoiceCallUser) it.next()).getUserUid());
            }
            if (arrayList.contains(C44157sFk.EZpvd())) {
                return true;
            }
        }
        return false;
    }

    public final void djBIcL() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MessageListMainViewModel$getAndSyncSticker$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        MessageListMainViewModel$refreshInfo$1 messageListMainViewModel$refreshInfo$1;
        MessageListMainViewModel messageListMainViewModel;
        if (continuation instanceof MessageListMainViewModel$refreshInfo$1) {
            messageListMainViewModel$refreshInfo$1 = (MessageListMainViewModel$refreshInfo$1) continuation;
            int i = messageListMainViewModel$refreshInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageListMainViewModel$refreshInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                messageListMainViewModel$refreshInfo$1 = new MessageListMainViewModel$refreshInfo$1(this, continuation);
            }
        }
        Object obj = messageListMainViewModel$refreshInfo$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = messageListMainViewModel$refreshInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            OKConversation value = valueOf().getValue();
            if (value != null) {
                int i3 = Activity.KWHzl[value.getConversationType().ordinal()];
                if (i3 == 1) {
                    String contactId = value.getContactId();
                    messageListMainViewModel$refreshInfo$1.L$0 = this;
                    messageListMainViewModel$refreshInfo$1.label = 1;
                    if (AEQbTJ(contactId, messageListMainViewModel$refreshInfo$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (i3 == 2) {
                    String targetId = value.getTargetId();
                    messageListMainViewModel$refreshInfo$1.L$0 = this;
                    messageListMainViewModel$refreshInfo$1.label = 2;
                    if (OLrzqt(targetId, messageListMainViewModel$refreshInfo$1) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            }
            messageListMainViewModel = this;
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            messageListMainViewModel = (MessageListMainViewModel) messageListMainViewModel$refreshInfo$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        MutableLiveData<C32989mnw<Unit>> mutableLiveData = messageListMainViewModel.fJNWhG;
        Unit unit = Unit.INSTANCE;
        mutableLiveData.postValue(new C32989mnw<>(unit));
        return unit;
    }

    public final void AEQbTJ() {
        OKConversation oKConversationOLrzqt;
        C32989mnw<AbstractC36555odF> value = DbNXlk().getValue();
        GroupTagType groupType = null;
        AbstractC36555odF abstractC36555odFOLrzqt = value != null ? value.OLrzqt() : null;
        boolean z = abstractC36555odFOLrzqt instanceof AbstractC36555odF.StateListAnimator;
        boolean z2 = this.fZBcTu;
        AbstractC36555odF.StateListAnimator stateListAnimator = z ? (AbstractC36555odF.StateListAnimator) abstractC36555odFOLrzqt : null;
        if (stateListAnimator != null && (oKConversationOLrzqt = stateListAnimator.OLrzqt()) != null) {
            groupType = oKConversationOLrzqt.getGroupType();
        }
        boolean zCopydefault = (groupType != GroupTagType.VIDEO_CALL_CHAT_GROUP && z && z2) ? this.DTwDnp.copydefault(this.RKDWNf) : false;
        if (zCopydefault) {
            this.uzCIH.setValue(new C32989mnw<>(C36598odw.OLrzqt));
        }
        pUU.KWHzl("MessageListMainViewModel", "hasConversationInitSuccess:" + z + ", checkShouldShowEditContactInfoDialog: " + zCopydefault + ", shouldShowEditContactInfoDialog: " + zCopydefault);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:53:0x0030 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r2v13, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r2v14, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r2v15, resolved type: com.okinc.im.imui.messageV2.view.MessageListMainViewModel */
    /* JADX DEBUG: Multi-variable search result rejected for r2v16, resolved type: com.okinc.im.imui.messageV2.view.MessageListMainViewModel */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: com.okinc.im.imui.messageV2.view.MessageListMainViewModel */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r2v1 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(String str, String str2, ChatOrigin chatOrigin, String str3, Continuation<? super Unit> continuation) throws Throwable {
        MessageListMainViewModel$initConversation$1 messageListMainViewModel$initConversation$1;
        Object objM7377constructorimpl;
        MessageListMainViewModel messageListMainViewModel;
        Throwable thM7380exceptionOrNullimpl;
        MutableLiveData<Boolean> mutableLiveData;
        Boolean boolKWHzl;
        String str4;
        String str5;
        MessageListMainViewModel messageListMainViewModel2;
        RelationSourceType relationSourceType;
        String str6 = str;
        String str7 = str2;
        if (continuation instanceof MessageListMainViewModel$initConversation$1) {
            messageListMainViewModel$initConversation$1 = (MessageListMainViewModel$initConversation$1) continuation;
            int i = messageListMainViewModel$initConversation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageListMainViewModel$initConversation$1.label = i - Integer.MIN_VALUE;
            } else {
                messageListMainViewModel$initConversation$1 = new MessageListMainViewModel$initConversation$1(this, continuation);
            }
        }
        Object objAEQbTJ = messageListMainViewModel$initConversation$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = messageListMainViewModel$initConversation$1.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            messageListMainViewModel = str7;
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            pUU.KWHzl("MessageListMainViewModel", "initConversation: channelId=" + str6 + ", relationId=" + str7 + ", chatOrigin=" + chatOrigin);
            RelationSourceType relationSourceTypeAEQbTJ = chatOrigin != null ? C35182nqW.AEQbTJ(chatOrigin) : null;
            this.fARcdN.setValue(relationSourceTypeAEQbTJ != null ? C56443yFo.AEQbTJ(relationSourceTypeAEQbTJ.getValue()) : null);
            MutableLiveData<Boolean> mutableLiveData2 = this.AYXKKw;
            Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
            messageListMainViewModel$initConversation$1.L$0 = this;
            messageListMainViewModel$initConversation$1.L$1 = str6;
            messageListMainViewModel$initConversation$1.L$2 = str7;
            messageListMainViewModel$initConversation$1.L$3 = str3;
            messageListMainViewModel$initConversation$1.L$4 = relationSourceTypeAEQbTJ;
            messageListMainViewModel$initConversation$1.label = 1;
            if (C36588odm.KWHzl(mutableLiveData2, boolKWHzl2, messageListMainViewModel$initConversation$1) == objCopydefault) {
                return objCopydefault;
            }
            str4 = str7;
            str5 = str3;
            messageListMainViewModel2 = this;
            relationSourceType = relationSourceTypeAEQbTJ;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objAEQbTJ);
                    return Unit.INSTANCE;
                }
                MessageListMainViewModel messageListMainViewModel3 = (MessageListMainViewModel) messageListMainViewModel$initConversation$1.L$0;
                C56391yDq.AEQbTJ(objAEQbTJ);
                str7 = messageListMainViewModel3;
                objM7377constructorimpl = Result.m7377constructorimpl((OKConversation) objAEQbTJ);
                messageListMainViewModel = str7;
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                    OKConversation oKConversation = (OKConversation) objM7377constructorimpl;
                    pUU.KWHzl("MessageListMainViewModel", "initConversation: success");
                    messageListMainViewModel.dxcTrN.setValue(oKConversation);
                    messageListMainViewModel.valueOf.setValue(new C32989mnw<>(new AbstractC36555odF.StateListAnimator(messageListMainViewModel.sSMYrx(), oKConversation)));
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.KWHzl("MessageListMainViewModel", "initConversation failed: " + thM7380exceptionOrNullimpl.getMessage());
                    MutableLiveData<C32989mnw<AbstractC36555odF>> mutableLiveData3 = messageListMainViewModel.valueOf;
                    String message = thM7380exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    mutableLiveData3.setValue(new C32989mnw<>(new AbstractC36555odF.TaskDescription(message)));
                }
                mutableLiveData = messageListMainViewModel.AYXKKw;
                boolKWHzl = C56443yFo.KWHzl(false);
                messageListMainViewModel$initConversation$1.L$0 = null;
                messageListMainViewModel$initConversation$1.L$1 = null;
                messageListMainViewModel$initConversation$1.L$2 = null;
                messageListMainViewModel$initConversation$1.L$3 = null;
                messageListMainViewModel$initConversation$1.L$4 = null;
                messageListMainViewModel$initConversation$1.label = 3;
                if (C36588odm.KWHzl(mutableLiveData, boolKWHzl, messageListMainViewModel$initConversation$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            RelationSourceType relationSourceType2 = (RelationSourceType) messageListMainViewModel$initConversation$1.L$4;
            String str8 = (String) messageListMainViewModel$initConversation$1.L$3;
            String str9 = (String) messageListMainViewModel$initConversation$1.L$2;
            String str10 = (String) messageListMainViewModel$initConversation$1.L$1;
            MessageListMainViewModel messageListMainViewModel4 = (MessageListMainViewModel) messageListMainViewModel$initConversation$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
            relationSourceType = relationSourceType2;
            str5 = str8;
            str6 = str10;
            messageListMainViewModel2 = messageListMainViewModel4;
            str4 = str9;
        }
        Result.Application application2 = Result.Companion;
        oCJ ocj = messageListMainViewModel2.dvKsVJ;
        messageListMainViewModel$initConversation$1.L$0 = messageListMainViewModel2;
        messageListMainViewModel$initConversation$1.L$1 = null;
        messageListMainViewModel$initConversation$1.L$2 = null;
        messageListMainViewModel$initConversation$1.L$3 = null;
        messageListMainViewModel$initConversation$1.L$4 = null;
        messageListMainViewModel$initConversation$1.label = 2;
        objAEQbTJ = ocj.AEQbTJ(str6, str4, relationSourceType, str5, messageListMainViewModel$initConversation$1);
        str7 = messageListMainViewModel2;
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl((OKConversation) objAEQbTJ);
        messageListMainViewModel = str7;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        mutableLiveData = messageListMainViewModel.AYXKKw;
        boolKWHzl = C56443yFo.KWHzl(false);
        messageListMainViewModel$initConversation$1.L$0 = null;
        messageListMainViewModel$initConversation$1.L$1 = null;
        messageListMainViewModel$initConversation$1.L$2 = null;
        messageListMainViewModel$initConversation$1.L$3 = null;
        messageListMainViewModel$initConversation$1.L$4 = null;
        messageListMainViewModel$initConversation$1.label = 3;
        if (C36588odm.KWHzl(mutableLiveData, boolKWHzl, messageListMainViewModel$initConversation$1) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055 A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:12:0x002a, B:24:0x0051, B:26:0x0055, B:27:0x005a, B:28:0x0065), top: B:47:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:12:0x002a, B:24:0x0051, B:26:0x0055, B:27:0x005a, B:28:0x0065), top: B:47:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(String str, Continuation<? super Unit> continuation) throws Throwable {
        MessageListMainViewModel$refreshRelationInfo$1 messageListMainViewModel$refreshRelationInfo$1;
        Throwable th;
        MessageListMainViewModel messageListMainViewModel;
        Object objM7377constructorimpl;
        Integer numOLrzqt;
        RelationInfo relationInfo;
        if (continuation instanceof MessageListMainViewModel$refreshRelationInfo$1) {
            messageListMainViewModel$refreshRelationInfo$1 = (MessageListMainViewModel$refreshRelationInfo$1) continuation;
            int i = messageListMainViewModel$refreshRelationInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageListMainViewModel$refreshRelationInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                messageListMainViewModel$refreshRelationInfo$1 = new MessageListMainViewModel$refreshRelationInfo$1(this, continuation);
            }
        }
        Object objCopydefault = messageListMainViewModel$refreshRelationInfo$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = messageListMainViewModel$refreshRelationInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            if (str.length() > 0) {
                try {
                    Result.Application application = Result.Companion;
                    C35859oGi c35859oGi = this.RJOkX;
                    messageListMainViewModel$refreshRelationInfo$1.L$0 = this;
                    messageListMainViewModel$refreshRelationInfo$1.label = 1;
                    objCopydefault = c35859oGi.copydefault(str, null, messageListMainViewModel$refreshRelationInfo$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    messageListMainViewModel = this;
                    relationInfo = (RelationInfo) objCopydefault;
                    if (relationInfo == null) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    messageListMainViewModel = this;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        messageListMainViewModel = (MessageListMainViewModel) messageListMainViewModel$refreshRelationInfo$1.L$0;
        try {
            C56391yDq.AEQbTJ(objCopydefault);
            relationInfo = (RelationInfo) objCopydefault;
            if (relationInfo == null) {
                objM7377constructorimpl = Result.m7377constructorimpl(relationInfo);
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } catch (Throwable th3) {
            th = th3;
            Result.Application application22 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null && (numOLrzqt = C44157sFk.OLrzqt(thM7380exceptionOrNullimpl)) != null && numOLrzqt.intValue() == 4511) {
            messageListMainViewModel.OLrzqt.setValue(new C32989mnw<>(Unit.INSTANCE));
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(messageListMainViewModel), null, null, new MessageListMainViewModel$refreshRelationInfo$4$1(messageListMainViewModel, (RelationInfo) objM7377constructorimpl, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(String str, Continuation<? super Unit> continuation) throws Throwable {
        MessageListMainViewModel$refreshGroupInfo$1 messageListMainViewModel$refreshGroupInfo$1;
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        MessageListMainViewModel messageListMainViewModel;
        Object objM7377constructorimpl2;
        Integer numOLrzqt;
        if (continuation instanceof MessageListMainViewModel$refreshGroupInfo$1) {
            messageListMainViewModel$refreshGroupInfo$1 = (MessageListMainViewModel$refreshGroupInfo$1) continuation;
            int i = messageListMainViewModel$refreshGroupInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageListMainViewModel$refreshGroupInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                messageListMainViewModel$refreshGroupInfo$1 = new MessageListMainViewModel$refreshGroupInfo$1(this, continuation);
            }
        }
        Object objCopydefault = messageListMainViewModel$refreshGroupInfo$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = messageListMainViewModel$refreshGroupInfo$1.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            if (str.length() > 0) {
                try {
                    Result.Application application2 = Result.Companion;
                    oDA oda = this.QUSxYX;
                    messageListMainViewModel$refreshGroupInfo$1.L$0 = this;
                    messageListMainViewModel$refreshGroupInfo$1.L$1 = str;
                    messageListMainViewModel$refreshGroupInfo$1.label = 1;
                    objCopydefault = oda.copydefault(str, messageListMainViewModel$refreshGroupInfo$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    messageListMainViewModel = this;
                } catch (Throwable th2) {
                    th = th2;
                    messageListMainViewModel = this;
                    Result.Application application3 = Result.Companion;
                    objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            } else {
                messageListMainViewModel = this;
                Result.Application application4 = Result.Companion;
                oDO odo = messageListMainViewModel.QbewEr;
                messageListMainViewModel$refreshGroupInfo$1.L$0 = null;
                messageListMainViewModel$refreshGroupInfo$1.L$1 = null;
                messageListMainViewModel$refreshGroupInfo$1.label = 2;
                objCopydefault = odo.EZpvd(str, messageListMainViewModel$refreshGroupInfo$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                objM7377constructorimpl = Result.m7377constructorimpl((List) objCopydefault);
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
                objM7377constructorimpl = Result.m7377constructorimpl((List) objCopydefault);
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                    pUU.KWHzl("MessageListMainViewModel", "refresh member list: success, size=" + ((List) objM7377constructorimpl).size());
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("MessageListMainViewModel", "refresh member list: failed", thM7380exceptionOrNullimpl);
                }
                return Unit.INSTANCE;
            }
            str = (String) messageListMainViewModel$refreshGroupInfo$1.L$1;
            messageListMainViewModel = (MessageListMainViewModel) messageListMainViewModel$refreshGroupInfo$1.L$0;
            try {
                C56391yDq.AEQbTJ(objCopydefault);
            } catch (Throwable th3) {
                th = th3;
                Result.Application application32 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl2 = Result.m7377constructorimpl((GroupInfo) objCopydefault);
        Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
        if (thM7380exceptionOrNullimpl2 != null && (numOLrzqt = C44157sFk.OLrzqt(thM7380exceptionOrNullimpl2)) != null && numOLrzqt.intValue() == 4511) {
            messageListMainViewModel.OLrzqt.setValue(new C32989mnw<>(Unit.INSTANCE));
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl2)) {
            pUU.KWHzl("MessageListMainViewModel", "refresh group info: success");
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(messageListMainViewModel), null, null, new MessageListMainViewModel$refreshGroupInfo$4$1(messageListMainViewModel, (GroupInfo) objM7377constructorimpl2, null), 3, null);
        }
        Result.Application application42 = Result.Companion;
        oDO odo2 = messageListMainViewModel.QbewEr;
        messageListMainViewModel$refreshGroupInfo$1.L$0 = null;
        messageListMainViewModel$refreshGroupInfo$1.L$1 = null;
        messageListMainViewModel$refreshGroupInfo$1.label = 2;
        objCopydefault = odo2.EZpvd(str, messageListMainViewModel$refreshGroupInfo$1);
        if (objCopydefault == objCopydefault2) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl((List) objCopydefault);
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(@NotNull Continuation<? super Integer> continuation) throws Throwable {
        MessageListMainViewModel$getKeyboardHeight$1 messageListMainViewModel$getKeyboardHeight$1;
        if (continuation instanceof MessageListMainViewModel$getKeyboardHeight$1) {
            messageListMainViewModel$getKeyboardHeight$1 = (MessageListMainViewModel$getKeyboardHeight$1) continuation;
            int i = messageListMainViewModel$getKeyboardHeight$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageListMainViewModel$getKeyboardHeight$1.label = i - Integer.MIN_VALUE;
            } else {
                messageListMainViewModel$getKeyboardHeight$1 = new MessageListMainViewModel$getKeyboardHeight$1(this, continuation);
            }
        }
        Object objEZpvd = messageListMainViewModel$getKeyboardHeight$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = messageListMainViewModel$getKeyboardHeight$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            oGB ogb = this.UeEOUB;
            messageListMainViewModel$getKeyboardHeight$1.label = 1;
            objEZpvd = ogb.EZpvd("keyboard_height", messageListMainViewModel$getKeyboardHeight$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        Integer num = (Integer) objEZpvd;
        return C56443yFo.AEQbTJ(num != null ? num.intValue() : 0);
    }

    public final Object AEQbTJ(final int i, @NotNull Continuation<? super Unit> continuation) {
        Object objOLrzqt = this.OFhtUX.OLrzqt(new Function1() { // from class: o.ogj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MessageListMainViewModel.OLrzqt(i, (SharedPreferences.Editor) obj);
            }
        }, continuation);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
    }

    public static final Unit OLrzqt(int i, SharedPreferences.Editor editor) {
        Intrinsics.checkNotNullParameter(editor, "");
        editor.putInt("keyboard_height", i);
        return Unit.INSTANCE;
    }

    public final void fFgQHt() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MessageListMainViewModel$preloadUserInfo$1(this, null), 3, null);
    }

    public final void aKErDB() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new MessageListMainViewModel$observeBannerConfigFragments$1(this, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new MessageListMainViewModel$observeBannerConfigFragments$2(this, null), 2, null);
    }

    public final void djSkpj() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MessageListMainViewModel$observePageConfigFlags$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MessageListMainViewModel$observePageConfigFlags$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MessageListMainViewModel$observePageConfigFlags$3(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MessageListMainViewModel$observePageConfigFlags$4(this, null), 3, null);
    }

    public final void OLrzqt(String str, OKMessage oKMessage) {
        if (this.iRxXKY) {
            pUU.KWHzl("MessageListMainViewModel", "checkIsPageSwitched - already handled, no action");
            return;
        }
        IMPageType iMPageTypeAEQbTJ = this.zuBGHE.AEQbTJ(oKMessage, valueOf().getValue(), this.RKDWNf);
        if (iMPageTypeAEQbTJ != null) {
            pUU.KWHzl("MessageListMainViewModel", "Handle onPageSwitched - newPageType:" + iMPageTypeAEQbTJ);
            this.iRxXKY = true;
            InterfaceC35284nsS interfaceC35284nsSOLrzqt = C36596odu.copydefault.OLrzqt(iMPageTypeAEQbTJ);
            if (interfaceC35284nsSOLrzqt != null) {
                OKMessageContent content = oKMessage.getContent();
                interfaceC35284nsSOLrzqt.AEQbTJ(str, content != null ? content.getExtra() : null, this.QKVWgx);
            }
        }
    }

    public final IMPageType sSMYrx() {
        IMPageType iMPageTypeKWHzl = this.QfsBiF.KWHzl(this.finit, valueOf().getValue());
        this.RKDWNf = iMPageTypeKWHzl;
        return iMPageTypeKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(@NotNull List<String> list, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        MessageListMainViewModel$getTokenPreview$1 messageListMainViewModel$getTokenPreview$1;
        MessageListMainViewModel messageListMainViewModel;
        if (continuation instanceof MessageListMainViewModel$getTokenPreview$1) {
            messageListMainViewModel$getTokenPreview$1 = (MessageListMainViewModel$getTokenPreview$1) continuation;
            int i = messageListMainViewModel$getTokenPreview$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageListMainViewModel$getTokenPreview$1.label = i - Integer.MIN_VALUE;
            } else {
                messageListMainViewModel$getTokenPreview$1 = new MessageListMainViewModel$getTokenPreview$1(this, continuation);
            }
        }
        Object objCopydefault = messageListMainViewModel$getTokenPreview$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = messageListMainViewModel$getTokenPreview$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            C44288sKg c44288sKg = this.RcXXUw;
            messageListMainViewModel$getTokenPreview$1.L$0 = this;
            messageListMainViewModel$getTokenPreview$1.label = 1;
            objCopydefault = c44288sKg.copydefault(list, messageListMainViewModel$getTokenPreview$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            messageListMainViewModel = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            messageListMainViewModel = (MessageListMainViewModel) messageListMainViewModel$getTokenPreview$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objCopydefault;
        if (abstractC43419rot.OLrzqt()) {
            messageListMainViewModel.hDKMBd.postValue(null);
            return Unit.INSTANCE;
        }
        messageListMainViewModel.hDKMBd.postValue((ContractAddressTokenInfo) abstractC43419rot.copydefault());
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        this.QHmsKR.EZpvd();
    }

    public final void EZpvd() {
        String value = this.AxsJAY.getValue();
        if (value != null) {
            this.AubY.AEQbTJ(value);
        }
    }

    public final void copydefault() {
        this.sSMYrx.KWHzl();
    }

    public final void dxcTrN() {
        boolean zEZpvd = Intrinsics.EZpvd(this.giSNqX.getValue(), Boolean.TRUE);
        C32989mnw<AbstractC36555odF> value = DbNXlk().getValue();
        RetryEventType retryEventType = null;
        if ((value != null ? value.OLrzqt() : null) instanceof AbstractC36555odF.TaskDescription) {
            retryEventType = RetryEventType.RETRY_INIT_CONVERSATION;
        } else if (zEZpvd) {
            retryEventType = RetryEventType.RETRY_MESSAGE_LIST;
        }
        if (retryEventType != null) {
            this.ejfBZ.setValue(new C32989mnw<>(retryEventType));
        }
    }

    public final void KWHzl(@NotNull List<? extends SendMessageRequestParam> list) {
        Intrinsics.checkNotNullParameter(list, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MessageListMainViewModel$sendMessages$1(this, list, null), 3, null);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.djSkpj.copydefault(this.aKErDB);
        this.DXXBbs.AEQbTJ(this.ODWQjV);
    }

    public final void KWHzl(InputMode inputMode) {
        this.gasjUx = new Pair<>(this.gasjUx.getSecond(), inputMode == null ? InputMode.DefaultMode : inputMode);
        this.AhwBna.setValue(inputMode);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(ChatOrigin chatOrigin, String str, Continuation<? super RelationSourceType> continuation) throws Throwable {
        MessageListMainViewModel$getRelationSourceType$1 messageListMainViewModel$getRelationSourceType$1;
        RelationSourceType relationSourceTypeAEQbTJ;
        RelationSourceType relationSourceType;
        if (continuation instanceof MessageListMainViewModel$getRelationSourceType$1) {
            messageListMainViewModel$getRelationSourceType$1 = (MessageListMainViewModel$getRelationSourceType$1) continuation;
            int i = messageListMainViewModel$getRelationSourceType$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageListMainViewModel$getRelationSourceType$1.label = i - Integer.MIN_VALUE;
            } else {
                messageListMainViewModel$getRelationSourceType$1 = new MessageListMainViewModel$getRelationSourceType$1(this, continuation);
            }
        }
        Object objAEQbTJ = messageListMainViewModel$getRelationSourceType$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = messageListMainViewModel$getRelationSourceType$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            relationSourceTypeAEQbTJ = chatOrigin != null ? C35182nqW.AEQbTJ(chatOrigin) : null;
            OKConversation value = valueOf().getValue();
            if ((value != null ? value.getConversationType() : null) != OKConversationType.PRIVATE) {
                return relationSourceTypeAEQbTJ;
            }
            C35864oGn c35864oGn = this.dNCPSb;
            messageListMainViewModel$getRelationSourceType$1.L$0 = relationSourceTypeAEQbTJ;
            messageListMainViewModel$getRelationSourceType$1.label = 1;
            objAEQbTJ = c35864oGn.AEQbTJ(str, messageListMainViewModel$getRelationSourceType$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            relationSourceTypeAEQbTJ = (RelationSourceType) messageListMainViewModel$getRelationSourceType$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        RelationInfo relationInfo = (RelationInfo) objAEQbTJ;
        return (relationInfo == null || (relationSourceType = relationInfo.getRelationSourceType()) == null) ? relationSourceTypeAEQbTJ : relationSourceType;
    }

    public final void KWHzl(boolean z) {
        this.fetchVPNInfo.setValue(Boolean.valueOf(z));
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.zLjUOn.setValue(str);
    }

    public final void AEQbTJ(int i) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MessageListMainViewModel$upgradeGroupSize$1(this, i, null), 3, null);
    }
}
