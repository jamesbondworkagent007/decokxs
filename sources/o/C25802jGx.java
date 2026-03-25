package o;

import com.okinc.business.market.data.model.alert.AlertCreateRequest;
import com.okinc.business.market.data.model.alert.AlertCreateResponse;
import com.okinc.business.market.data.model.alert.AlertDataResponse;
import com.okinc.business.market.data.model.alert.AlertDeleteRequest;
import com.okinc.business.market.data.model.alert.AlertListRequest;
import com.okinc.business.market.data.model.alert.AlertListResponse;
import com.okinc.business.market.data.model.alert.AlertUiItem;
import com.okinc.business.market.data.model.alert.EditAlertActiveRequest;
import com.okinc.business.market.data.model.alert.EditAlertRequest;
import com.okinc.business.market.data.model.alert.LiveMarketPriceData;
import com.okinc.business.market.features.alert.core.AlertManagementAdapter$addAlert$1;
import com.okinc.business.market.features.alert.core.AlertManagementAdapter$addAlertgIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.alert.core.AlertManagementAdapter$checkTokenSupportedForAlert$1;
import com.okinc.business.market.features.alert.core.AlertManagementAdapter$checkTokenSupportedForAlert0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.alert.core.AlertManagementAdapter$deleteAlertRuleByRuleIds$1;
import com.okinc.business.market.features.alert.core.AlertManagementAdapter$deleteAlertRuleByRuleIdsgIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.alert.core.AlertManagementAdapter$editActiveStatus$1;
import com.okinc.business.market.features.alert.core.AlertManagementAdapter$editActiveStatusgIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.alert.core.AlertManagementAdapter$editAlert$1;
import com.okinc.business.market.features.alert.core.AlertManagementAdapter$editAlertgIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.alert.core.AlertManagementAdapter$getAlertList$1;
import com.okinc.business.market.features.alert.core.AlertManagementAdapter$getAlertListgIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.alert.core.AlertManagementAdapter$subscribeToLivePriceData$2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import uniffi.dex.AlertPromptType;
import uniffi.dex.AlertRepeatType;
import uniffi.dex.AlertType;

