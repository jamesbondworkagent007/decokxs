package com.okinc.auth.impl.passkey.ui.register.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.api.passkey.PasskeyPromotionAuthenticator;
import com.okinc.auth.api.passkey.PasskeyPromotionSource;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.api.passkey.PasskeySdkResult;
import com.okinc.auth.api.passkey.PasskeyVersionState;
import com.okinc.auth.impl.passkey.model.RegistrationFinishBody;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.AbstractC5991aGs;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5763aCc;
import o.C5765aCe;
import o.C5905aFL;
import o.C5910aFQ;
import o.C5913aFT;
import o.C5918aFY;
import o.C5941aFv;
import o.C6268aMD;
import o.C6307aMq;
import o.InterfaceC8196ayF;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyPromotionServiceBaseViewModel extends AbstractC33073mpa {
    public final MutableSharedFlow<Unit> AEQbTJ;
    public final MutableLiveData<PasskeyVersionState> AYXKKw;
    public final MutableSharedFlow<Unit> AhwBna;
    public final MutableSharedFlow<Unit> AkhnZx;
    public final MutableSharedFlow<AbstractC5991aGs> AuCTel;
    public final SharedFlow<Unit> AuCTelauCTel;
    public final SharedFlow<Unit> AubY;
    public final C5913aFT AwvSrB;
    public final C5905aFL AxsJAY;
    public final SharedFlow<Unit> DTwDnp;
    public final MutableLiveData<PasskeyPromotionSource> DbNXlk;
    public final MutableLiveData<Boolean> EZpvd;
    public final MutableSharedFlow<Unit> KWHzl;
    public final MutableLiveData<PasskeyPromotionAuthenticator> OLrzqt;
    public final SharedFlow<Unit> ORxRYg;
    public final LiveData<Request> OcIXYQ;
    public final SharedFlow<Unit> QKVWgx;
    public final SharedFlow<Unit> QOLQEE;
    public final SharedFlow<Unit> QUSxYX;
    public final SharedFlow<AbstractC5991aGs> QVAiDq;
    public final SharedFlow<String> QbewEr;
    public final SharedFlow<String> QfsBiF;
    public final SharedFlow<C5910aFQ.Application> RJOkX;
    public final MutableSharedFlow<Unit> copydefault;
    public final MutableSharedFlow<Unit> djBIcL;
    public final MutableSharedFlow<Unit> ejfBZ;
    public final MutableSharedFlow<String> fARcdN;
    public final MutableSharedFlow<C5910aFQ.Application> fIwbmz;
    public final MutableSharedFlow<Unit> fJNWhG;
    public final MutableLiveData<PasskeyScenario> fetchVPNInfo;
    public final MutableSharedFlow<Boolean> gEmmrt;
    public final C5918aFY gHZMYf;
    public final InterfaceC8196ayF getFieldNames;
    public final C5941aFv getNewProxyInstance;
    public final C5763aCc hDKMBd;
    public final MutableLiveData<Request> isConnected;
    public final SharedFlow<Unit> iwGUEr;
    public final SharedFlow<Unit> sSMYrx;
    public final MutableSharedFlow<String> uzCIH;
    public final MutableSharedFlow<Unit> valueOf;
    public final MutableSharedFlow<Unit> values;
    public final C5765aCe wlaJM;
    public final SharedFlow<Unit> zLjUOn;
    public final SharedFlow<Boolean> zsXlph;
    public final C5910aFQ zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> AEQbTJ() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> AYXKKw() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> AhwBna() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> AkhnZx() {
        return this.DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AbstractC5991aGs> AuCTel() {
        return this.QVAiDq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<C5910aFQ.Application> DbNXlk() {
        return this.RJOkX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> OLrzqt() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> copydefault() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Request> djBIcL() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> fARcdN() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> fIwbmz() {
        return this.QfsBiF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> fetchVPNInfo() {
        return this.QbewEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> gEmmrt() {
        return this.QOLQEE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> isConnected() {
        return this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> valueOf() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> values() {
        return this.ORxRYg;
    }

    @yCM
    public PasskeyPromotionServiceBaseViewModel(@NotNull InterfaceC8196ayF interfaceC8196ayF, @NotNull C5905aFL c5905aFL, @NotNull C5765aCe c5765aCe, @NotNull C5763aCc c5763aCc, @NotNull C5910aFQ c5910aFQ, @NotNull C5918aFY c5918aFY, @NotNull C5913aFT c5913aFT, @NotNull C5941aFv c5941aFv) {
        Intrinsics.checkNotNullParameter(interfaceC8196ayF, "");
        Intrinsics.checkNotNullParameter(c5905aFL, "");
        Intrinsics.checkNotNullParameter(c5765aCe, "");
        Intrinsics.checkNotNullParameter(c5763aCc, "");
        Intrinsics.checkNotNullParameter(c5910aFQ, "");
        Intrinsics.checkNotNullParameter(c5918aFY, "");
        Intrinsics.checkNotNullParameter(c5913aFT, "");
        Intrinsics.checkNotNullParameter(c5941aFv, "");
        this.getFieldNames = interfaceC8196ayF;
        this.AxsJAY = c5905aFL;
        this.wlaJM = c5765aCe;
        this.hDKMBd = c5763aCc;
        this.zuBGHE = c5910aFQ;
        this.gHZMYf = c5918aFY;
        this.AwvSrB = c5913aFT;
        this.getNewProxyInstance = c5941aFv;
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.gEmmrt = mutableSharedFlowMutableSharedFlow$default;
        this.zsXlph = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.fJNWhG = mutableSharedFlowMutableSharedFlow$default2;
        this.QUSxYX = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AkhnZx = mutableSharedFlowMutableSharedFlow$default3;
        this.QKVWgx = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.ejfBZ = mutableSharedFlowMutableSharedFlow$default4;
        this.DTwDnp = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.values = mutableSharedFlowMutableSharedFlow$default5;
        this.ORxRYg = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default5);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.fARcdN = mutableSharedFlowMutableSharedFlow$default6;
        this.QbewEr = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default6);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default7 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.djBIcL = mutableSharedFlowMutableSharedFlow$default7;
        this.sSMYrx = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default7);
        MutableSharedFlow<AbstractC5991aGs> mutableSharedFlowMutableSharedFlow$default8 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AuCTel = mutableSharedFlowMutableSharedFlow$default8;
        this.QVAiDq = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default8);
        MutableSharedFlow<C5910aFQ.Application> mutableSharedFlowMutableSharedFlow$default9 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.fIwbmz = mutableSharedFlowMutableSharedFlow$default9;
        this.RJOkX = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default9);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default10 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.uzCIH = mutableSharedFlowMutableSharedFlow$default10;
        this.QfsBiF = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default10);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default11 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default11;
        this.iwGUEr = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default11);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default12 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default12;
        this.AubY = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default12);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default13 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default13;
        this.AuCTelauCTel = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default13);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default14 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.valueOf = mutableSharedFlowMutableSharedFlow$default14;
        this.zLjUOn = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default14);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default15 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AhwBna = mutableSharedFlowMutableSharedFlow$default15;
        this.QOLQEE = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default15);
        MutableLiveData<Request> mutableLiveData = new MutableLiveData<>();
        this.isConnected = mutableLiveData;
        this.OcIXYQ = mutableLiveData;
        this.EZpvd = new MutableLiveData<>();
        this.OLrzqt = new MutableLiveData<>();
        this.DbNXlk = new MutableLiveData<>();
        this.fetchVPNInfo = new MutableLiveData<>();
        this.AYXKKw = new MutableLiveData<>();
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class Request implements Parcelable {
        public static final Parcelable.Creator<Request> CREATOR = new Creator();
        public final String EZpvd;
        public final String OLrzqt;

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Creator implements Parcelable.Creator<Request> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Request createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Request(parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Request[] newArray(int i) {
                return new Request[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Request() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.EZpvd;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.EZpvd);
            parcel.writeString(this.OLrzqt);
        }

        public Request(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.EZpvd = str;
            this.OLrzqt = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:56) call: com.okinc.auth.impl.passkey.ui.register.base.PasskeyPromotionServiceBaseViewModel.Request.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Request(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }
    }

    public static /* synthetic */ Object getOrSetupPasskeyVersion$default(PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return passkeyPromotionServiceBaseViewModel.AEQbTJ(z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(boolean z, Continuation<? super PasskeyVersionState> continuation) throws Throwable {
        PasskeyPromotionServiceBaseViewModel$getOrSetupPasskeyVersion$1 passkeyPromotionServiceBaseViewModel$getOrSetupPasskeyVersion$1;
        PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel;
        if (continuation instanceof PasskeyPromotionServiceBaseViewModel$getOrSetupPasskeyVersion$1) {
            passkeyPromotionServiceBaseViewModel$getOrSetupPasskeyVersion$1 = (PasskeyPromotionServiceBaseViewModel$getOrSetupPasskeyVersion$1) continuation;
            int i = passkeyPromotionServiceBaseViewModel$getOrSetupPasskeyVersion$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passkeyPromotionServiceBaseViewModel$getOrSetupPasskeyVersion$1.label = i - Integer.MIN_VALUE;
            } else {
                passkeyPromotionServiceBaseViewModel$getOrSetupPasskeyVersion$1 = new PasskeyPromotionServiceBaseViewModel$getOrSetupPasskeyVersion$1(this, continuation);
            }
        }
        Object objAEQbTJ = passkeyPromotionServiceBaseViewModel$getOrSetupPasskeyVersion$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = passkeyPromotionServiceBaseViewModel$getOrSetupPasskeyVersion$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            PasskeyVersionState value = this.AYXKKw.getValue();
            if (!z && value != null) {
                return value;
            }
            InterfaceC8196ayF interfaceC8196ayF = this.getFieldNames;
            PasskeyScenario value2 = this.fetchVPNInfo.getValue();
            if (value2 == null) {
                value2 = PasskeyScenario.Account.AEQbTJ;
            }
            boolean zEZpvd = Intrinsics.EZpvd(this.EZpvd.getValue(), C56443yFo.KWHzl(true));
            passkeyPromotionServiceBaseViewModel$getOrSetupPasskeyVersion$1.L$0 = this;
            passkeyPromotionServiceBaseViewModel$getOrSetupPasskeyVersion$1.label = 1;
            objAEQbTJ = interfaceC8196ayF.AEQbTJ(value2, zEZpvd, passkeyPromotionServiceBaseViewModel$getOrSetupPasskeyVersion$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            passkeyPromotionServiceBaseViewModel = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            passkeyPromotionServiceBaseViewModel = (PasskeyPromotionServiceBaseViewModel) passkeyPromotionServiceBaseViewModel$getOrSetupPasskeyVersion$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        PasskeyVersionState passkeyVersionState = (PasskeyVersionState) objAEQbTJ;
        passkeyPromotionServiceBaseViewModel.AYXKKw.setValue(passkeyVersionState);
        return passkeyVersionState;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(@NotNull Continuation<? super Boolean> continuation) throws Throwable {
        PasskeyPromotionServiceBaseViewModel$getIsPasskeyCompatible$1 passkeyPromotionServiceBaseViewModel$getIsPasskeyCompatible$1;
        List list;
        if (continuation instanceof PasskeyPromotionServiceBaseViewModel$getIsPasskeyCompatible$1) {
            passkeyPromotionServiceBaseViewModel$getIsPasskeyCompatible$1 = (PasskeyPromotionServiceBaseViewModel$getIsPasskeyCompatible$1) continuation;
            int i = passkeyPromotionServiceBaseViewModel$getIsPasskeyCompatible$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passkeyPromotionServiceBaseViewModel$getIsPasskeyCompatible$1.label = i - Integer.MIN_VALUE;
            } else {
                passkeyPromotionServiceBaseViewModel$getIsPasskeyCompatible$1 = new PasskeyPromotionServiceBaseViewModel$getIsPasskeyCompatible$1(this, continuation);
            }
        }
        Object obj = passkeyPromotionServiceBaseViewModel$getIsPasskeyCompatible$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = passkeyPromotionServiceBaseViewModel$getIsPasskeyCompatible$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            List listGEmmrt = yDY.gEmmrt(PasskeyVersionState.Fido2Compatible.INSTANCE, PasskeyVersionState.Fido1v2Compatible.INSTANCE);
            passkeyPromotionServiceBaseViewModel$getIsPasskeyCompatible$1.L$0 = listGEmmrt;
            passkeyPromotionServiceBaseViewModel$getIsPasskeyCompatible$1.label = 1;
            Object orSetupPasskeyVersion$default = getOrSetupPasskeyVersion$default(this, false, passkeyPromotionServiceBaseViewModel$getIsPasskeyCompatible$1, 1, null);
            if (orSetupPasskeyVersion$default == objCopydefault) {
                return objCopydefault;
            }
            list = listGEmmrt;
            obj = orSetupPasskeyVersion$default;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) passkeyPromotionServiceBaseViewModel$getIsPasskeyCompatible$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        return C56443yFo.KWHzl(list.contains(obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(@NotNull Continuation<? super Boolean> continuation) throws Throwable {
        PasskeyPromotionServiceBaseViewModel$showThirdPartyReminderBottomSheet$1 passkeyPromotionServiceBaseViewModel$showThirdPartyReminderBottomSheet$1;
        if (continuation instanceof PasskeyPromotionServiceBaseViewModel$showThirdPartyReminderBottomSheet$1) {
            passkeyPromotionServiceBaseViewModel$showThirdPartyReminderBottomSheet$1 = (PasskeyPromotionServiceBaseViewModel$showThirdPartyReminderBottomSheet$1) continuation;
            int i = passkeyPromotionServiceBaseViewModel$showThirdPartyReminderBottomSheet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passkeyPromotionServiceBaseViewModel$showThirdPartyReminderBottomSheet$1.label = i - Integer.MIN_VALUE;
            } else {
                passkeyPromotionServiceBaseViewModel$showThirdPartyReminderBottomSheet$1 = new PasskeyPromotionServiceBaseViewModel$showThirdPartyReminderBottomSheet$1(this, continuation);
            }
        }
        Object orSetupPasskeyVersion$default = passkeyPromotionServiceBaseViewModel$showThirdPartyReminderBottomSheet$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = passkeyPromotionServiceBaseViewModel$showThirdPartyReminderBottomSheet$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(orSetupPasskeyVersion$default);
            passkeyPromotionServiceBaseViewModel$showThirdPartyReminderBottomSheet$1.label = 1;
            orSetupPasskeyVersion$default = getOrSetupPasskeyVersion$default(this, false, passkeyPromotionServiceBaseViewModel$showThirdPartyReminderBottomSheet$1, 1, null);
            if (orSetupPasskeyVersion$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(orSetupPasskeyVersion$default);
        }
        return C56443yFo.KWHzl(Intrinsics.EZpvd(orSetupPasskeyVersion$default, PasskeyVersionState.Fido2Compatible.INSTANCE));
    }

    public final void copydefault(@NotNull Request request, boolean z, @NotNull PasskeyPromotionAuthenticator passkeyPromotionAuthenticator, @NotNull PasskeyPromotionSource passkeyPromotionSource, @NotNull PasskeyScenario passkeyScenario) {
        Intrinsics.checkNotNullParameter(request, "");
        Intrinsics.checkNotNullParameter(passkeyPromotionAuthenticator, "");
        Intrinsics.checkNotNullParameter(passkeyPromotionSource, "");
        Intrinsics.checkNotNullParameter(passkeyScenario, "");
        this.isConnected.setValue(request);
        this.EZpvd.setValue(Boolean.valueOf(z));
        this.OLrzqt.setValue(passkeyPromotionAuthenticator);
        this.DbNXlk.setValue(passkeyPromotionSource);
        this.fetchVPNInfo.setValue(passkeyScenario);
    }

    public final Job OLrzqt(@NotNull C6268aMD c6268aMD) {
        Intrinsics.checkNotNullParameter(c6268aMD, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyPromotionServiceBaseViewModel$clickEnable$1(this, c6268aMD, null), 3, null);
    }

    public final Job KWHzl() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyPromotionServiceBaseViewModel$clickClose$1(null), 3, null);
    }

    public final void fJNWhG() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyPromotionServiceBaseViewModel$initiateMfaSession$1(this, null), 3, null);
    }

    public final Job copydefault(Request request, C6268aMD c6268aMD) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyPromotionServiceBaseViewModel$internalClickEnable$1(request, this, c6268aMD, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(@NotNull Request request, @NotNull Continuation<? super AbstractC5991aGs> continuation) throws Throwable {
        PasskeyPromotionServiceBaseViewModel$startSdkForResult$1 passkeyPromotionServiceBaseViewModel$startSdkForResult$1;
        PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel;
        if (continuation instanceof PasskeyPromotionServiceBaseViewModel$startSdkForResult$1) {
            passkeyPromotionServiceBaseViewModel$startSdkForResult$1 = (PasskeyPromotionServiceBaseViewModel$startSdkForResult$1) continuation;
            int i = passkeyPromotionServiceBaseViewModel$startSdkForResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passkeyPromotionServiceBaseViewModel$startSdkForResult$1.label = i - Integer.MIN_VALUE;
            } else {
                passkeyPromotionServiceBaseViewModel$startSdkForResult$1 = new PasskeyPromotionServiceBaseViewModel$startSdkForResult$1(this, continuation);
            }
        }
        Object objCopydefault = passkeyPromotionServiceBaseViewModel$startSdkForResult$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = passkeyPromotionServiceBaseViewModel$startSdkForResult$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            C5941aFv c5941aFv = this.getNewProxyInstance;
            passkeyPromotionServiceBaseViewModel$startSdkForResult$1.L$0 = this;
            passkeyPromotionServiceBaseViewModel$startSdkForResult$1.L$1 = request;
            passkeyPromotionServiceBaseViewModel$startSdkForResult$1.label = 1;
            objCopydefault = c5941aFv.copydefault(passkeyPromotionServiceBaseViewModel$startSdkForResult$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            passkeyPromotionServiceBaseViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objCopydefault);
                }
                if (i2 == 3) {
                    C56391yDq.AEQbTJ(objCopydefault);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            request = (Request) passkeyPromotionServiceBaseViewModel$startSdkForResult$1.L$1;
            passkeyPromotionServiceBaseViewModel = (PasskeyPromotionServiceBaseViewModel) passkeyPromotionServiceBaseViewModel$startSdkForResult$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        if (((Boolean) objCopydefault).booleanValue()) {
            passkeyPromotionServiceBaseViewModel$startSdkForResult$1.L$0 = null;
            passkeyPromotionServiceBaseViewModel$startSdkForResult$1.L$1 = null;
            passkeyPromotionServiceBaseViewModel$startSdkForResult$1.label = 2;
            objCopydefault = passkeyPromotionServiceBaseViewModel.KWHzl(request, passkeyPromotionServiceBaseViewModel$startSdkForResult$1);
            return objCopydefault == objCopydefault2 ? objCopydefault2 : objCopydefault;
        }
        passkeyPromotionServiceBaseViewModel$startSdkForResult$1.L$0 = null;
        passkeyPromotionServiceBaseViewModel$startSdkForResult$1.L$1 = null;
        passkeyPromotionServiceBaseViewModel$startSdkForResult$1.label = 3;
        objCopydefault = passkeyPromotionServiceBaseViewModel.copydefault(request, passkeyPromotionServiceBaseViewModel$startSdkForResult$1);
        return objCopydefault == objCopydefault2 ? objCopydefault2 : objCopydefault;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(Request request, Continuation<? super AbstractC5991aGs> continuation) throws Throwable {
        PasskeyPromotionServiceBaseViewModel$startCredentialManagerForResult$1 passkeyPromotionServiceBaseViewModel$startCredentialManagerForResult$1;
        if (continuation instanceof PasskeyPromotionServiceBaseViewModel$startCredentialManagerForResult$1) {
            passkeyPromotionServiceBaseViewModel$startCredentialManagerForResult$1 = (PasskeyPromotionServiceBaseViewModel$startCredentialManagerForResult$1) continuation;
            int i = passkeyPromotionServiceBaseViewModel$startCredentialManagerForResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passkeyPromotionServiceBaseViewModel$startCredentialManagerForResult$1.label = i - Integer.MIN_VALUE;
            } else {
                passkeyPromotionServiceBaseViewModel$startCredentialManagerForResult$1 = new PasskeyPromotionServiceBaseViewModel$startCredentialManagerForResult$1(this, continuation);
            }
        }
        PasskeyPromotionServiceBaseViewModel$startCredentialManagerForResult$1 passkeyPromotionServiceBaseViewModel$startCredentialManagerForResult$12 = passkeyPromotionServiceBaseViewModel$startCredentialManagerForResult$1;
        Object objOLrzqt = passkeyPromotionServiceBaseViewModel$startCredentialManagerForResult$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = passkeyPromotionServiceBaseViewModel$startCredentialManagerForResult$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            PasskeyScenario value = this.fetchVPNInfo.getValue();
            if (value != null) {
                C5913aFT c5913aFT = this.AwvSrB;
                String strOLrzqt = request.OLrzqt();
                String strKWHzl = request.KWHzl();
                PasskeyPromotionAuthenticator value2 = this.OLrzqt.getValue();
                if (value2 == null) {
                    value2 = PasskeyPromotionAuthenticator.All.KWHzl;
                }
                passkeyPromotionServiceBaseViewModel$startCredentialManagerForResult$12.label = 1;
                objOLrzqt = c5913aFT.OLrzqt(strOLrzqt, strKWHzl, value2, value, true, passkeyPromotionServiceBaseViewModel$startCredentialManagerForResult$12);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            }
            return new AbstractC5991aGs.Application("impossible null scenario");
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(objOLrzqt);
        AbstractC5991aGs abstractC5991aGs = (AbstractC5991aGs) objOLrzqt;
        if (abstractC5991aGs != null) {
            return abstractC5991aGs;
        }
        return new AbstractC5991aGs.Application("impossible null scenario");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(Request request, Continuation<? super AbstractC5991aGs> continuation) throws Throwable {
        PasskeyPromotionServiceBaseViewModel$startFIDO2ForResult$1 passkeyPromotionServiceBaseViewModel$startFIDO2ForResult$1;
        if (continuation instanceof PasskeyPromotionServiceBaseViewModel$startFIDO2ForResult$1) {
            passkeyPromotionServiceBaseViewModel$startFIDO2ForResult$1 = (PasskeyPromotionServiceBaseViewModel$startFIDO2ForResult$1) continuation;
            int i = passkeyPromotionServiceBaseViewModel$startFIDO2ForResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passkeyPromotionServiceBaseViewModel$startFIDO2ForResult$1.label = i - Integer.MIN_VALUE;
            } else {
                passkeyPromotionServiceBaseViewModel$startFIDO2ForResult$1 = new PasskeyPromotionServiceBaseViewModel$startFIDO2ForResult$1(this, continuation);
            }
        }
        PasskeyPromotionServiceBaseViewModel$startFIDO2ForResult$1 passkeyPromotionServiceBaseViewModel$startFIDO2ForResult$12 = passkeyPromotionServiceBaseViewModel$startFIDO2ForResult$1;
        Object objOLrzqt = passkeyPromotionServiceBaseViewModel$startFIDO2ForResult$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = passkeyPromotionServiceBaseViewModel$startFIDO2ForResult$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            PasskeyScenario value = this.fetchVPNInfo.getValue();
            if (value != null) {
                C5913aFT c5913aFT = this.AwvSrB;
                String strOLrzqt = request.OLrzqt();
                String strKWHzl = request.KWHzl();
                PasskeyPromotionAuthenticator value2 = this.OLrzqt.getValue();
                if (value2 == null) {
                    value2 = PasskeyPromotionAuthenticator.All.KWHzl;
                }
                passkeyPromotionServiceBaseViewModel$startFIDO2ForResult$12.label = 1;
                objOLrzqt = c5913aFT.OLrzqt(strOLrzqt, strKWHzl, value2, value, false, passkeyPromotionServiceBaseViewModel$startFIDO2ForResult$12);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            }
            return new AbstractC5991aGs.Application("impossible null scenario");
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(objOLrzqt);
        AbstractC5991aGs abstractC5991aGs = (AbstractC5991aGs) objOLrzqt;
        if (abstractC5991aGs != null) {
            return abstractC5991aGs;
        }
        return new AbstractC5991aGs.Application("impossible null scenario");
    }

    public final Job copydefault(@NotNull String str, @NotNull C6268aMD c6268aMD) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c6268aMD, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyPromotionServiceBaseViewModel$checkMfaResult$1(this, str, null), 3, null);
    }

    public final Job copydefault(@NotNull RegistrationFinishBody registrationFinishBody) {
        Intrinsics.checkNotNullParameter(registrationFinishBody, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyPromotionServiceBaseViewModel$postRegisterFido1$1(this, registrationFinishBody, null), 3, null);
    }

    public final Job copydefault(@NotNull PasskeySdkResult passkeySdkResult) {
        Intrinsics.checkNotNullParameter(passkeySdkResult, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyPromotionServiceBaseViewModel$postRegister$1(this, passkeySdkResult, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job OLrzqt(Object obj) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyPromotionServiceBaseViewModel$handleRegistrationValidation$1(obj, this, null), 3, null);
    }

    public final void ejfBZ() {
        PasskeyScenario value = this.fetchVPNInfo.getValue();
        if (value instanceof PasskeyScenario.CedefiWallet) {
            C6307aMq.EZpvd.OLrzqt(((PasskeyScenario.CedefiWallet) value).EZpvd());
            return;
        }
        PasskeyPromotionSource value2 = this.DbNXlk.getValue();
        if (value2 != null) {
            C6307aMq.EZpvd.AEQbTJ(value2);
        }
    }

    public final void EZpvd() {
        PasskeyPromotionSource value = this.DbNXlk.getValue();
        if (value != null) {
            C6307aMq.EZpvd.EZpvd(value);
        }
    }
}
