package com.okinc.business.defi.dapp.webview;

import androidx.fragment.app.FragmentManager;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.dapp.webview.DappNewWebFragment$selectWallet$1$1;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.components.track.TrackChannel;
import com.okinc.wallet.api.MpcWalletService;
import com.okinc.wallet.api.bean.CurrentWalletSelectMode;
import com.okinc.wallet.api.bean.CurrentWalletSwitchConfig;
import com.okinc.wallet.api.bean.CurrentWalletSwitchNetworkMode;
import com.okinc.wallet.api.bean.DappSupportCheck;
import com.okinc.wallet.api.bean.FunctionConfig;
import java.util.HashMap;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC58185ywX;
import o.C14923duc;
import o.C15112dyF;
import o.C15114dyH;
import o.C15157dyy;
import o.C15196dzk;
import o.C32866mlf;
import o.C33129mqd;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC54855xXv;
import o.InterfaceC9738bbJ;
import o.dBW;
import o.xWX;

/* JADX INFO: loaded from: classes4.dex */
public final class DappNewWebFragment$selectWallet$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<InterfaceC9738bbJ, Long, Unit> $onWalletSelect;
    final /* synthetic */ Long $selectChainId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ dBW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super o.bbJ, ? super java.lang.Long, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DappNewWebFragment$selectWallet$1$1(dBW dbw, Long l, Function2<? super InterfaceC9738bbJ, ? super Long, Unit> function2, Continuation<? super DappNewWebFragment$selectWallet$1$1> continuation) {
        super(2, continuation);
        this.this$0 = dbw;
        this.$selectChainId = l;
        this.$onWalletSelect = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DappNewWebFragment$selectWallet$1$1(this.this$0, this.$selectChainId, this.$onWalletSelect, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DappNewWebFragment$selectWallet$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0164  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        final String mUrl;
        boolean zKWHzl;
        CurrentWalletSelectMode walletSelectedById;
        Object objAEQbTJ;
        dBW dbw;
        List<String> okxConnectRequiredGeneralChainIds;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.copydefault(this.$selectChainId);
            String strDbNXlk = null;
            C32866mlf.onEvent$default("app_metax_discover_browser_chain&wallent_click", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
            if (this.this$0.getFieldNames()) {
                return Unit.INSTANCE;
            }
            this.this$0.AEQbTJ(true);
            DappTabData dappTabDataUzCIH = this.this$0.uzCIH();
            mUrl = dappTabDataUzCIH != null ? dappTabDataUzCIH.getMUrl() : null;
            C15112dyF c15112dyF = C15112dyF.AEQbTJ;
            DappTabData dappTabDataOLrzqt = c15112dyF.OLrzqt();
            if (dappTabDataOLrzqt == null || !dappTabDataOLrzqt.getOkxConnect() || this.this$0.fetchVPNInfo == null) {
                if (this.this$0.fetchVPNInfo == null || this.$selectChainId == null) {
                    zKWHzl = false;
                    break;
                }
                C15196dzk c15196dzk = C15196dzk.KWHzl;
                InterfaceC9738bbJ interfaceC9738bbJ = this.this$0.fetchVPNInfo;
                Intrinsics.copydefault(interfaceC9738bbJ);
                zKWHzl = c15196dzk.KWHzl(interfaceC9738bbJ.DbNXlk(), this.$selectChainId);
                if (this.this$0.fetchVPNInfo != null && zKWHzl) {
                    InterfaceC9738bbJ interfaceC9738bbJ2 = this.this$0.fetchVPNInfo;
                    Intrinsics.copydefault(interfaceC9738bbJ2);
                    strDbNXlk = interfaceC9738bbJ2.DbNXlk();
                }
                xWX xwx = (xWX) C43251rlk.copydefault(xWX.class);
                FragmentManager childFragmentManager = this.this$0.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                if (strDbNXlk == null) {
                    InterfaceC9738bbJ interfaceC9738bbJ3 = this.this$0.fetchVPNInfo;
                    Intrinsics.copydefault(interfaceC9738bbJ3);
                    walletSelectedById = new CurrentWalletSelectMode.WalletSelectedById(interfaceC9738bbJ3.DbNXlk());
                } else {
                    walletSelectedById = CurrentWalletSelectMode.NoWalletSelected.EZpvd;
                }
                CurrentWalletSwitchConfig currentWalletSwitchConfig = new CurrentWalletSwitchConfig(walletSelectedById, CurrentWalletSwitchNetworkMode.Ignored.OLrzqt, WalletSearchRequest.SEARCH_SOURCE_DISCOVER, null, null, 0, null, new FunctionConfig(true, true, false, true, 4, null), 120, null);
                final dBW dbw2 = this.this$0;
                Function2 function2 = new Function2() { // from class: o.dDA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return java.lang.Boolean.valueOf(DappNewWebFragment$selectWallet$1$1.invokeSuspend$lambda$1(mUrl, dbw2, (InterfaceC9738bbJ) obj2, (java.lang.Long) obj3));
                    }
                };
                final dBW dbw3 = this.this$0;
                final Function2<InterfaceC9738bbJ, Long, Unit> function22 = this.$onWalletSelect;
                final Long l = this.$selectChainId;
                xWX.TaskDescription.showCurrentWalletSwitchScreen$default(xwx, childFragmentManager, currentWalletSwitchConfig, function2, null, new InterfaceC54855xXv() { // from class: com.okinc.business.defi.dapp.webview.DappNewWebFragment$selectWallet$1$1.3
                    @Override // o.InterfaceC54855xXv
                    public void AEQbTJ(InterfaceC9738bbJ interfaceC9738bbJ4) {
                        InterfaceC54855xXv.ActionBar.KWHzl(this, interfaceC9738bbJ4);
                    }

                    @Override // o.InterfaceC54855xXv
                    public void KWHzl(InterfaceC9738bbJ interfaceC9738bbJ4, long j) {
                        Intrinsics.checkNotNullParameter(interfaceC9738bbJ4, "");
                        dbw3.AEQbTJ(Long.valueOf(j), interfaceC9738bbJ4, (Function2<? super InterfaceC9738bbJ, ? super Long, Unit>) function22);
                    }

                    @Override // o.InterfaceC54855xXv
                    public void copydefault(InterfaceC9738bbJ interfaceC9738bbJ4) {
                        Intrinsics.checkNotNullParameter(interfaceC9738bbJ4, "");
                        dbw3.AEQbTJ(l, interfaceC9738bbJ4, (Function2<? super InterfaceC9738bbJ, ? super Long, Unit>) function22);
                    }

                    @Override // o.InterfaceC54855xXv
                    public void OLrzqt(long j) {
                        dBW dbw4 = dbw3;
                        dbw4.AEQbTJ(Long.valueOf(j), dbw4.fetchVPNInfo, (Function2<? super InterfaceC9738bbJ, ? super Long, Unit>) function22);
                    }

                    @Override // o.InterfaceC54855xXv
                    public void copydefault() {
                        dbw3.AEQbTJ((Long) null, (InterfaceC9738bbJ) null, (Function2<? super InterfaceC9738bbJ, ? super Long, Unit>) function22);
                    }
                }, 8, null);
                if (C15196dzk.KWHzl.EZpvd(C14923duc.EZpvd.KWHzl(mUrl != null ? "" : mUrl)) == null) {
                    dBW dbw4 = this.this$0;
                    Result.Application application2 = Result.Companion;
                    AbstractC58185ywX<DappSupportCheck> abstractC58185ywXJ_ = ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).j_(mUrl == null ? "" : mUrl);
                    this.L$0 = mUrl;
                    this.L$1 = dbw4;
                    this.label = 1;
                    objAEQbTJ = C15114dyH.AEQbTJ(abstractC58185ywXJ_, this);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    dbw = dbw4;
                }
            } else {
                DappTabData dappTabDataOLrzqt2 = c15112dyF.OLrzqt();
                if (dappTabDataOLrzqt2 != null && (okxConnectRequiredGeneralChainIds = dappTabDataOLrzqt2.getOkxConnectRequiredGeneralChainIds()) != null) {
                    dBW dbw5 = this.this$0;
                    if (!okxConnectRequiredGeneralChainIds.isEmpty()) {
                        for (String str : okxConnectRequiredGeneralChainIds) {
                            C15196dzk c15196dzk2 = C15196dzk.KWHzl;
                            InterfaceC9738bbJ interfaceC9738bbJ4 = dbw5.fetchVPNInfo;
                            Intrinsics.copydefault(interfaceC9738bbJ4);
                            if (!c15196dzk2.KWHzl(interfaceC9738bbJ4.DbNXlk(), C56443yFo.KWHzl(C33129mqd.valueOf(str)))) {
                                zKWHzl = false;
                                break;
                            }
                        }
                    }
                    zKWHzl = true;
                    if (this.this$0.fetchVPNInfo != null) {
                        InterfaceC9738bbJ interfaceC9738bbJ22 = this.this$0.fetchVPNInfo;
                        Intrinsics.copydefault(interfaceC9738bbJ22);
                        strDbNXlk = interfaceC9738bbJ22.DbNXlk();
                    }
                    xWX xwx2 = (xWX) C43251rlk.copydefault(xWX.class);
                    FragmentManager childFragmentManager2 = this.this$0.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                    if (strDbNXlk == null) {
                    }
                    CurrentWalletSwitchConfig currentWalletSwitchConfig2 = new CurrentWalletSwitchConfig(walletSelectedById, CurrentWalletSwitchNetworkMode.Ignored.OLrzqt, WalletSearchRequest.SEARCH_SOURCE_DISCOVER, null, null, 0, null, new FunctionConfig(true, true, false, true, 4, null), 120, null);
                    final dBW dbw22 = this.this$0;
                    Function2 function23 = new Function2() { // from class: o.dDA
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return java.lang.Boolean.valueOf(DappNewWebFragment$selectWallet$1$1.invokeSuspend$lambda$1(mUrl, dbw22, (InterfaceC9738bbJ) obj2, (java.lang.Long) obj3));
                        }
                    };
                    final dBW dbw32 = this.this$0;
                    final Function2<? super InterfaceC9738bbJ, ? super Long, Unit> function222 = this.$onWalletSelect;
                    final Long l2 = this.$selectChainId;
                    xWX.TaskDescription.showCurrentWalletSwitchScreen$default(xwx2, childFragmentManager2, currentWalletSwitchConfig2, function23, null, new InterfaceC54855xXv() { // from class: com.okinc.business.defi.dapp.webview.DappNewWebFragment$selectWallet$1$1.3
                        @Override // o.InterfaceC54855xXv
                        public void AEQbTJ(InterfaceC9738bbJ interfaceC9738bbJ42) {
                            InterfaceC54855xXv.ActionBar.KWHzl(this, interfaceC9738bbJ42);
                        }

                        @Override // o.InterfaceC54855xXv
                        public void KWHzl(InterfaceC9738bbJ interfaceC9738bbJ42, long j) {
                            Intrinsics.checkNotNullParameter(interfaceC9738bbJ42, "");
                            dbw32.AEQbTJ(Long.valueOf(j), interfaceC9738bbJ42, (Function2<? super InterfaceC9738bbJ, ? super Long, Unit>) function222);
                        }

                        @Override // o.InterfaceC54855xXv
                        public void copydefault(InterfaceC9738bbJ interfaceC9738bbJ42) {
                            Intrinsics.checkNotNullParameter(interfaceC9738bbJ42, "");
                            dbw32.AEQbTJ(l2, interfaceC9738bbJ42, (Function2<? super InterfaceC9738bbJ, ? super Long, Unit>) function222);
                        }

                        @Override // o.InterfaceC54855xXv
                        public void OLrzqt(long j) {
                            dBW dbw42 = dbw32;
                            dbw42.AEQbTJ(Long.valueOf(j), dbw42.fetchVPNInfo, (Function2<? super InterfaceC9738bbJ, ? super Long, Unit>) function222);
                        }

                        @Override // o.InterfaceC54855xXv
                        public void copydefault() {
                            dbw32.AEQbTJ((Long) null, (InterfaceC9738bbJ) null, (Function2<? super InterfaceC9738bbJ, ? super Long, Unit>) function222);
                        }
                    }, 8, null);
                    if (C15196dzk.KWHzl.EZpvd(C14923duc.EZpvd.KWHzl(mUrl != null ? "" : mUrl)) == null) {
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dbw = (dBW) this.L$1;
        mUrl = (String) this.L$0;
        C56391yDq.AEQbTJ(obj);
        objAEQbTJ = obj;
        DappSupportCheck dappSupportCheck = (DappSupportCheck) objAEQbTJ;
        HashMap<String, DappSupportCheck> mapOLrzqt = C15157dyy.EZpvd.OLrzqt();
        C14923duc c14923duc = C14923duc.EZpvd;
        if (mUrl == null) {
            mUrl = "";
        }
        mapOLrzqt.put(c14923duc.KWHzl(mUrl), dappSupportCheck);
        xWX xwx3 = (xWX) C43251rlk.copydefault(xWX.class);
        FragmentManager childFragmentManager3 = dbw.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "");
        xwx3.copydefault(childFragmentManager3);
        Result.m7377constructorimpl(Unit.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$1(String str, dBW dbw, InterfaceC9738bbJ interfaceC9738bbJ, Long l) {
        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        if (dappTabDataOLrzqt != null && dappTabDataOLrzqt.getOkxConnect()) {
            return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new DappNewWebFragment$selectWallet$1$1$2$result$1(interfaceC9738bbJ, null), 1, null)).booleanValue();
        }
        C15196dzk c15196dzk = C15196dzk.KWHzl;
        PlatformItem platformItem = dbw.zsXlph;
        return c15196dzk.EZpvd(interfaceC9738bbJ, str, C33129mqd.gEmmrt(platformItem != null ? Long.valueOf(platformItem.getId()) : null), l);
    }
}