/* JADX INFO: renamed from: o.jGx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25802jGx {
    public final InterfaceC2147AAo EZpvd;
    public final C25806jHa KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.jGx$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] AhwBna;
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AlertPromptType.values().length];
            try {
                iArr[AlertPromptType.PRICE_MOVE_ABOVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AlertPromptType.PRICE_MOVE_BELOW.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[AlertPromptType.GAIN_EXCEEDS24H.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[AlertPromptType.LOSS_EXCEEDS24H.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[AlertPromptType.PRICE_REACHES.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[AlertPromptType.GAIN_EXCEEDS5MIN.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[AlertPromptType.LOSS_EXCEEDS5MIN.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[AlertPromptType.GAIN_EXCEEDS1H.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[AlertPromptType.LOSS_EXCEEDS1H.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[AlertPromptType.GAIN_EXCEEDS4H.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[AlertPromptType.LOSS_EXCEEDS4H.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[AlertRepeatType.values().length];
            try {
                iArr2[AlertRepeatType.REPEAT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr2[AlertRepeatType.ONCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            AEQbTJ = iArr2;
            int[] iArr3 = new int[AlertType.values().length];
            try {
                iArr3[AlertType.PRICE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr3[AlertType.MARKET_CAP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            copydefault = iArr3;
            int[] iArr4 = new int[com.okinc.business.market.data.model.alert.AlertType.values().length];
            try {
                iArr4[com.okinc.business.market.data.model.alert.AlertType.PRICE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr4[com.okinc.business.market.data.model.alert.AlertType.MARKETCAP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            EZpvd = iArr4;
            int[] iArr5 = new int[com.okinc.business.market.data.model.alert.AlertPromptType.values().length];
            try {
                iArr5[com.okinc.business.market.data.model.alert.AlertPromptType.PRICE_MOVE_ABOVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr5[com.okinc.business.market.data.model.alert.AlertPromptType.PRICE_MOVE_BELOW.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr5[com.okinc.business.market.data.model.alert.AlertPromptType.GAIN_EXCEEDS_24H.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr5[com.okinc.business.market.data.model.alert.AlertPromptType.LOSS_EXCEEDS_24H.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr5[com.okinc.business.market.data.model.alert.AlertPromptType.PRICE_REACHES.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr5[com.okinc.business.market.data.model.alert.AlertPromptType.GAIN_EXCEEDS_5MIN.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                iArr5[com.okinc.business.market.data.model.alert.AlertPromptType.LOSS_EXCEEDS_5MIN.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                iArr5[com.okinc.business.market.data.model.alert.AlertPromptType.GAIN_EXCEEDS_1H.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                iArr5[com.okinc.business.market.data.model.alert.AlertPromptType.LOSS_EXCEEDS_1H.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                iArr5[com.okinc.business.market.data.model.alert.AlertPromptType.GAIN_EXCEEDS_4H.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                iArr5[com.okinc.business.market.data.model.alert.AlertPromptType.LOSS_EXCEEDS_4H.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            OLrzqt = iArr5;
            int[] iArr6 = new int[com.okinc.business.market.data.model.alert.AlertRepeatType.values().length];
            try {
                iArr6[com.okinc.business.market.data.model.alert.AlertRepeatType.REPEAT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
            try {
                iArr6[com.okinc.business.market.data.model.alert.AlertRepeatType.ONCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused30) {
            }
            AhwBna = iArr6;
        }
    }

    public C25802jGx(@NotNull C25806jHa c25806jHa, @NotNull InterfaceC2147AAo interfaceC2147AAo, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c25806jHa, "");
        Intrinsics.checkNotNullParameter(interfaceC2147AAo, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = c25806jHa;
        this.EZpvd = interfaceC2147AAo;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.jGx$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jGx.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final AlertDataResponse KWHzl(C4176Azs c4176Azs) {
        com.okinc.business.market.data.model.alert.AlertPromptType alertPromptType;
        com.okinc.business.market.data.model.alert.AlertRepeatType alertRepeatType;
        com.okinc.business.market.data.model.alert.AlertType alertType;
        java.lang.String strAYXKKw = c4176Azs.AYXKKw();
        java.lang.String strEZpvd = c4176Azs.EZpvd();
        java.lang.String strValueOf = c4176Azs.valueOf();
        java.lang.String strFetchVPNInfo = c4176Azs.fetchVPNInfo();
        switch (StateListAnimator.KWHzl[c4176Azs.AhwBna().ordinal()]) {
            case 1:
                alertPromptType = com.okinc.business.market.data.model.alert.AlertPromptType.PRICE_MOVE_ABOVE;
                break;
            case 2:
                alertPromptType = com.okinc.business.market.data.model.alert.AlertPromptType.PRICE_MOVE_BELOW;
                break;
            case 3:
                alertPromptType = com.okinc.business.market.data.model.alert.AlertPromptType.GAIN_EXCEEDS_24H;
                break;
            case 4:
                alertPromptType = com.okinc.business.market.data.model.alert.AlertPromptType.LOSS_EXCEEDS_24H;
                break;
            case 5:
                alertPromptType = com.okinc.business.market.data.model.alert.AlertPromptType.PRICE_REACHES;
                break;
            case 6:
                alertPromptType = com.okinc.business.market.data.model.alert.AlertPromptType.GAIN_EXCEEDS_5MIN;
                break;
            case 7:
                alertPromptType = com.okinc.business.market.data.model.alert.AlertPromptType.LOSS_EXCEEDS_5MIN;
                break;
            case 8:
                alertPromptType = com.okinc.business.market.data.model.alert.AlertPromptType.GAIN_EXCEEDS_1H;
                break;
            case 9:
                alertPromptType = com.okinc.business.market.data.model.alert.AlertPromptType.LOSS_EXCEEDS_1H;
                break;
            case 10:
                alertPromptType = com.okinc.business.market.data.model.alert.AlertPromptType.GAIN_EXCEEDS_4H;
                break;
            case 11:
                alertPromptType = com.okinc.business.market.data.model.alert.AlertPromptType.LOSS_EXCEEDS_4H;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        com.okinc.business.market.data.model.alert.AlertPromptType alertPromptType2 = alertPromptType;
        int i = StateListAnimator.AEQbTJ[c4176Azs.gEmmrt().ordinal()];
        if (i == 1) {
            alertRepeatType = com.okinc.business.market.data.model.alert.AlertRepeatType.REPEAT;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            alertRepeatType = com.okinc.business.market.data.model.alert.AlertRepeatType.ONCE;
        }
        com.okinc.business.market.data.model.alert.AlertRepeatType alertRepeatType2 = alertRepeatType;
        java.lang.String strDjBIcL = c4176Azs.djBIcL();
        boolean zCopydefault = c4176Azs.copydefault();
        int i2 = StateListAnimator.copydefault[c4176Azs.AEQbTJ().ordinal()];
        if (i2 == 1) {
            alertType = com.okinc.business.market.data.model.alert.AlertType.PRICE;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            alertType = com.okinc.business.market.data.model.alert.AlertType.MARKETCAP;
        }
        return new AlertDataResponse(strAYXKKw, strEZpvd, strValueOf, strFetchVPNInfo, alertPromptType2, alertRepeatType2, strDjBIcL, zCopydefault, (java.lang.String) null, (java.lang.String) null, alertType, 768, (DefaultConstructorMarker) null);
    }

    public final AlertListResponse AEQbTJ(C4183Azz c4183Azz) {
        java.lang.String strEZpvd = c4183Azz.EZpvd();
        java.lang.String strAEQbTJ = c4183Azz.AEQbTJ();
        java.lang.String strValueOf = c4183Azz.valueOf();
        java.lang.String strDjBIcL = c4183Azz.djBIcL();
        java.lang.String strAYXKKw = c4183Azz.AYXKKw();
        java.lang.String strCopydefault = c4183Azz.copydefault();
        boolean zOLrzqt = c4183Azz.OLrzqt();
        java.util.List<C4176Azs> listKWHzl = c4183Azz.KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        java.util.Iterator<T> it = listKWHzl.iterator();
        while (it.hasNext()) {
            arrayList.add(KWHzl((C4176Azs) it.next()));
        }
        return new AlertListResponse(strAEQbTJ, strEZpvd, strDjBIcL, strValueOf, zOLrzqt, strAYXKKw, strCopydefault, arrayList);
    }

    public final AlertCreateResponse KWHzl(C4178Azu c4178Azu) {
        return new AlertCreateResponse(c4178Azu.KWHzl());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull AlertListRequest alertListRequest, @NotNull Continuation<? super Result<? extends java.util.List<? extends AlertUiItem>>> continuation) throws java.lang.Throwable {
        AlertManagementAdapter$getAlertList$1 alertManagementAdapter$getAlertList$1;
        if (continuation instanceof AlertManagementAdapter$getAlertList$1) {
            alertManagementAdapter$getAlertList$1 = (AlertManagementAdapter$getAlertList$1) continuation;
            int i = alertManagementAdapter$getAlertList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                alertManagementAdapter$getAlertList$1.label = i - Integer.MIN_VALUE;
            } else {
                alertManagementAdapter$getAlertList$1 = new AlertManagementAdapter$getAlertList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = alertManagementAdapter$getAlertList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = alertManagementAdapter$getAlertList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            AlertManagementAdapter$getAlertListgIAlus$$inlined$dexRunCatching$1 alertManagementAdapter$getAlertListgIAlus$$inlined$dexRunCatching$1 = new AlertManagementAdapter$getAlertListgIAlus$$inlined$dexRunCatching$1(null, this, alertListRequest);
            alertManagementAdapter$getAlertList$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, alertManagementAdapter$getAlertListgIAlus$$inlined$dexRunCatching$1, alertManagementAdapter$getAlertList$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull AlertCreateRequest alertCreateRequest, @NotNull Continuation<? super Result<AlertCreateResponse>> continuation) throws java.lang.Throwable {
        AlertManagementAdapter$addAlert$1 alertManagementAdapter$addAlert$1;
        if (continuation instanceof AlertManagementAdapter$addAlert$1) {
            alertManagementAdapter$addAlert$1 = (AlertManagementAdapter$addAlert$1) continuation;
            int i = alertManagementAdapter$addAlert$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                alertManagementAdapter$addAlert$1.label = i - Integer.MIN_VALUE;
            } else {
                alertManagementAdapter$addAlert$1 = new AlertManagementAdapter$addAlert$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = alertManagementAdapter$addAlert$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = alertManagementAdapter$addAlert$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            AlertManagementAdapter$addAlertgIAlus$$inlined$dexRunCatching$1 alertManagementAdapter$addAlertgIAlus$$inlined$dexRunCatching$1 = new AlertManagementAdapter$addAlertgIAlus$$inlined$dexRunCatching$1(null, this, alertCreateRequest);
            alertManagementAdapter$addAlert$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, alertManagementAdapter$addAlertgIAlus$$inlined$dexRunCatching$1, alertManagementAdapter$addAlert$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull AlertDeleteRequest alertDeleteRequest, @NotNull Continuation<? super Result<java.lang.Integer>> continuation) throws java.lang.Throwable {
        AlertManagementAdapter$deleteAlertRuleByRuleIds$1 alertManagementAdapter$deleteAlertRuleByRuleIds$1;
        if (continuation instanceof AlertManagementAdapter$deleteAlertRuleByRuleIds$1) {
            alertManagementAdapter$deleteAlertRuleByRuleIds$1 = (AlertManagementAdapter$deleteAlertRuleByRuleIds$1) continuation;
            int i = alertManagementAdapter$deleteAlertRuleByRuleIds$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                alertManagementAdapter$deleteAlertRuleByRuleIds$1.label = i - Integer.MIN_VALUE;
            } else {
                alertManagementAdapter$deleteAlertRuleByRuleIds$1 = new AlertManagementAdapter$deleteAlertRuleByRuleIds$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = alertManagementAdapter$deleteAlertRuleByRuleIds$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = alertManagementAdapter$deleteAlertRuleByRuleIds$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            AlertManagementAdapter$deleteAlertRuleByRuleIdsgIAlus$$inlined$dexRunCatching$1 alertManagementAdapter$deleteAlertRuleByRuleIdsgIAlus$$inlined$dexRunCatching$1 = new AlertManagementAdapter$deleteAlertRuleByRuleIdsgIAlus$$inlined$dexRunCatching$1(null, this, alertDeleteRequest);
            alertManagementAdapter$deleteAlertRuleByRuleIds$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, alertManagementAdapter$deleteAlertRuleByRuleIdsgIAlus$$inlined$dexRunCatching$1, alertManagementAdapter$deleteAlertRuleByRuleIds$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull EditAlertRequest editAlertRequest, @NotNull Continuation<? super Result<java.lang.Integer>> continuation) throws java.lang.Throwable {
        AlertManagementAdapter$editAlert$1 alertManagementAdapter$editAlert$1;
        if (continuation instanceof AlertManagementAdapter$editAlert$1) {
            alertManagementAdapter$editAlert$1 = (AlertManagementAdapter$editAlert$1) continuation;
            int i = alertManagementAdapter$editAlert$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                alertManagementAdapter$editAlert$1.label = i - Integer.MIN_VALUE;
            } else {
                alertManagementAdapter$editAlert$1 = new AlertManagementAdapter$editAlert$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = alertManagementAdapter$editAlert$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = alertManagementAdapter$editAlert$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            AlertManagementAdapter$editAlertgIAlus$$inlined$dexRunCatching$1 alertManagementAdapter$editAlertgIAlus$$inlined$dexRunCatching$1 = new AlertManagementAdapter$editAlertgIAlus$$inlined$dexRunCatching$1(null, this, editAlertRequest);
            alertManagementAdapter$editAlert$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, alertManagementAdapter$editAlertgIAlus$$inlined$dexRunCatching$1, alertManagementAdapter$editAlert$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull EditAlertActiveRequest editAlertActiveRequest, @NotNull Continuation<? super Result<java.lang.Integer>> continuation) throws java.lang.Throwable {
        AlertManagementAdapter$editActiveStatus$1 alertManagementAdapter$editActiveStatus$1;
        if (continuation instanceof AlertManagementAdapter$editActiveStatus$1) {
            alertManagementAdapter$editActiveStatus$1 = (AlertManagementAdapter$editActiveStatus$1) continuation;
            int i = alertManagementAdapter$editActiveStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                alertManagementAdapter$editActiveStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                alertManagementAdapter$editActiveStatus$1 = new AlertManagementAdapter$editActiveStatus$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = alertManagementAdapter$editActiveStatus$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = alertManagementAdapter$editActiveStatus$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            AlertManagementAdapter$editActiveStatusgIAlus$$inlined$dexRunCatching$1 alertManagementAdapter$editActiveStatusgIAlus$$inlined$dexRunCatching$1 = new AlertManagementAdapter$editActiveStatusgIAlus$$inlined$dexRunCatching$1(null, this, editAlertActiveRequest);
            alertManagementAdapter$editActiveStatus$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, alertManagementAdapter$editActiveStatusgIAlus$$inlined$dexRunCatching$1, alertManagementAdapter$editActiveStatus$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        AlertManagementAdapter$checkTokenSupportedForAlert$1 alertManagementAdapter$checkTokenSupportedForAlert$1;
        if (continuation instanceof AlertManagementAdapter$checkTokenSupportedForAlert$1) {
            alertManagementAdapter$checkTokenSupportedForAlert$1 = (AlertManagementAdapter$checkTokenSupportedForAlert$1) continuation;
            int i = alertManagementAdapter$checkTokenSupportedForAlert$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                alertManagementAdapter$checkTokenSupportedForAlert$1.label = i - Integer.MIN_VALUE;
            } else {
                alertManagementAdapter$checkTokenSupportedForAlert$1 = new AlertManagementAdapter$checkTokenSupportedForAlert$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = alertManagementAdapter$checkTokenSupportedForAlert$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = alertManagementAdapter$checkTokenSupportedForAlert$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            AlertManagementAdapter$checkTokenSupportedForAlert0E7RQCE$$inlined$dexRunCatching$1 alertManagementAdapter$checkTokenSupportedForAlert0E7RQCE$$inlined$dexRunCatching$1 = new AlertManagementAdapter$checkTokenSupportedForAlert0E7RQCE$$inlined$dexRunCatching$1(null, this, str, str2);
            alertManagementAdapter$checkTokenSupportedForAlert$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, alertManagementAdapter$checkTokenSupportedForAlert0E7RQCE$$inlined$dexRunCatching$1, alertManagementAdapter$checkTokenSupportedForAlert$1);
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

    public final java.lang.Object AEQbTJ(@NotNull C27614jyX c27614jyX, @NotNull Continuation<? super Flow<LiveMarketPriceData>> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new AlertManagementAdapter$subscribeToLivePriceData$2(this, c27614jyX, null), continuation);
    }

    public final void copydefault() {
        this.KWHzl.EZpvd();
    }

    public final AlertType AEQbTJ(com.okinc.business.market.data.model.alert.AlertType alertType) {
        int i = StateListAnimator.EZpvd[alertType.ordinal()];
        if (i == 1) {
            return AlertType.PRICE;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return AlertType.MARKET_CAP;
    }

    public final AlertPromptType copydefault(com.okinc.business.market.data.model.alert.AlertPromptType alertPromptType) {
        switch (StateListAnimator.OLrzqt[alertPromptType.ordinal()]) {
            case 1:
                return AlertPromptType.PRICE_MOVE_ABOVE;
            case 2:
                return AlertPromptType.PRICE_MOVE_BELOW;
            case 3:
                return AlertPromptType.GAIN_EXCEEDS24H;
            case 4:
                return AlertPromptType.LOSS_EXCEEDS24H;
            case 5:
                return AlertPromptType.PRICE_REACHES;
            case 6:
                return AlertPromptType.GAIN_EXCEEDS5MIN;
            case 7:
                return AlertPromptType.LOSS_EXCEEDS5MIN;
            case 8:
                return AlertPromptType.GAIN_EXCEEDS1H;
            case 9:
                return AlertPromptType.LOSS_EXCEEDS1H;
            case 10:
                return AlertPromptType.GAIN_EXCEEDS4H;
            case 11:
                return AlertPromptType.LOSS_EXCEEDS4H;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final AlertRepeatType AEQbTJ(com.okinc.business.market.data.model.alert.AlertRepeatType alertRepeatType) {
        int i = StateListAnimator.AhwBna[alertRepeatType.ordinal()];
        if (i == 1) {
            return AlertRepeatType.REPEAT;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return AlertRepeatType.ONCE;
    }
}
