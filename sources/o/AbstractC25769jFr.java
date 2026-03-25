package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.market.data.constant.AddressTrackerUserAction;
import com.okinc.business.market.features.address_tracker.domain.AddressTrackerNotification;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.TrackerAddressManagementBaseViewModel$addAlertAction$1;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.TrackerAddressManagementBaseViewModel$createOrUpdateNotification$1;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.TrackerAddressManagementBaseViewModel$generateSignMessage$1;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.TrackerAddressManagementBaseViewModel$getNotificationForAddress$1;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.TrackerAddressManagementBaseViewModel$isValidJwt$1;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.TrackerAddressManagementBaseViewModel$loadGroup$1;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.TrackerAddressManagementBaseViewModel$login$1;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.TrackerAddressGroupUIModel;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jFr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC25769jFr extends ViewModel {
    public final jAD AEQbTJ;
    public final C25749jEy AYXKKw;
    public final C25648jBe AhwBna;
    public final MutableStateFlow<java.util.List<TrackerAddressGroupUIModel>> EZpvd;
    public final C27634jyr KWHzl;
    public final C28586kda OLrzqt;
    public final StateFlow<java.util.List<TrackerAddressGroupUIModel>> copydefault;
    public final C28603kdr djBIcL;
    public final C25640jAx gEmmrt;
    public long valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25749jEy AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull java.util.List<TrackerAddressGroupUIModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<java.util.List<TrackerAddressGroupUIModel>> AhwBna() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.util.List<TrackerAddressGroupUIModel>> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
    }

    public abstract void KWHzl(boolean z);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28586kda OLrzqt() {
        return this.OLrzqt;
    }

    public void OLrzqt(long j) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jAD copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(long j) {
        this.valueOf = j;
    }

    public AbstractC25769jFr(@NotNull C25640jAx c25640jAx, @NotNull C25648jBe c25648jBe, @NotNull jAD jad, @NotNull C28586kda c28586kda, @NotNull C28603kdr c28603kdr, @NotNull C25749jEy c25749jEy, @NotNull C27634jyr c27634jyr) {
        Intrinsics.checkNotNullParameter(c25640jAx, "");
        Intrinsics.checkNotNullParameter(c25648jBe, "");
        Intrinsics.checkNotNullParameter(jad, "");
        Intrinsics.checkNotNullParameter(c28586kda, "");
        Intrinsics.checkNotNullParameter(c28603kdr, "");
        Intrinsics.checkNotNullParameter(c25749jEy, "");
        Intrinsics.checkNotNullParameter(c27634jyr, "");
        this.gEmmrt = c25640jAx;
        this.AhwBna = c25648jBe;
        this.AEQbTJ = jad;
        this.OLrzqt = c28586kda;
        this.djBIcL = c28603kdr;
        this.AYXKKw = c25749jEy;
        this.KWHzl = c27634jyr;
        this.valueOf = -1L;
        MutableStateFlow<java.util.List<TrackerAddressGroupUIModel>> MutableStateFlow = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.EZpvd = MutableStateFlow;
        this.copydefault = MutableStateFlow;
    }

    public static /* synthetic */ void loadAddresses$default(AbstractC25769jFr abstractC25769jFr, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadAddresses");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        abstractC25769jFr.KWHzl(z);
    }

    public void valueOf() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new TrackerAddressManagementBaseViewModel$loadGroup$1(this, null), 3, null);
    }

    public void AEQbTJ(long j) {
        this.valueOf = j;
        OLrzqt(j);
        loadAddresses$default(this, false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super Result<AddressTrackerNotification>> continuation) throws java.lang.Throwable {
        TrackerAddressManagementBaseViewModel$getNotificationForAddress$1 trackerAddressManagementBaseViewModel$getNotificationForAddress$1;
        if (continuation instanceof TrackerAddressManagementBaseViewModel$getNotificationForAddress$1) {
            trackerAddressManagementBaseViewModel$getNotificationForAddress$1 = (TrackerAddressManagementBaseViewModel$getNotificationForAddress$1) continuation;
            int i = trackerAddressManagementBaseViewModel$getNotificationForAddress$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerAddressManagementBaseViewModel$getNotificationForAddress$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerAddressManagementBaseViewModel$getNotificationForAddress$1 = new TrackerAddressManagementBaseViewModel$getNotificationForAddress$1(this, continuation);
            }
        }
        java.lang.Object obj = trackerAddressManagementBaseViewModel$getNotificationForAddress$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackerAddressManagementBaseViewModel$getNotificationForAddress$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C25640jAx c25640jAx = this.gEmmrt;
        trackerAddressManagementBaseViewModel$getNotificationForAddress$1.label = 1;
        java.lang.Object objCopydefault2 = c25640jAx.copydefault(str, trackerAddressManagementBaseViewModel$getNotificationForAddress$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull TokenFilter tokenFilter, boolean z, @NotNull java.lang.String str, @NotNull java.util.List<? extends AddressTrackerUserAction> list, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        TrackerAddressManagementBaseViewModel$createOrUpdateNotification$1 trackerAddressManagementBaseViewModel$createOrUpdateNotification$1;
        if (continuation instanceof TrackerAddressManagementBaseViewModel$createOrUpdateNotification$1) {
            trackerAddressManagementBaseViewModel$createOrUpdateNotification$1 = (TrackerAddressManagementBaseViewModel$createOrUpdateNotification$1) continuation;
            int i = trackerAddressManagementBaseViewModel$createOrUpdateNotification$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerAddressManagementBaseViewModel$createOrUpdateNotification$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerAddressManagementBaseViewModel$createOrUpdateNotification$1 = new TrackerAddressManagementBaseViewModel$createOrUpdateNotification$1(this, continuation);
            }
        }
        TrackerAddressManagementBaseViewModel$createOrUpdateNotification$1 trackerAddressManagementBaseViewModel$createOrUpdateNotification$12 = trackerAddressManagementBaseViewModel$createOrUpdateNotification$1;
        java.lang.Object obj = trackerAddressManagementBaseViewModel$createOrUpdateNotification$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackerAddressManagementBaseViewModel$createOrUpdateNotification$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C25648jBe c25648jBe = this.AhwBna;
        java.lang.String strAhwBna = tokenFilter.AYXKKw().AhwBna();
        java.lang.String strKWHzl = tokenFilter.AYXKKw().KWHzl();
        trackerAddressManagementBaseViewModel$createOrUpdateNotification$12.label = 1;
        java.lang.Object objOLrzqt = c25648jBe.OLrzqt(str, z ? 1 : 0, strAhwBna, strKWHzl, list, trackerAddressManagementBaseViewModel$createOrUpdateNotification$12);
        return objOLrzqt == objCopydefault ? objCopydefault : objOLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.jFr */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: createOrUpdateNotification-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8635createOrUpdateNotificationyxL6bBk$default(AbstractC25769jFr abstractC25769jFr, TokenFilter tokenFilter, boolean z, java.lang.String str, java.util.List list, Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createOrUpdateNotification-yxL6bBk");
        }
        if ((i & 8) != 0) {
            list = yDY.AhwBna();
        }
        return abstractC25769jFr.KWHzl(tokenFilter, z, str, list, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super Result<ResponseData<java.lang.Object>>> continuation) throws java.lang.Throwable {
        TrackerAddressManagementBaseViewModel$addAlertAction$1 trackerAddressManagementBaseViewModel$addAlertAction$1;
        if (continuation instanceof TrackerAddressManagementBaseViewModel$addAlertAction$1) {
            trackerAddressManagementBaseViewModel$addAlertAction$1 = (TrackerAddressManagementBaseViewModel$addAlertAction$1) continuation;
            int i = trackerAddressManagementBaseViewModel$addAlertAction$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerAddressManagementBaseViewModel$addAlertAction$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerAddressManagementBaseViewModel$addAlertAction$1 = new TrackerAddressManagementBaseViewModel$addAlertAction$1(this, continuation);
            }
        }
        java.lang.Object obj = trackerAddressManagementBaseViewModel$addAlertAction$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackerAddressManagementBaseViewModel$addAlertAction$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        jAD jad = this.AEQbTJ;
        java.util.List<java.lang.String> listEZpvd = C56402yEa.EZpvd(str);
        trackerAddressManagementBaseViewModel$addAlertAction$1.label = 1;
        java.lang.Object objKWHzl = jad.KWHzl(listEZpvd, 1, trackerAddressManagementBaseViewModel$addAlertAction$1);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        TrackerAddressManagementBaseViewModel$isValidJwt$1 trackerAddressManagementBaseViewModel$isValidJwt$1;
        java.lang.Object objOLrzqt;
        AbstractC25769jFr abstractC25769jFr;
        if (continuation instanceof TrackerAddressManagementBaseViewModel$isValidJwt$1) {
            trackerAddressManagementBaseViewModel$isValidJwt$1 = (TrackerAddressManagementBaseViewModel$isValidJwt$1) continuation;
            int i = trackerAddressManagementBaseViewModel$isValidJwt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerAddressManagementBaseViewModel$isValidJwt$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerAddressManagementBaseViewModel$isValidJwt$1 = new TrackerAddressManagementBaseViewModel$isValidJwt$1(this, continuation);
            }
        }
        java.lang.Object obj = trackerAddressManagementBaseViewModel$isValidJwt$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackerAddressManagementBaseViewModel$isValidJwt$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                C28586kda c28586kda = this.OLrzqt;
                trackerAddressManagementBaseViewModel$isValidJwt$1.L$0 = this;
                trackerAddressManagementBaseViewModel$isValidJwt$1.label = 1;
                objOLrzqt = c28586kda.OLrzqt(trackerAddressManagementBaseViewModel$isValidJwt$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                abstractC25769jFr = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return ((Result) obj).m7386unboximpl();
                }
                abstractC25769jFr = (AbstractC25769jFr) trackerAddressManagementBaseViewModel$isValidJwt$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
            }
            if (Result.m7383isFailureimpl(objOLrzqt)) {
                objOLrzqt = null;
            }
            DexUserIdentity dexUserIdentity = (DexUserIdentity) objOLrzqt;
            java.lang.String strEZpvd = dexUserIdentity != null ? dexUserIdentity.EZpvd() : null;
            if (strEZpvd == null) {
                strEZpvd = "";
            }
            C28603kdr c28603kdr = abstractC25769jFr.djBIcL;
            trackerAddressManagementBaseViewModel$isValidJwt$1.L$0 = null;
            trackerAddressManagementBaseViewModel$isValidJwt$1.label = 2;
            java.lang.Object objCopydefault2 = c28603kdr.copydefault(strEZpvd, trackerAddressManagementBaseViewModel$isValidJwt$1);
            return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super Result<DappSignArgs>> continuation) throws java.lang.Throwable {
        TrackerAddressManagementBaseViewModel$generateSignMessage$1 trackerAddressManagementBaseViewModel$generateSignMessage$1;
        java.lang.Object objOLrzqt;
        AbstractC25769jFr abstractC25769jFr;
        java.lang.Object objEZpvd;
        if (continuation instanceof TrackerAddressManagementBaseViewModel$generateSignMessage$1) {
            trackerAddressManagementBaseViewModel$generateSignMessage$1 = (TrackerAddressManagementBaseViewModel$generateSignMessage$1) continuation;
            int i = trackerAddressManagementBaseViewModel$generateSignMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerAddressManagementBaseViewModel$generateSignMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerAddressManagementBaseViewModel$generateSignMessage$1 = new TrackerAddressManagementBaseViewModel$generateSignMessage$1(this, continuation);
            }
        }
        java.lang.Object obj = trackerAddressManagementBaseViewModel$generateSignMessage$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackerAddressManagementBaseViewModel$generateSignMessage$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                C28586kda c28586kda = this.OLrzqt;
                trackerAddressManagementBaseViewModel$generateSignMessage$1.L$0 = this;
                trackerAddressManagementBaseViewModel$generateSignMessage$1.label = 1;
                objOLrzqt = c28586kda.OLrzqt(trackerAddressManagementBaseViewModel$generateSignMessage$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                abstractC25769jFr = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objEZpvd = ((Result) obj).m7386unboximpl();
                    C56391yDq.AEQbTJ(objEZpvd);
                    return Result.m7377constructorimpl((DappSignArgs) objEZpvd);
                }
                abstractC25769jFr = (AbstractC25769jFr) trackerAddressManagementBaseViewModel$generateSignMessage$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
            }
            C56391yDq.AEQbTJ(objOLrzqt);
            DexUserIdentity dexUserIdentity = (DexUserIdentity) objOLrzqt;
            C28603kdr c28603kdr = abstractC25769jFr.djBIcL;
            java.lang.String strEZpvd = dexUserIdentity.EZpvd();
            long jOLrzqt = dexUserIdentity.OLrzqt();
            trackerAddressManagementBaseViewModel$generateSignMessage$1.L$0 = null;
            trackerAddressManagementBaseViewModel$generateSignMessage$1.label = 2;
            objEZpvd = c28603kdr.EZpvd(strEZpvd, jOLrzqt, trackerAddressManagementBaseViewModel$generateSignMessage$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            C56391yDq.AEQbTJ(objEZpvd);
            return Result.m7377constructorimpl((DappSignArgs) objEZpvd);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
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
    public final java.lang.Object copydefault(android.os.Bundle bundle, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        TrackerAddressManagementBaseViewModel$login$1 trackerAddressManagementBaseViewModel$login$1;
        java.lang.Object objOLrzqt;
        AbstractC25769jFr abstractC25769jFr;
        java.lang.Object objKWHzl;
        if (continuation instanceof TrackerAddressManagementBaseViewModel$login$1) {
            trackerAddressManagementBaseViewModel$login$1 = (TrackerAddressManagementBaseViewModel$login$1) continuation;
            int i = trackerAddressManagementBaseViewModel$login$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerAddressManagementBaseViewModel$login$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerAddressManagementBaseViewModel$login$1 = new TrackerAddressManagementBaseViewModel$login$1(this, continuation);
            }
        }
        TrackerAddressManagementBaseViewModel$login$1 trackerAddressManagementBaseViewModel$login$12 = trackerAddressManagementBaseViewModel$login$1;
        java.lang.Object obj = trackerAddressManagementBaseViewModel$login$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackerAddressManagementBaseViewModel$login$12.label;
        java.lang.Object obj2 = null;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                C28586kda c28586kda = this.OLrzqt;
                trackerAddressManagementBaseViewModel$login$12.L$0 = this;
                trackerAddressManagementBaseViewModel$login$12.L$1 = bundle;
                trackerAddressManagementBaseViewModel$login$12.label = 1;
                objOLrzqt = c28586kda.OLrzqt(trackerAddressManagementBaseViewModel$login$12);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                abstractC25769jFr = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objKWHzl = ((Result) obj).m7386unboximpl();
                    if (Result.m7383isFailureimpl(objKWHzl)) {
                        obj2 = objKWHzl;
                    }
                    return Result.m7377constructorimpl(C56443yFo.KWHzl(Intrinsics.EZpvd(obj2, C56443yFo.KWHzl(true))));
                }
                bundle = (android.os.Bundle) trackerAddressManagementBaseViewModel$login$12.L$1;
                abstractC25769jFr = (AbstractC25769jFr) trackerAddressManagementBaseViewModel$login$12.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
            }
            android.os.Bundle bundle2 = bundle;
            C56391yDq.AEQbTJ(objOLrzqt);
            DexUserIdentity dexUserIdentity = (DexUserIdentity) objOLrzqt;
            C28603kdr c28603kdr = abstractC25769jFr.djBIcL;
            java.lang.String strEZpvd = dexUserIdentity.EZpvd();
            long jOLrzqt = dexUserIdentity.OLrzqt();
            trackerAddressManagementBaseViewModel$login$12.L$0 = null;
            trackerAddressManagementBaseViewModel$login$12.L$1 = null;
            trackerAddressManagementBaseViewModel$login$12.label = 2;
            objKWHzl = c28603kdr.KWHzl(strEZpvd, jOLrzqt, bundle2, trackerAddressManagementBaseViewModel$login$12);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            if (Result.m7383isFailureimpl(objKWHzl)) {
            }
            return Result.m7377constructorimpl(C56443yFo.KWHzl(Intrinsics.EZpvd(obj2, C56443yFo.KWHzl(true))));
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.jyr.getEmojiAddressMapping$default(o.jyr, boolean, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super java.util.Map<java.lang.String, java.lang.String>> continuation) {
        return C27634jyr.getEmojiAddressMapping$default(this.KWHzl, false, continuation, 1, null);
    }
}
