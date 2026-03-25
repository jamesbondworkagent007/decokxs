package com.okinc.business.dexlogic.main.market.detail;

import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.market.features.address_tracker.domain.TrackingAddressAlias;
import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C25389ivm;
import o.C25646jBc;
import o.C28586kda;
import o.C28603kdr;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC25647jBd;
import o.jAH;
import o.jAO;
import o.kKG;
import o.pUU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackingAddressViewModel extends ViewModel {
    public final LiveData<Long> AEQbTJ;
    public final TrackingAddressParams AYXKKw;
    public final C28603kdr AhwBna;
    public final jAH EZpvd;
    public final Map<String, TrackingAddressAlias> KWHzl;
    public final MutableLiveData<Long> OLrzqt;
    public final jAO copydefault;
    public final Set<String> djBIcL;
    public final C25646jBc gEmmrt;
    public final kKG isConnected;
    public final C28586kda valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Long> OLrzqt() {
        return this.AEQbTJ;
    }

    @yCM
    public TrackingAddressViewModel(@NotNull C28586kda c28586kda, @NotNull jAO jao, @NotNull jAH jah, @NotNull kKG kkg, @NotNull C28603kdr c28603kdr, @NotNull C25646jBc c25646jBc, @NotNull SavedStateHandle savedStateHandle) {
        TrackingAddressParams trackingAddressParams;
        Intrinsics.checkNotNullParameter(c28586kda, "");
        Intrinsics.checkNotNullParameter(jao, "");
        Intrinsics.checkNotNullParameter(jah, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c28603kdr, "");
        Intrinsics.checkNotNullParameter(c25646jBc, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.valueOf = c28586kda;
        this.copydefault = jao;
        this.EZpvd = jah;
        this.isConnected = kkg;
        this.AhwBna = c28603kdr;
        this.gEmmrt = c25646jBc;
        this.djBIcL = new LinkedHashSet();
        this.KWHzl = new LinkedHashMap();
        MutableLiveData<Long> mutableLiveData = new MutableLiveData<>(null);
        this.OLrzqt = mutableLiveData;
        this.AEQbTJ = mutableLiveData;
        TokenBase tokenBase = (TokenBase) savedStateHandle.get("token_base");
        if (tokenBase != null) {
            trackingAddressParams = new TrackingAddressParams(tokenBase.getChainId(), tokenBase.getTokenContractAddress(), tokenBase.getTokenSymbol());
        } else {
            trackingAddressParams = new TrackingAddressParams(null, null, null, 7, null);
        }
        this.AYXKKw = trackingAddressParams;
        AEQbTJ(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(@NotNull Continuation<? super Boolean> continuation) throws Throwable {
        TrackingAddressViewModel$isValidWallet$1 trackingAddressViewModel$isValidWallet$1;
        Object objOLrzqt;
        if (continuation instanceof TrackingAddressViewModel$isValidWallet$1) {
            trackingAddressViewModel$isValidWallet$1 = (TrackingAddressViewModel$isValidWallet$1) continuation;
            int i = trackingAddressViewModel$isValidWallet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackingAddressViewModel$isValidWallet$1.label = i - Integer.MIN_VALUE;
            } else {
                trackingAddressViewModel$isValidWallet$1 = new TrackingAddressViewModel$isValidWallet$1(this, continuation);
            }
        }
        Object obj = trackingAddressViewModel$isValidWallet$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackingAddressViewModel$isValidWallet$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C28586kda c28586kda = this.valueOf;
            trackingAddressViewModel$isValidWallet$1.label = 1;
            objOLrzqt = c28586kda.OLrzqt(trackingAddressViewModel$isValidWallet$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objOLrzqt)) {
            Result.Application application = Result.Companion;
            objOLrzqt = C56443yFo.KWHzl(!((DexUserIdentity) objOLrzqt).KWHzl());
        }
        Object objM7377constructorimpl = Result.m7377constructorimpl(objOLrzqt);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        Boolean bool = (Boolean) objM7377constructorimpl;
        return C56443yFo.KWHzl(bool != null ? bool.booleanValue() : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(@NotNull Continuation<? super Boolean> continuation) throws Throwable {
        TrackingAddressViewModel$isValidJwt$1 trackingAddressViewModel$isValidJwt$1;
        Object objM7377constructorimpl;
        Object objOLrzqt;
        TrackingAddressViewModel trackingAddressViewModel;
        Object objCopydefault;
        if (continuation instanceof TrackingAddressViewModel$isValidJwt$1) {
            trackingAddressViewModel$isValidJwt$1 = (TrackingAddressViewModel$isValidJwt$1) continuation;
            int i = trackingAddressViewModel$isValidJwt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackingAddressViewModel$isValidJwt$1.label = i - Integer.MIN_VALUE;
            } else {
                trackingAddressViewModel$isValidJwt$1 = new TrackingAddressViewModel$isValidJwt$1(this, continuation);
            }
        }
        Object obj = trackingAddressViewModel$isValidJwt$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = trackingAddressViewModel$isValidJwt$1.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C28586kda c28586kda = this.valueOf;
            trackingAddressViewModel$isValidJwt$1.L$0 = this;
            trackingAddressViewModel$isValidJwt$1.label = 1;
            objOLrzqt = c28586kda.OLrzqt(trackingAddressViewModel$isValidJwt$1);
            if (objOLrzqt == objCopydefault2) {
                return objCopydefault2;
            }
            trackingAddressViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objCopydefault = ((Result) obj).m7386unboximpl();
                C56391yDq.AEQbTJ(objCopydefault);
                objM7377constructorimpl = Result.m7377constructorimpl(objCopydefault);
                Boolean bool = (Boolean) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
                return C56443yFo.KWHzl(bool == null ? bool.booleanValue() : false);
            }
            trackingAddressViewModel = (TrackingAddressViewModel) trackingAddressViewModel$isValidJwt$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        Result.Application application2 = Result.Companion;
        C56391yDq.AEQbTJ(objOLrzqt);
        C28603kdr c28603kdr = trackingAddressViewModel.AhwBna;
        String strEZpvd = ((DexUserIdentity) objOLrzqt).EZpvd();
        trackingAddressViewModel$isValidJwt$1.L$0 = null;
        trackingAddressViewModel$isValidJwt$1.label = 2;
        objCopydefault = c28603kdr.copydefault(strEZpvd, trackingAddressViewModel$isValidJwt$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        C56391yDq.AEQbTJ(objCopydefault);
        objM7377constructorimpl = Result.m7377constructorimpl(objCopydefault);
        Boolean bool2 = (Boolean) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        return C56443yFo.KWHzl(bool2 == null ? bool2.booleanValue() : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(@NotNull Continuation<? super Result<DappSignArgs>> continuation) {
        TrackingAddressViewModel$generateSignMessage$1 trackingAddressViewModel$generateSignMessage$1;
        Object objM7377constructorimpl;
        Object objOLrzqt;
        TrackingAddressViewModel trackingAddressViewModel;
        Object objEZpvd;
        if (continuation instanceof TrackingAddressViewModel$generateSignMessage$1) {
            trackingAddressViewModel$generateSignMessage$1 = (TrackingAddressViewModel$generateSignMessage$1) continuation;
            int i = trackingAddressViewModel$generateSignMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackingAddressViewModel$generateSignMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                trackingAddressViewModel$generateSignMessage$1 = new TrackingAddressViewModel$generateSignMessage$1(this, continuation);
            }
        }
        Object obj = trackingAddressViewModel$generateSignMessage$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackingAddressViewModel$generateSignMessage$1.label;
        try {
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                pUU.AEQbTJ("DEX", "dexRunCatching", th);
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application2 = Result.Companion;
                C28586kda c28586kda = this.valueOf;
                trackingAddressViewModel$generateSignMessage$1.L$0 = this;
                trackingAddressViewModel$generateSignMessage$1.label = 1;
                objOLrzqt = c28586kda.OLrzqt(trackingAddressViewModel$generateSignMessage$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                trackingAddressViewModel = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objEZpvd = ((Result) obj).m7386unboximpl();
                    C56391yDq.AEQbTJ(objEZpvd);
                    objM7377constructorimpl = Result.m7377constructorimpl(objEZpvd);
                    C56391yDq.AEQbTJ(objM7377constructorimpl);
                    return Result.m7377constructorimpl((DappSignArgs) objM7377constructorimpl);
                }
                trackingAddressViewModel = (TrackingAddressViewModel) trackingAddressViewModel$generateSignMessage$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
            }
            Result.Application application3 = Result.Companion;
            C56391yDq.AEQbTJ(objOLrzqt);
            DexUserIdentity dexUserIdentity = (DexUserIdentity) objOLrzqt;
            C28603kdr c28603kdr = trackingAddressViewModel.AhwBna;
            String strEZpvd = dexUserIdentity.EZpvd();
            long jOLrzqt = dexUserIdentity.OLrzqt();
            trackingAddressViewModel$generateSignMessage$1.L$0 = null;
            trackingAddressViewModel$generateSignMessage$1.label = 2;
            objEZpvd = c28603kdr.EZpvd(strEZpvd, jOLrzqt, trackingAddressViewModel$generateSignMessage$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            C56391yDq.AEQbTJ(objEZpvd);
            objM7377constructorimpl = Result.m7377constructorimpl(objEZpvd);
            C56391yDq.AEQbTJ(objM7377constructorimpl);
            return Result.m7377constructorimpl((DappSignArgs) objM7377constructorimpl);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th2) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th2);
            Result.Application application4 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0094 A[Catch: all -> 0x0037, CancellationException -> 0x003a, TryCatch #3 {CancellationException -> 0x003a, all -> 0x0037, blocks: (B:12:0x002d, B:31:0x008e, B:33:0x0094, B:34:0x00a4, B:28:0x006e), top: B:44:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(Bundle bundle, @NotNull Continuation<? super Result<Boolean>> continuation) {
        TrackingAddressViewModel$login$1 trackingAddressViewModel$login$1;
        Object objM7377constructorimpl;
        Object objOLrzqt;
        TrackingAddressViewModel trackingAddressViewModel;
        Object objKWHzl;
        if (continuation instanceof TrackingAddressViewModel$login$1) {
            trackingAddressViewModel$login$1 = (TrackingAddressViewModel$login$1) continuation;
            int i = trackingAddressViewModel$login$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackingAddressViewModel$login$1.label = i - Integer.MIN_VALUE;
            } else {
                trackingAddressViewModel$login$1 = new TrackingAddressViewModel$login$1(this, continuation);
            }
        }
        TrackingAddressViewModel$login$1 trackingAddressViewModel$login$12 = trackingAddressViewModel$login$1;
        Object obj = trackingAddressViewModel$login$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackingAddressViewModel$login$12.label;
        try {
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                pUU.AEQbTJ("DEX", "dexRunCatching", th);
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application2 = Result.Companion;
                C28586kda c28586kda = this.valueOf;
                trackingAddressViewModel$login$12.L$0 = this;
                trackingAddressViewModel$login$12.L$1 = bundle;
                trackingAddressViewModel$login$12.label = 1;
                objOLrzqt = c28586kda.OLrzqt(trackingAddressViewModel$login$12);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                trackingAddressViewModel = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objKWHzl = ((Result) obj).m7386unboximpl();
                    if (Result.m7384isSuccessimpl(objKWHzl)) {
                        Result.Application application3 = Result.Companion;
                        objKWHzl = C56443yFo.KWHzl(Intrinsics.EZpvd((Boolean) objKWHzl, C56443yFo.KWHzl(true)));
                    }
                    Object objM7377constructorimpl2 = Result.m7377constructorimpl(objKWHzl);
                    C56391yDq.AEQbTJ(objM7377constructorimpl2);
                    objM7377constructorimpl = Result.m7377constructorimpl(objM7377constructorimpl2);
                    C56391yDq.AEQbTJ(objM7377constructorimpl);
                    return Result.m7377constructorimpl(C56443yFo.KWHzl(((Boolean) objM7377constructorimpl).booleanValue()));
                }
                bundle = (Bundle) trackingAddressViewModel$login$12.L$1;
                trackingAddressViewModel = (TrackingAddressViewModel) trackingAddressViewModel$login$12.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
            }
            Bundle bundle2 = bundle;
            Result.Application application4 = Result.Companion;
            C56391yDq.AEQbTJ(objOLrzqt);
            DexUserIdentity dexUserIdentity = (DexUserIdentity) objOLrzqt;
            C28603kdr c28603kdr = trackingAddressViewModel.AhwBna;
            String strEZpvd = dexUserIdentity.EZpvd();
            long jOLrzqt = dexUserIdentity.OLrzqt();
            trackingAddressViewModel$login$12.L$0 = null;
            trackingAddressViewModel$login$12.L$1 = null;
            trackingAddressViewModel$login$12.label = 2;
            objKWHzl = c28603kdr.KWHzl(strEZpvd, jOLrzqt, bundle2, trackingAddressViewModel$login$12);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            if (Result.m7384isSuccessimpl(objKWHzl)) {
            }
            Object objM7377constructorimpl22 = Result.m7377constructorimpl(objKWHzl);
            C56391yDq.AEQbTJ(objM7377constructorimpl22);
            objM7377constructorimpl = Result.m7377constructorimpl(objM7377constructorimpl22);
            C56391yDq.AEQbTJ(objM7377constructorimpl);
            return Result.m7377constructorimpl(C56443yFo.KWHzl(((Boolean) objM7377constructorimpl).booleanValue()));
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th2) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th2);
            Result.Application application5 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
    }

    public static /* synthetic */ void reload$default(TrackingAddressViewModel trackingAddressViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        trackingAddressViewModel.AEQbTJ(z);
    }

    public final void AEQbTJ(boolean z) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new TrackingAddressViewModel$reload$1(this, z, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0095 A[Catch: all -> 0x00ac, CancellationException -> 0x00bf, TryCatch #2 {CancellationException -> 0x00bf, all -> 0x00ac, blocks: (B:13:0x002d, B:28:0x008f, B:30:0x0095, B:34:0x009f, B:36:0x00a7, B:33:0x009d, B:18:0x004c, B:25:0x0075, B:21:0x005e), top: B:43:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Result<? extends InterfaceC25647jBd>> continuation) {
        TrackingAddressViewModel$updateAlias$1 trackingAddressViewModel$updateAlias$1;
        Object objM7386unboximpl;
        String str3;
        String str4;
        TrackingAddressViewModel trackingAddressViewModel;
        Object objCopydefault;
        if (continuation instanceof TrackingAddressViewModel$updateAlias$1) {
            trackingAddressViewModel$updateAlias$1 = (TrackingAddressViewModel$updateAlias$1) continuation;
            int i = trackingAddressViewModel$updateAlias$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackingAddressViewModel$updateAlias$1.label = i - Integer.MIN_VALUE;
            } else {
                trackingAddressViewModel$updateAlias$1 = new TrackingAddressViewModel$updateAlias$1(this, continuation);
            }
        }
        Object obj = trackingAddressViewModel$updateAlias$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = trackingAddressViewModel$updateAlias$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                C28586kda c28586kda = this.valueOf;
                trackingAddressViewModel$updateAlias$1.L$0 = this;
                trackingAddressViewModel$updateAlias$1.L$1 = str;
                trackingAddressViewModel$updateAlias$1.L$2 = str2;
                trackingAddressViewModel$updateAlias$1.label = 1;
                Object objOLrzqt = c28586kda.OLrzqt(trackingAddressViewModel$updateAlias$1);
                if (objOLrzqt == objCopydefault2) {
                    return objCopydefault2;
                }
                objM7386unboximpl = objOLrzqt;
                str3 = str2;
                str4 = str;
                trackingAddressViewModel = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    trackingAddressViewModel = (TrackingAddressViewModel) trackingAddressViewModel$updateAlias$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objCopydefault = ((Result) obj).m7386unboximpl();
                    if (Result.m7384isSuccessimpl(objCopydefault)) {
                        if (Intrinsics.EZpvd(Result.m7380exceptionOrNullimpl(objCopydefault) == null ? objCopydefault : InterfaceC25647jBd.Application.AEQbTJ, InterfaceC25647jBd.ActionBar.KWHzl)) {
                            reload$default(trackingAddressViewModel, false, 1, null);
                        }
                    }
                    return objCopydefault;
                }
                String str5 = (String) trackingAddressViewModel$updateAlias$1.L$2;
                String str6 = (String) trackingAddressViewModel$updateAlias$1.L$1;
                TrackingAddressViewModel trackingAddressViewModel2 = (TrackingAddressViewModel) trackingAddressViewModel$updateAlias$1.L$0;
                C56391yDq.AEQbTJ(obj);
                str4 = str6;
                trackingAddressViewModel = trackingAddressViewModel2;
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                str3 = str5;
            }
            C56391yDq.AEQbTJ(objM7386unboximpl);
            C25646jBc c25646jBc = trackingAddressViewModel.gEmmrt;
            String strEZpvd = ((DexUserIdentity) objM7386unboximpl).EZpvd();
            trackingAddressViewModel$updateAlias$1.L$0 = trackingAddressViewModel;
            trackingAddressViewModel$updateAlias$1.L$1 = null;
            trackingAddressViewModel$updateAlias$1.L$2 = null;
            trackingAddressViewModel$updateAlias$1.label = 2;
            objCopydefault = c25646jBc.copydefault(strEZpvd, str4, str3, trackingAddressViewModel$updateAlias$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            if (Result.m7384isSuccessimpl(objCopydefault)) {
            }
            return objCopydefault;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final boolean KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.djBIcL.contains(str);
    }

    public final String AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TrackingAddressAlias trackingAddressAlias = this.KWHzl.get(str);
        if (trackingAddressAlias != null) {
            return trackingAddressAlias.getAddressAlias();
        }
        return null;
    }

    public final String OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TrackingAddressAlias trackingAddressAlias = this.KWHzl.get(str);
        if (trackingAddressAlias != null) {
            return trackingAddressAlias.getAddressAliasColorHex();
        }
        return null;
    }
}
