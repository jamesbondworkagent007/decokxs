package com.okinc.business.defi.wallet.home.addressDetail.viewmodel;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.wallet.home.bean.AddressAliasResponse;
import com.okinc.business.defi.wallet.home.bean.NotificationInfo;
import com.okinc.business.defi.wallet.home.bean.UserAdressInfo;
import com.okinc.business.defi.wallet.home.bean.WalletAddressTagListInfo;
import com.okinc.business.defi.wallet.mine.search.data.model.TagWrapper;
import com.okinc.rxutils.RxBus;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC12782ctV;
import o.C10854bwM;
import o.C10954byG;
import o.C12827cuN;
import o.C18913frQ;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.eWX;
import o.xXP;
import o.xXR;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressProfileAssetInfoViewModel extends ViewModel {
    public MutableSharedFlow<NotificationState> AEQbTJ;
    public String AYXKKw;
    public boolean AhwBna;
    public boolean AkhnZx;
    public final SharedFlow<NotificationState> DbNXlk;
    public final MutableSharedFlow<FollowUiState> EZpvd;
    public MutableSharedFlow<AliasUIState> KWHzl;
    public final eWX OLrzqt;
    public MutableSharedFlow<AddressTagUIState> copydefault;
    public final SharedFlow<FollowUiState> djBIcL;
    public final AbstractC12782ctV fIwbmz;
    public final CoroutineDispatcher fetchVPNInfo;
    public final C18913frQ gEmmrt;
    public final SharedFlow<AliasUIState> isConnected;
    public final long valueOf;
    public final SharedFlow<AddressTagUIState> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<NotificationState> AEQbTJ() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AddressTagUIState> EZpvd() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<FollowUiState> KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12782ctV OLrzqt() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AliasUIState> copydefault() {
        return this.isConnected;
    }

    @yCM
    public AddressProfileAssetInfoViewModel(@NotNull eWX ewx, @NotNull C18913frQ c18913frQ, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(ewx, "");
        Intrinsics.checkNotNullParameter(c18913frQ, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = ewx;
        this.gEmmrt = c18913frQ;
        this.fetchVPNInfo = coroutineDispatcher;
        MutableSharedFlow<FollowUiState> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        this.djBIcL = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<AddressTagUIState> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default2;
        this.values = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<AliasUIState> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default3;
        this.isConnected = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<NotificationState> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default4;
        this.DbNXlk = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        C10854bwM c10854bwMIsConnected = C10954byG.EZpvd.valueOf().isConnected();
        this.valueOf = c10854bwMIsConnected != null ? c10854bwMIsConnected.fetchVPNInfo() : 0L;
        this.fIwbmz = (AbstractC12782ctV) CollectionsKt___CollectionsKt.AkhnZx(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(), 0);
        this.AYXKKw = "";
    }

    public final String AhwBna() {
        AbstractC12782ctV abstractC12782ctV;
        AbstractC12782ctV abstractC12782ctV2;
        Set<String> setCopydefault;
        AbstractC12782ctV abstractC12782ctV3 = this.fIwbmz;
        if ((abstractC12782ctV3 != null && abstractC12782ctV3.ORxRYg()) || (((abstractC12782ctV = this.fIwbmz) != null && abstractC12782ctV.gHZMYf()) || ((abstractC12782ctV2 = this.fIwbmz) != null && abstractC12782ctV2.AubY()))) {
            String strEZpvd = this.fIwbmz.EZpvd(C33129mqd.valueOf(Long.valueOf(this.valueOf)));
            if (strEZpvd != null && strEZpvd.length() != 0) {
                return strEZpvd;
            }
        } else {
            AbstractC12782ctV abstractC12782ctV4 = this.fIwbmz;
            String strGEmmrt = C33129mqd.gEmmrt((abstractC12782ctV4 == null || (setCopydefault = abstractC12782ctV4.copydefault()) == null) ? null : (String) CollectionsKt___CollectionsKt.RcXXUw(setCopydefault));
            if (strGEmmrt != null && strGEmmrt.length() != 0) {
                return strGEmmrt;
            }
        }
        return "";
    }

    public final void OLrzqt(@NotNull String str, @NotNull List<Long> list, @NotNull Set<Long> set) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(set, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.fetchVPNInfo, null, new AddressProfileAssetInfoViewModel$getUserInformation$1(this, str, list, set, null), 2, null);
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.fetchVPNInfo, null, new AddressProfileAssetInfoViewModel$loadAddressProfileInfo$1(this, str, null), 2, null);
    }

    public final void OLrzqt(@NotNull Context context, @NotNull FragmentManager fragmentManager, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.fetchVPNInfo, null, new AddressProfileAssetInfoViewModel$callAddOrCancelAddress$1(this, context, fragmentManager, str, z, null), 2, null);
    }

    public final void OLrzqt(@NotNull Context context, @NotNull FragmentManager fragmentManager, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.fetchVPNInfo, null, new AddressProfileAssetInfoViewModel$callUpdateAddressAlias$1(this, str, context, fragmentManager, null), 2, null);
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.fetchVPNInfo, null, new AddressProfileAssetInfoViewModel$loadNotificationStatus$1(this, str, null), 2, null);
    }

    public final void OLrzqt(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.fetchVPNInfo, null, new AddressProfileAssetInfoViewModel$updateNotificationStatus$1(this, str, i, null), 2, null);
    }

    public final Object EZpvd(Context context, FragmentManager fragmentManager, String str, boolean z, Continuation<? super Boolean> continuation) {
        return this.OLrzqt.OLrzqt(context, fragmentManager, str, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(Continuation<? super List<String>> continuation) throws Throwable {
        AddressProfileAssetInfoViewModel$getAddressCollect$1 addressProfileAssetInfoViewModel$getAddressCollect$1;
        Object objEZpvd;
        if (continuation instanceof AddressProfileAssetInfoViewModel$getAddressCollect$1) {
            addressProfileAssetInfoViewModel$getAddressCollect$1 = (AddressProfileAssetInfoViewModel$getAddressCollect$1) continuation;
            int i = addressProfileAssetInfoViewModel$getAddressCollect$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                addressProfileAssetInfoViewModel$getAddressCollect$1.label = i - Integer.MIN_VALUE;
            } else {
                addressProfileAssetInfoViewModel$getAddressCollect$1 = new AddressProfileAssetInfoViewModel$getAddressCollect$1(this, continuation);
            }
        }
        Object obj = addressProfileAssetInfoViewModel$getAddressCollect$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = addressProfileAssetInfoViewModel$getAddressCollect$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            String strAhwBna = AhwBna();
            if (strAhwBna == null || strAhwBna.length() == 0) {
                strAhwBna = "";
            }
            eWX ewx = this.OLrzqt;
            addressProfileAssetInfoViewModel$getAddressCollect$1.label = 1;
            objEZpvd = ewx.EZpvd(strAhwBna, addressProfileAssetInfoViewModel$getAddressCollect$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objEZpvd)) {
            objEZpvd = null;
        }
        List list = (List) objEZpvd;
        return list == null ? yDY.AhwBna() : list;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(Continuation<? super List<AddressAliasResponse>> continuation) throws Throwable {
        AddressProfileAssetInfoViewModel$getAddressAlias$1 addressProfileAssetInfoViewModel$getAddressAlias$1;
        Object objAEQbTJ;
        if (continuation instanceof AddressProfileAssetInfoViewModel$getAddressAlias$1) {
            addressProfileAssetInfoViewModel$getAddressAlias$1 = (AddressProfileAssetInfoViewModel$getAddressAlias$1) continuation;
            int i = addressProfileAssetInfoViewModel$getAddressAlias$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                addressProfileAssetInfoViewModel$getAddressAlias$1.label = i - Integer.MIN_VALUE;
            } else {
                addressProfileAssetInfoViewModel$getAddressAlias$1 = new AddressProfileAssetInfoViewModel$getAddressAlias$1(this, continuation);
            }
        }
        Object obj = addressProfileAssetInfoViewModel$getAddressAlias$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = addressProfileAssetInfoViewModel$getAddressAlias$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            String strAhwBna = AhwBna();
            if (strAhwBna == null || strAhwBna.length() == 0) {
                strAhwBna = "";
            }
            eWX ewx = this.OLrzqt;
            addressProfileAssetInfoViewModel$getAddressAlias$1.label = 1;
            objAEQbTJ = ewx.AEQbTJ(strAhwBna, addressProfileAssetInfoViewModel$getAddressAlias$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objAEQbTJ)) {
            objAEQbTJ = null;
        }
        List list = (List) objAEQbTJ;
        return list == null ? yDY.AhwBna() : list;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(String str, List<Long> list, Continuation<? super UserAdressInfo> continuation) throws Throwable {
        AddressProfileAssetInfoViewModel$getUserInfo$1 addressProfileAssetInfoViewModel$getUserInfo$1;
        Object objCopydefault;
        if (continuation instanceof AddressProfileAssetInfoViewModel$getUserInfo$1) {
            addressProfileAssetInfoViewModel$getUserInfo$1 = (AddressProfileAssetInfoViewModel$getUserInfo$1) continuation;
            int i = addressProfileAssetInfoViewModel$getUserInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                addressProfileAssetInfoViewModel$getUserInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                addressProfileAssetInfoViewModel$getUserInfo$1 = new AddressProfileAssetInfoViewModel$getUserInfo$1(this, continuation);
            }
        }
        Object obj = addressProfileAssetInfoViewModel$getUserInfo$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = addressProfileAssetInfoViewModel$getUserInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            String strAhwBna = AhwBna();
            if (strAhwBna == null || strAhwBna.length() == 0) {
                strAhwBna = "";
            }
            eWX ewx = this.OLrzqt;
            addressProfileAssetInfoViewModel$getUserInfo$1.label = 1;
            objCopydefault = ewx.copydefault(strAhwBna, str, list, addressProfileAssetInfoViewModel$getUserInfo$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objCopydefault)) {
            return null;
        }
        return objCopydefault;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(String str, Long l, Continuation<? super WalletAddressTagListInfo> continuation) throws Throwable {
        AddressProfileAssetInfoViewModel$getAddressInfo$1 addressProfileAssetInfoViewModel$getAddressInfo$1;
        Object objKWHzl;
        if (continuation instanceof AddressProfileAssetInfoViewModel$getAddressInfo$1) {
            addressProfileAssetInfoViewModel$getAddressInfo$1 = (AddressProfileAssetInfoViewModel$getAddressInfo$1) continuation;
            int i = addressProfileAssetInfoViewModel$getAddressInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                addressProfileAssetInfoViewModel$getAddressInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                addressProfileAssetInfoViewModel$getAddressInfo$1 = new AddressProfileAssetInfoViewModel$getAddressInfo$1(this, continuation);
            }
        }
        Object obj = addressProfileAssetInfoViewModel$getAddressInfo$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = addressProfileAssetInfoViewModel$getAddressInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            String strAhwBna = AhwBna();
            if (strAhwBna == null || strAhwBna.length() == 0) {
                strAhwBna = "";
            }
            eWX ewx = this.OLrzqt;
            String strGEmmrt = C33129mqd.gEmmrt(C56443yFo.KWHzl(l != null ? l.longValue() : Long.MIN_VALUE));
            addressProfileAssetInfoViewModel$getAddressInfo$1.label = 1;
            objKWHzl = ewx.KWHzl(strAhwBna, str, strGEmmrt, addressProfileAssetInfoViewModel$getAddressInfo$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objKWHzl)) {
            return null;
        }
        return objKWHzl;
    }

    public final Object KWHzl(Context context, FragmentManager fragmentManager, String str, String str2, Continuation<? super String> continuation) {
        return this.OLrzqt.copydefault(context, fragmentManager, str, str2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(String str, String str2, Continuation<? super NotificationInfo> continuation) throws Throwable {
        AddressProfileAssetInfoViewModel$getNotificationStatus$1 addressProfileAssetInfoViewModel$getNotificationStatus$1;
        Object objAEQbTJ;
        if (continuation instanceof AddressProfileAssetInfoViewModel$getNotificationStatus$1) {
            addressProfileAssetInfoViewModel$getNotificationStatus$1 = (AddressProfileAssetInfoViewModel$getNotificationStatus$1) continuation;
            int i = addressProfileAssetInfoViewModel$getNotificationStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                addressProfileAssetInfoViewModel$getNotificationStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                addressProfileAssetInfoViewModel$getNotificationStatus$1 = new AddressProfileAssetInfoViewModel$getNotificationStatus$1(this, continuation);
            }
        }
        Object obj = addressProfileAssetInfoViewModel$getNotificationStatus$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = addressProfileAssetInfoViewModel$getNotificationStatus$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            eWX ewx = this.OLrzqt;
            addressProfileAssetInfoViewModel$getNotificationStatus$1.label = 1;
            objAEQbTJ = ewx.AEQbTJ(str, str2, addressProfileAssetInfoViewModel$getNotificationStatus$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objAEQbTJ)) {
            return null;
        }
        return objAEQbTJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(String str, String str2, int i, Continuation<? super Integer> continuation) throws Throwable {
        AddressProfileAssetInfoViewModel$updateNotificationStatus$2 addressProfileAssetInfoViewModel$updateNotificationStatus$2;
        Object objEZpvd;
        if (continuation instanceof AddressProfileAssetInfoViewModel$updateNotificationStatus$2) {
            addressProfileAssetInfoViewModel$updateNotificationStatus$2 = (AddressProfileAssetInfoViewModel$updateNotificationStatus$2) continuation;
            int i2 = addressProfileAssetInfoViewModel$updateNotificationStatus$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressProfileAssetInfoViewModel$updateNotificationStatus$2.label = i2 - Integer.MIN_VALUE;
            } else {
                addressProfileAssetInfoViewModel$updateNotificationStatus$2 = new AddressProfileAssetInfoViewModel$updateNotificationStatus$2(this, continuation);
            }
        }
        Object obj = addressProfileAssetInfoViewModel$updateNotificationStatus$2.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = addressProfileAssetInfoViewModel$updateNotificationStatus$2.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            eWX ewx = this.OLrzqt;
            addressProfileAssetInfoViewModel$updateNotificationStatus$2.label = 1;
            objEZpvd = ewx.EZpvd(str, str2, i, addressProfileAssetInfoViewModel$updateNotificationStatus$2);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objEZpvd)) {
            return null;
        }
        return objEZpvd;
    }

    public final void copydefault(String str) {
        RxBus.AEQbTJ(new xXR(new xXP(AhwBna(), str, this.AkhnZx, this.AhwBna, this.AYXKKw)));
    }

    public static abstract class AliasUIState {
        public static final int $stable = 0;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.addressDetail.viewmodel.AddressProfileAssetInfoViewModel.AliasUIState.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ AliasUIState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AliasUIState() {
        }

        public static final class Application extends AliasUIState {
            public final String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = application.OLrzqt;
                }
                return application.copydefault(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application copydefault(String str) {
                return new Application(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) ((Application) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                String str = this.OLrzqt;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "AliasSet(name=" + this.OLrzqt + ")";
            }

            public Application(String str) {
                super(null);
                this.OLrzqt = str;
            }
        }

        public static final class StateListAnimator extends AliasUIState {
            public final String AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.AEQbTJ;
                }
                return stateListAnimator.copydefault(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String KWHzl() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator copydefault(String str) {
                return new StateListAnimator(str);
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
                String str = this.AEQbTJ;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "AliasChangeSuccess(name=" + this.AEQbTJ + ")";
            }

            public StateListAnimator(String str) {
                super(null);
                this.AEQbTJ = str;
            }
        }

        public static final class TaskDescription extends AliasUIState {
            public final Integer KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, Integer num, int i, Object obj) {
                if ((i & 1) != 0) {
                    num = taskDescription.KWHzl;
                }
                return taskDescription.KWHzl(num);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Integer AEQbTJ() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription KWHzl(Integer num) {
                return new TaskDescription(num);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.KWHzl, ((TaskDescription) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                Integer num = this.KWHzl;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Error(code=" + this.KWHzl + ")";
            }

            public TaskDescription(Integer num) {
                super(null);
                this.KWHzl = num;
            }
        }
    }

    public static abstract class AddressTagUIState {
        public static final int $stable = 0;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.addressDetail.viewmodel.AddressProfileAssetInfoViewModel.AddressTagUIState.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ AddressTagUIState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AddressTagUIState() {
        }

        public static final class StateListAnimator extends AddressTagUIState {
            public final String AEQbTJ;
            public final List<TagWrapper> EZpvd;
            public final String KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.home.addressDetail.viewmodel.AddressProfileAssetInfoViewModel$AddressTagUIState$StateListAnimator */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, String str2, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.AEQbTJ;
                }
                if ((i & 2) != 0) {
                    str2 = stateListAnimator.KWHzl;
                }
                if ((i & 4) != 0) {
                    list = stateListAnimator.EZpvd;
                }
                return stateListAnimator.copydefault(str, str2, list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<TagWrapper> OLrzqt() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator copydefault(String str, String str2, List<TagWrapper> list) {
                return new StateListAnimator(str, str2, list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StateListAnimator)) {
                    return false;
                }
                StateListAnimator stateListAnimator = (StateListAnimator) obj;
                return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) stateListAnimator.AEQbTJ) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) stateListAnimator.KWHzl) && Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                String str = this.AEQbTJ;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.KWHzl;
                int iHashCode2 = str2 == null ? 0 : str2.hashCode();
                List<TagWrapper> list = this.EZpvd;
                return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "AddressTagUIStateSuccess(twitterAvatar=" + this.AEQbTJ + ", twitterName=" + this.KWHzl + ", tagList=" + this.EZpvd + ")";
            }

            public StateListAnimator(String str, String str2, List<TagWrapper> list) {
                super(null);
                this.AEQbTJ = str;
                this.KWHzl = str2;
                this.EZpvd = list;
            }
        }
    }

    public static abstract class FollowUiState {
        public static final int $stable = 0;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.addressDetail.viewmodel.AddressProfileAssetInfoViewModel.FollowUiState.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ FollowUiState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private FollowUiState() {
        }

        public static final class ActionBar extends FollowUiState {
            public final boolean EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = actionBar.EZpvd;
                }
                return actionBar.EZpvd(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar EZpvd(boolean z) {
                return new ActionBar(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionBar) && this.EZpvd == ((ActionBar) obj).EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return Boolean.hashCode(this.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "AddressProfileFollowChange(following=" + this.EZpvd + ")";
            }

            public ActionBar(boolean z) {
                super(null);
                this.EZpvd = z;
            }
        }

        public static final class StateListAnimator extends FollowUiState {
            public final Integer KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, Integer num, int i, Object obj) {
                if ((i & 1) != 0) {
                    num = stateListAnimator.KWHzl;
                }
                return stateListAnimator.KWHzl(num);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator KWHzl(Integer num) {
                return new StateListAnimator(num);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Integer KWHzl() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.KWHzl, ((StateListAnimator) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                Integer num = this.KWHzl;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Error(code=" + this.KWHzl + ")";
            }

            public StateListAnimator(Integer num) {
                super(null);
                this.KWHzl = num;
            }
        }
    }

    public static abstract class NotificationState {
        public static final int $stable = 0;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.addressDetail.viewmodel.AddressProfileAssetInfoViewModel.NotificationState.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ NotificationState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private NotificationState() {
        }

        public static final class TaskDescription extends NotificationState {
            public final boolean KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = taskDescription.KWHzl;
                }
                return taskDescription.copydefault(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean KWHzl() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription copydefault(boolean z) {
                return new TaskDescription(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && this.KWHzl == ((TaskDescription) obj).KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return Boolean.hashCode(this.KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "NotificationStateChange(following=" + this.KWHzl + ")";
            }

            public TaskDescription(boolean z) {
                super(null);
                this.KWHzl = z;
            }
        }

        public static final class Activity extends NotificationState {
            public final Integer EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, Integer num, int i, Object obj) {
                if ((i & 1) != 0) {
                    num = activity.EZpvd;
                }
                return activity.AEQbTJ(num);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity AEQbTJ(Integer num) {
                return new Activity(num);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Integer OLrzqt() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd(this.EZpvd, ((Activity) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                Integer num = this.EZpvd;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Error(code=" + this.EZpvd + ")";
            }

            public Activity(Integer num) {
                super(null);
                this.EZpvd = num;
            }
        }
    }
}
