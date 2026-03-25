package com.okinc.business.market.features.address_tracker_sa.ui.recommendation;

import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.market.features.address_tracker_sa.ui.model.LeaderBoardCardUIModel;
import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25389ivm;
import o.C25642jAz;
import o.C25714jDq;
import o.C25718jDu;
import o.C25983jNp;
import o.C27634jyr;
import o.C28586kda;
import o.C28603kdr;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.jAB;
import o.jBD;
import o.pUU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class AddressTrackerRecommendationViewModel extends ViewModel {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final C27634jyr AEQbTJ;
    public final C28586kda AYXKKw;
    public final C25714jDq AhwBna;
    public final C25983jNp KWHzl;
    public final MutableStateFlow<C25718jDu> OLrzqt;
    public final jAB copydefault;
    public final jBD djBIcL;
    public final C28603kdr gEmmrt;
    public final StateFlow<C25718jDu> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C25718jDu> OLrzqt() {
        return this.valueOf;
    }

    @yCM
    public AddressTrackerRecommendationViewModel(@NotNull C28586kda c28586kda, @NotNull C28603kdr c28603kdr, @NotNull jBD jbd, @NotNull C25983jNp c25983jNp, @NotNull jAB jab, @NotNull C25714jDq c25714jDq, @NotNull C27634jyr c27634jyr) {
        Intrinsics.checkNotNullParameter(c28586kda, "");
        Intrinsics.checkNotNullParameter(c28603kdr, "");
        Intrinsics.checkNotNullParameter(jbd, "");
        Intrinsics.checkNotNullParameter(c25983jNp, "");
        Intrinsics.checkNotNullParameter(jab, "");
        Intrinsics.checkNotNullParameter(c25714jDq, "");
        Intrinsics.checkNotNullParameter(c27634jyr, "");
        this.AYXKKw = c28586kda;
        this.gEmmrt = c28603kdr;
        this.djBIcL = jbd;
        this.KWHzl = c25983jNp;
        this.copydefault = jab;
        this.AhwBna = c25714jDq;
        this.AEQbTJ = c27634jyr;
        MutableStateFlow<C25718jDu> MutableStateFlow = StateFlowKt.MutableStateFlow(new C25718jDu(0, null, true, false, false, 27, null));
        this.OLrzqt = MutableStateFlow;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
    }

    public static /* synthetic */ void loadLeaderBoardData$default(AddressTrackerRecommendationViewModel addressTrackerRecommendationViewModel, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        addressTrackerRecommendationViewModel.KWHzl(i);
    }

    public final void KWHzl(int i) {
        C25718jDu value;
        ArrayList arrayList = new ArrayList();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        MutableStateFlow<C25718jDu> mutableStateFlow = this.OLrzqt;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, this.AhwBna.EZpvd(value)));
        arrayList.add(C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AddressTrackerRecommendationViewModel$loadLeaderBoardData$2(this, objectRef, null), 3, null));
        arrayList.add(C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AddressTrackerRecommendationViewModel$loadLeaderBoardData$3(objectRef2, this, i, null), 3, null));
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AddressTrackerRecommendationViewModel$loadLeaderBoardData$4(arrayList, this, objectRef2, objectRef, i, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(@NotNull Continuation<? super Result<Boolean>> continuation) throws Throwable {
        AddressTrackerRecommendationViewModel$isValidJwt$1 addressTrackerRecommendationViewModel$isValidJwt$1;
        Object objOLrzqt;
        AddressTrackerRecommendationViewModel addressTrackerRecommendationViewModel;
        if (continuation instanceof AddressTrackerRecommendationViewModel$isValidJwt$1) {
            addressTrackerRecommendationViewModel$isValidJwt$1 = (AddressTrackerRecommendationViewModel$isValidJwt$1) continuation;
            int i = addressTrackerRecommendationViewModel$isValidJwt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                addressTrackerRecommendationViewModel$isValidJwt$1.label = i - Integer.MIN_VALUE;
            } else {
                addressTrackerRecommendationViewModel$isValidJwt$1 = new AddressTrackerRecommendationViewModel$isValidJwt$1(this, continuation);
            }
        }
        Object obj = addressTrackerRecommendationViewModel$isValidJwt$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = addressTrackerRecommendationViewModel$isValidJwt$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                C28586kda c28586kda = this.AYXKKw;
                addressTrackerRecommendationViewModel$isValidJwt$1.L$0 = this;
                addressTrackerRecommendationViewModel$isValidJwt$1.label = 1;
                objOLrzqt = c28586kda.OLrzqt(addressTrackerRecommendationViewModel$isValidJwt$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                addressTrackerRecommendationViewModel = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return ((Result) obj).m7386unboximpl();
                }
                addressTrackerRecommendationViewModel = (AddressTrackerRecommendationViewModel) addressTrackerRecommendationViewModel$isValidJwt$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
            }
            if (Result.m7383isFailureimpl(objOLrzqt)) {
                objOLrzqt = null;
            }
            DexUserIdentity dexUserIdentity = (DexUserIdentity) objOLrzqt;
            String strEZpvd = dexUserIdentity != null ? dexUserIdentity.EZpvd() : null;
            if (strEZpvd == null) {
                strEZpvd = "";
            }
            C28603kdr c28603kdr = addressTrackerRecommendationViewModel.gEmmrt;
            addressTrackerRecommendationViewModel$isValidJwt$1.L$0 = null;
            addressTrackerRecommendationViewModel$isValidJwt$1.label = 2;
            Object objCopydefault2 = c28603kdr.copydefault(strEZpvd, addressTrackerRecommendationViewModel$isValidJwt$1);
            return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(@NotNull Continuation<? super Result<DappSignArgs>> continuation) throws Throwable {
        AddressTrackerRecommendationViewModel$generateSignMessage$1 addressTrackerRecommendationViewModel$generateSignMessage$1;
        Object objOLrzqt;
        AddressTrackerRecommendationViewModel addressTrackerRecommendationViewModel;
        Object objEZpvd;
        if (continuation instanceof AddressTrackerRecommendationViewModel$generateSignMessage$1) {
            addressTrackerRecommendationViewModel$generateSignMessage$1 = (AddressTrackerRecommendationViewModel$generateSignMessage$1) continuation;
            int i = addressTrackerRecommendationViewModel$generateSignMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                addressTrackerRecommendationViewModel$generateSignMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                addressTrackerRecommendationViewModel$generateSignMessage$1 = new AddressTrackerRecommendationViewModel$generateSignMessage$1(this, continuation);
            }
        }
        Object obj = addressTrackerRecommendationViewModel$generateSignMessage$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = addressTrackerRecommendationViewModel$generateSignMessage$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                C28586kda c28586kda = this.AYXKKw;
                addressTrackerRecommendationViewModel$generateSignMessage$1.L$0 = this;
                addressTrackerRecommendationViewModel$generateSignMessage$1.label = 1;
                objOLrzqt = c28586kda.OLrzqt(addressTrackerRecommendationViewModel$generateSignMessage$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                addressTrackerRecommendationViewModel = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objEZpvd = ((Result) obj).m7386unboximpl();
                    C56391yDq.AEQbTJ(objEZpvd);
                    return Result.m7377constructorimpl((DappSignArgs) objEZpvd);
                }
                addressTrackerRecommendationViewModel = (AddressTrackerRecommendationViewModel) addressTrackerRecommendationViewModel$generateSignMessage$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
            }
            C56391yDq.AEQbTJ(objOLrzqt);
            DexUserIdentity dexUserIdentity = (DexUserIdentity) objOLrzqt;
            C28603kdr c28603kdr = addressTrackerRecommendationViewModel.gEmmrt;
            String strEZpvd = dexUserIdentity.EZpvd();
            long jOLrzqt = dexUserIdentity.OLrzqt();
            addressTrackerRecommendationViewModel$generateSignMessage$1.L$0 = null;
            addressTrackerRecommendationViewModel$generateSignMessage$1.label = 2;
            objEZpvd = c28603kdr.EZpvd(strEZpvd, jOLrzqt, addressTrackerRecommendationViewModel$generateSignMessage$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            C56391yDq.AEQbTJ(objEZpvd);
            return Result.m7377constructorimpl((DappSignArgs) objEZpvd);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
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
    public final Object KWHzl(Bundle bundle, @NotNull Continuation<? super Result<Boolean>> continuation) throws Throwable {
        AddressTrackerRecommendationViewModel$login$1 addressTrackerRecommendationViewModel$login$1;
        Object objOLrzqt;
        AddressTrackerRecommendationViewModel addressTrackerRecommendationViewModel;
        Object objKWHzl;
        if (continuation instanceof AddressTrackerRecommendationViewModel$login$1) {
            addressTrackerRecommendationViewModel$login$1 = (AddressTrackerRecommendationViewModel$login$1) continuation;
            int i = addressTrackerRecommendationViewModel$login$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                addressTrackerRecommendationViewModel$login$1.label = i - Integer.MIN_VALUE;
            } else {
                addressTrackerRecommendationViewModel$login$1 = new AddressTrackerRecommendationViewModel$login$1(this, continuation);
            }
        }
        AddressTrackerRecommendationViewModel$login$1 addressTrackerRecommendationViewModel$login$12 = addressTrackerRecommendationViewModel$login$1;
        Object obj = addressTrackerRecommendationViewModel$login$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = addressTrackerRecommendationViewModel$login$12.label;
        Object obj2 = null;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                C28586kda c28586kda = this.AYXKKw;
                addressTrackerRecommendationViewModel$login$12.L$0 = this;
                addressTrackerRecommendationViewModel$login$12.L$1 = bundle;
                addressTrackerRecommendationViewModel$login$12.label = 1;
                objOLrzqt = c28586kda.OLrzqt(addressTrackerRecommendationViewModel$login$12);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                addressTrackerRecommendationViewModel = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objKWHzl = ((Result) obj).m7386unboximpl();
                    if (Result.m7383isFailureimpl(objKWHzl)) {
                        obj2 = objKWHzl;
                    }
                    return Result.m7377constructorimpl(C56443yFo.KWHzl(Intrinsics.EZpvd(obj2, C56443yFo.KWHzl(true))));
                }
                bundle = (Bundle) addressTrackerRecommendationViewModel$login$12.L$1;
                addressTrackerRecommendationViewModel = (AddressTrackerRecommendationViewModel) addressTrackerRecommendationViewModel$login$12.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
            }
            Bundle bundle2 = bundle;
            C56391yDq.AEQbTJ(objOLrzqt);
            DexUserIdentity dexUserIdentity = (DexUserIdentity) objOLrzqt;
            C28603kdr c28603kdr = addressTrackerRecommendationViewModel.gEmmrt;
            String strEZpvd = dexUserIdentity.EZpvd();
            long jOLrzqt = dexUserIdentity.OLrzqt();
            addressTrackerRecommendationViewModel$login$12.L$0 = null;
            addressTrackerRecommendationViewModel$login$12.L$1 = null;
            addressTrackerRecommendationViewModel$login$12.label = 2;
            objKWHzl = c28603kdr.KWHzl(strEZpvd, jOLrzqt, bundle2, addressTrackerRecommendationViewModel$login$12);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            if (Result.m7383isFailureimpl(objKWHzl)) {
            }
            return Result.m7377constructorimpl(C56443yFo.KWHzl(Intrinsics.EZpvd(obj2, C56443yFo.KWHzl(true))));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final void copydefault(@NotNull LeaderBoardCardUIModel leaderBoardCardUIModel) {
        Intrinsics.checkNotNullParameter(leaderBoardCardUIModel, "");
        List<LeaderBoardCardUIModel> listOLrzqt = this.OLrzqt.getValue().OLrzqt();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        for (LeaderBoardCardUIModel leaderBoardCardUIModelCopy : listOLrzqt) {
            if (Intrinsics.EZpvd(leaderBoardCardUIModelCopy, leaderBoardCardUIModel)) {
                leaderBoardCardUIModelCopy = leaderBoardCardUIModelCopy.copy((8388351 & 1) != 0 ? leaderBoardCardUIModelCopy.id : null, (8388351 & 2) != 0 ? leaderBoardCardUIModelCopy.walletAddress : null, (8388351 & 4) != 0 ? leaderBoardCardUIModelCopy.walletLogoUrl : null, (8388351 & 8) != 0 ? leaderBoardCardUIModelCopy.kolTwitterLink : null, (8388351 & 16) != 0 ? leaderBoardCardUIModelCopy.addressAlias : null, (8388351 & 32) != 0 ? leaderBoardCardUIModelCopy.accountName : null, (8388351 & 64) != 0 ? leaderBoardCardUIModelCopy.isBookmarked : false, (8388351 & 128) != 0 ? leaderBoardCardUIModelCopy.type : null, (8388351 & 256) != 0 ? leaderBoardCardUIModelCopy.isSelected : !leaderBoardCardUIModelCopy.isSelected(), (8388351 & 512) != 0 ? leaderBoardCardUIModelCopy.chartItems : null, (8388351 & 1024) != 0 ? leaderBoardCardUIModelCopy.chainId : null, (8388351 & 2048) != 0 ? leaderBoardCardUIModelCopy.chainLogoUrl : null, (8388351 & 4096) != 0 ? leaderBoardCardUIModelCopy.tokenPrice : null, (8388351 & 8192) != 0 ? leaderBoardCardUIModelCopy.tokenBalance : null, (8388351 & 16384) != 0 ? leaderBoardCardUIModelCopy.pnlAmount : null, (8388351 & 32768) != 0 ? leaderBoardCardUIModelCopy.roiPercentage : null, (8388351 & 65536) != 0 ? leaderBoardCardUIModelCopy.winRatePercentage : null, (8388351 & 131072) != 0 ? leaderBoardCardUIModelCopy.winLossToken : null, (8388351 & 262144) != 0 ? leaderBoardCardUIModelCopy.transactions : 0, (8388351 & 524288) != 0 ? leaderBoardCardUIModelCopy.lastTime : null, (8388351 & 1048576) != 0 ? leaderBoardCardUIModelCopy.periodType : null, (8388351 & 2097152) != 0 ? leaderBoardCardUIModelCopy.emoji : null, (8388351 & 4194304) != 0 ? leaderBoardCardUIModelCopy.addressDisplayColorHex : null);
            }
            arrayList.add(leaderBoardCardUIModelCopy);
        }
        MutableStateFlow<C25718jDu> mutableStateFlow = this.OLrzqt;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), this.AhwBna.EZpvd(this.OLrzqt.getValue().EZpvd(), arrayList))) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(int i, @NotNull Continuation<? super Result<Boolean>> continuation) throws Throwable {
        AddressTrackerRecommendationViewModel$followRecommendedAddressList$1 addressTrackerRecommendationViewModel$followRecommendedAddressList$1;
        Object objEZpvd;
        if (continuation instanceof AddressTrackerRecommendationViewModel$followRecommendedAddressList$1) {
            addressTrackerRecommendationViewModel$followRecommendedAddressList$1 = (AddressTrackerRecommendationViewModel$followRecommendedAddressList$1) continuation;
            int i2 = addressTrackerRecommendationViewModel$followRecommendedAddressList$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressTrackerRecommendationViewModel$followRecommendedAddressList$1.label = i2 - Integer.MIN_VALUE;
            } else {
                addressTrackerRecommendationViewModel$followRecommendedAddressList$1 = new AddressTrackerRecommendationViewModel$followRecommendedAddressList$1(this, continuation);
            }
        }
        Object obj = addressTrackerRecommendationViewModel$followRecommendedAddressList$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = addressTrackerRecommendationViewModel$followRecommendedAddressList$1.label;
        boolean z = false;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) this.OLrzqt.getValue().OLrzqt());
                ArrayList<LeaderBoardCardUIModel> arrayList = new ArrayList();
                for (Object obj2 : listFJNWhG) {
                    if (((LeaderBoardCardUIModel) obj2).isSelected()) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                for (LeaderBoardCardUIModel leaderBoardCardUIModel : arrayList) {
                    arrayList2.add(new C25642jAz(leaderBoardCardUIModel.getWalletAddress(), leaderBoardCardUIModel.getAccountName()));
                }
                if (!arrayList2.isEmpty()) {
                    jAB jab = this.copydefault;
                    addressTrackerRecommendationViewModel$followRecommendedAddressList$1.label = 1;
                    objEZpvd = jab.EZpvd(i, arrayList2, addressTrackerRecommendationViewModel$followRecommendedAddressList$1);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    return Result.m7377constructorimpl(C56443yFo.KWHzl(z));
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objEZpvd = ((Result) obj).m7386unboximpl();
            }
            if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
                objEZpvd = C56443yFo.AEQbTJ(0);
            }
            if (((Number) objEZpvd).intValue() > 0) {
                z = true;
            }
            return Result.m7377constructorimpl(C56443yFo.KWHzl(z));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.address_tracker_sa.ui.recommendation.AddressTrackerRecommendationViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
